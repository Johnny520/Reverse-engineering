.class public final Lxhss/ᛴᲇᲈᛲ;
.super Lxhss/ᲈᲈᛱᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public ᛷᛴᛷᛱ:Ljava/io/File;

.field public final synthetic ᛷᲁᲁ:Ljava/lang/String;

.field public synthetic ᛸᛲᲀᛵ:Ljava/lang/Object;

.field public ᛸᛴᛶᛳ:I

.field public final synthetic ᛸᛶᲈᛶ:Ljava/io/File;

.field public final synthetic ᛸᛷᲈᲈ:Landroid/content/Context;

.field public ᲀᲇᛳᲁ:Ljava/io/File;

.field public ᲇᛶᛴᲀ:Ljava/io/File;

.field public final synthetic ᲈᛳᲀ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛷᲈᲈ:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛴᲇᲈᛲ;->ᲈᛳᲀ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lxhss/ᛴᲇᲈᛲ;->ᛷᲁᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛶᲈᛶ:Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p0, p5}, Lxhss/ᛸᛴᛳᛷ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxhss/ᛲᛸᲁᲇ;

    .line 2
    .line 3
    check-cast p2, Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᲇᲈᛲ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxhss/ᛴᲇᲈᛲ;

    .line 10
    .line 11
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᛴᲇᲈᛲ;->ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lxhss/ᛲᛸᲁᲇ;

    .line 6
    .line 7
    iget v2, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛴᛶᛳ:I

    .line 8
    .line 9
    iget-object v3, v0, Lxhss/ᛴᲇᲈᛲ;->ᲈᛳᲀ:Ljava/lang/String;

    .line 10
    .line 11
    const-wide v6, -0xfd181b858845L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iget-object v8, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛷᲈᲈ:Landroid/content/Context;

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-ne v2, v9, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lxhss/ᛴᲇᲈᛲ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 26
    .line 27
    iget-object v2, v0, Lxhss/ᛴᲇᲈᛲ;->ᲇᛶᛴᲀ:Ljava/io/File;

    .line 28
    .line 29
    iget-object v12, v0, Lxhss/ᛴᲇᲈᛲ;->ᛷᛴᛷᛱ:Ljava/io/File;

    .line 30
    .line 31
    :try_start_0
    invoke-static/range {p1 .. p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    move-object v5, v1

    .line 35
    const-wide v16, -0xfd201b858845L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move-object/from16 v1, p1

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object v5, v1

    .line 46
    const-wide v16, -0xfd201b858845L

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    :goto_0
    move-object v1, v0

    .line 52
    goto/16 :goto_15

    .line 53
    .line 54
    :catch_0
    move-exception v0

    .line 55
    const-wide v16, -0xfd201b858845L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    goto/16 :goto_12

    .line 61
    .line 62
    :cond_0
    const-wide v0, -0x770e1b858845L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v11

    .line 75
    :cond_1
    invoke-static/range {p1 .. p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v12

    .line 87
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const/16 v12, 0x5f

    .line 91
    .line 92
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v12, Ljava/io/File;

    .line 107
    .line 108
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    new-instance v14, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-wide v15, -0x763e1b858845L

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static/range {v15 .. v16}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    sget-object v15, Lxhss/ᛲᛱᲇᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛳᛴᲁ;

    .line 130
    .line 131
    const-wide v15, -0x492f1b858845L

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static/range {v15 .. v16}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    sget-object v15, Lxhss/ᛲᛱᲇᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛳᛴᲁ;

    .line 140
    .line 141
    iget-object v15, v15, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v15, Ljava/util/regex/Pattern;

    .line 144
    .line 145
    invoke-virtual {v15, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    invoke-virtual {v15, v10}, Ljava/util/regex/Matcher;->find(I)Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    if-nez v16, :cond_2

    .line 154
    .line 155
    move-object v4, v11

    .line 156
    const-wide v16, -0xfd201b858845L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    const-wide v16, -0xfd201b858845L

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    new-instance v4, Lxhss/ᛷᛱᛳᲁ;

    .line 168
    .line 169
    invoke-direct {v4, v15}, Lxhss/ᛷᛱᛳᲁ;-><init>(Ljava/util/regex/Matcher;)V

    .line 170
    .line 171
    .line 172
    :goto_1
    if-eqz v4, :cond_3

    .line 173
    .line 174
    iget-object v4, v4, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Ljava/util/regex/Matcher;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 183
    .line 184
    const-wide v18, -0x49381b858845L

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const-wide v18, -0x493b1b858845L

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_3
    move-object v4, v11

    .line 206
    :goto_2
    if-eqz v4, :cond_9

    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    sparse-switch v5, :sswitch_data_0

    .line 213
    .line 214
    .line 215
    goto/16 :goto_3

    .line 216
    .line 217
    :sswitch_0
    const-wide v18, -0x49631b858845L

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-nez v4, :cond_4

    .line 231
    .line 232
    goto/16 :goto_3

    .line 233
    .line 234
    :cond_4
    const-wide v4, -0x497e1b858845L

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    goto/16 :goto_4

    .line 244
    .line 245
    :sswitch_1
    const-wide v18, -0x49591b858845L

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_8

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :sswitch_2
    const-wide v18, -0x495e1b858845L

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-nez v4, :cond_5

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_5
    const-wide v4, -0x49681b858845L

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    goto :goto_4

    .line 287
    :sswitch_3
    const-wide v18, -0x49501b858845L

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-nez v4, :cond_6

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_6
    const-wide v4, -0x496e1b858845L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    goto :goto_4

    .line 313
    :sswitch_4
    const-wide v18, -0x49551b858845L

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-nez v4, :cond_7

    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_7
    const-wide v4, -0x49791b858845L

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    goto :goto_4

    .line 339
    :sswitch_5
    const-wide v18, -0x494c1b858845L

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-nez v4, :cond_8

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_8
    const-wide v4, -0x49741b858845L

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    goto :goto_4

    .line 365
    :cond_9
    :goto_3
    const-wide v4, -0x49841b858845L

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    :goto_4
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-direct {v12, v13, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    new-instance v4, Ljava/io/File;

    .line 385
    .line 386
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    new-instance v13, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    const-wide v14, -0x76551b858845L

    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    invoke-static {v14, v15}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v14

    .line 401
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-wide v14, -0x76651b858845L

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    invoke-static {v14, v15}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v14

    .line 416
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v13

    .line 423
    invoke-direct {v4, v5, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    new-instance v5, Ljava/io/File;

    .line 427
    .line 428
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 429
    .line 430
    .line 431
    move-result-object v13

    .line 432
    new-instance v14, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    const-wide v18, -0x766a1b858845L

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v15

    .line 443
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-wide v18, -0x767a1b858845L

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-direct {v5, v13, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :try_start_1
    new-instance v2, Lxhss/ᲇᛳᲇᛶ;

    .line 469
    .line 470
    invoke-direct {v2, v3, v12, v11, v10}, Lxhss/ᲇᛳᲇᛶ;-><init>(Ljava/lang/String;Ljava/io/File;Lxhss/ᛱᛴᛶᛴ;I)V

    .line 471
    .line 472
    .line 473
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛸᲁᲇ;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛲᛳᛲᛷ;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    new-instance v13, Lxhss/ᲇᛳᲇᛶ;

    .line 478
    .line 479
    iget-object v14, v0, Lxhss/ᛴᲇᲈᛲ;->ᛷᲁᲁ:Ljava/lang/String;

    .line 480
    .line 481
    invoke-direct {v13, v14, v5, v11, v9}, Lxhss/ᲇᛳᲇᛶ;-><init>(Ljava/lang/String;Ljava/io/File;Lxhss/ᛱᛴᛶᛴ;I)V

    .line 482
    .line 483
    .line 484
    invoke-static {v1, v13}, Lxhss/ᛸᛶᛳᛷ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛸᲁᲇ;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛲᛳᛲᛷ;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    filled-new-array {v2, v1}, [Lxhss/ᛲᛳᛲᛷ;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    iput-object v11, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 493
    .line 494
    iput-object v12, v0, Lxhss/ᛴᲇᲈᛲ;->ᛷᛴᛷᛱ:Ljava/io/File;

    .line 495
    .line 496
    iput-object v4, v0, Lxhss/ᛴᲇᲈᛲ;->ᲇᛶᛴᲀ:Ljava/io/File;

    .line 497
    .line 498
    iput-object v5, v0, Lxhss/ᛴᲇᲈᛲ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 499
    .line 500
    iput v9, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛴᛶᛳ:I

    .line 501
    .line 502
    invoke-static {v1, v0}, Lxhss/ᛱᛱᛷᛸ;->ᛱᛱᛲᲇ([Lxhss/ᛲᛳᛲᛷ;Lxhss/ᛴᲇᲈᛲ;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 506
    sget-object v2, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 507
    .line 508
    if-ne v1, v2, :cond_a

    .line 509
    .line 510
    return-object v2

    .line 511
    :cond_a
    move-object v2, v4

    .line 512
    :goto_5
    :try_start_2
    check-cast v1, Ljava/util/List;

    .line 513
    .line 514
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    check-cast v4, Lxhss/ᛷᛸᲈᛸ;

    .line 519
    .line 520
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, Lxhss/ᛷᛸᲈᛸ;

    .line 525
    .line 526
    iget-object v13, v4, Lxhss/ᛷᛸᲈᛸ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v13, Ljava/lang/String;

    .line 529
    .line 530
    iget-object v14, v1, Lxhss/ᛷᛸᲈᛸ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v14, Ljava/lang/String;

    .line 533
    .line 534
    iget-object v4, v4, Lxhss/ᛷᛸᲈᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v4, Ljava/lang/Boolean;

    .line 537
    .line 538
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    if-eqz v4, :cond_18

    .line 543
    .line 544
    iget-object v1, v1, Lxhss/ᛷᛸᲈᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v1, Ljava/lang/Boolean;

    .line 547
    .line 548
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-eqz v1, :cond_18

    .line 553
    .line 554
    if-eqz v13, :cond_18

    .line 555
    .line 556
    invoke-static {v13}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_b

    .line 561
    .line 562
    goto/16 :goto_11

    .line 563
    .line 564
    :cond_b
    if-eqz v14, :cond_18

    .line 565
    .line 566
    invoke-static {v14}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 567
    .line 568
    .line 569
    move-result v1

    .line 570
    if-eqz v1, :cond_c

    .line 571
    .line 572
    goto/16 :goto_11

    .line 573
    .line 574
    :cond_c
    new-instance v1, Ljava/io/File;

    .line 575
    .line 576
    invoke-direct {v1, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v1, v2}, Lxhss/ᛳᛴᲀᲁ;->ᛸᛴᛶᛳ(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    if-nez v1, :cond_d

    .line 584
    .line 585
    invoke-static {v3, v2}, Lxhss/ᛳᛴᲀᲁ;->ᛷᛴᛷᛱ(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    if-nez v1, :cond_d

    .line 590
    .line 591
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 592
    .line 593
    :try_start_3
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 600
    .line 601
    .line 602
    return-object v1

    .line 603
    :catch_1
    move-exception v0

    .line 604
    const-wide v2, -0x76881b858845L

    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    :goto_6
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 620
    .line 621
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-static {v2, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 625
    .line 626
    .line 627
    return-object v1

    .line 628
    :catchall_1
    move-exception v0

    .line 629
    goto/16 :goto_0

    .line 630
    .line 631
    :catch_2
    move-exception v0

    .line 632
    :goto_7
    move-object v1, v5

    .line 633
    goto/16 :goto_12

    .line 634
    .line 635
    :cond_d
    :try_start_4
    instance-of v3, v8, Landroid/view/ContextThemeWrapper;

    .line 636
    .line 637
    if-eqz v3, :cond_e

    .line 638
    .line 639
    move-object v3, v8

    .line 640
    check-cast v3, Landroid/view/ContextThemeWrapper;

    .line 641
    .line 642
    goto :goto_8

    .line 643
    :cond_e
    move-object v3, v11

    .line 644
    :goto_8
    if-eqz v3, :cond_f

    .line 645
    .line 646
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    if-nez v3, :cond_10

    .line 651
    .line 652
    :cond_f
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    :cond_10
    sget-object v4, Lxhss/ᛶᲈᛴᛲ;->ᛸᛶᲈᛶ:Ljava/lang/reflect/Method;

    .line 657
    .line 658
    if-eqz v4, :cond_11

    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v13

    .line 664
    filled-new-array {v3, v13}, [Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    invoke-virtual {v4, v11, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    goto :goto_9

    .line 673
    :cond_11
    move-object v3, v11

    .line 674
    :goto_9
    new-instance v4, Ljava/io/FileInputStream;

    .line 675
    .line 676
    new-instance v13, Ljava/io/File;

    .line 677
    .line 678
    invoke-direct {v13, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-direct {v4, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 682
    .line 683
    .line 684
    iget-object v0, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛶᲈᛶ:Ljava/io/File;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 685
    .line 686
    if-eqz v3, :cond_12

    .line 687
    .line 688
    :try_start_5
    sget v13, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 689
    .line 690
    invoke-static {v3}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 691
    .line 692
    .line 693
    move-result-object v3

    .line 694
    iget-object v13, v3, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v13, Lxhss/ᛸᛵᲇᲈ;

    .line 697
    .line 698
    const/4 v14, 0x2

    .line 699
    iput v14, v13, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 700
    .line 701
    invoke-virtual {v3}, Lxhss/ᲇᛵᛲᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    const-wide v13, -0x76911b858845L

    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v13

    .line 714
    iput-object v13, v3, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 715
    .line 716
    invoke-virtual {v3}, Lxhss/ᛷᛴᲀᛳ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    invoke-static {v3}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    check-cast v3, Lxhss/ᛲᲀᛱ;

    .line 725
    .line 726
    if-eqz v3, :cond_12

    .line 727
    .line 728
    const-wide v13, -0x769e1b858845L

    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v11

    .line 737
    new-instance v13, Ljava/lang/Long;

    .line 738
    .line 739
    const-wide/16 v14, 0x0

    .line 740
    .line 741
    invoke-direct {v13, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 742
    .line 743
    .line 744
    const-wide v14, -0x76a81b858845L

    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    invoke-static {v14, v15}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v14

    .line 753
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 754
    .line 755
    filled-new-array {v4, v11, v13, v14, v15}, [Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v11

    .line 759
    invoke-virtual {v3}, Lxhss/ᛶᛵᛱ;->ᲁᛴᲇᛲ()V

    .line 760
    .line 761
    .line 762
    iget-object v13, v3, Lxhss/ᛲᲀᛱ;->ᛷᛴᛷᛱ:Ljava/lang/reflect/Method;

    .line 763
    .line 764
    iget-object v3, v3, Lxhss/ᛶᛸᲇᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 765
    .line 766
    const/4 v14, 0x5

    .line 767
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v11

    .line 771
    invoke-virtual {v13, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v11

    .line 775
    goto :goto_b

    .line 776
    :goto_a
    move-object v1, v0

    .line 777
    goto/16 :goto_10

    .line 778
    .line 779
    :catchall_2
    move-exception v0

    .line 780
    goto :goto_a

    .line 781
    :cond_12
    :goto_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 782
    .line 783
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 784
    .line 785
    .line 786
    const-wide v13, -0x76ac1b858845L

    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v13

    .line 795
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    const-wide v13, -0xfd001b858845L

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    const-wide v13, -0xfce91b858845L

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 822
    .line 823
    .line 824
    move-result v13

    .line 825
    if-nez v13, :cond_13

    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_13
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 829
    .line 830
    .line 831
    move-result v13

    .line 832
    move v14, v10

    .line 833
    :goto_c
    if-ge v14, v13, :cond_15

    .line 834
    .line 835
    add-int/lit16 v15, v14, 0x7d0

    .line 836
    .line 837
    if-le v15, v13, :cond_14

    .line 838
    .line 839
    move v15, v13

    .line 840
    :cond_14
    invoke-virtual {v3, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v14

    .line 844
    const-wide v18, -0xfcf11b858845L

    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    sget-object v18, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 853
    .line 854
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-static {v14}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    move v14, v15

    .line 861
    goto :goto_c

    .line 862
    :cond_15
    :goto_d
    new-instance v3, Ljava/lang/Integer;

    .line 863
    .line 864
    invoke-direct {v3, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 865
    .line 866
    .line 867
    invoke-static {v11, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    if-eqz v3, :cond_17

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    if-eqz v3, :cond_16

    .line 878
    .line 879
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 880
    .line 881
    .line 882
    :cond_16
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 883
    .line 884
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    const-wide v13, -0x76b41b858845L

    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v11

    .line 900
    const-wide v13, -0x76c91b858845L

    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    invoke-static {v13, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    invoke-static {v1, v11}, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-static {v8, v0}, Lxhss/ᲇᲁᛱᛸ;->ᛲᛴᲀᲈ(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 919
    .line 920
    .line 921
    goto :goto_e

    .line 922
    :cond_17
    move v9, v10

    .line 923
    :goto_e
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 924
    .line 925
    .line 926
    :try_start_7
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 927
    .line 928
    .line 929
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 933
    .line 934
    .line 935
    goto :goto_f

    .line 936
    :catch_3
    move-exception v0

    .line 937
    const-wide v1, -0x76de1b858845L

    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 953
    .line 954
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    .line 956
    .line 957
    invoke-static {v1, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 958
    .line 959
    .line 960
    :goto_f
    move v10, v9

    .line 961
    goto :goto_13

    .line 962
    :goto_10
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 963
    :catchall_3
    move-exception v0

    .line 964
    :try_start_9
    invoke-static {v4, v1}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 965
    .line 966
    .line 967
    throw v0

    .line 968
    :cond_18
    :goto_11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 969
    .line 970
    :try_start_a
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    .line 977
    .line 978
    .line 979
    return-object v1

    .line 980
    :catch_4
    move-exception v0

    .line 981
    const-wide v2, -0x767f1b858845L

    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    goto/16 :goto_6

    .line 987
    .line 988
    :catchall_4
    move-exception v0

    .line 989
    move-object v1, v0

    .line 990
    move-object v2, v4

    .line 991
    goto :goto_15

    .line 992
    :catch_5
    move-exception v0

    .line 993
    move-object v2, v4

    .line 994
    goto/16 :goto_7

    .line 995
    .line 996
    :goto_12
    const-wide v3, -0x76e71b858845L

    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    :try_start_b
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    sget-object v4, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1012
    .line 1013
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-static {v3, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1017
    .line 1018
    .line 1019
    :try_start_c
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    .line 1026
    .line 1027
    .line 1028
    goto :goto_13

    .line 1029
    :catch_6
    move-exception v0

    .line 1030
    const-wide v1, -0x76fc1b858845L

    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1046
    .line 1047
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    invoke-static {v1, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1051
    .line 1052
    .line 1053
    :goto_13
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    return-object v0

    .line 1058
    :goto_14
    move-object v5, v1

    .line 1059
    goto/16 :goto_0

    .line 1060
    .line 1061
    :catchall_5
    move-exception v0

    .line 1062
    goto :goto_14

    .line 1063
    :goto_15
    :try_start_d
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    .line 1070
    .line 1071
    .line 1072
    goto :goto_16

    .line 1073
    :catch_7
    move-exception v0

    .line 1074
    const-wide v2, -0x77051b858845L

    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 1090
    .line 1091
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    invoke-static {v2, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1095
    .line 1096
    .line 1097
    :goto_16
    throw v1

    .line 1098
    nop

    .line 1099
    :sswitch_data_0
    .sparse-switch
        0x19be1 -> :sswitch_5
        0x1b229 -> :sswitch_4
        0x30ced7 -> :sswitch_3
        0x30ceda -> :sswitch_2
        0x31e068 -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
    .locals 6

    .line 1
    new-instance v0, Lxhss/ᛴᲇᲈᛲ;

    .line 2
    .line 3
    iget-object v3, p0, Lxhss/ᛴᲇᲈᛲ;->ᛷᲁᲁ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v4, p0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛶᲈᛶ:Ljava/io/File;

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛷᲈᲈ:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛴᲇᲈᛲ;->ᲈᛳᲀ:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lxhss/ᛴᲇᲈᛲ;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lxhss/ᛱᛴᛶᛴ;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lxhss/ᛴᲇᲈᛲ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method
