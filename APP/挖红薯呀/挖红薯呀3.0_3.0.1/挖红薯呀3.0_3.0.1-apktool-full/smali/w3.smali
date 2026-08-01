.class public final Lw3;
.super Landroid/view/ViewGroup;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ldn0;
.implements Lzv0;
.implements Lem;
.implements Lvm0;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;
.implements Lvu;


# static fields
.field public static K0:Ljava/lang/Class;

.field public static L0:Ljava/lang/reflect/Method;

.field public static final M0:Ldh0;

.field public static N0:Lh3;

.field public static O0:Ljava/lang/reflect/Method;


# instance fields
.field public final A:La01;

.field public final A0:Lu3;

.field public final B:Lc4;

.field public final B0:Lg3;

.field public C:Lv4;

.field public C0:Z

.field public final D:Lw2;

.field public final D0:Ls10;

.field public final E:Ls5;

.field public final E0:Lt3;

.field public final F:Ll9;

.field public final F0:Loc;

.field public final G:Ldh0;

.field public G0:Z

.field public H:Ldh0;

.field public final H0:Li90;

.field public I:Z

.field public I0:Landroid/view/View;

.field public final J:Lag0;

.field public final J0:Lr3;

.field public final K:Lfe;

.field public final L:Lgp0;

.field public final M:Ly2;

.field public final N:La3;

.field public O:Z

.field public final P:Le3;

.field public final Q:Ld3;

.field public final R:Lfn0;

.field public S:Lw6;

.field public T:Lpj;

.field public U:Z

.field public final V:Lud0;

.field public W:J

