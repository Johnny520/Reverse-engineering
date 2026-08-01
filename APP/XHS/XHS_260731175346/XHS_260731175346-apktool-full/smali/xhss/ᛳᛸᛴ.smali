.class public final Lxhss/ᛳᛸᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

.field public final synthetic ᛳᲁᲇᛸ:Landroid/view/View;

.field public final synthetic ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲀᛳ;

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᛷᛶᲀᛲ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛶᲀᛲ;Lxhss/ᛵᲇᲀᛳ;Lxhss/ᛲᛵᛶᲁ;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᛸᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛷᛶᲀᛲ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᛸᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲀᛳ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛳᛸᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛳᛸᛴ;->ᛳᲁᲇᛸ:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    iget-object p1, p0, Lxhss/ᛳᛸᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲇᲀᛳ;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxhss/ᲁᛲᛸᛴ;

    .line 7
    .line 8
    invoke-direct {v0}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    iget-object v3, p0, Lxhss/ᛳᛸᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛷᛶᲀᛲ;

    .line 18
    .line 19
    iget-object v4, p0, Lxhss/ᛳᛸᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛵᛶᲁ;

    .line 20
    .line 21
    if-eqz v0, :cond_b

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    if-eq v0, v2, :cond_5

    .line 25
    .line 26
    if-eq v0, v5, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    if-eq v0, p0, :cond_5

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    iget-boolean v0, v3, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ:Z

    .line 34
    .line 35
    if-eqz v0, :cond_a

    .line 36
    .line 37
    invoke-virtual {p1}, Lxhss/ᛵᲇᲀᛳ;->ᛱᲁᛳᛲ()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_a

    .line 42
    .line 43
    iget-object p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 44
    .line 45
    iget-object v0, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 46
    .line 47
    iget-object v6, v4, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    add-float/2addr v7, p1

    .line 58
    iget p1, v3, Lxhss/ᛷᛶᲀᛲ;->ᛱᛱᛲᲇ:F

    .line 59
    .line 60
    sub-float/2addr v7, p1

    .line 61
    iget-object p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 62
    .line 63
    invoke-interface {p1}, Lxhss/ᛵᛳᛶᛷ;->ᛷᛵᛵᲈ()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    iget-object p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 70
    .line 71
    check-cast p1, Landroid/view/View;

    .line 72
    .line 73
    new-instance v8, Landroid/graphics/RectF;

    .line 74
    .line 75
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 76
    .line 77
    .line 78
    new-array v9, v5, [I

    .line 79
    .line 80
    new-array v5, v5, [I

    .line 81
    .line 82
    invoke-virtual {p1, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Lxhss/ᛳᛸᛴ;->ᛳᲁᲇᛸ:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {p0, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 88
    .line 89
    .line 90
    aget p0, v9, v1

    .line 91
    .line 92
    aget v10, v5, v1

    .line 93
    .line 94
    sub-int/2addr p0, v10

    .line 95
    int-to-float p0, p0

    .line 96
    iput p0, v8, Landroid/graphics/RectF;->left:F

    .line 97
    .line 98
    aget v9, v9, v2

    .line 99
    .line 100
    aget v5, v5, v2

    .line 101
    .line 102
    sub-int/2addr v9, v5

    .line 103
    int-to-float v5, v9

    .line 104
    iput v5, v8, Landroid/graphics/RectF;->top:F

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    int-to-float v5, v5

    .line 111
    add-float/2addr p0, v5

    .line 112
    iput p0, v8, Landroid/graphics/RectF;->right:F

    .line 113
    .line 114
    iget p0, v8, Landroid/graphics/RectF;->top:F

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    int-to-float p1, p1

    .line 121
    add-float/2addr p0, p1

    .line 122
    iput p0, v8, Landroid/graphics/RectF;->bottom:F

    .line 123
    .line 124
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iget p1, v8, Landroid/graphics/RectF;->left:F

    .line 129
    .line 130
    cmpl-float p0, p0, p1

    .line 131
    .line 132
    if-ltz p0, :cond_3

    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    iget p1, v8, Landroid/graphics/RectF;->right:F

    .line 139
    .line 140
    cmpg-float p0, p0, p1

    .line 141
    .line 142
    if-gtz p0, :cond_3

    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    iget p1, v8, Landroid/graphics/RectF;->top:F

    .line 149
    .line 150
    cmpl-float p0, p0, p1

    .line 151
    .line 152
    if-ltz p0, :cond_3

    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    iget p1, v8, Landroid/graphics/RectF;->bottom:F

    .line 159
    .line 160
    cmpg-float p0, p0, p1

    .line 161
    .line 162
    if-gtz p0, :cond_3

    .line 163
    .line 164
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 169
    .line 170
    int-to-float p0, p0

    .line 171
    cmpl-float p0, v7, p0

    .line 172
    .line 173
    iget-object p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 174
    .line 175
    if-lez p0, :cond_2

    .line 176
    .line 177
    invoke-interface {p1}, Lxhss/ᛵᛳᛶᛷ;->getScrollDistance()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_1

    .line 182
    .line 183
    iget-object p0, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 184
    .line 185
    invoke-interface {p0, v2}, Lxhss/ᛵᛳᛶᛷ;->ᛱᛱᛲᲇ(Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v7}, Landroid/view/View;->setY(F)V

    .line 189
    .line 190
    .line 191
    return v1

    .line 192
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    iput p0, v3, Lxhss/ᛷᛶᲀᛲ;->ᛱᛱᛲᲇ:F

    .line 197
    .line 198
    return v1

    .line 199
    :cond_2
    invoke-interface {p1, v1}, Lxhss/ᛵᛳᛶᛷ;->ᛱᛱᛲᲇ(Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 207
    .line 208
    int-to-float p0, p0

    .line 209
    invoke-virtual {v0, p0}, Landroid/view/View;->setY(F)V

    .line 210
    .line 211
    .line 212
    return v1

    .line 213
    :cond_3
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 218
    .line 219
    int-to-float p0, p0

    .line 220
    cmpl-float p0, v7, p0

    .line 221
    .line 222
    if-lez p0, :cond_4

    .line 223
    .line 224
    invoke-virtual {v0, v7}, Landroid/view/View;->setY(F)V

    .line 225
    .line 226
    .line 227
    return v2

    .line 228
    :cond_4
    invoke-virtual {v6}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 233
    .line 234
    int-to-float p0, p0

    .line 235
    invoke-virtual {v0, p0}, Landroid/view/View;->setY(F)V

    .line 236
    .line 237
    .line 238
    return v1

    .line 239
    :cond_5
    iget-object p0, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 240
    .line 241
    iget-object p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 242
    .line 243
    iget-object p2, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 244
    .line 245
    invoke-interface {p0}, Lxhss/ᛵᛳᛶᛷ;->getScrollDistance()I

    .line 246
    .line 247
    .line 248
    iput-boolean v1, v3, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ:Z

    .line 249
    .line 250
    iget p0, v3, Lxhss/ᛷᛶᲀᛲ;->ᛳᲁᲇᛸ:F

    .line 251
    .line 252
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 257
    .line 258
    int-to-float v0, v0

    .line 259
    cmpl-float p0, p0, v0

    .line 260
    .line 261
    const-wide/16 v6, 0x12c

    .line 262
    .line 263
    const-string v0, "y"

    .line 264
    .line 265
    if-nez p0, :cond_7

    .line 266
    .line 267
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 276
    .line 277
    int-to-float p1, p1

    .line 278
    iget v8, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᛶᛷᲀ:F

    .line 279
    .line 280
    add-float/2addr p1, v8

    .line 281
    sget v8, Lxhss/ᲇᛸᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 282
    .line 283
    int-to-float v8, v8

    .line 284
    add-float/2addr p1, v8

    .line 285
    cmpl-float p0, p0, p1

    .line 286
    .line 287
    if-lez p0, :cond_6

    .line 288
    .line 289
    invoke-virtual {v4}, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ()V

    .line 290
    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_6
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    iget p1, v3, Lxhss/ᛷᛶᲀᛲ;->ᛳᲁᲇᛸ:F

    .line 298
    .line 299
    cmpl-float p0, p0, p1

    .line 300
    .line 301
    if-eqz p0, :cond_9

    .line 302
    .line 303
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    iget p1, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᛶᛷᲀ:F

    .line 308
    .line 309
    new-array v3, v5, [F

    .line 310
    .line 311
    aput p0, v3, v1

    .line 312
    .line 313
    aput p1, v3, v2

    .line 314
    .line 315
    invoke-static {p2, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 323
    .line 324
    .line 325
    goto :goto_0

    .line 326
    :cond_7
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    iget v8, v3, Lxhss/ᛷᛶᲀᛲ;->ᛳᲁᲇᛸ:F

    .line 331
    .line 332
    sget v9, Lxhss/ᲇᛸᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 333
    .line 334
    int-to-float v9, v9

    .line 335
    add-float/2addr v8, v9

    .line 336
    cmpl-float p0, p0, v8

    .line 337
    .line 338
    if-lez p0, :cond_8

    .line 339
    .line 340
    invoke-virtual {v4}, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ()V

    .line 341
    .line 342
    .line 343
    goto :goto_0

    .line 344
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    iget v3, v3, Lxhss/ᛷᛶᲀᛲ;->ᛳᲁᲇᛸ:F

    .line 349
    .line 350
    cmpl-float p0, p0, v3

    .line 351
    .line 352
    if-eqz p0, :cond_9

    .line 353
    .line 354
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 363
    .line 364
    int-to-float p1, p1

    .line 365
    new-array v3, v5, [F

    .line 366
    .line 367
    aput p0, v3, v1

    .line 368
    .line 369
    aput p1, v3, v2

    .line 370
    .line 371
    invoke-static {p2, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    invoke-virtual {p0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 379
    .line 380
    .line 381
    :cond_9
    :goto_0
    iget-object p0, v4, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 382
    .line 383
    if-eqz p0, :cond_a

    .line 384
    .line 385
    invoke-interface {p0, v1}, Lxhss/ᛵᛳᛶᛷ;->ᛱᛱᛲᲇ(Z)V

    .line 386
    .line 387
    .line 388
    :cond_a
    :goto_1
    return v1

    .line 389
    :cond_b
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 390
    .line 391
    .line 392
    move-result p0

    .line 393
    iput p0, v3, Lxhss/ᛷᛶᲀᛲ;->ᛱᛱᛲᲇ:F

    .line 394
    .line 395
    iput-boolean v2, v3, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ:Z

    .line 396
    .line 397
    iget-object p0, v4, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    iput p0, v3, Lxhss/ᛷᛶᲀᛲ;->ᛳᲁᲇᛸ:F

    .line 404
    .line 405
    return v1
.end method
