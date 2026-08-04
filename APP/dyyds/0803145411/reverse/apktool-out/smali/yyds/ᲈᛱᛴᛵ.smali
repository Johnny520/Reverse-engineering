.class public final Lyyds/ᲈᛱᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lyyds/ᲈᛱᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛱᲀᛱᲈ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛶᛵᲇ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᲈᛱᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    const-string v2, "OnGlobalLayoutListener called attachStateListener="

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, p0, Lyyds/ᲈᛱᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 17
    .line 18
    iget-object v0, v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-wide v0, -0x50873e68a836eL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-object v0, v5

    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 39
    .line 40
    sget-object v0, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 41
    .line 42
    if-ne p0, v0, :cond_1

    .line 43
    .line 44
    move p0, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move p0, v7

    .line 47
    :goto_0
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛱᲁᛳ()V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object v0, v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    const-wide v0, -0x50880e68a836eL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-object v0, v5

    .line 69
    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    new-array v1, v0, [F

    .line 74
    .line 75
    :goto_2
    iget-object v2, v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 76
    .line 77
    if-ge v7, v0, :cond_6

    .line 78
    .line 79
    if-nez v2, :cond_4

    .line 80
    .line 81
    const-wide v8, -0x5088de68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-object v2, v5

    .line 90
    :cond_4
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v8}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    aput v8, v1, v7

    .line 106
    .line 107
    const/4 v8, 0x0

    .line 108
    invoke-virtual {v2, v8}, Landroid/view/View;->setAlpha(F)V

    .line 109
    .line 110
    .line 111
    if-eqz p0, :cond_5

    .line 112
    .line 113
    const/16 v8, 0x22

    .line 114
    .line 115
    :goto_3
    invoke-virtual {v4, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    goto :goto_4

    .line 120
    :cond_5
    const/16 v8, 0x2e

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_4
    invoke-virtual {v2, v8}, Landroid/view/View;->setTranslationY(F)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    if-nez v2, :cond_7

    .line 130
    .line 131
    const-wide v7, -0x5089ae68a836eL

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move-object v5, v2

    .line 141
    :goto_5
    new-instance v0, Lyyds/ᛸᲁᛳᲁ;

    .line 142
    .line 143
    invoke-direct {v0, v4, v1, p0, v3}, Lyyds/ᛸᲁᛳᲁ;-><init>(Landroid/content/Context;Ljava/lang/Object;ZI)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 147
    .line 148
    .line 149
    return v6

    .line 150
    :pswitch_0
    const-string v0, "ViewTarget"

    .line 151
    .line 152
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    new-instance v3, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    :cond_8
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    check-cast p0, Lyyds/ᛱᲀᛱᲈ;

    .line 180
    .line 181
    if-eqz p0, :cond_10

    .line 182
    .line 183
    iget-object v0, p0, Lyyds/ᛱᲀᛱᲈ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 184
    .line 185
    iget-object v2, p0, Lyyds/ᛱᲀᛱᲈ;->ᛲᲈᲁ:Landroid/widget/ImageView;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_9

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_9
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    add-int/2addr v4, v3

    .line 203
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-eqz v3, :cond_a

    .line 208
    .line 209
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_a
    move v3, v7

    .line 213
    :goto_6
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    invoke-virtual {p0, v8, v3, v4}, Lyyds/ᛱᲀᛱᲈ;->ᛲᲈᲁ(III)I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    add-int/2addr v8, v4

    .line 230
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    if-eqz v4, :cond_b

    .line 235
    .line 236
    iget v7, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 237
    .line 238
    :cond_b
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    invoke-virtual {p0, v4, v7, v8}, Lyyds/ᛱᲀᛱᲈ;->ᛲᲈᲁ(III)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-gtz v3, :cond_c

    .line 247
    .line 248
    if-ne v3, v1, :cond_10

    .line 249
    .line 250
    :cond_c
    if-gtz v4, :cond_d

    .line 251
    .line 252
    if-ne v4, v1, :cond_10

    .line 253
    .line 254
    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    .line 255
    .line 256
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_e

    .line 268
    .line 269
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Lyyds/ᛲᛷᛶᛸ;

    .line 274
    .line 275
    invoke-virtual {v7, v3, v4}, Lyyds/ᛲᛷᛶᛸ;->ᛲᛲᲈᲈ(II)V

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_e
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_f

    .line 288
    .line 289
    iget-object v2, p0, Lyyds/ᛱᲀᛱᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 292
    .line 293
    .line 294
    :cond_f
    iput-object v5, p0, Lyyds/ᛱᲀᛱᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 297
    .line 298
    .line 299
    :cond_10
    :goto_8
    return v6

    .line 300
    :pswitch_1
    const-string v0, "CustomViewTarget"

    .line 301
    .line 302
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_11

    .line 307
    .line 308
    new-instance v3, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    :cond_11
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    check-cast p0, Lyyds/ᛶᛶᛵᲇ;

    .line 330
    .line 331
    if-eqz p0, :cond_19

    .line 332
    .line 333
    iget-object v0, p0, Lyyds/ᛶᛶᛵᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 334
    .line 335
    iget-object v2, p0, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ:Landroid/view/View;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_12

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_12
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    add-int/2addr v4, v3

    .line 353
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-eqz v3, :cond_13

    .line 358
    .line 359
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_13
    move v3, v7

    .line 363
    :goto_9
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    invoke-virtual {p0, v8, v3, v4}, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ(III)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    add-int/2addr v8, v4

    .line 380
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    if-eqz v4, :cond_14

    .line 385
    .line 386
    iget v7, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 387
    .line 388
    :cond_14
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    invoke-virtual {p0, v4, v7, v8}, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ(III)I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-gtz v3, :cond_15

    .line 397
    .line 398
    if-ne v3, v1, :cond_19

    .line 399
    .line 400
    :cond_15
    if-gtz v4, :cond_16

    .line 401
    .line 402
    if-ne v4, v1, :cond_19

    .line 403
    .line 404
    :cond_16
    new-instance v1, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    if-eqz v7, :cond_17

    .line 418
    .line 419
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    check-cast v7, Lyyds/ᛲᛷᛶᛸ;

    .line 424
    .line 425
    invoke-virtual {v7, v3, v4}, Lyyds/ᛲᛷᛶᛸ;->ᛲᛲᲈᲈ(II)V

    .line 426
    .line 427
    .line 428
    goto :goto_a

    .line 429
    :cond_17
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    if-eqz v2, :cond_18

    .line 438
    .line 439
    iget-object v2, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 440
    .line 441
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 442
    .line 443
    .line 444
    :cond_18
    iput-object v5, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 447
    .line 448
    .line 449
    :cond_19
    :goto_b
    return v6

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
