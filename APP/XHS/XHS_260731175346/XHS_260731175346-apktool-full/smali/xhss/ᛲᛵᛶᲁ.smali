.class public final Lxhss/ᛲᛵᛶᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

.field public ᛳᛶᛷᲀ:F

.field public final ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

.field public final ᛳᲈᲈᛲ:Landroid/widget/LinearLayout;

.field public final ᛴᲈᛱᛴ:Ljava/util/ArrayList;

.field public final ᛶᲇᲈᛸ:Landroid/widget/TextView;

.field public final ᛷᛴᛷᛱ:Landroid/widget/ImageView;

.field public ᛷᛵᛵᲈ:Lxhss/ᛷᛶᲀᛲ;

.field public final ᛷᲁᲁ:Landroid/view/ViewGroup;

.field public final ᛸᛲᛷᛱ:Landroid/widget/TextView;

.field public final ᛸᛲᲀᛵ:Landroid/view/View;

.field public final ᛸᛴᛶᛳ:Landroid/widget/TextView;

.field public final ᛸᛶᛴᲈ:Landroid/widget/TextView;

.field public final ᛸᛶᲈᛶ:Landroid/widget/ImageView;

.field public final ᛸᛷᲈᲈ:Landroid/view/ViewGroup;

.field public ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

.field public final synthetic ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

.field public final ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

.field public final ᲇᛶᛴᲀ:Landroid/widget/TextView;

.field public final ᲇᛸᛳᲁ:Landroid/widget/ImageView;

