.class public final Lyyds/ᛱᛷᛲᲀ;
.super Lyyds/ᛲᛵᲇᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Lyyds/ᛲᛵᲇᛳ;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Lyyds/ᲇᛶᲁᲀ;)V
    .locals 2

    .line 1
    const-wide v0, -0x551eae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lyyds/ᛱᛷᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

    .line 15
    .line 16
    iget-object v0, p0, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 17
    .line 18
    iget-object v1, v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛳᛶᛵ:Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p1, p1, Lyyds/ᲇᛶᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛲᛵᲇᛳ;->ᲀᛲᛳᲀ()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛴᛵᛶ()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V
    .locals 26

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
    const-wide v3, -0x55247e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    instance-of v3, v1, Lyyds/ᲁᛸᲁᲀ;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    check-cast v1, Lyyds/ᲁᛸᲁᲀ;

    .line 24
    .line 25
    iget-object v0, v0, Lyyds/ᛱᛷᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛲᛲᲇ()Lyyds/ᲇᛶᲁᲀ;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    iget-object v2, v1, Lyyds/ᲁᛸᲁᲀ;->ᛶᛸᲀᲁ:Landroid/widget/TextView;

    .line 34
    .line 35
    const-wide v7, -0x51322e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    iget-object v3, v1, Lyyds/ᲁᛸᲁᲀ;->ᛳᛸᛴᛶ:Landroid/widget/TextView;

    .line 44
    .line 45
    iget-object v7, v0, Lyyds/ᲇᛶᲁᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, Lyyds/ᲁᛸᲁᲀ;->ᛶᲈᛴᲈ:Landroid/widget/TextView;

    .line 51
    .line 52
    iget-object v3, v0, Lyyds/ᲇᛶᲁᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lyyds/ᲇᛶᲁᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v3, v0, Lyyds/ᲇᛶᲁᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᲁᲀ;

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lyyds/ᛶᲈᛴᲈ;

    .line 73
    .line 74
    invoke-direct {v1, v5, v0}, Lyyds/ᛶᲈᛴᲈ;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    :goto_0
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    instance-of v3, v1, Lyyds/ᲀᛷᲀᛶ;

    .line 89
    .line 90
    iget-object v0, v0, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 91
    .line 92
    if-eqz v3, :cond_15

    .line 93
    .line 94
    check-cast v1, Lyyds/ᲀᛷᲀᛶ;

    .line 95
    .line 96
    iget-object v1, v1, Lyyds/ᲀᛷᲀᛶ;->ᛳᛸᛴᛶ:Lyyds/ᛳᛲᛸᛳ;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lyyds/ᛱᛷᲁᲁ;

    .line 103
    .line 104
    iget-object v2, v1, Lyyds/ᛳᛲᛸᛳ;->ᛱᛳᲇ:Landroid/widget/TextView;

    .line 105
    .line 106
    iget-object v3, v1, Lyyds/ᛳᛲᛸᛳ;->ᛶᛸᲀᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 107
    .line 108
    iget-object v8, v1, Lyyds/ᛳᛲᛸᛳ;->ᛶᛳᛶᛵ:Lyyds/ᲁᛵᛲᲀ;

    .line 109
    .line 110
    const-wide v17, -0x4c409e68a836eL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static/range {v17 .. v18}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    iget-object v5, v0, Lyyds/ᛱᛷᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v9, v0, Lyyds/ᛱᛷᲁᲁ;->ᛶᛷᛲᲁ:Ljava/util/List;

    .line 121
    .line 122
    iget-object v10, v0, Lyyds/ᛱᛷᲁᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v11, v1, Lyyds/ᛳᛲᛸᛳ;->ᛲᛴᛳᛲ:Landroid/widget/FrameLayout;

    .line 125
    .line 126
    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 127
    .line 128
    .line 129
    move-result-object v18

    .line 130
    invoke-virtual/range {v18 .. v18}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 131
    .line 132
    .line 133
    iget-boolean v12, v0, Lyyds/ᛱᛷᲁᲁ;->ᛱᲈᲁ:Z

    .line 134
    .line 135
    sget-object v19, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 136
    .line 137
    invoke-virtual {v3, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    const/16 v7, 0x1a

    .line 142
    .line 143
    invoke-virtual {v3, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    invoke-virtual {v3, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 152
    .line 153
    sget-object v7, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 154
    .line 155
    const/high16 v15, -0x1000000

    .line 156
    .line 157
    move-object/from16 v21, v9

    .line 158
    .line 159
    const v9, 0x3e3851ec    # 0.18f

    .line 160
    .line 161
    .line 162
    invoke-static {v15, v4, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    const v15, 0x3f051eb8    # 0.52f

    .line 167
    .line 168
    .line 169
    move-object/from16 v22, v10

    .line 170
    .line 171
    const/4 v10, -0x1

    .line 172
    invoke-static {v4, v10, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    filled-new-array {v9, v4, v15}, [I

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-direct {v6, v7, v4}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 187
    .line 188
    .line 189
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛱᲈᲁ:Landroid/view/View;

    .line 190
    .line 191
    const v6, 0x6606004a

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-virtual {v3, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 203
    .line 204
    sget-object v14, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 205
    .line 206
    const v15, 0x3e051eb8    # 0.13f

    .line 207
    .line 208
    .line 209
    invoke-static {v6, v7, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    const v10, 0x3cf5c28f    # 0.03f

    .line 214
    .line 215
    .line 216
    invoke-static {v6, v7, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    move/from16 p2, v12

    .line 221
    .line 222
    const v12, 0x3d75c28f    # 0.06f

    .line 223
    .line 224
    .line 225
    invoke-static {v6, v7, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    filled-new-array {v15, v10, v6}, [I

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-direct {v9, v14, v6}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 234
    .line 235
    .line 236
    const/16 v6, 0x19

    .line 237
    .line 238
    invoke-virtual {v3, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    invoke-virtual {v9, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 246
    .line 247
    .line 248
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 249
    .line 250
    const/16 v6, 0x1a

    .line 251
    .line 252
    invoke-virtual {v3, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v10, 0x0

    .line 258
    invoke-static {v13, v7, v9, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 263
    .line 264
    .line 265
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 266
    .line 267
    const/high16 v7, 0x3f000000    # 0.5f

    .line 268
    .line 269
    const/4 v14, -0x1

    .line 270
    invoke-static {v13, v14, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    invoke-virtual {v3, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    invoke-static {v7, v6, v9, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 283
    .line 284
    .line 285
    new-instance v4, Lyyds/ᛸᛵᲀᛳ;

    .line 286
    .line 287
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 296
    .line 297
    const v7, 0x40266666    # 2.6f

    .line 298
    .line 299
    .line 300
    mul-float/2addr v7, v6

    .line 301
    invoke-direct {v4, v13, v7}, Lyyds/ᛸᛵᲀᛳ;-><init>(IF)V

    .line 302
    .line 303
    .line 304
    iput-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛳᛸᛴᛶ:Lyyds/ᛸᛵᲀᛳ;

    .line 305
    .line 306
    iget-object v6, v1, Lyyds/ᛳᛲᛸᛳ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 307
    .line 308
    invoke-virtual {v6, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛶᛷᛲᲁ:Landroid/widget/ImageView;

    .line 312
    .line 313
    iget-object v6, v0, Lyyds/ᛱᛷᲁᲁ;->ᲇᲇᲇᛱ:Landroid/graphics/drawable/Drawable;

    .line 314
    .line 315
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 316
    .line 317
    .line 318
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛳᲁᲁᲇ:Landroid/widget/TextView;

    .line 319
    .line 320
    iget-object v6, v0, Lyyds/ᛱᛷᲁᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    .line 324
    .line 325
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᲇᛱᛲ:Landroid/widget/TextView;

    .line 326
    .line 327
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛷᛵᲇᲀ:Landroid/widget/TextView;

    .line 331
    .line 332
    if-eqz p2, :cond_4

    .line 333
    .line 334
    const-wide v9, -0x4c40de68a836eL

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    :goto_1
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    goto :goto_2

    .line 344
    :cond_4
    const-wide v9, -0x4c411e68a836eL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    goto :goto_1

    .line 350
    :goto_2
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 354
    .line 355
    .line 356
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛷᛲᲈᛱ:Landroid/view/View;

    .line 357
    .line 358
    const/16 v7, 0x3e7

    .line 359
    .line 360
    invoke-virtual {v3, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    const/4 v10, 0x0

    .line 365
    const/4 v14, 0x0

    .line 366
    invoke-static {v13, v9, v10, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    invoke-virtual {v4, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 371
    .line 372
    .line 373
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛷᲈᲈᲁ:Landroid/widget/LinearLayout;

    .line 374
    .line 375
    const v9, 0x6606004a

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    const v14, 0x3dcccccd    # 0.1f

    .line 383
    .line 384
    .line 385
    invoke-static {v13, v10, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual {v3, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 390
    .line 391
    .line 392
    move-result v14

    .line 393
    invoke-virtual {v3, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 394
    .line 395
    .line 396
    move-result v15

    .line 397
    const v9, 0x3eb33333    # 0.35f

    .line 398
    .line 399
    .line 400
    invoke-static {v13, v15, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    const/4 v15, 0x1

    .line 409
    invoke-virtual {v3, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    invoke-static {v10, v14, v9, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 418
    .line 419
    .line 420
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛲᛲᲈᲈ:Landroid/widget/TextView;

    .line 421
    .line 422
    iget-object v7, v0, Lyyds/ᛱᛷᲁᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 423
    .line 424
    invoke-static {v7}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    if-eqz v9, :cond_5

    .line 429
    .line 430
    const-wide v9, -0x4c415e68a836eL

    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    :cond_5
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 440
    .line 441
    .line 442
    const-wide v9, -0x4c417e68a836eL

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-static/range {v22 .. v22}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-eqz v7, :cond_6

    .line 456
    .line 457
    const-wide v9, -0x4c41ae68a836eL

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    goto :goto_3

    .line 467
    :cond_6
    move-object/from16 v7, v22

    .line 468
    .line 469
    :goto_3
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 474
    .line 475
    .line 476
    invoke-static/range {v22 .. v22}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_7

    .line 481
    .line 482
    const v4, 0x6606010d

    .line 483
    .line 484
    .line 485
    invoke-virtual {v3, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    move v7, v4

    .line 490
    const v4, 0x66060102

    .line 491
    .line 492
    .line 493
    goto :goto_4

    .line 494
    :cond_7
    const v4, 0x66060102

    .line 495
    .line 496
    .line 497
    invoke-virtual {v3, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 498
    .line 499
    .line 500
    move-result v7

    .line 501
    :goto_4
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 505
    .line 506
    .line 507
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    if-eqz v2, :cond_8

    .line 512
    .line 513
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 514
    .line 515
    .line 516
    move-result-object v18

    .line 517
    const-wide v9, -0x4c41ee68a836eL

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    const-wide v9, -0x4c42ee68a836eL

    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v19

    .line 534
    invoke-virtual {v3, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 535
    .line 536
    .line 537
    move-result v20

    .line 538
    const v2, 0x6606010a

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 542
    .line 543
    .line 544
    move-result v21

    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const/16 v23, 0x0

    .line 548
    .line 549
    move-object/from16 v17, v3

    .line 550
    .line 551
    invoke-virtual/range {v17 .. v23}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;IILjava/lang/Integer;Z)Landroid/widget/TextView;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 556
    .line 557
    .line 558
    goto :goto_6

    .line 559
    :cond_8
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    if-eqz v4, :cond_9

    .line 568
    .line 569
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    check-cast v4, Ljava/lang/String;

    .line 574
    .line 575
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    const-wide v9, -0x4c435e68a836eL

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-object/from16 v9, v22

    .line 588
    .line 589
    invoke-static {v4, v9}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    invoke-virtual {v3, v7, v4, v10, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲇᛲᛱ(Landroid/content/Context;Ljava/lang/String;ZI)Landroid/widget/TextView;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 598
    .line 599
    .line 600
    goto :goto_5

    .line 601
    :cond_9
    :goto_6
    iget-object v2, v1, Lyyds/ᛳᛲᛸᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛳᛶᲇ;

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    invoke-static {}, Landroid/animation/ValueAnimator;->areAnimatorsEnabled()Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    if-nez v4, :cond_a

    .line 611
    .line 612
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 613
    .line 614
    .line 615
    goto :goto_7

    .line 616
    :cond_a
    iget-object v4, v2, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 617
    .line 618
    if-eqz v4, :cond_b

    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_b
    const/4 v4, 0x2

    .line 622
    new-array v7, v4, [F

    .line 623
    .line 624
    fill-array-data v7, :array_0

    .line 625
    .line 626
    .line 627
    invoke-static {v7}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    const-wide/32 v7, 0x186a0

    .line 632
    .line 633
    .line 634
    invoke-virtual {v4, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 635
    .line 636
    .line 637
    new-instance v7, Landroid/view/animation/LinearInterpolator;

    .line 638
    .line 639
    invoke-direct {v7}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 643
    .line 644
    .line 645
    const/4 v14, -0x1

    .line 646
    invoke-virtual {v4, v14}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 647
    .line 648
    .line 649
    new-instance v7, Lyyds/ᲇᛲᛷᲀ;

    .line 650
    .line 651
    const/4 v8, 0x4

    .line 652
    invoke-direct {v7, v8, v2}, Lyyds/ᲇᛲᛷᲀ;-><init>(ILjava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 659
    .line 660
    .line 661
    iput-object v4, v2, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 662
    .line 663
    :goto_7
    invoke-static {}, Landroid/animation/ValueAnimator;->areAnimatorsEnabled()Z

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    if-nez v2, :cond_c

    .line 668
    .line 669
    goto :goto_8

    .line 670
    :cond_c
    iget-object v2, v1, Lyyds/ᛳᛲᛸᛳ;->ᛳᛸᛴᛶ:Lyyds/ᛸᛵᲀᛳ;

    .line 671
    .line 672
    if-nez v2, :cond_d

    .line 673
    .line 674
    goto :goto_8

    .line 675
    :cond_d
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 676
    .line 677
    if-eqz v4, :cond_e

    .line 678
    .line 679
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 680
    .line 681
    .line 682
    :cond_e
    const/4 v4, 0x2

    .line 683
    new-array v4, v4, [F

    .line 684
    .line 685
    fill-array-data v4, :array_1

    .line 686
    .line 687
    .line 688
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    const-wide/16 v7, 0xa28

    .line 693
    .line 694
    invoke-virtual {v4, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 695
    .line 696
    .line 697
    new-instance v7, Landroid/view/animation/LinearInterpolator;

    .line 698
    .line 699
    invoke-direct {v7}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 703
    .line 704
    .line 705
    const/4 v14, -0x1

    .line 706
    invoke-virtual {v4, v14}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 707
    .line 708
    .line 709
    new-instance v7, Lyyds/ᲇᛲᛷᲀ;

    .line 710
    .line 711
    const/4 v8, 0x3

    .line 712
    invoke-direct {v7, v8, v2}, Lyyds/ᲇᛲᛷᲀ;-><init>(ILjava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 719
    .line 720
    .line 721
    iput-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 722
    .line 723
    :goto_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 724
    .line 725
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    const v4, 0xff0c

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    if-eqz p2, :cond_f

    .line 738
    .line 739
    const-wide v6, -0x4c445e68a836eL

    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    :goto_9
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    goto :goto_a

    .line 749
    :cond_f
    const-wide v6, -0x4c449e68a836eL

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    goto :goto_9

    .line 755
    :goto_a
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    invoke-virtual {v11, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 763
    .line 764
    .line 765
    iget-object v2, v1, Lyyds/ᛳᛲᛸᛳ;->ᲀᛲᛲᲇ:Landroid/widget/TextView;

    .line 766
    .line 767
    iget-object v4, v1, Lyyds/ᛳᛲᛸᛳ;->ᛵᛶᛲᲀ:Landroid/widget/TextView;

    .line 768
    .line 769
    sget-object v6, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 770
    .line 771
    iget-object v6, v3, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛸᲀᲁ:Ljava/util/Set;

    .line 772
    .line 773
    if-nez v6, :cond_10

    .line 774
    .line 775
    sget-object v6, Lyyds/ᲈᛴᲇᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛴᲇᛴ;

    .line 776
    .line 777
    goto :goto_b

    .line 778
    :cond_10
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v6

    .line 782
    if-eqz v6, :cond_11

    .line 783
    .line 784
    sget-object v6, Lyyds/ᲈᛴᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛴᲇᛴ;

    .line 785
    .line 786
    goto :goto_b

    .line 787
    :cond_11
    sget-object v6, Lyyds/ᲈᛴᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛴᲇᛴ;

    .line 788
    .line 789
    :goto_b
    iget-object v7, v3, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᲈᛴᲈ:Lyyds/ᛶᲀᲈᛵ;

    .line 790
    .line 791
    if-eqz v7, :cond_12

    .line 792
    .line 793
    const/4 v7, 0x1

    .line 794
    goto :goto_c

    .line 795
    :cond_12
    const/4 v7, 0x0

    .line 796
    :goto_c
    sget-object v8, Lyyds/ᲈᛴᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛴᲇᛴ;

    .line 797
    .line 798
    if-ne v6, v8, :cond_13

    .line 799
    .line 800
    if-eqz v7, :cond_13

    .line 801
    .line 802
    const/4 v14, 0x0

    .line 803
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 804
    .line 805
    .line 806
    const/4 v15, 0x1

    .line 807
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 808
    .line 809
    .line 810
    const-wide v6, -0x4c453e68a836eL

    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v6

    .line 819
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v3, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 823
    .line 824
    .line 825
    move-result v6

    .line 826
    const v9, 0x6606004a

    .line 827
    .line 828
    .line 829
    invoke-virtual {v3, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 830
    .line 831
    .line 832
    move-result v7

    .line 833
    invoke-static {v6, v7, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 834
    .line 835
    .line 836
    move-result v6

    .line 837
    const/16 v7, 0x3e7

    .line 838
    .line 839
    invoke-virtual {v3, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 840
    .line 841
    .line 842
    move-result v7

    .line 843
    invoke-virtual {v3, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 844
    .line 845
    .line 846
    move-result v8

    .line 847
    invoke-virtual {v3, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 848
    .line 849
    .line 850
    move-result v9

    .line 851
    const v10, 0x3ee66666    # 0.45f

    .line 852
    .line 853
    .line 854
    invoke-static {v8, v9, v10}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 855
    .line 856
    .line 857
    move-result v8

    .line 858
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    invoke-virtual {v3, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 863
    .line 864
    .line 865
    move-result v9

    .line 866
    invoke-static {v6, v7, v8, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 867
    .line 868
    .line 869
    move-result-object v6

    .line 870
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v3, v15}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 874
    .line 875
    .line 876
    move-result v6

    .line 877
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 878
    .line 879
    .line 880
    goto :goto_d

    .line 881
    :cond_13
    const/4 v15, 0x1

    .line 882
    const/16 v6, 0x8

    .line 883
    .line 884
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 888
    .line 889
    .line 890
    const-wide v6, -0x4c44de68a836eL

    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v6

    .line 899
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 900
    .line 901
    .line 902
    :goto_d
    invoke-virtual {v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲈᲈᲁ()Landroid/graphics/drawable/GradientDrawable;

    .line 903
    .line 904
    .line 905
    move-result-object v6

    .line 906
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 907
    .line 908
    .line 909
    invoke-static {v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛳᛸᛴᛶ(Lcom/ss/android/ugc/awemes/MainActivity;)I

    .line 910
    .line 911
    .line 912
    move-result v6

    .line 913
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    invoke-virtual {v6, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 921
    .line 922
    .line 923
    move-result-object v5

    .line 924
    if-nez v5, :cond_14

    .line 925
    .line 926
    const/16 v6, 0x8

    .line 927
    .line 928
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 929
    .line 930
    .line 931
    const/4 v9, 0x0

    .line 932
    invoke-virtual {v2, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 933
    .line 934
    .line 935
    goto :goto_e

    .line 936
    :cond_14
    const/4 v14, 0x0

    .line 937
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 938
    .line 939
    .line 940
    new-instance v6, Lyyds/ᛵᲀᲈᛴ;

    .line 941
    .line 942
    const/16 v7, 0xc

    .line 943
    .line 944
    invoke-direct {v6, v3, v1, v5, v7}, Lyyds/ᛵᲀᲈᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 948
    .line 949
    .line 950
    :goto_e
    new-instance v2, Lyyds/ᛶᛷᛲᲁ;

    .line 951
    .line 952
    const/16 v3, 0x10

    .line 953
    .line 954
    invoke-direct {v2, v1, v3, v0}, Lyyds/ᛶᛷᛲᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 958
    .line 959
    .line 960
    return-void

    .line 961
    :cond_15
    instance-of v3, v1, Lyyds/ᲈᲁᛴᛶ;

    .line 962
    .line 963
    if-eqz v3, :cond_21

    .line 964
    .line 965
    check-cast v1, Lyyds/ᲈᲁᛴᛶ;

    .line 966
    .line 967
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    check-cast v0, Lyyds/ᛱᛷᲁᲁ;

    .line 972
    .line 973
    const-wide v2, -0xda98e68a836eL

    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    iget-object v2, v0, Lyyds/ᛱᛷᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 982
    .line 983
    iget-object v3, v0, Lyyds/ᛱᛷᲁᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 984
    .line 985
    iget-object v4, v1, Lyyds/ᲈᲁᛴᛶ;->ᛳᛸᛴᛶ:Landroid/widget/LinearLayout;

    .line 986
    .line 987
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 988
    .line 989
    .line 990
    new-instance v5, Landroid/widget/LinearLayout;

    .line 991
    .line 992
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 993
    .line 994
    .line 995
    move-result-object v6

    .line 996
    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 997
    .line 998
    .line 999
    const/4 v14, 0x0

    .line 1000
    invoke-virtual {v5, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1001
    .line 1002
    .line 1003
    const/16 v6, 0x10

    .line 1004
    .line 1005
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1006
    .line 1007
    .line 1008
    new-instance v6, Landroid/widget/ImageView;

    .line 1009
    .line 1010
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v7

    .line 1014
    invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1015
    .line 1016
    .line 1017
    iget-object v1, v1, Lyyds/ᲈᲁᛴᛶ;->ᛶᲈᛴᲈ:Lyyds/ᛱᛷᛲᲀ;

    .line 1018
    .line 1019
    iget-object v7, v1, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 1020
    .line 1021
    iget-object v1, v0, Lyyds/ᛱᛷᲁᲁ;->ᲇᲇᲇᛱ:Landroid/graphics/drawable/Drawable;

    .line 1022
    .line 1023
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 1027
    .line 1028
    sget-object v8, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 1029
    .line 1030
    const/16 v8, 0x2e

    .line 1031
    .line 1032
    invoke-virtual {v7, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1033
    .line 1034
    .line 1035
    move-result v9

    .line 1036
    invoke-virtual {v7, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1037
    .line 1038
    .line 1039
    move-result v8

    .line 1040
    invoke-direct {v1, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v6, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v15, 0x1

    .line 1047
    invoke-virtual {v6, v15}, Landroid/view/View;->setClipToOutline(Z)V

    .line 1048
    .line 1049
    .line 1050
    new-instance v1, Lyyds/ᲈᛴᲁᛲ;

    .line 1051
    .line 1052
    const/4 v14, 0x0

    .line 1053
    invoke-direct {v1, v7, v14}, Lyyds/ᲈᛴᲁᛲ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v6, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v6, v15}, Landroid/view/View;->setClickable(Z)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v6, v15}, Landroid/view/View;->setFocusable(Z)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v1, Landroid/util/TypedValue;

    .line 1066
    .line 1067
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v8

    .line 1074
    invoke-virtual {v8}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v8

    .line 1078
    const v9, 0x101045c

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v8, v9, v1, v15}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v8

    .line 1088
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 1089
    .line 1090
    invoke-virtual {v8, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-virtual {v6, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v1, Lyyds/ᛳᛴᛷᲁ;

    .line 1098
    .line 1099
    invoke-direct {v1, v7, v6, v15}, Lyyds/ᛳᛴᛷᲁ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;Landroid/widget/ImageView;I)V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1106
    .line 1107
    .line 1108
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1109
    .line 1110
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v6

    .line 1114
    invoke-direct {v1, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v1, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1118
    .line 1119
    .line 1120
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1121
    .line 1122
    const/4 v14, -0x2

    .line 1123
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1124
    .line 1125
    const/4 v10, 0x0

    .line 1126
    invoke-direct {v6, v10, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1127
    .line 1128
    .line 1129
    const/16 v8, 0xc

    .line 1130
    .line 1131
    invoke-virtual {v7, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1132
    .line 1133
    .line 1134
    move-result v8

    .line 1135
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1136
    .line 1137
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1138
    .line 1139
    .line 1140
    new-instance v6, Landroid/widget/TextView;

    .line 1141
    .line 1142
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v8

    .line 1146
    invoke-direct {v6, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v8, v0, Lyyds/ᛱᛷᲁᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 1150
    .line 1151
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1152
    .line 1153
    .line 1154
    const/high16 v8, 0x41880000    # 17.0f

    .line 1155
    .line 1156
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1157
    .line 1158
    .line 1159
    sget-object v15, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1160
    .line 1161
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1162
    .line 1163
    .line 1164
    const v8, 0x660600f4

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v7, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1168
    .line 1169
    .line 1170
    move-result v9

    .line 1171
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1172
    .line 1173
    .line 1174
    const/4 v9, 0x1

    .line 1175
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1176
    .line 1177
    .line 1178
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1179
    .line 1180
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1184
    .line 1185
    .line 1186
    new-instance v6, Landroid/widget/TextView;

    .line 1187
    .line 1188
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v10

    .line 1192
    invoke-direct {v6, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1196
    .line 1197
    .line 1198
    const/high16 v10, 0x41400000    # 12.0f

    .line 1199
    .line 1200
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1201
    .line 1202
    .line 1203
    const v11, 0x66060102

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v7, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1207
    .line 1208
    .line 1209
    move-result v12

    .line 1210
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1211
    .line 1212
    .line 1213
    const/4 v11, 0x3

    .line 1214
    invoke-virtual {v7, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1215
    .line 1216
    .line 1217
    move-result v11

    .line 1218
    const/4 v12, 0x0

    .line 1219
    invoke-virtual {v6, v12, v11, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1220
    .line 1221
    .line 1222
    const/4 v11, 0x1

    .line 1223
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1233
    .line 1234
    .line 1235
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1236
    .line 1237
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v6

    .line 1241
    invoke-direct {v1, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1245
    .line 1246
    .line 1247
    const v6, 0x800005

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1251
    .line 1252
    .line 1253
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1254
    .line 1255
    invoke-direct {v11, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1256
    .line 1257
    .line 1258
    const/16 v12, 0xa

    .line 1259
    .line 1260
    invoke-virtual {v7, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1261
    .line 1262
    .line 1263
    move-result v12

    .line 1264
    iput v12, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1265
    .line 1266
    invoke-virtual {v1, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1267
    .line 1268
    .line 1269
    iget-boolean v11, v0, Lyyds/ᛱᛷᲁᲁ;->ᛱᲈᲁ:Z

    .line 1270
    .line 1271
    move v12, v10

    .line 1272
    invoke-virtual {v7, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 1273
    .line 1274
    .line 1275
    move-result v10

    .line 1276
    move v13, v8

    .line 1277
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v8

    .line 1281
    const-wide v21, -0xdaafe68a836eL

    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    if-eqz v11, :cond_16

    .line 1290
    .line 1291
    const-wide v21, -0xdabfe68a836eL

    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    :goto_f
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v16

    .line 1300
    const v12, 0x6606004a

    .line 1301
    .line 1302
    .line 1303
    goto :goto_10

    .line 1304
    :cond_16
    const-wide v21, -0xdac3e68a836eL

    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    goto :goto_f

    .line 1310
    :goto_10
    invoke-virtual {v7, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1311
    .line 1312
    .line 1313
    move-result v12

    .line 1314
    const v13, 0x3dcccccd    # 0.1f

    .line 1315
    .line 1316
    .line 1317
    invoke-static {v10, v12, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 1318
    .line 1319
    .line 1320
    move-result v12

    .line 1321
    move v13, v11

    .line 1322
    move v11, v12

    .line 1323
    const/4 v12, 0x0

    .line 1324
    move/from16 v20, v13

    .line 1325
    .line 1326
    const/4 v13, 0x1

    .line 1327
    move-object/from16 v24, v9

    .line 1328
    .line 1329
    move-object/from16 v9, v16

    .line 1330
    .line 1331
    move/from16 v25, v20

    .line 1332
    .line 1333
    invoke-virtual/range {v7 .. v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;IILjava/lang/Integer;Z)Landroid/widget/TextView;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v8

    .line 1337
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 1338
    .line 1339
    invoke-direct {v9, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1346
    .line 1347
    .line 1348
    iget-object v8, v7, Lcom/ss/android/ugc/awemes/MainActivity;->ᛶᛸᲀᲁ:Ljava/util/Set;

    .line 1349
    .line 1350
    if-nez v8, :cond_17

    .line 1351
    .line 1352
    sget-object v2, Lyyds/ᲈᛴᲇᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛴᲇᛴ;

    .line 1353
    .line 1354
    goto :goto_11

    .line 1355
    :cond_17
    invoke-interface {v8, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v2

    .line 1359
    if-eqz v2, :cond_18

    .line 1360
    .line 1361
    sget-object v2, Lyyds/ᲈᛴᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛴᲇᛴ;

    .line 1362
    .line 1363
    goto :goto_11

    .line 1364
    :cond_18
    sget-object v2, Lyyds/ᲈᛴᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛴᲇᛴ;

    .line 1365
    .line 1366
    :goto_11
    sget-object v8, Lyyds/ᲈᛴᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛴᲇᛴ;

    .line 1367
    .line 1368
    if-eq v2, v8, :cond_1b

    .line 1369
    .line 1370
    new-instance v8, Landroid/widget/TextView;

    .line 1371
    .line 1372
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v9

    .line 1376
    invoke-direct {v8, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1377
    .line 1378
    .line 1379
    sget-object v9, Lyyds/ᲈᛴᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛴᲇᛴ;

    .line 1380
    .line 1381
    if-ne v2, v9, :cond_19

    .line 1382
    .line 1383
    const-wide v10, -0xdaa2e68a836eL

    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v10

    .line 1392
    goto :goto_12

    .line 1393
    :cond_19
    const-wide v10, -0xdaa9e68a836eL

    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v10

    .line 1402
    :goto_12
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1403
    .line 1404
    .line 1405
    const/high16 v10, 0x41300000    # 11.0f

    .line 1406
    .line 1407
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 1411
    .line 1412
    .line 1413
    if-ne v2, v9, :cond_1a

    .line 1414
    .line 1415
    const v2, 0x6606010d

    .line 1416
    .line 1417
    .line 1418
    goto :goto_13

    .line 1419
    :cond_1a
    const v2, 0x66060102

    .line 1420
    .line 1421
    .line 1422
    :goto_13
    invoke-virtual {v7, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1423
    .line 1424
    .line 1425
    move-result v2

    .line 1426
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1427
    .line 1428
    .line 1429
    const/4 v9, 0x1

    .line 1430
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1431
    .line 1432
    .line 1433
    const/4 v2, 0x2

    .line 1434
    invoke-virtual {v7, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1435
    .line 1436
    .line 1437
    move-result v2

    .line 1438
    const/4 v14, 0x0

    .line 1439
    invoke-virtual {v8, v14, v2, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1443
    .line 1444
    .line 1445
    :cond_1b
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1449
    .line 1450
    .line 1451
    new-instance v1, Landroid/widget/TextView;

    .line 1452
    .line 1453
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v2

    .line 1457
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1458
    .line 1459
    .line 1460
    iget-object v2, v0, Lyyds/ᛱᛷᲁᲁ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 1461
    .line 1462
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v5

    .line 1466
    if-eqz v5, :cond_1c

    .line 1467
    .line 1468
    const-wide v5, -0xdac7e68a836eL

    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v2

    .line 1477
    :cond_1c
    invoke-static {v3}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v5

    .line 1481
    if-eqz v5, :cond_1d

    .line 1482
    .line 1483
    const-wide v5, -0xdac9e68a836eL

    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v5

    .line 1492
    goto :goto_14

    .line 1493
    :cond_1d
    move-object v5, v3

    .line 1494
    :goto_14
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1495
    .line 1496
    const-wide v8, -0xdacde68a836eL

    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v8

    .line 1505
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1509
    .line 1510
    .line 1511
    const-wide v8, -0xdad3e68a836eL

    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v2

    .line 1520
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v2

    .line 1530
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1531
    .line 1532
    .line 1533
    const/high16 v12, 0x41400000    # 12.0f

    .line 1534
    .line 1535
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v3}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v2

    .line 1542
    if-eqz v2, :cond_1e

    .line 1543
    .line 1544
    const v2, 0x6606010d

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v7, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1548
    .line 1549
    .line 1550
    move-result v2

    .line 1551
    goto :goto_15

    .line 1552
    :cond_1e
    const v13, 0x660600f4

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v7, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1556
    .line 1557
    .line 1558
    move-result v2

    .line 1559
    :goto_15
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1560
    .line 1561
    .line 1562
    const/4 v9, 0x1

    .line 1563
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1564
    .line 1565
    .line 1566
    move-object/from16 v2, v24

    .line 1567
    .line 1568
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1569
    .line 1570
    .line 1571
    const/4 v2, 0x6

    .line 1572
    invoke-virtual {v7, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1573
    .line 1574
    .line 1575
    move-result v2

    .line 1576
    const/4 v14, 0x0

    .line 1577
    invoke-virtual {v1, v14, v2, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1581
    .line 1582
    .line 1583
    const-wide v1, -0xda9ce68a836eL

    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v1

    .line 1592
    new-instance v2, Landroid/widget/TextView;

    .line 1593
    .line 1594
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v5

    .line 1598
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1608
    .line 1609
    .line 1610
    const v11, 0x66060102

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v7, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1614
    .line 1615
    .line 1616
    move-result v1

    .line 1617
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1618
    .line 1619
    .line 1620
    const/16 v6, 0x8

    .line 1621
    .line 1622
    invoke-virtual {v7, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1623
    .line 1624
    .line 1625
    move-result v1

    .line 1626
    const/4 v14, 0x0

    .line 1627
    invoke-virtual {v2, v14, v1, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1631
    .line 1632
    .line 1633
    iget-object v0, v0, Lyyds/ᛱᛷᲁᲁ;->ᛶᛷᛲᲁ:Ljava/util/List;

    .line 1634
    .line 1635
    move/from16 v13, v25

    .line 1636
    .line 1637
    invoke-virtual {v7, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 1638
    .line 1639
    .line 1640
    move-result v1

    .line 1641
    new-instance v2, Lyyds/ᲁᛵᛲᲀ;

    .line 1642
    .line 1643
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v5

    .line 1647
    const-wide v8, -0xdad7e68a836eL

    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    invoke-direct {v2, v5}, Lyyds/ᲁᛵᛲᲀ;-><init>(Landroid/content/Context;)V

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v7, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 1659
    .line 1660
    .line 1661
    move-result v5

    .line 1662
    invoke-virtual {v2, v14, v5, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 1663
    .line 1664
    .line 1665
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1666
    .line 1667
    .line 1668
    move-result v5

    .line 1669
    if-eqz v5, :cond_1f

    .line 1670
    .line 1671
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v8

    .line 1675
    const-wide v0, -0xdae7e68a836eL

    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    const-wide v0, -0xdaf7e68a836eL

    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v9

    .line 1692
    const v11, 0x66060102

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v7, v11}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1696
    .line 1697
    .line 1698
    move-result v10

    .line 1699
    const v0, 0x6606010a

    .line 1700
    .line 1701
    .line 1702
    invoke-virtual {v7, v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 1703
    .line 1704
    .line 1705
    move-result v11

    .line 1706
    const/4 v12, 0x0

    .line 1707
    const/4 v13, 0x0

    .line 1708
    invoke-virtual/range {v7 .. v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;IILjava/lang/Integer;Z)Landroid/widget/TextView;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v0

    .line 1712
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1713
    .line 1714
    .line 1715
    goto :goto_17

    .line 1716
    :cond_1f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v0

    .line 1720
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1721
    .line 1722
    .line 1723
    move-result v5

    .line 1724
    if-eqz v5, :cond_20

    .line 1725
    .line 1726
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v5

    .line 1730
    check-cast v5, Ljava/lang/String;

    .line 1731
    .line 1732
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v6

    .line 1736
    const-wide v8, -0xdafee68a836eL

    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    invoke-static {v5, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v8

    .line 1748
    invoke-virtual {v7, v6, v5, v8, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲇᛲᛱ(Landroid/content/Context;Ljava/lang/String;ZI)Landroid/widget/TextView;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v5

    .line 1752
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1753
    .line 1754
    .line 1755
    goto :goto_16

    .line 1756
    :cond_20
    :goto_17
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1757
    .line 1758
    .line 1759
    :cond_21
    return-void

    .line 1760
    nop

    .line 1761
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    :array_1
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method

.method public final ᛲᲈᲁ()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛱᛷᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    :goto_0
    add-int/2addr v1, p0

    .line 21
    return v1
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛱᛷᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛶᲁᲀ;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 18
    .line 19
    sget-object v0, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 20
    .line 21
    if-ne p0, v0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x2

    .line 26
    return p0
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛱᛸᛳᛵ;)V
    .locals 2

    .line 1
    const-wide v0, -0x5524ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    instance-of p0, p1, Lyyds/ᲀᛷᲀᛶ;

    .line 10
    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    check-cast p1, Lyyds/ᲀᛷᲀᛶ;

    .line 14
    .line 15
    iget-object p0, p1, Lyyds/ᲀᛷᲀᛶ;->ᛳᛸᛴᛶ:Lyyds/ᛳᛲᛸᛳ;

    .line 16
    .line 17
    iget-object p1, p0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛴᛳᛲ:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lyyds/ᛳᛲᛸᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛳᛶᲇ;

    .line 27
    .line 28
    iget-object v0, p1, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    iput-object v0, p1, Lyyds/ᛱᛳᛶᲇ;->ᲇᲇᲇᛱ:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    iget-object p1, p0, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-object v0, p0, Lyyds/ᛳᛲᛸᛳ;->ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-wide v2, -0x55230e68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    const v2, 0x3f3d70a4    # 0.74f

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const/16 v4, 0xc

    .line 18
    .line 19
    const/4 v5, -0x2

    .line 20
    const v6, 0x66060075

    .line 21
    .line 22
    .line 23
    const/16 v7, 0x10

    .line 24
    .line 25
    const v8, 0x6606004a

    .line 26
    .line 27
    .line 28
    const/16 v9, 0xe

    .line 29
    .line 30
    const/4 v10, -0x1

    .line 31
    iget-object v11, v0, Lyyds/ᛱᛷᛲᲀ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 32
    .line 33
    const/4 v12, 0x1

    .line 34
    if-eq v1, v12, :cond_1

    .line 35
    .line 36
    const/4 v13, 0x3

    .line 37
    if-eq v1, v13, :cond_0

    .line 38
    .line 39
    new-instance v1, Lyyds/ᲈᲁᛴᛶ;

    .line 40
    .line 41
    new-instance v2, Landroid/widget/LinearLayout;

    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 51
    .line 52
    .line 53
    sget-object v3, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v11, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v11, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {v11, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {v11, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-static {v3, v7, v6, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-virtual {v2, v3}, Landroid/view/View;->setElevation(F)V

    .line 94
    .line 95
    .line 96
    new-instance v3, Lyyds/ᲇᲁᛲᲀ;

    .line 97
    .line 98
    invoke-direct {v3, v10, v5}, Lyyds/ᲇᲁᛲᲀ;-><init>(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v1, v0, v2}, Lyyds/ᲈᲁᛴᛶ;-><init>(Lyyds/ᛱᛷᛲᲀ;Landroid/widget/LinearLayout;)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_0
    new-instance v0, Lyyds/ᛳᛲᛸᛳ;

    .line 115
    .line 116
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-wide v4, -0x55237e68a836eL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, v11, v1}, Lyyds/ᛳᛲᛸᛳ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Lyyds/ᲇᲁᛲᲀ;

    .line 132
    .line 133
    sget-object v4, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 134
    .line 135
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 144
    .line 145
    int-to-float v4, v4

    .line 146
    mul-float/2addr v4, v2

    .line 147
    float-to-int v2, v4

    .line 148
    invoke-direct {v1, v2, v10}, Lyyds/ᲇᲁᛲᲀ;-><init>(II)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 156
    .line 157
    const/4 v2, 0x4

    .line 158
    invoke-virtual {v11, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Lyyds/ᲀᛷᲀᛶ;

    .line 168
    .line 169
    invoke-direct {v1, v0}, Lyyds/ᲀᛷᲀᛶ;-><init>(Lyyds/ᛳᛲᛸᛳ;)V

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :cond_1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 174
    .line 175
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 186
    .line 187
    .line 188
    sget-object v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 189
    .line 190
    const/16 v1, 0x14

    .line 191
    .line 192
    invoke-virtual {v11, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    const/16 v14, 0x22

    .line 197
    .line 198
    invoke-virtual {v11, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    invoke-virtual {v11, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v11, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    invoke-virtual {v0, v13, v15, v1, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v11, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-virtual {v11, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    invoke-virtual {v11, v6}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    invoke-static {v1, v13, v6, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 238
    .line 239
    .line 240
    new-instance v1, Lyyds/ᲇᲁᛲᲀ;

    .line 241
    .line 242
    invoke-direct {v1, v10, v5}, Lyyds/ᲇᲁᛲᲀ;-><init>(II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    .line 253
    .line 254
    new-instance v1, Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41800000    # 16.0f

    .line 264
    .line 265
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 266
    .line 267
    .line 268
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 269
    .line 270
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 271
    .line 272
    .line 273
    const/16 v6, 0x11

    .line 274
    .line 275
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 276
    .line 277
    .line 278
    const v13, 0x660600f4

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11, v13}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    new-instance v1, Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    invoke-direct {v1, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 298
    .line 299
    .line 300
    const/high16 v13, 0x41500000    # 13.0f

    .line 301
    .line 302
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 306
    .line 307
    .line 308
    const v14, 0x66060102

    .line 309
    .line 310
    .line 311
    invoke-virtual {v11, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 316
    .line 317
    .line 318
    const/16 v14, 0x8

    .line 319
    .line 320
    invoke-virtual {v11, v14}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 321
    .line 322
    .line 323
    move-result v15

    .line 324
    move/from16 v16, v2

    .line 325
    .line 326
    const/4 v2, 0x0

    .line 327
    invoke-virtual {v1, v2, v15, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    const/high16 v3, 0x3f800000    # 1.0f

    .line 335
    .line 336
    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    new-instance v1, Landroid/widget/TextView;

    .line 343
    .line 344
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v11, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    const/4 v3, 0x7

    .line 372
    invoke-virtual {v11, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    invoke-virtual {v11, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    invoke-virtual {v11, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    invoke-virtual {v1, v2, v4, v9, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 385
    .line 386
    .line 387
    const/16 v2, 0x30

    .line 388
    .line 389
    invoke-virtual {v11, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-virtual {v1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 394
    .line 395
    .line 396
    const/16 v2, 0x58

    .line 397
    .line 398
    invoke-virtual {v11, v2}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-virtual {v11, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    const v4, 0x3dcccccd    # 0.1f

    .line 414
    .line 415
    .line 416
    invoke-static {v2, v3, v4}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    const/16 v3, 0x3e7

    .line 421
    .line 422
    invoke-virtual {v11, v3}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛱᛳᲇ(I)F

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲀᛴᲁᲈ(Z)I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    invoke-virtual {v11, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛶᲁ(I)I

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    const v9, 0x3e99999a    # 0.3f

    .line 435
    .line 436
    .line 437
    invoke-static {v4, v8, v9}, Lcom/ss/android/ugc/awemes/MainActivity;->ᲇᲈᛵᛷ(IIF)I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {v11, v12}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    invoke-static {v2, v3, v4, v8}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛳᛴᛸ(IFLjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1, v12}, Landroid/view/View;->setClickable(Z)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 463
    .line 464
    .line 465
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 466
    .line 467
    invoke-direct {v2, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v11, v7}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛲᲈᲈ(I)I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 475
    .line 476
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 480
    .line 481
    .line 482
    iget-object v1, v11, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᛸᲇᛶ:Lyyds/ᛱᛴᲁᛲ;

    .line 483
    .line 484
    sget-object v2, Lyyds/ᛱᛴᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛴᲁᛲ;

    .line 485
    .line 486
    if-ne v1, v2, :cond_2

    .line 487
    .line 488
    new-instance v1, Lyyds/ᲇᲁᛲᲀ;

    .line 489
    .line 490
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 499
    .line 500
    int-to-float v2, v2

    .line 501
    mul-float v2, v2, v16

    .line 502
    .line 503
    float-to-int v2, v2

    .line 504
    invoke-direct {v1, v2, v10}, Lyyds/ᲇᲁᛲᲀ;-><init>(II)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 511
    .line 512
    .line 513
    :cond_2
    new-instance v1, Lyyds/ᲁᛸᲁᲀ;

    .line 514
    .line 515
    invoke-direct {v1, v0}, Lyyds/ᲁᛸᲁᲀ;-><init>(Landroid/widget/LinearLayout;)V

    .line 516
    .line 517
    .line 518
    return-object v1
.end method
