.class public final Lq;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lq;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 11
    iput p3, p0, Lq;->a:I

    iput-object p1, p0, Lq;->c:Ljava/lang/Object;

    iput-object p2, p0, Lq;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lq;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lne;

    .line 12
    .line 13
    iget-object v1, v0, Lne;->f:Landroid/app/Activity;

    .line 14
    .line 15
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    const-string v4, "storage"

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_6

    .line 26
    .line 27
    const-string v4, "space"

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    const-string v4, "cancel"

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    const-string p0, "\u5df2\u53d6\u6d88\u8bed\u97f3\u5904\u7406"

    .line 45
    .line 46
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string v4, "incomplete"

    .line 51
    .line 52
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    const-string v4, "changed"

    .line 59
    .line 60
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const-string v4, "decode"

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_4

    .line 74
    .line 75
    const-string v4, "encode"

    .line 76
    .line 77
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_4

    .line 82
    .line 83
    const-string v4, "codec"

    .line 84
    .line 85
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    const-string v4, "track"

    .line 92
    .line 93
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_4

    .line 98
    .line 99
    const-string v4, "mime"

    .line 100
    .line 101
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_3

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    const-string p0, "\u672c\u5730\u8bed\u97f3\u8bfb\u53d6\u5931\u8d25"

    .line 109
    .line 110
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    :goto_0
    const-string p0, "\u5f53\u524d\u8bbe\u5907\u65e0\u6cd5\u89e3\u7801\u8be5\u97f3\u9891"

    .line 115
    .line 116
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_1
    const-string p0, "\u97f3\u9891\u8bfb\u53d6\u4e0d\u5b8c\u6574\u6216\u5904\u7406\u671f\u95f4\u5df2\u53d8\u66f4\uff0c\u672a\u53d1\u9001"

    .line 121
    .line 122
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    :goto_2
    const-string p0, "\u53ef\u7528\u5b58\u50a8\u7a7a\u95f4\u4e0d\u8db3\uff0c\u672a\u53d1\u9001"

    .line 127
    .line 128
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    iget-object p0, v0, Lne;->i:[Z

    .line 132
    .line 133
    aput-boolean v2, p0, v3

    .line 134
    .line 135
    iget-object p0, v0, Lne;->j:Landroid/app/Dialog;

    .line 136
    .line 137
    if-eqz p0, :cond_7

    .line 138
    .line 139
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :catchall_0
    :cond_7
    return-void

    .line 143
    :pswitch_0
    const-string v1, "\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 144
    .line 145
    :try_start_1
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lne;

    .line 148
    .line 149
    iget-object v0, v0, Lne;->c:Lve;

    .line 150
    .line 151
    iget-boolean v0, v0, Lve;->a:Z

    .line 152
    .line 153
    if-nez v0, :cond_c

    .line 154
    .line 155
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lne;

    .line 158
    .line 159
    iget v0, v0, Lne;->e:I

    .line 160
    .line 161
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_c

    .line 166
    .line 167
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lne;

    .line 170
    .line 171
    iget-object v0, v0, Lne;->f:Landroid/app/Activity;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_c

    .line 178
    .line 179
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lne;

    .line 182
    .line 183
    iget-object v0, v0, Lne;->f:Landroid/app/Activity;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    goto/16 :goto_6

    .line 192
    .line 193
    :cond_8
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lna;

    .line 196
    .line 197
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_9

    .line 204
    .line 205
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Lne;

    .line 208
    .line 209
    iget-object v0, v0, Lne;->f:Landroid/app/Activity;

    .line 210
    .line 211
    const-string v4, "\u672c\u5730\u8bed\u97f3\u8bfb\u53d6\u5931\u8d25"

    .line 212
    .line 213
    invoke-static {v0, v4}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 214
    .line 215
    .line 216
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p0, Lne;

    .line 219
    .line 220
    iget-object v0, p0, Lne;->i:[Z

    .line 221
    .line 222
    aput-boolean v2, v0, v3

    .line 223
    .line 224
    iget-object p0, p0, Lne;->j:Landroid/app/Dialog;

    .line 225
    .line 226
    if-eqz p0, :cond_d

    .line 227
    .line 228
    :goto_4
    :try_start_2
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 229
    .line 230
    .line 231
    goto/16 :goto_8

    .line 232
    .line 233
    :catchall_1
    move-exception v0

    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :cond_9
    :try_start_3
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lna;

    .line 239
    .line 240
    iget v4, v0, Lna;->b:I

    .line 241
    .line 242
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 245
    .line 246
    .line 247
    move-result-wide v5

    .line 248
    sget-object v0, Lcom/mr/elaris/w;->a:[Ljava/lang/String;

    .line 249
    .line 250
    const/16 v0, 0x10

    .line 251
    .line 252
    new-array v10, v0, [B

    .line 253
    .line 254
    const-wide/16 v7, 0x1

    .line 255
    .line 256
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 257
    .line 258
    .line 259
    move-result-wide v5

    .line 260
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    int-to-long v7, v4

    .line 265
    const-wide/16 v11, 0x1f

    .line 266
    .line 267
    mul-long/2addr v7, v11

    .line 268
    add-long/2addr v7, v5

    .line 269
    const-wide/32 v4, 0x7fffffff

    .line 270
    .line 271
    .line 272
    and-long/2addr v4, v7

    .line 273
    long-to-int v4, v4

    .line 274
    move v5, v3

    .line 275
    :goto_5
    if-ge v5, v0, :cond_a

    .line 276
    .line 277
    mul-int/lit8 v6, v5, 0x7

    .line 278
    .line 279
    add-int/2addr v6, v4

    .line 280
    rem-int/lit8 v6, v6, 0x16

    .line 281
    .line 282
    add-int/lit8 v6, v6, 0x5

    .line 283
    .line 284
    int-to-byte v6, v6

    .line 285
    aput-byte v6, v10, v5

    .line 286
    .line 287
    add-int/lit8 v5, v5, 0x1

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_a
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lne;

    .line 293
    .line 294
    iget-object v7, v0, Lne;->g:Ljava/lang/ClassLoader;

    .line 295
    .line 296
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Lna;

    .line 299
    .line 300
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Lna;

    .line 309
    .line 310
    iget v9, v0, Lna;->b:I

    .line 311
    .line 312
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lne;

    .line 315
    .line 316
    iget-object v11, v0, Lne;->h:Lpd;

    .line 317
    .line 318
    new-instance v12, Lx2;

    .line 319
    .line 320
    invoke-direct {v12, p0}, Lx2;-><init>(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-static/range {v7 .. v12}, Lcom/mr/elaris/w;->J0(Ljava/lang/ClassLoader;Ljava/lang/String;I[BLpd;Lx2;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_b

    .line 328
    .line 329
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lna;

    .line 332
    .line 333
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 336
    .line 337
    .line 338
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lne;

    .line 341
    .line 342
    iget-object v0, v0, Lne;->f:Landroid/app/Activity;

    .line 343
    .line 344
    invoke-static {v0, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 345
    .line 346
    .line 347
    :cond_b
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p0, Lne;

    .line 350
    .line 351
    iget-object v0, p0, Lne;->i:[Z

    .line 352
    .line 353
    aput-boolean v2, v0, v3

    .line 354
    .line 355
    iget-object p0, p0, Lne;->j:Landroid/app/Dialog;

    .line 356
    .line 357
    if-eqz p0, :cond_d

    .line 358
    .line 359
    goto/16 :goto_4

    .line 360
    .line 361
    :cond_c
    :goto_6
    :try_start_4
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lna;

    .line 364
    .line 365
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 368
    .line 369
    .line 370
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast p0, Lne;

    .line 373
    .line 374
    iget-object v0, p0, Lne;->i:[Z

    .line 375
    .line 376
    aput-boolean v2, v0, v3

    .line 377
    .line 378
    iget-object p0, p0, Lne;->j:Landroid/app/Dialog;

    .line 379
    .line 380
    if-eqz p0, :cond_d

    .line 381
    .line 382
    goto/16 :goto_4

    .line 383
    .line 384
    :goto_7
    :try_start_5
    iget-object v4, p0, Lq;->b:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v4, Lna;

    .line 387
    .line 388
    iget-object v4, v4, Lna;->a:Ljava/io/File;

    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 391
    .line 392
    .line 393
    new-instance v4, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const-string v5, "local voice direct file send failed: "

    .line 399
    .line 400
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string v5, ": "

    .line 415
    .line 416
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Lne;

    .line 440
    .line 441
    iget-object v0, v0, Lne;->f:Landroid/app/Activity;

    .line 442
    .line 443
    invoke-static {v0, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 444
    .line 445
    .line 446
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast p0, Lne;

    .line 449
    .line 450
    iget-object v0, p0, Lne;->i:[Z

    .line 451
    .line 452
    aput-boolean v2, v0, v3

    .line 453
    .line 454
    iget-object p0, p0, Lne;->j:Landroid/app/Dialog;

    .line 455
    .line 456
    if-eqz p0, :cond_d

    .line 457
    .line 458
    goto/16 :goto_4

    .line 459
    .line 460
    :catchall_2
    :cond_d
    :goto_8
    return-void

    .line 461
    :catchall_3
    move-exception v0

    .line 462
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast p0, Lne;

    .line 465
    .line 466
    iget-object v1, p0, Lne;->i:[Z

    .line 467
    .line 468
    aput-boolean v2, v1, v3

    .line 469
    .line 470
    iget-object p0, p0, Lne;->j:Landroid/app/Dialog;

    .line 471
    .line 472
    if-eqz p0, :cond_e

    .line 473
    .line 474
    :try_start_6
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 475
    .line 476
    .line 477
    :catchall_4
    :cond_e
    throw v0

    .line 478
    :pswitch_1
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, Lx2;

    .line 481
    .line 482
    iget-object v1, v0, Lx2;->a:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v1, Lq;

    .line 485
    .line 486
    iget-object v0, v0, Lx2;->a:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Lq;

    .line 489
    .line 490
    iget-object v1, v1, Lq;->c:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v1, Lne;

    .line 493
    .line 494
    iget v1, v1, Lne;->e:I

    .line 495
    .line 496
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-eqz v1, :cond_10

    .line 501
    .line 502
    iget-object v1, v0, Lq;->c:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Lne;

    .line 505
    .line 506
    iget-object v1, v1, Lne;->f:Landroid/app/Activity;

    .line 507
    .line 508
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-nez v1, :cond_10

    .line 513
    .line 514
    iget-object v1, v0, Lq;->c:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v1, Lne;

    .line 517
    .line 518
    iget-object v1, v1, Lne;->f:Landroid/app/Activity;

    .line 519
    .line 520
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    if-eqz v1, :cond_f

    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_f
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast p0, Ljava/lang/String;

    .line 530
    .line 531
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    const-string v1, "local voice QQ send rejected callback="

    .line 536
    .line 537
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    iget-object p0, v0, Lq;->c:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast p0, Lne;

    .line 547
    .line 548
    iget-object p0, p0, Lne;->f:Landroid/app/Activity;

    .line 549
    .line 550
    const-string v0, "QQ \u672a\u63a5\u53d7\u8bed\u97f3\u53d1\u9001\uff0c\u8bf7\u91cd\u8bd5"

    .line 551
    .line 552
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    :cond_10
    :goto_9
    return-void

    .line 556
    :pswitch_2
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 557
    .line 558
    move-object v4, v0

    .line 559
    check-cast v4, Lic;

    .line 560
    .line 561
    iput-object v1, v4, Lic;->g:Lq;

    .line 562
    .line 563
    iget-boolean v0, v4, Lic;->f:Z

    .line 564
    .line 565
    if-nez v0, :cond_16

    .line 566
    .line 567
    iget-object v1, v4, Lic;->c:Ln0;

    .line 568
    .line 569
    monitor-enter v1

    .line 570
    :try_start_7
    iget-boolean v0, v1, Ln0;->b:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 571
    .line 572
    monitor-exit v1

    .line 573
    if-eqz v0, :cond_11

    .line 574
    .line 575
    goto :goto_c

    .line 576
    :cond_11
    iget-object v0, v4, Lic;->a:Ljava/lang/ref/WeakReference;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    check-cast v0, Landroid/view/View;

    .line 583
    .line 584
    if-eqz v0, :cond_16

    .line 585
    .line 586
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    if-nez v1, :cond_12

    .line 591
    .line 592
    goto :goto_c

    .line 593
    :cond_12
    sget-object v1, Lkc;->a:Ljava/util/WeakHashMap;

    .line 594
    .line 595
    monitor-enter v1

    .line 596
    :try_start_8
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    check-cast v0, Ljava/util/Map;

    .line 601
    .line 602
    if-eqz v0, :cond_15

    .line 603
    .line 604
    iget-object v5, v4, Lic;->b:Ljava/lang/String;

    .line 605
    .line 606
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    if-eq v0, v4, :cond_13

    .line 611
    .line 612
    goto :goto_a

    .line 613
    :cond_13
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 614
    iget-object v0, v4, Lic;->d:Ljc;

    .line 615
    .line 616
    if-nez v0, :cond_14

    .line 617
    .line 618
    move v3, v2

    .line 619
    goto :goto_c

    .line 620
    :cond_14
    :try_start_9
    invoke-interface {v0}, Ljc;->a()Z

    .line 621
    .line 622
    .line 623
    move-result v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 624
    goto :goto_c

    .line 625
    :catchall_5
    move-exception v0

    .line 626
    const-string v1, "repeater"

    .line 627
    .line 628
    new-instance v5, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    iget-object v4, v4, Lic;->b:Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v4, "-validate"

    .line 639
    .line 640
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-static {v1, v4, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 648
    .line 649
    .line 650
    goto :goto_c

    .line 651
    :catchall_6
    move-exception v0

    .line 652
    move-object p0, v0

    .line 653
    goto :goto_b

    .line 654
    :cond_15
    :goto_a
    :try_start_a
    monitor-exit v1

    .line 655
    goto :goto_c

    .line 656
    :goto_b
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 657
    throw p0

    .line 658
    :catchall_7
    move-exception v0

    .line 659
    move-object p0, v0

    .line 660
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 661
    throw p0

    .line 662
    :cond_16
    :goto_c
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lic;

    .line 665
    .line 666
    if-nez v3, :cond_17

    .line 667
    .line 668
    invoke-virtual {v0, v2}, Lic;->a(Z)V

    .line 669
    .line 670
    .line 671
    goto :goto_e

    .line 672
    :cond_17
    :try_start_c
    iget-object v0, v0, Lic;->e:Lhc;

    .line 673
    .line 674
    invoke-interface {v0}, Lhc;->run()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 675
    .line 676
    .line 677
    goto :goto_d

    .line 678
    :catchall_8
    move-exception v0

    .line 679
    const-string v1, "repeater"

    .line 680
    .line 681
    new-instance v2, Ljava/lang/StringBuilder;

    .line 682
    .line 683
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 684
    .line 685
    .line 686
    iget-object v3, p0, Lq;->c:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v3, Lic;

    .line 689
    .line 690
    iget-object v3, v3, Lic;->b:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    const-string v3, "-stage-"

    .line 696
    .line 697
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    iget-object v3, p0, Lq;->b:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v3, Lb0;

    .line 703
    .line 704
    iget v3, v3, Lb0;->a:I

    .line 705
    .line 706
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 714
    .line 715
    .line 716
    :goto_d
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast p0, Lic;

    .line 719
    .line 720
    invoke-virtual {p0}, Lic;->c()V

    .line 721
    .line 722
    .line 723
    :goto_e
    return-void

    .line 724
    :pswitch_3
    const-string v1, "\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 725
    .line 726
    const-string v0, "kk tts sent voice="

    .line 727
    .line 728
    :try_start_d
    iget-object v2, p0, Lq;->c:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v2, Lw8;

    .line 731
    .line 732
    iget-object v2, v2, Lw8;->d:Ll8;

    .line 733
    .line 734
    iget-boolean v2, v2, Ll8;->a:Z

    .line 735
    .line 736
    if-nez v2, :cond_1d

    .line 737
    .line 738
    iget-object v2, p0, Lq;->c:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v2, Lw8;

    .line 741
    .line 742
    iget v2, v2, Lw8;->f:I

    .line 743
    .line 744
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eqz v2, :cond_1d

    .line 749
    .line 750
    iget-object v2, p0, Lq;->c:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v2, Lw8;

    .line 753
    .line 754
    iget-object v2, v2, Lw8;->g:Landroid/app/Activity;

    .line 755
    .line 756
    invoke-static {v2}, Li5;->z0(Landroid/app/Activity;)Z

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    if-nez v2, :cond_18

    .line 761
    .line 762
    goto/16 :goto_12

    .line 763
    .line 764
    :cond_18
    iget-object v2, p0, Lq;->b:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v2, Lna;

    .line 767
    .line 768
    iget-object v2, v2, Lna;->a:Ljava/io/File;

    .line 769
    .line 770
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 771
    .line 772
    .line 773
    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 774
    iget-object v4, p0, Lq;->c:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v4, Lw8;

    .line 777
    .line 778
    if-nez v2, :cond_19

    .line 779
    .line 780
    :try_start_e
    iget-object v0, v4, Lw8;->g:Landroid/app/Activity;

    .line 781
    .line 782
    const-string v2, "\u8bed\u97f3\u8f6c\u6362\u5931\u8d25"

    .line 783
    .line 784
    invoke-static {v0, v2}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 785
    .line 786
    .line 787
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, Lw8;

    .line 790
    .line 791
    iget-object v1, v0, Lw8;->j:Lx2;

    .line 792
    .line 793
    iget-object v1, v1, Lx2;->a:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v1, Landroid/app/Dialog;

    .line 796
    .line 797
    iget-object v0, v0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 798
    .line 799
    invoke-static {v1, v0}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 800
    .line 801
    .line 802
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v0, Lw8;

    .line 805
    .line 806
    iget-object v0, v0, Lw8;->g:Landroid/app/Activity;

    .line 807
    .line 808
    invoke-static {v0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-eqz v0, :cond_1e

    .line 813
    .line 814
    :goto_f
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast p0, Lw8;

    .line 817
    .line 818
    iget-object v0, p0, Lw8;->g:Landroid/app/Activity;

    .line 819
    .line 820
    iget-object v1, p0, Lw8;->h:Ljava/lang/ClassLoader;

    .line 821
    .line 822
    iget-object v2, p0, Lw8;->i:Lpd;

    .line 823
    .line 824
    iget-object v3, p0, Lw8;->c:Lb9;

    .line 825
    .line 826
    iget-object p0, p0, Lw8;->b:Ljava/lang/String;

    .line 827
    .line 828
    invoke-static {v0, v1, v2, v3, p0}, Li5;->Q1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    goto/16 :goto_14

    .line 832
    .line 833
    :catchall_9
    move-exception v0

    .line 834
    goto/16 :goto_13

    .line 835
    .line 836
    :cond_19
    :try_start_f
    iget-object v2, v4, Lw8;->h:Ljava/lang/ClassLoader;

    .line 837
    .line 838
    iget-object v4, p0, Lq;->b:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v4, Lna;

    .line 841
    .line 842
    iget-object v4, v4, Lna;->a:Ljava/io/File;

    .line 843
    .line 844
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    iget-object v5, p0, Lq;->b:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v5, Lna;

    .line 851
    .line 852
    iget v5, v5, Lna;->b:I

    .line 853
    .line 854
    iget-object v6, p0, Lq;->c:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v6, Lw8;

    .line 857
    .line 858
    iget-object v6, v6, Lw8;->i:Lpd;

    .line 859
    .line 860
    invoke-static {v2, v4, v5, v6}, Lcom/mr/elaris/w;->K0(Ljava/lang/ClassLoader;Ljava/lang/String;ILpd;)Z

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    if-nez v2, :cond_1a

    .line 865
    .line 866
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v0, Lna;

    .line 869
    .line 870
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 871
    .line 872
    invoke-static {v0}, Li5;->a(Ljava/io/File;)V

    .line 873
    .line 874
    .line 875
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v0, Lw8;

    .line 878
    .line 879
    iget-object v0, v0, Lw8;->g:Landroid/app/Activity;

    .line 880
    .line 881
    invoke-static {v0, v1}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 882
    .line 883
    .line 884
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, Lw8;

    .line 887
    .line 888
    iget-object v1, v0, Lw8;->j:Lx2;

    .line 889
    .line 890
    iget-object v1, v1, Lx2;->a:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v1, Landroid/app/Dialog;

    .line 893
    .line 894
    iget-object v0, v0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 895
    .line 896
    invoke-static {v1, v0}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 897
    .line 898
    .line 899
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, Lw8;

    .line 902
    .line 903
    iget-object v0, v0, Lw8;->g:Landroid/app/Activity;

    .line 904
    .line 905
    invoke-static {v0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    if-eqz v0, :cond_1e

    .line 910
    .line 911
    goto :goto_f

    .line 912
    :cond_1a
    :try_start_10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Lw8;

    .line 920
    .line 921
    iget-object v0, v0, Lw8;->c:Lb9;

    .line 922
    .line 923
    iget-object v0, v0, Lb9;->a:Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    const-string v0, " chars="

    .line 929
    .line 930
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v0, Lw8;

    .line 936
    .line 937
    iget-object v0, v0, Lw8;->b:Ljava/lang/String;

    .line 938
    .line 939
    if-eqz v0, :cond_1c

    .line 940
    .line 941
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    if-nez v4, :cond_1b

    .line 946
    .line 947
    goto :goto_10

    .line 948
    :cond_1b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 949
    .line 950
    .line 951
    move-result v4

    .line 952
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->codePointCount(II)I

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    :cond_1c
    :goto_10
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    const-string v0, " seconds="

    .line 960
    .line 961
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v0, Lna;

    .line 967
    .line 968
    iget v0, v0, Lna;->b:I

    .line 969
    .line 970
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    const-string v0, " encoder=silk ptt=generated"

    .line 974
    .line 975
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 983
    .line 984
    .line 985
    :goto_11
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast p0, Lw8;

    .line 988
    .line 989
    iget-object v0, p0, Lw8;->j:Lx2;

    .line 990
    .line 991
    iget-object v0, v0, Lx2;->a:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v0, Landroid/app/Dialog;

    .line 994
    .line 995
    iget-object p0, p0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 996
    .line 997
    invoke-static {v0, p0}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 998
    .line 999
    .line 1000
    goto :goto_14

    .line 1001
    :cond_1d
    :goto_12
    :try_start_11
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, Lna;

    .line 1004
    .line 1005
    iget-object v0, v0, Lna;->a:Ljava/io/File;

    .line 1006
    .line 1007
    invoke-static {v0}, Li5;->a(Ljava/io/File;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 1008
    .line 1009
    .line 1010
    goto :goto_11

    .line 1011
    :goto_13
    :try_start_12
    iget-object v2, p0, Lq;->b:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v2, Lna;

    .line 1014
    .line 1015
    iget-object v2, v2, Lna;->a:Ljava/io/File;

    .line 1016
    .line 1017
    invoke-static {v2}, Li5;->a(Ljava/io/File;)V

    .line 1018
    .line 1019
    .line 1020
    const-string v2, "kk-tts"

    .line 1021
    .line 1022
    const-string v3, "send"

    .line 1023
    .line 1024
    invoke-static {v2, v3, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1025
    .line 1026
    .line 1027
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v0, Lw8;

    .line 1030
    .line 1031
    iget-object v0, v0, Lw8;->g:Landroid/app/Activity;

    .line 1032
    .line 1033
    invoke-static {v0, v1}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, Lw8;

    .line 1039
    .line 1040
    iget-object v1, v0, Lw8;->j:Lx2;

    .line 1041
    .line 1042
    iget-object v1, v1, Lx2;->a:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast v1, Landroid/app/Dialog;

    .line 1045
    .line 1046
    iget-object v0, v0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1047
    .line 1048
    invoke-static {v1, v0}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 1049
    .line 1050
    .line 1051
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, Lw8;

    .line 1054
    .line 1055
    iget-object v0, v0, Lw8;->g:Landroid/app/Activity;

    .line 1056
    .line 1057
    invoke-static {v0}, Li5;->z0(Landroid/app/Activity;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    if-eqz v0, :cond_1e

    .line 1062
    .line 1063
    goto/16 :goto_f

    .line 1064
    .line 1065
    :cond_1e
    :goto_14
    return-void

    .line 1066
    :catchall_a
    move-exception v0

    .line 1067
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast p0, Lw8;

    .line 1070
    .line 1071
    iget-object v1, p0, Lw8;->j:Lx2;

    .line 1072
    .line 1073
    iget-object v1, v1, Lx2;->a:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v1, Landroid/app/Dialog;

    .line 1076
    .line 1077
    iget-object p0, p0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1078
    .line 1079
    invoke-static {v1, p0}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 1080
    .line 1081
    .line 1082
    throw v0

    .line 1083
    :pswitch_4
    :try_start_13
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v0, Lu8;

    .line 1086
    .line 1087
    iget-object v0, v0, Lu8;->c:Lx8;

    .line 1088
    .line 1089
    iget-object v0, v0, Lx8;->a:Ll8;

    .line 1090
    .line 1091
    iget-object v2, p0, Lq;->c:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v2, Lu8;

    .line 1094
    .line 1095
    iget-object v2, v2, Lu8;->a:Ll8;

    .line 1096
    .line 1097
    if-ne v0, v2, :cond_20

    .line 1098
    .line 1099
    iget-boolean v0, v2, Ll8;->a:Z

    .line 1100
    .line 1101
    if-nez v0, :cond_20

    .line 1102
    .line 1103
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, Lu8;

    .line 1106
    .line 1107
    iget-object v0, v0, Lu8;->d:Landroid/app/Dialog;

    .line 1108
    .line 1109
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    if-nez v0, :cond_1f

    .line 1114
    .line 1115
    goto :goto_15

    .line 1116
    :cond_1f
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v0, Lu8;

    .line 1119
    .line 1120
    iget-object v0, v0, Lu8;->c:Lx8;

    .line 1121
    .line 1122
    iput-object v1, v0, Lx8;->a:Ll8;

    .line 1123
    .line 1124
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v0, Lu8;

    .line 1127
    .line 1128
    iget-object v0, v0, Lu8;->e:Lz8;

    .line 1129
    .line 1130
    iget-object v1, p0, Lq;->b:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v1, Ljava/util/ArrayList;

    .line 1133
    .line 1134
    iget-object v2, v0, Lz8;->c:Ljava/util/ArrayList;

    .line 1135
    .line 1136
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 1143
    .line 1144
    .line 1145
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, Lu8;

    .line 1148
    .line 1149
    iget-object v0, v0, Lu8;->f:Landroid/widget/TextView;

    .line 1150
    .line 1151
    const-string v1, "\u9009\u62e9\u97f3\u8272\u540e\u8f93\u5165\u6587\u5b57"

    .line 1152
    .line 1153
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v0, Lu8;

    .line 1159
    .line 1160
    iget-object v0, v0, Lu8;->g:Landroid/widget/ListView;

    .line 1161
    .line 1162
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1163
    .line 1164
    .line 1165
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1166
    .line 1167
    check-cast v0, Lu8;

    .line 1168
    .line 1169
    iget-object v1, v0, Lu8;->h:Landroid/app/Activity;

    .line 1170
    .line 1171
    iget-object v0, v0, Lu8;->d:Landroid/app/Dialog;

    .line 1172
    .line 1173
    invoke-static {v1}, Lu9;->A(Landroid/app/Activity;)I

    .line 1174
    .line 1175
    .line 1176
    move-result v1

    .line 1177
    invoke-static {v0, v1}, Li5;->o(Landroid/app/Dialog;I)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 1178
    .line 1179
    .line 1180
    :cond_20
    :goto_15
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast p0, Lu8;

    .line 1183
    .line 1184
    iget-object p0, p0, Lu8;->a:Ll8;

    .line 1185
    .line 1186
    invoke-static {p0}, La9;->a(Ll8;)V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_16

    .line 1190
    :catchall_b
    move-exception v0

    .line 1191
    goto :goto_17

    .line 1192
    :goto_16
    return-void

    .line 1193
    :goto_17
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast p0, Lu8;

    .line 1196
    .line 1197
    iget-object p0, p0, Lu8;->a:Ll8;

    .line 1198
    .line 1199
    invoke-static {p0}, La9;->a(Ll8;)V

    .line 1200
    .line 1201
    .line 1202
    throw v0

    .line 1203
    :pswitch_5
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, Ljava/lang/String;

    .line 1206
    .line 1207
    :try_start_14
    iget-object p0, p0, Lq;->b:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast p0, Landroid/widget/EditText;

    .line 1210
    .line 1211
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1212
    .line 1213
    .line 1214
    move-result-object p0

    .line 1215
    if-nez p0, :cond_21

    .line 1216
    .line 1217
    goto :goto_18

    .line 1218
    :cond_21
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1223
    .line 1224
    .line 1225
    move-result v1

    .line 1226
    if-ltz v1, :cond_22

    .line 1227
    .line 1228
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1229
    .line 1230
    .line 1231
    move-result v0

    .line 1232
    add-int/2addr v0, v1

    .line 1233
    invoke-interface {p0, v1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 1234
    .line 1235
    .line 1236
    :catchall_c
    :cond_22
    :goto_18
    return-void

    .line 1237
    :pswitch_6
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, Li4;

    .line 1240
    .line 1241
    iget-object v1, v0, Li4;->c:Landroid/widget/EditText;

    .line 1242
    .line 1243
    iget-object v0, v0, Li4;->a:Ljava/lang/String;

    .line 1244
    .line 1245
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1246
    .line 1247
    check-cast p0, Lt4;

    .line 1248
    .line 1249
    :try_start_15
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    if-nez v1, :cond_23

    .line 1254
    .line 1255
    goto :goto_1a

    .line 1256
    :cond_23
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1261
    .line 1262
    .line 1263
    move-result v2

    .line 1264
    if-gez v2, :cond_24

    .line 1265
    .line 1266
    goto :goto_1a

    .line 1267
    :cond_24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    add-int/2addr v0, v2

    .line 1272
    const-class v4, Lt4;

    .line 1273
    .line 1274
    invoke-interface {v1, v2, v0, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v4

    .line 1278
    check-cast v4, [Lt4;

    .line 1279
    .line 1280
    if-eqz v4, :cond_25

    .line 1281
    .line 1282
    :goto_19
    array-length v5, v4

    .line 1283
    if-ge v3, v5, :cond_25

    .line 1284
    .line 1285
    aget-object v5, v4, v3

    .line 1286
    .line 1287
    invoke-interface {v1, v5}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    add-int/lit8 v3, v3, 0x1

    .line 1291
    .line 1292
    goto :goto_19

    .line 1293
    :cond_25
    const/16 v3, 0x21

    .line 1294
    .line 1295
    invoke-interface {v1, p0, v2, v0, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 1296
    .line 1297
    .line 1298
    :catchall_d
    :goto_1a
    return-void

    .line 1299
    :pswitch_7
    iget-object v0, p0, Lq;->c:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, Ld2;

    .line 1302
    .line 1303
    iget-object v1, v0, Ld2;->c:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v1, Le2;

    .line 1306
    .line 1307
    iget-object v1, v1, Le2;->a:Landroid/app/Dialog;

    .line 1308
    .line 1309
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    if-eqz v1, :cond_26

    .line 1314
    .line 1315
    iget-object v0, v0, Ld2;->e:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v0, Landroid/widget/ImageView;

    .line 1318
    .line 1319
    iget-object p0, p0, Lq;->b:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast p0, Landroid/graphics/Bitmap;

    .line 1322
    .line 1323
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1324
    .line 1325
    .line 1326
    :cond_26
    return-void

    .line 1327
    :pswitch_8
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 1328
    .line 1329
    check-cast v0, Le2;

    .line 1330
    .line 1331
    iget-object v1, v0, Le2;->a:Landroid/app/Dialog;

    .line 1332
    .line 1333
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v1

    .line 1337
    if-eqz v1, :cond_27

    .line 1338
    .line 1339
    iget-object v0, v0, Le2;->g:Landroid/widget/TextView;

    .line 1340
    .line 1341
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast p0, Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_27
    return-void

    .line 1349
    :pswitch_9
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 1350
    .line 1351
    move-object v1, v0

    .line 1352
    check-cast v1, Le2;

    .line 1353
    .line 1354
    :try_start_16
    iget-object v0, v1, Le2;->b:Landroid/app/Activity;

    .line 1355
    .line 1356
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast p0, Ll1;

    .line 1359
    .line 1360
    invoke-static {v0, p0}, Li5;->X(Landroid/content/Context;Ll1;)Ljava/io/File;

    .line 1361
    .line 1362
    .line 1363
    move-result-object p0

    .line 1364
    iget-object v0, v1, Le2;->c:Ljava/lang/ClassLoader;

    .line 1365
    .line 1366
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object p0

    .line 1370
    iget-object v2, v1, Le2;->d:Lpd;

    .line 1371
    .line 1372
    invoke-static {v0, p0, v2}, Lu9;->D(Ljava/lang/ClassLoader;Ljava/lang/String;Lpd;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result p0

    .line 1376
    if-eqz p0, :cond_28

    .line 1377
    .line 1378
    const-string p0, "\u5df2\u63d0\u4ea4\u7ed9 QQ \u53d1\u9001"

    .line 1379
    .line 1380
    goto :goto_1b

    .line 1381
    :catchall_e
    move-exception v0

    .line 1382
    move-object p0, v0

    .line 1383
    goto :goto_1c

    .line 1384
    :cond_28
    const-string p0, "\u53d1\u9001\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u8fdb\u5165\u5f53\u524d\u4f1a\u8bdd"

    .line 1385
    .line 1386
    :goto_1b
    invoke-static {v1, p0}, Lg2;->m(Le2;Ljava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    .line 1387
    .line 1388
    .line 1389
    goto :goto_1d

    .line 1390
    :goto_1c
    invoke-static {p0}, Lg2;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object p0

    .line 1394
    invoke-static {v1, p0}, Lg2;->m(Le2;Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    :goto_1d
    return-void

    .line 1398
    :pswitch_a
    iget-object v0, p0, Lq;->b:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v0, Landroid/app/Activity;

    .line 1401
    .line 1402
    iget-object p0, p0, Lq;->c:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast p0, Ljava/lang/String;

    .line 1405
    .line 1406
    invoke-static {v0, p0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1407
    .line 1408
    .line 1409
    move-result-object p0

    .line 1410
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 1411
    .line 1412
    .line 1413
    return-void

    .line 1414
    nop

    .line 1415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
