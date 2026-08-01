.class public final Lee;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lw6;

.field public final synthetic d:Ljava/lang/ClassLoader;

.field public final synthetic e:Lpd;

.field public final synthetic f:Ln9;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Landroid/app/Activity;Lw6;Ljava/lang/ClassLoader;Lpd;Ln9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lee;->a:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, Lee;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lee;->c:Lw6;

    .line 9
    .line 10
    iput-object p4, p0, Lee;->d:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    iput-object p5, p0, Lee;->e:Lpd;

    .line 13
    .line 14
    iput-object p6, p0, Lee;->f:Ln9;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lee;->a:Landroid/app/Dialog;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :catchall_0
    iget-object v1, v0, Lee;->c:Lw6;

    .line 9
    .line 10
    iget-object v8, v0, Lee;->b:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {v8, v1}, Lcom/mr/elaris/w;->d(Landroid/content/Context;Lw6;)V

    .line 13
    .line 14
    .line 15
    if-eqz v8, :cond_8

    .line 16
    .line 17
    iget-object v4, v0, Lee;->f:Ln9;

    .line 18
    .line 19
    iget-object v1, v4, Ln9;->a:Ljava/io/File;

    .line 20
    .line 21
    iget-boolean v2, v4, Ln9;->h:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v1, v4, Ln9;->b:Landroid/net/Uri;

    .line 43
    .line 44
    if-eqz v1, :cond_8

    .line 45
    .line 46
    :goto_0
    iget-object v1, v4, Ln9;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, v4, Ln9;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v2}, Lcom/mr/elaris/w;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    const-string v0, "\u8bf7\u9009\u62e9 QQ \u8bed\u97f3\u6216\u53ef\u89e3\u7801\u7684\u97f3\u9891\u6587\u4ef6"

    .line 57
    .line 58
    invoke-static {v8, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_2
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    move-object v3, v8

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object v3, v1

    .line 76
    :goto_1
    new-instance v6, Landroid/os/Handler;

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v6, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 83
    .line 84
    .line 85
    new-instance v5, Lve;

    .line 86
    .line 87
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/4 v2, 0x1

    .line 99
    const/4 v9, 0x0

    .line 100
    if-nez v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v8}, Landroid/app/Activity;->isDestroyed()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_4
    new-instance v1, Landroid/app/Dialog;

    .line 111
    .line 112
    invoke-direct {v1, v8}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    :try_start_1
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    :catchall_1
    invoke-static {v1}, Lu9;->d(Landroid/app/Dialog;)V

    .line 119
    .line 120
    .line 121
    new-instance v11, Landroid/widget/LinearLayout;

    .line 122
    .line 123
    invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 127
    .line 128
    .line 129
    const/high16 v12, 0x41900000    # 18.0f

    .line 130
    .line 131
    invoke-static {v8, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    const/high16 v14, 0x41800000    # 16.0f

    .line 136
    .line 137
    invoke-static {v8, v14}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    invoke-static {v8, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    const/high16 v15, 0x41600000    # 14.0f

    .line 146
    .line 147
    invoke-static {v8, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    invoke-virtual {v11, v13, v14, v12, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 152
    .line 153
    .line 154
    invoke-static {v8}, Lcom/mr/elaris/w;->l0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    invoke-virtual {v11, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    new-instance v12, Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-direct {v12, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    const-string v13, "\u8bed\u97f3\u5904\u7406"

    .line 167
    .line 168
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v8}, Lu9;->G(Landroid/content/Context;)I

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 176
    .line 177
    .line 178
    const/high16 v13, 0x41880000    # 17.0f

    .line 179
    .line 180
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 181
    .line 182
    .line 183
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 184
    .line 185
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 186
    .line 187
    .line 188
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 189
    .line 190
    const/4 v15, -0x1

    .line 191
    const/4 v10, -0x2

    .line 192
    invoke-direct {v14, v15, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v11, v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    .line 197
    .line 198
    new-instance v12, Landroid/widget/TextView;

    .line 199
    .line 200
    invoke-direct {v12, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 201
    .line 202
    .line 203
    const-string v14, "\u6b63\u5728\u5904\u7406\u8bed\u97f3\uff0c\u53ef\u53d6\u6d88"

    .line 204
    .line 205
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v8}, Lu9;->E(Landroid/content/Context;)I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    .line 214
    .line 215
    const/high16 v14, 0x41500000    # 13.0f

    .line 216
    .line 217
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 218
    .line 219
    .line 220
    const/high16 v14, 0x41000000    # 8.0f

    .line 221
    .line 222
    invoke-static {v8, v14}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    const/high16 v2, 0x41400000    # 12.0f

    .line 227
    .line 228
    invoke-static {v8, v2}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-virtual {v12, v9, v14, v9, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 233
    .line 234
    .line 235
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 236
    .line 237
    invoke-direct {v2, v15, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v11, v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 241
    .line 242
    .line 243
    new-instance v2, Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-direct {v2, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 246
    .line 247
    .line 248
    const-string v12, "\u53d6\u6d88"

    .line 249
    .line 250
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    const/16 v12, 0x11

    .line 254
    .line 255
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 256
    .line 257
    .line 258
    invoke-static {v8}, Lu9;->c(Landroid/content/Context;)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v8}, Lcom/mr/elaris/w;->i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    invoke-virtual {v2, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 273
    .line 274
    .line 275
    new-instance v12, Lb2;

    .line 276
    .line 277
    const/4 v13, 0x2

    .line 278
    invoke-direct {v12, v5, v1, v13}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 285
    .line 286
    const/high16 v13, 0x42100000    # 36.0f

    .line 287
    .line 288
    invoke-static {v8, v13}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    invoke-direct {v12, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v11, v2, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v11}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 299
    .line 300
    .line 301
    :try_start_2
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    if-eqz v2, :cond_5

    .line 309
    .line 310
    const v11, 0x106000d

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v11}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    const/high16 v12, 0x437a0000    # 250.0f

    .line 321
    .line 322
    invoke-static {v8, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    const/high16 v13, 0x43c30000    # 390.0f

    .line 327
    .line 328
    invoke-static {v8, v13}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 329
    .line 330
    .line 331
    move-result v13

    .line 332
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    iget v14, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 341
    .line 342
    const/high16 v15, 0x42700000    # 60.0f

    .line 343
    .line 344
    invoke-static {v8, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    sub-int/2addr v14, v15

    .line 349
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 350
    .line 351
    .line 352
    move-result v13

    .line 353
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    iput v12, v11, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 358
    .line 359
    iput v10, v11, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 360
    .line 361
    const v10, 0x3ecccccd    # 0.4f

    .line 362
    .line 363
    .line 364
    iput v10, v11, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 365
    .line 366
    invoke-virtual {v2, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 367
    .line 368
    .line 369
    :cond_5
    move-object v12, v1

    .line 370
    const/4 v1, 0x1

    .line 371
    goto :goto_3

    .line 372
    :catchall_2
    :cond_6
    :goto_2
    const/4 v1, 0x1

    .line 373
    const/4 v12, 0x0

    .line 374
    :goto_3
    new-array v11, v1, [Z

    .line 375
    .line 376
    aput-boolean v9, v11, v9

    .line 377
    .line 378
    if-eqz v12, :cond_7

    .line 379
    .line 380
    new-instance v1, Lme;

    .line 381
    .line 382
    invoke-direct {v1, v11, v5, v9}, Lme;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 386
    .line 387
    .line 388
    :cond_7
    new-instance v1, Ljava/lang/Thread;

    .line 389
    .line 390
    new-instance v2, Lne;

    .line 391
    .line 392
    iget-object v9, v0, Lee;->d:Ljava/lang/ClassLoader;

    .line 393
    .line 394
    iget-object v10, v0, Lee;->e:Lpd;

    .line 395
    .line 396
    invoke-direct/range {v2 .. v12}, Lne;-><init>(Landroid/content/Context;Ln9;Lve;Landroid/os/Handler;ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;[ZLandroid/app/Dialog;)V

    .line 397
    .line 398
    .line 399
    const-string v0, "Elaris-LocalVoiceSend"

    .line 400
    .line 401
    invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_8
    :goto_4
    const-string v0, "\u672c\u5730\u8bed\u97f3\u8bfb\u53d6\u5931\u8d25"

    .line 409
    .line 410
    invoke-static {v8, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :goto_5
    return-void
.end method