.field public final ᲈᛳᲀ:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Lxhss/ᛵᲇᲀᛳ;Landroid/view/View;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 5
    .line 6
    const/high16 v0, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛳᛶᛷᲀ:F

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    const v0, 0x64080051

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 28
    .line 29
    iput-object v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 30
    .line 31
    const v1, 0x64080048

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 39
    .line 40
    iput-object v1, p0, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 41
    .line 42
    const v2, 0x64080045

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 50
    .line 51
    iput-object v2, p0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 52
    .line 53
    const v2, 0x64080088

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroid/widget/ImageView;

    .line 61
    .line 62
    iput-object v2, p0, Lxhss/ᛲᛵᛶᲁ;->ᛷᛴᛷᛱ:Landroid/widget/ImageView;

    .line 63
    .line 64
    const v2, 0x64080049

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Landroid/view/ViewGroup;

    .line 72
    .line 73
    const v2, 0x64080122

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Landroid/widget/TextView;

    .line 81
    .line 82
    iput-object v2, p0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛶᛴᲀ:Landroid/widget/TextView;

    .line 83
    .line 84
    const v3, 0x640800d7

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lxhss/ᛵᛳᛶᛷ;

    .line 92
    .line 93
    iput-object v3, p0, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 94
    .line 95
    const v3, 0x6408004b

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Landroid/widget/LinearLayout;

    .line 103
    .line 104
    const v4, 0x64080121

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Landroid/widget/TextView;

    .line 112
    .line 113
    iput-object v4, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛴᛶᛳ:Landroid/widget/TextView;

    .line 114
    .line 115
    const-string v4, "split"

    .line 116
    .line 117
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iput-object v4, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛲᲀᛵ:Landroid/view/View;

    .line 122
    .line 123
    const v5, 0x6408004f

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Landroid/view/ViewGroup;

    .line 131
    .line 132
    iput-object v5, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛷᲈᲈ:Landroid/view/ViewGroup;

    .line 133
    .line 134
    const v5, 0x6408004c

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 142
    .line 143
    iput-object v5, p0, Lxhss/ᛲᛵᛶᲁ;->ᲈᛳᲀ:Landroid/widget/RelativeLayout;

    .line 144
    .line 145
    iget-boolean v5, p1, Lxhss/ᛵᲇᲀᛳ;->ᛵᛷᛲᛸ:Z

    .line 146
    .line 147
    const/4 v6, 0x1

    .line 148
    if-nez v5, :cond_1

    .line 149
    .line 150
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Landroid/view/ViewGroup;

    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 166
    .line 167
    const/4 v8, -0x1

    .line 168
    const/4 v9, -0x2

    .line 169
    invoke-direct {v7, v8, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5, v3, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 173
    .line 174
    .line 175
    :cond_1
    const-string v3, "cancelBox"

    .line 176
    .line 177
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Landroid/view/ViewGroup;

    .line 182
    .line 183
    iput-object v3, p0, Lxhss/ᛲᛵᛶᲁ;->ᛷᲁᲁ:Landroid/view/ViewGroup;

    .line 184
    .line 185
    const v3, 0x6408004a

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Landroid/widget/LinearLayout;

    .line 193
    .line 194
    iput-object v3, p0, Lxhss/ᛲᛵᛶᲁ;->ᛳᲈᲈᛲ:Landroid/widget/LinearLayout;

    .line 195
    .line 196
    const v3, 0x64080054

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Landroid/widget/TextView;

    .line 204
    .line 205
    iput-object v3, p0, Lxhss/ᛲᛵᛶᲁ;->ᛶᲇᲈᛸ:Landroid/widget/TextView;

    .line 206
    .line 207
    const v5, 0x64080055

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Landroid/widget/TextView;

    .line 215
    .line 216
    iput-object v5, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛶᛴᲈ:Landroid/widget/TextView;

    .line 217
    .line 218
    const v7, 0x64080056

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    check-cast v7, Landroid/widget/TextView;

    .line 226
    .line 227
    iput-object v7, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛲᛷᛱ:Landroid/widget/TextView;

    .line 228
    .line 229
    const-string v8, "imgPositiveButtonSplit"

    .line 230
    .line 231
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    check-cast v8, Landroid/widget/ImageView;

    .line 236
    .line 237
    iput-object v8, p0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛶᲈᛶ:Landroid/widget/ImageView;

    .line 238
    .line 239
    const-string v8, "imgOtherButtonSplit"

    .line 240
    .line 241
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    check-cast v8, Landroid/widget/ImageView;

    .line 246
    .line 247
    iput-object v8, p0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛸᛳᲁ:Landroid/widget/ImageView;

    .line 248
    .line 249
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    iput-object p2, p0, Lxhss/ᛲᛵᛶᲁ;->ᛴᲈᛱᛴ:Ljava/util/ArrayList;

    .line 254
    .line 255
    iget-object p2, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 256
    .line 257
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    const/4 v9, 0x0

    .line 262
    invoke-virtual {v8, v9}, Landroid/view/View;->setTranslationZ(F)V

    .line 263
    .line 264
    .line 265
    sget-object v8, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 266
    .line 267
    iget-object v8, p1, Lxhss/ᛵᲇᲀᛳ;->ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    if-nez v8, :cond_2

    .line 271
    .line 272
    iput-object v9, p1, Lxhss/ᛵᲇᲀᛳ;->ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

    .line 273
    .line 274
    move-object v8, v9

    .line 275
    :cond_2
    if-nez v8, :cond_3

    .line 276
    .line 277
    iput-object v9, p1, Lxhss/ᛵᲇᲀᛳ;->ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

    .line 278
    .line 279
    :cond_3
    iget-object v8, p1, Lxhss/ᛵᲇᲀᛳ;->ᛱᲈᛳᛴ:Lxhss/ᛶᛸᛸᛵ;

    .line 280
    .line 281
    if-nez v8, :cond_4

    .line 282
    .line 283
    iput-object v9, p1, Lxhss/ᛵᲇᲀᛳ;->ᛱᲈᛳᛴ:Lxhss/ᛶᛸᛸᛵ;

    .line 284
    .line 285
    :cond_4
    iget-object v8, p1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛷᲇᲇ:Lxhss/ᛶᛸᛸᛵ;

    .line 286
    .line 287
    if-nez v8, :cond_5

    .line 288
    .line 289
    iput-object v9, p1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛷᲇᲇ:Lxhss/ᛶᛸᛸᛵ;

    .line 290
    .line 291
    :cond_5
    iget-object v8, p1, Lxhss/ᛵᲇᲀᛳ;->ᛱᛳᲁᲈ:Ljava/lang/String;

    .line 292
    .line 293
    if-nez v8, :cond_6

    .line 294
    .line 295
    iput-object v9, p1, Lxhss/ᛵᲇᲀᛳ;->ᛱᛳᲁᲈ:Ljava/lang/String;

    .line 296
    .line 297
    :cond_6
    if-eqz v2, :cond_7

    .line 298
    .line 299
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 304
    .line 305
    .line 306
    :cond_7
    if-eqz v3, :cond_8

    .line 307
    .line 308
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 313
    .line 314
    .line 315
    :cond_8
    if-eqz v7, :cond_9

    .line 316
    .line 317
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 322
    .line 323
    .line 324
    :cond_9
    if-eqz v5, :cond_a

    .line 325
    .line 326
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 331
    .line 332
    .line 333
    :cond_a
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ()Landroid/widget/FrameLayout;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    if-nez v2, :cond_b

    .line 338
    .line 339
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 348
    .line 349
    :goto_0
    int-to-float v2, v2

    .line 350
    goto :goto_1

    .line 351
    :cond_b
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᛷᛱ()Landroid/widget/FrameLayout;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    goto :goto_0

    .line 360
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setY(F)V

    .line 361
    .line 362
    .line 363
    iget-object v2, p1, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 364
    .line 365
    invoke-virtual {v0, v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 366
    .line 367
    .line 368
    new-instance v2, Lxhss/ᲀᲈᛵᛸ;

    .line 369
    .line 370
    const/4 v8, 0x0

    .line 371
    invoke-direct {v2, v8, p0}, Lxhss/ᲀᲈᛵᛸ;-><init>(ILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iput-object v2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

    .line 375
    .line 376
    if-eqz v3, :cond_c

    .line 377
    .line 378
    new-instance v2, Lxhss/ᲀᲀᲈᛵ;

    .line 379
    .line 380
    invoke-direct {v2, p0, v8}, Lxhss/ᲀᲀᲈᛵ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 384
    .line 385
    .line 386
    :cond_c
    if-eqz v5, :cond_d

    .line 387
    .line 388
    new-instance v2, Lxhss/ᲀᲀᲈᛵ;

    .line 389
    .line 390
    invoke-direct {v2, p0, v6}, Lxhss/ᲀᲀᲈᛵ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    .line 395
    .line 396
    :cond_d
    const/4 v2, 0x2

    .line 397
    if-eqz v7, :cond_e

    .line 398
    .line 399
    new-instance v3, Lxhss/ᲀᲀᲈᛵ;

    .line 400
    .line 401
    invoke-direct {v3, p0, v2}, Lxhss/ᲀᲀᲈᛵ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 405
    .line 406
    .line 407
    :cond_e
    if-eqz v4, :cond_10

    .line 408
    .line 409
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 413
    .line 414
    .line 415
    move-result p2

    .line 416
    if-eqz p2, :cond_f

    .line 417
    .line 418
    const p2, 0x640700bf

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :cond_f
    const p2, 0x640700c0

    .line 423
    .line 424
    .line 425
    :goto_2
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 426
    .line 427
    .line 428
    invoke-virtual {v4, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 432
    .line 433
    .line 434
    move-result-object p2

    .line 435
    iput v6, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 436
    .line 437
    invoke-virtual {v4, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 438
    .line 439
    .line 440
    :cond_10
    new-instance p2, Lxhss/ᲇᛵᛲᲁ;

    .line 441
    .line 442
    const/4 v3, 0x3

    .line 443
    invoke-direct {p2, v3, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iput-object p2, v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᲇᲁ;

    .line 447
    .line 448
    new-instance p2, Lxhss/ᛳᲁᲁᛸ;

    .line 449
    .line 450
    invoke-direct {p2, p0, v6}, Lxhss/ᛳᲁᲁᛸ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 454
    .line 455
    .line 456
    new-instance p2, Lxhss/ᛳᲁᲁᛸ;

    .line 457
    .line 458
    invoke-direct {p2, p0, v2}, Lxhss/ᛳᲁᲁᛸ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 459
    .line 460
    .line 461
    iget-wide v0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ:J

    .line 462
    .line 463
    const-wide/16 v2, 0x0

    .line 464
    .line 465
    cmp-long v2, v0, v2

    .line 466
    .line 467
    if-ltz v2, :cond_11

    .line 468
    .line 469
    goto :goto_3

    .line 470
    :cond_11
    const-wide/16 v0, 0x12c

    .line 471
    .line 472
    :goto_3
    invoke-static {p2, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V

    .line 473
    .line 474
    .line 475
    iput-object p0, p1, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 476
    .line 477
    invoke-virtual {p0}, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ()V

    .line 478
    .line 479
    .line 480
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lxhss/ᲁᛲᛸᛴ;

    .line 10
    .line 11
    invoke-direct {v0}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lxhss/ᛲᛵᛶᲁ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-wide v0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v3, v0, v3

    .line 23
    .line 24
    if-ltz v3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-wide/16 v0, 0x12c

    .line 28
    .line 29
    :goto_0
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 40
    .line 41
    int-to-float v2, v2

    .line 42
    const/4 v4, 0x2

    .line 43
    new-array v4, v4, [F

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    aput v3, v4, v5

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    aput v2, v4, v3

    .line 50
    .line 51
    const-string v2, "y"

    .line 52
    .line 53
    invoke-static {p0, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final ᛳᲁᲇᛸ()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 4
    .line 5
    iget-object v2, v1, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 6
    .line 7
    iget-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 8
    .line 9
    if-eqz v3, :cond_18

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_8

    .line 18
    .line 19
    :cond_0
    sget-object v4, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 20
    .line 21
    iget-object v4, v0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-virtual {v4, v5}, Landroid/view/View;->setMinimumWidth(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v5}, Landroid/view/View;->setMinimumHeight(I)V

    .line 31
    .line 32
    .line 33
    iget-boolean v6, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 34
    .line 35
    iput-boolean v6, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 36
    .line 37
    iget-object v6, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛸᛳᲁ:[I

    .line 38
    .line 39
    aget v7, v6, v5

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    aget v9, v6, v8

    .line 43
    .line 44
    const/4 v10, 0x2

    .line 45
    aget v11, v6, v10

    .line 46
    .line 47
    const/4 v12, 0x3

    .line 48
    aget v6, v6, v12

    .line 49
    .line 50
    iget-object v13, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 51
    .line 52
    aput v7, v13, v5

    .line 53
    .line 54
    aput v9, v13, v8

    .line 55
    .line 56
    aput v11, v13, v10

    .line 57
    .line 58
    aput v6, v13, v12

    .line 59
    .line 60
    iget-object v6, v1, Lxhss/ᛵᲇᲀᛳ;->ᲀᛷᲁᲀ:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v7, v0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛶᛴᲀ:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-static {v7, v6}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v6, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛴᛶᛳ:Landroid/widget/TextView;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static {v6, v9}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v7, v9}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v6, v9}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 77
    .line 78
    .line 79
    iget-object v11, v1, Lxhss/ᛵᲇᲀᛳ;->ᛱᲈᛳᛴ:Lxhss/ᛶᛸᛸᛵ;

    .line 80
    .line 81
    iget-object v13, v0, Lxhss/ᛲᛵᛶᲁ;->ᛶᲇᲈᛸ:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-static {v13, v11}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 84
    .line 85
    .line 86
    iget-object v11, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛷᲇᲇ:Lxhss/ᛶᛸᛸᛵ;

    .line 87
    .line 88
    iget-object v14, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛶᛴᲈ:Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-static {v14, v11}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 91
    .line 92
    .line 93
    iget-object v11, v1, Lxhss/ᛵᲇᲀᛳ;->ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

    .line 94
    .line 95
    iget-object v15, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛲᛷᛱ:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-static {v15, v11}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛷᲇᲇ(Landroid/widget/TextView;Lxhss/ᛶᛸᛸᛵ;)V

    .line 98
    .line 99
    .line 100
    iget-boolean v11, v1, Lxhss/ᛵᲇᲀᛳ;->ᛳᛸᛵᲀ:Z

    .line 101
    .line 102
    if-eqz v11, :cond_2

    .line 103
    .line 104
    iget-boolean v11, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 105
    .line 106
    if-eqz v11, :cond_1

    .line 107
    .line 108
    new-instance v11, Lxhss/ᲀᲀᲈᛵ;

    .line 109
    .line 110
    invoke-direct {v11, v0, v12}, Lxhss/ᲀᲀᲈᛵ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {v3, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 122
    .line 123
    .line 124
    :goto_0
    new-instance v3, Lxhss/ᲀᲀᲈᛵ;

    .line 125
    .line 126
    const/4 v11, 0x4

    .line 127
    invoke-direct {v3, v0, v11}, Lxhss/ᲀᲀᲈᛵ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 128
    .line 129
    .line 130
    move/from16 v16, v10

    .line 131
    .line 132
    iget-object v10, v0, Lxhss/ᛲᛵᛶᲁ;->ᛳᲁᲇᛸ:Landroid/widget/RelativeLayout;

    .line 133
    .line 134
    invoke-virtual {v10, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    iget v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᛴᛸ:F

    .line 138
    .line 139
    const/high16 v10, -0x40800000    # -1.0f

    .line 140
    .line 141
    cmpl-float v3, v3, v10

    .line 142
    .line 143
    const/16 v10, 0x8

    .line 144
    .line 145
    if-lez v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    instance-of v3, v3, Landroid/graphics/drawable/GradientDrawable;

    .line 152
    .line 153
    if-eqz v3, :cond_3

    .line 154
    .line 155
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Landroid/graphics/drawable/GradientDrawable;

    .line 160
    .line 161
    if-eqz v3, :cond_3

    .line 162
    .line 163
    move/from16 v17, v11

    .line 164
    .line 165
    iget v11, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᛴᛸ:F

    .line 166
    .line 167
    move/from16 v18, v12

    .line 168
    .line 169
    new-array v12, v10, [F

    .line 170
    .line 171
    aput v11, v12, v5

    .line 172
    .line 173
    aput v11, v12, v8

    .line 174
    .line 175
    aput v11, v12, v16

    .line 176
    .line 177
    aput v11, v12, v18

    .line 178
    .line 179
    const/4 v11, 0x0

    .line 180
    aput v11, v12, v17

    .line 181
    .line 182
    const/16 v16, 0x5

    .line 183
    .line 184
    aput v11, v12, v16

    .line 185
    .line 186
    const/16 v16, 0x6

    .line 187
    .line 188
    aput v11, v12, v16

    .line 189
    .line 190
    const/16 v16, 0x7

    .line 191
    .line 192
    aput v11, v12, v16

    .line 193
    .line 194
    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 195
    .line 196
    .line 197
    :cond_3
    new-instance v3, Lxhss/ᛴᲈᛵᛶ;

    .line 198
    .line 199
    invoke-direct {v3, v5, v0}, Lxhss/ᛴᲈᛵᛶ;-><init>(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v8}, Landroid/view/View;->setClipToOutline(Z)V

    .line 206
    .line 207
    .line 208
    iget-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᛴᲈᛱᛴ:Ljava/util/ArrayList;

    .line 209
    .line 210
    if-eqz v3, :cond_5

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_4

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Landroid/view/View;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    new-instance v0, Ljava/lang/ClassCastException;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_5
    :goto_1
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

    .line 239
    .line 240
    if-eqz v3, :cond_9

    .line 241
    .line 242
    invoke-virtual {v3}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    if-eqz v3, :cond_9

    .line 247
    .line 248
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

    .line 249
    .line 250
    iget-object v4, v0, Lxhss/ᛲᛵᛶᲁ;->ᲈᛳᲀ:Landroid/widget/RelativeLayout;

    .line 251
    .line 252
    invoke-virtual {v3, v4, v2}, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 253
    .line 254
    .line 255
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

    .line 256
    .line 257
    invoke-virtual {v3}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    instance-of v3, v3, Lxhss/ᛵᛳᛶᛷ;

    .line 262
    .line 263
    if-eqz v3, :cond_7

    .line 264
    .line 265
    iget-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 266
    .line 267
    instance-of v4, v3, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 268
    .line 269
    if-eqz v4, :cond_6

    .line 270
    .line 271
    check-cast v3, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 272
    .line 273
    invoke-virtual {v3, v5}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 274
    .line 275
    .line 276
    :cond_6
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

    .line 277
    .line 278
    invoke-virtual {v3}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, Lxhss/ᛵᛳᛶᛷ;

    .line 283
    .line 284
    iput-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_7
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

    .line 288
    .line 289
    invoke-virtual {v3}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const-string v4, "ScrollController"

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    instance-of v4, v3, Lxhss/ᛵᛳᛶᛷ;

    .line 300
    .line 301
    if-eqz v4, :cond_9

    .line 302
    .line 303
    iget-object v4, v0, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 304
    .line 305
    instance-of v8, v4, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 306
    .line 307
    if-eqz v8, :cond_8

    .line 308
    .line 309
    check-cast v4, Lcom/kongzue/dialogx/util/views/DialogScrollView;

    .line 310
    .line 311
    invoke-virtual {v4, v5}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 312
    .line 313
    .line 314
    :cond_8
    check-cast v3, Lxhss/ᛵᛳᛶᛷ;

    .line 315
    .line 316
    iput-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛳᛶᛷ;

    .line 317
    .line 318
    :cond_9
    :goto_2
    invoke-virtual {v1}, Lxhss/ᛵᲇᲀᛳ;->ᛱᲁᛳᛲ()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    iget-object v4, v0, Lxhss/ᛲᛵᛶᲁ;->ᛷᛴᛷᛱ:Landroid/widget/ImageView;

    .line 323
    .line 324
    if-eqz v3, :cond_a

    .line 325
    .line 326
    iget-boolean v3, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 327
    .line 328
    if-eqz v3, :cond_a

    .line 329
    .line 330
    if-eqz v4, :cond_b

    .line 331
    .line 332
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 333
    .line 334
    .line 335
    goto :goto_3

    .line 336
    :cond_a
    if-eqz v4, :cond_b

    .line 337
    .line 338
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 339
    .line 340
    .line 341
    :cond_b
    :goto_3
    iget-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛶᲀᛲ;

    .line 342
    .line 343
    if-eqz v3, :cond_c

    .line 344
    .line 345
    invoke-virtual {v3, v2, v0}, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛵᲇᲀᛳ;Lxhss/ᛲᛵᛶᲁ;)V

    .line 346
    .line 347
    .line 348
    :cond_c
    iget-object v2, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛲᲀᛵ:Landroid/view/View;

    .line 349
    .line 350
    if-eqz v2, :cond_f

    .line 351
    .line 352
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_e

    .line 357
    .line 358
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-nez v3, :cond_d

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_d
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_e
    :goto_4
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 370
    .line 371
    .line 372
    :cond_f
    :goto_5
    iget-object v2, v0, Lxhss/ᛲᛵᛶᲁ;->ᛷᲁᲁ:Landroid/view/ViewGroup;

    .line 373
    .line 374
    if-eqz v2, :cond_11

    .line 375
    .line 376
    iget-object v3, v1, Lxhss/ᛵᲇᲀᛳ;->ᛱᛳᲁᲈ:Ljava/lang/String;

    .line 377
    .line 378
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛲᛴᲀᲈ(Ljava/lang/CharSequence;)Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    if-eqz v3, :cond_10

    .line 383
    .line 384
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_10
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 389
    .line 390
    .line 391
    :cond_11
    :goto_6
    iget-object v2, v1, Lxhss/ᛵᲇᲀᛳ;->ᛲᛴᲀᲈ:Ljava/lang/String;

    .line 392
    .line 393
    invoke-static {v15, v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 394
    .line 395
    .line 396
    iget-object v1, v1, Lxhss/ᛵᲇᲀᛳ;->ᛱᛳᲁᲈ:Ljava/lang/String;

    .line 397
    .line 398
    invoke-static {v13, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v14, v9}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛸᛲ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 402
    .line 403
    .line 404
    iget-object v1, v0, Lxhss/ᛲᛵᛶᲁ;->ᛳᲈᲈᛲ:Landroid/widget/LinearLayout;

    .line 405
    .line 406
    if-eqz v1, :cond_16

    .line 407
    .line 408
    if-eqz v13, :cond_12

    .line 409
    .line 410
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_15

    .line 415
    .line 416
    :cond_12
    if-eqz v14, :cond_13

    .line 417
    .line 418
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_15

    .line 423
    .line 424
    :cond_13
    if-eqz v15, :cond_14

    .line 425
    .line 426
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-nez v2, :cond_14

    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_14
    move v5, v10

    .line 434
    :cond_15
    :goto_7
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 435
    .line 436
    .line 437
    :cond_16
    iget-object v1, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛶᲈᛶ:Landroid/widget/ImageView;

    .line 438
    .line 439
    if-eqz v1, :cond_17

    .line 440
    .line 441
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 446
    .line 447
    .line 448
    :cond_17
    iget-object v0, v0, Lxhss/ᛲᛵᛶᲁ;->ᲇᛸᛳᲁ:Landroid/widget/ImageView;

    .line 449
    .line 450
    if-eqz v0, :cond_18

    .line 451
    .line 452
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 457
    .line 458
    .line 459
    :cond_18
    :goto_8
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Landroid/view/View;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    :cond_0
    iget-object p1, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-boolean v1, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 17
    .line 18
    if-nez v1, :cond_5

    .line 19
    .line 20
    iget-object v1, p1, Lxhss/ᛵᲇᲀᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    new-instance v1, Lxhss/ᛶᲈᛴᛲ;

    .line 25
    .line 26
    invoke-direct {v1, v0, p0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p1, Lxhss/ᛵᲇᲀᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

    .line 30
    .line 31
    :cond_2
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ:Z

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    new-instance v1, Lxhss/ᛶᲈᛴᛲ;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p1, Lxhss/ᛵᲇᲀᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

    .line 42
    .line 43
    :cond_3
    invoke-virtual {v1, p1}, Lxhss/ᛶᲈᛴᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lxhss/ᛳᲁᲁᛸ;

    .line 47
    .line 48
    invoke-direct {v1, p0, v0}, Lxhss/ᛳᲁᲁᛸ;-><init>(Lxhss/ᛲᛵᛶᲁ;I)V

    .line 49
    .line 50
    .line 51
    iget-wide p0, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ:J

    .line 52
    .line 53
    const-wide/16 v2, -0x1

    .line 54
    .line 55
    cmp-long v0, p0, v2

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    const-wide/16 p0, 0x12c

    .line 61
    .line 62
    :goto_0
    invoke-static {v1, p0, p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_1
    return-void
.end method
