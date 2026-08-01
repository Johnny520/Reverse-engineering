.class public final synthetic Lw1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lfi;)V
    .locals 1

    .line 16
    const/16 v0, 0x18

    iput v0, p0, Lw1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lw1;->η:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lxj0;)V
    .locals 1

    .line 14
    const/16 v0, 0xb

    iput v0, p0, Lw1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lw1;->η:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p2, p0, Lw1;->ε:I

    iput-object p1, p0, Lw1;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lw1;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lw1;->ε:I

    .line 3
    .line 4
    sget-object v0, Lkf;->α:Lkf;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lw1;->η:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lw1;->ε:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lli0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lxi0;

    .line 34
    .line 35
    :try_start_0
    sget-object v2, Lst;->α:Lst;

    .line 36
    .line 37
    iget-object v3, v0, Lxi0;->α:Ljava/lang/String;

    .line 38
    .line 39
    iget-wide v6, v0, Lxi0;->β:J

    .line 40
    .line 41
    invoke-virtual {v2, v6, v7, v3}, Lst;->Ε(JLjava/lang/String;)Lpt;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    new-instance v2, Leo1;

    .line 48
    .line 49
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :goto_1
    instance-of v2, v0, Leo1;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    move-object v0, v5

    .line 58
    :cond_1
    check-cast v0, Lpt;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    new-instance v2, Lp3;

    .line 63
    .line 64
    const/16 v3, 0x17

    .line 65
    .line 66
    invoke-direct {v2, p0, v3, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2}, Lli0;->δ(Lp70;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-void

    .line 74
    :pswitch_0
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lli0;

    .line 77
    .line 78
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 81
    .line 82
    iget-object v1, v0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    iget-object v0, v0, Lli0;->ζ:Landroid/widget/EditText;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    :pswitch_1
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lli0;

    .line 107
    .line 108
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lp70;

    .line 111
    .line 112
    iget-object v1, v0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    iget-object v2, v0, Lli0;->α:Landroid/app/Activity;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_7

    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    iget-object v0, v0, Lli0;->σ:Landroid/app/AlertDialog;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_6

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_7
    :goto_2
    return-void

    .line 149
    :pswitch_2
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lli0;

    .line 152
    .line 153
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Lpt;

    .line 156
    .line 157
    iget-object v1, v0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_8

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_8
    invoke-virtual {v0, p0}, Lli0;->γ(Lpt;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    return-void

    .line 170
    :pswitch_3
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lnd0;

    .line 173
    .line 174
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lp70;

    .line 177
    .line 178
    iget-object v1, v0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 179
    .line 180
    iget-object v2, v0, Lnd0;->α:Landroid/app/Activity;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_b

    .line 187
    .line 188
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_b

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_9

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    iget-object v0, v0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 202
    .line 203
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_a

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_a
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_4
    return-void

    .line 214
    :pswitch_4
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 215
    .line 216
    move-object v1, v0

    .line 217
    check-cast v1, Landroid/app/Activity;

    .line 218
    .line 219
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Lfi;

    .line 222
    .line 223
    const-string v2, "\u6253\u5f00\u9690\u85cf\u8054\u7cfb\u4eba\u83dc\u5355\u5931\u8d25"

    .line 224
    .line 225
    :try_start_1
    new-instance v0, Lnd0;

    .line 226
    .line 227
    invoke-direct {v0, v1, p0}, Lnd0;-><init>(Landroid/app/Activity;Lfi;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Lnd0;->ι()V

    .line 231
    .line 232
    .line 233
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :catchall_1
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    new-instance v0, Leo1;

    .line 239
    .line 240
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    move-object p0, v0

    .line 244
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    if-eqz p0, :cond_c

    .line 249
    .line 250
    const-string v0, "r44e0b9fe58029ab"

    .line 251
    .line 252
    invoke-static {v0, v2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v1, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 260
    .line 261
    .line 262
    :cond_c
    return-void

    .line 263
    :pswitch_5
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 264
    .line 265
    move-object v7, v0

    .line 266
    check-cast v7, Ldc0;

    .line 267
    .line 268
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 269
    .line 270
    move-object v9, p0

    .line 271
    check-cast v9, Ljava/util/ArrayList;

    .line 272
    .line 273
    new-instance v8, Lum1;

    .line 274
    .line 275
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    new-instance v10, Lum1;

    .line 279
    .line 280
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v11, Lum1;

    .line 284
    .line 285
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    new-instance v6, Lvb0;

    .line 289
    .line 290
    invoke-direct/range {v6 .. v11}, Lvb0;-><init>(Ldc0;Lum1;Ljava/util/ArrayList;Lum1;Lum1;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v6}, Ljc0;->α(Lp70;)Z

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    if-nez p0, :cond_d

    .line 298
    .line 299
    new-instance p0, Lwb0;

    .line 300
    .line 301
    invoke-direct {p0, v7, v4}, Lwb0;-><init>(Ldc0;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, p0}, Ldc0;->β(Lp70;)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_d
    iget-object p0, v11, Lum1;->ε:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p0, Ljava/lang/Throwable;

    .line 311
    .line 312
    if-eqz p0, :cond_e

    .line 313
    .line 314
    new-instance v0, Lp3;

    .line 315
    .line 316
    const/16 v1, 0xb

    .line 317
    .line 318
    invoke-direct {v0, v7, v1, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v7, v0}, Ldc0;->β(Lp70;)V

    .line 322
    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_e
    iget-object p0, v10, Lum1;->ε:Ljava/lang/Object;

    .line 326
    .line 327
    if-eqz p0, :cond_f

    .line 328
    .line 329
    check-cast p0, Lsb0;

    .line 330
    .line 331
    iget-object p0, p0, Lsb0;->β:Ljava/util/List;

    .line 332
    .line 333
    invoke-virtual {v7, p0}, Ldc0;->γ(Ljava/util/List;)Ljava/util/Map;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    new-instance v6, Lxb0;

    .line 338
    .line 339
    const/4 v11, 0x0

    .line 340
    move-object v9, v8

    .line 341
    move-object v8, v10

    .line 342
    move-object v10, p0

    .line 343
    invoke-direct/range {v6 .. v11}, Lxb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7, v6}, Ldc0;->β(Lp70;)V

    .line 347
    .line 348
    .line 349
    :goto_6
    return-void

    .line 350
    :cond_f
    const-string p0, "refreshed"

    .line 351
    .line 352
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v5

    .line 356
    :pswitch_6
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Ldc0;

    .line 359
    .line 360
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, Lp70;

    .line 363
    .line 364
    iget-object v1, v0, Ldc0;->ο:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 365
    .line 366
    iget-object v2, v0, Ldc0;->α:Landroid/app/Activity;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_10

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_10
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_13

    .line 380
    .line 381
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_11

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_11
    iget-object v0, v0, Ldc0;->ξ:Landroid/app/AlertDialog;

    .line 389
    .line 390
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_12

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_12
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    :cond_13
    :goto_7
    return-void

    .line 401
    :pswitch_7
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v0, Landroid/view/View;

    .line 404
    .line 405
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p0, Landroid/view/ViewGroup;

    .line 408
    .line 409
    sget-object v4, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 410
    .line 411
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    if-eqz v6, :cond_14

    .line 416
    .line 417
    invoke-virtual {v4, v0}, Lcom/example/dyhelper/hook/γ;->й(Landroid/view/View;)V

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_14
    instance-of v6, p0, Landroid/widget/FrameLayout;

    .line 422
    .line 423
    if-eqz v6, :cond_15

    .line 424
    .line 425
    move-object v5, p0

    .line 426
    check-cast v5, Landroid/widget/FrameLayout;

    .line 427
    .line 428
    :cond_15
    if-nez v5, :cond_16

    .line 429
    .line 430
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    :cond_16
    if-eqz v5, :cond_17

    .line 435
    .line 436
    invoke-virtual {v4, v5, v0}, Lcom/example/dyhelper/hook/γ;->к(Landroid/widget/FrameLayout;Landroid/view/View;)V

    .line 437
    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_17
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->μ(Landroid/view/View;)Landroid/app/Activity;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    if-eqz p0, :cond_18

    .line 445
    .line 446
    invoke-static {p0, v1, v2, v3}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 447
    .line 448
    .line 449
    :cond_18
    :goto_8
    return-void

    .line 450
    :pswitch_8
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Lp70;

    .line 453
    .line 454
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast p0, Landroid/view/ViewGroup;

    .line 457
    .line 458
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 459
    .line 460
    monitor-enter v1

    .line 461
    :try_start_2
    sget-object v2, Lcom/example/dyhelper/hook/γ;->ρ:Ljava/util/WeakHashMap;

    .line 462
    .line 463
    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    check-cast p0, Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 468
    .line 469
    monitor-exit v1

    .line 470
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :catchall_2
    move-exception v0

    .line 475
    move-object p0, v0

    .line 476
    monitor-exit v1

    .line 477
    throw p0

    .line 478
    :pswitch_9
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, Landroid/widget/FrameLayout;

    .line 481
    .line 482
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast p0, Landroid/view/View;

    .line 485
    .line 486
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 487
    .line 488
    invoke-virtual {v1, v0, p0}, Lcom/example/dyhelper/hook/γ;->к(Landroid/widget/FrameLayout;Landroid/view/View;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_a
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Landroid/view/ViewGroup;

    .line 495
    .line 496
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast p0, Landroid/widget/TextView;

    .line 499
    .line 500
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 501
    .line 502
    monitor-enter v1

    .line 503
    :try_start_3
    sget-object v2, Lcom/example/dyhelper/hook/γ;->υ:Ljava/util/WeakHashMap;

    .line 504
    .line 505
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    check-cast v2, Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 510
    .line 511
    monitor-exit v1

    .line 512
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    if-nez v1, :cond_19

    .line 517
    .line 518
    goto :goto_9

    .line 519
    :cond_19
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 520
    .line 521
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->ξ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    if-eqz v2, :cond_1a

    .line 526
    .line 527
    invoke-virtual {v1, p0}, Lcom/example/dyhelper/hook/γ;->й(Landroid/view/View;)V

    .line 528
    .line 529
    .line 530
    goto :goto_9

    .line 531
    :cond_1a
    instance-of v2, v0, Landroid/widget/FrameLayout;

    .line 532
    .line 533
    if-eqz v2, :cond_1b

    .line 534
    .line 535
    move-object v5, v0

    .line 536
    check-cast v5, Landroid/widget/FrameLayout;

    .line 537
    .line 538
    :cond_1b
    if-nez v5, :cond_1c

    .line 539
    .line 540
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->τ(Landroid/view/View;)Landroid/widget/FrameLayout;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    :cond_1c
    if-eqz v5, :cond_1d

    .line 545
    .line 546
    invoke-virtual {v1, v5, p0}, Lcom/example/dyhelper/hook/γ;->к(Landroid/widget/FrameLayout;Landroid/view/View;)V

    .line 547
    .line 548
    .line 549
    :cond_1d
    :goto_9
    return-void

    .line 550
    :catchall_3
    move-exception v0

    .line 551
    move-object p0, v0

    .line 552
    monitor-exit v1

    .line 553
    throw p0

    .line 554
    :pswitch_b
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Lb20;

    .line 557
    .line 558
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast p0, Landroid/view/View;

    .line 561
    .line 562
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 563
    .line 564
    iget-wide v1, v0, Lb20;->α:J

    .line 565
    .line 566
    iget-object v3, v0, Lb20;->β:Ljava/lang/String;

    .line 567
    .line 568
    invoke-static {v1, v2, v3}, Lcom/example/dyhelper/hook/γ;->Ν(JLjava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_1e

    .line 573
    .line 574
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/γ;->γ(Landroid/view/View;Lb20;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_1e

    .line 579
    .line 580
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->д(Landroid/view/View;)V

    .line 581
    .line 582
    .line 583
    :cond_1e
    return-void

    .line 584
    :pswitch_c
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Landroid/app/Activity;

    .line 587
    .line 588
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast p0, Lyj0;

    .line 591
    .line 592
    iget-boolean v1, p0, Lyj0;->α:Z

    .line 593
    .line 594
    if-eqz v1, :cond_1f

    .line 595
    .line 596
    const-string p0, "\u4e00\u952e\u5df2\u8bfb\u6210\u529f"

    .line 597
    .line 598
    goto :goto_a

    .line 599
    :cond_1f
    iget-object p0, p0, Lyj0;->β:Ljava/lang/String;

    .line 600
    .line 601
    const-string v1, "\u4e00\u952e\u5df2\u8bfb\u5931\u8d25: "

    .line 602
    .line 603
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p0

    .line 607
    :goto_a
    invoke-static {v0, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 612
    .line 613
    .line 614
    return-void

    .line 615
    :pswitch_d
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v0, Landroid/app/Activity;

    .line 618
    .line 619
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast p0, Lo10;

    .line 622
    .line 623
    sget-object v1, Lq10;->α:Lq10;

    .line 624
    .line 625
    invoke-static {v0, p0}, Lq10;->κ(Landroid/app/Activity;Lo10;)Z

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_e
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 630
    .line 631
    move-object v1, v0

    .line 632
    check-cast v1, Ljava/util/concurrent/FutureTask;

    .line 633
    .line 634
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast p0, Ljava/lang/String;

    .line 637
    .line 638
    :try_start_4
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 639
    .line 640
    .line 641
    sget-object v2, Lox;->ν:Ljava/lang/Object;

    .line 642
    .line 643
    monitor-enter v2

    .line 644
    :try_start_5
    sget-object v0, Lox;->π:Ljava/util/HashMap;

    .line 645
    .line 646
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    if-ne v3, v1, :cond_20

    .line 651
    .line 652
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 653
    .line 654
    .line 655
    goto :goto_b

    .line 656
    :catchall_4
    move-exception v0

    .line 657
    move-object p0, v0

    .line 658
    goto :goto_c

    .line 659
    :cond_20
    :goto_b
    monitor-exit v2

    .line 660
    return-void

    .line 661
    :goto_c
    monitor-exit v2

    .line 662
    throw p0

    .line 663
    :catchall_5
    move-exception v0

    .line 664
    sget-object v2, Lox;->ν:Ljava/lang/Object;

    .line 665
    .line 666
    monitor-enter v2

    .line 667
    :try_start_6
    sget-object v3, Lox;->π:Ljava/util/HashMap;

    .line 668
    .line 669
    invoke-virtual {v3, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    if-ne v3, v1, :cond_21

    .line 674
    .line 675
    sget-object v1, Lox;->π:Ljava/util/HashMap;

    .line 676
    .line 677
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 678
    .line 679
    .line 680
    goto :goto_d

    .line 681
    :catchall_6
    move-exception v0

    .line 682
    move-object p0, v0

    .line 683
    goto :goto_e

    .line 684
    :cond_21
    :goto_d
    monitor-exit v2

    .line 685
    throw v0

    .line 686
    :goto_e
    monitor-exit v2

    .line 687
    throw p0

    .line 688
    :pswitch_f
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 689
    .line 690
    move-object v5, v0

    .line 691
    check-cast v5, Landroid/app/Activity;

    .line 692
    .line 693
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 694
    .line 695
    move-object v10, p0

    .line 696
    check-cast v10, Ljava/lang/ClassLoader;

    .line 697
    .line 698
    sget-object p0, Lix;->μ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 699
    .line 700
    sget v0, Lix;->α:I

    .line 701
    .line 702
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-nez v0, :cond_27

    .line 707
    .line 708
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    if-eqz v0, :cond_22

    .line 713
    .line 714
    goto/16 :goto_15

    .line 715
    .line 716
    :cond_22
    :try_start_7
    const-string v1, ""
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 717
    .line 718
    :try_start_8
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-virtual {v0, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 731
    .line 732
    if-nez v0, :cond_23

    .line 733
    .line 734
    move-object v0, v1

    .line 735
    goto :goto_f

    .line 736
    :catchall_7
    move-exception v0

    .line 737
    :try_start_9
    new-instance v2, Leo1;

    .line 738
    .line 739
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 740
    .line 741
    .line 742
    move-object v0, v2

    .line 743
    :cond_23
    :goto_f
    instance-of v2, v0, Leo1;

    .line 744
    .line 745
    if-eqz v2, :cond_24

    .line 746
    .line 747
    goto :goto_10

    .line 748
    :cond_24
    move-object v1, v0

    .line 749
    :goto_10
    check-cast v1, Ljava/lang/String;

    .line 750
    .line 751
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-eqz v0, :cond_25

    .line 756
    .line 757
    const-string v1, "\u672a\u77e5"

    .line 758
    .line 759
    goto :goto_11

    .line 760
    :catchall_8
    move-exception v0

    .line 761
    goto :goto_13

    .line 762
    :cond_25
    :goto_11
    invoke-static {v5}, Lix;->ζ(Landroid/content/Context;)J

    .line 763
    .line 764
    .line 765
    move-result-wide v7

    .line 766
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 767
    .line 768
    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 776
    .line 777
    .line 778
    move-result-object v9

    .line 779
    move-object v6, v5

    .line 780
    new-instance v5, Lfx;

    .line 781
    .line 782
    invoke-direct/range {v5 .. v10}, Lfx;-><init>(Landroid/app/Activity;JLandroid/app/AlertDialog;Ljava/lang/ClassLoader;)V

    .line 783
    .line 784
    .line 785
    move-object v0, v9

    .line 786
    new-instance v10, Lgx;

    .line 787
    .line 788
    invoke-direct {v10, v0, v7, v8, v1}, Lgx;-><init>(Landroid/app/AlertDialog;JLjava/lang/String;)V

    .line 789
    .line 790
    .line 791
    move-object v9, v5

    .line 792
    move-object v5, v6

    .line 793
    move-object v6, v1

    .line 794
    invoke-static/range {v5 .. v10}, Lix;->β(Landroid/content/Context;Ljava/lang/String;JLfx;Lgx;)Landroid/widget/FrameLayout;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    move-object v6, v5

    .line 799
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    if-nez v0, :cond_26

    .line 810
    .line 811
    goto :goto_12

    .line 812
    :cond_26
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 821
    .line 822
    int-to-float v1, v1

    .line 823
    const v2, 0x3f6147ae    # 0.88f

    .line 824
    .line 825
    .line 826
    mul-float/2addr v1, v2

    .line 827
    float-to-int v1, v1

    .line 828
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 829
    .line 830
    invoke-direct {v2, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 841
    .line 842
    .line 843
    const v2, 0x3ec28f5c    # 0.38f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0, v2}, Landroid/view/Window;->setDimAmount(F)V

    .line 847
    .line 848
    .line 849
    const v2, 0x80020

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 853
    .line 854
    .line 855
    const/4 v2, -0x2

    .line 856
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 857
    .line 858
    .line 859
    :goto_12
    sget-object v0, Ls62;->α:Ls62;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 860
    .line 861
    goto :goto_14

    .line 862
    :goto_13
    new-instance v1, Leo1;

    .line 863
    .line 864
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 865
    .line 866
    .line 867
    move-object v0, v1

    .line 868
    :goto_14
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    if-eqz v0, :cond_28

    .line 873
    .line 874
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object p0

    .line 881
    new-instance v0, Ljava/lang/StringBuilder;

    .line 882
    .line 883
    const-string v1, "show best-version warning failed: "

    .line 884
    .line 885
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object p0

    .line 895
    invoke-static {p0}, Lix;->θ(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    goto :goto_16

    .line 899
    :cond_27
    :goto_15
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 900
    .line 901
    .line 902
    :cond_28
    :goto_16
    return-void

    .line 903
    :pswitch_10
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v0, Landroid/app/Activity;

    .line 906
    .line 907
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast p0, Lxw;

    .line 910
    .line 911
    sget-object v1, Lyw;->α:Landroid/os/Handler;

    .line 912
    .line 913
    invoke-static {v0, p0}, Lyw;->ζ(Landroid/app/Activity;Lxw;)V

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :pswitch_11
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 918
    .line 919
    move-object v1, v0

    .line 920
    check-cast v1, Landroid/app/Activity;

    .line 921
    .line 922
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast p0, Lxj0;

    .line 925
    .line 926
    :try_start_a
    invoke-static {}, Lui1;->Α()Z

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    if-nez v0, :cond_29

    .line 931
    .line 932
    invoke-static {v1}, Lui1;->π(Landroid/content/Context;)V

    .line 933
    .line 934
    .line 935
    goto :goto_17

    .line 936
    :catchall_9
    move-exception v0

    .line 937
    move-object p0, v0

    .line 938
    goto :goto_18

    .line 939
    :cond_29
    :goto_17
    invoke-static {v1, p0}, Lh62;->Б(Landroid/app/Activity;Lxj0;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 940
    .line 941
    .line 942
    goto :goto_19

    .line 943
    :goto_18
    const-string v0, "DYHelper"

    .line 944
    .line 945
    const-string v2, "\u6253\u5f00\u4e0b\u8f7d\u8def\u5f84\u6a21\u677f\u5f39\u7a97\u5931\u8d25"

    .line 946
    .line 947
    invoke-static {v0, v2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object p0

    .line 954
    new-instance v0, Ljava/lang/StringBuilder;

    .line 955
    .line 956
    const-string v2, "\u6253\u5f00\u8def\u5f84\u8bbe\u7f6e\u5931\u8d25: "

    .line 957
    .line 958
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object p0

    .line 968
    invoke-static {v1, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 969
    .line 970
    .line 971
    move-result-object p0

    .line 972
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 973
    .line 974
    .line 975
    :goto_19
    return-void

    .line 976
    :pswitch_12
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v0, Lpr;

    .line 979
    .line 980
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast p0, Lmr;

    .line 983
    .line 984
    iget-object v0, v0, Lpr;->α:Landroid/view/ViewGroup;

    .line 985
    .line 986
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {p0}, Lin;->δ()V

    .line 990
    .line 991
    .line 992
    return-void

    .line 993
    :pswitch_13
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, Lp70;

    .line 996
    .line 997
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast p0, Landroid/view/View;

    .line 1000
    .line 1001
    :try_start_b
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1005
    goto :goto_1a

    .line 1006
    :catchall_a
    move-exception v0

    .line 1007
    new-instance v1, Leo1;

    .line 1008
    .line 1009
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1010
    .line 1011
    .line 1012
    move-object v0, v1

    .line 1013
    :goto_1a
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    if-eqz v0, :cond_2a

    .line 1018
    .line 1019
    const-string v1, "r8dc155644f53e174"

    .line 1020
    .line 1021
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p0

    .line 1025
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p0

    .line 1029
    const-string v2, "\u8bc4\u8bba\u63a7\u4ef6\u5f02\u6b65\u6837\u5f0f\u5904\u7406\u5931\u8d25: "

    .line 1030
    .line 1031
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object p0

    .line 1035
    invoke-static {v1, p0, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_2a
    return-void

    .line 1039
    :pswitch_14
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v0, Landroid/view/View;

    .line 1042
    .line 1043
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 1046
    .line 1047
    invoke-static {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->δ(Landroid/view/View;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;)V

    .line 1048
    .line 1049
    .line 1050
    return-void

    .line 1051
    :pswitch_15
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, Landroid/view/View;

    .line 1054
    .line 1055
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1056
    .line 1057
    invoke-static {v0}, Lmj;->θ(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    if-nez v0, :cond_2b

    .line 1062
    .line 1063
    invoke-static {p0}, Lmj;->ι(Ljava/lang/Object;)Landroid/view/ViewGroup;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    if-nez v0, :cond_2b

    .line 1068
    .line 1069
    invoke-static {p0}, Lmj;->κ(Ljava/lang/Object;)Landroid/view/ViewGroup;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    :cond_2b
    if-eqz v0, :cond_2c

    .line 1074
    .line 1075
    invoke-static {v0, v3, v3}, Lmj;->ψ(Landroid/view/ViewGroup;ZZ)V

    .line 1076
    .line 1077
    .line 1078
    :cond_2c
    return-void

    .line 1079
    :pswitch_16
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v0, Ljava/lang/String;

    .line 1082
    .line 1083
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast p0, Ljava/lang/String;

    .line 1086
    .line 1087
    if-eqz v0, :cond_2d

    .line 1088
    .line 1089
    sget-object v3, Lug;->в:Ljava/util/LinkedHashSet;

    .line 1090
    .line 1091
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    :cond_2d
    sput-object p0, Lug;->г:Ljava/lang/String;

    .line 1095
    .line 1096
    sget-object p0, Lug;->б:Ls0;

    .line 1097
    .line 1098
    if-eqz p0, :cond_2e

    .line 1099
    .line 1100
    sget-object v3, Lug;->κ:Landroid/os/Handler;

    .line 1101
    .line 1102
    invoke-virtual {v3, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1103
    .line 1104
    .line 1105
    :cond_2e
    if-eqz v0, :cond_30

    .line 1106
    .line 1107
    sget-object p0, Lug;->а:Ljava/util/LinkedHashSet;

    .line 1108
    .line 1109
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result p0

    .line 1113
    if-eqz p0, :cond_2f

    .line 1114
    .line 1115
    goto :goto_1b

    .line 1116
    :cond_2f
    const-wide/16 v1, 0x20

    .line 1117
    .line 1118
    :cond_30
    :goto_1b
    new-instance p0, Ls0;

    .line 1119
    .line 1120
    const/4 v0, 0x4

    .line 1121
    invoke-direct {p0, v0}, Ls0;-><init>(I)V

    .line 1122
    .line 1123
    .line 1124
    sput-object p0, Lug;->б:Ls0;

    .line 1125
    .line 1126
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 1127
    .line 1128
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1129
    .line 1130
    .line 1131
    return-void

    .line 1132
    :pswitch_17
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v0, Lkf;

    .line 1135
    .line 1136
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast p0, Landroid/view/View;

    .line 1139
    .line 1140
    invoke-virtual {v0, p0, v5}, Lkf;->δ(Landroid/view/View;Ljava/lang/Float;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_18
    sget-object v0, Lkf;->α:Lkf;

    .line 1145
    .line 1146
    iget-object v1, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1147
    .line 1148
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1149
    .line 1150
    invoke-static {v1}, Lkf;->λ(Ljava/lang/Object;)Landroid/view/View;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    if-nez v1, :cond_31

    .line 1155
    .line 1156
    goto :goto_1c

    .line 1157
    :cond_31
    invoke-static {v1, p0}, Lkf;->β(Landroid/view/View;Ljava/lang/Object;)V

    .line 1158
    .line 1159
    .line 1160
    :try_start_c
    new-instance p0, Lw1;

    .line 1161
    .line 1162
    const/4 v2, 0x5

    .line 1163
    invoke-direct {p0, v0, v2, v1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    const-wide/16 v2, 0xa0

    .line 1167
    .line 1168
    invoke-virtual {v1, p0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 1169
    .line 1170
    .line 1171
    :catchall_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1172
    .line 1173
    .line 1174
    move-result-object p0

    .line 1175
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object p0

    .line 1179
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 1180
    .line 1181
    .line 1182
    move-result v0

    .line 1183
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    const-string v2, "delayed bind from presenter view="

    .line 1186
    .line 1187
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1191
    .line 1192
    .line 1193
    const-string p0, "@"

    .line 1194
    .line 1195
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object p0

    .line 1205
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    :goto_1c
    return-void

    .line 1209
    :pswitch_19
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v0, Landroid/view/View;

    .line 1212
    .line 1213
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast p0, Ljava/lang/Integer;

    .line 1216
    .line 1217
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v1

    .line 1221
    if-eqz v1, :cond_32

    .line 1222
    .line 1223
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 1224
    .line 1225
    .line 1226
    move-result p0

    .line 1227
    invoke-static {v0, p0}, Lsb;->ε(Landroid/view/View;I)V

    .line 1228
    .line 1229
    .line 1230
    :cond_32
    return-void

    .line 1231
    :pswitch_1a
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1232
    .line 1233
    move-object v1, v0

    .line 1234
    check-cast v1, La80;

    .line 1235
    .line 1236
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast p0, Ljava/lang/String;

    .line 1239
    .line 1240
    sget-object v2, Lx9;->β:Ljava/util/Set;

    .line 1241
    .line 1242
    const-string v3, "check failed: "

    .line 1243
    .line 1244
    :try_start_d
    invoke-static {p0}, Lx9;->ν(Ljava/lang/String;)Lv9;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 1249
    .line 1250
    .line 1251
    :goto_1d
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    goto :goto_1e

    .line 1255
    :catchall_c
    move-exception v0

    .line 1256
    :try_start_e
    new-instance v6, Lv9;

    .line 1257
    .line 1258
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    invoke-direct {v6, v4, v0, v5}, Lv9;-><init>(ZLjava/lang/String;Lu9;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-interface {v1, v6}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 1278
    .line 1279
    .line 1280
    goto :goto_1d

    .line 1281
    :goto_1e
    return-void

    .line 1282
    :catchall_d
    move-exception v0

    .line 1283
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    throw v0

    .line 1287
    :pswitch_1b
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1288
    .line 1289
    move-object v1, v0

    .line 1290
    check-cast v1, Lu4;

    .line 1291
    .line 1292
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast p0, Ljava/lang/Runnable;

    .line 1295
    .line 1296
    :try_start_f
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v1}, Lu4;->α()V

    .line 1300
    .line 1301
    .line 1302
    return-void

    .line 1303
    :catchall_e
    move-exception v0

    .line 1304
    move-object p0, v0

    .line 1305
    invoke-virtual {v1}, Lu4;->α()V

    .line 1306
    .line 1307
    .line 1308
    throw p0

    .line 1309
    :pswitch_1c
    iget-object v0, p0, Lw1;->ζ:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v0, Lz1;

    .line 1312
    .line 1313
    iget-object p0, p0, Lw1;->η:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast p0, Landroid/util/LongSparseArray;

    .line 1316
    .line 1317
    invoke-static {v0, p0}, Lln0;->υ(Lz1;Landroid/util/LongSparseArray;)V

    .line 1318
    .line 1319
    .line 1320
    return-void

    .line 1321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
        :pswitch_0
    .end packed-switch
.end method
