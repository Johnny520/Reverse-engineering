.class public final Lr0/c1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/f1;


# direct methods
.method public synthetic constructor <init>(Lr0/f1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/c1;->a:I

    iput-object p1, p0, Lr0/c1;->b:Lr0/f1;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "param"

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, p0, Lr0/c1;->a:I

    .line 7
    .line 8
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_f

    .line 21
    .line 22
    :cond_0
    sget-boolean v2, Lz0/i;->a:Z

    .line 23
    .line 24
    invoke-static {}, Lz0/g;->C()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sget-object v4, LF0/s;->a:LF0/s;

    .line 29
    .line 30
    if-eqz v2, :cond_c

    .line 31
    .line 32
    sget-object v2, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    sget-object v2, Lz0/w;->g:LA0/W;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, v2, LA0/W;->i:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v2, v0

    .line 42
    :goto_0
    if-nez v2, :cond_2

    .line 43
    .line 44
    move-object v2, v4

    .line 45
    :cond_2
    sget-object v5, Lz0/w;->l:[Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2, v5}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    sget-object v6, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-static {v6, v5}, Lz0/w;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object v5, v0

    .line 89
    :goto_1
    if-nez v5, :cond_5

    .line 90
    .line 91
    goto :goto_8

    .line 92
    :cond_5
    :try_start_0
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    instance-of v6, v2, Ljava/lang/Number;

    .line 100
    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    check-cast v2, Ljava/lang/Number;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v2

    .line 107
    goto :goto_6

    .line 108
    :cond_6
    move-object v2, v0

    .line 109
    :goto_2
    if-eqz v2, :cond_7

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    goto :goto_3

    .line 116
    :cond_7
    move v2, v1

    .line 117
    :goto_3
    if-nez v2, :cond_8

    .line 118
    .line 119
    move v2, v1

    .line 120
    goto :goto_5

    .line 121
    :cond_8
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    invoke-static {v2, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_9

    .line 132
    .line 133
    invoke-virtual {v5, p1, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v5, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_4
    move v2, v3

    .line 145
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    goto :goto_7

    .line 150
    :goto_6
    new-instance v5, LE0/d;

    .line 151
    .line 152
    invoke-direct {v5, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    move-object v2, v5

    .line 156
    :goto_7
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v5, :cond_a

    .line 161
    .line 162
    const-string v6, "sns clear group icon flag fail"

    .line 163
    .line 164
    filled-new-array {v6, v5}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5}, Li0/a;->d([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_a
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 172
    .line 173
    instance-of v6, v2, LE0/d;

    .line 174
    .line 175
    if-eqz v6, :cond_b

    .line 176
    .line 177
    move-object v2, v5

    .line 178
    :cond_b
    check-cast v2, Ljava/lang/Boolean;

    .line 179
    .line 180
    :cond_c
    :goto_8
    sget-boolean v2, Lz0/i;->a:Z

    .line 181
    .line 182
    invoke-static {}, Lz0/g;->x()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_1b

    .line 187
    .line 188
    invoke-static {}, Lz0/g;->s()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_d

    .line 193
    .line 194
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsLike()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_d

    .line 203
    .line 204
    move v1, v3

    .line 205
    :cond_d
    if-eqz v1, :cond_1b

    .line 206
    .line 207
    sget-object v1, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 208
    .line 209
    iget-object v1, p0, Lr0/c1;->b:Lr0/f1;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lr0/f1;->h()Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_e

    .line 223
    .line 224
    goto/16 :goto_f

    .line 225
    .line 226
    :cond_e
    sget-object v2, Lz0/w;->g:LA0/W;

    .line 227
    .line 228
    if-eqz v2, :cond_f

    .line 229
    .line 230
    iget-object v2, v2, LA0/W;->j:Ljava/util/List;

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_f
    move-object v2, v0

    .line 234
    :goto_9
    if-nez v2, :cond_10

    .line 235
    .line 236
    move-object v2, v4

    .line 237
    :cond_10
    sget-object v3, Lz0/w;->m:[Ljava/lang/String;

    .line 238
    .line 239
    invoke-static {v2, v3}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    sget-object v3, Lz0/w;->g:LA0/W;

    .line 252
    .line 253
    if-eqz v3, :cond_11

    .line 254
    .line 255
    iget-object v3, v3, LA0/W;->k:Ljava/util/List;

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_11
    move-object v3, v0

    .line 259
    :goto_a
    if-nez v3, :cond_12

    .line 260
    .line 261
    move-object v3, v4

    .line 262
    :cond_12
    sget-object v5, Lz0/w;->n:[Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v3, v5}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    sget-object v5, Lz0/w;->g:LA0/W;

    .line 277
    .line 278
    if-eqz v5, :cond_13

    .line 279
    .line 280
    iget-object v5, v5, LA0/W;->l:Ljava/util/List;

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_13
    move-object v5, v0

    .line 284
    :goto_b
    if-nez v5, :cond_14

    .line 285
    .line 286
    move-object v5, v4

    .line 287
    :cond_14
    sget-object v6, Lz0/w;->o:[Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v5, v6}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v5}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-static {v5}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-static {p1, v2, v3, v5, v1}, Lz0/w;->f(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;)I

    .line 302
    .line 303
    .line 304
    sget-object v2, Lz0/w;->g:LA0/W;

    .line 305
    .line 306
    if-eqz v2, :cond_15

    .line 307
    .line 308
    iget-object v2, v2, LA0/W;->m:Ljava/util/List;

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_15
    move-object v2, v0

    .line 312
    :goto_c
    if-nez v2, :cond_16

    .line 313
    .line 314
    move-object v2, v4

    .line 315
    :cond_16
    sget-object v3, Lz0/w;->p:[Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v2, v3}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v2}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    sget-object v3, Lz0/w;->g:LA0/W;

    .line 330
    .line 331
    if-eqz v3, :cond_17

    .line 332
    .line 333
    iget-object v3, v3, LA0/W;->n:Ljava/util/List;

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_17
    move-object v3, v0

    .line 337
    :goto_d
    if-nez v3, :cond_18

    .line 338
    .line 339
    move-object v3, v4

    .line 340
    :cond_18
    sget-object v5, Lz0/w;->q:[Ljava/lang/String;

    .line 341
    .line 342
    invoke-static {v3, v5}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-static {v3}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    sget-object v5, Lz0/w;->g:LA0/W;

    .line 355
    .line 356
    if-eqz v5, :cond_19

    .line 357
    .line 358
    iget-object v0, v5, LA0/W;->o:Ljava/util/List;

    .line 359
    .line 360
    :cond_19
    if-nez v0, :cond_1a

    .line 361
    .line 362
    goto :goto_e

    .line 363
    :cond_1a
    move-object v4, v0

    .line 364
    :goto_e
    sget-object v0, Lz0/w;->r:[Ljava/lang/String;

    .line 365
    .line 366
    invoke-static {v4, v0}, LF0/k;->p0(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {p1, v2, v3, v0, v1}, Lz0/w;->f(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;)I

    .line 379
    .line 380
    .line 381
    :cond_1b
    :goto_f
    return-void

    .line 382
    :pswitch_0
    sget-boolean v2, Lz0/i;->a:Z

    .line 383
    .line 384
    invoke-static {}, Lz0/g;->C()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-nez v2, :cond_1c

    .line 389
    .line 390
    goto :goto_11

    .line 391
    :cond_1c
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 392
    .line 393
    instance-of v2, p1, Landroid/app/Activity;

    .line 394
    .line 395
    if-eqz v2, :cond_1d

    .line 396
    .line 397
    move-object v0, p1

    .line 398
    check-cast v0, Landroid/app/Activity;

    .line 399
    .line 400
    :cond_1d
    iget-object p1, p0, Lr0/c1;->b:Lr0/f1;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    if-nez v0, :cond_1e

    .line 406
    .line 407
    goto :goto_11

    .line 408
    :cond_1e
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    if-eqz p1, :cond_21

    .line 413
    .line 414
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    if-nez p1, :cond_1f

    .line 419
    .line 420
    goto :goto_11

    .line 421
    :cond_1f
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    const-string v4, "pt"

    .line 430
    .line 431
    const-string v5, "id"

    .line 432
    .line 433
    invoke-virtual {v2, v4, v5, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-nez v0, :cond_20

    .line 438
    .line 439
    goto :goto_11

    .line 440
    :cond_20
    sget-object v2, Lr0/f1;->k:[J

    .line 441
    .line 442
    :goto_10
    const/4 v4, 0x6

    .line 443
    if-ge v1, v4, :cond_21

    .line 444
    .line 445
    aget-wide v4, v2, v1

    .line 446
    .line 447
    new-instance v6, LA0/q;

    .line 448
    .line 449
    invoke-direct {v6, p1, v0, v3}, LA0/q;-><init>(Landroid/view/View;II)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {p1, v6, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 453
    .line 454
    .line 455
    add-int/2addr v1, v3

    .line 456
    goto :goto_10

    .line 457
    :cond_21
    :goto_11
    return-void

    .line 458
    nop

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
