.class public final synthetic Lvw;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Landroid/view/KeyEvent$Callback;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Lmq;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lvw;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lvw;->ζ:I

    .line 8
    .line 9
    iput-object p2, p0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 10
    .line 11
    iput-object p3, p0, Lvw;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lvw;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;ILxw;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lvw;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    iput-object p2, p0, Lvw;->θ:Ljava/lang/Object;

    iput p3, p0, Lvw;->ζ:I

    iput-object p4, p0, Lvw;->ι:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;ILandroid/widget/FrameLayout;Ldz0;I)V
    .locals 0

    .line 17
    iput p5, p0, Lvw;->ε:I

    iput-object p1, p0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    iput p2, p0, Lvw;->ζ:I

    iput-object p3, p0, Lvw;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvw;->ι:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/ProgressBar;ILandroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 18
    const/4 v0, 0x4

    iput v0, p0, Lvw;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    iput p2, p0, Lvw;->ζ:I

    iput-object p3, p0, Lvw;->ι:Ljava/lang/Object;

    iput-object p4, p0, Lvw;->θ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lvw;->ε:I

    .line 4
    .line 5
    const/16 v3, 0x10

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 12
    .line 13
    check-cast v1, Landroid/widget/ProgressBar;

    .line 14
    .line 15
    iget v2, v0, Lvw;->ζ:I

    .line 16
    .line 17
    iget-object v3, v0, Lvw;->ι:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v0, v0, Lvw;->θ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    const/16 v5, 0x64

    .line 26
    .line 27
    invoke-static {v2, v4, v5}, Lj81;->μ(III)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget v1, v0, Lvw;->ζ:I

    .line 39
    .line 40
    iget-object v3, v0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 41
    .line 42
    check-cast v3, Landroid/app/Activity;

    .line 43
    .line 44
    iget-object v4, v0, Lvw;->ι:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lmq;

    .line 47
    .line 48
    iget-object v0, v0, Lvw;->θ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    sget-object v5, Lsh1;->α:Lsh1;

    .line 53
    .line 54
    sget-object v6, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eq v6, v1, :cond_0

    .line 61
    .line 62
    const-string v0, "auto next pager fallback cancelled by newer interaction"

    .line 63
    .line 64
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_0
    sget-object v1, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object v2, v1

    .line 78
    check-cast v2, Landroid/app/Activity;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const/4 v2, 0x0

    .line 82
    :goto_0
    if-eq v2, v3, :cond_2

    .line 83
    .line 84
    const-string v0, "auto next pager fallback cancelled: activity changed"

    .line 85
    .line 86
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    sget-object v1, Lpq;->α:Lpq;

    .line 91
    .line 92
    invoke-static {}, Lpq;->α()Lmq;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    iget-wide v6, v1, Lmq;->δ:J

    .line 100
    .line 101
    iget-wide v8, v4, Lmq;->δ:J

    .line 102
    .line 103
    iget-object v2, v4, Lmq;->α:Ljava/lang/String;

    .line 104
    .line 105
    cmp-long v6, v6, v8

    .line 106
    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    if-eqz v2, :cond_6

    .line 111
    .line 112
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    iget-object v6, v1, Lmq;->α:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_6

    .line 126
    .line 127
    :goto_1
    iget-wide v2, v4, Lmq;->δ:J

    .line 128
    .line 129
    iget-wide v4, v1, Lmq;->δ:J

    .line 130
    .line 131
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v4, "auto next pager confirmed work change class="

    .line 136
    .line 137
    const-string v5, ", generation="

    .line 138
    .line 139
    invoke-static {v4, v0, v2, v3, v5}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v2, "->"

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    :goto_2
    invoke-virtual {v5, v3}, Lsh1;->υ(Landroid/app/Activity;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v3, "auto next pager work unchanged class="

    .line 166
    .line 167
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, ", nativeSwipeScheduled="

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :goto_3
    return-void

    .line 189
    :pswitch_1
    iget-object v1, v0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 190
    .line 191
    check-cast v1, Landroid/widget/LinearLayout;

    .line 192
    .line 193
    iget v2, v0, Lvw;->ζ:I

    .line 194
    .line 195
    iget-object v5, v0, Lvw;->θ:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v5, Landroid/widget/HorizontalScrollView;

    .line 198
    .line 199
    iget-object v0, v0, Lvw;->ι:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Ldz0;

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-nez v1, :cond_7

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {v0, v3}, Ldz0;->β(I)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    sub-int/2addr v1, v0

    .line 219
    if-gez v1, :cond_8

    .line 220
    .line 221
    move v1, v4

    .line 222
    :cond_8
    invoke-virtual {v5, v1, v4}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 223
    .line 224
    .line 225
    :goto_4
    return-void

    .line 226
    :pswitch_2
    iget-object v1, v0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 227
    .line 228
    check-cast v1, Landroid/widget/GridLayout;

    .line 229
    .line 230
    iget v2, v0, Lvw;->ζ:I

    .line 231
    .line 232
    iget-object v5, v0, Lvw;->θ:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v5, Landroid/widget/ScrollView;

    .line 235
    .line 236
    iget-object v0, v0, Lvw;->ι:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Ldz0;

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-nez v1, :cond_9

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v0, v3}, Ldz0;->β(I)I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    sub-int/2addr v1, v0

    .line 256
    if-gez v1, :cond_a

    .line 257
    .line 258
    move v1, v4

    .line 259
    :cond_a
    invoke-virtual {v5, v4, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 260
    .line 261
    .line 262
    :goto_5
    return-void

    .line 263
    :pswitch_3
    iget-object v1, v0, Lvw;->η:Landroid/view/KeyEvent$Callback;

    .line 264
    .line 265
    check-cast v1, Landroid/app/Activity;

    .line 266
    .line 267
    iget-object v5, v0, Lvw;->θ:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v5, Ljava/lang/String;

    .line 270
    .line 271
    iget v6, v0, Lvw;->ζ:I

    .line 272
    .line 273
    iget-object v0, v0, Lvw;->ι:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Lxw;

    .line 276
    .line 277
    const/16 v7, 0x18

    .line 278
    .line 279
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const/4 v8, 0x4

    .line 288
    const/4 v9, -0x1

    .line 289
    const/4 v10, 0x1

    .line 290
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 299
    .line 300
    new-instance v12, Lww;

    .line 301
    .line 302
    invoke-direct {v12, v4, v11}, Lww;-><init>(IF)V

    .line 303
    .line 304
    .line 305
    new-instance v11, Landroid/widget/LinearLayout;

    .line 306
    .line 307
    invoke-direct {v11, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 311
    .line 312
    .line 313
    const/16 v13, 0x11

    .line 314
    .line 315
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v7}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v14

    .line 322
    check-cast v14, Ljava/lang/Number;

    .line 323
    .line 324
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v14

    .line 328
    invoke-virtual {v12, v3}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v15

    .line 332
    check-cast v15, Ljava/lang/Number;

    .line 333
    .line 334
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v15

    .line 338
    invoke-virtual {v12, v7}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    check-cast v7, Ljava/lang/Number;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    invoke-virtual {v12, v3}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v16

    .line 352
    check-cast v16, Ljava/lang/Number;

    .line 353
    .line 354
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {v11, v14, v15, v7, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 359
    .line 360
    .line 361
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 362
    .line 363
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 364
    .line 365
    .line 366
    const/high16 v7, -0x1a000000

    .line 367
    .line 368
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v3}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, Ljava/lang/Number;

    .line 376
    .line 377
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    int-to-float v3, v3

    .line 382
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v11, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 386
    .line 387
    .line 388
    new-instance v2, Landroid/widget/TextView;

    .line 389
    .line 390
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 391
    .line 392
    .line 393
    const-string v3, " \u6e29\u99a8\u63d0\u9192"

    .line 394
    .line 395
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    const/high16 v3, 0x41900000    # 18.0f

    .line 399
    .line 400
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 410
    .line 411
    .line 412
    new-instance v2, Landroid/widget/TextView;

    .line 413
    .line 414
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 418
    .line 419
    .line 420
    const/high16 v3, 0x41700000    # 15.0f

    .line 421
    .line 422
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 429
    .line 430
    .line 431
    const/16 v3, 0x8

    .line 432
    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-virtual {v12, v3}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Ljava/lang/Number;

    .line 442
    .line 443
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    invoke-virtual {v12, v7}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, Ljava/lang/Number;

    .line 456
    .line 457
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v7

    .line 461
    invoke-virtual {v2, v4, v3, v4, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 462
    .line 463
    .line 464
    const/16 v3, 0x104

    .line 465
    .line 466
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v12, v3}, Lww;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, Ljava/lang/Number;

    .line 475
    .line 476
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 484
    .line 485
    .line 486
    new-instance v2, Landroid/widget/TextView;

    .line 487
    .line 488
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 489
    .line 490
    .line 491
    div-int/lit8 v3, v6, 0x3c

    .line 492
    .line 493
    rem-int/lit8 v6, v6, 0x3c
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    .line 495
    const-string v7, "\u5206\u949f"

    .line 496
    .line 497
    const-string v12, "\u5df2\u8fde\u7eed\u4f7f\u7528 "

    .line 498
    .line 499
    if-lez v3, :cond_b

    .line 500
    .line 501
    :try_start_1
    new-instance v14, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v3, "\u5c0f\u65f6"

    .line 510
    .line 511
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    goto :goto_6

    .line 525
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 526
    .line 527
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    :goto_6
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 541
    .line 542
    .line 543
    const/high16 v3, 0x41400000    # 12.0f

    .line 544
    .line 545
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 546
    .line 547
    .line 548
    const v3, -0x55000001

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 558
    .line 559
    .line 560
    new-instance v2, Landroid/widget/Toast;

    .line 561
    .line 562
    invoke-direct {v2, v1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2, v11}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v10}, Landroid/widget/Toast;->setDuration(I)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v13, v4, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 575
    .line 576
    .line 577
    goto :goto_7

    .line 578
    :catchall_0
    :try_start_2
    invoke-static {v1, v5, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 583
    .line 584
    .line 585
    :catchall_1
    :goto_7
    iget-boolean v0, v0, Lxw;->δ:Z

    .line 586
    .line 587
    if-eqz v0, :cond_f

    .line 588
    .line 589
    :try_start_3
    new-array v0, v8, [J

    .line 590
    .line 591
    fill-array-data v0, :array_0

    .line 592
    .line 593
    .line 594
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 595
    .line 596
    const/16 v3, 0x1f

    .line 597
    .line 598
    if-lt v2, v3, :cond_d

    .line 599
    .line 600
    const-string v2, "vibrator_manager"

    .line 601
    .line 602
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-static {v1}, Lp1;->Ε(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    if-eqz v2, :cond_c

    .line 611
    .line 612
    invoke-static {v1}, Lp1;->θ(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    goto :goto_8

    .line 617
    :catchall_2
    move-exception v0

    .line 618
    goto :goto_a

    .line 619
    :cond_c
    const/4 v1, 0x0

    .line 620
    :goto_8
    if-eqz v1, :cond_f

    .line 621
    .line 622
    invoke-static {v1}, Lp1;->η(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    if-eqz v1, :cond_f

    .line 627
    .line 628
    invoke-static {v0, v9}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 633
    .line 634
    .line 635
    goto :goto_b

    .line 636
    :cond_d
    const-string v2, "vibrator"

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    instance-of v2, v1, Landroid/os/Vibrator;

    .line 643
    .line 644
    if-eqz v2, :cond_e

    .line 645
    .line 646
    check-cast v1, Landroid/os/Vibrator;

    .line 647
    .line 648
    goto :goto_9

    .line 649
    :cond_e
    const/4 v1, 0x0

    .line 650
    :goto_9
    if-eqz v1, :cond_f

    .line 651
    .line 652
    invoke-static {v0, v9}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v1, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 657
    .line 658
    .line 659
    goto :goto_b

    .line 660
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    const-string v1, "\u632f\u52a8\u5931\u8d25: "

    .line 665
    .line 666
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    const-string v1, "DYHelper:DurationAlert"

    .line 671
    .line 672
    const/4 v2, 0x0

    .line 673
    invoke-static {v1, v0, v2, v8, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    :cond_f
    :goto_b
    return-void

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    :array_0
    .array-data 8
        0x0
        0xc8
        0x64
        0xc8
    .end array-data
.end method
