.class public final synthetic Lyyds/ᛶᛱᲁᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛳᛴ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲀᛳᛴ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛶᛱᲁᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛱᲁᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛳᛴ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛶᛱᲁᲀ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, v0, Lyyds/ᛶᛱᲁᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛳᛴ;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v4}, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v4, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v4, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

    .line 20
    .line 21
    iget-object v1, v4, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 22
    .line 23
    iget-object v2, v4, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lyyds/ᛸᛶᲈᛳ;->ᛲᲈᲁ(Landroid/view/View;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲇᲇᛱ()V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_0
    iget-object v5, v0, Lyyds/ᛶᛱᲁᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛳᛴ;

    .line 33
    .line 34
    iget v0, v5, Lyyds/ᛶᲀᛳᛴ;->ᲇᲇᲇᛱ:I

    .line 35
    .line 36
    iget v1, v5, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ:I

    .line 37
    .line 38
    iget-object v4, v5, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛳᲀ:Lcom/android/app/CustomRecyclerView;

    .line 39
    .line 40
    iget v11, v5, Lyyds/ᛶᲀᛳᛴ;->ᛶᛷᛲᲁ:I

    .line 41
    .line 42
    iget-object v12, v5, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 43
    .line 44
    iget-object v13, v5, Lyyds/ᛶᲀᛳᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛳᛴᲈᛷ;

    .line 45
    .line 46
    invoke-virtual {v5}, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ()V

    .line 47
    .line 48
    .line 49
    iget-object v6, v5, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 50
    .line 51
    iget-boolean v7, v5, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 52
    .line 53
    const/4 v14, 0x4

    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v7, v14

    .line 59
    :goto_1
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-boolean v7, v5, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 63
    .line 64
    if-eqz v7, :cond_2

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move v7, v14

    .line 69
    :goto_2
    invoke-virtual {v12, v7}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    iget-boolean v7, v5, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 73
    .line 74
    if-nez v7, :cond_3

    .line 75
    .line 76
    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_c

    .line 80
    .line 81
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 92
    .line 93
    .line 94
    if-ne v7, v3, :cond_4

    .line 95
    .line 96
    move v15, v3

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    const/4 v15, 0x0

    .line 99
    :goto_3
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {v5}, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ()Landroid/graphics/Rect;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    if-eqz v15, :cond_5

    .line 112
    .line 113
    iget v9, v8, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    iget v9, v8, Landroid/graphics/Rect;->right:I

    .line 117
    .line 118
    sub-int v9, v7, v9

    .line 119
    .line 120
    sub-int/2addr v9, v0

    .line 121
    :goto_4
    iget v10, v8, Landroid/graphics/Rect;->top:I

    .line 122
    .line 123
    add-int/2addr v0, v9

    .line 124
    iget v14, v8, Landroid/graphics/Rect;->bottom:I

    .line 125
    .line 126
    sub-int v14, v4, v14

    .line 127
    .line 128
    invoke-static {v14, v10}, Ljava/lang/Math;->max(II)I

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    move/from16 v17, v9

    .line 133
    .line 134
    move v9, v0

    .line 135
    move v0, v7

    .line 136
    move/from16 v7, v17

    .line 137
    .line 138
    move/from16 v17, v14

    .line 139
    .line 140
    move-object v14, v8

    .line 141
    move v8, v10

    .line 142
    move/from16 v10, v17

    .line 143
    .line 144
    invoke-virtual/range {v5 .. v10}, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ(Landroid/view/View;IIII)V

    .line 145
    .line 146
    .line 147
    if-eqz v15, :cond_6

    .line 148
    .line 149
    iget v6, v14, Landroid/graphics/Rect;->left:I

    .line 150
    .line 151
    :goto_5
    move v7, v6

    .line 152
    goto :goto_6

    .line 153
    :cond_6
    iget v6, v14, Landroid/graphics/Rect;->right:I

    .line 154
    .line 155
    sub-int v7, v0, v6

    .line 156
    .line 157
    sub-int v6, v7, v11

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :goto_6
    iget v6, v14, Landroid/graphics/Rect;->top:I

    .line 161
    .line 162
    iget v8, v5, Lyyds/ᛶᲀᛳᛴ;->ᛲᛲᲈᲈ:I

    .line 163
    .line 164
    add-int/2addr v8, v6

    .line 165
    add-int v9, v7, v11

    .line 166
    .line 167
    add-int v10, v8, v1

    .line 168
    .line 169
    move-object v6, v12

    .line 170
    invoke-virtual/range {v5 .. v10}, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ(Landroid/view/View;IIII)V

    .line 171
    .line 172
    .line 173
    iget-object v7, v5, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᛱᛱ;

    .line 174
    .line 175
    iget-object v7, v7, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v7, Lyyds/ᛵᲇᛲᛱ;

    .line 178
    .line 179
    invoke-virtual {v7}, Lyyds/ᛵᲇᛲᛱ;->getAdapter()Lyyds/ᛲᛵᲇᛳ;

    .line 180
    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-nez v9, :cond_7

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    goto :goto_7

    .line 191
    :cond_7
    const/4 v10, 0x4

    .line 192
    :goto_7
    invoke-virtual {v13, v10}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    if-nez v9, :cond_10

    .line 196
    .line 197
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    check-cast v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 202
    .line 203
    invoke-virtual {v13}, Lyyds/ᛳᛴᲈᛷ;->getText()Ljava/lang/CharSequence;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-static {v10, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-nez v10, :cond_8

    .line 212
    .line 213
    invoke-virtual {v13, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    const/high16 v7, 0x40000000    # 2.0f

    .line 217
    .line 218
    invoke-static {v0, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    iget v12, v14, Landroid/graphics/Rect;->left:I

    .line 223
    .line 224
    iget v2, v14, Landroid/graphics/Rect;->right:I

    .line 225
    .line 226
    add-int/2addr v12, v2

    .line 227
    add-int/2addr v12, v11

    .line 228
    iget v2, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 229
    .line 230
    add-int/2addr v12, v2

    .line 231
    iget v2, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 232
    .line 233
    add-int/2addr v12, v2

    .line 234
    iget v2, v9, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 235
    .line 236
    invoke-static {v10, v12, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    invoke-static {v4, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    iget v10, v14, Landroid/graphics/Rect;->top:I

    .line 245
    .line 246
    iget v12, v14, Landroid/graphics/Rect;->bottom:I

    .line 247
    .line 248
    add-int/2addr v10, v12

    .line 249
    iget v12, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 250
    .line 251
    add-int/2addr v10, v12

    .line 252
    iget v12, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 253
    .line 254
    add-int/2addr v10, v12

    .line 255
    iget v12, v9, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 256
    .line 257
    invoke-static {v7, v10, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    invoke-virtual {v13, v2, v7}, Landroid/view/View;->measure(II)V

    .line 262
    .line 263
    .line 264
    :cond_8
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-eqz v15, :cond_9

    .line 273
    .line 274
    iget v0, v14, Landroid/graphics/Rect;->left:I

    .line 275
    .line 276
    add-int/2addr v0, v11

    .line 277
    iget v10, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 278
    .line 279
    add-int/2addr v0, v10

    .line 280
    goto :goto_8

    .line 281
    :cond_9
    iget v10, v14, Landroid/graphics/Rect;->right:I

    .line 282
    .line 283
    sub-int/2addr v0, v10

    .line 284
    sub-int/2addr v0, v11

    .line 285
    iget v10, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 286
    .line 287
    sub-int/2addr v0, v10

    .line 288
    sub-int/2addr v0, v2

    .line 289
    :goto_8
    iget v10, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 290
    .line 291
    and-int/lit8 v11, v10, 0x7

    .line 292
    .line 293
    if-eq v11, v3, :cond_b

    .line 294
    .line 295
    const/4 v3, 0x5

    .line 296
    if-eq v11, v3, :cond_a

    .line 297
    .line 298
    const/16 v16, 0x0

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_a
    move/from16 v16, v7

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_b
    div-int/lit8 v3, v7, 0x2

    .line 305
    .line 306
    move/from16 v16, v3

    .line 307
    .line 308
    :goto_9
    and-int/lit8 v3, v10, 0x70

    .line 309
    .line 310
    const/16 v10, 0x10

    .line 311
    .line 312
    if-eq v3, v10, :cond_d

    .line 313
    .line 314
    const/16 v10, 0x50

    .line 315
    .line 316
    if-eq v3, v10, :cond_c

    .line 317
    .line 318
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    goto :goto_a

    .line 323
    :cond_c
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    sub-int/2addr v1, v3

    .line 328
    goto :goto_a

    .line 329
    :cond_d
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    sub-int/2addr v1, v3

    .line 334
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    sub-int/2addr v1, v6

    .line 339
    div-int/lit8 v1, v1, 0x2

    .line 340
    .line 341
    add-int/2addr v1, v3

    .line 342
    :goto_a
    add-int/2addr v8, v1

    .line 343
    sub-int v8, v8, v16

    .line 344
    .line 345
    iget v1, v14, Landroid/graphics/Rect;->top:I

    .line 346
    .line 347
    iget v3, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 348
    .line 349
    add-int/2addr v1, v3

    .line 350
    iget v3, v14, Landroid/graphics/Rect;->bottom:I

    .line 351
    .line 352
    sub-int/2addr v4, v3

    .line 353
    iget v3, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 354
    .line 355
    sub-int/2addr v4, v3

    .line 356
    sub-int/2addr v4, v7

    .line 357
    if-ge v8, v1, :cond_e

    .line 358
    .line 359
    move v8, v1

    .line 360
    goto :goto_b

    .line 361
    :cond_e
    if-le v8, v4, :cond_f

    .line 362
    .line 363
    move v8, v4

    .line 364
    :cond_f
    :goto_b
    add-int v9, v0, v2

    .line 365
    .line 366
    add-int v10, v8, v7

    .line 367
    .line 368
    move v7, v0

    .line 369
    move-object v6, v13

    .line 370
    invoke-virtual/range {v5 .. v10}, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ(Landroid/view/View;IIII)V

    .line 371
    .line 372
    .line 373
    :cond_10
    :goto_c
    return-void

    .line 374
    :pswitch_1
    iget-boolean v0, v4, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 375
    .line 376
    if-eqz v0, :cond_11

    .line 377
    .line 378
    goto/16 :goto_10

    .line 379
    .line 380
    :cond_11
    iget-object v0, v4, Lyyds/ᛶᲀᛳᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᲈᛳ;

    .line 381
    .line 382
    iget-object v1, v4, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 383
    .line 384
    iget-object v2, v4, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 385
    .line 386
    iget-object v4, v0, Lyyds/ᛸᛶᲈᛳ;->ᛲᲈᲁ:Lcom/android/app/CustomRecyclerView;

    .line 387
    .line 388
    iget-boolean v5, v0, Lyyds/ᛸᛶᲈᛳ;->ᛵᛸᛸᛷ:Z

    .line 389
    .line 390
    if-nez v5, :cond_12

    .line 391
    .line 392
    goto :goto_10

    .line 393
    :cond_12
    const/4 v5, 0x0

    .line 394
    iput-boolean v5, v0, Lyyds/ᛸᛶᲈᛳ;->ᛵᛸᛸᛷ:Z

    .line 395
    .line 396
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-ne v0, v3, :cond_13

    .line 401
    .line 402
    goto :goto_d

    .line 403
    :cond_13
    move v3, v5

    .line 404
    :goto_d
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    const/4 v5, 0x0

    .line 417
    if-eqz v3, :cond_15

    .line 418
    .line 419
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-nez v3, :cond_14

    .line 424
    .line 425
    neg-int v0, v0

    .line 426
    :goto_e
    int-to-float v0, v0

    .line 427
    goto :goto_f

    .line 428
    :cond_14
    move v0, v5

    .line 429
    goto :goto_f

    .line 430
    :cond_15
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    if-ne v3, v4, :cond_14

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :goto_f
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    const-wide/16 v3, 0xc8

    .line 454
    .line 455
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    sget-object v6, Lyyds/ᛸᛶᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛲᛶᛸ;

    .line 460
    .line 461
    invoke-virtual {v1, v6}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0, v6}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 489
    .line 490
    .line 491
    :goto_10
    return-void

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
