.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲世苏;
.super L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲世苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲世苏;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/Instant;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏兰世哲(Ljava/time/Instant;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 28

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
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    iget-object v4, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v4, v3

    .line 20
    :goto_0
    move-object/from16 v5, p2

    .line 21
    .line 22
    check-cast v5, Ljava/time/Instant;

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏兰世哲(Ljava/time/Instant;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    iget-boolean v7, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Z

    .line 31
    .line 32
    iget-boolean v8, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:Z

    .line 33
    .line 34
    iget-boolean v4, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 35
    .line 36
    if-nez v8, :cond_a

    .line 37
    .line 38
    if-nez v4, :cond_a

    .line 39
    .line 40
    iget-boolean v6, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Z

    .line 41
    .line 42
    if-nez v6, :cond_a

    .line 43
    .line 44
    if-eqz v7, :cond_3

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v5, v2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-boolean v4, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 57
    .line 58
    if-nez v4, :cond_9

    .line 59
    .line 60
    iget-boolean v4, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 61
    .line 62
    if-nez v4, :cond_8

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-ltz v1, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x270f

    .line 71
    .line 72
    if-gt v1, v4, :cond_4

    .line 73
    .line 74
    iget-boolean v4, v0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 75
    .line 76
    if-nez v4, :cond_5

    .line 77
    .line 78
    :cond_4
    move-object/from16 v1, p1

    .line 79
    .line 80
    move-object v7, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    move-object v4, v2

    .line 83
    invoke-virtual {v4}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v4}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    move-object v5, v4

    .line 92
    invoke-virtual {v5}, Ljava/time/ZonedDateTime;->getHour()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    move-object v6, v5

    .line 97
    invoke-virtual {v6}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    move-object v7, v6

    .line 102
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getNano()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const v8, 0xf4240

    .line 111
    .line 112
    .line 113
    div-int/2addr v0, v8

    .line 114
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const/4 v9, 0x1

    .line 123
    move v7, v0

    .line 124
    move-object/from16 v0, p1

    .line 125
    .line 126
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世苏楪(IIIIIIIIZ)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_1
    invoke-virtual {v0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    move-object v3, v0

    .line 138
    :goto_2
    if-nez v3, :cond_7

    .line 139
    .line 140
    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏哲子兰世(Ljava/time/ZonedDateTime;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_7
    invoke-virtual {v3, v7}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_8
    move-object v7, v2

    .line 153
    invoke-interface {v7}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_9
    move-object v7, v2

    .line 166
    invoke-interface {v7}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    const-wide/16 v4, 0x3e8

    .line 175
    .line 176
    div-long/2addr v2, v4

    .line 177
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v5}, Ljava/time/Instant;->getEpochSecond()J

    .line 186
    .line 187
    .line 188
    move-result-wide v2

    .line 189
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 190
    .line 191
    if-eq v0, v6, :cond_c

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 198
    .line 199
    if-ne v6, v9, :cond_b

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_b
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0, v5}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    goto :goto_5

    .line 215
    :cond_c
    :goto_4
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    :goto_5
    int-to-long v5, v0

    .line 220
    add-long/2addr v2, v5

    .line 221
    const-wide/32 v5, 0x15180

    .line 222
    .line 223
    .line 224
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 225
    .line 226
    .line 227
    move-result-wide v9

    .line 228
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->floorMod(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v2

    .line 232
    long-to-int v0, v2

    .line 233
    const-wide/32 v2, 0xafa6c

    .line 234
    .line 235
    .line 236
    add-long/2addr v2, v9

    .line 237
    const-wide/16 v5, 0x0

    .line 238
    .line 239
    cmp-long v11, v2, v5

    .line 240
    .line 241
    const-wide/16 v12, 0x1

    .line 242
    .line 243
    const-wide/32 v14, 0x23ab1

    .line 244
    .line 245
    .line 246
    const-wide/16 v16, 0x190

    .line 247
    .line 248
    if-gez v11, :cond_d

    .line 249
    .line 250
    const-wide/32 v18, 0xafa6d

    .line 251
    .line 252
    .line 253
    add-long v9, v9, v18

    .line 254
    .line 255
    div-long/2addr v9, v14

    .line 256
    sub-long/2addr v9, v12

    .line 257
    mul-long v18, v9, v16

    .line 258
    .line 259
    neg-long v9, v9

    .line 260
    mul-long/2addr v9, v14

    .line 261
    add-long/2addr v2, v9

    .line 262
    goto :goto_6

    .line 263
    :cond_d
    move-wide/from16 v18, v5

    .line 264
    .line 265
    :goto_6
    mul-long v9, v2, v16

    .line 266
    .line 267
    const-wide/16 v20, 0x24f

    .line 268
    .line 269
    add-long v9, v9, v20

    .line 270
    .line 271
    div-long/2addr v9, v14

    .line 272
    const-wide/16 v14, 0x16d

    .line 273
    .line 274
    mul-long v20, v9, v14

    .line 275
    .line 276
    const-wide/16 v22, 0x4

    .line 277
    .line 278
    div-long v24, v9, v22

    .line 279
    .line 280
    add-long v24, v24, v20

    .line 281
    .line 282
    const-wide/16 v20, 0x64

    .line 283
    .line 284
    div-long v26, v9, v20

    .line 285
    .line 286
    sub-long v24, v24, v26

    .line 287
    .line 288
    div-long v26, v9, v16

    .line 289
    .line 290
    add-long v26, v26, v24

    .line 291
    .line 292
    sub-long v24, v2, v26

    .line 293
    .line 294
    cmp-long v11, v24, v5

    .line 295
    .line 296
    if-gez v11, :cond_e

    .line 297
    .line 298
    sub-long/2addr v9, v12

    .line 299
    mul-long/2addr v14, v9

    .line 300
    div-long v11, v9, v22

    .line 301
    .line 302
    add-long/2addr v11, v14

    .line 303
    div-long v13, v9, v20

    .line 304
    .line 305
    sub-long/2addr v11, v13

    .line 306
    div-long v13, v9, v16

    .line 307
    .line 308
    add-long/2addr v13, v11

    .line 309
    sub-long v24, v2, v13

    .line 310
    .line 311
    :cond_e
    move-wide/from16 v2, v24

    .line 312
    .line 313
    add-long v9, v9, v18

    .line 314
    .line 315
    long-to-int v2, v2

    .line 316
    mul-int/lit8 v3, v2, 0x5

    .line 317
    .line 318
    add-int/lit8 v3, v3, 0x2

    .line 319
    .line 320
    div-int/lit16 v3, v3, 0x99

    .line 321
    .line 322
    add-int/lit8 v11, v3, 0x2

    .line 323
    .line 324
    rem-int/lit8 v11, v11, 0xc

    .line 325
    .line 326
    add-int/lit8 v11, v11, 0x1

    .line 327
    .line 328
    mul-int/lit16 v12, v3, 0x132

    .line 329
    .line 330
    add-int/lit8 v12, v12, 0x5

    .line 331
    .line 332
    div-int/lit8 v12, v12, 0xa

    .line 333
    .line 334
    sub-int/2addr v2, v12

    .line 335
    add-int/lit8 v2, v2, 0x1

    .line 336
    .line 337
    div-int/lit8 v3, v3, 0xa

    .line 338
    .line 339
    int-to-long v12, v3

    .line 340
    add-long/2addr v9, v12

    .line 341
    const-wide/32 v12, -0x3b9ac9ff

    .line 342
    .line 343
    .line 344
    cmp-long v3, v9, v12

    .line 345
    .line 346
    if-ltz v3, :cond_13

    .line 347
    .line 348
    const-wide/32 v12, 0x3b9ac9ff

    .line 349
    .line 350
    .line 351
    cmp-long v3, v9, v12

    .line 352
    .line 353
    if-gtz v3, :cond_13

    .line 354
    .line 355
    long-to-int v1, v9

    .line 356
    int-to-long v9, v0

    .line 357
    cmp-long v0, v9, v5

    .line 358
    .line 359
    if-ltz v0, :cond_12

    .line 360
    .line 361
    const-wide/32 v5, 0x1517f

    .line 362
    .line 363
    .line 364
    cmp-long v0, v9, v5

    .line 365
    .line 366
    if-gtz v0, :cond_12

    .line 367
    .line 368
    const-wide/16 v5, 0xe10

    .line 369
    .line 370
    div-long v5, v9, v5

    .line 371
    .line 372
    long-to-int v0, v5

    .line 373
    mul-int/lit16 v3, v0, 0xe10

    .line 374
    .line 375
    int-to-long v5, v3

    .line 376
    sub-long/2addr v9, v5

    .line 377
    const-wide/16 v5, 0x3c

    .line 378
    .line 379
    div-long v5, v9, v5

    .line 380
    .line 381
    long-to-int v5, v5

    .line 382
    mul-int/lit8 v3, v5, 0x3c

    .line 383
    .line 384
    int-to-long v12, v3

    .line 385
    sub-long/2addr v9, v12

    .line 386
    long-to-int v6, v9

    .line 387
    if-eqz v4, :cond_f

    .line 388
    .line 389
    move v4, v0

    .line 390
    move v3, v2

    .line 391
    move v2, v11

    .line 392
    move-object/from16 v0, p1

    .line 393
    .line 394
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏(IIIIII)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :cond_f
    move v4, v0

    .line 399
    move v3, v2

    .line 400
    move v2, v11

    .line 401
    if-eqz v8, :cond_10

    .line 402
    .line 403
    move-object/from16 v0, p1

    .line 404
    .line 405
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世(IIIIII)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_10
    move-object/from16 v0, p1

    .line 410
    .line 411
    if-eqz v7, :cond_11

    .line 412
    .line 413
    invoke-virtual {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲苏楪世(III)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :cond_11
    invoke-virtual {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲苏世楪(III)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_12
    new-instance v0, Ljava/time/DateTimeException;

    .line 422
    .line 423
    const-string v1, "Invalid secondOfDay "

    .line 424
    .line 425
    invoke-static {v9, v10, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v0

    .line 433
    :cond_13
    new-instance v0, Ljava/time/DateTimeException;

    .line 434
    .line 435
    const-string v1, "Invalid year "

    .line 436
    .line 437
    invoke-static {v9, v10, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v0
.end method
