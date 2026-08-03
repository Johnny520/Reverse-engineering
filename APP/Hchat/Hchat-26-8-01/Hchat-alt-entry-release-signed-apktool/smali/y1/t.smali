.class public final Ly1/t;
.super Landroid/view/ViewGroup;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/r1;
.implements Lx1/y1;
.implements Landroidx/lifecycle/d;
.implements Lx1/p1;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;
.implements Ld1/j;


# static fields
.field public static T0:Ljava/lang/Class;

.field public static U0:Ljava/lang/reflect/Method;

.field public static V0:Ljava/lang/reflect/Method;

.field public static final W0:Lf/f0;

.field public static X0:Lh/Hchat/crash/e;

.field public static Y0:Ljava/lang/reflect/Method;


# instance fields
.field public final A:Lv1/n;

.field public final A0:Lw1/b;

.field public final B:Lx1/f0;

.field public final B0:Ly1/l0;

.field public final C:Lf/w;

.field public C0:Landroid/view/MotionEvent;

.field public final D:Lg2/b;

.field public D0:J

.field public final E:Lf2/s;

.field public final E0:Lp4/t;

.field public final F:Ly1/z;

.field public final F0:Lf/f0;

.field public G:La1/i;

.field public G0:F

.field public final H:Ly1/g;

.field public H0:F

.field public final I:Lf1/f;

.field public final I0:Lrg/f;

.field public final J:Lz0/j;

.field public final J0:Ly1/j;

.field public final K:Lf/f0;

.field public K0:Z

.field public L:Lf/f0;

.field public final L0:Ly1/q1;

.field public M:Z

.field public final M0:Ly1/n;

.field public N:Z

.field public final N0:Ly1/v0;

.field public final O:Ls1/h;

.field public O0:Z

.field public final P:Lb/f;

.field public P0:Z

.field public final Q:Li0/j1;

.field public final Q0:Landroidx/lifecycle/x;

.field public final R:Li0/x;

.field public R0:Landroid/view/View;

.field public final S:Lhb/c;

.field public final S0:Ly1/q;

.field public final T:Lz0/c;

.field public U:Z

.field public final V:Ly1/i;

.field public final W:Ly1/h;

.field public final a0:Lx1/t1;

.field public b0:Z

.field public c0:Ly1/r0;

.field public d0:Lu2/a;

.field public e0:Z

.field public final f0:Lx1/t0;

.field public final g:Li0/j1;

.field public g0:J

.field public h:J

