.class public abstract L飘花落叶言世兰苏哲子楪/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "\"\\"

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lokio/ByteString;

    .line 9
    .line 10
    .line 11
    const-string v0, "\t ,="

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lokio/ByteString;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏兰哲;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;)V
    .locals 35

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
    sget-object v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏兰哲;

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
    sget-object v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    move v4, v2

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-ge v4, v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0, v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

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
    invoke-virtual {v0, v4}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/String;

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
    if-nez v0, :cond_5

    .line 72
    .line 73
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 74
    .line 75
    :cond_5
    move-object v1, v0

    .line 76
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    move v5, v2

    .line 81
    const/4 v6, 0x0

    .line 82
    :goto_2
    if-ge v5, v4, :cond_26

    .line 83
    .line 84
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v7, v0

    .line 89
    check-cast v7, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    sget-object v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/16 v10, 0x3b

    .line 105
    .line 106
    invoke-static {v7, v10, v2, v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/16 v11, 0x3d

    .line 111
    .line 112
    invoke-static {v7, v11, v2, v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-ne v12, v0, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    invoke-static {v2, v12, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    invoke-static {v13, v12, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    invoke-virtual {v7, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v16

    .line 131
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-nez v13, :cond_7

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    invoke-static/range {v16 .. v16}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    const/4 v14, -0x1

    .line 143
    if-eq v13, v14, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 147
    .line 148
    invoke-static {v12, v0, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    invoke-static {v12, v0, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    invoke-virtual {v7, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v17

    .line 160
    invoke-static/range {v17 .. v17}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    if-eq v12, v14, :cond_a

    .line 165
    .line 166
    :goto_3
    move-object/from16 v7, p1

    .line 167
    .line 168
    :cond_9
    :goto_4
    const/4 v15, 0x0

    .line 169
    goto/16 :goto_f

    .line 170
    .line 171
    :cond_a
    add-int/lit8 v0, v0, 0x1

    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    const-wide v18, 0xe677d21fdbffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    move/from16 v22, v2

    .line 183
    .line 184
    move/from16 v23, v22

    .line 185
    .line 186
    move/from16 v24, v23

    .line 187
    .line 188
    move-wide/from16 v27, v18

    .line 189
    .line 190
    const/16 p2, 0x1

    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v13, 0x0

    .line 194
    const-wide/16 v20, -0x1

    .line 195
    .line 196
    const/16 v25, 0x1

    .line 197
    .line 198
    const/16 v26, 0x0

    .line 199
    .line 200
    :goto_5
    const-wide v29, 0x7fffffffffffffffL

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    const-wide/high16 v31, -0x8000000000000000L

    .line 206
    .line 207
    if-ge v0, v12, :cond_18

    .line 208
    .line 209
    const-wide/16 v33, -0x1

    .line 210
    .line 211
    invoke-static {v7, v10, v0, v12}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    invoke-static {v7, v11, v0, v14}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    invoke-static {v0, v15, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-static {v0, v15, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-virtual {v7, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-ge v15, v14, :cond_b

    .line 232
    .line 233
    add-int/lit8 v15, v15, 0x1

    .line 234
    .line 235
    invoke-static {v15, v14, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-static {v10, v14, v7}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    invoke-virtual {v7, v10, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    goto :goto_6

    .line 248
    :cond_b
    const-string v10, ""

    .line 249
    .line 250
    :goto_6
    const-string v15, "expires"

    .line 251
    .line 252
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-eqz v15, :cond_d

    .line 257
    .line 258
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-static {v0, v10}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲兰楪苏(ILjava/lang/String;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v27
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 266
    :cond_c
    :goto_7
    move/from16 v24, p2

    .line 267
    .line 268
    goto/16 :goto_8

    .line 269
    .line 270
    :cond_d
    const-string v15, "max-age"

    .line 271
    .line 272
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    if-eqz v15, :cond_10

    .line 277
    .line 278
    :try_start_1
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 279
    .line 280
    .line 281
    move-result-wide v20
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 282
    const-wide/16 v29, 0x0

    .line 283
    .line 284
    cmp-long v0, v20, v29

    .line 285
    .line 286
    if-gtz v0, :cond_c

    .line 287
    .line 288
    move-wide/from16 v20, v31

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :catch_0
    move-exception v0

    .line 292
    :try_start_2
    new-instance v15, Lkotlin/text/Regex;

    .line 293
    .line 294
    const-string v11, "-?\\d+"

    .line 295
    .line 296
    invoke-direct {v15, v11}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v15, v10}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    if-eqz v11, :cond_f

    .line 304
    .line 305
    const-string v0, "-"

    .line 306
    .line 307
    invoke-static {v10, v0, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_e

    .line 312
    .line 313
    move-wide/from16 v29, v31

    .line 314
    .line 315
    :cond_e
    move-wide/from16 v20, v29

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_f
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 319
    :cond_10
    const-string v11, "domain"

    .line 320
    .line 321
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-eqz v11, :cond_13

    .line 326
    .line 327
    :try_start_3
    const-string v0, "."

    .line 328
    .line 329
    invoke-virtual {v10, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    if-nez v11, :cond_12

    .line 334
    .line 335
    invoke-static {v10, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪哲苏世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-eqz v0, :cond_11

    .line 344
    .line 345
    move-object v3, v0

    .line 346
    move/from16 v25, v2

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 350
    .line 351
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_12
    const-string v0, "Failed requirement."

    .line 356
    .line 357
    new-instance v10, Ljava/lang/IllegalArgumentException;

    .line 358
    .line 359
    invoke-direct {v10, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v10
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 363
    :cond_13
    const-string v11, "path"

    .line 364
    .line 365
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    if-eqz v11, :cond_14

    .line 370
    .line 371
    move-object v13, v10

    .line 372
    goto :goto_8

    .line 373
    :cond_14
    const-string v11, "secure"

    .line 374
    .line 375
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    if-eqz v11, :cond_15

    .line 380
    .line 381
    move/from16 v22, p2

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_15
    const-string v11, "httponly"

    .line 385
    .line 386
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 387
    .line 388
    .line 389
    move-result v11

    .line 390
    if-eqz v11, :cond_16

    .line 391
    .line 392
    move/from16 v23, p2

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_16
    const-string v11, "samesite"

    .line 396
    .line 397
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_17

    .line 402
    .line 403
    move-object/from16 v26, v10

    .line 404
    .line 405
    :catch_1
    :cond_17
    :goto_8
    add-int/lit8 v0, v14, 0x1

    .line 406
    .line 407
    const/16 v10, 0x3b

    .line 408
    .line 409
    const/16 v11, 0x3d

    .line 410
    .line 411
    goto/16 :goto_5

    .line 412
    .line 413
    :cond_18
    const-wide/16 v33, -0x1

    .line 414
    .line 415
    cmp-long v0, v20, v31

    .line 416
    .line 417
    if-nez v0, :cond_19

    .line 418
    .line 419
    move-object/from16 v7, p1

    .line 420
    .line 421
    move-wide/from16 v18, v31

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_19
    cmp-long v0, v20, v33

    .line 425
    .line 426
    if-eqz v0, :cond_1d

    .line 427
    .line 428
    const-wide v10, 0x20c49ba5e353f7L

    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    cmp-long v0, v20, v10

    .line 434
    .line 435
    if-gtz v0, :cond_1a

    .line 436
    .line 437
    const-wide/16 v10, 0x3e8

    .line 438
    .line 439
    mul-long v29, v20, v10

    .line 440
    .line 441
    :cond_1a
    add-long v29, v8, v29

    .line 442
    .line 443
    cmp-long v0, v29, v8

    .line 444
    .line 445
    if-ltz v0, :cond_1c

    .line 446
    .line 447
    cmp-long v0, v29, v18

    .line 448
    .line 449
    if-lez v0, :cond_1b

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_1b
    move-object/from16 v7, p1

    .line 453
    .line 454
    move-wide/from16 v18, v29

    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_1c
    :goto_9
    move-object/from16 v7, p1

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_1d
    move-object/from16 v7, p1

    .line 461
    .line 462
    move-wide/from16 v18, v27

    .line 463
    .line 464
    :goto_a
    iget-object v0, v7, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 465
    .line 466
    if-nez v3, :cond_1e

    .line 467
    .line 468
    move-object v3, v0

    .line 469
    goto :goto_b

    .line 470
    :cond_1e
    invoke-static {v0, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    if-eqz v8, :cond_1f

    .line 475
    .line 476
    goto :goto_b

    .line 477
    :cond_1f
    invoke-static {v0, v3}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏兰哲楪世(Ljava/lang/String;Ljava/lang/String;)Z

    .line 478
    .line 479
    .line 480
    move-result v8

    .line 481
    if-eqz v8, :cond_9

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 484
    .line 485
    .line 486
    move-result v8

    .line 487
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    sub-int/2addr v8, v9

    .line 492
    add-int/lit8 v8, v8, -0x1

    .line 493
    .line 494
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    const/16 v9, 0x2e

    .line 499
    .line 500
    if-ne v8, v9, :cond_9

    .line 501
    .line 502
    sget-object v8, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/text/Regex;

    .line 503
    .line 504
    invoke-virtual {v8, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    if-nez v8, :cond_9

    .line 509
    .line 510
    :goto_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 515
    .line 516
    .line 517
    move-result v8

    .line 518
    if-eq v0, v8, :cond_20

    .line 519
    .line 520
    sget-object v0, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;

    .line 521
    .line 522
    invoke-virtual {v0, v3}, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    if-nez v0, :cond_20

    .line 527
    .line 528
    goto/16 :goto_4

    .line 529
    .line 530
    :cond_20
    const-string v0, "/"

    .line 531
    .line 532
    if-eqz v13, :cond_22

    .line 533
    .line 534
    invoke-static {v13, v0, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 535
    .line 536
    .line 537
    move-result v8

    .line 538
    if-nez v8, :cond_21

    .line 539
    .line 540
    goto :goto_d

    .line 541
    :cond_21
    :goto_c
    move-object/from16 v21, v13

    .line 542
    .line 543
    goto :goto_e

    .line 544
    :cond_22
    :goto_d
    invoke-virtual {v7}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    const/16 v9, 0x2f

    .line 549
    .line 550
    const/4 v10, 0x6

    .line 551
    invoke-static {v8, v9, v2, v10}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(Ljava/lang/String;CII)I

    .line 552
    .line 553
    .line 554
    move-result v9

    .line 555
    if-eqz v9, :cond_23

    .line 556
    .line 557
    invoke-virtual {v8, v2, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    :cond_23
    move-object v13, v0

    .line 562
    goto :goto_c

    .line 563
    :goto_e
    new-instance v15, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;

    .line 564
    .line 565
    move-object/from16 v20, v3

    .line 566
    .line 567
    invoke-direct/range {v15 .. v26}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    :goto_f
    if-nez v15, :cond_24

    .line 571
    .line 572
    goto :goto_10

    .line 573
    :cond_24
    if-nez v6, :cond_25

    .line 574
    .line 575
    new-instance v0, Ljava/util/ArrayList;

    .line 576
    .line 577
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 578
    .line 579
    .line 580
    move-object v6, v0

    .line 581
    :cond_25
    invoke-interface {v6, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 585
    .line 586
    goto/16 :goto_2

    .line 587
    .line 588
    :cond_26
    if-eqz v6, :cond_27

    .line 589
    .line 590
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    goto :goto_11

    .line 598
    :cond_27
    const/4 v3, 0x0

    .line 599
    :goto_11
    if-nez v3, :cond_28

    .line 600
    .line 601
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 602
    .line 603
    :cond_28
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;)Z
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:I

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
    invoke-static {p0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;)J

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
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;

    .line 44
    .line 45
    const-string v0, "Transfer-Encoding"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

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
