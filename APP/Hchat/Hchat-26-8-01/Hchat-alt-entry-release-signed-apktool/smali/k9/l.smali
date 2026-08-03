.class public final synthetic Lk9/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lk9/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lk9/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lk9/l;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lk9/l;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk9/l;->a:I

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v9, 0x11

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    const/16 v13, 0x8

    .line 11
    .line 12
    const/4 v15, 0x1

    .line 13
    iget-object v3, v0, Lk9/l;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v14, v0, Lk9/l;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v4, v0, Lk9/l;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v14, Lr9/f0;

    .line 23
    .line 24
    check-cast v3, Lr9/d0;

    .line 25
    .line 26
    iget v1, v14, Lr9/f0;->a:I

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v3, v4, v1, v15}, Lr9/d0;->X(Ljava/lang/Object;Ljava/lang/Integer;Z)Lr9/f0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v14, v1, Lr9/f0;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v14}, Lr9/d0;->L0(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v18

    .line 53
    if-eqz v18, :cond_0

    .line 54
    .line 55
    iget-object v14, v1, Lr9/f0;->g:Ljava/lang/String;

    .line 56
    .line 57
    :cond_0
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v18

    .line 61
    if-eqz v18, :cond_1

    .line 62
    .line 63
    iget-object v14, v1, Lr9/f0;->h:Ljava/lang/String;

    .line 64
    .line 65
    :cond_1
    iget-object v5, v3, Lr9/d0;->c:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    const-string v12, "message_details_format_content"

    .line 68
    .line 69
    invoke-interface {v5, v12, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    invoke-static {v14}, Lr9/d0;->U(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-object v5, v14

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :goto_0
    const-string v5, "><"

    .line 85
    .line 86
    const-string v12, ">\n<"

    .line 87
    .line 88
    invoke-static {v14, v5, v12, v10}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :goto_1
    new-instance v12, Landroid/widget/LinearLayout;

    .line 93
    .line 94
    invoke-direct {v12, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 98
    .line 99
    .line 100
    const/high16 v6, 0x41000000    # 8.0f

    .line 101
    .line 102
    invoke-static {v4, v6}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    const/high16 v6, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-static {v4, v6}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    invoke-virtual {v12, v7, v8, v7, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 113
    .line 114
    .line 115
    new-instance v7, Landroid/widget/LinearLayout;

    .line 116
    .line 117
    invoke-direct {v7, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 121
    .line 122
    .line 123
    const/16 v8, 0x10

    .line 124
    .line 125
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 126
    .line 127
    .line 128
    new-instance v8, Landroid/widget/TextView;

    .line 129
    .line 130
    invoke-direct {v8, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    const/high16 v6, 0x41300000    # 11.0f

    .line 134
    .line 135
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 136
    .line 137
    .line 138
    const v6, -0x777778

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    .line 143
    .line 144
    const-string v6, "\u641c\u7d22"

    .line 145
    .line 146
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    new-instance v15, Landroid/widget/TextView;

    .line 150
    .line 151
    invoke-direct {v15, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    const-string v10, "\u00d7"

    .line 155
    .line 156
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    const/high16 v10, 0x41800000    # 16.0f

    .line 160
    .line 161
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v15, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 165
    .line 166
    .line 167
    const/16 v9, 0x96

    .line 168
    .line 169
    const/16 v10, 0xf3

    .line 170
    .line 171
    const/16 v11, 0x21

    .line 172
    .line 173
    invoke-static {v11, v9, v10}, Landroid/graphics/Color;->rgb(III)I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    invoke-virtual {v15, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v13}, Landroid/view/View;->setVisibility(I)V

    .line 181
    .line 182
    .line 183
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 184
    .line 185
    const/high16 v10, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v13, -0x2

    .line 189
    invoke-direct {v9, v11, v13, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    .line 194
    .line 195
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    .line 197
    const/high16 v11, 0x42200000    # 40.0f

    .line 198
    .line 199
    invoke-static {v4, v11}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    invoke-direct {v9, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v15, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    .line 208
    .line 209
    new-instance v9, Landroid/widget/LinearLayout;

    .line 210
    .line 211
    invoke-direct {v9, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    const/4 v11, 0x1

    .line 215
    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 216
    .line 217
    .line 218
    const/16 v11, 0x8

    .line 219
    .line 220
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    const/high16 v11, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-static {v4, v11}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    const/4 v11, 0x0

    .line 230
    invoke-virtual {v9, v11, v13, v11, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    new-instance v7, Landroid/widget/LinearLayout;

    .line 237
    .line 238
    invoke-direct {v7, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 242
    .line 243
    .line 244
    const/16 v11, 0x10

    .line 245
    .line 246
    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 247
    .line 248
    .line 249
    new-instance v11, Landroid/widget/EditText;

    .line 250
    .line 251
    invoke-direct {v11, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 255
    .line 256
    .line 257
    const/4 v6, 0x1

    .line 258
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 259
    .line 260
    .line 261
    const/high16 v13, 0x41400000    # 12.0f

    .line 262
    .line 263
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 264
    .line 265
    .line 266
    new-instance v10, Landroid/widget/EditText;

    .line 267
    .line 268
    invoke-direct {v10, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    const-string v13, "\u66ff\u6362\u4e3a"

    .line 272
    .line 273
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 277
    .line 278
    .line 279
    const/high16 v6, 0x41400000    # 12.0f

    .line 280
    .line 281
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 282
    .line 283
    .line 284
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 285
    .line 286
    move-object/from16 v35, v14

    .line 287
    .line 288
    const/4 v0, -0x2

    .line 289
    const/4 v13, 0x0

    .line 290
    const/high16 v14, 0x3f800000    # 1.0f

    .line 291
    .line 292
    invoke-direct {v6, v13, v0, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 296
    .line 297
    .line 298
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 299
    .line 300
    invoke-direct {v6, v13, v0, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v10, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Landroid/widget/LinearLayout;

    .line 310
    .line 311
    invoke-direct {v0, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 315
    .line 316
    .line 317
    const/16 v6, 0x10

    .line 318
    .line 319
    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 320
    .line 321
    .line 322
    const-string v6, "\u4e0a\u4e00\u4e2a"

    .line 323
    .line 324
    invoke-static {v4, v3, v6}, Lr9/d0;->F0(Landroid/content/Context;Lr9/d0;Ljava/lang/String;)Landroid/widget/TextView;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    const-string v7, "\u4e0b\u4e00\u4e2a"

    .line 329
    .line 330
    invoke-static {v4, v3, v7}, Lr9/d0;->F0(Landroid/content/Context;Lr9/d0;Ljava/lang/String;)Landroid/widget/TextView;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    const-string v14, "\u66ff\u6362"

    .line 335
    .line 336
    invoke-static {v4, v3, v14}, Lr9/d0;->F0(Landroid/content/Context;Lr9/d0;Ljava/lang/String;)Landroid/widget/TextView;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    const-string v13, "\u5168\u90e8\u66ff\u6362"

    .line 341
    .line 342
    invoke-static {v4, v3, v13}, Lr9/d0;->F0(Landroid/content/Context;Lr9/d0;Ljava/lang/String;)Landroid/widget/TextView;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    move-object/from16 v29, v3

    .line 347
    .line 348
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 349
    .line 350
    move-object/from16 v27, v8

    .line 351
    .line 352
    move-object/from16 v28, v10

    .line 353
    .line 354
    move-object/from16 v30, v15

    .line 355
    .line 356
    const/high16 v8, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v10, 0x0

    .line 359
    const/4 v15, -0x2

    .line 360
    invoke-direct {v3, v10, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 364
    .line 365
    .line 366
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 367
    .line 368
    invoke-direct {v3, v10, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 372
    .line 373
    .line 374
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 375
    .line 376
    invoke-direct {v3, v10, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 380
    .line 381
    .line 382
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 383
    .line 384
    invoke-direct {v3, v10, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v1}, Lr9/d0;->f(Lr9/f0;)Ll8/c;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    const/4 v3, 0x2

    .line 405
    if-eq v0, v3, :cond_7

    .line 406
    .line 407
    const/4 v3, 0x3

    .line 408
    if-eq v0, v3, :cond_6

    .line 409
    .line 410
    iget-object v0, v1, Lr9/f0;->i:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v0}, Lr9/d0;->f0(Ljava/lang/String;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    new-instance v3, Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v8

    .line 429
    if-eqz v8, :cond_8

    .line 430
    .line 431
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    move-object v10, v8

    .line 436
    check-cast v10, Ljava/lang/String;

    .line 437
    .line 438
    const-string v15, "announcement@all"

    .line 439
    .line 440
    invoke-static {v10, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v15

    .line 444
    if-nez v15, :cond_4

    .line 445
    .line 446
    const-string v15, "notify@all"

    .line 447
    .line 448
    invoke-static {v10, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    if-eqz v10, :cond_5

    .line 453
    .line 454
    goto :goto_2

    .line 455
    :cond_5
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    goto :goto_2

    .line 459
    :cond_6
    const-string v0, "\u7fa4\u516c\u544a\u5168\u4f53"

    .line 460
    .line 461
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    goto :goto_3

    .line 466
    :cond_7
    const-string v0, "@\u6240\u6709\u4eba\uff08\u5168\u4f53\u7fa4\u6210\u5458\uff09"

    .line 467
    .line 468
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    :cond_8
    :goto_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_b

    .line 477
    .line 478
    new-instance v0, Landroid/widget/TextView;

    .line 479
    .line 480
    invoke-direct {v0, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 481
    .line 482
    .line 483
    new-instance v8, Ljava/lang/StringBuilder;

    .line 484
    .line 485
    const-string v10, "\u827e\u7279\u5bf9\u8c61"

    .line 486
    .line 487
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v15

    .line 498
    if-eqz v15, :cond_9

    .line 499
    .line 500
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v15

    .line 504
    check-cast v15, Ljava/lang/String;

    .line 505
    .line 506
    move-object/from16 v21, v3

    .line 507
    .line 508
    const/16 v3, 0xa

    .line 509
    .line 510
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    move-object/from16 v3, v21

    .line 517
    .line 518
    goto :goto_4

    .line 519
    :cond_9
    move-object/from16 v21, v3

    .line 520
    .line 521
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    .line 527
    .line 528
    const/4 v3, 0x1

    .line 529
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 530
    .line 531
    .line 532
    const/high16 v8, 0x41500000    # 13.0f

    .line 533
    .line 534
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 535
    .line 536
    .line 537
    const v8, -0x777778

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 544
    .line 545
    .line 546
    const/high16 v8, 0x40800000    # 4.0f

    .line 547
    .line 548
    invoke-static {v4, v8}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    const/high16 v10, 0x41000000    # 8.0f

    .line 553
    .line 554
    invoke-static {v4, v10}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 555
    .line 556
    .line 557
    move-result v10

    .line 558
    const/4 v15, 0x0

    .line 559
    invoke-virtual {v0, v15, v8, v15, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 560
    .line 561
    .line 562
    new-instance v8, Landroid/widget/ScrollView;

    .line 563
    .line 564
    invoke-direct {v8, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 565
    .line 566
    .line 567
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    .line 568
    .line 569
    .line 570
    move-result v10

    .line 571
    const/4 v15, 0x4

    .line 572
    if-le v10, v15, :cond_a

    .line 573
    .line 574
    move v10, v3

    .line 575
    goto :goto_5

    .line 576
    :cond_a
    const/4 v10, 0x0

    .line 577
    :goto_5
    invoke-virtual {v8, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v8, v3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 581
    .line 582
    .line 583
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 584
    .line 585
    const/4 v10, -0x1

    .line 586
    const/4 v15, -0x2

    .line 587
    invoke-direct {v3, v10, v15}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v8, v0, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 591
    .line 592
    .line 593
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 594
    .line 595
    const/high16 v3, 0x42f00000    # 120.0f

    .line 596
    .line 597
    invoke-static {v4, v3}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v10

    .line 605
    int-to-float v10, v10

    .line 606
    const/high16 v15, 0x41a00000    # 20.0f

    .line 607
    .line 608
    mul-float/2addr v10, v15

    .line 609
    const/high16 v15, 0x41f00000    # 30.0f

    .line 610
    .line 611
    add-float/2addr v10, v15

    .line 612
    invoke-static {v4, v10}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 613
    .line 614
    .line 615
    move-result v10

    .line 616
    invoke-static {v3, v10}, Ljava/lang/Math;->min(II)I

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    const/4 v10, -0x1

    .line 621
    invoke-direct {v0, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 625
    .line 626
    .line 627
    :cond_b
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    const/16 v3, 0x258

    .line 632
    .line 633
    if-le v0, v3, :cond_c

    .line 634
    .line 635
    const/high16 v0, 0x44340000    # 720.0f

    .line 636
    .line 637
    invoke-static {v4, v0}, Lr9/d0;->l(Landroid/content/Context;F)I

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 650
    .line 651
    int-to-float v3, v3

    .line 652
    const v8, 0x3f47ae14    # 0.78f

    .line 653
    .line 654
    .line 655
    mul-float/2addr v3, v8

    .line 656
    float-to-int v3, v3

    .line 657
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    goto :goto_6

    .line 662
    :cond_c
    const/4 v0, -0x2

    .line 663
    :goto_6
    new-instance v3, Landroid/widget/TextView;

    .line 664
    .line 665
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 669
    .line 670
    .line 671
    const/4 v8, 0x1

    .line 672
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 673
    .line 674
    .line 675
    const/high16 v10, 0x41900000    # 18.0f

    .line 676
    .line 677
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 678
    .line 679
    .line 680
    sget-object v15, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 681
    .line 682
    invoke-virtual {v3, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 686
    .line 687
    .line 688
    const/4 v10, 0x0

    .line 689
    invoke-virtual {v3, v10, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 690
    .line 691
    .line 692
    new-instance v8, Landroid/widget/ScrollView;

    .line 693
    .line 694
    invoke-direct {v8, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v8, v10}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v8, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 701
    .line 702
    .line 703
    const/4 v10, 0x1

    .line 704
    invoke-virtual {v8, v10}, Landroid/view/View;->setOverScrollMode(I)V

    .line 705
    .line 706
    .line 707
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    .line 708
    .line 709
    move-object/from16 v36, v1

    .line 710
    .line 711
    move-object/from16 v19, v9

    .line 712
    .line 713
    const/4 v1, -0x1

    .line 714
    const/4 v9, -0x2

    .line 715
    invoke-direct {v10, v1, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v8, v3, v10}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 719
    .line 720
    .line 721
    new-instance v1, Landroid/widget/EditText;

    .line 722
    .line 723
    invoke-direct {v1, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 727
    .line 728
    .line 729
    const/4 v10, 0x0

    .line 730
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 734
    .line 735
    .line 736
    const/16 v9, 0xe

    .line 737
    .line 738
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setMinLines(I)V

    .line 739
    .line 740
    .line 741
    const/16 v9, 0x18

    .line 742
    .line 743
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 744
    .line 745
    .line 746
    const/high16 v9, 0x41900000    # 18.0f

    .line 747
    .line 748
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 752
    .line 753
    .line 754
    const/4 v9, 0x0

    .line 755
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1, v10, v10, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 759
    .line 760
    .line 761
    const/4 v9, 0x1

    .line 762
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v1, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1, v9}, Landroid/view/View;->setOverScrollMode(I)V

    .line 769
    .line 770
    .line 771
    const v9, 0xa0001

    .line 772
    .line 773
    .line 774
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setInputType(I)V

    .line 775
    .line 776
    .line 777
    const v9, 0x800033

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 781
    .line 782
    .line 783
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 784
    .line 785
    const/4 v10, -0x1

    .line 786
    invoke-direct {v9, v10, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 790
    .line 791
    .line 792
    new-instance v9, Lgg/s;

    .line 793
    .line 794
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 795
    .line 796
    .line 797
    iput v10, v9, Lgg/s;->g:I

    .line 798
    .line 799
    new-instance v20, Lgg/q;

    .line 800
    .line 801
    invoke-direct/range {v20 .. v20}, Ljava/lang/Object;-><init>()V

    .line 802
    .line 803
    .line 804
    new-instance v10, Lgg/u;

    .line 805
    .line 806
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 807
    .line 808
    .line 809
    iput-object v2, v10, Lgg/u;->g:Ljava/lang/Object;

    .line 810
    .line 811
    new-instance v2, Lgg/u;

    .line 812
    .line 813
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 814
    .line 815
    .line 816
    new-instance v15, Lr9/c0;

    .line 817
    .line 818
    move/from16 v16, v0

    .line 819
    .line 820
    move-object/from16 v0, v27

    .line 821
    .line 822
    invoke-direct {v15, v9, v0, v11, v1}, Lr9/c0;-><init>(Lgg/s;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 826
    .line 827
    .line 828
    new-instance v22, Lr9/e;

    .line 829
    .line 830
    const/16 v27, 0x0

    .line 831
    .line 832
    move-object/from16 v24, v0

    .line 833
    .line 834
    move-object/from16 v26, v1

    .line 835
    .line 836
    move-object/from16 v25, v9

    .line 837
    .line 838
    move-object/from16 v23, v11

    .line 839
    .line 840
    invoke-direct/range {v22 .. v27}, Lr9/e;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;I)V

    .line 841
    .line 842
    .line 843
    move-object/from16 v0, v25

    .line 844
    .line 845
    move-object/from16 v25, v23

    .line 846
    .line 847
    move-object/from16 v23, v26

    .line 848
    .line 849
    move-object/from16 v26, v0

    .line 850
    .line 851
    move-object/from16 v0, v22

    .line 852
    .line 853
    move-object/from16 v27, v24

    .line 854
    .line 855
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 856
    .line 857
    .line 858
    new-instance v22, Lr9/e;

    .line 859
    .line 860
    const/16 v27, 0x1

    .line 861
    .line 862
    move-object/from16 v37, v26

    .line 863
    .line 864
    move-object/from16 v26, v23

    .line 865
    .line 866
    move-object/from16 v23, v25

    .line 867
    .line 868
    move-object/from16 v25, v37

    .line 869
    .line 870
    invoke-direct/range {v22 .. v27}, Lr9/e;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;I)V

    .line 871
    .line 872
    .line 873
    move-object/from16 v0, v25

    .line 874
    .line 875
    move-object/from16 v25, v23

    .line 876
    .line 877
    move-object/from16 v23, v26

    .line 878
    .line 879
    move-object/from16 v26, v0

    .line 880
    .line 881
    move-object/from16 v0, v22

    .line 882
    .line 883
    move-object/from16 v27, v24

    .line 884
    .line 885
    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 886
    .line 887
    .line 888
    new-instance v22, Lr9/h;

    .line 889
    .line 890
    move-object/from16 v27, v26

    .line 891
    .line 892
    move-object/from16 v26, v28

    .line 893
    .line 894
    const/16 v28, 0x0

    .line 895
    .line 896
    move-object/from16 v37, v25

    .line 897
    .line 898
    move-object/from16 v25, v23

    .line 899
    .line 900
    move-object/from16 v23, v37

    .line 901
    .line 902
    invoke-direct/range {v22 .. v28}, Lr9/h;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Lgg/s;I)V

    .line 903
    .line 904
    .line 905
    move-object/from16 v0, v25

    .line 906
    .line 907
    move-object/from16 v25, v23

    .line 908
    .line 909
    move-object/from16 v23, v0

    .line 910
    .line 911
    move-object/from16 v1, v22

    .line 912
    .line 913
    move-object/from16 v0, v27

    .line 914
    .line 915
    move-object/from16 v27, v24

    .line 916
    .line 917
    invoke-virtual {v14, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 918
    .line 919
    .line 920
    new-instance v22, Lr9/h;

    .line 921
    .line 922
    const/16 v28, 0x1

    .line 923
    .line 924
    move-object/from16 v24, v26

    .line 925
    .line 926
    move-object/from16 v26, v23

    .line 927
    .line 928
    move-object/from16 v23, v25

    .line 929
    .line 930
    move-object/from16 v25, v24

    .line 931
    .line 932
    move-object/from16 v24, v27

    .line 933
    .line 934
    move-object/from16 v27, v0

    .line 935
    .line 936
    invoke-direct/range {v22 .. v28}, Lr9/h;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Lgg/s;I)V

    .line 937
    .line 938
    .line 939
    move-object/from16 v0, v22

    .line 940
    .line 941
    move-object/from16 v25, v23

    .line 942
    .line 943
    move-object/from16 v23, v26

    .line 944
    .line 945
    move-object/from16 v26, v27

    .line 946
    .line 947
    move-object/from16 v27, v24

    .line 948
    .line 949
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 950
    .line 951
    .line 952
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 953
    .line 954
    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 955
    .line 956
    .line 957
    move-object/from16 v1, v36

    .line 958
    .line 959
    iget-object v6, v1, Lr9/f0;->j:Ljava/lang/String;

    .line 960
    .line 961
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 962
    .line 963
    .line 964
    move-result v7

    .line 965
    if-eqz v7, :cond_d

    .line 966
    .line 967
    const-string v6, "\u6d88\u606f\u8be6\u60c5"

    .line 968
    .line 969
    :cond_d
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    invoke-virtual {v0, v12}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    const-string v6, "\u7f16\u8f91"

    .line 978
    .line 979
    const/4 v9, 0x0

    .line 980
    invoke-virtual {v0, v6, v9}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    const-string v6, "\u590d\u5236"

    .line 985
    .line 986
    invoke-virtual {v0, v6, v9}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    const-string v6, "\u5173\u95ed"

    .line 991
    .line 992
    invoke-virtual {v0, v6, v9}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    iput-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 1004
    .line 1005
    const/4 v6, -0x3

    .line 1006
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    if-eqz v0, :cond_e

    .line 1011
    .line 1012
    new-instance v18, Lr9/g;

    .line 1013
    .line 1014
    const/16 v34, 0x1

    .line 1015
    .line 1016
    move-object/from16 v21, v20

    .line 1017
    .line 1018
    move-object/from16 v20, v19

    .line 1019
    .line 1020
    move-object/from16 v19, v21

    .line 1021
    .line 1022
    move-object/from16 v32, v2

    .line 1023
    .line 1024
    move-object/from16 v33, v4

    .line 1025
    .line 1026
    move-object/from16 v28, v8

    .line 1027
    .line 1028
    move-object/from16 v24, v10

    .line 1029
    .line 1030
    move-object/from16 v31, v12

    .line 1031
    .line 1032
    move/from16 v22, v16

    .line 1033
    .line 1034
    move-object/from16 v21, v30

    .line 1035
    .line 1036
    move-object/from16 v30, v3

    .line 1037
    .line 1038
    invoke-direct/range {v18 .. v34}, Lr9/g;-><init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V

    .line 1039
    .line 1040
    .line 1041
    move-object/from16 v3, v18

    .line 1042
    .line 1043
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_7

    .line 1047
    :cond_e
    move-object/from16 v21, v20

    .line 1048
    .line 1049
    move-object/from16 v20, v19

    .line 1050
    .line 1051
    move-object/from16 v19, v21

    .line 1052
    .line 1053
    move-object/from16 v33, v4

    .line 1054
    .line 1055
    move-object/from16 v28, v8

    .line 1056
    .line 1057
    move-object/from16 v24, v10

    .line 1058
    .line 1059
    move-object/from16 v31, v12

    .line 1060
    .line 1061
    move/from16 v22, v16

    .line 1062
    .line 1063
    move-object/from16 v21, v30

    .line 1064
    .line 1065
    move-object/from16 v30, v3

    .line 1066
    .line 1067
    :goto_7
    iget-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 1068
    .line 1069
    const-string v3, "dialog"

    .line 1070
    .line 1071
    if-eqz v0, :cond_14

    .line 1072
    .line 1073
    check-cast v0, Landroid/app/AlertDialog;

    .line 1074
    .line 1075
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    if-eqz v0, :cond_f

    .line 1080
    .line 1081
    new-instance v18, Lr9/f;

    .line 1082
    .line 1083
    const/16 v34, 0x1

    .line 1084
    .line 1085
    move-object/from16 v32, v2

    .line 1086
    .line 1087
    invoke-direct/range {v18 .. v34}, Lr9/f;-><init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V

    .line 1088
    .line 1089
    .line 1090
    move-object/from16 v9, v18

    .line 1091
    .line 1092
    move-object/from16 v2, v20

    .line 1093
    .line 1094
    move/from16 v16, v22

    .line 1095
    .line 1096
    move-object/from16 v7, v24

    .line 1097
    .line 1098
    move-object/from16 v4, v25

    .line 1099
    .line 1100
    move-object/from16 v6, v26

    .line 1101
    .line 1102
    move-object/from16 v25, v30

    .line 1103
    .line 1104
    move-object/from16 v8, v32

    .line 1105
    .line 1106
    move-object/from16 v30, v21

    .line 1107
    .line 1108
    invoke-virtual {v0, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1109
    .line 1110
    .line 1111
    goto :goto_8

    .line 1112
    :cond_f
    move-object v8, v2

    .line 1113
    move-object/from16 v2, v20

    .line 1114
    .line 1115
    move/from16 v16, v22

    .line 1116
    .line 1117
    move-object/from16 v7, v24

    .line 1118
    .line 1119
    move-object/from16 v4, v25

    .line 1120
    .line 1121
    move-object/from16 v6, v26

    .line 1122
    .line 1123
    move-object/from16 v25, v30

    .line 1124
    .line 1125
    move-object/from16 v30, v21

    .line 1126
    .line 1127
    :goto_8
    iget-object v0, v8, Lgg/u;->g:Ljava/lang/Object;

    .line 1128
    .line 1129
    if-eqz v0, :cond_13

    .line 1130
    .line 1131
    check-cast v0, Landroid/app/AlertDialog;

    .line 1132
    .line 1133
    const/4 v15, -0x2

    .line 1134
    invoke-virtual {v0, v15}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    if-eqz v0, :cond_10

    .line 1139
    .line 1140
    new-instance v18, Lr9/i;

    .line 1141
    .line 1142
    move-object/from16 v24, v8

    .line 1143
    .line 1144
    move-object/from16 v20, v23

    .line 1145
    .line 1146
    move-object/from16 v23, v27

    .line 1147
    .line 1148
    move-object/from16 v21, v29

    .line 1149
    .line 1150
    move-object/from16 v22, v33

    .line 1151
    .line 1152
    move-object/from16 v26, v35

    .line 1153
    .line 1154
    move-object/from16 v27, v5

    .line 1155
    .line 1156
    invoke-direct/range {v18 .. v27}, Lr9/i;-><init>(Lgg/q;Landroid/widget/EditText;Lr9/d0;Landroid/content/Context;Landroid/widget/TextView;Lgg/u;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    move-object/from16 v9, v18

    .line 1160
    .line 1161
    move-object/from16 v5, v30

    .line 1162
    .line 1163
    move-object/from16 v30, v25

    .line 1164
    .line 1165
    move-object/from16 v25, v27

    .line 1166
    .line 1167
    move-object/from16 v27, v23

    .line 1168
    .line 1169
    move-object/from16 v23, v20

    .line 1170
    .line 1171
    invoke-virtual {v0, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_9

    .line 1175
    :cond_10
    move-object/from16 v26, v25

    .line 1176
    .line 1177
    move-object/from16 v25, v5

    .line 1178
    .line 1179
    move-object/from16 v5, v30

    .line 1180
    .line 1181
    move-object/from16 v30, v26

    .line 1182
    .line 1183
    move-object/from16 v26, v35

    .line 1184
    .line 1185
    :goto_9
    iget-object v0, v8, Lgg/u;->g:Ljava/lang/Object;

    .line 1186
    .line 1187
    if-eqz v0, :cond_12

    .line 1188
    .line 1189
    check-cast v0, Landroid/app/AlertDialog;

    .line 1190
    .line 1191
    const/4 v10, -0x1

    .line 1192
    invoke-virtual {v0, v10}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    if-eqz v0, :cond_11

    .line 1197
    .line 1198
    new-instance v18, Lr9/j;

    .line 1199
    .line 1200
    move-object/from16 v20, v8

    .line 1201
    .line 1202
    move-object/from16 v24, v23

    .line 1203
    .line 1204
    move-object/from16 v21, v29

    .line 1205
    .line 1206
    move-object/from16 v22, v33

    .line 1207
    .line 1208
    move-object/from16 v23, v1

    .line 1209
    .line 1210
    invoke-direct/range {v18 .. v26}, Lr9/j;-><init>(Lgg/q;Lgg/u;Lr9/d0;Landroid/content/Context;Lr9/f0;Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    move-object/from16 v1, v18

    .line 1214
    .line 1215
    move-object/from16 v32, v20

    .line 1216
    .line 1217
    move-object/from16 v23, v24

    .line 1218
    .line 1219
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1220
    .line 1221
    .line 1222
    goto :goto_a

    .line 1223
    :cond_11
    move-object/from16 v32, v8

    .line 1224
    .line 1225
    :goto_a
    new-instance v18, Lr9/f;

    .line 1226
    .line 1227
    move-object/from16 v25, v4

    .line 1228
    .line 1229
    move-object/from16 v21, v5

    .line 1230
    .line 1231
    move-object/from16 v26, v6

    .line 1232
    .line 1233
    move-object/from16 v24, v7

    .line 1234
    .line 1235
    move/from16 v22, v16

    .line 1236
    .line 1237
    move-object/from16 v20, v19

    .line 1238
    .line 1239
    move-object/from16 v19, v2

    .line 1240
    .line 1241
    invoke-direct/range {v18 .. v33}, Lr9/f;-><init>(Landroid/widget/LinearLayout;Lgg/q;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;)V

    .line 1242
    .line 1243
    .line 1244
    move-object/from16 v0, v20

    .line 1245
    .line 1246
    move-object/from16 v20, v19

    .line 1247
    .line 1248
    move-object/from16 v19, v0

    .line 1249
    .line 1250
    move-object/from16 v1, v18

    .line 1251
    .line 1252
    move-object/from16 v0, v27

    .line 1253
    .line 1254
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1255
    .line 1256
    .line 1257
    new-instance v18, Lr9/g;

    .line 1258
    .line 1259
    move-object/from16 v27, v20

    .line 1260
    .line 1261
    move-object/from16 v20, v19

    .line 1262
    .line 1263
    move-object/from16 v19, v27

    .line 1264
    .line 1265
    move-object/from16 v27, v0

    .line 1266
    .line 1267
    invoke-direct/range {v18 .. v33}, Lr9/g;-><init>(Landroid/widget/LinearLayout;Lgg/q;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;)V

    .line 1268
    .line 1269
    .line 1270
    move-object/from16 v0, v20

    .line 1271
    .line 1272
    move-object/from16 v20, v19

    .line 1273
    .line 1274
    move-object/from16 v19, v0

    .line 1275
    .line 1276
    move-object/from16 v1, v18

    .line 1277
    .line 1278
    move-object/from16 v0, v27

    .line 1279
    .line 1280
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1281
    .line 1282
    .line 1283
    new-instance v18, Lr9/f;

    .line 1284
    .line 1285
    const/16 v34, 0x0

    .line 1286
    .line 1287
    invoke-direct/range {v18 .. v34}, Lr9/f;-><init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V

    .line 1288
    .line 1289
    .line 1290
    move-object/from16 v0, v18

    .line 1291
    .line 1292
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1293
    .line 1294
    .line 1295
    new-instance v18, Lr9/g;

    .line 1296
    .line 1297
    invoke-direct/range {v18 .. v34}, Lr9/g;-><init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V

    .line 1298
    .line 1299
    .line 1300
    move-object/from16 v0, v18

    .line 1301
    .line 1302
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1303
    .line 1304
    .line 1305
    return-void

    .line 1306
    :cond_12
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    const/16 v17, 0x0

    .line 1310
    .line 1311
    throw v17

    .line 1312
    :cond_13
    const/16 v17, 0x0

    .line 1313
    .line 1314
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    throw v17

    .line 1318
    :cond_14
    const/16 v17, 0x0

    .line 1319
    .line 1320
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1321
    .line 1322
    .line 1323
    throw v17

    .line 1324
    :pswitch_0
    check-cast v4, Landroid/app/Activity;

    .line 1325
    .line 1326
    check-cast v14, Landroid/view/ViewGroup;

    .line 1327
    .line 1328
    check-cast v3, Landroid/widget/FrameLayout;

    .line 1329
    .line 1330
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 1331
    .line 1332
    sget-object v0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 1333
    .line 1334
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    check-cast v0, Landroid/view/View;

    .line 1339
    .line 1340
    if-eqz v0, :cond_15

    .line 1341
    .line 1342
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    goto :goto_b

    .line 1347
    :cond_15
    const/4 v0, 0x0

    .line 1348
    :goto_b
    if-eqz v0, :cond_16

    .line 1349
    .line 1350
    const/16 v25, 0x1

    .line 1351
    .line 1352
    invoke-static/range {v25 .. v25}, Lk9/r;->d(Z)V

    .line 1353
    .line 1354
    .line 1355
    goto/16 :goto_1b

    .line 1356
    .line 1357
    :cond_16
    const/16 v26, 0x0

    .line 1358
    .line 1359
    invoke-static/range {v26 .. v26}, Lk9/r;->d(Z)V

    .line 1360
    .line 1361
    .line 1362
    invoke-static {v4}, Loh/h;->L(Landroid/content/Context;)Ljava/util/List;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    new-instance v1, Ljava/util/ArrayList;

    .line 1367
    .line 1368
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1369
    .line 1370
    .line 1371
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    :cond_17
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v5

    .line 1379
    if-eqz v5, :cond_18

    .line 1380
    .line 1381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v5

    .line 1385
    move-object v6, v5

    .line 1386
    check-cast v6, Lk9/j;

    .line 1387
    .line 1388
    iget-boolean v6, v6, Lk9/j;->g:Z

    .line 1389
    .line 1390
    if-eqz v6, :cond_17

    .line 1391
    .line 1392
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    goto :goto_c

    .line 1396
    :cond_18
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    if-eqz v0, :cond_19

    .line 1401
    .line 1402
    const-string v0, "\u8bf7\u5148\u6dfb\u52a0\u5e76\u542f\u7528\u5feb\u6377\u9879"

    .line 1403
    .line 1404
    const/4 v10, 0x0

    .line 1405
    invoke-static {v4, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1410
    .line 1411
    .line 1412
    goto/16 :goto_1b

    .line 1413
    .line 1414
    :cond_19
    sget-object v0, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 1415
    .line 1416
    const-string v5, "icon"

    .line 1417
    .line 1418
    if-eqz v0, :cond_1a

    .line 1419
    .line 1420
    const-string v6, "display_mode"

    .line 1421
    .line 1422
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    if-eqz v0, :cond_1a

    .line 1427
    .line 1428
    goto :goto_d

    .line 1429
    :cond_1a
    move-object v0, v5

    .line 1430
    :goto_d
    new-instance v6, Landroid/widget/LinearLayout;

    .line 1431
    .line 1432
    invoke-direct {v6, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1433
    .line 1434
    .line 1435
    const/4 v8, 0x1

    .line 1436
    invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1437
    .line 1438
    .line 1439
    const/4 v15, 0x4

    .line 1440
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1441
    .line 1442
    .line 1443
    move-result v7

    .line 1444
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1445
    .line 1446
    .line 1447
    move-result v8

    .line 1448
    const/4 v10, 0x0

    .line 1449
    invoke-virtual {v6, v10, v7, v10, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v1

    .line 1456
    const/4 v11, 0x0

    .line 1457
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1458
    .line 1459
    .line 1460
    move-result v7

    .line 1461
    if-eqz v7, :cond_2d

    .line 1462
    .line 1463
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v7

    .line 1467
    add-int/lit8 v8, v11, 0x1

    .line 1468
    .line 1469
    if-ltz v11, :cond_2c

    .line 1470
    .line 1471
    check-cast v7, Lk9/j;

    .line 1472
    .line 1473
    const-string v10, "text"

    .line 1474
    .line 1475
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1476
    .line 1477
    .line 1478
    move-result v10

    .line 1479
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v12

    .line 1483
    sget-object v13, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 1484
    .line 1485
    const/16 v15, 0x2c

    .line 1486
    .line 1487
    if-eqz v13, :cond_1b

    .line 1488
    .line 1489
    const-string v9, "action_size"

    .line 1490
    .line 1491
    invoke-interface {v13, v9, v15}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1492
    .line 1493
    .line 1494
    move-result v9

    .line 1495
    const/16 v13, 0x24

    .line 1496
    .line 1497
    const/16 v15, 0x40

    .line 1498
    .line 1499
    invoke-static {v9, v13, v15}, Lr9/e0;->r(III)I

    .line 1500
    .line 1501
    .line 1502
    move-result v15

    .line 1503
    :cond_1b
    invoke-static {v4}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 1504
    .line 1505
    .line 1506
    move-result v9

    .line 1507
    if-eqz v9, :cond_1c

    .line 1508
    .line 1509
    const v9, -0xdc7c4c0

    .line 1510
    .line 1511
    .line 1512
    goto :goto_f

    .line 1513
    :cond_1c
    const v9, -0xa000001

    .line 1514
    .line 1515
    .line 1516
    :goto_f
    sget-object v13, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 1517
    .line 1518
    move-object/from16 v23, v0

    .line 1519
    .line 1520
    if-eqz v13, :cond_1d

    .line 1521
    .line 1522
    const-string v0, "action_color"

    .line 1523
    .line 1524
    invoke-interface {v13, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    goto :goto_10

    .line 1529
    :cond_1d
    const/4 v0, 0x0

    .line 1530
    :goto_10
    invoke-static {v9, v0}, Lk9/r;->k(ILjava/lang/String;)[I

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    invoke-static {v4}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v9

    .line 1538
    if-eqz v9, :cond_1e

    .line 1539
    .line 1540
    const/4 v9, -0x1

    .line 1541
    goto :goto_11

    .line 1542
    :cond_1e
    const v9, -0xdfdedc

    .line 1543
    .line 1544
    .line 1545
    :goto_11
    sget-object v13, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 1546
    .line 1547
    move-object/from16 v24, v1

    .line 1548
    .line 1549
    if-eqz v13, :cond_1f

    .line 1550
    .line 1551
    const-string v1, "label_color"

    .line 1552
    .line 1553
    invoke-interface {v13, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    goto :goto_12

    .line 1558
    :cond_1f
    const/4 v1, 0x0

    .line 1559
    :goto_12
    invoke-static {v9, v1}, Lk9/r;->k(ILjava/lang/String;)[I

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    invoke-static {v0}, Lk9/r;->o([I)I

    .line 1564
    .line 1565
    .line 1566
    move-result v9

    .line 1567
    invoke-static {v9}, Lk9/r;->h(I)Z

    .line 1568
    .line 1569
    .line 1570
    move-result v9

    .line 1571
    if-eqz v9, :cond_20

    .line 1572
    .line 1573
    const v9, -0xdfdedc

    .line 1574
    .line 1575
    .line 1576
    goto :goto_13

    .line 1577
    :cond_20
    const/4 v9, -0x1

    .line 1578
    :goto_13
    new-instance v13, Landroid/widget/LinearLayout;

    .line 1579
    .line 1580
    invoke-direct {v13, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1581
    .line 1582
    .line 1583
    move-object/from16 v28, v2

    .line 1584
    .line 1585
    const/4 v2, 0x0

    .line 1586
    invoke-virtual {v13, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1587
    .line 1588
    .line 1589
    const/16 v2, 0x11

    .line 1590
    .line 1591
    invoke-virtual {v13, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1592
    .line 1593
    .line 1594
    const/4 v2, 0x1

    .line 1595
    invoke-virtual {v13, v2}, Landroid/view/View;->setClickable(Z)V

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v13, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 1599
    .line 1600
    .line 1601
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    invoke-virtual {v13, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1606
    .line 1607
    .line 1608
    iget-object v2, v7, Lk9/j;->b:Ljava/lang/String;

    .line 1609
    .line 1610
    move-object/from16 p1, v3

    .line 1611
    .line 1612
    iget-object v3, v7, Lk9/j;->f:Ljava/lang/String;

    .line 1613
    .line 1614
    invoke-virtual {v13, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1615
    .line 1616
    .line 1617
    if-nez v12, :cond_23

    .line 1618
    .line 1619
    new-instance v2, Landroid/widget/TextView;

    .line 1620
    .line 1621
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1622
    .line 1623
    .line 1624
    move-object/from16 v29, v3

    .line 1625
    .line 1626
    const-string v3, "Hchat:FloatingShortcut:Label"

    .line 1627
    .line 1628
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1629
    .line 1630
    .line 1631
    iget-object v3, v7, Lk9/j;->b:Ljava/lang/String;

    .line 1632
    .line 1633
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1634
    .line 1635
    .line 1636
    const/16 v3, 0x11

    .line 1637
    .line 1638
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 1639
    .line 1640
    .line 1641
    sget-object v3, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 1642
    .line 1643
    if-eqz v3, :cond_21

    .line 1644
    .line 1645
    move-object/from16 v30, v5

    .line 1646
    .line 1647
    const-string v5, "label_text_size"

    .line 1648
    .line 1649
    move/from16 v31, v8

    .line 1650
    .line 1651
    const/16 v8, 0xe

    .line 1652
    .line 1653
    invoke-interface {v3, v5, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1654
    .line 1655
    .line 1656
    move-result v3

    .line 1657
    const/16 v5, 0x18

    .line 1658
    .line 1659
    const/16 v8, 0xa

    .line 1660
    .line 1661
    invoke-static {v3, v8, v5}, Lr9/e0;->r(III)I

    .line 1662
    .line 1663
    .line 1664
    move-result v3

    .line 1665
    goto :goto_14

    .line 1666
    :cond_21
    move-object/from16 v30, v5

    .line 1667
    .line 1668
    move/from16 v31, v8

    .line 1669
    .line 1670
    const/16 v5, 0x18

    .line 1671
    .line 1672
    const/16 v3, 0xe

    .line 1673
    .line 1674
    :goto_14
    int-to-float v3, v3

    .line 1675
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1676
    .line 1677
    .line 1678
    const/4 v8, 0x1

    .line 1679
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1680
    .line 1681
    .line 1682
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1683
    .line 1684
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1685
    .line 1686
    .line 1687
    const/16 v3, 0xb4

    .line 1688
    .line 1689
    invoke-static {v4, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1690
    .line 1691
    .line 1692
    move-result v3

    .line 1693
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 1694
    .line 1695
    .line 1696
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1697
    .line 1698
    .line 1699
    move-result v3

    .line 1700
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 1701
    .line 1702
    .line 1703
    const/16 v3, 0xb

    .line 1704
    .line 1705
    invoke-static {v4, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1706
    .line 1707
    .line 1708
    move-result v8

    .line 1709
    const/4 v5, 0x6

    .line 1710
    move/from16 v32, v10

    .line 1711
    .line 1712
    invoke-static {v4, v5}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1713
    .line 1714
    .line 1715
    move-result v10

    .line 1716
    invoke-static {v4, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1717
    .line 1718
    .line 1719
    move-result v3

    .line 1720
    invoke-static {v4, v5}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1721
    .line 1722
    .line 1723
    move-result v5

    .line 1724
    invoke-virtual {v2, v8, v10, v3, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v3

    .line 1731
    const/4 v5, 0x0

    .line 1732
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1733
    .line 1734
    .line 1735
    const/4 v10, 0x0

    .line 1736
    aget v3, v1, v10

    .line 1737
    .line 1738
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1739
    .line 1740
    .line 1741
    array-length v3, v1

    .line 1742
    const/4 v8, 0x2

    .line 1743
    if-ge v3, v8, :cond_22

    .line 1744
    .line 1745
    goto :goto_15

    .line 1746
    :cond_22
    new-instance v3, La1/d;

    .line 1747
    .line 1748
    const/16 v8, 0x16

    .line 1749
    .line 1750
    invoke-direct {v3, v2, v8, v1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1754
    .line 1755
    .line 1756
    :goto_15
    invoke-static {v4, v10, v5}, Lk9/r;->a(Landroid/content/Context;Z[I)Landroid/graphics/drawable/RippleDrawable;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v1

    .line 1760
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1761
    .line 1762
    .line 1763
    const/4 v8, 0x1

    .line 1764
    invoke-virtual {v2, v8}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 1765
    .line 1766
    .line 1767
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 1768
    .line 1769
    const/4 v3, -0x2

    .line 1770
    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v13, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1774
    .line 1775
    .line 1776
    goto :goto_16

    .line 1777
    :cond_23
    move-object/from16 v29, v3

    .line 1778
    .line 1779
    move-object/from16 v30, v5

    .line 1780
    .line 1781
    move/from16 v31, v8

    .line 1782
    .line 1783
    move/from16 v32, v10

    .line 1784
    .line 1785
    const/4 v8, 0x1

    .line 1786
    :goto_16
    if-nez v32, :cond_2a

    .line 1787
    .line 1788
    new-instance v1, Landroid/widget/FrameLayout;

    .line 1789
    .line 1790
    invoke-direct {v1, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1791
    .line 1792
    .line 1793
    const-string v2, "Hchat:FloatingShortcut:Icon"

    .line 1794
    .line 1795
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-static {v4, v8, v0}, Lk9/r;->a(Landroid/content/Context;Z[I)Landroid/graphics/drawable/RippleDrawable;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v0

    .line 1802
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1803
    .line 1804
    .line 1805
    invoke-virtual {v1, v8}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 1806
    .line 1807
    .line 1808
    new-instance v0, Landroid/widget/ImageView;

    .line 1809
    .line 1810
    invoke-direct {v0, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1811
    .line 1812
    .line 1813
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 1814
    .line 1815
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1816
    .line 1817
    .line 1818
    invoke-static {v4}, Lk9/r;->g(Landroid/content/Context;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v2

    .line 1822
    if-eqz v2, :cond_24

    .line 1823
    .line 1824
    invoke-static/range {v29 .. v29}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v2

    .line 1828
    if-nez v2, :cond_24

    .line 1829
    .line 1830
    move-object/from16 v3, v29

    .line 1831
    .line 1832
    goto :goto_17

    .line 1833
    :cond_24
    iget-object v3, v7, Lk9/j;->e:Ljava/lang/String;

    .line 1834
    .line 1835
    :goto_17
    invoke-static {v4, v3}, Lk9/r;->i(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v2

    .line 1839
    if-eqz v2, :cond_25

    .line 1840
    .line 1841
    const/4 v3, 0x2

    .line 1842
    goto :goto_18

    .line 1843
    :cond_25
    iget-object v2, v7, Lk9/j;->c:Ljava/lang/String;

    .line 1844
    .line 1845
    const-string v3, "plugin_agent"

    .line 1846
    .line 1847
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1848
    .line 1849
    .line 1850
    move-result v2

    .line 1851
    if-eqz v2, :cond_26

    .line 1852
    .line 1853
    new-instance v2, Lq8/a;

    .line 1854
    .line 1855
    const/4 v3, 0x2

    .line 1856
    invoke-direct {v2, v9, v3}, Lq8/a;-><init>(II)V

    .line 1857
    .line 1858
    .line 1859
    goto :goto_18

    .line 1860
    :cond_26
    const/4 v3, 0x2

    .line 1861
    new-instance v2, Lk9/d;

    .line 1862
    .line 1863
    invoke-static {v7}, Lg4/a;->o(Lk9/j;)Lk9/c;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v5

    .line 1867
    invoke-direct {v2, v5, v9}, Lk9/d;-><init>(Lk9/c;I)V

    .line 1868
    .line 1869
    .line 1870
    :goto_18
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1871
    .line 1872
    .line 1873
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1874
    .line 1875
    int-to-float v5, v15

    .line 1876
    const v8, 0x3f11eb85    # 0.57f

    .line 1877
    .line 1878
    .line 1879
    mul-float/2addr v5, v8

    .line 1880
    float-to-int v5, v5

    .line 1881
    const/16 v8, 0x14

    .line 1882
    .line 1883
    if-ge v5, v8, :cond_27

    .line 1884
    .line 1885
    move v9, v8

    .line 1886
    goto :goto_19

    .line 1887
    :cond_27
    move v9, v5

    .line 1888
    :goto_19
    invoke-static {v4, v9}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1889
    .line 1890
    .line 1891
    move-result v9

    .line 1892
    if-ge v5, v8, :cond_28

    .line 1893
    .line 1894
    move v5, v8

    .line 1895
    :cond_28
    invoke-static {v4, v5}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1896
    .line 1897
    .line 1898
    move-result v5

    .line 1899
    const/16 v8, 0x11

    .line 1900
    .line 1901
    invoke-direct {v2, v9, v5, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1905
    .line 1906
    .line 1907
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1908
    .line 1909
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1910
    .line 1911
    .line 1912
    move-result v2

    .line 1913
    invoke-static {v4, v15}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1914
    .line 1915
    .line 1916
    move-result v5

    .line 1917
    invoke-direct {v0, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1918
    .line 1919
    .line 1920
    const/16 v2, 0x8

    .line 1921
    .line 1922
    if-nez v12, :cond_29

    .line 1923
    .line 1924
    invoke-static {v4, v2}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1925
    .line 1926
    .line 1927
    move-result v5

    .line 1928
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1929
    .line 1930
    .line 1931
    :cond_29
    invoke-virtual {v13, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1932
    .line 1933
    .line 1934
    goto :goto_1a

    .line 1935
    :cond_2a
    const/16 v2, 0x8

    .line 1936
    .line 1937
    const/4 v3, 0x2

    .line 1938
    const/16 v8, 0x11

    .line 1939
    .line 1940
    :goto_1a
    new-instance v0, Lk9/o;

    .line 1941
    .line 1942
    invoke-direct {v0, v4, v7}, Lk9/o;-><init>(Landroid/app/Activity;Lk9/j;)V

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1946
    .line 1947
    .line 1948
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1949
    .line 1950
    const/4 v15, -0x2

    .line 1951
    invoke-direct {v0, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1952
    .line 1953
    .line 1954
    if-lez v11, :cond_2b

    .line 1955
    .line 1956
    const/4 v1, 0x5

    .line 1957
    invoke-static {v4, v1}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1958
    .line 1959
    .line 1960
    move-result v1

    .line 1961
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1962
    .line 1963
    :cond_2b
    invoke-virtual {v6, v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1964
    .line 1965
    .line 1966
    move-object/from16 v3, p1

    .line 1967
    .line 1968
    move v9, v8

    .line 1969
    move-object/from16 v0, v23

    .line 1970
    .line 1971
    move-object/from16 v1, v24

    .line 1972
    .line 1973
    move-object/from16 v2, v28

    .line 1974
    .line 1975
    move-object/from16 v5, v30

    .line 1976
    .line 1977
    move/from16 v11, v31

    .line 1978
    .line 1979
    goto/16 :goto_e

    .line 1980
    .line 1981
    :cond_2c
    invoke-static {}, La/a;->Q0()V

    .line 1982
    .line 1983
    .line 1984
    const/16 v17, 0x0

    .line 1985
    .line 1986
    throw v17

    .line 1987
    :cond_2d
    move-object/from16 p1, v3

    .line 1988
    .line 1989
    new-instance v5, Landroid/widget/ScrollView;

    .line 1990
    .line 1991
    invoke-direct {v5, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 1992
    .line 1993
    .line 1994
    const/4 v15, 0x4

    .line 1995
    invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1996
    .line 1997
    .line 1998
    const/4 v10, 0x0

    .line 1999
    invoke-virtual {v5, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 2000
    .line 2001
    .line 2002
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 2003
    .line 2004
    .line 2005
    const/16 v3, 0xa

    .line 2006
    .line 2007
    invoke-static {v4, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 2008
    .line 2009
    .line 2010
    move-result v0

    .line 2011
    int-to-float v0, v0

    .line 2012
    invoke-virtual {v5, v0}, Landroid/view/View;->setElevation(F)V

    .line 2013
    .line 2014
    .line 2015
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2016
    .line 2017
    const/4 v15, -0x2

    .line 2018
    invoke-direct {v0, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 2019
    .line 2020
    .line 2021
    invoke-virtual {v5, v6, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2022
    .line 2023
    .line 2024
    new-instance v0, Landroid/view/View;

    .line 2025
    .line 2026
    invoke-direct {v0, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2027
    .line 2028
    .line 2029
    const/4 v8, 0x1

    .line 2030
    invoke-virtual {v0, v8}, Landroid/view/View;->setClickable(Z)V

    .line 2031
    .line 2032
    .line 2033
    invoke-virtual {v0, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2034
    .line 2035
    .line 2036
    new-instance v1, Lk9/n;

    .line 2037
    .line 2038
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2042
    .line 2043
    .line 2044
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 2045
    .line 2046
    const v9, 0x800033

    .line 2047
    .line 2048
    .line 2049
    const/4 v10, -0x1

    .line 2050
    invoke-direct {v1, v10, v10, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v14, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2054
    .line 2055
    .line 2056
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 2057
    .line 2058
    const/4 v15, -0x2

    .line 2059
    invoke-direct {v1, v15, v15, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 2060
    .line 2061
    .line 2062
    invoke-virtual {v14, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2063
    .line 2064
    .line 2065
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 2066
    .line 2067
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 2068
    .line 2069
    .line 2070
    sput-object v1, Lk9/r;->j:Ljava/lang/ref/WeakReference;

    .line 2071
    .line 2072
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2073
    .line 2074
    invoke-direct {v0, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 2075
    .line 2076
    .line 2077
    sput-object v0, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 2078
    .line 2079
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->bringToFront()V

    .line 2080
    .line 2081
    .line 2082
    new-instance v0, Lca/x;

    .line 2083
    .line 2084
    const/16 v1, 0x9

    .line 2085
    .line 2086
    move-object v2, v4

    .line 2087
    move-object v3, v14

    .line 2088
    move-object/from16 v4, p1

    .line 2089
    .line 2090
    invoke-direct/range {v0 .. v6}, Lca/x;-><init>(ILandroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2091
    .line 2092
    .line 2093
    invoke-virtual {v5, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2094
    .line 2095
    .line 2096
    :goto_1b
    return-void

    .line 2097
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
