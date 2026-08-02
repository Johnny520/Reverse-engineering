.class public abstract Luu0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Low1;

    .line 7
    .line 8
    const-class v2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-direct {v1, v0, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, Low1;

    .line 19
    .line 20
    const-class v3, Ljava/lang/Byte;

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, Low1;

    .line 31
    .line 32
    const-class v4, Ljava/lang/Character;

    .line 33
    .line 34
    invoke-direct {v3, v0, v4}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v4, Low1;

    .line 43
    .line 44
    const-class v5, Ljava/lang/Short;

    .line 45
    .line 46
    invoke-direct {v4, v0, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v5, Low1;

    .line 55
    .line 56
    const-class v6, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-direct {v5, v0, v6}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v6, Low1;

    .line 67
    .line 68
    const-class v7, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-direct {v6, v0, v7}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v7, Low1;

    .line 79
    .line 80
    const-class v8, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-direct {v7, v0, v8}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v8, Low1;

    .line 91
    .line 92
    const-class v9, Ljava/lang/Double;

    .line 93
    .line 94
    invoke-direct {v8, v0, v9}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    filled-new-array/range {v1 .. v8}, [Low1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Luu0;->a:Ljava/util/Map;

    .line 106
    .line 107
    return-void
.end method

.method public static a([Ljava/lang/Class;Ljava/util/ArrayList;)Lpu0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    :goto_0
    if-ge v4, v2, :cond_13

    .line 15
    .line 16
    aget-object v7, v0, v4

    .line 17
    .line 18
    add-int/lit8 v8, v6, 0x1

    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    const/4 v11, 0x0

    .line 27
    if-nez v10, :cond_2

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eqz v7, :cond_1

    .line 34
    .line 35
    :cond_0
    move-object v7, v11

    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    new-instance v7, Lou0;

    .line 39
    .line 40
    const/16 v10, 0x8

    .line 41
    .line 42
    invoke-direct {v7, v10, v11}, Lou0;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    if-eqz v12, :cond_4

    .line 52
    .line 53
    sget-object v12, Luu0;->a:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    check-cast v12, Ljava/lang/Class;

    .line 60
    .line 61
    if-nez v12, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-object v7, v12

    .line 65
    :cond_4
    :goto_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-eqz v12, :cond_5

    .line 74
    .line 75
    new-instance v7, Lou0;

    .line 76
    .line 77
    invoke-direct {v7, v3, v10}, Lou0;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_5
    instance-of v12, v10, Ljava/lang/Number;

    .line 83
    .line 84
    if-eqz v12, :cond_11

    .line 85
    .line 86
    move-object v12, v10

    .line 87
    check-cast v12, Ljava/lang/Number;

    .line 88
    .line 89
    const-class v13, Ljava/lang/Byte;

    .line 90
    .line 91
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    if-eqz v13, :cond_8

    .line 96
    .line 97
    invoke-static {v12}, Luu0;->c(Ljava/lang/Number;)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    if-eqz v12, :cond_7

    .line 102
    .line 103
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v13

    .line 107
    const-wide/16 v15, -0x80

    .line 108
    .line 109
    cmp-long v15, v15, v13

    .line 110
    .line 111
    if-gtz v15, :cond_6

    .line 112
    .line 113
    const-wide/16 v15, 0x80

    .line 114
    .line 115
    cmp-long v13, v13, v15

    .line 116
    .line 117
    if-gez v13, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    move-object v12, v11

    .line 121
    :goto_2
    if-eqz v12, :cond_7

    .line 122
    .line 123
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v12

    .line 127
    long-to-int v12, v12

    .line 128
    int-to-byte v12, v12

    .line 129
    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_7
    move-object v12, v11

    .line 136
    goto/16 :goto_6

    .line 137
    .line 138
    :cond_8
    const-class v13, Ljava/lang/Short;

    .line 139
    .line 140
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_a

    .line 145
    .line 146
    invoke-static {v12}, Luu0;->c(Ljava/lang/Number;)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    if-eqz v12, :cond_7

    .line 151
    .line 152
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    const-wide/16 v15, -0x8000

    .line 157
    .line 158
    cmp-long v15, v15, v13

    .line 159
    .line 160
    if-gtz v15, :cond_9

    .line 161
    .line 162
    const-wide/32 v15, 0x8000

    .line 163
    .line 164
    .line 165
    cmp-long v13, v13, v15

    .line 166
    .line 167
    if-gez v13, :cond_9

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_9
    move-object v12, v11

    .line 171
    :goto_3
    if-eqz v12, :cond_7

    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v12

    .line 177
    long-to-int v12, v12

    .line 178
    int-to-short v12, v12

    .line 179
    invoke-static {v12}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    goto/16 :goto_6

    .line 184
    .line 185
    :cond_a
    const-class v13, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-eqz v13, :cond_c

    .line 192
    .line 193
    invoke-static {v12}, Luu0;->c(Ljava/lang/Number;)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    if-eqz v12, :cond_7

    .line 198
    .line 199
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v13

    .line 203
    const-wide/32 v15, -0x80000000

    .line 204
    .line 205
    .line 206
    cmp-long v15, v15, v13

    .line 207
    .line 208
    if-gtz v15, :cond_b

    .line 209
    .line 210
    const-wide v15, 0x80000000L

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    cmp-long v13, v13, v15

    .line 216
    .line 217
    if-gez v13, :cond_b

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_b
    move-object v12, v11

    .line 221
    :goto_4
    if-eqz v12, :cond_7

    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 224
    .line 225
    .line 226
    move-result-wide v12

    .line 227
    long-to-int v12, v12

    .line 228
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    goto :goto_6

    .line 233
    :cond_c
    const-class v13, Ljava/lang/Long;

    .line 234
    .line 235
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_d

    .line 240
    .line 241
    invoke-static {v12}, Luu0;->c(Ljava/lang/Number;)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    goto :goto_6

    .line 246
    :cond_d
    const-class v13, Ljava/lang/Float;

    .line 247
    .line 248
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    const-wide v14, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    if-eqz v13, :cond_f

    .line 258
    .line 259
    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    .line 260
    .line 261
    .line 262
    move-result-wide v12

    .line 263
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 264
    .line 265
    .line 266
    move-result-object v16

    .line 267
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 268
    .line 269
    .line 270
    move-result-wide v17

    .line 271
    cmpg-double v14, v17, v14

    .line 272
    .line 273
    if-gtz v14, :cond_e

    .line 274
    .line 275
    const-wide v14, -0x3810000020000000L    # -3.4028234663852886E38

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    cmpg-double v14, v14, v12

    .line 281
    .line 282
    if-gtz v14, :cond_e

    .line 283
    .line 284
    const-wide v14, 0x47efffffe0000000L    # 3.4028234663852886E38

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    cmpg-double v12, v12, v14

    .line 290
    .line 291
    if-gtz v12, :cond_e

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_e
    move-object/from16 v16, v11

    .line 295
    .line 296
    :goto_5
    if-eqz v16, :cond_7

    .line 297
    .line 298
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Double;->doubleValue()D

    .line 299
    .line 300
    .line 301
    move-result-wide v12

    .line 302
    double-to-float v12, v12

    .line 303
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    goto :goto_6

    .line 308
    :cond_f
    const-class v13, Ljava/lang/Double;

    .line 309
    .line 310
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    if-eqz v13, :cond_7

    .line 315
    .line 316
    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    .line 317
    .line 318
    .line 319
    move-result-wide v12

    .line 320
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 321
    .line 322
    .line 323
    move-result-object v16

    .line 324
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 325
    .line 326
    .line 327
    move-result-wide v12

    .line 328
    cmpg-double v12, v12, v14

    .line 329
    .line 330
    if-gtz v12, :cond_7

    .line 331
    .line 332
    move-object/from16 v12, v16

    .line 333
    .line 334
    :goto_6
    if-nez v12, :cond_10

    .line 335
    .line 336
    move-object v13, v11

    .line 337
    goto :goto_7

    .line 338
    :cond_10
    new-instance v13, Lou0;

    .line 339
    .line 340
    const/4 v14, 0x2

    .line 341
    invoke-direct {v13, v14, v12}, Lou0;-><init>(ILjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :goto_7
    if-eqz v13, :cond_11

    .line 345
    .line 346
    move-object v7, v13

    .line 347
    goto :goto_8

    .line 348
    :cond_11
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v12

    .line 352
    invoke-virtual {v7, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    if-eqz v7, :cond_0

    .line 357
    .line 358
    new-instance v7, Lou0;

    .line 359
    .line 360
    const/4 v12, 0x4

    .line 361
    invoke-direct {v7, v12, v10}, Lou0;-><init>(ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :goto_8
    if-nez v7, :cond_12

    .line 365
    .line 366
    return-object v11

    .line 367
    :cond_12
    iget-object v10, v7, Lou0;->a:Ljava/lang/Object;

    .line 368
    .line 369
    aput-object v10, v1, v6

    .line 370
    .line 371
    iget v6, v7, Lou0;->b:I

    .line 372
    .line 373
    add-int/2addr v5, v6

    .line 374
    add-int/lit8 v4, v4, 0x1

    .line 375
    .line 376
    move v6, v8

    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_13
    new-instance v0, Lpu0;

    .line 380
    .line 381
    invoke-direct {v0, v5, v1}, Lpu0;-><init>(I[Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    return-object v0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_1
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v5, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-ne v5, p2, :cond_0

    .line 36
    .line 37
    move-object v0, v4

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_2
    if-eqz v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-object v0
.end method

.method public static c(Ljava/lang/Number;)Ljava/lang/Long;
    .locals 8

    .line 1
    instance-of v0, p0, Ljava/lang/Byte;

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/Short;

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    instance-of v0, p0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    instance-of v0, p0, Ljava/lang/Float;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    instance-of v0, p0, Ljava/lang/Double;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmpg-double v0, v4, v6

    .line 45
    .line 46
    if-gtz v0, :cond_2

    .line 47
    .line 48
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 49
    .line 50
    rem-double v4, v2, v4

    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmpg-double v0, v4, v6

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const-wide/high16 v4, -0x3c20000000000000L    # -9.223372036854776E18

    .line 59
    .line 60
    cmpl-double v0, v2, v4

    .line 61
    .line 62
    if-ltz v0, :cond_2

    .line 63
    .line 64
    const-wide/high16 v4, 0x43e0000000000000L    # 9.223372036854776E18

    .line 65
    .line 66
    cmpg-double v0, v2, v4

    .line 67
    .line 68
    if-gtz v0, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object p0, v1

    .line 72
    :goto_0
    if-eqz p0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    double-to-long v0, v0

    .line 79
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_3
    return-object v1

    .line 85
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;Ljava/util/ArrayList;Z)Lru0;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v5, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-ne v5, p3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ne v5, v6, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    const/4 v0, 0x0

    .line 76
    if-eqz p3, :cond_5

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, Ljava/lang/reflect/Method;

    .line 83
    .line 84
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v1, p2}, Luu0;->a([Ljava/lang/Class;Ljava/util/ArrayList;)Lpu0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    new-instance v0, Ltu0;

    .line 98
    .line 99
    iget-object v2, v1, Lpu0;->a:[Ljava/lang/Object;

    .line 100
    .line 101
    iget v1, v1, Lpu0;->b:I

    .line 102
    .line 103
    invoke-direct {v0, p3, v2, v1}, Ltu0;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_6

    .line 121
    .line 122
    move-object p1, v0

    .line 123
    goto :goto_3

    .line 124
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_7

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    move-object p2, p1

    .line 136
    check-cast p2, Ltu0;

    .line 137
    .line 138
    iget p2, p2, Ltu0;->c:I

    .line 139
    .line 140
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    move-object v1, p3

    .line 145
    check-cast v1, Ltu0;

    .line 146
    .line 147
    iget v1, v1, Ltu0;->c:I

    .line 148
    .line 149
    if-le p2, v1, :cond_9

    .line 150
    .line 151
    move-object p1, p3

    .line 152
    move p2, v1

    .line 153
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    if-nez p3, :cond_8

    .line 158
    .line 159
    :goto_3
    check-cast p1, Ltu0;

    .line 160
    .line 161
    if-eqz p1, :cond_a

    .line 162
    .line 163
    new-instance p0, Lru0;

    .line 164
    .line 165
    iget-object p2, p1, Ltu0;->a:Ljava/lang/reflect/Method;

    .line 166
    .line 167
    iget-object p1, p1, Ltu0;->b:[Ljava/lang/Object;

    .line 168
    .line 169
    invoke-direct {p0, p2, p1}, Lru0;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_a
    return-object v0
.end method
