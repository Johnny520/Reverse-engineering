.class public final synthetic Lja0;
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
    iput p2, p0, Lja0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lja0;->ζ:Landroid/app/Activity;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lja0;->ε:I

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/16 v4, 0x11

    .line 7
    .line 8
    const/16 v5, 0xe

    .line 9
    .line 10
    const-string v6, "\u590d\u5236\u4e3b\u9875ID"

    .line 11
    .line 12
    const-string v7, "\u9009\u62e9\u4e0b\u8f7d"

    .line 13
    .line 14
    const-string v8, "\u6279\u91cf\u4e0b\u8f7d\u4e3a\u5185\u6d4b\u529f\u80fd\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u8005\u7533\u8bf7"

    .line 15
    .line 16
    const/4 v9, 0x3

    .line 17
    const/16 v10, 0x8

    .line 18
    .line 19
    const/4 v11, 0x5

    .line 20
    const/16 v12, 0x18

    .line 21
    .line 22
    const/4 v13, 0x2

    .line 23
    const/4 v14, 0x0

    .line 24
    const/4 v15, 0x1

    .line 25
    iget-object v2, v0, Lja0;->ζ:Landroid/app/Activity;

    .line 26
    .line 27
    sget-object v16, Ls62;->α:Ls62;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    const-string v0, "\u6b63\u5728\u6309\u6295\u5582\u8bbe\u7f6e\u5b9e\u65f6\u6821\u9a8c\u98df\u7269\u548c\u4ef7\u683c\u4e0a\u9650"

    .line 33
    .line 34
    invoke-static {v2, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lf9;

    .line 42
    .line 43
    const/16 v0, 0x1c

    .line 44
    .line 45
    invoke-direct {v1, v2, v0}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_0

    .line 62
    .line 63
    move-object v0, v2

    .line 64
    :cond_0
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    move-object/from16 v3, v16

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :goto_1
    new-instance v3, Leo1;

    .line 74
    .line 75
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v3, v1, Lf9;->ζ:Landroid/app/Activity;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    const-string v1, "rfac809154b3e7cbf"

    .line 87
    .line 88
    const-string v2, "\u624b\u52a8\u6295\u5582\u521d\u59cb\u5316\u914d\u7f6e\u5931\u8d25"

    .line 89
    .line 90
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :cond_2
    const-string v0, "\u6295\u5582\u8bbe\u7f6e\u4e0d\u53ef\u7528: "

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v1, Lq71;->α:Lq71;

    .line 114
    .line 115
    invoke-static {v3, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_3
    sget-object v0, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 124
    .line 125
    invoke-virtual {v0, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    sget-object v0, Lq71;->α:Lq71;

    .line 132
    .line 133
    const-string v0, "\u6295\u5582\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 134
    .line 135
    invoke-static {v3, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_3
    new-instance v3, Ljava/lang/Thread;

    .line 171
    .line 172
    new-instance v4, Le9;

    .line 173
    .line 174
    const/16 v5, 0x1b

    .line 175
    .line 176
    invoke-direct {v4, v0, v2, v1, v5}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    const-string v0, "rdecc9b45dc2fda"

    .line 180
    .line 181
    invoke-direct {v3, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v15}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 188
    .line 189
    .line 190
    :goto_4
    return-object v16

    .line 191
    :pswitch_0
    const-string v0, "\u6b63\u5728\u53ea\u8bfb\u83b7\u53d6\u5168\u90e8\u706b\u82b1\u4f1a\u8bdd\u7684\u4eb2\u5bc6\u5ea6\u4fe1\u606f"

    .line 192
    .line 193
    invoke-static {v2, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lue1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 201
    .line 202
    new-instance v0, Lg71;

    .line 203
    .line 204
    invoke-direct {v0, v2, v13}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object v1, Lue1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 211
    .line 212
    invoke-virtual {v1, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_6

    .line 217
    .line 218
    const-string v1, "\u4eb2\u5bc6\u5ea6\u8c03\u8bd5\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 219
    .line 220
    iget-object v0, v0, Lg71;->ζ:Landroid/app/Activity;

    .line 221
    .line 222
    invoke-static {v0, v1, v14}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 227
    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_6
    sget-object v1, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-eqz v1, :cond_7

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    if-eqz v1, :cond_7

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :goto_5
    new-instance v3, Ljava/lang/Thread;

    .line 258
    .line 259
    new-instance v4, Le9;

    .line 260
    .line 261
    const/16 v5, 0x19

    .line 262
    .line 263
    invoke-direct {v4, v1, v2, v0, v5}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 264
    .line 265
    .line 266
    const-string v0, "r4213f2249a89b8a0"

    .line 267
    .line 268
    invoke-direct {v3, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v15}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 275
    .line 276
    .line 277
    :goto_6
    return-object v16

    .line 278
    :pswitch_1
    const-string v0, "\u6b63\u5728\u83b7\u53d6\u5168\u90e8\u706b\u82b1\u4f1a\u8bdd\u7684\u98df\u7269\u5217\u8868"

    .line 279
    .line 280
    invoke-static {v2, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 285
    .line 286
    .line 287
    sget-object v0, Lif1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 288
    .line 289
    new-instance v0, Lf9;

    .line 290
    .line 291
    const/16 v1, 0x15

    .line 292
    .line 293
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    sget-object v1, Lif1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 300
    .line 301
    invoke-virtual {v1, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_8

    .line 306
    .line 307
    const-string v1, "\u98df\u7269\u5217\u8868\u8c03\u8bd5\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 308
    .line 309
    iget-object v0, v0, Lf9;->ζ:Landroid/app/Activity;

    .line 310
    .line 311
    invoke-static {v0, v1, v14}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_8
    sget-object v1, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    if-eqz v1, :cond_9

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    if-eqz v1, :cond_9

    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    :goto_7
    new-instance v3, Ljava/lang/Thread;

    .line 347
    .line 348
    new-instance v4, Le9;

    .line 349
    .line 350
    const/16 v5, 0x1a

    .line 351
    .line 352
    invoke-direct {v4, v1, v2, v0, v5}, Le9;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;I)V

    .line 353
    .line 354
    .line 355
    const-string v0, "r6af06f132d017cc5"

    .line 356
    .line 357
    invoke-direct {v3, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 361
    .line 362
    .line 363
    :goto_8
    return-object v16

    .line 364
    :pswitch_2
    invoke-static {}, Lx9;->ζ()Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_a

    .line 369
    .line 370
    const-string v0, "\u8425\u5730\u7ba1\u7406\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 371
    .line 372
    invoke-static {v2, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 377
    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    new-instance v0, Ln9;

    .line 384
    .line 385
    const/16 v1, 0x1d

    .line 386
    .line 387
    invoke-direct {v0, v2, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 391
    .line 392
    .line 393
    :goto_9
    return-object v16

    .line 394
    :pswitch_3
    sget-object v0, Lwg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    new-instance v0, Lhg1;

    .line 400
    .line 401
    invoke-direct {v0, v2, v15}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 405
    .line 406
    .line 407
    return-object v16

    .line 408
    :pswitch_4
    sget-object v0, Lq71;->α:Lq71;

    .line 409
    .line 410
    new-instance v0, Lf9;

    .line 411
    .line 412
    invoke-direct {v0, v2, v12}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 413
    .line 414
    .line 415
    const-string v1, "\u4e0b\u8f7d\u89c6\u9891"

    .line 416
    .line 417
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 418
    .line 419
    .line 420
    return-object v16

    .line 421
    :pswitch_5
    const-string v0, "\u6b63\u5728\u53ea\u8bfb\u62c9\u53d6\u706b\u661f\u4efb\u52a1\uff0c\u4e0d\u4f1a\u53d1\u9001\u6d88\u606f\u6216\u9886\u53d6\u5956\u52b1"

    .line 422
    .line 423
    invoke-static {v2, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 428
    .line 429
    .line 430
    sget-object v0, Lag1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 431
    .line 432
    new-instance v0, Lf9;

    .line 433
    .line 434
    const/16 v1, 0x9

    .line 435
    .line 436
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-static {}, Lx9;->η()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-nez v1, :cond_b

    .line 447
    .line 448
    const-string v1, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 449
    .line 450
    invoke-static {v1, v14}, Lag1;->α(Ljava/lang/String;I)Lzf1;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-virtual {v0, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_b
    sget-object v1, Lag1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 459
    .line 460
    invoke-virtual {v1, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-nez v1, :cond_c

    .line 465
    .line 466
    const-string v1, "\u706b\u661f\u4efb\u52a1\u8c03\u8bd5\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 467
    .line 468
    invoke-static {v1, v14}, Lag1;->α(Ljava/lang/String;I)Lzf1;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {v0, v1}, Lf9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_c
    sget-object v1, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    if-eqz v1, :cond_d

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    if-eqz v1, :cond_d

    .line 493
    .line 494
    goto :goto_a

    .line 495
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    :goto_a
    new-instance v3, Ljava/lang/Thread;

    .line 504
    .line 505
    new-instance v4, Le9;

    .line 506
    .line 507
    invoke-direct {v4, v1, v2, v0}, Le9;-><init>(Ljava/lang/ClassLoader;Landroid/app/Activity;Lf9;)V

    .line 508
    .line 509
    .line 510
    const-string v0, "r786394e9ad6027b0"

    .line 511
    .line 512
    invoke-direct {v3, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 516
    .line 517
    .line 518
    :goto_b
    return-object v16

    .line 519
    :pswitch_6
    sget-object v0, Lq71;->α:Lq71;

    .line 520
    .line 521
    new-instance v0, Lg71;

    .line 522
    .line 523
    invoke-direct {v0, v2, v11}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 524
    .line 525
    .line 526
    const-string v1, "\u590d\u5236\u94fe\u63a5"

    .line 527
    .line 528
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 529
    .line 530
    .line 531
    return-object v16

    .line 532
    :pswitch_7
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 533
    .line 534
    invoke-virtual {v0, v2, v13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 535
    .line 536
    .line 537
    return-object v16

    .line 538
    :pswitch_8
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 539
    .line 540
    invoke-virtual {v0, v2, v13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 541
    .line 542
    .line 543
    return-object v16

    .line 544
    :pswitch_9
    sget-object v0, Lq71;->α:Lq71;

    .line 545
    .line 546
    new-instance v0, Lf9;

    .line 547
    .line 548
    const/16 v1, 0xb

    .line 549
    .line 550
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 551
    .line 552
    .line 553
    const-string v1, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 554
    .line 555
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 556
    .line 557
    .line 558
    return-object v16

    .line 559
    :pswitch_a
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 560
    .line 561
    invoke-virtual {v0, v2, v15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 562
    .line 563
    .line 564
    return-object v16

    .line 565
    :pswitch_b
    sget-object v0, Lq71;->α:Lq71;

    .line 566
    .line 567
    new-instance v0, Lf9;

    .line 568
    .line 569
    invoke-direct {v0, v2, v10}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 570
    .line 571
    .line 572
    const-string v1, "\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 573
    .line 574
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 575
    .line 576
    .line 577
    return-object v16

    .line 578
    :pswitch_c
    sget-object v1, Lq71;->α:Lq71;

    .line 579
    .line 580
    invoke-static {}, Lx9;->ε()Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    iget-object v0, v0, Lja0;->ζ:Landroid/app/Activity;

    .line 585
    .line 586
    if-eqz v1, :cond_e

    .line 587
    .line 588
    sget-object v1, Lcj1;->α:Lcj1;

    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 594
    .line 595
    const-string v19, "\u8c03\u8bd5\u83b7\u53d6\u4e3b\u9875\u4f5c\u54c1"

    .line 596
    .line 597
    invoke-static/range {v19 .. v19}, Lcom/example/dyhelper/ui/а;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-static {v1}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v18

    .line 605
    new-instance v17, Lby0;

    .line 606
    .line 607
    const-string v20, "\u6b63\u5728\u8bc6\u522b\u4e3b\u9875\u7528\u6237..."

    .line 608
    .line 609
    const/16 v21, -0x1

    .line 610
    .line 611
    const/16 v23, 0x1

    .line 612
    .line 613
    move-object/from16 v22, v0

    .line 614
    .line 615
    invoke-direct/range {v17 .. v23}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V

    .line 616
    .line 617
    .line 618
    invoke-static/range {v17 .. v17}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 619
    .line 620
    .line 621
    sget-object v1, Lcj1;->γ:Ljava/util/concurrent/ExecutorService;

    .line 622
    .line 623
    new-instance v2, Lhg1;

    .line 624
    .line 625
    invoke-direct {v2, v0, v9}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 626
    .line 627
    .line 628
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 629
    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_e
    invoke-static {v0, v8, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 637
    .line 638
    .line 639
    :goto_c
    return-object v16

    .line 640
    :pswitch_d
    sget-object v1, Lq71;->α:Lq71;

    .line 641
    .line 642
    invoke-static {}, Lx9;->ε()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    iget-object v0, v0, Lja0;->ζ:Landroid/app/Activity;

    .line 647
    .line 648
    if-eqz v1, :cond_f

    .line 649
    .line 650
    sget-object v1, Lcj1;->α:Lcj1;

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 656
    .line 657
    const-string v19, "\u4e3b\u52a8\u83b7\u53d6\u4e3b\u9875\u4f5c\u54c1"

    .line 658
    .line 659
    invoke-static/range {v19 .. v19}, Lcom/example/dyhelper/ui/а;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-static {v1}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v18

    .line 667
    new-instance v17, Lby0;

    .line 668
    .line 669
    const-string v20, "\u6b63\u5728\u8bc6\u522b\u4e3b\u9875\u7528\u6237..."

    .line 670
    .line 671
    const/16 v21, -0x1

    .line 672
    .line 673
    const/16 v23, 0x1

    .line 674
    .line 675
    move-object/from16 v22, v0

    .line 676
    .line 677
    invoke-direct/range {v17 .. v23}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V

    .line 678
    .line 679
    .line 680
    invoke-static/range {v17 .. v17}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 681
    .line 682
    .line 683
    sget-object v1, Lcj1;->γ:Ljava/util/concurrent/ExecutorService;

    .line 684
    .line 685
    new-instance v2, Lhg1;

    .line 686
    .line 687
    invoke-direct {v2, v0, v13}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 688
    .line 689
    .line 690
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 691
    .line 692
    .line 693
    goto :goto_d

    .line 694
    :cond_f
    invoke-static {v0, v8, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 699
    .line 700
    .line 701
    :goto_d
    return-object v16

    .line 702
    :pswitch_e
    sget-object v0, Lq71;->α:Lq71;

    .line 703
    .line 704
    new-instance v0, Lf9;

    .line 705
    .line 706
    const/16 v1, 0x14

    .line 707
    .line 708
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 709
    .line 710
    .line 711
    invoke-static {v2, v7, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 712
    .line 713
    .line 714
    return-object v16

    .line 715
    :pswitch_f
    sget-object v0, Lq71;->α:Lq71;

    .line 716
    .line 717
    new-instance v0, Lg71;

    .line 718
    .line 719
    invoke-direct {v0, v2, v14}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 720
    .line 721
    .line 722
    const-string v1, "\u590d\u5236\u6587\u6848"

    .line 723
    .line 724
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 725
    .line 726
    .line 727
    return-object v16

    .line 728
    :pswitch_10
    sget-object v0, Lq71;->α:Lq71;

    .line 729
    .line 730
    new-instance v0, Lf9;

    .line 731
    .line 732
    invoke-direct {v0, v2, v5}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 733
    .line 734
    .line 735
    invoke-static {v2, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 736
    .line 737
    .line 738
    return-object v16

    .line 739
    :pswitch_11
    sget-object v0, Lq71;->α:Lq71;

    .line 740
    .line 741
    new-instance v0, Lf9;

    .line 742
    .line 743
    const/4 v1, 0x6

    .line 744
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 745
    .line 746
    .line 747
    invoke-static {v2, v6, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 748
    .line 749
    .line 750
    return-object v16

    .line 751
    :pswitch_12
    sget-object v0, Lq71;->α:Lq71;

    .line 752
    .line 753
    new-instance v0, Lf9;

    .line 754
    .line 755
    const/16 v1, 0xd

    .line 756
    .line 757
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 758
    .line 759
    .line 760
    const-string v1, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 761
    .line 762
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 763
    .line 764
    .line 765
    return-object v16

    .line 766
    :pswitch_13
    sget-object v0, Lq71;->α:Lq71;

    .line 767
    .line 768
    new-instance v0, Lg71;

    .line 769
    .line 770
    const/4 v1, 0x4

    .line 771
    invoke-direct {v0, v2, v1}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 772
    .line 773
    .line 774
    const-string v1, "\u9884\u89c8\u56fe\u7247"

    .line 775
    .line 776
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 777
    .line 778
    .line 779
    return-object v16

    .line 780
    :pswitch_14
    sget-object v0, Lq71;->α:Lq71;

    .line 781
    .line 782
    new-instance v0, Lg71;

    .line 783
    .line 784
    invoke-direct {v0, v2, v9}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 785
    .line 786
    .line 787
    const-string v1, "\u590d\u5236\u4e0b\u8f7d\u76f4\u94fe"

    .line 788
    .line 789
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 790
    .line 791
    .line 792
    return-object v16

    .line 793
    :pswitch_15
    sget-object v0, Lq71;->α:Lq71;

    .line 794
    .line 795
    new-instance v0, Lf9;

    .line 796
    .line 797
    const/16 v1, 0x13

    .line 798
    .line 799
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 800
    .line 801
    .line 802
    const-string v1, "\u4e0b\u8f7d\u539f\u753b\u8d28"

    .line 803
    .line 804
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 805
    .line 806
    .line 807
    return-object v16

    .line 808
    :pswitch_16
    sget-object v0, Lq71;->α:Lq71;

    .line 809
    .line 810
    new-instance v0, Lf9;

    .line 811
    .line 812
    invoke-direct {v0, v2, v4}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 813
    .line 814
    .line 815
    invoke-static {v2, v7, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 816
    .line 817
    .line 818
    return-object v16

    .line 819
    :pswitch_17
    sget-object v0, Lq71;->α:Lq71;

    .line 820
    .line 821
    new-instance v0, Lf9;

    .line 822
    .line 823
    const/16 v1, 0x10

    .line 824
    .line 825
    invoke-direct {v0, v2, v1}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 826
    .line 827
    .line 828
    const-string v1, "\u4e0b\u8f7d\u97f3\u9891"

    .line 829
    .line 830
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 831
    .line 832
    .line 833
    return-object v16

    .line 834
    :pswitch_18
    sget-object v0, Lq71;->α:Lq71;

    .line 835
    .line 836
    invoke-static {v2}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-static {v2, v15}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-static {v2, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 845
    .line 846
    .line 847
    move-result v6

    .line 848
    invoke-static {v2, v10}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 849
    .line 850
    .line 851
    move-result v7

    .line 852
    invoke-static {v2, v12}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    invoke-virtual {v1, v6, v7, v8, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 857
    .line 858
    .line 859
    new-instance v6, Landroid/widget/TextView;

    .line 860
    .line 861
    invoke-direct {v6, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 862
    .line 863
    .line 864
    const/high16 v7, 0x41600000    # 14.0f

    .line 865
    .line 866
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v6, v3, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 870
    .line 871
    .line 872
    iget-object v7, v0, Lxx;->λ:Ljava/lang/String;

    .line 873
    .line 874
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 882
    .line 883
    .line 884
    const/16 v4, 0xc

    .line 885
    .line 886
    invoke-static {v2, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 887
    .line 888
    .line 889
    move-result v8

    .line 890
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 891
    .line 892
    .line 893
    move-result v9

    .line 894
    invoke-static {v2, v4}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    invoke-static {v2, v11}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 899
    .line 900
    .line 901
    move-result v10

    .line 902
    invoke-virtual {v6, v8, v9, v4, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 903
    .line 904
    .line 905
    iget-object v4, v0, Lxx;->μ:Ljava/lang/String;

    .line 906
    .line 907
    const/16 v8, 0x63

    .line 908
    .line 909
    invoke-static {v8, v2, v4}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    invoke-virtual {v6, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 917
    .line 918
    .line 919
    sget-object v4, Lx01;->α:Lx01;

    .line 920
    .line 921
    invoke-virtual {v4, v2}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    const v8, 0x7f0c006b

    .line 926
    .line 927
    .line 928
    invoke-virtual {v4, v8, v1, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 929
    .line 930
    .line 931
    move-result-object v4

    .line 932
    const v8, 0x7f090289

    .line 933
    .line 934
    .line 935
    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 936
    .line 937
    .line 938
    move-result-object v8

    .line 939
    check-cast v8, Landroid/widget/SeekBar;

    .line 940
    .line 941
    if-nez v8, :cond_10

    .line 942
    .line 943
    goto/16 :goto_10

    .line 944
    .line 945
    :cond_10
    :try_start_1
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 946
    .line 947
    .line 948
    move-result v9

    .line 949
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 950
    .line 951
    .line 952
    move-result-object v9

    .line 953
    invoke-virtual {v8, v9}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 954
    .line 955
    .line 956
    iget-object v9, v0, Lxx;->δ:Ljava/lang/String;

    .line 957
    .line 958
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 959
    .line 960
    .line 961
    move-result v9

    .line 962
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 963
    .line 964
    .line 965
    move-result-object v9

    .line 966
    invoke-virtual {v8, v9}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v8, v3}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v8, v15}, Landroid/view/View;->setHapticFeedbackEnabled(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 973
    .line 974
    .line 975
    :catchall_1
    sget-object v9, Lq71;->β:Ljava/util/List;

    .line 976
    .line 977
    invoke-static {v9}, Lyh;->Λ(Ljava/util/List;)I

    .line 978
    .line 979
    .line 980
    move-result v10

    .line 981
    invoke-virtual {v8, v10}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 982
    .line 983
    .line 984
    const-string v10, "global_video_speed"

    .line 985
    .line 986
    const/high16 v11, 0x3f800000    # 1.0f

    .line 987
    .line 988
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 989
    .line 990
    .line 991
    move-result-object v12

    .line 992
    invoke-interface {v12, v10, v11}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 993
    .line 994
    .line 995
    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 996
    :catchall_2
    invoke-static {v11}, Lq71;->Γ(F)F

    .line 997
    .line 998
    .line 999
    move-result v10

    .line 1000
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v10

    .line 1004
    invoke-interface {v9, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 1005
    .line 1006
    .line 1007
    move-result v10

    .line 1008
    if-gez v10, :cond_11

    .line 1009
    .line 1010
    goto :goto_e

    .line 1011
    :cond_11
    move v14, v10

    .line 1012
    :goto_e
    invoke-virtual {v8, v14}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1013
    .line 1014
    .line 1015
    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v9

    .line 1019
    check-cast v9, Ljava/lang/Number;

    .line 1020
    .line 1021
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 1022
    .line 1023
    .line 1024
    move-result v9

    .line 1025
    invoke-static {v9}, Lq71;->τ(F)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v9

    .line 1029
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    .line 1037
    const-string v9, "x"

    .line 1038
    .line 1039
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v9

    .line 1046
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1047
    .line 1048
    .line 1049
    new-instance v9, Ltk;

    .line 1050
    .line 1051
    invoke-direct {v9, v15, v6}, Ltk;-><init>(ILjava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v8, v9}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1055
    .line 1056
    .line 1057
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 1058
    .line 1059
    const/16 v8, 0x30

    .line 1060
    .line 1061
    invoke-static {v2, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1062
    .line 1063
    .line 1064
    move-result v8

    .line 1065
    const/4 v9, -0x1

    .line 1066
    invoke-direct {v6, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {v2, v13}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 1070
    .line 1071
    .line 1072
    move-result v8

    .line 1073
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1074
    .line 1075
    invoke-virtual {v1, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1076
    .line 1077
    .line 1078
    iget-boolean v4, v0, Lxx;->α:Z

    .line 1079
    .line 1080
    if-eqz v4, :cond_12

    .line 1081
    .line 1082
    const v4, 0x1030226

    .line 1083
    .line 1084
    .line 1085
    goto :goto_f

    .line 1086
    :cond_12
    const v4, 0x103023a

    .line 1087
    .line 1088
    .line 1089
    :goto_f
    new-instance v6, Landroid/app/AlertDialog$Builder;

    .line 1090
    .line 1091
    invoke-direct {v6, v2, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 1092
    .line 1093
    .line 1094
    const-string v4, "\u5168\u5c40\u89c6\u9891\u500d\u901f"

    .line 1095
    .line 1096
    invoke-virtual {v6, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    invoke-virtual {v4, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    const-string v4, "\u5b8c\u6210"

    .line 1105
    .line 1106
    invoke-virtual {v1, v4, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v1

    .line 1110
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    if-eqz v4, :cond_13

    .line 1122
    .line 1123
    iget-object v6, v0, Lxx;->γ:Ljava/lang/String;

    .line 1124
    .line 1125
    invoke-static {v5, v2, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v5

    .line 1129
    invoke-virtual {v4, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1130
    .line 1131
    .line 1132
    const v5, 0x3ee66666    # 0.45f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v4, v5}, Landroid/view/Window;->setDimAmount(F)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v4, v13}, Landroid/view/Window;->addFlags(I)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v5

    .line 1145
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1150
    .line 1151
    int-to-float v5, v5

    .line 1152
    const v6, 0x3f5c28f6    # 0.86f

    .line 1153
    .line 1154
    .line 1155
    mul-float/2addr v5, v6

    .line 1156
    float-to-int v5, v5

    .line 1157
    const/4 v6, -0x2

    .line 1158
    invoke-virtual {v4, v5, v6}, Landroid/view/Window;->setLayout(II)V

    .line 1159
    .line 1160
    .line 1161
    :cond_13
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    const-string v4, "id"

    .line 1166
    .line 1167
    const-string v5, "android"

    .line 1168
    .line 1169
    const-string v6, "alertTitle"

    .line 1170
    .line 1171
    invoke-virtual {v2, v6, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    if-eqz v2, :cond_14

    .line 1176
    .line 1177
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    check-cast v2, Landroid/widget/TextView;

    .line 1182
    .line 1183
    if-eqz v2, :cond_14

    .line 1184
    .line 1185
    iget-object v0, v0, Lxx;->ζ:Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-static {v0, v2, v3, v15}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 1188
    .line 1189
    .line 1190
    :cond_14
    invoke-virtual {v1, v9}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    if-eqz v0, :cond_15

    .line 1195
    .line 1196
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1197
    .line 1198
    .line 1199
    move-result v1

    .line 1200
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1201
    .line 1202
    .line 1203
    :cond_15
    :goto_10
    return-object v16

    .line 1204
    :pswitch_19
    sget-object v0, Lq71;->α:Lq71;

    .line 1205
    .line 1206
    new-instance v0, Lf9;

    .line 1207
    .line 1208
    const/16 v4, 0xc

    .line 1209
    .line 1210
    invoke-direct {v0, v2, v4}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 1211
    .line 1212
    .line 1213
    const-string v1, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 1214
    .line 1215
    invoke-static {v2, v1, v0}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 1216
    .line 1217
    .line 1218
    return-object v16

    .line 1219
    :pswitch_1a
    sget-object v0, Lq71;->α:Lq71;

    .line 1220
    .line 1221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    new-instance v0, Ln9;

    .line 1225
    .line 1226
    const/16 v1, 0x17

    .line 1227
    .line 1228
    invoke-direct {v0, v2, v1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1232
    .line 1233
    .line 1234
    return-object v16

    .line 1235
    :pswitch_1b
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    if-eqz v0, :cond_16

    .line 1240
    .line 1241
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    goto :goto_11

    .line 1246
    :cond_16
    move-object v0, v3

    .line 1247
    :goto_11
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 1248
    .line 1249
    if-eqz v1, :cond_17

    .line 1250
    .line 1251
    check-cast v0, Landroid/view/ViewGroup;

    .line 1252
    .line 1253
    goto :goto_12

    .line 1254
    :cond_17
    move-object v0, v3

    .line 1255
    :goto_12
    if-eqz v0, :cond_1a

    .line 1256
    .line 1257
    const-string v1, "dyhelper_gesture_position_preview"

    .line 1258
    .line 1259
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    if-nez v0, :cond_18

    .line 1264
    .line 1265
    goto :goto_13

    .line 1266
    :cond_18
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v1

    .line 1270
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 1271
    .line 1272
    if-eqz v2, :cond_19

    .line 1273
    .line 1274
    move-object v3, v1

    .line 1275
    check-cast v3, Landroid/view/ViewGroup;

    .line 1276
    .line 1277
    :cond_19
    if-eqz v3, :cond_1a

    .line 1278
    .line 1279
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1280
    .line 1281
    .line 1282
    :cond_1a
    :goto_13
    return-object v16

    .line 1283
    :pswitch_1c
    :try_start_3
    invoke-static {v2}, Lcom/example/dyhelper/ui/ο;->γ(Landroid/app/Activity;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1284
    .line 1285
    .line 1286
    goto :goto_14

    .line 1287
    :catchall_3
    move-exception v0

    .line 1288
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    const-string v3, "\u521b\u5efa\u624b\u52bf\u4f4d\u7f6e\u9884\u89c8\u5931\u8d25: "

    .line 1295
    .line 1296
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v1

    .line 1306
    const-string v2, "GesturePositionPreview"

    .line 1307
    .line 1308
    invoke-static {v2, v1, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1309
    .line 1310
    .line 1311
    :goto_14
    return-object v16

    .line 1312
    nop

    .line 1313
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
