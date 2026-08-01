.class public final Lsv1;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/content/Context;

.field public final ζ:Ljava/util/List;

.field public final η:Z

.field public final θ:Luu1;

.field public final ι:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;ZLuu1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lsv1;->ε:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lsv1;->ζ:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p4, p0, Lsv1;->η:Z

    .line 15
    .line 16
    iput-object p5, p0, Lsv1;->θ:Luu1;

    .line 17
    .line 18
    check-cast p3, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-eqz p3, :cond_4

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    move-object p4, p3

    .line 40
    check-cast p4, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p5, p0, Lsv1;->ζ:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    :cond_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v1, v0

    .line 59
    check-cast v1, Ln71;

    .line 60
    .line 61
    iget-object v1, v1, Ln71;->α:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v0, 0x0

    .line 71
    :goto_1
    check-cast v0, Ln71;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-boolean p4, p0, Lsv1;->η:Z

    .line 76
    .line 77
    invoke-virtual {v0, p4}, Ln71;->α(Z)Z

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 p4, 0x0

    .line 83
    :goto_2
    if-eqz p4, :cond_0

    .line 84
    .line 85
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iput-object p1, p0, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lsv1;->ζ:Ljava/util/List;

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
    iget-object p0, p0, Lsv1;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ln71;

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
    .locals 10

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Lsv1;->β(Landroid/view/View;)Lrv1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2, p1}, Lsv1;->α(Lrv1;I)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p2, Lrv1;->α:Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    new-instance p3, Leo1;

    .line 13
    .line 14
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    move-object p2, p3

    .line 18
    :goto_0
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "\u5206\u4eab\u5feb\u6377\u6309\u94ae\u5217\u8868\u9879\u7ed1\u5b9a\u5931\u8d25 position="

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "DYHelper"

    .line 39
    .line 40
    invoke-static {v1, v0, p3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_1
    iget-object p2, p0, Lsv1;->ζ:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ln71;

    .line 58
    .line 59
    iget-object p2, p0, Lsv1;->ε:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {p2}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    iget-boolean v0, p0, Lsv1;->η:Z

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ln71;->α(Z)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    xor-int/lit8 v1, v0, 0x1

    .line 72
    .line 73
    new-instance v2, Landroid/widget/CheckBox;

    .line 74
    .line 75
    invoke-direct {v2, p2}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 79
    .line 80
    iget-object v4, p1, Ln71;->α:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v3, p3, Lxx;->λ:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 103
    .line 104
    .line 105
    iget-object v3, p1, Ln71;->β:Ljava/lang/String;

    .line 106
    .line 107
    const-string v4, "\u9009\u62e9"

    .line 108
    .line 109
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v2, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Lov1;

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    invoke-direct {v4, p0, p1, v5}, Lov1;-><init>(Lsv1;Ln71;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Landroid/widget/LinearLayout;

    .line 126
    .line 127
    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    const/4 p2, 0x0

    .line 131
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 132
    .line 133
    .line 134
    const/16 v4, 0x10

    .line 135
    .line 136
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/16 v5, 0x38

    .line 147
    .line 148
    invoke-static {v4, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-virtual {p0, v4}, Landroid/view/View;->setMinimumHeight(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const/16 v5, 0xa

    .line 163
    .line 164
    invoke-static {v4, v5}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const/4 v6, 0x7

    .line 176
    invoke-static {v5, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const/16 v8, 0x8

    .line 188
    .line 189
    invoke-static {v7, v8}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {v9, v6}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-virtual {p0, v4, v5, v7, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v5, p3, Lxx;->Α:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v6, p3, Lxx;->γ:Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {v8, v4, v5, v6}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    new-instance v4, Landroid/widget/TextView;

    .line 229
    .line 230
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 235
    .line 236
    .line 237
    iget-object v5, p1, Ln71;->γ:Ljava/lang/String;

    .line 238
    .line 239
    if-nez v0, :cond_2

    .line 240
    .line 241
    const-string v6, "\u9700\u8981\u5185\u6d4b\u8d44\u683c \u00b7 "

    .line 242
    .line 243
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    :cond_2
    invoke-static {v3, v5, p3}, Ljx0;->е(Ljava/lang/String;Ljava/lang/String;Lxx;)Landroid/text/SpannableString;

    .line 248
    .line 249
    .line 250
    move-result-object p3

    .line 251
    invoke-virtual {v4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    const/4 p3, 0x2

    .line 255
    invoke-virtual {v4, p3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 259
    .line 260
    .line 261
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 262
    .line 263
    const/4 v3, -0x2

    .line 264
    const/high16 v5, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-direct {p3, p2, v3, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 273
    .line 274
    .line 275
    const/4 p2, 0x1

    .line 276
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 280
    .line 281
    .line 282
    if-nez v0, :cond_3

    .line 283
    .line 284
    const v5, 0x3f147ae1    # 0.58f

    .line 285
    .line 286
    .line 287
    :cond_3
    invoke-virtual {p0, v5}, Landroid/view/View;->setAlpha(F)V

    .line 288
    .line 289
    .line 290
    new-instance p2, Lqv1;

    .line 291
    .line 292
    invoke-direct {p2, v1, p0, p1, v2}, Lqv1;-><init>(ZLandroid/widget/LinearLayout;Ln71;Landroid/widget/CheckBox;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 296
    .line 297
    .line 298
    move-object p2, p0

    .line 299
    :goto_1
    check-cast p2, Landroid/view/View;

    .line 300
    .line 301
    return-object p2
.end method

.method public final α(Lrv1;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lsv1;->ζ:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    check-cast v4, Ln71;

    .line 14
    .line 15
    iget-object v5, v4, Ln71;->α:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, v4, Ln71;->β:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v7, v4, Ln71;->δ:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v8, v0, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-virtual {v8, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iget-boolean v8, v0, Lsv1;->η:Z

    .line 28
    .line 29
    invoke-virtual {v4, v8}, Ln71;->α(Z)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    xor-int/lit8 v9, v8, 0x1

    .line 34
    .line 35
    iget-object v10, v0, Lsv1;->ε:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v10}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    iget-object v12, v11, Lxx;->λ:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v13, v11, Lxx;->η:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v14, v11, Lxx;->θ:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v15, 0x1

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    sub-int/2addr v2, v15

    .line 51
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ln71;

    .line 56
    .line 57
    iget-object v2, v2, Ln71;->δ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v2, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    :goto_0
    move v2, v15

    .line 69
    :goto_1
    iget-object v3, v1, Lrv1;->β:Landroid/widget/TextView;

    .line 70
    .line 71
    iget-object v15, v1, Lrv1;->ζ:Landroid/widget/TextView;

    .line 72
    .line 73
    move/from16 p2, v2

    .line 74
    .line 75
    iget-object v2, v1, Lrv1;->ε:Landroid/widget/TextView;

    .line 76
    .line 77
    move-object/from16 v16, v12

    .line 78
    .line 79
    iget-object v12, v1, Lrv1;->γ:Landroid/view/View;

    .line 80
    .line 81
    move-object/from16 v17, v13

    .line 82
    .line 83
    iget-object v13, v1, Lrv1;->δ:Landroid/widget/CheckBox;

    .line 84
    .line 85
    move-object/from16 v18, v14

    .line 86
    .line 87
    if-eqz p2, :cond_2

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    const/16 v14, 0x8

    .line 92
    .line 93
    :goto_2
    invoke-virtual {v3, v14}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    if-nez v8, :cond_3

    .line 110
    .line 111
    move-object/from16 v3, v18

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    if-eqz v5, :cond_4

    .line 115
    .line 116
    move-object/from16 v3, v16

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    iget-object v3, v11, Lxx;->ζ:Ljava/lang/String;

    .line 120
    .line 121
    :goto_3
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v4, Ln71;->γ:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v8, :cond_5

    .line 131
    .line 132
    const-string v3, "\u9700\u8981\u5185\u6d4b\u8d44\u683c \u00b7 "

    .line 133
    .line 134
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :cond_5
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    if-nez v8, :cond_6

    .line 142
    .line 143
    move-object/from16 v17, v18

    .line 144
    .line 145
    :cond_6
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v1, Lrv1;->α:Landroid/view/View;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v11, Lxx;->Α:Ljava/lang/String;

    .line 159
    .line 160
    if-nez v8, :cond_7

    .line 161
    .line 162
    iget-object v2, v11, Lxx;->χ:Ljava/lang/String;

    .line 163
    .line 164
    :goto_4
    const/16 v3, 0x8

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_7
    if-eqz v5, :cond_8

    .line 168
    .line 169
    iget-object v2, v11, Lxx;->μ:Ljava/lang/String;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    iget-object v2, v11, Lxx;->γ:Ljava/lang/String;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :goto_5
    invoke-static {v3, v10, v1, v2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v12, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 180
    .line 181
    .line 182
    if-nez v8, :cond_9

    .line 183
    .line 184
    const v1, 0x3f147ae1    # 0.58f

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 189
    .line 190
    :goto_6
    invoke-virtual {v12, v1}, Landroid/view/View;->setAlpha(F)V

    .line 191
    .line 192
    .line 193
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    const v2, 0x10100a0

    .line 196
    .line 197
    .line 198
    filled-new-array {v2}, [I

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const/4 v3, 0x0

    .line 203
    new-array v3, v3, [I

    .line 204
    .line 205
    filled-new-array {v2, v3}, [[I

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    filled-new-array {v3, v7}, [I

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-direct {v1, v2, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13, v1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 225
    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    invoke-virtual {v13, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v13, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v13, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 235
    .line 236
    .line 237
    const-string v1, "\u9009\u62e9"

    .line 238
    .line 239
    invoke-virtual {v1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v13, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 244
    .line 245
    .line 246
    new-instance v1, Lov1;

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    invoke-direct {v1, v0, v4, v2}, Lov1;-><init>(Lsv1;Ln71;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v13, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 253
    .line 254
    .line 255
    const/4 v1, 0x1

    .line 256
    invoke-virtual {v12, v1}, Landroid/view/View;->setClickable(Z)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 260
    .line 261
    .line 262
    new-instance v1, Lpv1;

    .line 263
    .line 264
    invoke-direct {v1, v2, v0, v4, v9}, Lpv1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    .line 269
    .line 270
    return-void
.end method

.method public final β(Landroid/view/View;)Lrv1;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    instance-of v1, p1, Lrv1;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lrv1;

    .line 16
    .line 17
    :cond_1
    if-eqz v0, :cond_2

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_2
    sget-object p1, Lx01;->α:Lx01;

    .line 21
    .line 22
    const-string v0, "item_share_panel_action_config"

    .line 23
    .line 24
    const v1, 0x7f0c005b

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lsv1;->ε:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p1, v1, p0, v0}, Lx01;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    new-instance v2, Lrv1;

    .line 34
    .line 35
    const-string p0, "share_action_item_category"

    .line 36
    .line 37
    const p1, 0x7f0902b1

    .line 38
    .line 39
    .line 40
    const-class v0, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-static {v3, p0, p1, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    move-object v4, p0

    .line 47
    check-cast v4, Landroid/widget/TextView;

    .line 48
    .line 49
    const p0, 0x7f0902b4

    .line 50
    .line 51
    .line 52
    const-class p1, Landroid/view/View;

    .line 53
    .line 54
    const-string v1, "share_action_item_row"

    .line 55
    .line 56
    invoke-static {v3, v1, p0, p1}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const p0, 0x7f0902b2

    .line 61
    .line 62
    .line 63
    const-class p1, Landroid/widget/CheckBox;

    .line 64
    .line 65
    const-string v1, "share_action_item_checkbox"

    .line 66
    .line 67
    invoke-static {v3, v1, p0, p1}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    move-object v6, p0

    .line 72
    check-cast v6, Landroid/widget/CheckBox;

    .line 73
    .line 74
    const-string p0, "share_action_item_title"

    .line 75
    .line 76
    const p1, 0x7f0902b6

    .line 77
    .line 78
    .line 79
    invoke-static {v3, p0, p1, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    move-object v7, p0

    .line 84
    check-cast v7, Landroid/widget/TextView;

    .line 85
    .line 86
    const-string p0, "share_action_item_subtitle"

    .line 87
    .line 88
    const p1, 0x7f0902b5

    .line 89
    .line 90
    .line 91
    invoke-static {v3, p0, p1, v0}, Lx01;->ε(Landroid/view/View;Ljava/lang/String;ILjava/lang/Class;)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    move-object v8, p0

    .line 96
    check-cast v8, Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-direct/range {v2 .. v8}, Lrv1;-><init>(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/CheckBox;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object v2
.end method

.method public final γ(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lsv1;->θ:Luu1;

    .line 21
    .line 22
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Luu1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method
