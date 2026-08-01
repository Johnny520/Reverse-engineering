.class public final synthetic Ll9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Ll9;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll9;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ll9;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Ll9;->ε:I

    iput-object p1, p0, Ll9;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Ll9;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget v0, p0, Ll9;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object v5, p0, Ll9;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Ll9;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lva2;

    .line 15
    .line 16
    check-cast v5, Landroid/app/Dialog;

    .line 17
    .line 18
    invoke-virtual {p0}, Lva2;->α()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/app/Dialog;->dismiss()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    check-cast p0, Landroid/app/Activity;

    .line 26
    .line 27
    check-cast v5, Lum1;

    .line 28
    .line 29
    sget-object p1, Lry1;->α:Lry1;

    .line 30
    .line 31
    invoke-static {}, Lry1;->х()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    const-string p1, "\u8bf7\u5148\u624b\u52a8\u53d1\u9001\u4e00\u6761\u6d88\u606f\u6765\u6fc0\u6d3b"

    .line 38
    .line 39
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p1, "\u6b63\u5728\u7eed\u706b\u82b1..."

    .line 48
    .line 49
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 54
    .line 55
    .line 56
    iget-object p1, v5, Lum1;->ε:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Landroid/app/AlertDialog;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 63
    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/Thread;

    .line 66
    .line 67
    new-instance v0, Lhg1;

    .line 68
    .line 69
    const/16 v1, 0xb

    .line 70
    .line 71
    invoke-direct {v0, p0, v1}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :pswitch_1
    check-cast p0, Landroid/content/Context;

    .line 82
    .line 83
    check-cast v5, Landroid/net/Uri;

    .line 84
    .line 85
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    .line 86
    .line 87
    const-string v0, "android.intent.action.VIEW"

    .line 88
    .line 89
    invoke-direct {p1, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    new-instance v0, Leo1;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object p1, v0

    .line 105
    :goto_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_2

    .line 110
    .line 111
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u7fa4\u7ec4\u94fe\u63a5"

    .line 112
    .line 113
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 118
    .line 119
    .line 120
    :cond_2
    return-void

    .line 121
    :pswitch_2
    check-cast p0, Landroid/widget/LinearLayout;

    .line 122
    .line 123
    check-cast v5, Landroid/widget/Switch;

    .line 124
    .line 125
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    xor-int/2addr p0, v3

    .line 133
    invoke-virtual {v5, p0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_3
    check-cast p0, Ltm1;

    .line 138
    .line 139
    check-cast v5, Lp70;

    .line 140
    .line 141
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    iget-wide v2, p0, Ltm1;->ε:J

    .line 146
    .line 147
    sub-long v2, v0, v2

    .line 148
    .line 149
    const-wide/16 v6, 0x258

    .line 150
    .line 151
    cmp-long p1, v2, v6

    .line 152
    .line 153
    if-gez p1, :cond_3

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_3
    iput-wide v0, p0, Ltm1;->ε:J

    .line 157
    .line 158
    invoke-interface {v5}, Lp70;->invoke()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :goto_2
    return-void

    .line 162
    :pswitch_4
    check-cast p0, Lj71;

    .line 163
    .line 164
    check-cast v5, Landroid/widget/LinearLayout;

    .line 165
    .line 166
    iget-object p1, p0, Lj71;->θ:Lp70;

    .line 167
    .line 168
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    iget-boolean p1, p0, Lj71;->γ:Z

    .line 172
    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    iget-boolean p0, p0, Lj71;->η:Z

    .line 176
    .line 177
    if-nez p0, :cond_4

    .line 178
    .line 179
    sget-object p0, Lq71;->α:Lq71;

    .line 180
    .line 181
    invoke-static {v5}, Lq71;->μ(Landroid/view/View;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    return-void

    .line 185
    :pswitch_5
    check-cast p0, Landroid/app/Activity;

    .line 186
    .line 187
    check-cast v5, Landroid/widget/TextView;

    .line 188
    .line 189
    new-instance p1, Lq61;

    .line 190
    .line 191
    invoke-direct {p1, p0, v5, v4}, Lq61;-><init>(Landroid/app/Activity;Landroid/widget/TextView;I)V

    .line 192
    .line 193
    .line 194
    invoke-static {p0, p1}, Lyh;->п(Landroid/app/Activity;La80;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_6
    check-cast p0, Lli0;

    .line 199
    .line 200
    check-cast v5, Ljj0;

    .line 201
    .line 202
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 203
    .line 204
    if-nez p1, :cond_6

    .line 205
    .line 206
    iget-object p1, p0, Lli0;->ω:Ljj0;

    .line 207
    .line 208
    if-ne p1, v5, :cond_5

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_5
    iput-object v5, p0, Lli0;->ω:Ljj0;

    .line 212
    .line 213
    invoke-virtual {p0}, Lli0;->α()V

    .line 214
    .line 215
    .line 216
    :cond_6
    :goto_3
    return-void

    .line 217
    :pswitch_7
    check-cast p0, Lub0;

    .line 218
    .line 219
    check-cast v5, Lic0;

    .line 220
    .line 221
    iget-boolean p1, p0, Lub0;->κ:Z

    .line 222
    .line 223
    if-nez p1, :cond_7

    .line 224
    .line 225
    iget-object p0, p0, Lub0;->ζ:Lyb0;

    .line 226
    .line 227
    invoke-virtual {p0, v5}, Lyb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    :cond_7
    return-void

    .line 231
    :pswitch_8
    check-cast v5, Lcom/example/dyhelper/ui/GestureAreaView;

    .line 232
    .line 233
    check-cast p0, Landroid/app/Activity;

    .line 234
    .line 235
    invoke-virtual {v5}, Lcom/example/dyhelper/ui/GestureAreaView;->ζ()V

    .line 236
    .line 237
    .line 238
    sget-object p1, Lia0;->α:Landroid/app/AlertDialog;

    .line 239
    .line 240
    if-eqz p1, :cond_8

    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 243
    .line 244
    .line 245
    :cond_8
    sget-object p1, Lbv1;->α:Lbv1;

    .line 246
    .line 247
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_9

    .line 260
    .line 261
    sget-object p1, Lbv1;->β:Landroid/app/AlertDialog;

    .line 262
    .line 263
    if-eqz p1, :cond_a

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_9
    sget-object p1, Lbv1;->γ:Landroid/os/Handler;

    .line 270
    .line 271
    new-instance v0, Lfb0;

    .line 272
    .line 273
    const/16 v1, 0x13

    .line 274
    .line 275
    invoke-direct {v0, v1}, Lfb0;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 279
    .line 280
    .line 281
    :cond_a
    :goto_4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    if-eqz p1, :cond_b

    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    if-eqz p1, :cond_b

    .line 292
    .line 293
    new-instance v0, Ln9;

    .line 294
    .line 295
    const/16 v1, 0x10

    .line 296
    .line 297
    invoke-direct {v0, p0, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_b
    sget-object p1, Lx10;->α:Lx10;

    .line 305
    .line 306
    new-instance p1, Ln9;

    .line 307
    .line 308
    const/4 v0, 0x5

    .line 309
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 313
    .line 314
    .line 315
    :goto_5
    return-void

    .line 316
    :pswitch_9
    check-cast p0, Landroid/widget/TextView;

    .line 317
    .line 318
    check-cast v5, Lp70;

    .line 319
    .line 320
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 321
    .line 322
    .line 323
    invoke-interface {v5}, Lp70;->invoke()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_a
    check-cast p0, Landroid/app/Activity;

    .line 328
    .line 329
    check-cast v5, Landroid/widget/LinearLayout;

    .line 330
    .line 331
    sget-object p1, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 332
    .line 333
    invoke-static {v4}, Lct;->β(I)V

    .line 334
    .line 335
    .line 336
    const-string p1, "\u9ab0\u5b50\u5df2\u6062\u590d\u968f\u673a\u6a21\u5f0f"

    .line 337
    .line 338
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 343
    .line 344
    .line 345
    :goto_6
    if-eqz v5, :cond_e

    .line 346
    .line 347
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    instance-of p1, p1, Landroid/app/AlertDialog;

    .line 352
    .line 353
    if-eqz p1, :cond_c

    .line 354
    .line 355
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    check-cast p1, Landroid/app/AlertDialog;

    .line 363
    .line 364
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 365
    .line 366
    .line 367
    goto :goto_7

    .line 368
    :cond_c
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    instance-of v0, p1, Landroid/view/View;

    .line 373
    .line 374
    if-eqz v0, :cond_d

    .line 375
    .line 376
    check-cast p1, Landroid/view/View;

    .line 377
    .line 378
    move-object v5, p1

    .line 379
    goto :goto_6

    .line 380
    :cond_d
    move-object v5, v1

    .line 381
    goto :goto_6

    .line 382
    :cond_e
    :goto_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    new-instance p1, Ln9;

    .line 386
    .line 387
    const/4 v0, 0x4

    .line 388
    invoke-direct {p1, p0, v0}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_b
    check-cast p0, Lb8;

    .line 396
    .line 397
    check-cast v5, Lmk;

    .line 398
    .line 399
    iget-object p0, p0, Lb8;->γ:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast p0, Lng;

    .line 402
    .line 403
    invoke-virtual {p0, v5}, Lng;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_c
    check-cast p0, Landroid/app/Activity;

    .line 408
    .line 409
    check-cast v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 410
    .line 411
    invoke-static {p0, v5, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->ε(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_d
    check-cast p0, Landroid/content/Context;

    .line 416
    .line 417
    check-cast v5, Lcj;

    .line 418
    .line 419
    sget-object p1, Lfj;->α:Lfj;

    .line 420
    .line 421
    sget-object p1, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 422
    .line 423
    iget-object v0, v5, Lcj;->α:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Lcj;

    .line 430
    .line 431
    if-nez p1, :cond_f

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_f
    move-object v5, p1

    .line 435
    :goto_8
    invoke-static {p0, v5}, Lfj;->Θ(Landroid/content/Context;Lcj;)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :pswitch_e
    check-cast p0, Landroid/app/Activity;

    .line 440
    .line 441
    check-cast v5, Lp9;

    .line 442
    .line 443
    const-string p1, "clipboard"

    .line 444
    .line 445
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    instance-of v0, p1, Landroid/content/ClipboardManager;

    .line 450
    .line 451
    if-eqz v0, :cond_10

    .line 452
    .line 453
    move-object v1, p1

    .line 454
    check-cast v1, Landroid/content/ClipboardManager;

    .line 455
    .line 456
    :cond_10
    if-nez v1, :cond_11

    .line 457
    .line 458
    const-string p1, "\u590d\u5236\u5931\u8d25\uff1a\u526a\u8d34\u677f\u4e0d\u53ef\u7528"

    .line 459
    .line 460
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 465
    .line 466
    .line 467
    goto :goto_9

    .line 468
    :cond_11
    :try_start_1
    const-string p1, "DYHelper\u516c\u544a"

    .line 469
    .line 470
    new-instance v0, Ljava/lang/StringBuilder;

    .line 471
    .line 472
    const-string v2, "DYHelper \u516c\u544a\n\u65e5\u671f\uff1a"

    .line 473
    .line 474
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    iget-object v2, v5, Lp9;->α:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    const-string v2, "\n\n"

    .line 483
    .line 484
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    iget-object v2, v5, Lp9;->β:Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {p1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 501
    .line 502
    .line 503
    const-string p1, "\u516c\u544a\u5df2\u590d\u5236"

    .line 504
    .line 505
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 510
    .line 511
    .line 512
    goto :goto_9

    .line 513
    :catchall_1
    move-exception p1

    .line 514
    const-string v0, "r24de9f070d18b34b"

    .line 515
    .line 516
    const-string v1, "\u590d\u5236\u516c\u544a\u5230\u526a\u8d34\u677f\u5931\u8d25"

    .line 517
    .line 518
    invoke-static {v0, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 519
    .line 520
    .line 521
    const-string p1, "\u590d\u5236\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 522
    .line 523
    invoke-static {p0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 528
    .line 529
    .line 530
    :goto_9
    return-void

    .line 531
    :pswitch_data_0
    .packed-switch 0x0
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
