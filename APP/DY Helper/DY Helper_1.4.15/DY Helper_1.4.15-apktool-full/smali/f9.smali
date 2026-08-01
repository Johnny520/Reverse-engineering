.class public final synthetic Lf9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf9;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lf9;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lf9;->ε:I

    .line 2
    .line 3
    const-string v1, "\u5f53\u524d\u4f5c\u54c1\u4f5c\u8005\u4fe1\u606f\u4e0d\u8db3"

    .line 4
    .line 5
    const-string v2, "\u5df2\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 6
    .line 7
    const/16 v3, 0x14

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    sget-object v7, Ls62;->α:Ls62;

    .line 13
    .line 14
    iget-object p0, p0, Lf9;->ζ:Landroid/app/Activity;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Lf8;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lq71;->α:Lq71;

    .line 25
    .line 26
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 27
    .line 28
    .line 29
    return-object v7

    .line 30
    :pswitch_0
    check-cast p1, Lkf1;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v0, Lq71;->α:Lq71;

    .line 36
    .line 37
    iget-object v0, p1, Lkf1;->η:Ljava/lang/String;

    .line 38
    .line 39
    iget v1, p1, Lkf1;->β:I

    .line 40
    .line 41
    iget p1, p1, Lkf1;->ζ:I

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    if-lt v1, v6, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v5, v6

    .line 49
    :goto_0
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :pswitch_1
    check-cast p1, Lf8;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v0, Lq71;->α:Lq71;

    .line 63
    .line 64
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 65
    .line 66
    .line 67
    return-object v7

    .line 68
    :pswitch_2
    check-cast p1, Lyj0;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v0, p1, Lyj0;->β:Ljava/lang/String;

    .line 74
    .line 75
    iget-boolean p1, p1, Lyj0;->α:Z

    .line 76
    .line 77
    xor-int/2addr p1, v6

    .line 78
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 83
    .line 84
    .line 85
    return-object v7

    .line 86
    :pswitch_3
    check-cast p1, Lf8;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v0, Lqy0;->α:Lqy0;

    .line 92
    .line 93
    invoke-static {p1, p0}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 94
    .line 95
    .line 96
    return-object v7

    .line 97
    :pswitch_4
    check-cast p1, Lf8;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v0, Lq71;->α:Lq71;

    .line 103
    .line 104
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 105
    .line 106
    .line 107
    return-object v7

    .line 108
    :pswitch_5
    check-cast p1, Lf8;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lqy0;->α:Lqy0;

    .line 114
    .line 115
    invoke-static {p1, p0}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 116
    .line 117
    .line 118
    return-object v7

    .line 119
    :pswitch_6
    check-cast p1, Lqe1;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    sget-object v0, Lq71;->α:Lq71;

    .line 125
    .line 126
    iget-object v0, p1, Lqe1;->ζ:Ljava/lang/String;

    .line 127
    .line 128
    iget v1, p1, Lqe1;->β:I

    .line 129
    .line 130
    iget p1, p1, Lqe1;->ε:I

    .line 131
    .line 132
    if-nez p1, :cond_1

    .line 133
    .line 134
    if-lt v1, v6, :cond_1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move v5, v6

    .line 138
    :goto_1
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 143
    .line 144
    .line 145
    return-object v7

    .line 146
    :pswitch_7
    check-cast p1, Lhf1;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v0, p1, Lhf1;->δ:Ljava/lang/String;

    .line 152
    .line 153
    iget p1, p1, Lhf1;->γ:I

    .line 154
    .line 155
    if-nez p1, :cond_2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    move v5, v6

    .line 159
    :goto_2
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 164
    .line 165
    .line 166
    return-object v7

    .line 167
    :pswitch_8
    check-cast p1, Lf8;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lqy0;->α:Lqy0;

    .line 173
    .line 174
    invoke-static {p1, p0}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 175
    .line 176
    .line 177
    return-object v7

    .line 178
    :pswitch_9
    check-cast p1, Lf8;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object v0, Lq71;->α:Lq71;

    .line 184
    .line 185
    invoke-virtual {p1}, Lf8;->ν()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget-object v1, p1, Lf8;->η:Ljava/lang/String;

    .line 190
    .line 191
    if-nez v0, :cond_3

    .line 192
    .line 193
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_3
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v1}, Lq71;->η(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1}, Lq71;->π(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const-string v2, "https://www.douyin.com/video/"

    .line 210
    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {v0, v1}, Lq71;->η(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_4
    iget-object v1, p1, Lf8;->θ:Ljava/lang/String;

    .line 221
    .line 222
    if-eqz v1, :cond_6

    .line 223
    .line 224
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_6

    .line 233
    .line 234
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-nez v6, :cond_5

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_5
    move-object v1, v4

    .line 242
    :goto_3
    if-eqz v1, :cond_6

    .line 243
    .line 244
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v0, v1}, Lq71;->η(Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :cond_6
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_7

    .line 260
    .line 261
    const-string v0, "\u672a\u8bc6\u522b\u5230\u5206\u4eab\u94fe\u63a5\uff0c\u6539\u7528\u666e\u901a\u89c6\u9891\u4e0b\u8f7d"

    .line 262
    .line 263
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 268
    .line 269
    .line 270
    sget-object v0, Lqy0;->α:Lqy0;

    .line 271
    .line 272
    invoke-virtual {v0, p0, p1, v4}, Lqy0;->Π(Landroid/app/Activity;Lf8;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    const-string v1, "\u6b63\u5728\u89e3\u6790\u539f\u753b\u8d28..."

    .line 277
    .line 278
    invoke-static {p0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 283
    .line 284
    .line 285
    new-instance v1, Ljava/lang/Thread;

    .line 286
    .line 287
    new-instance v2, Le9;

    .line 288
    .line 289
    invoke-direct {v2, p0, v0, p1, v3}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 296
    .line 297
    .line 298
    :goto_4
    return-object v7

    .line 299
    :pswitch_a
    check-cast p1, Lf8;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 305
    .line 306
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    if-nez v1, :cond_8

    .line 311
    .line 312
    move-object v1, p0

    .line 313
    :cond_8
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 314
    .line 315
    .line 316
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 317
    .line 318
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    if-nez p1, :cond_9

    .line 323
    .line 324
    const-string p1, "\u672a\u8bc6\u522b\u5230\u5f53\u524d\u4f5c\u54c1\uff0c\u6682\u65f6\u65e0\u6cd5\u6dfb\u52a0\u4e66\u7b7e"

    .line 325
    .line 326
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 331
    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_9
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_a

    .line 343
    .line 344
    const-string p1, "\u5f53\u524d\u4f5c\u54c1\u5df2\u6dfb\u52a0\u4e66\u7b7e"

    .line 345
    .line 346
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_a
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)Z

    .line 355
    .line 356
    .line 357
    invoke-static {p0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 362
    .line 363
    .line 364
    :goto_5
    return-object v7

    .line 365
    :pswitch_b
    check-cast p1, Lf8;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    sget-object v0, Lqy0;->α:Lqy0;

    .line 371
    .line 372
    invoke-static {p1, p0}, Lqy0;->Б(Lf8;Landroid/app/Activity;)V

    .line 373
    .line 374
    .line 375
    return-object v7

    .line 376
    :pswitch_c
    check-cast p1, Lf8;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    sget-object v0, Lqy0;->α:Lqy0;

    .line 382
    .line 383
    invoke-virtual {v0, p1, p0}, Lqy0;->Γ(Lf8;Landroid/app/Activity;)V

    .line 384
    .line 385
    .line 386
    return-object v7

    .line 387
    :pswitch_d
    check-cast p1, Lmg1;

    .line 388
    .line 389
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object p1, p1, Lmg1;->θ:Ljava/lang/String;

    .line 393
    .line 394
    invoke-static {p0, p1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 399
    .line 400
    .line 401
    return-object v7

    .line 402
    :pswitch_e
    check-cast p1, Lf8;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    sget-object v0, Lq71;->α:Lq71;

    .line 408
    .line 409
    invoke-static {p1, p0}, Lq71;->ι(Lf8;Landroid/app/Activity;)V

    .line 410
    .line 411
    .line 412
    return-object v7

    .line 413
    :pswitch_f
    check-cast p1, Lf8;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    sget-object v0, Lq71;->α:Lq71;

    .line 419
    .line 420
    invoke-static {p0, v6}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {p0, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    const/16 v2, 0xc

    .line 429
    .line 430
    invoke-static {p0, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-static {p0, v3}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    const/4 v8, 0x2

    .line 439
    invoke-static {p0, v8}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    invoke-virtual {v0, v1, v2, v3, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 444
    .line 445
    .line 446
    new-instance v1, Landroid/widget/TextView;

    .line 447
    .line 448
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 449
    .line 450
    .line 451
    const-string v2, "\u8f93\u5165 UID \u6216 SecUID\uff0c\u4efb\u586b\u4e00\u4e2a\u5373\u53ef\u6253\u5f00\u4e3b\u9875"

    .line 452
    .line 453
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    .line 455
    .line 456
    const/high16 v2, 0x41400000    # 12.0f

    .line 457
    .line 458
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 459
    .line 460
    .line 461
    const v2, -0x777778

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 465
    .line 466
    .line 467
    const/16 v2, 0xa

    .line 468
    .line 469
    invoke-static {p0, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    invoke-virtual {v1, v5, v5, v5, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 474
    .line 475
    .line 476
    new-instance v2, Landroid/widget/EditText;

    .line 477
    .line 478
    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 479
    .line 480
    .line 481
    const-string v3, "UID"

    .line 482
    .line 483
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 490
    .line 491
    .line 492
    iget-object v3, p1, Lf8;->ι:Ljava/lang/String;

    .line 493
    .line 494
    if-eqz v3, :cond_b

    .line 495
    .line 496
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    goto :goto_6

    .line 505
    :cond_b
    move-object v3, v4

    .line 506
    :goto_6
    const-string v5, ""

    .line 507
    .line 508
    if-nez v3, :cond_c

    .line 509
    .line 510
    move-object v3, v5

    .line 511
    :cond_c
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2}, Landroid/widget/EditText;->selectAll()V

    .line 515
    .line 516
    .line 517
    new-instance v3, Landroid/widget/EditText;

    .line 518
    .line 519
    invoke-direct {v3, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 520
    .line 521
    .line 522
    const-string v9, "SecUID"

    .line 523
    .line 524
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 531
    .line 532
    .line 533
    iget-object v6, p1, Lf8;->κ:Ljava/lang/String;

    .line 534
    .line 535
    if-eqz v6, :cond_d

    .line 536
    .line 537
    invoke-static {v6}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    goto :goto_7

    .line 546
    :cond_d
    move-object v6, v4

    .line 547
    :goto_7
    if-nez v6, :cond_e

    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_e
    move-object v5, v6

    .line 551
    :goto_8
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 561
    .line 562
    .line 563
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 564
    .line 565
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 566
    .line 567
    .line 568
    const-string v5, "\u6253\u5f00\u4e2a\u4eba\u4e3b\u9875"

    .line 569
    .line 570
    invoke-virtual {v1, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    new-instance v1, Ll90;

    .line 579
    .line 580
    invoke-direct {v1, v2, v3, p0, p1}, Ll90;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Activity;Lf8;)V

    .line 581
    .line 582
    .line 583
    const-string v2, "\u6253\u5f00"

    .line 584
    .line 585
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    new-instance v1, Lbc0;

    .line 590
    .line 591
    invoke-direct {v1, p1, v8, p0}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    const-string p0, "\u590d\u5236\u5f53\u524dID"

    .line 595
    .line 596
    invoke-virtual {v0, p0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    const-string p1, "\u53d6\u6d88"

    .line 601
    .line 602
    invoke-virtual {p0, p1, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 607
    .line 608
    .line 609
    return-object v7

    .line 610
    :pswitch_10
    check-cast p1, Lf8;

    .line 611
    .line 612
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    sget-object v0, Lq71;->α:Lq71;

    .line 616
    .line 617
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 618
    .line 619
    .line 620
    return-object v7

    .line 621
    :pswitch_11
    check-cast p1, Lf8;

    .line 622
    .line 623
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 627
    .line 628
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    if-nez v1, :cond_f

    .line 633
    .line 634
    move-object v1, p0

    .line 635
    :cond_f
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 636
    .line 637
    .line 638
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 639
    .line 640
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    if-nez p1, :cond_10

    .line 645
    .line 646
    const-string p1, "\u672a\u8bc6\u522b\u5230\u5f53\u524d\u4f5c\u54c1\uff0c\u6682\u65f6\u65e0\u6cd5\u6536\u85cf"

    .line 647
    .line 648
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 649
    .line 650
    .line 651
    move-result-object p0

    .line 652
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 653
    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_10
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_11

    .line 665
    .line 666
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 671
    .line 672
    .line 673
    const-string p1, "\u5df2\u53d6\u6d88\u4f5c\u54c1\u4e66\u7b7e"

    .line 674
    .line 675
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 680
    .line 681
    .line 682
    goto :goto_9

    .line 683
    :cond_11
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)Z

    .line 684
    .line 685
    .line 686
    invoke-static {p0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 691
    .line 692
    .line 693
    :goto_9
    return-object v7

    .line 694
    :pswitch_12
    check-cast p1, Lf8;

    .line 695
    .line 696
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 700
    .line 701
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    if-nez p1, :cond_12

    .line 706
    .line 707
    invoke-static {p0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 712
    .line 713
    .line 714
    goto :goto_a

    .line 715
    :cond_12
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 716
    .line 717
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    if-nez v1, :cond_13

    .line 722
    .line 723
    move-object v1, p0

    .line 724
    :cond_13
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->isBookmarked(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-eqz v0, :cond_14

    .line 732
    .line 733
    const-string p1, "\u8be5\u4f5c\u8005\u4e3b\u9875\u5df2\u6dfb\u52a0\u4e66\u7b7e"

    .line 734
    .line 735
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 736
    .line 737
    .line 738
    move-result-object p0

    .line 739
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 740
    .line 741
    .line 742
    goto :goto_a

    .line 743
    :cond_14
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 744
    .line 745
    invoke-virtual {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->toggleProfileBookmark(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 746
    .line 747
    .line 748
    :goto_a
    return-object v7

    .line 749
    :pswitch_13
    check-cast p1, Lzf1;

    .line 750
    .line 751
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    iget-object v0, p1, Lzf1;->θ:Ljava/lang/String;

    .line 755
    .line 756
    iget p1, p1, Lzf1;->η:I

    .line 757
    .line 758
    if-nez p1, :cond_15

    .line 759
    .line 760
    goto :goto_b

    .line 761
    :cond_15
    move v5, v6

    .line 762
    :goto_b
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 763
    .line 764
    .line 765
    move-result-object p0

    .line 766
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 767
    .line 768
    .line 769
    return-object v7

    .line 770
    :pswitch_14
    check-cast p1, Lf8;

    .line 771
    .line 772
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 776
    .line 777
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;->fromAwemeInfo(Lf8;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    if-nez p1, :cond_16

    .line 782
    .line 783
    invoke-static {p0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 784
    .line 785
    .line 786
    move-result-object p0

    .line 787
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 788
    .line 789
    .line 790
    goto :goto_c

    .line 791
    :cond_16
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 792
    .line 793
    invoke-virtual {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->toggleProfileBookmark(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 794
    .line 795
    .line 796
    :goto_c
    return-object v7

    .line 797
    :pswitch_15
    check-cast p1, Lf8;

    .line 798
    .line 799
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    sget-object v0, Lq71;->α:Lq71;

    .line 803
    .line 804
    invoke-static {p1, p0}, Lq71;->ν(Lf8;Landroid/app/Activity;)V

    .line 805
    .line 806
    .line 807
    return-object v7

    .line 808
    :pswitch_16
    check-cast p1, Lf8;

    .line 809
    .line 810
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    sget-object v0, Lq71;->α:Lq71;

    .line 814
    .line 815
    invoke-static {p1, p0}, Lq71;->ι(Lf8;Landroid/app/Activity;)V

    .line 816
    .line 817
    .line 818
    return-object v7

    .line 819
    :pswitch_17
    check-cast p1, Lmg1;

    .line 820
    .line 821
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    sget-object v0, Lq71;->α:Lq71;

    .line 825
    .line 826
    iget-object v0, p1, Lmg1;->θ:Ljava/lang/String;

    .line 827
    .line 828
    iget v1, p1, Lmg1;->δ:I

    .line 829
    .line 830
    iget p1, p1, Lmg1;->ζ:I

    .line 831
    .line 832
    if-nez p1, :cond_17

    .line 833
    .line 834
    if-lt v1, v6, :cond_17

    .line 835
    .line 836
    goto :goto_d

    .line 837
    :cond_17
    move v5, v6

    .line 838
    :goto_d
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 839
    .line 840
    .line 841
    move-result-object p0

    .line 842
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 843
    .line 844
    .line 845
    return-object v7

    .line 846
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 847
    .line 848
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    sget-object v0, Lq71;->α:Lq71;

    .line 852
    .line 853
    invoke-static {p0, p1}, Lq71;->ο(Landroid/app/Activity;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    return-object v7

    .line 857
    :pswitch_19
    check-cast p1, Ljava/lang/Integer;

    .line 858
    .line 859
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 860
    .line 861
    .line 862
    move-result p1

    .line 863
    int-to-float p1, p1

    .line 864
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 865
    .line 866
    .line 867
    move-result-object p0

    .line 868
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 869
    .line 870
    .line 871
    move-result-object p0

    .line 872
    invoke-static {v6, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 873
    .line 874
    .line 875
    move-result p0

    .line 876
    :goto_e
    float-to-int p0, p0

    .line 877
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object p0

    .line 881
    return-object p0

    .line 882
    :pswitch_1a
    check-cast p1, Lyj0;

    .line 883
    .line 884
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    new-instance v0, Lw1;

    .line 888
    .line 889
    const/16 v1, 0x10

    .line 890
    .line 891
    invoke-direct {v0, p0, v1, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 895
    .line 896
    .line 897
    return-object v7

    .line 898
    :pswitch_1b
    check-cast p1, Ljava/lang/Integer;

    .line 899
    .line 900
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 901
    .line 902
    .line 903
    move-result p1

    .line 904
    int-to-float p1, p1

    .line 905
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 906
    .line 907
    .line 908
    move-result-object p0

    .line 909
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 910
    .line 911
    .line 912
    move-result-object p0

    .line 913
    invoke-static {v6, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 914
    .line 915
    .line 916
    move-result p0

    .line 917
    goto :goto_e

    .line 918
    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    .line 919
    .line 920
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 921
    .line 922
    .line 923
    move-result p1

    .line 924
    int-to-float p1, p1

    .line 925
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 926
    .line 927
    .line 928
    move-result-object p0

    .line 929
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 930
    .line 931
    .line 932
    move-result-object p0

    .line 933
    invoke-static {v6, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 934
    .line 935
    .line 936
    move-result p0

    .line 937
    goto :goto_e

    .line 938
    nop

    .line 939
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
