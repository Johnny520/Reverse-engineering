.class public final synthetic Lz7;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lz7;->ε:I

    iput-object p1, p0, Lz7;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lz7;->η:Ljava/lang/Object;

    iput-object p3, p0, Lz7;->θ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv80;Lke;Lnw1;Lf11;)V
    .locals 0

    .line 1
    const/4 p4, 0x6

    .line 2
    iput p4, p0, Lz7;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lz7;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lz7;->η:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lz7;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lz7;->ε:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0xff

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    sget-object v7, Ls62;->α:Ls62;

    .line 12
    .line 13
    iget-object v8, p0, Lz7;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, p0, Lz7;->η:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p0, Lz7;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p0, Lly1;

    .line 23
    .line 24
    check-cast v9, Landroid/app/Activity;

    .line 25
    .line 26
    check-cast v8, Lty1;

    .line 27
    .line 28
    sget-object v0, Lry1;->α:Lry1;

    .line 29
    .line 30
    iget-object v0, p0, Lly1;->α:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, Lly1;->β:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v1, Lmy1;

    .line 35
    .line 36
    invoke-direct {v1, v3, v6, v6}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lrd;

    .line 40
    .line 41
    invoke-direct {v2}, Lrd;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "follow"

    .line 45
    .line 46
    invoke-static {v0, p0, v1, v3, v2}, Lry1;->Щ(Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Lrd;)Ls62;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lxa1;->δ()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ldd1;->γ()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {v9, p0}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 57
    .line 58
    .line 59
    const-string p0, "\u5df2\u6e05\u9664\u5206\u7ec4\u89c4\u5219"

    .line 60
    .line 61
    invoke-static {v9, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Lty1;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-object v7

    .line 72
    :pswitch_0
    check-cast p0, Lky1;

    .line 73
    .line 74
    check-cast v9, Landroid/app/Activity;

    .line 75
    .line 76
    check-cast v8, Lcu1;

    .line 77
    .line 78
    sget-object v0, Lry1;->α:Lry1;

    .line 79
    .line 80
    new-instance v0, Lmy1;

    .line 81
    .line 82
    invoke-direct {v0, v3, v6, v6}, Lmy1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v0}, Lry1;->Э(Lky1;Lmy1;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lxa1;->δ()V

    .line 89
    .line 90
    .line 91
    iget-wide v0, p0, Lky1;->β:J

    .line 92
    .line 93
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const-wide/16 v3, 0x0

    .line 98
    .line 99
    cmp-long v0, v0, v3

    .line 100
    .line 101
    if-lez v0, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    move-object v2, v6

    .line 105
    :goto_0
    if-eqz v2, :cond_2

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-static {}, Lv81;->θ()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lsd;

    .line 124
    .line 125
    if-nez v2, :cond_1

    .line 126
    .line 127
    new-instance v2, Lsd;

    .line 128
    .line 129
    invoke-direct {v2, v0, v1}, Lsd;-><init>(J)V

    .line 130
    .line 131
    .line 132
    :cond_1
    sget-object v0, Lip1;->ε:Lip1;

    .line 133
    .line 134
    invoke-static {v2, v0, v0, v0}, Lsd;->α(Lsd;Lip1;Lip1;Lip1;)Lsd;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lv81;->ο(Lsd;)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Ldd1;->γ()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {v9, v0}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-static {p0, v6}, Lry1;->Ш(Lky1;Ljava/lang/Integer;)V

    .line 149
    .line 150
    .line 151
    const-string p0, "\u5df2\u6539\u4e3a\u8ddf\u968f\u5206\u7ec4/\u5168\u5c40\u6d88\u606f\u3001\u706b\u661f\u3001\u6295\u5582\u4e0e\u8425\u5730\u89c4\u5219"

    .line 152
    .line 153
    invoke-static {v9, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, Lcu1;->invoke()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    return-object v7

    .line 164
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 165
    .line 166
    check-cast v9, Lxg1;

    .line 167
    .line 168
    check-cast v8, Landroid/net/Uri;

    .line 169
    .line 170
    iget-object v0, v9, Lxg1;->α:Lky1;

    .line 171
    .line 172
    invoke-static {p0, v0, v8}, Lg81;->σ(Landroid/app/Activity;Lky1;Landroid/net/Uri;)Leg1;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v1, Lii0;

    .line 177
    .line 178
    const/16 v2, 0x11

    .line 179
    .line 180
    invoke-direct {v1, p0, v2, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 184
    .line 185
    .line 186
    return-object v7

    .line 187
    :pswitch_2
    check-cast p0, Landroid/app/Activity;

    .line 188
    .line 189
    check-cast v9, Lyg1;

    .line 190
    .line 191
    check-cast v8, Landroid/widget/EditText;

    .line 192
    .line 193
    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-eqz v0, :cond_3

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    goto :goto_1

    .line 204
    :cond_3
    move-object v0, v6

    .line 205
    :goto_1
    if-nez v0, :cond_4

    .line 206
    .line 207
    move-object v11, v1

    .line 208
    goto :goto_2

    .line 209
    :cond_4
    move-object v11, v0

    .line 210
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {}, Lx9;->η()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    const-string v1, "rc62a71041a7416a5"

    .line 221
    .line 222
    if-nez v0, :cond_5

    .line 223
    .line 224
    const-string v0, "\u706b\u661f\u53d1\u9001\u6d4b\u8bd5\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 225
    .line 226
    move-object v9, p0

    .line 227
    goto :goto_3

    .line 228
    :cond_5
    iget-object v0, v9, Lyg1;->β:Ljava/lang/String;

    .line 229
    .line 230
    iget v3, v9, Lyg1;->γ:I

    .line 231
    .line 232
    new-instance v4, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-string v5, "\u5f00\u59cb\u6587\u672c\u6d4b\u8bd5 name="

    .line 235
    .line 236
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v0, " count="

    .line 243
    .line 244
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v1, v0, v6, v2, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object v8, Lry1;->α:Lry1;

    .line 258
    .line 259
    iget-object v10, v9, Lyg1;->α:Lky1;

    .line 260
    .line 261
    iget v12, v9, Lyg1;->γ:I

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    move-object v9, p0

    .line 265
    invoke-virtual/range {v8 .. v13}, Lry1;->ｉ(Landroid/app/Activity;Lky1;Ljava/lang/String;ILig1;)Loy1;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-object v0, p0, Loy1;->δ:Ljava/lang/String;

    .line 270
    .line 271
    :goto_3
    const/16 p0, 0x20

    .line 272
    .line 273
    const/16 v3, 0xa

    .line 274
    .line 275
    invoke-virtual {v0, v3, p0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v1, p0, v6, v2, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    new-instance p0, Lxx0;

    .line 286
    .line 287
    invoke-direct {p0, v9, v0, v3}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 291
    .line 292
    .line 293
    return-object v7

    .line 294
    :pswitch_3
    check-cast p0, Landroid/app/Activity;

    .line 295
    .line 296
    check-cast v9, Landroid/view/View;

    .line 297
    .line 298
    check-cast v8, Lec1;

    .line 299
    .line 300
    iget-object v0, v8, Lec1;->δ:Ljava/lang/String;

    .line 301
    .line 302
    new-instance v1, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    const-string v2, "\u5df2\u4fdd\u5b58 "

    .line 305
    .line 306
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v0, " \u7684\u4eba\u5458\u89c4\u5219"

    .line 313
    .line 314
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {p0, v9, v0}, Lxn0;->т(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-object v7

    .line 325
    :pswitch_4
    check-cast p0, Lq80;

    .line 326
    .line 327
    check-cast v9, Lrw1;

    .line 328
    .line 329
    check-cast v8, Lr71;

    .line 330
    .line 331
    if-eqz p0, :cond_6

    .line 332
    .line 333
    invoke-virtual {v9, p0}, Lrw1;->γ(Lq80;)I

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    iget v0, v9, Lrw1;->υ:I

    .line 338
    .line 339
    sub-int/2addr p0, v0

    .line 340
    invoke-virtual {v9, p0}, Lrw1;->α(I)V

    .line 341
    .line 342
    .line 343
    :cond_6
    iget p0, v9, Lrw1;->υ:I

    .line 344
    .line 345
    invoke-static {v9, v6, p0, v6}, Lln0;->λ(Lrw1;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p0}, Lxh;->Р(Ljava/util/List;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    check-cast v0, Ljn;

    .line 354
    .line 355
    if-eqz v0, :cond_7

    .line 356
    .line 357
    iget-object v0, v0, Ljn;->β:Ljava/lang/Integer;

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_7
    move-object v0, v6

    .line 361
    :goto_4
    invoke-interface {v8, v0}, Lr71;->δ(Ljava/lang/Integer;)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    if-eqz v0, :cond_9

    .line 366
    .line 367
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_8

    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_8
    invoke-static {v1}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Ljn;

    .line 379
    .line 380
    invoke-static {v1, v4}, Lxh;->Г(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iget v2, v2, Ljn;->α:I

    .line 385
    .line 386
    new-instance v3, Ljn;

    .line 387
    .line 388
    invoke-direct {v3, v2, v6, v0}, Ljn;-><init>(ILv81;Ljava/lang/Integer;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v3}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v0, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    :cond_9
    :goto_5
    new-instance v0, Lhn;

    .line 400
    .line 401
    invoke-static {p0, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    invoke-interface {v8}, Lr71;->ε()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    invoke-direct {v0, p0, v1}, Lhn;-><init>(Ljava/util/List;Z)V

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_5
    check-cast p0, Lmv1;

    .line 414
    .line 415
    check-cast v9, Landroid/app/Dialog;

    .line 416
    .line 417
    check-cast v8, Landroid/app/Activity;

    .line 418
    .line 419
    iget-object p0, p0, Lmv1;->ζ:Lp70;

    .line 420
    .line 421
    :try_start_0
    invoke-virtual {v9}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 422
    .line 423
    .line 424
    :catchall_0
    sget-object v0, Lin0;->α:Landroid/os/Handler;

    .line 425
    .line 426
    new-instance v1, Lfn0;

    .line 427
    .line 428
    invoke-direct {v1, v5, p0, v8}, Lfn0;-><init>(ILp70;Landroid/app/Activity;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 432
    .line 433
    .line 434
    return-object v7

    .line 435
    :pswitch_6
    check-cast p0, Lnd0;

    .line 436
    .line 437
    iput-boolean v5, p0, Lnd0;->Ζ:Z

    .line 438
    .line 439
    instance-of v0, v9, Leo1;

    .line 440
    .line 441
    if-eqz v0, :cond_a

    .line 442
    .line 443
    move-object v0, v6

    .line 444
    goto :goto_6

    .line 445
    :cond_a
    move-object v0, v9

    .line 446
    :goto_6
    check-cast v0, Llj0;

    .line 447
    .line 448
    if-eqz v0, :cond_b

    .line 449
    .line 450
    iget-object v0, v0, Llj0;->ε:Ljava/lang/String;

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_b
    move-object v0, v6

    .line 454
    :goto_7
    if-nez v0, :cond_c

    .line 455
    .line 456
    move-object v0, v1

    .line 457
    :cond_c
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-eqz v2, :cond_10

    .line 462
    .line 463
    invoke-static {v9}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    if-nez v0, :cond_d

    .line 468
    .line 469
    invoke-static {v8}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :cond_d
    if-eqz v0, :cond_e

    .line 474
    .line 475
    invoke-static {v0}, Lnd0;->θ(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    :cond_e
    if-nez v6, :cond_f

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_f
    move-object v1, v6

    .line 483
    :goto_8
    move-object v0, v1

    .line 484
    :cond_10
    iput-object v0, p0, Lnd0;->Η:Ljava/lang/String;

    .line 485
    .line 486
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p0}, Lnd0;->η()V

    .line 490
    .line 491
    .line 492
    return-object v7

    .line 493
    :pswitch_7
    check-cast p0, Ldc0;

    .line 494
    .line 495
    check-cast v9, Lum1;

    .line 496
    .line 497
    check-cast v8, Ljava/util/Map;

    .line 498
    .line 499
    iput-boolean v5, p0, Ldc0;->υ:Z

    .line 500
    .line 501
    iget-object v0, v9, Lum1;->ε:Ljava/lang/Object;

    .line 502
    .line 503
    if-eqz v0, :cond_12

    .line 504
    .line 505
    check-cast v0, Lsb0;

    .line 506
    .line 507
    iget-object v1, v0, Lsb0;->β:Ljava/util/List;

    .line 508
    .line 509
    iput-object v1, p0, Ldc0;->σ:Ljava/util/List;

    .line 510
    .line 511
    iget-object v1, v0, Lsb0;->α:Ljava/util/List;

    .line 512
    .line 513
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    iput v1, p0, Ldc0;->τ:I

    .line 518
    .line 519
    iget-object v0, v0, Lsb0;->δ:Ljava/lang/String;

    .line 520
    .line 521
    iput-object v0, p0, Ldc0;->ψ:Ljava/lang/String;

    .line 522
    .line 523
    iget-object v0, p0, Ldc0;->π:Ljava/util/LinkedHashMap;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget-object v2, p0, Ldc0;->σ:Ljava/util/List;

    .line 530
    .line 531
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 532
    .line 533
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 534
    .line 535
    .line 536
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-eqz v4, :cond_11

    .line 545
    .line 546
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    check-cast v4, Lic0;

    .line 551
    .line 552
    iget-wide v4, v4, Lic0;->β:J

    .line 553
    .line 554
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    goto :goto_9

    .line 562
    :cond_11
    invoke-interface {v1, v3}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v8}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {p0}, Ldc0;->η()V

    .line 569
    .line 570
    .line 571
    return-object v7

    .line 572
    :cond_12
    const-string p0, "result"

    .line 573
    .line 574
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v6

    .line 578
    :pswitch_8
    check-cast p0, Lv80;

    .line 579
    .line 580
    check-cast v9, Lke;

    .line 581
    .line 582
    check-cast v8, Lnw1;

    .line 583
    .line 584
    iget-object v1, p0, Lv80;->Ο:Lrn;

    .line 585
    .line 586
    iget-object v2, v1, Lrn;->β:Lke;

    .line 587
    .line 588
    :try_start_1
    iput-object v9, v1, Lrn;->β:Lke;

    .line 589
    .line 590
    iget-object v3, p0, Lv80;->Ι:Lnw1;

    .line 591
    .line 592
    iget-object v4, p0, Lv80;->ο:[I

    .line 593
    .line 594
    iget-object v7, p0, Lv80;->χ:Ln11;

    .line 595
    .line 596
    iput-object v6, p0, Lv80;->ο:[I

    .line 597
    .line 598
    iput-object v6, p0, Lv80;->χ:Ln11;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 599
    .line 600
    :try_start_2
    iput-object v8, p0, Lv80;->Ι:Lnw1;

    .line 601
    .line 602
    iget-boolean v8, v1, Lrn;->ε:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 603
    .line 604
    :try_start_3
    iput-boolean v5, v1, Lrn;->ε:Z

    .line 605
    .line 606
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 607
    :catchall_1
    move-exception v0

    .line 608
    :try_start_4
    iput-boolean v8, v1, Lrn;->ε:Z

    .line 609
    .line 610
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 611
    :catchall_2
    move-exception v0

    .line 612
    :try_start_5
    iput-object v3, p0, Lv80;->Ι:Lnw1;

    .line 613
    .line 614
    iput-object v4, p0, Lv80;->ο:[I

    .line 615
    .line 616
    iput-object v7, p0, Lv80;->χ:Ln11;

    .line 617
    .line 618
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 619
    :catchall_3
    move-exception v0

    .line 620
    move-object p0, v0

    .line 621
    iput-object v2, v1, Lrn;->β:Lke;

    .line 622
    .line 623
    throw p0

    .line 624
    :pswitch_9
    check-cast p0, Lq10;

    .line 625
    .line 626
    check-cast v9, Landroid/view/View;

    .line 627
    .line 628
    check-cast v8, Landroid/view/View$OnClickListener;

    .line 629
    .line 630
    invoke-static {p0, v9, v8}, Lq10;->α(Lq10;Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 631
    .line 632
    .line 633
    new-instance v0, Le9;

    .line 634
    .line 635
    const/16 v1, 0xb

    .line 636
    .line 637
    invoke-direct {v0, p0, v9, v8, v1}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v9, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 641
    .line 642
    .line 643
    return-object v7

    .line 644
    :pswitch_a
    check-cast p0, Lje;

    .line 645
    .line 646
    check-cast v9, Lqc0;

    .line 647
    .line 648
    check-cast v8, Lp;

    .line 649
    .line 650
    iget-object p0, p0, Lje;->β:Lbd;

    .line 651
    .line 652
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v9}, Lqc0;->α()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    iget-object v1, v8, Lp;->θ:Log0;

    .line 660
    .line 661
    iget-object v1, v1, Log0;->δ:Ljava/lang/String;

    .line 662
    .line 663
    invoke-virtual {p0, v1, v0}, Lbd;->θ(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    return-object p0

    .line 668
    :pswitch_b
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 669
    .line 670
    check-cast v9, [Ljava/lang/String;

    .line 671
    .line 672
    check-cast v8, Ljava/lang/ClassLoader;

    .line 673
    .line 674
    new-instance v0, Lzi;

    .line 675
    .line 676
    invoke-direct {v0, v9, v5}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 680
    .line 681
    .line 682
    move-result-object p0

    .line 683
    new-instance v1, Ljava/util/ArrayList;

    .line 684
    .line 685
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    :cond_13
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    if-eqz v0, :cond_15

    .line 697
    .line 698
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 703
    .line 704
    :try_start_6
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 705
    .line 706
    .line 707
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 708
    goto :goto_b

    .line 709
    :catchall_4
    move-exception v0

    .line 710
    new-instance v2, Leo1;

    .line 711
    .line 712
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 713
    .line 714
    .line 715
    move-object v0, v2

    .line 716
    :goto_b
    instance-of v2, v0, Leo1;

    .line 717
    .line 718
    if-eqz v2, :cond_14

    .line 719
    .line 720
    move-object v0, v6

    .line 721
    :cond_14
    check-cast v0, Ljava/lang/reflect/Method;

    .line 722
    .line 723
    if-eqz v0, :cond_13

    .line 724
    .line 725
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    goto :goto_a

    .line 729
    :cond_15
    return-object v1

    .line 730
    :pswitch_c
    check-cast p0, Lrb;

    .line 731
    .line 732
    check-cast v9, Landroid/view/ViewGroup;

    .line 733
    .line 734
    check-cast v8, Ljava/util/ArrayList;

    .line 735
    .line 736
    iget-object v0, p0, Lrb;->α:Ljava/util/IdentityHashMap;

    .line 737
    .line 738
    iget-object p0, p0, Lrb;->β:Ljava/util/IdentityHashMap;

    .line 739
    .line 740
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 741
    .line 742
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 743
    .line 744
    .line 745
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    :cond_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v10

    .line 757
    if-eqz v10, :cond_19

    .line 758
    .line 759
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v10

    .line 763
    check-cast v10, Landroid/view/View;

    .line 764
    .line 765
    new-instance v11, Ljava/util/ArrayList;

    .line 766
    .line 767
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    instance-of v12, v10, Landroid/view/View;

    .line 775
    .line 776
    if-eqz v12, :cond_17

    .line 777
    .line 778
    check-cast v10, Landroid/view/View;

    .line 779
    .line 780
    goto :goto_c

    .line 781
    :cond_17
    move-object v10, v6

    .line 782
    :goto_c
    if-eqz v10, :cond_16

    .line 783
    .line 784
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    if-ne v10, v9, :cond_18

    .line 788
    .line 789
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 790
    .line 791
    .line 792
    move-result-object v10

    .line 793
    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 794
    .line 795
    .line 796
    move-result v11

    .line 797
    if-eqz v11, :cond_16

    .line 798
    .line 799
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v11

    .line 803
    check-cast v11, Landroid/view/View;

    .line 804
    .line 805
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    move-object v12, v1

    .line 809
    check-cast v12, Ljava/util/Collection;

    .line 810
    .line 811
    invoke-interface {v12, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    goto :goto_d

    .line 815
    :cond_18
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 816
    .line 817
    .line 818
    move-result-object v10

    .line 819
    instance-of v12, v10, Landroid/view/View;

    .line 820
    .line 821
    if-eqz v12, :cond_17

    .line 822
    .line 823
    check-cast v10, Landroid/view/View;

    .line 824
    .line 825
    goto :goto_c

    .line 826
    :cond_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    check-cast v1, Ljava/lang/Iterable;

    .line 830
    .line 831
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    :cond_1a
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    if-eqz v3, :cond_1c

    .line 840
    .line 841
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    check-cast v3, Landroid/view/View;

    .line 846
    .line 847
    invoke-virtual {p0, v3}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v9

    .line 851
    check-cast v9, Lpb;

    .line 852
    .line 853
    if-nez v9, :cond_1b

    .line 854
    .line 855
    new-instance v9, Lpb;

    .line 856
    .line 857
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 858
    .line 859
    .line 860
    move-result-object v10

    .line 861
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 862
    .line 863
    .line 864
    iput-object v10, v9, Lpb;->α:Landroid/graphics/drawable/Drawable;

    .line 865
    .line 866
    invoke-interface {p0, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    :cond_1b
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 870
    .line 871
    .line 872
    move-result-object v10

    .line 873
    if-eqz v10, :cond_1a

    .line 874
    .line 875
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 876
    .line 877
    .line 878
    move-result-object v10

    .line 879
    iput-object v10, v9, Lpb;->α:Landroid/graphics/drawable/Drawable;

    .line 880
    .line 881
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 882
    .line 883
    .line 884
    goto :goto_e

    .line 885
    :cond_1c
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object p0

    .line 889
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    if-eqz v1, :cond_23

    .line 894
    .line 895
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    check-cast v1, Landroid/view/View;

    .line 900
    .line 901
    invoke-virtual {v0, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    check-cast v3, Lqb;

    .line 906
    .line 907
    if-nez v3, :cond_1d

    .line 908
    .line 909
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    new-instance v3, Lqb;

    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 915
    .line 916
    .line 917
    move-result v6

    .line 918
    invoke-virtual {v1}, Landroid/view/View;->isClickable()Z

    .line 919
    .line 920
    .line 921
    move-result v8

    .line 922
    invoke-virtual {v1}, Landroid/view/View;->isLongClickable()Z

    .line 923
    .line 924
    .line 925
    move-result v9

    .line 926
    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    .line 927
    .line 928
    .line 929
    move-result v10

    .line 930
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 931
    .line 932
    .line 933
    move-result v11

    .line 934
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 935
    .line 936
    .line 937
    iput v6, v3, Lqb;->α:F

    .line 938
    .line 939
    iput-boolean v8, v3, Lqb;->β:Z

    .line 940
    .line 941
    iput-boolean v9, v3, Lqb;->γ:Z

    .line 942
    .line 943
    iput-boolean v10, v3, Lqb;->δ:Z

    .line 944
    .line 945
    iput v11, v3, Lqb;->ε:I

    .line 946
    .line 947
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 954
    .line 955
    .line 956
    move-result v6

    .line 957
    const/4 v8, 0x0

    .line 958
    cmpg-float v6, v6, v8

    .line 959
    .line 960
    if-nez v6, :cond_1e

    .line 961
    .line 962
    goto :goto_10

    .line 963
    :cond_1e
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 964
    .line 965
    .line 966
    move-result v6

    .line 967
    iput v6, v3, Lqb;->α:F

    .line 968
    .line 969
    :goto_10
    invoke-virtual {v1}, Landroid/view/View;->isClickable()Z

    .line 970
    .line 971
    .line 972
    move-result v6

    .line 973
    if-eqz v6, :cond_1f

    .line 974
    .line 975
    iput-boolean v4, v3, Lqb;->β:Z

    .line 976
    .line 977
    :cond_1f
    invoke-virtual {v1}, Landroid/view/View;->isLongClickable()Z

    .line 978
    .line 979
    .line 980
    move-result v6

    .line 981
    if-eqz v6, :cond_20

    .line 982
    .line 983
    iput-boolean v4, v3, Lqb;->γ:Z

    .line 984
    .line 985
    :cond_20
    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    .line 986
    .line 987
    .line 988
    move-result v6

    .line 989
    if-eqz v6, :cond_21

    .line 990
    .line 991
    iput-boolean v4, v3, Lqb;->δ:Z

    .line 992
    .line 993
    :cond_21
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 994
    .line 995
    .line 996
    move-result v6

    .line 997
    if-eq v6, v2, :cond_22

    .line 998
    .line 999
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1000
    .line 1001
    .line 1002
    move-result v6

    .line 1003
    iput v6, v3, Lqb;->ε:I

    .line 1004
    .line 1005
    :cond_22
    invoke-virtual {v1, v8}, Landroid/view/View;->setAlpha(F)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v1, v5}, Landroid/view/View;->setLongClickable(Z)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1018
    .line 1019
    .line 1020
    goto/16 :goto_f

    .line 1021
    .line 1022
    :cond_23
    return-object v7

    .line 1023
    :pswitch_d
    check-cast p0, Ljava/lang/String;

    .line 1024
    .line 1025
    check-cast v9, Ljava/lang/String;

    .line 1026
    .line 1027
    check-cast v8, Landroid/app/Activity;

    .line 1028
    .line 1029
    const-string v0, "UID: "

    .line 1030
    .line 1031
    const-string v1, "\n\u7533\u8bf7\u7801: "

    .line 1032
    .line 1033
    invoke-static {v0, p0, v1, v9}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p0

    .line 1037
    const-string v0, "clipboard"

    .line 1038
    .line 1039
    invoke-virtual {v8, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    check-cast v0, Landroid/content/ClipboardManager;

    .line 1047
    .line 1048
    const-string v1, "DYHelper\u7533\u8bf7\u4fe1\u606f"

    .line 1049
    .line 1050
    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p0

    .line 1054
    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 1055
    .line 1056
    .line 1057
    const-string p0, " \u5df2\u590d\u5236\uff0c\u8bf7\u53d1\u7ed9\u5f00\u53d1\u8005"

    .line 1058
    .line 1059
    invoke-static {v8, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1060
    .line 1061
    .line 1062
    move-result-object p0

    .line 1063
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 1064
    .line 1065
    .line 1066
    return-object v7

    .line 1067
    :pswitch_e
    check-cast p0, La8;

    .line 1068
    .line 1069
    check-cast v9, Lb8;

    .line 1070
    .line 1071
    check-cast v8, Lsm1;

    .line 1072
    .line 1073
    invoke-virtual {p0}, La8;->α()V

    .line 1074
    .line 1075
    .line 1076
    iget-object p0, v9, Lb8;->γ:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast p0, Lj7;

    .line 1079
    .line 1080
    iget v0, v8, Lsm1;->ε:I

    .line 1081
    .line 1082
    :cond_24
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1083
    .line 1084
    .line 1085
    move-result v1

    .line 1086
    ushr-int/lit8 v2, v1, 0x1b

    .line 1087
    .line 1088
    and-int/lit8 v2, v2, 0xf

    .line 1089
    .line 1090
    if-ne v2, v0, :cond_25

    .line 1091
    .line 1092
    add-int/lit8 v2, v1, -0x1

    .line 1093
    .line 1094
    goto :goto_11

    .line 1095
    :cond_25
    move v2, v1

    .line 1096
    :goto_11
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v1

    .line 1100
    if-eqz v1, :cond_24

    .line 1101
    .line 1102
    return-object v7

    .line 1103
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
