.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世苏楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/util/Date;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    iget-boolean v2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 8
    .line 9
    const-wide/16 v3, 0x3e8

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    mul-long/2addr p0, v3

    .line 20
    :cond_0
    new-instance v0, Ljava/util/Date;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_3
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 44
    .line 45
    const/16 v6, 0x6e

    .line 46
    .line 47
    if-ne v0, v6, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子苏兰()Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_4
    iget-boolean v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 55
    .line 56
    iget-object v6, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/util/Locale;

    .line 57
    .line 58
    iget-object v7, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v0, :cond_20

    .line 61
    .line 62
    if-eqz v6, :cond_5

    .line 63
    .line 64
    goto/16 :goto_a

    .line 65
    .line 66
    :cond_5
    if-nez v2, :cond_6

    .line 67
    .line 68
    iget-boolean v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 69
    .line 70
    if-eqz v0, :cond_7

    .line 71
    .line 72
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 79
    .line 80
    .line 81
    move-result-wide p0

    .line 82
    if-eqz v2, :cond_1f

    .line 83
    .line 84
    mul-long/2addr p0, v3

    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_7
    const/4 v0, 0x0

    .line 88
    const-wide/16 v8, 0x0

    .line 89
    .line 90
    if-eqz v7, :cond_19

    .line 91
    .line 92
    iget-boolean v2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 93
    .line 94
    if-eqz v2, :cond_b

    .line 95
    .line 96
    iget-wide v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 97
    .line 98
    const-wide/16 v6, 0x40

    .line 99
    .line 100
    and-long/2addr v0, v6

    .line 101
    cmp-long p0, v0, v8

    .line 102
    .line 103
    if-eqz p0, :cond_8

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲兰子()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    goto :goto_0

    .line 110
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲子兰()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    :goto_0
    cmp-long p0, v0, v8

    .line 115
    .line 116
    if-nez p0, :cond_a

    .line 117
    .line 118
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 119
    .line 120
    if-nez p0, :cond_9

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    goto/16 :goto_4

    .line 128
    .line 129
    :cond_a
    :goto_1
    new-instance p0, Ljava/util/Date;

    .line 130
    .line 131
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 132
    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰哲苏()Ljava/time/format/DateTimeFormatter;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_16

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-nez v10, :cond_1c

    .line 153
    .line 154
    const-string v10, "null"

    .line 155
    .line 156
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_c

    .line 161
    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_c
    const/16 v10, 0x2d

    .line 165
    .line 166
    invoke-virtual {v7, v10}, Ljava/lang/String;->indexOf(I)I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    const/4 v12, -0x1

    .line 171
    if-eq v11, v12, :cond_d

    .line 172
    .line 173
    invoke-virtual {v6, v10}, Ljava/lang/String;->indexOf(I)I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    if-ne v10, v12, :cond_d

    .line 178
    .line 179
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_d

    .line 184
    .line 185
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 186
    .line 187
    .line 188
    move-result-wide p0

    .line 189
    new-instance v0, Ljava/util/Date;

    .line 190
    .line 191
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_d
    iget-boolean v10, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 196
    .line 197
    iget-boolean v11, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 198
    .line 199
    const/16 v12, 0x13

    .line 200
    .line 201
    if-nez v10, :cond_11

    .line 202
    .line 203
    if-nez v11, :cond_e

    .line 204
    .line 205
    invoke-virtual {v2, v6}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;)Ljava/time/temporal/TemporalAccessor;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    sget-object p1, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    .line 210
    .line 211
    invoke-interface {p0, p1}, Ljava/time/temporal/TemporalAccessor;->get(Ljava/time/temporal/TemporalField;)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    sget-object v0, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    .line 216
    .line 217
    invoke-interface {p0, v0}, Ljava/time/temporal/TemporalAccessor;->get(Ljava/time/temporal/TemporalField;)I

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    const/4 v0, 0x1

    .line 222
    invoke-static {p1, p0, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 227
    .line 228
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    goto/16 :goto_3

    .line 233
    .line 234
    :cond_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-ne v7, v12, :cond_f

    .line 239
    .line 240
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 241
    .line 242
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰楪哲(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_f

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    invoke-static {p0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏哲兰(ILjava/lang/String;)Ljava/time/LocalDateTime;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    goto :goto_3

    .line 257
    :cond_f
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Z

    .line 258
    .line 259
    if-eqz p0, :cond_10

    .line 260
    .line 261
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    const/16 p1, 0xa

    .line 266
    .line 267
    if-le p0, p1, :cond_10

    .line 268
    .line 269
    invoke-virtual {v6, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-static {p0, v2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    goto :goto_2

    .line 278
    :cond_10
    invoke-static {v6, v2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    :goto_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 283
    .line 284
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    goto :goto_3

    .line 289
    :cond_11
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-ne v0, v12, :cond_14

    .line 294
    .line 295
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:Z

    .line 296
    .line 297
    if-nez p0, :cond_12

    .line 298
    .line 299
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 300
    .line 301
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰楪哲(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 302
    .line 303
    .line 304
    move-result p1

    .line 305
    if-nez p1, :cond_12

    .line 306
    .line 307
    const-string p1, "yyyy-MM-dd hh:mm:ss"

    .line 308
    .line 309
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    if-eqz p1, :cond_14

    .line 314
    .line 315
    :cond_12
    if-eqz p0, :cond_13

    .line 316
    .line 317
    const/16 v12, 0x10

    .line 318
    .line 319
    :cond_13
    invoke-static {v12, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏哲兰(ILjava/lang/String;)Ljava/time/LocalDateTime;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    goto :goto_3

    .line 324
    :cond_14
    if-eqz v11, :cond_15

    .line 325
    .line 326
    invoke-static {v6, v2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    goto :goto_3

    .line 331
    :cond_15
    invoke-static {v6, v2}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    sget-object p1, Ljava/time/LocalDate;->MIN:Ljava/time/LocalDate;

    .line 336
    .line 337
    invoke-static {p1, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    goto :goto_4

    .line 350
    :cond_16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    :goto_4
    if-nez p0, :cond_17

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_17
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 358
    .line 359
    .line 360
    move-result-wide v0

    .line 361
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-virtual {p0}, Ljava/time/LocalTime;->getNano()I

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    cmp-long p1, v0, v8

    .line 370
    .line 371
    const v2, 0xf4240

    .line 372
    .line 373
    .line 374
    if-gez p1, :cond_18

    .line 375
    .line 376
    if-lez p0, :cond_18

    .line 377
    .line 378
    const-wide/16 v5, 0x1

    .line 379
    .line 380
    add-long/2addr v0, v5

    .line 381
    mul-long/2addr v0, v3

    .line 382
    div-int/2addr p0, v2

    .line 383
    add-int/lit16 p0, p0, -0x3e8

    .line 384
    .line 385
    :goto_5
    int-to-long p0, p0

    .line 386
    add-long/2addr v0, p0

    .line 387
    goto :goto_8

    .line 388
    :cond_18
    mul-long/2addr v0, v3

    .line 389
    div-int/2addr p0, v2

    .line 390
    goto :goto_5

    .line 391
    :cond_19
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世哲兰楪()Z

    .line 392
    .line 393
    .line 394
    move-result p0

    .line 395
    if-eqz p0, :cond_1a

    .line 396
    .line 397
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Ljava/util/Date;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :cond_1a
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 403
    .line 404
    if-eqz p0, :cond_1b

    .line 405
    .line 406
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世苏兰楪()Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    if-eqz p0, :cond_1b

    .line 411
    .line 412
    const/16 p0, 0x3a

    .line 413
    .line 414
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 418
    .line 419
    .line 420
    move-result-wide v6

    .line 421
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 422
    .line 423
    .line 424
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 425
    .line 426
    move-wide v0, v6

    .line 427
    goto :goto_6

    .line 428
    :cond_1b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲兰子()J

    .line 429
    .line 430
    .line 431
    move-result-wide v0

    .line 432
    :goto_6
    cmp-long p0, v0, v8

    .line 433
    .line 434
    if-nez p0, :cond_1d

    .line 435
    .line 436
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 437
    .line 438
    if-eqz p0, :cond_1d

    .line 439
    .line 440
    :cond_1c
    :goto_7
    return-object v5

    .line 441
    :cond_1d
    if-eqz v2, :cond_1e

    .line 442
    .line 443
    mul-long p0, v0, v3

    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_1e
    :goto_8
    move-wide p0, v0

    .line 447
    :cond_1f
    :goto_9
    new-instance v0, Ljava/util/Date;

    .line 448
    .line 449
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 450
    .line 451
    .line 452
    return-object v0

    .line 453
    :cond_20
    :goto_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    if-eqz v6, :cond_21

    .line 458
    .line 459
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 460
    .line 461
    invoke-direct {v0, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 462
    .line 463
    .line 464
    goto :goto_b

    .line 465
    :catch_0
    move-exception v0

    .line 466
    goto :goto_c

    .line 467
    :cond_21
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 468
    .line 469
    invoke-direct {v0, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :goto_b
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 473
    .line 474
    .line 475
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    return-object p0

    .line 477
    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const-string v2, "parse error : "

    .line 480
    .line 481
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 496
    .line 497
    .line 498
    return-object v5
.end method

.method public 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子世苏楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子世苏楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏哲楪兰(Ljava/lang/Object;)Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
