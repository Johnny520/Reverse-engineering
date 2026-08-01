.class public final synthetic Lgp0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lgp0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpu0;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Lgp0;->ε:I

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lgp0;->ε:I

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    sget-object v3, Ls62;->α:Ls62;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    sget-object v1, Luv0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Luv0;->δ(Ljava/lang/reflect/Method;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v1, 0x7d0

    .line 37
    .line 38
    if-lt v0, v1, :cond_0

    .line 39
    .line 40
    move v4, v5

    .line 41
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_1
    move-object/from16 v0, p1

    .line 47
    .line 48
    check-cast v0, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :pswitch_2
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    const-class v1, Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_3
    move-object/from16 v0, p1

    .line 74
    .line 75
    check-cast v0, Ljava/lang/ClassLoader;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v1, Lqx;

    .line 81
    .line 82
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 83
    .line 84
    sget-object v2, Lkx;->р:Lkx;

    .line 85
    .line 86
    invoke-static {v2, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, Lr20;

    .line 91
    .line 92
    const/16 v4, 0x19

    .line 93
    .line 94
    invoke-direct {v3, v0, v4}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 95
    .line 96
    .line 97
    const-string v4, "\u5b9a\u4f4d\u8bc4\u8bba\u957f\u6309\u64cd\u4f5c\u9879\u5217\u8868\u5165\u53e3"

    .line 98
    .line 99
    invoke-direct {v1, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, Lqx;

    .line 103
    .line 104
    sget-object v3, Lkx;->с:Lkx;

    .line 105
    .line 106
    invoke-static {v3, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v4, Lr20;

    .line 111
    .line 112
    const/16 v5, 0x1a

    .line 113
    .line 114
    invoke-direct {v4, v0, v5}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 115
    .line 116
    .line 117
    const-string v0, "\u5b9a\u4f4d Feed \u957f\u6309\u9762\u677f\u5206\u7ec4 View \u5165\u53e3"

    .line 118
    .line 119
    invoke-direct {v2, v3, v0, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 120
    .line 121
    .line 122
    filled-new-array {v1, v2}, [Lqx;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :pswitch_4
    move-object/from16 v0, p1

    .line 132
    .line 133
    check-cast v0, Lqv0;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_5
    move-object/from16 v0, p1

    .line 142
    .line 143
    check-cast v0, Lqv0;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_6
    move-object/from16 v0, p1

    .line 152
    .line 153
    check-cast v0, Lqv0;

    .line 154
    .line 155
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->ζ(Lqv0;)Ls62;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_7
    move-object/from16 v0, p1

    .line 161
    .line 162
    check-cast v0, Lqv0;

    .line 163
    .line 164
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->ε(Lqv0;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :pswitch_8
    move-object/from16 v0, p1

    .line 174
    .line 175
    check-cast v0, Lqv0;

    .line 176
    .line 177
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->γ(Lqv0;)Ls62;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_9
    move-object/from16 v0, p1

    .line 183
    .line 184
    check-cast v0, Lqv0;

    .line 185
    .line 186
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->β(Lqv0;)Ls62;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_a
    move-object/from16 v0, p1

    .line 192
    .line 193
    check-cast v0, Lqv0;

    .line 194
    .line 195
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->δ(Lqv0;)Ls62;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0

    .line 200
    :pswitch_b
    move-object/from16 v0, p1

    .line 201
    .line 202
    check-cast v0, Ljava/lang/Class;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    return-object v0

    .line 209
    :pswitch_c
    move-object/from16 v0, p1

    .line 210
    .line 211
    check-cast v0, Ljava/lang/ClassLoader;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object v1, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    .line 218
    invoke-static {v0}, Ltu0;->α(Ljava/lang/ClassLoader;)V

    .line 219
    .line 220
    .line 221
    return-object v3

    .line 222
    :pswitch_d
    move-object/from16 v0, p1

    .line 223
    .line 224
    check-cast v0, Ljava/lang/ClassLoader;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v1, Lqx;

    .line 230
    .line 231
    sget-object v3, Lox;->α:Ljava/lang/Object;

    .line 232
    .line 233
    sget-object v3, Lkx;->х:Lkx;

    .line 234
    .line 235
    invoke-static {v3, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    new-instance v4, Lr20;

    .line 240
    .line 241
    invoke-direct {v4, v0, v2}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 242
    .line 243
    .line 244
    const-string v0, "\u5b9a\u4f4d\u76f4\u64ad\u95f4\u9876\u90e8\u5728\u7ebf\u4eba\u6570\u5237\u65b0\u65b9\u6cd5"

    .line 245
    .line 246
    invoke-direct {v1, v3, v0, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    return-object v0

    .line 254
    :pswitch_e
    move-object/from16 v0, p1

    .line 255
    .line 256
    check-cast v0, Ljava/lang/Byte;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    and-int/lit16 v0, v0, 0xff

    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const-string v1, "%02x"

    .line 277
    .line 278
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    return-object v0

    .line 283
    :pswitch_f
    move-object/from16 v0, p1

    .line 284
    .line 285
    check-cast v0, Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v0}, Lpu0;->Ι(Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0

    .line 299
    :pswitch_10
    move-object/from16 v0, p1

    .line 300
    .line 301
    check-cast v0, Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 307
    .line 308
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    const-string v1, ".m3u8"

    .line 316
    .line 317
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-nez v1, :cond_1

    .line 322
    .line 323
    const-string v1, "m3u8"

    .line 324
    .line 325
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-nez v1, :cond_1

    .line 330
    .line 331
    const-string v1, ".mpd"

    .line 332
    .line 333
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_1

    .line 338
    .line 339
    const-string v1, "mpegurl"

    .line 340
    .line 341
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_1

    .line 346
    .line 347
    const-string v1, "dash"

    .line 348
    .line 349
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-nez v1, :cond_1

    .line 354
    .line 355
    const-string v1, ".m4s"

    .line 356
    .line 357
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_2

    .line 362
    .line 363
    :cond_1
    move v4, v5

    .line 364
    :cond_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :pswitch_11
    move-object/from16 v0, p1

    .line 370
    .line 371
    check-cast v0, Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-static {v0}, Lpu0;->Κ(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    return-object v0

    .line 385
    :pswitch_12
    move-object/from16 v0, p1

    .line 386
    .line 387
    check-cast v0, Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {v0}, Lpu0;->Μ(Ljava/lang/String;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0

    .line 401
    :pswitch_13
    move-object/from16 v0, p1

    .line 402
    .line 403
    check-cast v0, Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    const-string v1, "http://"

    .line 409
    .line 410
    invoke-static {v0, v1, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v1, :cond_3

    .line 415
    .line 416
    const-string v1, "https://"

    .line 417
    .line 418
    invoke-static {v0, v1, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_4

    .line 423
    .line 424
    :cond_3
    move v4, v5

    .line 425
    :cond_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    return-object v0

    .line 430
    :pswitch_14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static/range {p1 .. p1}, Lpu0;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    return-object v0

    .line 438
    :pswitch_15
    move-object/from16 v0, p1

    .line 439
    .line 440
    check-cast v0, Lyv;

    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    invoke-static {}, Lp91;->π()Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    const-string v7, "child"

    .line 450
    .line 451
    const/4 v8, 0x0

    .line 452
    const/high16 v9, 0x3f800000    # 1.0f

    .line 453
    .line 454
    if-nez v6, :cond_5

    .line 455
    .line 456
    goto :goto_1

    .line 457
    :cond_5
    iget-object v6, v0, Lyv;->Γ:La3;

    .line 458
    .line 459
    const/high16 v10, 0x3fc00000    # 1.5f

    .line 460
    .line 461
    if-eqz v6, :cond_6

    .line 462
    .line 463
    iget v11, v0, Lyv;->ω:F

    .line 464
    .line 465
    cmpg-float v11, v11, v8

    .line 466
    .line 467
    if-nez v11, :cond_6

    .line 468
    .line 469
    iget v11, v0, Lyv;->Α:F

    .line 470
    .line 471
    cmpg-float v11, v11, v9

    .line 472
    .line 473
    if-nez v11, :cond_6

    .line 474
    .line 475
    iget v11, v0, Lyv;->Β:F

    .line 476
    .line 477
    cmpg-float v11, v11, v10

    .line 478
    .line 479
    if-nez v11, :cond_6

    .line 480
    .line 481
    goto :goto_0

    .line 482
    :cond_6
    const-string v6, "\n    uniform shader child;\n    uniform float in_brightness;\n    uniform float in_contrast;\n    uniform float in_saturation;\n\n    half4 main(float2 xy) {\n        half4 src = child.eval(xy);\n        half a = src.a;\n        if (a < 0.001) return src;\n\n        half3 c = src.rgb / a;\n\n        if (in_brightness != 0.0) {\n            c = pow(c, half3(2.2));\n            if (in_brightness > 0.0) {\n                c = mix(c, half3(1.0), half(in_brightness));\n            } else {\n                c = c * half(1.0 + in_brightness);\n            }\n            c = pow(c, half3(0.45454545));\n        }\n\n        if (in_contrast != 1.0) {\n            c = (c - 0.5) * half(in_contrast) + 0.5;\n        }\n\n        if (in_saturation != 1.0) {\n            half lum = dot(c, half3(0.2126, 0.7152, 0.0722));\n            c = mix(half3(lum), c, half(in_saturation));\n        }\n\n        c = clamp(c, half3(0.0), half3(1.0));\n        return half4(c * a, a);\n    }\n"

    .line 483
    .line 484
    const-string v11, "ColorControls"

    .line 485
    .line 486
    invoke-virtual {v0, v11, v6}, Lyv;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v11, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 494
    .line 495
    const-string v12, "in_brightness"

    .line 496
    .line 497
    invoke-static {v11, v12, v8}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 498
    .line 499
    .line 500
    const-string v11, "in_contrast"

    .line 501
    .line 502
    iget-object v12, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 503
    .line 504
    invoke-static {v12, v11, v9}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 505
    .line 506
    .line 507
    const-string v11, "in_saturation"

    .line 508
    .line 509
    iget-object v12, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 510
    .line 511
    invoke-static {v12, v11, v10}, Lц;->ο(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 512
    .line 513
    .line 514
    invoke-static {v6, v7}, Lg81;->ρ(Lb3;Ljava/lang/String;)La3;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    iput v8, v0, Lyv;->ω:F

    .line 519
    .line 520
    iput v9, v0, Lyv;->Α:F

    .line 521
    .line 522
    iput v10, v0, Lyv;->Β:F

    .line 523
    .line 524
    iput-object v6, v0, Lyv;->Γ:La3;

    .line 525
    .line 526
    :goto_0
    iget-object v10, v0, Lyv;->κ:Lin;

    .line 527
    .line 528
    invoke-static {v10, v6}, Lg81;->β(Lin;Lin;)Lin;

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    iput-object v6, v0, Lyv;->κ:Lin;

    .line 533
    .line 534
    :goto_1
    const/4 v6, 0x4

    .line 535
    int-to-float v10, v6

    .line 536
    iget v11, v0, Lyv;->ε:F

    .line 537
    .line 538
    mul-float v12, v11, v10

    .line 539
    .line 540
    mul-float/2addr v11, v10

    .line 541
    invoke-static {}, Lp91;->π()Z

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    if-nez v10, :cond_7

    .line 546
    .line 547
    move-object/from16 v21, v3

    .line 548
    .line 549
    move/from16 p1, v8

    .line 550
    .line 551
    goto/16 :goto_d

    .line 552
    .line 553
    :cond_7
    iget-object v10, v0, Lyv;->ρ:[[F

    .line 554
    .line 555
    iget-object v13, v0, Lyv;->π:[[F

    .line 556
    .line 557
    const v14, 0x3ee66666    # 0.45f

    .line 558
    .line 559
    .line 560
    mul-float v15, v12, v14

    .line 561
    .line 562
    mul-float/2addr v14, v11

    .line 563
    iget v1, v0, Lyv;->Δ:I

    .line 564
    .line 565
    const/high16 v16, 0x40000000    # 2.0f

    .line 566
    .line 567
    if-ltz v1, :cond_8

    .line 568
    .line 569
    goto/16 :goto_5

    .line 570
    .line 571
    :cond_8
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    sget-object v6, Lna;->δ:[F

    .line 576
    .line 577
    array-length v4, v6

    .line 578
    const/4 v2, 0x0

    .line 579
    :goto_2
    if-ge v2, v4, :cond_a

    .line 580
    .line 581
    aget v17, v6, v2

    .line 582
    .line 583
    const v18, 0x3f6147ae    # 0.88f

    .line 584
    .line 585
    .line 586
    mul-float v18, v18, v17

    .line 587
    .line 588
    const v19, 0x3f8f5c29    # 1.12f

    .line 589
    .line 590
    .line 591
    mul-float v17, v17, v19

    .line 592
    .line 593
    cmpl-float v19, v1, v18

    .line 594
    .line 595
    if-lez v19, :cond_9

    .line 596
    .line 597
    cmpg-float v19, v1, v17

    .line 598
    .line 599
    if-gez v19, :cond_9

    .line 600
    .line 601
    sub-float v1, v1, v18

    .line 602
    .line 603
    sub-float v17, v17, v18

    .line 604
    .line 605
    div-float v1, v1, v17

    .line 606
    .line 607
    invoke-static {v1, v8, v9}, Lj81;->λ(FFF)F

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    new-instance v4, Lfu;

    .line 612
    .line 613
    add-int/lit8 v6, v2, 0x1

    .line 614
    .line 615
    mul-float v9, v1, v1

    .line 616
    .line 617
    const/high16 v17, 0x40400000    # 3.0f

    .line 618
    .line 619
    mul-float v1, v1, v16

    .line 620
    .line 621
    sub-float v17, v17, v1

    .line 622
    .line 623
    mul-float v1, v17, v9

    .line 624
    .line 625
    invoke-direct {v4, v1, v2, v6}, Lfu;-><init>(FII)V

    .line 626
    .line 627
    .line 628
    goto :goto_4

    .line 629
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 630
    .line 631
    goto :goto_2

    .line 632
    :cond_a
    mul-float/2addr v1, v1

    .line 633
    const v2, 0x44f32000    # 1945.0f

    .line 634
    .line 635
    .line 636
    cmpl-float v2, v1, v2

    .line 637
    .line 638
    if-ltz v2, :cond_b

    .line 639
    .line 640
    const/4 v6, 0x4

    .line 641
    goto :goto_3

    .line 642
    :cond_b
    const/high16 v2, 0x43c80000    # 400.0f

    .line 643
    .line 644
    cmpl-float v2, v1, v2

    .line 645
    .line 646
    if-lez v2, :cond_c

    .line 647
    .line 648
    const/4 v6, 0x3

    .line 649
    goto :goto_3

    .line 650
    :cond_c
    const v2, 0x42b48000    # 90.25f

    .line 651
    .line 652
    .line 653
    cmpl-float v2, v1, v2

    .line 654
    .line 655
    if-ltz v2, :cond_d

    .line 656
    .line 657
    const/4 v6, 0x2

    .line 658
    goto :goto_3

    .line 659
    :cond_d
    const v2, 0x4149999a    # 12.6f

    .line 660
    .line 661
    .line 662
    cmpl-float v1, v1, v2

    .line 663
    .line 664
    if-ltz v1, :cond_e

    .line 665
    .line 666
    move v6, v5

    .line 667
    goto :goto_3

    .line 668
    :cond_e
    const/4 v6, 0x0

    .line 669
    :goto_3
    new-instance v4, Lfu;

    .line 670
    .line 671
    invoke-direct {v4, v8, v6, v6}, Lfu;-><init>(FII)V

    .line 672
    .line 673
    .line 674
    :goto_4
    iget v1, v4, Lfu;->α:I

    .line 675
    .line 676
    iput v1, v0, Lyv;->Ε:I

    .line 677
    .line 678
    iget v2, v4, Lfu;->β:I

    .line 679
    .line 680
    iput v2, v0, Lyv;->Ζ:I

    .line 681
    .line 682
    iget v2, v4, Lfu;->γ:F

    .line 683
    .line 684
    iput v2, v0, Lyv;->Η:F

    .line 685
    .line 686
    :goto_5
    shl-int v2, v5, v1

    .line 687
    .line 688
    mul-int/lit8 v4, v2, 0xd

    .line 689
    .line 690
    int-to-float v4, v4

    .line 691
    iget v6, v0, Lyv;->ι:F

    .line 692
    .line 693
    cmpl-float v6, v4, v6

    .line 694
    .line 695
    if-lez v6, :cond_f

    .line 696
    .line 697
    iput v4, v0, Lyv;->ι:F

    .line 698
    .line 699
    :cond_f
    move/from16 p1, v8

    .line 700
    .line 701
    iget-wide v8, v0, Lyv;->η:J

    .line 702
    .line 703
    const/16 v4, 0x20

    .line 704
    .line 705
    shr-long/2addr v8, v4

    .line 706
    long-to-int v6, v8

    .line 707
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    iget v8, v0, Lyv;->ι:F

    .line 712
    .line 713
    mul-float v8, v8, v16

    .line 714
    .line 715
    add-float/2addr v8, v6

    .line 716
    move v9, v4

    .line 717
    iget-wide v4, v0, Lyv;->η:J

    .line 718
    .line 719
    const-wide v17, 0xffffffffL

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    and-long v4, v4, v17

    .line 725
    .line 726
    long-to-int v4, v4

    .line 727
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    iget v5, v0, Lyv;->ι:F

    .line 732
    .line 733
    mul-float v5, v5, v16

    .line 734
    .line 735
    add-float/2addr v5, v4

    .line 736
    iget-object v4, v0, Lyv;->ψ:Lin;

    .line 737
    .line 738
    if-eqz v4, :cond_10

    .line 739
    .line 740
    iget v6, v0, Lyv;->σ:F

    .line 741
    .line 742
    cmpg-float v6, v6, v12

    .line 743
    .line 744
    if-nez v6, :cond_10

    .line 745
    .line 746
    iget v6, v0, Lyv;->τ:F

    .line 747
    .line 748
    cmpg-float v6, v6, v11

    .line 749
    .line 750
    if-nez v6, :cond_10

    .line 751
    .line 752
    iget v6, v0, Lyv;->υ:F

    .line 753
    .line 754
    cmpg-float v6, v6, v8

    .line 755
    .line 756
    if-nez v6, :cond_10

    .line 757
    .line 758
    iget v6, v0, Lyv;->φ:F

    .line 759
    .line 760
    cmpg-float v6, v6, v5

    .line 761
    .line 762
    if-nez v6, :cond_10

    .line 763
    .line 764
    iget v6, v0, Lyv;->χ:I

    .line 765
    .line 766
    if-ne v6, v1, :cond_10

    .line 767
    .line 768
    move/from16 v26, v2

    .line 769
    .line 770
    move-object/from16 v21, v3

    .line 771
    .line 772
    goto/16 :goto_c

    .line 773
    .line 774
    :cond_10
    mul-float/2addr v15, v15

    .line 775
    int-to-float v4, v2

    .line 776
    sget-object v6, Lna;->γ:[F

    .line 777
    .line 778
    aget v6, v6, v1

    .line 779
    .line 780
    sub-float/2addr v15, v6

    .line 781
    mul-float/2addr v4, v4

    .line 782
    div-float/2addr v15, v4

    .line 783
    const v19, 0x3dcccccd    # 0.1f

    .line 784
    .line 785
    .line 786
    cmpg-float v20, v15, v19

    .line 787
    .line 788
    if-gez v20, :cond_11

    .line 789
    .line 790
    move/from16 v15, v19

    .line 791
    .line 792
    :cond_11
    mul-float/2addr v14, v14

    .line 793
    sub-float/2addr v14, v6

    .line 794
    div-float/2addr v14, v4

    .line 795
    cmpg-float v4, v14, v19

    .line 796
    .line 797
    if-gez v4, :cond_12

    .line 798
    .line 799
    move/from16 v14, v19

    .line 800
    .line 801
    :cond_12
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 802
    .line 803
    .line 804
    move-result v4

    .line 805
    move v6, v9

    .line 806
    move-object/from16 v19, v10

    .line 807
    .line 808
    int-to-long v9, v4

    .line 809
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 810
    .line 811
    .line 812
    move-result v4

    .line 813
    move/from16 v21, v6

    .line 814
    .line 815
    move-object/from16 v20, v7

    .line 816
    .line 817
    int-to-long v6, v4

    .line 818
    shl-long v9, v9, v21

    .line 819
    .line 820
    and-long v6, v6, v17

    .line 821
    .line 822
    or-long/2addr v6, v9

    .line 823
    cmpg-float v4, v12, p1

    .line 824
    .line 825
    if-gtz v4, :cond_13

    .line 826
    .line 827
    cmpg-float v4, v11, p1

    .line 828
    .line 829
    if-gtz v4, :cond_13

    .line 830
    .line 831
    move/from16 v18, v1

    .line 832
    .line 833
    move/from16 v26, v2

    .line 834
    .line 835
    move-object/from16 v21, v3

    .line 836
    .line 837
    const/4 v1, 0x0

    .line 838
    goto/16 :goto_b

    .line 839
    .line 840
    :cond_13
    shr-long v9, v6, v21

    .line 841
    .line 842
    long-to-int v4, v9

    .line 843
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    float-to-int v4, v4

    .line 848
    div-int/2addr v4, v2

    .line 849
    const/4 v9, 0x1

    .line 850
    if-ge v4, v9, :cond_14

    .line 851
    .line 852
    move v4, v9

    .line 853
    :cond_14
    int-to-float v4, v4

    .line 854
    and-long v6, v6, v17

    .line 855
    .line 856
    long-to-int v6, v6

    .line 857
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 858
    .line 859
    .line 860
    move-result v6

    .line 861
    float-to-int v6, v6

    .line 862
    div-int v7, v6, v2

    .line 863
    .line 864
    if-ge v7, v9, :cond_15

    .line 865
    .line 866
    const/4 v7, 0x1

    .line 867
    :cond_15
    int-to-float v7, v7

    .line 868
    iget-object v9, v0, Lyv;->ν:[D

    .line 869
    .line 870
    iget-object v10, v0, Lyv;->ξ:[F

    .line 871
    .line 872
    iget-object v6, v0, Lyv;->ο:[F

    .line 873
    .line 874
    invoke-static {v2}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 875
    .line 876
    .line 877
    move-result v17

    .line 878
    cmpl-float v18, v12, p1

    .line 879
    .line 880
    move-object/from16 v21, v3

    .line 881
    .line 882
    const-string v3, "in_maxCoord"

    .line 883
    .line 884
    move/from16 v22, v4

    .line 885
    .line 886
    const-string v4, "in_blurWeight"

    .line 887
    .line 888
    move/from16 v23, v7

    .line 889
    .line 890
    const-string v7, "in_blurOffset"

    .line 891
    .line 892
    const/high16 v24, 0x3f000000    # 0.5f

    .line 893
    .line 894
    if-lez v18, :cond_19

    .line 895
    .line 896
    invoke-static {v15, v9, v10, v6}, Lna;->α(F[D[F[F)I

    .line 897
    .line 898
    .line 899
    move-result v15

    .line 900
    if-lez v15, :cond_19

    .line 901
    .line 902
    aget-object v18, v13, v15

    .line 903
    .line 904
    if-nez v18, :cond_16

    .line 905
    .line 906
    move-object/from16 v25, v13

    .line 907
    .line 908
    mul-int/lit8 v13, v15, 0x2

    .line 909
    .line 910
    new-array v13, v13, [F

    .line 911
    .line 912
    aput-object v13, v25, v15

    .line 913
    .line 914
    goto :goto_6

    .line 915
    :cond_16
    move-object/from16 v25, v13

    .line 916
    .line 917
    move-object/from16 v13, v18

    .line 918
    .line 919
    :goto_6
    aget-object v18, v19, v15

    .line 920
    .line 921
    if-nez v18, :cond_17

    .line 922
    .line 923
    move/from16 v26, v2

    .line 924
    .line 925
    new-array v2, v15, [F

    .line 926
    .line 927
    aput-object v2, v19, v15

    .line 928
    .line 929
    goto :goto_7

    .line 930
    :cond_17
    move/from16 v26, v2

    .line 931
    .line 932
    move-object/from16 v2, v18

    .line 933
    .line 934
    :goto_7
    move/from16 v18, v1

    .line 935
    .line 936
    const/4 v1, 0x0

    .line 937
    :goto_8
    if-ge v1, v15, :cond_18

    .line 938
    .line 939
    mul-int/lit8 v27, v1, 0x2

    .line 940
    .line 941
    aget v28, v10, v1

    .line 942
    .line 943
    aput v28, v13, v27

    .line 944
    .line 945
    const/16 v16, 0x1

    .line 946
    .line 947
    add-int/lit8 v27, v27, 0x1

    .line 948
    .line 949
    aput p1, v13, v27

    .line 950
    .line 951
    aget v27, v6, v1

    .line 952
    .line 953
    aput v27, v2, v1

    .line 954
    .line 955
    add-int/lit8 v1, v1, 0x1

    .line 956
    .line 957
    goto :goto_8

    .line 958
    :cond_18
    sget-object v1, Lna;->α:[[Ljava/lang/String;

    .line 959
    .line 960
    aget-object v1, v1, v15

    .line 961
    .line 962
    aget-object v1, v1, v17

    .line 963
    .line 964
    sget-object v27, Lev1;->α:[Ljava/lang/String;

    .line 965
    .line 966
    aget-object v15, v27, v15

    .line 967
    .line 968
    invoke-virtual {v0, v1, v15}, Lyv;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    iget-object v15, v1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 973
    .line 974
    invoke-static {v15, v7, v13}, Lц;->τ(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 975
    .line 976
    .line 977
    iget-object v13, v1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 978
    .line 979
    invoke-static {v13, v4, v2}, Lц;->τ(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 980
    .line 981
    .line 982
    sub-float v2, v22, v24

    .line 983
    .line 984
    sub-float v13, v23, v24

    .line 985
    .line 986
    iget-object v15, v1, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 987
    .line 988
    invoke-static {v15, v3, v2, v13}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 989
    .line 990
    .line 991
    move-object/from16 v2, v20

    .line 992
    .line 993
    invoke-static {v1, v2}, Lg81;->ρ(Lb3;Ljava/lang/String;)La3;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    goto :goto_9

    .line 998
    :cond_19
    move/from16 v18, v1

    .line 999
    .line 1000
    move/from16 v26, v2

    .line 1001
    .line 1002
    move-object/from16 v25, v13

    .line 1003
    .line 1004
    move-object/from16 v2, v20

    .line 1005
    .line 1006
    const/4 v1, 0x0

    .line 1007
    :goto_9
    cmpl-float v13, v11, p1

    .line 1008
    .line 1009
    if-lez v13, :cond_1e

    .line 1010
    .line 1011
    invoke-static {v14, v9, v10, v6}, Lna;->α(F[D[F[F)I

    .line 1012
    .line 1013
    .line 1014
    move-result v9

    .line 1015
    if-lez v9, :cond_1e

    .line 1016
    .line 1017
    aget-object v13, v25, v9

    .line 1018
    .line 1019
    if-nez v13, :cond_1a

    .line 1020
    .line 1021
    mul-int/lit8 v13, v9, 0x2

    .line 1022
    .line 1023
    new-array v13, v13, [F

    .line 1024
    .line 1025
    aput-object v13, v25, v9

    .line 1026
    .line 1027
    :cond_1a
    aget-object v14, v19, v9

    .line 1028
    .line 1029
    if-nez v14, :cond_1b

    .line 1030
    .line 1031
    new-array v14, v9, [F

    .line 1032
    .line 1033
    aput-object v14, v19, v9

    .line 1034
    .line 1035
    :cond_1b
    const/4 v15, 0x0

    .line 1036
    :goto_a
    if-ge v15, v9, :cond_1c

    .line 1037
    .line 1038
    mul-int/lit8 v19, v15, 0x2

    .line 1039
    .line 1040
    aput p1, v13, v19

    .line 1041
    .line 1042
    const/16 v16, 0x1

    .line 1043
    .line 1044
    add-int/lit8 v19, v19, 0x1

    .line 1045
    .line 1046
    aget v20, v10, v15

    .line 1047
    .line 1048
    aput v20, v13, v19

    .line 1049
    .line 1050
    aget v19, v6, v15

    .line 1051
    .line 1052
    aput v19, v14, v15

    .line 1053
    .line 1054
    add-int/lit8 v15, v15, 0x1

    .line 1055
    .line 1056
    goto :goto_a

    .line 1057
    :cond_1c
    sget-object v6, Lna;->β:[[Ljava/lang/String;

    .line 1058
    .line 1059
    aget-object v6, v6, v9

    .line 1060
    .line 1061
    aget-object v6, v6, v17

    .line 1062
    .line 1063
    sget-object v10, Lev1;->α:[Ljava/lang/String;

    .line 1064
    .line 1065
    aget-object v9, v10, v9

    .line 1066
    .line 1067
    invoke-virtual {v0, v6, v9}, Lyv;->γ(Ljava/lang/String;Ljava/lang/String;)Lb3;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v6

    .line 1071
    iget-object v9, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 1072
    .line 1073
    invoke-static {v9, v7, v13}, Lц;->τ(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 1074
    .line 1075
    .line 1076
    iget-object v7, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 1077
    .line 1078
    invoke-static {v7, v4, v14}, Lц;->τ(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 1079
    .line 1080
    .line 1081
    sub-float v4, v22, v24

    .line 1082
    .line 1083
    sub-float v7, v23, v24

    .line 1084
    .line 1085
    iget-object v9, v6, Lb3;->α:Landroid/graphics/RuntimeShader;

    .line 1086
    .line 1087
    invoke-static {v9, v3, v4, v7}, Lц;->π(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 1088
    .line 1089
    .line 1090
    if-eqz v1, :cond_1d

    .line 1091
    .line 1092
    invoke-static {v6, v2}, Lg81;->ρ(Lb3;Ljava/lang/String;)La3;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v2

    .line 1096
    invoke-static {v1, v2}, Lg81;->β(Lin;Lin;)Lin;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    goto :goto_b

    .line 1101
    :cond_1d
    invoke-static {v6, v2}, Lg81;->ρ(Lb3;Ljava/lang/String;)La3;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v1

    .line 1105
    :cond_1e
    :goto_b
    iput v12, v0, Lyv;->σ:F

    .line 1106
    .line 1107
    iput v11, v0, Lyv;->τ:F

    .line 1108
    .line 1109
    iput v8, v0, Lyv;->υ:F

    .line 1110
    .line 1111
    iput v5, v0, Lyv;->φ:F

    .line 1112
    .line 1113
    move/from16 v2, v18

    .line 1114
    .line 1115
    iput v2, v0, Lyv;->χ:I

    .line 1116
    .line 1117
    iput-object v1, v0, Lyv;->ψ:Lin;

    .line 1118
    .line 1119
    move-object v4, v1

    .line 1120
    :goto_c
    if-nez v4, :cond_1f

    .line 1121
    .line 1122
    :goto_d
    const/16 v1, 0x18

    .line 1123
    .line 1124
    goto :goto_e

    .line 1125
    :cond_1f
    move/from16 v1, v26

    .line 1126
    .line 1127
    iput v1, v0, Lyv;->λ:I

    .line 1128
    .line 1129
    iget-object v1, v0, Lyv;->κ:Lin;

    .line 1130
    .line 1131
    if-eqz v1, :cond_20

    .line 1132
    .line 1133
    invoke-static {v1, v4}, Lg81;->β(Lin;Lin;)Lin;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v4

    .line 1137
    :cond_20
    iput-object v4, v0, Lyv;->κ:Lin;

    .line 1138
    .line 1139
    goto :goto_d

    .line 1140
    :goto_e
    int-to-float v1, v1

    .line 1141
    iget v2, v0, Lyv;->ε:F

    .line 1142
    .line 1143
    mul-float v3, v2, v1

    .line 1144
    .line 1145
    mul-float/2addr v2, v1

    .line 1146
    move/from16 v4, p1

    .line 1147
    .line 1148
    const/4 v1, 0x0

    .line 1149
    invoke-static {v0, v3, v2, v1, v4}, Lpd2;->ε(Lyv;FFZF)V

    .line 1150
    .line 1151
    .line 1152
    return-object v21

    .line 1153
    :pswitch_16
    move-object/from16 v0, p1

    .line 1154
    .line 1155
    check-cast v0, Lyv;

    .line 1156
    .line 1157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    sget-object v0, Lpt0;->α:Lie0;

    .line 1161
    .line 1162
    return-object v0

    .line 1163
    :pswitch_17
    move-object/from16 v0, p1

    .line 1164
    .line 1165
    check-cast v0, Ljava/lang/String;

    .line 1166
    .line 1167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1168
    .line 1169
    .line 1170
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    const/16 v16, 0x1

    .line 1175
    .line 1176
    xor-int/lit8 v0, v0, 0x1

    .line 1177
    .line 1178
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    return-object v0

    .line 1183
    :pswitch_18
    move-object/from16 v0, p1

    .line 1184
    .line 1185
    check-cast v0, Landroid/widget/TextView;

    .line 1186
    .line 1187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    if-eqz v0, :cond_21

    .line 1195
    .line 1196
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    goto :goto_f

    .line 1201
    :cond_21
    const/4 v1, 0x0

    .line 1202
    :goto_f
    if-nez v1, :cond_22

    .line 1203
    .line 1204
    const-string v1, ""

    .line 1205
    .line 1206
    :cond_22
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    return-object v0

    .line 1215
    :pswitch_19
    move v1, v4

    .line 1216
    move/from16 v16, v5

    .line 1217
    .line 1218
    move-object/from16 v0, p1

    .line 1219
    .line 1220
    check-cast v0, Landroid/widget/TextView;

    .line 1221
    .line 1222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 1226
    .line 1227
    .line 1228
    move-result v0

    .line 1229
    const/16 v2, 0x8

    .line 1230
    .line 1231
    if-eq v0, v2, :cond_23

    .line 1232
    .line 1233
    move/from16 v4, v16

    .line 1234
    .line 1235
    goto :goto_10

    .line 1236
    :cond_23
    move v4, v1

    .line 1237
    :goto_10
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    return-object v0

    .line 1242
    :pswitch_1a
    move-object/from16 v21, v3

    .line 1243
    .line 1244
    move-object/from16 v0, p1

    .line 1245
    .line 1246
    check-cast v0, Ljava/lang/String;

    .line 1247
    .line 1248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1252
    .line 1253
    .line 1254
    move-result v1

    .line 1255
    const v2, -0x5de149b9

    .line 1256
    .line 1257
    .line 1258
    if-eq v1, v2, :cond_27

    .line 1259
    .line 1260
    const v2, -0x14cca16

    .line 1261
    .line 1262
    .line 1263
    if-eq v1, v2, :cond_26

    .line 1264
    .line 1265
    const/16 v2, 0x2a

    .line 1266
    .line 1267
    if-eq v1, v2, :cond_25

    .line 1268
    .line 1269
    const v2, 0x5f7278d6

    .line 1270
    .line 1271
    .line 1272
    if-eq v1, v2, :cond_24

    .line 1273
    .line 1274
    goto :goto_12

    .line 1275
    :cond_24
    const-string v1, "liquid_glass_bottom_bar_scale_percent"

    .line 1276
    .line 1277
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-nez v0, :cond_28

    .line 1282
    .line 1283
    goto :goto_12

    .line 1284
    :cond_25
    const-string v1, "*"

    .line 1285
    .line 1286
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v0

    .line 1290
    if-eqz v0, :cond_29

    .line 1291
    .line 1292
    goto :goto_11

    .line 1293
    :cond_26
    const-string v1, "bottom_bar_hidden"

    .line 1294
    .line 1295
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v0

    .line 1299
    if-nez v0, :cond_28

    .line 1300
    .line 1301
    goto :goto_12

    .line 1302
    :cond_27
    const-string v1, "liquid_glass_bottom_bar_enabled"

    .line 1303
    .line 1304
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    if-nez v0, :cond_28

    .line 1309
    .line 1310
    goto :goto_12

    .line 1311
    :cond_28
    :goto_11
    sget-object v0, Lht0;->η:Landroid/os/Handler;

    .line 1312
    .line 1313
    new-instance v1, Lfb0;

    .line 1314
    .line 1315
    const/4 v2, 0x7

    .line 1316
    invoke-direct {v1, v2}, Lfb0;-><init>(I)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1320
    .line 1321
    .line 1322
    :cond_29
    :goto_12
    return-object v21

    .line 1323
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1324
    .line 1325
    check-cast v0, Lst0;

    .line 1326
    .line 1327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    iget-object v0, v0, Lst0;->β:Ljava/lang/String;

    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :pswitch_1c
    move-object/from16 v21, v3

    .line 1334
    .line 1335
    move-object/from16 v0, p1

    .line 1336
    .line 1337
    check-cast v0, Laq0;

    .line 1338
    .line 1339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v0}, Laq0;->γ()V

    .line 1343
    .line 1344
    .line 1345
    return-object v21

    .line 1346
    nop

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
