.class public final Lxa/k;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxa/m;


# direct methods
.method public synthetic constructor <init>(Lxa/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxa/k;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lxa/k;->b:Lxa/m;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Lxa/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lxa/k;->b:Lxa/m;

    .line 14
    .line 15
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_5

    .line 22
    .line 23
    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-static {v2, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v3

    .line 35
    :goto_0
    instance-of v4, v1, Landroid/view/ContextMenu;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    check-cast v1, Landroid/view/ContextMenu;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v1, v3

    .line 43
    :goto_1
    if-eqz v1, :cond_6

    .line 44
    .line 45
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    invoke-static {v5, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move-object v4, v3

    .line 56
    :goto_2
    instance-of v6, v4, Landroid/view/View;

    .line 57
    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    check-cast v4, Landroid/view/View;

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move-object v4, v3

    .line 64
    :goto_3
    if-eqz v4, :cond_6

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, Lxa/m;->c(Landroid/content/Context;)Landroid/app/Activity;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 77
    .line 78
    new-instance v6, Ljava/util/IdentityHashMap;

    .line 79
    .line 80
    invoke-direct {v6}, Ljava/util/IdentityHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v2, p1, v6}, Lxa/m;->d(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, Lxa/m;->f(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move-object p1, v3

    .line 104
    :goto_4
    if-eqz p1, :cond_6

    .line 105
    .line 106
    const v6, 0x48435253    # 200009.3f

    .line 107
    .line 108
    .line 109
    invoke-interface {v1, v6}, Landroid/view/Menu;->removeItem(I)V

    .line 110
    .line 111
    .line 112
    iget-object v7, v0, Lxa/m;->g:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 115
    .line 116
    .line 117
    iput-object v3, v0, Lxa/m;->h:Lxa/i;

    .line 118
    .line 119
    new-instance v3, Lxa/i;

    .line 120
    .line 121
    invoke-direct {v3, v4, p1, v5}, Lxa/i;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v1}, Landroid/view/Menu;->size()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    const-string v4, "\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 129
    .line 130
    invoke-interface {v1, v2, v6, p1, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object v1, v0, Lxa/m;->g:Ljava/util/Map;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    check-cast v1, Ljava/util/Map;

    .line 140
    .line 141
    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    iput-object v3, v0, Lxa/m;->h:Lxa/i;

    .line 145
    .line 146
    :cond_6
    :goto_5
    return-void

    .line 147
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lxa/k;->b:Lxa/m;

    .line 151
    .line 152
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    const/4 v3, 0x0

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    invoke-static {v2, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    goto :goto_6

    .line 165
    :cond_7
    move-object p1, v3

    .line 166
    :goto_6
    instance-of v4, p1, Landroid/view/View$OnClickListener;

    .line 167
    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    check-cast p1, Landroid/view/View$OnClickListener;

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_8
    move-object p1, v3

    .line 174
    :goto_7
    if-eqz v1, :cond_16

    .line 175
    .line 176
    if-nez p1, :cond_9

    .line 177
    .line 178
    goto/16 :goto_f

    .line 179
    .line 180
    :cond_9
    const-string v4, "getViewHeader"

    .line 181
    .line 182
    new-array v2, v2, [Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v1, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_16

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    new-instance v4, Lwb/sr;

    .line 203
    .line 204
    const/16 v5, 0x1b

    .line 205
    .line 206
    invoke-direct {v4, v5}, Lwb/sr;-><init>(I)V

    .line 207
    .line 208
    .line 209
    new-instance v5, Lng/i;

    .line 210
    .line 211
    const/4 v6, 0x1

    .line 212
    invoke-direct {v5, v2, v6, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, Lc9/k1;

    .line 216
    .line 217
    const/16 v4, 0x1a

    .line 218
    .line 219
    invoke-direct {v2, v1, v4}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v5, v2}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v2, Lng/h;

    .line 227
    .line 228
    invoke-direct {v2, v1}, Lng/h;-><init>(Lng/i;)V

    .line 229
    .line 230
    .line 231
    :cond_a
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_d

    .line 236
    .line 237
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    move-object v4, v1

    .line 242
    check-cast v4, Landroid/widget/ImageView;

    .line 243
    .line 244
    const-string v5, "mListenerInfo"

    .line 245
    .line 246
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    if-eqz v4, :cond_b

    .line 251
    .line 252
    const-string v5, "mOnClickListener"

    .line 253
    .line 254
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_8

    .line 259
    :cond_b
    move-object v4, v3

    .line 260
    :goto_8
    instance-of v5, v4, Landroid/view/View$OnClickListener;

    .line 261
    .line 262
    if-eqz v5, :cond_c

    .line 263
    .line 264
    check-cast v4, Landroid/view/View$OnClickListener;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_c
    move-object v4, v3

    .line 268
    :goto_9
    if-ne v4, p1, :cond_a

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_d
    move-object v1, v3

    .line 272
    :goto_a
    check-cast v1, Landroid/widget/ImageView;

    .line 273
    .line 274
    if-eqz v1, :cond_16

    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Lxa/m;->c(Landroid/content/Context;)Landroid/app/Activity;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-eqz p1, :cond_16

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v4, "com.tencent.mm.plugin.sns.ui.SnsUserUI"

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-nez v2, :cond_e

    .line 301
    .line 302
    goto/16 :goto_f

    .line 303
    .line 304
    :cond_e
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    if-eqz v2, :cond_f

    .line 309
    .line 310
    const-string v4, "sns_userName"

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-eqz v2, :cond_f

    .line 317
    .line 318
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    goto :goto_b

    .line 327
    :cond_f
    move-object v2, v3

    .line 328
    :goto_b
    if-nez v2, :cond_10

    .line 329
    .line 330
    const-string v2, ""

    .line 331
    .line 332
    :cond_10
    invoke-static {v2}, Lxa/m;->f(Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-nez v4, :cond_11

    .line 337
    .line 338
    goto :goto_f

    .line 339
    :cond_11
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-nez v4, :cond_12

    .line 344
    .line 345
    invoke-virtual {v0, v1}, Lxa/m;->h(Landroid/view/View;)Landroid/view/View$OnLongClickListener;

    .line 346
    .line 347
    .line 348
    goto :goto_f

    .line 349
    :cond_12
    iget-object v4, v0, Lxa/m;->i:Ljava/util/Map;

    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    monitor-enter v4

    .line 355
    :try_start_0
    iget-object v5, v0, Lxa/m;->i:Ljava/util/Map;

    .line 356
    .line 357
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    check-cast v5, Lxa/h;

    .line 362
    .line 363
    if-eqz v5, :cond_13

    .line 364
    .line 365
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 366
    .line 367
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    iput-object v0, v5, Lxa/h;->a:Ljava/lang/ref/WeakReference;

    .line 371
    .line 372
    iput-object v2, v5, Lxa/h;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
    .line 374
    :goto_c
    monitor-exit v4

    .line 375
    goto :goto_f

    .line 376
    :catchall_0
    move-exception p1

    .line 377
    goto :goto_e

    .line 378
    :cond_13
    :try_start_1
    const-string v5, "mListenerInfo"

    .line 379
    .line 380
    invoke-static {v1, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    if-eqz v5, :cond_14

    .line 385
    .line 386
    const-string v6, "mOnLongClickListener"

    .line 387
    .line 388
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    goto :goto_d

    .line 393
    :cond_14
    move-object v5, v3

    .line 394
    :goto_d
    instance-of v6, v5, Landroid/view/View$OnLongClickListener;

    .line 395
    .line 396
    if-eqz v6, :cond_15

    .line 397
    .line 398
    move-object v3, v5

    .line 399
    check-cast v3, Landroid/view/View$OnLongClickListener;

    .line 400
    .line 401
    :cond_15
    iget-object v5, v0, Lxa/m;->i:Ljava/util/Map;

    .line 402
    .line 403
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    check-cast v5, Ljava/util/Map;

    .line 407
    .line 408
    new-instance v6, Lxa/h;

    .line 409
    .line 410
    new-instance v7, Ljava/lang/ref/WeakReference;

    .line 411
    .line 412
    invoke-direct {v7, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Landroid/view/View;->isLongClickable()Z

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    invoke-direct {v6, v7, v2, v3, p1}, Lxa/h;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Landroid/view/View$OnLongClickListener;Z)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v5, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    new-instance p1, Lxa/g;

    .line 426
    .line 427
    invoke-direct {p1, v0}, Lxa/g;-><init>(Lxa/m;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 431
    .line 432
    .line 433
    goto :goto_c

    .line 434
    :goto_e
    monitor-exit v4

    .line 435
    throw p1

    .line 436
    :cond_16
    :goto_f
    return-void

    .line 437
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    iget-object v0, p0, Lxa/k;->b:Lxa/m;

    .line 441
    .line 442
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-nez v1, :cond_17

    .line 447
    .line 448
    goto/16 :goto_21

    .line 449
    .line 450
    :cond_17
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 451
    .line 452
    const/4 v2, 0x0

    .line 453
    const/4 v3, 0x0

    .line 454
    if-eqz v1, :cond_18

    .line 455
    .line 456
    invoke-static {v3, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    goto :goto_10

    .line 461
    :cond_18
    move-object v1, v2

    .line 462
    :goto_10
    instance-of v4, v1, Landroid/view/ContextMenu;

    .line 463
    .line 464
    if-eqz v4, :cond_19

    .line 465
    .line 466
    check-cast v1, Landroid/view/ContextMenu;

    .line 467
    .line 468
    goto :goto_11

    .line 469
    :cond_19
    move-object v1, v2

    .line 470
    :goto_11
    if-eqz v1, :cond_2e

    .line 471
    .line 472
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 473
    .line 474
    if-eqz v4, :cond_1c

    .line 475
    .line 476
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    invoke-static {v5}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    new-instance v6, Lwb/sr;

    .line 489
    .line 490
    const/16 v7, 0x1c

    .line 491
    .line 492
    invoke-direct {v6, v7}, Lwb/sr;-><init>(I)V

    .line 493
    .line 494
    .line 495
    new-instance v7, Lng/i;

    .line 496
    .line 497
    invoke-direct {v7, v5, v3, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 498
    .line 499
    .line 500
    new-instance v5, Lc9/k1;

    .line 501
    .line 502
    const/16 v6, 0x1b

    .line 503
    .line 504
    invoke-direct {v5, v4, v6}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 505
    .line 506
    .line 507
    invoke-static {v7, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    new-instance v5, Lwb/sr;

    .line 512
    .line 513
    const/16 v6, 0x16

    .line 514
    .line 515
    invoke-direct {v5, v6}, Lwb/sr;-><init>(I)V

    .line 516
    .line 517
    .line 518
    invoke-static {v4, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    new-instance v5, Lng/h;

    .line 523
    .line 524
    invoke-direct {v5, v4}, Lng/h;-><init>(Lng/i;)V

    .line 525
    .line 526
    .line 527
    :cond_1a
    invoke-virtual {v5}, Lng/h;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-eqz v4, :cond_1b

    .line 532
    .line 533
    invoke-virtual {v5}, Lng/h;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    move-object v6, v4

    .line 538
    check-cast v6, Ljava/lang/reflect/Method;

    .line 539
    .line 540
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 545
    .line 546
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    if-eqz v7, :cond_1a

    .line 551
    .line 552
    const-string v7, "com.tencent.mm.ui.conversation."

    .line 553
    .line 554
    invoke-static {v6, v3, v7}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 555
    .line 556
    .line 557
    move-result v6

    .line 558
    if-eqz v6, :cond_1a

    .line 559
    .line 560
    goto :goto_12

    .line 561
    :cond_1b
    move-object v4, v2

    .line 562
    :goto_12
    check-cast v4, Ljava/lang/reflect/Method;

    .line 563
    .line 564
    if-eqz v4, :cond_1c

    .line 565
    .line 566
    new-instance v5, Lxa/k;

    .line 567
    .line 568
    const/4 v6, 0x1

    .line 569
    invoke-direct {v5, v0, v6}, Lxa/k;-><init>(Lxa/m;I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v4, v5}, Lxa/m;->e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    goto :goto_13

    .line 577
    :cond_1c
    move v4, v3

    .line 578
    :goto_13
    if-nez v4, :cond_1d

    .line 579
    .line 580
    goto/16 :goto_21

    .line 581
    .line 582
    :cond_1d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 583
    .line 584
    const/4 v4, 0x1

    .line 585
    if-eqz p1, :cond_21

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-static {v5}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    new-instance v7, Lwb/sr;

    .line 600
    .line 601
    const/16 v8, 0x17

    .line 602
    .line 603
    invoke-direct {v7, v8}, Lwb/sr;-><init>(I)V

    .line 604
    .line 605
    .line 606
    new-instance v8, Lng/i;

    .line 607
    .line 608
    invoke-direct {v8, v6, v4, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 609
    .line 610
    .line 611
    new-instance v6, Lc9/k1;

    .line 612
    .line 613
    const/16 v7, 0x18

    .line 614
    .line 615
    invoke-direct {v6, p1, v7}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 616
    .line 617
    .line 618
    invoke-static {v8, v6}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    invoke-static {v6}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    check-cast v6, Landroid/app/Activity;

    .line 627
    .line 628
    if-eqz v6, :cond_21

    .line 629
    .line 630
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    if-eqz v7, :cond_21

    .line 635
    .line 636
    new-instance v8, Ldg/n;

    .line 637
    .line 638
    const/4 v9, 0x6

    .line 639
    invoke-direct {v8, v5, v9}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 640
    .line 641
    .line 642
    new-instance v5, Lwb/sr;

    .line 643
    .line 644
    const/16 v9, 0x18

    .line 645
    .line 646
    invoke-direct {v5, v9}, Lwb/sr;-><init>(I)V

    .line 647
    .line 648
    .line 649
    new-instance v9, Lng/i;

    .line 650
    .line 651
    invoke-direct {v9, v8, v4, v5}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 652
    .line 653
    .line 654
    new-instance v5, Lc9/k1;

    .line 655
    .line 656
    const/16 v8, 0x19

    .line 657
    .line 658
    invoke-direct {v5, p1, v8}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 659
    .line 660
    .line 661
    invoke-static {v9, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    new-instance v5, Lwb/sr;

    .line 666
    .line 667
    invoke-direct {v5, v8}, Lwb/sr;-><init>(I)V

    .line 668
    .line 669
    .line 670
    invoke-static {p1, v5}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    new-instance v5, Lwb/sr;

    .line 675
    .line 676
    const/16 v8, 0x1a

    .line 677
    .line 678
    invoke-direct {v5, v8}, Lwb/sr;-><init>(I)V

    .line 679
    .line 680
    .line 681
    new-instance v8, Lng/i;

    .line 682
    .line 683
    invoke-direct {v8, p1, v4, v5}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 684
    .line 685
    .line 686
    new-instance p1, Lng/h;

    .line 687
    .line 688
    invoke-direct {p1, v8}, Lng/h;-><init>(Lng/i;)V

    .line 689
    .line 690
    .line 691
    :cond_1e
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-eqz v5, :cond_20

    .line 696
    .line 697
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    move-object v8, v5

    .line 702
    check-cast v8, Ljava/lang/String;

    .line 703
    .line 704
    :try_start_2
    invoke-virtual {v7, v8}, Lg8/i;->H(Ljava/lang/String;)Z

    .line 705
    .line 706
    .line 707
    move-result v8

    .line 708
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 709
    .line 710
    .line 711
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 712
    goto :goto_14

    .line 713
    :catchall_1
    move-exception v8

    .line 714
    new-instance v9, Lsf/f;

    .line 715
    .line 716
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 717
    .line 718
    .line 719
    move-object v8, v9

    .line 720
    :goto_14
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 721
    .line 722
    instance-of v10, v8, Lsf/f;

    .line 723
    .line 724
    if-eqz v10, :cond_1f

    .line 725
    .line 726
    move-object v8, v9

    .line 727
    :cond_1f
    check-cast v8, Ljava/lang/Boolean;

    .line 728
    .line 729
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    if-eqz v8, :cond_1e

    .line 734
    .line 735
    goto :goto_15

    .line 736
    :cond_20
    move-object v5, v2

    .line 737
    :goto_15
    check-cast v5, Ljava/lang/String;

    .line 738
    .line 739
    if-eqz v5, :cond_21

    .line 740
    .line 741
    new-instance p1, Lxa/i;

    .line 742
    .line 743
    invoke-direct {p1, v6, v5, v3}, Lxa/i;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 744
    .line 745
    .line 746
    goto :goto_16

    .line 747
    :cond_21
    move-object p1, v2

    .line 748
    :goto_16
    if-eqz p1, :cond_2e

    .line 749
    .line 750
    const v5, 0x4843524d    # 200009.2f

    .line 751
    .line 752
    .line 753
    invoke-interface {v1, v5}, Landroid/view/Menu;->removeItem(I)V

    .line 754
    .line 755
    .line 756
    :try_start_3
    invoke-interface {v1, v3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-interface {v6}, Landroid/view/MenuItem;->getGroupId()I

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 765
    .line 766
    .line 767
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 768
    goto :goto_17

    .line 769
    :catchall_2
    move-exception v6

    .line 770
    new-instance v7, Lsf/f;

    .line 771
    .line 772
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 773
    .line 774
    .line 775
    move-object v6, v7

    .line 776
    :goto_17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object v7

    .line 780
    instance-of v8, v6, Lsf/f;

    .line 781
    .line 782
    if-eqz v8, :cond_22

    .line 783
    .line 784
    move-object v6, v7

    .line 785
    :cond_22
    check-cast v6, Ljava/lang/Number;

    .line 786
    .line 787
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 788
    .line 789
    .line 790
    move-result v6

    .line 791
    const-string v7, "\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 792
    .line 793
    invoke-interface {v1, v6, v5, v3, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 794
    .line 795
    .line 796
    move-result-object v6

    .line 797
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    :goto_18
    if-eqz v7, :cond_2d

    .line 805
    .line 806
    const-class v8, Ljava/lang/Object;

    .line 807
    .line 808
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v8

    .line 812
    if-nez v8, :cond_2d

    .line 813
    .line 814
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    :cond_23
    :goto_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 823
    .line 824
    .line 825
    move-result v9

    .line 826
    if-eqz v9, :cond_2c

    .line 827
    .line 828
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    check-cast v9, Ljava/lang/reflect/Field;

    .line 833
    .line 834
    const-class v10, Ljava/util/List;

    .line 835
    .line 836
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    move-result-object v11

    .line 840
    invoke-virtual {v10, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 841
    .line 842
    .line 843
    move-result v10

    .line 844
    if-nez v10, :cond_24

    .line 845
    .line 846
    goto :goto_19

    .line 847
    :cond_24
    invoke-static {v9, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v9

    .line 851
    invoke-static {v9}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v10

    .line 855
    if-eqz v10, :cond_25

    .line 856
    .line 857
    check-cast v9, Ljava/util/List;

    .line 858
    .line 859
    goto :goto_1a

    .line 860
    :cond_25
    move-object v9, v2

    .line 861
    :goto_1a
    if-eqz v9, :cond_23

    .line 862
    .line 863
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    move v11, v3

    .line 868
    :goto_1b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 869
    .line 870
    .line 871
    move-result v12

    .line 872
    if-eqz v12, :cond_2a

    .line 873
    .line 874
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v12

    .line 878
    if-eq v12, v6, :cond_28

    .line 879
    .line 880
    instance-of v13, v12, Landroid/view/MenuItem;

    .line 881
    .line 882
    if-eqz v13, :cond_26

    .line 883
    .line 884
    check-cast v12, Landroid/view/MenuItem;

    .line 885
    .line 886
    goto :goto_1c

    .line 887
    :cond_26
    move-object v12, v2

    .line 888
    :goto_1c
    if-eqz v12, :cond_27

    .line 889
    .line 890
    invoke-interface {v12}, Landroid/view/MenuItem;->getItemId()I

    .line 891
    .line 892
    .line 893
    move-result v12

    .line 894
    if-ne v12, v5, :cond_27

    .line 895
    .line 896
    goto :goto_1d

    .line 897
    :cond_27
    move v12, v3

    .line 898
    goto :goto_1e

    .line 899
    :cond_28
    :goto_1d
    move v12, v4

    .line 900
    :goto_1e
    if-eqz v12, :cond_29

    .line 901
    .line 902
    goto :goto_1f

    .line 903
    :cond_29
    add-int/lit8 v11, v11, 0x1

    .line 904
    .line 905
    goto :goto_1b

    .line 906
    :cond_2a
    const/4 v11, -0x1

    .line 907
    :goto_1f
    if-lez v11, :cond_2b

    .line 908
    .line 909
    :try_start_4
    invoke-interface {v9, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v10

    .line 913
    invoke-interface {v9, v3, v10}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 914
    .line 915
    .line 916
    :catchall_3
    :cond_2b
    if-ltz v11, :cond_23

    .line 917
    .line 918
    goto :goto_20

    .line 919
    :cond_2c
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    move-result-object v7

    .line 923
    goto :goto_18

    .line 924
    :cond_2d
    :goto_20
    iget-object v0, v0, Lxa/m;->f:Ljava/util/Map;

    .line 925
    .line 926
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    check-cast v0, Ljava/util/Map;

    .line 930
    .line 931
    invoke-interface {v0, v6, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    :cond_2e
    :goto_21
    return-void

    .line 935
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, Lxa/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lxa/k;->b:Lxa/m;

    .line 14
    .line 15
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v3, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, v2

    .line 34
    :goto_0
    instance-of v3, v1, Landroid/view/MenuItem;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    check-cast v1, Landroid/view/MenuItem;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_1
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const v4, 0x4843524d    # 200009.2f

    .line 49
    .line 50
    .line 51
    if-eq v3, v4, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    iget-object v3, v0, Lxa/m;->f:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lxa/i;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v0, Lxa/m;->d:Landroid/os/Handler;

    .line 68
    .line 69
    new-instance v2, Lxa/d;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v2, v0, v1, v3}, Lxa/d;-><init>(Lxa/m;Lxa/i;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_2
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
