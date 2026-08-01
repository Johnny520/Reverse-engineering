.class public final synthetic Lθ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lθ;->ε:I

    iput-object p2, p0, Lθ;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr21;Lq21;)V
    .locals 0

    .line 1
    const/16 p2, 0x1c

    .line 2
    .line 3
    iput p2, p0, Lθ;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lθ;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lθ;->ε:I

    .line 6
    .line 7
    const/high16 v3, 0x20000

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->κ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Ljava/lang/String;)Ls62;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_0
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lr21;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Throwable;

    .line 34
    .line 35
    invoke-virtual {v0, v7}, Lr21;->γ(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Ls62;->α:Ls62;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, Lcv;

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    new-instance v1, Leo1;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :goto_0
    instance-of v1, v0, Leo1;

    .line 65
    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    move-object v0, v7

    .line 69
    :cond_0
    move-object v1, v0

    .line 70
    check-cast v1, Landroid/net/Uri;

    .line 71
    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :cond_1
    :try_start_1
    invoke-static {v1}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    new-instance v3, Leo1;

    .line 83
    .line 84
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v3

    .line 88
    :goto_1
    instance-of v3, v0, Leo1;

    .line 89
    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    move-object v0, v7

    .line 93
    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 94
    .line 95
    sget-object v3, Lev;->α:Ljava/util/List;

    .line 96
    .line 97
    const-string v3, ""

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    new-array v4, v9, [C

    .line 109
    .line 110
    const/16 v5, 0x3a

    .line 111
    .line 112
    aput-char v5, v4, v8

    .line 113
    .line 114
    invoke-static {v0, v4, v6, v6}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v4, :cond_4

    .line 125
    .line 126
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    move-object v4, v7

    .line 136
    :goto_2
    if-nez v4, :cond_5

    .line 137
    .line 138
    move-object v4, v3

    .line 139
    :cond_5
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_7

    .line 144
    .line 145
    :cond_6
    :goto_3
    move-object v8, v7

    .line 146
    goto :goto_6

    .line 147
    :cond_7
    invoke-static {v9, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v0}, Lev;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v5, "primary"

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    new-instance v8, Lcv;

    .line 164
    .line 165
    if-eqz v6, :cond_8

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_8
    move-object v5, v4

    .line 169
    :goto_4
    if-eqz v6, :cond_9

    .line 170
    .line 171
    const-string v4, "/sdcard"

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_9
    const-string v6, "/storage/"

    .line 175
    .line 176
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    :goto_5
    invoke-direct {v8, v5, v4, v0}, Lcv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_6
    if-nez v8, :cond_a

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_a
    iget-object v0, v8, Lcv;->γ:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v4, v2, Lcv;->γ:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v2, v2, Lcv;->α:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v5, v8, Lcv;->α:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v2, v5}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_b

    .line 199
    .line 200
    :goto_7
    move-object v3, v7

    .line 201
    goto :goto_8

    .line 202
    :cond_b
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_c

    .line 207
    .line 208
    move-object v3, v4

    .line 209
    goto :goto_8

    .line 210
    :cond_c
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_d

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_d
    const-string v2, "/"

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v4, v2, v9}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v3, :cond_e

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    :goto_8
    if-nez v3, :cond_f

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_f
    new-instance v7, Lly0;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-direct {v7, v1, v3, v0}, Lly0;-><init>(Landroid/net/Uri;Ljava/lang/String;I)V

    .line 248
    .line 249
    .line 250
    :goto_9
    return-object v7

    .line 251
    :pswitch_2
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Ljava/util/Set;

    .line 254
    .line 255
    check-cast v1, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-nez v2, :cond_10

    .line 265
    .line 266
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    move v8, v9

    .line 273
    :cond_10
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :pswitch_3
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lhx0;

    .line 281
    .line 282
    check-cast v1, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-virtual {v0, v1}, Lhx0;->β(I)Lfx0;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0

    .line 293
    :pswitch_4
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Lmv0;

    .line 296
    .line 297
    check-cast v1, Lnv0;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object v1, v1, Lnv0;->δ:Ljava/util/Set;

    .line 303
    .line 304
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_5
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Li0;

    .line 316
    .line 317
    check-cast v1, Landroid/view/View;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {v1}, Li0;->μ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v1, Lf7;

    .line 330
    .line 331
    invoke-direct {v1, v9, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-object v1

    .line 335
    :pswitch_6
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Ljava/util/ArrayList;

    .line 338
    .line 339
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Landroid/view/View;

    .line 349
    .line 350
    if-nez v1, :cond_11

    .line 351
    .line 352
    move v8, v9

    .line 353
    goto :goto_a

    .line 354
    :cond_11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :goto_a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :pswitch_7
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Landroid/view/ViewGroup;

    .line 365
    .line 366
    check-cast v1, Ljava/lang/Integer;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    sget-object v2, Lri0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 373
    .line 374
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v0}, Lri0;->ζ(Landroid/view/View;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    new-instance v2, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-string v3, "#"

    .line 385
    .line 386
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    const-string v1, "="

    .line 393
    .line 394
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    return-object v0

    .line 405
    :pswitch_8
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Lli0;

    .line 408
    .line 409
    check-cast v1, Lpt;

    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    sget-object v2, Lmi0;->α:Landroid/os/Handler;

    .line 415
    .line 416
    new-instance v3, Lw1;

    .line 417
    .line 418
    const/16 v4, 0x1a

    .line 419
    .line 420
    invoke-direct {v3, v0, v4, v1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 424
    .line 425
    .line 426
    sget-object v0, Ls62;->α:Ls62;

    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_9
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lbi0;

    .line 432
    .line 433
    check-cast v1, Ljava/lang/reflect/Method;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    sget-object v2, Lci0;->α:Lci0;

    .line 439
    .line 440
    invoke-static {v0, v1}, Lci0;->ρ(Lbi0;Ljava/lang/reflect/Method;)I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    iget v0, v0, Lbi0;->η:I

    .line 445
    .line 446
    if-lt v1, v0, :cond_12

    .line 447
    .line 448
    move v8, v9

    .line 449
    :cond_12
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :pswitch_a
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, Lih0;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v2, Lnh0;->α:Lnh0;

    .line 462
    .line 463
    iget-object v2, v0, Lih0;->β:Ljava/lang/Long;

    .line 464
    .line 465
    iget-object v0, v0, Lih0;->γ:Ljava/lang/Long;

    .line 466
    .line 467
    const-string v3, "getCreatedAt"

    .line 468
    .line 469
    invoke-static {v1, v3}, Lnh0;->ε(Ljava/lang/Object;Ljava/lang/String;)J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    invoke-static {v6, v7}, Lnh0;->σ(J)J

    .line 474
    .line 475
    .line 476
    move-result-wide v6

    .line 477
    cmp-long v1, v6, v4

    .line 478
    .line 479
    if-gtz v1, :cond_13

    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_13
    if-eqz v2, :cond_14

    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v1

    .line 488
    cmp-long v1, v6, v1

    .line 489
    .line 490
    if-gez v1, :cond_14

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_14
    if-eqz v0, :cond_15

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 496
    .line 497
    .line 498
    move-result-wide v0

    .line 499
    cmp-long v0, v6, v0

    .line 500
    .line 501
    if-lez v0, :cond_15

    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_15
    :goto_b
    move v8, v9

    .line 505
    :goto_c
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    return-object v0

    .line 510
    :pswitch_b
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v0, Lgc;

    .line 513
    .line 514
    check-cast v1, Ljh0;

    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    sget-object v2, Lnh0;->α:Lnh0;

    .line 520
    .line 521
    new-instance v2, Lp3;

    .line 522
    .line 523
    const/16 v3, 0x16

    .line 524
    .line 525
    invoke-direct {v2, v0, v3, v1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    invoke-static {v2}, Lnh0;->υ(Lp70;)V

    .line 529
    .line 530
    .line 531
    sget-object v0, Ls62;->α:Ls62;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_c
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Lxd0;

    .line 537
    .line 538
    check-cast v1, Lxd0;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    sget-object v2, Lbe0;->α:Lbe0;

    .line 544
    .line 545
    invoke-static {v1, v0}, Lbe0;->π(Lxd0;Lxd0;)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    return-object v0

    .line 554
    :pswitch_d
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Lg50;

    .line 557
    .line 558
    check-cast v1, Lm62;

    .line 559
    .line 560
    iget-object v4, v1, Lm62;->β:Ld60;

    .line 561
    .line 562
    iget v5, v1, Lm62;->γ:I

    .line 563
    .line 564
    iget v6, v1, Lm62;->δ:I

    .line 565
    .line 566
    iget-object v7, v1, Lm62;->ε:Ljava/lang/Object;

    .line 567
    .line 568
    new-instance v2, Lm62;

    .line 569
    .line 570
    const/4 v3, 0x0

    .line 571
    invoke-direct/range {v2 .. v7}, Lm62;-><init>(Lbr;Ld60;IILjava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v2}, Lg50;->α(Lm62;)Ln62;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    iget-object v0, v0, Ln62;->ε:Ljava/lang/Object;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_e
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Lr00;

    .line 584
    .line 585
    check-cast v1, Ljava/lang/reflect/Field;

    .line 586
    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    sget-object v2, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 601
    .line 602
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    if-eqz v2, :cond_16

    .line 611
    .line 612
    const/16 v8, 0x3e8

    .line 613
    .line 614
    :cond_16
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-nez v2, :cond_17

    .line 623
    .line 624
    add-int/lit16 v8, v8, 0x12c

    .line 625
    .line 626
    :cond_17
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-static {v2}, Ls00;->α(Ljava/lang/Class;)Z

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    if-eqz v2, :cond_18

    .line 638
    .line 639
    add-int/lit16 v8, v8, 0x320

    .line 640
    .line 641
    :cond_18
    iget-object v2, v0, Lr00;->ζ:Ljava/util/Set;

    .line 642
    .line 643
    check-cast v2, Ljava/lang/Iterable;

    .line 644
    .line 645
    instance-of v3, v2, Ljava/util/Collection;

    .line 646
    .line 647
    if-eqz v3, :cond_19

    .line 648
    .line 649
    move-object v3, v2

    .line 650
    check-cast v3, Ljava/util/Collection;

    .line 651
    .line 652
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    if-eqz v3, :cond_19

    .line 657
    .line 658
    goto :goto_d

    .line 659
    :cond_19
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    if-eqz v3, :cond_1b

    .line 668
    .line 669
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    check-cast v3, Ljava/lang/String;

    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    invoke-static {v3, v4}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    if-eqz v3, :cond_1a

    .line 684
    .line 685
    add-int/lit16 v8, v8, 0xfa0

    .line 686
    .line 687
    :cond_1b
    :goto_d
    iget-object v0, v0, Lr00;->η:Ljava/util/Set;

    .line 688
    .line 689
    move-object v2, v0

    .line 690
    check-cast v2, Ljava/lang/Iterable;

    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-static {v0}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    :cond_1c
    invoke-virtual {v0}, Lτ;->hasNext()Z

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    if-eqz v3, :cond_1f

    .line 705
    .line 706
    invoke-virtual {v0}, Lτ;->next()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    check-cast v3, Ljava/lang/annotation/Annotation;

    .line 711
    .line 712
    invoke-static {v3}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    invoke-static {v4}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    const-string v6, "com.google.gson.annotations.SerializedName"

    .line 725
    .line 726
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v5

    .line 730
    if-eqz v5, :cond_1c

    .line 731
    .line 732
    :try_start_2
    const-string v0, "value"

    .line 733
    .line 734
    invoke-virtual {v4, v0, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0, v3, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    instance-of v3, v0, Ljava/lang/String;

    .line 743
    .line 744
    if-eqz v3, :cond_1d

    .line 745
    .line 746
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 747
    .line 748
    goto :goto_f

    .line 749
    :catchall_2
    move-exception v0

    .line 750
    goto :goto_e

    .line 751
    :cond_1d
    move-object v0, v7

    .line 752
    goto :goto_f

    .line 753
    :goto_e
    new-instance v3, Leo1;

    .line 754
    .line 755
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 756
    .line 757
    .line 758
    move-object v0, v3

    .line 759
    :goto_f
    instance-of v3, v0, Leo1;

    .line 760
    .line 761
    if-eqz v3, :cond_1e

    .line 762
    .line 763
    goto :goto_10

    .line 764
    :cond_1e
    move-object v7, v0

    .line 765
    :goto_10
    check-cast v7, Ljava/lang/String;

    .line 766
    .line 767
    :cond_1f
    invoke-static {v2, v7}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-eqz v0, :cond_20

    .line 772
    .line 773
    add-int/lit16 v8, v8, 0x1388

    .line 774
    .line 775
    :cond_20
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    new-instance v2, Ll91;

    .line 780
    .line 781
    invoke-direct {v2, v1, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    return-object v2

    .line 785
    :pswitch_f
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v0, Law;

    .line 788
    .line 789
    check-cast v1, Lza0;

    .line 790
    .line 791
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    invoke-interface {v1, v9}, Lza0;->Κ(Z)V

    .line 795
    .line 796
    .line 797
    iget-object v0, v0, Law;->Β:Lkv1;

    .line 798
    .line 799
    iget-object v0, v0, Lkv1;->η:Ljv1;

    .line 800
    .line 801
    invoke-interface {v1, v0}, Lza0;->π(Liv1;)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v1, v9}, Lza0;->б(I)V

    .line 805
    .line 806
    .line 807
    sget-object v0, Ls62;->α:Ls62;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_10
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v0, Llu;

    .line 813
    .line 814
    check-cast v1, Ljava/lang/String;

    .line 815
    .line 816
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    invoke-static {v1, v0}, Lkn0;->Η(Ljava/lang/String;Llu;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    return-object v0

    .line 824
    :pswitch_11
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, Ljava/lang/CharSequence;

    .line 827
    .line 828
    check-cast v1, Landroid/text/style/ClickableSpan;

    .line 829
    .line 830
    check-cast v0, Landroid/text/Spanned;

    .line 831
    .line 832
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 833
    .line 834
    .line 835
    move-result v2

    .line 836
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-ltz v2, :cond_21

    .line 841
    .line 842
    if-le v0, v2, :cond_21

    .line 843
    .line 844
    invoke-static {v2, v0}, Lj81;->Σ(II)Lxm0;

    .line 845
    .line 846
    .line 847
    move-result-object v7

    .line 848
    :cond_21
    return-object v7

    .line 849
    :pswitch_12
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v0, Luk;

    .line 852
    .line 853
    check-cast v1, Ljava/lang/Integer;

    .line 854
    .line 855
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    sget-object v2, Lui1;->α:Ljava/lang/Object;

    .line 860
    .line 861
    iget-object v2, v0, Luk;->δ:Lmk;

    .line 862
    .line 863
    iget-object v2, v2, Lmk;->α:Ljava/lang/String;

    .line 864
    .line 865
    invoke-static {v1}, Lh62;->δ(I)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    new-instance v3, Ljava/lang/StringBuilder;

    .line 870
    .line 871
    const-string v4, "comment_control_"

    .line 872
    .line 873
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    const-string v2, "_color"

    .line 880
    .line 881
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-static {v2, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    iget-object v1, v0, Luk;->δ:Lmk;

    .line 892
    .line 893
    iget-object v1, v1, Lmk;->α:Ljava/lang/String;

    .line 894
    .line 895
    new-instance v2, Ljava/lang/StringBuilder;

    .line 896
    .line 897
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    const-string v1, "_color_enabled"

    .line 904
    .line 905
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    invoke-static {v1, v9}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v0}, Luk;->ι()V

    .line 916
    .line 917
    .line 918
    iget-object v1, v0, Luk;->Α:Lb8;

    .line 919
    .line 920
    if-eqz v1, :cond_22

    .line 921
    .line 922
    iget-object v0, v0, Luk;->δ:Lmk;

    .line 923
    .line 924
    invoke-static {}, Lui1;->φ()Z

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    invoke-static {}, Luk;->ζ()Z

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    invoke-virtual {v1, v0, v2, v3}, Lb8;->ξ(Lmk;ZZ)V

    .line 933
    .line 934
    .line 935
    sget-object v0, Ls62;->α:Ls62;

    .line 936
    .line 937
    return-object v0

    .line 938
    :cond_22
    const-string v0, "preview"

    .line 939
    .line 940
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    throw v7

    .line 944
    :pswitch_13
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lxj;

    .line 947
    .line 948
    check-cast v1, Ljava/lang/reflect/Field;

    .line 949
    .line 950
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    iget-object v0, v0, Lxj;->γ:Ljava/util/Set;

    .line 954
    .line 955
    check-cast v0, Ljava/lang/Iterable;

    .line 956
    .line 957
    instance-of v2, v0, Ljava/util/Collection;

    .line 958
    .line 959
    if-eqz v2, :cond_23

    .line 960
    .line 961
    move-object v2, v0

    .line 962
    check-cast v2, Ljava/util/Collection;

    .line 963
    .line 964
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    if-eqz v2, :cond_23

    .line 969
    .line 970
    goto :goto_11

    .line 971
    :cond_23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    :cond_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 976
    .line 977
    .line 978
    move-result v2

    .line 979
    if-eqz v2, :cond_26

    .line 980
    .line 981
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    check-cast v2, Ljava/lang/String;

    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    move-result-object v3

    .line 991
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v3

    .line 995
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    if-nez v3, :cond_25

    .line 1000
    .line 1001
    sget-object v3, Lkk;->α:Lkk;

    .line 1002
    .line 1003
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v3, v2}, Lkk;->γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    if-eqz v2, :cond_24

    .line 1015
    .line 1016
    :cond_25
    move v8, v9

    .line 1017
    :cond_26
    :goto_11
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    return-object v0

    .line 1022
    :pswitch_14
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, Lak;

    .line 1025
    .line 1026
    check-cast v1, Ljava/lang/reflect/Field;

    .line 1027
    .line 1028
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    iget-object v0, v0, Lak;->ε:Ljava/util/Set;

    .line 1032
    .line 1033
    check-cast v0, Ljava/lang/Iterable;

    .line 1034
    .line 1035
    instance-of v2, v0, Ljava/util/Collection;

    .line 1036
    .line 1037
    if-eqz v2, :cond_27

    .line 1038
    .line 1039
    move-object v2, v0

    .line 1040
    check-cast v2, Ljava/util/Collection;

    .line 1041
    .line 1042
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    if-eqz v2, :cond_27

    .line 1047
    .line 1048
    goto :goto_12

    .line 1049
    :cond_27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    :cond_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v2

    .line 1057
    if-eqz v2, :cond_2a

    .line 1058
    .line 1059
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    check-cast v2, Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v3

    .line 1069
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v3

    .line 1077
    if-nez v3, :cond_29

    .line 1078
    .line 1079
    sget-object v3, Lkk;->α:Lkk;

    .line 1080
    .line 1081
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v3

    .line 1085
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1086
    .line 1087
    .line 1088
    invoke-static {v3, v2}, Lkk;->γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v2

    .line 1092
    if-eqz v2, :cond_28

    .line 1093
    .line 1094
    :cond_29
    move v8, v9

    .line 1095
    :cond_2a
    :goto_12
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    return-object v0

    .line 1100
    :pswitch_15
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 1103
    .line 1104
    check-cast v1, Ljava/lang/String;

    .line 1105
    .line 1106
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->θ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Ljava/lang/String;)Ls62;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    return-object v0

    .line 1111
    :pswitch_16
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, Ljava/io/File;

    .line 1114
    .line 1115
    check-cast v1, Ljava/io/OutputStream;

    .line 1116
    .line 1117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    new-instance v2, Ljava/io/FileInputStream;

    .line 1121
    .line 1122
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1123
    .line 1124
    .line 1125
    :try_start_3
    invoke-static {v2, v1, v3}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 1129
    .line 1130
    .line 1131
    sget-object v0, Ls62;->α:Ls62;

    .line 1132
    .line 1133
    return-object v0

    .line 1134
    :catchall_3
    move-exception v0

    .line 1135
    move-object v1, v0

    .line 1136
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1137
    :catchall_4
    move-exception v0

    .line 1138
    invoke-static {v2, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1139
    .line 1140
    .line 1141
    throw v0

    .line 1142
    :pswitch_17
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 1143
    .line 1144
    check-cast v0, Lvx;

    .line 1145
    .line 1146
    check-cast v1, Ljava/io/OutputStream;

    .line 1147
    .line 1148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    iget-object v2, v0, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 1152
    .line 1153
    :try_start_5
    invoke-static {v2, v1, v3}, Lh62;->Δ(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 1157
    .line 1158
    .line 1159
    sget-object v0, Ls62;->α:Ls62;

    .line 1160
    .line 1161
    return-object v0

    .line 1162
    :catchall_5
    move-exception v0

    .line 1163
    move-object v1, v0

    .line 1164
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1165
    :catchall_6
    move-exception v0

    .line 1166
    invoke-static {v2, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1167
    .line 1168
    .line 1169
    throw v0

    .line 1170
    :pswitch_18
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 1171
    .line 1172
    check-cast v0, Lya;

    .line 1173
    .line 1174
    check-cast v1, Lhd;

    .line 1175
    .line 1176
    iget v2, v0, Lya;->χ:F

    .line 1177
    .line 1178
    invoke-virtual {v1}, Lhd;->β()F

    .line 1179
    .line 1180
    .line 1181
    move-result v3

    .line 1182
    mul-float/2addr v3, v2

    .line 1183
    const/4 v2, 0x0

    .line 1184
    cmpl-float v3, v3, v2

    .line 1185
    .line 1186
    if-ltz v3, :cond_60

    .line 1187
    .line 1188
    iget-object v3, v1, Lhd;->ε:Lcd;

    .line 1189
    .line 1190
    invoke-interface {v3}, Lcd;->α()J

    .line 1191
    .line 1192
    .line 1193
    move-result-wide v10

    .line 1194
    invoke-static {v10, v11}, Ljw1;->β(J)F

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    cmpl-float v3, v3, v2

    .line 1199
    .line 1200
    if-lez v3, :cond_60

    .line 1201
    .line 1202
    iget v3, v0, Lya;->χ:F

    .line 1203
    .line 1204
    invoke-static {v3, v2}, Liv;->β(FF)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1209
    .line 1210
    if-eqz v2, :cond_2b

    .line 1211
    .line 1212
    move v2, v3

    .line 1213
    goto :goto_13

    .line 1214
    :cond_2b
    iget v2, v0, Lya;->χ:F

    .line 1215
    .line 1216
    invoke-virtual {v1}, Lhd;->β()F

    .line 1217
    .line 1218
    .line 1219
    move-result v10

    .line 1220
    mul-float/2addr v10, v2

    .line 1221
    float-to-double v10, v10

    .line 1222
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v10

    .line 1226
    double-to-float v2, v10

    .line 1227
    :goto_13
    iget-object v10, v1, Lhd;->ε:Lcd;

    .line 1228
    .line 1229
    invoke-interface {v10}, Lcd;->α()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v10

    .line 1233
    invoke-static {v10, v11}, Ljw1;->β(J)F

    .line 1234
    .line 1235
    .line 1236
    move-result v10

    .line 1237
    int-to-float v6, v6

    .line 1238
    div-float/2addr v10, v6

    .line 1239
    float-to-double v10, v10

    .line 1240
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v10

    .line 1244
    double-to-float v10, v10

    .line 1245
    invoke-static {v2, v10}, Ljava/lang/Math;->min(FF)F

    .line 1246
    .line 1247
    .line 1248
    move-result v12

    .line 1249
    div-float v16, v12, v6

    .line 1250
    .line 1251
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1252
    .line 1253
    .line 1254
    move-result v2

    .line 1255
    int-to-long v10, v2

    .line 1256
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1257
    .line 1258
    .line 1259
    move-result v2

    .line 1260
    int-to-long v13, v2

    .line 1261
    const/16 v2, 0x20

    .line 1262
    .line 1263
    shl-long/2addr v10, v2

    .line 1264
    const-wide v17, 0xffffffffL

    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    and-long v13, v13, v17

    .line 1270
    .line 1271
    or-long/2addr v10, v13

    .line 1272
    iget-object v13, v1, Lhd;->ε:Lcd;

    .line 1273
    .line 1274
    invoke-interface {v13}, Lcd;->α()J

    .line 1275
    .line 1276
    .line 1277
    move-result-wide v13

    .line 1278
    shr-long/2addr v13, v2

    .line 1279
    long-to-int v13, v13

    .line 1280
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1281
    .line 1282
    .line 1283
    move-result v13

    .line 1284
    sub-float/2addr v13, v12

    .line 1285
    iget-object v14, v1, Lhd;->ε:Lcd;

    .line 1286
    .line 1287
    invoke-interface {v14}, Lcd;->α()J

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v14

    .line 1291
    and-long v14, v14, v17

    .line 1292
    .line 1293
    long-to-int v14, v14

    .line 1294
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1295
    .line 1296
    .line 1297
    move-result v14

    .line 1298
    sub-float/2addr v14, v12

    .line 1299
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1300
    .line 1301
    .line 1302
    move-result v13

    .line 1303
    int-to-long v4, v13

    .line 1304
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1305
    .line 1306
    .line 1307
    move-result v13

    .line 1308
    int-to-long v13, v13

    .line 1309
    shl-long/2addr v4, v2

    .line 1310
    and-long v13, v13, v17

    .line 1311
    .line 1312
    or-long/2addr v4, v13

    .line 1313
    mul-float/2addr v6, v12

    .line 1314
    iget-object v13, v1, Lhd;->ε:Lcd;

    .line 1315
    .line 1316
    invoke-interface {v13}, Lcd;->α()J

    .line 1317
    .line 1318
    .line 1319
    move-result-wide v13

    .line 1320
    invoke-static {v13, v14}, Ljw1;->β(J)F

    .line 1321
    .line 1322
    .line 1323
    move-result v13

    .line 1324
    cmpl-float v13, v6, v13

    .line 1325
    .line 1326
    if-lez v13, :cond_2c

    .line 1327
    .line 1328
    move v13, v9

    .line 1329
    goto :goto_14

    .line 1330
    :cond_2c
    move v13, v8

    .line 1331
    :goto_14
    iget-object v14, v0, Lya;->ω:Liv1;

    .line 1332
    .line 1333
    iget-object v15, v1, Lhd;->ε:Lcd;

    .line 1334
    .line 1335
    invoke-interface {v15}, Lcd;->α()J

    .line 1336
    .line 1337
    .line 1338
    move-result-wide v7

    .line 1339
    iget-object v15, v1, Lhd;->ε:Lcd;

    .line 1340
    .line 1341
    invoke-interface {v15}, Lcd;->getLayoutDirection()Lnp0;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v15

    .line 1345
    invoke-interface {v14, v7, v8, v15, v1}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v7

    .line 1349
    instance-of v8, v7, Lr81;

    .line 1350
    .line 1351
    if-eqz v8, :cond_56

    .line 1352
    .line 1353
    iget-object v4, v0, Lya;->ψ:Lpx1;

    .line 1354
    .line 1355
    check-cast v7, Lr81;

    .line 1356
    .line 1357
    iget-object v5, v7, Lr81;->α:Lz91;

    .line 1358
    .line 1359
    if-eqz v13, :cond_2d

    .line 1360
    .line 1361
    new-instance v0, Lwa;

    .line 1362
    .line 1363
    invoke-direct {v0, v7, v9, v4}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v1, v0}, Lhd;->γ(La80;)Ln;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v7

    .line 1370
    goto/16 :goto_2a

    .line 1371
    .line 1372
    :cond_2d
    if-eqz v4, :cond_2e

    .line 1373
    .line 1374
    iget-wide v7, v4, Lpx1;->π:J

    .line 1375
    .line 1376
    invoke-static {v7, v8, v3}, Lci;->β(JF)J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v7

    .line 1380
    new-instance v3, Lga;

    .line 1381
    .line 1382
    invoke-direct {v3, v7, v8}, Lga;-><init>(J)V

    .line 1383
    .line 1384
    .line 1385
    move-object v15, v3

    .line 1386
    move v3, v9

    .line 1387
    goto :goto_15

    .line 1388
    :cond_2e
    const/4 v3, 0x0

    .line 1389
    const/4 v15, 0x0

    .line 1390
    :goto_15
    move-object v7, v5

    .line 1391
    check-cast v7, Lx2;

    .line 1392
    .line 1393
    invoke-virtual {v7}, Lx2;->β()Lml1;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v11

    .line 1397
    iget v7, v11, Lml1;->β:F

    .line 1398
    .line 1399
    iget v8, v11, Lml1;->α:F

    .line 1400
    .line 1401
    iget-object v10, v0, Lya;->φ:Lta;

    .line 1402
    .line 1403
    if-nez v10, :cond_2f

    .line 1404
    .line 1405
    new-instance v10, Lta;

    .line 1406
    .line 1407
    invoke-direct {v10}, Lta;-><init>()V

    .line 1408
    .line 1409
    .line 1410
    iput-object v10, v0, Lya;->φ:Lta;

    .line 1411
    .line 1412
    :cond_2f
    iget-object v10, v0, Lya;->φ:Lta;

    .line 1413
    .line 1414
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    iget-object v12, v10, Lta;->δ:Lx2;

    .line 1418
    .line 1419
    if-nez v12, :cond_30

    .line 1420
    .line 1421
    invoke-static {}, Ly2;->α()Lx2;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v12

    .line 1425
    iput-object v12, v10, Lta;->δ:Lx2;

    .line 1426
    .line 1427
    :cond_30
    iget-object v10, v12, Lx2;->α:Landroid/graphics/Path;

    .line 1428
    .line 1429
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 1430
    .line 1431
    .line 1432
    iget v10, v11, Lml1;->α:F

    .line 1433
    .line 1434
    iget v13, v11, Lml1;->δ:F

    .line 1435
    .line 1436
    iget v14, v11, Lml1;->γ:F

    .line 1437
    .line 1438
    move/from16 p0, v2

    .line 1439
    .line 1440
    iget v2, v11, Lml1;->β:F

    .line 1441
    .line 1442
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 1443
    .line 1444
    .line 1445
    move-result v16

    .line 1446
    if-nez v16, :cond_31

    .line 1447
    .line 1448
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v16

    .line 1452
    if-nez v16, :cond_31

    .line 1453
    .line 1454
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v16

    .line 1458
    if-nez v16, :cond_31

    .line 1459
    .line 1460
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 1461
    .line 1462
    .line 1463
    move-result v16

    .line 1464
    if-eqz v16, :cond_32

    .line 1465
    .line 1466
    :cond_31
    const-string v16, "Invalid rectangle, make sure no value is NaN"

    .line 1467
    .line 1468
    invoke-static/range {v16 .. v16}, Ly2;->β(Ljava/lang/String;)V

    .line 1469
    .line 1470
    .line 1471
    :cond_32
    iget-object v9, v12, Lx2;->β:Landroid/graphics/RectF;

    .line 1472
    .line 1473
    if-nez v9, :cond_33

    .line 1474
    .line 1475
    new-instance v9, Landroid/graphics/RectF;

    .line 1476
    .line 1477
    invoke-direct {v9}, Landroid/graphics/RectF;-><init>()V

    .line 1478
    .line 1479
    .line 1480
    iput-object v9, v12, Lx2;->β:Landroid/graphics/RectF;

    .line 1481
    .line 1482
    :cond_33
    iget-object v9, v12, Lx2;->β:Landroid/graphics/RectF;

    .line 1483
    .line 1484
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v9, v10, v2, v14, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1488
    .line 1489
    .line 1490
    iget-object v2, v12, Lx2;->α:Landroid/graphics/Path;

    .line 1491
    .line 1492
    iget-object v9, v12, Lx2;->β:Landroid/graphics/RectF;

    .line 1493
    .line 1494
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    sget-object v10, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 1498
    .line 1499
    invoke-virtual {v2, v9, v10}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 1500
    .line 1501
    .line 1502
    const/4 v2, 0x0

    .line 1503
    invoke-virtual {v12, v12, v5, v2}, Lx2;->γ(Lz91;Lz91;I)Z

    .line 1504
    .line 1505
    .line 1506
    new-instance v2, Lum1;

    .line 1507
    .line 1508
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1509
    .line 1510
    .line 1511
    iget v9, v11, Lml1;->γ:F

    .line 1512
    .line 1513
    sub-float/2addr v9, v8

    .line 1514
    float-to-double v9, v9

    .line 1515
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 1516
    .line 1517
    .line 1518
    move-result-wide v9

    .line 1519
    double-to-float v9, v9

    .line 1520
    float-to-int v9, v9

    .line 1521
    iget v10, v11, Lml1;->δ:F

    .line 1522
    .line 1523
    sub-float/2addr v10, v7

    .line 1524
    float-to-double v13, v10

    .line 1525
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 1526
    .line 1527
    .line 1528
    move-result-wide v13

    .line 1529
    double-to-float v10, v13

    .line 1530
    float-to-int v10, v10

    .line 1531
    int-to-long v13, v9

    .line 1532
    shl-long v13, v13, p0

    .line 1533
    .line 1534
    int-to-long v9, v10

    .line 1535
    and-long v9, v9, v17

    .line 1536
    .line 1537
    or-long/2addr v13, v9

    .line 1538
    iget-object v0, v0, Lya;->φ:Lta;

    .line 1539
    .line 1540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1541
    .line 1542
    .line 1543
    iget-object v9, v0, Lta;->α:Lm2;

    .line 1544
    .line 1545
    iget-object v10, v0, Lta;->β:Ll0;

    .line 1546
    .line 1547
    move-object/from16 v16, v10

    .line 1548
    .line 1549
    if-eqz v9, :cond_34

    .line 1550
    .line 1551
    invoke-virtual {v9}, Lm2;->α()I

    .line 1552
    .line 1553
    .line 1554
    move-result v10

    .line 1555
    move-object/from16 p1, v11

    .line 1556
    .line 1557
    new-instance v11, Lsk0;

    .line 1558
    .line 1559
    invoke-direct {v11, v10}, Lsk0;-><init>(I)V

    .line 1560
    .line 1561
    .line 1562
    goto :goto_16

    .line 1563
    :cond_34
    move-object/from16 p1, v11

    .line 1564
    .line 1565
    const/4 v11, 0x0

    .line 1566
    :goto_16
    if-nez v11, :cond_35

    .line 1567
    .line 1568
    goto :goto_17

    .line 1569
    :cond_35
    iget v10, v11, Lsk0;->α:I

    .line 1570
    .line 1571
    if-nez v10, :cond_36

    .line 1572
    .line 1573
    goto :goto_1a

    .line 1574
    :cond_36
    :goto_17
    if-eqz v9, :cond_37

    .line 1575
    .line 1576
    invoke-virtual {v9}, Lm2;->α()I

    .line 1577
    .line 1578
    .line 1579
    move-result v10

    .line 1580
    new-instance v11, Lsk0;

    .line 1581
    .line 1582
    invoke-direct {v11, v10}, Lsk0;-><init>(I)V

    .line 1583
    .line 1584
    .line 1585
    goto :goto_18

    .line 1586
    :cond_37
    const/4 v11, 0x0

    .line 1587
    :goto_18
    if-nez v11, :cond_38

    .line 1588
    .line 1589
    goto :goto_19

    .line 1590
    :cond_38
    iget v10, v11, Lsk0;->α:I

    .line 1591
    .line 1592
    if-eq v3, v10, :cond_39

    .line 1593
    .line 1594
    :goto_19
    const/4 v10, 0x0

    .line 1595
    goto :goto_1b

    .line 1596
    :cond_39
    :goto_1a
    const/4 v10, 0x1

    .line 1597
    :goto_1b
    if-eqz v9, :cond_3b

    .line 1598
    .line 1599
    iget-object v11, v9, Lm2;->α:Landroid/graphics/Bitmap;

    .line 1600
    .line 1601
    if-eqz v16, :cond_3b

    .line 1602
    .line 1603
    move/from16 v19, v3

    .line 1604
    .line 1605
    iget-object v3, v1, Lhd;->ε:Lcd;

    .line 1606
    .line 1607
    invoke-interface {v3}, Lcd;->α()J

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v25

    .line 1611
    move-object v3, v9

    .line 1612
    move/from16 v20, v10

    .line 1613
    .line 1614
    shr-long v9, v25, p0

    .line 1615
    .line 1616
    long-to-int v9, v9

    .line 1617
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1618
    .line 1619
    .line 1620
    move-result v9

    .line 1621
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1622
    .line 1623
    .line 1624
    move-result v10

    .line 1625
    int-to-float v10, v10

    .line 1626
    cmpl-float v9, v9, v10

    .line 1627
    .line 1628
    if-gtz v9, :cond_3c

    .line 1629
    .line 1630
    iget-object v9, v1, Lhd;->ε:Lcd;

    .line 1631
    .line 1632
    invoke-interface {v9}, Lcd;->α()J

    .line 1633
    .line 1634
    .line 1635
    move-result-wide v9

    .line 1636
    and-long v9, v9, v17

    .line 1637
    .line 1638
    long-to-int v9, v9

    .line 1639
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1640
    .line 1641
    .line 1642
    move-result v9

    .line 1643
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1644
    .line 1645
    .line 1646
    move-result v10

    .line 1647
    int-to-float v10, v10

    .line 1648
    cmpl-float v9, v9, v10

    .line 1649
    .line 1650
    if-gtz v9, :cond_3c

    .line 1651
    .line 1652
    if-nez v20, :cond_3a

    .line 1653
    .line 1654
    goto :goto_1c

    .line 1655
    :cond_3a
    move-object v9, v3

    .line 1656
    move-wide/from16 v19, v13

    .line 1657
    .line 1658
    move-object/from16 v10, v16

    .line 1659
    .line 1660
    goto/16 :goto_24

    .line 1661
    .line 1662
    :cond_3b
    move/from16 v19, v3

    .line 1663
    .line 1664
    :cond_3c
    :goto_1c
    shr-long v9, v13, p0

    .line 1665
    .line 1666
    long-to-int v3, v9

    .line 1667
    and-long v9, v13, v17

    .line 1668
    .line 1669
    long-to-int v9, v9

    .line 1670
    sget-object v10, Lmi;->ε:Lpo1;

    .line 1671
    .line 1672
    invoke-static/range {v19 .. v19}, Lh62;->О(I)Landroid/graphics/Bitmap$Config;

    .line 1673
    .line 1674
    .line 1675
    invoke-static/range {v19 .. v19}, Lh62;->О(I)Landroid/graphics/Bitmap$Config;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v28

    .line 1679
    invoke-static {v10, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1680
    .line 1681
    .line 1682
    move-result v11

    .line 1683
    if-eqz v11, :cond_3d

    .line 1684
    .line 1685
    sget-object v10, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1686
    .line 1687
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v10

    .line 1691
    :goto_1d
    move/from16 v26, v3

    .line 1692
    .line 1693
    move/from16 v27, v9

    .line 1694
    .line 1695
    move-object/from16 v30, v10

    .line 1696
    .line 1697
    :goto_1e
    move-wide/from16 v19, v13

    .line 1698
    .line 1699
    goto/16 :goto_23

    .line 1700
    .line 1701
    :cond_3d
    sget-object v11, Lmi;->ρ:Lpo1;

    .line 1702
    .line 1703
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v11

    .line 1707
    if-eqz v11, :cond_3e

    .line 1708
    .line 1709
    sget-object v10, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    .line 1710
    .line 1711
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v10

    .line 1715
    goto :goto_1d

    .line 1716
    :cond_3e
    sget-object v11, Lmi;->σ:Lpo1;

    .line 1717
    .line 1718
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1719
    .line 1720
    .line 1721
    move-result v11

    .line 1722
    if-eqz v11, :cond_3f

    .line 1723
    .line 1724
    sget-object v10, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    .line 1725
    .line 1726
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v10

    .line 1730
    goto :goto_1d

    .line 1731
    :cond_3f
    sget-object v11, Lmi;->ο:Lpo1;

    .line 1732
    .line 1733
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v11

    .line 1737
    if-eqz v11, :cond_40

    .line 1738
    .line 1739
    sget-object v10, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    .line 1740
    .line 1741
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v10

    .line 1745
    goto :goto_1d

    .line 1746
    :cond_40
    sget-object v11, Lmi;->κ:Lpo1;

    .line 1747
    .line 1748
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v11

    .line 1752
    if-eqz v11, :cond_41

    .line 1753
    .line 1754
    sget-object v10, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    .line 1755
    .line 1756
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v10

    .line 1760
    goto :goto_1d

    .line 1761
    :cond_41
    sget-object v11, Lmi;->ι:Lpo1;

    .line 1762
    .line 1763
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1764
    .line 1765
    .line 1766
    move-result v11

    .line 1767
    if-eqz v11, :cond_42

    .line 1768
    .line 1769
    sget-object v10, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    .line 1770
    .line 1771
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v10

    .line 1775
    goto :goto_1d

    .line 1776
    :cond_42
    sget-object v11, Lmi;->υ:Lap0;

    .line 1777
    .line 1778
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1779
    .line 1780
    .line 1781
    move-result v11

    .line 1782
    if-eqz v11, :cond_43

    .line 1783
    .line 1784
    sget-object v10, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    .line 1785
    .line 1786
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v10

    .line 1790
    goto :goto_1d

    .line 1791
    :cond_43
    sget-object v11, Lmi;->τ:Lap0;

    .line 1792
    .line 1793
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1794
    .line 1795
    .line 1796
    move-result v11

    .line 1797
    if-eqz v11, :cond_44

    .line 1798
    .line 1799
    sget-object v10, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    .line 1800
    .line 1801
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v10

    .line 1805
    goto :goto_1d

    .line 1806
    :cond_44
    sget-object v11, Lmi;->λ:Lpo1;

    .line 1807
    .line 1808
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1809
    .line 1810
    .line 1811
    move-result v11

    .line 1812
    if-eqz v11, :cond_45

    .line 1813
    .line 1814
    sget-object v10, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    .line 1815
    .line 1816
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v10

    .line 1820
    goto/16 :goto_1d

    .line 1821
    .line 1822
    :cond_45
    sget-object v11, Lmi;->μ:Lpo1;

    .line 1823
    .line 1824
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v11

    .line 1828
    if-eqz v11, :cond_46

    .line 1829
    .line 1830
    sget-object v10, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 1831
    .line 1832
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v10

    .line 1836
    goto/16 :goto_1d

    .line 1837
    .line 1838
    :cond_46
    sget-object v11, Lmi;->η:Lpo1;

    .line 1839
    .line 1840
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1841
    .line 1842
    .line 1843
    move-result v11

    .line 1844
    if-eqz v11, :cond_47

    .line 1845
    .line 1846
    sget-object v10, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1847
    .line 1848
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v10

    .line 1852
    goto/16 :goto_1d

    .line 1853
    .line 1854
    :cond_47
    sget-object v11, Lmi;->θ:Lpo1;

    .line 1855
    .line 1856
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1857
    .line 1858
    .line 1859
    move-result v11

    .line 1860
    if-eqz v11, :cond_48

    .line 1861
    .line 1862
    sget-object v10, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1863
    .line 1864
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v10

    .line 1868
    goto/16 :goto_1d

    .line 1869
    .line 1870
    :cond_48
    sget-object v11, Lmi;->ζ:Lpo1;

    .line 1871
    .line 1872
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v11

    .line 1876
    if-eqz v11, :cond_49

    .line 1877
    .line 1878
    sget-object v10, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 1879
    .line 1880
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v10

    .line 1884
    goto/16 :goto_1d

    .line 1885
    .line 1886
    :cond_49
    sget-object v11, Lmi;->ν:Lpo1;

    .line 1887
    .line 1888
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1889
    .line 1890
    .line 1891
    move-result v11

    .line 1892
    if-eqz v11, :cond_4a

    .line 1893
    .line 1894
    sget-object v10, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    .line 1895
    .line 1896
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v10

    .line 1900
    goto/16 :goto_1d

    .line 1901
    .line 1902
    :cond_4a
    sget-object v11, Lmi;->π:Lpo1;

    .line 1903
    .line 1904
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1905
    .line 1906
    .line 1907
    move-result v11

    .line 1908
    if-eqz v11, :cond_4b

    .line 1909
    .line 1910
    sget-object v10, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    .line 1911
    .line 1912
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v10

    .line 1916
    goto/16 :goto_1d

    .line 1917
    .line 1918
    :cond_4b
    sget-object v11, Lmi;->ξ:Lpo1;

    .line 1919
    .line 1920
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1921
    .line 1922
    .line 1923
    move-result v11

    .line 1924
    if-eqz v11, :cond_4c

    .line 1925
    .line 1926
    sget-object v10, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    .line 1927
    .line 1928
    invoke-static {v10}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v10

    .line 1932
    goto/16 :goto_1d

    .line 1933
    .line 1934
    :cond_4c
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1935
    .line 1936
    move/from16 v26, v3

    .line 1937
    .line 1938
    const/16 v3, 0x22

    .line 1939
    .line 1940
    if-lt v11, v3, :cond_4f

    .line 1941
    .line 1942
    sget-object v3, Lmi;->χ:Lpo1;

    .line 1943
    .line 1944
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1945
    .line 1946
    .line 1947
    move-result v3

    .line 1948
    if-eqz v3, :cond_4d

    .line 1949
    .line 1950
    invoke-static {}, Lli;->β()Landroid/graphics/ColorSpace$Named;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v3

    .line 1954
    invoke-static {v3}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v3

    .line 1958
    goto :goto_1f

    .line 1959
    :cond_4d
    sget-object v3, Lmi;->ψ:Lpo1;

    .line 1960
    .line 1961
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1962
    .line 1963
    .line 1964
    move-result v3

    .line 1965
    if-eqz v3, :cond_4e

    .line 1966
    .line 1967
    invoke-static {}, Lli;->γ()Landroid/graphics/ColorSpace$Named;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v3

    .line 1971
    invoke-static {v3}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v3

    .line 1975
    goto :goto_1f

    .line 1976
    :cond_4e
    const/4 v3, 0x0

    .line 1977
    :goto_1f
    if-eqz v3, :cond_4f

    .line 1978
    .line 1979
    move-object/from16 v30, v3

    .line 1980
    .line 1981
    move/from16 v27, v9

    .line 1982
    .line 1983
    goto/16 :goto_1e

    .line 1984
    .line 1985
    :cond_4f
    if-eqz v10, :cond_54

    .line 1986
    .line 1987
    iget-object v3, v10, Lji;->α:Ljava/lang/String;

    .line 1988
    .line 1989
    iget-object v11, v10, Lpo1;->δ:Lnb2;

    .line 1990
    .line 1991
    invoke-virtual {v11}, Lnb2;->α()[F

    .line 1992
    .line 1993
    .line 1994
    move-result-object v11

    .line 1995
    move/from16 v27, v9

    .line 1996
    .line 1997
    iget-object v9, v10, Lpo1;->η:Lq52;

    .line 1998
    .line 1999
    if-eqz v9, :cond_50

    .line 2000
    .line 2001
    new-instance v29, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 2002
    .line 2003
    move-wide/from16 v19, v13

    .line 2004
    .line 2005
    iget-wide v13, v9, Lq52;->β:D

    .line 2006
    .line 2007
    move-wide/from16 v30, v13

    .line 2008
    .line 2009
    iget-wide v13, v9, Lq52;->γ:D

    .line 2010
    .line 2011
    move-wide/from16 v32, v13

    .line 2012
    .line 2013
    iget-wide v13, v9, Lq52;->δ:D

    .line 2014
    .line 2015
    move-wide/from16 v34, v13

    .line 2016
    .line 2017
    iget-wide v13, v9, Lq52;->ε:D

    .line 2018
    .line 2019
    move-wide/from16 v36, v13

    .line 2020
    .line 2021
    iget-wide v13, v9, Lq52;->ζ:D

    .line 2022
    .line 2023
    move-wide/from16 v38, v13

    .line 2024
    .line 2025
    iget-wide v13, v9, Lq52;->η:D

    .line 2026
    .line 2027
    move-wide/from16 v40, v13

    .line 2028
    .line 2029
    iget-wide v13, v9, Lq52;->α:D

    .line 2030
    .line 2031
    move-wide/from16 v42, v13

    .line 2032
    .line 2033
    invoke-direct/range {v29 .. v43}, Landroid/graphics/ColorSpace$Rgb$TransferParameters;-><init>(DDDDDDD)V

    .line 2034
    .line 2035
    .line 2036
    move-object/from16 v9, v29

    .line 2037
    .line 2038
    goto :goto_20

    .line 2039
    :cond_50
    move-wide/from16 v19, v13

    .line 2040
    .line 2041
    const/4 v9, 0x0

    .line 2042
    :goto_20
    iget-object v13, v10, Lpo1;->ι:[F

    .line 2043
    .line 2044
    if-eqz v9, :cond_53

    .line 2045
    .line 2046
    new-instance v14, Landroid/graphics/ColorSpace$Rgb;

    .line 2047
    .line 2048
    iget-object v10, v10, Lpo1;->θ:[F

    .line 2049
    .line 2050
    invoke-direct {v14, v3, v10, v11, v9}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    .line 2051
    .line 2052
    .line 2053
    const/16 v24, 0x0

    .line 2054
    .line 2055
    aget v10, v13, v24

    .line 2056
    .line 2057
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 2058
    .line 2059
    .line 2060
    move-result v10

    .line 2061
    if-eqz v10, :cond_51

    .line 2062
    .line 2063
    goto :goto_21

    .line 2064
    :cond_51
    invoke-virtual {v14}, Landroid/graphics/ColorSpace$Rgb;->getTransform()[F

    .line 2065
    .line 2066
    .line 2067
    move-result-object v10

    .line 2068
    invoke-static {v10, v13}, Ljava/util/Arrays;->equals([F[F)Z

    .line 2069
    .line 2070
    .line 2071
    move-result v10

    .line 2072
    if-eqz v10, :cond_52

    .line 2073
    .line 2074
    :goto_21
    move-object/from16 v30, v14

    .line 2075
    .line 2076
    goto :goto_23

    .line 2077
    :cond_52
    new-instance v10, Landroid/graphics/ColorSpace$Rgb;

    .line 2078
    .line 2079
    invoke-direct {v10, v3, v13, v9}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    .line 2080
    .line 2081
    .line 2082
    :goto_22
    move-object/from16 v30, v10

    .line 2083
    .line 2084
    goto :goto_23

    .line 2085
    :cond_53
    new-instance v29, Landroid/graphics/ColorSpace$Rgb;

    .line 2086
    .line 2087
    iget-object v9, v10, Lpo1;->θ:[F

    .line 2088
    .line 2089
    iget-object v13, v10, Lpo1;->μ:Loo1;

    .line 2090
    .line 2091
    new-instance v14, Lki;

    .line 2092
    .line 2093
    move-object/from16 v30, v3

    .line 2094
    .line 2095
    const/4 v3, 0x0

    .line 2096
    invoke-direct {v14, v13, v3}, Lki;-><init>(La80;I)V

    .line 2097
    .line 2098
    .line 2099
    iget-object v3, v10, Lpo1;->ο:Loo1;

    .line 2100
    .line 2101
    new-instance v13, Lki;

    .line 2102
    .line 2103
    move-object/from16 v31, v9

    .line 2104
    .line 2105
    const/4 v9, 0x1

    .line 2106
    invoke-direct {v13, v3, v9}, Lki;-><init>(La80;I)V

    .line 2107
    .line 2108
    .line 2109
    iget v3, v10, Lpo1;->ε:F

    .line 2110
    .line 2111
    iget v9, v10, Lpo1;->ζ:F

    .line 2112
    .line 2113
    move/from16 v35, v3

    .line 2114
    .line 2115
    move/from16 v36, v9

    .line 2116
    .line 2117
    move-object/from16 v32, v11

    .line 2118
    .line 2119
    move-object/from16 v34, v13

    .line 2120
    .line 2121
    move-object/from16 v33, v14

    .line 2122
    .line 2123
    invoke-direct/range {v29 .. v36}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)V

    .line 2124
    .line 2125
    .line 2126
    move-object/from16 v30, v29

    .line 2127
    .line 2128
    goto :goto_23

    .line 2129
    :cond_54
    move/from16 v27, v9

    .line 2130
    .line 2131
    move-wide/from16 v19, v13

    .line 2132
    .line 2133
    sget-object v3, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 2134
    .line 2135
    invoke-static {v3}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v10

    .line 2139
    goto :goto_22

    .line 2140
    :goto_23
    const/16 v25, 0x0

    .line 2141
    .line 2142
    const/16 v29, 0x1

    .line 2143
    .line 2144
    invoke-static/range {v25 .. v30}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v3

    .line 2148
    new-instance v9, Lm2;

    .line 2149
    .line 2150
    invoke-direct {v9, v3}, Lm2;-><init>(Landroid/graphics/Bitmap;)V

    .line 2151
    .line 2152
    .line 2153
    iput-object v9, v0, Lta;->α:Lm2;

    .line 2154
    .line 2155
    sget-object v10, Lm0;->α:Landroid/graphics/Canvas;

    .line 2156
    .line 2157
    new-instance v10, Ll0;

    .line 2158
    .line 2159
    invoke-direct {v10}, Ll0;-><init>()V

    .line 2160
    .line 2161
    .line 2162
    new-instance v11, Landroid/graphics/Canvas;

    .line 2163
    .line 2164
    invoke-direct {v11, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2165
    .line 2166
    .line 2167
    iput-object v11, v10, Ll0;->α:Landroid/graphics/Canvas;

    .line 2168
    .line 2169
    iput-object v10, v0, Lta;->β:Ll0;

    .line 2170
    .line 2171
    :goto_24
    iget-object v3, v0, Lta;->γ:Lfe;

    .line 2172
    .line 2173
    if-nez v3, :cond_55

    .line 2174
    .line 2175
    new-instance v3, Lfe;

    .line 2176
    .line 2177
    invoke-direct {v3}, Lfe;-><init>()V

    .line 2178
    .line 2179
    .line 2180
    iput-object v3, v0, Lta;->γ:Lfe;

    .line 2181
    .line 2182
    :cond_55
    iget-object v11, v3, Lfe;->ζ:Lm6;

    .line 2183
    .line 2184
    iget-object v0, v3, Lfe;->ε:Lee;

    .line 2185
    .line 2186
    invoke-static/range {v19 .. v20}, Ls1;->Ζ(J)J

    .line 2187
    .line 2188
    .line 2189
    move-result-wide v13

    .line 2190
    move-object/from16 v23, v3

    .line 2191
    .line 2192
    iget-object v3, v1, Lhd;->ε:Lcd;

    .line 2193
    .line 2194
    invoke-interface {v3}, Lcd;->getLayoutDirection()Lnp0;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v3

    .line 2198
    move-object/from16 v16, v15

    .line 2199
    .line 2200
    iget-object v15, v0, Lee;->α:Lyr;

    .line 2201
    .line 2202
    move-object/from16 v30, v2

    .line 2203
    .line 2204
    iget-object v2, v0, Lee;->β:Lnp0;

    .line 2205
    .line 2206
    move-object/from16 v31, v9

    .line 2207
    .line 2208
    iget-object v9, v0, Lee;->γ:Lde;

    .line 2209
    .line 2210
    move-object/from16 v33, v4

    .line 2211
    .line 2212
    move-object/from16 v32, v5

    .line 2213
    .line 2214
    iget-wide v4, v0, Lee;->δ:J

    .line 2215
    .line 2216
    iput-object v1, v0, Lee;->α:Lyr;

    .line 2217
    .line 2218
    iput-object v3, v0, Lee;->β:Lnp0;

    .line 2219
    .line 2220
    iput-object v10, v0, Lee;->γ:Lde;

    .line 2221
    .line 2222
    iput-wide v13, v0, Lee;->δ:J

    .line 2223
    .line 2224
    invoke-virtual {v10}, Ll0;->θ()V

    .line 2225
    .line 2226
    .line 2227
    sget-wide v24, Lci;->β:J

    .line 2228
    .line 2229
    const/16 v28, 0x0

    .line 2230
    .line 2231
    const/16 v29, 0x3a

    .line 2232
    .line 2233
    move-wide/from16 v26, v13

    .line 2234
    .line 2235
    invoke-static/range {v23 .. v29}, Lcw;->а(Lcw;JJFI)V

    .line 2236
    .line 2237
    .line 2238
    move-object/from16 v3, v23

    .line 2239
    .line 2240
    neg-float v8, v8

    .line 2241
    neg-float v7, v7

    .line 2242
    iget-object v13, v11, Lm6;->ζ:Ljava/lang/Object;

    .line 2243
    .line 2244
    check-cast v13, Ln;

    .line 2245
    .line 2246
    invoke-virtual {v13, v8, v7}, Ln;->Η(FF)V

    .line 2247
    .line 2248
    .line 2249
    :try_start_7
    new-instance v13, Ly02;

    .line 2250
    .line 2251
    invoke-direct {v13, v6}, Ly02;-><init>(F)V

    .line 2252
    .line 2253
    .line 2254
    const/16 v6, 0x34

    .line 2255
    .line 2256
    move-object/from16 v23, v10

    .line 2257
    .line 2258
    move-object/from16 v10, v32

    .line 2259
    .line 2260
    move-object/from16 v14, v33

    .line 2261
    .line 2262
    invoke-static {v3, v10, v14, v13, v6}, Lcw;->г(Lcw;Lz91;Lkn0;Ly02;I)V

    .line 2263
    .line 2264
    .line 2265
    invoke-interface {v3}, Lcw;->α()J

    .line 2266
    .line 2267
    .line 2268
    move-result-wide v24

    .line 2269
    move-wide/from16 v26, v4

    .line 2270
    .line 2271
    shr-long v4, v24, p0

    .line 2272
    .line 2273
    long-to-int v4, v4

    .line 2274
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2275
    .line 2276
    .line 2277
    move-result v4

    .line 2278
    const/4 v5, 0x1

    .line 2279
    int-to-float v5, v5

    .line 2280
    add-float/2addr v4, v5

    .line 2281
    invoke-interface {v3}, Lcw;->α()J

    .line 2282
    .line 2283
    .line 2284
    move-result-wide v24

    .line 2285
    move v10, v4

    .line 2286
    move v6, v5

    .line 2287
    shr-long v4, v24, p0

    .line 2288
    .line 2289
    long-to-int v4, v4

    .line 2290
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2291
    .line 2292
    .line 2293
    move-result v4

    .line 2294
    div-float v4, v10, v4

    .line 2295
    .line 2296
    invoke-interface {v3}, Lcw;->α()J

    .line 2297
    .line 2298
    .line 2299
    move-result-wide v24

    .line 2300
    move/from16 p0, v6

    .line 2301
    .line 2302
    and-long v5, v24, v17

    .line 2303
    .line 2304
    long-to-int v5, v5

    .line 2305
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2306
    .line 2307
    .line 2308
    move-result v5

    .line 2309
    add-float v5, v5, p0

    .line 2310
    .line 2311
    invoke-interface {v3}, Lcw;->α()J

    .line 2312
    .line 2313
    .line 2314
    move-result-wide v24

    .line 2315
    move/from16 p0, v5

    .line 2316
    .line 2317
    and-long v5, v24, v17

    .line 2318
    .line 2319
    long-to-int v5, v5

    .line 2320
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2321
    .line 2322
    .line 2323
    move-result v5

    .line 2324
    div-float v5, p0, v5

    .line 2325
    .line 2326
    invoke-virtual {v11}, Lm6;->Ζ()J

    .line 2327
    .line 2328
    .line 2329
    move-result-wide v17

    .line 2330
    move-object v6, v9

    .line 2331
    invoke-static/range {v17 .. v18}, Li91;->λ(J)J

    .line 2332
    .line 2333
    .line 2334
    move-result-wide v9

    .line 2335
    move-object/from16 p0, v1

    .line 2336
    .line 2337
    move-object v13, v2

    .line 2338
    invoke-virtual {v11}, Lm6;->Ζ()J

    .line 2339
    .line 2340
    .line 2341
    move-result-wide v1

    .line 2342
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v17

    .line 2346
    invoke-interface/range {v17 .. v17}, Lde;->θ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 2347
    .line 2348
    .line 2349
    move-object/from16 v17, v6

    .line 2350
    .line 2351
    :try_start_8
    iget-object v6, v11, Lm6;->ζ:Ljava/lang/Object;

    .line 2352
    .line 2353
    check-cast v6, Ln;

    .line 2354
    .line 2355
    invoke-virtual {v6, v4, v5, v9, v10}, Ln;->Ε(FFJ)V

    .line 2356
    .line 2357
    .line 2358
    const/16 v4, 0x1c

    .line 2359
    .line 2360
    const/4 v5, 0x0

    .line 2361
    invoke-static {v3, v12, v14, v5, v4}, Lcw;->г(Lcw;Lz91;Lkn0;Ly02;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 2362
    .line 2363
    .line 2364
    :try_start_9
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v3

    .line 2368
    invoke-interface {v3}, Lde;->ζ()V

    .line 2369
    .line 2370
    .line 2371
    invoke-virtual {v11, v1, v2}, Lm6;->Υ(J)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 2372
    .line 2373
    .line 2374
    iget-object v1, v11, Lm6;->ζ:Ljava/lang/Object;

    .line 2375
    .line 2376
    check-cast v1, Ln;

    .line 2377
    .line 2378
    neg-float v2, v8

    .line 2379
    neg-float v3, v7

    .line 2380
    invoke-virtual {v1, v2, v3}, Ln;->Η(FF)V

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual/range {v23 .. v23}, Ll0;->ζ()V

    .line 2384
    .line 2385
    .line 2386
    iput-object v15, v0, Lee;->α:Lyr;

    .line 2387
    .line 2388
    iput-object v13, v0, Lee;->β:Lnp0;

    .line 2389
    .line 2390
    move-object/from16 v6, v17

    .line 2391
    .line 2392
    iput-object v6, v0, Lee;->γ:Lde;

    .line 2393
    .line 2394
    move-wide/from16 v1, v26

    .line 2395
    .line 2396
    iput-wide v1, v0, Lee;->δ:J

    .line 2397
    .line 2398
    move-object/from16 v3, v31

    .line 2399
    .line 2400
    iget-object v0, v3, Lm2;->α:Landroid/graphics/Bitmap;

    .line 2401
    .line 2402
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 2403
    .line 2404
    .line 2405
    move-object/from16 v12, v30

    .line 2406
    .line 2407
    iput-object v3, v12, Lum1;->ε:Ljava/lang/Object;

    .line 2408
    .line 2409
    new-instance v10, Lxa;

    .line 2410
    .line 2411
    move-object/from16 v11, p1

    .line 2412
    .line 2413
    move-object/from16 v15, v16

    .line 2414
    .line 2415
    move-wide/from16 v13, v19

    .line 2416
    .line 2417
    invoke-direct/range {v10 .. v15}, Lxa;-><init>(Lml1;Lum1;JLga;)V

    .line 2418
    .line 2419
    .line 2420
    move-object/from16 v1, p0

    .line 2421
    .line 2422
    invoke-virtual {v1, v10}, Lhd;->γ(La80;)Ln;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v7

    .line 2426
    goto/16 :goto_2a

    .line 2427
    .line 2428
    :catchall_7
    move-exception v0

    .line 2429
    goto :goto_25

    .line 2430
    :catchall_8
    move-exception v0

    .line 2431
    :try_start_a
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 2432
    .line 2433
    .line 2434
    move-result-object v3

    .line 2435
    invoke-interface {v3}, Lde;->ζ()V

    .line 2436
    .line 2437
    .line 2438
    invoke-virtual {v11, v1, v2}, Lm6;->Υ(J)V

    .line 2439
    .line 2440
    .line 2441
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 2442
    :goto_25
    iget-object v1, v11, Lm6;->ζ:Ljava/lang/Object;

    .line 2443
    .line 2444
    check-cast v1, Ln;

    .line 2445
    .line 2446
    neg-float v2, v8

    .line 2447
    neg-float v3, v7

    .line 2448
    invoke-virtual {v1, v2, v3}, Ln;->Η(FF)V

    .line 2449
    .line 2450
    .line 2451
    throw v0

    .line 2452
    :cond_56
    instance-of v2, v7, Lt81;

    .line 2453
    .line 2454
    if-eqz v2, :cond_5b

    .line 2455
    .line 2456
    move v8, v13

    .line 2457
    iget-object v13, v0, Lya;->ψ:Lpx1;

    .line 2458
    .line 2459
    check-cast v7, Lt81;

    .line 2460
    .line 2461
    iget-object v2, v7, Lt81;->α:Lwo1;

    .line 2462
    .line 2463
    invoke-static {v2}, Lu81;->κ(Lwo1;)Z

    .line 2464
    .line 2465
    .line 2466
    move-result v3

    .line 2467
    if-eqz v3, :cond_57

    .line 2468
    .line 2469
    iget-wide v14, v2, Lwo1;->ε:J

    .line 2470
    .line 2471
    new-instance v0, Ly02;

    .line 2472
    .line 2473
    invoke-direct {v0, v12}, Ly02;-><init>(F)V

    .line 2474
    .line 2475
    .line 2476
    move-wide/from16 v18, v10

    .line 2477
    .line 2478
    new-instance v11, Lva;

    .line 2479
    .line 2480
    move-object/from16 v22, v0

    .line 2481
    .line 2482
    move-wide/from16 v20, v4

    .line 2483
    .line 2484
    move/from16 v17, v12

    .line 2485
    .line 2486
    move v12, v8

    .line 2487
    invoke-direct/range {v11 .. v22}, Lva;-><init>(ZLpx1;JFFJJLy02;)V

    .line 2488
    .line 2489
    .line 2490
    invoke-virtual {v1, v11}, Lhd;->γ(La80;)Ln;

    .line 2491
    .line 2492
    .line 2493
    move-result-object v7

    .line 2494
    goto/16 :goto_2a

    .line 2495
    .line 2496
    :cond_57
    move-object v3, v13

    .line 2497
    iget-object v4, v0, Lya;->φ:Lta;

    .line 2498
    .line 2499
    if-nez v4, :cond_58

    .line 2500
    .line 2501
    new-instance v4, Lta;

    .line 2502
    .line 2503
    invoke-direct {v4}, Lta;-><init>()V

    .line 2504
    .line 2505
    .line 2506
    iput-object v4, v0, Lya;->φ:Lta;

    .line 2507
    .line 2508
    :cond_58
    iget-object v0, v0, Lya;->φ:Lta;

    .line 2509
    .line 2510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2511
    .line 2512
    .line 2513
    iget-object v4, v0, Lta;->δ:Lx2;

    .line 2514
    .line 2515
    if-nez v4, :cond_59

    .line 2516
    .line 2517
    invoke-static {}, Ly2;->α()Lx2;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v4

    .line 2521
    iput-object v4, v0, Lta;->δ:Lx2;

    .line 2522
    .line 2523
    :cond_59
    iget-object v0, v4, Lx2;->α:Landroid/graphics/Path;

    .line 2524
    .line 2525
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2526
    .line 2527
    .line 2528
    invoke-static {v4, v2}, Lz91;->α(Lz91;Lwo1;)V

    .line 2529
    .line 2530
    .line 2531
    if-nez v8, :cond_5a

    .line 2532
    .line 2533
    invoke-static {}, Ly2;->α()Lx2;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    invoke-virtual {v2}, Lwo1;->β()F

    .line 2538
    .line 2539
    .line 2540
    move-result v5

    .line 2541
    sub-float v14, v5, v12

    .line 2542
    .line 2543
    invoke-virtual {v2}, Lwo1;->α()F

    .line 2544
    .line 2545
    .line 2546
    move-result v5

    .line 2547
    sub-float v15, v5, v12

    .line 2548
    .line 2549
    iget-wide v5, v2, Lwo1;->ε:J

    .line 2550
    .line 2551
    invoke-static {v5, v6, v12}, Lbd;->в(JF)J

    .line 2552
    .line 2553
    .line 2554
    move-result-wide v16

    .line 2555
    iget-wide v5, v2, Lwo1;->ζ:J

    .line 2556
    .line 2557
    invoke-static {v5, v6, v12}, Lbd;->в(JF)J

    .line 2558
    .line 2559
    .line 2560
    move-result-wide v18

    .line 2561
    iget-wide v5, v2, Lwo1;->θ:J

    .line 2562
    .line 2563
    invoke-static {v5, v6, v12}, Lbd;->в(JF)J

    .line 2564
    .line 2565
    .line 2566
    move-result-wide v22

    .line 2567
    iget-wide v5, v2, Lwo1;->η:J

    .line 2568
    .line 2569
    invoke-static {v5, v6, v12}, Lbd;->в(JF)J

    .line 2570
    .line 2571
    .line 2572
    move-result-wide v20

    .line 2573
    new-instance v11, Lwo1;

    .line 2574
    .line 2575
    move v13, v12

    .line 2576
    invoke-direct/range {v11 .. v23}, Lwo1;-><init>(FFFFJJJJ)V

    .line 2577
    .line 2578
    .line 2579
    invoke-static {v0, v11}, Lz91;->α(Lz91;Lwo1;)V

    .line 2580
    .line 2581
    .line 2582
    const/4 v2, 0x0

    .line 2583
    invoke-virtual {v4, v4, v0, v2}, Lx2;->γ(Lz91;Lz91;I)Z

    .line 2584
    .line 2585
    .line 2586
    goto :goto_26

    .line 2587
    :cond_5a
    const/4 v2, 0x0

    .line 2588
    :goto_26
    new-instance v0, Lwa;

    .line 2589
    .line 2590
    invoke-direct {v0, v4, v2, v3}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2591
    .line 2592
    .line 2593
    invoke-virtual {v1, v0}, Lhd;->γ(La80;)Ln;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v7

    .line 2597
    goto :goto_2a

    .line 2598
    :cond_5b
    move-wide v2, v10

    .line 2599
    move v8, v13

    .line 2600
    instance-of v6, v7, Ls81;

    .line 2601
    .line 2602
    if-eqz v6, :cond_5f

    .line 2603
    .line 2604
    iget-object v0, v0, Lya;->ψ:Lpx1;

    .line 2605
    .line 2606
    if-eqz v8, :cond_5c

    .line 2607
    .line 2608
    const-wide/16 v24, 0x0

    .line 2609
    .line 2610
    goto :goto_27

    .line 2611
    :cond_5c
    move-wide/from16 v24, v2

    .line 2612
    .line 2613
    :goto_27
    if-eqz v8, :cond_5d

    .line 2614
    .line 2615
    iget-object v2, v1, Lhd;->ε:Lcd;

    .line 2616
    .line 2617
    invoke-interface {v2}, Lcd;->α()J

    .line 2618
    .line 2619
    .line 2620
    move-result-wide v4

    .line 2621
    :cond_5d
    move-wide/from16 v26, v4

    .line 2622
    .line 2623
    if-eqz v8, :cond_5e

    .line 2624
    .line 2625
    sget-object v2, Lt30;->π:Lt30;

    .line 2626
    .line 2627
    :goto_28
    move-object/from16 v28, v2

    .line 2628
    .line 2629
    goto :goto_29

    .line 2630
    :cond_5e
    new-instance v2, Ly02;

    .line 2631
    .line 2632
    invoke-direct {v2, v12}, Ly02;-><init>(F)V

    .line 2633
    .line 2634
    .line 2635
    goto :goto_28

    .line 2636
    :goto_29
    new-instance v22, Lua;

    .line 2637
    .line 2638
    move-object/from16 v23, v0

    .line 2639
    .line 2640
    invoke-direct/range {v22 .. v28}, Lua;-><init>(Lpx1;JJLkn0;)V

    .line 2641
    .line 2642
    .line 2643
    move-object/from16 v0, v22

    .line 2644
    .line 2645
    invoke-virtual {v1, v0}, Lhd;->γ(La80;)Ln;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v7

    .line 2649
    goto :goto_2a

    .line 2650
    :cond_5f
    invoke-static {}, Lγ;->κ()V

    .line 2651
    .line 2652
    .line 2653
    const/4 v7, 0x0

    .line 2654
    goto :goto_2a

    .line 2655
    :cond_60
    new-instance v0, Ln7;

    .line 2656
    .line 2657
    const/4 v2, 0x4

    .line 2658
    invoke-direct {v0, v2}, Ln7;-><init>(I)V

    .line 2659
    .line 2660
    .line 2661
    invoke-virtual {v1, v0}, Lhd;->γ(La80;)Ln;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v7

    .line 2665
    :goto_2a
    return-object v7

    .line 2666
    :pswitch_19
    move v2, v8

    .line 2667
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 2668
    .line 2669
    check-cast v0, Lp7;

    .line 2670
    .line 2671
    check-cast v1, Lf8;

    .line 2672
    .line 2673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2674
    .line 2675
    .line 2676
    sget-object v3, Lt7;->ε:Lp7;

    .line 2677
    .line 2678
    sget-object v4, Lpq;->α:Lpq;

    .line 2679
    .line 2680
    invoke-static {}, Lpq;->α()Lmq;

    .line 2681
    .line 2682
    .line 2683
    move-result-object v4

    .line 2684
    if-ne v3, v0, :cond_68

    .line 2685
    .line 2686
    if-eqz v4, :cond_68

    .line 2687
    .line 2688
    iget-wide v3, v4, Lmq;->δ:J

    .line 2689
    .line 2690
    iget-wide v5, v0, Lp7;->α:J

    .line 2691
    .line 2692
    cmp-long v3, v3, v5

    .line 2693
    .line 2694
    if-nez v3, :cond_68

    .line 2695
    .line 2696
    const/4 v5, 0x0

    .line 2697
    iput-object v5, v0, Lp7;->ε:Loq;

    .line 2698
    .line 2699
    iget-boolean v3, v0, Lp7;->γ:Z

    .line 2700
    .line 2701
    iget-object v4, v1, Lf8;->ζ:Lh8;

    .line 2702
    .line 2703
    sget-object v5, Lh8;->ζ:Lh8;

    .line 2704
    .line 2705
    if-eq v4, v5, :cond_62

    .line 2706
    .line 2707
    sget-object v5, Lh8;->η:Lh8;

    .line 2708
    .line 2709
    if-eq v4, v5, :cond_62

    .line 2710
    .line 2711
    invoke-virtual {v1}, Lf8;->κ()Z

    .line 2712
    .line 2713
    .line 2714
    move-result v4

    .line 2715
    if-nez v4, :cond_62

    .line 2716
    .line 2717
    invoke-virtual {v1}, Lf8;->λ()Z

    .line 2718
    .line 2719
    .line 2720
    move-result v4

    .line 2721
    if-eqz v4, :cond_61

    .line 2722
    .line 2723
    goto :goto_2b

    .line 2724
    :cond_61
    move v4, v2

    .line 2725
    goto :goto_2c

    .line 2726
    :cond_62
    :goto_2b
    const/4 v4, 0x1

    .line 2727
    :goto_2c
    iget-object v5, v1, Lf8;->ζ:Lh8;

    .line 2728
    .line 2729
    sget-object v6, Lh8;->ε:Lh8;

    .line 2730
    .line 2731
    if-eq v5, v6, :cond_64

    .line 2732
    .line 2733
    invoke-virtual {v1}, Lf8;->ν()Z

    .line 2734
    .line 2735
    .line 2736
    move-result v1

    .line 2737
    if-eqz v1, :cond_63

    .line 2738
    .line 2739
    goto :goto_2d

    .line 2740
    :cond_63
    move v8, v2

    .line 2741
    goto :goto_2e

    .line 2742
    :cond_64
    :goto_2d
    const/4 v8, 0x1

    .line 2743
    :goto_2e
    if-eqz v3, :cond_65

    .line 2744
    .line 2745
    sget-object v1, Lm7;->η:Lm7;

    .line 2746
    .line 2747
    goto :goto_2f

    .line 2748
    :cond_65
    if-eqz v4, :cond_66

    .line 2749
    .line 2750
    sget-object v1, Lm7;->ζ:Lm7;

    .line 2751
    .line 2752
    goto :goto_2f

    .line 2753
    :cond_66
    if-eqz v8, :cond_67

    .line 2754
    .line 2755
    sget-object v1, Lm7;->ε:Lm7;

    .line 2756
    .line 2757
    goto :goto_2f

    .line 2758
    :cond_67
    sget-object v1, Lm7;->θ:Lm7;

    .line 2759
    .line 2760
    :goto_2f
    iput-object v1, v0, Lp7;->δ:Lm7;

    .line 2761
    .line 2762
    sput-object v1, Lt7;->γ:Lm7;

    .line 2763
    .line 2764
    invoke-static {v0}, Lt7;->ε(Lp7;)V

    .line 2765
    .line 2766
    .line 2767
    :cond_68
    sget-object v0, Ls62;->α:Ls62;

    .line 2768
    .line 2769
    return-object v0

    .line 2770
    :pswitch_1a
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 2771
    .line 2772
    check-cast v0, Lga1;

    .line 2773
    .line 2774
    check-cast v1, Ljava/util/Map$Entry;

    .line 2775
    .line 2776
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2777
    .line 2778
    .line 2779
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2780
    .line 2781
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2782
    .line 2783
    .line 2784
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v3

    .line 2788
    const-string v4, "(this Map)"

    .line 2789
    .line 2790
    if-ne v3, v0, :cond_69

    .line 2791
    .line 2792
    move-object v3, v4

    .line 2793
    goto :goto_30

    .line 2794
    :cond_69
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v3

    .line 2798
    :goto_30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2799
    .line 2800
    .line 2801
    const/16 v3, 0x3d

    .line 2802
    .line 2803
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2804
    .line 2805
    .line 2806
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v1

    .line 2810
    if-ne v1, v0, :cond_6a

    .line 2811
    .line 2812
    goto :goto_31

    .line 2813
    :cond_6a
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2814
    .line 2815
    .line 2816
    move-result-object v4

    .line 2817
    :goto_31
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2818
    .line 2819
    .line 2820
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v0

    .line 2824
    return-object v0

    .line 2825
    :pswitch_1b
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 2826
    .line 2827
    check-cast v0, Lμ;

    .line 2828
    .line 2829
    if-ne v1, v0, :cond_6b

    .line 2830
    .line 2831
    const-string v0, "(this Collection)"

    .line 2832
    .line 2833
    goto :goto_32

    .line 2834
    :cond_6b
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v0

    .line 2838
    :goto_32
    return-object v0

    .line 2839
    :pswitch_1c
    iget-object v0, v0, Lθ;->ζ:Ljava/lang/Object;

    .line 2840
    .line 2841
    check-cast v0, Lcom/example/dyhelper/ui/AboutActivity;

    .line 2842
    .line 2843
    check-cast v1, Ljava/lang/Integer;

    .line 2844
    .line 2845
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2846
    .line 2847
    .line 2848
    move-result v1

    .line 2849
    sget v2, Lcom/example/dyhelper/ui/AboutActivity;->ζ:I

    .line 2850
    .line 2851
    int-to-float v1, v1

    .line 2852
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v0

    .line 2856
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2857
    .line 2858
    .line 2859
    move-result-object v0

    .line 2860
    const/4 v5, 0x1

    .line 2861
    invoke-static {v5, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 2862
    .line 2863
    .line 2864
    move-result v0

    .line 2865
    float-to-int v0, v0

    .line 2866
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v0

    .line 2870
    return-object v0

    .line 2871
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
