.class public final Lxhss/ᛷᛷᲈᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛳᛴᛵ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛳᛴᛵ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛷᛷᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛷᛷᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᛵ;

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
    .locals 9

    .line 1
    iget v0, p0, Lxhss/ᛷᛷᲈᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lxhss/ᛷᛷᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᛵ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v1}, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void

    .line 37
    :pswitch_1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    new-instance v2, Lxhss/ᲀᲀ;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lxhss/ᲀᲀ;-><init>(Lxhss/ᛳᛴᛵ;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_d

    .line 71
    .line 72
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v2, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 77
    .line 78
    iget v3, v0, Lxhss/ᲀᲀ;->ᛸᛴᛶᛳ:I

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget-object v4, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 85
    .line 86
    if-nez v3, :cond_2

    .line 87
    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :cond_2
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 91
    .line 92
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v5, v2, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 96
    .line 97
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 98
    .line 99
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object v5, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Ljava/lang/ref/WeakReference;

    .line 103
    .line 104
    const v5, 0x64080051

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 112
    .line 113
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 114
    .line 115
    const v5, 0x64080045

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 123
    .line 124
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 125
    .line 126
    const v5, 0x64080050

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 134
    .line 135
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᲇᛴᲇᛵ:Landroid/widget/RelativeLayout;

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 145
    .line 146
    .line 147
    new-instance v5, Lxhss/ᛵᛲᲇᛴ;

    .line 148
    .line 149
    invoke-direct {v5, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    iput v4, v5, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 154
    .line 155
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 164
    .line 165
    const/high16 v7, 0x40000000    # 2.0f

    .line 166
    .line 167
    mul-float/2addr v7, v6

    .line 168
    const/high16 v6, 0x3f000000    # 0.5f

    .line 169
    .line 170
    add-float/2addr v7, v6

    .line 171
    float-to-int v6, v7

    .line 172
    iput v6, v5, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ:I

    .line 173
    .line 174
    const/4 v6, -0x1

    .line 175
    iput v6, v5, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ:I

    .line 176
    .line 177
    const/high16 v7, 0x43340000    # 180.0f

    .line 178
    .line 179
    iput v7, v5, Lxhss/ᛵᛲᲇᛴ;->ᛸᛴᛶᛳ:F

    .line 180
    .line 181
    const/high16 v7, 0x42a00000    # 80.0f

    .line 182
    .line 183
    iput v7, v5, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᲀᛵ:F

    .line 184
    .line 185
    new-instance v7, Landroid/graphics/Paint;

    .line 186
    .line 187
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v7, v5, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 191
    .line 192
    iput-boolean v4, v5, Lxhss/ᛵᛲᲇᛴ;->ᛷᲁᲁ:Z

    .line 193
    .line 194
    const/high16 v7, 0x42c80000    # 100.0f

    .line 195
    .line 196
    iput v7, v5, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 197
    .line 198
    iput v4, v5, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 199
    .line 200
    iput v4, v5, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 201
    .line 202
    iput v4, v5, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 203
    .line 204
    invoke-virtual {v5}, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ()V

    .line 205
    .line 206
    .line 207
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 208
    .line 209
    iget-object v7, v0, Lxhss/ᲀᲀ;->ᲇᛴᲇᛵ:Landroid/widget/RelativeLayout;

    .line 210
    .line 211
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 212
    .line 213
    invoke-direct {v8, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    .line 218
    .line 219
    const v5, 0x6408004d

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 227
    .line 228
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᲇᛶᛴᲀ:Landroid/widget/RelativeLayout;

    .line 229
    .line 230
    const v5, 0x64080128

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, Landroid/widget/TextView;

    .line 238
    .line 239
    iput-object v5, v0, Lxhss/ᲀᲀ;->ᲀᲇᛳᲁ:Landroid/widget/TextView;

    .line 240
    .line 241
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-object v3, v0, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    if-eqz v3, :cond_3

    .line 252
    .line 253
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const/4 v5, 0x0

    .line 258
    invoke-virtual {v3, v5}, Landroid/view/View;->setTranslationZ(F)V

    .line 259
    .line 260
    .line 261
    :cond_3
    sget-object v3, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 262
    .line 263
    iget-object v3, v2, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 264
    .line 265
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Landroid/view/View;

    .line 270
    .line 271
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iput-object v3, v0, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    const v5, 0x6405003e

    .line 282
    .line 283
    .line 284
    const v6, 0x6405003d

    .line 285
    .line 286
    .line 287
    if-eqz v3, :cond_4

    .line 288
    .line 289
    move v3, v6

    .line 290
    goto :goto_0

    .line 291
    :cond_4
    move v3, v5

    .line 292
    :goto_0
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ(I)I

    .line 293
    .line 294
    .line 295
    const/high16 v3, 0x41700000    # 15.0f

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    int-to-float v3, v3

    .line 302
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ()Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    if-eqz v7, :cond_5

    .line 310
    .line 311
    move v5, v6

    .line 312
    :cond_5
    invoke-virtual {v2, v5}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ(I)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    iget-object v6, v0, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ:Ljava/util/ArrayList;

    .line 317
    .line 318
    if-eqz v6, :cond_7

    .line 319
    .line 320
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-nez v5, :cond_6

    .line 329
    .line 330
    goto :goto_1

    .line 331
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    check-cast p0, Landroid/view/View;

    .line 336
    .line 337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance p0, Ljava/lang/ClassCastException;

    .line 341
    .line 342
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 343
    .line 344
    .line 345
    throw p0

    .line 346
    :cond_7
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᛴᲈ()Landroid/content/res/Resources;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    const v7, 0x640700c5

    .line 351
    .line 352
    .line 353
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    check-cast v6, Landroid/graphics/drawable/GradientDrawable;

    .line 358
    .line 359
    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v6, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 363
    .line 364
    .line 365
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 366
    .line 367
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 368
    .line 369
    .line 370
    :goto_1
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 371
    .line 372
    const/4 v5, 0x1

    .line 373
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 374
    .line 375
    .line 376
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 377
    .line 378
    invoke-virtual {v3, v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V

    .line 379
    .line 380
    .line 381
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 382
    .line 383
    new-instance v6, Lxhss/ᲀᲈᛵᛸ;

    .line 384
    .line 385
    const/4 v7, 0x2

    .line 386
    invoke-direct {v6, v7, v0}, Lxhss/ᲀᲈᛵᛸ;-><init>(ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    iput-object v6, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

    .line 390
    .line 391
    iget v3, v2, Lxhss/ᛳᛴᛵ;->ᛵᛷᛲᛸ:I

    .line 392
    .line 393
    if-eqz v3, :cond_8

    .line 394
    .line 395
    if-eq v3, v5, :cond_8

    .line 396
    .line 397
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 398
    .line 399
    iput-boolean v5, v3, Lxhss/ᛵᛲᲇᛴ;->ᲁᲁᛴᲁ:Z

    .line 400
    .line 401
    new-instance v5, Lxhss/ᲈᛱᛳᛲ;

    .line 402
    .line 403
    invoke-direct {v5, v0, v4}, Lxhss/ᲈᛱᛳᛲ;-><init>(Lxhss/ᲀᲀ;I)V

    .line 404
    .line 405
    .line 406
    const-wide/16 v6, 0x64

    .line 407
    .line 408
    invoke-virtual {v3, v5, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 409
    .line 410
    .line 411
    :cond_8
    iget-object v3, v0, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 412
    .line 413
    new-instance v4, Lxhss/ᛶᛵᲇᛸ;

    .line 414
    .line 415
    invoke-direct {v4, v0}, Lxhss/ᛶᛵᲇᛸ;-><init>(Lxhss/ᲀᲀ;)V

    .line 416
    .line 417
    .line 418
    iput-object v4, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᲇᲁ;

    .line 419
    .line 420
    iget-object v3, v2, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

    .line 421
    .line 422
    if-eqz v3, :cond_9

    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    if-eq v3, v0, :cond_9

    .line 429
    .line 430
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 431
    .line 432
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iput-object v3, v2, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

    .line 436
    .line 437
    :cond_9
    invoke-virtual {v0}, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ()V

    .line 438
    .line 439
    .line 440
    :goto_2
    iget-object v0, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 441
    .line 442
    if-nez v0, :cond_a

    .line 443
    .line 444
    move-object v0, v1

    .line 445
    goto :goto_3

    .line 446
    :cond_a
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, Landroid/view/View;

    .line 451
    .line 452
    :goto_3
    if-eqz v0, :cond_d

    .line 453
    .line 454
    iget-object v0, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 455
    .line 456
    if-nez v0, :cond_b

    .line 457
    .line 458
    move-object v0, v1

    .line 459
    goto :goto_4

    .line 460
    :cond_b
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    check-cast v0, Landroid/view/View;

    .line 465
    .line 466
    :goto_4
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    iget-object p0, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 470
    .line 471
    if-nez p0, :cond_c

    .line 472
    .line 473
    goto :goto_5

    .line 474
    :cond_c
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    move-object v1, p0

    .line 479
    check-cast v1, Landroid/view/View;

    .line 480
    .line 481
    :goto_5
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 482
    .line 483
    .line 484
    :cond_d
    return-void

    .line 485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
