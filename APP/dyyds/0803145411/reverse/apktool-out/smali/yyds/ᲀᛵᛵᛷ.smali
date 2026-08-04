.class public final Lyyds/ᲀᛵᛵᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛷᲀᛳᛱ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛷᲀᛳᛱ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲀᛵᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲀᛵᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᛳᛱ;

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
    iget v0, p0, Lyyds/ᲀᛵᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲀᛵᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᛳᛱ;

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v1}, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲀᛵᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᛳᛱ;

    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_1
    iget-object p0, p0, Lyyds/ᲀᛵᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᛳᛱ;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    new-instance v2, Lyyds/ᲇᛵᲈᲈ;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Lyyds/ᲇᛵᲈᲈ;-><init>(Lyyds/ᛷᲀᛳᛱ;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 69
    .line 70
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_d

    .line 75
    .line 76
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v2, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 81
    .line 82
    iget v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛱᲈᲁ:I

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v4, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 89
    .line 90
    if-nez v3, :cond_2

    .line 91
    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_2
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-object v5, v2, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 100
    .line 101
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 102
    .line 103
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iput-object v5, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 107
    .line 108
    const v5, 0x660900af

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 116
    .line 117
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 118
    .line 119
    const v5, 0x66090088

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 127
    .line 128
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 129
    .line 130
    const v5, 0x660900ae

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 138
    .line 139
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᲇᲈᛵᛷ:Landroid/widget/RelativeLayout;

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v2}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 149
    .line 150
    .line 151
    new-instance v5, Lyyds/ᲁᲀᛵᛴ;

    .line 152
    .line 153
    invoke-direct {v5, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x0

    .line 157
    iput v4, v5, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 158
    .line 159
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 168
    .line 169
    const/high16 v7, 0x40000000    # 2.0f

    .line 170
    .line 171
    mul-float/2addr v7, v6

    .line 172
    const/high16 v6, 0x3f000000    # 0.5f

    .line 173
    .line 174
    add-float/2addr v7, v6

    .line 175
    float-to-int v6, v7

    .line 176
    iput v6, v5, Lyyds/ᲁᲀᛵᛴ;->ᲇᲈᛵᛷ:I

    .line 177
    .line 178
    const/4 v6, -0x1

    .line 179
    iput v6, v5, Lyyds/ᲁᲀᛵᛴ;->ᛲᛴᛳᛲ:I

    .line 180
    .line 181
    const/high16 v7, 0x43340000    # 180.0f

    .line 182
    .line 183
    iput v7, v5, Lyyds/ᲁᲀᛵᛴ;->ᛷᲈᲈᲁ:F

    .line 184
    .line 185
    const/high16 v7, 0x42a00000    # 80.0f

    .line 186
    .line 187
    iput v7, v5, Lyyds/ᲁᲀᛵᛴ;->ᛷᛲᲈᛱ:F

    .line 188
    .line 189
    new-instance v7, Landroid/graphics/Paint;

    .line 190
    .line 191
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object v7, v5, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 195
    .line 196
    iput-boolean v4, v5, Lyyds/ᲁᲀᛵᛴ;->ᛱᛳᲇ:Z

    .line 197
    .line 198
    const/high16 v7, 0x42c80000    # 100.0f

    .line 199
    .line 200
    iput v7, v5, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 201
    .line 202
    iput v4, v5, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

    .line 203
    .line 204
    iput v4, v5, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 205
    .line 206
    iput v4, v5, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 207
    .line 208
    invoke-virtual {v5}, Lyyds/ᲁᲀᛵᛴ;->ᛵᛸᛸᛷ()V

    .line 209
    .line 210
    .line 211
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲀᛵᛴ;

    .line 212
    .line 213
    iget-object v7, v0, Lyyds/ᲇᛵᲈᲈ;->ᲇᲈᛵᛷ:Landroid/widget/RelativeLayout;

    .line 214
    .line 215
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 216
    .line 217
    invoke-direct {v8, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    .line 222
    .line 223
    const v5, 0x660900ab

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, Landroid/widget/RelativeLayout;

    .line 231
    .line 232
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᲇᲇᲇᛱ:Landroid/widget/RelativeLayout;

    .line 233
    .line 234
    const v5, 0x66090566

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Landroid/widget/TextView;

    .line 242
    .line 243
    iput-object v5, v0, Lyyds/ᲇᛵᲈᲈ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    iput-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    if-eqz v3, :cond_3

    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    const/4 v5, 0x0

    .line 262
    invoke-virtual {v3, v5}, Landroid/view/View;->setTranslationZ(F)V

    .line 263
    .line 264
    .line 265
    :cond_3
    sget-object v3, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 266
    .line 267
    iget-object v3, v2, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Landroid/view/View;

    .line 274
    .line 275
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    iput-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-virtual {v2}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    const v5, 0x6606006f

    .line 286
    .line 287
    .line 288
    const v6, 0x6606006e

    .line 289
    .line 290
    .line 291
    if-eqz v3, :cond_4

    .line 292
    .line 293
    move v3, v6

    .line 294
    goto :goto_0

    .line 295
    :cond_4
    move v3, v5

    .line 296
    :goto_0
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ(I)I

    .line 297
    .line 298
    .line 299
    const/high16 v3, 0x41700000    # 15.0f

    .line 300
    .line 301
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    int-to-float v3, v3

    .line 306
    invoke-virtual {v2}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ()Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-eqz v7, :cond_5

    .line 314
    .line 315
    move v5, v6

    .line 316
    :cond_5
    invoke-virtual {v2, v5}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ(I)I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    iget-object v6, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 321
    .line 322
    if-eqz v6, :cond_7

    .line 323
    .line 324
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_6

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, Landroid/view/View;

    .line 340
    .line 341
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_6

    .line 348
    .line 349
    :cond_7
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    const v7, 0x6608018e

    .line 354
    .line 355
    .line 356
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    check-cast v6, Landroid/graphics/drawable/GradientDrawable;

    .line 361
    .line 362
    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v6, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 366
    .line 367
    .line 368
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 369
    .line 370
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 371
    .line 372
    .line 373
    :goto_1
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 374
    .line 375
    const/4 v5, 0x1

    .line 376
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 377
    .line 378
    .line 379
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 380
    .line 381
    invoke-virtual {v3, v2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V

    .line 382
    .line 383
    .line 384
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 385
    .line 386
    new-instance v6, Lyyds/ᛳᛵᲀᛲ;

    .line 387
    .line 388
    const/4 v7, 0x2

    .line 389
    invoke-direct {v6, v7, v0}, Lyyds/ᛳᛵᲀᛲ;-><init>(ILjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    iput-object v6, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛳᛶᲁ:Lyyds/ᛳᛵᲀ;

    .line 393
    .line 394
    iget v3, v2, Lyyds/ᛷᲀᛳᛱ;->ᛲᛱᲁᛳ:I

    .line 395
    .line 396
    if-eqz v3, :cond_8

    .line 397
    .line 398
    if-eq v3, v5, :cond_8

    .line 399
    .line 400
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲀᛵᛴ;

    .line 401
    .line 402
    iput-boolean v5, v3, Lyyds/ᲁᲀᛵᛴ;->ᛸᛸᛷᛱ:Z

    .line 403
    .line 404
    new-instance v5, Lyyds/ᲁᛲᛴᲈ;

    .line 405
    .line 406
    invoke-direct {v5, v0, v4}, Lyyds/ᲁᛲᛴᲈ;-><init>(Lyyds/ᲇᛵᲈᲈ;I)V

    .line 407
    .line 408
    .line 409
    const-wide/16 v6, 0x64

    .line 410
    .line 411
    invoke-virtual {v3, v5, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 412
    .line 413
    .line 414
    :cond_8
    iget-object v3, v0, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 415
    .line 416
    new-instance v4, Lyyds/ᲀᛵᲁᛴ;

    .line 417
    .line 418
    const/16 v5, 0x16

    .line 419
    .line 420
    invoke-direct {v4, v5, v0}, Lyyds/ᲀᛵᲁᛴ;-><init>(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    iput-object v4, v3, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲈᲈᲁ:Lyyds/ᲈᛲᛵ;

    .line 424
    .line 425
    iget-object v3, v2, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 426
    .line 427
    if-eqz v3, :cond_9

    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    if-eq v3, v0, :cond_9

    .line 434
    .line 435
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 436
    .line 437
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    iput-object v3, v2, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 441
    .line 442
    :cond_9
    invoke-virtual {v0}, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ()V

    .line 443
    .line 444
    .line 445
    :goto_2
    iget-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 446
    .line 447
    if-nez v0, :cond_a

    .line 448
    .line 449
    move-object v0, v1

    .line 450
    goto :goto_3

    .line 451
    :cond_a
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, Landroid/view/View;

    .line 456
    .line 457
    :goto_3
    if-eqz v0, :cond_d

    .line 458
    .line 459
    iget-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 460
    .line 461
    if-nez v0, :cond_b

    .line 462
    .line 463
    move-object v0, v1

    .line 464
    goto :goto_4

    .line 465
    :cond_b
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    check-cast v0, Landroid/view/View;

    .line 470
    .line 471
    :goto_4
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    iget-object p0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 475
    .line 476
    if-nez p0, :cond_c

    .line 477
    .line 478
    goto :goto_5

    .line 479
    :cond_c
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    move-object v1, p0

    .line 484
    check-cast v1, Landroid/view/View;

    .line 485
    .line 486
    :goto_5
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 487
    .line 488
    .line 489
    :cond_d
    :goto_6
    return-void

    .line 490
    nop

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
