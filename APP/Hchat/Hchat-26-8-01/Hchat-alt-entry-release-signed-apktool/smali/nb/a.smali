.class public final synthetic Lnb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lnb/a;->g:I

    iput-object p1, p0, Lnb/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p2, p0, Lnb/a;->g:I

    iput-object p1, p0, Lnb/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnb/c;Landroid/content/pm/PackageManager;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lnb/a;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lnb/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz8/d;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_3

    .line 24
    .line 25
    const-class v1, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v4, v3

    .line 57
    check-cast v4, Ljava/lang/reflect/Field;

    .line 58
    .line 59
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/reflect/Field;

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_6

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v2, v1

    .line 114
    check-cast v2, Ljava/lang/reflect/Field;

    .line 115
    .line 116
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_4

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-class v3, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_4

    .line 145
    .line 146
    :cond_5
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    return-object p1

    .line 151
    :pswitch_0
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lyg/b;

    .line 154
    .line 155
    check-cast p1, Ljava/lang/Throwable;

    .line 156
    .line 157
    const/4 p1, 0x0

    .line 158
    invoke-virtual {v0, p1}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 162
    .line 163
    return-object p1

    .line 164
    :pswitch_1
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lfb/d1;

    .line 167
    .line 168
    check-cast p1, Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance p1, Lwb/yt;

    .line 174
    .line 175
    invoke-direct {p1, v0}, Lwb/yt;-><init>(Lfb/d1;)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :pswitch_2
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroid/os/Parcelable;

    .line 182
    .line 183
    check-cast p1, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    const/4 v1, 0x0

    .line 189
    new-array v1, v1, [Ljava/lang/Object;

    .line 190
    .line 191
    invoke-static {p1, v0, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    instance-of v0, p1, Ljava/lang/String;

    .line 196
    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    check-cast p1, Ljava/lang/String;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_7
    const/4 p1, 0x0

    .line 203
    :goto_4
    return-object p1

    .line 204
    :pswitch_3
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lwb/cp;

    .line 207
    .line 208
    check-cast p1, Lwb/bp;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v0, v0, Lwb/cp;->d:Lfg/l;

    .line 214
    .line 215
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_4
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Lwb/ec;

    .line 224
    .line 225
    check-cast p1, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_8

    .line 232
    .line 233
    invoke-virtual {v0}, Lwb/ec;->invoke()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :cond_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 237
    .line 238
    return-object p1

    .line 239
    :pswitch_5
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Lwb/j;

    .line 242
    .line 243
    check-cast p1, Lwb/bp;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    check-cast v0, Lwb/i;

    .line 249
    .line 250
    iget-object v0, v0, Lwb/i;->a:Lwb/cp;

    .line 251
    .line 252
    iget-object v0, v0, Lwb/cp;->d:Lfg/l;

    .line 253
    .line 254
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_6
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Lw0/s;

    .line 263
    .line 264
    iget-object v1, v0, Lw0/s;->g:Ljava/lang/Object;

    .line 265
    .line 266
    monitor-enter v1

    .line 267
    :try_start_0
    iget-object v0, v0, Lw0/s;->i:Lw0/r;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v2, v0, Lw0/r;->b:Ljava/lang/Object;

    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    iget v3, v0, Lw0/r;->d:I

    .line 278
    .line 279
    iget-object v4, v0, Lw0/r;->c:Lf/b0;

    .line 280
    .line 281
    if-nez v4, :cond_9

    .line 282
    .line 283
    new-instance v4, Lf/b0;

    .line 284
    .line 285
    invoke-direct {v4}, Lf/b0;-><init>()V

    .line 286
    .line 287
    .line 288
    iput-object v4, v0, Lw0/r;->c:Lf/b0;

    .line 289
    .line 290
    iget-object v5, v0, Lw0/r;->f:Lf/k0;

    .line 291
    .line 292
    invoke-virtual {v5, v2, v4}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_9
    invoke-virtual {v0, p1, v3, v2, v4}, Lw0/r;->b(Ljava/lang/Object;ILjava/lang/Object;Lf/b0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    .line 297
    .line 298
    monitor-exit v1

    .line 299
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 300
    .line 301
    return-object p1

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    move-object p1, v0

    .line 304
    monitor-exit v1

    .line 305
    throw p1

    .line 306
    :pswitch_7
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Lw/j1;

    .line 309
    .line 310
    check-cast p1, Ljava/lang/Float;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    iget-object v1, v0, Lw/j1;->a:Li0/f1;

    .line 317
    .line 318
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    add-float/2addr v2, p1

    .line 323
    iget-object v0, v0, Lw/j1;->b:Li0/f1;

    .line 324
    .line 325
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    cmpl-float v3, v2, v3

    .line 330
    .line 331
    if-lez v3, :cond_a

    .line 332
    .line 333
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    sub-float/2addr p1, v0

    .line 342
    goto :goto_5

    .line 343
    :cond_a
    const/4 v0, 0x0

    .line 344
    cmpg-float v0, v2, v0

    .line 345
    .line 346
    if-gez v0, :cond_b

    .line 347
    .line 348
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    neg-float p1, p1

    .line 353
    :cond_b
    :goto_5
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    add-float/2addr v0, p1

    .line 358
    invoke-virtual {v1, v0}, Li0/f1;->h(F)V

    .line 359
    .line 360
    .line 361
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    return-object p1

    .line 366
    :pswitch_8
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Lh0/l;

    .line 369
    .line 370
    check-cast p1, Lf2/y;

    .line 371
    .line 372
    sget-object v1, Lh0/h0;->c:Lf2/x;

    .line 373
    .line 374
    new-instance v2, Lh0/g0;

    .line 375
    .line 376
    sget-object v3, Lw/g0;->g:Lw/g0;

    .line 377
    .line 378
    invoke-interface {v0}, Lh0/l;->a()J

    .line 379
    .line 380
    .line 381
    move-result-wide v4

    .line 382
    sget-object v6, Lh0/f0;->h:Lh0/f0;

    .line 383
    .line 384
    const/4 v7, 0x1

    .line 385
    invoke-direct/range {v2 .. v7}, Lh0/g0;-><init>(Lw/g0;JLh0/f0;Z)V

    .line 386
    .line 387
    .line 388
    invoke-interface {p1, v1, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 392
    .line 393
    return-object p1

    .line 394
    :pswitch_9
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    check-cast p1, Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const/16 p1, 0xa

    .line 407
    .line 408
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 412
    .line 413
    return-object p1

    .line 414
    :pswitch_a
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v0, Ljava/util/Map;

    .line 417
    .line 418
    check-cast p1, Lv8/a;

    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    iget-object p1, p1, Lv8/a;->a:Ljava/lang/String;

    .line 424
    .line 425
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Ljava/lang/Long;

    .line 430
    .line 431
    return-object p1

    .line 432
    :pswitch_b
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Lv8/g;

    .line 435
    .line 436
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-wide v1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 442
    .line 443
    const-wide/16 v3, 0x0

    .line 444
    .line 445
    cmp-long v3, v1, v3

    .line 446
    .line 447
    if-lez v3, :cond_f

    .line 448
    .line 449
    iget-object v3, v0, Lv8/g;->d:Ljava/util/LinkedHashSet;

    .line 450
    .line 451
    iget-object v4, v0, Lv8/g;->c:Ljava/lang/String;

    .line 452
    .line 453
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-nez v1, :cond_f

    .line 462
    .line 463
    iget-wide v1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 464
    .line 465
    const-wide/16 v5, 0x1

    .line 466
    .line 467
    cmp-long v3, v5, v1

    .line 468
    .line 469
    if-gtz v3, :cond_c

    .line 470
    .line 471
    const-wide v5, 0x174876e800L

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    cmp-long v3, v1, v5

    .line 477
    .line 478
    if-gez v3, :cond_c

    .line 479
    .line 480
    const-wide/16 v5, 0x3e8

    .line 481
    .line 482
    mul-long/2addr v1, v5

    .line 483
    :cond_c
    iget-wide v5, v0, Lv8/g;->e:J

    .line 484
    .line 485
    const-wide/16 v7, 0x1388

    .line 486
    .line 487
    sub-long/2addr v5, v7

    .line 488
    cmp-long v0, v1, v5

    .line 489
    .line 490
    if-ltz v0, :cond_f

    .line 491
    .line 492
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_e

    .line 497
    .line 498
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-static {p1}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    invoke-interface {p1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_f

    .line 521
    .line 522
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    check-cast v0, Ljava/lang/String;

    .line 527
    .line 528
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_d

    .line 533
    .line 534
    :cond_e
    const/4 p1, 0x1

    .line 535
    goto :goto_6

    .line 536
    :cond_f
    const/4 p1, 0x0

    .line 537
    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    return-object p1

    .line 542
    :pswitch_c
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, Lv0/d;

    .line 545
    .line 546
    iget-object v0, v0, Lv0/d;->i:Lv0/f;

    .line 547
    .line 548
    if-eqz v0, :cond_10

    .line 549
    .line 550
    invoke-interface {v0, p1}, Lv0/f;->a(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result p1

    .line 554
    goto :goto_7

    .line 555
    :cond_10
    const/4 p1, 0x1

    .line 556
    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    return-object p1

    .line 561
    :pswitch_d
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, Lf2/y;

    .line 564
    .line 565
    check-cast p1, Lz0/f;

    .line 566
    .line 567
    iget-object p1, p1, Lz0/f;->a:Landroid/view/autofill/AutofillValue;

    .line 568
    .line 569
    invoke-virtual {p1}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-eqz v1, :cond_11

    .line 574
    .line 575
    invoke-virtual {p1}, Landroid/view/autofill/AutofillValue;->getToggleValue()Z

    .line 576
    .line 577
    .line 578
    move-result p1

    .line 579
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    goto :goto_8

    .line 584
    :cond_11
    const/4 p1, 0x0

    .line 585
    :goto_8
    if-eqz p1, :cond_13

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 588
    .line 589
    .line 590
    move-result p1

    .line 591
    if-eqz p1, :cond_12

    .line 592
    .line 593
    sget-object p1, Lh2/a;->g:Lh2/a;

    .line 594
    .line 595
    goto :goto_9

    .line 596
    :cond_12
    sget-object p1, Lh2/a;->h:Lh2/a;

    .line 597
    .line 598
    :goto_9
    invoke-static {v0, p1}, Lf2/w;->e(Lf2/y;Lh2/a;)V

    .line 599
    .line 600
    .line 601
    const/4 p1, 0x1

    .line 602
    goto :goto_a

    .line 603
    :cond_13
    const/4 p1, 0x0

    .line 604
    :goto_a
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    return-object p1

    .line 609
    :pswitch_e
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v0, Lth/i;

    .line 612
    .line 613
    check-cast p1, Lf1/d0;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    const/4 v1, 0x1

    .line 619
    invoke-interface {p1, v1}, Lf1/d0;->r(Z)V

    .line 620
    .line 621
    .line 622
    iget-object v0, v0, Lth/i;->B:Lvh/f;

    .line 623
    .line 624
    iget-object v0, v0, Lvh/f;->g:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v0, Lvh/e;

    .line 627
    .line 628
    invoke-interface {p1, v0}, Lf1/d0;->Q0(Lf1/r0;)V

    .line 629
    .line 630
    .line 631
    invoke-interface {p1, v1}, Lf1/d0;->Y(I)V

    .line 632
    .line 633
    .line 634
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 635
    .line 636
    return-object p1

    .line 637
    :pswitch_f
    const-string v0, "(this Map)"

    .line 638
    .line 639
    iget-object v1, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v1, Lp0/b;

    .line 642
    .line 643
    check-cast p1, Ljava/util/Map$Entry;

    .line 644
    .line 645
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    new-instance v2, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    if-ne v3, v1, :cond_14

    .line 658
    .line 659
    move-object v3, v0

    .line 660
    goto :goto_b

    .line 661
    :cond_14
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    :goto_b
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    const/16 v3, 0x3d

    .line 669
    .line 670
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    if-ne p1, v1, :cond_15

    .line 678
    .line 679
    goto :goto_c

    .line 680
    :cond_15
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    :goto_c
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object p1

    .line 691
    return-object p1

    .line 692
    :pswitch_10
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, Ltf/a;

    .line 695
    .line 696
    if-ne p1, v0, :cond_16

    .line 697
    .line 698
    const-string p1, "(this Collection)"

    .line 699
    .line 700
    goto :goto_d

    .line 701
    :cond_16
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    :goto_d
    return-object p1

    .line 706
    :pswitch_11
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, Lsh/e2;

    .line 709
    .line 710
    check-cast p1, Li/j;

    .line 711
    .line 712
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    iget-object p1, p1, Li/j;->e:Li0/j1;

    .line 716
    .line 717
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object p1

    .line 721
    check-cast p1, Ljava/lang/Number;

    .line 722
    .line 723
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 724
    .line 725
    .line 726
    move-result p1

    .line 727
    invoke-virtual {v0, p1}, Lsh/e2;->b(F)V

    .line 728
    .line 729
    .line 730
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 731
    .line 732
    return-object p1

    .line 733
    :pswitch_12
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v0, Lf1/r0;

    .line 736
    .line 737
    check-cast p1, Lf1/d0;

    .line 738
    .line 739
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    invoke-interface {p1, v0}, Lf1/d0;->Q0(Lf1/r0;)V

    .line 743
    .line 744
    .line 745
    const/4 v0, 0x1

    .line 746
    invoke-interface {p1, v0}, Lf1/d0;->r(Z)V

    .line 747
    .line 748
    .line 749
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 750
    .line 751
    return-object p1

    .line 752
    :pswitch_13
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Ls3/e;

    .line 755
    .line 756
    check-cast p1, Lr3/e;

    .line 757
    .line 758
    iget-object v0, v0, Ls3/e;->a:Li0/j1;

    .line 759
    .line 760
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 761
    .line 762
    .line 763
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 764
    .line 765
    return-object p1

    .line 766
    :pswitch_14
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, Lv0/f;

    .line 769
    .line 770
    if-eqz v0, :cond_17

    .line 771
    .line 772
    invoke-interface {v0, p1}, Lv0/f;->a(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result p1

    .line 776
    goto :goto_e

    .line 777
    :cond_17
    const/4 p1, 0x1

    .line 778
    :goto_e
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 779
    .line 780
    .line 781
    move-result-object p1

    .line 782
    return-object p1

    .line 783
    :pswitch_15
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v0, Ls/h0;

    .line 786
    .line 787
    check-cast p1, Li0/a0;

    .line 788
    .line 789
    new-instance p1, Lb0/m;

    .line 790
    .line 791
    const/4 v1, 0x5

    .line 792
    invoke-direct {p1, v0, v1}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 793
    .line 794
    .line 795
    return-object p1

    .line 796
    :pswitch_16
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v0, Ls/a0;

    .line 799
    .line 800
    check-cast p1, Li0/a0;

    .line 801
    .line 802
    new-instance p1, Lb0/m;

    .line 803
    .line 804
    const/4 v1, 0x3

    .line 805
    invoke-direct {p1, v0, v1}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 806
    .line 807
    .line 808
    return-object p1

    .line 809
    :pswitch_17
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, Lrb/d;

    .line 812
    .line 813
    check-cast p1, Lrb/d;

    .line 814
    .line 815
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    iget-object p1, p1, Lrb/d;->a:Ljava/lang/String;

    .line 819
    .line 820
    iget-object v0, v0, Lrb/d;->a:Ljava/lang/String;

    .line 821
    .line 822
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result p1

    .line 826
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    return-object p1

    .line 831
    :pswitch_18
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, Lr9/k;

    .line 834
    .line 835
    check-cast p1, Log/f;

    .line 836
    .line 837
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    check-cast p1, Log/i;

    .line 841
    .line 842
    iget-object v1, p1, Log/i;->c:Log/h;

    .line 843
    .line 844
    const/4 v2, 0x1

    .line 845
    invoke-virtual {v1, v2}, Log/h;->a(I)Log/e;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    if-eqz v2, :cond_18

    .line 850
    .line 851
    iget-object v1, v2, Log/e;->a:Ljava/lang/String;

    .line 852
    .line 853
    goto :goto_10

    .line 854
    :cond_18
    const/4 v2, 0x2

    .line 855
    invoke-virtual {v1, v2}, Log/h;->a(I)Log/e;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    if-eqz v1, :cond_19

    .line 860
    .line 861
    iget-object v1, v1, Log/e;->a:Ljava/lang/String;

    .line 862
    .line 863
    goto :goto_f

    .line 864
    :cond_19
    const/4 v1, 0x0

    .line 865
    :goto_f
    if-nez v1, :cond_1a

    .line 866
    .line 867
    const-string v1, ""

    .line 868
    .line 869
    :cond_1a
    :goto_10
    invoke-virtual {v0, v1}, Lr9/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    check-cast v0, Ljava/lang/String;

    .line 874
    .line 875
    if-eqz v0, :cond_1b

    .line 876
    .line 877
    goto :goto_11

    .line 878
    :cond_1b
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    :goto_11
    return-object v0

    .line 883
    :pswitch_19
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v0, Lr/z;

    .line 886
    .line 887
    check-cast p1, Ljava/lang/Float;

    .line 888
    .line 889
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 890
    .line 891
    .line 892
    move-result p1

    .line 893
    neg-float p1, p1

    .line 894
    const/4 v1, 0x0

    .line 895
    cmpg-float v2, p1, v1

    .line 896
    .line 897
    if-gez v2, :cond_1c

    .line 898
    .line 899
    invoke-virtual {v0}, Lr/z;->d()Z

    .line 900
    .line 901
    .line 902
    move-result v2

    .line 903
    if-eqz v2, :cond_1d

    .line 904
    .line 905
    :cond_1c
    cmpl-float v2, p1, v1

    .line 906
    .line 907
    if-lez v2, :cond_1e

    .line 908
    .line 909
    invoke-virtual {v0}, Lr/z;->c()Z

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    if-nez v2, :cond_1e

    .line 914
    .line 915
    :cond_1d
    move p1, v1

    .line 916
    goto/16 :goto_15

    .line 917
    .line 918
    :cond_1e
    iget v2, v0, Lr/z;->h:F

    .line 919
    .line 920
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 921
    .line 922
    .line 923
    move-result v2

    .line 924
    const/high16 v3, 0x3f000000    # 0.5f

    .line 925
    .line 926
    cmpg-float v2, v2, v3

    .line 927
    .line 928
    if-gtz v2, :cond_1f

    .line 929
    .line 930
    goto :goto_12

    .line 931
    :cond_1f
    const-string v2, "entered drag with non-zero pending scroll"

    .line 932
    .line 933
    invoke-static {v2}, Lo/b;->c(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    :goto_12
    const/4 v2, 0x1

    .line 937
    iput-boolean v2, v0, Lr/z;->d:Z

    .line 938
    .line 939
    iget v4, v0, Lr/z;->h:F

    .line 940
    .line 941
    add-float/2addr v4, p1

    .line 942
    iput v4, v0, Lr/z;->h:F

    .line 943
    .line 944
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 945
    .line 946
    .line 947
    move-result v4

    .line 948
    cmpl-float v4, v4, v3

    .line 949
    .line 950
    if-lez v4, :cond_24

    .line 951
    .line 952
    iget v4, v0, Lr/z;->h:F

    .line 953
    .line 954
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 955
    .line 956
    .line 957
    move-result v5

    .line 958
    iget-object v6, v0, Lr/z;->f:Li0/j1;

    .line 959
    .line 960
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v6

    .line 964
    check-cast v6, Lr/p;

    .line 965
    .line 966
    iget-boolean v7, v0, Lr/z;->b:Z

    .line 967
    .line 968
    xor-int/2addr v7, v2

    .line 969
    invoke-virtual {v6, v5, v7}, Lr/p;->a(IZ)Lr/p;

    .line 970
    .line 971
    .line 972
    move-result-object v6

    .line 973
    if-eqz v6, :cond_21

    .line 974
    .line 975
    iget-object v7, v0, Lr/z;->c:Lr/p;

    .line 976
    .line 977
    if-eqz v7, :cond_21

    .line 978
    .line 979
    invoke-virtual {v7, v5, v2}, Lr/p;->a(IZ)Lr/p;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    if-eqz v5, :cond_20

    .line 984
    .line 985
    iput-object v5, v0, Lr/z;->c:Lr/p;

    .line 986
    .line 987
    goto :goto_13

    .line 988
    :cond_20
    const/4 v6, 0x0

    .line 989
    :cond_21
    :goto_13
    if-eqz v6, :cond_22

    .line 990
    .line 991
    iget-boolean v5, v0, Lr/z;->b:Z

    .line 992
    .line 993
    invoke-virtual {v0, v6, v5, v2}, Lr/z;->g(Lr/p;ZZ)V

    .line 994
    .line 995
    .line 996
    iget-object v2, v0, Lr/z;->w:Li0/a1;

    .line 997
    .line 998
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 999
    .line 1000
    invoke-interface {v2, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    iget v2, v0, Lr/z;->h:F

    .line 1004
    .line 1005
    sub-float/2addr v4, v2

    .line 1006
    invoke-virtual {v0, v4, v6}, Lr/z;->k(FLr/p;)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_14

    .line 1010
    :cond_22
    iget-object v2, v0, Lr/z;->l:Lx1/f0;

    .line 1011
    .line 1012
    if-eqz v2, :cond_23

    .line 1013
    .line 1014
    invoke-virtual {v2}, Lx1/f0;->k()V

    .line 1015
    .line 1016
    .line 1017
    :cond_23
    iget v2, v0, Lr/z;->h:F

    .line 1018
    .line 1019
    sub-float/2addr v4, v2

    .line 1020
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    invoke-virtual {v0, v4, v2}, Lr/z;->k(FLr/p;)V

    .line 1025
    .line 1026
    .line 1027
    :cond_24
    :goto_14
    iget v2, v0, Lr/z;->h:F

    .line 1028
    .line 1029
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1030
    .line 1031
    .line 1032
    move-result v2

    .line 1033
    cmpg-float v2, v2, v3

    .line 1034
    .line 1035
    if-gtz v2, :cond_25

    .line 1036
    .line 1037
    goto :goto_15

    .line 1038
    :cond_25
    iget v2, v0, Lr/z;->h:F

    .line 1039
    .line 1040
    sub-float/2addr p1, v2

    .line 1041
    iput v1, v0, Lr/z;->h:F

    .line 1042
    .line 1043
    :goto_15
    neg-float p1, p1

    .line 1044
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1045
    .line 1046
    .line 1047
    move-result-object p1

    .line 1048
    return-object p1

    .line 1049
    :pswitch_1a
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v0, Lqb/k;

    .line 1052
    .line 1053
    move-object v1, p1

    .line 1054
    check-cast v1, Ljava/lang/String;

    .line 1055
    .line 1056
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    iget-object v0, v0, Lqb/k;->a:Lr8/g;

    .line 1060
    .line 1061
    invoke-static {v1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result p1

    .line 1065
    if-eqz p1, :cond_26

    .line 1066
    .line 1067
    goto/16 :goto_26

    .line 1068
    .line 1069
    :cond_26
    const-class v2, Ljava/lang/String;

    .line 1070
    .line 1071
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result p1

    .line 1075
    const/4 v3, 0x0

    .line 1076
    const/4 v4, 0x0

    .line 1077
    if-eqz p1, :cond_27

    .line 1078
    .line 1079
    :goto_16
    move-object v7, v4

    .line 1080
    goto/16 :goto_1c

    .line 1081
    .line 1082
    :cond_27
    const-string p1, "com.tencent.mm.vfs.w6"

    .line 1083
    .line 1084
    const-string v5, "com.tencent.mm.vfs.p6"

    .line 1085
    .line 1086
    filled-new-array {p1, v5}, [Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v5

    .line 1090
    move p1, v3

    .line 1091
    :goto_17
    const/4 v6, 0x2

    .line 1092
    if-lt p1, v6, :cond_28

    .line 1093
    .line 1094
    goto :goto_16

    .line 1095
    :cond_28
    aget-object v7, v5, p1

    .line 1096
    .line 1097
    iget-object v8, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1098
    .line 1099
    invoke-static {v7, v8}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v7

    .line 1103
    if-eqz v7, :cond_39

    .line 1104
    .line 1105
    const-string v8, "E"

    .line 1106
    .line 1107
    const-string v9, "F"

    .line 1108
    .line 1109
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v8

    .line 1113
    move v9, v3

    .line 1114
    :goto_18
    if-lt v9, v6, :cond_2e

    .line 1115
    .line 1116
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v6

    .line 1120
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v6

    .line 1124
    :cond_29
    :goto_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v7

    .line 1128
    if-eqz v7, :cond_39

    .line 1129
    .line 1130
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v7

    .line 1134
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1135
    .line 1136
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1137
    .line 1138
    .line 1139
    move-result v8

    .line 1140
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v8

    .line 1144
    if-nez v8, :cond_2a

    .line 1145
    .line 1146
    goto :goto_19

    .line 1147
    :cond_2a
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v8

    .line 1151
    const-class v9, Ljava/io/InputStream;

    .line 1152
    .line 1153
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v8

    .line 1157
    if-nez v8, :cond_2b

    .line 1158
    .line 1159
    goto :goto_19

    .line 1160
    :cond_2b
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v8

    .line 1164
    array-length v9, v8

    .line 1165
    const/4 v10, 0x1

    .line 1166
    if-ne v9, v10, :cond_29

    .line 1167
    .line 1168
    aget-object v8, v8, v3

    .line 1169
    .line 1170
    invoke-static {v8, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v8

    .line 1174
    if-nez v8, :cond_2c

    .line 1175
    .line 1176
    goto :goto_19

    .line 1177
    :cond_2c
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v8

    .line 1181
    invoke-static {v7, v4, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v7

    .line 1185
    instance-of v8, v7, Ljava/io/InputStream;

    .line 1186
    .line 1187
    if-eqz v8, :cond_2d

    .line 1188
    .line 1189
    check-cast v7, Ljava/io/InputStream;

    .line 1190
    .line 1191
    goto :goto_1a

    .line 1192
    :cond_2d
    move-object v7, v4

    .line 1193
    :goto_1a
    if-eqz v7, :cond_29

    .line 1194
    .line 1195
    goto :goto_1c

    .line 1196
    :cond_2e
    aget-object v10, v8, v9

    .line 1197
    .line 1198
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v11

    .line 1202
    invoke-static {v7, v10, v11}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v10

    .line 1206
    if-eqz v10, :cond_38

    .line 1207
    .line 1208
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v11

    .line 1212
    invoke-static {v10, v4, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v10

    .line 1216
    instance-of v11, v10, Ljava/io/InputStream;

    .line 1217
    .line 1218
    if-eqz v11, :cond_2f

    .line 1219
    .line 1220
    check-cast v10, Ljava/io/InputStream;

    .line 1221
    .line 1222
    goto :goto_1b

    .line 1223
    :cond_2f
    move-object v10, v4

    .line 1224
    :goto_1b
    if-eqz v10, :cond_38

    .line 1225
    .line 1226
    move-object v7, v10

    .line 1227
    :goto_1c
    if-eqz v7, :cond_37

    .line 1228
    .line 1229
    new-instance p1, Ljava/io/File;

    .line 1230
    .line 1231
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object p1

    .line 1238
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v2

    .line 1242
    if-nez v2, :cond_30

    .line 1243
    .line 1244
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    const/16 v5, 0x8

    .line 1249
    .line 1250
    if-gt v2, v5, :cond_30

    .line 1251
    .line 1252
    goto :goto_1d

    .line 1253
    :cond_30
    move-object p1, v4

    .line 1254
    :goto_1d
    if-eqz p1, :cond_31

    .line 1255
    .line 1256
    goto :goto_1e

    .line 1257
    :cond_31
    const-string p1, "silk"

    .line 1258
    .line 1259
    :goto_1e
    new-instance v2, Ljava/io/File;

    .line 1260
    .line 1261
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 1262
    .line 1263
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    const-string v5, "Hchat_fav_voice"

    .line 1268
    .line 1269
    invoke-direct {v2, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v0

    .line 1276
    if-nez v0, :cond_32

    .line 1277
    .line 1278
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v0

    .line 1282
    if-nez v0, :cond_32

    .line 1283
    .line 1284
    goto/16 :goto_25

    .line 1285
    .line 1286
    :cond_32
    new-instance v0, Ljava/io/File;

    .line 1287
    .line 1288
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1289
    .line 1290
    .line 1291
    move-result v1

    .line 1292
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    const-string v5, "fav_"

    .line 1297
    .line 1298
    const-string v6, "."

    .line 1299
    .line 1300
    invoke-static {v5, v1, v6, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object p1

    .line 1304
    invoke-direct {v0, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1305
    .line 1306
    .line 1307
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 1308
    .line 1309
    invoke-direct {p1, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1310
    .line 1311
    .line 1312
    const/16 v1, 0x2000

    .line 1313
    .line 1314
    :try_start_2
    new-array v1, v1, [B

    .line 1315
    .line 1316
    :goto_1f
    invoke-virtual {v7, v1}, Ljava/io/InputStream;->read([B)I

    .line 1317
    .line 1318
    .line 1319
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1320
    if-gtz v2, :cond_35

    .line 1321
    .line 1322
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1323
    .line 1324
    .line 1325
    :try_start_4
    invoke-interface {v7}, Ljava/io/Closeable;->close()V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 1329
    .line 1330
    .line 1331
    move-result p1

    .line 1332
    if-eqz p1, :cond_33

    .line 1333
    .line 1334
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 1335
    .line 1336
    .line 1337
    move-result-wide v1

    .line 1338
    const-wide/16 v5, 0x0

    .line 1339
    .line 1340
    cmp-long p1, v1, v5

    .line 1341
    .line 1342
    if-lez p1, :cond_33

    .line 1343
    .line 1344
    goto :goto_20

    .line 1345
    :catchall_1
    move-exception v0

    .line 1346
    move-object p1, v0

    .line 1347
    goto :goto_22

    .line 1348
    :cond_33
    move-object v0, v4

    .line 1349
    :goto_20
    if-eqz v0, :cond_34

    .line 1350
    .line 1351
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1352
    .line 1353
    .line 1354
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1355
    goto :goto_23

    .line 1356
    :cond_34
    move-object p1, v4

    .line 1357
    goto :goto_23

    .line 1358
    :catchall_2
    move-exception v0

    .line 1359
    move-object p1, v0

    .line 1360
    goto :goto_21

    .line 1361
    :cond_35
    :try_start_5
    invoke-virtual {p1, v1, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1362
    .line 1363
    .line 1364
    goto :goto_1f

    .line 1365
    :catchall_3
    move-exception v0

    .line 1366
    move-object v1, v0

    .line 1367
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1368
    :catchall_4
    move-exception v0

    .line 1369
    :try_start_7
    invoke-static {p1, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1370
    .line 1371
    .line 1372
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1373
    :goto_21
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 1374
    :catchall_5
    move-exception v0

    .line 1375
    :try_start_9
    invoke-static {v7, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1376
    .line 1377
    .line 1378
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1379
    :goto_22
    new-instance v0, Lsf/f;

    .line 1380
    .line 1381
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1382
    .line 1383
    .line 1384
    move-object p1, v0

    .line 1385
    :goto_23
    nop

    .line 1386
    instance-of v0, p1, Lsf/f;

    .line 1387
    .line 1388
    if-eqz v0, :cond_36

    .line 1389
    .line 1390
    goto :goto_24

    .line 1391
    :cond_36
    move-object v4, p1

    .line 1392
    :goto_24
    move-object v1, v4

    .line 1393
    check-cast v1, Ljava/lang/String;

    .line 1394
    .line 1395
    goto :goto_26

    .line 1396
    :cond_37
    :goto_25
    move-object v1, v4

    .line 1397
    :goto_26
    return-object v1

    .line 1398
    :cond_38
    add-int/lit8 v9, v9, 0x1

    .line 1399
    .line 1400
    goto/16 :goto_18

    .line 1401
    .line 1402
    :cond_39
    add-int/lit8 p1, p1, 0x1

    .line 1403
    .line 1404
    goto/16 :goto_17

    .line 1405
    .line 1406
    :pswitch_1b
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v0, Log/h;

    .line 1409
    .line 1410
    check-cast p1, Ljava/lang/Integer;

    .line 1411
    .line 1412
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1413
    .line 1414
    .line 1415
    move-result p1

    .line 1416
    invoke-virtual {v0, p1}, Log/h;->a(I)Log/e;

    .line 1417
    .line 1418
    .line 1419
    move-result-object p1

    .line 1420
    return-object p1

    .line 1421
    :pswitch_1c
    iget-object v0, p0, Lnb/a;->h:Ljava/lang/Object;

    .line 1422
    .line 1423
    check-cast v0, Landroid/content/pm/PackageManager;

    .line 1424
    .line 1425
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 1426
    .line 1427
    const-string v1, ""

    .line 1428
    .line 1429
    iget-object v2, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 1430
    .line 1431
    const/4 v3, 0x0

    .line 1432
    if-eqz v2, :cond_43

    .line 1433
    .line 1434
    iget-object v4, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 1435
    .line 1436
    if-eqz v4, :cond_3a

    .line 1437
    .line 1438
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v4

    .line 1446
    goto :goto_27

    .line 1447
    :cond_3a
    move-object v4, v3

    .line 1448
    :goto_27
    if-nez v4, :cond_3b

    .line 1449
    .line 1450
    move-object v4, v1

    .line 1451
    :cond_3b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1452
    .line 1453
    .line 1454
    move-result v5

    .line 1455
    if-nez v5, :cond_3c

    .line 1456
    .line 1457
    goto :goto_2d

    .line 1458
    :cond_3c
    iget-boolean v5, v2, Landroid/content/pm/ServiceInfo;->enabled:Z

    .line 1459
    .line 1460
    if-eqz v5, :cond_43

    .line 1461
    .line 1462
    iget-boolean v5, v2, Landroid/content/pm/ServiceInfo;->exported:Z

    .line 1463
    .line 1464
    if-eqz v5, :cond_43

    .line 1465
    .line 1466
    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1467
    .line 1468
    if-eqz v2, :cond_3d

    .line 1469
    .line 1470
    iget-boolean v2, v2, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 1471
    .line 1472
    xor-int/lit8 v2, v2, 0x1

    .line 1473
    .line 1474
    goto :goto_28

    .line 1475
    :cond_3d
    const/4 v2, 0x0

    .line 1476
    :goto_28
    if-eqz v2, :cond_3e

    .line 1477
    .line 1478
    goto :goto_2d

    .line 1479
    :cond_3e
    :try_start_a
    invoke-virtual {p1, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 1480
    .line 1481
    .line 1482
    move-result-object p1

    .line 1483
    if-eqz p1, :cond_3f

    .line 1484
    .line 1485
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object p1

    .line 1489
    if-eqz p1, :cond_3f

    .line 1490
    .line 1491
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1492
    .line 1493
    .line 1494
    move-result-object p1

    .line 1495
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1499
    goto :goto_2a

    .line 1500
    :catchall_6
    move-exception v0

    .line 1501
    move-object p1, v0

    .line 1502
    goto :goto_29

    .line 1503
    :cond_3f
    move-object p1, v3

    .line 1504
    goto :goto_2a

    .line 1505
    :goto_29
    new-instance v0, Lsf/f;

    .line 1506
    .line 1507
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1508
    .line 1509
    .line 1510
    move-object p1, v0

    .line 1511
    :goto_2a
    nop

    .line 1512
    instance-of v0, p1, Lsf/f;

    .line 1513
    .line 1514
    if-eqz v0, :cond_40

    .line 1515
    .line 1516
    goto :goto_2b

    .line 1517
    :cond_40
    move-object v3, p1

    .line 1518
    :goto_2b
    check-cast v3, Ljava/lang/String;

    .line 1519
    .line 1520
    if-nez v3, :cond_41

    .line 1521
    .line 1522
    goto :goto_2c

    .line 1523
    :cond_41
    move-object v1, v3

    .line 1524
    :goto_2c
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1525
    .line 1526
    .line 1527
    move-result p1

    .line 1528
    if-eqz p1, :cond_42

    .line 1529
    .line 1530
    move-object v1, v4

    .line 1531
    :cond_42
    new-instance v3, Lnb/d;

    .line 1532
    .line 1533
    invoke-direct {v3, v4, v1}, Lnb/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1534
    .line 1535
    .line 1536
    :cond_43
    :goto_2d
    return-object v3

    .line 1537
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
