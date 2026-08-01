.class public final Lxhss/ᛲᛳᛴᛳ;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/util/List;

.field public ᛳᲁᲇᛸ:Landroid/app/Activity;

.field public ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

.field public ᲇᛴᲇᛵ:Lxhss/ᛶᛸᛸᛵ;


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛳᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛳᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/CharSequence;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 1
    iget-object p3, p0, Lxhss/ᛲᛳᛴᛳ;->ᛳᲁᲇᛸ:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛲᛳᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛸᛷᛱ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lxhss/ᛲᛱᛶᛶ;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p3}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v3, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lxhss/ᛲᛳᛴᛳ;->getCount()I

    .line 31
    .line 32
    .line 33
    const v3, 0x640b002c

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const v3, 0x64080085

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroid/widget/ImageView;

    .line 48
    .line 49
    iput-object v3, p2, Lxhss/ᛲᛱᛶᛶ;->ᛷᛵᛵᲈ:Landroid/widget/ImageView;

    .line 50
    .line 51
    const v3, 0x64080086

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Landroid/widget/ImageView;

    .line 59
    .line 60
    iput-object v3, p2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 61
    .line 62
    const v3, 0x64080124

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroid/widget/TextView;

    .line 70
    .line 71
    iput-object v3, p2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 72
    .line 73
    const v3, 0x640800f1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Landroid/widget/Space;

    .line 81
    .line 82
    iput-object v3, p2, Lxhss/ᛲᛱᛶᛶ;->ᲇᛴᲇᛵ:Landroid/widget/Space;

    .line 83
    .line 84
    invoke-virtual {v2, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v11, v2

    .line 88
    move-object v2, p2

    .line 89
    move-object p2, v11

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lxhss/ᛲᛱᛶᛶ;

    .line 96
    .line 97
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v3, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 101
    .line 102
    iget-object v4, v0, Lxhss/ᲀᛸᛷᛱ;->ᛱᲁᛳᛲ:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Ljava/lang/Boolean;

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    if-nez v4, :cond_1

    .line 116
    .line 117
    move v4, v5

    .line 118
    goto :goto_1

    .line 119
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    :goto_1
    if-nez v4, :cond_2

    .line 124
    .line 125
    const v4, 0x3ecccccd    # 0.4f

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    const/high16 v4, 0x3f800000    # 1.0f

    .line 133
    .line 134
    invoke-virtual {p2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 135
    .line 136
    .line 137
    :goto_2
    iget v4, v0, Lxhss/ᲀᛸᛷᛱ;->ᛵᲈᛱᛳ:I

    .line 138
    .line 139
    const/4 v6, 0x2

    .line 140
    const/16 v7, 0x8

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    if-ne v4, v6, :cond_4

    .line 144
    .line 145
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 146
    .line 147
    if-eqz v4, :cond_7

    .line 148
    .line 149
    iget v6, v0, Lxhss/ᲀᛸᛷᛱ;->ᛴᲀᛸᛵ:I

    .line 150
    .line 151
    if-ne v6, p1, :cond_3

    .line 152
    .line 153
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 160
    .line 161
    .line 162
    const v4, 0x640c0006

    .line 163
    .line 164
    .line 165
    iget-object v6, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 166
    .line 167
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 175
    .line 176
    .line 177
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 178
    .line 179
    const v6, 0x640c0005

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 186
    .line 187
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    const/4 v6, 0x3

    .line 192
    if-ne v4, v6, :cond_6

    .line 193
    .line 194
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 195
    .line 196
    if-eqz v4, :cond_7

    .line 197
    .line 198
    iget-object v4, v0, Lxhss/ᲀᛸᛷᛱ;->ᛱᛱᛴᲀ:Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_5

    .line 209
    .line 210
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 211
    .line 212
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 219
    .line 220
    .line 221
    const v4, 0x640c0003

    .line 222
    .line 223
    .line 224
    iget-object v6, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 225
    .line 226
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 234
    .line 235
    .line 236
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 237
    .line 238
    const v6, 0x640c0004

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 245
    .line 246
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_6
    iget-object v4, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 251
    .line 252
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 253
    .line 254
    .line 255
    :cond_7
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 262
    .line 263
    .line 264
    iget-object v4, p0, Lxhss/ᛲᛳᛴᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 265
    .line 266
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Ljava/lang/CharSequence;

    .line 271
    .line 272
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_8

    .line 292
    .line 293
    const v4, 0x6405002d

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_8
    const v4, 0x64050094

    .line 298
    .line 299
    .line 300
    :goto_4
    if-eqz p1, :cond_c

    .line 301
    .line 302
    iget-object v6, p0, Lxhss/ᛲᛳᛴᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛸᛸᛵ;

    .line 303
    .line 304
    if-nez v6, :cond_a

    .line 305
    .line 306
    new-instance v6, Lxhss/ᛶᛸᛸᛵ;

    .line 307
    .line 308
    invoke-direct {v6}, Lxhss/ᛶᛸᛸᛵ;-><init>()V

    .line 309
    .line 310
    .line 311
    iget-object v9, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 312
    .line 313
    invoke-virtual {v9}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 318
    .line 319
    if-ne v9, v10, :cond_9

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_9
    move v5, v8

    .line 323
    :goto_5
    iput-boolean v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᲇᛶᛴᲀ:Z

    .line 324
    .line 325
    iget-object v5, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 326
    .line 327
    invoke-virtual {v5}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    iput v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᛳᲁᲇᛸ:I

    .line 336
    .line 337
    iget-object v5, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 338
    .line 339
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-virtual {v5}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    iput-boolean v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᲇᛴᲇᛵ:Z

    .line 348
    .line 349
    iget-object v5, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-virtual {v5}, Landroid/widget/TextView;->getTextSize()F

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 364
    .line 365
    div-float/2addr v5, v8

    .line 366
    const/high16 v8, 0x3f000000    # 0.5f

    .line 367
    .line 368
    add-float/2addr v5, v8

    .line 369
    float-to-int v5, v5

    .line 370
    iput v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᛷᛵᛵᲈ:I

    .line 371
    .line 372
    iget-object v5, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 373
    .line 374
    invoke-virtual {v5}, Landroid/widget/TextView;->getGravity()I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    iput v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᛱᛱᛲᲇ:I

    .line 379
    .line 380
    iget-object v5, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 381
    .line 382
    invoke-virtual {v5}, Landroid/widget/TextView;->getMaxLines()I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    iput v5, v6, Lxhss/ᛶᛸᛸᛵ;->ᛷᛴᛷᛱ:I

    .line 387
    .line 388
    iput-object v6, p0, Lxhss/ᛲᛳᛴᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛸᛸᛵ;

    .line 389
    .line 390
    :cond_a
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 391
    .line 392
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    .line 394
    .line 395
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 396
    .line 397
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 406
    .line 407
    .line 408
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 409
    .line 410
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 411
    .line 412
    if-eqz p0, :cond_b

    .line 413
    .line 414
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 421
    .line 422
    .line 423
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᛱᛱᛲᲇ:Landroid/widget/ImageView;

    .line 424
    .line 425
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 426
    .line 427
    .line 428
    :cond_b
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᛷᛵᛵᲈ:Landroid/widget/ImageView;

    .line 429
    .line 430
    invoke-virtual {p0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 431
    .line 432
    .line 433
    iget-object p0, v2, Lxhss/ᛲᛱᛶᛶ;->ᲇᛴᲇᛵ:Landroid/widget/Space;

    .line 434
    .line 435
    if-eqz p0, :cond_c

    .line 436
    .line 437
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 438
    .line 439
    .line 440
    :cond_c
    return-object p2
.end method
