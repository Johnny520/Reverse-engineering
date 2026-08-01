.class public abstract Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "SILENT_MARKER_INSERTION_ENABLED"

    .line 15
    .line 16
    const-string v2, "false"

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "true"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sput-boolean v0, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 31
    .line 32
    sget-object v0, Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;->ALLOW_SINGULAR_OVERWRITES:Lcom/google/protobuf/TextFormat$Parser$SingularOverwritePolicy;

    .line 33
    .line 34
    sget v0, Lcom/google/protobuf/飘花落叶言苏子世兰楪哲;->飘花落叶言子楪世苏哲兰:I

    .line 35
    .line 36
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏子世哲兰楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子世兰楪哲;

    .line 37
    .line 38
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/google/protobuf/ByteString;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v1, v0, [B

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ge v3, v5, :cond_1b

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/16 v6, 0x5c

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-ne v5, v6, :cond_1a

    .line 32
    .line 33
    add-int/lit8 v5, v3, 0x1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-ge v5, v8, :cond_19

    .line 40
    .line 41
    invoke-virtual {p0, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const/16 v9, 0x30

    .line 46
    .line 47
    if-gt v9, v8, :cond_2

    .line 48
    .line 49
    const/16 v10, 0x37

    .line 50
    .line 51
    if-gt v8, v10, :cond_2

    .line 52
    .line 53
    invoke-static {v8}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    add-int/lit8 v3, v3, 0x2

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-ge v3, v8, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-gt v9, v8, :cond_0

    .line 70
    .line 71
    if-gt v8, v10, :cond_0

    .line 72
    .line 73
    mul-int/lit8 v6, v6, 0x8

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    add-int/2addr v6, v5

    .line 84
    move v5, v3

    .line 85
    :cond_0
    add-int/lit8 v3, v5, 0x1

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-ge v3, v8, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-gt v9, v8, :cond_1

    .line 98
    .line 99
    if-gt v8, v10, :cond_1

    .line 100
    .line 101
    mul-int/lit8 v6, v6, 0x8

    .line 102
    .line 103
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    add-int/2addr v6, v5

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    move v3, v5

    .line 114
    :goto_1
    add-int/lit8 v5, v4, 0x1

    .line 115
    .line 116
    int-to-byte v6, v6

    .line 117
    aput-byte v6, v1, v4

    .line 118
    .line 119
    :goto_2
    move v4, v5

    .line 120
    goto/16 :goto_9

    .line 121
    .line 122
    :cond_2
    const/16 v9, 0x22

    .line 123
    .line 124
    if-eq v8, v9, :cond_18

    .line 125
    .line 126
    const/16 v9, 0x27

    .line 127
    .line 128
    if-eq v8, v9, :cond_17

    .line 129
    .line 130
    const/16 v10, 0x3f

    .line 131
    .line 132
    if-eq v8, v10, :cond_16

    .line 133
    .line 134
    const/16 v10, 0x55

    .line 135
    .line 136
    if-eq v8, v10, :cond_f

    .line 137
    .line 138
    if-eq v8, v6, :cond_e

    .line 139
    .line 140
    const/16 v6, 0x66

    .line 141
    .line 142
    const/16 v10, 0xc

    .line 143
    .line 144
    if-eq v8, v6, :cond_d

    .line 145
    .line 146
    const/16 v6, 0x6e

    .line 147
    .line 148
    if-eq v8, v6, :cond_c

    .line 149
    .line 150
    const/16 v6, 0x72

    .line 151
    .line 152
    if-eq v8, v6, :cond_b

    .line 153
    .line 154
    const/16 v6, 0x78

    .line 155
    .line 156
    if-eq v8, v6, :cond_8

    .line 157
    .line 158
    const/16 v6, 0x61

    .line 159
    .line 160
    if-eq v8, v6, :cond_7

    .line 161
    .line 162
    const/16 v6, 0x62

    .line 163
    .line 164
    const/16 v11, 0x8

    .line 165
    .line 166
    if-eq v8, v6, :cond_6

    .line 167
    .line 168
    packed-switch v8, :pswitch_data_0

    .line 169
    .line 170
    .line 171
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 172
    .line 173
    int-to-char v0, v8

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v2, "Invalid escape sequence: \'\\"

    .line 177
    .line 178
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p0

    .line 195
    :pswitch_0
    add-int/lit8 v3, v4, 0x1

    .line 196
    .line 197
    const/16 v6, 0xb

    .line 198
    .line 199
    aput-byte v6, v1, v4

    .line 200
    .line 201
    :goto_3
    move v4, v3

    .line 202
    move v3, v5

    .line 203
    goto/16 :goto_9

    .line 204
    .line 205
    :pswitch_1
    add-int/lit8 v5, v3, 0x2

    .line 206
    .line 207
    add-int/lit8 v6, v3, 0x5

    .line 208
    .line 209
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-ge v6, v8, :cond_5

    .line 214
    .line 215
    invoke-virtual {p0, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    invoke-static {v8}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eqz v8, :cond_5

    .line 224
    .line 225
    add-int/lit8 v8, v3, 0x3

    .line 226
    .line 227
    invoke-virtual {p0, v8}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    invoke-static {v9}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_5

    .line 236
    .line 237
    add-int/lit8 v3, v3, 0x4

    .line 238
    .line 239
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    invoke-static {v9}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_5

    .line 248
    .line 249
    invoke-virtual {p0, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    invoke-static {v9}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-eqz v9, :cond_5

    .line 258
    .line 259
    invoke-virtual {p0, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    shl-int/2addr v5, v10

    .line 268
    invoke-virtual {p0, v8}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    invoke-static {v8}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    shl-int/2addr v8, v11

    .line 277
    or-int/2addr v5, v8

    .line 278
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    shl-int/lit8 v3, v3, 0x4

    .line 287
    .line 288
    or-int/2addr v3, v5

    .line 289
    invoke-virtual {p0, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    or-int/2addr v3, v5

    .line 298
    int-to-char v3, v3

    .line 299
    const v5, 0xd800

    .line 300
    .line 301
    .line 302
    if-lt v3, v5, :cond_4

    .line 303
    .line 304
    const v5, 0xdfff

    .line 305
    .line 306
    .line 307
    if-le v3, v5, :cond_3

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_3
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 311
    .line 312
    const-string v0, "Invalid escape sequence: \'\\u\' refers to a surrogate"

    .line 313
    .line 314
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw p0

    .line 318
    :cond_4
    :goto_4
    invoke-static {v3}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 323
    .line 324
    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    array-length v5, v3

    .line 329
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 330
    .line 331
    .line 332
    array-length v3, v3

    .line 333
    :goto_5
    add-int/2addr v4, v3

    .line 334
    move v3, v6

    .line 335
    goto/16 :goto_9

    .line 336
    .line 337
    :cond_5
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 338
    .line 339
    const-string v0, "Invalid escape sequence: \'\\u\' with too few hex chars"

    .line 340
    .line 341
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw p0

    .line 345
    :pswitch_2
    add-int/lit8 v3, v4, 0x1

    .line 346
    .line 347
    const/16 v6, 0x9

    .line 348
    .line 349
    aput-byte v6, v1, v4

    .line 350
    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :cond_6
    add-int/lit8 v3, v4, 0x1

    .line 354
    .line 355
    aput-byte v11, v1, v4

    .line 356
    .line 357
    goto/16 :goto_3

    .line 358
    .line 359
    :cond_7
    add-int/lit8 v3, v4, 0x1

    .line 360
    .line 361
    const/4 v6, 0x7

    .line 362
    aput-byte v6, v1, v4

    .line 363
    .line 364
    goto/16 :goto_3

    .line 365
    .line 366
    :cond_8
    add-int/lit8 v5, v3, 0x2

    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-ge v5, v6, :cond_a

    .line 373
    .line 374
    invoke-virtual {p0, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-static {v6}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-eqz v6, :cond_a

    .line 383
    .line 384
    invoke-virtual {p0, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-static {v6}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    add-int/lit8 v3, v3, 0x3

    .line 393
    .line 394
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-ge v3, v8, :cond_9

    .line 399
    .line 400
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    invoke-static {v8}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    if-eqz v8, :cond_9

    .line 409
    .line 410
    mul-int/lit8 v6, v6, 0x10

    .line 411
    .line 412
    invoke-virtual {p0, v3}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    invoke-static {v5}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    add-int/2addr v6, v5

    .line 421
    goto :goto_6

    .line 422
    :cond_9
    move v3, v5

    .line 423
    :goto_6
    add-int/lit8 v5, v4, 0x1

    .line 424
    .line 425
    int-to-byte v6, v6

    .line 426
    aput-byte v6, v1, v4

    .line 427
    .line 428
    goto/16 :goto_2

    .line 429
    .line 430
    :cond_a
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 431
    .line 432
    const-string v0, "Invalid escape sequence: \'\\x\' with no digits"

    .line 433
    .line 434
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw p0

    .line 438
    :cond_b
    add-int/lit8 v3, v4, 0x1

    .line 439
    .line 440
    const/16 v6, 0xd

    .line 441
    .line 442
    aput-byte v6, v1, v4

    .line 443
    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :cond_c
    add-int/lit8 v3, v4, 0x1

    .line 447
    .line 448
    const/16 v6, 0xa

    .line 449
    .line 450
    aput-byte v6, v1, v4

    .line 451
    .line 452
    goto/16 :goto_3

    .line 453
    .line 454
    :cond_d
    add-int/lit8 v3, v4, 0x1

    .line 455
    .line 456
    aput-byte v10, v1, v4

    .line 457
    .line 458
    goto/16 :goto_3

    .line 459
    .line 460
    :cond_e
    add-int/lit8 v3, v4, 0x1

    .line 461
    .line 462
    aput-byte v6, v1, v4

    .line 463
    .line 464
    goto/16 :goto_3

    .line 465
    .line 466
    :cond_f
    add-int/lit8 v5, v3, 0x2

    .line 467
    .line 468
    add-int/lit8 v6, v3, 0x9

    .line 469
    .line 470
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    const-string v9, "Invalid escape sequence: \'\\U\' with too few hex chars"

    .line 475
    .line 476
    if-ge v6, v8, :cond_15

    .line 477
    .line 478
    move v10, v2

    .line 479
    move v8, v5

    .line 480
    :goto_7
    add-int/lit8 v11, v3, 0xa

    .line 481
    .line 482
    if-ge v8, v11, :cond_11

    .line 483
    .line 484
    invoke-virtual {p0, v8}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    invoke-static {v11}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏兰哲(B)Z

    .line 489
    .line 490
    .line 491
    move-result v12

    .line 492
    if-eqz v12, :cond_10

    .line 493
    .line 494
    shl-int/lit8 v10, v10, 0x4

    .line 495
    .line 496
    invoke-static {v11}, Lcom/google/protobuf/飘花落叶言苏子楪哲世兰;->飘花落叶言子楪世苏哲兰(B)I

    .line 497
    .line 498
    .line 499
    move-result v11

    .line 500
    or-int/2addr v10, v11

    .line 501
    add-int/lit8 v8, v8, 0x1

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_10
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 505
    .line 506
    invoke-direct {p0, v9}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    throw p0

    .line 510
    :cond_11
    invoke-static {v10}, Ljava/lang/Character;->isValidCodePoint(I)Z

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    const-string v8, "Invalid escape sequence: \'\\U"

    .line 515
    .line 516
    if-eqz v3, :cond_14

    .line 517
    .line 518
    invoke-static {v10}, Ljava/lang/Character$UnicodeBlock;->of(I)Ljava/lang/Character$UnicodeBlock;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    if-eqz v3, :cond_13

    .line 523
    .line 524
    sget-object v9, Ljava/lang/Character$UnicodeBlock;->LOW_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 525
    .line 526
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v9

    .line 530
    if-nez v9, :cond_12

    .line 531
    .line 532
    sget-object v9, Ljava/lang/Character$UnicodeBlock;->HIGH_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 533
    .line 534
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v9

    .line 538
    if-nez v9, :cond_12

    .line 539
    .line 540
    sget-object v9, Ljava/lang/Character$UnicodeBlock;->HIGH_PRIVATE_USE_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 541
    .line 542
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    if-nez v3, :cond_12

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_12
    new-instance v0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 550
    .line 551
    invoke-virtual {p0, v5, v11}, Lcom/google/protobuf/ByteString;->substring(II)Lcom/google/protobuf/ByteString;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    new-instance v1, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    const-string p0, "\' refers to a surrogate code unit"

    .line 568
    .line 569
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    invoke-direct {v0, p0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    throw v0

    .line 580
    :cond_13
    :goto_8
    filled-new-array {v10}, [I

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    new-instance v5, Ljava/lang/String;

    .line 585
    .line 586
    invoke-direct {v5, v3, v2, v7}, Ljava/lang/String;-><init>([III)V

    .line 587
    .line 588
    .line 589
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 590
    .line 591
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    array-length v5, v3

    .line 596
    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 597
    .line 598
    .line 599
    array-length v3, v3

    .line 600
    goto/16 :goto_5

    .line 601
    .line 602
    :cond_14
    new-instance v0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 603
    .line 604
    invoke-virtual {p0, v5, v11}, Lcom/google/protobuf/ByteString;->substring(II)Lcom/google/protobuf/ByteString;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    new-instance v1, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-string p0, "\' is not a valid code point value"

    .line 621
    .line 622
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    invoke-direct {v0, p0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    throw v0

    .line 633
    :cond_15
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 634
    .line 635
    invoke-direct {p0, v9}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    throw p0

    .line 639
    :cond_16
    add-int/lit8 v3, v4, 0x1

    .line 640
    .line 641
    aput-byte v10, v1, v4

    .line 642
    .line 643
    goto/16 :goto_3

    .line 644
    .line 645
    :cond_17
    add-int/lit8 v3, v4, 0x1

    .line 646
    .line 647
    aput-byte v9, v1, v4

    .line 648
    .line 649
    goto/16 :goto_3

    .line 650
    .line 651
    :cond_18
    add-int/lit8 v3, v4, 0x1

    .line 652
    .line 653
    aput-byte v9, v1, v4

    .line 654
    .line 655
    goto/16 :goto_3

    .line 656
    .line 657
    :cond_19
    new-instance p0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    .line 658
    .line 659
    const-string v0, "Invalid escape sequence: \'\\\' at end of string."

    .line 660
    .line 661
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    throw p0

    .line 665
    :cond_1a
    add-int/lit8 v6, v4, 0x1

    .line 666
    .line 667
    aput-byte v5, v1, v4

    .line 668
    .line 669
    move v4, v6

    .line 670
    :goto_9
    add-int/2addr v3, v7

    .line 671
    goto/16 :goto_0

    .line 672
    .line 673
    :cond_1b
    if-ne v0, v4, :cond_1c

    .line 674
    .line 675
    invoke-static {v1}, Lcom/google/protobuf/ByteString;->wrap([B)Lcom/google/protobuf/ByteString;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    return-object p0

    .line 680
    :cond_1c
    invoke-static {v1, v2, v4}, Lcom/google/protobuf/ByteString;->copyFrom([BII)Lcom/google/protobuf/ByteString;

    .line 681
    .line 682
    .line 683
    move-result-object p0

    .line 684
    return-object p0

    .line 685
    :pswitch_data_0
    .packed-switch 0x74
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;ZZ)J
    .locals 7

    .line 1
    const-string v0, "-"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    :cond_0
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 16
    .line 17
    const-string p2, "Number must be positive: "

    .line 18
    .line 19
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :goto_0
    const-string v2, "0x"

    .line 28
    .line 29
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x10

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v2, "0"

    .line 42
    .line 43
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    const/16 v2, 0x8

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v2, 0xa

    .line 53
    .line 54
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const-string v5, "Number out of range for 32-bit unsigned integer: "

    .line 63
    .line 64
    const-string v6, "Number out of range for 32-bit signed integer: "

    .line 65
    .line 66
    if-ge v4, v3, :cond_9

    .line 67
    .line 68
    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    neg-long v1, v1

    .line 75
    :cond_4
    if-nez p2, :cond_8

    .line 76
    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    const-wide/32 p1, 0x7fffffff

    .line 80
    .line 81
    .line 82
    cmp-long p1, v1, p1

    .line 83
    .line 84
    if-gtz p1, :cond_5

    .line 85
    .line 86
    const-wide/32 p1, -0x80000000

    .line 87
    .line 88
    .line 89
    cmp-long p1, v1, p1

    .line 90
    .line 91
    if-ltz p1, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 95
    .line 96
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_6
    const-wide p1, 0x100000000L

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    cmp-long p1, v1, p1

    .line 110
    .line 111
    if-gez p1, :cond_7

    .line 112
    .line 113
    const-wide/16 p1, 0x0

    .line 114
    .line 115
    cmp-long p1, v1, p1

    .line 116
    .line 117
    if-ltz p1, :cond_7

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 121
    .line 122
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_8
    :goto_2
    return-wide v1

    .line 131
    :cond_9
    new-instance v3, Ljava/math/BigInteger;

    .line 132
    .line 133
    invoke-direct {v3, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    :cond_a
    if-nez p2, :cond_e

    .line 143
    .line 144
    if-eqz p1, :cond_c

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    const/16 p2, 0x1f

    .line 151
    .line 152
    if-gt p1, p2, :cond_b

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 156
    .line 157
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_c
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    const/16 p2, 0x20

    .line 170
    .line 171
    if-gt p1, p2, :cond_d

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_d
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 175
    .line 176
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_e
    if-eqz p1, :cond_10

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    const/16 p2, 0x3f

    .line 191
    .line 192
    if-gt p1, p2, :cond_f

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_f
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 196
    .line 197
    const-string p2, "Number out of range for 64-bit signed integer: "

    .line 198
    .line 199
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1

    .line 207
    :cond_10
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    const/16 p2, 0x40

    .line 212
    .line 213
    if-gt p1, p2, :cond_11

    .line 214
    .line 215
    :goto_3
    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide p0

    .line 219
    return-wide p0

    .line 220
    :cond_11
    new-instance p1, Ljava/lang/NumberFormatException;

    .line 221
    .line 222
    const-string p2, "Number out of range for 64-bit unsigned integer: "

    .line 223
    .line 224
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p1
.end method

.method public static 飘花落叶言子楪世苏兰哲(B)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x61

    .line 10
    .line 11
    if-gt v0, p0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x66

    .line 14
    .line 15
    if-le p0, v0, :cond_2

    .line 16
    .line 17
    :cond_1
    const/16 v0, 0x41

    .line 18
    .line 19
    if-gt v0, p0, :cond_3

    .line 20
    .line 21
    const/16 v0, 0x46

    .line 22
    .line 23
    if-gt p0, v0, :cond_3

    .line 24
    .line 25
    :cond_2
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_3
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(B)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x39

    .line 6
    .line 7
    if-gt p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x7a

    .line 16
    .line 17
    if-gt p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    add-int/lit8 p0, p0, -0x37

    .line 23
    .line 24
    return p0
.end method
