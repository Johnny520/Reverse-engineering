.class public final synthetic Lwb/l7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Ls1/x;)V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    iput v0, p0, Lwb/l7;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lwb/l7;->g:I

    iput-object p1, p0, Lwb/l7;->h:Ljava/lang/Object;

    iput-object p3, p0, Lwb/l7;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/l7;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/l;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ls1/x;

    .line 13
    .line 14
    check-cast p1, Le1/b;

    .line 15
    .line 16
    iget-wide v2, p1, Le1/b;->a:J

    .line 17
    .line 18
    const/16 p1, 0x20

    .line 19
    .line 20
    shr-long/2addr v2, p1

    .line 21
    long-to-int v2, v2

    .line 22
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    check-cast v1, Ls1/l0;

    .line 27
    .line 28
    iget-wide v3, v1, Ls1/l0;->E:J

    .line 29
    .line 30
    shr-long/2addr v3, p1

    .line 31
    long-to-int p1, v3

    .line 32
    int-to-float p1, p1

    .line 33
    div-float/2addr v2, p1

    .line 34
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Li0/a1;

    .line 51
    .line 52
    check-cast p1, Lr/h;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v2, 0x0

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    add-int/lit8 v4, v2, 0x1

    .line 73
    .line 74
    if-ltz v2, :cond_0

    .line 75
    .line 76
    check-cast v3, Lsf/e;

    .line 77
    .line 78
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    new-instance v6, Lwb/tu;

    .line 83
    .line 84
    invoke-direct {v6, v3, v2, v1}, Lwb/tu;-><init>(Lsf/e;ILi0/a1;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ls0/d;

    .line 88
    .line 89
    const v3, 0x45f68e8

    .line 90
    .line 91
    .line 92
    const/4 v7, 0x1

    .line 93
    invoke-direct {v2, v3, v6, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    invoke-static {p1, v5, v2, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 98
    .line 99
    .line 100
    move v2, v4

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    invoke-static {}, La/a;->Q0()V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    throw p1

    .line 107
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_1
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lu2/c;

    .line 113
    .line 114
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lfg/a;

    .line 117
    .line 118
    check-cast p1, Le1/b;

    .line 119
    .line 120
    iget-wide v2, p1, Le1/b;->a:J

    .line 121
    .line 122
    const/16 p1, 0x20

    .line 123
    .line 124
    shr-long/2addr v2, p1

    .line 125
    long-to-int p1, v2

    .line 126
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    const/16 v2, 0x26

    .line 131
    .line 132
    int-to-float v2, v2

    .line 133
    invoke-interface {v0, v2}, Lu2/c;->x0(F)F

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    cmpl-float p1, p1, v0

    .line 138
    .line 139
    if-lez p1, :cond_2

    .line 140
    .line 141
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 145
    .line 146
    return-object p1

    .line 147
    :pswitch_2
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lfg/p;

    .line 150
    .line 151
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Lfb/r0;

    .line 154
    .line 155
    check-cast p1, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v1, v1, Lfb/r0;->a:Ljava/lang/String;

    .line 161
    .line 162
    invoke-interface {v0, v1, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :pswitch_3
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Landroid/content/Context;

    .line 169
    .line 170
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Lfb/q1;

    .line 173
    .line 174
    check-cast p1, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const-string v2, "clipboard"

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    instance-of v3, v2, Landroid/content/ClipboardManager;

    .line 186
    .line 187
    if-eqz v3, :cond_3

    .line 188
    .line 189
    check-cast v2, Landroid/content/ClipboardManager;

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_3
    const/4 v2, 0x0

    .line 193
    :goto_2
    if-eqz v2, :cond_4

    .line 194
    .line 195
    iget-object v1, v1, Lfb/q1;->c:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v2, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 202
    .line 203
    .line 204
    :cond_4
    const-string p1, "\u5df2\u590d\u5236"

    .line 205
    .line 206
    const/4 v1, 0x0

    .line 207
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :pswitch_4
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lwb/me;

    .line 219
    .line 220
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 223
    .line 224
    check-cast p1, Ljava/util/List;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 230
    .line 231
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-eqz v3, :cond_5

    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    check-cast v3, Lwb/jv;

    .line 249
    .line 250
    iget-object v3, v3, Lwb/jv;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_5
    invoke-static {v1, v2}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {v0, p1}, Lwb/me;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :pswitch_5
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Lwb/qh;

    .line 268
    .line 269
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v1, Lwb/gh;

    .line 272
    .line 273
    check-cast p1, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-nez p1, :cond_6

    .line 280
    .line 281
    invoke-virtual {v0}, Lwb/qh;->invoke()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_6
    invoke-virtual {v1}, Lwb/gh;->invoke()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 289
    .line 290
    return-object p1

    .line 291
    :pswitch_6
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lwb/l4;

    .line 294
    .line 295
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, Li0/a1;

    .line 298
    .line 299
    check-cast p1, Ljava/util/List;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    check-cast v0, Lwb/i4;

    .line 305
    .line 306
    iget-object v2, v0, Lwb/i4;->a:Lwb/v0;

    .line 307
    .line 308
    iget-object v2, v2, Lwb/v0;->e:Lfg/l;

    .line 309
    .line 310
    new-instance v3, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_7

    .line 328
    .line 329
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    check-cast v4, Lwb/s0;

    .line 334
    .line 335
    iget-object v4, v4, Lwb/s0;->a:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_7
    invoke-static {v3}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-interface {v2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    iget-boolean p1, v0, Lwb/i4;->b:Z

    .line 349
    .line 350
    if-eqz p1, :cond_8

    .line 351
    .line 352
    sget-object p1, Lwb/h4;->c:Lwb/h4;

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_8
    sget-object p1, Lwb/h4;->b:Lwb/h4;

    .line 356
    .line 357
    :goto_6
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :pswitch_7
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Lfg/p;

    .line 365
    .line 366
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, Lx8/b;

    .line 369
    .line 370
    check-cast p1, Ljava/lang/Boolean;

    .line 371
    .line 372
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 373
    .line 374
    .line 375
    invoke-interface {v0, v1, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :pswitch_8
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Laa/h;

    .line 383
    .line 384
    iget-object v0, v0, Laa/h;->a:Ljava/lang/String;

    .line 385
    .line 386
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v1, Li0/a1;

    .line 389
    .line 390
    check-cast p1, Ljava/lang/Boolean;

    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_9

    .line 397
    .line 398
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    check-cast p1, Ljava/util/Set;

    .line 403
    .line 404
    invoke-static {p1, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    goto :goto_7

    .line 409
    :cond_9
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    check-cast p1, Ljava/util/Set;

    .line 414
    .line 415
    invoke-static {p1, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    :goto_7
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :pswitch_9
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v0, Lfg/p;

    .line 427
    .line 428
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Lv8/a;

    .line 431
    .line 432
    check-cast p1, Ljava/lang/Boolean;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 435
    .line 436
    .line 437
    invoke-interface {v0, v1, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :pswitch_a
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v0, Lwb/s0;

    .line 445
    .line 446
    iget-object v0, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 447
    .line 448
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v1, Li0/a1;

    .line 451
    .line 452
    check-cast p1, Ljava/lang/Boolean;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    if-eqz p1, :cond_a

    .line 459
    .line 460
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    check-cast p1, Ljava/util/Set;

    .line 465
    .line 466
    invoke-static {p1, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    goto :goto_8

    .line 471
    :cond_a
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    check-cast p1, Ljava/util/Set;

    .line 476
    .line 477
    invoke-static {p1, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    :goto_8
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_0

    .line 485
    .line 486
    :pswitch_b
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Lfg/p;

    .line 489
    .line 490
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v1, Le9/c;

    .line 493
    .line 494
    check-cast p1, Ljava/lang/Boolean;

    .line 495
    .line 496
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 497
    .line 498
    .line 499
    invoke-interface {v0, v1, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :pswitch_c
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v0, Lsf/j;

    .line 507
    .line 508
    iget-object v0, v0, Lsf/j;->g:Ljava/lang/Object;

    .line 509
    .line 510
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v1, Li0/a1;

    .line 513
    .line 514
    check-cast p1, Ljava/lang/Boolean;

    .line 515
    .line 516
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 517
    .line 518
    .line 519
    move-result p1

    .line 520
    if-eqz p1, :cond_b

    .line 521
    .line 522
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    check-cast p1, Ljava/util/Set;

    .line 527
    .line 528
    invoke-static {p1, v0}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    goto :goto_9

    .line 533
    :cond_b
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    check-cast p1, Ljava/util/Set;

    .line 538
    .line 539
    invoke-static {p1, v0}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    :goto_9
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_0

    .line 547
    .line 548
    :pswitch_d
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Landroid/content/Context;

    .line 551
    .line 552
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v1, Ljava/lang/String;

    .line 555
    .line 556
    check-cast p1, Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    if-eqz p1, :cond_c

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_c
    const-string v1, "\u7f13\u5b58\u5c06\u5728\u4e0b\u6b21\u542f\u52a8\u65f6\u7ee7\u7eed\u6e05\u7406"

    .line 566
    .line 567
    :goto_a
    const/4 p1, 0x0

    .line 568
    invoke-static {v0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_0

    .line 576
    .line 577
    :pswitch_e
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v0, Lj8/i;

    .line 580
    .line 581
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, Li0/a1;

    .line 584
    .line 585
    check-cast p1, Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    new-instance v2, Lwb/z2;

    .line 591
    .line 592
    invoke-direct {v2, v0, p1}, Lwb/z2;-><init>(Lj8/i;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    goto/16 :goto_0

    .line 599
    .line 600
    :pswitch_f
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, Lwb/z2;

    .line 603
    .line 604
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v1, Li0/a1;

    .line 607
    .line 608
    check-cast p1, Landroid/content/Context;

    .line 609
    .line 610
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    new-instance v2, Landroid/widget/VideoView;

    .line 614
    .line 615
    invoke-direct {v2, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    .line 616
    .line 617
    .line 618
    new-instance v3, Landroid/widget/MediaController;

    .line 619
    .line 620
    invoke-direct {v3, p1}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3, v2}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v2, v3}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V

    .line 627
    .line 628
    .line 629
    iget-object p1, v0, Lwb/z2;->b:Ljava/lang/String;

    .line 630
    .line 631
    invoke-virtual {v2, p1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    new-instance p1, Lwb/ag;

    .line 635
    .line 636
    invoke-direct {p1, v2}, Lwb/ag;-><init>(Landroid/widget/VideoView;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, p1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 640
    .line 641
    .line 642
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v2

    .line 646
    :pswitch_10
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lwb/s0;

    .line 649
    .line 650
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 653
    .line 654
    check-cast p1, Lwb/s0;

    .line 655
    .line 656
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    iget-object p1, p1, Lwb/s0;->a:Ljava/lang/String;

    .line 660
    .line 661
    if-nez v0, :cond_10

    .line 662
    .line 663
    if-eqz v1, :cond_d

    .line 664
    .line 665
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_d

    .line 670
    .line 671
    goto :goto_b

    .line 672
    :cond_d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-eqz v1, :cond_f

    .line 681
    .line 682
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, Ljava/lang/String;

    .line 687
    .line 688
    const/16 v2, 0x2f

    .line 689
    .line 690
    invoke-static {v1, v2}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v1

    .line 698
    if-eqz v1, :cond_e

    .line 699
    .line 700
    const/4 p1, 0x1

    .line 701
    goto :goto_c

    .line 702
    :cond_f
    :goto_b
    const/4 p1, 0x0

    .line 703
    goto :goto_c

    .line 704
    :cond_10
    iget-object v0, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 705
    .line 706
    invoke-static {v0, p1}, Lwb/ho;->M5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object p1

    .line 710
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result p1

    .line 714
    :goto_c
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    return-object p1

    .line 719
    :pswitch_11
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v0, Landroid/content/SharedPreferences;

    .line 722
    .line 723
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v1, Lfg/a;

    .line 726
    .line 727
    check-cast p1, Lr/h;

    .line 728
    .line 729
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    sget-object v2, Lwb/p0;->m:Ls0/d;

    .line 733
    .line 734
    const/4 v3, 0x0

    .line 735
    const/4 v4, 0x3

    .line 736
    invoke-static {p1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 737
    .line 738
    .line 739
    new-instance v2, Lwb/r6;

    .line 740
    .line 741
    const/16 v5, 0xc

    .line 742
    .line 743
    invoke-direct {v2, v0, v5}, Lwb/r6;-><init>(Landroid/content/SharedPreferences;I)V

    .line 744
    .line 745
    .line 746
    new-instance v0, Ls0/d;

    .line 747
    .line 748
    const v5, 0x54445406

    .line 749
    .line 750
    .line 751
    const/4 v6, 0x1

    .line 752
    invoke-direct {v0, v5, v2, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 753
    .line 754
    .line 755
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 756
    .line 757
    .line 758
    sget-object v0, Lwb/p0;->n:Ls0/d;

    .line 759
    .line 760
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 761
    .line 762
    .line 763
    new-instance v0, Lwb/x6;

    .line 764
    .line 765
    const/16 v2, 0x14

    .line 766
    .line 767
    invoke-direct {v0, v1, v2}, Lwb/x6;-><init>(Lfg/a;I)V

    .line 768
    .line 769
    .line 770
    new-instance v1, Ls0/d;

    .line 771
    .line 772
    const v2, 0x6124d788

    .line 773
    .line 774
    .line 775
    invoke-direct {v1, v2, v0, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 776
    .line 777
    .line 778
    invoke-static {p1, v3, v1, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 779
    .line 780
    .line 781
    goto/16 :goto_0

    .line 782
    .line 783
    :pswitch_12
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v0, Ljava/util/List;

    .line 786
    .line 787
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v1, Li0/a1;

    .line 790
    .line 791
    check-cast p1, Lr/h;

    .line 792
    .line 793
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    new-instance v2, Lwb/qc;

    .line 797
    .line 798
    const/4 v3, 0x4

    .line 799
    invoke-direct {v2, v0, v1, v3}, Lwb/qc;-><init>(Ljava/util/List;Li0/a1;I)V

    .line 800
    .line 801
    .line 802
    new-instance v0, Ls0/d;

    .line 803
    .line 804
    const v1, 0x2eb223e3

    .line 805
    .line 806
    .line 807
    const/4 v3, 0x1

    .line 808
    invoke-direct {v0, v1, v2, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 809
    .line 810
    .line 811
    const/4 v1, 0x3

    .line 812
    const/4 v2, 0x0

    .line 813
    invoke-static {p1, v2, v0, v1}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 814
    .line 815
    .line 816
    goto/16 :goto_0

    .line 817
    .line 818
    :pswitch_13
    iget-object v0, p0, Lwb/l7;->h:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v0, Lwb/c3;

    .line 821
    .line 822
    iget-object v1, p0, Lwb/l7;->i:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v1, Lfg/l;

    .line 825
    .line 826
    check-cast p1, Lr/h;

    .line 827
    .line 828
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    sget-object v2, Lwb/p0;->k:Ls0/d;

    .line 832
    .line 833
    const/4 v3, 0x0

    .line 834
    const/4 v4, 0x3

    .line 835
    invoke-static {p1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 836
    .line 837
    .line 838
    new-instance v2, Ldb/f;

    .line 839
    .line 840
    const/16 v5, 0x11

    .line 841
    .line 842
    invoke-direct {v2, v0, v5, v1}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    new-instance v0, Ls0/d;

    .line 846
    .line 847
    const v1, -0x5ae31b68

    .line 848
    .line 849
    .line 850
    const/4 v5, 0x1

    .line 851
    invoke-direct {v0, v1, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 852
    .line 853
    .line 854
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_0

    .line 858
    .line 859
    :pswitch_data_0
    .packed-switch 0x0
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
