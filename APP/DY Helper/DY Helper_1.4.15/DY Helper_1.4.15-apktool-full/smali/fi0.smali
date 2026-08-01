.class public final synthetic Lfi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lli0;


# direct methods
.method public synthetic constructor <init>(Lji0;Lli0;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lfi0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lfi0;->ζ:Lli0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lli0;I)V
    .locals 0

    .line 10
    iput p2, p0, Lfi0;->ε:I

    iput-object p1, p0, Lfi0;->ζ:Lli0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lfi0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfi0;->ζ:Lli0;

    .line 7
    .line 8
    :try_start_0
    sget-object v0, Lvh0;->α:Lvh0;

    .line 9
    .line 10
    iget-object p0, p0, Lli0;->β:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    const-string v1, "conversation_delete_complete"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, p0, v1, v2}, Lvh0;->ω(Ljava/lang/ClassLoader;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void

    .line 19
    :pswitch_0
    sget-object v0, Ljz;->ε:Ljz;

    .line 20
    .line 21
    iget-object p0, p0, Lfi0;->ζ:Lli0;

    .line 22
    .line 23
    iget-object v1, p0, Lli0;->β:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    const-string v2, ""

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v4, Lvh0;->α:Lvh0;

    .line 32
    .line 33
    invoke-virtual {v4, v1}, Lvh0;->δ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lnz;->ε:Lnz;

    .line 38
    .line 39
    new-instance v6, Lgj0;

    .line 40
    .line 41
    new-instance v7, Lf7;

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    invoke-direct {v7, v8, v4}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, Lej0;

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-direct {v4, v1, v5, v8}, Lej0;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v7, v4}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, Lfj0;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct {v5, v7}, Lfj0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Luh0;

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    invoke-direct {v7, v8}, Luh0;-><init>(I)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Lye;

    .line 70
    .line 71
    const/16 v9, 0x10

    .line 72
    .line 73
    invoke-direct {v8, v9, v7}, Lye;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v7, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    new-instance v9, Lbu;

    .line 82
    .line 83
    invoke-interface {v4}, Lss1;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-direct {v9, v4, v5}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_0

    .line 95
    .line 96
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-static {v7, v8}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_1

    .line 116
    .line 117
    move-object v4, v0

    .line 118
    goto :goto_2

    .line 119
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-nez v7, :cond_2

    .line 128
    .line 129
    invoke-static {v5}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_3

    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    move-object v4, v7

    .line 157
    :goto_2
    invoke-direct {v6, v4, v3, v2}, Lgj0;-><init>(Ljava/util/List;ZLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :catchall_1
    move-exception v2

    .line 162
    new-instance v6, Leo1;

    .line 163
    .line 164
    invoke-direct {v6, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    :goto_3
    instance-of v2, v6, Leo1;

    .line 168
    .line 169
    const/4 v4, 0x0

    .line 170
    if-eqz v2, :cond_4

    .line 171
    .line 172
    move-object v6, v4

    .line 173
    :cond_4
    check-cast v6, Lgj0;

    .line 174
    .line 175
    if-eqz v6, :cond_5

    .line 176
    .line 177
    iget-object v2, v6, Lgj0;->α:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-nez v2, :cond_5

    .line 184
    .line 185
    new-instance v2, Lgi0;

    .line 186
    .line 187
    const/4 v5, 0x0

    .line 188
    invoke-direct {v2, p0, v6, v5}, Lgi0;-><init>(Lli0;Lgj0;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v2}, Lli0;->δ(Lp70;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    :try_start_2
    new-instance v2, Lη;

    .line 195
    .line 196
    const/16 v5, 0xc

    .line 197
    .line 198
    invoke-direct {v2, v5, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {v1, v2}, Ls1;->ρ(Ljava/lang/ClassLoader;Lp70;)Llj0;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    new-instance v5, Lgj0;

    .line 209
    .line 210
    iget-object v7, v2, Llj0;->α:Ljava/util/List;

    .line 211
    .line 212
    iget-object v8, v2, Llj0;->β:Ljava/lang/Object;

    .line 213
    .line 214
    new-instance v9, Lf7;

    .line 215
    .line 216
    const/4 v10, 0x1

    .line 217
    invoke-direct {v9, v10, v7}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    new-instance v7, Lej0;

    .line 221
    .line 222
    const/4 v10, 0x0

    .line 223
    invoke-direct {v7, v1, v8, v10}, Lej0;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 224
    .line 225
    .line 226
    invoke-static {v9, v7}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    new-instance v7, Lfj0;

    .line 231
    .line 232
    const/4 v8, 0x0

    .line 233
    invoke-direct {v7, v8}, Lfj0;-><init>(I)V

    .line 234
    .line 235
    .line 236
    new-instance v8, Luh0;

    .line 237
    .line 238
    const/4 v9, 0x2

    .line 239
    invoke-direct {v8, v9}, Luh0;-><init>(I)V

    .line 240
    .line 241
    .line 242
    new-instance v9, Lye;

    .line 243
    .line 244
    const/16 v10, 0x10

    .line 245
    .line 246
    invoke-direct {v9, v10, v8}, Lye;-><init>(ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    new-instance v8, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    new-instance v10, Lbu;

    .line 255
    .line 256
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-direct {v10, v1, v7}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 261
    .line 262
    .line 263
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_6

    .line 268
    .line 269
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_6
    invoke-static {v8, v9}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-nez v7, :cond_7

    .line 289
    .line 290
    move-object v1, v0

    .line 291
    goto :goto_6

    .line 292
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-nez v8, :cond_8

    .line 301
    .line 302
    invoke-static {v7}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    goto :goto_6

    .line 307
    :cond_8
    new-instance v8, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_9

    .line 320
    .line 321
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_9
    move-object v1, v8

    .line 330
    :goto_6
    iget-boolean v7, v2, Llj0;->δ:Z

    .line 331
    .line 332
    iget-object v2, v2, Llj0;->ε:Ljava/lang/String;

    .line 333
    .line 334
    invoke-direct {v5, v1, v7, v2}, Lgj0;-><init>(Ljava/util/List;ZLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :catchall_2
    move-exception v1

    .line 339
    new-instance v5, Leo1;

    .line 340
    .line 341
    invoke-direct {v5, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    :goto_7
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    if-nez v1, :cond_a

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_a
    new-instance v5, Lgj0;

    .line 352
    .line 353
    if-eqz v6, :cond_b

    .line 354
    .line 355
    iget-object v4, v6, Lgj0;->α:Ljava/util/List;

    .line 356
    .line 357
    :cond_b
    if-nez v4, :cond_c

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_c
    move-object v0, v4

    .line 361
    :goto_8
    invoke-static {v1}, Lmi0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    const-string v2, "\u4f1a\u8bdd\u52a0\u8f7d\u5931\u8d25\uff1a"

    .line 366
    .line 367
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-direct {v5, v0, v3, v1}, Lgj0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :goto_9
    check-cast v5, Lgj0;

    .line 375
    .line 376
    new-instance v0, Lgi0;

    .line 377
    .line 378
    const/4 v1, 0x1

    .line 379
    invoke-direct {v0, p0, v5, v1}, Lgi0;-><init>(Lli0;Lgj0;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0, v0}, Lli0;->δ(Lp70;)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :pswitch_1
    iget-object p0, p0, Lfi0;->ζ:Lli0;

    .line 387
    .line 388
    iget-object v0, p0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 389
    .line 390
    iget-object v1, p0, Lli0;->α:Landroid/app/Activity;

    .line 391
    .line 392
    iget-object v2, p0, Lli0;->ζ:Landroid/widget/EditText;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-nez v0, :cond_f

    .line 399
    .line 400
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_f

    .line 405
    .line 406
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_d

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_d
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 414
    .line 415
    .line 416
    const/4 v0, 0x1

    .line 417
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 418
    .line 419
    .line 420
    const-class v3, Landroid/view/inputmethod/InputMethodManager;

    .line 421
    .line 422
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 427
    .line 428
    if-eqz v1, :cond_e

    .line 429
    .line 430
    invoke-virtual {v1, v2, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 431
    .line 432
    .line 433
    :cond_e
    new-instance v0, Lw1;

    .line 434
    .line 435
    const/16 v3, 0x1c

    .line 436
    .line 437
    invoke-direct {v0, p0, v3, v1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    const-wide/16 v3, 0x50

    .line 441
    .line 442
    invoke-virtual {v2, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 443
    .line 444
    .line 445
    :cond_f
    :goto_a
    return-void

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
