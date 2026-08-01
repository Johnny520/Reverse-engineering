.class public final Lhe;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Ln9;

.field public final synthetic e:Landroid/app/Dialog;

.field public final synthetic f:Ljava/lang/ClassLoader;

.field public final synthetic g:Lpd;

.field public final synthetic h:Landroid/app/Dialog;

.field public final synthetic i:Landroid/widget/TextView;

.field public final synthetic j:Landroid/widget/LinearLayout;

.field public final synthetic k:[Lw6;

.field public final synthetic l:[I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/widget/EditText;Landroid/app/Activity;Ln9;Landroid/app/Dialog;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhe;->a:Ljava/lang/String;

    iput-object p2, p0, Lhe;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lhe;->c:Landroid/app/Activity;

    iput-object p4, p0, Lhe;->d:Ln9;

    iput-object p5, p0, Lhe;->e:Landroid/app/Dialog;

    iput-object p6, p0, Lhe;->f:Ljava/lang/ClassLoader;

    iput-object p7, p0, Lhe;->g:Lpd;

    iput-object p8, p0, Lhe;->h:Landroid/app/Dialog;

    iput-object p9, p0, Lhe;->i:Landroid/widget/TextView;

    iput-object p10, p0, Lhe;->j:Landroid/widget/LinearLayout;

    iput-object p11, p0, Lhe;->k:[Lw6;

    iput-object p12, p0, Lhe;->l:[I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget-object p1, p0, Lhe;->b:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move-object p1, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    iget-object v0, p0, Lhe;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    move-object p1, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_1
    const/16 v3, 0xa

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/16 v3, 0xd

    .line 44
    .line 45
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/4 v5, 0x0

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-lez v3, :cond_3

    .line 66
    .line 67
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 68
    .line 69
    invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v6, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    sub-int/2addr v3, v6

    .line 92
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_4

    .line 105
    .line 106
    :goto_2
    move-object p1, v1

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    iget-object v3, p0, Lhe;->c:Landroid/app/Activity;

    .line 117
    .line 118
    if-nez v2, :cond_5

    .line 119
    .line 120
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 121
    .line 122
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_16

    .line 131
    .line 132
    const-string v2, "."

    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-nez v2, :cond_16

    .line 139
    .line 140
    const-string v2, ".."

    .line 141
    .line 142
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_6

    .line 147
    .line 148
    goto/16 :goto_c

    .line 149
    .line 150
    :cond_6
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-ge v5, v2, :cond_8

    .line 155
    .line 156
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-lt v2, v4, :cond_16

    .line 161
    .line 162
    const/16 v6, 0x2f

    .line 163
    .line 164
    if-eq v2, v6, :cond_16

    .line 165
    .line 166
    const/16 v6, 0x5c

    .line 167
    .line 168
    if-eq v2, v6, :cond_16

    .line 169
    .line 170
    const/16 v6, 0x3a

    .line 171
    .line 172
    if-eq v2, v6, :cond_16

    .line 173
    .line 174
    const/16 v6, 0x2a

    .line 175
    .line 176
    if-eq v2, v6, :cond_16

    .line 177
    .line 178
    const/16 v6, 0x3f

    .line 179
    .line 180
    if-eq v2, v6, :cond_16

    .line 181
    .line 182
    const/16 v6, 0x22

    .line 183
    .line 184
    if-eq v2, v6, :cond_16

    .line 185
    .line 186
    const/16 v6, 0x3c

    .line 187
    .line 188
    if-eq v2, v6, :cond_16

    .line 189
    .line 190
    const/16 v6, 0x3e

    .line 191
    .line 192
    if-eq v2, v6, :cond_16

    .line 193
    .line 194
    const/16 v6, 0x7c

    .line 195
    .line 196
    if-ne v2, v6, :cond_7

    .line 197
    .line 198
    goto/16 :goto_c

    .line 199
    .line 200
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    invoke-static {p1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-static {v2}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    const-string p0, "\u8bf7\u4fdd\u7559\u539f\u97f3\u9891\u540e\u7f00"

    .line 214
    .line 215
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    const-string p0, "\u6587\u4ef6\u540d\u672a\u6539\u53d8"

    .line 226
    .line 227
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_a
    const-string v2, "\u91cd\u547d\u540d\u5931\u8d25"

    .line 232
    .line 233
    if-eqz v3, :cond_13

    .line 234
    .line 235
    iget-object v0, p0, Lhe;->d:Ln9;

    .line 236
    .line 237
    iget-object v4, v0, Ln9;->b:Landroid/net/Uri;

    .line 238
    .line 239
    iget-object v0, v0, Ln9;->a:Ljava/io/File;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-nez v5, :cond_b

    .line 246
    .line 247
    goto/16 :goto_a

    .line 248
    .line 249
    :cond_b
    const-string v5, ": "

    .line 250
    .line 251
    if-eqz v0, :cond_f

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_f

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eqz v6, :cond_f

    .line 264
    .line 265
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    if-eqz v6, :cond_e

    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_e

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_c

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_c
    new-instance v7, Ljava/io/File;

    .line 285
    .line 286
    invoke-direct {v7, v6, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    if-eqz v6, :cond_d

    .line 294
    .line 295
    const-string v1, "\u540c\u540d\u6587\u4ef6\u5df2\u5b58\u5728"

    .line 296
    .line 297
    goto/16 :goto_b

    .line 298
    .line 299
    :catchall_0
    move-exception v0

    .line 300
    goto :goto_6

    .line 301
    :cond_d
    invoke-virtual {v0, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 302
    .line 303
    .line 304
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    if-eqz v0, :cond_e

    .line 306
    .line 307
    goto/16 :goto_b

    .line 308
    .line 309
    :cond_e
    :goto_5
    move-object v6, v2

    .line 310
    goto :goto_7

    .line 311
    :goto_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v7, "local voice rename file failed: "

    .line 314
    .line 315
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_f
    move-object v6, v1

    .line 352
    :goto_7
    if-eqz v4, :cond_11

    .line 353
    .line 354
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    :try_start_1
    invoke-static {v3, v4}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_10

    .line 363
    .line 364
    invoke-static {v7, v4, p1}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 365
    .line 366
    .line 367
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 368
    if-nez p1, :cond_14

    .line 369
    .line 370
    goto/16 :goto_a

    .line 371
    .line 372
    :catchall_1
    move-exception v0

    .line 373
    new-instance v8, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-string v9, "local voice rename document failed: "

    .line 376
    .line 377
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    :cond_10
    :try_start_2
    new-instance v0, Landroid/content/ContentValues;

    .line 413
    .line 414
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 415
    .line 416
    .line 417
    const-string v8, "_display_name"

    .line 418
    .line 419
    invoke-virtual {v0, v8, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    const/4 p1, 0x0

    .line 423
    invoke-virtual {v7, v4, v0, p1, p1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 424
    .line 425
    .line 426
    move-result p1
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 427
    if-lez p1, :cond_13

    .line 428
    .line 429
    goto :goto_b

    .line 430
    :catchall_2
    move-exception v0

    .line 431
    move-object p1, v0

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    const-string v1, "local voice rename media failed: "

    .line 435
    .line 436
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-static {p1}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    goto :goto_9

    .line 472
    :catch_0
    const-string p1, "\u6ca1\u6709\u91cd\u547d\u540d\u6743\u9650"

    .line 473
    .line 474
    :goto_8
    move-object v1, p1

    .line 475
    goto :goto_b

    .line 476
    :catch_1
    const-string p1, "\u6ca1\u6709\u91cd\u547d\u540d\u6743\u9650\uff0c\u8bf7\u91cd\u65b0\u6388\u6743\u76ee\u5f55"

    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_11
    :goto_9
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    if-lez p1, :cond_12

    .line 484
    .line 485
    move-object v1, v6

    .line 486
    goto :goto_b

    .line 487
    :cond_12
    const-string p1, "\u6b64\u6587\u4ef6\u6682\u4e0d\u652f\u6301\u91cd\u547d\u540d"

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_13
    :goto_a
    move-object v1, v2

    .line 491
    :cond_14
    :goto_b
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-lez p1, :cond_15

    .line 496
    .line 497
    invoke-static {v3, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :cond_15
    iget-object p1, p0, Lhe;->e:Landroid/app/Dialog;

    .line 502
    .line 503
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 504
    .line 505
    .line 506
    const-string p1, "\u5df2\u91cd\u547d\u540d"

    .line 507
    .line 508
    invoke-static {v3, p1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iget-object v11, p0, Lhe;->k:[Lw6;

    .line 512
    .line 513
    iget-object v10, p0, Lhe;->l:[I

    .line 514
    .line 515
    iget-object v4, p0, Lhe;->g:Lpd;

    .line 516
    .line 517
    iget-object v5, p0, Lhe;->c:Landroid/app/Activity;

    .line 518
    .line 519
    iget-object v6, p0, Lhe;->h:Landroid/app/Dialog;

    .line 520
    .line 521
    iget-object v7, p0, Lhe;->j:Landroid/widget/LinearLayout;

    .line 522
    .line 523
    iget-object v8, p0, Lhe;->i:Landroid/widget/TextView;

    .line 524
    .line 525
    iget-object v9, p0, Lhe;->f:Ljava/lang/ClassLoader;

    .line 526
    .line 527
    invoke-static/range {v4 .. v11}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :cond_16
    :goto_c
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u5408\u6cd5"

    .line 532
    .line 533
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-void
.end method
