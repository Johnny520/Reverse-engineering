.class public final Lck0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lck0;

.field private static final b:Lu60;

.field private static final c:Lu60;

.field private static final d:Lu60;

.field private static final e:Lu60;

.field private static final f:Lu60;

.field private static final g:Lu60;

.field private static final h:Lu60;

.field private static final i:I = 0x34

.field private static final j:Z = true

.field public static final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lck0;

    .line 2
    .line 3
    invoke-direct {v0}, Lck0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lck0;->a:Lck0;

    .line 7
    .line 8
    new-instance v0, Lsc0;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lx51;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lck0;->b:Lu60;

    .line 20
    .line 21
    new-instance v0, Lsc0;

    .line 22
    .line 23
    const/4 v1, 0x6

    .line 24
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lx51;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lck0;->c:Lu60;

    .line 33
    .line 34
    new-instance v0, Lsc0;

    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lx51;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 43
    .line 44
    .line 45
    sput-object v1, Lck0;->d:Lu60;

    .line 46
    .line 47
    new-instance v0, Lsc0;

    .line 48
    .line 49
    const/16 v1, 0x8

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lx51;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lck0;->e:Lu60;

    .line 60
    .line 61
    new-instance v0, Lsc0;

    .line 62
    .line 63
    const/16 v1, 0x9

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lx51;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lck0;->f:Lu60;

    .line 74
    .line 75
    new-instance v0, Lsc0;

    .line 76
    .line 77
    const/16 v1, 0xa

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-instance v1, Lx51;

    .line 83
    .line 84
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 85
    .line 86
    .line 87
    sput-object v1, Lck0;->g:Lu60;

    .line 88
    .line 89
    new-instance v0, Lsc0;

    .line 90
    .line 91
    const/16 v1, 0xb

    .line 92
    .line 93
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lx51;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 99
    .line 100
    .line 101
    sput-object v1, Lck0;->h:Lu60;

    .line 102
    .line 103
    const/16 v0, 0x8

    .line 104
    .line 105
    sput v0, Lck0;->k:I

    .line 106
    .line 107
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final A()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final B()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->b:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final C()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->e:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final E(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Landroid/app/Activity;

    .line 16
    .line 17
    sget-object v1, Lck0;->a:Lck0;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lck0;->F(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    return-object v0
.end method

.method private final F(Landroid/app/Activity;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    :try_start_0
    invoke-direct {v0}, Lck0;->y()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v10, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0}, Lck0;->w()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v10}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    check-cast v1, Landroid/view/ViewGroup;

    .line 40
    .line 41
    :goto_0
    move-object v11, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    if-nez v11, :cond_2

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_2
    invoke-direct {v0}, Lck0;->C()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v11, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_3
    invoke-direct {v0}, Lck0;->y()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v10, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0}, Lck0;->x()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/16 v5, 0x34

    .line 74
    .line 75
    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-direct {v0, v10, v1}, Lck0;->u(Landroid/app/Activity;I)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget v6, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 92
    .line 93
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget v9, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 102
    .line 103
    const/16 v3, 0x114

    .line 104
    .line 105
    invoke-direct {v0, v10, v3}, Lck0;->u(Landroid/app/Activity;I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    const/16 v5, 0x44

    .line 110
    .line 111
    invoke-direct {v0, v10, v5}, Lck0;->u(Landroid/app/Activity;I)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-direct/range {p0 .. p1}, Lck0;->v(Landroid/app/Activity;)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-direct {v0}, Lck0;->B()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-virtual {v10, v12, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    invoke-direct {v0}, Lck0;->z()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    const/4 v14, -0x1

    .line 132
    invoke-interface {v12, v13, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    invoke-direct {v0}, Lck0;->A()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v12, v0, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 145
    .line 146
    invoke-direct {v12, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 147
    .line 148
    .line 149
    const v14, 0x800033

    .line 150
    .line 151
    .line 152
    iput v14, v12, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 153
    .line 154
    if-ltz v13, :cond_4

    .line 155
    .line 156
    if-ltz v0, :cond_4

    .line 157
    .line 158
    sub-int v3, v6, v7

    .line 159
    .line 160
    invoke-static {v13, v2, v3}, Lw60;->n(III)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    iput v3, v12, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 165
    .line 166
    sub-int v3, v9, v7

    .line 167
    .line 168
    invoke-static {v0, v8, v3}, Lw60;->n(III)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, v12, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    sub-int v0, v6, v5

    .line 176
    .line 177
    sub-int/2addr v0, v7

    .line 178
    iput v0, v12, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 179
    .line 180
    sub-int v0, v9, v3

    .line 181
    .line 182
    sub-int/2addr v0, v7

    .line 183
    iput v0, v12, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 184
    .line 185
    :goto_2
    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    .line 186
    .line 187
    invoke-direct {v13}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v13, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 191
    .line 192
    .line 193
    const/16 v0, 0xe6

    .line 194
    .line 195
    const/16 v3, 0xf5

    .line 196
    .line 197
    invoke-static {v0, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-virtual {v13, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lck0;->a:Lck0;

    .line 205
    .line 206
    int-to-float v1, v1

    .line 207
    const v3, 0x3d23d70a    # 0.04f

    .line 208
    .line 209
    .line 210
    mul-float/2addr v3, v1

    .line 211
    float-to-int v3, v3

    .line 212
    if-ge v3, v4, :cond_5

    .line 213
    .line 214
    move v5, v4

    .line 215
    goto :goto_3

    .line 216
    :cond_5
    move v5, v3

    .line 217
    :goto_3
    invoke-direct {v0, v10, v5}, Lck0;->u(Landroid/app/Activity;I)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    const/16 v14, 0x50

    .line 222
    .line 223
    invoke-static {v14, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {v13, v5, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 228
    .line 229
    .line 230
    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    .line 231
    .line 232
    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 236
    .line 237
    .line 238
    const/16 v2, 0xb4

    .line 239
    .line 240
    const/16 v5, 0x82

    .line 241
    .line 242
    const/16 v15, 0x78

    .line 243
    .line 244
    invoke-static {v2, v15, v15, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    invoke-virtual {v14, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 249
    .line 250
    .line 251
    if-ge v3, v4, :cond_6

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_6
    move v4, v3

    .line 255
    :goto_4
    invoke-direct {v0, v10, v4}, Lck0;->u(Landroid/app/Activity;I)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const/16 v3, 0x32

    .line 260
    .line 261
    const/16 v4, 0xff

    .line 262
    .line 263
    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    invoke-virtual {v14, v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 268
    .line 269
    .line 270
    move v2, v1

    .line 271
    new-instance v1, Lwt0;

    .line 272
    .line 273
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 274
    .line 275
    .line 276
    move v3, v2

    .line 277
    new-instance v2, Lwt0;

    .line 278
    .line 279
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 280
    .line 281
    .line 282
    move v4, v3

    .line 283
    new-instance v3, Lxt0;

    .line 284
    .line 285
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    move v5, v4

    .line 289
    new-instance v4, Lxt0;

    .line 290
    .line 291
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 292
    .line 293
    .line 294
    move v15, v5

    .line 295
    new-instance v5, Lvt0;

    .line 296
    .line 297
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 298
    .line 299
    .line 300
    move/from16 p0, v15

    .line 301
    .line 302
    new-instance v15, Landroid/widget/TextView;

    .line 303
    .line 304
    invoke-direct {v15, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 305
    .line 306
    .line 307
    move-object/from16 v16, v1

    .line 308
    .line 309
    const-string v1, "\u2193"

    .line 310
    .line 311
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    .line 314
    const v1, 0x3ed70a3d    # 0.42f

    .line 315
    .line 316
    .line 317
    mul-float v1, v1, p0

    .line 318
    .line 319
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 320
    .line 321
    .line 322
    const/16 v1, 0x28

    .line 323
    .line 324
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 329
    .line 330
    .line 331
    const/16 v1, 0x11

    .line 332
    .line 333
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 334
    .line 335
    .line 336
    invoke-direct {v0}, Lck0;->C()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v15, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v15, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 344
    .line 345
    .line 346
    const v1, 0x3deb851f    # 0.115f

    .line 347
    .line 348
    .line 349
    mul-float v1, v1, p0

    .line 350
    .line 351
    float-to-int v1, v1

    .line 352
    move-object/from16 p0, v2

    .line 353
    .line 354
    const/4 v2, 0x2

    .line 355
    if-ge v1, v2, :cond_7

    .line 356
    .line 357
    move v1, v2

    .line 358
    :cond_7
    invoke-direct {v0, v10, v1}, Lck0;->u(Landroid/app/Activity;I)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    int-to-float v0, v0

    .line 363
    invoke-virtual {v15, v0}, Landroid/view/View;->setElevation(F)V

    .line 364
    .line 365
    .line 366
    new-instance v0, Lbk0;

    .line 367
    .line 368
    move-object/from16 v2, p0

    .line 369
    .line 370
    move-object/from16 v1, v16

    .line 371
    .line 372
    invoke-direct/range {v0 .. v10}, Lbk0;-><init>(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v15, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, Lsz;->a:Lsz;

    .line 379
    .line 380
    new-instance v1, Lc7;

    .line 381
    .line 382
    const/16 v2, 0x9

    .line 383
    .line 384
    invoke-direct {v1, v2, v15, v13}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v1}, Lsz;->z(Lhw;)V

    .line 388
    .line 389
    .line 390
    new-instance v1, Lp9;

    .line 391
    .line 392
    const/4 v2, 0x6

    .line 393
    invoke-direct {v1, v15, v10, v14, v2}, Lp9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v1}, Lsz;->y(Lhw;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Lsz;->r()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v11, v15, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 403
    .line 404
    .line 405
    :catch_0
    :goto_5
    return-void
.end method

.method private static final G(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 9
    .line 10
    invoke-virtual {p11}, Landroid/view/MotionEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_6

    .line 17
    .line 18
    if-eq v1, v3, :cond_3

    .line 19
    .line 20
    const/4 p9, 0x2

    .line 21
    if-eq v1, p9, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    invoke-virtual {p11}, Landroid/view/MotionEvent;->getRawX()F

    .line 25
    .line 26
    .line 27
    move-result p9

    .line 28
    iget p0, p0, Lwt0;->d:F

    .line 29
    .line 30
    sub-float/2addr p9, p0

    .line 31
    float-to-int p0, p9

    .line 32
    invoke-virtual {p11}, Landroid/view/MotionEvent;->getRawY()F

    .line 33
    .line 34
    .line 35
    move-result p9

    .line 36
    iget p1, p1, Lwt0;->d:F

    .line 37
    .line 38
    sub-float/2addr p9, p1

    .line 39
    float-to-int p1, p9

    .line 40
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result p9

    .line 44
    const/4 p11, 0x6

    .line 45
    if-gt p9, p11, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result p9

    .line 51
    if-le p9, p11, :cond_2

    .line 52
    .line 53
    :cond_1
    iput-boolean v3, p4, Lvt0;->d:Z

    .line 54
    .line 55
    iget p2, p2, Lxt0;->d:I

    .line 56
    .line 57
    add-int/2addr p2, p0

    .line 58
    sub-int/2addr p5, p6

    .line 59
    invoke-static {p2, v2, p5}, Lw60;->n(III)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    iput p0, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 64
    .line 65
    iget p0, p3, Lxt0;->d:I

    .line 66
    .line 67
    add-int/2addr p0, p1

    .line 68
    sub-int/2addr p8, p6

    .line 69
    invoke-static {p0, p7, p8}, Lw60;->n(III)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    iput p0, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 74
    .line 75
    invoke-virtual {p10, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return v3

    .line 79
    :cond_3
    iget-boolean p0, p4, Lvt0;->d:Z

    .line 80
    .line 81
    if-nez p0, :cond_4

    .line 82
    .line 83
    sget-object p0, Lsz;->a:Lsz;

    .line 84
    .line 85
    invoke-virtual {p0}, Lsz;->o()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    new-instance p0, Lm00;

    .line 92
    .line 93
    invoke-direct {p0, p9}, Lm00;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    sget-object p0, Lck0;->a:Lck0;

    .line 101
    .line 102
    invoke-direct {p0}, Lck0;->B()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p9, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p0}, Lck0;->z()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iget p3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 119
    .line 120
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p0}, Lck0;->A()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 129
    .line 130
    invoke-interface {p1, p0, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 135
    .line 136
    .line 137
    :cond_5
    :goto_0
    return v3

    .line 138
    :cond_6
    invoke-virtual {p11}, Landroid/view/MotionEvent;->getRawX()F

    .line 139
    .line 140
    .line 141
    move-result p5

    .line 142
    iput p5, p0, Lwt0;->d:F

    .line 143
    .line 144
    invoke-virtual {p11}, Landroid/view/MotionEvent;->getRawY()F

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    iput p0, p1, Lwt0;->d:F

    .line 149
    .line 150
    iget p0, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 151
    .line 152
    iput p0, p2, Lxt0;->d:I

    .line 153
    .line 154
    iget p0, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 155
    .line 156
    iput p0, p3, Lxt0;->d:I

    .line 157
    .line 158
    iput-boolean v2, p4, Lvt0;->d:Z

    .line 159
    .line 160
    return v3
.end method

.method private static final H(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)Lna1;
    .locals 2

    .line 1
    new-instance v0, Lak0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lak0;-><init>(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    sget-object p0, Lna1;->a:Lna1;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final I(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final J(Landroid/widget/TextView;Landroid/app/Activity;Landroid/graphics/drawable/GradientDrawable;)Lna1;
    .locals 2

    .line 1
    new-instance v0, Lak0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p2, v1}, Lak0;-><init>(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    sget-object p0, Lsz;->a:Lsz;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lsz;->u(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lsz;->s(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final K(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lck0;->H(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Lck0;->G(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILandroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lck0;->I(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->p()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i(Landroid/widget/TextView;Landroid/app/Activity;Landroid/graphics/drawable/GradientDrawable;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lck0;->J(Landroid/widget/TextView;Landroid/app/Activity;Landroid/graphics/drawable/GradientDrawable;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lck0;->E(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lck0;->q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic m(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lck0;->K(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final n()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x2d
        0x14
        0x1f
        0x50
        0x3f
        0x27
        0x12
        0x45
        0x25
        0x27
        0x15
        0x5f
        0x2a
        0x1a
        0x1c
        0x54
        0x2f
    .end array-data
.end method

.method private static final o()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x2d
        0x14
        0x1f
        0x50
        0x3f
        0x27
        0x12
        0x45
        0x25
        0x27
        0x3
        0x58
        0x31
        0x1d
    .end array-data
.end method

.method private static final p()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x33
        0x8
        0x41
        0x6e
        0x26
        0x17
        0x14
        0x44
        0x27
        0x1d
        0x2f
        0x42
        0x2e
        0xc
        0x4
        0x58
        0x25
        0x1f
        0x3
    .end array-data
.end method

.method private static final q()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x27
        0x1d
        0x16
        0x45
        0x14
        0x15
        0x11
        0x43
        0x2c
        0x11
        0x1e
    .end array-data
.end method

.method private static final r()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x3f
        0x17
        0x0
        0x6e
        0x26
        0x19
        0x2
        0x56
        0x22
        0x16
    .end array-data
.end method

.method private static final s()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x33
        0x8
        0x41
        0x6e
        0x2d
        0x14
        0x1f
        0x50
        0x3f
        0x27
        0x0
        0x5e
        0x38
    .end array-data
.end method

.method private static final t()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x33
        0x8
        0x41
        0x6e
        0x2d
        0x14
        0x1f
        0x50
        0x3f
        0x27
        0x12
        0x45
        0x25
    .end array-data
.end method

.method private final u(Landroid/app/Activity;I)I
    .locals 0

    .line 1
    int-to-float p0, p2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p0, p1

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method private final v(Landroid/app/Activity;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dimen"

    .line 6
    .line 7
    const-string v2, "android"

    .line 8
    .line 9
    const-string v3, "status_bar_height"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/16 v0, 0x18

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lck0;->u(Landroid/app/Activity;I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method private final w()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->h:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final x()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->g:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final y()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->f:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final z()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lck0;->c:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final D(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    const-string p0, "onCreate"

    .line 8
    .line 9
    const-class p1, Landroid/os/Bundle;

    .line 10
    .line 11
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2, p0, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    new-instance p1, Lua;

    .line 34
    .line 35
    const/16 p2, 0x11

    .line 36
    .line 37
    invoke-direct {p1, p2}, Lua;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final L(Landroid/app/Activity;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    invoke-direct {p0}, Lck0;->C()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    if-eqz p2, :cond_3

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const/16 p1, 0x8

    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    :goto_2
    return-void
.end method
