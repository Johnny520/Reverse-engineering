.class public final synthetic Lvg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    .line 2
    iput p5, p0, Lvg0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvg0;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lvg0;->η:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lvg0;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lvg0;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lvg0;->ε:I

    iput-object p1, p0, Lvg0;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lvg0;->η:Ljava/lang/Object;

    iput-object p3, p0, Lvg0;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvg0;->ι:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvg0;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    iget-object v3, v0, Lvg0;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v4, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Landroid/graphics/Bitmap;

    .line 19
    .line 20
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v0

    .line 23
    check-cast v5, Lum1;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v6, "CroppedBitmapStore"

    .line 33
    .line 34
    const-string v7, "\u88c1\u526a\u56fe\u5df2\u4fdd\u5b58: "

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    :try_start_0
    new-instance v8, Ljava/io/File;

    .line 40
    .line 41
    const-string v9, "comment_bg"

    .line 42
    .line 43
    invoke-direct {v8, v0, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/io/File;

    .line 50
    .line 51
    const-string v9, "cropped.webp"

    .line 52
    .line 53
    invoke-direct {v0, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v8, Ljava/io/FileOutputStream;

    .line 57
    .line 58
    invoke-direct {v8, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_1
    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 62
    .line 63
    const/16 v10, 0x5f

    .line 64
    .line 65
    invoke-virtual {v3, v9, v10, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    :try_start_2
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    new-instance v10, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v7, " ("

    .line 99
    .line 100
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v7, "\u00d7"

    .line 107
    .line 108
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v7, ")"

    .line 115
    .line 116
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    move-object v2, v0

    .line 127
    goto :goto_1

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    goto :goto_0

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    move-object v7, v0

    .line 132
    :try_start_3
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    :try_start_4
    invoke-static {v8, v7}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v7, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v8, "\u4fdd\u5b58\u5931\u8d25: "

    .line 145
    .line 146
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_0

    .line 165
    .line 166
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 167
    .line 168
    .line 169
    :cond_0
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_1

    .line 174
    .line 175
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 176
    .line 177
    .line 178
    :cond_1
    new-instance v0, Ljg1;

    .line 179
    .line 180
    invoke-direct {v0, v2, v5, v1}, Ljg1;-><init>(Ljava/lang/String;Lum1;Landroid/app/Activity;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_0
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, Ljava/lang/ClassLoader;

    .line 190
    .line 191
    iget-object v3, v0, Lvg0;->η:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Ljava/util/Collection;

    .line 194
    .line 195
    iget-object v4, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v4, Lky1;

    .line 198
    .line 199
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v5, v0

    .line 202
    check-cast v5, Landroid/app/Activity;

    .line 203
    .line 204
    sget-object v8, Lgf1;->α:Lgf1;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    :try_start_5
    invoke-static {}, Lui1;->Α()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_e

    .line 218
    .line 219
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-lez v6, :cond_d

    .line 236
    .line 237
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 238
    .line 239
    .line 240
    move-result-object v15

    .line 241
    if-eqz v4, :cond_3

    .line 242
    .line 243
    invoke-static {v4}, Lgf1;->β(Lky1;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_2

    .line 248
    .line 249
    move-object v6, v4

    .line 250
    goto :goto_2

    .line 251
    :cond_2
    const/4 v6, 0x0

    .line 252
    :goto_2
    if-eqz v6, :cond_3

    .line 253
    .line 254
    invoke-virtual {v15, v6}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :catchall_3
    move-exception v0

    .line 259
    goto/16 :goto_7

    .line 260
    .line 261
    :cond_3
    :goto_3
    check-cast v3, Ljava/lang/Iterable;

    .line 262
    .line 263
    new-instance v6, Lf7;

    .line 264
    .line 265
    const/4 v7, 0x1

    .line 266
    invoke-direct {v6, v7, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object v3, v6

    .line 270
    new-instance v6, Lny0;

    .line 271
    .line 272
    const-class v9, Lgf1;

    .line 273
    .line 274
    const-string v10, "isValidSpark"

    .line 275
    .line 276
    const-string v11, "isValidSpark(Lcom/example/dyhelper/hook/SparkAutoRenewHook$SparkInfo;)Z"

    .line 277
    .line 278
    const/4 v12, 0x0

    .line 279
    const/16 v13, 0x11

    .line 280
    .line 281
    move/from16 v16, v7

    .line 282
    .line 283
    const/4 v7, 0x1

    .line 284
    move/from16 v2, v16

    .line 285
    .line 286
    invoke-direct/range {v6 .. v13}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 287
    .line 288
    .line 289
    new-instance v7, Ly30;

    .line 290
    .line 291
    invoke-direct {v7, v3, v2, v6}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 292
    .line 293
    .line 294
    new-instance v3, Lbf1;

    .line 295
    .line 296
    invoke-direct {v3, v4, v14}, Lbf1;-><init>(Lky1;I)V

    .line 297
    .line 298
    .line 299
    new-instance v4, Ly30;

    .line 300
    .line 301
    invoke-direct {v4, v7, v14, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 302
    .line 303
    .line 304
    new-instance v3, Lib1;

    .line 305
    .line 306
    const/16 v6, 0xb

    .line 307
    .line 308
    invoke-direct {v3, v6}, Lib1;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-static {v4, v3}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eqz v4, :cond_4

    .line 327
    .line 328
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    check-cast v4, Lky1;

    .line 333
    .line 334
    invoke-virtual {v15, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_4
    invoke-static {v15}, Lyh;->μ(Lzt0;)Lzt0;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v3}, Lzt0;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-nez v4, :cond_c

    .line 347
    .line 348
    invoke-virtual {v3, v14}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    const/16 v16, 0x0

    .line 353
    .line 354
    :cond_5
    :goto_5
    move-object v4, v3

    .line 355
    check-cast v4, Lle0;

    .line 356
    .line 357
    invoke-virtual {v4}, Lle0;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-eqz v6, :cond_a

    .line 362
    .line 363
    invoke-virtual {v4}, Lle0;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    check-cast v4, Lky1;

    .line 368
    .line 369
    iget-wide v6, v4, Lky1;->β:J

    .line 370
    .line 371
    invoke-static {v1, v6, v7}, Lp91;->κ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    instance-of v6, v4, Leo1;

    .line 376
    .line 377
    if-eqz v6, :cond_6

    .line 378
    .line 379
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 380
    .line 381
    .line 382
    move-result-object v16

    .line 383
    goto/16 :goto_6

    .line 384
    .line 385
    :cond_6
    invoke-static {v4}, Li81;->Β(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    check-cast v4, Lxe1;

    .line 389
    .line 390
    invoke-virtual {v4}, Lxe1;->α()Z

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    if-nez v6, :cond_7

    .line 395
    .line 396
    iget v4, v4, Lxe1;->γ:I

    .line 397
    .line 398
    const v6, 0xf2ad8

    .line 399
    .line 400
    .line 401
    if-eq v4, v6, :cond_5

    .line 402
    .line 403
    new-instance v6, Ljava/lang/IllegalStateException;

    .line 404
    .line 405
    new-instance v7, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    const-string v8, "\u98df\u7269\u76ee\u5f55\u4e1a\u52a1\u5931\u8d25 code="

    .line 411
    .line 412
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-direct {v6, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    move-object/from16 v16, v6

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_7
    iget-object v4, v4, Lxe1;->ζ:Ljava/util/List;

    .line 429
    .line 430
    new-instance v6, Lf7;

    .line 431
    .line 432
    invoke-direct {v6, v2, v4}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    new-instance v4, Lcf1;

    .line 436
    .line 437
    invoke-direct {v4, v14}, Lcf1;-><init>(I)V

    .line 438
    .line 439
    .line 440
    new-instance v7, Ly30;

    .line 441
    .line 442
    invoke-direct {v7, v6, v2, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 443
    .line 444
    .line 445
    sget-object v4, Lff1;->ζ:Lff1;

    .line 446
    .line 447
    new-instance v6, Lcu;

    .line 448
    .line 449
    invoke-direct {v6, v7, v14, v4}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    new-instance v4, Lcf1;

    .line 453
    .line 454
    invoke-direct {v4, v2}, Lcf1;-><init>(I)V

    .line 455
    .line 456
    .line 457
    new-instance v7, Lt52;

    .line 458
    .line 459
    invoke-direct {v7, v6, v4}, Lt52;-><init>(Lss1;La80;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v7}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    if-eqz v6, :cond_8

    .line 471
    .line 472
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 473
    .line 474
    const-string v6, "\u670d\u52a1\u7aef\u8fd4\u56de\u7684\u666e\u901a\u98df\u7269\u76ee\u5f55\u4e3a\u7a7a"

    .line 475
    .line 476
    invoke-direct {v4, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v16, v4

    .line 480
    .line 481
    goto :goto_5

    .line 482
    :cond_8
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_9

    .line 499
    .line 500
    invoke-static {v4}, Lgf1;->ε(Ljava/util/List;)Lef1;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    goto :goto_8

    .line 505
    :cond_9
    const-string v0, "\u8d26\u53f7\u5df2\u5207\u6362\uff0c\u653e\u5f03\u5199\u5165\u65e7\u8d26\u53f7\u98df\u7269\u76ee\u5f55"

    .line 506
    .line 507
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 508
    .line 509
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    throw v1

    .line 513
    :cond_a
    :goto_6
    if-nez v16, :cond_b

    .line 514
    .line 515
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 516
    .line 517
    const-string v1, "\u6ca1\u6709\u53ef\u7528\u7684\u5c0f\u706b\u4eba\u98df\u7269\u76ee\u5f55"

    .line 518
    .line 519
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    move-object/from16 v16, v0

    .line 523
    .line 524
    :cond_b
    throw v16

    .line 525
    :cond_c
    const-string v0, "\u6ca1\u6709\u5df2\u8bc6\u522b\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd"

    .line 526
    .line 527
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 528
    .line 529
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v1

    .line 533
    :cond_d
    const-string v0, "\u5f53\u524d\u8d26\u53f7 UID \u4e0d\u53ef\u7528"

    .line 534
    .line 535
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 536
    .line 537
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v1

    .line 541
    :cond_e
    const-string v0, "\u8d26\u53f7\u914d\u7f6e\u5c1a\u672a\u521d\u59cb\u5316"

    .line 542
    .line 543
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 544
    .line 545
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 549
    :goto_7
    new-instance v1, Leo1;

    .line 550
    .line 551
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 552
    .line 553
    .line 554
    move-object v0, v1

    .line 555
    :goto_8
    sget-object v1, Lpf1;->α:Ljava/lang/Object;

    .line 556
    .line 557
    monitor-enter v1

    .line 558
    :try_start_6
    sput-boolean v14, Lpf1;->β:Z

    .line 559
    .line 560
    sget-object v2, Lpf1;->γ:Ljava/util/ArrayList;

    .line 561
    .line 562
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 567
    .line 568
    .line 569
    monitor-exit v1

    .line 570
    :try_start_7
    new-instance v1, Lii0;

    .line 571
    .line 572
    const/16 v2, 0xe

    .line 573
    .line 574
    invoke-direct {v1, v3, v2, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v5, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 578
    .line 579
    .line 580
    sget-object v0, Ls62;->α:Ls62;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :catchall_4
    move-exception v0

    .line 584
    new-instance v1, Leo1;

    .line 585
    .line 586
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 587
    .line 588
    .line 589
    move-object v0, v1

    .line 590
    :goto_9
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    if-eqz v0, :cond_f

    .line 595
    .line 596
    const-string v1, "DYHelper"

    .line 597
    .line 598
    const-string v2, "\u98df\u7269\u76ee\u5f55\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 599
    .line 600
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 601
    .line 602
    .line 603
    :cond_f
    return-void

    .line 604
    :catchall_5
    move-exception v0

    .line 605
    monitor-exit v1

    .line 606
    throw v0

    .line 607
    :pswitch_1
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, Landroid/graphics/Bitmap;

    .line 610
    .line 611
    iget-object v2, v0, Lvg0;->η:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v2, Landroid/widget/RadioButton;

    .line 614
    .line 615
    iget-object v3, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v3, Ljava/lang/String;

    .line 618
    .line 619
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v0, Landroid/app/Activity;

    .line 622
    .line 623
    invoke-static {v2, v3, v0, v1}, Lpf1;->γ(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_2
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 628
    .line 629
    move-object v5, v1

    .line 630
    check-cast v5, Ljava/lang/String;

    .line 631
    .line 632
    iget-object v1, v0, Lvg0;->η:Ljava/lang/Object;

    .line 633
    .line 634
    move-object v7, v1

    .line 635
    check-cast v7, Landroid/app/Activity;

    .line 636
    .line 637
    iget-object v1, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 638
    .line 639
    move-object v6, v1

    .line 640
    check-cast v6, Ljava/lang/String;

    .line 641
    .line 642
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 643
    .line 644
    move-object v4, v0

    .line 645
    check-cast v4, Landroid/widget/CompoundButton;

    .line 646
    .line 647
    sget-object v0, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 648
    .line 649
    const/16 v0, 0x50

    .line 650
    .line 651
    :try_start_8
    invoke-static {v7, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    invoke-static {v5, v0}, Lxd1;->δ(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    .line 656
    .line 657
    .line 658
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 659
    goto :goto_a

    .line 660
    :catchall_6
    move-exception v0

    .line 661
    new-instance v1, Leo1;

    .line 662
    .line 663
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    move-object v0, v1

    .line 667
    :goto_a
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    if-eqz v1, :cond_10

    .line 672
    .line 673
    const-string v2, "DYHelper"

    .line 674
    .line 675
    const-string v3, "\u8425\u5730\u79cd\u5b50\u56fe\u6807\u52a0\u8f7d\u5931\u8d25 "

    .line 676
    .line 677
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-static {v2, v3, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 682
    .line 683
    .line 684
    :cond_10
    instance-of v1, v0, Leo1;

    .line 685
    .line 686
    if-eqz v1, :cond_11

    .line 687
    .line 688
    const/4 v2, 0x0

    .line 689
    goto :goto_b

    .line 690
    :cond_11
    move-object v2, v0

    .line 691
    :goto_b
    move-object v3, v2

    .line 692
    check-cast v3, Landroid/graphics/Bitmap;

    .line 693
    .line 694
    if-nez v3, :cond_12

    .line 695
    .line 696
    goto :goto_d

    .line 697
    :cond_12
    sget-object v1, Lxd1;->β:Lwd1;

    .line 698
    .line 699
    monitor-enter v1

    .line 700
    :try_start_9
    invoke-virtual {v1, v5, v3}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 705
    .line 706
    monitor-exit v1

    .line 707
    :try_start_a
    new-instance v2, Lv8;

    .line 708
    .line 709
    const/4 v8, 0x5

    .line 710
    invoke-direct/range {v2 .. v8}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v7, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 714
    .line 715
    .line 716
    sget-object v0, Ls62;->α:Ls62;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 717
    .line 718
    goto :goto_c

    .line 719
    :catchall_7
    move-exception v0

    .line 720
    new-instance v1, Leo1;

    .line 721
    .line 722
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    move-object v0, v1

    .line 726
    :goto_c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    if-eqz v0, :cond_13

    .line 731
    .line 732
    const-string v1, "DYHelper"

    .line 733
    .line 734
    const-string v2, "\u8425\u5730\u79cd\u5b50\u56fe\u6807\u56de\u8c03\u5931\u8d25 "

    .line 735
    .line 736
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    :cond_13
    :goto_d
    return-void

    .line 744
    :catchall_8
    move-exception v0

    .line 745
    monitor-exit v1

    .line 746
    throw v0

    .line 747
    :pswitch_3
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v1, Landroid/content/Context;

    .line 750
    .line 751
    iget-object v2, v0, Lvg0;->η:Ljava/lang/Object;

    .line 752
    .line 753
    iget-object v3, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v3, Ljava/lang/String;

    .line 756
    .line 757
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v0, Ln81;

    .line 760
    .line 761
    invoke-static {v1, v2, v3, v0}, Lp81;->μ(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ln81;)Z

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :pswitch_4
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v1, Landroid/app/Activity;

    .line 768
    .line 769
    iget-object v2, v0, Lvg0;->η:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v2, Ljava/lang/String;

    .line 772
    .line 773
    iget-object v3, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v3, Ljava/lang/String;

    .line 776
    .line 777
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Lhu;

    .line 780
    .line 781
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    if-nez v4, :cond_15

    .line 786
    .line 787
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    if-eqz v4, :cond_14

    .line 792
    .line 793
    goto :goto_e

    .line 794
    :cond_14
    :try_start_b
    invoke-static {v1, v2, v3, v0}, Lxb;->π(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lhu;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 795
    .line 796
    .line 797
    goto :goto_e

    .line 798
    :catchall_9
    move-exception v0

    .line 799
    const-string v2, "IMTimeLabelConfigDialog"

    .line 800
    .line 801
    const-string v3, "\u65f6\u95f4\u6807\u7b7e XML \u914d\u7f6e\u5f39\u7a97\u6253\u5f00\u5931\u8d25"

    .line 802
    .line 803
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 804
    .line 805
    .line 806
    const-string v2, "\u65f6\u95f4\u6807\u7b7e\u8bbe\u7f6e"

    .line 807
    .line 808
    invoke-static {v1, v2, v0}, Lu81;->ο(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    :cond_15
    :goto_e
    return-void

    .line 812
    :pswitch_5
    iget-object v1, v0, Lvg0;->ζ:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v1, Landroid/view/View;

    .line 815
    .line 816
    iget-object v2, v0, Lvg0;->η:Ljava/lang/Object;

    .line 817
    .line 818
    iget-object v3, v0, Lvg0;->θ:Ljava/lang/Object;

    .line 819
    .line 820
    iget-object v0, v0, Lvg0;->ι:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v0, Ljava/lang/Integer;

    .line 823
    .line 824
    const v4, 0x7e34000a

    .line 825
    .line 826
    .line 827
    const/4 v5, 0x0

    .line 828
    invoke-virtual {v1, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    sget-object v4, Lah0;->α:Landroid/os/Handler;

    .line 832
    .line 833
    invoke-static {}, Lah0;->Θ()Z

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    if-nez v4, :cond_16

    .line 838
    .line 839
    goto :goto_10

    .line 840
    :cond_16
    invoke-static {v2}, Lah0;->ω(Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    if-nez v4, :cond_18

    .line 845
    .line 846
    if-eqz v3, :cond_17

    .line 847
    .line 848
    if-eqz v0, :cond_17

    .line 849
    .line 850
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    invoke-static {v0, v3}, Lah0;->ψ(ILjava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    goto :goto_f

    .line 859
    :cond_17
    move-object v0, v5

    .line 860
    goto :goto_f

    .line 861
    :cond_18
    move-object v0, v4

    .line 862
    :goto_f
    if-eqz v0, :cond_19

    .line 863
    .line 864
    invoke-static {v1, v2, v0}, Lah0;->Ρ(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    :cond_19
    :goto_10
    return-void

    .line 868
    nop

    .line 869
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
