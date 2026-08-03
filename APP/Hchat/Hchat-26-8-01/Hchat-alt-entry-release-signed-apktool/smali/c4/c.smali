.class public final Lc4/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lc4/b;
.implements Lc4/e;
.implements Lc4/g;


# static fields
.field public static final c:Lc4/c;

.field public static final d:Lc4/c;

.field public static final e:Lc4/c;

.field public static final f:Lc4/c;

.field public static final g:Lc4/c;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lc4/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc4/c;->c:Lc4/c;

    .line 8
    .line 9
    new-instance v0, Lc4/c;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lc4/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lc4/c;->d:Lc4/c;

    .line 16
    .line 17
    new-instance v0, Lc4/c;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lc4/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lc4/c;->e:Lc4/c;

    .line 24
    .line 25
    new-instance v0, Lc4/c;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lc4/c;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lc4/c;->f:Lc4/c;

    .line 32
    .line 33
    new-instance v0, Lc4/c;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lc4/c;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lc4/c;->g:Lc4/c;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc4/c;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 12

    .line 1
    iget v0, p0, Lc4/c;->b:I

    .line 2
    .line 3
    const-string v1, "android"

    .line 4
    .line 5
    const-string v2, "dimen"

    .line 6
    .line 7
    const-string v3, "navigation_bar_height"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, Lc4/b;->a:Lc4/a;

    .line 11
    .line 12
    const-string v6, "getBounds"

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const-string v8, "windowConfiguration"

    .line 16
    .line 17
    const-class v9, Landroid/content/res/Configuration;

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :try_start_0
    invoke-virtual {v9, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, v6, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-virtual {v1, v0, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v0, Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-direct {v2, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception v0

    .line 66
    instance-of v1, v0, Ljava/lang/NoSuchFieldException;

    .line 67
    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    instance-of v1, v0, Ljava/lang/NoSuchMethodException;

    .line 71
    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    instance-of v1, v0, Ljava/lang/IllegalAccessException;

    .line 75
    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 79
    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    throw v0

    .line 84
    :cond_1
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v1, Lc4/a;->b:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 90
    .line 91
    .line 92
    sget-object v0, Lc4/c;->d:Lc4/c;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lc4/c;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_1
    return-object v2

    .line 99
    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    .line 100
    .line 101
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-virtual {v11}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    :try_start_1
    invoke-virtual {v9, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_2

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9, v6, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v6, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    check-cast v6, Landroid/graphics/Rect;

    .line 145
    .line 146
    invoke-virtual {v0, v6}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :catch_1
    move-exception v6

    .line 151
    goto :goto_2

    .line 152
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    const-string v9, "getAppBounds"

    .line 157
    .line 158
    invoke-virtual {v6, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    check-cast v6, Landroid/graphics/Rect;

    .line 170
    .line 171
    invoke-virtual {v0, v6}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :goto_2
    instance-of v8, v6, Ljava/lang/NoSuchFieldException;

    .line 176
    .line 177
    if-nez v8, :cond_4

    .line 178
    .line 179
    instance-of v8, v6, Ljava/lang/NoSuchMethodException;

    .line 180
    .line 181
    if-nez v8, :cond_4

    .line 182
    .line 183
    instance-of v8, v6, Ljava/lang/IllegalAccessException;

    .line 184
    .line 185
    if-nez v8, :cond_4

    .line 186
    .line 187
    instance-of v8, v6, Ljava/lang/reflect/InvocationTargetException;

    .line 188
    .line 189
    if-eqz v8, :cond_3

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_3
    throw v6

    .line 193
    :cond_4
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    sget-object v8, Lc4/a;->b:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v8, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v6, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    new-instance v8, Landroid/graphics/Point;

    .line 221
    .line 222
    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6, v8}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-nez v9, :cond_8

    .line 233
    .line 234
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-virtual {v9, v3, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-lez v1, :cond_5

    .line 243
    .line 244
    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    goto :goto_5

    .line 249
    :cond_5
    move v1, v4

    .line 250
    :goto_5
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 251
    .line 252
    add-int/2addr v2, v1

    .line 253
    iget v3, v8, Landroid/graphics/Point;->y:I

    .line 254
    .line 255
    if-ne v2, v3, :cond_6

    .line 256
    .line 257
    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_6
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 261
    .line 262
    add-int/2addr v2, v1

    .line 263
    iget v3, v8, Landroid/graphics/Point;->x:I

    .line 264
    .line 265
    if-ne v2, v3, :cond_7

    .line 266
    .line 267
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_7
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 271
    .line 272
    if-ne v2, v1, :cond_8

    .line 273
    .line 274
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 275
    .line 276
    :cond_8
    :goto_6
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    iget v2, v8, Landroid/graphics/Point;->x:I

    .line 281
    .line 282
    if-lt v1, v2, :cond_9

    .line 283
    .line 284
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    iget v2, v8, Landroid/graphics/Point;->y:I

    .line 289
    .line 290
    if-ge v1, v2, :cond_10

    .line 291
    .line 292
    :cond_9
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-nez p1, :cond_10

    .line 297
    .line 298
    :try_start_2
    const-string p1, "android.view.DisplayInfo"

    .line 299
    .line 300
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p1, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    const-string v2, "getDisplayInfo"

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 334
    .line 335
    .line 336
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v1, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const-string v2, "displayCutout"

    .line 348
    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-static {p1}, Lb0/b0;->x(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_c

    .line 365
    .line 366
    invoke-static {p1}, Lb0/b0;->d(Ljava/lang/Object;)Landroid/view/DisplayCutout;

    .line 367
    .line 368
    .line 369
    move-result-object v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 370
    goto :goto_8

    .line 371
    :catch_2
    move-exception p1

    .line 372
    instance-of v1, p1, Ljava/lang/ClassNotFoundException;

    .line 373
    .line 374
    if-nez v1, :cond_b

    .line 375
    .line 376
    instance-of v1, p1, Ljava/lang/NoSuchMethodException;

    .line 377
    .line 378
    if-nez v1, :cond_b

    .line 379
    .line 380
    instance-of v1, p1, Ljava/lang/NoSuchFieldException;

    .line 381
    .line 382
    if-nez v1, :cond_b

    .line 383
    .line 384
    instance-of v1, p1, Ljava/lang/IllegalAccessException;

    .line 385
    .line 386
    if-nez v1, :cond_b

    .line 387
    .line 388
    instance-of v1, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 389
    .line 390
    if-nez v1, :cond_b

    .line 391
    .line 392
    instance-of v1, p1, Ljava/lang/InstantiationException;

    .line 393
    .line 394
    if-eqz v1, :cond_a

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_a
    throw p1

    .line 398
    :cond_b
    :goto_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    sget-object v1, Lc4/a;->b:Ljava/lang/String;

    .line 402
    .line 403
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 404
    .line 405
    .line 406
    :cond_c
    :goto_8
    if-eqz v10, :cond_10

    .line 407
    .line 408
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 409
    .line 410
    invoke-static {v10}, Lb0/b0;->y(Landroid/view/DisplayCutout;)I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-ne p1, v1, :cond_d

    .line 415
    .line 416
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 417
    .line 418
    :cond_d
    iget p1, v8, Landroid/graphics/Point;->x:I

    .line 419
    .line 420
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 421
    .line 422
    sub-int/2addr p1, v1

    .line 423
    invoke-static {v10}, Lb0/b0;->C(Landroid/view/DisplayCutout;)I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-ne p1, v1, :cond_e

    .line 428
    .line 429
    iget p1, v0, Landroid/graphics/Rect;->right:I

    .line 430
    .line 431
    invoke-static {v10}, Lb0/b0;->C(Landroid/view/DisplayCutout;)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    add-int/2addr v1, p1

    .line 436
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 437
    .line 438
    :cond_e
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 439
    .line 440
    invoke-static {v10}, Lb0/b0;->a(Landroid/view/DisplayCutout;)I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-ne p1, v1, :cond_f

    .line 445
    .line 446
    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 447
    .line 448
    :cond_f
    iget p1, v8, Landroid/graphics/Point;->y:I

    .line 449
    .line 450
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 451
    .line 452
    sub-int/2addr p1, v1

    .line 453
    invoke-static {v10}, Lb0/b0;->A(Landroid/view/DisplayCutout;)I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-ne p1, v1, :cond_10

    .line 458
    .line 459
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 460
    .line 461
    invoke-static {v10}, Lb0/b0;->A(Landroid/view/DisplayCutout;)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    add-int/2addr v1, p1

    .line 466
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 467
    .line 468
    :cond_10
    return-object v0

    .line 469
    :pswitch_1
    new-instance v0, Landroid/graphics/Rect;

    .line 470
    .line 471
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-virtual {v5, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-nez v6, :cond_13

    .line 490
    .line 491
    new-instance v6, Landroid/graphics/Point;

    .line 492
    .line 493
    invoke-direct {v6}, Landroid/graphics/Point;-><init>()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v5, v6}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    invoke-virtual {p1, v3, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-lez v1, :cond_11

    .line 508
    .line 509
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    :cond_11
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 514
    .line 515
    add-int/2addr p1, v4

    .line 516
    iget v1, v6, Landroid/graphics/Point;->y:I

    .line 517
    .line 518
    if-ne p1, v1, :cond_12

    .line 519
    .line 520
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_12
    iget p1, v0, Landroid/graphics/Rect;->right:I

    .line 524
    .line 525
    add-int/2addr p1, v4

    .line 526
    iget v1, v6, Landroid/graphics/Point;->x:I

    .line 527
    .line 528
    if-ne p1, v1, :cond_13

    .line 529
    .line 530
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 531
    .line 532
    :cond_13
    :goto_9
    return-object v0

    .line 533
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroid/content/ContextWrapper;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    return p1
.end method

.method public c(Landroid/content/ContextWrapper;Lc4/e;)Lb4/a;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p1

    .line 5
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    instance-of v1, v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    instance-of v1, v0, Landroid/inputmethodservice/InputMethodService;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v1, v0

    .line 20
    check-cast v1, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move-object v0, p1

    .line 38
    :goto_1
    instance-of v1, v0, Landroid/app/Activity;

    .line 39
    .line 40
    if-eqz v1, :cond_7

    .line 41
    .line 42
    check-cast v0, Landroid/app/Activity;

    .line 43
    .line 44
    new-instance p1, Lb4/a;

    .line 45
    .line 46
    new-instance v1, La4/a;

    .line 47
    .line 48
    sget-object v2, Lc4/b;->a:Lc4/a;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v3, 0x1e

    .line 56
    .line 57
    if-lt v2, v3, :cond_4

    .line 58
    .line 59
    sget-object v2, Lc4/d;->b:Lc4/d;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/16 v3, 0x1d

    .line 63
    .line 64
    if-lt v2, v3, :cond_5

    .line 65
    .line 66
    sget-object v2, Lc4/c;->e:Lc4/c;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    const/16 v3, 0x1c

    .line 70
    .line 71
    if-lt v2, v3, :cond_6

    .line 72
    .line 73
    sget-object v2, Lc4/c;->d:Lc4/c;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    sget-object v2, Lc4/c;->c:Lc4/c;

    .line 77
    .line 78
    :goto_2
    invoke-interface {v2, v0}, Lc4/b;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {v1, v2}, La4/a;-><init>(Landroid/graphics/Rect;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p2, v0}, Lc4/e;->b(Landroid/content/ContextWrapper;)F

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-direct {p1, v1, p2}, Lb4/a;-><init>(La4/a;F)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_7
    instance-of v1, v0, Landroid/inputmethodservice/InputMethodService;

    .line 94
    .line 95
    if-nez v1, :cond_9

    .line 96
    .line 97
    instance-of v0, v0, Landroid/app/Application;

    .line 98
    .line 99
    if-eqz v0, :cond_8

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_8
    const-string p1, "Must provide a UiContext or Application Context"

    .line 103
    .line 104
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    return-object p1

    .line 109
    :cond_9
    :goto_3
    const-string v0, "window"

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    check-cast v0, Landroid/view/WindowManager;

    .line 119
    .line 120
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v1, Landroid/graphics/Point;

    .line 128
    .line 129
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Landroid/graphics/Rect;

    .line 136
    .line 137
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 138
    .line 139
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lb4/a;

    .line 146
    .line 147
    invoke-interface {p2, p1}, Lc4/e;->b(Landroid/content/ContextWrapper;)F

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-direct {v1, v0, p1}, Lb4/a;-><init>(Landroid/graphics/Rect;F)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method
