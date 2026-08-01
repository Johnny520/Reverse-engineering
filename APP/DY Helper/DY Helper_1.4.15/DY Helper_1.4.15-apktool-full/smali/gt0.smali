.class public final Lgt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Li0;

.field public final β:Lw0;

.field public final γ:Lw0;

.field public final δ:Ljava/lang/ref/WeakReference;

.field public final ε:Lx91;

.field public final ζ:Ljava/util/LinkedHashMap;

.field public final η:Ljava/util/LinkedHashSet;

.field public final θ:Lns0;

.field public ι:Z

.field public κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

.field public λ:Lqt0;

.field public μ:Z

.field public final ν:Ldn0;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Li0;Lw0;Lw0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lgt0;->α:Li0;

    .line 11
    .line 12
    iput-object p3, p0, Lgt0;->β:Lw0;

    .line 13
    .line 14
    iput-object p4, p0, Lgt0;->γ:Lw0;

    .line 15
    .line 16
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lgt0;->δ:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    sget-object p2, Lps0;->ζ:Lps0;

    .line 24
    .line 25
    invoke-static {p2}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lgt0;->ε:Lx91;

    .line 30
    .line 31
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lgt0;->ζ:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 39
    .line 40
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lgt0;->η:Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    new-instance p2, Lns0;

    .line 46
    .line 47
    new-instance p3, Ldt0;

    .line 48
    .line 49
    const/4 p4, 0x0

    .line 50
    invoke-direct {p3, p0, p4}, Ldt0;-><init>(Lgt0;I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p2, p3}, Lns0;-><init>(Ldt0;)V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, Lgt0;->θ:Lns0;

    .line 57
    .line 58
    new-instance p2, Ldn0;

    .line 59
    .line 60
    const/4 p3, 0x1

    .line 61
    invoke-direct {p2, p3, p0}, Ldn0;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Lgt0;->ν:Ldn0;

    .line 65
    .line 66
    new-instance p2, Lk2;

    .line 67
    .line 68
    const/4 p3, 0x3

    .line 69
    invoke-direct {p2, p3, p0}, Lk2;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final α(Landroid/view/ViewGroup;F)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-ne v4, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v3

    .line 18
    :goto_0
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_1
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 27
    .line 28
    .line 29
    cmpg-float v2, v2, v4

    .line 30
    .line 31
    const/high16 v5, 0x3f800000    # 1.0f

    .line 32
    .line 33
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 34
    .line 35
    const/high16 v7, 0x3f000000    # 0.5f

    .line 36
    .line 37
    if-gtz v2, :cond_2

    .line 38
    .line 39
    move/from16 v2, p2

    .line 40
    .line 41
    invoke-static {v2, v7, v6}, Lj81;->λ(FFF)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    move v13, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v13, v5

    .line 48
    :goto_1
    new-instance v2, Lqt0;

    .line 49
    .line 50
    invoke-direct {v2}, Lqt0;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v15, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-direct {v15, v8}, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    cmpg-float v8, v8, v4

    .line 70
    .line 71
    if-gtz v8, :cond_3

    .line 72
    .line 73
    invoke-static {v13, v7, v6}, Lj81;->λ(FFF)F

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move v8, v5

    .line 79
    :goto_2
    iput v8, v15, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->η:F

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-virtual {v15, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v15, v8}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 86
    .line 87
    .line 88
    const/4 v9, 0x1

    .line 89
    invoke-virtual {v15, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 101
    .line 102
    const/high16 v11, 0x42400000    # 48.0f

    .line 103
    .line 104
    mul-float/2addr v10, v11

    .line 105
    invoke-virtual {v15, v10}, Landroid/view/View;->setElevation(F)V

    .line 106
    .line 107
    .line 108
    const/4 v10, 0x4

    .line 109
    invoke-virtual {v15, v10}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15}, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->getComposeView()Landroidx/compose/ui/platform/ComposeView;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    sget-object v12, Lxn0;->Η:Lxn0;

    .line 117
    .line 118
    invoke-virtual {v11, v12}, Landroidx/compose/ui/platform/AbstractComposeView;->setViewCompositionStrategy(Lf92;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11, v8}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v11, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-boolean v14, v2, Lqt0;->θ:Z

    .line 141
    .line 142
    if-nez v14, :cond_a

    .line 143
    .line 144
    const v14, 0x7f090386

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11, v14, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move/from16 v16, v4

    .line 151
    .line 152
    const v4, 0x7f090389

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v4, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const v4, 0x7f090388

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11, v4, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v12}, Lv71;->η(Landroid/view/View;)Lhr0;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v4, :cond_4

    .line 169
    .line 170
    invoke-virtual {v12, v14, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 174
    .line 175
    invoke-direct {v4, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iput-object v4, v2, Lqt0;->ι:Ljava/lang/ref/WeakReference;

    .line 179
    .line 180
    :cond_4
    instance-of v4, v1, Landroid/widget/FrameLayout;

    .line 181
    .line 182
    const/4 v12, -0x1

    .line 183
    if-nez v4, :cond_5

    .line 184
    .line 185
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 186
    .line 187
    invoke-direct {v4, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    cmpg-float v4, v4, v16

    .line 196
    .line 197
    if-gtz v4, :cond_6

    .line 198
    .line 199
    invoke-static {v13, v7, v6}, Lj81;->λ(FFF)F

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    :cond_6
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 212
    .line 213
    const/high16 v6, 0x42900000    # 72.0f

    .line 214
    .line 215
    mul-float/2addr v4, v6

    .line 216
    mul-float/2addr v4, v5

    .line 217
    invoke-static {v4}, Ljx0;->в(F)I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-ge v4, v9, :cond_7

    .line 222
    .line 223
    move v4, v9

    .line 224
    :cond_7
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 225
    .line 226
    const/16 v6, 0x50

    .line 227
    .line 228
    invoke-direct {v5, v12, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 229
    .line 230
    .line 231
    move-object v4, v1

    .line 232
    check-cast v4, Landroid/widget/FrameLayout;

    .line 233
    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    if-eqz v4, :cond_8

    .line 239
    .line 240
    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    invoke-virtual {v4, v6}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-eqz v4, :cond_8

    .line 249
    .line 250
    iget v8, v4, Landroid/graphics/Insets;->bottom:I

    .line 251
    .line 252
    :cond_8
    iput v8, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 253
    .line 254
    move-object v4, v5

    .line 255
    :goto_3
    new-instance v5, Let0;

    .line 256
    .line 257
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v15, v5}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 261
    .line 262
    .line 263
    iput-object v15, v0, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 264
    .line 265
    iput-object v2, v0, Lgt0;->λ:Lqt0;

    .line 266
    .line 267
    iget-object v2, v0, Lgt0;->ε:Lx91;

    .line 268
    .line 269
    invoke-virtual {v2}, Lx91;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    move-object v8, v5

    .line 274
    check-cast v8, Lps0;

    .line 275
    .line 276
    const/4 v12, 0x0

    .line 277
    const/16 v14, 0xf

    .line 278
    .line 279
    move v5, v9

    .line 280
    const/4 v9, 0x0

    .line 281
    move v6, v10

    .line 282
    const/4 v10, 0x0

    .line 283
    move-object v7, v11

    .line 284
    const/4 v11, 0x0

    .line 285
    invoke-static/range {v8 .. v14}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-virtual {v2, v8}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v15, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v15}, Landroid/view/View;->requestApplyInsets()V

    .line 296
    .line 297
    .line 298
    new-instance v2, Ldt0;

    .line 299
    .line 300
    invoke-direct {v2, v0, v5}, Ldt0;-><init>(Lgt0;I)V

    .line 301
    .line 302
    .line 303
    new-instance v4, Lan;

    .line 304
    .line 305
    const v8, -0x2bc1dce2

    .line 306
    .line 307
    .line 308
    invoke-direct {v4, v8, v5, v2}, Lan;-><init>(IZLm80;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v4}, Landroidx/compose/ui/platform/ComposeView;->setContent(Le80;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    const-string v2, "\u6db2\u6001\u73bb\u7483\u8986\u76d6\u5c42\u5df2\u6302\u8f7d: "

    .line 323
    .line 324
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iget-object v0, v0, Lgt0;->η:Ljava/util/LinkedHashSet;

    .line 329
    .line 330
    const-string v2, "overlay_attached"

    .line 331
    .line 332
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_9

    .line 337
    .line 338
    const-string v0, "ra2e8a11463d992df"

    .line 339
    .line 340
    invoke-static {v0, v1, v3, v6, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_9
    :goto_4
    return-void

    .line 344
    :cond_a
    const-string v0, "\u4e0d\u80fd\u5b89\u88c5\u5df2\u9500\u6bc1\u7684\u6db2\u6001\u73bb\u7483 Compose owner"

    .line 345
    .line 346
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return-void
.end method

.method public final β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lgt0;->η:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "ra2e8a11463d992df"

    .line 10
    .line 11
    invoke-static {p0, p2, p3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final γ(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgt0;->ε:Lx91;

    .line 2
    .line 3
    sget-object v1, Lps0;->ζ:Lps0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 9
    .line 10
    sget-object v1, Ls62;->α:Ls62;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->getComposeView()Landroidx/compose/ui/platform/ComposeView;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AbstractComposeView;->δ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    move-object v3, v1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v2

    .line 24
    new-instance v3, Leo1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    const-string v3, "dispose"

    .line 36
    .line 37
    const-string v4, "\u91ca\u653e\u73bb\u7483\u5e95\u680f\u7ec4\u5408\u5931\u8d25"

    .line 38
    .line 39
    invoke-virtual {p0, v3, v4, v2}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-ne v2, p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    move-object v0, v1

    .line 55
    goto :goto_3

    .line 56
    :goto_2
    new-instance v0, Leo1;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const-string v0, "remove"

    .line 68
    .line 69
    const-string v2, "\u79fb\u9664\u73bb\u7483\u5e95\u680f View \u5931\u8d25"

    .line 70
    .line 71
    invoke-virtual {p0, v0, v2, p1}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 76
    .line 77
    iget-object v0, p0, Lgt0;->λ:Lqt0;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    :try_start_2
    iget-boolean v2, v0, Lqt0;->θ:Z

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_3
    const/4 v2, 0x1

    .line 87
    iput-boolean v2, v0, Lqt0;->θ:Z

    .line 88
    .line 89
    iget-object v2, v0, Lqt0;->ι:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Landroid/view/View;

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-static {v2}, Lv71;->η(Landroid/view/View;)Lhr0;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-ne v3, v0, :cond_4

    .line 106
    .line 107
    const v3, 0x7f090386

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    iput-object p1, v0, Lqt0;->ι:Ljava/lang/ref/WeakReference;

    .line 114
    .line 115
    iget-object v2, v0, Lqt0;->ε:Ljr0;

    .line 116
    .line 117
    sget-object v3, Lcr0;->ε:Lcr0;

    .line 118
    .line 119
    const-string v4, "setCurrentState"

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljr0;->γ(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v3}, Ljr0;->ε(Lcr0;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v0, Lqt0;->η:Lq92;

    .line 128
    .line 129
    invoke-virtual {v0}, Lq92;->α()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    new-instance v1, Leo1;

    .line 135
    .line 136
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_4
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    const-string v1, "destroy_owner"

    .line 146
    .line 147
    const-string v2, "\u9500\u6bc1\u73bb\u7483\u5e95\u680f Compose owner \u5931\u8d25"

    .line 148
    .line 149
    invoke-virtual {p0, v1, v2, v0}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    iput-object p1, p0, Lgt0;->λ:Lqt0;

    .line 153
    .line 154
    iget-object p0, p0, Lgt0;->θ:Lns0;

    .line 155
    .line 156
    iget-wide v0, p0, Lns0;->κ:J

    .line 157
    .line 158
    const-wide/16 v2, 0x1

    .line 159
    .line 160
    add-long/2addr v0, v2

    .line 161
    iput-wide v0, p0, Lns0;->κ:J

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    iput-boolean v0, p0, Lns0;->ι:Z

    .line 165
    .line 166
    iget-object v1, p0, Lns0;->δ:[Landroid/graphics/Bitmap;

    .line 167
    .line 168
    invoke-static {v1}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v2}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    :goto_5
    move-object v3, v2

    .line 177
    check-cast v3, Lwm0;

    .line 178
    .line 179
    iget-boolean v4, v3, Lwm0;->η:Z

    .line 180
    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    aput-object p1, v1, v3

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_6
    iput-object p1, p0, Lns0;->ε:Landroid/graphics/Bitmap;

    .line 191
    .line 192
    iput v0, p0, Lns0;->ζ:I

    .line 193
    .line 194
    iput v0, p0, Lns0;->η:I

    .line 195
    .line 196
    const-wide/16 v0, 0x0

    .line 197
    .line 198
    iput-wide v0, p0, Lns0;->θ:J

    .line 199
    .line 200
    return-void
.end method

.method public final δ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgt0;->δ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Lsb;->α:Lsb;

    .line 12
    .line 13
    new-instance v1, Lη;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-direct {v1, v2, v0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lsb;->Ψ(Lp70;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lgt0;->ζ:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final ε(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgt0;->δ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, Ljg;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v1, p0, p1, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-boolean v1, p0, Lgt0;->ι:Z

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne p1, v1, :cond_2

    .line 41
    .line 42
    if-eqz p1, :cond_a

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lgt0;->ζ(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object v1, p0, Lgt0;->ν:Ldn0;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-nez p1, :cond_5

    .line 52
    .line 53
    iput-boolean v3, p0, Lgt0;->ι:Z

    .line 54
    .line 55
    iget-boolean p1, p0, Lgt0;->μ:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iput-boolean v3, p0, Lgt0;->μ:Z

    .line 74
    .line 75
    :goto_0
    invoke-virtual {p0}, Lgt0;->δ()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lgt0;->γ(Landroid/view/ViewGroup;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    :try_start_0
    iget-object p1, p0, Lgt0;->γ:Lw0;

    .line 83
    .line 84
    invoke-virtual {p1}, Lw0;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {p0, v0, p1}, Lgt0;->α(Landroid/view/ViewGroup;F)V

    .line 95
    .line 96
    .line 97
    iput-boolean v2, p0, Lgt0;->ι:Z

    .line 98
    .line 99
    iget-boolean p1, p0, Lgt0;->μ:Z

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_7

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_7
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 116
    .line 117
    .line 118
    iput-boolean v2, p0, Lgt0;->μ:Z

    .line 119
    .line 120
    :goto_1
    invoke-virtual {p0, v2}, Lgt0;->ζ(Z)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_0
    move-exception p1

    .line 127
    new-instance v2, Leo1;

    .line 128
    .line 129
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    move-object p1, v2

    .line 133
    :goto_2
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    iput-boolean v3, p0, Lgt0;->ι:Z

    .line 140
    .line 141
    iget-boolean v2, p0, Lgt0;->μ:Z

    .line 142
    .line 143
    if-nez v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_9

    .line 155
    .line 156
    invoke-virtual {v2, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    iput-boolean v3, p0, Lgt0;->μ:Z

    .line 160
    .line 161
    :goto_3
    invoke-virtual {p0}, Lgt0;->δ()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lgt0;->γ(Landroid/view/ViewGroup;)V

    .line 165
    .line 166
    .line 167
    const-string v0, "activate"

    .line 168
    .line 169
    const-string v1, "\u88c5\u914d\u6db2\u6001\u73bb\u7483\u5e95\u680f\u5931\u8d25\uff0c\u5df2\u6062\u590d\u5bbf\u4e3b\u539f\u5e95\u680f"

    .line 170
    .line 171
    invoke-virtual {p0, v0, v1, p1}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    :cond_a
    :goto_4
    return-void
.end method

.method public final ζ(Z)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lgt0;->ζ:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-boolean v2, v1, Lgt0;->ι:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_10

    .line 10
    .line 11
    :cond_0
    iget-object v2, v1, Lgt0;->δ:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto/16 :goto_10

    .line 22
    .line 23
    :cond_1
    iget-object v3, v1, Lgt0;->β:Lw0;

    .line 24
    .line 25
    invoke-virtual {v3}, Lw0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x0

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lgt0;->ε(Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_18

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-lez v3, :cond_18

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-gtz v3, :cond_3

    .line 59
    .line 60
    goto/16 :goto_10

    .line 61
    .line 62
    :cond_3
    :try_start_0
    iget-object v3, v1, Lgt0;->γ:Lw0;

    .line 63
    .line 64
    invoke-virtual {v3}, Lw0;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v1, v2, v3}, Lgt0;->η(Landroid/view/ViewGroup;F)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iget-object v5, v1, Lgt0;->α:Li0;

    .line 79
    .line 80
    invoke-virtual {v5, v2}, Li0;->η(Landroid/view/ViewGroup;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    :cond_4
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_5

    .line 98
    .line 99
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    move-object v9, v8

    .line 104
    check-cast v9, Lst0;

    .line 105
    .line 106
    iget-boolean v9, v9, Lst0;->θ:Z

    .line 107
    .line 108
    if-eqz v9, :cond_4

    .line 109
    .line 110
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    move-object v3, v1

    .line 116
    goto/16 :goto_e

    .line 117
    .line 118
    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    const-string v13, "ra2e8a11463d992df"

    .line 123
    .line 124
    iget-object v14, v1, Lgt0;->η:Ljava/util/LinkedHashSet;

    .line 125
    .line 126
    const/4 v15, 0x4

    .line 127
    const/4 v8, 0x0

    .line 128
    const-string v9, ", visible="

    .line 129
    .line 130
    iget-object v10, v1, Lgt0;->ε:Lx91;

    .line 131
    .line 132
    if-eqz v7, :cond_8

    .line 133
    .line 134
    :try_start_1
    const-string v0, "tabs_not_ready"

    .line 135
    .line 136
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v6, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v7, "\u5bbf\u4e3b\u5e95\u680f\u5df2\u53d1\u73b0\uff0c\u4f46\u5f53\u524d\u6ca1\u6709\u53ef\u5c55\u793a Tab: all="

    .line 158
    .line 159
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v3, ", container="

    .line 172
    .line 173
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-interface {v14, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_6

    .line 188
    .line 189
    invoke-static {v13, v2, v8, v15, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    iget-object v0, v1, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 193
    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    :cond_7
    invoke-virtual {v1}, Lgt0;->δ()V

    .line 200
    .line 201
    .line 202
    sget-object v11, Lps0;->ζ:Lps0;

    .line 203
    .line 204
    invoke-virtual {v10}, Lx91;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Lps0;

    .line 209
    .line 210
    iget v0, v0, Lps0;->ε:F

    .line 211
    .line 212
    const/16 v17, 0xf

    .line 213
    .line 214
    const/4 v12, 0x0

    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    move/from16 v16, v0

    .line 219
    .line 220
    invoke-static/range {v11 .. v17}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v10, v0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    new-instance v11, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v12, "tabs_ready_"

    .line 238
    .line 239
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    move-object/from16 v16, v7

    .line 258
    .line 259
    const-string v7, ","

    .line 260
    .line 261
    move/from16 v17, v11

    .line 262
    .line 263
    new-instance v11, Lgp0;

    .line 264
    .line 265
    const/4 v4, 0x1

    .line 266
    invoke-direct {v11, v4}, Lgp0;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    .line 268
    .line 269
    move/from16 v18, v12

    .line 270
    .line 271
    const/16 v12, 0x1e

    .line 272
    .line 273
    move-object/from16 v19, v8

    .line 274
    .line 275
    const/4 v8, 0x0

    .line 276
    move-object/from16 v20, v9

    .line 277
    .line 278
    const/4 v9, 0x0

    .line 279
    move-object/from16 v21, v10

    .line 280
    .line 281
    const/4 v10, 0x0

    .line 282
    move-object/from16 v4, v16

    .line 283
    .line 284
    move/from16 v15, v17

    .line 285
    .line 286
    move-object/from16 v1, v20

    .line 287
    .line 288
    move/from16 v17, v3

    .line 289
    .line 290
    move/from16 v3, v18

    .line 291
    .line 292
    :try_start_2
    invoke-static/range {v6 .. v12}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    new-instance v8, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    const-string v9, "\u6309\u5bbf\u4e3b\u5f53\u524d\u6761\u4ef6\u521b\u5efa\u6db2\u6001\u73bb\u7483 Tab: all="

    .line 302
    .line 303
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v1, ", ids="

    .line 316
    .line 317
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-interface {v14, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_9

    .line 332
    .line 333
    const/4 v3, 0x4

    .line 334
    const/4 v4, 0x0

    .line 335
    invoke-static {v13, v1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_9
    sget-object v1, Lsb;->α:Lsb;

    .line 339
    .line 340
    new-instance v1, Ljava/util/ArrayList;

    .line 341
    .line 342
    const/16 v3, 0xa

    .line 343
    .line 344
    invoke-static {v5, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-eqz v5, :cond_a

    .line 360
    .line 361
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Lst0;

    .line 366
    .line 367
    iget-object v5, v5, Lst0;->α:Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_1

    .line 373
    :catchall_1
    move-exception v0

    .line 374
    move-object/from16 v3, p0

    .line 375
    .line 376
    goto/16 :goto_e

    .line 377
    .line 378
    :cond_a
    new-instance v4, Lp3;

    .line 379
    .line 380
    const/4 v5, 0x2

    .line 381
    invoke-direct {v4, v2, v5, v1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v4}, Lsb;->Ψ(Lp70;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    if-eqz v4, :cond_b

    .line 399
    .line 400
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    check-cast v4, Lst0;

    .line 405
    .line 406
    iget-object v7, v4, Lst0;->β:Ljava/lang/String;

    .line 407
    .line 408
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 409
    .line 410
    iget-object v4, v4, Lst0;->α:Landroid/view/View;

    .line 411
    .line 412
    invoke-direct {v8, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    goto :goto_2

    .line 419
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-static {v6, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-eqz v1, :cond_c

    .line 437
    .line 438
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    check-cast v1, Lst0;

    .line 443
    .line 444
    new-instance v7, Lxt0;

    .line 445
    .line 446
    iget-object v8, v1, Lst0;->β:Ljava/lang/String;

    .line 447
    .line 448
    iget-object v9, v1, Lst0;->γ:Ljava/lang/String;

    .line 449
    .line 450
    iget-object v10, v1, Lst0;->η:Landroid/graphics/Bitmap;

    .line 451
    .line 452
    iget-boolean v11, v1, Lst0;->δ:Z

    .line 453
    .line 454
    iget-object v12, v1, Lst0;->ε:Ljava/lang/String;

    .line 455
    .line 456
    iget-boolean v13, v1, Lst0;->ζ:Z

    .line 457
    .line 458
    invoke-direct/range {v7 .. v13}, Lxt0;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Z)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    goto :goto_3

    .line 465
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_d

    .line 470
    .line 471
    const/4 v1, 0x0

    .line 472
    goto :goto_5

    .line 473
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    const/4 v1, 0x0

    .line 478
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-eqz v3, :cond_10

    .line 483
    .line 484
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    check-cast v3, Lst0;

    .line 489
    .line 490
    iget-boolean v3, v3, Lst0;->ι:Z

    .line 491
    .line 492
    if-eqz v3, :cond_f

    .line 493
    .line 494
    add-int/lit8 v1, v1, 0x1

    .line 495
    .line 496
    if-ltz v1, :cond_e

    .line 497
    .line 498
    goto :goto_4

    .line 499
    :cond_e
    invoke-static {}, Lyh;->ф()V

    .line 500
    .line 501
    .line 502
    const/16 v19, 0x0

    .line 503
    .line 504
    throw v19

    .line 505
    :cond_f
    const/16 v19, 0x0

    .line 506
    .line 507
    goto :goto_4

    .line 508
    :cond_10
    :goto_5
    mul-int/2addr v1, v5

    .line 509
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-lt v1, v0, :cond_11

    .line 514
    .line 515
    const/4 v7, 0x1

    .line 516
    goto :goto_6

    .line 517
    :cond_11
    const/4 v7, 0x0

    .line 518
    :goto_6
    invoke-virtual/range {v21 .. v21}, Lx91;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    move-object v3, v0

    .line 523
    check-cast v3, Lps0;

    .line 524
    .line 525
    iget-object v0, v3, Lps0;->α:Ljava/util/List;

    .line 526
    .line 527
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_13

    .line 532
    .line 533
    iget-boolean v0, v3, Lps0;->δ:Z

    .line 534
    .line 535
    if-eq v0, v7, :cond_12

    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_12
    move-object/from16 v1, v21

    .line 539
    .line 540
    :goto_7
    move-object/from16 v3, p0

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_13
    :goto_8
    const/4 v8, 0x0

    .line 544
    const/16 v9, 0x16

    .line 545
    .line 546
    const/4 v5, 0x0

    .line 547
    const/4 v6, 0x0

    .line 548
    invoke-static/range {v3 .. v9}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    move-object/from16 v1, v21

    .line 553
    .line 554
    invoke-virtual {v1, v0}, Lx91;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :goto_9
    :try_start_3
    iget-object v0, v3, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 559
    .line 560
    if-eqz v0, :cond_14

    .line 561
    .line 562
    const/4 v4, 0x0

    .line 563
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 567
    .line 568
    .line 569
    goto :goto_a

    .line 570
    :catchall_2
    move-exception v0

    .line 571
    goto :goto_e

    .line 572
    :cond_14
    :goto_a
    if-nez p1, :cond_16

    .line 573
    .line 574
    if-eqz v17, :cond_15

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_15
    const/4 v7, 0x0

    .line 578
    goto :goto_c

    .line 579
    :cond_16
    :goto_b
    const/4 v7, 0x1

    .line 580
    :goto_c
    iget-object v6, v3, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 581
    .line 582
    if-nez v6, :cond_17

    .line 583
    .line 584
    goto :goto_d

    .line 585
    :cond_17
    iget-object v4, v3, Lgt0;->θ:Lns0;

    .line 586
    .line 587
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1}, Lx91;->getValue()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    check-cast v0, Lps0;

    .line 599
    .line 600
    iget v8, v0, Lps0;->ε:F

    .line 601
    .line 602
    new-instance v9, Lwa;

    .line 603
    .line 604
    const/16 v0, 0x14

    .line 605
    .line 606
    invoke-direct {v9, v3, v0, v6}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v4 .. v9}, Lns0;->α(Landroid/view/View;Landroid/view/View;ZFLwa;)V

    .line 610
    .line 611
    .line 612
    :goto_d
    sget-object v0, Ls62;->α:Ls62;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 613
    .line 614
    goto :goto_f

    .line 615
    :goto_e
    new-instance v1, Leo1;

    .line 616
    .line 617
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 618
    .line 619
    .line 620
    move-object v0, v1

    .line 621
    :goto_f
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    if-eqz v0, :cond_18

    .line 626
    .line 627
    const-string v1, "sync"

    .line 628
    .line 629
    const-string v2, "\u540c\u6b65\u5bbf\u4e3b\u5e95\u680f\u72b6\u6001\u5931\u8d25\uff0c\u5df2\u6062\u590d\u539f\u5e95\u680f"

    .line 630
    .line 631
    invoke-virtual {v3, v1, v2, v0}, Lgt0;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 632
    .line 633
    .line 634
    const/4 v4, 0x0

    .line 635
    invoke-virtual {v3, v4}, Lgt0;->ε(Z)V

    .line 636
    .line 637
    .line 638
    :cond_18
    :goto_10
    return-void
.end method

.method public final η(Landroid/view/ViewGroup;F)Z
    .locals 13

    .line 1
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    .line 7
    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    const/high16 v2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 13
    .line 14
    const/high16 v4, 0x3f000000    # 0.5f

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p2, v4, v3}, Lj81;->λ(FFF)F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    move v10, p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v10, v2

    .line 25
    :goto_0
    iget-object p2, p0, Lgt0;->ε:Lx91;

    .line 26
    .line 27
    invoke-virtual {p2}, Lx91;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lps0;

    .line 32
    .line 33
    iget v0, v0, Lps0;->ε:F

    .line 34
    .line 35
    cmpg-float v0, v0, v10

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    move v0, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    xor-int/lit8 v12, v0, 0x1

    .line 44
    .line 45
    iget-object p0, p0, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 46
    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_2
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    cmpg-float v1, v6, v1

    .line 55
    .line 56
    if-gtz v1, :cond_3

    .line 57
    .line 58
    invoke-static {v10, v4, v3}, Lj81;->λ(FFF)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :cond_3
    iput v2, p0, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;->η:F

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    instance-of v2, v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    const/4 v1, 0x0

    .line 76
    :goto_2
    instance-of p1, p1, Landroid/widget/FrameLayout;

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 91
    .line 92
    const/high16 v2, 0x42900000    # 72.0f

    .line 93
    .line 94
    mul-float/2addr p1, v2

    .line 95
    mul-float/2addr p1, v10

    .line 96
    invoke-static {p1}, Ljx0;->в(F)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ge p1, v5, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move v5, p1

    .line 104
    :goto_3
    iget p1, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 105
    .line 106
    if-eq p1, v5, :cond_6

    .line 107
    .line 108
    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    if-nez v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {p2}, Lx91;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    move-object v5, p0

    .line 120
    check-cast v5, Lps0;

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const/16 v11, 0xf

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    invoke-static/range {v5 .. v11}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p2, p0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_4
    return v12
.end method
