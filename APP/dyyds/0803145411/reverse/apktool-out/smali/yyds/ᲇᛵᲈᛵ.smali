.class public final Lyyds/ᲇᛵᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᛳᲇ:Landroid/widget/ImageView;

.field public final ᛱᲈᲁ:Landroid/widget/TextView;

.field public final ᛲᛲᲈᲈ:Landroid/widget/ImageView;

.field public final ᛲᛳᛶᲁ:Landroid/view/View;

.field public final ᛲᛴᛳᛲ:Landroid/widget/ImageView;

.field public ᛲᲈᲁ:Lyyds/ᛴᛶᲁᛶ;

.field public ᛳᛸᛴᛶ:F

.field public final ᛳᲁᲁᲇ:Landroid/widget/LinearLayout;

.field public final ᛵᛶᛲᲀ:Landroid/widget/TextView;

.field public final ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public final ᛶᛳᛶᛵ:Landroid/widget/TextView;

.field public ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

.field public final synthetic ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

.field public final ᛷᛲᲈᛱ:Landroid/widget/RelativeLayout;

.field public final ᛷᛵᲇᲀ:Landroid/view/ViewGroup;

.field public final ᛷᲈᲈᲁ:Landroid/view/ViewGroup;

.field public final ᲀᛲᛲᲇ:Ljava/util/ArrayList;

.field public final ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

.field public final ᲇᛱᛲ:Landroid/widget/TextView;

.field public final ᲇᲇᲇᛱ:Landroid/widget/TextView;

