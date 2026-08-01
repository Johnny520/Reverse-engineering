.class public final synthetic Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq0/b;->b:I

    iput-object p1, p0, Lq0/b;->d:Ljava/lang/Object;

    iput-object p2, p0, Lq0/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq0/f;Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput p3, p0, Lq0/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/b;->d:Ljava/lang/Object;

    iput-object p2, p0, Lq0/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 13

    .line 1
    const/4 p1, 0x0

    .line 2
    const-string p2, ""

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget v0, p0, Lq0/b;->b:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-boolean p1, Lz0/i;->a:Z

    .line 11
    .line 12
    const-string p1, "clear sp data fail"

    .line 13
    .line 14
    :try_start_0
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p2, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v1}, Lz0/g;->q(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lz0/g;->I()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_0
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object p1, p0, Lq0/b;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Landroid/widget/FrameLayout;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 90
    .line 91
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance p2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, "\u914d\u7f6e\u5df2\u6e05\u7a7a\uff0c\u8bf7\u6740\u6389"

    .line 98
    .line 99
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, "\u5e76\u91cd\u542f"

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lq0/b;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Ls0/J;

    .line 120
    .line 121
    invoke-virtual {p1}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_1

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 128
    .line 129
    .line 130
    :cond_1
    return-void

    .line 131
    :pswitch_0
    sget-object v0, Lz0/l;->a:Landroid/util/LruCache;

    .line 132
    .line 133
    iget-object v0, p0, Lq0/b;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ls0/i;

    .line 136
    .line 137
    iget-object v0, v0, Ls0/i;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-nez v0, :cond_2

    .line 148
    .line 149
    move-object v0, p2

    .line 150
    :cond_2
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_3

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_3
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, LF0/v;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    :try_start_1
    new-instance v2, Ljava/io/File;

    .line 174
    .line 175
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    :catchall_0
    :cond_4
    invoke-static {p1}, Lz0/l;->f(Ljava/util/LinkedHashMap;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    :goto_2
    if-eqz p1, :cond_8

    .line 186
    .line 187
    iget-object p1, p0, Lq0/b;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p1, Ls0/l;

    .line 190
    .line 191
    iget-object v0, p1, Ls0/l;->g:Ls0/f;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 194
    .line 195
    .line 196
    const-string v0, "\u5df2\u6e05\u9664\u672c\u5730\u5934\u50cf"

    .line 197
    .line 198
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p1, Ls0/l;->k:Landroid/widget/EditText;

    .line 202
    .line 203
    if-eqz v0, :cond_7

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eqz v0, :cond_5

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :cond_5
    if-nez v1, :cond_6

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_6
    move-object p2, v1

    .line 219
    :goto_3
    invoke-virtual {p1, p2}, Ls0/l;->c(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_7
    const-string p1, "searchEditText"

    .line 224
    .line 225
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :cond_8
    const-string p1, "\u6e05\u9664\u5931\u8d25"

    .line 230
    .line 231
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_4
    return-void

    .line 235
    :pswitch_1
    iget-object v0, p0, Lq0/b;->d:Ljava/lang/Object;

    .line 236
    .line 237
    move-object v2, v0

    .line 238
    check-cast v2, Lr0/Y0;

    .line 239
    .line 240
    iget-object v0, p0, Lq0/b;->c:Ljava/lang/Object;

    .line 241
    .line 242
    move-object v3, v0

    .line 243
    check-cast v3, Lr0/P0;

    .line 244
    .line 245
    iget-object v0, v3, Lr0/P0;->e:Landroid/view/View;

    .line 246
    .line 247
    iget-object v4, v3, Lr0/P0;->c:Ljava/util/LinkedHashSet;

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    const-string v10, "self_sns_"

    .line 253
    .line 254
    const-string v11, "hidden_self_sns_posts"

    .line 255
    .line 256
    if-nez v0, :cond_9

    .line 257
    .line 258
    goto/16 :goto_8

    .line 259
    .line 260
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-lez v5, :cond_d

    .line 269
    .line 270
    if-gtz v6, :cond_a

    .line 271
    .line 272
    goto/16 :goto_8

    .line 273
    .line 274
    :cond_a
    const/16 v7, 0x384

    .line 275
    .line 276
    :try_start_2
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 281
    .line 282
    invoke-static {v5, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    const-string v5, "createBitmap(...)"

    .line 287
    .line 288
    invoke-static {v12, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v5, Landroid/graphics/Canvas;

    .line 292
    .line 293
    invoke-direct {v5, v12}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 297
    .line 298
    .line 299
    const-string v5, "_"

    .line 300
    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    .line 303
    const/16 v9, 0x3e

    .line 304
    .line 305
    const/4 v6, 0x0

    .line 306
    invoke-static/range {v4 .. v9}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    const-string v4, "-"

    .line 319
    .line 320
    const-string v5, "n"

    .line 321
    .line 322
    invoke-static {v0, v4, v5}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-instance v4, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const-string v0, ".png"

    .line 335
    .line 336
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    new-instance v4, Ljava/io/File;

    .line 344
    .line 345
    sget-boolean v5, Lz0/i;->a:Z

    .line 346
    .line 347
    new-instance v5, Ljava/io/File;

    .line 348
    .line 349
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-direct {v5, v6, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    if-nez v6, :cond_b

    .line 365
    .line 366
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 367
    .line 368
    .line 369
    :cond_b
    invoke-direct {v4, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    new-instance v5, Ljava/io/FileOutputStream;

    .line 373
    .line 374
    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 375
    .line 376
    .line 377
    :try_start_3
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 378
    .line 379
    const/16 v6, 0x5a

    .line 380
    .line 381
    invoke-virtual {v12, v0, v6, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 382
    .line 383
    .line 384
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 394
    goto :goto_6

    .line 395
    :catchall_1
    move-exception v0

    .line 396
    goto :goto_5

    .line 397
    :catchall_2
    move-exception v0

    .line 398
    move-object v4, v0

    .line 399
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 400
    :catchall_3
    move-exception v0

    .line 401
    :try_start_6
    invoke-static {v5, v4}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 405
    :goto_5
    new-instance v4, LE0/d;

    .line 406
    .line 407
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    move-object v0, v4

    .line 411
    :goto_6
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    if-nez v4, :cond_c

    .line 416
    .line 417
    move-object p2, v0

    .line 418
    goto :goto_7

    .line 419
    :cond_c
    const-string v0, "save self sns preview image fail"

    .line 420
    .line 421
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :goto_7
    check-cast p2, Ljava/lang/String;

    .line 429
    .line 430
    :cond_d
    :goto_8
    sget-boolean v0, Lz0/i;->a:Z

    .line 431
    .line 432
    iget-object v0, v3, Lr0/P0;->c:Ljava/util/LinkedHashSet;

    .line 433
    .line 434
    iget-object v4, v3, Lr0/P0;->d:Ljava/lang/String;

    .line 435
    .line 436
    const-string v5, "imagePath"

    .line 437
    .line 438
    invoke-static {p2, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    new-instance v5, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-static {v0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    if-eqz v6, :cond_e

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    check-cast v6, Ljava/lang/String;

    .line 465
    .line 466
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 479
    .line 480
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    :cond_f
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-eqz v6, :cond_10

    .line 492
    .line 493
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    move-object v7, v6

    .line 498
    check-cast v7, Ljava/lang/String;

    .line 499
    .line 500
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 501
    .line 502
    .line 503
    move-result v7

    .line 504
    if-nez v7, :cond_f

    .line 505
    .line 506
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v5

    .line 514
    if-eqz v5, :cond_11

    .line 515
    .line 516
    move v9, p1

    .line 517
    goto :goto_c

    .line 518
    :cond_11
    invoke-static {}, Lz0/g;->h()Ljava/util/Set;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    move v7, p1

    .line 527
    :cond_12
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    const/4 v9, 0x1

    .line 532
    if-eqz v8, :cond_13

    .line 533
    .line 534
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    check-cast v8, Ljava/lang/String;

    .line 539
    .line 540
    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v8

    .line 544
    if-eqz v8, :cond_12

    .line 545
    .line 546
    move v7, v9

    .line 547
    goto :goto_b

    .line 548
    :cond_13
    if-nez v7, :cond_14

    .line 549
    .line 550
    invoke-static {v0, v4}, Lz0/g;->M(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-static {v0, p2}, Lz0/g;->L(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_14
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 558
    .line 559
    .line 560
    move-result-object v6

    .line 561
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    sget-boolean v7, Lz0/i;->a:Z

    .line 566
    .line 567
    invoke-interface {v6, v11, v5}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 572
    .line 573
    .line 574
    move-result v9

    .line 575
    if-nez v9, :cond_15

    .line 576
    .line 577
    const-string p2, "addHiddenSelfSnsPost fail"

    .line 578
    .line 579
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p2

    .line 583
    invoke-static {p2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_15
    invoke-static {v0, v4}, Lz0/g;->M(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v0, p2}, Lz0/g;->L(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-static {}, Lz0/g;->I()V

    .line 594
    .line 595
    .line 596
    :goto_c
    if-eqz v9, :cond_19

    .line 597
    .line 598
    iget-object p2, v3, Lr0/P0;->b:Landroid/widget/ListAdapter;

    .line 599
    .line 600
    if-eqz p2, :cond_16

    .line 601
    .line 602
    invoke-virtual {v2, p2}, Lr0/Y0;->G(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_16
    iget-object p2, v2, Lr0/Y0;->k:Ljava/lang/Object;

    .line 606
    .line 607
    if-eqz p2, :cond_18

    .line 608
    .line 609
    iget-object v0, v3, Lr0/P0;->b:Landroid/widget/ListAdapter;

    .line 610
    .line 611
    if-eq p2, v0, :cond_17

    .line 612
    .line 613
    move-object v1, p2

    .line 614
    :cond_17
    if-eqz v1, :cond_18

    .line 615
    .line 616
    invoke-virtual {v2, v1}, Lr0/Y0;->G(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_18
    iget-object p2, v3, Lr0/P0;->a:Landroid/app/Activity;

    .line 620
    .line 621
    const-string v0, "\u5df2\u9690\u85cf\u6b64\u6761\u670b\u53cb\u5708"

    .line 622
    .line 623
    invoke-static {p2, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 628
    .line 629
    .line 630
    iget-object p1, v3, Lr0/P0;->a:Landroid/app/Activity;

    .line 631
    .line 632
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 633
    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_19
    iget-object p2, v3, Lr0/P0;->a:Landroid/app/Activity;

    .line 637
    .line 638
    const-string v0, "\u9690\u85cf\u5931\u8d25"

    .line 639
    .line 640
    invoke-static {p2, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 645
    .line 646
    .line 647
    :goto_d
    return-void

    .line 648
    :pswitch_2
    iget-object p1, p0, Lq0/b;->d:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast p1, Landroid/content/Intent;

    .line 651
    .line 652
    iget-object p2, p0, Lq0/b;->c:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast p2, Landroid/app/Activity;

    .line 655
    .line 656
    :try_start_7
    const-string v0, "maskwechat://com.lu.wxmask/page/webView?&url=https://github.com/Mingyueyixi/MaskWechat"

    .line 657
    .line 658
    const/4 v1, 0x4

    .line 659
    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    const/high16 v1, 0x10000000

    .line 664
    .line 665
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 666
    .line 667
    .line 668
    invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 669
    .line 670
    .line 671
    goto :goto_e

    .line 672
    :catchall_4
    const-string p1, "\u6253\u5f00\u7cca\u8138\u4e3b\u9875\u5931\u8d25"

    .line 673
    .line 674
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    :goto_e
    return-void

    .line 678
    :pswitch_3
    iget-object p1, p0, Lq0/b;->d:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast p1, Lq0/f;

    .line 681
    .line 682
    iget-object p2, p0, Lq0/b;->c:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast p2, Landroid/app/Activity;

    .line 685
    .line 686
    invoke-virtual {p1, p2}, Lq0/f;->b(Landroid/app/Activity;)V

    .line 687
    .line 688
    .line 689
    return-void

    .line 690
    nop

    .line 691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
