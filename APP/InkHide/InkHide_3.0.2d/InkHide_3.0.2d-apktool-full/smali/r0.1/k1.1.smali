.class public final Lr0/k1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/l1;


# direct methods
.method public synthetic constructor <init>(Lr0/l1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/k1;->a:I

    iput-object p1, p0, Lr0/k1;->b:Lr0/l1;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "args"

    .line 3
    .line 4
    iget-object v2, p0, Lr0/k1;->b:Lr0/l1;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "param"

    .line 8
    .line 9
    iget v5, p0, Lr0/k1;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    return-void

    .line 15
    :pswitch_1
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v4, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    array-length v1, v4

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    move-object v0, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    aget-object v0, v4, v0

    .line 29
    .line 30
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 39
    .line 40
    instance-of v0, p1, Landroid/app/Activity;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move-object v3, p1

    .line 45
    check-cast v3, Landroid/app/Activity;

    .line 46
    .line 47
    :cond_1
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {v2, v3}, Lr0/l1;->d(Lr0/l1;Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void

    .line 54
    :pswitch_2
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    instance-of v0, p1, Landroid/app/Activity;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    move-object v3, p1

    .line 64
    check-cast v3, Landroid/app/Activity;

    .line 65
    .line 66
    :cond_4
    if-nez v3, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    invoke-static {v2, v3}, Lr0/l1;->d(Lr0/l1;Landroid/app/Activity;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    return-void

    .line 73
    :pswitch_3
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-boolean v4, Lz0/i;->a:Z

    .line 77
    .line 78
    invoke-static {}, Lz0/g;->D()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_6

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 86
    .line 87
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 88
    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    check-cast v4, Landroid/view/ViewGroup;

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_7
    move-object v4, v3

    .line 95
    :goto_3
    if-nez v4, :cond_8

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    array-length v1, p1

    .line 104
    if-nez v1, :cond_9

    .line 105
    .line 106
    move-object p1, v3

    .line 107
    goto :goto_4

    .line 108
    :cond_9
    aget-object p1, p1, v0

    .line 109
    .line 110
    :goto_4
    instance-of v0, p1, Landroid/view/View;

    .line 111
    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    move-object v3, p1

    .line 115
    check-cast v3, Landroid/view/View;

    .line 116
    .line 117
    :cond_a
    if-nez v3, :cond_b

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_b
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lr0/l1;->k(Landroid/content/Context;)Landroid/app/Activity;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-nez p1, :cond_c

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const-string v1, "com.tencent.mm.ui.vas.VASCommonActivity"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_d

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_d
    invoke-static {v2, v4}, Lr0/l1;->a(Lr0/l1;Landroid/view/View;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_e

    .line 156
    .line 157
    invoke-static {v2, v3}, Lr0/l1;->a(Lr0/l1;Landroid/view/View;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_e

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_e
    new-instance v0, Lr0/g1;

    .line 165
    .line 166
    const/4 v1, 0x3

    .line 167
    invoke-direct {v0, p1, v2, v1}, Lr0/g1;-><init>(Landroid/app/Activity;Lr0/l1;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 171
    .line 172
    .line 173
    :goto_5
    return-void

    .line 174
    :pswitch_4
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 178
    .line 179
    instance-of v0, p1, Landroid/app/Activity;

    .line 180
    .line 181
    if-eqz v0, :cond_f

    .line 182
    .line 183
    move-object v3, p1

    .line 184
    check-cast v3, Landroid/app/Activity;

    .line 185
    .line 186
    :cond_f
    if-nez v3, :cond_10

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_10
    invoke-static {v2, v3}, Lr0/l1;->c(Lr0/l1;Landroid/app/Activity;)V

    .line 190
    .line 191
    .line 192
    :goto_6
    return-void

    .line 193
    :pswitch_5
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 197
    .line 198
    instance-of v0, p1, Landroid/app/Activity;

    .line 199
    .line 200
    if-eqz v0, :cond_11

    .line 201
    .line 202
    move-object v3, p1

    .line 203
    check-cast v3, Landroid/app/Activity;

    .line 204
    .line 205
    :cond_11
    if-nez v3, :cond_12

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_12
    invoke-static {v2, v3}, Lr0/l1;->c(Lr0/l1;Landroid/app/Activity;)V

    .line 209
    .line 210
    .line 211
    :goto_7
    return-void

    .line 212
    :pswitch_6
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sget-boolean v0, Lz0/i;->a:Z

    .line 216
    .line 217
    invoke-static {}, Lz0/g;->D()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_13

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_13
    iget-object v0, v2, Lr0/l1;->d:Ljava/util/Set;

    .line 225
    .line 226
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_14

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_14
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 236
    .line 237
    const-string v1, "thisObject"

    .line 238
    .line 239
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v0}, Lr0/l1;->s(Ljava/lang/Object;)[I

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    array-length v0, v0

    .line 247
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :goto_8
    return-void

    .line 255
    :pswitch_7
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 259
    .line 260
    instance-of v5, v4, Landroid/widget/AbsListView;

    .line 261
    .line 262
    if-eqz v5, :cond_15

    .line 263
    .line 264
    check-cast v4, Landroid/widget/AbsListView;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_15
    move-object v4, v3

    .line 268
    :goto_9
    if-nez v4, :cond_16

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-static {v4}, Lr0/l1;->B(Landroid/widget/AbsListView;)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-nez v5, :cond_17

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_17
    invoke-static {v4}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-nez v5, :cond_18

    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_18
    invoke-static {v4}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-eqz v5, :cond_1b

    .line 293
    .line 294
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 295
    .line 296
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    array-length v1, p1

    .line 300
    if-nez v1, :cond_19

    .line 301
    .line 302
    move-object p1, v3

    .line 303
    goto :goto_a

    .line 304
    :cond_19
    aget-object p1, p1, v0

    .line 305
    .line 306
    :goto_a
    instance-of v0, p1, Landroid/widget/ListAdapter;

    .line 307
    .line 308
    if-eqz v0, :cond_1a

    .line 309
    .line 310
    move-object v3, p1

    .line 311
    check-cast v3, Landroid/widget/ListAdapter;

    .line 312
    .line 313
    :cond_1a
    invoke-virtual {v2, v3}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 314
    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_1b
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    array-length v1, p1

    .line 323
    if-nez v1, :cond_1c

    .line 324
    .line 325
    move-object p1, v3

    .line 326
    goto :goto_b

    .line 327
    :cond_1c
    aget-object p1, p1, v0

    .line 328
    .line 329
    :goto_b
    instance-of v0, p1, Landroid/widget/ListAdapter;

    .line 330
    .line 331
    if-eqz v0, :cond_1d

    .line 332
    .line 333
    move-object v3, p1

    .line 334
    check-cast v3, Landroid/widget/ListAdapter;

    .line 335
    .line 336
    :cond_1d
    invoke-virtual {v2, v3}, Lr0/l1;->v(Landroid/widget/ListAdapter;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v4, v4}, Lr0/l1;->b(Lr0/l1;Landroid/widget/AbsListView;Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    :goto_c
    return-void

    .line 343
    :pswitch_8
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iget-object v0, v2, Lr0/l1;->h:Ljava/lang/ThreadLocal;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 349
    .line 350
    .line 351
    sget-boolean v0, Lz0/i;->a:Z

    .line 352
    .line 353
    invoke-static {}, Lz0/g;->D()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_1e

    .line 358
    .line 359
    goto/16 :goto_e

    .line 360
    .line 361
    :cond_1e
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 362
    .line 363
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    const/4 v1, 0x2

    .line 367
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    instance-of v1, v0, Landroid/widget/AbsListView;

    .line 372
    .line 373
    if-eqz v1, :cond_1f

    .line 374
    .line 375
    check-cast v0, Landroid/widget/AbsListView;

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_1f
    move-object v0, v3

    .line 379
    :goto_d
    if-nez v0, :cond_20

    .line 380
    .line 381
    goto :goto_e

    .line 382
    :cond_20
    invoke-static {v0}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-nez v1, :cond_21

    .line 387
    .line 388
    goto :goto_e

    .line 389
    :cond_21
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    instance-of v4, v1, Landroid/view/View;

    .line 394
    .line 395
    if-eqz v4, :cond_22

    .line 396
    .line 397
    move-object v3, v1

    .line 398
    check-cast v3, Landroid/view/View;

    .line 399
    .line 400
    :cond_22
    if-nez v3, :cond_23

    .line 401
    .line 402
    goto :goto_e

    .line 403
    :cond_23
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v1}, Lr0/l1;->k(Landroid/content/Context;)Landroid/app/Activity;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    if-nez v1, :cond_24

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_24
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    if-eqz v4, :cond_25

    .line 419
    .line 420
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    if-nez v4, :cond_26

    .line 425
    .line 426
    :cond_25
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    if-nez v4, :cond_26

    .line 431
    .line 432
    goto :goto_e

    .line 433
    :cond_26
    invoke-virtual {v2, v1, v4}, Lr0/l1;->x(Landroid/app/Activity;Landroid/view/View;)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-nez v1, :cond_27

    .line 438
    .line 439
    goto :goto_e

    .line 440
    :cond_27
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 441
    .line 442
    iget-object v1, v2, Lr0/l1;->d:Ljava/util/Set;

    .line 443
    .line 444
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    if-nez p1, :cond_28

    .line 449
    .line 450
    invoke-static {v0}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    if-eqz p1, :cond_29

    .line 455
    .line 456
    :cond_28
    invoke-virtual {v2, v3}, Lr0/l1;->K(Landroid/view/View;)V

    .line 457
    .line 458
    .line 459
    :cond_29
    :goto_e
    return-void

    .line 460
    :pswitch_9
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    sget-boolean v0, Lz0/i;->a:Z

    .line 464
    .line 465
    invoke-static {}, Lz0/g;->D()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-nez v0, :cond_2a

    .line 470
    .line 471
    goto :goto_f

    .line 472
    :cond_2a
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 473
    .line 474
    instance-of v0, p1, Landroid/widget/AbsListView;

    .line 475
    .line 476
    if-eqz v0, :cond_2b

    .line 477
    .line 478
    move-object v3, p1

    .line 479
    check-cast v3, Landroid/widget/AbsListView;

    .line 480
    .line 481
    :cond_2b
    if-nez v3, :cond_2c

    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-static {v3}, Lr0/l1;->B(Landroid/widget/AbsListView;)Z

    .line 488
    .line 489
    .line 490
    move-result p1

    .line 491
    if-nez p1, :cond_2d

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_2d
    invoke-static {v3}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    if-eqz p1, :cond_2e

    .line 499
    .line 500
    invoke-virtual {v3}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    check-cast p1, Landroid/widget/ListAdapter;

    .line 505
    .line 506
    invoke-virtual {v2, p1}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 507
    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_2e
    invoke-virtual {v3}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    check-cast p1, Landroid/widget/ListAdapter;

    .line 515
    .line 516
    invoke-virtual {v2, p1}, Lr0/l1;->v(Landroid/widget/ListAdapter;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v2, v3, v3}, Lr0/l1;->b(Lr0/l1;Landroid/widget/AbsListView;Landroid/view/View;)V

    .line 520
    .line 521
    .line 522
    :goto_f
    return-void

    .line 523
    :pswitch_a
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    sget-boolean v0, Lz0/i;->a:Z

    .line 527
    .line 528
    invoke-static {}, Lz0/g;->D()Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-nez v0, :cond_2f

    .line 533
    .line 534
    goto :goto_11

    .line 535
    :cond_2f
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 536
    .line 537
    instance-of v1, v0, Landroid/widget/AbsListView;

    .line 538
    .line 539
    if-eqz v1, :cond_30

    .line 540
    .line 541
    check-cast v0, Landroid/widget/AbsListView;

    .line 542
    .line 543
    goto :goto_10

    .line 544
    :cond_30
    move-object v0, v3

    .line 545
    :goto_10
    if-nez v0, :cond_31

    .line 546
    .line 547
    goto :goto_11

    .line 548
    :cond_31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-static {v0}, Lr0/l1;->B(Landroid/widget/AbsListView;)Z

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    if-nez v1, :cond_32

    .line 556
    .line 557
    goto :goto_11

    .line 558
    :cond_32
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    instance-of v1, p1, Landroid/view/View;

    .line 563
    .line 564
    if-eqz v1, :cond_33

    .line 565
    .line 566
    move-object v3, p1

    .line 567
    check-cast v3, Landroid/view/View;

    .line 568
    .line 569
    :cond_33
    if-nez v3, :cond_34

    .line 570
    .line 571
    goto :goto_11

    .line 572
    :cond_34
    invoke-static {v0}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 573
    .line 574
    .line 575
    move-result p1

    .line 576
    if-eqz p1, :cond_35

    .line 577
    .line 578
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    check-cast p1, Landroid/widget/ListAdapter;

    .line 583
    .line 584
    invoke-virtual {v2, p1}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 585
    .line 586
    .line 587
    goto :goto_11

    .line 588
    :cond_35
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    check-cast p1, Landroid/widget/ListAdapter;

    .line 593
    .line 594
    invoke-virtual {v2, p1}, Lr0/l1;->v(Landroid/widget/ListAdapter;)V

    .line 595
    .line 596
    .line 597
    invoke-static {v2, v0, v3}, Lr0/l1;->b(Lr0/l1;Landroid/widget/AbsListView;Landroid/view/View;)V

    .line 598
    .line 599
    .line 600
    :goto_11
    return-void

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "args"

    .line 4
    .line 5
    iget-object v3, p0, Lr0/k1;->b:Lr0/l1;

    .line 6
    .line 7
    const-string v4, "param"

    .line 8
    .line 9
    iget v5, p0, Lr0/k1;->a:I

    .line 10
    .line 11
    sparse-switch v5, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_0
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-boolean v4, Lz0/i;->a:Z

    .line 19
    .line 20
    invoke-static {}, Lz0/g;->D()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v4, v3, Lr0/l1;->h:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v4, v5}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v5, v3, Lr0/l1;->d:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    instance-of v4, v2, Ljava/lang/Integer;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    move-object v0, v2

    .line 67
    check-cast v0, Ljava/lang/Integer;

    .line 68
    .line 69
    :cond_3
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 76
    .line 77
    const-string v4, "thisObject"

    .line 78
    .line 79
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, Lr0/l1;->s(Ljava/lang/Object;)[I

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-ltz v0, :cond_5

    .line 87
    .line 88
    array-length v3, v2

    .line 89
    if-lt v0, v3, :cond_4

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 93
    .line 94
    aget v0, v2, v0

    .line 95
    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    aput-object v0, p1, v1

    .line 101
    .line 102
    :cond_5
    :goto_0
    return-void

    .line 103
    :sswitch_1
    invoke-static {p1, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 v5, 0x2

    .line 112
    invoke-static {v5, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    instance-of v5, v4, Landroid/widget/AbsListView;

    .line 117
    .line 118
    if-eqz v5, :cond_6

    .line 119
    .line 120
    check-cast v4, Landroid/widget/AbsListView;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_6
    move-object v4, v0

    .line 124
    :goto_1
    if-nez v4, :cond_7

    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v4}, Lr0/l1;->z(Landroid/widget/AbsListView;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_8

    .line 136
    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :cond_8
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 140
    .line 141
    instance-of v6, v5, Landroid/widget/ListAdapter;

    .line 142
    .line 143
    if-eqz v6, :cond_9

    .line 144
    .line 145
    check-cast v5, Landroid/widget/ListAdapter;

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_9
    move-object v5, v0

    .line 149
    :goto_2
    if-nez v5, :cond_a

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    invoke-static {v4}, Lr0/l1;->C(Landroid/widget/AbsListView;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_e

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v3}, Lr0/l1;->q()Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_e

    .line 175
    .line 176
    invoke-virtual {v3, v5}, Lr0/l1;->G(Landroid/widget/ListAdapter;)V

    .line 177
    .line 178
    .line 179
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 180
    .line 181
    invoke-static {v4, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v4}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    instance-of v6, v4, Ljava/lang/Integer;

    .line 189
    .line 190
    if-eqz v6, :cond_b

    .line 191
    .line 192
    check-cast v4, Ljava/lang/Integer;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_b
    move-object v4, v0

    .line 196
    :goto_3
    if-eqz v4, :cond_11

    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-virtual {v3, v5}, Lr0/l1;->s(Ljava/lang/Object;)[I

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    if-ltz v4, :cond_d

    .line 207
    .line 208
    array-length v6, v5

    .line 209
    if-lt v4, v6, :cond_c

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_c
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 213
    .line 214
    aget v4, v5, v4

    .line 215
    .line 216
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    aput-object v4, v6, v1

    .line 221
    .line 222
    :cond_d
    :goto_4
    iget-object v1, v3, Lr0/l1;->h:Ljava/lang/ThreadLocal;

    .line 223
    .line 224
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {v1, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_e
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 230
    .line 231
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const/4 v1, 0x1

    .line 235
    invoke-static {v1, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    instance-of v1, p1, Landroid/view/View;

    .line 240
    .line 241
    if-eqz v1, :cond_f

    .line 242
    .line 243
    move-object v0, p1

    .line 244
    check-cast v0, Landroid/view/View;

    .line 245
    .line 246
    :cond_f
    if-nez v0, :cond_10

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_10
    invoke-static {v0}, Lr0/l1;->J(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    :cond_11
    :goto_5
    return-void

    .line 253
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method
