.class public final Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子世楪苏哲兰:Z

.field public 飘花落叶言子楪兰世哲苏:Landroid/content/res/ColorStateList;

.field public final 飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

.field public 飘花落叶言子楪兰哲世苏:Landroid/widget/ImageView$ScaleType;

.field public 飘花落叶言子楪兰哲苏世:Landroid/view/View$OnLongClickListener;

.field public 飘花落叶言子楪兰苏世哲:Landroid/graphics/PorterDuff$Mode;

.field public 飘花落叶言子楪兰苏哲世:I

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/CharSequence;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 9
    .line 10
    const/16 p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    .line 21
    const v2, 0x800003

    .line 22
    .line 23
    .line 24
    const/4 v3, -0x2

    .line 25
    const/4 v4, -0x1

    .line 26
    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const v2, 0x240c0046

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 48
    .line 49
    iput-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 50
    .line 51
    new-instance v2, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-direct {v2, v5, v6}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v5}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 78
    .line 79
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 80
    .line 81
    .line 82
    :cond_0
    invoke-virtual {p0, v6}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v6}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 86
    .line 87
    .line 88
    iget-object v5, p2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Landroid/content/res/TypedArray;

    .line 91
    .line 92
    const/16 v7, 0x46

    .line 93
    .line 94
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_1

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-static {v8, p2, v7}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;I)Landroid/content/res/ColorStateList;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    iput-object v7, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:Landroid/content/res/ColorStateList;

    .line 109
    .line 110
    :cond_1
    const/16 v7, 0x47

    .line 111
    .line 112
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_2

    .line 117
    .line 118
    invoke-virtual {v5, v7, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-static {v7, v6}, Lcom/google/android/material/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    iput-object v7, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:Landroid/graphics/PorterDuff$Mode;

    .line 127
    .line 128
    :cond_2
    const/16 v7, 0x43

    .line 129
    .line 130
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    const/4 v9, 0x1

    .line 135
    if-eqz v8, :cond_4

    .line 136
    .line 137
    invoke-virtual {p2, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏哲世(I)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {p0, v7}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Landroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    const/16 v7, 0x42

    .line 145
    .line 146
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_3

    .line 151
    .line 152
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {p0, v7}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    const/16 v7, 0x41

    .line 160
    .line 161
    invoke-virtual {v5, v7, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-virtual {v1, v7}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const v8, 0x24070406

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    const/16 v8, 0x44

    .line 180
    .line 181
    invoke-virtual {v5, v8, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-ltz v7, :cond_9

    .line 186
    .line 187
    iget v8, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏哲世:I

    .line 188
    .line 189
    if-eq v7, v8, :cond_5

    .line 190
    .line 191
    iput v7, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏哲世:I

    .line 192
    .line 193
    invoke-virtual {v1, v7}, Landroid/view/View;->setMinimumWidth(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v7}, Landroid/view/View;->setMinimumHeight(I)V

    .line 197
    .line 198
    .line 199
    :cond_5
    const/16 v7, 0x45

    .line 200
    .line 201
    invoke-virtual {v5, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-eqz v8, :cond_6

    .line 206
    .line 207
    invoke-virtual {v5, v7, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-static {v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(I)Landroid/widget/ImageView$ScaleType;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iput-object v4, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰哲世苏:Landroid/widget/ImageView$ScaleType;

    .line 216
    .line 217
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    const p1, 0x24090356

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, p1}, Landroid/view/View;->setId(I)V

    .line 227
    .line 228
    .line 229
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 230
    .line 231
    invoke-direct {p1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v9}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 238
    .line 239
    .line 240
    const/16 p1, 0x3d

    .line 241
    .line 242
    invoke-virtual {v5, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 247
    .line 248
    .line 249
    const/16 p1, 0x3e

    .line 250
    .line 251
    invoke-virtual {v5, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_7

    .line 256
    .line 257
    invoke-virtual {p2, p1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世哲苏(I)Landroid/content/res/ColorStateList;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 262
    .line 263
    .line 264
    :cond_7
    const/16 p1, 0x3c

    .line 265
    .line 266
    invoke-virtual {v5, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-eqz p2, :cond_8

    .line 275
    .line 276
    goto :goto_0

    .line 277
    :cond_8
    move-object v6, p1

    .line 278
    :goto_0
    iput-object v6, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/CharSequence;

    .line 279
    .line 280
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    new-instance p1, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 293
    .line 294
    const/4 p2, 0x3

    .line 295
    invoke-direct {p1, p0, p2}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setOnFocusableChangedListener(Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_9
    const-string p0, "startIconSize cannot be less than 0"

    .line 303
    .line 304
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v6
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰哲苏世:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰哲苏世:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/CharSequence;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪苏哲兰:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v1

    .line 15
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    :cond_1
    move v1, v2

    .line 26
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世苏哲()Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const v4, 0x24070381

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 46
    .line 47
    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    if-eq v1, p1, :cond_3

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 32
    .line 33
    .line 34
    :cond_1
    if-eqz p1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/16 v2, 0x8

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/飘花落叶言子世楪兰哲苏;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    .line 14
    invoke-static {v2, v0, p1, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏(Z)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    invoke-static {v2, v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲苏世(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏(Z)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪兰哲苏(Lcom/google/android/material/internal/CheckableImageButton;Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/2addr v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v1

    .line 37
    add-int/2addr p0, v0

    .line 38
    return p0
.end method
