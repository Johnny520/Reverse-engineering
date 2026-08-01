.class public final Lo;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/net/Uri;Lf2;Le2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo;->b:Landroid/app/Activity;

    iput-object p2, p0, Lo;->c:Ljava/lang/Object;

    iput-object p3, p0, Lo;->d:Ljava/lang/Object;

    iput-object p4, p0, Lo;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/Object;Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo;->b:Landroid/app/Activity;

    iput-object p2, p0, Lo;->d:Ljava/lang/Object;

    iput-object p3, p0, Lo;->e:Ljava/lang/Object;

    iput-object p4, p0, Lo;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Lq6;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lo;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lo;->b:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p3, p0, Lo;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lo;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lo;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lo;->e:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lo;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lo;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v7, v4

    .line 14
    check-cast v7, Landroid/content/Context;

    .line 15
    .line 16
    iget-object v5, p0, Lo;->b:Landroid/app/Activity;

    .line 17
    .line 18
    move-object v8, v1

    .line 19
    check-cast v8, Landroid/view/View;

    .line 20
    .line 21
    check-cast v3, Lq6;

    .line 22
    .line 23
    iget-object v9, v3, Lq6;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v10, v3, Lq6;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v11, v3, Lq6;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v12, v3, Lq6;->d:Ljava/lang/String;

    .line 30
    .line 31
    const-string p0, "avatar-menu-show"

    .line 32
    .line 33
    :try_start_0
    new-instance v6, Landroid/app/Dialog;

    .line 34
    .line 35
    const v0, 0x1030010

    .line 36
    .line 37
    .line 38
    invoke-direct {v6, v5, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static/range {v5 .. v12}, Ls6;->i(Landroid/app/Activity;Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v5, v0}, Ls6;->G0(Landroid/content/Context;Landroid/widget/LinearLayout;)Landroid/widget/FrameLayout;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Li6;

    .line 59
    .line 60
    invoke-direct {v0, v6, v2}, Li6;-><init>(Landroid/app/Dialog;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 67
    .line 68
    .line 69
    invoke-static {v6}, Ls6;->g(Landroid/app/Dialog;)V

    .line 70
    .line 71
    .line 72
    const-string v0, "group avatar menu show"

    .line 73
    .line 74
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v9, v10, p0, v11}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "group avatar menu failed reason="

    .line 85
    .line 86
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v2, ": "

    .line 90
    .line 91
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v9, p0, v0}, Li5;->Z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    return-void

    .line 98
    :pswitch_0
    check-cast v1, Le2;

    .line 99
    .line 100
    :try_start_1
    iget-object p0, p0, Lo;->b:Landroid/app/Activity;

    .line 101
    .line 102
    check-cast v3, Landroid/net/Uri;

    .line 103
    .line 104
    check-cast v4, Lf2;

    .line 105
    .line 106
    iget-object v0, v4, Lf2;->c:Ljava/io/Serializable;

    .line 107
    .line 108
    check-cast v0, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, v4, Lf2;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p0, v3, v0, v2}, Li5;->Z1(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string p0, "\u5df2\u63d0\u4ea4\u5ba1\u6838\uff0c\u901a\u8fc7\u540e\u5c06\u51fa\u73b0\u5728\u516c\u5f00\u9762\u677f"

    .line 118
    .line 119
    invoke-static {v1, p0}, Lg2;->m(Le2;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    move-object p0, v0

    .line 125
    invoke-static {p0}, Lg2;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {v1, p0}, Lg2;->m(Le2;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    return-void

    .line 133
    :pswitch_1
    iget-object v12, p0, Lo;->b:Landroid/app/Activity;

    .line 134
    .line 135
    check-cast v4, Ljava/lang/ClassLoader;

    .line 136
    .line 137
    iget-object p0, p0, Lo;->e:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v6, v3

    .line 140
    check-cast v6, Landroid/net/Uri;

    .line 141
    .line 142
    const-string v0, ""

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    :try_start_2
    new-instance v3, Ljava/io/File;

    .line 146
    .line 147
    invoke-virtual {v12}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const-string v7, "elaris_video_bubble"

    .line 152
    .line 153
    invoke-direct {v3, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_1

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_0

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    const-string v0, "cache directory unavailable"

    .line 172
    .line 173
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p0

    .line 177
    :catchall_2
    move-exception v0

    .line 178
    move-object p0, v0

    .line 179
    move-object v6, v1

    .line 180
    goto/16 :goto_b

    .line 181
    .line 182
    :cond_1
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-nez v5, :cond_2

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    move-result-wide v7

    .line 193
    const-wide/32 v9, 0x5265c00

    .line 194
    .line 195
    .line 196
    sub-long/2addr v7, v9

    .line 197
    array-length v9, v5

    .line 198
    const/4 v10, 0x0

    .line 199
    :goto_3
    if-ge v10, v9, :cond_4

    .line 200
    .line 201
    aget-object v11, v5, v10

    .line 202
    .line 203
    if-eqz v11, :cond_3

    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_3

    .line 210
    .line 211
    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    .line 212
    .line 213
    .line 214
    move-result-wide v13

    .line 215
    cmp-long v13, v13, v7

    .line 216
    .line 217
    if-gez v13, :cond_3

    .line 218
    .line 219
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 220
    .line 221
    .line 222
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_4
    :goto_4
    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    const-string v11, "_display_name"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 230
    .line 231
    :try_start_3
    filled-new-array {v11}, [Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    const/4 v9, 0x0

    .line 236
    const/4 v10, 0x0

    .line 237
    const/4 v8, 0x0

    .line 238
    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 239
    .line 240
    .line 241
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 242
    if-eqz v7, :cond_5

    .line 243
    .line 244
    :try_start_4
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_5

    .line 249
    .line 250
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-ltz v8, :cond_5

    .line 255
    .line 256
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 260
    :try_start_5
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 261
    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_5
    if-eqz v7, :cond_6

    .line 265
    .line 266
    :goto_5
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 267
    .line 268
    .line 269
    goto :goto_6

    .line 270
    :catchall_3
    move-object v7, v1

    .line 271
    :catchall_4
    if-eqz v7, :cond_6

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_6
    :goto_6
    move-object v8, v0

    .line 275
    :goto_7
    :try_start_6
    invoke-virtual {v5, v6}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-virtual {v9, v7}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 287
    goto :goto_8

    .line 288
    :catchall_5
    move-object v7, v0

    .line 289
    :goto_8
    if-nez v8, :cond_7

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_7
    const/16 v9, 0x2e

    .line 293
    .line 294
    :try_start_7
    invoke-virtual {v8, v9}, Ljava/lang/String;->lastIndexOf(I)I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-ltz v9, :cond_9

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    sub-int/2addr v10, v2

    .line 305
    if-lt v9, v10, :cond_8

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_8
    add-int/2addr v9, v2

    .line 309
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {v0}, Li5;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    :cond_9
    :goto_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-nez v2, :cond_a

    .line 322
    .line 323
    invoke-static {v7}, Li5;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-nez v2, :cond_b

    .line 332
    .line 333
    const-string v0, "mp4"

    .line 334
    .line 335
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 341
    .line 342
    .line 343
    move-result-wide v7

    .line 344
    invoke-static {v7, v8}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string v7, "_"

    .line 352
    .line 353
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 357
    .line 358
    .line 359
    move-result-wide v7

    .line 360
    invoke-static {v7, v8}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    move-object v7, v5

    .line 372
    new-instance v5, Ljava/io/File;

    .line 373
    .line 374
    new-instance v8, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v9, "."

    .line 383
    .line 384
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-direct {v5, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 395
    .line 396
    .line 397
    :try_start_8
    invoke-static {v7, v6, v5}, Ls;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/io/File;)J

    .line 398
    .line 399
    .line 400
    move-result-wide v10

    .line 401
    new-instance v0, Ljava/io/File;

    .line 402
    .line 403
    new-instance v6, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    const-string v7, ".jpg"

    .line 412
    .line 413
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-direct {v0, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-static {v5, v0}, Ls;->h(Ljava/io/File;Ljava/io/File;)Lr;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    iget-object v6, v0, Lr;->b:Ljava/io/File;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 428
    .line 429
    :try_start_9
    iget-wide v7, v0, Lr;->a:J

    .line 430
    .line 431
    invoke-static {v10, v11, v7, v8}, Li5;->b2(JJ)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-gtz v3, :cond_c

    .line 440
    .line 441
    iget-wide v7, v0, Lr;->a:J

    .line 442
    .line 443
    new-instance v0, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    const-string v1, "elaris_"

    .line 449
    .line 450
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-static {v7, v8, v0}, Li5;->f1(JLjava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    new-instance v2, Lp;

    .line 465
    .line 466
    move-object v3, v4

    .line 467
    move-object v4, p0

    .line 468
    invoke-direct/range {v2 .. v12}, Lp;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/io/File;Ljava/io/File;JLjava/lang/String;JLandroid/app/Activity;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 472
    .line 473
    .line 474
    goto :goto_d

    .line 475
    :catchall_6
    move-exception v0

    .line 476
    move-object p0, v0

    .line 477
    :goto_a
    move-object v1, v5

    .line 478
    goto :goto_b

    .line 479
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 480
    .line 481
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 485
    :catchall_7
    move-exception v0

    .line 486
    move-object p0, v0

    .line 487
    move-object v6, v1

    .line 488
    goto :goto_a

    .line 489
    :goto_b
    if-eqz v1, :cond_d

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 492
    .line 493
    .line 494
    :cond_d
    if-eqz v6, :cond_e

    .line 495
    .line 496
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 497
    .line 498
    .line 499
    :cond_e
    const-string v0, "album-video-bubble"

    .line 500
    .line 501
    const-string v1, "prepare"

    .line 502
    .line 503
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    .line 507
    .line 508
    if-eqz v0, :cond_f

    .line 509
    .line 510
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u6240\u9009\u89c6\u9891\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9"

    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    if-eqz p0, :cond_10

    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-nez v0, :cond_11

    .line 528
    .line 529
    :cond_10
    const-string p0, "\u89c6\u9891\u65e0\u6cd5\u5904\u7406"

    .line 530
    .line 531
    :cond_11
    :goto_c
    invoke-static {v12, p0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    :goto_d
    return-void

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
