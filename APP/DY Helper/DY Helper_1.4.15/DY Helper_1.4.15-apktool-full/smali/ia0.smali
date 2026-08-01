.class public abstract Lia0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static α:Landroid/app/AlertDialog;

.field public static final β:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, 0x40400000    # 3.0f

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/high16 v3, 0x40800000    # 4.0f

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/high16 v4, 0x40a00000    # 5.0f

    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lia0;->β:Ljava/util/List;

    .line 40
    .line 41
    return-void
.end method

.method public static α(Landroid/view/View;Lxx;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lxx;->λ:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lxx;->η:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p1, Lxx;->ζ:Ljava/lang/String;

    .line 6
    .line 7
    instance-of v3, p0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-eqz v3, :cond_8

    .line 10
    .line 11
    instance-of v3, p0, Landroid/widget/Button;

    .line 12
    .line 13
    if-nez v3, :cond_8

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    check-cast v3, Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const v5, 0x7f090348

    .line 23
    .line 24
    .line 25
    if-ne v4, v5, :cond_1

    .line 26
    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const v5, 0x7f090343

    .line 30
    .line 31
    .line 32
    if-ne v4, v5, :cond_3

    .line 33
    .line 34
    :cond_2
    :goto_0
    move-object v0, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    const v5, 0x7f090367

    .line 37
    .line 38
    .line 39
    if-ne v4, v5, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    const v5, 0x7f090369

    .line 43
    .line 44
    .line 45
    if-ne v4, v5, :cond_5

    .line 46
    .line 47
    iget-object v0, p1, Lxx;->ρ:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    const v5, 0x7f09036e

    .line 51
    .line 52
    .line 53
    if-ne v4, v5, :cond_6

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_6
    const v0, 0x7f090347

    .line 57
    .line 58
    .line 59
    if-eq v4, v0, :cond_2

    .line 60
    .line 61
    const v0, 0x7f090345

    .line 62
    .line 63
    .line 64
    if-eq v4, v0, :cond_2

    .line 65
    .line 66
    const v0, 0x7f09031b

    .line 67
    .line 68
    .line 69
    if-eq v4, v0, :cond_2

    .line 70
    .line 71
    const v0, 0x7f09032f

    .line 72
    .line 73
    .line 74
    if-eq v4, v0, :cond_2

    .line 75
    .line 76
    const v0, 0x7f09034a

    .line 77
    .line 78
    .line 79
    if-ne v4, v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    const v0, 0x7f090344

    .line 83
    .line 84
    .line 85
    if-ne v4, v0, :cond_0

    .line 86
    .line 87
    iget-object v0, p1, Lxx;->Β:Ljava/lang/String;

    .line 88
    .line 89
    :goto_1
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 94
    .line 95
    .line 96
    :cond_8
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 97
    .line 98
    if-eqz v0, :cond_9

    .line 99
    .line 100
    check-cast p0, Landroid/view/ViewGroup;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v1, 0x0

    .line 107
    :goto_2
    if-ge v1, v0, :cond_9

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v2, p1}, Lia0;->α(Landroid/view/View;Lxx;)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_9
    return-void
.end method

