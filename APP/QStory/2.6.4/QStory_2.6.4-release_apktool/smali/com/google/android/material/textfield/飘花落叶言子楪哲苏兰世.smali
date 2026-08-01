.class public final Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世哲楪苏兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子世楪兰哲苏:Landroid/view/View$OnLongClickListener;

.field public 飘花落叶言子世楪兰苏哲:Landroid/widget/ImageView$ScaleType;

.field public 飘花落叶言子世楪哲兰苏:I

.field public 飘花落叶言子世楪哲苏兰:Landroid/graphics/PorterDuff$Mode;

.field public 飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

.field public final 飘花落叶言子世楪苏哲兰:Ljava/util/LinkedHashSet;

.field public 飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

.field public final 飘花落叶言子世苏兰楪哲:Landroid/view/accessibility/AccessibilityManager;

.field public 飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

.field public 飘花落叶言子世苏哲楪兰:Z

.field public final 飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

.field public 飘花落叶言子世苏楪哲兰:Ljava/lang/CharSequence;

.field public 飘花落叶言子楪兰世哲苏:Landroid/graphics/PorterDuff$Mode;

.field public 飘花落叶言子楪兰世苏哲:Landroid/content/res/ColorStateList;

.field public final 飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

.field public 飘花落叶言子楪兰哲苏世:I

.field public 飘花落叶言子楪兰苏世哲:Landroid/view/View$OnLongClickListener;

.field public final 飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

.field public final 飘花落叶言子楪哲兰世苏:Landroid/widget/FrameLayout;

