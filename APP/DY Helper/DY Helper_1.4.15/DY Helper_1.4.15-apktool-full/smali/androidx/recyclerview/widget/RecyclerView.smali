.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static р:Z = false

.field public static с:Z = false

.field public static final т:[I

.field public static final у:F

.field public static final ф:Z

.field public static final х:[Ljava/lang/Class;

.field public static final ц:Lrl1;

.field public static final ч:Llm1;


# instance fields
.field public Α:I

.field public final Β:Landroid/view/accessibility/AccessibilityManager;

.field public Γ:Z

.field public Δ:Z

.field public Ε:I

.field public final Ζ:I

.field public Η:Lwl1;

.field public Θ:Landroid/widget/EdgeEffect;

.field public Ι:Landroid/widget/EdgeEffect;

.field public Κ:Landroid/widget/EdgeEffect;

.field public Λ:Landroid/widget/EdgeEffect;

.field public Μ:Lxl1;

.field public Ν:I

.field public Ξ:I

.field public Ο:Landroid/view/VelocityTracker;

.field public Π:I

.field public Ρ:I

.field public Σ:I

.field public Τ:I

.field public Υ:I

.field public final Φ:I

.field public final Χ:I

.field public final Ψ:F

.field public final Ω:F

.field public final ε:F

.field public final ζ:Lfm1;

.field public η:Lhm1;

.field public final θ:Lm6;

.field public final ι:Lm6;

.field public final κ:Lzz1;

.field public λ:Z

.field public final μ:Landroid/graphics/Rect;

.field public final ν:Landroid/graphics/Rect;

.field public final ξ:Landroid/graphics/RectF;

.field public ο:Lzl1;

.field public final π:Ljava/util/ArrayList;

.field public final ρ:Ljava/util/ArrayList;

.field public σ:Lo00;

.field public τ:Z

.field public υ:Z

.field public φ:Z

.field public χ:I

.field public ψ:Z

.field public ω:Z

.field public а:Z

.field public final б:Lnm1;

.field public в:Ld90;

.field public final г:Lb90;

.field public final д:Lkm1;

.field public е:Ljava/util/ArrayList;

.field public final ж:Lrk0;

.field public з:Lpm1;

.field public и:Lb31;

.field public final й:[I

.field public final к:[I

.field public final л:[I

.field public final м:Ljava/util/ArrayList;

.field public final н:Ld1;

.field public final о:Z

.field public final п:Ldt;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const v0, 0x1010436

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->т:[I

    .line 9
    .line 10
    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-wide v2, 0x3feccccccccccccdL    # 0.9

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    div-double/2addr v0, v2

    .line 29
    double-to-float v0, v0

    .line 30
    sput v0, Landroidx/recyclerview/widget/RecyclerView;->у:F

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 34
    .line 35
    const-class v0, Landroid/util/AttributeSet;

    .line 36
    .line 37
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    const-class v2, Landroid/content/Context;

    .line 40
    .line 41
    filled-new-array {v2, v0, v1, v1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->х:[Ljava/lang/Class;

    .line 46
    .line 47
    new-instance v0, Lrl1;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Lrl1;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->ц:Lrl1;

    .line 54
    .line 55
    new-instance v0, Llm1;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->ч:Llm1;

    .line 61
    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0400e6

    .line 883
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400e6

    .line 882
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move/from16 v6, p3

    .line 8
    .line 9
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lfm1;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lfm1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 18
    .line 19
    new-instance v0, Lzz1;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    invoke-direct {v0, v3}, Lzz1;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->κ:Lzz1;

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->μ:Landroid/graphics/Rect;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->ν:Landroid/graphics/Rect;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/RectF;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->ξ:Landroid/graphics/RectF;

    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 60
    .line 61
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->ρ:Ljava/util/ArrayList;

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 70
    .line 71
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Γ:Z

    .line 72
    .line 73
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Δ:Z

    .line 74
    .line 75
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 76
    .line 77
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Ζ:I

    .line 78
    .line 79
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->ч:Llm1;

    .line 80
    .line 81
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 82
    .line 83
    new-instance v0, Lfr;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    iput-object v10, v0, Lxl1;->α:Lrk0;

    .line 90
    .line 91
    new-instance v3, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v3, v0, Lxl1;->β:Ljava/util/ArrayList;

    .line 97
    .line 98
    const-wide/16 v7, 0xfa

    .line 99
    .line 100
    iput-wide v7, v0, Lxl1;->γ:J

    .line 101
    .line 102
    iput-wide v7, v0, Lxl1;->δ:J

    .line 103
    .line 104
    new-instance v3, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v3, v0, Lfr;->ε:Ljava/util/ArrayList;

    .line 110
    .line 111
    new-instance v3, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v3, v0, Lfr;->ζ:Ljava/util/ArrayList;

    .line 117
    .line 118
    new-instance v3, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v3, v0, Lfr;->η:Ljava/util/ArrayList;

    .line 124
    .line 125
    new-instance v3, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v3, v0, Lfr;->θ:Ljava/util/ArrayList;

    .line 131
    .line 132
    new-instance v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v3, v0, Lfr;->ι:Ljava/util/ArrayList;

    .line 138
    .line 139
    new-instance v3, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v3, v0, Lfr;->κ:Ljava/util/ArrayList;

    .line 145
    .line 146
    new-instance v3, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v3, v0, Lfr;->λ:Ljava/util/ArrayList;

    .line 152
    .line 153
    new-instance v3, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v3, v0, Lfr;->μ:Ljava/util/ArrayList;

    .line 159
    .line 160
    new-instance v3, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v3, v0, Lfr;->ν:Ljava/util/ArrayList;

    .line 166
    .line 167
    new-instance v3, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v3, v0, Lfr;->ξ:Ljava/util/ArrayList;

    .line 173
    .line 174
    new-instance v3, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object v3, v0, Lfr;->ο:Ljava/util/ArrayList;

    .line 180
    .line 181
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 182
    .line 183
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 184
    .line 185
    const/4 v0, -0x1

    .line 186
    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 187
    .line 188
    const/4 v3, 0x1

    .line 189
    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView;->Ψ:F

    .line 190
    .line 191
    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView;->Ω:F

    .line 192
    .line 193
    const/4 v11, 0x1

    .line 194
    iput-boolean v11, v1, Landroidx/recyclerview/widget/RecyclerView;->а:Z

    .line 195
    .line 196
    new-instance v3, Lnm1;

    .line 197
    .line 198
    invoke-direct {v3, v1}, Lnm1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 199
    .line 200
    .line 201
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 202
    .line 203
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 204
    .line 205
    if-eqz v3, :cond_0

    .line 206
    .line 207
    new-instance v3, Lb90;

    .line 208
    .line 209
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_0
    move-object v3, v10

    .line 214
    :goto_0
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 215
    .line 216
    new-instance v3, Lkm1;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    iput v0, v3, Lkm1;->α:I

    .line 222
    .line 223
    iput v9, v3, Lkm1;->β:I

    .line 224
    .line 225
    iput-boolean v9, v3, Lkm1;->γ:Z

    .line 226
    .line 227
    iput-boolean v9, v3, Lkm1;->δ:Z

    .line 228
    .line 229
    iput-boolean v9, v3, Lkm1;->ε:Z

    .line 230
    .line 231
    iput-boolean v9, v3, Lkm1;->ζ:Z

    .line 232
    .line 233
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 234
    .line 235
    new-instance v3, Lrk0;

    .line 236
    .line 237
    const/16 v5, 0x16

    .line 238
    .line 239
    invoke-direct {v3, v5}, Lrk0;-><init>(I)V

    .line 240
    .line 241
    .line 242
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->ж:Lrk0;

    .line 243
    .line 244
    const/4 v12, 0x2

    .line 245
    new-array v5, v12, [I

    .line 246
    .line 247
    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 248
    .line 249
    new-array v5, v12, [I

    .line 250
    .line 251
    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->к:[I

    .line 252
    .line 253
    new-array v5, v12, [I

    .line 254
    .line 255
    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 256
    .line 257
    new-instance v5, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->м:Ljava/util/ArrayList;

    .line 263
    .line 264
    new-instance v5, Ld1;

    .line 265
    .line 266
    const/16 v8, 0x8

    .line 267
    .line 268
    invoke-direct {v5, v8, v1}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->н:Ld1;

    .line 272
    .line 273
    new-instance v5, Lsl1;

    .line 274
    .line 275
    invoke-direct {v5, v1}, Lsl1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 276
    .line 277
    .line 278
    new-instance v7, Ldt;

    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    invoke-direct {v7, v13, v5}, Ldt;-><init>(Landroid/content/Context;Let;)V

    .line 285
    .line 286
    .line 287
    iput-object v7, v1, Landroidx/recyclerview/widget/RecyclerView;->п:Ldt;

    .line 288
    .line 289
    invoke-virtual {v1, v11}, Landroid/view/View;->setScrollContainer(Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v11}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 293
    .line 294
    .line 295
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    iput v7, v1, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 304
    .line 305
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    iput v7, v1, Landroidx/recyclerview/widget/RecyclerView;->Ψ:F

    .line 310
    .line 311
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    iput v7, v1, Landroidx/recyclerview/widget/RecyclerView;->Ω:F

    .line 316
    .line 317
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    iput v7, v1, Landroidx/recyclerview/widget/RecyclerView;->Φ:I

    .line 322
    .line 323
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    iput v5, v1, Landroidx/recyclerview/widget/RecyclerView;->Χ:I

    .line 328
    .line 329
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 338
    .line 339
    const/high16 v7, 0x43200000    # 160.0f

    .line 340
    .line 341
    mul-float/2addr v5, v7

    .line 342
    const v7, 0x43c10b3d

    .line 343
    .line 344
    .line 345
    mul-float/2addr v5, v7

    .line 346
    const v7, 0x3f570a3d    # 0.84f

    .line 347
    .line 348
    .line 349
    mul-float/2addr v5, v7

    .line 350
    iput v5, v1, Landroidx/recyclerview/widget/RecyclerView;->ε:F

    .line 351
    .line 352
    invoke-virtual {v1}, Landroid/view/View;->getOverScrollMode()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    if-ne v5, v12, :cond_1

    .line 357
    .line 358
    move v5, v11

    .line 359
    goto :goto_1

    .line 360
    :cond_1
    move v5, v9

    .line 361
    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 362
    .line 363
    .line 364
    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 365
    .line 366
    iput-object v3, v5, Lxl1;->α:Lrk0;

    .line 367
    .line 368
    new-instance v3, Lm6;

    .line 369
    .line 370
    new-instance v5, Lrk0;

    .line 371
    .line 372
    const/16 v7, 0x15

    .line 373
    .line 374
    invoke-direct {v5, v7, v1}, Lrk0;-><init>(ILjava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-direct {v3, v5}, Lm6;-><init>(Lrk0;)V

    .line 378
    .line 379
    .line 380
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 381
    .line 382
    new-instance v3, Lm6;

    .line 383
    .line 384
    new-instance v5, Lsl1;

    .line 385
    .line 386
    invoke-direct {v5, v1}, Lsl1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 387
    .line 388
    .line 389
    invoke-direct {v3, v5}, Lm6;-><init>(Lsl1;)V

    .line 390
    .line 391
    .line 392
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 393
    .line 394
    sget-object v3, Lb92;->α:Ljava/util/WeakHashMap;

    .line 395
    .line 396
    invoke-static {v1}, Lw82;->α(Landroid/view/View;)I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-nez v3, :cond_2

    .line 401
    .line 402
    invoke-static {v1, v8}, Lw82;->β(Landroid/view/View;I)V

    .line 403
    .line 404
    .line 405
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-nez v3, :cond_3

    .line 410
    .line 411
    invoke-virtual {v1, v11}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 412
    .line 413
    .line 414
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    const-string v5, "accessibility"

    .line 419
    .line 420
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, Landroid/view/accessibility/AccessibilityManager;

    .line 425
    .line 426
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->Β:Landroid/view/accessibility/AccessibilityManager;

    .line 427
    .line 428
    new-instance v3, Lpm1;

    .line 429
    .line 430
    invoke-direct {v3, v1}, Lpm1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lpm1;)V

    .line 434
    .line 435
    .line 436
    sget-object v3, Ljk1;->α:[I

    .line 437
    .line 438
    invoke-virtual {v2, v4, v3, v6, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    const/4 v7, 0x0

    .line 443
    invoke-static/range {v1 .. v7}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 444
    .line 445
    .line 446
    move-object v13, v2

    .line 447
    move-object v14, v4

    .line 448
    move-object v2, v5

    .line 449
    move v15, v6

    .line 450
    invoke-virtual {v2, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v16

    .line 454
    invoke-virtual {v2, v12, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-ne v3, v0, :cond_4

    .line 459
    .line 460
    const/high16 v0, 0x40000

    .line 461
    .line 462
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 463
    .line 464
    .line 465
    :cond_4
    invoke-virtual {v2, v11, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    iput-boolean v0, v1, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 470
    .line 471
    const/4 v0, 0x3

    .line 472
    invoke-virtual {v2, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    const/4 v4, 0x4

    .line 477
    if-eqz v3, :cond_6

    .line 478
    .line 479
    const/4 v3, 0x6

    .line 480
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    .line 485
    .line 486
    const/4 v5, 0x7

    .line 487
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 492
    .line 493
    .line 494
    move-result-object v6

    .line 495
    check-cast v6, Landroid/graphics/drawable/StateListDrawable;

    .line 496
    .line 497
    const/4 v7, 0x5

    .line 498
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    if-eqz v3, :cond_5

    .line 503
    .line 504
    if-eqz v5, :cond_5

    .line 505
    .line 506
    if-eqz v6, :cond_5

    .line 507
    .line 508
    if-eqz v7, :cond_5

    .line 509
    .line 510
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 511
    .line 512
    .line 513
    move-result-object v8

    .line 514
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    move/from16 v17, v0

    .line 519
    .line 520
    new-instance v0, Lo00;

    .line 521
    .line 522
    const v4, 0x7f070073

    .line 523
    .line 524
    .line 525
    invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    move/from16 v18, v12

    .line 530
    .line 531
    const v12, 0x7f070075

    .line 532
    .line 533
    .line 534
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 535
    .line 536
    .line 537
    move-result v12

    .line 538
    move/from16 v19, v11

    .line 539
    .line 540
    const v11, 0x7f070074

    .line 541
    .line 542
    .line 543
    invoke-virtual {v8, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    move-object v11, v6

    .line 548
    move v6, v4

    .line 549
    move-object v4, v11

    .line 550
    move-object v11, v2

    .line 551
    move-object v2, v3

    .line 552
    move-object v3, v5

    .line 553
    move-object v5, v7

    .line 554
    move v7, v12

    .line 555
    const/4 v12, 0x4

    .line 556
    invoke-direct/range {v0 .. v8}, Lo00;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    .line 557
    .line 558
    .line 559
    goto :goto_2

    .line 560
    :cond_5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const-string v1, "Trying to set fast scroller without both required drawables."

    .line 565
    .line 566
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    throw v10

    .line 574
    :cond_6
    move/from16 v17, v0

    .line 575
    .line 576
    move/from16 v19, v11

    .line 577
    .line 578
    move/from16 v18, v12

    .line 579
    .line 580
    move-object v11, v2

    .line 581
    move v12, v4

    .line 582
    :goto_2
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const-string v2, "android.hardware.rotaryencoder.lowres"

    .line 590
    .line 591
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    iput-boolean v0, v1, Landroidx/recyclerview/widget/RecyclerView;->о:Z

    .line 596
    .line 597
    const-string v2, ": Could not instantiate the LayoutManager: "

    .line 598
    .line 599
    if-eqz v16, :cond_a

    .line 600
    .line 601
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-nez v3, :cond_a

    .line 610
    .line 611
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    const/16 v4, 0x2e

    .line 616
    .line 617
    if-ne v3, v4, :cond_7

    .line 618
    .line 619
    new-instance v3, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    :goto_3
    move-object v3, v0

    .line 639
    goto :goto_4

    .line 640
    :cond_7
    const-string v3, "."

    .line 641
    .line 642
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-eqz v3, :cond_8

    .line 647
    .line 648
    goto :goto_3

    .line 649
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 652
    .line 653
    .line 654
    const-class v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 655
    .line 656
    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    goto :goto_3

    .line 678
    :goto_4
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    if-eqz v0, :cond_9

    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    goto :goto_5

    .line 693
    :catch_0
    move-exception v0

    .line 694
    goto :goto_8

    .line 695
    :catch_1
    move-exception v0

    .line 696
    goto/16 :goto_9

    .line 697
    .line 698
    :catch_2
    move-exception v0

    .line 699
    goto/16 :goto_a

    .line 700
    .line 701
    :catch_3
    move-exception v0

    .line 702
    goto/16 :goto_b

    .line 703
    .line 704
    :catch_4
    move-exception v0

    .line 705
    goto/16 :goto_c

    .line 706
    .line 707
    :cond_9
    invoke-virtual {v13}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    :goto_5
    invoke-static {v3, v9, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    const-class v4, Lzl1;

    .line 716
    .line 717
    invoke-virtual {v0, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 721
    :try_start_1
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->х:[Ljava/lang/Class;

    .line 722
    .line 723
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    new-array v5, v12, [Ljava/lang/Object;

    .line 728
    .line 729
    aput-object v13, v5, v9

    .line 730
    .line 731
    aput-object v14, v5, v19

    .line 732
    .line 733
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    aput-object v6, v5, v18

    .line 738
    .line 739
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    aput-object v6, v5, v17
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 744
    .line 745
    :goto_6
    move/from16 v4, v19

    .line 746
    .line 747
    goto :goto_7

    .line 748
    :catch_5
    move-exception v0

    .line 749
    move-object v5, v0

    .line 750
    :try_start_2
    invoke-virtual {v4, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 751
    .line 752
    .line 753
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 754
    move-object v5, v10

    .line 755
    goto :goto_6

    .line 756
    :goto_7
    :try_start_3
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    check-cast v0, Lzl1;

    .line 764
    .line 765
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lzl1;)V

    .line 766
    .line 767
    .line 768
    goto :goto_d

    .line 769
    :catch_6
    move-exception v0

    .line 770
    invoke-virtual {v0, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 771
    .line 772
    .line 773
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 774
    .line 775
    new-instance v4, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    const-string v5, ": Error creating LayoutManager "

    .line 788
    .line 789
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    invoke-direct {v1, v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 800
    .line 801
    .line 802
    throw v1
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    .line 803
    :goto_8
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    const-string v2, ": Class is not a LayoutManager "

    .line 808
    .line 809
    invoke-static {v1, v2, v3, v0}, Lql1;->β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 810
    .line 811
    .line 812
    throw v10

    .line 813
    :goto_9
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    const-string v2, ": Cannot access non-public constructor "

    .line 818
    .line 819
    invoke-static {v1, v2, v3, v0}, Lql1;->β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 820
    .line 821
    .line 822
    throw v10

    .line 823
    :goto_a
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-static {v1, v2, v3, v0}, Lql1;->β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 828
    .line 829
    .line 830
    throw v10

    .line 831
    :goto_b
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    invoke-static {v1, v2, v3, v0}, Lql1;->β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 836
    .line 837
    .line 838
    throw v10

    .line 839
    :goto_c
    invoke-interface {v14}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    const-string v2, ": Unable to find LayoutManager "

    .line 844
    .line 845
    invoke-static {v1, v2, v3, v0}, Lql1;->β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 846
    .line 847
    .line 848
    throw v10

    .line 849
    :cond_a
    :goto_d
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->т:[I

    .line 850
    .line 851
    invoke-virtual {v13, v14, v3, v15, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    const/4 v7, 0x0

    .line 856
    move-object v2, v13

    .line 857
    move-object v4, v14

    .line 858
    move v6, v15

    .line 859
    invoke-static/range {v1 .. v7}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 860
    .line 861
    .line 862
    const/4 v4, 0x1

    .line 863
    invoke-virtual {v5, v9, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 871
    .line 872
    .line 873
    const v0, 0x7f0901fc

    .line 874
    .line 875
    .line 876
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 877
    .line 878
    invoke-virtual {v1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-void
.end method

.method private getScrollingChildHelper()Lb31;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->и:Lb31;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lb31;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lb31;-><init>(Landroid/view/ViewGroup;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->и:Lb31;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->и:Lb31;

    .line 13
    .line 14
    return-object p0
.end method

.method public static setDebugAssertionsEnabled(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 2
    .line 3
    return-void
.end method

.method public static setVerboseLoggingEnabled(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->с:Z

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic α(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static δ(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I
    .locals 4

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40800000    # 4.0f

    .line 5
    .line 6
    if-lez p0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    cmpl-float v3, v3, v1

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    neg-int p2, p0

    .line 19
    int-to-float p2, p2

    .line 20
    mul-float/2addr p2, v2

    .line 21
    int-to-float v1, p3

    .line 22
    div-float/2addr p2, v1

    .line 23
    neg-int p3, p3

    .line 24
    int-to-float p3, p3

    .line 25
    div-float/2addr p3, v2

    .line 26
    invoke-static {p1, p2, v0}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    mul-float/2addr p2, p3

    .line 31
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eq p2, p0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    .line 38
    .line 39
    .line 40
    :cond_0
    sub-int/2addr p0, p2

    .line 41
    return p0

    .line 42
    :cond_1
    if-gez p0, :cond_3

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-static {p2}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    cmpl-float p1, p1, v1

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    int-to-float p1, p0

    .line 55
    mul-float/2addr p1, v2

    .line 56
    int-to-float p3, p3

    .line 57
    div-float/2addr p1, p3

    .line 58
    div-float/2addr p3, v2

    .line 59
    invoke-static {p2, p1, v0}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    mul-float/2addr p1, p3

    .line 64
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eq p1, p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->finish()V

    .line 71
    .line 72
    .line 73
    :cond_2
    sub-int/2addr p0, p1

    .line 74
    :cond_3
    return p0
.end method

.method public static σ(Landroid/view/View;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lam1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lam1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 6
    .line 7
    check-cast p1, Lam1;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lzl1;->ε(Lam1;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lzl1;->η(Lkm1;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lzl1;->θ(Lkm1;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return v1
.end method

.method public final computeHorizontalScrollRange()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lzl1;->ι(Lkm1;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final computeVerticalScrollExtent()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lzl1;->κ(Lkm1;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lzl1;->λ(Lkm1;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return v1
.end method

.method public final computeVerticalScrollRange()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lzl1;->μ(Lkm1;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lzl1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const-string v4, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 24
    .line 25
    const-string v5, "RecyclerView"

    .line 26
    .line 27
    const/16 v6, 0x7b

    .line 28
    .line 29
    const/16 v7, 0x5c

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/16 v9, 0x7a

    .line 33
    .line 34
    const/16 v10, 0x5d

    .line 35
    .line 36
    if-eqz v3, :cond_a

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eq p1, v7, :cond_8

    .line 43
    .line 44
    if-eq p1, v10, :cond_8

    .line 45
    .line 46
    if-eq p1, v9, :cond_2

    .line 47
    .line 48
    if-eq p1, v6, :cond_2

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Lzl1;->Ε()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-ne p1, v9, :cond_4

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 62
    .line 63
    .line 64
    throw v8

    .line 65
    :cond_4
    if-eqz v0, :cond_7

    .line 66
    .line 67
    :goto_0
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 68
    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_5
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 73
    .line 74
    if-nez p1, :cond_6

    .line 75
    .line 76
    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    return v1

    .line 80
    :cond_6
    invoke-virtual {p1, p0}, Lzl1;->Ψ(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 81
    .line 82
    .line 83
    return v1

    .line 84
    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 85
    .line 86
    .line 87
    throw v8

    .line 88
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-ne p1, v10, :cond_9

    .line 93
    .line 94
    invoke-virtual {p0, v2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Ζ(IIZ)V

    .line 95
    .line 96
    .line 97
    return v1

    .line 98
    :cond_9
    neg-int p1, v0

    .line 99
    invoke-virtual {p0, v2, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->Ζ(IIZ)V

    .line 100
    .line 101
    .line 102
    return v1

    .line 103
    :cond_a
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_13

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eq p1, v7, :cond_11

    .line 114
    .line 115
    if-eq p1, v10, :cond_11

    .line 116
    .line 117
    if-eq p1, v9, :cond_b

    .line 118
    .line 119
    if-eq p1, v6, :cond_b

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_b
    invoke-virtual {v0}, Lzl1;->Ε()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-ne p1, v9, :cond_d

    .line 127
    .line 128
    if-nez v0, :cond_c

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 132
    .line 133
    .line 134
    throw v8

    .line 135
    :cond_d
    if-eqz v0, :cond_10

    .line 136
    .line 137
    :goto_1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 138
    .line 139
    if-eqz p1, :cond_e

    .line 140
    .line 141
    :goto_2
    return v1

    .line 142
    :cond_e
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 143
    .line 144
    if-nez p1, :cond_f

    .line 145
    .line 146
    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    return v1

    .line 150
    :cond_f
    invoke-virtual {p1, p0}, Lzl1;->Ψ(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 151
    .line 152
    .line 153
    return v1

    .line 154
    :cond_10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 155
    .line 156
    .line 157
    throw v8

    .line 158
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-ne p1, v10, :cond_12

    .line 163
    .line 164
    invoke-virtual {p0, v0, v2, v2}, Landroidx/recyclerview/widget/RecyclerView;->Ζ(IIZ)V

    .line 165
    .line 166
    .line 167
    return v1

    .line 168
    :cond_12
    neg-int p1, v0

    .line 169
    invoke-virtual {p0, p1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView;->Ζ(IIZ)V

    .line 170
    .line 171
    .line 172
    return v1

    .line 173
    :cond_13
    :goto_3
    return v2
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lb31;->α(FFZ)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Lb31;->β(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lb31;->γ(III[I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-virtual/range {v0 .. v7}, Lb31;->δ(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-ge v3, v1, :cond_5

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Lo00;

    .line 21
    .line 22
    iget v7, v6, Lo00;->μ:I

    .line 23
    .line 24
    iget-object v8, v6, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-ne v7, v8, :cond_3

    .line 31
    .line 32
    iget v7, v6, Lo00;->ν:I

    .line 33
    .line 34
    iget-object v8, v6, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eq v7, v8, :cond_0

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    iget v7, v6, Lo00;->χ:I

    .line 45
    .line 46
    if-eqz v7, :cond_4

    .line 47
    .line 48
    iget-boolean v7, v6, Lo00;->ο:Z

    .line 49
    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    iget v7, v6, Lo00;->μ:I

    .line 53
    .line 54
    iget v8, v6, Lo00;->δ:I

    .line 55
    .line 56
    sub-int/2addr v7, v8

    .line 57
    iget-object v9, v6, Lo00;->β:Landroid/graphics/drawable/StateListDrawable;

    .line 58
    .line 59
    invoke-virtual {v9, v2, v2, v8, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 60
    .line 61
    .line 62
    iget-object v10, v6, Lo00;->γ:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    iget v11, v6, Lo00;->ε:I

    .line 65
    .line 66
    iget v12, v6, Lo00;->ν:I

    .line 67
    .line 68
    invoke-virtual {v10, v2, v2, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 69
    .line 70
    .line 71
    iget-object v11, v6, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v11}, Landroid/view/View;->getLayoutDirection()I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-ne v11, v5, :cond_1

    .line 78
    .line 79
    invoke-virtual {v10, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 80
    .line 81
    .line 82
    int-to-float v5, v8

    .line 83
    int-to-float v7, v2

    .line 84
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 85
    .line 86
    .line 87
    const/high16 v5, -0x40800000    # -1.0f

    .line 88
    .line 89
    const/high16 v7, 0x3f800000    # 1.0f

    .line 90
    .line 91
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->scale(FF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->scale(FF)V

    .line 98
    .line 99
    .line 100
    neg-int v5, v8

    .line 101
    int-to-float v5, v5

    .line 102
    int-to-float v7, v2

    .line 103
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    int-to-float v5, v7

    .line 108
    invoke-virtual {p1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 112
    .line 113
    .line 114
    int-to-float v5, v2

    .line 115
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    neg-int v5, v7

    .line 122
    int-to-float v5, v5

    .line 123
    int-to-float v7, v2

    .line 124
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 125
    .line 126
    .line 127
    :cond_2
    :goto_1
    iget-boolean v5, v6, Lo00;->π:Z

    .line 128
    .line 129
    if-eqz v5, :cond_4

    .line 130
    .line 131
    iget v5, v6, Lo00;->ν:I

    .line 132
    .line 133
    iget v7, v6, Lo00;->θ:I

    .line 134
    .line 135
    sub-int/2addr v5, v7

    .line 136
    iget-object v8, v6, Lo00;->ζ:Landroid/graphics/drawable/StateListDrawable;

    .line 137
    .line 138
    invoke-virtual {v8, v2, v2, v2, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 139
    .line 140
    .line 141
    iget-object v7, v6, Lo00;->η:Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    iget v9, v6, Lo00;->μ:I

    .line 144
    .line 145
    iget v6, v6, Lo00;->ι:I

    .line 146
    .line 147
    invoke-virtual {v7, v2, v2, v9, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 148
    .line 149
    .line 150
    int-to-float v6, v5

    .line 151
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 155
    .line 156
    .line 157
    int-to-float v6, v2

    .line 158
    invoke-virtual {p1, v6, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 162
    .line 163
    .line 164
    int-to-float v4, v2

    .line 165
    neg-int v5, v5

    .line 166
    int-to-float v5, v5

    .line 167
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_3
    :goto_2
    iget-object v4, v6, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    iput v4, v6, Lo00;->μ:I

    .line 178
    .line 179
    iget-object v4, v6, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 180
    .line 181
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    iput v4, v6, Lo00;->ν:I

    .line 186
    .line 187
    invoke-virtual {v6, v2}, Lo00;->δ(I)V

    .line 188
    .line 189
    .line 190
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 195
    .line 196
    if-eqz v1, :cond_8

    .line 197
    .line 198
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_8

    .line 203
    .line 204
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 209
    .line 210
    if-eqz v3, :cond_6

    .line 211
    .line 212
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    goto :goto_4

    .line 217
    :cond_6
    move v3, v2

    .line 218
    :goto_4
    const/high16 v6, 0x43870000    # 270.0f

    .line 219
    .line 220
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    neg-int v6, v6

    .line 228
    add-int/2addr v6, v3

    .line 229
    int-to-float v3, v6

    .line 230
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 231
    .line 232
    .line 233
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 234
    .line 235
    if-eqz v3, :cond_7

    .line 236
    .line 237
    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_7

    .line 242
    .line 243
    move v3, v5

    .line 244
    goto :goto_5

    .line 245
    :cond_7
    move v3, v2

    .line 246
    :goto_5
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_8
    move v3, v2

    .line 251
    :goto_6
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 252
    .line 253
    if-eqz v1, :cond_b

    .line 254
    .line 255
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_b

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 266
    .line 267
    if-eqz v4, :cond_9

    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    int-to-float v4, v4

    .line 274
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    int-to-float v6, v6

    .line 279
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 280
    .line 281
    .line 282
    :cond_9
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 283
    .line 284
    if-eqz v4, :cond_a

    .line 285
    .line 286
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_a

    .line 291
    .line 292
    move v4, v5

    .line 293
    goto :goto_7

    .line 294
    :cond_a
    move v4, v2

    .line 295
    :goto_7
    or-int/2addr v3, v4

    .line 296
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 297
    .line 298
    .line 299
    :cond_b
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 300
    .line 301
    if-eqz v1, :cond_e

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-nez v1, :cond_e

    .line 308
    .line 309
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 318
    .line 319
    if-eqz v6, :cond_c

    .line 320
    .line 321
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    goto :goto_8

    .line 326
    :cond_c
    move v6, v2

    .line 327
    :goto_8
    const/high16 v7, 0x42b40000    # 90.0f

    .line 328
    .line 329
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    .line 330
    .line 331
    .line 332
    int-to-float v6, v6

    .line 333
    neg-int v4, v4

    .line 334
    int-to-float v4, v4

    .line 335
    invoke-virtual {p1, v6, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 336
    .line 337
    .line 338
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 339
    .line 340
    if-eqz v4, :cond_d

    .line 341
    .line 342
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_d

    .line 347
    .line 348
    move v4, v5

    .line 349
    goto :goto_9

    .line 350
    :cond_d
    move v4, v2

    .line 351
    :goto_9
    or-int/2addr v3, v4

    .line 352
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 353
    .line 354
    .line 355
    :cond_e
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 356
    .line 357
    if-eqz v1, :cond_11

    .line 358
    .line 359
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-nez v1, :cond_11

    .line 364
    .line 365
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    const/high16 v4, 0x43340000    # 180.0f

    .line 370
    .line 371
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 372
    .line 373
    .line 374
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 375
    .line 376
    if-eqz v4, :cond_f

    .line 377
    .line 378
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    neg-int v4, v4

    .line 383
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    add-int/2addr v6, v4

    .line 388
    int-to-float v4, v6

    .line 389
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    neg-int v6, v6

    .line 394
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    add-int/2addr v7, v6

    .line 399
    int-to-float v6, v7

    .line 400
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 401
    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    neg-int v4, v4

    .line 409
    int-to-float v4, v4

    .line 410
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    neg-int v6, v6

    .line 415
    int-to-float v6, v6

    .line 416
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 417
    .line 418
    .line 419
    :goto_a
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 420
    .line 421
    if-eqz v4, :cond_10

    .line 422
    .line 423
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_10

    .line 428
    .line 429
    move v2, v5

    .line 430
    :cond_10
    or-int/2addr v3, v2

    .line 431
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 432
    .line 433
    .line 434
    :cond_11
    if-nez v3, :cond_12

    .line 435
    .line 436
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 437
    .line 438
    if-eqz p1, :cond_12

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    if-lez p1, :cond_12

    .line 445
    .line 446
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 447
    .line 448
    invoke-virtual {p1}, Lxl1;->β()Z

    .line 449
    .line 450
    .line 451
    move-result p1

    .line 452
    if-eqz p1, :cond_12

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_12
    move v5, v3

    .line 456
    :goto_b
    if-eqz v5, :cond_13

    .line 457
    .line 458
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 459
    .line 460
    .line 461
    :cond_13
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->Γ(Landroid/view/View;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    if-eqz v0, :cond_16

    .line 39
    .line 40
    if-eq v0, p0, :cond_16

    .line 41
    .line 42
    if-ne v0, p1, :cond_2

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->ξ(Landroid/view/View;)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_3
    if-nez p1, :cond_4

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ξ(Landroid/view/View;)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->μ:Landroid/graphics/Rect;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->ν:Landroid/graphics/Rect;

    .line 89
    .line 90
    invoke-virtual {v5, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 100
    .line 101
    iget-object v1, v1, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, -0x1

    .line 108
    const/4 v6, 0x1

    .line 109
    if-ne v1, v6, :cond_6

    .line 110
    .line 111
    move v1, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    move v1, v6

    .line 114
    :goto_0
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 115
    .line 116
    iget v8, v5, Landroid/graphics/Rect;->left:I

    .line 117
    .line 118
    if-lt v7, v8, :cond_7

    .line 119
    .line 120
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 121
    .line 122
    if-gt v9, v8, :cond_8

    .line 123
    .line 124
    :cond_7
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 125
    .line 126
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 127
    .line 128
    if-ge v9, v10, :cond_8

    .line 129
    .line 130
    move v7, v6

    .line 131
    goto :goto_1

    .line 132
    :cond_8
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 133
    .line 134
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    if-gt v9, v10, :cond_9

    .line 137
    .line 138
    if-lt v7, v10, :cond_a

    .line 139
    .line 140
    :cond_9
    if-le v7, v8, :cond_a

    .line 141
    .line 142
    move v7, v2

    .line 143
    goto :goto_1

    .line 144
    :cond_a
    move v7, v4

    .line 145
    :goto_1
    iget v8, v3, Landroid/graphics/Rect;->top:I

    .line 146
    .line 147
    iget v9, v5, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    if-lt v8, v9, :cond_b

    .line 150
    .line 151
    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    .line 152
    .line 153
    if-gt v10, v9, :cond_c

    .line 154
    .line 155
    :cond_b
    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    .line 156
    .line 157
    iget v11, v5, Landroid/graphics/Rect;->bottom:I

    .line 158
    .line 159
    if-ge v10, v11, :cond_c

    .line 160
    .line 161
    move v4, v6

    .line 162
    goto :goto_2

    .line 163
    :cond_c
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 164
    .line 165
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 166
    .line 167
    if-gt v3, v5, :cond_d

    .line 168
    .line 169
    if-lt v8, v5, :cond_e

    .line 170
    .line 171
    :cond_d
    if-le v8, v9, :cond_e

    .line 172
    .line 173
    move v4, v2

    .line 174
    :cond_e
    :goto_2
    if-eq p2, v6, :cond_14

    .line 175
    .line 176
    const/4 v2, 0x2

    .line 177
    if-eq p2, v2, :cond_13

    .line 178
    .line 179
    const/16 v1, 0x11

    .line 180
    .line 181
    if-eq p2, v1, :cond_12

    .line 182
    .line 183
    const/16 v1, 0x21

    .line 184
    .line 185
    if-eq p2, v1, :cond_11

    .line 186
    .line 187
    const/16 v1, 0x42

    .line 188
    .line 189
    if-eq p2, v1, :cond_10

    .line 190
    .line 191
    const/16 v1, 0x82

    .line 192
    .line 193
    if-ne p2, v1, :cond_f

    .line 194
    .line 195
    if-lez v4, :cond_16

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 199
    .line 200
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v1, "Invalid direction: "

    .line 207
    .line 208
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :cond_10
    if-lez v7, :cond_16

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_11
    if-gez v4, :cond_16

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_12
    if-gez v7, :cond_16

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_13
    if-gtz v4, :cond_15

    .line 235
    .line 236
    if-nez v4, :cond_16

    .line 237
    .line 238
    mul-int/2addr v7, v1

    .line 239
    if-lez v7, :cond_16

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_14
    if-ltz v4, :cond_15

    .line 243
    .line 244
    if-nez v4, :cond_16

    .line 245
    .line 246
    mul-int/2addr v7, v1

    .line 247
    if-gez v7, :cond_16

    .line 248
    .line 249
    :cond_15
    :goto_3
    return-object v0

    .line 250
    :cond_16
    :goto_4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lzl1;->ξ()Lam1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "RecyclerView has no LayoutManager"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0, p1}, Lzl1;->ο(Landroid/content/Context;Landroid/util/AttributeSet;)Lam1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "RecyclerView has no LayoutManager"

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 29
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0, p1}, Lzl1;->π(Landroid/view/ViewGroup$LayoutParams;)Lam1;

    move-result-object p0

    return-object p0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RecyclerView has no LayoutManager"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-string p0, "androidx.recyclerview.widget.RecyclerView"

    .line 2
    .line 3
    return-object p0
.end method

.method public getAdapter()Ltl1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getBaseline()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getClipToPadding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 2
    .line 3
    return p0
.end method

.method public getCompatAccessibilityDelegate()Lpm1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->з:Lpm1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEdgeEffectFactory()Lwl1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemAnimator()Lxl1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemDecorationCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getLayoutManager()Lzl1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxFlingVelocity()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Χ:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinFlingVelocity()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Φ:I

    .line 2
    .line 3
    return p0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getOnFlingListener()Lbm1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->а:Z

    .line 2
    .line 3
    return p0
.end method

.method public getRecycledViewPool()Lem1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfm1;->α()Lem1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getScrollState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 2
    .line 3
    return p0
.end method

.method public final hasNestedScrollingParent()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lb31;->ζ(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final isAttachedToWindow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isLayoutSuppressed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Lb31;->δ:Z

    .line 6
    .line 7
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 9
    .line 10
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-boolean v1, v0, Lzl1;->ζ:Z

    .line 33
    .line 34
    :cond_1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 35
    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    sget-object v0, Ld90;->ι:Ljava/lang/ThreadLocal;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ld90;

    .line 45
    .line 46
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 47
    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    new-instance v1, Ld90;

    .line 51
    .line 52
    invoke-direct {v1}, Ld90;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 56
    .line 57
    sget-object v1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/high16 v2, 0x41f00000    # 30.0f

    .line 76
    .line 77
    cmpl-float v2, v1, v2

    .line 78
    .line 79
    if-ltz v2, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const/high16 v1, 0x42700000    # 60.0f

    .line 83
    .line 84
    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 85
    .line 86
    const v3, 0x4e6e6b28    # 1.0E9f

    .line 87
    .line 88
    .line 89
    div-float/2addr v3, v1

    .line 90
    float-to-long v3, v3

    .line 91
    iput-wide v3, v2, Ld90;->η:J

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 97
    .line 98
    iget-object v0, v0, Ld90;->ε:Ljava/util/ArrayList;

    .line 99
    .line 100
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 101
    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const-string p0, "RecyclerView already present in worker list!"

    .line 112
    .line 113
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_6
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lxl1;->α()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 16
    .line 17
    iget-object v2, v1, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lnm1;->η:Landroid/widget/OverScroller;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Lzl1;->ε:Lds0;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Lds0;->δ()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v0, v1, Lzl1;->ζ:Z

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Lzl1;->Ι(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->м:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->н:Ld1;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->κ:Lzz1;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object v1, Lj92;->α:Lv;

    .line 65
    .line 66
    iget-object v2, v1, Lv;->β:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, [Ljava/lang/Object;

    .line 69
    .line 70
    iget v3, v1, Lv;->α:I

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    if-lez v3, :cond_3

    .line 74
    .line 75
    add-int/lit8 v3, v3, -0x1

    .line 76
    .line 77
    aget-object v5, v2, v3

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    aput-object v4, v2, v3

    .line 83
    .line 84
    iget v2, v1, Lv;->α:I

    .line 85
    .line 86
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    iput v2, v1, Lv;->α:I

    .line 89
    .line 90
    move-object v4, v5

    .line 91
    :cond_3
    if-eqz v4, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 95
    .line 96
    iget-object v2, v1, Lfm1;->β:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-gtz v3, :cond_b

    .line 103
    .line 104
    invoke-virtual {v1, v0}, Lfm1;->β(Z)V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-ge v0, v1, :cond_7

    .line 112
    .line 113
    add-int/lit8 v1, v0, 0x1

    .line 114
    .line 115
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    invoke-static {v0}, Lv81;->ε(Landroid/view/View;)Lgi1;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, Lgi1;->α:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v0}, Lyh;->Λ(Ljava/util/List;)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    :goto_2
    const/4 v3, -0x1

    .line 132
    if-ge v3, v2, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Ld92;

    .line 139
    .line 140
    iget-object v3, v3, Ld92;->α:Landroidx/compose/ui/platform/AbstractComposeView;

    .line 141
    .line 142
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AbstractComposeView;->δ()V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v2, v2, -0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    move v0, v1

    .line 149
    goto :goto_1

    .line 150
    :cond_6
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 151
    .line 152
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_7
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 157
    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 161
    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    iget-object v0, v0, Ld90;->ε:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 171
    .line 172
    if-eqz v1, :cond_9

    .line 173
    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_8
    const-string p0, "RecyclerView removal failed!"

    .line 178
    .line 179
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_9
    :goto_3
    const/4 v0, 0x0

    .line 184
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 185
    .line 186
    :cond_a
    return-void

    .line 187
    :cond_b
    invoke-static {v0, v2}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    throw p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-ge v0, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lo00;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_9

    .line 17
    .line 18
    :cond_1
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    if-ne v1, v2, :cond_13

    .line 25
    .line 26
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getSource()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    and-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 36
    .line 37
    invoke-virtual {v1}, Lzl1;->δ()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const/16 v1, 0x9

    .line 44
    .line 45
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    neg-float v1, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v1, v2

    .line 52
    :goto_0
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 53
    .line 54
    invoke-virtual {v3}, Lzl1;->γ()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    const/16 v2, 0xa

    .line 61
    .line 62
    invoke-virtual {v6, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :cond_3
    move v3, v2

    .line 67
    move v8, v7

    .line 68
    move v9, v8

    .line 69
    move v2, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getSource()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/high16 v3, 0x400000

    .line 76
    .line 77
    and-int/2addr v1, v3

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    const/16 v1, 0x1a

    .line 81
    .line 82
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 87
    .line 88
    invoke-virtual {v4}, Lzl1;->δ()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    neg-float v3, v3

    .line 95
    move/from16 v16, v3

    .line 96
    .line 97
    move v3, v2

    .line 98
    move/from16 v2, v16

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 102
    .line 103
    invoke-virtual {v4}, Lzl1;->γ()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    move v3, v2

    .line 111
    :goto_1
    iget-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->о:Z

    .line 112
    .line 113
    move v8, v1

    .line 114
    move v9, v4

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    move v3, v2

    .line 117
    move v8, v7

    .line 118
    move v9, v8

    .line 119
    :goto_2
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ω:F

    .line 120
    .line 121
    mul-float/2addr v2, v1

    .line 122
    float-to-int v1, v2

    .line 123
    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ψ:F

    .line 124
    .line 125
    mul-float/2addr v3, v2

    .line 126
    float-to-int v2, v3

    .line 127
    const/4 v10, 0x1

    .line 128
    if-eqz v9, :cond_8

    .line 129
    .line 130
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 131
    .line 132
    iget-object v3, v3, Lnm1;->η:Landroid/widget/OverScroller;

    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalY()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    sub-int/2addr v4, v5

    .line 143
    add-int/2addr v4, v1

    .line 144
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalX()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    sub-int/2addr v1, v3

    .line 153
    add-int/2addr v1, v2

    .line 154
    invoke-virtual {v0, v1, v4, v10}, Landroidx/recyclerview/widget/RecyclerView;->Ζ(IIZ)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :cond_8
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 160
    .line 161
    if-nez v3, :cond_9

    .line 162
    .line 163
    const-string v1, "RecyclerView"

    .line 164
    .line 165
    const-string v2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 166
    .line 167
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    goto/16 :goto_8

    .line 171
    .line 172
    :cond_9
    iget-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 173
    .line 174
    if-eqz v4, :cond_a

    .line 175
    .line 176
    goto/16 :goto_8

    .line 177
    .line 178
    :cond_a
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 179
    .line 180
    aput v7, v11, v7

    .line 181
    .line 182
    aput v7, v11, v10

    .line 183
    .line 184
    invoke-virtual {v3}, Lzl1;->γ()Z

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 189
    .line 190
    invoke-virtual {v3}, Lzl1;->δ()Z

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-eqz v13, :cond_b

    .line 195
    .line 196
    or-int/lit8 v3, v12, 0x2

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_b
    move v3, v12

    .line 200
    :goto_3
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-virtual {v0, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->Α(IF)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    sub-int v14, v2, v4

    .line 213
    .line 214
    invoke-virtual {v0, v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->Β(IF)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    sub-int v15, v1, v2

    .line 219
    .line 220
    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const/4 v2, 0x1

    .line 225
    invoke-virtual {v1, v3, v2}, Lb31;->η(II)Z

    .line 226
    .line 227
    .line 228
    if-eqz v12, :cond_c

    .line 229
    .line 230
    move v1, v14

    .line 231
    goto :goto_4

    .line 232
    :cond_c
    move v1, v7

    .line 233
    :goto_4
    move v3, v2

    .line 234
    if-eqz v13, :cond_d

    .line 235
    .line 236
    move v2, v15

    .line 237
    goto :goto_5

    .line 238
    :cond_d
    move v2, v7

    .line 239
    :goto_5
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 240
    .line 241
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 242
    .line 243
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->η(III[I[I)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_e

    .line 248
    .line 249
    aget v1, v11, v7

    .line 250
    .line 251
    sub-int/2addr v14, v1

    .line 252
    aget v1, v11, v10

    .line 253
    .line 254
    sub-int/2addr v15, v1

    .line 255
    :cond_e
    if-eqz v12, :cond_f

    .line 256
    .line 257
    move v1, v14

    .line 258
    goto :goto_6

    .line 259
    :cond_f
    move v1, v7

    .line 260
    :goto_6
    if-eqz v13, :cond_10

    .line 261
    .line 262
    move v2, v15

    .line 263
    goto :goto_7

    .line 264
    :cond_10
    move v2, v7

    .line 265
    :goto_7
    invoke-virtual {v0, v1, v2, v6, v3}, Landroidx/recyclerview/widget/RecyclerView;->Δ(IILandroid/view/MotionEvent;I)Z

    .line 266
    .line 267
    .line 268
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 269
    .line 270
    if-eqz v1, :cond_12

    .line 271
    .line 272
    if-nez v14, :cond_11

    .line 273
    .line 274
    if-eqz v15, :cond_12

    .line 275
    .line 276
    :cond_11
    invoke-virtual {v1, v0, v14, v15}, Ld90;->α(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 277
    .line 278
    .line 279
    :cond_12
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 280
    .line 281
    .line 282
    :goto_8
    if-eqz v8, :cond_13

    .line 283
    .line 284
    if-nez v9, :cond_13

    .line 285
    .line 286
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->п:Ldt;

    .line 287
    .line 288
    invoke-virtual {v0, v6, v8}, Ldt;->α(Landroid/view/MotionEvent;I)V

    .line 289
    .line 290
    .line 291
    :cond_13
    :goto_9
    return v7
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ο(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 32
    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_3
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 46
    .line 47
    invoke-virtual {v3}, Lzl1;->δ()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 52
    .line 53
    if-nez v4, :cond_4

    .line 54
    .line 55
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 60
    .line 61
    :cond_4
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 62
    .line 63
    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/4 v6, 0x2

    .line 75
    const/high16 v7, 0x3f000000    # 0.5f

    .line 76
    .line 77
    if-eqz v4, :cond_e

    .line 78
    .line 79
    if-eq v4, v2, :cond_d

    .line 80
    .line 81
    if-eq v4, v6, :cond_9

    .line 82
    .line 83
    const/4 v0, 0x3

    .line 84
    if-eq v4, v0, :cond_7

    .line 85
    .line 86
    const/4 v0, 0x5

    .line 87
    if-eq v4, v0, :cond_6

    .line 88
    .line 89
    const/4 v0, 0x6

    .line 90
    if-eq v4, v0, :cond_5

    .line 91
    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ψ(Landroid/view/MotionEvent;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_2

    .line 98
    .line 99
    :cond_6
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 104
    .line 105
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    add-float/2addr v0, v7

    .line 110
    float-to-int v0, v0

    .line 111
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 112
    .line 113
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 114
    .line 115
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    add-float/2addr p1, v7

    .line 120
    float-to-int p1, p1

    .line 121
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 122
    .line 123
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_7
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 132
    .line 133
    .line 134
    :cond_8
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :cond_9
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 146
    .line 147
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-gez v4, :cond_a

    .line 152
    .line 153
    new-instance p1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v0, "Error processing scroll; pointer index for id "

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p0, " not found. Did any MotionEvents get skipped?"

    .line 166
    .line 167
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    const-string p1, "RecyclerView"

    .line 175
    .line 176
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    return v1

    .line 180
    :cond_a
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    add-float/2addr v5, v7

    .line 185
    float-to-int v5, v5

    .line 186
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    add-float/2addr p1, v7

    .line 191
    float-to-int p1, p1

    .line 192
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 193
    .line 194
    if-eq v4, v2, :cond_16

    .line 195
    .line 196
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 197
    .line 198
    sub-int v4, v5, v4

    .line 199
    .line 200
    iget v6, p0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 201
    .line 202
    sub-int v6, p1, v6

    .line 203
    .line 204
    if-eqz v0, :cond_b

    .line 205
    .line 206
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 211
    .line 212
    if-le v0, v4, :cond_b

    .line 213
    .line 214
    iput v5, p0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 215
    .line 216
    move v0, v2

    .line 217
    goto :goto_0

    .line 218
    :cond_b
    move v0, v1

    .line 219
    :goto_0
    if-eqz v3, :cond_c

    .line 220
    .line 221
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 226
    .line 227
    if-le v3, v4, :cond_c

    .line 228
    .line 229
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 230
    .line 231
    move v0, v2

    .line 232
    :cond_c
    if-eqz v0, :cond_16

    .line 233
    .line 234
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_d
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 240
    .line 241
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_e
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ω:Z

    .line 250
    .line 251
    if-eqz v0, :cond_f

    .line 252
    .line 253
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ω:Z

    .line 254
    .line 255
    :cond_f
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    add-float/2addr v0, v7

    .line 266
    float-to-int v0, v0

    .line 267
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 268
    .line 269
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    add-float/2addr v0, v7

    .line 276
    float-to-int v0, v0

    .line 277
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 278
    .line 279
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 280
    .line 281
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 282
    .line 283
    const/high16 v3, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/4 v4, -0x1

    .line 286
    const/4 v5, 0x0

    .line 287
    if-eqz v0, :cond_10

    .line 288
    .line 289
    invoke-static {v0}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    cmpl-float v0, v0, v5

    .line 294
    .line 295
    if-eqz v0, :cond_10

    .line 296
    .line 297
    invoke-virtual {p0, v4}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_10

    .line 302
    .line 303
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    int-to-float v8, v8

    .line 314
    div-float/2addr v7, v8

    .line 315
    sub-float v7, v3, v7

    .line 316
    .line 317
    invoke-static {v0, v5, v7}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 318
    .line 319
    .line 320
    move v0, v2

    .line 321
    goto :goto_1

    .line 322
    :cond_10
    move v0, v1

    .line 323
    :goto_1
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 324
    .line 325
    if-eqz v7, :cond_11

    .line 326
    .line 327
    invoke-static {v7}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    cmpl-float v7, v7, v5

    .line 332
    .line 333
    if-eqz v7, :cond_11

    .line 334
    .line 335
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-nez v7, :cond_11

    .line 340
    .line 341
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 342
    .line 343
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    int-to-float v8, v8

    .line 352
    div-float/2addr v7, v8

    .line 353
    invoke-static {v0, v5, v7}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 354
    .line 355
    .line 356
    move v0, v2

    .line 357
    :cond_11
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 358
    .line 359
    if-eqz v7, :cond_12

    .line 360
    .line 361
    invoke-static {v7}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    cmpl-float v7, v7, v5

    .line 366
    .line 367
    if-eqz v7, :cond_12

    .line 368
    .line 369
    invoke-virtual {p0, v4}, Landroid/view/View;->canScrollVertically(I)Z

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    if-nez v4, :cond_12

    .line 374
    .line 375
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 376
    .line 377
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    int-to-float v7, v7

    .line 386
    div-float/2addr v4, v7

    .line 387
    invoke-static {v0, v5, v4}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 388
    .line 389
    .line 390
    move v0, v2

    .line 391
    :cond_12
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 392
    .line 393
    if-eqz v4, :cond_13

    .line 394
    .line 395
    invoke-static {v4}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    cmpl-float v4, v4, v5

    .line 400
    .line 401
    if-eqz v4, :cond_13

    .line 402
    .line 403
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-nez v4, :cond_13

    .line 408
    .line 409
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 410
    .line 411
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    int-to-float v4, v4

    .line 420
    div-float/2addr p1, v4

    .line 421
    sub-float/2addr v3, p1

    .line 422
    invoke-static {v0, v5, v3}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 423
    .line 424
    .line 425
    move v0, v2

    .line 426
    :cond_13
    if-nez v0, :cond_14

    .line 427
    .line 428
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 429
    .line 430
    if-ne p1, v6, :cond_15

    .line 431
    .line 432
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 443
    .line 444
    .line 445
    :cond_15
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->к:[I

    .line 446
    .line 447
    aput v1, p1, v2

    .line 448
    .line 449
    aput v1, p1, v1

    .line 450
    .line 451
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Θ(I)V

    .line 452
    .line 453
    .line 454
    :cond_16
    :goto_2
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 455
    .line 456
    if-ne p0, v2, :cond_17

    .line 457
    .line 458
    return v2

    .line 459
    :cond_17
    :goto_3
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    const-string p1, "RV OnLayout"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "RecyclerView"

    .line 7
    .line 8
    const-string p2, "No adapter attached; skipping layout"

    .line 9
    .line 10
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 18
    .line 19
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->ζ(II)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lzl1;->Δ()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 22
    .line 23
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->ζ(II)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->υ:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 34
    .line 35
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->ζ(II)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 42
    .line 43
    iget-boolean v1, v0, Lkm1;->ζ:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->Η()V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 66
    .line 67
    iget-object v1, v1, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->ζ(II)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->Ι(Z)V

    .line 74
    .line 75
    .line 76
    iput-boolean p1, v0, Lkm1;->δ:Z

    .line 77
    .line 78
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lhm1;

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
    check-cast p1, Lhm1;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->η:Lhm1;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/customview/view/α;->ε:Landroid/os/Parcelable;

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lhm1;

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
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->η:Lhm1;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object p0, v1, Lhm1;->η:Landroid/os/Parcelable;

    .line 15
    .line 16
    iput-object p0, v0, Lhm1;->η:Landroid/os/Parcelable;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lzl1;->Μ()Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iput-object p0, v0, Lhm1;->η:Landroid/os/Parcelable;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    iput-object p0, v0, Lhm1;->η:Landroid/os/Parcelable;

    .line 32
    .line 33
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p3, :cond_1

    .line 5
    .line 6
    if-eq p2, p4, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void

    .line 10
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 18
    .line 19
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-nez v1, :cond_31

    .line 9
    .line 10
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ω:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_f

    .line 15
    .line 16
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    const/4 v3, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v8, 0x1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    move v1, v7

    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_1
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->ο(Landroid/view/MotionEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_2
    iget v5, v1, Lo00;->α:I

    .line 40
    .line 41
    iget v9, v1, Lo00;->ρ:I

    .line 42
    .line 43
    if-nez v9, :cond_3

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_3
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-nez v9, :cond_7

    .line 52
    .line 53
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    invoke-virtual {v1, v5, v9}, Lo00;->β(FF)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    invoke-virtual {v1, v9, v10}, Lo00;->α(FF)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    if-eqz v9, :cond_e

    .line 80
    .line 81
    :cond_4
    if-eqz v9, :cond_5

    .line 82
    .line 83
    iput v8, v1, Lo00;->σ:I

    .line 84
    .line 85
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    float-to-int v5, v5

    .line 90
    int-to-float v5, v5

    .line 91
    iput v5, v1, Lo00;->λ:F

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    if-eqz v5, :cond_6

    .line 95
    .line 96
    iput v3, v1, Lo00;->σ:I

    .line 97
    .line 98
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    float-to-int v5, v5

    .line 103
    int-to-float v5, v5

    .line 104
    iput v5, v1, Lo00;->κ:F

    .line 105
    .line 106
    :cond_6
    :goto_0
    invoke-virtual {v1, v3}, Lo00;->δ(I)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :cond_7
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-ne v9, v8, :cond_8

    .line 116
    .line 117
    iget v9, v1, Lo00;->ρ:I

    .line 118
    .line 119
    if-ne v9, v3, :cond_8

    .line 120
    .line 121
    iput v4, v1, Lo00;->κ:F

    .line 122
    .line 123
    iput v4, v1, Lo00;->λ:F

    .line 124
    .line 125
    invoke-virtual {v1, v8}, Lo00;->δ(I)V

    .line 126
    .line 127
    .line 128
    iput v7, v1, Lo00;->σ:I

    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_8
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-ne v9, v3, :cond_e

    .line 137
    .line 138
    iget v9, v1, Lo00;->ρ:I

    .line 139
    .line 140
    if-ne v9, v3, :cond_e

    .line 141
    .line 142
    invoke-virtual {v1}, Lo00;->ε()V

    .line 143
    .line 144
    .line 145
    iget v9, v1, Lo00;->σ:I

    .line 146
    .line 147
    const/high16 v10, 0x40000000    # 2.0f

    .line 148
    .line 149
    if-ne v9, v8, :cond_b

    .line 150
    .line 151
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    iget-object v13, v1, Lo00;->υ:[I

    .line 156
    .line 157
    aput v5, v13, v7

    .line 158
    .line 159
    iget v11, v1, Lo00;->μ:I

    .line 160
    .line 161
    sub-int/2addr v11, v5

    .line 162
    aput v11, v13, v8

    .line 163
    .line 164
    int-to-float v12, v5

    .line 165
    int-to-float v11, v11

    .line 166
    invoke-static {v11, v9}, Ljava/lang/Math;->min(FF)F

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    invoke-static {v12, v9}, Ljava/lang/Math;->max(FF)F

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    int-to-float v9, v7

    .line 175
    sub-float/2addr v9, v12

    .line 176
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    cmpg-float v9, v9, v10

    .line 181
    .line 182
    if-gez v9, :cond_9

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_9
    iget v11, v1, Lo00;->λ:F

    .line 186
    .line 187
    iget-object v9, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    iget-object v9, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 194
    .line 195
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 196
    .line 197
    .line 198
    const/4 v15, 0x0

    .line 199
    iget v9, v1, Lo00;->μ:I

    .line 200
    .line 201
    move/from16 v16, v9

    .line 202
    .line 203
    invoke-static/range {v11 .. v16}, Lo00;->γ(FF[IIII)I

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_a

    .line 208
    .line 209
    iget-object v11, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 210
    .line 211
    invoke-virtual {v11, v9, v7}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 212
    .line 213
    .line 214
    :cond_a
    iput v12, v1, Lo00;->λ:F

    .line 215
    .line 216
    :cond_b
    :goto_1
    iget v9, v1, Lo00;->σ:I

    .line 217
    .line 218
    if-ne v9, v3, :cond_e

    .line 219
    .line 220
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    iget-object v13, v1, Lo00;->τ:[I

    .line 225
    .line 226
    aput v5, v13, v7

    .line 227
    .line 228
    iget v11, v1, Lo00;->ν:I

    .line 229
    .line 230
    sub-int/2addr v11, v5

    .line 231
    aput v11, v13, v8

    .line 232
    .line 233
    int-to-float v5, v5

    .line 234
    int-to-float v11, v11

    .line 235
    invoke-static {v11, v9}, Ljava/lang/Math;->min(FF)F

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    invoke-static {v5, v9}, Ljava/lang/Math;->max(FF)F

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    int-to-float v5, v7

    .line 244
    sub-float/2addr v5, v12

    .line 245
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    cmpg-float v5, v5, v10

    .line 250
    .line 251
    if-gez v5, :cond_c

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_c
    iget v11, v1, Lo00;->κ:F

    .line 255
    .line 256
    iget-object v5, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 257
    .line 258
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 259
    .line 260
    .line 261
    move-result v14

    .line 262
    iget-object v5, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 263
    .line 264
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 265
    .line 266
    .line 267
    const/4 v15, 0x0

    .line 268
    iget v5, v1, Lo00;->ν:I

    .line 269
    .line 270
    move/from16 v16, v5

    .line 271
    .line 272
    invoke-static/range {v11 .. v16}, Lo00;->γ(FF[IIII)I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    if-eqz v5, :cond_d

    .line 277
    .line 278
    iget-object v9, v1, Lo00;->ξ:Landroidx/recyclerview/widget/RecyclerView;

    .line 279
    .line 280
    invoke-virtual {v9, v7, v5}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 281
    .line 282
    .line 283
    :cond_d
    iput v12, v1, Lo00;->κ:F

    .line 284
    .line 285
    :cond_e
    :goto_2
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eq v1, v2, :cond_f

    .line 290
    .line 291
    if-ne v1, v8, :cond_10

    .line 292
    .line 293
    :cond_f
    const/4 v1, 0x0

    .line 294
    iput-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 295
    .line 296
    :cond_10
    move v1, v8

    .line 297
    :goto_3
    if-eqz v1, :cond_12

    .line 298
    .line 299
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 300
    .line 301
    if-eqz v1, :cond_11

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    .line 304
    .line 305
    .line 306
    :cond_11
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 313
    .line 314
    .line 315
    return v8

    .line 316
    :cond_12
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 317
    .line 318
    if-nez v1, :cond_13

    .line 319
    .line 320
    goto/16 :goto_f

    .line 321
    .line 322
    :cond_13
    invoke-virtual {v1}, Lzl1;->γ()Z

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 327
    .line 328
    invoke-virtual {v1}, Lzl1;->δ()Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 333
    .line 334
    if-nez v1, :cond_14

    .line 335
    .line 336
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 341
    .line 342
    :cond_14
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView;->к:[I

    .line 351
    .line 352
    if-nez v1, :cond_15

    .line 353
    .line 354
    aput v7, v11, v8

    .line 355
    .line 356
    aput v7, v11, v7

    .line 357
    .line 358
    :cond_15
    invoke-static {v6}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    aget v13, v11, v7

    .line 363
    .line 364
    int-to-float v13, v13

    .line 365
    aget v14, v11, v8

    .line 366
    .line 367
    int-to-float v14, v14

    .line 368
    invoke-virtual {v12, v13, v14}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 369
    .line 370
    .line 371
    const/high16 v13, 0x3f000000    # 0.5f

    .line 372
    .line 373
    if-eqz v1, :cond_2f

    .line 374
    .line 375
    if-eq v1, v8, :cond_28

    .line 376
    .line 377
    if-eq v1, v3, :cond_1a

    .line 378
    .line 379
    if-eq v1, v2, :cond_18

    .line 380
    .line 381
    const/4 v2, 0x5

    .line 382
    if-eq v1, v2, :cond_17

    .line 383
    .line 384
    const/4 v2, 0x6

    .line 385
    if-eq v1, v2, :cond_16

    .line 386
    .line 387
    goto/16 :goto_d

    .line 388
    .line 389
    :cond_16
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->ψ(Landroid/view/MotionEvent;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_d

    .line 393
    .line 394
    :cond_17
    invoke-virtual {v6, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 399
    .line 400
    invoke-virtual {v6, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    add-float/2addr v1, v13

    .line 405
    float-to-int v1, v1

    .line 406
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 407
    .line 408
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 409
    .line 410
    invoke-virtual {v6, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    add-float/2addr v1, v13

    .line 415
    float-to-int v1, v1

    .line 416
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 417
    .line 418
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 419
    .line 420
    goto/16 :goto_d

    .line 421
    .line 422
    :cond_18
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 423
    .line 424
    if-eqz v1, :cond_19

    .line 425
    .line 426
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    .line 427
    .line 428
    .line 429
    :cond_19
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_d

    .line 439
    .line 440
    :cond_1a
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 441
    .line 442
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-gez v1, :cond_1b

    .line 447
    .line 448
    new-instance v1, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v2, "Error processing scroll; pointer index for id "

    .line 451
    .line 452
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 456
    .line 457
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    const-string v0, " not found. Did any MotionEvents get skipped?"

    .line 461
    .line 462
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    const-string v1, "RecyclerView"

    .line 470
    .line 471
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 472
    .line 473
    .line 474
    return v7

    .line 475
    :cond_1b
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    add-float/2addr v2, v13

    .line 480
    float-to-int v14, v2

    .line 481
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    add-float/2addr v1, v13

    .line 486
    float-to-int v13, v1

    .line 487
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 488
    .line 489
    sub-int/2addr v1, v14

    .line 490
    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 491
    .line 492
    sub-int/2addr v2, v13

    .line 493
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 494
    .line 495
    if-eq v3, v8, :cond_20

    .line 496
    .line 497
    if-eqz v9, :cond_1d

    .line 498
    .line 499
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 500
    .line 501
    if-lez v1, :cond_1c

    .line 502
    .line 503
    sub-int/2addr v1, v3

    .line 504
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    goto :goto_4

    .line 509
    :cond_1c
    add-int/2addr v1, v3

    .line 510
    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    :goto_4
    if-eqz v1, :cond_1d

    .line 515
    .line 516
    move v3, v8

    .line 517
    goto :goto_5

    .line 518
    :cond_1d
    move v3, v7

    .line 519
    :goto_5
    if-eqz v10, :cond_1f

    .line 520
    .line 521
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 522
    .line 523
    if-lez v2, :cond_1e

    .line 524
    .line 525
    sub-int/2addr v2, v4

    .line 526
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    goto :goto_6

    .line 531
    :cond_1e
    add-int/2addr v2, v4

    .line 532
    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    :goto_6
    if-eqz v2, :cond_1f

    .line 537
    .line 538
    move v3, v8

    .line 539
    :cond_1f
    if-eqz v3, :cond_20

    .line 540
    .line 541
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 542
    .line 543
    .line 544
    :cond_20
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 545
    .line 546
    if-ne v3, v8, :cond_30

    .line 547
    .line 548
    iget-object v15, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 549
    .line 550
    aput v7, v15, v7

    .line 551
    .line 552
    aput v7, v15, v8

    .line 553
    .line 554
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    invoke-virtual {v0, v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->Α(IF)I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    sub-int v16, v1, v3

    .line 563
    .line 564
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    invoke-virtual {v0, v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->Β(IF)I

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    sub-int v17, v2, v1

    .line 573
    .line 574
    if-eqz v9, :cond_21

    .line 575
    .line 576
    move/from16 v1, v16

    .line 577
    .line 578
    goto :goto_7

    .line 579
    :cond_21
    move v1, v7

    .line 580
    :goto_7
    if-eqz v10, :cond_22

    .line 581
    .line 582
    move/from16 v2, v17

    .line 583
    .line 584
    goto :goto_8

    .line 585
    :cond_22
    move v2, v7

    .line 586
    :goto_8
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 587
    .line 588
    const/4 v3, 0x0

    .line 589
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 590
    .line 591
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->η(III[I[I)Z

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 596
    .line 597
    if-eqz v1, :cond_23

    .line 598
    .line 599
    aget v1, v15, v7

    .line 600
    .line 601
    sub-int v16, v16, v1

    .line 602
    .line 603
    aget v1, v15, v8

    .line 604
    .line 605
    sub-int v17, v17, v1

    .line 606
    .line 607
    aget v1, v11, v7

    .line 608
    .line 609
    aget v3, v2, v7

    .line 610
    .line 611
    add-int/2addr v1, v3

    .line 612
    aput v1, v11, v7

    .line 613
    .line 614
    aget v1, v11, v8

    .line 615
    .line 616
    aget v3, v2, v8

    .line 617
    .line 618
    add-int/2addr v1, v3

    .line 619
    aput v1, v11, v8

    .line 620
    .line 621
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-interface {v1, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 626
    .line 627
    .line 628
    :cond_23
    move/from16 v1, v16

    .line 629
    .line 630
    move/from16 v3, v17

    .line 631
    .line 632
    aget v4, v2, v7

    .line 633
    .line 634
    sub-int/2addr v14, v4

    .line 635
    iput v14, v0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 636
    .line 637
    aget v2, v2, v8

    .line 638
    .line 639
    sub-int/2addr v13, v2

    .line 640
    iput v13, v0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 641
    .line 642
    if-eqz v9, :cond_24

    .line 643
    .line 644
    move v2, v1

    .line 645
    goto :goto_9

    .line 646
    :cond_24
    move v2, v7

    .line 647
    :goto_9
    if-eqz v10, :cond_25

    .line 648
    .line 649
    move v4, v3

    .line 650
    goto :goto_a

    .line 651
    :cond_25
    move v4, v7

    .line 652
    :goto_a
    invoke-virtual {v0, v2, v4, v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->Δ(IILandroid/view/MotionEvent;I)Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-eqz v2, :cond_26

    .line 657
    .line 658
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-interface {v2, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 663
    .line 664
    .line 665
    :cond_26
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->в:Ld90;

    .line 666
    .line 667
    if-eqz v2, :cond_30

    .line 668
    .line 669
    if-nez v1, :cond_27

    .line 670
    .line 671
    if-eqz v3, :cond_30

    .line 672
    .line 673
    :cond_27
    invoke-virtual {v2, v0, v1, v3}, Ld90;->α(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 674
    .line 675
    .line 676
    goto :goto_d

    .line 677
    :cond_28
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 678
    .line 679
    invoke-virtual {v1, v12}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 680
    .line 681
    .line 682
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 683
    .line 684
    const/16 v2, 0x3e8

    .line 685
    .line 686
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->Χ:I

    .line 687
    .line 688
    int-to-float v5, v3

    .line 689
    invoke-virtual {v1, v2, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 690
    .line 691
    .line 692
    if-eqz v9, :cond_29

    .line 693
    .line 694
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 695
    .line 696
    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 697
    .line 698
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    neg-float v1, v1

    .line 703
    goto :goto_b

    .line 704
    :cond_29
    move v1, v4

    .line 705
    :goto_b
    if-eqz v10, :cond_2a

    .line 706
    .line 707
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 708
    .line 709
    iget v5, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 710
    .line 711
    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    neg-float v2, v2

    .line 716
    goto :goto_c

    .line 717
    :cond_2a
    move v2, v4

    .line 718
    :goto_c
    cmpl-float v5, v1, v4

    .line 719
    .line 720
    if-nez v5, :cond_2b

    .line 721
    .line 722
    cmpl-float v4, v2, v4

    .line 723
    .line 724
    if-eqz v4, :cond_2c

    .line 725
    .line 726
    :cond_2b
    float-to-int v1, v1

    .line 727
    float-to-int v2, v2

    .line 728
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->Φ:I

    .line 729
    .line 730
    invoke-virtual {v0, v1, v2, v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->π(IIII)Z

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    if-nez v1, :cond_2d

    .line 735
    .line 736
    :cond_2c
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 737
    .line 738
    .line 739
    :cond_2d
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 740
    .line 741
    if-eqz v1, :cond_2e

    .line 742
    .line 743
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    .line 744
    .line 745
    .line 746
    :cond_2e
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->Κ(I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 750
    .line 751
    .line 752
    goto :goto_e

    .line 753
    :cond_2f
    invoke-virtual {v6, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 758
    .line 759
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    add-float/2addr v1, v13

    .line 764
    float-to-int v1, v1

    .line 765
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 766
    .line 767
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 768
    .line 769
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    add-float/2addr v1, v13

    .line 774
    float-to-int v1, v1

    .line 775
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 776
    .line 777
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 778
    .line 779
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->Θ(I)V

    .line 780
    .line 781
    .line 782
    :cond_30
    :goto_d
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->Ο:Landroid/view/VelocityTracker;

    .line 783
    .line 784
    invoke-virtual {v0, v12}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 785
    .line 786
    .line 787
    :goto_e
    invoke-virtual {v12}, Landroid/view/MotionEvent;->recycle()V

    .line 788
    .line 789
    .line 790
    return v8

    .line 791
    :cond_31
    :goto_f
    return v7
.end method

.method public final removeDetachedView(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "No ViewHolder found for child: "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p2
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    iget-object v0, v0, Lzl1;->ε:Lds0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lds0;->ε:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->Γ(Landroid/view/View;Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Lzl1;->Ρ(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ρ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lo00;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final scrollBy(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "RecyclerView"

    .line 6
    .line 7
    const-string p1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 23
    .line 24
    invoke-virtual {v1}, Lzl1;->δ()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    return-void

    .line 34
    :cond_3
    :goto_1
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    move p1, v2

    .line 39
    :goto_2
    if-eqz v1, :cond_5

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_5
    move p2, v2

    .line 43
    :goto_3
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p1, p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Δ(IILandroid/view/MotionEvent;I)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final scrollTo(II)V
    .locals 0

    .line 1
    const-string p0, "RecyclerView"

    .line 2
    .line 3
    const-string p1, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"

    .line 4
    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v0, p1

    .line 18
    :goto_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Α:I

    .line 19
    .line 20
    or-int/2addr p1, v0

    .line 21
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Α:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setAccessibilityDelegateCompat(Lpm1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->з:Lpm1;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lb92;->ζ(Landroid/view/View;Landroidx/core/view/α;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdapter(Ltl1;)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lxl1;->α()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lzl1;->Ο()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lzl1;->Π(Lfm1;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, v1, Lfm1;->α:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lfm1;->γ()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 35
    .line 36
    iget-object v2, v0, Lm6;->η:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Lm6;->Ο(Ljava/util/ArrayList;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, Lm6;->θ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lm6;->Ο(Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lzl1;->Θ()V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object v0, v1, Lfm1;->α:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lfm1;->γ()V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-virtual {v1, v0}, Lfm1;->β(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lfm1;->α()Lem1;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget v3, v2, Lem1;->β:I

    .line 74
    .line 75
    if-nez v3, :cond_4

    .line 76
    .line 77
    iget-object v2, v2, Lem1;->α:Landroid/util/SparseArray;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-gtz v3, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Ldm1;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0

    .line 97
    :cond_4
    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 98
    .line 99
    iput-boolean v0, v2, Lkm1;->γ:Z

    .line 100
    .line 101
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Δ:Z

    .line 102
    .line 103
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Δ:Z

    .line 104
    .line 105
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Γ:Z

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 108
    .line 109
    invoke-virtual {v0}, Lm6;->Θ()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    move v2, p1

    .line 114
    :goto_1
    if-ge v2, v0, :cond_5

    .line 115
    .line 116
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Lm6;->Η(I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->υ()V

    .line 129
    .line 130
    .line 131
    iget-object v0, v1, Lfm1;->β:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :goto_2
    if-ge p1, v2, :cond_7

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez v3, :cond_6

    .line 144
    .line 145
    add-int/lit8 p1, p1, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    invoke-static {}, Lγ;->β()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_7
    invoke-virtual {v1}, Lfm1;->γ()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public setChildDrawingOrderCallback(Lvl1;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(Lwl1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->υ:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemAnimator(Lxl1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lxl1;->α()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lxl1;->α:Lrk0;

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ж:Lrk0;

    .line 18
    .line 19
    iput-object p0, p1, Lxl1;->α:Lrk0;

    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 2
    .line 3
    iput p1, p0, Lfm1;->γ:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lfm1;->ζ()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setLayoutManager(Lzl1;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 11
    .line 12
    iget-object v2, v1, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Lnm1;->η:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lzl1;->ε:Lds0;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lds0;->δ()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Μ:Lxl1;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Lxl1;->α()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 47
    .line 48
    invoke-virtual {v1}, Lzl1;->Ο()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lzl1;->Π(Lfm1;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v2, Lfm1;->α:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lfm1;->γ()V

    .line 62
    .line 63
    .line 64
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 69
    .line 70
    iput-boolean v0, v1, Lzl1;->ζ:Z

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Lzl1;->Ι(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual {v1, v3}, Lzl1;->Χ(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 79
    .line 80
    .line 81
    iput-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    iget-object v1, v2, Lfm1;->α:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lfm1;->γ()V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 93
    .line 94
    iget-object v3, v1, Lm6;->η:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lrf;

    .line 97
    .line 98
    invoke-virtual {v3}, Lrf;->δ()V

    .line 99
    .line 100
    .line 101
    iget-object v3, v1, Lm6;->θ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    const/4 v5, 0x1

    .line 110
    sub-int/2addr v4, v5

    .line 111
    :goto_1
    iget-object v6, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Lsl1;

    .line 114
    .line 115
    if-ltz v4, :cond_5

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Landroid/view/View;

    .line 122
    .line 123
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    add-int/lit8 v4, v4, -0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    iget-object v1, v6, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    :goto_2
    if-ge v0, v3, :cond_6

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v0, v0, 0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 157
    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    iget-object v0, p1, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 161
    .line 162
    if-nez v0, :cond_7

    .line 163
    .line 164
    invoke-virtual {p1, p0}, Lzl1;->Χ(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 165
    .line 166
    .line 167
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 168
    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 172
    .line 173
    iput-boolean v5, p1, Lzl1;->ζ:Z

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v1, "LayoutManager "

    .line 181
    .line 182
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object p1, p1, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v1, " is already attached to a RecyclerView:"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0

    .line 210
    :cond_8
    :goto_3
    invoke-virtual {v2}, Lfm1;->ζ()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"

    .line 9
    .line 10
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean v0, p0, Lb31;->δ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lb31;->γ:Landroid/view/ViewGroup;

    .line 10
    .line 11
    sget-object v1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-static {v0}, Lu82;->ι(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, p0, Lb31;->δ:Z

    .line 17
    .line 18
    return-void
.end method

.method public setOnFlingListener(Lbm1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnScrollListener(Lcm1;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->а:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRecycledViewPool(Lem1;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 2
    .line 3
    iget-object v0, p0, Lfm1;->ζ:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lfm1;->β(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lfm1;->ε:Lem1;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v2, v1, Lem1;->β:I

    .line 14
    .line 15
    add-int/lit8 v2, v2, -0x1

    .line 16
    .line 17
    iput v2, v1, Lem1;->β:I

    .line 18
    .line 19
    :cond_0
    iput-object p1, p0, Lfm1;->ε:Lem1;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setRecyclerListener(Lgm1;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setScrollState(I)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->с:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "setting scroll state to "

    .line 11
    .line 12
    const-string v1, " from "

    .line 13
    .line 14
    invoke-static {p1, v0, v1}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/Exception;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "RecyclerView"

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :cond_1
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ν:I

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq p1, v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 43
    .line 44
    iget-object v1, v0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, Lzl1;->ε:Lds0;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lds0;->δ()V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lzl1;->Ν(I)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/lit8 p1, p1, -0x1

    .line 81
    .line 82
    :goto_0
    if-ltz p1, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->е:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lcm1;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    add-int/lit8 p1, p1, -0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    :goto_1
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "setScrollingTouchSlop(): bad argument constant "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "; using default value"

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "RecyclerView"

    .line 34
    .line 35
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Υ:I

    .line 51
    .line 52
    return-void
.end method

.method public setViewCacheExtension(Lmm1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lb31;->η(II)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final stopNestedScroll()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lb31;->θ(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final suppressLayout(Z)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const-string v0, "Do not suppressLayout in layout or scroll"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->β(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v5, 0x3

    .line 23
    const/4 v6, 0x0

    .line 24
    move-wide v3, v1

    .line 25
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ω:Z

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 41
    .line 42
    iget-object v0, p1, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Lnm1;->η:Landroid/widget/OverScroller;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    iget-object p0, p0, Lzl1;->ε:Lds0;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, Lds0;->δ()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final Α(IF)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    div-float/2addr p2, v0

    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {v0}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    neg-float p1, p1

    .line 41
    const/high16 v0, 0x3f800000    # 1.0f

    .line 42
    .line 43
    sub-float/2addr v0, p2

    .line 44
    invoke-static {v2, p1, v0}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    neg-float p1, p1

    .line 49
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 50
    .line 51
    invoke-static {p2}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    cmpl-float p2, p2, v1

    .line 56
    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 62
    .line 63
    .line 64
    :cond_1
    move v1, p1

    .line 65
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-static {v0}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    cmpl-float v0, v0, v1

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-static {v2, p1, p2}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 99
    .line 100
    invoke-static {p2}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    cmpl-float p2, p2, v1

    .line 105
    .line 106
    if-nez p2, :cond_4

    .line 107
    .line 108
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 111
    .line 112
    .line 113
    :cond_4
    move v1, p1

    .line 114
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    int-to-float p0, p0

    .line 122
    mul-float/2addr v1, p0

    .line 123
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    return p0
.end method

.method public final Β(IF)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    div-float/2addr p2, v0

    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {v0}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    neg-float p1, p1

    .line 41
    invoke-static {v2, p1, p2}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    neg-float p1, p1

    .line 46
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 47
    .line 48
    invoke-static {p2}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    cmpl-float p2, p2, v1

    .line 53
    .line 54
    if-nez p2, :cond_1

    .line 55
    .line 56
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 59
    .line 60
    .line 61
    :cond_1
    move v1, p1

    .line 62
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-static {v0}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    cmpl-float v0, v0, v1

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 92
    .line 93
    sub-float/2addr v0, p2

    .line 94
    invoke-static {v2, p1, v0}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 99
    .line 100
    invoke-static {p2}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    cmpl-float p2, p2, v1

    .line 105
    .line 106
    if-nez p2, :cond_4

    .line 107
    .line 108
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 111
    .line 112
    .line 113
    :cond_4
    move v1, p1

    .line 114
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    int-to-float p0, p0

    .line 122
    mul-float/2addr v1, p0

    .line 123
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    return p0
.end method

.method public final Γ(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->μ:Landroid/graphics/Rect;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lam1;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lam1;

    .line 29
    .line 30
    iget-boolean v1, v0, Lam1;->β:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lam1;->α:Landroid/graphics/Rect;

    .line 35
    .line 36
    iget v1, v3, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    iget v1, v3, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 46
    .line 47
    add-int/2addr v1, v2

    .line 48
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iget v1, v3, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    sub-int/2addr v1, v2

    .line 55
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    :cond_1
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 73
    .line 74
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    xor-int/lit8 v9, v0, 0x1

    .line 78
    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    move v10, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move v10, v4

    .line 84
    :goto_1
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->μ:Landroid/graphics/Rect;

    .line 85
    .line 86
    move-object v6, p0

    .line 87
    move-object v7, p1

    .line 88
    invoke-virtual/range {v5 .. v10}, Lzl1;->Ρ(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final Δ(IILandroid/view/MotionEvent;I)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ε()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->π:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->л:[I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    aput v0, v6, v0

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    aput v0, v6, v7

    .line 22
    .line 23
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    move-object v1, p0

    .line 28
    move v4, p4

    .line 29
    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/RecyclerView;->θ(III[I[I)V

    .line 30
    .line 31
    .line 32
    aget p0, v6, v0

    .line 33
    .line 34
    rsub-int/lit8 p4, p0, 0x0

    .line 35
    .line 36
    aget v2, v6, v7

    .line 37
    .line 38
    rsub-int/lit8 v3, v2, 0x0

    .line 39
    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p0, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    move p0, v7

    .line 48
    :goto_1
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 49
    .line 50
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView;->й:[I

    .line 51
    .line 52
    aget v5, v4, v0

    .line 53
    .line 54
    sub-int/2addr v2, v5

    .line 55
    iput v2, v1, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 56
    .line 57
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 58
    .line 59
    aget v4, v4, v7

    .line 60
    .line 61
    sub-int/2addr v2, v4

    .line 62
    iput v2, v1, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 63
    .line 64
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->к:[I

    .line 65
    .line 66
    aget v6, v2, v0

    .line 67
    .line 68
    add-int/2addr v6, v5

    .line 69
    aput v6, v2, v0

    .line 70
    .line 71
    aget v5, v2, v7

    .line 72
    .line 73
    add-int/2addr v5, v4

    .line 74
    aput v5, v2, v7

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/View;->getOverScrollMode()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/4 v4, 0x2

    .line 81
    if-eq v2, v4, :cond_a

    .line 82
    .line 83
    if-eqz p3, :cond_9

    .line 84
    .line 85
    const/16 v2, 0x2002

    .line 86
    .line 87
    invoke-static {p3, v2}, Lxb;->Κ(Landroid/view/MotionEvent;I)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_9

    .line 92
    .line 93
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    int-to-float p4, p4

    .line 98
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    int-to-float v3, v3

    .line 103
    const/4 v5, 0x0

    .line 104
    cmpg-float v6, p4, v5

    .line 105
    .line 106
    const/high16 v8, 0x3f800000    # 1.0f

    .line 107
    .line 108
    if-gez v6, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->κ()V

    .line 111
    .line 112
    .line 113
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 114
    .line 115
    neg-float v6, p4

    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    int-to-float v9, v9

    .line 121
    div-float/2addr v6, v9

    .line 122
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    int-to-float v9, v9

    .line 127
    div-float/2addr v4, v9

    .line 128
    sub-float v4, v8, v4

    .line 129
    .line 130
    invoke-static {v0, v6, v4}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 131
    .line 132
    .line 133
    :goto_2
    move v0, v7

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    cmpl-float v6, p4, v5

    .line 136
    .line 137
    if-lez v6, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->λ()V

    .line 140
    .line 141
    .line 142
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    int-to-float v6, v6

    .line 149
    div-float v6, p4, v6

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    int-to-float v9, v9

    .line 156
    div-float/2addr v4, v9

    .line 157
    invoke-static {v0, v6, v4}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    :goto_3
    cmpg-float v4, v3, v5

    .line 162
    .line 163
    if-gez v4, :cond_5

    .line 164
    .line 165
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->μ()V

    .line 166
    .line 167
    .line 168
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 169
    .line 170
    neg-float v4, v3

    .line 171
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    int-to-float v6, v6

    .line 176
    div-float/2addr v4, v6

    .line 177
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    int-to-float v6, v6

    .line 182
    div-float/2addr v2, v6

    .line 183
    invoke-static {v0, v4, v2}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_5
    cmpl-float v4, v3, v5

    .line 188
    .line 189
    if-lez v4, :cond_6

    .line 190
    .line 191
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->ι()V

    .line 192
    .line 193
    .line 194
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    int-to-float v4, v4

    .line 201
    div-float v4, v3, v4

    .line 202
    .line 203
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    int-to-float v6, v6

    .line 208
    div-float/2addr v2, v6

    .line 209
    sub-float/2addr v8, v2

    .line 210
    invoke-static {v0, v4, v8}, Lh62;->н(Landroid/widget/EdgeEffect;FF)F

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    move v7, v0

    .line 215
    :goto_4
    if-nez v7, :cond_7

    .line 216
    .line 217
    cmpl-float p4, p4, v5

    .line 218
    .line 219
    if-nez p4, :cond_7

    .line 220
    .line 221
    cmpl-float p4, v3, v5

    .line 222
    .line 223
    if-eqz p4, :cond_8

    .line 224
    .line 225
    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 226
    .line 227
    .line 228
    :cond_8
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 229
    .line 230
    const/16 v0, 0x1f

    .line 231
    .line 232
    if-lt p4, v0, :cond_9

    .line 233
    .line 234
    const/high16 p4, 0x400000

    .line 235
    .line 236
    invoke-static {p3, p4}, Lxb;->Κ(Landroid/view/MotionEvent;I)Z

    .line 237
    .line 238
    .line 239
    move-result p3

    .line 240
    if-eqz p3, :cond_9

    .line 241
    .line 242
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->ω()V

    .line 243
    .line 244
    .line 245
    :cond_9
    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->γ(II)V

    .line 246
    .line 247
    .line 248
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->awakenScrollBars()Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-nez p1, :cond_b

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 255
    .line 256
    .line 257
    :cond_b
    return p0
.end method

.method public final Ε(Landroid/widget/EdgeEffect;II)Z
    .locals 6

    .line 1
    if-lez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-float p3, p3

    .line 9
    mul-float/2addr p1, p3

    .line 10
    neg-int p2, p2

    .line 11
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    int-to-float p2, p2

    .line 16
    const p3, 0x3eb33333    # 0.35f

    .line 17
    .line 18
    .line 19
    mul-float/2addr p2, p3

    .line 20
    const p3, 0x3c75c28f    # 0.015f

    .line 21
    .line 22
    .line 23
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ε:F

    .line 24
    .line 25
    mul-float/2addr p0, p3

    .line 26
    div-float/2addr p2, p0

    .line 27
    float-to-double p2, p2

    .line 28
    invoke-static {p2, p3}, Ljava/lang/Math;->log(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    sget v0, Landroidx/recyclerview/widget/RecyclerView;->у:F

    .line 33
    .line 34
    float-to-double v0, v0

    .line 35
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 36
    .line 37
    sub-double v2, v0, v2

    .line 38
    .line 39
    float-to-double v4, p0

    .line 40
    div-double/2addr v0, v2

    .line 41
    mul-double/2addr v0, p2

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide p2

    .line 46
    mul-double/2addr p2, v4

    .line 47
    double-to-float p0, p2

    .line 48
    cmpg-float p0, p0, p1

    .line 49
    .line 50
    if-gez p0, :cond_1

    .line 51
    .line 52
    :goto_0
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_1
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public final Ζ(IIZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "RecyclerView"

    .line 6
    .line 7
    const-string p1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move p1, v1

    .line 26
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 27
    .line 28
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    move p2, v1

    .line 35
    :cond_3
    if-nez p1, :cond_5

    .line 36
    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    :goto_0
    return-void

    .line 41
    :cond_5
    :goto_1
    if-eqz p3, :cond_8

    .line 42
    .line 43
    const/4 p3, 0x1

    .line 44
    if-eqz p1, :cond_6

    .line 45
    .line 46
    move v1, p3

    .line 47
    :cond_6
    if-eqz p2, :cond_7

    .line 48
    .line 49
    or-int/lit8 v1, v1, 0x2

    .line 50
    .line 51
    :cond_7
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, v1, p3}, Lb31;->η(II)Z

    .line 56
    .line 57
    .line 58
    :cond_8
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 59
    .line 60
    const/high16 p3, -0x80000000

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {p0, p1, p2, p3, v0}, Lnm1;->γ(IIILandroid/view/animation/Interpolator;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final Η()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 6
    .line 7
    return-void
.end method

.method public final Θ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lzl1;->δ()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    or-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0, p1}, Lb31;->η(II)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final Ι(Z)V
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ge p1, v0, :cond_1

    .line 5
    .line 6
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, "stopInterceptRequestLayout was called more times than startInterceptRequestLayout."

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :goto_0
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->χ:I

    .line 31
    .line 32
    return-void
.end method

.method public final Κ(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lb31;->θ(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final β(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ζ:I

    .line 26
    .line 27
    if-lez p1, :cond_2

    .line 28
    .line 29
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string p0, "RecyclerView"

    .line 39
    .line 40
    const-string v0, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."

    .line 41
    .line 42
    invoke-static {p0, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final γ(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    or-int/2addr v0, p1

    .line 50
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    if-lez p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    or-int/2addr v0, p1

    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    if-gez p2, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    or-int/2addr v0, p1

    .line 98
    :cond_3
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void
.end method

.method public final ε()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->φ:Z

    .line 2
    .line 3
    const-string v1, "No adapter attached; skipping layout"

    .line 4
    .line 5
    const-string v2, "RecyclerView"

    .line 6
    .line 7
    const-string v3, "RV FullInvalidate"

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Γ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 17
    .line 18
    iget-object v0, v0, Lm6;->η:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 34
    .line 35
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-lez p0, :cond_1

    .line 44
    .line 45
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :cond_2
    :goto_0
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final ζ(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p1, v1, v0}, Lzl1;->ζ(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2, v1, v0}, Lzl1;->ζ(III)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final η(III[I[I)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual/range {p0 .. p5}, Lb31;->γ(III[I[I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final θ(III[I[I)V
    .locals 8

    .line 1
    const/4 v2, 0x0

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lb31;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v3, p1

    .line 8
    move v4, p2

    .line 9
    move v6, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v7, p5

    .line 12
    invoke-virtual/range {v0 .. v7}, Lb31;->δ(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ι()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 7
    .line 8
    check-cast v0, Llm1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr v2, p0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final κ()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 7
    .line 8
    check-cast v0, Llm1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr v2, p0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final λ()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 7
    .line 8
    check-cast v0, Llm1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr v2, p0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final μ()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Η:Lwl1;

    .line 7
    .line 8
    check-cast v0, Llm1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr v2, p0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final ν()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", adapter:null, layout:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", context:"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final ξ(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final ο(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ρ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_5

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Lo00;

    .line 20
    .line 21
    iget v6, v5, Lo00;->ρ:I

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    const/4 v8, 0x2

    .line 25
    if-ne v6, v7, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-virtual {v5, v6, v9}, Lo00;->β(FF)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-virtual {v5, v9, v10}, Lo00;->α(FF)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-nez v10, :cond_4

    .line 56
    .line 57
    if-nez v6, :cond_0

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    :cond_0
    if-eqz v9, :cond_1

    .line 62
    .line 63
    iput v7, v5, Lo00;->σ:I

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    float-to-int v6, v6

    .line 70
    int-to-float v6, v6

    .line 71
    iput v6, v5, Lo00;->λ:F

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-eqz v6, :cond_2

    .line 75
    .line 76
    iput v8, v5, Lo00;->σ:I

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    float-to-int v6, v6

    .line 83
    int-to-float v6, v6

    .line 84
    iput v6, v5, Lo00;->κ:F

    .line 85
    .line 86
    :cond_2
    :goto_1
    invoke-virtual {v5, v8}, Lo00;->δ(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    if-ne v6, v8, :cond_4

    .line 91
    .line 92
    :goto_2
    const/4 v6, 0x3

    .line 93
    if-eq v0, v6, :cond_4

    .line 94
    .line 95
    iput-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->σ:Lo00;

    .line 96
    .line 97
    return v7

    .line 98
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    return v3
.end method

.method public final π(IIII)Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string p0, "RecyclerView"

    .line 7
    .line 8
    const-string p1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 9
    .line 10
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->ψ:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 25
    .line 26
    invoke-virtual {v2}, Lzl1;->δ()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ge v3, p3, :cond_3

    .line 37
    .line 38
    :cond_2
    move p1, v1

    .line 39
    :cond_3
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v3, p3, :cond_5

    .line 46
    .line 47
    :cond_4
    move p2, v1

    .line 48
    :cond_5
    if-nez p1, :cond_6

    .line 49
    .line 50
    if-nez p2, :cond_6

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_6
    const/4 p3, 0x0

    .line 55
    if-eqz p1, :cond_9

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 58
    .line 59
    if-eqz v3, :cond_8

    .line 60
    .line 61
    invoke-static {v3}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    cmpl-float v3, v3, p3

    .line 66
    .line 67
    if-eqz v3, :cond_8

    .line 68
    .line 69
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 70
    .line 71
    neg-int v4, p1

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {p0, v3, v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->Ε(Landroid/widget/EdgeEffect;II)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_7

    .line 81
    .line 82
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 85
    .line 86
    .line 87
    :goto_0
    move p1, v1

    .line 88
    :cond_7
    move v3, p1

    .line 89
    move p1, v1

    .line 90
    goto :goto_1

    .line 91
    :cond_8
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 92
    .line 93
    if-eqz v3, :cond_9

    .line 94
    .line 95
    invoke-static {v3}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    cmpl-float v3, v3, p3

    .line 100
    .line 101
    if-eqz v3, :cond_9

    .line 102
    .line 103
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p0, v3, p1, v4}, Landroidx/recyclerview/widget/RecyclerView;->Ε(Landroid/widget/EdgeEffect;II)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 116
    .line 117
    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_9
    move v3, v1

    .line 122
    :goto_1
    if-eqz p2, :cond_c

    .line 123
    .line 124
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 125
    .line 126
    if-eqz v4, :cond_b

    .line 127
    .line 128
    invoke-static {v4}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    cmpl-float v4, v4, p3

    .line 133
    .line 134
    if-eqz v4, :cond_b

    .line 135
    .line 136
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 137
    .line 138
    neg-int v4, p2

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    invoke-virtual {p0, p3, v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->Ε(Landroid/widget/EdgeEffect;II)Z

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-eqz p3, :cond_a

    .line 148
    .line 149
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 150
    .line 151
    invoke-virtual {p2, v4}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 152
    .line 153
    .line 154
    :goto_2
    move p2, v1

    .line 155
    :cond_a
    move p3, v1

    .line 156
    goto :goto_3

    .line 157
    :cond_b
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 158
    .line 159
    if-eqz v4, :cond_c

    .line 160
    .line 161
    invoke-static {v4}, Lh62;->в(Landroid/widget/EdgeEffect;)F

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    cmpl-float p3, v4, p3

    .line 166
    .line 167
    if-eqz p3, :cond_c

    .line 168
    .line 169
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-virtual {p0, p3, p2, v4}, Landroidx/recyclerview/widget/RecyclerView;->Ε(Landroid/widget/EdgeEffect;II)Z

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    if-eqz p3, :cond_a

    .line 180
    .line 181
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 182
    .line 183
    invoke-virtual {p3, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_c
    move p3, p2

    .line 188
    move p2, v1

    .line 189
    :goto_3
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 190
    .line 191
    const/4 v5, 0x1

    .line 192
    if-nez v3, :cond_d

    .line 193
    .line 194
    if-eqz p2, :cond_e

    .line 195
    .line 196
    :cond_d
    neg-int v6, p4

    .line 197
    invoke-static {v3, p4}, Ljava/lang/Math;->min(II)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->Θ(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v3, p2}, Lnm1;->α(II)V

    .line 217
    .line 218
    .line 219
    :cond_e
    if-nez p1, :cond_10

    .line 220
    .line 221
    if-nez p3, :cond_10

    .line 222
    .line 223
    if-nez v3, :cond_f

    .line 224
    .line 225
    if-eqz p2, :cond_13

    .line 226
    .line 227
    :cond_f
    return v5

    .line 228
    :cond_10
    int-to-float p2, p1

    .line 229
    int-to-float v3, p3

    .line 230
    invoke-virtual {p0, p2, v3}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-nez v6, :cond_13

    .line 235
    .line 236
    if-nez v0, :cond_12

    .line 237
    .line 238
    if-eqz v2, :cond_11

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_11
    move v0, v1

    .line 242
    goto :goto_5

    .line 243
    :cond_12
    :goto_4
    move v0, v5

    .line 244
    :goto_5
    invoke-virtual {p0, p2, v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 245
    .line 246
    .line 247
    if-eqz v0, :cond_13

    .line 248
    .line 249
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->Θ(I)V

    .line 250
    .line 251
    .line 252
    neg-int p0, p4

    .line 253
    invoke-static {p1, p4}, Ljava/lang/Math;->min(II)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    invoke-virtual {v4, p1, p0}, Lnm1;->α(II)V

    .line 270
    .line 271
    .line 272
    return v5

    .line 273
    :cond_13
    :goto_6
    return v1
.end method

.method public final ρ(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "View "

    .line 11
    .line 12
    const-string v1, " is not a direct child of "

    .line 13
    .line 14
    invoke-static {v0, p1, v1, p0}, Lγ;->ι(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final τ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lzl1;->Υ(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final υ()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm6;->Θ()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lm6;->Η(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lam1;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    iput-boolean v4, v3, Lam1;->β:Z

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 30
    .line 31
    iget-object p0, p0, Lfm1;->β:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-gtz v0, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {v1, p0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0
.end method

.method public final φ()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 6
    .line 7
    return-void
.end method

.method public final χ(Z)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_4

    .line 8
    .line 9
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "layout or scroll counter cannot go below zero.Some calls are not matching"

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ε:I

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Α:I

    .line 36
    .line 37
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Α:I

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Β:Landroid/view/accessibility/AccessibilityManager;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/16 v2, 0x800

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->м:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    sub-int/2addr p1, v1

    .line 73
    if-gez p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    invoke-static {p1, p0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    throw p0

    .line 84
    :cond_4
    return-void
.end method

.method public final ψ(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ξ:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    add-float/2addr v1, v2

    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Σ:I

    .line 33
    .line 34
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Π:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, v2

    .line 41
    float-to-int p1, p1

    .line 42
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Τ:I

    .line 43
    .line 44
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ρ:I

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final ω()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Θ:Landroid/widget/EdgeEffect;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Ι:Landroid/widget/EdgeEffect;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    or-int/2addr v0, v1

    .line 30
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Κ:Landroid/widget/EdgeEffect;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    or-int/2addr v0, v1

    .line 44
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->Λ:Landroid/widget/EdgeEffect;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    or-int/2addr v0, v1

    .line 58
    :cond_3
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void
.end method
