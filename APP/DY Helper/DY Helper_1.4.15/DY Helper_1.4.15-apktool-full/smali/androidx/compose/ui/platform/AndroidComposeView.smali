.class public final Landroidx/compose/ui/platform/AndroidComposeView;
.super Landroid/view/ViewGroup;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Luo1;
.implements Lgr;
.implements Lq81;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;
.implements Lt40;


# static fields
.field public static М:Ljava/lang/Class;

.field public static Н:Ljava/lang/reflect/Method;

.field public static final О:Lv11;

.field public static П:Ls0;


# instance fields
.field public final Α:Lyp0;

.field public final Β:Ln11;

.field public final Γ:Lol1;

.field public final Δ:Les1;

.field public final Ε:Ll1;

.field public Ζ:Lz1;

.field public final Η:Lh0;

.field public final Θ:Ll2;

.field public final Ι:Ly7;

.field public final Κ:Lv11;

.field public Λ:Lv11;

.field public Μ:Z

.field public final Ν:Lb11;

.field public final Ξ:Lsf;

.field public final Ο:Lx91;

.field public final Π:Lfs;

.field public final Ρ:Li0;

.field public final Σ:Lk0;

.field public Τ:Z

.field public final Υ:Lp0;

.field public final Φ:Lo0;

.field public final Χ:Ly81;

.field public Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

.field public Ω:Lyo;

.field public final ε:Lx91;

.field public ζ:J

.field public final η:Z

.field public final θ:Laq0;

.field public ι:Lkr0;

.field public κ:Llr0;

.field public λ:Lgo1;

.field public final μ:Lw6;

.field public final ν:Lq0;

.field public final ξ:Lx91;

.field public final ο:Landroid/view/View;

.field public final π:Ly40;

.field public ρ:Lup;

.field public final σ:Le2;

.field public final τ:Llm0;

.field public final υ:Lx91;

.field public final φ:Lfs;

.field public final χ:Lge;

.field public final ψ:Ll3;

.field public final ω:Lom0;

.field public final А:Ld1;

.field public final Б:Lq0;

.field public В:Z

.field public final Г:Lul0;

.field public final Д:Lx0;

.field public final Е:Ljd;

.field public Ж:Z

.field public З:Z

.field public final И:Llm0;

.field public К:Landroid/view/View;

.field public final Л:Lxn0;

.field public а:Z

.field public final б:Lmx0;

.field public в:J