.field public final 飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput v3, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:I

    .line 16
    .line 17
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v4, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰:Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    new-instance v4, Lcom/google/android/material/textfield/飘花落叶言子楪哲世兰苏;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲世兰苏;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;)V

    .line 27
    .line 28
    .line 29
    iput-object v4, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪苏兰:Lcom/google/android/material/textfield/飘花落叶言子楪哲世兰苏;

    .line 30
    .line 31
    new-instance v4, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏世兰;

    .line 32
    .line 33
    invoke-direct {v4, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏世兰;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-string v6, "accessibility"

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Landroid/view/accessibility/AccessibilityManager;

    .line 47
    .line 48
    iput-object v5, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰楪哲:Landroid/view/accessibility/AccessibilityManager;

    .line 49
    .line 50
    iput-object v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 51
    .line 52
    const/16 v5, 0x8

    .line 53
    .line 54
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 61
    .line 62
    const v7, 0x800005

    .line 63
    .line 64
    .line 65
    const/4 v8, -0x2

    .line 66
    const/4 v9, -0x1

    .line 67
    invoke-direct {v6, v8, v9, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    new-instance v6, Landroid/widget/FrameLayout;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-direct {v6, v7}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    iput-object v6, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Landroid/widget/FrameLayout;

    .line 83
    .line 84
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 85
    .line 86
    .line 87
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 88
    .line 89
    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const v10, 0x24090350

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v0, v7, v10}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    iput-object v10, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 111
    .line 112
    const v11, 0x2409034f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v6, v7, v11}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    iput-object v7, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 120
    .line 121
    new-instance v11, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 122
    .line 123
    invoke-direct {v11, v0, v2}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 124
    .line 125
    .line 126
    iput-object v11, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 127
    .line 128
    new-instance v11, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-direct {v11, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 136
    .line 137
    .line 138
    iput-object v11, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 139
    .line 140
    iget-object v12, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v12, Landroid/content/res/TypedArray;

    .line 143
    .line 144
    const/16 v14, 0x26

    .line 145
    .line 146
    invoke-virtual {v12, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_0

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    invoke-static {v15, v2, v14}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;I)Landroid/content/res/ColorStateList;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    iput-object v14, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Landroid/content/res/ColorStateList;

    .line 161
    .line 162
    :cond_0
    const/16 v14, 0x27

    .line 163
    .line 164
    invoke-virtual {v12, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    if-eqz v15, :cond_1

    .line 169
    .line 170
    invoke-virtual {v12, v14, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    invoke-static {v14, v13}, Lcom/google/android/material/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 175
    .line 176
    .line 177
    move-result-object v14

    .line 178
    iput-object v14, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:Landroid/graphics/PorterDuff$Mode;

    .line 179
    .line 180
    :cond_1
    const/16 v14, 0x25

    .line 181
    .line 182
    invoke-virtual {v12, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-eqz v15, :cond_2

    .line 187
    .line 188
    invoke-virtual {v2, v14}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏哲世(I)Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-virtual {v0, v14}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(Landroid/graphics/drawable/Drawable;)V

    .line 193
    .line 194
    .line 195
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    const v15, 0x24120044

    .line 200
    .line 201
    .line 202
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-virtual {v10, v14}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    const/4 v14, 0x2

    .line 210
    invoke-virtual {v10, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v3}, Landroid/view/View;->setClickable(Z)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v3}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v10, v3}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v3}, Lcom/google/android/material/internal/CheckableImageButton;->setFocusable(Z)V

    .line 223
    .line 224
    .line 225
    const/16 v15, 0x36

    .line 226
    .line 227
    invoke-virtual {v12, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    if-nez v16, :cond_4

    .line 232
    .line 233
    const/16 v14, 0x20

    .line 234
    .line 235
    invoke-virtual {v12, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 236
    .line 237
    .line 238
    move-result v17

    .line 239
    if-eqz v17, :cond_3

    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-static {v8, v2, v14}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;I)Landroid/content/res/ColorStateList;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    iput-object v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 250
    .line 251
    :cond_3
    const/16 v8, 0x21

    .line 252
    .line 253
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-eqz v14, :cond_4

    .line 258
    .line 259
    invoke-virtual {v12, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-static {v8, v13}, Lcom/google/android/material/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    iput-object v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰:Landroid/graphics/PorterDuff$Mode;

    .line 268
    .line 269
    :cond_4
    const/16 v8, 0x1e

    .line 270
    .line 271
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    const/4 v5, 0x1

    .line 276
    if-eqz v14, :cond_6

    .line 277
    .line 278
    invoke-virtual {v12, v8, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(I)V

    .line 283
    .line 284
    .line 285
    const/16 v8, 0x1b

    .line 286
    .line 287
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    if-eqz v14, :cond_5

    .line 292
    .line 293
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)V

    .line 298
    .line 299
    .line 300
    :cond_5
    const/16 v8, 0x1a

    .line 301
    .line 302
    invoke-virtual {v12, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    invoke-virtual {v7, v8}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_6
    invoke-virtual {v12, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    if-eqz v8, :cond_9

    .line 315
    .line 316
    const/16 v8, 0x37

    .line 317
    .line 318
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    if-eqz v14, :cond_7

    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    invoke-static {v14, v2, v8}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;I)Landroid/content/res/ColorStateList;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    iput-object v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 333
    .line 334
    :cond_7
    const/16 v8, 0x38

    .line 335
    .line 336
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    if-eqz v14, :cond_8

    .line 341
    .line 342
    invoke-virtual {v12, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    invoke-static {v8, v13}, Lcom/google/android/material/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    iput-object v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰:Landroid/graphics/PorterDuff$Mode;

    .line 351
    .line 352
    :cond_8
    invoke-virtual {v12, v15, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(I)V

    .line 357
    .line 358
    .line 359
    const/16 v8, 0x34

    .line 360
    .line 361
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)V

    .line 366
    .line 367
    .line 368
    :cond_9
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    const v14, 0x24070406

    .line 373
    .line 374
    .line 375
    invoke-virtual {v8, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    const/16 v14, 0x1d

    .line 380
    .line 381
    invoke-virtual {v12, v14, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-ltz v8, :cond_e

    .line 386
    .line 387
    iget v14, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏:I

    .line 388
    .line 389
    if-eq v8, v14, :cond_a

    .line 390
    .line 391
    iput v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏:I

    .line 392
    .line 393
    invoke-virtual {v7, v8}, Landroid/view/View;->setMinimumWidth(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v7, v8}, Landroid/view/View;->setMinimumHeight(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v10, v8}, Landroid/view/View;->setMinimumWidth(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v10, v8}, Landroid/view/View;->setMinimumHeight(I)V

    .line 403
    .line 404
    .line 405
    :cond_a
    const/16 v8, 0x1f

    .line 406
    .line 407
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 408
    .line 409
    .line 410
    move-result v14

    .line 411
    if-eqz v14, :cond_b

    .line 412
    .line 413
    invoke-virtual {v12, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    invoke-static {v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(I)Landroid/widget/ImageView$ScaleType;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    iput-object v8, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲:Landroid/widget/ImageView$ScaleType;

    .line 422
    .line 423
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v10, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 427
    .line 428
    .line 429
    :cond_b
    const/16 v8, 0x8

    .line 430
    .line 431
    invoke-virtual {v11, v8}, Landroid/view/View;->setVisibility(I)V

    .line 432
    .line 433
    .line 434
    const v8, 0x24090357

    .line 435
    .line 436
    .line 437
    invoke-virtual {v11, v8}, Landroid/view/View;->setId(I)V

    .line 438
    .line 439
    .line 440
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 441
    .line 442
    const/high16 v9, 0x42a00000    # 80.0f

    .line 443
    .line 444
    const/4 v14, -0x2

    .line 445
    invoke-direct {v8, v14, v14, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v11, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v11, v5}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 452
    .line 453
    .line 454
    const/16 v8, 0x49

    .line 455
    .line 456
    invoke-virtual {v12, v8, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 461
    .line 462
    .line 463
    const/16 v8, 0x4a

    .line 464
    .line 465
    invoke-virtual {v12, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    if-eqz v9, :cond_c

    .line 470
    .line 471
    invoke-virtual {v2, v8}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世苏哲(I)Landroid/content/res/ColorStateList;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 476
    .line 477
    .line 478
    :cond_c
    const/16 v2, 0x48

    .line 479
    .line 480
    invoke-virtual {v12, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    if-eqz v8, :cond_d

    .line 489
    .line 490
    goto :goto_1

    .line 491
    :cond_d
    move-object v13, v2

    .line 492
    :goto_1
    iput-object v13, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Ljava/lang/CharSequence;

    .line 493
    .line 494
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰()V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 510
    .line 511
    .line 512
    new-instance v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲世苏兰;

    .line 513
    .line 514
    invoke-direct {v2, v0, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲世苏兰;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v10, v2}, Lcom/google/android/material/internal/CheckableImageButton;->setOnFocusableChangedListener(Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;)V

    .line 518
    .line 519
    .line 520
    new-instance v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲世苏兰;

    .line 521
    .line 522
    invoke-direct {v2, v0, v5}, Lcom/google/android/material/textfield/飘花落叶言子楪哲世苏兰;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v7, v2}, Lcom/google/android/material/internal/CheckableImageButton;->setOnFocusableChangedListener(Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v4}, Lcom/google/android/material/textfield/TextInputLayout;->addOnEditTextAttachedListener(Lcom/google/android/material/textfield/飘花落叶言子世楪哲兰苏;)V

    .line 529
    .line 530
    .line 531
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;

    .line 532
    .line 533
    const/4 v2, 0x2

    .line 534
    invoke-direct {v1, v0, v2}, Landroidx/compose/ui/graphics/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :cond_e
    const-string v0, "endIconSize cannot be less than 0"

    .line 542
    .line 543
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    throw v13
.end method


# virtual methods
.method public addOnEndIconChangedListener(Lcom/google/android/material/textfield/飘花落叶言子世楪兰苏哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnEndIconChangedListener(Lcom/google/android/material/textfield/飘花落叶言子世楪兰苏哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲苏兰(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setEndIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰哲苏:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲苏兰(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setErrorIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲苏兰(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setErrorIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲:Landroid/view/View$OnLongClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲苏兰(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲兰世()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, v2, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰世哲()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eq v1, v4, :cond_0

    .line 21
    .line 22
    xor-int/2addr v1, v3

    .line 23
    invoke-virtual {v2, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 24
    .line 25
    .line 26
    move v1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    instance-of v4, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->isActivated()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 38
    .line 39
    iget-boolean v0, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰哲世:Z

    .line 40
    .line 41
    if-eq v4, v0, :cond_1

    .line 42
    .line 43
    xor-int/lit8 v0, v4, 0x1

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Landroid/view/View;->setActivated(Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v3, v1

    .line 50
    :goto_1
    if-nez p1, :cond_3

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    return-void

    .line 56
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    invoke-static {p1, v2, p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result p0

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

.method public final 飘花落叶言子楪世哲兰苏()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v1

    .line 33
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    add-int/2addr p0, v1

    .line 44
    add-int/2addr p0, v0

    .line 45
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    if-eq v0, v3, :cond_4

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    if-eq v0, v3, :cond_2

    .line 28
    .line 29
    const/4 p0, 0x2

    .line 30
    if-eq v0, p0, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    if-ne v0, p0, :cond_0

    .line 34
    .line 35
    new-instance p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 36
    .line 37
    invoke-direct {p0, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p0, "Invalid end icon mode: "

    .line 42
    .line 43
    invoke-static {v0, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_1
    new-instance p0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;

    .line 53
    .line 54
    invoke-direct {p0, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v3, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;

    .line 59
    .line 60
    iget p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:I

    .line 61
    .line 62
    invoke-direct {v3, v2, p0}, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;I)V

    .line 63
    .line 64
    .line 65
    move-object p0, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    new-instance p0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    invoke-direct {p0, v2, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪世兰哲苏;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    new-instance p0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰哲苏;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {p0, v2, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪世兰哲苏;-><init>(Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;I)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {v1, v0, p0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    return-object v2
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 2

    .line 1
    const v0, 0x240c0045

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Landroid/view/View;->setId(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子楪哲世兰苏()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getPaddingEnd()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 29
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const v3, 0x24070381

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 57
    .line 58
    invoke-virtual {p0, v2, v3, v1, v0}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v2, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子世楪苏兰哲:Lcom/google/android/material/textfield/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    iget-boolean v1, v1, Lcom/google/android/material/textfield/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪哲苏世兰()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v1, 0x8

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏()V

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:I

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世苏哲()Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Ljava/lang/CharSequence;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲楪兰:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x8

    .line 19
    .line 20
    :goto_0
    if-eq v1, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    :cond_1
    invoke-virtual {v1, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏世兰(Z)V

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世苏哲()Z

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰楪哲:Landroid/view/accessibility/AccessibilityManager;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世()V

    .line 25
    .line 26
    .line 27
    iput p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:I

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰:Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_a

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    move v3, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_0
    invoke-virtual {p0, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 55
    .line 56
    iget v4, v4, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 57
    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    :cond_3
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5, v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v4, v1

    .line 76
    :goto_1
    iget-object v5, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 77
    .line 78
    invoke-virtual {v5, v4}, Landroidx/appcompat/widget/飘花落叶言子世楪兰哲苏;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    iget-object v6, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    iget-object v4, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 86
    .line 87
    iget-object v7, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰:Landroid/graphics/PorterDuff$Mode;

    .line 88
    .line 89
    invoke-static {v6, v5, v4, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    invoke-static {v6, v5, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    :cond_5
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲兰世()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {v5, v4}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰(I)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_9

    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_6

    .line 132
    .line 133
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏兰哲楪:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 134
    .line 135
    invoke-virtual {v2, p1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 136
    .line 137
    .line 138
    :cond_6
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏()Landroid/view/View$OnClickListener;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_7

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    :cond_7
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 163
    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    invoke-virtual {v3, p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(Landroid/widget/EditText;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲:Landroid/content/res/ColorStateList;

    .line 173
    .line 174
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰:Landroid/graphics/PorterDuff$Mode;

    .line 175
    .line 176
    invoke-static {v6, v5, p1, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(Z)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v2, "The current box background mode "

    .line 192
    .line 193
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v0, " is not supported by the end icon mode "

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p0

    .line 215
    :cond_a
    invoke-static {v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    throw p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

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
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏哲兰楪(Lcom/google/android/material/internal/CheckableImageButton;Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲()Landroid/view/View$OnFocusChangeListener;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲()Landroid/view/View$OnFocusChangeListener;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰()Landroid/view/View$OnFocusChangeListener;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰()Landroid/view/View$OnFocusChangeListener;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲楪兰:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v1

    .line 37
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    :cond_2
    move v1, v2

    .line 52
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏哲兰楪:Landroid/widget/EditText;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p1, 0x8

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏()V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世苏哲()Z

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/飘花落叶言子世楪兰哲苏;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 14
    .line 15
    invoke-static {p0, v0, p1, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
