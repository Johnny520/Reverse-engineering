.class public final synthetic Lζ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lζ;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lζ;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lζ;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lζ;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, Lζ;->η:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, v0, Lζ;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    check-cast v5, Lky1;

    .line 19
    .line 20
    const v1, 0x3f266666    # 0.65f

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lry1;->α:Lry1;

    .line 27
    .line 28
    invoke-static {v5}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "spark"

    .line 33
    .line 34
    invoke-static {v2, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Landroid/view/View$DragShadowBuilder;

    .line 39
    .line 40
    invoke-direct {v2, v0}, Landroid/view/View$DragShadowBuilder;-><init>(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v5, v6}, Landroid/view/View;->startDragAndDrop(Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    .line 44
    .line 45
    .line 46
    return v4

    .line 47
    :pswitch_0
    check-cast v0, Lgz1;

    .line 48
    .line 49
    check-cast v5, Landroid/widget/LinearLayout;

    .line 50
    .line 51
    iget-boolean v1, v0, Lgz1;->ζ:Z

    .line 52
    .line 53
    iget-object v2, v0, Lgz1;->α:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    const-string v1, "default"

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const-string v1, "spark_group"

    .line 67
    .line 68
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Landroid/view/View$DragShadowBuilder;

    .line 73
    .line 74
    invoke-direct {v2, v5}, Landroid/view/View$DragShadowBuilder;-><init>(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v1, v2, v0, v6}, Landroid/view/View;->startDragAndDrop(Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    :goto_0
    move v4, v6

    .line 82
    :goto_1
    return v4

    .line 83
    :pswitch_1
    check-cast v0, Landroid/widget/ImageView;

    .line 84
    .line 85
    check-cast v5, Lxd0;

    .line 86
    .line 87
    sget-object v1, Lbe0;->α:Lbe0;

    .line 88
    .line 89
    invoke-virtual {v1}, Lbe0;->ζ()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_2

    .line 94
    .line 95
    move v4, v6

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    sget-object v1, Lcn1;->α:Lcn1;

    .line 98
    .line 99
    iget-object v1, v5, Lxd0;->ε:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_3

    .line 106
    .line 107
    const-string v1, "\u8be5\u8054\u7cfb\u4eba"

    .line 108
    .line 109
    :cond_3
    iget-object v6, v5, Lxd0;->γ:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_4

    .line 116
    .line 117
    iget-object v6, v5, Lxd0;->δ:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_4

    .line 124
    .line 125
    iget-object v6, v5, Lxd0;->α:Ljava/lang/String;

    .line 126
    .line 127
    :cond_4
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_5

    .line 132
    .line 133
    move-object v6, v1

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const-string v7, "\n\u6296\u97f3\u53f7\uff1a"

    .line 136
    .line 137
    invoke-static {v1, v7, v6}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    :goto_2
    new-instance v7, Landroid/app/AlertDialog$Builder;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-direct {v7, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 148
    .line 149
    .line 150
    const-string v8, "\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 151
    .line 152
    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    const-string v7, "\u53d6\u6d88"

    .line 161
    .line 162
    invoke-virtual {v6, v7, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    new-instance v6, Ldd0;

    .line 167
    .line 168
    invoke-direct {v6, v5, v0, v1, v2}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    const-string v0, "\u9690\u85cf"

    .line 172
    .line 173
    invoke-virtual {v3, v0, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 178
    .line 179
    .line 180
    :goto_3
    return v4

    .line 181
    :pswitch_2
    check-cast v0, Landroid/app/Activity;

    .line 182
    .line 183
    check-cast v5, Lec1;

    .line 184
    .line 185
    sget-object v1, Lx01;->α:Lx01;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const v7, 0x7f0c0031

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v7, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v7, Landroid/app/AlertDialog$Builder;

    .line 202
    .line 203
    invoke-direct {v7, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    iget-object v9, v8, Lxx;->β:Ljava/lang/String;

    .line 219
    .line 220
    const/16 v10, 0x10

    .line 221
    .line 222
    invoke-static {v10, v0, v9}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 227
    .line 228
    .line 229
    const v9, 0x7f090082

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    iget-object v12, v8, Lxx;->γ:Ljava/lang/String;

    .line 237
    .line 238
    const/16 v13, 0xa

    .line 239
    .line 240
    invoke-static {v13, v0, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-virtual {v11, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 245
    .line 246
    .line 247
    const v11, 0x7f090083

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    check-cast v11, Landroid/widget/TextView;

    .line 255
    .line 256
    iget-object v12, v5, Lec1;->δ:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v8}, Lxn0;->о(Lxx;)I

    .line 262
    .line 263
    .line 264
    move-result v12

    .line 265
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    check-cast v9, Landroid/widget/TextView;

    .line 273
    .line 274
    invoke-static {v5}, Lxn0;->Е(Lec1;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v8}, Lxn0;->Б(Lxx;)I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 286
    .line 287
    .line 288
    const v9, 0x7f090080

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    check-cast v9, Landroid/widget/TextView;

    .line 296
    .line 297
    new-instance v11, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    iget-wide v14, v5, Lec1;->α:J

    .line 303
    .line 304
    new-instance v12, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    move-object/from16 p1, v3

    .line 307
    .line 308
    const-string v3, "\u4f1a\u8bdd\u77ed ID\uff1a"

    .line 309
    .line 310
    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v3, "\n"

    .line 317
    .line 318
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    iget-object v12, v5, Lec1;->ζ:Lsd;

    .line 329
    .line 330
    invoke-static {v12}, Lxn0;->э(Lsd;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    new-instance v14, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v15, "\u4eba\u5458\u89c4\u5219\uff1a"

    .line 337
    .line 338
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget-object v5, v5, Lec1;->η:Lid;

    .line 355
    .line 356
    if-nez v5, :cond_6

    .line 357
    .line 358
    const-string v2, "\u7f13\u5b58\u72b6\u6001\uff1a\u5c1a\u672a\u5237\u65b0"

    .line 359
    .line 360
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    :goto_4
    move-object/from16 v17, v8

    .line 364
    .line 365
    move-object v2, v11

    .line 366
    goto/16 :goto_e

    .line 367
    .line 368
    :cond_6
    iget-object v12, v5, Lid;->β:Lpd;

    .line 369
    .line 370
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    const/4 v14, 0x4

    .line 375
    const/4 v15, 0x2

    .line 376
    if-eqz v12, :cond_b

    .line 377
    .line 378
    if-eq v12, v4, :cond_a

    .line 379
    .line 380
    if-eq v12, v15, :cond_9

    .line 381
    .line 382
    if-eq v12, v2, :cond_8

    .line 383
    .line 384
    if-ne v12, v14, :cond_7

    .line 385
    .line 386
    const-string v12, "\u7f51\u7edc\u5931\u8d25"

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_7
    invoke-static {}, Lγ;->κ()V

    .line 390
    .line 391
    .line 392
    move v4, v6

    .line 393
    goto/16 :goto_f

    .line 394
    .line 395
    :cond_8
    const-string v12, "\u5f85\u5237\u65b0"

    .line 396
    .line 397
    goto :goto_5

    .line 398
    :cond_9
    const-string v12, "\u65e0\u8425\u5730"

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_a
    const-string v12, "\u65e0\u5c0f\u706b\u4eba"

    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_b
    const-string v12, "\u53ef\u7528"

    .line 405
    .line 406
    :goto_5
    new-instance v6, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    const-string v14, "\u7f13\u5b58\u72b6\u6001\uff1a"

    .line 409
    .line 410
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    iget-wide v13, v5, Lid;->δ:J

    .line 427
    .line 428
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 429
    .line 430
    .line 431
    move-result-object v12

    .line 432
    invoke-static {v12}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v12

    .line 436
    new-instance v13, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    const-string v14, "\u66f4\u65b0\u65f6\u95f4\uff1a"

    .line 439
    .line 440
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    iget-object v12, v5, Lid;->ε:Ljava/lang/Long;

    .line 457
    .line 458
    invoke-static {v12}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    new-instance v13, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    const-string v14, "\u6700\u8fd1\u6210\u719f\uff1a"

    .line 465
    .line 466
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    iget-object v12, v5, Lid;->ζ:Ljava/lang/Long;

    .line 483
    .line 484
    invoke-static {v12}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v12

    .line 488
    new-instance v13, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    const-string v14, "\u6700\u8fd1\u53ef\u6d47\uff1a"

    .line 491
    .line 492
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v12

    .line 505
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    iget-object v12, v5, Lid;->η:Ljava/lang/Long;

    .line 509
    .line 510
    invoke-static {v12}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v12

    .line 514
    new-instance v13, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string v14, "\u4e0b\u6b21\u72b6\u6001\u590d\u67e5\uff1a"

    .line 517
    .line 518
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v12

    .line 531
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    iget-object v5, v5, Lid;->γ:Lzd1;

    .line 535
    .line 536
    if-nez v5, :cond_c

    .line 537
    .line 538
    const-string v2, "\n\u5f53\u524d\u6ca1\u6709\u53ef\u5c55\u793a\u7684\u8425\u5730\u5feb\u7167"

    .line 539
    .line 540
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    goto/16 :goto_4

    .line 544
    .line 545
    :cond_c
    iget-object v12, v5, Lzd1;->ε:Ljava/util/List;

    .line 546
    .line 547
    iget-object v13, v5, Lzd1;->α:Ljava/lang/String;

    .line 548
    .line 549
    if-nez v13, :cond_d

    .line 550
    .line 551
    const-string v13, "\u672a\u63d0\u4f9b"

    .line 552
    .line 553
    :cond_d
    new-instance v14, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    const-string v6, "\n\u8425\u5730\u540d\u79f0\uff1a"

    .line 556
    .line 557
    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    iget-object v6, v5, Lzd1;->β:Ljava/lang/Integer;

    .line 574
    .line 575
    const-string v13, "\u672a\u77e5"

    .line 576
    .line 577
    if-nez v6, :cond_e

    .line 578
    .line 579
    move-object v6, v13

    .line 580
    :cond_e
    new-instance v14, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    const-string v2, "\u8425\u5730\u7b49\u7ea7\uff1a"

    .line 583
    .line 584
    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    iget-object v2, v5, Lzd1;->γ:Ljava/lang/String;

    .line 601
    .line 602
    if-nez v2, :cond_f

    .line 603
    .line 604
    move-object v2, v13

    .line 605
    :cond_f
    new-instance v6, Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v14, "\u7ecf\u9a8c\uff1a"

    .line 608
    .line 609
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    iget-object v2, v5, Lzd1;->η:Ljava/lang/String;

    .line 626
    .line 627
    if-nez v2, :cond_10

    .line 628
    .line 629
    move-object v2, v13

    .line 630
    :cond_10
    new-instance v6, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    const-string v14, "\u91d1\u5e01\uff1a"

    .line 633
    .line 634
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    iget-object v2, v5, Lzd1;->δ:Ljava/lang/Integer;

    .line 651
    .line 652
    if-nez v2, :cond_11

    .line 653
    .line 654
    move-object v2, v13

    .line 655
    :cond_11
    new-instance v6, Ljava/lang/StringBuilder;

    .line 656
    .line 657
    const-string v14, "\u5269\u4f59\u6d47\u6c34\u6b21\u6570\uff1a"

    .line 658
    .line 659
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    iget-object v2, v5, Lzd1;->κ:Ljava/lang/Integer;

    .line 676
    .line 677
    if-nez v2, :cond_12

    .line 678
    .line 679
    move-object v2, v13

    .line 680
    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 681
    .line 682
    const-string v14, "\u53cc\u500d\u6536\u76ca\u6b21\u6570\uff1a"

    .line 683
    .line 684
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    iget-object v2, v5, Lzd1;->λ:Ljava/lang/Integer;

    .line 701
    .line 702
    if-nez v2, :cond_13

    .line 703
    .line 704
    move-object v2, v13

    .line 705
    :cond_13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    const-string v14, "\u8bbf\u5ba2\u6570\u91cf\uff1a"

    .line 708
    .line 709
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    iget-object v2, v5, Lzd1;->μ:Ljava/lang/Boolean;

    .line 726
    .line 727
    if-eqz v2, :cond_15

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    if-eqz v2, :cond_14

    .line 734
    .line 735
    const-string v2, "\u662f"

    .line 736
    .line 737
    goto :goto_6

    .line 738
    :cond_14
    const-string v2, "\u5426"

    .line 739
    .line 740
    goto :goto_6

    .line 741
    :cond_15
    move-object v2, v13

    .line 742
    :goto_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    const-string v14, "\u9700\u8981\u91cd\u7f6e\uff1a"

    .line 745
    .line 746
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    move-object v2, v11

    .line 763
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 764
    .line 765
    .line 766
    move-result-wide v10

    .line 767
    invoke-virtual {v5}, Lzd1;->θ()Ljava/util/ArrayList;

    .line 768
    .line 769
    .line 770
    move-result-object v6

    .line 771
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    invoke-static {v5, v10, v11}, Lxn0;->Π(Lzd1;J)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    new-instance v11, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    const-string v14, "\u4f5c\u7269\u6982\u89c8\uff1a\u5df2\u79cd "

    .line 782
    .line 783
    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const-string v6, " \u5757 \u00b7 "

    .line 790
    .line 791
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v6

    .line 804
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    invoke-virtual {v5}, Lzd1;->ζ()Ljava/util/ArrayList;

    .line 812
    .line 813
    .line 814
    move-result-object v10

    .line 815
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 816
    .line 817
    .line 818
    move-result v10

    .line 819
    invoke-virtual {v5}, Lzd1;->β()Ljava/util/ArrayList;

    .line 820
    .line 821
    .line 822
    move-result-object v11

    .line 823
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 824
    .line 825
    .line 826
    move-result v11

    .line 827
    invoke-virtual {v5}, Lzd1;->γ()Ljava/util/ArrayList;

    .line 828
    .line 829
    .line 830
    move-result-object v14

    .line 831
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 832
    .line 833
    .line 834
    move-result v14

    .line 835
    invoke-virtual {v5}, Lzd1;->ε()Ljava/util/ArrayList;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 840
    .line 841
    .line 842
    move-result v5

    .line 843
    const-string v15, "\uff0c\u6210\u719f "

    .line 844
    .line 845
    const-string v4, "\uff0c\u751f\u957f "

    .line 846
    .line 847
    move-object/from16 v17, v8

    .line 848
    .line 849
    const-string v8, "\u5730\u5757\u7edf\u8ba1\uff1a\u5171 "

    .line 850
    .line 851
    invoke-static {v8, v6, v15, v10, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    const-string v6, "\uff0c\u7a7a\u95f2 "

    .line 856
    .line 857
    const-string v8, "\uff0c\u9501\u5b9a "

    .line 858
    .line 859
    invoke-static {v4, v11, v6, v14, v8}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 876
    .line 877
    .line 878
    move-result v3

    .line 879
    if-eqz v3, :cond_16

    .line 880
    .line 881
    const-string v3, "\n\u6ca1\u6709\u5730\u5757\u6570\u636e"

    .line 882
    .line 883
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    goto/16 :goto_e

    .line 887
    .line 888
    :cond_16
    sget-object v3, Lkd1;->α:Lkd1;

    .line 889
    .line 890
    invoke-virtual {v3}, Lkd1;->ε()Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    const/16 v6, 0xa

    .line 895
    .line 896
    invoke-static {v3, v6}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 897
    .line 898
    .line 899
    move-result v4

    .line 900
    invoke-static {v4}, Lex0;->Κ(I)I

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    const/16 v14, 0x10

    .line 905
    .line 906
    if-ge v4, v14, :cond_17

    .line 907
    .line 908
    move v10, v14

    .line 909
    goto :goto_7

    .line 910
    :cond_17
    move v10, v4

    .line 911
    :goto_7
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 912
    .line 913
    invoke-direct {v4, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 914
    .line 915
    .line 916
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 921
    .line 922
    .line 923
    move-result v5

    .line 924
    if-eqz v5, :cond_18

    .line 925
    .line 926
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v5

    .line 930
    move-object v8, v5

    .line 931
    check-cast v8, Lid1;

    .line 932
    .line 933
    iget v8, v8, Lid1;->α:I

    .line 934
    .line 935
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 936
    .line 937
    .line 938
    move-result-object v8

    .line 939
    invoke-interface {v4, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    goto :goto_8

    .line 943
    :cond_18
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    const/4 v5, 0x0

    .line 948
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 949
    .line 950
    .line 951
    move-result v8

    .line 952
    if-eqz v8, :cond_2b

    .line 953
    .line 954
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v8

    .line 958
    add-int/lit8 v10, v5, 0x1

    .line 959
    .line 960
    if-ltz v5, :cond_2a

    .line 961
    .line 962
    check-cast v8, Llc1;

    .line 963
    .line 964
    iget-object v5, v8, Llc1;->γ:Lmc1;

    .line 965
    .line 966
    iget-object v11, v8, Llc1;->κ:Ljava/lang/Integer;

    .line 967
    .line 968
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 969
    .line 970
    .line 971
    move-result v5

    .line 972
    if-eqz v5, :cond_1d

    .line 973
    .line 974
    const/4 v12, 0x1

    .line 975
    if-eq v5, v12, :cond_1c

    .line 976
    .line 977
    const/4 v12, 0x2

    .line 978
    if-eq v5, v12, :cond_1b

    .line 979
    .line 980
    const/4 v14, 0x3

    .line 981
    if-eq v5, v14, :cond_1a

    .line 982
    .line 983
    const/4 v15, 0x4

    .line 984
    if-ne v5, v15, :cond_19

    .line 985
    .line 986
    move-object v5, v13

    .line 987
    goto :goto_a

    .line 988
    :cond_19
    invoke-static {}, Lγ;->κ()V

    .line 989
    .line 990
    .line 991
    const/4 v4, 0x0

    .line 992
    goto/16 :goto_f

    .line 993
    .line 994
    :cond_1a
    const/4 v15, 0x4

    .line 995
    const-string v5, "\u5df2\u6210\u719f"

    .line 996
    .line 997
    goto :goto_a

    .line 998
    :cond_1b
    const/4 v14, 0x3

    .line 999
    const/4 v15, 0x4

    .line 1000
    const-string v5, "\u751f\u957f\u4e2d"

    .line 1001
    .line 1002
    goto :goto_a

    .line 1003
    :cond_1c
    const/4 v12, 0x2

    .line 1004
    const/4 v14, 0x3

    .line 1005
    const/4 v15, 0x4

    .line 1006
    const-string v5, "\u7a7a\u95f2"

    .line 1007
    .line 1008
    goto :goto_a

    .line 1009
    :cond_1d
    const/4 v12, 0x2

    .line 1010
    const/4 v14, 0x3

    .line 1011
    const/4 v15, 0x4

    .line 1012
    const-string v5, "\u9501\u5b9a"

    .line 1013
    .line 1014
    :goto_a
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    const-string v12, "\n\u5730\u5757 "

    .line 1017
    .line 1018
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    const-string v12, " \u00b7 "

    .line 1025
    .line 1026
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v5

    .line 1036
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    iget-object v5, v8, Llc1;->ι:Ljava/lang/Integer;

    .line 1040
    .line 1041
    if-nez v5, :cond_1e

    .line 1042
    .line 1043
    if-eqz v11, :cond_21

    .line 1044
    .line 1045
    :cond_1e
    const-string v6, "?"

    .line 1046
    .line 1047
    if-nez v5, :cond_1f

    .line 1048
    .line 1049
    move-object v5, v6

    .line 1050
    :cond_1f
    if-nez v11, :cond_20

    .line 1051
    .line 1052
    move-object v11, v6

    .line 1053
    :cond_20
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    const-string v12, " \u00b7 \u5750\u6807 "

    .line 1056
    .line 1057
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    .line 1063
    const-string v5, ","

    .line 1064
    .line 1065
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    :cond_21
    iget-object v5, v8, Llc1;->α:Ljava/lang/String;

    .line 1079
    .line 1080
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    const-string v11, "\n  \u6807\u8bc6\uff1a"

    .line 1083
    .line 1084
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v5

    .line 1094
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    iget-object v5, v8, Llc1;->δ:Ljava/lang/Integer;

    .line 1098
    .line 1099
    if-eqz v5, :cond_25

    .line 1100
    .line 1101
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1102
    .line 1103
    .line 1104
    move-result v6

    .line 1105
    if-lez v6, :cond_22

    .line 1106
    .line 1107
    goto :goto_b

    .line 1108
    :cond_22
    move-object/from16 v5, p1

    .line 1109
    .line 1110
    :goto_b
    if-eqz v5, :cond_25

    .line 1111
    .line 1112
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1113
    .line 1114
    .line 1115
    move-result v6

    .line 1116
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v5

    .line 1120
    check-cast v5, Lid1;

    .line 1121
    .line 1122
    if-eqz v5, :cond_23

    .line 1123
    .line 1124
    iget-object v5, v5, Lid1;->β:Ljava/lang/String;

    .line 1125
    .line 1126
    if-eqz v5, :cond_23

    .line 1127
    .line 1128
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v5

    .line 1132
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    if-eqz v5, :cond_23

    .line 1137
    .line 1138
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1139
    .line 1140
    .line 1141
    move-result v11

    .line 1142
    if-lez v11, :cond_23

    .line 1143
    .line 1144
    goto :goto_c

    .line 1145
    :cond_23
    move-object/from16 v5, p1

    .line 1146
    .line 1147
    :goto_c
    if-eqz v5, :cond_24

    .line 1148
    .line 1149
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1150
    .line 1151
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    .line 1157
    const-string v5, "\uff08#"

    .line 1158
    .line 1159
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    const-string v5, "\uff09"

    .line 1166
    .line 1167
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v5

    .line 1174
    goto :goto_d

    .line 1175
    :cond_24
    const-string v5, "\u79cd\u5b50 #"

    .line 1176
    .line 1177
    const-string v11, "\uff08\u540d\u79f0\u5f85\u83b7\u53d6\uff09"

    .line 1178
    .line 1179
    invoke-static {v5, v6, v11}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v5

    .line 1183
    goto :goto_d

    .line 1184
    :cond_25
    const-string v5, "\u65e0"

    .line 1185
    .line 1186
    :goto_d
    iget-object v6, v8, Llc1;->β:Ljava/lang/Integer;

    .line 1187
    .line 1188
    if-nez v6, :cond_26

    .line 1189
    .line 1190
    move-object v6, v13

    .line 1191
    :cond_26
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    const-string v12, "\n  \u79cd\u5b50\uff1a"

    .line 1194
    .line 1195
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    .line 1200
    .line 1201
    const-string v5, " \u00b7 \u7269\u54c1\uff1a"

    .line 1202
    .line 1203
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v5

    .line 1213
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    iget-object v5, v8, Llc1;->ε:Ljava/lang/Long;

    .line 1217
    .line 1218
    invoke-static {v5}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v5

    .line 1222
    const-string v6, "\n  \u64ad\u79cd\uff1a"

    .line 1223
    .line 1224
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v5

    .line 1228
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1229
    .line 1230
    .line 1231
    iget-object v5, v8, Llc1;->ζ:Ljava/lang/Long;

    .line 1232
    .line 1233
    invoke-static {v5}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v5

    .line 1237
    const-string v6, "\n  \u6210\u719f\uff1a"

    .line 1238
    .line 1239
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v5

    .line 1243
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1244
    .line 1245
    .line 1246
    iget-object v5, v8, Llc1;->λ:Ljava/lang/Long;

    .line 1247
    .line 1248
    if-nez v5, :cond_27

    .line 1249
    .line 1250
    move-object v5, v13

    .line 1251
    :cond_27
    iget-wide v11, v8, Llc1;->η:J

    .line 1252
    .line 1253
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    const-string v14, "\n  \u751f\u957f\u65f6\u957f\uff1a"

    .line 1256
    .line 1257
    invoke-direct {v6, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1261
    .line 1262
    .line 1263
    const-string v5, " \u79d2 \u00b7 \u6d47\u6c34\u8282\u7701\uff1a"

    .line 1264
    .line 1265
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1269
    .line 1270
    .line 1271
    const-string v5, " \u79d2"

    .line 1272
    .line 1273
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1281
    .line 1282
    .line 1283
    iget-object v5, v8, Llc1;->μ:Ljava/lang/Integer;

    .line 1284
    .line 1285
    if-nez v5, :cond_28

    .line 1286
    .line 1287
    move-object v5, v13

    .line 1288
    :cond_28
    iget-object v6, v8, Llc1;->ν:Ljava/lang/Long;

    .line 1289
    .line 1290
    invoke-static {v6}, Lxn0;->Ο(Ljava/lang/Long;)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v6

    .line 1294
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1295
    .line 1296
    const-string v12, "\n  \u5df2\u6d47\u6b21\u6570\uff1a"

    .line 1297
    .line 1298
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    const-string v5, " \u00b7 \u6700\u8fd1\u6d47\u6c34\uff1a"

    .line 1305
    .line 1306
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v5

    .line 1316
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    .line 1319
    iget-boolean v5, v8, Llc1;->θ:Z

    .line 1320
    .line 1321
    if-eqz v5, :cond_29

    .line 1322
    .line 1323
    const-string v5, "\n  \u5f53\u524d\u4f5c\u7269\u4e3a\u53cc\u500d\u6536\u76ca"

    .line 1324
    .line 1325
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    :cond_29
    move v5, v10

    .line 1329
    goto/16 :goto_9

    .line 1330
    .line 1331
    :cond_2a
    invoke-static {}, Lyh;->х()V

    .line 1332
    .line 1333
    .line 1334
    throw p1

    .line 1335
    :cond_2b
    :goto_e
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-static/range {v17 .. v17}, Lxn0;->Б(Lxx;)I

    .line 1343
    .line 1344
    .line 1345
    move-result v2

    .line 1346
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1347
    .line 1348
    .line 1349
    const v2, 0x7f09007f

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    check-cast v3, Landroid/widget/TextView;

    .line 1357
    .line 1358
    invoke-static/range {v17 .. v17}, Lxn0;->Б(Lxx;)I

    .line 1359
    .line 1360
    .line 1361
    move-result v4

    .line 1362
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    new-instance v2, Lsa;

    .line 1370
    .line 1371
    const/16 v6, 0xa

    .line 1372
    .line 1373
    invoke-direct {v2, v7, v6}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 1380
    .line 1381
    .line 1382
    const v1, 0x3f4ccccd    # 0.8f

    .line 1383
    .line 1384
    .line 1385
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    const v2, 0x3f6b851f    # 0.92f

    .line 1390
    .line 1391
    .line 1392
    invoke-static {v0, v7, v2, v1}, Lxn0;->φ(Landroid/app/Activity;Landroid/app/AlertDialog;FLjava/lang/Float;)V

    .line 1393
    .line 1394
    .line 1395
    const/4 v4, 0x1

    .line 1396
    :goto_f
    return v4

    .line 1397
    :pswitch_3
    check-cast v0, Lcom/example/dyhelper/ui/AboutActivity;

    .line 1398
    .line 1399
    check-cast v5, Lκ;

    .line 1400
    .line 1401
    sget v1, Lcom/example/dyhelper/ui/AboutActivity;->ζ:I

    .line 1402
    .line 1403
    iget-object v1, v5, Lκ;->α:Ljava/lang/String;

    .line 1404
    .line 1405
    iget-object v2, v5, Lκ;->β:Ljava/lang/String;

    .line 1406
    .line 1407
    const-string v3, ": "

    .line 1408
    .line 1409
    invoke-static {v1, v3, v2}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v1

    .line 1413
    const-string v2, "clipboard"

    .line 1414
    .line 1415
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    check-cast v2, Landroid/content/ClipboardManager;

    .line 1423
    .line 1424
    const-string v3, "DYHelper"

    .line 1425
    .line 1426
    invoke-static {v3, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v3

    .line 1430
    invoke-virtual {v2, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 1431
    .line 1432
    .line 1433
    const-string v2, "\u5df2\u590d\u5236: "

    .line 1434
    .line 1435
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v1

    .line 1439
    const/4 v2, 0x0

    .line 1440
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1445
    .line 1446
    .line 1447
    const/16 v16, 0x1

    .line 1448
    .line 1449
    return v16

    .line 1450
    nop

    .line 1451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
