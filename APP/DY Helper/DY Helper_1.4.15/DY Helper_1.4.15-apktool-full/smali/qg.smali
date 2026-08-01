.class public final Lqg;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;

.field public final synthetic γ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 18
    iput p1, p0, Lqg;->α:I

    iput-object p3, p0, Lqg;->γ:Ljava/lang/Object;

    iput-object p2, p0, Lqg;->β:Ljava/lang/Object;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lqg;->α:I

    .line 4
    .line 5
    sget-object v0, Lc82;->α:Lc82;

    .line 6
    .line 7
    iput-object p1, p0, Lqg;->β:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqg;->γ:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Lm01;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p2, p0, Lqg;->α:I

    iput-object p1, p0, Lqg;->β:Ljava/lang/Object;

    iput-object p3, p0, Lqg;->γ:Ljava/lang/Object;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p4, p0, Lqg;->α:I

    iput-object p2, p0, Lqg;->β:Ljava/lang/Object;

    iput-object p3, p0, Lqg;->γ:Ljava/lang/Object;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La80;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lqg;->α:I

    check-cast p2, Lp80;

    iput-object p2, p0, Lqg;->β:Ljava/lang/Object;

    iput-object p1, p0, Lqg;->γ:Ljava/lang/Object;

    .line 17
    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 9

    .line 1
    iget v0, p0, Lqg;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lqg;->γ:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, Lqg;->β:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of p1, p0, Landroid/content/Context;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    move-object v3, p0

    .line 34
    check-cast v3, Landroid/content/Context;

    .line 35
    .line 36
    :cond_0
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p1, "com.xingin.xhs"

    .line 44
    .line 45
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    check-cast v5, Lz81;

    .line 53
    .line 54
    check-cast v4, Ln5;

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    iget-object p0, v5, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object p0, v5, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 68
    .line 69
    invoke-static {v3, v5}, Lmd2;->α(Landroid/content/Context;Lz81;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lod2;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    sget-object p0, Lsw0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    invoke-static {v5, v4, p0}, Lod2;->α(Lz81;Ln5;Ljava/util/concurrent/atomic/AtomicBoolean;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    new-instance p1, Leo1;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object p0, p1

    .line 92
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    const-string p1, "XHSHelper"

    .line 99
    .line 100
    const-string v0, "SAMPLE attach \u9636\u6bb5 Hook \u5b89\u88c5\u5931\u8d25"

    .line 101
    .line 102
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    :goto_1
    return-void

    .line 106
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast v5, Lp80;

    .line 110
    .line 111
    :try_start_1
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-interface {v5, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_1
    move-exception p0

    .line 120
    new-instance p1, Leo1;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object p0, p1

    .line 126
    :goto_2
    check-cast v4, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-eqz p0, :cond_5

    .line 133
    .line 134
    const-string p1, " lifecycle callback failed"

    .line 135
    .line 136
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string v0, "rfae3094b732ade5a"

    .line 141
    .line 142
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    return-void

    .line 146
    :pswitch_2
    check-cast v5, Ljava/lang/String;

    .line 147
    .line 148
    check-cast v4, Ljava/lang/reflect/Method;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 154
    .line 155
    instance-of p1, p0, Landroid/view/View;

    .line 156
    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    check-cast p0, Landroid/view/View;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    move-object p0, v3

    .line 163
    :goto_3
    if-nez p0, :cond_7

    .line 164
    .line 165
    goto/16 :goto_8

    .line 166
    .line 167
    :cond_7
    sget-object p1, Lc30;->α:Ljava/util/Set;

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const-string v0, "onCreateView"

    .line 174
    .line 175
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_8

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_8
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    array-length v0, p1

    .line 190
    move v6, v1

    .line 191
    :goto_4
    if-ge v6, v0, :cond_c

    .line 192
    .line 193
    aget-object v7, p1, v6

    .line 194
    .line 195
    const-class v8, Landroid/content/Context;

    .line 196
    .line 197
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_b

    .line 202
    .line 203
    array-length v0, p1

    .line 204
    move v6, v1

    .line 205
    :goto_5
    if-ge v6, v0, :cond_c

    .line 206
    .line 207
    aget-object v7, p1, v6

    .line 208
    .line 209
    const-class v8, Landroid/view/ViewGroup;

    .line 210
    .line 211
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_a

    .line 216
    .line 217
    :goto_6
    sget-object p1, Lq10;->α:Lq10;

    .line 218
    .line 219
    new-instance p1, Lp3;

    .line 220
    .line 221
    const/4 v0, 0x7

    .line 222
    invoke-direct {p1, v5, v0, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v0, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    invoke-virtual {p1}, Lp3;->invoke()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_9
    sget-object v0, Lq10;->γ:Landroid/os/Handler;

    .line 244
    .line 245
    new-instance v6, Lr0;

    .line 246
    .line 247
    invoke-direct {v6, v2, p1}, Lr0;-><init>(ILp70;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_c
    :goto_7
    invoke-static {v5}, Lui1;->ω(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-nez p1, :cond_d

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    sget-object p1, Lc30;->α:Ljava/util/Set;

    .line 268
    .line 269
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const-string v4, "factory:"

    .line 282
    .line 283
    const-string v6, "#"

    .line 284
    .line 285
    invoke-static {v4, p1, v6, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-eqz v0, :cond_f

    .line 307
    .line 308
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 309
    .line 310
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 311
    .line 312
    instance-of v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 313
    .line 314
    if-eqz v4, :cond_e

    .line 315
    .line 316
    move-object v4, v0

    .line 317
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 318
    .line 319
    invoke-virtual {v4, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 320
    .line 321
    .line 322
    :cond_e
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 323
    .line 324
    .line 325
    :cond_f
    new-instance v0, Ljb;

    .line 326
    .line 327
    const/16 v1, 0x15

    .line 328
    .line 329
    invoke-direct {v0, p0, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    const-string v0, " reason="

    .line 344
    .line 345
    const-string v1, " view="

    .line 346
    .line 347
    const-string v4, "\u5df2\u9690\u85cf 3903 \u53f3\u4fa7\u63a7\u4ef6 control="

    .line 348
    .line 349
    invoke-static {v4, v5, v0, p1, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    const-string p1, "FeedRightControlsHide3903"

    .line 361
    .line 362
    invoke-static {p1, p0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :goto_8
    return-void

    .line 366
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    :try_start_2
    check-cast v5, La80;

    .line 370
    .line 371
    invoke-interface {v5, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 372
    .line 373
    .line 374
    goto :goto_9

    .line 375
    :catchall_2
    move-exception p0

    .line 376
    sget-object p1, Lmj;->α:Lh22;

    .line 377
    .line 378
    check-cast v4, Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    new-instance p1, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v0, "hook after "

    .line 387
    .line 388
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v0, " failed: "

    .line 395
    .line 396
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-static {p0}, Lmj;->σ(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    :goto_9
    return-void

    .line 410
    :pswitch_4
    check-cast v4, Ldh;

    .line 411
    .line 412
    check-cast v5, Lig;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 418
    .line 419
    instance-of p1, p0, Landroid/view/View;

    .line 420
    .line 421
    if-eqz p1, :cond_10

    .line 422
    .line 423
    move-object v3, p0

    .line 424
    check-cast v3, Landroid/view/View;

    .line 425
    .line 426
    :cond_10
    if-nez v3, :cond_11

    .line 427
    .line 428
    goto :goto_b

    .line 429
    :cond_11
    sget-object p0, Leh;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 430
    .line 431
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    :cond_12
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_14

    .line 443
    .line 444
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Landroid/view/View;

    .line 455
    .line 456
    if-eqz v0, :cond_13

    .line 457
    .line 458
    if-ne v0, v3, :cond_12

    .line 459
    .line 460
    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 461
    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_14
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 465
    .line 466
    invoke-direct {p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    iget-object p0, v4, Ldh;->γ:Ljava/lang/String;

    .line 473
    .line 474
    const-string p1, " create"

    .line 475
    .line 476
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-virtual {v5, v3, p0}, Lig;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    new-instance p0, Le9;

    .line 484
    .line 485
    invoke-direct {p0, v3, v5, v4, v2}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 489
    .line 490
    .line 491
    :goto_b
    return-void

    .line 492
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 496
    .line 497
    instance-of p1, p0, Landroid/view/View;

    .line 498
    .line 499
    if-eqz p1, :cond_15

    .line 500
    .line 501
    move-object v3, p0

    .line 502
    check-cast v3, Landroid/view/View;

    .line 503
    .line 504
    :cond_15
    if-nez v3, :cond_16

    .line 505
    .line 506
    goto :goto_c

    .line 507
    :cond_16
    check-cast v5, Le80;

    .line 508
    .line 509
    check-cast v4, Ljava/lang/String;

    .line 510
    .line 511
    const-string p0, " onCreateView"

    .line 512
    .line 513
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-interface {v5, v3, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    :goto_c
    return-void

    .line 521
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 525
    .line 526
    instance-of p1, p0, Landroid/view/View;

    .line 527
    .line 528
    if-eqz p1, :cond_17

    .line 529
    .line 530
    move-object v3, p0

    .line 531
    check-cast v3, Landroid/view/View;

    .line 532
    .line 533
    :cond_17
    if-nez v3, :cond_18

    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_18
    check-cast v5, Lig;

    .line 537
    .line 538
    check-cast v4, Ljava/lang/reflect/Method;

    .line 539
    .line 540
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    new-instance p1, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v0, "bottom misc flux register "

    .line 547
    .line 548
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    invoke-virtual {v5, v3, p0}, Lig;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    :goto_d
    return-void

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 11

    .line 1
    iget v0, p0, Lqg;->α:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lqg;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lqg;->β:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Lya2;

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    :try_start_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v0, p0

    .line 33
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    array-length v7, v0

    .line 39
    move v8, v3

    .line 40
    :goto_1
    if-ge v8, v7, :cond_2

    .line 41
    .line 42
    aget-object v9, v0, v8

    .line 43
    .line 44
    instance-of v10, v9, Ljava/lang/Enum;

    .line 45
    .line 46
    if-eqz v10, :cond_1

    .line 47
    .line 48
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_b

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, Ljava/lang/Enum;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const-string v7, "RECORD_COMPLETE"

    .line 83
    .line 84
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_4

    .line 89
    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    new-array p0, v3, [Ljava/lang/Object;

    .line 93
    .line 94
    :cond_5
    array-length v0, p0

    .line 95
    move v6, v3

    .line 96
    :goto_2
    if-ge v6, v0, :cond_8

    .line 97
    .line 98
    aget-object v7, p0, v6

    .line 99
    .line 100
    if-eqz v7, :cond_7

    .line 101
    .line 102
    sget-object v8, Lib2;->α:Lib2;

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-static {v8}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    if-eqz v8, :cond_6

    .line 113
    .line 114
    const/4 v8, 0x1

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    move v8, v3

    .line 117
    :goto_3
    if-eqz v8, :cond_7

    .line 118
    .line 119
    move-object v2, v7

    .line 120
    goto :goto_4

    .line 121
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    :goto_4
    if-nez v2, :cond_9

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_9
    sget-object p0, Lib2;->α:Lib2;

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lib2;->τ()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_a

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_a
    invoke-static {p1, v5, v2, v4}, Lib2;->λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :catchall_0
    move-exception p0

    .line 144
    new-instance v1, Leo1;

    .line 145
    .line 146
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :goto_5
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-eqz p0, :cond_b

    .line 154
    .line 155
    const-string p1, " \u56de\u8c03\u5904\u7406\u5931\u8d25\uff0c\u5df2\u4fdd\u7559\u5bbf\u4e3b\u539f\u53d1\u9001"

    .line 156
    .line 157
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const-string v0, "re4b6c41332ef57c6"

    .line 162
    .line 163
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_b
    :goto_6
    return-void

    .line 167
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {v3, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    instance-of v0, p1, Ljava/util/List;

    .line 180
    .line 181
    if-eqz v0, :cond_c

    .line 182
    .line 183
    move-object v2, p1

    .line 184
    check-cast v2, Ljava/util/List;

    .line 185
    .line 186
    :cond_c
    if-nez v2, :cond_d

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_d
    sget-object p1, Lc82;->α:Lc82;

    .line 190
    .line 191
    check-cast v5, Ljava/lang/ClassLoader;

    .line 192
    .line 193
    check-cast v4, Ljava/lang/reflect/Method;

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v1, "setter:"

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {v2, v5, p1}, Lc82;->δ(Ljava/util/List;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_e

    .line 218
    .line 219
    aput-object p1, p0, v3

    .line 220
    .line 221
    :cond_e
    :goto_7
    return-void

    .line 222
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v4, Ljava/lang/reflect/Method;

    .line 226
    .line 227
    check-cast v5, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    :try_start_1
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 230
    .line 231
    if-nez p0, :cond_f

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_f
    sget-object p1, Lyz0;->α:Lyz0;

    .line 235
    .line 236
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {p1, v4}, Lyz0;->α(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 241
    .line 242
    .line 243
    sget-object p1, Lyz0;->δ:Ljava/util/Map;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-interface {p1, p0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :catchall_1
    move-exception p0

    .line 253
    new-instance v1, Leo1;

    .line 254
    .line 255
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    :goto_8
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    if-eqz p0, :cond_10

    .line 263
    .line 264
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    const-string p1, "session pipeline callback failed: "

    .line 269
    .line 270
    const-string v0, "r1e0d2867edbb56e0"

    .line 271
    .line 272
    invoke-static {p1, p0, v0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :cond_10
    :goto_9
    return-void

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
