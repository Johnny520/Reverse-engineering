.class public final Lkp;
.super Landroid/app/Dialog;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final u:I = 0x8


# instance fields
.field private final d:Landroid/os/Handler;

.field private e:J

.field private f:J

.field private g:Ljava/lang/String;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const v0, 0x1030130

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lkp;->d:Landroid/os/Handler;

    .line 23
    .line 24
    const-string p1, ""

    .line 25
    .line 26
    iput-object p1, p0, Lkp;->g:Ljava/lang/String;

    .line 27
    .line 28
    const/16 p1, 0x28

    .line 29
    .line 30
    const/16 v0, 0x2d

    .line 31
    .line 32
    const/16 v1, 0xff

    .line 33
    .line 34
    invoke-static {v1, p1, p1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lkp;->o:I

    .line 39
    .line 40
    const/16 p1, 0x96

    .line 41
    .line 42
    const/16 v0, 0xf3

    .line 43
    .line 44
    const/16 v2, 0x21

    .line 45
    .line 46
    invoke-static {v1, v2, p1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lkp;->p:I

    .line 51
    .line 52
    const/16 p1, 0xe6

    .line 53
    .line 54
    invoke-static {p1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, Lkp;->q:I

    .line 59
    .line 60
    const/16 p1, 0xa0

    .line 61
    .line 62
    invoke-static {p1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Lkp;->r:I

    .line 67
    .line 68
    const/16 p1, 0x64

    .line 69
    .line 70
    invoke-static {p1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    iput p1, p0, Lkp;->s:I

    .line 75
    .line 76
    const/16 p1, 0x50

    .line 77
    .line 78
    const/16 v0, 0x55

    .line 79
    .line 80
    const/16 v1, 0xc8

    .line 81
    .line 82
    invoke-static {v1, p1, p1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, p0, Lkp;->t:I

    .line 87
    .line 88
    iput-object p2, p0, Lkp;->g:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {p0}, Lkp;->e()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static synthetic a(Lkp;Llp$a;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkp;->m(Lkp;Llp$a;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkp;->f(Landroid/widget/TextView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lkp;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lkp;->k(Lkp;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lkp;Llp$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkp;->l(Lkp;Llp$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, -0x2

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setLayout(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/16 v3, 0x11

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Landroid/view/Window;->setGravity(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroid/widget/LinearLayout;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-direct {v0, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 54
    .line 55
    .line 56
    const/16 v5, 0x18

    .line 57
    .line 58
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    const/16 v7, 0x14

    .line 63
    .line 64
    invoke-direct {p0, v7}, Lkp;->g(I)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const/16 v8, 0x10

    .line 73
    .line 74
    invoke-direct {p0, v8}, Lkp;->g(I)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-virtual {v0, v6, v7, v5, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 82
    .line 83
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, v8}, Lkp;->g(I)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    int-to-float v6, v6

    .line 94
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 95
    .line 96
    .line 97
    iget v6, p0, Lkp;->o:I

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    const/16 v6, 0x140

    .line 108
    .line 109
    invoke-direct {p0, v6}, Lkp;->g(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-direct {v5, v6, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    iget-object v5, p0, Lkp;->g:Ljava/lang/String;

    .line 129
    .line 130
    new-instance v6, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v7, "\u4e0b\u8f7d\u4e2d: "

    .line 133
    .line 134
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    const/high16 v5, 0x41700000    # 15.0f

    .line 148
    .line 149
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 150
    .line 151
    .line 152
    iget v5, p0, Lkp;->q:I

    .line 153
    .line 154
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 158
    .line 159
    .line 160
    const/16 v5, 0xe

    .line 161
    .line 162
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-virtual {v2, v1, v1, v1, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 167
    .line 168
    .line 169
    iput-object v2, p0, Lkp;->h:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    new-instance v2, Landroid/widget/LinearLayout;

    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-direct {v2, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 184
    .line 185
    .line 186
    const/16 v4, 0xa

    .line 187
    .line 188
    invoke-direct {p0, v4}, Lkp;->g(I)I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-virtual {v2, v1, v1, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 193
    .line 194
    .line 195
    new-instance v5, Landroid/view/View;

    .line 196
    .line 197
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-direct {v5, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v1}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    const/4 v7, 0x4

    .line 209
    invoke-direct {p0, v7}, Lkp;->g(I)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    int-to-float v9, v9

    .line 214
    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 215
    .line 216
    .line 217
    iget v9, p0, Lkp;->s:I

    .line 218
    .line 219
    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 223
    .line 224
    .line 225
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 226
    .line 227
    const/16 v9, 0x8

    .line 228
    .line 229
    invoke-direct {p0, v9}, Lkp;->g(I)I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    const/4 v11, -0x1

    .line 234
    invoke-direct {v6, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    .line 239
    .line 240
    iput-object v5, p0, Lkp;->i:Landroid/view/View;

    .line 241
    .line 242
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    new-instance v5, Landroid/widget/FrameLayout;

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-direct {v5, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 255
    .line 256
    invoke-direct {p0, v9}, Lkp;->g(I)I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    invoke-direct {v6, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 261
    .line 262
    .line 263
    invoke-direct {p0, v9}, Lkp;->g(I)I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    neg-int v10, v10

    .line 268
    iput v10, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 269
    .line 270
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 271
    .line 272
    .line 273
    new-instance v6, Landroid/view/View;

    .line 274
    .line 275
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    invoke-direct {v6, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v1}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 283
    .line 284
    .line 285
    move-result-object v10

    .line 286
    invoke-direct {p0, v7}, Lkp;->g(I)I

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    int-to-float v7, v7

    .line 291
    invoke-virtual {v10, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 292
    .line 293
    .line 294
    iget v7, p0, Lkp;->p:I

    .line 295
    .line 296
    invoke-virtual {v10, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 300
    .line 301
    .line 302
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 303
    .line 304
    invoke-direct {p0, v9}, Lkp;->g(I)I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    invoke-direct {v7, v1, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 309
    .line 310
    .line 311
    const v9, 0x800013

    .line 312
    .line 313
    .line 314
    iput v9, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 315
    .line 316
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    .line 319
    iput-object v6, p0, Lkp;->j:Landroid/view/View;

    .line 320
    .line 321
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 328
    .line 329
    .line 330
    new-instance v2, Landroid/widget/TextView;

    .line 331
    .line 332
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 337
    .line 338
    .line 339
    const-string v5, "0%"

    .line 340
    .line 341
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    const/high16 v5, 0x41e00000    # 28.0f

    .line 345
    .line 346
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 347
    .line 348
    .line 349
    iget v5, p0, Lkp;->q:I

    .line 350
    .line 351
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 355
    .line 356
    .line 357
    const/4 v5, 0x6

    .line 358
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    invoke-virtual {v2, v1, v1, v1, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 363
    .line 364
    .line 365
    iput-object v2, p0, Lkp;->k:Landroid/widget/TextView;

    .line 366
    .line 367
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 368
    .line 369
    .line 370
    new-instance v2, Landroid/widget/TextView;

    .line 371
    .line 372
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 377
    .line 378
    .line 379
    const-string v5, "0 B / --"

    .line 380
    .line 381
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    const/high16 v5, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 387
    .line 388
    .line 389
    iget v5, p0, Lkp;->r:I

    .line 390
    .line 391
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 395
    .line 396
    .line 397
    iput-object v2, p0, Lkp;->l:Landroid/widget/TextView;

    .line 398
    .line 399
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 400
    .line 401
    .line 402
    new-instance v2, Landroid/widget/TextView;

    .line 403
    .line 404
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 409
    .line 410
    .line 411
    const-string v5, ""

    .line 412
    .line 413
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    .line 415
    .line 416
    const/high16 v5, 0x41300000    # 11.0f

    .line 417
    .line 418
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 419
    .line 420
    .line 421
    iget v5, p0, Lkp;->r:I

    .line 422
    .line 423
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 427
    .line 428
    .line 429
    const/4 v5, 0x2

    .line 430
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    const/16 v6, 0xc

    .line 435
    .line 436
    invoke-direct {p0, v6}, Lkp;->g(I)I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    invoke-virtual {v2, v1, v5, v1, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 441
    .line 442
    .line 443
    iput-object v2, p0, Lkp;->m:Landroid/widget/TextView;

    .line 444
    .line 445
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 446
    .line 447
    .line 448
    new-instance v2, Landroid/widget/TextView;

    .line 449
    .line 450
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 455
    .line 456
    .line 457
    const-string v5, "\u53d6\u6d88\u4e0b\u8f7d"

    .line 458
    .line 459
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    .line 461
    .line 462
    const/high16 v5, 0x41600000    # 14.0f

    .line 463
    .line 464
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 471
    .line 472
    .line 473
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 474
    .line 475
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 479
    .line 480
    .line 481
    const/16 v5, 0x16

    .line 482
    .line 483
    invoke-direct {p0, v5}, Lkp;->g(I)I

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    int-to-float v5, v5

    .line 488
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 489
    .line 490
    .line 491
    iget v5, p0, Lkp;->t:I

    .line 492
    .line 493
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 497
    .line 498
    .line 499
    invoke-direct {p0, v8}, Lkp;->g(I)I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    invoke-direct {p0, v4}, Lkp;->g(I)I

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    invoke-direct {p0, v8}, Lkp;->g(I)I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    invoke-direct {p0, v4}, Lkp;->g(I)I

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    invoke-virtual {v2, v3, v5, v6, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 516
    .line 517
    .line 518
    new-instance v3, Ljp;

    .line 519
    .line 520
    invoke-direct {v3, v2, v1}, Ljp;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 524
    .line 525
    .line 526
    iput-object v2, p0, Lkp;->n:Landroid/widget/TextView;

    .line 527
    .line 528
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 532
    .line 533
    .line 534
    return-void
.end method

.method private static final f(Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 3
    .line 4
    .line 5
    const-string p1, "\u53d6\u6d88\u4e2d..."

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Llp;->a:Llp;

    .line 11
    .line 12
    invoke-virtual {p0}, Llp;->a()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final g(I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    mul-float/2addr p1, p0

    .line 17
    float-to-int p0, p1

    .line 18
    return p0
.end method

.method private final h(J)Ljava/lang/String;
    .locals 3

    .line 1
    const-wide/16 v0, 0x400

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " B"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const-wide/32 v0, 0x100000

    .line 26
    .line 27
    .line 28
    cmp-long p0, p1, v0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    if-gez p0, :cond_1

    .line 32
    .line 33
    long-to-double p0, p1

    .line 34
    const-wide/high16 v1, 0x4090000000000000L    # 1024.0

    .line 35
    .line 36
    div-double/2addr p0, v1

    .line 37
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "%.1f KB"

    .line 50
    .line 51
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_1
    const-wide/32 v1, 0x40000000

    .line 57
    .line 58
    .line 59
    cmp-long p0, p1, v1

    .line 60
    .line 61
    if-gez p0, :cond_2

    .line 62
    .line 63
    long-to-double p0, p1

    .line 64
    const-wide/high16 v1, 0x4130000000000000L    # 1048576.0

    .line 65
    .line 66
    div-double/2addr p0, v1

    .line 67
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "%.1f MB"

    .line 80
    .line 81
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_2
    long-to-double p0, p1

    .line 87
    const-wide/high16 v1, 0x41d0000000000000L    # 1.073741824E9

    .line 88
    .line 89
    div-double/2addr p0, v1

    .line 90
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string p1, "%.2f GB"

    .line 103
    .line 104
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method private final i(J)Ljava/lang/String;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-gtz p0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/16 v0, 0x400

    .line 11
    .line 12
    cmp-long p0, p1, v0

    .line 13
    .line 14
    if-gez p0, :cond_1

    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, " B/s"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const-wide/32 v0, 0x100000

    .line 35
    .line 36
    .line 37
    cmp-long p0, p1, v0

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    if-gez p0, :cond_2

    .line 41
    .line 42
    long-to-double p0, p1

    .line 43
    const-wide/high16 v1, 0x4090000000000000L    # 1024.0

    .line 44
    .line 45
    div-double/2addr p0, v1

    .line 46
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "%.1f KB/s"

    .line 59
    .line 60
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    long-to-double p0, p1

    .line 66
    const-wide/high16 v1, 0x4130000000000000L    # 1048576.0

    .line 67
    .line 68
    div-double/2addr p0, v1

    .line 69
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p1, "%.1f MB/s"

    .line 82
    .line 83
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method private final j(Llp$a;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Llp$a;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Llp$a;->l()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lkp;->d:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v1, Lt4;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, v2, p0, p1}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    :goto_0
    iget-object p1, p0, Lkp;->d:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v0, Lip;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, v1}, Lip;-><init>(Lkp;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private static final k(Lkp;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkp;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final l(Lkp;Llp$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkp;->n(Llp$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final m(Lkp;Llp$a;)Lna1;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkp;->j(Llp$a;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lna1;->a:Lna1;

    .line 5
    .line 6
    return-object p0
.end method

.method private final n(Llp$a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Llp$a;->i()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Llp$a;->i()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, v0, Lkp;->g:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual/range {p1 .. p1}, Llp$a;->i()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, v0, Lkp;->g:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, v0, Lkp;->h:Landroid/widget/TextView;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v5, "\u4e0b\u8f7d\u4e2d: "

    .line 39
    .line 40
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v0, "titleView"

    .line 55
    .line 56
    invoke-static {v0}, Lp30;->V(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Llp$a;->j()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-virtual/range {p1 .. p1}, Llp$a;->h()J

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    cmp-long v1, v3, v7

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    if-lez v1, :cond_2

    .line 74
    .line 75
    const-wide/16 v10, 0x64

    .line 76
    .line 77
    mul-long/2addr v10, v5

    .line 78
    div-long/2addr v10, v3

    .line 79
    long-to-int v10, v10

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move v10, v9

    .line 82
    :goto_1
    const/16 v11, 0x64

    .line 83
    .line 84
    invoke-static {v10, v9, v11}, Lw60;->n(III)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    const/16 v11, 0x110

    .line 89
    .line 90
    invoke-direct {v0, v11}, Lkp;->g(I)I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-lez v1, :cond_3

    .line 95
    .line 96
    int-to-long v12, v11

    .line 97
    mul-long/2addr v12, v5

    .line 98
    div-long/2addr v12, v3

    .line 99
    long-to-int v12, v12

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v12, v9

    .line 102
    :goto_2
    iget-object v13, v0, Lkp;->j:Landroid/view/View;

    .line 103
    .line 104
    const-string v14, "progressBarFill"

    .line 105
    .line 106
    if-eqz v13, :cond_10

    .line 107
    .line 108
    if-eqz v13, :cond_f

    .line 109
    .line 110
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    if-gez v12, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move v9, v12

    .line 121
    :goto_3
    if-le v9, v11, :cond_5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    move v11, v9

    .line 125
    :goto_4
    iput v11, v15, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 126
    .line 127
    invoke-virtual {v13, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    .line 130
    iget-object v9, v0, Lkp;->j:Landroid/view/View;

    .line 131
    .line 132
    if-eqz v9, :cond_e

    .line 133
    .line 134
    invoke-virtual {v9}, Landroid/view/View;->requestLayout()V

    .line 135
    .line 136
    .line 137
    iget-object v9, v0, Lkp;->k:Landroid/widget/TextView;

    .line 138
    .line 139
    if-eqz v9, :cond_d

    .line 140
    .line 141
    new-instance v11, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v10, "%"

    .line 150
    .line 151
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    iget-object v9, v0, Lkp;->l:Landroid/widget/TextView;

    .line 162
    .line 163
    if-eqz v9, :cond_c

    .line 164
    .line 165
    invoke-direct {v0, v5, v6}, Lkp;->h(J)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    if-lez v1, :cond_6

    .line 170
    .line 171
    invoke-direct {v0, v3, v4}, Lkp;->h(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    goto :goto_5

    .line 176
    :cond_6
    const-string v1, "--"

    .line 177
    .line 178
    :goto_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v4, " / "

    .line 187
    .line 188
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v3

    .line 205
    invoke-virtual/range {p1 .. p1}, Llp$a;->i()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget-object v9, v0, Lkp;->g:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v1, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const-string v9, "speedView"

    .line 216
    .line 217
    if-eqz v1, :cond_a

    .line 218
    .line 219
    iget-wide v10, v0, Lkp;->e:J

    .line 220
    .line 221
    cmp-long v1, v10, v7

    .line 222
    .line 223
    if-lez v1, :cond_9

    .line 224
    .line 225
    cmp-long v1, v3, v10

    .line 226
    .line 227
    if-lez v1, :cond_9

    .line 228
    .line 229
    sub-long v7, v3, v10

    .line 230
    .line 231
    long-to-double v7, v7

    .line 232
    const-wide v10, 0x408f400000000000L    # 1000.0

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    div-double/2addr v7, v10

    .line 238
    const-wide v10, 0x3fd3333333333333L    # 0.3

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    cmpl-double v1, v7, v10

    .line 244
    .line 245
    if-lez v1, :cond_8

    .line 246
    .line 247
    iget-wide v10, v0, Lkp;->f:J

    .line 248
    .line 249
    sub-long v10, v5, v10

    .line 250
    .line 251
    long-to-double v10, v10

    .line 252
    div-double/2addr v10, v7

    .line 253
    double-to-long v7, v10

    .line 254
    iget-object v1, v0, Lkp;->m:Landroid/widget/TextView;

    .line 255
    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    invoke-direct {v0, v7, v8}, Lkp;->i(J)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    iput-wide v3, v0, Lkp;->e:J

    .line 266
    .line 267
    iput-wide v5, v0, Lkp;->f:J

    .line 268
    .line 269
    return-void

    .line 270
    :cond_7
    invoke-static {v9}, Lp30;->V(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v2

    .line 274
    :cond_8
    return-void

    .line 275
    :cond_9
    iput-wide v3, v0, Lkp;->e:J

    .line 276
    .line 277
    iput-wide v5, v0, Lkp;->f:J

    .line 278
    .line 279
    return-void

    .line 280
    :cond_a
    iput-wide v3, v0, Lkp;->e:J

    .line 281
    .line 282
    iput-wide v5, v0, Lkp;->f:J

    .line 283
    .line 284
    iget-object v0, v0, Lkp;->m:Landroid/widget/TextView;

    .line 285
    .line 286
    if-eqz v0, :cond_b

    .line 287
    .line 288
    const-string v1, ""

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_b
    invoke-static {v9}, Lp30;->V(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v2

    .line 298
    :cond_c
    const-string v0, "sizeView"

    .line 299
    .line 300
    invoke-static {v0}, Lp30;->V(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v2

    .line 304
    :cond_d
    const-string v0, "percentView"

    .line 305
    .line 306
    invoke-static {v0}, Lp30;->V(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v2

    .line 310
    :cond_e
    invoke-static {v14}, Lp30;->V(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v2

    .line 314
    :cond_f
    invoke-static {v14}, Lp30;->V(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v2

    .line 318
    :cond_10
    invoke-static {v14}, Lp30;->V(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v2
.end method


# virtual methods
.method public dismiss()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Llp;->a:Llp;

    .line 5
    .line 6
    invoke-virtual {p0}, Llp;->h()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public show()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Llp;->a:Llp;

    .line 5
    .line 6
    new-instance v1, Lo;

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-direct {v1, v2, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Llp;->g(Lsw;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
