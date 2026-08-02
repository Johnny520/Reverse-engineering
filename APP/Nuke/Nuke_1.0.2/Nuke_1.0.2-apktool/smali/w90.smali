.class public final Lw90;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lw90;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Landroid/os/Handler;

.field public static final j:Ljava/util/Set;

.field public static final k:Ljava/util/Map;

.field public static final l:Ljava/util/Map;

.field public static final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static n:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public static final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lw90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw90;->d:Lw90;

    .line 8
    .line 9
    const v0, 0x790b0105

    .line 10
    .line 11
    .line 12
    sput v0, Lw90;->e:I

    .line 13
    .line 14
    const v0, 0x790b0106

    .line 15
    .line 16
    .line 17
    sput v0, Lw90;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lw90;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "DisplayMessageDetails"

    .line 24
    .line 25
    sput-object v0, Lw90;->h:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lw90;->i:Landroid/os/Handler;

    .line 37
    .line 38
    new-instance v0, Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lw90;->j:Ljava/util/Set;

    .line 48
    .line 49
    new-instance v0, Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lw90;->k:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v0, Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lw90;->l:Ljava/util/Map;

    .line 70
    .line 71
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lw90;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    const/16 v0, 0x11

    .line 79
    .line 80
    const/16 v1, 0x12

    .line 81
    .line 82
    invoke-static {v0, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sput v0, Lw90;->o:I

    .line 87
    .line 88
    return-void
.end method

.method public static q(Ljg3;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljg3;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_d

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljg3;->a()[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-static {v3, v2}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    instance-of v4, v2, Ljava/lang/Integer;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v5

    .line 32
    :goto_0
    if-eqz v2, :cond_19

    .line 33
    .line 34
    iget-object p0, p0, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 35
    .line 36
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 37
    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    goto/16 :goto_d

    .line 41
    .line 42
    :cond_2
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ln4;->v()Lsg1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lzf1;->b()V

    .line 51
    .line 52
    .line 53
    const-string v4, "getItem"

    .line 54
    .line 55
    iput-object v4, p0, Lzf1;->b:Ljava/lang/String;

    .line 56
    .line 57
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p0, v4}, Lsg1;->d([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lsg1;->c()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lzg1;

    .line 78
    .line 79
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0, v2}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-nez p0, :cond_3

    .line 88
    .line 89
    goto/16 :goto_d

    .line 90
    .line 91
    :cond_3
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Lzf1;->b()V

    .line 100
    .line 101
    .line 102
    const-string v2, "field_createTime"

    .line 103
    .line 104
    iput-object v2, p0, Lzf1;->b:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lpi0;

    .line 115
    .line 116
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    instance-of v2, p0, Ljava/lang/Long;

    .line 121
    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    check-cast p0, Ljava/lang/Long;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    move-object p0, v5

    .line 128
    :goto_1
    if-eqz p0, :cond_19

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v6

    .line 134
    sget-object p0, Ljs;->d:Ljs;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljs;->j(Ljava/lang/Object;)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 144
    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    check-cast p0, Landroid/view/ViewGroup;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    move-object p0, v5

    .line 151
    :goto_2
    if-nez p0, :cond_6

    .line 152
    .line 153
    goto/16 :goto_d

    .line 154
    .line 155
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v2, "bk4"

    .line 160
    .line 161
    const-string v4, "id"

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v0, v2, v4, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    sget-object p0, Lw90;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 178
    .line 179
    invoke-virtual {p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-eqz p0, :cond_19

    .line 184
    .line 185
    sget-object p0, Lw90;->h:Ljava/lang/String;

    .line 186
    .line 187
    const-string v0, "Message mask layout resource bk4 is unavailable"

    .line 188
    .line 189
    invoke-static {p0, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 198
    .line 199
    if-eqz v2, :cond_8

    .line 200
    .line 201
    check-cast v0, Landroid/view/ViewGroup;

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    move-object v0, v5

    .line 205
    :goto_3
    if-nez v0, :cond_9

    .line 206
    .line 207
    sget-object p0, Lw90;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 208
    .line 209
    invoke-virtual {p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-eqz p0, :cond_19

    .line 214
    .line 215
    sget-object p0, Lw90;->h:Ljava/lang/String;

    .line 216
    .line 217
    const-string v0, "Message mask layout resource bk4 is unavailable"

    .line 218
    .line 219
    invoke-static {p0, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_9
    const v2, 0x79080036

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    instance-of v4, v3, Landroid/widget/TextView;

    .line 231
    .line 232
    if-eqz v4, :cond_a

    .line 233
    .line 234
    check-cast v3, Landroid/widget/TextView;

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_a
    move-object v3, v5

    .line 238
    :goto_4
    if-eqz v3, :cond_b

    .line 239
    .line 240
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    goto :goto_5

    .line 245
    :cond_b
    move-object v4, v5

    .line 246
    :goto_5
    const/high16 v8, 0x3f000000    # 0.5f

    .line 247
    .line 248
    const/high16 v9, 0x40a00000    # 5.0f

    .line 249
    .line 250
    const/4 v10, -0x1

    .line 251
    if-ne v4, v0, :cond_c

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_c
    if-eqz v3, :cond_d

    .line 255
    .line 256
    invoke-virtual {v0, v2, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    instance-of v3, v0, Landroid/widget/RelativeLayout;

    .line 260
    .line 261
    const/4 v4, -0x2

    .line 262
    if-eqz v3, :cond_e

    .line 263
    .line 264
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 265
    .line 266
    invoke-direct {v3, v10, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 267
    .line 268
    .line 269
    const/16 v4, 0xa

    .line 270
    .line 271
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 272
    .line 273
    .line 274
    const/16 v4, 0xe

    .line 275
    .line 276
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 277
    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_e
    instance-of v3, v0, Landroid/widget/FrameLayout;

    .line 281
    .line 282
    if-eqz v3, :cond_f

    .line 283
    .line 284
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 285
    .line 286
    const/16 v11, 0x31

    .line 287
    .line 288
    invoke-direct {v3, v10, v4, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 289
    .line 290
    .line 291
    :goto_6
    sget-object v4, Lw90;->d:Lw90;

    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 312
    .line 313
    mul-float/2addr v4, v9

    .line 314
    add-float/2addr v4, v8

    .line 315
    float-to-int v4, v4

    .line 316
    neg-int v4, v4

    .line 317
    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 318
    .line 319
    new-instance v4, Landroid/widget/TextView;

    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    invoke-direct {v4, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 326
    .line 327
    .line 328
    const/high16 v11, 0x41300000    # 11.0f

    .line 329
    .line 330
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 331
    .line 332
    .line 333
    const/16 v11, 0x11

    .line 334
    .line 335
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    sget-object v2, Lw90;->j:Ljava/util/Set;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    monitor-enter v2

    .line 353
    :try_start_0
    move-object v3, v2

    .line 354
    check-cast v3, Ljava/util/Collection;

    .line 355
    .line 356
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    .line 358
    .line 359
    monitor-exit v2

    .line 360
    move-object v3, v4

    .line 361
    goto :goto_7

    .line 362
    :catchall_0
    move-exception p0

    .line 363
    monitor-exit v2

    .line 364
    throw p0

    .line 365
    :cond_f
    move-object v3, v5

    .line 366
    :goto_7
    if-nez v3, :cond_10

    .line 367
    .line 368
    goto/16 :goto_d

    .line 369
    .line 370
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 386
    .line 387
    mul-float/2addr v9, v2

    .line 388
    add-float/2addr v9, v8

    .line 389
    float-to-int v2, v9

    .line 390
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-lt v4, v2, :cond_11

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_11
    sget-object v4, Lw90;->k:Ljava/util/Map;

    .line 398
    .line 399
    new-instance v8, Lv90;

    .line 400
    .line 401
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 410
    .line 411
    .line 412
    move-result v12

    .line 413
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    invoke-direct {v8, v9, v11, v12, v13}, Lv90;-><init>(IIII)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v4, p0, v8}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 428
    .line 429
    .line 430
    move-result v8

    .line 431
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    invoke-virtual {p0, v4, v2, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 436
    .line 437
    .line 438
    :goto_8
    if-eqz v0, :cond_17

    .line 439
    .line 440
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 441
    .line 442
    if-eqz v2, :cond_12

    .line 443
    .line 444
    sget-object v2, Lw90;->l:Ljava/util/Map;

    .line 445
    .line 446
    new-instance v4, Lu90;

    .line 447
    .line 448
    move-object v8, v0

    .line 449
    check-cast v8, Landroid/view/ViewGroup;

    .line 450
    .line 451
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 452
    .line 453
    .line 454
    move-result v9

    .line 455
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getClipToPadding()Z

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    invoke-direct {v4, v9, v11}, Lu90;-><init>(ZZ)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 469
    .line 470
    .line 471
    :cond_12
    if-eq v0, p0, :cond_17

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eq v2, v10, :cond_14

    .line 478
    .line 479
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-nez v2, :cond_13

    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_13
    :try_start_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v2
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 498
    goto :goto_a

    .line 499
    :catch_0
    :cond_14
    :goto_9
    move-object v2, v5

    .line 500
    :goto_a
    const-string v4, "bn1"

    .line 501
    .line 502
    invoke-static {v2, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    if-eqz v2, :cond_15

    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_15
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    instance-of v2, v0, Landroid/view/View;

    .line 514
    .line 515
    if-eqz v2, :cond_16

    .line 516
    .line 517
    check-cast v0, Landroid/view/View;

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_16
    move-object v0, v5

    .line 521
    goto :goto_8

    .line 522
    :cond_17
    :goto_b
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 531
    .line 532
    and-int/lit8 p0, p0, 0x30

    .line 533
    .line 534
    const/16 v0, 0x20

    .line 535
    .line 536
    if-ne p0, v0, :cond_18

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_18
    sget v10, Lw90;->o:I

    .line 540
    .line 541
    :goto_c
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 542
    .line 543
    .line 544
    const-string p0, "HH:mm:ss"

    .line 545
    .line 546
    invoke-static {p0, v6, v7}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3}, Landroid/view/View;->bringToFront()V

    .line 557
    .line 558
    .line 559
    :cond_19
    :goto_d
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lw90;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object v0, Ljs;->d:Ljs;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljs;->h:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lgs;

    .line 18
    .line 19
    const/16 v2, 0x11

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lgs;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lkg3;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sput-object p0, Lw90;->n:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 38
    .line 39
    return-void
.end method

.method public final i()V
    .locals 7

    .line 1
    sget-object p0, Lw90;->n:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sput-object v0, Lw90;->n:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 9
    .line 10
    .line 11
    sget-object v0, La83;->a:La83;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance v0, Lx92;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    sget-object v0, Lw90;->d:Lw90;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lw90;->h:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v1, "Unable to remove message details hook: "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {v0, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p0, Lw90;->j:Ljava/util/Set;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    monitor-enter p0

    .line 52
    :try_start_1
    move-object v0, p0

    .line 53
    check-cast v0, Ljava/lang/Iterable;

    .line 54
    .line 55
    invoke-static {v0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p0}, Ljava/util/Set;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 60
    .line 61
    .line 62
    monitor-exit p0

    .line 63
    sget-object p0, Lw90;->k:Ljava/util/Map;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    monitor-enter p0

    .line 69
    :try_start_2
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/Iterable;

    .line 74
    .line 75
    new-instance v2, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v3, 0xa

    .line 78
    .line 79
    invoke-static {v1, v3}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/util/Map$Entry;

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    new-instance v6, Low1;

    .line 111
    .line 112
    invoke-direct {v6, v5, v4}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    goto :goto_5

    .line 121
    :cond_2
    sget-object v1, Lw90;->k:Ljava/util/Map;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    monitor-exit p0

    .line 127
    sget-object p0, Lw90;->l:Ljava/util/Map;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    monitor-enter p0

    .line 133
    :try_start_3
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Ljava/lang/Iterable;

    .line 138
    .line 139
    new-instance v4, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-static {v1, v3}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_3

    .line 157
    .line 158
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Ljava/util/Map$Entry;

    .line 163
    .line 164
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    new-instance v6, Low1;

    .line 173
    .line 174
    invoke-direct {v6, v5, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catchall_2
    move-exception v0

    .line 182
    goto :goto_4

    .line 183
    :cond_3
    sget-object v1, Lw90;->l:Ljava/util/Map;

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    .line 187
    .line 188
    monitor-exit p0

    .line 189
    new-instance p0, Ls1;

    .line 190
    .line 191
    const/16 v1, 0x8

    .line 192
    .line 193
    invoke-direct {p0, v0, v2, v4, v1}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_4

    .line 209
    .line 210
    invoke-virtual {p0}, Ls1;->a()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_4
    sget-object v0, Lw90;->i:Landroid/os/Handler;

    .line 215
    .line 216
    new-instance v1, Lm2;

    .line 217
    .line 218
    const/4 v2, 0x7

    .line 219
    invoke-direct {v1, v2, p0}, Lm2;-><init>(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 223
    .line 224
    .line 225
    :goto_3
    return-void

    .line 226
    :goto_4
    monitor-exit p0

    .line 227
    throw v0

    .line 228
    :goto_5
    monitor-exit p0

    .line 229
    throw v0

    .line 230
    :catchall_3
    move-exception v0

    .line 231
    monitor-exit p0

    .line 232
    throw v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lw90;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lw90;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lw90;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
