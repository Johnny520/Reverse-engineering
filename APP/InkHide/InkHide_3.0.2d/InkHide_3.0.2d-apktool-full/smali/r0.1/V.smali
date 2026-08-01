.class public final Lr0/V;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/V;->a:I

    iput-object p1, p0, Lr0/V;->b:Lr0/d0;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    const/4 v0, 0x2

    .line 2
    const-class v1, Landroid/view/View;

    .line 3
    .line 4
    const-string v2, ""

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "args"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v7, "param"

    .line 12
    .line 13
    iget v8, p0, Lr0/V;->a:I

    .line 14
    .line 15
    packed-switch v8, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    return-void

    .line 19
    :pswitch_1
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    instance-of v1, v0, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/view/View;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v6

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v1, v6

    .line 61
    :goto_1
    if-nez v1, :cond_3

    .line 62
    .line 63
    move-object v1, v2

    .line 64
    :cond_3
    iget-object v3, p0, Lr0/V;->b:Lr0/d0;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move-object v4, v6

    .line 87
    :goto_2
    if-nez v4, :cond_5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    move-object v2, v4

    .line 91
    :goto_3
    invoke-virtual {v3, v2}, Lr0/d0;->E0(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_8

    .line 96
    .line 97
    :cond_6
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 98
    .line 99
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, v3, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v2, "view="

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v2, "context="

    .line 119
    .line 120
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    :cond_7
    const-string p1, "adapter="

    .line 135
    .line 136
    invoke-static {p1, v6}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string v2, "hide contact wx recycler bind"

    .line 141
    .line 142
    filled-new-array {v2, v0, v1, p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_8
    :goto_4
    return-void

    .line 150
    :pswitch_2
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lr0/V;->b:Lr0/d0;

    .line 154
    .line 155
    iget-boolean v4, v0, Lr0/d0;->o:Z

    .line 156
    .line 157
    if-eqz v4, :cond_9

    .line 158
    .line 159
    goto/16 :goto_7

    .line 160
    .line 161
    :cond_9
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 162
    .line 163
    if-eqz v4, :cond_a

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    :cond_a
    if-nez v6, :cond_b

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_b
    move-object v2, v6

    .line 177
    :goto_5
    invoke-static {v2}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_e

    .line 182
    .line 183
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    new-array v4, v5, [Ljava/lang/Class;

    .line 190
    .line 191
    const-string v6, "q0"

    .line 192
    .line 193
    invoke-virtual {v0, v2, v6, v4}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 194
    .line 195
    .line 196
    const-class v4, Landroid/os/Bundle;

    .line 197
    .line 198
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    const-string v8, "p0"

    .line 203
    .line 204
    invoke-virtual {v0, v2, v8, v7}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 205
    .line 206
    .line 207
    const-string v7, "s0"

    .line 208
    .line 209
    new-array v8, v5, [Ljava/lang/Class;

    .line 210
    .line 211
    invoke-virtual {v0, v2, v7, v8}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    sget-object v8, Lz0/A;->d:Lz0/A;

    .line 219
    .line 220
    if-ne v7, v8, :cond_c

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    const-string v8, "MvvmAddressUI"

    .line 228
    .line 229
    invoke-static {v7, v8, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eqz v3, :cond_d

    .line 234
    .line 235
    :goto_6
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v0, v2, v6, v3}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 240
    .line 241
    .line 242
    const-string v3, "l0"

    .line 243
    .line 244
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-virtual {v0, v2, v3, v6}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 249
    .line 250
    .line 251
    const-string v3, "t0"

    .line 252
    .line 253
    new-array v6, v5, [Ljava/lang/Class;

    .line 254
    .line 255
    invoke-virtual {v0, v2, v3, v6}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 256
    .line 257
    .line 258
    const-string v3, "w0"

    .line 259
    .line 260
    new-array v6, v5, [Ljava/lang/Class;

    .line 261
    .line 262
    invoke-virtual {v0, v2, v3, v6}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 263
    .line 264
    .line 265
    const-string v3, "e0"

    .line 266
    .line 267
    new-array v6, v5, [Ljava/lang/Class;

    .line 268
    .line 269
    invoke-virtual {v0, v2, v3, v6}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 270
    .line 271
    .line 272
    const-string v3, "r0"

    .line 273
    .line 274
    new-array v6, v5, [Ljava/lang/Class;

    .line 275
    .line 276
    invoke-virtual {v0, v2, v3, v6}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 277
    .line 278
    .line 279
    const-string v3, "u0"

    .line 280
    .line 281
    new-array v5, v5, [Ljava/lang/Class;

    .line 282
    .line 283
    invoke-virtual {v0, v2, v3, v5}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    :cond_d
    filled-new-array {v1, v4}, [Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const-string v3, "onViewCreated"

    .line 291
    .line 292
    invoke-virtual {v0, v2, v3, v1}, Lr0/d0;->h0(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v2}, Lr0/d0;->j0(Ljava/lang/Class;)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-virtual {v0, p1}, Lr0/d0;->L0(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_e
    :goto_7
    return-void

    .line 304
    :pswitch_3
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 308
    .line 309
    instance-of v0, p1, Landroid/widget/ListView;

    .line 310
    .line 311
    if-eqz v0, :cond_f

    .line 312
    .line 313
    move-object v6, p1

    .line 314
    check-cast v6, Landroid/widget/ListView;

    .line 315
    .line 316
    :cond_f
    if-nez v6, :cond_10

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_10
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-static {v6}, Lr0/d0;->v0(Landroid/widget/ListView;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_11

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_11
    sget-boolean v0, Lz0/i;->a:Z

    .line 332
    .line 333
    invoke-static {}, Lz0/g;->z()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_12

    .line 338
    .line 339
    new-instance v0, Lr0/F;

    .line 340
    .line 341
    invoke-direct {v0, v6, p1}, Lr0/F;-><init>(Landroid/widget/ListView;Lr0/d0;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v6, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_12
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    :goto_8
    if-ge v5, v0, :cond_13

    .line 353
    .line 354
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    const-string v2, "getChildAt(...)"

    .line 359
    .line 360
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {p1, v1}, Lr0/d0;->h(Lr0/d0;Landroid/view/View;)V

    .line 364
    .line 365
    .line 366
    add-int/2addr v5, v3

    .line 367
    goto :goto_8

    .line 368
    :cond_13
    :goto_9
    return-void

    .line 369
    :pswitch_4
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    instance-of v1, v0, Landroid/view/View;

    .line 377
    .line 378
    if-eqz v1, :cond_14

    .line 379
    .line 380
    check-cast v0, Landroid/view/View;

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_14
    move-object v0, v6

    .line 384
    :goto_a
    if-nez v0, :cond_17

    .line 385
    .line 386
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 387
    .line 388
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v3, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    instance-of v0, p1, Landroid/view/View;

    .line 396
    .line 397
    if-eqz v0, :cond_15

    .line 398
    .line 399
    move-object v6, p1

    .line 400
    check-cast v6, Landroid/view/View;

    .line 401
    .line 402
    :cond_15
    if-nez v6, :cond_16

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_16
    move-object v0, v6

    .line 406
    :cond_17
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 407
    .line 408
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    sget-boolean v1, Lz0/i;->a:Z

    .line 412
    .line 413
    invoke-static {}, Lz0/g;->z()Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_18

    .line 418
    .line 419
    invoke-virtual {p1, v0}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 420
    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_18
    invoke-static {p1, v0}, Lr0/d0;->h(Lr0/d0;Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    :goto_b
    return-void

    .line 427
    :pswitch_5
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 431
    .line 432
    instance-of v1, p1, Landroid/app/Activity;

    .line 433
    .line 434
    if-eqz v1, :cond_19

    .line 435
    .line 436
    move-object v6, p1

    .line 437
    check-cast v6, Landroid/app/Activity;

    .line 438
    .line 439
    :cond_19
    if-eqz v6, :cond_1a

    .line 440
    .line 441
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 442
    .line 443
    invoke-direct {p1, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    if-eqz v1, :cond_1a

    .line 456
    .line 457
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    if-eqz v1, :cond_1a

    .line 462
    .line 463
    new-instance v2, Lr0/J;

    .line 464
    .line 465
    invoke-direct {v2, p1, v0}, Lr0/J;-><init>(Lr0/d0;I)V

    .line 466
    .line 467
    .line 468
    const-wide/16 v3, 0x60

    .line 469
    .line 470
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 471
    .line 472
    .line 473
    :cond_1a
    return-void

    .line 474
    :pswitch_6
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 478
    .line 479
    instance-of v0, p1, Landroid/widget/PopupWindow;

    .line 480
    .line 481
    if-eqz v0, :cond_1b

    .line 482
    .line 483
    check-cast p1, Landroid/widget/PopupWindow;

    .line 484
    .line 485
    goto :goto_c

    .line 486
    :cond_1b
    move-object p1, v6

    .line 487
    :goto_c
    if-nez p1, :cond_1c

    .line 488
    .line 489
    goto :goto_d

    .line 490
    :cond_1c
    const-string v0, "showAtLocationToken-after"

    .line 491
    .line 492
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 493
    .line 494
    invoke-static {v1, p1, v6, v0}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    :goto_d
    return-void

    .line 498
    :pswitch_7
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 502
    .line 503
    instance-of v1, v0, Landroid/widget/PopupWindow;

    .line 504
    .line 505
    if-eqz v1, :cond_1d

    .line 506
    .line 507
    check-cast v0, Landroid/widget/PopupWindow;

    .line 508
    .line 509
    goto :goto_e

    .line 510
    :cond_1d
    move-object v0, v6

    .line 511
    :goto_e
    if-nez v0, :cond_1e

    .line 512
    .line 513
    goto :goto_f

    .line 514
    :cond_1e
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 515
    .line 516
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    instance-of v1, p1, Landroid/view/View;

    .line 524
    .line 525
    if-eqz v1, :cond_1f

    .line 526
    .line 527
    move-object v6, p1

    .line 528
    check-cast v6, Landroid/view/View;

    .line 529
    .line 530
    :cond_1f
    const-string p1, "showAtLocationView-after"

    .line 531
    .line 532
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 533
    .line 534
    invoke-static {v1, v0, v6, p1}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :goto_f
    return-void

    .line 538
    :pswitch_8
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 542
    .line 543
    instance-of v1, v0, Landroid/widget/PopupWindow;

    .line 544
    .line 545
    if-eqz v1, :cond_20

    .line 546
    .line 547
    check-cast v0, Landroid/widget/PopupWindow;

    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_20
    move-object v0, v6

    .line 551
    :goto_10
    if-nez v0, :cond_21

    .line 552
    .line 553
    goto :goto_11

    .line 554
    :cond_21
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 555
    .line 556
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    instance-of v1, p1, Landroid/view/View;

    .line 564
    .line 565
    if-eqz v1, :cond_22

    .line 566
    .line 567
    move-object v6, p1

    .line 568
    check-cast v6, Landroid/view/View;

    .line 569
    .line 570
    :cond_22
    const-string p1, "showAsDropDownGravity-after"

    .line 571
    .line 572
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 573
    .line 574
    invoke-static {v1, v0, v6, p1}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    :goto_11
    return-void

    .line 578
    :pswitch_9
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 582
    .line 583
    instance-of v1, v0, Landroid/widget/PopupWindow;

    .line 584
    .line 585
    if-eqz v1, :cond_23

    .line 586
    .line 587
    check-cast v0, Landroid/widget/PopupWindow;

    .line 588
    .line 589
    goto :goto_12

    .line 590
    :cond_23
    move-object v0, v6

    .line 591
    :goto_12
    if-nez v0, :cond_24

    .line 592
    .line 593
    goto :goto_13

    .line 594
    :cond_24
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 595
    .line 596
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    instance-of v1, p1, Landroid/view/View;

    .line 604
    .line 605
    if-eqz v1, :cond_25

    .line 606
    .line 607
    move-object v6, p1

    .line 608
    check-cast v6, Landroid/view/View;

    .line 609
    .line 610
    :cond_25
    const-string p1, "showAsDropDownXY-after"

    .line 611
    .line 612
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 613
    .line 614
    invoke-static {v1, v0, v6, p1}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    :goto_13
    return-void

    .line 618
    :pswitch_a
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 622
    .line 623
    instance-of v1, v0, Landroid/widget/PopupWindow;

    .line 624
    .line 625
    if-eqz v1, :cond_26

    .line 626
    .line 627
    check-cast v0, Landroid/widget/PopupWindow;

    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_26
    move-object v0, v6

    .line 631
    :goto_14
    if-nez v0, :cond_27

    .line 632
    .line 633
    goto :goto_15

    .line 634
    :cond_27
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 635
    .line 636
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    instance-of v1, p1, Landroid/view/View;

    .line 644
    .line 645
    if-eqz v1, :cond_28

    .line 646
    .line 647
    move-object v6, p1

    .line 648
    check-cast v6, Landroid/view/View;

    .line 649
    .line 650
    :cond_28
    const-string p1, "showAsDropDown-after"

    .line 651
    .line 652
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 653
    .line 654
    invoke-static {v1, v0, v6, p1}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    :goto_15
    return-void

    .line 658
    :pswitch_b
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 662
    .line 663
    instance-of v1, v0, Landroid/widget/PopupWindow;

    .line 664
    .line 665
    if-eqz v1, :cond_29

    .line 666
    .line 667
    check-cast v0, Landroid/widget/PopupWindow;

    .line 668
    .line 669
    move-object v8, v0

    .line 670
    goto :goto_16

    .line 671
    :cond_29
    move-object v8, v6

    .line 672
    :goto_16
    if-nez v8, :cond_2a

    .line 673
    .line 674
    goto/16 :goto_1b

    .line 675
    .line 676
    :cond_2a
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static {p1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-static {v5, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    instance-of v0, p1, Landroid/view/View;

    .line 686
    .line 687
    if-eqz v0, :cond_2b

    .line 688
    .line 689
    check-cast p1, Landroid/view/View;

    .line 690
    .line 691
    move-object v9, p1

    .line 692
    goto :goto_17

    .line 693
    :cond_2b
    move-object v9, v6

    .line 694
    :goto_17
    if-nez v9, :cond_2c

    .line 695
    .line 696
    goto :goto_1b

    .line 697
    :cond_2c
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 698
    .line 699
    iget-object p1, p1, Lr0/d0;->L:Ljava/lang/String;

    .line 700
    .line 701
    if-eqz p1, :cond_32

    .line 702
    .line 703
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 704
    .line 705
    .line 706
    move-result-object p1

    .line 707
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    if-eqz p1, :cond_32

    .line 712
    .line 713
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-nez v0, :cond_2d

    .line 718
    .line 719
    move-object v10, p1

    .line 720
    goto :goto_18

    .line 721
    :cond_2d
    move-object v10, v6

    .line 722
    :goto_18
    if-nez v10, :cond_2e

    .line 723
    .line 724
    goto :goto_1b

    .line 725
    :cond_2e
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 726
    .line 727
    iget-object p1, p1, Lr0/d0;->M:Ljava/lang/String;

    .line 728
    .line 729
    if-eqz p1, :cond_31

    .line 730
    .line 731
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    if-eqz p1, :cond_31

    .line 740
    .line 741
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-nez v0, :cond_2f

    .line 746
    .line 747
    move-object v6, p1

    .line 748
    :cond_2f
    if-nez v6, :cond_30

    .line 749
    .line 750
    goto :goto_19

    .line 751
    :cond_30
    move-object v11, v6

    .line 752
    goto :goto_1a

    .line 753
    :cond_31
    :goto_19
    move-object v11, v10

    .line 754
    :goto_1a
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 755
    .line 756
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 760
    .line 761
    .line 762
    move-result-wide v0

    .line 763
    iget-wide v2, p1, Lr0/d0;->C:J

    .line 764
    .line 765
    cmp-long p1, v0, v2

    .line 766
    .line 767
    if-gtz p1, :cond_32

    .line 768
    .line 769
    iget-object v7, p0, Lr0/V;->b:Lr0/d0;

    .line 770
    .line 771
    const-string v12, "setContentView-after"

    .line 772
    .line 773
    const/4 v13, 0x0

    .line 774
    invoke-virtual/range {v7 .. v13}, Lr0/d0;->b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z

    .line 775
    .line 776
    .line 777
    :cond_32
    :goto_1b
    return-void

    .line 778
    :pswitch_c
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 782
    .line 783
    instance-of v0, p1, Landroid/view/View;

    .line 784
    .line 785
    if-eqz v0, :cond_33

    .line 786
    .line 787
    move-object v6, p1

    .line 788
    check-cast v6, Landroid/view/View;

    .line 789
    .line 790
    :cond_33
    if-eqz v6, :cond_34

    .line 791
    .line 792
    new-instance p1, Lr0/H;

    .line 793
    .line 794
    iget-object v0, p0, Lr0/V;->b:Lr0/d0;

    .line 795
    .line 796
    const/4 v1, 0x3

    .line 797
    invoke-direct {p1, v0, v6, v1}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v6, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 801
    .line 802
    .line 803
    :cond_34
    return-void

    .line 804
    :pswitch_d
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 808
    .line 809
    instance-of v1, p1, Landroid/view/View;

    .line 810
    .line 811
    if-eqz v1, :cond_35

    .line 812
    .line 813
    move-object v6, p1

    .line 814
    check-cast v6, Landroid/view/View;

    .line 815
    .line 816
    :cond_35
    if-eqz v6, :cond_36

    .line 817
    .line 818
    new-instance p1, Lr0/H;

    .line 819
    .line 820
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 821
    .line 822
    invoke-direct {p1, v1, v6, v0}, Lr0/H;-><init>(Lr0/d0;Landroid/view/View;I)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v6, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 826
    .line 827
    .line 828
    :cond_36
    return-void

    .line 829
    :pswitch_e
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 833
    .line 834
    iget-boolean v0, p1, Lr0/d0;->O:Z

    .line 835
    .line 836
    if-eqz v0, :cond_37

    .line 837
    .line 838
    goto :goto_1c

    .line 839
    :cond_37
    iput-object v6, p1, Lr0/d0;->L:Ljava/lang/String;

    .line 840
    .line 841
    iput-object v6, p1, Lr0/d0;->M:Ljava/lang/String;

    .line 842
    .line 843
    const-wide/16 v0, 0x0

    .line 844
    .line 845
    iput-wide v0, p1, Lr0/d0;->N:J

    .line 846
    .line 847
    iput-boolean v5, p1, Lr0/d0;->O:Z

    .line 848
    .line 849
    iput-object v6, p1, Lr0/d0;->P:Ljava/lang/ref/WeakReference;

    .line 850
    .line 851
    iget-object p1, p1, Lr0/d0;->I:Ljava/util/WeakHashMap;

    .line 852
    .line 853
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->clear()V

    .line 854
    .line 855
    .line 856
    :goto_1c
    return-void

    .line 857
    :pswitch_f
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    sget-boolean v0, Lz0/i;->a:Z

    .line 861
    .line 862
    invoke-static {}, Lz0/g;->F()Z

    .line 863
    .line 864
    .line 865
    move-result v0

    .line 866
    if-nez v0, :cond_38

    .line 867
    .line 868
    goto/16 :goto_25

    .line 869
    .line 870
    :cond_38
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    instance-of v1, v0, Landroid/view/View;

    .line 875
    .line 876
    if-eqz v1, :cond_39

    .line 877
    .line 878
    check-cast v0, Landroid/view/View;

    .line 879
    .line 880
    goto :goto_1d

    .line 881
    :cond_39
    move-object v0, v6

    .line 882
    :goto_1d
    if-nez v0, :cond_3a

    .line 883
    .line 884
    goto/16 :goto_25

    .line 885
    .line 886
    :cond_3a
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-static {v0}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    if-nez v1, :cond_3b

    .line 896
    .line 897
    goto/16 :goto_25

    .line 898
    .line 899
    :cond_3b
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 900
    .line 901
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 902
    .line 903
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    const-string v1, "d"

    .line 907
    .line 908
    invoke-static {v2, v1}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    if-nez v1, :cond_3e

    .line 913
    .line 914
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 915
    .line 916
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 917
    .line 918
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    const-string v1, "f270194d"

    .line 922
    .line 923
    invoke-static {v2, v1}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    if-nez v1, :cond_3e

    .line 928
    .line 929
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 930
    .line 931
    invoke-virtual {v1}, Lr0/d0;->J()[Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    iget-object v2, p0, Lr0/V;->b:Lr0/d0;

    .line 936
    .line 937
    array-length v4, v1

    .line 938
    :goto_1e
    if-ge v5, v4, :cond_3d

    .line 939
    .line 940
    aget-object v7, v1, v5

    .line 941
    .line 942
    iget-object v8, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 943
    .line 944
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    invoke-static {v8, v7}, Lr0/d0;->E(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    if-nez v7, :cond_3c

    .line 952
    .line 953
    add-int/2addr v5, v3

    .line 954
    goto :goto_1e

    .line 955
    :cond_3c
    move-object v1, v7

    .line 956
    goto :goto_1f

    .line 957
    :cond_3d
    move-object v1, v6

    .line 958
    :goto_1f
    if-nez v1, :cond_3e

    .line 959
    .line 960
    goto/16 :goto_25

    .line 961
    .line 962
    :cond_3e
    move-object v11, v1

    .line 963
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 964
    .line 965
    invoke-virtual {p1, v11}, Lr0/d0;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object p1

    .line 969
    invoke-static {p1}, Lr0/d0;->N(Ljava/lang/Object;)Ljava/util/List;

    .line 970
    .line 971
    .line 972
    move-result-object p1

    .line 973
    new-instance v1, Ljava/util/ArrayList;

    .line 974
    .line 975
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 976
    .line 977
    .line 978
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 979
    .line 980
    .line 981
    move-result-object p1

    .line 982
    :cond_3f
    :goto_20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-eqz v2, :cond_40

    .line 987
    .line 988
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 993
    .line 994
    if-eqz v3, :cond_3f

    .line 995
    .line 996
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    goto :goto_20

    .line 1000
    :cond_40
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1001
    .line 1002
    .line 1003
    move-result-object p1

    .line 1004
    :cond_41
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v1

    .line 1008
    if-eqz v1, :cond_42

    .line 1009
    .line 1010
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    move-object v2, v1

    .line 1015
    check-cast v2, Landroid/view/MenuItem;

    .line 1016
    .line 1017
    invoke-static {v2}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    if-eqz v2, :cond_41

    .line 1022
    .line 1023
    move-object v6, v1

    .line 1024
    :cond_42
    check-cast v6, Landroid/view/MenuItem;

    .line 1025
    .line 1026
    if-nez v6, :cond_43

    .line 1027
    .line 1028
    goto :goto_25

    .line 1029
    :cond_43
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 1030
    .line 1031
    iget-object p1, p1, Lr0/d0;->F:Ljava/util/WeakHashMap;

    .line 1032
    .line 1033
    invoke-virtual {p1, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p1

    .line 1037
    check-cast p1, LE0/c;

    .line 1038
    .line 1039
    if-eqz p1, :cond_45

    .line 1040
    .line 1041
    iget-object v1, p1, LE0/c;->a:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v1, Ljava/lang/String;

    .line 1044
    .line 1045
    if-nez v1, :cond_44

    .line 1046
    .line 1047
    goto :goto_21

    .line 1048
    :cond_44
    move-object v9, v1

    .line 1049
    goto :goto_22

    .line 1050
    :cond_45
    :goto_21
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 1051
    .line 1052
    iget-object v1, v1, Lr0/d0;->L:Ljava/lang/String;

    .line 1053
    .line 1054
    if-nez v1, :cond_44

    .line 1055
    .line 1056
    goto :goto_25

    .line 1057
    :goto_22
    if-eqz p1, :cond_47

    .line 1058
    .line 1059
    iget-object p1, p1, LE0/c;->b:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast p1, Ljava/lang/String;

    .line 1062
    .line 1063
    if-nez p1, :cond_46

    .line 1064
    .line 1065
    goto :goto_23

    .line 1066
    :cond_46
    move-object v10, p1

    .line 1067
    goto :goto_24

    .line 1068
    :cond_47
    :goto_23
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 1069
    .line 1070
    iget-object p1, p1, Lr0/d0;->M:Ljava/lang/String;

    .line 1071
    .line 1072
    if-nez p1, :cond_46

    .line 1073
    .line 1074
    move-object v10, v9

    .line 1075
    :goto_24
    iget-object v8, p0, Lr0/V;->b:Lr0/d0;

    .line 1076
    .line 1077
    new-instance v7, Lr0/Y;

    .line 1078
    .line 1079
    const/4 v12, 0x0

    .line 1080
    invoke-direct/range {v7 .. v12}, Lr0/Y;-><init>(Lr0/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1084
    .line 1085
    .line 1086
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 1087
    .line 1088
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v0}, Lr0/d0;->w(Landroid/view/View;)Landroid/widget/TextView;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p1

    .line 1095
    if-eqz p1, :cond_48

    .line 1096
    .line 1097
    iget-object v8, p0, Lr0/V;->b:Lr0/d0;

    .line 1098
    .line 1099
    new-instance v7, Lr0/Y;

    .line 1100
    .line 1101
    const/4 v12, 0x1

    .line 1102
    invoke-direct/range {v7 .. v12}, Lr0/Y;-><init>(Lr0/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {p1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1106
    .line 1107
    .line 1108
    :cond_48
    :goto_25
    return-void

    .line 1109
    :pswitch_10
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1113
    .line 1114
    iget-object v1, p0, Lr0/V;->b:Lr0/d0;

    .line 1115
    .line 1116
    invoke-static {v1, v0}, Lr0/d0;->j(Lr0/d0;Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    if-nez v0, :cond_49

    .line 1121
    .line 1122
    goto/16 :goto_2b

    .line 1123
    .line 1124
    :cond_49
    invoke-virtual {v1}, Lr0/d0;->F()Ljava/util/Set;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    instance-of v3, v2, Ljava/util/List;

    .line 1133
    .line 1134
    if-eqz v3, :cond_4a

    .line 1135
    .line 1136
    check-cast v2, Ljava/util/List;

    .line 1137
    .line 1138
    goto :goto_26

    .line 1139
    :cond_4a
    move-object v2, v6

    .line 1140
    :goto_26
    if-nez v2, :cond_4b

    .line 1141
    .line 1142
    goto :goto_2b

    .line 1143
    :cond_4b
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v3

    .line 1147
    if-eqz v3, :cond_4c

    .line 1148
    .line 1149
    goto :goto_2b

    .line 1150
    :cond_4c
    const-string v3, "result"

    .line 1151
    .line 1152
    invoke-static {v1, v3, v2, v0}, Lr0/d0;->e(Lr0/d0;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-static {v1, v2, v0}, Lr0/d0;->b(Lr0/d0;Ljava/util/List;Ljava/util/Set;)Ljava/util/ArrayList;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1164
    .line 1165
    .line 1166
    move-result v2

    .line 1167
    if-ne v3, v2, :cond_4d

    .line 1168
    .line 1169
    goto :goto_2b

    .line 1170
    :cond_4d
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1171
    .line 1172
    .line 1173
    iget-object p1, v1, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 1174
    .line 1175
    if-eqz p1, :cond_4e

    .line 1176
    .line 1177
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object p1

    .line 1181
    goto :goto_27

    .line 1182
    :cond_4e
    move-object p1, v6

    .line 1183
    :goto_27
    iget-object v0, v1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 1184
    .line 1185
    if-eqz v0, :cond_4f

    .line 1186
    .line 1187
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    check-cast v0, Landroid/widget/ListView;

    .line 1192
    .line 1193
    move-object v2, v0

    .line 1194
    goto :goto_28

    .line 1195
    :cond_4f
    move-object v2, v6

    .line 1196
    :goto_28
    if-eqz p1, :cond_51

    .line 1197
    .line 1198
    :try_start_0
    invoke-static {p1}, Lr0/d0;->z(Ljava/lang/Object;)Landroid/view/View;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1202
    goto :goto_29

    .line 1203
    :catchall_0
    move-exception v0

    .line 1204
    new-instance v3, LE0/d;

    .line 1205
    .line 1206
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1207
    .line 1208
    .line 1209
    move-object v0, v3

    .line 1210
    :goto_29
    nop

    .line 1211
    instance-of v3, v0, LE0/d;

    .line 1212
    .line 1213
    if-eqz v3, :cond_50

    .line 1214
    .line 1215
    goto :goto_2a

    .line 1216
    :cond_50
    move-object v6, v0

    .line 1217
    :goto_2a
    check-cast v6, Landroid/view/View;

    .line 1218
    .line 1219
    :cond_51
    invoke-virtual {v1, p1, v2, v6}, Lr0/d0;->X0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 1220
    .line 1221
    .line 1222
    :goto_2b
    return-void

    .line 1223
    :pswitch_11
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v0, p0, Lr0/V;->b:Lr0/d0;

    .line 1227
    .line 1228
    iget-boolean v1, v0, Lr0/d0;->o:Z

    .line 1229
    .line 1230
    if-eqz v1, :cond_52

    .line 1231
    .line 1232
    goto :goto_2c

    .line 1233
    :cond_52
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1234
    .line 1235
    invoke-virtual {v0, p1}, Lr0/d0;->L0(Ljava/lang/Object;)V

    .line 1236
    .line 1237
    .line 1238
    :goto_2c
    return-void

    .line 1239
    :pswitch_12
    invoke-static {p1, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1243
    .line 1244
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-static {v5, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    if-nez v0, :cond_53

    .line 1252
    .line 1253
    goto/16 :goto_2d

    .line 1254
    .line 1255
    :cond_53
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1256
    .line 1257
    instance-of v2, p1, Landroid/widget/ListView;

    .line 1258
    .line 1259
    if-eqz v2, :cond_54

    .line 1260
    .line 1261
    move-object v6, p1

    .line 1262
    check-cast v6, Landroid/widget/ListView;

    .line 1263
    .line 1264
    :cond_54
    if-nez v6, :cond_55

    .line 1265
    .line 1266
    goto/16 :goto_2d

    .line 1267
    .line 1268
    :cond_55
    iget-object p1, p0, Lr0/V;->b:Lr0/d0;

    .line 1269
    .line 1270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1271
    .line 1272
    .line 1273
    invoke-static {v6, v0}, Lr0/d0;->n0(Landroid/widget/ListView;Ljava/lang/Object;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v2

    .line 1277
    if-eqz v2, :cond_56

    .line 1278
    .line 1279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v1

    .line 1283
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v1

    .line 1287
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v2

    .line 1291
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    const-string v3, "hide contact bind adapter"

    .line 1296
    .line 1297
    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v1

    .line 1301
    invoke-static {v1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 1305
    .line 1306
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    iput-object v1, p1, Lr0/d0;->d:Ljava/lang/ref/WeakReference;

    .line 1310
    .line 1311
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 1312
    .line 1313
    invoke-direct {v1, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1314
    .line 1315
    .line 1316
    iput-object v1, p1, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 1317
    .line 1318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {p1, v0}, Lr0/d0;->g0(Ljava/lang/Class;)V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_2d

    .line 1326
    :cond_56
    invoke-static {v6}, Lr0/d0;->v0(Landroid/widget/ListView;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-eqz v2, :cond_59

    .line 1331
    .line 1332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v3

    .line 1344
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    const-string v4, "hide contact bind search adapter"

    .line 1349
    .line 1350
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v2

    .line 1354
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 1358
    .line 1359
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1360
    .line 1361
    .line 1362
    iput-object v2, p1, Lr0/d0;->f:Ljava/lang/ref/WeakReference;

    .line 1363
    .line 1364
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 1365
    .line 1366
    invoke-direct {v2, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    iput-object v2, p1, Lr0/d0;->e:Ljava/lang/ref/WeakReference;

    .line 1370
    .line 1371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    const-class v2, Landroid/view/ViewGroup;

    .line 1376
    .line 1377
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1378
    .line 1379
    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v1

    .line 1383
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 1384
    .line 1385
    const-string v3, "getView"

    .line 1386
    .line 1387
    invoke-interface {v2, v0, v3, v1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    if-nez v0, :cond_57

    .line 1392
    .line 1393
    goto :goto_2d

    .line 1394
    :cond_57
    const-string v1, "hide-contact-search-view-"

    .line 1395
    .line 1396
    invoke-static {v1, v0}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v1

    .line 1400
    sget-object v2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1401
    .line 1402
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1403
    .line 1404
    .line 1405
    move-result v2

    .line 1406
    if-eqz v2, :cond_58

    .line 1407
    .line 1408
    goto :goto_2d

    .line 1409
    :cond_58
    new-instance v2, Lr0/V;

    .line 1410
    .line 1411
    const/16 v3, 0x18

    .line 1412
    .line 1413
    invoke-direct {v2, p1, v3}, Lr0/V;-><init>(Lr0/d0;I)V

    .line 1414
    .line 1415
    .line 1416
    invoke-static {v0, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1417
    .line 1418
    .line 1419
    sget-object p1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1420
    .line 1421
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1422
    .line 1423
    .line 1424
    :cond_59
    :goto_2d
    return-void

    .line 1425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    const-string v1, "HideContactFriendPluginPart"

    .line 6
    .line 7
    const-string v2, "thisObject"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const-string v4, "args"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const-string v8, "param"

    .line 15
    .line 16
    iget v9, v0, Lr0/V;->a:I

    .line 17
    .line 18
    packed-switch v9, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    :pswitch_0
    return-void

    .line 22
    :pswitch_1
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v2, v1, Landroid/widget/PopupWindow;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/widget/PopupWindow;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v7

    .line 35
    :goto_0
    if-nez v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string v2, "showAtLocationToken-before"

    .line 39
    .line 40
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 41
    .line 42
    invoke-static {v3, v1, v7, v2}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    return-void

    .line 46
    :pswitch_2
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 50
    .line 51
    instance-of v2, v1, Landroid/widget/PopupWindow;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    check-cast v1, Landroid/widget/PopupWindow;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object v1, v7

    .line 59
    :goto_2
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    instance-of v3, v2, Landroid/view/View;

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    move-object v7, v2

    .line 76
    check-cast v7, Landroid/view/View;

    .line 77
    .line 78
    :cond_4
    const-string v2, "showAtLocationView-before"

    .line 79
    .line 80
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 81
    .line 82
    invoke-static {v3, v1, v7, v2}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_3
    return-void

    .line 86
    :pswitch_3
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 90
    .line 91
    instance-of v2, v1, Landroid/widget/PopupWindow;

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    check-cast v1, Landroid/widget/PopupWindow;

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    move-object v1, v7

    .line 99
    :goto_4
    if-nez v1, :cond_6

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_6
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    instance-of v3, v2, Landroid/view/View;

    .line 112
    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    move-object v7, v2

    .line 116
    check-cast v7, Landroid/view/View;

    .line 117
    .line 118
    :cond_7
    const-string v2, "showAsDropDownGravity-before"

    .line 119
    .line 120
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 121
    .line 122
    invoke-static {v3, v1, v7, v2}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_5
    return-void

    .line 126
    :pswitch_4
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 130
    .line 131
    instance-of v2, v1, Landroid/widget/PopupWindow;

    .line 132
    .line 133
    if-eqz v2, :cond_8

    .line 134
    .line 135
    check-cast v1, Landroid/widget/PopupWindow;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_8
    move-object v1, v7

    .line 139
    :goto_6
    if-nez v1, :cond_9

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_9
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    instance-of v3, v2, Landroid/view/View;

    .line 152
    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    move-object v7, v2

    .line 156
    check-cast v7, Landroid/view/View;

    .line 157
    .line 158
    :cond_a
    const-string v2, "showAsDropDownXY-before"

    .line 159
    .line 160
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 161
    .line 162
    invoke-static {v3, v1, v7, v2}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_7
    return-void

    .line 166
    :pswitch_5
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 170
    .line 171
    instance-of v2, v1, Landroid/widget/PopupWindow;

    .line 172
    .line 173
    if-eqz v2, :cond_b

    .line 174
    .line 175
    check-cast v1, Landroid/widget/PopupWindow;

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_b
    move-object v1, v7

    .line 179
    :goto_8
    if-nez v1, :cond_c

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_c
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    instance-of v3, v2, Landroid/view/View;

    .line 192
    .line 193
    if-eqz v3, :cond_d

    .line 194
    .line 195
    move-object v7, v2

    .line 196
    check-cast v7, Landroid/view/View;

    .line 197
    .line 198
    :cond_d
    const-string v2, "showAsDropDown-before"

    .line 199
    .line 200
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 201
    .line 202
    invoke-static {v3, v1, v7, v2}, Lr0/d0;->d(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_9
    return-void

    .line 206
    :pswitch_6
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 210
    .line 211
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    instance-of v4, v2, Landroid/view/View$OnLongClickListener;

    .line 219
    .line 220
    if-eqz v4, :cond_e

    .line 221
    .line 222
    check-cast v2, Landroid/view/View$OnLongClickListener;

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_e
    move-object v2, v7

    .line 226
    :goto_a
    if-nez v2, :cond_f

    .line 227
    .line 228
    goto/16 :goto_d

    .line 229
    .line 230
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-static {v4, v1, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_10

    .line 243
    .line 244
    goto/16 :goto_d

    .line 245
    .line 246
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const-string v4, "HideMainUIListPluginPart"

    .line 255
    .line 256
    invoke-static {v1, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_11

    .line 261
    .line 262
    goto :goto_d

    .line 263
    :cond_11
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 264
    .line 265
    instance-of v4, v1, Landroid/view/View;

    .line 266
    .line 267
    if-eqz v4, :cond_12

    .line 268
    .line 269
    check-cast v1, Landroid/view/View;

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_12
    move-object v1, v7

    .line 273
    :goto_b
    if-nez v1, :cond_13

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_13
    iget-object v4, v0, Lr0/V;->b:Lr0/d0;

    .line 277
    .line 278
    invoke-virtual {v4, v1}, Lr0/d0;->t0(Landroid/view/View;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-eqz v8, :cond_14

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_14
    invoke-virtual {v4}, Lr0/d0;->x0()Z

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-nez v8, :cond_15

    .line 290
    .line 291
    move v3, v6

    .line 292
    goto :goto_c

    .line 293
    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    const-string v9, "po5."

    .line 302
    .line 303
    invoke-static {v8, v6, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_16

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_16
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-eqz v1, :cond_17

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    :cond_17
    if-nez v7, :cond_18

    .line 325
    .line 326
    const-string v7, ""

    .line 327
    .line 328
    :cond_18
    invoke-static {v7}, Lr0/d0;->q0(Ljava/lang/String;)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    :goto_c
    if-nez v3, :cond_19

    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_19
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 336
    .line 337
    new-instance v3, Lr0/b0;

    .line 338
    .line 339
    invoke-direct {v3, v2, v4, v6}, Lr0/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 340
    .line 341
    .line 342
    aput-object v3, v1, v6

    .line 343
    .line 344
    :goto_d
    return-void

    .line 345
    :pswitch_7
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 349
    .line 350
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const/4 v8, 0x3

    .line 354
    invoke-static {v8, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    instance-of v2, v1, Landroid/view/View$OnCreateContextMenuListener;

    .line 359
    .line 360
    if-eqz v2, :cond_1a

    .line 361
    .line 362
    check-cast v1, Landroid/view/View$OnCreateContextMenuListener;

    .line 363
    .line 364
    move-object v2, v1

    .line 365
    goto :goto_e

    .line 366
    :cond_1a
    move-object v2, v7

    .line 367
    :goto_e
    if-nez v2, :cond_1b

    .line 368
    .line 369
    goto :goto_11

    .line 370
    :cond_1b
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 371
    .line 372
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    const/4 v9, 0x4

    .line 376
    invoke-static {v9, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    iget-object v9, v0, Lr0/V;->b:Lr0/d0;

    .line 381
    .line 382
    if-eqz v1, :cond_1c

    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v9, v1}, Lr0/d0;->k0(Ljava/lang/Class;)V

    .line 389
    .line 390
    .line 391
    :cond_1c
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 392
    .line 393
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v6, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    instance-of v10, v1, Landroid/view/View;

    .line 401
    .line 402
    if-eqz v10, :cond_1d

    .line 403
    .line 404
    check-cast v1, Landroid/view/View;

    .line 405
    .line 406
    goto :goto_f

    .line 407
    :cond_1d
    move-object v1, v7

    .line 408
    :goto_f
    if-nez v1, :cond_1e

    .line 409
    .line 410
    goto :goto_11

    .line 411
    :cond_1e
    iget-object v10, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 412
    .line 413
    invoke-static {v10, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v3, v10}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    instance-of v4, v3, Ljava/lang/Integer;

    .line 421
    .line 422
    if-eqz v4, :cond_1f

    .line 423
    .line 424
    move-object v7, v3

    .line 425
    check-cast v7, Ljava/lang/Integer;

    .line 426
    .line 427
    :cond_1f
    if-eqz v7, :cond_20

    .line 428
    .line 429
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    goto :goto_10

    .line 434
    :cond_20
    const/4 v3, -0x1

    .line 435
    :goto_10
    invoke-virtual {v9, v1, v3, v2, v6}, Lr0/d0;->S0(Landroid/view/View;ILjava/lang/Object;Z)LE0/c;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    if-nez v4, :cond_21

    .line 440
    .line 441
    goto :goto_11

    .line 442
    :cond_21
    iget-object v7, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 443
    .line 444
    new-instance v1, Lr0/Z;

    .line 445
    .line 446
    const/4 v6, 0x0

    .line 447
    move-object v3, v9

    .line 448
    invoke-direct/range {v1 .. v6}, Lr0/Z;-><init>(Landroid/view/View$OnCreateContextMenuListener;Le0/a;Ljava/io/Serializable;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V

    .line 449
    .line 450
    .line 451
    aput-object v1, v7, v8

    .line 452
    .line 453
    :goto_11
    return-void

    .line 454
    :pswitch_8
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    sget-boolean v1, Lz0/i;->a:Z

    .line 458
    .line 459
    invoke-static {}, Lz0/g;->F()Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-nez v1, :cond_22

    .line 464
    .line 465
    goto/16 :goto_16

    .line 466
    .line 467
    :cond_22
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 468
    .line 469
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 470
    .line 471
    if-nez v2, :cond_24

    .line 472
    .line 473
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    :cond_23
    move-object v2, v7

    .line 477
    goto :goto_13

    .line 478
    :cond_24
    invoke-virtual {v1}, Lr0/d0;->J()[Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-static {v8, v9}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v8

    .line 494
    if-eqz v8, :cond_25

    .line 495
    .line 496
    goto :goto_13

    .line 497
    :cond_25
    const-string v8, "d"

    .line 498
    .line 499
    invoke-static {v2, v8}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    if-nez v8, :cond_27

    .line 504
    .line 505
    const-string v8, "f270194d"

    .line 506
    .line 507
    invoke-static {v2, v8}, Lr0/d0;->S(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    if-nez v8, :cond_27

    .line 512
    .line 513
    invoke-virtual {v1}, Lr0/d0;->J()[Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    array-length v8, v1

    .line 518
    :goto_12
    if-ge v6, v8, :cond_23

    .line 519
    .line 520
    aget-object v9, v1, v6

    .line 521
    .line 522
    invoke-static {v2, v9}, Lr0/d0;->E(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    if-nez v9, :cond_26

    .line 527
    .line 528
    add-int/2addr v6, v3

    .line 529
    goto :goto_12

    .line 530
    :cond_26
    move-object v2, v9

    .line 531
    goto :goto_13

    .line 532
    :cond_27
    move-object v2, v8

    .line 533
    :goto_13
    if-nez v2, :cond_28

    .line 534
    .line 535
    goto/16 :goto_16

    .line 536
    .line 537
    :cond_28
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 538
    .line 539
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    const/4 v4, 0x2

    .line 543
    invoke-static {v4, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    instance-of v4, v1, Ljava/lang/Integer;

    .line 548
    .line 549
    if-eqz v4, :cond_29

    .line 550
    .line 551
    check-cast v1, Ljava/lang/Integer;

    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_29
    move-object v1, v7

    .line 555
    :goto_14
    if-eqz v1, :cond_33

    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    iget-object v4, v0, Lr0/V;->b:Lr0/d0;

    .line 562
    .line 563
    if-gez v1, :cond_2a

    .line 564
    .line 565
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    move-object v6, v7

    .line 569
    goto :goto_15

    .line 570
    :cond_2a
    invoke-virtual {v4, v1, v2}, Lr0/d0;->M(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    if-eqz v6, :cond_2b

    .line 575
    .line 576
    invoke-static {v6}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    if-eqz v8, :cond_2b

    .line 581
    .line 582
    goto :goto_15

    .line 583
    :cond_2b
    if-lez v1, :cond_2c

    .line 584
    .line 585
    add-int/lit8 v3, v1, -0x1

    .line 586
    .line 587
    invoke-virtual {v4, v3, v2}, Lr0/d0;->M(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    if-eqz v6, :cond_2c

    .line 592
    .line 593
    invoke-static {v6}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    if-eqz v3, :cond_2c

    .line 598
    .line 599
    goto :goto_15

    .line 600
    :cond_2c
    invoke-virtual {v4, v1, v2}, Lr0/d0;->M(ILjava/lang/Object;)Landroid/view/MenuItem;

    .line 601
    .line 602
    .line 603
    move-result-object v6

    .line 604
    :goto_15
    if-nez v6, :cond_2d

    .line 605
    .line 606
    goto :goto_16

    .line 607
    :cond_2d
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    invoke-static {v6}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    if-nez v1, :cond_2e

    .line 617
    .line 618
    goto :goto_16

    .line 619
    :cond_2e
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 620
    .line 621
    iget-object v1, v1, Lr0/d0;->F:Ljava/util/WeakHashMap;

    .line 622
    .line 623
    invoke-virtual {v1, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    check-cast v1, LE0/c;

    .line 628
    .line 629
    if-eqz v1, :cond_2f

    .line 630
    .line 631
    iget-object v3, v1, LE0/c;->a:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v3, Ljava/lang/String;

    .line 634
    .line 635
    if-nez v3, :cond_30

    .line 636
    .line 637
    :cond_2f
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 638
    .line 639
    iget-object v3, v3, Lr0/d0;->L:Ljava/lang/String;

    .line 640
    .line 641
    if-nez v3, :cond_30

    .line 642
    .line 643
    goto :goto_16

    .line 644
    :cond_30
    if-eqz v1, :cond_31

    .line 645
    .line 646
    iget-object v1, v1, LE0/c;->b:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v1, Ljava/lang/String;

    .line 649
    .line 650
    if-nez v1, :cond_32

    .line 651
    .line 652
    :cond_31
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 653
    .line 654
    iget-object v1, v1, Lr0/d0;->M:Ljava/lang/String;

    .line 655
    .line 656
    if-nez v1, :cond_32

    .line 657
    .line 658
    move-object v1, v3

    .line 659
    :cond_32
    iget-object v4, v0, Lr0/V;->b:Lr0/d0;

    .line 660
    .line 661
    invoke-virtual {v4, v3, v1}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 665
    .line 666
    invoke-virtual {v1, v2}, Lr0/d0;->s(Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v5, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    :cond_33
    :goto_16
    return-void

    .line 673
    :pswitch_9
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-static {v6, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    instance-of v3, v2, Landroid/view/View$OnCreateContextMenuListener;

    .line 686
    .line 687
    if-eqz v3, :cond_34

    .line 688
    .line 689
    move-object v7, v2

    .line 690
    check-cast v7, Landroid/view/View$OnCreateContextMenuListener;

    .line 691
    .line 692
    :cond_34
    if-nez v7, :cond_35

    .line 693
    .line 694
    goto :goto_17

    .line 695
    :cond_35
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-static {v2, v1, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_36

    .line 708
    .line 709
    goto :goto_17

    .line 710
    :cond_36
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 711
    .line 712
    new-instance v2, Lr0/X;

    .line 713
    .line 714
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 715
    .line 716
    invoke-direct {v2, v7, v3}, Lr0/X;-><init>(Landroid/view/View$OnCreateContextMenuListener;Lr0/d0;)V

    .line 717
    .line 718
    .line 719
    aput-object v2, v1, v6

    .line 720
    .line 721
    :goto_17
    return-void

    .line 722
    :pswitch_a
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    sget-boolean v1, Lz0/i;->a:Z

    .line 726
    .line 727
    invoke-static {}, Lz0/g;->F()Z

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    if-nez v1, :cond_37

    .line 732
    .line 733
    goto :goto_19

    .line 734
    :cond_37
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 735
    .line 736
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v6, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    instance-of v2, v1, Landroid/view/MenuItem;

    .line 744
    .line 745
    if-eqz v2, :cond_38

    .line 746
    .line 747
    check-cast v1, Landroid/view/MenuItem;

    .line 748
    .line 749
    goto :goto_18

    .line 750
    :cond_38
    move-object v1, v7

    .line 751
    :goto_18
    if-nez v1, :cond_39

    .line 752
    .line 753
    goto :goto_19

    .line 754
    :cond_39
    iget-object v2, v0, Lr0/V;->b:Lr0/d0;

    .line 755
    .line 756
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-static {v1}, Lr0/d0;->s0(Landroid/view/MenuItem;)Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    if-nez v2, :cond_3a

    .line 764
    .line 765
    goto :goto_19

    .line 766
    :cond_3a
    iget-object v2, v0, Lr0/V;->b:Lr0/d0;

    .line 767
    .line 768
    iget-object v2, v2, Lr0/d0;->F:Ljava/util/WeakHashMap;

    .line 769
    .line 770
    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    check-cast v1, LE0/c;

    .line 775
    .line 776
    if-eqz v1, :cond_3b

    .line 777
    .line 778
    iget-object v2, v1, LE0/c;->a:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v2, Ljava/lang/String;

    .line 781
    .line 782
    if-nez v2, :cond_3c

    .line 783
    .line 784
    :cond_3b
    iget-object v2, v0, Lr0/V;->b:Lr0/d0;

    .line 785
    .line 786
    iget-object v2, v2, Lr0/d0;->L:Ljava/lang/String;

    .line 787
    .line 788
    if-nez v2, :cond_3c

    .line 789
    .line 790
    goto :goto_19

    .line 791
    :cond_3c
    if-eqz v1, :cond_3d

    .line 792
    .line 793
    iget-object v1, v1, LE0/c;->b:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v1, Ljava/lang/String;

    .line 796
    .line 797
    if-nez v1, :cond_3e

    .line 798
    .line 799
    :cond_3d
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 800
    .line 801
    iget-object v1, v1, Lr0/d0;->M:Ljava/lang/String;

    .line 802
    .line 803
    if-nez v1, :cond_3e

    .line 804
    .line 805
    move-object v1, v2

    .line 806
    :cond_3e
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 807
    .line 808
    invoke-virtual {v3, v2, v1}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v5, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    :goto_19
    return-void

    .line 815
    :pswitch_b
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 819
    .line 820
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    invoke-static {}, Lz0/r;->g()Lz0/A;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    sget-object v2, Lz0/A;->d:Lz0/A;

    .line 828
    .line 829
    if-ne v1, v2, :cond_5e

    .line 830
    .line 831
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 832
    .line 833
    aget-object v1, v1, v3

    .line 834
    .line 835
    if-eqz v1, :cond_5e

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    if-nez v1, :cond_3f

    .line 842
    .line 843
    goto/16 :goto_26

    .line 844
    .line 845
    :cond_3f
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 846
    .line 847
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v4

    .line 851
    const-string v8, "toLowerCase(...)"

    .line 852
    .line 853
    invoke-static {v4, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    const-string v9, " from rcontact"

    .line 857
    .line 858
    invoke-static {v4, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 859
    .line 860
    .line 861
    move-result v9

    .line 862
    if-nez v9, :cond_40

    .line 863
    .line 864
    const-string v9, " from (select * from rcontact"

    .line 865
    .line 866
    invoke-static {v4, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 867
    .line 868
    .line 869
    move-result v9

    .line 870
    if-eqz v9, :cond_42

    .line 871
    .line 872
    :cond_40
    const-string v9, " limit 1"

    .line 873
    .line 874
    invoke-static {v1, v9, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 875
    .line 876
    .line 877
    move-result v9

    .line 878
    if-nez v9, :cond_41

    .line 879
    .line 880
    move v9, v6

    .line 881
    goto :goto_1a

    .line 882
    :cond_41
    sget-object v9, Lr0/d0;->d0:LU0/g;

    .line 883
    .line 884
    invoke-virtual {v9, v1}, LU0/g;->a(Ljava/lang/String;)Z

    .line 885
    .line 886
    .line 887
    move-result v9

    .line 888
    :goto_1a
    if-nez v9, :cond_42

    .line 889
    .line 890
    const-string v9, " where username="

    .line 891
    .line 892
    invoke-static {v4, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 893
    .line 894
    .line 895
    move-result v9

    .line 896
    if-nez v9, :cond_42

    .line 897
    .line 898
    const-string v9, " where encryptusername="

    .line 899
    .line 900
    invoke-static {v4, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-nez v4, :cond_42

    .line 905
    .line 906
    move v4, v3

    .line 907
    goto :goto_1b

    .line 908
    :cond_42
    move v4, v6

    .line 909
    :goto_1b
    if-nez v4, :cond_43

    .line 910
    .line 911
    goto/16 :goto_26

    .line 912
    .line 913
    :cond_43
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    invoke-static {v2, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    const-string v4, "order by showhead"

    .line 921
    .line 922
    invoke-static {v2, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-nez v4, :cond_48

    .line 927
    .line 928
    const-string v4, "conremarkpyfull"

    .line 929
    .line 930
    invoke-static {v2, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-nez v4, :cond_48

    .line 935
    .line 936
    const-string v4, "usernameflag"

    .line 937
    .line 938
    invoke-static {v2, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-nez v4, :cond_48

    .line 943
    .line 944
    const-string v4, "type & 32"

    .line 945
    .line 946
    invoke-static {v2, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 947
    .line 948
    .line 949
    move-result v4

    .line 950
    if-nez v4, :cond_48

    .line 951
    .line 952
    const-string v4, "verifyflag"

    .line 953
    .line 954
    invoke-static {v2, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    if-eqz v2, :cond_44

    .line 959
    .line 960
    goto :goto_1d

    .line 961
    :cond_44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    const-string v4, "getStackTrace(...)"

    .line 970
    .line 971
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    array-length v4, v2

    .line 975
    move v9, v6

    .line 976
    move v10, v9

    .line 977
    :goto_1c
    if-ge v9, v4, :cond_49

    .line 978
    .line 979
    aget-object v11, v2, v9

    .line 980
    .line 981
    invoke-virtual {v11}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v11

    .line 985
    invoke-static {v11}, LN0/g;->b(Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    const-string v12, "contact.address"

    .line 989
    .line 990
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 991
    .line 992
    .line 993
    move-result v12

    .line 994
    if-nez v12, :cond_48

    .line 995
    .line 996
    const-string v12, "MvvmAddressUI"

    .line 997
    .line 998
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 999
    .line 1000
    .line 1001
    move-result v12

    .line 1002
    if-nez v12, :cond_48

    .line 1003
    .line 1004
    const-string v12, "AddressUI"

    .line 1005
    .line 1006
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v12

    .line 1010
    if-eqz v12, :cond_45

    .line 1011
    .line 1012
    goto :goto_1d

    .line 1013
    :cond_45
    const-string v12, ".plugin.fts."

    .line 1014
    .line 1015
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v12

    .line 1019
    if-nez v12, :cond_46

    .line 1020
    .line 1021
    const-string v12, ".ui.search"

    .line 1022
    .line 1023
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v12

    .line 1027
    if-nez v12, :cond_46

    .line 1028
    .line 1029
    const-string v12, "FTS"

    .line 1030
    .line 1031
    invoke-static {v11, v12, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v11

    .line 1035
    if-eqz v11, :cond_47

    .line 1036
    .line 1037
    :cond_46
    move v10, v3

    .line 1038
    :cond_47
    add-int/2addr v9, v3

    .line 1039
    goto :goto_1c

    .line 1040
    :cond_48
    :goto_1d
    move v10, v6

    .line 1041
    :cond_49
    if-nez v10, :cond_4a

    .line 1042
    .line 1043
    goto/16 :goto_26

    .line 1044
    .line 1045
    :cond_4a
    sget-boolean v2, Lz0/i;->a:Z

    .line 1046
    .line 1047
    invoke-static {}, Lz0/g;->z()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v2

    .line 1051
    if-nez v2, :cond_4b

    .line 1052
    .line 1053
    goto/16 :goto_26

    .line 1054
    .line 1055
    :cond_4b
    invoke-static {}, Lr0/d0;->V()Ljava/util/List;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v9

    .line 1059
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    if-eqz v2, :cond_4c

    .line 1064
    .line 1065
    goto/16 :goto_26

    .line 1066
    .line 1067
    :cond_4c
    new-instance v13, Lr0/P;

    .line 1068
    .line 1069
    invoke-direct {v13, v3}, Lr0/P;-><init>(I)V

    .line 1070
    .line 1071
    .line 1072
    const/4 v11, 0x0

    .line 1073
    const/4 v12, 0x0

    .line 1074
    const-string v10, ","

    .line 1075
    .line 1076
    const/16 v14, 0x1e

    .line 1077
    .line 1078
    invoke-static/range {v9 .. v14}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v2

    .line 1082
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v4

    .line 1086
    if-eqz v4, :cond_4d

    .line 1087
    .line 1088
    goto/16 :goto_26

    .line 1089
    .line 1090
    :cond_4d
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    const-string v4, "<this>"

    .line 1099
    .line 1100
    invoke-static {v1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    const-string v4, ";"

    .line 1104
    .line 1105
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v9

    .line 1109
    const-string v10, "substring(...)"

    .line 1110
    .line 1111
    if-eqz v9, :cond_4e

    .line 1112
    .line 1113
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1114
    .line 1115
    .line 1116
    move-result v9

    .line 1117
    sub-int/2addr v9, v3

    .line 1118
    invoke-virtual {v1, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    invoke-static {v1, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    :cond_4e
    sget-object v9, Lr0/d0;->j0:LU0/g;

    .line 1126
    .line 1127
    invoke-virtual {v9, v6, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v9

    .line 1131
    if-eqz v9, :cond_4f

    .line 1132
    .line 1133
    invoke-virtual {v9}, LU0/d;->a()Ljava/util/List;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v9

    .line 1137
    invoke-static {v9, v3}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v9

    .line 1141
    check-cast v9, Ljava/lang/String;

    .line 1142
    .line 1143
    goto :goto_1e

    .line 1144
    :cond_4f
    move-object v9, v7

    .line 1145
    :goto_1e
    if-eqz v9, :cond_51

    .line 1146
    .line 1147
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v11

    .line 1151
    if-eqz v11, :cond_50

    .line 1152
    .line 1153
    goto :goto_1f

    .line 1154
    :cond_50
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1155
    .line 1156
    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v11

    .line 1160
    invoke-static {v11, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    sget-object v12, Lr0/d0;->k0:Ljava/util/Set;

    .line 1164
    .line 1165
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v11

    .line 1169
    if-nez v11, :cond_51

    .line 1170
    .line 1171
    const-string v11, ".username"

    .line 1172
    .line 1173
    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v9

    .line 1177
    goto :goto_20

    .line 1178
    :cond_51
    :goto_1f
    const-string v9, "rcontact."

    .line 1179
    .line 1180
    invoke-static {v1, v9, v3}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v9

    .line 1184
    if-eqz v9, :cond_52

    .line 1185
    .line 1186
    const-string v9, "rcontact.username"

    .line 1187
    .line 1188
    goto :goto_20

    .line 1189
    :cond_52
    const-string v9, "username"

    .line 1190
    .line 1191
    :goto_20
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1197
    .line 1198
    .line 1199
    const-string v9, " NOT IN ("

    .line 1200
    .line 1201
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1205
    .line 1206
    .line 1207
    const-string v9, ")"

    .line 1208
    .line 1209
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v11

    .line 1216
    sget-object v12, Lr0/d0;->b0:LU0/g;

    .line 1217
    .line 1218
    invoke-virtual {v12, v6, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v12

    .line 1222
    sget-object v13, Lr0/d0;->i0:LU0/g;

    .line 1223
    .line 1224
    const-string v14, "toString(...)"

    .line 1225
    .line 1226
    const/16 v15, 0x20

    .line 1227
    .line 1228
    if-eqz v12, :cond_56

    .line 1229
    .line 1230
    iget-object v12, v12, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 1231
    .line 1232
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->start()I

    .line 1233
    .line 1234
    .line 1235
    move-result v7

    .line 1236
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->end()I

    .line 1237
    .line 1238
    .line 1239
    move-result v12

    .line 1240
    invoke-static {v7, v12}, LD/h;->U(II)LR0/c;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v7

    .line 1244
    iget v7, v7, LR0/a;->b:I

    .line 1245
    .line 1246
    add-int/2addr v7, v3

    .line 1247
    invoke-virtual {v13, v7, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v12

    .line 1251
    if-eqz v12, :cond_53

    .line 1252
    .line 1253
    iget-object v12, v12, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 1254
    .line 1255
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->start()I

    .line 1256
    .line 1257
    .line 1258
    move-result v13

    .line 1259
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->end()I

    .line 1260
    .line 1261
    .line 1262
    move-result v12

    .line 1263
    invoke-static {v13, v12}, LD/h;->U(II)LR0/c;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v12

    .line 1267
    if-eqz v12, :cond_53

    .line 1268
    .line 1269
    iget v12, v12, LR0/a;->a:I

    .line 1270
    .line 1271
    goto :goto_21

    .line 1272
    :cond_53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1273
    .line 1274
    .line 1275
    move-result v12

    .line 1276
    :goto_21
    invoke-virtual {v1, v7, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v13

    .line 1280
    invoke-static {v13, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-static {v13}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v13

    .line 1287
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v13

    .line 1291
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1292
    .line 1293
    .line 1294
    move-result v16

    .line 1295
    if-eqz v16, :cond_54

    .line 1296
    .line 1297
    const/4 v3, 0x0

    .line 1298
    goto/16 :goto_23

    .line 1299
    .line 1300
    :cond_54
    invoke-virtual {v1, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v12

    .line 1304
    invoke-static {v12, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1305
    .line 1306
    .line 1307
    invoke-static {v12}, LU0/i;->F0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v12

    .line 1311
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v12

    .line 1315
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1316
    .line 1317
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v7

    .line 1324
    invoke-static {v7, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    .line 1330
    const-string v7, " ("

    .line 1331
    .line 1332
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1336
    .line 1337
    .line 1338
    const-string v7, ") AND ("

    .line 1339
    .line 1340
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    .line 1349
    invoke-static {v12}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v7

    .line 1353
    if-nez v7, :cond_55

    .line 1354
    .line 1355
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    :cond_55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    invoke-static {v3, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_23

    .line 1369
    :cond_56
    invoke-virtual {v13, v6, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v3

    .line 1373
    if-eqz v3, :cond_57

    .line 1374
    .line 1375
    iget-object v3, v3, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 1376
    .line 1377
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    .line 1382
    .line 1383
    .line 1384
    move-result v3

    .line 1385
    invoke-static {v7, v3}, LD/h;->U(II)LR0/c;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v3

    .line 1389
    if-eqz v3, :cond_57

    .line 1390
    .line 1391
    iget v3, v3, LR0/a;->a:I

    .line 1392
    .line 1393
    goto :goto_22

    .line 1394
    :cond_57
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1395
    .line 1396
    .line 1397
    move-result v3

    .line 1398
    :goto_22
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1399
    .line 1400
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v9

    .line 1407
    invoke-static {v9, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v9}, LU0/i;->D0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v9

    .line 1414
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v9

    .line 1418
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1419
    .line 1420
    .line 1421
    const-string v9, " WHERE "

    .line 1422
    .line 1423
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    invoke-static {v3, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    invoke-static {v3}, LU0/i;->F0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v3

    .line 1440
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v3

    .line 1444
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 1445
    .line 1446
    .line 1447
    move-result v9

    .line 1448
    if-nez v9, :cond_58

    .line 1449
    .line 1450
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1454
    .line 1455
    .line 1456
    :cond_58
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v3

    .line 1460
    invoke-static {v3, v14}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1461
    .line 1462
    .line 1463
    :goto_23
    if-eqz v3, :cond_59

    .line 1464
    .line 1465
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v7

    .line 1469
    goto :goto_25

    .line 1470
    :cond_59
    sget-object v3, Lr0/d0;->e0:LU0/g;

    .line 1471
    .line 1472
    invoke-virtual {v3, v6, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v3

    .line 1476
    if-eqz v3, :cond_5c

    .line 1477
    .line 1478
    invoke-virtual {v3}, LU0/d;->a()Ljava/util/List;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    const/4 v4, 0x1

    .line 1483
    invoke-static {v3, v4}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    check-cast v3, Ljava/lang/String;

    .line 1488
    .line 1489
    if-eqz v3, :cond_5c

    .line 1490
    .line 1491
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1492
    .line 1493
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v3

    .line 1497
    invoke-static {v3, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1498
    .line 1499
    .line 1500
    sget-object v4, Lr0/d0;->f0:LU0/g;

    .line 1501
    .line 1502
    invoke-virtual {v4, v3}, LU0/g;->a(Ljava/lang/String;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v4

    .line 1506
    if-eqz v4, :cond_5a

    .line 1507
    .line 1508
    goto :goto_24

    .line 1509
    :cond_5a
    const-string v4, "*"

    .line 1510
    .line 1511
    invoke-static {v3, v4, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v4

    .line 1515
    if-nez v4, :cond_5b

    .line 1516
    .line 1517
    sget-object v4, Lr0/d0;->g0:LU0/g;

    .line 1518
    .line 1519
    invoke-virtual {v4, v3}, LU0/g;->a(Ljava/lang/String;)Z

    .line 1520
    .line 1521
    .line 1522
    move-result v4

    .line 1523
    if-nez v4, :cond_5b

    .line 1524
    .line 1525
    sget-object v4, Lr0/d0;->h0:LU0/g;

    .line 1526
    .line 1527
    invoke-virtual {v4, v3}, LU0/g;->a(Ljava/lang/String;)Z

    .line 1528
    .line 1529
    .line 1530
    move-result v3

    .line 1531
    if-eqz v3, :cond_5c

    .line 1532
    .line 1533
    :cond_5b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1534
    .line 1535
    const-string v4, "SELECT * FROM ("

    .line 1536
    .line 1537
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1538
    .line 1539
    .line 1540
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1541
    .line 1542
    .line 1543
    const-string v1, ") AS a WHERE username NOT IN ("

    .line 1544
    .line 1545
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1549
    .line 1550
    .line 1551
    const-string v1, ");"

    .line 1552
    .line 1553
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v7

    .line 1560
    goto :goto_25

    .line 1561
    :cond_5c
    :goto_24
    const/4 v7, 0x0

    .line 1562
    :goto_25
    if-nez v7, :cond_5d

    .line 1563
    .line 1564
    goto :goto_26

    .line 1565
    :cond_5d
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1566
    .line 1567
    const/16 v16, 0x1

    .line 1568
    .line 1569
    aput-object v7, v1, v16

    .line 1570
    .line 1571
    :cond_5e
    :goto_26
    return-void

    .line 1572
    :pswitch_c
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1573
    .line 1574
    .line 1575
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1576
    .line 1577
    iget-object v2, v0, Lr0/V;->b:Lr0/d0;

    .line 1578
    .line 1579
    invoke-static {v2, v1}, Lr0/d0;->j(Lr0/d0;Ljava/lang/Object;)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v1

    .line 1583
    if-nez v1, :cond_5f

    .line 1584
    .line 1585
    goto :goto_28

    .line 1586
    :cond_5f
    invoke-virtual {v2}, Lr0/d0;->F()Ljava/util/Set;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v1

    .line 1590
    iget-object v3, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1591
    .line 1592
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    invoke-static {v6, v3}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v3

    .line 1599
    instance-of v4, v3, Ljava/util/List;

    .line 1600
    .line 1601
    if-eqz v4, :cond_60

    .line 1602
    .line 1603
    move-object v7, v3

    .line 1604
    check-cast v7, Ljava/util/List;

    .line 1605
    .line 1606
    goto :goto_27

    .line 1607
    :cond_60
    const/4 v7, 0x0

    .line 1608
    :goto_27
    if-nez v7, :cond_61

    .line 1609
    .line 1610
    goto :goto_28

    .line 1611
    :cond_61
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 1612
    .line 1613
    .line 1614
    move-result v3

    .line 1615
    if-eqz v3, :cond_62

    .line 1616
    .line 1617
    goto :goto_28

    .line 1618
    :cond_62
    const-string v3, "input"

    .line 1619
    .line 1620
    invoke-static {v2, v3, v7, v1}, Lr0/d0;->e(Lr0/d0;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V

    .line 1621
    .line 1622
    .line 1623
    invoke-static {v2, v7, v1}, Lr0/d0;->b(Lr0/d0;Ljava/util/List;Ljava/util/Set;)Ljava/util/ArrayList;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v1

    .line 1627
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1628
    .line 1629
    .line 1630
    move-result v2

    .line 1631
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1632
    .line 1633
    .line 1634
    move-result v3

    .line 1635
    if-ne v2, v3, :cond_63

    .line 1636
    .line 1637
    goto :goto_28

    .line 1638
    :cond_63
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1639
    .line 1640
    aput-object v1, v2, v6

    .line 1641
    .line 1642
    :goto_28
    return-void

    .line 1643
    :pswitch_d
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1644
    .line 1645
    .line 1646
    iget-object v1, v0, Lr0/V;->b:Lr0/d0;

    .line 1647
    .line 1648
    iget-object v1, v1, Lr0/d0;->g:Ljava/util/WeakHashMap;

    .line 1649
    .line 1650
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1651
    .line 1652
    invoke-virtual {v1, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    return-void

    .line 1656
    :pswitch_e
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1660
    .line 1661
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 1662
    .line 1663
    invoke-static {v3, v1}, Lr0/d0;->i(Lr0/d0;Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v1

    .line 1667
    if-nez v1, :cond_64

    .line 1668
    .line 1669
    goto :goto_2a

    .line 1670
    :cond_64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1674
    .line 1675
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1676
    .line 1677
    .line 1678
    invoke-static {v6, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    instance-of v4, v1, Ljava/lang/Integer;

    .line 1683
    .line 1684
    if-eqz v4, :cond_65

    .line 1685
    .line 1686
    move-object v7, v1

    .line 1687
    check-cast v7, Ljava/lang/Integer;

    .line 1688
    .line 1689
    goto :goto_29

    .line 1690
    :cond_65
    const/4 v7, 0x0

    .line 1691
    :goto_29
    if-eqz v7, :cond_68

    .line 1692
    .line 1693
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1694
    .line 1695
    .line 1696
    move-result v1

    .line 1697
    iget-object v4, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1698
    .line 1699
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1700
    .line 1701
    .line 1702
    invoke-virtual {v3, v4}, Lr0/d0;->W(Ljava/lang/Object;)[I

    .line 1703
    .line 1704
    .line 1705
    move-result-object v2

    .line 1706
    if-nez v2, :cond_66

    .line 1707
    .line 1708
    goto :goto_2a

    .line 1709
    :cond_66
    if-ltz v1, :cond_68

    .line 1710
    .line 1711
    array-length v3, v2

    .line 1712
    if-lt v1, v3, :cond_67

    .line 1713
    .line 1714
    goto :goto_2a

    .line 1715
    :cond_67
    iget-object v3, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1716
    .line 1717
    aget v1, v2, v1

    .line 1718
    .line 1719
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v1

    .line 1723
    aput-object v1, v3, v6

    .line 1724
    .line 1725
    :cond_68
    :goto_2a
    return-void

    .line 1726
    :pswitch_f
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1727
    .line 1728
    .line 1729
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1730
    .line 1731
    iget-object v3, v0, Lr0/V;->b:Lr0/d0;

    .line 1732
    .line 1733
    invoke-static {v3, v1}, Lr0/d0;->i(Lr0/d0;Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v1

    .line 1737
    if-nez v1, :cond_69

    .line 1738
    .line 1739
    goto :goto_2e

    .line 1740
    :cond_69
    iget-object v1, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1741
    .line 1742
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-static {v6, v1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    instance-of v4, v1, Ljava/lang/Integer;

    .line 1750
    .line 1751
    if-eqz v4, :cond_6a

    .line 1752
    .line 1753
    check-cast v1, Ljava/lang/Integer;

    .line 1754
    .line 1755
    goto :goto_2b

    .line 1756
    :cond_6a
    const/4 v1, 0x0

    .line 1757
    :goto_2b
    if-eqz v1, :cond_6f

    .line 1758
    .line 1759
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1760
    .line 1761
    .line 1762
    move-result v1

    .line 1763
    iget-object v4, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1764
    .line 1765
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1766
    .line 1767
    .line 1768
    invoke-virtual {v3, v4}, Lr0/d0;->W(Ljava/lang/Object;)[I

    .line 1769
    .line 1770
    .line 1771
    move-result-object v4

    .line 1772
    if-nez v4, :cond_6b

    .line 1773
    .line 1774
    goto :goto_2e

    .line 1775
    :cond_6b
    if-ltz v1, :cond_6c

    .line 1776
    .line 1777
    array-length v6, v4

    .line 1778
    if-lt v1, v6, :cond_6d

    .line 1779
    .line 1780
    :cond_6c
    const/4 v1, 0x0

    .line 1781
    goto :goto_2d

    .line 1782
    :cond_6d
    iget-object v6, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1783
    .line 1784
    invoke-static {v6, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1785
    .line 1786
    .line 1787
    aget v1, v4, v1

    .line 1788
    .line 1789
    iget-object v2, v3, Lr0/d0;->i:Ljava/util/HashMap;

    .line 1790
    .line 1791
    invoke-static {v2, v6}, Lr0/d0;->A(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v2

    .line 1795
    if-nez v2, :cond_6e

    .line 1796
    .line 1797
    const/4 v7, 0x0

    .line 1798
    goto :goto_2c

    .line 1799
    :cond_6e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v1

    .line 1803
    filled-new-array {v1}, [Ljava/lang/Integer;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v1

    .line 1807
    invoke-static {v2, v6, v1}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v7

    .line 1811
    :goto_2c
    invoke-virtual {v5, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1812
    .line 1813
    .line 1814
    goto :goto_2e

    .line 1815
    :goto_2d
    invoke-virtual {v5, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1816
    .line 1817
    .line 1818
    :cond_6f
    :goto_2e
    return-void

    .line 1819
    :pswitch_10
    move-object v1, v7

    .line 1820
    invoke-static {v5, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1821
    .line 1822
    .line 1823
    iget-object v3, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1824
    .line 1825
    iget-object v4, v0, Lr0/V;->b:Lr0/d0;

    .line 1826
    .line 1827
    invoke-static {v4, v3}, Lr0/d0;->i(Lr0/d0;Ljava/lang/Object;)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v3

    .line 1831
    if-nez v3, :cond_70

    .line 1832
    .line 1833
    goto :goto_30

    .line 1834
    :cond_70
    iget-object v3, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1835
    .line 1836
    invoke-static {v3, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v4, v3}, Lr0/d0;->W(Ljava/lang/Object;)[I

    .line 1840
    .line 1841
    .line 1842
    move-result-object v2

    .line 1843
    if-nez v2, :cond_72

    .line 1844
    .line 1845
    iget-object v2, v5, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1846
    .line 1847
    if-eqz v2, :cond_71

    .line 1848
    .line 1849
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v1

    .line 1853
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v7

    .line 1857
    goto :goto_2f

    .line 1858
    :cond_71
    move-object v7, v1

    .line 1859
    :goto_2f
    const-string v1, "hide contact mapping unavailable"

    .line 1860
    .line 1861
    filled-new-array {v1, v7}, [Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v1

    .line 1865
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1866
    .line 1867
    .line 1868
    goto :goto_30

    .line 1869
    :cond_72
    array-length v1, v2

    .line 1870
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v1

    .line 1874
    invoke-virtual {v5, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1875
    .line 1876
    .line 1877
    :goto_30
    return-void

    .line 1878
    nop

    .line 1879
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
