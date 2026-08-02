.class public abstract Lsw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lno;->k:Lno;

    .line 2
    .line 3
    const-string v0, "\"\\"

    .line 4
    .line 5
    invoke-static {v0}, Leb;->z(Ljava/lang/String;)Lno;

    .line 6
    .line 7
    .line 8
    const-string v0, "\t ,="

    .line 9
    .line 10
    invoke-static {v0}, Leb;->z(Ljava/lang/String;)Lno;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final a(Lr92;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr92;->h:Lk82;

    .line 2
    .line 3
    iget-object v0, v0, Lk82;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, Lr92;->k:I

    .line 15
    .line 16
    const/16 v1, 0x64

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0xc8

    .line 21
    .line 22
    if-lt v0, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    const/16 v1, 0xcc

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x130

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p0}, Lwg3;->e(Lr92;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, -0x1

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_5

    .line 42
    .line 43
    iget-object p0, p0, Lr92;->m:Ljs0;

    .line 44
    .line 45
    const-string v0, "Transfer-Encoding"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    :cond_3
    const-string v0, "chunked"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0

    .line 65
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public static final b(Lsn;Lyw0;Ljs0;)V
    .locals 36

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lsn;->D:Lsn;

    .line 13
    .line 14
    move-object/from16 v2, p0

    .line 15
    .line 16
    if-ne v2, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object v1, Ly00;->k:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljs0;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-ge v4, v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljs0;->b(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const-string v7, "Set-Cookie"

    .line 35
    .line 36
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    new-instance v5, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0, v4}, Ljs0;->d(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    if-eqz v5, :cond_4

    .line 61
    .line 62
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    const/4 v0, 0x0

    .line 71
    :goto_1
    sget-object v1, Lbe0;->h:Lbe0;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    move-object v4, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move-object v4, v0

    .line 78
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    move v6, v3

    .line 83
    const/4 v7, 0x0

    .line 84
    :goto_3
    if-ge v6, v5, :cond_2c

    .line 85
    .line 86
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v8, v0

    .line 91
    check-cast v8, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    sget-object v0, Lug3;->a:[B

    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/16 v11, 0x3b

    .line 107
    .line 108
    invoke-static {v8, v11, v3, v0}, Lug3;->c(Ljava/lang/String;CII)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/16 v12, 0x3d

    .line 113
    .line 114
    invoke-static {v8, v12, v3, v0}, Lug3;->c(Ljava/lang/String;CII)I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-ne v13, v0, :cond_6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    invoke-static {v8, v3, v13}, Lug3;->g(Ljava/lang/String;II)I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    invoke-static {v8, v14, v13}, Lug3;->h(Ljava/lang/String;II)I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    invoke-virtual {v8, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v17

    .line 133
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-nez v14, :cond_7

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    invoke-static/range {v17 .. v17}, Lug3;->f(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    const/4 v15, -0x1

    .line 145
    if-eq v14, v15, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 149
    .line 150
    invoke-static {v8, v13, v0}, Lug3;->g(Ljava/lang/String;II)I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    invoke-static {v8, v13, v0}, Lug3;->h(Ljava/lang/String;II)I

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    invoke-virtual {v8, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v18

    .line 162
    invoke-static/range {v18 .. v18}, Lug3;->f(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eq v13, v15, :cond_9

    .line 167
    .line 168
    :goto_4
    move v11, v3

    .line 169
    const/16 p0, 0x0

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    move-object/from16 v3, p1

    .line 173
    .line 174
    goto/16 :goto_14

    .line 175
    .line 176
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 177
    .line 178
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    const-wide v19, 0xe677d21fdbffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    move/from16 v16, v3

    .line 188
    .line 189
    move/from16 v25, v16

    .line 190
    .line 191
    move/from16 v30, v25

    .line 192
    .line 193
    move-wide/from16 v28, v19

    .line 194
    .line 195
    const/16 p0, 0x0

    .line 196
    .line 197
    const/16 p2, 0x1

    .line 198
    .line 199
    const/4 v2, 0x0

    .line 200
    const/4 v15, 0x0

    .line 201
    const-wide/16 v21, -0x1

    .line 202
    .line 203
    const-wide/16 v23, -0x1

    .line 204
    .line 205
    const/16 v26, 0x1

    .line 206
    .line 207
    const/16 v27, 0x0

    .line 208
    .line 209
    :goto_5
    const-string v14, ""

    .line 210
    .line 211
    const-wide v31, 0x7fffffffffffffffL

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    const-wide/high16 v33, -0x8000000000000000L

    .line 217
    .line 218
    if-ge v0, v13, :cond_17

    .line 219
    .line 220
    invoke-static {v8, v11, v0, v13}, Lug3;->c(Ljava/lang/String;CII)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v8, v12, v0, v3}, Lug3;->c(Ljava/lang/String;CII)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    invoke-static {v8, v0, v11}, Lug3;->g(Ljava/lang/String;II)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-static {v8, v0, v11}, Lug3;->h(Ljava/lang/String;II)I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    invoke-virtual {v8, v0, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ge v11, v3, :cond_a

    .line 241
    .line 242
    add-int/lit8 v11, v11, 0x1

    .line 243
    .line 244
    invoke-static {v8, v11, v3}, Lug3;->g(Ljava/lang/String;II)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    invoke-static {v8, v11, v3}, Lug3;->h(Ljava/lang/String;II)I

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    invoke-virtual {v8, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    :cond_a
    const-string v11, "expires"

    .line 257
    .line 258
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    if-eqz v11, :cond_b

    .line 263
    .line 264
    :try_start_0
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-static {v14, v0}, Lt11;->G(Ljava/lang/String;I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v28
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 272
    :goto_6
    move/from16 v25, p2

    .line 273
    .line 274
    goto/16 :goto_7

    .line 275
    .line 276
    :cond_b
    const-string v11, "max-age"

    .line 277
    .line 278
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    if-eqz v11, :cond_f

    .line 283
    .line 284
    :try_start_1
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 285
    .line 286
    .line 287
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 288
    const-wide/16 v21, 0x0

    .line 289
    .line 290
    cmp-long v0, v11, v21

    .line 291
    .line 292
    if-gtz v0, :cond_c

    .line 293
    .line 294
    move-wide/from16 v21, v33

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_c
    move-wide/from16 v21, v11

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :catch_0
    move-exception v0

    .line 301
    :try_start_2
    const-string v11, "-?\\d+"

    .line 302
    .line 303
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    if-eqz v11, :cond_e

    .line 319
    .line 320
    const-string v0, "-"

    .line 321
    .line 322
    const/4 v11, 0x0

    .line 323
    invoke-static {v14, v0, v11}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_d

    .line 328
    .line 329
    move-wide/from16 v31, v33

    .line 330
    .line 331
    :cond_d
    move-wide/from16 v21, v31

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_e
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 335
    :cond_f
    const-string v11, "domain"

    .line 336
    .line 337
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    if-eqz v11, :cond_12

    .line 342
    .line 343
    :try_start_3
    const-string v0, "."

    .line 344
    .line 345
    const/4 v11, 0x0

    .line 346
    invoke-static {v14, v0, v11}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    if-nez v12, :cond_11

    .line 351
    .line 352
    invoke-static {v14, v0}, Lpv2;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lsg3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-eqz v0, :cond_10

    .line 361
    .line 362
    move-object v2, v0

    .line 363
    const/16 v26, 0x0

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 367
    .line 368
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 369
    .line 370
    .line 371
    throw v0

    .line 372
    :cond_11
    const-string v0, "Failed requirement."

    .line 373
    .line 374
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 375
    .line 376
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v11
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 380
    :cond_12
    const-string v11, "path"

    .line 381
    .line 382
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-eqz v11, :cond_13

    .line 387
    .line 388
    move-object v15, v14

    .line 389
    goto :goto_7

    .line 390
    :cond_13
    const-string v11, "secure"

    .line 391
    .line 392
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    if-eqz v11, :cond_14

    .line 397
    .line 398
    move/from16 v30, p2

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_14
    const-string v11, "httponly"

    .line 402
    .line 403
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    if-eqz v11, :cond_15

    .line 408
    .line 409
    move/from16 v16, p2

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_15
    const-string v11, "samesite"

    .line 413
    .line 414
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_16

    .line 419
    .line 420
    move-object/from16 v27, v14

    .line 421
    .line 422
    :catch_1
    :cond_16
    :goto_7
    add-int/lit8 v0, v3, 0x1

    .line 423
    .line 424
    const/4 v3, 0x0

    .line 425
    const/16 v11, 0x3b

    .line 426
    .line 427
    const/16 v12, 0x3d

    .line 428
    .line 429
    goto/16 :goto_5

    .line 430
    .line 431
    :cond_17
    cmp-long v0, v21, v33

    .line 432
    .line 433
    if-nez v0, :cond_18

    .line 434
    .line 435
    move-object/from16 v3, p1

    .line 436
    .line 437
    move-wide/from16 v19, v33

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_18
    cmp-long v0, v21, v23

    .line 441
    .line 442
    if-eqz v0, :cond_1c

    .line 443
    .line 444
    const-wide v11, 0x20c49ba5e353f7L

    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    cmp-long v0, v21, v11

    .line 450
    .line 451
    if-gtz v0, :cond_19

    .line 452
    .line 453
    const-wide/16 v11, 0x3e8

    .line 454
    .line 455
    mul-long v31, v21, v11

    .line 456
    .line 457
    :cond_19
    add-long v31, v9, v31

    .line 458
    .line 459
    cmp-long v0, v31, v9

    .line 460
    .line 461
    if-ltz v0, :cond_1b

    .line 462
    .line 463
    cmp-long v0, v31, v19

    .line 464
    .line 465
    if-lez v0, :cond_1a

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_1a
    move-object/from16 v3, p1

    .line 469
    .line 470
    move-wide/from16 v19, v31

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_1b
    :goto_8
    move-object/from16 v3, p1

    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_1c
    move-object/from16 v3, p1

    .line 477
    .line 478
    move-wide/from16 v19, v28

    .line 479
    .line 480
    :goto_9
    iget-object v0, v3, Lyw0;->d:Ljava/lang/String;

    .line 481
    .line 482
    const/16 v8, 0x2e

    .line 483
    .line 484
    if-nez v2, :cond_1d

    .line 485
    .line 486
    move-object/from16 v21, v0

    .line 487
    .line 488
    goto :goto_b

    .line 489
    :cond_1d
    invoke-static {v0, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-eqz v9, :cond_1e

    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_1e
    const/4 v11, 0x0

    .line 497
    invoke-static {v0, v2, v11}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    if-eqz v9, :cond_29

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    sub-int/2addr v9, v10

    .line 512
    add-int/lit8 v9, v9, -0x1

    .line 513
    .line 514
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 515
    .line 516
    .line 517
    move-result v9

    .line 518
    if-ne v9, v8, :cond_29

    .line 519
    .line 520
    sget-object v9, Lsg3;->a:Lo72;

    .line 521
    .line 522
    invoke-virtual {v9, v0}, Lo72;->b(Ljava/lang/CharSequence;)Z

    .line 523
    .line 524
    .line 525
    move-result v9

    .line 526
    if-nez v9, :cond_29

    .line 527
    .line 528
    :goto_a
    move-object/from16 v21, v2

    .line 529
    .line 530
    :goto_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-eq v0, v2, :cond_25

    .line 539
    .line 540
    sget-object v0, Lk42;->d:Lk42;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    invoke-static/range {v21 .. v21}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    move/from16 v2, p2

    .line 553
    .line 554
    new-array v3, v2, [C

    .line 555
    .line 556
    const/16 v35, 0x0

    .line 557
    .line 558
    aput-char v8, v3, v35

    .line 559
    .line 560
    invoke-static {v1, v3}, Lpv2;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-static {v1}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-static {v3, v14}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    if-eqz v3, :cond_20

    .line 573
    .line 574
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    sub-int/2addr v3, v2

    .line 579
    if-gez v3, :cond_1f

    .line 580
    .line 581
    const/4 v3, 0x0

    .line 582
    :cond_1f
    invoke-static {v3, v1}, Ldu;->B0(ILjava/util/List;)Ljava/util/List;

    .line 583
    .line 584
    .line 585
    :cond_20
    iget-object v1, v0, Lk42;->a:Lkj1;

    .line 586
    .line 587
    iget-object v0, v1, Lkj1;->i:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 590
    .line 591
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-nez v2, :cond_23

    .line 596
    .line 597
    const/4 v2, 0x1

    .line 598
    const/4 v11, 0x0

    .line 599
    invoke-virtual {v0, v11, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-nez v0, :cond_21

    .line 604
    .line 605
    goto :goto_e

    .line 606
    :cond_21
    const/4 v3, 0x0

    .line 607
    :goto_c
    :try_start_4
    invoke-virtual {v1}, Lkj1;->I()V

    .line 608
    .line 609
    .line 610
    throw p0
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 611
    :catch_2
    move-exception v0

    .line 612
    :try_start_5
    iput-object v0, v1, Lkj1;->k:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 613
    .line 614
    if-eqz v3, :cond_24

    .line 615
    .line 616
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 621
    .line 622
    .line 623
    goto :goto_f

    .line 624
    :catchall_0
    move-exception v0

    .line 625
    goto :goto_d

    .line 626
    :catch_3
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 627
    .line 628
    .line 629
    move v3, v2

    .line 630
    goto :goto_c

    .line 631
    :goto_d
    if-eqz v3, :cond_22

    .line 632
    .line 633
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 638
    .line 639
    .line 640
    :cond_22
    throw v0

    .line 641
    :cond_23
    :goto_e
    :try_start_7
    iget-object v0, v1, Lkj1;->j:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_4

    .line 646
    .line 647
    .line 648
    goto :goto_f

    .line 649
    :catch_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 654
    .line 655
    .line 656
    :cond_24
    :goto_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 657
    .line 658
    new-instance v2, Ljava/lang/StringBuilder;

    .line 659
    .line 660
    const-string v3, "Unable to load "

    .line 661
    .line 662
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    iget-object v3, v1, Lkj1;->l:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v3, Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    const-string v3, " resource."

    .line 673
    .line 674
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    iget-object v1, v1, Lkj1;->k:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v1, Ljava/io/IOException;

    .line 687
    .line 688
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 689
    .line 690
    .line 691
    throw v0

    .line 692
    :cond_25
    const-string v0, "/"

    .line 693
    .line 694
    const/4 v11, 0x0

    .line 695
    if-eqz v15, :cond_27

    .line 696
    .line 697
    invoke-static {v15, v0, v11}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 698
    .line 699
    .line 700
    move-result v2

    .line 701
    if-nez v2, :cond_26

    .line 702
    .line 703
    goto :goto_11

    .line 704
    :cond_26
    :goto_10
    move-object/from16 v22, v15

    .line 705
    .line 706
    move/from16 v24, v16

    .line 707
    .line 708
    goto :goto_12

    .line 709
    :cond_27
    :goto_11
    invoke-virtual {v3}, Lyw0;->b()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    const/16 v8, 0x2f

    .line 714
    .line 715
    const/4 v9, 0x6

    .line 716
    invoke-static {v2, v8, v11, v9}, Lpv2;->u0(Ljava/lang/String;CII)I

    .line 717
    .line 718
    .line 719
    move-result v8

    .line 720
    if-eqz v8, :cond_28

    .line 721
    .line 722
    invoke-virtual {v2, v11, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    :cond_28
    move-object v15, v0

    .line 727
    goto :goto_10

    .line 728
    :goto_12
    new-instance v16, Ly00;

    .line 729
    .line 730
    move/from16 v23, v30

    .line 731
    .line 732
    invoke-direct/range {v16 .. v27}, Ly00;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V

    .line 733
    .line 734
    .line 735
    goto :goto_13

    .line 736
    :cond_29
    const/4 v11, 0x0

    .line 737
    move-object/from16 v16, p0

    .line 738
    .line 739
    :goto_13
    move-object/from16 v2, v16

    .line 740
    .line 741
    :goto_14
    if-nez v2, :cond_2a

    .line 742
    .line 743
    goto :goto_15

    .line 744
    :cond_2a
    if-nez v7, :cond_2b

    .line 745
    .line 746
    new-instance v0, Ljava/util/ArrayList;

    .line 747
    .line 748
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 749
    .line 750
    .line 751
    move-object v7, v0

    .line 752
    :cond_2b
    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    :goto_15
    add-int/lit8 v6, v6, 0x1

    .line 756
    .line 757
    move v3, v11

    .line 758
    goto/16 :goto_3

    .line 759
    .line 760
    :cond_2c
    const/16 p0, 0x0

    .line 761
    .line 762
    if-eqz v7, :cond_2d

    .line 763
    .line 764
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_2d
    move-object/from16 v2, p0

    .line 773
    .line 774
    :goto_16
    if-nez v2, :cond_2e

    .line 775
    .line 776
    goto :goto_17

    .line 777
    :cond_2e
    move-object v1, v2

    .line 778
    :goto_17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 779
    .line 780
    .line 781
    return-void
.end method
