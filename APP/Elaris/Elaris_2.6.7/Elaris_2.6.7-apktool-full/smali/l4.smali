.class public final Ll4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:[Z

.field public final synthetic b:Lf2;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:[Z

.field public final synthetic f:Z

.field public final synthetic g:[Z


# direct methods
.method public constructor <init>([ZLf2;ILjava/lang/String;[ZZ[Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll4;->a:[Z

    .line 5
    .line 6
    iput-object p2, p0, Ll4;->b:Lf2;

    .line 7
    .line 8
    iput p3, p0, Ll4;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Ll4;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ll4;->e:[Z

    .line 13
    .line 14
    iput-boolean p6, p0, Ll4;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, Ll4;->g:[Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Ll4;->a:[Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-boolean v0, v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_d

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ll4;->b:Lf2;

    .line 11
    .line 12
    invoke-static {v0, v1}, Ls4;->n(Lf2;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ll4;->a:[Z

    .line 20
    .line 21
    aput-boolean v2, v0, v1

    .line 22
    .line 23
    iget-object p0, p0, Ll4;->b:Lf2;

    .line 24
    .line 25
    const-string v0, "auto_send_invalid"

    .line 26
    .line 27
    invoke-static {p0, v0}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v0, p0, Ll4;->b:Lf2;

    .line 32
    .line 33
    iget-object v0, v0, Lf2;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v4, v0

    .line 42
    check-cast v4, Landroid/widget/EditText;

    .line 43
    .line 44
    iget-object v0, p0, Ll4;->b:Lf2;

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    .line 48
    const-string p0, "input_missing"

    .line 49
    .line 50
    invoke-static {v0, p0}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object v0, v0, Lf2;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lia;

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-virtual {v0, v5, v6}, Lia;->a(J)V

    .line 63
    .line 64
    .line 65
    new-instance v7, Lh4;

    .line 66
    .line 67
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move v10, v1

    .line 75
    :goto_0
    const/4 v3, 0x7

    .line 76
    if-ge v10, v3, :cond_4

    .line 77
    .line 78
    instance-of v3, v0, Landroid/view/View;

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    move-object v3, v0

    .line 83
    check-cast v3, Landroid/view/View;

    .line 84
    .line 85
    filled-new-array {v1}, [I

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const/16 v8, 0xa

    .line 90
    .line 91
    const/16 v9, 0x2bc

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    invoke-static/range {v3 .. v9}, Ls4;->l(Landroid/view/View;Landroid/widget/EditText;I[ILh4;II)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v7, Lh4;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Landroid/view/View;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget v5, v7, Lh4;->a:I

    .line 104
    .line 105
    const/16 v6, 0x78

    .line 106
    .line 107
    if-lt v5, v6, :cond_3

    .line 108
    .line 109
    :goto_1
    move-object v3, v0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    add-int/lit8 v10, v10, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    :try_start_0
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    move-object v3, v0

    .line 123
    goto :goto_2

    .line 124
    :catchall_0
    move-object v3, v4

    .line 125
    :goto_2
    filled-new-array {v1}, [I

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/16 v8, 0xe

    .line 130
    .line 131
    const/16 v9, 0x708

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-static/range {v3 .. v9}, Ls4;->l(Landroid/view/View;Landroid/widget/EditText;I[ILh4;II)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v7, Lh4;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Landroid/view/View;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_3
    if-eqz v3, :cond_a

    .line 143
    .line 144
    :try_start_1
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/view/View;->isEnabled()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_5

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->performClick()Z

    .line 158
    .line 159
    .line 160
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    goto :goto_6

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    :goto_4
    move v0, v1

    .line 165
    goto :goto_6

    .line 166
    :goto_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v6, "auto send click failed: "

    .line 169
    .line 170
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :goto_6
    if-eqz v0, :cond_a

    .line 185
    .line 186
    iget-object v0, p0, Ll4;->a:[Z

    .line 187
    .line 188
    aput-boolean v2, v0, v1

    .line 189
    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v1, "auto send click ok attempt="

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget v1, p0, Ll4;->c:I

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v1, " entry="

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    if-nez v3, :cond_7

    .line 208
    .line 209
    const-string v1, "null"

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    instance-of v2, v3, Landroid/widget/TextView;

    .line 229
    .line 230
    if-eqz v2, :cond_8

    .line 231
    .line 232
    move-object v2, v3

    .line 233
    check-cast v2, Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    if-eqz v2, :cond_8

    .line 240
    .line 241
    const-string v4, " text="

    .line 242
    .line 243
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    const/16 v4, 0x18

    .line 251
    .line 252
    invoke-static {v2, v4}, Ls4;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    :cond_8
    invoke-static {v3}, Ls4;->w(Landroid/view/View;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-lez v3, :cond_9

    .line 268
    .line 269
    const-string v3, " id="

    .line 270
    .line 271
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :goto_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v1, " sendMethod="

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    iget-object p0, p0, Ll4;->d:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_a
    iget-object v0, p0, Ll4;->e:[Z

    .line 303
    .line 304
    aget-boolean v0, v0, v1

    .line 305
    .line 306
    const-string v3, " method="

    .line 307
    .line 308
    const/4 v5, 0x0

    .line 309
    if-nez v0, :cond_f

    .line 310
    .line 311
    sget-object v0, Ls4;->k:Ljava/lang/reflect/Method;

    .line 312
    .line 313
    sget-object v6, Ls4;->l:Ljava/lang/ref/WeakReference;

    .line 314
    .line 315
    sget-object v7, Ls4;->m:Ljava/lang/ref/WeakReference;

    .line 316
    .line 317
    if-nez v6, :cond_b

    .line 318
    .line 319
    move-object v6, v5

    .line 320
    goto :goto_8

    .line 321
    :cond_b
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    :goto_8
    if-nez v7, :cond_c

    .line 326
    .line 327
    move-object v7, v5

    .line 328
    goto :goto_9

    .line 329
    :cond_c
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    check-cast v7, Landroid/view/View;

    .line 334
    .line 335
    :goto_9
    if-eqz v0, :cond_f

    .line 336
    .line 337
    if-eqz v6, :cond_f

    .line 338
    .line 339
    if-nez v7, :cond_d

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_d
    :try_start_2
    invoke-virtual {v7}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 343
    .line 344
    .line 345
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 346
    if-nez v8, :cond_e

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :catchall_2
    :cond_e
    :try_start_3
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-virtual {v0, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Ll4;->e:[Z

    .line 357
    .line 358
    aput-boolean v2, v0, v1

    .line 359
    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v1, "official send button click invoked attempt="

    .line 363
    .line 364
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    iget v1, p0, Ll4;->c:I

    .line 368
    .line 369
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget-object p0, p0, Ll4;->d:Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :catchall_3
    move-exception v0

    .line 389
    new-instance v6, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v7, "official send button click invoke failed: "

    .line 392
    .line 393
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :cond_f
    :goto_a
    iget-object v0, p0, Ll4;->e:[Z

    .line 407
    .line 408
    aget-boolean v0, v0, v1

    .line 409
    .line 410
    if-eqz v0, :cond_10

    .line 411
    .line 412
    iget-boolean v0, p0, Ll4;->f:Z

    .line 413
    .line 414
    if-nez v0, :cond_10

    .line 415
    .line 416
    goto :goto_d

    .line 417
    :cond_10
    iget-object v0, p0, Ll4;->g:[Z

    .line 418
    .line 419
    aget-boolean v0, v0, v1

    .line 420
    .line 421
    if-nez v0, :cond_13

    .line 422
    .line 423
    sget-object v0, Ls4;->i:Ljava/lang/reflect/Method;

    .line 424
    .line 425
    sget-object v6, Ls4;->j:Ljava/lang/ref/WeakReference;

    .line 426
    .line 427
    if-nez v6, :cond_11

    .line 428
    .line 429
    move-object v6, v5

    .line 430
    goto :goto_b

    .line 431
    :cond_11
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    :goto_b
    if-eqz v0, :cond_13

    .line 436
    .line 437
    if-nez v6, :cond_12

    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_12
    :try_start_4
    invoke-virtual {v0, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 441
    .line 442
    .line 443
    iget-object v0, p0, Ll4;->g:[Z

    .line 444
    .line 445
    aput-boolean v2, v0, v1

    .line 446
    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    const-string v1, "official send delegate invoked attempt="

    .line 450
    .line 451
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    iget v1, p0, Ll4;->c:I

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    iget-object p0, p0, Ll4;->d:Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :catchall_4
    move-exception v0

    .line 476
    new-instance v1, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    const-string v2, "official send delegate invoke failed: "

    .line 479
    .line 480
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    :cond_13
    :goto_c
    iget-boolean v0, p0, Ll4;->f:Z

    .line 494
    .line 495
    if-eqz v0, :cond_14

    .line 496
    .line 497
    iget-object v0, p0, Ll4;->b:Lf2;

    .line 498
    .line 499
    const-string v1, "auto_send_exhausted"

    .line 500
    .line 501
    invoke-static {v0, v1}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    const-string v0, "\u5df2\u5199\u5165QQ\u5b98\u65b9\u56fe\u6587\u5185\u5bb9\uff0c\u8bf7\u624b\u52a8\u518d\u70b9\u53d1\u9001"

    .line 505
    .line 506
    invoke-static {v4, v0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object p0, p0, Ll4;->d:Ljava/lang/String;

    .line 510
    .line 511
    const-string v0, "auto send click missing after retries method="

    .line 512
    .line 513
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    :cond_14
    :goto_d
    return-void
.end method
