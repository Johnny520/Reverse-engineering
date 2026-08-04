.class public final synthetic Lyyds/ᲇᲇᛸᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(ILcom/ss/android/ugc/awemes/MainActivity;Ljava/util/List;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛴᲁᛱᲇ;ILandroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput p2, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    iput-object p3, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput-object p4, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲀᛱᛷᲀ;Landroid/view/SurfaceView;ILandroid/graphics/Bitmap;)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput p3, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    iput-object p4, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lyyds/ᛴᲁᛱᲇ;

    .line 13
    .line 14
    iget v1, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/widget/ImageView;

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    iget v0, v0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    if-ne v0, v1, :cond_5

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eq v0, p0, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    if-nez p0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x5

    .line 39
    if-ne v1, v0, :cond_2

    .line 40
    .line 41
    move v3, v4

    .line 42
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    sub-int/2addr v0, v1

    .line 51
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sub-int/2addr v0, v1

    .line 56
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-int/2addr v1, v4

    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    sub-int/2addr v1, v4

    .line 70
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-lez v0, :cond_5

    .line 79
    .line 80
    if-lez v1, :cond_5

    .line 81
    .line 82
    if-lez v4, :cond_5

    .line 83
    .line 84
    if-gtz p0, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    int-to-float v0, v0

    .line 88
    int-to-float v4, v4

    .line 89
    div-float v5, v0, v4

    .line 90
    .line 91
    int-to-float v1, v1

    .line 92
    int-to-float p0, p0

    .line 93
    div-float v6, v1, p0

    .line 94
    .line 95
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    mul-float/2addr v4, v5

    .line 100
    sub-float/2addr v0, v4

    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    div-float/2addr v0, v4

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    mul-float/2addr p0, v5

    .line 107
    sub-float/2addr v1, p0

    .line 108
    goto :goto_0

    .line 109
    :cond_4
    const/4 v1, 0x0

    .line 110
    :goto_0
    new-instance p0, Landroid/graphics/Matrix;

    .line 111
    .line 112
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v5, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    return-void

    .line 125
    :pswitch_0
    iget v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    .line 126
    .line 127
    iget-object v5, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 130
    .line 131
    iget-object v6, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v6, Ljava/util/List;

    .line 134
    .line 135
    iget-object p0, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    iget v7, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᲀᛲᲀ:I

    .line 140
    .line 141
    if-ne v0, v7, :cond_15

    .line 142
    .line 143
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_15

    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    goto/16 :goto_a

    .line 156
    .line 157
    :cond_6
    const/4 v0, 0x0

    .line 158
    iput-object v0, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 159
    .line 160
    iget-object v7, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ:Lyyds/ᛱᛷᛲᲀ;

    .line 161
    .line 162
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_7

    .line 167
    .line 168
    new-instance p0, Lyyds/ᲇᛶᲁᲀ;

    .line 169
    .line 170
    const-wide v8, -0xf7dbe68a836eL

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-wide v8, -0xf7e4e68a836eL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    const-wide v9, -0xf801e68a836eL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    new-instance v10, Lyyds/ᛳᲀᲀᛶ;

    .line 198
    .line 199
    invoke-direct {v10, v5, v2}, Lyyds/ᛳᲀᲀᛶ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 200
    .line 201
    .line 202
    invoke-direct {p0, v1, v8, v9, v10}, Lyyds/ᲇᛶᲁᲀ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_7
    new-instance p0, Lyyds/ᲇᛶᲁᲀ;

    .line 207
    .line 208
    const-wide v8, -0xf806e68a836eL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const-wide v8, -0xf80ee68a836eL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    const-wide v9, -0xf82de68a836eL

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    new-instance v10, Lyyds/ᛳᲀᲀᛶ;

    .line 236
    .line 237
    invoke-direct {v10, v5, v1}, Lyyds/ᛳᲀᲀᛶ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p0, v2, v8, v9, v10}, Lyyds/ᲇᛶᲁᲀ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 241
    .line 242
    .line 243
    :goto_2
    iget-object v1, v7, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 244
    .line 245
    const-wide v8, -0x551fde68a836eL

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    const-wide v8, -0x55202e68a836eL

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    iget-object v2, v7, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 267
    .line 268
    .line 269
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_8

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_8
    move-object p0, v0

    .line 277
    :goto_3
    iput-object p0, v7, Lyyds/ᛱᛷᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

    .line 278
    .line 279
    iget-object p0, v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛳᛶᛵ:Landroid/widget/TextView;

    .line 280
    .line 281
    if-eqz p0, :cond_d

    .line 282
    .line 283
    new-instance v2, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-wide v8, -0x5521ae68a836eL

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-wide v8, -0x5521de68a836eL

    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-eqz v8, :cond_9

    .line 321
    .line 322
    move v9, v3

    .line 323
    goto :goto_5

    .line 324
    :cond_9
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    move v9, v3

    .line 329
    :cond_a
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v10, :cond_c

    .line 334
    .line 335
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    check-cast v10, Lyyds/ᛱᛷᲁᲁ;

    .line 340
    .line 341
    iget-boolean v10, v10, Lyyds/ᛱᛷᲁᲁ;->ᛱᲈᲁ:Z

    .line 342
    .line 343
    if-eqz v10, :cond_a

    .line 344
    .line 345
    add-int/lit8 v9, v9, 0x1

    .line 346
    .line 347
    if-ltz v9, :cond_b

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_b
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᛵᛶᛲᲀ()V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_c
    :goto_5
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-wide v8, -0x5522de68a836eL

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 374
    .line 375
    .line 376
    :cond_d
    invoke-virtual {v7}, Lyyds/ᛲᛵᲇᛳ;->ᲀᛲᛳᲀ()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛴᛵᛶ()V

    .line 380
    .line 381
    .line 382
    iget-object p0, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 383
    .line 384
    sget-object v1, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 385
    .line 386
    if-ne p0, v1, :cond_13

    .line 387
    .line 388
    iget-object p0, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 389
    .line 390
    if-nez p0, :cond_e

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_e
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    const/4 v2, -0x1

    .line 402
    if-eqz v1, :cond_10

    .line 403
    .line 404
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Lyyds/ᛱᛷᲁᲁ;

    .line 409
    .line 410
    iget-object v1, v1, Lyyds/ᛱᛷᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 411
    .line 412
    const-wide v6, -0xf3a4e68a836eL

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_f

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 429
    .line 430
    goto :goto_6

    .line 431
    :cond_10
    move v3, v2

    .line 432
    :goto_7
    if-ne v3, v2, :cond_11

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_11
    iget-object p0, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 436
    .line 437
    if-nez p0, :cond_12

    .line 438
    .line 439
    const-wide v1, -0xf3bde68a836eL

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_12
    move-object v0, p0

    .line 449
    :goto_8
    new-instance p0, Lyyds/ᛱᲈᛴᛵ;

    .line 450
    .line 451
    invoke-direct {p0, v5, v3, v4}, Lyyds/ᛱᲈᛴᛵ;-><init>(Landroid/view/KeyEvent$Callback;II)V

    .line 452
    .line 453
    .line 454
    const-wide/16 v1, 0x168

    .line 455
    .line 456
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 457
    .line 458
    .line 459
    :cond_13
    :goto_9
    iget-object p0, v5, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 460
    .line 461
    if-nez p0, :cond_14

    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    new-instance v0, Lyyds/ᲈᛱᛴᛵ;

    .line 469
    .line 470
    invoke-direct {v0, v5}, Lyyds/ᲈᛱᛴᛵ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 474
    .line 475
    .line 476
    :cond_15
    :goto_a
    return-void

    .line 477
    :pswitch_1
    iget-object v0, p0, Lyyds/ᲇᲇᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lyyds/ᲀᛱᛷᲀ;

    .line 480
    .line 481
    iget-object v3, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v3, Landroid/view/SurfaceView;

    .line 484
    .line 485
    iget v5, p0, Lyyds/ᲇᲇᛸᛵ;->ᲇᲈᛵᛷ:I

    .line 486
    .line 487
    iget-object p0, p0, Lyyds/ᲇᲇᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast p0, Landroid/graphics/Bitmap;

    .line 490
    .line 491
    iget-object v6, v0, Lyyds/ᲀᛱᛷᲀ;->ᲈᲀᛲᲀ:Ljava/util/WeakHashMap;

    .line 492
    .line 493
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 494
    .line 495
    invoke-virtual {v6, v3, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    if-nez v5, :cond_17

    .line 499
    .line 500
    iget-object v1, v0, Lyyds/ᲀᛱᛷᲀ;->ᛲᛶᛱᲈ:Ljava/util/WeakHashMap;

    .line 501
    .line 502
    invoke-virtual {v1, v3, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    check-cast p0, Landroid/graphics/Bitmap;

    .line 507
    .line 508
    if-eqz p0, :cond_16

    .line 509
    .line 510
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 511
    .line 512
    .line 513
    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 514
    .line 515
    .line 516
    goto :goto_b

    .line 517
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v6, "PixelCopy failed. Result: "

    .line 520
    .line 521
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    const-string v6, "BaseBlurView"

    .line 532
    .line 533
    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    if-eq v5, v1, :cond_18

    .line 537
    .line 538
    if-eq v5, v4, :cond_18

    .line 539
    .line 540
    if-ne v5, v2, :cond_19

    .line 541
    .line 542
    :cond_18
    const-wide/16 v1, 0x64

    .line 543
    .line 544
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 545
    .line 546
    .line 547
    :cond_19
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 548
    .line 549
    .line 550
    :goto_b
    return-void

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
