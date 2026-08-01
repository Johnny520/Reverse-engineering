.class public final Lx4;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv41;
.implements Ldp;
.implements Ltz0;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/appcompat/app/β;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/β;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx4;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public α(Liz0;Z)V
    .locals 8

    .line 1
    iget v0, p0, Lx4;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Liz0;->λ()Liz0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object p0, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 21
    .line 22
    iget-object v4, p0, Landroidx/appcompat/app/β;->Σ:[Lg5;

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v5, v1

    .line 29
    :goto_1
    if-ge v1, v5, :cond_4

    .line 30
    .line 31
    aget-object v6, v4, v1

    .line 32
    .line 33
    if-eqz v6, :cond_3

    .line 34
    .line 35
    iget-object v7, v6, Lg5;->θ:Liz0;

    .line 36
    .line 37
    if-ne v7, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v6, 0x0

    .line 44
    :goto_2
    if-eqz v6, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v6, Lg5;->α:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, v6, v0}, Landroidx/appcompat/app/β;->π(ILg5;Liz0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v6, v2}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {p0, v6, p2}, Landroidx/appcompat/app/β;->σ(Lg5;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p0, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/β;->ρ(Liz0;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public η(Landroid/view/View;Loc2;)Loc2;
    .locals 14

    .line 1
    invoke-virtual/range {p2 .. p2}, Loc2;->δ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Loc2;->δ()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Landroidx/appcompat/app/β;->Β:Landroidx/appcompat/widget/ActionBarContextView;

    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_e

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    instance-of v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 25
    .line 26
    if-eqz v3, :cond_e

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/appcompat/app/β;->Β:Landroidx/appcompat/widget/ActionBarContextView;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    iget-object v6, p0, Landroidx/appcompat/app/β;->Β:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/View;->isShown()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x1

    .line 43
    if-eqz v6, :cond_c

    .line 44
    .line 45
    iget-object v6, p0, Landroidx/appcompat/app/β;->к:Landroid/graphics/Rect;

    .line 46
    .line 47
    if-nez v6, :cond_0

    .line 48
    .line 49
    new-instance v6, Landroid/graphics/Rect;

    .line 50
    .line 51
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v6, p0, Landroidx/appcompat/app/β;->к:Landroid/graphics/Rect;

    .line 55
    .line 56
    new-instance v6, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v6, p0, Landroidx/appcompat/app/β;->л:Landroid/graphics/Rect;

    .line 62
    .line 63
    :cond_0
    iget-object v6, p0, Landroidx/appcompat/app/β;->к:Landroid/graphics/Rect;

    .line 64
    .line 65
    iget-object v8, p0, Landroidx/appcompat/app/β;->л:Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Loc2;->β()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-virtual/range {p2 .. p2}, Loc2;->δ()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    invoke-virtual/range {p2 .. p2}, Loc2;->γ()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    invoke-virtual/range {p2 .. p2}, Loc2;->α()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-virtual {v6, v9, v10, v11, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 84
    .line 85
    .line 86
    iget-object v9, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 87
    .line 88
    invoke-static {v9, v6, v8}, Lca2;->α(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 89
    .line 90
    .line 91
    iget v8, v6, Landroid/graphics/Rect;->top:I

    .line 92
    .line 93
    iget v9, v6, Landroid/graphics/Rect;->left:I

    .line 94
    .line 95
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    iget-object v10, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 98
    .line 99
    sget-object v11, Lb92;->α:Ljava/util/WeakHashMap;

    .line 100
    .line 101
    invoke-static {v10}, Lv82;->α(Landroid/view/View;)Loc2;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-nez v10, :cond_1

    .line 106
    .line 107
    move v11, v5

    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v10}, Loc2;->β()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    :goto_0
    if-nez v10, :cond_2

    .line 114
    .line 115
    move v10, v5

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v10}, Loc2;->γ()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    :goto_1
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 122
    .line 123
    if-ne v12, v8, :cond_4

    .line 124
    .line 125
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 126
    .line 127
    if-ne v12, v9, :cond_4

    .line 128
    .line 129
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 130
    .line 131
    if-eq v12, v6, :cond_3

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    move v6, v5

    .line 135
    goto :goto_3

    .line 136
    :cond_4
    :goto_2
    iput v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 137
    .line 138
    iput v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 139
    .line 140
    iput v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 141
    .line 142
    move v6, v7

    .line 143
    :goto_3
    if-lez v8, :cond_5

    .line 144
    .line 145
    iget-object v8, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 146
    .line 147
    if-nez v8, :cond_5

    .line 148
    .line 149
    new-instance v8, Landroid/view/View;

    .line 150
    .line 151
    invoke-direct {v8, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    iput-object v8, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 155
    .line 156
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 160
    .line 161
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 162
    .line 163
    const/16 v12, 0x33

    .line 164
    .line 165
    const/4 v13, -0x1

    .line 166
    invoke-direct {v8, v13, v9, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 167
    .line 168
    .line 169
    iput v11, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 170
    .line 171
    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 172
    .line 173
    iget-object v9, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 174
    .line 175
    iget-object v10, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 176
    .line 177
    invoke-virtual {v9, v10, v13, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    iget-object v8, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 182
    .line 183
    if-eqz v8, :cond_7

    .line 184
    .line 185
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 190
    .line 191
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 192
    .line 193
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 194
    .line 195
    if-ne v9, v12, :cond_6

    .line 196
    .line 197
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 198
    .line 199
    if-ne v9, v11, :cond_6

    .line 200
    .line 201
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 202
    .line 203
    if-eq v9, v10, :cond_7

    .line 204
    .line 205
    :cond_6
    iput v12, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 206
    .line 207
    iput v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 208
    .line 209
    iput v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 210
    .line 211
    iget-object v9, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 212
    .line 213
    invoke-virtual {v9, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    :goto_4
    iget-object v8, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 217
    .line 218
    if-eqz v8, :cond_8

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_8
    move v7, v5

    .line 222
    :goto_5
    if-eqz v7, :cond_a

    .line 223
    .line 224
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-eqz v8, :cond_a

    .line 229
    .line 230
    iget-object v8, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 231
    .line 232
    invoke-virtual {v8}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    and-int/lit16 v9, v9, 0x2000

    .line 237
    .line 238
    if-eqz v9, :cond_9

    .line 239
    .line 240
    const v9, 0x7f060006

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    goto :goto_6

    .line 248
    :cond_9
    const v9, 0x7f060005

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    :goto_6
    invoke-virtual {v8, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 256
    .line 257
    .line 258
    :cond_a
    iget-boolean v1, p0, Landroidx/appcompat/app/β;->Ξ:Z

    .line 259
    .line 260
    if-nez v1, :cond_b

    .line 261
    .line 262
    if-eqz v7, :cond_b

    .line 263
    .line 264
    move v2, v5

    .line 265
    :cond_b
    move v1, v7

    .line 266
    move v7, v6

    .line 267
    goto :goto_7

    .line 268
    :cond_c
    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 269
    .line 270
    if-eqz v1, :cond_d

    .line 271
    .line 272
    iput v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 273
    .line 274
    move v1, v5

    .line 275
    goto :goto_7

    .line 276
    :cond_d
    move v1, v5

    .line 277
    move v7, v1

    .line 278
    :goto_7
    if-eqz v7, :cond_f

    .line 279
    .line 280
    iget-object v6, p0, Landroidx/appcompat/app/β;->Β:Landroidx/appcompat/widget/ActionBarContextView;

    .line 281
    .line 282
    invoke-virtual {v6, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_e
    move v1, v5

    .line 287
    :cond_f
    :goto_8
    iget-object p0, p0, Landroidx/appcompat/app/β;->Ι:Landroid/view/View;

    .line 288
    .line 289
    if-eqz p0, :cond_11

    .line 290
    .line 291
    if-eqz v1, :cond_10

    .line 292
    .line 293
    move v4, v5

    .line 294
    :cond_10
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    :cond_11
    if-eq v0, v2, :cond_12

    .line 298
    .line 299
    invoke-virtual/range {p2 .. p2}, Loc2;->β()I

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    invoke-virtual/range {p2 .. p2}, Loc2;->γ()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual/range {p2 .. p2}, Loc2;->α()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    move-object/from16 v3, p2

    .line 312
    .line 313
    invoke-virtual {v3, p0, v2, v0, v1}, Loc2;->ζ(IIII)Loc2;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    goto :goto_9

    .line 318
    :cond_12
    move-object/from16 v3, p2

    .line 319
    .line 320
    move-object p0, v3

    .line 321
    :goto_9
    invoke-static {p1, p0}, Lb92;->δ(Landroid/view/View;Loc2;)Loc2;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0
.end method

.method public λ(Liz0;)Z
    .locals 1

    .line 1
    iget v0, p0, Lx4;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Liz0;->λ()Liz0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-boolean p0, p0, Landroidx/appcompat/app/β;->Ψ:Z

    .line 27
    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    const/16 p0, 0x6c

    .line 31
    .line 32
    invoke-interface {v0, p0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :pswitch_0
    iget-object p0, p0, Lx4;->ζ:Landroidx/appcompat/app/β;

    .line 38
    .line 39
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    const/16 v0, 0x6c

    .line 48
    .line 49
    invoke-interface {p0, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
