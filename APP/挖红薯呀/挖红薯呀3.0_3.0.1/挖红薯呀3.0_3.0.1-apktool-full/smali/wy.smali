.class public final Lwy;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lwy;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile d:Z

.field private static volatile e:Landroid/view/View;

.field private static volatile f:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwy;

    .line 2
    .line 3
    invoke-direct {v0}, Lwy;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwy;->a:Lwy;

    .line 7
    .line 8
    const-string v0, "HRHook"

    .line 9
    .line 10
    sput-object v0, Lwy;->b:Ljava/lang/String;

    .line 11
    .line 12
    const v0, 0x7f091937

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    filled-new-array {v0}, [Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-static {v2}, Lmd0;->x(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    aget-object v0, v0, v2

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    sput-object v1, Lwy;->c:Ljava/util/Set;

    .line 40
    .line 41
    const/16 v0, 0x8

    .line 42
    .line 43
    sput v0, Lwy;->g:I

    .line 44
    .line 45
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

.method private final A(Landroid/view/View;I)Z
    .locals 4

    .line 1
    sget-object p0, Lwy;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v2, "index_home"

    .line 32
    .line 33
    const-string v3, "id"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    if-ne p1, p2, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method private final B(Landroid/content/Context;Lsw;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    new-instance v3, Landroid/app/Dialog;

    .line 16
    .line 17
    const v4, 0x103000a

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v0, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 30
    .line 31
    .line 32
    const/16 v6, 0x11

    .line 33
    .line 34
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 35
    .line 36
    .line 37
    const/16 v7, 0xa0

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-static {v7, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 45
    .line 46
    .line 47
    sget-object v7, Lwy;->a:Lwy;

    .line 48
    .line 49
    const/16 v9, 0x20

    .line 50
    .line 51
    invoke-direct {v7, v2, v9}, Lwy;->m(FI)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-direct {v7, v2, v9}, Lwy;->m(FI)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    invoke-virtual {v4, v10, v8, v9, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 60
    .line 61
    .line 62
    new-instance v9, Landroid/widget/LinearLayout;

    .line 63
    .line 64
    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 68
    .line 69
    .line 70
    const/16 v10, 0x18

    .line 71
    .line 72
    invoke-direct {v7, v2, v10}, Lwy;->m(FI)I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    invoke-direct {v7, v2, v10}, Lwy;->m(FI)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    invoke-direct {v7, v2, v10}, Lwy;->m(FI)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    const/16 v14, 0x14

    .line 85
    .line 86
    invoke-direct {v7, v2, v14}, Lwy;->m(FI)I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    invoke-virtual {v9, v11, v12, v13, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 91
    .line 92
    .line 93
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 94
    .line 95
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 99
    .line 100
    .line 101
    const/16 v12, 0x10

    .line 102
    .line 103
    invoke-direct {v7, v2, v12}, Lwy;->m(FI)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    int-to-float v12, v12

    .line 108
    invoke-virtual {v11, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 109
    .line 110
    .line 111
    const/16 v12, 0xff

    .line 112
    .line 113
    invoke-static {v12, v12, v12, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 124
    .line 125
    const/4 v13, -0x2

    .line 126
    const/4 v15, -0x1

    .line 127
    invoke-direct {v11, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    new-instance v11, Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    const-string v5, "\u786e\u8ba4\u5237\u65b0"

    .line 139
    .line 140
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    const/high16 v5, 0x41900000    # 18.0f

    .line 144
    .line 145
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 146
    .line 147
    .line 148
    const/16 v5, 0x1e

    .line 149
    .line 150
    invoke-static {v12, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 158
    .line 159
    .line 160
    const/16 v5, 0x8

    .line 161
    .line 162
    invoke-direct {v7, v2, v5}, Lwy;->m(FI)I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-virtual {v11, v8, v8, v8, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    new-instance v5, Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    const-string v11, "\u662f\u5426\u5237\u65b0\u9996\u9875\u5185\u5bb9\uff1f"

    .line 178
    .line 179
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    const/high16 v11, 0x41600000    # 14.0f

    .line 183
    .line 184
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 185
    .line 186
    .line 187
    const/16 v15, 0x50

    .line 188
    .line 189
    const/16 v13, 0xc8

    .line 190
    .line 191
    invoke-static {v13, v15, v15, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    invoke-virtual {v5, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v7, v2, v14}, Lwy;->m(FI)I

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    invoke-virtual {v5, v8, v8, v8, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 209
    .line 210
    .line 211
    new-instance v5, Landroid/widget/LinearLayout;

    .line 212
    .line 213
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 220
    .line 221
    .line 222
    new-instance v14, Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-direct {v14, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 225
    .line 226
    .line 227
    const-string v15, "\u5426"

    .line 228
    .line 229
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 233
    .line 234
    .line 235
    const/16 v15, 0x64

    .line 236
    .line 237
    invoke-static {v12, v15, v15, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 245
    .line 246
    .line 247
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    .line 248
    .line 249
    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v7, v2, v10}, Lwy;->m(FI)I

    .line 256
    .line 257
    .line 258
    move-result v15

    .line 259
    int-to-float v15, v15

    .line 260
    invoke-virtual {v12, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 261
    .line 262
    .line 263
    const/16 v15, 0x3c

    .line 264
    .line 265
    invoke-static {v15, v13, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 266
    .line 267
    .line 268
    move-result v13

    .line 269
    invoke-virtual {v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v14, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 273
    .line 274
    .line 275
    const/16 v12, 0x1c

    .line 276
    .line 277
    invoke-direct {v7, v2, v12}, Lwy;->m(FI)I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    const/16 v15, 0xa

    .line 282
    .line 283
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-direct {v7, v2, v12}, Lwy;->m(FI)I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    invoke-virtual {v14, v13, v10, v6, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 296
    .line 297
    .line 298
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 299
    .line 300
    const/high16 v10, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v12, -0x2

    .line 303
    invoke-direct {v6, v8, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 304
    .line 305
    .line 306
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    invoke-virtual {v6, v8, v8, v12, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v14, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    .line 315
    .line 316
    new-instance v6, Lty;

    .line 317
    .line 318
    invoke-direct {v6, v3, v1, v8}, Lty;-><init>(Landroid/app/Dialog;Lsw;I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v14, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    new-instance v6, Landroid/widget/TextView;

    .line 328
    .line 329
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 330
    .line 331
    .line 332
    const-string v0, "\u662f"

    .line 333
    .line 334
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 338
    .line 339
    .line 340
    const/4 v0, -0x1

    .line 341
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    .line 343
    .line 344
    const/16 v0, 0x11

    .line 345
    .line 346
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 347
    .line 348
    .line 349
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 350
    .line 351
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 355
    .line 356
    .line 357
    const/16 v11, 0x18

    .line 358
    .line 359
    invoke-direct {v7, v2, v11}, Lwy;->m(FI)I

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    int-to-float v11, v11

    .line 364
    invoke-virtual {v0, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 365
    .line 366
    .line 367
    const/16 v11, 0x2c

    .line 368
    .line 369
    const/16 v12, 0x55

    .line 370
    .line 371
    const/16 v13, 0xdc

    .line 372
    .line 373
    const/16 v14, 0xfe

    .line 374
    .line 375
    invoke-static {v13, v14, v11, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    invoke-virtual {v0, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 383
    .line 384
    .line 385
    const/16 v0, 0x1c

    .line 386
    .line 387
    invoke-direct {v7, v2, v0}, Lwy;->m(FI)I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 392
    .line 393
    .line 394
    move-result v12

    .line 395
    invoke-direct {v7, v2, v0}, Lwy;->m(FI)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    invoke-virtual {v6, v11, v12, v0, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 407
    .line 408
    const/4 v12, -0x2

    .line 409
    invoke-direct {v0, v8, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 410
    .line 411
    .line 412
    invoke-direct {v7, v2, v15}, Lwy;->m(FI)I

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v0, v2, v8, v8, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 420
    .line 421
    .line 422
    new-instance v0, Lty;

    .line 423
    .line 424
    const/4 v2, 0x1

    .line 425
    invoke-direct {v0, v3, v1, v2}, Lty;-><init>(Landroid/app/Dialog;Lsw;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    if-eqz v0, :cond_0

    .line 448
    .line 449
    const/4 v2, -0x1

    .line 450
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setLayout(II)V

    .line 451
    .line 452
    .line 453
    :cond_0
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    if-eqz v0, :cond_1

    .line 458
    .line 459
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 460
    .line 461
    invoke-direct {v2, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 465
    .line 466
    .line 467
    :cond_1
    invoke-virtual {v3, v8}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-interface {v1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    return-void
.end method

.method private static final C(Landroid/app/Dialog;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final D(Landroid/app/Dialog;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final E(Landroid/content/Context;Landroid/view/View;Lsw;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    new-instance v2, Landroid/app/Dialog;

    .line 14
    .line 15
    const v3, 0x103000a

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Landroid/widget/LinearLayout;

    .line 22
    .line 23
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 28
    .line 29
    .line 30
    const/16 v5, 0x11

    .line 31
    .line 32
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 33
    .line 34
    .line 35
    const/16 v6, 0xa0

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static {v6, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 43
    .line 44
    .line 45
    sget-object v6, Lwy;->a:Lwy;

    .line 46
    .line 47
    const/16 v8, 0x20

    .line 48
    .line 49
    invoke-direct {v6, v1, v8}, Lwy;->m(FI)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-direct {v6, v1, v8}, Lwy;->m(FI)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {v3, v9, v7, v8, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    new-instance v8, Landroid/widget/LinearLayout;

    .line 61
    .line 62
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 66
    .line 67
    .line 68
    const/16 v4, 0x18

    .line 69
    .line 70
    invoke-direct {v6, v1, v4}, Lwy;->m(FI)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-direct {v6, v1, v4}, Lwy;->m(FI)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    invoke-direct {v6, v1, v4}, Lwy;->m(FI)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    const/16 v12, 0x14

    .line 83
    .line 84
    invoke-direct {v6, v1, v12}, Lwy;->m(FI)I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    invoke-virtual {v8, v9, v10, v11, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 89
    .line 90
    .line 91
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 97
    .line 98
    .line 99
    const/16 v10, 0x10

    .line 100
    .line 101
    invoke-direct {v6, v1, v10}, Lwy;->m(FI)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    int-to-float v10, v10

    .line 106
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 107
    .line 108
    .line 109
    const/16 v10, 0xff

    .line 110
    .line 111
    invoke-static {v10, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    invoke-virtual {v9, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 122
    .line 123
    const/4 v11, -0x2

    .line 124
    const/4 v13, -0x1

    .line 125
    invoke-direct {v9, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    .line 130
    .line 131
    new-instance v9, Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    const-string v14, "\u786e\u8ba4\u5237\u65b0"

    .line 137
    .line 138
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    const/high16 v14, 0x41900000    # 18.0f

    .line 142
    .line 143
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 144
    .line 145
    .line 146
    const/16 v14, 0x1e

    .line 147
    .line 148
    invoke-static {v10, v14, v14, v14}, Landroid/graphics/Color;->argb(IIII)I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 156
    .line 157
    .line 158
    const/16 v14, 0x8

    .line 159
    .line 160
    invoke-direct {v6, v1, v14}, Lwy;->m(FI)I

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    invoke-virtual {v9, v7, v7, v7, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    new-instance v9, Landroid/widget/TextView;

    .line 171
    .line 172
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    const-string v14, "\u662f\u5426\u5237\u65b0\u9996\u9875\u5185\u5bb9\uff1f"

    .line 176
    .line 177
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    const/high16 v14, 0x41600000    # 14.0f

    .line 181
    .line 182
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 183
    .line 184
    .line 185
    const/16 v15, 0x50

    .line 186
    .line 187
    const/16 v13, 0xc8

    .line 188
    .line 189
    invoke-static {v13, v15, v15, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 197
    .line 198
    .line 199
    invoke-direct {v6, v1, v12}, Lwy;->m(FI)I

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    invoke-virtual {v9, v7, v7, v7, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 207
    .line 208
    .line 209
    new-instance v9, Landroid/widget/LinearLayout;

    .line 210
    .line 211
    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 218
    .line 219
    .line 220
    new-instance v12, Landroid/widget/TextView;

    .line 221
    .line 222
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 223
    .line 224
    .line 225
    const-string v15, "\u5426"

    .line 226
    .line 227
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 231
    .line 232
    .line 233
    const/16 v15, 0x64

    .line 234
    .line 235
    invoke-static {v10, v15, v15, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 243
    .line 244
    .line 245
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 246
    .line 247
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 251
    .line 252
    .line 253
    invoke-direct {v6, v1, v4}, Lwy;->m(FI)I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    int-to-float v15, v15

    .line 258
    invoke-virtual {v10, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 259
    .line 260
    .line 261
    const/16 v15, 0x3c

    .line 262
    .line 263
    invoke-static {v15, v13, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    invoke-virtual {v10, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 271
    .line 272
    .line 273
    const/16 v10, 0x1c

    .line 274
    .line 275
    invoke-direct {v6, v1, v10}, Lwy;->m(FI)I

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    const/16 v15, 0xa

    .line 280
    .line 281
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    invoke-direct {v6, v1, v10}, Lwy;->m(FI)I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    invoke-virtual {v12, v13, v4, v5, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 294
    .line 295
    .line 296
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 297
    .line 298
    const/high16 v5, 0x3f800000    # 1.0f

    .line 299
    .line 300
    invoke-direct {v4, v7, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual {v4, v7, v7, v10, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 311
    .line 312
    .line 313
    new-instance v4, Luy;

    .line 314
    .line 315
    invoke-direct {v4, v2, v7}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    new-instance v4, Landroid/widget/TextView;

    .line 325
    .line 326
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 327
    .line 328
    .line 329
    const-string v0, "\u662f"

    .line 330
    .line 331
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 335
    .line 336
    .line 337
    const/4 v0, -0x1

    .line 338
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 339
    .line 340
    .line 341
    const/16 v0, 0x11

    .line 342
    .line 343
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 344
    .line 345
    .line 346
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 347
    .line 348
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 352
    .line 353
    .line 354
    const/16 v10, 0x18

    .line 355
    .line 356
    invoke-direct {v6, v1, v10}, Lwy;->m(FI)I

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    int-to-float v10, v10

    .line 361
    invoke-virtual {v0, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 362
    .line 363
    .line 364
    const/16 v10, 0x2c

    .line 365
    .line 366
    const/16 v12, 0x55

    .line 367
    .line 368
    const/16 v13, 0xdc

    .line 369
    .line 370
    const/16 v14, 0xfe

    .line 371
    .line 372
    invoke-static {v13, v14, v10, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    invoke-virtual {v0, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 380
    .line 381
    .line 382
    const/16 v0, 0x1c

    .line 383
    .line 384
    invoke-direct {v6, v1, v0}, Lwy;->m(FI)I

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 389
    .line 390
    .line 391
    move-result v12

    .line 392
    invoke-direct {v6, v1, v0}, Lwy;->m(FI)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    invoke-virtual {v4, v10, v12, v0, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 401
    .line 402
    .line 403
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 404
    .line 405
    invoke-direct {v0, v7, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 406
    .line 407
    .line 408
    invoke-direct {v6, v1, v15}, Lwy;->m(FI)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-virtual {v0, v1, v7, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 416
    .line 417
    .line 418
    new-instance v0, Lvy;

    .line 419
    .line 420
    move-object/from16 v1, p2

    .line 421
    .line 422
    move-object/from16 v5, p3

    .line 423
    .line 424
    invoke-direct {v0, v2, v5, v1, v7}, Lvy;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-eqz v0, :cond_0

    .line 447
    .line 448
    const/4 v1, -0x1

    .line 449
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 450
    .line 451
    .line 452
    :cond_0
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    if-eqz v0, :cond_1

    .line 457
    .line 458
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 459
    .line 460
    invoke-direct {v1, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 464
    .line 465
    .line 466
    :cond_1
    invoke-virtual {v2, v7}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    .line 471
    .line 472
    :catch_0
    return-void
.end method

.method public static synthetic F(Lwy;Landroid/content/Context;Landroid/view/View;Lsw;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwy;->E(Landroid/content/Context;Landroid/view/View;Lsw;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final G(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final H(Landroid/app/Dialog;Lsw;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object p0, Lwy;->a:Lwy;

    .line 11
    .line 12
    invoke-direct {p0, p2}, Lwy;->I(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final I(Landroid/view/View;)V
    .locals 10

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :cond_0
    if-gtz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :cond_1
    if-gtz v0, :cond_2

    .line 23
    .line 24
    const/16 v0, 0x64

    .line 25
    .line 26
    :cond_2
    if-gtz v1, :cond_3

    .line 27
    .line 28
    const/16 v1, 0x32

    .line 29
    .line 30
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    int-to-float v0, v0

    .line 35
    const/high16 v4, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float v7, v0, v4

    .line 38
    .line 39
    int-to-float v0, v1

    .line 40
    div-float v8, v0, v4

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    move-wide v4, v2

    .line 45
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-wide/16 v4, 0x32

    .line 50
    .line 51
    add-long/2addr v4, v2

    .line 52
    const/4 v6, 0x1

    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x1

    .line 59
    sput-boolean v2, Lwy;->d:Z

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 65
    .line 66
    .line 67
    sput-boolean p0, Lwy;->d:Z

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catch_0
    sput-boolean p0, Lwy;->d:Z

    .line 77
    .line 78
    return-void
.end method

.method public static synthetic a(Ljava/lang/Class;Ljava/lang/reflect/Method;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwy;->t(Ljava/lang/Class;Ljava/lang/reflect/Method;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lwy;->x(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwy;->G(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroid/view/View;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lwy;->z(Landroid/view/View;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Landroid/app/Dialog;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwy;->C(Landroid/app/Dialog;Lsw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroid/app/Activity;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwy;->u(Landroid/app/Activity;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwy;->y(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Landroid/app/Dialog;Lsw;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwy;->H(Landroid/app/Dialog;Lsw;Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Landroid/app/Dialog;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwy;->D(Landroid/app/Dialog;Lsw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lwy;->v(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwy;->r(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Ljava/lang/Class;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lwy;->q(Ljava/lang/Class;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m(FI)I
    .locals 0

    .line 1
    int-to-float p0, p2

    .line 2
    mul-float/2addr p0, p1

    .line 3
    const/high16 p1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    add-float/2addr p0, p1

    .line 6
    float-to-int p0, p0

    .line 7
    return p0
.end method

.method private final n(Landroid/app/Activity;Ljava/lang/Class;)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/Class<",
            "*>;)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    sget-object v0, Lwy;->e:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    sget-object v1, Lwy;->a:Lwy;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v0, v2}, Lwy;->A(Landroid/view/View;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_0
    invoke-direct {p0, p1, p2}, Lwy;->o(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method private final o(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/lang/Class<",
            "*>;)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, p1, v1}, Lwy;->A(Landroid/view/View;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    check-cast p1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    if-ge v2, v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {p0, v3, p2}, Lwy;->o(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-object v0
.end method

.method private static final q(Ljava/lang/Class;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lwy;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const/4 v1, -0x1

    .line 38
    if-ne p0, v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    sget-object v1, Lwy;->a:Lwy;

    .line 46
    .line 47
    invoke-direct {v1, v0, p0}, Lwy;->A(Landroid/view/View;I)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    sput-object v0, Lwy;->e:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_4
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p0, Landroid/view/MotionEvent;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    sget-object v2, Lm00;->S:Lm00$a;

    .line 101
    .line 102
    invoke-virtual {v2}, Lm00$a;->Y()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {p0, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2}, Lm00$a;->H()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_6

    .line 119
    .line 120
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_6
    new-instance v1, Lsy;

    .line 126
    .line 127
    const/4 v2, 0x1

    .line 128
    invoke-direct {v1, p0, v0, v2}, Lsy;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 132
    .line 133
    .line 134
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    return-object p0

    .line 137
    :catch_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method

.method private static final r(Landroid/content/Context;Landroid/view/View;)V
    .locals 6

    .line 1
    sget-object v0, Lwy;->a:Lwy;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-static/range {v0 .. v5}, Lwy;->F(Lwy;Landroid/content/Context;Landroid/view/View;Lsw;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final t(Ljava/lang/Class;Ljava/lang/reflect/Method;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "com.xingin.xhs.index.v2.IndexActivityV2"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    sget-object v0, Lwy;->a:Lwy;

    .line 36
    .line 37
    invoke-direct {v0, v2, p0}, Lwy;->n(Landroid/app/Activity;Ljava/lang/Class;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    sput-object p0, Lwy;->e:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_2

    .line 55
    .line 56
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    sget-object p0, Lm00;->S:Lm00$a;

    .line 62
    .line 63
    invoke-virtual {p0}, Lm00$a;->Y()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0}, Lm00$a;->H()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_3

    .line 81
    .line 82
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_3
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance p0, Landroid/os/Handler;

    .line 99
    .line 100
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Lqy;

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    move-object v3, p1

    .line 111
    invoke-direct/range {v1 .. v6}, Lqy;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    return-object p0

    .line 119
    :catch_0
    invoke-interface {p2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method

.method private static final u(Landroid/app/Activity;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;)V
    .locals 3

    .line 1
    sget-object v0, Lwy;->a:Lwy;

    .line 2
    .line 3
    new-instance v1, Lzj;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, p1, p2, p3, v2}, Lzj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lwy;->B(Landroid/content/Context;Lsw;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final v(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/util/List;Z)Lna1;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    :try_start_0
    sget-object p3, Lkf1;->G:Lkf1$a;

    .line 4
    .line 5
    invoke-virtual {p3}, Lkf1$a;->b()Lkf1;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3, p0}, Lio/github/libxposed/api/XposedModule;->getInvoker(Ljava/lang/reflect/Method;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p3, Lio/github/libxposed/api/XposedInterface$Invoker$Type;->ORIGIN:Lio/github/libxposed/api/XposedInterface$Invoker$Type$Origin;

    .line 18
    .line 19
    invoke-interface {p0, p3}, Lio/github/libxposed/api/XposedInterface$Invoker;->setType(Lio/github/libxposed/api/XposedInterface$Invoker$Type;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    new-array p3, p3, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {p2, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    array-length p3, p2

    .line 33
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p0, p1, p2}, Lio/github/libxposed/api/XposedInterface$Invoker;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    :catch_0
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 41
    .line 42
    return-object p0
.end method

.method private static final x(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v2, v0, Landroid/view/View;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v0, Landroid/view/View;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, v3

    .line 42
    :goto_0
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :goto_1
    instance-of v4, v2, Landroid/content/ContextWrapper;

    .line 54
    .line 55
    if-eqz v4, :cond_4

    .line 56
    .line 57
    instance-of v4, v2, Landroid/app/Activity;

    .line 58
    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    check-cast v2, Landroid/app/Activity;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    check-cast v2, Landroid/content/ContextWrapper;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    move-object v2, v3

    .line 72
    :goto_2
    if-eqz v2, :cond_7

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v4, "com.xingin.xhs.index.v2.IndexActivityV2"

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    sget-object v4, Lm00;->S:Lm00$a;

    .line 96
    .line 97
    invoke-virtual {v4}, Lm00$a;->Y()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v2, v5, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v4}, Lm00$a;->H()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-interface {v5, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_6

    .line 114
    .line 115
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_6
    new-instance p0, Landroid/os/Handler;

    .line 121
    .line 122
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-direct {p0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, Lsy;

    .line 130
    .line 131
    invoke-direct {v4, v2, v0, v1}, Lsy;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 135
    .line 136
    .line 137
    return-object v3

    .line 138
    :cond_7
    :goto_3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0
.end method

.method private static final y(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lwy;->a:Lwy;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lpn;

    .line 7
    .line 8
    const/16 v2, 0x17

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lpn;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, p1, v1}, Lwy;->E(Landroid/content/Context;Landroid/view/View;Lsw;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final z(Landroid/view/View;)Lna1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwy;->a:Lwy;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lwy;->J(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public final J(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Lwy;->f:Ljava/lang/Class;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Llb0;->a:Llb0;

    .line 9
    .line 10
    sget-object p1, Lwy;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "triggerFromView: targetClass is null"

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    instance-of v1, p1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    instance-of v1, p1, Landroid/app/Activity;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    check-cast p1, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    instance-of v1, p1, Landroid/app/Activity;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    sget-object p0, Llb0;->a:Llb0;

    .line 42
    .line 43
    sget-object p1, Lwy;->b:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, "triggerFromView: no Activity found"

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    check-cast p1, Landroid/app/Activity;

    .line 52
    .line 53
    invoke-direct {p0, p1, v0}, Lwy;->n(Landroid/app/Activity;Ljava/lang/Class;)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    sget-object p0, Llb0;->a:Llb0;

    .line 60
    .line 61
    sget-object p1, Lwy;->b:Ljava/lang/String;

    .line 62
    .line 63
    const-string v0, "triggerFromView: homeTab not found"

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-direct {p0, p1}, Lwy;->I(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    move-exception p0

    .line 74
    sget-object p1, Llb0;->a:Llb0;

    .line 75
    .line 76
    sget-object v0, Lwy;->b:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string v1, "triggerFromView_err: "

    .line 83
    .line 84
    invoke-static {v1, p0, p1, v0}, Lt1;->s(Ljava/lang/String;Ljava/lang/String;Llb0;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final p(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 1
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
    sput-object p2, Lwy;->f:Ljava/lang/Class;

    .line 8
    .line 9
    :try_start_0
    const-class p0, Landroid/view/View;

    .line 10
    .line 11
    const-string p1, "onTouchEvent"

    .line 12
    .line 13
    const-class v0, Landroid/view/MotionEvent;

    .line 14
    .line 15
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 24
    .line 25
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    new-instance p1, Llg;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p1, v0, p2}, Llg;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final s(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 1
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
    sput-object p2, Lwy;->f:Ljava/lang/Class;

    .line 8
    .line 9
    :try_start_0
    const-string p0, "com.xingin.android.redutils.base.XhsActivity"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "onBackPressed"

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 23
    .line 24
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v0, Lry;

    .line 37
    .line 38
    invoke-direct {v0, p2, p0}, Lry;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final w(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string p0, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p1, "setRefreshing"

    .line 11
    .line 12
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 23
    .line 24
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    new-instance p1, Lua;

    .line 37
    .line 38
    const/16 v0, 0xb

    .line 39
    .line 40
    invoke-direct {p1, v0}, Lua;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    :catch_0
    :cond_0
    return-void
.end method
