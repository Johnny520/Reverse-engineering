.class public final synthetic Lp3;
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
    iput p2, p0, Lp3;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lp3;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lp3;->η:Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp3;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, -0x1

    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/16 v5, 0x16

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v12, v1

    .line 21
    check-cast v12, Landroid/app/Activity;

    .line 22
    .line 23
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lih0;

    .line 26
    .line 27
    const-string v1, "theme"

    .line 28
    .line 29
    invoke-static {v12, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v10, Lq71;->α:Lq71;

    .line 34
    .line 35
    invoke-static {v12, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    const/16 v11, 0xc

    .line 40
    .line 41
    invoke-static {v12, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 42
    .line 43
    .line 44
    move-result v13

    .line 45
    invoke-static {v12, v5}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    invoke-static {v12, v6}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    invoke-virtual {v2, v10, v13, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 54
    .line 55
    .line 56
    new-instance v14, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-direct {v14, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    iget-boolean v10, v0, Lih0;->α:Z

    .line 62
    .line 63
    if-eqz v10, :cond_0

    .line 64
    .line 65
    const-string v10, "\u6b63\u5728\u8bfb\u53d6\u5b8c\u6574\u804a\u5929\u8bb0\u5f55\u2026"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const-string v10, "\u6b63\u5728\u6574\u7406\u804a\u5929\u8bb0\u5f55\u2026"

    .line 69
    .line 70
    :goto_0
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    const/high16 v10, 0x41700000    # 15.0f

    .line 74
    .line 75
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v14}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-virtual {v14, v10, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 83
    .line 84
    .line 85
    new-instance v15, Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-direct {v15, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    const-string v10, "\u6b63\u5728\u8ba1\u7b97\u6d88\u606f\u6570\u91cf\u548c\u65f6\u95f4\u8303\u56f4"

    .line 91
    .line 92
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    const/high16 v10, 0x41500000    # 13.0f

    .line 96
    .line 97
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 98
    .line 99
    .line 100
    const v10, -0x777778

    .line 101
    .line 102
    .line 103
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v12, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    invoke-static {v12, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    invoke-virtual {v15, v9, v10, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 115
    .line 116
    .line 117
    new-instance v10, Landroid/widget/ProgressBar;

    .line 118
    .line 119
    const v11, 0x1010078

    .line 120
    .line 121
    .line 122
    invoke-direct {v10, v12, v8, v11}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v10, v7}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 126
    .line 127
    .line 128
    sget-object v7, Lq71;->γ:Lxx;

    .line 129
    .line 130
    if-eqz v7, :cond_2

    .line 131
    .line 132
    iget-object v7, v7, Lxx;->λ:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v10, v7}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 143
    .line 144
    .line 145
    sget-object v7, Lq71;->γ:Lxx;

    .line 146
    .line 147
    if-eqz v7, :cond_1

    .line 148
    .line 149
    iget-object v1, v7, Lxx;->λ:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v10, v1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 169
    .line 170
    invoke-static {v12, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    .line 179
    .line 180
    new-instance v11, Ln;

    .line 181
    .line 182
    invoke-direct {v11, v5}, Ln;-><init>(I)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 186
    .line 187
    invoke-direct {v1, v12}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 188
    .line 189
    .line 190
    const-string v3, "\u6b63\u5728\u5bfc\u51fa\u804a\u5929\u8bb0\u5f55"

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    const-string v2, "\u53d6\u6d88\u5bfc\u51fa"

    .line 201
    .line 202
    invoke-virtual {v1, v2, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 211
    .line 212
    .line 213
    move-result-object v18

    .line 214
    new-instance v16, Lv61;

    .line 215
    .line 216
    move-object/from16 v19, v10

    .line 217
    .line 218
    move-object/from16 v17, v11

    .line 219
    .line 220
    move-object/from16 v20, v14

    .line 221
    .line 222
    move-object/from16 v21, v15

    .line 223
    .line 224
    invoke-direct/range {v16 .. v21}, Lv61;-><init>(Ln;Landroid/app/AlertDialog;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v1, v16

    .line 228
    .line 229
    move-object/from16 v13, v18

    .line 230
    .line 231
    move-object/from16 v16, v19

    .line 232
    .line 233
    invoke-virtual {v13, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13}, Landroid/app/Dialog;->show()V

    .line 237
    .line 238
    .line 239
    sget-object v1, Lnh0;->α:Lnh0;

    .line 240
    .line 241
    invoke-virtual {v12}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    new-instance v10, Lgc;

    .line 246
    .line 247
    const/16 v17, 0x1

    .line 248
    .line 249
    invoke-direct/range {v10 .. v17}, Lgc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v17, v11

    .line 253
    .line 254
    new-instance v2, Lic;

    .line 255
    .line 256
    invoke-direct {v2, v12, v6, v13}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    const-string v3, "r677d3fc3d52048d1"

    .line 260
    .line 261
    new-instance v13, Lvb0;

    .line 262
    .line 263
    const/16 v19, 0x1

    .line 264
    .line 265
    move-object/from16 v16, v0

    .line 266
    .line 267
    move-object v15, v1

    .line 268
    move-object/from16 v18, v2

    .line 269
    .line 270
    move-object/from16 v14, v17

    .line 271
    .line 272
    move-object/from16 v17, v10

    .line 273
    .line 274
    invoke-direct/range {v13 .. v19}, Lvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    const/16 v0, 0x15

    .line 278
    .line 279
    invoke-static {v0, v13, v3}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :goto_1
    sget-object v0, Ls62;->α:Ls62;

    .line 283
    .line 284
    return-object v0

    .line 285
    :cond_1
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v8

    .line 289
    :cond_2
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v8

    .line 293
    :pswitch_0
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, Lm6;

    .line 296
    .line 297
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Ldl1;

    .line 300
    .line 301
    iget-object v1, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lj7;

    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_3

    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_3
    invoke-virtual {v0}, Ldl1;->invoke()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    :goto_2
    sget-object v0, Ls62;->α:Ls62;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_1
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, Landroid/app/Activity;

    .line 321
    .line 322
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, Lfk0;

    .line 325
    .line 326
    invoke-static {v1, v0}, Lxb;->Υ(Landroid/app/Activity;Lfk0;)V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :pswitch_2
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, Ldj0;

    .line 333
    .line 334
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, Lcj0;

    .line 337
    .line 338
    iget-object v2, v1, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 339
    .line 340
    new-instance v3, Lzi0;

    .line 341
    .line 342
    invoke-direct {v3, v0, v1}, Lzi0;-><init>(Lcj0;Ldj0;)V

    .line 343
    .line 344
    .line 345
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 346
    .line 347
    .line 348
    goto :goto_1

    .line 349
    :pswitch_3
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v1, Lli0;

    .line 352
    .line 353
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Luj0;

    .line 356
    .line 357
    iput-boolean v9, v1, Lli0;->Δ:Z

    .line 358
    .line 359
    invoke-virtual {v1, v9}, Lli0;->ζ(Z)V

    .line 360
    .line 361
    .line 362
    iget-object v2, v0, Luj0;->δ:Ljava/lang/String;

    .line 363
    .line 364
    iget v3, v0, Luj0;->γ:I

    .line 365
    .line 366
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-nez v4, :cond_4

    .line 371
    .line 372
    move-object v0, v2

    .line 373
    goto :goto_3

    .line 374
    :cond_4
    iget v4, v0, Luj0;->α:I

    .line 375
    .line 376
    if-nez v4, :cond_5

    .line 377
    .line 378
    const-string v0, "\u670d\u52a1\u5668\u6ca1\u6709\u53ef\u6e05\u7406\u7684\u4e92\u52a8\u6d88\u606f"

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_5
    iget v0, v0, Luj0;->β:I

    .line 382
    .line 383
    if-nez v3, :cond_6

    .line 384
    .line 385
    const-string v4, "\u5df2\u7531\u670d\u52a1\u5668\u786e\u8ba4\u5220\u9664 "

    .line 386
    .line 387
    const-string v5, " \u6761\u4e92\u52a8\u6d88\u606f"

    .line 388
    .line 389
    invoke-static {v4, v0, v5}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    goto :goto_3

    .line 394
    :cond_6
    const-string v5, "\u670d\u52a1\u5668\u786e\u8ba4\u5220\u9664 "

    .line 395
    .line 396
    const-string v6, "/"

    .line 397
    .line 398
    const-string v7, " \u6761\uff0c\u5931\u8d25 "

    .line 399
    .line 400
    invoke-static {v5, v0, v6, v4, v7}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    const-string v4, " \u6761\u53ef\u7a0d\u540e\u91cd\u8bd5"

    .line 405
    .line 406
    invoke-static {v0, v3, v4}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :goto_3
    iget-object v4, v1, Lli0;->η:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 416
    .line 417
    iget-object v1, v1, Lli0;->α:Landroid/app/Activity;

    .line 418
    .line 419
    invoke-direct {v4, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 420
    .line 421
    .line 422
    if-nez v3, :cond_7

    .line 423
    .line 424
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_7

    .line 429
    .line 430
    const-string v1, "\u4e92\u52a8\u6d88\u606f\u6e05\u7406\u5b8c\u6210"

    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_7
    const-string v1, "\u4e92\u52a8\u6d88\u606f\u6e05\u7406\u672a\u5b8c\u5168\u6210\u529f"

    .line 434
    .line 435
    :goto_4
    invoke-virtual {v4, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-string v1, "\u786e\u5b9a"

    .line 444
    .line 445
    invoke-virtual {v0, v1, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 450
    .line 451
    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_4
    sget-object v1, Lyi0;->η:Lyi0;

    .line 455
    .line 456
    sget-object v2, Lyi0;->ζ:Lyi0;

    .line 457
    .line 458
    iget-object v3, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v3, Lli0;

    .line 461
    .line 462
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Ljava/util/List;

    .line 465
    .line 466
    iput-boolean v9, v3, Lli0;->Γ:Z

    .line 467
    .line 468
    iput-object v8, v3, Lli0;->Λ:Ln5;

    .line 469
    .line 470
    invoke-virtual {v3, v9}, Lli0;->ε(Z)V

    .line 471
    .line 472
    .line 473
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    if-eqz v4, :cond_8

    .line 478
    .line 479
    move v5, v9

    .line 480
    goto :goto_6

    .line 481
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    move v5, v9

    .line 486
    :cond_9
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    if-eqz v6, :cond_b

    .line 491
    .line 492
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    check-cast v6, Lhj0;

    .line 497
    .line 498
    iget-object v6, v6, Lhj0;->β:Lyi0;

    .line 499
    .line 500
    sget-object v7, Lyi0;->ε:Lyi0;

    .line 501
    .line 502
    if-ne v6, v7, :cond_9

    .line 503
    .line 504
    add-int/lit8 v5, v5, 0x1

    .line 505
    .line 506
    if-ltz v5, :cond_a

    .line 507
    .line 508
    goto :goto_5

    .line 509
    :cond_a
    invoke-static {}, Lyh;->ф()V

    .line 510
    .line 511
    .line 512
    throw v8

    .line 513
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-eqz v4, :cond_c

    .line 518
    .line 519
    move v6, v9

    .line 520
    goto :goto_8

    .line 521
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    move v6, v9

    .line 526
    :cond_d
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result v7

    .line 530
    if-eqz v7, :cond_f

    .line 531
    .line 532
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    check-cast v7, Lhj0;

    .line 537
    .line 538
    iget-object v7, v7, Lhj0;->β:Lyi0;

    .line 539
    .line 540
    if-ne v7, v2, :cond_d

    .line 541
    .line 542
    add-int/lit8 v6, v6, 0x1

    .line 543
    .line 544
    if-ltz v6, :cond_e

    .line 545
    .line 546
    goto :goto_7

    .line 547
    :cond_e
    invoke-static {}, Lyh;->ф()V

    .line 548
    .line 549
    .line 550
    throw v8

    .line 551
    :cond_f
    :goto_8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_10

    .line 556
    .line 557
    move v7, v9

    .line 558
    goto :goto_a

    .line 559
    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    move v7, v9

    .line 564
    :cond_11
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v10

    .line 568
    if-eqz v10, :cond_13

    .line 569
    .line 570
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    check-cast v10, Lhj0;

    .line 575
    .line 576
    iget-object v10, v10, Lhj0;->β:Lyi0;

    .line 577
    .line 578
    if-ne v10, v1, :cond_11

    .line 579
    .line 580
    add-int/lit8 v7, v7, 0x1

    .line 581
    .line 582
    if-ltz v7, :cond_12

    .line 583
    .line 584
    goto :goto_9

    .line 585
    :cond_12
    invoke-static {}, Lyh;->ф()V

    .line 586
    .line 587
    .line 588
    throw v8

    .line 589
    :cond_13
    :goto_a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-eqz v4, :cond_14

    .line 594
    .line 595
    goto :goto_c

    .line 596
    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    :cond_15
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v10

    .line 604
    if-eqz v10, :cond_17

    .line 605
    .line 606
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    check-cast v10, Lhj0;

    .line 611
    .line 612
    iget-object v10, v10, Lhj0;->β:Lyi0;

    .line 613
    .line 614
    sget-object v11, Lyi0;->θ:Lyi0;

    .line 615
    .line 616
    if-ne v10, v11, :cond_15

    .line 617
    .line 618
    add-int/lit8 v9, v9, 0x1

    .line 619
    .line 620
    if-ltz v9, :cond_16

    .line 621
    .line 622
    goto :goto_b

    .line 623
    :cond_16
    invoke-static {}, Lyh;->ф()V

    .line 624
    .line 625
    .line 626
    throw v8

    .line 627
    :cond_17
    :goto_c
    new-instance v4, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    new-instance v10, Ljava/lang/StringBuilder;

    .line 633
    .line 634
    const-string v11, "\u6210\u529f "

    .line 635
    .line 636
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    if-lez v6, :cond_18

    .line 650
    .line 651
    new-instance v5, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    const-string v10, " \u00b7 \u5931\u8d25 "

    .line 654
    .line 655
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    :cond_18
    if-lez v7, :cond_19

    .line 669
    .line 670
    new-instance v5, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v6, " \u00b7 \u8d85\u65f6 "

    .line 673
    .line 674
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    :cond_19
    if-lez v9, :cond_1a

    .line 688
    .line 689
    new-instance v5, Ljava/lang/StringBuilder;

    .line 690
    .line 691
    const-string v6, " \u00b7 \u672a\u6267\u884c "

    .line 692
    .line 693
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v5

    .line 703
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    :cond_1a
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    iput-object v4, v3, Lli0;->Ζ:Ljava/lang/String;

    .line 711
    .line 712
    invoke-virtual {v3}, Lli0;->θ()V

    .line 713
    .line 714
    .line 715
    new-instance v4, Ljava/util/ArrayList;

    .line 716
    .line 717
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 718
    .line 719
    .line 720
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    :cond_1b
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 725
    .line 726
    .line 727
    move-result v5

    .line 728
    if-eqz v5, :cond_1d

    .line 729
    .line 730
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    move-object v6, v5

    .line 735
    check-cast v6, Lhj0;

    .line 736
    .line 737
    iget-object v6, v6, Lhj0;->β:Lyi0;

    .line 738
    .line 739
    if-eq v6, v2, :cond_1c

    .line 740
    .line 741
    if-ne v6, v1, :cond_1b

    .line 742
    .line 743
    :cond_1c
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    goto :goto_d

    .line 747
    :cond_1d
    const/4 v0, 0x6

    .line 748
    invoke-static {v4, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    const-string v10, "\u3001"

    .line 753
    .line 754
    new-instance v14, Lsh0;

    .line 755
    .line 756
    const/16 v0, 0x12

    .line 757
    .line 758
    invoke-direct {v14, v0}, Lsh0;-><init>(I)V

    .line 759
    .line 760
    .line 761
    const/16 v15, 0x1e

    .line 762
    .line 763
    const/4 v11, 0x0

    .line 764
    const/4 v12, 0x0

    .line 765
    const/4 v13, 0x0

    .line 766
    invoke-static/range {v9 .. v15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    new-instance v1, Ljava/lang/StringBuilder;

    .line 771
    .line 772
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 773
    .line 774
    .line 775
    iget-object v2, v3, Lli0;->Ζ:Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    if-nez v2, :cond_1e

    .line 785
    .line 786
    const-string v2, "\n\n\u4fdd\u7559\u5f85\u91cd\u8bd5\uff1a"

    .line 787
    .line 788
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    :cond_1e
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 799
    .line 800
    iget-object v2, v3, Lli0;->α:Landroid/app/Activity;

    .line 801
    .line 802
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 803
    .line 804
    .line 805
    const-string v2, "\u4f1a\u8bdd\u5220\u9664\u5b8c\u6210"

    .line 806
    .line 807
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    const-string v1, "\u786e\u5b9a"

    .line 816
    .line 817
    invoke-virtual {v0, v1, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 822
    .line 823
    .line 824
    goto/16 :goto_1

    .line 825
    .line 826
    :pswitch_5
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v1, Lli0;

    .line 829
    .line 830
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v0, Lpt;

    .line 833
    .line 834
    invoke-virtual {v1, v0}, Lli0;->γ(Lpt;)V

    .line 835
    .line 836
    .line 837
    goto/16 :goto_1

    .line 838
    .line 839
    :pswitch_6
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v1, Lgc;

    .line 842
    .line 843
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Ljh0;

    .line 846
    .line 847
    invoke-virtual {v1, v0}, Lgc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    goto/16 :goto_1

    .line 851
    .line 852
    :pswitch_7
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v1, Lic;

    .line 855
    .line 856
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v0, Ljava/lang/Throwable;

    .line 859
    .line 860
    invoke-virtual {v1, v8, v0}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    goto/16 :goto_1

    .line 864
    .line 865
    :pswitch_8
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v1, Lic;

    .line 868
    .line 869
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v0, Llh0;

    .line 872
    .line 873
    invoke-virtual {v1, v0, v8}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    goto/16 :goto_1

    .line 877
    .line 878
    :pswitch_9
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v1, Ldg0;

    .line 881
    .line 882
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, Lum1;

    .line 885
    .line 886
    iget-object v2, v1, Ldg0;->ε:Lbg0;

    .line 887
    .line 888
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, Lxs1;

    .line 891
    .line 892
    invoke-virtual {v2, v1, v0}, Lbg0;->α(Ldg0;Lxs1;)V

    .line 893
    .line 894
    .line 895
    goto/16 :goto_1

    .line 896
    .line 897
    :pswitch_a
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v1, Lcg0;

    .line 900
    .line 901
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v0, Lxs1;

    .line 904
    .line 905
    new-instance v2, Lum1;

    .line 906
    .line 907
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 908
    .line 909
    .line 910
    iget-object v1, v1, Lcg0;->ζ:Ldg0;

    .line 911
    .line 912
    iget-object v3, v1, Ldg0;->Γ:Llg0;

    .line 913
    .line 914
    monitor-enter v3

    .line 915
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 916
    :try_start_1
    iget-object v4, v1, Ldg0;->χ:Lxs1;

    .line 917
    .line 918
    new-instance v5, Lxs1;

    .line 919
    .line 920
    invoke-direct {v5}, Lxs1;-><init>()V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    move v6, v9

    .line 927
    :goto_e
    const/16 v10, 0xa

    .line 928
    .line 929
    if-ge v6, v10, :cond_20

    .line 930
    .line 931
    shl-int v10, v7, v6

    .line 932
    .line 933
    iget v11, v4, Lxs1;->α:I

    .line 934
    .line 935
    and-int/2addr v10, v11

    .line 936
    if-eqz v10, :cond_1f

    .line 937
    .line 938
    iget-object v10, v4, Lxs1;->β:[I

    .line 939
    .line 940
    aget v10, v10, v6

    .line 941
    .line 942
    invoke-virtual {v5, v6, v10}, Lxs1;->β(II)V

    .line 943
    .line 944
    .line 945
    :cond_1f
    add-int/lit8 v6, v6, 0x1

    .line 946
    .line 947
    goto :goto_e

    .line 948
    :cond_20
    move v6, v9

    .line 949
    :goto_f
    if-ge v6, v10, :cond_22

    .line 950
    .line 951
    shl-int v11, v7, v6

    .line 952
    .line 953
    iget v12, v0, Lxs1;->α:I

    .line 954
    .line 955
    and-int/2addr v11, v12

    .line 956
    if-eqz v11, :cond_21

    .line 957
    .line 958
    iget-object v11, v0, Lxs1;->β:[I

    .line 959
    .line 960
    aget v11, v11, v6

    .line 961
    .line 962
    invoke-virtual {v5, v6, v11}, Lxs1;->β(II)V

    .line 963
    .line 964
    .line 965
    :cond_21
    add-int/lit8 v6, v6, 0x1

    .line 966
    .line 967
    goto :goto_f

    .line 968
    :cond_22
    iput-object v5, v2, Lum1;->ε:Ljava/lang/Object;

    .line 969
    .line 970
    invoke-virtual {v5}, Lxs1;->α()I

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    int-to-long v5, v0

    .line 975
    invoke-virtual {v4}, Lxs1;->α()I

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    int-to-long v10, v0

    .line 980
    sub-long/2addr v5, v10

    .line 981
    const-wide/16 v10, 0x0

    .line 982
    .line 983
    cmp-long v4, v5, v10

    .line 984
    .line 985
    if-eqz v4, :cond_24

    .line 986
    .line 987
    iget-object v0, v1, Ldg0;->ζ:Ljava/util/LinkedHashMap;

    .line 988
    .line 989
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 990
    .line 991
    .line 992
    move-result v0

    .line 993
    if-eqz v0, :cond_23

    .line 994
    .line 995
    goto :goto_10

    .line 996
    :cond_23
    iget-object v0, v1, Ldg0;->ζ:Ljava/util/LinkedHashMap;

    .line 997
    .line 998
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    new-array v7, v9, [Lkg0;

    .line 1003
    .line 1004
    invoke-interface {v0, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    move-object v8, v0

    .line 1009
    check-cast v8, [Lkg0;

    .line 1010
    .line 1011
    goto :goto_10

    .line 1012
    :catchall_0
    move-exception v0

    .line 1013
    goto :goto_13

    .line 1014
    :cond_24
    :goto_10
    iget-object v0, v2, Lum1;->ε:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v0, Lxs1;

    .line 1017
    .line 1018
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    iput-object v0, v1, Ldg0;->χ:Lxs1;

    .line 1022
    .line 1023
    iget-object v0, v1, Ldg0;->ξ:Lw22;

    .line 1024
    .line 1025
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1028
    .line 1029
    .line 1030
    iget-object v10, v1, Ldg0;->η:Ljava/lang/String;

    .line 1031
    .line 1032
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    const-string v10, " onSettings"

    .line 1036
    .line 1037
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v7

    .line 1044
    new-instance v10, Lp3;

    .line 1045
    .line 1046
    const/16 v11, 0x13

    .line 1047
    .line 1048
    invoke-direct {v10, v1, v11, v2}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v0, v7, v10}, Lw22;->β(Lw22;Ljava/lang/String;Lp70;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1052
    .line 1053
    .line 1054
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1055
    :try_start_3
    iget-object v0, v1, Ldg0;->Γ:Llg0;

    .line 1056
    .line 1057
    iget-object v2, v2, Lum1;->ε:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v2, Lxs1;

    .line 1060
    .line 1061
    invoke-virtual {v0, v2}, Llg0;->δ(Lxs1;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1062
    .line 1063
    .line 1064
    goto :goto_11

    .line 1065
    :catchall_1
    move-exception v0

    .line 1066
    goto :goto_14

    .line 1067
    :catch_0
    move-exception v0

    .line 1068
    :try_start_4
    sget-object v2, Lsz;->θ:Lsz;

    .line 1069
    .line 1070
    invoke-virtual {v1, v2, v2, v0}, Ldg0;->δ(Lsz;Lsz;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1071
    .line 1072
    .line 1073
    :goto_11
    monitor-exit v3

    .line 1074
    if-eqz v8, :cond_26

    .line 1075
    .line 1076
    array-length v0, v8

    .line 1077
    :goto_12
    if-ge v9, v0, :cond_26

    .line 1078
    .line 1079
    aget-object v1, v8, v9

    .line 1080
    .line 1081
    monitor-enter v1

    .line 1082
    :try_start_5
    iget-wide v2, v1, Lkg0;->ι:J

    .line 1083
    .line 1084
    add-long/2addr v2, v5

    .line 1085
    iput-wide v2, v1, Lkg0;->ι:J

    .line 1086
    .line 1087
    if-lez v4, :cond_25

    .line 1088
    .line 1089
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1090
    .line 1091
    .line 1092
    :cond_25
    monitor-exit v1

    .line 1093
    add-int/lit8 v9, v9, 0x1

    .line 1094
    .line 1095
    goto :goto_12

    .line 1096
    :catchall_2
    move-exception v0

    .line 1097
    monitor-exit v1

    .line 1098
    throw v0

    .line 1099
    :cond_26
    sget-object v0, Ls62;->α:Ls62;

    .line 1100
    .line 1101
    return-object v0

    .line 1102
    :goto_13
    :try_start_6
    monitor-exit v1

    .line 1103
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1104
    :goto_14
    monitor-exit v3

    .line 1105
    throw v0

    .line 1106
    :pswitch_b
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast v1, Ldg0;

    .line 1109
    .line 1110
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1111
    .line 1112
    move-object v2, v0

    .line 1113
    check-cast v2, Lkg0;

    .line 1114
    .line 1115
    :try_start_7
    iget-object v0, v1, Ldg0;->ε:Lbg0;

    .line 1116
    .line 1117
    invoke-virtual {v0, v2}, Lbg0;->γ(Lkg0;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 1118
    .line 1119
    .line 1120
    goto :goto_15

    .line 1121
    :catch_1
    move-exception v0

    .line 1122
    sget-object v3, Lgh1;->α:Lf0;

    .line 1123
    .line 1124
    sget-object v3, Lgh1;->α:Lf0;

    .line 1125
    .line 1126
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    const-string v5, "Http2Connection.Listener failure for "

    .line 1129
    .line 1130
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1131
    .line 1132
    .line 1133
    iget-object v1, v1, Ldg0;->η:Ljava/lang/String;

    .line 1134
    .line 1135
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v1

    .line 1142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    const-string v3, "OkHttp"

    .line 1146
    .line 1147
    invoke-static {v3, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1148
    .line 1149
    .line 1150
    :try_start_8
    sget-object v1, Lsz;->θ:Lsz;

    .line 1151
    .line 1152
    invoke-virtual {v2, v1, v0}, Lkg0;->δ(Lsz;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 1153
    .line 1154
    .line 1155
    :catch_2
    :goto_15
    sget-object v0, Ls62;->α:Ls62;

    .line 1156
    .line 1157
    return-object v0

    .line 1158
    :pswitch_c
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v1, Lz81;

    .line 1161
    .line 1162
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v0, Lcom/example/dyhelper/MainHook;

    .line 1165
    .line 1166
    sget-object v2, Lsb;->α:Lsb;

    .line 1167
    .line 1168
    iget-object v1, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1169
    .line 1170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    sget-boolean v2, Lsb;->ι:Z

    .line 1174
    .line 1175
    if-eqz v2, :cond_27

    .line 1176
    .line 1177
    goto/16 :goto_18

    .line 1178
    .line 1179
    :cond_27
    sput-boolean v7, Lsb;->ι:Z

    .line 1180
    .line 1181
    sput-object v1, Lsb;->λ:Ljava/lang/ClassLoader;

    .line 1182
    .line 1183
    sput-object v0, Lsb;->μ:Lcom/example/dyhelper/MainHook;

    .line 1184
    .line 1185
    const-string v0, "r61b37e0812ef27a1"

    .line 1186
    .line 1187
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    :try_start_9
    new-instance v0, Ln7;

    .line 1191
    .line 1192
    const/4 v1, 0x7

    .line 1193
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 1194
    .line 1195
    .line 1196
    sget-object v1, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    new-instance v0, Ln7;

    .line 1202
    .line 1203
    invoke-direct {v0, v4}, Ln7;-><init>(I)V

    .line 1204
    .line 1205
    .line 1206
    sget-object v1, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1207
    .line 1208
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1209
    .line 1210
    .line 1211
    goto :goto_16

    .line 1212
    :catchall_3
    move-exception v0

    .line 1213
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    const-string v1, "r2676af736b9af546"

    .line 1218
    .line 1219
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    :goto_16
    const-class v0, Landroid/app/Activity;

    .line 1223
    .line 1224
    :try_start_a
    const-string v1, "onResume"

    .line 1225
    .line 1226
    new-array v2, v9, [Ljava/lang/Class;

    .line 1227
    .line 1228
    invoke-static {v0, v1, v2}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 1241
    .line 1242
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    new-instance v3, Lib;

    .line 1247
    .line 1248
    invoke-direct {v3, v5}, Lib;-><init>(I)V

    .line 1249
    .line 1250
    .line 1251
    invoke-interface {v1, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 1252
    .line 1253
    .line 1254
    const-string v1, "onPause"

    .line 1255
    .line 1256
    new-array v3, v9, [Ljava/lang/Class;

    .line 1257
    .line 1258
    invoke-static {v0, v1, v3}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    invoke-interface {v0, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    new-instance v1, Lib;

    .line 1275
    .line 1276
    const/16 v2, 0x17

    .line 1277
    .line 1278
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 1279
    .line 1280
    .line 1281
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1286
    .line 1287
    .line 1288
    goto :goto_17

    .line 1289
    :catchall_4
    move-exception v0

    .line 1290
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    const-string v1, "r1536811db8d50783"

    .line 1295
    .line 1296
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    :goto_17
    const-string v0, "rfbe702150c5f659f"

    .line 1300
    .line 1301
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    :goto_18
    sget-object v0, Ls62;->α:Ls62;

    .line 1305
    .line 1306
    return-object v0

    .line 1307
    :pswitch_d
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v1, Lnd0;

    .line 1310
    .line 1311
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1312
    .line 1313
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    if-eqz v0, :cond_28

    .line 1318
    .line 1319
    invoke-static {v0}, Lnd0;->θ(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v8

    .line 1323
    :cond_28
    if-nez v8, :cond_29

    .line 1324
    .line 1325
    const-string v8, ""

    .line 1326
    .line 1327
    :cond_29
    iput-object v8, v1, Lnd0;->Η:Ljava/lang/String;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Lnd0;->ε()V

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v1}, Lnd0;->η()V

    .line 1333
    .line 1334
    .line 1335
    goto/16 :goto_1

    .line 1336
    .line 1337
    :pswitch_e
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v1, Lum1;

    .line 1340
    .line 1341
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v0, Ldc0;

    .line 1344
    .line 1345
    :try_start_b
    iget-object v2, v0, Ldc0;->β:Ljava/lang/ClassLoader;

    .line 1346
    .line 1347
    new-instance v3, Lwb0;

    .line 1348
    .line 1349
    invoke-direct {v3, v0, v7}, Lwb0;-><init>(Ldc0;I)V

    .line 1350
    .line 1351
    .line 1352
    new-instance v4, Lyb0;

    .line 1353
    .line 1354
    invoke-direct {v4, v0, v9}, Lyb0;-><init>(Ldc0;I)V

    .line 1355
    .line 1356
    .line 1357
    invoke-static {v2, v3, v4}, Lx;->Γ(Ljava/lang/ClassLoader;Lp70;La80;)Lsb0;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1361
    goto :goto_19

    .line 1362
    :catchall_5
    move-exception v0

    .line 1363
    new-instance v2, Leo1;

    .line 1364
    .line 1365
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1366
    .line 1367
    .line 1368
    move-object v0, v2

    .line 1369
    :goto_19
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v2

    .line 1373
    if-nez v2, :cond_2a

    .line 1374
    .line 1375
    goto :goto_1a

    .line 1376
    :cond_2a
    new-instance v0, Lsb0;

    .line 1377
    .line 1378
    sget-object v3, Ljz;->ε:Ljz;

    .line 1379
    .line 1380
    invoke-static {v2}, Lec0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v2

    .line 1384
    const-string v4, "\u7fa4\u7533\u8bf7\u52a0\u8f7d\u5931\u8d25\uff1a"

    .line 1385
    .line 1386
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    invoke-direct {v0, v3, v3, v9, v2}, Lsb0;-><init>(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    :goto_1a
    iput-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 1394
    .line 1395
    goto/16 :goto_1

    .line 1396
    .line 1397
    :pswitch_f
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v1, Ldc0;

    .line 1400
    .line 1401
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, Ldb0;

    .line 1404
    .line 1405
    iget v2, v0, Ldb0;->α:I

    .line 1406
    .line 1407
    iget v0, v0, Ldb0;->β:I

    .line 1408
    .line 1409
    const-string v3, "\u6b63\u5728\u63d0\u4ea4\u5ba1\u6279 "

    .line 1410
    .line 1411
    const-string v4, "/"

    .line 1412
    .line 1413
    invoke-static {v2, v0, v3, v4}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    iput-object v0, v1, Ldc0;->χ:Ljava/lang/String;

    .line 1418
    .line 1419
    invoke-virtual {v1}, Ldc0;->η()V

    .line 1420
    .line 1421
    .line 1422
    goto/16 :goto_1

    .line 1423
    .line 1424
    :pswitch_10
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1425
    .line 1426
    check-cast v1, Ldc0;

    .line 1427
    .line 1428
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1429
    .line 1430
    check-cast v0, Lrb0;

    .line 1431
    .line 1432
    iget v2, v0, Lrb0;->β:I

    .line 1433
    .line 1434
    iget-object v3, v0, Lrb0;->γ:Ljava/lang/String;

    .line 1435
    .line 1436
    if-nez v2, :cond_2b

    .line 1437
    .line 1438
    const-string v0, "\u6b63\u5728\u8bc6\u522b\u53ef\u7ba1\u7406\u7fa4"

    .line 1439
    .line 1440
    goto :goto_1b

    .line 1441
    :cond_2b
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v4

    .line 1445
    if-eqz v4, :cond_2c

    .line 1446
    .line 1447
    const-string v0, "\u53d1\u73b0 "

    .line 1448
    .line 1449
    const-string v3, " \u4e2a\u53ef\u7ba1\u7406\u7fa4"

    .line 1450
    .line 1451
    invoke-static {v0, v2, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    goto :goto_1b

    .line 1456
    :cond_2c
    iget v0, v0, Lrb0;->α:I

    .line 1457
    .line 1458
    add-int/2addr v0, v7

    .line 1459
    const-string v4, "\u6b63\u5728\u67e5\u8be2 "

    .line 1460
    .line 1461
    const-string v5, "/"

    .line 1462
    .line 1463
    const-string v6, "\uff1a"

    .line 1464
    .line 1465
    invoke-static {v4, v0, v5, v2, v6}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v0

    .line 1469
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    :goto_1b
    iput-object v0, v1, Ldc0;->χ:Ljava/lang/String;

    .line 1477
    .line 1478
    invoke-virtual {v1}, Ldc0;->η()V

    .line 1479
    .line 1480
    .line 1481
    goto/16 :goto_1

    .line 1482
    .line 1483
    :pswitch_11
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1484
    .line 1485
    check-cast v1, Ldc0;

    .line 1486
    .line 1487
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1488
    .line 1489
    check-cast v0, Ljava/lang/Throwable;

    .line 1490
    .line 1491
    iput-boolean v9, v1, Ldc0;->φ:Z

    .line 1492
    .line 1493
    invoke-static {v0}, Lec0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    const-string v2, "\u7fa4\u7533\u8bf7\u5ba1\u6279\u5931\u8d25\uff1a"

    .line 1498
    .line 1499
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    iput-object v0, v1, Ldc0;->ψ:Ljava/lang/String;

    .line 1504
    .line 1505
    invoke-virtual {v1}, Ldc0;->η()V

    .line 1506
    .line 1507
    .line 1508
    iget-object v0, v1, Ldc0;->α:Landroid/app/Activity;

    .line 1509
    .line 1510
    iget-object v1, v1, Ldc0;->ψ:Ljava/lang/String;

    .line 1511
    .line 1512
    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1517
    .line 1518
    .line 1519
    goto/16 :goto_1

    .line 1520
    .line 1521
    :pswitch_12
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1524
    .line 1525
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1526
    .line 1527
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1528
    .line 1529
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    check-cast v0, Luk1;

    .line 1537
    .line 1538
    if-eqz v0, :cond_2d

    .line 1539
    .line 1540
    invoke-virtual {v0}, Luk1;->γ()V

    .line 1541
    .line 1542
    .line 1543
    :cond_2d
    sget-object v0, Ls62;->α:Ls62;

    .line 1544
    .line 1545
    return-object v0

    .line 1546
    :pswitch_13
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v1, Lg30;

    .line 1549
    .line 1550
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v0, Ljava/lang/ClassLoader;

    .line 1553
    .line 1554
    invoke-static {v1, v0, v7}, Lh30;->δ(Lg30;Ljava/lang/ClassLoader;Z)V

    .line 1555
    .line 1556
    .line 1557
    goto/16 :goto_1

    .line 1558
    .line 1559
    :pswitch_14
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1560
    .line 1561
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1562
    .line 1563
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1564
    .line 1565
    check-cast v0, Landroid/view/View;

    .line 1566
    .line 1567
    sget-object v2, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1568
    .line 1569
    invoke-virtual {v2, v1, v0}, Lcom/example/dyhelper/hook/γ;->к(Landroid/widget/FrameLayout;Landroid/view/View;)V

    .line 1570
    .line 1571
    .line 1572
    goto/16 :goto_1

    .line 1573
    .line 1574
    :pswitch_15
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1575
    .line 1576
    check-cast v1, Ljava/lang/String;

    .line 1577
    .line 1578
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v0, Landroid/view/View;

    .line 1581
    .line 1582
    sget-object v4, Lq10;->α:Lq10;

    .line 1583
    .line 1584
    sget-object v4, Lq10;->δ:Ljava/util/Map;

    .line 1585
    .line 1586
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    const-string v4, "FeedGestureActionLauncher"

    .line 1593
    .line 1594
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v5

    .line 1598
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v5

    .line 1602
    instance-of v7, v0, Landroid/view/ViewGroup;

    .line 1603
    .line 1604
    if-eqz v7, :cond_2e

    .line 1605
    .line 1606
    move-object v7, v0

    .line 1607
    check-cast v7, Landroid/view/ViewGroup;

    .line 1608
    .line 1609
    goto :goto_1c

    .line 1610
    :cond_2e
    move-object v7, v8

    .line 1611
    :goto_1c
    if-eqz v7, :cond_2f

    .line 1612
    .line 1613
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1614
    .line 1615
    .line 1616
    move-result v3

    .line 1617
    :cond_2f
    const-string v7, "\u6ce8\u518c Feed \u539f\u751f\u52a8\u4f5c\u6839 control="

    .line 1618
    .line 1619
    const-string v10, " view="

    .line 1620
    .line 1621
    const-string v11, " childCount="

    .line 1622
    .line 1623
    invoke-static {v7, v1, v10, v5, v11}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v5

    .line 1627
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v3

    .line 1634
    invoke-static {v4, v3, v8, v6, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    new-instance v3, Lsm1;

    .line 1638
    .line 1639
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1640
    .line 1641
    .line 1642
    invoke-static {v3, v1, v0, v0, v9}, Lq10;->γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V

    .line 1643
    .line 1644
    .line 1645
    new-instance v3, Ldg;

    .line 1646
    .line 1647
    invoke-direct {v3, v2, v0, v1}, Ldg;-><init>(ILandroid/view/View;Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1651
    .line 1652
    .line 1653
    new-instance v2, Ldg;

    .line 1654
    .line 1655
    const/4 v3, 0x3

    .line 1656
    invoke-direct {v2, v3, v0, v1}, Ldg;-><init>(ILandroid/view/View;Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    const-wide/16 v3, 0xa0

    .line 1660
    .line 1661
    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1662
    .line 1663
    .line 1664
    goto/16 :goto_1

    .line 1665
    .line 1666
    :pswitch_16
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1667
    .line 1668
    check-cast v1, Lr00;

    .line 1669
    .line 1670
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1671
    .line 1672
    check-cast v0, Ljava/lang/ClassLoader;

    .line 1673
    .line 1674
    invoke-static {v1, v0, v7}, Ls00;->δ(Lr00;Ljava/lang/ClassLoader;Z)V

    .line 1675
    .line 1676
    .line 1677
    goto/16 :goto_1

    .line 1678
    .line 1679
    :pswitch_17
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v1, Lav;

    .line 1682
    .line 1683
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1684
    .line 1685
    check-cast v0, Ll91;

    .line 1686
    .line 1687
    iget-object v0, v0, Ll91;->ε:Ljava/lang/Object;

    .line 1688
    .line 1689
    invoke-virtual {v1, v0}, Lav;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1690
    .line 1691
    .line 1692
    goto/16 :goto_1

    .line 1693
    .line 1694
    :pswitch_18
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1695
    .line 1696
    check-cast v1, La9;

    .line 1697
    .line 1698
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1699
    .line 1700
    check-cast v0, Ljava/lang/String;

    .line 1701
    .line 1702
    invoke-virtual {v1, v0}, La9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    goto/16 :goto_1

    .line 1706
    .line 1707
    :pswitch_19
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1708
    .line 1709
    check-cast v1, Lxn;

    .line 1710
    .line 1711
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1712
    .line 1713
    iget-object v1, v1, Lxn;->ε:Lv80;

    .line 1714
    .line 1715
    iget-object v2, v1, Lv80;->γ:Low1;

    .line 1716
    .line 1717
    invoke-virtual {v2}, Low1;->γ()Lnw1;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v3

    .line 1721
    move v4, v9

    .line 1722
    :goto_1d
    :try_start_c
    iget v5, v2, Low1;->ζ:I

    .line 1723
    .line 1724
    if-ge v4, v5, :cond_39

    .line 1725
    .line 1726
    invoke-virtual {v3, v4}, Lnw1;->μ(I)Z

    .line 1727
    .line 1728
    .line 1729
    move-result v5

    .line 1730
    if-eqz v5, :cond_33

    .line 1731
    .line 1732
    invoke-virtual {v3, v4}, Lnw1;->ξ(I)Ljava/lang/Object;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v5

    .line 1736
    if-eq v5, v0, :cond_32

    .line 1737
    .line 1738
    instance-of v7, v5, La90;

    .line 1739
    .line 1740
    if-eqz v7, :cond_30

    .line 1741
    .line 1742
    check-cast v5, La90;

    .line 1743
    .line 1744
    goto :goto_1e

    .line 1745
    :cond_30
    move-object v5, v8

    .line 1746
    :goto_1e
    if-eqz v5, :cond_31

    .line 1747
    .line 1748
    iget-object v5, v5, La90;->α:Lfn1;

    .line 1749
    .line 1750
    goto :goto_1f

    .line 1751
    :cond_31
    move-object v5, v8

    .line 1752
    :goto_1f
    if-ne v5, v0, :cond_33

    .line 1753
    .line 1754
    :cond_32
    new-instance v0, Lb41;

    .line 1755
    .line 1756
    invoke-direct {v0, v4, v8}, Lb41;-><init>(ILjava/lang/Integer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual {v3}, Lnw1;->γ()V

    .line 1760
    .line 1761
    .line 1762
    move-object v8, v0

    .line 1763
    goto :goto_25

    .line 1764
    :catchall_6
    move-exception v0

    .line 1765
    goto/16 :goto_27

    .line 1766
    .line 1767
    :cond_33
    :try_start_d
    iget-object v5, v3, Lnw1;->β:[I

    .line 1768
    .line 1769
    invoke-static {v4, v5}, Lqw1;->β(I[I)I

    .line 1770
    .line 1771
    .line 1772
    move-result v7

    .line 1773
    add-int/lit8 v10, v4, 0x1

    .line 1774
    .line 1775
    iget v11, v3, Lnw1;->γ:I

    .line 1776
    .line 1777
    if-ge v10, v11, :cond_34

    .line 1778
    .line 1779
    mul-int/lit8 v11, v10, 0x5

    .line 1780
    .line 1781
    add-int/2addr v11, v6

    .line 1782
    aget v5, v5, v11

    .line 1783
    .line 1784
    goto :goto_20

    .line 1785
    :cond_34
    iget v5, v3, Lnw1;->ε:I

    .line 1786
    .line 1787
    :goto_20
    sub-int/2addr v5, v7

    .line 1788
    move v7, v9

    .line 1789
    :goto_21
    if-ge v7, v5, :cond_3a

    .line 1790
    .line 1791
    invoke-virtual {v3, v4, v7}, Lnw1;->θ(II)Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v11

    .line 1795
    if-eq v11, v0, :cond_38

    .line 1796
    .line 1797
    instance-of v12, v11, La90;

    .line 1798
    .line 1799
    if-eqz v12, :cond_35

    .line 1800
    .line 1801
    check-cast v11, La90;

    .line 1802
    .line 1803
    goto :goto_22

    .line 1804
    :cond_35
    move-object v11, v8

    .line 1805
    :goto_22
    if-eqz v11, :cond_36

    .line 1806
    .line 1807
    iget-object v11, v11, La90;->α:Lfn1;

    .line 1808
    .line 1809
    goto :goto_23

    .line 1810
    :cond_36
    move-object v11, v8

    .line 1811
    :goto_23
    if-ne v11, v0, :cond_37

    .line 1812
    .line 1813
    goto :goto_24

    .line 1814
    :cond_37
    add-int/lit8 v7, v7, 0x1

    .line 1815
    .line 1816
    goto :goto_21

    .line 1817
    :cond_38
    :goto_24
    new-instance v8, Lb41;

    .line 1818
    .line 1819
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v0

    .line 1823
    invoke-direct {v8, v4, v0}, Lb41;-><init>(ILjava/lang/Integer;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1824
    .line 1825
    .line 1826
    :cond_39
    invoke-virtual {v3}, Lnw1;->γ()V

    .line 1827
    .line 1828
    .line 1829
    goto :goto_25

    .line 1830
    :cond_3a
    move v4, v10

    .line 1831
    goto :goto_1d

    .line 1832
    :goto_25
    if-eqz v8, :cond_3b

    .line 1833
    .line 1834
    iget v0, v8, Lb41;->α:I

    .line 1835
    .line 1836
    iget-object v3, v8, Lb41;->β:Ljava/lang/Integer;

    .line 1837
    .line 1838
    invoke-virtual {v2}, Low1;->γ()Lnw1;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v2

    .line 1842
    :try_start_e
    invoke-static {v2, v0, v3}, Lln0;->к(Lnw1;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 1846
    invoke-virtual {v2}, Lnw1;->γ()V

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v1}, Lv80;->Δ()Ljava/util/List;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v2

    .line 1853
    invoke-static {v0, v2}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v0

    .line 1857
    goto :goto_26

    .line 1858
    :catchall_7
    move-exception v0

    .line 1859
    invoke-virtual {v2}, Lnw1;->γ()V

    .line 1860
    .line 1861
    .line 1862
    throw v0

    .line 1863
    :cond_3b
    sget-object v0, Ljz;->ε:Ljz;

    .line 1864
    .line 1865
    :goto_26
    new-instance v2, Lhn;

    .line 1866
    .line 1867
    iget-boolean v1, v1, Lv80;->Ε:Z

    .line 1868
    .line 1869
    invoke-direct {v2, v0, v1}, Lhn;-><init>(Ljava/util/List;Z)V

    .line 1870
    .line 1871
    .line 1872
    return-object v2

    .line 1873
    :goto_27
    invoke-virtual {v3}, Lnw1;->γ()V

    .line 1874
    .line 1875
    .line 1876
    throw v0

    .line 1877
    :pswitch_1a
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1878
    .line 1879
    check-cast v1, Landroid/view/ViewGroup;

    .line 1880
    .line 1881
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1882
    .line 1883
    check-cast v0, Ljava/util/ArrayList;

    .line 1884
    .line 1885
    sget-object v3, Lsb;->Α:Ljava/util/Map;

    .line 1886
    .line 1887
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1888
    .line 1889
    .line 1890
    monitor-enter v3

    .line 1891
    :try_start_f
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v4

    .line 1895
    if-nez v4, :cond_3c

    .line 1896
    .line 1897
    new-instance v4, Lrb;

    .line 1898
    .line 1899
    invoke-direct {v4}, Lrb;-><init>()V

    .line 1900
    .line 1901
    .line 1902
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1903
    .line 1904
    .line 1905
    goto :goto_28

    .line 1906
    :catchall_8
    move-exception v0

    .line 1907
    goto :goto_29

    .line 1908
    :cond_3c
    :goto_28
    check-cast v4, Lrb;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 1909
    .line 1910
    monitor-exit v3

    .line 1911
    sget-object v3, Lsb;->α:Lsb;

    .line 1912
    .line 1913
    new-instance v3, Lz7;

    .line 1914
    .line 1915
    invoke-direct {v3, v4, v1, v0, v2}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1916
    .line 1917
    .line 1918
    invoke-static {v3}, Lsb;->Ω(Lp70;)V

    .line 1919
    .line 1920
    .line 1921
    goto/16 :goto_1

    .line 1922
    .line 1923
    :goto_29
    monitor-exit v3

    .line 1924
    throw v0

    .line 1925
    :pswitch_1b
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1926
    .line 1927
    check-cast v1, Lo8;

    .line 1928
    .line 1929
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1930
    .line 1931
    check-cast v0, Laq0;

    .line 1932
    .line 1933
    iget-object v2, v1, Lo8;->υ:Liv1;

    .line 1934
    .line 1935
    iget-object v3, v0, Laq0;->ε:Lfe;

    .line 1936
    .line 1937
    invoke-interface {v3}, Lcw;->α()J

    .line 1938
    .line 1939
    .line 1940
    move-result-wide v3

    .line 1941
    invoke-virtual {v0}, Laq0;->getLayoutDirection()Lnp0;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v5

    .line 1945
    invoke-interface {v2, v3, v4, v5, v0}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    iput-object v0, v1, Lo8;->Α:Lu81;

    .line 1950
    .line 1951
    goto/16 :goto_1

    .line 1952
    .line 1953
    :pswitch_1c
    iget-object v1, v0, Lp3;->ζ:Ljava/lang/Object;

    .line 1954
    .line 1955
    check-cast v1, Lme;

    .line 1956
    .line 1957
    iget-object v0, v0, Lp3;->η:Ljava/lang/Object;

    .line 1958
    .line 1959
    invoke-interface {v1, v0}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1960
    .line 1961
    .line 1962
    goto/16 :goto_1

    .line 1963
    .line 1964
    nop

    .line 1965
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
