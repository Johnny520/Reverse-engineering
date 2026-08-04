.class public final Lyyds/ᛳᛲᛸᛳ;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᛳᲇ:Landroid/widget/TextView;

.field public final ᛱᲈᲁ:Landroid/view/View;

.field public final ᛲᛲᲈᲈ:Landroid/widget/TextView;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛱᛳᛶᲇ;

.field public final ᛲᛴᛳᛲ:Landroid/widget/FrameLayout;

.field public ᛳᛸᛴᛶ:Lyyds/ᛸᛵᲀᛳ;

.field public final ᛳᲁᲁᲇ:Landroid/widget/TextView;

.field public final ᛵᛶᛲᲀ:Landroid/widget/TextView;

.field public final ᛶᛳᛶᛵ:Lyyds/ᲁᛵᛲᲀ;

.field public final ᛶᛷᛲᲁ:Landroid/widget/ImageView;

.field public final synthetic ᛶᛸᲀᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

.field public ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

.field public final ᛷᛲᲈᛱ:Landroid/view/View;

.field public final ᛷᛵᲇᲀ:Landroid/widget/TextView;

.field public final ᛷᲈᲈᲁ:Landroid/widget/LinearLayout;

.field public final ᲀᛲᛲᲇ:Landroid/widget/TextView;

.field public final ᲀᛲᛳᲀ:Landroid/view/View;

.field public final ᲇᛱᛲ:Landroid/widget/TextView;

.field public final ᲇᲇᲇᛱ:Landroid/view/View;

