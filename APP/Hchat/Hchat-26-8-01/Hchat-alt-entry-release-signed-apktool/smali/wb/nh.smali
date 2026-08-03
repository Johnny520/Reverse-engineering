.class public final synthetic Lwb/nh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/nh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/nh;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/nh;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 10
    .line 11
    check-cast p1, Li0/h0;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    and-int/lit8 v4, p2, 0x3

    .line 20
    .line 21
    if-eq v4, v1, :cond_0

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    and-int/2addr p2, v3

    .line 27
    invoke-virtual {p1, p2, v1}, Li0/h0;->S(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    const-string p2, "\u6682\u65e0\u5728\u7ebf\u63d2\u4ef6"

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7684\u5728\u7ebf\u63d2\u4ef6"

    .line 49
    .line 50
    :goto_1
    invoke-static {p2, p1, v2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 55
    .line 56
    .line 57
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_0
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 61
    .line 62
    check-cast p1, Ljava/util/List;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Throwable;

    .line 65
    .line 66
    sget-object p2, Lwb/ho;->a:Log/k;

    .line 67
    .line 68
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_1
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    check-cast p2, Lna/j;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v1, Lwb/uq;

    .line 88
    .line 89
    invoke-direct {v1, p1, p2, v3}, Lwb/uq;-><init>(ILna/j;Z)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_2
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 99
    .line 100
    check-cast p1, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    check-cast p2, Lna/i;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v1, Lwb/hq;

    .line 112
    .line 113
    invoke-direct {v1, p1, p2, v3}, Lwb/hq;-><init>(ILna/i;Z)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_3
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 123
    .line 124
    check-cast p1, Ljava/lang/String;

    .line 125
    .line 126
    check-cast p2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v1, Lsf/e;

    .line 135
    .line 136
    invoke-direct {v1, p1, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_4
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 146
    .line 147
    check-cast p1, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    check-cast p2, Lo9/q;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v1, Lwb/c4;

    .line 159
    .line 160
    invoke-direct {v1, p1, p2, v3}, Lwb/c4;-><init>(ILo9/q;Z)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_5
    iget-object v1, p0, Lwb/nh;->h:Li0/a1;

    .line 170
    .line 171
    check-cast p1, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    check-cast p2, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Ljava/util/List;

    .line 188
    .line 189
    new-instance p2, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_3

    .line 207
    .line 208
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Lwb/sv;

    .line 213
    .line 214
    iget-object v0, v0, Lwb/sv;->a:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_3
    sget-object v5, Lfb/v0;->a:Lrb/k;

    .line 221
    .line 222
    if-eqz v5, :cond_1b

    .line 223
    .line 224
    iget-boolean p1, v5, Lrb/k;->l:Z

    .line 225
    .line 226
    if-eqz p1, :cond_1a

    .line 227
    .line 228
    iget-object p1, v5, Lrb/k;->k:Lrb/c;

    .line 229
    .line 230
    if-nez p1, :cond_4

    .line 231
    .line 232
    goto/16 :goto_11

    .line 233
    .line 234
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_5

    .line 252
    .line 253
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v0, p1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_5
    invoke-static {p1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    if-eqz p2, :cond_6

    .line 276
    .line 277
    new-instance p1, Lrb/a;

    .line 278
    .line 279
    const-string p2, "\u8bf7\u9009\u62e9\u8981\u5220\u9664\u7684\u597d\u53cb"

    .line 280
    .line 281
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_12

    .line 285
    .line 286
    :cond_6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    if-eqz p2, :cond_7

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_9

    .line 302
    .line 303
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, Ljava/lang/String;

    .line 308
    .line 309
    invoke-static {v0}, Lrb/k;->g(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_8

    .line 314
    .line 315
    new-instance p1, Lrb/a;

    .line 316
    .line 317
    const-string p2, "\u9009\u62e9\u4e2d\u5305\u542b\u65e0\u6548\u8054\u7cfb\u4eba\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9"

    .line 318
    .line 319
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_12

    .line 323
    .line 324
    :cond_9
    :goto_5
    iget-object p2, v5, Lrb/k;->d:Ljava/lang/Object;

    .line 325
    .line 326
    monitor-enter p2

    .line 327
    :try_start_0
    iget-boolean v0, v5, Lrb/k;->m:Z

    .line 328
    .line 329
    if-eqz v0, :cond_a

    .line 330
    .line 331
    new-instance p1, Lrb/a;

    .line 332
    .line 333
    const-string v0, "\u8bf7\u5148\u6682\u505c\u597d\u53cb\u68c0\u6d4b"

    .line 334
    .line 335
    invoke-direct {p1, v2, v0}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    .line 337
    .line 338
    :goto_6
    monitor-exit p2

    .line 339
    goto/16 :goto_12

    .line 340
    .line 341
    :catchall_0
    move-exception v0

    .line 342
    move-object p1, v0

    .line 343
    goto/16 :goto_10

    .line 344
    .line 345
    :cond_a
    :try_start_1
    iget-boolean v0, v5, Lrb/k;->s:Z

    .line 346
    .line 347
    if-eqz v0, :cond_b

    .line 348
    .line 349
    new-instance p1, Lrb/a;

    .line 350
    .line 351
    const-string v0, "\u6279\u91cf\u5220\u9664\u6b63\u5728\u8fd0\u884c"

    .line 352
    .line 353
    invoke-direct {p1, v2, v0}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_b
    monitor-exit p2

    .line 358
    :try_start_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 359
    .line 360
    .line 361
    move-result-object p2

    .line 362
    const/4 v0, 0x0

    .line 363
    if-eqz p2, :cond_c

    .line 364
    .line 365
    const-string v4, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!=\'\' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE \'%chatroom\'"

    .line 366
    .line 367
    invoke-virtual {p2, v4, v0}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :cond_c
    if-nez v0, :cond_d

    .line 372
    .line 373
    sget-object v0, Ltf/t;->g:Ltf/t;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :catchall_1
    move-exception v0

    .line 377
    move-object p2, v0

    .line 378
    new-instance v0, Lsf/f;

    .line 379
    .line 380
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    :cond_d
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 384
    .line 385
    .line 386
    move-result-object p2

    .line 387
    if-nez p2, :cond_19

    .line 388
    .line 389
    check-cast v0, Ljava/util/List;

    .line 390
    .line 391
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 392
    .line 393
    .line 394
    move-result p2

    .line 395
    invoke-static {p2}, Ltf/y;->a0(I)I

    .line 396
    .line 397
    .line 398
    move-result p2

    .line 399
    const/16 v4, 0x10

    .line 400
    .line 401
    if-ge p2, v4, :cond_e

    .line 402
    .line 403
    move p2, v4

    .line 404
    :cond_e
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 405
    .line 406
    invoke-direct {v4, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_f

    .line 418
    .line 419
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    move-object v6, v0

    .line 424
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 425
    .line 426
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_f
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result p2

    .line 436
    if-eqz p2, :cond_10

    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object p2

    .line 443
    :cond_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_12

    .line 448
    .line 449
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    check-cast v0, Ljava/lang/String;

    .line 454
    .line 455
    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-nez v0, :cond_11

    .line 460
    .line 461
    new-instance p1, Lrb/a;

    .line 462
    .line 463
    const-string p2, "\u90e8\u5206\u597d\u53cb\u5df2\u4e0d\u5728\u8054\u7cfb\u4eba\u5217\u8868\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9"

    .line 464
    .line 465
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_12

    .line 469
    .line 470
    :cond_12
    :goto_9
    new-instance v6, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 473
    .line 474
    .line 475
    move-result p2

    .line 476
    invoke-direct {v6, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 477
    .line 478
    .line 479
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result p2

    .line 487
    if-eqz p2, :cond_14

    .line 488
    .line 489
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object p2

    .line 493
    check-cast p2, Ljava/lang/String;

    .line 494
    .line 495
    invoke-static {p2, v4}, Ltf/y;->Y(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 500
    .line 501
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    if-eqz v9, :cond_13

    .line 510
    .line 511
    move-object v0, p2

    .line 512
    :cond_13
    new-instance v9, Lrb/i;

    .line 513
    .line 514
    invoke-direct {v9, p2, v0}, Lrb/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_14
    iget-object p1, v5, Lrb/k;->d:Ljava/lang/Object;

    .line 522
    .line 523
    monitor-enter p1

    .line 524
    :try_start_3
    iget-boolean p2, v5, Lrb/k;->m:Z

    .line 525
    .line 526
    if-eqz p2, :cond_15

    .line 527
    .line 528
    new-instance p2, Lrb/a;

    .line 529
    .line 530
    const-string v0, "\u8bf7\u5148\u6682\u505c\u597d\u53cb\u68c0\u6d4b"

    .line 531
    .line 532
    invoke-direct {p2, v2, v0}, Lrb/a;-><init>(ZLjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 533
    .line 534
    .line 535
    :goto_b
    monitor-exit p1

    .line 536
    move-object p1, p2

    .line 537
    goto/16 :goto_12

    .line 538
    .line 539
    :catchall_2
    move-exception v0

    .line 540
    move-object p2, v0

    .line 541
    goto/16 :goto_f

    .line 542
    .line 543
    :cond_15
    :try_start_4
    iget-boolean p2, v5, Lrb/k;->s:Z

    .line 544
    .line 545
    if-eqz p2, :cond_16

    .line 546
    .line 547
    new-instance p2, Lrb/a;

    .line 548
    .line 549
    const-string v0, "\u6279\u91cf\u5220\u9664\u6b63\u5728\u8fd0\u884c"

    .line 550
    .line 551
    invoke-direct {p2, v2, v0}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 552
    .line 553
    .line 554
    goto :goto_b

    .line 555
    :cond_16
    iget-wide v9, v5, Lrb/k;->r:J

    .line 556
    .line 557
    const-wide/16 v11, 0x1

    .line 558
    .line 559
    add-long/2addr v9, v11

    .line 560
    iput-wide v9, v5, Lrb/k;->r:J

    .line 561
    .line 562
    iput-boolean v3, v5, Lrb/k;->s:Z

    .line 563
    .line 564
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 565
    .line 566
    .line 567
    move-result p2

    .line 568
    iput p2, v5, Lrb/k;->t:I

    .line 569
    .line 570
    iput v2, v5, Lrb/k;->u:I

    .line 571
    .line 572
    iput v2, v5, Lrb/k;->v:I

    .line 573
    .line 574
    iput v2, v5, Lrb/k;->w:I

    .line 575
    .line 576
    const-string p2, ""

    .line 577
    .line 578
    iput-object p2, v5, Lrb/k;->o:Ljava/lang/String;

    .line 579
    .line 580
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 581
    .line 582
    .line 583
    move-result p2

    .line 584
    new-instance v0, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 587
    .line 588
    .line 589
    const-string v4, "\u51c6\u5907\u6279\u91cf\u5220\u9664 "

    .line 590
    .line 591
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string p2, " \u4f4d\u597d\u53cb"

    .line 598
    .line 599
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p2

    .line 606
    iput-object p2, v5, Lrb/k;->n:Ljava/lang/String;

    .line 607
    .line 608
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 609
    .line 610
    .line 611
    move-result p2

    .line 612
    new-instance v0, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const-string v4, "\u5f00\u59cb\u6279\u91cf\u5220\u9664 "

    .line 618
    .line 619
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string p2, " \u4f4d\u597d\u53cb"

    .line 626
    .line 627
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p2

    .line 634
    invoke-virtual {v5, p2}, Lrb/k;->b(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    iget-wide v9, v5, Lrb/k;->r:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 638
    .line 639
    monitor-exit p1

    .line 640
    :try_start_5
    iget-object p1, v5, Lrb/k;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 641
    .line 642
    new-instance v4, Lrb/f;

    .line 643
    .line 644
    invoke-direct/range {v4 .. v10}, Lrb/f;-><init>(Lrb/k;Ljava/util/ArrayList;ZIJ)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {p1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 648
    .line 649
    .line 650
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :catchall_3
    move-exception v0

    .line 654
    move-object p1, v0

    .line 655
    new-instance p2, Lsf/f;

    .line 656
    .line 657
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 658
    .line 659
    .line 660
    move-object p1, p2

    .line 661
    :goto_c
    instance-of p1, p1, Lsf/f;

    .line 662
    .line 663
    if-eqz p1, :cond_18

    .line 664
    .line 665
    iget-object p1, v5, Lrb/k;->d:Ljava/lang/Object;

    .line 666
    .line 667
    monitor-enter p1

    .line 668
    :try_start_6
    invoke-virtual {v5, v9, v10}, Lrb/k;->d(J)Z

    .line 669
    .line 670
    .line 671
    move-result p2

    .line 672
    if-eqz p2, :cond_17

    .line 673
    .line 674
    iput-boolean v2, v5, Lrb/k;->s:Z

    .line 675
    .line 676
    const-string p2, ""

    .line 677
    .line 678
    iput-object p2, v5, Lrb/k;->o:Ljava/lang/String;

    .line 679
    .line 680
    const-string p2, "\u6279\u91cf\u5220\u9664\u542f\u52a8\u5931\u8d25"

    .line 681
    .line 682
    iput-object p2, v5, Lrb/k;->n:Ljava/lang/String;

    .line 683
    .line 684
    const-string p2, "\u6279\u91cf\u5220\u9664\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25"

    .line 685
    .line 686
    invoke-virtual {v5, p2}, Lrb/k;->b(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 687
    .line 688
    .line 689
    goto :goto_d

    .line 690
    :catchall_4
    move-exception v0

    .line 691
    move-object p2, v0

    .line 692
    goto :goto_e

    .line 693
    :cond_17
    :goto_d
    monitor-exit p1

    .line 694
    new-instance p1, Lrb/a;

    .line 695
    .line 696
    const-string p2, "\u6279\u91cf\u5220\u9664\u4efb\u52a1\u542f\u52a8\u5931\u8d25"

    .line 697
    .line 698
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 699
    .line 700
    .line 701
    goto :goto_12

    .line 702
    :goto_e
    monitor-exit p1

    .line 703
    throw p2

    .line 704
    :cond_18
    new-instance p1, Lrb/a;

    .line 705
    .line 706
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 707
    .line 708
    .line 709
    move-result p2

    .line 710
    const-string v0, "\u5df2\u5f00\u59cb\u6279\u91cf\u5220\u9664 "

    .line 711
    .line 712
    const-string v2, " \u4f4d\u597d\u53cb"

    .line 713
    .line 714
    invoke-static {p2, v0, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object p2

    .line 718
    invoke-direct {p1, v3, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 719
    .line 720
    .line 721
    goto :goto_12

    .line 722
    :goto_f
    monitor-exit p1

    .line 723
    throw p2

    .line 724
    :cond_19
    iget-object p1, v5, Lrb/k;->a:Lia/t;

    .line 725
    .line 726
    const-string v0, "\u6279\u91cf\u5220\u9664\u524d\u8bfb\u53d6\u597d\u53cb\u5217\u8868\u5931\u8d25"

    .line 727
    .line 728
    invoke-virtual {p1, v0, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    new-instance p1, Lrb/a;

    .line 732
    .line 733
    const-string p2, "\u8bfb\u53d6\u597d\u53cb\u5217\u8868\u5931\u8d25"

    .line 734
    .line 735
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 736
    .line 737
    .line 738
    goto :goto_12

    .line 739
    :goto_10
    monitor-exit p2

    .line 740
    throw p1

    .line 741
    :cond_1a
    :goto_11
    new-instance p1, Lrb/a;

    .line 742
    .line 743
    const-string p2, "\u5220\u9664\u597d\u53cb\u63a5\u53e3\u5c1a\u672a\u5c31\u7eea"

    .line 744
    .line 745
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 746
    .line 747
    .line 748
    goto :goto_12

    .line 749
    :cond_1b
    new-instance p1, Lrb/a;

    .line 750
    .line 751
    const-string p2, "\u68c0\u6d4b\u8fd0\u884c\u65f6\u5c1a\u672a\u5c31\u7eea"

    .line 752
    .line 753
    invoke-direct {p1, v2, p2}, Lrb/a;-><init>(ZLjava/lang/String;)V

    .line 754
    .line 755
    .line 756
    :goto_12
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 757
    .line 758
    invoke-interface {v1, p2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    return-object p1

    .line 762
    :pswitch_6
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 763
    .line 764
    check-cast p1, Ljava/lang/Integer;

    .line 765
    .line 766
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 767
    .line 768
    .line 769
    move-result p1

    .line 770
    check-cast p2, Lua/i;

    .line 771
    .line 772
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    new-instance v1, Lwb/nu;

    .line 776
    .line 777
    invoke-direct {v1, p1, p2, v3}, Lwb/nu;-><init>(ILua/i;Z)V

    .line 778
    .line 779
    .line 780
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 784
    .line 785
    return-object p1

    .line 786
    :pswitch_7
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 787
    .line 788
    check-cast p1, Ljava/lang/Integer;

    .line 789
    .line 790
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 791
    .line 792
    .line 793
    move-result p1

    .line 794
    check-cast p2, Lua/h;

    .line 795
    .line 796
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    new-instance v1, Lwb/mu;

    .line 800
    .line 801
    invoke-direct {v1, p1, p2, v3}, Lwb/mu;-><init>(ILua/h;Z)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 808
    .line 809
    return-object p1

    .line 810
    :pswitch_8
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 811
    .line 812
    check-cast p1, Ljava/lang/Integer;

    .line 813
    .line 814
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 815
    .line 816
    .line 817
    move-result p1

    .line 818
    check-cast p2, Laa/a;

    .line 819
    .line 820
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    new-instance v1, Lwb/i5;

    .line 824
    .line 825
    invoke-direct {v1, p1, p2, v3}, Lwb/i5;-><init>(ILaa/a;Z)V

    .line 826
    .line 827
    .line 828
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 832
    .line 833
    return-object p1

    .line 834
    :pswitch_9
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 835
    .line 836
    check-cast p1, Ljava/lang/Integer;

    .line 837
    .line 838
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 839
    .line 840
    .line 841
    move-result p1

    .line 842
    check-cast p2, Laa/h;

    .line 843
    .line 844
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    new-instance v1, Lwb/d6;

    .line 848
    .line 849
    invoke-direct {v1, p1, p2, v3}, Lwb/d6;-><init>(ILaa/h;Z)V

    .line 850
    .line 851
    .line 852
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 853
    .line 854
    .line 855
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 856
    .line 857
    return-object p1

    .line 858
    :pswitch_a
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 859
    .line 860
    check-cast p1, Ljava/lang/String;

    .line 861
    .line 862
    check-cast p2, Ljava/lang/String;

    .line 863
    .line 864
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    new-instance v1, Lwb/j4;

    .line 871
    .line 872
    invoke-direct {v1, p1, p2}, Lwb/j4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 876
    .line 877
    .line 878
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 879
    .line 880
    return-object p1

    .line 881
    :pswitch_b
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 882
    .line 883
    check-cast p1, Ljava/lang/Integer;

    .line 884
    .line 885
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 886
    .line 887
    .line 888
    move-result p1

    .line 889
    check-cast p2, Lq9/g;

    .line 890
    .line 891
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    new-instance v1, Lwb/k4;

    .line 895
    .line 896
    invoke-direct {v1, p1, p2, v3}, Lwb/k4;-><init>(ILq9/g;Z)V

    .line 897
    .line 898
    .line 899
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 903
    .line 904
    return-object p1

    .line 905
    :pswitch_c
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 906
    .line 907
    move-object v9, p1

    .line 908
    check-cast v9, Li0/h0;

    .line 909
    .line 910
    check-cast p2, Ljava/lang/Integer;

    .line 911
    .line 912
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 913
    .line 914
    .line 915
    move-result p1

    .line 916
    and-int/lit8 p2, p1, 0x3

    .line 917
    .line 918
    if-eq p2, v1, :cond_1c

    .line 919
    .line 920
    move v2, v3

    .line 921
    :cond_1c
    and-int/2addr p1, v3

    .line 922
    invoke-virtual {v9, p1, v2}, Li0/h0;->S(IZ)Z

    .line 923
    .line 924
    .line 925
    move-result p1

    .line 926
    if-eqz p1, :cond_1e

    .line 927
    .line 928
    const-string v4, "\u641c\u7d22"

    .line 929
    .line 930
    const-string v5, "\u8f93\u5165\u6a21\u578b\u540d\u8fc7\u6ee4"

    .line 931
    .line 932
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object p1

    .line 936
    move-object v6, p1

    .line 937
    check-cast v6, Ljava/lang/String;

    .line 938
    .line 939
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object p1

    .line 943
    sget-object p2, Li0/l;->a:Li0/e;

    .line 944
    .line 945
    if-ne p1, p2, :cond_1d

    .line 946
    .line 947
    new-instance p1, Lwb/ti;

    .line 948
    .line 949
    const/16 p2, 0x1c

    .line 950
    .line 951
    invoke-direct {p1, v0, p2}, Lwb/ti;-><init>(Li0/a1;I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v9, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 955
    .line 956
    .line 957
    :cond_1d
    move-object v8, p1

    .line 958
    check-cast v8, Lfg/l;

    .line 959
    .line 960
    const/16 v10, 0x6036

    .line 961
    .line 962
    const/16 v11, 0x8

    .line 963
    .line 964
    const/4 v7, 0x0

    .line 965
    invoke-static/range {v4 .. v11}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 966
    .line 967
    .line 968
    goto :goto_13

    .line 969
    :cond_1e
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 970
    .line 971
    .line 972
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 973
    .line 974
    return-object p1

    .line 975
    :pswitch_d
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 976
    .line 977
    check-cast p1, Li0/h0;

    .line 978
    .line 979
    check-cast p2, Ljava/lang/Integer;

    .line 980
    .line 981
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 982
    .line 983
    .line 984
    move-result p2

    .line 985
    and-int/lit8 v4, p2, 0x3

    .line 986
    .line 987
    if-eq v4, v1, :cond_1f

    .line 988
    .line 989
    move v1, v3

    .line 990
    goto :goto_14

    .line 991
    :cond_1f
    move v1, v2

    .line 992
    :goto_14
    and-int/2addr p2, v3

    .line 993
    invoke-virtual {p1, p2, v1}, Li0/h0;->S(IZ)Z

    .line 994
    .line 995
    .line 996
    move-result p2

    .line 997
    if-eqz p2, :cond_20

    .line 998
    .line 999
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p2

    .line 1003
    check-cast p2, Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-static {p2, p1, v2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_15

    .line 1009
    :cond_20
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1010
    .line 1011
    .line 1012
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1013
    .line 1014
    return-object p1

    .line 1015
    :pswitch_e
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 1016
    .line 1017
    check-cast p1, Li0/h0;

    .line 1018
    .line 1019
    check-cast p2, Ljava/lang/Integer;

    .line 1020
    .line 1021
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1022
    .line 1023
    .line 1024
    move-result p2

    .line 1025
    and-int/lit8 v4, p2, 0x3

    .line 1026
    .line 1027
    if-eq v4, v1, :cond_21

    .line 1028
    .line 1029
    move v2, v3

    .line 1030
    :cond_21
    and-int/2addr p2, v3

    .line 1031
    invoke-virtual {p1, p2, v2}, Li0/h0;->S(IZ)Z

    .line 1032
    .line 1033
    .line 1034
    move-result p2

    .line 1035
    if-eqz p2, :cond_24

    .line 1036
    .line 1037
    const-string p2, "\u65b0\u589e\u56de\u590d"

    .line 1038
    .line 1039
    const-string v1, "\u6dfb\u52a0\u4e00\u6761\u6309\u987a\u5e8f\u53d1\u9001\u7684\u56de\u590d"

    .line 1040
    .line 1041
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v2

    .line 1045
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    if-nez v2, :cond_22

    .line 1050
    .line 1051
    sget-object v2, Li0/l;->a:Li0/e;

    .line 1052
    .line 1053
    if-ne v3, v2, :cond_23

    .line 1054
    .line 1055
    :cond_22
    new-instance v3, Lwb/bf;

    .line 1056
    .line 1057
    const/16 v2, 0x1d

    .line 1058
    .line 1059
    invoke-direct {v3, v0, v2}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {p1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_23
    check-cast v3, Lfg/a;

    .line 1066
    .line 1067
    const/16 v0, 0x36

    .line 1068
    .line 1069
    invoke-static {p2, v1, v3, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_16

    .line 1073
    :cond_24
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1074
    .line 1075
    .line 1076
    :goto_16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1077
    .line 1078
    return-object p1

    .line 1079
    :pswitch_f
    iget-object v0, p0, Lwb/nh;->h:Li0/a1;

    .line 1080
    .line 1081
    check-cast p1, Li0/h0;

    .line 1082
    .line 1083
    check-cast p2, Ljava/lang/Integer;

    .line 1084
    .line 1085
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1086
    .line 1087
    .line 1088
    move-result p2

    .line 1089
    and-int/lit8 v4, p2, 0x3

    .line 1090
    .line 1091
    if-eq v4, v1, :cond_25

    .line 1092
    .line 1093
    move v1, v3

    .line 1094
    goto :goto_17

    .line 1095
    :cond_25
    move v1, v2

    .line 1096
    :goto_17
    and-int/2addr p2, v3

    .line 1097
    invoke-virtual {p1, p2, v1}, Li0/h0;->S(IZ)Z

    .line 1098
    .line 1099
    .line 1100
    move-result p2

    .line 1101
    if-eqz p2, :cond_26

    .line 1102
    .line 1103
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object p2

    .line 1107
    check-cast p2, Ljava/lang/String;

    .line 1108
    .line 1109
    invoke-static {p2, p1, v2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1110
    .line 1111
    .line 1112
    goto :goto_18

    .line 1113
    :cond_26
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1114
    .line 1115
    .line 1116
    :goto_18
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1117
    .line 1118
    return-object p1

    .line 1119
    :pswitch_data_0
    .packed-switch 0x0
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
