.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic Γ:I


# instance fields
.field public Α:F

.field public Β:I

.field public final ε:Lg52;

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public final ι:I

.field public final κ:I

.field public λ:I

.field public μ:Lf52;

.field public ν:F

.field public ξ:Landroid/animation/ValueAnimator;

.field public final ο:Landroid/view/animation/PathInterpolator;

.field public final π:Landroid/widget/FrameLayout;

.field public final ρ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;

.field public final σ:Landroid/widget/LinearLayout;

.field public final τ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;

.field public final υ:Landroid/widget/TextView;

.field public final φ:Landroid/widget/TextView;

.field public final χ:Landroid/widget/TextView;

.field public final ψ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;

.field public final ω:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg52;Ltv1;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct/range {p0 .. p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v2, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ε:Lg52;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 27
    .line 28
    const/high16 v4, 0x41e00000    # 28.0f

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    sub-int/2addr v3, v5

    .line 35
    const/high16 v5, 0x43ba0000    # 372.0f

    .line 36
    .line 37
    invoke-virtual {v0, v5}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iput v3, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ζ:I

    .line 46
    .line 47
    const/high16 v5, 0x42940000    # 74.0f

    .line 48
    .line 49
    invoke-virtual {v0, v5}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iput v5, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->η:I

    .line 54
    .line 55
    const/high16 v6, 0x42580000    # 54.0f

    .line 56
    .line 57
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    iput v6, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->θ:I

    .line 62
    .line 63
    const/high16 v6, 0x42180000    # 38.0f

    .line 64
    .line 65
    invoke-virtual {v0, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    iput v7, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ι:I

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    iput v4, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->κ:I

    .line 76
    .line 77
    const/4 v4, -0x1

    .line 78
    iput v4, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->λ:I

    .line 79
    .line 80
    sget-object v8, Lf52;->ε:Lf52;

    .line 81
    .line 82
    iput-object v8, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->μ:Lf52;

    .line 83
    .line 84
    const/high16 v8, 0x3f800000    # 1.0f

    .line 85
    .line 86
    iput v8, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 87
    .line 88
    new-instance v9, Landroid/view/animation/PathInterpolator;

    .line 89
    .line 90
    const v10, 0x3e23d70a    # 0.16f

    .line 91
    .line 92
    .line 93
    const v11, 0x3e99999a    # 0.3f

    .line 94
    .line 95
    .line 96
    invoke-direct {v9, v10, v8, v11, v8}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 97
    .line 98
    .line 99
    iput-object v9, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ο:Landroid/view/animation/PathInterpolator;

    .line 100
    .line 101
    new-instance v9, Landroid/widget/FrameLayout;

    .line 102
    .line 103
    invoke-direct {v9, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    const/high16 v10, 0x41600000    # 14.0f

    .line 107
    .line 108
    invoke-virtual {v0, v10}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    int-to-float v11, v11

    .line 113
    invoke-virtual {v9, v11}, Landroid/view/View;->setElevation(F)V

    .line 114
    .line 115
    .line 116
    const/4 v11, 0x1

    .line 117
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v11}, Landroid/view/View;->setClipToOutline(Z)V

    .line 124
    .line 125
    .line 126
    sget-object v12, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    .line 127
    .line 128
    invoke-virtual {v9, v12}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 129
    .line 130
    .line 131
    iput-object v9, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->π:Landroid/widget/FrameLayout;

    .line 132
    .line 133
    new-instance v12, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;

    .line 134
    .line 135
    invoke-direct {v12, v1, v2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;-><init>(Landroid/content/Context;Lg52;)V

    .line 136
    .line 137
    .line 138
    iput-object v12, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ρ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;

    .line 139
    .line 140
    new-instance v2, Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 143
    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    invoke-virtual {v2, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 147
    .line 148
    .line 149
    const/16 v14, 0x10

    .line 150
    .line 151
    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 152
    .line 153
    .line 154
    const/high16 v14, 0x41500000    # 13.0f

    .line 155
    .line 156
    invoke-virtual {v0, v14}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    const/high16 v8, 0x41100000    # 9.0f

    .line 161
    .line 162
    invoke-virtual {v0, v8}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    invoke-virtual {v0, v14}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    invoke-virtual {v0, v8}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-virtual {v2, v15, v4, v14, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 175
    .line 176
    .line 177
    iput-object v2, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->σ:Landroid/widget/LinearLayout;

    .line 178
    .line 179
    new-instance v4, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;

    .line 180
    .line 181
    invoke-direct {v4, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;-><init>(Landroid/content/Context;)V

    .line 182
    .line 183
    .line 184
    iput-object v4, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->τ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;

    .line 185
    .line 186
    new-instance v8, Landroid/widget/TextView;

    .line 187
    .line 188
    invoke-direct {v8, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 192
    .line 193
    .line 194
    const v10, -0xeee7d9

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 198
    .line 199
    .line 200
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 201
    .line 202
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 209
    .line 210
    .line 211
    iput-object v8, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->υ:Landroid/widget/TextView;

    .line 212
    .line 213
    new-instance v14, Landroid/widget/TextView;

    .line 214
    .line 215
    invoke-direct {v14, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    const/high16 v15, 0x41400000    # 12.0f

    .line 219
    .line 220
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 221
    .line 222
    .line 223
    const v6, -0xa0998d

    .line 224
    .line 225
    .line 226
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v14, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 233
    .line 234
    .line 235
    iput-object v14, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->φ:Landroid/widget/TextView;

    .line 236
    .line 237
    new-instance v6, Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 243
    .line 244
    .line 245
    const v15, -0xe67606

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 252
    .line 253
    .line 254
    const/16 v10, 0x11

    .line 255
    .line 256
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 257
    .line 258
    .line 259
    const/high16 v10, 0x42180000    # 38.0f

    .line 260
    .line 261
    invoke-virtual {v0, v10}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 269
    .line 270
    .line 271
    iput-object v6, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->χ:Landroid/widget/TextView;

    .line 272
    .line 273
    new-instance v10, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;

    .line 274
    .line 275
    invoke-direct {v10, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    const-string v15, "\u5173\u95ed\u901a\u77e5"

    .line 279
    .line 280
    invoke-virtual {v10, v15}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v10, v11}, Landroid/view/View;->setClickable(Z)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 287
    .line 288
    .line 289
    new-instance v15, Lcom/example/dyhelper/ui/ω;

    .line 290
    .line 291
    invoke-direct {v15, v10, v11}, Lcom/example/dyhelper/ui/ω;-><init>(Landroid/view/View;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v10, v15}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 295
    .line 296
    .line 297
    new-instance v11, Lcom/example/dyhelper/ui/η;

    .line 298
    .line 299
    const/4 v15, 0x1

    .line 300
    move-object/from16 v13, p3

    .line 301
    .line 302
    invoke-direct {v11, v15, v13}, Lcom/example/dyhelper/ui/η;-><init>(ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    .line 307
    .line 308
    iput-object v10, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ψ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;

    .line 309
    .line 310
    new-instance v11, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;

    .line 311
    .line 312
    invoke-direct {v11, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;-><init>(Landroid/content/Context;)V

    .line 313
    .line 314
    .line 315
    iput-object v11, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ω:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 322
    .line 323
    .line 324
    new-instance v13, Landroid/widget/LinearLayout;

    .line 325
    .line 326
    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 327
    .line 328
    .line 329
    const/4 v1, 0x1

    .line 330
    invoke-virtual {v13, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 331
    .line 332
    .line 333
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 334
    .line 335
    const/4 v15, -0x2

    .line 336
    move/from16 v16, v3

    .line 337
    .line 338
    const/4 v3, -0x1

    .line 339
    invoke-direct {v1, v3, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v13, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 343
    .line 344
    .line 345
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 346
    .line 347
    invoke-direct {v1, v3, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 348
    .line 349
    .line 350
    const/high16 v8, 0x40a00000    # 5.0f

    .line 351
    .line 352
    invoke-virtual {v0, v8}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 357
    .line 358
    invoke-virtual {v13, v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 359
    .line 360
    .line 361
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 362
    .line 363
    const/high16 v8, 0x40800000    # 4.0f

    .line 364
    .line 365
    invoke-virtual {v0, v8}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    invoke-direct {v1, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 370
    .line 371
    .line 372
    const/high16 v3, 0x41000000    # 8.0f

    .line 373
    .line 374
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 379
    .line 380
    invoke-virtual {v13, v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 381
    .line 382
    .line 383
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 384
    .line 385
    invoke-direct {v1, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 389
    .line 390
    .line 391
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 392
    .line 393
    const/high16 v4, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    invoke-direct {v1, v7, v15, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41300000    # 11.0f

    .line 400
    .line 401
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 406
    .line 407
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 412
    .line 413
    invoke-virtual {v2, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 414
    .line 415
    .line 416
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 417
    .line 418
    invoke-direct {v1, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    .line 423
    .line 424
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 425
    .line 426
    const/high16 v3, 0x41d00000    # 26.0f

    .line 427
    .line 428
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 437
    .line 438
    .line 439
    const/high16 v3, 0x40c00000    # 6.0f

    .line 440
    .line 441
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 446
    .line 447
    invoke-virtual {v2, v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 448
    .line 449
    .line 450
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 451
    .line 452
    const/4 v3, -0x1

    .line 453
    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v9, v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 457
    .line 458
    .line 459
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 460
    .line 461
    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 465
    .line 466
    .line 467
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 468
    .line 469
    const/16 v2, 0x31

    .line 470
    .line 471
    move/from16 v3, v16

    .line 472
    .line 473
    invoke-direct {v1, v3, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 477
    .line 478
    .line 479
    const/high16 v4, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    invoke-virtual {v0, v13, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->α(IF)V

    .line 483
    .line 484
    .line 485
    iput v4, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Α:F

    .line 486
    .line 487
    return-void
.end method

.method public static δ(FFF)F
    .locals 2

    .line 1
    sub-float/2addr p1, p0

    .line 2
    const/4 v0, 0x0

    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {p2, v0, v1}, Lj81;->λ(FFF)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    mul-float/2addr p2, p1

    .line 10
    add-float/2addr p2, p0

    .line 11
    return p2
.end method


# virtual methods
.method public final α(IF)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    invoke-static {p2, v0, v1}, Lj81;->λ(FFF)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Α:F

    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p2, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->β(Ljava/lang/Float;Ljava/lang/Integer;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final β(Ljava/lang/Float;Ljava/lang/Integer;)V
    .locals 13

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Α:F

    .line 9
    .line 10
    :goto_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Β:I

    .line 18
    .line 19
    :goto_1
    iput p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Β:I

    .line 20
    .line 21
    iget v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ν:F

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/high16 v2, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lj81;->λ(FFF)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez p2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    sub-float v1, v2, p1

    .line 34
    .line 35
    :goto_2
    const/high16 v3, 0x3f000000    # 0.5f

    .line 36
    .line 37
    cmpg-float v3, v0, v3

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    const v5, 0x3e3851ec    # 0.18f

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    if-ltz v3, :cond_3

    .line 45
    .line 46
    cmpg-float v3, p1, v5

    .line 47
    .line 48
    if-gez v3, :cond_4

    .line 49
    .line 50
    :cond_3
    const v3, 0x3f3851ec    # 0.72f

    .line 51
    .line 52
    .line 53
    cmpg-float v3, v1, v3

    .line 54
    .line 55
    if-gez v3, :cond_4

    .line 56
    .line 57
    move v3, v4

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v3, v6

    .line 60
    :goto_3
    iget v7, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ι:I

    .line 61
    .line 62
    int-to-float v8, v7

    .line 63
    iget v9, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->η:I

    .line 64
    .line 65
    sub-int/2addr v9, v7

    .line 66
    int-to-float v9, v9

    .line 67
    mul-float/2addr v9, p1

    .line 68
    add-float/2addr v9, v8

    .line 69
    iget v10, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->κ:I

    .line 70
    .line 71
    int-to-float v11, v10

    .line 72
    iget v12, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->θ:I

    .line 73
    .line 74
    sub-int/2addr v12, v10

    .line 75
    int-to-float v12, v12

    .line 76
    mul-float/2addr v12, p1

    .line 77
    add-float/2addr v12, v11

    .line 78
    invoke-static {v12, v9, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    invoke-static {v12, v9, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    iget v12, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ζ:I

    .line 87
    .line 88
    sub-int v7, v12, v7

    .line 89
    .line 90
    int-to-float v7, v7

    .line 91
    mul-float/2addr v7, p1

    .line 92
    add-float/2addr v7, v8

    .line 93
    const/high16 v8, 0x42000000    # 32.0f

    .line 94
    .line 95
    invoke-virtual {p0, v8}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    sub-int/2addr v12, v8

    .line 100
    sub-int/2addr v12, v10

    .line 101
    int-to-float v8, v12

    .line 102
    mul-float/2addr v8, p1

    .line 103
    add-float/2addr v8, v11

    .line 104
    invoke-static {v8, v7, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    invoke-static {v8, v7, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    iget-object v8, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->π:Landroid/widget/FrameLayout;

    .line 113
    .line 114
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 122
    .line 123
    float-to-int v7, v7

    .line 124
    iput v7, v10, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 125
    .line 126
    float-to-int v7, v9

    .line 127
    iput v7, v10, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 128
    .line 129
    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    .line 131
    .line 132
    int-to-float v7, p2

    .line 133
    const/high16 v9, 0x42400000    # 48.0f

    .line 134
    .line 135
    mul-float/2addr v7, v9

    .line 136
    const/high16 v9, 0x42f00000    # 120.0f

    .line 137
    .line 138
    cmpl-float v10, v7, v9

    .line 139
    .line 140
    if-lez v10, :cond_5

    .line 141
    .line 142
    move v7, v9

    .line 143
    :cond_5
    invoke-virtual {p0, v7}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    neg-int v7, v7

    .line 148
    int-to-float v7, v7

    .line 149
    mul-float/2addr v7, v1

    .line 150
    const/high16 v1, 0x40e00000    # 7.0f

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    int-to-float v1, v1

    .line 157
    const/high16 v9, 0x41900000    # 18.0f

    .line 158
    .line 159
    invoke-virtual {p0, v9}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    int-to-float v9, v9

    .line 164
    invoke-static {v1, v9, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    sub-float v9, v2, p1

    .line 169
    .line 170
    mul-float/2addr v1, v9

    .line 171
    sub-float/2addr v7, v1

    .line 172
    invoke-virtual {v8, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 173
    .line 174
    .line 175
    const v1, 0x3dcccccd    # 0.1f

    .line 176
    .line 177
    .line 178
    mul-float/2addr v1, p1

    .line 179
    const v7, 0x3f666666    # 0.9f

    .line 180
    .line 181
    .line 182
    add-float/2addr v1, v7

    .line 183
    const v7, 0x3f51eb85    # 0.82f

    .line 184
    .line 185
    .line 186
    mul-float/2addr v5, p1

    .line 187
    add-float/2addr v5, v7

    .line 188
    invoke-static {v1, v5, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v8, v7}, Landroid/view/View;->setScaleX(F)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v5, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-virtual {v8, v1}, Landroid/view/View;->setScaleY(F)V

    .line 200
    .line 201
    .line 202
    const v1, 0x3e6147ae    # 0.22f

    .line 203
    .line 204
    .line 205
    const v5, 0x3f47ae14    # 0.78f

    .line 206
    .line 207
    .line 208
    if-nez p2, :cond_6

    .line 209
    .line 210
    mul-float/2addr v1, p1

    .line 211
    add-float/2addr v1, v5

    .line 212
    goto :goto_4

    .line 213
    :cond_6
    mul-float/2addr v1, p1

    .line 214
    add-float/2addr v1, v5

    .line 215
    mul-float/2addr v1, p1

    .line 216
    :goto_4
    invoke-virtual {v8, v1}, Landroid/view/View;->setAlpha(F)V

    .line 217
    .line 218
    .line 219
    const/high16 v1, 0x41500000    # 13.0f

    .line 220
    .line 221
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    int-to-float v1, v1

    .line 226
    mul-float/2addr v1, p1

    .line 227
    float-to-int v1, v1

    .line 228
    const/high16 v5, 0x41100000    # 9.0f

    .line 229
    .line 230
    invoke-virtual {p0, v5}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-virtual {p0, v5}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iget-object v10, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->σ:Landroid/widget/LinearLayout;

    .line 239
    .line 240
    invoke-virtual {v10, v1, v7, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 241
    .line 242
    .line 243
    const/high16 v1, 0x41480000    # 12.5f

    .line 244
    .line 245
    const/high16 v5, 0x41600000    # 14.0f

    .line 246
    .line 247
    invoke-static {v1, v5, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    iget-object v5, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->υ:Landroid/widget/TextView;

    .line 252
    .line 253
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 254
    .line 255
    .line 256
    const/high16 v1, 0x41300000    # 11.0f

    .line 257
    .line 258
    const/high16 v5, 0x41400000    # 12.0f

    .line 259
    .line 260
    invoke-static {v1, v5, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    iget-object v10, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->φ:Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v5, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    iget-object v5, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->χ:Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 276
    .line 277
    .line 278
    if-nez p2, :cond_7

    .line 279
    .line 280
    move v1, p1

    .line 281
    goto :goto_5

    .line 282
    :cond_7
    mul-float v1, p1, p1

    .line 283
    .line 284
    :goto_5
    invoke-virtual {v10, v1}, Landroid/view/View;->setAlpha(F)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5, v1}, Landroid/view/View;->setAlpha(F)V

    .line 288
    .line 289
    .line 290
    iget-object v5, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ψ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;

    .line 291
    .line 292
    invoke-virtual {v5, v1}, Landroid/view/View;->setAlpha(F)V

    .line 293
    .line 294
    .line 295
    const v7, 0x3eb33333    # 0.35f

    .line 296
    .line 297
    .line 298
    cmpl-float v1, v1, v7

    .line 299
    .line 300
    if-lez v1, :cond_8

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_8
    move v4, v6

    .line 304
    :goto_6
    invoke-virtual {v5, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 305
    .line 306
    .line 307
    iget-object v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ω:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;

    .line 308
    .line 309
    mul-float v4, p1, v0

    .line 310
    .line 311
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 312
    .line 313
    .line 314
    iget-object v1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->τ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;

    .line 315
    .line 316
    iput-boolean v3, v1, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ε:Z

    .line 317
    .line 318
    if-nez p2, :cond_9

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_9
    move v2, p1

    .line 322
    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 326
    .line 327
    .line 328
    iget-object p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ε:Lg52;

    .line 329
    .line 330
    iget p2, p2, Lg52;->α:I

    .line 331
    .line 332
    const/16 v1, 0x64

    .line 333
    .line 334
    invoke-static {p2, v6, v1}, Lj81;->μ(III)I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    int-to-float p2, p2

    .line 339
    const/high16 v1, 0x42c80000    # 100.0f

    .line 340
    .line 341
    div-float/2addr p2, v1

    .line 342
    const/16 v1, 0xda

    .line 343
    .line 344
    int-to-float v2, v1

    .line 345
    const/16 v3, 0x8e

    .line 346
    .line 347
    int-to-float v3, v3

    .line 348
    mul-float/2addr v3, p2

    .line 349
    sub-float/2addr v2, v3

    .line 350
    float-to-int p2, v2

    .line 351
    const/16 v2, 0x40

    .line 352
    .line 353
    invoke-static {p2, v2, v1}, Lj81;->μ(III)I

    .line 354
    .line 355
    .line 356
    move-result p2

    .line 357
    const/16 v1, 0x2c

    .line 358
    .line 359
    int-to-float v1, v1

    .line 360
    mul-float/2addr v9, v1

    .line 361
    float-to-int v1, v9

    .line 362
    add-int/2addr p2, v1

    .line 363
    const/16 v1, 0xf0

    .line 364
    .line 365
    if-le p2, v1, :cond_a

    .line 366
    .line 367
    move p2, v1

    .line 368
    :cond_a
    const/16 v1, 0xff

    .line 369
    .line 370
    invoke-static {p2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 371
    .line 372
    .line 373
    move-result p2

    .line 374
    const/high16 v2, 0x41700000    # 15.0f

    .line 375
    .line 376
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    int-to-float v2, v2

    .line 381
    const/high16 v3, 0x41980000    # 19.0f

    .line 382
    .line 383
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    int-to-float v3, v3

    .line 388
    invoke-static {v2, v3, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    const/high16 v3, 0x41b00000    # 22.0f

    .line 393
    .line 394
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    int-to-float v3, v3

    .line 399
    const/high16 v4, 0x41e00000    # 28.0f

    .line 400
    .line 401
    invoke-virtual {p0, v4}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    int-to-float v4, v4

    .line 406
    invoke-static {v3, v4, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->δ(FFF)F

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    sub-float/2addr v0, v2

    .line 411
    mul-float/2addr v0, p1

    .line 412
    add-float/2addr v0, v2

    .line 413
    sget-object p1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 414
    .line 415
    const p1, 0x3f333333    # 0.7f

    .line 416
    .line 417
    .line 418
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->γ(F)I

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 423
    .line 424
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 431
    .line 432
    .line 433
    const/16 v3, 0x1a

    .line 434
    .line 435
    invoke-static {v3, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    invoke-virtual {v2, p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v8, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 443
    .line 444
    .line 445
    iget-object p0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->ρ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;

    .line 446
    .line 447
    iput p2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->η:I

    .line 448
    .line 449
    iput v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->θ:F

    .line 450
    .line 451
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 452
    .line 453
    .line 454
    return-void
.end method

.method public final γ(F)I
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method