.field public final ᲇᲈᛵᛷ:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;Landroid/content/Context;)V
    .locals 16

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
    const-wide v3, -0x4c3ede68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lyyds/ᛳᛲᛸᛳ;->ᛶᛸᲀᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 16
    .line 17
    invoke-direct {v0, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lyyds/ᛸᛶᲁᛵ;

    .line 28
    .line 29
    invoke-direct {v4}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Landroid/view/View;

    .line 36
    .line 37
    invoke-direct {v4, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    sget-object v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 41
    .line 42
    const v5, 0x6606010b

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/16 v6, 0x18

    .line 50
    .line 51
    invoke-virtual {v1, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-static {v5, v7, v8, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    const v5, 0x3df5c28f    # 0.12f

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 67
    .line 68
    .line 69
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 70
    .line 71
    const/4 v7, -0x1

    .line 72
    invoke-direct {v5, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 73
    .line 74
    .line 75
    const/16 v9, 0xa

    .line 76
    .line 77
    invoke-virtual {v1, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    iput v10, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 82
    .line 83
    invoke-virtual {v1, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    iput v10, v5, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 88
    .line 89
    const/16 v10, 0x1a

    .line 90
    .line 91
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    iput v10, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    iput-object v4, v0, Lyyds/ᛳᛲᛸᛳ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 101
    .line 102
    new-instance v5, Landroid/view/View;

    .line 103
    .line 104
    invoke-direct {v5, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    const v10, 0x66060092

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-virtual {v1, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    invoke-static {v10, v11, v8, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 123
    .line 124
    .line 125
    const v8, 0x3e2e147b    # 0.17f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v8}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 132
    .line 133
    invoke-direct {v8, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 134
    .line 135
    .line 136
    const/4 v10, 0x5

    .line 137
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    iput v11, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 142
    .line 143
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    iput v11, v8, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 148
    .line 149
    const/16 v11, 0x14

    .line 150
    .line 151
    invoke-virtual {v1, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    iput v11, v8, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 156
    .line 157
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    .line 159
    .line 160
    iput-object v5, v0, Lyyds/ᛳᛲᛸᛳ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, Landroid/widget/FrameLayout;

    .line 169
    .line 170
    invoke-direct {v4, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 182
    .line 183
    const/high16 v8, 0x45af0000    # 5600.0f

    .line 184
    .line 185
    mul-float/2addr v5, v8

    .line 186
    invoke-virtual {v4, v5}, Landroid/view/View;->setCameraDistance(F)V

    .line 187
    .line 188
    .line 189
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 190
    .line 191
    invoke-direct {v5, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    iput v8, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 199
    .line 200
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    iput-object v4, v0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛴᛳᛲ:Landroid/widget/FrameLayout;

    .line 204
    .line 205
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 206
    .line 207
    invoke-direct {v5, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 208
    .line 209
    .line 210
    const/4 v8, 0x1

    .line 211
    invoke-virtual {v1, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 216
    .line 217
    invoke-virtual {v1, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 222
    .line 223
    invoke-virtual {v1, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 228
    .line 229
    invoke-virtual {v1, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 234
    .line 235
    new-instance v11, Landroid/view/View;

    .line 236
    .line 237
    invoke-direct {v11, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    iput-object v11, v0, Lyyds/ᛳᛲᛸᛳ;->ᛱᲈᲁ:Landroid/view/View;

    .line 241
    .line 242
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 243
    .line 244
    invoke-direct {v12, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/widget/FrameLayout$LayoutParams;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 248
    .line 249
    .line 250
    new-instance v11, Lyyds/ᛱᛳᛶᲇ;

    .line 251
    .line 252
    invoke-direct {v11, v2}, Lyyds/ᛱᛳᛶᲇ;-><init>(Landroid/content/Context;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11, v8}, Landroid/view/View;->setClipToOutline(Z)V

    .line 256
    .line 257
    .line 258
    new-instance v12, Lyyds/ᲈᛴᲁᛲ;

    .line 259
    .line 260
    const/4 v13, 0x2

    .line 261
    invoke-direct {v12, v1, v13}, Lyyds/ᲈᛴᲁᛲ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v12}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 265
    .line 266
    .line 267
    iput-object v11, v0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛳᛶᲇ;

    .line 268
    .line 269
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 270
    .line 271
    invoke-direct {v12, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/widget/FrameLayout$LayoutParams;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 275
    .line 276
    .line 277
    new-instance v11, Landroid/widget/LinearLayout;

    .line 278
    .line 279
    invoke-direct {v11, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 283
    .line 284
    .line 285
    const/16 v12, 0x10

    .line 286
    .line 287
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    const/16 v15, 0xe

    .line 292
    .line 293
    invoke-virtual {v1, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    const/16 v10, 0xc

    .line 302
    .line 303
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    invoke-virtual {v11, v14, v6, v15, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 308
    .line 309
    .line 310
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 311
    .line 312
    invoke-direct {v6, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/widget/FrameLayout$LayoutParams;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4, v11, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 316
    .line 317
    .line 318
    new-instance v5, Landroid/widget/ScrollView;

    .line 319
    .line 320
    invoke-direct {v5, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5, v13}, Landroid/view/View;->setOverScrollMode(I)V

    .line 327
    .line 328
    .line 329
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 330
    .line 331
    const/high16 v9, 0x3f800000    # 1.0f

    .line 332
    .line 333
    invoke-direct {v6, v7, v3, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v11, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    .line 338
    .line 339
    new-instance v6, Landroid/widget/LinearLayout;

    .line 340
    .line 341
    invoke-direct {v6, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 345
    .line 346
    .line 347
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 348
    .line 349
    const/4 v15, -0x2

    .line 350
    invoke-direct {v14, v7, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v5, v6, v14}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 354
    .line 355
    .line 356
    new-instance v5, Landroid/widget/LinearLayout;

    .line 357
    .line 358
    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 365
    .line 366
    .line 367
    new-instance v14, Landroid/widget/LinearLayout;

    .line 368
    .line 369
    invoke-direct {v14, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v14, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v14, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 376
    .line 377
    .line 378
    const/16 v7, 0x9

    .line 379
    .line 380
    invoke-virtual {v1, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    const/4 v10, 0x4

    .line 385
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 386
    .line 387
    .line 388
    move-result v15

    .line 389
    const/16 v12, 0xa

    .line 390
    .line 391
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 396
    .line 397
    .line 398
    move-result v10

    .line 399
    invoke-virtual {v14, v7, v15, v13, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 400
    .line 401
    .line 402
    iput-object v14, v0, Lyyds/ᛳᛲᛸᛳ;->ᛷᲈᲈᲁ:Landroid/widget/LinearLayout;

    .line 403
    .line 404
    new-instance v7, Landroid/view/View;

    .line 405
    .line 406
    invoke-direct {v7, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 407
    .line 408
    .line 409
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 410
    .line 411
    const/4 v12, 0x6

    .line 412
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 413
    .line 414
    .line 415
    move-result v13

    .line 416
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 417
    .line 418
    .line 419
    move-result v15

    .line 420
    invoke-direct {v10, v13, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 421
    .line 422
    .line 423
    const/4 v13, 0x5

    .line 424
    invoke-virtual {v1, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 425
    .line 426
    .line 427
    move-result v15

    .line 428
    iput v15, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 429
    .line 430
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 431
    .line 432
    .line 433
    iput-object v7, v0, Lyyds/ᛳᛲᛸᛳ;->ᛷᛲᲈᛱ:Landroid/view/View;

    .line 434
    .line 435
    invoke-virtual {v14, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 436
    .line 437
    .line 438
    new-instance v7, Landroid/widget/TextView;

    .line 439
    .line 440
    invoke-direct {v7, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 441
    .line 442
    .line 443
    const/high16 v10, 0x41300000    # 11.0f

    .line 444
    .line 445
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 446
    .line 447
    .line 448
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 449
    .line 450
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 451
    .line 452
    .line 453
    iput-object v7, v0, Lyyds/ᛳᛲᛸᛳ;->ᛷᛵᲇᲀ:Landroid/widget/TextView;

    .line 454
    .line 455
    invoke-virtual {v14, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 459
    .line 460
    .line 461
    new-instance v7, Landroid/view/View;

    .line 462
    .line 463
    invoke-direct {v7, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 464
    .line 465
    .line 466
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 467
    .line 468
    invoke-direct {v14, v3, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v5, v7, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 472
    .line 473
    .line 474
    new-instance v7, Landroid/widget/LinearLayout;

    .line 475
    .line 476
    invoke-direct {v7, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 480
    .line 481
    .line 482
    const/16 v14, 0x50

    .line 483
    .line 484
    invoke-virtual {v7, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 485
    .line 486
    .line 487
    new-instance v14, Landroid/widget/TextView;

    .line 488
    .line 489
    invoke-direct {v14, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 490
    .line 491
    .line 492
    const/high16 v15, 0x41a00000    # 20.0f

    .line 493
    .line 494
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 495
    .line 496
    .line 497
    sget-object v15, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 498
    .line 499
    invoke-static {v15, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 500
    .line 501
    .line 502
    move-result-object v12

    .line 503
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 504
    .line 505
    .line 506
    const v12, 0x660600f4

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    invoke-virtual {v14, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 517
    .line 518
    .line 519
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 520
    .line 521
    invoke-virtual {v14, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 522
    .line 523
    .line 524
    iput-object v14, v0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛲᲈᲈ:Landroid/widget/TextView;

    .line 525
    .line 526
    invoke-virtual {v7, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 527
    .line 528
    .line 529
    new-instance v14, Landroid/widget/TextView;

    .line 530
    .line 531
    invoke-direct {v14, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 538
    .line 539
    .line 540
    const v10, 0x66060102

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 544
    .line 545
    .line 546
    move-result v15

    .line 547
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v14, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 554
    .line 555
    .line 556
    const/4 v15, 0x2

    .line 557
    invoke-virtual {v1, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 558
    .line 559
    .line 560
    move-result v10

    .line 561
    invoke-virtual {v1, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 562
    .line 563
    .line 564
    move-result v12

    .line 565
    invoke-virtual {v14, v10, v3, v3, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 566
    .line 567
    .line 568
    iput-object v14, v0, Lyyds/ᛳᛲᛸᛳ;->ᛱᛳᲇ:Landroid/widget/TextView;

    .line 569
    .line 570
    invoke-virtual {v7, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 577
    .line 578
    .line 579
    new-instance v5, Landroid/widget/LinearLayout;

    .line 580
    .line 581
    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 585
    .line 586
    .line 587
    const/16 v7, 0x10

    .line 588
    .line 589
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 590
    .line 591
    .line 592
    const/16 v7, 0xe

    .line 593
    .line 594
    invoke-virtual {v1, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    invoke-virtual {v5, v3, v7, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 599
    .line 600
    .line 601
    new-instance v7, Landroid/widget/FrameLayout;

    .line 602
    .line 603
    invoke-direct {v7, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 604
    .line 605
    .line 606
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 607
    .line 608
    const/16 v12, 0x3c

    .line 609
    .line 610
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 611
    .line 612
    .line 613
    move-result v14

    .line 614
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 615
    .line 616
    .line 617
    move-result v15

    .line 618
    invoke-direct {v10, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 622
    .line 623
    .line 624
    new-instance v10, Landroid/view/View;

    .line 625
    .line 626
    invoke-direct {v10, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 627
    .line 628
    .line 629
    const v14, 0x3f666666    # 0.9f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v10, v14}, Landroid/view/View;->setAlpha(F)V

    .line 633
    .line 634
    .line 635
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 636
    .line 637
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 638
    .line 639
    .line 640
    move-result v15

    .line 641
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 642
    .line 643
    .line 644
    move-result v12

    .line 645
    invoke-direct {v14, v15, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 649
    .line 650
    .line 651
    iput-object v10, v0, Lyyds/ᛳᛲᛸᛳ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 652
    .line 653
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 654
    .line 655
    .line 656
    new-instance v10, Landroid/widget/ImageView;

    .line 657
    .line 658
    invoke-direct {v10, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 659
    .line 660
    .line 661
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 662
    .line 663
    const/16 v14, 0x2c

    .line 664
    .line 665
    invoke-virtual {v1, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 666
    .line 667
    .line 668
    move-result v15

    .line 669
    invoke-virtual {v1, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    const/16 v14, 0x11

    .line 674
    .line 675
    invoke-direct {v12, v15, v3, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v10, v8}, Landroid/view/View;->setClipToOutline(Z)V

    .line 682
    .line 683
    .line 684
    new-instance v3, Lyyds/ᲈᛴᲁᛲ;

    .line 685
    .line 686
    invoke-direct {v3, v1, v8}, Lyyds/ᲈᛴᲁᛲ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v10, v3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 690
    .line 691
    .line 692
    const/4 v3, 0x5

    .line 693
    invoke-virtual {v1, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    invoke-virtual {v10, v3}, Landroid/view/View;->setElevation(F)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v10, v8}, Landroid/view/View;->setClickable(Z)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v10, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 704
    .line 705
    .line 706
    new-instance v3, Landroid/util/TypedValue;

    .line 707
    .line 708
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 712
    .line 713
    .line 714
    move-result-object v12

    .line 715
    const v15, 0x101045c

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v15, v3, v8}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 719
    .line 720
    .line 721
    iget v3, v3, Landroid/util/TypedValue;->resourceId:I

    .line 722
    .line 723
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    invoke-virtual {v10, v3}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 728
    .line 729
    .line 730
    new-instance v3, Lyyds/ᛳᛴᛷᲁ;

    .line 731
    .line 732
    const/4 v15, 0x2

    .line 733
    invoke-direct {v3, v1, v10, v15}, Lyyds/ᛳᛴᛷᲁ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;Landroid/widget/ImageView;I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v10, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 737
    .line 738
    .line 739
    iput-object v10, v0, Lyyds/ᛳᛲᛸᛳ;->ᛶᛷᛲᲁ:Landroid/widget/ImageView;

    .line 740
    .line 741
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 745
    .line 746
    .line 747
    new-instance v3, Landroid/widget/LinearLayout;

    .line 748
    .line 749
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 753
    .line 754
    .line 755
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 756
    .line 757
    const/4 v10, 0x0

    .line 758
    const/high16 v12, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/4 v15, -0x2

    .line 761
    invoke-direct {v7, v10, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 762
    .line 763
    .line 764
    const/16 v10, 0xc

    .line 765
    .line 766
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 767
    .line 768
    .line 769
    move-result v10

    .line 770
    iput v10, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 771
    .line 772
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 773
    .line 774
    .line 775
    new-instance v7, Landroid/widget/TextView;

    .line 776
    .line 777
    invoke-direct {v7, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 778
    .line 779
    .line 780
    const/high16 v10, 0x41900000    # 18.0f

    .line 781
    .line 782
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 786
    .line 787
    .line 788
    const v10, 0x660600f4

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 792
    .line 793
    .line 794
    move-result v10

    .line 795
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 802
    .line 803
    .line 804
    iput-object v7, v0, Lyyds/ᛳᛲᛸᛳ;->ᛳᲁᲁᲇ:Landroid/widget/TextView;

    .line 805
    .line 806
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 807
    .line 808
    .line 809
    new-instance v7, Landroid/widget/TextView;

    .line 810
    .line 811
    invoke-direct {v7, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 812
    .line 813
    .line 814
    const/high16 v10, 0x41280000    # 10.5f

    .line 815
    .line 816
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 817
    .line 818
    .line 819
    const v10, 0x66060102

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 823
    .line 824
    .line 825
    move-result v12

    .line 826
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 833
    .line 834
    .line 835
    const/4 v15, 0x2

    .line 836
    invoke-virtual {v1, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 837
    .line 838
    .line 839
    move-result v8

    .line 840
    const/4 v10, 0x0

    .line 841
    invoke-virtual {v7, v10, v8, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 842
    .line 843
    .line 844
    iput-object v7, v0, Lyyds/ᛳᛲᛸᛳ;->ᲇᛱᛲ:Landroid/widget/TextView;

    .line 845
    .line 846
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 853
    .line 854
    .line 855
    new-instance v3, Landroid/widget/TextView;

    .line 856
    .line 857
    invoke-direct {v3, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 858
    .line 859
    .line 860
    const-wide v7, -0x4c3f5e68a836eL

    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 870
    .line 871
    .line 872
    const/high16 v5, 0x41200000    # 10.0f

    .line 873
    .line 874
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 878
    .line 879
    .line 880
    const v5, 0x3e0f5c29    # 0.14f

    .line 881
    .line 882
    .line 883
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 884
    .line 885
    .line 886
    const v10, 0x66060102

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 890
    .line 891
    .line 892
    move-result v5

    .line 893
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 894
    .line 895
    .line 896
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 897
    .line 898
    const/4 v15, -0x2

    .line 899
    invoke-direct {v5, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 900
    .line 901
    .line 902
    const/16 v7, 0x10

    .line 903
    .line 904
    invoke-virtual {v1, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 905
    .line 906
    .line 907
    move-result v7

    .line 908
    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 909
    .line 910
    invoke-virtual {v6, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 911
    .line 912
    .line 913
    new-instance v3, Lyyds/ᲁᛵᛲᲀ;

    .line 914
    .line 915
    invoke-direct {v3, v2}, Lyyds/ᲁᛵᛲᲀ;-><init>(Landroid/content/Context;)V

    .line 916
    .line 917
    .line 918
    const/4 v5, 0x6

    .line 919
    invoke-virtual {v1, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 920
    .line 921
    .line 922
    move-result v5

    .line 923
    const/4 v10, 0x0

    .line 924
    invoke-virtual {v3, v10, v5, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 925
    .line 926
    .line 927
    iput-object v3, v0, Lyyds/ᛳᛲᛸᛳ;->ᛶᛳᛶᛵ:Lyyds/ᲁᛵᛲᲀ;

    .line 928
    .line 929
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 930
    .line 931
    const/4 v7, -0x1

    .line 932
    invoke-direct {v5, v7, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v6, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 936
    .line 937
    .line 938
    new-instance v3, Landroid/widget/TextView;

    .line 939
    .line 940
    invoke-direct {v3, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 941
    .line 942
    .line 943
    const-wide v5, -0x4c3fee68a836eL

    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 953
    .line 954
    .line 955
    const/high16 v5, 0x41500000    # 13.0f

    .line 956
    .line 957
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 964
    .line 965
    .line 966
    const/16 v12, 0xa

    .line 967
    .line 968
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 969
    .line 970
    .line 971
    move-result v5

    .line 972
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    const/4 v10, 0x0

    .line 977
    invoke-virtual {v3, v10, v5, v10, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 978
    .line 979
    .line 980
    const/16 v5, 0x2c

    .line 981
    .line 982
    invoke-virtual {v1, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 983
    .line 984
    .line 985
    move-result v5

    .line 986
    invoke-virtual {v3, v5}, Landroid/view/View;->setMinimumHeight(I)V

    .line 987
    .line 988
    .line 989
    const/16 v5, 0x8

    .line 990
    .line 991
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 992
    .line 993
    .line 994
    iput-object v3, v0, Lyyds/ᛳᛲᛸᛳ;->ᛵᛶᛲᲀ:Landroid/widget/TextView;

    .line 995
    .line 996
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 997
    .line 998
    const/4 v7, -0x1

    .line 999
    const/4 v15, -0x2

    .line 1000
    invoke-direct {v6, v7, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v1, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1004
    .line 1005
    .line 1006
    move-result v7

    .line 1007
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1008
    .line 1009
    invoke-virtual {v11, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1010
    .line 1011
    .line 1012
    const/16 v6, 0x3e7

    .line 1013
    .line 1014
    invoke-virtual {v1, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 1015
    .line 1016
    .line 1017
    move-result v7

    .line 1018
    invoke-virtual {v0, v3, v7}, Lyyds/ᛳᛲᛸᛳ;->ᛲᲈᲁ(Landroid/view/View;F)V

    .line 1019
    .line 1020
    .line 1021
    new-instance v3, Landroid/widget/TextView;

    .line 1022
    .line 1023
    invoke-direct {v3, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1024
    .line 1025
    .line 1026
    const-wide v7, -0x4c404e68a836eL

    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1036
    .line 1037
    .line 1038
    const/high16 v2, 0x41580000    # 13.5f

    .line 1039
    .line 1040
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-static {v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛳᛸᛴᛶ(Lcom/ss/android/ugc/awemes/MainActivity;)I

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1054
    .line 1055
    .line 1056
    const/16 v12, 0xa

    .line 1057
    .line 1058
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1059
    .line 1060
    .line 1061
    move-result v2

    .line 1062
    invoke-virtual {v1, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1063
    .line 1064
    .line 1065
    move-result v7

    .line 1066
    const/4 v10, 0x0

    .line 1067
    invoke-virtual {v3, v10, v2, v10, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1068
    .line 1069
    .line 1070
    const/16 v2, 0x2e

    .line 1071
    .line 1072
    invoke-virtual {v1, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    invoke-virtual {v3, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1077
    .line 1078
    .line 1079
    iput-object v3, v0, Lyyds/ᛳᛲᛸᛳ;->ᲀᛲᛲᲇ:Landroid/widget/TextView;

    .line 1080
    .line 1081
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1082
    .line 1083
    const/4 v7, -0x1

    .line 1084
    const/4 v15, -0x2

    .line 1085
    invoke-direct {v2, v7, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v1, v5}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1089
    .line 1090
    .line 1091
    move-result v5

    .line 1092
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1093
    .line 1094
    invoke-virtual {v11, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v1, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    invoke-virtual {v0, v3, v2}, Lyyds/ᛳᛲᛸᛳ;->ᛲᲈᲁ(Landroid/view/View;F)V

    .line 1102
    .line 1103
    .line 1104
    const/16 v2, 0x18

    .line 1105
    .line 1106
    invoke-virtual {v1, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 1107
    .line 1108
    .line 1109
    move-result v2

    .line 1110
    invoke-virtual {v0, v4, v2}, Lyyds/ᛳᛲᛸᛳ;->ᛲᲈᲁ(Landroid/view/View;F)V

    .line 1111
    .line 1112
    .line 1113
    new-instance v2, Lyyds/ᛶᛷᛲᲁ;

    .line 1114
    .line 1115
    const/16 v3, 0xf

    .line 1116
    .line 1117
    invoke-direct {v2, v1, v3, v0}, Lyyds/ᛶᛷᛲᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1124
    .line 1125
    .line 1126
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛳᛶᲇ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/view/View;F)V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛳᛲᛸᛳ;->ᛶᛸᲀᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const v2, 0x3e99999a    # 0.3f

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v1, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 30
    .line 31
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    new-instance p0, Lyyds/ᛱᛷᛸᲈ;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lyyds/ᛴᛴᲇᲇ;

    .line 54
    .line 55
    invoke-direct {v0, p2}, Lyyds/ᛴᛴᲇᲇ;-><init>(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2, v0}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance p2, Lyyds/ᲇᛸᛴᛳ;

    .line 68
    .line 69
    invoke-direct {p2, p0}, Lyyds/ᲇᛸᛴᛳ;-><init>(Lyyds/ᛱᛷᛸᲈ;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