.field public final h0:[I

.field public final i:Z

.field public final i0:[F

.field public j:Lp1/a;

.field public final j0:[F

.field public final k:Lx1/h0;

.field public final k0:[F

.field public l:Ly1/w1;

.field public l0:J

.field public m:Ly1/x1;

.field public m0:Z

.field public n:Lt0/d;

.field public n0:J

.field public final o:Ltf/k;

.field public final o0:Li0/j1;

.field public final p:Ly1/j;

.field public final p0:Li0/x;

.field public final q:Li0/j1;

.field public q0:Lfg/l;

.field public final r:Landroid/view/View;

.field public r0:Ln2/v;

.field public final s:Ld1/p;

.field public s0:Ln2/t;

.field public t:Lwf/g;

.field public final t0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final u:Lb1/b;

.field public u0:Ly1/i1;

.field public final v:Ly1/v1;

.field public final v0:Lm2/c;

.field public final w:Li0/j1;

.field public final w0:Li0/a1;

.field public final x:Li0/x;

.field public final x0:Li0/j1;

.field public final y:Lf1/v;

.field public final y0:Ln1/a;

.field public final z:Ly1/q0;

.field public final z0:Lo1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf/f0;

    .line 2
    .line 3
    invoke-direct {v0}, Lf/f0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/t;->W0:Lf/f0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly1/f1;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v10}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, v2, Ly1/t;->g:Li0/j1;

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, v2, Ly1/t;->h:J

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    iput-boolean v11, v2, Ly1/t;->i:Z

    .line 25
    .line 26
    iget-object v0, v10, Ly1/f1;->r:Lx1/h0;

    .line 27
    .line 28
    iput-object v0, v2, Ly1/t;->k:Lx1/h0;

    .line 29
    .line 30
    sget-object v0, Lt0/a;->a:Lt0/a;

    .line 31
    .line 32
    iput-object v0, v2, Ly1/t;->n:Lt0/d;

    .line 33
    .line 34
    new-instance v0, Ltf/k;

    .line 35
    .line 36
    invoke-direct {v0}, Ltf/k;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, v2, Ly1/t;->o:Ltf/k;

    .line 40
    .line 41
    new-instance v0, Ly1/j;

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct {v0, v2, v12}, Ly1/j;-><init>(Ly1/t;I)V

    .line 45
    .line 46
    .line 47
    iput-object v0, v2, Ly1/t;->p:Ly1/j;

    .line 48
    .line 49
    invoke-static {v9}, Lbe/h;->a(Landroid/content/Context;)Lu2/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Li0/e;->k:Li0/e;

    .line 54
    .line 55
    new-instance v3, Li0/j1;

    .line 56
    .line 57
    invoke-direct {v3, v0, v1}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 58
    .line 59
    .line 60
    iput-object v3, v2, Ly1/t;->q:Li0/j1;

    .line 61
    .line 62
    new-instance v0, Ld1/p;

    .line 63
    .line 64
    invoke-direct {v0, v2, v2}, Ld1/p;-><init>(Ly1/t;Ly1/t;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, v2, Ly1/t;->s:Ld1/p;

    .line 68
    .line 69
    iget-object v0, v10, Ly1/f1;->b:Li0/o;

    .line 70
    .line 71
    invoke-virtual {v0}, Li0/o;->j()Lwf/g;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, v2, Ly1/t;->t:Lwf/g;

    .line 76
    .line 77
    new-instance v0, Lb1/b;

    .line 78
    .line 79
    invoke-direct {v0}, Lb1/b;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, v2, Ly1/t;->u:Lb1/b;

    .line 83
    .line 84
    new-instance v0, Ly1/v1;

    .line 85
    .line 86
    invoke-direct {v0}, Ly1/v1;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, v2, Ly1/t;->v:Ly1/v1;

    .line 90
    .line 91
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, v2, Ly1/t;->w:Li0/j1;

    .line 98
    .line 99
    new-instance v0, Ly1/n;

    .line 100
    .line 101
    invoke-direct {v0, v2, v12}, Ly1/n;-><init>(Ly1/t;I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, v2, Ly1/t;->x:Li0/x;

    .line 109
    .line 110
    iget-object v0, v10, Ly1/f1;->t:Lf1/v;

    .line 111
    .line 112
    iput-object v0, v2, Ly1/t;->y:Lf1/v;

    .line 113
    .line 114
    iget-object v0, v10, Ly1/f1;->q:Ly1/q0;

    .line 115
    .line 116
    iput-object v0, v2, Ly1/t;->z:Ly1/q0;

    .line 117
    .line 118
    new-instance v0, Lv1/n;

    .line 119
    .line 120
    invoke-direct {v0}, Lv1/n;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v0, v2, Ly1/t;->A:Lv1/n;

    .line 124
    .line 125
    new-instance v0, Lx1/f0;

    .line 126
    .line 127
    const/4 v13, 0x3

    .line 128
    invoke-direct {v0, v13}, Lx1/f0;-><init>(I)V

    .line 129
    .line 130
    .line 131
    sget-object v1, Lv1/e1;->b:Lv1/e1;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Lx1/f0;->c0(Lv1/n0;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ly1/t;->getDensity()Lu2/c;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v0, v1}, Lx1/f0;->Z(Lu2/c;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ly1/t;->getViewConfiguration()Ly1/l2;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Lx1/f0;->e0(Ly1/l2;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Ly1/r;

    .line 151
    .line 152
    invoke-direct {v1, v2}, Ly1/r;-><init>(Ly1/t;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Ld1/p;

    .line 160
    .line 161
    iget-object v3, v3, Ld1/p;->e:Ld1/m;

    .line 162
    .line 163
    invoke-interface {v1, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v2}, Ly1/t;->getDragAndDropManager()Lb1/b;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iget-object v3, v3, Lb1/b;->c:Lb1/a;

    .line 172
    .line 173
    invoke-interface {v1, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Lx1/f0;->d0(Ly0/o;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, v2, Ly1/t;->B:Lx1/f0;

    .line 181
    .line 182
    sget-object v0, Lf/l;->a:Lf/w;

    .line 183
    .line 184
    new-instance v0, Lf/w;

    .line 185
    .line 186
    invoke-direct {v0}, Lf/w;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v0, v2, Ly1/t;->C:Lf/w;

    .line 190
    .line 191
    new-instance v0, Lg2/b;

    .line 192
    .line 193
    invoke-virtual {v2}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, v2}, Lg2/b;-><init>(Ly1/t;)V

    .line 197
    .line 198
    .line 199
    iput-object v0, v2, Ly1/t;->D:Lg2/b;

    .line 200
    .line 201
    new-instance v0, Lf2/s;

    .line 202
    .line 203
    invoke-virtual {v2}, Ly1/t;->getRoot()Lx1/f0;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    new-instance v3, Lf2/f;

    .line 208
    .line 209
    invoke-direct {v3}, Ly0/n;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-direct {v0, v1, v3, v4}, Lf2/s;-><init>(Lx1/f0;Lf2/f;Lf/w;)V

    .line 217
    .line 218
    .line 219
    iput-object v0, v2, Ly1/t;->E:Lf2/s;

    .line 220
    .line 221
    new-instance v14, Ly1/z;

    .line 222
    .line 223
    invoke-direct {v14, v2}, Ly1/z;-><init>(Ly1/t;)V

    .line 224
    .line 225
    .line 226
    iput-object v14, v2, Ly1/t;->F:Ly1/z;

    .line 227
    .line 228
    new-instance v15, La1/i;

    .line 229
    .line 230
    new-instance v0, Lb0/v;

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v8, 0x4

    .line 234
    const/4 v1, 0x0

    .line 235
    const-class v3, Ly1/g0;

    .line 236
    .line 237
    const-string v4, "getContentCaptureSessionCompat"

    .line 238
    .line 239
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 240
    .line 241
    const/4 v6, 0x1

    .line 242
    invoke-direct/range {v0 .. v8}, Lb0/v;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v15, v2, v0}, La1/i;-><init>(Ly1/t;Lb0/v;)V

    .line 246
    .line 247
    .line 248
    iput-object v15, v2, Ly1/t;->G:La1/i;

    .line 249
    .line 250
    iget-object v0, v10, Ly1/f1;->j:Ly1/g;

    .line 251
    .line 252
    iput-object v0, v2, Ly1/t;->H:Ly1/g;

    .line 253
    .line 254
    new-instance v0, Lf1/f;

    .line 255
    .line 256
    invoke-direct {v0, v2}, Lf1/f;-><init>(Ly1/t;)V

    .line 257
    .line 258
    .line 259
    iput-object v0, v2, Ly1/t;->I:Lf1/f;

    .line 260
    .line 261
    new-instance v0, Lz0/j;

    .line 262
    .line 263
    invoke-direct {v0}, Lz0/j;-><init>()V

    .line 264
    .line 265
    .line 266
    iput-object v0, v2, Ly1/t;->J:Lz0/j;

    .line 267
    .line 268
    new-instance v0, Lf/f0;

    .line 269
    .line 270
    invoke-direct {v0}, Lf/f0;-><init>()V

    .line 271
    .line 272
    .line 273
    iput-object v0, v2, Ly1/t;->K:Lf/f0;

    .line 274
    .line 275
    new-instance v0, Ls1/h;

    .line 276
    .line 277
    invoke-direct {v0}, Ls1/h;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object v0, v2, Ly1/t;->O:Ls1/h;

    .line 281
    .line 282
    new-instance v0, Lb/f;

    .line 283
    .line 284
    invoke-virtual {v2}, Ly1/t;->getRoot()Lx1/f0;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 289
    .line 290
    .line 291
    iput-object v1, v0, Lb/f;->b:Ljava/lang/Object;

    .line 292
    .line 293
    new-instance v3, Ls1/d;

    .line 294
    .line 295
    iget-object v1, v1, Lx1/f0;->L:Lx1/b1;

    .line 296
    .line 297
    iget-object v1, v1, Lx1/b1;->c:Lx1/r;

    .line 298
    .line 299
    invoke-direct {v3, v1}, Ls1/d;-><init>(Lv1/t;)V

    .line 300
    .line 301
    .line 302
    iput-object v3, v0, Lb/f;->c:Ljava/lang/Object;

    .line 303
    .line 304
    new-instance v1, Lm/a;

    .line 305
    .line 306
    const/16 v3, 0xf

    .line 307
    .line 308
    invoke-direct {v1, v3}, Lm/a;-><init>(I)V

    .line 309
    .line 310
    .line 311
    iput-object v1, v0, Lb/f;->d:Ljava/lang/Object;

    .line 312
    .line 313
    new-instance v1, Lx1/p;

    .line 314
    .line 315
    invoke-direct {v1}, Lx1/p;-><init>()V

    .line 316
    .line 317
    .line 318
    iput-object v1, v0, Lb/f;->e:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object v0, v2, Ly1/t;->P:Lb/f;

    .line 321
    .line 322
    new-instance v0, Landroid/content/res/Configuration;

    .line 323
    .line 324
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iput-object v0, v2, Ly1/t;->Q:Li0/j1;

    .line 340
    .line 341
    new-instance v0, Ly1/n;

    .line 342
    .line 343
    invoke-direct {v0, v2, v11}, Ly1/n;-><init>(Ly1/t;I)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iput-object v0, v2, Ly1/t;->R:Li0/x;

    .line 351
    .line 352
    new-instance v0, Lhb/c;

    .line 353
    .line 354
    invoke-virtual {v2}, Ly1/t;->getAutofillTree()Lz0/j;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 359
    .line 360
    .line 361
    iput-object v2, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v1, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 364
    .line 365
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const-class v3, Landroid/view/autofill/AutofillManager;

    .line 370
    .line 371
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, Landroid/view/autofill/AutofillManager;

    .line 376
    .line 377
    const-string v4, "Autofill service could not be located."

    .line 378
    .line 379
    const/4 v6, 0x0

    .line 380
    if-eqz v1, :cond_a

    .line 381
    .line 382
    iput-object v1, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-virtual {v2, v11}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    if-eqz v1, :cond_9

    .line 392
    .line 393
    iput-object v1, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 394
    .line 395
    iput-object v0, v2, Ly1/t;->S:Lhb/c;

    .line 396
    .line 397
    invoke-virtual {v9, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 402
    .line 403
    if-eqz v0, :cond_8

    .line 404
    .line 405
    new-instance v1, Lz0/c;

    .line 406
    .line 407
    move-object v3, v1

    .line 408
    new-instance v1, Lxe/e;

    .line 409
    .line 410
    invoke-direct {v1, v0}, Lxe/e;-><init>(Landroid/view/autofill/AutofillManager;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {p0 .. p0}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual/range {p0 .. p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    move-object v0, v3

    .line 426
    move-object/from16 v3, p0

    .line 427
    .line 428
    invoke-direct/range {v0 .. v5}, Lz0/c;-><init>(Lxe/e;Lf2/s;Ly1/t;Lg2/b;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    move-object v2, v3

    .line 432
    iput-object v0, v2, Ly1/t;->T:Lz0/c;

    .line 433
    .line 434
    iget-object v0, v10, Ly1/f1;->l:Ly1/i;

    .line 435
    .line 436
    iput-object v0, v2, Ly1/t;->V:Ly1/i;

    .line 437
    .line 438
    iget-object v0, v10, Ly1/f1;->m:Ly1/h;

    .line 439
    .line 440
    iput-object v0, v2, Ly1/t;->W:Ly1/h;

    .line 441
    .line 442
    new-instance v0, Lx1/t1;

    .line 443
    .line 444
    new-instance v1, Ly1/p;

    .line 445
    .line 446
    invoke-direct {v1, v2, v11}, Ly1/p;-><init>(Ly1/t;I)V

    .line 447
    .line 448
    .line 449
    invoke-direct {v0, v1}, Lx1/t1;-><init>(Ly1/p;)V

    .line 450
    .line 451
    .line 452
    iput-object v0, v2, Ly1/t;->a0:Lx1/t1;

    .line 453
    .line 454
    new-instance v0, Lx1/t0;

    .line 455
    .line 456
    invoke-virtual {v2}, Ly1/t;->getRoot()Lx1/f0;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-direct {v0, v1}, Lx1/t0;-><init>(Lx1/f0;)V

    .line 461
    .line 462
    .line 463
    iput-object v0, v2, Ly1/t;->f0:Lx1/t0;

    .line 464
    .line 465
    const v0, 0x7fffffff

    .line 466
    .line 467
    .line 468
    int-to-long v0, v0

    .line 469
    const/16 v3, 0x20

    .line 470
    .line 471
    shl-long v3, v0, v3

    .line 472
    .line 473
    const-wide v7, 0xffffffffL

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    and-long/2addr v0, v7

    .line 479
    or-long/2addr v0, v3

    .line 480
    iput-wide v0, v2, Ly1/t;->g0:J

    .line 481
    .line 482
    filled-new-array {v12, v12}, [I

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iput-object v0, v2, Ly1/t;->h0:[I

    .line 487
    .line 488
    invoke-static {}, Lf1/i0;->a()[F

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iput-object v0, v2, Ly1/t;->i0:[F

    .line 493
    .line 494
    invoke-static {}, Lf1/i0;->a()[F

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    iput-object v1, v2, Ly1/t;->j0:[F

    .line 499
    .line 500
    invoke-static {}, Lf1/i0;->a()[F

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    iput-object v1, v2, Ly1/t;->k0:[F

    .line 505
    .line 506
    const-wide/16 v3, -0x1

    .line 507
    .line 508
    iput-wide v3, v2, Ly1/t;->l0:J

    .line 509
    .line 510
    const-wide v3, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    iput-wide v3, v2, Ly1/t;->n0:J

    .line 516
    .line 517
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iput-object v1, v2, Ly1/t;->o0:Li0/j1;

    .line 522
    .line 523
    new-instance v1, Ly1/n;

    .line 524
    .line 525
    invoke-direct {v1, v2, v13}, Ly1/n;-><init>(Ly1/t;I)V

    .line 526
    .line 527
    .line 528
    invoke-static {v1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    iput-object v1, v2, Ly1/t;->p0:Li0/x;

    .line 533
    .line 534
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 535
    .line 536
    invoke-direct {v1, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    iput-object v1, v2, Ly1/t;->t0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 540
    .line 541
    iget-object v1, v10, Ly1/f1;->n:Lm2/c;

    .line 542
    .line 543
    iput-object v1, v2, Ly1/t;->v0:Lm2/c;

    .line 544
    .line 545
    iget-object v1, v10, Ly1/f1;->o:Li0/a1;

    .line 546
    .line 547
    iput-object v1, v2, Ly1/t;->w0:Li0/a1;

    .line 548
    .line 549
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    sget-object v3, Ld1/h;->a:[I

    .line 562
    .line 563
    sget-object v3, Lu2/m;->g:Lu2/m;

    .line 564
    .line 565
    if-eqz v1, :cond_1

    .line 566
    .line 567
    if-eq v1, v11, :cond_0

    .line 568
    .line 569
    move-object v1, v6

    .line 570
    goto :goto_0

    .line 571
    :cond_0
    sget-object v1, Lu2/m;->h:Lu2/m;

    .line 572
    .line 573
    goto :goto_0

    .line 574
    :cond_1
    move-object v1, v3

    .line 575
    :goto_0
    if-nez v1, :cond_2

    .line 576
    .line 577
    goto :goto_1

    .line 578
    :cond_2
    move-object v3, v1

    .line 579
    :goto_1
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    iput-object v1, v2, Ly1/t;->x0:Li0/j1;

    .line 584
    .line 585
    iget-object v1, v10, Ly1/f1;->p:Ln1/a;

    .line 586
    .line 587
    iput-object v1, v2, Ly1/t;->y0:Ln1/a;

    .line 588
    .line 589
    new-instance v1, Lo1/c;

    .line 590
    .line 591
    invoke-virtual {v2}, Landroid/view/View;->isInTouchMode()Z

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    const/4 v4, 0x2

    .line 596
    if-eqz v3, :cond_3

    .line 597
    .line 598
    move v3, v11

    .line 599
    goto :goto_2

    .line 600
    :cond_3
    move v3, v4

    .line 601
    :goto_2
    invoke-direct {v1, v3}, Lo1/c;-><init>(I)V

    .line 602
    .line 603
    .line 604
    iput-object v1, v2, Ly1/t;->z0:Lo1/c;

    .line 605
    .line 606
    new-instance v1, Lw1/b;

    .line 607
    .line 608
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 609
    .line 610
    .line 611
    new-instance v3, Lj0/b;

    .line 612
    .line 613
    const/16 v5, 0x10

    .line 614
    .line 615
    new-array v7, v5, [Lx1/b;

    .line 616
    .line 617
    invoke-direct {v3, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    new-instance v3, Lj0/b;

    .line 621
    .line 622
    new-array v7, v5, [Lbe/h;

    .line 623
    .line 624
    invoke-direct {v3, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    new-instance v3, Lj0/b;

    .line 628
    .line 629
    new-array v7, v5, [Lx1/f0;

    .line 630
    .line 631
    invoke-direct {v3, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    new-instance v3, Lj0/b;

    .line 635
    .line 636
    new-array v5, v5, [Lbe/h;

    .line 637
    .line 638
    invoke-direct {v3, v5}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    iput-object v1, v2, Ly1/t;->A0:Lw1/b;

    .line 642
    .line 643
    new-instance v1, Ly1/l0;

    .line 644
    .line 645
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 646
    .line 647
    .line 648
    new-instance v3, La2/a;

    .line 649
    .line 650
    new-instance v5, Ld1/c0;

    .line 651
    .line 652
    const/16 v7, 0x13

    .line 653
    .line 654
    invoke-direct {v5, v1, v7}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 655
    .line 656
    .line 657
    invoke-direct {v3, v5}, La2/a;-><init>(Ld1/c0;)V

    .line 658
    .line 659
    .line 660
    iput-object v1, v2, Ly1/t;->B0:Ly1/l0;

    .line 661
    .line 662
    new-instance v1, Lp4/t;

    .line 663
    .line 664
    const/16 v3, 0x14

    .line 665
    .line 666
    invoke-direct {v1, v3}, Lp4/t;-><init>(I)V

    .line 667
    .line 668
    .line 669
    iput-object v1, v2, Ly1/t;->E0:Lp4/t;

    .line 670
    .line 671
    new-instance v1, Lf/f0;

    .line 672
    .line 673
    invoke-direct {v1}, Lf/f0;-><init>()V

    .line 674
    .line 675
    .line 676
    iput-object v1, v2, Ly1/t;->F0:Lf/f0;

    .line 677
    .line 678
    new-instance v1, Lrg/f;

    .line 679
    .line 680
    invoke-direct {v1, v2, v4}, Lrg/f;-><init>(Ljava/lang/Object;I)V

    .line 681
    .line 682
    .line 683
    iput-object v1, v2, Ly1/t;->I0:Lrg/f;

    .line 684
    .line 685
    new-instance v1, Ly1/j;

    .line 686
    .line 687
    invoke-direct {v1, v2, v11}, Ly1/j;-><init>(Ly1/t;I)V

    .line 688
    .line 689
    .line 690
    iput-object v1, v2, Ly1/t;->J0:Ly1/j;

    .line 691
    .line 692
    new-instance v1, Ly1/q1;

    .line 693
    .line 694
    new-instance v3, Ly1/p;

    .line 695
    .line 696
    invoke-direct {v3, v2, v12}, Ly1/p;-><init>(Ly1/t;I)V

    .line 697
    .line 698
    .line 699
    invoke-direct {v1, v9, v3}, Ly1/q1;-><init>(Landroid/content/Context;Ly1/p;)V

    .line 700
    .line 701
    .line 702
    iput-object v1, v2, Ly1/t;->L0:Ly1/q1;

    .line 703
    .line 704
    new-instance v1, Ly1/n;

    .line 705
    .line 706
    invoke-direct {v1, v2, v4}, Ly1/n;-><init>(Ly1/t;I)V

    .line 707
    .line 708
    .line 709
    iput-object v1, v2, Ly1/t;->M0:Ly1/n;

    .line 710
    .line 711
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 712
    .line 713
    const/16 v3, 0x1d

    .line 714
    .line 715
    if-ge v1, v3, :cond_4

    .line 716
    .line 717
    new-instance v4, Lp4/t;

    .line 718
    .line 719
    invoke-direct {v4, v0}, Lp4/t;-><init>([F)V

    .line 720
    .line 721
    .line 722
    goto :goto_3

    .line 723
    :cond_4
    new-instance v4, Ly1/w0;

    .line 724
    .line 725
    invoke-direct {v4}, Ly1/w0;-><init>()V

    .line 726
    .line 727
    .line 728
    :goto_3
    iput-object v4, v2, Ly1/t;->N0:Ly1/v0;

    .line 729
    .line 730
    iget-object v0, v2, Ly1/t;->G:La1/i;

    .line 731
    .line 732
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v2, v12}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v2, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 739
    .line 740
    .line 741
    sget-object v0, Ly1/f0;->a:Ly1/f0;

    .line 742
    .line 743
    invoke-virtual {v0, v2, v11, v12}, Ly1/f0;->a(Landroid/view/View;IZ)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v11}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 750
    .line 751
    .line 752
    invoke-static {v2, v14}, Lg3/q;->a(Landroid/view/ViewGroup;Lg3/b;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2}, Ly1/t;->getDragAndDropManager()Lb1/b;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2}, Ly1/t;->getRoot()Lx1/f0;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v0, v2}, Lx1/f0;->d(Lx1/r1;)V

    .line 767
    .line 768
    .line 769
    if-lt v1, v3, :cond_5

    .line 770
    .line 771
    sget-object v0, Ly1/b0;->a:Ly1/b0;

    .line 772
    .line 773
    invoke-virtual {v0, v2}, Ly1/b0;->a(Landroid/view/View;)V

    .line 774
    .line 775
    .line 776
    :cond_5
    invoke-static {}, Ly1/t;->r()Z

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    if-eqz v0, :cond_6

    .line 781
    .line 782
    new-instance v0, Landroid/view/View;

    .line 783
    .line 784
    invoke-direct {v0, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 785
    .line 786
    .line 787
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 788
    .line 789
    invoke-direct {v3, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 793
    .line 794
    .line 795
    const v3, 0x7f060046

    .line 796
    .line 797
    .line 798
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 799
    .line 800
    invoke-virtual {v0, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 801
    .line 802
    .line 803
    iput-object v0, v2, Ly1/t;->r:Landroid/view/View;

    .line 804
    .line 805
    const/4 v3, -0x1

    .line 806
    invoke-virtual {v2, v0, v3}, Ly1/t;->addView(Landroid/view/View;I)V

    .line 807
    .line 808
    .line 809
    :cond_6
    const/16 v0, 0x1f

    .line 810
    .line 811
    if-lt v1, v0, :cond_7

    .line 812
    .line 813
    new-instance v6, Landroidx/lifecycle/x;

    .line 814
    .line 815
    const/16 v0, 0x8

    .line 816
    .line 817
    invoke-direct {v6, v0}, Landroidx/lifecycle/x;-><init>(I)V

    .line 818
    .line 819
    .line 820
    :cond_7
    iput-object v6, v2, Ly1/t;->Q0:Landroidx/lifecycle/x;

    .line 821
    .line 822
    new-instance v0, Ly1/q;

    .line 823
    .line 824
    invoke-direct {v0, v2}, Ly1/q;-><init>(Ly1/t;)V

    .line 825
    .line 826
    .line 827
    iput-object v0, v2, Ly1/t;->S0:Ly1/q;

    .line 828
    .line 829
    return-void

    .line 830
    :cond_8
    invoke-static {v4}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    throw v0

    .line 835
    :cond_9
    const-string v0, "Required value was null."

    .line 836
    .line 837
    invoke-static {v0}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    throw v0

    .line 842
    :cond_a
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    throw v6
.end method

.method public static final f(Ly1/t;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ly1/t;->F:Ly1/z;

    .line 2
    .line 3
    iget-object v0, p0, Ly1/z;->J:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Ly1/z;->H:Lf/u;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lf/u;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Ly1/z;->K:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Ly1/z;->I:Lf/u;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lf/u;->d(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eq p0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public static final synthetic g(Landroid/view/MotionEvent;Ly1/t;)Z
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

.method private final getDerivedIsAttached()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->x:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getLegacyTextInputServiceAndroid()Ln2/v;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->r0:Ln2/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/v;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/t;->getView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1, p0}, Ln2/v;-><init>(Landroid/view/View;Ly1/t;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly1/t;->r0:Ln2/v;

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
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getWindowInfo$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final get_composeViewContext()Ly1/f1;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->g:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly1/f1;

    .line 8
    .line 9
    return-object v0
.end method

.method private final get_viewTreeOwners()Ly1/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->o0:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public static final synthetic h(Ly1/t;Landroid/view/KeyEvent;)Z
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

.method public static final synthetic i(Ly1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly1/t;->get_viewTreeOwners()Ly1/l;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static j(Landroid/view/ViewGroup;)V
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
    instance-of v3, v2, Ly1/t;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Ly1/t;

    .line 17
    .line 18
    invoke-virtual {v2}, Ly1/t;->A()V

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
    invoke-static {v2}, Ly1/t;->j(Landroid/view/ViewGroup;)V

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

.method public static k(I)J
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

.method public static m(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    const-class v0, Landroid/view/View;

    .line 9
    .line 10
    const-string v1, "getAccessibilityViewId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    check-cast p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x0

    .line 46
    :goto_0
    if-ge v1, v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3, p1}, Ly1/t;->m(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-object v2
.end method

.method public static p(Lx1/f0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx1/f0;->C()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lj0/b;->g:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, Lj0/b;->i:I

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
    check-cast v2, Lx1/f0;

    .line 18
    .line 19
    invoke-static {v2}, Ly1/t;->p(Lx1/f0;)V

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

.method public static r()Z
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

.method public static s(Landroid/view/MotionEvent;)Z
    .locals 8

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
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v7, 0x1d

    .line 89
    .line 90
    if-lt v0, v7, :cond_1

    .line 91
    .line 92
    sget-object v0, Ly1/a2;->a:Ly1/a2;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v6}, Ly1/a2;->a(Landroid/view/MotionEvent;I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    move v0, v2

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    :goto_2
    move v0, v3

    .line 104
    :goto_3
    if-nez v0, :cond_3

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    return v0
.end method

.method private final setAttached(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->w:Li0/j1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private setDensity(Lu2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->q:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setFontFamilyResolver(Lm2/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->w0:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(Lu2/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->x0:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_composeViewContext(Ly1/f1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->g:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final set_viewTreeOwners(Ly1/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->o0:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Ly1/t;->U:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lx1/t1;->a:Lw0/s;

    .line 12
    .line 13
    iget-object v3, v0, Lw0/s;->g:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v0, Lw0/s;->f:Lj0/b;

    .line 17
    .line 18
    iget v4, v0, Lj0/b;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    move v5, v2

    .line 21
    move v6, v5

    .line 22
    :goto_0
    iget-object v7, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 23
    .line 24
    if-ge v5, v4, :cond_2

    .line 25
    .line 26
    :try_start_1
    aget-object v7, v7, v5

    .line 27
    .line 28
    check-cast v7, Lw0/r;

    .line 29
    .line 30
    invoke-virtual {v7}, Lw0/r;->d()V

    .line 31
    .line 32
    .line 33
    iget-object v7, v7, Lw0/r;->f:Lf/k0;

    .line 34
    .line 35
    invoke-virtual {v7}, Lf/k0;->j()Z

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
    iget-object v7, v0, Lj0/b;->g:[Ljava/lang/Object;

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
    move-exception v0

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
    iput v5, v0, Lj0/b;->i:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit v3

    .line 68
    iput-boolean v2, p0, Ly1/t;->U:Z

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :goto_2
    monitor-exit v3

    .line 72
    throw v0

    .line 73
    :cond_3
    :goto_3
    iget-object v0, p0, Ly1/t;->c0:Ly1/r0;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-static {v0}, Ly1/t;->j(Landroid/view/ViewGroup;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v0, p0, Ly1/t;->T:Lz0/c;

    .line 81
    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    iget-object v3, v0, Lz0/c;->n:Lf/x;

    .line 85
    .line 86
    iget v4, v3, Lf/x;->d:I

    .line 87
    .line 88
    if-nez v4, :cond_5

    .line 89
    .line 90
    iget-boolean v4, v0, Lz0/c;->o:Z

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    iget-object v4, v0, Lz0/c;->g:Lxe/e;

    .line 95
    .line 96
    iget-object v4, v4, Lxe/e;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Landroid/view/autofill/AutofillManager;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/autofill/AutofillManager;->commit()V

    .line 101
    .line 102
    .line 103
    iput-boolean v2, v0, Lz0/c;->o:Z

    .line 104
    .line 105
    :cond_5
    iget v3, v3, Lf/x;->d:I

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    iput-boolean v3, v0, Lz0/c;->o:Z

    .line 111
    .line 112
    :cond_6
    :goto_4
    iget-object v0, p0, Ly1/t;->F0:Lf/f0;

    .line 113
    .line 114
    invoke-virtual {v0}, Lf/f0;->i()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_9

    .line 119
    .line 120
    iget-object v0, p0, Ly1/t;->F0:Lf/f0;

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_9

    .line 127
    .line 128
    iget-object v0, p0, Ly1/t;->F0:Lf/f0;

    .line 129
    .line 130
    iget v0, v0, Lf/f0;->b:I

    .line 131
    .line 132
    move v3, v2

    .line 133
    :goto_5
    iget-object v4, p0, Ly1/t;->F0:Lf/f0;

    .line 134
    .line 135
    if-ge v3, v0, :cond_8

    .line 136
    .line 137
    invoke-virtual {v4, v3}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lfg/a;

    .line 142
    .line 143
    iget-object v5, p0, Ly1/t;->F0:Lf/f0;

    .line 144
    .line 145
    invoke-virtual {v5, v3, v1}, Lf/f0;->n(ILjava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    if-eqz v4, :cond_7

    .line 149
    .line 150
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    invoke-virtual {v4, v2, v0}, Lf/f0;->l(II)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_9
    return-void
.end method

.method public final B(Lx1/f0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/t;->F:Ly1/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ly1/z;->D:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Ly1/z;->o()Z

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
    invoke-virtual {v0, p1}, Ly1/z;->p(Lx1/f0;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p1, p0, Ly1/t;->G:La1/i;

    .line 17
    .line 18
    iput-boolean v1, p1, La1/i;->m:Z

    .line 19
    .line 20
    invoke-virtual {p1}, La1/i;->i()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, La1/i;->n:Lsg/c;

    .line 27
    .line 28
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-interface {p1, v0}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final C(Lx1/f0;ZZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, Lx1/t0;->b:Lb5/c;

    .line 6
    .line 7
    iget-object v1, p1, Lx1/f0;->n:Lx1/f0;

    .line 8
    .line 9
    iget-object v2, p1, Lx1/f0;->M:Lx1/j0;

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
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, v2, Lx1/j0;->d:Lx1/b0;

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
    iget-boolean v1, v2, Lx1/j0;->e:Z

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
    iput-boolean v3, v2, Lx1/j0;->e:Z

    .line 48
    .line 49
    iget-object p3, v2, Lx1/j0;->p:Lx1/v0;

    .line 50
    .line 51
    iput-boolean v3, p3, Lx1/v0;->A:Z

    .line 52
    .line 53
    iget-boolean p3, p1, Lx1/f0;->W:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Lx1/f0;->I()Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {p3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lx1/t0;->i(Lx1/f0;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_4

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_7

    .line 81
    .line 82
    iget-object p3, p3, Lx1/f0;->M:Lx1/j0;

    .line 83
    .line 84
    iget-boolean p3, p3, Lx1/j0;->e:Z

    .line 85
    .line 86
    if-ne p3, v3, :cond_7

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lx1/f0;->H()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-static {p1}, Lx1/t0;->j(Lx1/f0;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-eqz p3, :cond_8

    .line 99
    .line 100
    :cond_5
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    invoke-virtual {p3}, Lx1/f0;->q()Z

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
    sget-object p3, Lx1/s;->i:Lx1/s;

    .line 114
    .line 115
    invoke-virtual {p2, p1, p3}, Lb5/c;->b(Lx1/f0;Lx1/s;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    sget-object p3, Lx1/s;->g:Lx1/s;

    .line 120
    .line 121
    invoke-virtual {p2, p1, p3}, Lb5/c;->b(Lx1/f0;Lx1/s;)V

    .line 122
    .line 123
    .line 124
    :cond_8
    :goto_1
    iget-boolean p2, v0, Lx1/t0;->d:Z

    .line 125
    .line 126
    if-nez p2, :cond_c

    .line 127
    .line 128
    if-eqz p4, :cond_c

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Ly1/t;->I(Lx1/f0;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_9
    invoke-static {}, Lokio/a;->k()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_a
    iget-object p2, v0, Lx1/t0;->h:Lj0/b;

    .line 139
    .line 140
    new-instance p4, Lx1/s0;

    .line 141
    .line 142
    invoke-direct {p4, p1, v3, p3}, Lx1/s0;-><init>(Lx1/f0;ZZ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    invoke-virtual {v0, p1, p3}, Lx1/t0;->r(Lx1/f0;Z)Z

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
    invoke-virtual {p0, p1}, Ly1/t;->I(Lx1/f0;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    :goto_2
    return-void
.end method

.method public final D(Lx1/f0;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, Lx1/f0;->M:Lx1/j0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lx1/s;->j:Lx1/s;

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
    iget-object v7, p0, Ly1/t;->f0:Lx1/t0;

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget-object p2, v7, Lx1/t0;->b:Lb5/c;

    .line 15
    .line 16
    iget-object v8, v0, Lx1/j0;->d:Lx1/b0;

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
    invoke-static {}, Lokio/a;->k()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-boolean v3, v0, Lx1/j0;->e:Z

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-boolean v3, v0, Lx1/j0;->f:Z

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
    iput-boolean v6, v0, Lx1/j0;->f:Z

    .line 50
    .line 51
    iput-boolean v6, v0, Lx1/j0;->g:Z

    .line 52
    .line 53
    iget-object p3, v0, Lx1/j0;->p:Lx1/v0;

    .line 54
    .line 55
    iput-boolean v6, p3, Lx1/v0;->B:Z

    .line 56
    .line 57
    iput-boolean v6, p3, Lx1/v0;->C:Z

    .line 58
    .line 59
    iget-boolean p3, p1, Lx1/f0;->W:Z

    .line 60
    .line 61
    if-eqz p3, :cond_4

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p1}, Lx1/f0;->I()Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p3, Lx1/f0;->M:Lx1/j0;

    .line 84
    .line 85
    iget-boolean v0, v0, Lx1/j0;->e:Z

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
    iget-object v0, p3, Lx1/f0;->M:Lx1/j0;

    .line 93
    .line 94
    iget-boolean v0, v0, Lx1/j0;->f:Z

    .line 95
    .line 96
    if-ne v0, v6, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    sget-object p3, Lx1/s;->h:Lx1/s;

    .line 100
    .line 101
    invoke-virtual {p2, p1, p3}, Lb5/c;->b(Lx1/f0;Lx1/s;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    :goto_1
    invoke-virtual {p1}, Lx1/f0;->H()Z

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
    invoke-virtual {p3}, Lx1/f0;->p()Z

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
    invoke-virtual {p3}, Lx1/f0;->q()Z

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
    invoke-virtual {p2, p1, v2}, Lb5/c;->b(Lx1/f0;Lx1/s;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_2
    iget-boolean p1, v7, Lx1/t0;->d:Z

    .line 133
    .line 134
    if-nez p1, :cond_13

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Ly1/t;->I(Lx1/f0;)V

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
    iget-object p2, v0, Lx1/j0;->d:Lx1/b0;

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
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-eqz p2, :cond_d

    .line 164
    .line 165
    invoke-virtual {p2}, Lx1/f0;->H()Z

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
    invoke-virtual {p1}, Lx1/f0;->q()Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-nez p3, :cond_13

    .line 182
    .line 183
    invoke-virtual {p1}, Lx1/f0;->p()Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_e

    .line 188
    .line 189
    invoke-virtual {p1}, Lx1/f0;->H()Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-ne p3, v3, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Lx1/f0;->H()Z

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    iget-object v4, v0, Lx1/j0;->p:Lx1/v0;

    .line 200
    .line 201
    iget-boolean v4, v4, Lx1/v0;->z:Z

    .line 202
    .line 203
    if-ne p3, v4, :cond_e

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_e
    iget-object p3, v0, Lx1/j0;->p:Lx1/v0;

    .line 207
    .line 208
    iput-boolean v6, p3, Lx1/v0;->B:Z

    .line 209
    .line 210
    iput-boolean v6, p3, Lx1/v0;->C:Z

    .line 211
    .line 212
    iget-boolean v0, p1, Lx1/f0;->W:Z

    .line 213
    .line 214
    if-eqz v0, :cond_f

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_f
    iget-boolean p3, p3, Lx1/v0;->z:Z

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
    invoke-virtual {p2}, Lx1/f0;->p()Z

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
    invoke-virtual {p2}, Lx1/f0;->q()Z

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
    iget-object p2, v7, Lx1/t0;->b:Lb5/c;

    .line 242
    .line 243
    invoke-virtual {p2, p1, v2}, Lb5/c;->b(Lx1/f0;Lx1/s;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    iget-boolean p1, v7, Lx1/t0;->d:Z

    .line 247
    .line 248
    if-nez p1, :cond_13

    .line 249
    .line 250
    invoke-virtual {p0, v1}, Ly1/t;->I(Lx1/f0;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_12
    invoke-static {}, Lokio/a;->k()V

    .line 255
    .line 256
    .line 257
    :cond_13
    :goto_6
    return-void
.end method

.method public final E()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/t;->F:Ly1/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ly1/z;->D:Z

    .line 5
    .line 6
    iget-object v2, v0, Ly1/z;->j:Ly1/t;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Ly1/z;->o()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-boolean v3, v0, Ly1/z;->O:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iput-boolean v1, v0, Ly1/z;->O:Z

    .line 25
    .line 26
    iget-object v0, v0, Ly1/z;->Q:Lwb/cr;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Ly1/t;->G:La1/i;

    .line 32
    .line 33
    iput-boolean v1, v0, La1/i;->m:Z

    .line 34
    .line 35
    iget-object v2, v0, La1/i;->g:Ly1/t;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0}, La1/i;->i()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-boolean v3, v0, La1/i;->s:Z

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    iput-boolean v1, v0, La1/i;->s:Z

    .line 54
    .line 55
    iget-object v0, v0, La1/i;->t:La1/a;

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final F()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Ly1/t;->m0:Z

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
    iget-wide v2, p0, Ly1/t;->l0:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Ly1/t;->l0:J

    .line 16
    .line 17
    iget-object v0, p0, Ly1/t;->N0:Ly1/v0;

    .line 18
    .line 19
    iget-object v1, p0, Ly1/t;->j0:[F

    .line 20
    .line 21
    invoke-interface {v0, p0, v1}, Ly1/v0;->h(Landroid/view/View;[F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ly1/t;->k0:[F

    .line 25
    .line 26
    invoke-static {v1, v0}, Ly1/g0;->p([F[F)Z

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
    iget-object v0, p0, Ly1/t;->h0:[I

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
    iput-wide v0, p0, Ly1/t;->n0:J

    .line 94
    .line 95
    :cond_1
    return-void
.end method

.method public final G(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Ly1/t;->l0:J

    .line 6
    .line 7
    iget-object v0, p0, Ly1/t;->N0:Ly1/v0;

    .line 8
    .line 9
    iget-object v1, p0, Ly1/t;->j0:[F

    .line 10
    .line 11
    invoke-interface {v0, p0, v1}, Ly1/v0;->h(Landroid/view/View;[F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ly1/t;->k0:[F

    .line 15
    .line 16
    invoke-static {v1, v0}, Ly1/g0;->p([F[F)Z

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
    invoke-static {v2, v3, v1}, Lf1/i0;->b(J[F)J

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
    iput-wide v0, p0, Ly1/t;->n0:J

    .line 92
    .line 93
    return-void
.end method

.method public final H()Z
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
    const/4 v0, 0x1

    .line 8
    return v0

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
    move-result v0

    .line 16
    return v0
.end method

.method public final I(Lx1/f0;)V
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
    invoke-virtual {p1}, Lx1/f0;->r()Lx1/d0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lx1/d0;->g:Lx1/d0;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Ly1/t;->e0:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 36
    .line 37
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 38
    .line 39
    iget-wide v0, v0, Lv1/b1;->j:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Lu2/a;->f(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {v0, v1}, Lu2/a;->e(J)Z

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
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

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

.method public final J(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ly1/t;->F()V

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
    iget-wide v2, p0, Ly1/t;->n0:J

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
    iget-wide v4, p0, Ly1/t;->n0:J

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
    iget-object v0, p0, Ly1/t;->k0:[F

    .line 57
    .line 58
    invoke-static {p1, p2, v0}, Lf1/i0;->b(J[F)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1
.end method

.method public final K(Landroid/view/MotionEvent;)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Ly1/t;->O0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Ly1/t;->O0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Ly1/f1;->s:Ly1/v1;

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
    sget-object v0, Ly1/p2;->a:Li0/j1;

    .line 22
    .line 23
    new-instance v3, Ls1/c0;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Ls1/c0;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Ly1/t;->O:Ls1/h;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, Ls1/h;->c(Landroid/view/MotionEvent;Ly1/t;)Lp4/t;

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
    iget-object v4, p0, Ly1/t;->P:Lb/f;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eqz v2, :cond_9

    .line 45
    .line 46
    iget-object v1, v2, Lp4/t;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    add-int/lit8 v6, v6, -0x1

    .line 55
    .line 56
    const/4 v7, 0x5

    .line 57
    if-ltz v6, :cond_3

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v8, v6, -0x1

    .line 60
    .line 61
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    move-object v9, v6

    .line 66
    check-cast v9, Ls1/v;

    .line 67
    .line 68
    iget-boolean v9, v9, Ls1/v;->e:Z

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
    move v6, v8

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    :goto_1
    move-object v6, v5

    .line 83
    :cond_4
    :goto_2
    check-cast v6, Ls1/v;

    .line 84
    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    iget-wide v8, v6, Ls1/v;->d:J

    .line 88
    .line 89
    iput-wide v8, p0, Ly1/t;->h:J

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0, p1}, Ly1/t;->t(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v4, v2, p0, v1}, Lb/f;->b(Lp4/t;Ly1/t;Z)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iput-object v5, v2, Lp4/t;->i:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    if-ne v3, v7, :cond_7

    .line 104
    .line 105
    :cond_6
    and-int/lit8 v2, v1, 0x1

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    :cond_7
    return v1

    .line 110
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget-object v2, v0, Ls1/h;->c:Landroid/util/SparseBooleanArray;

    .line 119
    .line 120
    invoke-virtual {v2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Ls1/h;->b:Landroid/util/SparseLongArray;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 126
    .line 127
    .line 128
    return v1

    .line 129
    :cond_9
    iget-boolean p1, v4, Lb/f;->a:Z

    .line 130
    .line 131
    if-nez p1, :cond_b

    .line 132
    .line 133
    iget-object p1, v4, Lb/f;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lm/a;

    .line 136
    .line 137
    iget-object p1, p1, Lm/a;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Lf/p;

    .line 140
    .line 141
    iget v0, p1, Lf/p;->j:I

    .line 142
    .line 143
    iget-object v2, p1, Lf/p;->i:[Ljava/lang/Object;

    .line 144
    .line 145
    move v3, v1

    .line 146
    :goto_3
    if-ge v3, v0, :cond_a

    .line 147
    .line 148
    aput-object v5, v2, v3

    .line 149
    .line 150
    add-int/lit8 v3, v3, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_a
    iput v1, p1, Lf/p;->j:I

    .line 154
    .line 155
    iput-boolean v1, p1, Lf/p;->g:Z

    .line 156
    .line 157
    iget-object p1, v4, Lb/f;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Ls1/d;

    .line 160
    .line 161
    invoke-virtual {p1}, Ls1/d;->c()V

    .line 162
    .line 163
    .line 164
    :cond_b
    return v1
.end method

.method public final L(Landroid/view/MotionEvent;IJZ)V
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
    invoke-virtual {v0, v4, v5}, Ly1/t;->w(J)J

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
    iget-object v2, v0, Ly1/t;->O:Ls1/h;

    .line 215
    .line 216
    invoke-virtual {v2, v1, v0}, Ls1/h;->c(Landroid/view/MotionEvent;Ly1/t;)Lp4/t;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v3, v0, Ly1/t;->P:Lb/f;

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    invoke-virtual {v3, v2, v0, v4}, Lb/f;->b(Lp4/t;Ly1/t;Z)I

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final M(Lfg/p;Lyf/c;)V
    .locals 4

    .line 1
    instance-of v0, p2, Ly1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ly1/s;

    .line 7
    .line 8
    iget v1, v0, Ly1/s;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly1/s;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly1/s;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ly1/s;-><init>(Ly1/t;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ly1/s;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ly1/s;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Ly1/p;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    invoke-direct {p2, p0, v1}, Ly1/p;-><init>(Ly1/t;I)V

    .line 51
    .line 52
    .line 53
    iput v2, v0, Ly1/s;->i:I

    .line 54
    .line 55
    new-instance v1, Lci/e;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    iget-object v3, p0, Ly1/t;->t0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-direct {v1, p2, v3, p1, v2}, Lci/e;-><init>(Lfg/l;Ljava/util/concurrent/atomic/AtomicReference;Lfg/p;Lwf/c;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    :goto_1
    invoke-static {}, Lokio/a;->c()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final N(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly1/t;->getConfiguration()Landroid/content/res/Configuration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0, v1}, Ly1/t;->setConfiguration(Landroid/content/res/Configuration;)V

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
    invoke-static {v1}, Lbe/h;->a(Landroid/content/Context;)Lu2/e;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Ly1/t;->setDensity(Lu2/c;)V

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
    iget-object p1, p0, Ly1/t;->v:Ly1/v1;

    .line 55
    .line 56
    iget-object p1, p1, Ly1/v1;->b:Li0/j1;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-static {p0}, Ly1/g0;->e(Landroid/view/View;)Ly1/j1;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final O()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly1/t;->h0:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Ly1/t;->g0:J

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
    iget-wide v10, v0, Ly1/t;->l0:J

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
    iput-wide v6, v0, Ly1/t;->g0:J

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
    invoke-virtual {v0}, Ly1/t;->getRoot()Lx1/f0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v1, v1, Lj0/b;->i:I

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
    check-cast v5, Lx1/f0;

    .line 74
    .line 75
    iget-object v5, v5, Lx1/f0;->M:Lx1/j0;

    .line 76
    .line 77
    iget-object v5, v5, Lx1/j0;->p:Lx1/v0;

    .line 78
    .line 79
    invoke-virtual {v5}, Lx1/v0;->Y0()V

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
    invoke-virtual {v0}, Ly1/t;->F()V

    .line 89
    .line 90
    .line 91
    iget-object v2, v0, Ly1/t;->R0:Landroid/view/View;

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
    iput-object v2, v0, Ly1/t;->R0:Landroid/view/View;

    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Ly1/t;->getRectManager()Lg2/b;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-wide v11, v0, Ly1/t;->g0:J

    .line 106
    .line 107
    iget-wide v5, v0, Ly1/t;->n0:J

    .line 108
    .line 109
    invoke-static {v5, v6}, Lig/a;->W(J)J

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
    iget-object v2, v0, Ly1/t;->j0:[F

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
    iget-object v10, v4, Lg2/b;->c:Lg2/e;

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
    invoke-virtual/range {v10 .. v17}, Lg2/e;->b(JJ[FII)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-nez v2, :cond_8

    .line 255
    .line 256
    iget-boolean v2, v4, Lg2/b;->f:Z

    .line 257
    .line 258
    if-eqz v2, :cond_9

    .line 259
    .line 260
    :cond_8
    move v3, v9

    .line 261
    :cond_9
    iput-boolean v3, v4, Lg2/b;->f:Z

    .line 262
    .line 263
    iget-object v2, v0, Ly1/t;->f0:Lx1/t0;

    .line 264
    .line 265
    invoke-virtual {v2, v1}, Lx1/t0;->b(Z)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ly1/t;->getRectManager()Lg2/b;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v1}, Lg2/b;->a()V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public final P(F)V
    .locals 2

    .line 1
    invoke-static {}, Ly1/t;->r()Z

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
    iget v0, p0, Ly1/t;->G0:F

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
    iget v0, p0, Ly1/t;->G0:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    if-lez v0, :cond_3

    .line 25
    .line 26
    :cond_0
    iput p1, p0, Ly1/t;->G0:F

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
    iget v0, p0, Ly1/t;->H0:F

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
    iget v0, p0, Ly1/t;->H0:F

    .line 42
    .line 43
    cmpg-float v0, p1, v0

    .line 44
    .line 45
    if-gez v0, :cond_3

    .line 46
    .line 47
    :cond_2
    iput p1, p0, Ly1/t;->H0:F

    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method public final a(Landroidx/lifecycle/q;)V
    .locals 4

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ly1/g0;->n()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Ly1/t;->setShowLayoutBounds(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Ly1/t;->m:Ly1/x1;

    .line 15
    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    iget-object v0, p0, Ly1/t;->l:Ly1/w1;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p1, Ly1/x1;->a:Lxe/e;

    .line 24
    .line 25
    iget-object v2, v1, Lxe/e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lt0/c;

    .line 28
    .line 29
    iget-boolean v3, v2, Lt0/c;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    iget-boolean v2, v2, Lt0/c;->c:Z

    .line 34
    .line 35
    if-nez v2, :cond_4

    .line 36
    .line 37
    :try_start_0
    new-instance v2, Ld1/c0;

    .line 38
    .line 39
    const/16 v3, 0x15

    .line 40
    .line 41
    invoke-direct {v2, p1, v3}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    check-cast v0, Ly1/y2;

    .line 45
    .line 46
    iget-object v0, v0, Ly1/y2;->a:Li0/o;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Li0/o;->s(Ld1/c0;)Li0/f;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    iget-object v0, v1, Lxe/e;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lt0/c;

    .line 56
    .line 57
    iget-boolean v1, v0, Lt0/c;->b:Z

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v1, v0, Lt0/c;->c:Z

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    const-string v1, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 67
    .line 68
    invoke-static {v1}, Lu0/a;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0}, Lt0/c;->a()V

    .line 72
    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    iput-boolean v1, v0, Lt0/c;->c:Z

    .line 76
    .line 77
    :goto_0
    const/4 v0, 0x0

    .line 78
    :goto_1
    iget-object v1, p1, Ly1/x1;->d:Li0/f;

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Li0/f;->cancel()V

    .line 83
    .line 84
    .line 85
    :cond_3
    iput-object v0, p1, Ly1/x1;->d:Li0/f;

    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ld1/p;

    .line 6
    .line 7
    iget-object v0, v0, Ld1/p;->c:Ld1/b0;

    .line 8
    .line 9
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 16
    .line 17
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 18
    .line 19
    const-string v2, "visitSubtreeIf called on an unattached node"

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    new-instance v1, Lj0/b;

    .line 27
    .line 28
    const/16 v3, 0x10

    .line 29
    .line 30
    new-array v4, v3, [Ly0/n;

    .line 31
    .line 32
    invoke-direct {v1, v4}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 36
    .line 37
    iget-object v4, v0, Ly0/n;->l:Ly0/n;

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-static {v1, v0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v1, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget v0, v1, Lj0/b;->i:I

    .line 49
    .line 50
    if-eqz v0, :cond_1a

    .line 51
    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ly0/n;

    .line 59
    .line 60
    iget v4, v0, Ly0/n;->j:I

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
    iget-boolean v5, v4, Ly0/n;->t:Z

    .line 70
    .line 71
    if-eqz v5, :cond_19

    .line 72
    .line 73
    iget v5, v4, Ly0/n;->i:I

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
    instance-of v8, v6, Ld1/b0;

    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    const/4 v10, 0x0

    .line 88
    if-eqz v8, :cond_11

    .line 89
    .line 90
    check-cast v6, Ld1/b0;

    .line 91
    .line 92
    iget-boolean v8, v6, Ly0/n;->t:Z

    .line 93
    .line 94
    if-eqz v8, :cond_17

    .line 95
    .line 96
    invoke-virtual {v6}, Ld1/b0;->m1()Ld1/t;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    iget-boolean v6, v6, Ld1/t;->a:Z

    .line 101
    .line 102
    if-eqz v6, :cond_17

    .line 103
    .line 104
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Ld1/p;

    .line 112
    .line 113
    iget-object p2, p2, Ld1/p;->c:Ld1/b0;

    .line 114
    .line 115
    iget-boolean p3, p2, Ly0/n;->t:Z

    .line 116
    .line 117
    if-nez p3, :cond_3

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_3
    iget-object p3, p2, Ly0/n;->g:Ly0/n;

    .line 122
    .line 123
    iget-boolean p3, p3, Ly0/n;->t:Z

    .line 124
    .line 125
    if-nez p3, :cond_4

    .line 126
    .line 127
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    new-instance p3, Lj0/b;

    .line 131
    .line 132
    new-array v0, v3, [Ly0/n;

    .line 133
    .line 134
    invoke-direct {p3, v0}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p2, p2, Ly0/n;->g:Ly0/n;

    .line 138
    .line 139
    iget-object v0, p2, Ly0/n;->l:Ly0/n;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {p3, p2}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-virtual {p3, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_3
    iget p2, p3, Lj0/b;->i:I

    .line 151
    .line 152
    if-eqz p2, :cond_10

    .line 153
    .line 154
    add-int/lit8 p2, p2, -0x1

    .line 155
    .line 156
    invoke-virtual {p3, p2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Ly0/n;

    .line 161
    .line 162
    iget v0, p2, Ly0/n;->j:I

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
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 172
    .line 173
    if-eqz v1, :cond_f

    .line 174
    .line 175
    iget v1, v0, Ly0/n;->i:I

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
    instance-of v4, v1, Ld1/b0;

    .line 186
    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    check-cast v1, Ld1/b0;

    .line 190
    .line 191
    iget-boolean v4, v1, Ly0/n;->t:Z

    .line 192
    .line 193
    if-nez v4, :cond_6

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_6
    invoke-virtual {v1}, Ld1/b0;->m1()Ld1/t;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iget-boolean v6, v1, Ly0/n;->t:Z

    .line 201
    .line 202
    if-eqz v6, :cond_d

    .line 203
    .line 204
    iget-boolean v1, v1, Ld1/b0;->u:Z

    .line 205
    .line 206
    if-nez v1, :cond_d

    .line 207
    .line 208
    iget-boolean v1, v4, Ld1/t;->a:Z

    .line 209
    .line 210
    if-eqz v1, :cond_d

    .line 211
    .line 212
    goto/16 :goto_c

    .line 213
    .line 214
    :cond_7
    iget v4, v1, Ly0/n;->i:I

    .line 215
    .line 216
    and-int/lit16 v4, v4, 0x400

    .line 217
    .line 218
    if-eqz v4, :cond_d

    .line 219
    .line 220
    instance-of v4, v1, Lx1/j;

    .line 221
    .line 222
    if-eqz v4, :cond_d

    .line 223
    .line 224
    move-object v4, v1

    .line 225
    check-cast v4, Lx1/j;

    .line 226
    .line 227
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 228
    .line 229
    move v6, v10

    .line 230
    :goto_6
    if-eqz v4, :cond_c

    .line 231
    .line 232
    iget v7, v4, Ly0/n;->i:I

    .line 233
    .line 234
    and-int/lit16 v7, v7, 0x400

    .line 235
    .line 236
    if-eqz v7, :cond_b

    .line 237
    .line 238
    add-int/lit8 v6, v6, 0x1

    .line 239
    .line 240
    if-ne v6, v9, :cond_8

    .line 241
    .line 242
    move-object v1, v4

    .line 243
    goto :goto_7

    .line 244
    :cond_8
    if-nez v2, :cond_9

    .line 245
    .line 246
    new-instance v2, Lj0/b;

    .line 247
    .line 248
    new-array v7, v3, [Ly0/n;

    .line 249
    .line 250
    invoke-direct {v2, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_9
    if-eqz v1, :cond_a

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object v1, v5

    .line 259
    :cond_a
    invoke-virtual {v2, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    :goto_7
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_c
    if-ne v6, v9, :cond_d

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_d
    :goto_8
    invoke-static {v2}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    goto :goto_5

    .line 273
    :cond_e
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_f
    invoke-static {p3, p2}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_3

    .line 280
    .line 281
    :cond_10
    :goto_9
    if-eqz p1, :cond_1a

    .line 282
    .line 283
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :cond_11
    iget v8, v6, Ly0/n;->i:I

    .line 288
    .line 289
    and-int/lit16 v8, v8, 0x400

    .line 290
    .line 291
    if-eqz v8, :cond_17

    .line 292
    .line 293
    instance-of v8, v6, Lx1/j;

    .line 294
    .line 295
    if-eqz v8, :cond_17

    .line 296
    .line 297
    move-object v8, v6

    .line 298
    check-cast v8, Lx1/j;

    .line 299
    .line 300
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 301
    .line 302
    :goto_a
    if-eqz v8, :cond_16

    .line 303
    .line 304
    iget v11, v8, Ly0/n;->i:I

    .line 305
    .line 306
    and-int/lit16 v11, v11, 0x400

    .line 307
    .line 308
    if-eqz v11, :cond_15

    .line 309
    .line 310
    add-int/lit8 v10, v10, 0x1

    .line 311
    .line 312
    if-ne v10, v9, :cond_12

    .line 313
    .line 314
    move-object v6, v8

    .line 315
    goto :goto_b

    .line 316
    :cond_12
    if-nez v7, :cond_13

    .line 317
    .line 318
    new-instance v7, Lj0/b;

    .line 319
    .line 320
    new-array v11, v3, [Ly0/n;

    .line 321
    .line 322
    invoke-direct {v7, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_13
    if-eqz v6, :cond_14

    .line 326
    .line 327
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    move-object v6, v5

    .line 331
    :cond_14
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_15
    :goto_b
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 335
    .line 336
    goto :goto_a

    .line 337
    :cond_16
    if-ne v10, v9, :cond_17

    .line 338
    .line 339
    goto/16 :goto_2

    .line 340
    .line 341
    :cond_17
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    goto/16 :goto_2

    .line 346
    .line 347
    :cond_18
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_19
    invoke-static {v1, v0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_1a
    :goto_c
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Ly1/t;->addView(Landroid/view/View;I)V

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
    iget-object v1, p0, Ly1/t;->T:Lz0/c;

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
    iget-object v6, v1, Lz0/c;->h:Lf2/s;

    .line 24
    .line 25
    iget-object v6, v6, Lf2/s;->c:Lf/k;

    .line 26
    .line 27
    invoke-virtual {v6, v4}, Lf/k;->b(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lx1/f0;

    .line 32
    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4}, Lx1/f0;->w()Lf2/m;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    iget-object v4, v4, Lf2/m;->g:Lf/k0;

    .line 42
    .line 43
    sget-object v6, Lf2/l;->g:Lf2/x;

    .line 44
    .line 45
    invoke-virtual {v4, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v6, Lf2/a;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    iget-object v6, v6, Lf2/a;->b:Lsf/b;

    .line 58
    .line 59
    check-cast v6, Lfg/l;

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    new-instance v8, Li2/g;

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
    invoke-direct {v8, v9}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v6, v8}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_1
    sget-object v6, Lf2/l;->h:Lf2/x;

    .line 83
    .line 84
    invoke-virtual {v4, v6}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v7, Lf2/a;

    .line 93
    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    iget-object v4, v7, Lf2/a;->b:Lsf/b;

    .line 97
    .line 98
    check-cast v4, Lfg/l;

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    new-instance v6, Lz0/f;

    .line 103
    .line 104
    invoke-direct {v6, v5}, Lz0/f;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v4, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Ly1/t;->S:Lhb/c;

    .line 117
    .line 118
    if-eqz v1, :cond_b

    .line 119
    .line 120
    iget-object v1, v1, Lhb/c;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lz0/j;

    .line 123
    .line 124
    iget-object v2, v1, Lz0/j;->a:Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :goto_2
    if-ge v0, v2, :cond_b

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, Landroid/view/autofill/AutofillValue;

    .line 148
    .line 149
    invoke-virtual {v4}, Landroid/view/autofill/AutofillValue;->isText()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    invoke-virtual {v4}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    iget-object v4, v1, Lz0/j;->a:Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-nez v3, :cond_6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    invoke-static {}, Lah/a;->d()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_7
    invoke-virtual {v4}, Landroid/view/autofill/AutofillValue;->isDate()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-nez v3, :cond_a

    .line 184
    .line 185
    invoke-virtual {v4}, Landroid/view/autofill/AutofillValue;->isList()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_9

    .line 190
    .line 191
    invoke-virtual {v4}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_8

    .line 196
    .line 197
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_8
    new-instance p1, Leg/a;

    .line 201
    .line 202
    const-string v0, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 203
    .line 204
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p1

    .line 208
    :cond_9
    new-instance p1, Leg/a;

    .line 209
    .line 210
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :cond_a
    new-instance p1, Leg/a;

    .line 217
    .line 218
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 219
    .line 220
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :cond_b
    :goto_4
    return-void
.end method

.method public final c(Landroidx/lifecycle/q;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ly1/t;->m:Ly1/x1;

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    iget-object v0, p1, Ly1/x1;->a:Lxe/e;

    .line 6
    .line 7
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lt0/c;

    .line 10
    .line 11
    iget-boolean v1, v0, Lt0/c;->a:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-boolean v1, v0, Lt0/c;->c:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p1, Ly1/x1;->d:Li0/f;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Li0/f;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p1, Ly1/x1;->d:Li0/f;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean p1, v0, Lt0/c;->b:Z

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-boolean p1, v0, Lt0/c;->c:Z

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    const-string p1, "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"

    .line 40
    .line 41
    invoke-static {p1}, Lu0/a;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p1, v0, Lt0/c;->d:Lf/k0;

    .line 45
    .line 46
    invoke-virtual {p1}, Lf/k0;->i()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    const-string p1, "Attempted to start retaining exited values with pending exited values"

    .line 53
    .line 54
    invoke-static {p1}, Lu0/a;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, v0, Lt0/c;->c:Z

    .line 59
    .line 60
    :cond_5
    :goto_0
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-wide v1, p0, Ly1/t;->h:J

    .line 3
    .line 4
    iget-object v3, p0, Ly1/t;->F:Ly1/z;

    .line 5
    .line 6
    invoke-virtual {v3, p1, v1, v2, v0}, Ly1/z;->f(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-wide v1, p0, Ly1/t;->h:J

    .line 3
    .line 4
    iget-object v3, p0, Ly1/t;->F:Ly1/z;

    .line 5
    .line 6
    invoke-virtual {v3, p1, v1, v2, v0}, Ly1/z;->f(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ly1/t;->K:Lf/f0;

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
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ly1/t;->p(Lx1/f0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v1}, Ly1/t;->x(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lw0/m;->j()Lw0/f;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lw0/f;->m()V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, Ly1/t;->M:Z

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
    iget-object v1, p0, Ly1/t;->y:Lf1/v;

    .line 35
    .line 36
    iget-object v2, v1, Lf1/v;->a:Lf1/b;

    .line 37
    .line 38
    iget-object v3, v2, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 39
    .line 40
    iput-object p1, v2, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 41
    .line 42
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {v4, v2, v5}, Lx1/f0;->i(Lf1/u;Li1/b;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, Lf1/v;->a:Lf1/b;

    .line 51
    .line 52
    iput-object v3, v1, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 53
    .line 54
    invoke-virtual {v0}, Lf/f0;->i()Z

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
    iget v1, v0, Lf/f0;->b:I

    .line 62
    .line 63
    move v3, v2

    .line 64
    :goto_0
    if-ge v3, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lx1/q1;

    .line 71
    .line 72
    check-cast v4, Ly1/o1;

    .line 73
    .line 74
    invoke-virtual {v4}, Ly1/o1;->g()V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    sget v1, Ly1/m2;->g:I

    .line 83
    .line 84
    invoke-virtual {v0}, Lf/f0;->d()V

    .line 85
    .line 86
    .line 87
    iput-boolean v2, p0, Ly1/t;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Ly1/t;->L:Lf/f0;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lf/f0;->b(Lf/f0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lf/f0;->d()V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-static {}, Ly1/t;->r()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    iget v0, p0, Ly1/t;->G0:F

    .line 109
    .line 110
    invoke-static {p0, v0}, Ly1/t0;->a(Landroid/view/View;F)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Ly1/t;->r:Landroid/view/View;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    iget v1, p0, Ly1/t;->H0:F

    .line 118
    .line 119
    invoke-static {v0, v1}, Ly1/t0;->a(Landroid/view/View;F)V

    .line 120
    .line 121
    .line 122
    iget v1, p0, Ly1/t;->H0:F

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 134
    .line 135
    .line 136
    move-result-wide v1

    .line 137
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 138
    .line 139
    .line 140
    :cond_3
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 141
    .line 142
    iput p1, p0, Ly1/t;->G0:F

    .line 143
    .line 144
    iput p1, p0, Ly1/t;->H0:F

    .line 145
    .line 146
    :cond_4
    return-void

    .line 147
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 148
    .line 149
    .line 150
    throw p1
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Ly1/t;->K0:Z

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
    iget-object v2, v0, Ly1/t;->J0:Ly1/j;

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
    iput-boolean v4, v0, Ly1/t;->K0:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Ly1/j;->run()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-static {v1}, Ly1/t;->s(Landroid/view/MotionEvent;)Z

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
    invoke-virtual {v0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v3, Lc1/b;

    .line 99
    .line 100
    const/16 v10, 0x8

    .line 101
    .line 102
    invoke-direct {v3, v0, v10, v1}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v2, Ld1/p;

    .line 106
    .line 107
    iget-object v1, v2, Ld1/p;->d:Ld1/i;

    .line 108
    .line 109
    iget-boolean v1, v1, Ld1/i;->e:Z

    .line 110
    .line 111
    if-eqz v1, :cond_3

    .line 112
    .line 113
    const-string v1, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 114
    .line 115
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return v4

    .line 121
    :cond_3
    iget-object v1, v2, Ld1/p;->c:Ld1/b0;

    .line 122
    .line 123
    invoke-static {v1}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_10

    .line 128
    .line 129
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 130
    .line 131
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 132
    .line 133
    if-nez v2, :cond_4

    .line 134
    .line 135
    invoke-static {v5}, Lu1/a;->b(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 139
    .line 140
    invoke-static {v1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :goto_1
    if-eqz v1, :cond_f

    .line 145
    .line 146
    iget-object v10, v1, Lx1/f0;->L:Lx1/b1;

    .line 147
    .line 148
    iget-object v10, v10, Lx1/b1;->f:Ly0/n;

    .line 149
    .line 150
    iget v10, v10, Ly0/n;->j:I

    .line 151
    .line 152
    and-int/lit16 v10, v10, 0x4000

    .line 153
    .line 154
    if-eqz v10, :cond_d

    .line 155
    .line 156
    :goto_2
    if-eqz v2, :cond_d

    .line 157
    .line 158
    iget v10, v2, Ly0/n;->i:I

    .line 159
    .line 160
    and-int/lit16 v10, v10, 0x4000

    .line 161
    .line 162
    if-eqz v10, :cond_c

    .line 163
    .line 164
    move-object v10, v2

    .line 165
    const/4 v11, 0x0

    .line 166
    :goto_3
    if-eqz v10, :cond_c

    .line 167
    .line 168
    instance-of v12, v10, Ly1/k;

    .line 169
    .line 170
    if-eqz v12, :cond_5

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_5
    iget v12, v10, Ly0/n;->i:I

    .line 174
    .line 175
    and-int/lit16 v12, v12, 0x4000

    .line 176
    .line 177
    if-eqz v12, :cond_b

    .line 178
    .line 179
    instance-of v12, v10, Lx1/j;

    .line 180
    .line 181
    if-eqz v12, :cond_b

    .line 182
    .line 183
    move-object v12, v10

    .line 184
    check-cast v12, Lx1/j;

    .line 185
    .line 186
    iget-object v12, v12, Lx1/j;->v:Ly0/n;

    .line 187
    .line 188
    move v13, v4

    .line 189
    :goto_4
    if-eqz v12, :cond_a

    .line 190
    .line 191
    iget v14, v12, Ly0/n;->i:I

    .line 192
    .line 193
    and-int/lit16 v14, v14, 0x4000

    .line 194
    .line 195
    if-eqz v14, :cond_9

    .line 196
    .line 197
    add-int/lit8 v13, v13, 0x1

    .line 198
    .line 199
    if-ne v13, v9, :cond_6

    .line 200
    .line 201
    move-object v10, v12

    .line 202
    goto :goto_5

    .line 203
    :cond_6
    if-nez v11, :cond_7

    .line 204
    .line 205
    new-instance v11, Lj0/b;

    .line 206
    .line 207
    new-array v14, v8, [Ly0/n;

    .line 208
    .line 209
    invoke-direct {v11, v14}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_7
    if-eqz v10, :cond_8

    .line 213
    .line 214
    invoke-virtual {v11, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    :cond_8
    invoke-virtual {v11, v12}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_9
    :goto_5
    iget-object v12, v12, Ly0/n;->l:Ly0/n;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_a
    if-ne v13, v9, :cond_b

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_b
    invoke-static {v11}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    goto :goto_3

    .line 232
    :cond_c
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_d
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_e

    .line 240
    .line 241
    iget-object v2, v1, Lx1/f0;->L:Lx1/b1;

    .line 242
    .line 243
    if-eqz v2, :cond_e

    .line 244
    .line 245
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_e
    const/4 v2, 0x0

    .line 249
    goto :goto_1

    .line 250
    :cond_f
    const/4 v10, 0x0

    .line 251
    :goto_6
    check-cast v10, Ly1/k;

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_10
    const/4 v10, 0x0

    .line 255
    :goto_7
    if-eqz v10, :cond_32

    .line 256
    .line 257
    iget-object v1, v10, Ly0/n;->g:Ly0/n;

    .line 258
    .line 259
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 260
    .line 261
    if-nez v1, :cond_11

    .line 262
    .line 263
    invoke-static {v5}, Lu1/a;->b(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :cond_11
    iget-object v1, v10, Ly0/n;->g:Ly0/n;

    .line 267
    .line 268
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 269
    .line 270
    invoke-static {v10}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const/4 v5, 0x0

    .line 275
    :goto_8
    if-eqz v2, :cond_1d

    .line 276
    .line 277
    iget-object v11, v2, Lx1/f0;->L:Lx1/b1;

    .line 278
    .line 279
    iget-object v11, v11, Lx1/b1;->f:Ly0/n;

    .line 280
    .line 281
    iget v11, v11, Ly0/n;->j:I

    .line 282
    .line 283
    and-int/lit16 v11, v11, 0x4000

    .line 284
    .line 285
    if-eqz v11, :cond_1b

    .line 286
    .line 287
    :goto_9
    if-eqz v1, :cond_1b

    .line 288
    .line 289
    iget v11, v1, Ly0/n;->i:I

    .line 290
    .line 291
    and-int/lit16 v11, v11, 0x4000

    .line 292
    .line 293
    if-eqz v11, :cond_1a

    .line 294
    .line 295
    move-object v11, v1

    .line 296
    const/4 v12, 0x0

    .line 297
    :goto_a
    if-eqz v11, :cond_1a

    .line 298
    .line 299
    instance-of v13, v11, Ly1/k;

    .line 300
    .line 301
    if-eqz v13, :cond_13

    .line 302
    .line 303
    if-nez v5, :cond_12

    .line 304
    .line 305
    new-instance v5, Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 308
    .line 309
    .line 310
    :cond_12
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move v13, v4

    .line 314
    goto :goto_b

    .line 315
    :cond_13
    move v13, v9

    .line 316
    :goto_b
    if-eqz v13, :cond_19

    .line 317
    .line 318
    iget v13, v11, Ly0/n;->i:I

    .line 319
    .line 320
    and-int/lit16 v13, v13, 0x4000

    .line 321
    .line 322
    if-eqz v13, :cond_19

    .line 323
    .line 324
    instance-of v13, v11, Lx1/j;

    .line 325
    .line 326
    if-eqz v13, :cond_19

    .line 327
    .line 328
    move-object v13, v11

    .line 329
    check-cast v13, Lx1/j;

    .line 330
    .line 331
    iget-object v13, v13, Lx1/j;->v:Ly0/n;

    .line 332
    .line 333
    move v14, v4

    .line 334
    :goto_c
    if-eqz v13, :cond_18

    .line 335
    .line 336
    iget v15, v13, Ly0/n;->i:I

    .line 337
    .line 338
    and-int/lit16 v15, v15, 0x4000

    .line 339
    .line 340
    if-eqz v15, :cond_17

    .line 341
    .line 342
    add-int/lit8 v14, v14, 0x1

    .line 343
    .line 344
    if-ne v14, v9, :cond_14

    .line 345
    .line 346
    move-object v11, v13

    .line 347
    goto :goto_d

    .line 348
    :cond_14
    if-nez v12, :cond_15

    .line 349
    .line 350
    new-instance v12, Lj0/b;

    .line 351
    .line 352
    new-array v15, v8, [Ly0/n;

    .line 353
    .line 354
    invoke-direct {v12, v15}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_15
    if-eqz v11, :cond_16

    .line 358
    .line 359
    invoke-virtual {v12, v11}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    const/4 v11, 0x0

    .line 363
    :cond_16
    invoke-virtual {v12, v13}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_17
    :goto_d
    iget-object v13, v13, Ly0/n;->l:Ly0/n;

    .line 367
    .line 368
    goto :goto_c

    .line 369
    :cond_18
    if-ne v14, v9, :cond_19

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_19
    invoke-static {v12}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    goto :goto_a

    .line 377
    :cond_1a
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_1b
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    if-eqz v2, :cond_1c

    .line 385
    .line 386
    iget-object v1, v2, Lx1/f0;->L:Lx1/b1;

    .line 387
    .line 388
    if-eqz v1, :cond_1c

    .line 389
    .line 390
    iget-object v1, v1, Lx1/b1;->e:Lx1/b2;

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_1c
    const/4 v1, 0x0

    .line 394
    goto :goto_8

    .line 395
    :cond_1d
    if-eqz v5, :cond_1f

    .line 396
    .line 397
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    add-int/2addr v1, v6

    .line 402
    if-ltz v1, :cond_1f

    .line 403
    .line 404
    :goto_e
    add-int/lit8 v2, v1, -0x1

    .line 405
    .line 406
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    check-cast v1, Ly1/k;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    if-gez v2, :cond_1e

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_1e
    move v1, v2

    .line 419
    goto :goto_e

    .line 420
    :cond_1f
    :goto_f
    iget-object v1, v10, Ly0/n;->g:Ly0/n;

    .line 421
    .line 422
    const/4 v2, 0x0

    .line 423
    :goto_10
    if-eqz v1, :cond_27

    .line 424
    .line 425
    instance-of v6, v1, Ly1/k;

    .line 426
    .line 427
    if-eqz v6, :cond_20

    .line 428
    .line 429
    check-cast v1, Ly1/k;

    .line 430
    .line 431
    goto :goto_13

    .line 432
    :cond_20
    iget v6, v1, Ly0/n;->i:I

    .line 433
    .line 434
    and-int/lit16 v6, v6, 0x4000

    .line 435
    .line 436
    if-eqz v6, :cond_26

    .line 437
    .line 438
    instance-of v6, v1, Lx1/j;

    .line 439
    .line 440
    if-eqz v6, :cond_26

    .line 441
    .line 442
    move-object v6, v1

    .line 443
    check-cast v6, Lx1/j;

    .line 444
    .line 445
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 446
    .line 447
    move v11, v4

    .line 448
    :goto_11
    if-eqz v6, :cond_25

    .line 449
    .line 450
    iget v12, v6, Ly0/n;->i:I

    .line 451
    .line 452
    and-int/lit16 v12, v12, 0x4000

    .line 453
    .line 454
    if-eqz v12, :cond_24

    .line 455
    .line 456
    add-int/lit8 v11, v11, 0x1

    .line 457
    .line 458
    if-ne v11, v9, :cond_21

    .line 459
    .line 460
    move-object v1, v6

    .line 461
    goto :goto_12

    .line 462
    :cond_21
    if-nez v2, :cond_22

    .line 463
    .line 464
    new-instance v2, Lj0/b;

    .line 465
    .line 466
    new-array v12, v8, [Ly0/n;

    .line 467
    .line 468
    invoke-direct {v2, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_22
    if-eqz v1, :cond_23

    .line 472
    .line 473
    invoke-virtual {v2, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    const/4 v1, 0x0

    .line 477
    :cond_23
    invoke-virtual {v2, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_24
    :goto_12
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 481
    .line 482
    goto :goto_11

    .line 483
    :cond_25
    if-ne v11, v9, :cond_26

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_26
    :goto_13
    invoke-static {v2}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    goto :goto_10

    .line 491
    :cond_27
    invoke-virtual {v3}, Lc1/b;->invoke()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    check-cast v1, Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_28

    .line 502
    .line 503
    goto/16 :goto_19

    .line 504
    .line 505
    :cond_28
    iget-object v1, v10, Ly0/n;->g:Ly0/n;

    .line 506
    .line 507
    const/4 v2, 0x0

    .line 508
    :goto_14
    if-eqz v1, :cond_30

    .line 509
    .line 510
    instance-of v3, v1, Ly1/k;

    .line 511
    .line 512
    if-eqz v3, :cond_29

    .line 513
    .line 514
    check-cast v1, Ly1/k;

    .line 515
    .line 516
    goto :goto_17

    .line 517
    :cond_29
    iget v3, v1, Ly0/n;->i:I

    .line 518
    .line 519
    and-int/lit16 v3, v3, 0x4000

    .line 520
    .line 521
    if-eqz v3, :cond_2f

    .line 522
    .line 523
    instance-of v3, v1, Lx1/j;

    .line 524
    .line 525
    if-eqz v3, :cond_2f

    .line 526
    .line 527
    move-object v3, v1

    .line 528
    check-cast v3, Lx1/j;

    .line 529
    .line 530
    iget-object v3, v3, Lx1/j;->v:Ly0/n;

    .line 531
    .line 532
    move v6, v4

    .line 533
    :goto_15
    if-eqz v3, :cond_2e

    .line 534
    .line 535
    iget v10, v3, Ly0/n;->i:I

    .line 536
    .line 537
    and-int/lit16 v10, v10, 0x4000

    .line 538
    .line 539
    if-eqz v10, :cond_2d

    .line 540
    .line 541
    add-int/lit8 v6, v6, 0x1

    .line 542
    .line 543
    if-ne v6, v9, :cond_2a

    .line 544
    .line 545
    move-object v1, v3

    .line 546
    goto :goto_16

    .line 547
    :cond_2a
    if-nez v2, :cond_2b

    .line 548
    .line 549
    new-instance v2, Lj0/b;

    .line 550
    .line 551
    new-array v10, v8, [Ly0/n;

    .line 552
    .line 553
    invoke-direct {v2, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    :cond_2b
    if-eqz v1, :cond_2c

    .line 557
    .line 558
    invoke-virtual {v2, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    const/4 v1, 0x0

    .line 562
    :cond_2c
    invoke-virtual {v2, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_2d
    :goto_16
    iget-object v3, v3, Ly0/n;->l:Ly0/n;

    .line 566
    .line 567
    goto :goto_15

    .line 568
    :cond_2e
    if-ne v6, v9, :cond_2f

    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_2f
    :goto_17
    invoke-static {v2}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    goto :goto_14

    .line 576
    :cond_30
    if-eqz v5, :cond_32

    .line 577
    .line 578
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    move v2, v4

    .line 583
    :goto_18
    if-ge v2, v1, :cond_32

    .line 584
    .line 585
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    check-cast v3, Ly1/k;

    .line 590
    .line 591
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    add-int/lit8 v2, v2, 0x1

    .line 595
    .line 596
    goto :goto_18

    .line 597
    :cond_31
    invoke-virtual/range {p0 .. p1}, Ly1/t;->o(Landroid/view/MotionEvent;)I

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    and-int/lit8 v1, v1, 0x4

    .line 602
    .line 603
    if-eqz v1, :cond_32

    .line 604
    .line 605
    :goto_19
    return v9

    .line 606
    :cond_32
    return v4

    .line 607
    :cond_33
    const/high16 v2, 0x200000

    .line 608
    .line 609
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    if-eqz v3, :cond_90

    .line 614
    .line 615
    iget-object v3, v0, Ly1/t;->j:Lp1/a;

    .line 616
    .line 617
    iget-object v10, v0, Ly1/t;->O:Ls1/h;

    .line 618
    .line 619
    iget-object v11, v10, Ls1/h;->e:Lf/p;

    .line 620
    .line 621
    iget-object v12, v10, Ls1/h;->b:Landroid/util/SparseLongArray;

    .line 622
    .line 623
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    invoke-virtual {v10, v1}, Ls1/h;->b(Landroid/view/MotionEvent;)V

    .line 628
    .line 629
    .line 630
    const/4 v14, 0x3

    .line 631
    const/4 v15, 0x2

    .line 632
    if-ne v13, v14, :cond_34

    .line 633
    .line 634
    invoke-virtual {v12}, Landroid/util/SparseLongArray;->clear()V

    .line 635
    .line 636
    .line 637
    iget-object v1, v10, Ls1/h;->c:Landroid/util/SparseBooleanArray;

    .line 638
    .line 639
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 640
    .line 641
    .line 642
    move-object/from16 v22, v5

    .line 643
    .line 644
    move/from16 v16, v6

    .line 645
    .line 646
    move/from16 v18, v8

    .line 647
    .line 648
    const/4 v3, 0x0

    .line 649
    goto/16 :goto_2d

    .line 650
    .line 651
    :cond_34
    invoke-virtual {v10, v1}, Ls1/h;->a(Landroid/view/MotionEvent;)V

    .line 652
    .line 653
    .line 654
    const/4 v14, 0x6

    .line 655
    if-eq v13, v9, :cond_36

    .line 656
    .line 657
    if-eq v13, v14, :cond_35

    .line 658
    .line 659
    move/from16 v16, v6

    .line 660
    .line 661
    goto :goto_1a

    .line 662
    :cond_35
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 663
    .line 664
    .line 665
    move-result v16

    .line 666
    move/from16 v40, v16

    .line 667
    .line 668
    move/from16 v16, v6

    .line 669
    .line 670
    move/from16 v6, v40

    .line 671
    .line 672
    goto :goto_1a

    .line 673
    :cond_36
    move/from16 v16, v6

    .line 674
    .line 675
    move v6, v4

    .line 676
    :goto_1a
    const/4 v7, 0x5

    .line 677
    if-eqz v13, :cond_37

    .line 678
    .line 679
    if-eq v13, v15, :cond_37

    .line 680
    .line 681
    if-eq v13, v7, :cond_37

    .line 682
    .line 683
    move/from16 v17, v4

    .line 684
    .line 685
    :goto_1b
    move/from16 v18, v8

    .line 686
    .line 687
    goto :goto_1c

    .line 688
    :cond_37
    move/from16 v17, v9

    .line 689
    .line 690
    goto :goto_1b

    .line 691
    :goto_1c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 692
    .line 693
    .line 694
    move-result v8

    .line 695
    new-instance v14, Ljava/util/ArrayList;

    .line 696
    .line 697
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 698
    .line 699
    .line 700
    move v7, v4

    .line 701
    :goto_1d
    if-ge v7, v8, :cond_42

    .line 702
    .line 703
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 704
    .line 705
    .line 706
    move-result v15

    .line 707
    move/from16 v19, v9

    .line 708
    .line 709
    invoke-virtual {v12, v15}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 710
    .line 711
    .line 712
    move-result v9

    .line 713
    const-wide/16 v20, 0x1

    .line 714
    .line 715
    if-ltz v9, :cond_38

    .line 716
    .line 717
    invoke-virtual {v12, v9}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 718
    .line 719
    .line 720
    move-result-wide v22

    .line 721
    move-wide/from16 v40, v22

    .line 722
    .line 723
    move-object/from16 v22, v5

    .line 724
    .line 725
    move-wide/from16 v4, v40

    .line 726
    .line 727
    move-object/from16 v24, v3

    .line 728
    .line 729
    goto :goto_1e

    .line 730
    :cond_38
    move-object/from16 v22, v5

    .line 731
    .line 732
    iget-wide v4, v10, Ls1/h;->a:J

    .line 733
    .line 734
    move-object/from16 v24, v3

    .line 735
    .line 736
    add-long v2, v4, v20

    .line 737
    .line 738
    iput-wide v2, v10, Ls1/h;->a:J

    .line 739
    .line 740
    invoke-virtual {v12, v15, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 741
    .line 742
    .line 743
    :goto_1e
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    move-object v15, v10

    .line 756
    int-to-long v9, v2

    .line 757
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 758
    .line 759
    .line 760
    move-result v2

    .line 761
    int-to-long v2, v2

    .line 762
    const/16 v25, 0x20

    .line 763
    .line 764
    shl-long v9, v9, v25

    .line 765
    .line 766
    const-wide v26, 0xffffffffL

    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    and-long v2, v2, v26

    .line 772
    .line 773
    or-long v30, v9, v2

    .line 774
    .line 775
    if-eq v7, v6, :cond_39

    .line 776
    .line 777
    move/from16 v32, v19

    .line 778
    .line 779
    goto :goto_1f

    .line 780
    :cond_39
    const/16 v32, 0x0

    .line 781
    .line 782
    :goto_1f
    iget-object v2, v11, Lf/p;->h:[J

    .line 783
    .line 784
    iget v3, v11, Lf/p;->j:I

    .line 785
    .line 786
    invoke-static {v2, v3, v4, v5}, Lg/a;->b([JIJ)I

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-ltz v2, :cond_3a

    .line 791
    .line 792
    iget-object v3, v11, Lf/p;->i:[Ljava/lang/Object;

    .line 793
    .line 794
    aget-object v2, v3, v2

    .line 795
    .line 796
    sget-object v3, Lf/q;->a:Ljava/lang/Object;

    .line 797
    .line 798
    if-ne v2, v3, :cond_3b

    .line 799
    .line 800
    :cond_3a
    const/4 v2, 0x0

    .line 801
    :cond_3b
    check-cast v2, Ls1/g;

    .line 802
    .line 803
    const-wide/32 v9, 0x7fffffff

    .line 804
    .line 805
    .line 806
    if-ne v7, v6, :cond_3c

    .line 807
    .line 808
    invoke-virtual {v11, v4, v5}, Lf/p;->c(J)V

    .line 809
    .line 810
    .line 811
    move-wide v3, v4

    .line 812
    move-wide/from16 v33, v9

    .line 813
    .line 814
    move/from16 v9, v25

    .line 815
    .line 816
    const v5, 0xffff

    .line 817
    .line 818
    .line 819
    goto :goto_21

    .line 820
    :cond_3c
    if-eqz v17, :cond_3d

    .line 821
    .line 822
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 823
    .line 824
    .line 825
    move-result-wide v28

    .line 826
    and-long v28, v28, v9

    .line 827
    .line 828
    shl-long v28, v28, v19

    .line 829
    .line 830
    or-long v28, v20, v28

    .line 831
    .line 832
    move-wide/from16 v33, v9

    .line 833
    .line 834
    shr-long v9, v30, v25

    .line 835
    .line 836
    long-to-int v9, v9

    .line 837
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 838
    .line 839
    .line 840
    move-result v9

    .line 841
    float-to-int v9, v9

    .line 842
    int-to-short v9, v9

    .line 843
    move-wide/from16 v35, v4

    .line 844
    .line 845
    const v5, 0xffff

    .line 846
    .line 847
    .line 848
    and-long v3, v30, v26

    .line 849
    .line 850
    long-to-int v3, v3

    .line 851
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    float-to-int v3, v3

    .line 856
    int-to-short v3, v3

    .line 857
    shl-int/lit8 v4, v9, 0x10

    .line 858
    .line 859
    and-int/2addr v3, v5

    .line 860
    or-int/2addr v3, v4

    .line 861
    int-to-long v3, v3

    .line 862
    shl-long v3, v3, v25

    .line 863
    .line 864
    or-long v3, v28, v3

    .line 865
    .line 866
    new-instance v9, Ls1/g;

    .line 867
    .line 868
    invoke-direct {v9, v3, v4}, Ls1/g;-><init>(J)V

    .line 869
    .line 870
    .line 871
    move-wide/from16 v3, v35

    .line 872
    .line 873
    invoke-virtual {v11, v9, v3, v4}, Lf/p;->b(Ljava/lang/Object;J)V

    .line 874
    .line 875
    .line 876
    :goto_20
    move/from16 v9, v25

    .line 877
    .line 878
    goto :goto_21

    .line 879
    :cond_3d
    move-wide v3, v4

    .line 880
    move-wide/from16 v33, v9

    .line 881
    .line 882
    const v5, 0xffff

    .line 883
    .line 884
    .line 885
    goto :goto_20

    .line 886
    :goto_21
    new-instance v25, Lp1/b;

    .line 887
    .line 888
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 889
    .line 890
    .line 891
    move-result-wide v28

    .line 892
    move-wide/from16 v34, v33

    .line 893
    .line 894
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 895
    .line 896
    .line 897
    move-result v33

    .line 898
    move/from16 v36, v5

    .line 899
    .line 900
    move v10, v6

    .line 901
    if-eqz v2, :cond_3e

    .line 902
    .line 903
    iget-wide v5, v2, Ls1/g;->a:J

    .line 904
    .line 905
    shr-long v5, v5, v19

    .line 906
    .line 907
    and-long v5, v5, v34

    .line 908
    .line 909
    :goto_22
    move-wide/from16 v34, v5

    .line 910
    .line 911
    goto :goto_23

    .line 912
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 913
    .line 914
    .line 915
    move-result-wide v5

    .line 916
    goto :goto_22

    .line 917
    :goto_23
    if-eqz v2, :cond_3f

    .line 918
    .line 919
    iget-wide v5, v2, Ls1/g;->a:J

    .line 920
    .line 921
    ushr-long/2addr v5, v9

    .line 922
    long-to-int v5, v5

    .line 923
    ushr-int/lit8 v6, v5, 0x10

    .line 924
    .line 925
    int-to-short v6, v6

    .line 926
    int-to-float v6, v6

    .line 927
    and-int v5, v5, v36

    .line 928
    .line 929
    int-to-short v5, v5

    .line 930
    int-to-float v5, v5

    .line 931
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 932
    .line 933
    .line 934
    move-result v6

    .line 935
    move/from16 v36, v9

    .line 936
    .line 937
    move/from16 v39, v10

    .line 938
    .line 939
    int-to-long v9, v6

    .line 940
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    int-to-long v5, v5

    .line 945
    shl-long v9, v9, v36

    .line 946
    .line 947
    and-long v5, v5, v26

    .line 948
    .line 949
    or-long/2addr v5, v9

    .line 950
    move-wide/from16 v36, v5

    .line 951
    .line 952
    goto :goto_24

    .line 953
    :cond_3f
    move/from16 v39, v10

    .line 954
    .line 955
    move-wide/from16 v36, v30

    .line 956
    .line 957
    :goto_24
    if-eqz v2, :cond_41

    .line 958
    .line 959
    iget-wide v5, v2, Ls1/g;->a:J

    .line 960
    .line 961
    and-long v5, v5, v20

    .line 962
    .line 963
    const-wide/16 v9, 0x0

    .line 964
    .line 965
    cmp-long v2, v5, v9

    .line 966
    .line 967
    if-eqz v2, :cond_40

    .line 968
    .line 969
    move/from16 v2, v19

    .line 970
    .line 971
    goto :goto_25

    .line 972
    :cond_40
    const/4 v2, 0x0

    .line 973
    :goto_25
    move/from16 v38, v2

    .line 974
    .line 975
    :goto_26
    move-wide/from16 v26, v3

    .line 976
    .line 977
    goto :goto_27

    .line 978
    :cond_41
    const/16 v38, 0x0

    .line 979
    .line 980
    goto :goto_26

    .line 981
    :goto_27
    invoke-direct/range {v25 .. v38}, Lp1/b;-><init>(JJJZFJJZ)V

    .line 982
    .line 983
    .line 984
    move-object/from16 v2, v25

    .line 985
    .line 986
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    add-int/lit8 v7, v7, 0x1

    .line 990
    .line 991
    move-object v10, v15

    .line 992
    move/from16 v9, v19

    .line 993
    .line 994
    move-object/from16 v5, v22

    .line 995
    .line 996
    move-object/from16 v3, v24

    .line 997
    .line 998
    move/from16 v6, v39

    .line 999
    .line 1000
    const/high16 v2, 0x200000

    .line 1001
    .line 1002
    const/4 v4, 0x0

    .line 1003
    const/4 v15, 0x2

    .line 1004
    goto/16 :goto_1d

    .line 1005
    .line 1006
    :cond_42
    move-object/from16 v24, v3

    .line 1007
    .line 1008
    move-object/from16 v22, v5

    .line 1009
    .line 1010
    move/from16 v19, v9

    .line 1011
    .line 1012
    move-object v15, v10

    .line 1013
    invoke-virtual {v15, v1}, Ls1/h;->e(Landroid/view/MotionEvent;)V

    .line 1014
    .line 1015
    .line 1016
    if-eqz v24, :cond_43

    .line 1017
    .line 1018
    move-object/from16 v2, v24

    .line 1019
    .line 1020
    iget v2, v2, Lp1/a;->a:I

    .line 1021
    .line 1022
    goto :goto_2c

    .line 1023
    :cond_43
    const/high16 v2, 0x200000

    .line 1024
    .line 1025
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v3

    .line 1029
    if-eqz v3, :cond_8f

    .line 1030
    .line 1031
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    if-eqz v2, :cond_49

    .line 1036
    .line 1037
    const/4 v9, 0x0

    .line 1038
    invoke-virtual {v2, v9}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    move/from16 v4, v19

    .line 1043
    .line 1044
    invoke-virtual {v2, v4}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    if-eqz v3, :cond_44

    .line 1049
    .line 1050
    if-nez v2, :cond_44

    .line 1051
    .line 1052
    :goto_28
    const/4 v2, 0x1

    .line 1053
    goto :goto_2c

    .line 1054
    :cond_44
    if-eqz v2, :cond_45

    .line 1055
    .line 1056
    if-nez v3, :cond_45

    .line 1057
    .line 1058
    :goto_29
    const/4 v2, 0x2

    .line 1059
    goto :goto_2c

    .line 1060
    :cond_45
    if-eqz v3, :cond_49

    .line 1061
    .line 1062
    if-eqz v2, :cond_49

    .line 1063
    .line 1064
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1065
    .line 1066
    .line 1067
    move-result v3

    .line 1068
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    cmpl-float v4, v3, v2

    .line 1073
    .line 1074
    const/high16 v5, 0x40a00000    # 5.0f

    .line 1075
    .line 1076
    const/4 v6, 0x0

    .line 1077
    if-lez v4, :cond_47

    .line 1078
    .line 1079
    cmpg-float v4, v2, v6

    .line 1080
    .line 1081
    if-nez v4, :cond_46

    .line 1082
    .line 1083
    goto :goto_2a

    .line 1084
    :cond_46
    div-float v4, v3, v2

    .line 1085
    .line 1086
    cmpl-float v4, v4, v5

    .line 1087
    .line 1088
    if-ltz v4, :cond_47

    .line 1089
    .line 1090
    :goto_2a
    goto :goto_28

    .line 1091
    :cond_47
    cmpl-float v4, v2, v3

    .line 1092
    .line 1093
    if-lez v4, :cond_49

    .line 1094
    .line 1095
    cmpg-float v4, v3, v6

    .line 1096
    .line 1097
    if-nez v4, :cond_48

    .line 1098
    .line 1099
    goto :goto_2b

    .line 1100
    :cond_48
    div-float/2addr v2, v3

    .line 1101
    cmpl-float v2, v2, v5

    .line 1102
    .line 1103
    if-ltz v2, :cond_49

    .line 1104
    .line 1105
    :goto_2b
    goto :goto_29

    .line 1106
    :cond_49
    const/4 v2, 0x0

    .line 1107
    :goto_2c
    new-instance v3, Lac/k;

    .line 1108
    .line 1109
    if-eqz v13, :cond_4a

    .line 1110
    .line 1111
    const/4 v4, 0x1

    .line 1112
    if-eq v13, v4, :cond_4a

    .line 1113
    .line 1114
    const/4 v4, 0x2

    .line 1115
    if-eq v13, v4, :cond_4a

    .line 1116
    .line 1117
    const/4 v4, 0x5

    .line 1118
    if-eq v13, v4, :cond_4a

    .line 1119
    .line 1120
    const/4 v4, 0x6

    .line 1121
    :cond_4a
    invoke-direct {v3, v14, v2, v1}, Lac/k;-><init>(Ljava/util/ArrayList;ILandroid/view/MotionEvent;)V

    .line 1122
    .line 1123
    .line 1124
    :goto_2d
    iget-object v1, v0, Ly1/t;->L0:Ly1/q1;

    .line 1125
    .line 1126
    if-eqz v3, :cond_71

    .line 1127
    .line 1128
    invoke-virtual {v0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    check-cast v2, Ld1/p;

    .line 1133
    .line 1134
    iget-object v4, v2, Ld1/p;->d:Ld1/i;

    .line 1135
    .line 1136
    iget-boolean v4, v4, Ld1/i;->e:Z

    .line 1137
    .line 1138
    if-eqz v4, :cond_4c

    .line 1139
    .line 1140
    const-string v2, "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."

    .line 1141
    .line 1142
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 1143
    .line 1144
    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    :cond_4b
    const/4 v2, 0x0

    .line 1148
    goto/16 :goto_43

    .line 1149
    .line 1150
    :cond_4c
    invoke-virtual {v2}, Ld1/p;->f()Ld1/b0;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    if-eqz v2, :cond_59

    .line 1155
    .line 1156
    iget-object v4, v2, Ly0/n;->g:Ly0/n;

    .line 1157
    .line 1158
    iget-boolean v4, v4, Ly0/n;->t:Z

    .line 1159
    .line 1160
    if-nez v4, :cond_4d

    .line 1161
    .line 1162
    invoke-static/range {v22 .. v22}, Lu1/a;->b(Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    :cond_4d
    iget-object v4, v2, Ly0/n;->g:Ly0/n;

    .line 1166
    .line 1167
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    :goto_2e
    if-eqz v2, :cond_58

    .line 1172
    .line 1173
    iget-object v5, v2, Lx1/f0;->L:Lx1/b1;

    .line 1174
    .line 1175
    iget-object v5, v5, Lx1/b1;->f:Ly0/n;

    .line 1176
    .line 1177
    iget v5, v5, Ly0/n;->j:I

    .line 1178
    .line 1179
    const/high16 v23, 0x200000

    .line 1180
    .line 1181
    and-int v5, v5, v23

    .line 1182
    .line 1183
    if-eqz v5, :cond_56

    .line 1184
    .line 1185
    :goto_2f
    if-eqz v4, :cond_56

    .line 1186
    .line 1187
    iget v5, v4, Ly0/n;->i:I

    .line 1188
    .line 1189
    and-int v5, v5, v23

    .line 1190
    .line 1191
    if-eqz v5, :cond_55

    .line 1192
    .line 1193
    move-object v5, v4

    .line 1194
    const/4 v6, 0x0

    .line 1195
    :goto_30
    if-eqz v5, :cond_55

    .line 1196
    .line 1197
    instance-of v7, v5, Lp1/c;

    .line 1198
    .line 1199
    if-eqz v7, :cond_4e

    .line 1200
    .line 1201
    goto :goto_35

    .line 1202
    :cond_4e
    iget v7, v5, Ly0/n;->i:I

    .line 1203
    .line 1204
    and-int v7, v7, v23

    .line 1205
    .line 1206
    if-eqz v7, :cond_54

    .line 1207
    .line 1208
    instance-of v7, v5, Lx1/j;

    .line 1209
    .line 1210
    if-eqz v7, :cond_54

    .line 1211
    .line 1212
    move-object v7, v5

    .line 1213
    check-cast v7, Lx1/j;

    .line 1214
    .line 1215
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

    .line 1216
    .line 1217
    const/4 v8, 0x0

    .line 1218
    :goto_31
    if-eqz v7, :cond_53

    .line 1219
    .line 1220
    iget v10, v7, Ly0/n;->i:I

    .line 1221
    .line 1222
    and-int v10, v10, v23

    .line 1223
    .line 1224
    if-eqz v10, :cond_52

    .line 1225
    .line 1226
    add-int/lit8 v8, v8, 0x1

    .line 1227
    .line 1228
    const/4 v10, 0x1

    .line 1229
    if-ne v8, v10, :cond_4f

    .line 1230
    .line 1231
    move-object v5, v7

    .line 1232
    goto :goto_32

    .line 1233
    :cond_4f
    if-nez v6, :cond_50

    .line 1234
    .line 1235
    new-instance v6, Lj0/b;

    .line 1236
    .line 1237
    move/from16 v10, v18

    .line 1238
    .line 1239
    new-array v11, v10, [Ly0/n;

    .line 1240
    .line 1241
    invoke-direct {v6, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 1242
    .line 1243
    .line 1244
    :cond_50
    if-eqz v5, :cond_51

    .line 1245
    .line 1246
    invoke-virtual {v6, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1247
    .line 1248
    .line 1249
    const/4 v5, 0x0

    .line 1250
    :cond_51
    invoke-virtual {v6, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    :cond_52
    :goto_32
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 1254
    .line 1255
    const/16 v18, 0x10

    .line 1256
    .line 1257
    const/high16 v23, 0x200000

    .line 1258
    .line 1259
    goto :goto_31

    .line 1260
    :cond_53
    const/4 v10, 0x1

    .line 1261
    if-ne v8, v10, :cond_54

    .line 1262
    .line 1263
    :goto_33
    const/16 v18, 0x10

    .line 1264
    .line 1265
    const/high16 v23, 0x200000

    .line 1266
    .line 1267
    goto :goto_30

    .line 1268
    :cond_54
    invoke-static {v6}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v5

    .line 1272
    goto :goto_33

    .line 1273
    :cond_55
    iget-object v4, v4, Ly0/n;->k:Ly0/n;

    .line 1274
    .line 1275
    const/16 v18, 0x10

    .line 1276
    .line 1277
    const/high16 v23, 0x200000

    .line 1278
    .line 1279
    goto :goto_2f

    .line 1280
    :cond_56
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    if-eqz v2, :cond_57

    .line 1285
    .line 1286
    iget-object v4, v2, Lx1/f0;->L:Lx1/b1;

    .line 1287
    .line 1288
    if-eqz v4, :cond_57

    .line 1289
    .line 1290
    iget-object v4, v4, Lx1/b1;->e:Lx1/b2;

    .line 1291
    .line 1292
    goto :goto_34

    .line 1293
    :cond_57
    const/4 v4, 0x0

    .line 1294
    :goto_34
    const/16 v18, 0x10

    .line 1295
    .line 1296
    goto :goto_2e

    .line 1297
    :cond_58
    const/4 v5, 0x0

    .line 1298
    :goto_35
    check-cast v5, Lp1/c;

    .line 1299
    .line 1300
    goto :goto_36

    .line 1301
    :cond_59
    const/4 v5, 0x0

    .line 1302
    :goto_36
    if-eqz v5, :cond_6c

    .line 1303
    .line 1304
    move-object v2, v5

    .line 1305
    check-cast v2, Ly0/n;

    .line 1306
    .line 1307
    iget-object v4, v2, Ly0/n;->g:Ly0/n;

    .line 1308
    .line 1309
    iget-boolean v4, v4, Ly0/n;->t:Z

    .line 1310
    .line 1311
    if-nez v4, :cond_5a

    .line 1312
    .line 1313
    invoke-static/range {v22 .. v22}, Lu1/a;->b(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    :cond_5a
    iget-object v2, v2, Ly0/n;->g:Ly0/n;

    .line 1317
    .line 1318
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 1319
    .line 1320
    invoke-static {v5}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v4

    .line 1324
    const/4 v6, 0x0

    .line 1325
    :goto_37
    if-eqz v4, :cond_66

    .line 1326
    .line 1327
    iget-object v7, v4, Lx1/f0;->L:Lx1/b1;

    .line 1328
    .line 1329
    iget-object v7, v7, Lx1/b1;->f:Ly0/n;

    .line 1330
    .line 1331
    iget v7, v7, Ly0/n;->j:I

    .line 1332
    .line 1333
    const/high16 v23, 0x200000

    .line 1334
    .line 1335
    and-int v7, v7, v23

    .line 1336
    .line 1337
    if-eqz v7, :cond_64

    .line 1338
    .line 1339
    :goto_38
    if-eqz v2, :cond_64

    .line 1340
    .line 1341
    iget v7, v2, Ly0/n;->i:I

    .line 1342
    .line 1343
    and-int v7, v7, v23

    .line 1344
    .line 1345
    if-eqz v7, :cond_63

    .line 1346
    .line 1347
    move-object v7, v2

    .line 1348
    const/4 v8, 0x0

    .line 1349
    :goto_39
    if-eqz v7, :cond_63

    .line 1350
    .line 1351
    instance-of v10, v7, Lp1/c;

    .line 1352
    .line 1353
    if-eqz v10, :cond_5c

    .line 1354
    .line 1355
    if-nez v6, :cond_5b

    .line 1356
    .line 1357
    new-instance v6, Ljava/util/ArrayList;

    .line 1358
    .line 1359
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1360
    .line 1361
    .line 1362
    :cond_5b
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1363
    .line 1364
    .line 1365
    const/4 v10, 0x0

    .line 1366
    goto :goto_3a

    .line 1367
    :cond_5c
    const/4 v10, 0x1

    .line 1368
    :goto_3a
    if-eqz v10, :cond_62

    .line 1369
    .line 1370
    iget v10, v7, Ly0/n;->i:I

    .line 1371
    .line 1372
    const/high16 v23, 0x200000

    .line 1373
    .line 1374
    and-int v10, v10, v23

    .line 1375
    .line 1376
    if-eqz v10, :cond_62

    .line 1377
    .line 1378
    instance-of v10, v7, Lx1/j;

    .line 1379
    .line 1380
    if-eqz v10, :cond_62

    .line 1381
    .line 1382
    move-object v10, v7

    .line 1383
    check-cast v10, Lx1/j;

    .line 1384
    .line 1385
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 1386
    .line 1387
    move-object v11, v10

    .line 1388
    const/4 v10, 0x0

    .line 1389
    :goto_3b
    if-eqz v11, :cond_61

    .line 1390
    .line 1391
    iget v12, v11, Ly0/n;->i:I

    .line 1392
    .line 1393
    and-int v12, v12, v23

    .line 1394
    .line 1395
    if-eqz v12, :cond_60

    .line 1396
    .line 1397
    add-int/lit8 v10, v10, 0x1

    .line 1398
    .line 1399
    const/4 v12, 0x1

    .line 1400
    if-ne v10, v12, :cond_5d

    .line 1401
    .line 1402
    move-object v7, v11

    .line 1403
    goto :goto_3c

    .line 1404
    :cond_5d
    if-nez v8, :cond_5e

    .line 1405
    .line 1406
    new-instance v8, Lj0/b;

    .line 1407
    .line 1408
    const/16 v12, 0x10

    .line 1409
    .line 1410
    new-array v13, v12, [Ly0/n;

    .line 1411
    .line 1412
    invoke-direct {v8, v13}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    :cond_5e
    if-eqz v7, :cond_5f

    .line 1416
    .line 1417
    invoke-virtual {v8, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1418
    .line 1419
    .line 1420
    const/4 v7, 0x0

    .line 1421
    :cond_5f
    invoke-virtual {v8, v11}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1422
    .line 1423
    .line 1424
    :cond_60
    :goto_3c
    iget-object v11, v11, Ly0/n;->l:Ly0/n;

    .line 1425
    .line 1426
    const/high16 v23, 0x200000

    .line 1427
    .line 1428
    goto :goto_3b

    .line 1429
    :cond_61
    const/4 v12, 0x1

    .line 1430
    if-ne v10, v12, :cond_62

    .line 1431
    .line 1432
    goto :goto_39

    .line 1433
    :cond_62
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v7

    .line 1437
    goto :goto_39

    .line 1438
    :cond_63
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 1439
    .line 1440
    const/high16 v23, 0x200000

    .line 1441
    .line 1442
    goto :goto_38

    .line 1443
    :cond_64
    invoke-virtual {v4}, Lx1/f0;->u()Lx1/f0;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v4

    .line 1447
    if-eqz v4, :cond_65

    .line 1448
    .line 1449
    iget-object v2, v4, Lx1/f0;->L:Lx1/b1;

    .line 1450
    .line 1451
    if-eqz v2, :cond_65

    .line 1452
    .line 1453
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 1454
    .line 1455
    goto/16 :goto_37

    .line 1456
    .line 1457
    :cond_65
    const/4 v2, 0x0

    .line 1458
    goto/16 :goto_37

    .line 1459
    .line 1460
    :cond_66
    sget-object v2, Ls1/l;->g:Ls1/l;

    .line 1461
    .line 1462
    if-eqz v6, :cond_68

    .line 1463
    .line 1464
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 1465
    .line 1466
    .line 1467
    move-result v4

    .line 1468
    add-int/lit8 v4, v4, -0x1

    .line 1469
    .line 1470
    if-ltz v4, :cond_68

    .line 1471
    .line 1472
    :goto_3d
    add-int/lit8 v7, v4, -0x1

    .line 1473
    .line 1474
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v4

    .line 1478
    check-cast v4, Lp1/c;

    .line 1479
    .line 1480
    invoke-interface {v4, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1481
    .line 1482
    .line 1483
    if-gez v7, :cond_67

    .line 1484
    .line 1485
    goto :goto_3e

    .line 1486
    :cond_67
    move v4, v7

    .line 1487
    goto :goto_3d

    .line 1488
    :cond_68
    :goto_3e
    invoke-interface {v5, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1489
    .line 1490
    .line 1491
    sget-object v2, Ls1/l;->h:Ls1/l;

    .line 1492
    .line 1493
    invoke-interface {v5, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1494
    .line 1495
    .line 1496
    if-eqz v6, :cond_69

    .line 1497
    .line 1498
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 1499
    .line 1500
    .line 1501
    move-result v4

    .line 1502
    const/4 v7, 0x0

    .line 1503
    :goto_3f
    if-ge v7, v4, :cond_69

    .line 1504
    .line 1505
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v8

    .line 1509
    check-cast v8, Lp1/c;

    .line 1510
    .line 1511
    invoke-interface {v8, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1512
    .line 1513
    .line 1514
    add-int/lit8 v7, v7, 0x1

    .line 1515
    .line 1516
    goto :goto_3f

    .line 1517
    :cond_69
    sget-object v2, Ls1/l;->i:Ls1/l;

    .line 1518
    .line 1519
    if-eqz v6, :cond_6b

    .line 1520
    .line 1521
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 1522
    .line 1523
    .line 1524
    move-result v4

    .line 1525
    add-int/lit8 v4, v4, -0x1

    .line 1526
    .line 1527
    if-ltz v4, :cond_6b

    .line 1528
    .line 1529
    :goto_40
    add-int/lit8 v7, v4, -0x1

    .line 1530
    .line 1531
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v4

    .line 1535
    check-cast v4, Lp1/c;

    .line 1536
    .line 1537
    invoke-interface {v4, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1538
    .line 1539
    .line 1540
    if-gez v7, :cond_6a

    .line 1541
    .line 1542
    goto :goto_41

    .line 1543
    :cond_6a
    move v4, v7

    .line 1544
    goto :goto_40

    .line 1545
    :cond_6b
    :goto_41
    invoke-interface {v5, v3, v2}, Lp1/c;->T0(Lac/k;Ls1/l;)V

    .line 1546
    .line 1547
    .line 1548
    :cond_6c
    iget-object v2, v3, Lac/k;->i:Ljava/lang/Object;

    .line 1549
    .line 1550
    check-cast v2, Ljava/util/ArrayList;

    .line 1551
    .line 1552
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1553
    .line 1554
    .line 1555
    move-result v4

    .line 1556
    const/4 v5, 0x0

    .line 1557
    :goto_42
    if-ge v5, v4, :cond_4b

    .line 1558
    .line 1559
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v6

    .line 1563
    check-cast v6, Lp1/b;

    .line 1564
    .line 1565
    iget-boolean v6, v6, Lp1/b;->i:Z

    .line 1566
    .line 1567
    if-eqz v6, :cond_6d

    .line 1568
    .line 1569
    const/4 v2, 0x1

    .line 1570
    goto :goto_43

    .line 1571
    :cond_6d
    add-int/lit8 v5, v5, 0x1

    .line 1572
    .line 1573
    goto :goto_42

    .line 1574
    :goto_43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1575
    .line 1576
    .line 1577
    iget-object v4, v3, Lac/k;->j:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v4, Landroid/view/MotionEvent;

    .line 1580
    .line 1581
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getAction()I

    .line 1582
    .line 1583
    .line 1584
    move-result v5

    .line 1585
    if-eqz v5, :cond_6f

    .line 1586
    .line 1587
    const/4 v10, 0x1

    .line 1588
    if-eq v5, v10, :cond_6e

    .line 1589
    .line 1590
    const/4 v3, 0x2

    .line 1591
    if-eq v5, v3, :cond_6e

    .line 1592
    .line 1593
    goto :goto_44

    .line 1594
    :cond_6e
    if-eqz v2, :cond_70

    .line 1595
    .line 1596
    const/4 v9, 0x0

    .line 1597
    iput v9, v1, Ly1/q1;->b:I

    .line 1598
    .line 1599
    iput-boolean v10, v1, Ly1/q1;->c:Z

    .line 1600
    .line 1601
    goto :goto_44

    .line 1602
    :cond_6f
    const/4 v9, 0x0

    .line 1603
    const/4 v10, 0x1

    .line 1604
    iget v2, v3, Lac/k;->h:I

    .line 1605
    .line 1606
    iput v2, v1, Ly1/q1;->b:I

    .line 1607
    .line 1608
    iput-boolean v9, v1, Ly1/q1;->c:Z

    .line 1609
    .line 1610
    :cond_70
    :goto_44
    iget-object v1, v1, Ly1/q1;->d:Landroid/view/GestureDetector;

    .line 1611
    .line 1612
    invoke-virtual {v1, v4}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1613
    .line 1614
    .line 1615
    return v10

    .line 1616
    :cond_71
    invoke-virtual {v0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v2

    .line 1620
    check-cast v2, Ld1/p;

    .line 1621
    .line 1622
    invoke-virtual {v2}, Ld1/p;->f()Ld1/b0;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v2

    .line 1626
    if-eqz v2, :cond_7e

    .line 1627
    .line 1628
    iget-object v3, v2, Ly0/n;->g:Ly0/n;

    .line 1629
    .line 1630
    iget-boolean v3, v3, Ly0/n;->t:Z

    .line 1631
    .line 1632
    if-nez v3, :cond_72

    .line 1633
    .line 1634
    invoke-static/range {v22 .. v22}, Lu1/a;->b(Ljava/lang/String;)V

    .line 1635
    .line 1636
    .line 1637
    :cond_72
    iget-object v3, v2, Ly0/n;->g:Ly0/n;

    .line 1638
    .line 1639
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    :goto_45
    if-eqz v2, :cond_7d

    .line 1644
    .line 1645
    iget-object v4, v2, Lx1/f0;->L:Lx1/b1;

    .line 1646
    .line 1647
    iget-object v4, v4, Lx1/b1;->f:Ly0/n;

    .line 1648
    .line 1649
    iget v4, v4, Ly0/n;->j:I

    .line 1650
    .line 1651
    const/high16 v23, 0x200000

    .line 1652
    .line 1653
    and-int v4, v4, v23

    .line 1654
    .line 1655
    if-eqz v4, :cond_7b

    .line 1656
    .line 1657
    :goto_46
    if-eqz v3, :cond_7b

    .line 1658
    .line 1659
    iget v4, v3, Ly0/n;->i:I

    .line 1660
    .line 1661
    and-int v4, v4, v23

    .line 1662
    .line 1663
    if-eqz v4, :cond_7a

    .line 1664
    .line 1665
    move-object v4, v3

    .line 1666
    const/4 v5, 0x0

    .line 1667
    :goto_47
    if-eqz v4, :cond_7a

    .line 1668
    .line 1669
    instance-of v6, v4, Lp1/c;

    .line 1670
    .line 1671
    if-eqz v6, :cond_73

    .line 1672
    .line 1673
    goto :goto_4b

    .line 1674
    :cond_73
    iget v6, v4, Ly0/n;->i:I

    .line 1675
    .line 1676
    and-int v6, v6, v23

    .line 1677
    .line 1678
    if-eqz v6, :cond_79

    .line 1679
    .line 1680
    instance-of v6, v4, Lx1/j;

    .line 1681
    .line 1682
    if-eqz v6, :cond_79

    .line 1683
    .line 1684
    move-object v6, v4

    .line 1685
    check-cast v6, Lx1/j;

    .line 1686
    .line 1687
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 1688
    .line 1689
    const/4 v7, 0x0

    .line 1690
    :goto_48
    if-eqz v6, :cond_78

    .line 1691
    .line 1692
    iget v8, v6, Ly0/n;->i:I

    .line 1693
    .line 1694
    and-int v8, v8, v23

    .line 1695
    .line 1696
    if-eqz v8, :cond_77

    .line 1697
    .line 1698
    add-int/lit8 v7, v7, 0x1

    .line 1699
    .line 1700
    const/4 v10, 0x1

    .line 1701
    if-ne v7, v10, :cond_74

    .line 1702
    .line 1703
    move-object v4, v6

    .line 1704
    goto :goto_49

    .line 1705
    :cond_74
    if-nez v5, :cond_75

    .line 1706
    .line 1707
    new-instance v5, Lj0/b;

    .line 1708
    .line 1709
    const/16 v10, 0x10

    .line 1710
    .line 1711
    new-array v8, v10, [Ly0/n;

    .line 1712
    .line 1713
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 1714
    .line 1715
    .line 1716
    :cond_75
    if-eqz v4, :cond_76

    .line 1717
    .line 1718
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1719
    .line 1720
    .line 1721
    const/4 v4, 0x0

    .line 1722
    :cond_76
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1723
    .line 1724
    .line 1725
    :cond_77
    :goto_49
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 1726
    .line 1727
    const/high16 v23, 0x200000

    .line 1728
    .line 1729
    goto :goto_48

    .line 1730
    :cond_78
    const/4 v10, 0x1

    .line 1731
    if-ne v7, v10, :cond_79

    .line 1732
    .line 1733
    :goto_4a
    const/high16 v23, 0x200000

    .line 1734
    .line 1735
    goto :goto_47

    .line 1736
    :cond_79
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v4

    .line 1740
    goto :goto_4a

    .line 1741
    :cond_7a
    iget-object v3, v3, Ly0/n;->k:Ly0/n;

    .line 1742
    .line 1743
    const/high16 v23, 0x200000

    .line 1744
    .line 1745
    goto :goto_46

    .line 1746
    :cond_7b
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    if-eqz v2, :cond_7c

    .line 1751
    .line 1752
    iget-object v3, v2, Lx1/f0;->L:Lx1/b1;

    .line 1753
    .line 1754
    if-eqz v3, :cond_7c

    .line 1755
    .line 1756
    iget-object v3, v3, Lx1/b1;->e:Lx1/b2;

    .line 1757
    .line 1758
    goto :goto_45

    .line 1759
    :cond_7c
    const/4 v3, 0x0

    .line 1760
    goto :goto_45

    .line 1761
    :cond_7d
    const/4 v4, 0x0

    .line 1762
    :goto_4b
    check-cast v4, Lp1/c;

    .line 1763
    .line 1764
    goto :goto_4c

    .line 1765
    :cond_7e
    const/4 v4, 0x0

    .line 1766
    :goto_4c
    if-eqz v4, :cond_8e

    .line 1767
    .line 1768
    move-object v2, v4

    .line 1769
    check-cast v2, Ly0/n;

    .line 1770
    .line 1771
    iget-object v3, v2, Ly0/n;->g:Ly0/n;

    .line 1772
    .line 1773
    iget-boolean v3, v3, Ly0/n;->t:Z

    .line 1774
    .line 1775
    if-nez v3, :cond_7f

    .line 1776
    .line 1777
    invoke-static/range {v22 .. v22}, Lu1/a;->b(Ljava/lang/String;)V

    .line 1778
    .line 1779
    .line 1780
    :cond_7f
    iget-object v2, v2, Ly0/n;->g:Ly0/n;

    .line 1781
    .line 1782
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 1783
    .line 1784
    invoke-static {v4}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v3

    .line 1788
    const/4 v5, 0x0

    .line 1789
    :goto_4d
    if-eqz v3, :cond_8d

    .line 1790
    .line 1791
    iget-object v6, v3, Lx1/f0;->L:Lx1/b1;

    .line 1792
    .line 1793
    iget-object v6, v6, Lx1/b1;->f:Ly0/n;

    .line 1794
    .line 1795
    iget v6, v6, Ly0/n;->j:I

    .line 1796
    .line 1797
    const/high16 v23, 0x200000

    .line 1798
    .line 1799
    and-int v6, v6, v23

    .line 1800
    .line 1801
    if-eqz v6, :cond_8b

    .line 1802
    .line 1803
    :goto_4e
    if-eqz v2, :cond_8b

    .line 1804
    .line 1805
    iget v6, v2, Ly0/n;->i:I

    .line 1806
    .line 1807
    and-int v6, v6, v23

    .line 1808
    .line 1809
    if-eqz v6, :cond_8a

    .line 1810
    .line 1811
    move-object v6, v2

    .line 1812
    const/4 v7, 0x0

    .line 1813
    :goto_4f
    if-eqz v6, :cond_8a

    .line 1814
    .line 1815
    instance-of v8, v6, Lp1/c;

    .line 1816
    .line 1817
    if-eqz v8, :cond_81

    .line 1818
    .line 1819
    if-nez v5, :cond_80

    .line 1820
    .line 1821
    new-instance v5, Ljava/util/ArrayList;

    .line 1822
    .line 1823
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1824
    .line 1825
    .line 1826
    :cond_80
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1827
    .line 1828
    .line 1829
    const/4 v8, 0x0

    .line 1830
    goto :goto_50

    .line 1831
    :cond_81
    const/4 v8, 0x1

    .line 1832
    :goto_50
    if-eqz v8, :cond_88

    .line 1833
    .line 1834
    iget v8, v6, Ly0/n;->i:I

    .line 1835
    .line 1836
    const/high16 v23, 0x200000

    .line 1837
    .line 1838
    and-int v8, v8, v23

    .line 1839
    .line 1840
    if-eqz v8, :cond_87

    .line 1841
    .line 1842
    instance-of v8, v6, Lx1/j;

    .line 1843
    .line 1844
    if-eqz v8, :cond_87

    .line 1845
    .line 1846
    move-object v8, v6

    .line 1847
    check-cast v8, Lx1/j;

    .line 1848
    .line 1849
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 1850
    .line 1851
    const/4 v10, 0x0

    .line 1852
    :goto_51
    if-eqz v8, :cond_86

    .line 1853
    .line 1854
    iget v11, v8, Ly0/n;->i:I

    .line 1855
    .line 1856
    and-int v11, v11, v23

    .line 1857
    .line 1858
    if-eqz v11, :cond_82

    .line 1859
    .line 1860
    add-int/lit8 v10, v10, 0x1

    .line 1861
    .line 1862
    const/4 v12, 0x1

    .line 1863
    if-ne v10, v12, :cond_83

    .line 1864
    .line 1865
    move-object v6, v8

    .line 1866
    :cond_82
    const/16 v12, 0x10

    .line 1867
    .line 1868
    goto :goto_53

    .line 1869
    :cond_83
    if-nez v7, :cond_84

    .line 1870
    .line 1871
    new-instance v7, Lj0/b;

    .line 1872
    .line 1873
    const/16 v12, 0x10

    .line 1874
    .line 1875
    new-array v11, v12, [Ly0/n;

    .line 1876
    .line 1877
    invoke-direct {v7, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 1878
    .line 1879
    .line 1880
    goto :goto_52

    .line 1881
    :cond_84
    const/16 v12, 0x10

    .line 1882
    .line 1883
    :goto_52
    if-eqz v6, :cond_85

    .line 1884
    .line 1885
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1886
    .line 1887
    .line 1888
    const/4 v6, 0x0

    .line 1889
    :cond_85
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1890
    .line 1891
    .line 1892
    :goto_53
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 1893
    .line 1894
    goto :goto_51

    .line 1895
    :cond_86
    const/4 v8, 0x1

    .line 1896
    const/16 v12, 0x10

    .line 1897
    .line 1898
    if-ne v10, v8, :cond_89

    .line 1899
    .line 1900
    goto :goto_4f

    .line 1901
    :cond_87
    const/16 v12, 0x10

    .line 1902
    .line 1903
    goto :goto_54

    .line 1904
    :cond_88
    const/16 v12, 0x10

    .line 1905
    .line 1906
    const/high16 v23, 0x200000

    .line 1907
    .line 1908
    :cond_89
    :goto_54
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v6

    .line 1912
    goto :goto_4f

    .line 1913
    :cond_8a
    const/16 v12, 0x10

    .line 1914
    .line 1915
    const/high16 v23, 0x200000

    .line 1916
    .line 1917
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 1918
    .line 1919
    goto :goto_4e

    .line 1920
    :cond_8b
    const/16 v12, 0x10

    .line 1921
    .line 1922
    invoke-virtual {v3}, Lx1/f0;->u()Lx1/f0;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v3

    .line 1926
    if-eqz v3, :cond_8c

    .line 1927
    .line 1928
    iget-object v2, v3, Lx1/f0;->L:Lx1/b1;

    .line 1929
    .line 1930
    if-eqz v2, :cond_8c

    .line 1931
    .line 1932
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 1933
    .line 1934
    goto/16 :goto_4d

    .line 1935
    .line 1936
    :cond_8c
    const/4 v2, 0x0

    .line 1937
    goto/16 :goto_4d

    .line 1938
    .line 1939
    :cond_8d
    invoke-interface {v4}, Lp1/c;->y0()V

    .line 1940
    .line 1941
    .line 1942
    if-eqz v5, :cond_8e

    .line 1943
    .line 1944
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1945
    .line 1946
    .line 1947
    move-result v2

    .line 1948
    const/4 v3, 0x0

    .line 1949
    :goto_55
    if-ge v3, v2, :cond_8e

    .line 1950
    .line 1951
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v4

    .line 1955
    check-cast v4, Lp1/c;

    .line 1956
    .line 1957
    invoke-interface {v4}, Lp1/c;->y0()V

    .line 1958
    .line 1959
    .line 1960
    add-int/lit8 v3, v3, 0x1

    .line 1961
    .line 1962
    goto :goto_55

    .line 1963
    :cond_8e
    const/4 v9, 0x0

    .line 1964
    iput v9, v1, Ly1/q1;->b:I

    .line 1965
    .line 1966
    const/4 v10, 0x1

    .line 1967
    iput-boolean v10, v1, Ly1/q1;->c:Z

    .line 1968
    .line 1969
    return v10

    .line 1970
    :cond_8f
    const-string v1, "MotionEvent must be a touch navigation source"

    .line 1971
    .line 1972
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1973
    .line 1974
    .line 1975
    const/4 v1, 0x0

    .line 1976
    return v1

    .line 1977
    :cond_90
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 1978
    .line 1979
    .line 1980
    move-result v1

    .line 1981
    return v1

    .line 1982
    :cond_91
    :goto_56
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 1983
    .line 1984
    .line 1985
    move-result v1

    .line 1986
    return v1
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
    iget-boolean v2, v0, Ly1/t;->K0:Z

    .line 6
    .line 7
    iget-object v3, v0, Ly1/t;->J0:Ly1/j;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ly1/j;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, Ly1/t;->s(Landroid/view/MotionEvent;)Z

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
    iget-object v2, v0, Ly1/t;->F:Ly1/z;

    .line 33
    .line 34
    iget-object v5, v2, Ly1/z;->j:Ly1/t;

    .line 35
    .line 36
    iget-object v6, v2, Ly1/z;->m:Landroid/view/accessibility/AccessibilityManager;

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
    iget v6, v2, Ly1/z;->k:I

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
    iput v14, v2, Ly1/z;->k:I

    .line 86
    .line 87
    invoke-static {v2, v14, v11, v12, v13}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v6, v7, v12, v13}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v5}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

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
    invoke-virtual {v5, v10}, Ly1/t;->x(Z)V

    .line 113
    .line 114
    .line 115
    new-instance v20, Lx1/p;

    .line 116
    .line 117
    invoke-direct/range {v20 .. v20}, Lx1/p;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ly1/t;->getRoot()Lx1/f0;

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
    iget-object v8, v14, Lx1/f0;->L:Lx1/b1;

    .line 150
    .line 151
    iget-object v9, v8, Lx1/b1;->d:Lx1/i1;

    .line 152
    .line 153
    sget-object v14, Lx1/i1;->T:Lf1/o0;

    .line 154
    .line 155
    invoke-virtual {v9, v6, v7}, Lx1/i1;->o1(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    iget-object v6, v8, Lx1/b1;->d:Lx1/i1;

    .line 160
    .line 161
    sget-object v17, Lx1/i1;->X:Lx1/d1;

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
    invoke-virtual/range {v16 .. v22}, Lx1/i1;->w1(Lx1/e1;JLx1/p;IZ)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v6, v20

    .line 173
    .line 174
    iget-object v6, v6, Lx1/p;->g:Lf/f0;

    .line 175
    .line 176
    iget v7, v6, Lf/f0;->b:I

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
    invoke-virtual {v6, v7}, Lf/f0;->f(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast v8, Ly0/n;

    .line 190
    .line 191
    invoke-static {v8}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-virtual {v5}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    invoke-virtual {v9}, Ly1/r0;->getLayoutNodeToHolder()Ljava/util/HashMap;

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
    check-cast v9, Lx2/h;

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
    iget-object v9, v8, Lx1/f0;->L:Lx1/b1;

    .line 215
    .line 216
    const/16 v14, 0x8

    .line 217
    .line 218
    invoke-virtual {v9, v14}, Lx1/b1;->d(I)Z

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
    iget v9, v8, Lx1/f0;->h:I

    .line 226
    .line 227
    invoke-virtual {v2, v9}, Ly1/z;->t(I)I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    invoke-static {v8, v4}, Lf2/t;->a(Lx1/f0;Z)Lf2/q;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v8}, Lf2/t;->h(Lf2/q;)Z

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
    invoke-virtual {v8}, Lf2/q;->k()Lf2/m;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    sget-object v14, Lf2/u;->A:Lf2/x;

    .line 247
    .line 248
    iget-object v8, v8, Lf2/m;->g:Lf/k0;

    .line 249
    .line 250
    invoke-virtual {v8, v14}, Lf/k0;->c(Ljava/lang/Object;)Z

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
    invoke-virtual {v5}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 265
    .line 266
    .line 267
    iget v5, v2, Ly1/z;->k:I

    .line 268
    .line 269
    if-ne v5, v14, :cond_b

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_b
    iput v14, v2, Ly1/z;->k:I

    .line 273
    .line 274
    invoke-static {v2, v14, v11, v12, v13}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

    .line 275
    .line 276
    .line 277
    const/16 v15, 0x100

    .line 278
    .line 279
    invoke-static {v2, v5, v15, v12, v13}, Ly1/z;->x(Ly1/z;IILjava/lang/Integer;I)V

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
    invoke-virtual/range {p0 .. p1}, Ly1/t;->t(Landroid/view/MotionEvent;)Z

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
    iget-object v2, v0, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iput-object v1, v0, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 326
    .line 327
    iput-boolean v10, v0, Ly1/t;->K0:Z

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
    invoke-virtual/range {p0 .. p1}, Ly1/t;->u(Landroid/view/MotionEvent;)Z

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
    invoke-virtual/range {p0 .. p1}, Ly1/t;->o(Landroid/view/MotionEvent;)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    and-int/2addr v1, v10

    .line 347
    if-eqz v1, :cond_12

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
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Ly1/f1;->s:Ly1/v1;

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
    sget-object v0, Ly1/p2;->a:Li0/j1;

    .line 21
    .line 22
    new-instance v2, Ls1/c0;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ls1/c0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Ld1/k;->g:Ld1/k;

    .line 35
    .line 36
    check-cast v0, Ld1/p;

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Ld1/p;->d(Landroid/view/KeyEvent;Lfg/a;)Z

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
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_2
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Lc1/b;

    .line 60
    .line 61
    const/4 v2, 0x7

    .line 62
    invoke-direct {v1, p0, v2, p1}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Ld1/p;

    .line 66
    .line 67
    invoke-virtual {v0, p1, v1}, Ld1/p;->d(Landroid/view/KeyEvent;Lfg/a;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1
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
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ld1/p;

    .line 14
    .line 15
    iget-object v3, v0, Ld1/p;->d:Ld1/i;

    .line 16
    .line 17
    iget-boolean v3, v3, Ld1/i;->e:Z

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
    iget-object v0, v0, Ld1/p;->c:Ld1/b0;

    .line 31
    .line 32
    invoke-static {v0}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v3, v0, Ly0/n;->g:Ly0/n;

    .line 39
    .line 40
    iget-boolean v3, v3, Ly0/n;->t:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const-string v3, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, Ly0/n;->g:Ly0/n;

    .line 50
    .line 51
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_b

    .line 56
    .line 57
    iget-object v4, v0, Lx1/f0;->L:Lx1/b1;

    .line 58
    .line 59
    iget-object v4, v4, Lx1/b1;->f:Ly0/n;

    .line 60
    .line 61
    iget v4, v4, Ly0/n;->j:I

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
    iget v4, v3, Ly0/n;->i:I

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
    iget v8, v4, Ly0/n;->i:I

    .line 81
    .line 82
    and-int/2addr v8, v5

    .line 83
    if-eqz v8, :cond_7

    .line 84
    .line 85
    instance-of v8, v4, Lx1/j;

    .line 86
    .line 87
    if-eqz v8, :cond_7

    .line 88
    .line 89
    move-object v8, v4

    .line 90
    check-cast v8, Lx1/j;

    .line 91
    .line 92
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 93
    .line 94
    move v9, v1

    .line 95
    :goto_3
    if-eqz v8, :cond_6

    .line 96
    .line 97
    iget v10, v8, Ly0/n;->i:I

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
    new-instance v7, Lj0/b;

    .line 111
    .line 112
    const/16 v10, 0x10

    .line 113
    .line 114
    new-array v10, v10, [Ly0/n;

    .line 115
    .line 116
    invoke-direct {v7, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v7, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v4, v6

    .line 125
    :cond_4
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_4
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

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
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    iget-object v3, v3, Ly0/n;->k:Ly0/n;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    iget-object v3, v0, Lx1/f0;->L:Lx1/b1;

    .line 149
    .line 150
    if-eqz v3, :cond_a

    .line 151
    .line 152
    iget-object v3, v3, Lx1/b1;->e:Lx1/b2;

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
    move-result p1

    .line 161
    if-eqz p1, :cond_c

    .line 162
    .line 163
    return v2

    .line 164
    :cond_c
    return v1
.end method

.method public final dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Ly1/a0;->a:Ly1/a0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ly1/t;->getView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, Ly1/a0;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Ly1/t;->K0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Ly1/t;->J0:Ly1/j;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iput-boolean v1, p0, Ly1/t;->K0:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ly1/j;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, Ly1/t;->s(Landroid/view/MotionEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_e

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
    goto/16 :goto_7

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
    invoke-virtual {p0, p1}, Ly1/t;->u(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, Ly1/t;->o(Landroid/view/MotionEvent;)I

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
    if-eqz v2, :cond_d

    .line 133
    .line 134
    if-eqz v4, :cond_d

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
    const v4, 0x7f06002e

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
    new-instance v2, Ly1/u0;

    .line 160
    .line 161
    invoke-direct {v2, v3}, Ly1/u0;-><init>(I)V

    .line 162
    .line 163
    .line 164
    :cond_c
    new-instance v4, Ly1/u0;

    .line 165
    .line 166
    invoke-direct {v4, v3}, Ly1/u0;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_d

    .line 174
    .line 175
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ld1/p;

    .line 180
    .line 181
    invoke-virtual {v2}, Ld1/p;->f()Ld1/b0;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_d

    .line 186
    .line 187
    invoke-static {v2}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v4, v2, v3}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

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
    invoke-virtual {v2, v4, v5}, Le1/c;->a(J)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-nez p1, :cond_d

    .line 232
    .line 233
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Ld1/p;

    .line 238
    .line 239
    const/16 v2, 0x8

    .line 240
    .line 241
    invoke-virtual {p1, v2, v1, v3}, Ld1/p;->b(IZZ)Z

    .line 242
    .line 243
    .line 244
    :cond_d
    and-int/lit8 p1, v0, 0x1

    .line 245
    .line 246
    if-eqz p1, :cond_e

    .line 247
    .line 248
    return v3

    .line 249
    :cond_e
    :goto_7
    return v1
.end method

.method public final e(Ld1/b0;Ld1/b0;)V
    .locals 13

    .line 1
    if-eqz p1, :cond_1e

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Ly0/n;

    .line 5
    .line 6
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 7
    .line 8
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 9
    .line 10
    const-string v2, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 18
    .line 19
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    move-object v3, v1

    .line 25
    :goto_0
    const/16 v4, 0x10

    .line 26
    .line 27
    const/high16 v5, 0x200000

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz p1, :cond_c

    .line 32
    .line 33
    iget-object v8, p1, Lx1/f0;->L:Lx1/b1;

    .line 34
    .line 35
    iget-object v8, v8, Lx1/b1;->f:Ly0/n;

    .line 36
    .line 37
    iget v8, v8, Ly0/n;->j:I

    .line 38
    .line 39
    and-int/2addr v8, v5

    .line 40
    if-eqz v8, :cond_a

    .line 41
    .line 42
    :goto_1
    if-eqz v0, :cond_a

    .line 43
    .line 44
    iget v8, v0, Ly0/n;->i:I

    .line 45
    .line 46
    and-int/2addr v8, v5

    .line 47
    if-eqz v8, :cond_9

    .line 48
    .line 49
    move-object v8, v0

    .line 50
    move-object v9, v1

    .line 51
    :goto_2
    if-eqz v8, :cond_9

    .line 52
    .line 53
    instance-of v10, v8, Lp1/c;

    .line 54
    .line 55
    if-eqz v10, :cond_2

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move v10, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    move v10, v7

    .line 70
    :goto_3
    if-eqz v10, :cond_8

    .line 71
    .line 72
    iget v10, v8, Ly0/n;->i:I

    .line 73
    .line 74
    and-int/2addr v10, v5

    .line 75
    if-eqz v10, :cond_8

    .line 76
    .line 77
    instance-of v10, v8, Lx1/j;

    .line 78
    .line 79
    if-eqz v10, :cond_8

    .line 80
    .line 81
    move-object v10, v8

    .line 82
    check-cast v10, Lx1/j;

    .line 83
    .line 84
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 85
    .line 86
    move v11, v6

    .line 87
    :goto_4
    if-eqz v10, :cond_7

    .line 88
    .line 89
    iget v12, v10, Ly0/n;->i:I

    .line 90
    .line 91
    and-int/2addr v12, v5

    .line 92
    if-eqz v12, :cond_6

    .line 93
    .line 94
    add-int/lit8 v11, v11, 0x1

    .line 95
    .line 96
    if-ne v11, v7, :cond_3

    .line 97
    .line 98
    move-object v8, v10

    .line 99
    goto :goto_5

    .line 100
    :cond_3
    if-nez v9, :cond_4

    .line 101
    .line 102
    new-instance v9, Lj0/b;

    .line 103
    .line 104
    new-array v12, v4, [Ly0/n;

    .line 105
    .line 106
    invoke-direct {v9, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    if-eqz v8, :cond_5

    .line 110
    .line 111
    invoke-virtual {v9, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object v8, v1

    .line 115
    :cond_5
    invoke-virtual {v9, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    :goto_5
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    if-ne v11, v7, :cond_8

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    invoke-static {v9}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    goto :goto_2

    .line 129
    :cond_9
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_a
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_b

    .line 137
    .line 138
    iget-object v0, p1, Lx1/f0;->L:Lx1/b1;

    .line 139
    .line 140
    if-eqz v0, :cond_b

    .line 141
    .line 142
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_b
    move-object v0, v1

    .line 146
    goto :goto_0

    .line 147
    :cond_c
    if-nez v3, :cond_d

    .line 148
    .line 149
    goto/16 :goto_e

    .line 150
    .line 151
    :cond_d
    if-eqz p2, :cond_1b

    .line 152
    .line 153
    iget-object p1, p2, Ly0/n;->g:Ly0/n;

    .line 154
    .line 155
    iget-boolean p1, p1, Ly0/n;->t:Z

    .line 156
    .line 157
    if-nez p1, :cond_e

    .line 158
    .line 159
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_e
    iget-object p1, p2, Ly0/n;->g:Ly0/n;

    .line 163
    .line 164
    invoke-static {p2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    move-object v0, v1

    .line 169
    :goto_6
    if-eqz p2, :cond_1a

    .line 170
    .line 171
    iget-object v2, p2, Lx1/f0;->L:Lx1/b1;

    .line 172
    .line 173
    iget-object v2, v2, Lx1/b1;->f:Ly0/n;

    .line 174
    .line 175
    iget v2, v2, Ly0/n;->j:I

    .line 176
    .line 177
    and-int/2addr v2, v5

    .line 178
    if-eqz v2, :cond_18

    .line 179
    .line 180
    :goto_7
    if-eqz p1, :cond_18

    .line 181
    .line 182
    iget v2, p1, Ly0/n;->i:I

    .line 183
    .line 184
    and-int/2addr v2, v5

    .line 185
    if-eqz v2, :cond_17

    .line 186
    .line 187
    move-object v2, p1

    .line 188
    move-object v8, v1

    .line 189
    :goto_8
    if-eqz v2, :cond_17

    .line 190
    .line 191
    instance-of v9, v2, Lp1/c;

    .line 192
    .line 193
    if-eqz v9, :cond_10

    .line 194
    .line 195
    if-nez v0, :cond_f

    .line 196
    .line 197
    sget-object v0, Lf/s0;->a:Lf/l0;

    .line 198
    .line 199
    new-instance v0, Lf/l0;

    .line 200
    .line 201
    invoke-direct {v0}, Lf/l0;-><init>()V

    .line 202
    .line 203
    .line 204
    :cond_f
    invoke-virtual {v0, v2}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move v9, v6

    .line 208
    goto :goto_9

    .line 209
    :cond_10
    move v9, v7

    .line 210
    :goto_9
    if-eqz v9, :cond_16

    .line 211
    .line 212
    iget v9, v2, Ly0/n;->i:I

    .line 213
    .line 214
    and-int/2addr v9, v5

    .line 215
    if-eqz v9, :cond_16

    .line 216
    .line 217
    instance-of v9, v2, Lx1/j;

    .line 218
    .line 219
    if-eqz v9, :cond_16

    .line 220
    .line 221
    move-object v9, v2

    .line 222
    check-cast v9, Lx1/j;

    .line 223
    .line 224
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 225
    .line 226
    move v10, v6

    .line 227
    :goto_a
    if-eqz v9, :cond_15

    .line 228
    .line 229
    iget v11, v9, Ly0/n;->i:I

    .line 230
    .line 231
    and-int/2addr v11, v5

    .line 232
    if-eqz v11, :cond_14

    .line 233
    .line 234
    add-int/lit8 v10, v10, 0x1

    .line 235
    .line 236
    if-ne v10, v7, :cond_11

    .line 237
    .line 238
    move-object v2, v9

    .line 239
    goto :goto_b

    .line 240
    :cond_11
    if-nez v8, :cond_12

    .line 241
    .line 242
    new-instance v8, Lj0/b;

    .line 243
    .line 244
    new-array v11, v4, [Ly0/n;

    .line 245
    .line 246
    invoke-direct {v8, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_12
    if-eqz v2, :cond_13

    .line 250
    .line 251
    invoke-virtual {v8, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object v2, v1

    .line 255
    :cond_13
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_14
    :goto_b
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_15
    if-ne v10, v7, :cond_16

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_16
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    goto :goto_8

    .line 269
    :cond_17
    iget-object p1, p1, Ly0/n;->k:Ly0/n;

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_18
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    if-eqz p2, :cond_19

    .line 277
    .line 278
    iget-object p1, p2, Lx1/f0;->L:Lx1/b1;

    .line 279
    .line 280
    if-eqz p1, :cond_19

    .line 281
    .line 282
    iget-object p1, p1, Lx1/b1;->e:Lx1/b2;

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_19
    move-object p1, v1

    .line 286
    goto :goto_6

    .line 287
    :cond_1a
    move-object v1, v0

    .line 288
    :cond_1b
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    move p2, v6

    .line 293
    :goto_c
    if-ge p2, p1, :cond_1e

    .line 294
    .line 295
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Lp1/c;

    .line 300
    .line 301
    if-eqz v1, :cond_1c

    .line 302
    .line 303
    invoke-virtual {v1, v0}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    goto :goto_d

    .line 308
    :cond_1c
    move v2, v6

    .line 309
    :goto_d
    if-nez v2, :cond_1d

    .line 310
    .line 311
    invoke-interface {v0}, Lp1/c;->y0()V

    .line 312
    .line 313
    .line 314
    :cond_1d
    add-int/lit8 p2, p2, 0x1

    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_1e
    :goto_e
    return-void
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    const-string v1, "findViewByAccessibilityIdTraversal"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v3, v2, [Ljava/lang/Class;

    .line 13
    .line 14
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v4, v3, v5

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    new-array v1, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    aput-object p1, v1, v5

    .line 33
    .line 34
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    instance-of v0, p1, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast p1, Landroid/view/View;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_0
    invoke-static {p0, p1}, Ly1/t;->m(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p1

    .line 50
    :catch_0
    :cond_1
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 4
    .line 5
    iget-boolean v0, v0, Lx1/t0;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

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
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, v0}, Ly1/g0;->a(Landroid/view/View;Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v1

    .line 39
    :goto_0
    if-ne p1, p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ld1/p;

    .line 46
    .line 47
    iget-object v2, v2, Ld1/p;->c:Ld1/b0;

    .line 48
    .line 49
    invoke-static {v2}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-static {v2}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_2
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {p1, p0}, Ld1/h;->a(Landroid/view/View;Landroid/view/View;)Le1/c;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1, p0}, Ld1/h;->a(Landroid/view/View;Landroid/view/View;)Le1/c;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_4
    :goto_1
    invoke-static {p2}, Ld1/h;->d(I)Ld1/f;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    iget v2, v2, Ld1/f;->a:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    const/4 v2, 0x6

    .line 80
    :goto_2
    new-instance v3, Lgg/u;

    .line 81
    .line 82
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-instance v5, Lr1/j;

    .line 90
    .line 91
    const/4 v6, 0x2

    .line 92
    invoke-direct {v5, v3, v6}, Lr1/j;-><init>(Lgg/u;I)V

    .line 93
    .line 94
    .line 95
    check-cast v4, Ld1/p;

    .line 96
    .line 97
    invoke-virtual {v4, v2, v1, v5}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-nez v4, :cond_6

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_6
    iget-object v3, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 105
    .line 106
    if-nez v3, :cond_7

    .line 107
    .line 108
    if-nez v0, :cond_b

    .line 109
    .line 110
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_7
    if-nez v0, :cond_8

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_8
    const/4 p1, 0x1

    .line 119
    if-ne v2, p1, :cond_9

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    const/4 p1, 0x2

    .line 123
    if-ne v2, p1, :cond_a

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_a
    check-cast v3, Ld1/b0;

    .line 127
    .line 128
    invoke-static {v3}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {v0, p0}, Ld1/h;->a(Landroid/view/View;Landroid/view/View;)Le1/c;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p1, p2, v1, v2}, Ld1/d;->o(Le1/c;Le1/c;Le1/c;I)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_b

    .line 141
    .line 142
    :goto_3
    return-object p0

    .line 143
    :cond_b
    return-object v0

    .line 144
    :cond_c
    :goto_4
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1
.end method

.method public bridge synthetic getAccessibilityManager()Ly1/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getAccessibilityManager()Ly1/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getAccessibilityManager()Ly1/g;
    .locals 1

    .line 6
    iget-object v0, p0, Ly1/t;->H:Ly1/g;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui()Ly1/r0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->c0:Ly1/r0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly1/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ly1/r0;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly1/t;->c0:Ly1/r0;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Ly1/t;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Ly1/t;->c0:Ly1/r0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public getAutofill()Lz0/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->S:Lhb/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutofillManager()Lz0/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->T:Lz0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutofillTree()Lz0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->J:Lz0/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClipboard()Ly1/h;
    .locals 1

    .line 6
    iget-object v0, p0, Ly1/t;->W:Ly1/h;

    return-object v0
.end method

.method public bridge synthetic getClipboard()Ly1/y0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getClipboard()Ly1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getClipboardManager()Ly1/i;
    .locals 1

    .line 6
    iget-object v0, p0, Ly1/t;->V:Ly1/i;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Ly1/z0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getClipboardManager()Ly1/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getComposeViewContext()Ly1/f1;
    .locals 1

    .line 1
    invoke-direct {p0}, Ly1/t;->get_composeViewContext()Ly1/f1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getComposeViewContextIncrementedDuringInit$ui()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly1/t;->P0:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getConfiguration()Landroid/content/res/Configuration;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->Q:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/res/Configuration;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getContentCaptureManager$ui()La1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->G:La1/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoroutineContext()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->t:Lwf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()Lu2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->q:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public getDragAndDropManager()Lb1/b;
    .locals 1

    .line 6
    iget-object v0, p0, Ly1/t;->u:Lb1/b;

    return-object v0
.end method

.method public bridge synthetic getDragAndDropManager()Lb1/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getDragAndDropManager()Lb1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getEmbeddedViewFocusRect()Le1/c;
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
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ld1/p;

    .line 13
    .line 14
    iget-object v0, v0, Ld1/p;->c:Ld1/b0;

    .line 15
    .line 16
    invoke-static {v0}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

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
    invoke-static {v0, p0}, Ld1/h;->a(Landroid/view/View;Landroid/view/View;)Le1/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :cond_2
    return-object v1
.end method

.method public getFocusOwner()Ld1/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->s:Ld1/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly1/t;->getEmbeddedViewFocusRect()Le1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Le1/c;->a:F

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget v1, v0, Le1/c;->b:F

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    iget v1, v0, Le1/c;->c:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget v0, v0, Le1/c;->d:F

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Ly1/o;->h:Ly1/o;

    .line 45
    .line 46
    check-cast v0, Ld1/p;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    const/high16 v0, -0x80000000

    .line 63
    .line 64
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

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

.method public getFontFamilyResolver()Lm2/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->w0:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm2/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public getFontLoader()Lm2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->v0:Lm2/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFrameEndScheduler$ui()Ly1/w1;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->l:Ly1/w1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphicsContext()Lf1/z;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->I:Lf1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHapticFeedBack()Ln1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->y0:Ln1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/t0;->b:Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb5/c;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ly1/t;->o:Ltf/k;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method

.method public getImportantForAutofill()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getInputModeManager()Lo1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->z0:Lo1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInsetsListener()Lv1/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->A:Lv1/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ly1/t;->l0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->x0:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/m;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic getLayoutNodes()Lf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getLayoutNodes()Lf/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf/w;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Ly1/t;->C:Lf/w;

    return-object v0
.end method

.method public getLocaleList()Lp2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->R:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp2/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lx1/t0;->c:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {v1}, Lu1/a;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-wide v0, v0, Lx1/t0;->g:J

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()Lw1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->A0:Lw1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getOutOfFrameExecutor()Lx1/p1;
    .locals 1

    .line 10
    invoke-virtual {p0}, Ly1/t;->getOutOfFrameExecutor()Ly1/t;

    move-result-object v0

    return-object v0
.end method

.method public getOutOfFrameExecutor()Ly1/t;
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
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public getPlacementScope()Lv1/a1;
    .locals 2

    .line 1
    sget v0, Lv1/d1;->b:I

    .line 2
    .line 3
    new-instance v0, Lv1/k0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, Lv1/k0;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public getPointerIconService()Ls1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->S0:Ly1/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui()Lp1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->j:Lp1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRectManager()Lg2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->D:Lg2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRetainedValuesStore()Lt0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->n:Lt0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRoot()Lx1/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->B:Lx1/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootForTest()Lx1/y1;
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
    iget-object v0, p0, Ly1/t;->Q0:Landroidx/lifecycle/x;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Li0/j1;

    .line 14
    .line 15
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public getSemanticsOwner()Lf2/s;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->E:Lf2/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSharedDrawScope()Lx1/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->k:Lx1/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Ly1/s0;->a:Ly1/s0;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ly1/s0;->a(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-boolean v0, p0, Ly1/t;->b0:Z

    .line 15
    .line 16
    return v0
.end method

.method public getSnapshotObserver()Lx1/t1;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->a0:Lx1/t1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSoftwareKeyboardController()Ly1/g2;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->u0:Ly1/i1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly1/i1;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/t;->getTextInputService()Ln2/t;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ly1/i1;-><init>(Ln2/t;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly1/t;->u0:Ly1/i1;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getTextInputService()Ln2/t;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->s0:Ln2/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ln2/t;

    .line 6
    .line 7
    invoke-direct {p0}, Ly1/t;->getLegacyTextInputServiceAndroid()Ln2/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ln2/t;-><init>(Ln2/n;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly1/t;->s0:Ln2/t;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getTextToolbar()Ly1/h2;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->B0:Ly1/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUncaughtExceptionHandler$ui()Lx1/x1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getViewConfiguration()Ly1/l2;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->z:Ly1/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getViewTreeOwners()Ly1/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->p0:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getWindowInfo()Ly1/o2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ly1/f1;->s:Ly1/v1;

    .line 6
    .line 7
    return-object v0
.end method

.method public final get_autofillManager$ui()Lz0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->T:Lz0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Lfg/p;Lx1/f1;Li1/b;)Lx1/q1;
    .locals 9

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    new-instance v0, Ly1/o1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v3, p0

    .line 7
    move-object v4, p1

    .line 8
    move-object v5, p2

    .line 9
    move-object v1, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Ly1/o1;-><init>(Li1/b;Lf1/z;Ly1/t;Lfg/p;Lfg/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    move-object v4, p1

    .line 15
    move-object v5, p2

    .line 16
    :cond_1
    move-object v3, p0

    .line 17
    iget-object p1, v3, Ly1/t;->E0:Lp4/t;

    .line 18
    .line 19
    iget-object p2, p1, Lp4/t;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 22
    .line 23
    iget-object p1, p1, Lp4/t;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lj0/b;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    if-nez p2, :cond_1

    .line 37
    .line 38
    :cond_3
    iget p2, p1, Lj0/b;->i:I

    .line 39
    .line 40
    const/4 p3, 0x0

    .line 41
    if-eqz p2, :cond_4

    .line 42
    .line 43
    add-int/lit8 p2, p2, -0x1

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Ljava/lang/ref/Reference;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    move-object p2, p3

    .line 59
    :goto_0
    check-cast p2, Lx1/q1;

    .line 60
    .line 61
    if-eqz p2, :cond_8

    .line 62
    .line 63
    move-object p1, p2

    .line 64
    check-cast p1, Ly1/o1;

    .line 65
    .line 66
    iget-object v0, p1, Ly1/o1;->h:Lf1/z;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    iget-object v1, p1, Ly1/o1;->g:Li1/b;

    .line 71
    .line 72
    iget-boolean v1, v1, Li1/b;->s:Z

    .line 73
    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    const-string v1, "layer should have been released before reuse"

    .line 77
    .line 78
    invoke-static {v1}, Lu1/a;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-interface {v0}, Lf1/z;->c()Li1/b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p1, Ly1/o1;->g:Li1/b;

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p1, Ly1/o1;->m:Z

    .line 89
    .line 90
    iput-object v4, p1, Ly1/o1;->j:Lfg/p;

    .line 91
    .line 92
    iput-object v5, p1, Ly1/o1;->k:Lfg/a;

    .line 93
    .line 94
    iput-boolean v0, p1, Ly1/o1;->w:Z

    .line 95
    .line 96
    iput-boolean v0, p1, Ly1/o1;->x:Z

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    iput-boolean v1, p1, Ly1/o1;->y:Z

    .line 100
    .line 101
    iget-object v1, p1, Ly1/o1;->n:[F

    .line 102
    .line 103
    invoke-static {v1}, Lf1/i0;->d([F)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p1, Ly1/o1;->o:[F

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    invoke-static {v1}, Lf1/i0;->d([F)V

    .line 111
    .line 112
    .line 113
    :cond_6
    sget-wide v1, Lf1/u0;->b:J

    .line 114
    .line 115
    iput-wide v1, p1, Ly1/o1;->u:J

    .line 116
    .line 117
    iput-boolean v0, p1, Ly1/o1;->z:Z

    .line 118
    .line 119
    const v1, 0x7fffffff

    .line 120
    .line 121
    .line 122
    int-to-long v1, v1

    .line 123
    const/16 v4, 0x20

    .line 124
    .line 125
    shl-long v4, v1, v4

    .line 126
    .line 127
    const-wide v6, 0xffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    and-long/2addr v1, v6

    .line 133
    or-long/2addr v1, v4

    .line 134
    iput-wide v1, p1, Ly1/o1;->l:J

    .line 135
    .line 136
    iput-object p3, p1, Ly1/o1;->v:Lf1/c0;

    .line 137
    .line 138
    iput v0, p1, Ly1/o1;->t:I

    .line 139
    .line 140
    return-object p2

    .line 141
    :cond_7
    const-string p1, "currently reuse is only supported when we manage the layer lifecycle"

    .line 142
    .line 143
    invoke-static {p1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    throw p1

    .line 148
    :cond_8
    new-instance v3, Ly1/o1;

    .line 149
    .line 150
    invoke-virtual {p0}, Ly1/t;->getGraphicsContext()Lf1/z;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1}, Lf1/z;->c()Li1/b;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    move-object v8, v5

    .line 159
    invoke-virtual {p0}, Ly1/t;->getGraphicsContext()Lf1/z;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    move-object v6, p0

    .line 164
    move-object v7, v4

    .line 165
    move-object v4, p1

    .line 166
    invoke-direct/range {v3 .. v8}, Ly1/o1;-><init>(Li1/b;Lf1/z;Ly1/t;Lfg/p;Lfg/a;)V

    .line 167
    .line 168
    .line 169
    return-object v3
.end method

.method public final n(Lx1/f0;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx1/t0;->g(Lx1/f0;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ly1/t;->I0:Lrg/f;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Ly1/t;->G(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, Ly1/t;->m0:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Ly1/t;->x(Z)V

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
    iget-object v2, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v13, v1, Ly1/t;->P:Lb/f;

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
    invoke-virtual/range {v1 .. v6}, Ly1/t;->L(Landroid/view/MotionEvent;IJZ)V

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
    iget-boolean v1, v13, Lb/f;->a:Z

    .line 127
    .line 128
    if-nez v1, :cond_7

    .line 129
    .line 130
    iget-object v1, v13, Lb/f;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lm/a;

    .line 133
    .line 134
    iget-object v1, v1, Lm/a;->h:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Lf/p;

    .line 137
    .line 138
    iget v2, v1, Lf/p;->j:I

    .line 139
    .line 140
    iget-object v3, v1, Lf/p;->i:[Ljava/lang/Object;

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
    iput v7, v1, Lf/p;->j:I

    .line 152
    .line 153
    iput-boolean v7, v1, Lf/p;->g:Z

    .line 154
    .line 155
    iget-object v1, v13, Lb/f;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Ls1/d;

    .line 158
    .line 159
    invoke-virtual {v1}, Ls1/d;->c()V

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
    invoke-virtual/range {p0 .. p1}, Ly1/t;->t(Landroid/view/MotionEvent;)Z

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
    invoke-virtual/range {v1 .. v6}, Ly1/t;->L(Landroid/view/MotionEvent;IJZ)V

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
    iget-object v0, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v0, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v3, v1, Ly1/t;->O:Ls1/h;

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
    iget-object v2, v3, Ls1/h;->c:Landroid/util/SparseBooleanArray;

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 247
    .line 248
    .line 249
    iget-object v2, v3, Ls1/h;->b:Landroid/util/SparseLongArray;

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
    iget-object v2, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v5, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v4, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

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
    iget-object v2, v3, Ls1/h;->c:Landroid/util/SparseBooleanArray;

    .line 336
    .line 337
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 338
    .line 339
    .line 340
    iget-object v2, v3, Ls1/h;->b:Landroid/util/SparseLongArray;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    .line 343
    .line 344
    .line 345
    :cond_13
    iget-object v0, v13, Lb/f;->c:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Ls1/d;

    .line 348
    .line 349
    iget-boolean v2, v0, Ls1/d;->d:Z

    .line 350
    .line 351
    if-eqz v2, :cond_14

    .line 352
    .line 353
    iput-boolean v8, v0, Ls1/d;->d:Z

    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_14
    iget-object v0, v0, Ls1/d;->g:Ls1/j;

    .line 357
    .line 358
    iget-object v0, v0, Ls1/j;->a:Lj0/b;

    .line 359
    .line 360
    invoke-virtual {v0}, Lj0/b;->g()V

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
    iput-object v0, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 368
    .line 369
    invoke-virtual/range {p0 .. p1}, Ly1/t;->K(Landroid/view/MotionEvent;)I

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
    iput-boolean v7, v1, Ly1/t;->m0:Z

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
    iput-boolean v7, v1, Ly1/t;->m0:Z

    .line 386
    .line 387
    throw v0
.end method

.method public final onAttachedToWindow()V
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Ly1/t;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x1e

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ly1/g0;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p0, v2}, Ly1/t;->setShowLayoutBounds(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Ly1/t;->A:Lv1/n;

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Lv1/n;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x1c

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    if-le v1, v2, :cond_6

    .line 31
    .line 32
    sget-object v1, Ly1/t;->X0:Lh/Hchat/crash/e;

    .line 33
    .line 34
    if-nez v1, :cond_5

    .line 35
    .line 36
    new-instance v1, Lh/Hchat/crash/e;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    invoke-direct {v1, v2}, Lh/Hchat/crash/e;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v1, Ly1/t;->X0:Lh/Hchat/crash/e;

    .line 44
    .line 45
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :try_start_0
    sget-object v5, Ly1/t;->T0:Ljava/lang/Class;

    .line 50
    .line 51
    if-nez v5, :cond_1

    .line 52
    .line 53
    const-string v5, "android.os.SystemProperties"

    .line 54
    .line 55
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    sput-object v5, Ly1/t;->T0:Ljava/lang/Class;

    .line 60
    .line 61
    :cond_1
    sget-object v5, Ly1/t;->V0:Ljava/lang/reflect/Method;

    .line 62
    .line 63
    if-nez v5, :cond_3

    .line 64
    .line 65
    sget-object v5, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    .line 66
    .line 67
    invoke-static {v5}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 68
    .line 69
    .line 70
    sget-object v5, Ly1/t;->T0:Ljava/lang/Class;

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    const-string v6, "addChangeCallback"

    .line 75
    .line 76
    new-array v7, v0, [Ljava/lang/Class;

    .line 77
    .line 78
    const-class v8, Ljava/lang/Runnable;

    .line 79
    .line 80
    aput-object v8, v7, v3

    .line 81
    .line 82
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-object v5, v4

    .line 88
    :goto_0
    sput-object v5, Ly1/t;->V0:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    :cond_3
    sget-object v5, Ly1/t;->V0:Ljava/lang/reflect/Method;

    .line 91
    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    new-array v6, v0, [Ljava/lang/Object;

    .line 95
    .line 96
    aput-object v1, v6, v3

    .line 97
    .line 98
    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    :catchall_0
    :cond_4
    invoke-static {v2}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    sget-object v1, Ly1/t;->W0:Lf/f0;

    .line 105
    .line 106
    monitor-enter v1

    .line 107
    :try_start_1
    invoke-virtual {v1, p0}, Lf/f0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    .line 110
    monitor-exit v1

    .line 111
    goto :goto_1

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    monitor-exit v1

    .line 114
    throw v0

    .line 115
    :cond_6
    :goto_1
    iget-boolean v1, p0, Ly1/t;->P0:Z

    .line 116
    .line 117
    if-nez v1, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ly1/f1;->c()V

    .line 124
    .line 125
    .line 126
    :cond_7
    iput-boolean v3, p0, Ly1/t;->P0:Z

    .line 127
    .line 128
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {p0, v1}, Ly1/t;->q(Lx1/f0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Ly1/t;->p(Lx1/f0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v1, v1, Lx1/t1;->a:Lw0/s;

    .line 147
    .line 148
    invoke-virtual {v1}, Lw0/s;->d()V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Ly1/t;->S:Lhb/c;

    .line 152
    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    sget-object v2, Lz0/h;->a:Lz0/h;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v1, v1, Lhb/c;->i:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Landroid/view/autofill/AutofillManager;

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Landroid/view/autofill/AutofillManager;->registerCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 165
    .line 166
    .line 167
    :cond_8
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v1, v1, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 172
    .line 173
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget-object v2, v2, Ly1/f1;->e:Lc9/a1;

    .line 178
    .line 179
    iget-object v5, p0, Ly1/t;->l:Ly1/w1;

    .line 180
    .line 181
    if-eqz v1, :cond_11

    .line 182
    .line 183
    if-eqz v2, :cond_11

    .line 184
    .line 185
    if-nez v5, :cond_9

    .line 186
    .line 187
    goto/16 :goto_9

    .line 188
    .line 189
    :cond_9
    iget v1, v2, Lc9/a1;->g:I

    .line 190
    .line 191
    packed-switch v1, :pswitch_data_0

    .line 192
    .line 193
    .line 194
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :pswitch_0
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :pswitch_1
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :pswitch_2
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :pswitch_3
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :pswitch_4
    iget-object v1, v2, Lc9/a1;->j:Landroidx/lifecycle/e0;

    .line 210
    .line 211
    :goto_2
    sget-object v2, Lp3/a;->b:Lp3/a;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v5, Ll3/w;

    .line 220
    .line 221
    const/16 v6, 0x12

    .line 222
    .line 223
    invoke-direct {v5, v6}, Ll3/w;-><init>(I)V

    .line 224
    .line 225
    .line 226
    const-class v6, Ly1/y1;

    .line 227
    .line 228
    invoke-static {v6}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v6}, Lgg/f;->b()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    if-eqz v7, :cond_10

    .line 237
    .line 238
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 239
    .line 240
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    monitor-enter v5

    .line 245
    :try_start_2
    iget-object v8, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 246
    .line 247
    invoke-virtual {v8, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    check-cast v8, Ly1/y1;

    .line 252
    .line 253
    invoke-virtual {v6, v8}, Lgg/f;->d(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    if-eqz v9, :cond_a

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :catchall_2
    move-exception v0

    .line 264
    goto/16 :goto_8

    .line 265
    .line 266
    :cond_a
    iget-object v2, v2, Lp3/a;->a:Ljava/util/LinkedHashMap;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 272
    .line 273
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-interface {v8, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 277
    .line 278
    .line 279
    sget-object v2, Landroidx/lifecycle/d0;->a:La2/a;

    .line 280
    .line 281
    invoke-interface {v8, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 282
    .line 283
    .line 284
    :try_start_3
    invoke-virtual {v6}, Lgg/f;->a()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-static {v2}, Lr9/e0;->y(Ljava/lang/Class;)Ly1/y1;

    .line 292
    .line 293
    .line 294
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/AbstractMethodError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 295
    :goto_3
    move-object v8, v2

    .line 296
    goto :goto_4

    .line 297
    :catch_0
    :try_start_4
    invoke-virtual {v6}, Lgg/f;->a()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-static {v2}, Lr9/e0;->y(Ljava/lang/Class;)Ly1/y1;

    .line 305
    .line 306
    .line 307
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/AbstractMethodError; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 308
    goto :goto_3

    .line 309
    :catch_1
    :try_start_5
    invoke-virtual {v6}, Lgg/f;->a()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {v2}, Lr9/e0;->y(Ljava/lang/Class;)Ly1/y1;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    goto :goto_3

    .line 321
    :goto_4
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 322
    .line 323
    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    check-cast v1, Ly1/y1;

    .line 328
    .line 329
    if-eqz v1, :cond_b

    .line 330
    .line 331
    invoke-virtual {v1}, Ly1/y1;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 332
    .line 333
    .line 334
    :cond_b
    :goto_5
    monitor-exit v5

    .line 335
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast v1, Landroid/view/View;

    .line 343
    .line 344
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    iget-object v2, v8, Ly1/y1;->b:Lf/w;

    .line 349
    .line 350
    invoke-virtual {v2, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    if-nez v5, :cond_c

    .line 355
    .line 356
    new-instance v5, Lf/f0;

    .line 357
    .line 358
    invoke-direct {v5, v0}, Lf/f0;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v1, v5}, Lf/w;->h(ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :cond_c
    check-cast v5, Lf/f0;

    .line 365
    .line 366
    iget-object v1, v5, Lf/f0;->a:[Ljava/lang/Object;

    .line 367
    .line 368
    iget v2, v5, Lf/f0;->b:I

    .line 369
    .line 370
    :goto_6
    if-ge v3, v2, :cond_e

    .line 371
    .line 372
    aget-object v6, v1, v3

    .line 373
    .line 374
    move-object v7, v6

    .line 375
    check-cast v7, Ly1/x1;

    .line 376
    .line 377
    iget-boolean v7, v7, Ly1/x1;->c:Z

    .line 378
    .line 379
    if-nez v7, :cond_d

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_e
    move-object v6, v4

    .line 386
    :goto_7
    check-cast v6, Ly1/x1;

    .line 387
    .line 388
    if-nez v6, :cond_f

    .line 389
    .line 390
    new-instance v6, Ly1/x1;

    .line 391
    .line 392
    invoke-direct {v6}, Ly1/x1;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v6}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_f
    iput-boolean v0, v6, Ly1/x1;->c:Z

    .line 399
    .line 400
    iput-object v6, p0, Ly1/t;->m:Ly1/x1;

    .line 401
    .line 402
    iget-object v1, v6, Ly1/x1;->b:Lxe/e;

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :goto_8
    monitor-exit v5

    .line 406
    throw v0

    .line 407
    :cond_10
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 408
    .line 409
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :cond_11
    :goto_9
    move-object v1, v4

    .line 414
    :goto_a
    if-nez v1, :cond_12

    .line 415
    .line 416
    sget-object v1, Lt0/a;->a:Lt0/a;

    .line 417
    .line 418
    :cond_12
    iput-object v1, p0, Ly1/t;->n:Lt0/d;

    .line 419
    .line 420
    iget-object v1, p0, Ly1/t;->q0:Lfg/l;

    .line 421
    .line 422
    if-eqz v1, :cond_13

    .line 423
    .line 424
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    iput-object v4, p0, Ly1/t;->q0:Lfg/l;

    .line 432
    .line 433
    :cond_13
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    iget-object v1, v1, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 438
    .line 439
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v1, p0}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 444
    .line 445
    .line 446
    iget-object v2, p0, Ly1/t;->G:La1/i;

    .line 447
    .line 448
    invoke-virtual {v1, v2}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 449
    .line 450
    .line 451
    iget-object v1, p0, Ly1/t;->z0:Lo1/c;

    .line 452
    .line 453
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    if-eqz v2, :cond_14

    .line 458
    .line 459
    goto :goto_b

    .line 460
    :cond_14
    const/4 v0, 0x2

    .line 461
    :goto_b
    iget-object v1, v1, Lo1/c;->a:Li0/j1;

    .line 462
    .line 463
    new-instance v2, Lo1/a;

    .line 464
    .line 465
    invoke-direct {v2, v0}, Lo1/a;-><init>(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 490
    .line 491
    .line 492
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 493
    .line 494
    const/16 v1, 0x1f

    .line 495
    .line 496
    if-lt v0, v1, :cond_15

    .line 497
    .line 498
    sget-object v0, Ly1/d0;->a:Ly1/d0;

    .line 499
    .line 500
    invoke-virtual {v0, p0}, Ly1/d0;->b(Landroid/view/View;)V

    .line 501
    .line 502
    .line 503
    :cond_15
    iget-object v0, p0, Ly1/t;->T:Lz0/c;

    .line 504
    .line 505
    if-eqz v0, :cond_16

    .line 506
    .line 507
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Ld1/p;

    .line 512
    .line 513
    iget-object v1, v1, Ld1/p;->g:Lf/f0;

    .line 514
    .line 515
    invoke-virtual {v1, v0}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {p0}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    iget-object v1, v1, Lf2/s;->d:Lf/f0;

    .line 523
    .line 524
    invoke-virtual {v1, v0}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_16
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    check-cast v0, Ld1/p;

    .line 532
    .line 533
    iget-object v0, v0, Ld1/p;->g:Lf/f0;

    .line 534
    .line 535
    invoke-virtual {v0, p0}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCheckIsTextEditor()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->t0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly0/q;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ly0/q;->b:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    check-cast v0, Ly1/k0;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Ly1/t;->getLegacyTextInputServiceAndroid()Ln2/v;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Ln2/v;->d:Z

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    iget-object v0, v0, Ly1/k0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ly0/q;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v1, v0, Ly0/q;->b:Ljava/lang/Object;

    .line 38
    .line 39
    :cond_2
    check-cast v1, Ly1/s1;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-boolean v0, v1, Ly1/s1;->e:Z

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    xor-int/2addr v0, v1

    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    return v1

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ly1/t;->N(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ly1/t;->t0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ly0/q;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v2, v2, Ly0/q;->b:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    check-cast v2, Ly1/k0;

    .line 20
    .line 21
    if-nez v2, :cond_1a

    .line 22
    .line 23
    invoke-direct {v1}, Ly1/t;->getLegacyTextInputServiceAndroid()Ln2/v;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-boolean v4, v2, Ln2/v;->d:Z

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :cond_1
    iget-object v4, v2, Ln2/v;->h:Ln2/j;

    .line 36
    .line 37
    iget-object v5, v2, Ln2/v;->g:Ln2/s;

    .line 38
    .line 39
    iget v6, v4, Ln2/j;->e:I

    .line 40
    .line 41
    iget-boolean v7, v4, Ln2/j;->a:Z

    .line 42
    .line 43
    const/4 v8, 0x4

    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x7

    .line 46
    const/4 v11, 0x5

    .line 47
    const/4 v12, 0x6

    .line 48
    const/4 v13, 0x3

    .line 49
    const/4 v14, 0x2

    .line 50
    if-ne v6, v9, :cond_3

    .line 51
    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    :goto_1
    move v15, v12

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/4 v15, 0x0

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    if-nez v6, :cond_4

    .line 59
    .line 60
    move v15, v9

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    if-ne v6, v14, :cond_5

    .line 63
    .line 64
    move v15, v14

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    if-ne v6, v12, :cond_6

    .line 67
    .line 68
    move v15, v11

    .line 69
    goto :goto_2

    .line 70
    :cond_6
    if-ne v6, v11, :cond_7

    .line 71
    .line 72
    move v15, v10

    .line 73
    goto :goto_2

    .line 74
    :cond_7
    if-ne v6, v13, :cond_8

    .line 75
    .line 76
    move v15, v13

    .line 77
    goto :goto_2

    .line 78
    :cond_8
    if-ne v6, v8, :cond_9

    .line 79
    .line 80
    move v15, v8

    .line 81
    goto :goto_2

    .line 82
    :cond_9
    if-ne v6, v10, :cond_19

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :goto_2
    iput v15, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 86
    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    iget v3, v4, Ln2/j;->d:I

    .line 90
    .line 91
    if-ne v3, v9, :cond_a

    .line 92
    .line 93
    iput v9, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_a
    if-ne v3, v14, :cond_b

    .line 97
    .line 98
    iput v9, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 99
    .line 100
    const/high16 v3, -0x80000000

    .line 101
    .line 102
    or-int/2addr v3, v15

    .line 103
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_b
    if-ne v3, v13, :cond_c

    .line 107
    .line 108
    iput v14, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_c
    if-ne v3, v8, :cond_d

    .line 112
    .line 113
    iput v13, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_d
    if-ne v3, v11, :cond_e

    .line 117
    .line 118
    const/16 v3, 0x11

    .line 119
    .line 120
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_e
    if-ne v3, v12, :cond_f

    .line 124
    .line 125
    const/16 v3, 0x21

    .line 126
    .line 127
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_f
    if-ne v3, v10, :cond_10

    .line 131
    .line 132
    const/16 v3, 0x81

    .line 133
    .line 134
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_10
    const/16 v10, 0x8

    .line 138
    .line 139
    if-ne v3, v10, :cond_11

    .line 140
    .line 141
    const/16 v3, 0x12

    .line 142
    .line 143
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_11
    const/16 v10, 0x9

    .line 147
    .line 148
    if-ne v3, v10, :cond_18

    .line 149
    .line 150
    const/16 v3, 0x2002

    .line 151
    .line 152
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 153
    .line 154
    :goto_3
    if-nez v7, :cond_12

    .line 155
    .line 156
    iget v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 157
    .line 158
    and-int/lit8 v7, v3, 0x1

    .line 159
    .line 160
    if-ne v7, v9, :cond_12

    .line 161
    .line 162
    const/high16 v7, 0x20000

    .line 163
    .line 164
    or-int/2addr v3, v7

    .line 165
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 166
    .line 167
    if-ne v6, v9, :cond_12

    .line 168
    .line 169
    iget v3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 170
    .line 171
    const/high16 v6, 0x40000000    # 2.0f

    .line 172
    .line 173
    or-int/2addr v3, v6

    .line 174
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 175
    .line 176
    :cond_12
    iget v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 177
    .line 178
    and-int/lit8 v6, v3, 0x1

    .line 179
    .line 180
    if-ne v6, v9, :cond_16

    .line 181
    .line 182
    iget v6, v4, Ln2/j;->b:I

    .line 183
    .line 184
    if-ne v6, v9, :cond_13

    .line 185
    .line 186
    or-int/lit16 v3, v3, 0x1000

    .line 187
    .line 188
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_13
    if-ne v6, v14, :cond_14

    .line 192
    .line 193
    or-int/lit16 v3, v3, 0x2000

    .line 194
    .line 195
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_14
    if-ne v6, v13, :cond_15

    .line 199
    .line 200
    or-int/lit16 v3, v3, 0x4000

    .line 201
    .line 202
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 203
    .line 204
    :cond_15
    :goto_4
    iget-boolean v3, v4, Ln2/j;->c:Z

    .line 205
    .line 206
    if-eqz v3, :cond_16

    .line 207
    .line 208
    iget v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 209
    .line 210
    const v4, 0x8000

    .line 211
    .line 212
    .line 213
    or-int/2addr v3, v4

    .line 214
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 215
    .line 216
    :cond_16
    iget-wide v3, v5, Ln2/s;->b:J

    .line 217
    .line 218
    sget v6, Li2/m0;->c:I

    .line 219
    .line 220
    const/16 v6, 0x20

    .line 221
    .line 222
    shr-long v6, v3, v6

    .line 223
    .line 224
    long-to-int v6, v6

    .line 225
    iput v6, v0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 226
    .line 227
    const-wide v6, 0xffffffffL

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    and-long/2addr v3, v6

    .line 233
    long-to-int v3, v3

    .line 234
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 235
    .line 236
    iget-object v3, v5, Ln2/s;->a:Li2/g;

    .line 237
    .line 238
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v0, v3}, Lr9/e0;->k0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 241
    .line 242
    .line 243
    iget v3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 244
    .line 245
    const/high16 v4, 0x2000000

    .line 246
    .line 247
    or-int/2addr v3, v4

    .line 248
    iput v3, v0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 249
    .line 250
    invoke-static {}, Ll3/i;->d()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_17

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_17
    invoke-static {}, Ll3/i;->a()Ll3/i;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v3, v0}, Ll3/i;->g(Landroid/view/inputmethod/EditorInfo;)V

    .line 262
    .line 263
    .line 264
    :goto_5
    iget-object v0, v2, Ln2/v;->g:Ln2/s;

    .line 265
    .line 266
    iget-object v3, v2, Ln2/v;->h:Ln2/j;

    .line 267
    .line 268
    iget-boolean v3, v3, Ln2/j;->c:Z

    .line 269
    .line 270
    new-instance v4, Lm/a;

    .line 271
    .line 272
    invoke-direct {v4, v2, v8}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 273
    .line 274
    .line 275
    new-instance v5, Ln2/o;

    .line 276
    .line 277
    invoke-direct {v5, v0, v4, v3}, Ln2/o;-><init>(Ln2/s;Lm/a;Z)V

    .line 278
    .line 279
    .line 280
    iget-object v0, v2, Ln2/v;->i:Ljava/util/ArrayList;

    .line 281
    .line 282
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 283
    .line 284
    invoke-direct {v2, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    return-object v5

    .line 291
    :cond_18
    const-string v0, "Invalid Keyboard Type"

    .line 292
    .line 293
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-object v16

    .line 297
    :cond_19
    const/16 v16, 0x0

    .line 298
    .line 299
    const-string v0, "invalid ImeAction"

    .line 300
    .line 301
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    return-object v16

    .line 305
    :cond_1a
    const/16 v16, 0x0

    .line 306
    .line 307
    iget-object v2, v2, Ly1/k0;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ly0/q;

    .line 314
    .line 315
    if-eqz v2, :cond_1b

    .line 316
    .line 317
    iget-object v2, v2, Ly0/q;->b:Ljava/lang/Object;

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_1b
    move-object/from16 v2, v16

    .line 321
    .line 322
    :goto_6
    check-cast v2, Ly1/s1;

    .line 323
    .line 324
    if-eqz v2, :cond_1e

    .line 325
    .line 326
    iget-object v3, v2, Ly1/s1;->c:Ljava/lang/Object;

    .line 327
    .line 328
    monitor-enter v3

    .line 329
    :try_start_0
    iget-boolean v4, v2, Ly1/s1;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    .line 331
    if-eqz v4, :cond_1c

    .line 332
    .line 333
    monitor-exit v3

    .line 334
    return-object v16

    .line 335
    :cond_1c
    :try_start_1
    iget-object v4, v2, Ly1/s1;->a:Lf0/u;

    .line 336
    .line 337
    invoke-virtual {v4, v0}, Lf0/u;->a(Landroid/view/inputmethod/EditorInfo;)Lf0/v;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    new-instance v4, Lb1/f;

    .line 342
    .line 343
    const/16 v5, 0x1b

    .line 344
    .line 345
    invoke-direct {v4, v2, v5}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 349
    .line 350
    const/16 v6, 0x22

    .line 351
    .line 352
    if-lt v5, v6, :cond_1d

    .line 353
    .line 354
    new-instance v5, Ln2/m;

    .line 355
    .line 356
    invoke-direct {v5, v0, v4}, Ln2/l;-><init>(Lf0/v;Lb1/f;)V

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_1d
    new-instance v5, Ln2/l;

    .line 361
    .line 362
    invoke-direct {v5, v0, v4}, Ln2/l;-><init>(Lf0/v;Lb1/f;)V

    .line 363
    .line 364
    .line 365
    :goto_7
    iget-object v0, v2, Ly1/s1;->d:Lj0/b;

    .line 366
    .line 367
    new-instance v2, Lx1/g2;

    .line 368
    .line 369
    invoke-direct {v2, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v2}, Lj0/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 373
    .line 374
    .line 375
    monitor-exit v3

    .line 376
    return-object v5

    .line 377
    :catchall_0
    move-exception v0

    .line 378
    monitor-exit v3

    .line 379
    throw v0

    .line 380
    :cond_1e
    :goto_8
    return-object v16
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 7

    .line 1
    iget-object p2, p0, Ly1/t;->G:La1/i;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    aget-wide v2, p1, v1

    .line 11
    .line 12
    invoke-virtual {p2}, La1/i;->h()Lf/k;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-virtual {v4, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lf2/r;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, v2, Lf2/r;->a:Lf2/q;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {}, La1/c;->t()V

    .line 31
    .line 32
    .line 33
    iget-object v3, p2, La1/i;->g:Ly1/t;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v2, Lf2/q;->f:I

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    invoke-static {v3, v4, v5}, La1/c;->p(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v2, v2, Lf2/q;->d:Lf2/m;

    .line 47
    .line 48
    sget-object v4, Lf2/u;->B:Lf2/x;

    .line 49
    .line 50
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v4, 0x0

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    move-object v2, v4

    .line 60
    :cond_1
    check-cast v2, Ljava/util/List;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    const-string v5, "\n"

    .line 65
    .line 66
    const/16 v6, 0x3e

    .line 67
    .line 68
    invoke-static {v2, v5, v4, v6}, Lw2/a;->a(Ljava/util/List;Ljava/lang/String;Li2/q;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v4, Li2/g;

    .line 73
    .line 74
    invoke-direct {v4, v2}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4}, La1/c;->n(Li2/g;)Landroid/view/translation/TranslationRequestValue;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v3, v2}, La1/c;->D(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v3}, La1/c;->q(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {p3, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

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
    invoke-direct {p0, v0}, Ly1/t;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ly1/t;->A:Lv1/n;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Lv1/n;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ly1/t;->r:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {}, Ly1/t;->r()Z

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
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1c

    .line 29
    .line 30
    if-le v1, v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Ly1/t;->W0:Lf/f0;

    .line 33
    .line 34
    monitor-enter v2

    .line 35
    :try_start_0
    invoke-virtual {v2, p0}, Lf/f0;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v2

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    monitor-exit v2

    .line 42
    throw v0

    .line 43
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ly1/f1;->b()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v2, v2, Lx1/t1;->a:Lw0/s;

    .line 55
    .line 56
    iget-object v3, v2, Lw0/s;->h:Lq9/a;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {v3}, Lq9/a;->e()V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v2}, Lw0/s;->a()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v2, v2, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 71
    .line 72
    invoke-interface {v2}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v3, p0, Ly1/t;->G:La1/i;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Ly1/t;->S:Lhb/c;

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    sget-object v3, Lz0/h;->a:Lz0/h;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v2, v2, Lhb/c;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Landroid/view/autofill/AutofillManager;

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Landroid/view/autofill/AutofillManager;->unregisterCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, Ly1/t;->m:Ly1/x1;

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    iput-boolean v0, v2, Ly1/x1;->c:Z

    .line 126
    .line 127
    :cond_4
    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Ly1/t;->m:Ly1/x1;

    .line 129
    .line 130
    const/16 v2, 0x1f

    .line 131
    .line 132
    if-lt v1, v2, :cond_5

    .line 133
    .line 134
    sget-object v1, Ly1/d0;->a:Ly1/d0;

    .line 135
    .line 136
    invoke-virtual {v1, p0}, Ly1/d0;->a(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v1, p0, Ly1/t;->T:Lz0/c;

    .line 140
    .line 141
    if-eqz v1, :cond_6

    .line 142
    .line 143
    invoke-virtual {p0}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-object v2, v2, Lf2/s;->d:Lf/f0;

    .line 148
    .line 149
    invoke-virtual {v2, v1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Ld1/p;

    .line 157
    .line 158
    iget-object v2, v2, Ld1/p;->g:Lf/f0;

    .line 159
    .line 160
    invoke-virtual {v2, v1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-virtual {p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v2, v1, Lg2/b;->c:Lg2/e;

    .line 168
    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v9, 0x0

    .line 171
    const-wide/16 v3, 0x0

    .line 172
    .line 173
    const-wide/16 v5, 0x0

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    invoke-virtual/range {v2 .. v9}, Lg2/e;->b(JJ[FII)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iput-boolean v2, v1, Lg2/b;->f:Z

    .line 181
    .line 182
    invoke-virtual {p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Lg2/b;->a()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-object v2, v1, Lg2/b;->h:Lb0/c;

    .line 194
    .line 195
    if-eqz v2, :cond_7

    .line 196
    .line 197
    iget-object v3, v1, Lg2/b;->a:Ly1/t;

    .line 198
    .line 199
    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 200
    .line 201
    .line 202
    iput-object v0, v1, Lg2/b;->h:Lb0/c;

    .line 203
    .line 204
    :cond_7
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Ld1/p;

    .line 209
    .line 210
    iget-object v0, v0, Ld1/p;->g:Lf/f0;

    .line 211
    .line 212
    invoke-virtual {v0, p0}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    return-void
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
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ld1/p;

    .line 17
    .line 18
    iget-object p2, p1, Ld1/p;->c:Ld1/b0;

    .line 19
    .line 20
    const/4 p3, 0x1

    .line 21
    invoke-static {p2, p3}, Ld1/d;->d(Ld1/b0;Z)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-virtual {p1, p3}, Ld1/p;->i(Ld1/b0;)V

    .line 36
    .line 37
    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    sget-object p1, Ld1/z;->g:Ld1/z;

    .line 41
    .line 42
    sget-object p3, Ld1/z;->i:Ld1/z;

    .line 43
    .line 44
    invoke-virtual {p2, p1, p3}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

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
    iput-wide v0, p0, Ly1/t;->l0:J

    .line 4
    .line 5
    invoke-virtual {p0}, Ly1/t;->O()V

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
    invoke-virtual {p0, v0}, Ly1/t;->N(Landroid/content/res/Configuration;)V

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
    iput-wide v0, p0, Ly1/t;->l0:J

    .line 9
    .line 10
    iget-object p1, p0, Ly1/t;->f0:Lx1/t0;

    .line 11
    .line 12
    iget-object v0, p0, Ly1/t;->M0:Ly1/n;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lx1/t0;->l(Ly1/n;)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Ly1/t;->d0:Lu2/a;

    .line 19
    .line 20
    invoke-virtual {p0}, Ly1/t;->O()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Ly1/t;->c0:Ly1/r0;

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
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {p0}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sub-int/2addr p4, p2

    .line 37
    sub-int/2addr p5, p3

    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

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
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

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
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Ly1/t;->q(Lx1/f0;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-static {p1}, Ly1/t;->k(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    const/16 p1, 0x20

    .line 30
    .line 31
    ushr-long v3, v1, p1

    .line 32
    .line 33
    long-to-int v3, v3

    .line 34
    const-wide v4, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v1, v4

    .line 40
    long-to-int v1, v1

    .line 41
    invoke-static {p2}, Ly1/t;->k(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    ushr-long p1, v6, p1

    .line 46
    .line 47
    long-to-int p1, p1

    .line 48
    and-long/2addr v4, v6

    .line 49
    long-to-int p2, v4

    .line 50
    invoke-static {v3, v1, p1, p2}, Lf8/i;->t(IIII)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iget-object v1, p0, Ly1/t;->d0:Lu2/a;

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    new-instance v1, Lu2/a;

    .line 59
    .line 60
    invoke-direct {v1, p1, p2}, Lu2/a;-><init>(J)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Ly1/t;->d0:Lu2/a;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-boolean v1, p0, Ly1/t;->e0:Z

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-wide v1, v1, Lu2/a;->a:J

    .line 70
    .line 71
    invoke-static {v1, v2, p1, p2}, Lu2/a;->b(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Ly1/t;->e0:Z

    .line 79
    .line 80
    :cond_2
    :goto_1
    invoke-virtual {v0, p1, p2}, Lx1/t0;->s(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lx1/t0;->n()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, Lx1/f0;->M:Lx1/j0;

    .line 91
    .line 92
    iget-object p1, p1, Lx1/j0;->p:Lx1/v0;

    .line 93
    .line 94
    iget p1, p1, Lv1/b1;->g:I

    .line 95
    .line 96
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iget-object p2, p2, Lx1/f0;->M:Lx1/j0;

    .line 101
    .line 102
    iget-object p2, p2, Lx1/j0;->p:Lx1/v0;

    .line 103
    .line 104
    iget p2, p2, Lv1/b1;->h:I

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Ly1/t;->c0:Ly1/r0;

    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    const-string p1, "AndroidOwner:androidViewMeasure"

    .line 114
    .line 115
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    :try_start_1
    invoke-virtual {p0}, Ly1/t;->getAndroidViewsHandler$ui()Ly1/r0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    iget-object p2, p2, Lx1/f0;->M:Lx1/j0;

    .line 127
    .line 128
    iget-object p2, p2, Lx1/j0;->p:Lx1/v0;

    .line 129
    .line 130
    iget p2, p2, Lv1/b1;->g:I

    .line 131
    .line 132
    const/high16 v0, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-object v1, v1, Lx1/f0;->M:Lx1/j0;

    .line 143
    .line 144
    iget-object v1, v1, Lx1/j0;->p:Lx1/v0;

    .line 145
    .line 146
    iget v1, v1, Lv1/b1;->h:I

    .line 147
    .line 148
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    .line 155
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 161
    .line 162
    .line 163
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    :cond_3
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 169
    .line 170
    .line 171
    throw p1
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 11

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    iget-object v0, p0, Ly1/t;->T:Lz0/c;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v1, v0, Lz0/c;->h:Lf2/s;

    .line 9
    .line 10
    iget-object v1, v1, Lf2/s;->a:Lx1/f0;

    .line 11
    .line 12
    iget-object v2, v0, Lz0/c;->m:Landroid/view/autofill/AutofillId;

    .line 13
    .line 14
    iget-object v3, v0, Lz0/c;->k:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, v0, Lz0/c;->j:Lg2/b;

    .line 17
    .line 18
    invoke-static {p1, v1, v2, v3, v0}, Lig/a;->S(Landroid/view/ViewStructure;Lx1/f0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lg2/b;)V

    .line 19
    .line 20
    .line 21
    sget-object v4, Lf/p0;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v4, Lf/f0;

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v4, v5}, Lf/f0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v4}, Lf/f0;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    iget v1, v4, Lf/f0;->b:I

    .line 42
    .line 43
    sub-int/2addr v1, p2

    .line 44
    invoke-virtual {v4, v1}, Lf/f0;->k(I)Ljava/lang/Object;

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
    iget v5, v4, Lf/f0;->b:I

    .line 54
    .line 55
    sub-int/2addr v5, p2

    .line 56
    invoke-virtual {v4, v5}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v5, Lx1/f0;

    .line 64
    .line 65
    invoke-virtual {v5}, Lx1/f0;->n()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lf/d0;

    .line 70
    .line 71
    iget-object v6, v5, Lf/d0;->h:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Lj0/b;

    .line 74
    .line 75
    iget v6, v6, Lj0/b;->i:I

    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    :goto_0
    if-ge v7, v6, :cond_0

    .line 79
    .line 80
    invoke-virtual {v5, v7}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Lx1/f0;

    .line 85
    .line 86
    iget-boolean v9, v8, Lx1/f0;->W:Z

    .line 87
    .line 88
    if-nez v9, :cond_4

    .line 89
    .line 90
    invoke-virtual {v8}, Lx1/f0;->G()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    invoke-virtual {v8}, Lx1/f0;->H()Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-nez v9, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {v8}, Lx1/f0;->w()Lf2/m;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    if-eqz v9, :cond_3

    .line 108
    .line 109
    iget-object v9, v9, Lf2/m;->g:Lf/k0;

    .line 110
    .line 111
    sget-object v10, Lf2/l;->g:Lf2/x;

    .line 112
    .line 113
    invoke-virtual {v9, v10}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-nez v10, :cond_2

    .line 118
    .line 119
    sget-object v10, Lf2/l;->h:Lf2/x;

    .line 120
    .line 121
    invoke-virtual {v9, v10}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-nez v10, :cond_2

    .line 126
    .line 127
    sget-object v10, Lf2/u;->q:Lf2/x;

    .line 128
    .line 129
    invoke-virtual {v9, v10}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-nez v10, :cond_2

    .line 134
    .line 135
    sget-object v10, Lf2/u;->r:Lf2/x;

    .line 136
    .line 137
    invoke-virtual {v9, v10}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_3

    .line 142
    .line 143
    :cond_2
    invoke-virtual {v1, p2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    invoke-virtual {v1, v9}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-static {v9, v8, v2, v3, v0}, Lig/a;->S(Landroid/view/ViewStructure;Lx1/f0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lg2/b;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v8}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v9}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-virtual {v4, v8}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_5
    iget-object v0, p0, Ly1/t;->S:Lhb/c;

    .line 171
    .line 172
    if-eqz v0, :cond_9

    .line 173
    .line 174
    iget-object v1, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v1, Lz0/j;

    .line 177
    .line 178
    iget-object v2, v1, Lz0/j;->a:Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    iget-object v1, v1, Lz0/j;->a:Ljava/util/LinkedHashMap;

    .line 181
    .line 182
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_6

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_6
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_7

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Ljava/util/Map$Entry;

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/Number;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_8

    .line 233
    .line 234
    invoke-static {}, Lah/a;->d()V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_8
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iget-object v1, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v1, Landroid/view/autofill/AutofillId;

    .line 245
    .line 246
    invoke-virtual {p1, v1, v3}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 247
    .line 248
    .line 249
    iget-object v0, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Ly1/t;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const/4 v1, 0x0

    .line 262
    invoke-virtual {p1, v3, v0, v1, v1}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, p2}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 266
    .line 267
    .line 268
    throw v1

    .line 269
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
    if-nez v1, :cond_2

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
    if-eqz v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ly1/t;->getPointerIconService()Ls1/r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ly1/q;

    .line 32
    .line 33
    iget-object v0, v0, Ly1/q;->a:Ls1/q;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of p2, v0, Ls1/a;

    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    check-cast v0, Ls1/a;

    .line 46
    .line 47
    iget p2, v0, Ls1/a;->b:I

    .line 48
    .line 49
    invoke-static {p1, p2}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_1
    const/16 p2, 0x3e8

    .line 55
    .line 56
    invoke-static {p1, p2}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly1/t;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Ld1/h;->a:[I

    .line 6
    .line 7
    sget-object v0, Lu2/m;->g:Lu2/m;

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
    sget-object p1, Lu2/m;->h:Lu2/m;

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
    invoke-direct {p0, v0}, Ly1/t;->setLayoutDirection(Lu2/m;)V

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
    if-lt p1, p2, :cond_1

    .line 6
    .line 7
    iget-object v4, p0, Ly1/t;->Q0:Landroidx/lifecycle/x;

    .line 8
    .line 9
    if-eqz v4, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Ly1/t;->getCoroutineContext()Lwf/g;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v9, Lj0/b;

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    new-array v0, v0, [Le2/i;

    .line 24
    .line 25
    invoke-direct {v9, v0}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lf2/s;->a()Lf2/q;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v5, Le2/h;

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
    const-class v8, Lj0/b;

    .line 40
    .line 41
    const-string v10, "add"

    .line 42
    .line 43
    invoke-direct/range {v5 .. v11}, Lgg/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0, v5}, Lfb/v0;->P(Lf2/q;ILe2/h;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    new-array p1, p1, [Lfg/l;

    .line 52
    .line 53
    sget-object v1, Le2/b;->i:Le2/b;

    .line 54
    .line 55
    aput-object v1, p1, v0

    .line 56
    .line 57
    sget-object v1, Le2/b;->j:Le2/b;

    .line 58
    .line 59
    aput-object v1, p1, v6

    .line 60
    .line 61
    new-instance v1, Lce/b;

    .line 62
    .line 63
    const/4 v2, 0x3

    .line 64
    invoke-direct {v1, p1, v2}, Lce/b;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v9, Lj0/b;->g:[Ljava/lang/Object;

    .line 68
    .line 69
    iget v2, v9, Lj0/b;->i:I

    .line 70
    .line 71
    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 72
    .line 73
    .line 74
    iget p1, v9, Lj0/b;->i:I

    .line 75
    .line 76
    if-nez p1, :cond_0

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    sub-int/2addr p1, v6

    .line 81
    iget-object v0, v9, Lj0/b;->g:[Ljava/lang/Object;

    .line 82
    .line 83
    aget-object p1, v0, p1

    .line 84
    .line 85
    :goto_0
    check-cast p1, Le2/i;

    .line 86
    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    :cond_1
    move-object v5, p0

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget-object v2, p1, Le2/i;->c:Lu2/k;

    .line 92
    .line 93
    invoke-static {p2}, Lqg/v;->a(Lwf/g;)Lvg/c;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v0, Le2/c;

    .line 98
    .line 99
    iget-object v1, p1, Le2/i;->a:Lf2/q;

    .line 100
    .line 101
    move-object v5, p0

    .line 102
    invoke-direct/range {v0 .. v5}, Le2/c;-><init>(Lf2/q;Lu2/k;Lvg/c;Landroidx/lifecycle/x;Ly1/t;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p1, Le2/i;->d:Lx1/i1;

    .line 106
    .line 107
    invoke-static {p1}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-interface {p2, p1, v6}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v2}, Lu2/k;->b()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    invoke-static {p1}, Loh/h;->Q(Le1/c;)Lu2/k;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, Lf1/c0;->t(Lu2/k;)Landroid/graphics/Rect;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance p2, Landroid/graphics/Point;

    .line 128
    .line 129
    const/16 v1, 0x20

    .line 130
    .line 131
    shr-long v6, v3, v1

    .line 132
    .line 133
    long-to-int v1, v6

    .line 134
    const-wide v6, 0xffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v3, v6

    .line 140
    long-to-int v3, v3

    .line 141
    invoke-direct {p2, v1, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0, p1, p2, v0}, La1/c;->k(Ly1/t;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {v2}, Lf1/c0;->t(Lu2/k;)Landroid/graphics/Rect;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p1, p2}, La1/c;->y(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p3, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :goto_1
    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly1/t;->O()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onTouchModeChanged(Z)V
    .locals 2

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
    iget-object v0, p0, Ly1/t;->z0:Lo1/c;

    .line 7
    .line 8
    iget-object v0, v0, Lo1/c;->a:Li0/j1;

    .line 9
    .line 10
    new-instance v1, Lo1/a;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lo1/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/t;->G:La1/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1f

    .line 9
    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {v0, p1}, La7/a;->p(La1/i;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v1, v0, La1/i;->g:Ly1/t;

    .line 36
    .line 37
    new-instance v2, La1/d;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, v0, v3, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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
    iput-boolean v0, p0, Ly1/t;->O0:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v0, 0x1e

    .line 12
    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ly1/g0;->n()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Ly1/t;->getShowLayoutBounds()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq v0, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ly1/t;->setShowLayoutBounds(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Ly1/t;->p(Lx1/f0;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final q(Lx1/f0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lx1/t0;->r(Lx1/f0;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lx1/f0;->y()Lj0/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, Lj0/b;->i:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, Lx1/f0;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ly1/t;->q(Lx1/f0;)V

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
    invoke-static {p1}, Ld1/h;->d(I)Ld1/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget p1, p1, Ld1/f;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x7

    .line 19
    :goto_0
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

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
    new-instance v3, Le1/c;

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
    invoke-direct {v3, v4, v5, v6, p2}, Le1/c;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v3, v2

    .line 45
    :goto_1
    new-instance p2, Ld1/o;

    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    invoke-direct {p2, p1, v4}, Ld1/o;-><init>(II)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Ld1/p;

    .line 52
    .line 53
    invoke-virtual {v0, p1, v3, p2}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    new-instance v3, Ld1/o;

    .line 71
    .line 72
    const/4 v4, 0x4

    .line 73
    invoke-direct {v3, p1, v4}, Ld1/o;-><init>(II)V

    .line 74
    .line 75
    .line 76
    check-cast p2, Ld1/p;

    .line 77
    .line 78
    invoke-virtual {p2, p1, v2, v3}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Ld1/p;

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ld1/p;->h(I)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    return p1

    .line 112
    :cond_6
    const/4 p1, 0x0

    .line 113
    return p1
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->F:Ly1/z;

    .line 2
    .line 3
    iput-wide p1, v0, Ly1/z;->n:J

    .line 4
    .line 5
    return-void
.end method

.method public final setComposeViewContext(Ly1/f1;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly1/t;->getCoroutineContext()Lwf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Ly1/f1;->b:Li0/o;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/o;->j()Lwf/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ly1/t;->getRoot()Lx1/f0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lx1/f0;->n()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lf/d0;

    .line 22
    .line 23
    invoke-virtual {v0}, Lf/d0;->isEmpty()Z

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
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Lw0/f;->e()Lfg/l;

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
    invoke-static {v0}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :try_start_0
    invoke-direct {p0}, Ly1/t;->get_composeViewContext()Ly1/f1;

    .line 52
    .line 53
    .line 54
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-static {v0, v2, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

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
    invoke-virtual {v3}, Ly1/f1;->b()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ly1/f1;->c()V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-direct {p0, p1}, Ly1/t;->set_composeViewContext(Ly1/f1;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Ly1/f1;->b:Li0/o;

    .line 81
    .line 82
    invoke-virtual {p1}, Li0/o;->j()Lwf/g;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Ly1/t;->setCoroutineContext(Lwf/g;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    invoke-static {v0, v2, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final setComposeViewContextIncrementedDuringInit$ui(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly1/t;->P0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setConfiguration(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->Q:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setContentCaptureManager$ui(La1/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/t;->G:La1/i;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Lwf/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/t;->t:Lwf/g;

    .line 2
    .line 3
    return-void
.end method

.method public final setFrameEndScheduler$ui(Ly1/w1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/t;->l:Ly1/w1;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ly1/t;->l0:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnReadyForComposition(Lfg/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ly1/t;->getDerivedIsAttached()Z

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
    iget-boolean v0, p0, Ly1/t;->P0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput-object p1, p0, Ly1/t;->q0:Lfg/l;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly1/t;->getComposeViewContext()Ly1/f1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui(Lp1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/t;->j:Lp1/a;

    .line 2
    .line 3
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly1/t;->b0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setUncaughtExceptionHandler(Lx1/x1;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setUncaughtExceptionHandler$ui(Lx1/x1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final t(Landroid/view/MotionEvent;)Z
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
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    cmpg-float p1, p1, v0

    .line 33
    .line 34
    if-gtz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public final u(Landroid/view/MotionEvent;)Z
    .locals 4

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
    iget-object v0, p0, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    cmpg-float v2, v2, v3

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    cmpg-float p1, p1, v0

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return p1

    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public final v([F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly1/t;->F()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly1/t;->j0:[F

    .line 5
    .line 6
    invoke-static {p1, v0}, Lf1/i0;->e([F[F)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, Ly1/t;->n0:J

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shr-long/2addr v0, v2

    .line 14
    long-to-int v0, v0

    .line 15
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-wide v1, p0, Ly1/t;->n0:J

    .line 20
    .line 21
    const-wide v3, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v1, v3

    .line 27
    long-to-int v1, v1

    .line 28
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Ly1/t;->i0:[F

    .line 33
    .line 34
    invoke-static {v2}, Lf1/i0;->d([F)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v0, v1}, Lf1/i0;->f([FFF)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v2}, Ly1/g0;->s([F[F)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final w(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Ly1/t;->F()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly1/t;->j0:[F

    .line 5
    .line 6
    invoke-static {p1, p2, v0}, Lf1/i0;->b(J[F)J

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
    iget-wide v2, p0, Ly1/t;->n0:J

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
    iget-wide v5, p0, Ly1/t;->n0:J

    .line 40
    .line 41
    and-long/2addr v5, v3

    .line 42
    long-to-int p2, v5

    .line 43
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-float/2addr p2, p1

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-long v1, p1

    .line 53
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-long p1, p1

    .line 58
    shl-long v0, v1, v0

    .line 59
    .line 60
    and-long/2addr p1, v3

    .line 61
    or-long/2addr p1, v0

    .line 62
    return-wide p1
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/t0;->b:Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb5/c;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lx1/t0;->e:Lp4/t;

    .line 12
    .line 13
    iget-object v1, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lj0/b;

    .line 16
    .line 17
    iget v1, v1, Lj0/b;->i:I

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
    iget-object p1, p0, Ly1/t;->M0:Ly1/n;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_1
    invoke-virtual {v0, p1}, Lx1/t0;->l(Ly1/n;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 43
    .line 44
    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    invoke-virtual {v0, p1}, Lx1/t0;->b(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lg2/b;->a()V

    .line 54
    .line 55
    .line 56
    iget-boolean v0, p0, Ly1/t;->N:Z

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 65
    .line 66
    .line 67
    iput-boolean p1, p0, Ly1/t;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public final y(Lx1/f0;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->f0:Lx1/t0;

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
    invoke-virtual {v0, p1, p2, p3}, Lx1/t0;->m(Lx1/f0;J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lx1/t0;->b:Lb5/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lb5/c;->C()Z

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
    invoke-virtual {v0, p1}, Lx1/t0;->b(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ly1/t;->getRectManager()Lg2/b;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Lg2/b;->a()V

    .line 28
    .line 29
    .line 30
    iget-boolean p2, p0, Ly1/t;->N:Z

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 39
    .line 40
    .line 41
    iput-boolean p1, p0, Ly1/t;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public final z(I)Z
    .locals 6

    .line 1
    const/4 v0, 0x7

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    const/16 v0, 0x8

    .line 6
    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_1
    invoke-static {p1}, Ld1/h;->c(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "Invalid focus direction"

    .line 15
    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ld1/p;

    .line 27
    .line 28
    invoke-virtual {v2}, Ld1/p;->f()Ld1/b0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_6

    .line 33
    .line 34
    invoke-static {p1}, Ld1/h;->c(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v1, v1, Lx1/f0;->u:Lx2/v;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Lx2/h;->getInteropView()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v1, v2

    .line 59
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast v5, Landroid/view/ViewGroup;

    .line 75
    .line 76
    invoke-virtual {v4, v5, v3, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-static {v1, p1}, Ly1/g0;->a(Landroid/view/View;Landroid/view/View;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v3, 0x1

    .line 89
    if-ne v1, v3, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object p1, v2

    .line 93
    :goto_1
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {p1, v0, v2}, Ld1/h;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_4
    :goto_2
    const/4 p1, 0x0

    .line 105
    return p1

    .line 106
    :cond_5
    invoke-static {v1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    throw p1

    .line 111
    :cond_6
    const-string p1, "findNextViewInEmbeddedView called when owner does not have anything focused."

    .line 112
    .line 113
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    return p1

    .line 118
    :cond_7
    invoke-static {v1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    throw p1
.end method
