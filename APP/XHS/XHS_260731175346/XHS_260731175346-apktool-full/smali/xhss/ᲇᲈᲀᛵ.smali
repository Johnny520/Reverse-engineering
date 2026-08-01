.class public abstract Lxhss/ᲇᲈᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v2, "\"\\"

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v0, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 17
    .line 18
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    const-string v2, "\t ,="

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 27
    .line 28
    .line 29
    iput-object v2, v0, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static final ᛱᛱᛲᲇ(Lxhss/ᛳᛴᲀᲁ;Lxhss/ᛷᛶᲁᛵ;Lxhss/ᲁᛸᛱᛵ;)V
    .locals 36

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛳᛴᲀᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    if-ne v2, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v1, Lxhss/ᛶᲁᛸᲇ;->ᲈᛳᲀ:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v4, v2

    .line 18
    const/4 v5, 0x0

    .line 19
    :goto_0
    if-ge v4, v1, :cond_3

    .line 20
    .line 21
    invoke-static {v0, v4}, Lxhss/ᛷᛸᲀᲀ;->ᛷᲁᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const-string v7, "Set-Cookie"

    .line 26
    .line 27
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {v0, v4}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    if-eqz v5, :cond_4

    .line 52
    .line 53
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_1

    .line 58
    :cond_4
    const/4 v0, 0x0

    .line 59
    :goto_1
    sget-object v1, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 60
    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    move-object v4, v1

    .line 64
    goto :goto_2

    .line 65
    :cond_5
    move-object v4, v0

    .line 66
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    move v6, v2

    .line 71
    const/4 v7, 0x0

    .line 72
    :goto_3
    if-ge v6, v5, :cond_26

    .line 73
    .line 74
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v8, v0

    .line 79
    check-cast v8, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    sget-object v0, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/16 v11, 0x3b

    .line 92
    .line 93
    invoke-static {v8, v11, v2, v0}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/16 v12, 0x3d

    .line 98
    .line 99
    invoke-static {v8, v12, v2, v0}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    if-ne v13, v0, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    invoke-static {v8, v2, v13}, Lxhss/ᛶᛸᛲ;->ᲇᛶᛴᲀ(Ljava/lang/String;II)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    invoke-static {v8, v14, v13}, Lxhss/ᛶᛸᛲ;->ᲀᲇᛳᲁ(Ljava/lang/String;II)I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    invoke-virtual {v8, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v17

    .line 118
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    if-nez v14, :cond_7

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_7
    invoke-static/range {v17 .. v17}, Lxhss/ᛶᛸᛲ;->ᛷᛴᛷᛱ(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    const/4 v15, -0x1

    .line 130
    if-eq v14, v15, :cond_8

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 134
    .line 135
    invoke-static {v8, v13, v0}, Lxhss/ᛶᛸᛲ;->ᲇᛶᛴᲀ(Ljava/lang/String;II)I

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    invoke-static {v8, v13, v0}, Lxhss/ᛶᛸᛲ;->ᲀᲇᛳᲁ(Ljava/lang/String;II)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    invoke-virtual {v8, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v18

    .line 147
    invoke-static/range {v18 .. v18}, Lxhss/ᛶᛸᛲ;->ᛷᛴᛷᛱ(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-eq v13, v15, :cond_9

    .line 152
    .line 153
    :goto_4
    move-object/from16 v8, p1

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    goto/16 :goto_10

    .line 157
    .line 158
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    const-wide v19, 0xe677d21fdbffL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    move/from16 v23, v2

    .line 170
    .line 171
    move/from16 v24, v23

    .line 172
    .line 173
    move/from16 v25, v24

    .line 174
    .line 175
    move-wide/from16 v28, v19

    .line 176
    .line 177
    const/16 p2, 0x1

    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const-wide/16 v21, -0x1

    .line 182
    .line 183
    const/16 v26, 0x1

    .line 184
    .line 185
    const/16 v27, 0x0

    .line 186
    .line 187
    :goto_5
    const-wide v30, 0x7fffffffffffffffL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    const-wide/high16 v32, -0x8000000000000000L

    .line 193
    .line 194
    if-ge v0, v13, :cond_17

    .line 195
    .line 196
    const-wide/16 v34, -0x1

    .line 197
    .line 198
    invoke-static {v8, v11, v0, v13}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    invoke-static {v8, v12, v0, v15}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    invoke-static {v8, v0, v11}, Lxhss/ᛶᛸᛲ;->ᲇᛶᛴᲀ(Ljava/lang/String;II)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    invoke-static {v8, v0, v11}, Lxhss/ᛶᛸᛲ;->ᲀᲇᛳᲁ(Ljava/lang/String;II)I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    invoke-virtual {v8, v0, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-ge v11, v15, :cond_a

    .line 219
    .line 220
    add-int/lit8 v11, v11, 0x1

    .line 221
    .line 222
    invoke-static {v8, v11, v15}, Lxhss/ᛶᛸᛲ;->ᲇᛶᛴᲀ(Ljava/lang/String;II)I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    invoke-static {v8, v11, v15}, Lxhss/ᛶᛸᛲ;->ᲀᲇᛳᲁ(Ljava/lang/String;II)I

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    invoke-virtual {v8, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    goto :goto_6

    .line 235
    :cond_a
    const-string v11, ""

    .line 236
    .line 237
    :goto_6
    const-string v12, "expires"

    .line 238
    .line 239
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    if-eqz v12, :cond_b

    .line 244
    .line 245
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-static {v11, v0}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛶᛴᲈ(Ljava/lang/String;I)J

    .line 250
    .line 251
    .line 252
    move-result-wide v28
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 253
    :goto_7
    move/from16 v25, p2

    .line 254
    .line 255
    goto/16 :goto_8

    .line 256
    .line 257
    :cond_b
    const-string v12, "max-age"

    .line 258
    .line 259
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    if-eqz v12, :cond_f

    .line 264
    .line 265
    :try_start_1
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 266
    .line 267
    .line 268
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 269
    const-wide/16 v21, 0x0

    .line 270
    .line 271
    cmp-long v0, v11, v21

    .line 272
    .line 273
    if-gtz v0, :cond_c

    .line 274
    .line 275
    move-wide/from16 v21, v32

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_c
    move-wide/from16 v21, v11

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :catch_0
    move-exception v0

    .line 282
    :try_start_2
    const-string v12, "-?\\d+"

    .line 283
    .line 284
    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-virtual {v12, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-eqz v12, :cond_e

    .line 297
    .line 298
    const-string v0, "-"

    .line 299
    .line 300
    invoke-static {v11, v0, v2}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_d

    .line 305
    .line 306
    move-wide/from16 v30, v32

    .line 307
    .line 308
    :cond_d
    move-wide/from16 v21, v30

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_e
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 312
    :cond_f
    const-string v12, "domain"

    .line 313
    .line 314
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_12

    .line 319
    .line 320
    :try_start_3
    const-string v0, "."

    .line 321
    .line 322
    invoke-virtual {v11, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-nez v12, :cond_11

    .line 327
    .line 328
    invoke-static {v11, v0}, Lxhss/ᛲᛱᛲᲀ;->ᛵᲈᛱᛳ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0}, Lxhss/ᲀᲀᛶᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-eqz v0, :cond_10

    .line 337
    .line 338
    move-object v3, v0

    .line 339
    move/from16 v26, v2

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 343
    .line 344
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_11
    const-string v0, "Failed requirement."

    .line 349
    .line 350
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 351
    .line 352
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v11
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 356
    :cond_12
    const-string v12, "path"

    .line 357
    .line 358
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    if-eqz v12, :cond_13

    .line 363
    .line 364
    move-object v14, v11

    .line 365
    goto :goto_8

    .line 366
    :cond_13
    const-string v12, "secure"

    .line 367
    .line 368
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v12

    .line 372
    if-eqz v12, :cond_14

    .line 373
    .line 374
    move/from16 v23, p2

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_14
    const-string v12, "httponly"

    .line 378
    .line 379
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    if-eqz v12, :cond_15

    .line 384
    .line 385
    move/from16 v24, p2

    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_15
    const-string v12, "samesite"

    .line 389
    .line 390
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_16

    .line 395
    .line 396
    move-object/from16 v27, v11

    .line 397
    .line 398
    :catch_1
    :cond_16
    :goto_8
    add-int/lit8 v0, v15, 0x1

    .line 399
    .line 400
    const/16 v11, 0x3b

    .line 401
    .line 402
    const/16 v12, 0x3d

    .line 403
    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :cond_17
    const-wide/16 v34, -0x1

    .line 407
    .line 408
    cmp-long v0, v21, v32

    .line 409
    .line 410
    if-nez v0, :cond_18

    .line 411
    .line 412
    move-object/from16 v8, p1

    .line 413
    .line 414
    move-wide/from16 v19, v32

    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_18
    cmp-long v0, v21, v34

    .line 418
    .line 419
    if-eqz v0, :cond_1c

    .line 420
    .line 421
    const-wide v11, 0x20c49ba5e353f7L

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    cmp-long v0, v21, v11

    .line 427
    .line 428
    if-gtz v0, :cond_19

    .line 429
    .line 430
    const-wide/16 v11, 0x3e8

    .line 431
    .line 432
    mul-long v30, v21, v11

    .line 433
    .line 434
    :cond_19
    add-long v30, v9, v30

    .line 435
    .line 436
    cmp-long v0, v30, v9

    .line 437
    .line 438
    if-ltz v0, :cond_1b

    .line 439
    .line 440
    cmp-long v0, v30, v19

    .line 441
    .line 442
    if-lez v0, :cond_1a

    .line 443
    .line 444
    goto :goto_9

    .line 445
    :cond_1a
    move-object/from16 v8, p1

    .line 446
    .line 447
    move-wide/from16 v19, v30

    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_1b
    :goto_9
    move-object/from16 v8, p1

    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_1c
    move-object/from16 v8, p1

    .line 454
    .line 455
    move-wide/from16 v19, v28

    .line 456
    .line 457
    :goto_a
    iget-object v0, v8, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 458
    .line 459
    if-nez v3, :cond_1d

    .line 460
    .line 461
    move-object v3, v0

    .line 462
    goto :goto_b

    .line 463
    :cond_1d
    invoke-static {v0, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    if-eqz v9, :cond_1e

    .line 468
    .line 469
    goto :goto_b

    .line 470
    :cond_1e
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    if-eqz v9, :cond_1f

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 477
    .line 478
    .line 479
    move-result v9

    .line 480
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    sub-int/2addr v9, v10

    .line 485
    add-int/lit8 v9, v9, -0x1

    .line 486
    .line 487
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    const/16 v10, 0x2e

    .line 492
    .line 493
    if-ne v9, v10, :cond_1f

    .line 494
    .line 495
    sget-object v9, Lxhss/ᲀᲀᛶᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛳᛴᲁ;

    .line 496
    .line 497
    iget-object v9, v9, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v9, Ljava/util/regex/Pattern;

    .line 500
    .line 501
    invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    if-nez v9, :cond_1f

    .line 510
    .line 511
    :goto_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 516
    .line 517
    .line 518
    move-result v9

    .line 519
    if-eq v0, v9, :cond_20

    .line 520
    .line 521
    sget-object v0, Lxhss/ᲇᛷᛷᲀ;->ᲇᛴᲇᛵ:Lxhss/ᲇᛷᛷᲀ;

    .line 522
    .line 523
    invoke-virtual {v0, v3}, Lxhss/ᲇᛷᛷᲀ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    if-nez v0, :cond_20

    .line 528
    .line 529
    :cond_1f
    const/16 v16, 0x0

    .line 530
    .line 531
    goto :goto_f

    .line 532
    :cond_20
    const-string v0, "/"

    .line 533
    .line 534
    if-eqz v14, :cond_22

    .line 535
    .line 536
    invoke-static {v14, v0, v2}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 537
    .line 538
    .line 539
    move-result v9

    .line 540
    if-nez v9, :cond_21

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_21
    :goto_c
    move-object/from16 v22, v14

    .line 544
    .line 545
    goto :goto_e

    .line 546
    :cond_22
    :goto_d
    invoke-virtual {v8}, Lxhss/ᛷᛶᲁᛵ;->ᛱᛱᛲᲇ()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    const/16 v10, 0x2f

    .line 551
    .line 552
    const/4 v11, 0x6

    .line 553
    invoke-static {v9, v10, v2, v11}, Lxhss/ᛲᛱᛲᲀ;->ᲈᛱᛷᛵ(Ljava/lang/CharSequence;CII)I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    if-eqz v10, :cond_23

    .line 558
    .line 559
    invoke-virtual {v9, v2, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    :cond_23
    move-object v14, v0

    .line 564
    goto :goto_c

    .line 565
    :goto_e
    new-instance v16, Lxhss/ᛶᲁᛸᲇ;

    .line 566
    .line 567
    move-object/from16 v21, v3

    .line 568
    .line 569
    invoke-direct/range {v16 .. v27}, Lxhss/ᛶᲁᛸᲇ;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V

    .line 570
    .line 571
    .line 572
    :goto_f
    move-object/from16 v3, v16

    .line 573
    .line 574
    :goto_10
    if-nez v3, :cond_24

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_24
    if-nez v7, :cond_25

    .line 578
    .line 579
    new-instance v0, Ljava/util/ArrayList;

    .line 580
    .line 581
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 582
    .line 583
    .line 584
    move-object v7, v0

    .line 585
    :cond_25
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    :goto_11
    add-int/lit8 v6, v6, 0x1

    .line 589
    .line 590
    goto/16 :goto_3

    .line 591
    .line 592
    :cond_26
    if-eqz v7, :cond_27

    .line 593
    .line 594
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    goto :goto_12

    .line 599
    :cond_27
    const/4 v3, 0x0

    .line 600
    :goto_12
    if-nez v3, :cond_28

    .line 601
    .line 602
    goto :goto_13

    .line 603
    :cond_28
    move-object v1, v3

    .line 604
    :goto_13
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 605
    .line 606
    .line 607
    return-void
.end method

.method public static final ᛷᛵᛵᲈ(Lxhss/ᲀᛶᛷᲁ;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "HEAD"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0xc8

    .line 23
    .line 24
    if-lt v0, v1, :cond_2

    .line 25
    .line 26
    :cond_1
    const/16 v1, 0xcc

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x130

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide/16 v2, -0x1

    .line 40
    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 46
    .line 47
    const-string v0, "Transfer-Encoding"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_3

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    :cond_3
    const-string v0, "chunked"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 68
    return p0
.end method