.field public final г:[I

.field public final д:[F

.field public final е:[F

.field public ж:J

.field public з:Z

.field public и:J

.field public final й:Lx91;

.field public final к:Lfs;

.field public л:La80;

.field public м:Lj32;

.field public н:Li32;

.field public final о:Ljava/util/concurrent/atomic/AtomicReference;

.field public п:Li2;

.field public final р:Le50;

.field public final с:Lg21;

.field public final т:Lx91;

.field public final у:Lrc0;

.field public final ф:Llm0;

.field public final х:Ls01;

.field public final ц:Li2;

.field public ч:Landroid/view/MotionEvent;

.field public ш:J

.field public final щ:Lcw1;

.field public final э:Lv11;

.field public ю:F

.field public я:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv11;

    .line 2
    .line 3
    invoke-direct {v0}, Lv11;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->О:Lv11;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpn;)V
    .locals 15

    .line 1
    move-object/from16 v8, p1

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v9}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ε:Lx91;

    .line 13
    .line 14
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ζ:J

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    iput-boolean v10, p0, Landroidx/compose/ui/platform/AndroidComposeView;->η:Z

    .line 23
    .line 24
    iget-object v0, v9, Lpn;->σ:Laq0;

    .line 25
    .line 26
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->θ:Laq0;

    .line 27
    .line 28
    sget-object v0, Lx;->Τ:Lx;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->λ:Lgo1;

    .line 31
    .line 32
    new-instance v0, Lw6;

    .line 33
    .line 34
    invoke-direct {v0}, Lw6;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->μ:Lw6;

    .line 38
    .line 39
    new-instance v0, Lq0;

    .line 40
    .line 41
    const/4 v11, 0x0

    .line 42
    invoke-direct {v0, p0, v11}, Lq0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ν:Lq0;

    .line 46
    .line 47
    invoke-static {v8}, Ljx0;->α(Landroid/content/Context;)Las;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lxn0;->Β:Lxn0;

    .line 52
    .line 53
    new-instance v3, Lx91;

    .line 54
    .line 55
    invoke-direct {v3, v0, v1}, Lx91;-><init>(Ljava/lang/Object;Lxn0;)V

    .line 56
    .line 57
    .line 58
    iput-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ξ:Lx91;

    .line 59
    .line 60
    new-instance v0, Ly40;

    .line 61
    .line 62
    invoke-direct {v0, p0, p0}, Ly40;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->π:Ly40;

    .line 66
    .line 67
    iget-object v0, v9, Lpn;->β:Lun;

    .line 68
    .line 69
    invoke-virtual {v0}, Lun;->ι()Lup;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ρ:Lup;

    .line 74
    .line 75
    new-instance v0, Le2;

    .line 76
    .line 77
    new-instance v1, Lz0;

    .line 78
    .line 79
    invoke-direct {v0}, Le2;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->σ:Le2;

    .line 83
    .line 84
    new-instance v0, Llm0;

    .line 85
    .line 86
    invoke-direct {v0, v10, v11}, Llm0;-><init>(IZ)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->τ:Llm0;

    .line 90
    .line 91
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-static {v0}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->υ:Lx91;

    .line 98
    .line 99
    new-instance v0, Lx0;

    .line 100
    .line 101
    invoke-direct {v0, p0, v11}, Lx0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 102
    .line 103
    .line 104
    sget-object v1, Lgx1;->α:Lm6;

    .line 105
    .line 106
    new-instance v1, Lfs;

    .line 107
    .line 108
    invoke-direct {v1, v0}, Lfs;-><init>(Lp70;)V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->φ:Lfs;

    .line 112
    .line 113
    iget-object v0, v9, Lpn;->υ:Lge;

    .line 114
    .line 115
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->χ:Lge;

    .line 116
    .line 117
    iget-object v0, v9, Lpn;->ρ:Ll3;

    .line 118
    .line 119
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ψ:Ll3;

    .line 120
    .line 121
    new-instance v0, Lom0;

    .line 122
    .line 123
    invoke-direct {v0}, Lom0;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ω:Lom0;

    .line 127
    .line 128
    new-instance v0, Lyp0;

    .line 129
    .line 130
    const/4 v12, 0x3

    .line 131
    invoke-direct {v0, v12}, Lyp0;-><init>(I)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, Lyp0;->Β:Lpx0;

    .line 135
    .line 136
    sget-object v3, Lvo1;->β:Lvo1;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_0

    .line 143
    .line 144
    iput-object v3, v0, Lyp0;->Β:Lpx0;

    .line 145
    .line 146
    invoke-virtual {v0}, Lyp0;->Δ()V

    .line 147
    .line 148
    .line 149
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Lyp0;->Ω(Lyr;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewConfiguration()Lg92;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Lyp0;->г(Lg92;)V

    .line 161
    .line 162
    .line 163
    new-instance v1, Le1;

    .line 164
    .line 165
    invoke-direct {v1, p0}, Le1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ly40;

    .line 173
    .line 174
    iget-object v3, v3, Ly40;->ε:Lw40;

    .line 175
    .line 176
    invoke-interface {v1, v3}, Lr01;->β(Lr01;)Lr01;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    iget-object v3, v3, Le2;->γ:Ld2;

    .line 185
    .line 186
    invoke-interface {v1, v3}, Lr01;->β(Lr01;)Lr01;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Lyp0;->в(Lr01;)V

    .line 191
    .line 192
    .line 193
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Α:Lyp0;

    .line 194
    .line 195
    sget-object v0, Ltm0;->α:Ln11;

    .line 196
    .line 197
    new-instance v0, Ln11;

    .line 198
    .line 199
    invoke-direct {v0}, Ln11;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Β:Ln11;

    .line 203
    .line 204
    new-instance v0, Lol1;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 207
    .line 208
    .line 209
    invoke-direct {v0, p0}, Lol1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 210
    .line 211
    .line 212
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Γ:Lol1;

    .line 213
    .line 214
    new-instance v0, Les1;

    .line 215
    .line 216
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v3, Llz;

    .line 221
    .line 222
    invoke-direct {v3}, Lq01;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-direct {v0, v1, v3, v4}, Les1;-><init>(Lyp0;Llz;Ln11;)V

    .line 230
    .line 231
    .line 232
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Δ:Les1;

    .line 233
    .line 234
    new-instance v13, Ll1;

    .line 235
    .line 236
    invoke-direct {v13, p0}, Ll1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 237
    .line 238
    .line 239
    iput-object v13, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 240
    .line 241
    new-instance v14, Lz1;

    .line 242
    .line 243
    new-instance v0, Lw0;

    .line 244
    .line 245
    const/4 v6, 0x1

    .line 246
    const/4 v7, 0x0

    .line 247
    const/4 v1, 0x0

    .line 248
    const-class v3, Ls1;

    .line 249
    .line 250
    const-string v4, "getContentCaptureSessionCompat"

    .line 251
    .line 252
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 253
    .line 254
    move-object v2, p0

    .line 255
    invoke-direct/range {v0 .. v7}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 256
    .line 257
    .line 258
    invoke-direct {v14, p0, v0}, Lz1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lw0;)V

    .line 259
    .line 260
    .line 261
    iput-object v14, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 262
    .line 263
    iget-object v0, v9, Lpn;->κ:Lh0;

    .line 264
    .line 265
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Η:Lh0;

    .line 266
    .line 267
    new-instance v0, Ll2;

    .line 268
    .line 269
    invoke-direct {v0, p0}, Ll2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 270
    .line 271
    .line 272
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Θ:Ll2;

    .line 273
    .line 274
    new-instance v0, Ly7;

    .line 275
    .line 276
    invoke-direct {v0}, Ly7;-><init>()V

    .line 277
    .line 278
    .line 279
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ι:Ly7;

    .line 280
    .line 281
    new-instance v0, Lv11;

    .line 282
    .line 283
    invoke-direct {v0}, Lv11;-><init>()V

    .line 284
    .line 285
    .line 286
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Κ:Lv11;

    .line 287
    .line 288
    new-instance v0, Lb11;

    .line 289
    .line 290
    invoke-direct {v0}, Lb11;-><init>()V

    .line 291
    .line 292
    .line 293
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ν:Lb11;

    .line 294
    .line 295
    new-instance v0, Lsf;

    .line 296
    .line 297
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 302
    .line 303
    .line 304
    iput-object v1, v0, Lsf;->β:Ljava/lang/Object;

    .line 305
    .line 306
    new-instance v3, Lke0;

    .line 307
    .line 308
    iget-object v1, v1, Lyp0;->Κ:Lk31;

    .line 309
    .line 310
    iget-object v1, v1, Lk31;->γ:Lgm0;

    .line 311
    .line 312
    invoke-direct {v3, v1}, Lke0;-><init>(Lmp0;)V

    .line 313
    .line 314
    .line 315
    iput-object v3, v0, Lsf;->γ:Ljava/lang/Object;

    .line 316
    .line 317
    new-instance v1, Ly21;

    .line 318
    .line 319
    invoke-direct {v1, v12}, Ly21;-><init>(I)V

    .line 320
    .line 321
    .line 322
    iput-object v1, v0, Lsf;->δ:Ljava/lang/Object;

    .line 323
    .line 324
    new-instance v1, Lne0;

    .line 325
    .line 326
    invoke-direct {v1}, Lne0;-><init>()V

    .line 327
    .line 328
    .line 329
    iput-object v1, v0, Lsf;->ε:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ξ:Lsf;

    .line 332
    .line 333
    new-instance v0, Landroid/content/res/Configuration;

    .line 334
    .line 335
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ο:Lx91;

    .line 351
    .line 352
    new-instance v0, Lx0;

    .line 353
    .line 354
    invoke-direct {v0, p0, v10}, Lx0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 355
    .line 356
    .line 357
    new-instance v1, Lfs;

    .line 358
    .line 359
    invoke-direct {v1, v0}, Lfs;-><init>(Lp70;)V

    .line 360
    .line 361
    .line 362
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Π:Lfs;

    .line 363
    .line 364
    new-instance v0, Li0;

    .line 365
    .line 366
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillTree()Ly7;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-direct {v0, p0, v1}, Li0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Ly7;)V

    .line 371
    .line 372
    .line 373
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 374
    .line 375
    const-class v0, Landroid/view/autofill/AutofillManager;

    .line 376
    .line 377
    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 382
    .line 383
    if-eqz v0, :cond_7

    .line 384
    .line 385
    new-instance v1, Lk0;

    .line 386
    .line 387
    move-object v3, v1

    .line 388
    new-instance v1, Ly21;

    .line 389
    .line 390
    invoke-direct {v1, v0}, Ly21;-><init>(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    move-object v0, v3

    .line 406
    move-object v3, p0

    .line 407
    invoke-direct/range {v0 .. v5}, Lk0;-><init>(Ly21;Les1;Landroidx/compose/ui/platform/AndroidComposeView;Lol1;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 411
    .line 412
    iget-object v0, v9, Lpn;->μ:Lp0;

    .line 413
    .line 414
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Υ:Lp0;

    .line 415
    .line 416
    iget-object v0, v9, Lpn;->ν:Lo0;

    .line 417
    .line 418
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Φ:Lo0;

    .line 419
    .line 420
    new-instance v0, Ly81;

    .line 421
    .line 422
    new-instance v1, Lb1;

    .line 423
    .line 424
    invoke-direct {v1, p0, v10}, Lb1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 425
    .line 426
    .line 427
    invoke-direct {v0, v1}, Ly81;-><init>(Lb1;)V

    .line 428
    .line 429
    .line 430
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Χ:Ly81;

    .line 431
    .line 432
    new-instance v0, Lmx0;

    .line 433
    .line 434
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-direct {v0, v1}, Lmx0;-><init>(Lyp0;)V

    .line 439
    .line 440
    .line 441
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 442
    .line 443
    const v0, 0x7fffffff

    .line 444
    .line 445
    .line 446
    int-to-long v0, v0

    .line 447
    const/16 v3, 0x20

    .line 448
    .line 449
    shl-long v3, v0, v3

    .line 450
    .line 451
    const-wide v5, 0xffffffffL

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    and-long/2addr v0, v5

    .line 457
    or-long/2addr v0, v3

    .line 458
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->в:J

    .line 459
    .line 460
    filled-new-array {v11, v11}, [I

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->г:[I

    .line 465
    .line 466
    invoke-static {}, Lbd;->λ()[F

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 471
    .line 472
    invoke-static {}, Lbd;->λ()[F

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->е:[F

    .line 477
    .line 478
    const-wide/16 v0, -0x1

    .line 479
    .line 480
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 481
    .line 482
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 488
    .line 489
    const/4 v0, 0x0

    .line 490
    invoke-static {v0}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->й:Lx91;

    .line 495
    .line 496
    new-instance v1, Lx0;

    .line 497
    .line 498
    invoke-direct {v1, p0, v12}, Lx0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 499
    .line 500
    .line 501
    new-instance v3, Lfs;

    .line 502
    .line 503
    invoke-direct {v3, v1}, Lfs;-><init>(Lp70;)V

    .line 504
    .line 505
    .line 506
    iput-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->к:Lfs;

    .line 507
    .line 508
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 509
    .line 510
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->о:Ljava/util/concurrent/atomic/AtomicReference;

    .line 514
    .line 515
    iget-object v1, v9, Lpn;->ξ:Le50;

    .line 516
    .line 517
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->р:Le50;

    .line 518
    .line 519
    iget-object v1, v9, Lpn;->ο:Lg21;

    .line 520
    .line 521
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->с:Lg21;

    .line 522
    .line 523
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    sget-object v3, Lr40;->α:[I

    .line 536
    .line 537
    sget-object v3, Lnp0;->ε:Lnp0;

    .line 538
    .line 539
    if-eqz v1, :cond_2

    .line 540
    .line 541
    if-eq v1, v10, :cond_1

    .line 542
    .line 543
    move-object v1, v0

    .line 544
    goto :goto_0

    .line 545
    :cond_1
    sget-object v1, Lnp0;->ζ:Lnp0;

    .line 546
    .line 547
    goto :goto_0

    .line 548
    :cond_2
    move-object v1, v3

    .line 549
    :goto_0
    if-nez v1, :cond_3

    .line 550
    .line 551
    goto :goto_1

    .line 552
    :cond_3
    move-object v3, v1

    .line 553
    :goto_1
    invoke-static {v3}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->т:Lx91;

    .line 558
    .line 559
    iget-object v1, v9, Lpn;->π:Lrc0;

    .line 560
    .line 561
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->у:Lrc0;

    .line 562
    .line 563
    new-instance v1, Llm0;

    .line 564
    .line 565
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    const/4 v4, 0x2

    .line 570
    if-eqz v3, :cond_4

    .line 571
    .line 572
    move v3, v10

    .line 573
    goto :goto_2

    .line 574
    :cond_4
    move v3, v4

    .line 575
    :goto_2
    invoke-direct {v1, v3}, Llm0;-><init>(I)V

    .line 576
    .line 577
    .line 578
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ф:Llm0;

    .line 579
    .line 580
    new-instance v1, Ls01;

    .line 581
    .line 582
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 583
    .line 584
    .line 585
    new-instance v3, Lk21;

    .line 586
    .line 587
    const/16 v5, 0x10

    .line 588
    .line 589
    new-array v6, v5, [Lp8;

    .line 590
    .line 591
    invoke-direct {v3, v6}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    new-instance v3, Lk21;

    .line 595
    .line 596
    new-array v6, v5, [Lh62;

    .line 597
    .line 598
    invoke-direct {v3, v6}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    new-instance v3, Lk21;

    .line 602
    .line 603
    new-array v6, v5, [Lyp0;

    .line 604
    .line 605
    invoke-direct {v3, v6}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    new-instance v3, Lk21;

    .line 609
    .line 610
    new-array v5, v5, [Lh62;

    .line 611
    .line 612
    invoke-direct {v3, v5}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->х:Ls01;

    .line 616
    .line 617
    new-instance v1, Li2;

    .line 618
    .line 619
    invoke-direct {v1, v4}, Li2;-><init>(I)V

    .line 620
    .line 621
    .line 622
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ц:Li2;

    .line 623
    .line 624
    new-instance v1, Lcw1;

    .line 625
    .line 626
    const/4 v3, 0x5

    .line 627
    invoke-direct {v1, v3}, Lcw1;-><init>(I)V

    .line 628
    .line 629
    .line 630
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->щ:Lcw1;

    .line 631
    .line 632
    new-instance v1, Lv11;

    .line 633
    .line 634
    invoke-direct {v1}, Lv11;-><init>()V

    .line 635
    .line 636
    .line 637
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 638
    .line 639
    new-instance v1, Ld1;

    .line 640
    .line 641
    invoke-direct {v1, v11, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->А:Ld1;

    .line 645
    .line 646
    new-instance v1, Lq0;

    .line 647
    .line 648
    invoke-direct {v1, p0, v10}, Lq0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 649
    .line 650
    .line 651
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Б:Lq0;

    .line 652
    .line 653
    new-instance v1, Lul0;

    .line 654
    .line 655
    new-instance v3, Lb1;

    .line 656
    .line 657
    invoke-direct {v3, p0, v11}, Lb1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 658
    .line 659
    .line 660
    invoke-direct {v1, v8, v3}, Lul0;-><init>(Landroid/content/Context;Lb1;)V

    .line 661
    .line 662
    .line 663
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Г:Lul0;

    .line 664
    .line 665
    new-instance v1, Lx0;

    .line 666
    .line 667
    invoke-direct {v1, p0, v4}, Lx0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 668
    .line 669
    .line 670
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Д:Lx0;

    .line 671
    .line 672
    new-instance v1, Ljd;

    .line 673
    .line 674
    invoke-direct {v1}, Ljd;-><init>()V

    .line 675
    .line 676
    .line 677
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Е:Ljd;

    .line 678
    .line 679
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 680
    .line 681
    invoke-virtual {p0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {p0, v11}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {p0, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 688
    .line 689
    .line 690
    sget-object v1, Lr1;->α:Lr1;

    .line 691
    .line 692
    invoke-virtual {v1, p0, v10, v11}, Lr1;->α(Landroid/view/View;IZ)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {p0, v10}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {p0, v11}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 699
    .line 700
    .line 701
    invoke-static {p0, v13}, Lb92;->ζ(Landroid/view/View;Landroidx/core/view/α;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    invoke-virtual {v1, p0}, Lyp0;->β(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 716
    .line 717
    .line 718
    sget-object v1, Lm1;->α:Lm1;

    .line 719
    .line 720
    invoke-virtual {v1, p0}, Lm1;->α(Landroid/view/View;)V

    .line 721
    .line 722
    .line 723
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-eqz v1, :cond_5

    .line 728
    .line 729
    new-instance v1, Landroid/view/View;

    .line 730
    .line 731
    invoke-direct {v1, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 732
    .line 733
    .line 734
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 735
    .line 736
    invoke-direct {v3, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 740
    .line 741
    .line 742
    const v3, 0x7f090182

    .line 743
    .line 744
    .line 745
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 746
    .line 747
    invoke-virtual {v1, v3, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ο:Landroid/view/View;

    .line 751
    .line 752
    const/4 v3, -0x1

    .line 753
    invoke-virtual {p0, v1, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    .line 754
    .line 755
    .line 756
    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 757
    .line 758
    const/16 v3, 0x1f

    .line 759
    .line 760
    if-lt v1, v3, :cond_6

    .line 761
    .line 762
    new-instance v0, Llm0;

    .line 763
    .line 764
    invoke-direct {v0, v4, v11}, Llm0;-><init>(IZ)V

    .line 765
    .line 766
    .line 767
    :cond_6
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->И:Llm0;

    .line 768
    .line 769
    new-instance v0, Lxn0;

    .line 770
    .line 771
    invoke-direct {v0, p0}, Lxn0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 772
    .line 773
    .line 774
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Л:Lxn0;

    .line 775
    .line 776
    return-void

    .line 777
    :cond_7
    const-string v0, "Autofill service could not be located."

    .line 778
    .line 779
    invoke-static {v0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    throw v0
.end method

.method private final getDerivedIsAttached()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->φ:Lfs;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfs;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Lbs;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getLegacyTextInputServiceAndroid()Lj32;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->м:Lj32;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj32;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1, p0}, Lj32;-><init>(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->м:Lj32;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public static synthetic getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getRoot$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0
    .annotation runtime Lbs;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getWindowInfo$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final get_composeViewContext()Lpn;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ε:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpn;

    .line 8
    .line 9
    return-object p0
.end method

.method private final get_viewTreeOwners()Lv0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->й:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method private final setAttached(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->υ:Lx91;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private setDensity(Lyr;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ξ:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setFontFamilyResolver(Lf50;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->с:Lg21;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lg21;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(Lnp0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->т:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_composeViewContext(Lpn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ε:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_viewTreeOwners(Lv0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->й:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic β(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Z
    .locals 0

    .line 1
    invoke-super {p1, p0}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic γ(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic ε(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_viewTreeOwners()Lv0;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static ζ(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->φ()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->ζ(Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public static ι(I)J
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/high16 v1, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    int-to-long v0, p0

    .line 23
    shl-long v2, v0, v2

    .line 24
    .line 25
    or-long/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    int-to-long v0, v3

    .line 34
    shl-long/2addr v0, v2

    .line 35
    const p0, 0x7fffffff

    .line 36
    .line 37
    .line 38
    int-to-long v2, p0

    .line 39
    or-long/2addr v0, v2

    .line 40
    return-wide v0

    .line 41
    :cond_2
    int-to-long v0, v3

    .line 42
    shl-long/2addr v0, v2

    .line 43
    int-to-long v2, p0

    .line 44
    or-long/2addr v0, v2

    .line 45
    return-wide v0
.end method

.method public static ν(Lyp0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyp0;->Γ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, Lk21;->η:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p0, :cond_0

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    check-cast v2, Lyp0;

    .line 18
    .line 19
    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->ν(Lyp0;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public static ο()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static π(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    if-ge v0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/2addr v0, v1

    .line 28
    if-ge v0, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/2addr v0, v1

    .line 39
    if-ge v0, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    and-int/2addr v0, v1

    .line 50
    if-ge v0, v4, :cond_0

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v0, v3

    .line 55
    :goto_0
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v3

    .line 62
    :goto_1
    if-ge v6, v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getX(I)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    and-int/2addr v0, v1

    .line 73
    if-ge v0, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    and-int/2addr v0, v1

    .line 84
    if-ge v0, v4, :cond_2

    .line 85
    .line 86
    sget-object v0, Lc11;->α:Lc11;

    .line 87
    .line 88
    invoke-virtual {v0, p0, v6}, Lc11;->α(Landroid/view/MotionEvent;I)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    move v0, v2

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    :goto_2
    move v0, v3

    .line 98
    :goto_3
    if-nez v0, :cond_3

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    return v0
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ly40;

    .line 6
    .line 7
    iget-object v0, v0, Ly40;->γ:Lc50;

    .line 8
    .line 9
    iget-boolean v1, v0, Lq01;->σ:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Lq01;->ε:Lq01;

    .line 16
    .line 17
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 18
    .line 19
    const-string v2, "visitSubtreeIf called on an unattached node"

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    new-instance v1, Lk21;

    .line 27
    .line 28
    const/16 v3, 0x10

    .line 29
    .line 30
    new-array v4, v3, [Lq01;

    .line 31
    .line 32
    invoke-direct {v1, v4}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lq01;->ε:Lq01;

    .line 36
    .line 37
    iget-object v4, v0, Lq01;->κ:Lq01;

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-static {v1, v0}, Lh62;->β(Lk21;Lq01;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v1, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget v0, v1, Lk21;->η:I

    .line 49
    .line 50
    if-eqz v0, :cond_1a

    .line 51
    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lk21;->λ(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lq01;

    .line 59
    .line 60
    iget v4, v0, Lq01;->θ:I

    .line 61
    .line 62
    and-int/lit16 v4, v4, 0x400

    .line 63
    .line 64
    if-eqz v4, :cond_19

    .line 65
    .line 66
    move-object v4, v0

    .line 67
    :goto_1
    if-eqz v4, :cond_19

    .line 68
    .line 69
    iget-boolean v5, v4, Lq01;->σ:Z

    .line 70
    .line 71
    if-eqz v5, :cond_19

    .line 72
    .line 73
    iget v5, v4, Lq01;->η:I

    .line 74
    .line 75
    and-int/lit16 v5, v5, 0x400

    .line 76
    .line 77
    if-eqz v5, :cond_18

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    move-object v6, v4

    .line 81
    move-object v7, v5

    .line 82
    :goto_2
    if-eqz v6, :cond_18

    .line 83
    .line 84
    instance-of v8, v6, Lc50;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    const/4 v10, 0x0

    .line 88
    if-eqz v8, :cond_11

    .line 89
    .line 90
    check-cast v6, Lc50;

    .line 91
    .line 92
    iget-boolean v8, v6, Lq01;->σ:Z

    .line 93
    .line 94
    if-eqz v8, :cond_17

    .line 95
    .line 96
    invoke-virtual {v6}, Lc50;->Д()Lz40;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    iget-boolean v6, v6, Lz40;->α:Z

    .line 101
    .line 102
    if-eqz v6, :cond_17

    .line 103
    .line 104
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Ly40;

    .line 112
    .line 113
    iget-object p2, p2, Ly40;->γ:Lc50;

    .line 114
    .line 115
    iget-boolean p3, p2, Lq01;->σ:Z

    .line 116
    .line 117
    if-nez p3, :cond_3

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_3
    iget-object p3, p2, Lq01;->ε:Lq01;

    .line 122
    .line 123
    iget-boolean p3, p3, Lq01;->σ:Z

    .line 124
    .line 125
    if-nez p3, :cond_4

    .line 126
    .line 127
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    new-instance p3, Lk21;

    .line 131
    .line 132
    new-array v0, v3, [Lq01;

    .line 133
    .line 134
    invoke-direct {p3, v0}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p2, p2, Lq01;->ε:Lq01;

    .line 138
    .line 139
    iget-object v0, p2, Lq01;->κ:Lq01;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {p3, p2}, Lh62;->β(Lk21;Lq01;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-virtual {p3, v0}, Lk21;->β(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_3
    iget p2, p3, Lk21;->η:I

    .line 151
    .line 152
    if-eqz p2, :cond_10

    .line 153
    .line 154
    add-int/lit8 p2, p2, -0x1

    .line 155
    .line 156
    invoke-virtual {p3, p2}, Lk21;->λ(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Lq01;

    .line 161
    .line 162
    iget v0, p2, Lq01;->θ:I

    .line 163
    .line 164
    and-int/lit16 v0, v0, 0x400

    .line 165
    .line 166
    if-eqz v0, :cond_f

    .line 167
    .line 168
    move-object v0, p2

    .line 169
    :goto_4
    if-eqz v0, :cond_f

    .line 170
    .line 171
    iget-boolean v1, v0, Lq01;->σ:Z

    .line 172
    .line 173
    if-eqz v1, :cond_f

    .line 174
    .line 175
    iget v1, v0, Lq01;->η:I

    .line 176
    .line 177
    and-int/lit16 v1, v1, 0x400

    .line 178
    .line 179
    if-eqz v1, :cond_e

    .line 180
    .line 181
    move-object v1, v0

    .line 182
    move-object v2, v5

    .line 183
    :goto_5
    if-eqz v1, :cond_e

    .line 184
    .line 185
    instance-of v4, v1, Lc50;

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    check-cast v1, Lc50;

    .line 190
    .line 191
    iget-boolean v4, v1, Lq01;->σ:Z

    .line 192
    .line 193
    if-nez v4, :cond_6

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_6
    invoke-virtual {v1}, Lc50;->Д()Lz40;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 201
    .line 202
    if-eqz v1, :cond_d

    .line 203
    .line 204
    iget-boolean v1, v4, Lz40;->α:Z

    .line 205
    .line 206
    if-eqz v1, :cond_d

    .line 207
    .line 208
    goto/16 :goto_c

    .line 209
    .line 210
    :cond_7
    iget v4, v1, Lq01;->η:I

    .line 211
    .line 212
    and-int/lit16 v4, v4, 0x400

    .line 213
    .line 214
    if-eqz v4, :cond_d

    .line 215
    .line 216
    instance-of v4, v1, Lya;

    .line 217
    .line 218
    if-eqz v4, :cond_d

    .line 219
    .line 220
    move-object v4, v1

    .line 221
    check-cast v4, Lya;

    .line 222
    .line 223
    iget-object v4, v4, Lya;->υ:Lq01;

    .line 224
    .line 225
    move v6, v10

    .line 226
    :goto_6
    if-eqz v4, :cond_c

    .line 227
    .line 228
    iget v7, v4, Lq01;->η:I

    .line 229
    .line 230
    and-int/lit16 v7, v7, 0x400

    .line 231
    .line 232
    if-eqz v7, :cond_b

    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    if-ne v6, v9, :cond_8

    .line 237
    .line 238
    move-object v1, v4

    .line 239
    goto :goto_7

    .line 240
    :cond_8
    if-nez v2, :cond_9

    .line 241
    .line 242
    new-instance v2, Lk21;

    .line 243
    .line 244
    new-array v7, v3, [Lq01;

    .line 245
    .line 246
    invoke-direct {v2, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_9
    if-eqz v1, :cond_a

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object v1, v5

    .line 255
    :cond_a
    invoke-virtual {v2, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_b
    :goto_7
    iget-object v4, v4, Lq01;->κ:Lq01;

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_c
    if-ne v6, v9, :cond_d

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_d
    :goto_8
    invoke-static {v2}, Lh62;->γ(Lk21;)Lq01;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    goto :goto_5

    .line 269
    :cond_e
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_f
    invoke-static {p3, p2}, Lh62;->β(Lk21;Lq01;)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_10
    :goto_9
    if-eqz p1, :cond_1a

    .line 277
    .line 278
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_11
    iget v8, v6, Lq01;->η:I

    .line 283
    .line 284
    and-int/lit16 v8, v8, 0x400

    .line 285
    .line 286
    if-eqz v8, :cond_17

    .line 287
    .line 288
    instance-of v8, v6, Lya;

    .line 289
    .line 290
    if-eqz v8, :cond_17

    .line 291
    .line 292
    move-object v8, v6

    .line 293
    check-cast v8, Lya;

    .line 294
    .line 295
    iget-object v8, v8, Lya;->υ:Lq01;

    .line 296
    .line 297
    :goto_a
    if-eqz v8, :cond_16

    .line 298
    .line 299
    iget v11, v8, Lq01;->η:I

    .line 300
    .line 301
    and-int/lit16 v11, v11, 0x400

    .line 302
    .line 303
    if-eqz v11, :cond_15

    .line 304
    .line 305
    add-int/lit8 v10, v10, 0x1

    .line 306
    .line 307
    if-ne v10, v9, :cond_12

    .line 308
    .line 309
    move-object v6, v8

    .line 310
    goto :goto_b

    .line 311
    :cond_12
    if-nez v7, :cond_13

    .line 312
    .line 313
    new-instance v7, Lk21;

    .line 314
    .line 315
    new-array v11, v3, [Lq01;

    .line 316
    .line 317
    invoke-direct {v7, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_13
    if-eqz v6, :cond_14

    .line 321
    .line 322
    invoke-virtual {v7, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object v6, v5

    .line 326
    :cond_14
    invoke-virtual {v7, v8}, Lk21;->β(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_15
    :goto_b
    iget-object v8, v8, Lq01;->κ:Lq01;

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_16
    if-ne v10, v9, :cond_17

    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_17
    invoke-static {v7}, Lh62;->γ(Lk21;)Lq01;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    goto/16 :goto_2

    .line 341
    .line 342
    :cond_18
    iget-object v4, v4, Lq01;->κ:Lq01;

    .line 343
    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :cond_19
    invoke-static {v1, v0}, Lh62;->β(Lk21;Lq01;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_1a
    :goto_c
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 21
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 22
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 23
    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 25
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 3
    .line 4
    if-eqz v1, :cond_4

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    move v3, v0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_4

    .line 12
    .line 13
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Landroid/view/autofill/AutofillValue;

    .line 22
    .line 23
    iget-object v6, v1, Lk0;->ζ:Les1;

    .line 24
    .line 25
    iget-object v6, v6, Les1;->γ:Lsm0;

    .line 26
    .line 27
    invoke-virtual {v6, v4}, Lsm0;->β(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lyp0;

    .line 32
    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4}, Lyp0;->υ()Lxr1;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    iget-object v4, v4, Lxr1;->ε:Lb21;

    .line 42
    .line 43
    sget-object v6, Lwr1;->ζ:Lis1;

    .line 44
    .line 45
    invoke-virtual {v4, v6}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const/4 v7, 0x0

    .line 50
    if-nez v6, :cond_0

    .line 51
    .line 52
    move-object v6, v7

    .line 53
    :cond_0
    check-cast v6, Lм;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    iget-object v6, v6, Lм;->β:Lm80;

    .line 58
    .line 59
    check-cast v6, La80;

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    new-instance v8, Lg4;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-direct {v8, v9}, Lg4;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v6, v8}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_1
    sget-object v6, Lwr1;->η:Lis1;

    .line 83
    .line 84
    invoke-virtual {v4, v6}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-nez v4, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-object v7, v4

    .line 92
    :goto_1
    check-cast v7, Lм;

    .line 93
    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    iget-object v4, v7, Lм;->β:Lm80;

    .line 97
    .line 98
    check-cast v4, La80;

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    new-instance v6, Lg2;

    .line 103
    .line 104
    invoke-direct {v6, v5}, Lg2;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v4, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/Boolean;

    .line 112
    .line 113
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 117
    .line 118
    if-eqz p0, :cond_b

    .line 119
    .line 120
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, Ly7;

    .line 123
    .line 124
    iget-object v1, p0, Ly7;->α:Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :goto_2
    if-ge v0, v1, :cond_b

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Landroid/view/autofill/AutofillValue;

    .line 148
    .line 149
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isText()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_7

    .line 154
    .line 155
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    iget-object v3, p0, Ly7;->α:Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-nez v2, :cond_6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    invoke-static {}, Lγ;->β()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_7
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isDate()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-nez v2, :cond_a

    .line 184
    .line 185
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isList()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_9

    .line 190
    .line 191
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_8

    .line 196
    .line 197
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    new-instance p0, Lfq;

    .line 201
    .line 202
    const-string p1, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 203
    .line 204
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_9
    new-instance p0, Lfq;

    .line 209
    .line 210
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 211
    .line 212
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p0

    .line 216
    :cond_a
    new-instance p0, Lfq;

    .line 217
    .line 218
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 219
    .line 220
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p0

    .line 224
    :cond_b
    :goto_4
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ζ:J

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1, p1}, Ll1;->μ(JZ)V

    .line 7
    .line 8
    .line 9
    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ζ:J

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 5
    .line 6
    invoke-virtual {p0, v0, v1, p1}, Ll1;->μ(JZ)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Κ:Lv11;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->ν(Lyp0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->υ(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ltw1;->ν()V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Μ:Z

    .line 28
    .line 29
    const-string v1, "AndroidOwner:draw"

    .line 30
    .line 31
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->χ:Lge;

    .line 35
    .line 36
    iget-object v2, v1, Lge;->α:Ll0;

    .line 37
    .line 38
    iget-object v3, v2, Ll0;->α:Landroid/graphics/Canvas;

    .line 39
    .line 40
    iput-object p1, v2, Ll0;->α:Landroid/graphics/Canvas;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {v4, v2, v5}, Lyp0;->ι(Lde;Lwa0;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, Lge;->α:Ll0;

    .line 51
    .line 52
    iput-object v3, v1, Ll0;->α:Landroid/graphics/Canvas;

    .line 53
    .line 54
    invoke-virtual {v0}, Lv11;->ι()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget v1, v0, Lv11;->β:I

    .line 62
    .line 63
    move v3, v2

    .line 64
    :goto_0
    if-ge v3, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lw81;

    .line 71
    .line 72
    invoke-interface {v4}, Lw81;->θ()V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    sget-boolean v1, Landroidx/compose/ui/platform/ViewLayer;->κ:Z

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v3, v3, v3, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 88
    .line 89
    .line 90
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v0}, Lv11;->δ()V

    .line 97
    .line 98
    .line 99
    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Μ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Λ:Lv11;

    .line 105
    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lv11;->β(Lv11;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lv11;->δ()V

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ю:F

    .line 121
    .line 122
    invoke-static {p0, v0}, Ll4;->α(Landroid/view/View;F)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ο:Landroid/view/View;

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 130
    .line 131
    invoke-static {v0, v1}, Ll4;->α(Landroid/view/View;F)V

    .line 132
    .line 133
    .line 134
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_4

    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 150
    .line 151
    .line 152
    :cond_4
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 153
    .line 154
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ю:F

    .line 155
    .line 156
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 157
    .line 158
    :cond_5
    return-void

    .line 159
    :catchall_0
    move-exception p0

    .line 160
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 161
    .line 162
    .line 163
    throw p0
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Б:Lq0;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ne v5, v3, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Lq0;->run()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->π(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_66

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto/16 :goto_3f

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v5, -0x1

    .line 48
    const-string v6, "visitAncestors called on an unattached node"

    .line 49
    .line 50
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-ne v2, v3, :cond_33

    .line 54
    .line 55
    const/high16 v2, 0x400000

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_31

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/16 v3, 0x1a

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v3, Ly0;

    .line 99
    .line 100
    const/4 v10, 0x1

    .line 101
    invoke-direct {v3, v0, v10, v1}, Ly0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    check-cast v2, Ly40;

    .line 105
    .line 106
    iget-object v0, v2, Ly40;->δ:Ls40;

    .line 107
    .line 108
    iget-boolean v0, v0, Ls40;->ε:Z

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 113
    .line 114
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return v4

    .line 120
    :cond_3
    iget-object v0, v2, Ly40;->γ:Lc50;

    .line 121
    .line 122
    invoke-static {v0}, Lln0;->ω(Lc50;)Lc50;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_10

    .line 127
    .line 128
    iget-object v1, v0, Lq01;->ε:Lq01;

    .line 129
    .line 130
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 131
    .line 132
    if-nez v1, :cond_4

    .line 133
    .line 134
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    iget-object v1, v0, Lq01;->ε:Lq01;

    .line 138
    .line 139
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_1
    if-eqz v0, :cond_f

    .line 144
    .line 145
    iget-object v2, v0, Lyp0;->Κ:Lk31;

    .line 146
    .line 147
    iget-object v2, v2, Lk31;->ζ:Lq01;

    .line 148
    .line 149
    iget v2, v2, Lq01;->θ:I

    .line 150
    .line 151
    and-int/lit16 v2, v2, 0x4000

    .line 152
    .line 153
    if-eqz v2, :cond_d

    .line 154
    .line 155
    :goto_2
    if-eqz v1, :cond_d

    .line 156
    .line 157
    iget v2, v1, Lq01;->η:I

    .line 158
    .line 159
    and-int/lit16 v2, v2, 0x4000

    .line 160
    .line 161
    if-eqz v2, :cond_c

    .line 162
    .line 163
    move-object v2, v1

    .line 164
    const/4 v10, 0x0

    .line 165
    :goto_3
    if-eqz v2, :cond_c

    .line 166
    .line 167
    instance-of v11, v2, Lu0;

    .line 168
    .line 169
    if-eqz v11, :cond_5

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_5
    iget v11, v2, Lq01;->η:I

    .line 173
    .line 174
    and-int/lit16 v11, v11, 0x4000

    .line 175
    .line 176
    if-eqz v11, :cond_b

    .line 177
    .line 178
    instance-of v11, v2, Lya;

    .line 179
    .line 180
    if-eqz v11, :cond_b

    .line 181
    .line 182
    move-object v11, v2

    .line 183
    check-cast v11, Lya;

    .line 184
    .line 185
    iget-object v11, v11, Lya;->υ:Lq01;

    .line 186
    .line 187
    move v12, v4

    .line 188
    :goto_4
    if-eqz v11, :cond_a

    .line 189
    .line 190
    iget v13, v11, Lq01;->η:I

    .line 191
    .line 192
    and-int/lit16 v13, v13, 0x4000

    .line 193
    .line 194
    if-eqz v13, :cond_9

    .line 195
    .line 196
    add-int/lit8 v12, v12, 0x1

    .line 197
    .line 198
    if-ne v12, v9, :cond_6

    .line 199
    .line 200
    move-object v2, v11

    .line 201
    goto :goto_5

    .line 202
    :cond_6
    if-nez v10, :cond_7

    .line 203
    .line 204
    new-instance v10, Lk21;

    .line 205
    .line 206
    new-array v13, v8, [Lq01;

    .line 207
    .line 208
    invoke-direct {v10, v13}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    if-eqz v2, :cond_8

    .line 212
    .line 213
    invoke-virtual {v10, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    :cond_8
    invoke-virtual {v10, v11}, Lk21;->β(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_9
    :goto_5
    iget-object v11, v11, Lq01;->κ:Lq01;

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_a
    if-ne v12, v9, :cond_b

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_b
    invoke-static {v10}, Lh62;->γ(Lk21;)Lq01;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_3

    .line 231
    :cond_c
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_d
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-eqz v0, :cond_e

    .line 239
    .line 240
    iget-object v1, v0, Lyp0;->Κ:Lk31;

    .line 241
    .line 242
    if-eqz v1, :cond_e

    .line 243
    .line 244
    iget-object v1, v1, Lk31;->ε:Lq22;

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_e
    const/4 v1, 0x0

    .line 248
    goto :goto_1

    .line 249
    :cond_f
    const/4 v2, 0x0

    .line 250
    :goto_6
    check-cast v2, Lu0;

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_10
    const/4 v2, 0x0

    .line 254
    :goto_7
    if-eqz v2, :cond_32

    .line 255
    .line 256
    iget-object v0, v2, Lq01;->ε:Lq01;

    .line 257
    .line 258
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 259
    .line 260
    if-nez v0, :cond_11

    .line 261
    .line 262
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_11
    iget-object v0, v2, Lq01;->ε:Lq01;

    .line 266
    .line 267
    iget-object v0, v0, Lq01;->ι:Lq01;

    .line 268
    .line 269
    invoke-static {v2}, Lh62;->ц(Lur;)Lyp0;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    const/4 v6, 0x0

    .line 274
    :goto_8
    if-eqz v1, :cond_1d

    .line 275
    .line 276
    iget-object v10, v1, Lyp0;->Κ:Lk31;

    .line 277
    .line 278
    iget-object v10, v10, Lk31;->ζ:Lq01;

    .line 279
    .line 280
    iget v10, v10, Lq01;->θ:I

    .line 281
    .line 282
    and-int/lit16 v10, v10, 0x4000

    .line 283
    .line 284
    if-eqz v10, :cond_1b

    .line 285
    .line 286
    :goto_9
    if-eqz v0, :cond_1b

    .line 287
    .line 288
    iget v10, v0, Lq01;->η:I

    .line 289
    .line 290
    and-int/lit16 v10, v10, 0x4000

    .line 291
    .line 292
    if-eqz v10, :cond_1a

    .line 293
    .line 294
    move-object v10, v0

    .line 295
    const/4 v11, 0x0

    .line 296
    :goto_a
    if-eqz v10, :cond_1a

    .line 297
    .line 298
    instance-of v12, v10, Lu0;

    .line 299
    .line 300
    if-eqz v12, :cond_13

    .line 301
    .line 302
    if-nez v6, :cond_12

    .line 303
    .line 304
    new-instance v6, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    :cond_12
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move v12, v4

    .line 313
    goto :goto_b

    .line 314
    :cond_13
    move v12, v9

    .line 315
    :goto_b
    if-eqz v12, :cond_19

    .line 316
    .line 317
    iget v12, v10, Lq01;->η:I

    .line 318
    .line 319
    and-int/lit16 v12, v12, 0x4000

    .line 320
    .line 321
    if-eqz v12, :cond_19

    .line 322
    .line 323
    instance-of v12, v10, Lya;

    .line 324
    .line 325
    if-eqz v12, :cond_19

    .line 326
    .line 327
    move-object v12, v10

    .line 328
    check-cast v12, Lya;

    .line 329
    .line 330
    iget-object v12, v12, Lya;->υ:Lq01;

    .line 331
    .line 332
    move v13, v4

    .line 333
    :goto_c
    if-eqz v12, :cond_18

    .line 334
    .line 335
    iget v14, v12, Lq01;->η:I

    .line 336
    .line 337
    and-int/lit16 v14, v14, 0x4000

    .line 338
    .line 339
    if-eqz v14, :cond_17

    .line 340
    .line 341
    add-int/lit8 v13, v13, 0x1

    .line 342
    .line 343
    if-ne v13, v9, :cond_14

    .line 344
    .line 345
    move-object v10, v12

    .line 346
    goto :goto_d

    .line 347
    :cond_14
    if-nez v11, :cond_15

    .line 348
    .line 349
    new-instance v11, Lk21;

    .line 350
    .line 351
    new-array v14, v8, [Lq01;

    .line 352
    .line 353
    invoke-direct {v11, v14}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :cond_15
    if-eqz v10, :cond_16

    .line 357
    .line 358
    invoke-virtual {v11, v10}, Lk21;->β(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    const/4 v10, 0x0

    .line 362
    :cond_16
    invoke-virtual {v11, v12}, Lk21;->β(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_17
    :goto_d
    iget-object v12, v12, Lq01;->κ:Lq01;

    .line 366
    .line 367
    goto :goto_c

    .line 368
    :cond_18
    if-ne v13, v9, :cond_19

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_19
    invoke-static {v11}, Lh62;->γ(Lk21;)Lq01;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    goto :goto_a

    .line 376
    :cond_1a
    iget-object v0, v0, Lq01;->ι:Lq01;

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_1b
    invoke-virtual {v1}, Lyp0;->σ()Lyp0;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-eqz v1, :cond_1c

    .line 384
    .line 385
    iget-object v0, v1, Lyp0;->Κ:Lk31;

    .line 386
    .line 387
    if-eqz v0, :cond_1c

    .line 388
    .line 389
    iget-object v0, v0, Lk31;->ε:Lq22;

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_1c
    const/4 v0, 0x0

    .line 393
    goto :goto_8

    .line 394
    :cond_1d
    if-eqz v6, :cond_1f

    .line 395
    .line 396
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    add-int/2addr v0, v5

    .line 401
    if-ltz v0, :cond_1f

    .line 402
    .line 403
    :goto_e
    add-int/lit8 v1, v0, -0x1

    .line 404
    .line 405
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    check-cast v0, Lu0;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    if-gez v1, :cond_1e

    .line 415
    .line 416
    goto :goto_f

    .line 417
    :cond_1e
    move v0, v1

    .line 418
    goto :goto_e

    .line 419
    :cond_1f
    :goto_f
    iget-object v0, v2, Lq01;->ε:Lq01;

    .line 420
    .line 421
    const/4 v1, 0x0

    .line 422
    :goto_10
    if-eqz v0, :cond_27

    .line 423
    .line 424
    instance-of v5, v0, Lu0;

    .line 425
    .line 426
    if-eqz v5, :cond_20

    .line 427
    .line 428
    check-cast v0, Lu0;

    .line 429
    .line 430
    goto :goto_13

    .line 431
    :cond_20
    iget v5, v0, Lq01;->η:I

    .line 432
    .line 433
    and-int/lit16 v5, v5, 0x4000

    .line 434
    .line 435
    if-eqz v5, :cond_26

    .line 436
    .line 437
    instance-of v5, v0, Lya;

    .line 438
    .line 439
    if-eqz v5, :cond_26

    .line 440
    .line 441
    move-object v5, v0

    .line 442
    check-cast v5, Lya;

    .line 443
    .line 444
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 445
    .line 446
    move v10, v4

    .line 447
    :goto_11
    if-eqz v5, :cond_25

    .line 448
    .line 449
    iget v11, v5, Lq01;->η:I

    .line 450
    .line 451
    and-int/lit16 v11, v11, 0x4000

    .line 452
    .line 453
    if-eqz v11, :cond_24

    .line 454
    .line 455
    add-int/lit8 v10, v10, 0x1

    .line 456
    .line 457
    if-ne v10, v9, :cond_21

    .line 458
    .line 459
    move-object v0, v5

    .line 460
    goto :goto_12

    .line 461
    :cond_21
    if-nez v1, :cond_22

    .line 462
    .line 463
    new-instance v1, Lk21;

    .line 464
    .line 465
    new-array v11, v8, [Lq01;

    .line 466
    .line 467
    invoke-direct {v1, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :cond_22
    if-eqz v0, :cond_23

    .line 471
    .line 472
    invoke-virtual {v1, v0}, Lk21;->β(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    const/4 v0, 0x0

    .line 476
    :cond_23
    invoke-virtual {v1, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_24
    :goto_12
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 480
    .line 481
    goto :goto_11

    .line 482
    :cond_25
    if-ne v10, v9, :cond_26

    .line 483
    .line 484
    goto :goto_10

    .line 485
    :cond_26
    :goto_13
    invoke-static {v1}, Lh62;->γ(Lk21;)Lq01;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    goto :goto_10

    .line 490
    :cond_27
    invoke-virtual {v3}, Ly0;->invoke()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    check-cast v0, Ljava/lang/Boolean;

    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_28

    .line 501
    .line 502
    goto/16 :goto_19

    .line 503
    .line 504
    :cond_28
    iget-object v0, v2, Lq01;->ε:Lq01;

    .line 505
    .line 506
    const/4 v1, 0x0

    .line 507
    :goto_14
    if-eqz v0, :cond_30

    .line 508
    .line 509
    instance-of v2, v0, Lu0;

    .line 510
    .line 511
    if-eqz v2, :cond_29

    .line 512
    .line 513
    check-cast v0, Lu0;

    .line 514
    .line 515
    goto :goto_17

    .line 516
    :cond_29
    iget v2, v0, Lq01;->η:I

    .line 517
    .line 518
    and-int/lit16 v2, v2, 0x4000

    .line 519
    .line 520
    if-eqz v2, :cond_2f

    .line 521
    .line 522
    instance-of v2, v0, Lya;

    .line 523
    .line 524
    if-eqz v2, :cond_2f

    .line 525
    .line 526
    move-object v2, v0

    .line 527
    check-cast v2, Lya;

    .line 528
    .line 529
    iget-object v2, v2, Lya;->υ:Lq01;

    .line 530
    .line 531
    move v3, v4

    .line 532
    :goto_15
    if-eqz v2, :cond_2e

    .line 533
    .line 534
    iget v5, v2, Lq01;->η:I

    .line 535
    .line 536
    and-int/lit16 v5, v5, 0x4000

    .line 537
    .line 538
    if-eqz v5, :cond_2d

    .line 539
    .line 540
    add-int/lit8 v3, v3, 0x1

    .line 541
    .line 542
    if-ne v3, v9, :cond_2a

    .line 543
    .line 544
    move-object v0, v2

    .line 545
    goto :goto_16

    .line 546
    :cond_2a
    if-nez v1, :cond_2b

    .line 547
    .line 548
    new-instance v1, Lk21;

    .line 549
    .line 550
    new-array v5, v8, [Lq01;

    .line 551
    .line 552
    invoke-direct {v1, v5}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_2b
    if-eqz v0, :cond_2c

    .line 556
    .line 557
    invoke-virtual {v1, v0}, Lk21;->β(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    const/4 v0, 0x0

    .line 561
    :cond_2c
    invoke-virtual {v1, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_2d
    :goto_16
    iget-object v2, v2, Lq01;->κ:Lq01;

    .line 565
    .line 566
    goto :goto_15

    .line 567
    :cond_2e
    if-ne v3, v9, :cond_2f

    .line 568
    .line 569
    goto :goto_14

    .line 570
    :cond_2f
    :goto_17
    invoke-static {v1}, Lh62;->γ(Lk21;)Lq01;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    goto :goto_14

    .line 575
    :cond_30
    if-eqz v6, :cond_32

    .line 576
    .line 577
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    move v1, v4

    .line 582
    :goto_18
    if-ge v1, v0, :cond_32

    .line 583
    .line 584
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    check-cast v2, Lu0;

    .line 589
    .line 590
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    add-int/lit8 v1, v1, 0x1

    .line 594
    .line 595
    goto :goto_18

    .line 596
    :cond_31
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->μ(Landroid/view/MotionEvent;)I

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    and-int/lit8 v0, v0, 0x4

    .line 601
    .line 602
    if-eqz v0, :cond_32

    .line 603
    .line 604
    :goto_19
    return v9

    .line 605
    :cond_32
    return v4

    .line 606
    :cond_33
    const/high16 v2, 0x200000

    .line 607
    .line 608
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    if-eqz v3, :cond_65

    .line 613
    .line 614
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Ν:Lb11;

    .line 615
    .line 616
    iget-object v10, v3, Lb11;->ε:Lzv0;

    .line 617
    .line 618
    iget-object v11, v3, Lb11;->β:Landroid/util/SparseLongArray;

    .line 619
    .line 620
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 621
    .line 622
    .line 623
    move-result v12

    .line 624
    invoke-virtual {v3, v1}, Lb11;->β(Landroid/view/MotionEvent;)V

    .line 625
    .line 626
    .line 627
    const/4 v13, 0x3

    .line 628
    const/4 v14, 0x2

    .line 629
    if-ne v12, v13, :cond_34

    .line 630
    .line 631
    invoke-virtual {v11}, Landroid/util/SparseLongArray;->clear()V

    .line 632
    .line 633
    .line 634
    iget-object v1, v3, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 635
    .line 636
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 637
    .line 638
    .line 639
    move/from16 v17, v8

    .line 640
    .line 641
    const/4 v3, 0x0

    .line 642
    goto/16 :goto_2d

    .line 643
    .line 644
    :cond_34
    invoke-virtual {v3, v1}, Lb11;->α(Landroid/view/MotionEvent;)V

    .line 645
    .line 646
    .line 647
    const/4 v13, 0x6

    .line 648
    if-eq v12, v9, :cond_36

    .line 649
    .line 650
    if-eq v12, v13, :cond_35

    .line 651
    .line 652
    goto :goto_1a

    .line 653
    :cond_35
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    goto :goto_1a

    .line 658
    :cond_36
    move v5, v4

    .line 659
    :goto_1a
    const/4 v15, 0x5

    .line 660
    if-eqz v12, :cond_37

    .line 661
    .line 662
    if-eq v12, v14, :cond_37

    .line 663
    .line 664
    if-eq v12, v15, :cond_37

    .line 665
    .line 666
    move/from16 v16, v4

    .line 667
    .line 668
    goto :goto_1b

    .line 669
    :cond_37
    move/from16 v16, v9

    .line 670
    .line 671
    :goto_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    move/from16 v17, v8

    .line 676
    .line 677
    new-instance v8, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 680
    .line 681
    .line 682
    move v13, v4

    .line 683
    :goto_1c
    if-ge v13, v7, :cond_40

    .line 684
    .line 685
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 686
    .line 687
    .line 688
    move-result v15

    .line 689
    invoke-virtual {v11, v15}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 690
    .line 691
    .line 692
    move-result v14

    .line 693
    const-wide/16 v18, 0x1

    .line 694
    .line 695
    if-ltz v14, :cond_38

    .line 696
    .line 697
    invoke-virtual {v11, v14}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 698
    .line 699
    .line 700
    move-result-wide v14

    .line 701
    move/from16 v21, v5

    .line 702
    .line 703
    move-object/from16 v20, v10

    .line 704
    .line 705
    move-wide/from16 v39, v14

    .line 706
    .line 707
    move v14, v9

    .line 708
    move-wide/from16 v9, v39

    .line 709
    .line 710
    goto :goto_1d

    .line 711
    :cond_38
    move v14, v9

    .line 712
    move-object/from16 v20, v10

    .line 713
    .line 714
    iget-wide v9, v3, Lb11;->α:J

    .line 715
    .line 716
    move/from16 v21, v5

    .line 717
    .line 718
    add-long v4, v9, v18

    .line 719
    .line 720
    iput-wide v4, v3, Lb11;->α:J

    .line 721
    .line 722
    invoke-virtual {v11, v15, v9, v10}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 723
    .line 724
    .line 725
    :goto_1d
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getX(I)F

    .line 726
    .line 727
    .line 728
    move-result v4

    .line 729
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getY(I)F

    .line 730
    .line 731
    .line 732
    move-result v5

    .line 733
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    move/from16 v36, v14

    .line 738
    .line 739
    int-to-long v14, v4

    .line 740
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 741
    .line 742
    .line 743
    move-result v4

    .line 744
    int-to-long v4, v4

    .line 745
    const/16 v22, 0x20

    .line 746
    .line 747
    shl-long v14, v14, v22

    .line 748
    .line 749
    const-wide v23, 0xffffffffL

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    and-long v4, v4, v23

    .line 755
    .line 756
    or-long v27, v14, v4

    .line 757
    .line 758
    move/from16 v5, v21

    .line 759
    .line 760
    if-eq v13, v5, :cond_39

    .line 761
    .line 762
    move/from16 v29, v36

    .line 763
    .line 764
    :goto_1e
    move-object/from16 v4, v20

    .line 765
    .line 766
    goto :goto_1f

    .line 767
    :cond_39
    const/16 v29, 0x0

    .line 768
    .line 769
    goto :goto_1e

    .line 770
    :goto_1f
    invoke-virtual {v4, v9, v10}, Lzv0;->β(J)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v14

    .line 774
    check-cast v14, La11;

    .line 775
    .line 776
    const v15, 0xffff

    .line 777
    .line 778
    .line 779
    const-wide/32 v25, 0x7fffffff

    .line 780
    .line 781
    .line 782
    if-ne v13, v5, :cond_3b

    .line 783
    .line 784
    invoke-virtual {v4, v9, v10}, Lzv0;->ε(J)V

    .line 785
    .line 786
    .line 787
    :cond_3a
    move-object/from16 v21, v3

    .line 788
    .line 789
    move/from16 v30, v15

    .line 790
    .line 791
    :goto_20
    move/from16 v2, v22

    .line 792
    .line 793
    goto :goto_21

    .line 794
    :cond_3b
    if-eqz v16, :cond_3a

    .line 795
    .line 796
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 797
    .line 798
    .line 799
    move-result-wide v30

    .line 800
    and-long v30, v30, v25

    .line 801
    .line 802
    shl-long v30, v30, v36

    .line 803
    .line 804
    or-long v30, v18, v30

    .line 805
    .line 806
    move-object/from16 v21, v3

    .line 807
    .line 808
    shr-long v2, v27, v22

    .line 809
    .line 810
    long-to-int v2, v2

    .line 811
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    float-to-int v2, v2

    .line 816
    int-to-short v2, v2

    .line 817
    move/from16 v32, v2

    .line 818
    .line 819
    and-long v2, v27, v23

    .line 820
    .line 821
    long-to-int v2, v2

    .line 822
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    float-to-int v2, v2

    .line 827
    int-to-short v2, v2

    .line 828
    shl-int/lit8 v3, v32, 0x10

    .line 829
    .line 830
    and-int/2addr v2, v15

    .line 831
    or-int/2addr v2, v3

    .line 832
    int-to-long v2, v2

    .line 833
    shl-long v2, v2, v22

    .line 834
    .line 835
    or-long v2, v30, v2

    .line 836
    .line 837
    move/from16 v30, v15

    .line 838
    .line 839
    new-instance v15, La11;

    .line 840
    .line 841
    invoke-direct {v15, v2, v3}, La11;-><init>(J)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v4, v9, v10, v15}, Lzv0;->δ(JLjava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    goto :goto_20

    .line 848
    :goto_21
    new-instance v22, Lsl0;

    .line 849
    .line 850
    move-wide/from16 v31, v25

    .line 851
    .line 852
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 853
    .line 854
    .line 855
    move-result-wide v25

    .line 856
    move/from16 v3, v30

    .line 857
    .line 858
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 859
    .line 860
    .line 861
    move-result v30

    .line 862
    move v15, v2

    .line 863
    move/from16 v33, v3

    .line 864
    .line 865
    if-eqz v14, :cond_3c

    .line 866
    .line 867
    iget-wide v2, v14, La11;->α:J

    .line 868
    .line 869
    shr-long v2, v2, v36

    .line 870
    .line 871
    and-long v2, v2, v31

    .line 872
    .line 873
    :goto_22
    move-wide/from16 v31, v2

    .line 874
    .line 875
    goto :goto_23

    .line 876
    :cond_3c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 877
    .line 878
    .line 879
    move-result-wide v2

    .line 880
    goto :goto_22

    .line 881
    :goto_23
    if-eqz v14, :cond_3d

    .line 882
    .line 883
    iget-wide v2, v14, La11;->α:J

    .line 884
    .line 885
    ushr-long/2addr v2, v15

    .line 886
    long-to-int v2, v2

    .line 887
    ushr-int/lit8 v3, v2, 0x10

    .line 888
    .line 889
    int-to-short v3, v3

    .line 890
    int-to-float v3, v3

    .line 891
    and-int v2, v2, v33

    .line 892
    .line 893
    int-to-short v2, v2

    .line 894
    int-to-float v2, v2

    .line 895
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    move/from16 v33, v2

    .line 900
    .line 901
    int-to-long v2, v3

    .line 902
    move/from16 v34, v15

    .line 903
    .line 904
    invoke-static/range {v33 .. v33}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 905
    .line 906
    .line 907
    move-result v15

    .line 908
    move-wide/from16 v37, v2

    .line 909
    .line 910
    int-to-long v2, v15

    .line 911
    shl-long v33, v37, v34

    .line 912
    .line 913
    and-long v2, v2, v23

    .line 914
    .line 915
    or-long v2, v33, v2

    .line 916
    .line 917
    move-wide/from16 v33, v2

    .line 918
    .line 919
    goto :goto_24

    .line 920
    :cond_3d
    move-wide/from16 v33, v27

    .line 921
    .line 922
    :goto_24
    if-eqz v14, :cond_3f

    .line 923
    .line 924
    iget-wide v2, v14, La11;->α:J

    .line 925
    .line 926
    and-long v2, v2, v18

    .line 927
    .line 928
    const-wide/16 v14, 0x0

    .line 929
    .line 930
    cmp-long v2, v2, v14

    .line 931
    .line 932
    if-eqz v2, :cond_3e

    .line 933
    .line 934
    move/from16 v14, v36

    .line 935
    .line 936
    goto :goto_25

    .line 937
    :cond_3e
    const/4 v14, 0x0

    .line 938
    :goto_25
    move/from16 v35, v14

    .line 939
    .line 940
    :goto_26
    move-wide/from16 v23, v9

    .line 941
    .line 942
    goto :goto_27

    .line 943
    :cond_3f
    const/16 v35, 0x0

    .line 944
    .line 945
    goto :goto_26

    .line 946
    :goto_27
    invoke-direct/range {v22 .. v35}, Lsl0;-><init>(JJJZFJJZ)V

    .line 947
    .line 948
    .line 949
    move-object/from16 v2, v22

    .line 950
    .line 951
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    add-int/lit8 v13, v13, 0x1

    .line 955
    .line 956
    move-object v10, v4

    .line 957
    move-object/from16 v3, v21

    .line 958
    .line 959
    move/from16 v9, v36

    .line 960
    .line 961
    const/high16 v2, 0x200000

    .line 962
    .line 963
    const/4 v4, 0x0

    .line 964
    const/4 v14, 0x2

    .line 965
    const/4 v15, 0x5

    .line 966
    goto/16 :goto_1c

    .line 967
    .line 968
    :cond_40
    move-object v2, v3

    .line 969
    move/from16 v36, v9

    .line 970
    .line 971
    invoke-virtual {v2, v1}, Lb11;->ε(Landroid/view/MotionEvent;)V

    .line 972
    .line 973
    .line 974
    const/high16 v2, 0x200000

    .line 975
    .line 976
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-eqz v3, :cond_64

    .line 981
    .line 982
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    if-eqz v2, :cond_46

    .line 987
    .line 988
    const/4 v3, 0x0

    .line 989
    invoke-virtual {v2, v3}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    move/from16 v14, v36

    .line 994
    .line 995
    invoke-virtual {v2, v14}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    if-eqz v4, :cond_41

    .line 1000
    .line 1001
    if-nez v2, :cond_41

    .line 1002
    .line 1003
    :goto_28
    const/4 v2, 0x1

    .line 1004
    goto :goto_2c

    .line 1005
    :cond_41
    if-eqz v2, :cond_42

    .line 1006
    .line 1007
    if-nez v4, :cond_42

    .line 1008
    .line 1009
    :goto_29
    const/4 v2, 0x2

    .line 1010
    goto :goto_2c

    .line 1011
    :cond_42
    if-eqz v4, :cond_46

    .line 1012
    .line 1013
    if-eqz v2, :cond_46

    .line 1014
    .line 1015
    invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1020
    .line 1021
    .line 1022
    move-result v2

    .line 1023
    cmpl-float v4, v3, v2

    .line 1024
    .line 1025
    const/high16 v5, 0x40a00000    # 5.0f

    .line 1026
    .line 1027
    const/4 v7, 0x0

    .line 1028
    if-lez v4, :cond_44

    .line 1029
    .line 1030
    cmpg-float v4, v2, v7

    .line 1031
    .line 1032
    if-nez v4, :cond_43

    .line 1033
    .line 1034
    goto :goto_2a

    .line 1035
    :cond_43
    div-float v4, v3, v2

    .line 1036
    .line 1037
    cmpl-float v4, v4, v5

    .line 1038
    .line 1039
    if-ltz v4, :cond_44

    .line 1040
    .line 1041
    :goto_2a
    goto :goto_28

    .line 1042
    :cond_44
    cmpl-float v4, v2, v3

    .line 1043
    .line 1044
    if-lez v4, :cond_46

    .line 1045
    .line 1046
    cmpg-float v4, v3, v7

    .line 1047
    .line 1048
    if-nez v4, :cond_45

    .line 1049
    .line 1050
    goto :goto_2b

    .line 1051
    :cond_45
    div-float/2addr v2, v3

    .line 1052
    cmpl-float v2, v2, v5

    .line 1053
    .line 1054
    if-ltz v2, :cond_46

    .line 1055
    .line 1056
    :goto_2b
    goto :goto_29

    .line 1057
    :cond_46
    const/4 v2, 0x0

    .line 1058
    :goto_2c
    new-instance v3, Ln2;

    .line 1059
    .line 1060
    if-eqz v12, :cond_47

    .line 1061
    .line 1062
    const/4 v14, 0x1

    .line 1063
    if-eq v12, v14, :cond_47

    .line 1064
    .line 1065
    const/4 v4, 0x2

    .line 1066
    if-eq v12, v4, :cond_47

    .line 1067
    .line 1068
    const/4 v4, 0x5

    .line 1069
    if-eq v12, v4, :cond_47

    .line 1070
    .line 1071
    const/4 v4, 0x6

    .line 1072
    :cond_47
    invoke-direct {v3, v8, v2, v1}, Ln2;-><init>(Ljava/util/ArrayList;ILandroid/view/MotionEvent;)V

    .line 1073
    .line 1074
    .line 1075
    :goto_2d
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Г:Lul0;

    .line 1076
    .line 1077
    if-eqz v3, :cond_57

    .line 1078
    .line 1079
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    check-cast v0, Ly40;

    .line 1084
    .line 1085
    iget-object v2, v0, Ly40;->δ:Ls40;

    .line 1086
    .line 1087
    iget-boolean v2, v2, Ls40;->ε:Z

    .line 1088
    .line 1089
    if-eqz v2, :cond_48

    .line 1090
    .line 1091
    const-string v0, "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."

    .line 1092
    .line 1093
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 1094
    .line 1095
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    goto/16 :goto_36

    .line 1099
    .line 1100
    :cond_48
    invoke-virtual {v0}, Ly40;->ζ()Lc50;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    if-eqz v0, :cond_53

    .line 1105
    .line 1106
    iget-object v2, v0, Lq01;->ε:Lq01;

    .line 1107
    .line 1108
    iget-boolean v2, v2, Lq01;->σ:Z

    .line 1109
    .line 1110
    if-nez v2, :cond_49

    .line 1111
    .line 1112
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_49
    iget-object v2, v0, Lq01;->ε:Lq01;

    .line 1116
    .line 1117
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    :goto_2e
    if-eqz v0, :cond_53

    .line 1122
    .line 1123
    iget-object v4, v0, Lyp0;->Κ:Lk31;

    .line 1124
    .line 1125
    iget-object v4, v4, Lk31;->ζ:Lq01;

    .line 1126
    .line 1127
    iget v4, v4, Lq01;->θ:I

    .line 1128
    .line 1129
    const/high16 v20, 0x200000

    .line 1130
    .line 1131
    and-int v4, v4, v20

    .line 1132
    .line 1133
    if-eqz v4, :cond_51

    .line 1134
    .line 1135
    :goto_2f
    if-eqz v2, :cond_51

    .line 1136
    .line 1137
    iget v4, v2, Lq01;->η:I

    .line 1138
    .line 1139
    and-int v4, v4, v20

    .line 1140
    .line 1141
    if-eqz v4, :cond_50

    .line 1142
    .line 1143
    move-object v4, v2

    .line 1144
    const/4 v5, 0x0

    .line 1145
    :goto_30
    if-eqz v4, :cond_50

    .line 1146
    .line 1147
    iget v6, v4, Lq01;->η:I

    .line 1148
    .line 1149
    and-int v6, v6, v20

    .line 1150
    .line 1151
    if-eqz v6, :cond_4f

    .line 1152
    .line 1153
    instance-of v6, v4, Lya;

    .line 1154
    .line 1155
    if-eqz v6, :cond_4f

    .line 1156
    .line 1157
    move-object v6, v4

    .line 1158
    check-cast v6, Lya;

    .line 1159
    .line 1160
    iget-object v6, v6, Lya;->υ:Lq01;

    .line 1161
    .line 1162
    const/4 v7, 0x0

    .line 1163
    :goto_31
    if-eqz v6, :cond_4e

    .line 1164
    .line 1165
    iget v8, v6, Lq01;->η:I

    .line 1166
    .line 1167
    and-int v8, v8, v20

    .line 1168
    .line 1169
    if-eqz v8, :cond_4d

    .line 1170
    .line 1171
    add-int/lit8 v7, v7, 0x1

    .line 1172
    .line 1173
    const/4 v14, 0x1

    .line 1174
    if-ne v7, v14, :cond_4a

    .line 1175
    .line 1176
    move-object v4, v6

    .line 1177
    goto :goto_32

    .line 1178
    :cond_4a
    if-nez v5, :cond_4b

    .line 1179
    .line 1180
    new-instance v5, Lk21;

    .line 1181
    .line 1182
    move/from16 v8, v17

    .line 1183
    .line 1184
    new-array v9, v8, [Lq01;

    .line 1185
    .line 1186
    invoke-direct {v5, v9}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    :cond_4b
    if-eqz v4, :cond_4c

    .line 1190
    .line 1191
    invoke-virtual {v5, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 1192
    .line 1193
    .line 1194
    const/4 v4, 0x0

    .line 1195
    :cond_4c
    invoke-virtual {v5, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    :cond_4d
    :goto_32
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 1199
    .line 1200
    const/16 v17, 0x10

    .line 1201
    .line 1202
    const/high16 v20, 0x200000

    .line 1203
    .line 1204
    goto :goto_31

    .line 1205
    :cond_4e
    const/4 v14, 0x1

    .line 1206
    if-ne v7, v14, :cond_4f

    .line 1207
    .line 1208
    :goto_33
    const/16 v17, 0x10

    .line 1209
    .line 1210
    const/high16 v20, 0x200000

    .line 1211
    .line 1212
    goto :goto_30

    .line 1213
    :cond_4f
    invoke-static {v5}, Lh62;->γ(Lk21;)Lq01;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v4

    .line 1217
    goto :goto_33

    .line 1218
    :cond_50
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 1219
    .line 1220
    const/16 v17, 0x10

    .line 1221
    .line 1222
    const/high16 v20, 0x200000

    .line 1223
    .line 1224
    goto :goto_2f

    .line 1225
    :cond_51
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    if-eqz v0, :cond_52

    .line 1230
    .line 1231
    iget-object v2, v0, Lyp0;->Κ:Lk31;

    .line 1232
    .line 1233
    if-eqz v2, :cond_52

    .line 1234
    .line 1235
    iget-object v2, v2, Lk31;->ε:Lq22;

    .line 1236
    .line 1237
    goto :goto_34

    .line 1238
    :cond_52
    const/4 v2, 0x0

    .line 1239
    :goto_34
    const/16 v17, 0x10

    .line 1240
    .line 1241
    goto :goto_2e

    .line 1242
    :cond_53
    iget-object v0, v3, Ln2;->γ:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v0, Ljava/util/ArrayList;

    .line 1245
    .line 1246
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1247
    .line 1248
    .line 1249
    move-result v2

    .line 1250
    const/4 v4, 0x0

    .line 1251
    :goto_35
    if-ge v4, v2, :cond_54

    .line 1252
    .line 1253
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v5

    .line 1257
    check-cast v5, Lsl0;

    .line 1258
    .line 1259
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1260
    .line 1261
    .line 1262
    add-int/lit8 v4, v4, 0x1

    .line 1263
    .line 1264
    goto :goto_35

    .line 1265
    :cond_54
    :goto_36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1266
    .line 1267
    .line 1268
    iget-object v0, v3, Ln2;->δ:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v0, Landroid/view/MotionEvent;

    .line 1271
    .line 1272
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 1273
    .line 1274
    .line 1275
    move-result v2

    .line 1276
    if-eqz v2, :cond_55

    .line 1277
    .line 1278
    const/4 v14, 0x1

    .line 1279
    if-eq v2, v14, :cond_56

    .line 1280
    .line 1281
    const/4 v4, 0x2

    .line 1282
    goto :goto_37

    .line 1283
    :cond_55
    iget v2, v3, Ln2;->β:I

    .line 1284
    .line 1285
    iput v2, v1, Lul0;->β:I

    .line 1286
    .line 1287
    const/4 v3, 0x0

    .line 1288
    iput-boolean v3, v1, Lul0;->γ:Z

    .line 1289
    .line 1290
    :cond_56
    :goto_37
    iget-object v1, v1, Lul0;->δ:Landroid/view/GestureDetector;

    .line 1291
    .line 1292
    invoke-virtual {v1, v0}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1293
    .line 1294
    .line 1295
    const/4 v14, 0x1

    .line 1296
    return v14

    .line 1297
    :cond_57
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    check-cast v0, Ly40;

    .line 1302
    .line 1303
    invoke-virtual {v0}, Ly40;->ζ()Lc50;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    if-eqz v0, :cond_63

    .line 1308
    .line 1309
    iget-object v2, v0, Lq01;->ε:Lq01;

    .line 1310
    .line 1311
    iget-boolean v2, v2, Lq01;->σ:Z

    .line 1312
    .line 1313
    if-nez v2, :cond_58

    .line 1314
    .line 1315
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    :cond_58
    iget-object v2, v0, Lq01;->ε:Lq01;

    .line 1319
    .line 1320
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    :goto_38
    if-eqz v0, :cond_63

    .line 1325
    .line 1326
    iget-object v3, v0, Lyp0;->Κ:Lk31;

    .line 1327
    .line 1328
    iget-object v3, v3, Lk31;->ζ:Lq01;

    .line 1329
    .line 1330
    iget v3, v3, Lq01;->θ:I

    .line 1331
    .line 1332
    const/high16 v20, 0x200000

    .line 1333
    .line 1334
    and-int v3, v3, v20

    .line 1335
    .line 1336
    if-eqz v3, :cond_61

    .line 1337
    .line 1338
    :goto_39
    if-eqz v2, :cond_61

    .line 1339
    .line 1340
    iget v3, v2, Lq01;->η:I

    .line 1341
    .line 1342
    and-int v3, v3, v20

    .line 1343
    .line 1344
    if-eqz v3, :cond_60

    .line 1345
    .line 1346
    move-object v3, v2

    .line 1347
    const/4 v4, 0x0

    .line 1348
    :goto_3a
    if-eqz v3, :cond_60

    .line 1349
    .line 1350
    iget v5, v3, Lq01;->η:I

    .line 1351
    .line 1352
    and-int v5, v5, v20

    .line 1353
    .line 1354
    if-eqz v5, :cond_5f

    .line 1355
    .line 1356
    instance-of v5, v3, Lya;

    .line 1357
    .line 1358
    if-eqz v5, :cond_5f

    .line 1359
    .line 1360
    move-object v5, v3

    .line 1361
    check-cast v5, Lya;

    .line 1362
    .line 1363
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 1364
    .line 1365
    move-object v6, v5

    .line 1366
    move-object v5, v4

    .line 1367
    move-object v4, v3

    .line 1368
    const/4 v3, 0x0

    .line 1369
    :goto_3b
    if-eqz v6, :cond_5d

    .line 1370
    .line 1371
    iget v7, v6, Lq01;->η:I

    .line 1372
    .line 1373
    and-int v7, v7, v20

    .line 1374
    .line 1375
    if-eqz v7, :cond_59

    .line 1376
    .line 1377
    add-int/lit8 v3, v3, 0x1

    .line 1378
    .line 1379
    const/4 v14, 0x1

    .line 1380
    if-ne v3, v14, :cond_5a

    .line 1381
    .line 1382
    move-object v4, v6

    .line 1383
    :cond_59
    const/16 v8, 0x10

    .line 1384
    .line 1385
    goto :goto_3d

    .line 1386
    :cond_5a
    if-nez v5, :cond_5b

    .line 1387
    .line 1388
    new-instance v5, Lk21;

    .line 1389
    .line 1390
    const/16 v8, 0x10

    .line 1391
    .line 1392
    new-array v7, v8, [Lq01;

    .line 1393
    .line 1394
    invoke-direct {v5, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_3c

    .line 1398
    :cond_5b
    const/16 v8, 0x10

    .line 1399
    .line 1400
    :goto_3c
    if-eqz v4, :cond_5c

    .line 1401
    .line 1402
    invoke-virtual {v5, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    const/4 v4, 0x0

    .line 1406
    :cond_5c
    invoke-virtual {v5, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 1407
    .line 1408
    .line 1409
    :goto_3d
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 1410
    .line 1411
    goto :goto_3b

    .line 1412
    :cond_5d
    const/16 v8, 0x10

    .line 1413
    .line 1414
    const/4 v14, 0x1

    .line 1415
    if-ne v3, v14, :cond_5e

    .line 1416
    .line 1417
    move-object v3, v4

    .line 1418
    move-object v4, v5

    .line 1419
    goto :goto_3a

    .line 1420
    :cond_5e
    move-object v4, v5

    .line 1421
    goto :goto_3e

    .line 1422
    :cond_5f
    const/16 v8, 0x10

    .line 1423
    .line 1424
    :goto_3e
    invoke-static {v4}, Lh62;->γ(Lk21;)Lq01;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v3

    .line 1428
    goto :goto_3a

    .line 1429
    :cond_60
    const/16 v8, 0x10

    .line 1430
    .line 1431
    iget-object v2, v2, Lq01;->ι:Lq01;

    .line 1432
    .line 1433
    goto :goto_39

    .line 1434
    :cond_61
    const/16 v8, 0x10

    .line 1435
    .line 1436
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    if-eqz v0, :cond_62

    .line 1441
    .line 1442
    iget-object v2, v0, Lyp0;->Κ:Lk31;

    .line 1443
    .line 1444
    if-eqz v2, :cond_62

    .line 1445
    .line 1446
    iget-object v2, v2, Lk31;->ε:Lq22;

    .line 1447
    .line 1448
    goto :goto_38

    .line 1449
    :cond_62
    const/4 v2, 0x0

    .line 1450
    goto :goto_38

    .line 1451
    :cond_63
    const/4 v3, 0x0

    .line 1452
    iput v3, v1, Lul0;->β:I

    .line 1453
    .line 1454
    const/4 v14, 0x1

    .line 1455
    iput-boolean v14, v1, Lul0;->γ:Z

    .line 1456
    .line 1457
    return v14

    .line 1458
    :cond_64
    const-string v0, "MotionEvent must be a touch navigation source"

    .line 1459
    .line 1460
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 1461
    .line 1462
    .line 1463
    const/4 v0, 0x0

    .line 1464
    return v0

    .line 1465
    :cond_65
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    return v0

    .line 1470
    :cond_66
    :goto_3f
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 1471
    .line 1472
    .line 1473
    move-result v0

    .line 1474
    return v0
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Б:Lq0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Lq0;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->π(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v2, :cond_12

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 33
    .line 34
    iget-object v5, v2, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 35
    .line 36
    iget-object v6, v2, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v9, 0x7

    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v7, :cond_c

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_c

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/16 v7, 0x100

    .line 59
    .line 60
    const/16 v11, 0x80

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/16 v13, 0xc

    .line 64
    .line 65
    const/high16 v14, -0x80000000

    .line 66
    .line 67
    if-eq v6, v9, :cond_5

    .line 68
    .line 69
    const/16 v15, 0x9

    .line 70
    .line 71
    if-eq v6, v15, :cond_5

    .line 72
    .line 73
    if-eq v6, v8, :cond_2

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    iget v6, v2, Ll1;->ι:I

    .line 78
    .line 79
    if-eq v6, v14, :cond_4

    .line 80
    .line 81
    if-ne v6, v14, :cond_3

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_3
    iput v14, v2, Ll1;->ι:I

    .line 86
    .line 87
    invoke-static {v2, v14, v11, v12, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v6, v7, v12, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 100
    .line 101
    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    invoke-virtual {v5, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->υ(Z)V

    .line 113
    .line 114
    .line 115
    new-instance v20, Lne0;

    .line 116
    .line 117
    invoke-direct/range {v20 .. v20}, Lne0;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    int-to-long v8, v6

    .line 129
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    move-wide/from16 v16, v8

    .line 134
    .line 135
    int-to-long v7, v6

    .line 136
    const/16 v6, 0x20

    .line 137
    .line 138
    shl-long v16, v16, v6

    .line 139
    .line 140
    const-wide v18, 0xffffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    and-long v6, v7, v18

    .line 146
    .line 147
    or-long v6, v16, v6

    .line 148
    .line 149
    iget-object v8, v14, Lyp0;->Κ:Lk31;

    .line 150
    .line 151
    iget-object v9, v8, Lk31;->δ:Lq31;

    .line 152
    .line 153
    sget-object v14, Lq31;->Σ:Lio1;

    .line 154
    .line 155
    invoke-virtual {v9, v6, v7}, Lq31;->Т(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    iget-object v6, v8, Lk31;->δ:Lq31;

    .line 160
    .line 161
    sget-object v17, Lq31;->Φ:Lrk0;

    .line 162
    .line 163
    const/16 v21, 0x1

    .line 164
    .line 165
    const/16 v22, 0x1

    .line 166
    .line 167
    move-object/from16 v16, v6

    .line 168
    .line 169
    invoke-virtual/range {v16 .. v22}, Lq31;->Э(Lm31;JLne0;IZ)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v6, v20

    .line 173
    .line 174
    iget-object v6, v6, Lne0;->ε:Lv11;

    .line 175
    .line 176
    iget v7, v6, Lv11;->β:I

    .line 177
    .line 178
    sub-int/2addr v7, v10

    .line 179
    :goto_0
    const/4 v8, -0x1

    .line 180
    if-ge v8, v7, :cond_6

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast v8, Lq01;

    .line 190
    .line 191
    invoke-static {v8}, Lh62;->ц(Lur;)Lyp0;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    invoke-virtual {v9}, Landroidx/compose/ui/platform/AndroidViewsHandler;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    check-cast v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 208
    .line 209
    if-eqz v9, :cond_7

    .line 210
    .line 211
    :cond_6
    const/high16 v14, -0x80000000

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_7
    iget-object v9, v8, Lyp0;->Κ:Lk31;

    .line 215
    .line 216
    const/16 v14, 0x8

    .line 217
    .line 218
    invoke-virtual {v9, v14}, Lk31;->δ(I)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-nez v9, :cond_8

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_8
    iget v9, v8, Lyp0;->ζ:I

    .line 226
    .line 227
    invoke-virtual {v2, v9}, Ll1;->ψ(I)I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    invoke-static {v8, v4}, Lp91;->β(Lyp0;Z)Lbs1;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v8}, Lh62;->й(Lbs1;)Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-nez v14, :cond_9

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_9
    invoke-virtual {v8}, Lbs1;->λ()Lxr1;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    sget-object v14, Lfs1;->Α:Lis1;

    .line 247
    .line 248
    iget-object v8, v8, Lxr1;->ε:Lb21;

    .line 249
    .line 250
    invoke-virtual {v8, v14}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_a

    .line 255
    .line 256
    :goto_1
    add-int/lit8 v7, v7, -0x1

    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_a
    move v14, v9

    .line 260
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 265
    .line 266
    .line 267
    iget v5, v2, Ll1;->ι:I

    .line 268
    .line 269
    if-ne v5, v14, :cond_b

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_b
    iput v14, v2, Ll1;->ι:I

    .line 273
    .line 274
    invoke-static {v2, v14, v11, v12, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 275
    .line 276
    .line 277
    const/16 v15, 0x100

    .line 278
    .line 279
    invoke-static {v2, v5, v15, v12, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 280
    .line 281
    .line 282
    :cond_c
    :goto_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    const/4 v5, 0x7

    .line 287
    if-eq v2, v5, :cond_10

    .line 288
    .line 289
    const/16 v5, 0xa

    .line 290
    .line 291
    if-eq v2, v5, :cond_d

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_d
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ρ(Landroid/view/MotionEvent;)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eqz v2, :cond_11

    .line 299
    .line 300
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    const/4 v5, 0x3

    .line 305
    if-ne v2, v5, :cond_e

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_e

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_e
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 315
    .line 316
    if-eqz v2, :cond_f

    .line 317
    .line 318
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 319
    .line 320
    .line 321
    :cond_f
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iput-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 326
    .line 327
    iput-boolean v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 328
    .line 329
    const-wide/16 v1, 0x8

    .line 330
    .line 331
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 332
    .line 333
    .line 334
    return v4

    .line 335
    :cond_10
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->σ(Landroid/view/MotionEvent;)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-nez v2, :cond_11

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_11
    :goto_4
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->μ(Landroid/view/MotionEvent;)I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    and-int/2addr v0, v10

    .line 347
    if-eqz v0, :cond_12

    .line 348
    .line 349
    return v10

    .line 350
    :cond_12
    :goto_5
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lpn;->τ:Llm0;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lvb2;->α:Lx91;

    .line 21
    .line 22
    new-instance v2, Lfi1;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Lfi1;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lu40;->ζ:Lu40;

    .line 35
    .line 36
    check-cast v0, Ly40;

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Ly40;->δ(Landroid/view/KeyEvent;Lp70;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Ly0;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, p0, v2, p1}, Ly0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Ly40;

    .line 66
    .line 67
    invoke-virtual {v0, p1, v1}, Ly40;->δ(Landroid/view/KeyEvent;Lp70;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ly40;

    .line 14
    .line 15
    iget-object v3, v0, Ly40;->δ:Ls40;

    .line 16
    .line 17
    iget-boolean v3, v3, Ls40;->ε:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const-string v0, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 22
    .line 23
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    iget-object v0, v0, Ly40;->γ:Lc50;

    .line 31
    .line 32
    invoke-static {v0}, Lln0;->ω(Lc50;)Lc50;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v3, v0, Lq01;->ε:Lq01;

    .line 39
    .line 40
    iget-boolean v3, v3, Lq01;->σ:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const-string v3, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v3}, Lam0;->β(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, Lq01;->ε:Lq01;

    .line 50
    .line 51
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_b

    .line 56
    .line 57
    iget-object v4, v0, Lyp0;->Κ:Lk31;

    .line 58
    .line 59
    iget-object v4, v4, Lk31;->ζ:Lq01;

    .line 60
    .line 61
    iget v4, v4, Lq01;->θ:I

    .line 62
    .line 63
    const/high16 v5, 0x20000

    .line 64
    .line 65
    and-int/2addr v4, v5

    .line 66
    const/4 v6, 0x0

    .line 67
    if-eqz v4, :cond_9

    .line 68
    .line 69
    :goto_1
    if-eqz v3, :cond_9

    .line 70
    .line 71
    iget v4, v3, Lq01;->η:I

    .line 72
    .line 73
    and-int/2addr v4, v5

    .line 74
    if-eqz v4, :cond_8

    .line 75
    .line 76
    move-object v4, v3

    .line 77
    move-object v7, v6

    .line 78
    :goto_2
    if-eqz v4, :cond_8

    .line 79
    .line 80
    iget v8, v4, Lq01;->η:I

    .line 81
    .line 82
    and-int/2addr v8, v5

    .line 83
    if-eqz v8, :cond_7

    .line 84
    .line 85
    instance-of v8, v4, Lya;

    .line 86
    .line 87
    if-eqz v8, :cond_7

    .line 88
    .line 89
    move-object v8, v4

    .line 90
    check-cast v8, Lya;

    .line 91
    .line 92
    iget-object v8, v8, Lya;->υ:Lq01;

    .line 93
    .line 94
    move v9, v1

    .line 95
    :goto_3
    if-eqz v8, :cond_6

    .line 96
    .line 97
    iget v10, v8, Lq01;->η:I

    .line 98
    .line 99
    and-int/2addr v10, v5

    .line 100
    if-eqz v10, :cond_5

    .line 101
    .line 102
    add-int/lit8 v9, v9, 0x1

    .line 103
    .line 104
    if-ne v9, v2, :cond_2

    .line 105
    .line 106
    move-object v4, v8

    .line 107
    goto :goto_4

    .line 108
    :cond_2
    if-nez v7, :cond_3

    .line 109
    .line 110
    new-instance v7, Lk21;

    .line 111
    .line 112
    const/16 v10, 0x10

    .line 113
    .line 114
    new-array v10, v10, [Lq01;

    .line 115
    .line 116
    invoke-direct {v7, v10}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v7, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v4, v6

    .line 125
    :cond_4
    invoke-virtual {v7, v8}, Lk21;->β(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_4
    iget-object v8, v8, Lq01;->κ:Lq01;

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    if-ne v9, v2, :cond_7

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-static {v7}, Lh62;->γ(Lk21;)Lq01;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    iget-object v3, v3, Lq01;->ι:Lq01;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    iget-object v3, v0, Lyp0;->Κ:Lk31;

    .line 149
    .line 150
    if-eqz v3, :cond_a

    .line 151
    .line 152
    iget-object v3, v3, Lk31;->ε:Lq22;

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_a
    move-object v3, v6

    .line 156
    goto :goto_0

    .line 157
    :cond_b
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-eqz p0, :cond_c

    .line 162
    .line 163
    return v2

    .line 164
    :cond_c
    return v1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Б:Lq0;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v3, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v2, v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->В:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lq0;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->π(Landroid/view/MotionEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_12

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_b

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v2, 0x2

    .line 68
    if-ne v0, v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->σ(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto/16 :goto_b

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->μ(Landroid/view/MotionEvent;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    and-int/lit8 v2, v0, 0x2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v4, 0x5

    .line 105
    if-ne v2, v4, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move v2, v1

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    :goto_2
    move v2, v3

    .line 111
    :goto_3
    const/16 v4, 0x2002

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_9

    .line 118
    .line 119
    const v4, 0x100008

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v4, v1

    .line 130
    goto :goto_5

    .line 131
    :cond_9
    :goto_4
    move v4, v3

    .line 132
    :goto_5
    if-eqz v2, :cond_11

    .line 133
    .line 134
    if-eqz v4, :cond_11

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    instance-of v4, v2, Landroid/view/View;

    .line 141
    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    check-cast v2, Landroid/view/View;

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    const/4 v2, 0x0

    .line 148
    :goto_6
    if-eqz v2, :cond_b

    .line 149
    .line 150
    const v4, 0x7f090044

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v2, :cond_c

    .line 158
    .line 159
    :cond_b
    new-instance v2, Ll7;

    .line 160
    .line 161
    invoke-direct {v2, v3}, Ll7;-><init>(I)V

    .line 162
    .line 163
    .line 164
    :cond_c
    new-instance v4, Ll7;

    .line 165
    .line 166
    invoke-direct {v4, v3}, Ll7;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_11

    .line 174
    .line 175
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ly40;

    .line 180
    .line 181
    invoke-virtual {v2}, Ly40;->ζ()Lc50;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_11

    .line 186
    .line 187
    invoke-static {v2}, Lh62;->х(Lur;)Lq31;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, Ls1;->ι(Lmp0;)Lmp0;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v4, v2, v3}, Lmp0;->ж(Lmp0;Z)Lml1;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    int-to-long v4, v4

    .line 212
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    int-to-long v6, p1

    .line 217
    const/16 p1, 0x20

    .line 218
    .line 219
    shl-long/2addr v4, p1

    .line 220
    const-wide v8, 0xffffffffL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v6, v8

    .line 226
    or-long/2addr v4, v6

    .line 227
    shr-long v6, v4, p1

    .line 228
    .line 229
    long-to-int p1, v6

    .line 230
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    and-long/2addr v4, v8

    .line 235
    long-to-int v4, v4

    .line 236
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    iget v5, v2, Lml1;->α:F

    .line 241
    .line 242
    cmpl-float v5, p1, v5

    .line 243
    .line 244
    if-ltz v5, :cond_d

    .line 245
    .line 246
    move v5, v3

    .line 247
    goto :goto_7

    .line 248
    :cond_d
    move v5, v1

    .line 249
    :goto_7
    iget v6, v2, Lml1;->γ:F

    .line 250
    .line 251
    cmpg-float p1, p1, v6

    .line 252
    .line 253
    if-gez p1, :cond_e

    .line 254
    .line 255
    move p1, v3

    .line 256
    goto :goto_8

    .line 257
    :cond_e
    move p1, v1

    .line 258
    :goto_8
    and-int/2addr p1, v5

    .line 259
    iget v5, v2, Lml1;->β:F

    .line 260
    .line 261
    cmpl-float v5, v4, v5

    .line 262
    .line 263
    if-ltz v5, :cond_f

    .line 264
    .line 265
    move v5, v3

    .line 266
    goto :goto_9

    .line 267
    :cond_f
    move v5, v1

    .line 268
    :goto_9
    and-int/2addr p1, v5

    .line 269
    iget v2, v2, Lml1;->δ:F

    .line 270
    .line 271
    cmpg-float v2, v4, v2

    .line 272
    .line 273
    if-gez v2, :cond_10

    .line 274
    .line 275
    move v2, v3

    .line 276
    goto :goto_a

    .line 277
    :cond_10
    move v2, v1

    .line 278
    :goto_a
    and-int/2addr p1, v2

    .line 279
    if-nez p1, :cond_11

    .line 280
    .line 281
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ly40;

    .line 286
    .line 287
    const/16 p1, 0x8

    .line 288
    .line 289
    invoke-virtual {p0, p1, v1, v3}, Ly40;->β(IZZ)Z

    .line 290
    .line 291
    .line 292
    :cond_11
    and-int/lit8 p0, v0, 0x1

    .line 293
    .line 294
    if-eqz p0, :cond_12

    .line 295
    .line 296
    return v3

    .line 297
    :cond_12
    :goto_b
    return v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Landroid/view/View;

    .line 3
    .line 4
    const-string v2, "findViewByAccessibilityIdTraversal"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    new-array v4, v3, [Ljava/lang/Class;

    .line 8
    .line 9
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    aput-object v5, v4, v6

    .line 13
    .line 14
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    new-array v2, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    aput-object p1, v2, v6

    .line 28
    .line 29
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of p1, p0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    check-cast p0, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lmx0;->γ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-ne v2, p0, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    :goto_1
    move-object v0, v1

    .line 53
    :goto_2
    if-ne p1, p0, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ly40;

    .line 60
    .line 61
    iget-object v2, v2, Ly40;->γ:Lc50;

    .line 62
    .line 63
    invoke-static {v2}, Lln0;->ω(Lc50;)Lc50;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-static {v2}, Lln0;->Δ(Lc50;)Lml1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :cond_4
    if-nez v1, :cond_6

    .line 74
    .line 75
    invoke-static {p1, p0}, Lr40;->α(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lml1;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-static {p1, p0}, Lr40;->α(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lml1;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_6
    :goto_3
    invoke-static {p2}, Lr40;->β(I)Lq40;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_7

    .line 89
    .line 90
    iget v2, v2, Lq40;->α:I

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    const/4 v2, 0x6

    .line 94
    :goto_4
    new-instance v3, Lum1;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-instance v5, Lb0;

    .line 104
    .line 105
    const/4 v6, 0x3

    .line 106
    invoke-direct {v5, v6, v3}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    check-cast v4, Ly40;

    .line 110
    .line 111
    invoke-virtual {v4, v2, v1, v5}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-nez v4, :cond_8

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_8
    iget-object v3, v3, Lum1;->ε:Ljava/lang/Object;

    .line 119
    .line 120
    if-nez v3, :cond_9

    .line 121
    .line 122
    if-nez v0, :cond_d

    .line 123
    .line 124
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_9
    if-nez v0, :cond_a

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_a
    const/4 p1, 0x1

    .line 133
    if-ne v2, p1, :cond_b

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_b
    const/4 p1, 0x2

    .line 137
    if-ne v2, p1, :cond_c

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_c
    check-cast v3, Lc50;

    .line 141
    .line 142
    invoke-static {v3}, Lln0;->Δ(Lc50;)Lml1;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {v0, p0}, Lr40;->α(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lml1;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-static {p1, p2, v1, v2}, Lj81;->Γ(Lml1;Lml1;Lml1;I)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_d

    .line 155
    .line 156
    :goto_5
    return-object p0

    .line 157
    :cond_d
    return-object v0

    .line 158
    :cond_e
    :goto_6
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0
.end method

.method public getAccessibilityManager()Lh0;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Η:Lh0;

    return-object p0
.end method

.method public bridge getAccessibilityManager()Lф;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAccessibilityManager()Lh0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/AndroidViewsHandler;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public getAutofill()Lv7;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAutofillManager()Lx7;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAutofillTree()Ly7;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ι:Ly7;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClipboard()Lo0;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Φ:Lo0;

    return-object p0
.end method

.method public bridge getClipboard()Lrh;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboard()Lo0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getClipboardManager()Lp0;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Υ:Lp0;

    return-object p0
.end method

.method public bridge getClipboardManager()Lsh;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Lp0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getComposeViewContext()Lpn;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_composeViewContext()Lpn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getComposeViewContextIncrementedDuringInit$ui()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->З:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getConfiguration()Landroid/content/res/Configuration;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ο:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/res/Configuration;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getContentCaptureManager$ui()Lz1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCoroutineContext()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ρ:Lup;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDensity()Lyr;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ξ:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyr;

    .line 8
    .line 9
    return-object p0
.end method

.method public getDragAndDropManager()Le2;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->σ:Le2;

    return-object p0
.end method

.method public bridge getDragAndDropManager()Lkv;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getEmbeddedViewFocusRect()Lml1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ly40;

    .line 13
    .line 14
    iget-object p0, p0, Ly40;->γ:Lc50;

    .line 15
    .line 16
    invoke-static {p0}, Lln0;->ω(Lc50;)Lc50;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lln0;->Δ(Lc50;)Lml1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v1

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0, p0}, Lr40;->α(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lml1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    return-object v1
.end method

.method public getFocusOwner()Lv40;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->π:Ly40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()Lml1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, v0, Lml1;->α:F

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget p0, v0, Lml1;->β:F

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    iget p0, v0, Lml1;->γ:F

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget p0, v0, Lml1;->δ:F

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, La1;->ζ:La1;

    .line 45
    .line 46
    check-cast v0, Ly40;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    const/high16 p0, -0x80000000

    .line 63
    .line 64
    invoke-virtual {p1, p0, p0, p0, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public getFontFamilyResolver()Lf50;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->с:Lg21;

    .line 2
    .line 3
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf50;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFontLoader()Le50;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->р:Le50;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFrameEndScheduler$ui()Lkr0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ι:Lkr0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGraphicsContext()Lua0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Θ:Ll2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHapticFeedBack()Lrc0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->у:Lrc0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    iget-object v0, v0, Lmx0;->β:Lm6;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm6;->Κ()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->μ:Lw6;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public getImportantForAutofill()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public getInputModeManager()Lkm0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ф:Llm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInsetsListener()Lom0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ω:Lom0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->т:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnp0;

    .line 8
    .line 9
    return-object p0
.end method

.method public getLayoutNodes()Ln11;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln11;"
        }
    .end annotation

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Β:Ln11;

    return-object p0
.end method

.method public bridge synthetic getLayoutNodes()Lsm0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getLocaleList()Lav0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Π:Lfs;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfs;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lav0;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    iget-boolean v0, p0, Lmx0;->γ:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lmx0;->η:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()Ls01;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->х:Ls01;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public bridge getOutOfFrameExecutor()Lq81;
    .locals 0

    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object p0

    return-object p0
.end method

.method public getPlacementScope()Lbh1;
    .locals 2

    .line 1
    sget v0, Ldh1;->β:I

    .line 2
    .line 3
    new-instance v0, Lew0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p0}, Lew0;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public getPointerIconService()Lzh1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Л:Lxn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui()Lrl0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getRectManager()Lol1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Γ:Lol1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetainedValuesStore()Lgo1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->λ:Lgo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRoot()Lyp0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Α:Lyp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRootForTest()Luo1;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getScrollCaptureInProgress$ui()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->И:Llm0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Llm0;->α:Lx91;

    .line 12
    .line 13
    invoke-virtual {p0}, Lx91;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public getSemanticsOwner()Les1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Δ:Les1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSharedDrawScope()Laq0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->θ:Laq0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    .line 1
    sget-object v0, Lj4;->α:Lj4;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lj4;->α(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSnapshotObserver()Ly81;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Χ:Ly81;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSoftwareKeyboardController()Lox1;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->п:Li2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li2;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getTextInputService()Li32;

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x12

    .line 11
    .line 12
    invoke-direct {v0, v1}, Li2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->п:Li2;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public getTextInputService()Li32;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->н:Li32;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li32;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()Lj32;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->н:Li32;

    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

.method public getTextToolbar()Lx32;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ц:Li2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUncaughtExceptionHandler$ui()Lto1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getViewConfiguration()Lg92;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ψ:Ll3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getViewTreeOwners()Lv0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->к:Lfs;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfs;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getWindowInfo()Lub2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lpn;->τ:Llm0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final get_autofillManager$ui()Lk0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 9

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ω:Lom0;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Lom0;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->П:Ls0;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v1, :cond_4

    .line 18
    .line 19
    new-instance v1, Ls0;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ls0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->П:Ls0;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :try_start_0
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    const-string v5, "android.os.SystemProperties"

    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sput-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 41
    .line 42
    :cond_0
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->Н:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    sget-object v5, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    .line 47
    .line 48
    invoke-static {v5}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 49
    .line 50
    .line 51
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    const-string v6, "addChangeCallback"

    .line 56
    .line 57
    new-array v7, v0, [Ljava/lang/Class;

    .line 58
    .line 59
    const-class v8, Ljava/lang/Runnable;

    .line 60
    .line 61
    aput-object v8, v7, v3

    .line 62
    .line 63
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object v5, v2

    .line 69
    :goto_0
    sput-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->Н:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    :cond_2
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->Н:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    new-array v6, v0, [Ljava/lang/Object;

    .line 76
    .line 77
    aput-object v1, v6, v3

    .line 78
    .line 79
    invoke-virtual {v5, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :catchall_0
    :cond_3
    invoke-static {v4}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->О:Lv11;

    .line 86
    .line 87
    monitor-enter v1

    .line 88
    :try_start_1
    invoke-virtual {v1, p0}, Lv11;->α(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 89
    .line 90
    .line 91
    monitor-exit v1

    .line 92
    iget-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->З:Z

    .line 93
    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Lpn;->γ()V

    .line 101
    .line 102
    .line 103
    :cond_5
    iput-boolean v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->З:Z

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->ξ(Lyp0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->ν(Lyp0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v1, v1, Ly81;->α:Lkx1;

    .line 124
    .line 125
    iget-object v4, v1, Lkx1;->δ:Lcc;

    .line 126
    .line 127
    sget-object v5, Lax1;->α:Leu1;

    .line 128
    .line 129
    invoke-static {v5}, Lax1;->ε(La80;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object v5, Lax1;->γ:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter v5

    .line 135
    :try_start_2
    sget-object v6, Lax1;->θ:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v6, Ljava/util/List;

    .line 138
    .line 139
    invoke-static {v4, v6}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    sput-object v6, Lax1;->θ:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    .line 145
    monitor-exit v5

    .line 146
    new-instance v5, Lhi0;

    .line 147
    .line 148
    invoke-direct {v5, v4}, Lhi0;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iput-object v5, v1, Lkx1;->θ:Lhi0;

    .line 152
    .line 153
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 154
    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    sget-object v4, Lw7;->α:Lw7;

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v1, v1, Li0;->θ:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Landroid/view/autofill/AutofillManager;

    .line 165
    .line 166
    invoke-virtual {v1, v4}, Landroid/view/autofill/AutofillManager;->registerCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget-object v1, v1, Lpn;->γ:Lhr0;

    .line 174
    .line 175
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    iget-object v4, v4, Lpn;->ε:Lr92;

    .line 180
    .line 181
    iget-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ι:Lkr0;

    .line 182
    .line 183
    if-eqz v1, :cond_d

    .line 184
    .line 185
    if-eqz v4, :cond_d

    .line 186
    .line 187
    if-nez v5, :cond_7

    .line 188
    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :cond_7
    invoke-interface {v4}, Lr92;->γ()Lq92;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v4, Lzz1;

    .line 196
    .line 197
    const/16 v5, 0xc

    .line 198
    .line 199
    invoke-direct {v4, v5, v3}, Lzz1;-><init>(IZ)V

    .line 200
    .line 201
    .line 202
    sget-object v5, Lgq;->β:Lgq;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v6, Li0;

    .line 211
    .line 212
    invoke-direct {v6, v1, v4, v5}, Li0;-><init>(Lq92;Lp92;Lhq;)V

    .line 213
    .line 214
    .line 215
    const-class v1, Lmr0;

    .line 216
    .line 217
    invoke-static {v1}, Lvm1;->α(Ljava/lang/Class;)Lwf;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Lwf;->β()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    if-eqz v4, :cond_c

    .line 226
    .line 227
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 228
    .line 229
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v6, v1, v4}, Li0;->ψ(Lwf;Ljava/lang/String;)Lm92;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    check-cast v1, Lmr0;

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    check-cast v4, Landroid/view/View;

    .line 247
    .line 248
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    iget-object v1, v1, Lmr0;->β:Ln11;

    .line 253
    .line 254
    invoke-virtual {v1, v4}, Lsm0;->β(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    if-nez v5, :cond_8

    .line 259
    .line 260
    new-instance v5, Lv11;

    .line 261
    .line 262
    invoke-direct {v5, v0}, Lv11;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v4, v5}, Ln11;->η(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_8
    check-cast v5, Lv11;

    .line 269
    .line 270
    iget-object v1, v5, Lv11;->α:[Ljava/lang/Object;

    .line 271
    .line 272
    iget v4, v5, Lv11;->β:I

    .line 273
    .line 274
    :goto_1
    if-ge v3, v4, :cond_a

    .line 275
    .line 276
    aget-object v6, v1, v3

    .line 277
    .line 278
    move-object v7, v6

    .line 279
    check-cast v7, Llr0;

    .line 280
    .line 281
    iget-boolean v7, v7, Llr0;->γ:Z

    .line 282
    .line 283
    if-nez v7, :cond_9

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 287
    .line 288
    goto :goto_1

    .line 289
    :cond_a
    move-object v6, v2

    .line 290
    :goto_2
    check-cast v6, Llr0;

    .line 291
    .line 292
    if-nez v6, :cond_b

    .line 293
    .line 294
    new-instance v6, Llr0;

    .line 295
    .line 296
    invoke-direct {v6}, Llr0;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v6}, Lv11;->α(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_b
    iput-boolean v0, v6, Llr0;->γ:Z

    .line 303
    .line 304
    iput-object v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->κ:Llr0;

    .line 305
    .line 306
    iget-object v1, v6, Llr0;->β:Ln;

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_c
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 310
    .line 311
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_d
    :goto_3
    move-object v1, v2

    .line 316
    :goto_4
    if-nez v1, :cond_e

    .line 317
    .line 318
    sget-object v1, Lx;->Τ:Lx;

    .line 319
    .line 320
    :cond_e
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->λ:Lgo1;

    .line 321
    .line 322
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->л:La80;

    .line 323
    .line 324
    if-eqz v1, :cond_f

    .line 325
    .line 326
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-interface {v1, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->л:La80;

    .line 334
    .line 335
    :cond_f
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iget-object v1, v1, Lpn;->γ:Lhr0;

    .line 340
    .line 341
    invoke-interface {v1}, Lhr0;->δ()Ljr0;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v1, p0}, Ljr0;->α(Lgr0;)V

    .line 346
    .line 347
    .line 348
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 349
    .line 350
    invoke-virtual {v1, v2}, Ljr0;->α(Lgr0;)V

    .line 351
    .line 352
    .line 353
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ф:Llm0;

    .line 354
    .line 355
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_10

    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_10
    const/4 v0, 0x2

    .line 363
    :goto_5
    iget-object v1, v1, Llm0;->α:Lx91;

    .line 364
    .line 365
    new-instance v2, Ljm0;

    .line 366
    .line 367
    invoke-direct {v2, v0}, Ljm0;-><init>(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 392
    .line 393
    .line 394
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 395
    .line 396
    const/16 v1, 0x1f

    .line 397
    .line 398
    if-lt v0, v1, :cond_11

    .line 399
    .line 400
    sget-object v0, Lq1;->α:Lq1;

    .line 401
    .line 402
    invoke-virtual {v0, p0}, Lq1;->β(Landroid/view/View;)V

    .line 403
    .line 404
    .line 405
    :cond_11
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 406
    .line 407
    if-eqz v0, :cond_12

    .line 408
    .line 409
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Ly40;

    .line 414
    .line 415
    iget-object v1, v1, Ly40;->η:Lv11;

    .line 416
    .line 417
    invoke-virtual {v1, v0}, Lv11;->α(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v1, v1, Les1;->δ:Lv11;

    .line 425
    .line 426
    invoke-virtual {v1, v0}, Lv11;->α(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_12
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    check-cast v0, Ly40;

    .line 434
    .line 435
    iget-object v0, v0, Ly40;->η:Lv11;

    .line 436
    .line 437
    invoke-virtual {v0, p0}, Lv11;->α(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :catchall_1
    move-exception p0

    .line 442
    monitor-exit v5

    .line 443
    throw p0

    .line 444
    :catchall_2
    move-exception p0

    .line 445
    monitor-exit v1

    .line 446
    throw p0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->о:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()Lj32;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {}, Lγ;->β()V

    .line 19
    .line 20
    .line 21
    goto :goto_0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ι(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->о:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()Lj32;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {}, Lγ;->β()V

    .line 19
    .line 20
    .line 21
    goto :goto_0
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length p2, p1

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-ge v0, p2, :cond_3

    .line 9
    .line 10
    aget-wide v1, p1, v0

    .line 11
    .line 12
    invoke-virtual {p0}, Lz1;->ε()Lsm0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-virtual {v3, v1}, Lsm0;->β(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lds1;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v1, v1, Lds1;->α:Lbs1;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, Lp1;->σ()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v1, Lbs1;->ζ:I

    .line 40
    .line 41
    int-to-long v3, v3

    .line 42
    invoke-static {v2, v3, v4}, Lp1;->ξ(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v1, v1, Lbs1;->δ:Lxr1;

    .line 47
    .line 48
    sget-object v3, Lfs1;->Β:Lis1;

    .line 49
    .line 50
    iget-object v1, v1, Lxr1;->ε:Lb21;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x0

    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    move-object v1, v3

    .line 60
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    const-string v4, "\n"

    .line 65
    .line 66
    const/16 v5, 0x3e

    .line 67
    .line 68
    invoke-static {v1, v4, v3, v5}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, Lg4;

    .line 73
    .line 74
    invoke-direct {v3, v1}, Lg4;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Lp1;->μ(Lg4;)Landroid/view/translation/TranslationRequestValue;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v2, v1}, Lp1;->Δ(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lp1;->ο(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p3, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ω:Lom0;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Lom0;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ο:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->О:Lv11;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    invoke-virtual {v1, p0}, Lv11;->κ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    monitor-exit v1

    .line 33
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lpn;->β()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, v1, Ly81;->α:Lkx1;

    .line 45
    .line 46
    iget-object v2, v2, Lkx1;->θ:Lhi0;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v2}, Lhi0;->β()V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v1, v1, Ly81;->α:Lkx1;

    .line 54
    .line 55
    iget-object v2, v1, Lkx1;->η:Ljava/lang/Object;

    .line 56
    .line 57
    monitor-enter v2

    .line 58
    :try_start_1
    iget-object v1, v1, Lkx1;->ζ:Lk21;

    .line 59
    .line 60
    iget-object v3, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 61
    .line 62
    iget v1, v1, Lk21;->η:I

    .line 63
    .line 64
    move v4, v0

    .line 65
    :goto_0
    if-ge v4, v1, :cond_2

    .line 66
    .line 67
    aget-object v5, v3, v4

    .line 68
    .line 69
    check-cast v5, Ljx1;

    .line 70
    .line 71
    iget-object v6, v5, Ljx1;->ε:Lb21;

    .line 72
    .line 73
    invoke-virtual {v6}, Lb21;->α()V

    .line 74
    .line 75
    .line 76
    iget-object v6, v5, Ljx1;->ζ:Lb21;

    .line 77
    .line 78
    invoke-virtual {v6}, Lb21;->α()V

    .line 79
    .line 80
    .line 81
    iget-object v6, v5, Ljx1;->μ:Lb21;

    .line 82
    .line 83
    invoke-virtual {v6}, Lb21;->α()V

    .line 84
    .line 85
    .line 86
    iget-object v5, v5, Ljx1;->ν:Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :cond_2
    monitor-exit v2

    .line 99
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v1, v1, Lpn;->γ:Lhr0;

    .line 104
    .line 105
    invoke-interface {v1}, Lhr0;->δ()Ljr0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljr0;->ζ(Lgr0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    sget-object v2, Lw7;->α:Lw7;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v1, v1, Li0;->θ:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Landroid/view/autofill/AutofillManager;

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Landroid/view/autofill/AutofillManager;->unregisterCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 152
    .line 153
    .line 154
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->κ:Llr0;

    .line 155
    .line 156
    if-eqz v1, :cond_4

    .line 157
    .line 158
    iput-boolean v0, v1, Llr0;->γ:Z

    .line 159
    .line 160
    :cond_4
    const/4 v0, 0x0

    .line 161
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->κ:Llr0;

    .line 162
    .line 163
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    const/16 v2, 0x1f

    .line 166
    .line 167
    if-lt v1, v2, :cond_5

    .line 168
    .line 169
    sget-object v1, Lq1;->α:Lq1;

    .line 170
    .line 171
    invoke-virtual {v1, p0}, Lq1;->α(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 175
    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget-object v2, v2, Les1;->δ:Lv11;

    .line 183
    .line 184
    invoke-virtual {v2, v1}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Ly40;

    .line 192
    .line 193
    iget-object v2, v2, Ly40;->η:Lv11;

    .line 194
    .line 195
    invoke-virtual {v2, v1}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v2, v1, Lol1;->γ:Lj42;

    .line 203
    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    const-wide/16 v3, 0x0

    .line 207
    .line 208
    const-wide/16 v5, 0x0

    .line 209
    .line 210
    const/4 v7, 0x0

    .line 211
    invoke-virtual/range {v2 .. v9}, Lj42;->α(JJ[FII)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    iput-boolean v2, v1, Lol1;->ζ:Z

    .line 216
    .line 217
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Lol1;->α()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object v2, v1, Lol1;->θ:Lr0;

    .line 229
    .line 230
    if-eqz v2, :cond_7

    .line 231
    .line 232
    iget-object v3, v1, Lol1;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 233
    .line 234
    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 235
    .line 236
    .line 237
    iput-object v0, v1, Lol1;->θ:Lr0;

    .line 238
    .line 239
    :cond_7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Ly40;

    .line 244
    .line 245
    iget-object v0, v0, Ly40;->η:Lv11;

    .line 246
    .line 247
    invoke-virtual {v0, p0}, Lv11;->κ(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :goto_1
    monitor-exit v2

    .line 252
    throw p0

    .line 253
    :catchall_1
    move-exception v0

    .line 254
    move-object p0, v0

    .line 255
    monitor-exit v1

    .line 256
    throw p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ly40;

    .line 17
    .line 18
    iget-object p1, p0, Ly40;->γ:Lc50;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-static {p1, p2}, Lkn0;->σ(Lc50;Z)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ly40;->ζ()Lc50;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ly40;->ζ()Lc50;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p0, p2}, Ly40;->θ(Lc50;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    sget-object p0, Lb50;->ε:Lb50;

    .line 41
    .line 42
    sget-object p2, Lb50;->η:Lb50;

    .line 43
    .line 44
    invoke-virtual {p1, p0, p2}, Lc50;->Г(Lb50;Lb50;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Κ()V

    .line 6
    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    if-gt v1, v0, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x22

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Ι(Landroid/content/res/Configuration;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const-string p1, "AndroidOwner:onLayout"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :try_start_0
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Д:Lx0;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lmx0;->λ(Lx0;)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ω:Lyo;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Κ()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const-string p1, "AndroidOwner:viewLayout"

    .line 28
    .line 29
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sub-int/2addr p4, p2

    .line 37
    sub-int/2addr p5, p3

    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:onMeasure"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->ξ(Lyp0;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ι(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    const/16 p1, 0x20

    .line 26
    .line 27
    ushr-long v3, v1, p1

    .line 28
    .line 29
    long-to-int v3, v3

    .line 30
    const-wide v4, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v1, v4

    .line 36
    long-to-int v1, v1

    .line 37
    invoke-static {p2}, Landroidx/compose/ui/platform/AndroidComposeView;->ι(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    ushr-long p1, v6, p1

    .line 42
    .line 43
    long-to-int p1, p1

    .line 44
    and-long/2addr v4, v6

    .line 45
    long-to-int p2, v4

    .line 46
    invoke-static {v3, v1, p1, p2}, Lyh;->Ε(IIII)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ω:Lyo;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    new-instance v1, Lyo;

    .line 55
    .line 56
    invoke-direct {v1, p1, p2}, Lyo;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ω:Lyo;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->а:Z

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-wide v1, v1, Lyo;->α:J

    .line 66
    .line 67
    invoke-static {v1, v2, p1, p2}, Lyo;->β(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->а:Z

    .line 75
    .line 76
    :cond_2
    :goto_0
    invoke-virtual {v0, p1, p2}, Lmx0;->ρ(J)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lmx0;->μ()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, Lyp0;->Λ:Lbq0;

    .line 87
    .line 88
    iget-object p1, p1, Lbq0;->π:Lox0;

    .line 89
    .line 90
    iget p1, p1, Lch1;->ε:I

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iget-object p2, p2, Lyp0;->Λ:Lbq0;

    .line 97
    .line 98
    iget-object p2, p2, Lbq0;->π:Lox0;

    .line 99
    .line 100
    iget p2, p2, Lch1;->ζ:I

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 106
    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    const-string p1, "AndroidOwner:androidViewMeasure"

    .line 110
    .line 111
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    .line 113
    .line 114
    :try_start_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    iget-object p2, p2, Lyp0;->Λ:Lbq0;

    .line 123
    .line 124
    iget-object p2, p2, Lbq0;->π:Lox0;

    .line 125
    .line 126
    iget p2, p2, Lch1;->ε:I

    .line 127
    .line 128
    const/high16 v0, 0x40000000    # 2.0f

    .line 129
    .line 130
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 139
    .line 140
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 141
    .line 142
    iget p0, p0, Lch1;->ζ:I

    .line 143
    .line 144
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    .line 151
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_0
    move-exception p0

    .line 156
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 157
    .line 158
    .line 159
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    :cond_3
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :catchall_1
    move-exception p0

    .line 165
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 166
    .line 167
    .line 168
    throw p0
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 11

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v1, v0, Lk0;->ζ:Les1;

    .line 9
    .line 10
    iget-object v1, v1, Les1;->α:Lyp0;

    .line 11
    .line 12
    iget-object v2, v0, Lk0;->κ:Landroid/view/autofill/AutofillId;

    .line 13
    .line 14
    iget-object v3, v0, Lk0;->ι:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, v0, Lk0;->θ:Lol1;

    .line 17
    .line 18
    invoke-static {p1, v1, v2, v3, v0}, Li91;->ξ(Landroid/view/ViewStructure;Lyp0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lol1;)V

    .line 19
    .line 20
    .line 21
    sget-object v4, La41;->α:[Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v4, Lv11;

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v4, v5}, Lv11;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lv11;->α(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, p1}, Lv11;->α(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v4}, Lv11;->ι()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    iget v1, v4, Lv11;->β:I

    .line 42
    .line 43
    sub-int/2addr v1, p2

    .line 44
    invoke-virtual {v4, v1}, Lv11;->λ(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v1, Landroid/view/ViewStructure;

    .line 52
    .line 53
    iget v5, v4, Lv11;->β:I

    .line 54
    .line 55
    sub-int/2addr v5, p2

    .line 56
    invoke-virtual {v4, v5}, Lv11;->λ(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v5, Lyp0;

    .line 64
    .line 65
    invoke-virtual {v5}, Lyp0;->μ()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lh21;

    .line 70
    .line 71
    iget-object v6, v5, Lh21;->ε:Lk21;

    .line 72
    .line 73
    iget v6, v6, Lk21;->η:I

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    :goto_0
    if-ge v7, v6, :cond_0

    .line 77
    .line 78
    invoke-virtual {v5, v7}, Lh21;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Lyp0;

    .line 83
    .line 84
    iget-boolean v9, v8, Lyp0;->Τ:Z

    .line 85
    .line 86
    if-nez v9, :cond_4

    .line 87
    .line 88
    invoke-virtual {v8}, Lyp0;->Η()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    invoke-virtual {v8}, Lyp0;->Θ()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-nez v9, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v8}, Lyp0;->υ()Lxr1;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    iget-object v9, v9, Lxr1;->ε:Lb21;

    .line 108
    .line 109
    sget-object v10, Lwr1;->ζ:Lis1;

    .line 110
    .line 111
    invoke-virtual {v9, v10}, Lb21;->β(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_2

    .line 116
    .line 117
    sget-object v10, Lwr1;->η:Lis1;

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Lb21;->β(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-nez v10, :cond_2

    .line 124
    .line 125
    sget-object v10, Lfs1;->ρ:Lis1;

    .line 126
    .line 127
    invoke-virtual {v9, v10}, Lb21;->β(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_2

    .line 132
    .line 133
    sget-object v10, Lfs1;->σ:Lis1;

    .line 134
    .line 135
    invoke-virtual {v9, v10}, Lb21;->β(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_3

    .line 140
    .line 141
    :cond_2
    invoke-virtual {v1, p2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    invoke-virtual {v1, v9}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-static {v9, v8, v2, v3, v0}, Li91;->ξ(Landroid/view/ViewStructure;Lyp0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lol1;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v8}, Lv11;->α(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v9}, Lv11;->α(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    invoke-virtual {v4, v8}, Lv11;->α(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v1}, Lv11;->α(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_5
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ρ:Li0;

    .line 169
    .line 170
    if-eqz p0, :cond_9

    .line 171
    .line 172
    iget-object v0, p0, Li0;->η:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ly7;

    .line 175
    .line 176
    iget-object v1, v0, Ly7;->α:Ljava/util/LinkedHashMap;

    .line 177
    .line 178
    iget-object v0, v0, Ly7;->α:Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_6

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_7

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/util/Map$Entry;

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Ljava/lang/Number;

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_8

    .line 231
    .line 232
    invoke-static {}, Lγ;->β()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_8
    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    iget-object v0, p0, Li0;->ι:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroid/view/autofill/AutofillId;

    .line 243
    .line 244
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 245
    .line 246
    .line 247
    iget-object p0, p0, Li0;->ζ:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 250
    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    const/4 v0, 0x0

    .line 260
    invoke-virtual {p1, v2, p0, v0, v0}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :cond_9
    :goto_2
    return-void
.end method

.method public final onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2002

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x4002

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPointerIconService()Lzh1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->η:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lr40;->α:[I

    .line 6
    .line 7
    sget-object v0, Lnp0;->ε:Lnp0;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lnp0;->ζ:Lnp0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object p1, v0

    .line 20
    :goto_0
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v0, p1

    .line 24
    :goto_1
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setLayoutDirection(Lnp0;)V

    .line 25
    .line 26
    .line 27
    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 4

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x1f

    .line 4
    .line 5
    if-lt p1, p2, :cond_8

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->И:Llm0;

    .line 8
    .line 9
    if-eqz p1, :cond_8

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lup;

    .line 16
    .line 17
    .line 18
    const/16 p0, 0x10

    .line 19
    .line 20
    new-array p2, p0, [Lxq1;

    .line 21
    .line 22
    invoke-virtual {p1}, Les1;->α()Lbs1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p3, Lk21;

    .line 27
    .line 28
    new-array p0, p0, [Lbs1;

    .line 29
    .line 30
    invoke-direct {p3, p0}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    invoke-virtual {p1, p0, p0}, Lbs1;->ι(ZZ)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    iget v0, p3, Lk21;->η:I

    .line 39
    .line 40
    invoke-virtual {p3, v0, p1}, Lk21;->δ(ILjava/util/List;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    :goto_1
    iget p1, p3, Lk21;->η:I

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    if-eqz p1, :cond_7

    .line 47
    .line 48
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    invoke-virtual {p3, p1}, Lk21;->λ(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lbs1;

    .line 55
    .line 56
    invoke-static {p1}, Lh62;->и(Lbs1;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget-object v2, p1, Lbs1;->δ:Lxr1;

    .line 61
    .line 62
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 63
    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    sget-object v1, Lfs1;->κ:Lis1;

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p1}, Lbs1;->δ()Lq31;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    invoke-static {v1, v0}, Ls1;->ε(Lmp0;Z)Lml1;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lpd2;->Ρ(Lml1;)Lym0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v1, v0, Lym0;->α:I

    .line 90
    .line 91
    iget v3, v0, Lym0;->γ:I

    .line 92
    .line 93
    if-ge v1, v3, :cond_0

    .line 94
    .line 95
    iget v1, v0, Lym0;->β:I

    .line 96
    .line 97
    iget v0, v0, Lym0;->δ:I

    .line 98
    .line 99
    if-lt v1, v0, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    sget-object v0, Lwr1;->ε:Lis1;

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v1, 0x0

    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    move-object v0, v1

    .line 112
    :cond_3
    check-cast v0, Le80;

    .line 113
    .line 114
    sget-object v0, Lfs1;->χ:Lis1;

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move-object v1, v0

    .line 124
    :goto_2
    if-nez v1, :cond_5

    .line 125
    .line 126
    invoke-virtual {p1, p0, p0}, Lbs1;->ι(ZZ)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_0

    .line 131
    :cond_5
    invoke-static {}, Lγ;->β()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    const-string p0, "Expected semantics node to have a coordinator."

    .line 136
    .line 137
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    throw p0

    .line 142
    :cond_7
    const/4 p1, 0x2

    .line 143
    new-array p1, p1, [La80;

    .line 144
    .line 145
    sget-object p3, La1;->Δ:La1;

    .line 146
    .line 147
    aput-object p3, p1, p0

    .line 148
    .line 149
    sget-object p3, La1;->Ε:La1;

    .line 150
    .line 151
    aput-object p3, p1, v0

    .line 152
    .line 153
    new-instance p3, Llm;

    .line 154
    .line 155
    invoke-direct {p3, p0, p1}, Llm;-><init>(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p2, p0, p0, p3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Κ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onTouchModeChanged(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x2

    .line 6
    :goto_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ф:Llm0;

    .line 7
    .line 8
    iget-object p0, p0, Llm0;->α:Lx91;

    .line 9
    .line 10
    new-instance v0, Ljm0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljm0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, p1}, Lln0;->υ(Lz1;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    new-instance v1, Lw1;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, p0, v2, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ж:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

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
    goto :goto_2

    .line 9
    :cond_0
    invoke-static {p1}, Lr40;->β(I)Lq40;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget p1, p1, Lq40;->α:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x7

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    new-instance v3, Lml1;

    .line 27
    .line 28
    iget v4, p2, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    int-to-float v4, v4

    .line 31
    iget v5, p2, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    int-to-float v5, v5

    .line 34
    iget v6, p2, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    int-to-float v6, v6

    .line 37
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    int-to-float p2, p2

    .line 40
    invoke-direct {v3, v4, v5, v6, p2}, Lml1;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v3, v2

    .line 45
    :goto_1
    new-instance p2, Lc1;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {p2, p1, v4}, Lc1;-><init>(II)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Ly40;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3, p2}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p2, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    new-instance v3, Lc1;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-direct {v3, p1, v4}, Lc1;-><init>(II)V

    .line 74
    .line 75
    .line 76
    check-cast p2, Ly40;

    .line 77
    .line 78
    invoke-virtual {p2, p1, v2, v3}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p2, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    :goto_2
    return v1

    .line 89
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_6

    .line 94
    .line 95
    if-ne p1, v1, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/4 p2, 0x2

    .line 99
    if-ne p1, p2, :cond_6

    .line 100
    .line 101
    :goto_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Ly40;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ly40;->η(I)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :cond_6
    const/4 p0, 0x0

    .line 113
    return p0
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 2
    .line 3
    iput-wide p1, p0, Ll1;->μ:J

    .line 4
    .line 5
    return-void
.end method

.method public final setComposeViewContext(Lpn;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Lpn;->β:Lun;

    .line 6
    .line 7
    invoke-virtual {v1}, Lun;->ι()Lup;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lh21;

    .line 22
    .line 23
    invoke-virtual {v0}, Lh21;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first."

    .line 31
    .line 32
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-static {}, Le81;->η()Ltw1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Ltw1;->ε()La80;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 v1, 0x0

    .line 47
    :goto_1
    invoke-static {v0}, Le81;->κ(Ltw1;)Ltw1;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_composeViewContext()Lpn;

    .line 52
    .line 53
    .line 54
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-static {v0, v2, v1}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    invoke-virtual {v3}, Lpn;->β()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lpn;->γ()V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->set_composeViewContext(Lpn;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Lpn;->β:Lun;

    .line 81
    .line 82
    invoke-virtual {p1}, Lun;->ι()Lup;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setCoroutineContext(Lup;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    invoke-static {v0, v2, v1}, Le81;->ο(Ltw1;Ltw1;La80;)V

    .line 92
    .line 93
    .line 94
    throw p0
.end method

.method public final setComposeViewContextIncrementedDuringInit$ui(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->З:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setConfiguration(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ο:Lx91;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setContentCaptureManager$ui(Lz1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Lup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ρ:Lup;

    .line 2
    .line 3
    return-void
.end method

.method public final setFrameEndScheduler$ui(Lkr0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ι:Lkr0;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnReadyForComposition(La80;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDerivedIsAttached()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->З:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->л:La80;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui(Lrl0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setUncaughtExceptionHandler(Lto1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setUncaughtExceptionHandler$ui(Lto1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Α()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ll1;->Α:Z

    .line 5
    .line 6
    iget-object v2, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Ll1;->φ()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-boolean v3, v0, Ll1;->Μ:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iput-boolean v1, v0, Ll1;->Μ:Z

    .line 25
    .line 26
    iget-object v0, v0, Ll1;->Ξ:Lν;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 32
    .line 33
    iput-boolean v1, p0, Lz1;->λ:Z

    .line 34
    .line 35
    iget-object v0, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lz1;->ζ()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-boolean v2, p0, Lz1;->ρ:Z

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iput-boolean v1, p0, Lz1;->ρ:Z

    .line 54
    .line 55
    iget-object p0, p0, Lz1;->σ:Lν;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final Β()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->з:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Е:Ljd;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 20
    .line 21
    invoke-virtual {v0, p0, v1}, Ljd;->α(Landroid/view/View;[F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->е:[F

    .line 25
    .line 26
    invoke-static {v1, v0}, Lbd;->Β([F[F)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v1, p0

    .line 34
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->г:[I

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    aget v3, v0, v2

    .line 56
    .line 57
    int-to-float v3, v3

    .line 58
    const/4 v4, 0x1

    .line 59
    aget v5, v0, v4

    .line 60
    .line 61
    int-to-float v5, v5

    .line 62
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 63
    .line 64
    .line 65
    aget v1, v0, v2

    .line 66
    .line 67
    int-to-float v1, v1

    .line 68
    aget v0, v0, v4

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    sub-float/2addr v3, v1

    .line 72
    sub-float/2addr v5, v0

    .line 73
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    int-to-long v0, v0

    .line 78
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-long v2, v2

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    shl-long/2addr v0, v4

    .line 86
    const-wide v4, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v2, v4

    .line 92
    or-long/2addr v0, v2

    .line 93
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 94
    .line 95
    :cond_1
    return-void
.end method

.method public final Γ(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Е:Ljd;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Ljd;->α(Landroid/view/View;[F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->е:[F

    .line 15
    .line 16
    invoke-static {v1, v0}, Lbd;->Β([F[F)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v3, v0

    .line 32
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-long v5, v0

    .line 37
    const/16 v0, 0x20

    .line 38
    .line 39
    shl-long v2, v3, v0

    .line 40
    .line 41
    const-wide v7, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long v4, v5, v7

    .line 47
    .line 48
    or-long/2addr v2, v4

    .line 49
    invoke-static {v1, v2, v3}, Lbd;->Ε([FJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    shr-long v4, v1, v0

    .line 58
    .line 59
    long-to-int v4, v4

    .line 60
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    and-long/2addr v1, v7

    .line 70
    long-to-int v1, v1

    .line 71
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-float/2addr p1, v1

    .line 76
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    int-to-long v1, v1

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    int-to-long v3, p1

    .line 86
    shl-long v0, v1, v0

    .line 87
    .line 88
    and-long v2, v3, v7

    .line 89
    .line 90
    or-long/2addr v0, v2

    .line 91
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 92
    .line 93
    return-void
.end method

.method public final Δ()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/16 v0, 0x82

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-super {p0, v0, v1}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final Ε(Lyp0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lyp0;->π()Lwp0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lwp0;->ε:Lwp0;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->а:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lyp0;->Κ:Lk31;

    .line 36
    .line 37
    iget-object v0, v0, Lk31;->γ:Lgm0;

    .line 38
    .line 39
    iget-wide v0, v0, Lch1;->θ:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Lyo;->ζ(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {v0, v1}, Lyo;->ε(J)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method

.method public final Ζ(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Β()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    shr-long v1, p1, v0

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 14
    .line 15
    shr-long/2addr v2, v0

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v2

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-wide v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    long-to-int p2, v4

    .line 37
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-float/2addr p1, p2

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    int-to-long v4, p2

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-long p1, p1

    .line 52
    shl-long v0, v4, v0

    .line 53
    .line 54
    and-long/2addr p1, v2

    .line 55
    or-long/2addr p1, v0

    .line 56
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->е:[F

    .line 57
    .line 58
    invoke-static {p0, p1, p2}, Lbd;->Ε([FJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0
.end method

.method public final Η(Landroid/view/MotionEvent;)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ж:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ж:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()Lpn;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lpn;->τ:Llm0;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, Lvb2;->α:Lx91;

    .line 22
    .line 23
    new-instance v3, Lfi1;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Lfi1;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ν:Lb11;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, Lb11;->γ(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Ln5;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ξ:Lsf;

    .line 42
    .line 43
    if-eqz v2, :cond_9

    .line 44
    .line 45
    iget-object v1, v2, Ln5;->ζ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    add-int/lit8 v5, v5, -0x1

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x5

    .line 57
    if-ltz v5, :cond_3

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v8, v5, -0x1

    .line 60
    .line 61
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v9, v5

    .line 66
    check-cast v9, Lci1;

    .line 67
    .line 68
    iget-boolean v9, v9, Lci1;->ε:Z

    .line 69
    .line 70
    if-eqz v9, :cond_1

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    if-ne v3, v7, :cond_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    if-gez v8, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move v5, v8

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    :goto_1
    move-object v5, v6

    .line 83
    :cond_4
    :goto_2
    check-cast v5, Lci1;

    .line 84
    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    iget-wide v8, v5, Lci1;->δ:J

    .line 88
    .line 89
    iput-wide v8, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ζ:J

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ρ(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v4, v2, p0, v1}, Lsf;->α(Ln5;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    iput-object v6, v2, Ln5;->η:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    if-ne v3, v7, :cond_7

    .line 104
    .line 105
    :cond_6
    and-int/lit8 v1, p0, 0x1

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    :cond_7
    return p0

    .line 110
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget-object v1, v0, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 119
    .line 120
    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Lb11;->β:Landroid/util/SparseLongArray;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 126
    .line 127
    .line 128
    return p0

    .line 129
    :cond_9
    iget-boolean p0, v4, Lsf;->α:Z

    .line 130
    .line 131
    if-nez p0, :cond_a

    .line 132
    .line 133
    iget-object p0, v4, Lsf;->δ:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Ly21;

    .line 136
    .line 137
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, Lzv0;

    .line 140
    .line 141
    invoke-virtual {p0}, Lzv0;->α()V

    .line 142
    .line 143
    .line 144
    iget-object p0, v4, Lsf;->γ:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Lke0;

    .line 147
    .line 148
    invoke-virtual {p0}, Lke0;->γ()V

    .line 149
    .line 150
    .line 151
    :cond_a
    return v1
.end method

.method public final Θ(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eq v2, v6, :cond_1

    .line 14
    .line 15
    const/4 v7, 0x6

    .line 16
    if-eq v2, v7, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v2, 0x9

    .line 25
    .line 26
    if-eq v5, v2, :cond_2

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    if-eq v5, v2, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ltz v3, :cond_3

    .line 38
    .line 39
    move v7, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 v7, 0x0

    .line 42
    :goto_1
    sub-int/2addr v2, v7

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_2
    if-ge v8, v2, :cond_5

    .line 50
    .line 51
    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    .line 52
    .line 53
    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 54
    .line 55
    .line 56
    aput-object v9, v7, v8

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    :goto_3
    if-ge v9, v2, :cond_6

    .line 65
    .line 66
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 67
    .line 68
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 69
    .line 70
    .line 71
    aput-object v10, v8, v9

    .line 72
    .line 73
    add-int/lit8 v9, v9, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    const/4 v9, 0x0

    .line 77
    :goto_4
    if-ge v9, v2, :cond_9

    .line 78
    .line 79
    if-ltz v3, :cond_8

    .line 80
    .line 81
    if-ge v9, v3, :cond_7

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move v10, v6

    .line 85
    goto :goto_6

    .line 86
    :cond_8
    :goto_5
    const/4 v10, 0x0

    .line 87
    :goto_6
    add-int/2addr v10, v9

    .line 88
    aget-object v11, v7, v9

    .line 89
    .line 90
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 91
    .line 92
    .line 93
    aget-object v11, v8, v9

    .line 94
    .line 95
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 96
    .line 97
    .line 98
    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 99
    .line 100
    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 101
    .line 102
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    int-to-long v13, v10

    .line 107
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    int-to-long v4, v10

    .line 112
    const/16 v10, 0x20

    .line 113
    .line 114
    shl-long/2addr v13, v10

    .line 115
    const-wide v15, 0xffffffffL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    and-long/2addr v4, v15

    .line 121
    or-long/2addr v4, v13

    .line 122
    invoke-virtual {v0, v4, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    shr-long v13, v4, v10

    .line 127
    .line 128
    long-to-int v10, v13

    .line 129
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 134
    .line 135
    and-long/2addr v4, v15

    .line 136
    long-to-int v4, v4

    .line 137
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    iput v4, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 142
    .line 143
    add-int/lit8 v9, v9, 0x1

    .line 144
    .line 145
    move/from16 v5, p2

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_9
    if-eqz p5, :cond_a

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    goto :goto_7

    .line 152
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    move v10, v4

    .line 157
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 162
    .line 163
    .line 164
    move-result-wide v11

    .line 165
    cmp-long v3, v3, v11

    .line 166
    .line 167
    if-nez v3, :cond_b

    .line 168
    .line 169
    move-wide/from16 v3, p3

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    :goto_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getFlags()I

    .line 201
    .line 202
    .line 203
    move-result v16

    .line 204
    move/from16 v5, p2

    .line 205
    .line 206
    move v6, v2

    .line 207
    move-wide v1, v3

    .line 208
    move-wide/from16 v3, p3

    .line 209
    .line 210
    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Ν:Lb11;

    .line 215
    .line 216
    invoke-virtual {v2, v1, v0}, Lb11;->γ(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Ln5;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Ξ:Lsf;

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    invoke-virtual {v3, v2, v0, v4}, Lsf;->α(Ln5;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final Ι(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getConfiguration()Landroid/content/res/Configuration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    new-instance v1, Landroid/content/res/Configuration;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setConfiguration(Landroid/content/res/Configuration;)V

    .line 17
    .line 18
    .line 19
    iget v1, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 20
    .line 21
    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    cmpg-float v1, v1, v2

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget v1, v0, Landroid/content/res/Configuration;->densityDpi:I

    .line 28
    .line 29
    iget v2, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 30
    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Ljx0;->α(Landroid/content/Context;)Las;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setDensity(Lyr;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const v0, -0x5000e280

    .line 49
    .line 50
    .line 51
    and-int/2addr p1, v0

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->τ:Llm0;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final Κ()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->г:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->в:J

    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    shr-long v5, v2, v4

    .line 13
    .line 14
    long-to-int v5, v5

    .line 15
    const-wide v6, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v6

    .line 21
    long-to-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    aget v8, v1, v3

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    if-ne v5, v8, :cond_0

    .line 27
    .line 28
    aget v10, v1, v9

    .line 29
    .line 30
    if-ne v2, v10, :cond_0

    .line 31
    .line 32
    iget-wide v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->ж:J

    .line 33
    .line 34
    const-wide/16 v12, 0x0

    .line 35
    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-gez v10, :cond_2

    .line 39
    .line 40
    :cond_0
    aget v1, v1, v9

    .line 41
    .line 42
    int-to-long v10, v8

    .line 43
    shl-long/2addr v10, v4

    .line 44
    int-to-long v12, v1

    .line 45
    and-long/2addr v6, v12

    .line 46
    or-long/2addr v6, v10

    .line 47
    iput-wide v6, v0, Landroidx/compose/ui/platform/AndroidComposeView;->в:J

    .line 48
    .line 49
    const v1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v5, v1, :cond_2

    .line 53
    .line 54
    if-eq v2, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()Lyp0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v1, v1, Lk21;->η:I

    .line 67
    .line 68
    move v4, v3

    .line 69
    :goto_0
    if-ge v4, v1, :cond_1

    .line 70
    .line 71
    aget-object v5, v2, v4

    .line 72
    .line 73
    check-cast v5, Lyp0;

    .line 74
    .line 75
    iget-object v5, v5, Lyp0;->Λ:Lbq0;

    .line 76
    .line 77
    iget-object v5, v5, Lbq0;->π:Lox0;

    .line 78
    .line 79
    invoke-virtual {v5}, Lox0;->я()V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v1, v9

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v1, v3

    .line 88
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Β()V

    .line 89
    .line 90
    .line 91
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->К:Landroid/view/View;

    .line 92
    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->К:Landroid/view/View;

    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-wide v11, v0, Landroidx/compose/ui/platform/AndroidComposeView;->в:J

    .line 106
    .line 107
    iget-wide v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 108
    .line 109
    invoke-static {v5, v6}, Lh62;->щ(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v13

    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v17

    .line 121
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 125
    .line 126
    array-length v5, v2

    .line 127
    const/16 v6, 0x10

    .line 128
    .line 129
    const/4 v7, 0x2

    .line 130
    if-ge v5, v6, :cond_4

    .line 131
    .line 132
    move v5, v3

    .line 133
    goto/16 :goto_4

    .line 134
    .line 135
    :cond_4
    aget v5, v2, v3

    .line 136
    .line 137
    const/high16 v6, 0x3f800000    # 1.0f

    .line 138
    .line 139
    cmpg-float v5, v5, v6

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    if-nez v5, :cond_5

    .line 143
    .line 144
    aget v5, v2, v9

    .line 145
    .line 146
    cmpg-float v5, v5, v8

    .line 147
    .line 148
    if-nez v5, :cond_5

    .line 149
    .line 150
    aget v5, v2, v7

    .line 151
    .line 152
    cmpg-float v5, v5, v8

    .line 153
    .line 154
    if-nez v5, :cond_5

    .line 155
    .line 156
    const/4 v5, 0x4

    .line 157
    aget v5, v2, v5

    .line 158
    .line 159
    cmpg-float v5, v5, v8

    .line 160
    .line 161
    if-nez v5, :cond_5

    .line 162
    .line 163
    const/4 v5, 0x5

    .line 164
    aget v5, v2, v5

    .line 165
    .line 166
    cmpg-float v5, v5, v6

    .line 167
    .line 168
    if-nez v5, :cond_5

    .line 169
    .line 170
    const/4 v5, 0x6

    .line 171
    aget v5, v2, v5

    .line 172
    .line 173
    cmpg-float v5, v5, v8

    .line 174
    .line 175
    if-nez v5, :cond_5

    .line 176
    .line 177
    const/16 v5, 0x8

    .line 178
    .line 179
    aget v5, v2, v5

    .line 180
    .line 181
    cmpg-float v5, v5, v8

    .line 182
    .line 183
    if-nez v5, :cond_5

    .line 184
    .line 185
    const/16 v5, 0x9

    .line 186
    .line 187
    aget v5, v2, v5

    .line 188
    .line 189
    cmpg-float v5, v5, v8

    .line 190
    .line 191
    if-nez v5, :cond_5

    .line 192
    .line 193
    const/16 v5, 0xa

    .line 194
    .line 195
    aget v5, v2, v5

    .line 196
    .line 197
    cmpg-float v5, v5, v6

    .line 198
    .line 199
    if-nez v5, :cond_5

    .line 200
    .line 201
    move v5, v9

    .line 202
    goto :goto_2

    .line 203
    :cond_5
    move v5, v3

    .line 204
    :goto_2
    const/16 v10, 0xc

    .line 205
    .line 206
    aget v10, v2, v10

    .line 207
    .line 208
    cmpg-float v10, v10, v8

    .line 209
    .line 210
    if-nez v10, :cond_6

    .line 211
    .line 212
    const/16 v10, 0xd

    .line 213
    .line 214
    aget v10, v2, v10

    .line 215
    .line 216
    cmpg-float v10, v10, v8

    .line 217
    .line 218
    if-nez v10, :cond_6

    .line 219
    .line 220
    const/16 v10, 0xe

    .line 221
    .line 222
    aget v10, v2, v10

    .line 223
    .line 224
    cmpg-float v8, v10, v8

    .line 225
    .line 226
    if-nez v8, :cond_6

    .line 227
    .line 228
    const/16 v8, 0xf

    .line 229
    .line 230
    aget v8, v2, v8

    .line 231
    .line 232
    cmpg-float v6, v8, v6

    .line 233
    .line 234
    if-nez v6, :cond_6

    .line 235
    .line 236
    move v6, v9

    .line 237
    goto :goto_3

    .line 238
    :cond_6
    move v6, v3

    .line 239
    :goto_3
    shl-int/2addr v5, v9

    .line 240
    or-int/2addr v5, v6

    .line 241
    :goto_4
    iget-object v10, v4, Lol1;->γ:Lj42;

    .line 242
    .line 243
    and-int/2addr v5, v7

    .line 244
    if-nez v5, :cond_7

    .line 245
    .line 246
    :goto_5
    move-object v15, v2

    .line 247
    goto :goto_6

    .line 248
    :cond_7
    const/4 v2, 0x0

    .line 249
    goto :goto_5

    .line 250
    :goto_6
    invoke-virtual/range {v10 .. v17}, Lj42;->α(JJ[FII)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-nez v2, :cond_8

    .line 255
    .line 256
    iget-boolean v2, v4, Lol1;->ζ:Z

    .line 257
    .line 258
    if-eqz v2, :cond_9

    .line 259
    .line 260
    :cond_8
    move v3, v9

    .line 261
    :cond_9
    iput-boolean v3, v4, Lol1;->ζ:Z

    .line 262
    .line 263
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 264
    .line 265
    invoke-virtual {v2, v1}, Lmx0;->β(Z)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Lol1;->α()V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public final Λ(F)V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->ο()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v1, p1, v0

    .line 9
    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ю:F

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ю:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    if-lez v0, :cond_3

    .line 25
    .line 26
    :cond_0
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ю:F

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    cmpg-float v0, p1, v0

    .line 30
    .line 31
    if-gez v0, :cond_3

    .line 32
    .line 33
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 42
    .line 43
    cmpg-float v0, p1, v0

    .line 44
    .line 45
    if-gez v0, :cond_3

    .line 46
    .line 47
    :cond_2
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->я:F

    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method public final α(Lc50;Lc50;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    iget-object p0, p1, Lq01;->ε:Lq01;

    .line 4
    .line 5
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "visitAncestors called on an unattached node"

    .line 10
    .line 11
    invoke-static {p0}, Lam0;->β(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p1, Lq01;->ε:Lq01;

    .line 15
    .line 16
    invoke-static {p1}, Lh62;->ц(Lur;)Lyp0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    if-eqz p1, :cond_a

    .line 21
    .line 22
    iget-object p2, p1, Lyp0;->Κ:Lk31;

    .line 23
    .line 24
    iget-object p2, p2, Lk31;->ζ:Lq01;

    .line 25
    .line 26
    iget p2, p2, Lq01;->θ:I

    .line 27
    .line 28
    const/high16 v0, 0x200000

    .line 29
    .line 30
    and-int/2addr p2, v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz p2, :cond_8

    .line 33
    .line 34
    :goto_1
    if-eqz p0, :cond_8

    .line 35
    .line 36
    iget p2, p0, Lq01;->η:I

    .line 37
    .line 38
    and-int/2addr p2, v0

    .line 39
    if-eqz p2, :cond_7

    .line 40
    .line 41
    move-object p2, p0

    .line 42
    move-object v2, v1

    .line 43
    :goto_2
    if-eqz p2, :cond_7

    .line 44
    .line 45
    iget v3, p2, Lq01;->η:I

    .line 46
    .line 47
    and-int/2addr v3, v0

    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    instance-of v3, p2, Lya;

    .line 51
    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    move-object v3, p2

    .line 55
    check-cast v3, Lya;

    .line 56
    .line 57
    iget-object v3, v3, Lya;->υ:Lq01;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    :goto_3
    const/4 v5, 0x1

    .line 61
    if-eqz v3, :cond_5

    .line 62
    .line 63
    iget v6, v3, Lq01;->η:I

    .line 64
    .line 65
    and-int/2addr v6, v0

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    if-ne v4, v5, :cond_1

    .line 71
    .line 72
    move-object p2, v3

    .line 73
    goto :goto_4

    .line 74
    :cond_1
    if-nez v2, :cond_2

    .line 75
    .line 76
    new-instance v2, Lk21;

    .line 77
    .line 78
    const/16 v5, 0x10

    .line 79
    .line 80
    new-array v5, v5, [Lq01;

    .line 81
    .line 82
    invoke-direct {v2, v5}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    if-eqz p2, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2, p2}, Lk21;->β(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object p2, v1

    .line 91
    :cond_3
    invoke-virtual {v2, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_4
    iget-object v3, v3, Lq01;->κ:Lq01;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    if-ne v4, v5, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    invoke-static {v2}, Lh62;->γ(Lk21;)Lq01;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    goto :goto_2

    .line 105
    :cond_7
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_8
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_9

    .line 113
    .line 114
    iget-object p0, p1, Lyp0;->Κ:Lk31;

    .line 115
    .line 116
    if-eqz p0, :cond_9

    .line 117
    .line 118
    iget-object p0, p0, Lk31;->ε:Lq22;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_9
    move-object p0, v1

    .line 122
    goto :goto_0

    .line 123
    :cond_a
    return-void
.end method

.method public final δ(Lhr0;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->κ:Llr0;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    iget-object p1, p0, Llr0;->α:Ln;

    .line 6
    .line 7
    iget-object p1, p1, Ln;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lvw0;

    .line 10
    .line 11
    iget-boolean v0, p1, Lvw0;->ε:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p1, Lvw0;->η:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Llr0;->δ:Lbe;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lbe;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Llr0;->δ:Lbe;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean p0, p1, Lvw0;->ζ:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-boolean p0, p1, Lvw0;->η:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    const-string p0, "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"

    .line 40
    .line 41
    invoke-static {p0}, Lqi1;->α(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p0, p1, Lvw0;->θ:Lb21;

    .line 45
    .line 46
    invoke-virtual {p0}, Lb21;->ι()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_4

    .line 51
    .line 52
    const-string p0, "Attempted to start retaining exited values with pending exited values"

    .line 53
    .line 54
    invoke-static {p0}, Lqi1;->α(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p0, 0x0

    .line 58
    iput-boolean p0, p1, Lvw0;->η:Z

    .line 59
    .line 60
    :cond_5
    :goto_0
    return-void
.end method

.method public final θ(Lhr0;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->κ:Llr0;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ι:Lkr0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Llr0;->α:Ln;

    .line 11
    .line 12
    iget-object v1, v0, Ln;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lvw0;

    .line 15
    .line 16
    iget-boolean v2, v1, Lvw0;->ε:Z

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget-boolean v1, v1, Lvw0;->η:Z

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    :try_start_0
    new-instance v1, Lk1;

    .line 25
    .line 26
    const/4 v2, 0x6

    .line 27
    invoke-direct {v1, v2, p1}, Lk1;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p0, Lid2;

    .line 31
    .line 32
    iget-object p0, p0, Lid2;->α:Lun;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lun;->π(Lk1;)Lbe;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    goto :goto_1

    .line 39
    :catch_0
    iget-object p0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lvw0;

    .line 42
    .line 43
    iget-boolean v0, p0, Lvw0;->ζ:Z

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-boolean v0, p0, Lvw0;->η:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 53
    .line 54
    invoke-static {v0}, Lqi1;->α(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, Lvw0;->α()V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lvw0;->η:Z

    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    :goto_1
    iget-object v0, p1, Llr0;->δ:Lbe;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Lbe;->cancel()V

    .line 69
    .line 70
    .line 71
    :cond_2
    iput-object p0, p1, Llr0;->δ:Lbe;

    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public final λ(Lyp0;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lmx0;->ζ(Lyp0;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final μ(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->А:Ld1;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Γ(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, Landroidx/compose/ui/platform/AndroidComposeView;->з:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->υ(Z)V

    .line 18
    .line 19
    .line 20
    const-string v2, "AndroidOwner:onTouch"

    .line 21
    .line 22
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 30
    .line 31
    const/4 v10, 0x3

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 35
    .line 36
    .line 37
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-ne v3, v10, :cond_0

    .line 39
    .line 40
    move v11, v8

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v11, v7

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :goto_0
    const/16 v12, 0xa

    .line 48
    .line 49
    iget-object v13, v1, Landroidx/compose/ui/platform/AndroidComposeView;->Ξ:Lsf;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v3, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eq v3, v4, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v3, v7

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    :goto_1
    move v3, v8

    .line 77
    :goto_2
    if-eqz v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    :cond_3
    move-object v14, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    if-eq v3, v4, :cond_3

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eq v3, v12, :cond_5

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    const/4 v6, 0x1

    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->Θ(Landroid/view/MotionEvent;IJZ)V

    .line 115
    .line 116
    .line 117
    move-object v14, v2

    .line 118
    goto :goto_4

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object/from16 v1, p0

    .line 121
    .line 122
    goto/16 :goto_d

    .line 123
    .line 124
    :cond_5
    move-object v14, v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    iget-boolean v1, v13, Lsf;->α:Z

    .line 127
    .line 128
    if-nez v1, :cond_6

    .line 129
    .line 130
    iget-object v1, v13, Lsf;->δ:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Ly21;

    .line 133
    .line 134
    iget-object v1, v1, Ly21;->ε:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lzv0;

    .line 137
    .line 138
    invoke-virtual {v1}, Lzv0;->α()V

    .line 139
    .line 140
    .line 141
    iget-object v1, v13, Lsf;->γ:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lke0;

    .line 144
    .line 145
    invoke-virtual {v1}, Lke0;->γ()V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_4
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-ne v1, v10, :cond_7

    .line 153
    .line 154
    move v1, v8

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move v1, v7

    .line 157
    :goto_5
    const/16 v15, 0x9

    .line 158
    .line 159
    if-nez v11, :cond_8

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    if-eq v9, v10, :cond_8

    .line 164
    .line 165
    if-eq v9, v15, :cond_8

    .line 166
    .line 167
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ρ(Landroid/view/MotionEvent;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_8

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    const/4 v6, 0x1

    .line 178
    const/16 v3, 0x9

    .line 179
    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    move-object v2, v0

    .line 183
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->Θ(Landroid/view/MotionEvent;IJZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object/from16 v1, p0

    .line 188
    .line 189
    :goto_6
    if-eqz v14, :cond_9

    .line 190
    .line 191
    invoke-virtual {v14}, Landroid/view/MotionEvent;->recycle()V

    .line 192
    .line 193
    .line 194
    :cond_9
    iget-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 195
    .line 196
    if-eqz v0, :cond_14

    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-ne v0, v12, :cond_14

    .line 203
    .line 204
    iget-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 205
    .line 206
    if-eqz v0, :cond_a

    .line 207
    .line 208
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    goto :goto_7

    .line 213
    :cond_a
    const/4 v0, -0x1

    .line 214
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 215
    .line 216
    .line 217
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    iget-object v3, v1, Landroidx/compose/ui/platform/AndroidComposeView;->Ν:Lb11;

    .line 219
    .line 220
    if-ne v2, v15, :cond_b

    .line 221
    .line 222
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_b

    .line 227
    .line 228
    if-ltz v0, :cond_14

    .line 229
    .line 230
    iget-object v2, v3, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 231
    .line 232
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 233
    .line 234
    .line 235
    iget-object v2, v3, Lb11;->β:Landroid/util/SparseLongArray;

    .line 236
    .line 237
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_c

    .line 241
    .line 242
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-nez v2, :cond_14

    .line 247
    .line 248
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-nez v2, :cond_14

    .line 253
    .line 254
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 255
    .line 256
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 257
    .line 258
    if-eqz v2, :cond_c

    .line 259
    .line 260
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    goto :goto_8

    .line 265
    :cond_c
    move v2, v4

    .line 266
    :goto_8
    iget-object v5, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 267
    .line 268
    if-eqz v5, :cond_d

    .line 269
    .line 270
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    cmpg-float v2, v2, v5

    .line 283
    .line 284
    if-nez v2, :cond_e

    .line 285
    .line 286
    cmpg-float v2, v4, v6

    .line 287
    .line 288
    if-nez v2, :cond_e

    .line 289
    .line 290
    move v2, v7

    .line 291
    goto :goto_9

    .line 292
    :cond_e
    move v2, v8

    .line 293
    :goto_9
    iget-object v4, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 294
    .line 295
    if-eqz v4, :cond_f

    .line 296
    .line 297
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getEventTime()J

    .line 298
    .line 299
    .line 300
    move-result-wide v4

    .line 301
    goto :goto_a

    .line 302
    :cond_f
    const-wide/16 v4, -0x1

    .line 303
    .line 304
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 305
    .line 306
    .line 307
    move-result-wide v9

    .line 308
    cmp-long v4, v4, v9

    .line 309
    .line 310
    if-eqz v4, :cond_10

    .line 311
    .line 312
    move v4, v8

    .line 313
    goto :goto_b

    .line 314
    :cond_10
    move v4, v7

    .line 315
    :goto_b
    if-nez v2, :cond_11

    .line 316
    .line 317
    if-eqz v4, :cond_14

    .line 318
    .line 319
    :cond_11
    if-ltz v0, :cond_12

    .line 320
    .line 321
    iget-object v2, v3, Lb11;->γ:Landroid/util/SparseBooleanArray;

    .line 322
    .line 323
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 324
    .line 325
    .line 326
    iget-object v2, v3, Lb11;->β:Landroid/util/SparseLongArray;

    .line 327
    .line 328
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 329
    .line 330
    .line 331
    :cond_12
    iget-object v0, v13, Lsf;->γ:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Lke0;

    .line 334
    .line 335
    iget-boolean v2, v0, Lke0;->δ:Z

    .line 336
    .line 337
    if-eqz v2, :cond_13

    .line 338
    .line 339
    iput-boolean v8, v0, Lke0;->δ:Z

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_13
    iget-object v0, v0, Lke0;->η:Lt31;

    .line 343
    .line 344
    iget-object v0, v0, Lt31;->α:Lk21;

    .line 345
    .line 346
    invoke-virtual {v0}, Lk21;->η()V

    .line 347
    .line 348
    .line 349
    :cond_14
    :goto_c
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    iput-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 354
    .line 355
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Η(Landroid/view/MotionEvent;)I

    .line 356
    .line 357
    .line 358
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 359
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 360
    .line 361
    .line 362
    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->з:Z

    .line 363
    .line 364
    return v0

    .line 365
    :catchall_2
    move-exception v0

    .line 366
    goto :goto_e

    .line 367
    :goto_d
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 368
    .line 369
    .line 370
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 371
    :goto_e
    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->з:Z

    .line 372
    .line 373
    throw v0
.end method

.method public final ξ(Lyp0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lmx0;->π(Lyp0;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lyp0;->ψ()Lk21;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Lk21;->ε:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, Lk21;->η:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, Lyp0;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->ξ(Lyp0;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final ρ(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v0, v0, v2

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    cmpg-float v0, v1, p1

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    cmpg-float p0, p1, p0

    .line 33
    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final σ(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->ч:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    cmpg-float v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    cmpg-float p0, p1, p0

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public final τ(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->Β()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->д:[F

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Lbd;->Ε([FJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v1, p1, v0

    .line 13
    .line 14
    long-to-int v1, v1

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 20
    .line 21
    shr-long/2addr v2, v0

    .line 22
    long-to-int v2, v2

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-float/2addr v2, v1

    .line 28
    const-wide v3, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p1, v3

    .line 34
    long-to-int p1, p1

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-wide v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->и:J

    .line 40
    .line 41
    and-long/2addr v5, v3

    .line 42
    long-to-int p0, v5

    .line 43
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-float/2addr p0, p1

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-long p1, p1

    .line 53
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-long v1, p0

    .line 58
    shl-long p0, p1, v0

    .line 59
    .line 60
    and-long v0, v1, v3

    .line 61
    .line 62
    or-long/2addr p0, v0

    .line 63
    return-wide p0
.end method

.method public final υ(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    iget-object v1, v0, Lmx0;->β:Lm6;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm6;->Κ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lmx0;->ε:Ln5;

    .line 12
    .line 13
    iget-object v1, v1, Ln5;->ζ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lk21;

    .line 16
    .line 17
    iget v1, v1, Lk21;->η:I

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 24
    .line 25
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Д:Lx0;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    :goto_1
    invoke-virtual {v0, p1}, Lmx0;->λ(Lx0;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 41
    .line 42
    .line 43
    :cond_3
    const/4 p1, 0x0

    .line 44
    invoke-virtual {v0, p1}, Lmx0;->β(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lol1;->α()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 60
    .line 61
    .line 62
    throw p0
.end method

.method public final φ()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Τ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Ly81;->α:Lkx1;

    .line 12
    .line 13
    iget-object v3, v0, Lkx1;->η:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v0, Lkx1;->ζ:Lk21;

    .line 17
    .line 18
    iget v4, v0, Lk21;->η:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    move v5, v2

    .line 21
    move v6, v5

    .line 22
    :goto_0
    iget-object v7, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 23
    .line 24
    if-ge v5, v4, :cond_2

    .line 25
    .line 26
    :try_start_1
    aget-object v7, v7, v5

    .line 27
    .line 28
    check-cast v7, Ljx1;

    .line 29
    .line 30
    invoke-virtual {v7}, Ljx1;->δ()V

    .line 31
    .line 32
    .line 33
    iget-object v7, v7, Ljx1;->ζ:Lb21;

    .line 34
    .line 35
    invoke-virtual {v7}, Lb21;->κ()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_0

    .line 40
    .line 41
    add-int/lit8 v6, v6, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    if-lez v6, :cond_1

    .line 45
    .line 46
    iget-object v7, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 47
    .line 48
    sub-int v8, v5, v6

    .line 49
    .line 50
    aget-object v9, v7, v5

    .line 51
    .line 52
    aput-object v9, v7, v8

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sub-int v5, v4, v6

    .line 61
    .line 62
    invoke-static {v7, v5, v4, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput v5, v0, Lk21;->η:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit v3

    .line 68
    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Τ:Z

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :goto_2
    monitor-exit v3

    .line 72
    throw p0

    .line 73
    :cond_3
    :goto_3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ψ:Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->ζ(Landroid/view/ViewGroup;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 81
    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    iget-object v3, v0, Lk0;->λ:Lo11;

    .line 85
    .line 86
    iget v4, v3, Lo11;->δ:I

    .line 87
    .line 88
    if-nez v4, :cond_5

    .line 89
    .line 90
    iget-boolean v4, v0, Lk0;->μ:Z

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    iget-object v4, v0, Lk0;->ε:Ly21;

    .line 95
    .line 96
    iget-object v4, v4, Ly21;->ε:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Landroid/view/autofill/AutofillManager;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/autofill/AutofillManager;->commit()V

    .line 101
    .line 102
    .line 103
    iput-boolean v2, v0, Lk0;->μ:Z

    .line 104
    .line 105
    :cond_5
    iget v3, v3, Lo11;->δ:I

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    iput-boolean v3, v0, Lk0;->μ:Z

    .line 111
    .line 112
    :cond_6
    :goto_4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 113
    .line 114
    invoke-virtual {v0}, Lv11;->ι()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_a

    .line 119
    .line 120
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_a

    .line 127
    .line 128
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 129
    .line 130
    iget v0, v0, Lv11;->β:I

    .line 131
    .line 132
    move v3, v2

    .line 133
    :goto_5
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 134
    .line 135
    if-ge v3, v0, :cond_9

    .line 136
    .line 137
    invoke-virtual {v4, v3}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lp70;

    .line 142
    .line 143
    iget-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->э:Lv11;

    .line 144
    .line 145
    if-ltz v3, :cond_8

    .line 146
    .line 147
    iget v6, v5, Lv11;->β:I

    .line 148
    .line 149
    if-ge v3, v6, :cond_8

    .line 150
    .line 151
    iget-object v5, v5, Lv11;->α:[Ljava/lang/Object;

    .line 152
    .line 153
    aget-object v6, v5, v3

    .line 154
    .line 155
    aput-object v1, v5, v3

    .line 156
    .line 157
    if-eqz v4, :cond_7

    .line 158
    .line 159
    invoke-interface {v4}, Lp70;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    invoke-virtual {v5, v3}, Lv11;->ξ(I)V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :cond_9
    invoke-virtual {v4, v2, v0}, Lv11;->μ(II)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    return-void
.end method

.method public final χ(Lyp0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ε:Ll1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ll1;->Α:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Ll1;->φ()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Ll1;->χ(Lyp0;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ:Lz1;

    .line 17
    .line 18
    iput-boolean v1, p0, Lz1;->λ:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lz1;->ζ()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lz1;->μ:Lwc;

    .line 27
    .line 28
    sget-object p1, Ls62;->α:Ls62;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final ψ(Lyp0;ZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, Lmx0;->β:Lm6;

    .line 6
    .line 7
    iget-object v1, p1, Lyp0;->μ:Lyp0;

    .line 8
    .line 9
    iget-object v2, p1, Lyp0;->Λ:Lbq0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v1, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    .line 15
    .line 16
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, v2, Lbq0;->δ:Lup0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_a

    .line 27
    .line 28
    if-eq v1, v3, :cond_c

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-eq v1, v4, :cond_a

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    if-eq v1, v4, :cond_a

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-ne v1, v4, :cond_9

    .line 38
    .line 39
    iget-boolean v1, v2, Lbq0;->ε:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    iput-boolean v3, v2, Lbq0;->ε:Z

    .line 48
    .line 49
    iget-object p3, v2, Lbq0;->π:Lox0;

    .line 50
    .line 51
    iput-boolean v3, p3, Lox0;->ψ:Z

    .line 52
    .line 53
    iget-boolean p3, p1, Lyp0;->Τ:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Lyp0;->Ι()Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {p3, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lmx0;->θ(Lyp0;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_7

    .line 81
    .line 82
    iget-object p3, p3, Lyp0;->Λ:Lbq0;

    .line 83
    .line 84
    iget-boolean p3, p3, Lbq0;->ε:Z

    .line 85
    .line 86
    if-ne p3, v3, :cond_7

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lyp0;->Θ()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-static {p1}, Lmx0;->ι(Lyp0;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_8

    .line 99
    .line 100
    :cond_5
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    invoke-virtual {p3}, Lyp0;->ο()Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-ne p3, v3, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    sget-object p3, Lqn0;->η:Lqn0;

    .line 114
    .line 115
    invoke-virtual {p2, p1, p3}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    sget-object p3, Lqn0;->ε:Lqn0;

    .line 120
    .line 121
    invoke-virtual {p2, p1, p3}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 122
    .line 123
    .line 124
    :cond_8
    :goto_1
    iget-boolean p2, v0, Lmx0;->δ:Z

    .line 125
    .line 126
    if-nez p2, :cond_c

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ε(Lyp0;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_9
    invoke-static {}, Lγ;->κ()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_a
    iget-object p0, v0, Lmx0;->θ:Lk21;

    .line 137
    .line 138
    new-instance p2, Llx0;

    .line 139
    .line 140
    invoke-direct {p2, p1, v3, p3}, Llx0;-><init>(Lyp0;ZZ)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p2}, Lk21;->β(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_b
    invoke-virtual {v0, p1, p3}, Lmx0;->π(Lyp0;Z)Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-eqz p2, :cond_c

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ε(Lyp0;)V

    .line 154
    .line 155
    .line 156
    :cond_c
    :goto_2
    return-void
.end method

.method public final ω(Lyp0;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lqn0;->θ:Lqn0;

    .line 5
    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    iget-object v7, p0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget-object p2, v7, Lmx0;->β:Lm6;

    .line 15
    .line 16
    iget-object v8, v0, Lbq0;->δ:Lup0;

    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-eq v8, v6, :cond_13

    .line 25
    .line 26
    if-eq v8, v5, :cond_1

    .line 27
    .line 28
    if-eq v8, v4, :cond_13

    .line 29
    .line 30
    if-ne v8, v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-boolean v3, v0, Lbq0;->ε:Z

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-boolean v3, v0, Lbq0;->ζ:Z

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    :cond_2
    if-nez p3, :cond_3

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_3
    iput-boolean v6, v0, Lbq0;->ζ:Z

    .line 50
    .line 51
    iput-boolean v6, v0, Lbq0;->η:Z

    .line 52
    .line 53
    iget-object p3, v0, Lbq0;->π:Lox0;

    .line 54
    .line 55
    iput-boolean v6, p3, Lox0;->ω:Z

    .line 56
    .line 57
    iput-boolean v6, p3, Lox0;->Α:Z

    .line 58
    .line 59
    iget-boolean p3, p1, Lyp0;->Τ:Z

    .line 60
    .line 61
    if-eqz p3, :cond_4

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p1}, Lyp0;->Ι()Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    if-eqz p3, :cond_5

    .line 82
    .line 83
    iget-object v0, p3, Lyp0;->Λ:Lbq0;

    .line 84
    .line 85
    iget-boolean v0, v0, Lbq0;->ε:Z

    .line 86
    .line 87
    if-ne v0, v6, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    if-eqz p3, :cond_6

    .line 91
    .line 92
    iget-object v0, p3, Lyp0;->Λ:Lbq0;

    .line 93
    .line 94
    iget-boolean v0, v0, Lbq0;->ζ:Z

    .line 95
    .line 96
    if-ne v0, v6, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    sget-object p3, Lqn0;->ζ:Lqn0;

    .line 100
    .line 101
    invoke-virtual {p2, p1, p3}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    :goto_1
    invoke-virtual {p1}, Lyp0;->Θ()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    if-eqz p3, :cond_8

    .line 112
    .line 113
    invoke-virtual {p3}, Lyp0;->ξ()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v6, :cond_8

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    if-eqz p3, :cond_9

    .line 121
    .line 122
    invoke-virtual {p3}, Lyp0;->ο()Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-ne p3, v6, :cond_9

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    invoke-virtual {p2, p1, v2}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_2
    iget-boolean p1, v7, Lmx0;->δ:Z

    .line 133
    .line 134
    if-nez p1, :cond_13

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ε(Lyp0;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p2, v0, Lbq0;->δ:Lup0;

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_13

    .line 150
    .line 151
    if-eq p2, v6, :cond_13

    .line 152
    .line 153
    if-eq p2, v5, :cond_13

    .line 154
    .line 155
    if-eq p2, v4, :cond_13

    .line 156
    .line 157
    if-ne p2, v3, :cond_12

    .line 158
    .line 159
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-eqz p2, :cond_d

    .line 164
    .line 165
    invoke-virtual {p2}, Lyp0;->Θ()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_c

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_c
    const/4 v3, 0x0

    .line 173
    goto :goto_4

    .line 174
    :cond_d
    :goto_3
    move v3, v6

    .line 175
    :goto_4
    if-nez p3, :cond_e

    .line 176
    .line 177
    invoke-virtual {p1}, Lyp0;->ο()Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-nez p3, :cond_13

    .line 182
    .line 183
    invoke-virtual {p1}, Lyp0;->ξ()Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_e

    .line 188
    .line 189
    invoke-virtual {p1}, Lyp0;->Θ()Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-ne p3, v3, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Lyp0;->Θ()Z

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    iget-object v4, v0, Lbq0;->π:Lox0;

    .line 200
    .line 201
    iget-boolean v4, v4, Lox0;->χ:Z

    .line 202
    .line 203
    if-ne p3, v4, :cond_e

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_e
    iget-object p3, v0, Lbq0;->π:Lox0;

    .line 207
    .line 208
    iput-boolean v6, p3, Lox0;->ω:Z

    .line 209
    .line 210
    iput-boolean v6, p3, Lox0;->Α:Z

    .line 211
    .line 212
    iget-boolean v0, p1, Lyp0;->Τ:Z

    .line 213
    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_f
    iget-boolean p3, p3, Lox0;->χ:Z

    .line 218
    .line 219
    if-eqz p3, :cond_13

    .line 220
    .line 221
    if-eqz v3, :cond_13

    .line 222
    .line 223
    if-eqz p2, :cond_10

    .line 224
    .line 225
    invoke-virtual {p2}, Lyp0;->ξ()Z

    .line 226
    .line 227
    .line 228
    move-result p3

    .line 229
    if-ne p3, v6, :cond_10

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_10
    if-eqz p2, :cond_11

    .line 233
    .line 234
    invoke-virtual {p2}, Lyp0;->ο()Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-ne p2, v6, :cond_11

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_11
    iget-object p2, v7, Lmx0;->β:Lm6;

    .line 242
    .line 243
    invoke-virtual {p2, p1, v2}, Lm6;->ν(Lyp0;Lqn0;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    iget-boolean p1, v7, Lmx0;->δ:Z

    .line 247
    .line 248
    if-nez p1, :cond_13

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->Ε(Lyp0;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_12
    invoke-static {}, Lγ;->κ()V

    .line 255
    .line 256
    .line 257
    :cond_13
    :goto_6
    return-void
.end method
