.class public abstract Lu90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:[J

.field public static final β:Lt41;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [J

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu90;->α:[J

    .line 9
    .line 10
    new-instance v0, Ls41;

    .line 11
    .line 12
    invoke-direct {v0}, Ls41;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, v0, Ls41;->ζ:Z

    .line 17
    .line 18
    new-instance v1, Lt41;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lt41;-><init>(Ls41;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lu90;->β:Lt41;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lu90;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lu90;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lu90;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :array_0
    .array-data 8
        0x17d7840
        0x17d7840
        0x17d7840
        0x17d7840
        0x17d7840
        0x17d7840
        0x17d7840
        0x9f0a0f
    .end array-data
.end method

.method public static α(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Lk30;

    .line 9
    .line 10
    invoke-direct {p0}, Lk30;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public static β(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "geonames_regions.sqlite"

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static γ(Landroid/content/Context;Ls90;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lm90;)V
    .locals 43

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const-string v2, "\u7b2c "

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const/4 v9, 0x1

    .line 19
    const-wide/16 v10, 0x0

    .line 20
    .line 21
    const-wide/16 v12, 0x0

    .line 22
    .line 23
    const-wide/16 v14, 0x0

    .line 24
    .line 25
    const-wide/16 v16, 0x0

    .line 26
    .line 27
    const-wide/16 v18, 0x0

    .line 28
    .line 29
    :goto_0
    const-string v8, "geonames_regions.zip."

    .line 30
    .line 31
    const/16 v6, 0x9

    .line 32
    .line 33
    if-ge v9, v6, :cond_e

    .line 34
    .line 35
    invoke-static/range {p2 .. p2}, Lu90;->α(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Ljava/io/File;

    .line 39
    .line 40
    invoke-static {v8, v9}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-direct {v6, v3, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v8, p1

    .line 48
    .line 49
    invoke-virtual {v8, v9}, Ls90;->α(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    move-wide/from16 v22, v4

    .line 54
    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v5, "\u5f00\u59cb\u4e0b\u8f7d\u7b2c "

    .line 58
    .line 59
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v5, "/8 \u4e2a GeoNames \u5206\u5377\uff0cURL="

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const-string v5, "raf02e3c7781e553e"

    .line 78
    .line 79
    const/4 v8, 0x4

    .line 80
    move-wide/from16 v24, v10

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    invoke-static {v5, v4, v10, v8, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lb8;

    .line 87
    .line 88
    const/4 v10, 0x6

    .line 89
    invoke-direct {v4, v10}, Lb8;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v7}, Lb8;->π(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v10, Li5;

    .line 96
    .line 97
    invoke-direct {v10, v4}, Li5;-><init>(Lb8;)V

    .line 98
    .line 99
    .line 100
    sget-object v4, Lu90;->β:Lt41;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v11, Luk1;

    .line 106
    .line 107
    invoke-direct {v11, v4, v10}, Luk1;-><init>(Lt41;Li5;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11}, Luk1;->δ()Lzn1;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    iget v10, v4, Lzn1;->θ:I

    .line 118
    .line 119
    :try_start_0
    iget-boolean v11, v4, Lzn1;->υ:Z

    .line 120
    .line 121
    if-eqz v11, :cond_d

    .line 122
    .line 123
    iget-object v11, v4, Lzn1;->λ:Lbo1;

    .line 124
    .line 125
    if-eqz v11, :cond_c

    .line 126
    .line 127
    sget-object v26, Lu90;->α:[J

    .line 128
    .line 129
    add-int/lit8 v27, v9, -0x1

    .line 130
    .line 131
    move/from16 v28, v9

    .line 132
    .line 133
    aget-wide v8, v26, v27

    .line 134
    .line 135
    move-object/from16 v26, v11

    .line 136
    .line 137
    iget-object v11, v4, Lzn1;->ε:Li5;

    .line 138
    .line 139
    iget-object v11, v11, Li5;->β:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v11, Log0;

    .line 142
    .line 143
    move-wide/from16 v29, v12

    .line 144
    .line 145
    new-instance v12, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    move/from16 v13, v28

    .line 154
    .line 155
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-wide/from16 v27, v14

    .line 159
    .line 160
    const-string v14, "/8 \u4e2a GeoNames \u5206\u5377\u5df2\u8fde\u63a5\uff0cHTTP="

    .line 161
    .line 162
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v10, "\uff0c\u8bf7\u6c42 URL="

    .line 169
    .line 170
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v10, "\uff0c\u54cd\u5e94 URL="

    .line 177
    .line 178
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    const/4 v11, 0x4

    .line 189
    const/4 v12, 0x0

    .line 190
    invoke-static {v5, v10, v12, v11, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v26 .. v26}, Lbo1;->η()J

    .line 194
    .line 195
    .line 196
    move-result-wide v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 197
    cmp-long v10, v10, v18

    .line 198
    .line 199
    if-lez v10, :cond_1

    .line 200
    .line 201
    :try_start_1
    invoke-virtual/range {v26 .. v26}, Lbo1;->η()J

    .line 202
    .line 203
    .line 204
    move-result-wide v10

    .line 205
    cmp-long v10, v10, v8

    .line 206
    .line 207
    if-nez v10, :cond_0

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_0
    invoke-virtual/range {v26 .. v26}, Lbo1;->η()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    new-instance v3, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v2, " \u4e2a\u5206\u5377\u957f\u5ea6\u5f02\u5e38: "

    .line 226
    .line 227
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    :catchall_0
    move-exception v0

    .line 248
    move-object v1, v0

    .line 249
    move-object/from16 v31, v4

    .line 250
    .line 251
    goto/16 :goto_d

    .line 252
    .line 253
    :cond_1
    :goto_1
    :try_start_2
    invoke-virtual/range {v26 .. v26}, Lbo1;->κ()Lad;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-interface {v10}, Lad;->π()Ljava/io/InputStream;

    .line 258
    .line 259
    .line 260
    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 261
    :try_start_3
    new-instance v11, Ljava/io/FileOutputStream;

    .line 262
    .line 263
    invoke-direct {v11, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 264
    .line 265
    .line 266
    const/high16 v6, 0x10000

    .line 267
    .line 268
    :try_start_4
    new-array v6, v6, [B

    .line 269
    .line 270
    move-wide/from16 v14, v18

    .line 271
    .line 272
    move-wide/from16 v26, v27

    .line 273
    .line 274
    :goto_2
    invoke-virtual {v10, v6}, Ljava/io/InputStream;->read([B)I

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-ltz v12, :cond_a

    .line 279
    .line 280
    invoke-static/range {p2 .. p2}, Lu90;->α(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 281
    .line 282
    .line 283
    if-eqz v12, :cond_9

    .line 284
    .line 285
    move-object/from16 v28, v3

    .line 286
    .line 287
    const/4 v3, 0x0

    .line 288
    invoke-virtual {v11, v6, v3, v12}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 289
    .line 290
    .line 291
    move-object/from16 v31, v4

    .line 292
    .line 293
    int-to-long v3, v12

    .line 294
    add-long/2addr v14, v3

    .line 295
    add-long v34, v24, v3

    .line 296
    .line 297
    :try_start_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 298
    .line 299
    .line 300
    move-result-wide v3

    .line 301
    sub-long v24, v3, v29

    .line 302
    .line 303
    const-wide/32 v32, 0xbebc200

    .line 304
    .line 305
    .line 306
    cmp-long v12, v24, v32

    .line 307
    .line 308
    if-gez v12, :cond_3

    .line 309
    .line 310
    cmp-long v12, v14, v8

    .line 311
    .line 312
    if-nez v12, :cond_2

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_2
    move-object/from16 v3, v28

    .line 316
    .line 317
    move-object/from16 v4, v31

    .line 318
    .line 319
    move-wide/from16 v24, v34

    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_3
    :goto_3
    sub-long v24, v3, v22

    .line 323
    .line 324
    const-wide/16 v29, 0x1

    .line 325
    .line 326
    cmp-long v12, v24, v29

    .line 327
    .line 328
    if-gez v12, :cond_4

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_4
    move-wide/from16 v29, v24

    .line 332
    .line 333
    :goto_4
    sub-long v32, v34, v16

    .line 334
    .line 335
    const-wide/32 v39, 0x3b9aca00

    .line 336
    .line 337
    .line 338
    mul-long v32, v32, v39

    .line 339
    .line 340
    div-long v32, v32, v29

    .line 341
    .line 342
    cmp-long v12, v32, v18

    .line 343
    .line 344
    if-gez v12, :cond_5

    .line 345
    .line 346
    move-wide/from16 v36, v18

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_5
    move-wide/from16 v36, v32

    .line 350
    .line 351
    :goto_5
    new-instance v32, Lr90;

    .line 352
    .line 353
    sget-object v33, Lq90;->ε:Lq90;

    .line 354
    .line 355
    new-instance v12, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    move-wide/from16 v41, v3

    .line 361
    .line 362
    const-string v3, "\u6b63\u5728\u4e0b\u8f7d\u7b2c "

    .line 363
    .line 364
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v3, "/8 \u4e2a\u5206\u5377"

    .line 371
    .line 372
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v38

    .line 379
    invoke-direct/range {v32 .. v38}, Lr90;-><init>(Lq90;JJLjava/lang/String;)V

    .line 380
    .line 381
    .line 382
    move-object/from16 v12, v32

    .line 383
    .line 384
    move-wide/from16 v3, v34

    .line 385
    .line 386
    invoke-virtual {v1, v12}, Lm90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    sub-long v29, v41, v26

    .line 390
    .line 391
    cmp-long v12, v29, v39

    .line 392
    .line 393
    if-gez v12, :cond_6

    .line 394
    .line 395
    cmp-long v12, v14, v8

    .line 396
    .line 397
    if-nez v12, :cond_7

    .line 398
    .line 399
    :cond_6
    move-wide/from16 v32, v14

    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_7
    move-wide/from16 v34, v3

    .line 403
    .line 404
    move-object/from16 v36, v6

    .line 405
    .line 406
    move-wide/from16 v32, v14

    .line 407
    .line 408
    const/4 v4, 0x4

    .line 409
    goto :goto_7

    .line 410
    :goto_6
    long-to-double v14, v3

    .line 411
    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    .line 412
    .line 413
    mul-double v14, v14, v26

    .line 414
    .line 415
    move-wide/from16 v34, v3

    .line 416
    .line 417
    move-wide/from16 v20, v14

    .line 418
    .line 419
    const-wide/32 v3, 0xb0d53cf

    .line 420
    .line 421
    .line 422
    long-to-double v14, v3

    .line 423
    div-double v14, v20, v14

    .line 424
    .line 425
    invoke-static/range {v34 .. v35}, Lu90;->δ(J)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    move-wide/from16 v20, v3

    .line 430
    .line 431
    invoke-static/range {v20 .. v21}, Lu90;->δ(J)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    const-string v4, "%.1f"

    .line 436
    .line 437
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v14

    .line 445
    const/4 v15, 0x1

    .line 446
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v14

    .line 450
    invoke-static {v4, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-static/range {v36 .. v37}, Lu90;->δ(J)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v14

    .line 458
    new-instance v15, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    .line 462
    .line 463
    move-object/from16 v36, v6

    .line 464
    .line 465
    const-string v6, "GeoNames \u4e0b\u8f7d\u8fdb\u5ea6\uff1a"

    .line 466
    .line 467
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    const-string v6, " MB/"

    .line 474
    .line 475
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    const-string v3, " MB ("

    .line 482
    .line 483
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    const-string v3, "%)\uff0c\u901f\u5ea6="

    .line 490
    .line 491
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string v3, " MB/s\uff0c\u7b2c "

    .line 498
    .line 499
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    const-string v3, "/8 \u4e2a\u5206\u5377\uff0cURL="

    .line 506
    .line 507
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    const/4 v4, 0x4

    .line 518
    const/4 v12, 0x0

    .line 519
    invoke-static {v5, v3, v12, v4, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 520
    .line 521
    .line 522
    move-wide/from16 v26, v41

    .line 523
    .line 524
    :goto_7
    cmp-long v3, v24, v39

    .line 525
    .line 526
    if-ltz v3, :cond_8

    .line 527
    .line 528
    move-object/from16 v3, v28

    .line 529
    .line 530
    move-object/from16 v4, v31

    .line 531
    .line 532
    move-wide/from16 v14, v32

    .line 533
    .line 534
    move-wide/from16 v16, v34

    .line 535
    .line 536
    move-wide/from16 v24, v16

    .line 537
    .line 538
    move-object/from16 v6, v36

    .line 539
    .line 540
    move-wide/from16 v22, v41

    .line 541
    .line 542
    move-wide/from16 v29, v22

    .line 543
    .line 544
    goto/16 :goto_2

    .line 545
    .line 546
    :cond_8
    move-object/from16 v3, v28

    .line 547
    .line 548
    move-object/from16 v4, v31

    .line 549
    .line 550
    move-wide/from16 v14, v32

    .line 551
    .line 552
    move-wide/from16 v24, v34

    .line 553
    .line 554
    move-object/from16 v6, v36

    .line 555
    .line 556
    move-wide/from16 v29, v41

    .line 557
    .line 558
    goto/16 :goto_2

    .line 559
    .line 560
    :catchall_1
    move-exception v0

    .line 561
    :goto_8
    move-object v1, v0

    .line 562
    goto :goto_b

    .line 563
    :catchall_2
    move-exception v0

    .line 564
    move-object/from16 v31, v4

    .line 565
    .line 566
    goto :goto_8

    .line 567
    :cond_9
    move-object/from16 v31, v4

    .line 568
    .line 569
    goto/16 :goto_2

    .line 570
    .line 571
    :cond_a
    move-object/from16 v28, v3

    .line 572
    .line 573
    move-object/from16 v31, v4

    .line 574
    .line 575
    cmp-long v3, v14, v8

    .line 576
    .line 577
    if-nez v3, :cond_b

    .line 578
    .line 579
    :try_start_6
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 580
    .line 581
    .line 582
    :try_start_7
    invoke-interface {v10}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v31 .. v31}, Lzn1;->close()V

    .line 586
    .line 587
    .line 588
    const/4 v12, 0x0

    .line 589
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    add-int/lit8 v9, v13, 0x1

    .line 593
    .line 594
    move-wide/from16 v4, v22

    .line 595
    .line 596
    move-wide/from16 v10, v24

    .line 597
    .line 598
    move-wide/from16 v14, v26

    .line 599
    .line 600
    move-object/from16 v3, v28

    .line 601
    .line 602
    move-wide/from16 v12, v29

    .line 603
    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :catchall_3
    move-exception v0

    .line 607
    :goto_9
    move-object v1, v0

    .line 608
    goto :goto_d

    .line 609
    :catchall_4
    move-exception v0

    .line 610
    :goto_a
    move-object v1, v0

    .line 611
    goto :goto_c

    .line 612
    :cond_b
    :try_start_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string v1, " \u4e2a\u5206\u5377\u4e0d\u5b8c\u6574: "

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    const-string v1, "/"

    .line 632
    .line 633
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 653
    :goto_b
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 654
    :catchall_5
    move-exception v0

    .line 655
    :try_start_a
    invoke-static {v11, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 656
    .line 657
    .line 658
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 659
    :catchall_6
    move-exception v0

    .line 660
    move-object/from16 v31, v4

    .line 661
    .line 662
    goto :goto_a

    .line 663
    :goto_c
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 664
    :catchall_7
    move-exception v0

    .line 665
    :try_start_c
    invoke-static {v10, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 666
    .line 667
    .line 668
    throw v0

    .line 669
    :catchall_8
    move-exception v0

    .line 670
    move-object/from16 v31, v4

    .line 671
    .line 672
    goto :goto_9

    .line 673
    :cond_c
    move-object/from16 v31, v4

    .line 674
    .line 675
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 676
    .line 677
    const-string v1, "\u54cd\u5e94\u5185\u5bb9\u4e3a\u7a7a"

    .line 678
    .line 679
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    throw v0

    .line 683
    :cond_d
    move-object/from16 v31, v4

    .line 684
    .line 685
    new-instance v0, Ljava/lang/StringBuilder;

    .line 686
    .line 687
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 688
    .line 689
    .line 690
    const-string v1, "HTTP "

    .line 691
    .line 692
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 712
    :goto_d
    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 713
    :catchall_9
    move-exception v0

    .line 714
    move-object/from16 v2, v31

    .line 715
    .line 716
    invoke-static {v2, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 717
    .line 718
    .line 719
    throw v0

    .line 720
    :cond_e
    move-object/from16 v28, v3

    .line 721
    .line 722
    invoke-static/range {p2 .. p2}, Lu90;->α(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 723
    .line 724
    .line 725
    new-instance v0, Ljava/io/File;

    .line 726
    .line 727
    const-string v2, "geonames_regions.zip"

    .line 728
    .line 729
    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    new-instance v4, Ljava/io/FileOutputStream;

    .line 733
    .line 734
    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 735
    .line 736
    .line 737
    :try_start_e
    new-instance v5, Lxm0;

    .line 738
    .line 739
    const/16 v6, 0x8

    .line 740
    .line 741
    const/4 v15, 0x1

    .line 742
    invoke-direct {v5, v15, v6, v15}, Lvm0;-><init>(III)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v5}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    :goto_e
    move-object v7, v5

    .line 750
    check-cast v7, Lwm0;

    .line 751
    .line 752
    iget-boolean v7, v7, Lwm0;->η:Z

    .line 753
    .line 754
    const/16 v9, 0x2000

    .line 755
    .line 756
    if-eqz v7, :cond_f

    .line 757
    .line 758
    move-object v7, v5

    .line 759
    check-cast v7, Lwm0;

    .line 760
    .line 761
    invoke-virtual {v7}, Lwm0;->nextInt()I

    .line 762
    .line 763
    .line 764
    move-result v7

    .line 765
    new-instance v10, Ljava/io/FileInputStream;

    .line 766
    .line 767
    new-instance v11, Ljava/io/File;

    .line 768
    .line 769
    new-instance v12, Ljava/lang/StringBuilder;

    .line 770
    .line 771
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v7

    .line 784
    invoke-direct {v11, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    invoke-direct {v10, v11}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 788
    .line 789
    .line 790
    :try_start_f
    invoke-static {v10, v4, v9}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 791
    .line 792
    .line 793
    :try_start_10
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 794
    .line 795
    .line 796
    goto :goto_e

    .line 797
    :catchall_a
    move-exception v0

    .line 798
    move-object v1, v0

    .line 799
    goto/16 :goto_1a

    .line 800
    .line 801
    :catchall_b
    move-exception v0

    .line 802
    move-object v1, v0

    .line 803
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 804
    :catchall_c
    move-exception v0

    .line 805
    :try_start_12
    invoke-static {v10, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 806
    .line 807
    .line 808
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 809
    :cond_f
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 813
    .line 814
    .line 815
    move-result-wide v4

    .line 816
    const-wide/32 v20, 0xb0d53cf

    .line 817
    .line 818
    .line 819
    cmp-long v4, v4, v20

    .line 820
    .line 821
    if-nez v4, :cond_1d

    .line 822
    .line 823
    new-instance v10, Lr90;

    .line 824
    .line 825
    const-wide/16 v14, 0x0

    .line 826
    .line 827
    const-string v16, "\u6b63\u5728\u6821\u9a8c\u538b\u7f29\u5305\u5b8c\u6574\u6027"

    .line 828
    .line 829
    sget-object v11, Lq90;->ζ:Lq90;

    .line 830
    .line 831
    const-wide/32 v12, 0xb0d53cf

    .line 832
    .line 833
    .line 834
    invoke-direct/range {v10 .. v16}, Lr90;-><init>(Lq90;JJLjava/lang/String;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1, v10}, Lm90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    new-instance v4, Ljava/io/File;

    .line 841
    .line 842
    const-string v5, "geonames_regions.sqlite.tmp"

    .line 843
    .line 844
    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 848
    .line 849
    .line 850
    new-instance v10, Lr90;

    .line 851
    .line 852
    const-string v16, "\u6b63\u5728\u89e3\u538b\u5e76\u6821\u9a8c SQLite \u6570\u636e\u5e93"

    .line 853
    .line 854
    sget-object v11, Lq90;->η:Lq90;

    .line 855
    .line 856
    invoke-direct/range {v10 .. v16}, Lr90;-><init>(Lq90;JJLjava/lang/String;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1, v10}, Lm90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    new-instance v3, Ljava/util/zip/ZipInputStream;

    .line 863
    .line 864
    new-instance v5, Ljava/io/FileInputStream;

    .line 865
    .line 866
    invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 867
    .line 868
    .line 869
    invoke-direct {v3, v5}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 870
    .line 871
    .line 872
    :try_start_13
    invoke-virtual {v3}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    const/4 v5, 0x0

    .line 877
    :goto_f
    if-eqz v0, :cond_11

    .line 878
    .line 879
    invoke-static/range {p2 .. p2}, Lu90;->α(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 883
    .line 884
    .line 885
    move-result v7

    .line 886
    if-nez v7, :cond_10

    .line 887
    .line 888
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    const/16 v7, 0x2f

    .line 896
    .line 897
    invoke-static {v0, v7, v0}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    const-string v7, "geonames_regions.sqlite"

    .line 902
    .line 903
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v0

    .line 907
    if-eqz v0, :cond_10

    .line 908
    .line 909
    new-instance v5, Ljava/io/FileOutputStream;

    .line 910
    .line 911
    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    .line 912
    .line 913
    .line 914
    :try_start_14
    invoke-static {v3, v5, v9}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 915
    .line 916
    .line 917
    :try_start_15
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 918
    .line 919
    .line 920
    const/4 v5, 0x1

    .line 921
    goto :goto_10

    .line 922
    :catchall_d
    move-exception v0

    .line 923
    move-object v1, v0

    .line 924
    goto/16 :goto_19

    .line 925
    .line 926
    :catchall_e
    move-exception v0

    .line 927
    move-object v1, v0

    .line 928
    :try_start_16
    throw v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    .line 929
    :catchall_f
    move-exception v0

    .line 930
    :try_start_17
    invoke-static {v5, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 931
    .line 932
    .line 933
    throw v0

    .line 934
    :cond_10
    :goto_10
    invoke-virtual {v3}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 935
    .line 936
    .line 937
    move-result-object v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 938
    goto :goto_f

    .line 939
    :cond_11
    if-eqz v5, :cond_1c

    .line 940
    .line 941
    invoke-virtual {v3}, Ljava/util/zip/ZipInputStream;->close()V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 945
    .line 946
    .line 947
    move-result-wide v9

    .line 948
    const-wide/32 v11, 0x21887000

    .line 949
    .line 950
    .line 951
    cmp-long v0, v9, v11

    .line 952
    .line 953
    if-nez v0, :cond_1b

    .line 954
    .line 955
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    const/4 v12, 0x0

    .line 960
    const/4 v15, 0x1

    .line 961
    invoke-static {v0, v12, v15}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    :try_start_18
    const-string v0, "PRAGMA integrity_check"

    .line 966
    .line 967
    invoke-virtual {v3, v0, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 968
    .line 969
    .line 970
    move-result-object v5
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_11

    .line 971
    :try_start_19
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    if-eqz v0, :cond_1a

    .line 976
    .line 977
    const/4 v0, 0x0

    .line 978
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v7

    .line 982
    const-string v0, "ok"

    .line 983
    .line 984
    invoke-static {v7, v0}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 985
    .line 986
    .line 987
    move-result v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_13

    .line 988
    if-eqz v0, :cond_1a

    .line 989
    .line 990
    :try_start_1a
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 991
    .line 992
    .line 993
    const-string v0, "geonames"

    .line 994
    .line 995
    const-string v5, "countries"

    .line 996
    .line 997
    const-string v7, "admin1"

    .line 998
    .line 999
    const-string v9, "admin2"

    .line 1000
    .line 1001
    filled-new-array {v0, v5, v7, v9}, [Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    const-string v5, "SELECT name FROM sqlite_master WHERE type=\'table\'"

    .line 1010
    .line 1011
    const/4 v12, 0x0

    .line 1012
    invoke-virtual {v3, v5, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v5
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_11

    .line 1016
    :try_start_1b
    new-instance v7, Lws1;

    .line 1017
    .line 1018
    invoke-direct {v7}, Lws1;-><init>()V

    .line 1019
    .line 1020
    .line 1021
    :goto_11
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v9

    .line 1025
    if-eqz v9, :cond_12

    .line 1026
    .line 1027
    const/4 v9, 0x0

    .line 1028
    invoke-interface {v5, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v10

    .line 1032
    invoke-virtual {v7, v10}, Lws1;->add(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    goto :goto_11

    .line 1036
    :catchall_10
    move-exception v0

    .line 1037
    move-object v1, v0

    .line 1038
    goto/16 :goto_16

    .line 1039
    .line 1040
    :cond_12
    iget-object v9, v7, Lws1;->ε:Lzw0;

    .line 1041
    .line 1042
    invoke-virtual {v9}, Lzw0;->β()Lzw0;

    .line 1043
    .line 1044
    .line 1045
    iget v9, v9, Lzw0;->ν:I

    .line 1046
    .line 1047
    if-lez v9, :cond_13

    .line 1048
    .line 1049
    goto :goto_12

    .line 1050
    :cond_13
    sget-object v7, Lws1;->ζ:Lws1;

    .line 1051
    .line 1052
    :goto_12
    check-cast v0, Ljava/lang/Iterable;

    .line 1053
    .line 1054
    instance-of v9, v0, Ljava/util/Collection;

    .line 1055
    .line 1056
    if-eqz v9, :cond_14

    .line 1057
    .line 1058
    move-object v9, v0

    .line 1059
    check-cast v9, Ljava/util/Collection;

    .line 1060
    .line 1061
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v9

    .line 1065
    if-eqz v9, :cond_14

    .line 1066
    .line 1067
    goto :goto_14

    .line 1068
    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v9

    .line 1076
    if-eqz v9, :cond_16

    .line 1077
    .line 1078
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v9

    .line 1082
    check-cast v9, Ljava/lang/String;

    .line 1083
    .line 1084
    iget-object v10, v7, Lws1;->ε:Lzw0;

    .line 1085
    .line 1086
    invoke-virtual {v10, v9}, Lzw0;->containsKey(Ljava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v9

    .line 1090
    if-eqz v9, :cond_15

    .line 1091
    .line 1092
    goto :goto_13

    .line 1093
    :cond_15
    const-string v0, "SQLite \u8868\u7ed3\u6784\u4e0d\u5b8c\u6574"

    .line 1094
    .line 1095
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1096
    .line 1097
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    throw v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 1101
    :cond_16
    :goto_14
    :try_start_1c
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    .line 1102
    .line 1103
    .line 1104
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 1105
    .line 1106
    .line 1107
    invoke-static/range {p2 .. p2}, Lu90;->α(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-static/range {p0 .. p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1115
    .line 1116
    .line 1117
    invoke-static/range {p0 .. p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    invoke-virtual {v4, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v0

    .line 1125
    if-eqz v0, :cond_19

    .line 1126
    .line 1127
    invoke-static/range {p0 .. p0}, Lu90;->ε(Landroid/content/Context;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eqz v0, :cond_18

    .line 1132
    .line 1133
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    new-instance v3, Ljava/io/File;

    .line 1138
    .line 1139
    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 1143
    .line 1144
    .line 1145
    new-instance v2, Lxm0;

    .line 1146
    .line 1147
    const/4 v15, 0x1

    .line 1148
    invoke-direct {v2, v15, v6, v15}, Lvm0;-><init>(III)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v2}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    :goto_15
    move-object v3, v2

    .line 1156
    check-cast v3, Lwm0;

    .line 1157
    .line 1158
    iget-boolean v4, v3, Lwm0;->η:Z

    .line 1159
    .line 1160
    if-eqz v4, :cond_17

    .line 1161
    .line 1162
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 1163
    .line 1164
    .line 1165
    move-result v3

    .line 1166
    new-instance v4, Ljava/io/File;

    .line 1167
    .line 1168
    invoke-static {v8, v3}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v3

    .line 1172
    invoke-direct {v4, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 1176
    .line 1177
    .line 1178
    goto :goto_15

    .line 1179
    :cond_17
    new-instance v9, Lr90;

    .line 1180
    .line 1181
    const-wide/16 v13, 0x0

    .line 1182
    .line 1183
    const-string v15, "\u6570\u636e\u5e93\u6821\u9a8c\u5b8c\u6210"

    .line 1184
    .line 1185
    sget-object v10, Lq90;->θ:Lq90;

    .line 1186
    .line 1187
    const-wide/32 v11, 0xb0d53cf

    .line 1188
    .line 1189
    .line 1190
    invoke-direct/range {v9 .. v15}, Lr90;-><init>(Lq90;JJLjava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v1, v9}, Lm90;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    return-void

    .line 1197
    :cond_18
    const-string v0, "SQLite \u6587\u4ef6\u5927\u5c0f\u6821\u9a8c\u5931\u8d25"

    .line 1198
    .line 1199
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    return-void

    .line 1203
    :cond_19
    const-string v0, "SQLite \u6587\u4ef6\u5b89\u88c5\u5931\u8d25"

    .line 1204
    .line 1205
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    return-void

    .line 1209
    :catchall_11
    move-exception v0

    .line 1210
    move-object v1, v0

    .line 1211
    goto :goto_18

    .line 1212
    :goto_16
    :try_start_1d
    throw v1
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_12

    .line 1213
    :catchall_12
    move-exception v0

    .line 1214
    :try_start_1e
    invoke-static {v5, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1215
    .line 1216
    .line 1217
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_11

    .line 1218
    :catchall_13
    move-exception v0

    .line 1219
    move-object v1, v0

    .line 1220
    goto :goto_17

    .line 1221
    :cond_1a
    :try_start_1f
    const-string v0, "SQLite integrity_check \u672a\u901a\u8fc7"

    .line 1222
    .line 1223
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1224
    .line 1225
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    throw v1
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_13

    .line 1229
    :goto_17
    :try_start_20
    throw v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_14

    .line 1230
    :catchall_14
    move-exception v0

    .line 1231
    :try_start_21
    invoke-static {v5, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1232
    .line 1233
    .line 1234
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_11

    .line 1235
    :goto_18
    :try_start_22
    throw v1
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_15

    .line 1236
    :catchall_15
    move-exception v0

    .line 1237
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1238
    .line 1239
    .line 1240
    throw v0

    .line 1241
    :cond_1b
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v0

    .line 1245
    const-string v2, "SQLite \u6587\u4ef6\u957f\u5ea6\u5f02\u5e38: "

    .line 1246
    .line 1247
    invoke-static {v0, v1, v2}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    invoke-static {v0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 1252
    .line 1253
    .line 1254
    return-void

    .line 1255
    :cond_1c
    :try_start_23
    const-string v0, "\u538b\u7f29\u5305\u4e2d\u7f3a\u5c11 geonames_regions.sqlite"

    .line 1256
    .line 1257
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1258
    .line 1259
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    throw v1
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_d

    .line 1263
    :goto_19
    :try_start_24
    throw v1
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_16

    .line 1264
    :catchall_16
    move-exception v0

    .line 1265
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1266
    .line 1267
    .line 1268
    throw v0

    .line 1269
    :cond_1d
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 1270
    .line 1271
    .line 1272
    move-result-wide v0

    .line 1273
    const-string v2, "\u5408\u5e76\u538b\u7f29\u5305\u957f\u5ea6\u5f02\u5e38: "

    .line 1274
    .line 1275
    invoke-static {v0, v1, v2}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    invoke-static {v0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    return-void

    .line 1283
    :goto_1a
    :try_start_25
    throw v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_17

    .line 1284
    :catchall_17
    move-exception v0

    .line 1285
    invoke-static {v4, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1286
    .line 1287
    .line 1288
    throw v0
.end method

.method public static δ(J)Ljava/lang/String;
    .locals 2

    .line 1
    long-to-double p0, p0

    .line 2
    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    .line 3
    .line 4
    div-double/2addr p0, v0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "%.1f"

    .line 19
    .line 20
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static ε(Landroid/content/Context;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/32 v2, 0x21887000

    .line 23
    .line 24
    .line 25
    cmp-long p0, v0, v2

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static ζ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static η(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {p0}, Lu90;->ε(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-static {p1, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_9

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    :try_start_0
    invoke-static {p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-static {p0, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    :try_start_1
    const-string v5, "SELECT c.name,a1.name,a2.name,g.name FROM geonames g LEFT JOIN countries c ON c.country_code=g.country_code LEFT JOIN admin1 a1 ON a1.country_code=g.country_code AND a1.admin1_code=g.admin1_code LEFT JOIN admin2 a2 ON a2.country_code=g.country_code AND a2.admin1_code=g.admin1_code AND a2.admin2_code=g.admin2_code WHERE g.geoname_id=? ORDER BY g.population DESC LIMIT 1"

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    filled-new-array {v2}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 46
    .line 47
    .line 48
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 49
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    move-object v0, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    new-instance v3, Lxm0;

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x3

    .line 61
    invoke-direct {v3, v5, v6, v4}, Lvm0;-><init>(III)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-static {v3, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_0
    move-object v3, v0

    .line 78
    check-cast v3, Lwm0;

    .line 79
    .line 80
    iget-boolean v3, v3, Lwm0;->η:Z

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    move-object v3, v0

    .line 85
    check-cast v3, Lwm0;

    .line 86
    .line 87
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    move-object v3, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :goto_1
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object v3, v0

    .line 109
    goto :goto_4

    .line 110
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    move-object v5, v4

    .line 130
    check-cast v5, Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const-string v4, " \u00b7 "

    .line 146
    .line 147
    const/4 v8, 0x0

    .line 148
    const/16 v9, 0x3e

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    :goto_3
    :try_start_3
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 158
    .line 159
    .line 160
    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 161
    .line 162
    .line 163
    goto :goto_7

    .line 164
    :catchall_1
    move-exception v0

    .line 165
    move-object p0, v0

    .line 166
    goto :goto_6

    .line 167
    :catchall_2
    move-exception v0

    .line 168
    move-object v2, v0

    .line 169
    goto :goto_5

    .line 170
    :goto_4
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 171
    :catchall_3
    move-exception v0

    .line 172
    :try_start_6
    invoke-static {v2, v3}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 176
    :goto_5
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 177
    :catchall_4
    move-exception v0

    .line 178
    :try_start_8
    invoke-static {p0, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 182
    :goto_6
    new-instance v0, Leo1;

    .line 183
    .line 184
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :goto_7
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-eqz p0, :cond_7

    .line 192
    .line 193
    const-string v2, "\u56fd\u5916\u5730\u533a\u67e5\u8be2\u5931\u8d25 code="

    .line 194
    .line 195
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    const-string v2, "raf02e3c7781e553e"

    .line 200
    .line 201
    invoke-static {v2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    instance-of p0, v0, Leo1;

    .line 205
    .line 206
    if-eqz p0, :cond_8

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_8
    move-object v1, v0

    .line 210
    :goto_8
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    :cond_9
    :goto_9
    return-object v1
.end method

.method public static θ(Landroid/content/Context;Ljava/lang/String;Lp70;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    sget-object v0, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-static {p1}, Lu90;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v0, Lu90;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 34
    .line 35
    new-instance v1, Le9;

    .line 36
    .line 37
    const/16 v2, 0xe

    .line 38
    .line 39
    invoke-direct {v1, p1, p0, p2, v2}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    const-string p0, "DY-GeoNames-Query"

    .line 43
    .line 44
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    :goto_0
    invoke-interface {p2}, Lp70;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void
.end method
