.class public final Lxhss/ᲀᛶᛶ;
.super Lxhss/ᲁᛳᛸᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    instance-of v0, p1, Ljava/util/Date;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p1, Ljava/util/Date;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    new-instance p0, Ljava/util/Date;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p1, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_16

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    const-string v0, "p.m."

    .line 38
    .line 39
    const-string v1, "pm"

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "a.m."

    .line 46
    .line 47
    const-string v1, "am"

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ljava/util/StringTokenizer;

    .line 54
    .line 55
    const-string v1, " \u202f-/:,.+\u5e74\u6708\u65e5\u66dc\u6642\u5206\u79d2"

    .line 56
    .line 57
    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v2, 0x4

    .line 77
    const/4 v3, 0x1

    .line 78
    const/4 v4, 0x2

    .line 79
    const/4 v5, 0x5

    .line 80
    const/4 v6, 0x0

    .line 81
    if-ne v1, v2, :cond_8

    .line 82
    .line 83
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    invoke-static {}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛴᛷᛱ()Ljava/util/GregorianCalendar;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {p0, v3, p1}, Ljava/util/Calendar;->set(II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_4

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_4
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lxhss/ᛶᛱᛱᛳ;->ᲇᛶᛴᲀ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0, v4, p1}, Ljava/util/Calendar;->set(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_5

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_5
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-ne v1, v5, :cond_6

    .line 160
    .line 161
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    const/16 v2, 0x54

    .line 166
    .line 167
    if-ne v1, v2, :cond_6

    .line 168
    .line 169
    invoke-virtual {p1, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p0, v5, v1}, Ljava/util/Calendar;->set(II)V

    .line 178
    .line 179
    .line 180
    const/4 v1, 0x3

    .line 181
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1, p0, v0}, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/util/Date;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :cond_6
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-virtual {p0, v5, p1}, Ljava/util/Calendar;->set(II)V

    .line 195
    .line 196
    .line 197
    invoke-static {v0, p0}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ(Ljava/util/StringTokenizer;Ljava/util/GregorianCalendar;)Ljava/util/Date;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0

    .line 202
    :cond_7
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :cond_8
    sget-object v1, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ:Ljava/util/TreeMap;

    .line 208
    .line 209
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_a

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez p1, :cond_9

    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :cond_9
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    :cond_a
    sget-object v1, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 228
    .line 229
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    if-eqz v7, :cond_12

    .line 234
    .line 235
    invoke-static {}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛴᛷᛱ()Ljava/util/GregorianCalendar;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Ljava/lang/Integer;

    .line 244
    .line 245
    if-eqz v1, :cond_11

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-virtual {v7, v4, p1}, Ljava/util/Calendar;->set(II)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-nez p1, :cond_b

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_b
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    invoke-virtual {v7, v5, p1}, Ljava/util/Calendar;->set(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-nez p1, :cond_c

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_c
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_e

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    if-nez p1, :cond_d

    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_d
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    :cond_e
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    if-ne p0, v2, :cond_f

    .line 311
    .line 312
    invoke-static {p1}, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    invoke-virtual {v7, v3, p0}, Ljava/util/Calendar;->set(II)V

    .line 317
    .line 318
    .line 319
    goto :goto_0

    .line 320
    :cond_f
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-ne p0, v4, :cond_10

    .line 325
    .line 326
    invoke-static {p1, v7, v0}, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/util/Date;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    return-object p0

    .line 331
    :cond_10
    :goto_0
    invoke-static {v0, v7}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ(Ljava/util/StringTokenizer;Ljava/util/GregorianCalendar;)Ljava/util/Date;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :cond_11
    const-string v0, "can not parse "

    .line 337
    .line 338
    const-string v1, " as month"

    .line 339
    .line 340
    invoke-static {v0, p1, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᛷᛱ(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    return-object p0

    .line 348
    :cond_12
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    if-eqz v1, :cond_15

    .line 357
    .line 358
    invoke-static {}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛴᛷᛱ()Ljava/util/GregorianCalendar;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    invoke-virtual {v1, v5, p1}, Ljava/util/Calendar;->set(II)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    if-nez p1, :cond_13

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :cond_13
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-static {p1}, Lxhss/ᛶᛱᛱᛳ;->ᲇᛶᛴᲀ(Ljava/lang/String;)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 385
    .line 386
    .line 387
    move-result p1

    .line 388
    invoke-virtual {v1, v4, p1}, Ljava/util/Calendar;->set(II)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    if-nez p1, :cond_14

    .line 396
    .line 397
    goto :goto_1

    .line 398
    :cond_14
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    invoke-static {p0}, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    invoke-virtual {v1, v3, p0}, Ljava/util/Calendar;->set(II)V

    .line 407
    .line 408
    .line 409
    invoke-static {v0, v1}, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ(Ljava/util/StringTokenizer;Ljava/util/GregorianCalendar;)Ljava/util/Date;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    :cond_15
    :goto_1
    return-object p0

    .line 414
    :cond_16
    new-instance p0, Ljava/lang/RuntimeException;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v1, "Primitive: Can not convert "

    .line 427
    .line 428
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string p1, " to int"

    .line 435
    .line 436
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw p0
.end method
