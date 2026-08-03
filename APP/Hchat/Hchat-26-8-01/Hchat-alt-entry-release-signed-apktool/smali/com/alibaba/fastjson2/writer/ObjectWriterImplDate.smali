.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

.field static final PREFIX_BYTES:[B

.field static final PREFIX_BYTES_SQL:[B

.field static final PREFIX_CHARS:[C

.field static final PREFIX_CHARS_SQL:[C


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 8
    .line 9
    const-string v0, "new Date("

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_CHARS:[C

    .line 16
    .line 17
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_BYTES:[B

    .line 24
    .line 25
    const-string v0, "{\"@type\":\"java.sql.Date\",\"val\":"

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sput-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_CHARS_SQL:[C

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_BYTES_SQL:[B

    .line 38
    .line 39
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
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 14
    .line 15
    move-object v4, v2

    .line 16
    check-cast v4, Ljava/util/Date;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    move-object/from16 v7, p4

    .line 23
    .line 24
    invoke-virtual {v1, v2, v7}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v7, 0x0

    .line 29
    const-string v8, "java.sql.Date"

    .line 30
    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/JSONWriter;->utf16:Z

    .line 34
    .line 35
    const/16 v3, 0x7d

    .line 36
    .line 37
    const/16 v9, 0x29

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    sget-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_CHARS_SQL:[C

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_CHARS:[C

    .line 59
    .line 60
    move v3, v9

    .line 61
    :goto_0
    array-length v4, v2

    .line 62
    invoke-virtual {v1, v2, v7, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw([CII)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    sget-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_BYTES_SQL:[B

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    sget-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->PREFIX_BYTES:[B

    .line 84
    .line 85
    move v3, v9

    .line 86
    :goto_1
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw([B)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(C)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 97
    .line 98
    if-nez v2, :cond_1c

    .line 99
    .line 100
    iget-object v2, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v2, :cond_5

    .line 103
    .line 104
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_1c

    .line 109
    .line 110
    :cond_5
    move-wide/from16 v9, p5

    .line 111
    .line 112
    invoke-virtual {v1, v9, v10}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 117
    .line 118
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 119
    .line 120
    and-long/2addr v9, v11

    .line 121
    const-wide/16 v11, 0x0

    .line 122
    .line 123
    cmp-long v2, v9, v11

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    goto/16 :goto_d

    .line 128
    .line 129
    :cond_6
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 130
    .line 131
    const-wide/16 v9, 0x3e8

    .line 132
    .line 133
    if-nez v2, :cond_7

    .line 134
    .line 135
    iget-object v2, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 136
    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_8

    .line 144
    .line 145
    :cond_7
    move-wide v11, v9

    .line 146
    goto/16 :goto_c

    .line 147
    .line 148
    :cond_8
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    sget-object v13, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 153
    .line 154
    if-eq v2, v13, :cond_c

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    sget-object v15, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 161
    .line 162
    if-ne v14, v15, :cond_9

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    sget-object v14, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 166
    .line 167
    if-eq v2, v14, :cond_b

    .line 168
    .line 169
    const-string v14, "UTC"

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-eqz v14, :cond_a

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_a
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    invoke-static {v14, v2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 187
    .line 188
    .line 189
    move-result-object v14

    .line 190
    invoke-virtual {v14}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    invoke-virtual {v14}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    goto :goto_5

    .line 199
    :cond_b
    :goto_3
    move v14, v7

    .line 200
    goto :goto_5

    .line 201
    :cond_c
    :goto_4
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 202
    .line 203
    .line 204
    move-result-wide v14

    .line 205
    invoke-static {v14, v15}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 206
    .line 207
    .line 208
    move-result v14

    .line 209
    :goto_5
    iget-boolean v15, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 210
    .line 211
    const/16 v16, 0x1

    .line 212
    .line 213
    if-nez v15, :cond_d

    .line 214
    .line 215
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    if-eqz v15, :cond_e

    .line 220
    .line 221
    :cond_d
    move/from16 v7, v16

    .line 222
    .line 223
    :cond_e
    if-eqz v7, :cond_f

    .line 224
    .line 225
    const/4 v15, 0x0

    .line 226
    goto :goto_6

    .line 227
    :cond_f
    iget-object v15, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 228
    .line 229
    if-nez v15, :cond_10

    .line 230
    .line 231
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    :cond_10
    :goto_6
    if-nez v15, :cond_19

    .line 236
    .line 237
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 238
    .line 239
    .line 240
    move-result-wide v17

    .line 241
    if-eq v2, v13, :cond_12

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    sget-object v15, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 248
    .line 249
    if-ne v13, v15, :cond_11

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_11
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    invoke-virtual {v15, v13}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    invoke-virtual {v13}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    :goto_7
    move-wide/from16 p2, v11

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_12
    :goto_8
    invoke-static/range {v17 .. v18}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    goto :goto_7

    .line 276
    :goto_9
    int-to-long v11, v13

    .line 277
    add-long v11, v17, v11

    .line 278
    .line 279
    const-wide/32 v9, 0x15180

    .line 280
    .line 281
    .line 282
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 283
    .line 284
    .line 285
    move-result-wide v17

    .line 286
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->floorMod(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    long-to-int v9, v9

    .line 291
    const-wide/32 v10, 0xafa6c

    .line 292
    .line 293
    .line 294
    add-long v10, v17, v10

    .line 295
    .line 296
    cmp-long v12, v10, p2

    .line 297
    .line 298
    const-wide/16 v19, 0x1

    .line 299
    .line 300
    const-wide/32 v21, 0x23ab1

    .line 301
    .line 302
    .line 303
    const-wide/16 v23, 0x190

    .line 304
    .line 305
    if-gez v12, :cond_13

    .line 306
    .line 307
    const-wide/32 v12, 0xafa6d

    .line 308
    .line 309
    .line 310
    add-long v17, v17, v12

    .line 311
    .line 312
    div-long v17, v17, v21

    .line 313
    .line 314
    sub-long v12, v17, v19

    .line 315
    .line 316
    mul-long v17, v12, v23

    .line 317
    .line 318
    neg-long v12, v12

    .line 319
    mul-long v12, v12, v21

    .line 320
    .line 321
    add-long/2addr v10, v12

    .line 322
    goto :goto_a

    .line 323
    :cond_13
    move-wide/from16 v17, p2

    .line 324
    .line 325
    :goto_a
    mul-long v12, v10, v23

    .line 326
    .line 327
    const-wide/16 v25, 0x24f

    .line 328
    .line 329
    add-long v12, v12, v25

    .line 330
    .line 331
    div-long v12, v12, v21

    .line 332
    .line 333
    const-wide/16 v21, 0x16d

    .line 334
    .line 335
    mul-long v25, v12, v21

    .line 336
    .line 337
    const-wide/16 v27, 0x4

    .line 338
    .line 339
    div-long v29, v12, v27

    .line 340
    .line 341
    add-long v29, v29, v25

    .line 342
    .line 343
    const-wide/16 v25, 0x64

    .line 344
    .line 345
    div-long v31, v12, v25

    .line 346
    .line 347
    sub-long v29, v29, v31

    .line 348
    .line 349
    div-long v31, v12, v23

    .line 350
    .line 351
    add-long v31, v31, v29

    .line 352
    .line 353
    sub-long v29, v10, v31

    .line 354
    .line 355
    cmp-long v15, v29, p2

    .line 356
    .line 357
    if-gez v15, :cond_14

    .line 358
    .line 359
    sub-long v12, v12, v19

    .line 360
    .line 361
    mul-long v21, v21, v12

    .line 362
    .line 363
    div-long v19, v12, v27

    .line 364
    .line 365
    add-long v19, v19, v21

    .line 366
    .line 367
    div-long v21, v12, v25

    .line 368
    .line 369
    sub-long v19, v19, v21

    .line 370
    .line 371
    div-long v21, v12, v23

    .line 372
    .line 373
    add-long v21, v21, v19

    .line 374
    .line 375
    sub-long v29, v10, v21

    .line 376
    .line 377
    :cond_14
    move-wide/from16 v10, v29

    .line 378
    .line 379
    add-long v12, v12, v17

    .line 380
    .line 381
    long-to-int v10, v10

    .line 382
    mul-int/lit8 v11, v10, 0x5

    .line 383
    .line 384
    add-int/lit8 v11, v11, 0x2

    .line 385
    .line 386
    div-int/lit16 v11, v11, 0x99

    .line 387
    .line 388
    add-int/lit8 v15, v11, 0x2

    .line 389
    .line 390
    rem-int/lit8 v15, v15, 0xc

    .line 391
    .line 392
    add-int/lit8 v15, v15, 0x1

    .line 393
    .line 394
    move-object/from16 v17, v3

    .line 395
    .line 396
    mul-int/lit16 v3, v11, 0x132

    .line 397
    .line 398
    add-int/lit8 v3, v3, 0x5

    .line 399
    .line 400
    div-int/lit8 v3, v3, 0xa

    .line 401
    .line 402
    sub-int/2addr v10, v3

    .line 403
    add-int/lit8 v10, v10, 0x1

    .line 404
    .line 405
    div-int/lit8 v11, v11, 0xa

    .line 406
    .line 407
    move-object/from16 v16, v4

    .line 408
    .line 409
    int-to-long v3, v11

    .line 410
    add-long/2addr v12, v3

    .line 411
    const-wide/32 v3, -0x3b9ac9ff

    .line 412
    .line 413
    .line 414
    cmp-long v3, v12, v3

    .line 415
    .line 416
    if-ltz v3, :cond_18

    .line 417
    .line 418
    const-wide/32 v3, 0x3b9ac9ff

    .line 419
    .line 420
    .line 421
    cmp-long v3, v12, v3

    .line 422
    .line 423
    if-gtz v3, :cond_18

    .line 424
    .line 425
    move-object v3, v2

    .line 426
    long-to-int v2, v12

    .line 427
    int-to-long v11, v9

    .line 428
    cmp-long v4, v11, p2

    .line 429
    .line 430
    if-ltz v4, :cond_17

    .line 431
    .line 432
    const-wide/32 v18, 0x1517f

    .line 433
    .line 434
    .line 435
    cmp-long v4, v11, v18

    .line 436
    .line 437
    if-gtz v4, :cond_17

    .line 438
    .line 439
    const-wide/16 v18, 0xe10

    .line 440
    .line 441
    move v9, v14

    .line 442
    div-long v13, v11, v18

    .line 443
    .line 444
    long-to-int v4, v13

    .line 445
    mul-int/lit16 v13, v4, 0xe10

    .line 446
    .line 447
    int-to-long v13, v13

    .line 448
    sub-long/2addr v11, v13

    .line 449
    const-wide/16 v13, 0x3c

    .line 450
    .line 451
    div-long v13, v11, v13

    .line 452
    .line 453
    long-to-int v13, v13

    .line 454
    mul-int/lit8 v14, v13, 0x3c

    .line 455
    .line 456
    move-wide/from16 p2, v11

    .line 457
    .line 458
    int-to-long v11, v14

    .line 459
    sub-long v11, p2, v11

    .line 460
    .line 461
    long-to-int v11, v11

    .line 462
    if-ltz v2, :cond_1a

    .line 463
    .line 464
    const/16 v12, 0x270f

    .line 465
    .line 466
    if-gt v2, v12, :cond_1a

    .line 467
    .line 468
    move v14, v11

    .line 469
    const-wide/16 v11, 0x3e8

    .line 470
    .line 471
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->floorMod(JJ)J

    .line 472
    .line 473
    .line 474
    move-result-wide v5

    .line 475
    long-to-int v3, v5

    .line 476
    if-nez v3, :cond_16

    .line 477
    .line 478
    if-nez v7, :cond_16

    .line 479
    .line 480
    if-nez v4, :cond_15

    .line 481
    .line 482
    if-nez v13, :cond_15

    .line 483
    .line 484
    if-nez v14, :cond_15

    .line 485
    .line 486
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-eqz v3, :cond_15

    .line 499
    .line 500
    invoke-virtual {v1, v2, v15, v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :cond_15
    move v5, v4

    .line 505
    move v4, v10

    .line 506
    move v6, v13

    .line 507
    move v7, v14

    .line 508
    move v3, v15

    .line 509
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :cond_16
    move-object/from16 v1, p1

    .line 514
    .line 515
    move v8, v3

    .line 516
    move v5, v4

    .line 517
    move v4, v10

    .line 518
    move v6, v13

    .line 519
    move v3, v15

    .line 520
    move v10, v7

    .line 521
    move v7, v14

    .line 522
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :cond_17
    new-instance v1, Ljava/time/DateTimeException;

    .line 527
    .line 528
    const-string v2, "Invalid secondOfDay "

    .line 529
    .line 530
    invoke-static {v11, v12, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v1

    .line 538
    :cond_18
    new-instance v1, Ljava/time/DateTimeException;

    .line 539
    .line 540
    const-string v2, "Invalid year "

    .line 541
    .line 542
    invoke-static {v12, v13, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v1

    .line 550
    :cond_19
    move-object/from16 v17, v3

    .line 551
    .line 552
    move-object v3, v2

    .line 553
    :cond_1a
    iget-object v2, v0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 554
    .line 555
    if-eqz v2, :cond_1b

    .line 556
    .line 557
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    goto :goto_b

    .line 562
    :cond_1b
    invoke-virtual/range {v17 .. v17}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    :goto_b
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    invoke-static {v4, v3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v2, v3}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :goto_c
    div-long/2addr v5, v11

    .line 583
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :cond_1c
    :goto_d
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 588
    .line 589
    .line 590
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/Date;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeMillis(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
