.class public final synthetic Lbsh/classpath/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbsh/classpath/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lbsh/classpath/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-string v0, "null"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    const-string p0, ""

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :cond_1
    :goto_0
    return-object v3

    .line 35
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    :try_start_0
    new-instance p0, Ljava/net/URL;

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    move-object v3, p0

    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception p0

    .line 52
    const-string p1, "read URL error"

    .line 53
    .line 54
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-object v3

    .line 58
    :pswitch_2
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    const-wide/16 v0, 0x0

    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    check-cast p1, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide p0

    .line 85
    invoke-static {p0, p1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_3
    :goto_2
    return-object v3

    .line 98
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 99
    .line 100
    new-array p0, v2, [Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {p1, p0}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_4
    new-instance p0, Ljava/io/File;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_7
    new-instance p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 130
    .line 131
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_8
    check-cast p1, [B

    .line 142
    .line 143
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_9
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 149
    .line 150
    check-cast p1, Ljava/lang/String;

    .line 151
    .line 152
    invoke-direct {p0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p1}, Ljava/time/Period;->parse(Ljava/lang/CharSequence;)Ljava/time/Period;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 164
    .line 165
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 166
    .line 167
    .line 168
    move-result-object v3
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1

    .line 169
    goto :goto_3

    .line 170
    :catch_1
    move-exception p0

    .line 171
    const-string p1, "create address error"

    .line 172
    .line 173
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    return-object v3

    .line 177
    :pswitch_c
    new-instance p0, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 178
    .line 179
    check-cast p1, [J

    .line 180
    .line 181
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicLongArray;-><init>([J)V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_d
    return-object p1

    .line 186
    :pswitch_e
    if-nez p1, :cond_4

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_4
    instance-of p0, p1, Ljava/lang/String;

    .line 190
    .line 191
    if-eqz p0, :cond_5

    .line 192
    .line 193
    check-cast p1, Ljava/lang/String;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :goto_5
    return-object v3

    .line 205
    :pswitch_f
    if-nez p1, :cond_6

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_6
    instance-of p0, p1, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p0, :cond_7

    .line 211
    .line 212
    check-cast p1, Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    :goto_6
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    :goto_7
    return-object v3

    .line 224
    :pswitch_10
    if-nez p1, :cond_8

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_8
    instance-of p0, p1, Ljava/lang/String;

    .line 228
    .line 229
    if-eqz p0, :cond_9

    .line 230
    .line 231
    check-cast p1, Ljava/lang/String;

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    :goto_8
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    :goto_9
    return-object v3

    .line 243
    :pswitch_11
    if-eqz p1, :cond_a

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_a
    move v1, v2

    .line 247
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :pswitch_12
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_13
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :pswitch_14
    instance-of p0, p1, Ljava/lang/Double;

    .line 263
    .line 264
    if-eqz p0, :cond_b

    .line 265
    .line 266
    check-cast p1, Ljava/lang/Double;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 269
    .line 270
    .line 271
    move-result-wide p0

    .line 272
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 273
    .line 274
    .line 275
    move-result-wide p0

    .line 276
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    goto/16 :goto_d

    .line 281
    .line 282
    :cond_b
    instance-of p0, p1, Ljava/lang/Float;

    .line 283
    .line 284
    if-eqz p0, :cond_c

    .line 285
    .line 286
    check-cast p1, Ljava/lang/Float;

    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    float-to-double p0, p0

    .line 293
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 294
    .line 295
    .line 296
    move-result-wide p0

    .line 297
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    goto :goto_d

    .line 302
    :cond_c
    instance-of p0, p1, Ljava/math/BigDecimal;

    .line 303
    .line 304
    if-eqz p0, :cond_d

    .line 305
    .line 306
    check-cast p1, Ljava/math/BigDecimal;

    .line 307
    .line 308
    sget-object p0, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 309
    .line 310
    invoke-virtual {p1, v2, p0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    goto :goto_d

    .line 315
    :cond_d
    instance-of p0, p1, Ljava/util/List;

    .line 316
    .line 317
    if-eqz p0, :cond_11

    .line 318
    .line 319
    move-object p0, p1

    .line 320
    check-cast p0, Ljava/util/List;

    .line 321
    .line 322
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    move v1, v2

    .line 327
    :goto_b
    if-ge v1, v0, :cond_11

    .line 328
    .line 329
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    instance-of v4, v3, Ljava/lang/Double;

    .line 334
    .line 335
    if-eqz v4, :cond_e

    .line 336
    .line 337
    check-cast v3, Ljava/lang/Double;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v3

    .line 343
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 344
    .line 345
    .line 346
    move-result-wide v3

    .line 347
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_e
    instance-of v4, v3, Ljava/lang/Float;

    .line 356
    .line 357
    if-eqz v4, :cond_f

    .line 358
    .line 359
    check-cast v3, Ljava/lang/Float;

    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    float-to-double v3, v3

    .line 366
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 367
    .line 368
    .line 369
    move-result-wide v3

    .line 370
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_f
    instance-of v4, v3, Ljava/math/BigDecimal;

    .line 379
    .line 380
    if-eqz v4, :cond_10

    .line 381
    .line 382
    check-cast v3, Ljava/math/BigDecimal;

    .line 383
    .line 384
    sget-object v4, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 385
    .line 386
    invoke-virtual {v3, v2, v4}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    :cond_10
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_11
    :goto_d
    return-object p1

    .line 397
    :pswitch_15
    instance-of p0, p1, Ljava/lang/Double;

    .line 398
    .line 399
    if-eqz p0, :cond_12

    .line 400
    .line 401
    check-cast p1, Ljava/lang/Double;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 404
    .line 405
    .line 406
    move-result-wide p0

    .line 407
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    .line 408
    .line 409
    .line 410
    move-result-wide p0

    .line 411
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    goto/16 :goto_10

    .line 416
    .line 417
    :cond_12
    instance-of p0, p1, Ljava/lang/Float;

    .line 418
    .line 419
    if-eqz p0, :cond_13

    .line 420
    .line 421
    check-cast p1, Ljava/lang/Float;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 424
    .line 425
    .line 426
    move-result p0

    .line 427
    float-to-double p0, p0

    .line 428
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    .line 429
    .line 430
    .line 431
    move-result-wide p0

    .line 432
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    goto :goto_10

    .line 437
    :cond_13
    instance-of p0, p1, Ljava/math/BigDecimal;

    .line 438
    .line 439
    if-eqz p0, :cond_14

    .line 440
    .line 441
    check-cast p1, Ljava/math/BigDecimal;

    .line 442
    .line 443
    sget-object p0, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 444
    .line 445
    invoke-virtual {p1, v2, p0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    goto :goto_10

    .line 450
    :cond_14
    instance-of p0, p1, Ljava/util/List;

    .line 451
    .line 452
    if-eqz p0, :cond_18

    .line 453
    .line 454
    move-object p0, p1

    .line 455
    check-cast p0, Ljava/util/List;

    .line 456
    .line 457
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    move v1, v2

    .line 462
    :goto_e
    if-ge v1, v0, :cond_18

    .line 463
    .line 464
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    instance-of v4, v3, Ljava/lang/Double;

    .line 469
    .line 470
    if-eqz v4, :cond_15

    .line 471
    .line 472
    check-cast v3, Ljava/lang/Double;

    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 475
    .line 476
    .line 477
    move-result-wide v3

    .line 478
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 479
    .line 480
    .line 481
    move-result-wide v3

    .line 482
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    goto :goto_f

    .line 490
    :cond_15
    instance-of v4, v3, Ljava/lang/Float;

    .line 491
    .line 492
    if-eqz v4, :cond_16

    .line 493
    .line 494
    check-cast v3, Ljava/lang/Float;

    .line 495
    .line 496
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    float-to-double v3, v3

    .line 501
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 502
    .line 503
    .line 504
    move-result-wide v3

    .line 505
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    goto :goto_f

    .line 513
    :cond_16
    instance-of v4, v3, Ljava/math/BigDecimal;

    .line 514
    .line 515
    if-eqz v4, :cond_17

    .line 516
    .line 517
    check-cast v3, Ljava/math/BigDecimal;

    .line 518
    .line 519
    sget-object v4, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 520
    .line 521
    invoke-virtual {v3, v2, v4}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-interface {p0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    :cond_17
    :goto_f
    add-int/lit8 v1, v1, 0x1

    .line 529
    .line 530
    goto :goto_e

    .line 531
    :cond_18
    :goto_10
    return-object p1

    .line 532
    :pswitch_16
    if-nez p1, :cond_19

    .line 533
    .line 534
    goto :goto_12

    .line 535
    :cond_19
    instance-of p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 536
    .line 537
    if-eqz p0, :cond_1a

    .line 538
    .line 539
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 540
    .line 541
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 542
    .line 543
    :cond_1a
    instance-of p0, p1, Ljava/util/List;

    .line 544
    .line 545
    if-eqz p0, :cond_1c

    .line 546
    .line 547
    check-cast p1, Ljava/util/List;

    .line 548
    .line 549
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    if-nez p0, :cond_1b

    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_1b
    sub-int/2addr p0, v1

    .line 557
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    goto :goto_12

    .line 562
    :cond_1c
    instance-of p0, p1, Ljava/util/Collection;

    .line 563
    .line 564
    if-eqz p0, :cond_1e

    .line 565
    .line 566
    check-cast p1, Ljava/util/Collection;

    .line 567
    .line 568
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 569
    .line 570
    .line 571
    move-result p0

    .line 572
    if-eqz p0, :cond_1d

    .line 573
    .line 574
    goto :goto_12

    .line 575
    :cond_1d
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    :goto_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result p1

    .line 583
    if-eqz p1, :cond_21

    .line 584
    .line 585
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    goto :goto_11

    .line 590
    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 595
    .line 596
    .line 597
    move-result p0

    .line 598
    if-eqz p0, :cond_20

    .line 599
    .line 600
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 601
    .line 602
    .line 603
    move-result p0

    .line 604
    if-nez p0, :cond_1f

    .line 605
    .line 606
    goto :goto_12

    .line 607
    :cond_1f
    sub-int/2addr p0, v1

    .line 608
    invoke-static {p1, p0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    goto :goto_12

    .line 613
    :cond_20
    move-object v3, p1

    .line 614
    :cond_21
    :goto_12
    return-object v3

    .line 615
    :pswitch_17
    if-nez p1, :cond_22

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_22
    instance-of p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 619
    .line 620
    if-eqz p0, :cond_23

    .line 621
    .line 622
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 623
    .line 624
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 625
    .line 626
    :cond_23
    instance-of p0, p1, Ljava/util/List;

    .line 627
    .line 628
    if-eqz p0, :cond_25

    .line 629
    .line 630
    check-cast p1, Ljava/util/List;

    .line 631
    .line 632
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result p0

    .line 636
    if-eqz p0, :cond_24

    .line 637
    .line 638
    goto :goto_13

    .line 639
    :cond_24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    goto :goto_13

    .line 644
    :cond_25
    instance-of p0, p1, Ljava/util/Collection;

    .line 645
    .line 646
    if-eqz p0, :cond_27

    .line 647
    .line 648
    check-cast p1, Ljava/util/Collection;

    .line 649
    .line 650
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 651
    .line 652
    .line 653
    move-result p0

    .line 654
    if-eqz p0, :cond_26

    .line 655
    .line 656
    goto :goto_13

    .line 657
    :cond_26
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    goto :goto_13

    .line 666
    :cond_27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 671
    .line 672
    .line 673
    move-result p0

    .line 674
    if-eqz p0, :cond_29

    .line 675
    .line 676
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 677
    .line 678
    .line 679
    move-result p0

    .line 680
    if-nez p0, :cond_28

    .line 681
    .line 682
    goto :goto_13

    .line 683
    :cond_28
    invoke-static {p1, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    goto :goto_13

    .line 688
    :cond_29
    move-object v3, p1

    .line 689
    :goto_13
    return-object v3

    .line 690
    :pswitch_18
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    return-object p0

    .line 695
    :pswitch_19
    check-cast p1, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;

    .line 696
    .line 697
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:Z

    .line 698
    .line 699
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 700
    .line 701
    .line 702
    move-result-object p0

    .line 703
    return-object p0

    .line 704
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 705
    .line 706
    invoke-static {p1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    return-object p0

    .line 711
    :pswitch_1b
    check-cast p1, Ljava/nio/file/Path;

    .line 712
    .line 713
    invoke-interface {p1}, Ljava/nio/file/Path;->toString()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    return-object p0

    .line 718
    nop

    .line 719
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
