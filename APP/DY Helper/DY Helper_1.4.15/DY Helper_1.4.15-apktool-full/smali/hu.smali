.class public final synthetic Lhu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:La80;


# direct methods
.method public synthetic constructor <init>(La80;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhu;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lhu;->η:La80;

    .line 4
    .line 5
    iput-object p2, p0, Lhu;->ζ:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;La80;I)V
    .locals 0

    .line 11
    iput p3, p0, Lhu;->ε:I

    iput-object p1, p0, Lhu;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Lhu;->η:La80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhu;->ε:I

    .line 4
    .line 5
    const-string v2, "#%08X"

    .line 6
    .line 7
    const-string v3, "\u8bf7\u8f93\u5165 5~300 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 8
    .line 9
    const-string v5, "\u5df2\u4fdd\u5b58 "

    .line 10
    .line 11
    const/16 v6, 0x14

    .line 12
    .line 13
    const/16 v7, 0x78

    .line 14
    .line 15
    const-string v8, "\u89c4\u5219\u5df2\u4fdd\u5b58"

    .line 16
    .line 17
    const-string v9, "im_auto_read_filter_rules"

    .line 18
    .line 19
    const-string v10, "\u8bf7\u8f93\u5165 0~100 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 20
    .line 21
    const-string v12, "\u989c\u8272\u5df2\u66f4\u65b0"

    .line 22
    .line 23
    const-string v14, "#%06X"

    .line 24
    .line 25
    const v16, 0xffffff

    .line 26
    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    sget-object v17, Ls62;->α:Ls62;

    .line 31
    .line 32
    iget-object v13, v0, Lhu;->ζ:Landroid/app/Activity;

    .line 33
    .line 34
    iget-object v15, v0, Lhu;->η:La80;

    .line 35
    .line 36
    packed-switch v1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v1, Lbv1;->α:Lbv1;

    .line 47
    .line 48
    invoke-static {v9, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lbv1;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-static {v13, v8, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 63
    .line 64
    .line 65
    return-object v17

    .line 66
    :pswitch_0
    move-object/from16 v0, p1

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    const-string v0, "{time}     {location}"

    .line 80
    .line 81
    :cond_0
    invoke-static {v0, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v1, Lbv1;->α:Lbv1;

    .line 86
    .line 87
    const-string v1, "info_bar_text_format"

    .line 88
    .line 89
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v6}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    const-string v0, "\u683c\u5f0f\u5df2\u66f4\u65b0\uff0c\u5207\u6362\u89c6\u9891\u540e\u751f\u6548"

    .line 100
    .line 101
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 106
    .line 107
    .line 108
    return-object v17

    .line 109
    :pswitch_1
    move-object/from16 v0, p1

    .line 110
    .line 111
    check-cast v0, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v1, Lbv1;->α:Lbv1;

    .line 117
    .line 118
    invoke-static {v9, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lbv1;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-static {v13, v8, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 133
    .line 134
    .line 135
    return-object v17

    .line 136
    :pswitch_2
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Landroid/net/Uri;

    .line 139
    .line 140
    if-nez v1, :cond_1

    .line 141
    .line 142
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto/16 :goto_8

    .line 148
    .line 149
    :cond_1
    :try_start_0
    invoke-virtual {v13}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_3

    .line 165
    .line 166
    :cond_2
    move v0, v4

    .line 167
    goto :goto_0

    .line 168
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_2

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Landroid/content/UriPermission;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-static {v3, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_4

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/content/UriPermission;->isReadPermission()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_4

    .line 199
    .line 200
    const/4 v0, 0x1

    .line 201
    goto :goto_0

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto :goto_1

    .line 204
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    goto :goto_2

    .line 209
    :goto_1
    new-instance v2, Leo1;

    .line 210
    .line 211
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    move-object v0, v2

    .line 215
    :goto_2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    instance-of v3, v0, Leo1;

    .line 218
    .line 219
    if-eqz v3, :cond_5

    .line 220
    .line 221
    move-object v0, v2

    .line 222
    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_6

    .line 229
    .line 230
    const-string v0, "\u81ea\u52a8\u4efb\u52a1\u56fe\u7247\u672a\u83b7\u5f97\u6301\u4e45\u8bfb\u53d6\u6743\u9650\uff0c\u62d2\u7edd\u4fdd\u5b58 URI"

    .line 231
    .line 232
    const/4 v1, 0x4

    .line 233
    const-string v3, "DYHelper"

    .line 234
    .line 235
    invoke-static {v3, v0, v11, v1, v11}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const-string v0, "\u6240\u9009\u56fe\u7247\u4e0d\u652f\u6301\u957f\u671f\u8bfb\u53d6\uff0c\u8bf7\u66f4\u6362\u6587\u4ef6\u6765\u6e90"

    .line 239
    .line 240
    const/4 v1, 0x1

    .line 241
    invoke-static {v13, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v15, v2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    goto/16 :goto_8

    .line 252
    .line 253
    :cond_6
    :try_start_1
    invoke-virtual {v13}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 254
    .line 255
    .line 256
    move-result-object v18

    .line 257
    const-string v0, "_display_name"

    .line 258
    .line 259
    filled-new-array {v0}, [Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 263
    const/16 v22, 0x0

    .line 264
    .line 265
    const/16 v23, 0x0

    .line 266
    .line 267
    const/16 v21, 0x0

    .line 268
    .line 269
    move-object/from16 v19, v1

    .line 270
    .line 271
    :try_start_2
    invoke-virtual/range {v18 .. v23}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 272
    .line 273
    .line 274
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 275
    if-eqz v1, :cond_8

    .line 276
    .line 277
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_7

    .line 282
    .line 283
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 287
    goto :goto_3

    .line 288
    :catchall_1
    move-exception v0

    .line 289
    move-object v2, v0

    .line 290
    goto :goto_4

    .line 291
    :cond_7
    move-object v0, v11

    .line 292
    :goto_3
    :try_start_4
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :catchall_2
    move-exception v0

    .line 297
    goto :goto_5

    .line 298
    :goto_4
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 299
    :catchall_3
    move-exception v0

    .line 300
    :try_start_6
    invoke-static {v1, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 304
    :cond_8
    move-object v0, v11

    .line 305
    goto :goto_6

    .line 306
    :catchall_4
    move-exception v0

    .line 307
    move-object/from16 v19, v1

    .line 308
    .line 309
    :goto_5
    new-instance v1, Leo1;

    .line 310
    .line 311
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move-object v0, v1

    .line 315
    :goto_6
    instance-of v1, v0, Leo1;

    .line 316
    .line 317
    if-eqz v1, :cond_9

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_9
    move-object v11, v0

    .line 321
    :goto_7
    check-cast v11, Ljava/lang/String;

    .line 322
    .line 323
    if-nez v11, :cond_a

    .line 324
    .line 325
    invoke-virtual/range {v19 .. v19}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    if-nez v11, :cond_a

    .line 330
    .line 331
    const-string v11, "\u5df2\u9009\u62e9\u56fe\u7247"

    .line 332
    .line 333
    :cond_a
    sget-object v0, Lbv1;->α:Lbv1;

    .line 334
    .line 335
    invoke-virtual/range {v19 .. v19}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    const-string v1, "pet_elf_task_image_uri"

    .line 343
    .line 344
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    const-string v0, "pet_elf_task_image_name"

    .line 348
    .line 349
    invoke-static {v11, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-static {v0, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const-string v0, "\u81ea\u52a8\u4efb\u52a1\u56fe\u7247\u5df2\u66f4\u65b0"

    .line 357
    .line 358
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 363
    .line 364
    .line 365
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    :goto_8
    return-object v17

    .line 371
    :pswitch_3
    move-object/from16 v0, p1

    .line 372
    .line 373
    check-cast v0, Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-static {v0}, Lq02;->к(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    new-instance v1, Ljava/util/ArrayList;

    .line 383
    .line 384
    const/16 v2, 0xa

    .line 385
    .line 386
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_b

    .line 402
    .line 403
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    check-cast v2, Ljava/lang/String;

    .line 408
    .line 409
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    :cond_c
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_d

    .line 435
    .line 436
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    move-object v3, v2

    .line 441
    check-cast v3, Ljava/lang/String;

    .line 442
    .line 443
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-nez v3, :cond_c

    .line 448
    .line 449
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_d
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    new-instance v1, Lorg/json/JSONArray;

    .line 462
    .line 463
    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    sget-object v2, Lbv1;->α:Lbv1;

    .line 474
    .line 475
    const-string v2, "filter_keywords"

    .line 476
    .line 477
    invoke-static {v2, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v1}, Lbv1;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-interface {v15, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    new-instance v1, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    const-string v0, " \u4e2a\u5173\u952e\u8bcd"

    .line 500
    .line 501
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 513
    .line 514
    .line 515
    return-object v17

    .line 516
    :pswitch_4
    move-object/from16 v0, p1

    .line 517
    .line 518
    check-cast v0, Lv9;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    new-instance v1, Ljg1;

    .line 524
    .line 525
    invoke-direct {v1, v15, v13, v0}, Ljg1;-><init>(La80;Landroid/app/Activity;Lv9;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v13, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 529
    .line 530
    .line 531
    return-object v17

    .line 532
    :pswitch_5
    move-object/from16 v0, p1

    .line 533
    .line 534
    check-cast v0, Lgk0;

    .line 535
    .line 536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    sget-object v1, Lbv1;->α:Lbv1;

    .line 540
    .line 541
    iget-object v1, v0, Lgk0;->α:Ljava/lang/String;

    .line 542
    .line 543
    const-string v2, "im_time_label_format"

    .line 544
    .line 545
    invoke-static {v2, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    iget-object v0, v0, Lgk0;->β:Ljava/lang/String;

    .line 549
    .line 550
    const-string v2, "im_time_label_text"

    .line 551
    .line 552
    invoke-static {v2, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v0, v1}, Lbv1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    const-string v0, "\u65f6\u95f4\u6807\u7b7e\u663e\u793a\u5df2\u66f4\u65b0"

    .line 563
    .line 564
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 569
    .line 570
    .line 571
    return-object v17

    .line 572
    :pswitch_6
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-nez v1, :cond_e

    .line 584
    .line 585
    sget-object v1, Lbv1;->α:Lbv1;

    .line 586
    .line 587
    const-string v1, "precise_time_format"

    .line 588
    .line 589
    const/16 v2, 0x32

    .line 590
    .line 591
    invoke-static {v0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    const-string v1, "\u65f6\u95f4\u683c\u5f0f\u5df2\u66f4\u65b0"

    .line 599
    .line 600
    invoke-static {v13, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 605
    .line 606
    .line 607
    invoke-static {v0, v6}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    :cond_e
    return-object v17

    .line 615
    :pswitch_7
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, Ljava/lang/String;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    const/16 v2, 0xa

    .line 623
    .line 624
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    if-eqz v0, :cond_f

    .line 629
    .line 630
    new-instance v1, Lxm0;

    .line 631
    .line 632
    const/16 v2, 0x12c

    .line 633
    .line 634
    const/4 v5, 0x5

    .line 635
    const/4 v6, 0x1

    .line 636
    invoke-direct {v1, v5, v2, v6}, Lvm0;-><init>(III)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-eqz v1, :cond_f

    .line 648
    .line 649
    sget-object v1, Lbv1;->α:Lbv1;

    .line 650
    .line 651
    const-string v1, "spark_auto_renew_delay_seconds"

    .line 652
    .line 653
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 658
    .line 659
    .line 660
    const-string v1, "\u5ef6\u8fdf\u5df2\u66f4\u65b0"

    .line 661
    .line 662
    invoke-static {v13, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 667
    .line 668
    .line 669
    new-instance v1, Ljava/lang/StringBuilder;

    .line 670
    .line 671
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    const-string v0, "s"

    .line 678
    .line 679
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    goto :goto_b

    .line 690
    :cond_f
    invoke-static {v13, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 695
    .line 696
    .line 697
    :goto_b
    return-object v17

    .line 698
    :pswitch_8
    move-object/from16 v0, p1

    .line 699
    .line 700
    check-cast v0, Ljava/lang/String;

    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    const/16 v2, 0xa

    .line 706
    .line 707
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    if-eqz v0, :cond_11

    .line 712
    .line 713
    new-instance v1, Lxm0;

    .line 714
    .line 715
    const/16 v3, 0x1f4

    .line 716
    .line 717
    const/4 v6, 0x1

    .line 718
    invoke-direct {v1, v2, v3, v6}, Lvm0;-><init>(III)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    invoke-virtual {v1, v5}, Lxm0;->α(I)Z

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    if-nez v1, :cond_10

    .line 730
    .line 731
    goto :goto_c

    .line 732
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 733
    .line 734
    .line 735
    move-result v1

    .line 736
    sget-object v5, Lui1;->α:Ljava/lang/Object;

    .line 737
    .line 738
    const-string v5, "offline_cache_count"

    .line 739
    .line 740
    invoke-static {v1, v2, v3}, Lj81;->μ(III)I

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    invoke-static {v5, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 745
    .line 746
    .line 747
    new-instance v1, Ljava/lang/StringBuilder;

    .line 748
    .line 749
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    const-string v0, " \u6761"

    .line 756
    .line 757
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    const-string v0, "\u6570\u91cf\u5df2\u4fdd\u5b58\uff0c\u8bf7\u5728\u6296\u97f3\u7f13\u5b58\u8bbe\u7f6e\u4e2d\u5e94\u7528"

    .line 768
    .line 769
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 774
    .line 775
    .line 776
    goto :goto_d

    .line 777
    :cond_11
    :goto_c
    const-string v0, "\u8bf7\u8f93\u5165 10~500 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 778
    .line 779
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 784
    .line 785
    .line 786
    :goto_d
    return-object v17

    .line 787
    :pswitch_9
    move-object/from16 v0, p1

    .line 788
    .line 789
    check-cast v0, Ljava/lang/Integer;

    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 796
    .line 797
    and-int v0, v0, v16

    .line 798
    .line 799
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    const/4 v6, 0x1

    .line 808
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    invoke-static {v1, v14, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    sget-object v1, Lbv1;->α:Lbv1;

    .line 817
    .line 818
    const-string v1, "im_time_label_light_color"

    .line 819
    .line 820
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    const-string v0, "\u6d45\u8272\u6a21\u5f0f\u989c\u8272\u5df2\u66f4\u65b0"

    .line 827
    .line 828
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 833
    .line 834
    .line 835
    return-object v17

    .line 836
    :pswitch_a
    move-object/from16 v0, p1

    .line 837
    .line 838
    check-cast v0, Ljava/lang/Integer;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    const/4 v6, 0x1

    .line 848
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    sget-object v1, Lbv1;->α:Lbv1;

    .line 857
    .line 858
    const-string v1, "info_bar_text_color"

    .line 859
    .line 860
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    invoke-static {v13, v12, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 871
    .line 872
    .line 873
    return-object v17

    .line 874
    :pswitch_b
    move-object/from16 v0, p1

    .line 875
    .line 876
    check-cast v0, Ljava/lang/Integer;

    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    const/4 v6, 0x1

    .line 886
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    sget-object v1, Lbv1;->α:Lbv1;

    .line 895
    .line 896
    const-string v1, "comment_bg_color"

    .line 897
    .line 898
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    invoke-static {v13, v12, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 909
    .line 910
    .line 911
    return-object v17

    .line 912
    :pswitch_c
    move-object/from16 v0, p1

    .line 913
    .line 914
    check-cast v0, Ljava/lang/String;

    .line 915
    .line 916
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    const/16 v2, 0xa

    .line 920
    .line 921
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    if-eqz v0, :cond_13

    .line 926
    .line 927
    new-instance v1, Lxm0;

    .line 928
    .line 929
    const/16 v2, 0x12c

    .line 930
    .line 931
    const/4 v6, 0x1

    .line 932
    invoke-direct {v1, v4, v2, v6}, Lvm0;-><init>(III)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 936
    .line 937
    .line 938
    move-result v2

    .line 939
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    if-nez v1, :cond_12

    .line 944
    .line 945
    goto :goto_e

    .line 946
    :cond_12
    sget-object v1, Lbv1;->α:Lbv1;

    .line 947
    .line 948
    const-string v1, "pet_elf_camp_start_delay_seconds"

    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 955
    .line 956
    .line 957
    invoke-static {}, Ldd1;->γ()Z

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    invoke-static {v13, v1}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 962
    .line 963
    .line 964
    new-instance v1, Ljava/lang/StringBuilder;

    .line 965
    .line 966
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 970
    .line 971
    .line 972
    const-string v0, " \u79d2\u540e"

    .line 973
    .line 974
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    goto :goto_f

    .line 985
    :cond_13
    :goto_e
    const-string v0, "\u8bf7\u8f93\u5165 0~300 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 986
    .line 987
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 992
    .line 993
    .line 994
    :goto_f
    return-object v17

    .line 995
    :pswitch_d
    move-object/from16 v0, p1

    .line 996
    .line 997
    check-cast v0, Ljava/lang/String;

    .line 998
    .line 999
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    const/16 v2, 0xa

    .line 1003
    .line 1004
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    if-eqz v0, :cond_16

    .line 1009
    .line 1010
    new-instance v1, Lxm0;

    .line 1011
    .line 1012
    const/16 v2, 0x64

    .line 1013
    .line 1014
    const/4 v6, 0x1

    .line 1015
    invoke-direct {v1, v4, v2, v6}, Lvm0;-><init>(III)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1019
    .line 1020
    .line 1021
    move-result v2

    .line 1022
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v1

    .line 1026
    if-nez v1, :cond_14

    .line 1027
    .line 1028
    goto :goto_11

    .line 1029
    :cond_14
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1030
    .line 1031
    const-string v1, "pet_elf_camp_daily_harvest_limit"

    .line 1032
    .line 1033
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1034
    .line 1035
    .line 1036
    move-result v2

    .line 1037
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1041
    .line 1042
    .line 1043
    move-result v1

    .line 1044
    if-nez v1, :cond_15

    .line 1045
    .line 1046
    const-string v0, "\u4e0d\u9650\u5236"

    .line 1047
    .line 1048
    goto :goto_10

    .line 1049
    :cond_15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1055
    .line 1056
    .line 1057
    const-string v0, " \u6b21"

    .line 1058
    .line 1059
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    :goto_10
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    goto :goto_12

    .line 1070
    :cond_16
    :goto_11
    invoke-static {v13, v10, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1075
    .line 1076
    .line 1077
    :goto_12
    return-object v17

    .line 1078
    :pswitch_e
    move-object/from16 v0, p1

    .line 1079
    .line 1080
    check-cast v0, Ljava/lang/String;

    .line 1081
    .line 1082
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    const/16 v2, 0xa

    .line 1086
    .line 1087
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    if-eqz v0, :cond_19

    .line 1092
    .line 1093
    new-instance v1, Lxm0;

    .line 1094
    .line 1095
    const/16 v2, 0x64

    .line 1096
    .line 1097
    const/4 v6, 0x1

    .line 1098
    invoke-direct {v1, v4, v2, v6}, Lvm0;-><init>(III)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1102
    .line 1103
    .line 1104
    move-result v2

    .line 1105
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v1

    .line 1109
    if-nez v1, :cond_17

    .line 1110
    .line 1111
    goto :goto_13

    .line 1112
    :cond_17
    new-instance v1, Lz61;

    .line 1113
    .line 1114
    const/4 v2, 0x6

    .line 1115
    invoke-direct {v1, v0, v2, v15}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    if-nez v2, :cond_18

    .line 1123
    .line 1124
    invoke-virtual {v1}, Lz61;->invoke()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    goto :goto_14

    .line 1128
    :cond_18
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 1129
    .line 1130
    invoke-direct {v2, v13}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1131
    .line 1132
    .line 1133
    const-string v3, "\u5141\u8bb8\u4ed8\u8d39\u81ea\u52a8\u6295\u5582\uff1f"

    .line 1134
    .line 1135
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    const-string v4, "\u5f00\u542f\u540e\uff0c\u6bcf\u4e2a\u542f\u7528\u4eba\u5458\u6bcf\u6b21\u6295\u5582\u6700\u591a\u53ef\u80fd\u6d88\u8017 "

    .line 1142
    .line 1143
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    .line 1149
    const-string v4, " \u706b\u661f\u3002\u5b9e\u9645\u4ef7\u683c\u8d85\u8fc7\u4e0a\u9650\u4ecd\u4f1a\u8df3\u8fc7\u3002"

    .line 1150
    .line 1151
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v3

    .line 1158
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v2

    .line 1162
    const-string v3, "\u53d6\u6d88"

    .line 1163
    .line 1164
    invoke-virtual {v2, v3, v11}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v2

    .line 1168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    const-string v4, "\u5141\u8bb8\u6700\u591a "

    .line 1171
    .line 1172
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1176
    .line 1177
    .line 1178
    const-string v0, " \u706b\u661f"

    .line 1179
    .line 1180
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    new-instance v3, Lgd0;

    .line 1188
    .line 1189
    const/4 v5, 0x5

    .line 1190
    invoke-direct {v3, v5, v1}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v2, v0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1198
    .line 1199
    .line 1200
    goto :goto_14

    .line 1201
    :cond_19
    :goto_13
    invoke-static {v13, v10, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1206
    .line 1207
    .line 1208
    :goto_14
    return-object v17

    .line 1209
    :pswitch_f
    move-object/from16 v0, p1

    .line 1210
    .line 1211
    check-cast v0, Ljava/lang/String;

    .line 1212
    .line 1213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    const/16 v2, 0xa

    .line 1217
    .line 1218
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    if-eqz v0, :cond_1a

    .line 1223
    .line 1224
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1225
    .line 1226
    .line 1227
    move-result v0

    .line 1228
    const/16 v2, 0x12c

    .line 1229
    .line 1230
    const/4 v5, 0x5

    .line 1231
    invoke-static {v0, v5, v2}, Lj81;->μ(III)I

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v11

    .line 1239
    :cond_1a
    if-nez v11, :cond_1b

    .line 1240
    .line 1241
    invoke-static {v13, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1246
    .line 1247
    .line 1248
    goto :goto_15

    .line 1249
    :cond_1b
    sget-object v0, Lbv1;->α:Lbv1;

    .line 1250
    .line 1251
    const-string v0, "hidden_contact_peek_duration_seconds"

    .line 1252
    .line 1253
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    invoke-static {v0, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 1258
    .line 1259
    .line 1260
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1261
    .line 1262
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    .line 1268
    const-string v1, " \u79d2"

    .line 1269
    .line 1270
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    :goto_15
    return-object v17

    .line 1281
    :pswitch_10
    move-object/from16 v0, p1

    .line 1282
    .line 1283
    check-cast v0, Ljava/lang/Integer;

    .line 1284
    .line 1285
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1290
    .line 1291
    and-int v0, v0, v16

    .line 1292
    .line 1293
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    const/4 v6, 0x1

    .line 1302
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    invoke-static {v1, v14, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1311
    .line 1312
    const-string v1, "im_time_label_dark_color"

    .line 1313
    .line 1314
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    const-string v0, "\u6df1\u8272\u6a21\u5f0f\u989c\u8272\u5df2\u66f4\u65b0"

    .line 1321
    .line 1322
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1327
    .line 1328
    .line 1329
    return-object v17

    .line 1330
    :pswitch_11
    move-object/from16 v0, p1

    .line 1331
    .line 1332
    check-cast v0, Ljava/lang/String;

    .line 1333
    .line 1334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    const/16 v1, 0x30

    .line 1346
    .line 1347
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v1

    .line 1355
    if-eqz v1, :cond_1c

    .line 1356
    .line 1357
    const-string v0, "\u4e92\u53d1\u6d88\u606f\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 1358
    .line 1359
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1364
    .line 1365
    .line 1366
    goto :goto_16

    .line 1367
    :cond_1c
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1368
    .line 1369
    const-string v1, "pet_elf_mutual_message"

    .line 1370
    .line 1371
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    const/16 v1, 0xf

    .line 1375
    .line 1376
    invoke-static {v0, v1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    const-string v0, "\u4e92\u53d1\u6d88\u606f\u9ed8\u8ba4\u5185\u5bb9\u5df2\u66f4\u65b0"

    .line 1384
    .line 1385
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1390
    .line 1391
    .line 1392
    :goto_16
    return-object v17

    .line 1393
    :pswitch_12
    move-object/from16 v0, p1

    .line 1394
    .line 1395
    check-cast v0, Ljava/lang/String;

    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1398
    .line 1399
    .line 1400
    invoke-static {v0}, Lq02;->к(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    new-instance v1, Ljava/util/ArrayList;

    .line 1405
    .line 1406
    const/16 v2, 0xa

    .line 1407
    .line 1408
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1413
    .line 1414
    .line 1415
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v2

    .line 1423
    if-eqz v2, :cond_1d

    .line 1424
    .line 1425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    check-cast v2, Ljava/lang/String;

    .line 1430
    .line 1431
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v2

    .line 1435
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1440
    .line 1441
    .line 1442
    goto :goto_17

    .line 1443
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 1444
    .line 1445
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    :cond_1e
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1453
    .line 1454
    .line 1455
    move-result v2

    .line 1456
    if-eqz v2, :cond_21

    .line 1457
    .line 1458
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v2

    .line 1462
    move-object v3, v2

    .line 1463
    check-cast v3, Ljava/lang/String;

    .line 1464
    .line 1465
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v6

    .line 1469
    if-nez v6, :cond_1e

    .line 1470
    .line 1471
    move v6, v4

    .line 1472
    :goto_19
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1473
    .line 1474
    .line 1475
    move-result v7

    .line 1476
    if-ge v6, v7, :cond_20

    .line 1477
    .line 1478
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 1479
    .line 1480
    .line 1481
    move-result v7

    .line 1482
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v7

    .line 1486
    if-nez v7, :cond_1f

    .line 1487
    .line 1488
    goto :goto_18

    .line 1489
    :cond_1f
    add-int/lit8 v6, v6, 0x1

    .line 1490
    .line 1491
    goto :goto_19

    .line 1492
    :cond_20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    goto :goto_18

    .line 1496
    :cond_21
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    new-instance v1, Lorg/json/JSONArray;

    .line 1505
    .line 1506
    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    sget-object v2, Lbv1;->α:Lbv1;

    .line 1517
    .line 1518
    const-string v2, "filter_user_ids"

    .line 1519
    .line 1520
    invoke-static {v2, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1521
    .line 1522
    .line 1523
    invoke-static {v1}, Lbv1;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    invoke-interface {v15, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1531
    .line 1532
    .line 1533
    move-result v0

    .line 1534
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1535
    .line 1536
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1540
    .line 1541
    .line 1542
    const-string v0, " \u4e2a UID"

    .line 1543
    .line 1544
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1556
    .line 1557
    .line 1558
    return-object v17

    .line 1559
    :pswitch_13
    move-object/from16 v0, p1

    .line 1560
    .line 1561
    check-cast v0, Ljava/lang/String;

    .line 1562
    .line 1563
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1564
    .line 1565
    .line 1566
    const/16 v2, 0xa

    .line 1567
    .line 1568
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    if-eqz v0, :cond_23

    .line 1573
    .line 1574
    new-instance v1, Lxm0;

    .line 1575
    .line 1576
    const/16 v2, 0x3c

    .line 1577
    .line 1578
    const/4 v6, 0x1

    .line 1579
    invoke-direct {v1, v4, v2, v6}, Lvm0;-><init>(III)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1583
    .line 1584
    .line 1585
    move-result v2

    .line 1586
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v1

    .line 1590
    if-nez v1, :cond_22

    .line 1591
    .line 1592
    goto :goto_1a

    .line 1593
    :cond_22
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1594
    .line 1595
    const-string v1, "pet_elf_camp_operation_interval_seconds"

    .line 1596
    .line 1597
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1598
    .line 1599
    .line 1600
    move-result v2

    .line 1601
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 1602
    .line 1603
    .line 1604
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1605
    .line 1606
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1610
    .line 1611
    .line 1612
    const-string v0, " \u79d2"

    .line 1613
    .line 1614
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1622
    .line 1623
    .line 1624
    goto :goto_1b

    .line 1625
    :cond_23
    :goto_1a
    const-string v0, "\u8bf7\u8f93\u5165 0~60 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 1626
    .line 1627
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1632
    .line 1633
    .line 1634
    :goto_1b
    return-object v17

    .line 1635
    :pswitch_14
    move-object/from16 v0, p1

    .line 1636
    .line 1637
    check-cast v0, Ljava/lang/Integer;

    .line 1638
    .line 1639
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1640
    .line 1641
    .line 1642
    move-result v0

    .line 1643
    and-int v0, v0, v16

    .line 1644
    .line 1645
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v0

    .line 1653
    const/4 v6, 0x1

    .line 1654
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    invoke-static {v14, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1663
    .line 1664
    const-string v1, "seekbar_time_color"

    .line 1665
    .line 1666
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1667
    .line 1668
    .line 1669
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    invoke-static {v13, v12, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1677
    .line 1678
    .line 1679
    return-object v17

    .line 1680
    :pswitch_15
    move-object/from16 v0, p1

    .line 1681
    .line 1682
    check-cast v0, Ljava/lang/String;

    .line 1683
    .line 1684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1685
    .line 1686
    .line 1687
    const/16 v2, 0xa

    .line 1688
    .line 1689
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    if-eqz v0, :cond_26

    .line 1694
    .line 1695
    new-instance v1, Lxm0;

    .line 1696
    .line 1697
    const/16 v2, 0x64

    .line 1698
    .line 1699
    const/4 v6, 0x1

    .line 1700
    invoke-direct {v1, v4, v2, v6}, Lvm0;-><init>(III)V

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1704
    .line 1705
    .line 1706
    move-result v2

    .line 1707
    invoke-virtual {v1, v2}, Lxm0;->α(I)Z

    .line 1708
    .line 1709
    .line 1710
    move-result v1

    .line 1711
    if-nez v1, :cond_24

    .line 1712
    .line 1713
    goto :goto_1d

    .line 1714
    :cond_24
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1715
    .line 1716
    const-string v1, "pet_elf_camp_daily_plant_limit"

    .line 1717
    .line 1718
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1726
    .line 1727
    .line 1728
    move-result v1

    .line 1729
    if-nez v1, :cond_25

    .line 1730
    .line 1731
    const-string v0, "\u4e0d\u9650\u5236"

    .line 1732
    .line 1733
    goto :goto_1c

    .line 1734
    :cond_25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1740
    .line 1741
    .line 1742
    const-string v0, " \u6b21"

    .line 1743
    .line 1744
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    :goto_1c
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    goto :goto_1e

    .line 1755
    :cond_26
    :goto_1d
    invoke-static {v13, v10, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1760
    .line 1761
    .line 1762
    :goto_1e
    return-object v17

    .line 1763
    :pswitch_16
    move-object/from16 v0, p1

    .line 1764
    .line 1765
    check-cast v0, Lfo1;

    .line 1766
    .line 1767
    iget-object v0, v0, Lfo1;->ε:Ljava/lang/Object;

    .line 1768
    .line 1769
    instance-of v1, v0, Leo1;

    .line 1770
    .line 1771
    if-nez v1, :cond_27

    .line 1772
    .line 1773
    move-object v1, v0

    .line 1774
    check-cast v1, Lef1;

    .line 1775
    .line 1776
    iget-object v1, v1, Lef1;->α:Ljava/util/List;

    .line 1777
    .line 1778
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1779
    .line 1780
    .line 1781
    move-result v1

    .line 1782
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1783
    .line 1784
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1788
    .line 1789
    .line 1790
    const-string v1, " \u79cd"

    .line 1791
    .line 1792
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v1

    .line 1799
    invoke-interface {v15, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1800
    .line 1801
    .line 1802
    const-string v1, "\u98df\u7269\u5217\u8868\u5df2\u66f4\u65b0"

    .line 1803
    .line 1804
    invoke-static {v13, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v1

    .line 1808
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1809
    .line 1810
    .line 1811
    :cond_27
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v0

    .line 1815
    if-eqz v0, :cond_29

    .line 1816
    .line 1817
    const-string v1, "\u66f4\u65b0\u5931\u8d25"

    .line 1818
    .line 1819
    invoke-interface {v15, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v0

    .line 1826
    if-nez v0, :cond_28

    .line 1827
    .line 1828
    const-string v0, ""

    .line 1829
    .line 1830
    :cond_28
    const-string v1, "\u98df\u7269\u5217\u8868\u66f4\u65b0\u5931\u8d25: "

    .line 1831
    .line 1832
    const/4 v6, 0x1

    .line 1833
    invoke-static {v6, v13, v1, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 1834
    .line 1835
    .line 1836
    :cond_29
    return-object v17

    .line 1837
    :pswitch_17
    move-object/from16 v0, p1

    .line 1838
    .line 1839
    check-cast v0, Ljava/lang/String;

    .line 1840
    .line 1841
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v1

    .line 1848
    if-nez v1, :cond_2a

    .line 1849
    .line 1850
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1851
    .line 1852
    const-string v1, "spark_message"

    .line 1853
    .line 1854
    const/16 v2, 0x32

    .line 1855
    .line 1856
    invoke-static {v0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v2

    .line 1860
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1861
    .line 1862
    .line 1863
    const-string v1, "\u7eed\u671f\u6d88\u606f\u5df2\u66f4\u65b0"

    .line 1864
    .line 1865
    invoke-static {v13, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1870
    .line 1871
    .line 1872
    const/16 v1, 0xf

    .line 1873
    .line 1874
    invoke-static {v0, v1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v0

    .line 1878
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    :cond_2a
    return-object v17

    .line 1882
    :pswitch_18
    move-object/from16 v0, p1

    .line 1883
    .line 1884
    check-cast v0, Ljava/lang/Integer;

    .line 1885
    .line 1886
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1887
    .line 1888
    .line 1889
    move-result v0

    .line 1890
    sget-object v1, Lkn0;->η:[Ljava/lang/String;

    .line 1891
    .line 1892
    const/4 v2, 0x3

    .line 1893
    if-ltz v0, :cond_2b

    .line 1894
    .line 1895
    if-ge v0, v2, :cond_2b

    .line 1896
    .line 1897
    aget-object v0, v1, v0

    .line 1898
    .line 1899
    goto :goto_1f

    .line 1900
    :cond_2b
    const-string v0, "custom"

    .line 1901
    .line 1902
    :goto_1f
    sget-object v3, Lbv1;->α:Lbv1;

    .line 1903
    .line 1904
    const-string v3, "spark_message_source"

    .line 1905
    .line 1906
    invoke-static {v3, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 1907
    .line 1908
    .line 1909
    invoke-static {v1, v0}, Lg7;->е([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1910
    .line 1911
    .line 1912
    move-result v0

    .line 1913
    sget-object v1, Lkn0;->ζ:[Ljava/lang/String;

    .line 1914
    .line 1915
    if-ltz v0, :cond_2c

    .line 1916
    .line 1917
    if-ge v0, v2, :cond_2c

    .line 1918
    .line 1919
    aget-object v0, v1, v0

    .line 1920
    .line 1921
    goto :goto_20

    .line 1922
    :cond_2c
    invoke-static {v1}, Lg7;->а([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    check-cast v0, Ljava/lang/String;

    .line 1927
    .line 1928
    :goto_20
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1929
    .line 1930
    .line 1931
    const-string v0, "\u7eed\u671f\u6d88\u606f\u6765\u6e90\u5df2\u66f4\u65b0"

    .line 1932
    .line 1933
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v0

    .line 1937
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1938
    .line 1939
    .line 1940
    return-object v17

    .line 1941
    :pswitch_19
    move-object/from16 v0, p1

    .line 1942
    .line 1943
    check-cast v0, Ljava/lang/String;

    .line 1944
    .line 1945
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1946
    .line 1947
    .line 1948
    const/16 v2, 0xa

    .line 1949
    .line 1950
    invoke-static {v0, v2}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v0

    .line 1954
    if-eqz v0, :cond_2e

    .line 1955
    .line 1956
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1957
    .line 1958
    .line 1959
    move-result v1

    .line 1960
    const/4 v2, -0x1

    .line 1961
    if-lt v1, v2, :cond_2e

    .line 1962
    .line 1963
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1964
    .line 1965
    .line 1966
    move-result v1

    .line 1967
    const/16 v2, 0x17

    .line 1968
    .line 1969
    if-gt v1, v2, :cond_2e

    .line 1970
    .line 1971
    sget-object v1, Lbv1;->α:Lbv1;

    .line 1972
    .line 1973
    const-string v1, "spark_auto_renew_trigger_hour"

    .line 1974
    .line 1975
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1976
    .line 1977
    .line 1978
    move-result v2

    .line 1979
    invoke-static {v1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 1980
    .line 1981
    .line 1982
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1983
    .line 1984
    .line 1985
    move-result v1

    .line 1986
    if-gez v1, :cond_2d

    .line 1987
    .line 1988
    const-string v0, "\u65e5\u671f\u5207\u6362\u65f6\u89e6\u53d1"

    .line 1989
    .line 1990
    goto :goto_21

    .line 1991
    :cond_2d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1992
    .line 1993
    const-string v2, "\u6bcf\u65e5 "

    .line 1994
    .line 1995
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1999
    .line 2000
    .line 2001
    const-string v0, ":00 \u540e\u89e6\u53d1"

    .line 2002
    .line 2003
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v0

    .line 2010
    :goto_21
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    const-string v0, "\u89e6\u53d1\u65f6\u95f4\u5df2\u66f4\u65b0"

    .line 2014
    .line 2015
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v0

    .line 2019
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2020
    .line 2021
    .line 2022
    goto :goto_22

    .line 2023
    :cond_2e
    const-string v0, "\u8bf7\u8f93\u5165 -1 \u6216 0~23 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 2024
    .line 2025
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2030
    .line 2031
    .line 2032
    :goto_22
    return-object v17

    .line 2033
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2034
    .line 2035
    check-cast v0, Lgc1;

    .line 2036
    .line 2037
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2038
    .line 2039
    .line 2040
    new-instance v1, Lii0;

    .line 2041
    .line 2042
    const/4 v2, 0x7

    .line 2043
    invoke-direct {v1, v15, v2, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2044
    .line 2045
    .line 2046
    invoke-virtual {v13, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2047
    .line 2048
    .line 2049
    return-object v17

    .line 2050
    :pswitch_1b
    const/4 v6, 0x1

    .line 2051
    move-object/from16 v0, p1

    .line 2052
    .line 2053
    check-cast v0, Landroid/net/Uri;

    .line 2054
    .line 2055
    if-eqz v0, :cond_2f

    .line 2056
    .line 2057
    invoke-static {v13, v0}, Lyh;->ν(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 2058
    .line 2059
    .line 2060
    move-result v1

    .line 2061
    if-eqz v1, :cond_2f

    .line 2062
    .line 2063
    move-object v11, v0

    .line 2064
    :cond_2f
    if-eqz v11, :cond_30

    .line 2065
    .line 2066
    goto :goto_23

    .line 2067
    :cond_30
    move v6, v4

    .line 2068
    :goto_23
    const-string v0, "download_saf_auth_state"

    .line 2069
    .line 2070
    if-eqz v11, :cond_31

    .line 2071
    .line 2072
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v1

    .line 2076
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2077
    .line 2078
    .line 2079
    const-string v2, "download_uri"

    .line 2080
    .line 2081
    invoke-static {v13, v2, v1}, Lyh;->й(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2082
    .line 2083
    .line 2084
    const-string v1, "granted"

    .line 2085
    .line 2086
    invoke-static {v13, v0, v1}, Lyh;->й(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2087
    .line 2088
    .line 2089
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v0

    .line 2093
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2094
    .line 2095
    .line 2096
    invoke-static {v0}, Lyh;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    const-string v1, "\u4e0b\u8f7d\u76ee\u5f55\u5df2\u6388\u6743\uff1a"

    .line 2101
    .line 2102
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v0

    .line 2110
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2111
    .line 2112
    .line 2113
    goto :goto_24

    .line 2114
    :cond_31
    const-string v1, "canceled"

    .line 2115
    .line 2116
    invoke-static {v13, v0, v1}, Lyh;->й(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2117
    .line 2118
    .line 2119
    :goto_24
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v0

    .line 2123
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2124
    .line 2125
    .line 2126
    return-object v17

    .line 2127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
