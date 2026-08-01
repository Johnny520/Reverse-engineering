.class public final Lh0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lh0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lh0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lh0;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Llb;

    .line 14
    .line 15
    const-string v1, "\u8bed\u97f3\u4fdd\u5b58\u5931\u8d25"

    .line 16
    .line 17
    const-string v5, ""

    .line 18
    .line 19
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    if-eqz v6, :cond_d

    .line 24
    .line 25
    iget-object v7, v0, Llb;->a:Ljava/io/File;

    .line 26
    .line 27
    if-eqz v7, :cond_d

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-nez v8, :cond_0

    .line 34
    .line 35
    goto/16 :goto_8

    .line 36
    .line 37
    :cond_0
    iget-object v0, v0, Llb;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-nez v8, :cond_2

    .line 62
    .line 63
    const-string v0, ".ptt"

    .line 64
    .line 65
    :cond_2
    new-instance v8, Ljava/text/SimpleDateFormat;

    .line 66
    .line 67
    const-string v9, "yyyyMMdd-HHmmss"

    .line 68
    .line 69
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 70
    .line 71
    invoke-direct {v8, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 72
    .line 73
    .line 74
    new-instance v9, Ljava/util/Date;

    .line 75
    .line 76
    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v9}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    new-instance v9, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v10, "Elaris-voice-"

    .line 86
    .line 87
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    const-string v0, "is_pending"

    .line 101
    .line 102
    const/high16 v9, 0x10000

    .line 103
    .line 104
    :try_start_0
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    new-instance v11, Landroid/content/ContentValues;

    .line 109
    .line 110
    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v12, "_display_name"

    .line 114
    .line 115
    invoke-virtual {v11, v12, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v12, "mime_type"

    .line 119
    .line 120
    const-string v13, "application/octet-stream"

    .line 121
    .line 122
    invoke-virtual {v11, v12, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v12, "relative_path"

    .line 126
    .line 127
    new-instance v13, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    sget-object v14, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v14, "/Elaris/Voice"

    .line 138
    .line 139
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v11, v12, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-virtual {v11, v0, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 154
    .line 155
    .line 156
    sget-object v12, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 157
    .line 158
    invoke-virtual {v10, v12, v11}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 159
    .line 160
    .line 161
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 162
    if-nez v11, :cond_3

    .line 163
    .line 164
    :goto_0
    move-object v0, v5

    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :cond_3
    :try_start_1
    new-instance v12, Ljava/io/FileInputStream;

    .line 168
    .line 169
    invoke-direct {v12, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 170
    .line 171
    .line 172
    :try_start_2
    invoke-virtual {v10, v11}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 173
    .line 174
    .line 175
    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 176
    if-nez v13, :cond_4

    .line 177
    .line 178
    :try_start_3
    invoke-static {v12}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v13}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto :goto_3

    .line 187
    :cond_4
    :try_start_4
    new-array v14, v9, [B

    .line 188
    .line 189
    :goto_1
    invoke-virtual {v12, v14}, Ljava/io/InputStream;->read([B)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-gtz v15, :cond_5

    .line 194
    .line 195
    invoke-virtual {v13}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 196
    .line 197
    .line 198
    :try_start_5
    invoke-static {v12}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v13}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 202
    .line 203
    .line 204
    new-instance v12, Landroid/content/ContentValues;

    .line 205
    .line 206
    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    invoke-virtual {v12, v0, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v11, v12, v2, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v10, "Download/Elaris/Voice/"

    .line 225
    .line 226
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 236
    goto :goto_4

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    goto :goto_2

    .line 239
    :cond_5
    :try_start_6
    invoke-virtual {v13, v14, v3, v15}, Ljava/io/OutputStream;->write([BII)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :catchall_2
    move-exception v0

    .line 244
    move-object v13, v2

    .line 245
    goto :goto_2

    .line 246
    :catchall_3
    move-exception v0

    .line 247
    move-object v12, v2

    .line 248
    move-object v13, v12

    .line 249
    :goto_2
    :try_start_7
    invoke-static {v12}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v13}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 253
    .line 254
    .line 255
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 256
    :catchall_4
    move-exception v0

    .line 257
    move-object v11, v2

    .line 258
    :goto_3
    if-eqz v11, :cond_6

    .line 259
    .line 260
    :try_start_8
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-virtual {v10, v11, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 265
    .line 266
    .line 267
    :catchall_5
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v10, "voice save MediaStore failed reason="

    .line 270
    .line 271
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v10, ": "

    .line 286
    .line 287
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-lez v2, :cond_7

    .line 315
    .line 316
    move v2, v4

    .line 317
    goto :goto_5

    .line 318
    :cond_7
    move v2, v3

    .line 319
    :goto_5
    if-nez v2, :cond_b

    .line 320
    .line 321
    new-instance v0, Ljava/io/File;

    .line 322
    .line 323
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-string v10, "Elaris/Voice"

    .line 330
    .line 331
    invoke-direct {v0, v2, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    new-instance v2, Ljava/io/File;

    .line 335
    .line 336
    invoke-direct {v2, v0, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :try_start_9
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-eqz v0, :cond_8

    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-nez v0, :cond_8

    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 360
    .line 361
    .line 362
    :cond_8
    new-instance v0, Ljava/io/FileInputStream;

    .line 363
    .line 364
    invoke-direct {v0, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 365
    .line 366
    .line 367
    :try_start_a
    new-instance v7, Ljava/io/FileOutputStream;

    .line 368
    .line 369
    invoke-direct {v7, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 370
    .line 371
    .line 372
    :try_start_b
    new-array v8, v9, [B

    .line 373
    .line 374
    :goto_6
    invoke-virtual {v0, v8}, Ljava/io/InputStream;->read([B)I

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-gtz v9, :cond_9

    .line 379
    .line 380
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 381
    .line 382
    .line 383
    :try_start_c
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 384
    .line 385
    .line 386
    :catchall_6
    move v3, v4

    .line 387
    goto :goto_7

    .line 388
    :cond_9
    :try_start_d
    invoke-virtual {v7, v8, v3, v9}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 389
    .line 390
    .line 391
    goto :goto_6

    .line 392
    :catchall_7
    :try_start_e
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 393
    .line 394
    .line 395
    :catchall_8
    :goto_7
    :try_start_f
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 396
    .line 397
    .line 398
    :catchall_9
    if-eqz v3, :cond_a

    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    :cond_a
    move v2, v3

    .line 405
    move-object v0, v5

    .line 406
    :cond_b
    if-eqz v2, :cond_c

    .line 407
    .line 408
    new-instance v1, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    const-string v2, "\u5df2\u4fdd\u5b58\uff1a"

    .line 411
    .line 412
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    :cond_c
    invoke-static {v6, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_d
    :goto_8
    invoke-static {v6, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    :goto_9
    return-void

    .line 430
    :pswitch_0
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Lne;

    .line 433
    .line 434
    iget-object v1, v0, Lne;->f:Landroid/app/Activity;

    .line 435
    .line 436
    const-string v2, "\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 437
    .line 438
    invoke-static {v1, v2}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    iget-object v1, v0, Lne;->i:[Z

    .line 442
    .line 443
    aput-boolean v4, v1, v3

    .line 444
    .line 445
    iget-object v0, v0, Lne;->j:Landroid/app/Dialog;

    .line 446
    .line 447
    if-eqz v0, :cond_e

    .line 448
    .line 449
    :try_start_10
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 450
    .line 451
    .line 452
    :catchall_a
    :cond_e
    return-void

    .line 453
    :pswitch_1
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Landroid/widget/CheckBox;

    .line 456
    .line 457
    const-string v1, "original_image_default"

    .line 458
    .line 459
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_10

    .line 464
    .line 465
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-eqz v1, :cond_f

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_f
    invoke-virtual {v0, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 473
    .line 474
    .line 475
    const-string v0, "guild-panel"

    .line 476
    .line 477
    invoke-static {v0}, Lma;->a(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :cond_10
    :goto_a
    return-void

    .line 481
    :pswitch_2
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Lio/github/libxposed/api/XposedInterface;

    .line 484
    .line 485
    invoke-static {v0}, Lcom/mr/elaris/ModernHookEntry;->a(Lio/github/libxposed/api/XposedInterface;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_3
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, Ll8;

    .line 492
    .line 493
    invoke-virtual {v0}, Ll8;->a()V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_4
    :try_start_11
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v0, Lu8;

    .line 500
    .line 501
    iget-object v0, v0, Lu8;->c:Lx8;

    .line 502
    .line 503
    iget-object v0, v0, Lx8;->a:Ll8;

    .line 504
    .line 505
    iget-object v3, v1, Lh0;->b:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v3, Lu8;

    .line 508
    .line 509
    iget-object v3, v3, Lu8;->a:Ll8;

    .line 510
    .line 511
    if-ne v0, v3, :cond_12

    .line 512
    .line 513
    iget-boolean v0, v3, Ll8;->a:Z

    .line 514
    .line 515
    if-nez v0, :cond_12

    .line 516
    .line 517
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, Lu8;

    .line 520
    .line 521
    iget-object v0, v0, Lu8;->d:Landroid/app/Dialog;

    .line 522
    .line 523
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-nez v0, :cond_11

    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_11
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v0, Lu8;

    .line 533
    .line 534
    iget-object v0, v0, Lu8;->c:Lx8;

    .line 535
    .line 536
    iput-object v2, v0, Lx8;->a:Ll8;

    .line 537
    .line 538
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lu8;

    .line 541
    .line 542
    iget-object v0, v0, Lu8;->f:Landroid/widget/TextView;

    .line 543
    .line 544
    const-string v2, "\u97f3\u8272\u52a0\u8f7d\u5931\u8d25\uff0c\u70b9\u51fb\u91cd\u8bd5"

    .line 545
    .line 546
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 547
    .line 548
    .line 549
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lu8;

    .line 552
    .line 553
    iget-object v2, v0, Lu8;->f:Landroid/widget/TextView;

    .line 554
    .line 555
    iget-object v0, v0, Lu8;->h:Landroid/app/Activity;

    .line 556
    .line 557
    invoke-static {v0}, Lu9;->c(Landroid/content/Context;)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 562
    .line 563
    .line 564
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Lu8;

    .line 567
    .line 568
    iget-object v0, v0, Lu8;->f:Landroid/widget/TextView;

    .line 569
    .line 570
    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    .line 571
    .line 572
    .line 573
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v0, Lu8;

    .line 576
    .line 577
    iget-object v5, v0, Lu8;->f:Landroid/widget/TextView;

    .line 578
    .line 579
    iget-object v3, v0, Lu8;->h:Landroid/app/Activity;

    .line 580
    .line 581
    iget-object v4, v0, Lu8;->d:Landroid/app/Dialog;

    .line 582
    .line 583
    iget-object v6, v0, Lu8;->g:Landroid/widget/ListView;

    .line 584
    .line 585
    iget-object v7, v0, Lu8;->e:Lz8;

    .line 586
    .line 587
    iget-object v8, v0, Lu8;->c:Lx8;

    .line 588
    .line 589
    new-instance v2, Lp8;

    .line 590
    .line 591
    const/4 v9, 0x1

    .line 592
    invoke-direct/range {v2 .. v9}, Lp8;-><init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 596
    .line 597
    .line 598
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, Lu8;

    .line 601
    .line 602
    iget-object v2, v0, Lu8;->h:Landroid/app/Activity;

    .line 603
    .line 604
    iget-object v0, v0, Lu8;->d:Landroid/app/Dialog;

    .line 605
    .line 606
    invoke-static {v2}, Lu9;->A(Landroid/app/Activity;)I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    invoke-static {v0, v2}, Li5;->o(Landroid/app/Dialog;I)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 611
    .line 612
    .line 613
    :cond_12
    :goto_b
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v0, Lu8;

    .line 616
    .line 617
    iget-object v0, v0, Lu8;->a:Ll8;

    .line 618
    .line 619
    invoke-static {v0}, La9;->a(Ll8;)V

    .line 620
    .line 621
    .line 622
    goto :goto_c

    .line 623
    :catchall_b
    move-exception v0

    .line 624
    goto :goto_d

    .line 625
    :goto_c
    return-void

    .line 626
    :goto_d
    iget-object v1, v1, Lh0;->b:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v1, Lu8;

    .line 629
    .line 630
    iget-object v1, v1, Lu8;->a:Ll8;

    .line 631
    .line 632
    invoke-static {v1}, La9;->a(Ll8;)V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :pswitch_5
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v0, Lf2;

    .line 639
    .line 640
    const-string v1, "auto_send_expired"

    .line 641
    .line 642
    invoke-static {v0, v1}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    return-void

    .line 646
    :pswitch_6
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lcom/mr/elaris/ElarisStatusActivity;

    .line 649
    .line 650
    invoke-static {v0}, Lcom/mr/elaris/ElarisStatusActivity;->b(Lcom/mr/elaris/ElarisStatusActivity;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :pswitch_7
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 655
    .line 656
    move-object v9, v0

    .line 657
    check-cast v9, Landroid/content/Context;

    .line 658
    .line 659
    const-string v0, "elaris_dexkit_locator"

    .line 660
    .line 661
    invoke-virtual {v9, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-static {v9}, Lt2;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {v0, v1}, Lt2;->h(Landroid/content/SharedPreferences;Ljava/lang/String;)I

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    new-instance v5, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    const-string v6, "dexkit locator ready schema=7 cacheHits="

    .line 676
    .line 677
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    const-string v1, " qq="

    .line 684
    .line 685
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-static {v9, v0}, Lt2;->n(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    if-nez v1, :cond_13

    .line 711
    .line 712
    const-string v0, "dexkit skipped by cache=true"

    .line 713
    .line 714
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    const-string v0, "dexkit locator maintenance skipped reason=verified_cache"

    .line 718
    .line 719
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    goto/16 :goto_15

    .line 723
    .line 724
    :cond_13
    const-string v1, "dexkit locator cache incomplete missing="

    .line 725
    .line 726
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    const-string v1, "dexkit native load failed: "

    .line 734
    .line 735
    sget-boolean v0, Lt2;->k:Z

    .line 736
    .line 737
    if-eqz v0, :cond_14

    .line 738
    .line 739
    sget-boolean v0, Lt2;->l:Z

    .line 740
    .line 741
    goto :goto_f

    .line 742
    :cond_14
    const-class v5, Lt2;

    .line 743
    .line 744
    monitor-enter v5

    .line 745
    :try_start_12
    sget-boolean v0, Lt2;->k:Z

    .line 746
    .line 747
    if-eqz v0, :cond_15

    .line 748
    .line 749
    sget-boolean v0, Lt2;->l:Z

    .line 750
    .line 751
    monitor-exit v5
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 752
    goto :goto_f

    .line 753
    :catchall_c
    move-exception v0

    .line 754
    goto/16 :goto_16

    .line 755
    .line 756
    :cond_15
    :try_start_13
    const-string v0, "dexkit"

    .line 757
    .line 758
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    sput-boolean v4, Lt2;->l:Z

    .line 762
    .line 763
    const-string v0, "dexkit native loaded library=dexkit"

    .line 764
    .line 765
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    .line 766
    .line 767
    .line 768
    goto :goto_e

    .line 769
    :catchall_d
    move-exception v0

    .line 770
    :try_start_14
    sput-boolean v3, Lt2;->l:Z

    .line 771
    .line 772
    new-instance v6, Ljava/lang/StringBuilder;

    .line 773
    .line 774
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    const-string v1, ": "

    .line 789
    .line 790
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-static {v0}, Lt2;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    .line 809
    .line 810
    .line 811
    :goto_e
    :try_start_15
    sput-boolean v4, Lt2;->k:Z

    .line 812
    .line 813
    sget-boolean v0, Lt2;->l:Z

    .line 814
    .line 815
    monitor-exit v5
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    .line 816
    :goto_f
    if-nez v0, :cond_16

    .line 817
    .line 818
    new-instance v0, Ljava/lang/StringBuilder;

    .line 819
    .line 820
    const-string v1, "dexkit locator unavailable reason=native_load_failed qq="

    .line 821
    .line 822
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    goto/16 :goto_15

    .line 840
    .line 841
    :cond_16
    const-string v0, ""

    .line 842
    .line 843
    :try_start_16
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    if-eqz v1, :cond_18

    .line 848
    .line 849
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 854
    .line 855
    if-nez v1, :cond_17

    .line 856
    .line 857
    goto :goto_10

    .line 858
    :cond_17
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    .line 863
    .line 864
    :catchall_e
    :cond_18
    :goto_10
    move-object v6, v0

    .line 865
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    if-nez v0, :cond_19

    .line 870
    .line 871
    new-instance v0, Ljava/lang/StringBuilder;

    .line 872
    .line 873
    const-string v1, "dexkit locator unavailable reason=source_missing qq="

    .line 874
    .line 875
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostVersionSummary()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_15

    .line 893
    .line 894
    :cond_19
    const-string v0, ": "

    .line 895
    .line 896
    const-string v1, "ms source="

    .line 897
    .line 898
    const-string v11, "dexkit locator bridge open ok took="

    .line 899
    .line 900
    const-string v12, "dexkit locator bridge open failed took="

    .line 901
    .line 902
    :try_start_17
    new-instance v5, Ljava/io/File;

    .line 903
    .line 904
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    new-instance v7, Ljava/lang/StringBuilder;

    .line 908
    .line 909
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v8

    .line 916
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    .line 918
    .line 919
    const-string v8, ":"

    .line 920
    .line 921
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 925
    .line 926
    .line 927
    move-result-wide v13

    .line 928
    invoke-virtual {v7, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v5
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    .line 935
    :goto_11
    move-object v13, v5

    .line 936
    goto :goto_12

    .line 937
    :catchall_f
    invoke-static {v6}, Lt2;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    goto :goto_11

    .line 942
    :goto_12
    const-string v5, "dexkit locator bridge open start timeout=15000ms source="

    .line 943
    .line 944
    invoke-virtual {v5, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v5

    .line 948
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    new-instance v8, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 952
    .line 953
    invoke-direct {v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 954
    .line 955
    .line 956
    new-array v7, v4, [Ljava/lang/Object;

    .line 957
    .line 958
    new-array v10, v4, [Ljava/lang/Throwable;

    .line 959
    .line 960
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 961
    .line 962
    .line 963
    move-result-wide v14

    .line 964
    new-instance v5, Ljava/lang/Thread;

    .line 965
    .line 966
    move-object/from16 v16, v5

    .line 967
    .line 968
    new-instance v5, Ls2;

    .line 969
    .line 970
    move-object/from16 v17, v2

    .line 971
    .line 972
    move-object/from16 v2, v16

    .line 973
    .line 974
    invoke-direct/range {v5 .. v10}, Ls2;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;[Ljava/lang/Throwable;)V

    .line 975
    .line 976
    .line 977
    const-string v6, "Elaris-DexKitBridgeOpen"

    .line 978
    .line 979
    invoke-direct {v2, v5, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setPriority(I)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 989
    .line 990
    .line 991
    const-wide/16 v5, 0x3a98

    .line 992
    .line 993
    :try_start_18
    invoke-virtual {v2, v5, v6}, Ljava/lang/Thread;->join(J)V
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_18 .. :try_end_18} :catch_0

    .line 994
    .line 995
    .line 996
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 997
    .line 998
    .line 999
    move-result-wide v5

    .line 1000
    sub-long/2addr v5, v14

    .line 1001
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v2

    .line 1005
    if-eqz v2, :cond_1a

    .line 1006
    .line 1007
    invoke-virtual {v8, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1008
    .line 1009
    .line 1010
    aget-object v0, v7, v3

    .line 1011
    .line 1012
    invoke-static {v0}, Lt2;->g(Ljava/lang/Object;)V

    .line 1013
    .line 1014
    .line 1015
    aput-object v17, v7, v3

    .line 1016
    .line 1017
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    const-string v2, "dexkit locator bridge open timeout took="

    .line 1020
    .line 1021
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    goto :goto_15

    .line 1041
    :cond_1a
    aget-object v2, v7, v3

    .line 1042
    .line 1043
    :try_start_19
    aget-object v3, v10, v3

    .line 1044
    .line 1045
    if-eqz v3, :cond_1b

    .line 1046
    .line 1047
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-static {v0}, Lt2;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 1094
    .line 1095
    .line 1096
    :goto_13
    invoke-static {v2}, Lt2;->g(Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    goto :goto_15

    .line 1100
    :catchall_10
    move-exception v0

    .line 1101
    goto :goto_14

    .line 1102
    :cond_1b
    :try_start_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    .line 1121
    .line 1122
    .line 1123
    goto :goto_13

    .line 1124
    :goto_14
    invoke-static {v2}, Lt2;->g(Ljava/lang/Object;)V

    .line 1125
    .line 1126
    .line 1127
    throw v0

    .line 1128
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v8, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1136
    .line 1137
    .line 1138
    const-string v0, "dexkit locator bridge open interrupted source="

    .line 1139
    .line 1140
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    :goto_15
    return-void

    .line 1148
    :catchall_11
    move-exception v0

    .line 1149
    :try_start_1b
    sput-boolean v4, Lt2;->k:Z

    .line 1150
    .line 1151
    throw v0

    .line 1152
    :goto_16
    monitor-exit v5
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 1153
    throw v0

    .line 1154
    :pswitch_8
    iget-object v0, v1, Lh0;->b:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v0, Li0;

    .line 1157
    .line 1158
    iget v0, v0, Li0;->b:I

    .line 1159
    .line 1160
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v0

    .line 1164
    if-eqz v0, :cond_1d

    .line 1165
    .line 1166
    sget-boolean v0, Lr0;->c:Z

    .line 1167
    .line 1168
    if-eqz v0, :cond_1d

    .line 1169
    .line 1170
    const-string v0, "eq_message_guard"

    .line 1171
    .line 1172
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    if-nez v0, :cond_1c

    .line 1177
    .line 1178
    goto :goto_17

    .line 1179
    :cond_1c
    invoke-static {}, Lr0;->p()V

    .line 1180
    .line 1181
    .line 1182
    :cond_1d
    :goto_17
    return-void

    .line 1183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
