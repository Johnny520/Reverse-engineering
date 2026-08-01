.class public Landroidx/appcompat/widget/SearchView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lwh;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    }
.end annotation


# static fields
.field public static final synthetic л:I


# instance fields
.field public final Α:Landroid/widget/ImageView;

.field public final Β:Landroid/widget/ImageView;

.field public final Γ:Landroid/widget/ImageView;

.field public final Δ:Landroid/view/View;

.field public Ε:Llr1;

.field public final Ζ:Landroid/graphics/Rect;

.field public final Η:Landroid/graphics/Rect;

.field public final Θ:[I

.field public final Ι:[I

.field public final Κ:Landroid/widget/ImageView;

.field public final Λ:Landroid/graphics/drawable/Drawable;

.field public final Μ:I

.field public final Ν:I

.field public final Ξ:Landroid/content/Intent;

.field public final Ο:Landroid/content/Intent;

.field public final Π:Ljava/lang/CharSequence;

.field public Ρ:Landroid/view/View$OnFocusChangeListener;

.field public Σ:Landroid/view/View$OnClickListener;

.field public Τ:Z

.field public Υ:Z

.field public Φ:Lsq;

.field public Χ:Z

.field public Ψ:Ljava/lang/CharSequence;

.field public Ω:Z

.field public final υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

.field public final φ:Landroid/view/View;

.field public final χ:Landroid/view/View;

.field public final ψ:Landroid/view/View;

.field public final ω:Landroid/widget/ImageView;

.field public а:Z

.field public б:I

.field public в:Z

.field public г:Ljava/lang/CharSequence;

.field public д:Z

.field public е:I

.field public ж:Landroid/app/SearchableInfo;

.field public з:Landroid/os/Bundle;

.field public final и:Lcr1;

.field public final й:Lcr1;

.field public final к:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0400ea

    .line 501
    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400ea

    .line 500
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Ζ:Landroid/graphics/Rect;

    .line 14
    .line 15
    new-instance v2, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Η:Landroid/graphics/Rect;

    .line 21
    .line 22
    const/4 v7, 0x2

    .line 23
    new-array v2, v7, [I

    .line 24
    .line 25
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Θ:[I

    .line 26
    .line 27
    new-array v2, v7, [I

    .line 28
    .line 29
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Ι:[I

    .line 30
    .line 31
    new-instance v2, Lcr1;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    invoke-direct {v2, v0, v8}, Lcr1;-><init>(Landroidx/appcompat/widget/SearchView;I)V

    .line 35
    .line 36
    .line 37
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->и:Lcr1;

    .line 38
    .line 39
    new-instance v2, Lcr1;

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    invoke-direct {v2, v0, v9}, Lcr1;-><init>(Landroidx/appcompat/widget/SearchView;I)V

    .line 43
    .line 44
    .line 45
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->й:Lcr1;

    .line 46
    .line 47
    new-instance v2, Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->к:Ljava/util/WeakHashMap;

    .line 53
    .line 54
    new-instance v10, Landroidx/appcompat/widget/λ;

    .line 55
    .line 56
    invoke-direct {v10, v0}, Landroidx/appcompat/widget/λ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 57
    .line 58
    .line 59
    new-instance v11, Landroidx/appcompat/widget/μ;

    .line 60
    .line 61
    invoke-direct {v11, v0}, Landroidx/appcompat/widget/μ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 62
    .line 63
    .line 64
    new-instance v12, Lfr1;

    .line 65
    .line 66
    invoke-direct {v12, v0}, Lfr1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 67
    .line 68
    .line 69
    new-instance v13, Lu5;

    .line 70
    .line 71
    invoke-direct {v13, v9, v0}, Lu5;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v14, Lgr1;

    .line 75
    .line 76
    invoke-direct {v14, v0}, Lgr1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 77
    .line 78
    .line 79
    new-instance v15, Lmd0;

    .line 80
    .line 81
    const/4 v2, 0x3

    .line 82
    invoke-direct {v15, v2, v0}, Lmd0;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Lm6;

    .line 86
    .line 87
    move v4, v2

    .line 88
    sget-object v2, Lkk1;->χ:[I

    .line 89
    .line 90
    move-object/from16 v5, p2

    .line 91
    .line 92
    move/from16 v6, p3

    .line 93
    .line 94
    move/from16 v16, v4

    .line 95
    .line 96
    invoke-virtual {v1, v5, v2, v6, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-direct {v3, v1, v4}, Lm6;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 101
    .line 102
    .line 103
    sget-object v17, Lb92;->α:Ljava/util/WeakHashMap;

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    move-object v7, v3

    .line 107
    move-object v3, v5

    .line 108
    move/from16 v5, p3

    .line 109
    .line 110
    invoke-static/range {v0 .. v6}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 111
    .line 112
    .line 113
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const/16 v2, 0x9

    .line 118
    .line 119
    const v3, 0x7f0c0019

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {v1, v2, v0, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    const v1, 0x7f090281

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 137
    .line 138
    iput-object v1, v0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSearchView(Landroidx/appcompat/widget/SearchView;)V

    .line 141
    .line 142
    .line 143
    const v2, 0x7f09027d

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->φ:Landroid/view/View;

    .line 151
    .line 152
    const v2, 0x7f090280

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->χ:Landroid/view/View;

    .line 160
    .line 161
    const v3, 0x7f0902ca

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->ψ:Landroid/view/View;

    .line 169
    .line 170
    const v5, 0x7f09027b

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Landroid/widget/ImageView;

    .line 178
    .line 179
    iput-object v5, v0, Landroidx/appcompat/widget/SearchView;->ω:Landroid/widget/ImageView;

    .line 180
    .line 181
    const v6, 0x7f09027e

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, Landroid/widget/ImageView;

    .line 189
    .line 190
    iput-object v6, v0, Landroidx/appcompat/widget/SearchView;->Α:Landroid/widget/ImageView;

    .line 191
    .line 192
    const v9, 0x7f09027c

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    check-cast v9, Landroid/widget/ImageView;

    .line 200
    .line 201
    iput-object v9, v0, Landroidx/appcompat/widget/SearchView;->Β:Landroid/widget/ImageView;

    .line 202
    .line 203
    const v8, 0x7f090282

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    check-cast v8, Landroid/widget/ImageView;

    .line 211
    .line 212
    iput-object v8, v0, Landroidx/appcompat/widget/SearchView;->Γ:Landroid/widget/ImageView;

    .line 213
    .line 214
    move-object/from16 v18, v11

    .line 215
    .line 216
    const v11, 0x7f09027f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    check-cast v11, Landroid/widget/ImageView;

    .line 224
    .line 225
    iput-object v11, v0, Landroidx/appcompat/widget/SearchView;->Κ:Landroid/widget/ImageView;

    .line 226
    .line 227
    move-object/from16 v19, v14

    .line 228
    .line 229
    const/16 v14, 0xa

    .line 230
    .line 231
    invoke-virtual {v7, v14}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-virtual {v2, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 236
    .line 237
    .line 238
    const/16 v2, 0xe

    .line 239
    .line 240
    invoke-virtual {v7, v2}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 245
    .line 246
    .line 247
    const/16 v2, 0xd

    .line 248
    .line 249
    invoke-virtual {v7, v2}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    const/4 v3, 0x7

    .line 257
    invoke-virtual {v7, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v6, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 262
    .line 263
    .line 264
    const/4 v3, 0x4

    .line 265
    invoke-virtual {v7, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 270
    .line 271
    .line 272
    const/16 v3, 0x10

    .line 273
    .line 274
    invoke-virtual {v7, v3}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {v8, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v2}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v11, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    const/16 v2, 0xc

    .line 289
    .line 290
    invoke-virtual {v7, v2}, Lm6;->Α(I)Landroid/graphics/drawable/Drawable;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Λ:Landroid/graphics/drawable/Drawable;

    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const v3, 0x7f0f0015

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-static {v5, v2}, Lc52;->α(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 308
    .line 309
    .line 310
    const/16 v2, 0xf

    .line 311
    .line 312
    const v3, 0x7f0c0018

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    iput v2, v0, Landroidx/appcompat/widget/SearchView;->Μ:I

    .line 320
    .line 321
    const/4 v2, 0x5

    .line 322
    const/4 v3, 0x0

    .line 323
    invoke-virtual {v4, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    iput v2, v0, Landroidx/appcompat/widget/SearchView;->Ν:I

    .line 328
    .line 329
    invoke-virtual {v5, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v13}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v2, v19

    .line 354
    .line 355
    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v2, v18

    .line 359
    .line 360
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 361
    .line 362
    .line 363
    new-instance v2, Ldr1;

    .line 364
    .line 365
    invoke-direct {v2, v0}, Ldr1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 369
    .line 370
    .line 371
    const/16 v2, 0x8

    .line 372
    .line 373
    const/4 v3, 0x1

    .line 374
    invoke-virtual {v4, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 379
    .line 380
    .line 381
    const/4 v2, -0x1

    .line 382
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eq v5, v2, :cond_0

    .line 387
    .line 388
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    .line 389
    .line 390
    .line 391
    :cond_0
    const/4 v3, 0x6

    .line 392
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->Π:Ljava/lang/CharSequence;

    .line 397
    .line 398
    const/16 v3, 0xb

    .line 399
    .line 400
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->Ψ:Ljava/lang/CharSequence;

    .line 405
    .line 406
    const/4 v3, 0x3

    .line 407
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eq v3, v2, :cond_1

    .line 412
    .line 413
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    .line 414
    .line 415
    .line 416
    :cond_1
    const/4 v3, 0x2

    .line 417
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eq v3, v2, :cond_2

    .line 422
    .line 423
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    .line 424
    .line 425
    .line 426
    :cond_2
    const/4 v2, 0x1

    .line 427
    const/4 v3, 0x0

    .line 428
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v7}, Lm6;->Ξ()V

    .line 436
    .line 437
    .line 438
    new-instance v2, Landroid/content/Intent;

    .line 439
    .line 440
    const-string v3, "android.speech.action.WEB_SEARCH"

    .line 441
    .line 442
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Ξ:Landroid/content/Intent;

    .line 446
    .line 447
    const/high16 v3, 0x10000000

    .line 448
    .line 449
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 450
    .line 451
    .line 452
    const-string v4, "android.speech.extra.LANGUAGE_MODEL"

    .line 453
    .line 454
    const-string v5, "web_search"

    .line 455
    .line 456
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 457
    .line 458
    .line 459
    new-instance v2, Landroid/content/Intent;

    .line 460
    .line 461
    const-string v4, "android.speech.action.RECOGNIZE_SPEECH"

    .line 462
    .line 463
    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->Ο:Landroid/content/Intent;

    .line 467
    .line 468
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    iput-object v1, v0, Landroidx/appcompat/widget/SearchView;->Δ:Landroid/view/View;

    .line 480
    .line 481
    if-eqz v1, :cond_3

    .line 482
    .line 483
    new-instance v2, Ler1;

    .line 484
    .line 485
    invoke-direct {v2, v0}, Ler1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 489
    .line 490
    .line 491
    :cond_3
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 492
    .line 493
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->σ()V

    .line 497
    .line 498
    .line 499
    return-void
.end method

.method private getPreferredHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f070036

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private getPreferredWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f070037

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private setQuery(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final clearFocus()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->а:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->а:Z

    .line 17
    .line 18
    return-void
.end method

.method public getImeOptions()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getImeOptions()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getInputType()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getMaxWidth()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/SearchView;->б:I

    .line 2
    .line 3
    return p0
.end method

.method public getQuery()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getQueryHint()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Ψ:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/SearchableInfo;->getHintId()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-virtual {v0, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Π:Ljava/lang/CharSequence;

    .line 32
    .line 33
    return-object p0
.end method

.method public getSuggestionCommitIconResId()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/SearchView;->Ν:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuggestionRowLayout()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/appcompat/widget/SearchView;->Μ:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuggestionsAdapter()Lsq;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onActionViewCollapsed()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/appcompat/widget/SearchView;->г:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 22
    .line 23
    .line 24
    iget v1, p0, Landroidx/appcompat/widget/SearchView;->е:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->д:Z

    .line 31
    .line 32
    return-void
.end method

.method public final onActionViewExpanded()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->д:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->д:Z

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getImeOptions()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Landroidx/appcompat/widget/SearchView;->е:I

    .line 16
    .line 17
    const/high16 v2, 0x2000000

    .line 18
    .line 19
    or-int/2addr v1, v2

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 21
    .line 22
    .line 23
    const-string v1, ""

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->и:Lcr1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->й:Lcr1;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 7
    .line 8
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->Θ:[I

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 11
    .line 12
    .line 13
    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->Ι:[I

    .line 14
    .line 15
    invoke-virtual {p0, p4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    aget v1, p2, v0

    .line 20
    .line 21
    aget v0, p4, v0

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    const/4 v0, 0x0

    .line 25
    aget p2, p2, v0

    .line 26
    .line 27
    aget p4, p4, v0

    .line 28
    .line 29
    sub-int/2addr p2, p4

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    add-int/2addr p4, p2

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v1

    .line 40
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->Ζ:Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-virtual {v3, p2, v1, p4, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 43
    .line 44
    .line 45
    iget p2, v3, Landroid/graphics/Rect;->left:I

    .line 46
    .line 47
    iget p4, v3, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    sub-int/2addr p5, p3

    .line 50
    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->Η:Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-virtual {p3, p2, v0, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->Ε:Llr1;

    .line 56
    .line 57
    if-nez p2, :cond_0

    .line 58
    .line 59
    new-instance p2, Llr1;

    .line 60
    .line 61
    invoke-direct {p2, p1, p3, v3}, Llr1;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Landroidx/appcompat/widget/SearchView;->Ε:Llr1;

    .line 65
    .line 66
    invoke-virtual {p0, p2}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    iget-object p0, p2, Llr1;->β:Landroid/graphics/Rect;

    .line 71
    .line 72
    invoke-virtual {p0, p3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p2, Llr1;->δ:Landroid/graphics/Rect;

    .line 76
    .line 77
    invoke-virtual {p0, p3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    iget p1, p2, Llr1;->ε:I

    .line 81
    .line 82
    neg-int p1, p1

    .line 83
    invoke-virtual {p0, p1, p1}, Landroid/graphics/Rect;->inset(II)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p2, Llr1;->γ:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/high16 v1, -0x80000000

    .line 18
    .line 19
    const/high16 v2, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->б:I

    .line 29
    .line 30
    if-lez v0, :cond_6

    .line 31
    .line 32
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget p1, p0, Landroidx/appcompat/widget/SearchView;->б:I

    .line 38
    .line 39
    if-lez p1, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->б:I

    .line 48
    .line 49
    if-lez v0, :cond_5

    .line 50
    .line 51
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    goto :goto_0

    .line 56
    :cond_5
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    :cond_6
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eq v0, v1, :cond_8

    .line 73
    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_7
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    goto :goto_1

    .line 82
    :cond_8
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    :goto_1
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lkr1;

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
    check-cast p1, Lkr1;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/α;->ε:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p1, p1, Lkr1;->η:Z

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lkr1;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/customview/view/α;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 11
    .line 12
    iput-boolean p0, v1, Lkr1;->η:Z

    .line 13
    .line 14
    return-object v1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->и:Lcr1;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->а:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :goto_0
    return v1

    .line 14
    :cond_1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return p1

    .line 30
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->з:Landroid/os/Bundle;

    .line 2
    .line 3
    return-void
.end method

.method public setIconified(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->λ()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Σ:Landroid/view/View$OnClickListener;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public setIconifiedByDefault(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->σ()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setImeOptions(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setInputType(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/SearchView;->б:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnCloseListener(Lhr1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->Ρ:Landroid/view/View$OnFocusChangeListener;

    .line 2
    .line 3
    return-void
.end method

.method public setOnQueryTextListener(Lir1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->Σ:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public setOnSuggestionListener(Ljr1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->Ψ:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->σ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Ω:Z

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 4
    .line 5
    instance-of v0, p0, Lm12;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lm12;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    :goto_0
    iput p1, p0, Lm12;->υ:I

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getImeOptions()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getInputType()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    and-int/lit8 v3, p1, 0xf

    .line 32
    .line 33
    if-ne v3, v1, :cond_0

    .line 34
    .line 35
    const v3, -0x10001

    .line 36
    .line 37
    .line 38
    and-int/2addr p1, v3

    .line 39
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    const/high16 v3, 0x90000

    .line 48
    .line 49
    or-int/2addr p1, v3

    .line 50
    :cond_0
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lsq;->β(Landroid/database/Cursor;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    new-instance p1, Lm12;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 75
    .line 76
    iget-object v5, p0, Landroidx/appcompat/widget/SearchView;->к:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-direct {p1, v3, p0, v4, v5}, Lm12;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 87
    .line 88
    check-cast p1, Lm12;

    .line 89
    .line 90
    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->Ω:Z

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    const/4 v3, 0x2

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    move v3, v1

    .line 97
    :goto_0
    iput v3, p1, Lm12;->υ:I

    .line 98
    .line 99
    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->σ()V

    .line 100
    .line 101
    .line 102
    :cond_4
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Ξ:Landroid/content/Intent;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Ο:Landroid/content/Intent;

    .line 133
    .line 134
    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/high16 v4, 0x10000

    .line 145
    .line 146
    invoke-virtual {p1, v0, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    move v1, v3

    .line 154
    :goto_2
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 155
    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    const-string p1, "nm"

    .line 159
    .line 160
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Χ:Z

    .line 2
    .line 3
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setSuggestionsAdapter(Lsq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ι(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 p1, 0x10000000

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string p1, "user_query"

    .line 17
    .line 18
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->г:Ljava/lang/CharSequence;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    const-string p1, "query"

    .line 26
    .line 27
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const-string p1, "intent_extra_data_key"

    .line 33
    .line 34
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->з:Landroid/os/Bundle;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    const-string p2, "app_data"

    .line 42
    .line 43
    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public final κ(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .locals 7

    .line 1
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    const-string v2, "android.intent.action.SEARCH"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/high16 v4, 0x42000000    # 32.0f

    .line 21
    .line 22
    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->з:Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const-string v4, "app_data"

    .line 36
    .line 37
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    new-instance v3, Landroid/content/Intent;

    .line 41
    .line 42
    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const-string p1, "free_form"

    .line 65
    .line 66
    :goto_0
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x0

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move-object v4, v5

    .line 83
    :goto_1
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-virtual {p0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move-object p0, v5

    .line 99
    :goto_2
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    const/4 p2, 0x1

    .line 111
    :goto_3
    const-string v6, "android.speech.extra.LANGUAGE_MODEL"

    .line 112
    .line 113
    invoke-virtual {v3, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    const-string p1, "android.speech.extra.PROMPT"

    .line 117
    .line 118
    invoke-virtual {v3, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    const-string p1, "android.speech.extra.LANGUAGE"

    .line 122
    .line 123
    invoke-virtual {v3, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    const-string p0, "android.speech.extra.MAX_RESULTS"

    .line 127
    .line 128
    invoke-virtual {v3, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    if-nez v0, :cond_5

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    :goto_4
    const-string p0, "calling_package"

    .line 139
    .line 140
    invoke-virtual {v3, p0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    const-string p0, "android.speech.extra.RESULTS_PENDINGINTENT"

    .line 144
    .line 145
    invoke-virtual {v3, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    const-string p0, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    .line 149
    .line 150
    invoke-virtual {v3, p0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    return-object v3
.end method

.method public final λ()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/SearchView;->φ(Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    const-string p0, ""

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final μ(I)V
    .locals 6

    .line 1
    const-string v0, "SearchView"

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 4
    .line 5
    iget-object v1, v1, Lsq;->η:Landroid/database/Cursor;

    .line 6
    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_6

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :try_start_0
    sget v2, Lm12;->Δ:I

    .line 17
    .line 18
    const-string v2, "suggest_intent_action"

    .line 19
    .line 20
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v1, v2}, Lm12;->η(Landroid/database/Cursor;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception v2

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    :goto_0
    if-nez v2, :cond_1

    .line 40
    .line 41
    const-string v2, "android.intent.action.SEARCH"

    .line 42
    .line 43
    :cond_1
    const-string v3, "suggest_intent_data"

    .line 44
    .line 45
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v1, v3}, Lm12;->η(Landroid/database/Cursor;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    :cond_2
    if-eqz v3, :cond_3

    .line 62
    .line 63
    const-string v4, "suggest_intent_data_id"

    .line 64
    .line 65
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v1, v4}, Lm12;->η(Landroid/database/Cursor;I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v3, "/"

    .line 84
    .line 85
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_3
    if-nez v3, :cond_4

    .line 100
    .line 101
    move-object v3, p1

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    :goto_1
    const-string v4, "suggest_intent_query"

    .line 108
    .line 109
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-static {v1, v4}, Lm12;->η(Landroid/database/Cursor;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v5, "suggest_intent_extra_data"

    .line 118
    .line 119
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-static {v1, v5}, Lm12;->η(Landroid/database/Cursor;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {p0, v2, v3, v5, v4}, Landroidx/appcompat/widget/SearchView;->ι(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_4

    .line 132
    :goto_2
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->getPosition()I

    .line 133
    .line 134
    .line 135
    move-result v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 136
    goto :goto_3

    .line 137
    :catch_1
    const/4 v1, -0x1

    .line 138
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v4, "Search suggestions cursor at row "

    .line 141
    .line 142
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, " returned exception."

    .line 149
    .line 150
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 158
    .line 159
    .line 160
    :goto_4
    if-nez p1, :cond_5

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_5
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :catch_2
    move-exception v1

    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v3, "Failed launch activity: "

    .line 175
    .line 176
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {v0, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 187
    .line 188
    .line 189
    :cond_6
    :goto_5
    const/4 p1, 0x0

    .line 190
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final ν(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 8
    .line 9
    iget-object v1, v1, Lsq;->η:Landroid/database/Cursor;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Φ:Lsq;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Lsq;->γ(Landroid/database/Cursor;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void
.end method

.method public final ξ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ο()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ж:Landroid/app/SearchableInfo;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "android.intent.action.SEARCH"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p0, v2, v3, v3, v1}, Landroidx/appcompat/widget/SearchView;->ι(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final π()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->д:Z

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v1, 0x8

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 26
    :goto_1
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Β:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Landroid/view/ViewGroup;->ENABLED_STATE_SET:[I

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 43
    .line 44
    :goto_2
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 45
    .line 46
    .line 47
    :cond_3
    return-void
.end method

.method public final ρ()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Landroid/view/ViewGroup;->FOCUSED_STATE_SET:[I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 13
    .line 14
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->χ:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ψ:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final σ()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getQueryHint()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    :cond_0
    iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Λ:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    float-to-double v3, v1

    .line 25
    const-wide/high16 v5, 0x3ff4000000000000L    # 1.25

    .line 26
    .line 27
    mul-double/2addr v3, v5

    .line 28
    double-to-int v1, v3

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {p0, v3, v3, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 34
    .line 35
    const-string v3, "   "

    .line 36
    .line 37
    invoke-direct {v1, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Landroid/text/style/ImageSpan;

    .line 41
    .line 42
    invoke-direct {v3, p0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x2

    .line 46
    const/16 v4, 0x21

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    invoke-virtual {v1, v3, v5, p0, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :cond_2
    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final τ()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Χ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Α:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->Γ:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 v0, 0x8

    .line 32
    .line 33
    :goto_0
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->ψ:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final υ(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Χ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 p1, 0x8

    .line 30
    .line 31
    :goto_0
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->Α:Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final φ(Z)V
    .locals 6

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->υ:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    xor-int/lit8 v4, v3, 0x1

    .line 22
    .line 23
    iget-object v5, p0, Landroidx/appcompat/widget/SearchView;->ω:Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/SearchView;->υ(Z)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    move p1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move p1, v1

    .line 36
    :goto_1
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->φ:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Κ:Landroid/widget/ImageView;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView;->Τ:Z

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v2, v1

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    :goto_2
    move v2, v0

    .line 57
    :goto_3
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->π()V

    .line 61
    .line 62
    .line 63
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->в:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Υ:Z

    .line 68
    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Α:Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    move v0, v1

    .line 79
    :cond_4
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->Γ:Landroid/widget/ImageView;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->τ()V

    .line 85
    .line 86
    .line 87
    return-void
.end method
