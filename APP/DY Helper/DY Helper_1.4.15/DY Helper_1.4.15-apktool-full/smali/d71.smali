.class public final synthetic Ld71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ZLandroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld71;->ε:I

    .line 2
    .line 3
    iput-boolean p1, p0, Ld71;->ζ:Z

    .line 4
    .line 5
    iput-object p2, p0, Ld71;->η:Landroid/app/Activity;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ld71;->ε:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x0

    .line 9
    sget-object v5, Ls62;->α:Ls62;

    .line 10
    .line 11
    iget-object v6, v0, Ld71;->η:Landroid/app/Activity;

    .line 12
    .line 13
    iget-boolean v0, v0, Ld71;->ζ:Z

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, "\u5bfc\u51fa\u804a\u5929\u8bb0\u5f55\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 22
    .line 23
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    const-string v0, "DYHelper: \u6253\u5f00\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa\u83dc\u5355"

    .line 33
    .line 34
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lq71;->α:Lq71;

    .line 38
    .line 39
    sget-object v0, Lnh0;->α:Lnh0;

    .line 40
    .line 41
    invoke-static {}, Lnh0;->ν()Lgh0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-boolean v1, v0, Lgh0;->α:Z

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 51
    .line 52
    invoke-direct {v1, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    const-string v2, "\u6682\u65f6\u65e0\u6cd5\u5bfc\u51fa"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v0, v0, Lgh0;->γ:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "\u77e5\u9053\u4e86"

    .line 68
    .line 69
    invoke-virtual {v0, v1, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 74
    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_1
    invoke-static {v6, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/16 v1, 0x16

    .line 83
    .line 84
    invoke-static {v6, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-static {v6, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-static {v6, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v6, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    invoke-virtual {v0, v9, v10, v1, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-direct {v1, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    const-string v9, "\u5df2\u8bc6\u522b\u5f53\u524d\u804a\u5929\u4f1a\u8bdd\n\u5bfc\u51fa\u4f1a\u5305\u542b\u6240\u6709\u6d88\u606f\u7c7b\u578b\uff0c\u672a\u77e5\u7c7b\u578b\u4f1a\u4fdd\u7559\u539f\u59cb\u5185\u5bb9\u3002"

    .line 109
    .line 110
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    const/high16 v9, 0x41500000    # 13.0f

    .line 114
    .line 115
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 116
    .line 117
    .line 118
    const v9, -0x777778

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    .line 123
    .line 124
    const/16 v10, 0xc

    .line 125
    .line 126
    invoke-static {v6, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    invoke-virtual {v1, v4, v4, v4, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 131
    .line 132
    .line 133
    new-instance v11, Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-direct {v11, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    const/high16 v12, 0x41600000    # 14.0f

    .line 139
    .line 140
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 141
    .line 142
    .line 143
    sget-object v13, Lq71;->γ:Lxx;

    .line 144
    .line 145
    const-string v14, "theme"

    .line 146
    .line 147
    if-eqz v13, :cond_3

    .line 148
    .line 149
    iget-object v13, v13, Lxx;->λ:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    const/16 v15, 0xb

    .line 163
    .line 164
    invoke-static {v6, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    invoke-static {v6, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-static {v6, v15}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    invoke-virtual {v11, v13, v8, v10, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 177
    .line 178
    .line 179
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 180
    .line 181
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-static {v6, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    int-to-float v2, v2

    .line 189
    invoke-virtual {v8, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 190
    .line 191
    .line 192
    sget-object v2, Lq71;->γ:Lxx;

    .line 193
    .line 194
    if-eqz v2, :cond_2

    .line 195
    .line 196
    iget-object v2, v2, Lxx;->μ:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v8, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v6, v11}, Lq71;->Ο(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 209
    .line 210
    .line 211
    new-instance v2, Ll9;

    .line 212
    .line 213
    const/16 v8, 0x9

    .line 214
    .line 215
    invoke-direct {v2, v6, v8, v11}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    .line 220
    .line 221
    new-instance v2, Landroid/widget/TextView;

    .line 222
    .line 223
    invoke-direct {v2, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 224
    .line 225
    .line 226
    const-string v8, "\u5bfc\u51fa\u683c\u5f0f"

    .line 227
    .line 228
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-virtual {v2, v8, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 239
    .line 240
    .line 241
    const/16 v8, 0x10

    .line 242
    .line 243
    invoke-static {v6, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    invoke-static {v6, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v2, v4, v8, v4, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 252
    .line 253
    .line 254
    new-instance v3, Landroid/widget/RadioGroup;

    .line 255
    .line 256
    invoke-direct {v3, v6}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 260
    .line 261
    .line 262
    new-instance v8, Landroid/widget/RadioButton;

    .line 263
    .line 264
    invoke-direct {v8, v6}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    invoke-virtual {v8, v10}, Landroid/view/View;->setId(I)V

    .line 272
    .line 273
    .line 274
    const-string v10, "TXT\uff08\u63a8\u8350\uff0c\u76f4\u63a5\u9605\u8bfb\uff09"

    .line 275
    .line 276
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 280
    .line 281
    .line 282
    new-instance v10, Landroid/widget/RadioButton;

    .line 283
    .line 284
    invoke-direct {v10, v6}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    invoke-virtual {v10, v12}, Landroid/view/View;->setId(I)V

    .line 292
    .line 293
    .line 294
    const-string v12, "JSON\uff08\u5b8c\u6574\u7ed3\u6784\u5316\u5907\u4efd\uff09"

    .line 295
    .line 296
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 303
    .line 304
    .line 305
    new-instance v8, Landroid/widget/CheckBox;

    .line 306
    .line 307
    invoke-direct {v8, v6}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    const-string v12, "\u5bfc\u51fa\u5b8c\u6574\u804a\u5929\u8bb0\u5f55"

    .line 311
    .line 312
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 316
    .line 317
    .line 318
    const/16 v12, 0x8

    .line 319
    .line 320
    invoke-static {v6, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    invoke-virtual {v8, v4, v12, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 325
    .line 326
    .line 327
    new-instance v12, Landroid/widget/TextView;

    .line 328
    .line 329
    invoke-direct {v12, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 330
    .line 331
    .line 332
    const-string v13, "\u5f00\u542f\u540e\u4f1a\u6301\u7eed\u8bfb\u53d6\u66f4\u65e9\u6d88\u606f\uff0c\u76f4\u5230\u786e\u8ba4\u6ca1\u6709\u65b0\u589e\uff1b\u5173\u95ed\u540e\u4ec5\u5bfc\u51fa\u5f53\u524d\u804a\u5929\u9875\u5df2\u663e\u793a\u7684\u6d88\u606f\u3002"

    .line 333
    .line 334
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    const/high16 v13, 0x41400000    # 12.0f

    .line 338
    .line 339
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 361
    .line 362
    .line 363
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 364
    .line 365
    invoke-direct {v1, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 366
    .line 367
    .line 368
    const-string v2, "\u5bfc\u51fa\u804a\u5929\u8bb0\u5f55"

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    new-instance v1, Lp61;

    .line 379
    .line 380
    invoke-direct {v1, v6, v8, v10, v4}, Lp61;-><init>(Landroid/app/Activity;Landroid/widget/CheckBox;Landroid/widget/RadioButton;I)V

    .line 381
    .line 382
    .line 383
    const-string v2, "\u5f00\u59cb\u5bfc\u51fa"

    .line 384
    .line 385
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    new-instance v1, Lp61;

    .line 390
    .line 391
    invoke-direct {v1, v6, v8, v10, v7}, Lp61;-><init>(Landroid/app/Activity;Landroid/widget/CheckBox;Landroid/widget/RadioButton;I)V

    .line 392
    .line 393
    .line 394
    const-string v2, "\u9009\u62e9\u65e5\u671f"

    .line 395
    .line 396
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    const-string v1, "\u53d6\u6d88"

    .line 401
    .line 402
    const/4 v2, 0x0

    .line 403
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 408
    .line 409
    .line 410
    :goto_0
    return-object v5

    .line 411
    :cond_2
    const/4 v2, 0x0

    .line 412
    invoke-static {v14}, Lln0;->и(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v2

    .line 416
    :cond_3
    move-object v2, v8

    .line 417
    invoke-static {v14}, Lln0;->и(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v2

    .line 421
    :pswitch_0
    if-nez v0, :cond_4

    .line 422
    .line 423
    const-string v0, "\u4e00\u952e\u5df2\u8bfb\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 424
    .line 425
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 430
    .line 431
    .line 432
    goto :goto_1

    .line 433
    :cond_4
    const-string v0, "\u6b63\u5728\u63d0\u4ea4\u4e00\u952e\u5df2\u8bfb\u8bf7\u6c42\u2026"

    .line 434
    .line 435
    invoke-static {v6, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 440
    .line 441
    .line 442
    sget-object v0, Lzj0;->α:Lzj0;

    .line 443
    .line 444
    new-instance v1, Lf9;

    .line 445
    .line 446
    const/16 v2, 0x1a

    .line 447
    .line 448
    invoke-direct {v1, v6, v2}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v6, v1}, Lzj0;->ψ(Landroid/app/Activity;La80;)V

    .line 452
    .line 453
    .line 454
    :goto_1
    return-object v5

    .line 455
    :pswitch_1
    if-nez v0, :cond_5

    .line 456
    .line 457
    const-string v0, "\u9ab0\u5b50\u63a7\u5236\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 458
    .line 459
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 464
    .line 465
    .line 466
    goto :goto_2

    .line 467
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    new-instance v0, Ln9;

    .line 471
    .line 472
    invoke-direct {v0, v6, v3}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v6, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 476
    .line 477
    .line 478
    :goto_2
    return-object v5

    .line 479
    :pswitch_2
    if-nez v0, :cond_6

    .line 480
    .line 481
    const-string v0, "\u706b\u82b1\u7eed\u671f\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 482
    .line 483
    invoke-static {v6, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 488
    .line 489
    .line 490
    goto :goto_3

    .line 491
    :cond_6
    sget-object v0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 492
    .line 493
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    new-instance v0, Lhg1;

    .line 497
    .line 498
    invoke-direct {v0, v6, v2}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v6, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 502
    .line 503
    .line 504
    :goto_3
    return-object v5

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
