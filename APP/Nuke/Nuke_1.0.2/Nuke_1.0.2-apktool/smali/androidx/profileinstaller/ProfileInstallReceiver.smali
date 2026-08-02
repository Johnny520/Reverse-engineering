.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_29

    .line 8
    .line 9
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "androidx.profileinstaller.action.INSTALL_PROFILE"

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x6

    .line 20
    const/4 v5, 0x0

    .line 21
    const-string v6, "ProfileInstaller"

    .line 22
    .line 23
    const/4 v7, 0x7

    .line 24
    const/4 v8, 0x0

    .line 25
    if-eqz v3, :cond_15

    .line 26
    .line 27
    new-instance v11, Lp32;

    .line 28
    .line 29
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v12, Lhh1;

    .line 33
    .line 34
    invoke-direct {v12, v4, v0}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    new-instance v0, Ljava/io/File;

    .line 54
    .line 55
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :try_start_0
    invoke-virtual {v0, v2, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 69
    .line 70
    .line 71
    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_f

    .line 72
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v9, "Installing profile for "

    .line 79
    .line 80
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    sget-object v6, Lqp0;->o:[B

    .line 98
    .line 99
    new-instance v14, Ljava/io/File;

    .line 100
    .line 101
    new-instance v0, Ljava/io/File;

    .line 102
    .line 103
    const-string v9, "/data/misc/profiles/cur/0"

    .line 104
    .line 105
    invoke-direct {v0, v9, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v2, "primary.prof"

    .line 109
    .line 110
    invoke-direct {v14, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v9, Lp70;

    .line 114
    .line 115
    const-string v0, "dexopt/baseline.prof"

    .line 116
    .line 117
    invoke-direct/range {v9 .. v14}, Lp70;-><init>(Landroid/content/res/AssetManager;Lp32;Lhh1;Ljava/lang/String;Ljava/io/File;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v9, Lp70;->b:[B

    .line 121
    .line 122
    if-nez v2, :cond_1

    .line 123
    .line 124
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const/4 v2, 0x3

    .line 131
    invoke-virtual {v9, v2, v0}, Lp70;->b(ILjava/io/Serializable;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_26

    .line 135
    .line 136
    :cond_1
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    const/4 v13, 0x4

    .line 141
    if-eqz v11, :cond_2

    .line 142
    .line 143
    invoke-virtual {v14}, Ljava/io/File;->canWrite()Z

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    if-nez v11, :cond_3

    .line 148
    .line 149
    invoke-virtual {v9, v13, v8}, Lp70;->b(ILjava/io/Serializable;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_26

    .line 153
    .line 154
    :cond_2
    :try_start_1
    invoke-virtual {v14}, Ljava/io/File;->createNewFile()Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-nez v11, :cond_3

    .line 159
    .line 160
    invoke-virtual {v9, v13, v8}, Lp70;->b(ILjava/io/Serializable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_e

    .line 161
    .line 162
    .line 163
    goto/16 :goto_26

    .line 164
    .line 165
    :cond_3
    const/4 v11, 0x1

    .line 166
    iput-boolean v11, v9, Lp70;->e:Z

    .line 167
    .line 168
    :try_start_2
    invoke-virtual {v9, v10, v0}, Lp70;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 172
    move-object v14, v0

    .line 173
    goto :goto_1

    .line 174
    :catch_0
    move-exception v0

    .line 175
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :catch_1
    move-exception v0

    .line 180
    invoke-virtual {v12, v4, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :goto_0
    move-object v14, v8

    .line 184
    :goto_1
    const-string v4, "Invalid magic"

    .line 185
    .line 186
    const/16 v11, 0x8

    .line 187
    .line 188
    if-eqz v14, :cond_5

    .line 189
    .line 190
    :try_start_3
    invoke-static {v14, v13}, Lt11;->J(Ljava/io/InputStream;I)[B

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v6, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_4

    .line 199
    .line 200
    invoke-static {v14, v13}, Lt11;->J(Ljava/io/InputStream;I)[B

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v5, v9, Lp70;->d:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v14, v0, v5}, Lqp0;->Q(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh80;

    .line 207
    .line 208
    .line 209
    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    :try_start_4
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :catch_2
    move-exception v0

    .line 215
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    move-object v1, v0

    .line 221
    goto :goto_7

    .line 222
    :catch_3
    move-exception v0

    .line 223
    goto :goto_2

    .line 224
    :catch_4
    move-exception v0

    .line 225
    goto :goto_4

    .line 226
    :cond_4
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 232
    :goto_2
    :try_start_6
    invoke-virtual {v12, v11, v0}, Lhh1;->C(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 233
    .line 234
    .line 235
    :goto_3
    :try_start_7
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :catch_5
    move-exception v0

    .line 240
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :goto_4
    :try_start_8
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :goto_5
    move-object v5, v8

    .line 249
    :goto_6
    iput-object v5, v9, Lp70;->f:[Lh80;

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :goto_7
    :try_start_9
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :catch_6
    move-exception v0

    .line 257
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :goto_8
    throw v1

    .line 261
    :cond_5
    :goto_9
    iget-object v0, v9, Lp70;->f:[Lh80;

    .line 262
    .line 263
    if-eqz v0, :cond_9

    .line 264
    .line 265
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 266
    .line 267
    const/16 v14, 0x1f

    .line 268
    .line 269
    if-lt v5, v14, :cond_9

    .line 270
    .line 271
    :try_start_a
    const-string v5, "dexopt/baseline.profm"

    .line 272
    .line 273
    invoke-virtual {v9, v10, v5}, Lp70;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 274
    .line 275
    .line 276
    move-result-object v5
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_7

    .line 277
    if-eqz v5, :cond_7

    .line 278
    .line 279
    :try_start_b
    sget-object v10, Lqp0;->p:[B

    .line 280
    .line 281
    invoke-static {v5, v13}, Lt11;->J(Ljava/io/InputStream;I)[B

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    invoke-static {v10, v14}, Ljava/util/Arrays;->equals([B[B)Z

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    if-eqz v10, :cond_6

    .line 290
    .line 291
    invoke-static {v5, v13}, Lt11;->J(Ljava/io/InputStream;I)[B

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-static {v5, v4, v2, v0}, Lqp0;->N(Ljava/io/FileInputStream;[B[B[Lh80;)[Lh80;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iput-object v0, v9, Lp70;->f:[Lh80;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 300
    .line 301
    :try_start_c
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_7

    .line 302
    .line 303
    .line 304
    move-object v0, v9

    .line 305
    goto :goto_10

    .line 306
    :catch_7
    move-exception v0

    .line 307
    goto :goto_c

    .line 308
    :catch_8
    move-exception v0

    .line 309
    goto :goto_d

    .line 310
    :catch_9
    move-exception v0

    .line 311
    goto :goto_e

    .line 312
    :catchall_1
    move-exception v0

    .line 313
    move-object v2, v0

    .line 314
    goto :goto_a

    .line 315
    :cond_6
    :try_start_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 316
    .line 317
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 321
    :goto_a
    :try_start_e
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 322
    .line 323
    .line 324
    goto :goto_b

    .line 325
    :catchall_2
    move-exception v0

    .line 326
    :try_start_f
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    :goto_b
    throw v2

    .line 330
    :cond_7
    if-eqz v5, :cond_8

    .line 331
    .line 332
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/FileNotFoundException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_7

    .line 333
    .line 334
    .line 335
    goto :goto_f

    .line 336
    :goto_c
    iput-object v8, v9, Lp70;->f:[Lh80;

    .line 337
    .line 338
    invoke-virtual {v12, v11, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    goto :goto_f

    .line 342
    :goto_d
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    goto :goto_f

    .line 346
    :goto_e
    const/16 v2, 0x9

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_8
    :goto_f
    move-object v0, v8

    .line 352
    :goto_10
    if-eqz v0, :cond_9

    .line 353
    .line 354
    move-object v9, v0

    .line 355
    :cond_9
    iget-object v2, v9, Lp70;->a:Lhh1;

    .line 356
    .line 357
    iget-object v0, v9, Lp70;->f:[Lh80;

    .line 358
    .line 359
    iget-object v4, v9, Lp70;->b:[B

    .line 360
    .line 361
    const-string v5, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    .line 362
    .line 363
    if-eqz v0, :cond_d

    .line 364
    .line 365
    if-nez v4, :cond_a

    .line 366
    .line 367
    goto :goto_16

    .line 368
    :cond_a
    iget-boolean v10, v9, Lp70;->e:Z

    .line 369
    .line 370
    if-eqz v10, :cond_c

    .line 371
    .line 372
    :try_start_10
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 373
    .line 374
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_a

    .line 375
    .line 376
    .line 377
    :try_start_11
    invoke-virtual {v10, v6}, Ljava/io/OutputStream;->write([B)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v10, v4}, Ljava/io/OutputStream;->write([B)V

    .line 381
    .line 382
    .line 383
    invoke-static {v10, v4, v0}, Lqp0;->V(Ljava/io/ByteArrayOutputStream;[B[Lh80;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-nez v0, :cond_b

    .line 388
    .line 389
    const/4 v0, 0x5

    .line 390
    invoke-virtual {v2, v0, v8}, Lhh1;->C(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iput-object v8, v9, Lp70;->f:[Lh80;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 394
    .line 395
    :try_start_12
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_a

    .line 396
    .line 397
    .line 398
    goto :goto_16

    .line 399
    :catch_a
    move-exception v0

    .line 400
    goto :goto_13

    .line 401
    :catch_b
    move-exception v0

    .line 402
    goto :goto_14

    .line 403
    :catchall_3
    move-exception v0

    .line 404
    move-object v4, v0

    .line 405
    goto :goto_11

    .line 406
    :cond_b
    :try_start_13
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    iput-object v0, v9, Lp70;->g:[B
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 411
    .line 412
    :try_start_14
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_14 .. :try_end_14} :catch_a

    .line 413
    .line 414
    .line 415
    goto :goto_15

    .line 416
    :goto_11
    :try_start_15
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 417
    .line 418
    .line 419
    goto :goto_12

    .line 420
    :catchall_4
    move-exception v0

    .line 421
    :try_start_16
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    :goto_12
    throw v4
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_16 .. :try_end_16} :catch_a

    .line 425
    :goto_13
    invoke-virtual {v2, v11, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto :goto_15

    .line 429
    :goto_14
    invoke-virtual {v2, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :goto_15
    iput-object v8, v9, Lp70;->f:[Lh80;

    .line 433
    .line 434
    goto :goto_16

    .line 435
    :cond_c
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_d
    :goto_16
    iget-object v0, v9, Lp70;->g:[B

    .line 440
    .line 441
    if-nez v0, :cond_e

    .line 442
    .line 443
    :goto_17
    const/4 v5, 0x0

    .line 444
    goto/16 :goto_24

    .line 445
    .line 446
    :cond_e
    iget-boolean v2, v9, Lp70;->e:Z

    .line 447
    .line 448
    if-eqz v2, :cond_13

    .line 449
    .line 450
    :try_start_17
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 451
    .line 452
    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_17
    .catch Ljava/io/FileNotFoundException; {:try_start_17 .. :try_end_17} :catch_d
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_c
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 453
    .line 454
    .line 455
    :try_start_18
    new-instance v4, Ljava/io/FileOutputStream;

    .line 456
    .line 457
    iget-object v0, v9, Lp70;->c:Ljava/io/File;

    .line 458
    .line 459
    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    .line 460
    .line 461
    .line 462
    :try_start_19
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 463
    .line 464
    .line 465
    move-result-object v5
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    .line 466
    :try_start_1a
    invoke-virtual {v5}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 467
    .line 468
    .line 469
    move-result-object v6
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    .line 470
    if-eqz v6, :cond_10

    .line 471
    .line 472
    :try_start_1b
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->isValid()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_10

    .line 477
    .line 478
    const/16 v0, 0x200

    .line 479
    .line 480
    new-array v0, v0, [B

    .line 481
    .line 482
    :goto_18
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-lez v10, :cond_f

    .line 487
    .line 488
    const/4 v11, 0x0

    .line 489
    invoke-virtual {v4, v0, v11, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 490
    .line 491
    .line 492
    goto :goto_18

    .line 493
    :cond_f
    const/4 v10, 0x1

    .line 494
    invoke-virtual {v9, v10, v8}, Lp70;->b(ILjava/io/Serializable;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 495
    .line 496
    .line 497
    :try_start_1c
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    .line 498
    .line 499
    .line 500
    :try_start_1d
    invoke-virtual {v5}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    .line 501
    .line 502
    .line 503
    :try_start_1e
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    .line 504
    .line 505
    .line 506
    :try_start_1f
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1f
    .catch Ljava/io/FileNotFoundException; {:try_start_1f .. :try_end_1f} :catch_d
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_c
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    .line 507
    .line 508
    .line 509
    iput-object v8, v9, Lp70;->g:[B

    .line 510
    .line 511
    iput-object v8, v9, Lp70;->f:[Lh80;

    .line 512
    .line 513
    move v5, v10

    .line 514
    goto :goto_24

    .line 515
    :catchall_5
    move-exception v0

    .line 516
    goto :goto_25

    .line 517
    :catch_c
    move-exception v0

    .line 518
    goto :goto_21

    .line 519
    :catch_d
    move-exception v0

    .line 520
    const/4 v2, 0x6

    .line 521
    goto :goto_23

    .line 522
    :catchall_6
    move-exception v0

    .line 523
    move-object v4, v0

    .line 524
    goto :goto_1f

    .line 525
    :catchall_7
    move-exception v0

    .line 526
    move-object v5, v0

    .line 527
    goto :goto_1d

    .line 528
    :catchall_8
    move-exception v0

    .line 529
    move-object v6, v0

    .line 530
    goto :goto_1b

    .line 531
    :catchall_9
    move-exception v0

    .line 532
    move-object v10, v0

    .line 533
    goto :goto_19

    .line 534
    :cond_10
    :try_start_20
    new-instance v0, Ljava/io/IOException;

    .line 535
    .line 536
    const-string v10, "Unable to acquire a lock on the underlying file channel."

    .line 537
    .line 538
    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_9

    .line 542
    :goto_19
    if-eqz v6, :cond_11

    .line 543
    .line 544
    :try_start_21
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_a

    .line 545
    .line 546
    .line 547
    goto :goto_1a

    .line 548
    :catchall_a
    move-exception v0

    .line 549
    :try_start_22
    invoke-virtual {v10, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    :cond_11
    :goto_1a
    throw v10
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    .line 553
    :goto_1b
    if-eqz v5, :cond_12

    .line 554
    .line 555
    :try_start_23
    invoke-virtual {v5}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_b

    .line 556
    .line 557
    .line 558
    goto :goto_1c

    .line 559
    :catchall_b
    move-exception v0

    .line 560
    :try_start_24
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    :cond_12
    :goto_1c
    throw v6
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_7

    .line 564
    :goto_1d
    :try_start_25
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_c

    .line 565
    .line 566
    .line 567
    goto :goto_1e

    .line 568
    :catchall_c
    move-exception v0

    .line 569
    :try_start_26
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 570
    .line 571
    .line 572
    :goto_1e
    throw v5
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_6

    .line 573
    :goto_1f
    :try_start_27
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_d

    .line 574
    .line 575
    .line 576
    goto :goto_20

    .line 577
    :catchall_d
    move-exception v0

    .line 578
    :try_start_28
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 579
    .line 580
    .line 581
    :goto_20
    throw v4
    :try_end_28
    .catch Ljava/io/FileNotFoundException; {:try_start_28 .. :try_end_28} :catch_d
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_28} :catch_c
    .catchall {:try_start_28 .. :try_end_28} :catchall_5

    .line 582
    :goto_21
    :try_start_29
    invoke-virtual {v9, v7, v0}, Lp70;->b(ILjava/io/Serializable;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_5

    .line 583
    .line 584
    .line 585
    :goto_22
    iput-object v8, v9, Lp70;->g:[B

    .line 586
    .line 587
    iput-object v8, v9, Lp70;->f:[Lh80;

    .line 588
    .line 589
    goto/16 :goto_17

    .line 590
    .line 591
    :goto_23
    :try_start_2a
    invoke-virtual {v9, v2, v0}, Lp70;->b(ILjava/io/Serializable;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_5

    .line 592
    .line 593
    .line 594
    goto :goto_22

    .line 595
    :goto_24
    if-eqz v5, :cond_14

    .line 596
    .line 597
    invoke-static {v3, v15}, Lpp0;->z(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 598
    .line 599
    .line 600
    goto :goto_27

    .line 601
    :goto_25
    iput-object v8, v9, Lp70;->g:[B

    .line 602
    .line 603
    iput-object v8, v9, Lp70;->f:[Lh80;

    .line 604
    .line 605
    throw v0

    .line 606
    :cond_13
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :catch_e
    invoke-virtual {v9, v13, v8}, Lp70;->b(ILjava/io/Serializable;)V

    .line 611
    .line 612
    .line 613
    :goto_26
    const/4 v5, 0x0

    .line 614
    :cond_14
    :goto_27
    invoke-static {v1, v5}, Lr32;->c(Landroid/content/Context;Z)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_29

    .line 618
    .line 619
    :catch_f
    move-exception v0

    .line 620
    invoke-virtual {v12, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    const/4 v11, 0x0

    .line 624
    invoke-static {v1, v11}, Lr32;->c(Landroid/content/Context;Z)V

    .line 625
    .line 626
    .line 627
    goto/16 :goto_29

    .line 628
    .line 629
    :cond_15
    const-string v3, "androidx.profileinstaller.action.SKIP_FILE"

    .line 630
    .line 631
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    const/16 v4, 0xa

    .line 636
    .line 637
    if-eqz v3, :cond_17

    .line 638
    .line 639
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    if-eqz v2, :cond_1c

    .line 644
    .line 645
    const-string v3, "EXTRA_SKIP_FILE_OPERATION"

    .line 646
    .line 647
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const-string v3, "WRITE_SKIP_FILE"

    .line 652
    .line 653
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    if-eqz v3, :cond_16

    .line 658
    .line 659
    new-instance v2, Lhh1;

    .line 660
    .line 661
    const/4 v3, 0x6

    .line 662
    invoke-direct {v2, v3, v0}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    const/4 v11, 0x0

    .line 678
    :try_start_2b
    invoke-virtual {v3, v0, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 679
    .line 680
    .line 681
    move-result-object v0
    :try_end_2b
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2b .. :try_end_2b} :catch_10

    .line 682
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-static {v0, v1}, Lpp0;->z(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v4, v8}, Lhh1;->C(ILjava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    goto/16 :goto_29

    .line 693
    .line 694
    :catch_10
    move-exception v0

    .line 695
    invoke-virtual {v2, v7, v0}, Lhh1;->C(ILjava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    goto/16 :goto_29

    .line 699
    .line 700
    :cond_16
    const-string v3, "DELETE_SKIP_FILE"

    .line 701
    .line 702
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_1c

    .line 707
    .line 708
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    new-instance v2, Ljava/io/File;

    .line 713
    .line 714
    const-string v3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 715
    .line 716
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 720
    .line 721
    .line 722
    const-string v1, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 723
    .line 724
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 725
    .line 726
    .line 727
    const/16 v1, 0xb

    .line 728
    .line 729
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 730
    .line 731
    .line 732
    goto :goto_29

    .line 733
    :cond_17
    const-string v3, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 734
    .line 735
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-eqz v3, :cond_18

    .line 740
    .line 741
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    invoke-static {v1, v4}, Landroid/os/Process;->sendSignal(II)V

    .line 746
    .line 747
    .line 748
    const-string v1, ""

    .line 749
    .line 750
    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 751
    .line 752
    .line 753
    const/16 v1, 0xc

    .line 754
    .line 755
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :cond_18
    const-string v3, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 760
    .line 761
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v2

    .line 765
    if-eqz v2, :cond_1c

    .line 766
    .line 767
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    if-eqz v2, :cond_1c

    .line 772
    .line 773
    const-string v3, "EXTRA_BENCHMARK_OPERATION"

    .line 774
    .line 775
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    new-instance v3, Lhh1;

    .line 780
    .line 781
    const/4 v4, 0x6

    .line 782
    invoke-direct {v3, v4, v0}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    const-string v0, "DROP_SHADER_CACHE"

    .line 786
    .line 787
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    if-eqz v0, :cond_1b

    .line 792
    .line 793
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 794
    .line 795
    const/16 v2, 0x22

    .line 796
    .line 797
    if-lt v0, v2, :cond_19

    .line 798
    .line 799
    invoke-virtual {v1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    goto :goto_28

    .line 808
    :cond_19
    invoke-virtual {v1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-virtual {v0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    :goto_28
    invoke-static {v0}, Lsp0;->y(Ljava/io/File;)Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-eqz v0, :cond_1a

    .line 821
    .line 822
    const/16 v0, 0xe

    .line 823
    .line 824
    invoke-virtual {v3, v0, v8}, Lhh1;->C(ILjava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    return-void

    .line 828
    :cond_1a
    const/16 v0, 0xf

    .line 829
    .line 830
    invoke-virtual {v3, v0, v8}, Lhh1;->C(ILjava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :cond_1b
    const/16 v0, 0x10

    .line 835
    .line 836
    invoke-virtual {v3, v0, v8}, Lhh1;->C(ILjava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    :cond_1c
    :goto_29
    return-void
.end method
