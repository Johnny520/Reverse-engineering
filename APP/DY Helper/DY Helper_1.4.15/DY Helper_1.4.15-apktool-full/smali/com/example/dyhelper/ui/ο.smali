.class public abstract Lcom/example/dyhelper/ui/ο;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static α(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/CheckBox;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/CheckBox;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p0, 0x41500000    # 13.0f

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/4 p0, -0x1

    .line 15
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    .line 17
    .line 18
    const/16 p0, 0x11

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-virtual {v0, p0}, Landroid/view/View;->setFocusable(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    const p1, 0x10100a0

    .line 36
    .line 37
    .line 38
    filled-new-array {p1}, [I

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x0

    .line 43
    new-array p2, p2, [I

    .line 44
    .line 45
    filled-new-array {p1, p2}, [[I

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/16 p2, 0x9a

    .line 50
    .line 51
    const/16 v1, 0xff

    .line 52
    .line 53
    const/16 v2, 0x4c

    .line 54
    .line 55
    invoke-static {v2, p2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    const/16 v1, 0xd2

    .line 60
    .line 61
    const/16 v2, 0xd6

    .line 62
    .line 63
    invoke-static {v1, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    filled-new-array {p2, v1}, [I

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-direct {p0, p1, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public static β(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static γ(Landroid/app/Activity;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v7, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, v7

    .line 30
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    check-cast v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    move-object v9, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v9, v7

    .line 39
    :goto_1
    if-eqz v9, :cond_6

    .line 40
    .line 41
    const-string v0, "dyhelper_gesture_position_preview"

    .line 42
    .line 43
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 55
    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    check-cast v3, Landroid/view/ViewGroup;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v3, v7

    .line 62
    :goto_2
    if-eqz v3, :cond_5

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    :goto_3
    new-instance v10, Landroid/widget/FrameLayout;

    .line 68
    .line 69
    invoke-direct {v10, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v10, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/16 v8, 0x14

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    invoke-static {v8, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {v10, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 83
    .line 84
    .line 85
    const/4 v12, 0x1

    .line 86
    invoke-virtual {v10, v12}, Landroid/view/View;->setClickable(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v10, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v12}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10, v12}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 96
    .line 97
    .line 98
    const-string v0, "\u624b\u52bf\u62e6\u622a\u4f4d\u7f6e\u9884\u89c8"

    .line 99
    .line 100
    invoke-virtual {v10, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x42000000    # 32.0f

    .line 104
    .line 105
    invoke-static {v1, v0}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    int-to-float v0, v0

    .line 110
    invoke-virtual {v10, v0}, Landroid/view/View;->setElevation(F)V

    .line 111
    .line 112
    .line 113
    new-instance v2, Lum1;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 119
    .line 120
    invoke-static {}, Li2;->σ()Lw90;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, v2, Lum1;->ε:Ljava/lang/Object;

    .line 125
    .line 126
    new-instance v3, Lum1;

    .line 127
    .line 128
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object v0, v3, Lum1;->ε:Ljava/lang/Object;

    .line 132
    .line 133
    new-instance v4, Lum1;

    .line 134
    .line 135
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-static {}, Li2;->τ()Lx90;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, v4, Lum1;->ε:Ljava/lang/Object;

    .line 143
    .line 144
    new-instance v5, Lum1;

    .line 145
    .line 146
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object v0, v5, Lum1;->ε:Ljava/lang/Object;

    .line 150
    .line 151
    new-instance v13, Lcom/example/dyhelper/ui/GestureAreaView;

    .line 152
    .line 153
    const/4 v0, 0x6

    .line 154
    invoke-direct {v13, v1, v7, v0, v11}, Lcom/example/dyhelper/ui/GestureAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13, v11}, Landroid/view/View;->setEnabled(Z)V

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x2

    .line 161
    invoke-virtual {v13, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v3, Lum1;->ε:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lw90;

    .line 167
    .line 168
    invoke-virtual {v13, v0}, Lcom/example/dyhelper/ui/GestureAreaView;->setGridBounds(Lw90;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 172
    .line 173
    const/4 v15, -0x1

    .line 174
    invoke-direct {v0, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10, v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    .line 179
    .line 180
    move-object v6, v4

    .line 181
    move-object v4, v2

    .line 182
    new-instance v2, Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    const-string v0, "\u4fdd\u5b58"

    .line 188
    .line 189
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41700000    # 15.0f

    .line 193
    .line 194
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 198
    .line 199
    .line 200
    const/16 v11, 0x11

    .line 201
    .line 202
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v7, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 209
    .line 210
    .line 211
    const-string v0, "\u4fdd\u5b58\u624b\u52bf\u533a\u57df\u4f4d\u7f6e"

    .line 212
    .line 213
    invoke-virtual {v2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41000000    # 8.0f

    .line 217
    .line 218
    invoke-static {v1, v0}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    int-to-float v8, v8

    .line 223
    invoke-virtual {v2, v8}, Landroid/view/View;->setElevation(F)V

    .line 224
    .line 225
    .line 226
    move v8, v0

    .line 227
    new-instance v0, Lla0;

    .line 228
    .line 229
    const/high16 v8, 0x41700000    # 15.0f

    .line 230
    .line 231
    invoke-direct/range {v0 .. v6}, Lla0;-><init>(Landroid/app/Activity;Landroid/widget/TextView;Lum1;Lum1;Lum1;Lum1;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v23, v2

    .line 235
    .line 236
    move-object v2, v0

    .line 237
    move-object/from16 v0, v23

    .line 238
    .line 239
    new-instance v8, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;

    .line 240
    .line 241
    iget-object v7, v3, Lum1;->ε:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v7, Lw90;

    .line 244
    .line 245
    iget-object v12, v5, Lum1;->ε:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v12, Lx90;

    .line 248
    .line 249
    new-instance v11, Lm3;

    .line 250
    .line 251
    invoke-direct {v11, v3, v13, v2, v14}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 252
    .line 253
    .line 254
    invoke-direct {v8, v1, v7, v12, v11}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;-><init>(Landroid/app/Activity;Lw90;Lx90;Lm3;)V

    .line 255
    .line 256
    .line 257
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 258
    .line 259
    invoke-direct {v7, v15, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v10, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 263
    .line 264
    .line 265
    new-instance v11, Landroid/widget/TextView;

    .line 266
    .line 267
    invoke-direct {v11, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 268
    .line 269
    .line 270
    const-string v7, "\u62d6\u52a8\u5185\u90e8\u5206\u5272\u7ebf\u548c\u56db\u5468\u8fb9\u754c\u8c03\u6574\u5b9e\u9645\u624b\u52bf\u533a\u57df\n\u2194 \u5de6\u53f3\u62d6\u52a8\uff0c\u2195 \u4e0a\u4e0b\u62d6\u52a8\uff1b\u8fb9\u8ddd\u5916\u4e0d\u4f1a\u89e6\u53d1\u624b\u52bf\n\u5e95\u90e8\u53ef\u5207\u6362\u5de6\u53f3\u3001\u4e0a\u4e0b\u8fb9\u8ddd\u540c\u6b65\uff0c\u4fdd\u5b58\u540e\u7acb\u5373\u751f\u6548"

    .line 271
    .line 272
    invoke-virtual {v11, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    .line 274
    .line 275
    const/high16 v7, 0x41480000    # 12.5f

    .line 276
    .line 277
    invoke-virtual {v11, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 281
    .line 282
    .line 283
    const/16 v7, 0x11

    .line 284
    .line 285
    invoke-virtual {v11, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 286
    .line 287
    .line 288
    const/4 v7, 0x1

    .line 289
    const/4 v12, 0x0

    .line 290
    invoke-virtual {v11, v12, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 291
    .line 292
    .line 293
    const/high16 v7, 0x41600000    # 14.0f

    .line 294
    .line 295
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    const/high16 v14, 0x41200000    # 10.0f

    .line 300
    .line 301
    invoke-static {v1, v14}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 302
    .line 303
    .line 304
    move-result v15

    .line 305
    move-object/from16 v19, v3

    .line 306
    .line 307
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    invoke-static {v1, v14}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    invoke-virtual {v11, v12, v15, v3, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 316
    .line 317
    .line 318
    const/16 v3, 0xd7

    .line 319
    .line 320
    const/16 v7, 0x18

    .line 321
    .line 322
    const/16 v12, 0x14

    .line 323
    .line 324
    invoke-static {v3, v12, v12, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    const/high16 v12, 0x41600000    # 14.0f

    .line 329
    .line 330
    invoke-static {v1, v12}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    invoke-static {v3}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    int-to-float v12, v12

    .line 339
    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v11, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 343
    .line 344
    .line 345
    const/high16 v3, 0x40800000    # 4.0f

    .line 346
    .line 347
    invoke-static {v1, v3}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 348
    .line 349
    .line 350
    move-result v12

    .line 351
    int-to-float v12, v12

    .line 352
    invoke-virtual {v11, v12}, Landroid/view/View;->setElevation(F)V

    .line 353
    .line 354
    .line 355
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 356
    .line 357
    const/16 v15, 0x31

    .line 358
    .line 359
    const/4 v7, -0x2

    .line 360
    const/4 v3, -0x1

    .line 361
    invoke-direct {v12, v3, v7, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 362
    .line 363
    .line 364
    const/high16 v3, 0x41800000    # 16.0f

    .line 365
    .line 366
    invoke-static {v1, v3}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 367
    .line 368
    .line 369
    move-result v15

    .line 370
    iput v15, v12, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 371
    .line 372
    invoke-static {v1, v3}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    iput v15, v12, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 377
    .line 378
    invoke-static {v1, v3}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 379
    .line 380
    .line 381
    move-result v15

    .line 382
    iput v15, v12, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 383
    .line 384
    invoke-virtual {v10, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 385
    .line 386
    .line 387
    iget-object v15, v5, Lum1;->ε:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v15, Lx90;

    .line 390
    .line 391
    new-instance v7, Lcom/example/dyhelper/ui/ν;

    .line 392
    .line 393
    invoke-direct {v7, v5, v8, v2}, Lcom/example/dyhelper/ui/ν;-><init>(Lum1;Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;Lla0;)V

    .line 394
    .line 395
    .line 396
    const-string v3, "\u5de6\u53f3\u8fb9\u8ddd\u540c\u6b65"

    .line 397
    .line 398
    iget-boolean v14, v15, Lx90;->α:Z

    .line 399
    .line 400
    invoke-static {v1, v3, v14}, Lcom/example/dyhelper/ui/ο;->α(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/CheckBox;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    const-string v14, "\u4e0a\u4e0b\u8fb9\u8ddd\u540c\u6b65"

    .line 405
    .line 406
    iget-boolean v15, v15, Lx90;->β:Z

    .line 407
    .line 408
    invoke-static {v1, v14, v15}, Lcom/example/dyhelper/ui/ο;->α(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/CheckBox;

    .line 409
    .line 410
    .line 411
    move-result-object v14

    .line 412
    new-instance v15, Lka0;

    .line 413
    .line 414
    move-object/from16 v22, v2

    .line 415
    .line 416
    const/4 v2, 0x1

    .line 417
    invoke-direct {v15, v7, v14, v2}, Lka0;-><init>(Lm80;Landroid/widget/CompoundButton;I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3, v15}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 421
    .line 422
    .line 423
    new-instance v2, Lka0;

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    invoke-direct {v2, v7, v3, v15}, Lka0;-><init>(Lm80;Landroid/widget/CompoundButton;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v14, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 430
    .line 431
    .line 432
    new-instance v2, Landroid/widget/LinearLayout;

    .line 433
    .line 434
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 438
    .line 439
    .line 440
    const/16 v7, 0x11

    .line 441
    .line 442
    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 443
    .line 444
    .line 445
    const/high16 v7, 0x41200000    # 10.0f

    .line 446
    .line 447
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 448
    .line 449
    .line 450
    move-result v15

    .line 451
    move-object/from16 v21, v4

    .line 452
    .line 453
    move-object/from16 v20, v5

    .line 454
    .line 455
    const/high16 v4, 0x40800000    # 4.0f

    .line 456
    .line 457
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    invoke-virtual {v2, v15, v5, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 470
    .line 471
    .line 472
    const/16 v4, 0xdc

    .line 473
    .line 474
    const/16 v5, 0x14

    .line 475
    .line 476
    const/16 v7, 0x18

    .line 477
    .line 478
    invoke-static {v4, v5, v5, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    const/high16 v5, 0x41800000    # 16.0f

    .line 483
    .line 484
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-static {v4}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    int-to-float v5, v7

    .line 493
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x40e00000    # 7.0f

    .line 500
    .line 501
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    int-to-float v4, v4

    .line 506
    invoke-virtual {v2, v4}, Landroid/view/View;->setElevation(F)V

    .line 507
    .line 508
    .line 509
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 510
    .line 511
    const/high16 v5, 0x42280000    # 42.0f

    .line 512
    .line 513
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    const/high16 v15, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    invoke-direct {v4, v5, v7, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 524
    .line 525
    .line 526
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 527
    .line 528
    const/high16 v4, 0x42280000    # 42.0f

    .line 529
    .line 530
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    invoke-direct {v3, v5, v4, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 538
    .line 539
    .line 540
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 541
    .line 542
    const/16 v3, 0x51

    .line 543
    .line 544
    const/4 v4, -0x1

    .line 545
    const/4 v5, -0x2

    .line 546
    invoke-direct {v14, v4, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 547
    .line 548
    .line 549
    const/high16 v5, 0x41800000    # 16.0f

    .line 550
    .line 551
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    iput v4, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 556
    .line 557
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    iput v4, v14, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 562
    .line 563
    const/high16 v4, 0x42b00000    # 88.0f

    .line 564
    .line 565
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    iput v4, v14, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 570
    .line 571
    invoke-virtual {v10, v2, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 572
    .line 573
    .line 574
    new-instance v15, Landroid/widget/TextView;

    .line 575
    .line 576
    invoke-direct {v15, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 577
    .line 578
    .line 579
    const-string v4, "\u9000\u51fa\u9884\u89c8"

    .line 580
    .line 581
    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 582
    .line 583
    .line 584
    const/high16 v4, 0x41700000    # 15.0f

    .line 585
    .line 586
    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 587
    .line 588
    .line 589
    const/4 v4, -0x1

    .line 590
    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 591
    .line 592
    .line 593
    const/16 v7, 0x11

    .line 594
    .line 595
    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 596
    .line 597
    .line 598
    const/4 v4, 0x0

    .line 599
    const/4 v7, 0x1

    .line 600
    invoke-virtual {v15, v4, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v15, v7}, Landroid/view/View;->setClickable(Z)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v15, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 607
    .line 608
    .line 609
    const-string v4, "\u9000\u51fa\u624b\u52bf\u4f4d\u7f6e\u9884\u89c8"

    .line 610
    .line 611
    invoke-virtual {v15, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 612
    .line 613
    .line 614
    const/16 v4, 0x3d

    .line 615
    .line 616
    const/16 v5, 0x5b

    .line 617
    .line 618
    const/16 v7, 0xe8

    .line 619
    .line 620
    invoke-static {v7, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    const/high16 v5, 0x41c00000    # 24.0f

    .line 625
    .line 626
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    invoke-static {v4}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    int-to-float v5, v5

    .line 635
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v15, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 639
    .line 640
    .line 641
    const/high16 v4, 0x41000000    # 8.0f

    .line 642
    .line 643
    invoke-static {v1, v4}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    int-to-float v4, v4

    .line 648
    invoke-virtual {v15, v4}, Landroid/view/View;->setElevation(F)V

    .line 649
    .line 650
    .line 651
    new-instance v4, Landroid/widget/LinearLayout;

    .line 652
    .line 653
    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 654
    .line 655
    .line 656
    const/4 v5, 0x0

    .line 657
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 658
    .line 659
    .line 660
    const/16 v7, 0x11

    .line 661
    .line 662
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 663
    .line 664
    .line 665
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 666
    .line 667
    const/high16 v7, 0x43040000    # 132.0f

    .line 668
    .line 669
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    const/high16 v7, 0x42400000    # 48.0f

    .line 674
    .line 675
    move-object/from16 v18, v2

    .line 676
    .line 677
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    invoke-direct {v5, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 682
    .line 683
    .line 684
    const/high16 v2, 0x40c00000    # 6.0f

    .line 685
    .line 686
    invoke-static {v1, v2}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 691
    .line 692
    invoke-virtual {v4, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 693
    .line 694
    .line 695
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 696
    .line 697
    const/high16 v5, 0x43040000    # 132.0f

    .line 698
    .line 699
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 700
    .line 701
    .line 702
    move-result v5

    .line 703
    invoke-static {v1, v7}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 704
    .line 705
    .line 706
    move-result v7

    .line 707
    invoke-direct {v3, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 708
    .line 709
    .line 710
    invoke-static {v1, v2}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 715
    .line 716
    invoke-virtual {v4, v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 717
    .line 718
    .line 719
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 720
    .line 721
    const/4 v3, -0x1

    .line 722
    const/4 v5, -0x2

    .line 723
    const/16 v7, 0x51

    .line 724
    .line 725
    invoke-direct {v2, v3, v5, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 726
    .line 727
    .line 728
    const/high16 v5, 0x41800000    # 16.0f

    .line 729
    .line 730
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 735
    .line 736
    invoke-static {v1, v5}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 741
    .line 742
    const/high16 v3, 0x41e00000    # 28.0f

    .line 743
    .line 744
    invoke-static {v1, v3}, Lcom/example/dyhelper/ui/ο;->β(Landroid/content/Context;F)I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 749
    .line 750
    invoke-virtual {v10, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 751
    .line 752
    .line 753
    move-object v3, v0

    .line 754
    new-instance v0, Lcom/example/dyhelper/ui/ξ;

    .line 755
    .line 756
    move-object/from16 v17, v2

    .line 757
    .line 758
    move-object/from16 v16, v4

    .line 759
    .line 760
    move-object v4, v6

    .line 761
    move-object v6, v8

    .line 762
    move-object v5, v13

    .line 763
    move-object/from16 v2, v21

    .line 764
    .line 765
    move-object/from16 v7, v22

    .line 766
    .line 767
    move-object v8, v1

    .line 768
    move-object v13, v3

    .line 769
    move-object/from16 v1, v19

    .line 770
    .line 771
    move-object/from16 v3, v20

    .line 772
    .line 773
    invoke-direct/range {v0 .. v8}, Lcom/example/dyhelper/ui/ξ;-><init>(Lum1;Lum1;Lum1;Lum1;Lcom/example/dyhelper/ui/GestureAreaView;Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;Lla0;Landroid/app/Activity;)V

    .line 774
    .line 775
    .line 776
    move-object v2, v0

    .line 777
    move-object v0, v7

    .line 778
    move-object v1, v8

    .line 779
    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0}, Lla0;->invoke()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    new-instance v0, Lma0;

    .line 786
    .line 787
    const/4 v5, 0x0

    .line 788
    invoke-direct {v0, v1, v5}, Lma0;-><init>(Landroid/app/Activity;I)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 792
    .line 793
    .line 794
    new-instance v0, Lna0;

    .line 795
    .line 796
    invoke-direct {v0, v1}, Lna0;-><init>(Landroid/app/Activity;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 800
    .line 801
    .line 802
    new-instance v0, Loa0;

    .line 803
    .line 804
    move-object v2, v1

    .line 805
    move-object v3, v11

    .line 806
    move-object v1, v12

    .line 807
    move-object v4, v14

    .line 808
    move-object/from16 v7, v16

    .line 809
    .line 810
    move-object/from16 v6, v17

    .line 811
    .line 812
    move-object/from16 v5, v18

    .line 813
    .line 814
    invoke-direct/range {v0 .. v7}, Loa0;-><init>(Landroid/widget/FrameLayout$LayoutParams;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/LinearLayout;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 818
    .line 819
    .line 820
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 821
    .line 822
    const/4 v3, -0x1

    .line 823
    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v9, v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v10}, Landroid/view/View;->bringToFront()V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v10}, Landroid/view/View;->requestFocus()Z

    .line 833
    .line 834
    .line 835
    invoke-virtual {v10}, Landroid/view/View;->requestApplyInsets()V

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :cond_6
    const-string v0, "\u5bbf\u4e3b DecorView \u4e0d\u652f\u6301\u6dfb\u52a0\u9884\u89c8\u5c42"

    .line 840
    .line 841
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    :cond_7
    :goto_4
    return-void
.end method
