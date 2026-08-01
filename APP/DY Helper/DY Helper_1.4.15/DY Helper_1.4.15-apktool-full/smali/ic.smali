.class public final synthetic Lic;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lan;Lkc;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lic;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lic;->η:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lic;->ε:I

    iput-object p1, p0, Lic;->η:Ljava/lang/Object;

    iput-object p3, p0, Lic;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq4;Lan;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput p3, p0, Lic;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lic;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lic;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lic;->ε:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Ls62;->α:Ls62;

    .line 9
    .line 10
    iget-object v6, p0, Lic;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lic;->η:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/app/Activity;

    .line 18
    .line 19
    check-cast v6, Lqh1;

    .line 20
    .line 21
    check-cast p1, Landroid/net/Uri;

    .line 22
    .line 23
    check-cast p2, Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Ljg1;

    .line 26
    .line 27
    const/16 v1, 0x9

    .line 28
    .line 29
    invoke-direct {v0, p1, v6, p2, v1}, Ljg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-object v5

    .line 36
    :pswitch_0
    check-cast p0, Landroid/widget/ProgressBar;

    .line 37
    .line 38
    check-cast v6, Landroid/widget/TextView;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    check-cast p2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lu72;->β:Landroid/os/Handler;

    .line 52
    .line 53
    new-instance v1, Lvw;

    .line 54
    .line 55
    invoke-direct {v1, p0, p1, v6, p2}, Lvw;-><init>(Landroid/widget/ProgressBar;ILandroid/widget/TextView;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :pswitch_1
    check-cast p0, Landroid/content/Context;

    .line 63
    .line 64
    check-cast v6, Lum1;

    .line 65
    .line 66
    check-cast p1, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    check-cast p2, Landroid/widget/Switch;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object v0, Lbv1;->α:Lbv1;

    .line 78
    .line 79
    new-instance v0, Lv00;

    .line 80
    .line 81
    invoke-direct {v0, v6, p1, v3}, Lv00;-><init>(Ljava/lang/Object;ZI)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const-string v1, "bottom_bar_hidden"

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_1

    .line 97
    .line 98
    invoke-static {v1, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eq p1, v0, :cond_0

    .line 103
    .line 104
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    :cond_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eq p0, v0, :cond_2

    .line 112
    .line 113
    new-instance p0, Ljg;

    .line 114
    .line 115
    invoke-direct {p0, p2, v0, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    :cond_2
    :goto_0
    return-object v5

    .line 129
    :pswitch_2
    check-cast p0, La80;

    .line 130
    .line 131
    check-cast v6, Landroid/widget/Switch;

    .line 132
    .line 133
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    check-cast p2, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v0, Lbv1;->α:Lbv1;

    .line 145
    .line 146
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    const-string p1, "\u672a\u9009\u62e9"

    .line 153
    .line 154
    :cond_3
    const/16 v0, 0x20

    .line 155
    .line 156
    invoke-static {p1, v0}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    if-eqz p2, :cond_4

    .line 164
    .line 165
    if-eqz v6, :cond_4

    .line 166
    .line 167
    invoke-virtual {v6, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 168
    .line 169
    .line 170
    :cond_4
    return-object v5

    .line 171
    :pswitch_3
    check-cast p0, Landroid/content/Context;

    .line 172
    .line 173
    check-cast v6, Ljava/lang/String;

    .line 174
    .line 175
    check-cast p1, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    check-cast p2, Landroid/widget/Switch;

    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    sget-object v0, Lbv1;->α:Lbv1;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_6

    .line 196
    .line 197
    invoke-static {v6, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eq p1, v0, :cond_5

    .line 202
    .line 203
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    :cond_5
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eq p0, v0, :cond_7

    .line 211
    .line 212
    new-instance p0, Ljg;

    .line 213
    .line 214
    invoke-direct {p0, p2, v0, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_6
    invoke-static {v6, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    invoke-static {}, Lv71;->ν()V

    .line 225
    .line 226
    .line 227
    :cond_7
    :goto_1
    return-object v5

    .line 228
    :pswitch_4
    check-cast p0, Landroid/app/Activity;

    .line 229
    .line 230
    check-cast v6, Landroid/widget/LinearLayout;

    .line 231
    .line 232
    check-cast p1, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    check-cast p2, Landroid/widget/Switch;

    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    sget-object p2, Lbv1;->α:Lbv1;

    .line 244
    .line 245
    const-string p2, "comment_bg_image_blur_enabled"

    .line 246
    .line 247
    invoke-static {p2, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 248
    .line 249
    .line 250
    invoke-static {p0}, Ljx0;->ν(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    if-eqz p1, :cond_8

    .line 254
    .line 255
    move v1, v4

    .line 256
    :cond_8
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 257
    .line 258
    .line 259
    return-object v5

    .line 260
    :pswitch_5
    check-cast p0, Lqm1;

    .line 261
    .line 262
    check-cast v6, Landroid/widget/LinearLayout;

    .line 263
    .line 264
    check-cast p1, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    check-cast p2, Landroid/widget/Switch;

    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iput-boolean p1, p0, Lqm1;->ε:Z

    .line 276
    .line 277
    sget-object p0, Lbv1;->α:Lbv1;

    .line 278
    .line 279
    const-string p0, "info_bar_enabled"

    .line 280
    .line 281
    invoke-static {p0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    if-eqz p1, :cond_9

    .line 285
    .line 286
    move v1, v4

    .line 287
    :cond_9
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 288
    .line 289
    .line 290
    return-object v5

    .line 291
    :pswitch_6
    check-cast p0, Landroid/app/Activity;

    .line 292
    .line 293
    check-cast v6, Landroid/app/AlertDialog;

    .line 294
    .line 295
    check-cast p1, Llh0;

    .line 296
    .line 297
    check-cast p2, Ljava/lang/Throwable;

    .line 298
    .line 299
    :try_start_0
    invoke-virtual {v6}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    .line 301
    .line 302
    :catchall_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_12

    .line 307
    .line 308
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_a

    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_a
    const/4 v0, 0x0

    .line 317
    if-eqz p1, :cond_d

    .line 318
    .line 319
    sget-object p2, Lq71;->α:Lq71;

    .line 320
    .line 321
    iget-object p2, p1, Llh0;->θ:Ljava/lang/Long;

    .line 322
    .line 323
    iget-object v1, p1, Llh0;->ι:Ljava/lang/Long;

    .line 324
    .line 325
    invoke-static {p2, v1}, Lq71;->σ(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    iget-boolean v1, p1, Llh0;->ζ:Z

    .line 330
    .line 331
    iget-object v2, p1, Llh0;->η:Ljava/lang/String;

    .line 332
    .line 333
    if-eqz v1, :cond_b

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_b
    const-string v6, "\u90e8\u5206\u5bfc\u51fa\uff1a"

    .line 337
    .line 338
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    :goto_2
    new-instance v6, Landroid/app/AlertDialog$Builder;

    .line 343
    .line 344
    invoke-direct {v6, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 345
    .line 346
    .line 347
    if-eqz v1, :cond_c

    .line 348
    .line 349
    const-string v1, "\u5bfc\u51fa\u5b8c\u6210"

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_c
    const-string v1, "\u5bfc\u51fa\u5b8c\u6210\uff08\u90e8\u5206\uff09"

    .line 353
    .line 354
    :goto_3
    invoke-virtual {v6, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iget-object v6, p1, Llh0;->β:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v7, p1, Llh0;->γ:Lhh0;

    .line 361
    .line 362
    iget-object v7, v7, Lhh0;->ε:Ljava/lang/String;

    .line 363
    .line 364
    iget v8, p1, Llh0;->δ:I

    .line 365
    .line 366
    iget v9, p1, Llh0;->κ:I

    .line 367
    .line 368
    const-string v10, "\n\u683c\u5f0f\uff1a"

    .line 369
    .line 370
    const-string v11, "\n\u6d88\u606f\uff1a"

    .line 371
    .line 372
    const-string v12, "\u6587\u4ef6\uff1a"

    .line 373
    .line 374
    invoke-static {v12, v6, v10, v7, v11}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    const-string v7, " \u6761\n\u65f6\u95f4\uff1a"

    .line 379
    .line 380
    const-string v10, "\n\u6708\u4efd\uff1a"

    .line 381
    .line 382
    invoke-static {v6, v8, v7, p2, v10}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string p2, " \u4e2a\n\u72b6\u6001\uff1a"

    .line 389
    .line 390
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    new-instance v1, Ly61;

    .line 405
    .line 406
    invoke-direct {v1, p0, p1, v4}, Ly61;-><init>(Landroid/app/Activity;Llh0;I)V

    .line 407
    .line 408
    .line 409
    const-string v2, "\u6253\u5f00"

    .line 410
    .line 411
    invoke-virtual {p2, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    new-instance v1, Ly61;

    .line 416
    .line 417
    invoke-direct {v1, p0, p1, v3}, Ly61;-><init>(Landroid/app/Activity;Llh0;I)V

    .line 418
    .line 419
    .line 420
    const-string p0, "\u5206\u4eab"

    .line 421
    .line 422
    invoke-virtual {p2, p0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    const-string p1, "\u5173\u95ed"

    .line 427
    .line 428
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 433
    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_d
    instance-of p1, p2, Ljava/util/concurrent/CancellationException;

    .line 437
    .line 438
    if-eqz p1, :cond_e

    .line 439
    .line 440
    const-string p1, "\u5df2\u53d6\u6d88\u804a\u5929\u8bb0\u5f55\u5bfc\u51fa"

    .line 441
    .line 442
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 447
    .line 448
    .line 449
    goto :goto_5

    .line 450
    :cond_e
    if-eqz p2, :cond_10

    .line 451
    .line 452
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    if-eqz p1, :cond_10

    .line 457
    .line 458
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    if-nez p2, :cond_f

    .line 463
    .line 464
    goto :goto_4

    .line 465
    :cond_f
    move-object p1, v0

    .line 466
    :goto_4
    if-nez p1, :cond_11

    .line 467
    .line 468
    :cond_10
    const-string p1, "\u672a\u77e5\u539f\u56e0"

    .line 469
    .line 470
    :cond_11
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 471
    .line 472
    invoke-direct {p2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    const-string p0, "\u5bfc\u51fa\u5931\u8d25"

    .line 476
    .line 477
    invoke-virtual {p2, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    const-string p1, "\u77e5\u9053\u4e86"

    .line 486
    .line 487
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 492
    .line 493
    .line 494
    :cond_12
    :goto_5
    return-object v5

    .line 495
    :pswitch_7
    check-cast p0, Len1;

    .line 496
    .line 497
    check-cast v6, Lrw1;

    .line 498
    .line 499
    check-cast p1, Ljava/lang/Integer;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    instance-of v0, p2, Lfn;

    .line 506
    .line 507
    if-eqz v0, :cond_13

    .line 508
    .line 509
    check-cast p2, Lfn;

    .line 510
    .line 511
    iget-object p0, p0, Len1;->ζ:Lk21;

    .line 512
    .line 513
    invoke-virtual {p0, p2}, Lk21;->β(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    goto :goto_6

    .line 517
    :cond_13
    instance-of v0, p2, Lho1;

    .line 518
    .line 519
    if-nez v0, :cond_15

    .line 520
    .line 521
    instance-of v0, p2, La90;

    .line 522
    .line 523
    if-eqz v0, :cond_14

    .line 524
    .line 525
    invoke-static {v6, p1, p2}, Lln0;->г(Lrw1;ILjava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    check-cast p2, La90;

    .line 529
    .line 530
    invoke-virtual {p0, p2}, Len1;->δ(La90;)V

    .line 531
    .line 532
    .line 533
    goto :goto_6

    .line 534
    :cond_14
    instance-of p0, p2, Lbl1;

    .line 535
    .line 536
    if-eqz p0, :cond_15

    .line 537
    .line 538
    invoke-static {v6, p1, p2}, Lln0;->г(Lrw1;ILjava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    check-cast p2, Lbl1;

    .line 542
    .line 543
    invoke-virtual {p2}, Lbl1;->γ()V

    .line 544
    .line 545
    .line 546
    :cond_15
    :goto_6
    return-object v5

    .line 547
    :pswitch_8
    check-cast p0, Lq4;

    .line 548
    .line 549
    check-cast v6, Lan;

    .line 550
    .line 551
    check-cast p1, Lv80;

    .line 552
    .line 553
    check-cast p2, Ljava/lang/Integer;

    .line 554
    .line 555
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    const/16 p2, 0x39

    .line 559
    .line 560
    invoke-static {p2}, Lv81;->σ(I)I

    .line 561
    .line 562
    .line 563
    move-result p2

    .line 564
    invoke-static {p0, v6, p1, p2}, Lxb;->ε(Lq4;Lan;Lv80;I)V

    .line 565
    .line 566
    .line 567
    return-object v5

    .line 568
    :pswitch_9
    check-cast v6, Lan;

    .line 569
    .line 570
    check-cast p0, Lkc;

    .line 571
    .line 572
    check-cast p1, Lv80;

    .line 573
    .line 574
    check-cast p2, Ljava/lang/Integer;

    .line 575
    .line 576
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result p2

    .line 580
    and-int/lit8 v0, p2, 0x3

    .line 581
    .line 582
    const/4 v1, 0x2

    .line 583
    if-eq v0, v1, :cond_16

    .line 584
    .line 585
    move v0, v3

    .line 586
    goto :goto_7

    .line 587
    :cond_16
    move v0, v4

    .line 588
    :goto_7
    and-int/2addr p2, v3

    .line 589
    invoke-virtual {p1, p2, v0}, Lv80;->Ξ(IZ)Z

    .line 590
    .line 591
    .line 592
    move-result p2

    .line 593
    if-eqz p2, :cond_17

    .line 594
    .line 595
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object p2

    .line 599
    invoke-virtual {v6, p0, p1, p2}, Lan;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    goto :goto_8

    .line 603
    :cond_17
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 604
    .line 605
    .line 606
    :goto_8
    return-object v5

    .line 607
    :pswitch_a
    check-cast p0, Lpx0;

    .line 608
    .line 609
    check-cast v6, Lan;

    .line 610
    .line 611
    check-cast p1, Li12;

    .line 612
    .line 613
    check-cast p2, Lyo;

    .line 614
    .line 615
    new-instance v0, Lkc;

    .line 616
    .line 617
    iget-wide v1, p2, Lyo;->α:J

    .line 618
    .line 619
    invoke-direct {v0, p1, v1, v2}, Lkc;-><init>(Li12;J)V

    .line 620
    .line 621
    .line 622
    new-instance v1, Lic;

    .line 623
    .line 624
    invoke-direct {v1, v6, v0}, Lic;-><init>(Lan;Lkc;)V

    .line 625
    .line 626
    .line 627
    new-instance v0, Lan;

    .line 628
    .line 629
    const v2, -0x19bf96da

    .line 630
    .line 631
    .line 632
    invoke-direct {v0, v2, v3, v1}, Lan;-><init>(IZLm80;)V

    .line 633
    .line 634
    .line 635
    invoke-interface {p1, v0}, Li12;->φ(Le80;)Ljava/util/List;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    iget-wide v1, p2, Lyo;->α:J

    .line 640
    .line 641
    invoke-interface {p0, p1, v0, v1, v2}, Lpx0;->ε(Lrx0;Ljava/util/List;J)Lqx0;

    .line 642
    .line 643
    .line 644
    move-result-object p0

    .line 645
    return-object p0

    .line 646
    nop

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
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
