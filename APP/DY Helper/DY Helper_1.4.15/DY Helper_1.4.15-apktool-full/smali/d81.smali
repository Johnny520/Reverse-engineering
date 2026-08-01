.class public final Ld81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/app/Activity;

.field public final β:Landroid/widget/LinearLayout;

.field public final γ:Landroid/widget/ImageView;

.field public final δ:Landroid/widget/ImageView;

.field public final ε:Landroid/widget/TextView;

.field public final ζ:Landroid/widget/ImageView;

.field public final η:Lxx;

.field public final θ:Lw01;

.field public ι:Ljava/lang/Object;

.field public κ:Ljava/util/List;

.field public λ:I

.field public μ:Z

.field public ν:Landroid/view/View;

.field public final ξ:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lxx;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ld81;->α:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p2, p0, Ld81;->β:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iput-object p3, p0, Ld81;->γ:Landroid/widget/ImageView;

    .line 15
    .line 16
    iput-object p4, p0, Ld81;->δ:Landroid/widget/ImageView;

    .line 17
    .line 18
    iput-object p5, p0, Ld81;->ε:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p6, p0, Ld81;->ζ:Landroid/widget/ImageView;

    .line 21
    .line 22
    iput-object p7, p0, Ld81;->η:Lxx;

    .line 23
    .line 24
    sget-object p2, Lx01;->α:Lx01;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lx01;->α(Landroid/content/Context;)Lw01;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Ld81;->θ:Lw01;

    .line 31
    .line 32
    sget-object p1, Ljz;->ε:Ljz;

    .line 33
    .line 34
    iput-object p1, p0, Ld81;->ι:Ljava/lang/Object;

    .line 35
    .line 36
    const-string p1, "operation_quick_actions"

    .line 37
    .line 38
    const-string p2, ""

    .line 39
    .line 40
    invoke-static {p1, p2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    const/4 p4, 0x0

    .line 49
    if-eqz p3, :cond_0

    .line 50
    .line 51
    sget-object p1, Lw71;->α:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {p1}, Lxh;->ｇ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    :try_start_0
    new-instance p3, Lorg/json/JSONArray;

    .line 59
    .line 60
    invoke-direct {p3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/16 p5, 0x18

    .line 68
    .line 69
    if-le p1, p5, :cond_1

    .line 70
    .line 71
    move p1, p5

    .line 72
    :cond_1
    new-instance p5, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p5, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    move p6, p4

    .line 78
    :goto_0
    if-ge p6, p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p3, p6, p2}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p7

    .line 84
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p7

    .line 91
    invoke-virtual {p7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p7

    .line 95
    invoke-virtual {p5, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    add-int/lit8 p6, p6, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    new-instance p5, Leo1;

    .line 103
    .line 104
    invoke-direct {p5, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    instance-of p1, p5, Leo1;

    .line 108
    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    const/4 p5, 0x0

    .line 112
    :cond_3
    move-object p1, p5

    .line 113
    check-cast p1, Ljava/util/List;

    .line 114
    .line 115
    if-nez p1, :cond_4

    .line 116
    .line 117
    sget-object p1, Lw71;->α:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {p1}, Lxh;->ｇ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-eqz p3, :cond_5

    .line 129
    .line 130
    sget-object p1, Lw71;->α:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {p1}, Lxh;->ｇ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    rem-int/lit8 p3, p3, 0x4

    .line 142
    .line 143
    if-eqz p3, :cond_6

    .line 144
    .line 145
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    :goto_2
    iput-object p1, p0, Ld81;->κ:Ljava/util/List;

    .line 150
    .line 151
    new-instance p1, Landroid/view/GestureDetector;

    .line 152
    .line 153
    iget-object p2, p0, Ld81;->α:Landroid/app/Activity;

    .line 154
    .line 155
    new-instance p3, Lc81;

    .line 156
    .line 157
    invoke-direct {p3, p0}, Lc81;-><init>(Ld81;)V

    .line 158
    .line 159
    .line 160
    invoke-direct {p1, p2, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Ld81;->ξ:Landroid/view/GestureDetector;

    .line 164
    .line 165
    iget-object p1, p0, Ld81;->γ:Landroid/widget/ImageView;

    .line 166
    .line 167
    const p2, 0x7f080095

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 171
    .line 172
    .line 173
    iget-object p2, p0, Ld81;->η:Lxx;

    .line 174
    .line 175
    iget-object p3, p2, Lxx;->η:Ljava/lang/String;

    .line 176
    .line 177
    iget-object p5, p2, Lxx;->Α:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result p6

    .line 183
    invoke-static {p6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 184
    .line 185
    .line 186
    move-result-object p6

    .line 187
    invoke-virtual {p1, p6}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 188
    .line 189
    .line 190
    const-string p6, "\u4e0a\u4e00\u7ec4\u5feb\u6377\u6309\u94ae"

    .line 191
    .line 192
    invoke-virtual {p1, p6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 193
    .line 194
    .line 195
    iget-object p6, p0, Ld81;->α:Landroid/app/Activity;

    .line 196
    .line 197
    const/16 p7, 0x8

    .line 198
    .line 199
    const-string v0, "#00000000"

    .line 200
    .line 201
    invoke-static {p7, p6, p5, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    new-instance v1, Lx71;

    .line 209
    .line 210
    invoke-direct {v1, p0, p4}, Lx71;-><init>(Ld81;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Ld81;->δ:Landroid/widget/ImageView;

    .line 217
    .line 218
    const p4, 0x7f080096

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 222
    .line 223
    .line 224
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result p4

    .line 228
    invoke-static {p4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 229
    .line 230
    .line 231
    move-result-object p4

    .line 232
    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 233
    .line 234
    .line 235
    const-string p4, "\u4e0b\u4e00\u7ec4\u5feb\u6377\u6309\u94ae"

    .line 236
    .line 237
    invoke-virtual {p1, p4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    invoke-static {p7, p6, p5, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 241
    .line 242
    .line 243
    move-result-object p4

    .line 244
    invoke-virtual {p1, p4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 245
    .line 246
    .line 247
    new-instance p4, Lx71;

    .line 248
    .line 249
    const/4 v1, 0x1

    .line 250
    invoke-direct {p4, p0, v1}, Lx71;-><init>(Ld81;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, Ld81;->ζ:Landroid/widget/ImageView;

    .line 257
    .line 258
    const p4, 0x7f08009a

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    move-result p3

    .line 268
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 273
    .line 274
    .line 275
    const-string p3, "\u81ea\u5b9a\u4e49\u5feb\u6377\u6309\u94ae"

    .line 276
    .line 277
    invoke-virtual {p1, p3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    invoke-static {p7, p6, p5, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 281
    .line 282
    .line 283
    move-result-object p3

    .line 284
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    .line 286
    .line 287
    new-instance p3, Lx71;

    .line 288
    .line 289
    const/4 p4, 0x2

    .line 290
    invoke-direct {p3, p0, p4}, Lx71;-><init>(Ld81;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    .line 295
    .line 296
    iget-object p1, p0, Ld81;->ε:Landroid/widget/TextView;

    .line 297
    .line 298
    iget-object p2, p2, Lxx;->θ:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result p2

    .line 304
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0}, Ld81;->γ()V

    .line 308
    .line 309
    .line 310
    return-void
.end method


# virtual methods
.method public final α(I)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ld81;->β()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ltz p1, :cond_5

    .line 9
    .line 10
    if-gt p1, v0, :cond_5

    .line 11
    .line 12
    iget v0, p0, Ld81;->λ:I

    .line 13
    .line 14
    if-eq p1, v0, :cond_5

    .line 15
    .line 16
    iget-boolean v3, p0, Ld81;->μ:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    if-le p1, v0, :cond_1

    .line 22
    .line 23
    move v2, v1

    .line 24
    :cond_1
    iget-object v0, p0, Ld81;->β:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-lez v3, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v4, 0x0

    .line 38
    :goto_0
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    const/16 v3, 0xf0

    .line 46
    .line 47
    iget-object v4, p0, Ld81;->α:Landroid/app/Activity;

    .line 48
    .line 49
    invoke-static {v4, v3}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    :goto_1
    int-to-float v3, v3

    .line 54
    const v4, 0x3e8f5c29    # 0.28f

    .line 55
    .line 56
    .line 57
    mul-float/2addr v3, v4

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    neg-float v3, v3

    .line 61
    :cond_4
    iput-boolean v1, p0, Ld81;->μ:Z

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-wide/16 v4, 0x6e

    .line 77
    .line 78
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v2, Ly71;

    .line 83
    .line 84
    invoke-direct {v2, p0, p1, v3}, Ly71;-><init>(Ld81;IF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :cond_5
    :goto_2
    return v2
.end method

.method public final β()I
    .locals 1

    .line 1
    iget-object p0, p0, Ld81;->κ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-int/lit8 p0, p0, 0x4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ge p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    return p0
.end method

.method public final γ()V
    .locals 20

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Ld81;->β()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v6, 0x1

    .line 8
    add-int/lit8 v7, v0, -0x1

    .line 9
    .line 10
    iget v0, v2, Ld81;->λ:I

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    invoke-static {v0, v8, v7}, Lj81;->μ(III)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, v2, Ld81;->λ:I

    .line 18
    .line 19
    const/4 v9, 0x4

    .line 20
    mul-int/lit8 v10, v0, 0x4

    .line 21
    .line 22
    iget-object v11, v2, Ld81;->β:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-virtual {v11}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 25
    .line 26
    .line 27
    move v12, v8

    .line 28
    :goto_0
    if-ge v12, v9, :cond_16

    .line 29
    .line 30
    add-int v3, v10, v12

    .line 31
    .line 32
    iget-object v1, v2, Ld81;->κ:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v3, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    :cond_0
    iget-object v4, v2, Ld81;->ι:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    move-object v14, v5

    .line 61
    check-cast v14, Ls71;

    .line 62
    .line 63
    iget-object v14, v14, Ls71;->α:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v14, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-eqz v14, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v5, 0x0

    .line 73
    :goto_1
    move-object v4, v5

    .line 74
    check-cast v4, Ls71;

    .line 75
    .line 76
    move-object v5, v1

    .line 77
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    move v14, v6

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move v14, v8

    .line 88
    :goto_2
    if-eqz v1, :cond_4

    .line 89
    .line 90
    const-string v5, "\u6dfb\u52a0"

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    if-eqz v4, :cond_5

    .line 94
    .line 95
    iget-object v5, v4, Ls71;->β:Ljava/lang/String;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-static {v5}, Lw71;->β(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    :goto_3
    if-eqz v1, :cond_6

    .line 103
    .line 104
    const v15, 0x7f080090

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    if-eqz v4, :cond_7

    .line 109
    .line 110
    iget v15, v4, Ls71;->γ:I

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    const v15, 0x7f0800a4

    .line 114
    .line 115
    .line 116
    :goto_4
    iget-object v9, v2, Ld81;->η:Lxx;

    .line 117
    .line 118
    if-nez v1, :cond_a

    .line 119
    .line 120
    if-nez v14, :cond_a

    .line 121
    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    iget-boolean v13, v4, Ls71;->ζ:Z

    .line 125
    .line 126
    if-ne v13, v6, :cond_8

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    if-eqz v4, :cond_9

    .line 130
    .line 131
    iget-object v13, v4, Ls71;->δ:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v13, :cond_b

    .line 134
    .line 135
    :cond_9
    iget-object v13, v9, Lxx;->χ:Ljava/lang/String;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    :goto_5
    iget-object v13, v9, Lxx;->χ:Ljava/lang/String;

    .line 139
    .line 140
    :cond_b
    :goto_6
    if-eqz v1, :cond_c

    .line 141
    .line 142
    iget-object v0, v9, Lxx;->ι:Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_c
    if-nez v14, :cond_f

    .line 146
    .line 147
    if-eqz v4, :cond_d

    .line 148
    .line 149
    iget-boolean v0, v4, Ls71;->ζ:Z

    .line 150
    .line 151
    if-ne v0, v6, :cond_d

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_d
    if-eqz v4, :cond_e

    .line 155
    .line 156
    iget-object v0, v4, Ls71;->ε:Ljava/lang/String;

    .line 157
    .line 158
    if-nez v0, :cond_10

    .line 159
    .line 160
    :cond_e
    iget-object v0, v9, Lxx;->φ:Ljava/lang/String;

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_f
    :goto_7
    iget-object v0, v9, Lxx;->φ:Ljava/lang/String;

    .line 164
    .line 165
    :cond_10
    :goto_8
    new-instance v8, Landroid/widget/LinearLayout;

    .line 166
    .line 167
    move-object/from16 v17, v0

    .line 168
    .line 169
    iget-object v0, v2, Ld81;->θ:Lw01;

    .line 170
    .line 171
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 175
    .line 176
    .line 177
    const/16 v6, 0x11

    .line 178
    .line 179
    invoke-virtual {v8, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 180
    .line 181
    .line 182
    const/16 v6, 0x44

    .line 183
    .line 184
    move/from16 v18, v3

    .line 185
    .line 186
    iget-object v3, v2, Ld81;->α:Landroid/app/Activity;

    .line 187
    .line 188
    invoke-static {v3, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    invoke-virtual {v8, v6}, Landroid/view/View;->setMinimumHeight(I)V

    .line 193
    .line 194
    .line 195
    iget-object v6, v9, Lxx;->Α:Ljava/lang/String;

    .line 196
    .line 197
    const-string v2, "#00000000"

    .line 198
    .line 199
    move/from16 v19, v10

    .line 200
    .line 201
    const/16 v10, 0x8

    .line 202
    .line 203
    invoke-static {v10, v3, v6, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v8, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 208
    .line 209
    .line 210
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 211
    .line 212
    const/16 v6, 0x48

    .line 213
    .line 214
    invoke-static {v3, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    move/from16 v16, v12

    .line 219
    .line 220
    const/high16 v10, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v12, 0x0

    .line 223
    invoke-direct {v2, v12, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 224
    .line 225
    .line 226
    const/4 v6, 0x1

    .line 227
    invoke-static {v3, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v3, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    .line 243
    .line 244
    new-instance v2, Landroid/widget/FrameLayout;

    .line 245
    .line 246
    invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    const/16 v6, 0x8

    .line 250
    .line 251
    invoke-static {v6, v3, v13}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 256
    .line 257
    .line 258
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 259
    .line 260
    const/16 v10, 0x26

    .line 261
    .line 262
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    invoke-direct {v6, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 271
    .line 272
    .line 273
    const/4 v10, 0x1

    .line 274
    iput v10, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 275
    .line 276
    invoke-virtual {v2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    .line 278
    .line 279
    new-instance v6, Landroid/widget/ImageView;

    .line 280
    .line 281
    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v6, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 285
    .line 286
    .line 287
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    invoke-virtual {v6, v10}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 296
    .line 297
    .line 298
    const/16 v10, 0x9

    .line 299
    .line 300
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 309
    .line 310
    .line 311
    move-result v15

    .line 312
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    invoke-virtual {v6, v12, v13, v15, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 317
    .line 318
    .line 319
    const/4 v10, 0x2

    .line 320
    invoke-virtual {v6, v10}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 321
    .line 322
    .line 323
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 324
    .line 325
    const/4 v13, -0x1

    .line 326
    invoke-direct {v12, v13, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 336
    .line 337
    .line 338
    new-instance v2, Landroid/widget/TextView;

    .line 339
    .line 340
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x41400000    # 12.0f

    .line 347
    .line 348
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 349
    .line 350
    .line 351
    const/16 v0, 0x11

    .line 352
    .line 353
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 354
    .line 355
    .line 356
    const/4 v6, 0x1

    .line 357
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 361
    .line 362
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 363
    .line 364
    .line 365
    if-nez v14, :cond_12

    .line 366
    .line 367
    if-eqz v4, :cond_11

    .line 368
    .line 369
    iget-boolean v0, v4, Ls71;->ζ:Z

    .line 370
    .line 371
    if-ne v0, v6, :cond_11

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_11
    iget-object v0, v9, Lxx;->ζ:Ljava/lang/String;

    .line 375
    .line 376
    :goto_9
    const/4 v6, 0x0

    .line 377
    goto :goto_b

    .line 378
    :cond_12
    :goto_a
    iget-object v0, v9, Lxx;->θ:Ljava/lang/String;

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :goto_b
    invoke-static {v0, v2, v6, v1}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 382
    .line 383
    .line 384
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    const/4 v6, 0x5

    .line 389
    invoke-static {v3, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    invoke-static {v3, v10}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    const/4 v12, 0x0

    .line 398
    invoke-virtual {v2, v0, v6, v3, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 399
    .line 400
    .line 401
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 402
    .line 403
    const/4 v3, -0x2

    .line 404
    invoke-direct {v0, v13, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 411
    .line 412
    .line 413
    if-eqz v1, :cond_13

    .line 414
    .line 415
    rem-int/lit8 v3, v18, 0x4

    .line 416
    .line 417
    const/4 v6, 0x1

    .line 418
    add-int/2addr v3, v6

    .line 419
    const-string v0, "\u6dfb\u52a0\u7b2c "

    .line 420
    .line 421
    const-string v2, " \u4e2a\u5feb\u6377\u6309\u94ae"

    .line 422
    .line 423
    invoke-static {v0, v3, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    goto :goto_c

    .line 428
    :cond_13
    const/4 v6, 0x1

    .line 429
    if-eqz v14, :cond_14

    .line 430
    .line 431
    const-string v0, "\uff0c\u5f53\u524d\u573a\u666f\u4e0d\u53ef\u7528"

    .line 432
    .line 433
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    goto :goto_c

    .line 438
    :cond_14
    if-eqz v4, :cond_15

    .line 439
    .line 440
    iget-boolean v0, v4, Ls71;->ζ:Z

    .line 441
    .line 442
    if-ne v0, v6, :cond_15

    .line 443
    .line 444
    const-string v0, "\uff0c\u5185\u6d4b\u529f\u80fd"

    .line 445
    .line 446
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    goto :goto_c

    .line 451
    :cond_15
    move-object v0, v5

    .line 452
    :goto_c
    invoke-virtual {v8, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 453
    .line 454
    .line 455
    new-instance v0, La81;

    .line 456
    .line 457
    move-object/from16 v2, p0

    .line 458
    .line 459
    move/from16 v3, v18

    .line 460
    .line 461
    invoke-direct/range {v0 .. v5}, La81;-><init>(ZLd81;ILs71;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 465
    .line 466
    .line 467
    new-instance v0, Lb81;

    .line 468
    .line 469
    invoke-direct {v0, v2, v3}, Lb81;-><init>(Ld81;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 473
    .line 474
    .line 475
    new-instance v0, Ljs;

    .line 476
    .line 477
    const/4 v6, 0x1

    .line 478
    invoke-direct {v0, v6, v2}, Ljs;-><init>(ILjava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 485
    .line 486
    .line 487
    add-int/lit8 v0, v16, 0x1

    .line 488
    .line 489
    move v8, v12

    .line 490
    move/from16 v10, v19

    .line 491
    .line 492
    const/4 v9, 0x4

    .line 493
    move v12, v0

    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_16
    move v12, v8

    .line 497
    const/high16 v10, 0x3f800000    # 1.0f

    .line 498
    .line 499
    iget v0, v2, Ld81;->λ:I

    .line 500
    .line 501
    add-int/2addr v0, v6

    .line 502
    invoke-virtual {v2}, Ld81;->β()I

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    new-instance v3, Ljava/lang/StringBuilder;

    .line 507
    .line 508
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v0, " / "

    .line 515
    .line 516
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iget-object v1, v2, Ld81;->ε:Landroid/widget/TextView;

    .line 527
    .line 528
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    .line 530
    .line 531
    iget v0, v2, Ld81;->λ:I

    .line 532
    .line 533
    if-lez v0, :cond_17

    .line 534
    .line 535
    move v0, v6

    .line 536
    goto :goto_d

    .line 537
    :cond_17
    move v0, v12

    .line 538
    :goto_d
    iget-object v1, v2, Ld81;->γ:Landroid/widget/ImageView;

    .line 539
    .line 540
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 541
    .line 542
    .line 543
    const v3, 0x3e8f5c29    # 0.28f

    .line 544
    .line 545
    .line 546
    if-eqz v0, :cond_18

    .line 547
    .line 548
    move v0, v10

    .line 549
    goto :goto_e

    .line 550
    :cond_18
    move v0, v3

    .line 551
    :goto_e
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 552
    .line 553
    .line 554
    iget v0, v2, Ld81;->λ:I

    .line 555
    .line 556
    if-ge v0, v7, :cond_19

    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_19
    move v6, v12

    .line 560
    :goto_f
    iget-object v0, v2, Ld81;->δ:Landroid/widget/ImageView;

    .line 561
    .line 562
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 563
    .line 564
    .line 565
    if-eqz v6, :cond_1a

    .line 566
    .line 567
    move v3, v10

    .line 568
    :cond_1a
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 569
    .line 570
    .line 571
    return-void
.end method

.method public final δ(I)V
    .locals 5

    .line 1
    rem-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Ld81;->κ:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p1, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Ld81;->ι:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v3, Luv;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-direct {v3, p1, v4, p0}, Luv;-><init>(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ld81;->α:Landroid/app/Activity;

    .line 26
    .line 27
    invoke-static {p0, v0, v1, v2, v3}, Lv71;->ρ(Landroid/app/Activity;ILjava/lang/String;Ljava/util/List;La80;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
