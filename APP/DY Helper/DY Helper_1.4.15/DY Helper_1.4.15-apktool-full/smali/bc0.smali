.class public final synthetic Lbc0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lbc0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbc0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lbc0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Lbc0;->ε:I

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    const-string v6, ""

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    iget-object v10, v0, Lbc0;->η:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, v0, Lbc0;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, La80;

    .line 22
    .line 23
    check-cast v10, Landroid/widget/EditText;

    .line 24
    .line 25
    invoke-virtual {v10}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    check-cast v0, Landroid/app/Activity;

    .line 46
    .line 47
    check-cast v10, Lux$α;

    .line 48
    .line 49
    const-string v1, "clipboard"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v2, v1, Landroid/content/ClipboardManager;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    move-object v8, v1

    .line 60
    check-cast v8, Landroid/content/ClipboardManager;

    .line 61
    .line 62
    :cond_0
    if-eqz v8, :cond_1

    .line 63
    .line 64
    const-string v1, "DyLog"

    .line 65
    .line 66
    invoke-static {v10}, Lux;->ξ(Lux$α;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v8, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    const-string v1, "\u5df2\u590d\u5236\u65e5\u5fd7"

    .line 78
    .line 79
    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_1
    check-cast v0, La80;

    .line 88
    .line 89
    check-cast v10, Lsm1;

    .line 90
    .line 91
    iget v1, v10, Lsm1;->ε:I

    .line 92
    .line 93
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_2
    move-object v13, v0

    .line 102
    check-cast v13, Landroid/app/Activity;

    .line 103
    .line 104
    move-object v15, v10

    .line 105
    check-cast v15, La80;

    .line 106
    .line 107
    sget-object v0, Lbv1;->α:Lbv1;

    .line 108
    .line 109
    const-string v0, "\u8bbe\u7f6e\u81ea\u52a8\u5df2\u8bfb\u89c4\u5219"

    .line 110
    .line 111
    const-string v2, "im_auto_read_filter_rules"

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    if-eq v1, v9, :cond_3

    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    if-eq v1, v0, :cond_2

    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_2
    invoke-static {v2, v6}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v0, "\u672a\u8bbe\u7f6e"

    .line 126
    .line 127
    invoke-interface {v15, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const-string v0, "\u89c4\u5219\u5df2\u6e05\u7a7a"

    .line 131
    .line 132
    invoke-static {v13, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :cond_3
    invoke-static {v2, v6}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    new-instance v7, Lhu;

    .line 146
    .line 147
    invoke-direct {v7, v15, v13, v3}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 148
    .line 149
    .line 150
    const-string v4, "\u6bcf\u884c\u4e00\u4e2a\u89c4\u5219\uff0c\u4e5f\u53ef\u4ee5\u4f7f\u7528 cid:/uid:/name:"

    .line 151
    .line 152
    const v6, 0x20001

    .line 153
    .line 154
    .line 155
    move-object v3, v0

    .line 156
    move-object v2, v13

    .line 157
    invoke-static/range {v2 .. v7}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :cond_4
    move-object v3, v0

    .line 163
    :try_start_0
    sget-object v0, Lx01;->α:Lx01;

    .line 164
    .line 165
    invoke-virtual {v0, v13}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 166
    .line 167
    .line 168
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    const v1, 0x7f0c002b

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    const v11, 0x7f0901d3

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    check-cast v11, Landroid/widget/TextView;

    .line 188
    .line 189
    const v12, 0x7f0901db

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    check-cast v12, Landroid/widget/TextView;

    .line 197
    .line 198
    const v14, 0x7f0901d4

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Landroid/widget/TextView;

    .line 206
    .line 207
    const v5, 0x7f0901da

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    move-object/from16 v24, v5

    .line 215
    .line 216
    check-cast v24, Landroid/widget/TextView;

    .line 217
    .line 218
    const v5, 0x7f0901cc

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Landroid/widget/EditText;

    .line 226
    .line 227
    const v9, 0x7f0901ce

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    check-cast v9, Landroid/widget/ListView;

    .line 235
    .line 236
    const v7, 0x7f0901d5

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    check-cast v7, Landroid/widget/TextView;

    .line 244
    .line 245
    const v8, 0x7f0901cf

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    const v4, 0x7f0901d0

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v29

    .line 259
    const v4, 0x7f0901d9

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    move-object/from16 v26, v4

    .line 267
    .line 268
    check-cast v26, Landroid/widget/TextView;

    .line 269
    .line 270
    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 274
    .line 275
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 276
    .line 277
    .line 278
    const-string v4, "#EAF3EA"

    .line 279
    .line 280
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    const/16 v4, 0xa

    .line 291
    .line 292
    invoke-static {v10, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    int-to-float v4, v12

    .line 297
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v14, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 301
    .line 302
    .line 303
    const-string v3, "#4A5E4D"

    .line 304
    .line 305
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 310
    .line 311
    .line 312
    const-string v3, "#1C2B1E"

    .line 313
    .line 314
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 319
    .line 320
    .line 321
    const-string v3, "#9EB09F"

    .line 322
    .line 323
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 328
    .line 329
    .line 330
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 331
    .line 332
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v4, "#F4F6F4"

    .line 336
    .line 337
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 342
    .line 343
    .line 344
    const/16 v4, 0xa

    .line 345
    .line 346
    invoke-static {v10, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    int-to-float v4, v12

    .line 351
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 355
    .line 356
    .line 357
    const/16 v3, 0xc

    .line 358
    .line 359
    invoke-static {v10, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    const/16 v12, 0x8

    .line 364
    .line 365
    move-object/from16 v22, v14

    .line 366
    .line 367
    invoke-static {v10, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 368
    .line 369
    .line 370
    move-result v14

    .line 371
    invoke-static {v10, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    invoke-static {v10, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    invoke-virtual {v5, v4, v14, v3, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 380
    .line 381
    .line 382
    const/4 v3, 0x0

    .line 383
    invoke-virtual {v9, v3}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 384
    .line 385
    .line 386
    const/4 v3, 0x0

    .line 387
    invoke-virtual {v9, v3}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v7}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v2, v6}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const-string v3, "\r"

    .line 398
    .line 399
    const-string v4, "\n"

    .line 400
    .line 401
    invoke-static {v2, v3, v4}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-static {v2}, Lq02;->к(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    new-instance v3, Ljava/util/ArrayList;

    .line 410
    .line 411
    const/16 v4, 0xa

    .line 412
    .line 413
    invoke-static {v2, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    if-eqz v4, :cond_5

    .line 429
    .line 430
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    check-cast v4, Ljava/lang/String;

    .line 435
    .line 436
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_0

    .line 448
    :cond_5
    new-instance v14, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    :cond_6
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_7

    .line 462
    .line 463
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    move-object v4, v3

    .line 468
    check-cast v4, Ljava/lang/String;

    .line 469
    .line 470
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-nez v4, :cond_6

    .line 475
    .line 476
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    goto :goto_1

    .line 480
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 481
    .line 482
    const/16 v4, 0xa

    .line 483
    .line 484
    invoke-static {v14, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_8

    .line 500
    .line 501
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Ljava/lang/String;

    .line 506
    .line 507
    invoke-static {v4}, Lbv1;->Δ(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_2

    .line 515
    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    :cond_9
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    if-eqz v4, :cond_a

    .line 529
    .line 530
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    move-object v10, v4

    .line 535
    check-cast v10, Ljava/lang/String;

    .line 536
    .line 537
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 538
    .line 539
    .line 540
    move-result v10

    .line 541
    if-nez v10, :cond_9

    .line 542
    .line 543
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    goto :goto_3

    .line 547
    :cond_a
    invoke-static {v3}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 552
    .line 553
    invoke-direct {v10}, Ljava/util/LinkedHashSet;-><init>()V

    .line 554
    .line 555
    .line 556
    new-instance v18, Ljava/util/HashSet;

    .line 557
    .line 558
    invoke-direct/range {v18 .. v18}, Ljava/util/HashSet;-><init>()V

    .line 559
    .line 560
    .line 561
    new-instance v12, Lum1;

    .line 562
    .line 563
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 564
    .line 565
    .line 566
    sget-object v3, Ljz;->ε:Ljz;

    .line 567
    .line 568
    iput-object v3, v12, Lum1;->ε:Ljava/lang/Object;

    .line 569
    .line 570
    new-instance v4, Lum1;

    .line 571
    .line 572
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 573
    .line 574
    .line 575
    iput-object v3, v4, Lum1;->ε:Ljava/lang/Object;

    .line 576
    .line 577
    new-instance v3, Lum1;

    .line 578
    .line 579
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 580
    .line 581
    .line 582
    iput-object v6, v3, Lum1;->ε:Ljava/lang/Object;

    .line 583
    .line 584
    new-instance v6, Lqm1;

    .line 585
    .line 586
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 587
    .line 588
    .line 589
    move-object/from16 p0, v2

    .line 590
    .line 591
    const/4 v2, 0x1

    .line 592
    iput-boolean v2, v6, Lqm1;->ε:Z

    .line 593
    .line 594
    new-instance v25, Lum1;

    .line 595
    .line 596
    invoke-direct/range {v25 .. v25}, Ljava/lang/Object;-><init>()V

    .line 597
    .line 598
    .line 599
    new-instance v2, Lum1;

    .line 600
    .line 601
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 602
    .line 603
    .line 604
    move-object/from16 p1, v2

    .line 605
    .line 606
    new-instance v2, Lqm1;

    .line 607
    .line 608
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 609
    .line 610
    .line 611
    sget-object v16, Lbv1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 612
    .line 613
    move-object/from16 v23, v6

    .line 614
    .line 615
    move-object/from16 v27, v7

    .line 616
    .line 617
    invoke-virtual/range {v16 .. v16}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 618
    .line 619
    .line 620
    move-result-wide v6

    .line 621
    move-object/from16 p2, v3

    .line 622
    .line 623
    new-instance v3, Lzc0;

    .line 624
    .line 625
    invoke-direct {v3, v4, v0, v10}, Lzc0;-><init>(Lum1;Landroid/view/LayoutInflater;Ljava/util/LinkedHashSet;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v9, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 629
    .line 630
    .line 631
    new-instance v16, Lxt1;

    .line 632
    .line 633
    move-object/from16 v20, v3

    .line 634
    .line 635
    move-object/from16 v17, v4

    .line 636
    .line 637
    move-object/from16 v19, v10

    .line 638
    .line 639
    move-object/from16 v21, v12

    .line 640
    .line 641
    move-object/from16 v28, v26

    .line 642
    .line 643
    move-object/from16 v26, p2

    .line 644
    .line 645
    invoke-direct/range {v16 .. v29}, Lxt1;-><init>(Lum1;Ljava/util/HashSet;Ljava/util/LinkedHashSet;Lzc0;Lum1;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 646
    .line 647
    .line 648
    move-object/from16 v3, v16

    .line 649
    .line 650
    move-object/from16 v12, v17

    .line 651
    .line 652
    move-object/from16 v0, v18

    .line 653
    .line 654
    move-object/from16 v16, v20

    .line 655
    .line 656
    move-object/from16 v20, v21

    .line 657
    .line 658
    move-object/from16 v18, v26

    .line 659
    .line 660
    move-object/from16 v17, v28

    .line 661
    .line 662
    invoke-virtual {v9, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 663
    .line 664
    .line 665
    move-object/from16 v21, v16

    .line 666
    .line 667
    new-instance v16, Lyu1;

    .line 668
    .line 669
    move-object/from16 v26, v27

    .line 670
    .line 671
    move-object/from16 v28, v29

    .line 672
    .line 673
    move-object/from16 v27, v17

    .line 674
    .line 675
    move-object/from16 v29, v19

    .line 676
    .line 677
    move-object/from16 v17, p1

    .line 678
    .line 679
    move-object/from16 v19, v12

    .line 680
    .line 681
    invoke-direct/range {v16 .. v29}, Lyu1;-><init>(Lum1;Lum1;Lum1;Lum1;Lzc0;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 682
    .line 683
    .line 684
    move-object/from16 v3, v27

    .line 685
    .line 686
    move-object/from16 v27, v26

    .line 687
    .line 688
    move-object/from16 v26, v3

    .line 689
    .line 690
    move-object/from16 v10, v16

    .line 691
    .line 692
    move-object/from16 v9, v17

    .line 693
    .line 694
    move-object/from16 v4, v19

    .line 695
    .line 696
    move-object/from16 v3, v28

    .line 697
    .line 698
    move-object/from16 v19, v29

    .line 699
    .line 700
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 701
    .line 702
    .line 703
    new-instance v10, Landroid/app/AlertDialog$Builder;

    .line 704
    .line 705
    invoke-direct {v10, v13}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v10, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    new-instance v10, Lsa;

    .line 717
    .line 718
    const/16 v12, 0x17

    .line 719
    .line 720
    invoke-direct {v10, v1, v12}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 724
    .line 725
    .line 726
    new-instance v10, Lc9;

    .line 727
    .line 728
    const/16 v11, 0xe

    .line 729
    .line 730
    invoke-direct {v10, v1, v13, v15, v11}, Lc9;-><init>(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/Object;I)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 734
    .line 735
    .line 736
    new-instance v10, Ltt1;

    .line 737
    .line 738
    move-object/from16 v16, v1

    .line 739
    .line 740
    move-object/from16 v17, v19

    .line 741
    .line 742
    move-object/from16 v12, v20

    .line 743
    .line 744
    move-object/from16 v11, v23

    .line 745
    .line 746
    invoke-direct/range {v10 .. v17}, Ltt1;-><init>(Lqm1;Lum1;Landroid/app/Activity;Ljava/util/ArrayList;La80;Landroid/app/AlertDialog;Ljava/util/LinkedHashSet;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v3, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 750
    .line 751
    .line 752
    new-instance v8, Lyt1;

    .line 753
    .line 754
    invoke-direct {v8, v2, v9, v6, v7}, Lyt1;-><init>(Lqm1;Lum1;J)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v1, v8}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 758
    .line 759
    .line 760
    const/4 v8, 0x1

    .line 761
    iput-boolean v8, v11, Lqm1;->ε:Z

    .line 762
    .line 763
    move-object/from16 v16, v27

    .line 764
    .line 765
    const-string v27, ""

    .line 766
    .line 767
    move-object/from16 v17, v25

    .line 768
    .line 769
    move-object/from16 v25, v16

    .line 770
    .line 771
    move-object/from16 v16, v21

    .line 772
    .line 773
    move-object/from16 v21, v17

    .line 774
    .line 775
    move-object/from16 v17, v11

    .line 776
    .line 777
    move-object/from16 v28, v19

    .line 778
    .line 779
    move-object/from16 v23, v22

    .line 780
    .line 781
    move-object/from16 v22, v3

    .line 782
    .line 783
    move-object/from16 v19, v4

    .line 784
    .line 785
    invoke-static/range {v16 .. v28}, Lbv1;->Ρ(Lzc0;Lqm1;Lum1;Lum1;Lum1;Lum1;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 786
    .line 787
    .line 788
    move-object/from16 v12, v19

    .line 789
    .line 790
    move-object/from16 v29, v22

    .line 791
    .line 792
    move-object/from16 v22, v23

    .line 793
    .line 794
    move-object/from16 v27, v25

    .line 795
    .line 796
    move-object/from16 v19, v28

    .line 797
    .line 798
    move-object/from16 v23, v17

    .line 799
    .line 800
    move-object/from16 v25, v21

    .line 801
    .line 802
    move-object/from16 v17, v26

    .line 803
    .line 804
    move-object/from16 v21, v16

    .line 805
    .line 806
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    if-eqz v3, :cond_b

    .line 814
    .line 815
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 816
    .line 817
    const/4 v8, 0x0

    .line 818
    invoke-direct {v4, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v3, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    invoke-virtual {v4, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 840
    .line 841
    int-to-float v4, v4

    .line 842
    const v8, 0x3f70a3d7    # 0.94f

    .line 843
    .line 844
    .line 845
    mul-float/2addr v4, v8

    .line 846
    float-to-int v4, v4

    .line 847
    const/4 v8, -0x2

    .line 848
    invoke-virtual {v3, v4, v8}, Landroid/view/Window;->setLayout(II)V

    .line 849
    .line 850
    .line 851
    :cond_b
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    sget-object v4, Lbv1;->ρ:Lh22;

    .line 860
    .line 861
    invoke-virtual {v4}, Lh22;->getValue()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    check-cast v4, Ljava/util/concurrent/ExecutorService;

    .line 866
    .line 867
    move-object/from16 v10, v19

    .line 868
    .line 869
    move-object/from16 v19, v2

    .line 870
    .line 871
    new-instance v2, Lzt1;

    .line 872
    .line 873
    move-object/from16 v8, p0

    .line 874
    .line 875
    move-object v9, v0

    .line 876
    move-object v0, v4

    .line 877
    move-object/from16 v11, v18

    .line 878
    .line 879
    move-object/from16 v14, v22

    .line 880
    .line 881
    move-object/from16 v15, v24

    .line 882
    .line 883
    move-object/from16 v4, v25

    .line 884
    .line 885
    move-object/from16 v16, v27

    .line 886
    .line 887
    move-object/from16 v18, v29

    .line 888
    .line 889
    move-object/from16 v31, v21

    .line 890
    .line 891
    move-object/from16 v21, v1

    .line 892
    .line 893
    move-wide/from16 v32, v6

    .line 894
    .line 895
    move-object v7, v5

    .line 896
    move-object/from16 v6, v20

    .line 897
    .line 898
    move-object/from16 v5, v23

    .line 899
    .line 900
    move-wide/from16 v22, v32

    .line 901
    .line 902
    move-object/from16 v20, v13

    .line 903
    .line 904
    move-object/from16 v13, v31

    .line 905
    .line 906
    invoke-direct/range {v2 .. v23}, Lzt1;-><init>(Ljava/lang/ClassLoader;Lum1;Lqm1;Lum1;Landroid/widget/EditText;Ljava/util/Set;Ljava/util/HashSet;Ljava/util/LinkedHashSet;Lum1;Lum1;Lzc0;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lqm1;Landroid/app/Activity;Landroid/app/AlertDialog;J)V

    .line 907
    .line 908
    .line 909
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 910
    .line 911
    .line 912
    goto :goto_4

    .line 913
    :catchall_0
    move-exception v0

    .line 914
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    const-string v2, "\u521b\u5efa\u6a21\u5757 Context \u5931\u8d25: "

    .line 919
    .line 920
    invoke-static {v2, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    const/4 v2, 0x4

    .line 925
    const-string v3, "DYHelper"

    .line 926
    .line 927
    const/4 v4, 0x0

    .line 928
    invoke-static {v3, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    new-instance v1, Ljava/lang/StringBuilder;

    .line 936
    .line 937
    const-string v2, "\u6a21\u5757\u8d44\u6e90\u52a0\u8f7d\u5931\u8d25: "

    .line 938
    .line 939
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    const/4 v3, 0x0

    .line 950
    invoke-static {v13, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 955
    .line 956
    .line 957
    :goto_4
    return-void

    .line 958
    :pswitch_3
    check-cast v0, Landroid/app/Activity;

    .line 959
    .line 960
    check-cast v10, Lky1;

    .line 961
    .line 962
    sget-object v2, Lwg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 963
    .line 964
    if-eqz v1, :cond_d

    .line 965
    .line 966
    const/4 v2, 0x1

    .line 967
    if-eq v1, v2, :cond_c

    .line 968
    .line 969
    goto :goto_5

    .line 970
    :cond_c
    new-instance v1, Ltg1;

    .line 971
    .line 972
    invoke-direct {v1, v0, v10, v2}, Ltg1;-><init>(Landroid/app/Activity;Lky1;I)V

    .line 973
    .line 974
    .line 975
    const-string v2, "\u6b63\u5728\u8bfb\u53d6\u56fe\u7247\u4efb\u52a1"

    .line 976
    .line 977
    invoke-static {v0, v2, v1}, Lwg1;->β(Landroid/app/Activity;Ljava/lang/String;Lp70;)V

    .line 978
    .line 979
    .line 980
    goto :goto_5

    .line 981
    :cond_d
    new-instance v1, Ltg1;

    .line 982
    .line 983
    const/4 v3, 0x0

    .line 984
    invoke-direct {v1, v0, v10, v3}, Ltg1;-><init>(Landroid/app/Activity;Lky1;I)V

    .line 985
    .line 986
    .line 987
    const-string v2, "\u6b63\u5728\u8bfb\u53d6\u5b9e\u65f6\u4e92\u53d1\u4efb\u52a1"

    .line 988
    .line 989
    invoke-static {v0, v2, v1}, Lwg1;->β(Landroid/app/Activity;Ljava/lang/String;Lp70;)V

    .line 990
    .line 991
    .line 992
    :goto_5
    return-void

    .line 993
    :pswitch_4
    check-cast v0, Landroid/app/Activity;

    .line 994
    .line 995
    check-cast v10, Ljava/util/List;

    .line 996
    .line 997
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    check-cast v1, Lky1;

    .line 1002
    .line 1003
    sget-object v2, Lry1;->α:Lry1;

    .line 1004
    .line 1005
    invoke-static {v1}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 1010
    .line 1011
    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    const-string v3, "\u6309\u5b9e\u65f6\u4efb\u52a1\u6570\u91cf\u53d1\u9001\u6587\u672c"

    .line 1019
    .line 1020
    const-string v4, "\u9009\u62e9 SAF \u56fe\u7247\u53d1\u9001"

    .line 1021
    .line 1022
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    check-cast v3, [Ljava/lang/CharSequence;

    .line 1027
    .line 1028
    new-instance v4, Lbc0;

    .line 1029
    .line 1030
    const/4 v5, 0x6

    .line 1031
    invoke-direct {v4, v0, v5, v1}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    const-string v1, "\u53d6\u6d88"

    .line 1039
    .line 1040
    const/4 v3, 0x0

    .line 1041
    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1046
    .line 1047
    .line 1048
    return-void

    .line 1049
    :pswitch_5
    check-cast v0, La80;

    .line 1050
    .line 1051
    check-cast v10, Ljava/util/ArrayList;

    .line 1052
    .line 1053
    if-nez v1, :cond_e

    .line 1054
    .line 1055
    goto :goto_6

    .line 1056
    :cond_e
    const/16 v30, 0x1

    .line 1057
    .line 1058
    add-int/lit8 v1, v1, -0x1

    .line 1059
    .line 1060
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    check-cast v1, Ls71;

    .line 1065
    .line 1066
    iget-object v6, v1, Ls71;->α:Ljava/lang/String;

    .line 1067
    .line 1068
    :goto_6
    invoke-interface {v0, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    invoke-interface/range {p1 .. p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1072
    .line 1073
    .line 1074
    return-void

    .line 1075
    :pswitch_6
    check-cast v0, Landroid/app/Activity;

    .line 1076
    .line 1077
    check-cast v10, Lp3;

    .line 1078
    .line 1079
    new-instance v1, Lwa;

    .line 1080
    .line 1081
    const/16 v12, 0x17

    .line 1082
    .line 1083
    invoke-direct {v1, v0, v12, v10}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v0, v1}, Lyh;->п(Landroid/app/Activity;La80;)V

    .line 1087
    .line 1088
    .line 1089
    return-void

    .line 1090
    :pswitch_7
    check-cast v0, Lf8;

    .line 1091
    .line 1092
    check-cast v10, Landroid/app/Activity;

    .line 1093
    .line 1094
    iget-object v1, v0, Lf8;->ι:Ljava/lang/String;

    .line 1095
    .line 1096
    if-eqz v1, :cond_f

    .line 1097
    .line 1098
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v3

    .line 1106
    goto :goto_7

    .line 1107
    :cond_f
    const/4 v3, 0x0

    .line 1108
    :goto_7
    if-nez v3, :cond_10

    .line 1109
    .line 1110
    move-object v3, v6

    .line 1111
    :cond_10
    iget-object v0, v0, Lf8;->κ:Ljava/lang/String;

    .line 1112
    .line 1113
    if-eqz v0, :cond_11

    .line 1114
    .line 1115
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v8

    .line 1123
    goto :goto_8

    .line 1124
    :cond_11
    const/4 v8, 0x0

    .line 1125
    :goto_8
    if-nez v8, :cond_12

    .line 1126
    .line 1127
    move-object v8, v6

    .line 1128
    :cond_12
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v0

    .line 1132
    if-nez v0, :cond_13

    .line 1133
    .line 1134
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    if-nez v0, :cond_13

    .line 1139
    .line 1140
    const-string v0, "uid="

    .line 1141
    .line 1142
    const-string v1, "\nsec_uid="

    .line 1143
    .line 1144
    invoke-static {v0, v3, v1, v8}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v6

    .line 1148
    goto :goto_9

    .line 1149
    :cond_13
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v0

    .line 1153
    if-nez v0, :cond_14

    .line 1154
    .line 1155
    move-object v6, v3

    .line 1156
    goto :goto_9

    .line 1157
    :cond_14
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    if-nez v0, :cond_15

    .line 1162
    .line 1163
    move-object v6, v8

    .line 1164
    :cond_15
    :goto_9
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v0

    .line 1168
    if-eqz v0, :cond_16

    .line 1169
    .line 1170
    const-string v0, "\u5f53\u524d\u672a\u8bc6\u522b\u5230\u4e3b\u9875ID"

    .line 1171
    .line 1172
    const/4 v3, 0x0

    .line 1173
    invoke-static {v10, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1178
    .line 1179
    .line 1180
    goto :goto_a

    .line 1181
    :cond_16
    sget-object v0, Lq71;->α:Lq71;

    .line 1182
    .line 1183
    const-string v0, "\u4e3b\u9875ID\u5df2\u590d\u5236"

    .line 1184
    .line 1185
    invoke-static {v10, v6, v0}, Lq71;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    :goto_a
    return-void

    .line 1189
    :pswitch_8
    check-cast v0, Lli0;

    .line 1190
    .line 1191
    check-cast v10, Ljava/util/ArrayList;

    .line 1192
    .line 1193
    iget-boolean v1, v0, Lli0;->Γ:Z

    .line 1194
    .line 1195
    if-nez v1, :cond_1a

    .line 1196
    .line 1197
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    if-eqz v1, :cond_17

    .line 1202
    .line 1203
    goto :goto_c

    .line 1204
    :cond_17
    const/4 v2, 0x1

    .line 1205
    iput-boolean v2, v0, Lli0;->Γ:Z

    .line 1206
    .line 1207
    const/4 v8, 0x0

    .line 1208
    iput v8, v0, Lli0;->Η:I

    .line 1209
    .line 1210
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1211
    .line 1212
    .line 1213
    move-result v1

    .line 1214
    iput v1, v0, Lli0;->Θ:I

    .line 1215
    .line 1216
    const/4 v4, 0x0

    .line 1217
    iput-object v4, v0, Lli0;->Ι:Lhj0;

    .line 1218
    .line 1219
    invoke-virtual {v0, v2}, Lli0;->ε(Z)V

    .line 1220
    .line 1221
    .line 1222
    new-instance v1, Ldj0;

    .line 1223
    .line 1224
    new-instance v2, Lhi0;

    .line 1225
    .line 1226
    invoke-direct {v2, v0}, Lhi0;-><init>(Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-direct {v1, v2}, Ldj0;-><init>(Lhi0;)V

    .line 1230
    .line 1231
    .line 1232
    new-instance v2, Lji0;

    .line 1233
    .line 1234
    invoke-direct {v2, v0}, Lji0;-><init>(Lli0;)V

    .line 1235
    .line 1236
    .line 1237
    new-instance v4, Ljava/util/HashSet;

    .line 1238
    .line 1239
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 1240
    .line 1241
    .line 1242
    new-instance v5, Ljava/util/ArrayList;

    .line 1243
    .line 1244
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v6

    .line 1251
    :cond_18
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v7

    .line 1255
    if-eqz v7, :cond_19

    .line 1256
    .line 1257
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v7

    .line 1261
    move-object v8, v7

    .line 1262
    check-cast v8, Lxi0;

    .line 1263
    .line 1264
    iget-object v8, v8, Lxi0;->α:Ljava/lang/String;

    .line 1265
    .line 1266
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v8

    .line 1270
    if-eqz v8, :cond_18

    .line 1271
    .line 1272
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    goto :goto_b

    .line 1276
    :cond_19
    new-instance v4, Lcj0;

    .line 1277
    .line 1278
    invoke-direct {v4, v5, v2}, Lcj0;-><init>(Ljava/util/ArrayList;Lji0;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v2, Lzi0;

    .line 1282
    .line 1283
    invoke-direct {v2, v1, v4}, Lzi0;-><init>(Ldj0;Lcj0;)V

    .line 1284
    .line 1285
    .line 1286
    iget-object v5, v1, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1287
    .line 1288
    invoke-interface {v5, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1289
    .line 1290
    .line 1291
    new-instance v2, Ln5;

    .line 1292
    .line 1293
    new-instance v5, Lp3;

    .line 1294
    .line 1295
    invoke-direct {v5, v1, v3, v4}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-direct {v2, v5}, Ln5;-><init>(Lp3;)V

    .line 1299
    .line 1300
    .line 1301
    iput-object v2, v0, Lli0;->Λ:Ln5;

    .line 1302
    .line 1303
    :cond_1a
    :goto_c
    return-void

    .line 1304
    :pswitch_9
    check-cast v0, Ldc0;

    .line 1305
    .line 1306
    check-cast v10, Ljava/util/List;

    .line 1307
    .line 1308
    new-instance v1, Ljava/util/ArrayList;

    .line 1309
    .line 1310
    const/16 v4, 0xa

    .line 1311
    .line 1312
    invoke-static {v10, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1313
    .line 1314
    .line 1315
    move-result v2

    .line 1316
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1317
    .line 1318
    .line 1319
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v2

    .line 1323
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v3

    .line 1327
    if-eqz v3, :cond_1b

    .line 1328
    .line 1329
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v3

    .line 1333
    check-cast v3, Lic0;

    .line 1334
    .line 1335
    iget-wide v3, v3, Lic0;->α:J

    .line 1336
    .line 1337
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1342
    .line 1343
    .line 1344
    goto :goto_d

    .line 1345
    :cond_1b
    iget-boolean v2, v0, Ldc0;->υ:Z

    .line 1346
    .line 1347
    if-nez v2, :cond_1d

    .line 1348
    .line 1349
    iget-boolean v2, v0, Ldc0;->φ:Z

    .line 1350
    .line 1351
    if-nez v2, :cond_1d

    .line 1352
    .line 1353
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1354
    .line 1355
    .line 1356
    move-result v2

    .line 1357
    if-nez v2, :cond_1d

    .line 1358
    .line 1359
    iget-object v2, v0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1360
    .line 1361
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v2

    .line 1365
    if-eqz v2, :cond_1c

    .line 1366
    .line 1367
    goto :goto_e

    .line 1368
    :cond_1c
    const/4 v2, 0x1

    .line 1369
    iput-boolean v2, v0, Ldc0;->φ:Z

    .line 1370
    .line 1371
    const-string v2, "\u6b63\u5728\u63d0\u4ea4\u5165\u7fa4\u5ba1\u6279"

    .line 1372
    .line 1373
    iput-object v2, v0, Ldc0;->χ:Ljava/lang/String;

    .line 1374
    .line 1375
    iput-object v6, v0, Ldc0;->ψ:Ljava/lang/String;

    .line 1376
    .line 1377
    invoke-virtual {v0}, Ldc0;->η()V

    .line 1378
    .line 1379
    .line 1380
    sget-object v2, Lec0;->β:Ljava/util/concurrent/ExecutorService;

    .line 1381
    .line 1382
    new-instance v3, Lw1;

    .line 1383
    .line 1384
    const/16 v12, 0x17

    .line 1385
    .line 1386
    invoke-direct {v3, v0, v12, v1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1390
    .line 1391
    .line 1392
    :cond_1d
    :goto_e
    return-void

    .line 1393
    :pswitch_data_0
    .packed-switch 0x0
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
