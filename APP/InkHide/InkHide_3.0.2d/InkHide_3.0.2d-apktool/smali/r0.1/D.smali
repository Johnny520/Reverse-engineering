.class public final Lr0/D;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/E;


# direct methods
.method public synthetic constructor <init>(Lr0/E;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/D;->a:I

    iput-object p1, p0, Lr0/D;->b:Lr0/E;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    const-string v1, "f434578s"

    .line 4
    .line 5
    const/16 v2, 0xc08

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const-string v5, "args"

    .line 10
    .line 11
    const/4 v6, -0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, p0, Lr0/D;->b:Lr0/E;

    .line 14
    .line 15
    const-string v9, "param"

    .line 16
    .line 17
    iget v10, p0, Lr0/D;->a:I

    .line 18
    .line 19
    packed-switch v10, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget v0, Lz0/r;->e:I

    .line 27
    .line 28
    if-ne v0, v6, :cond_0

    .line 29
    .line 30
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget v6, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    sput v6, Lz0/r;->e:I

    .line 62
    .line 63
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 64
    .line 65
    if-eq v0, v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_1
    iget-boolean v0, v8, Lr0/E;->d:Z

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    sget-boolean v0, Lz0/i;->a:Z

    .line 75
    .line 76
    invoke-static {}, Lz0/g;->x()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    instance-of v1, v0, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object v0, v3

    .line 100
    :goto_1
    if-nez v0, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v8, v0}, Lr0/E;->F(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 111
    .line 112
    if-nez v1, :cond_7

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v8, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 121
    .line 122
    iget-object v2, v8, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 123
    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :cond_8
    invoke-static {v3, v1}, Lr0/E;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v1, v2, v0}, Lr0/E;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v8, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    if-eqz v1, :cond_9

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Landroid/widget/ListView;

    .line 146
    .line 147
    if-eqz v1, :cond_9

    .line 148
    .line 149
    new-instance v2, Lr0/z;

    .line 150
    .line 151
    invoke-direct {v2, p0, v8}, Lr0/z;-><init>(Lr0/D;Lr0/E;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 155
    .line 156
    .line 157
    :cond_9
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {p1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v7, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const-string v1, "hide close friend live update hidden after native"

    .line 167
    .line 168
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-void

    .line 176
    :pswitch_1
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 180
    .line 181
    if-nez p1, :cond_a

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_a
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 185
    .line 186
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iput-object v0, v8, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    const-string v0, "hide close friend datasource ctor"

    .line 200
    .line 201
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :goto_3
    return-void

    .line 209
    :pswitch_2
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v8, p1}, Lr0/E;->a(Lr0/E;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_3
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {v8, p1}, Lr0/E;->a(Lr0/E;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_4
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    sget-boolean v2, Lz0/i;->a:Z

    .line 231
    .line 232
    invoke-static {}, Lz0/g;->x()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-nez v2, :cond_b

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 240
    .line 241
    invoke-static {v2, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v7, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    instance-of v4, v2, Ljava/lang/String;

    .line 249
    .line 250
    if-eqz v4, :cond_c

    .line 251
    .line 252
    check-cast v2, Ljava/lang/String;

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_c
    move-object v2, v3

    .line 256
    :goto_4
    if-nez v2, :cond_d

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_d
    invoke-virtual {v8, v2}, Lr0/E;->F(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_e

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_e
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 267
    .line 268
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v4, v0}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Ljava/util/Map;

    .line 277
    .line 278
    if-eqz v0, :cond_f

    .line 279
    .line 280
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    :cond_f
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :goto_5
    return-void

    .line 287
    :pswitch_5
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    sget v3, Lz0/r;->e:I

    .line 291
    .line 292
    if-ne v3, v6, :cond_10

    .line 293
    .line 294
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v3, v5, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :catch_1
    move-exception v3

    .line 318
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {v3}, Li0/a;->b([Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move v3, v6

    .line 326
    :goto_6
    sput v3, Lz0/r;->e:I

    .line 327
    .line 328
    :cond_10
    sget v3, Lz0/r;->e:I

    .line 329
    .line 330
    if-ne v3, v2, :cond_11

    .line 331
    .line 332
    const-string p1, "hide close friend allow 8.0.71 datasource single"

    .line 333
    .line 334
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_11
    sget-boolean v2, Lz0/i;->a:Z

    .line 343
    .line 344
    invoke-static {}, Lz0/g;->x()Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-nez v2, :cond_12

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_12
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-nez v2, :cond_13

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_13
    const-string v3, "f434481b"

    .line 359
    .line 360
    const-string v5, "b"

    .line 361
    .line 362
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-static {v2, v3}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, Ljava/util/List;

    .line 374
    .line 375
    if-nez v2, :cond_14

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_14
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 379
    .line 380
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {p1, v0}, Lr0/E;->p(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    check-cast p1, Ljava/util/Map;

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    sub-int/2addr v0, v4

    .line 395
    :goto_7
    if-ge v6, v0, :cond_18

    .line 396
    .line 397
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    if-nez v1, :cond_15

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_15
    invoke-static {v1}, Lr0/E;->o(Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    if-nez v1, :cond_16

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_16
    invoke-virtual {v8, v1}, Lr0/E;->F(Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v3, :cond_17

    .line 416
    .line 417
    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    if-eqz p1, :cond_17

    .line 421
    .line 422
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    :cond_17
    :goto_8
    add-int/2addr v0, v6

    .line 426
    goto :goto_7

    .line 427
    :cond_18
    :goto_9
    return-void

    .line 428
    :pswitch_6
    invoke-static {p1, v9}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 432
    .line 433
    if-nez v0, :cond_19

    .line 434
    .line 435
    goto/16 :goto_e

    .line 436
    .line 437
    :cond_19
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 438
    .line 439
    invoke-static {p1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v7, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    instance-of v1, p1, Landroid/widget/ListView;

    .line 447
    .line 448
    if-eqz v1, :cond_1a

    .line 449
    .line 450
    check-cast p1, Landroid/widget/ListView;

    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_1a
    move-object p1, v3

    .line 454
    :goto_a
    if-nez p1, :cond_1b

    .line 455
    .line 456
    goto :goto_e

    .line 457
    :cond_1b
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 458
    .line 459
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    iput-object v1, v8, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 463
    .line 464
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 465
    .line 466
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    iput-object v1, v8, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 470
    .line 471
    sget-boolean v1, Lz0/i;->a:Z

    .line 472
    .line 473
    invoke-static {}, Lz0/g;->x()Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_22

    .line 478
    .line 479
    invoke-static {}, Lz0/r;->u()Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-eqz v1, :cond_21

    .line 484
    .line 485
    invoke-static {}, Lr0/E;->w()Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-eqz v1, :cond_1c

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_1c
    invoke-static {}, Lr0/E;->b()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    iget-object v2, v8, Lr0/E;->g:Ljava/lang/ref/WeakReference;

    .line 497
    .line 498
    if-eqz v2, :cond_1d

    .line 499
    .line 500
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    goto :goto_b

    .line 505
    :cond_1d
    move-object v2, v3

    .line 506
    :goto_b
    if-ne v2, v0, :cond_20

    .line 507
    .line 508
    iget-object v2, v8, Lr0/E;->h:Ljava/lang/ref/WeakReference;

    .line 509
    .line 510
    if-eqz v2, :cond_1e

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    move-object v3, v2

    .line 517
    check-cast v3, Landroid/widget/ListView;

    .line 518
    .line 519
    :cond_1e
    if-eq v3, p1, :cond_1f

    .line 520
    .line 521
    goto :goto_c

    .line 522
    :cond_1f
    move v4, v7

    .line 523
    :cond_20
    :goto_c
    iget-object v2, v8, Lr0/E;->i:Ljava/lang/String;

    .line 524
    .line 525
    invoke-static {v2, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 530
    .line 531
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    iput-object v3, v8, Lr0/E;->g:Ljava/lang/ref/WeakReference;

    .line 535
    .line 536
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 537
    .line 538
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    iput-object v0, v8, Lr0/E;->h:Ljava/lang/ref/WeakReference;

    .line 542
    .line 543
    iput-object v1, v8, Lr0/E;->i:Ljava/lang/String;

    .line 544
    .line 545
    if-nez v4, :cond_21

    .line 546
    .line 547
    if-nez v2, :cond_22

    .line 548
    .line 549
    :cond_21
    :goto_d
    invoke-virtual {v8}, Lr0/E;->E()V

    .line 550
    .line 551
    .line 552
    :cond_22
    :goto_e
    return-void

    .line 553
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x1

    .line 3
    const-string v3, "args"

    .line 4
    .line 5
    iget-object v4, p0, Lr0/D;->b:Lr0/E;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-string v0, "param"

    .line 9
    .line 10
    iget v6, p0, Lr0/D;->a:I

    .line 11
    .line 12
    sparse-switch v6, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget v0, Lz0/r;->e:I

    .line 20
    .line 21
    const/4 v6, -0x1

    .line 22
    if-ne v0, v6, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v0, v7, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v6, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    sput v6, Lz0/r;->e:I

    .line 56
    .line 57
    :cond_0
    sget v0, Lz0/r;->e:I

    .line 58
    .line 59
    const/16 v6, 0xc08

    .line 60
    .line 61
    if-ne v0, v6, :cond_1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    iget-boolean v0, v4, Lr0/E;->d:Z

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    sget-boolean v0, Lz0/i;->a:Z

    .line 70
    .line 71
    invoke-static {}, Lz0/g;->x()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    instance-of v2, v0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move-object v0, v1

    .line 95
    :goto_1
    if-nez v0, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-virtual {v4, v0}, Lr0/E;->F(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_6

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 106
    .line 107
    if-nez v2, :cond_7

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 111
    .line 112
    invoke-direct {v6, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iput-object v6, v4, Lr0/E;->c:Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    iget-object v4, v4, Lr0/E;->b:Ljava/lang/ref/WeakReference;

    .line 118
    .line 119
    if-eqz v4, :cond_8

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v4, v1

    .line 127
    :goto_2
    invoke-static {v4, v2}, Lr0/E;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v2, v4, v0}, Lr0/E;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-string v1, "hide close friend live update blocked"

    .line 147
    .line 148
    filled-new-array {v1, p1, v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :goto_3
    return-void

    .line 156
    :sswitch_1
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 160
    .line 161
    if-nez v0, :cond_a

    .line 162
    .line 163
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 164
    .line 165
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    array-length v6, v0

    .line 169
    if-nez v6, :cond_9

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    aget-object v1, v0, v5

    .line 173
    .line 174
    :goto_4
    move-object v0, v1

    .line 175
    :cond_a
    if-eqz v0, :cond_b

    .line 176
    .line 177
    iput-object v0, v4, Lr0/E;->f:Ljava/lang/Object;

    .line 178
    .line 179
    sget-object v1, Lz0/z;->a:Lz0/z;

    .line 180
    .line 181
    invoke-virtual {v1, v0}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_b
    const-class v0, Lq0/h;

    .line 185
    .line 186
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lq0/h;

    .line 191
    .line 192
    invoke-virtual {v1}, Lq0/h;->c()V

    .line 193
    .line 194
    .line 195
    sget-boolean v1, Lz0/i;->a:Z

    .line 196
    .line 197
    invoke-static {}, Lz0/g;->x()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_c

    .line 202
    .line 203
    goto/16 :goto_e

    .line 204
    .line 205
    :cond_c
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 206
    .line 207
    aget-object v1, v1, v2

    .line 208
    .line 209
    if-eqz v1, :cond_22

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    if-nez v1, :cond_d

    .line 216
    .line 217
    goto/16 :goto_e

    .line 218
    .line 219
    :cond_d
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 220
    .line 221
    invoke-static {v6, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const/4 v3, 0x2

    .line 225
    invoke-static {v3, v6}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 233
    .line 234
    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    const-string v7, "toLowerCase(...)"

    .line 239
    .line 240
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string v7, "fts"

    .line 244
    .line 245
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-nez v7, :cond_15

    .line 250
    .line 251
    const-string v7, "tophits"

    .line 252
    .line 253
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-nez v7, :cond_15

    .line 258
    .line 259
    const-string v7, "aux_index"

    .line 260
    .line 261
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-nez v7, :cond_15

    .line 266
    .line 267
    const-string v7, "search"

    .line 268
    .line 269
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-nez v7, :cond_15

    .line 274
    .line 275
    const-string v7, "matchinfo"

    .line 276
    .line 277
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_15

    .line 282
    .line 283
    const-string v7, "snippet"

    .line 284
    .line 285
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_e

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_e
    const-string v7, "rconversation"

    .line 293
    .line 294
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    if-nez v8, :cond_f

    .line 299
    .line 300
    const-string v8, "conversations"

    .line 301
    .line 302
    invoke-static {v6, v8, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    if-eqz v8, :cond_15

    .line 307
    .line 308
    :cond_f
    sget-object v8, Lr0/E;->o:LU0/g;

    .line 309
    .line 310
    invoke-virtual {v8, v1}, LU0/g;->a(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    if-eqz v8, :cond_10

    .line 315
    .line 316
    invoke-virtual {v4, v3}, Lr0/E;->t(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-nez v3, :cond_14

    .line 321
    .line 322
    invoke-virtual {v4, v1}, Lr0/E;->f(Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_15

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_10
    invoke-virtual {v4, v1}, Lr0/E;->f(Ljava/lang/String;)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_11

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_11
    invoke-static {v6, v7, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    if-nez v7, :cond_12

    .line 341
    .line 342
    move v3, v5

    .line 343
    goto :goto_5

    .line 344
    :cond_12
    invoke-virtual {v4, v3}, Lr0/E;->t(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    :goto_5
    if-eqz v3, :cond_13

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_13
    const-string v3, " from rconversation"

    .line 352
    .line 353
    invoke-static {v6, v3, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-nez v3, :cond_14

    .line 358
    .line 359
    const-string v3, " from conversations"

    .line 360
    .line 361
    invoke-static {v6, v3, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-nez v3, :cond_14

    .line 366
    .line 367
    const-string v3, "select * from rconversation"

    .line 368
    .line 369
    invoke-static {v6, v3, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-nez v3, :cond_14

    .line 374
    .line 375
    const-string v3, "select * from (select * from rconversation"

    .line 376
    .line 377
    invoke-static {v6, v3, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_15

    .line 382
    .line 383
    :cond_14
    :goto_6
    move v3, v2

    .line 384
    goto :goto_8

    .line 385
    :cond_15
    :goto_7
    move v3, v5

    .line 386
    :goto_8
    if-nez v3, :cond_16

    .line 387
    .line 388
    goto/16 :goto_e

    .line 389
    .line 390
    :cond_16
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, Lq0/h;

    .line 395
    .line 396
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_17

    .line 403
    .line 404
    goto/16 :goto_e

    .line 405
    .line 406
    :cond_17
    invoke-static {v0}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    new-instance v4, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    :cond_18
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-eqz v6, :cond_19

    .line 424
    .line 425
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    move-object v7, v6

    .line 430
    check-cast v7, Ljava/lang/String;

    .line 431
    .line 432
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-nez v7, :cond_18

    .line 437
    .line 438
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_9

    .line 442
    :cond_19
    new-instance v8, Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    :cond_1a
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-eqz v4, :cond_1b

    .line 456
    .line 457
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    move-object v6, v4

    .line 462
    check-cast v6, Ljava/lang/String;

    .line 463
    .line 464
    sget-boolean v7, Lz0/i;->a:Z

    .line 465
    .line 466
    invoke-static {v6}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    if-nez v6, :cond_1a

    .line 471
    .line 472
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_1b
    new-instance v12, Lq0/d;

    .line 477
    .line 478
    const/16 v3, 0x16

    .line 479
    .line 480
    invoke-direct {v12, v3}, Lq0/d;-><init>(I)V

    .line 481
    .line 482
    .line 483
    const/4 v10, 0x0

    .line 484
    const/4 v11, 0x0

    .line 485
    const-string v9, ","

    .line 486
    .line 487
    const/16 v13, 0x1e

    .line 488
    .line 489
    invoke-static/range {v8 .. v13}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {}, Lr0/E;->v()Z

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    if-eqz v4, :cond_1c

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    const-string v4, "mask="

    .line 504
    .line 505
    invoke-static {v0, v4}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    sget-boolean v4, Lz0/i;->a:Z

    .line 510
    .line 511
    invoke-static {}, Lz0/g;->o()Ljava/util/Set;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    const-string v6, "temp="

    .line 520
    .line 521
    invoke-static {v4, v6}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    const-string v7, "hideValueBlank="

    .line 530
    .line 531
    invoke-static {v7, v6}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    const-string v7, "hide close friend 65-66 sql filter"

    .line 536
    .line 537
    filled-new-array {v7, v0, v4, v6}, [Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_1c
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-eqz v0, :cond_1d

    .line 549
    .line 550
    goto/16 :goto_e

    .line 551
    .line 552
    :cond_1d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 553
    .line 554
    invoke-static {v1}, LU0/i;->D0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    const-string v1, ";"

    .line 563
    .line 564
    invoke-static {v0, v1}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eqz v4, :cond_1e

    .line 569
    .line 570
    invoke-static {v0}, LU0/i;->k0(Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    :cond_1e
    sget-object v6, Lr0/E;->q:LU0/g;

    .line 575
    .line 576
    invoke-virtual {v6, v5, v0}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    if-eqz v6, :cond_1f

    .line 581
    .line 582
    iget-object v6, v6, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 583
    .line 584
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->start()I

    .line 585
    .line 586
    .line 587
    move-result v7

    .line 588
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->end()I

    .line 589
    .line 590
    .line 591
    move-result v6

    .line 592
    invoke-static {v7, v6}, LD/h;->U(II)LR0/c;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    if-eqz v6, :cond_1f

    .line 597
    .line 598
    iget v6, v6, LR0/a;->a:I

    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    :goto_b
    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    const-string v7, "substring(...)"

    .line 610
    .line 611
    invoke-static {v5, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    invoke-static {v5}, LU0/i;->D0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    new-instance v6, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    const-string v7, "username NOT IN ("

    .line 632
    .line 633
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const-string v3, ")"

    .line 640
    .line 641
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    sget-object v6, Lr0/E;->p:LU0/g;

    .line 649
    .line 650
    invoke-virtual {v6, v5}, LU0/g;->a(Ljava/lang/String;)Z

    .line 651
    .line 652
    .line 653
    move-result v6

    .line 654
    if-eqz v6, :cond_20

    .line 655
    .line 656
    const-string v6, " AND "

    .line 657
    .line 658
    goto :goto_c

    .line 659
    :cond_20
    const-string v6, " WHERE "

    .line 660
    .line 661
    :goto_c
    if-eqz v4, :cond_21

    .line 662
    .line 663
    goto :goto_d

    .line 664
    :cond_21
    const-string v1, ""

    .line 665
    .line 666
    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    aput-object v0, p1, v2

    .line 691
    .line 692
    :cond_22
    :goto_e
    return-void

    .line 693
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
