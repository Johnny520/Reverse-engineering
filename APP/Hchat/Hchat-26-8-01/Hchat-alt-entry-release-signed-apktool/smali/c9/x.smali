.class public final synthetic Lc9/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 14
    iput p1, p0, Lc9/x;->g:I

    iput-object p2, p0, Lc9/x;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc9/x;->j:Ljava/lang/Object;

    iput-boolean p4, p0, Lc9/x;->h:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lfb/b;ZLjava/io/File;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc9/x;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/x;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lc9/x;->h:Z

    .line 10
    .line 11
    iput-object p3, p0, Lc9/x;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 15
    const/4 v0, 0x2

    iput v0, p0, Lc9/x;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lc9/x;->h:Z

    iput-object p2, p0, Lc9/x;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc9/x;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc9/x;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x5

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    iget-boolean v9, v1, Lc9/x;->h:Z

    .line 14
    .line 15
    iget-object v10, v1, Lc9/x;->j:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v11, v1, Lc9/x;->i:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v11, Ljava/util/ArrayList;

    .line 23
    .line 24
    check-cast v10, Li0/a1;

    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, Lr/h;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v2, Lwb/sr;

    .line 34
    .line 35
    const/16 v3, 0xe

    .line 36
    .line 37
    invoke-direct {v2, v3}, Lwb/sr;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    new-instance v7, Li0/q0;

    .line 45
    .line 46
    invoke-direct {v7, v2, v6, v11}, Li0/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Li0/c;

    .line 50
    .line 51
    invoke-direct {v2, v11, v5}, Li0/c;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Lwb/rv;

    .line 55
    .line 56
    invoke-direct {v5, v10, v11, v9}, Lwb/rv;-><init>(Li0/a1;Ljava/util/ArrayList;Z)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Ls0/d;

    .line 60
    .line 61
    const v9, 0x2fd4df92

    .line 62
    .line 63
    .line 64
    invoke-direct {v6, v9, v5, v8}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, Lr/h;->a:Lac/k;

    .line 68
    .line 69
    new-instance v5, Lb5/c;

    .line 70
    .line 71
    invoke-direct {v5, v7, v2, v6}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3, v5}, Lac/k;->b(ILb5/c;)V

    .line 75
    .line 76
    .line 77
    return-object v4

    .line 78
    :pswitch_0
    check-cast v11, Lfg/l;

    .line 79
    .line 80
    move-object/from16 v0, p1

    .line 81
    .line 82
    check-cast v0, Lh/t;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lh/t;->b()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v11, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-interface {v11, v10}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    const/4 v5, 0x6

    .line 112
    if-nez v9, :cond_0

    .line 113
    .line 114
    if-ne v0, v4, :cond_0

    .line 115
    .line 116
    const/16 v0, 0x78

    .line 117
    .line 118
    invoke-static {v0, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0, v3}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/16 v4, 0x5a

    .line 127
    .line 128
    invoke-static {v4, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2, v3}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    sget v3, Lh/k;->b:I

    .line 137
    .line 138
    new-instance v3, Lh/e0;

    .line 139
    .line 140
    invoke-direct {v3, v0, v2}, Lh/e0;-><init>(Lh/r0;Lh/s0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_0
    if-lt v4, v0, :cond_1

    .line 145
    .line 146
    move v0, v8

    .line 147
    goto :goto_0

    .line 148
    :cond_1
    move v0, v7

    .line 149
    :goto_0
    const/16 v4, 0xf0

    .line 150
    .line 151
    invoke-static {v4, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    new-instance v9, Lwb/m6;

    .line 156
    .line 157
    const/4 v10, 0x4

    .line 158
    invoke-direct {v9, v10, v0}, Lwb/m6;-><init>(IZ)V

    .line 159
    .line 160
    .line 161
    sget-object v10, Lh/m0;->a:Li/m1;

    .line 162
    .line 163
    new-instance v10, Lh/l0;

    .line 164
    .line 165
    invoke-direct {v10, v9, v7}, Lh/l0;-><init>(Lfg/l;I)V

    .line 166
    .line 167
    .line 168
    new-instance v7, Lh/r0;

    .line 169
    .line 170
    new-instance v11, Lh/h1;

    .line 171
    .line 172
    new-instance v13, Lh/f1;

    .line 173
    .line 174
    invoke-direct {v13, v10, v4}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 175
    .line 176
    .line 177
    const/16 v16, 0x0

    .line 178
    .line 179
    const/16 v17, 0x7d

    .line 180
    .line 181
    const/4 v12, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    invoke-direct/range {v11 .. v17}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v7, v11}, Lh/r0;-><init>(Lh/h1;)V

    .line 188
    .line 189
    .line 190
    const/16 v4, 0xa0

    .line 191
    .line 192
    invoke-static {v4, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-static {v4, v3}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v7, v4}, Lh/r0;->a(Lh/r0;)Lh/r0;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    const/16 v7, 0xdc

    .line 205
    .line 206
    invoke-static {v7, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    new-instance v9, Lwb/m6;

    .line 211
    .line 212
    invoke-direct {v9, v6, v0}, Lwb/m6;-><init>(IZ)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Lh/l0;

    .line 216
    .line 217
    invoke-direct {v0, v9, v8}, Lh/l0;-><init>(Lfg/l;I)V

    .line 218
    .line 219
    .line 220
    new-instance v6, Lh/s0;

    .line 221
    .line 222
    new-instance v8, Lh/h1;

    .line 223
    .line 224
    new-instance v10, Lh/f1;

    .line 225
    .line 226
    invoke-direct {v10, v0, v7}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 227
    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const/16 v14, 0x7d

    .line 231
    .line 232
    const/4 v9, 0x0

    .line 233
    const/4 v11, 0x0

    .line 234
    invoke-direct/range {v8 .. v14}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 235
    .line 236
    .line 237
    invoke-direct {v6, v8}, Lh/s0;-><init>(Lh/h1;)V

    .line 238
    .line 239
    .line 240
    const/16 v0, 0x8c

    .line 241
    .line 242
    invoke-static {v0, v5, v2}, Li/d;->p(IILi/v;)Li/l1;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0, v3}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v6, v0}, Lh/s0;->a(Lh/s0;)Lh/s0;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget v2, Lh/k;->b:I

    .line 255
    .line 256
    new-instance v3, Lh/e0;

    .line 257
    .line 258
    invoke-direct {v3, v4, v0}, Lh/e0;-><init>(Lh/r0;Lh/s0;)V

    .line 259
    .line 260
    .line 261
    :goto_1
    return-object v3

    .line 262
    :pswitch_1
    check-cast v11, Landroid/content/SharedPreferences;

    .line 263
    .line 264
    check-cast v10, Li0/a1;

    .line 265
    .line 266
    move-object/from16 v0, p1

    .line 267
    .line 268
    check-cast v0, Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-nez v9, :cond_2

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_2
    const-string v3, "glass_nav"

    .line 278
    .line 279
    invoke-static {v10, v0, v11, v3, v2}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 280
    .line 281
    .line 282
    :goto_2
    return-object v4

    .line 283
    :pswitch_2
    check-cast v11, Lfb/b;

    .line 284
    .line 285
    check-cast v10, Ljava/io/File;

    .line 286
    .line 287
    move-object/from16 v0, p1

    .line 288
    .line 289
    check-cast v0, Ljava/io/File;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v11}, Lfb/b;->d()V

    .line 295
    .line 296
    .line 297
    if-nez v9, :cond_3

    .line 298
    .line 299
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_4

    .line 304
    .line 305
    :cond_3
    move v7, v8

    .line 306
    :cond_4
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0

    .line 311
    :pswitch_3
    check-cast v11, Ljava/util/List;

    .line 312
    .line 313
    check-cast v10, Ljava/lang/String;

    .line 314
    .line 315
    move-object/from16 v4, p1

    .line 316
    .line 317
    check-cast v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    move v12, v7

    .line 331
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_18

    .line 336
    .line 337
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    if-eqz v13, :cond_5

    .line 348
    .line 349
    move v7, v3

    .line 350
    move-object/from16 p1, v4

    .line 351
    .line 352
    move/from16 v19, v5

    .line 353
    .line 354
    move-object v4, v2

    .line 355
    goto/16 :goto_14

    .line 356
    .line 357
    :cond_5
    if-eqz v6, :cond_16

    .line 358
    .line 359
    iget-object v13, v6, Lh8/a;->b:Lg8/i;

    .line 360
    .line 361
    iget-object v14, v6, Lh8/a;->d:Lh/Hchat/dexkit/DexFinder;

    .line 362
    .line 363
    if-eqz v0, :cond_6

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    :goto_4
    move-object v15, v0

    .line 370
    goto :goto_5

    .line 371
    :cond_6
    const-string v0, ""

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :goto_5
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-nez v0, :cond_16

    .line 379
    .line 380
    invoke-static {v15}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    const-string v2, " talker="

    .line 385
    .line 386
    const-string v3, " enabled="

    .line 387
    .line 388
    if-eqz v0, :cond_e

    .line 389
    .line 390
    const-string v0, "\u7fa4\u804a\u514d\u6253\u6270RoomSDK\u5b9e\u4f8b\u4e3a\u7a7a: talker="

    .line 391
    .line 392
    const-string v13, "\u7fa4\u804a\u514d\u6253\u6270\u64cd\u4f5c\u5bf9\u8c61\u4e3a\u7a7a: talker="

    .line 393
    .line 394
    move/from16 v18, v7

    .line 395
    .line 396
    iget-object v7, v14, Lh/Hchat/dexkit/DexFinder;->chatroomMuteServiceGetterMethod:Ljava/lang/reflect/Method;

    .line 397
    .line 398
    iget-object v5, v14, Lh/Hchat/dexkit/DexFinder;->chatroomMuteBuildMethod:Ljava/lang/reflect/Method;

    .line 399
    .line 400
    iget-object v1, v14, Lh/Hchat/dexkit/DexFinder;->chatroomMuteSubmitMethod:Ljava/lang/reflect/Method;

    .line 401
    .line 402
    if-eqz v7, :cond_7

    .line 403
    .line 404
    if-eqz v5, :cond_7

    .line 405
    .line 406
    if-nez v1, :cond_8

    .line 407
    .line 408
    :cond_7
    move-object/from16 p1, v4

    .line 409
    .line 410
    const/4 v14, 0x3

    .line 411
    goto/16 :goto_c

    .line 412
    .line 413
    :cond_8
    move-object/from16 p1, v4

    .line 414
    .line 415
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-static {v14, v4}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    invoke-static {v7, v4, v14}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    if-eqz v4, :cond_9

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-nez v7, :cond_a

    .line 442
    .line 443
    :cond_9
    const/4 v14, 0x3

    .line 444
    goto :goto_a

    .line 445
    :cond_a
    xor-int/lit8 v0, v9, 0x1

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    array-length v7, v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 452
    const/4 v14, 0x3

    .line 453
    if-ne v7, v14, :cond_b

    .line 454
    .line 455
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    filled-new-array {v15, v0, v7}, [Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-static {v5, v4, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    goto :goto_6

    .line 472
    :catchall_0
    move-exception v0

    .line 473
    goto :goto_b

    .line 474
    :cond_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    filled-new-array {v15, v0}, [Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v5, v4, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    :goto_6
    if-eqz v0, :cond_d

    .line 487
    .line 488
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    if-nez v4, :cond_c

    .line 497
    .line 498
    goto :goto_7

    .line 499
    :cond_c
    move/from16 v4, v18

    .line 500
    .line 501
    new-array v5, v4, [Ljava/lang/Object;

    .line 502
    .line 503
    invoke-static {v1, v0, v5}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move/from16 v19, v14

    .line 507
    .line 508
    const/4 v4, 0x0

    .line 509
    const/4 v7, 0x2

    .line 510
    goto/16 :goto_10

    .line 511
    .line 512
    :cond_d
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 513
    .line 514
    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    :goto_8
    move/from16 v19, v14

    .line 528
    .line 529
    :goto_9
    const/4 v4, 0x0

    .line 530
    const/4 v7, 0x2

    .line 531
    goto/16 :goto_13

    .line 532
    .line 533
    :catchall_1
    move-exception v0

    .line 534
    const/4 v14, 0x3

    .line 535
    goto :goto_b

    .line 536
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 549
    .line 550
    .line 551
    goto :goto_8

    .line 552
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    const-string v4, "\u7fa4\u804a\u514d\u6253\u6270\u8bbe\u7f6e\u5931\u8d25: "

    .line 555
    .line 556
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    goto :goto_8

    .line 586
    :goto_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    const-string v1, "\u7fa4\u804a\u514d\u6253\u6270API\u5c1a\u672a\u5c31\u7eea: talker="

    .line 589
    .line 590
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_e
    move-object/from16 p1, v4

    .line 605
    .line 606
    move/from16 v19, v5

    .line 607
    .line 608
    if-eqz v9, :cond_f

    .line 609
    .line 610
    iget-object v0, v14, Lh/Hchat/dexkit/DexFinder;->contactMuteEnableMethod:Ljava/lang/reflect/Method;

    .line 611
    .line 612
    goto :goto_d

    .line 613
    :cond_f
    iget-object v0, v14, Lh/Hchat/dexkit/DexFinder;->contactMuteDisableMethod:Ljava/lang/reflect/Method;

    .line 614
    .line 615
    :goto_d
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-eqz v1, :cond_10

    .line 620
    .line 621
    goto :goto_e

    .line 622
    :cond_10
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-virtual {v13, v1}, Lg8/i;->R(Ljava/lang/String;)Lb/e;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    if-eqz v1, :cond_11

    .line 631
    .line 632
    iget-object v1, v1, Lb/e;->i:Ljava/lang/Object;

    .line 633
    .line 634
    goto :goto_f

    .line 635
    :cond_11
    :goto_e
    const/4 v1, 0x0

    .line 636
    :goto_f
    if-nez v0, :cond_12

    .line 637
    .line 638
    new-instance v0, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    const-string v1, "\u79c1\u804a\u514d\u6253\u6270API\u5c1a\u672a\u5c31\u7eea: muteMethod=null talker="

    .line 641
    .line 642
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    goto/16 :goto_9

    .line 662
    .line 663
    :cond_12
    if-nez v1, :cond_13

    .line 664
    .line 665
    new-instance v0, Ljava/lang/StringBuilder;

    .line 666
    .line 667
    const-string v1, "\u79c1\u804a\u514d\u6253\u6270API\u5c1a\u672a\u5c31\u7eea: contact=null talker="

    .line 668
    .line 669
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_9

    .line 689
    .line 690
    :cond_13
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    array-length v5, v4

    .line 695
    const/4 v7, 0x2

    .line 696
    if-ne v5, v7, :cond_14

    .line 697
    .line 698
    const/16 v18, 0x0

    .line 699
    .line 700
    aget-object v4, v4, v18

    .line 701
    .line 702
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    if-nez v4, :cond_15

    .line 707
    .line 708
    :cond_14
    const/4 v4, 0x0

    .line 709
    goto :goto_12

    .line 710
    :cond_15
    :try_start_2
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 711
    .line 712
    filled-new-array {v1, v4}, [Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 716
    const/4 v4, 0x0

    .line 717
    :try_start_3
    invoke-static {v0, v4, v1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 718
    .line 719
    .line 720
    :goto_10
    add-int/lit8 v12, v12, 0x1

    .line 721
    .line 722
    goto :goto_13

    .line 723
    :catchall_2
    move-exception v0

    .line 724
    goto :goto_11

    .line 725
    :catchall_3
    move-exception v0

    .line 726
    const/4 v4, 0x0

    .line 727
    :goto_11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 728
    .line 729
    const-string v5, "\u79c1\u804a\u514d\u6253\u6270\u8bbe\u7f6e\u5931\u8d25: "

    .line 730
    .line 731
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    goto :goto_13

    .line 761
    :goto_12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 762
    .line 763
    const-string v13, "\u79c1\u804a\u514d\u6253\u6270API\u5c1a\u672a\u5c31\u7eea: typeMismatch method="

    .line 764
    .line 765
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    const-string v0, " contact="

    .line 776
    .line 777
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v6, v0}, Lh8/a;->f(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    goto :goto_13

    .line 811
    :cond_16
    move v7, v3

    .line 812
    move-object/from16 p1, v4

    .line 813
    .line 814
    move/from16 v19, v5

    .line 815
    .line 816
    move-object v4, v2

    .line 817
    :goto_13
    invoke-virtual/range {p1 .. p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    if-nez v0, :cond_17

    .line 822
    .line 823
    const-wide/16 v0, 0x12c

    .line 824
    .line 825
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 826
    .line 827
    .line 828
    :cond_17
    :goto_14
    move-object/from16 v1, p0

    .line 829
    .line 830
    move-object v2, v4

    .line 831
    move v3, v7

    .line 832
    move/from16 v5, v19

    .line 833
    .line 834
    const/4 v7, 0x0

    .line 835
    move-object/from16 v4, p1

    .line 836
    .line 837
    goto/16 :goto_3

    .line 838
    .line 839
    :cond_18
    new-instance v0, Lc9/y;

    .line 840
    .line 841
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    const/4 v4, 0x0

    .line 846
    invoke-direct {v0, v10, v12, v1, v4}, Lc9/y;-><init>(Ljava/lang/String;IIZ)V

    .line 847
    .line 848
    .line 849
    return-object v0

    .line 850
    nop

    .line 851
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