.field public final a0:[I

.field public final b0:[F

.field public final c0:[F

.field public d:J

.field public d0:J

.field public final e:Z

.field public e0:Z

.field public f:Lg10;

.field public f0:J

.field public final g:Ld60;

.field public final g0:Lgp0;

.field public h:Laa0;

.field public final h0:Ldn;

.field public i:Lba0;

.field public i0:Lsw;

.field public j:Lfv0;

.field public final j0:Le20;

.field public final k:Lx8;

.field public final k0:La71;

.field public final l:Lg3;

.field public final l0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final m:Lgp0;

.field public final m0:Lr3;

.field public final n:Landroid/view/View;

.field public final n0:Lr3;

.field public final o:Z

.field public final o0:Lgp0;

.field public final p:Lzu;

.field public final p0:Lgp0;

.field public q:Lpk;

.field public final q0:Lyl;

.field public final r:Lf5;

.field public final r0:Lh20;

.field public final s:Li90;

.field public final s0:Lqe0;

.field public final t:Lx1;

.field public final t0:Lr3;

.field public final u:Lu6;

.field public u0:Landroid/view/MotionEvent;

.field public final v:Ll20;

.field public v0:J

.field public final w:Lb60;

.field public final w0:Ld;

.field public final x:Lug0;

.field public final x0:Ldh0;

.field public final y:Lut0;

.field public y0:F

.field public final z:Lw3;

.field public z0:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldh0;

    .line 2
    .line 3
    invoke-direct {v0}, Ldh0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw3;->M0:Ldh0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpk;)V
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, v2, Lw3;->d:J

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    iput-boolean v9, v2, Lw3;->e:Z

    .line 17
    .line 18
    new-instance v0, Ld60;

    .line 19
    .line 20
    invoke-direct {v0}, Ld60;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, v2, Lw3;->g:Ld60;

    .line 24
    .line 25
    sget-object v0, Ln2;->G:Ln2;

    .line 26
    .line 27
    iput-object v0, v2, Lw3;->j:Lfv0;

    .line 28
    .line 29
    new-instance v0, Lx8;

    .line 30
    .line 31
    invoke-direct {v0}, Lx8;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, v2, Lw3;->k:Lx8;

    .line 35
    .line 36
    new-instance v0, Lg3;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-direct {v0, v2, v10}, Lg3;-><init>(Lw3;I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, v2, Lw3;->l:Lg3;

    .line 43
    .line 44
    invoke-static {v8}, Lpf1;->b(Landroid/content/Context;)Lan;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v11, Ln2;->R:Ln2;

    .line 49
    .line 50
    new-instance v1, Lgp0;

    .line 51
    .line 52
    invoke-direct {v1, v0, v11}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, v2, Lw3;->m:Lgp0;

    .line 56
    .line 57
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v0, 0x23

    .line 60
    .line 61
    if-lt v12, v0, :cond_0

    .line 62
    .line 63
    move v13, v9

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v13, v10

    .line 66
    :goto_0
    iput-boolean v13, v2, Lw3;->o:Z

    .line 67
    .line 68
    new-instance v0, Ljs;

    .line 69
    .line 70
    invoke-direct {v0}, Loe0;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lzu;

    .line 74
    .line 75
    invoke-direct {v1, v2, v2}, Lzu;-><init>(Lw3;Lw3;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, v2, Lw3;->p:Lzu;

    .line 79
    .line 80
    move-object/from16 v1, p2

    .line 81
    .line 82
    iput-object v1, v2, Lw3;->q:Lpk;

    .line 83
    .line 84
    new-instance v1, Lf5;

    .line 85
    .line 86
    new-instance v3, Ln3;

    .line 87
    .line 88
    invoke-direct {v1}, Lf5;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, v2, Lw3;->r:Lf5;

    .line 92
    .line 93
    new-instance v1, Li90;

    .line 94
    .line 95
    invoke-direct {v1, v10}, Li90;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iput-object v1, v2, Lw3;->s:Li90;

    .line 99
    .line 100
    new-instance v1, Lx1;

    .line 101
    .line 102
    const/4 v14, 0x3

    .line 103
    invoke-direct {v1, v14}, Lx1;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object v1, v2, Lw3;->t:Lx1;

    .line 107
    .line 108
    new-instance v1, Lu6;

    .line 109
    .line 110
    invoke-static {v8}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-direct {v1, v3}, Lu6;-><init>(Landroid/view/ViewConfiguration;)V

    .line 115
    .line 116
    .line 117
    iput-object v1, v2, Lw3;->u:Lu6;

    .line 118
    .line 119
    new-instance v1, Ll20;

    .line 120
    .line 121
    invoke-direct {v1}, Ll20;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v1, v2, Lw3;->v:Ll20;

    .line 125
    .line 126
    new-instance v1, Lb60;

    .line 127
    .line 128
    invoke-direct {v1, v14}, Lb60;-><init>(I)V

    .line 129
    .line 130
    .line 131
    sget-object v3, Law0;->c:Law0;

    .line 132
    .line 133
    invoke-virtual {v1, v3}, Lb60;->e0(Lxd0;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lw3;->getDensity()Lym;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v1, v3}, Lb60;->b0(Lym;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lw3;->getViewConfiguration()Lnc1;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v1, v3}, Lb60;->g0(Lnc1;)V

    .line 148
    .line 149
    .line 150
    new-instance v3, Lv3;

    .line 151
    .line 152
    invoke-direct {v3, v2}, Lv3;-><init>(Lw3;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lw3;->getFocusOwner()Lwu;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lzu;

    .line 160
    .line 161
    iget-object v4, v4, Lzu;->e:Lxu;

    .line 162
    .line 163
    invoke-interface {v3, v4}, Lpe0;->c(Lpe0;)Lpe0;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v2}, Lw3;->getDragAndDropManager()Lf5;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    iget-object v4, v4, Lf5;->c:Le5;

    .line 172
    .line 173
    invoke-interface {v3, v4}, Lpe0;->c(Lpe0;)Lpe0;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v1, v3}, Lb60;->f0(Lpe0;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, v2, Lw3;->w:Lb60;

    .line 181
    .line 182
    sget-object v1, Lv20;->a:Lug0;

    .line 183
    .line 184
    new-instance v1, Lug0;

    .line 185
    .line 186
    invoke-direct {v1}, Lug0;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v1, v2, Lw3;->x:Lug0;

    .line 190
    .line 191
    new-instance v1, Lut0;

    .line 192
    .line 193
    invoke-virtual {v2}, Lw3;->getLayoutNodes()Lug0;

    .line 194
    .line 195
    .line 196
    invoke-direct {v1}, Lut0;-><init>()V

    .line 197
    .line 198
    .line 199
    iput-object v1, v2, Lw3;->y:Lut0;

    .line 200
    .line 201
    iput-object v2, v2, Lw3;->z:Lw3;

    .line 202
    .line 203
    new-instance v1, La01;

    .line 204
    .line 205
    invoke-virtual {v2}, Lw3;->getRoot()Lb60;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v2}, Lw3;->getLayoutNodes()Lug0;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-direct {v1, v3, v0, v4}, La01;-><init>(Lb60;Ljs;Lug0;)V

    .line 214
    .line 215
    .line 216
    iput-object v1, v2, Lw3;->A:La01;

    .line 217
    .line 218
    new-instance v15, Lc4;

    .line 219
    .line 220
    invoke-direct {v15, v2}, Lc4;-><init>(Lw3;)V

    .line 221
    .line 222
    .line 223
    iput-object v15, v2, Lw3;->B:Lc4;

    .line 224
    .line 225
    new-instance v0, Lv4;

    .line 226
    .line 227
    move-object v1, v0

    .line 228
    new-instance v0, Ll3;

    .line 229
    .line 230
    const/4 v6, 0x1

    .line 231
    const/4 v7, 0x0

    .line 232
    move-object v3, v1

    .line 233
    const/4 v1, 0x0

    .line 234
    move-object v4, v3

    .line 235
    const-class v3, Li4;

    .line 236
    .line 237
    move-object v5, v4

    .line 238
    const-string v4, "getContentCaptureSessionCompat"

    .line 239
    .line 240
    move-object/from16 v16, v5

    .line 241
    .line 242
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 243
    .line 244
    move-object/from16 v14, v16

    .line 245
    .line 246
    invoke-direct/range {v0 .. v7}, Ll3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 247
    .line 248
    .line 249
    invoke-direct {v14, v2, v0}, Lv4;-><init>(Lw3;Ll3;)V

    .line 250
    .line 251
    .line 252
    iput-object v14, v2, Lw3;->C:Lv4;

    .line 253
    .line 254
    new-instance v0, Lw2;

    .line 255
    .line 256
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    const-string v1, "accessibility"

    .line 260
    .line 261
    invoke-virtual {v8, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 269
    .line 270
    iput-object v0, v2, Lw3;->D:Lw2;

    .line 271
    .line 272
    new-instance v0, Ls5;

    .line 273
    .line 274
    invoke-direct {v0, v2}, Ls5;-><init>(Lw3;)V

    .line 275
    .line 276
    .line 277
    iput-object v0, v2, Lw3;->E:Ls5;

    .line 278
    .line 279
    new-instance v0, Ll9;

    .line 280
    .line 281
    invoke-direct {v0}, Ll9;-><init>()V

    .line 282
    .line 283
    .line 284
    iput-object v0, v2, Lw3;->F:Ll9;

    .line 285
    .line 286
    new-instance v0, Ldh0;

    .line 287
    .line 288
    invoke-direct {v0}, Ldh0;-><init>()V

    .line 289
    .line 290
    .line 291
    iput-object v0, v2, Lw3;->G:Ldh0;

    .line 292
    .line 293
    new-instance v0, Lag0;

    .line 294
    .line 295
    invoke-direct {v0}, Lag0;-><init>()V

    .line 296
    .line 297
    .line 298
    iput-object v0, v2, Lw3;->J:Lag0;

    .line 299
    .line 300
    new-instance v0, Lfe;

    .line 301
    .line 302
    invoke-virtual {v2}, Lw3;->getRoot()Lb60;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 307
    .line 308
    .line 309
    iput-object v1, v0, Lfe;->b:Ljava/lang/Object;

    .line 310
    .line 311
    new-instance v3, Lmy;

    .line 312
    .line 313
    iget-object v1, v1, Lb60;->I:Lmj0;

    .line 314
    .line 315
    iget-object v1, v1, Lmj0;->c:Lc20;

    .line 316
    .line 317
    invoke-direct {v3, v1}, Lmy;-><init>(Li50;)V

    .line 318
    .line 319
    .line 320
    iput-object v3, v0, Lfe;->c:Ljava/lang/Object;

    .line 321
    .line 322
    new-instance v1, Lx1;

    .line 323
    .line 324
    const/16 v3, 0x13

    .line 325
    .line 326
    invoke-direct {v1, v3}, Lx1;-><init>(I)V

    .line 327
    .line 328
    .line 329
    iput-object v1, v0, Lfe;->d:Ljava/lang/Object;

    .line 330
    .line 331
    new-instance v1, Lpy;

    .line 332
    .line 333
    invoke-direct {v1}, Lpy;-><init>()V

    .line 334
    .line 335
    .line 336
    iput-object v1, v0, Lfe;->e:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v0, v2, Lw3;->K:Lfe;

    .line 339
    .line 340
    new-instance v0, Landroid/content/res/Configuration;

    .line 341
    .line 342
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iput-object v0, v2, Lw3;->L:Lgp0;

    .line 358
    .line 359
    new-instance v0, Ly2;

    .line 360
    .line 361
    invoke-virtual {v2}, Lw3;->getAutofillTree()Ll9;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object v2, v0, Ly2;->d:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v1, v0, Ly2;->e:Ljava/lang/Object;

    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    const-class v3, Landroid/view/autofill/AutofillManager;

    .line 377
    .line 378
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, Landroid/view/autofill/AutofillManager;

    .line 383
    .line 384
    const-string v4, "Autofill service could not be located."

    .line 385
    .line 386
    const/4 v6, 0x0

    .line 387
    if-eqz v1, :cond_a

    .line 388
    .line 389
    iput-object v1, v0, Ly2;->f:Ljava/lang/Object;

    .line 390
    .line 391
    invoke-virtual {v2, v9}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    if-eqz v1, :cond_9

    .line 399
    .line 400
    iput-object v1, v0, Ly2;->g:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v0, v2, Lw3;->M:Ly2;

    .line 403
    .line 404
    invoke-virtual {v8, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 409
    .line 410
    if-eqz v0, :cond_8

    .line 411
    .line 412
    new-instance v1, La3;

    .line 413
    .line 414
    move-object v3, v1

    .line 415
    new-instance v1, Lx1;

    .line 416
    .line 417
    const/16 v4, 0x11

    .line 418
    .line 419
    invoke-direct {v1, v4, v0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {p0 .. p0}, Lw3;->getSemanticsOwner()La01;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-virtual/range {p0 .. p0}, Lw3;->getRectManager()Lut0;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    move-object v0, v3

    .line 435
    move-object/from16 v3, p0

    .line 436
    .line 437
    invoke-direct/range {v0 .. v5}, La3;-><init>(Lx1;La01;Lw3;Lut0;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    move-object v2, v3

    .line 441
    iput-object v0, v2, Lw3;->N:La3;

    .line 442
    .line 443
    new-instance v0, Le3;

    .line 444
    .line 445
    invoke-direct {v0, v8}, Le3;-><init>(Landroid/content/Context;)V

    .line 446
    .line 447
    .line 448
    iput-object v0, v2, Lw3;->P:Le3;

    .line 449
    .line 450
    new-instance v0, Ld3;

    .line 451
    .line 452
    invoke-virtual {v2}, Lw3;->getClipboardManager()Le3;

    .line 453
    .line 454
    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 456
    .line 457
    .line 458
    iput-object v0, v2, Lw3;->Q:Ld3;

    .line 459
    .line 460
    new-instance v0, Lfn0;

    .line 461
    .line 462
    new-instance v1, Lq3;

    .line 463
    .line 464
    invoke-direct {v1, v2, v9}, Lq3;-><init>(Lw3;I)V

    .line 465
    .line 466
    .line 467
    invoke-direct {v0, v1}, Lfn0;-><init>(Lq3;)V

    .line 468
    .line 469
    .line 470
    iput-object v0, v2, Lw3;->R:Lfn0;

    .line 471
    .line 472
    new-instance v0, Lud0;

    .line 473
    .line 474
    invoke-virtual {v2}, Lw3;->getRoot()Lb60;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-direct {v0, v1}, Lud0;-><init>(Lb60;)V

    .line 479
    .line 480
    .line 481
    iput-object v0, v2, Lw3;->V:Lud0;

    .line 482
    .line 483
    const-wide v0, 0x7fffffff7fffffffL

    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    iput-wide v0, v2, Lw3;->W:J

    .line 489
    .line 490
    filled-new-array {v10, v10}, [I

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iput-object v0, v2, Lw3;->a0:[I

    .line 495
    .line 496
    invoke-static {}, Lr60;->h()[F

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    iput-object v0, v2, Lw3;->b0:[F

    .line 501
    .line 502
    invoke-static {}, Lr60;->h()[F

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    iput-object v0, v2, Lw3;->c0:[F

    .line 507
    .line 508
    const-wide/16 v0, -0x1

    .line 509
    .line 510
    iput-wide v0, v2, Lw3;->d0:J

    .line 511
    .line 512
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    iput-wide v0, v2, Lw3;->f0:J

    .line 518
    .line 519
    invoke-static {v6}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    iput-object v0, v2, Lw3;->g0:Lgp0;

    .line 524
    .line 525
    new-instance v0, Lt3;

    .line 526
    .line 527
    invoke-direct {v0, v2, v9}, Lt3;-><init>(Lw3;I)V

    .line 528
    .line 529
    .line 530
    invoke-static {v0}, Lr60;->m(Lhw;)Ldn;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    iput-object v0, v2, Lw3;->h0:Ldn;

    .line 535
    .line 536
    new-instance v0, Le20;

    .line 537
    .line 538
    invoke-virtual {v2}, Lw3;->getView()Landroid/view/View;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-direct {v0, v1, v2}, Le20;-><init>(Landroid/view/View;Lw3;)V

    .line 543
    .line 544
    .line 545
    iput-object v0, v2, Lw3;->j0:Le20;

    .line 546
    .line 547
    new-instance v0, La71;

    .line 548
    .line 549
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 550
    .line 551
    .line 552
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 553
    .line 554
    invoke-direct {v1, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    iput-object v0, v2, Lw3;->k0:La71;

    .line 558
    .line 559
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 560
    .line 561
    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    iput-object v0, v2, Lw3;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 565
    .line 566
    new-instance v0, Lr3;

    .line 567
    .line 568
    invoke-virtual {v2}, Lw3;->getTextInputService()La71;

    .line 569
    .line 570
    .line 571
    const/16 v1, 0xf

    .line 572
    .line 573
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 574
    .line 575
    .line 576
    iput-object v0, v2, Lw3;->m0:Lr3;

    .line 577
    .line 578
    new-instance v0, Lr3;

    .line 579
    .line 580
    const/4 v1, 0x2

    .line 581
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 582
    .line 583
    .line 584
    iput-object v0, v2, Lw3;->n0:Lr3;

    .line 585
    .line 586
    invoke-static {v8}, Lkl;->j(Landroid/content/Context;)Lkv;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    new-instance v3, Lgp0;

    .line 591
    .line 592
    invoke-direct {v3, v0, v11}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 593
    .line 594
    .line 595
    iput-object v3, v2, Lw3;->o0:Lgp0;

    .line 596
    .line 597
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    sget-object v3, Ltu;->a:[I

    .line 610
    .line 611
    sget-object v3, Lk50;->d:Lk50;

    .line 612
    .line 613
    if-eqz v0, :cond_2

    .line 614
    .line 615
    if-eq v0, v9, :cond_1

    .line 616
    .line 617
    move-object v0, v6

    .line 618
    goto :goto_1

    .line 619
    :cond_1
    sget-object v0, Lk50;->e:Lk50;

    .line 620
    .line 621
    goto :goto_1

    .line 622
    :cond_2
    move-object v0, v3

    .line 623
    :goto_1
    if-nez v0, :cond_3

    .line 624
    .line 625
    goto :goto_2

    .line 626
    :cond_3
    move-object v3, v0

    .line 627
    :goto_2
    invoke-static {v3}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    iput-object v0, v2, Lw3;->p0:Lgp0;

    .line 632
    .line 633
    new-instance v0, Lyl;

    .line 634
    .line 635
    invoke-direct {v0, v2, v9}, Lyl;-><init>(Landroid/view/View;I)V

    .line 636
    .line 637
    .line 638
    iput-object v0, v2, Lw3;->q0:Lyl;

    .line 639
    .line 640
    new-instance v0, Lh20;

    .line 641
    .line 642
    invoke-virtual {v2}, Landroid/view/View;->isInTouchMode()Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-eqz v3, :cond_4

    .line 647
    .line 648
    move v1, v9

    .line 649
    :cond_4
    invoke-direct {v0, v1}, Lh20;-><init>(I)V

    .line 650
    .line 651
    .line 652
    iput-object v0, v2, Lw3;->r0:Lh20;

    .line 653
    .line 654
    new-instance v0, Lqe0;

    .line 655
    .line 656
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 657
    .line 658
    .line 659
    new-instance v1, Lsh0;

    .line 660
    .line 661
    const/16 v3, 0x10

    .line 662
    .line 663
    new-array v4, v3, [Lu9;

    .line 664
    .line 665
    invoke-direct {v1, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    new-instance v1, Lsh0;

    .line 669
    .line 670
    new-array v4, v3, [Lu50;

    .line 671
    .line 672
    invoke-direct {v1, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    new-instance v1, Lsh0;

    .line 676
    .line 677
    new-array v4, v3, [Lb60;

    .line 678
    .line 679
    invoke-direct {v1, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    new-instance v1, Lsh0;

    .line 683
    .line 684
    new-array v3, v3, [Lu50;

    .line 685
    .line 686
    invoke-direct {v1, v3}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    iput-object v0, v2, Lw3;->s0:Lqe0;

    .line 690
    .line 691
    new-instance v0, Lr3;

    .line 692
    .line 693
    const/4 v1, 0x3

    .line 694
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 695
    .line 696
    .line 697
    iput-object v0, v2, Lw3;->t0:Lr3;

    .line 698
    .line 699
    new-instance v0, Ld;

    .line 700
    .line 701
    const/16 v1, 0x16

    .line 702
    .line 703
    invoke-direct {v0, v1}, Ld;-><init>(I)V

    .line 704
    .line 705
    .line 706
    iput-object v0, v2, Lw3;->w0:Ld;

    .line 707
    .line 708
    new-instance v0, Ldh0;

    .line 709
    .line 710
    invoke-direct {v0}, Ldh0;-><init>()V

    .line 711
    .line 712
    .line 713
    iput-object v0, v2, Lw3;->x0:Ldh0;

    .line 714
    .line 715
    new-instance v0, Lu3;

    .line 716
    .line 717
    invoke-direct {v0, v2}, Lu3;-><init>(Lw3;)V

    .line 718
    .line 719
    .line 720
    iput-object v0, v2, Lw3;->A0:Lu3;

    .line 721
    .line 722
    new-instance v0, Lg3;

    .line 723
    .line 724
    invoke-direct {v0, v2, v9}, Lg3;-><init>(Lw3;I)V

    .line 725
    .line 726
    .line 727
    iput-object v0, v2, Lw3;->B0:Lg3;

    .line 728
    .line 729
    new-instance v0, Ls10;

    .line 730
    .line 731
    new-instance v1, Lq3;

    .line 732
    .line 733
    invoke-direct {v1, v2, v10}, Lq3;-><init>(Lw3;I)V

    .line 734
    .line 735
    .line 736
    invoke-direct {v0, v8, v1}, Ls10;-><init>(Landroid/content/Context;Lq3;)V

    .line 737
    .line 738
    .line 739
    iput-object v0, v2, Lw3;->D0:Ls10;

    .line 740
    .line 741
    new-instance v0, Lt3;

    .line 742
    .line 743
    invoke-direct {v0, v2, v10}, Lt3;-><init>(Lw3;I)V

    .line 744
    .line 745
    .line 746
    iput-object v0, v2, Lw3;->E0:Lt3;

    .line 747
    .line 748
    new-instance v0, Loc;

    .line 749
    .line 750
    invoke-direct {v0}, Loc;-><init>()V

    .line 751
    .line 752
    .line 753
    iput-object v0, v2, Lw3;->F0:Loc;

    .line 754
    .line 755
    iget-object v0, v2, Lw3;->C:Lv4;

    .line 756
    .line 757
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 764
    .line 765
    .line 766
    sget-object v0, Lh4;->a:Lh4;

    .line 767
    .line 768
    invoke-virtual {v0, v2, v9, v10}, Lh4;->a(Landroid/view/View;IZ)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 775
    .line 776
    .line 777
    sget v0, Lkc1;->a:I

    .line 778
    .line 779
    invoke-virtual {v2}, Landroid/view/View;->getImportantForAccessibility()I

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    if-nez v0, :cond_5

    .line 784
    .line 785
    invoke-virtual {v2, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 786
    .line 787
    .line 788
    :cond_5
    iget-object v0, v15, Lr0;->e:Lq0;

    .line 789
    .line 790
    invoke-virtual {v2, v0}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2}, Lw3;->getDragAndDropManager()Lf5;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2}, Lw3;->getRoot()Lb60;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-virtual {v0, v2}, Lb60;->d(Ldn0;)V

    .line 805
    .line 806
    .line 807
    sget-object v0, Ld4;->a:Ld4;

    .line 808
    .line 809
    invoke-virtual {v0, v2}, Ld4;->a(Landroid/view/View;)V

    .line 810
    .line 811
    .line 812
    if-eqz v13, :cond_6

    .line 813
    .line 814
    new-instance v0, Landroid/view/View;

    .line 815
    .line 816
    invoke-direct {v0, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 817
    .line 818
    .line 819
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 820
    .line 821
    invoke-direct {v1, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 825
    .line 826
    .line 827
    const v1, 0x7f06003d

    .line 828
    .line 829
    .line 830
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 831
    .line 832
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    iput-object v0, v2, Lw3;->n:Landroid/view/View;

    .line 836
    .line 837
    const/4 v1, -0x1

    .line 838
    invoke-virtual {v2, v0, v1}, Lw3;->addView(Landroid/view/View;I)V

    .line 839
    .line 840
    .line 841
    :cond_6
    const/16 v0, 0x1f

    .line 842
    .line 843
    if-lt v12, v0, :cond_7

    .line 844
    .line 845
    new-instance v6, Li90;

    .line 846
    .line 847
    invoke-direct {v6, v9}, Li90;-><init>(I)V

    .line 848
    .line 849
    .line 850
    :cond_7
    iput-object v6, v2, Lw3;->H0:Li90;

    .line 851
    .line 852
    new-instance v0, Lr3;

    .line 853
    .line 854
    invoke-direct {v0, v2}, Lr3;-><init>(Lw3;)V

    .line 855
    .line 856
    .line 857
    iput-object v0, v2, Lw3;->J0:Lr3;

    .line 858
    .line 859
    return-void

    .line 860
    :cond_8
    invoke-static {v4}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    throw v0

    .line 865
    :cond_9
    const-string v0, "Required value was null."

    .line 866
    .line 867
    invoke-static {v0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    throw v0

    .line 872
    :cond_a
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    throw v6
.end method

.method public static final synthetic f(Lw3;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(Lw3;Landroid/view/KeyEvent;)Z
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

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Lbn;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui$annotations()V
    .locals 0

    .line 1
    return-void
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
    .annotation runtime Lbn;
    .end annotation

    .line 1
    return-void
.end method

.method private final get_viewTreeOwners()Lk3;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->g0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lk3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final synthetic h(Lw3;)Lk3;
    .locals 0

    .line 1
    invoke-direct {p0}, Lw3;->get_viewTreeOwners()Lk3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static i(Landroid/view/ViewGroup;)V
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
    instance-of v3, v2, Lw3;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Lw3;

    .line 17
    .line 18
    invoke-virtual {v2}, Lw3;->u()V

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
    invoke-static {v2}, Lw3;->i(Landroid/view/ViewGroup;)V

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

.method public static j(I)J
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
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/high16 v1, 0x40000000    # 2.0f

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    int-to-long v0, p0

    .line 20
    const/16 p0, 0x20

    .line 21
    .line 22
    shl-long v2, v0, p0

    .line 23
    .line 24
    or-long/2addr v0, v2

    .line 25
    return-wide v0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    const-wide/32 v0, 0x7fffffff

    .line 33
    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    int-to-long v0, p0

    .line 37
    return-wide v0
.end method

.method public static m(Lb60;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb60;->D()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, Lsh0;->f:I

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
    check-cast v2, Lb60;

    .line 18
    .line 19
    invoke-static {v2}, Lw3;->m(Lb60;)V

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

.method public static o(Landroid/view/MotionEvent;)Z
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
    sget-object v0, Lbg0;->a:Lbg0;

    .line 87
    .line 88
    invoke-virtual {v0, p0, v6}, Lbg0;->a(Landroid/view/MotionEvent;I)Z

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

.method private setDensity(Lym;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->m:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setFontFamilyResolver(Ljv;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->o0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(Lk50;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->p0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_viewTreeOwners(Lk3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->g0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lw3;->d0:J

    .line 6
    .line 7
    iget-object v0, p0, Lw3;->F0:Loc;

    .line 8
    .line 9
    iget-object v1, p0, Lw3;->b0:[F

    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Loc;->a(Landroid/view/View;[F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw3;->c0:[F

    .line 15
    .line 16
    invoke-static {v1, v0}, Ls91;->B([F[F)Z

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
    invoke-static {v1, v2, v3}, Lr60;->s([FJ)J

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
    iput-wide v0, p0, Lw3;->f0:J

    .line 92
    .line 93
    return-void
.end method

.method public final B()Z
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

.method public final C(Lb60;)V
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
    invoke-virtual {p1}, Lb60;->s()Lz50;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lz50;->d:Lz50;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Lw3;->U:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lb60;->I:Lmj0;

    .line 36
    .line 37
    iget-object v0, v0, Lmj0;->c:Lc20;

    .line 38
    .line 39
    iget-wide v0, v0, Lxq0;->g:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Lpj;->f(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {v0, v1}, Lpj;->e(J)Z

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
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

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

.method public final D(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw3;->z()V

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
    iget-wide v2, p0, Lw3;->f0:J

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
    iget-wide v4, p0, Lw3;->f0:J

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
    iget-object p0, p0, Lw3;->c0:[F

    .line 57
    .line 58
    invoke-static {p0, p1, p2}, Lr60;->s([FJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0
.end method

.method public final E(Landroid/view/MotionEvent;)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Lw3;->G0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lw3;->G0:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v2, p0, Lw3;->s:Li90;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Led1;->a:Lgp0;

    .line 18
    .line 19
    new-instance v3, Lsr0;

    .line 20
    .line 21
    invoke-direct {v3, v0}, Lsr0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lw3;->J:Lag0;

    .line 28
    .line 29
    invoke-virtual {v0, p0, p1}, Lag0;->c(Lw3;Landroid/view/MotionEvent;)Ld;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lw3;->K:Lfe;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v2, :cond_9

    .line 41
    .line 42
    iget-object v1, v2, Ld;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    add-int/lit8 v6, v6, -0x1

    .line 51
    .line 52
    const/4 v7, 0x5

    .line 53
    if-ltz v6, :cond_3

    .line 54
    .line 55
    :goto_0
    add-int/lit8 v8, v6, -0x1

    .line 56
    .line 57
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    move-object v9, v6

    .line 62
    check-cast v9, Lpr0;

    .line 63
    .line 64
    iget-boolean v9, v9, Lpr0;->e:Z

    .line 65
    .line 66
    if-eqz v9, :cond_1

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    if-eq v3, v7, :cond_4

    .line 71
    .line 72
    :cond_1
    if-gez v8, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v6, v8

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    :goto_1
    move-object v6, v5

    .line 78
    :cond_4
    check-cast v6, Lpr0;

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    iget-wide v8, v6, Lpr0;->d:J

    .line 83
    .line 84
    iput-wide v8, p0, Lw3;->d:J

    .line 85
    .line 86
    :cond_5
    invoke-virtual {p0, p1}, Lw3;->p(Landroid/view/MotionEvent;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v4, v2, p0, v1}, Lfe;->a(Ld;Lw3;Z)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    iput-object v5, v2, Ld;->f:Ljava/lang/Object;

    .line 95
    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    if-ne v3, v7, :cond_7

    .line 99
    .line 100
    :cond_6
    and-int/lit8 v1, p0, 0x1

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    :cond_7
    return p0

    .line 105
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iget-object v1, v0, Lag0;->c:Landroid/util/SparseBooleanArray;

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, Lag0;->b:Landroid/util/SparseLongArray;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 121
    .line 122
    .line 123
    return p0

    .line 124
    :cond_9
    iget-boolean p0, v4, Lfe;->a:Z

    .line 125
    .line 126
    if-nez p0, :cond_b

    .line 127
    .line 128
    iget-object p0, v4, Lfe;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Lx1;

    .line 131
    .line 132
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, Lub0;

    .line 135
    .line 136
    iget p1, p0, Lub0;->g:I

    .line 137
    .line 138
    iget-object v0, p0, Lub0;->f:[Ljava/lang/Object;

    .line 139
    .line 140
    move v2, v1

    .line 141
    :goto_2
    if-ge v2, p1, :cond_a

    .line 142
    .line 143
    aput-object v5, v0, v2

    .line 144
    .line 145
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_a
    iput v1, p0, Lub0;->g:I

    .line 149
    .line 150
    iput-boolean v1, p0, Lub0;->d:Z

    .line 151
    .line 152
    iget-object p0, v4, Lfe;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Lmy;

    .line 155
    .line 156
    invoke-virtual {p0}, Lmy;->c()V

    .line 157
    .line 158
    .line 159
    :cond_b
    return v1
.end method

.method public final F(Landroid/view/MotionEvent;IJZ)V
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
    invoke-virtual {v0, v4, v5}, Lw3;->r(J)J

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
    iget-object v2, v0, Lw3;->J:Lag0;

    .line 215
    .line 216
    invoke-virtual {v2, v0, v1}, Lag0;->c(Lw3;Landroid/view/MotionEvent;)Ld;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v3, v0, Lw3;->K:Lfe;

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    invoke-virtual {v3, v2, v0, v4}, Lfe;->a(Ld;Lw3;Z)I

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final G(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw3;->getConfiguration()Landroid/content/res/Configuration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_5

    .line 10
    .line 11
    new-instance v1, Landroid/content/res/Configuration;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lw3;->setConfiguration(Landroid/content/res/Configuration;)V

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
    invoke-static {v1}, Lpf1;->b(Landroid/content/Context;)Lan;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Lw3;->setDensity(Lym;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const v2, -0x5000e280

    .line 49
    .line 50
    .line 51
    and-int/2addr v1, v2

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lw3;->s:Li90;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/16 v3, 0x1f

    .line 63
    .line 64
    if-lt v1, v3, :cond_3

    .line 65
    .line 66
    invoke-static {v0}, Lf3;->a(Landroid/content/res/Configuration;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    move v0, v2

    .line 72
    :goto_0
    if-lt v1, v3, :cond_4

    .line 73
    .line 74
    invoke-static {p1}, Lf3;->a(Landroid/content/res/Configuration;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    :cond_4
    if-eq v0, v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lkl;->j(Landroid/content/Context;)Lkv;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Lw3;->setFontFamilyResolver(Ljv;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public final H()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lw3;->a0:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Lw3;->W:J

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
    iget-wide v10, v0, Lw3;->d0:J

    .line 33
    .line 34
    const-wide/16 v12, 0x0

    .line 35
    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-gez v10, :cond_1

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
    and-long/2addr v12, v6

    .line 46
    or-long/2addr v10, v12

    .line 47
    iput-wide v10, v0, Lw3;->W:J

    .line 48
    .line 49
    const v1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v5, v1, :cond_1

    .line 53
    .line 54
    if-eq v2, v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Lw3;->getRoot()Lb60;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v1, v1, Lb60;->J:Lf60;

    .line 61
    .line 62
    iget-object v1, v1, Lf60;->p:Lwd0;

    .line 63
    .line 64
    invoke-virtual {v1}, Lwd0;->e0()V

    .line 65
    .line 66
    .line 67
    move v1, v9

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move v1, v3

    .line 70
    :goto_0
    invoke-virtual {v0}, Lw3;->z()V

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lw3;->I0:Landroid/view/View;

    .line 74
    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, v0, Lw3;->I0:Landroid/view/View;

    .line 82
    .line 83
    :cond_2
    invoke-virtual {v0}, Lw3;->getRectManager()Lut0;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    iget-wide v10, v0, Lw3;->W:J

    .line 88
    .line 89
    iget-wide v12, v0, Lw3;->f0:J

    .line 90
    .line 91
    invoke-static {v12, v13}, Li4;->D(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v14, v0, Lw3;->b0:[F

    .line 107
    .line 108
    array-length v15, v14

    .line 109
    move/from16 v16, v3

    .line 110
    .line 111
    const/16 v3, 0x10

    .line 112
    .line 113
    const/16 v17, 0x2

    .line 114
    .line 115
    if-ge v15, v3, :cond_3

    .line 116
    .line 117
    move/from16 v3, v16

    .line 118
    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :cond_3
    aget v3, v14, v16

    .line 122
    .line 123
    const/high16 v15, 0x3f800000    # 1.0f

    .line 124
    .line 125
    cmpg-float v3, v3, v15

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    if-nez v3, :cond_4

    .line 130
    .line 131
    aget v3, v14, v9

    .line 132
    .line 133
    cmpg-float v3, v3, v18

    .line 134
    .line 135
    if-nez v3, :cond_4

    .line 136
    .line 137
    aget v3, v14, v17

    .line 138
    .line 139
    cmpg-float v3, v3, v18

    .line 140
    .line 141
    if-nez v3, :cond_4

    .line 142
    .line 143
    const/4 v3, 0x4

    .line 144
    aget v3, v14, v3

    .line 145
    .line 146
    cmpg-float v3, v3, v18

    .line 147
    .line 148
    if-nez v3, :cond_4

    .line 149
    .line 150
    const/4 v3, 0x5

    .line 151
    aget v3, v14, v3

    .line 152
    .line 153
    cmpg-float v3, v3, v15

    .line 154
    .line 155
    if-nez v3, :cond_4

    .line 156
    .line 157
    const/4 v3, 0x6

    .line 158
    aget v3, v14, v3

    .line 159
    .line 160
    cmpg-float v3, v3, v18

    .line 161
    .line 162
    if-nez v3, :cond_4

    .line 163
    .line 164
    const/16 v3, 0x8

    .line 165
    .line 166
    aget v3, v14, v3

    .line 167
    .line 168
    cmpg-float v3, v3, v18

    .line 169
    .line 170
    if-nez v3, :cond_4

    .line 171
    .line 172
    const/16 v3, 0x9

    .line 173
    .line 174
    aget v3, v14, v3

    .line 175
    .line 176
    cmpg-float v3, v3, v18

    .line 177
    .line 178
    if-nez v3, :cond_4

    .line 179
    .line 180
    const/16 v3, 0xa

    .line 181
    .line 182
    aget v3, v14, v3

    .line 183
    .line 184
    cmpg-float v3, v3, v15

    .line 185
    .line 186
    if-nez v3, :cond_4

    .line 187
    .line 188
    move v3, v9

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    move/from16 v3, v16

    .line 191
    .line 192
    :goto_1
    const/16 v19, 0xc

    .line 193
    .line 194
    aget v19, v14, v19

    .line 195
    .line 196
    cmpg-float v19, v19, v18

    .line 197
    .line 198
    if-nez v19, :cond_5

    .line 199
    .line 200
    const/16 v19, 0xd

    .line 201
    .line 202
    aget v19, v14, v19

    .line 203
    .line 204
    cmpg-float v19, v19, v18

    .line 205
    .line 206
    if-nez v19, :cond_5

    .line 207
    .line 208
    const/16 v19, 0xe

    .line 209
    .line 210
    aget v19, v14, v19

    .line 211
    .line 212
    cmpg-float v18, v19, v18

    .line 213
    .line 214
    if-nez v18, :cond_5

    .line 215
    .line 216
    const/16 v18, 0xf

    .line 217
    .line 218
    aget v18, v14, v18

    .line 219
    .line 220
    cmpg-float v15, v18, v15

    .line 221
    .line 222
    if-nez v15, :cond_5

    .line 223
    .line 224
    move v15, v9

    .line 225
    goto :goto_2

    .line 226
    :cond_5
    move/from16 v15, v16

    .line 227
    .line 228
    :goto_2
    shl-int/2addr v3, v9

    .line 229
    or-int/2addr v3, v15

    .line 230
    :goto_3
    iget-object v15, v5, Lut0;->b:Le81;

    .line 231
    .line 232
    and-int/lit8 v3, v3, 0x2

    .line 233
    .line 234
    if-nez v3, :cond_6

    .line 235
    .line 236
    :goto_4
    move-wide/from16 v17, v6

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_6
    const/4 v14, 0x0

    .line 240
    goto :goto_4

    .line 241
    :goto_5
    iget-wide v6, v15, Le81;->d:J

    .line 242
    .line 243
    invoke-static {v12, v13, v6, v7}, Lw20;->a(JJ)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-nez v3, :cond_7

    .line 248
    .line 249
    iput-wide v12, v15, Le81;->d:J

    .line 250
    .line 251
    move v3, v9

    .line 252
    goto :goto_6

    .line 253
    :cond_7
    move/from16 v3, v16

    .line 254
    .line 255
    :goto_6
    iget-wide v6, v15, Le81;->e:J

    .line 256
    .line 257
    invoke-static {v10, v11, v6, v7}, Lw20;->a(JJ)Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-nez v6, :cond_8

    .line 262
    .line 263
    iput-wide v10, v15, Le81;->e:J

    .line 264
    .line 265
    move v3, v9

    .line 266
    :cond_8
    if-eqz v14, :cond_9

    .line 267
    .line 268
    iput-object v14, v15, Le81;->g:[F

    .line 269
    .line 270
    move v3, v9

    .line 271
    :cond_9
    int-to-long v6, v8

    .line 272
    shl-long/2addr v6, v4

    .line 273
    int-to-long v10, v2

    .line 274
    and-long v10, v10, v17

    .line 275
    .line 276
    or-long/2addr v6, v10

    .line 277
    iget-wide v10, v15, Le81;->f:J

    .line 278
    .line 279
    cmp-long v2, v6, v10

    .line 280
    .line 281
    if-eqz v2, :cond_a

    .line 282
    .line 283
    iput-wide v6, v15, Le81;->f:J

    .line 284
    .line 285
    move v3, v9

    .line 286
    :cond_a
    if-nez v3, :cond_c

    .line 287
    .line 288
    iget-boolean v2, v5, Lut0;->e:Z

    .line 289
    .line 290
    if-eqz v2, :cond_b

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_b
    move/from16 v3, v16

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_c
    :goto_7
    move v3, v9

    .line 297
    :goto_8
    iput-boolean v3, v5, Lut0;->e:Z

    .line 298
    .line 299
    iget-object v2, v0, Lw3;->V:Lud0;

    .line 300
    .line 301
    invoke-virtual {v2, v1}, Lud0;->a(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lw3;->getRectManager()Lut0;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Lut0;->a()V

    .line 309
    .line 310
    .line 311
    return-void
.end method

.method public final I(F)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lw3;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    cmpl-float v1, p1, v0

    .line 7
    .line 8
    if-lez v1, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lw3;->y0:F

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lw3;->y0:F

    .line 19
    .line 20
    cmpl-float v0, p1, v0

    .line 21
    .line 22
    if-lez v0, :cond_3

    .line 23
    .line 24
    :cond_0
    iput p1, p0, Lw3;->y0:F

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    cmpg-float v0, p1, v0

    .line 28
    .line 29
    if-gez v0, :cond_3

    .line 30
    .line 31
    iget v0, p0, Lw3;->z0:F

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    iget v0, p0, Lw3;->z0:F

    .line 40
    .line 41
    cmpg-float v0, p1, v0

    .line 42
    .line 43
    if-gez v0, :cond_3

    .line 44
    .line 45
    :cond_2
    iput p1, p0, Lw3;->z0:F

    .line 46
    .line 47
    :cond_3
    return-void
.end method

.method public final a(Lx90;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lw3;->i:Lba0;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    iget-object p1, p0, Lba0;->a:Lx1;

    .line 6
    .line 7
    iget-object p1, p1, Lx1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lbd0;

    .line 10
    .line 11
    iget-boolean v0, p1, Lbd0;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p1, Lbd0;->f:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lba0;->d:Lyc;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lyc;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lba0;->d:Lyc;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean p0, p1, Lbd0;->e:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-boolean p0, p1, Lbd0;->f:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    const-string p0, "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"

    .line 40
    .line 41
    invoke-static {p0}, Lxr0;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p0, p1, Lbd0;->g:Ljh0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljh0;->i()Z

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
    invoke-static {p0}, Lxr0;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p0, 0x0

    .line 58
    iput-boolean p0, p1, Lbd0;->f:Z

    .line 59
    .line 60
    :cond_5
    :goto_0
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzu;

    .line 6
    .line 7
    iget-object v0, v0, Lzu;->c:Ldv;

    .line 8
    .line 9
    iget-boolean v1, v0, Loe0;->q:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 16
    .line 17
    iget-boolean v1, v1, Loe0;->q:Z

    .line 18
    .line 19
    const-string v2, "visitSubtreeIf called on an unattached node"

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    new-instance v1, Lsh0;

    .line 27
    .line 28
    const/16 v3, 0x10

    .line 29
    .line 30
    new-array v4, v3, [Loe0;

    .line 31
    .line 32
    invoke-direct {v1, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 36
    .line 37
    iget-object v4, v0, Loe0;->i:Loe0;

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-static {v1, v0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v1, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget v0, v1, Lsh0;->f:I

    .line 49
    .line 50
    if-eqz v0, :cond_1a

    .line 51
    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lsh0;->k(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Loe0;

    .line 59
    .line 60
    iget v4, v0, Loe0;->g:I

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
    iget-boolean v5, v4, Loe0;->q:Z

    .line 70
    .line 71
    if-eqz v5, :cond_19

    .line 72
    .line 73
    iget v5, v4, Loe0;->f:I

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
    instance-of v8, v6, Ldv;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    const/4 v10, 0x0

    .line 88
    if-eqz v8, :cond_11

    .line 89
    .line 90
    check-cast v6, Ldv;

    .line 91
    .line 92
    iget-boolean v8, v6, Loe0;->q:Z

    .line 93
    .line 94
    if-eqz v8, :cond_17

    .line 95
    .line 96
    invoke-virtual {v6}, Ldv;->y0()Lav;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    iget-boolean v6, v6, Lav;->a:Z

    .line 101
    .line 102
    if-eqz v6, :cond_17

    .line 103
    .line 104
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Lzu;

    .line 112
    .line 113
    iget-object p2, p2, Lzu;->c:Ldv;

    .line 114
    .line 115
    iget-boolean p3, p2, Loe0;->q:Z

    .line 116
    .line 117
    if-nez p3, :cond_3

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_3
    iget-object p3, p2, Loe0;->d:Loe0;

    .line 122
    .line 123
    iget-boolean p3, p3, Loe0;->q:Z

    .line 124
    .line 125
    if-nez p3, :cond_4

    .line 126
    .line 127
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    new-instance p3, Lsh0;

    .line 131
    .line 132
    new-array v0, v3, [Loe0;

    .line 133
    .line 134
    invoke-direct {p3, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p2, p2, Loe0;->d:Loe0;

    .line 138
    .line 139
    iget-object v0, p2, Loe0;->i:Loe0;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {p3, p2}, Lpf1;->e(Lsh0;Loe0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-virtual {p3, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_3
    iget p2, p3, Lsh0;->f:I

    .line 151
    .line 152
    if-eqz p2, :cond_10

    .line 153
    .line 154
    add-int/lit8 p2, p2, -0x1

    .line 155
    .line 156
    invoke-virtual {p3, p2}, Lsh0;->k(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Loe0;

    .line 161
    .line 162
    iget v0, p2, Loe0;->g:I

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
    iget-boolean v1, v0, Loe0;->q:Z

    .line 172
    .line 173
    if-eqz v1, :cond_f

    .line 174
    .line 175
    iget v1, v0, Loe0;->f:I

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
    instance-of v4, v1, Ldv;

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    check-cast v1, Ldv;

    .line 190
    .line 191
    iget-boolean v4, v1, Loe0;->q:Z

    .line 192
    .line 193
    if-nez v4, :cond_6

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_6
    invoke-virtual {v1}, Ldv;->y0()Lav;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iget-boolean v1, v1, Loe0;->q:Z

    .line 201
    .line 202
    if-eqz v1, :cond_d

    .line 203
    .line 204
    iget-boolean v1, v4, Lav;->a:Z

    .line 205
    .line 206
    if-eqz v1, :cond_d

    .line 207
    .line 208
    goto/16 :goto_c

    .line 209
    .line 210
    :cond_7
    iget v4, v1, Loe0;->f:I

    .line 211
    .line 212
    and-int/lit16 v4, v4, 0x400

    .line 213
    .line 214
    if-eqz v4, :cond_d

    .line 215
    .line 216
    instance-of v4, v1, Lsm;

    .line 217
    .line 218
    if-eqz v4, :cond_d

    .line 219
    .line 220
    move-object v4, v1

    .line 221
    check-cast v4, Lsm;

    .line 222
    .line 223
    iget-object v4, v4, Lsm;->s:Loe0;

    .line 224
    .line 225
    move v6, v10

    .line 226
    :goto_6
    if-eqz v4, :cond_c

    .line 227
    .line 228
    iget v7, v4, Loe0;->f:I

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
    new-instance v2, Lsh0;

    .line 243
    .line 244
    new-array v7, v3, [Loe0;

    .line 245
    .line 246
    invoke-direct {v2, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_9
    if-eqz v1, :cond_a

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object v1, v5

    .line 255
    :cond_a
    invoke-virtual {v2, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_b
    :goto_7
    iget-object v4, v4, Loe0;->i:Loe0;

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
    invoke-static {v2}, Lpf1;->f(Lsh0;)Loe0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    goto :goto_5

    .line 269
    :cond_e
    iget-object v0, v0, Loe0;->i:Loe0;

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_f
    invoke-static {p3, p2}, Lpf1;->e(Lsh0;Loe0;)V

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
    iget v8, v6, Loe0;->f:I

    .line 283
    .line 284
    and-int/lit16 v8, v8, 0x400

    .line 285
    .line 286
    if-eqz v8, :cond_17

    .line 287
    .line 288
    instance-of v8, v6, Lsm;

    .line 289
    .line 290
    if-eqz v8, :cond_17

    .line 291
    .line 292
    move-object v8, v6

    .line 293
    check-cast v8, Lsm;

    .line 294
    .line 295
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 296
    .line 297
    :goto_a
    if-eqz v8, :cond_16

    .line 298
    .line 299
    iget v11, v8, Loe0;->f:I

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
    new-instance v7, Lsh0;

    .line 314
    .line 315
    new-array v11, v3, [Loe0;

    .line 316
    .line 317
    invoke-direct {v7, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_13
    if-eqz v6, :cond_14

    .line 321
    .line 322
    invoke-virtual {v7, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object v6, v5

    .line 326
    :cond_14
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_15
    :goto_b
    iget-object v8, v8, Loe0;->i:Loe0;

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
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    goto/16 :goto_2

    .line 341
    .line 342
    :cond_18
    iget-object v4, v4, Loe0;->i:Loe0;

    .line 343
    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :cond_19
    invoke-static {v1, v0}, Lpf1;->e(Lsh0;Loe0;)V

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
    invoke-virtual {p0, p1, v0}, Lw3;->addView(Landroid/view/View;I)V

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
    iget-object v1, p0, Lw3;->N:La3;

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
    iget-object v6, v1, La3;->e:La01;

    .line 24
    .line 25
    iget-object v6, v6, La01;->c:Lu20;

    .line 26
    .line 27
    invoke-virtual {v6, v4}, Lu20;->b(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lb60;

    .line 32
    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4}, Lb60;->x()Lsz0;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    iget-object v4, v4, Lsz0;->d:Ljh0;

    .line 42
    .line 43
    sget-object v6, Lrz0;->g:Le01;

    .line 44
    .line 45
    invoke-virtual {v4, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v6, Lo0;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    iget-object v6, v6, Lo0;->b:Lex;

    .line 58
    .line 59
    check-cast v6, Lsw;

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    new-instance v8, Lf8;

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
    invoke-direct {v8, v9}, Lf8;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v6, v8}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_1
    sget-object v6, Lrz0;->h:Le01;

    .line 83
    .line 84
    invoke-virtual {v4, v6}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v7, Lo0;

    .line 93
    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    iget-object v4, v7, Lo0;->b:Lex;

    .line 97
    .line 98
    check-cast v4, Lsw;

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    new-instance v6, Lm5;

    .line 103
    .line 104
    invoke-direct {v6, v5}, Lm5;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v4, v6}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p0, p0, Lw3;->M:Ly2;

    .line 117
    .line 118
    if-eqz p0, :cond_b

    .line 119
    .line 120
    iget-object p0, p0, Ly2;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, Ll9;

    .line 123
    .line 124
    iget-object v1, p0, Ll9;->a:Ljava/util/LinkedHashMap;

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
    iget-object v3, p0, Ll9;->a:Ljava/util/LinkedHashMap;

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
    invoke-static {}, Lxc;->d()V

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
    new-instance p0, Lcl;

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
    new-instance p0, Lcl;

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
    new-instance p0, Lcl;

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

.method public final c(Lx90;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lw3;->i:Lba0;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Lw3;->h:Laa0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lba0;->a:Lx1;

    .line 11
    .line 12
    iget-object v1, v0, Lx1;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lbd0;

    .line 15
    .line 16
    iget-boolean v2, v1, Lbd0;->d:Z

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget-boolean v1, v1, Lbd0;->f:Z

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    :try_start_0
    new-instance v1, Li7;

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    invoke-direct {v1, v2, p1}, Li7;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p0, Lxe1;

    .line 31
    .line 32
    iget-object p0, p0, Lxe1;->a:Lsi;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lsi;->s(Li7;)Lyc;

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
    iget-object p0, v0, Lx1;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lbd0;

    .line 42
    .line 43
    iget-boolean v0, p0, Lbd0;->e:Z

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-boolean v0, p0, Lbd0;->f:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 53
    .line 54
    invoke-static {v0}, Lxr0;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, Lbd0;->a()V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lbd0;->f:Z

    .line 62
    .line 63
    :goto_0
    const/4 p0, 0x0

    .line 64
    :goto_1
    iget-object v0, p1, Lba0;->d:Lyc;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Lyc;->cancel()V

    .line 69
    .line 70
    .line 71
    :cond_2
    iput-object p0, p1, Lba0;->d:Lyc;

    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-wide v1, p0, Lw3;->d:J

    .line 3
    .line 4
    iget-object p0, p0, Lw3;->B:Lc4;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1, v1, v2}, Lc4;->e(ZIJ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final canScrollVertically(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-wide v1, p0, Lw3;->d:J

    .line 3
    .line 4
    iget-object p0, p0, Lw3;->B:Lc4;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1, v1, v2}, Lc4;->e(ZIJ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final d(Ldv;Ldv;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_1e

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    check-cast p0, Loe0;

    .line 5
    .line 6
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 7
    .line 8
    iget-boolean v0, v0, Loe0;->q:Z

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 18
    .line 19
    invoke-static {p1}, Lpf1;->Q(Lrm;)Lb60;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    move-object v2, v0

    .line 25
    :goto_0
    const/16 v3, 0x10

    .line 26
    .line 27
    const/high16 v4, 0x200000

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    if-eqz p1, :cond_c

    .line 32
    .line 33
    iget-object v7, p1, Lb60;->I:Lmj0;

    .line 34
    .line 35
    iget-object v7, v7, Lmj0;->f:Loe0;

    .line 36
    .line 37
    iget v7, v7, Loe0;->g:I

    .line 38
    .line 39
    and-int/2addr v7, v4

    .line 40
    if-eqz v7, :cond_a

    .line 41
    .line 42
    :goto_1
    if-eqz p0, :cond_a

    .line 43
    .line 44
    iget v7, p0, Loe0;->f:I

    .line 45
    .line 46
    and-int/2addr v7, v4

    .line 47
    if-eqz v7, :cond_9

    .line 48
    .line 49
    move-object v7, p0

    .line 50
    move-object v8, v0

    .line 51
    :goto_2
    if-eqz v7, :cond_9

    .line 52
    .line 53
    instance-of v9, v7, Lq10;

    .line 54
    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_2
    iget v9, v7, Loe0;->f:I

    .line 69
    .line 70
    and-int/2addr v9, v4

    .line 71
    if-eqz v9, :cond_8

    .line 72
    .line 73
    instance-of v9, v7, Lsm;

    .line 74
    .line 75
    if-eqz v9, :cond_8

    .line 76
    .line 77
    move-object v9, v7

    .line 78
    check-cast v9, Lsm;

    .line 79
    .line 80
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 81
    .line 82
    move v10, v5

    .line 83
    :goto_3
    if-eqz v9, :cond_7

    .line 84
    .line 85
    iget v11, v9, Loe0;->f:I

    .line 86
    .line 87
    and-int/2addr v11, v4

    .line 88
    if-eqz v11, :cond_6

    .line 89
    .line 90
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    if-ne v10, v6, :cond_3

    .line 93
    .line 94
    move-object v7, v9

    .line 95
    goto :goto_4

    .line 96
    :cond_3
    if-nez v8, :cond_4

    .line 97
    .line 98
    new-instance v8, Lsh0;

    .line 99
    .line 100
    new-array v11, v3, [Loe0;

    .line 101
    .line 102
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    if-eqz v7, :cond_5

    .line 106
    .line 107
    invoke-virtual {v8, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v7, v0

    .line 111
    :cond_5
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_4
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    if-ne v10, v6, :cond_8

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    :goto_5
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    goto :goto_2

    .line 125
    :cond_9
    iget-object p0, p0, Loe0;->h:Loe0;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_a
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-eqz p1, :cond_b

    .line 133
    .line 134
    iget-object p0, p1, Lb60;->I:Lmj0;

    .line 135
    .line 136
    if-eqz p0, :cond_b

    .line 137
    .line 138
    iget-object p0, p0, Lmj0;->e:Ld61;

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_b
    move-object p0, v0

    .line 142
    goto :goto_0

    .line 143
    :cond_c
    if-nez v2, :cond_d

    .line 144
    .line 145
    goto/16 :goto_e

    .line 146
    .line 147
    :cond_d
    if-eqz p2, :cond_1b

    .line 148
    .line 149
    iget-object p0, p2, Loe0;->d:Loe0;

    .line 150
    .line 151
    iget-boolean p0, p0, Loe0;->q:Z

    .line 152
    .line 153
    if-nez p0, :cond_e

    .line 154
    .line 155
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_e
    iget-object p0, p2, Loe0;->d:Loe0;

    .line 159
    .line 160
    invoke-static {p2}, Lpf1;->Q(Lrm;)Lb60;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    move-object p2, v0

    .line 165
    :goto_6
    if-eqz p1, :cond_1a

    .line 166
    .line 167
    iget-object v1, p1, Lb60;->I:Lmj0;

    .line 168
    .line 169
    iget-object v1, v1, Lmj0;->f:Loe0;

    .line 170
    .line 171
    iget v1, v1, Loe0;->g:I

    .line 172
    .line 173
    and-int/2addr v1, v4

    .line 174
    if-eqz v1, :cond_18

    .line 175
    .line 176
    :goto_7
    if-eqz p0, :cond_18

    .line 177
    .line 178
    iget v1, p0, Loe0;->f:I

    .line 179
    .line 180
    and-int/2addr v1, v4

    .line 181
    if-eqz v1, :cond_17

    .line 182
    .line 183
    move-object v1, p0

    .line 184
    move-object v7, v0

    .line 185
    :goto_8
    if-eqz v1, :cond_17

    .line 186
    .line 187
    instance-of v8, v1, Lq10;

    .line 188
    .line 189
    if-eqz v8, :cond_10

    .line 190
    .line 191
    if-nez p2, :cond_f

    .line 192
    .line 193
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 194
    .line 195
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 196
    .line 197
    .line 198
    :cond_f
    invoke-interface {p2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_b

    .line 202
    :cond_10
    iget v8, v1, Loe0;->f:I

    .line 203
    .line 204
    and-int/2addr v8, v4

    .line 205
    if-eqz v8, :cond_16

    .line 206
    .line 207
    instance-of v8, v1, Lsm;

    .line 208
    .line 209
    if-eqz v8, :cond_16

    .line 210
    .line 211
    move-object v8, v1

    .line 212
    check-cast v8, Lsm;

    .line 213
    .line 214
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 215
    .line 216
    move v9, v5

    .line 217
    :goto_9
    if-eqz v8, :cond_15

    .line 218
    .line 219
    iget v10, v8, Loe0;->f:I

    .line 220
    .line 221
    and-int/2addr v10, v4

    .line 222
    if-eqz v10, :cond_14

    .line 223
    .line 224
    add-int/lit8 v9, v9, 0x1

    .line 225
    .line 226
    if-ne v9, v6, :cond_11

    .line 227
    .line 228
    move-object v1, v8

    .line 229
    goto :goto_a

    .line 230
    :cond_11
    if-nez v7, :cond_12

    .line 231
    .line 232
    new-instance v7, Lsh0;

    .line 233
    .line 234
    new-array v10, v3, [Loe0;

    .line 235
    .line 236
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :cond_12
    if-eqz v1, :cond_13

    .line 240
    .line 241
    invoke-virtual {v7, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    move-object v1, v0

    .line 245
    :cond_13
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_14
    :goto_a
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_15
    if-ne v9, v6, :cond_16

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_16
    :goto_b
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    goto :goto_8

    .line 259
    :cond_17
    iget-object p0, p0, Loe0;->h:Loe0;

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_18
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-eqz p1, :cond_19

    .line 267
    .line 268
    iget-object p0, p1, Lb60;->I:Lmj0;

    .line 269
    .line 270
    if-eqz p0, :cond_19

    .line 271
    .line 272
    iget-object p0, p0, Lmj0;->e:Ld61;

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_19
    move-object p0, v0

    .line 276
    goto :goto_6

    .line 277
    :cond_1a
    move-object v0, p2

    .line 278
    :cond_1b
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    move p1, v5

    .line 283
    :goto_c
    if-ge p1, p0, :cond_1e

    .line 284
    .line 285
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    check-cast p2, Lq10;

    .line 290
    .line 291
    if-eqz v0, :cond_1c

    .line 292
    .line 293
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    goto :goto_d

    .line 298
    :cond_1c
    move v1, v5

    .line 299
    :goto_d
    if-nez v1, :cond_1d

    .line 300
    .line 301
    invoke-interface {p2}, Lq10;->r()V

    .line 302
    .line 303
    .line 304
    :cond_1d
    add-int/lit8 p1, p1, 0x1

    .line 305
    .line 306
    goto :goto_c

    .line 307
    :cond_1e
    :goto_e
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lw3;->m(Lb60;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lw3;->s(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lt21;->j()Ll21;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ll21;->m()V

    .line 23
    .line 24
    .line 25
    iput-boolean v0, p0, Lw3;->I:Z

    .line 26
    .line 27
    iget-object v0, p0, Lw3;->t:Lx1;

    .line 28
    .line 29
    iget-object v1, v0, Lx1;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lb3;

    .line 32
    .line 33
    iget-object v2, v1, Lb3;->a:Landroid/graphics/Canvas;

    .line 34
    .line 35
    iput-object p1, v1, Lb3;->a:Landroid/graphics/Canvas;

    .line 36
    .line 37
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-virtual {v3, v1, v4}, Lb60;->i(Lbd;Lvx;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lx1;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lb3;

    .line 48
    .line 49
    iput-object v2, v0, Lb3;->a:Landroid/graphics/Canvas;

    .line 50
    .line 51
    iget-object v0, p0, Lw3;->G:Ldh0;

    .line 52
    .line 53
    invoke-virtual {v0}, Ldh0;->i()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x0

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget v1, v0, Ldh0;->b:I

    .line 61
    .line 62
    move v3, v2

    .line 63
    :goto_0
    if-ge v3, v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ldh0;->f(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lcn0;

    .line 70
    .line 71
    check-cast v5, Lxx;

    .line 72
    .line 73
    invoke-virtual {v5}, Lxx;->g()V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    sget v1, Lpc1;->d:I

    .line 80
    .line 81
    invoke-virtual {v0}, Ldh0;->d()V

    .line 82
    .line 83
    .line 84
    iput-boolean v2, p0, Lw3;->I:Z

    .line 85
    .line 86
    iget-object v1, p0, Lw3;->H:Ldh0;

    .line 87
    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ldh0;->b(Ldh0;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ldh0;->d()V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-boolean v0, p0, Lw3;->o:Z

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget v0, p0, Lw3;->y0:F

    .line 101
    .line 102
    invoke-static {p0, v0}, Ln8;->a(Landroid/view/View;F)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lw3;->n:Landroid/view/View;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    iget v1, p0, Lw3;->z0:F

    .line 110
    .line 111
    invoke-static {v0, v1}, Ln8;->a(Landroid/view/View;F)V

    .line 112
    .line 113
    .line 114
    iget v1, p0, Lw3;->z0:F

    .line 115
    .line 116
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 126
    .line 127
    .line 128
    move-result-wide v1

    .line 129
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 130
    .line 131
    .line 132
    :cond_3
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 133
    .line 134
    iput p1, p0, Lw3;->y0:F

    .line 135
    .line 136
    iput p1, p0, Lw3;->z0:F

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    const-string p0, "frameRateCategoryView"

    .line 140
    .line 141
    invoke-static {p0}, Lp30;->V(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v4

    .line 145
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lw3;->getRectManager()Lut0;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Lut0;->a()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lw3;->C0:Z

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
    iget-object v2, v0, Lw3;->B0:Lg3;

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
    iput-boolean v4, v0, Lw3;->C0:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Lg3;->run()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-static {v1}, Lw3;->o(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_91

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
    goto/16 :goto_56

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v5, "visitAncestors called on an unattached node"

    .line 48
    .line 49
    const/4 v6, -0x1

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
    invoke-virtual {v0}, Lw3;->getFocusOwner()Lwu;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v3, Lm3;

    .line 99
    .line 100
    invoke-direct {v3, v9, v0, v1}, Lm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    check-cast v2, Lzu;

    .line 104
    .line 105
    iget-object v0, v2, Lzu;->d:Luu;

    .line 106
    .line 107
    iget-boolean v0, v0, Luu;->e:Z

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 112
    .line 113
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return v4

    .line 119
    :cond_3
    iget-object v0, v2, Lzu;->c:Ldv;

    .line 120
    .line 121
    invoke-static {v0}, Li4;->n(Ldv;)Ldv;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_10

    .line 126
    .line 127
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 128
    .line 129
    iget-boolean v1, v1, Loe0;->q:Z

    .line 130
    .line 131
    if-nez v1, :cond_4

    .line 132
    .line 133
    invoke-static {v5}, Lw10;->b(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    iget-object v1, v0, Loe0;->d:Loe0;

    .line 137
    .line 138
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_1
    if-eqz v0, :cond_f

    .line 143
    .line 144
    iget-object v2, v0, Lb60;->I:Lmj0;

    .line 145
    .line 146
    iget-object v2, v2, Lmj0;->f:Loe0;

    .line 147
    .line 148
    iget v2, v2, Loe0;->g:I

    .line 149
    .line 150
    and-int/lit16 v2, v2, 0x4000

    .line 151
    .line 152
    if-eqz v2, :cond_d

    .line 153
    .line 154
    :goto_2
    if-eqz v1, :cond_d

    .line 155
    .line 156
    iget v2, v1, Loe0;->f:I

    .line 157
    .line 158
    and-int/lit16 v2, v2, 0x4000

    .line 159
    .line 160
    if-eqz v2, :cond_c

    .line 161
    .line 162
    move-object v2, v1

    .line 163
    const/4 v10, 0x0

    .line 164
    :goto_3
    if-eqz v2, :cond_c

    .line 165
    .line 166
    instance-of v11, v2, Lj3;

    .line 167
    .line 168
    if-eqz v11, :cond_5

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_5
    iget v11, v2, Loe0;->f:I

    .line 172
    .line 173
    and-int/lit16 v11, v11, 0x4000

    .line 174
    .line 175
    if-eqz v11, :cond_b

    .line 176
    .line 177
    instance-of v11, v2, Lsm;

    .line 178
    .line 179
    if-eqz v11, :cond_b

    .line 180
    .line 181
    move-object v11, v2

    .line 182
    check-cast v11, Lsm;

    .line 183
    .line 184
    iget-object v11, v11, Lsm;->s:Loe0;

    .line 185
    .line 186
    move v12, v4

    .line 187
    :goto_4
    if-eqz v11, :cond_a

    .line 188
    .line 189
    iget v13, v11, Loe0;->f:I

    .line 190
    .line 191
    and-int/lit16 v13, v13, 0x4000

    .line 192
    .line 193
    if-eqz v13, :cond_9

    .line 194
    .line 195
    add-int/lit8 v12, v12, 0x1

    .line 196
    .line 197
    if-ne v12, v9, :cond_6

    .line 198
    .line 199
    move-object v2, v11

    .line 200
    goto :goto_5

    .line 201
    :cond_6
    if-nez v10, :cond_7

    .line 202
    .line 203
    new-instance v10, Lsh0;

    .line 204
    .line 205
    new-array v13, v8, [Loe0;

    .line 206
    .line 207
    invoke-direct {v10, v13}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_7
    if-eqz v2, :cond_8

    .line 211
    .line 212
    invoke-virtual {v10, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    const/4 v2, 0x0

    .line 216
    :cond_8
    invoke-virtual {v10, v11}, Lsh0;->b(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_9
    :goto_5
    iget-object v11, v11, Loe0;->i:Loe0;

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_a
    if-ne v12, v9, :cond_b

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_b
    invoke-static {v10}, Lpf1;->f(Lsh0;)Loe0;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_3

    .line 230
    :cond_c
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_d
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_e

    .line 238
    .line 239
    iget-object v1, v0, Lb60;->I:Lmj0;

    .line 240
    .line 241
    if-eqz v1, :cond_e

    .line 242
    .line 243
    iget-object v1, v1, Lmj0;->e:Ld61;

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_e
    const/4 v1, 0x0

    .line 247
    goto :goto_1

    .line 248
    :cond_f
    const/4 v2, 0x0

    .line 249
    :goto_6
    check-cast v2, Lj3;

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_10
    const/4 v2, 0x0

    .line 253
    :goto_7
    if-eqz v2, :cond_32

    .line 254
    .line 255
    iget-object v0, v2, Loe0;->d:Loe0;

    .line 256
    .line 257
    iget-boolean v0, v0, Loe0;->q:Z

    .line 258
    .line 259
    if-nez v0, :cond_11

    .line 260
    .line 261
    invoke-static {v5}, Lw10;->b(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :cond_11
    iget-object v0, v2, Loe0;->d:Loe0;

    .line 265
    .line 266
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 267
    .line 268
    invoke-static {v2}, Lpf1;->Q(Lrm;)Lb60;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const/4 v5, 0x0

    .line 273
    :goto_8
    if-eqz v1, :cond_1d

    .line 274
    .line 275
    iget-object v10, v1, Lb60;->I:Lmj0;

    .line 276
    .line 277
    iget-object v10, v10, Lmj0;->f:Loe0;

    .line 278
    .line 279
    iget v10, v10, Loe0;->g:I

    .line 280
    .line 281
    and-int/lit16 v10, v10, 0x4000

    .line 282
    .line 283
    if-eqz v10, :cond_1b

    .line 284
    .line 285
    :goto_9
    if-eqz v0, :cond_1b

    .line 286
    .line 287
    iget v10, v0, Loe0;->f:I

    .line 288
    .line 289
    and-int/lit16 v10, v10, 0x4000

    .line 290
    .line 291
    if-eqz v10, :cond_1a

    .line 292
    .line 293
    move-object v10, v0

    .line 294
    const/4 v11, 0x0

    .line 295
    :goto_a
    if-eqz v10, :cond_1a

    .line 296
    .line 297
    instance-of v12, v10, Lj3;

    .line 298
    .line 299
    if-eqz v12, :cond_13

    .line 300
    .line 301
    if-nez v5, :cond_12

    .line 302
    .line 303
    new-instance v5, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    :cond_12
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_d

    .line 312
    :cond_13
    iget v12, v10, Loe0;->f:I

    .line 313
    .line 314
    and-int/lit16 v12, v12, 0x4000

    .line 315
    .line 316
    if-eqz v12, :cond_19

    .line 317
    .line 318
    instance-of v12, v10, Lsm;

    .line 319
    .line 320
    if-eqz v12, :cond_19

    .line 321
    .line 322
    move-object v12, v10

    .line 323
    check-cast v12, Lsm;

    .line 324
    .line 325
    iget-object v12, v12, Lsm;->s:Loe0;

    .line 326
    .line 327
    move v13, v4

    .line 328
    :goto_b
    if-eqz v12, :cond_18

    .line 329
    .line 330
    iget v14, v12, Loe0;->f:I

    .line 331
    .line 332
    and-int/lit16 v14, v14, 0x4000

    .line 333
    .line 334
    if-eqz v14, :cond_17

    .line 335
    .line 336
    add-int/lit8 v13, v13, 0x1

    .line 337
    .line 338
    if-ne v13, v9, :cond_14

    .line 339
    .line 340
    move-object v10, v12

    .line 341
    goto :goto_c

    .line 342
    :cond_14
    if-nez v11, :cond_15

    .line 343
    .line 344
    new-instance v11, Lsh0;

    .line 345
    .line 346
    new-array v14, v8, [Loe0;

    .line 347
    .line 348
    invoke-direct {v11, v14}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_15
    if-eqz v10, :cond_16

    .line 352
    .line 353
    invoke-virtual {v11, v10}, Lsh0;->b(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    const/4 v10, 0x0

    .line 357
    :cond_16
    invoke-virtual {v11, v12}, Lsh0;->b(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_17
    :goto_c
    iget-object v12, v12, Loe0;->i:Loe0;

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_18
    if-ne v13, v9, :cond_19

    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_19
    :goto_d
    invoke-static {v11}, Lpf1;->f(Lsh0;)Loe0;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    goto :goto_a

    .line 371
    :cond_1a
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_1b
    invoke-virtual {v1}, Lb60;->v()Lb60;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    if-eqz v1, :cond_1c

    .line 379
    .line 380
    iget-object v0, v1, Lb60;->I:Lmj0;

    .line 381
    .line 382
    if-eqz v0, :cond_1c

    .line 383
    .line 384
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_1c
    const/4 v0, 0x0

    .line 388
    goto :goto_8

    .line 389
    :cond_1d
    if-eqz v5, :cond_1f

    .line 390
    .line 391
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    add-int/2addr v0, v6

    .line 396
    if-ltz v0, :cond_1f

    .line 397
    .line 398
    :goto_e
    add-int/lit8 v1, v0, -0x1

    .line 399
    .line 400
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Lj3;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    if-gez v1, :cond_1e

    .line 410
    .line 411
    goto :goto_f

    .line 412
    :cond_1e
    move v0, v1

    .line 413
    goto :goto_e

    .line 414
    :cond_1f
    :goto_f
    iget-object v0, v2, Loe0;->d:Loe0;

    .line 415
    .line 416
    const/4 v1, 0x0

    .line 417
    :goto_10
    if-eqz v0, :cond_27

    .line 418
    .line 419
    instance-of v6, v0, Lj3;

    .line 420
    .line 421
    if-eqz v6, :cond_20

    .line 422
    .line 423
    goto :goto_13

    .line 424
    :cond_20
    iget v6, v0, Loe0;->f:I

    .line 425
    .line 426
    and-int/lit16 v6, v6, 0x4000

    .line 427
    .line 428
    if-eqz v6, :cond_26

    .line 429
    .line 430
    instance-of v6, v0, Lsm;

    .line 431
    .line 432
    if-eqz v6, :cond_26

    .line 433
    .line 434
    move-object v6, v0

    .line 435
    check-cast v6, Lsm;

    .line 436
    .line 437
    iget-object v6, v6, Lsm;->s:Loe0;

    .line 438
    .line 439
    move v10, v4

    .line 440
    :goto_11
    if-eqz v6, :cond_25

    .line 441
    .line 442
    iget v11, v6, Loe0;->f:I

    .line 443
    .line 444
    and-int/lit16 v11, v11, 0x4000

    .line 445
    .line 446
    if-eqz v11, :cond_24

    .line 447
    .line 448
    add-int/lit8 v10, v10, 0x1

    .line 449
    .line 450
    if-ne v10, v9, :cond_21

    .line 451
    .line 452
    move-object v0, v6

    .line 453
    goto :goto_12

    .line 454
    :cond_21
    if-nez v1, :cond_22

    .line 455
    .line 456
    new-instance v1, Lsh0;

    .line 457
    .line 458
    new-array v11, v8, [Loe0;

    .line 459
    .line 460
    invoke-direct {v1, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    :cond_22
    if-eqz v0, :cond_23

    .line 464
    .line 465
    invoke-virtual {v1, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    :cond_23
    invoke-virtual {v1, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :cond_24
    :goto_12
    iget-object v6, v6, Loe0;->i:Loe0;

    .line 473
    .line 474
    goto :goto_11

    .line 475
    :cond_25
    if-ne v10, v9, :cond_26

    .line 476
    .line 477
    goto :goto_10

    .line 478
    :cond_26
    :goto_13
    invoke-static {v1}, Lpf1;->f(Lsh0;)Loe0;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    goto :goto_10

    .line 483
    :cond_27
    invoke-virtual {v3}, Lm3;->invoke()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    check-cast v0, Ljava/lang/Boolean;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_28

    .line 494
    .line 495
    goto/16 :goto_19

    .line 496
    .line 497
    :cond_28
    iget-object v0, v2, Loe0;->d:Loe0;

    .line 498
    .line 499
    const/4 v1, 0x0

    .line 500
    :goto_14
    if-eqz v0, :cond_30

    .line 501
    .line 502
    instance-of v2, v0, Lj3;

    .line 503
    .line 504
    if-eqz v2, :cond_29

    .line 505
    .line 506
    goto :goto_17

    .line 507
    :cond_29
    iget v2, v0, Loe0;->f:I

    .line 508
    .line 509
    and-int/lit16 v2, v2, 0x4000

    .line 510
    .line 511
    if-eqz v2, :cond_2f

    .line 512
    .line 513
    instance-of v2, v0, Lsm;

    .line 514
    .line 515
    if-eqz v2, :cond_2f

    .line 516
    .line 517
    move-object v2, v0

    .line 518
    check-cast v2, Lsm;

    .line 519
    .line 520
    iget-object v2, v2, Lsm;->s:Loe0;

    .line 521
    .line 522
    move v3, v4

    .line 523
    :goto_15
    if-eqz v2, :cond_2e

    .line 524
    .line 525
    iget v6, v2, Loe0;->f:I

    .line 526
    .line 527
    and-int/lit16 v6, v6, 0x4000

    .line 528
    .line 529
    if-eqz v6, :cond_2d

    .line 530
    .line 531
    add-int/lit8 v3, v3, 0x1

    .line 532
    .line 533
    if-ne v3, v9, :cond_2a

    .line 534
    .line 535
    move-object v0, v2

    .line 536
    goto :goto_16

    .line 537
    :cond_2a
    if-nez v1, :cond_2b

    .line 538
    .line 539
    new-instance v1, Lsh0;

    .line 540
    .line 541
    new-array v6, v8, [Loe0;

    .line 542
    .line 543
    invoke-direct {v1, v6}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_2b
    if-eqz v0, :cond_2c

    .line 547
    .line 548
    invoke-virtual {v1, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    const/4 v0, 0x0

    .line 552
    :cond_2c
    invoke-virtual {v1, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_2d
    :goto_16
    iget-object v2, v2, Loe0;->i:Loe0;

    .line 556
    .line 557
    goto :goto_15

    .line 558
    :cond_2e
    if-ne v3, v9, :cond_2f

    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_2f
    :goto_17
    invoke-static {v1}, Lpf1;->f(Lsh0;)Loe0;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    goto :goto_14

    .line 566
    :cond_30
    if-eqz v5, :cond_32

    .line 567
    .line 568
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    move v1, v4

    .line 573
    :goto_18
    if-ge v1, v0, :cond_32

    .line 574
    .line 575
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    check-cast v2, Lj3;

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    add-int/lit8 v1, v1, 0x1

    .line 585
    .line 586
    goto :goto_18

    .line 587
    :cond_31
    invoke-virtual/range {p0 .. p1}, Lw3;->l(Landroid/view/MotionEvent;)I

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    and-int/2addr v0, v9

    .line 592
    if-eqz v0, :cond_32

    .line 593
    .line 594
    :goto_19
    return v9

    .line 595
    :cond_32
    return v4

    .line 596
    :cond_33
    const/high16 v2, 0x200000

    .line 597
    .line 598
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    if-eqz v3, :cond_90

    .line 603
    .line 604
    iget-object v3, v0, Lw3;->f:Lg10;

    .line 605
    .line 606
    iget-object v10, v0, Lw3;->J:Lag0;

    .line 607
    .line 608
    iget-object v11, v10, Lag0;->e:Lub0;

    .line 609
    .line 610
    iget-object v12, v10, Lag0;->b:Landroid/util/SparseLongArray;

    .line 611
    .line 612
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 613
    .line 614
    .line 615
    move-result v13

    .line 616
    invoke-virtual {v10, v1}, Lag0;->b(Landroid/view/MotionEvent;)V

    .line 617
    .line 618
    .line 619
    const/4 v14, 0x3

    .line 620
    const/4 v15, 0x2

    .line 621
    if-ne v13, v14, :cond_34

    .line 622
    .line 623
    invoke-virtual {v12}, Landroid/util/SparseLongArray;->clear()V

    .line 624
    .line 625
    .line 626
    iget-object v1, v10, Lag0;->c:Landroid/util/SparseBooleanArray;

    .line 627
    .line 628
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 629
    .line 630
    .line 631
    move-object/from16 v23, v5

    .line 632
    .line 633
    move/from16 v16, v6

    .line 634
    .line 635
    move/from16 v19, v8

    .line 636
    .line 637
    const/4 v3, 0x0

    .line 638
    const/16 v17, 0x0

    .line 639
    .line 640
    goto/16 :goto_2e

    .line 641
    .line 642
    :cond_34
    invoke-virtual {v10, v1}, Lag0;->a(Landroid/view/MotionEvent;)V

    .line 643
    .line 644
    .line 645
    const/4 v14, 0x6

    .line 646
    if-eq v13, v9, :cond_36

    .line 647
    .line 648
    if-eq v13, v14, :cond_35

    .line 649
    .line 650
    move/from16 v16, v6

    .line 651
    .line 652
    :goto_1a
    const/16 v17, 0x0

    .line 653
    .line 654
    goto :goto_1b

    .line 655
    :cond_35
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 656
    .line 657
    .line 658
    move-result v16

    .line 659
    move/from16 v17, v16

    .line 660
    .line 661
    move/from16 v16, v6

    .line 662
    .line 663
    move/from16 v6, v17

    .line 664
    .line 665
    goto :goto_1a

    .line 666
    :cond_36
    move/from16 v16, v6

    .line 667
    .line 668
    const/16 v17, 0x0

    .line 669
    .line 670
    move v6, v4

    .line 671
    :goto_1b
    const/4 v7, 0x5

    .line 672
    if-eqz v13, :cond_37

    .line 673
    .line 674
    if-eq v13, v15, :cond_37

    .line 675
    .line 676
    if-eq v13, v7, :cond_37

    .line 677
    .line 678
    move/from16 v18, v4

    .line 679
    .line 680
    :goto_1c
    move/from16 v19, v8

    .line 681
    .line 682
    goto :goto_1d

    .line 683
    :cond_37
    move/from16 v18, v9

    .line 684
    .line 685
    goto :goto_1c

    .line 686
    :goto_1d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    new-instance v14, Ljava/util/ArrayList;

    .line 691
    .line 692
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 693
    .line 694
    .line 695
    move v7, v4

    .line 696
    :goto_1e
    if-ge v7, v8, :cond_42

    .line 697
    .line 698
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 699
    .line 700
    .line 701
    move-result v15

    .line 702
    move/from16 v20, v9

    .line 703
    .line 704
    invoke-virtual {v12, v15}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 705
    .line 706
    .line 707
    move-result v9

    .line 708
    const-wide/16 v21, 0x1

    .line 709
    .line 710
    if-ltz v9, :cond_38

    .line 711
    .line 712
    invoke-virtual {v12, v9}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 713
    .line 714
    .line 715
    move-result-wide v23

    .line 716
    move-wide/from16 v41, v23

    .line 717
    .line 718
    move-object/from16 v23, v5

    .line 719
    .line 720
    move-wide/from16 v4, v41

    .line 721
    .line 722
    move-object/from16 v25, v3

    .line 723
    .line 724
    goto :goto_1f

    .line 725
    :cond_38
    move-object/from16 v23, v5

    .line 726
    .line 727
    iget-wide v4, v10, Lag0;->a:J

    .line 728
    .line 729
    move-object/from16 v25, v3

    .line 730
    .line 731
    add-long v2, v4, v21

    .line 732
    .line 733
    iput-wide v2, v10, Lag0;->a:J

    .line 734
    .line 735
    invoke-virtual {v12, v15, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 736
    .line 737
    .line 738
    :goto_1f
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    move-object v15, v10

    .line 751
    int-to-long v9, v2

    .line 752
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    int-to-long v2, v2

    .line 757
    const/16 v26, 0x20

    .line 758
    .line 759
    shl-long v9, v9, v26

    .line 760
    .line 761
    const-wide v27, 0xffffffffL

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    and-long v2, v2, v27

    .line 767
    .line 768
    or-long v31, v9, v2

    .line 769
    .line 770
    if-eq v7, v6, :cond_39

    .line 771
    .line 772
    move/from16 v33, v20

    .line 773
    .line 774
    goto :goto_20

    .line 775
    :cond_39
    const/16 v33, 0x0

    .line 776
    .line 777
    :goto_20
    iget-object v2, v11, Lub0;->e:[J

    .line 778
    .line 779
    iget v3, v11, Lub0;->g:I

    .line 780
    .line 781
    invoke-static {v2, v3, v4, v5}, Lo30;->k([JIJ)I

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    if-ltz v2, :cond_3a

    .line 786
    .line 787
    iget-object v3, v11, Lub0;->f:[Ljava/lang/Object;

    .line 788
    .line 789
    aget-object v2, v3, v2

    .line 790
    .line 791
    sget-object v3, Lrd0;->k:Ljava/lang/Object;

    .line 792
    .line 793
    if-ne v2, v3, :cond_3b

    .line 794
    .line 795
    :cond_3a
    move-object/from16 v2, v17

    .line 796
    .line 797
    :cond_3b
    check-cast v2, Lzf0;

    .line 798
    .line 799
    const-wide/32 v9, 0x7fffffff

    .line 800
    .line 801
    .line 802
    if-ne v7, v6, :cond_3c

    .line 803
    .line 804
    invoke-virtual {v11, v4, v5}, Lub0;->c(J)V

    .line 805
    .line 806
    .line 807
    move-wide v3, v4

    .line 808
    move-wide/from16 v34, v9

    .line 809
    .line 810
    move/from16 v9, v26

    .line 811
    .line 812
    const v5, 0xffff

    .line 813
    .line 814
    .line 815
    goto :goto_22

    .line 816
    :cond_3c
    if-eqz v18, :cond_3d

    .line 817
    .line 818
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 819
    .line 820
    .line 821
    move-result-wide v29

    .line 822
    and-long v29, v29, v9

    .line 823
    .line 824
    shl-long v29, v29, v20

    .line 825
    .line 826
    or-long v29, v21, v29

    .line 827
    .line 828
    move-wide/from16 v34, v9

    .line 829
    .line 830
    shr-long v9, v31, v26

    .line 831
    .line 832
    long-to-int v9, v9

    .line 833
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 834
    .line 835
    .line 836
    move-result v9

    .line 837
    float-to-int v9, v9

    .line 838
    int-to-short v9, v9

    .line 839
    move-wide/from16 v36, v4

    .line 840
    .line 841
    const v5, 0xffff

    .line 842
    .line 843
    .line 844
    and-long v3, v31, v27

    .line 845
    .line 846
    long-to-int v3, v3

    .line 847
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    float-to-int v3, v3

    .line 852
    int-to-short v3, v3

    .line 853
    shl-int/lit8 v4, v9, 0x10

    .line 854
    .line 855
    and-int/2addr v3, v5

    .line 856
    or-int/2addr v3, v4

    .line 857
    int-to-long v3, v3

    .line 858
    shl-long v3, v3, v26

    .line 859
    .line 860
    or-long v3, v29, v3

    .line 861
    .line 862
    new-instance v9, Lzf0;

    .line 863
    .line 864
    invoke-direct {v9, v3, v4}, Lzf0;-><init>(J)V

    .line 865
    .line 866
    .line 867
    move-wide/from16 v3, v36

    .line 868
    .line 869
    invoke-virtual {v11, v3, v4, v9}, Lub0;->b(JLjava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    :goto_21
    move/from16 v9, v26

    .line 873
    .line 874
    goto :goto_22

    .line 875
    :cond_3d
    move-wide v3, v4

    .line 876
    move-wide/from16 v34, v9

    .line 877
    .line 878
    const v5, 0xffff

    .line 879
    .line 880
    .line 881
    goto :goto_21

    .line 882
    :goto_22
    new-instance v26, Lh10;

    .line 883
    .line 884
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 885
    .line 886
    .line 887
    move-result-wide v29

    .line 888
    move-wide/from16 v35, v34

    .line 889
    .line 890
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 891
    .line 892
    .line 893
    move-result v34

    .line 894
    move/from16 v37, v5

    .line 895
    .line 896
    move v10, v6

    .line 897
    if-eqz v2, :cond_3e

    .line 898
    .line 899
    iget-wide v5, v2, Lzf0;->a:J

    .line 900
    .line 901
    shr-long v5, v5, v20

    .line 902
    .line 903
    and-long v5, v5, v35

    .line 904
    .line 905
    :goto_23
    move-wide/from16 v35, v5

    .line 906
    .line 907
    goto :goto_24

    .line 908
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 909
    .line 910
    .line 911
    move-result-wide v5

    .line 912
    goto :goto_23

    .line 913
    :goto_24
    if-eqz v2, :cond_3f

    .line 914
    .line 915
    iget-wide v5, v2, Lzf0;->a:J

    .line 916
    .line 917
    ushr-long/2addr v5, v9

    .line 918
    long-to-int v5, v5

    .line 919
    ushr-int/lit8 v6, v5, 0x10

    .line 920
    .line 921
    int-to-short v6, v6

    .line 922
    int-to-float v6, v6

    .line 923
    and-int v5, v5, v37

    .line 924
    .line 925
    int-to-short v5, v5

    .line 926
    int-to-float v5, v5

    .line 927
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 928
    .line 929
    .line 930
    move-result v6

    .line 931
    move/from16 v37, v9

    .line 932
    .line 933
    move/from16 v40, v10

    .line 934
    .line 935
    int-to-long v9, v6

    .line 936
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 937
    .line 938
    .line 939
    move-result v5

    .line 940
    int-to-long v5, v5

    .line 941
    shl-long v9, v9, v37

    .line 942
    .line 943
    and-long v5, v5, v27

    .line 944
    .line 945
    or-long/2addr v5, v9

    .line 946
    move-wide/from16 v37, v5

    .line 947
    .line 948
    goto :goto_25

    .line 949
    :cond_3f
    move/from16 v40, v10

    .line 950
    .line 951
    move-wide/from16 v37, v31

    .line 952
    .line 953
    :goto_25
    if-eqz v2, :cond_41

    .line 954
    .line 955
    iget-wide v5, v2, Lzf0;->a:J

    .line 956
    .line 957
    and-long v5, v5, v21

    .line 958
    .line 959
    const-wide/16 v9, 0x0

    .line 960
    .line 961
    cmp-long v2, v5, v9

    .line 962
    .line 963
    if-eqz v2, :cond_40

    .line 964
    .line 965
    move/from16 v2, v20

    .line 966
    .line 967
    goto :goto_26

    .line 968
    :cond_40
    const/4 v2, 0x0

    .line 969
    :goto_26
    move/from16 v39, v2

    .line 970
    .line 971
    :goto_27
    move-wide/from16 v27, v3

    .line 972
    .line 973
    goto :goto_28

    .line 974
    :cond_41
    const/16 v39, 0x0

    .line 975
    .line 976
    goto :goto_27

    .line 977
    :goto_28
    invoke-direct/range {v26 .. v39}, Lh10;-><init>(JJJZFJJZ)V

    .line 978
    .line 979
    .line 980
    move-object/from16 v2, v26

    .line 981
    .line 982
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    add-int/lit8 v7, v7, 0x1

    .line 986
    .line 987
    move-object v10, v15

    .line 988
    move/from16 v9, v20

    .line 989
    .line 990
    move-object/from16 v5, v23

    .line 991
    .line 992
    move-object/from16 v3, v25

    .line 993
    .line 994
    move/from16 v6, v40

    .line 995
    .line 996
    const/high16 v2, 0x200000

    .line 997
    .line 998
    const/4 v4, 0x0

    .line 999
    const/4 v15, 0x2

    .line 1000
    goto/16 :goto_1e

    .line 1001
    .line 1002
    :cond_42
    move-object/from16 v25, v3

    .line 1003
    .line 1004
    move-object/from16 v23, v5

    .line 1005
    .line 1006
    move/from16 v20, v9

    .line 1007
    .line 1008
    move-object v15, v10

    .line 1009
    invoke-virtual {v15, v1}, Lag0;->d(Landroid/view/MotionEvent;)V

    .line 1010
    .line 1011
    .line 1012
    if-eqz v25, :cond_43

    .line 1013
    .line 1014
    move-object/from16 v2, v25

    .line 1015
    .line 1016
    iget v2, v2, Lg10;->a:I

    .line 1017
    .line 1018
    goto :goto_2d

    .line 1019
    :cond_43
    const/high16 v2, 0x200000

    .line 1020
    .line 1021
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    if-eqz v3, :cond_8f

    .line 1026
    .line 1027
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    if-eqz v2, :cond_49

    .line 1032
    .line 1033
    const/4 v9, 0x0

    .line 1034
    invoke-virtual {v2, v9}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    move/from16 v4, v20

    .line 1039
    .line 1040
    invoke-virtual {v2, v4}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v2

    .line 1044
    if-eqz v3, :cond_44

    .line 1045
    .line 1046
    if-nez v2, :cond_44

    .line 1047
    .line 1048
    :goto_29
    const/4 v2, 0x1

    .line 1049
    goto :goto_2d

    .line 1050
    :cond_44
    if-eqz v2, :cond_45

    .line 1051
    .line 1052
    if-nez v3, :cond_45

    .line 1053
    .line 1054
    :goto_2a
    const/4 v2, 0x2

    .line 1055
    goto :goto_2d

    .line 1056
    :cond_45
    if-eqz v3, :cond_49

    .line 1057
    .line 1058
    if-eqz v2, :cond_49

    .line 1059
    .line 1060
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1061
    .line 1062
    .line 1063
    move-result v3

    .line 1064
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1065
    .line 1066
    .line 1067
    move-result v2

    .line 1068
    cmpl-float v4, v3, v2

    .line 1069
    .line 1070
    const/high16 v5, 0x40a00000    # 5.0f

    .line 1071
    .line 1072
    const/4 v6, 0x0

    .line 1073
    if-lez v4, :cond_47

    .line 1074
    .line 1075
    cmpg-float v4, v2, v6

    .line 1076
    .line 1077
    if-nez v4, :cond_46

    .line 1078
    .line 1079
    goto :goto_2b

    .line 1080
    :cond_46
    div-float v4, v3, v2

    .line 1081
    .line 1082
    cmpl-float v4, v4, v5

    .line 1083
    .line 1084
    if-ltz v4, :cond_47

    .line 1085
    .line 1086
    :goto_2b
    goto :goto_29

    .line 1087
    :cond_47
    cmpl-float v4, v2, v3

    .line 1088
    .line 1089
    if-lez v4, :cond_49

    .line 1090
    .line 1091
    cmpg-float v4, v3, v6

    .line 1092
    .line 1093
    if-nez v4, :cond_48

    .line 1094
    .line 1095
    goto :goto_2c

    .line 1096
    :cond_48
    div-float/2addr v2, v3

    .line 1097
    cmpl-float v2, v2, v5

    .line 1098
    .line 1099
    if-ltz v2, :cond_49

    .line 1100
    .line 1101
    :goto_2c
    goto :goto_2a

    .line 1102
    :cond_49
    const/4 v2, 0x0

    .line 1103
    :goto_2d
    new-instance v3, Lu5;

    .line 1104
    .line 1105
    if-eqz v13, :cond_4a

    .line 1106
    .line 1107
    const/4 v4, 0x1

    .line 1108
    if-eq v13, v4, :cond_4a

    .line 1109
    .line 1110
    const/4 v4, 0x2

    .line 1111
    if-eq v13, v4, :cond_4a

    .line 1112
    .line 1113
    const/4 v4, 0x5

    .line 1114
    if-eq v13, v4, :cond_4a

    .line 1115
    .line 1116
    const/4 v4, 0x6

    .line 1117
    :cond_4a
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1118
    .line 1119
    .line 1120
    iput-object v14, v3, Lu5;->b:Ljava/lang/Object;

    .line 1121
    .line 1122
    iput v2, v3, Lu5;->a:I

    .line 1123
    .line 1124
    iput-object v1, v3, Lu5;->c:Ljava/lang/Object;

    .line 1125
    .line 1126
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-nez v1, :cond_8e

    .line 1131
    .line 1132
    :goto_2e
    iget-object v1, v0, Lw3;->D0:Ls10;

    .line 1133
    .line 1134
    if-eqz v3, :cond_71

    .line 1135
    .line 1136
    invoke-virtual {v0}, Lw3;->getFocusOwner()Lwu;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, Lzu;

    .line 1141
    .line 1142
    iget-object v2, v0, Lzu;->d:Luu;

    .line 1143
    .line 1144
    iget-boolean v2, v2, Luu;->e:Z

    .line 1145
    .line 1146
    if-eqz v2, :cond_4c

    .line 1147
    .line 1148
    const-string v0, "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."

    .line 1149
    .line 1150
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 1151
    .line 1152
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 1153
    .line 1154
    .line 1155
    :cond_4b
    const/4 v0, 0x0

    .line 1156
    goto/16 :goto_44

    .line 1157
    .line 1158
    :cond_4c
    invoke-virtual {v0}, Lzu;->f()Ldv;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    if-eqz v0, :cond_59

    .line 1163
    .line 1164
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1165
    .line 1166
    iget-boolean v2, v2, Loe0;->q:Z

    .line 1167
    .line 1168
    if-nez v2, :cond_4d

    .line 1169
    .line 1170
    invoke-static/range {v23 .. v23}, Lw10;->b(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    :cond_4d
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1174
    .line 1175
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    :goto_2f
    if-eqz v0, :cond_58

    .line 1180
    .line 1181
    iget-object v4, v0, Lb60;->I:Lmj0;

    .line 1182
    .line 1183
    iget-object v4, v4, Lmj0;->f:Loe0;

    .line 1184
    .line 1185
    iget v4, v4, Loe0;->g:I

    .line 1186
    .line 1187
    const/high16 v24, 0x200000

    .line 1188
    .line 1189
    and-int v4, v4, v24

    .line 1190
    .line 1191
    if-eqz v4, :cond_56

    .line 1192
    .line 1193
    :goto_30
    if-eqz v2, :cond_56

    .line 1194
    .line 1195
    iget v4, v2, Loe0;->f:I

    .line 1196
    .line 1197
    and-int v4, v4, v24

    .line 1198
    .line 1199
    if-eqz v4, :cond_55

    .line 1200
    .line 1201
    move-object v4, v2

    .line 1202
    move-object/from16 v5, v17

    .line 1203
    .line 1204
    :goto_31
    if-eqz v4, :cond_55

    .line 1205
    .line 1206
    instance-of v6, v4, Lq10;

    .line 1207
    .line 1208
    if-eqz v6, :cond_4e

    .line 1209
    .line 1210
    goto/16 :goto_36

    .line 1211
    .line 1212
    :cond_4e
    iget v6, v4, Loe0;->f:I

    .line 1213
    .line 1214
    and-int v6, v6, v24

    .line 1215
    .line 1216
    if-eqz v6, :cond_54

    .line 1217
    .line 1218
    instance-of v6, v4, Lsm;

    .line 1219
    .line 1220
    if-eqz v6, :cond_54

    .line 1221
    .line 1222
    move-object v6, v4

    .line 1223
    check-cast v6, Lsm;

    .line 1224
    .line 1225
    iget-object v6, v6, Lsm;->s:Loe0;

    .line 1226
    .line 1227
    const/4 v7, 0x0

    .line 1228
    :goto_32
    if-eqz v6, :cond_53

    .line 1229
    .line 1230
    iget v8, v6, Loe0;->f:I

    .line 1231
    .line 1232
    and-int v8, v8, v24

    .line 1233
    .line 1234
    if-eqz v8, :cond_52

    .line 1235
    .line 1236
    add-int/lit8 v7, v7, 0x1

    .line 1237
    .line 1238
    const/4 v8, 0x1

    .line 1239
    if-ne v7, v8, :cond_4f

    .line 1240
    .line 1241
    move-object v4, v6

    .line 1242
    goto :goto_33

    .line 1243
    :cond_4f
    if-nez v5, :cond_50

    .line 1244
    .line 1245
    new-instance v5, Lsh0;

    .line 1246
    .line 1247
    move/from16 v8, v19

    .line 1248
    .line 1249
    new-array v10, v8, [Loe0;

    .line 1250
    .line 1251
    invoke-direct {v5, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 1252
    .line 1253
    .line 1254
    :cond_50
    if-eqz v4, :cond_51

    .line 1255
    .line 1256
    invoke-virtual {v5, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1257
    .line 1258
    .line 1259
    move-object/from16 v4, v17

    .line 1260
    .line 1261
    :cond_51
    invoke-virtual {v5, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1262
    .line 1263
    .line 1264
    :cond_52
    :goto_33
    iget-object v6, v6, Loe0;->i:Loe0;

    .line 1265
    .line 1266
    const/16 v19, 0x10

    .line 1267
    .line 1268
    const/high16 v24, 0x200000

    .line 1269
    .line 1270
    goto :goto_32

    .line 1271
    :cond_53
    const/4 v8, 0x1

    .line 1272
    if-ne v7, v8, :cond_54

    .line 1273
    .line 1274
    :goto_34
    const/16 v19, 0x10

    .line 1275
    .line 1276
    const/high16 v24, 0x200000

    .line 1277
    .line 1278
    goto :goto_31

    .line 1279
    :cond_54
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v4

    .line 1283
    goto :goto_34

    .line 1284
    :cond_55
    iget-object v2, v2, Loe0;->h:Loe0;

    .line 1285
    .line 1286
    const/16 v19, 0x10

    .line 1287
    .line 1288
    const/high16 v24, 0x200000

    .line 1289
    .line 1290
    goto :goto_30

    .line 1291
    :cond_56
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    if-eqz v0, :cond_57

    .line 1296
    .line 1297
    iget-object v2, v0, Lb60;->I:Lmj0;

    .line 1298
    .line 1299
    if-eqz v2, :cond_57

    .line 1300
    .line 1301
    iget-object v2, v2, Lmj0;->e:Ld61;

    .line 1302
    .line 1303
    goto :goto_35

    .line 1304
    :cond_57
    move-object/from16 v2, v17

    .line 1305
    .line 1306
    :goto_35
    const/16 v19, 0x10

    .line 1307
    .line 1308
    goto/16 :goto_2f

    .line 1309
    .line 1310
    :cond_58
    move-object/from16 v4, v17

    .line 1311
    .line 1312
    :goto_36
    check-cast v4, Lq10;

    .line 1313
    .line 1314
    goto :goto_37

    .line 1315
    :cond_59
    move-object/from16 v4, v17

    .line 1316
    .line 1317
    :goto_37
    if-eqz v4, :cond_6c

    .line 1318
    .line 1319
    move-object v0, v4

    .line 1320
    check-cast v0, Loe0;

    .line 1321
    .line 1322
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1323
    .line 1324
    iget-boolean v2, v2, Loe0;->q:Z

    .line 1325
    .line 1326
    if-nez v2, :cond_5a

    .line 1327
    .line 1328
    invoke-static/range {v23 .. v23}, Lw10;->b(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    :cond_5a
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 1332
    .line 1333
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 1334
    .line 1335
    invoke-static {v4}, Lpf1;->Q(Lrm;)Lb60;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    move-object/from16 v5, v17

    .line 1340
    .line 1341
    :goto_38
    if-eqz v2, :cond_66

    .line 1342
    .line 1343
    iget-object v6, v2, Lb60;->I:Lmj0;

    .line 1344
    .line 1345
    iget-object v6, v6, Lmj0;->f:Loe0;

    .line 1346
    .line 1347
    iget v6, v6, Loe0;->g:I

    .line 1348
    .line 1349
    const/high16 v24, 0x200000

    .line 1350
    .line 1351
    and-int v6, v6, v24

    .line 1352
    .line 1353
    if-eqz v6, :cond_64

    .line 1354
    .line 1355
    :goto_39
    if-eqz v0, :cond_64

    .line 1356
    .line 1357
    iget v6, v0, Loe0;->f:I

    .line 1358
    .line 1359
    and-int v6, v6, v24

    .line 1360
    .line 1361
    if-eqz v6, :cond_63

    .line 1362
    .line 1363
    move-object v6, v0

    .line 1364
    move-object/from16 v7, v17

    .line 1365
    .line 1366
    :goto_3a
    if-eqz v6, :cond_63

    .line 1367
    .line 1368
    instance-of v8, v6, Lq10;

    .line 1369
    .line 1370
    if-eqz v8, :cond_5c

    .line 1371
    .line 1372
    if-nez v5, :cond_5b

    .line 1373
    .line 1374
    new-instance v5, Ljava/util/ArrayList;

    .line 1375
    .line 1376
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1377
    .line 1378
    .line 1379
    :cond_5b
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    goto :goto_3d

    .line 1383
    :cond_5c
    iget v8, v6, Loe0;->f:I

    .line 1384
    .line 1385
    const/high16 v24, 0x200000

    .line 1386
    .line 1387
    and-int v8, v8, v24

    .line 1388
    .line 1389
    if-eqz v8, :cond_62

    .line 1390
    .line 1391
    instance-of v8, v6, Lsm;

    .line 1392
    .line 1393
    if-eqz v8, :cond_62

    .line 1394
    .line 1395
    move-object v8, v6

    .line 1396
    check-cast v8, Lsm;

    .line 1397
    .line 1398
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 1399
    .line 1400
    const/4 v10, 0x0

    .line 1401
    :goto_3b
    if-eqz v8, :cond_61

    .line 1402
    .line 1403
    iget v11, v8, Loe0;->f:I

    .line 1404
    .line 1405
    and-int v11, v11, v24

    .line 1406
    .line 1407
    if-eqz v11, :cond_60

    .line 1408
    .line 1409
    add-int/lit8 v10, v10, 0x1

    .line 1410
    .line 1411
    const/4 v11, 0x1

    .line 1412
    if-ne v10, v11, :cond_5d

    .line 1413
    .line 1414
    move-object v6, v8

    .line 1415
    goto :goto_3c

    .line 1416
    :cond_5d
    if-nez v7, :cond_5e

    .line 1417
    .line 1418
    new-instance v7, Lsh0;

    .line 1419
    .line 1420
    const/16 v11, 0x10

    .line 1421
    .line 1422
    new-array v12, v11, [Loe0;

    .line 1423
    .line 1424
    invoke-direct {v7, v12}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 1425
    .line 1426
    .line 1427
    :cond_5e
    if-eqz v6, :cond_5f

    .line 1428
    .line 1429
    invoke-virtual {v7, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    move-object/from16 v6, v17

    .line 1433
    .line 1434
    :cond_5f
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1435
    .line 1436
    .line 1437
    :cond_60
    :goto_3c
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 1438
    .line 1439
    const/high16 v24, 0x200000

    .line 1440
    .line 1441
    goto :goto_3b

    .line 1442
    :cond_61
    const/4 v8, 0x1

    .line 1443
    if-ne v10, v8, :cond_62

    .line 1444
    .line 1445
    goto :goto_3a

    .line 1446
    :cond_62
    :goto_3d
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v6

    .line 1450
    goto :goto_3a

    .line 1451
    :cond_63
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 1452
    .line 1453
    const/high16 v24, 0x200000

    .line 1454
    .line 1455
    goto :goto_39

    .line 1456
    :cond_64
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v2

    .line 1460
    if-eqz v2, :cond_65

    .line 1461
    .line 1462
    iget-object v0, v2, Lb60;->I:Lmj0;

    .line 1463
    .line 1464
    if-eqz v0, :cond_65

    .line 1465
    .line 1466
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 1467
    .line 1468
    goto :goto_38

    .line 1469
    :cond_65
    move-object/from16 v0, v17

    .line 1470
    .line 1471
    goto/16 :goto_38

    .line 1472
    .line 1473
    :cond_66
    sget-object v0, Ljr0;->d:Ljr0;

    .line 1474
    .line 1475
    if-eqz v5, :cond_68

    .line 1476
    .line 1477
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1478
    .line 1479
    .line 1480
    move-result v2

    .line 1481
    add-int/lit8 v2, v2, -0x1

    .line 1482
    .line 1483
    if-ltz v2, :cond_68

    .line 1484
    .line 1485
    :goto_3e
    add-int/lit8 v6, v2, -0x1

    .line 1486
    .line 1487
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v2

    .line 1491
    check-cast v2, Lq10;

    .line 1492
    .line 1493
    invoke-interface {v2, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1494
    .line 1495
    .line 1496
    if-gez v6, :cond_67

    .line 1497
    .line 1498
    goto :goto_3f

    .line 1499
    :cond_67
    move v2, v6

    .line 1500
    goto :goto_3e

    .line 1501
    :cond_68
    :goto_3f
    invoke-interface {v4, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1502
    .line 1503
    .line 1504
    sget-object v0, Ljr0;->e:Ljr0;

    .line 1505
    .line 1506
    invoke-interface {v4, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1507
    .line 1508
    .line 1509
    if-eqz v5, :cond_69

    .line 1510
    .line 1511
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1512
    .line 1513
    .line 1514
    move-result v2

    .line 1515
    const/4 v6, 0x0

    .line 1516
    :goto_40
    if-ge v6, v2, :cond_69

    .line 1517
    .line 1518
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v7

    .line 1522
    check-cast v7, Lq10;

    .line 1523
    .line 1524
    invoke-interface {v7, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1525
    .line 1526
    .line 1527
    add-int/lit8 v6, v6, 0x1

    .line 1528
    .line 1529
    goto :goto_40

    .line 1530
    :cond_69
    sget-object v0, Ljr0;->f:Ljr0;

    .line 1531
    .line 1532
    if-eqz v5, :cond_6b

    .line 1533
    .line 1534
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1535
    .line 1536
    .line 1537
    move-result v2

    .line 1538
    add-int/lit8 v2, v2, -0x1

    .line 1539
    .line 1540
    if-ltz v2, :cond_6b

    .line 1541
    .line 1542
    :goto_41
    add-int/lit8 v6, v2, -0x1

    .line 1543
    .line 1544
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v2

    .line 1548
    check-cast v2, Lq10;

    .line 1549
    .line 1550
    invoke-interface {v2, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1551
    .line 1552
    .line 1553
    if-gez v6, :cond_6a

    .line 1554
    .line 1555
    goto :goto_42

    .line 1556
    :cond_6a
    move v2, v6

    .line 1557
    goto :goto_41

    .line 1558
    :cond_6b
    :goto_42
    invoke-interface {v4, v3, v0}, Lq10;->u(Lu5;Ljr0;)V

    .line 1559
    .line 1560
    .line 1561
    :cond_6c
    iget-object v0, v3, Lu5;->b:Ljava/lang/Object;

    .line 1562
    .line 1563
    check-cast v0, Ljava/util/ArrayList;

    .line 1564
    .line 1565
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1566
    .line 1567
    .line 1568
    move-result v2

    .line 1569
    const/4 v4, 0x0

    .line 1570
    :goto_43
    if-ge v4, v2, :cond_4b

    .line 1571
    .line 1572
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v5

    .line 1576
    check-cast v5, Lh10;

    .line 1577
    .line 1578
    iget-boolean v5, v5, Lh10;->i:Z

    .line 1579
    .line 1580
    if-eqz v5, :cond_6d

    .line 1581
    .line 1582
    const/4 v0, 0x1

    .line 1583
    goto :goto_44

    .line 1584
    :cond_6d
    add-int/lit8 v4, v4, 0x1

    .line 1585
    .line 1586
    goto :goto_43

    .line 1587
    :goto_44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1588
    .line 1589
    .line 1590
    iget-object v2, v3, Lu5;->c:Ljava/lang/Object;

    .line 1591
    .line 1592
    check-cast v2, Landroid/view/MotionEvent;

    .line 1593
    .line 1594
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 1595
    .line 1596
    .line 1597
    move-result v4

    .line 1598
    if-eqz v4, :cond_6f

    .line 1599
    .line 1600
    const/4 v8, 0x1

    .line 1601
    if-eq v4, v8, :cond_6e

    .line 1602
    .line 1603
    const/4 v3, 0x2

    .line 1604
    if-eq v4, v3, :cond_6e

    .line 1605
    .line 1606
    goto :goto_45

    .line 1607
    :cond_6e
    if-eqz v0, :cond_70

    .line 1608
    .line 1609
    const/4 v9, 0x0

    .line 1610
    iput v9, v1, Ls10;->b:I

    .line 1611
    .line 1612
    iput-boolean v8, v1, Ls10;->c:Z

    .line 1613
    .line 1614
    goto :goto_45

    .line 1615
    :cond_6f
    const/4 v8, 0x1

    .line 1616
    const/4 v9, 0x0

    .line 1617
    iget v0, v3, Lu5;->a:I

    .line 1618
    .line 1619
    iput v0, v1, Ls10;->b:I

    .line 1620
    .line 1621
    iput-boolean v9, v1, Ls10;->c:Z

    .line 1622
    .line 1623
    :cond_70
    :goto_45
    iget-object v0, v1, Ls10;->d:Landroid/view/GestureDetector;

    .line 1624
    .line 1625
    invoke-virtual {v0, v2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1626
    .line 1627
    .line 1628
    return v8

    .line 1629
    :cond_71
    invoke-virtual {v0}, Lw3;->getFocusOwner()Lwu;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    check-cast v0, Lzu;

    .line 1634
    .line 1635
    invoke-virtual {v0}, Lzu;->f()Ldv;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v0

    .line 1639
    if-eqz v0, :cond_7e

    .line 1640
    .line 1641
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1642
    .line 1643
    iget-boolean v2, v2, Loe0;->q:Z

    .line 1644
    .line 1645
    if-nez v2, :cond_72

    .line 1646
    .line 1647
    invoke-static/range {v23 .. v23}, Lw10;->b(Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    :cond_72
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1651
    .line 1652
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    :goto_46
    if-eqz v0, :cond_7d

    .line 1657
    .line 1658
    iget-object v3, v0, Lb60;->I:Lmj0;

    .line 1659
    .line 1660
    iget-object v3, v3, Lmj0;->f:Loe0;

    .line 1661
    .line 1662
    iget v3, v3, Loe0;->g:I

    .line 1663
    .line 1664
    const/high16 v24, 0x200000

    .line 1665
    .line 1666
    and-int v3, v3, v24

    .line 1667
    .line 1668
    if-eqz v3, :cond_7b

    .line 1669
    .line 1670
    :goto_47
    if-eqz v2, :cond_7b

    .line 1671
    .line 1672
    iget v3, v2, Loe0;->f:I

    .line 1673
    .line 1674
    and-int v3, v3, v24

    .line 1675
    .line 1676
    if-eqz v3, :cond_7a

    .line 1677
    .line 1678
    move-object v3, v2

    .line 1679
    move-object/from16 v4, v17

    .line 1680
    .line 1681
    :goto_48
    if-eqz v3, :cond_7a

    .line 1682
    .line 1683
    instance-of v5, v3, Lq10;

    .line 1684
    .line 1685
    if-eqz v5, :cond_73

    .line 1686
    .line 1687
    goto :goto_4c

    .line 1688
    :cond_73
    iget v5, v3, Loe0;->f:I

    .line 1689
    .line 1690
    and-int v5, v5, v24

    .line 1691
    .line 1692
    if-eqz v5, :cond_79

    .line 1693
    .line 1694
    instance-of v5, v3, Lsm;

    .line 1695
    .line 1696
    if-eqz v5, :cond_79

    .line 1697
    .line 1698
    move-object v5, v3

    .line 1699
    check-cast v5, Lsm;

    .line 1700
    .line 1701
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 1702
    .line 1703
    const/4 v6, 0x0

    .line 1704
    :goto_49
    if-eqz v5, :cond_78

    .line 1705
    .line 1706
    iget v7, v5, Loe0;->f:I

    .line 1707
    .line 1708
    and-int v7, v7, v24

    .line 1709
    .line 1710
    if-eqz v7, :cond_77

    .line 1711
    .line 1712
    add-int/lit8 v6, v6, 0x1

    .line 1713
    .line 1714
    const/4 v8, 0x1

    .line 1715
    if-ne v6, v8, :cond_74

    .line 1716
    .line 1717
    move-object v3, v5

    .line 1718
    goto :goto_4a

    .line 1719
    :cond_74
    if-nez v4, :cond_75

    .line 1720
    .line 1721
    new-instance v4, Lsh0;

    .line 1722
    .line 1723
    const/16 v8, 0x10

    .line 1724
    .line 1725
    new-array v7, v8, [Loe0;

    .line 1726
    .line 1727
    invoke-direct {v4, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 1728
    .line 1729
    .line 1730
    :cond_75
    if-eqz v3, :cond_76

    .line 1731
    .line 1732
    invoke-virtual {v4, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1733
    .line 1734
    .line 1735
    move-object/from16 v3, v17

    .line 1736
    .line 1737
    :cond_76
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1738
    .line 1739
    .line 1740
    :cond_77
    :goto_4a
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 1741
    .line 1742
    const/high16 v24, 0x200000

    .line 1743
    .line 1744
    goto :goto_49

    .line 1745
    :cond_78
    const/4 v8, 0x1

    .line 1746
    if-ne v6, v8, :cond_79

    .line 1747
    .line 1748
    :goto_4b
    const/high16 v24, 0x200000

    .line 1749
    .line 1750
    goto :goto_48

    .line 1751
    :cond_79
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v3

    .line 1755
    goto :goto_4b

    .line 1756
    :cond_7a
    iget-object v2, v2, Loe0;->h:Loe0;

    .line 1757
    .line 1758
    const/high16 v24, 0x200000

    .line 1759
    .line 1760
    goto :goto_47

    .line 1761
    :cond_7b
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    if-eqz v0, :cond_7c

    .line 1766
    .line 1767
    iget-object v2, v0, Lb60;->I:Lmj0;

    .line 1768
    .line 1769
    if-eqz v2, :cond_7c

    .line 1770
    .line 1771
    iget-object v2, v2, Lmj0;->e:Ld61;

    .line 1772
    .line 1773
    goto :goto_46

    .line 1774
    :cond_7c
    move-object/from16 v2, v17

    .line 1775
    .line 1776
    goto :goto_46

    .line 1777
    :cond_7d
    move-object/from16 v3, v17

    .line 1778
    .line 1779
    :goto_4c
    check-cast v3, Lq10;

    .line 1780
    .line 1781
    goto :goto_4d

    .line 1782
    :cond_7e
    move-object/from16 v3, v17

    .line 1783
    .line 1784
    :goto_4d
    if-eqz v3, :cond_8d

    .line 1785
    .line 1786
    move-object v0, v3

    .line 1787
    check-cast v0, Loe0;

    .line 1788
    .line 1789
    iget-object v2, v0, Loe0;->d:Loe0;

    .line 1790
    .line 1791
    iget-boolean v2, v2, Loe0;->q:Z

    .line 1792
    .line 1793
    if-nez v2, :cond_7f

    .line 1794
    .line 1795
    invoke-static/range {v23 .. v23}, Lw10;->b(Ljava/lang/String;)V

    .line 1796
    .line 1797
    .line 1798
    :cond_7f
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 1799
    .line 1800
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 1801
    .line 1802
    invoke-static {v3}, Lpf1;->Q(Lrm;)Lb60;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v2

    .line 1806
    move-object/from16 v4, v17

    .line 1807
    .line 1808
    :goto_4e
    if-eqz v2, :cond_8c

    .line 1809
    .line 1810
    iget-object v5, v2, Lb60;->I:Lmj0;

    .line 1811
    .line 1812
    iget-object v5, v5, Lmj0;->f:Loe0;

    .line 1813
    .line 1814
    iget v5, v5, Loe0;->g:I

    .line 1815
    .line 1816
    const/high16 v24, 0x200000

    .line 1817
    .line 1818
    and-int v5, v5, v24

    .line 1819
    .line 1820
    if-eqz v5, :cond_8a

    .line 1821
    .line 1822
    :goto_4f
    if-eqz v0, :cond_8a

    .line 1823
    .line 1824
    iget v5, v0, Loe0;->f:I

    .line 1825
    .line 1826
    and-int v5, v5, v24

    .line 1827
    .line 1828
    if-eqz v5, :cond_89

    .line 1829
    .line 1830
    move-object v5, v0

    .line 1831
    move-object/from16 v6, v17

    .line 1832
    .line 1833
    :goto_50
    if-eqz v5, :cond_89

    .line 1834
    .line 1835
    instance-of v7, v5, Lq10;

    .line 1836
    .line 1837
    if-eqz v7, :cond_81

    .line 1838
    .line 1839
    if-nez v4, :cond_80

    .line 1840
    .line 1841
    new-instance v4, Ljava/util/ArrayList;

    .line 1842
    .line 1843
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1844
    .line 1845
    .line 1846
    :cond_80
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1847
    .line 1848
    .line 1849
    const/16 v11, 0x10

    .line 1850
    .line 1851
    const/high16 v24, 0x200000

    .line 1852
    .line 1853
    goto :goto_54

    .line 1854
    :cond_81
    iget v7, v5, Loe0;->f:I

    .line 1855
    .line 1856
    const/high16 v24, 0x200000

    .line 1857
    .line 1858
    and-int v7, v7, v24

    .line 1859
    .line 1860
    if-eqz v7, :cond_87

    .line 1861
    .line 1862
    instance-of v7, v5, Lsm;

    .line 1863
    .line 1864
    if-eqz v7, :cond_87

    .line 1865
    .line 1866
    move-object v7, v5

    .line 1867
    check-cast v7, Lsm;

    .line 1868
    .line 1869
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 1870
    .line 1871
    const/4 v8, 0x0

    .line 1872
    :goto_51
    if-eqz v7, :cond_86

    .line 1873
    .line 1874
    iget v10, v7, Loe0;->f:I

    .line 1875
    .line 1876
    and-int v10, v10, v24

    .line 1877
    .line 1878
    if-eqz v10, :cond_82

    .line 1879
    .line 1880
    add-int/lit8 v8, v8, 0x1

    .line 1881
    .line 1882
    const/4 v11, 0x1

    .line 1883
    if-ne v8, v11, :cond_83

    .line 1884
    .line 1885
    move-object v5, v7

    .line 1886
    :cond_82
    const/16 v11, 0x10

    .line 1887
    .line 1888
    goto :goto_53

    .line 1889
    :cond_83
    if-nez v6, :cond_84

    .line 1890
    .line 1891
    new-instance v6, Lsh0;

    .line 1892
    .line 1893
    const/16 v11, 0x10

    .line 1894
    .line 1895
    new-array v10, v11, [Loe0;

    .line 1896
    .line 1897
    invoke-direct {v6, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 1898
    .line 1899
    .line 1900
    goto :goto_52

    .line 1901
    :cond_84
    const/16 v11, 0x10

    .line 1902
    .line 1903
    :goto_52
    if-eqz v5, :cond_85

    .line 1904
    .line 1905
    invoke-virtual {v6, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1906
    .line 1907
    .line 1908
    move-object/from16 v5, v17

    .line 1909
    .line 1910
    :cond_85
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1911
    .line 1912
    .line 1913
    :goto_53
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 1914
    .line 1915
    goto :goto_51

    .line 1916
    :cond_86
    const/4 v7, 0x1

    .line 1917
    const/16 v11, 0x10

    .line 1918
    .line 1919
    if-ne v8, v7, :cond_88

    .line 1920
    .line 1921
    goto :goto_50

    .line 1922
    :cond_87
    const/16 v11, 0x10

    .line 1923
    .line 1924
    :cond_88
    :goto_54
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v5

    .line 1928
    goto :goto_50

    .line 1929
    :cond_89
    const/16 v11, 0x10

    .line 1930
    .line 1931
    const/high16 v24, 0x200000

    .line 1932
    .line 1933
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 1934
    .line 1935
    goto :goto_4f

    .line 1936
    :cond_8a
    const/16 v11, 0x10

    .line 1937
    .line 1938
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v2

    .line 1942
    if-eqz v2, :cond_8b

    .line 1943
    .line 1944
    iget-object v0, v2, Lb60;->I:Lmj0;

    .line 1945
    .line 1946
    if-eqz v0, :cond_8b

    .line 1947
    .line 1948
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 1949
    .line 1950
    goto/16 :goto_4e

    .line 1951
    .line 1952
    :cond_8b
    move-object/from16 v0, v17

    .line 1953
    .line 1954
    goto/16 :goto_4e

    .line 1955
    .line 1956
    :cond_8c
    invoke-interface {v3}, Lq10;->r()V

    .line 1957
    .line 1958
    .line 1959
    if-eqz v4, :cond_8d

    .line 1960
    .line 1961
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1962
    .line 1963
    .line 1964
    move-result v0

    .line 1965
    const/4 v2, 0x0

    .line 1966
    :goto_55
    if-ge v2, v0, :cond_8d

    .line 1967
    .line 1968
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v3

    .line 1972
    check-cast v3, Lq10;

    .line 1973
    .line 1974
    invoke-interface {v3}, Lq10;->r()V

    .line 1975
    .line 1976
    .line 1977
    add-int/lit8 v2, v2, 0x1

    .line 1978
    .line 1979
    goto :goto_55

    .line 1980
    :cond_8d
    const/4 v9, 0x0

    .line 1981
    iput v9, v1, Ls10;->b:I

    .line 1982
    .line 1983
    const/4 v8, 0x1

    .line 1984
    iput-boolean v8, v1, Ls10;->c:Z

    .line 1985
    .line 1986
    return v8

    .line 1987
    :cond_8e
    const-string v0, "changes cannot be empty"

    .line 1988
    .line 1989
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 1990
    .line 1991
    .line 1992
    throw v17

    .line 1993
    :cond_8f
    const/4 v9, 0x0

    .line 1994
    const-string v0, "MotionEvent must be a touch navigation source"

    .line 1995
    .line 1996
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 1997
    .line 1998
    .line 1999
    return v9

    .line 2000
    :cond_90
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2001
    .line 2002
    .line 2003
    move-result v0

    .line 2004
    return v0

    .line 2005
    :cond_91
    :goto_56
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2006
    .line 2007
    .line 2008
    move-result v0

    .line 2009
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
    iget-boolean v2, v0, Lw3;->C0:Z

    .line 6
    .line 7
    iget-object v3, v0, Lw3;->B0:Lg3;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Lg3;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, Lw3;->o(Landroid/view/MotionEvent;)Z

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
    iget-object v2, v0, Lw3;->B:Lc4;

    .line 33
    .line 34
    iget-object v5, v2, Lc4;->g:Lw3;

    .line 35
    .line 36
    iget-object v6, v2, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

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
    iget v6, v2, Lc4;->h:I

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
    iput v14, v2, Lc4;->h:I

    .line 86
    .line 87
    invoke-static {v2, v14, v11, v12, v13}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v6, v7, v12, v13}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v5}, Lw3;->getAndroidViewsHandler$ui()Lw6;

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
    invoke-virtual {v5, v10}, Lw3;->s(Z)V

    .line 113
    .line 114
    .line 115
    new-instance v20, Lpy;

    .line 116
    .line 117
    invoke-direct/range {v20 .. v20}, Lpy;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Lw3;->getRoot()Lb60;

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
    iget-object v8, v14, Lb60;->I:Lmj0;

    .line 150
    .line 151
    iget-object v9, v8, Lmj0;->d:Lqj0;

    .line 152
    .line 153
    sget-object v14, Lqj0;->P:Lgv0;

    .line 154
    .line 155
    invoke-virtual {v9, v6, v7}, Lqj0;->D0(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    iget-object v6, v8, Lmj0;->d:Lqj0;

    .line 160
    .line 161
    sget-object v17, Lqj0;->S:Lr3;

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
    invoke-virtual/range {v16 .. v22}, Lqj0;->L0(Lr3;JLpy;IZ)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v6, v20

    .line 173
    .line 174
    iget-object v6, v6, Lpy;->d:Ldh0;

    .line 175
    .line 176
    iget v7, v6, Ldh0;->b:I

    .line 177
    .line 178
    sub-int/2addr v7, v10

    .line 179
    :goto_0
    const/4 v8, -0x1

    .line 180
    if-ge v8, v7, :cond_a

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Ldh0;->f(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast v8, Loe0;

    .line 190
    .line 191
    invoke-static {v8}, Lpf1;->Q(Lrm;)Lb60;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-virtual {v5}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    invoke-virtual {v9}, Lw6;->getLayoutNodeToHolder()Ljava/util/HashMap;

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
    if-nez v9, :cond_9

    .line 208
    .line 209
    iget-object v9, v8, Lb60;->I:Lmj0;

    .line 210
    .line 211
    const/16 v14, 0x8

    .line 212
    .line 213
    invoke-virtual {v9, v14}, Lmj0;->d(I)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-nez v9, :cond_6

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_6
    iget v9, v8, Lb60;->e:I

    .line 221
    .line 222
    invoke-virtual {v2, v9}, Lc4;->s(I)I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    invoke-static {v8, v4}, Lj50;->c(Lb60;Z)Lxz0;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-static {v8}, Li4;->v(Lxz0;)Z

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    if-nez v14, :cond_7

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_7
    invoke-virtual {v8}, Lxz0;->k()Lsz0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    sget-object v14, Lb01;->z:Le01;

    .line 242
    .line 243
    iget-object v8, v8, Lsz0;->d:Ljh0;

    .line 244
    .line 245
    invoke-virtual {v8, v14}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_8

    .line 250
    .line 251
    :goto_1
    add-int/lit8 v7, v7, -0x1

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_8
    move v14, v9

    .line 255
    goto :goto_2

    .line 256
    :cond_9
    invoke-static {}, Lxc;->d()V

    .line 257
    .line 258
    .line 259
    return v4

    .line 260
    :cond_a
    const/high16 v14, -0x80000000

    .line 261
    .line 262
    :goto_2
    invoke-virtual {v5}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 267
    .line 268
    .line 269
    iget v5, v2, Lc4;->h:I

    .line 270
    .line 271
    if-ne v5, v14, :cond_b

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_b
    iput v14, v2, Lc4;->h:I

    .line 275
    .line 276
    invoke-static {v2, v14, v11, v12, v13}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 277
    .line 278
    .line 279
    const/16 v15, 0x100

    .line 280
    .line 281
    invoke-static {v2, v5, v15, v12, v13}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 282
    .line 283
    .line 284
    :cond_c
    :goto_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    const/4 v5, 0x7

    .line 289
    if-eq v2, v5, :cond_10

    .line 290
    .line 291
    const/16 v5, 0xa

    .line 292
    .line 293
    if-eq v2, v5, :cond_d

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_d
    invoke-virtual/range {p0 .. p1}, Lw3;->p(Landroid/view/MotionEvent;)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_11

    .line 301
    .line 302
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    const/4 v5, 0x3

    .line 307
    if-ne v2, v5, :cond_e

    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_e

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_e
    iget-object v2, v0, Lw3;->u0:Landroid/view/MotionEvent;

    .line 317
    .line 318
    if-eqz v2, :cond_f

    .line 319
    .line 320
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 321
    .line 322
    .line 323
    :cond_f
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iput-object v1, v0, Lw3;->u0:Landroid/view/MotionEvent;

    .line 328
    .line 329
    iput-boolean v10, v0, Lw3;->C0:Z

    .line 330
    .line 331
    const-wide/16 v1, 0x8

    .line 332
    .line 333
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 334
    .line 335
    .line 336
    return v4

    .line 337
    :cond_10
    invoke-virtual/range {p0 .. p1}, Lw3;->q(Landroid/view/MotionEvent;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-nez v2, :cond_11

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_11
    :goto_4
    invoke-virtual/range {p0 .. p1}, Lw3;->l(Landroid/view/MotionEvent;)I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    and-int/2addr v0, v10

    .line 349
    if-eqz v0, :cond_12

    .line 350
    .line 351
    return v10

    .line 352
    :cond_12
    :goto_5
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v2, p0, Lw3;->s:Li90;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Led1;->a:Lgp0;

    .line 18
    .line 19
    new-instance v3, Lsr0;

    .line 20
    .line 21
    invoke-direct {v3, v0}, Lsr0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v2, Lcj;->h:Lcj;

    .line 32
    .line 33
    check-cast v0, Lzu;

    .line 34
    .line 35
    invoke-virtual {v0, p1, v2}, Lzu;->d(Landroid/view/KeyEvent;Lhw;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return v1

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_2
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v2, Lm3;

    .line 56
    .line 57
    invoke-direct {v2, v1, p0, p1}, Lm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast v0, Lzu;

    .line 61
    .line 62
    invoke-virtual {v0, p1, v2}, Lzu;->d(Landroid/view/KeyEvent;Lhw;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lzu;

    .line 14
    .line 15
    iget-object v3, v0, Lzu;->d:Luu;

    .line 16
    .line 17
    iget-boolean v3, v3, Luu;->e:Z

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
    iget-object v0, v0, Lzu;->c:Ldv;

    .line 31
    .line 32
    invoke-static {v0}, Li4;->n(Ldv;)Ldv;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v3, v0, Loe0;->d:Loe0;

    .line 39
    .line 40
    iget-boolean v3, v3, Loe0;->q:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const-string v3, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v3}, Lw10;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, Loe0;->d:Loe0;

    .line 50
    .line 51
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_b

    .line 56
    .line 57
    iget-object v4, v0, Lb60;->I:Lmj0;

    .line 58
    .line 59
    iget-object v4, v4, Lmj0;->f:Loe0;

    .line 60
    .line 61
    iget v4, v4, Loe0;->g:I

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
    iget v4, v3, Loe0;->f:I

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
    iget v8, v4, Loe0;->f:I

    .line 81
    .line 82
    and-int/2addr v8, v5

    .line 83
    if-eqz v8, :cond_7

    .line 84
    .line 85
    instance-of v8, v4, Lsm;

    .line 86
    .line 87
    if-eqz v8, :cond_7

    .line 88
    .line 89
    move-object v8, v4

    .line 90
    check-cast v8, Lsm;

    .line 91
    .line 92
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 93
    .line 94
    move v9, v1

    .line 95
    :goto_3
    if-eqz v8, :cond_6

    .line 96
    .line 97
    iget v10, v8, Loe0;->f:I

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
    new-instance v7, Lsh0;

    .line 111
    .line 112
    const/16 v10, 0x10

    .line 113
    .line 114
    new-array v10, v10, [Loe0;

    .line 115
    .line 116
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v7, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v4, v6

    .line 125
    :cond_4
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_4
    iget-object v8, v8, Loe0;->i:Loe0;

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
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    iget-object v3, v0, Lb60;->I:Lmj0;

    .line 149
    .line 150
    if-eqz v3, :cond_a

    .line 151
    .line 152
    iget-object v3, v3, Lmj0;->e:Ld61;

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
    iget-boolean v0, p0, Lw3;->C0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lw3;->B0:Lg3;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lw3;->u0:Landroid/view/MotionEvent;

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
    iput-boolean v1, p0, Lw3;->C0:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lg3;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, Lw3;->o(Landroid/view/MotionEvent;)Z

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
    invoke-virtual {p0, p1}, Lw3;->q(Landroid/view/MotionEvent;)Z

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
    invoke-virtual {p0, p1}, Lw3;->l(Landroid/view/MotionEvent;)I

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
    const v4, 0x7f06002d

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
    new-instance v2, Lh9;

    .line 160
    .line 161
    invoke-direct {v2, v3}, Lh9;-><init>(I)V

    .line 162
    .line 163
    .line 164
    :cond_c
    new-instance v4, Lh9;

    .line 165
    .line 166
    invoke-direct {v4, v3}, Lh9;-><init>(I)V

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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Lzu;

    .line 180
    .line 181
    invoke-virtual {v2}, Lzu;->f()Ldv;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_11

    .line 186
    .line 187
    invoke-static {v2}, Lpf1;->P(Lrm;)Lqj0;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, Lj50;->l(Li50;)Li50;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v4, v2, v3}, Li50;->B(Li50;Z)Lst0;

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
    iget v5, v2, Lst0;->a:F

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
    iget v6, v2, Lst0;->c:F

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
    iget v5, v2, Lst0;->b:F

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
    iget v2, v2, Lst0;->d:F

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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Lzu;

    .line 286
    .line 287
    const/16 p1, 0x8

    .line 288
    .line 289
    invoke-virtual {p0, p1, v1, v3}, Lzu;->b(IZZ)Z

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
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lud0;->c:Z

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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lzu;

    .line 60
    .line 61
    iget-object v2, v2, Lzu;->c:Ldv;

    .line 62
    .line 63
    invoke-static {v2}, Li4;->n(Ldv;)Ldv;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-static {v2}, Li4;->o(Ldv;)Lst0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :cond_4
    if-nez v1, :cond_6

    .line 74
    .line 75
    invoke-static {p1, p0}, Ltu;->a(Landroid/view/View;Lw3;)Lst0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-static {p1, p0}, Ltu;->a(Landroid/view/View;Lw3;)Lst0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :cond_6
    :goto_3
    invoke-static {p2}, Ltu;->b(I)Lqu;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_7

    .line 89
    .line 90
    iget v2, v2, Lqu;->a:I

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    const/4 v2, 0x6

    .line 94
    :goto_4
    new-instance v3, Lzt0;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-instance v5, Lo3;

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-direct {v5, v6, v3}, Lo3;-><init>(ILzt0;)V

    .line 107
    .line 108
    .line 109
    check-cast v4, Lzu;

    .line 110
    .line 111
    invoke-virtual {v4, v2, v1, v5}, Lzu;->e(ILst0;Lsw;)Ljava/lang/Boolean;

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
    iget-object v3, v3, Lzt0;->d:Ljava/lang/Object;

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
    check-cast v3, Ldv;

    .line 141
    .line 142
    invoke-static {v3}, Li4;->o(Ldv;)Lst0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {v0, p0}, Ltu;->a(Landroid/view/View;Lw3;)Lst0;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-static {p1, p2, v1, v2}, Lz60;->E(Lst0;Lst0;Lst0;I)Z

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

.method public getAccessibilityManager()Lw2;
    .locals 0

    .line 6
    iget-object p0, p0, Lw3;->D:Lw2;

    return-object p0
.end method

.method public bridge synthetic getAccessibilityManager()Lx0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->getAccessibilityManager()Lw2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getAndroidViewsHandler$ui()Lw6;
    .locals 2

    .line 1
    iget-object v0, p0, Lw3;->S:Lw6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw6;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lw6;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lw3;->S:Lw6;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Lw3;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Lw3;->S:Lw6;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public getAutofill()Li9;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->M:Ly2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAutofillManager()Lk9;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->N:La3;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAutofillTree()Ll9;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->F:Ll9;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClipboard()Ld3;
    .locals 0

    .line 6
    iget-object p0, p0, Lw3;->Q:Ld3;

    return-object p0
.end method

.method public bridge synthetic getClipboard()Lse;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->getClipboard()Ld3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getClipboardManager()Le3;
    .locals 0

    .line 6
    iget-object p0, p0, Lw3;->P:Le3;

    return-object p0
.end method

.method public bridge synthetic getClipboardManager()Lte;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->getClipboardManager()Le3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getConfiguration()Landroid/content/res/Configuration;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->L:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

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

.method public final getContentCaptureManager$ui()Lv4;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->C:Lv4;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCoroutineContext()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->q:Lpk;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDensity()Lym;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->m:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lym;

    .line 8
    .line 9
    return-object p0
.end method

.method public getDragAndDropManager()Lf5;
    .locals 0

    .line 6
    iget-object p0, p0, Lw3;->r:Lf5;

    return-object p0
.end method

.method public bridge synthetic getDragAndDropManager()Lqp;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->getDragAndDropManager()Lf5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getEmbeddedViewFocusRect()Lst0;
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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lzu;

    .line 13
    .line 14
    iget-object p0, p0, Lzu;->c:Ldv;

    .line 15
    .line 16
    invoke-static {p0}, Li4;->n(Ldv;)Ldv;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Li4;->o(Ldv;)Lst0;

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
    invoke-static {v0, p0}, Ltu;->a(Landroid/view/View;Lw3;)Lst0;

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

.method public getFocusOwner()Lwu;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->p:Lzu;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw3;->getEmbeddedViewFocusRect()Lst0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, v0, Lst0;->a:F

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
    iget p0, v0, Lst0;->b:F

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
    iget p0, v0, Lst0;->c:F

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
    iget p0, v0, Lst0;->d:F

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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Lp3;->e:Lp3;

    .line 45
    .line 46
    check-cast v0, Lzu;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Lzu;->e(ILst0;Lsw;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public getFontFamilyResolver()Ljv;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->o0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljv;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFontLoader()Liv;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->n0:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFrameEndScheduler$ui()Laa0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->h:Laa0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGraphicsContext()Lux;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->E:Ls5;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHapticFeedBack()Ljy;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->q0:Lyl;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    iget-object v0, v0, Lud0;->b:Lo8;

    .line 4
    .line 5
    invoke-virtual {v0}, Lo8;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lw3;->k:Lx8;

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

.method public getInputModeManager()Lg20;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->r0:Lh20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInsetsListener()Ll20;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->v:Ll20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw3;->d0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()Lk50;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->p0:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lk50;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getLayoutNodes()Lu20;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->getLayoutNodes()Lug0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getLayoutNodes()Lug0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lug0;"
        }
    .end annotation

    .line 6
    iget-object p0, p0, Lw3;->x:Lug0;

    return-object p0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object p0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    iget-boolean v0, p0, Lud0;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {v0}, Lw10;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lud0;->g:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()Lqe0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->s0:Lqe0;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getOutOfFrameExecutor()Lvm0;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lw3;->getOutOfFrameExecutor()Lw3;

    move-result-object p0

    return-object p0
.end method

.method public getOutOfFrameExecutor()Lw3;
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

.method public getPlacementScope()Lwq0;
    .locals 2

    .line 1
    sget v0, Lyq0;->b:I

    .line 2
    .line 3
    new-instance v0, Lzb0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1, p0}, Lzb0;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public getPointerIconService()Lmr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->J0:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui()Lg10;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->f:Lg10;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRectManager()Lut0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->y:Lut0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetainedValuesStore()Lfv0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->j:Lfv0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRoot()Lb60;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->w:Lb60;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRootForTest()Lzv0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->z:Lw3;

    .line 2
    .line 3
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
    iget-object p0, p0, Lw3;->H0:Li90;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Li90;->a:Lgp0;

    .line 12
    .line 13
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

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

.method public getSemanticsOwner()La01;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->A:La01;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSharedDrawScope()Ld60;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->g:Ld60;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    .line 1
    sget-object v0, Ll8;->a:Ll8;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ll8;->a(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSnapshotObserver()Lfn0;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->R:Lfn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSoftwareKeyboardController()Lf31;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->m0:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTextInputService()La71;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->k0:La71;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTextToolbar()Lt71;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->t0:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUncaughtExceptionHandler$ui()Lyv0;
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

.method public getViewConfiguration()Lnc1;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->u:Lu6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getViewTreeOwners()Lk3;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->h0:Ldn;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lk3;

    .line 8
    .line 9
    return-object p0
.end method

.method public getWindowInfo()Ldd1;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->s:Li90;

    .line 2
    .line 3
    return-object p0
.end method

.method public final get_autofillManager$ui()La3;
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->N:La3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lb60;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lud0;->f(Lb60;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lw3;->A0:Lu3;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lw3;->A(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, Lw3;->e0:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Lw3;->s(Z)V

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
    iget-object v2, v1, Lw3;->u0:Landroid/view/MotionEvent;

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
    goto/16 :goto_e

    .line 46
    .line 47
    :goto_0
    const/16 v12, 0xa

    .line 48
    .line 49
    iget-object v13, v1, Lw3;->K:Lfe;

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
    invoke-virtual/range {v1 .. v6}, Lw3;->F(Landroid/view/MotionEvent;IJZ)V

    .line 115
    .line 116
    .line 117
    move-object v14, v2

    .line 118
    goto :goto_5

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    move-object/from16 v1, p0

    .line 121
    .line 122
    goto/16 :goto_e

    .line 123
    .line 124
    :cond_5
    move-object v14, v2

    .line 125
    goto :goto_5

    .line 126
    :goto_3
    iget-boolean v1, v13, Lfe;->a:Z

    .line 127
    .line 128
    if-nez v1, :cond_7

    .line 129
    .line 130
    iget-object v1, v13, Lfe;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lx1;

    .line 133
    .line 134
    iget-object v1, v1, Lx1;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lub0;

    .line 137
    .line 138
    iget v2, v1, Lub0;->g:I

    .line 139
    .line 140
    iget-object v3, v1, Lub0;->f:[Ljava/lang/Object;

    .line 141
    .line 142
    move v4, v7

    .line 143
    :goto_4
    if-ge v4, v2, :cond_6

    .line 144
    .line 145
    const/4 v5, 0x0

    .line 146
    aput-object v5, v3, v4

    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    iput v7, v1, Lub0;->g:I

    .line 152
    .line 153
    iput-boolean v7, v1, Lub0;->d:Z

    .line 154
    .line 155
    iget-object v1, v13, Lfe;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lmy;

    .line 158
    .line 159
    invoke-virtual {v1}, Lmy;->c()V

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_5
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-ne v1, v10, :cond_8

    .line 167
    .line 168
    move v1, v8

    .line 169
    goto :goto_6

    .line 170
    :cond_8
    move v1, v7

    .line 171
    :goto_6
    const/16 v15, 0x9

    .line 172
    .line 173
    if-nez v11, :cond_9

    .line 174
    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    if-eq v9, v10, :cond_9

    .line 178
    .line 179
    if-eq v9, v15, :cond_9

    .line 180
    .line 181
    invoke-virtual/range {p0 .. p1}, Lw3;->p(Landroid/view/MotionEvent;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 188
    .line 189
    .line 190
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    const/4 v6, 0x1

    .line 192
    const/16 v3, 0x9

    .line 193
    .line 194
    move-object/from16 v1, p0

    .line 195
    .line 196
    move-object v2, v0

    .line 197
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lw3;->F(Landroid/view/MotionEvent;IJZ)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_9
    move-object/from16 v1, p0

    .line 202
    .line 203
    :goto_7
    if-eqz v14, :cond_a

    .line 204
    .line 205
    invoke-virtual {v14}, Landroid/view/MotionEvent;->recycle()V

    .line 206
    .line 207
    .line 208
    :cond_a
    iget-object v0, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 209
    .line 210
    if-eqz v0, :cond_15

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-ne v0, v12, :cond_15

    .line 217
    .line 218
    iget-object v0, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 219
    .line 220
    if-eqz v0, :cond_b

    .line 221
    .line 222
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    goto :goto_8

    .line 227
    :cond_b
    const/4 v0, -0x1

    .line 228
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 229
    .line 230
    .line 231
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 232
    iget-object v3, v1, Lw3;->J:Lag0;

    .line 233
    .line 234
    if-ne v2, v15, :cond_c

    .line 235
    .line 236
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-nez v2, :cond_c

    .line 241
    .line 242
    if-ltz v0, :cond_15

    .line 243
    .line 244
    iget-object v2, v3, Lag0;->c:Landroid/util/SparseBooleanArray;

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 247
    .line 248
    .line 249
    iget-object v2, v3, Lag0;->b:Landroid/util/SparseLongArray;

    .line 250
    .line 251
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_d

    .line 255
    .line 256
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-nez v2, :cond_15

    .line 261
    .line 262
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-nez v2, :cond_15

    .line 267
    .line 268
    iget-object v2, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 269
    .line 270
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 271
    .line 272
    if-eqz v2, :cond_d

    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    goto :goto_9

    .line 279
    :cond_d
    move v2, v4

    .line 280
    :goto_9
    iget-object v5, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 281
    .line 282
    if-eqz v5, :cond_e

    .line 283
    .line 284
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    cmpg-float v2, v2, v5

    .line 297
    .line 298
    if-nez v2, :cond_f

    .line 299
    .line 300
    cmpg-float v2, v4, v6

    .line 301
    .line 302
    if-nez v2, :cond_f

    .line 303
    .line 304
    move v2, v7

    .line 305
    goto :goto_a

    .line 306
    :cond_f
    move v2, v8

    .line 307
    :goto_a
    iget-object v4, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 308
    .line 309
    if-eqz v4, :cond_10

    .line 310
    .line 311
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getEventTime()J

    .line 312
    .line 313
    .line 314
    move-result-wide v4

    .line 315
    goto :goto_b

    .line 316
    :cond_10
    const-wide/16 v4, -0x1

    .line 317
    .line 318
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 319
    .line 320
    .line 321
    move-result-wide v9

    .line 322
    cmp-long v4, v4, v9

    .line 323
    .line 324
    if-eqz v4, :cond_11

    .line 325
    .line 326
    move v4, v8

    .line 327
    goto :goto_c

    .line 328
    :cond_11
    move v4, v7

    .line 329
    :goto_c
    if-nez v2, :cond_12

    .line 330
    .line 331
    if-eqz v4, :cond_15

    .line 332
    .line 333
    :cond_12
    if-ltz v0, :cond_13

    .line 334
    .line 335
    iget-object v2, v3, Lag0;->c:Landroid/util/SparseBooleanArray;

    .line 336
    .line 337
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 338
    .line 339
    .line 340
    iget-object v2, v3, Lag0;->b:Landroid/util/SparseLongArray;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 343
    .line 344
    .line 345
    :cond_13
    iget-object v0, v13, Lfe;->c:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lmy;

    .line 348
    .line 349
    iget-boolean v2, v0, Lmy;->d:Z

    .line 350
    .line 351
    if-eqz v2, :cond_14

    .line 352
    .line 353
    iput-boolean v8, v0, Lmy;->d:Z

    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_14
    iget-object v0, v0, Lmy;->g:Lvj0;

    .line 357
    .line 358
    iget-object v0, v0, Lvj0;->a:Lsh0;

    .line 359
    .line 360
    invoke-virtual {v0}, Lsh0;->g()V

    .line 361
    .line 362
    .line 363
    :cond_15
    :goto_d
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iput-object v0, v1, Lw3;->u0:Landroid/view/MotionEvent;

    .line 368
    .line 369
    invoke-virtual/range {p0 .. p1}, Lw3;->E(Landroid/view/MotionEvent;)I

    .line 370
    .line 371
    .line 372
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 373
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 374
    .line 375
    .line 376
    iput-boolean v7, v1, Lw3;->e0:Z

    .line 377
    .line 378
    return v0

    .line 379
    :catchall_2
    move-exception v0

    .line 380
    goto :goto_f

    .line 381
    :goto_e
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 382
    .line 383
    .line 384
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 385
    :goto_f
    iput-boolean v7, v1, Lw3;->e0:Z

    .line 386
    .line 387
    throw v0
.end method

.method public final n(Lb60;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lud0;->p(Lb60;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lb60;->z()Lsh0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Lsh0;->d:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, Lsh0;->f:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, Lb60;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lw3;->n(Lb60;)V

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

.method public final onAttachedToWindow()V
    .locals 11

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw3;->v:Ll20;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ll20;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lw3;->N0:Lh3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    new-instance v0, Lh3;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lh3;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lw3;->N0:Lh3;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :try_start_0
    sget-object v5, Lw3;->K0:Ljava/lang/Class;

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    const-string v5, "android.os.SystemProperties"

    .line 32
    .line 33
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sput-object v5, Lw3;->K0:Ljava/lang/Class;

    .line 38
    .line 39
    :cond_0
    sget-object v5, Lw3;->L0:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    sget-object v5, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    .line 44
    .line 45
    invoke-static {v5}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 46
    .line 47
    .line 48
    sget-object v5, Lw3;->K0:Ljava/lang/Class;

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    const-string v6, "addChangeCallback"

    .line 53
    .line 54
    new-array v7, v3, [Ljava/lang/Class;

    .line 55
    .line 56
    const-class v8, Ljava/lang/Runnable;

    .line 57
    .line 58
    aput-object v8, v7, v2

    .line 59
    .line 60
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v5, v1

    .line 66
    :goto_0
    sput-object v5, Lw3;->L0:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    :cond_2
    sget-object v5, Lw3;->L0:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    new-array v6, v3, [Ljava/lang/Object;

    .line 73
    .line 74
    aput-object v0, v6, v2

    .line 75
    .line 76
    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :catchall_0
    :cond_3
    invoke-static {v4}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    sget-object v0, Lw3;->M0:Ldh0;

    .line 83
    .line 84
    monitor-enter v0

    .line 85
    :try_start_1
    invoke-virtual {v0, p0}, Ldh0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    .line 87
    .line 88
    monitor-exit v0

    .line 89
    iget-object v0, p0, Lw3;->s:Li90;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    iget-object v0, v0, Li90;->a:Lgp0;

    .line 96
    .line 97
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v0, v4}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lw3;->s:Li90;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lw3;->s:Li90;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p0, v0}, Lw3;->n(Lb60;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lw3;->m(Lb60;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lw3;->getSnapshotObserver()Lfn0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v0, v0, Lfn0;->a:Le31;

    .line 133
    .line 134
    invoke-virtual {v0}, Le31;->c()V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lw3;->M:Ly2;

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    sget-object v4, Lj9;->a:Lj9;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v0, v0, Ly2;->f:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 149
    .line 150
    invoke-virtual {v0, v4}, Landroid/view/autofill/AutofillManager;->registerCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    invoke-static {p0}, Lj50;->m(Landroid/view/View;)Lx90;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {p0}, Lu50;->j(Landroid/view/View;)Lnx0;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {p0}, Lv50;->i(Landroid/view/View;)Lwc1;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    iget-object v6, p0, Lw3;->h:Laa0;

    .line 166
    .line 167
    if-eqz v0, :cond_12

    .line 168
    .line 169
    if-eqz v5, :cond_12

    .line 170
    .line 171
    if-nez v6, :cond_6

    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :cond_6
    invoke-interface {v5}, Lwc1;->getViewModelStore()Lvc1;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    new-instance v7, Luc1;

    .line 180
    .line 181
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    sget-object v8, Ldl;->b:Ldl;

    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    new-instance v9, Ly2;

    .line 193
    .line 194
    invoke-direct {v9, v6, v7, v8}, Ly2;-><init>(Lvc1;Ltc1;Lel;)V

    .line 195
    .line 196
    .line 197
    const-class v6, Lca0;

    .line 198
    .line 199
    invoke-static {v6}, Lau0;->a(Ljava/lang/Class;)Lje;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    sget-object v7, Lje;->e:Ljava/util/Map;

    .line 204
    .line 205
    iget-object v7, v6, Lje;->d:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_7

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Class;->isLocalClass()Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_8

    .line 222
    .line 223
    :goto_1
    move-object v7, v1

    .line 224
    goto :goto_3

    .line 225
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_a

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_9

    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-static {v7}, Lpf1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    if-eqz v7, :cond_9

    .line 250
    .line 251
    const-string v8, "Array"

    .line 252
    .line 253
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    goto :goto_2

    .line 258
    :cond_9
    move-object v7, v1

    .line 259
    :goto_2
    if-nez v7, :cond_c

    .line 260
    .line 261
    const-string v7, "kotlin.Array"

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_a
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    invoke-static {v8}, Lpf1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    if-nez v8, :cond_b

    .line 273
    .line 274
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    goto :goto_3

    .line 279
    :cond_b
    move-object v7, v8

    .line 280
    :cond_c
    :goto_3
    if-eqz v7, :cond_11

    .line 281
    .line 282
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 283
    .line 284
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v9, v6, v7}, Ly2;->l(Lje;Ljava/lang/String;)Lqc1;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, Lca0;

    .line 293
    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    check-cast v7, Landroid/view/View;

    .line 302
    .line 303
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    iget-object v6, v6, Lca0;->b:Lug0;

    .line 308
    .line 309
    invoke-virtual {v6, v7}, Lu20;->b(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    if-nez v8, :cond_d

    .line 314
    .line 315
    new-instance v8, Ldh0;

    .line 316
    .line 317
    invoke-direct {v8, v3}, Ldh0;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v7, v8}, Lug0;->i(ILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_d
    check-cast v8, Ldh0;

    .line 324
    .line 325
    iget-object v6, v8, Ldh0;->a:[Ljava/lang/Object;

    .line 326
    .line 327
    iget v7, v8, Ldh0;->b:I

    .line 328
    .line 329
    :goto_4
    if-ge v2, v7, :cond_f

    .line 330
    .line 331
    aget-object v9, v6, v2

    .line 332
    .line 333
    move-object v10, v9

    .line 334
    check-cast v10, Lba0;

    .line 335
    .line 336
    iget-boolean v10, v10, Lba0;->c:Z

    .line 337
    .line 338
    if-nez v10, :cond_e

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_f
    move-object v9, v1

    .line 345
    :goto_5
    check-cast v9, Lba0;

    .line 346
    .line 347
    if-nez v9, :cond_10

    .line 348
    .line 349
    new-instance v9, Lba0;

    .line 350
    .line 351
    invoke-direct {v9}, Lba0;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8, v9}, Ldh0;->a(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_10
    iput-boolean v3, v9, Lba0;->c:Z

    .line 358
    .line 359
    iput-object v9, p0, Lw3;->i:Lba0;

    .line 360
    .line 361
    iget-object v2, v9, Lba0;->b:Lx1;

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_11
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 365
    .line 366
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :cond_12
    :goto_6
    move-object v2, v1

    .line 371
    :goto_7
    if-nez v2, :cond_13

    .line 372
    .line 373
    sget-object v2, Ln2;->G:Ln2;

    .line 374
    .line 375
    :cond_13
    iput-object v2, p0, Lw3;->j:Lfv0;

    .line 376
    .line 377
    invoke-virtual {p0}, Lw3;->getViewTreeOwners()Lk3;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-eqz v2, :cond_14

    .line 382
    .line 383
    if-eqz v0, :cond_17

    .line 384
    .line 385
    if-eqz v4, :cond_17

    .line 386
    .line 387
    iget-object v6, v2, Lk3;->a:Lx90;

    .line 388
    .line 389
    if-ne v0, v6, :cond_14

    .line 390
    .line 391
    iget-object v6, v2, Lk3;->b:Lnx0;

    .line 392
    .line 393
    if-ne v4, v6, :cond_14

    .line 394
    .line 395
    iget-object v6, v2, Lk3;->c:Lwc1;

    .line 396
    .line 397
    if-eq v5, v6, :cond_17

    .line 398
    .line 399
    :cond_14
    if-eqz v0, :cond_1e

    .line 400
    .line 401
    if-eqz v4, :cond_1d

    .line 402
    .line 403
    if-eqz v2, :cond_15

    .line 404
    .line 405
    iget-object v2, v2, Lk3;->a:Lx90;

    .line 406
    .line 407
    invoke-interface {v2}, Lx90;->getLifecycle()Ls90;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    if-eqz v2, :cond_15

    .line 412
    .line 413
    invoke-virtual {v2, p0}, Ls90;->b(Lw90;)V

    .line 414
    .line 415
    .line 416
    :cond_15
    invoke-interface {v0}, Lx90;->getLifecycle()Ls90;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-virtual {v2, p0}, Ls90;->a(Lw90;)V

    .line 421
    .line 422
    .line 423
    new-instance v2, Lk3;

    .line 424
    .line 425
    invoke-direct {v2, v0, v4, v5}, Lk3;-><init>(Lx90;Lnx0;Lwc1;)V

    .line 426
    .line 427
    .line 428
    invoke-direct {p0, v2}, Lw3;->set_viewTreeOwners(Lk3;)V

    .line 429
    .line 430
    .line 431
    iget-object v0, p0, Lw3;->i0:Lsw;

    .line 432
    .line 433
    if-eqz v0, :cond_16

    .line 434
    .line 435
    invoke-interface {v0, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    :cond_16
    iput-object v1, p0, Lw3;->i0:Lsw;

    .line 439
    .line 440
    :cond_17
    iget-object v0, p0, Lw3;->r0:Lh20;

    .line 441
    .line 442
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-eqz v2, :cond_18

    .line 447
    .line 448
    goto :goto_8

    .line 449
    :cond_18
    const/4 v3, 0x2

    .line 450
    :goto_8
    iget-object v0, v0, Lh20;->a:Lgp0;

    .line 451
    .line 452
    new-instance v2, Lf20;

    .line 453
    .line 454
    invoke-direct {v2, v3}, Lf20;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v2}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {p0}, Lw3;->getViewTreeOwners()Lk3;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-eqz v0, :cond_19

    .line 465
    .line 466
    iget-object v0, v0, Lk3;->a:Lx90;

    .line 467
    .line 468
    invoke-interface {v0}, Lx90;->getLifecycle()Ls90;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    :cond_19
    if-eqz v1, :cond_1c

    .line 473
    .line 474
    invoke-virtual {v1, p0}, Ls90;->a(Lw90;)V

    .line 475
    .line 476
    .line 477
    iget-object v0, p0, Lw3;->C:Lv4;

    .line 478
    .line 479
    invoke-virtual {v1, v0}, Ls90;->a(Lw90;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 501
    .line 502
    .line 503
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 504
    .line 505
    const/16 v1, 0x1f

    .line 506
    .line 507
    if-lt v0, v1, :cond_1a

    .line 508
    .line 509
    sget-object v0, Lg4;->a:Lg4;

    .line 510
    .line 511
    invoke-virtual {v0, p0}, Lg4;->b(Landroid/view/View;)V

    .line 512
    .line 513
    .line 514
    :cond_1a
    iget-object v0, p0, Lw3;->N:La3;

    .line 515
    .line 516
    if-eqz v0, :cond_1b

    .line 517
    .line 518
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    check-cast v1, Lzu;

    .line 523
    .line 524
    iget-object v1, v1, Lzu;->g:Ldh0;

    .line 525
    .line 526
    invoke-virtual {v1, v0}, Ldh0;->a(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {p0}, Lw3;->getSemanticsOwner()La01;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    iget-object v1, v1, La01;->d:Ldh0;

    .line 534
    .line 535
    invoke-virtual {v1, v0}, Ldh0;->a(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_1b
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    check-cast v0, Lzu;

    .line 543
    .line 544
    iget-object v0, v0, Lzu;->g:Ldh0;

    .line 545
    .line 546
    invoke-virtual {v0, p0}, Ldh0;->a(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    :cond_1c
    const-string p0, "No lifecycle owner exists"

    .line 551
    .line 552
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    throw p0

    .line 557
    :cond_1d
    const-string p0, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    .line 558
    .line 559
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :cond_1e
    const-string p0, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 564
    .line 565
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :catchall_1
    move-exception p0

    .line 570
    monitor-exit v0

    .line 571
    throw p0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw3;->l0:Ljava/util/concurrent/atomic/AtomicReference;

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
    iget-object p0, p0, Lw3;->j0:Le20;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-static {}, Lxc;->d()V

    .line 17
    .line 18
    .line 19
    goto :goto_0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lw3;->G(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    .line 1
    iget-object p1, p0, Lw3;->l0:Ljava/util/concurrent/atomic/AtomicReference;

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
    iget-object p0, p0, Lw3;->j0:Le20;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lxc;->d()V

    .line 17
    .line 18
    .line 19
    goto :goto_0
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lw3;->C:Lv4;

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
    invoke-virtual {p0}, Lv4;->h()Lu20;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-virtual {v3, v1}, Lu20;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lzz0;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v1, v1, Lzz0;->a:Lxz0;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, Lf3;->s()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lv4;->d:Lw3;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v1, Lxz0;->g:I

    .line 40
    .line 41
    int-to-long v3, v3

    .line 42
    invoke-static {v2, v3, v4}, Lf3;->o(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v1, v1, Lxz0;->d:Lsz0;

    .line 47
    .line 48
    sget-object v3, Lb01;->A:Le01;

    .line 49
    .line 50
    iget-object v1, v1, Lsz0;->d:Ljh0;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {v1, v4, v3, v5}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, Lf8;

    .line 73
    .line 74
    invoke-direct {v3, v1}, Lf8;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Lf3;->m(Lf8;)Landroid/view/translation/TranslationRequestValue;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v2, v1}, Lf3;->z(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lf3;->p(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

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
    .locals 8

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw3;->v:Ll20;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ll20;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lw3;->o:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lw3;->n:Landroid/view/View;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "frameRateCategoryView"

    .line 23
    .line 24
    invoke-static {p0}, Lp30;->V(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    :goto_0
    sget-object v0, Lw3;->M0:Ldh0;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    invoke-virtual {v0, p0}, Ldh0;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    invoke-virtual {p0}, Lw3;->getSnapshotObserver()Lfn0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, v0, Lfn0;->a:Le31;

    .line 40
    .line 41
    iget-object v2, v2, Le31;->h:Lyk0;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Lyk0;->a()V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v0, v0, Lfn0;->a:Le31;

    .line 49
    .line 50
    iget-object v2, v0, Le31;->g:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v2

    .line 53
    :try_start_1
    iget-object v0, v0, Le31;->f:Lsh0;

    .line 54
    .line 55
    iget-object v3, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 56
    .line 57
    iget v0, v0, Lsh0;->f:I

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    move v5, v4

    .line 61
    :goto_1
    if-ge v5, v0, :cond_3

    .line 62
    .line 63
    aget-object v6, v3, v5

    .line 64
    .line 65
    check-cast v6, Ld31;

    .line 66
    .line 67
    iget-object v7, v6, Ld31;->e:Ljh0;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljh0;->a()V

    .line 70
    .line 71
    .line 72
    iget-object v7, v6, Ld31;->f:Ljh0;

    .line 73
    .line 74
    invoke-virtual {v7}, Ljh0;->a()V

    .line 75
    .line 76
    .line 77
    iget-object v7, v6, Ld31;->l:Ljh0;

    .line 78
    .line 79
    invoke-virtual {v7}, Ljh0;->a()V

    .line 80
    .line 81
    .line 82
    iget-object v6, v6, Ld31;->m:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_3
    monitor-exit v2

    .line 94
    iget-object v0, p0, Lw3;->s:Li90;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lw3;->getViewTreeOwners()Lk3;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    iget-object v0, v0, Lk3;->a:Lx90;

    .line 106
    .line 107
    invoke-interface {v0}, Lx90;->getLifecycle()Ls90;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move-object v0, v1

    .line 113
    :goto_2
    if-eqz v0, :cond_a

    .line 114
    .line 115
    iget-object v2, p0, Lw3;->C:Lv4;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ls90;->b(Lw90;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p0}, Ls90;->b(Lw90;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lw3;->M:Ly2;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    sget-object v2, Lj9;->a:Lj9;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Ly2;->f:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/view/autofill/AutofillManager;->unregisterCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lw3;->i:Lba0;

    .line 161
    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    iput-boolean v4, v0, Lba0;->c:Z

    .line 165
    .line 166
    :cond_6
    iput-object v1, p0, Lw3;->i:Lba0;

    .line 167
    .line 168
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 169
    .line 170
    const/16 v2, 0x1f

    .line 171
    .line 172
    if-lt v0, v2, :cond_7

    .line 173
    .line 174
    sget-object v0, Lg4;->a:Lg4;

    .line 175
    .line 176
    invoke-virtual {v0, p0}, Lg4;->a(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    iget-object v0, p0, Lw3;->N:La3;

    .line 180
    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    invoke-virtual {p0}, Lw3;->getSemanticsOwner()La01;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iget-object v2, v2, La01;->d:Ldh0;

    .line 188
    .line 189
    invoke-virtual {v2, v0}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, Lzu;

    .line 197
    .line 198
    iget-object v2, v2, Lzu;->g:Ldh0;

    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    :cond_8
    invoke-virtual {p0}, Lw3;->getRectManager()Lut0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v2, v0, Lut0;->g:Lv1;

    .line 208
    .line 209
    if-eqz v2, :cond_9

    .line 210
    .line 211
    sget-object v3, Lw1;->a:Landroid/os/Handler;

    .line 212
    .line 213
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    iput-object v1, v0, Lut0;->g:Lv1;

    .line 217
    .line 218
    :cond_9
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Lzu;

    .line 223
    .line 224
    iget-object v0, v0, Lzu;->g:Ldh0;

    .line 225
    .line 226
    invoke-virtual {v0, p0}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_a
    const-string p0, "No lifecycle owner exists"

    .line 231
    .line 232
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    throw p0

    .line 237
    :goto_3
    monitor-exit v2

    .line 238
    throw p0

    .line 239
    :catchall_1
    move-exception p0

    .line 240
    monitor-exit v0

    .line 241
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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lzu;

    .line 17
    .line 18
    iget-object p1, p0, Lzu;->c:Ldv;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-static {p1, p2}, Lpf1;->n(Ldv;Z)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lzu;->f()Ldv;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lzu;->f()Ldv;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p0, p2}, Lzu;->h(Ldv;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    sget-object p0, Lcv;->d:Lcv;

    .line 41
    .line 42
    sget-object p2, Lcv;->f:Lcv;

    .line 43
    .line 44
    invoke-virtual {p1, p0, p2}, Ldv;->x0(Lcv;Lcv;)V

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
    iput-wide v0, p0, Lw3;->d0:J

    .line 4
    .line 5
    invoke-virtual {p0}, Lw3;->H()V

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
    invoke-virtual {p0, v0}, Lw3;->G(Landroid/content/res/Configuration;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lw3;->d0:J

    .line 4
    .line 5
    iget-object p1, p0, Lw3;->V:Lud0;

    .line 6
    .line 7
    iget-object v0, p0, Lw3;->E0:Lt3;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lud0;->j(Lhw;)Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lw3;->T:Lpj;

    .line 14
    .line 15
    invoke-virtual {p0}, Lw3;->H()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lw3;->S:Lw6;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sub-int/2addr p4, p2

    .line 27
    sub-int/2addr p5, p3

    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

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
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Lw3;->n(Lb60;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p1}, Lw3;->j(I)J

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
    invoke-static {p2}, Lw3;->j(I)J

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
    invoke-static {v3, v1, p1, p2}, Lo30;->n(IIII)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iget-object v1, p0, Lw3;->T:Lpj;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    new-instance v1, Lpj;

    .line 55
    .line 56
    invoke-direct {v1, p1, p2}, Lpj;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lw3;->T:Lpj;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    iput-boolean v1, p0, Lw3;->U:Z

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-wide v1, v1, Lpj;->a:J

    .line 66
    .line 67
    invoke-static {v1, v2, p1, p2}, Lpj;->b(JJ)Z

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
    iput-boolean v1, p0, Lw3;->U:Z

    .line 75
    .line 76
    :cond_2
    :goto_0
    invoke-virtual {v0, p1, p2}, Lud0;->q(J)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lud0;->l()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, Lb60;->J:Lf60;

    .line 87
    .line 88
    iget-object p1, p1, Lf60;->p:Lwd0;

    .line 89
    .line 90
    iget p1, p1, Lxq0;->d:I

    .line 91
    .line 92
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iget-object p2, p2, Lb60;->J:Lf60;

    .line 97
    .line 98
    iget-object p2, p2, Lf60;->p:Lwd0;

    .line 99
    .line 100
    iget p2, p2, Lxq0;->e:I

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lw3;->S:Lw6;

    .line 106
    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    invoke-virtual {p0}, Lw3;->getAndroidViewsHandler$ui()Lw6;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-object p2, p2, Lb60;->J:Lf60;

    .line 118
    .line 119
    iget-object p2, p2, Lf60;->p:Lwd0;

    .line 120
    .line 121
    iget p2, p2, Lxq0;->d:I

    .line 122
    .line 123
    const/high16 v0, 0x40000000    # 2.0f

    .line 124
    .line 125
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 134
    .line 135
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 136
    .line 137
    iget p0, p0, Lxq0;->e:I

    .line 138
    .line 139
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :catchall_0
    move-exception p0

    .line 151
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 152
    .line 153
    .line 154
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
    iget-object v0, p0, Lw3;->N:La3;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v1, v0, La3;->e:La01;

    .line 9
    .line 10
    iget-object v1, v1, La01;->a:Lb60;

    .line 11
    .line 12
    iget-object v2, v0, La3;->i:Landroid/view/autofill/AutofillId;

    .line 13
    .line 14
    iget-object v3, v0, La3;->h:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, v0, La3;->g:Lut0;

    .line 17
    .line 18
    invoke-static {p1, v1, v2, v3, v0}, Lu50;->v(Landroid/view/ViewStructure;Lb60;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lut0;)V

    .line 19
    .line 20
    .line 21
    sget-object v4, Lkk0;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v4, Ldh0;

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v4, v5}, Ldh0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ldh0;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, p1}, Ldh0;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v4}, Ldh0;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    iget v1, v4, Ldh0;->b:I

    .line 42
    .line 43
    sub-int/2addr v1, p2

    .line 44
    invoke-virtual {v4, v1}, Ldh0;->k(I)Ljava/lang/Object;

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
    iget v5, v4, Ldh0;->b:I

    .line 54
    .line 55
    sub-int/2addr v5, p2

    .line 56
    invoke-virtual {v4, v5}, Ldh0;->k(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v5, Lb60;

    .line 64
    .line 65
    invoke-virtual {v5}, Lb60;->n()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lph0;

    .line 70
    .line 71
    iget-object v6, v5, Lph0;->d:Lsh0;

    .line 72
    .line 73
    iget v6, v6, Lsh0;->f:I

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    :goto_0
    if-ge v7, v6, :cond_0

    .line 77
    .line 78
    invoke-virtual {v5, v7}, Lph0;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Lb60;

    .line 83
    .line 84
    iget-boolean v9, v8, Lb60;->R:Z

    .line 85
    .line 86
    if-nez v9, :cond_4

    .line 87
    .line 88
    invoke-virtual {v8}, Lb60;->H()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    invoke-virtual {v8}, Lb60;->I()Z

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
    invoke-virtual {v8}, Lb60;->x()Lsz0;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    iget-object v9, v9, Lsz0;->d:Ljh0;

    .line 108
    .line 109
    sget-object v10, Lrz0;->g:Le01;

    .line 110
    .line 111
    invoke-virtual {v9, v10}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_2

    .line 116
    .line 117
    sget-object v10, Lrz0;->h:Le01;

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-nez v10, :cond_2

    .line 124
    .line 125
    sget-object v10, Lb01;->q:Le01;

    .line 126
    .line 127
    invoke-virtual {v9, v10}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_2

    .line 132
    .line 133
    sget-object v10, Lb01;->r:Le01;

    .line 134
    .line 135
    invoke-virtual {v9, v10}, Ljh0;->b(Ljava/lang/Object;)Z

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
    invoke-static {v9, v8, v2, v3, v0}, Lu50;->v(Landroid/view/ViewStructure;Lb60;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lut0;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v8}, Ldh0;->a(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v9}, Ldh0;->a(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    invoke-virtual {v4, v8}, Ldh0;->a(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v1}, Ldh0;->a(Ljava/lang/Object;)V

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
    iget-object p0, p0, Lw3;->M:Ly2;

    .line 169
    .line 170
    if-eqz p0, :cond_9

    .line 171
    .line 172
    iget-object v0, p0, Ly2;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ll9;

    .line 175
    .line 176
    iget-object v1, v0, Ll9;->a:Ljava/util/LinkedHashMap;

    .line 177
    .line 178
    iget-object v0, v0, Ll9;->a:Ljava/util/LinkedHashMap;

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
    invoke-static {}, Lxc;->d()V

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
    iget-object v0, p0, Ly2;->g:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroid/view/autofill/AutofillId;

    .line 243
    .line 244
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 245
    .line 246
    .line 247
    iget-object p0, p0, Ly2;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Lw3;

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
    invoke-virtual {p0}, Lw3;->getPointerIconService()Lmr0;

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
    iget-boolean v0, p0, Lw3;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Ltu;->a:[I

    .line 6
    .line 7
    sget-object v0, Lk50;->d:Lk50;

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
    sget-object p1, Lk50;->e:Lk50;

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
    invoke-direct {p0, v0}, Lw3;->setLayoutDirection(Lk50;)V

    .line 25
    .line 26
    .line 27
    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 12

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x1f

    .line 4
    .line 5
    if-lt p1, p2, :cond_2

    .line 6
    .line 7
    iget-object v4, p0, Lw3;->H0:Li90;

    .line 8
    .line 9
    if-eqz v4, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Lw3;->getSemanticsOwner()La01;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lw3;->getCoroutineContext()Lpk;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v9, Lsh0;

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    new-array v0, v0, [Ljy0;

    .line 24
    .line 25
    invoke-direct {v9, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, La01;->a()Lxz0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v5, Liy0;

    .line 33
    .line 34
    const-string v11, "add(Ljava/lang/Object;)Z"

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    const-class v8, Lsh0;

    .line 40
    .line 41
    const-string v10, "add"

    .line 42
    .line 43
    invoke-direct/range {v5 .. v11}, Ly1;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0, v5}, Lv50;->v(Lxz0;ILiy0;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    new-array p1, p1, [Lsw;

    .line 52
    .line 53
    sget-object v1, Lp3;->F:Lp3;

    .line 54
    .line 55
    aput-object v1, p1, v0

    .line 56
    .line 57
    sget-object v1, Lp3;->G:Lp3;

    .line 58
    .line 59
    aput-object v1, p1, v6

    .line 60
    .line 61
    new-instance v1, Lng;

    .line 62
    .line 63
    invoke-direct {v1, v0, p1}, Lng;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, v9, Lsh0;->d:[Ljava/lang/Object;

    .line 67
    .line 68
    iget v2, v9, Lsh0;->f:I

    .line 69
    .line 70
    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 71
    .line 72
    .line 73
    iget p1, v9, Lsh0;->f:I

    .line 74
    .line 75
    if-nez p1, :cond_0

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    sub-int/2addr p1, v6

    .line 80
    iget-object v0, v9, Lsh0;->d:[Ljava/lang/Object;

    .line 81
    .line 82
    aget-object p1, v0, p1

    .line 83
    .line 84
    :goto_0
    check-cast p1, Ljy0;

    .line 85
    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    iget-object v2, p1, Ljy0;->c:La30;

    .line 90
    .line 91
    invoke-static {p2}, Lp30;->e(Lpk;)Lhk;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    new-instance v0, Lai;

    .line 96
    .line 97
    iget-object v1, p1, Ljy0;->a:Lxz0;

    .line 98
    .line 99
    move-object v5, p0

    .line 100
    invoke-direct/range {v0 .. v5}, Lai;-><init>(Lxz0;La30;Lhk;Li90;Lw3;)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p1, Ljy0;->d:Lqj0;

    .line 104
    .line 105
    invoke-static {p0}, Lj50;->l(Li50;)Li50;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1, p0, v6}, Li50;->B(Li50;Z)Lst0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget p1, v2, La30;->a:I

    .line 114
    .line 115
    iget p2, v2, La30;->b:I

    .line 116
    .line 117
    int-to-long v3, p1

    .line 118
    const/16 p1, 0x20

    .line 119
    .line 120
    shl-long/2addr v3, p1

    .line 121
    int-to-long v6, p2

    .line 122
    const-wide v8, 0xffffffffL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    and-long/2addr v6, v8

    .line 128
    or-long/2addr v3, v6

    .line 129
    invoke-static {p0}, Lkl;->y(Lst0;)La30;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, Lu50;->B(La30;)Landroid/graphics/Rect;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance p2, Landroid/graphics/Point;

    .line 138
    .line 139
    shr-long v6, v3, p1

    .line 140
    .line 141
    long-to-int p1, v6

    .line 142
    and-long/2addr v3, v8

    .line 143
    long-to-int v1, v3

    .line 144
    invoke-direct {p2, p1, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 145
    .line 146
    .line 147
    invoke-static {v5, p0, p2, v0}, Lf3;->k(Lw3;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {v2}, Lu50;->B(La30;)Landroid/graphics/Rect;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p0, p1}, Lf3;->w(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p3, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_2
    :goto_1
    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw3;->H()V

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
    iget-object p0, p0, Lw3;->r0:Lh20;

    .line 7
    .line 8
    iget-object p0, p0, Lh20;->a:Lgp0;

    .line 9
    .line 10
    new-instance v0, Lf20;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lf20;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lw3;->C:Lv4;

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
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, p1}, Ls91;->v(Lv4;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Lv4;->d:Lw3;

    .line 36
    .line 37
    new-instance v1, Lt4;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, v2, p0, p1}, Lt4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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
    .locals 2

    .line 1
    iget-object v0, p0, Lw3;->s:Li90;

    .line 2
    .line 3
    iget-object v0, v0, Li90;->a:Lgp0;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lw3;->G0:Z

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final p(Landroid/view/MotionEvent;)Z
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

.method public final q(Landroid/view/MotionEvent;)Z
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
    iget-object p0, p0, Lw3;->u0:Landroid/view/MotionEvent;

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

.method public final r(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lw3;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw3;->b0:[F

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, Lr60;->s([FJ)J

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
    iget-wide v2, p0, Lw3;->f0:J

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
    iget-wide v5, p0, Lw3;->f0:J

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
    invoke-static {p1}, Ltu;->b(I)Lqu;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget p1, p1, Lqu;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x7

    .line 19
    :goto_0
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

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
    new-instance v3, Lst0;

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
    invoke-direct {v3, v4, v5, v6, p2}, Lst0;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v3, v2

    .line 45
    :goto_1
    new-instance p2, Ls3;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {p2, p1, v4}, Ls3;-><init>(II)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Lzu;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3, p2}, Lzu;->e(ILst0;Lsw;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p2, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    new-instance v3, Ls3;

    .line 71
    .line 72
    invoke-direct {v3, p1, v1}, Ls3;-><init>(II)V

    .line 73
    .line 74
    .line 75
    check-cast p2, Lzu;

    .line 76
    .line 77
    invoke-virtual {p2, p1, v2, v3}, Lzu;->e(ILst0;Lsw;)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p2, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    :goto_2
    return v1

    .line 88
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_6

    .line 93
    .line 94
    if-ne p1, v1, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    const/4 p2, 0x2

    .line 98
    if-ne p1, p2, :cond_6

    .line 99
    .line 100
    :goto_3
    invoke-virtual {p0}, Lw3;->getFocusOwner()Lwu;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Lzu;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lzu;->g(I)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :cond_6
    return v4
.end method

.method public final s(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    iget-object v1, v0, Lud0;->b:Lo8;

    .line 4
    .line 5
    invoke-virtual {v1}, Lo8;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lud0;->e:Ld;

    .line 12
    .line 13
    iget-object v1, v1, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lsh0;

    .line 16
    .line 17
    iget v1, v1, Lsh0;->f:I

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
    iget-object p1, p0, Lw3;->E0:Lt3;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    :goto_1
    invoke-virtual {v0, p1}, Lud0;->j(Lhw;)Z

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
    const/4 p0, 0x0

    .line 44
    invoke-virtual {v0, p0}, Lud0;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->B:Lc4;

    .line 2
    .line 3
    iput-wide p1, p0, Lc4;->k:J

    .line 4
    .line 5
    return-void
.end method

.method public final setConfiguration(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->L:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setContentCaptureManager$ui(Lv4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3;->C:Lv4;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Lpk;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lw3;->q:Lpk;

    .line 2
    .line 3
    invoke-virtual {p0}, Lw3;->getRoot()Lb60;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lb60;->I:Lmj0;

    .line 8
    .line 9
    iget-object p0, p0, Lmj0;->f:Loe0;

    .line 10
    .line 11
    instance-of p1, p0, Ls51;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Ls51;

    .line 17
    .line 18
    invoke-virtual {p1}, Ls51;->x0()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Loe0;->d:Loe0;

    .line 22
    .line 23
    iget-boolean p1, p1, Loe0;->q:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-string p1, "visitSubtreeIf called on an unattached node"

    .line 28
    .line 29
    invoke-static {p1}, Lw10;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance p1, Lsh0;

    .line 33
    .line 34
    const/16 v0, 0x10

    .line 35
    .line 36
    new-array v1, v0, [Loe0;

    .line 37
    .line 38
    invoke-direct {p1, v1}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 42
    .line 43
    iget-object v1, p0, Loe0;->i:Loe0;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-static {p1, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p1, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    iget p0, p1, Lsh0;->f:I

    .line 55
    .line 56
    if-eqz p0, :cond_c

    .line 57
    .line 58
    add-int/lit8 p0, p0, -0x1

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Lsh0;->k(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Loe0;

    .line 65
    .line 66
    iget v1, p0, Loe0;->g:I

    .line 67
    .line 68
    and-int/2addr v1, v0

    .line 69
    if-eqz v1, :cond_b

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    :goto_1
    if-eqz v1, :cond_b

    .line 73
    .line 74
    iget-boolean v2, v1, Loe0;->q:Z

    .line 75
    .line 76
    if-eqz v2, :cond_b

    .line 77
    .line 78
    iget v2, v1, Loe0;->f:I

    .line 79
    .line 80
    and-int/2addr v2, v0

    .line 81
    if-eqz v2, :cond_a

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    move-object v3, v1

    .line 85
    move-object v4, v2

    .line 86
    :goto_2
    if-eqz v3, :cond_a

    .line 87
    .line 88
    instance-of v5, v3, Lqr0;

    .line 89
    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    check-cast v3, Lqr0;

    .line 93
    .line 94
    instance-of v5, v3, Ls51;

    .line 95
    .line 96
    if-eqz v5, :cond_9

    .line 97
    .line 98
    check-cast v3, Ls51;

    .line 99
    .line 100
    invoke-virtual {v3}, Ls51;->x0()V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_3
    iget v5, v3, Loe0;->f:I

    .line 105
    .line 106
    and-int/2addr v5, v0

    .line 107
    if-eqz v5, :cond_9

    .line 108
    .line 109
    instance-of v5, v3, Lsm;

    .line 110
    .line 111
    if-eqz v5, :cond_9

    .line 112
    .line 113
    move-object v5, v3

    .line 114
    check-cast v5, Lsm;

    .line 115
    .line 116
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    :goto_3
    const/4 v7, 0x1

    .line 120
    if-eqz v5, :cond_8

    .line 121
    .line 122
    iget v8, v5, Loe0;->f:I

    .line 123
    .line 124
    and-int/2addr v8, v0

    .line 125
    if-eqz v8, :cond_7

    .line 126
    .line 127
    add-int/lit8 v6, v6, 0x1

    .line 128
    .line 129
    if-ne v6, v7, :cond_4

    .line 130
    .line 131
    move-object v3, v5

    .line 132
    goto :goto_4

    .line 133
    :cond_4
    if-nez v4, :cond_5

    .line 134
    .line 135
    new-instance v4, Lsh0;

    .line 136
    .line 137
    new-array v7, v0, [Loe0;

    .line 138
    .line 139
    invoke-direct {v4, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    if-eqz v3, :cond_6

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v3, v2

    .line 148
    :cond_6
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    :goto_4
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_8
    if-ne v6, v7, :cond_9

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_9
    :goto_5
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    goto :goto_2

    .line 162
    :cond_a
    iget-object v1, v1, Loe0;->i:Loe0;

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_b
    invoke-static {p1, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_c
    return-void
.end method

.method public final setFrameEndScheduler$ui(Laa0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3;->h:Laa0;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw3;->d0:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lsw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lw3;->getViewTreeOwners()Lk3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, Lw3;->i0:Lsw;

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui(Lg10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3;->f:Lg10;

    .line 2
    .line 3
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setUncaughtExceptionHandler(Lyv0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setUncaughtExceptionHandler$ui(Lyv0;)V
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

.method public final t(Lb60;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Lud0;->k(Lb60;J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lud0;->b:Lo8;

    .line 12
    .line 13
    invoke-virtual {p1}, Lo8;->j()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Lud0;->a(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lw3;->getRectManager()Lut0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lut0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    throw p0
.end method

.method public final u()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lw3;->O:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lw3;->getSnapshotObserver()Lfn0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lfn0;->a:Le31;

    .line 12
    .line 13
    iget-object v3, v0, Le31;->g:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v0, Le31;->f:Lsh0;

    .line 17
    .line 18
    iget v4, v0, Lsh0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    move v5, v2

    .line 21
    move v6, v5

    .line 22
    :goto_0
    iget-object v7, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 23
    .line 24
    if-ge v5, v4, :cond_2

    .line 25
    .line 26
    :try_start_1
    aget-object v7, v7, v5

    .line 27
    .line 28
    check-cast v7, Ld31;

    .line 29
    .line 30
    invoke-virtual {v7}, Ld31;->c()V

    .line 31
    .line 32
    .line 33
    iget-object v7, v7, Ld31;->f:Ljh0;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljh0;->j()Z

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
    iget-object v7, v0, Lsh0;->d:[Ljava/lang/Object;

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
    iput v5, v0, Lsh0;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit v3

    .line 68
    iput-boolean v2, p0, Lw3;->O:Z

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
    iget-object v0, p0, Lw3;->S:Lw6;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-static {v0}, Lw3;->i(Landroid/view/ViewGroup;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v0, p0, Lw3;->N:La3;

    .line 81
    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    iget-object v3, v0, La3;->j:Lvg0;

    .line 85
    .line 86
    iget v4, v3, Lvg0;->d:I

    .line 87
    .line 88
    if-nez v4, :cond_5

    .line 89
    .line 90
    iget-boolean v4, v0, La3;->k:Z

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    iget-object v4, v0, La3;->d:Lx1;

    .line 95
    .line 96
    iget-object v4, v4, Lx1;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Landroid/view/autofill/AutofillManager;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/autofill/AutofillManager;->commit()V

    .line 101
    .line 102
    .line 103
    iput-boolean v2, v0, La3;->k:Z

    .line 104
    .line 105
    :cond_5
    iget v3, v3, Lvg0;->d:I

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    iput-boolean v3, v0, La3;->k:Z

    .line 111
    .line 112
    :cond_6
    :goto_4
    iget-object v0, p0, Lw3;->x0:Ldh0;

    .line 113
    .line 114
    invoke-virtual {v0}, Ldh0;->i()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_a

    .line 119
    .line 120
    iget-object v0, p0, Lw3;->x0:Ldh0;

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ldh0;->f(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_a

    .line 127
    .line 128
    iget-object v0, p0, Lw3;->x0:Ldh0;

    .line 129
    .line 130
    iget v0, v0, Ldh0;->b:I

    .line 131
    .line 132
    move v3, v2

    .line 133
    :goto_5
    iget-object v4, p0, Lw3;->x0:Ldh0;

    .line 134
    .line 135
    if-ge v3, v0, :cond_9

    .line 136
    .line 137
    invoke-virtual {v4, v3}, Ldh0;->f(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lhw;

    .line 142
    .line 143
    iget-object v5, p0, Lw3;->x0:Ldh0;

    .line 144
    .line 145
    if-ltz v3, :cond_8

    .line 146
    .line 147
    iget v6, v5, Ldh0;->b:I

    .line 148
    .line 149
    if-ge v3, v6, :cond_8

    .line 150
    .line 151
    iget-object v5, v5, Ldh0;->a:[Ljava/lang/Object;

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
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

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
    invoke-virtual {v5, v3}, Ldh0;->n(I)V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :cond_9
    invoke-virtual {v4, v2, v0}, Ldh0;->l(II)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    return-void
.end method

.method public final v(Lb60;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw3;->B:Lc4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lc4;->B:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Lc4;->n()Z

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
    invoke-virtual {v0, p1}, Lc4;->o(Lb60;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p0, p0, Lw3;->C:Lv4;

    .line 17
    .line 18
    iput-boolean v1, p0, Lv4;->j:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lv4;->i()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lv4;->k:Lvb;

    .line 27
    .line 28
    sget-object p1, Lna1;->a:Lna1;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final w(Lb60;ZZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lw3;->V:Lud0;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, Lud0;->b:Lo8;

    .line 6
    .line 7
    iget-object v1, p1, Lb60;->l:Lb60;

    .line 8
    .line 9
    iget-object v2, p1, Lb60;->J:Lf60;

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
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, v2, Lf60;->d:Lx50;

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
    iget-boolean v1, v2, Lf60;->e:Z

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
    iput-boolean v3, v2, Lf60;->e:Z

    .line 48
    .line 49
    iget-object p3, v2, Lf60;->p:Lwd0;

    .line 50
    .line 51
    iput-boolean v3, p3, Lwd0;->w:Z

    .line 52
    .line 53
    iget-boolean p3, p1, Lb60;->R:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Lb60;->J()Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {p3, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lud0;->h(Lb60;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_7

    .line 81
    .line 82
    iget-object p3, p3, Lb60;->J:Lf60;

    .line 83
    .line 84
    iget-boolean p3, p3, Lf60;->e:Z

    .line 85
    .line 86
    if-ne p3, v3, :cond_7

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lb60;->I()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-static {p1}, Lud0;->i(Lb60;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_8

    .line 99
    .line 100
    :cond_5
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    invoke-virtual {p3}, Lb60;->r()Z

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
    sget-object p3, Lw30;->f:Lw30;

    .line 114
    .line 115
    invoke-virtual {p2, p1, p3}, Lo8;->a(Lb60;Lw30;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    sget-object p3, Lw30;->d:Lw30;

    .line 120
    .line 121
    invoke-virtual {p2, p1, p3}, Lo8;->a(Lb60;Lw30;)V

    .line 122
    .line 123
    .line 124
    :cond_8
    :goto_1
    iget-boolean p2, v0, Lud0;->d:Z

    .line 125
    .line 126
    if-nez p2, :cond_c

    .line 127
    .line 128
    if-eqz p4, :cond_c

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lw3;->C(Lb60;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_9
    invoke-static {}, Lxc;->j()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_a
    iget-object p0, v0, Lud0;->h:Lsh0;

    .line 139
    .line 140
    new-instance p2, Ltd0;

    .line 141
    .line 142
    invoke-direct {p2, p1, v3, p3}, Ltd0;-><init>(Lb60;ZZ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    invoke-virtual {v0, p1, p3}, Lud0;->p(Lb60;Z)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_c

    .line 154
    .line 155
    if-eqz p4, :cond_c

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Lw3;->C(Lb60;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    :goto_2
    return-void
.end method

.method public final x(Lb60;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, Lb60;->J:Lf60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lw30;->g:Lw30;

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
    iget-object v7, p0, Lw3;->V:Lud0;

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget-object p2, v7, Lud0;->b:Lo8;

    .line 15
    .line 16
    iget-object v8, v0, Lf60;->d:Lx50;

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
    invoke-static {}, Lxc;->j()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-boolean v3, v0, Lf60;->e:Z

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-boolean v3, v0, Lf60;->f:Z

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
    iput-boolean v6, v0, Lf60;->f:Z

    .line 50
    .line 51
    iput-boolean v6, v0, Lf60;->g:Z

    .line 52
    .line 53
    iget-object p3, v0, Lf60;->p:Lwd0;

    .line 54
    .line 55
    iput-boolean v6, p3, Lwd0;->x:Z

    .line 56
    .line 57
    iput-boolean v6, p3, Lwd0;->y:Z

    .line 58
    .line 59
    iget-boolean p3, p1, Lb60;->R:Z

    .line 60
    .line 61
    if-eqz p3, :cond_4

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p1}, Lb60;->J()Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v0, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p3, Lb60;->J:Lf60;

    .line 84
    .line 85
    iget-boolean v0, v0, Lf60;->e:Z

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
    iget-object v0, p3, Lb60;->J:Lf60;

    .line 93
    .line 94
    iget-boolean v0, v0, Lf60;->f:Z

    .line 95
    .line 96
    if-ne v0, v6, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    sget-object p3, Lw30;->e:Lw30;

    .line 100
    .line 101
    invoke-virtual {p2, p1, p3}, Lo8;->a(Lb60;Lw30;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    :goto_1
    invoke-virtual {p1}, Lb60;->I()Z

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
    invoke-virtual {p3}, Lb60;->p()Z

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
    invoke-virtual {p3}, Lb60;->r()Z

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
    invoke-virtual {p2, p1, v2}, Lo8;->a(Lb60;Lw30;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_2
    iget-boolean p1, v7, Lud0;->d:Z

    .line 133
    .line 134
    if-nez p1, :cond_13

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Lw3;->C(Lb60;)V

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
    iget-object p2, v0, Lf60;->d:Lx50;

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
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-eqz p2, :cond_d

    .line 164
    .line 165
    invoke-virtual {p2}, Lb60;->I()Z

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
    invoke-virtual {p1}, Lb60;->r()Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-nez p3, :cond_13

    .line 182
    .line 183
    invoke-virtual {p1}, Lb60;->p()Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_e

    .line 188
    .line 189
    invoke-virtual {p1}, Lb60;->I()Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-ne p3, v3, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Lb60;->I()Z

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    iget-object v4, v0, Lf60;->p:Lwd0;

    .line 200
    .line 201
    iget-boolean v4, v4, Lwd0;->v:Z

    .line 202
    .line 203
    if-ne p3, v4, :cond_e

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_e
    iget-object p3, v0, Lf60;->p:Lwd0;

    .line 207
    .line 208
    iput-boolean v6, p3, Lwd0;->x:Z

    .line 209
    .line 210
    iput-boolean v6, p3, Lwd0;->y:Z

    .line 211
    .line 212
    iget-boolean v0, p1, Lb60;->R:Z

    .line 213
    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_f
    iget-boolean p3, p3, Lwd0;->v:Z

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
    invoke-virtual {p2}, Lb60;->p()Z

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
    invoke-virtual {p2}, Lb60;->r()Z

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
    iget-object p2, v7, Lud0;->b:Lo8;

    .line 242
    .line 243
    invoke-virtual {p2, p1, v2}, Lo8;->a(Lb60;Lw30;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    iget-boolean p1, v7, Lud0;->d:Z

    .line 247
    .line 248
    if-nez p1, :cond_13

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Lw3;->C(Lb60;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_12
    invoke-static {}, Lxc;->j()V

    .line 255
    .line 256
    .line 257
    :cond_13
    :goto_6
    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw3;->B:Lc4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lc4;->B:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Lc4;->n()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, v0, Lc4;->M:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iput-boolean v1, v0, Lc4;->M:Z

    .line 17
    .line 18
    iget-object v2, v0, Lc4;->m:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v0, v0, Lc4;->O:Lx3;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lw3;->C:Lv4;

    .line 26
    .line 27
    iput-boolean v1, p0, Lv4;->j:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Lv4;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-boolean v0, p0, Lv4;->q:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iput-boolean v1, p0, Lv4;->q:Z

    .line 40
    .line 41
    iget-object v0, p0, Lv4;->l:Landroid/os/Handler;

    .line 42
    .line 43
    iget-object p0, p0, Lv4;->r:Lx3;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final z()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lw3;->e0:Z

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
    iget-wide v2, p0, Lw3;->d0:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Lw3;->d0:J

    .line 16
    .line 17
    iget-object v0, p0, Lw3;->F0:Loc;

    .line 18
    .line 19
    iget-object v1, p0, Lw3;->b0:[F

    .line 20
    .line 21
    invoke-virtual {v0, p0, v1}, Loc;->a(Landroid/view/View;[F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lw3;->c0:[F

    .line 25
    .line 26
    invoke-static {v1, v0}, Ls91;->B([F[F)Z

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
    iget-object v0, p0, Lw3;->a0:[I

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
    iput-wide v0, p0, Lw3;->f0:J

    .line 94
    .line 95
    :cond_1
    return-void
.end method
