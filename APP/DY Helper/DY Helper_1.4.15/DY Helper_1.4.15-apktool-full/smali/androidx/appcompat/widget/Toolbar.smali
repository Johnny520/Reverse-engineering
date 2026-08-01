.class public Landroidx/appcompat/widget/Toolbar;
.super Landroid/view/ViewGroup;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public Α:I

.field public Β:I

.field public final Γ:I

.field public Δ:Ljava/lang/CharSequence;

.field public Ε:Ljava/lang/CharSequence;

.field public Ζ:Landroid/content/res/ColorStateList;

.field public Η:Landroid/content/res/ColorStateList;

.field public Θ:Z

.field public Ι:Z

.field public final Κ:Ljava/util/ArrayList;

.field public final Λ:Ljava/util/ArrayList;

.field public final Μ:[I

.field public final Ν:Lm6;

.field public Ξ:Ljava/util/ArrayList;

.field public final Ο:Lt42;

.field public Π:Lb52;

.field public Ρ:Landroidx/appcompat/widget/γ;

.field public Σ:Lv42;

.field public Τ:Z

.field public Υ:Landroid/window/OnBackInvokedCallback;

.field public Φ:Landroid/window/OnBackInvokedDispatcher;

.field public Χ:Z

.field public final Ψ:Ld1;

.field public ε:Landroidx/appcompat/widget/ActionMenuView;

.field public ζ:Landroidx/appcompat/widget/AppCompatTextView;

.field public η:Landroidx/appcompat/widget/AppCompatTextView;

.field public θ:Landroidx/appcompat/widget/AppCompatImageButton;

.field public ι:Landroidx/appcompat/widget/AppCompatImageView;

.field public final κ:Landroid/graphics/drawable/Drawable;

.field public final λ:Ljava/lang/CharSequence;

.field public μ:Landroidx/appcompat/widget/AppCompatImageButton;

.field public ν:Landroid/view/View;

.field public ξ:Landroid/content/Context;

.field public ο:I

.field public π:I

.field public ρ:I

.field public final σ:I

.field public final τ:I

.field public υ:I

.field public φ:I

.field public χ:I

.field public ψ:I

.field public ω:Llq0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 431
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040136

    .line 430
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const v0, 0x800013

    .line 5
    .line 6
    .line 7
    iput v0, p0, Landroidx/appcompat/widget/Toolbar;->Γ:I

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Κ:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    new-array v2, v1, [I

    .line 25
    .line 26
    iput-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Μ:[I

    .line 27
    .line 28
    new-instance v2, Lm6;

    .line 29
    .line 30
    new-instance v3, Ls42;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v3, p0, v4}, Ls42;-><init>(Landroidx/appcompat/widget/Toolbar;I)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v3}, Lm6;-><init>(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Ν:Lm6;

    .line 40
    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Ξ:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v2, Lt42;

    .line 49
    .line 50
    invoke-direct {v2, p0}, Lt42;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Ο:Lt42;

    .line 54
    .line 55
    new-instance v2, Ld1;

    .line 56
    .line 57
    const/16 v3, 0xb

    .line 58
    .line 59
    invoke-direct {v2, v3, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Ψ:Ld1;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v6, Lkk1;->Β:[I

    .line 69
    .line 70
    invoke-static {v2, p2, v6, p3}, Lm6;->Μ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lm6;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v4, v2, Lm6;->ζ:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v8, v4

    .line 77
    check-cast v8, Landroid/content/res/TypedArray;

    .line 78
    .line 79
    sget-object v4, Lb92;->α:Ljava/util/WeakHashMap;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    move-object v4, p0

    .line 83
    move-object v5, p1

    .line 84
    move-object v7, p2

    .line 85
    move v9, p3

    .line 86
    invoke-static/range {v4 .. v10}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 87
    .line 88
    .line 89
    iget-object p0, v2, Lm6;->ζ:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Landroid/content/res/TypedArray;

    .line 92
    .line 93
    const/16 p1, 0x1c

    .line 94
    .line 95
    const/4 p2, 0x0

    .line 96
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->π:I

    .line 101
    .line 102
    const/16 p1, 0x13

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->ρ:I

    .line 109
    .line 110
    invoke-virtual {p0, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->Γ:I

    .line 115
    .line 116
    const/16 p1, 0x30

    .line 117
    .line 118
    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->σ:I

    .line 123
    .line 124
    const/16 p1, 0x16

    .line 125
    .line 126
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    const/16 p3, 0x1b

    .line 131
    .line 132
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_0

    .line 137
    .line 138
    invoke-virtual {p0, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    :cond_0
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 143
    .line 144
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 145
    .line 146
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 147
    .line 148
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 149
    .line 150
    const/16 p1, 0x19

    .line 151
    .line 152
    const/4 p3, -0x1

    .line 153
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-ltz p1, :cond_1

    .line 158
    .line 159
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 160
    .line 161
    :cond_1
    const/16 p1, 0x18

    .line 162
    .line 163
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-ltz p1, :cond_2

    .line 168
    .line 169
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 170
    .line 171
    :cond_2
    const/16 p1, 0x1a

    .line 172
    .line 173
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-ltz p1, :cond_3

    .line 178
    .line 179
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 180
    .line 181
    :cond_3
    const/16 p1, 0x17

    .line 182
    .line 183
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-ltz p1, :cond_4

    .line 188
    .line 189
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 190
    .line 191
    :cond_4
    const/16 p1, 0xd

    .line 192
    .line 193
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->τ:I

    .line 198
    .line 199
    const/16 p1, 0x9

    .line 200
    .line 201
    const/high16 p3, -0x80000000

    .line 202
    .line 203
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    const/4 v0, 0x5

    .line 208
    invoke-virtual {p0, v0, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    const/4 v1, 0x7

    .line 213
    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    const/16 v5, 0x8

    .line 218
    .line 219
    invoke-virtual {p0, v5, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    invoke-virtual {v4}, Landroidx/appcompat/widget/Toolbar;->δ()V

    .line 224
    .line 225
    .line 226
    iget-object v6, v4, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 227
    .line 228
    iput-boolean p2, v6, Llq0;->ι:Z

    .line 229
    .line 230
    if-eq v1, p3, :cond_5

    .line 231
    .line 232
    iput v1, v6, Llq0;->ζ:I

    .line 233
    .line 234
    iput v1, v6, Llq0;->β:I

    .line 235
    .line 236
    :cond_5
    if-eq v5, p3, :cond_6

    .line 237
    .line 238
    iput v5, v6, Llq0;->η:I

    .line 239
    .line 240
    iput v5, v6, Llq0;->γ:I

    .line 241
    .line 242
    :cond_6
    if-ne p1, p3, :cond_7

    .line 243
    .line 244
    if-eq v0, p3, :cond_8

    .line 245
    .line 246
    :cond_7
    invoke-virtual {v6, p1, v0}, Llq0;->α(II)V

    .line 247
    .line 248
    .line 249
    :cond_8
    const/16 p1, 0xa

    .line 250
    .line 251
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->Α:I

    .line 256
    .line 257
    const/4 p1, 0x6

    .line 258
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    iput p1, v4, Landroidx/appcompat/widget/Toolbar;->Β:I

    .line 263
    .line 264
    const/4 p1, 0x4

    .line 265
    invoke-virtual {v2, p1}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, v4, Landroidx/appcompat/widget/Toolbar;->κ:Landroid/graphics/drawable/Drawable;

    .line 270
    .line 271
    const/4 p1, 0x3

    .line 272
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, v4, Landroidx/appcompat/widget/Toolbar;->λ:Ljava/lang/CharSequence;

    .line 277
    .line 278
    const/16 p1, 0x15

    .line 279
    .line 280
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 285
    .line 286
    .line 287
    move-result p3

    .line 288
    if-nez p3, :cond_9

    .line 289
    .line 290
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    const/16 p1, 0x12

    .line 294
    .line 295
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result p3

    .line 303
    if-nez p3, :cond_a

    .line 304
    .line 305
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 306
    .line 307
    .line 308
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, v4, Landroidx/appcompat/widget/Toolbar;->ξ:Landroid/content/Context;

    .line 313
    .line 314
    const/16 p1, 0x11

    .line 315
    .line 316
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    .line 321
    .line 322
    .line 323
    const/16 p1, 0x10

    .line 324
    .line 325
    invoke-virtual {v2, p1}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-eqz p1, :cond_b

    .line 330
    .line 331
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    const/16 p1, 0xf

    .line 335
    .line 336
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 341
    .line 342
    .line 343
    move-result p3

    .line 344
    if-nez p3, :cond_c

    .line 345
    .line 346
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    :cond_c
    invoke-virtual {v2, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    if-eqz p1, :cond_d

    .line 354
    .line 355
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 356
    .line 357
    .line 358
    :cond_d
    const/16 p1, 0xc

    .line 359
    .line 360
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 365
    .line 366
    .line 367
    move-result p3

    .line 368
    if-nez p3, :cond_e

    .line 369
    .line 370
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    :cond_e
    const/16 p1, 0x1d

    .line 374
    .line 375
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 376
    .line 377
    .line 378
    move-result p3

    .line 379
    if-eqz p3, :cond_f

    .line 380
    .line 381
    invoke-virtual {v2, p1}, Lm6;->ψ(I)Landroid/content/res/ColorStateList;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    .line 386
    .line 387
    .line 388
    :cond_f
    const/16 p1, 0x14

    .line 389
    .line 390
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 391
    .line 392
    .line 393
    move-result p3

    .line 394
    if-eqz p3, :cond_10

    .line 395
    .line 396
    invoke-virtual {v2, p1}, Lm6;->ψ(I)Landroid/content/res/ColorStateList;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {v4, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    .line 401
    .line 402
    .line 403
    :cond_10
    const/16 p1, 0xe

    .line 404
    .line 405
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 406
    .line 407
    .line 408
    move-result p3

    .line 409
    if-eqz p3, :cond_11

    .line 410
    .line 411
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 412
    .line 413
    .line 414
    move-result p0

    .line 415
    invoke-direct {v4}, Landroidx/appcompat/widget/Toolbar;->getMenuInflater()Landroid/view/MenuInflater;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    invoke-virtual {v4}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    invoke-virtual {p1, p0, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 424
    .line 425
    .line 426
    :cond_11
    invoke-virtual {v2}, Lm6;->Ξ()V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method private getCurrentMenuItems()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Landroid/view/Menu;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    new-instance v0, Ls12;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ls12;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static θ()Lw42;
    .locals 2

    .line 1
    new-instance v0, Lw42;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, v0, Lw42;->β:I

    .line 9
    .line 10
    const v1, 0x800013

    .line 11
    .line 12
    .line 13
    iput v1, v0, Lw42;->α:I

    .line 14
    .line 15
    return-object v0
.end method

.method public static ι(Landroid/view/ViewGroup$LayoutParams;)Lw42;
    .locals 2

    .line 1
    instance-of v0, p0, Lw42;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lw42;

    .line 7
    .line 8
    check-cast p0, Lw42;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lw42;-><init>(Lw42;)V

    .line 11
    .line 12
    .line 13
    iput v1, v0, Lw42;->β:I

    .line 14
    .line 15
    iget p0, p0, Lw42;->β:I

    .line 16
    .line 17
    iput p0, v0, Lw42;->β:I

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lw42;

    .line 23
    .line 24
    check-cast p0, Lw42;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lw42;-><init>(Lw42;)V

    .line 27
    .line 28
    .line 29
    iput v1, v0, Lw42;->β:I

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lw42;

    .line 37
    .line 38
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lw42;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    iput v1, v0, Lw42;->β:I

    .line 44
    .line 45
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 46
    .line 47
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 48
    .line 49
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 50
    .line 51
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 52
    .line 53
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 54
    .line 55
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 56
    .line 57
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 58
    .line 59
    iput p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    new-instance v0, Lw42;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lw42;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    iput v1, v0, Lw42;->β:I

    .line 68
    .line 69
    return-object v0
.end method

.method public static λ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public static μ(Landroid/view/View;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 8
    .line 9
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 10
    .line 11
    add-int/2addr v0, p0

    .line 12
    return v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p0, p1, Lw42;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->θ()Lw42;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Lw42;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput v1, v0, Lw42;->α:I

    .line 12
    .line 13
    sget-object v2, Lkk1;->β:[I

    .line 14
    .line 15
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, v0, Lw42;->α:I

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 26
    .line 27
    .line 28
    iput v1, v0, Lw42;->β:I

    .line 29
    .line 30
    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 31
    invoke-static {p1}, Landroidx/appcompat/widget/Toolbar;->ι(Landroid/view/ViewGroup$LayoutParams;)Lw42;

    move-result-object p0

    return-object p0
.end method

.method public getCollapseContentDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getCollapseIcon()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getContentInsetEnd()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Llq0;->θ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Llq0;->β:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    iget p0, p0, Llq0;->γ:I

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getContentInsetEndWithActions()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->Β:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public getContentInsetLeft()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Llq0;->β:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public getContentInsetRight()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Llq0;->γ:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public getContentInsetStart()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Llq0;->θ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Llq0;->γ:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    iget p0, p0, Llq0;->β:I

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getContentInsetStartWithNavigation()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->Α:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public getCurrentContentInsetEnd()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->υ:Liz0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Liz0;->hasVisibleItems()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->Β:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public getCurrentContentInsetLeft()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getCurrentContentInsetRight()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getCurrentContentInsetStart()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->Α:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public getLogo()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getLogoDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ε()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getNavButtonView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNavigationContentDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getNavigationIcon()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getOuterActionMenuPresenter()Landroidx/appcompat/widget/γ;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Ρ:Landroidx/appcompat/widget/γ;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ε()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getPopupContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ξ:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPopupTheme()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->ο:I

    .line 2
    .line 3
    return p0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Ε:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSubtitleTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Δ:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTitleMarginBottom()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 2
    .line 3
    return p0
.end method

.method public getTitleMarginEnd()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 2
    .line 3
    return p0
.end method

.method public getTitleMarginStart()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 2
    .line 3
    return p0
.end method

.method public getTitleMarginTop()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTitleTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getWrapper()Lyq;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Π:Lb52;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    new-instance v0, Lb52;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput v1, v0, Lb52;->ξ:I

    .line 12
    .line 13
    iput-object p0, v0, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, v0, Lb52;->θ:Ljava/lang/CharSequence;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, v0, Lb52;->ι:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget-object v2, v0, Lb52;->θ:Ljava/lang/CharSequence;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v2, v1

    .line 35
    :goto_0
    iput-boolean v2, v0, Lb52;->η:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, v0, Lb52;->ζ:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v4, Lkk1;->α:[I

    .line 48
    .line 49
    const v5, 0x7f040005

    .line 50
    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-static {v2, v6, v4, v5}, Lm6;->Μ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lm6;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v4, v2, Lm6;->ζ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Landroid/content/res/TypedArray;

    .line 60
    .line 61
    const/16 v5, 0xf

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iput-object v5, v0, Lb52;->ο:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    const/16 v5, 0x1b

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_1

    .line 80
    .line 81
    iput-boolean v3, v0, Lb52;->η:Z

    .line 82
    .line 83
    iput-object v5, v0, Lb52;->θ:Ljava/lang/CharSequence;

    .line 84
    .line 85
    iget v3, v0, Lb52;->β:I

    .line 86
    .line 87
    and-int/lit8 v3, v3, 0x8

    .line 88
    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iget-boolean v3, v0, Lb52;->η:Z

    .line 95
    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v3, v5}, Lb92;->η(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    const/16 v3, 0x19

    .line 106
    .line 107
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_2

    .line 116
    .line 117
    iput-object v3, v0, Lb52;->ι:Ljava/lang/CharSequence;

    .line 118
    .line 119
    iget v5, v0, Lb52;->β:I

    .line 120
    .line 121
    and-int/lit8 v5, v5, 0x8

    .line 122
    .line 123
    if-eqz v5, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    const/16 v3, 0x14

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    if-eqz v3, :cond_3

    .line 135
    .line 136
    iput-object v3, v0, Lb52;->ε:Landroid/graphics/drawable/Drawable;

    .line 137
    .line 138
    invoke-virtual {v0}, Lb52;->γ()V

    .line 139
    .line 140
    .line 141
    :cond_3
    const/16 v3, 0x11

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-eqz v3, :cond_4

    .line 148
    .line 149
    iput-object v3, v0, Lb52;->δ:Landroid/graphics/drawable/Drawable;

    .line 150
    .line 151
    invoke-virtual {v0}, Lb52;->γ()V

    .line 152
    .line 153
    .line 154
    :cond_4
    iget-object v3, v0, Lb52;->ζ:Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    if-nez v3, :cond_6

    .line 157
    .line 158
    iget-object v3, v0, Lb52;->ο:Landroid/graphics/drawable/Drawable;

    .line 159
    .line 160
    if-eqz v3, :cond_6

    .line 161
    .line 162
    iput-object v3, v0, Lb52;->ζ:Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    iget v5, v0, Lb52;->β:I

    .line 165
    .line 166
    and-int/lit8 v5, v5, 0x4

    .line 167
    .line 168
    if-eqz v5, :cond_5

    .line 169
    .line 170
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_5
    invoke-virtual {p0, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    :goto_1
    const/16 v3, 0xa

    .line 178
    .line 179
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-virtual {v0, v3}, Lb52;->α(I)V

    .line 184
    .line 185
    .line 186
    const/16 v3, 0x9

    .line 187
    .line 188
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_9

    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v5, v3, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    iget-object v5, v0, Lb52;->γ:Landroid/view/View;

    .line 207
    .line 208
    if-eqz v5, :cond_7

    .line 209
    .line 210
    iget v7, v0, Lb52;->β:I

    .line 211
    .line 212
    and-int/lit8 v7, v7, 0x10

    .line 213
    .line 214
    if-eqz v7, :cond_7

    .line 215
    .line 216
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    :cond_7
    iput-object v3, v0, Lb52;->γ:Landroid/view/View;

    .line 220
    .line 221
    if-eqz v3, :cond_8

    .line 222
    .line 223
    iget v5, v0, Lb52;->β:I

    .line 224
    .line 225
    and-int/lit8 v5, v5, 0x10

    .line 226
    .line 227
    if-eqz v5, :cond_8

    .line 228
    .line 229
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    iget v3, v0, Lb52;->β:I

    .line 233
    .line 234
    or-int/lit8 v3, v3, 0x10

    .line 235
    .line 236
    invoke-virtual {v0, v3}, Lb52;->α(I)V

    .line 237
    .line 238
    .line 239
    :cond_9
    const/16 v3, 0xd

    .line 240
    .line 241
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-lez v3, :cond_a

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 252
    .line 253
    invoke-virtual {p0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 254
    .line 255
    .line 256
    :cond_a
    const/4 v3, 0x7

    .line 257
    const/4 v5, -0x1

    .line 258
    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    const/4 v7, 0x3

    .line 263
    invoke-virtual {v4, v7, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-gez v3, :cond_b

    .line 268
    .line 269
    if-ltz v5, :cond_c

    .line 270
    .line 271
    :cond_b
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->δ()V

    .line 280
    .line 281
    .line 282
    iget-object v7, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 283
    .line 284
    invoke-virtual {v7, v3, v5}, Llq0;->α(II)V

    .line 285
    .line 286
    .line 287
    :cond_c
    const/16 v3, 0x1c

    .line 288
    .line 289
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_d

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    iput v3, p0, Landroidx/appcompat/widget/Toolbar;->π:I

    .line 300
    .line 301
    iget-object v7, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 302
    .line 303
    if-eqz v7, :cond_d

    .line 304
    .line 305
    invoke-virtual {v7, v5, v3}, Landroidx/appcompat/widget/AppCompatTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 306
    .line 307
    .line 308
    :cond_d
    const/16 v3, 0x1a

    .line 309
    .line 310
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_e

    .line 315
    .line 316
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput v3, p0, Landroidx/appcompat/widget/Toolbar;->ρ:I

    .line 321
    .line 322
    iget-object v7, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 323
    .line 324
    if-eqz v7, :cond_e

    .line 325
    .line 326
    invoke-virtual {v7, v5, v3}, Landroidx/appcompat/widget/AppCompatTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 327
    .line 328
    .line 329
    :cond_e
    const/16 v3, 0x16

    .line 330
    .line 331
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_f

    .line 336
    .line 337
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    .line 338
    .line 339
    .line 340
    :cond_f
    invoke-virtual {v2}, Lm6;->Ξ()V

    .line 341
    .line 342
    .line 343
    iget v1, v0, Lb52;->ξ:I

    .line 344
    .line 345
    const v2, 0x7f0f0001

    .line 346
    .line 347
    .line 348
    if-ne v2, v1, :cond_10

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_10
    iput v2, v0, Lb52;->ξ:I

    .line 352
    .line 353
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-eqz v1, :cond_12

    .line 362
    .line 363
    iget v1, v0, Lb52;->ξ:I

    .line 364
    .line 365
    if-nez v1, :cond_11

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    :goto_2
    iput-object v6, v0, Lb52;->κ:Ljava/lang/CharSequence;

    .line 377
    .line 378
    invoke-virtual {v0}, Lb52;->β()V

    .line 379
    .line 380
    .line 381
    :cond_12
    :goto_3
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    iput-object v1, v0, Lb52;->κ:Ljava/lang/CharSequence;

    .line 386
    .line 387
    new-instance v1, Lz42;

    .line 388
    .line 389
    invoke-direct {v1, v0}, Lz42;-><init>(Lb52;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    .line 394
    .line 395
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Π:Lb52;

    .line 396
    .line 397
    :cond_13
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Π:Lb52;

    .line 398
    .line 399
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->υ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Ψ:Ld1;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->υ()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->Ι:Z

    .line 11
    .line 12
    :cond_0
    iget-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->Ι:Z

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iput-boolean v4, p0, Landroidx/appcompat/widget/Toolbar;->Ι:Z

    .line 26
    .line 27
    :cond_1
    const/16 p1, 0xa

    .line 28
    .line 29
    if-eq v0, p1, :cond_3

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    if-ne v0, p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v4

    .line 36
    :cond_3
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->Ι:Z

    .line 37
    .line 38
    return v4
.end method

.method public final onLayout(ZIIII)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    move v1, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    sub-int v10, v4, v7

    .line 39
    .line 40
    iget-object v11, v0, Landroidx/appcompat/widget/Toolbar;->Μ:[I

    .line 41
    .line 42
    aput v2, v11, v3

    .line 43
    .line 44
    aput v2, v11, v2

    .line 45
    .line 46
    sget-object v12, Lb92;->α:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-ltz v12, :cond_1

    .line 53
    .line 54
    sub-int v13, p5, p3

    .line 55
    .line 56
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v12, v2

    .line 62
    :goto_1
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 63
    .line 64
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-eqz v13, :cond_3

    .line 69
    .line 70
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0, v13, v10, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    move v14, v13

    .line 79
    move v13, v6

    .line 80
    goto :goto_3

    .line 81
    :cond_2
    invoke-virtual {v0, v13, v6, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    :goto_2
    move v14, v10

    .line 86
    goto :goto_3

    .line 87
    :cond_3
    move v13, v6

    .line 88
    goto :goto_2

    .line 89
    :goto_3
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 90
    .line 91
    invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    if-eqz v15, :cond_5

    .line 96
    .line 97
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v15, v14, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    goto :goto_4

    .line 106
    :cond_4
    invoke-virtual {v0, v15, v13, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    :cond_5
    :goto_4
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 111
    .line 112
    invoke-virtual {v0, v15}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    if-eqz v15, :cond_7

    .line 117
    .line 118
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 119
    .line 120
    if-eqz v1, :cond_6

    .line 121
    .line 122
    invoke-virtual {v0, v15, v13, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    invoke-virtual {v0, v15, v14, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    :cond_7
    :goto_5
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetLeft()I

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetRight()I

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    move/from16 p1, v3

    .line 140
    .line 141
    sub-int v3, v15, v13

    .line 142
    .line 143
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    aput v3, v11, v2

    .line 148
    .line 149
    sub-int v3, v10, v14

    .line 150
    .line 151
    sub-int v3, v16, v3

    .line 152
    .line 153
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    aput v3, v11, p1

    .line 158
    .line 159
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    sub-int v10, v10, v16

    .line 164
    .line 165
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 170
    .line 171
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_9

    .line 176
    .line 177
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 178
    .line 179
    if-eqz v1, :cond_8

    .line 180
    .line 181
    invoke-virtual {v0, v13, v10, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    goto :goto_6

    .line 186
    :cond_8
    invoke-virtual {v0, v13, v3, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    :cond_9
    :goto_6
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 191
    .line 192
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-eqz v13, :cond_b

    .line 197
    .line 198
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 199
    .line 200
    if-eqz v1, :cond_a

    .line 201
    .line 202
    invoke-virtual {v0, v13, v10, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    goto :goto_7

    .line 207
    :cond_a
    invoke-virtual {v0, v13, v3, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    :cond_b
    :goto_7
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 212
    .line 213
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    iget-object v14, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 218
    .line 219
    invoke-virtual {v0, v14}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    if-eqz v13, :cond_c

    .line 224
    .line 225
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 226
    .line 227
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 228
    .line 229
    .line 230
    move-result-object v15

    .line 231
    check-cast v15, Lw42;

    .line 232
    .line 233
    iget v2, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 234
    .line 235
    move/from16 p4, v1

    .line 236
    .line 237
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    add-int/2addr v1, v2

    .line 244
    iget v2, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 245
    .line 246
    add-int/2addr v1, v2

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    move/from16 p4, v1

    .line 249
    .line 250
    const/4 v1, 0x0

    .line 251
    :goto_8
    if-eqz v14, :cond_d

    .line 252
    .line 253
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 254
    .line 255
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Lw42;

    .line 260
    .line 261
    iget v15, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 262
    .line 263
    move/from16 p3, v1

    .line 264
    .line 265
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 266
    .line 267
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    add-int/2addr v1, v15

    .line 272
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 273
    .line 274
    add-int/2addr v1, v2

    .line 275
    add-int v1, v1, p3

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_d
    move/from16 p3, v1

    .line 279
    .line 280
    :goto_9
    if-nez v13, :cond_e

    .line 281
    .line 282
    if-eqz v14, :cond_20

    .line 283
    .line 284
    :cond_e
    if-eqz v13, :cond_f

    .line 285
    .line 286
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_f
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 290
    .line 291
    :goto_a
    if-eqz v14, :cond_10

    .line 292
    .line 293
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_10
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 297
    .line 298
    :goto_b
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, Lw42;

    .line 303
    .line 304
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    check-cast v15, Lw42;

    .line 309
    .line 310
    move/from16 p3, v1

    .line 311
    .line 312
    if-eqz v13, :cond_11

    .line 313
    .line 314
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 315
    .line 316
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-gtz v1, :cond_12

    .line 321
    .line 322
    :cond_11
    if-eqz v14, :cond_13

    .line 323
    .line 324
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-lez v1, :cond_13

    .line 331
    .line 332
    :cond_12
    move/from16 p5, p1

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_13
    const/16 p5, 0x0

    .line 336
    .line 337
    :goto_c
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->Γ:I

    .line 338
    .line 339
    and-int/lit8 v1, v1, 0x70

    .line 340
    .line 341
    move/from16 v16, v3

    .line 342
    .line 343
    const/16 v3, 0x30

    .line 344
    .line 345
    if-eq v1, v3, :cond_17

    .line 346
    .line 347
    const/16 v3, 0x50

    .line 348
    .line 349
    if-eq v1, v3, :cond_16

    .line 350
    .line 351
    sub-int v1, v5, v8

    .line 352
    .line 353
    sub-int/2addr v1, v9

    .line 354
    sub-int v1, v1, p3

    .line 355
    .line 356
    div-int/lit8 v1, v1, 0x2

    .line 357
    .line 358
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 359
    .line 360
    move/from16 v17, v3

    .line 361
    .line 362
    iget v3, v0, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 363
    .line 364
    add-int v3, v17, v3

    .line 365
    .line 366
    if-ge v1, v3, :cond_14

    .line 367
    .line 368
    move v1, v3

    .line 369
    goto :goto_d

    .line 370
    :cond_14
    sub-int/2addr v5, v9

    .line 371
    sub-int v5, v5, p3

    .line 372
    .line 373
    sub-int/2addr v5, v1

    .line 374
    sub-int/2addr v5, v8

    .line 375
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 376
    .line 377
    iget v3, v0, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 378
    .line 379
    add-int/2addr v2, v3

    .line 380
    if-ge v5, v2, :cond_15

    .line 381
    .line 382
    iget v2, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 383
    .line 384
    add-int/2addr v2, v3

    .line 385
    sub-int/2addr v2, v5

    .line 386
    sub-int/2addr v1, v2

    .line 387
    const/4 v2, 0x0

    .line 388
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    :cond_15
    :goto_d
    add-int/2addr v8, v1

    .line 393
    goto :goto_e

    .line 394
    :cond_16
    sub-int/2addr v5, v9

    .line 395
    iget v1, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 396
    .line 397
    sub-int/2addr v5, v1

    .line 398
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 399
    .line 400
    sub-int/2addr v5, v1

    .line 401
    sub-int v8, v5, p3

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :cond_17
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 409
    .line 410
    add-int/2addr v1, v2

    .line 411
    iget v2, v0, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 412
    .line 413
    add-int v8, v1, v2

    .line 414
    .line 415
    :goto_e
    if-eqz p4, :cond_1c

    .line 416
    .line 417
    if-eqz p5, :cond_18

    .line 418
    .line 419
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_18
    const/4 v1, 0x0

    .line 423
    :goto_f
    aget v2, v11, p1

    .line 424
    .line 425
    sub-int/2addr v1, v2

    .line 426
    const/4 v2, 0x0

    .line 427
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    sub-int/2addr v10, v3

    .line 432
    neg-int v1, v1

    .line 433
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    aput v1, v11, p1

    .line 438
    .line 439
    if-eqz v13, :cond_19

    .line 440
    .line 441
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 442
    .line 443
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Lw42;

    .line 448
    .line 449
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 450
    .line 451
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    sub-int v2, v10, v2

    .line 456
    .line 457
    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 458
    .line 459
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    add-int/2addr v3, v8

    .line 464
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 465
    .line 466
    invoke-virtual {v5, v2, v8, v10, v3}, Landroid/view/View;->layout(IIII)V

    .line 467
    .line 468
    .line 469
    iget v5, v0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 470
    .line 471
    sub-int/2addr v2, v5

    .line 472
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 473
    .line 474
    add-int v8, v3, v1

    .line 475
    .line 476
    goto :goto_10

    .line 477
    :cond_19
    move v2, v10

    .line 478
    :goto_10
    if-eqz v14, :cond_1a

    .line 479
    .line 480
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 481
    .line 482
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    check-cast v1, Lw42;

    .line 487
    .line 488
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 489
    .line 490
    add-int/2addr v8, v1

    .line 491
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 492
    .line 493
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    sub-int v1, v10, v1

    .line 498
    .line 499
    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 500
    .line 501
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    add-int/2addr v3, v8

    .line 506
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 507
    .line 508
    invoke-virtual {v5, v1, v8, v10, v3}, Landroid/view/View;->layout(IIII)V

    .line 509
    .line 510
    .line 511
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 512
    .line 513
    sub-int v1, v10, v1

    .line 514
    .line 515
    goto :goto_11

    .line 516
    :cond_1a
    move v1, v10

    .line 517
    :goto_11
    if-eqz p5, :cond_1b

    .line 518
    .line 519
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    move v10, v1

    .line 524
    :cond_1b
    move/from16 v3, v16

    .line 525
    .line 526
    goto :goto_16

    .line 527
    :cond_1c
    if-eqz p5, :cond_1d

    .line 528
    .line 529
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 530
    .line 531
    :goto_12
    const/4 v2, 0x0

    .line 532
    goto :goto_13

    .line 533
    :cond_1d
    const/4 v1, 0x0

    .line 534
    goto :goto_12

    .line 535
    :goto_13
    aget v3, v11, v2

    .line 536
    .line 537
    sub-int/2addr v1, v3

    .line 538
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    add-int v3, v3, v16

    .line 543
    .line 544
    neg-int v1, v1

    .line 545
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    aput v1, v11, v2

    .line 550
    .line 551
    if-eqz v13, :cond_1e

    .line 552
    .line 553
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 554
    .line 555
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, Lw42;

    .line 560
    .line 561
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 562
    .line 563
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    add-int/2addr v2, v3

    .line 568
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 569
    .line 570
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 571
    .line 572
    .line 573
    move-result v5

    .line 574
    add-int/2addr v5, v8

    .line 575
    iget-object v9, v0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 576
    .line 577
    invoke-virtual {v9, v3, v8, v2, v5}, Landroid/view/View;->layout(IIII)V

    .line 578
    .line 579
    .line 580
    iget v8, v0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 581
    .line 582
    add-int/2addr v2, v8

    .line 583
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 584
    .line 585
    add-int v8, v5, v1

    .line 586
    .line 587
    goto :goto_14

    .line 588
    :cond_1e
    move v2, v3

    .line 589
    :goto_14
    if-eqz v14, :cond_1f

    .line 590
    .line 591
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 592
    .line 593
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    check-cast v1, Lw42;

    .line 598
    .line 599
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 600
    .line 601
    add-int/2addr v8, v1

    .line 602
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 603
    .line 604
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    add-int/2addr v1, v3

    .line 609
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 610
    .line 611
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    add-int/2addr v5, v8

    .line 616
    iget-object v9, v0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 617
    .line 618
    invoke-virtual {v9, v3, v8, v1, v5}, Landroid/view/View;->layout(IIII)V

    .line 619
    .line 620
    .line 621
    iget v5, v0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 622
    .line 623
    add-int/2addr v1, v5

    .line 624
    goto :goto_15

    .line 625
    :cond_1f
    move v1, v3

    .line 626
    :goto_15
    if-eqz p5, :cond_20

    .line 627
    .line 628
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    :cond_20
    :goto_16
    const/4 v1, 0x3

    .line 633
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->Κ:Ljava/util/ArrayList;

    .line 634
    .line 635
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar;->α(ILjava/util/ArrayList;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    move v5, v3

    .line 643
    const/4 v3, 0x0

    .line 644
    :goto_17
    if-ge v3, v1, :cond_21

    .line 645
    .line 646
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    check-cast v8, Landroid/view/View;

    .line 651
    .line 652
    invoke-virtual {v0, v8, v5, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    add-int/lit8 v3, v3, 0x1

    .line 657
    .line 658
    goto :goto_17

    .line 659
    :cond_21
    const/4 v1, 0x5

    .line 660
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar;->α(ILjava/util/ArrayList;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    const/4 v3, 0x0

    .line 668
    :goto_18
    if-ge v3, v1, :cond_22

    .line 669
    .line 670
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    check-cast v8, Landroid/view/View;

    .line 675
    .line 676
    invoke-virtual {v0, v8, v10, v12, v11}, Landroidx/appcompat/widget/Toolbar;->π(Landroid/view/View;II[I)I

    .line 677
    .line 678
    .line 679
    move-result v10

    .line 680
    add-int/lit8 v3, v3, 0x1

    .line 681
    .line 682
    goto :goto_18

    .line 683
    :cond_22
    move/from16 v3, p1

    .line 684
    .line 685
    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/widget/Toolbar;->α(ILjava/util/ArrayList;)V

    .line 686
    .line 687
    .line 688
    const/4 v1, 0x0

    .line 689
    aget v8, v11, v1

    .line 690
    .line 691
    aget v1, v11, v3

    .line 692
    .line 693
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    move v13, v8

    .line 698
    const/4 v8, 0x0

    .line 699
    const/4 v9, 0x0

    .line 700
    :goto_19
    if-ge v8, v3, :cond_23

    .line 701
    .line 702
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v14

    .line 706
    check-cast v14, Landroid/view/View;

    .line 707
    .line 708
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 709
    .line 710
    .line 711
    move-result-object v15

    .line 712
    check-cast v15, Lw42;

    .line 713
    .line 714
    move/from16 p1, v1

    .line 715
    .line 716
    iget v1, v15, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 717
    .line 718
    sub-int/2addr v1, v13

    .line 719
    iget v13, v15, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 720
    .line 721
    sub-int v13, v13, p1

    .line 722
    .line 723
    const/4 v15, 0x0

    .line 724
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 725
    .line 726
    .line 727
    move-result v16

    .line 728
    invoke-static {v15, v13}, Ljava/lang/Math;->max(II)I

    .line 729
    .line 730
    .line 731
    move-result v17

    .line 732
    neg-int v1, v1

    .line 733
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 734
    .line 735
    .line 736
    move-result v1

    .line 737
    neg-int v13, v13

    .line 738
    invoke-static {v15, v13}, Ljava/lang/Math;->max(II)I

    .line 739
    .line 740
    .line 741
    move-result v13

    .line 742
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 743
    .line 744
    .line 745
    move-result v14

    .line 746
    add-int v14, v14, v16

    .line 747
    .line 748
    add-int v14, v14, v17

    .line 749
    .line 750
    add-int/2addr v9, v14

    .line 751
    add-int/lit8 v8, v8, 0x1

    .line 752
    .line 753
    move/from16 v18, v13

    .line 754
    .line 755
    move v13, v1

    .line 756
    move/from16 v1, v18

    .line 757
    .line 758
    goto :goto_19

    .line 759
    :cond_23
    const/4 v15, 0x0

    .line 760
    sub-int/2addr v4, v6

    .line 761
    sub-int/2addr v4, v7

    .line 762
    div-int/lit8 v4, v4, 0x2

    .line 763
    .line 764
    add-int/2addr v4, v6

    .line 765
    div-int/lit8 v1, v9, 0x2

    .line 766
    .line 767
    sub-int/2addr v4, v1

    .line 768
    add-int/2addr v9, v4

    .line 769
    if-ge v4, v5, :cond_24

    .line 770
    .line 771
    goto :goto_1a

    .line 772
    :cond_24
    if-le v9, v10, :cond_25

    .line 773
    .line 774
    sub-int/2addr v9, v10

    .line 775
    sub-int v5, v4, v9

    .line 776
    .line 777
    goto :goto_1a

    .line 778
    :cond_25
    move v5, v4

    .line 779
    :goto_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    :goto_1b
    if-ge v15, v1, :cond_26

    .line 784
    .line 785
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    check-cast v3, Landroid/view/View;

    .line 790
    .line 791
    invoke-virtual {v0, v3, v5, v12, v11}, Landroidx/appcompat/widget/Toolbar;->ο(Landroid/view/View;II[I)I

    .line 792
    .line 793
    .line 794
    move-result v5

    .line 795
    add-int/lit8 v15, v15, 0x1

    .line 796
    .line 797
    goto :goto_1b

    .line 798
    :cond_26
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 799
    .line 800
    .line 801
    return-void
.end method

.method public final onMeasure(II)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    move v6, v2

    .line 10
    move v8, v7

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v8, v2

    .line 13
    move v6, v7

    .line 14
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 24
    .line 25
    iget v5, p0, Landroidx/appcompat/widget/Toolbar;->τ:I

    .line 26
    .line 27
    move-object v0, p0

    .line 28
    move v2, p1

    .line 29
    move/from16 v4, p2

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->σ(Landroid/view/View;IIII)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 41
    .line 42
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->λ(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v1

    .line 47
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object v4, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 54
    .line 55
    invoke-static {v4}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    add-int/2addr v4, v1

    .line 60
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iget-object v4, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-static {v7, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    move v9, v1

    .line 75
    move v10, v4

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move v2, v7

    .line 78
    move v9, v2

    .line 79
    move v10, v9

    .line 80
    :goto_1
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 89
    .line 90
    iget v5, p0, Landroidx/appcompat/widget/Toolbar;->τ:I

    .line 91
    .line 92
    move-object v0, p0

    .line 93
    move v2, p1

    .line 94
    move/from16 v4, p2

    .line 95
    .line 96
    invoke-virtual/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->σ(Landroid/view/View;IIII)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 106
    .line 107
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->λ(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    add-int/2addr v2, v1

    .line 112
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iget-object v3, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 119
    .line 120
    invoke-static {v3}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    add-int/2addr v3, v1

    .line 125
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    sub-int/2addr v1, v2

    .line 148
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    move v2, v6

    .line 153
    iget-object v6, p0, Landroidx/appcompat/widget/Toolbar;->Μ:[I

    .line 154
    .line 155
    aput v1, v6, v2

    .line 156
    .line 157
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 158
    .line 159
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_3

    .line 164
    .line 165
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 166
    .line 167
    iget v5, p0, Landroidx/appcompat/widget/Toolbar;->τ:I

    .line 168
    .line 169
    move-object v0, p0

    .line 170
    move v2, p1

    .line 171
    move/from16 v4, p2

    .line 172
    .line 173
    invoke-virtual/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->σ(Landroid/view/View;IIII)V

    .line 174
    .line 175
    .line 176
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 177
    .line 178
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 183
    .line 184
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->λ(Landroid/view/View;)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    add-int/2addr v2, v1

    .line 189
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iget-object v4, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 196
    .line 197
    invoke-static {v4}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    add-int/2addr v4, v1

    .line 202
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 207
    .line 208
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    goto :goto_2

    .line 217
    :cond_3
    move v2, v7

    .line 218
    :goto_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    add-int/2addr v3, v4

    .line 227
    sub-int/2addr v1, v2

    .line 228
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    aput v1, v6, v8

    .line 233
    .line 234
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 235
    .line 236
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_4

    .line 241
    .line 242
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 243
    .line 244
    const/4 v5, 0x0

    .line 245
    move-object v0, p0

    .line 246
    move v2, p1

    .line 247
    move/from16 v4, p2

    .line 248
    .line 249
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ρ(Landroid/view/View;IIII[I)I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    add-int/2addr v3, v1

    .line 254
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 261
    .line 262
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    add-int/2addr v2, v1

    .line 267
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    :cond_4
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 282
    .line 283
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_5

    .line 288
    .line 289
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 290
    .line 291
    const/4 v5, 0x0

    .line 292
    move-object v0, p0

    .line 293
    move v2, p1

    .line 294
    move/from16 v4, p2

    .line 295
    .line 296
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ρ(Landroid/view/View;IIII[I)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    add-int/2addr v3, v1

    .line 301
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 308
    .line 309
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    add-int/2addr v2, v1

    .line 314
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    move v11, v7

    .line 333
    :goto_3
    if-ge v11, v8, :cond_8

    .line 334
    .line 335
    invoke-virtual {p0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Lw42;

    .line 344
    .line 345
    iget v2, v2, Lw42;->β:I

    .line 346
    .line 347
    if-nez v2, :cond_6

    .line 348
    .line 349
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-nez v2, :cond_7

    .line 354
    .line 355
    :cond_6
    move v12, v3

    .line 356
    goto :goto_4

    .line 357
    :cond_7
    const/4 v5, 0x0

    .line 358
    move-object v0, p0

    .line 359
    move v2, p1

    .line 360
    move/from16 v4, p2

    .line 361
    .line 362
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ρ(Landroid/view/View;IIII[I)I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    move v12, v3

    .line 367
    add-int v3, v12, v5

    .line 368
    .line 369
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    add-int/2addr v4, v2

    .line 378
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    move v10, v1

    .line 391
    move v9, v2

    .line 392
    goto :goto_5

    .line 393
    :goto_4
    move v3, v12

    .line 394
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 395
    .line 396
    goto :goto_3

    .line 397
    :cond_8
    move v12, v3

    .line 398
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 399
    .line 400
    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 401
    .line 402
    add-int v5, v1, v2

    .line 403
    .line 404
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 405
    .line 406
    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 407
    .line 408
    add-int v8, v1, v2

    .line 409
    .line 410
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 411
    .line 412
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_9

    .line 417
    .line 418
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 419
    .line 420
    add-int v3, v12, v8

    .line 421
    .line 422
    move-object v0, p0

    .line 423
    move v2, p1

    .line 424
    move/from16 v4, p2

    .line 425
    .line 426
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ρ(Landroid/view/View;IIII[I)I

    .line 427
    .line 428
    .line 429
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 430
    .line 431
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 436
    .line 437
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->λ(Landroid/view/View;)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    add-int/2addr v2, v1

    .line 442
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 443
    .line 444
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    iget-object v3, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 449
    .line 450
    invoke-static {v3}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    add-int/2addr v3, v1

    .line 455
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 456
    .line 457
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    invoke-static {v10, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 462
    .line 463
    .line 464
    move-result v10

    .line 465
    move v11, v3

    .line 466
    move v13, v10

    .line 467
    move v10, v2

    .line 468
    goto :goto_6

    .line 469
    :cond_9
    move v11, v7

    .line 470
    move v13, v10

    .line 471
    move v10, v11

    .line 472
    :goto_6
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 473
    .line 474
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_a

    .line 479
    .line 480
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 481
    .line 482
    add-int v3, v12, v8

    .line 483
    .line 484
    add-int/2addr v5, v11

    .line 485
    move-object v0, p0

    .line 486
    move v2, p1

    .line 487
    move/from16 v4, p2

    .line 488
    .line 489
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->ρ(Landroid/view/View;IIII[I)I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 498
    .line 499
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 504
    .line 505
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->μ(Landroid/view/View;)I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    add-int/2addr v2, v1

    .line 510
    add-int/2addr v11, v2

    .line 511
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 512
    .line 513
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-static {v13, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 518
    .line 519
    .line 520
    move-result v13

    .line 521
    :cond_a
    add-int v3, v12, v10

    .line 522
    .line 523
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    add-int/2addr v4, v2

    .line 536
    add-int/2addr v4, v3

    .line 537
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    add-int/2addr v3, v2

    .line 546
    add-int/2addr v3, v1

    .line 547
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    const/high16 v2, -0x1000000

    .line 556
    .line 557
    and-int/2addr v2, v13

    .line 558
    invoke-static {v1, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    shl-int/lit8 v3, v13, 0x10

    .line 571
    .line 572
    move/from16 v4, p2

    .line 573
    .line 574
    invoke-static {v2, v4, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    iget-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->Τ:Z

    .line 579
    .line 580
    if-nez v3, :cond_b

    .line 581
    .line 582
    goto :goto_8

    .line 583
    :cond_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    move v4, v7

    .line 588
    :goto_7
    if-ge v4, v3, :cond_d

    .line 589
    .line 590
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    if-eqz v6, :cond_c

    .line 599
    .line 600
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-lez v6, :cond_c

    .line 605
    .line 606
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    if-lez v5, :cond_c

    .line 611
    .line 612
    :goto_8
    move v7, v2

    .line 613
    goto :goto_9

    .line 614
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 615
    .line 616
    goto :goto_7

    .line 617
    :cond_d
    :goto_9
    invoke-virtual {p0, v1, v7}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 618
    .line 619
    .line 620
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Ly42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ly42;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/α;->ε:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->υ:Liz0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget v1, p1, Ly42;->η:I

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Liz0;->findItem(I)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Landroid/view/MenuItem;->expandActionView()Z

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-boolean p1, p1, Ly42;->θ:Z

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->Ψ:Ld1;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onRtlPropertiesChanged(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->δ()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-boolean p1, p0, Llq0;->θ:Z

    .line 15
    .line 16
    if-ne v0, p1, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iput-boolean v0, p0, Llq0;->θ:Z

    .line 20
    .line 21
    iget-boolean p1, p0, Llq0;->ι:Z

    .line 22
    .line 23
    if-eqz p1, :cond_7

    .line 24
    .line 25
    const/high16 p1, -0x80000000

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget v0, p0, Llq0;->ε:I

    .line 30
    .line 31
    if-eq v0, p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget v0, p0, Llq0;->ζ:I

    .line 35
    .line 36
    :goto_1
    iput v0, p0, Llq0;->β:I

    .line 37
    .line 38
    iget v0, p0, Llq0;->δ:I

    .line 39
    .line 40
    if-eq v0, p1, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    iget v0, p0, Llq0;->η:I

    .line 44
    .line 45
    :goto_2
    iput v0, p0, Llq0;->γ:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_4
    iget v0, p0, Llq0;->δ:I

    .line 49
    .line 50
    if-eq v0, p1, :cond_5

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_5
    iget v0, p0, Llq0;->ζ:I

    .line 54
    .line 55
    :goto_3
    iput v0, p0, Llq0;->β:I

    .line 56
    .line 57
    iget v0, p0, Llq0;->ε:I

    .line 58
    .line 59
    if-eq v0, p1, :cond_6

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_6
    iget v0, p0, Llq0;->η:I

    .line 63
    .line 64
    :goto_4
    iput v0, p0, Llq0;->γ:I

    .line 65
    .line 66
    return-void

    .line 67
    :cond_7
    iget p1, p0, Llq0;->ζ:I

    .line 68
    .line 69
    iput p1, p0, Llq0;->β:I

    .line 70
    .line 71
    iget p1, p0, Llq0;->η:I

    .line 72
    .line 73
    iput p1, p0, Llq0;->γ:I

    .line 74
    .line 75
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Ly42;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/customview/view/α;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lv42;->ζ:Llz0;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget v1, v1, Llz0;->α:I

    .line 19
    .line 20
    iput v1, v0, Ly42;->η:I

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->ω:Landroidx/appcompat/widget/γ;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/appcompat/widget/γ;->θ()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    :goto_0
    iput-boolean p0, v0, Ly42;->θ:Z

    .line 40
    .line 41
    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->Θ:Z

    .line 9
    .line 10
    :cond_0
    iget-boolean v2, p0, Landroidx/appcompat/widget/Toolbar;->Θ:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iput-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->Θ:Z

    .line 24
    .line 25
    :cond_1
    if-eq v0, v3, :cond_3

    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    if-ne v0, p1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v3

    .line 32
    :cond_3
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->Θ:Z

    .line 33
    .line 34
    return v3
.end method

.method public setBackInvokedCallbackEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/Toolbar;->Χ:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->Χ:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->υ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCollapseContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCollapseContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->γ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public setCollapseIcon(I)V
    .locals 1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCollapseIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->γ()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->κ:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public setCollapsible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->Τ:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setContentInsetEndWithActions(I)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->Β:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->Β:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public setContentInsetStartWithNavigation(I)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->Α:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->Α:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public setLogo(I)V
    .locals 1

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->β(Landroid/view/View;Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 54
    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    return-void
.end method

.method public setLogoDescription(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLogoDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ι:Landroidx/appcompat/widget/AppCompatImageView;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public setNavigationContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setNavigationContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->η()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lc52;->α(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public setNavigationIcon(I)V
    .locals 1

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->η()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->β(Landroid/view/View;Z)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->η()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnMenuItemClickListener(Lx42;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ε()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowIcon(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setPopupTheme(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->ο:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ο:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->ξ:Landroid/content/Context;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ξ:Landroid/content/Context;

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 27
    .line 28
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 31
    .line 32
    .line 33
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->ρ:I

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Η:Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->β(Landroid/view/View;Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->Ε:Ljava/lang/CharSequence;

    .line 94
    .line 95
    return-void
.end method

.method public setSubtitleTextColor(I)V
    .locals 0

    .line 11
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setSubtitleTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->Η:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->η:Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 27
    .line 28
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 31
    .line 32
    .line 33
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->π:I

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Ζ:Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->β(Landroid/view/View;Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->ξ(Landroid/view/View;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->Δ:Ljava/lang/CharSequence;

    .line 94
    .line 95
    return-void
.end method

.method public setTitleMarginBottom(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->ψ:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleMarginEnd(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->φ:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleMarginStart(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->υ:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleMarginTop(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->χ:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleTextColor(I)V
    .locals 0

    .line 11
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTitleTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->Ζ:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->ζ:Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final α(ILjava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-static {p1, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v5, 0x5

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    sub-int/2addr v3, v2

    .line 32
    :goto_1
    if-ltz v3, :cond_8

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lw42;

    .line 43
    .line 44
    iget v6, v1, Lw42;->β:I

    .line 45
    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    iget v1, v1, Lw42;->α:I

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-static {v1, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    and-int/lit8 v1, v1, 0x7

    .line 65
    .line 66
    if-eq v1, v2, :cond_2

    .line 67
    .line 68
    if-eq v1, v4, :cond_2

    .line 69
    .line 70
    if-eq v1, v5, :cond_2

    .line 71
    .line 72
    if-ne v6, v2, :cond_1

    .line 73
    .line 74
    move v1, v5

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    move v1, v4

    .line 77
    :cond_2
    :goto_2
    if-ne v1, p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_3
    add-int/lit8 v3, v3, -0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_3
    if-ge v1, v3, :cond_8

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lw42;

    .line 96
    .line 97
    iget v7, v6, Lw42;->β:I

    .line 98
    .line 99
    if-nez v7, :cond_7

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->τ(Landroid/view/View;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_7

    .line 106
    .line 107
    iget v6, v6, Lw42;->α:I

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-static {v6, v7}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    and-int/lit8 v6, v6, 0x7

    .line 118
    .line 119
    if-eq v6, v2, :cond_6

    .line 120
    .line 121
    if-eq v6, v4, :cond_6

    .line 122
    .line 123
    if-eq v6, v5, :cond_6

    .line 124
    .line 125
    if-ne v7, v2, :cond_5

    .line 126
    .line 127
    move v6, v5

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move v6, v4

    .line 130
    :cond_6
    :goto_4
    if-ne v6, p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    return-void
.end method

.method public final β(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->θ()Lw42;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/appcompat/widget/Toolbar;->ι(Landroid/view/ViewGroup$LayoutParams;)Lw42;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    check-cast v0, Lw42;

    .line 24
    .line 25
    :goto_0
    const/4 v1, 0x1

    .line 26
    iput v1, v0, Lw42;->β:I

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/appcompat/widget/Toolbar;->ν:Landroid/view/View;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final γ()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const v3, 0x7f040135

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->κ:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->λ:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->θ()Lw42;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->σ:I

    .line 37
    .line 38
    and-int/lit8 v1, v1, 0x70

    .line 39
    .line 40
    const v2, 0x800003

    .line 41
    .line 42
    .line 43
    or-int/2addr v1, v2

    .line 44
    iput v1, v0, Lw42;->α:I

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    iput v1, v0, Lw42;->β:I

    .line 48
    .line 49
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->μ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 55
    .line 56
    new-instance v2, Lｈ;

    .line 57
    .line 58
    invoke-direct {v2, v1, p0}, Lｈ;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final δ()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Llq0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Llq0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, v0, Llq0;->β:I

    .line 13
    .line 14
    iput v1, v0, Llq0;->γ:I

    .line 15
    .line 16
    const/high16 v2, -0x80000000

    .line 17
    .line 18
    iput v2, v0, Llq0;->δ:I

    .line 19
    .line 20
    iput v2, v0, Llq0;->ε:I

    .line 21
    .line 22
    iput v1, v0, Llq0;->ζ:I

    .line 23
    .line 24
    iput v1, v0, Llq0;->η:I

    .line 25
    .line 26
    iput-boolean v1, v0, Llq0;->θ:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Llq0;->ι:Z

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ω:Llq0;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final ε()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->ζ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->υ:Liz0;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Liz0;

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lv42;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lv42;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setExpandedActionViewsExclusive(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->ξ:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Liz0;->β(Luz0;Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->υ()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final ζ()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 15
    .line 16
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->ο:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Ο:Lt42;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setOnMenuItemClickListener(Lｖ;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 29
    .line 30
    new-instance v1, Lt42;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lt42;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->Α:Lt42;

    .line 39
    .line 40
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->θ()Lw42;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->σ:I

    .line 45
    .line 46
    and-int/lit8 v1, v1, 0x70

    .line 47
    .line 48
    const v2, 0x800005

    .line 49
    .line 50
    .line 51
    or-int/2addr v1, v2

    .line 52
    iput v1, v0, Lw42;->α:I

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->ε:Landroidx/appcompat/widget/ActionMenuView;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->β(Landroid/view/View;Z)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final η()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const v3, 0x7f040135

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 19
    .line 20
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->θ()Lw42;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->σ:I

    .line 25
    .line 26
    and-int/lit8 v1, v1, 0x70

    .line 27
    .line 28
    const v2, 0x800003

    .line 29
    .line 30
    .line 31
    or-int/2addr v1, v2

    .line 32
    iput v1, v0, Lw42;->α:I

    .line 33
    .line 34
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->θ:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final κ(Landroid/view/View;I)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lw42;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x0

    .line 12
    if-lez p2, :cond_0

    .line 13
    .line 14
    sub-int p2, p1, p2

    .line 15
    .line 16
    div-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v1

    .line 20
    :goto_0
    iget v2, v0, Lw42;->α:I

    .line 21
    .line 22
    and-int/lit8 v2, v2, 0x70

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    const/16 v4, 0x50

    .line 27
    .line 28
    const/16 v5, 0x30

    .line 29
    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    if-eq v2, v5, :cond_1

    .line 33
    .line 34
    if-eq v2, v4, :cond_1

    .line 35
    .line 36
    iget v2, p0, Landroidx/appcompat/widget/Toolbar;->Γ:I

    .line 37
    .line 38
    and-int/lit8 v2, v2, 0x70

    .line 39
    .line 40
    :cond_1
    if-eq v2, v5, :cond_5

    .line 41
    .line 42
    if-eq v2, v4, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    sub-int v3, p0, p2

    .line 57
    .line 58
    sub-int/2addr v3, v2

    .line 59
    sub-int/2addr v3, p1

    .line 60
    div-int/lit8 v3, v3, 0x2

    .line 61
    .line 62
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 63
    .line 64
    if-ge v3, v4, :cond_2

    .line 65
    .line 66
    move v3, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    sub-int/2addr p0, v2

    .line 69
    sub-int/2addr p0, p1

    .line 70
    sub-int/2addr p0, v3

    .line 71
    sub-int/2addr p0, p2

    .line 72
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 73
    .line 74
    if-ge p0, p1, :cond_3

    .line 75
    .line 76
    sub-int/2addr p1, p0

    .line 77
    sub-int/2addr v3, p1

    .line 78
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    :cond_3
    :goto_1
    add-int/2addr p2, v3

    .line 83
    return p2

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    sub-int/2addr v1, p0

    .line 93
    sub-int/2addr v1, p1

    .line 94
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 95
    .line 96
    sub-int/2addr v1, p0

    .line 97
    sub-int/2addr v1, p2

    .line 98
    return v1

    .line 99
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    sub-int/2addr p0, p2

    .line 104
    return p0
.end method

.method public final ν()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Ξ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/MenuItem;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-interface {v2, v1}, Landroid/view/Menu;->removeItem(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentMenuItems()Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->getMenuInflater()Landroid/view/MenuInflater;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Ν:Lm6;

    .line 42
    .line 43
    iget-object v1, v1, Lm6;->θ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lv60;

    .line 62
    .line 63
    iget-object v2, v2, Lv60;->α:Lb70;

    .line 64
    .line 65
    invoke-virtual {v2}, Lb70;->κ()Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->getCurrentMenuItems()Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Ξ:Ljava/util/ArrayList;

    .line 77
    .line 78
    return-void
.end method

.method public final ξ(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->Λ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final ο(Landroid/view/View;II[I)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lw42;

    .line 6
    .line 7
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, p4, v2

    .line 11
    .line 12
    sub-int/2addr v1, v3

    .line 13
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v3, p2

    .line 18
    neg-int p2, v1

    .line 19
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    aput p2, p4, v2

    .line 24
    .line 25
    invoke-virtual {p0, p1, p3}, Landroidx/appcompat/widget/Toolbar;->κ(Landroid/view/View;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    add-int p3, v3, p2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    add-int/2addr p4, p0

    .line 40
    invoke-virtual {p1, v3, p0, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 41
    .line 42
    .line 43
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 44
    .line 45
    add-int/2addr p2, p0

    .line 46
    add-int/2addr p2, v3

    .line 47
    return p2
.end method

.method public final π(Landroid/view/View;II[I)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lw42;

    .line 6
    .line 7
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aget v3, p4, v2

    .line 11
    .line 12
    sub-int/2addr v1, v3

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    sub-int/2addr p2, v4

    .line 19
    neg-int v1, v1

    .line 20
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    aput v1, p4, v2

    .line 25
    .line 26
    invoke-virtual {p0, p1, p3}, Landroidx/appcompat/widget/Toolbar;->κ(Landroid/view/View;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    sub-int p4, p2, p3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, p0

    .line 41
    invoke-virtual {p1, p4, p0, p2, v1}, Landroid/view/View;->layout(IIII)V

    .line 42
    .line 43
    .line 44
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 45
    .line 46
    add-int/2addr p3, p0

    .line 47
    sub-int/2addr p2, p3

    .line 48
    return p2
.end method

.method public final ρ(Landroid/view/View;IIII[I)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, p6, v2

    .line 11
    .line 12
    sub-int/2addr v1, v3

    .line 13
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget v5, p6, v4

    .line 17
    .line 18
    sub-int/2addr v3, v5

    .line 19
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    add-int/2addr v6, v5

    .line 28
    neg-int v1, v1

    .line 29
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    aput v1, p6, v2

    .line 34
    .line 35
    neg-int v1, v3

    .line 36
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    aput v1, p6, v4

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 43
    .line 44
    .line 45
    move-result p6

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/2addr v1, p6

    .line 51
    add-int/2addr v1, v6

    .line 52
    add-int/2addr v1, p3

    .line 53
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 54
    .line 55
    invoke-static {p2, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    add-int/2addr p0, p3

    .line 68
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 69
    .line 70
    add-int/2addr p0, p3

    .line 71
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 72
    .line 73
    add-int/2addr p0, p3

    .line 74
    add-int/2addr p0, p5

    .line 75
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 76
    .line 77
    invoke-static {p4, p0, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v6

    .line 89
    return p0
.end method

.method public final σ(Landroid/view/View;IIII)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v1

    .line 16
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    .line 18
    add-int/2addr v2, v1

    .line 19
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 20
    .line 21
    add-int/2addr v2, v1

    .line 22
    add-int/2addr v2, p3

    .line 23
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 24
    .line 25
    invoke-static {p2, v2, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, p3

    .line 38
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 39
    .line 40
    add-int/2addr p0, p3

    .line 41
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 42
    .line 43
    add-int/2addr p0, p3

    .line 44
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 45
    .line 46
    invoke-static {p4, p0, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    const/high16 p4, 0x40000000    # 2.0f

    .line 55
    .line 56
    if-eq p3, p4, :cond_1

    .line 57
    .line 58
    if-ltz p5, :cond_1

    .line 59
    .line 60
    if-eqz p3, :cond_0

    .line 61
    .line 62
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0, p5}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result p5

    .line 70
    :cond_0
    invoke-static {p5, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    :cond_1
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final τ(Landroid/view/View;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    if-eq p0, p1, :cond_0

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

.method public final υ()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_3

    .line 6
    .line 7
    invoke-static {p0}, Lu42;->α(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Σ:Lv42;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lv42;->ζ:Llz0;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->Χ:Z

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->Φ:Landroid/window/OnBackInvokedDispatcher;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Υ:Landroid/window/OnBackInvokedCallback;

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ls42;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p0, v2}, Ls42;-><init>(Landroidx/appcompat/widget/Toolbar;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lu42;->β(Ljava/lang/Runnable;)Landroid/window/OnBackInvokedCallback;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Υ:Landroid/window/OnBackInvokedCallback;

    .line 55
    .line 56
    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Υ:Landroid/window/OnBackInvokedCallback;

    .line 57
    .line 58
    invoke-static {v0, v1}, Lu42;->γ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Φ:Landroid/window/OnBackInvokedDispatcher;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    if-nez v1, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Φ:Landroid/window/OnBackInvokedDispatcher;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->Υ:Landroid/window/OnBackInvokedCallback;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lu42;->δ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->Φ:Landroid/window/OnBackInvokedDispatcher;

    .line 77
    .line 78
    :cond_3
    return-void
.end method
