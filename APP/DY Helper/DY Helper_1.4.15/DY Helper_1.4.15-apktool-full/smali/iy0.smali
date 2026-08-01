.class public final synthetic Liy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Ljava/util/ArrayList;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Z

.field public final synthetic θ:Landroid/app/NotificationManager;

.field public final synthetic ι:I

.field public final synthetic κ:Ljava/lang/String;

.field public final synthetic λ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;ZLandroid/app/NotificationManager;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liy0;->ε:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Liy0;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-boolean p3, p0, Liy0;->η:Z

    .line 9
    .line 10
    iput-object p4, p0, Liy0;->θ:Landroid/app/NotificationManager;

    .line 11
    .line 12
    iput p5, p0, Liy0;->ι:I

    .line 13
    .line 14
    iput-object p6, p0, Liy0;->κ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Liy0;->λ:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Liy0;->λ:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v0, Lqy0;->α:Lqy0;

    .line 6
    .line 7
    iget-object v3, v1, Liy0;->ε:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    const-string v9, "\u4fdd\u5b58\u56fe\u7247"

    .line 20
    .line 21
    iget-object v10, v1, Liy0;->ζ:Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v11, v1, Liy0;->η:Z

    .line 24
    .line 25
    iget-object v12, v1, Liy0;->θ:Landroid/app/NotificationManager;

    .line 26
    .line 27
    iget v13, v1, Liy0;->ι:I

    .line 28
    .line 29
    const-string v14, "/"

    .line 30
    .line 31
    if-eqz v7, :cond_7

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    add-int/lit8 v15, v0, 0x1

    .line 38
    .line 39
    if-ltz v0, :cond_6

    .line 40
    .line 41
    check-cast v7, Landroid/graphics/Bitmap;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    mul-int/lit8 v8, v15, 0x64

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    div-int/2addr v8, v14

    .line 72
    invoke-static {v8, v10, v9, v5}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_1

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v5, "DYHelper: [BMP-SKIP] \u7b2c"

    .line 84
    .line 85
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v5, "\u5f20\u5df2\u56de\u6536"

    .line 92
    .line 93
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v16, v4

    .line 104
    .line 105
    :cond_0
    const/4 v4, 0x0

    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_1
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_2

    .line 113
    .line 114
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    sget-object v8, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 119
    .line 120
    if-eq v5, v8, :cond_2

    .line 121
    .line 122
    new-instance v5, Ld62;

    .line 123
    .line 124
    const-string v8, "png"

    .line 125
    .line 126
    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 127
    .line 128
    const-string v14, "image/png"

    .line 129
    .line 130
    invoke-direct {v5, v14, v8, v9}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    new-instance v5, Ld62;

    .line 135
    .line 136
    const-string v8, "jpg"

    .line 137
    .line 138
    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 139
    .line 140
    const-string v14, "image/jpeg"

    .line 141
    .line 142
    invoke-direct {v5, v14, v8, v9}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :goto_1
    iget-object v8, v5, Ld62;->ε:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v8, Ljava/lang/String;

    .line 148
    .line 149
    iget-object v9, v5, Ld62;->ζ:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v9, Ljava/lang/String;

    .line 152
    .line 153
    iget-object v5, v5, Ld62;->η:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v5, Landroid/graphics/Bitmap$CompressFormat;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    move-object/from16 v16, v4

    .line 162
    .line 163
    iget-object v4, v1, Liy0;->κ:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v0, v14, v4, v9}, Lqy0;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :try_start_0
    sget-object v4, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v10, v2, v0, v8, v4}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 175
    .line 176
    .line 177
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 178
    :try_start_1
    invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0, v4}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 183
    .line 184
    .line 185
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    if-eqz v8, :cond_5

    .line 187
    .line 188
    :try_start_2
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 189
    .line 190
    if-ne v5, v0, :cond_3

    .line 191
    .line 192
    const/16 v0, 0x64

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_3
    const/16 v0, 0x5f

    .line 196
    .line 197
    :goto_2
    invoke-virtual {v7, v5, v0, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_4

    .line 202
    .line 203
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 204
    .line 205
    .line 206
    :try_start_3
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    .line 207
    .line 208
    .line 209
    invoke-static {v10, v4}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    .line 211
    .line 212
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    goto :goto_4

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    move-object v5, v0

    .line 219
    goto :goto_3

    .line 220
    :cond_4
    :try_start_4
    new-instance v0, Ljava/lang/Exception;

    .line 221
    .line 222
    const-string v5, "compress \u8fd4\u56de false"

    .line 223
    .line 224
    invoke-direct {v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 228
    :goto_3
    :try_start_5
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 229
    :catchall_2
    move-exception v0

    .line 230
    :try_start_6
    invoke-static {v8, v5}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_5
    new-instance v0, Ljava/lang/Exception;

    .line 235
    .line 236
    const-string v5, "\u65e0\u6cd5\u6253\u5f00\u8f93\u51fa\u6d41"

    .line 237
    .line 238
    invoke-direct {v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 242
    :goto_4
    :try_start_7
    invoke-static {v10, v4}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 243
    .line 244
    .line 245
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 246
    :catchall_3
    move-exception v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v4, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v5, "DYHelper: [BMP-FAIL] \u7b2c"

    .line 254
    .line 255
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v5, "\u5f20\u4fdd\u5b58\u5931\u8d25: "

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_5
    if-eqz v11, :cond_0

    .line 277
    .line 278
    new-instance v0, Lx31;

    .line 279
    .line 280
    invoke-direct {v0, v10}, Lx31;-><init>(Landroid/content/Context;)V

    .line 281
    .line 282
    .line 283
    const v4, 0x1080081

    .line 284
    .line 285
    .line 286
    iget-object v5, v0, Lx31;->ξ:Landroid/app/Notification;

    .line 287
    .line 288
    iput v4, v5, Landroid/app/Notification;->icon:I

    .line 289
    .line 290
    const-string v4, "\u6b63\u5728\u4fdd\u5b58\u56fe\u7247"

    .line 291
    .line 292
    invoke-static {v4}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    iput-object v4, v0, Lx31;->ε:Ljava/lang/CharSequence;

    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    new-instance v5, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v7, " / "

    .line 311
    .line 312
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-static {v4}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    iput-object v4, v0, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 327
    .line 328
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    iput v4, v0, Lx31;->θ:I

    .line 333
    .line 334
    iput v15, v0, Lx31;->ι:I

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    iput-boolean v4, v0, Lx31;->κ:Z

    .line 338
    .line 339
    const/4 v5, 0x2

    .line 340
    invoke-virtual {v0, v5}, Lx31;->γ(I)V

    .line 341
    .line 342
    .line 343
    const/4 v5, 0x1

    .line 344
    iput-boolean v5, v0, Lx31;->ο:Z

    .line 345
    .line 346
    invoke-virtual {v0}, Lx31;->α()Landroid/app/Notification;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v12, v13, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 351
    .line 352
    .line 353
    :goto_6
    move v0, v15

    .line 354
    move-object/from16 v4, v16

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_6
    invoke-static {}, Lyh;->х()V

    .line 359
    .line 360
    .line 361
    const/4 v0, 0x0

    .line 362
    throw v0

    .line 363
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    const-string v1, " \u5f20\u56fe\u7247"

    .line 368
    .line 369
    const-string v2, "\u5df2\u4fdd\u5b58 "

    .line 370
    .line 371
    invoke-static {v2, v6, v14, v0, v1}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v1, "\u4fdd\u5b58\u5b8c\u6210"

    .line 376
    .line 377
    invoke-static {v10, v1, v0, v9}, Lqy0;->Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    if-eqz v11, :cond_8

    .line 381
    .line 382
    new-instance v0, Lx31;

    .line 383
    .line 384
    invoke-direct {v0, v10}, Lx31;-><init>(Landroid/content/Context;)V

    .line 385
    .line 386
    .line 387
    const v4, 0x1080082

    .line 388
    .line 389
    .line 390
    iget-object v5, v0, Lx31;->ξ:Landroid/app/Notification;

    .line 391
    .line 392
    iput v4, v5, Landroid/app/Notification;->icon:I

    .line 393
    .line 394
    invoke-static {v1}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iput-object v1, v0, Lx31;->ε:Ljava/lang/CharSequence;

    .line 399
    .line 400
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    new-instance v4, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v1, " \u5f20\u56fe\u7247\u5230\u76f8\u518c"

    .line 419
    .line 420
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-static {v1}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    iput-object v1, v0, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 432
    .line 433
    const/16 v1, 0x10

    .line 434
    .line 435
    invoke-virtual {v0, v1}, Lx31;->γ(I)V

    .line 436
    .line 437
    .line 438
    const/4 v5, 0x1

    .line 439
    iput-boolean v5, v0, Lx31;->ο:Z

    .line 440
    .line 441
    invoke-virtual {v0}, Lx31;->α()Landroid/app/Notification;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v12, v13, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 446
    .line 447
    .line 448
    :cond_8
    new-instance v0, Lgs;

    .line 449
    .line 450
    const/4 v5, 0x2

    .line 451
    invoke-direct {v0, v6, v5, v10, v3}, Lgs;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 455
    .line 456
    .line 457
    sget-object v0, Ls62;->α:Ls62;

    .line 458
    .line 459
    return-object v0
.end method
