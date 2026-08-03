.class public final Ly2/v;
.super Landroid/app/Dialog;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/q;
.implements Lu3/c;


# instance fields
.field public g:Landroidx/lifecycle/s;

.field public final h:Lp4/t;

.field public final i:Lb/f;

.field public j:Lfg/a;

.field public k:Ly2/u;

.field public final l:Landroid/view/View;

.field public final m:Ly2/t;

.field public n:Z


# direct methods
.method public constructor <init>(Lfg/a;Ly2/u;Landroid/view/View;Lu2/m;Lu2/c;Ljava/util/UUID;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-boolean v4, v1, Ly2/u;->c:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const/high16 v4, 0x7f0a0000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const v4, 0x7f0a0001

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-direct {v2, v3, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v0, v2, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lpa/c;

    .line 29
    .line 30
    new-instance v4, Li/e0;

    .line 31
    .line 32
    const/16 v5, 0x1c

    .line 33
    .line 34
    invoke-direct {v4, v0, v5}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v0, v4}, Lpa/c;-><init>(Lu3/c;Li/e0;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lp4/t;

    .line 41
    .line 42
    invoke-direct {v4, v2}, Lp4/t;-><init>(Lpa/c;)V

    .line 43
    .line 44
    .line 45
    iput-object v4, v0, Ly2/v;->h:Lp4/t;

    .line 46
    .line 47
    new-instance v2, Lb/f;

    .line 48
    .line 49
    new-instance v4, La1/a;

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    invoke-direct {v4, v0, v6}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v4, v2, Lb/f;->b:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance v4, Ltf/k;

    .line 61
    .line 62
    invoke-direct {v4}, Ltf/k;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, Lb/f;->c:Ljava/lang/Object;

    .line 66
    .line 67
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v7, 0x21

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    if-lt v4, v7, :cond_1

    .line 73
    .line 74
    new-instance v4, Lb/a;

    .line 75
    .line 76
    invoke-direct {v4, v2, v3}, Lb/a;-><init>(Lb/f;I)V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lb/a;

    .line 80
    .line 81
    invoke-direct {v4, v2, v8}, Lb/a;-><init>(Lb/f;I)V

    .line 82
    .line 83
    .line 84
    sget-object v9, Lb/c;->a:Lb/c;

    .line 85
    .line 86
    invoke-virtual {v9, v4}, Lb/c;->a(Lfg/a;)Landroid/window/OnBackInvokedCallback;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iput-object v4, v2, Lb/f;->d:Ljava/lang/Object;

    .line 91
    .line 92
    :cond_1
    iput-object v2, v0, Ly2/v;->i:Lb/f;

    .line 93
    .line 94
    move-object/from16 v4, p1

    .line 95
    .line 96
    iput-object v4, v0, Ly2/v;->j:Lfg/a;

    .line 97
    .line 98
    iput-object v1, v0, Ly2/v;->k:Ly2/u;

    .line 99
    .line 100
    move-object/from16 v1, p3

    .line 101
    .line 102
    iput-object v1, v0, Ly2/v;->l:Landroid/view/View;

    .line 103
    .line 104
    const/16 v4, 0x8

    .line 105
    .line 106
    int-to-float v4, v4

    .line 107
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    const/4 v10, 0x0

    .line 112
    if-eqz v9, :cond_d

    .line 113
    .line 114
    iget-object v11, v0, Ly2/v;->k:Ly2/u;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    if-eqz v12, :cond_2

    .line 121
    .line 122
    invoke-virtual {v12}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iput v6, v13, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 130
    .line 131
    invoke-virtual {v12, v13}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    invoke-virtual {v9, v8}, Landroid/view/Window;->requestFeature(I)Z

    .line 135
    .line 136
    .line 137
    const v11, 0x106000d

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v11}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 141
    .line 142
    .line 143
    iget-object v11, v0, Ly2/v;->k:Ly2/u;

    .line 144
    .line 145
    iget-boolean v11, v11, Ly2/u;->c:Z

    .line 146
    .line 147
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 148
    .line 149
    const/16 v13, 0x23

    .line 150
    .line 151
    const/16 v14, 0x1e

    .line 152
    .line 153
    if-lt v12, v13, :cond_3

    .line 154
    .line 155
    invoke-static {v9, v11}, Lb2/b;->d(Landroid/view/Window;Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    if-lt v12, v14, :cond_4

    .line 160
    .line 161
    invoke-static {v9, v11}, Lb2/b;->c(Landroid/view/Window;Z)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-virtual {v9}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-virtual {v13}, Landroid/view/View;->getSystemUiVisibility()I

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-eqz v11, :cond_5

    .line 174
    .line 175
    and-int/lit16 v11, v15, -0x701

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    or-int/lit16 v11, v15, 0x700

    .line 179
    .line 180
    :goto_1
    invoke-virtual {v13, v11}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 181
    .line 182
    .line 183
    :goto_2
    const/16 v11, 0x11

    .line 184
    .line 185
    invoke-virtual {v9, v11}, Landroid/view/Window;->setGravity(I)V

    .line 186
    .line 187
    .line 188
    iget-object v11, v0, Ly2/v;->k:Ly2/u;

    .line 189
    .line 190
    iget-boolean v11, v11, Ly2/u;->c:Z

    .line 191
    .line 192
    if-nez v11, :cond_8

    .line 193
    .line 194
    const v11, 0x10100

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v11}, Landroid/view/Window;->addFlags(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    if-lt v12, v5, :cond_6

    .line 205
    .line 206
    sget-object v5, Ly2/o;->a:Ly2/o;

    .line 207
    .line 208
    invoke-virtual {v5, v11}, Ly2/o;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 209
    .line 210
    .line 211
    :cond_6
    if-lt v12, v14, :cond_7

    .line 212
    .line 213
    sget-object v5, Ly2/p;->a:Ly2/p;

    .line 214
    .line 215
    invoke-virtual {v5, v11, v3}, Ly2/p;->b(Landroid/view/WindowManager$LayoutParams;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v11, v3}, Ly2/p;->c(Landroid/view/WindowManager$LayoutParams;I)V

    .line 219
    .line 220
    .line 221
    :cond_7
    invoke-virtual {v9, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    new-instance v5, Ly2/t;

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-direct {v5, v11, v9}, Ly2/t;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 231
    .line 232
    .line 233
    iget-object v11, v0, Ly2/v;->k:Ly2/u;

    .line 234
    .line 235
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    const-string v11, ""

    .line 239
    .line 240
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 241
    .line 242
    .line 243
    new-instance v11, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v13, "Dialog:"

    .line 246
    .line 247
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v13, p6

    .line 251
    .line 252
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    const v13, 0x7f060033

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5, v13, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v3, p5

    .line 269
    .line 270
    invoke-interface {v3, v4}, Lu2/c;->x0(F)F

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    invoke-virtual {v5, v3}, Landroid/view/View;->setElevation(F)V

    .line 275
    .line 276
    .line 277
    new-instance v3, Li1/l;

    .line 278
    .line 279
    invoke-direct {v3, v6}, Li1/l;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 283
    .line 284
    .line 285
    iput-object v5, v0, Ly2/v;->m:Ly2/t;

    .line 286
    .line 287
    invoke-virtual {v9}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 292
    .line 293
    if-eqz v4, :cond_9

    .line 294
    .line 295
    move-object v10, v3

    .line 296
    check-cast v10, Landroid/view/ViewGroup;

    .line 297
    .line 298
    :cond_9
    if-eqz v10, :cond_a

    .line 299
    .line 300
    invoke-static {v10}, Ly2/v;->c(Landroid/view/ViewGroup;)V

    .line 301
    .line 302
    .line 303
    :cond_a
    invoke-virtual {v0, v5}, Ly2/v;->setContentView(Landroid/view/View;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v1}, Landroidx/lifecycle/d0;->a(Landroid/view/View;)Landroidx/lifecycle/q;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    const v4, 0x7f06007d

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v1}, Landroidx/lifecycle/d0;->b(Landroid/view/View;)Lc9/a1;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    const v4, 0x7f060081

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v1}, Lac/p;->t(Landroid/view/View;)Lu3/c;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    const v3, 0x7f060080

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    iget-object v1, v0, Ly2/v;->j:Lfg/a;

    .line 337
    .line 338
    iget-object v3, v0, Ly2/v;->k:Ly2/u;

    .line 339
    .line 340
    move-object/from16 v4, p4

    .line 341
    .line 342
    invoke-virtual {v0, v1, v3, v4}, Ly2/v;->g(Lfg/a;Ly2/u;Lu2/m;)V

    .line 343
    .line 344
    .line 345
    new-instance v1, Ly2/a;

    .line 346
    .line 347
    invoke-direct {v1, v0, v8}, Ly2/a;-><init>(Ly2/v;I)V

    .line 348
    .line 349
    .line 350
    new-instance v3, Lb/g;

    .line 351
    .line 352
    invoke-direct {v3, v1}, Lb/g;-><init>(Ly2/a;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ly2/v;->d()Landroidx/lifecycle/s;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iget-object v4, v1, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 360
    .line 361
    sget-object v5, Landroidx/lifecycle/l;->g:Landroidx/lifecycle/l;

    .line 362
    .line 363
    if-ne v4, v5, :cond_b

    .line 364
    .line 365
    goto :goto_3

    .line 366
    :cond_b
    new-instance v4, Lb/d;

    .line 367
    .line 368
    invoke-direct {v4, v2, v1, v3}, Lb/d;-><init>(Lb/f;Landroidx/lifecycle/s;Lb/g;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v3, Lb/g;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 372
    .line 373
    invoke-virtual {v1, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    if-lt v12, v7, :cond_c

    .line 377
    .line 378
    invoke-virtual {v2}, Lb/f;->d()V

    .line 379
    .line 380
    .line 381
    :cond_c
    :goto_3
    return-void

    .line 382
    :cond_d
    const-string v1, "Dialog has no window"

    .line 383
    .line 384
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v10
.end method

.method public static a(Ly2/v;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 3
    .line 4
    .line 5
    instance-of v1, p0, Ly2/t;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    if-ge v0, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-static {v2}, Ly2/v;->c(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly2/v;->e()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b()Lm/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/v;->h:Lp4/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lm/a;

    .line 6
    .line 7
    return-object v0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Landroidx/lifecycle/s;
    .locals 2

    .line 1
    iget-object v0, p0, Ly2/v;->g:Landroidx/lifecycle/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/s;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/s;-><init>(Landroidx/lifecycle/q;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ly2/v;->g:Landroidx/lifecycle/s;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v1, 0x7f06007d

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const v1, 0x7f06007f

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const v1, 0x7f060080

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final f()Landroidx/lifecycle/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly2/v;->d()Landroidx/lifecycle/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g(Lfg/a;Ly2/u;Lu2/m;)V
    .locals 5

    .line 1
    iput-object p1, p0, Ly2/v;->j:Lfg/a;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/v;->k:Ly2/u;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ly2/v;->l:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {p1}, Ly2/m;->b(Landroid/view/View;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x2000

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    move p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 p1, -0x2001

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, p1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 p3, 0x0

    .line 37
    const/4 v0, 0x1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    move p1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    move p1, p3

    .line 49
    :goto_1
    iget-object v1, p0, Ly2/v;->m:Ly2/t;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 52
    .line 53
    .line 54
    iget-boolean p1, p2, Ly2/u;->c:Z

    .line 55
    .line 56
    iget-boolean p2, p2, Ly2/u;->b:Z

    .line 57
    .line 58
    iget-object v2, v1, Ly2/t;->p:Landroid/view/Window;

    .line 59
    .line 60
    iget-boolean v3, v1, Ly2/t;->t:Z

    .line 61
    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    iget-boolean v3, v1, Ly2/t;->r:Z

    .line 65
    .line 66
    if-ne p2, v3, :cond_4

    .line 67
    .line 68
    iget-boolean v3, v1, Ly2/t;->s:Z

    .line 69
    .line 70
    if-eq p1, v3, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v3, p3

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    :goto_2
    move v3, v0

    .line 76
    :goto_3
    iput-boolean p2, v1, Ly2/t;->r:Z

    .line 77
    .line 78
    iput-boolean p1, v1, Ly2/t;->s:Z

    .line 79
    .line 80
    if-eqz v3, :cond_7

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v4, -0x2

    .line 87
    if-eqz p2, :cond_5

    .line 88
    .line 89
    move p2, v4

    .line 90
    goto :goto_4

    .line 91
    :cond_5
    const/4 p2, -0x1

    .line 92
    :goto_4
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 93
    .line 94
    if-ne p2, v3, :cond_6

    .line 95
    .line 96
    iget-boolean v3, v1, Ly2/t;->t:Z

    .line 97
    .line 98
    if-nez v3, :cond_7

    .line 99
    .line 100
    :cond_6
    invoke-virtual {v2, p2, v4}, Landroid/view/Window;->setLayout(II)V

    .line 101
    .line 102
    .line 103
    iput-boolean v0, v1, Ly2/t;->t:Z

    .line 104
    .line 105
    :cond_7
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-eqz p2, :cond_a

    .line 113
    .line 114
    if-eqz p1, :cond_8

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    const/16 p3, 0x1f

    .line 120
    .line 121
    if-ge p1, p3, :cond_9

    .line 122
    .line 123
    const/16 p3, 0x10

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_9
    const/16 p3, 0x30

    .line 127
    .line 128
    :goto_5
    invoke-virtual {p2, p3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 129
    .line 130
    .line 131
    :cond_a
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/v;->i:Lb/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/f;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lai/a;->p(Ly2/v;)Landroid/window/OnBackInvokedDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ly2/v;->i:Lb/f;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object v0, v1, Lb/f;->e:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1}, Lb/f;->d()V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Ly2/v;->h:Lp4/t;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly2/v;->d()Landroidx/lifecycle/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Landroidx/lifecycle/k;->ON_CREATE:Landroidx/lifecycle/k;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/v;->k:Ly2/u;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly2/u;->a:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x6f

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Ly2/v;->j:Lfg/a;

    .line 24
    .line 25
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ly2/v;->h:Lp4/t;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lp4/t;->G(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly2/v;->d()Landroidx/lifecycle/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Landroidx/lifecycle/k;->ON_RESUME:Landroidx/lifecycle/k;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly2/v;->d()Landroidx/lifecycle/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/lifecycle/k;->ON_DESTROY:Landroidx/lifecycle/k;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ly2/v;->g:Landroidx/lifecycle/s;

    .line 12
    .line 13
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ly2/v;->k:Ly2/u;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Ly2/v;->m:Ly2/t;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 24
    .line 25
    .line 26
    cmpg-float v2, v2, v3

    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    if-gtz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    cmpg-float v2, v2, v3

    .line 42
    .line 43
    if-gtz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    add-int/2addr v7, v3

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    add-int/2addr v3, v7

    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    add-int/2addr v8, v1

    .line 75
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v1, v8

    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-static {v2}, Lig/a;->X(F)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-gt v7, v2, :cond_2

    .line 89
    .line 90
    if-gt v2, v3, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static {v2}, Lig/a;->X(F)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-gt v8, v2, :cond_2

    .line 101
    .line 102
    if-gt v2, v1, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_1

    .line 109
    .line 110
    if-eq p1, v6, :cond_1

    .line 111
    .line 112
    if-eq p1, v4, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    iput-boolean v5, p0, Ly2/v;->n:Z

    .line 116
    .line 117
    return v0

    .line 118
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    if-eq p1, v6, :cond_4

    .line 125
    .line 126
    if-eq p1, v4, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    iput-boolean v5, p0, Ly2/v;->n:Z

    .line 130
    .line 131
    return v0

    .line 132
    :cond_4
    iget-boolean p1, p0, Ly2/v;->n:Z

    .line 133
    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    iget-object p1, p0, Ly2/v;->j:Lfg/a;

    .line 137
    .line 138
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    iput-boolean v5, p0, Ly2/v;->n:Z

    .line 142
    .line 143
    return v6

    .line 144
    :cond_5
    :goto_1
    return v0

    .line 145
    :cond_6
    iput-boolean v6, p0, Ly2/v;->n:Z

    .line 146
    .line 147
    return v6
.end method

.method public final setContentView(I)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Ly2/v;->e()V

    .line 12
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly2/v;->e()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-virtual {p0}, Ly2/v;->e()V

    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
