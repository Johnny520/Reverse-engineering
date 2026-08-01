.class public final Lr0/C0;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/C0;->a:I

    iput-object p1, p0, Lr0/C0;->b:Lr0/H0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "args"

    .line 9
    .line 10
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v3, v0, Ljava/lang/Integer;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v4

    .line 27
    :goto_0
    if-eqz v0, :cond_14

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :try_start_0
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 34
    .line 35
    const-string v6, "getItem"

    .line 36
    .line 37
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 42
    .line 43
    invoke-interface {v7, v5, v6, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    new-instance v5, LE0/d;

    .line 50
    .line 51
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object v0, v5

    .line 55
    :goto_1
    nop

    .line 56
    instance-of v5, v0, LE0/d;

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    move-object v0, v4

    .line 61
    :cond_1
    if-nez v0, :cond_2

    .line 62
    .line 63
    goto/16 :goto_a

    .line 64
    .line 65
    :cond_2
    iget-object v5, p0, Lr0/C0;->b:Lr0/H0;

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    goto/16 :goto_a

    .line 77
    .line 78
    :cond_3
    invoke-static {}, Lr0/H0;->Y0()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    const-string v8, "item="

    .line 83
    .line 84
    const-string v9, "adapter="

    .line 85
    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    const/4 v7, 0x3

    .line 89
    if-ge v3, v7, :cond_4

    .line 90
    .line 91
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    const-string v10, "user="

    .line 118
    .line 119
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    const-string v11, "8076 recycler onBind"

    .line 124
    .line 125
    filled-new-array {v11, v3, v7, v10}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v5, v3, v0}, Lr0/H0;->a1(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {v3, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-static {v1, v3}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    instance-of v3, v1, Landroid/view/View;

    .line 148
    .line 149
    if-eqz v3, :cond_5

    .line 150
    .line 151
    check-cast v1, Landroid/view/View;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    if-eqz v1, :cond_6

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_2

    .line 161
    :cond_6
    move-object v3, v4

    .line 162
    :goto_2
    if-eqz v3, :cond_8

    .line 163
    .line 164
    const-class v7, Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-nez v7, :cond_8

    .line 171
    .line 172
    :try_start_1
    const-string v7, "itemView"

    .line 173
    .line 174
    invoke-virtual {v3, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    instance-of v10, v7, Landroid/view/View;

    .line 186
    .line 187
    if-eqz v10, :cond_7

    .line 188
    .line 189
    check-cast v7, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_7
    move-object v7, v4

    .line 193
    :goto_3
    move-object v1, v7

    .line 194
    goto :goto_4

    .line 195
    :catchall_1
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    goto :goto_2

    .line 200
    :cond_8
    move-object v1, v4

    .line 201
    :goto_4
    if-eqz v1, :cond_13

    .line 202
    .line 203
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 204
    .line 205
    const-string v3, "thisObject"

    .line 206
    .line 207
    invoke-static {p1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-static {v3, v7, v0}, Lr0/H0;->V0(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_9

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {v9, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const-string v3, "8076 recycler cache skip"

    .line 253
    .line 254
    filled-new-array {v3, p1, v2}, [Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_9

    .line 262
    .line 263
    :cond_9
    iget-object v3, v5, Lr0/H0;->O:Li/t;

    .line 264
    .line 265
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-static {v1}, Li/t;->i(Landroid/view/View;)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    if-nez v7, :cond_b

    .line 273
    .line 274
    :cond_a
    :goto_5
    move-object v2, v4

    .line 275
    goto :goto_7

    .line 276
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    iget-object v12, v3, Li/t;->e:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v12, Lr0/k0;

    .line 291
    .line 292
    invoke-virtual {v12, v10, v11, v0}, Lr0/k0;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-nez v10, :cond_c

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_c
    iget-object v10, v3, Li/t;->d:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v10, Lr0/k0;

    .line 306
    .line 307
    invoke-virtual {v10, v0}, Lr0/k0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    check-cast v10, Ljava/lang/String;

    .line 312
    .line 313
    if-eqz v10, :cond_a

    .line 314
    .line 315
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    if-nez v11, :cond_d

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_d
    move-object v10, v4

    .line 323
    :goto_6
    if-nez v10, :cond_e

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_e
    new-instance v11, Lr0/m;

    .line 327
    .line 328
    invoke-static {v10}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-static {v12}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v12

    .line 344
    invoke-direct {v11, v10, v12, v2}, Lr0/m;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v7, p1, v11}, Li/t;->e(Landroid/view/View;Ljava/lang/Object;Lr0/m;)Lr0/l;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    :goto_7
    if-nez v2, :cond_10

    .line 352
    .line 353
    invoke-static {v1}, Li/t;->i(Landroid/view/View;)Landroid/view/View;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    if-nez v2, :cond_f

    .line 358
    .line 359
    move-object v2, v4

    .line 360
    goto :goto_8

    .line 361
    :cond_f
    invoke-virtual {v3, v2, p1}, Li/t;->l(Landroid/view/View;Ljava/lang/Object;)Lr0/m;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual {v3, v2, p1, v7}, Li/t;->e(Landroid/view/View;Ljava/lang/Object;Lr0/m;)Lr0/l;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    :goto_8
    if-nez v2, :cond_10

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {v9, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const-string v3, "8076 recycler cache miss"

    .line 396
    .line 397
    filled-new-array {v3, p1, v2}, [Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {v9, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    iget-object v3, v2, Lr0/l;->b:Landroid/view/View;

    .line 418
    .line 419
    if-eqz v3, :cond_11

    .line 420
    .line 421
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    :cond_11
    if-nez v4, :cond_12

    .line 430
    .line 431
    const-string v4, ""

    .line 432
    .line 433
    :cond_12
    const-string v3, "rv="

    .line 434
    .line 435
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    new-instance v4, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    const-string v7, "source="

    .line 442
    .line 443
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    iget-object v7, v2, Lr0/l;->h:Lr0/n;

    .line 447
    .line 448
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    const-string v7, "8076 recycler cache hit"

    .line 456
    .line 457
    filled-new-array {v7, p1, v3, v4}, [Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5, v2}, Lr0/H0;->r(Lr0/l;)V

    .line 465
    .line 466
    .line 467
    :goto_9
    invoke-static {v1, v6}, Lz0/l;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    :cond_13
    invoke-virtual {v5, v0, v6}, Lr0/H0;->t1(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    :cond_14
    :goto_a
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const/16 v4, 0xbf4

    .line 7
    .line 8
    const/4 v5, -0x1

    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    const/4 v8, 0x2

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x1

    .line 14
    iget v0, v1, Lr0/C0;->a:I

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    return-void

    .line 20
    :pswitch_1
    const-string v0, "param"

    .line 21
    .line 22
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 26
    .line 27
    const-string v3, "args"

    .line 28
    .line 29
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v11, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {v4, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v8, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, v1, Lr0/C0;->b:Lr0/H0;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lr0/H0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    invoke-static {v4, v0, v5}, Lr0/H0;->k(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-boolean v0, Lz0/i;->a:Z

    .line 67
    .line 68
    invoke-static {}, Lz0/g;->w()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-static {v4, v3, v5}, Lr0/H0;->c(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v0, ""

    .line 78
    .line 79
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-static {v4}, Lr0/H0;->h(Lr0/H0;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-static {v4, v3}, Lr0/H0;->d(Lr0/H0;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_0
    return-void

    .line 92
    :pswitch_2
    const-string v0, "param"

    .line 93
    .line 94
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 98
    .line 99
    const-string v3, "args"

    .line 100
    .line 101
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v10, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v11, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lr0/H0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-static {v4}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_5

    .line 134
    .line 135
    invoke-static {v3, v0, v4}, Lr0/H0;->k(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-boolean v0, Lz0/i;->a:Z

    .line 139
    .line 140
    invoke-static {}, Lz0/g;->w()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    invoke-static {v3, v2, v4}, Lr0/H0;->c(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_4
    invoke-static {v3}, Lr0/H0;->h(Lr0/H0;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    invoke-static {v3, v2}, Lr0/H0;->d(Lr0/H0;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    :goto_1
    return-void

    .line 159
    :pswitch_3
    const-string v0, "param"

    .line 160
    .line 161
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 165
    .line 166
    const-string v3, "args"

    .line 167
    .line 168
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v10, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-nez v0, :cond_6

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, Lr0/H0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v4}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_8

    .line 192
    .line 193
    invoke-static {v3, v0, v4}, Lr0/H0;->k(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    sget-boolean v0, Lz0/i;->a:Z

    .line 197
    .line 198
    invoke-static {}, Lz0/g;->w()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_7

    .line 203
    .line 204
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v3, v0, v4}, Lr0/H0;->c(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-static {v3}, Lr0/H0;->h(Lr0/H0;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v3, v0}, Lr0/H0;->d(Lr0/H0;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    :goto_2
    return-void

    .line 225
    :pswitch_4
    const-string v0, "param"

    .line 226
    .line 227
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 231
    .line 232
    instance-of v2, v0, Landroid/app/Activity;

    .line 233
    .line 234
    if-eqz v2, :cond_9

    .line 235
    .line 236
    move-object v9, v0

    .line 237
    check-cast v9, Landroid/app/Activity;

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_9
    const/4 v9, 0x0

    .line 241
    :goto_3
    if-nez v9, :cond_a

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_a
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 245
    .line 246
    invoke-virtual {v0, v9}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_b

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_b
    invoke-virtual {v0}, Lr0/H0;->l0()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_c

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_c
    const-string v2, "launcher-resume"

    .line 261
    .line 262
    invoke-virtual {v0, v2}, Lr0/H0;->x(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :goto_4
    return-void

    .line 266
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lr0/C0;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_6
    const-string v0, "param"

    .line 271
    .line 272
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 276
    .line 277
    instance-of v3, v0, Landroid/widget/PopupWindow;

    .line 278
    .line 279
    if-eqz v3, :cond_d

    .line 280
    .line 281
    check-cast v0, Landroid/widget/PopupWindow;

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_d
    const/4 v0, 0x0

    .line 285
    :goto_5
    if-nez v0, :cond_e

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_e
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 289
    .line 290
    const-string v3, "args"

    .line 291
    .line 292
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v10, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    instance-of v3, v2, Landroid/view/View;

    .line 300
    .line 301
    if-eqz v3, :cond_f

    .line 302
    .line 303
    move-object v9, v2

    .line 304
    check-cast v9, Landroid/view/View;

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_f
    const/4 v9, 0x0

    .line 308
    :goto_6
    if-nez v9, :cond_10

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_10
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 312
    .line 313
    const-string v3, "setContentView"

    .line 314
    .line 315
    invoke-virtual {v2, v0, v3}, Lr0/H0;->y0(Landroid/widget/PopupWindow;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v9}, Lr0/H0;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    if-nez v4, :cond_11

    .line 323
    .line 324
    invoke-virtual {v2}, Lr0/H0;->E0()Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_12

    .line 329
    .line 330
    :cond_11
    invoke-virtual {v2, v0, v3}, Lr0/H0;->m1(Landroid/widget/PopupWindow;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :cond_12
    :goto_7
    return-void

    .line 334
    :pswitch_7
    const-string v0, "param"

    .line 335
    .line 336
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-nez v0, :cond_13

    .line 344
    .line 345
    goto/16 :goto_b

    .line 346
    .line 347
    :cond_13
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-static {v0}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    if-nez v4, :cond_14

    .line 357
    .line 358
    goto/16 :goto_b

    .line 359
    .line 360
    :cond_14
    iget-object v5, v3, Lr0/H0;->d:Ljava/lang/ref/WeakReference;

    .line 361
    .line 362
    if-eqz v5, :cond_15

    .line 363
    .line 364
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    goto :goto_8

    .line 369
    :cond_15
    const/4 v5, 0x0

    .line 370
    :goto_8
    invoke-static {v3, v5, v0}, Lr0/H0;->j(Lr0/H0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    sget-boolean v5, Lz0/i;->a:Z

    .line 374
    .line 375
    invoke-static {}, Lz0/g;->s()Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-nez v5, :cond_16

    .line 380
    .line 381
    const/4 v5, 0x0

    .line 382
    goto :goto_9

    .line 383
    :cond_16
    const-class v5, Lq0/h;

    .line 384
    .line 385
    invoke-static {v5}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    check-cast v5, Lq0/h;

    .line 390
    .line 391
    iget-object v5, v5, Lq0/h;->c:Ljava/util/LinkedHashMap;

    .line 392
    .line 393
    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 398
    .line 399
    :goto_9
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 400
    .line 401
    const-string v6, "args"

    .line 402
    .line 403
    invoke-static {v2, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-static {v11, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    instance-of v6, v2, Landroid/view/View;

    .line 411
    .line 412
    if-eqz v6, :cond_17

    .line 413
    .line 414
    move-object v9, v2

    .line 415
    check-cast v9, Landroid/view/View;

    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_17
    const/4 v9, 0x0

    .line 419
    :goto_a
    if-eqz v9, :cond_18

    .line 420
    .line 421
    invoke-static {v3, v9, v4, v0}, Lr0/H0;->a(Lr0/H0;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_18

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_18
    if-eqz v5, :cond_1a

    .line 429
    .line 430
    invoke-virtual {v3, v0, v4}, Lr0/H0;->t1(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-static {v3, v0, v4}, Lr0/H0;->k(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-static {}, Lz0/g;->w()Z

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-eqz v2, :cond_19

    .line 441
    .line 442
    invoke-static {v0}, Lr0/H0;->x1(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    if-eqz v9, :cond_19

    .line 446
    .line 447
    const-string v2, "last_msg_tv"

    .line 448
    .line 449
    invoke-virtual {v9, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    if-eqz v2, :cond_19

    .line 454
    .line 455
    :try_start_0
    const-string v4, "setText"

    .line 456
    .line 457
    const-string v5, ""

    .line 458
    .line 459
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 464
    .line 465
    invoke-interface {v6, v2, v4, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
    .line 467
    .line 468
    :catchall_0
    :cond_19
    invoke-static {v3}, Lr0/H0;->h(Lr0/H0;)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-eqz v2, :cond_1a

    .line 473
    .line 474
    invoke-static {v0}, Lr0/H0;->y1(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_1a
    :goto_b
    return-void

    .line 478
    :pswitch_8
    const-string v0, "param"

    .line 479
    .line 480
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 484
    .line 485
    const-string v6, "null cannot be cast to non-null type android.widget.ListAdapter"

    .line 486
    .line 487
    invoke-static {v0, v6}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    move-object v6, v0

    .line 491
    check-cast v6, Landroid/widget/ListAdapter;

    .line 492
    .line 493
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 494
    .line 495
    aget-object v0, v0, v10

    .line 496
    .line 497
    instance-of v7, v0, Ljava/lang/Integer;

    .line 498
    .line 499
    if-eqz v7, :cond_1b

    .line 500
    .line 501
    check-cast v0, Ljava/lang/Integer;

    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_1b
    const/4 v0, 0x0

    .line 505
    :goto_c
    if-eqz v0, :cond_3d

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    invoke-interface {v6, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    if-nez v7, :cond_1c

    .line 516
    .line 517
    goto/16 :goto_1b

    .line 518
    .line 519
    :cond_1c
    invoke-static {}, Lz0/r;->u()Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-eqz v0, :cond_1e

    .line 524
    .line 525
    sget v0, Lz0/r;->e:I

    .line 526
    .line 527
    if-ne v0, v5, :cond_1d

    .line 528
    .line 529
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 538
    .line 539
    .line 540
    move-result-object v12

    .line 541
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v12

    .line 545
    invoke-virtual {v0, v12, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 550
    .line 551
    goto :goto_d

    .line 552
    :catch_0
    move-exception v0

    .line 553
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    move v0, v5

    .line 561
    :goto_d
    sput v0, Lz0/r;->e:I

    .line 562
    .line 563
    :cond_1d
    sget v0, Lz0/r;->e:I

    .line 564
    .line 565
    if-lt v0, v4, :cond_1e

    .line 566
    .line 567
    move v0, v11

    .line 568
    goto :goto_e

    .line 569
    :cond_1e
    move v0, v10

    .line 570
    :goto_e
    iget-object v4, v1, Lr0/C0;->b:Lr0/H0;

    .line 571
    .line 572
    if-nez v0, :cond_1f

    .line 573
    .line 574
    invoke-static {v4, v6, v7}, Lr0/H0;->j(Lr0/H0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-static {v7}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v12

    .line 584
    if-nez v12, :cond_20

    .line 585
    .line 586
    goto/16 :goto_1b

    .line 587
    .line 588
    :cond_20
    invoke-virtual {v4}, Lr0/H0;->l0()Z

    .line 589
    .line 590
    .line 591
    move-result v13

    .line 592
    if-nez v13, :cond_21

    .line 593
    .line 594
    iget-object v13, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 595
    .line 596
    const-string v14, "args"

    .line 597
    .line 598
    invoke-static {v13, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-static {v8, v13}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v8

    .line 605
    invoke-virtual {v4, v8, v6}, Lr0/H0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    :cond_21
    invoke-static {v12}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 609
    .line 610
    .line 611
    move-result v6

    .line 612
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    instance-of v13, v8, Landroid/view/View;

    .line 617
    .line 618
    if-eqz v13, :cond_22

    .line 619
    .line 620
    check-cast v8, Landroid/view/View;

    .line 621
    .line 622
    goto :goto_f

    .line 623
    :cond_22
    const/4 v8, 0x0

    .line 624
    :goto_f
    if-nez v8, :cond_25

    .line 625
    .line 626
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 627
    .line 628
    aget-object v2, v2, v11

    .line 629
    .line 630
    instance-of v8, v2, Landroid/view/View;

    .line 631
    .line 632
    if-eqz v8, :cond_23

    .line 633
    .line 634
    move-object v9, v2

    .line 635
    check-cast v9, Landroid/view/View;

    .line 636
    .line 637
    goto :goto_10

    .line 638
    :cond_23
    const/4 v9, 0x0

    .line 639
    :goto_10
    if-nez v9, :cond_24

    .line 640
    .line 641
    goto/16 :goto_1b

    .line 642
    .line 643
    :cond_24
    move-object v8, v9

    .line 644
    :cond_25
    invoke-static {v8, v12}, Lz0/l;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    if-eqz v0, :cond_26

    .line 648
    .line 649
    if-nez v6, :cond_26

    .line 650
    .line 651
    goto/16 :goto_1b

    .line 652
    .line 653
    :cond_26
    invoke-virtual {v4, v7, v12}, Lr0/H0;->t1(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-static {}, Lr0/H0;->T0()Z

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    if-eqz v2, :cond_28

    .line 661
    .line 662
    invoke-static {}, Lr0/H0;->T0()Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    if-nez v2, :cond_27

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_27
    invoke-static {v8}, Lr0/H0;->s1(Landroid/view/View;)V

    .line 670
    .line 671
    .line 672
    :cond_28
    :goto_11
    if-nez v0, :cond_29

    .line 673
    .line 674
    invoke-static {v4, v8, v12, v7}, Lr0/H0;->a(Lr0/H0;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-eqz v0, :cond_29

    .line 679
    .line 680
    goto/16 :goto_1b

    .line 681
    .line 682
    :cond_29
    if-eqz v6, :cond_3d

    .line 683
    .line 684
    invoke-static {v4, v7, v12}, Lr0/H0;->k(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    sget-boolean v0, Lz0/i;->a:Z

    .line 688
    .line 689
    invoke-static {}, Lz0/g;->w()Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    const/16 v2, 0x97d

    .line 694
    .line 695
    const/16 v6, 0x975

    .line 696
    .line 697
    const/16 v9, 0x85c

    .line 698
    .line 699
    const/16 v13, 0x85d    # 3.0E-42f

    .line 700
    .line 701
    if-eqz v0, :cond_35

    .line 702
    .line 703
    invoke-static {v4, v7}, Lr0/H0;->i(Lr0/H0;Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-eqz v0, :cond_2a

    .line 708
    .line 709
    invoke-static {v4, v7, v12}, Lr0/H0;->c(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    goto :goto_12

    .line 713
    :cond_2a
    invoke-static {v7}, Lr0/H0;->x1(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    :goto_12
    sget v0, Lz0/r;->e:I

    .line 717
    .line 718
    if-ne v0, v5, :cond_2b

    .line 719
    .line 720
    :try_start_2
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 729
    .line 730
    .line 731
    move-result-object v12

    .line 732
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v12

    .line 736
    invoke-virtual {v0, v12, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 741
    .line 742
    goto :goto_13

    .line 743
    :catch_1
    move-exception v0

    .line 744
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    move v0, v5

    .line 752
    :goto_13
    sput v0, Lz0/r;->e:I

    .line 753
    .line 754
    :cond_2b
    sget v0, Lz0/r;->e:I

    .line 755
    .line 756
    const-string v12, "last_msg_tv"

    .line 757
    .line 758
    if-ltz v0, :cond_2c

    .line 759
    .line 760
    if-ge v0, v13, :cond_2c

    .line 761
    .line 762
    move-object v0, v12

    .line 763
    goto :goto_14

    .line 764
    :cond_2c
    if-gt v9, v0, :cond_2d

    .line 765
    .line 766
    if-ge v0, v6, :cond_2d

    .line 767
    .line 768
    const-string v0, "fhs"

    .line 769
    .line 770
    goto :goto_14

    .line 771
    :cond_2d
    if-ne v0, v2, :cond_2e

    .line 772
    .line 773
    const-string v0, "i2_"

    .line 774
    .line 775
    goto :goto_14

    .line 776
    :cond_2e
    const-string v0, "ht5"

    .line 777
    .line 778
    :goto_14
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 779
    .line 780
    .line 781
    move-result v14

    .line 782
    const-string v15, ""

    .line 783
    .line 784
    move/from16 v16, v11

    .line 785
    .line 786
    const-string v11, "setText"

    .line 787
    .line 788
    if-eqz v14, :cond_2f

    .line 789
    .line 790
    if-eq v14, v5, :cond_2f

    .line 791
    .line 792
    :try_start_3
    invoke-virtual {v8, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    if-eqz v0, :cond_2f

    .line 797
    .line 798
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    invoke-static {v0, v11, v6}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 803
    .line 804
    .line 805
    goto :goto_15

    .line 806
    :catchall_1
    move-exception v0

    .line 807
    const-string v6, "hide last message text fail"

    .line 808
    .line 809
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    :cond_2f
    :goto_15
    invoke-virtual {v8, v12}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    if-eqz v0, :cond_30

    .line 821
    .line 822
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v6

    .line 826
    invoke-static {v0, v11, v6}, Lc0/f;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    :cond_30
    if-eq v14, v5, :cond_31

    .line 830
    .line 831
    if-eqz v14, :cond_31

    .line 832
    .line 833
    goto :goto_17

    .line 834
    :cond_31
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    const-string v5, "???last???id?\ufffd\ufffd?????????????????"

    .line 839
    .line 840
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    const-string v5, "classLoader"

    .line 856
    .line 857
    invoke-static {v0, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 861
    .line 862
    const-string v6, "com.tencent.mm.ui.base.NoMeasuredTextView"

    .line 863
    .line 864
    invoke-interface {v5, v0, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    new-instance v5, Lr0/G0;

    .line 869
    .line 870
    invoke-direct {v5, v0}, Lr0/G0;-><init>(Ljava/lang/Class;)V

    .line 871
    .line 872
    .line 873
    instance-of v0, v8, Landroid/view/ViewGroup;

    .line 874
    .line 875
    if-nez v0, :cond_32

    .line 876
    .line 877
    goto :goto_17

    .line 878
    :cond_32
    invoke-virtual {v5, v8}, Lr0/G0;->a(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    move-object v0, v8

    .line 882
    check-cast v0, Landroid/view/ViewGroup;

    .line 883
    .line 884
    new-instance v6, Ljava/util/ArrayList;

    .line 885
    .line 886
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    :cond_33
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    if-lez v0, :cond_35

    .line 897
    .line 898
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    check-cast v0, Landroid/view/ViewGroup;

    .line 903
    .line 904
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move v11, v10

    .line 908
    :goto_16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 909
    .line 910
    .line 911
    move-result v12

    .line 912
    if-ge v11, v12, :cond_33

    .line 913
    .line 914
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 915
    .line 916
    .line 917
    move-result-object v12

    .line 918
    invoke-virtual {v5, v12}, Lr0/G0;->a(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    instance-of v14, v12, Landroid/view/ViewGroup;

    .line 922
    .line 923
    if-eqz v14, :cond_34

    .line 924
    .line 925
    check-cast v12, Landroid/view/ViewGroup;

    .line 926
    .line 927
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    :cond_34
    add-int/lit8 v11, v11, 0x1

    .line 931
    .line 932
    goto :goto_16

    .line 933
    :cond_35
    :goto_17
    invoke-static {v4}, Lr0/H0;->h(Lr0/H0;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-eqz v0, :cond_3d

    .line 938
    .line 939
    invoke-static {v4, v7}, Lr0/H0;->i(Lr0/H0;Ljava/lang/Object;)Z

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    if-eqz v0, :cond_36

    .line 944
    .line 945
    invoke-static {v4, v7}, Lr0/H0;->d(Lr0/H0;Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    goto :goto_18

    .line 949
    :cond_36
    invoke-static {v7}, Lr0/H0;->y1(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    :goto_18
    invoke-static {}, Lz0/r;->p()I

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    if-ltz v0, :cond_37

    .line 957
    .line 958
    if-ge v0, v13, :cond_37

    .line 959
    .line 960
    const-string v0, "tipcnt_tv"

    .line 961
    .line 962
    goto :goto_19

    .line 963
    :cond_37
    if-ne v0, v2, :cond_38

    .line 964
    .line 965
    const-string v0, "oqu"

    .line 966
    .line 967
    goto :goto_19

    .line 968
    :cond_38
    const-string v4, "kmv"

    .line 969
    .line 970
    if-gt v9, v0, :cond_39

    .line 971
    .line 972
    const/16 v5, 0x98a

    .line 973
    .line 974
    :cond_39
    move-object v0, v4

    .line 975
    :goto_19
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    if-eqz v0, :cond_3a

    .line 984
    .line 985
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 986
    .line 987
    .line 988
    :cond_3a
    invoke-static {}, Lz0/r;->p()I

    .line 989
    .line 990
    .line 991
    move-result v0

    .line 992
    if-ltz v0, :cond_3b

    .line 993
    .line 994
    const/16 v4, 0x975

    .line 995
    .line 996
    if-ge v0, v4, :cond_3b

    .line 997
    .line 998
    const-string v0, "a2f"

    .line 999
    .line 1000
    goto :goto_1a

    .line 1001
    :cond_3b
    if-ne v0, v2, :cond_3c

    .line 1002
    .line 1003
    const-string v0, "a_w"

    .line 1004
    .line 1005
    goto :goto_1a

    .line 1006
    :cond_3c
    const-string v0, "o_u"

    .line 1007
    .line 1008
    :goto_1a
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    if-eqz v0, :cond_3d

    .line 1017
    .line 1018
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1019
    .line 1020
    .line 1021
    :cond_3d
    :goto_1b
    return-void

    .line 1022
    :pswitch_9
    const-string v0, "param"

    .line 1023
    .line 1024
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1028
    .line 1029
    const-string v3, "args"

    .line 1030
    .line 1031
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v10, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1039
    .line 1040
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-nez v0, :cond_3e

    .line 1045
    .line 1046
    goto :goto_1e

    .line 1047
    :cond_3e
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1048
    .line 1049
    instance-of v2, v0, Landroid/app/Activity;

    .line 1050
    .line 1051
    if-eqz v2, :cond_3f

    .line 1052
    .line 1053
    move-object v9, v0

    .line 1054
    check-cast v9, Landroid/app/Activity;

    .line 1055
    .line 1056
    goto :goto_1c

    .line 1057
    :cond_3f
    const/4 v9, 0x0

    .line 1058
    :goto_1c
    if-nez v9, :cond_40

    .line 1059
    .line 1060
    goto :goto_1e

    .line 1061
    :cond_40
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 1062
    .line 1063
    invoke-virtual {v0, v9}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    if-nez v2, :cond_41

    .line 1068
    .line 1069
    goto :goto_1e

    .line 1070
    :cond_41
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    const-wide/16 v3, 0x12c

    .line 1075
    .line 1076
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    const-wide/16 v4, 0x3e8

    .line 1081
    .line 1082
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v4

    .line 1086
    filled-new-array {v2, v3, v4}, [Ljava/lang/Long;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v2

    .line 1090
    invoke-static {v2}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v2

    .line 1094
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    :cond_42
    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v3

    .line 1102
    if-eqz v3, :cond_43

    .line 1103
    .line 1104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v3

    .line 1108
    check-cast v3, Ljava/lang/Number;

    .line 1109
    .line 1110
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1111
    .line 1112
    .line 1113
    move-result-wide v3

    .line 1114
    invoke-virtual {v9}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    if-eqz v5, :cond_42

    .line 1119
    .line 1120
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v5

    .line 1124
    if-eqz v5, :cond_42

    .line 1125
    .line 1126
    new-instance v6, Lr0/F0;

    .line 1127
    .line 1128
    invoke-direct {v6, v0, v9, v10}, Lr0/F0;-><init>(Lr0/H0;Landroid/app/Activity;I)V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v5, v6, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1132
    .line 1133
    .line 1134
    goto :goto_1d

    .line 1135
    :cond_43
    :goto_1e
    return-void

    .line 1136
    :pswitch_a
    move/from16 v16, v11

    .line 1137
    .line 1138
    const-string v0, "param"

    .line 1139
    .line 1140
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    instance-of v3, v0, Ljava/lang/Number;

    .line 1148
    .line 1149
    if-eqz v3, :cond_44

    .line 1150
    .line 1151
    check-cast v0, Ljava/lang/Number;

    .line 1152
    .line 1153
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1154
    .line 1155
    .line 1156
    move-result-wide v3

    .line 1157
    const-wide/16 v11, -0x1

    .line 1158
    .line 1159
    cmp-long v0, v3, v11

    .line 1160
    .line 1161
    if-nez v0, :cond_44

    .line 1162
    .line 1163
    goto/16 :goto_34

    .line 1164
    .line 1165
    :cond_44
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 1166
    .line 1167
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1168
    .line 1169
    iput-object v3, v0, Lr0/H0;->y:Ljava/lang/Object;

    .line 1170
    .line 1171
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1172
    .line 1173
    const-string v3, "args"

    .line 1174
    .line 1175
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    array-length v3, v0

    .line 1179
    move v4, v10

    .line 1180
    :goto_1f
    if-ge v4, v3, :cond_46

    .line 1181
    .line 1182
    aget-object v8, v0, v4

    .line 1183
    .line 1184
    instance-of v11, v8, Ljava/lang/String;

    .line 1185
    .line 1186
    if-eqz v11, :cond_45

    .line 1187
    .line 1188
    goto :goto_20

    .line 1189
    :cond_45
    add-int/lit8 v4, v4, 0x1

    .line 1190
    .line 1191
    goto :goto_1f

    .line 1192
    :cond_46
    const/4 v8, 0x0

    .line 1193
    :goto_20
    instance-of v0, v8, Ljava/lang/String;

    .line 1194
    .line 1195
    if-eqz v0, :cond_47

    .line 1196
    .line 1197
    check-cast v8, Ljava/lang/String;

    .line 1198
    .line 1199
    goto :goto_21

    .line 1200
    :cond_47
    const/4 v8, 0x0

    .line 1201
    :goto_21
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1202
    .line 1203
    const-string v3, "args"

    .line 1204
    .line 1205
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    array-length v3, v0

    .line 1209
    move v4, v10

    .line 1210
    :goto_22
    if-ge v4, v3, :cond_49

    .line 1211
    .line 1212
    aget-object v11, v0, v4

    .line 1213
    .line 1214
    instance-of v12, v11, Landroid/content/ContentValues;

    .line 1215
    .line 1216
    if-eqz v12, :cond_48

    .line 1217
    .line 1218
    goto :goto_23

    .line 1219
    :cond_48
    add-int/lit8 v4, v4, 0x1

    .line 1220
    .line 1221
    goto :goto_22

    .line 1222
    :cond_49
    const/4 v11, 0x0

    .line 1223
    :goto_23
    instance-of v0, v11, Landroid/content/ContentValues;

    .line 1224
    .line 1225
    if-eqz v0, :cond_4a

    .line 1226
    .line 1227
    check-cast v11, Landroid/content/ContentValues;

    .line 1228
    .line 1229
    goto :goto_24

    .line 1230
    :cond_4a
    const/4 v11, 0x0

    .line 1231
    :goto_24
    if-nez v11, :cond_4b

    .line 1232
    .line 1233
    goto/16 :goto_34

    .line 1234
    .line 1235
    :cond_4b
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 1236
    .line 1237
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1238
    .line 1239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    if-eqz v8, :cond_59

    .line 1243
    .line 1244
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1245
    .line 1246
    invoke-virtual {v8, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    const-string v4, "toLowerCase(...)"

    .line 1251
    .line 1252
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    const-string v4, "conversation"

    .line 1256
    .line 1257
    invoke-static {v3, v4, v10}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v3

    .line 1261
    move/from16 v4, v16

    .line 1262
    .line 1263
    if-ne v3, v4, :cond_59

    .line 1264
    .line 1265
    sget-object v3, Lr0/H0;->q0:[Ljava/lang/String;

    .line 1266
    .line 1267
    array-length v12, v3

    .line 1268
    move v13, v10

    .line 1269
    :goto_25
    if-ge v13, v12, :cond_4c

    .line 1270
    .line 1271
    aget-object v14, v3, v13

    .line 1272
    .line 1273
    invoke-virtual {v11, v14}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v14

    .line 1277
    if-nez v14, :cond_4d

    .line 1278
    .line 1279
    add-int/2addr v13, v4

    .line 1280
    goto :goto_25

    .line 1281
    :cond_4c
    const/4 v14, 0x0

    .line 1282
    :cond_4d
    if-eqz v14, :cond_59

    .line 1283
    .line 1284
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    const-string v4, "username"

    .line 1289
    .line 1290
    invoke-virtual {v11, v4}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v4

    .line 1294
    if-nez v4, :cond_57

    .line 1295
    .line 1296
    const-string v4, "field_username"

    .line 1297
    .line 1298
    invoke-virtual {v11, v4}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v4

    .line 1302
    if-nez v4, :cond_57

    .line 1303
    .line 1304
    const-string v4, "talker"

    .line 1305
    .line 1306
    invoke-virtual {v11, v4}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v4

    .line 1310
    if-nez v4, :cond_57

    .line 1311
    .line 1312
    const-string v4, "field_talker"

    .line 1313
    .line 1314
    invoke-virtual {v11, v4}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v4

    .line 1318
    if-nez v4, :cond_57

    .line 1319
    .line 1320
    if-nez v2, :cond_4f

    .line 1321
    .line 1322
    :cond_4e
    const/4 v9, 0x0

    .line 1323
    goto :goto_29

    .line 1324
    :cond_4f
    array-length v4, v2

    .line 1325
    move v12, v10

    .line 1326
    :goto_26
    if-ge v12, v4, :cond_4e

    .line 1327
    .line 1328
    aget-object v13, v2, v12

    .line 1329
    .line 1330
    instance-of v14, v13, Ljava/lang/String;

    .line 1331
    .line 1332
    if-eqz v14, :cond_50

    .line 1333
    .line 1334
    move-object v14, v13

    .line 1335
    check-cast v14, Ljava/lang/String;

    .line 1336
    .line 1337
    invoke-static {v14}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v15

    .line 1341
    if-eqz v15, :cond_50

    .line 1342
    .line 1343
    move-object v9, v14

    .line 1344
    goto :goto_29

    .line 1345
    :cond_50
    instance-of v14, v13, [Ljava/lang/Object;

    .line 1346
    .line 1347
    if-eqz v14, :cond_55

    .line 1348
    .line 1349
    check-cast v13, [Ljava/lang/Object;

    .line 1350
    .line 1351
    new-instance v14, Ljava/util/ArrayList;

    .line 1352
    .line 1353
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1354
    .line 1355
    .line 1356
    array-length v15, v13

    .line 1357
    move v9, v10

    .line 1358
    :goto_27
    if-ge v9, v15, :cond_52

    .line 1359
    .line 1360
    aget-object v5, v13, v9

    .line 1361
    .line 1362
    instance-of v10, v5, Ljava/lang/String;

    .line 1363
    .line 1364
    if-eqz v10, :cond_51

    .line 1365
    .line 1366
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1367
    .line 1368
    .line 1369
    :cond_51
    const/16 v16, 0x1

    .line 1370
    .line 1371
    add-int/lit8 v9, v9, 0x1

    .line 1372
    .line 1373
    const/4 v5, -0x1

    .line 1374
    const/4 v10, 0x0

    .line 1375
    goto :goto_27

    .line 1376
    :cond_52
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v5

    .line 1380
    :cond_53
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v9

    .line 1384
    if-eqz v9, :cond_54

    .line 1385
    .line 1386
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v9

    .line 1390
    move-object v10, v9

    .line 1391
    check-cast v10, Ljava/lang/String;

    .line 1392
    .line 1393
    invoke-static {v10}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v10

    .line 1397
    if-eqz v10, :cond_53

    .line 1398
    .line 1399
    goto :goto_28

    .line 1400
    :cond_54
    const/4 v9, 0x0

    .line 1401
    :goto_28
    check-cast v9, Ljava/lang/String;

    .line 1402
    .line 1403
    if-eqz v9, :cond_55

    .line 1404
    .line 1405
    goto :goto_29

    .line 1406
    :cond_55
    const/16 v16, 0x1

    .line 1407
    .line 1408
    add-int/lit8 v12, v12, 0x1

    .line 1409
    .line 1410
    const/4 v5, -0x1

    .line 1411
    const/4 v10, 0x0

    .line 1412
    goto :goto_26

    .line 1413
    :goto_29
    if-nez v9, :cond_56

    .line 1414
    .line 1415
    goto :goto_2a

    .line 1416
    :cond_56
    move-object v4, v9

    .line 1417
    :cond_57
    invoke-static {v4}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v2

    .line 1421
    if-nez v2, :cond_58

    .line 1422
    .line 1423
    goto :goto_2a

    .line 1424
    :cond_58
    iput-wide v6, v0, Lr0/H0;->D:J

    .line 1425
    .line 1426
    invoke-virtual {v0, v3, v4}, Lr0/H0;->E1(ILjava/lang/String;)V

    .line 1427
    .line 1428
    .line 1429
    :cond_59
    :goto_2a
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 1430
    .line 1431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1432
    .line 1433
    .line 1434
    if-eqz v8, :cond_6c

    .line 1435
    .line 1436
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1437
    .line 1438
    invoke-virtual {v8, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    const-string v3, "toLowerCase(...)"

    .line 1443
    .line 1444
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1445
    .line 1446
    .line 1447
    const-string v3, "message"

    .line 1448
    .line 1449
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v3

    .line 1453
    if-nez v3, :cond_5a

    .line 1454
    .line 1455
    const-string v3, "message_"

    .line 1456
    .line 1457
    const/4 v4, 0x0

    .line 1458
    invoke-static {v0, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v3

    .line 1462
    if-nez v3, :cond_5a

    .line 1463
    .line 1464
    const-string v3, "_message"

    .line 1465
    .line 1466
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    if-eqz v0, :cond_6c

    .line 1471
    .line 1472
    :cond_5a
    const-string v0, "talker"

    .line 1473
    .line 1474
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    if-nez v0, :cond_5b

    .line 1479
    .line 1480
    const-string v0, "field_talker"

    .line 1481
    .line 1482
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    if-nez v0, :cond_5b

    .line 1487
    .line 1488
    const-string v0, "username"

    .line 1489
    .line 1490
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    if-nez v0, :cond_5b

    .line 1495
    .line 1496
    goto/16 :goto_34

    .line 1497
    .line 1498
    :cond_5b
    move-object v3, v0

    .line 1499
    invoke-static {v3}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v0

    .line 1503
    if-nez v0, :cond_5c

    .line 1504
    .line 1505
    goto/16 :goto_34

    .line 1506
    .line 1507
    :cond_5c
    const-string v0, "isSend"

    .line 1508
    .line 1509
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v0

    .line 1513
    if-nez v0, :cond_5d

    .line 1514
    .line 1515
    const-string v0, "field_isSend"

    .line 1516
    .line 1517
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    :cond_5d
    if-nez v0, :cond_5e

    .line 1522
    .line 1523
    goto :goto_2b

    .line 1524
    :cond_5e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1525
    .line 1526
    .line 1527
    move-result v0

    .line 1528
    const/4 v4, 0x1

    .line 1529
    if-ne v0, v4, :cond_5f

    .line 1530
    .line 1531
    goto/16 :goto_34

    .line 1532
    .line 1533
    :cond_5f
    :goto_2b
    sget v0, Lz0/r;->e:I

    .line 1534
    .line 1535
    const/4 v4, -0x1

    .line 1536
    if-ne v0, v4, :cond_60

    .line 1537
    .line 1538
    :try_start_4
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v5

    .line 1550
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v5

    .line 1554
    const/4 v8, 0x0

    .line 1555
    invoke-virtual {v0, v5, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0

    .line 1559
    iget v5, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1560
    .line 1561
    goto :goto_2c

    .line 1562
    :catch_2
    move-exception v0

    .line 1563
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 1568
    .line 1569
    .line 1570
    move v5, v4

    .line 1571
    :goto_2c
    sput v5, Lz0/r;->e:I

    .line 1572
    .line 1573
    :cond_60
    sget v0, Lz0/r;->e:I

    .line 1574
    .line 1575
    const/16 v4, 0xc08

    .line 1576
    .line 1577
    if-eq v0, v4, :cond_61

    .line 1578
    .line 1579
    goto :goto_30

    .line 1580
    :cond_61
    const-string v0, "createTime"

    .line 1581
    .line 1582
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    if-eqz v0, :cond_62

    .line 1587
    .line 1588
    :goto_2d
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1589
    .line 1590
    .line 1591
    move-result-wide v4

    .line 1592
    goto :goto_2e

    .line 1593
    :cond_62
    const-string v0, "field_createTime"

    .line 1594
    .line 1595
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v0

    .line 1599
    if-eqz v0, :cond_63

    .line 1600
    .line 1601
    goto :goto_2d

    .line 1602
    :cond_63
    const-string v0, "msgCreateTime"

    .line 1603
    .line 1604
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    if-eqz v0, :cond_64

    .line 1609
    .line 1610
    goto :goto_2d

    .line 1611
    :cond_64
    const-string v0, "field_msgCreateTime"

    .line 1612
    .line 1613
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    if-eqz v0, :cond_65

    .line 1618
    .line 1619
    goto :goto_2d

    .line 1620
    :cond_65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1621
    .line 1622
    .line 1623
    move-result-wide v4

    .line 1624
    :goto_2e
    iget-object v8, v2, Lr0/H0;->G:Ljava/util/HashMap;

    .line 1625
    .line 1626
    monitor-enter v8

    .line 1627
    :try_start_5
    iget-object v0, v2, Lr0/H0;->G:Ljava/util/HashMap;

    .line 1628
    .line 1629
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    check-cast v0, Ljava/lang/Long;

    .line 1634
    .line 1635
    if-eqz v0, :cond_66

    .line 1636
    .line 1637
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v6

    .line 1641
    goto :goto_2f

    .line 1642
    :catchall_2
    move-exception v0

    .line 1643
    goto :goto_33

    .line 1644
    :cond_66
    :goto_2f
    cmp-long v0, v4, v6

    .line 1645
    .line 1646
    if-lez v0, :cond_67

    .line 1647
    .line 1648
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v0

    .line 1652
    iget-object v4, v2, Lr0/H0;->G:Ljava/util/HashMap;

    .line 1653
    .line 1654
    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1655
    .line 1656
    .line 1657
    :cond_67
    monitor-exit v8

    .line 1658
    :goto_30
    const-string v0, "msgId"

    .line 1659
    .line 1660
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    if-eqz v0, :cond_68

    .line 1665
    .line 1666
    :goto_31
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v4

    .line 1670
    goto :goto_32

    .line 1671
    :cond_68
    const-string v0, "msgSvrId"

    .line 1672
    .line 1673
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    if-eqz v0, :cond_69

    .line 1678
    .line 1679
    goto :goto_31

    .line 1680
    :cond_69
    const-string v0, "createTime"

    .line 1681
    .line 1682
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    if-eqz v0, :cond_6a

    .line 1687
    .line 1688
    goto :goto_31

    .line 1689
    :cond_6a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1690
    .line 1691
    .line 1692
    move-result-wide v4

    .line 1693
    :goto_32
    const-string v0, "content"

    .line 1694
    .line 1695
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v0

    .line 1699
    if-nez v0, :cond_6b

    .line 1700
    .line 1701
    const-string v0, "field_content"

    .line 1702
    .line 1703
    invoke-virtual {v11, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    if-nez v0, :cond_6b

    .line 1708
    .line 1709
    const-string v0, ""

    .line 1710
    .line 1711
    :cond_6b
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1712
    .line 1713
    .line 1714
    move-result v0

    .line 1715
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    const-string v7, "db:"

    .line 1718
    .line 1719
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1723
    .line 1724
    .line 1725
    const-string v7, ":"

    .line 1726
    .line 1727
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1728
    .line 1729
    .line 1730
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1731
    .line 1732
    .line 1733
    const-string v4, ":"

    .line 1734
    .line 1735
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v0

    .line 1745
    invoke-virtual {v2, v0, v3}, Lr0/H0;->F1(Ljava/lang/String;Ljava/lang/String;)V

    .line 1746
    .line 1747
    .line 1748
    goto :goto_34

    .line 1749
    :goto_33
    monitor-exit v8

    .line 1750
    throw v0

    .line 1751
    :cond_6c
    :goto_34
    return-void

    .line 1752
    :pswitch_b
    const-string v0, "param"

    .line 1753
    .line 1754
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1755
    .line 1756
    .line 1757
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1758
    .line 1759
    const-string v2, "o"

    .line 1760
    .line 1761
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1762
    .line 1763
    invoke-static {v3, v0, v2}, Lr0/H0;->b(Lr0/H0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1764
    .line 1765
    .line 1766
    return-void

    .line 1767
    :pswitch_c
    const-string v0, "param"

    .line 1768
    .line 1769
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 1773
    .line 1774
    iget-boolean v2, v0, Lr0/H0;->S:Z

    .line 1775
    .line 1776
    if-eqz v2, :cond_6d

    .line 1777
    .line 1778
    goto :goto_35

    .line 1779
    :cond_6d
    const/4 v2, 0x0

    .line 1780
    iput-object v2, v0, Lr0/H0;->P:Ljava/lang/String;

    .line 1781
    .line 1782
    iput-object v2, v0, Lr0/H0;->Q:Ljava/lang/String;

    .line 1783
    .line 1784
    iput-wide v6, v0, Lr0/H0;->R:J

    .line 1785
    .line 1786
    const/4 v4, 0x0

    .line 1787
    iput-boolean v4, v0, Lr0/H0;->S:Z

    .line 1788
    .line 1789
    iput-object v2, v0, Lr0/H0;->T:Ljava/lang/ref/WeakReference;

    .line 1790
    .line 1791
    iput-object v2, v0, Lr0/H0;->U:Ljava/lang/ref/WeakReference;

    .line 1792
    .line 1793
    iget-object v0, v0, Lr0/H0;->V:Ljava/util/ArrayList;

    .line 1794
    .line 1795
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1796
    .line 1797
    .line 1798
    :goto_35
    return-void

    .line 1799
    :pswitch_d
    const-string v0, "param"

    .line 1800
    .line 1801
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1802
    .line 1803
    .line 1804
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1805
    .line 1806
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    sget-boolean v0, Lz0/i;->a:Z

    .line 1810
    .line 1811
    invoke-static {}, Lz0/g;->F()Z

    .line 1812
    .line 1813
    .line 1814
    move-result v0

    .line 1815
    if-nez v0, :cond_6e

    .line 1816
    .line 1817
    goto/16 :goto_3c

    .line 1818
    .line 1819
    :cond_6e
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v0

    .line 1823
    instance-of v4, v0, Landroid/view/View;

    .line 1824
    .line 1825
    if-eqz v4, :cond_6f

    .line 1826
    .line 1827
    check-cast v0, Landroid/view/View;

    .line 1828
    .line 1829
    goto :goto_36

    .line 1830
    :cond_6f
    const/4 v0, 0x0

    .line 1831
    :goto_36
    if-nez v0, :cond_70

    .line 1832
    .line 1833
    goto/16 :goto_3c

    .line 1834
    .line 1835
    :cond_70
    invoke-static {v0}, Lr0/H0;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v8

    .line 1839
    if-nez v8, :cond_71

    .line 1840
    .line 1841
    goto/16 :goto_3c

    .line 1842
    .line 1843
    :cond_71
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1844
    .line 1845
    const-string v5, "f270194d"

    .line 1846
    .line 1847
    invoke-static {v4, v5}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v4

    .line 1851
    if-nez v4, :cond_75

    .line 1852
    .line 1853
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1854
    .line 1855
    const-string v5, "d"

    .line 1856
    .line 1857
    invoke-static {v4, v5}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v4

    .line 1861
    if-nez v4, :cond_75

    .line 1862
    .line 1863
    invoke-virtual {v3}, Lr0/H0;->S()[Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v4

    .line 1867
    array-length v5, v4

    .line 1868
    const/4 v10, 0x0

    .line 1869
    :goto_37
    if-ge v10, v5, :cond_73

    .line 1870
    .line 1871
    aget-object v6, v4, v10

    .line 1872
    .line 1873
    iget-object v7, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1874
    .line 1875
    invoke-static {v7, v6}, Lr0/H0;->L(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v6

    .line 1879
    if-nez v6, :cond_72

    .line 1880
    .line 1881
    const/16 v16, 0x1

    .line 1882
    .line 1883
    add-int/lit8 v10, v10, 0x1

    .line 1884
    .line 1885
    goto :goto_37

    .line 1886
    :cond_72
    move-object v2, v6

    .line 1887
    goto :goto_38

    .line 1888
    :cond_73
    const/4 v2, 0x0

    .line 1889
    :goto_38
    if-nez v2, :cond_74

    .line 1890
    .line 1891
    goto/16 :goto_3c

    .line 1892
    .line 1893
    :cond_74
    move-object v6, v2

    .line 1894
    goto :goto_39

    .line 1895
    :cond_75
    move-object v6, v4

    .line 1896
    :goto_39
    invoke-virtual {v3, v6}, Lr0/H0;->z(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v2

    .line 1900
    if-nez v2, :cond_76

    .line 1901
    .line 1902
    goto :goto_3c

    .line 1903
    :cond_76
    iget-object v4, v3, Lr0/H0;->I:Ljava/util/WeakHashMap;

    .line 1904
    .line 1905
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v2

    .line 1909
    check-cast v2, LE0/c;

    .line 1910
    .line 1911
    invoke-static {v6}, Lr0/H0;->W(Ljava/lang/Object;)Landroid/view/View;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v4

    .line 1915
    if-eqz v2, :cond_77

    .line 1916
    .line 1917
    iget-object v5, v2, LE0/c;->a:Ljava/lang/Object;

    .line 1918
    .line 1919
    check-cast v5, Ljava/lang/String;

    .line 1920
    .line 1921
    if-nez v5, :cond_79

    .line 1922
    .line 1923
    :cond_77
    if-eqz v4, :cond_78

    .line 1924
    .line 1925
    invoke-static {v4}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v5

    .line 1929
    goto :goto_3a

    .line 1930
    :cond_78
    const/4 v5, 0x0

    .line 1931
    :goto_3a
    if-nez v5, :cond_79

    .line 1932
    .line 1933
    goto :goto_3c

    .line 1934
    :cond_79
    if-eqz v2, :cond_7b

    .line 1935
    .line 1936
    iget-object v2, v2, LE0/c;->b:Ljava/lang/Object;

    .line 1937
    .line 1938
    check-cast v2, Ljava/lang/String;

    .line 1939
    .line 1940
    if-eqz v2, :cond_7b

    .line 1941
    .line 1942
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v2

    .line 1946
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v2

    .line 1950
    if-eqz v2, :cond_7b

    .line 1951
    .line 1952
    invoke-static {v2, v5}, Lr0/H0;->P0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1953
    .line 1954
    .line 1955
    move-result v7

    .line 1956
    if-eqz v7, :cond_7a

    .line 1957
    .line 1958
    goto :goto_3b

    .line 1959
    :cond_7a
    const/4 v2, 0x0

    .line 1960
    :goto_3b
    if-nez v2, :cond_7c

    .line 1961
    .line 1962
    :cond_7b
    const/4 v7, 0x0

    .line 1963
    invoke-virtual {v3, v4, v7, v5}, Lr0/H0;->q1(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v2

    .line 1967
    :cond_7c
    new-instance v4, Lr0/s0;

    .line 1968
    .line 1969
    const/4 v7, 0x1

    .line 1970
    move-object/from16 v18, v5

    .line 1971
    .line 1972
    move-object v5, v2

    .line 1973
    move-object v2, v4

    .line 1974
    move-object/from16 v4, v18

    .line 1975
    .line 1976
    invoke-direct/range {v2 .. v7}, Lr0/s0;-><init>(Lr0/H0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1980
    .line 1981
    .line 1982
    new-instance v2, Lr0/s0;

    .line 1983
    .line 1984
    const/4 v7, 0x2

    .line 1985
    invoke-direct/range {v2 .. v7}, Lr0/s0;-><init>(Lr0/H0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1989
    .line 1990
    .line 1991
    :goto_3c
    return-void

    .line 1992
    :pswitch_e
    const/4 v7, 0x0

    .line 1993
    const-string v0, "param"

    .line 1994
    .line 1995
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    iget-object v4, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1999
    .line 2000
    if-nez v4, :cond_7d

    .line 2001
    .line 2002
    goto/16 :goto_53

    .line 2003
    .line 2004
    :cond_7d
    iget-object v5, v1, Lr0/C0;->b:Lr0/H0;

    .line 2005
    .line 2006
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2007
    .line 2008
    .line 2009
    iget-object v6, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2010
    .line 2011
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2012
    .line 2013
    const-string v9, "args"

    .line 2014
    .line 2015
    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2016
    .line 2017
    .line 2018
    const/4 v10, 0x1

    .line 2019
    invoke-static {v10, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v0

    .line 2023
    instance-of v10, v0, Landroid/view/View;

    .line 2024
    .line 2025
    if-eqz v10, :cond_7e

    .line 2026
    .line 2027
    check-cast v0, Landroid/view/View;

    .line 2028
    .line 2029
    goto :goto_3d

    .line 2030
    :cond_7e
    move-object v0, v7

    .line 2031
    :goto_3d
    if-eqz v6, :cond_7f

    .line 2032
    .line 2033
    invoke-static {v6}, Lr0/H0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v10

    .line 2037
    goto :goto_3e

    .line 2038
    :cond_7f
    move-object v10, v7

    .line 2039
    :goto_3e
    invoke-static {v0}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v11

    .line 2043
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2044
    .line 2045
    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2046
    .line 2047
    .line 2048
    const/4 v12, 0x0

    .line 2049
    invoke-static {v12, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v0

    .line 2053
    instance-of v12, v0, Landroid/widget/AdapterView;

    .line 2054
    .line 2055
    if-eqz v12, :cond_80

    .line 2056
    .line 2057
    check-cast v0, Landroid/widget/AdapterView;

    .line 2058
    .line 2059
    move-object v12, v0

    .line 2060
    goto :goto_3f

    .line 2061
    :cond_80
    move-object v12, v7

    .line 2062
    :goto_3f
    if-nez v12, :cond_82

    .line 2063
    .line 2064
    :cond_81
    :goto_40
    move-object v2, v7

    .line 2065
    goto/16 :goto_48

    .line 2066
    .line 2067
    :cond_82
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2068
    .line 2069
    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2070
    .line 2071
    .line 2072
    invoke-static {v8, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v0

    .line 2076
    instance-of v2, v0, Ljava/lang/Integer;

    .line 2077
    .line 2078
    if-eqz v2, :cond_83

    .line 2079
    .line 2080
    move-object v2, v0

    .line 2081
    check-cast v2, Ljava/lang/Integer;

    .line 2082
    .line 2083
    goto :goto_41

    .line 2084
    :cond_83
    move-object v2, v7

    .line 2085
    :goto_41
    if-eqz v2, :cond_81

    .line 2086
    .line 2087
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2088
    .line 2089
    .line 2090
    move-result v2

    .line 2091
    :try_start_6
    invoke-virtual {v12, v2}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 2095
    goto :goto_42

    .line 2096
    :catchall_3
    move-exception v0

    .line 2097
    new-instance v8, LE0/d;

    .line 2098
    .line 2099
    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2100
    .line 2101
    .line 2102
    move-object v0, v8

    .line 2103
    :goto_42
    nop

    .line 2104
    instance-of v8, v0, LE0/d;

    .line 2105
    .line 2106
    if-eqz v8, :cond_84

    .line 2107
    .line 2108
    move-object v0, v7

    .line 2109
    :cond_84
    if-eqz v0, :cond_85

    .line 2110
    .line 2111
    move-object v2, v0

    .line 2112
    goto :goto_48

    .line 2113
    :cond_85
    instance-of v0, v12, Landroid/widget/ListView;

    .line 2114
    .line 2115
    if-eqz v0, :cond_86

    .line 2116
    .line 2117
    move-object v0, v12

    .line 2118
    check-cast v0, Landroid/widget/ListView;

    .line 2119
    .line 2120
    goto :goto_43

    .line 2121
    :cond_86
    move-object v0, v7

    .line 2122
    :goto_43
    if-eqz v0, :cond_87

    .line 2123
    .line 2124
    invoke-virtual {v0}, Landroid/widget/ListView;->getHeaderViewsCount()I

    .line 2125
    .line 2126
    .line 2127
    move-result v0

    .line 2128
    goto :goto_44

    .line 2129
    :cond_87
    const/4 v0, 0x0

    .line 2130
    :goto_44
    sub-int/2addr v2, v0

    .line 2131
    if-gez v2, :cond_88

    .line 2132
    .line 2133
    goto :goto_40

    .line 2134
    :cond_88
    :try_start_7
    invoke-virtual {v12}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v0

    .line 2138
    instance-of v8, v0, Landroid/widget/ListAdapter;

    .line 2139
    .line 2140
    if-eqz v8, :cond_89

    .line 2141
    .line 2142
    check-cast v0, Landroid/widget/ListAdapter;

    .line 2143
    .line 2144
    goto :goto_45

    .line 2145
    :catchall_4
    move-exception v0

    .line 2146
    goto :goto_46

    .line 2147
    :cond_89
    move-object v0, v7

    .line 2148
    :goto_45
    if-eqz v0, :cond_8a

    .line 2149
    .line 2150
    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 2154
    goto :goto_47

    .line 2155
    :cond_8a
    move-object v2, v7

    .line 2156
    goto :goto_47

    .line 2157
    :goto_46
    new-instance v2, LE0/d;

    .line 2158
    .line 2159
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2160
    .line 2161
    .line 2162
    :goto_47
    instance-of v0, v2, LE0/d;

    .line 2163
    .line 2164
    if-eqz v0, :cond_8b

    .line 2165
    .line 2166
    goto :goto_40

    .line 2167
    :cond_8b
    :goto_48
    if-eqz v2, :cond_8d

    .line 2168
    .line 2169
    invoke-static {v2}, Lr0/H0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    if-nez v0, :cond_8c

    .line 2174
    .line 2175
    invoke-static {v2}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v0

    .line 2179
    :cond_8c
    move-object v2, v0

    .line 2180
    goto :goto_49

    .line 2181
    :cond_8d
    move-object v2, v7

    .line 2182
    :goto_49
    iget-object v0, v5, Lr0/H0;->H:Ljava/util/WeakHashMap;

    .line 2183
    .line 2184
    if-eqz v6, :cond_8e

    .line 2185
    .line 2186
    invoke-virtual {v0, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v5

    .line 2190
    check-cast v5, Ljava/lang/String;

    .line 2191
    .line 2192
    goto :goto_4a

    .line 2193
    :cond_8e
    move-object v5, v7

    .line 2194
    :goto_4a
    filled-new-array {v10, v11, v2, v5}, [Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v2

    .line 2198
    const/4 v5, 0x0

    .line 2199
    :goto_4b
    if-ge v5, v3, :cond_96

    .line 2200
    .line 2201
    aget-object v6, v2, v5

    .line 2202
    .line 2203
    if-eqz v6, :cond_8f

    .line 2204
    .line 2205
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v6

    .line 2209
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v6

    .line 2213
    goto :goto_4c

    .line 2214
    :cond_8f
    move-object v6, v7

    .line 2215
    :goto_4c
    if-eqz v6, :cond_95

    .line 2216
    .line 2217
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2218
    .line 2219
    .line 2220
    move-result v8

    .line 2221
    if-eqz v8, :cond_90

    .line 2222
    .line 2223
    goto :goto_4f

    .line 2224
    :cond_90
    invoke-static {v6}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v8

    .line 2228
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v8

    .line 2232
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v9

    .line 2236
    if-nez v9, :cond_94

    .line 2237
    .line 2238
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 2239
    .line 2240
    .line 2241
    move-result v9

    .line 2242
    const/16 v10, 0x50

    .line 2243
    .line 2244
    if-gt v9, v10, :cond_94

    .line 2245
    .line 2246
    const/16 v9, 0xa

    .line 2247
    .line 2248
    invoke-static {v8, v9}, LU0/i;->j0(Ljava/lang/String;C)Z

    .line 2249
    .line 2250
    .line 2251
    move-result v9

    .line 2252
    if-eqz v9, :cond_91

    .line 2253
    .line 2254
    goto :goto_4d

    .line 2255
    :cond_91
    invoke-static {v8}, Lr0/H0;->H0(Ljava/lang/String;)Z

    .line 2256
    .line 2257
    .line 2258
    move-result v9

    .line 2259
    if-nez v9, :cond_94

    .line 2260
    .line 2261
    invoke-static {v8}, Lr0/H0;->O0(Ljava/lang/String;)Z

    .line 2262
    .line 2263
    .line 2264
    move-result v9

    .line 2265
    if-eqz v9, :cond_92

    .line 2266
    .line 2267
    goto :goto_4d

    .line 2268
    :cond_92
    invoke-static {v8}, Lr0/H0;->Q0(Ljava/lang/String;)Z

    .line 2269
    .line 2270
    .line 2271
    move-result v9

    .line 2272
    if-eqz v9, :cond_93

    .line 2273
    .line 2274
    const/4 v8, 0x1

    .line 2275
    goto :goto_4e

    .line 2276
    :cond_93
    const-string v9, "^[A-Za-z0-9_@.\\-]{3,80}$"

    .line 2277
    .line 2278
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v9

    .line 2282
    const-string v10, "compile(...)"

    .line 2283
    .line 2284
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2285
    .line 2286
    .line 2287
    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v8

    .line 2291
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 2292
    .line 2293
    .line 2294
    move-result v8

    .line 2295
    goto :goto_4e

    .line 2296
    :cond_94
    :goto_4d
    const/4 v8, 0x0

    .line 2297
    :goto_4e
    if-eqz v8, :cond_95

    .line 2298
    .line 2299
    move-object v9, v6

    .line 2300
    goto :goto_50

    .line 2301
    :cond_95
    :goto_4f
    const/16 v16, 0x1

    .line 2302
    .line 2303
    add-int/lit8 v5, v5, 0x1

    .line 2304
    .line 2305
    goto :goto_4b

    .line 2306
    :cond_96
    move-object v9, v7

    .line 2307
    :goto_50
    if-eqz v9, :cond_98

    .line 2308
    .line 2309
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2310
    .line 2311
    .line 2312
    move-result v2

    .line 2313
    if-eqz v2, :cond_97

    .line 2314
    .line 2315
    goto :goto_51

    .line 2316
    :cond_97
    const/4 v10, 0x0

    .line 2317
    goto :goto_52

    .line 2318
    :cond_98
    :goto_51
    const/4 v10, 0x1

    .line 2319
    :goto_52
    if-nez v10, :cond_99

    .line 2320
    .line 2321
    invoke-virtual {v0, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2322
    .line 2323
    .line 2324
    :cond_99
    :goto_53
    return-void

    .line 2325
    :pswitch_f
    const/4 v7, 0x0

    .line 2326
    const-string v0, "param"

    .line 2327
    .line 2328
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2329
    .line 2330
    .line 2331
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2332
    .line 2333
    instance-of v3, v0, Landroid/widget/ListView;

    .line 2334
    .line 2335
    if-eqz v3, :cond_9a

    .line 2336
    .line 2337
    check-cast v0, Landroid/widget/ListView;

    .line 2338
    .line 2339
    move-object v3, v0

    .line 2340
    goto :goto_54

    .line 2341
    :cond_9a
    move-object v3, v7

    .line 2342
    :goto_54
    if-nez v3, :cond_9b

    .line 2343
    .line 2344
    goto/16 :goto_60

    .line 2345
    .line 2346
    :cond_9b
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 2347
    .line 2348
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2349
    .line 2350
    const-string v5, "args"

    .line 2351
    .line 2352
    invoke-static {v2, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2353
    .line 2354
    .line 2355
    const/4 v8, 0x0

    .line 2356
    invoke-static {v8, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v2

    .line 2360
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2361
    .line 2362
    .line 2363
    invoke-static {v2}, Lr0/H0;->D1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v2

    .line 2367
    if-nez v2, :cond_9c

    .line 2368
    .line 2369
    goto/16 :goto_60

    .line 2370
    .line 2371
    :cond_9c
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 2372
    .line 2373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2374
    .line 2375
    .line 2376
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v5

    .line 2380
    invoke-static {v5}, Lr0/H0;->D0(Ljava/lang/Class;)Z

    .line 2381
    .line 2382
    .line 2383
    move-result v6

    .line 2384
    if-nez v6, :cond_a9

    .line 2385
    .line 2386
    invoke-virtual {v0, v5}, Lr0/H0;->J0(Ljava/lang/Class;)Z

    .line 2387
    .line 2388
    .line 2389
    move-result v6

    .line 2390
    if-nez v6, :cond_a9

    .line 2391
    .line 2392
    invoke-virtual {v0, v5}, Lr0/H0;->K0(Ljava/lang/Class;)Z

    .line 2393
    .line 2394
    .line 2395
    move-result v6

    .line 2396
    if-eqz v6, :cond_9d

    .line 2397
    .line 2398
    goto/16 :goto_5e

    .line 2399
    .line 2400
    :cond_9d
    invoke-static {}, Lz0/r;->p()I

    .line 2401
    .line 2402
    .line 2403
    move-result v6

    .line 2404
    if-lt v6, v4, :cond_a8

    .line 2405
    .line 2406
    iget-object v0, v0, Lr0/H0;->W:LA0/j;

    .line 2407
    .line 2408
    if-eqz v0, :cond_9e

    .line 2409
    .line 2410
    iget-object v9, v0, LA0/j;->a:Ljava/util/List;

    .line 2411
    .line 2412
    goto :goto_55

    .line 2413
    :cond_9e
    move-object v9, v7

    .line 2414
    :goto_55
    if-nez v9, :cond_9f

    .line 2415
    .line 2416
    sget-object v9, LF0/s;->a:LF0/s;

    .line 2417
    .line 2418
    :cond_9f
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v0

    .line 2422
    invoke-interface {v9, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2423
    .line 2424
    .line 2425
    move-result v0

    .line 2426
    if-nez v0, :cond_a7

    .line 2427
    .line 2428
    invoke-static {}, Lz0/r;->t()Z

    .line 2429
    .line 2430
    .line 2431
    move-result v0

    .line 2432
    if-eqz v0, :cond_a6

    .line 2433
    .line 2434
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v0

    .line 2438
    invoke-static {v0}, Lr0/H0;->l(Ljava/lang/Class;)Z

    .line 2439
    .line 2440
    .line 2441
    move-result v0

    .line 2442
    if-nez v0, :cond_a0

    .line 2443
    .line 2444
    const/4 v0, 0x0

    .line 2445
    goto :goto_5b

    .line 2446
    :cond_a0
    :try_start_8
    const-string v0, "getCount"

    .line 2447
    .line 2448
    const/4 v4, 0x0

    .line 2449
    new-array v5, v4, [Ljava/lang/Object;

    .line 2450
    .line 2451
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 2452
    .line 2453
    invoke-interface {v4, v2, v0, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v0

    .line 2457
    check-cast v0, Ljava/lang/Integer;

    .line 2458
    .line 2459
    if-eqz v0, :cond_a4

    .line 2460
    .line 2461
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2462
    .line 2463
    .line 2464
    move-result v0

    .line 2465
    const/16 v4, 0x8

    .line 2466
    .line 2467
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 2468
    .line 2469
    .line 2470
    move-result v0

    .line 2471
    const/4 v4, 0x0

    .line 2472
    :goto_56
    if-ge v4, v0, :cond_a4

    .line 2473
    .line 2474
    const-string v5, "getItem"

    .line 2475
    .line 2476
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v6

    .line 2480
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v6

    .line 2484
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 2485
    .line 2486
    invoke-interface {v7, v2, v5, v6}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v5

    .line 2490
    if-nez v5, :cond_a2

    .line 2491
    .line 2492
    :cond_a1
    const/4 v10, 0x1

    .line 2493
    goto :goto_57

    .line 2494
    :cond_a2
    invoke-static {v5}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 2498
    if-eqz v5, :cond_a1

    .line 2499
    .line 2500
    :try_start_9
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2501
    .line 2502
    .line 2503
    move-result v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 2504
    const/4 v10, 0x1

    .line 2505
    xor-int/2addr v5, v10

    .line 2506
    if-ne v5, v10, :cond_a3

    .line 2507
    .line 2508
    move v4, v10

    .line 2509
    goto :goto_58

    .line 2510
    :catchall_5
    move-exception v0

    .line 2511
    const/4 v10, 0x1

    .line 2512
    goto :goto_59

    .line 2513
    :cond_a3
    :goto_57
    add-int/2addr v4, v10

    .line 2514
    goto :goto_56

    .line 2515
    :catchall_6
    move-exception v0

    .line 2516
    goto :goto_59

    .line 2517
    :cond_a4
    const/4 v4, 0x0

    .line 2518
    :goto_58
    :try_start_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 2522
    goto :goto_5a

    .line 2523
    :goto_59
    new-instance v4, LE0/d;

    .line 2524
    .line 2525
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 2526
    .line 2527
    .line 2528
    move-object v0, v4

    .line 2529
    :goto_5a
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2530
    .line 2531
    instance-of v5, v0, LE0/d;

    .line 2532
    .line 2533
    if-eqz v5, :cond_a5

    .line 2534
    .line 2535
    move-object v0, v4

    .line 2536
    :cond_a5
    check-cast v0, Ljava/lang/Boolean;

    .line 2537
    .line 2538
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2539
    .line 2540
    .line 2541
    move-result v0

    .line 2542
    :goto_5b
    if-eqz v0, :cond_a6

    .line 2543
    .line 2544
    goto :goto_5c

    .line 2545
    :cond_a6
    const/4 v10, 0x0

    .line 2546
    goto :goto_5d

    .line 2547
    :cond_a7
    :goto_5c
    const/4 v10, 0x1

    .line 2548
    :goto_5d
    move v11, v10

    .line 2549
    goto :goto_5f

    .line 2550
    :cond_a8
    invoke-static {}, Lr0/H0;->M0()Z

    .line 2551
    .line 2552
    .line 2553
    move-result v11

    .line 2554
    goto :goto_5f

    .line 2555
    :cond_a9
    :goto_5e
    const/4 v11, 0x1

    .line 2556
    :goto_5f
    if-nez v11, :cond_aa

    .line 2557
    .line 2558
    goto :goto_60

    .line 2559
    :cond_aa
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 2560
    .line 2561
    invoke-virtual {v0, v3, v2}, Lr0/H0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2562
    .line 2563
    .line 2564
    move-result v0

    .line 2565
    if-eqz v0, :cond_ab

    .line 2566
    .line 2567
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 2568
    .line 2569
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v2

    .line 2573
    invoke-virtual {v0, v2}, Lr0/H0;->p0(Ljava/lang/Class;)V

    .line 2574
    .line 2575
    .line 2576
    :cond_ab
    :goto_60
    return-void

    .line 2577
    :pswitch_10
    const/4 v7, 0x0

    .line 2578
    const-string v0, "param"

    .line 2579
    .line 2580
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2581
    .line 2582
    .line 2583
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2584
    .line 2585
    const/16 v17, 0x0

    .line 2586
    .line 2587
    aget-object v3, v0, v17

    .line 2588
    .line 2589
    instance-of v4, v3, Landroid/view/ContextMenu;

    .line 2590
    .line 2591
    if-eqz v4, :cond_ac

    .line 2592
    .line 2593
    check-cast v3, Landroid/view/ContextMenu;

    .line 2594
    .line 2595
    goto :goto_61

    .line 2596
    :cond_ac
    move-object v3, v7

    .line 2597
    :goto_61
    if-nez v3, :cond_ad

    .line 2598
    .line 2599
    goto :goto_63

    .line 2600
    :cond_ad
    const/16 v16, 0x1

    .line 2601
    .line 2602
    aget-object v0, v0, v16

    .line 2603
    .line 2604
    instance-of v4, v0, Landroid/view/View;

    .line 2605
    .line 2606
    if-eqz v4, :cond_ae

    .line 2607
    .line 2608
    move-object v9, v0

    .line 2609
    check-cast v9, Landroid/view/View;

    .line 2610
    .line 2611
    goto :goto_62

    .line 2612
    :cond_ae
    move-object v9, v7

    .line 2613
    :goto_62
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2614
    .line 2615
    if-nez v0, :cond_af

    .line 2616
    .line 2617
    goto :goto_63

    .line 2618
    :cond_af
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 2619
    .line 2620
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2621
    .line 2622
    .line 2623
    sget-boolean v4, Lz0/i;->a:Z

    .line 2624
    .line 2625
    invoke-static {}, Lz0/g;->F()Z

    .line 2626
    .line 2627
    .line 2628
    move-result v4

    .line 2629
    if-nez v4, :cond_b0

    .line 2630
    .line 2631
    goto :goto_63

    .line 2632
    :cond_b0
    invoke-static {v0}, Lr0/H0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v4

    .line 2636
    if-nez v4, :cond_b1

    .line 2637
    .line 2638
    invoke-static {v9}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 2639
    .line 2640
    .line 2641
    move-result-object v4

    .line 2642
    if-nez v4, :cond_b1

    .line 2643
    .line 2644
    iget-object v4, v2, Lr0/H0;->H:Ljava/util/WeakHashMap;

    .line 2645
    .line 2646
    invoke-virtual {v4, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v4

    .line 2650
    check-cast v4, Ljava/lang/String;

    .line 2651
    .line 2652
    if-nez v4, :cond_b1

    .line 2653
    .line 2654
    goto :goto_63

    .line 2655
    :cond_b1
    invoke-virtual {v2, v9, v0, v4}, Lr0/H0;->q1(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v0

    .line 2659
    invoke-virtual {v2, v3, v4, v0}, Lr0/H0;->o(Landroid/view/ContextMenu;Ljava/lang/String;Ljava/lang/String;)V

    .line 2660
    .line 2661
    .line 2662
    :goto_63
    return-void

    .line 2663
    :pswitch_11
    const-string v0, "param"

    .line 2664
    .line 2665
    invoke-static {v2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2666
    .line 2667
    .line 2668
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2669
    .line 2670
    const/16 v17, 0x0

    .line 2671
    .line 2672
    aget-object v0, v0, v17

    .line 2673
    .line 2674
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 2675
    .line 2676
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2677
    .line 2678
    .line 2679
    invoke-static {v0}, Lr0/H0;->D1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2680
    .line 2681
    .line 2682
    move-result-object v0

    .line 2683
    if-nez v0, :cond_b2

    .line 2684
    .line 2685
    goto :goto_64

    .line 2686
    :cond_b2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2687
    .line 2688
    .line 2689
    move-result-object v4

    .line 2690
    invoke-static {v4}, Lr0/H0;->D0(Ljava/lang/Class;)Z

    .line 2691
    .line 2692
    .line 2693
    move-result v4

    .line 2694
    if-nez v4, :cond_b3

    .line 2695
    .line 2696
    invoke-static {}, Lr0/H0;->M0()Z

    .line 2697
    .line 2698
    .line 2699
    move-result v4

    .line 2700
    if-eqz v4, :cond_b4

    .line 2701
    .line 2702
    :cond_b3
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2703
    .line 2704
    invoke-virtual {v3, v2, v0}, Lr0/H0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2705
    .line 2706
    .line 2707
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v0

    .line 2711
    invoke-virtual {v3, v0}, Lr0/H0;->p0(Ljava/lang/Class;)V

    .line 2712
    .line 2713
    .line 2714
    :cond_b4
    :goto_64
    return-void

    .line 2715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    const/4 v2, 0x1

    .line 7
    const-string v3, "args"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v7, "param"

    .line 11
    .line 12
    iget v8, v1, Lr0/C0;->a:I

    .line 13
    .line 14
    packed-switch v8, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    return-void

    .line 18
    :pswitch_1
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 22
    .line 23
    iget-object v2, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v2, v0, Lr0/H0;->y:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lz0/z;->a:Lz0/z;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 39
    .line 40
    instance-of v2, v0, Landroid/view/View;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    check-cast v0, Landroid/view/View;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    :goto_0
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "last_msg_tv"

    .line 57
    .line 58
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_2
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 67
    .line 68
    iget-object v2, v2, Lr0/H0;->W:LA0/j;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    iget-object v2, v2, LA0/j;->d:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v2}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const/4 v2, 0x0

    .line 82
    :goto_1
    const-string v3, "va5.n"

    .line 83
    .line 84
    const-string v7, "kc5.n"

    .line 85
    .line 86
    const-string v8, "sd5.n"

    .line 87
    .line 88
    const-string v9, "yf5.n"

    .line 89
    .line 90
    invoke-static {v3, v7, v8, v9, v3}, Lz0/r;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v3}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const-string v7, "conversation"

    .line 101
    .line 102
    const-string v8, "holder"

    .line 103
    .line 104
    invoke-static {v7, v8, v3}, Lz0/r;->E(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-static {v2}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2, v3}, LF0/k;->o0(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    :cond_5
    :goto_2
    if-eqz v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_6

    .line 154
    .line 155
    invoke-static {v2}, Lr0/H0;->g0(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    if-eqz v7, :cond_7

    .line 160
    .line 161
    :cond_6
    move-object v5, v2

    .line 162
    goto :goto_3

    .line 163
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    instance-of v2, v0, Landroid/view/View;

    .line 168
    .line 169
    if-eqz v2, :cond_8

    .line 170
    .line 171
    check-cast v0, Landroid/view/View;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_8
    const/4 v0, 0x0

    .line 175
    goto :goto_2

    .line 176
    :cond_9
    const/4 v5, 0x0

    .line 177
    :goto_3
    if-nez v5, :cond_a

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_a
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {v5}, Lr0/H0;->g0(Ljava/lang/Object;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sget-boolean v0, Lz0/i;->a:Z

    .line 206
    .line 207
    invoke-static {}, Lz0/g;->w()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_b

    .line 212
    .line 213
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 214
    .line 215
    const-string v2, ""

    .line 216
    .line 217
    aput-object v2, v0, v4

    .line 218
    .line 219
    :cond_b
    :goto_4
    return-void

    .line 220
    :pswitch_3
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 224
    .line 225
    instance-of v2, v0, Landroid/widget/PopupWindow;

    .line 226
    .line 227
    if-eqz v2, :cond_c

    .line 228
    .line 229
    move-object v5, v0

    .line 230
    check-cast v5, Landroid/widget/PopupWindow;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    const/4 v5, 0x0

    .line 234
    :goto_5
    if-nez v5, :cond_d

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_d
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    instance-of v0, v0, Landroid/view/View;

    .line 247
    .line 248
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 249
    .line 250
    const-string v2, "showAsDropDownGravity"

    .line 251
    .line 252
    invoke-static {v0, v2, v5}, Lr0/H0;->g(Lr0/H0;Ljava/lang/String;Landroid/widget/PopupWindow;)V

    .line 253
    .line 254
    .line 255
    :goto_6
    return-void

    .line 256
    :pswitch_4
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 260
    .line 261
    instance-of v2, v0, Landroid/widget/PopupWindow;

    .line 262
    .line 263
    if-eqz v2, :cond_e

    .line 264
    .line 265
    move-object v5, v0

    .line 266
    check-cast v5, Landroid/widget/PopupWindow;

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_e
    const/4 v5, 0x0

    .line 270
    :goto_7
    if-nez v5, :cond_f

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_f
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 274
    .line 275
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    instance-of v0, v0, Landroid/view/View;

    .line 283
    .line 284
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 285
    .line 286
    const-string v2, "showAsDropDown"

    .line 287
    .line 288
    invoke-static {v0, v2, v5}, Lr0/H0;->g(Lr0/H0;Ljava/lang/String;Landroid/widget/PopupWindow;)V

    .line 289
    .line 290
    .line 291
    :goto_8
    return-void

    .line 292
    :pswitch_5
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 296
    .line 297
    instance-of v2, v0, Landroid/widget/PopupWindow;

    .line 298
    .line 299
    if-eqz v2, :cond_10

    .line 300
    .line 301
    move-object v5, v0

    .line 302
    check-cast v5, Landroid/widget/PopupWindow;

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_10
    const/4 v5, 0x0

    .line 306
    :goto_9
    if-nez v5, :cond_11

    .line 307
    .line 308
    goto :goto_a

    .line 309
    :cond_11
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 310
    .line 311
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    instance-of v0, v0, Landroid/view/View;

    .line 319
    .line 320
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 321
    .line 322
    const-string v2, "showAtLocation"

    .line 323
    .line 324
    invoke-static {v0, v2, v5}, Lr0/H0;->g(Lr0/H0;Ljava/lang/String;Landroid/widget/PopupWindow;)V

    .line 325
    .line 326
    .line 327
    :goto_a
    return-void

    .line 328
    :pswitch_6
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {}, Lr0/H0;->T0()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_3a

    .line 341
    .line 342
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 343
    .line 344
    iget-object v0, v0, Lr0/H0;->e0:Ljava/lang/ThreadLocal;

    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-static {v0, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_12

    .line 357
    .line 358
    goto/16 :goto_21

    .line 359
    .line 360
    :cond_12
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 361
    .line 362
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    instance-of v3, v0, Ljava/util/List;

    .line 370
    .line 371
    if-eqz v3, :cond_13

    .line 372
    .line 373
    check-cast v0, Ljava/util/List;

    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_13
    const/4 v0, 0x0

    .line 377
    :goto_b
    if-nez v0, :cond_14

    .line 378
    .line 379
    goto/16 :goto_21

    .line 380
    .line 381
    :cond_14
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 382
    .line 383
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-nez v7, :cond_38

    .line 391
    .line 392
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-eqz v7, :cond_15

    .line 397
    .line 398
    goto/16 :goto_1f

    .line 399
    .line 400
    :cond_15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    :cond_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    if-eqz v8, :cond_38

    .line 409
    .line 410
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    invoke-static {v8}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    if-eqz v8, :cond_16

    .line 419
    .line 420
    sget-boolean v7, Lz0/i;->a:Z

    .line 421
    .line 422
    invoke-static {}, Lz0/g;->x()Z

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    if-eqz v7, :cond_34

    .line 427
    .line 428
    new-instance v7, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    if-eqz v9, :cond_35

    .line 442
    .line 443
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    invoke-static {v9}, Lr0/H0;->O(Ljava/lang/Object;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    if-nez v10, :cond_17

    .line 452
    .line 453
    goto/16 :goto_1c

    .line 454
    .line 455
    :cond_17
    invoke-static {v10}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    if-eqz v10, :cond_33

    .line 464
    .line 465
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 466
    .line 467
    .line 468
    move-result v11

    .line 469
    if-nez v11, :cond_18

    .line 470
    .line 471
    goto :goto_d

    .line 472
    :cond_18
    const/4 v10, 0x0

    .line 473
    :goto_d
    if-nez v10, :cond_19

    .line 474
    .line 475
    goto/16 :goto_1c

    .line 476
    .line 477
    :cond_19
    sget-boolean v11, Lz0/i;->a:Z

    .line 478
    .line 479
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    new-instance v12, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    :cond_1a
    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v13

    .line 496
    if-eqz v13, :cond_1c

    .line 497
    .line 498
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v13

    .line 502
    check-cast v13, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 503
    .line 504
    invoke-virtual {v13}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v13

    .line 508
    if-eqz v13, :cond_1b

    .line 509
    .line 510
    invoke-static {v13}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v13

    .line 518
    if-eqz v13, :cond_1b

    .line 519
    .line 520
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 521
    .line 522
    .line 523
    move-result v14

    .line 524
    if-nez v14, :cond_1b

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_1b
    const/4 v13, 0x0

    .line 528
    :goto_f
    if-eqz v13, :cond_1a

    .line 529
    .line 530
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    goto :goto_e

    .line 534
    :cond_1c
    const/4 v15, 0x0

    .line 535
    const/16 v16, 0x0

    .line 536
    .line 537
    const-string v13, "|"

    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const/16 v17, 0x3e

    .line 541
    .line 542
    invoke-static/range {v12 .. v17}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v11

    .line 546
    iget-object v13, v3, Lr0/H0;->y:Ljava/lang/Object;

    .line 547
    .line 548
    if-eqz v13, :cond_1d

    .line 549
    .line 550
    move v13, v2

    .line 551
    goto :goto_10

    .line 552
    :cond_1d
    move v13, v4

    .line 553
    :goto_10
    iget-object v14, v3, Lr0/H0;->d0:Ljava/lang/Object;

    .line 554
    .line 555
    iget-object v15, v3, Lr0/H0;->c0:Ljava/lang/String;

    .line 556
    .line 557
    invoke-static {v15, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v15

    .line 561
    if-eqz v15, :cond_1e

    .line 562
    .line 563
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 564
    .line 565
    .line 566
    move-result v15

    .line 567
    if-nez v15, :cond_1e

    .line 568
    .line 569
    if-eqz v13, :cond_1f

    .line 570
    .line 571
    invoke-interface {v14}, Ljava/util/Set;->size()I

    .line 572
    .line 573
    .line 574
    move-result v13

    .line 575
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 576
    .line 577
    .line 578
    move-result v15

    .line 579
    if-le v13, v15, :cond_1e

    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_1e
    const/4 v14, 0x0

    .line 583
    :cond_1f
    :goto_11
    if-eqz v14, :cond_20

    .line 584
    .line 585
    goto/16 :goto_15

    .line 586
    .line 587
    :cond_20
    sget-object v13, Lz0/z;->a:Lz0/z;

    .line 588
    .line 589
    iget-object v14, v3, Lr0/H0;->y:Ljava/lang/Object;

    .line 590
    .line 591
    invoke-virtual {v13, v14}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    new-instance v14, Ljava/util/LinkedHashSet;

    .line 595
    .line 596
    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    :cond_21
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result v13

    .line 607
    if-eqz v13, :cond_25

    .line 608
    .line 609
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v13

    .line 613
    check-cast v13, Ljava/lang/String;

    .line 614
    .line 615
    invoke-interface {v14, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    sget-object v15, Lz0/z;->a:Lz0/z;

    .line 619
    .line 620
    invoke-static {v13}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 621
    .line 622
    .line 623
    move-result-object v13

    .line 624
    if-eqz v13, :cond_21

    .line 625
    .line 626
    iget-object v15, v13, Lz0/y;->a:Ljava/lang/String;

    .line 627
    .line 628
    iget-object v5, v13, Lz0/y;->b:Ljava/lang/String;

    .line 629
    .line 630
    iget-object v13, v13, Lz0/y;->c:Ljava/lang/String;

    .line 631
    .line 632
    filled-new-array {v15, v5, v13}, [Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    invoke-static {v5}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    new-instance v13, Ljava/util/ArrayList;

    .line 641
    .line 642
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 643
    .line 644
    .line 645
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    :cond_22
    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v15

    .line 653
    if-eqz v15, :cond_24

    .line 654
    .line 655
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v15

    .line 659
    check-cast v15, Ljava/lang/String;

    .line 660
    .line 661
    if-eqz v15, :cond_23

    .line 662
    .line 663
    invoke-static {v15}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v15

    .line 671
    if-eqz v15, :cond_23

    .line 672
    .line 673
    invoke-static {v15}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 674
    .line 675
    .line 676
    move-result v17

    .line 677
    if-nez v17, :cond_23

    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_23
    const/4 v15, 0x0

    .line 681
    :goto_13
    if-eqz v15, :cond_22

    .line 682
    .line 683
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_24
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v13

    .line 695
    if-eqz v13, :cond_21

    .line 696
    .line 697
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v13

    .line 701
    check-cast v13, Ljava/lang/String;

    .line 702
    .line 703
    invoke-interface {v14, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    goto :goto_14

    .line 707
    :cond_25
    iput-object v11, v3, Lr0/H0;->c0:Ljava/lang/String;

    .line 708
    .line 709
    iput-object v14, v3, Lr0/H0;->d0:Ljava/lang/Object;

    .line 710
    .line 711
    :goto_15
    invoke-interface {v14, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    if-nez v5, :cond_26

    .line 716
    .line 717
    goto/16 :goto_1c

    .line 718
    .line 719
    :cond_26
    invoke-static {v10}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v5

    .line 727
    if-eqz v5, :cond_2a

    .line 728
    .line 729
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 730
    .line 731
    .line 732
    move-result v11

    .line 733
    if-nez v11, :cond_27

    .line 734
    .line 735
    goto :goto_16

    .line 736
    :cond_27
    const/4 v5, 0x0

    .line 737
    :goto_16
    if-nez v5, :cond_28

    .line 738
    .line 739
    goto :goto_17

    .line 740
    :cond_28
    invoke-static {v5}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 741
    .line 742
    .line 743
    move-result v11

    .line 744
    if-eqz v11, :cond_29

    .line 745
    .line 746
    goto/16 :goto_1b

    .line 747
    .line 748
    :cond_29
    const-string v11, "@chatroom"

    .line 749
    .line 750
    invoke-virtual {v5, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 751
    .line 752
    .line 753
    move-result v11

    .line 754
    if-eqz v11, :cond_2b

    .line 755
    .line 756
    :cond_2a
    :goto_17
    const/4 v5, 0x0

    .line 757
    goto :goto_1b

    .line 758
    :cond_2b
    sget-object v11, Lz0/z;->a:Lz0/z;

    .line 759
    .line 760
    iget-object v12, v3, Lr0/H0;->y:Ljava/lang/Object;

    .line 761
    .line 762
    invoke-virtual {v11, v12}, Lz0/z;->h(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    invoke-static {v5}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    if-nez v5, :cond_2c

    .line 770
    .line 771
    goto :goto_17

    .line 772
    :cond_2c
    iget-object v11, v5, Lz0/y;->a:Ljava/lang/String;

    .line 773
    .line 774
    iget-object v12, v5, Lz0/y;->b:Ljava/lang/String;

    .line 775
    .line 776
    iget-object v5, v5, Lz0/y;->c:Ljava/lang/String;

    .line 777
    .line 778
    filled-new-array {v11, v12, v5}, [Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    invoke-static {v5}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    new-instance v11, Ljava/util/ArrayList;

    .line 787
    .line 788
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    :cond_2d
    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 796
    .line 797
    .line 798
    move-result v12

    .line 799
    if-eqz v12, :cond_2f

    .line 800
    .line 801
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v12

    .line 805
    check-cast v12, Ljava/lang/String;

    .line 806
    .line 807
    if-eqz v12, :cond_2e

    .line 808
    .line 809
    invoke-static {v12}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 810
    .line 811
    .line 812
    move-result-object v12

    .line 813
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v12

    .line 817
    if-eqz v12, :cond_2e

    .line 818
    .line 819
    invoke-static {v12}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 820
    .line 821
    .line 822
    move-result v13

    .line 823
    if-nez v13, :cond_2e

    .line 824
    .line 825
    goto :goto_19

    .line 826
    :cond_2e
    const/4 v12, 0x0

    .line 827
    :goto_19
    if-eqz v12, :cond_2d

    .line 828
    .line 829
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    goto :goto_18

    .line 833
    :cond_2f
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    :cond_30
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 838
    .line 839
    .line 840
    move-result v11

    .line 841
    if-eqz v11, :cond_31

    .line 842
    .line 843
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    move-object v12, v11

    .line 848
    check-cast v12, Ljava/lang/String;

    .line 849
    .line 850
    invoke-static {v12}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 851
    .line 852
    .line 853
    move-result v12

    .line 854
    if-eqz v12, :cond_30

    .line 855
    .line 856
    goto :goto_1a

    .line 857
    :cond_31
    const/4 v11, 0x0

    .line 858
    :goto_1a
    move-object v5, v11

    .line 859
    check-cast v5, Ljava/lang/String;

    .line 860
    .line 861
    :goto_1b
    if-nez v5, :cond_32

    .line 862
    .line 863
    move-object v5, v10

    .line 864
    :cond_32
    sget-boolean v11, Lz0/i;->a:Z

    .line 865
    .line 866
    invoke-static {v10}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 867
    .line 868
    .line 869
    move-result v10

    .line 870
    if-nez v10, :cond_33

    .line 871
    .line 872
    invoke-static {v5}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 873
    .line 874
    .line 875
    move-result v5

    .line 876
    if-nez v5, :cond_33

    .line 877
    .line 878
    goto/16 :goto_c

    .line 879
    .line 880
    :cond_33
    :goto_1c
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    goto/16 :goto_c

    .line 884
    .line 885
    :cond_34
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    :cond_35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 890
    .line 891
    .line 892
    move-result v3

    .line 893
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 894
    .line 895
    .line 896
    move-result v5

    .line 897
    if-eq v3, v5, :cond_36

    .line 898
    .line 899
    goto :goto_1e

    .line 900
    :cond_36
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    move v5, v4

    .line 905
    :goto_1d
    if-ge v5, v3, :cond_38

    .line 906
    .line 907
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    if-eq v8, v9, :cond_37

    .line 916
    .line 917
    :goto_1e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 918
    .line 919
    .line 920
    move-result v2

    .line 921
    const-string v3, "raw="

    .line 922
    .line 923
    invoke-static {v2, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    const-string v3, "source="

    .line 932
    .line 933
    invoke-static {v0, v3}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 938
    .line 939
    .line 940
    move-result v3

    .line 941
    const-string v5, "next="

    .line 942
    .line 943
    invoke-static {v3, v5}, LL/d;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    sget-boolean v5, Lz0/i;->a:Z

    .line 948
    .line 949
    invoke-static {}, Lz0/g;->x()Z

    .line 950
    .line 951
    .line 952
    move-result v5

    .line 953
    const-string v8, "hide="

    .line 954
    .line 955
    invoke-static {v8, v5}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v5

    .line 959
    const-string v8, "play8072 index input filter"

    .line 960
    .line 961
    filled-new-array {v8, v2, v0, v3, v5}, [Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    new-instance v5, Ljava/util/ArrayList;

    .line 969
    .line 970
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 971
    .line 972
    .line 973
    goto :goto_20

    .line 974
    :cond_37
    add-int/2addr v5, v2

    .line 975
    goto :goto_1d

    .line 976
    :cond_38
    :goto_1f
    const/4 v5, 0x0

    .line 977
    :goto_20
    if-nez v5, :cond_39

    .line 978
    .line 979
    goto :goto_21

    .line 980
    :cond_39
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 981
    .line 982
    aput-object v5, v0, v4

    .line 983
    .line 984
    :cond_3a
    :goto_21
    return-void

    .line 985
    :pswitch_7
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    sget-boolean v0, Lz0/i;->a:Z

    .line 989
    .line 990
    invoke-static {}, Lz0/g;->x()Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-nez v0, :cond_3b

    .line 995
    .line 996
    goto/16 :goto_2c

    .line 997
    .line 998
    :cond_3b
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 999
    .line 1000
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    instance-of v3, v0, Ljava/lang/Number;

    .line 1008
    .line 1009
    if-eqz v3, :cond_3c

    .line 1010
    .line 1011
    check-cast v0, Ljava/lang/Number;

    .line 1012
    .line 1013
    goto :goto_22

    .line 1014
    :cond_3c
    const/4 v0, 0x0

    .line 1015
    :goto_22
    if-eqz v0, :cond_50

    .line 1016
    .line 1017
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1018
    .line 1019
    .line 1020
    move-result v0

    .line 1021
    if-gtz v0, :cond_3d

    .line 1022
    .line 1023
    goto/16 :goto_2c

    .line 1024
    .line 1025
    :cond_3d
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1026
    .line 1027
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 1031
    .line 1032
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1033
    .line 1034
    .line 1035
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v5

    .line 1039
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v5

    .line 1043
    :cond_3e
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v8

    .line 1047
    if-eqz v8, :cond_43

    .line 1048
    .line 1049
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v8

    .line 1053
    check-cast v8, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 1054
    .line 1055
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v8

    .line 1059
    invoke-static {v8}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v8

    .line 1063
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v8

    .line 1067
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v9

    .line 1071
    if-nez v9, :cond_3e

    .line 1072
    .line 1073
    sget-boolean v9, Lz0/i;->a:Z

    .line 1074
    .line 1075
    invoke-static {v8}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v9

    .line 1079
    if-eqz v9, :cond_3f

    .line 1080
    .line 1081
    goto :goto_23

    .line 1082
    :cond_3f
    invoke-virtual {v7, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    sget-object v9, Lz0/z;->a:Lz0/z;

    .line 1086
    .line 1087
    invoke-static {v8}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v8

    .line 1091
    if-eqz v8, :cond_3e

    .line 1092
    .line 1093
    iget-object v9, v8, Lz0/y;->a:Ljava/lang/String;

    .line 1094
    .line 1095
    iget-object v10, v8, Lz0/y;->b:Ljava/lang/String;

    .line 1096
    .line 1097
    iget-object v8, v8, Lz0/y;->c:Ljava/lang/String;

    .line 1098
    .line 1099
    filled-new-array {v9, v10, v8}, [Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v8

    .line 1103
    invoke-static {v8}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v8

    .line 1107
    new-instance v9, Ljava/util/ArrayList;

    .line 1108
    .line 1109
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1110
    .line 1111
    .line 1112
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v8

    .line 1116
    :cond_40
    :goto_24
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v10

    .line 1120
    if-eqz v10, :cond_42

    .line 1121
    .line 1122
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v10

    .line 1126
    check-cast v10, Ljava/lang/String;

    .line 1127
    .line 1128
    if-eqz v10, :cond_41

    .line 1129
    .line 1130
    invoke-static {v10}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v10

    .line 1134
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v10

    .line 1138
    if-eqz v10, :cond_41

    .line 1139
    .line 1140
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v11

    .line 1144
    if-nez v11, :cond_41

    .line 1145
    .line 1146
    goto :goto_25

    .line 1147
    :cond_41
    const/4 v10, 0x0

    .line 1148
    :goto_25
    if-eqz v10, :cond_40

    .line 1149
    .line 1150
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    goto :goto_24

    .line 1154
    :cond_42
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v8

    .line 1158
    :goto_26
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1159
    .line 1160
    .line 1161
    move-result v9

    .line 1162
    if-eqz v9, :cond_3e

    .line 1163
    .line 1164
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v9

    .line 1168
    check-cast v9, Ljava/lang/String;

    .line 1169
    .line 1170
    invoke-virtual {v7, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    goto :goto_26

    .line 1174
    :cond_43
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1175
    .line 1176
    .line 1177
    move-result v5

    .line 1178
    if-eqz v5, :cond_44

    .line 1179
    .line 1180
    iput-boolean v2, v3, Lr0/H0;->F:Z

    .line 1181
    .line 1182
    move v2, v4

    .line 1183
    goto/16 :goto_2b

    .line 1184
    .line 1185
    :cond_44
    invoke-static {v7}, LF0/k;->q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v8

    .line 1189
    const/4 v11, 0x0

    .line 1190
    const/4 v12, 0x0

    .line 1191
    const-string v9, ","

    .line 1192
    .line 1193
    const/4 v10, 0x0

    .line 1194
    const/16 v13, 0x3e

    .line 1195
    .line 1196
    invoke-static/range {v8 .. v13}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v5

    .line 1200
    sget-object v8, Lz0/z;->a:Lz0/z;

    .line 1201
    .line 1202
    sget-wide v8, Lz0/z;->d:J

    .line 1203
    .line 1204
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1205
    .line 1206
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    .line 1212
    const-string v8, "|"

    .line 1213
    .line 1214
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v13

    .line 1224
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1225
    .line 1226
    .line 1227
    move-result-wide v14

    .line 1228
    iget-object v8, v3, Lr0/H0;->C:Ljava/lang/String;

    .line 1229
    .line 1230
    invoke-static {v13, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v8

    .line 1234
    if-eqz v8, :cond_45

    .line 1235
    .line 1236
    iget-wide v8, v3, Lr0/H0;->D:J

    .line 1237
    .line 1238
    sub-long v8, v14, v8

    .line 1239
    .line 1240
    const-wide/16 v10, 0xc8

    .line 1241
    .line 1242
    cmp-long v8, v8, v10

    .line 1243
    .line 1244
    if-gez v8, :cond_45

    .line 1245
    .line 1246
    iget v2, v3, Lr0/H0;->E:I

    .line 1247
    .line 1248
    goto/16 :goto_2b

    .line 1249
    .line 1250
    :cond_45
    new-instance v11, Lr0/P;

    .line 1251
    .line 1252
    const/16 v8, 0x10

    .line 1253
    .line 1254
    invoke-direct {v11, v8}, Lr0/P;-><init>(I)V

    .line 1255
    .line 1256
    .line 1257
    const/4 v9, 0x0

    .line 1258
    const/4 v10, 0x0

    .line 1259
    const-string v8, ","

    .line 1260
    .line 1261
    const/16 v12, 0x1e

    .line 1262
    .line 1263
    invoke-static/range {v7 .. v12}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v8

    .line 1267
    const-string v9, "select username,unReadCount from rconversation where username in ("

    .line 1268
    .line 1269
    const-string v10, ")"

    .line 1270
    .line 1271
    invoke-static {v9, v8, v10}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v8

    .line 1275
    new-instance v9, Ljava/util/ArrayList;

    .line 1276
    .line 1277
    invoke-static {v7}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1278
    .line 1279
    .line 1280
    move-result v10

    .line 1281
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1282
    .line 1283
    .line 1284
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v7

    .line 1288
    :goto_27
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1289
    .line 1290
    .line 1291
    move-result v10

    .line 1292
    if-eqz v10, :cond_46

    .line 1293
    .line 1294
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v10

    .line 1298
    check-cast v10, Ljava/lang/String;

    .line 1299
    .line 1300
    const-string v11, "null cannot be cast to non-null type kotlin.Any"

    .line 1301
    .line 1302
    invoke-static {v10, v11}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    goto :goto_27

    .line 1309
    :cond_46
    new-array v7, v4, [Ljava/lang/Object;

    .line 1310
    .line 1311
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v7

    .line 1315
    invoke-static {v8, v7}, Lz0/z;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v7

    .line 1319
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1320
    .line 1321
    .line 1322
    move-result v8

    .line 1323
    if-eqz v8, :cond_48

    .line 1324
    .line 1325
    iget v8, v3, Lr0/H0;->E:I

    .line 1326
    .line 1327
    if-lez v8, :cond_48

    .line 1328
    .line 1329
    iget-object v8, v3, Lr0/H0;->C:Ljava/lang/String;

    .line 1330
    .line 1331
    if-eqz v8, :cond_47

    .line 1332
    .line 1333
    const/16 v9, 0x7c

    .line 1334
    .line 1335
    invoke-static {v8, v9}, LU0/i;->v0(Ljava/lang/String;C)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v8

    .line 1339
    goto :goto_28

    .line 1340
    :cond_47
    const/4 v8, 0x0

    .line 1341
    :goto_28
    invoke-static {v8, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v5

    .line 1345
    if-eqz v5, :cond_48

    .line 1346
    .line 1347
    iget-wide v8, v3, Lr0/H0;->D:J

    .line 1348
    .line 1349
    sub-long v8, v14, v8

    .line 1350
    .line 1351
    const-wide/16 v10, 0x5dc

    .line 1352
    .line 1353
    cmp-long v5, v8, v10

    .line 1354
    .line 1355
    if-gez v5, :cond_48

    .line 1356
    .line 1357
    iput-wide v14, v3, Lr0/H0;->D:J

    .line 1358
    .line 1359
    iget v2, v3, Lr0/H0;->E:I

    .line 1360
    .line 1361
    goto :goto_2b

    .line 1362
    :cond_48
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1363
    .line 1364
    .line 1365
    move-result v5

    .line 1366
    if-eqz v5, :cond_4a

    .line 1367
    .line 1368
    sget-object v5, Lz0/z;->a:Lz0/z;

    .line 1369
    .line 1370
    new-array v5, v4, [Ljava/lang/Object;

    .line 1371
    .line 1372
    const-string v8, "select count(*) as total from rconversation"

    .line 1373
    .line 1374
    invoke-static {v8, v5}, Lz0/z;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v5

    .line 1378
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1379
    .line 1380
    .line 1381
    move-result v5

    .line 1382
    if-nez v5, :cond_49

    .line 1383
    .line 1384
    goto :goto_29

    .line 1385
    :cond_49
    move v2, v4

    .line 1386
    :cond_4a
    :goto_29
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v5

    .line 1390
    move v7, v4

    .line 1391
    :goto_2a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1392
    .line 1393
    .line 1394
    move-result v8

    .line 1395
    if-eqz v8, :cond_4d

    .line 1396
    .line 1397
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v8

    .line 1401
    check-cast v8, Ljava/util/Map;

    .line 1402
    .line 1403
    const-string v9, "unReadCount"

    .line 1404
    .line 1405
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v8

    .line 1409
    check-cast v8, Ljava/lang/String;

    .line 1410
    .line 1411
    if-eqz v8, :cond_4b

    .line 1412
    .line 1413
    invoke-static {v8}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    if-eqz v8, :cond_4b

    .line 1418
    .line 1419
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1420
    .line 1421
    .line 1422
    move-result v8

    .line 1423
    if-gez v8, :cond_4c

    .line 1424
    .line 1425
    :cond_4b
    move v8, v4

    .line 1426
    :cond_4c
    add-int/2addr v7, v8

    .line 1427
    goto :goto_2a

    .line 1428
    :cond_4d
    iput-object v13, v3, Lr0/H0;->C:Ljava/lang/String;

    .line 1429
    .line 1430
    iput-wide v14, v3, Lr0/H0;->D:J

    .line 1431
    .line 1432
    iput v7, v3, Lr0/H0;->E:I

    .line 1433
    .line 1434
    iput-boolean v2, v3, Lr0/H0;->F:Z

    .line 1435
    .line 1436
    move v2, v7

    .line 1437
    :goto_2b
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1438
    .line 1439
    iget-boolean v3, v3, Lr0/H0;->F:Z

    .line 1440
    .line 1441
    if-eqz v3, :cond_4e

    .line 1442
    .line 1443
    sub-int v2, v0, v2

    .line 1444
    .line 1445
    if-gez v2, :cond_4f

    .line 1446
    .line 1447
    :cond_4e
    move v2, v4

    .line 1448
    :cond_4f
    if-eq v2, v0, :cond_50

    .line 1449
    .line 1450
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1451
    .line 1452
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    aput-object v2, v0, v4

    .line 1457
    .line 1458
    :cond_50
    :goto_2c
    return-void

    .line 1459
    :pswitch_8
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    sget-boolean v0, Lz0/i;->a:Z

    .line 1463
    .line 1464
    invoke-static {}, Lz0/g;->x()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v0

    .line 1468
    if-nez v0, :cond_51

    .line 1469
    .line 1470
    goto/16 :goto_3a

    .line 1471
    .line 1472
    :cond_51
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1473
    .line 1474
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1475
    .line 1476
    .line 1477
    array-length v3, v0

    .line 1478
    move v5, v4

    .line 1479
    :goto_2d
    if-ge v5, v3, :cond_53

    .line 1480
    .line 1481
    aget-object v7, v0, v5

    .line 1482
    .line 1483
    instance-of v8, v7, Landroid/app/Notification;

    .line 1484
    .line 1485
    if-eqz v8, :cond_52

    .line 1486
    .line 1487
    goto :goto_2e

    .line 1488
    :cond_52
    add-int/2addr v5, v2

    .line 1489
    goto :goto_2d

    .line 1490
    :cond_53
    const/4 v7, 0x0

    .line 1491
    :goto_2e
    instance-of v0, v7, Landroid/app/Notification;

    .line 1492
    .line 1493
    if-eqz v0, :cond_54

    .line 1494
    .line 1495
    move-object v0, v7

    .line 1496
    check-cast v0, Landroid/app/Notification;

    .line 1497
    .line 1498
    goto :goto_2f

    .line 1499
    :cond_54
    const/4 v0, 0x0

    .line 1500
    :goto_2f
    if-nez v0, :cond_55

    .line 1501
    .line 1502
    goto/16 :goto_3a

    .line 1503
    .line 1504
    :cond_55
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1505
    .line 1506
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1507
    .line 1508
    .line 1509
    iget-object v3, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 1510
    .line 1511
    const-string v11, "android.title"

    .line 1512
    .line 1513
    const-string v12, "android.text"

    .line 1514
    .line 1515
    const-string v7, "android.title"

    .line 1516
    .line 1517
    const-string v8, "android.text"

    .line 1518
    .line 1519
    const-string v9, "android.subText"

    .line 1520
    .line 1521
    const-string v10, "android.bigText"

    .line 1522
    .line 1523
    const-string v13, "android.subText"

    .line 1524
    .line 1525
    const-string v14, "android.bigText"

    .line 1526
    .line 1527
    filled-new-array/range {v7 .. v14}, [Ljava/lang/String;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v5

    .line 1531
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1532
    .line 1533
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1534
    .line 1535
    .line 1536
    move v8, v4

    .line 1537
    :goto_30
    const/16 v0, 0x8

    .line 1538
    .line 1539
    if-ge v8, v0, :cond_59

    .line 1540
    .line 1541
    aget-object v0, v5, v8

    .line 1542
    .line 1543
    if-eqz v3, :cond_56

    .line 1544
    .line 1545
    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1549
    goto :goto_31

    .line 1550
    :catchall_0
    move-exception v0

    .line 1551
    new-instance v9, LE0/d;

    .line 1552
    .line 1553
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1554
    .line 1555
    .line 1556
    move-object v0, v9

    .line 1557
    goto :goto_31

    .line 1558
    :cond_56
    const/4 v0, 0x0

    .line 1559
    :goto_31
    instance-of v9, v0, LE0/d;

    .line 1560
    .line 1561
    if-eqz v9, :cond_57

    .line 1562
    .line 1563
    const/4 v0, 0x0

    .line 1564
    :cond_57
    if-eqz v0, :cond_58

    .line 1565
    .line 1566
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1567
    .line 1568
    .line 1569
    const/16 v0, 0x20

    .line 1570
    .line 1571
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1572
    .line 1573
    .line 1574
    :cond_58
    add-int/2addr v8, v2

    .line 1575
    goto :goto_30

    .line 1576
    :cond_59
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    const-string v2, "toString(...)"

    .line 1584
    .line 1585
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    iget-object v2, v1, Lr0/C0;->b:Lr0/H0;

    .line 1589
    .line 1590
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v2

    .line 1597
    if-eqz v2, :cond_5a

    .line 1598
    .line 1599
    goto/16 :goto_36

    .line 1600
    .line 1601
    :cond_5a
    const-class v2, Lq0/h;

    .line 1602
    .line 1603
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v3

    .line 1607
    check-cast v3, Lq0/h;

    .line 1608
    .line 1609
    invoke-virtual {v3}, Lq0/h;->c()V

    .line 1610
    .line 1611
    .line 1612
    sget-boolean v3, Lz0/i;->a:Z

    .line 1613
    .line 1614
    invoke-static {}, Lz0/g;->s()Z

    .line 1615
    .line 1616
    .line 1617
    move-result v3

    .line 1618
    if-nez v3, :cond_5b

    .line 1619
    .line 1620
    sget-object v2, LF0/s;->a:LF0/s;

    .line 1621
    .line 1622
    goto :goto_32

    .line 1623
    :cond_5b
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v2

    .line 1627
    check-cast v2, Lq0/h;

    .line 1628
    .line 1629
    new-instance v3, Ljava/util/ArrayList;

    .line 1630
    .line 1631
    iget-object v2, v2, Lq0/h;->a:Ljava/util/ArrayList;

    .line 1632
    .line 1633
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1634
    .line 1635
    .line 1636
    move-object v2, v3

    .line 1637
    :goto_32
    invoke-static {v2}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v2

    .line 1641
    new-instance v3, Ljava/util/ArrayList;

    .line 1642
    .line 1643
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v2

    .line 1650
    :cond_5c
    :goto_33
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1651
    .line 1652
    .line 1653
    move-result v5

    .line 1654
    if-eqz v5, :cond_5d

    .line 1655
    .line 1656
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v5

    .line 1660
    move-object v7, v5

    .line 1661
    check-cast v7, Ljava/lang/String;

    .line 1662
    .line 1663
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v7

    .line 1667
    if-nez v7, :cond_5c

    .line 1668
    .line 1669
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1670
    .line 1671
    .line 1672
    goto :goto_33

    .line 1673
    :cond_5d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v2

    .line 1677
    :cond_5e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1678
    .line 1679
    .line 1680
    move-result v3

    .line 1681
    if-eqz v3, :cond_5f

    .line 1682
    .line 1683
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v3

    .line 1687
    move-object v5, v3

    .line 1688
    check-cast v5, Ljava/lang/String;

    .line 1689
    .line 1690
    invoke-static {v0, v5, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v5

    .line 1694
    if-eqz v5, :cond_5e

    .line 1695
    .line 1696
    goto :goto_34

    .line 1697
    :cond_5f
    const/4 v3, 0x0

    .line 1698
    :goto_34
    move-object v2, v3

    .line 1699
    check-cast v2, Ljava/lang/String;

    .line 1700
    .line 1701
    if-eqz v2, :cond_60

    .line 1702
    .line 1703
    goto :goto_37

    .line 1704
    :cond_60
    sget-boolean v2, Lz0/i;->a:Z

    .line 1705
    .line 1706
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v2

    .line 1710
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v2

    .line 1714
    :cond_61
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1715
    .line 1716
    .line 1717
    move-result v3

    .line 1718
    if-eqz v3, :cond_62

    .line 1719
    .line 1720
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v3

    .line 1724
    move-object v5, v3

    .line 1725
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 1726
    .line 1727
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v7

    .line 1731
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1732
    .line 1733
    .line 1734
    move-result v7

    .line 1735
    if-nez v7, :cond_61

    .line 1736
    .line 1737
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v5

    .line 1741
    invoke-static {v0, v5, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1742
    .line 1743
    .line 1744
    move-result v5

    .line 1745
    if-eqz v5, :cond_61

    .line 1746
    .line 1747
    goto :goto_35

    .line 1748
    :cond_62
    const/4 v3, 0x0

    .line 1749
    :goto_35
    check-cast v3, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 1750
    .line 1751
    if-eqz v3, :cond_63

    .line 1752
    .line 1753
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v2

    .line 1757
    goto :goto_37

    .line 1758
    :cond_63
    :goto_36
    const/4 v2, 0x0

    .line 1759
    :goto_37
    if-nez v2, :cond_68

    .line 1760
    .line 1761
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1762
    .line 1763
    iget-object v4, v3, Lr0/H0;->z:Ljava/lang/String;

    .line 1764
    .line 1765
    if-nez v4, :cond_64

    .line 1766
    .line 1767
    goto :goto_38

    .line 1768
    :cond_64
    invoke-static {v4}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1769
    .line 1770
    .line 1771
    move-result v5

    .line 1772
    if-eqz v5, :cond_68

    .line 1773
    .line 1774
    sget-boolean v5, Lz0/i;->a:Z

    .line 1775
    .line 1776
    invoke-static {v4}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result v4

    .line 1780
    if-eqz v4, :cond_65

    .line 1781
    .line 1782
    goto :goto_38

    .line 1783
    :cond_65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1784
    .line 1785
    .line 1786
    move-result-wide v4

    .line 1787
    iget-wide v7, v3, Lr0/H0;->A:J

    .line 1788
    .line 1789
    sub-long/2addr v4, v7

    .line 1790
    const-wide/16 v7, 0x0

    .line 1791
    .line 1792
    cmp-long v9, v7, v4

    .line 1793
    .line 1794
    if-gtz v9, :cond_68

    .line 1795
    .line 1796
    const-wide/16 v9, 0x1f41

    .line 1797
    .line 1798
    cmp-long v4, v4, v9

    .line 1799
    .line 1800
    if-gez v4, :cond_68

    .line 1801
    .line 1802
    iget-object v4, v3, Lr0/H0;->z:Ljava/lang/String;

    .line 1803
    .line 1804
    if-nez v4, :cond_66

    .line 1805
    .line 1806
    goto :goto_38

    .line 1807
    :cond_66
    invoke-static {v4}, Lr0/H0;->R0(Ljava/lang/String;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v5

    .line 1811
    if-eqz v5, :cond_68

    .line 1812
    .line 1813
    invoke-static {v4}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 1814
    .line 1815
    .line 1816
    move-result v5

    .line 1817
    if-eqz v5, :cond_67

    .line 1818
    .line 1819
    goto :goto_38

    .line 1820
    :cond_67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1821
    .line 1822
    .line 1823
    move-result-wide v11

    .line 1824
    iget-wide v13, v3, Lr0/H0;->A:J

    .line 1825
    .line 1826
    sub-long/2addr v11, v13

    .line 1827
    cmp-long v3, v7, v11

    .line 1828
    .line 1829
    if-gtz v3, :cond_68

    .line 1830
    .line 1831
    cmp-long v3, v11, v9

    .line 1832
    .line 1833
    if-gez v3, :cond_68

    .line 1834
    .line 1835
    goto :goto_39

    .line 1836
    :cond_68
    :goto_38
    const/4 v4, 0x0

    .line 1837
    :goto_39
    if-nez v2, :cond_6a

    .line 1838
    .line 1839
    if-nez v4, :cond_69

    .line 1840
    .line 1841
    goto :goto_3a

    .line 1842
    :cond_69
    move-object v2, v4

    .line 1843
    :cond_6a
    iget-object v3, v1, Lr0/C0;->b:Lr0/H0;

    .line 1844
    .line 1845
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1846
    .line 1847
    .line 1848
    move-result v0

    .line 1849
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1850
    .line 1851
    const-string v5, "notification:"

    .line 1852
    .line 1853
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1857
    .line 1858
    .line 1859
    const-string v5, ":"

    .line 1860
    .line 1861
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1862
    .line 1863
    .line 1864
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v0

    .line 1871
    invoke-virtual {v3, v0, v2}, Lr0/H0;->F1(Ljava/lang/String;Ljava/lang/String;)V

    .line 1872
    .line 1873
    .line 1874
    const/4 v2, 0x0

    .line 1875
    invoke-virtual {v6, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1876
    .line 1877
    .line 1878
    :goto_3a
    return-void

    .line 1879
    :pswitch_9
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1880
    .line 1881
    .line 1882
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 1883
    .line 1884
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1885
    .line 1886
    .line 1887
    sget-boolean v2, Lz0/i;->a:Z

    .line 1888
    .line 1889
    invoke-static {}, Lz0/g;->F()Z

    .line 1890
    .line 1891
    .line 1892
    move-result v2

    .line 1893
    if-nez v2, :cond_6b

    .line 1894
    .line 1895
    goto/16 :goto_3f

    .line 1896
    .line 1897
    :cond_6b
    iget-object v2, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1898
    .line 1899
    const-string v3, "f270168e"

    .line 1900
    .line 1901
    invoke-static {v2, v3}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v2

    .line 1905
    if-nez v2, :cond_6c

    .line 1906
    .line 1907
    goto/16 :goto_3f

    .line 1908
    .line 1909
    :cond_6c
    iget-object v3, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1910
    .line 1911
    const-string v4, "f270167d"

    .line 1912
    .line 1913
    invoke-static {v3, v4}, Lr0/H0;->Z(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    if-eqz v3, :cond_75

    .line 1918
    .line 1919
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1920
    .line 1921
    .line 1922
    move-result v3

    .line 1923
    invoke-static {v0, v2, v3}, Lr0/H0;->e(Lr0/H0;Ljava/lang/Object;I)Landroid/view/MenuItem;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v3

    .line 1927
    if-nez v3, :cond_6d

    .line 1928
    .line 1929
    goto :goto_3f

    .line 1930
    :cond_6d
    invoke-static {v3}, Lr0/H0;->F0(Landroid/view/MenuItem;)Z

    .line 1931
    .line 1932
    .line 1933
    move-result v4

    .line 1934
    if-nez v4, :cond_6e

    .line 1935
    .line 1936
    goto :goto_3f

    .line 1937
    :cond_6e
    iget-object v4, v0, Lr0/H0;->I:Ljava/util/WeakHashMap;

    .line 1938
    .line 1939
    invoke-virtual {v4, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v3

    .line 1943
    check-cast v3, LE0/c;

    .line 1944
    .line 1945
    const-string v4, "f270201f"

    .line 1946
    .line 1947
    invoke-static {v2, v4}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v4

    .line 1951
    check-cast v4, Landroid/view/View;

    .line 1952
    .line 1953
    if-eqz v3, :cond_6f

    .line 1954
    .line 1955
    iget-object v5, v3, LE0/c;->a:Ljava/lang/Object;

    .line 1956
    .line 1957
    check-cast v5, Ljava/lang/String;

    .line 1958
    .line 1959
    if-nez v5, :cond_71

    .line 1960
    .line 1961
    :cond_6f
    if-eqz v4, :cond_70

    .line 1962
    .line 1963
    invoke-static {v4}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v5

    .line 1967
    goto :goto_3b

    .line 1968
    :cond_70
    const/4 v5, 0x0

    .line 1969
    :goto_3b
    if-nez v5, :cond_71

    .line 1970
    .line 1971
    goto :goto_3f

    .line 1972
    :cond_71
    if-eqz v3, :cond_73

    .line 1973
    .line 1974
    iget-object v3, v3, LE0/c;->b:Ljava/lang/Object;

    .line 1975
    .line 1976
    check-cast v3, Ljava/lang/String;

    .line 1977
    .line 1978
    if-eqz v3, :cond_73

    .line 1979
    .line 1980
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v3

    .line 1984
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v3

    .line 1988
    if-eqz v3, :cond_73

    .line 1989
    .line 1990
    invoke-static {v3, v5}, Lr0/H0;->P0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1991
    .line 1992
    .line 1993
    move-result v7

    .line 1994
    if-eqz v7, :cond_72

    .line 1995
    .line 1996
    goto :goto_3c

    .line 1997
    :cond_72
    const/4 v3, 0x0

    .line 1998
    :goto_3c
    if-nez v3, :cond_74

    .line 1999
    .line 2000
    :cond_73
    const/4 v3, 0x0

    .line 2001
    goto :goto_3d

    .line 2002
    :cond_74
    const/4 v3, 0x0

    .line 2003
    goto :goto_3e

    .line 2004
    :goto_3d
    invoke-virtual {v0, v4, v3, v5}, Lr0/H0;->q1(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 2005
    .line 2006
    .line 2007
    :goto_3e
    invoke-virtual {v0, v5}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual {v0, v2}, Lr0/H0;->v(Ljava/lang/Object;)V

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v6, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2014
    .line 2015
    .line 2016
    :cond_75
    :goto_3f
    return-void

    .line 2017
    :pswitch_a
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2018
    .line 2019
    .line 2020
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2021
    .line 2022
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2023
    .line 2024
    .line 2025
    invoke-static {v4, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    instance-of v3, v0, Landroid/view/View$OnLongClickListener;

    .line 2030
    .line 2031
    if-eqz v3, :cond_76

    .line 2032
    .line 2033
    move-object v5, v0

    .line 2034
    check-cast v5, Landroid/view/View$OnLongClickListener;

    .line 2035
    .line 2036
    goto :goto_40

    .line 2037
    :cond_76
    const/4 v5, 0x0

    .line 2038
    :goto_40
    if-nez v5, :cond_77

    .line 2039
    .line 2040
    goto :goto_41

    .line 2041
    :cond_77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v0

    .line 2045
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v0

    .line 2049
    const-string v3, "HideMainUIListPluginPart"

    .line 2050
    .line 2051
    invoke-static {v0, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 2052
    .line 2053
    .line 2054
    move-result v0

    .line 2055
    if-eqz v0, :cond_78

    .line 2056
    .line 2057
    goto :goto_41

    .line 2058
    :cond_78
    iget-object v0, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2059
    .line 2060
    new-instance v3, Lr0/b0;

    .line 2061
    .line 2062
    iget-object v6, v1, Lr0/C0;->b:Lr0/H0;

    .line 2063
    .line 2064
    invoke-direct {v3, v5, v6, v2}, Lr0/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2065
    .line 2066
    .line 2067
    aput-object v3, v0, v4

    .line 2068
    .line 2069
    :goto_41
    return-void

    .line 2070
    :pswitch_b
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2071
    .line 2072
    .line 2073
    iget-object v5, v1, Lr0/C0;->b:Lr0/H0;

    .line 2074
    .line 2075
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2076
    .line 2077
    .line 2078
    sget-boolean v7, Lz0/i;->a:Z

    .line 2079
    .line 2080
    invoke-static {}, Lz0/g;->F()Z

    .line 2081
    .line 2082
    .line 2083
    move-result v7

    .line 2084
    if-nez v7, :cond_79

    .line 2085
    .line 2086
    goto :goto_47

    .line 2087
    :cond_79
    iget-object v7, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2088
    .line 2089
    invoke-static {v7, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2090
    .line 2091
    .line 2092
    invoke-static {v4, v7}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v3

    .line 2096
    instance-of v7, v3, Landroid/view/MenuItem;

    .line 2097
    .line 2098
    if-eqz v7, :cond_7a

    .line 2099
    .line 2100
    check-cast v3, Landroid/view/MenuItem;

    .line 2101
    .line 2102
    goto :goto_42

    .line 2103
    :cond_7a
    const/4 v3, 0x0

    .line 2104
    :goto_42
    if-nez v3, :cond_7b

    .line 2105
    .line 2106
    goto :goto_47

    .line 2107
    :cond_7b
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 2108
    .line 2109
    .line 2110
    move-result v3

    .line 2111
    const v7, 0x6d617101

    .line 2112
    .line 2113
    .line 2114
    if-eq v3, v7, :cond_7c

    .line 2115
    .line 2116
    goto :goto_47

    .line 2117
    :cond_7c
    iget-object v3, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2118
    .line 2119
    if-nez v3, :cond_7d

    .line 2120
    .line 2121
    goto :goto_44

    .line 2122
    :cond_7d
    const-string v7, "f206374d"

    .line 2123
    .line 2124
    const-string v8, "f207175d"

    .line 2125
    .line 2126
    const-string v9, "f203780d"

    .line 2127
    .line 2128
    filled-new-array {v9, v7, v8}, [Ljava/lang/String;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v7

    .line 2132
    :goto_43
    if-ge v4, v0, :cond_7f

    .line 2133
    .line 2134
    aget-object v8, v7, v4

    .line 2135
    .line 2136
    invoke-static {v3, v8}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v8

    .line 2140
    if-eqz v8, :cond_7e

    .line 2141
    .line 2142
    goto :goto_45

    .line 2143
    :cond_7e
    add-int/2addr v4, v2

    .line 2144
    goto :goto_43

    .line 2145
    :cond_7f
    :goto_44
    const/4 v8, 0x0

    .line 2146
    :goto_45
    if-eqz v8, :cond_80

    .line 2147
    .line 2148
    invoke-static {v8}, Lr0/H0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v0

    .line 2152
    if-nez v0, :cond_82

    .line 2153
    .line 2154
    :cond_80
    if-eqz v8, :cond_81

    .line 2155
    .line 2156
    iget-object v0, v5, Lr0/H0;->H:Ljava/util/WeakHashMap;

    .line 2157
    .line 2158
    invoke-virtual {v0, v8}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v0

    .line 2162
    check-cast v0, Ljava/lang/String;

    .line 2163
    .line 2164
    goto :goto_46

    .line 2165
    :cond_81
    const/4 v0, 0x0

    .line 2166
    :goto_46
    if-nez v0, :cond_82

    .line 2167
    .line 2168
    goto :goto_47

    .line 2169
    :cond_82
    if-eqz v8, :cond_83

    .line 2170
    .line 2171
    invoke-static {v8, v0}, Lr0/H0;->P(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 2172
    .line 2173
    .line 2174
    :cond_83
    invoke-virtual {v5, v0}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 2175
    .line 2176
    .line 2177
    const/4 v2, 0x0

    .line 2178
    invoke-virtual {v6, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2179
    .line 2180
    .line 2181
    :goto_47
    return-void

    .line 2182
    :pswitch_c
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2183
    .line 2184
    .line 2185
    iget-object v0, v1, Lr0/C0;->b:Lr0/H0;

    .line 2186
    .line 2187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2188
    .line 2189
    .line 2190
    sget-boolean v5, Lz0/i;->a:Z

    .line 2191
    .line 2192
    invoke-static {}, Lz0/g;->F()Z

    .line 2193
    .line 2194
    .line 2195
    move-result v5

    .line 2196
    if-nez v5, :cond_84

    .line 2197
    .line 2198
    goto/16 :goto_4f

    .line 2199
    .line 2200
    :cond_84
    iget-object v5, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2201
    .line 2202
    if-nez v5, :cond_86

    .line 2203
    .line 2204
    :cond_85
    const/4 v2, 0x0

    .line 2205
    goto :goto_49

    .line 2206
    :cond_86
    invoke-virtual {v0}, Lr0/H0;->S()[Ljava/lang/String;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v7

    .line 2210
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v8

    .line 2214
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v8

    .line 2218
    invoke-static {v7, v8}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2219
    .line 2220
    .line 2221
    move-result v7

    .line 2222
    if-eqz v7, :cond_87

    .line 2223
    .line 2224
    move-object v2, v5

    .line 2225
    goto :goto_49

    .line 2226
    :cond_87
    const-string v7, "d"

    .line 2227
    .line 2228
    invoke-static {v5, v7}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v7

    .line 2232
    if-nez v7, :cond_89

    .line 2233
    .line 2234
    const-string v7, "f270194d"

    .line 2235
    .line 2236
    invoke-static {v5, v7}, Lr0/H0;->b0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v7

    .line 2240
    if-nez v7, :cond_89

    .line 2241
    .line 2242
    invoke-virtual {v0}, Lr0/H0;->S()[Ljava/lang/String;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v7

    .line 2246
    array-length v8, v7

    .line 2247
    :goto_48
    if-ge v4, v8, :cond_85

    .line 2248
    .line 2249
    aget-object v9, v7, v4

    .line 2250
    .line 2251
    invoke-static {v5, v9}, Lr0/H0;->L(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v9

    .line 2255
    if-nez v9, :cond_88

    .line 2256
    .line 2257
    add-int/2addr v4, v2

    .line 2258
    goto :goto_48

    .line 2259
    :cond_88
    move-object v2, v9

    .line 2260
    goto :goto_49

    .line 2261
    :cond_89
    move-object v2, v7

    .line 2262
    :goto_49
    if-nez v2, :cond_8a

    .line 2263
    .line 2264
    goto/16 :goto_4f

    .line 2265
    .line 2266
    :cond_8a
    iget-object v4, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2267
    .line 2268
    invoke-static {v4, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2269
    .line 2270
    .line 2271
    const/4 v3, 0x2

    .line 2272
    invoke-static {v3, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v3

    .line 2276
    instance-of v4, v3, Ljava/lang/Integer;

    .line 2277
    .line 2278
    if-eqz v4, :cond_8b

    .line 2279
    .line 2280
    check-cast v3, Ljava/lang/Integer;

    .line 2281
    .line 2282
    goto :goto_4a

    .line 2283
    :cond_8b
    const/4 v3, 0x0

    .line 2284
    :goto_4a
    if-eqz v3, :cond_94

    .line 2285
    .line 2286
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2287
    .line 2288
    .line 2289
    move-result v3

    .line 2290
    invoke-static {v0, v2, v3}, Lr0/H0;->e(Lr0/H0;Ljava/lang/Object;I)Landroid/view/MenuItem;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v3

    .line 2294
    if-nez v3, :cond_8c

    .line 2295
    .line 2296
    goto :goto_4f

    .line 2297
    :cond_8c
    invoke-static {v3}, Lr0/H0;->F0(Landroid/view/MenuItem;)Z

    .line 2298
    .line 2299
    .line 2300
    move-result v4

    .line 2301
    if-nez v4, :cond_8d

    .line 2302
    .line 2303
    goto :goto_4f

    .line 2304
    :cond_8d
    iget-object v4, v0, Lr0/H0;->I:Ljava/util/WeakHashMap;

    .line 2305
    .line 2306
    invoke-virtual {v4, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v3

    .line 2310
    check-cast v3, LE0/c;

    .line 2311
    .line 2312
    invoke-static {v2}, Lr0/H0;->W(Ljava/lang/Object;)Landroid/view/View;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v4

    .line 2316
    if-eqz v3, :cond_8e

    .line 2317
    .line 2318
    iget-object v5, v3, LE0/c;->a:Ljava/lang/Object;

    .line 2319
    .line 2320
    check-cast v5, Ljava/lang/String;

    .line 2321
    .line 2322
    if-nez v5, :cond_90

    .line 2323
    .line 2324
    :cond_8e
    if-eqz v4, :cond_8f

    .line 2325
    .line 2326
    invoke-static {v4}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 2327
    .line 2328
    .line 2329
    move-result-object v5

    .line 2330
    goto :goto_4b

    .line 2331
    :cond_8f
    const/4 v5, 0x0

    .line 2332
    :goto_4b
    if-nez v5, :cond_90

    .line 2333
    .line 2334
    goto :goto_4f

    .line 2335
    :cond_90
    if-eqz v3, :cond_92

    .line 2336
    .line 2337
    iget-object v3, v3, LE0/c;->b:Ljava/lang/Object;

    .line 2338
    .line 2339
    check-cast v3, Ljava/lang/String;

    .line 2340
    .line 2341
    if-eqz v3, :cond_92

    .line 2342
    .line 2343
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v3

    .line 2347
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v3

    .line 2351
    if-eqz v3, :cond_92

    .line 2352
    .line 2353
    invoke-static {v3, v5}, Lr0/H0;->P0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2354
    .line 2355
    .line 2356
    move-result v7

    .line 2357
    if-eqz v7, :cond_91

    .line 2358
    .line 2359
    goto :goto_4c

    .line 2360
    :cond_91
    const/4 v3, 0x0

    .line 2361
    :goto_4c
    if-nez v3, :cond_93

    .line 2362
    .line 2363
    :cond_92
    const/4 v3, 0x0

    .line 2364
    goto :goto_4d

    .line 2365
    :cond_93
    const/4 v3, 0x0

    .line 2366
    goto :goto_4e

    .line 2367
    :goto_4d
    invoke-virtual {v0, v4, v3, v5}, Lr0/H0;->q1(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 2368
    .line 2369
    .line 2370
    :goto_4e
    invoke-virtual {v0, v5}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 2371
    .line 2372
    .line 2373
    invoke-virtual {v0, v2}, Lr0/H0;->v(Ljava/lang/Object;)V

    .line 2374
    .line 2375
    .line 2376
    invoke-virtual {v6, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2377
    .line 2378
    .line 2379
    :cond_94
    :goto_4f
    return-void

    .line 2380
    :pswitch_d
    const/4 v3, 0x0

    .line 2381
    invoke-static {v6, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2382
    .line 2383
    .line 2384
    iget-object v5, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2385
    .line 2386
    aget-object v5, v5, v0

    .line 2387
    .line 2388
    instance-of v7, v5, Landroid/view/View$OnCreateContextMenuListener;

    .line 2389
    .line 2390
    if-eqz v7, :cond_95

    .line 2391
    .line 2392
    check-cast v5, Landroid/view/View$OnCreateContextMenuListener;

    .line 2393
    .line 2394
    move-object/from16 v16, v3

    .line 2395
    .line 2396
    move-object v3, v5

    .line 2397
    goto :goto_50

    .line 2398
    :cond_95
    move-object/from16 v16, v3

    .line 2399
    .line 2400
    :goto_50
    if-nez v3, :cond_96

    .line 2401
    .line 2402
    goto :goto_52

    .line 2403
    :cond_96
    move v5, v4

    .line 2404
    iget-object v4, v1, Lr0/C0;->b:Lr0/H0;

    .line 2405
    .line 2406
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2407
    .line 2408
    .line 2409
    sget-boolean v7, Lz0/i;->a:Z

    .line 2410
    .line 2411
    invoke-static {}, Lz0/g;->F()Z

    .line 2412
    .line 2413
    .line 2414
    move-result v7

    .line 2415
    if-nez v7, :cond_97

    .line 2416
    .line 2417
    goto :goto_52

    .line 2418
    :cond_97
    iget-object v7, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2419
    .line 2420
    aget-object v5, v7, v5

    .line 2421
    .line 2422
    instance-of v8, v5, Landroid/view/View;

    .line 2423
    .line 2424
    if-eqz v8, :cond_98

    .line 2425
    .line 2426
    check-cast v5, Landroid/view/View;

    .line 2427
    .line 2428
    goto :goto_51

    .line 2429
    :cond_98
    move-object/from16 v5, v16

    .line 2430
    .line 2431
    :goto_51
    invoke-static {v2, v7}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2432
    .line 2433
    .line 2434
    move-result-object v2

    .line 2435
    instance-of v2, v2, Ljava/lang/Integer;

    .line 2436
    .line 2437
    invoke-static {v3}, Lr0/H0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v2

    .line 2441
    if-nez v2, :cond_99

    .line 2442
    .line 2443
    invoke-static {v5}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 2444
    .line 2445
    .line 2446
    move-result-object v2

    .line 2447
    if-nez v2, :cond_99

    .line 2448
    .line 2449
    iget-object v2, v4, Lr0/H0;->H:Ljava/util/WeakHashMap;

    .line 2450
    .line 2451
    invoke-virtual {v2, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v2

    .line 2455
    check-cast v2, Ljava/lang/String;

    .line 2456
    .line 2457
    :cond_99
    move-object v5, v2

    .line 2458
    if-eqz v5, :cond_9b

    .line 2459
    .line 2460
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2461
    .line 2462
    .line 2463
    move-result v2

    .line 2464
    if-eqz v2, :cond_9a

    .line 2465
    .line 2466
    goto :goto_52

    .line 2467
    :cond_9a
    iget-object v8, v6, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2468
    .line 2469
    new-instance v2, Lr0/Z;

    .line 2470
    .line 2471
    const/4 v7, 0x1

    .line 2472
    invoke-direct/range {v2 .. v7}, Lr0/Z;-><init>(Landroid/view/View$OnCreateContextMenuListener;Le0/a;Ljava/io/Serializable;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    .line 2473
    .line 2474
    .line 2475
    aput-object v2, v8, v0

    .line 2476
    .line 2477
    :cond_9b
    :goto_52
    return-void

    .line 2478
    nop

    .line 2479
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
