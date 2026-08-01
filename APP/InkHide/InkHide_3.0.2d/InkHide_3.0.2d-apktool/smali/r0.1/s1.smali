.class public final Lr0/s1;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/t1;

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Lr0/t1;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/s1;->a:I

    iput-object p1, p0, Lr0/s1;->b:Lr0/t1;

    iput-object p2, p0, Lr0/s1;->c:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "call"

    .line 6
    .line 7
    const-string v3, "args"

    .line 8
    .line 9
    const-string v4, "voip"

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    .line 13
    const-string v7, "masked="

    .line 14
    .line 15
    const-string v8, "enabled="

    .line 16
    .line 17
    iget-object v10, v0, Lr0/s1;->c:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    iget-object v11, v0, Lr0/s1;->b:Lr0/t1;

    .line 20
    .line 21
    const-string v12, "param"

    .line 22
    .line 23
    const/4 v13, 0x1

    .line 24
    iget v14, v0, Lr0/s1;->a:I

    .line 25
    .line 26
    packed-switch v14, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    array-length v3, v2

    .line 40
    const/4 v12, 0x0

    .line 41
    :goto_0
    if-ge v12, v3, :cond_1

    .line 42
    .line 43
    aget-object v14, v2, v12

    .line 44
    .line 45
    instance-of v15, v14, Landroid/view/View;

    .line 46
    .line 47
    if-eqz v15, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    add-int/2addr v12, v13

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v14, 0x0

    .line 53
    :goto_1
    instance-of v2, v14, Landroid/view/View;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    check-cast v14, Landroid/view/View;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 v14, 0x0

    .line 61
    :goto_2
    if-nez v14, :cond_3

    .line 62
    .line 63
    goto/16 :goto_1b

    .line 64
    .line 65
    :cond_3
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 66
    .line 67
    if-eqz v2, :cond_5

    .line 68
    .line 69
    array-length v3, v2

    .line 70
    const/4 v12, 0x0

    .line 71
    :goto_3
    if-ge v12, v3, :cond_5

    .line 72
    .line 73
    aget-object v15, v2, v12

    .line 74
    .line 75
    instance-of v6, v15, Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    if-eqz v6, :cond_4

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    add-int/2addr v12, v13

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    const/4 v15, 0x0

    .line 83
    :goto_4
    instance-of v2, v15, Landroid/view/ViewGroup$LayoutParams;

    .line 84
    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    check-cast v15, Landroid/view/ViewGroup$LayoutParams;

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    const/4 v15, 0x0

    .line 91
    :goto_5
    if-nez v15, :cond_7

    .line 92
    .line 93
    goto/16 :goto_1b

    .line 94
    .line 95
    :cond_7
    instance-of v2, v15, Landroid/view/WindowManager$LayoutParams;

    .line 96
    .line 97
    if-eqz v2, :cond_8

    .line 98
    .line 99
    move-object v3, v15

    .line 100
    check-cast v3, Landroid/view/WindowManager$LayoutParams;

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_8
    const/4 v3, 0x0

    .line 104
    :goto_6
    const-string v6, " height="

    .line 105
    .line 106
    const-string v12, " width="

    .line 107
    .line 108
    if-eqz v3, :cond_9

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    iget-object v13, v3, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 115
    .line 116
    iget v0, v3, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 117
    .line 118
    move/from16 v17, v2

    .line 119
    .line 120
    iget v2, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 121
    .line 122
    move-object/from16 v18, v5

    .line 123
    .line 124
    iget v5, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 125
    .line 126
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    move-object/from16 v19, v10

    .line 131
    .line 132
    const-string v10, "title="

    .line 133
    .line 134
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v9, " package="

    .line 141
    .line 142
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v9, " type="

    .line 149
    .line 150
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v0, " flags="

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_7

    .line 181
    :cond_9
    move/from16 v17, v2

    .line 182
    .line 183
    move-object/from16 v18, v5

    .line 184
    .line 185
    move-object/from16 v19, v10

    .line 186
    .line 187
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget v1, v15, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 196
    .line 197
    iget v2, v15, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 198
    .line 199
    new-instance v3, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v5, "layout="

    .line 202
    .line 203
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :goto_7
    if-eqz v17, :cond_a

    .line 226
    .line 227
    move-object v1, v15

    .line 228
    check-cast v1, Landroid/view/WindowManager$LayoutParams;

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_a
    const/4 v1, 0x0

    .line 232
    :goto_8
    if-eqz v1, :cond_b

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    if-eqz v2, :cond_b

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    goto :goto_9

    .line 245
    :cond_b
    const/4 v2, 0x0

    .line 246
    :goto_9
    if-nez v2, :cond_c

    .line 247
    .line 248
    move-object/from16 v2, v18

    .line 249
    .line 250
    :cond_c
    if-eqz v1, :cond_d

    .line 251
    .line 252
    iget-object v3, v1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_d
    const/4 v3, 0x0

    .line 256
    :goto_a
    if-nez v3, :cond_e

    .line 257
    .line 258
    move-object/from16 v3, v18

    .line 259
    .line 260
    :cond_e
    const-string v5, "com.tencent.mm"

    .line 261
    .line 262
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    const/16 v6, 0xbb7

    .line 267
    .line 268
    const/16 v9, 0x7d0

    .line 269
    .line 270
    const-string v10, "FloatingWindow"

    .line 271
    .line 272
    if-eqz v3, :cond_11

    .line 273
    .line 274
    new-instance v3, LR0/c;

    .line 275
    .line 276
    const/4 v12, 0x1

    .line 277
    invoke-direct {v3, v9, v6, v12}, LR0/a;-><init>(III)V

    .line 278
    .line 279
    .line 280
    if-eqz v1, :cond_f

    .line 281
    .line 282
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 283
    .line 284
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    goto :goto_b

    .line 289
    :cond_f
    const/4 v1, 0x0

    .line 290
    :goto_b
    if-eqz v1, :cond_10

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    invoke-virtual {v3, v1}, LR0/c;->a(I)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_10

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_10
    const/4 v12, 0x1

    .line 304
    invoke-static {v2, v10, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_11

    .line 309
    .line 310
    :goto_c
    const/4 v1, 0x1

    .line 311
    goto :goto_d

    .line 312
    :cond_11
    const/4 v1, 0x0

    .line 313
    :goto_d
    invoke-static {v14, v4}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    const-string v3, "BaseSmallView"

    .line 318
    .line 319
    if-nez v2, :cond_12

    .line 320
    .line 321
    invoke-static {v14, v3}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-nez v2, :cond_12

    .line 326
    .line 327
    if-nez v1, :cond_12

    .line 328
    .line 329
    const/4 v12, 0x1

    .line 330
    invoke-static {v0, v10, v12}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_2e

    .line 335
    .line 336
    :cond_12
    invoke-static {}, Lr0/t1;->n()Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v17, :cond_13

    .line 341
    .line 342
    move-object v2, v15

    .line 343
    check-cast v2, Landroid/view/WindowManager$LayoutParams;

    .line 344
    .line 345
    goto :goto_e

    .line 346
    :cond_13
    const/4 v2, 0x0

    .line 347
    :goto_e
    if-eqz v2, :cond_14

    .line 348
    .line 349
    invoke-virtual {v2}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    if-eqz v12, :cond_14

    .line 354
    .line 355
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v12

    .line 359
    goto :goto_f

    .line 360
    :cond_14
    const/4 v12, 0x0

    .line 361
    :goto_f
    if-nez v12, :cond_15

    .line 362
    .line 363
    move-object/from16 v12, v18

    .line 364
    .line 365
    :cond_15
    if-eqz v2, :cond_16

    .line 366
    .line 367
    iget-object v13, v2, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 368
    .line 369
    goto :goto_10

    .line 370
    :cond_16
    const/4 v13, 0x0

    .line 371
    :goto_10
    if-nez v13, :cond_17

    .line 372
    .line 373
    move-object/from16 v13, v18

    .line 374
    .line 375
    :cond_17
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v13

    .line 379
    if-eqz v13, :cond_1a

    .line 380
    .line 381
    new-instance v13, LR0/c;

    .line 382
    .line 383
    move-object/from16 v20, v15

    .line 384
    .line 385
    const/4 v15, 0x1

    .line 386
    invoke-direct {v13, v9, v6, v15}, LR0/a;-><init>(III)V

    .line 387
    .line 388
    .line 389
    if-eqz v2, :cond_18

    .line 390
    .line 391
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 392
    .line 393
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    goto :goto_11

    .line 398
    :cond_18
    const/4 v2, 0x0

    .line 399
    :goto_11
    if-eqz v2, :cond_19

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    invoke-virtual {v13, v2}, LR0/c;->a(I)Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz v2, :cond_19

    .line 410
    .line 411
    const/4 v15, 0x1

    .line 412
    goto :goto_12

    .line 413
    :cond_19
    const/4 v15, 0x1

    .line 414
    invoke-static {v12, v10, v15}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-eqz v2, :cond_1b

    .line 419
    .line 420
    goto :goto_12

    .line 421
    :cond_1a
    move-object/from16 v20, v15

    .line 422
    .line 423
    const/4 v15, 0x1

    .line 424
    :cond_1b
    if-nez v1, :cond_1c

    .line 425
    .line 426
    invoke-static {v14, v4}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-nez v2, :cond_1c

    .line 431
    .line 432
    invoke-static {v14, v3}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-nez v2, :cond_1c

    .line 437
    .line 438
    invoke-static {v0, v10, v15}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_1d

    .line 443
    .line 444
    :cond_1c
    :goto_12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const/16 v0, 0x20

    .line 453
    .line 454
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const/4 v0, 0x4

    .line 458
    invoke-static {v14, v0, v2}, Lr0/t1;->l(Landroid/view/View;ILjava/lang/StringBuilder;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    const-string v2, "toString(...)"

    .line 466
    .line 467
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    :cond_1d
    invoke-static {v0}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    if-nez v2, :cond_1e

    .line 475
    .line 476
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    :cond_1e
    if-nez v1, :cond_20

    .line 481
    .line 482
    invoke-static {v14, v4}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    if-nez v4, :cond_20

    .line 487
    .line 488
    invoke-static {v14, v3}, Lr0/t1;->c0(Landroid/view/View;Ljava/lang/String;)Z

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    if-nez v3, :cond_20

    .line 493
    .line 494
    invoke-static {v0}, Lr0/t1;->N(Ljava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-eqz v3, :cond_1f

    .line 499
    .line 500
    goto :goto_13

    .line 501
    :cond_1f
    const/4 v3, 0x0

    .line 502
    goto :goto_14

    .line 503
    :cond_20
    :goto_13
    const/4 v3, 0x1

    .line 504
    :goto_14
    const-string v4, "floating-window"

    .line 505
    .line 506
    const/4 v6, 0x0

    .line 507
    invoke-virtual {v11, v2, v6, v0, v4}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 508
    .line 509
    .line 510
    move-result v12

    .line 511
    if-nez v2, :cond_28

    .line 512
    .line 513
    invoke-static {}, Lr0/t1;->A()Z

    .line 514
    .line 515
    .line 516
    move-result v13

    .line 517
    if-eqz v13, :cond_28

    .line 518
    .line 519
    invoke-virtual {v11}, Lr0/t1;->T()Z

    .line 520
    .line 521
    .line 522
    move-result v13

    .line 523
    if-eqz v13, :cond_28

    .line 524
    .line 525
    invoke-virtual {v11, v6}, Lr0/t1;->R(Ljava/lang/String;)Z

    .line 526
    .line 527
    .line 528
    move-result v13

    .line 529
    if-nez v13, :cond_28

    .line 530
    .line 531
    sget-boolean v6, Lz0/i;->a:Z

    .line 532
    .line 533
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 534
    .line 535
    .line 536
    move-result-object v6

    .line 537
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    if-eqz v6, :cond_21

    .line 542
    .line 543
    goto :goto_17

    .line 544
    :cond_21
    if-eqz v17, :cond_22

    .line 545
    .line 546
    move-object/from16 v6, v20

    .line 547
    .line 548
    check-cast v6, Landroid/view/WindowManager$LayoutParams;

    .line 549
    .line 550
    goto :goto_15

    .line 551
    :cond_22
    const/4 v6, 0x0

    .line 552
    :goto_15
    if-nez v6, :cond_23

    .line 553
    .line 554
    goto :goto_17

    .line 555
    :cond_23
    invoke-virtual {v6}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    .line 556
    .line 557
    .line 558
    move-result-object v13

    .line 559
    if-eqz v13, :cond_24

    .line 560
    .line 561
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v13

    .line 565
    goto :goto_16

    .line 566
    :cond_24
    const/4 v13, 0x0

    .line 567
    :goto_16
    if-nez v13, :cond_25

    .line 568
    .line 569
    move-object/from16 v13, v18

    .line 570
    .line 571
    :cond_25
    iget-object v14, v6, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 572
    .line 573
    if-nez v14, :cond_26

    .line 574
    .line 575
    move-object/from16 v14, v18

    .line 576
    .line 577
    :cond_26
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-eqz v5, :cond_28

    .line 582
    .line 583
    const/4 v15, 0x1

    .line 584
    invoke-static {v13, v10, v15}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    if-nez v5, :cond_27

    .line 589
    .line 590
    invoke-static {v0, v10, v15}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    if-eqz v5, :cond_28

    .line 595
    .line 596
    :cond_27
    iget v5, v6, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 597
    .line 598
    if-gt v9, v5, :cond_28

    .line 599
    .line 600
    const/16 v6, 0xbb8

    .line 601
    .line 602
    if-ge v5, v6, :cond_28

    .line 603
    .line 604
    if-eqz v3, :cond_28

    .line 605
    .line 606
    const/4 v3, 0x1

    .line 607
    goto :goto_18

    .line 608
    :cond_28
    :goto_17
    const/4 v3, 0x0

    .line 609
    :goto_18
    if-nez v12, :cond_2a

    .line 610
    .line 611
    if-eqz v3, :cond_29

    .line 612
    .line 613
    goto :goto_19

    .line 614
    :cond_29
    const/4 v6, 0x0

    .line 615
    goto :goto_1a

    .line 616
    :cond_2a
    :goto_19
    const/4 v6, 0x1

    .line 617
    :goto_1a
    invoke-static/range {v19 .. v19}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v21

    .line 621
    invoke-static {}, Lr0/t1;->A()Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    invoke-static {v8, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v22

    .line 629
    invoke-static {v7, v2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v23

    .line 633
    const-string v3, "block="

    .line 634
    .line 635
    invoke-static {v3, v6}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v24

    .line 639
    const-string v3, "stack="

    .line 640
    .line 641
    invoke-static {v3, v1}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v25

    .line 645
    invoke-static {v0}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v26

    .line 649
    const-string v20, "voip floating window"

    .line 650
    .line 651
    filled-new-array/range {v20 .. v26}, [Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    if-nez v6, :cond_2b

    .line 659
    .line 660
    goto :goto_1b

    .line 661
    :cond_2b
    if-eqz v2, :cond_2c

    .line 662
    .line 663
    invoke-virtual {v11, v2, v4}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    :cond_2c
    invoke-virtual {v11, v4, v2}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    invoke-static/range {v19 .. v19}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    if-nez v2, :cond_2d

    .line 674
    .line 675
    move-object v2, v4

    .line 676
    :cond_2d
    const-string v1, "block voip floating window"

    .line 677
    .line 678
    filled-new-array {v1, v0, v2}, [Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    move-object/from16 v1, p1

    .line 686
    .line 687
    move-object/from16 v0, v19

    .line 688
    .line 689
    const/4 v6, 0x0

    .line 690
    invoke-static {v1, v0, v6}, Lr0/t1;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Ljava/lang/Integer;)V

    .line 691
    .line 692
    .line 693
    :cond_2e
    :goto_1b
    return-void

    .line 694
    :pswitch_0
    move-object/from16 v18, v5

    .line 695
    .line 696
    move-object v0, v10

    .line 697
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    iget-object v5, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 701
    .line 702
    instance-of v6, v5, Landroid/app/Service;

    .line 703
    .line 704
    if-eqz v6, :cond_2f

    .line 705
    .line 706
    check-cast v5, Landroid/app/Service;

    .line 707
    .line 708
    goto :goto_1c

    .line 709
    :cond_2f
    const/4 v5, 0x0

    .line 710
    :goto_1c
    if-nez v5, :cond_30

    .line 711
    .line 712
    goto/16 :goto_22

    .line 713
    .line 714
    :cond_30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v6

    .line 722
    iget-object v9, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 723
    .line 724
    invoke-static {v9, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    array-length v3, v9

    .line 728
    const/4 v10, 0x0

    .line 729
    :goto_1d
    if-ge v10, v3, :cond_32

    .line 730
    .line 731
    aget-object v12, v9, v10

    .line 732
    .line 733
    instance-of v13, v12, Landroid/app/Notification;

    .line 734
    .line 735
    if-eqz v13, :cond_31

    .line 736
    .line 737
    goto :goto_1e

    .line 738
    :cond_31
    const/16 v16, 0x1

    .line 739
    .line 740
    add-int/lit8 v10, v10, 0x1

    .line 741
    .line 742
    goto :goto_1d

    .line 743
    :cond_32
    const/4 v12, 0x0

    .line 744
    :goto_1e
    instance-of v3, v12, Landroid/app/Notification;

    .line 745
    .line 746
    if-eqz v3, :cond_33

    .line 747
    .line 748
    move-object v3, v12

    .line 749
    check-cast v3, Landroid/app/Notification;

    .line 750
    .line 751
    goto :goto_1f

    .line 752
    :cond_33
    const/4 v3, 0x0

    .line 753
    :goto_1f
    if-eqz v3, :cond_34

    .line 754
    .line 755
    invoke-static {v11, v3}, Lr0/t1;->e(Lr0/t1;Landroid/app/Notification;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v9

    .line 759
    goto :goto_20

    .line 760
    :cond_34
    const/4 v9, 0x0

    .line 761
    :goto_20
    if-nez v9, :cond_35

    .line 762
    .line 763
    move-object/from16 v9, v18

    .line 764
    .line 765
    :cond_35
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    move-result-object v10

    .line 772
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v10

    .line 776
    const/4 v15, 0x1

    .line 777
    invoke-static {v10, v4, v15}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    if-ne v4, v15, :cond_36

    .line 782
    .line 783
    goto :goto_21

    .line 784
    :cond_36
    invoke-static {v9}, Lr0/t1;->N(Ljava/lang/String;)Z

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    if-nez v4, :cond_37

    .line 789
    .line 790
    if-eqz v3, :cond_39

    .line 791
    .line 792
    iget-object v4, v3, Landroid/app/Notification;->category:Ljava/lang/String;

    .line 793
    .line 794
    invoke-static {v4, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-nez v2, :cond_37

    .line 799
    .line 800
    iget-object v2, v3, Landroid/app/Notification;->fullScreenIntent:Landroid/app/PendingIntent;

    .line 801
    .line 802
    if-eqz v2, :cond_39

    .line 803
    .line 804
    :cond_37
    :goto_21
    invoke-static {v9}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    if-nez v2, :cond_38

    .line 809
    .line 810
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    :cond_38
    invoke-static {}, Lr0/t1;->A()Z

    .line 815
    .line 816
    .line 817
    move-result v3

    .line 818
    invoke-static {v8, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-static {v7, v2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    invoke-static {v9}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    const-string v8, "voip startForeground"

    .line 831
    .line 832
    filled-new-array {v8, v6, v3, v4, v7}, [Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    if-eqz v2, :cond_39

    .line 840
    .line 841
    const-string v3, "startForeground:"

    .line 842
    .line 843
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    const/4 v7, 0x0

    .line 848
    invoke-virtual {v11, v2, v7, v9, v4}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 849
    .line 850
    .line 851
    move-result v4

    .line 852
    if-eqz v4, :cond_39

    .line 853
    .line 854
    const-string v4, "block voip startForeground"

    .line 855
    .line 856
    filled-new-array {v4, v6, v2}, [Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v4

    .line 860
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    invoke-virtual {v11, v3, v2}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v5}, Landroid/app/Service;->stopSelf()V

    .line 871
    .line 872
    .line 873
    invoke-static {v11, v1, v0}, Lr0/t1;->h(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;)V

    .line 874
    .line 875
    .line 876
    :cond_39
    :goto_22
    return-void

    .line 877
    :pswitch_1
    move-object v0, v10

    .line 878
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 882
    .line 883
    instance-of v3, v2, Landroid/app/Service;

    .line 884
    .line 885
    if-eqz v3, :cond_3a

    .line 886
    .line 887
    move-object v9, v2

    .line 888
    check-cast v9, Landroid/app/Service;

    .line 889
    .line 890
    goto :goto_23

    .line 891
    :cond_3a
    const/4 v9, 0x0

    .line 892
    :goto_23
    if-nez v9, :cond_3b

    .line 893
    .line 894
    goto/16 :goto_24

    .line 895
    .line 896
    :cond_3b
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 897
    .line 898
    invoke-static {v11, v2}, Lr0/t1;->b(Lr0/t1;[Ljava/lang/Object;)Ljava/util/List;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    invoke-static {v2}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    check-cast v2, Landroid/content/Intent;

    .line 907
    .line 908
    invoke-static {v2}, Lr0/t1;->W(Landroid/content/Intent;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    if-nez v3, :cond_3c

    .line 913
    .line 914
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    :cond_3c
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    move-result-object v4

    .line 922
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v4

    .line 926
    invoke-static {}, Lr0/t1;->A()Z

    .line 927
    .line 928
    .line 929
    move-result v5

    .line 930
    invoke-static {v8, v5}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v5

    .line 934
    invoke-static {v7, v3}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v6

    .line 938
    if-eqz v2, :cond_3d

    .line 939
    .line 940
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    if-nez v7, :cond_3e

    .line 945
    .line 946
    :cond_3d
    move-object v7, v2

    .line 947
    :cond_3e
    invoke-static {v7}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    const-string v8, "voip service bind"

    .line 952
    .line 953
    filled-new-array {v8, v4, v5, v6, v7}, [Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-static {v4}, Li0/a;->a([Ljava/lang/Object;)V

    .line 958
    .line 959
    .line 960
    if-eqz v3, :cond_41

    .line 961
    .line 962
    if-eqz v2, :cond_3f

    .line 963
    .line 964
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    if-nez v4, :cond_40

    .line 969
    .line 970
    :cond_3f
    move-object v4, v2

    .line 971
    :cond_40
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    move-result-object v5

    .line 979
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    const-string v6, "service-bind:"

    .line 984
    .line 985
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    invoke-virtual {v11, v3, v2, v4, v5}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 990
    .line 991
    .line 992
    move-result v2

    .line 993
    if-eqz v2, :cond_41

    .line 994
    .line 995
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    const-string v4, "block voip service bind"

    .line 1004
    .line 1005
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v2

    .line 1020
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    invoke-virtual {v11, v2, v3}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v9}, Landroid/app/Service;->stopSelf()V

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v11, v1, v0}, Lr0/t1;->h(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;)V

    .line 1031
    .line 1032
    .line 1033
    :cond_41
    :goto_24
    return-void

    .line 1034
    :pswitch_2
    move-object v0, v10

    .line 1035
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    iget-object v4, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1039
    .line 1040
    invoke-static {v4, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    array-length v3, v4

    .line 1044
    const/4 v5, 0x0

    .line 1045
    :goto_25
    if-ge v5, v3, :cond_43

    .line 1046
    .line 1047
    aget-object v6, v4, v5

    .line 1048
    .line 1049
    instance-of v9, v6, Landroid/app/Notification;

    .line 1050
    .line 1051
    const/16 v16, 0x1

    .line 1052
    .line 1053
    if-eqz v9, :cond_42

    .line 1054
    .line 1055
    goto :goto_26

    .line 1056
    :cond_42
    add-int/lit8 v5, v5, 0x1

    .line 1057
    .line 1058
    goto :goto_25

    .line 1059
    :cond_43
    const/4 v6, 0x0

    .line 1060
    const/16 v16, 0x1

    .line 1061
    .line 1062
    :goto_26
    instance-of v3, v6, Landroid/app/Notification;

    .line 1063
    .line 1064
    if-eqz v3, :cond_44

    .line 1065
    .line 1066
    move-object v3, v6

    .line 1067
    check-cast v3, Landroid/app/Notification;

    .line 1068
    .line 1069
    goto :goto_27

    .line 1070
    :cond_44
    const/4 v3, 0x0

    .line 1071
    :goto_27
    if-nez v3, :cond_45

    .line 1072
    .line 1073
    goto/16 :goto_2a

    .line 1074
    .line 1075
    :cond_45
    invoke-static {v11, v3}, Lr0/t1;->e(Lr0/t1;Landroid/app/Notification;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    iget-object v5, v3, Landroid/app/Notification;->category:Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-static {v5, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    if-nez v2, :cond_47

    .line 1086
    .line 1087
    iget-object v2, v3, Landroid/app/Notification;->fullScreenIntent:Landroid/app/PendingIntent;

    .line 1088
    .line 1089
    if-eqz v2, :cond_46

    .line 1090
    .line 1091
    goto :goto_28

    .line 1092
    :cond_46
    const/4 v6, 0x0

    .line 1093
    goto :goto_29

    .line 1094
    :cond_47
    :goto_28
    move/from16 v6, v16

    .line 1095
    .line 1096
    :goto_29
    invoke-static {v4}, Lr0/t1;->N(Ljava/lang/String;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v2

    .line 1100
    if-nez v2, :cond_48

    .line 1101
    .line 1102
    if-nez v6, :cond_48

    .line 1103
    .line 1104
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    if-nez v2, :cond_48

    .line 1109
    .line 1110
    goto :goto_2a

    .line 1111
    :cond_48
    invoke-static {v4}, Lr0/t1;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    if-nez v2, :cond_49

    .line 1116
    .line 1117
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    :cond_49
    invoke-static {v0}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v17

    .line 1125
    invoke-static {}, Lr0/t1;->A()Z

    .line 1126
    .line 1127
    .line 1128
    move-result v0

    .line 1129
    invoke-static {v8, v0}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v18

    .line 1133
    invoke-static {v7, v2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v19

    .line 1137
    const-string v0, "call="

    .line 1138
    .line 1139
    invoke-static {v0, v6}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v20

    .line 1143
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v21

    .line 1147
    const-string v16, "voip notification"

    .line 1148
    .line 1149
    filled-new-array/range {v16 .. v21}, [Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1154
    .line 1155
    .line 1156
    if-eqz v2, :cond_4b

    .line 1157
    .line 1158
    const-string v0, "notification"

    .line 1159
    .line 1160
    const/4 v7, 0x0

    .line 1161
    invoke-virtual {v11, v2, v7, v4, v0}, Lr0/t1;->Y(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    if-eqz v3, :cond_4b

    .line 1166
    .line 1167
    invoke-static {v4}, Lr0/t1;->N(Ljava/lang/String;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v3

    .line 1171
    if-nez v3, :cond_4a

    .line 1172
    .line 1173
    if-nez v6, :cond_4a

    .line 1174
    .line 1175
    invoke-virtual {v11}, Lr0/t1;->S()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    if-eqz v3, :cond_4b

    .line 1180
    .line 1181
    :cond_4a
    invoke-static {v4}, Lr0/t1;->X(Ljava/lang/Object;)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    const-string v4, "block voip notification"

    .line 1186
    .line 1187
    filled-new-array {v4, v2, v3}, [Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v3

    .line 1191
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v11, v2, v0}, Lr0/t1;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v11, v0, v2}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    const/4 v6, 0x0

    .line 1201
    invoke-virtual {v1, v6}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    :cond_4b
    :goto_2a
    return-void

    .line 1205
    :pswitch_3
    move-object v0, v10

    .line 1206
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1210
    .line 1211
    invoke-static {v11, v2}, Lr0/t1;->b(Lr0/t1;[Ljava/lang/Object;)Ljava/util/List;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v2

    .line 1215
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    :cond_4c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v3

    .line 1223
    if-eqz v3, :cond_4d

    .line 1224
    .line 1225
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v3

    .line 1229
    check-cast v3, Landroid/content/Intent;

    .line 1230
    .line 1231
    invoke-static {v11, v1, v0, v3}, Lr0/t1;->d(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Landroid/content/Intent;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v3

    .line 1235
    if-eqz v3, :cond_4c

    .line 1236
    .line 1237
    :cond_4d
    return-void

    .line 1238
    :pswitch_4
    move-object v0, v10

    .line 1239
    invoke-static {v1, v12}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1243
    .line 1244
    invoke-static {v11, v2}, Lr0/t1;->b(Lr0/t1;[Ljava/lang/Object;)Ljava/util/List;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v2

    .line 1248
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v2

    .line 1252
    :cond_4e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v3

    .line 1256
    if-eqz v3, :cond_4f

    .line 1257
    .line 1258
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v3

    .line 1262
    check-cast v3, Landroid/content/Intent;

    .line 1263
    .line 1264
    invoke-static {v11, v1, v0, v3}, Lr0/t1;->d(Lr0/t1;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Landroid/content/Intent;)Z

    .line 1265
    .line 1266
    .line 1267
    move-result v3

    .line 1268
    if-eqz v3, :cond_4e

    .line 1269
    .line 1270
    :cond_4f
    return-void

    .line 1271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
