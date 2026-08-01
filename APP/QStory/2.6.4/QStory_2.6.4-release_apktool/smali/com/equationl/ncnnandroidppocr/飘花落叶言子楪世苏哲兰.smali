.class public final Lcom/equationl/ncnnandroidppocr/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:[I

.field public final 飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;->INSTANCE:Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/equationl/ncnnandroidppocr/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    const/16 v0, 0x80

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v0, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    invoke-static {v1, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    invoke-static {v1, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    invoke-static {v0, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    invoke-static {v0, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-static {v1, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    const/high16 v2, -0x10000

    .line 40
    .line 41
    const v3, -0xff0100

    .line 42
    .line 43
    .line 44
    const v4, -0xffff01

    .line 45
    .line 46
    .line 47
    const/16 v5, -0x100

    .line 48
    .line 49
    const v6, -0xff01

    .line 50
    .line 51
    .line 52
    const v7, -0xff0001

    .line 53
    .line 54
    .line 55
    filled-new-array/range {v2 .. v13}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lcom/equationl/ncnnandroidppocr/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[I

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lcom/equationl/ncnnandroidppocr/bean/DrawModel;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/equationl/ncnnandroidppocr/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    invoke-interface {v2}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;->detectImagePath(Ljava/lang/String;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    return-object v4

    .line 26
    :cond_0
    sget-object v5, Lcom/equationl/ncnnandroidppocr/bean/DrawModel;->None:Lcom/equationl/ncnnandroidppocr/bean/DrawModel;

    .line 27
    .line 28
    if-eq v1, v5, :cond_c

    .line 29
    .line 30
    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_c

    .line 35
    .line 36
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    invoke-virtual {v3, v5, v6}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v7, Landroid/graphics/Canvas;

    .line 44
    .line 45
    invoke-direct {v7, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v8, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 54
    .line 55
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 56
    .line 57
    .line 58
    const/high16 v8, 0x40400000    # 3.0f

    .line 59
    .line 60
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 64
    .line 65
    .line 66
    new-instance v13, Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-direct {v13}, Landroid/graphics/Paint;-><init>()V

    .line 69
    .line 70
    .line 71
    const/high16 v8, 0x41c00000    # 24.0f

    .line 72
    .line 73
    invoke-virtual {v13, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v13, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v12, Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-direct {v12}, Landroid/graphics/Paint;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 85
    .line 86
    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    .line 88
    .line 89
    const/4 v8, -0x1

    .line 90
    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->getTextLines()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    const/4 v15, 0x0

    .line 102
    move v8, v15

    .line 103
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_b

    .line 108
    .line 109
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    add-int/lit8 v16, v8, 0x1

    .line 114
    .line 115
    if-ltz v8, :cond_a

    .line 116
    .line 117
    check-cast v9, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;

    .line 118
    .line 119
    iget-object v10, v0, Lcom/equationl/ncnnandroidppocr/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[I

    .line 120
    .line 121
    array-length v11, v10

    .line 122
    rem-int/2addr v8, v11

    .line 123
    aget v8, v10, v8

    .line 124
    .line 125
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v13, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    const/4 v10, 0x4

    .line 140
    if-ne v8, v10, :cond_1

    .line 141
    .line 142
    new-instance v8, Landroid/graphics/Path;

    .line 143
    .line 144
    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    check-cast v10, Landroid/graphics/Point;

    .line 156
    .line 157
    iget v10, v10, Landroid/graphics/Point;->x:I

    .line 158
    .line 159
    int-to-float v10, v10

    .line 160
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    check-cast v11, Landroid/graphics/Point;

    .line 169
    .line 170
    iget v11, v11, Landroid/graphics/Point;->y:I

    .line 171
    .line 172
    int-to-float v11, v11

    .line 173
    invoke-virtual {v8, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, Landroid/graphics/Point;

    .line 185
    .line 186
    iget v10, v10, Landroid/graphics/Point;->x:I

    .line 187
    .line 188
    int-to-float v10, v10

    .line 189
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    check-cast v11, Landroid/graphics/Point;

    .line 198
    .line 199
    iget v11, v11, Landroid/graphics/Point;->y:I

    .line 200
    .line 201
    int-to-float v11, v11

    .line 202
    invoke-virtual {v8, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    const/4 v11, 0x2

    .line 210
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    check-cast v10, Landroid/graphics/Point;

    .line 215
    .line 216
    iget v10, v10, Landroid/graphics/Point;->x:I

    .line 217
    .line 218
    int-to-float v10, v10

    .line 219
    move-object/from16 v17, v4

    .line 220
    .line 221
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Landroid/graphics/Point;

    .line 230
    .line 231
    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 232
    .line 233
    int-to-float v4, v4

    .line 234
    invoke-virtual {v8, v10, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const/4 v10, 0x3

    .line 242
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    check-cast v4, Landroid/graphics/Point;

    .line 247
    .line 248
    iget v4, v4, Landroid/graphics/Point;->x:I

    .line 249
    .line 250
    int-to-float v4, v4

    .line 251
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    check-cast v10, Landroid/graphics/Point;

    .line 260
    .line 261
    iget v10, v10, Landroid/graphics/Point;->y:I

    .line 262
    .line 263
    int-to-float v10, v10

    .line 264
    invoke-virtual {v8, v4, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v8, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 271
    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_1
    move-object/from16 v17, v4

    .line 275
    .line 276
    :goto_1
    sget-object v4, Lcom/equationl/ncnnandroidppocr/bean/DrawModel;->Full:Lcom/equationl/ncnnandroidppocr/bean/DrawModel;

    .line 277
    .line 278
    if-ne v1, v4, :cond_9

    .line 279
    .line 280
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-nez v4, :cond_9

    .line 289
    .line 290
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getText()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    if-lez v8, :cond_9

    .line 299
    .line 300
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_8

    .line 313
    .line 314
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    check-cast v10, Landroid/graphics/Point;

    .line 319
    .line 320
    iget v10, v10, Landroid/graphics/Point;->x:I

    .line 321
    .line 322
    :cond_2
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    if-eqz v11, :cond_3

    .line 327
    .line 328
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    check-cast v11, Landroid/graphics/Point;

    .line 333
    .line 334
    iget v11, v11, Landroid/graphics/Point;->x:I

    .line 335
    .line 336
    if-le v10, v11, :cond_2

    .line 337
    .line 338
    move v10, v11

    .line 339
    goto :goto_2

    .line 340
    :cond_3
    int-to-float v8, v10

    .line 341
    invoke-virtual {v9}, Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;->getPoints()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    if-eqz v10, :cond_7

    .line 354
    .line 355
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    check-cast v10, Landroid/graphics/Point;

    .line 360
    .line 361
    iget v10, v10, Landroid/graphics/Point;->y:I

    .line 362
    .line 363
    :cond_4
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    if-eqz v11, :cond_5

    .line 368
    .line 369
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    check-cast v11, Landroid/graphics/Point;

    .line 374
    .line 375
    iget v11, v11, Landroid/graphics/Point;->y:I

    .line 376
    .line 377
    if-le v10, v11, :cond_4

    .line 378
    .line 379
    move v10, v11

    .line 380
    goto :goto_3

    .line 381
    :cond_5
    int-to-float v9, v10

    .line 382
    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextSize()F

    .line 387
    .line 388
    .line 389
    move-result v11

    .line 390
    sub-float v18, v9, v11

    .line 391
    .line 392
    const/high16 v19, 0x40a00000    # 5.0f

    .line 393
    .line 394
    sub-float v18, v18, v19

    .line 395
    .line 396
    const/16 v20, 0x0

    .line 397
    .line 398
    cmpg-float v18, v18, v20

    .line 399
    .line 400
    if-gez v18, :cond_6

    .line 401
    .line 402
    add-float v9, v11, v19

    .line 403
    .line 404
    goto :goto_4

    .line 405
    :cond_6
    sub-float v9, v9, v19

    .line 406
    .line 407
    :goto_4
    sub-float v11, v9, v11

    .line 408
    .line 409
    add-float/2addr v10, v8

    .line 410
    add-float v19, v9, v19

    .line 411
    .line 412
    move v6, v9

    .line 413
    move v9, v11

    .line 414
    move/from16 v11, v19

    .line 415
    .line 416
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v7, v4, v8, v6, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 420
    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_7
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 424
    .line 425
    .line 426
    return-object v17

    .line 427
    :cond_8
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 428
    .line 429
    .line 430
    return-object v17

    .line 431
    :cond_9
    :goto_5
    move/from16 v8, v16

    .line 432
    .line 433
    move-object/from16 v4, v17

    .line 434
    .line 435
    const/4 v6, 0x1

    .line 436
    goto/16 :goto_0

    .line 437
    .line 438
    :cond_a
    move-object/from16 v17, v4

    .line 439
    .line 440
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪哲兰()V

    .line 441
    .line 442
    .line 443
    throw v17

    .line 444
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-object v8, v3

    .line 448
    goto :goto_6

    .line 449
    :cond_c
    move-object/from16 v17, v4

    .line 450
    .line 451
    move-object/from16 v8, v17

    .line 452
    .line 453
    :goto_6
    const/4 v9, 0x7

    .line 454
    const/4 v10, 0x0

    .line 455
    const/4 v4, 0x0

    .line 456
    const-wide/16 v5, 0x0

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    move-object v3, v2

    .line 460
    invoke-static/range {v3 .. v10}, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->copy$default(Lcom/equationl/ncnnandroidppocr/bean/OcrResult;Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    return-object v0
.end method
