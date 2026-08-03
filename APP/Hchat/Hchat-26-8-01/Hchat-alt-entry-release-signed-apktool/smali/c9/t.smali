.class public final synthetic Lc9/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput v0, p0, Lc9/t;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p2, p0, Lc9/t;->i:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 13
    iput p3, p0, Lc9/t;->g:I

    iput-object p1, p0, Lc9/t;->h:Landroid/app/Activity;

    iput-object p2, p0, Lc9/t;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lc9/t;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v2

    .line 21
    :goto_0
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_1
    if-eqz v1, :cond_e

    .line 30
    .line 31
    invoke-static {v1}, Luf/d;->n(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, p0, Lc9/t;->i:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-static {v3, v0, v4}, Luf/d;->i(Landroid/view/View;Landroid/app/Activity;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_7

    .line 43
    .line 44
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v3}, Luf/d;->k(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    const/4 v6, 0x2

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    move-object v7, v5

    .line 73
    check-cast v7, Landroid/view/ViewGroup;

    .line 74
    .line 75
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-lt v7, v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_5

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    move-object v3, v2

    .line 108
    check-cast v3, Landroid/view/ViewGroup;

    .line 109
    .line 110
    invoke-static {v3}, Luf/d;->L(Landroid/view/ViewGroup;)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    move-object v7, v5

    .line 123
    check-cast v7, Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-static {v7}, Luf/d;->L(Landroid/view/ViewGroup;)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v3, v7}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-gez v8, :cond_8

    .line 138
    .line 139
    move-object v2, v5

    .line 140
    move-object v3, v7

    .line 141
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-nez v5, :cond_7

    .line 146
    .line 147
    :goto_3
    check-cast v2, Landroid/view/ViewGroup;

    .line 148
    .line 149
    if-eqz v2, :cond_e

    .line 150
    .line 151
    new-instance v1, Landroid/widget/LinearLayout;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 158
    .line 159
    .line 160
    const/16 v5, 0x10

    .line 161
    .line 162
    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 163
    .line 164
    .line 165
    const/high16 v5, 0x42600000    # 56.0f

    .line 166
    .line 167
    invoke-static {v0, v5}, Luf/d;->m(Landroid/content/Context;F)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-virtual {v1, v5}, Landroid/view/View;->setMinimumHeight(I)V

    .line 172
    .line 173
    .line 174
    const/high16 v5, 0x41800000    # 16.0f

    .line 175
    .line 176
    invoke-static {v0, v5}, Luf/d;->m(Landroid/content/Context;F)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    const/high16 v8, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-static {v0, v8}, Luf/d;->m(Landroid/content/Context;F)I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v0, v5}, Luf/d;->m(Landroid/content/Context;F)I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    invoke-static {v0, v8}, Luf/d;->m(Landroid/content/Context;F)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    invoke-virtual {v1, v7, v9, v10, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 195
    .line 196
    .line 197
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 198
    .line 199
    const/4 v8, -0x1

    .line 200
    const/4 v9, -0x2

    .line 201
    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 205
    .line 206
    .line 207
    new-instance v7, Landroid/widget/TextView;

    .line 208
    .line 209
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 213
    .line 214
    .line 215
    const/4 v5, 0x1

    .line 216
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 220
    .line 221
    .line 222
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 223
    .line 224
    const/high16 v8, 0x3f800000    # 1.0f

    .line 225
    .line 226
    invoke-direct {v6, v3, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    .line 231
    .line 232
    new-instance v6, Landroid/widget/TextView;

    .line 233
    .line 234
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 235
    .line 236
    .line 237
    const-string v8, "\u203a"

    .line 238
    .line 239
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    const/high16 v8, 0x41c00000    # 24.0f

    .line 243
    .line 244
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 245
    .line 246
    .line 247
    const/16 v10, 0x11

    .line 248
    .line 249
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 250
    .line 251
    .line 252
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 253
    .line 254
    invoke-static {v0, v8}, Luf/d;->m(Landroid/content/Context;F)I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    invoke-direct {v10, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v1, v0, v4}, Luf/d;->i(Landroid/view/View;Landroid/app/Activity;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    move v4, v3

    .line 278
    :goto_4
    if-lt v4, v0, :cond_a

    .line 279
    .line 280
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-lez v0, :cond_9

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_9
    move v5, v3

    .line 288
    goto :goto_6

    .line 289
    :cond_a
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance v7, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    new-instance v8, Lnb/a;

    .line 302
    .line 303
    const/16 v9, 0x13

    .line 304
    .line 305
    invoke-direct {v8, v7, v9}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 306
    .line 307
    .line 308
    invoke-static {v6, v3, v8}, Luf/d;->l(Landroid/view/View;ILfg/l;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    instance-of v8, v6, Landroid/widget/AbsListView;

    .line 316
    .line 317
    if-nez v8, :cond_d

    .line 318
    .line 319
    instance-of v8, v6, Landroid/widget/ScrollView;

    .line 320
    .line 321
    if-nez v8, :cond_d

    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    const-string v8, "RecyclerView"

    .line 332
    .line 333
    invoke-static {v6, v8, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_b

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_b
    const-string v6, "\u5907\u6ce8"

    .line 341
    .line 342
    invoke-static {v7, v6, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    if-nez v6, :cond_d

    .line 347
    .line 348
    const-string v6, "\u6807\u7b7e"

    .line 349
    .line 350
    invoke-static {v7, v6, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-nez v6, :cond_d

    .line 355
    .line 356
    const-string v6, "\u7fa4\u804a\u540d\u79f0"

    .line 357
    .line 358
    invoke-static {v7, v6, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-nez v6, :cond_d

    .line 363
    .line 364
    const-string v6, "\u67e5\u627e\u804a\u5929\u8bb0\u5f55"

    .line 365
    .line 366
    invoke-static {v7, v6, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_c

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_d
    :goto_5
    move v5, v4

    .line 377
    :goto_6
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    invoke-static {v5, v3, v0}, Lr9/e0;->r(III)I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-virtual {v2, v1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 390
    .line 391
    .line 392
    :cond_e
    :goto_7
    return-void

    .line 393
    :pswitch_0
    const/4 v0, 0x0

    .line 394
    new-array v1, v0, [Ljava/lang/Object;

    .line 395
    .line 396
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 397
    .line 398
    const-string v3, "getPreferenceScreen"

    .line 399
    .line 400
    invoke-static {v2, v3, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    if-eqz v1, :cond_1f

    .line 405
    .line 406
    const-string v3, "room_name"

    .line 407
    .line 408
    invoke-static {v1, v3}, Luf/d;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    const/4 v4, 0x0

    .line 413
    if-eqz v3, :cond_13

    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    new-instance v6, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    :goto_8
    if-eqz v5, :cond_f

    .line 425
    .line 426
    const-class v7, Ljava/lang/Object;

    .line 427
    .line 428
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-nez v7, :cond_f

    .line 433
    .line 434
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-static {v6, v7}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    goto :goto_8

    .line 446
    :cond_f
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-eqz v6, :cond_12

    .line 455
    .line 456
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    move-object v7, v6

    .line 461
    check-cast v7, Ljava/lang/reflect/Method;

    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    array-length v8, v8

    .line 471
    if-nez v8, :cond_10

    .line 472
    .line 473
    const-class v8, Ljava/lang/CharSequence;

    .line 474
    .line 475
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    if-eqz v8, :cond_10

    .line 484
    .line 485
    new-array v8, v0, [Ljava/lang/Object;

    .line 486
    .line 487
    invoke-static {v7, v3, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    if-eqz v7, :cond_11

    .line 492
    .line 493
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    goto :goto_9

    .line 498
    :cond_11
    move-object v7, v4

    .line 499
    :goto_9
    const-string v8, "\u7fa4\u804a\u540d\u79f0"

    .line 500
    .line 501
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-eqz v7, :cond_10

    .line 506
    .line 507
    goto :goto_a

    .line 508
    :cond_12
    move-object v6, v4

    .line 509
    :goto_a
    check-cast v6, Ljava/lang/reflect/Method;

    .line 510
    .line 511
    goto :goto_b

    .line 512
    :cond_13
    move-object v6, v4

    .line 513
    :goto_b
    const-string v3, "hchat_profile_id"

    .line 514
    .line 515
    invoke-static {v1, v3}, Luf/d;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iget-object v7, p0, Lc9/t;->i:Ljava/lang/String;

    .line 520
    .line 521
    if-eqz v5, :cond_14

    .line 522
    .line 523
    invoke-static {v5, v7, v6}, Luf/d;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 524
    .line 525
    .line 526
    invoke-static {v5, v2, v7}, Luf/d;->g(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v1}, Luf/d;->H(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    invoke-static {v2, v7, v0}, Luf/d;->h(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_13

    .line 536
    .line 537
    :cond_14
    const-string v5, "com.tencent.mm.ui.base.preference.Preference"

    .line 538
    .line 539
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-static {v5, v8}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    if-eqz v5, :cond_1f

    .line 548
    .line 549
    const-class v8, Landroid/content/Context;

    .line 550
    .line 551
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    invoke-static {v5, v8}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    invoke-static {v5, v8}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    if-eqz v5, :cond_1f

    .line 568
    .line 569
    const-string v8, "q"

    .line 570
    .line 571
    invoke-static {v5, v8, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    const-class v9, Ljava/lang/String;

    .line 579
    .line 580
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    move-result-object v9

    .line 584
    const-string v10, "C"

    .line 585
    .line 586
    invoke-static {v8, v10, v9}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    if-eqz v8, :cond_15

    .line 591
    .line 592
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-static {v8, v5, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    :cond_15
    invoke-static {v5, v7, v6}, Luf/d;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 600
    .line 601
    .line 602
    invoke-static {v5, v2, v7}, Luf/d;->g(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    move v3, v0

    .line 606
    :goto_c
    const/4 v6, 0x3

    .line 607
    sget-object v8, Lva/c;->f:[Ljava/lang/String;

    .line 608
    .line 609
    if-lt v3, v6, :cond_16

    .line 610
    .line 611
    move-object v9, v4

    .line 612
    goto :goto_d

    .line 613
    :cond_16
    aget-object v9, v8, v3

    .line 614
    .line 615
    invoke-static {v1, v9}, Luf/d;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v9

    .line 619
    if-eqz v9, :cond_1e

    .line 620
    .line 621
    :goto_d
    if-nez v9, :cond_18

    .line 622
    .line 623
    :cond_17
    move-object v3, v4

    .line 624
    goto :goto_e

    .line 625
    :cond_18
    invoke-static {v9}, Luf/d;->J(Ljava/lang/Object;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    if-eqz v3, :cond_17

    .line 630
    .line 631
    invoke-static {v1, v3}, Luf/d;->I(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    :goto_e
    if-eqz v3, :cond_19

    .line 636
    .line 637
    goto :goto_11

    .line 638
    :cond_19
    move v3, v0

    .line 639
    :goto_f
    if-ge v3, v6, :cond_1b

    .line 640
    .line 641
    aget-object v9, v8, v3

    .line 642
    .line 643
    invoke-static {v1, v9}, Luf/d;->I(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    if-eqz v9, :cond_1a

    .line 648
    .line 649
    move-object v4, v9

    .line 650
    goto :goto_10

    .line 651
    :cond_1a
    add-int/lit8 v3, v3, 0x1

    .line 652
    .line 653
    goto :goto_f

    .line 654
    :cond_1b
    :goto_10
    move-object v3, v4

    .line 655
    :goto_11
    if-eqz v3, :cond_1c

    .line 656
    .line 657
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    invoke-static {v1, v3, v5}, Luf/d;->B(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    if-eqz v3, :cond_1c

    .line 666
    .line 667
    goto :goto_12

    .line 668
    :cond_1c
    invoke-static {v1, v0, v5}, Luf/d;->B(Ljava/lang/Object;ILjava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    if-eqz v3, :cond_1d

    .line 673
    .line 674
    :goto_12
    invoke-static {v1}, Luf/d;->H(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    invoke-static {v2, v7, v0}, Luf/d;->h(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 678
    .line 679
    .line 680
    goto :goto_13

    .line 681
    :cond_1d
    const-string v0, "[Hchat:ProfileId] \u7fa4\u804a ID Preference \u63d2\u5165\u5931\u8d25"

    .line 682
    .line 683
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    goto :goto_13

    .line 687
    :cond_1e
    add-int/lit8 v3, v3, 0x1

    .line 688
    .line 689
    goto :goto_c

    .line 690
    :cond_1f
    :goto_13
    return-void

    .line 691
    :pswitch_1
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 692
    .line 693
    const/4 v1, 0x0

    .line 694
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 695
    .line 696
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :pswitch_2
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 705
    .line 706
    const/4 v1, 0x0

    .line 707
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 708
    .line 709
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_3
    iget-object v0, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 718
    .line 719
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    const/4 v1, 0x0

    .line 724
    iget-object v2, p0, Lc9/t;->i:Ljava/lang/String;

    .line 725
    .line 726
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :pswitch_4
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 735
    .line 736
    const/4 v1, 0x0

    .line 737
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 738
    .line 739
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 744
    .line 745
    .line 746
    return-void

    .line 747
    :pswitch_5
    iget-object v0, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 748
    .line 749
    if-eqz v0, :cond_20

    .line 750
    .line 751
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-nez v1, :cond_20

    .line 756
    .line 757
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-nez v1, :cond_20

    .line 762
    .line 763
    const/4 v1, 0x1

    .line 764
    iget-object v2, p0, Lc9/t;->i:Ljava/lang/String;

    .line 765
    .line 766
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 771
    .line 772
    .line 773
    :cond_20
    return-void

    .line 774
    :pswitch_6
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 775
    .line 776
    const/4 v1, 0x0

    .line 777
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 778
    .line 779
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 784
    .line 785
    .line 786
    return-void

    .line 787
    :pswitch_7
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 788
    .line 789
    const/4 v1, 0x0

    .line 790
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 791
    .line 792
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 797
    .line 798
    .line 799
    return-void

    .line 800
    :pswitch_8
    iget-object v0, p0, Lc9/t;->i:Ljava/lang/String;

    .line 801
    .line 802
    const/4 v1, 0x0

    .line 803
    iget-object v2, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 804
    .line 805
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 810
    .line 811
    .line 812
    return-void

    .line 813
    :pswitch_9
    iget-object v0, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 814
    .line 815
    invoke-static {v0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    if-eqz v2, :cond_22

    .line 828
    .line 829
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    move-object v3, v2

    .line 834
    check-cast v3, Lc9/a;

    .line 835
    .line 836
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 837
    .line 838
    invoke-static {v3}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    iget-object v4, p0, Lc9/t;->i:Ljava/lang/String;

    .line 843
    .line 844
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-eqz v3, :cond_21

    .line 849
    .line 850
    goto :goto_14

    .line 851
    :cond_22
    const/4 v2, 0x0

    .line 852
    :goto_14
    check-cast v2, Lc9/a;

    .line 853
    .line 854
    if-eqz v2, :cond_23

    .line 855
    .line 856
    iget-object v1, v2, Lc9/a;->a:Ljava/lang/String;

    .line 857
    .line 858
    if-eqz v1, :cond_23

    .line 859
    .line 860
    invoke-static {v0, v1}, Lc9/d2;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    :cond_23
    return-void

    .line 864
    :pswitch_a
    iget-object v0, p0, Lc9/t;->h:Landroid/app/Activity;

    .line 865
    .line 866
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    if-nez v1, :cond_24

    .line 871
    .line 872
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    if-nez v1, :cond_24

    .line 877
    .line 878
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    const/4 v1, 0x0

    .line 883
    iget-object v2, p0, Lc9/t;->i:Ljava/lang/String;

    .line 884
    .line 885
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 890
    .line 891
    .line 892
    :cond_24
    return-void

    .line 893
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
