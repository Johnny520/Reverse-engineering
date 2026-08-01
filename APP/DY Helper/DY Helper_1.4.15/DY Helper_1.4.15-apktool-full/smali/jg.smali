.class public final synthetic Ljg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 12
    iput p3, p0, Ljg;->ε:I

    iput-object p1, p0, Ljg;->η:Ljava/lang/Object;

    iput-boolean p2, p0, Ljg;->ζ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljg;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p2, p0, Ljg;->ζ:Z

    .line 8
    .line 9
    iput-object p1, p0, Ljg;->η:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Ljg;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ljg;->η:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lvv1;

    .line 11
    .line 12
    iget-boolean p0, p0, Ljg;->ζ:Z

    .line 13
    .line 14
    iget-object v0, v2, Lvv1;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p0, v2, Lvv1;->β:Lnt;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p0}, Lnt;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p0, v0

    .line 35
    new-instance v0, Leo1;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, v0

    .line 41
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    const-string v0, "DYHelper"

    .line 48
    .line 49
    const-string v3, "\u5206\u4eab\u5feb\u6377\u6309\u94ae\u4fdd\u5b58\u540e\u5237\u65b0\u6458\u8981\u5931\u8d25"

    .line 50
    .line 51
    invoke-static {v0, v3, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object p0, v2, Lvv1;->α:Landroid/app/Activity;

    .line 55
    .line 56
    const-string v0, "\u5206\u4eab\u9762\u677f\u5feb\u6377\u6309\u94ae\u5df2\u4fdd\u5b58"

    .line 57
    .line 58
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 63
    .line 64
    .line 65
    iget-object p0, v2, Lvv1;->τ:Landroid/app/AlertDialog;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    iget-object p0, v2, Lvv1;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Lvv1;->γ(Z)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 80
    .line 81
    sget-wide v3, Lui1;->θ:J

    .line 82
    .line 83
    iget-wide v5, v2, Lvv1;->ζ:J

    .line 84
    .line 85
    cmp-long p0, v3, v5

    .line 86
    .line 87
    if-eqz p0, :cond_3

    .line 88
    .line 89
    const-string p0, "\u8d26\u53f7\u914d\u7f6e\u5df2\u5207\u6362\uff0c\u8bf7\u91cd\u65b0\u6253\u5f00"

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const-string p0, "\u914d\u7f6e\u5199\u5165\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 93
    .line 94
    :goto_1
    iget-object v0, v2, Lvv1;->α:Landroid/app/Activity;

    .line 95
    .line 96
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 101
    .line 102
    .line 103
    :goto_2
    return-void

    .line 104
    :pswitch_0
    iget-object v0, p0, Ljg;->η:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroid/widget/Switch;

    .line 107
    .line 108
    iget-boolean p0, p0, Ljg;->ζ:Z

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eq v1, p0, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void

    .line 120
    :pswitch_1
    iget-object v0, p0, Ljg;->η:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lgt0;

    .line 123
    .line 124
    iget-boolean p0, p0, Ljg;->ζ:Z

    .line 125
    .line 126
    invoke-virtual {v0, p0}, Lgt0;->ε(Z)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_2
    iget-object v0, p0, Ljg;->η:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Ljava/lang/ClassLoader;

    .line 133
    .line 134
    iget-boolean p0, p0, Ljg;->ζ:Z

    .line 135
    .line 136
    sget-object v1, Lzj0;->α:Lzj0;

    .line 137
    .line 138
    :try_start_1
    invoke-static {v0, p0}, Lzj0;->Ε(Ljava/lang/ClassLoader;Z)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    move-object p0, v0

    .line 146
    new-instance v0, Leo1;

    .line 147
    .line 148
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    move-object p0, v0

    .line 152
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_5

    .line 157
    .line 158
    invoke-static {p0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const-string v0, "DYHelperIMMarkAllReadHelper: \u540c\u6b65\u6d88\u606f\u5e95\u680f\u672a\u8bfb\u663e\u793a\u5931\u8d25: "

    .line 167
    .line 168
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    return-void

    .line 172
    :pswitch_3
    iget-object v0, p0, Ljg;->η:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Landroid/app/Activity;

    .line 175
    .line 176
    iget-boolean p0, p0, Ljg;->ζ:Z

    .line 177
    .line 178
    if-eqz p0, :cond_6

    .line 179
    .line 180
    const-string p0, "\u5df2\u5f00\u542f\u6e05\u723d\u6a21\u5f0f"

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    const-string p0, "\u5df2\u5173\u95ed\u6e05\u723d\u6a21\u5f0f"

    .line 184
    .line 185
    :goto_4
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_4
    iget-boolean v0, p0, Ljg;->ζ:Z

    .line 194
    .line 195
    iget-object p0, p0, Ljg;->η:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v5, p0

    .line 198
    check-cast v5, Ljava/lang/String;

    .line 199
    .line 200
    sget-object p0, Lug;->α:Ltg;

    .line 201
    .line 202
    const-string p0, "rf9ef3362bd85f5b5"

    .line 203
    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    sget-object v2, Lug;->μ:La;

    .line 207
    .line 208
    iget-object v2, v2, La;->β:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 211
    .line 212
    if-eqz v2, :cond_7

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    if-nez v2, :cond_8

    .line 219
    .line 220
    :cond_7
    const-string v0, "playback activity is paused: "

    .line 221
    .line 222
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Ltg;->ζ(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v0, "r51633675832303e9"

    .line 230
    .line 231
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_9

    .line 239
    .line 240
    :cond_8
    sget-object v2, Lpq;->α:Lpq;

    .line 241
    .line 242
    invoke-static {}, Lpq;->β()Lkq;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const/4 v8, 0x0

    .line 247
    if-eqz v2, :cond_9

    .line 248
    .line 249
    iget-object v2, v2, Lkq;->δ:Lmq;

    .line 250
    .line 251
    iget-wide v2, v2, Lmq;->δ:J

    .line 252
    .line 253
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    move-object v6, v2

    .line 258
    goto :goto_5

    .line 259
    :cond_9
    move-object v6, v8

    .line 260
    :goto_5
    const/4 v2, 0x1

    .line 261
    if-eqz v0, :cond_b

    .line 262
    .line 263
    sget-wide v3, Lug;->Η:J

    .line 264
    .line 265
    sget-object v7, Lug;->Θ:Ljava/lang/Long;

    .line 266
    .line 267
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 268
    .line 269
    .line 270
    move-result-wide v9

    .line 271
    sub-long/2addr v9, v3

    .line 272
    const-wide/high16 v11, -0x8000000000000000L

    .line 273
    .line 274
    cmp-long v3, v3, v11

    .line 275
    .line 276
    if-eqz v3, :cond_a

    .line 277
    .line 278
    const-wide/16 v3, 0x0

    .line 279
    .line 280
    cmp-long v3, v3, v9

    .line 281
    .line 282
    if-gtz v3, :cond_a

    .line 283
    .line 284
    const-wide/16 v3, 0x385

    .line 285
    .line 286
    cmp-long v3, v9, v3

    .line 287
    .line 288
    if-gez v3, :cond_a

    .line 289
    .line 290
    if-eqz v7, :cond_a

    .line 291
    .line 292
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_a

    .line 297
    .line 298
    move v3, v2

    .line 299
    goto :goto_6

    .line 300
    :cond_a
    move v3, v1

    .line 301
    :goto_6
    invoke-static {}, Ltg;->θ()V

    .line 302
    .line 303
    .line 304
    move v7, v3

    .line 305
    goto :goto_7

    .line 306
    :cond_b
    invoke-static {}, Ltg;->θ()V

    .line 307
    .line 308
    .line 309
    move v7, v1

    .line 310
    :goto_7
    sget-object v9, Lug;->λ:Lrf;

    .line 311
    .line 312
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    const-wide/16 v3, 0x1

    .line 316
    .line 317
    if-nez v0, :cond_c

    .line 318
    .line 319
    iget-wide v6, v9, Lrf;->β:J

    .line 320
    .line 321
    add-long/2addr v6, v3

    .line 322
    iput-wide v6, v9, Lrf;->β:J

    .line 323
    .line 324
    iput-object v8, v9, Lrf;->γ:Ljava/lang/Object;

    .line 325
    .line 326
    new-instance v0, Lmh;

    .line 327
    .line 328
    invoke-direct {v0, v8, v2}, Lmh;-><init>(Llh;I)V

    .line 329
    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_c
    iget-object v0, v9, Lrf;->γ:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Llh;

    .line 335
    .line 336
    if-eqz v0, :cond_d

    .line 337
    .line 338
    new-instance v0, Lmh;

    .line 339
    .line 340
    const/4 v2, 0x3

    .line 341
    invoke-direct {v0, v8, v2}, Lmh;-><init>(Llh;I)V

    .line 342
    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_d
    new-instance v2, Llh;

    .line 346
    .line 347
    iget-wide v10, v9, Lrf;->β:J

    .line 348
    .line 349
    add-long/2addr v3, v10

    .line 350
    iput-wide v3, v9, Lrf;->β:J

    .line 351
    .line 352
    invoke-direct/range {v2 .. v7}, Llh;-><init>(JLjava/lang/String;Ljava/lang/Long;Z)V

    .line 353
    .line 354
    .line 355
    iput-object v2, v9, Lrf;->γ:Ljava/lang/Object;

    .line 356
    .line 357
    new-instance v0, Lmh;

    .line 358
    .line 359
    const/4 v3, 0x2

    .line 360
    invoke-direct {v0, v2, v3}, Lmh;-><init>(Llh;I)V

    .line 361
    .line 362
    .line 363
    :goto_8
    iget-boolean v2, v0, Lmh;->β:Z

    .line 364
    .line 365
    if-eqz v2, :cond_f

    .line 366
    .line 367
    sget-object p0, Lug;->Φ:Lν;

    .line 368
    .line 369
    if-eqz p0, :cond_e

    .line 370
    .line 371
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 372
    .line 373
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 374
    .line 375
    .line 376
    :cond_e
    sput-object v8, Lug;->Φ:Lν;

    .line 377
    .line 378
    const-string p0, "raw playing: "

    .line 379
    .line 380
    invoke-virtual {p0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    const/16 v0, 0xc

    .line 385
    .line 386
    invoke-static {v1, p0, v1, v0}, Ltg;->ι(ZLjava/lang/String;ZI)V

    .line 387
    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_f
    iget-object v0, v0, Lmh;->α:Llh;

    .line 391
    .line 392
    if-nez v0, :cond_10

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_10
    sget-boolean v1, Lug;->σ:Z

    .line 396
    .line 397
    if-eqz v1, :cond_11

    .line 398
    .line 399
    iget-boolean v1, v0, Llh;->δ:Z

    .line 400
    .line 401
    if-nez v1, :cond_11

    .line 402
    .line 403
    sget-boolean v1, Lug;->ω:Z

    .line 404
    .line 405
    if-nez v1, :cond_11

    .line 406
    .line 407
    const-string v1, "r675c7fc6ba263ef1"

    .line 408
    .line 409
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-static {p0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_11
    new-instance p0, Lν;

    .line 417
    .line 418
    const/4 v1, 0x4

    .line 419
    invoke-direct {p0, v1, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    sput-object p0, Lug;->Φ:Lν;

    .line 423
    .line 424
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 425
    .line 426
    const-wide/16 v1, 0xfa

    .line 427
    .line 428
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 429
    .line 430
    .line 431
    :goto_9
    return-void

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
