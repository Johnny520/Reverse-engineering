.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:[Ljava/math/BigInteger;

.field public static final 飘花落叶言子楪世兰苏哲:[J

.field public static final 飘花落叶言子楪世哲兰苏:[J

.field public static final 飘花落叶言子楪世哲苏兰:[D

.field public static final 飘花落叶言子楪世苏兰哲:[D

.field public static final 飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

.field public static final 飘花落叶言子楪苏世兰哲:[[C

.field public static final 飘花落叶言子楪苏世哲兰:[[C

.field public static final 飘花落叶言子楪苏哲世兰:[I

.field public static final 飘花落叶言子楪苏哲兰世:[S


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-class v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v0, v0, v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-class v0, Ljava/lang/Math;

    .line 28
    .line 29
    const-string v3, "multiplyHigh"

    .line 30
    .line 31
    invoke-virtual {v2, v0, v3, v5}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v3, "multiplyHigh"

    .line 36
    .line 37
    const-class v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    move-object v7, v5

    .line 44
    invoke-static/range {v2 .. v7}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 53
    .line 54
    .line 55
    .line 56
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 59
    :goto_0
    if-nez v0, :cond_1

    .line 60
    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    :cond_1
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 67
    .line 68
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    const-string v2, "Infinity"

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰([BI)J

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x4

    .line 88
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 89
    .line 90
    .line 91
    const/16 v0, 0x145

    .line 92
    .line 93
    new-array v2, v0, [D

    .line 94
    .line 95
    sput-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:[D

    .line 96
    .line 97
    new-array v4, v0, [D

    .line 98
    .line 99
    sput-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:[D

    .line 100
    .line 101
    const/16 v4, 0x13

    .line 102
    .line 103
    new-array v4, v4, [J

    .line 104
    .line 105
    fill-array-data v4, :array_0

    .line 106
    .line 107
    .line 108
    sput-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏:[J

    .line 109
    .line 110
    const/16 v4, 0x1b

    .line 111
    .line 112
    new-array v4, v4, [J

    .line 113
    .line 114
    sput-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:[J

    .line 115
    .line 116
    const/16 v4, 0x157

    .line 117
    .line 118
    new-array v4, v4, [Ljava/math/BigInteger;

    .line 119
    .line 120
    sput-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏:[Ljava/math/BigInteger;

    .line 121
    .line 122
    array-length v2, v2

    .line 123
    move v4, v3

    .line 124
    :goto_1
    const-string v5, "1.0E-"

    .line 125
    .line 126
    const-string v6, "1.0E"

    .line 127
    .line 128
    if-ge v4, v2, :cond_2

    .line 129
    .line 130
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:[D

    .line 131
    .line 132
    new-instance v8, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v6}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 149
    .line 150
    .line 151
    move-result-wide v8

    .line 152
    aput-wide v8, v7, v4

    .line 153
    .line 154
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:[D

    .line 155
    .line 156
    new-instance v7, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 173
    .line 174
    .line 175
    move-result-wide v7

    .line 176
    aput-wide v7, v6, v4

    .line 177
    .line 178
    add-int/lit8 v4, v4, 0x1

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_2
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:[D

    .line 182
    .line 183
    array-length v4, v2

    .line 184
    const/4 v7, 0x1

    .line 185
    sub-int/2addr v4, v7

    .line 186
    const-wide/16 v8, 0x1

    .line 187
    .line 188
    aput-wide v8, v2, v4

    .line 189
    .line 190
    const-wide/16 v8, 0x1

    .line 191
    .line 192
    move v2, v3

    .line 193
    move-wide v10, v8

    .line 194
    :goto_2
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:[J

    .line 195
    .line 196
    array-length v12, v4

    .line 197
    const-wide/16 v13, 0x5

    .line 198
    .line 199
    if-ge v2, v12, :cond_3

    .line 200
    .line 201
    aput-wide v10, v4, v2

    .line 202
    .line 203
    mul-long/2addr v10, v13

    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_3
    invoke-static {v13, v14}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏:[Ljava/math/BigInteger;

    .line 212
    .line 213
    sget-object v10, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 214
    .line 215
    aput-object v10, v4, v3

    .line 216
    .line 217
    move v4, v7

    .line 218
    :goto_3
    sget-object v10, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏:[Ljava/math/BigInteger;

    .line 219
    .line 220
    array-length v11, v10

    .line 221
    if-ge v4, v11, :cond_4

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    aput-object v11, v10, v4

    .line 228
    .line 229
    add-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_4
    new-array v2, v0, [[C

    .line 233
    .line 234
    sput-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:[[C

    .line 235
    .line 236
    new-array v0, v0, [[C

    .line 237
    .line 238
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:[[C

    .line 239
    .line 240
    array-length v0, v2

    .line 241
    :goto_4
    if-ge v3, v0, :cond_5

    .line 242
    .line 243
    invoke-static {v3, v6}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v3, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    sget-object v10, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:[[C

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    aput-object v2, v10, v3

    .line 258
    .line 259
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:[[C

    .line 260
    .line 261
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    aput-object v4, v2, v3

    .line 266
    .line 267
    add-int/lit8 v3, v3, 0x1

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_5
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:[[C

    .line 271
    .line 272
    array-length v2, v0

    .line 273
    sub-int/2addr v2, v7

    .line 274
    new-array v3, v1, [C

    .line 275
    .line 276
    fill-array-data v3, :array_1

    .line 277
    .line 278
    .line 279
    aput-object v3, v0, v2

    .line 280
    .line 281
    const/16 v0, 0x64

    .line 282
    .line 283
    new-array v2, v0, [I

    .line 284
    .line 285
    sput-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:[I

    .line 286
    .line 287
    new-array v0, v0, [S

    .line 288
    .line 289
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世:[S

    .line 290
    .line 291
    const-wide/16 v2, 0x0

    .line 292
    .line 293
    move-wide v4, v2

    .line 294
    :goto_5
    const-wide/16 v6, 0xa

    .line 295
    .line 296
    cmp-long v0, v4, v6

    .line 297
    .line 298
    if-gez v0, :cond_8

    .line 299
    .line 300
    move-wide v10, v2

    .line 301
    :goto_6
    cmp-long v0, v10, v6

    .line 302
    .line 303
    if-gez v0, :cond_7

    .line 304
    .line 305
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 306
    .line 307
    const/16 v12, 0x10

    .line 308
    .line 309
    const-wide/16 v13, 0x30

    .line 310
    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    add-long v15, v4, v13

    .line 314
    .line 315
    shl-long/2addr v15, v12

    .line 316
    add-long/2addr v13, v10

    .line 317
    or-long v12, v15, v13

    .line 318
    .line 319
    long-to-int v0, v4

    .line 320
    add-int/lit8 v0, v0, 0x30

    .line 321
    .line 322
    shl-int/2addr v0, v1

    .line 323
    long-to-int v14, v10

    .line 324
    :goto_7
    add-int/lit8 v14, v14, 0x30

    .line 325
    .line 326
    or-int/2addr v0, v14

    .line 327
    goto :goto_8

    .line 328
    :cond_6
    add-long v15, v10, v13

    .line 329
    .line 330
    shl-long/2addr v15, v12

    .line 331
    add-long/2addr v13, v4

    .line 332
    or-long v12, v15, v13

    .line 333
    .line 334
    long-to-int v0, v10

    .line 335
    add-int/lit8 v0, v0, 0x30

    .line 336
    .line 337
    shl-int/2addr v0, v1

    .line 338
    long-to-int v14, v4

    .line 339
    goto :goto_7

    .line 340
    :goto_8
    mul-long v14, v4, v6

    .line 341
    .line 342
    add-long/2addr v14, v10

    .line 343
    long-to-int v14, v14

    .line 344
    sget-object v15, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:[I

    .line 345
    .line 346
    long-to-int v12, v12

    .line 347
    aput v12, v15, v14

    .line 348
    .line 349
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世:[S

    .line 350
    .line 351
    int-to-short v0, v0

    .line 352
    aput-short v0, v12, v14

    .line 353
    .line 354
    add-long/2addr v10, v8

    .line 355
    goto :goto_6

    .line 356
    :cond_7
    add-long/2addr v4, v8

    .line 357
    goto :goto_5

    .line 358
    :cond_8
    return-void

    .line 359
    :array_0
    .array-data 8
        0xa
        0x64
        0x3e8
        0x2710
        0x186a0
        0xf4240
        0x989680
        0x5f5e100
        0x3b9aca00
        0x2540be400L
        0x174876e800L
        0xe8d4a51000L
        0x9184e72a000L
        0x5af3107a4000L
        0x38d7ea4c68000L
        0x2386f26fc10000L
        0x16345785d8a0000L
        0xde0b6b3a7640000L
        0x7fffffffffffffffL
    .end array-data

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    :array_1
    .array-data 2
        0x34s
        0x2es
        0x39s
        0x45s
        0x2ds
        0x33s
        0x32s
        0x34s
    .end array-data
.end method

.method public static 飘花落叶言子楪世兰哲苏(JII[CI)I
    .locals 17

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    const-wide/16 v3, 0x1

    .line 8
    .line 9
    and-long v5, p0, v3

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    cmp-long v5, v5, v7

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-nez v5, :cond_3

    .line 17
    .line 18
    const-wide/16 v9, 0x5

    .line 19
    .line 20
    rem-long v11, p0, v9

    .line 21
    .line 22
    cmp-long v5, v11, v7

    .line 23
    .line 24
    if-nez v5, :cond_3

    .line 25
    .line 26
    move-wide/from16 v11, p0

    .line 27
    .line 28
    move/from16 v5, p2

    .line 29
    .line 30
    :cond_0
    const-wide/16 v13, 0x64

    .line 31
    .line 32
    rem-long v15, v11, v13

    .line 33
    .line 34
    cmp-long v15, v15, v7

    .line 35
    .line 36
    if-nez v15, :cond_1

    .line 37
    .line 38
    add-int/lit8 v5, v5, -0x2

    .line 39
    .line 40
    div-long/2addr v11, v13

    .line 41
    if-ne v5, v6, :cond_0

    .line 42
    .line 43
    :cond_1
    and-long/2addr v3, v11

    .line 44
    cmp-long v3, v3, v7

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    rem-long v3, v11, v9

    .line 49
    .line 50
    cmp-long v3, v3, v7

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    cmp-long v3, v11, v7

    .line 55
    .line 56
    if-lez v3, :cond_2

    .line 57
    .line 58
    add-int/lit8 v3, v5, -0x1

    .line 59
    .line 60
    const-wide/16 v4, 0xa

    .line 61
    .line 62
    div-long v4, v11, v4

    .line 63
    .line 64
    move-wide v11, v4

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move v3, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move-wide/from16 v11, p0

    .line 69
    .line 70
    move/from16 v3, p2

    .line 71
    .line 72
    :goto_0
    const/16 v4, 0x2e

    .line 73
    .line 74
    const/4 v5, -0x3

    .line 75
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏:[J

    .line 76
    .line 77
    const/4 v8, -0x1

    .line 78
    const/16 v9, 0x30

    .line 79
    .line 80
    if-lt v0, v5, :cond_b

    .line 81
    .line 82
    const/4 v10, 0x7

    .line 83
    if-lt v0, v10, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    if-gez v0, :cond_7

    .line 87
    .line 88
    sget v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 89
    .line 90
    invoke-static {v2, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v2, 0x2

    .line 94
    .line 95
    const/4 v4, -0x2

    .line 96
    if-ne v0, v4, :cond_5

    .line 97
    .line 98
    add-int/lit8 v0, v2, 0x3

    .line 99
    .line 100
    aput-char v9, v1, v3

    .line 101
    .line 102
    move v3, v0

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    if-ne v0, v5, :cond_6

    .line 105
    .line 106
    const v0, 0x300030

    .line 107
    .line 108
    .line 109
    invoke-static {v3, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v3, v2, 0x4

    .line 113
    .line 114
    :cond_6
    :goto_1
    invoke-static {v1, v3, v11, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    return v0

    .line 119
    :cond_7
    sub-int/2addr v3, v6

    .line 120
    sub-int/2addr v3, v0

    .line 121
    if-lez v3, :cond_9

    .line 122
    .line 123
    sub-int/2addr v3, v6

    .line 124
    aget-wide v5, v7, v3

    .line 125
    .line 126
    div-long v13, v11, v5

    .line 127
    .line 128
    long-to-int v0, v13

    .line 129
    int-to-long v13, v0

    .line 130
    invoke-static {v1, v2, v13, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    add-int/lit8 v2, v0, 0x1

    .line 135
    .line 136
    aput-char v4, v1, v0

    .line 137
    .line 138
    mul-long/2addr v13, v5

    .line 139
    sub-long/2addr v11, v13

    .line 140
    :goto_2
    add-int/2addr v3, v8

    .line 141
    if-le v3, v8, :cond_8

    .line 142
    .line 143
    aget-wide v4, v7, v3

    .line 144
    .line 145
    cmp-long v0, v11, v4

    .line 146
    .line 147
    if-gez v0, :cond_8

    .line 148
    .line 149
    add-int/lit8 v0, v2, 0x1

    .line 150
    .line 151
    aput-char v9, v1, v2

    .line 152
    .line 153
    move v2, v0

    .line 154
    goto :goto_2

    .line 155
    :cond_8
    invoke-static {v1, v2, v11, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    return v0

    .line 160
    :cond_9
    invoke-static {v1, v2, v11, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    neg-int v2, v3

    .line 165
    if-lez v2, :cond_a

    .line 166
    .line 167
    const/4 v3, 0x0

    .line 168
    :goto_3
    if-ge v3, v2, :cond_a

    .line 169
    .line 170
    add-int/lit8 v4, v0, 0x1

    .line 171
    .line 172
    aput-char v9, v1, v0

    .line 173
    .line 174
    add-int/lit8 v3, v3, 0x1

    .line 175
    .line 176
    move v0, v4

    .line 177
    goto :goto_3

    .line 178
    :cond_a
    sget v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 179
    .line 180
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 181
    .line 182
    .line 183
    add-int/lit8 v0, v0, 0x2

    .line 184
    .line 185
    return v0

    .line 186
    :cond_b
    :goto_4
    if-ne v3, v6, :cond_c

    .line 187
    .line 188
    const-wide/16 v3, 0x30

    .line 189
    .line 190
    add-long/2addr v11, v3

    .line 191
    long-to-int v3, v11

    .line 192
    int-to-char v3, v3

    .line 193
    aput-char v3, v1, v2

    .line 194
    .line 195
    add-int/lit8 v3, v2, 0x1

    .line 196
    .line 197
    sget v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 198
    .line 199
    invoke-static {v3, v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 200
    .line 201
    .line 202
    add-int/lit8 v2, v2, 0x3

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_c
    add-int/lit8 v3, v3, -0x2

    .line 206
    .line 207
    aget-wide v5, v7, v3

    .line 208
    .line 209
    div-long v13, v11, v5

    .line 210
    .line 211
    long-to-int v10, v13

    .line 212
    add-int/lit8 v13, v10, 0x30

    .line 213
    .line 214
    int-to-char v13, v13

    .line 215
    aput-char v13, v1, v2

    .line 216
    .line 217
    add-int/lit8 v13, v2, 0x1

    .line 218
    .line 219
    aput-char v4, v1, v13

    .line 220
    .line 221
    add-int/lit8 v2, v2, 0x2

    .line 222
    .line 223
    int-to-long v13, v10

    .line 224
    mul-long/2addr v13, v5

    .line 225
    sub-long/2addr v11, v13

    .line 226
    :goto_5
    add-int/2addr v3, v8

    .line 227
    if-le v3, v8, :cond_d

    .line 228
    .line 229
    aget-wide v4, v7, v3

    .line 230
    .line 231
    cmp-long v4, v11, v4

    .line 232
    .line 233
    if-gez v4, :cond_d

    .line 234
    .line 235
    add-int/lit8 v4, v2, 0x1

    .line 236
    .line 237
    aput-char v9, v1, v2

    .line 238
    .line 239
    move v2, v4

    .line 240
    goto :goto_5

    .line 241
    :cond_d
    invoke-static {v1, v2, v11, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    :goto_6
    add-int/lit8 v3, v2, 0x1

    .line 246
    .line 247
    const/16 v4, 0x45

    .line 248
    .line 249
    aput-char v4, v1, v2

    .line 250
    .line 251
    if-gez v0, :cond_e

    .line 252
    .line 253
    add-int/lit8 v2, v2, 0x2

    .line 254
    .line 255
    const/16 v4, 0x2d

    .line 256
    .line 257
    aput-char v4, v1, v3

    .line 258
    .line 259
    neg-int v0, v0

    .line 260
    move v3, v2

    .line 261
    :cond_e
    const/16 v2, 0x63

    .line 262
    .line 263
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:[I

    .line 264
    .line 265
    if-le v0, v2, :cond_f

    .line 266
    .line 267
    int-to-long v5, v0

    .line 268
    const-wide/32 v7, 0x51eb851f

    .line 269
    .line 270
    .line 271
    mul-long/2addr v5, v7

    .line 272
    const/16 v2, 0x25

    .line 273
    .line 274
    shr-long/2addr v5, v2

    .line 275
    long-to-int v2, v5

    .line 276
    add-int/lit8 v5, v2, 0x30

    .line 277
    .line 278
    int-to-char v5, v5

    .line 279
    aput-char v5, v1, v3

    .line 280
    .line 281
    mul-int/lit8 v2, v2, 0x64

    .line 282
    .line 283
    sub-int/2addr v0, v2

    .line 284
    add-int/lit8 v2, v3, 0x1

    .line 285
    .line 286
    aget v0, v4, v0

    .line 287
    .line 288
    invoke-static {v2, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 289
    .line 290
    .line 291
    add-int/lit8 v3, v3, 0x3

    .line 292
    .line 293
    return v3

    .line 294
    :cond_f
    const/16 v2, 0x9

    .line 295
    .line 296
    if-le v0, v2, :cond_10

    .line 297
    .line 298
    aget v0, v4, v0

    .line 299
    .line 300
    invoke-static {v3, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 301
    .line 302
    .line 303
    add-int/lit8 v3, v3, 0x2

    .line 304
    .line 305
    return v3

    .line 306
    :cond_10
    add-int/lit8 v2, v3, 0x1

    .line 307
    .line 308
    add-int/2addr v0, v9

    .line 309
    int-to-char v0, v0

    .line 310
    aput-char v0, v1, v3

    .line 311
    .line 312
    return v2
.end method

.method public static 飘花落叶言子楪世兰苏哲(IIIJ[B)I
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    const-wide/16 v3, 0x1

    .line 8
    .line 9
    and-long v5, p3, v3

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    cmp-long v5, v5, v7

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-nez v5, :cond_3

    .line 17
    .line 18
    const-wide/16 v9, 0x5

    .line 19
    .line 20
    rem-long v11, p3, v9

    .line 21
    .line 22
    cmp-long v5, v11, v7

    .line 23
    .line 24
    if-nez v5, :cond_3

    .line 25
    .line 26
    move/from16 v5, p0

    .line 27
    .line 28
    move-wide/from16 v11, p3

    .line 29
    .line 30
    :cond_0
    const-wide/16 v13, 0x64

    .line 31
    .line 32
    rem-long v15, v11, v13

    .line 33
    .line 34
    cmp-long v15, v15, v7

    .line 35
    .line 36
    if-nez v15, :cond_1

    .line 37
    .line 38
    add-int/lit8 v5, v5, -0x2

    .line 39
    .line 40
    div-long/2addr v11, v13

    .line 41
    if-ne v5, v6, :cond_0

    .line 42
    .line 43
    :cond_1
    and-long/2addr v3, v11

    .line 44
    cmp-long v3, v3, v7

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    rem-long v3, v11, v9

    .line 49
    .line 50
    cmp-long v3, v3, v7

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    cmp-long v3, v11, v7

    .line 55
    .line 56
    if-lez v3, :cond_2

    .line 57
    .line 58
    add-int/lit8 v3, v5, -0x1

    .line 59
    .line 60
    const-wide/16 v4, 0xa

    .line 61
    .line 62
    div-long v4, v11, v4

    .line 63
    .line 64
    move-wide v11, v4

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move v3, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move/from16 v3, p0

    .line 69
    .line 70
    move-wide/from16 v11, p3

    .line 71
    .line 72
    :goto_0
    const/16 v4, 0x2e

    .line 73
    .line 74
    const/4 v5, -0x3

    .line 75
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏:[J

    .line 76
    .line 77
    const/4 v8, -0x1

    .line 78
    const/16 v9, 0x30

    .line 79
    .line 80
    if-lt v0, v5, :cond_b

    .line 81
    .line 82
    const/4 v10, 0x7

    .line 83
    if-lt v0, v10, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    if-gez v0, :cond_7

    .line 87
    .line 88
    sget-short v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:S

    .line 89
    .line 90
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v1, 0x2

    .line 94
    .line 95
    const/4 v4, -0x2

    .line 96
    if-ne v0, v4, :cond_5

    .line 97
    .line 98
    add-int/lit8 v0, v1, 0x3

    .line 99
    .line 100
    aput-byte v9, v2, v3

    .line 101
    .line 102
    move v3, v0

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    if-ne v0, v5, :cond_6

    .line 105
    .line 106
    const/16 v0, 0x3030

    .line 107
    .line 108
    invoke-static {v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v3, v1, 0x4

    .line 112
    .line 113
    :cond_6
    :goto_1
    invoke-static {v11, v12, v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    return v0

    .line 118
    :cond_7
    sub-int/2addr v3, v6

    .line 119
    sub-int/2addr v3, v0

    .line 120
    if-lez v3, :cond_9

    .line 121
    .line 122
    sub-int/2addr v3, v6

    .line 123
    aget-wide v5, v7, v3

    .line 124
    .line 125
    div-long v13, v11, v5

    .line 126
    .line 127
    long-to-int v0, v13

    .line 128
    int-to-long v13, v0

    .line 129
    invoke-static {v13, v14, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰哲楪世(J[BI)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    add-int/lit8 v1, v0, 0x1

    .line 134
    .line 135
    aput-byte v4, v2, v0

    .line 136
    .line 137
    mul-long/2addr v13, v5

    .line 138
    sub-long/2addr v11, v13

    .line 139
    :goto_2
    add-int/2addr v3, v8

    .line 140
    if-le v3, v8, :cond_8

    .line 141
    .line 142
    aget-wide v4, v7, v3

    .line 143
    .line 144
    cmp-long v0, v11, v4

    .line 145
    .line 146
    if-gez v0, :cond_8

    .line 147
    .line 148
    add-int/lit8 v0, v1, 0x1

    .line 149
    .line 150
    aput-byte v9, v2, v1

    .line 151
    .line 152
    move v1, v0

    .line 153
    goto :goto_2

    .line 154
    :cond_8
    invoke-static {v11, v12, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    return v0

    .line 159
    :cond_9
    invoke-static {v11, v12, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    neg-int v1, v3

    .line 164
    if-lez v1, :cond_a

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    :goto_3
    if-ge v3, v1, :cond_a

    .line 168
    .line 169
    add-int/lit8 v4, v0, 0x1

    .line 170
    .line 171
    aput-byte v9, v2, v0

    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    move v0, v4

    .line 176
    goto :goto_3

    .line 177
    :cond_a
    sget-short v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 178
    .line 179
    invoke-static {v2, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 180
    .line 181
    .line 182
    add-int/lit8 v0, v0, 0x2

    .line 183
    .line 184
    return v0

    .line 185
    :cond_b
    :goto_4
    if-ne v3, v6, :cond_c

    .line 186
    .line 187
    const-wide/16 v3, 0x30

    .line 188
    .line 189
    add-long/2addr v11, v3

    .line 190
    long-to-int v3, v11

    .line 191
    int-to-byte v3, v3

    .line 192
    aput-byte v3, v2, v1

    .line 193
    .line 194
    add-int/lit8 v3, v1, 0x1

    .line 195
    .line 196
    sget-short v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 197
    .line 198
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v1, v1, 0x3

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_c
    add-int/lit8 v3, v3, -0x2

    .line 205
    .line 206
    aget-wide v5, v7, v3

    .line 207
    .line 208
    div-long v13, v11, v5

    .line 209
    .line 210
    long-to-int v10, v13

    .line 211
    add-int/lit8 v13, v10, 0x30

    .line 212
    .line 213
    int-to-byte v13, v13

    .line 214
    aput-byte v13, v2, v1

    .line 215
    .line 216
    add-int/lit8 v13, v1, 0x1

    .line 217
    .line 218
    aput-byte v4, v2, v13

    .line 219
    .line 220
    add-int/lit8 v1, v1, 0x2

    .line 221
    .line 222
    int-to-long v13, v10

    .line 223
    mul-long/2addr v13, v5

    .line 224
    sub-long/2addr v11, v13

    .line 225
    :goto_5
    add-int/2addr v3, v8

    .line 226
    if-le v3, v8, :cond_d

    .line 227
    .line 228
    aget-wide v4, v7, v3

    .line 229
    .line 230
    cmp-long v4, v11, v4

    .line 231
    .line 232
    if-gez v4, :cond_d

    .line 233
    .line 234
    add-int/lit8 v4, v1, 0x1

    .line 235
    .line 236
    aput-byte v9, v2, v1

    .line 237
    .line 238
    move v1, v4

    .line 239
    goto :goto_5

    .line 240
    :cond_d
    invoke-static {v11, v12, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    :goto_6
    add-int/lit8 v3, v1, 0x1

    .line 245
    .line 246
    const/16 v4, 0x45

    .line 247
    .line 248
    aput-byte v4, v2, v1

    .line 249
    .line 250
    if-gez v0, :cond_e

    .line 251
    .line 252
    add-int/lit8 v1, v1, 0x2

    .line 253
    .line 254
    const/16 v4, 0x2d

    .line 255
    .line 256
    aput-byte v4, v2, v3

    .line 257
    .line 258
    neg-int v0, v0

    .line 259
    move v3, v1

    .line 260
    :cond_e
    const/16 v1, 0x63

    .line 261
    .line 262
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世:[S

    .line 263
    .line 264
    if-le v0, v1, :cond_f

    .line 265
    .line 266
    int-to-long v5, v0

    .line 267
    const-wide/32 v7, 0x51eb851f

    .line 268
    .line 269
    .line 270
    mul-long/2addr v5, v7

    .line 271
    const/16 v1, 0x25

    .line 272
    .line 273
    shr-long/2addr v5, v1

    .line 274
    long-to-int v1, v5

    .line 275
    add-int/lit8 v5, v1, 0x30

    .line 276
    .line 277
    int-to-byte v5, v5

    .line 278
    aput-byte v5, v2, v3

    .line 279
    .line 280
    mul-int/lit8 v1, v1, 0x64

    .line 281
    .line 282
    sub-int/2addr v0, v1

    .line 283
    add-int/lit8 v1, v3, 0x1

    .line 284
    .line 285
    aget-short v0, v4, v0

    .line 286
    .line 287
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 288
    .line 289
    .line 290
    add-int/lit8 v3, v3, 0x3

    .line 291
    .line 292
    return v3

    .line 293
    :cond_f
    const/16 v1, 0x9

    .line 294
    .line 295
    if-le v0, v1, :cond_10

    .line 296
    .line 297
    aget-short v0, v4, v0

    .line 298
    .line 299
    invoke-static {v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 300
    .line 301
    .line 302
    add-int/lit8 v3, v3, 0x2

    .line 303
    .line 304
    return v3

    .line 305
    :cond_10
    add-int/lit8 v1, v3, 0x1

    .line 306
    .line 307
    add-int/2addr v0, v9

    .line 308
    int-to-byte v0, v0

    .line 309
    aput-byte v0, v2, v3

    .line 310
    .line 311
    return v1
.end method

.method public static 飘花落叶言子楪世哲兰苏(JJI)J
    .locals 3

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const/16 v2, 0x40

    .line 11
    .line 12
    if-lt p4, v2, :cond_0

    .line 13
    .line 14
    sub-int/2addr p4, v2

    .line 15
    ushr-long p0, v0, p4

    .line 16
    .line 17
    return-wide p0

    .line 18
    :cond_0
    mul-long/2addr p0, p2

    .line 19
    rsub-int/lit8 p2, p4, 0x40

    .line 20
    .line 21
    shl-long p2, v0, p2

    .line 22
    .line 23
    ushr-long/2addr p0, p4

    .line 24
    or-long/2addr p0, p2

    .line 25
    return-wide p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(IJJJ)J
    .locals 7

    .line 1
    add-int/lit8 v0, p0, -0x40

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2, p3, p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    mul-long/2addr p3, p1

    .line 13
    invoke-static {p1, p2, p5, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    mul-long/2addr p1, p5

    .line 18
    const/16 p5, 0x20

    .line 19
    .line 20
    shl-long/2addr v3, p5

    .line 21
    ushr-long/2addr p1, p5

    .line 22
    add-long/2addr v3, p1

    .line 23
    add-long p1, p3, v3

    .line 24
    .line 25
    or-long p5, p3, v3

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long p5, p5, v5

    .line 30
    .line 31
    if-gez p5, :cond_1

    .line 32
    .line 33
    and-long/2addr p3, v3

    .line 34
    cmp-long p3, p3, v5

    .line 35
    .line 36
    if-ltz p3, :cond_0

    .line 37
    .line 38
    cmp-long p3, p1, v5

    .line 39
    .line 40
    if-ltz p3, :cond_1

    .line 41
    .line 42
    :cond_0
    const-wide/16 p3, 0x1

    .line 43
    .line 44
    add-long/2addr v1, p3

    .line 45
    :cond_1
    if-ltz v0, :cond_2

    .line 46
    .line 47
    ushr-long p0, v1, v0

    .line 48
    .line 49
    return-wide p0

    .line 50
    :cond_2
    neg-int p3, v0

    .line 51
    shl-long p3, v1, p3

    .line 52
    .line 53
    ushr-long p0, p1, p0

    .line 54
    .line 55
    or-long/2addr p0, p3

    .line 56
    return-wide p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(F)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;
    .locals 23

    .line 1
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x17

    .line 6
    .line 7
    const/16 v2, 0xff

    .line 8
    .line 9
    and-int/2addr v1, v2

    .line 10
    const v3, 0x7fffff

    .line 11
    .line 12
    .line 13
    and-int/2addr v3, v0

    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v6, 0x0

    .line 19
    :goto_0
    if-lez v1, :cond_2

    .line 20
    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/high16 v0, 0x800000

    .line 27
    .line 28
    or-int/2addr v0, v3

    .line 29
    add-int/lit16 v1, v1, -0x96

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    if-nez v3, :cond_4

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_3
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/lit8 v0, v0, -0x8

    .line 47
    .line 48
    shl-int v1, v3, v0

    .line 49
    .line 50
    rsub-int v0, v0, -0x95

    .line 51
    .line 52
    move/from16 v22, v1

    .line 53
    .line 54
    move v1, v0

    .line 55
    move/from16 v0, v22

    .line 56
    .line 57
    :goto_1
    const/16 v2, 0x27

    .line 58
    .line 59
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:[J

    .line 60
    .line 61
    if-ltz v1, :cond_8

    .line 62
    .line 63
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏兰世哲:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;

    .line 64
    .line 65
    aget-object v7, v7, v1

    .line 66
    .line 67
    iget-short v8, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 68
    .line 69
    iget-byte v9, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:B

    .line 70
    .line 71
    iget v10, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 72
    .line 73
    int-to-long v10, v10

    .line 74
    iget-boolean v12, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 75
    .line 76
    if-eqz v12, :cond_5

    .line 77
    .line 78
    int-to-long v12, v0

    .line 79
    iget-wide v14, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 80
    .line 81
    cmp-long v12, v12, v14

    .line 82
    .line 83
    if-lez v12, :cond_5

    .line 84
    .line 85
    add-int/lit8 v8, v8, 0x1

    .line 86
    .line 87
    add-int/lit8 v9, v9, 0x1

    .line 88
    .line 89
    :cond_5
    iget v7, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:I

    .line 90
    .line 91
    add-int/lit8 v7, v7, 0x6

    .line 92
    .line 93
    add-int/2addr v1, v7

    .line 94
    if-gez v7, :cond_7

    .line 95
    .line 96
    const/16 v12, 0x28

    .line 97
    .line 98
    if-ge v1, v12, :cond_6

    .line 99
    .line 100
    int-to-long v12, v0

    .line 101
    shl-long v0, v12, v1

    .line 102
    .line 103
    neg-int v2, v7

    .line 104
    aget-wide v2, v3, v2

    .line 105
    .line 106
    div-long/2addr v0, v2

    .line 107
    const/16 v21, 0x1

    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :cond_6
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;

    .line 112
    .line 113
    neg-int v7, v7

    .line 114
    aget-object v3, v3, v7

    .line 115
    .line 116
    int-to-long v12, v0

    .line 117
    shl-long v15, v12, v2

    .line 118
    .line 119
    iget-wide v12, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 120
    .line 121
    const/16 v21, 0x1

    .line 122
    .line 123
    iget-wide v4, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 124
    .line 125
    iget-short v0, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 126
    .line 127
    add-int/lit8 v0, v0, 0x47

    .line 128
    .line 129
    sub-int v14, v0, v1

    .line 130
    .line 131
    move-wide/from16 v19, v4

    .line 132
    .line 133
    move-wide/from16 v17, v12

    .line 134
    .line 135
    invoke-static/range {v14 .. v20}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰(IJJJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    goto/16 :goto_2

    .line 140
    .line 141
    :cond_7
    const/16 v21, 0x1

    .line 142
    .line 143
    int-to-long v4, v0

    .line 144
    aget-wide v2, v3, v7

    .line 145
    .line 146
    mul-long/2addr v4, v2

    .line 147
    shl-long v0, v4, v1

    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_8
    const/16 v21, 0x1

    .line 152
    .line 153
    neg-int v4, v1

    .line 154
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲兰世:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;

    .line 155
    .line 156
    aget-object v4, v5, v4

    .line 157
    .line 158
    iget-short v5, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 159
    .line 160
    iget-byte v7, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:B

    .line 161
    .line 162
    iget v8, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 163
    .line 164
    int-to-long v10, v8

    .line 165
    iget-boolean v8, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 166
    .line 167
    if-eqz v8, :cond_9

    .line 168
    .line 169
    int-to-long v8, v0

    .line 170
    iget-wide v12, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 171
    .line 172
    cmp-long v8, v8, v12

    .line 173
    .line 174
    if-lez v8, :cond_9

    .line 175
    .line 176
    add-int/lit8 v5, v5, 0x1

    .line 177
    .line 178
    add-int/lit8 v7, v7, 0x1

    .line 179
    .line 180
    :cond_9
    move v8, v5

    .line 181
    move v9, v7

    .line 182
    iget v4, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:I

    .line 183
    .line 184
    add-int/lit8 v4, v4, 0x6

    .line 185
    .line 186
    add-int/2addr v1, v4

    .line 187
    if-gez v1, :cond_d

    .line 188
    .line 189
    const/16 v5, 0x11

    .line 190
    .line 191
    if-ge v4, v5, :cond_a

    .line 192
    .line 193
    int-to-long v12, v0

    .line 194
    aget-wide v2, v3, v4

    .line 195
    .line 196
    mul-long/2addr v12, v2

    .line 197
    neg-int v0, v1

    .line 198
    shr-long v0, v12, v0

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_a
    array-length v5, v3

    .line 202
    if-ge v4, v5, :cond_b

    .line 203
    .line 204
    int-to-long v12, v0

    .line 205
    aget-wide v2, v3, v4

    .line 206
    .line 207
    neg-int v0, v1

    .line 208
    invoke-static {v12, v13, v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏(JJI)J

    .line 209
    .line 210
    .line 211
    move-result-wide v0

    .line 212
    goto :goto_2

    .line 213
    :cond_b
    array-length v5, v3

    .line 214
    add-int/lit8 v5, v5, 0x4

    .line 215
    .line 216
    if-ge v4, v5, :cond_c

    .line 217
    .line 218
    int-to-long v12, v0

    .line 219
    array-length v0, v3

    .line 220
    sub-int/2addr v4, v0

    .line 221
    add-int/lit8 v4, v4, 0x1

    .line 222
    .line 223
    aget-wide v4, v3, v4

    .line 224
    .line 225
    mul-long/2addr v12, v4

    .line 226
    array-length v0, v3

    .line 227
    add-int/lit8 v0, v0, -0x1

    .line 228
    .line 229
    aget-wide v2, v3, v0

    .line 230
    .line 231
    neg-int v0, v1

    .line 232
    invoke-static {v12, v13, v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏(JJI)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    goto :goto_2

    .line 237
    :cond_c
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;

    .line 238
    .line 239
    aget-object v3, v3, v4

    .line 240
    .line 241
    int-to-long v4, v0

    .line 242
    shl-long v13, v4, v2

    .line 243
    .line 244
    iget-wide v4, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:J

    .line 245
    .line 246
    move v7, v1

    .line 247
    iget-wide v0, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 248
    .line 249
    iget-short v3, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:S

    .line 250
    .line 251
    add-int/2addr v3, v7

    .line 252
    neg-int v3, v3

    .line 253
    add-int/lit8 v12, v3, 0x27

    .line 254
    .line 255
    move-wide/from16 v17, v0

    .line 256
    .line 257
    move-wide v15, v4

    .line 258
    invoke-static/range {v12 .. v18}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰(IJJJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide v0

    .line 262
    goto :goto_2

    .line 263
    :cond_d
    move v7, v1

    .line 264
    aget-wide v1, v3, v4

    .line 265
    .line 266
    int-to-long v3, v0

    .line 267
    mul-long/2addr v1, v3

    .line 268
    shl-long v0, v1, v7

    .line 269
    .line 270
    :goto_2
    const-wide/32 v2, 0x3b9aca00

    .line 271
    .line 272
    .line 273
    cmp-long v4, v0, v2

    .line 274
    .line 275
    const/4 v5, 0x2

    .line 276
    const/16 v7, 0x16

    .line 277
    .line 278
    const-wide v12, 0x6b5fca6af2bd215fL    # 1.633040751451102E209

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    sget-object v14, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;

    .line 284
    .line 285
    if-gez v4, :cond_e

    .line 286
    .line 287
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 288
    .line 289
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v1, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 293
    .line 294
    .line 295
    move-result-wide v0

    .line 296
    shr-long/2addr v0, v7

    .line 297
    invoke-direct {v2, v5, v8, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(IIJ)V

    .line 298
    .line 299
    .line 300
    return-object v2

    .line 301
    :cond_e
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    const-wide v14, 0x44b82fa09b5a52ccL

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    invoke-static {v0, v1, v14, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 310
    .line 311
    .line 312
    move-result-wide v14

    .line 313
    const/16 v4, 0x1c

    .line 314
    .line 315
    shr-long/2addr v14, v4

    .line 316
    mul-long/2addr v2, v14

    .line 317
    sub-long v2, v0, v2

    .line 318
    .line 319
    const-wide/32 v16, 0x3b9aca01

    .line 320
    .line 321
    .line 322
    sub-long v16, v16, v2

    .line 323
    .line 324
    shl-long v16, v16, v21

    .line 325
    .line 326
    cmp-long v4, v16, v10

    .line 327
    .line 328
    if-gtz v4, :cond_f

    .line 329
    .line 330
    move/from16 v4, v21

    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_f
    const/4 v4, 0x0

    .line 334
    :goto_3
    const-wide/16 v16, 0x1

    .line 335
    .line 336
    if-nez v4, :cond_15

    .line 337
    .line 338
    add-long v18, v2, v16

    .line 339
    .line 340
    if-eqz v6, :cond_10

    .line 341
    .line 342
    move/from16 v5, v21

    .line 343
    .line 344
    :cond_10
    shl-long v18, v18, v5

    .line 345
    .line 346
    cmp-long v5, v18, v10

    .line 347
    .line 348
    if-gtz v5, :cond_11

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_11
    if-eqz v6, :cond_13

    .line 352
    .line 353
    const-wide v4, 0x55e63b88c230e77fL    # 6.373791914380304E105

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    invoke-static {v0, v1, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 359
    .line 360
    .line 361
    move-result-wide v0

    .line 362
    const/16 v4, 0x19

    .line 363
    .line 364
    shr-long/2addr v0, v4

    .line 365
    const-wide/32 v4, 0x5f5e100

    .line 366
    .line 367
    .line 368
    rem-long/2addr v2, v4

    .line 369
    const-wide/32 v4, 0x2faf080

    .line 370
    .line 371
    .line 372
    cmp-long v2, v2, v4

    .line 373
    .line 374
    if-ltz v2, :cond_12

    .line 375
    .line 376
    move/from16 v4, v21

    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_12
    const/4 v4, 0x0

    .line 380
    :goto_4
    int-to-long v2, v4

    .line 381
    add-long v16, v0, v2

    .line 382
    .line 383
    move v4, v9

    .line 384
    :goto_5
    move-wide/from16 v14, v16

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_13
    invoke-static {v0, v1, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 388
    .line 389
    .line 390
    move-result-wide v0

    .line 391
    shr-long/2addr v0, v7

    .line 392
    const-wide/32 v4, 0x989680

    .line 393
    .line 394
    .line 395
    rem-long/2addr v2, v4

    .line 396
    const-wide/32 v4, 0x4c4b40

    .line 397
    .line 398
    .line 399
    cmp-long v2, v2, v4

    .line 400
    .line 401
    if-ltz v2, :cond_14

    .line 402
    .line 403
    move/from16 v4, v21

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_14
    const/4 v4, 0x0

    .line 407
    :goto_6
    int-to-long v2, v4

    .line 408
    add-long v16, v0, v2

    .line 409
    .line 410
    add-int/lit8 v4, v9, 0x1

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_15
    :goto_7
    int-to-long v0, v4

    .line 414
    add-long/2addr v14, v0

    .line 415
    add-int/lit8 v9, v9, -0x1

    .line 416
    .line 417
    if-eqz v4, :cond_16

    .line 418
    .line 419
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏:[J

    .line 420
    .line 421
    aget-wide v1, v0, v9

    .line 422
    .line 423
    cmp-long v0, v1, v14

    .line 424
    .line 425
    if-nez v0, :cond_16

    .line 426
    .line 427
    add-int/lit8 v8, v8, 0x1

    .line 428
    .line 429
    move-wide/from16 v14, v16

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    goto :goto_8

    .line 433
    :cond_16
    move v4, v9

    .line 434
    :goto_8
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 435
    .line 436
    add-int/lit8 v4, v4, 0x1

    .line 437
    .line 438
    invoke-direct {v0, v4, v8, v14, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(IIJ)V

    .line 439
    .line 440
    .line 441
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(D)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;
    .locals 29

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    cmpl-double v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const/16 v2, 0x34

    .line 15
    .line 16
    shr-long v2, v0, v2

    .line 17
    .line 18
    long-to-int v2, v2

    .line 19
    const/16 v3, 0x7ff

    .line 20
    .line 21
    and-int/2addr v2, v3

    .line 22
    const-wide v4, 0xfffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v4, v0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v8, v4, v6

    .line 31
    .line 32
    if-lez v8, :cond_1

    .line 33
    .line 34
    const/4 v11, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v11, 0x0

    .line 37
    :goto_0
    const/16 v12, 0xb

    .line 38
    .line 39
    if-lez v2, :cond_3

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    const-wide/high16 v0, 0x10000000000000L

    .line 47
    .line 48
    or-long/2addr v0, v4

    .line 49
    add-int/lit16 v2, v2, -0x433

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    if-nez v8, :cond_5

    .line 53
    .line 54
    cmp-long v0, v0, v6

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_5
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sub-int/2addr v0, v12

    .line 69
    shl-long v1, v4, v0

    .line 70
    .line 71
    rsub-int v0, v0, -0x432

    .line 72
    .line 73
    move-wide/from16 v27, v1

    .line 74
    .line 75
    move v2, v0

    .line 76
    move-wide/from16 v0, v27

    .line 77
    .line 78
    :goto_1
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:[D

    .line 79
    .line 80
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:[J

    .line 81
    .line 82
    if-ltz v2, :cond_9

    .line 83
    .line 84
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;

    .line 85
    .line 86
    aget-object v7, v7, v2

    .line 87
    .line 88
    iget-short v8, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 89
    .line 90
    iget-byte v13, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:B

    .line 91
    .line 92
    iget v14, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 93
    .line 94
    int-to-long v14, v14

    .line 95
    const/16 v16, 0xa

    .line 96
    .line 97
    iget v5, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 98
    .line 99
    const/16 v18, 0x1

    .line 100
    .line 101
    int-to-long v9, v5

    .line 102
    iget-boolean v5, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 103
    .line 104
    move/from16 v19, v13

    .line 105
    .line 106
    if-eqz v5, :cond_7

    .line 107
    .line 108
    iget-wide v12, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 109
    .line 110
    cmp-long v12, v0, v12

    .line 111
    .line 112
    if-ltz v12, :cond_7

    .line 113
    .line 114
    if-lez v12, :cond_6

    .line 115
    .line 116
    add-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    add-int/lit8 v13, v19, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    add-int/lit8 v12, v8, 0x1

    .line 122
    .line 123
    aget-wide v20, v3, v12

    .line 124
    .line 125
    cmpl-double v3, p0, v20

    .line 126
    .line 127
    if-nez v3, :cond_7

    .line 128
    .line 129
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 130
    .line 131
    invoke-direct {v0, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(I)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_7
    move/from16 v13, v19

    .line 136
    .line 137
    :goto_2
    iget v3, v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:I

    .line 138
    .line 139
    add-int/2addr v2, v3

    .line 140
    if-gez v3, :cond_8

    .line 141
    .line 142
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;

    .line 143
    .line 144
    neg-int v7, v3

    .line 145
    aget-object v4, v4, v7

    .line 146
    .line 147
    add-int/lit8 v7, v2, -0xa

    .line 148
    .line 149
    iget-short v12, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏:S

    .line 150
    .line 151
    sub-int/2addr v7, v12

    .line 152
    shl-long v20, v0, v16

    .line 153
    .line 154
    iget-wide v0, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 155
    .line 156
    iget-wide v5, v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 157
    .line 158
    rsub-int/lit8 v19, v7, 0x20

    .line 159
    .line 160
    move-wide/from16 v22, v0

    .line 161
    .line 162
    move-wide/from16 v24, v5

    .line 163
    .line 164
    invoke-static/range {v19 .. v25}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰(IJJJ)J

    .line 165
    .line 166
    .line 167
    move-result-wide v0

    .line 168
    const/4 v12, -0x1

    .line 169
    if-ne v3, v12, :cond_d

    .line 170
    .line 171
    const/16 v5, 0xb

    .line 172
    .line 173
    if-ge v2, v5, :cond_d

    .line 174
    .line 175
    :goto_3
    move/from16 v2, v18

    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_8
    aget-wide v3, v4, v3

    .line 180
    .line 181
    mul-long/2addr v0, v3

    .line 182
    shl-long/2addr v0, v2

    .line 183
    goto :goto_3

    .line 184
    :cond_9
    const/16 v16, 0xa

    .line 185
    .line 186
    const/16 v18, 0x1

    .line 187
    .line 188
    neg-int v5, v2

    .line 189
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;

    .line 190
    .line 191
    aget-object v5, v6, v5

    .line 192
    .line 193
    iget-short v6, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 194
    .line 195
    iget-byte v7, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:B

    .line 196
    .line 197
    iget v8, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 198
    .line 199
    int-to-long v14, v8

    .line 200
    iget v8, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:I

    .line 201
    .line 202
    int-to-long v9, v8

    .line 203
    iget-boolean v8, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 204
    .line 205
    if-eqz v8, :cond_a

    .line 206
    .line 207
    iget-wide v12, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 208
    .line 209
    cmp-long v12, v0, v12

    .line 210
    .line 211
    if-ltz v12, :cond_a

    .line 212
    .line 213
    if-lez v12, :cond_b

    .line 214
    .line 215
    add-int/lit8 v6, v6, 0x1

    .line 216
    .line 217
    add-int/lit8 v7, v7, 0x1

    .line 218
    .line 219
    :cond_a
    move v8, v6

    .line 220
    move v13, v7

    .line 221
    goto :goto_4

    .line 222
    :cond_b
    const/4 v12, -0x1

    .line 223
    if-lt v6, v12, :cond_c

    .line 224
    .line 225
    add-int/lit8 v8, v6, 0x1

    .line 226
    .line 227
    aget-wide v19, v3, v8

    .line 228
    .line 229
    cmpl-double v3, p0, v19

    .line 230
    .line 231
    if-nez v3, :cond_c

    .line 232
    .line 233
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 234
    .line 235
    invoke-direct {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(I)V

    .line 236
    .line 237
    .line 238
    return-object v0

    .line 239
    :cond_c
    if-ge v6, v12, :cond_a

    .line 240
    .line 241
    neg-int v3, v6

    .line 242
    add-int/lit8 v3, v3, -0x1

    .line 243
    .line 244
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:[D

    .line 245
    .line 246
    aget-wide v12, v8, v3

    .line 247
    .line 248
    cmpl-double v3, p0, v12

    .line 249
    .line 250
    if-nez v3, :cond_a

    .line 251
    .line 252
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 253
    .line 254
    add-int/lit8 v6, v6, 0x1

    .line 255
    .line 256
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(I)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :goto_4
    iget v3, v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:I

    .line 261
    .line 262
    add-int/2addr v2, v3

    .line 263
    if-gez v2, :cond_10

    .line 264
    .line 265
    array-length v5, v4

    .line 266
    if-ge v3, v5, :cond_e

    .line 267
    .line 268
    aget-wide v3, v4, v3

    .line 269
    .line 270
    neg-int v2, v2

    .line 271
    invoke-static {v0, v1, v3, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏(JJI)J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    :cond_d
    :goto_5
    const/4 v2, 0x0

    .line 276
    goto :goto_6

    .line 277
    :cond_e
    array-length v5, v4

    .line 278
    add-int/lit8 v5, v5, 0x4

    .line 279
    .line 280
    if-ge v3, v5, :cond_f

    .line 281
    .line 282
    array-length v5, v4

    .line 283
    sub-int/2addr v3, v5

    .line 284
    add-int/lit8 v3, v3, 0x1

    .line 285
    .line 286
    aget-wide v5, v4, v3

    .line 287
    .line 288
    mul-long/2addr v0, v5

    .line 289
    array-length v3, v4

    .line 290
    add-int/lit8 v3, v3, -0x1

    .line 291
    .line 292
    aget-wide v3, v4, v3

    .line 293
    .line 294
    neg-int v2, v2

    .line 295
    invoke-static {v0, v1, v3, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏(JJI)J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    goto :goto_5

    .line 300
    :cond_f
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:[Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;

    .line 301
    .line 302
    aget-object v3, v4, v3

    .line 303
    .line 304
    shl-long v20, v0, v16

    .line 305
    .line 306
    iget-wide v0, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:J

    .line 307
    .line 308
    iget-wide v4, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 309
    .line 310
    iget-short v3, v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:S

    .line 311
    .line 312
    add-int/2addr v3, v2

    .line 313
    neg-int v2, v3

    .line 314
    add-int/lit8 v19, v2, 0xa

    .line 315
    .line 316
    move-wide/from16 v22, v0

    .line 317
    .line 318
    move-wide/from16 v24, v4

    .line 319
    .line 320
    invoke-static/range {v19 .. v25}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰(IJJJ)J

    .line 321
    .line 322
    .line 323
    move-result-wide v0

    .line 324
    goto :goto_5

    .line 325
    :cond_10
    aget-wide v3, v4, v3

    .line 326
    .line 327
    mul-long/2addr v3, v0

    .line 328
    shl-long v0, v3, v2

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :goto_6
    const/4 v3, 0x2

    .line 332
    const-wide/16 v4, 0x5

    .line 333
    .line 334
    const-wide/16 v6, 0xa

    .line 335
    .line 336
    if-eqz v2, :cond_12

    .line 337
    .line 338
    div-long/2addr v0, v6

    .line 339
    const/16 v2, 0x10

    .line 340
    .line 341
    if-ne v13, v2, :cond_11

    .line 342
    .line 343
    add-int/lit8 v13, v13, -0x1

    .line 344
    .line 345
    add-long/2addr v0, v4

    .line 346
    div-long/2addr v0, v6

    .line 347
    :cond_11
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 348
    .line 349
    add-int/2addr v13, v3

    .line 350
    invoke-direct {v2, v13, v8, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(IIJ)V

    .line 351
    .line 352
    .line 353
    return-object v2

    .line 354
    :cond_12
    const-wide/16 v19, 0x3e8

    .line 355
    .line 356
    div-long v21, v0, v19

    .line 357
    .line 358
    mul-long v19, v19, v21

    .line 359
    .line 360
    sub-long v19, v0, v19

    .line 361
    .line 362
    const-wide/16 v23, 0x2711

    .line 363
    .line 364
    mul-long v25, v19, v6

    .line 365
    .line 366
    sub-long v23, v23, v25

    .line 367
    .line 368
    shl-long v23, v23, v18

    .line 369
    .line 370
    cmp-long v2, v23, v9

    .line 371
    .line 372
    if-gtz v2, :cond_13

    .line 373
    .line 374
    move/from16 v9, v18

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_13
    const/4 v9, 0x0

    .line 378
    :goto_7
    if-nez v9, :cond_17

    .line 379
    .line 380
    const-wide/16 v16, 0x1

    .line 381
    .line 382
    add-long v19, v19, v16

    .line 383
    .line 384
    if-eqz v11, :cond_14

    .line 385
    .line 386
    move/from16 v3, v18

    .line 387
    .line 388
    :cond_14
    shl-long v2, v19, v3

    .line 389
    .line 390
    cmp-long v2, v2, v14

    .line 391
    .line 392
    if-gtz v2, :cond_15

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_15
    if-eqz v11, :cond_16

    .line 396
    .line 397
    const-wide/16 v2, 0x32

    .line 398
    .line 399
    add-long/2addr v0, v2

    .line 400
    const-wide/16 v2, 0x64

    .line 401
    .line 402
    div-long/2addr v0, v2

    .line 403
    goto :goto_9

    .line 404
    :cond_16
    add-long/2addr v0, v4

    .line 405
    div-long/2addr v0, v6

    .line 406
    add-int/lit8 v13, v13, 0x1

    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_17
    :goto_8
    int-to-long v0, v9

    .line 410
    add-long v0, v21, v0

    .line 411
    .line 412
    add-int/lit8 v13, v13, -0x1

    .line 413
    .line 414
    :goto_9
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 415
    .line 416
    add-int/lit8 v13, v13, 0x1

    .line 417
    .line 418
    invoke-direct {v2, v13, v8, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;-><init>(IIJ)V

    .line 419
    .line 420
    .line 421
    return-object v2
.end method

.method public static 飘花落叶言子楪苏世兰哲([CID)I
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpl-double v2, p2, v0

    .line 4
    .line 5
    const/16 v3, 0x2d

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    const-wide/high16 v0, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p2, p2, v0

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    add-int/lit8 p2, p1, 0x1

    .line 20
    .line 21
    aput-char v3, p0, p1

    .line 22
    .line 23
    move p1, p2

    .line 24
    :cond_0
    const/16 p2, 0x30

    .line 25
    .line 26
    aput-char p2, p0, p1

    .line 27
    .line 28
    add-int/lit8 p2, p1, 0x1

    .line 29
    .line 30
    sget p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 31
    .line 32
    invoke-static {p2, p3, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x3

    .line 36
    .line 37
    return p1

    .line 38
    :cond_1
    cmpg-double v0, p2, v0

    .line 39
    .line 40
    if-gez v0, :cond_3

    .line 41
    .line 42
    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 43
    .line 44
    cmpl-double v0, p2, v0

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    aput-char v3, p0, p1

    .line 51
    .line 52
    move p1, v0

    .line 53
    :cond_2
    neg-double p2, p2

    .line 54
    :cond_3
    move v5, p1

    .line 55
    double-to-long v0, p2

    .line 56
    long-to-double v2, v0

    .line 57
    cmpl-double p1, p2, v2

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/lit8 v3, v2, -0x1

    .line 66
    .line 67
    move-object v4, p0

    .line 68
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏(JII[CI)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :cond_4
    move-object v4, p0

    .line 74
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(D)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:I

    .line 79
    .line 80
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Z

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    iget-wide v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:J

    .line 85
    .line 86
    iget v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:I

    .line 87
    .line 88
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏(JII[CI)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0

    .line 93
    :cond_5
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 94
    .line 95
    if-ne p0, p1, :cond_6

    .line 96
    .line 97
    sget-wide p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 98
    .line 99
    invoke-static {v4, v5, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲兰楪([CIJ)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x4

    .line 103
    .line 104
    return v5

    .line 105
    :cond_6
    const/4 p0, 0x0

    .line 106
    if-ltz v3, :cond_7

    .line 107
    .line 108
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:[[C

    .line 109
    .line 110
    aget-object p1, p1, v3

    .line 111
    .line 112
    array-length p2, p1

    .line 113
    invoke-static {p1, p0, v4, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 114
    .line 115
    .line 116
    array-length p0, p1

    .line 117
    add-int/2addr v5, p0

    .line 118
    return v5

    .line 119
    :cond_7
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:[[C

    .line 120
    .line 121
    neg-int p2, v3

    .line 122
    aget-object p1, p1, p2

    .line 123
    .line 124
    array-length p2, p1

    .line 125
    invoke-static {p1, p0, v4, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    array-length p0, p1

    .line 129
    add-int/2addr v5, p0

    .line 130
    return v5
.end method

.method public static 飘花落叶言子楪苏世哲兰([BID)I
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpl-double v2, p2, v0

    .line 4
    .line 5
    const/16 v3, 0x2d

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    const-wide/high16 v0, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long p2, p2, v0

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    add-int/lit8 p2, p1, 0x1

    .line 20
    .line 21
    aput-byte v3, p0, p1

    .line 22
    .line 23
    move p1, p2

    .line 24
    :cond_0
    const/16 p2, 0x30

    .line 25
    .line 26
    aput-byte p2, p0, p1

    .line 27
    .line 28
    add-int/lit8 p2, p1, 0x1

    .line 29
    .line 30
    sget-short p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 31
    .line 32
    invoke-static {p0, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x3

    .line 36
    .line 37
    return p1

    .line 38
    :cond_1
    cmpg-double v0, p2, v0

    .line 39
    .line 40
    if-gez v0, :cond_3

    .line 41
    .line 42
    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 43
    .line 44
    cmpl-double v0, p2, v0

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    aput-byte v3, p0, p1

    .line 51
    .line 52
    move p1, v0

    .line 53
    :cond_2
    neg-double p2, p2

    .line 54
    :cond_3
    move v2, p1

    .line 55
    double-to-long v3, p2

    .line 56
    long-to-double v0, v3

    .line 57
    cmpl-double p1, p2, v0

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/lit8 v1, v0, -0x1

    .line 66
    .line 67
    move-object v5, p0

    .line 68
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲(IIIJ[B)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :cond_4
    move-object v5, p0

    .line 74
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(D)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:I

    .line 79
    .line 80
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Z

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    iget-wide v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:J

    .line 85
    .line 86
    iget v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:I

    .line 87
    .line 88
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲(IIIJ[B)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0

    .line 93
    :cond_5
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 94
    .line 95
    if-ne p0, p1, :cond_6

    .line 96
    .line 97
    sget p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 98
    .line 99
    invoke-static {v2, v5, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰哲世(I[BI)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x4

    .line 103
    .line 104
    return v2

    .line 105
    :cond_6
    const/4 p0, 0x0

    .line 106
    if-ltz v1, :cond_8

    .line 107
    .line 108
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:[[C

    .line 109
    .line 110
    aget-object p1, p1, v1

    .line 111
    .line 112
    array-length p2, p1

    .line 113
    :goto_0
    if-ge p0, p2, :cond_7

    .line 114
    .line 115
    aget-char p3, p1, p0

    .line 116
    .line 117
    add-int/lit8 v0, v2, 0x1

    .line 118
    .line 119
    int-to-byte p3, p3

    .line 120
    aput-byte p3, v5, v2

    .line 121
    .line 122
    add-int/lit8 p0, p0, 0x1

    .line 123
    .line 124
    move v2, v0

    .line 125
    goto :goto_0

    .line 126
    :cond_7
    return v2

    .line 127
    :cond_8
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:[[C

    .line 128
    .line 129
    neg-int p2, v1

    .line 130
    aget-object p1, p1, p2

    .line 131
    .line 132
    array-length p2, p1

    .line 133
    :goto_1
    if-ge p0, p2, :cond_9

    .line 134
    .line 135
    aget-char p3, p1, p0

    .line 136
    .line 137
    add-int/lit8 v0, v2, 0x1

    .line 138
    .line 139
    int-to-byte p3, p3

    .line 140
    aput-byte p3, v5, v2

    .line 141
    .line 142
    add-int/lit8 p0, p0, 0x1

    .line 143
    .line 144
    move v2, v0

    .line 145
    goto :goto_1

    .line 146
    :cond_9
    return v2
.end method

.method public static 飘花落叶言子楪苏哲世兰([BIF)I
    .locals 7

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 8
    .line 9
    cmpl-float v0, p2, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 14
    .line 15
    cmpl-float v0, p2, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v6, p0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    cmpl-float v1, p2, v0

    .line 23
    .line 24
    const/16 v2, 0x2d

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/high16 v0, -0x80000000

    .line 33
    .line 34
    if-ne p2, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    aput-byte v2, p0, p1

    .line 39
    .line 40
    move p1, p2

    .line 41
    :cond_2
    const/16 p2, 0x30

    .line 42
    .line 43
    aput-byte p2, p0, p1

    .line 44
    .line 45
    add-int/lit8 p2, p1, 0x1

    .line 46
    .line 47
    sget-short v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 48
    .line 49
    invoke-static {p0, p2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x3

    .line 53
    .line 54
    return p1

    .line 55
    :cond_3
    cmpg-float v0, p2, v0

    .line 56
    .line 57
    if-gez v0, :cond_4

    .line 58
    .line 59
    add-int/lit8 v0, p1, 0x1

    .line 60
    .line 61
    aput-byte v2, p0, p1

    .line 62
    .line 63
    neg-float p2, p2

    .line 64
    move v3, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v3, p1

    .line 67
    :goto_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲(F)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-wide v4, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:J

    .line 72
    .line 73
    iget v1, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:I

    .line 74
    .line 75
    iget v2, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:I

    .line 76
    .line 77
    move-object v6, p0

    .line 78
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲(IIIJ[B)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :goto_1
    sget p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:I

    .line 84
    .line 85
    invoke-static {p1, v6, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰哲世(I[BI)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 p1, p1, 0x4

    .line 89
    .line 90
    return p1
.end method

.method public static 飘花落叶言子楪苏哲兰世([CIF)I
    .locals 7

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 8
    .line 9
    cmpl-float v0, p2, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 14
    .line 15
    cmpl-float v0, p2, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v5, p0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    cmpl-float v1, p2, v0

    .line 23
    .line 24
    const/16 v2, 0x2d

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/high16 v0, -0x80000000

    .line 33
    .line 34
    if-ne p2, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    aput-char v2, p0, p1

    .line 39
    .line 40
    move p1, p2

    .line 41
    :cond_2
    const/16 p2, 0x30

    .line 42
    .line 43
    aput-char p2, p0, p1

    .line 44
    .line 45
    add-int/lit8 p2, p1, 0x1

    .line 46
    .line 47
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 48
    .line 49
    invoke-static {p2, v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪兰世哲(II[C)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x3

    .line 53
    .line 54
    return p1

    .line 55
    :cond_3
    cmpg-float v0, p2, v0

    .line 56
    .line 57
    if-gez v0, :cond_4

    .line 58
    .line 59
    add-int/lit8 v0, p1, 0x1

    .line 60
    .line 61
    aput-char v2, p0, p1

    .line 62
    .line 63
    neg-float p2, p2

    .line 64
    move v6, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v6, p1

    .line 67
    :goto_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲(F)Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-wide v1, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:J

    .line 72
    .line 73
    iget v3, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:I

    .line 74
    .line 75
    iget v4, p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:I

    .line 76
    .line 77
    move-object v5, p0

    .line 78
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏(JII[CI)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :goto_1
    sget-wide v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 84
    .line 85
    invoke-static {v5, p1, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲兰楪([CIJ)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 p1, p1, 0x4

    .line 89
    .line 90
    return p1
.end method
