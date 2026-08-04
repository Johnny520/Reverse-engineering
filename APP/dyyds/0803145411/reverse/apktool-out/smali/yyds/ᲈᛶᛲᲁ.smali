.class public final Lyyds/ᲈᛶᛲᲁ;
.super Lyyds/ᛲᲀᛱᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    const v0, 0x660401fb

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Lyyds/ᛲᲀᛱᛷ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lyyds/ᛵᛸᛷᲀ;->ᛲᛴᛳᛲ:[I

    .line 8
    .line 9
    const v2, 0x660f01e2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sget-object v3, Lyyds/ᛲᛸᲈᲈ;->ᲇᲈᛵᛷ:[I

    .line 28
    .line 29
    const-string v6, "Theme.MaterialComponents"

    .line 30
    .line 31
    invoke-static {p1, v3, v6}, Lyyds/ᛲᛸᲈᲈ;->ᲀᛲᛳᲀ(Landroid/content/Context;[ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object v3, Lyyds/ᛲᛸᲈᲈ;->ᲀᛲᛳᲀ:[I

    .line 35
    .line 36
    const-string v6, "Theme.AppCompat"

    .line 37
    .line 38
    invoke-static {p1, v3, v6}, Lyyds/ᛲᛸᲈᲈ;->ᲀᛲᛳᲀ(Landroid/content/Context;[ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v3, 0x2

    .line 46
    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/4 v7, -0x1

    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v1, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eq v6, v7, :cond_2

    .line 62
    .line 63
    move v6, v4

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v6, v5

    .line 66
    :goto_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 67
    .line 68
    .line 69
    if-eqz v6, :cond_5

    .line 70
    .line 71
    :goto_1
    sget-object v1, Lyyds/ᛵᛸᛷᲀ;->ᲀᛲᛳᲀ:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/16 p2, 0x9

    .line 78
    .line 79
    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iput p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 84
    .line 85
    const/16 p2, 0xc

    .line 86
    .line 87
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 92
    .line 93
    invoke-static {p2}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛲᲈᲈ(I)Landroid/graphics/PorterDuff$Mode;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const/16 v0, 0xb

    .line 104
    .line 105
    invoke-static {p2, p1, v0}, Lyyds/ᛴᛸᛲ;->ᛲᛴᛳᛲ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iput-object p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const/4 v0, 0x7

    .line 116
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_3

    .line 127
    .line 128
    invoke-static {p2, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-eqz p2, :cond_3

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    :goto_2
    iput-object p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    const/16 p2, 0x8

    .line 142
    .line 143
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iput p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛲᲈᲈ:I

    .line 148
    .line 149
    const/16 p2, 0xa

    .line 150
    .line 151
    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    iput p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 156
    .line 157
    new-instance p2, Lyyds/ᛳᛳᛴᛳ;

    .line 158
    .line 159
    invoke-direct {p2, p0}, Lyyds/ᛳᛳᛴᛳ;-><init>(Lyyds/ᲈᛶᛲᲁ;)V

    .line 160
    .line 161
    .line 162
    iput-object p2, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 163
    .line 164
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ:I

    .line 169
    .line 170
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 175
    .line 176
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᲇᲈᛵᛷ:I

    .line 181
    .line 182
    const/4 v0, 0x3

    .line 183
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᛲᛴᛳᛲ:I

    .line 188
    .line 189
    const/4 v0, 0x6

    .line 190
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 195
    .line 196
    const/16 v0, 0xf

    .line 197
    .line 198
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iput v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 203
    .line 204
    const/4 v0, 0x5

    .line 205
    invoke-virtual {p1, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-static {v0}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛲᲈᲈ(I)Landroid/graphics/PorterDuff$Mode;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 214
    .line 215
    iget-object v0, p2, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const/4 v2, 0x4

    .line 222
    invoke-static {v1, p1, v2}, Lyyds/ᛴᛸᛲ;->ᛲᛴᛳᛲ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iput-object v1, p2, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const/16 v2, 0xe

    .line 233
    .line 234
    invoke-static {v1, p1, v2}, Lyyds/ᛴᛸᛲ;->ᛲᛴᛳᛲ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iput-object v1, p2, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    const/16 v2, 0xd

    .line 245
    .line 246
    invoke-static {v1, p1, v2}, Lyyds/ᛴᛸᛲ;->ᛲᛴᛳᛲ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iput-object v1, p2, Lyyds/ᛳᛳᛴᛳ;->ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

    .line 251
    .line 252
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 253
    .line 254
    iget-object v2, p2, Lyyds/ᛳᛳᛴᛳ;->ᛷᛵᲇᲀ:Landroid/graphics/Paint;

    .line 255
    .line 256
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 257
    .line 258
    .line 259
    iget v1, p2, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 260
    .line 261
    int-to-float v1, v1

    .line 262
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 263
    .line 264
    .line 265
    iget-object v1, p2, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 266
    .line 267
    if-eqz v1, :cond_4

    .line 268
    .line 269
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v1, v3, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    :cond_4
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    .line 279
    .line 280
    sget-object v1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    invoke-virtual {p2}, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ()Lyyds/ᛲᲀᛸ;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-virtual {v0, v5}, Lyyds/ᲈᛶᛲᲁ;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    .line 303
    .line 304
    .line 305
    iget v5, p2, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ:I

    .line 306
    .line 307
    add-int/2addr v1, v5

    .line 308
    iget v5, p2, Lyyds/ᛳᛳᛴᛳ;->ᲇᲈᛵᛷ:I

    .line 309
    .line 310
    add-int/2addr v2, v5

    .line 311
    iget v5, p2, Lyyds/ᛳᛳᛴᛳ;->ᲀᛲᛳᲀ:I

    .line 312
    .line 313
    add-int/2addr v3, v5

    .line 314
    iget p2, p2, Lyyds/ᛳᛳᛴᛳ;->ᛲᛴᛳᛲ:I

    .line 315
    .line 316
    add-int/2addr v4, p2

    .line 317
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 321
    .line 322
    .line 323
    iget p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 324
    .line 325
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_5
    const-string p0, "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."

    .line 333
    .line 334
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const/4 p0, 0x0

    .line 338
    throw p0
.end method


# virtual methods
.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getCornerRadius()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIconGravity()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛲᲈᲈ:I

    .line 2
    .line 3
    return p0
.end method

.method public getIconPadding()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    return p0
.end method

.method public getIconSize()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 2
    .line 3
    return p0
.end method

.method public getIconTint()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public getStrokeColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public getStrokeWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-super {p0}, Lyyds/ᛲᲀᛱᛷ;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-super {p0}, Lyyds/ᛲᲀᛱᛷ;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    iget p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛲᲈᲈ:I

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    if-eq p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    float-to-int p1, p1

    .line 31
    iget v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int/2addr v1, p1

    .line 46
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    sub-int/2addr v1, p1

    .line 53
    sub-int/2addr v1, v0

    .line 54
    iget p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 55
    .line 56
    sub-int/2addr v1, p1

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    sub-int/2addr v1, p1

    .line 62
    div-int/2addr v1, p2

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 p2, 0x1

    .line 68
    if-ne p1, p2, :cond_2

    .line 69
    .line 70
    neg-int v1, v1

    .line 71
    :cond_2
    iget p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛵᲇᲀ:I

    .line 72
    .line 73
    if-eq p1, v1, :cond_3

    .line 74
    .line 75
    iput v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛵᲇᲀ:I

    .line 76
    .line 77
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_0
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const-string v0, "MaterialButton"

    .line 14
    .line 15
    const-string v1, "Setting a custom background is not supported."

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 22
    .line 23
    iput-boolean v0, v1, Lyyds/ᛳᛳᛴᛳ;->ᲇᛱᛲ:Z

    .line 24
    .line 25
    iget-object v0, v1, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 26
    .line 27
    iget-object v2, v1, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lyyds/ᲈᛶᛲᲁ;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lyyds/ᲈᛶᛲᲁ;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1}, Lyyds/ᛲᲀᛱᛷ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-super {p0, p1}, Lyyds/ᛲᲀᛱᛷ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCornerRadius(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-eq v0, p1, :cond_0

    .line 12
    .line 13
    iput p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᲇᲇᛱ:I

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᛲᲈᲈ:Landroid/graphics/drawable/GradientDrawable;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    int-to-float p1, p1

    .line 28
    const v1, 0x3727c5ac    # 1.0E-5f

    .line 29
    .line 30
    .line 31
    add-float/2addr p1, v1

    .line 32
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛳᲁᲁᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public setCornerRadiusResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setCornerRadius(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIconGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛲᲈᲈ:I

    .line 2
    .line 3
    return-void
.end method

.method public setIconPadding(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛶᛷᛲᲁ:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIconResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setIconSize(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    const-string p0, "iconSize cannot be less than 0"

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIconTintResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setInternalBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lyyds/ᛲᲀᛱᛷ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    if-eq v1, p1, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛲᲈᛱ:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of p0, p0, Landroid/graphics/drawable/RippleDrawable;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/graphics/drawable/RippleDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public setRippleColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setRippleColor(Landroid/content/res/ColorStateList;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 12
    .line 13
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᲈᲈᲁ:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛵᲇᲀ:Landroid/graphics/Paint;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p1, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :cond_0
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ()Lyyds/ᛲᲀᛸ;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v1, p0}, Lyyds/ᲈᛶᛲᲁ;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public setStrokeColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStrokeWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 8
    .line 9
    iget v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 10
    .line 11
    if-eq v0, p1, :cond_0

    .line 12
    .line 13
    iput p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛶᛷᛲᲁ:I

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛳᛳᛴᛳ;->ᛷᛵᲇᲀ:Landroid/graphics/Paint;

    .line 16
    .line 17
    int-to-float p1, p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛱᛳᲇ:Landroid/graphics/drawable/GradientDrawable;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᛲᲁ;

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛳᛳᛴᛳ;->ᛲᲈᲁ()Lyyds/ᛲᲀᛸ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, p0}, Lyyds/ᲈᛶᛲᲁ;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public setStrokeWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0, p1}, Lyyds/ᲈᛶᛲᲁ;->setStrokeWidth(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, v1, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eq p0, p1, :cond_1

    .line 12
    .line 13
    iput-object p1, v1, Lyyds/ᛳᛳᛴᛳ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-virtual {v1}, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-super {p0, p1}, Lyyds/ᛲᲀᛱᛷ;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᲈᛶᛲᲁ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, v1, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    if-eq p0, p1, :cond_1

    .line 12
    .line 13
    iput-object p1, v1, Lyyds/ᛳᛳᛴᛳ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-virtual {v1}, Lyyds/ᛳᛳᛴᛳ;->ᛵᛸᛸᛷ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-super {p0, p1}, Lyyds/ᛲᲀᛱᛷ;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final ᛲᲈᲁ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛲᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᛳᛴᛳ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lyyds/ᛳᛳᛴᛳ;->ᲇᛱᛲ:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛲᛳᛶᲁ:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛱᲈᲁ:Landroid/graphics/PorterDuff$Mode;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :goto_0
    iget v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛲᲈᛱ:I

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v1, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_1
    iget-object v2, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    iget v3, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᛵᲇᲀ:I

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    add-int/2addr v0, v3

    .line 53
    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-object v0, p0, Lyyds/ᲈᛶᛲᲁ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {p0, v0, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
