.class public final synthetic Lz61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lz61;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lz61;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lz61;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lz61;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    sget-object v7, Ls62;->α:Ls62;

    .line 12
    .line 13
    iget-object v8, p0, Lz61;->η:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p0, p0, Lz61;->ζ:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p0, Lva2;

    .line 21
    .line 22
    check-cast v8, Landroid/app/Dialog;

    .line 23
    .line 24
    invoke-virtual {p0}, Lva2;->α()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v8}, Landroid/app/Dialog;->dismiss()V

    .line 28
    .line 29
    .line 30
    return-object v7

    .line 31
    :pswitch_0
    check-cast p0, Landroid/content/ContentResolver;

    .line 32
    .line 33
    check-cast v8, Landroid/net/Uri;

    .line 34
    .line 35
    const-string v0, "wt"

    .line 36
    .line 37
    invoke-virtual {p0, v8, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "\u65e0\u6cd5\u6253\u5f00\u4e0b\u8f7d\u8f93\u51fa\u6d41"

    .line 46
    .line 47
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-object v2

    .line 51
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 52
    .line 53
    check-cast v8, Lcu1;

    .line 54
    .line 55
    sget-object v0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    move-object v3, v2

    .line 80
    check-cast v3, Lgz1;

    .line 81
    .line 82
    iget-boolean v3, v3, Lgz1;->ζ:Z

    .line 83
    .line 84
    if-nez v3, :cond_1

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lgz1;

    .line 114
    .line 115
    iget-object v2, v2, Lgz1;->α:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8}, Lcu1;->invoke()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-object v7

    .line 128
    :pswitch_2
    check-cast p0, Landroid/app/Activity;

    .line 129
    .line 130
    check-cast v8, Lcu1;

    .line 131
    .line 132
    sget-object v0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 133
    .line 134
    new-instance v0, Lty1;

    .line 135
    .line 136
    invoke-direct {v0, v8, v6}, Lty1;-><init>(Lcu1;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v8, Landroid/widget/EditText;

    .line 144
    .line 145
    invoke-direct {v8, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    const-string v9, "\u5206\u7ec4\u540d\u79f0"

    .line 149
    .line 150
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 154
    .line 155
    .line 156
    iget-object v9, v1, Lxx;->ζ:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 163
    .line 164
    .line 165
    iget-object v10, v1, Lxx;->θ:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 172
    .line 173
    .line 174
    iget-object v10, v1, Lxx;->γ:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v4, p0, v10}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-virtual {v8, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 181
    .line 182
    .line 183
    const/16 v10, 0xc

    .line 184
    .line 185
    invoke-static {p0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    invoke-static {p0, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    invoke-static {p0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    invoke-static {p0, v3}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {v8, v11, v12, v10, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 202
    .line 203
    .line 204
    invoke-static {p0, v6}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    const/16 v10, 0xe

    .line 209
    .line 210
    invoke-static {p0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    invoke-static {p0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    invoke-static {p0, v10}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    const/4 v13, 0x4

    .line 223
    invoke-static {p0, v13}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    invoke-virtual {v3, v11, v12, v10, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v1, Lxx;->β:Ljava/lang/String;

    .line 231
    .line 232
    const/16 v10, 0x10

    .line 233
    .line 234
    invoke-static {v10, p0, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 239
    .line 240
    .line 241
    new-instance v1, Landroid/widget/TextView;

    .line 242
    .line 243
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 244
    .line 245
    .line 246
    const-string v10, "\u65b0\u589e\u89c4\u5219\u5206\u7ec4"

    .line 247
    .line 248
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    const/high16 v10, 0x41700000    # 15.0f

    .line 252
    .line 253
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 257
    .line 258
    .line 259
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 267
    .line 268
    .line 269
    invoke-static {p0, v4}, Ljz1;->ζ(Landroid/content/Context;I)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    invoke-virtual {v1, v5, v5, v5, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 283
    .line 284
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v3, Ldd0;

    .line 292
    .line 293
    const/4 v4, 0x5

    .line 294
    invoke-direct {v3, v8, p0, v0, v4}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    const-string p0, "\u4fdd\u5b58"

    .line 298
    .line 299
    invoke-virtual {v1, p0, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    const-string v0, "\u53d6\u6d88"

    .line 304
    .line 305
    invoke-virtual {p0, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    if-eqz p0, :cond_4

    .line 321
    .line 322
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 323
    .line 324
    invoke-direct {v0, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 328
    .line 329
    .line 330
    :cond_4
    return-object v7

    .line 331
    :pswitch_3
    check-cast p0, La80;

    .line 332
    .line 333
    check-cast v8, Ln71;

    .line 334
    .line 335
    iget-object v0, v8, Ln71;->α:Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    return-object v7

    .line 341
    :pswitch_4
    check-cast p0, Ljava/lang/Integer;

    .line 342
    .line 343
    check-cast v8, La80;

    .line 344
    .line 345
    sget-object v0, Lbv1;->α:Lbv1;

    .line 346
    .line 347
    const-string v0, "pet_elf_auto_feed_max_price"

    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    invoke-static {v0, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 354
    .line 355
    .line 356
    invoke-static {}, Lxa1;->δ()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-nez v0, :cond_5

    .line 364
    .line 365
    const-string p0, "\u4ec5\u514d\u8d39"

    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v1, "\u6700\u591a "

    .line 371
    .line 372
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string p0, " \u706b\u661f"

    .line 379
    .line 380
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    :goto_3
    invoke-interface {v8, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    return-object v7

    .line 391
    :pswitch_5
    check-cast p0, Landroid/content/Context;

    .line 392
    .line 393
    check-cast v8, La80;

    .line 394
    .line 395
    sget-object v0, Lu90;->α:[J

    .line 396
    .line 397
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {p0}, Lu90;->β(Landroid/content/Context;)Ljava/io/File;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 409
    .line 410
    .line 411
    new-instance v1, Ljava/io/File;

    .line 412
    .line 413
    const-string v2, "geonames_regions.sqlite.tmp"

    .line 414
    .line 415
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 419
    .line 420
    .line 421
    new-instance v1, Ljava/io/File;

    .line 422
    .line 423
    const-string v2, "geonames_regions.zip"

    .line 424
    .line 425
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 429
    .line 430
    .line 431
    new-instance v1, Lxm0;

    .line 432
    .line 433
    invoke-direct {v1, v6, v3, v6}, Lvm0;-><init>(III)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    :goto_4
    move-object v2, v1

    .line 441
    check-cast v2, Lwm0;

    .line 442
    .line 443
    iget-boolean v3, v2, Lwm0;->η:Z

    .line 444
    .line 445
    if-eqz v3, :cond_6

    .line 446
    .line 447
    invoke-virtual {v2}, Lwm0;->nextInt()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    new-instance v3, Ljava/io/File;

    .line 452
    .line 453
    const-string v4, "geonames_regions.zip."

    .line 454
    .line 455
    invoke-static {v4, v2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 463
    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_6
    sget-object v0, Lu90;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 469
    .line 470
    .line 471
    sget-object v0, Lu90;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 474
    .line 475
    .line 476
    const-string v0, "\u672a\u4e0b\u8f7d"

    .line 477
    .line 478
    invoke-interface {v8, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    const-string v0, "\u56fd\u5916\u6570\u636e\u5e93\u5df2\u5220\u9664"

    .line 482
    .line 483
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 488
    .line 489
    .line 490
    return-object v7

    .line 491
    :pswitch_6
    check-cast p0, Lym1;

    .line 492
    .line 493
    check-cast v8, Ljava/lang/CharSequence;

    .line 494
    .line 495
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget-object p0, p0, Lym1;->ε:Ljava/util/regex/Pattern;

    .line 502
    .line 503
    invoke-virtual {p0, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-static {p0, v5, v8}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    return-object p0

    .line 515
    :pswitch_7
    check-cast p0, Lc21;

    .line 516
    .line 517
    check-cast v8, Lzn;

    .line 518
    .line 519
    iget-object v0, p0, Lc21;->β:[Ljava/lang/Object;

    .line 520
    .line 521
    iget-object p0, p0, Lc21;->α:[J

    .line 522
    .line 523
    array-length v2, p0

    .line 524
    sub-int/2addr v2, v1

    .line 525
    if-ltz v2, :cond_a

    .line 526
    .line 527
    move v1, v5

    .line 528
    :goto_5
    aget-wide v9, p0, v1

    .line 529
    .line 530
    not-long v11, v9

    .line 531
    const/4 v4, 0x7

    .line 532
    shl-long/2addr v11, v4

    .line 533
    and-long/2addr v11, v9

    .line 534
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    and-long/2addr v11, v13

    .line 540
    cmp-long v4, v11, v13

    .line 541
    .line 542
    if-eqz v4, :cond_9

    .line 543
    .line 544
    sub-int v4, v1, v2

    .line 545
    .line 546
    not-int v4, v4

    .line 547
    ushr-int/lit8 v4, v4, 0x1f

    .line 548
    .line 549
    rsub-int/lit8 v4, v4, 0x8

    .line 550
    .line 551
    move v6, v5

    .line 552
    :goto_6
    if-ge v6, v4, :cond_8

    .line 553
    .line 554
    const-wide/16 v11, 0xff

    .line 555
    .line 556
    and-long/2addr v11, v9

    .line 557
    const-wide/16 v13, 0x80

    .line 558
    .line 559
    cmp-long v11, v11, v13

    .line 560
    .line 561
    if-gez v11, :cond_7

    .line 562
    .line 563
    shl-int/lit8 v11, v1, 0x3

    .line 564
    .line 565
    add-int/2addr v11, v6

    .line 566
    aget-object v11, v0, v11

    .line 567
    .line 568
    invoke-virtual {v8, v11}, Lzn;->Α(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_7
    shr-long/2addr v9, v3

    .line 572
    add-int/lit8 v6, v6, 0x1

    .line 573
    .line 574
    goto :goto_6

    .line 575
    :cond_8
    if-ne v4, v3, :cond_a

    .line 576
    .line 577
    :cond_9
    if-eq v1, v2, :cond_a

    .line 578
    .line 579
    add-int/lit8 v1, v1, 0x1

    .line 580
    .line 581
    goto :goto_5

    .line 582
    :cond_a
    return-object v7

    .line 583
    :pswitch_8
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 584
    .line 585
    check-cast v8, Ljava/util/List;

    .line 586
    .line 587
    new-instance v0, Lm81;

    .line 588
    .line 589
    invoke-direct {v0, v1, v8}, Lm81;-><init>(ILjava/util/List;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    return-object p0

    .line 597
    :pswitch_9
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 598
    .line 599
    check-cast v8, Ljava/lang/String;

    .line 600
    .line 601
    new-instance v0, Lyh0;

    .line 602
    .line 603
    invoke-direct {v0, v8, v4}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    return-object p0

    .line 611
    :pswitch_a
    check-cast p0, Landroid/app/Activity;

    .line 612
    .line 613
    check-cast v8, Lo71;

    .line 614
    .line 615
    sget-object v0, Lq71;->α:Lq71;

    .line 616
    .line 617
    iget-object v0, v8, Lo71;->ε:Ljava/lang/String;

    .line 618
    .line 619
    const-string v1, "\u5df2\u590d\u5236"

    .line 620
    .line 621
    invoke-static {p0, v0, v1}, Lq71;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    return-object v7

    .line 625
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