.method public static β(Landroid/app/Activity;Lxx;FLjava/lang/String;)Lfa0;
    .locals 12

    .line 1
    iget-boolean v0, p1, Lxx;->α:Z

    .line 2
    .line 3
    const-string v1, "#339AF5"

    .line 4
    .line 5
    const-string v2, "#4AA3FF"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v3, v1

    .line 12
    :goto_0
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-static {p0, v4}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const/high16 v6, 0x41000000    # 8.0f

    .line 22
    .line 23
    invoke-static {p0, v6}, Lia0;->γ(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-virtual {v5, v7, v6, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v4}, Landroid/view/View;->setClickable(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 43
    .line 44
    .line 45
    const/16 v8, 0x10

    .line 46
    .line 47
    invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    new-instance v8, Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-direct {v8, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    const/high16 p3, 0x41500000    # 13.0f

    .line 59
    .line 60
    invoke-virtual {v8, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 64
    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    invoke-virtual {v8, p3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 68
    .line 69
    .line 70
    iget-object v9, p1, Lxx;->ζ:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 77
    .line 78
    .line 79
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 80
    .line 81
    const/4 v10, -0x2

    .line 82
    const/high16 v11, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-direct {v9, v7, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    .line 89
    .line 90
    new-instance v8, Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-direct {v8, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    const/high16 v9, 0x41400000    # 12.0f

    .line 96
    .line 97
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 101
    .line 102
    .line 103
    const/16 v9, 0x11

    .line 104
    .line 105
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, p3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 112
    .line 113
    .line 114
    const/high16 v3, 0x41100000    # 9.0f

    .line 115
    .line 116
    invoke-static {p0, v3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/high16 v10, 0x40800000    # 4.0f

    .line 121
    .line 122
    invoke-static {p0, v10}, Lia0;->γ(Landroid/content/Context;F)I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    invoke-static {p0, v3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-static {p0, v10}, Lia0;->γ(Landroid/content/Context;F)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    invoke-virtual {v8, v9, v11, v3, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 135
    .line 136
    .line 137
    iget-object v3, p1, Lxx;->μ:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    const/high16 v9, 0x42c60000    # 99.0f

    .line 144
    .line 145
    invoke-static {v9, v3, v8}, Lia0;->ε(FILandroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    sget-object v3, Lx01;->α:Lx01;

    .line 155
    .line 156
    invoke-virtual {v3, p0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const v6, 0x7f0c006b

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v6, v5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const v6, 0x7f090289

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, Landroid/widget/SeekBar;

    .line 175
    .line 176
    if-eqz v6, :cond_3

    .line 177
    .line 178
    if-eqz v0, :cond_1

    .line 179
    .line 180
    move-object v1, v2

    .line 181
    :cond_1
    :try_start_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v6, v0}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p1, Lxx;->χ:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {v6, p1}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, p3}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v4}, Landroid/view/View;->setHapticFeedbackEnabled(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    .line 210
    .line 211
    :catchall_0
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 212
    .line 213
    const/high16 p3, 0x42400000    # 48.0f

    .line 214
    .line 215
    invoke-static {p0, p3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 216
    .line 217
    .line 218
    move-result p3

    .line 219
    const/4 v0, -0x1

    .line 220
    invoke-direct {p1, v0, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 221
    .line 222
    .line 223
    const/high16 p3, 0x40000000    # 2.0f

    .line 224
    .line 225
    invoke-static {p0, p3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 226
    .line 227
    .line 228
    move-result p3

    .line 229
    iput p3, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 230
    .line 231
    invoke-virtual {v5, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    .line 233
    .line 234
    new-instance p1, Lfa0;

    .line 235
    .line 236
    invoke-direct {p1, v5, v8, v6}, Lfa0;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/SeekBar;)V

    .line 237
    .line 238
    .line 239
    sget-object p3, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 240
    .line 241
    invoke-static {p2}, Li2;->ψ(F)F

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    sget-object p3, Lcom/example/dyhelper/ui/GestureAreaView;->σ:Ljava/util/List;

    .line 246
    .line 247
    invoke-static {p3}, Lyh;->Λ(Ljava/util/List;)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    invoke-virtual {v6, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 252
    .line 253
    .line 254
    invoke-static {p2}, Li2;->ψ(F)F

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {p3, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 263
    .line 264
    .line 265
    move-result p3

    .line 266
    if-gez p3, :cond_2

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_2
    move v7, p3

    .line 270
    :goto_1
    invoke-virtual {v6, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 271
    .line 272
    .line 273
    sget-object p3, Lx01;->α:Lx01;

    .line 274
    .line 275
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    const v0, 0x7f0f0045

    .line 284
    .line 285
    .line 286
    invoke-virtual {p3, p0, v0, p2}, Lx01;->η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {v8, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    return-object p1

    .line 294
    :cond_3
    const-string p0, "\u500d\u901f\u6ed1\u5757 XML \u7f3a\u5c11 seek_gesture_speed"

    .line 295
    .line 296
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-object p3
.end method

.method public static γ(Landroid/content/Context;F)I
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

.method public static δ(Landroid/widget/TextView;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    .line 6
    .line 7
    const/16 p1, 0x11

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/high16 p3, 0x42c60000    # 99.0f

    .line 32
    .line 33
    invoke-static {p2, p3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    int-to-float p2, p2

    .line 38
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static ε(FILandroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {p1}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p0}, Lia0;->γ(Landroid/content/Context;F)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    int-to-float p0, p0

    .line 17
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static ζ(Landroid/view/View;IIF)V
    .locals 2

    .line 1
    invoke-static {p1}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x41200000    # 10.0f

    .line 13
    .line 14
    invoke-static {v0, v1}, Lia0;->γ(Landroid/content/Context;F)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    cmpl-float v0, p3, v0

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    invoke-virtual {p1, p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final η(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;)Z
    .locals 4

    .line 1
    const-string v0, "volume_key_enabled"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    const-string v0, "share_panel_enabled"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 20
    .line 21
    const-string v0, "\u6a21\u5757\u83dc\u5355"

    .line 22
    .line 23
    invoke-static {v0}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object p0, p0, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Iterable;

    .line 34
    .line 35
    instance-of v2, p0, Ljava/util/Collection;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    move-object v2, p0

    .line 40
    check-cast v2, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/Iterable;

    .line 70
    .line 71
    instance-of v3, v2, Ljava/util/Collection;

    .line 72
    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    move-object v3, v2

    .line 76
    check-cast v3, Ljava/util/Collection;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v3}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    :goto_1
    const-string p0, "\u8bf7\u81f3\u5c11\u4fdd\u7559\u97f3\u91cf\u952e\u3001\u5206\u4eab\u83dc\u5355\u6216\u624b\u52bf\u6a21\u5757\u83dc\u5355\u4e2d\u7684\u4e00\u4e2a\u5165\u53e3"

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 120
    .line 121
    .line 122
    return v0

    .line 123
    :cond_6
    :goto_2
    return v1
.end method

.method public static final θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    const/16 p1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p1, Lcom/example/dyhelper/ui/GestureAreaView;->λ:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {p0, p5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/util/Map;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object p0, p1

    .line 33
    :goto_0
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string v0, "double_tap"

    .line 38
    .line 39
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v0, p1

    .line 47
    :goto_1
    invoke-static {v0}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    const-string p1, "long_press"

    .line 54
    .line 55
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    move-object p1, p0

    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    :cond_3
    invoke-static {p1}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string p1, "\u533a\u57df\u540d\u79f0\uff1a"

    .line 67
    .line 68
    invoke-virtual {p1, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    const-string p1, "\u53cc\u51fb\u52a8\u4f5c\uff1a"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    const-string p1, "\u957f\u6309\u52a8\u4f5c\uff1a"

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static final ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/GestureAreaView;->γ(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "double_tap"

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->γ(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "long_press"

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/ui/GestureAreaView;->γ(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p4}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-gtz v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p0, p6, Lxx;->σ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    iget-object p1, p6, Lxx;->ρ:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const-string p2, "\u672a\u914d\u7f6e"

    .line 63
    .line 64
    invoke-static {p5, p2, p0, p1}, Lia0;->δ(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    const-string p0, "\u672a\u914d\u7f6e\u4efb\u4f55\u533a\u57df\u52a8\u4f5c\u65f6\uff0cFeed\u9875\u4e0d\u4f1a\u89e6\u53d1\u624b\u52bf\u529f\u80fd"

    .line 68
    .line 69
    invoke-virtual {p7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p1, "\u5df2\u914d\u7f6e "

    .line 74
    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p6, Lxx;->κ:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iget-object p2, p6, Lxx;->ι:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    const-string p3, "\u5df2\u542f\u7528"

    .line 93
    .line 94
    invoke-static {p5, p3, p0, p2}, Lia0;->δ(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    new-instance p0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, " \u4e2a\u52a8\u4f5c\uff0c\u4ec5\u5728Feed\u6d41\u89c6\u9891\u9875\u751f\u6548"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object p0, p6, Lxx;->χ:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    iget-object p2, p6, Lxx;->η:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    const-string p3, "\u672a\u542f\u7528"

    .line 134
    .line 135
    invoke-static {p5, p3, p0, p2}, Lia0;->δ(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 136
    .line 137
    .line 138
    new-instance p0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string p1, " \u4e2a\u52a8\u4f5c\uff0c\u4f46\u603b\u5f00\u5173\u672a\u5f00\u542f"

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public static κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;La80;)V
    .locals 48

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {v1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v3, v2, Lxx;->κ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v2, Lxx;->δ:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v2, Lxx;->θ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v2, Lxx;->η:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v2, Lxx;->ζ:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v2, Lxx;->ι:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v2, Lxx;->γ:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 22
    .line 23
    invoke-static/range {p2 .. p2}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 36
    .line 37
    const/high16 v11, 0x43820000    # 260.0f

    .line 38
    .line 39
    invoke-static {v1, v11}, Lia0;->γ(Landroid/content/Context;F)I

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    int-to-float v0, v0

    .line 44
    const v12, 0x3ee66666    # 0.45f

    .line 45
    .line 46
    .line 47
    mul-float v13, v0, v12

    .line 48
    .line 49
    float-to-int v13, v13

    .line 50
    if-le v11, v13, :cond_0

    .line 51
    .line 52
    move v11, v13

    .line 53
    :cond_0
    const v13, 0x3f1eb852    # 0.62f

    .line 54
    .line 55
    .line 56
    mul-float/2addr v0, v13

    .line 57
    float-to-int v0, v0

    .line 58
    const/high16 v13, 0x440c0000    # 560.0f

    .line 59
    .line 60
    invoke-static {v1, v13}, Lia0;->γ(Landroid/content/Context;F)I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    if-le v0, v13, :cond_1

    .line 65
    .line 66
    move v0, v13

    .line 67
    :cond_1
    if-ge v0, v11, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v11, v0

    .line 71
    :goto_0
    const/4 v13, 0x1

    .line 72
    invoke-static {v1, v13}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    const/high16 v15, 0x41200000    # 10.0f

    .line 77
    .line 78
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/high16 v12, 0x41000000    # 8.0f

    .line 83
    .line 84
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    move-object/from16 v17, v3

    .line 93
    .line 94
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v14, v0, v13, v12, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v2, Lxx;->β:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/high16 v3, 0x41600000    # 14.0f

    .line 108
    .line 109
    invoke-static {v3, v0, v14}, Lia0;->ε(FILandroid/view/View;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Landroid/widget/FrameLayout;

    .line 113
    .line 114
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    const/high16 v3, 0x40800000    # 4.0f

    .line 118
    .line 119
    invoke-static {v1, v3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    invoke-static {v1, v3}, Lia0;->γ(Landroid/content/Context;F)I

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-virtual {v0, v12, v3, v13, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 129
    .line 130
    .line 131
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-static {v15, v12, v0}, Lia0;->ε(FILandroid/view/View;)V

    .line 136
    .line 137
    .line 138
    new-instance v12, Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-direct {v12, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 141
    .line 142
    .line 143
    const-string v13, "\u9009\u62e9"

    .line 144
    .line 145
    move-object/from16 v15, p1

    .line 146
    .line 147
    invoke-virtual {v13, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    const/high16 v13, 0x41700000    # 15.0f

    .line 155
    .line 156
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 157
    .line 158
    .line 159
    sget-object v13, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 160
    .line 161
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 169
    .line 170
    .line 171
    const/16 v13, 0x11

    .line 172
    .line 173
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 177
    .line 178
    .line 179
    const/4 v15, 0x1

    .line 180
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 181
    .line 182
    .line 183
    const/high16 v15, 0x428c0000    # 70.0f

    .line 184
    .line 185
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    invoke-virtual {v12, v13, v3, v15, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 194
    .line 195
    .line 196
    const-string v13, "\u53d6\u6d88"

    .line 197
    .line 198
    const/high16 v15, 0x41500000    # 13.0f

    .line 199
    .line 200
    invoke-static {v1, v13, v15}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 209
    .line 210
    .line 211
    const/16 v15, 0x11

    .line 212
    .line 213
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v18, v4

    .line 220
    .line 221
    const/high16 v15, 0x41000000    # 8.0f

    .line 222
    .line 223
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    move-object/from16 v19, v5

    .line 228
    .line 229
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    invoke-virtual {v13, v4, v3, v5, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 234
    .line 235
    .line 236
    const/4 v15, 0x1

    .line 237
    invoke-virtual {v13, v15}, Landroid/view/View;->setClickable(Z)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v13, v15}, Landroid/view/View;->setFocusable(Z)V

    .line 241
    .line 242
    .line 243
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 244
    .line 245
    const/4 v5, -0x1

    .line 246
    const/16 v15, 0x11

    .line 247
    .line 248
    invoke-direct {v4, v5, v5, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    .line 253
    .line 254
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 255
    .line 256
    const/high16 v12, 0x42800000    # 64.0f

    .line 257
    .line 258
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    const v15, 0x800013

    .line 263
    .line 264
    .line 265
    invoke-direct {v4, v12, v5, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 269
    .line 270
    .line 271
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 272
    .line 273
    const/high16 v12, 0x42280000    # 42.0f

    .line 274
    .line 275
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 276
    .line 277
    .line 278
    move-result v12

    .line 279
    invoke-direct {v4, v5, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v14, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 283
    .line 284
    .line 285
    new-instance v0, Landroid/widget/TextView;

    .line 286
    .line 287
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 288
    .line 289
    .line 290
    const-string v4, "\u4e0a\u4e0b\u6ed1\u52a8\u67e5\u770b\u66f4\u591a\u52a8\u4f5c\uff0c\u70b9\u51fb\u540e\u7acb\u5373\u4fdd\u5b58"

    .line 291
    .line 292
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41280000    # 10.5f

    .line 296
    .line 297
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 298
    .line 299
    .line 300
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 305
    .line 306
    .line 307
    const/16 v15, 0x11

    .line 308
    .line 309
    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 313
    .line 314
    .line 315
    const/high16 v15, 0x41000000    # 8.0f

    .line 316
    .line 317
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    const/high16 v12, 0x40c00000    # 6.0f

    .line 322
    .line 323
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    const/high16 v15, 0x40000000    # 2.0f

    .line 332
    .line 333
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-virtual {v0, v4, v3, v12, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 338
    .line 339
    .line 340
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 341
    .line 342
    const/4 v4, -0x2

    .line 343
    const/4 v5, -0x1

    .line 344
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v14, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 348
    .line 349
    .line 350
    new-instance v3, Landroid/widget/ScrollView;

    .line 351
    .line 352
    invoke-direct {v3, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 353
    .line 354
    .line 355
    const/4 v5, 0x0

    .line 356
    invoke-virtual {v3, v5}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 357
    .line 358
    .line 359
    const/4 v12, 0x1

    .line 360
    invoke-virtual {v3, v12}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v12}, Landroid/view/View;->setOverScrollMode(I)V

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x1000000

    .line 367
    .line 368
    invoke-virtual {v3, v0}, Landroid/view/View;->setScrollBarStyle(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40800000    # 4.0f

    .line 375
    .line 376
    invoke-static {v1, v0}, Lia0;->γ(Landroid/content/Context;F)I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    invoke-virtual {v3, v5, v5, v5, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 381
    .line 382
    .line 383
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    const/high16 v5, 0x41200000    # 10.0f

    .line 388
    .line 389
    invoke-static {v5, v0, v3}, Lia0;->ε(FILandroid/view/View;)V

    .line 390
    .line 391
    .line 392
    new-instance v5, Landroid/widget/LinearLayout;

    .line 393
    .line 394
    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 398
    .line 399
    .line 400
    const/high16 v12, 0x40c00000    # 6.0f

    .line 401
    .line 402
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 407
    .line 408
    .line 409
    move-result v15

    .line 410
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    move-object/from16 v20, v6

    .line 415
    .line 416
    const/high16 v12, 0x41000000    # 8.0f

    .line 417
    .line 418
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 419
    .line 420
    .line 421
    move-result v6

    .line 422
    invoke-virtual {v5, v0, v15, v4, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 423
    .line 424
    .line 425
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 426
    .line 427
    const/4 v4, -0x2

    .line 428
    const/4 v6, -0x1

    .line 429
    invoke-direct {v0, v6, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v5, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 433
    .line 434
    .line 435
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 436
    .line 437
    invoke-direct {v0, v6, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 438
    .line 439
    .line 440
    invoke-static {v1, v12}, Lia0;->γ(Landroid/content/Context;F)I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    iput v4, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 445
    .line 446
    invoke-virtual {v14, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 447
    .line 448
    .line 449
    new-instance v4, Lum1;

    .line 450
    .line 451
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 452
    .line 453
    .line 454
    new-instance v6, Lrm1;

    .line 455
    .line 456
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 457
    .line 458
    .line 459
    const-string v0, "gesture_video_speed"

    .line 460
    .line 461
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    const/high16 v12, 0x40000000    # 2.0f

    .line 466
    .line 467
    invoke-interface {v11, v0, v12}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 468
    .line 469
    .line 470
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    move v12, v0

    .line 472
    goto :goto_1

    .line 473
    :catchall_0
    const/high16 v12, 0x40000000    # 2.0f

    .line 474
    .line 475
    :goto_1
    invoke-static {v12}, Li2;->ψ(F)F

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    iput v0, v6, Lrm1;->ε:F

    .line 480
    .line 481
    const-string v11, "\u65e0"

    .line 482
    .line 483
    const-string v12, "\u53d1\u5e03\u6309\u94ae"

    .line 484
    .line 485
    const-string v15, "\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 486
    .line 487
    move-object/from16 v21, v7

    .line 488
    .line 489
    const-string v7, "\u4fee\u6539\u500d\u901f"

    .line 490
    .line 491
    move-object/from16 v22, v8

    .line 492
    .line 493
    const-string v8, "\u4e0d\u611f\u5174\u8da3"

    .line 494
    .line 495
    filled-new-array {v11, v12, v15, v7, v8}, [Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    move-object/from16 v23, v9

    .line 504
    .line 505
    new-instance v9, Ll91;

    .line 506
    .line 507
    move-object/from16 v24, v3

    .line 508
    .line 509
    const-string v3, "\u57fa\u7840\u52a8\u4f5c"

    .line 510
    .line 511
    invoke-direct {v9, v3, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->τ:Ljava/util/List;

    .line 515
    .line 516
    new-instance v3, Ll91;

    .line 517
    .line 518
    move-object/from16 v25, v13

    .line 519
    .line 520
    const-string v13, "\u4f5c\u54c1\u4e92\u52a8"

    .line 521
    .line 522
    invoke-direct {v3, v13, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    const-string v13, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 526
    .line 527
    move-object/from16 v26, v14

    .line 528
    .line 529
    const-string v14, "\u6dfb\u52a0\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e"

    .line 530
    .line 531
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    move-object/from16 v27, v4

    .line 540
    .line 541
    new-instance v4, Ll91;

    .line 542
    .line 543
    move-object/from16 v28, v6

    .line 544
    .line 545
    const-string v6, "\u4e66\u7b7e"

    .line 546
    .line 547
    invoke-direct {v4, v6, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    const-string v6, "\u4e00\u952e\u5df2\u8bfb"

    .line 551
    .line 552
    move-object/from16 v29, v15

    .line 553
    .line 554
    const-string v15, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 555
    .line 556
    move-object/from16 v30, v8

    .line 557
    .line 558
    const-string v8, "\u6e05\u723d\u6a21\u5f0f\u5f00\u5173"

    .line 559
    .line 560
    move-object/from16 v31, v12

    .line 561
    .line 562
    const-string v12, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 563
    .line 564
    move-object/from16 v32, v13

    .line 565
    .line 566
    const-string v13, "\u6a21\u5757\u83dc\u5355"

    .line 567
    .line 568
    filled-new-array {v6, v15, v8, v12, v13}, [Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    move-object/from16 v33, v15

    .line 577
    .line 578
    new-instance v15, Ll91;

    .line 579
    .line 580
    move-object/from16 v34, v6

    .line 581
    .line 582
    const-string v6, "\u5de5\u5177\u80fd\u529b"

    .line 583
    .line 584
    invoke-direct {v15, v6, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    filled-new-array {v9, v3, v4, v15}, [Ll91;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    new-instance v3, Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v6

    .line 608
    if-eqz v6, :cond_3

    .line 609
    .line 610
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    check-cast v6, Ll91;

    .line 615
    .line 616
    iget-object v6, v6, Ll91;->ζ:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v6, Ljava/lang/Iterable;

    .line 619
    .line 620
    invoke-static {v3, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 621
    .line 622
    .line 623
    goto :goto_2

    .line 624
    :cond_3
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    sget-object v4, Lcom/example/dyhelper/ui/GestureAreaView;->υ:Ljava/util/List;

    .line 629
    .line 630
    new-instance v6, Ljava/util/ArrayList;

    .line 631
    .line 632
    const/16 v9, 0xa

    .line 633
    .line 634
    invoke-static {v4, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 635
    .line 636
    .line 637
    move-result v15

    .line 638
    invoke-direct {v6, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 646
    .line 647
    .line 648
    move-result v15

    .line 649
    if-eqz v15, :cond_4

    .line 650
    .line 651
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v15

    .line 655
    check-cast v15, Ljava/lang/String;

    .line 656
    .line 657
    sget-object v35, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 658
    .line 659
    invoke-static {v15}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v15

    .line 663
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    goto :goto_3

    .line 667
    :cond_4
    invoke-static {v6}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    new-instance v6, Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 678
    .line 679
    .line 680
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v15

    .line 688
    if-eqz v15, :cond_6

    .line 689
    .line 690
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v15

    .line 694
    move-object v9, v15

    .line 695
    check-cast v9, Ljava/lang/String;

    .line 696
    .line 697
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v9

    .line 701
    if-nez v9, :cond_5

    .line 702
    .line 703
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    :cond_5
    const/16 v9, 0xa

    .line 707
    .line 708
    goto :goto_4

    .line 709
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    if-nez v3, :cond_7

    .line 714
    .line 715
    new-instance v3, Ll91;

    .line 716
    .line 717
    const-string v4, "\u5176\u4ed6\u52a8\u4f5c"

    .line 718
    .line 719
    invoke-direct {v3, v4, v6}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    invoke-static {v3, v0}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    const/4 v0, 0x0

    .line 731
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v6

    .line 735
    if-eqz v6, :cond_31

    .line 736
    .line 737
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    check-cast v6, Ll91;

    .line 742
    .line 743
    iget-object v15, v6, Ll91;->ζ:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v15, Ljava/lang/Iterable;

    .line 746
    .line 747
    new-instance v4, Ljava/util/ArrayList;

    .line 748
    .line 749
    move-object/from16 v36, v3

    .line 750
    .line 751
    const/16 v9, 0xa

    .line 752
    .line 753
    invoke-static {v15, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 758
    .line 759
    .line 760
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v9

    .line 768
    if-eqz v9, :cond_8

    .line 769
    .line 770
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v9

    .line 774
    check-cast v9, Ljava/lang/String;

    .line 775
    .line 776
    sget-object v15, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 777
    .line 778
    invoke-static {v9}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v9

    .line 782
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    goto :goto_6

    .line 786
    :cond_8
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    new-instance v4, Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v9

    .line 807
    if-eqz v9, :cond_b

    .line 808
    .line 809
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v9

    .line 813
    move-object v15, v9

    .line 814
    check-cast v15, Ljava/lang/String;

    .line 815
    .line 816
    move-object/from16 v37, v3

    .line 817
    .line 818
    sget-object v3, Lcom/example/dyhelper/ui/GestureAreaView;->υ:Ljava/util/List;

    .line 819
    .line 820
    move-object/from16 v38, v0

    .line 821
    .line 822
    new-instance v0, Ljava/util/ArrayList;

    .line 823
    .line 824
    move-object/from16 v35, v8

    .line 825
    .line 826
    move-object/from16 v39, v13

    .line 827
    .line 828
    const/16 v13, 0xa

    .line 829
    .line 830
    invoke-static {v3, v13}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 831
    .line 832
    .line 833
    move-result v8

    .line 834
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 835
    .line 836
    .line 837
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 842
    .line 843
    .line 844
    move-result v8

    .line 845
    if-eqz v8, :cond_9

    .line 846
    .line 847
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    check-cast v8, Ljava/lang/String;

    .line 852
    .line 853
    sget-object v40, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 854
    .line 855
    invoke-static {v8}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v8

    .line 859
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    goto :goto_8

    .line 863
    :cond_9
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-eqz v0, :cond_a

    .line 868
    .line 869
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    :cond_a
    move-object/from16 v8, v35

    .line 873
    .line 874
    move-object/from16 v3, v37

    .line 875
    .line 876
    move-object/from16 v0, v38

    .line 877
    .line 878
    move-object/from16 v13, v39

    .line 879
    .line 880
    goto :goto_7

    .line 881
    :cond_b
    move-object/from16 v38, v0

    .line 882
    .line 883
    move-object/from16 v35, v8

    .line 884
    .line 885
    move-object/from16 v39, v13

    .line 886
    .line 887
    const/16 v13, 0xa

    .line 888
    .line 889
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    if-nez v0, :cond_30

    .line 894
    .line 895
    iget-object v0, v6, Ll91;->ε:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v0, Ljava/lang/String;

    .line 898
    .line 899
    const/high16 v3, 0x41300000    # 11.0f

    .line 900
    .line 901
    invoke-static {v1, v0, v3}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 906
    .line 907
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 908
    .line 909
    .line 910
    invoke-static/range {v20 .. v20}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 911
    .line 912
    .line 913
    move-result v6

    .line 914
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 915
    .line 916
    .line 917
    const/4 v6, 0x0

    .line 918
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 919
    .line 920
    .line 921
    const/high16 v6, 0x40c00000    # 6.0f

    .line 922
    .line 923
    invoke-static {v1, v6}, Lia0;->γ(Landroid/content/Context;F)I

    .line 924
    .line 925
    .line 926
    move-result v8

    .line 927
    const/high16 v15, 0x41000000    # 8.0f

    .line 928
    .line 929
    invoke-static {v1, v15}, Lia0;->γ(Landroid/content/Context;F)I

    .line 930
    .line 931
    .line 932
    move-result v9

    .line 933
    invoke-static {v1, v6}, Lia0;->γ(Landroid/content/Context;F)I

    .line 934
    .line 935
    .line 936
    move-result v15

    .line 937
    const/high16 v6, 0x40400000    # 3.0f

    .line 938
    .line 939
    invoke-static {v1, v6}, Lia0;->γ(Landroid/content/Context;F)I

    .line 940
    .line 941
    .line 942
    move-result v13

    .line 943
    invoke-virtual {v0, v8, v9, v15, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 944
    .line 945
    .line 946
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 947
    .line 948
    const/4 v9, -0x2

    .line 949
    const/4 v13, -0x1

    .line 950
    invoke-direct {v8, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v5, v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    move-object/from16 v0, v38

    .line 961
    .line 962
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 963
    .line 964
    .line 965
    move-result v8

    .line 966
    if-eqz v8, :cond_2f

    .line 967
    .line 968
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v8

    .line 972
    check-cast v8, Ljava/lang/String;

    .line 973
    .line 974
    invoke-static {v8, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v9

    .line 978
    const/high16 v15, 0x3f800000    # 1.0f

    .line 979
    .line 980
    if-eqz v9, :cond_11

    .line 981
    .line 982
    const-string v9, "global_video_speed"

    .line 983
    .line 984
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 985
    .line 986
    .line 987
    move-result-object v3

    .line 988
    invoke-interface {v3, v9, v15}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 989
    .line 990
    .line 991
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 992
    goto :goto_a

    .line 993
    :catchall_1
    move v3, v15

    .line 994
    :goto_a
    sget-object v9, Lia0;->β:Ljava/util/List;

    .line 995
    .line 996
    invoke-static {v9}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 997
    .line 998
    .line 999
    move-result-object v41

    .line 1000
    invoke-virtual/range {v41 .. v41}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v41

    .line 1004
    move-object/from16 v15, v41

    .line 1005
    .line 1006
    check-cast v15, Lwm0;

    .line 1007
    .line 1008
    iget-boolean v6, v15, Lwm0;->η:Z

    .line 1009
    .line 1010
    if-nez v6, :cond_c

    .line 1011
    .line 1012
    move-object/from16 v45, v0

    .line 1013
    .line 1014
    const/4 v6, 0x0

    .line 1015
    goto :goto_c

    .line 1016
    :cond_c
    invoke-virtual {v15}, Lwm0;->next()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v6

    .line 1020
    iget-boolean v13, v15, Lwm0;->η:Z

    .line 1021
    .line 1022
    if-nez v13, :cond_d

    .line 1023
    .line 1024
    move-object/from16 v45, v0

    .line 1025
    .line 1026
    goto :goto_c

    .line 1027
    :cond_d
    move-object v13, v6

    .line 1028
    check-cast v13, Ljava/lang/Number;

    .line 1029
    .line 1030
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1031
    .line 1032
    .line 1033
    move-result v13

    .line 1034
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v13

    .line 1038
    check-cast v13, Ljava/lang/Number;

    .line 1039
    .line 1040
    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    .line 1041
    .line 1042
    .line 1043
    move-result v13

    .line 1044
    sub-float/2addr v13, v3

    .line 1045
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 1046
    .line 1047
    .line 1048
    move-result v13

    .line 1049
    :goto_b
    invoke-virtual {v15}, Lwm0;->next()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v43

    .line 1053
    move-object/from16 v44, v43

    .line 1054
    .line 1055
    check-cast v44, Ljava/lang/Number;

    .line 1056
    .line 1057
    move-object/from16 v45, v0

    .line 1058
    .line 1059
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Number;->intValue()I

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    check-cast v0, Ljava/lang/Number;

    .line 1068
    .line 1069
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1070
    .line 1071
    .line 1072
    move-result v0

    .line 1073
    sub-float/2addr v0, v3

    .line 1074
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    invoke-static {v13, v0}, Ljava/lang/Float;->compare(FF)I

    .line 1079
    .line 1080
    .line 1081
    move-result v44

    .line 1082
    if-lez v44, :cond_e

    .line 1083
    .line 1084
    move v13, v0

    .line 1085
    move-object/from16 v6, v43

    .line 1086
    .line 1087
    :cond_e
    iget-boolean v0, v15, Lwm0;->η:Z

    .line 1088
    .line 1089
    if-nez v0, :cond_10

    .line 1090
    .line 1091
    :goto_c
    check-cast v6, Ljava/lang/Integer;

    .line 1092
    .line 1093
    if-eqz v6, :cond_f

    .line 1094
    .line 1095
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1096
    .line 1097
    .line 1098
    move-result v0

    .line 1099
    goto :goto_d

    .line 1100
    :cond_f
    const/4 v0, 0x0

    .line 1101
    :goto_d
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    check-cast v3, Ljava/lang/Number;

    .line 1106
    .line 1107
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 1108
    .line 1109
    .line 1110
    move-result v3

    .line 1111
    const-string v6, "\u5168\u5c40\u89c6\u9891\u500d\u901f"

    .line 1112
    .line 1113
    invoke-static {v1, v2, v3, v6}, Lia0;->β(Landroid/app/Activity;Lxx;FLjava/lang/String;)Lfa0;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v3

    .line 1117
    iget-object v6, v3, Lfa0;->α:Landroid/widget/LinearLayout;

    .line 1118
    .line 1119
    iget-object v13, v3, Lfa0;->γ:Landroid/widget/SeekBar;

    .line 1120
    .line 1121
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1122
    .line 1123
    .line 1124
    move-result v15

    .line 1125
    move-object/from16 v43, v4

    .line 1126
    .line 1127
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1128
    .line 1129
    .line 1130
    move-result v4

    .line 1131
    move-object/from16 v44, v8

    .line 1132
    .line 1133
    const/4 v8, 0x0

    .line 1134
    invoke-static {v6, v15, v4, v8}, Lia0;->ζ(Landroid/view/View;IIF)V

    .line 1135
    .line 1136
    .line 1137
    const/high16 v4, 0x41400000    # 12.0f

    .line 1138
    .line 1139
    invoke-static {v1, v4}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1140
    .line 1141
    .line 1142
    move-result v15

    .line 1143
    move-object/from16 v46, v2

    .line 1144
    .line 1145
    const/high16 v8, 0x41100000    # 9.0f

    .line 1146
    .line 1147
    invoke-static {v1, v8}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    move-object/from16 v47, v7

    .line 1152
    .line 1153
    invoke-static {v1, v4}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1154
    .line 1155
    .line 1156
    move-result v7

    .line 1157
    invoke-static {v1, v8}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    invoke-virtual {v6, v15, v2, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 1162
    .line 1163
    .line 1164
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1165
    .line 1166
    .line 1167
    move-result v2

    .line 1168
    const/16 v16, 0x1

    .line 1169
    .line 1170
    add-int/lit8 v2, v2, -0x1

    .line 1171
    .line 1172
    invoke-virtual {v13, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v13, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1176
    .line 1177
    .line 1178
    iget-object v2, v3, Lfa0;->β:Landroid/widget/TextView;

    .line 1179
    .line 1180
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    check-cast v4, Ljava/lang/Number;

    .line 1185
    .line 1186
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    float-to-int v4, v4

    .line 1191
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1197
    .line 1198
    .line 1199
    const-string v4, "x"

    .line 1200
    .line 1201
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v4

    .line 1208
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1209
    .line 1210
    .line 1211
    new-instance v2, Lha0;

    .line 1212
    .line 1213
    invoke-direct {v2, v3, v0}, Lha0;-><init>(Lfa0;I)V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v13, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1217
    .line 1218
    .line 1219
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1220
    .line 1221
    const/4 v4, -0x2

    .line 1222
    const/4 v13, -0x1

    .line 1223
    invoke-direct {v0, v13, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1224
    .line 1225
    .line 1226
    const/high16 v2, 0x40c00000    # 6.0f

    .line 1227
    .line 1228
    invoke-static {v1, v2}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1229
    .line 1230
    .line 1231
    move-result v3

    .line 1232
    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1233
    .line 1234
    invoke-virtual {v5, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_e

    .line 1238
    :cond_10
    move-object/from16 v0, v45

    .line 1239
    .line 1240
    goto/16 :goto_b

    .line 1241
    .line 1242
    :cond_11
    move-object/from16 v45, v0

    .line 1243
    .line 1244
    move-object/from16 v46, v2

    .line 1245
    .line 1246
    move-object/from16 v43, v4

    .line 1247
    .line 1248
    move-object/from16 v47, v7

    .line 1249
    .line 1250
    move-object/from16 v44, v8

    .line 1251
    .line 1252
    :goto_e
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 1253
    .line 1254
    invoke-static/range {v44 .. v44}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v2

    .line 1258
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    const/4 v15, 0x1

    .line 1263
    invoke-static {v1, v15}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v3

    .line 1267
    const/high16 v4, 0x42580000    # 54.0f

    .line 1268
    .line 1269
    invoke-static {v1, v4}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1270
    .line 1271
    .line 1272
    move-result v4

    .line 1273
    invoke-virtual {v3, v4}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1274
    .line 1275
    .line 1276
    const/high16 v4, 0x41400000    # 12.0f

    .line 1277
    .line 1278
    invoke-static {v1, v4}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1279
    .line 1280
    .line 1281
    move-result v6

    .line 1282
    const/high16 v8, 0x41100000    # 9.0f

    .line 1283
    .line 1284
    invoke-static {v1, v8}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1285
    .line 1286
    .line 1287
    move-result v7

    .line 1288
    invoke-static {v1, v4}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1289
    .line 1290
    .line 1291
    move-result v4

    .line 1292
    invoke-static {v1, v8}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1293
    .line 1294
    .line 1295
    move-result v8

    .line 1296
    invoke-virtual {v3, v6, v7, v4, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v3, v15}, Landroid/view/View;->setClickable(Z)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v3, v15}, Landroid/view/View;->setFocusable(Z)V

    .line 1303
    .line 1304
    .line 1305
    if-eqz v0, :cond_12

    .line 1306
    .line 1307
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1308
    .line 1309
    .line 1310
    move-result v4

    .line 1311
    goto :goto_f

    .line 1312
    :cond_12
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    :goto_f
    if-eqz v0, :cond_13

    .line 1317
    .line 1318
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1319
    .line 1320
    .line 1321
    move-result v6

    .line 1322
    goto :goto_10

    .line 1323
    :cond_13
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1324
    .line 1325
    .line 1326
    move-result v6

    .line 1327
    :goto_10
    if-eqz v0, :cond_14

    .line 1328
    .line 1329
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1330
    .line 1331
    goto :goto_11

    .line 1332
    :cond_14
    const/4 v13, 0x0

    .line 1333
    :goto_11
    invoke-static {v3, v4, v6, v13}, Lia0;->ζ(Landroid/view/View;IIF)V

    .line 1334
    .line 1335
    .line 1336
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1337
    .line 1338
    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1339
    .line 1340
    .line 1341
    const/4 v6, 0x0

    .line 1342
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1343
    .line 1344
    .line 1345
    const/16 v6, 0x10

    .line 1346
    .line 1347
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1348
    .line 1349
    .line 1350
    new-instance v7, Landroid/widget/LinearLayout;

    .line 1351
    .line 1352
    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1353
    .line 1354
    .line 1355
    const/4 v15, 0x1

    .line 1356
    invoke-virtual {v7, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1360
    .line 1361
    .line 1362
    new-instance v6, Landroid/widget/TextView;

    .line 1363
    .line 1364
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v8

    .line 1371
    if-eqz v8, :cond_15

    .line 1372
    .line 1373
    const-string v8, "\u4e0d\u89e6\u53d1"

    .line 1374
    .line 1375
    goto :goto_12

    .line 1376
    :cond_15
    move-object v8, v2

    .line 1377
    :goto_12
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1378
    .line 1379
    .line 1380
    const/high16 v8, 0x41580000    # 13.5f

    .line 1381
    .line 1382
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1383
    .line 1384
    .line 1385
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1386
    .line 1387
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1388
    .line 1389
    .line 1390
    if-eqz v0, :cond_16

    .line 1391
    .line 1392
    move-object/from16 v9, v22

    .line 1393
    .line 1394
    goto :goto_13

    .line 1395
    :cond_16
    move-object/from16 v9, v21

    .line 1396
    .line 1397
    :goto_13
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1398
    .line 1399
    .line 1400
    move-result v9

    .line 1401
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1402
    .line 1403
    .line 1404
    const/4 v9, 0x0

    .line 1405
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1406
    .line 1407
    .line 1408
    const/4 v15, 0x1

    .line 1409
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1410
    .line 1411
    .line 1412
    new-instance v9, Landroid/widget/TextView;

    .line 1413
    .line 1414
    invoke-direct {v9, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1415
    .line 1416
    .line 1417
    invoke-static {v2}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v13

    .line 1421
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 1422
    .line 1423
    .line 1424
    move-result v15

    .line 1425
    sparse-switch v15, :sswitch_data_0

    .line 1426
    .line 1427
    .line 1428
    :goto_14
    move-object/from16 v42, v11

    .line 1429
    .line 1430
    move-object/from16 v15, v32

    .line 1431
    .line 1432
    move-object/from16 v11, v33

    .line 1433
    .line 1434
    move-object/from16 v41, v35

    .line 1435
    .line 1436
    move/from16 v35, v0

    .line 1437
    .line 1438
    move-object/from16 v32, v10

    .line 1439
    .line 1440
    :goto_15
    move-object/from16 v10, v47

    .line 1441
    .line 1442
    goto/16 :goto_27

    .line 1443
    .line 1444
    :sswitch_0
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    move-result v13

    .line 1448
    if-nez v13, :cond_17

    .line 1449
    .line 1450
    goto :goto_14

    .line 1451
    :cond_17
    const-string v13, "\u6dfb\u52a0\u5f53\u524d\u4f5c\u54c1\u4f5c\u8005\u7684\u4e3b\u9875\u4e66\u7b7e\uff0c\u5e76\u9009\u62e9\u5206\u7c7b"

    .line 1452
    .line 1453
    move-object/from16 v42, v11

    .line 1454
    .line 1455
    move-object/from16 v15, v32

    .line 1456
    .line 1457
    move-object/from16 v11, v33

    .line 1458
    .line 1459
    move-object/from16 v41, v35

    .line 1460
    .line 1461
    move/from16 v35, v0

    .line 1462
    .line 1463
    move-object/from16 v32, v10

    .line 1464
    .line 1465
    :goto_16
    move-object/from16 v10, v47

    .line 1466
    .line 1467
    goto/16 :goto_28

    .line 1468
    .line 1469
    :sswitch_1
    move-object/from16 v15, v32

    .line 1470
    .line 1471
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v13

    .line 1475
    if-nez v13, :cond_18

    .line 1476
    .line 1477
    :goto_17
    move-object/from16 v32, v10

    .line 1478
    .line 1479
    move-object/from16 v42, v11

    .line 1480
    .line 1481
    move-object/from16 v11, v33

    .line 1482
    .line 1483
    move-object/from16 v41, v35

    .line 1484
    .line 1485
    move-object/from16 v10, v47

    .line 1486
    .line 1487
    move/from16 v35, v0

    .line 1488
    .line 1489
    goto/16 :goto_27

    .line 1490
    .line 1491
    :cond_18
    const-string v13, "\u6dfb\u52a0\u5f53\u524d\u4f5c\u54c1\u4e66\u7b7e\uff0c\u5df2\u5b58\u5728\u65f6\u4e0d\u4f1a\u53d6\u6d88"

    .line 1492
    .line 1493
    :goto_18
    move-object/from16 v32, v10

    .line 1494
    .line 1495
    move-object/from16 v42, v11

    .line 1496
    .line 1497
    move-object/from16 v11, v33

    .line 1498
    .line 1499
    move-object/from16 v41, v35

    .line 1500
    .line 1501
    move-object/from16 v10, v47

    .line 1502
    .line 1503
    move/from16 v35, v0

    .line 1504
    .line 1505
    goto/16 :goto_28

    .line 1506
    .line 1507
    :sswitch_2
    move-object/from16 v15, v32

    .line 1508
    .line 1509
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v13

    .line 1513
    if-nez v13, :cond_19

    .line 1514
    .line 1515
    goto :goto_17

    .line 1516
    :cond_19
    const-string v13, "\u4e34\u65f6\u663e\u793a\u6216\u6062\u590d\u9690\u85cf\u8054\u7cfb\u4eba\uff0c\u4e0d\u4fee\u6539\u603b\u5f00\u5173\uff1b\u9000\u51fa\u6296\u97f3\u540e\u6309\u8bbe\u7f6e\u6062\u590d\u9690\u85cf"

    .line 1517
    .line 1518
    goto :goto_18

    .line 1519
    :sswitch_3
    move-object/from16 v15, v32

    .line 1520
    .line 1521
    move-object/from16 v32, v10

    .line 1522
    .line 1523
    move-object/from16 v10, v35

    .line 1524
    .line 1525
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v13

    .line 1529
    if-nez v13, :cond_1a

    .line 1530
    .line 1531
    move/from16 v35, v0

    .line 1532
    .line 1533
    :goto_19
    move-object/from16 v41, v10

    .line 1534
    .line 1535
    :goto_1a
    move-object/from16 v42, v11

    .line 1536
    .line 1537
    move-object/from16 v11, v33

    .line 1538
    .line 1539
    goto :goto_15

    .line 1540
    :cond_1a
    const-string v13, "\u5207\u6362\u6e05\u723d\u6a21\u5f0f\u914d\u7f6e\u9879"

    .line 1541
    .line 1542
    move/from16 v35, v0

    .line 1543
    .line 1544
    :goto_1b
    move-object/from16 v41, v10

    .line 1545
    .line 1546
    :goto_1c
    move-object/from16 v42, v11

    .line 1547
    .line 1548
    move-object/from16 v11, v33

    .line 1549
    .line 1550
    goto :goto_16

    .line 1551
    :sswitch_4
    move-object/from16 v15, v32

    .line 1552
    .line 1553
    move-object/from16 v32, v10

    .line 1554
    .line 1555
    move-object/from16 v10, v35

    .line 1556
    .line 1557
    move/from16 v35, v0

    .line 1558
    .line 1559
    const-string v0, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 1560
    .line 1561
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    move-result v0

    .line 1565
    if-nez v0, :cond_1b

    .line 1566
    .line 1567
    goto :goto_19

    .line 1568
    :cond_1b
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u70b9\u8d5e\u6d41\u7a0b\uff0c\u4e0d\u4f9d\u8d56\u70b9\u8d5e\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1569
    .line 1570
    goto :goto_1b

    .line 1571
    :sswitch_5
    move-object/from16 v15, v32

    .line 1572
    .line 1573
    move-object/from16 v41, v35

    .line 1574
    .line 1575
    move/from16 v35, v0

    .line 1576
    .line 1577
    move-object/from16 v32, v10

    .line 1578
    .line 1579
    move-object/from16 v10, v39

    .line 1580
    .line 1581
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v0

    .line 1585
    if-nez v0, :cond_1c

    .line 1586
    .line 1587
    :goto_1d
    move-object/from16 v39, v10

    .line 1588
    .line 1589
    goto :goto_1a

    .line 1590
    :cond_1c
    const-string v13, "\u6253\u5f00 DyHelper \u6a21\u5757\u83dc\u5355"

    .line 1591
    .line 1592
    :goto_1e
    move-object/from16 v39, v10

    .line 1593
    .line 1594
    goto :goto_1c

    .line 1595
    :sswitch_6
    move-object/from16 v15, v32

    .line 1596
    .line 1597
    move-object/from16 v41, v35

    .line 1598
    .line 1599
    move/from16 v35, v0

    .line 1600
    .line 1601
    move-object/from16 v32, v10

    .line 1602
    .line 1603
    move-object/from16 v10, v39

    .line 1604
    .line 1605
    const-string v0, "\u6536\u85cf\u4f5c\u54c1"

    .line 1606
    .line 1607
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    if-nez v0, :cond_1d

    .line 1612
    .line 1613
    goto :goto_1d

    .line 1614
    :cond_1d
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u6536\u85cf\u6d41\u7a0b\uff0c\u4e0d\u4f9d\u8d56\u6536\u85cf\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1615
    .line 1616
    goto :goto_1e

    .line 1617
    :sswitch_7
    move-object/from16 v15, v32

    .line 1618
    .line 1619
    move-object/from16 v41, v35

    .line 1620
    .line 1621
    move/from16 v35, v0

    .line 1622
    .line 1623
    move-object/from16 v32, v10

    .line 1624
    .line 1625
    move-object/from16 v10, v39

    .line 1626
    .line 1627
    const-string v0, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 1628
    .line 1629
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1630
    .line 1631
    .line 1632
    move-result v0

    .line 1633
    if-nez v0, :cond_1e

    .line 1634
    .line 1635
    goto :goto_1d

    .line 1636
    :cond_1e
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u4f5c\u8005\u5165\u53e3\uff0c\u4e0d\u4f9d\u8d56\u5934\u50cf\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1637
    .line 1638
    goto :goto_1e

    .line 1639
    :sswitch_8
    move-object/from16 v15, v32

    .line 1640
    .line 1641
    move-object/from16 v41, v35

    .line 1642
    .line 1643
    move/from16 v35, v0

    .line 1644
    .line 1645
    move-object/from16 v32, v10

    .line 1646
    .line 1647
    move-object/from16 v10, v31

    .line 1648
    .line 1649
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v0

    .line 1653
    if-nez v0, :cond_1f

    .line 1654
    .line 1655
    :goto_1f
    move-object/from16 v31, v10

    .line 1656
    .line 1657
    goto :goto_1a

    .line 1658
    :cond_1f
    const-string v13, "\u76f4\u63a5\u8c03\u7528\u53d1\u5e03\u5165\u53e3\uff0c\u4e0d\u4f9d\u8d56\u5e95\u90e8\u53d1\u5e03\u6309\u94ae\u662f\u5426\u663e\u793a"

    .line 1659
    .line 1660
    :goto_20
    move-object/from16 v31, v10

    .line 1661
    .line 1662
    goto :goto_1c

    .line 1663
    :sswitch_9
    move-object/from16 v15, v32

    .line 1664
    .line 1665
    move-object/from16 v41, v35

    .line 1666
    .line 1667
    move/from16 v35, v0

    .line 1668
    .line 1669
    move-object/from16 v32, v10

    .line 1670
    .line 1671
    move-object/from16 v10, v31

    .line 1672
    .line 1673
    const-string v0, "\u5173\u6ce8\u4f5c\u8005"

    .line 1674
    .line 1675
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1676
    .line 1677
    .line 1678
    move-result v0

    .line 1679
    if-nez v0, :cond_20

    .line 1680
    .line 1681
    goto :goto_1f

    .line 1682
    :cond_20
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u5173\u6ce8\u6d41\u7a0b\uff0c\u4e0d\u4f9d\u8d56\u5173\u6ce8\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1683
    .line 1684
    goto :goto_20

    .line 1685
    :sswitch_a
    move-object/from16 v15, v32

    .line 1686
    .line 1687
    move-object/from16 v41, v35

    .line 1688
    .line 1689
    move/from16 v35, v0

    .line 1690
    .line 1691
    move-object/from16 v32, v10

    .line 1692
    .line 1693
    move-object/from16 v10, v31

    .line 1694
    .line 1695
    const-string v0, "\u5206\u4eab\u4f5c\u54c1"

    .line 1696
    .line 1697
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result v0

    .line 1701
    if-nez v0, :cond_21

    .line 1702
    .line 1703
    goto :goto_1f

    .line 1704
    :cond_21
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u5206\u4eab\u5165\u53e3\uff0c\u4e0d\u4f9d\u8d56\u5206\u4eab\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1705
    .line 1706
    goto :goto_20

    .line 1707
    :sswitch_b
    move-object/from16 v15, v32

    .line 1708
    .line 1709
    move-object/from16 v41, v35

    .line 1710
    .line 1711
    move/from16 v35, v0

    .line 1712
    .line 1713
    move-object/from16 v32, v10

    .line 1714
    .line 1715
    move-object/from16 v10, v47

    .line 1716
    .line 1717
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v0

    .line 1721
    if-nez v0, :cond_22

    .line 1722
    .line 1723
    move-object/from16 v42, v11

    .line 1724
    .line 1725
    :goto_21
    move-object/from16 v11, v33

    .line 1726
    .line 1727
    goto/16 :goto_27

    .line 1728
    .line 1729
    :cond_22
    const-string v13, "\u628a\u5f53\u524d Feed \u89c6\u9891\u5207\u6362\u5230\u6b64\u9009\u9879\u5185\u6ed1\u5757\u9009\u62e9\u7684\u6863\u4f4d"

    .line 1730
    .line 1731
    move-object/from16 v42, v11

    .line 1732
    .line 1733
    :goto_22
    move-object/from16 v11, v33

    .line 1734
    .line 1735
    goto/16 :goto_28

    .line 1736
    .line 1737
    :sswitch_c
    move-object/from16 v42, v11

    .line 1738
    .line 1739
    move-object/from16 v15, v32

    .line 1740
    .line 1741
    move-object/from16 v11, v34

    .line 1742
    .line 1743
    move-object/from16 v41, v35

    .line 1744
    .line 1745
    move/from16 v35, v0

    .line 1746
    .line 1747
    move-object/from16 v32, v10

    .line 1748
    .line 1749
    move-object/from16 v10, v47

    .line 1750
    .line 1751
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v0

    .line 1755
    if-nez v0, :cond_23

    .line 1756
    .line 1757
    :goto_23
    move-object/from16 v34, v11

    .line 1758
    .line 1759
    goto :goto_21

    .line 1760
    :cond_23
    const-string v13, "\u89e6\u53d1 IM \u4e00\u952e\u5df2\u8bfb"

    .line 1761
    .line 1762
    :goto_24
    move-object/from16 v34, v11

    .line 1763
    .line 1764
    goto :goto_22

    .line 1765
    :sswitch_d
    move-object/from16 v42, v11

    .line 1766
    .line 1767
    move-object/from16 v15, v32

    .line 1768
    .line 1769
    move-object/from16 v11, v34

    .line 1770
    .line 1771
    move-object/from16 v41, v35

    .line 1772
    .line 1773
    move/from16 v35, v0

    .line 1774
    .line 1775
    move-object/from16 v32, v10

    .line 1776
    .line 1777
    move-object/from16 v10, v47

    .line 1778
    .line 1779
    const-string v0, "\u4e0b\u8f7d\u97f3\u9891"

    .line 1780
    .line 1781
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1782
    .line 1783
    .line 1784
    move-result v0

    .line 1785
    if-nez v0, :cond_24

    .line 1786
    .line 1787
    goto :goto_23

    .line 1788
    :cond_24
    const-string v13, "\u4e0b\u8f7d\u5f53\u524d\u4f5c\u54c1\u643a\u5e26\u7684\u97f3\u4e50\u6216\u97f3\u9891"

    .line 1789
    .line 1790
    goto :goto_24

    .line 1791
    :sswitch_e
    move-object/from16 v42, v11

    .line 1792
    .line 1793
    move-object/from16 v15, v32

    .line 1794
    .line 1795
    move-object/from16 v11, v34

    .line 1796
    .line 1797
    move-object/from16 v41, v35

    .line 1798
    .line 1799
    move/from16 v35, v0

    .line 1800
    .line 1801
    move-object/from16 v32, v10

    .line 1802
    .line 1803
    move-object/from16 v10, v47

    .line 1804
    .line 1805
    const-string v0, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 1806
    .line 1807
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v0

    .line 1811
    if-nez v0, :cond_25

    .line 1812
    .line 1813
    goto :goto_23

    .line 1814
    :cond_25
    const-string v13, "\u6309\u5f53\u524d\u4f5c\u54c1\u7c7b\u578b\u4e0b\u8f7d\u89c6\u9891\u3001\u56fe\u7247\u6216\u52a8\u56fe"

    .line 1815
    .line 1816
    goto :goto_24

    .line 1817
    :sswitch_f
    move-object/from16 v42, v11

    .line 1818
    .line 1819
    move-object/from16 v11, v30

    .line 1820
    .line 1821
    move-object/from16 v15, v32

    .line 1822
    .line 1823
    move-object/from16 v41, v35

    .line 1824
    .line 1825
    move/from16 v35, v0

    .line 1826
    .line 1827
    move-object/from16 v32, v10

    .line 1828
    .line 1829
    move-object/from16 v10, v47

    .line 1830
    .line 1831
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v0

    .line 1835
    if-nez v0, :cond_26

    .line 1836
    .line 1837
    move-object/from16 v30, v11

    .line 1838
    .line 1839
    goto :goto_21

    .line 1840
    :cond_26
    const-string v13, "\u6807\u8bb0\u5f53\u524d\u89c6\u9891\u4e3a\u4e0d\u611f\u5174\u8da3\uff0c\u4f18\u5316\u63a8\u8350\u5185\u5bb9"

    .line 1841
    .line 1842
    move-object/from16 v30, v11

    .line 1843
    .line 1844
    goto :goto_22

    .line 1845
    :sswitch_10
    move-object/from16 v42, v11

    .line 1846
    .line 1847
    move-object/from16 v11, v29

    .line 1848
    .line 1849
    move-object/from16 v15, v32

    .line 1850
    .line 1851
    move-object/from16 v41, v35

    .line 1852
    .line 1853
    move/from16 v35, v0

    .line 1854
    .line 1855
    move-object/from16 v32, v10

    .line 1856
    .line 1857
    move-object/from16 v10, v47

    .line 1858
    .line 1859
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v0

    .line 1863
    if-nez v0, :cond_27

    .line 1864
    .line 1865
    :goto_25
    move-object/from16 v29, v11

    .line 1866
    .line 1867
    goto/16 :goto_21

    .line 1868
    .line 1869
    :cond_27
    const-string v13, "\u6253\u5f00\u5bbf\u4e3b\u89c2\u770b\u5386\u53f2\u8bb0\u5f55\u9875\u9762"

    .line 1870
    .line 1871
    :goto_26
    move-object/from16 v29, v11

    .line 1872
    .line 1873
    goto/16 :goto_22

    .line 1874
    .line 1875
    :sswitch_11
    move-object/from16 v42, v11

    .line 1876
    .line 1877
    move-object/from16 v11, v29

    .line 1878
    .line 1879
    move-object/from16 v15, v32

    .line 1880
    .line 1881
    move-object/from16 v41, v35

    .line 1882
    .line 1883
    move/from16 v35, v0

    .line 1884
    .line 1885
    move-object/from16 v32, v10

    .line 1886
    .line 1887
    move-object/from16 v10, v47

    .line 1888
    .line 1889
    const-string v0, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 1890
    .line 1891
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1892
    .line 1893
    .line 1894
    move-result v0

    .line 1895
    if-nez v0, :cond_28

    .line 1896
    .line 1897
    goto :goto_25

    .line 1898
    :cond_28
    const-string v13, "\u8c03\u7528\u5bbf\u4e3b\u539f\u751f\u8bc4\u8bba\u5165\u53e3\uff0c\u4e0d\u4f9d\u8d56\u8bc4\u8bba\u63a7\u4ef6\u662f\u5426\u663e\u793a"

    .line 1899
    .line 1900
    goto :goto_26

    .line 1901
    :sswitch_12
    move-object/from16 v42, v11

    .line 1902
    .line 1903
    move-object/from16 v15, v32

    .line 1904
    .line 1905
    move-object/from16 v11, v33

    .line 1906
    .line 1907
    move-object/from16 v41, v35

    .line 1908
    .line 1909
    move/from16 v35, v0

    .line 1910
    .line 1911
    move-object/from16 v32, v10

    .line 1912
    .line 1913
    move-object/from16 v10, v47

    .line 1914
    .line 1915
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1916
    .line 1917
    .line 1918
    move-result v0

    .line 1919
    if-nez v0, :cond_29

    .line 1920
    .line 1921
    :goto_27
    const-string v13, "\u8be5\u624b\u52bf\u4e0d\u6267\u884c\u4efb\u4f55\u52a8\u4f5c"

    .line 1922
    .line 1923
    goto :goto_28

    .line 1924
    :cond_29
    const-string v13, "\u89e6\u53d1\u706b\u82b1\u597d\u53cb\u4e00\u952e\u7eed\u671f"

    .line 1925
    .line 1926
    :goto_28
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1927
    .line 1928
    .line 1929
    const/high16 v13, 0x41300000    # 11.0f

    .line 1930
    .line 1931
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1932
    .line 1933
    .line 1934
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1935
    .line 1936
    .line 1937
    move-result v0

    .line 1938
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1939
    .line 1940
    .line 1941
    const/4 v13, 0x0

    .line 1942
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1943
    .line 1944
    .line 1945
    move-object/from16 v33, v11

    .line 1946
    .line 1947
    const/high16 v11, 0x40400000    # 3.0f

    .line 1948
    .line 1949
    invoke-static {v1, v11}, Lia0;->γ(Landroid/content/Context;F)I

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    invoke-virtual {v9, v13, v0, v13, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1954
    .line 1955
    .line 1956
    const/4 v11, 0x2

    .line 1957
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1958
    .line 1959
    .line 1960
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1961
    .line 1962
    const/4 v11, -0x2

    .line 1963
    const/4 v13, -0x1

    .line 1964
    invoke-direct {v0, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1965
    .line 1966
    .line 1967
    invoke-virtual {v7, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1968
    .line 1969
    .line 1970
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1971
    .line 1972
    invoke-direct {v0, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1973
    .line 1974
    .line 1975
    invoke-virtual {v7, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1976
    .line 1977
    .line 1978
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1979
    .line 1980
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1981
    .line 1982
    const/4 v13, 0x0

    .line 1983
    invoke-direct {v0, v13, v11, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v4, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1987
    .line 1988
    .line 1989
    if-eqz v35, :cond_2a

    .line 1990
    .line 1991
    new-instance v0, Landroid/widget/TextView;

    .line 1992
    .line 1993
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1994
    .line 1995
    .line 1996
    const-string v6, "\u5f53\u524d"

    .line 1997
    .line 1998
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1999
    .line 2000
    .line 2001
    const/high16 v7, 0x41200000    # 10.0f

    .line 2002
    .line 2003
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 2007
    .line 2008
    .line 2009
    const/16 v8, 0x11

    .line 2010
    .line 2011
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 2012
    .line 2013
    .line 2014
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 2015
    .line 2016
    .line 2017
    const/high16 v9, 0x40e00000    # 7.0f

    .line 2018
    .line 2019
    invoke-static {v1, v9}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2020
    .line 2021
    .line 2022
    move-result v11

    .line 2023
    const/high16 v13, 0x40000000    # 2.0f

    .line 2024
    .line 2025
    invoke-static {v1, v13}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2026
    .line 2027
    .line 2028
    move-result v7

    .line 2029
    invoke-static {v1, v9}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2030
    .line 2031
    .line 2032
    move-result v9

    .line 2033
    invoke-static {v1, v13}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2034
    .line 2035
    .line 2036
    move-result v8

    .line 2037
    invoke-virtual {v0, v11, v7, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2038
    .line 2039
    .line 2040
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2041
    .line 2042
    .line 2043
    move-result v7

    .line 2044
    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2045
    .line 2046
    .line 2047
    move-result v8

    .line 2048
    invoke-static {v0, v6, v7, v8}, Lia0;->δ(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 2049
    .line 2050
    .line 2051
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 2052
    .line 2053
    const/4 v9, -0x2

    .line 2054
    invoke-direct {v6, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2055
    .line 2056
    .line 2057
    const/high16 v7, 0x41000000    # 8.0f

    .line 2058
    .line 2059
    invoke-static {v1, v7}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2060
    .line 2061
    .line 2062
    move-result v8

    .line 2063
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 2064
    .line 2065
    invoke-virtual {v4, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2066
    .line 2067
    .line 2068
    move-object/from16 v45, v3

    .line 2069
    .line 2070
    goto :goto_29

    .line 2071
    :cond_2a
    const/high16 v7, 0x41000000    # 8.0f

    .line 2072
    .line 2073
    const/4 v9, -0x2

    .line 2074
    const/high16 v13, 0x40000000    # 2.0f

    .line 2075
    .line 2076
    :goto_29
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2077
    .line 2078
    const/4 v6, -0x1

    .line 2079
    invoke-direct {v0, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v3, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2083
    .line 2084
    .line 2085
    invoke-virtual {v2, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v0

    .line 2089
    if-eqz v0, :cond_2e

    .line 2090
    .line 2091
    move-object/from16 v4, v28

    .line 2092
    .line 2093
    :try_start_2
    iget v0, v4, Lrm1;->ε:F

    .line 2094
    .line 2095
    sget-object v6, Lx01;->α:Lx01;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 2096
    .line 2097
    const/4 v9, 0x0

    .line 2098
    :try_start_3
    new-array v8, v9, [Ljava/lang/Object;

    .line 2099
    .line 2100
    const v11, 0x7f0f0044

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v6, v1, v11, v8}, Lx01;->η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2107
    move-object/from16 v8, v46

    .line 2108
    .line 2109
    :try_start_4
    invoke-static {v1, v8, v0, v6}, Lia0;->β(Landroid/app/Activity;Lxx;FLjava/lang/String;)Lfa0;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 2113
    goto :goto_2b

    .line 2114
    :catchall_2
    move-exception v0

    .line 2115
    goto :goto_2a

    .line 2116
    :catchall_3
    move-exception v0

    .line 2117
    move-object/from16 v8, v46

    .line 2118
    .line 2119
    goto :goto_2a

    .line 2120
    :catchall_4
    move-exception v0

    .line 2121
    move-object/from16 v8, v46

    .line 2122
    .line 2123
    const/4 v9, 0x0

    .line 2124
    :goto_2a
    new-instance v6, Leo1;

    .line 2125
    .line 2126
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2127
    .line 2128
    .line 2129
    move-object v0, v6

    .line 2130
    :goto_2b
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v6

    .line 2134
    if-eqz v6, :cond_2b

    .line 2135
    .line 2136
    const-string v11, "DYHelper"

    .line 2137
    .line 2138
    const-string v7, "\u52a0\u8f7d\u4fee\u6539\u500d\u901f\u52a8\u4f5c\u6ed1\u5757\u5931\u8d25\uff0c\u5df2\u964d\u7ea7\u4e3a\u666e\u901a\u52a8\u4f5c\u9879"

    .line 2139
    .line 2140
    invoke-static {v11, v7, v6}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2141
    .line 2142
    .line 2143
    :cond_2b
    instance-of v6, v0, Leo1;

    .line 2144
    .line 2145
    if-eqz v6, :cond_2c

    .line 2146
    .line 2147
    const/4 v0, 0x0

    .line 2148
    :cond_2c
    check-cast v0, Lfa0;

    .line 2149
    .line 2150
    if-eqz v0, :cond_2d

    .line 2151
    .line 2152
    iget-object v6, v0, Lfa0;->γ:Landroid/widget/SeekBar;

    .line 2153
    .line 2154
    new-instance v7, Lga0;

    .line 2155
    .line 2156
    invoke-direct {v7, v4, v0, v1}, Lga0;-><init>(Lrm1;Lfa0;Landroid/app/Activity;)V

    .line 2157
    .line 2158
    .line 2159
    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 2160
    .line 2161
    .line 2162
    iget-object v0, v0, Lfa0;->α:Landroid/widget/LinearLayout;

    .line 2163
    .line 2164
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 2165
    .line 2166
    const/4 v7, -0x1

    .line 2167
    const/4 v11, -0x2

    .line 2168
    invoke-direct {v6, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual {v3, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2172
    .line 2173
    .line 2174
    goto :goto_2d

    .line 2175
    :cond_2d
    const/4 v7, -0x1

    .line 2176
    :goto_2c
    const/4 v11, -0x2

    .line 2177
    goto :goto_2d

    .line 2178
    :cond_2e
    move-object/from16 v4, v28

    .line 2179
    .line 2180
    move-object/from16 v8, v46

    .line 2181
    .line 2182
    const/4 v7, -0x1

    .line 2183
    const/4 v9, 0x0

    .line 2184
    goto :goto_2c

    .line 2185
    :goto_2d
    new-instance v0, Lc9;

    .line 2186
    .line 2187
    move-object/from16 v6, p3

    .line 2188
    .line 2189
    move-object/from16 v9, v27

    .line 2190
    .line 2191
    invoke-direct {v0, v9, v6, v2}, Lc9;-><init>(Lum1;La80;Ljava/lang/String;)V

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2195
    .line 2196
    .line 2197
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2198
    .line 2199
    invoke-direct {v0, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2200
    .line 2201
    .line 2202
    const/high16 v2, 0x40c00000    # 6.0f

    .line 2203
    .line 2204
    invoke-static {v1, v2}, Lia0;->γ(Landroid/content/Context;F)I

    .line 2205
    .line 2206
    .line 2207
    move-result v11

    .line 2208
    iput v11, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 2209
    .line 2210
    invoke-virtual {v5, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2211
    .line 2212
    .line 2213
    move-object/from16 v28, v4

    .line 2214
    .line 2215
    move-object v2, v8

    .line 2216
    move-object v7, v10

    .line 2217
    move-object/from16 v10, v32

    .line 2218
    .line 2219
    move-object/from16 v35, v41

    .line 2220
    .line 2221
    move-object/from16 v11, v42

    .line 2222
    .line 2223
    move-object/from16 v4, v43

    .line 2224
    .line 2225
    move-object/from16 v0, v45

    .line 2226
    .line 2227
    const/high16 v3, 0x41300000    # 11.0f

    .line 2228
    .line 2229
    const/high16 v6, 0x40400000    # 3.0f

    .line 2230
    .line 2231
    move-object/from16 v32, v15

    .line 2232
    .line 2233
    goto/16 :goto_9

    .line 2234
    .line 2235
    :cond_2f
    move-object/from16 v45, v0

    .line 2236
    .line 2237
    :goto_2e
    move-object/from16 v6, p3

    .line 2238
    .line 2239
    move-object v8, v2

    .line 2240
    move-object/from16 v42, v11

    .line 2241
    .line 2242
    move-object/from16 v9, v27

    .line 2243
    .line 2244
    move-object/from16 v4, v28

    .line 2245
    .line 2246
    move-object/from16 v15, v32

    .line 2247
    .line 2248
    move-object/from16 v41, v35

    .line 2249
    .line 2250
    const/high16 v2, 0x40c00000    # 6.0f

    .line 2251
    .line 2252
    const/high16 v13, 0x40000000    # 2.0f

    .line 2253
    .line 2254
    move-object/from16 v32, v10

    .line 2255
    .line 2256
    move-object v10, v7

    .line 2257
    const/4 v7, -0x1

    .line 2258
    goto :goto_2f

    .line 2259
    :cond_30
    move-object/from16 v0, v38

    .line 2260
    .line 2261
    goto :goto_2e

    .line 2262
    :goto_2f
    move-object/from16 v28, v4

    .line 2263
    .line 2264
    move-object v2, v8

    .line 2265
    move-object/from16 v27, v9

    .line 2266
    .line 2267
    move-object v7, v10

    .line 2268
    move-object/from16 v10, v32

    .line 2269
    .line 2270
    move-object/from16 v3, v36

    .line 2271
    .line 2272
    move-object/from16 v13, v39

    .line 2273
    .line 2274
    move-object/from16 v8, v41

    .line 2275
    .line 2276
    move-object/from16 v11, v42

    .line 2277
    .line 2278
    move-object/from16 v32, v15

    .line 2279
    .line 2280
    goto/16 :goto_5

    .line 2281
    .line 2282
    :cond_31
    move-object/from16 v38, v0

    .line 2283
    .line 2284
    move-object/from16 v9, v27

    .line 2285
    .line 2286
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2287
    .line 2288
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2289
    .line 2290
    .line 2291
    move-object/from16 v2, v26

    .line 2292
    .line 2293
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v0

    .line 2297
    const/4 v15, 0x1

    .line 2298
    invoke-virtual {v0, v15}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v0

    .line 2302
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v0

    .line 2306
    iput-object v0, v9, Lum1;->ε:Ljava/lang/Object;

    .line 2307
    .line 2308
    new-instance v2, Lsa;

    .line 2309
    .line 2310
    const/4 v3, 0x7

    .line 2311
    invoke-direct {v2, v0, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 2312
    .line 2313
    .line 2314
    move-object/from16 v3, v25

    .line 2315
    .line 2316
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2317
    .line 2318
    .line 2319
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 2320
    .line 2321
    .line 2322
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v0

    .line 2326
    if-eqz v0, :cond_32

    .line 2327
    .line 2328
    const v2, 0x106000d

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 2332
    .line 2333
    .line 2334
    const v2, 0x3ee66666    # 0.45f

    .line 2335
    .line 2336
    .line 2337
    invoke-virtual {v0, v2}, Landroid/view/Window;->setDimAmount(F)V

    .line 2338
    .line 2339
    .line 2340
    const/4 v11, 0x2

    .line 2341
    invoke-virtual {v0, v11}, Landroid/view/Window;->addFlags(I)V

    .line 2342
    .line 2343
    .line 2344
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v2

    .line 2348
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v2

    .line 2352
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2353
    .line 2354
    int-to-float v2, v2

    .line 2355
    const v3, 0x3f666666    # 0.9f

    .line 2356
    .line 2357
    .line 2358
    mul-float/2addr v2, v3

    .line 2359
    float-to-int v2, v2

    .line 2360
    const/4 v4, -0x2

    .line 2361
    invoke-virtual {v0, v2, v4}, Landroid/view/Window;->setLayout(II)V

    .line 2362
    .line 2363
    .line 2364
    :cond_32
    if-eqz v38, :cond_33

    .line 2365
    .line 2366
    new-instance v0, Lvu;

    .line 2367
    .line 2368
    move-object/from16 v2, v24

    .line 2369
    .line 2370
    move-object/from16 v4, v38

    .line 2371
    .line 2372
    invoke-direct {v0, v4, v1, v2}, Lvu;-><init>(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ScrollView;)V

    .line 2373
    .line 2374
    .line 2375
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 2376
    .line 2377
    .line 2378
    :cond_33
    return-void

    .line 2379
    :sswitch_data_0
    .sparse-switch
        -0x6f1be69b -> :sswitch_12
        -0x6921d4a9 -> :sswitch_11
        -0x383aa726 -> :sswitch_10
        0x24f1dae1 -> :sswitch_f
        0x259e8737 -> :sswitch_e
        0x25a79550 -> :sswitch_d
        0x25b0dff7 -> :sswitch_c
        0x25dbbdfd -> :sswitch_b
        0x267a690a -> :sswitch_a
        0x26a944be -> :sswitch_9
        0x27874a97 -> :sswitch_8
        0x2945c010 -> :sswitch_7
        0x300245fe -> :sswitch_6
        0x31967ecf -> :sswitch_5
        0x355a476a -> :sswitch_4
        0x391e98d9 -> :sswitch_3
        0x50be4979 -> :sswitch_2
        0x5e3d5f02 -> :sswitch_1
        0x65aa3707 -> :sswitch_0
    .end sparse-switch
.end method

.method public static λ(Landroid/widget/Button;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, Lxx;->Α:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 16
    .line 17
    .line 18
    const/high16 v3, 0x41500000    # 13.0f

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 21
    .line 22
    .line 23
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 29
    .line 30
    .line 31
    const/16 v3, 0x11

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    invoke-virtual {p0, v4}, Landroid/view/View;->setTextAlignment(I)V

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroid/view/View;->setMinimumWidth(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 54
    .line 55
    .line 56
    const/16 v5, 0xa

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    const/4 p1, -0x1

    .line 61
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lxx;->ι:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v5, p1, v1, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iget-object p1, v0, Lxx;->ζ:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, Lxx;->χ:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v5, p1, v1, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/high16 v0, 0x41200000    # 10.0f

    .line 114
    .line 115
    invoke-static {p1, v0}, Lia0;->γ(Landroid/content/Context;F)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v0}, Lia0;->γ(Landroid/content/Context;F)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p0, p1, v2, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v4}, Landroid/view/View;->setTextAlignment(I)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public static μ(Landroid/widget/Switch;Lxx;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    const v1, 0x10100a0

    .line 4
    .line 5
    .line 6
    filled-new-array {v1}, [I

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    new-array v4, v3, [I

    .line 12
    .line 13
    filled-new-array {v2, v4}, [[I

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v4, p1, Lxx;->ι:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-object v5, p1, Lxx;->θ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    filled-new-array {v4, v5}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct {v0, v2, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    filled-new-array {v1}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-array v2, v3, [I

    .line 46
    .line 47
    filled-new-array {v1, v2}, [[I

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, p1, Lxx;->κ:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget-object p1, p1, Lxx;->χ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    filled-new-array {v2, p1}, [I

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, v1, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :catchall_0
    return-void
.end method
