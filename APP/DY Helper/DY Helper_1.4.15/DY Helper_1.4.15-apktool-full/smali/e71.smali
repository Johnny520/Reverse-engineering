.class public final synthetic Le71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Le71;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Le71;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Le71;->ε:I

    .line 4
    .line 5
    const-string v2, "\u4e0b\u8f7d\u56fe\u7247"

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const-string v4, "DYHelper"

    .line 9
    .line 10
    const/4 v5, 0x7

    .line 11
    const-string v6, "\u9009\u62e9\u4e0b\u8f7d"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    sget-object v9, Ls62;->α:Ls62;

    .line 16
    .line 17
    iget-object v10, v0, Le71;->ζ:Landroid/app/Activity;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v10}, Landroid/app/Activity;->isFinishing()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v10}, Landroid/app/Activity;->isDestroyed()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v9

    .line 38
    :pswitch_0
    const-string v0, "user_clear_from_settings"

    .line 39
    .line 40
    :try_start_0
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {}, Lox;->μ()V

    .line 43
    .line 44
    .line 45
    sget-object v1, Los;->α:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    .line 47
    if-nez v10, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    const-string v1, "dyhelper_dexkit_progress"

    .line 51
    .line 52
    invoke-virtual {v10, v1, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v10}, Los;->π(Landroid/app/Activity;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :catchall_0
    :try_start_2
    const-string v1, "restart prompt ack reset"

    .line 72
    .line 73
    invoke-static {v1}, Los;->φ(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    sget v1, Lix;->α:I

    .line 77
    .line 78
    sget-object v1, Lix;->λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    .line 87
    .line 88
    const-string v1, "reset for next host resume, reason="

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lix;->θ(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v0, "DexKit \u7f13\u5b58\u5df2\u6e05\u9664\uff0c\u4e0b\u6b21\u8fdb\u5165\u5bbf\u4e3b\u5c06\u91cd\u65b0\u5168\u91cf\u9002\u914d"

    .line 98
    .line 99
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v3, "\u6e05\u9664\u5931\u8d25: "

    .line 115
    .line 116
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v10, v1, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v3, "\u6e05\u9664 DexKit \u7f13\u5b58\u5931\u8d25: "

    .line 140
    .line 141
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v4, v1, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :goto_1
    return-object v9

    .line 155
    :pswitch_1
    const-string v0, "\u6b63\u5728\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e\u2026"

    .line 156
    .line 157
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 162
    .line 163
    .line 164
    new-instance v0, Ljava/lang/Thread;

    .line 165
    .line 166
    new-instance v1, Lhg1;

    .line 167
    .line 168
    invoke-direct {v1, v10, v5}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 169
    .line 170
    .line 171
    const-string v2, "DY-ClearAllPrefs"

    .line 172
    .line 173
    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 177
    .line 178
    .line 179
    return-object v9

    .line 180
    :pswitch_2
    new-instance v0, Lit1;

    .line 181
    .line 182
    invoke-direct {v0, v10, v3}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    :try_start_3
    new-instance v1, Landroid/content/Intent;

    .line 189
    .line 190
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 191
    .line 192
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v2, "android.intent.category.OPENABLE"

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 198
    .line 199
    .line 200
    const-string v2, "application/json"

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    .line 204
    .line 205
    new-instance v2, Lbt1;

    .line 206
    .line 207
    invoke-direct {v2}, Lbt1;-><init>()V

    .line 208
    .line 209
    .line 210
    const/4 v3, 0x2

    .line 211
    iput v3, v2, Lbt1;->ε:I

    .line 212
    .line 213
    iput-object v0, v2, Lbt1;->η:Le80;

    .line 214
    .line 215
    invoke-virtual {v10}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    const-string v3, "dyhelper_config_import"

    .line 224
    .line 225
    invoke-virtual {v0, v2, v3}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 230
    .line 231
    .line 232
    new-instance v0, Landroid/os/Handler;

    .line 233
    .line 234
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 239
    .line 240
    .line 241
    new-instance v3, Lat1;

    .line 242
    .line 243
    invoke-direct {v3, v2, v1, v7}, Lat1;-><init>(Lbt1;Landroid/content/Intent;I)V

    .line 244
    .line 245
    .line 246
    const-wide/16 v1, 0x64

    .line 247
    .line 248
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :catchall_2
    move-exception v0

    .line 253
    const-string v1, "\u5bfc\u5165\u7528\u6237\u914d\u7f6e\u5931\u8d25"

    .line 254
    .line 255
    invoke-static {v4, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v2, "\u5bfc\u5165\u5931\u8d25: "

    .line 265
    .line 266
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 281
    .line 282
    .line 283
    :goto_2
    return-object v9

    .line 284
    :pswitch_3
    sget-object v0, Lq71;->α:Lq71;

    .line 285
    .line 286
    new-instance v0, Lf9;

    .line 287
    .line 288
    const/16 v1, 0x19

    .line 289
    .line 290
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v10, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 294
    .line 295
    .line 296
    return-object v9

    .line 297
    :pswitch_4
    sget-object v0, Lq71;->α:Lq71;

    .line 298
    .line 299
    new-instance v0, Lf9;

    .line 300
    .line 301
    invoke-direct {v0, v10, v5}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 302
    .line 303
    .line 304
    invoke-static {v10, v2, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 305
    .line 306
    .line 307
    return-object v9

    .line 308
    :pswitch_5
    sget-object v0, Lq71;->α:Lq71;

    .line 309
    .line 310
    new-instance v0, Lg71;

    .line 311
    .line 312
    invoke-direct {v0, v10, v7}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 313
    .line 314
    .line 315
    invoke-static {v10, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 316
    .line 317
    .line 318
    return-object v9

    .line 319
    :pswitch_6
    sget-object v0, Lq71;->α:Lq71;

    .line 320
    .line 321
    new-instance v0, Lf9;

    .line 322
    .line 323
    const/16 v1, 0x1b

    .line 324
    .line 325
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 326
    .line 327
    .line 328
    const-string v1, "\u4e0b\u8f7d\u89c6\u9891"

    .line 329
    .line 330
    invoke-static {v10, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 331
    .line 332
    .line 333
    return-object v9

    .line 334
    :pswitch_7
    sget-object v0, Lq71;->α:Lq71;

    .line 335
    .line 336
    new-instance v0, Lf9;

    .line 337
    .line 338
    const/16 v1, 0x17

    .line 339
    .line 340
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 341
    .line 342
    .line 343
    invoke-static {v10, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 344
    .line 345
    .line 346
    return-object v9

    .line 347
    :pswitch_8
    sget-object v0, Lq71;->α:Lq71;

    .line 348
    .line 349
    new-instance v0, Lf9;

    .line 350
    .line 351
    const/16 v1, 0x1d

    .line 352
    .line 353
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 354
    .line 355
    .line 356
    invoke-static {v10, v2, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 357
    .line 358
    .line 359
    return-object v9

    .line 360
    :pswitch_9
    invoke-virtual {v10}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    if-eqz v0, :cond_2

    .line 365
    .line 366
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-eqz v0, :cond_2

    .line 371
    .line 372
    new-instance v1, Ln9;

    .line 373
    .line 374
    const/16 v2, 0x1a

    .line 375
    .line 376
    invoke-direct {v1, v10, v2}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 380
    .line 381
    .line 382
    :cond_2
    return-object v9

    .line 383
    :pswitch_a
    sget-object v0, Lq71;->α:Lq71;

    .line 384
    .line 385
    invoke-static {}, Lq71;->Δ()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v10, v0}, Lq71;->υ(Landroid/app/Activity;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-object v9

    .line 393
    :pswitch_b
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    new-instance v0, Ln9;

    .line 397
    .line 398
    const/16 v1, 0x14

    .line 399
    .line 400
    invoke-direct {v0, v10, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v10, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 404
    .line 405
    .line 406
    return-object v9

    .line 407
    :pswitch_c
    invoke-static {}, Lx9;->γ()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-nez v0, :cond_3

    .line 412
    .line 413
    const-string v0, "\u7fa4\u7ba1\u7406\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 414
    .line 415
    invoke-static {v10, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 420
    .line 421
    .line 422
    goto :goto_3

    .line 423
    :cond_3
    sget-object v0, Lec0;->α:Landroid/os/Handler;

    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v10}, Landroid/app/Activity;->isFinishing()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-nez v0, :cond_6

    .line 433
    .line 434
    invoke-virtual {v10}, Landroid/app/Activity;->isDestroyed()Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_4

    .line 439
    .line 440
    goto :goto_3

    .line 441
    :cond_4
    invoke-static {}, Lx9;->γ()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-nez v0, :cond_5

    .line 446
    .line 447
    new-instance v0, Ln9;

    .line 448
    .line 449
    const/16 v1, 0x11

    .line 450
    .line 451
    invoke-direct {v0, v10, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 455
    .line 456
    .line 457
    goto :goto_3

    .line 458
    :cond_5
    new-instance v0, Ln9;

    .line 459
    .line 460
    const/16 v1, 0x12

    .line 461
    .line 462
    invoke-direct {v0, v10, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v10, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 466
    .line 467
    .line 468
    :cond_6
    :goto_3
    return-object v9

    .line 469
    :pswitch_d
    invoke-static {}, Lx9;->β()Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-nez v0, :cond_7

    .line 474
    .line 475
    const-string v0, "\u6279\u91cf\u5220\u9664\u4f1a\u8bdd\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 476
    .line 477
    invoke-static {v10, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 482
    .line 483
    .line 484
    goto :goto_4

    .line 485
    :cond_7
    invoke-static {v10}, Lmi0;->β(Landroid/app/Activity;)V

    .line 486
    .line 487
    .line 488
    :goto_4
    return-object v9

    .line 489
    :pswitch_e
    sget-object v0, Lq71;->α:Lq71;

    .line 490
    .line 491
    new-instance v0, Lg71;

    .line 492
    .line 493
    invoke-direct {v0, v10, v3}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 494
    .line 495
    .line 496
    invoke-static {v10, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 497
    .line 498
    .line 499
    return-object v9

    .line 500
    :pswitch_f
    const-string v0, "\u6b63\u5728\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1\uff0c\u5e76\u5728\u5b8c\u6210\u540e\u81ea\u52a8\u9886\u53d6"

    .line 501
    .line 502
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 507
    .line 508
    .line 509
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 510
    .line 511
    new-instance v0, Lg71;

    .line 512
    .line 513
    invoke-direct {v0, v10, v5}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    new-instance v11, Llg1;

    .line 520
    .line 521
    const/16 v19, 0x0

    .line 522
    .line 523
    const/16 v20, 0xf0

    .line 524
    .line 525
    sget-object v12, Lkg1;->ζ:Lkg1;

    .line 526
    .line 527
    const/4 v13, 0x1

    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x1

    .line 530
    const/16 v16, 0x0

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const/16 v18, 0x0

    .line 535
    .line 536
    invoke-direct/range {v11 .. v20}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 537
    .line 538
    .line 539
    invoke-static {v10, v11, v0}, Lpg1;->ν(Landroid/app/Activity;Llg1;La80;)V

    .line 540
    .line 541
    .line 542
    return-object v9

    .line 543
    :pswitch_10
    const-string v0, "\u6b63\u5728\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1\uff0c\u8fdb\u5ea6\u5c06\u5728\u9876\u90e8\u663e\u793a"

    .line 544
    .line 545
    const/4 v15, 0x0

    .line 546
    invoke-static {v10, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 551
    .line 552
    .line 553
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 554
    .line 555
    new-instance v0, Lf9;

    .line 556
    .line 557
    const/16 v1, 0xf

    .line 558
    .line 559
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    new-instance v11, Llg1;

    .line 566
    .line 567
    const/16 v19, 0x0

    .line 568
    .line 569
    const/16 v20, 0xf0

    .line 570
    .line 571
    sget-object v12, Lkg1;->ζ:Lkg1;

    .line 572
    .line 573
    const/4 v13, 0x1

    .line 574
    const/4 v14, 0x0

    .line 575
    const/16 v16, 0x0

    .line 576
    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/16 v18, 0x0

    .line 580
    .line 581
    invoke-direct/range {v11 .. v20}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 582
    .line 583
    .line 584
    invoke-static {v10, v11, v0}, Lpg1;->ν(Landroid/app/Activity;Llg1;La80;)V

    .line 585
    .line 586
    .line 587
    return-object v9

    .line 588
    :pswitch_11
    const-string v0, "\u6b63\u5728\u9886\u53d6\u4eb2\u5bc6\u5ea6"

    .line 589
    .line 590
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 595
    .line 596
    .line 597
    sget-object v0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 598
    .line 599
    new-instance v0, Lf9;

    .line 600
    .line 601
    const/16 v1, 0x16

    .line 602
    .line 603
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-static {}, Lx9;->η()Z

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    iget-object v2, v0, Lf9;->ζ:Landroid/app/Activity;

    .line 614
    .line 615
    if-nez v1, :cond_8

    .line 616
    .line 617
    sget-object v0, Lq71;->α:Lq71;

    .line 618
    .line 619
    const-string v0, "\u4eb2\u5bc6\u5ea6\u9886\u53d6\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 620
    .line 621
    invoke-static {v2, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 626
    .line 627
    .line 628
    goto :goto_6

    .line 629
    :cond_8
    sget-object v1, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 630
    .line 631
    invoke-virtual {v1, v8, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    if-nez v1, :cond_9

    .line 636
    .line 637
    sget-object v0, Lq71;->α:Lq71;

    .line 638
    .line 639
    const-string v0, "\u5df2\u6709\u4eb2\u5bc6\u5ea6\u4efb\u52a1\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 640
    .line 641
    invoke-static {v2, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 646
    .line 647
    .line 648
    goto :goto_6

    .line 649
    :cond_9
    sget-object v1, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    if-eqz v1, :cond_a

    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    if-eqz v1, :cond_a

    .line 666
    .line 667
    goto :goto_5

    .line 668
    :cond_a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    :goto_5
    new-instance v2, Ljava/lang/Thread;

    .line 677
    .line 678
    new-instance v3, Le9;

    .line 679
    .line 680
    const/16 v4, 0x18

    .line 681
    .line 682
    invoke-direct {v3, v1, v10, v0, v4}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 683
    .line 684
    .line 685
    const-string v0, "r3986febebe8e2287"

    .line 686
    .line 687
    invoke-direct {v2, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v7}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 694
    .line 695
    .line 696
    :goto_6
    return-object v9

    .line 697
    :pswitch_12
    const-string v0, "\u6b63\u5728\u9886\u53d6\u706b\u661f\uff0c\u8fdb\u5ea6\u5c06\u5728\u9876\u90e8\u663e\u793a"

    .line 698
    .line 699
    invoke-static {v10, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 704
    .line 705
    .line 706
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 707
    .line 708
    new-instance v0, Lf9;

    .line 709
    .line 710
    const/4 v1, 0x5

    .line 711
    invoke-direct {v0, v10, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    new-instance v11, Llg1;

    .line 718
    .line 719
    const/16 v19, 0x0

    .line 720
    .line 721
    const/16 v20, 0xf0

    .line 722
    .line 723
    sget-object v12, Lkg1;->ε:Lkg1;

    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const/4 v14, 0x0

    .line 727
    const/4 v15, 0x1

    .line 728
    const/16 v16, 0x0

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/16 v18, 0x0

    .line 733
    .line 734
    invoke-direct/range {v11 .. v20}, Llg1;-><init>(Lkg1;ZZZZLandroid/net/Uri;Lky1;Lmy1;I)V

    .line 735
    .line 736
    .line 737
    invoke-static {v10, v11, v0}, Lpg1;->ν(Landroid/app/Activity;Llg1;La80;)V

    .line 738
    .line 739
    .line 740
    return-object v9

    .line 741
    :pswitch_data_0
    .packed-switch 0x0
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