.field public final ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛱᛱᛸ;Landroid/view/View;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 5
    .line 6
    const/high16 v0, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛳᛸᛴᛶ:F

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    const v0, 0x660900af

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 31
    .line 32
    iput-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 33
    .line 34
    const v1, 0x660900a6

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 42
    .line 43
    iput-object v1, p0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 44
    .line 45
    const v2, 0x66090088

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 53
    .line 54
    iput-object v2, p0, Lyyds/ᲇᛵᲈᛵ;->ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 55
    .line 56
    const v2, 0x66090276

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Landroid/widget/ImageView;

    .line 64
    .line 65
    iput-object v2, p0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛴᛳᛲ:Landroid/widget/ImageView;

    .line 66
    .line 67
    const v2, 0x660900a7

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Landroid/view/ViewGroup;

    .line 75
    .line 76
    const v2, 0x66090560

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Landroid/widget/TextView;

    .line 84
    .line 85
    iput-object v2, p0, Lyyds/ᲇᛵᲈᛵ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

    .line 86
    .line 87
    const v3, 0x660903c5

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Lyyds/ᲀᛶᛴᛷ;

    .line 95
    .line 96
    iput-object v3, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 97
    .line 98
    const v3, 0x660900a9

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Landroid/widget/LinearLayout;

    .line 106
    .line 107
    const v4, 0x6609055f

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Landroid/widget/TextView;

    .line 115
    .line 116
    iput-object v4, p0, Lyyds/ᲇᛵᲈᛵ;->ᛱᲈᲁ:Landroid/widget/TextView;

    .line 117
    .line 118
    const-string v4, "split"

    .line 119
    .line 120
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object v4, p0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 125
    .line 126
    const v5, 0x660900ad

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Landroid/view/ViewGroup;

    .line 134
    .line 135
    iput-object v5, p0, Lyyds/ᲇᛵᲈᛵ;->ᛷᲈᲈᲁ:Landroid/view/ViewGroup;

    .line 136
    .line 137
    const v5, 0x660900aa

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 145
    .line 146
    iput-object v5, p0, Lyyds/ᲇᛵᲈᛵ;->ᛷᛲᲈᛱ:Landroid/widget/RelativeLayout;

    .line 147
    .line 148
    iget-boolean v5, p1, Lyyds/ᛴᛱᛱᛸ;->ᛶᲀᲈᲇ:Z

    .line 149
    .line 150
    const/4 v6, 0x1

    .line 151
    if-nez v5, :cond_1

    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Landroid/view/ViewGroup;

    .line 158
    .line 159
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Landroid/view/ViewGroup;

    .line 164
    .line 165
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 169
    .line 170
    const/4 v8, -0x1

    .line 171
    const/4 v9, -0x2

    .line 172
    invoke-direct {v7, v8, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    :cond_1
    const-string v3, "cancelBox"

    .line 179
    .line 180
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Landroid/view/ViewGroup;

    .line 185
    .line 186
    iput-object v3, p0, Lyyds/ᲇᛵᲈᛵ;->ᛷᛵᲇᲀ:Landroid/view/ViewGroup;

    .line 187
    .line 188
    const v3, 0x660900a8

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    check-cast v3, Landroid/widget/LinearLayout;

    .line 196
    .line 197
    iput-object v3, p0, Lyyds/ᲇᛵᲈᛵ;->ᛳᲁᲁᲇ:Landroid/widget/LinearLayout;

    .line 198
    .line 199
    const v3, 0x66090116

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Landroid/widget/TextView;

    .line 207
    .line 208
    iput-object v3, p0, Lyyds/ᲇᛵᲈᛵ;->ᲇᛱᛲ:Landroid/widget/TextView;

    .line 209
    .line 210
    const v5, 0x66090117

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, Landroid/widget/TextView;

    .line 218
    .line 219
    iput-object v5, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛳᛶᛵ:Landroid/widget/TextView;

    .line 220
    .line 221
    const v7, 0x66090118

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    check-cast v7, Landroid/widget/TextView;

    .line 229
    .line 230
    iput-object v7, p0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛶᛲᲀ:Landroid/widget/TextView;

    .line 231
    .line 232
    const-string v8, "imgPositiveButtonSplit"

    .line 233
    .line 234
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    check-cast v8, Landroid/widget/ImageView;

    .line 239
    .line 240
    iput-object v8, p0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛲᲈᲈ:Landroid/widget/ImageView;

    .line 241
    .line 242
    const-string v8, "imgOtherButtonSplit"

    .line 243
    .line 244
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    check-cast v8, Landroid/widget/ImageView;

    .line 249
    .line 250
    iput-object v8, p0, Lyyds/ᲇᛵᲈᛵ;->ᛱᛳᲇ:Landroid/widget/ImageView;

    .line 251
    .line 252
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    iput-object p2, p0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛲᲇ:Ljava/util/ArrayList;

    .line 257
    .line 258
    iput v6, p1, Lyyds/ᛴᛱᛱᛸ;->ᛳᛷᛶᛲ:I

    .line 259
    .line 260
    iget-object p2, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 261
    .line 262
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    const/4 v9, 0x0

    .line 267
    invoke-virtual {v8, v9}, Landroid/view/View;->setTranslationZ(F)V

    .line 268
    .line 269
    .line 270
    sget-object v8, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 271
    .line 272
    iget-object v8, p1, Lyyds/ᛴᛱᛱᛸ;->ᛷᛴᛴᲁ:Lyyds/ᲇᲇᛱᲇ;

    .line 273
    .line 274
    const/4 v9, 0x0

    .line 275
    if-nez v8, :cond_2

    .line 276
    .line 277
    iput-object v9, p1, Lyyds/ᛴᛱᛱᛸ;->ᛷᛴᛴᲁ:Lyyds/ᲇᲇᛱᲇ;

    .line 278
    .line 279
    move-object v8, v9

    .line 280
    :cond_2
    if-nez v8, :cond_3

    .line 281
    .line 282
    iput-object v9, p1, Lyyds/ᛴᛱᛱᛸ;->ᛷᛴᛴᲁ:Lyyds/ᲇᲇᛱᲇ;

    .line 283
    .line 284
    :cond_3
    iget-object v8, p1, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ:Lyyds/ᲇᲇᛱᲇ;

    .line 285
    .line 286
    if-nez v8, :cond_4

    .line 287
    .line 288
    iput-object v9, p1, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ:Lyyds/ᲇᲇᛱᲇ;

    .line 289
    .line 290
    :cond_4
    iget-object v8, p1, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ:Lyyds/ᲇᲇᛱᲇ;

    .line 291
    .line 292
    if-nez v8, :cond_5

    .line 293
    .line 294
    iput-object v9, p1, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ:Lyyds/ᲇᲇᛱᲇ;

    .line 295
    .line 296
    :cond_5
    iget-object v8, p1, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 297
    .line 298
    if-nez v8, :cond_6

    .line 299
    .line 300
    iput-object v9, p1, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 301
    .line 302
    :cond_6
    if-eqz v2, :cond_7

    .line 303
    .line 304
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 309
    .line 310
    .line 311
    :cond_7
    if-eqz v3, :cond_8

    .line 312
    .line 313
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 318
    .line 319
    .line 320
    :cond_8
    if-eqz v7, :cond_9

    .line 321
    .line 322
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 327
    .line 328
    .line 329
    :cond_9
    if-eqz v5, :cond_a

    .line 330
    .line 331
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 336
    .line 337
    .line 338
    :cond_a
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    if-nez v2, :cond_b

    .line 343
    .line 344
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 353
    .line 354
    :goto_0
    int-to-float v2, v2

    .line 355
    goto :goto_1

    .line 356
    :cond_b
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    goto :goto_0

    .line 365
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setY(F)V

    .line 366
    .line 367
    .line 368
    iget-object v2, p1, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 369
    .line 370
    invoke-virtual {v0, v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V

    .line 371
    .line 372
    .line 373
    new-instance v2, Lyyds/ᛳᛵᲀᛲ;

    .line 374
    .line 375
    const/4 v8, 0x0

    .line 376
    invoke-direct {v2, v8, p0}, Lyyds/ᛳᛵᲀᛲ;-><init>(ILjava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    iput-object v2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛳᛶᲁ:Lyyds/ᛳᛵᲀ;

    .line 380
    .line 381
    if-eqz v3, :cond_c

    .line 382
    .line 383
    new-instance v2, Lyyds/ᲁᛴᲁᛸ;

    .line 384
    .line 385
    invoke-direct {v2, p0, v8}, Lyyds/ᲁᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 389
    .line 390
    .line 391
    :cond_c
    if-eqz v5, :cond_d

    .line 392
    .line 393
    new-instance v2, Lyyds/ᲁᛴᲁᛸ;

    .line 394
    .line 395
    invoke-direct {v2, p0, v6}, Lyyds/ᲁᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    const/4 v2, 0x2

    .line 402
    if-eqz v7, :cond_e

    .line 403
    .line 404
    new-instance v3, Lyyds/ᲁᛴᲁᛸ;

    .line 405
    .line 406
    invoke-direct {v3, p0, v2}, Lyyds/ᲁᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    .line 411
    .line 412
    :cond_e
    if-eqz v4, :cond_10

    .line 413
    .line 414
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 418
    .line 419
    .line 420
    move-result p2

    .line 421
    if-eqz p2, :cond_f

    .line 422
    .line 423
    const p2, 0x66080188

    .line 424
    .line 425
    .line 426
    goto :goto_2

    .line 427
    :cond_f
    const p2, 0x66080189

    .line 428
    .line 429
    .line 430
    :goto_2
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    iput v6, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 441
    .line 442
    invoke-virtual {v4, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 443
    .line 444
    .line 445
    :cond_10
    new-instance p2, Lyyds/ᛱᛱᛴ;

    .line 446
    .line 447
    const/4 v3, 0x6

    .line 448
    invoke-direct {p2, v3, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    iput-object p2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲈᲈᲁ:Lyyds/ᲈᛲᛵ;

    .line 452
    .line 453
    new-instance p2, Lyyds/ᛴᛴᲁᛸ;

    .line 454
    .line 455
    invoke-direct {p2, p0, v6}, Lyyds/ᛴᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 459
    .line 460
    .line 461
    new-instance p2, Lyyds/ᛴᛴᲁᛸ;

    .line 462
    .line 463
    invoke-direct {p2, p0, v2}, Lyyds/ᛴᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 464
    .line 465
    .line 466
    iget-wide v0, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 467
    .line 468
    const-wide/16 v2, 0x0

    .line 469
    .line 470
    cmp-long v2, v0, v2

    .line 471
    .line 472
    if-ltz v2, :cond_11

    .line 473
    .line 474
    goto :goto_3

    .line 475
    :cond_11
    const-wide/16 v0, 0x12c

    .line 476
    .line 477
    :goto_3
    invoke-static {p2, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲇᛲᛱ(Ljava/lang/Runnable;J)V

    .line 478
    .line 479
    .line 480
    iput-object p0, p1, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 481
    .line 482
    invoke-virtual {p0}, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ()V

    .line 483
    .line 484
    .line 485
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-boolean p1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ:Z

    .line 20
    .line 21
    if-nez p1, :cond_5

    .line 22
    .line 23
    iget-object p1, v0, Lyyds/ᛴᛱᛱᛸ;->ᲁᛶᛴᛸ:Lyyds/ᲁᛳᲀᛸ;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    new-instance p1, Lyyds/ᲁᛳᲀᛸ;

    .line 28
    .line 29
    invoke-direct {p1, v1, p0}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, Lyyds/ᛴᛱᛱᛸ;->ᲁᛶᛴᛸ:Lyyds/ᲁᛳᲀᛸ;

    .line 33
    .line 34
    :cond_2
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ:Z

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    new-instance p1, Lyyds/ᲁᛳᲀᛸ;

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v0, Lyyds/ᛴᛱᛱᛸ;->ᲁᛶᛴᛸ:Lyyds/ᲁᛳᲀᛸ;

    .line 45
    .line 46
    :cond_3
    invoke-virtual {p1, v0}, Lyyds/ᲁᛳᲀᛸ;->ᛳᛸᛴᛶ(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lyyds/ᛴᛴᲁᛸ;

    .line 50
    .line 51
    invoke-direct {p1, p0, v1}, Lyyds/ᛴᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 52
    .line 53
    .line 54
    iget-wide v0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ:J

    .line 55
    .line 56
    const-wide/16 v2, -0x1

    .line 57
    .line 58
    cmp-long p0, v0, v2

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    const-wide/16 v0, 0x12c

    .line 64
    .line 65
    :goto_0
    invoke-static {p1, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲇᛲᛱ(Ljava/lang/Runnable;J)V

    .line 66
    .line 67
    .line 68
    :cond_5
    :goto_1
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛶᛵᲁᛵ;

    .line 12
    .line 13
    invoke-direct {v0}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-wide v0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ:J

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v3, v0, v3

    .line 25
    .line 26
    if-ltz v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-wide/16 v0, 0x12c

    .line 30
    .line 31
    :goto_0
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    const/4 v4, 0x2

    .line 45
    new-array v4, v4, [F

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    aput v3, v4, v5

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    aput v2, v4, v3

    .line 52
    .line 53
    const-string v2, "y"

    .line 54
    .line 55
    invoke-static {p0, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᲇᛵᲈᛵ;->ᛷᛵᲇᲀ:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v2, v0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛴᛳᛲ:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object v3, v0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 8
    .line 9
    iget-object v4, v0, Lyyds/ᲇᛵᲈᛵ;->ᲇᛱᛲ:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object v5, v0, Lyyds/ᲇᛵᲈᛵ;->ᛱᲈᲁ:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v6, v0, Lyyds/ᲇᛵᲈᛵ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

    .line 14
    .line 15
    iget-object v7, v0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛶᛲᲀ:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v8, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛳᛶᛵ:Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v9, v0, Lyyds/ᲇᛵᲈᛵ;->ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 20
    .line 21
    iget-object v10, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 22
    .line 23
    iget-object v11, v0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 24
    .line 25
    if-eqz v11, :cond_18

    .line 26
    .line 27
    invoke-virtual {v10}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 28
    .line 29
    .line 30
    move-result-object v12

    .line 31
    iget-object v13, v10, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 32
    .line 33
    if-nez v12, :cond_0

    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    sget-object v12, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    invoke-virtual {v9, v12}, Landroid/view/View;->setMinimumWidth(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9, v12}, Landroid/view/View;->setMinimumHeight(I)V

    .line 47
    .line 48
    .line 49
    iget-boolean v14, v10, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ:Z

    .line 50
    .line 51
    iput-boolean v14, v11, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ:Z

    .line 52
    .line 53
    iget-object v14, v10, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ:[I

    .line 54
    .line 55
    aget v15, v14, v12

    .line 56
    .line 57
    move/from16 v16, v12

    .line 58
    .line 59
    const/4 v12, 0x1

    .line 60
    aget v17, v14, v12

    .line 61
    .line 62
    const/16 v18, 0x2

    .line 63
    .line 64
    aget v19, v14, v18

    .line 65
    .line 66
    move/from16 v20, v12

    .line 67
    .line 68
    const/4 v12, 0x3

    .line 69
    aget v14, v14, v12

    .line 70
    .line 71
    move/from16 v21, v12

    .line 72
    .line 73
    iget-object v12, v11, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 74
    .line 75
    aput v15, v12, v16

    .line 76
    .line 77
    aput v17, v12, v20

    .line 78
    .line 79
    aput v19, v12, v18

    .line 80
    .line 81
    aput v14, v12, v21

    .line 82
    .line 83
    iget-object v12, v10, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v6, v12}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    iget-object v12, v10, Lyyds/ᛴᛱᛱᛸ;->ᛷᛸᲇᛶ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v5, v12}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    invoke-static {v6, v12}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v5, v12}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 98
    .line 99
    .line 100
    iget-object v14, v10, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛵᛷ:Lyyds/ᲇᲇᛱᲇ;

    .line 101
    .line 102
    invoke-static {v4, v14}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 103
    .line 104
    .line 105
    iget-object v14, v10, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ:Lyyds/ᲇᲇᛱᲇ;

    .line 106
    .line 107
    invoke-static {v8, v14}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 108
    .line 109
    .line 110
    iget-object v14, v10, Lyyds/ᛴᛱᛱᛸ;->ᛷᛴᛴᲁ:Lyyds/ᲇᲇᛱᲇ;

    .line 111
    .line 112
    invoke-static {v7, v14}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 113
    .line 114
    .line 115
    iget-boolean v14, v10, Lyyds/ᛴᛱᛱᛸ;->ᛱᛸᲁᲇ:Z

    .line 116
    .line 117
    if-eqz v14, :cond_2

    .line 118
    .line 119
    invoke-virtual {v10}, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ()Z

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    if-eqz v14, :cond_1

    .line 124
    .line 125
    new-instance v12, Lyyds/ᲁᛴᲁᛸ;

    .line 126
    .line 127
    move/from16 v14, v21

    .line 128
    .line 129
    invoke-direct {v12, v0, v14}, Lyyds/ᲁᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_1
    invoke-virtual {v11, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    move/from16 v12, v16

    .line 141
    .line 142
    invoke-virtual {v11, v12}, Landroid/view/View;->setClickable(Z)V

    .line 143
    .line 144
    .line 145
    :goto_0
    iget-object v11, v0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 146
    .line 147
    new-instance v12, Lyyds/ᲁᛴᲁᛸ;

    .line 148
    .line 149
    const/4 v14, 0x4

    .line 150
    invoke-direct {v12, v0, v14}, Lyyds/ᲁᛴᲁᛸ;-><init>(Lyyds/ᲇᛵᲈᛵ;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    .line 155
    .line 156
    iget v11, v10, Lyyds/ᛴᛱᛱᛸ;->ᛸᛴᛵᛶ:F

    .line 157
    .line 158
    const/high16 v12, -0x40800000    # -1.0f

    .line 159
    .line 160
    cmpl-float v11, v11, v12

    .line 161
    .line 162
    const/16 v12, 0x8

    .line 163
    .line 164
    if-lez v11, :cond_5

    .line 165
    .line 166
    invoke-virtual {v9}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    instance-of v11, v11, Landroid/graphics/drawable/GradientDrawable;

    .line 171
    .line 172
    if-eqz v11, :cond_3

    .line 173
    .line 174
    invoke-virtual {v9}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    check-cast v11, Landroid/graphics/drawable/GradientDrawable;

    .line 179
    .line 180
    if-eqz v11, :cond_3

    .line 181
    .line 182
    iget v15, v10, Lyyds/ᛴᛱᛱᛸ;->ᛸᛴᛵᛶ:F

    .line 183
    .line 184
    move/from16 v17, v14

    .line 185
    .line 186
    new-array v14, v12, [F

    .line 187
    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    aput v15, v14, v16

    .line 191
    .line 192
    aput v15, v14, v20

    .line 193
    .line 194
    aput v15, v14, v18

    .line 195
    .line 196
    const/16 v21, 0x3

    .line 197
    .line 198
    aput v15, v14, v21

    .line 199
    .line 200
    const/4 v15, 0x0

    .line 201
    aput v15, v14, v17

    .line 202
    .line 203
    const/16 v17, 0x5

    .line 204
    .line 205
    aput v15, v14, v17

    .line 206
    .line 207
    const/16 v17, 0x6

    .line 208
    .line 209
    aput v15, v14, v17

    .line 210
    .line 211
    const/16 v17, 0x7

    .line 212
    .line 213
    aput v15, v14, v17

    .line 214
    .line 215
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 216
    .line 217
    .line 218
    :cond_3
    new-instance v11, Lyyds/ᛷᛵᛶᛸ;

    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    invoke-direct {v11, v14, v0}, Lyyds/ᛷᛵᛶᛸ;-><init>(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v11}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 225
    .line 226
    .line 227
    move/from16 v11, v20

    .line 228
    .line 229
    invoke-virtual {v9, v11}, Landroid/view/View;->setClipToOutline(Z)V

    .line 230
    .line 231
    .line 232
    iget-object v9, v0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛲᲇ:Ljava/util/ArrayList;

    .line 233
    .line 234
    if-eqz v9, :cond_5

    .line 235
    .line 236
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    if-nez v11, :cond_4

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Landroid/view/View;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_5
    :goto_1
    iget-object v9, v10, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 261
    .line 262
    if-eqz v9, :cond_9

    .line 263
    .line 264
    invoke-virtual {v9}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    if-eqz v9, :cond_9

    .line 269
    .line 270
    iget-object v9, v10, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 271
    .line 272
    iget-object v11, v0, Lyyds/ᲇᛵᲈᛵ;->ᛷᛲᲈᛱ:Landroid/widget/RelativeLayout;

    .line 273
    .line 274
    invoke-virtual {v9, v11, v13}, Lyyds/ᛸᲀᛷᲀ;->ᛵᛸᛸᛷ(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V

    .line 275
    .line 276
    .line 277
    iget-object v9, v10, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 278
    .line 279
    invoke-virtual {v9}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    instance-of v9, v9, Lyyds/ᲀᛶᛴᛷ;

    .line 284
    .line 285
    if-eqz v9, :cond_7

    .line 286
    .line 287
    iget-object v9, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 288
    .line 289
    instance-of v11, v9, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 290
    .line 291
    if-eqz v11, :cond_6

    .line 292
    .line 293
    check-cast v9, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    invoke-virtual {v9, v14}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 297
    .line 298
    .line 299
    :cond_6
    iget-object v9, v10, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 300
    .line 301
    invoke-virtual {v9}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    check-cast v9, Lyyds/ᲀᛶᛴᛷ;

    .line 306
    .line 307
    iput-object v9, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_7
    iget-object v9, v10, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 311
    .line 312
    invoke-virtual {v9}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    const-string v11, "ScrollController"

    .line 317
    .line 318
    invoke-virtual {v9, v11}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    instance-of v11, v9, Lyyds/ᲀᛶᛴᛷ;

    .line 323
    .line 324
    if-eqz v11, :cond_9

    .line 325
    .line 326
    iget-object v11, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 327
    .line 328
    instance-of v14, v11, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 329
    .line 330
    if-eqz v14, :cond_8

    .line 331
    .line 332
    check-cast v11, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    invoke-virtual {v11, v14}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 336
    .line 337
    .line 338
    :cond_8
    check-cast v9, Lyyds/ᲀᛶᛴᛷ;

    .line 339
    .line 340
    iput-object v9, v0, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 341
    .line 342
    :cond_9
    :goto_2
    invoke-virtual {v10}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ()Z

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    if-eqz v9, :cond_a

    .line 347
    .line 348
    invoke-virtual {v10}, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ()Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-eqz v9, :cond_a

    .line 353
    .line 354
    if-eqz v2, :cond_b

    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_a
    if-eqz v2, :cond_b

    .line 362
    .line 363
    invoke-virtual {v2, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    :cond_b
    :goto_3
    iget-object v2, v0, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛴᛶᲁᛶ;

    .line 367
    .line 368
    if-eqz v2, :cond_c

    .line 369
    .line 370
    invoke-virtual {v2, v13, v0}, Lyyds/ᛴᛶᲁᛶ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛱᛸ;Lyyds/ᲇᛵᲈᛵ;)V

    .line 371
    .line 372
    .line 373
    :cond_c
    if-eqz v3, :cond_f

    .line 374
    .line 375
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_d

    .line 380
    .line 381
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-nez v2, :cond_e

    .line 386
    .line 387
    :cond_d
    const/4 v14, 0x0

    .line 388
    goto :goto_4

    .line 389
    :cond_e
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 390
    .line 391
    .line 392
    :cond_f
    const/4 v14, 0x0

    .line 393
    goto :goto_5

    .line 394
    :goto_4
    invoke-virtual {v3, v14}, Landroid/view/View;->setVisibility(I)V

    .line 395
    .line 396
    .line 397
    :goto_5
    if-eqz v1, :cond_11

    .line 398
    .line 399
    iget-object v2, v10, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛸᲇᛶ(Ljava/lang/CharSequence;)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_10

    .line 406
    .line 407
    invoke-virtual {v1, v12}, Landroid/view/View;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_10
    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 412
    .line 413
    .line 414
    :cond_11
    :goto_6
    iget-object v1, v10, Lyyds/ᛴᛱᛱᛸ;->ᛸᛸᛷᛱ:Ljava/lang/String;

    .line 415
    .line 416
    invoke-static {v7, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 417
    .line 418
    .line 419
    iget-object v1, v10, Lyyds/ᛴᛱᛱᛸ;->ᛱᛳᛶᛳ:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {v4, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v10, Lyyds/ᛴᛱᛱᛸ;->ᲀᛲᛱᛱ:Ljava/lang/String;

    .line 425
    .line 426
    invoke-static {v8, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, Lyyds/ᲇᛵᲈᛵ;->ᛳᲁᲁᲇ:Landroid/widget/LinearLayout;

    .line 430
    .line 431
    if-eqz v1, :cond_16

    .line 432
    .line 433
    if-eqz v4, :cond_12

    .line 434
    .line 435
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-eqz v2, :cond_14

    .line 440
    .line 441
    :cond_12
    if-eqz v8, :cond_13

    .line 442
    .line 443
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-eqz v2, :cond_14

    .line 448
    .line 449
    :cond_13
    if-eqz v7, :cond_15

    .line 450
    .line 451
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-nez v2, :cond_15

    .line 456
    .line 457
    :cond_14
    move v12, v14

    .line 458
    :cond_15
    invoke-virtual {v1, v12}, Landroid/view/View;->setVisibility(I)V

    .line 459
    .line 460
    .line 461
    :cond_16
    iget-object v1, v0, Lyyds/ᲇᛵᲈᛵ;->ᛲᛲᲈᲈ:Landroid/widget/ImageView;

    .line 462
    .line 463
    if-eqz v1, :cond_17

    .line 464
    .line 465
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 470
    .line 471
    .line 472
    :cond_17
    iget-object v0, v0, Lyyds/ᲇᛵᲈᛵ;->ᛱᛳᲇ:Landroid/widget/ImageView;

    .line 473
    .line 474
    if-eqz v0, :cond_18

    .line 475
    .line 476
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 481
    .line 482
    .line 483
    :cond_18
    :goto_7
    return-void
.end method
