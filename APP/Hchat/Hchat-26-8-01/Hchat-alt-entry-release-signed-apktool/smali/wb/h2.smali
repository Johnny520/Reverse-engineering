.class public final Lwb/h2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lwb/h2;

.field public static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lwb/h2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/h2;->a:Lwb/h2;

    .line 7
    .line 8
    const-string v6, "qmessage"

    .line 9
    .line 10
    const-string v7, "floatbottle"

    .line 11
    .line 12
    const-string v1, "message_fold"

    .line 13
    .line 14
    const-string v2, "conversationboxservice"

    .line 15
    .line 16
    const-string v3, "officialaccounts"

    .line 17
    .line 18
    const-string v4, "appbrand_notify_message"

    .line 19
    .line 20
    const-string v5, "notifymessage"

    .line 21
    .line 22
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lwb/h2;->b:Ljava/util/Set;

    .line 31
    .line 32
    return-void
.end method

.method public static final f(Ljava/lang/String;Ljava/util/List;)Lwb/f2;
    .locals 25

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-eqz v1, :cond_50

    .line 6
    .line 7
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Lc9/a;

    .line 31
    .line 32
    iget-object v4, v4, Lc9/a;->e:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v0, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v2}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v0, v5

    .line 55
    :goto_1
    if-nez v0, :cond_2

    .line 56
    .line 57
    move-object v0, v4

    .line 58
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 82
    .line 83
    iget-object v7, v7, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    :cond_4
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_5

    .line 111
    .line 112
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    move-object v8, v7

    .line 117
    check-cast v8, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-nez v8, :cond_4

    .line 124
    .line 125
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    goto :goto_5

    .line 134
    :goto_4
    new-instance v6, Lsf/f;

    .line 135
    .line 136
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object v0, v6

    .line 140
    :goto_5
    nop

    .line 141
    instance-of v6, v0, Lsf/f;

    .line 142
    .line 143
    sget-object v7, Ltf/v;->g:Ltf/v;

    .line 144
    .line 145
    if-eqz v6, :cond_6

    .line 146
    .line 147
    move-object v0, v7

    .line 148
    :cond_6
    move-object v6, v0

    .line 149
    check-cast v6, Ljava/util/Set;

    .line 150
    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    :try_start_1
    const-string v0, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE \'gh\\_%\' ESCAPE \'\\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"

    .line 154
    .line 155
    invoke-virtual {v2, v0, v5}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move-object v0, v5

    .line 161
    :goto_6
    if-nez v0, :cond_8

    .line 162
    .line 163
    move-object v0, v4

    .line 164
    :cond_8
    new-instance v8, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_9

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    check-cast v9, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 188
    .line 189
    iget-object v9, v9, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_7

    .line 203
    :catchall_1
    move-exception v0

    .line 204
    goto :goto_9

    .line 205
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    :cond_a
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-eqz v9, :cond_b

    .line 219
    .line 220
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    move-object v10, v9

    .line 225
    check-cast v10, Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-nez v10, :cond_a

    .line 232
    .line 233
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_b
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    goto :goto_a

    .line 242
    :goto_9
    new-instance v8, Lsf/f;

    .line 243
    .line 244
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    move-object v0, v8

    .line 248
    :goto_a
    nop

    .line 249
    instance-of v8, v0, Lsf/f;

    .line 250
    .line 251
    if-eqz v8, :cond_c

    .line 252
    .line 253
    goto :goto_b

    .line 254
    :cond_c
    move-object v7, v0

    .line 255
    :goto_b
    check-cast v7, Ljava/util/Set;

    .line 256
    .line 257
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 258
    .line 259
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 260
    .line 261
    .line 262
    if-eqz v2, :cond_d

    .line 263
    .line 264
    :try_start_2
    invoke-virtual {v2}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 268
    goto :goto_c

    .line 269
    :catchall_2
    move-exception v0

    .line 270
    new-instance v9, Lsf/f;

    .line 271
    .line 272
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_d
    move-object v0, v5

    .line 277
    :goto_c
    if-nez v0, :cond_e

    .line 278
    .line 279
    move-object v9, v4

    .line 280
    goto :goto_d

    .line 281
    :cond_e
    move-object v9, v0

    .line 282
    :goto_d
    nop

    .line 283
    instance-of v0, v9, Lsf/f;

    .line 284
    .line 285
    if-eqz v0, :cond_f

    .line 286
    .line 287
    move-object v9, v4

    .line 288
    :cond_f
    check-cast v9, Ljava/lang/Iterable;

    .line 289
    .line 290
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :cond_10
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-eqz v9, :cond_15

    .line 299
    .line 300
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    check-cast v9, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 305
    .line 306
    iget-object v10, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 307
    .line 308
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    if-eqz v11, :cond_11

    .line 313
    .line 314
    iget-object v10, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 315
    .line 316
    :cond_11
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    if-eqz v11, :cond_12

    .line 321
    .line 322
    goto :goto_e

    .line 323
    :cond_12
    iget-object v9, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 324
    .line 325
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    :cond_13
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    if-eqz v11, :cond_10

    .line 334
    .line 335
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    check-cast v11, Ljava/lang/String;

    .line 340
    .line 341
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    if-nez v12, :cond_13

    .line 346
    .line 347
    invoke-virtual {v8, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    if-nez v12, :cond_14

    .line 352
    .line 353
    new-instance v12, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v8, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    :cond_14
    check-cast v12, Ljava/util/List;

    .line 362
    .line 363
    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_15
    invoke-static/range {p1 .. p1}, Lwb/h2;->g(Ljava/util/List;)Ljava/util/ArrayList;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    invoke-static {v9}, Ltf/y;->a0(I)I

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    const/16 v10, 0x10

    .line 380
    .line 381
    if-ge v9, v10, :cond_16

    .line 382
    .line 383
    move v9, v10

    .line 384
    :cond_16
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 385
    .line 386
    invoke-direct {v10, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    if-eqz v9, :cond_17

    .line 398
    .line 399
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    check-cast v9, Lwb/g2;

    .line 404
    .line 405
    iget-object v11, v9, Lwb/g2;->a:Lc9/a;

    .line 406
    .line 407
    iget-object v11, v11, Lc9/a;->a:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v9, v9, Lwb/g2;->c:Ljava/lang/String;

    .line 410
    .line 411
    invoke-interface {v10, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    goto :goto_10

    .line 415
    :cond_17
    new-instance v0, Luf/g;

    .line 416
    .line 417
    invoke-direct {v0}, Luf/g;-><init>()V

    .line 418
    .line 419
    .line 420
    new-instance v9, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v11

    .line 429
    :cond_18
    :goto_11
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    if-eqz v12, :cond_19

    .line 434
    .line 435
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    move-object v13, v12

    .line 440
    check-cast v13, Lc9/a;

    .line 441
    .line 442
    iget-object v13, v13, Lc9/a;->a:Ljava/lang/String;

    .line 443
    .line 444
    move-object/from16 v14, p0

    .line 445
    .line 446
    invoke-static {v13, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v13

    .line 450
    if-nez v13, :cond_18

    .line 451
    .line 452
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    goto :goto_11

    .line 456
    :cond_19
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    :cond_1a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    if-eqz v11, :cond_1d

    .line 465
    .line 466
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    check-cast v11, Lc9/a;

    .line 471
    .line 472
    iget-object v12, v11, Lc9/a;->e:Ljava/util/List;

    .line 473
    .line 474
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    :cond_1b
    :goto_12
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v13

    .line 482
    if-eqz v13, :cond_1a

    .line 483
    .line 484
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v13

    .line 488
    check-cast v13, Ljava/lang/String;

    .line 489
    .line 490
    iget-object v14, v11, Lc9/a;->a:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v10, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    check-cast v14, Ljava/lang/String;

    .line 497
    .line 498
    if-eqz v14, :cond_1b

    .line 499
    .line 500
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 501
    .line 502
    .line 503
    move-result v15

    .line 504
    if-nez v15, :cond_1c

    .line 505
    .line 506
    goto :goto_13

    .line 507
    :cond_1c
    move-object v14, v5

    .line 508
    :goto_13
    if-eqz v14, :cond_1b

    .line 509
    .line 510
    const-string v15, "\u5df2\u5728\uff1a"

    .line 511
    .line 512
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v14

    .line 516
    invoke-virtual {v0, v13, v14}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    goto :goto_12

    .line 520
    :cond_1d
    invoke-virtual {v0}, Luf/g;->c()Luf/g;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    invoke-virtual {v1}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 529
    .line 530
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    const-string v12, ""

    .line 542
    .line 543
    const/4 v14, 0x1

    .line 544
    if-eqz v0, :cond_34

    .line 545
    .line 546
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Ll8/b;

    .line 551
    .line 552
    iget-object v0, v0, Ll8/b;->a:Ljava/lang/String;

    .line 553
    .line 554
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v15

    .line 562
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    if-nez v0, :cond_33

    .line 567
    .line 568
    invoke-static {v15}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-nez v0, :cond_33

    .line 573
    .line 574
    sget-object v0, Lwb/h2;->b:Ljava/util/Set;

    .line 575
    .line 576
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-eqz v0, :cond_1e

    .line 581
    .line 582
    goto/16 :goto_24

    .line 583
    .line 584
    :cond_1e
    if-eqz v2, :cond_1f

    .line 585
    .line 586
    :try_start_3
    invoke-virtual {v2, v15}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 587
    .line 588
    .line 589
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 590
    goto :goto_15

    .line 591
    :catchall_3
    move-exception v0

    .line 592
    new-instance v5, Lsf/f;

    .line 593
    .line 594
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 595
    .line 596
    .line 597
    goto :goto_16

    .line 598
    :cond_1f
    const/4 v0, 0x0

    .line 599
    :goto_15
    move-object v5, v0

    .line 600
    :goto_16
    nop

    .line 601
    instance-of v0, v5, Lsf/f;

    .line 602
    .line 603
    if-eqz v0, :cond_20

    .line 604
    .line 605
    const/4 v5, 0x0

    .line 606
    :cond_20
    check-cast v5, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 607
    .line 608
    if-nez v5, :cond_21

    .line 609
    .line 610
    const-string v0, "filehelper"

    .line 611
    .line 612
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-nez v0, :cond_21

    .line 617
    .line 618
    invoke-interface {v3, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-nez v0, :cond_21

    .line 623
    .line 624
    goto/16 :goto_24

    .line 625
    .line 626
    :cond_21
    if-eqz v5, :cond_22

    .line 627
    .line 628
    invoke-virtual {v5}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-ne v0, v14, :cond_22

    .line 633
    .line 634
    move v0, v14

    .line 635
    goto :goto_17

    .line 636
    :cond_22
    const/4 v0, 0x0

    .line 637
    :goto_17
    if-eqz v5, :cond_23

    .line 638
    .line 639
    invoke-static {v5, v0}, Lr9/e0;->Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v16

    .line 643
    goto :goto_18

    .line 644
    :cond_23
    const/16 v16, 0x0

    .line 645
    .line 646
    :goto_18
    if-nez v16, :cond_24

    .line 647
    .line 648
    move-object/from16 v16, v12

    .line 649
    .line 650
    :cond_24
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 651
    .line 652
    .line 653
    move-result v17

    .line 654
    if-eqz v17, :cond_25

    .line 655
    .line 656
    invoke-virtual {v1, v15}, Lh8/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v16

    .line 660
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 661
    .line 662
    .line 663
    move-result v17

    .line 664
    if-eqz v17, :cond_25

    .line 665
    .line 666
    move-object/from16 v16, v15

    .line 667
    .line 668
    :cond_25
    move-object/from16 v17, v16

    .line 669
    .line 670
    if-eqz v5, :cond_26

    .line 671
    .line 672
    iget-object v13, v5, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 673
    .line 674
    goto :goto_19

    .line 675
    :cond_26
    const/4 v13, 0x0

    .line 676
    :goto_19
    if-nez v13, :cond_27

    .line 677
    .line 678
    move-object/from16 v19, v12

    .line 679
    .line 680
    goto :goto_1a

    .line 681
    :cond_27
    move-object/from16 v19, v13

    .line 682
    .line 683
    :goto_1a
    if-eqz v5, :cond_28

    .line 684
    .line 685
    iget-object v13, v5, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 686
    .line 687
    goto :goto_1b

    .line 688
    :cond_28
    const/4 v13, 0x0

    .line 689
    :goto_1b
    if-nez v13, :cond_29

    .line 690
    .line 691
    move-object/from16 v20, v12

    .line 692
    .line 693
    goto :goto_1c

    .line 694
    :cond_29
    move-object/from16 v20, v13

    .line 695
    .line 696
    :goto_1c
    invoke-virtual {v8, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v13

    .line 700
    check-cast v13, Ljava/util/List;

    .line 701
    .line 702
    if-nez v13, :cond_2a

    .line 703
    .line 704
    move-object v13, v4

    .line 705
    :cond_2a
    invoke-static {v13}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 706
    .line 707
    .line 708
    move-result-object v13

    .line 709
    invoke-static {v13}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v21

    .line 713
    if-eqz v5, :cond_2c

    .line 714
    .line 715
    invoke-virtual {v5}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 716
    .line 717
    .line 718
    move-result v13

    .line 719
    if-ne v13, v14, :cond_2b

    .line 720
    .line 721
    move v13, v14

    .line 722
    goto :goto_1d

    .line 723
    :cond_2b
    const/4 v13, 0x0

    .line 724
    :goto_1d
    move/from16 v22, v13

    .line 725
    .line 726
    goto :goto_1e

    .line 727
    :cond_2c
    const/16 v22, 0x0

    .line 728
    .line 729
    :goto_1e
    invoke-virtual {v9, v15}, Luf/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v13

    .line 733
    check-cast v13, Ljava/lang/String;

    .line 734
    .line 735
    if-nez v13, :cond_2d

    .line 736
    .line 737
    move-object/from16 v23, v12

    .line 738
    .line 739
    goto :goto_1f

    .line 740
    :cond_2d
    move-object/from16 v23, v13

    .line 741
    .line 742
    :goto_1f
    if-eqz v5, :cond_2e

    .line 743
    .line 744
    iget-object v12, v5, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 745
    .line 746
    goto :goto_20

    .line 747
    :cond_2e
    const/4 v12, 0x0

    .line 748
    :goto_20
    if-eqz v5, :cond_2f

    .line 749
    .line 750
    iget-object v13, v5, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 751
    .line 752
    goto :goto_21

    .line 753
    :cond_2f
    const/4 v13, 0x0

    .line 754
    :goto_21
    if-eqz v5, :cond_30

    .line 755
    .line 756
    iget-object v5, v5, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 757
    .line 758
    goto :goto_22

    .line 759
    :cond_30
    const/4 v5, 0x0

    .line 760
    :goto_22
    filled-new-array {v12, v13, v5, v15}, [Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    invoke-static {v5}, La/a;->z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 765
    .line 766
    .line 767
    move-result-object v5

    .line 768
    new-instance v12, Ljava/util/ArrayList;

    .line 769
    .line 770
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    :cond_31
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 778
    .line 779
    .line 780
    move-result v13

    .line 781
    if-eqz v13, :cond_32

    .line 782
    .line 783
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    move-object v14, v13

    .line 788
    check-cast v14, Ljava/lang/String;

    .line 789
    .line 790
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 791
    .line 792
    .line 793
    move-result v14

    .line 794
    if-nez v14, :cond_31

    .line 795
    .line 796
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    goto :goto_23

    .line 800
    :cond_32
    invoke-static {v12}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 801
    .line 802
    .line 803
    move-result-object v5

    .line 804
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v24

    .line 808
    move-object/from16 v16, v15

    .line 809
    .line 810
    new-instance v15, Lwb/s0;

    .line 811
    .line 812
    move/from16 v18, v0

    .line 813
    .line 814
    invoke-direct/range {v15 .. v24}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;)V

    .line 815
    .line 816
    .line 817
    move-object/from16 v5, v16

    .line 818
    .line 819
    invoke-interface {v10, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    :cond_33
    :goto_24
    const/4 v5, 0x0

    .line 823
    goto/16 :goto_14

    .line 824
    .line 825
    :cond_34
    check-cast v3, Ljava/lang/Iterable;

    .line 826
    .line 827
    new-instance v0, Ljava/util/ArrayList;

    .line 828
    .line 829
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 830
    .line 831
    .line 832
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    :cond_35
    :goto_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-eqz v5, :cond_36

    .line 841
    .line 842
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    move-object v11, v5

    .line 847
    check-cast v11, Ljava/lang/String;

    .line 848
    .line 849
    invoke-virtual {v10, v11}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v11

    .line 853
    if-nez v11, :cond_35

    .line 854
    .line 855
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    goto :goto_25

    .line 859
    :cond_36
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-eqz v0, :cond_4c

    .line 868
    .line 869
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    move-object v5, v0

    .line 874
    check-cast v5, Ljava/lang/String;

    .line 875
    .line 876
    if-eqz v2, :cond_37

    .line 877
    .line 878
    :try_start_4
    invoke-virtual {v2, v5}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 879
    .line 880
    .line 881
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 882
    goto :goto_27

    .line 883
    :catchall_4
    move-exception v0

    .line 884
    new-instance v11, Lsf/f;

    .line 885
    .line 886
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 887
    .line 888
    .line 889
    goto :goto_28

    .line 890
    :cond_37
    const/4 v0, 0x0

    .line 891
    :goto_27
    move-object v11, v0

    .line 892
    :goto_28
    nop

    .line 893
    instance-of v0, v11, Lsf/f;

    .line 894
    .line 895
    if-eqz v0, :cond_38

    .line 896
    .line 897
    const/4 v11, 0x0

    .line 898
    :cond_38
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 899
    .line 900
    if-eqz v11, :cond_39

    .line 901
    .line 902
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    if-ne v0, v14, :cond_39

    .line 907
    .line 908
    goto :goto_29

    .line 909
    :cond_39
    const-string v0, "@chatroom"

    .line 910
    .line 911
    const/4 v13, 0x0

    .line 912
    invoke-static {v5, v0, v13}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 913
    .line 914
    .line 915
    move-result v0

    .line 916
    if-nez v0, :cond_3b

    .line 917
    .line 918
    const-string v0, "@im.chatroom"

    .line 919
    .line 920
    invoke-static {v5, v0, v13}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-eqz v0, :cond_3a

    .line 925
    .line 926
    goto :goto_29

    .line 927
    :cond_3a
    const/4 v13, 0x0

    .line 928
    goto :goto_2a

    .line 929
    :cond_3b
    :goto_29
    move v13, v14

    .line 930
    :goto_2a
    if-eqz v11, :cond_3c

    .line 931
    .line 932
    invoke-static {v11, v13}, Lr9/e0;->Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    goto :goto_2b

    .line 937
    :cond_3c
    const/4 v0, 0x0

    .line 938
    :goto_2b
    if-nez v0, :cond_3d

    .line 939
    .line 940
    move-object v0, v12

    .line 941
    :cond_3d
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 942
    .line 943
    .line 944
    move-result v15

    .line 945
    if-eqz v15, :cond_3e

    .line 946
    .line 947
    invoke-virtual {v1, v5}, Lh8/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 952
    .line 953
    .line 954
    move-result v15

    .line 955
    if-eqz v15, :cond_3e

    .line 956
    .line 957
    move-object v0, v5

    .line 958
    :cond_3e
    move-object/from16 v17, v0

    .line 959
    .line 960
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    if-eqz v11, :cond_3f

    .line 964
    .line 965
    iget-object v0, v11, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 966
    .line 967
    goto :goto_2c

    .line 968
    :cond_3f
    const/4 v0, 0x0

    .line 969
    :goto_2c
    if-nez v0, :cond_40

    .line 970
    .line 971
    move-object/from16 v19, v12

    .line 972
    .line 973
    goto :goto_2d

    .line 974
    :cond_40
    move-object/from16 v19, v0

    .line 975
    .line 976
    :goto_2d
    if-eqz v11, :cond_41

    .line 977
    .line 978
    iget-object v0, v11, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 979
    .line 980
    goto :goto_2e

    .line 981
    :cond_41
    const/4 v0, 0x0

    .line 982
    :goto_2e
    if-nez v0, :cond_42

    .line 983
    .line 984
    move-object/from16 v20, v12

    .line 985
    .line 986
    goto :goto_2f

    .line 987
    :cond_42
    move-object/from16 v20, v0

    .line 988
    .line 989
    :goto_2f
    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    check-cast v0, Ljava/util/List;

    .line 994
    .line 995
    if-nez v0, :cond_43

    .line 996
    .line 997
    move-object v0, v4

    .line 998
    :cond_43
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v21

    .line 1006
    if-eqz v11, :cond_44

    .line 1007
    .line 1008
    invoke-virtual {v11}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-ne v0, v14, :cond_44

    .line 1013
    .line 1014
    const/4 v15, 0x0

    .line 1015
    goto :goto_30

    .line 1016
    :cond_44
    const-string v0, "gh_"

    .line 1017
    .line 1018
    const/4 v15, 0x0

    .line 1019
    invoke-static {v5, v0, v15}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    if-eqz v0, :cond_45

    .line 1024
    .line 1025
    :goto_30
    move/from16 v22, v14

    .line 1026
    .line 1027
    goto :goto_31

    .line 1028
    :cond_45
    move/from16 v22, v15

    .line 1029
    .line 1030
    :goto_31
    invoke-virtual {v9, v5}, Luf/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    check-cast v0, Ljava/lang/String;

    .line 1035
    .line 1036
    if-nez v0, :cond_46

    .line 1037
    .line 1038
    move-object/from16 v23, v12

    .line 1039
    .line 1040
    goto :goto_32

    .line 1041
    :cond_46
    move-object/from16 v23, v0

    .line 1042
    .line 1043
    :goto_32
    if-eqz v11, :cond_47

    .line 1044
    .line 1045
    iget-object v0, v11, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 1046
    .line 1047
    goto :goto_33

    .line 1048
    :cond_47
    const/4 v0, 0x0

    .line 1049
    :goto_33
    if-eqz v11, :cond_48

    .line 1050
    .line 1051
    iget-object v14, v11, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 1052
    .line 1053
    goto :goto_34

    .line 1054
    :cond_48
    const/4 v14, 0x0

    .line 1055
    :goto_34
    if-eqz v11, :cond_49

    .line 1056
    .line 1057
    iget-object v11, v11, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 1058
    .line 1059
    goto :goto_35

    .line 1060
    :cond_49
    const/4 v11, 0x0

    .line 1061
    :goto_35
    filled-new-array {v0, v14, v11, v5}, [Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-static {v0}, La/a;->z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    new-instance v11, Ljava/util/ArrayList;

    .line 1070
    .line 1071
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    :cond_4a
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v14

    .line 1082
    if-eqz v14, :cond_4b

    .line 1083
    .line 1084
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v14

    .line 1088
    move-object/from16 v16, v14

    .line 1089
    .line 1090
    check-cast v16, Ljava/lang/String;

    .line 1091
    .line 1092
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v16

    .line 1096
    if-nez v16, :cond_4a

    .line 1097
    .line 1098
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    goto :goto_36

    .line 1102
    :cond_4b
    invoke-static {v11}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v24

    .line 1110
    move v11, v15

    .line 1111
    new-instance v15, Lwb/s0;

    .line 1112
    .line 1113
    move-object/from16 v16, v5

    .line 1114
    .line 1115
    move/from16 v18, v13

    .line 1116
    .line 1117
    invoke-direct/range {v15 .. v24}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-interface {v10, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    const/4 v14, 0x1

    .line 1124
    goto/16 :goto_26

    .line 1125
    .line 1126
    :cond_4c
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    check-cast v0, Ljava/lang/Iterable;

    .line 1134
    .line 1135
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    check-cast v1, Ljava/lang/Iterable;

    .line 1147
    .line 1148
    new-instance v2, Ljava/util/ArrayList;

    .line 1149
    .line 1150
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    :cond_4d
    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    if-eqz v3, :cond_4e

    .line 1162
    .line 1163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v3

    .line 1167
    move-object v4, v3

    .line 1168
    check-cast v4, Lwb/s0;

    .line 1169
    .line 1170
    iget-boolean v4, v4, Lwb/s0;->g:Z

    .line 1171
    .line 1172
    if-eqz v4, :cond_4d

    .line 1173
    .line 1174
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    goto :goto_37

    .line 1178
    :cond_4e
    new-instance v1, Ljava/util/ArrayList;

    .line 1179
    .line 1180
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1181
    .line 1182
    .line 1183
    move-result v3

    .line 1184
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    :goto_38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1192
    .line 1193
    .line 1194
    move-result v3

    .line 1195
    if-eqz v3, :cond_4f

    .line 1196
    .line 1197
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v3

    .line 1201
    check-cast v3, Lwb/s0;

    .line 1202
    .line 1203
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 1204
    .line 1205
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    goto :goto_38

    .line 1209
    :cond_4f
    invoke-static {v7, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    new-instance v2, Lwb/f2;

    .line 1214
    .line 1215
    invoke-direct {v2, v0, v6, v1}, Lwb/f2;-><init>(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    .line 1216
    .line 1217
    .line 1218
    return-object v2

    .line 1219
    :cond_50
    const-string v0, "\u4f1a\u8bdd\u5217\u8868\u4e0d\u53ef\u7528"

    .line 1220
    .line 1221
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    const/4 v0, 0x0

    .line 1225
    return-object v0
.end method

.method public static g(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-static {p0}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lc9/a;

    .line 26
    .line 27
    iget-object v2, v2, Lc9/a;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static/range {v0 .. v5}, Lwb/h2;->h(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V

    .line 64
    .line 65
    .line 66
    return-object v2
.end method

.method public static final h(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    sget-object p3, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lwb/e2;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lwb/e2;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lc9/a;

    .line 36
    .line 37
    iget-object v1, v0, Lc9/a;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    move-object v3, p1

    .line 47
    move-object v4, p2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, v0, Lc9/a;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p5, v1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v1, Lwb/g2;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/16 v7, 0x3e

    .line 59
    .line 60
    const-string v3, " / "

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-direct {v1, v0, p4, v3}, Lwb/g2;-><init>(Lc9/a;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    iget-object v5, v0, Lc9/a;->a:Ljava/lang/String;

    .line 75
    .line 76
    add-int/lit8 v6, p4, 0x1

    .line 77
    .line 78
    move-object v3, p1

    .line 79
    move-object v4, p2

    .line 80
    move-object v7, v2

    .line 81
    move-object v2, p0

    .line 82
    invoke-static/range {v2 .. v7}, Lwb/h2;->h(Ljava/util/LinkedHashMap;Ljava/util/HashSet;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/List;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    move-object p0, v2

    .line 86
    move-object p1, v3

    .line 87
    move-object p2, v4

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lc9/a;Ljava/util/List;Lfg/a;Lfg/l;Li0/h0;I)V
    .locals 29

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    const v0, -0x7e8dbbcd

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v8, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v0, 0x10

    .line 24
    .line 25
    :goto_0
    or-int v0, p7, v0

    .line 26
    .line 27
    invoke-virtual {v8, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x100

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v2, 0x80

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v2

    .line 39
    move-object/from16 v12, p4

    .line 40
    .line 41
    invoke-virtual {v8, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const/16 v2, 0x800

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v2, 0x400

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v2

    .line 53
    move-object/from16 v10, p5

    .line 54
    .line 55
    invoke-virtual {v8, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    const/16 v2, 0x4000

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v2, 0x2000

    .line 65
    .line 66
    :goto_3
    or-int/2addr v0, v2

    .line 67
    and-int/lit16 v2, v0, 0x2491

    .line 68
    .line 69
    const/16 v6, 0x2490

    .line 70
    .line 71
    if-eq v2, v6, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/4 v2, 0x0

    .line 76
    :goto_4
    and-int/lit8 v6, v0, 0x1

    .line 77
    .line 78
    invoke-virtual {v8, v6, v2}, Li0/h0;->S(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_31

    .line 83
    .line 84
    iget-object v13, v3, Lc9/a;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    sget-object v14, Li0/l;->a:Li0/e;

    .line 95
    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    if-ne v6, v14, :cond_6

    .line 99
    .line 100
    :cond_5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    check-cast v6, Li0/a1;

    .line 110
    .line 111
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const-string v15, ""

    .line 120
    .line 121
    if-nez v2, :cond_7

    .line 122
    .line 123
    if-ne v7, v14, :cond_8

    .line 124
    .line 125
    :cond_7
    invoke-static {v15}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_8
    move-object v2, v7

    .line 133
    check-cast v2, Li0/a1;

    .line 134
    .line 135
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-nez v7, :cond_9

    .line 144
    .line 145
    if-ne v9, v14, :cond_a

    .line 146
    .line 147
    :cond_9
    new-instance v7, Lwb/f2;

    .line 148
    .line 149
    sget-object v9, Ltf/v;->g:Ltf/v;

    .line 150
    .line 151
    sget-object v11, Ltf/t;->g:Ltf/t;

    .line 152
    .line 153
    invoke-direct {v7, v11, v9, v9}, Lwb/f2;-><init>(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-virtual {v8, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_a
    check-cast v9, Li0/a1;

    .line 164
    .line 165
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    if-nez v7, :cond_b

    .line 174
    .line 175
    if-ne v11, v14, :cond_c

    .line 176
    .line 177
    :cond_b
    invoke-static {v15}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    invoke-virtual {v8, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_c
    move-object/from16 v19, v11

    .line 185
    .line 186
    check-cast v19, Li0/a1;

    .line 187
    .line 188
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    if-nez v7, :cond_d

    .line 197
    .line 198
    if-ne v11, v14, :cond_e

    .line 199
    .line 200
    :cond_d
    sget-object v7, Lwb/t0;->m:Lwb/t0;

    .line 201
    .line 202
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual {v8, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_e
    check-cast v11, Li0/a1;

    .line 210
    .line 211
    invoke-virtual {v8, v13}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-nez v7, :cond_f

    .line 220
    .line 221
    if-ne v5, v14, :cond_10

    .line 222
    .line 223
    :cond_f
    invoke-static {v15}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_10
    move-object v15, v5

    .line 231
    check-cast v15, Li0/a1;

    .line 232
    .line 233
    and-int/lit8 v5, v0, 0x70

    .line 234
    .line 235
    if-eq v5, v1, :cond_11

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    goto :goto_5

    .line 239
    :cond_11
    const/4 v7, 0x1

    .line 240
    :goto_5
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-nez v7, :cond_12

    .line 245
    .line 246
    if-ne v1, v14, :cond_13

    .line 247
    .line 248
    :cond_12
    iget-object v1, v3, Lc9/a;->e:Ljava/util/List;

    .line 249
    .line 250
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_13
    check-cast v1, Ljava/util/Set;

    .line 258
    .line 259
    const/16 v7, 0x20

    .line 260
    .line 261
    if-eq v5, v7, :cond_14

    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    :goto_6
    move-object/from16 v21, v1

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_14
    const/4 v7, 0x1

    .line 268
    goto :goto_6

    .line 269
    :goto_7
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-nez v7, :cond_15

    .line 274
    .line 275
    if-ne v1, v14, :cond_16

    .line 276
    .line 277
    :cond_15
    invoke-static/range {v21 .. v21}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_16
    move-object/from16 v26, v1

    .line 285
    .line 286
    check-cast v26, Li0/a1;

    .line 287
    .line 288
    const/16 v27, 0x1

    .line 289
    .line 290
    invoke-static {v8}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 291
    .line 292
    .line 293
    move-result-object v17

    .line 294
    const/16 v28, 0x0

    .line 295
    .line 296
    invoke-static {v8}, Lsh/s;->i(Li0/h0;)Lsh/x;

    .line 297
    .line 298
    .line 299
    move-result-object v16

    .line 300
    invoke-virtual {v8, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    invoke-virtual {v8, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    or-int/2addr v1, v7

    .line 309
    and-int/lit16 v0, v0, 0x380

    .line 310
    .line 311
    const/16 v7, 0x100

    .line 312
    .line 313
    if-eq v0, v7, :cond_17

    .line 314
    .line 315
    move/from16 v0, v28

    .line 316
    .line 317
    goto :goto_8

    .line 318
    :cond_17
    move/from16 v0, v27

    .line 319
    .line 320
    :goto_8
    or-int/2addr v0, v1

    .line 321
    const/16 v7, 0x20

    .line 322
    .line 323
    if-eq v5, v7, :cond_18

    .line 324
    .line 325
    move/from16 v1, v28

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_18
    move/from16 v1, v27

    .line 329
    .line 330
    :goto_9
    or-int/2addr v0, v1

    .line 331
    invoke-virtual {v8, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    or-int/2addr v0, v1

    .line 336
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-nez v0, :cond_1a

    .line 341
    .line 342
    if-ne v1, v14, :cond_19

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_19
    move-object v0, v1

    .line 346
    move-object v1, v4

    .line 347
    move-object v5, v9

    .line 348
    move-object/from16 v9, v21

    .line 349
    .line 350
    goto :goto_b

    .line 351
    :cond_1a
    :goto_a
    new-instance v0, Lf0/b;

    .line 352
    .line 353
    move-object v1, v6

    .line 354
    const/4 v6, 0x0

    .line 355
    const/4 v7, 0x7

    .line 356
    move-object v5, v4

    .line 357
    move-object v4, v3

    .line 358
    move-object v3, v5

    .line 359
    move-object v5, v9

    .line 360
    move-object/from16 v9, v21

    .line 361
    .line 362
    invoke-direct/range {v0 .. v7}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 363
    .line 364
    .line 365
    move-object v6, v1

    .line 366
    move-object v1, v3

    .line 367
    invoke-virtual {v8, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :goto_b
    check-cast v0, Lfg/p;

    .line 371
    .line 372
    invoke-static {v13, v1, v0, v8}, Li0/r;->g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Lwb/f2;

    .line 380
    .line 381
    iget-object v0, v0, Lwb/f2;->a:Ljava/util/List;

    .line 382
    .line 383
    invoke-virtual {v8, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    if-nez v3, :cond_1b

    .line 392
    .line 393
    if-ne v4, v14, :cond_1d

    .line 394
    .line 395
    :cond_1b
    new-instance v3, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_1c

    .line 409
    .line 410
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    check-cast v7, Lwb/s0;

    .line 415
    .line 416
    iget-object v7, v7, Lwb/s0;->f:Ljava/util/List;

    .line 417
    .line 418
    invoke-static {v3, v7}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 419
    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_1c
    invoke-static {v3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    new-instance v4, Lwb/e2;

    .line 431
    .line 432
    const/4 v7, 0x0

    .line 433
    invoke-direct {v4, v7}, Lwb/e2;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-static {v3, v4}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-virtual {v8, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_1d
    check-cast v4, Ljava/util/List;

    .line 444
    .line 445
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    check-cast v3, Lwb/t0;

    .line 450
    .line 451
    invoke-virtual {v8, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    invoke-virtual {v8, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v13

    .line 459
    or-int/2addr v7, v13

    .line 460
    invoke-virtual {v8, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    or-int/2addr v7, v13

    .line 465
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v13

    .line 469
    if-nez v7, :cond_1f

    .line 470
    .line 471
    if-ne v13, v14, :cond_1e

    .line 472
    .line 473
    goto :goto_d

    .line 474
    :cond_1e
    move-object/from16 v18, v11

    .line 475
    .line 476
    move-object/from16 v21, v15

    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_1f
    :goto_d
    new-instance v20, Lwb/d2;

    .line 480
    .line 481
    const/16 v25, 0x0

    .line 482
    .line 483
    const/16 v24, 0x0

    .line 484
    .line 485
    move-object/from16 v21, v4

    .line 486
    .line 487
    move-object/from16 v22, v11

    .line 488
    .line 489
    move-object/from16 v23, v15

    .line 490
    .line 491
    invoke-direct/range {v20 .. v25}, Lwb/d2;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v13, v20

    .line 495
    .line 496
    move-object/from16 v18, v22

    .line 497
    .line 498
    move-object/from16 v21, v23

    .line 499
    .line 500
    invoke-virtual {v8, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :goto_e
    check-cast v13, Lfg/p;

    .line 504
    .line 505
    invoke-static {v3, v4, v13, v8}, Li0/r;->g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V

    .line 506
    .line 507
    .line 508
    invoke-interface/range {v19 .. v19}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    check-cast v3, Ljava/lang/String;

    .line 513
    .line 514
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 523
    .line 524
    invoke-static {v7, v3, v7}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    new-instance v7, Ljava/util/ArrayList;

    .line 529
    .line 530
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 531
    .line 532
    .line 533
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-eqz v11, :cond_27

    .line 542
    .line 543
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    move-object v13, v11

    .line 548
    check-cast v13, Lwb/s0;

    .line 549
    .line 550
    invoke-interface/range {v18 .. v18}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    check-cast v15, Lwb/t0;

    .line 555
    .line 556
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 557
    .line 558
    .line 559
    move-result v15

    .line 560
    if-eqz v15, :cond_25

    .line 561
    .line 562
    move-object/from16 v20, v0

    .line 563
    .line 564
    move/from16 v0, v27

    .line 565
    .line 566
    if-eq v15, v0, :cond_24

    .line 567
    .line 568
    const/4 v0, 0x2

    .line 569
    if-eq v15, v0, :cond_23

    .line 570
    .line 571
    const/4 v0, 0x3

    .line 572
    if-eq v15, v0, :cond_21

    .line 573
    .line 574
    const/4 v0, 0x4

    .line 575
    if-ne v15, v0, :cond_20

    .line 576
    .line 577
    :goto_10
    const/4 v0, 0x1

    .line 578
    goto :goto_11

    .line 579
    :cond_20
    invoke-static {}, Lokio/a;->k()V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :cond_21
    invoke-interface/range {v21 .. v21}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    check-cast v0, Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_22

    .line 594
    .line 595
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, Lwb/f2;

    .line 600
    .line 601
    iget-object v0, v0, Lwb/f2;->b:Ljava/util/Set;

    .line 602
    .line 603
    iget-object v15, v13, Lwb/s0;->a:Ljava/lang/String;

    .line 604
    .line 605
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    if-eqz v0, :cond_22

    .line 610
    .line 611
    iget-object v0, v13, Lwb/s0;->f:Ljava/util/List;

    .line 612
    .line 613
    invoke-interface/range {v21 .. v21}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v13

    .line 617
    check-cast v13, Ljava/lang/String;

    .line 618
    .line 619
    invoke-interface {v0, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_22

    .line 624
    .line 625
    goto :goto_10

    .line 626
    :cond_22
    move/from16 v0, v28

    .line 627
    .line 628
    goto :goto_11

    .line 629
    :cond_23
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    check-cast v0, Lwb/f2;

    .line 634
    .line 635
    iget-object v0, v0, Lwb/f2;->c:Ljava/util/Set;

    .line 636
    .line 637
    iget-object v13, v13, Lwb/s0;->a:Ljava/lang/String;

    .line 638
    .line 639
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    goto :goto_11

    .line 644
    :cond_24
    iget-boolean v0, v13, Lwb/s0;->c:Z

    .line 645
    .line 646
    goto :goto_11

    .line 647
    :cond_25
    move-object/from16 v20, v0

    .line 648
    .line 649
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    check-cast v0, Lwb/f2;

    .line 654
    .line 655
    iget-object v0, v0, Lwb/f2;->b:Ljava/util/Set;

    .line 656
    .line 657
    iget-object v13, v13, Lwb/s0;->a:Ljava/lang/String;

    .line 658
    .line 659
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    :goto_11
    if-eqz v0, :cond_26

    .line 664
    .line 665
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    :cond_26
    move-object/from16 v0, v20

    .line 669
    .line 670
    const/16 v27, 0x1

    .line 671
    .line 672
    goto/16 :goto_f

    .line 673
    .line 674
    :cond_27
    new-instance v0, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    :cond_28
    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v7

    .line 687
    if-eqz v7, :cond_29

    .line 688
    .line 689
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    move-object v11, v7

    .line 694
    check-cast v11, Lwb/s0;

    .line 695
    .line 696
    invoke-static {v11, v3}, Lwb/ho;->i6(Lwb/s0;Ljava/lang/String;)Z

    .line 697
    .line 698
    .line 699
    move-result v11

    .line 700
    if-eqz v11, :cond_28

    .line 701
    .line 702
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    goto :goto_12

    .line 706
    :cond_29
    invoke-virtual {v8, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    if-nez v3, :cond_2a

    .line 715
    .line 716
    if-ne v5, v14, :cond_2b

    .line 717
    .line 718
    :cond_2a
    new-instance v5, Lia/p;

    .line 719
    .line 720
    const/4 v3, 0x1

    .line 721
    invoke-direct {v5, v9, v3}, Lia/p;-><init>(Ljava/util/Set;I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    :cond_2b
    check-cast v5, Lfg/l;

    .line 728
    .line 729
    invoke-static {v5, v0}, Lwb/ho;->f7(Lfg/l;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 730
    .line 731
    .line 732
    move-result-object v22

    .line 733
    new-instance v0, Ljava/util/ArrayList;

    .line 734
    .line 735
    invoke-static/range {v22 .. v22}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    if-eqz v5, :cond_2c

    .line 751
    .line 752
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    check-cast v5, Lwb/s0;

    .line 757
    .line 758
    iget-object v5, v5, Lwb/s0;->a:Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    goto :goto_13

    .line 764
    :cond_2c
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 765
    .line 766
    .line 767
    move-result-object v13

    .line 768
    move-object v0, v13

    .line 769
    check-cast v0, Ljava/util/Collection;

    .line 770
    .line 771
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    if-nez v0, :cond_30

    .line 776
    .line 777
    move-object v0, v13

    .line 778
    check-cast v0, Ljava/lang/Iterable;

    .line 779
    .line 780
    invoke-interface/range {v26 .. v26}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    check-cast v3, Ljava/util/Set;

    .line 785
    .line 786
    instance-of v5, v0, Ljava/util/Collection;

    .line 787
    .line 788
    if-eqz v5, :cond_2d

    .line 789
    .line 790
    move-object v5, v0

    .line 791
    check-cast v5, Ljava/util/Collection;

    .line 792
    .line 793
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 794
    .line 795
    .line 796
    move-result v5

    .line 797
    if-eqz v5, :cond_2d

    .line 798
    .line 799
    goto :goto_14

    .line 800
    :cond_2d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    :cond_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    if-eqz v5, :cond_2f

    .line 809
    .line 810
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v5

    .line 814
    check-cast v5, Ljava/lang/String;

    .line 815
    .line 816
    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    if-nez v5, :cond_2e

    .line 821
    .line 822
    goto :goto_15

    .line 823
    :cond_2f
    :goto_14
    const/4 v14, 0x1

    .line 824
    goto :goto_16

    .line 825
    :cond_30
    :goto_15
    move/from16 v14, v28

    .line 826
    .line 827
    :goto_16
    new-instance v9, Lsh/m;

    .line 828
    .line 829
    const/4 v15, 0x1

    .line 830
    move-object/from16 v11, v26

    .line 831
    .line 832
    invoke-direct/range {v9 .. v15}, Lsh/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;Ljava/lang/Object;ZI)V

    .line 833
    .line 834
    .line 835
    move-object/from16 v25, v11

    .line 836
    .line 837
    const v0, 0x1beeb292

    .line 838
    .line 839
    .line 840
    invoke-static {v0, v9, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    new-instance v15, Lwb/d1;

    .line 845
    .line 846
    move-object/from16 v24, v2

    .line 847
    .line 848
    move-object/from16 v20, v4

    .line 849
    .line 850
    move-object/from16 v23, v6

    .line 851
    .line 852
    invoke-direct/range {v15 .. v25}, Lwb/d1;-><init>(Lsh/x;Lr/z;Li0/a1;Li0/a1;Ljava/util/List;Li0/a1;Ljava/util/ArrayList;Li0/a1;Li0/a1;Li0/a1;)V

    .line 853
    .line 854
    .line 855
    const v0, -0x6aa156a8

    .line 856
    .line 857
    .line 858
    invoke-static {v0, v15, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    const v8, 0x1b0036

    .line 863
    .line 864
    .line 865
    const/16 v9, 0x18

    .line 866
    .line 867
    const-string v0, "\u9009\u62e9\u5206\u7ec4\u4f1a\u8bdd"

    .line 868
    .line 869
    const-string v1, "\u9009\u62e9\u5206\u7ec4\u4f1a\u8bdd"

    .line 870
    .line 871
    const/4 v3, 0x0

    .line 872
    const/4 v4, 0x0

    .line 873
    move-object/from16 v7, p6

    .line 874
    .line 875
    move-object/from16 v2, v16

    .line 876
    .line 877
    invoke-static/range {v0 .. v9}, Lwb/ho;->B2(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;Li0/h0;II)V

    .line 878
    .line 879
    .line 880
    goto :goto_17

    .line 881
    :cond_31
    invoke-virtual/range {p6 .. p6}, Li0/h0;->V()V

    .line 882
    .line 883
    .line 884
    :goto_17
    invoke-virtual/range {p6 .. p6}, Li0/h0;->t()Li0/r1;

    .line 885
    .line 886
    .line 887
    move-result-object v8

    .line 888
    if-eqz v8, :cond_32

    .line 889
    .line 890
    new-instance v0, Lc9/z0;

    .line 891
    .line 892
    move-object/from16 v1, p0

    .line 893
    .line 894
    move-object/from16 v2, p1

    .line 895
    .line 896
    move-object/from16 v3, p2

    .line 897
    .line 898
    move-object/from16 v4, p3

    .line 899
    .line 900
    move-object/from16 v5, p4

    .line 901
    .line 902
    move-object/from16 v6, p5

    .line 903
    .line 904
    move/from16 v7, p7

    .line 905
    .line 906
    invoke-direct/range {v0 .. v7}, Lc9/z0;-><init>(Lwb/h2;Landroid/content/Context;Lc9/a;Ljava/util/List;Lfg/a;Lfg/l;I)V

    .line 907
    .line 908
    .line 909
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 910
    .line 911
    :cond_32
    return-void
.end method

.method public final b(Landroid/content/Context;Lc9/a;Ljava/util/List;ZLfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/a;Li0/h0;I)V
    .locals 34

    .line 1
    move-object/from16 v7, p2

    .line 2
    .line 3
    move/from16 v13, p4

    .line 4
    .line 5
    move-object/from16 v14, p9

    .line 6
    .line 7
    move-object/from16 v15, p10

    .line 8
    .line 9
    const v0, 0x69da479

    .line 10
    .line 11
    .line 12
    invoke-virtual {v15, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    invoke-virtual {v15, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    :goto_0
    or-int v1, p11, v1

    .line 27
    .line 28
    invoke-virtual {v15, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v1, v2

    .line 41
    move-object/from16 v2, p3

    .line 42
    .line 43
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x100

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v1, v4

    .line 55
    invoke-virtual {v15, v13}, Li0/h0;->g(Z)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    const/16 v4, 0x800

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v4, 0x400

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v4

    .line 67
    move-object/from16 v4, p6

    .line 68
    .line 69
    invoke-virtual {v15, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_4

    .line 74
    .line 75
    const/high16 v5, 0x20000

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/high16 v5, 0x10000

    .line 79
    .line 80
    :goto_4
    or-int/2addr v1, v5

    .line 81
    move-object/from16 v5, p7

    .line 82
    .line 83
    invoke-virtual {v15, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    const/high16 v6, 0x100000

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    const/high16 v6, 0x80000

    .line 93
    .line 94
    :goto_5
    or-int/2addr v1, v6

    .line 95
    move-object/from16 v6, p8

    .line 96
    .line 97
    invoke-virtual {v15, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_6

    .line 102
    .line 103
    const/high16 v8, 0x800000

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_6
    const/high16 v8, 0x400000

    .line 107
    .line 108
    :goto_6
    or-int/2addr v1, v8

    .line 109
    invoke-virtual {v15, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_7

    .line 114
    .line 115
    const/high16 v8, 0x4000000

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_7
    const/high16 v8, 0x2000000

    .line 119
    .line 120
    :goto_7
    or-int/2addr v1, v8

    .line 121
    const v8, 0x2492493

    .line 122
    .line 123
    .line 124
    and-int/2addr v8, v1

    .line 125
    const v9, 0x2492492

    .line 126
    .line 127
    .line 128
    const/4 v10, 0x1

    .line 129
    const/4 v11, 0x0

    .line 130
    if-eq v8, v9, :cond_8

    .line 131
    .line 132
    move v8, v10

    .line 133
    goto :goto_8

    .line 134
    :cond_8
    move v8, v11

    .line 135
    :goto_8
    and-int/lit8 v9, v1, 0x1

    .line 136
    .line 137
    invoke-virtual {v15, v9, v8}, Li0/h0;->S(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_18

    .line 142
    .line 143
    and-int/lit8 v1, v1, 0x70

    .line 144
    .line 145
    if-eq v1, v3, :cond_9

    .line 146
    .line 147
    move v10, v11

    .line 148
    :cond_9
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v3, Li0/l;->a:Li0/e;

    .line 153
    .line 154
    if-nez v10, :cond_a

    .line 155
    .line 156
    if-ne v1, v3, :cond_b

    .line 157
    .line 158
    :cond_a
    iget-object v1, v7, Lc9/a;->b:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v15, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_b
    move-object/from16 v16, v1

    .line 168
    .line 169
    check-cast v16, Li0/a1;

    .line 170
    .line 171
    iget-object v1, v7, Lc9/a;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v15, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    if-nez v1, :cond_c

    .line 182
    .line 183
    if-ne v8, v3, :cond_d

    .line 184
    .line 185
    :cond_c
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {v15, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_d
    move-object/from16 v17, v8

    .line 195
    .line 196
    check-cast v17, Li0/a1;

    .line 197
    .line 198
    invoke-static {v15}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 199
    .line 200
    .line 201
    move-result-object v18

    .line 202
    invoke-static {v15}, Lsh/s;->i(Li0/h0;)Lsh/x;

    .line 203
    .line 204
    .line 205
    move-result-object v19

    .line 206
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    move v8, v11

    .line 221
    const/4 v11, 0x0

    .line 222
    const/16 v12, 0xffd

    .line 223
    .line 224
    move-object v2, v1

    .line 225
    const/4 v1, 0x0

    .line 226
    move-object v9, v3

    .line 227
    const/4 v3, 0x0

    .line 228
    const/4 v4, 0x0

    .line 229
    const/4 v5, 0x0

    .line 230
    const/4 v6, 0x0

    .line 231
    const/4 v7, 0x0

    .line 232
    move v10, v8

    .line 233
    const/4 v8, 0x0

    .line 234
    move-object/from16 v20, v9

    .line 235
    .line 236
    const/4 v9, 0x0

    .line 237
    move/from16 v21, v10

    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    move-object/from16 v0, p2

    .line 241
    .line 242
    move-object/from16 v13, v20

    .line 243
    .line 244
    invoke-static/range {v0 .. v12}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    move-object v7, v0

    .line 249
    iget-object v0, v7, Lc9/a;->c:Ljava/lang/String;

    .line 250
    .line 251
    const-string v1, ""

    .line 252
    .line 253
    const/4 v2, 0x0

    .line 254
    if-eqz v0, :cond_11

    .line 255
    .line 256
    invoke-static/range {p3 .. p3}, Lwb/h2;->g(Ljava/util/List;)Ljava/util/ArrayList;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_f

    .line 269
    .line 270
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    move-object v5, v4

    .line 275
    check-cast v5, Lwb/g2;

    .line 276
    .line 277
    iget-object v5, v5, Lwb/g2;->a:Lc9/a;

    .line 278
    .line 279
    iget-object v5, v5, Lc9/a;->a:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v5, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_e

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_f
    move-object v4, v2

    .line 289
    :goto_9
    check-cast v4, Lwb/g2;

    .line 290
    .line 291
    if-eqz v4, :cond_10

    .line 292
    .line 293
    iget-object v2, v4, Lwb/g2;->c:Ljava/lang/String;

    .line 294
    .line 295
    :cond_10
    if-nez v2, :cond_11

    .line 296
    .line 297
    move-object v2, v1

    .line 298
    :cond_11
    if-nez v2, :cond_12

    .line 299
    .line 300
    move-object v0, v1

    .line 301
    goto :goto_a

    .line 302
    :cond_12
    move-object v0, v2

    .line 303
    :goto_a
    const-string v1, "\u65b0\u589e\u804a\u5929\u5206\u7ec4"

    .line 304
    .line 305
    const-string v2, "\u7f16\u8f91\u804a\u5929\u5206\u7ec4"

    .line 306
    .line 307
    if-eqz p4, :cond_13

    .line 308
    .line 309
    move-object v11, v2

    .line 310
    goto :goto_b

    .line 311
    :cond_13
    move-object v11, v1

    .line 312
    :goto_b
    if-eqz p4, :cond_14

    .line 313
    .line 314
    move-object v12, v2

    .line 315
    goto :goto_c

    .line 316
    :cond_14
    move-object v12, v1

    .line 317
    :goto_c
    new-instance v1, Lc9/k0;

    .line 318
    .line 319
    move-object v2, v6

    .line 320
    const/4 v6, 0x4

    .line 321
    move-object/from16 v3, p1

    .line 322
    .line 323
    move-object/from16 v5, p5

    .line 324
    .line 325
    move-object/from16 v4, p8

    .line 326
    .line 327
    invoke-direct/range {v1 .. v6}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/l;Ljava/lang/Object;I)V

    .line 328
    .line 329
    .line 330
    const v3, 0x5861ca18

    .line 331
    .line 332
    .line 333
    invoke-static {v3, v1, v15}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 334
    .line 335
    .line 336
    move-result-object v20

    .line 337
    move-object v4, v0

    .line 338
    new-instance v0, Lwb/j1;

    .line 339
    .line 340
    move/from16 v9, p4

    .line 341
    .line 342
    move-object/from16 v5, p6

    .line 343
    .line 344
    move-object/from16 v8, p7

    .line 345
    .line 346
    move-object v6, v2

    .line 347
    move-object/from16 v3, v16

    .line 348
    .line 349
    move-object/from16 v10, v17

    .line 350
    .line 351
    move-object/from16 v2, v18

    .line 352
    .line 353
    move-object/from16 v1, v19

    .line 354
    .line 355
    invoke-direct/range {v0 .. v10}, Lwb/j1;-><init>(Lsh/x;Lr/z;Li0/a1;Ljava/lang/String;Lfg/l;Lc9/a;Lc9/a;Lfg/l;ZLi0/a1;)V

    .line 356
    .line 357
    .line 358
    move-object v8, v10

    .line 359
    move-object v10, v7

    .line 360
    const v2, 0xfdd355e

    .line 361
    .line 362
    .line 363
    invoke-static {v2, v0, v15}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    move-object v0, v8

    .line 368
    const/high16 v8, 0x1b0000

    .line 369
    .line 370
    const/16 v9, 0x18

    .line 371
    .line 372
    const/4 v3, 0x0

    .line 373
    const/4 v4, 0x0

    .line 374
    move-object v2, v11

    .line 375
    move-object v11, v0

    .line 376
    move-object v0, v2

    .line 377
    move-object v2, v1

    .line 378
    move-object v1, v12

    .line 379
    move-object v7, v15

    .line 380
    move-object/from16 v5, v20

    .line 381
    .line 382
    invoke-static/range {v0 .. v9}, Lwb/ho;->B2(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;Li0/h0;II)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_17

    .line 396
    .line 397
    const v0, -0x1cccdf80

    .line 398
    .line 399
    .line 400
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    if-nez v0, :cond_15

    .line 412
    .line 413
    if-ne v1, v13, :cond_16

    .line 414
    .line 415
    :cond_15
    new-instance v1, Lb0/j;

    .line 416
    .line 417
    const/16 v0, 0x10

    .line 418
    .line 419
    invoke-direct {v1, v11, v0}, Lb0/j;-><init>(Li0/a1;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v7, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_16
    move-object/from16 v24, v1

    .line 426
    .line 427
    check-cast v24, Lfg/a;

    .line 428
    .line 429
    new-instance v0, Lb0/k;

    .line 430
    .line 431
    const/4 v1, 0x5

    .line 432
    invoke-direct {v0, v10, v11, v14, v1}, Lb0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 433
    .line 434
    .line 435
    const v1, -0x72d46761

    .line 436
    .line 437
    .line 438
    invoke-static {v1, v0, v7}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 439
    .line 440
    .line 441
    move-result-object v30

    .line 442
    const/16 v32, 0x186

    .line 443
    .line 444
    const/16 v33, 0xc00

    .line 445
    .line 446
    const/4 v15, 0x0

    .line 447
    const-string v16, "\u5220\u9664\u804a\u5929\u5206\u7ec4"

    .line 448
    .line 449
    const-wide/16 v17, 0x0

    .line 450
    .line 451
    const-wide/16 v19, 0x0

    .line 452
    .line 453
    const-wide/16 v21, 0x0

    .line 454
    .line 455
    const/16 v23, 0x0

    .line 456
    .line 457
    const-wide/16 v25, 0x0

    .line 458
    .line 459
    const-wide/16 v27, 0x0

    .line 460
    .line 461
    const/16 v29, 0x0

    .line 462
    .line 463
    move-object/from16 v31, v7

    .line 464
    .line 465
    invoke-static/range {v15 .. v33}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 466
    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    invoke-virtual {v7, v8}, Li0/h0;->p(Z)V

    .line 470
    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_17
    const/4 v8, 0x0

    .line 474
    const v0, -0x1cb81837

    .line 475
    .line 476
    .line 477
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v7, v8}, Li0/h0;->p(Z)V

    .line 481
    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_18
    move-object v10, v7

    .line 485
    move-object v7, v15

    .line 486
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 487
    .line 488
    .line 489
    :goto_d
    invoke-virtual {v7}, Li0/h0;->t()Li0/r1;

    .line 490
    .line 491
    .line 492
    move-result-object v12

    .line 493
    if-eqz v12, :cond_19

    .line 494
    .line 495
    new-instance v0, Lwb/k1;

    .line 496
    .line 497
    move-object/from16 v1, p0

    .line 498
    .line 499
    move-object/from16 v2, p1

    .line 500
    .line 501
    move-object/from16 v4, p3

    .line 502
    .line 503
    move/from16 v5, p4

    .line 504
    .line 505
    move-object/from16 v6, p5

    .line 506
    .line 507
    move-object/from16 v7, p6

    .line 508
    .line 509
    move-object/from16 v8, p7

    .line 510
    .line 511
    move-object/from16 v9, p8

    .line 512
    .line 513
    move/from16 v11, p11

    .line 514
    .line 515
    move-object v3, v10

    .line 516
    move-object v10, v14

    .line 517
    invoke-direct/range {v0 .. v11}, Lwb/k1;-><init>(Lwb/h2;Landroid/content/Context;Lc9/a;Ljava/util/List;ZLfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/a;I)V

    .line 518
    .line 519
    .line 520
    iput-object v0, v12, Li0/r1;->d:Lfg/p;

    .line 521
    .line 522
    :cond_19
    return-void
.end method

.method public final c(Ljava/lang/String;ZLjava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/l;Li0/h0;I)V
    .locals 24

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v14, p8

    .line 4
    .line 5
    const v0, -0x3e2c8249

    .line 6
    .line 7
    .line 8
    invoke-virtual {v14, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    move-object/from16 v7, p1

    .line 12
    .line 13
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int v0, p9, v0

    .line 23
    .line 24
    move/from16 v3, p2

    .line 25
    .line 26
    invoke-virtual {v14, v3}, Li0/h0;->g(Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/16 v1, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v1, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v1

    .line 38
    move-object/from16 v4, p3

    .line 39
    .line 40
    invoke-virtual {v14, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x100

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    move v1, v2

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v1, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v1

    .line 53
    move-object/from16 v5, p4

    .line 54
    .line 55
    invoke-virtual {v14, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    const/16 v1, 0x800

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v1, 0x400

    .line 65
    .line 66
    :goto_3
    or-int/2addr v0, v1

    .line 67
    invoke-virtual {v14, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    const/16 v1, 0x4000

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v1, 0x2000

    .line 77
    .line 78
    :goto_4
    or-int/2addr v0, v1

    .line 79
    const v1, 0x92493

    .line 80
    .line 81
    .line 82
    and-int/2addr v1, v0

    .line 83
    const v8, 0x92492

    .line 84
    .line 85
    .line 86
    const/4 v9, 0x1

    .line 87
    const/4 v10, 0x0

    .line 88
    if-eq v1, v8, :cond_5

    .line 89
    .line 90
    move v1, v9

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move v1, v10

    .line 93
    :goto_5
    and-int/lit8 v8, v0, 0x1

    .line 94
    .line 95
    invoke-virtual {v14, v8, v1}, Li0/h0;->S(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_f

    .line 100
    .line 101
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    sget-object v8, Li0/l;->a:Li0/e;

    .line 106
    .line 107
    if-ne v1, v8, :cond_6

    .line 108
    .line 109
    const-string v1, ""

    .line 110
    .line 111
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v14, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    move-object/from16 v23, v1

    .line 119
    .line 120
    check-cast v23, Li0/a1;

    .line 121
    .line 122
    invoke-static {v14}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 123
    .line 124
    .line 125
    move-result-object v17

    .line 126
    invoke-static {v14}, Lsh/s;->i(Li0/h0;)Lsh/x;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    and-int/lit16 v1, v0, 0x380

    .line 131
    .line 132
    if-eq v1, v2, :cond_7

    .line 133
    .line 134
    move v1, v10

    .line 135
    goto :goto_6

    .line 136
    :cond_7
    move v1, v9

    .line 137
    :goto_6
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-nez v1, :cond_8

    .line 142
    .line 143
    if-ne v2, v8, :cond_9

    .line 144
    .line 145
    :cond_8
    invoke-static {v4}, Lwb/h2;->g(Ljava/util/List;)Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v14, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    check-cast v2, Ljava/util/List;

    .line 153
    .line 154
    invoke-interface/range {v23 .. v23}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 169
    .line 170
    invoke-static {v8, v1, v8}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v8, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    :cond_a
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_e

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    move-object v12, v11

    .line 194
    check-cast v12, Lwb/g2;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-nez v13, :cond_b

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_b
    iget-object v13, v12, Lwb/g2;->a:Lc9/a;

    .line 204
    .line 205
    iget-object v13, v13, Lc9/a;->b:Ljava/lang/String;

    .line 206
    .line 207
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 208
    .line 209
    invoke-static {v15, v13, v15, v1, v10}, Lbc/e;->u(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    if-nez v13, :cond_d

    .line 214
    .line 215
    iget-object v12, v12, Lwb/g2;->c:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v12, v15, v1, v10}, Lbc/e;->t(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_c

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_c
    move v12, v10

    .line 225
    goto :goto_9

    .line 226
    :cond_d
    :goto_8
    move v12, v9

    .line 227
    :goto_9
    if-eqz v12, :cond_a

    .line 228
    .line 229
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_e
    new-instance v1, Lwb/g1;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    move-object/from16 v9, p6

    .line 237
    .line 238
    invoke-direct {v1, v9, v6, v2}, Lwb/g1;-><init>(Lfg/a;Lfg/a;I)V

    .line 239
    .line 240
    .line 241
    const v2, 0x954ff8

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v1, v14}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    new-instance v15, Lwb/h1;

    .line 249
    .line 250
    move-object/from16 v22, p7

    .line 251
    .line 252
    move/from16 v18, v3

    .line 253
    .line 254
    move-object/from16 v20, v4

    .line 255
    .line 256
    move-object/from16 v19, v5

    .line 257
    .line 258
    move-object/from16 v21, v8

    .line 259
    .line 260
    invoke-direct/range {v15 .. v23}, Lwb/h1;-><init>(Lsh/x;Lr/z;ZLfg/l;Ljava/util/List;Ljava/util/ArrayList;Lfg/l;Li0/a1;)V

    .line 261
    .line 262
    .line 263
    const v1, 0x7a8bb572

    .line 264
    .line 265
    .line 266
    invoke-static {v1, v15, v14}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    and-int/lit8 v1, v0, 0xe

    .line 271
    .line 272
    const/high16 v2, 0x1b0000

    .line 273
    .line 274
    or-int/2addr v1, v2

    .line 275
    shl-int/lit8 v0, v0, 0x3

    .line 276
    .line 277
    and-int/lit8 v0, v0, 0x70

    .line 278
    .line 279
    or-int v15, v1, v0

    .line 280
    .line 281
    move-object/from16 v9, v16

    .line 282
    .line 283
    const/16 v16, 0x18

    .line 284
    .line 285
    const/4 v10, 0x0

    .line 286
    const/4 v11, 0x0

    .line 287
    move-object/from16 v8, p1

    .line 288
    .line 289
    invoke-static/range {v7 .. v16}, Lwb/ho;->B2(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;Li0/h0;II)V

    .line 290
    .line 291
    .line 292
    goto :goto_a

    .line 293
    :cond_f
    invoke-virtual/range {p8 .. p8}, Li0/h0;->V()V

    .line 294
    .line 295
    .line 296
    :goto_a
    invoke-virtual/range {p8 .. p8}, Li0/h0;->t()Li0/r1;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    if-eqz v10, :cond_10

    .line 301
    .line 302
    new-instance v0, Lwb/i1;

    .line 303
    .line 304
    move-object/from16 v1, p0

    .line 305
    .line 306
    move-object/from16 v2, p1

    .line 307
    .line 308
    move/from16 v3, p2

    .line 309
    .line 310
    move-object/from16 v4, p3

    .line 311
    .line 312
    move-object/from16 v5, p4

    .line 313
    .line 314
    move-object/from16 v7, p6

    .line 315
    .line 316
    move-object/from16 v8, p7

    .line 317
    .line 318
    move/from16 v9, p9

    .line 319
    .line 320
    invoke-direct/range {v0 .. v9}, Lwb/i1;-><init>(Lwb/h2;Ljava/lang/String;ZLjava/util/List;Lfg/l;Lfg/a;Lfg/a;Lfg/l;I)V

    .line 321
    .line 322
    .line 323
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 324
    .line 325
    :cond_10
    return-void
.end method

.method public final d(Lc9/a;Ljava/util/List;Lfg/a;Lfg/l;Li0/h0;I)V
    .locals 15

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    move-object/from16 v12, p5

    .line 10
    .line 11
    const v0, -0x5556fb51

    .line 12
    .line 13
    .line 14
    invoke-virtual {v12, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p6, v0

    .line 27
    .line 28
    invoke-virtual {v12, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move v1, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v1

    .line 41
    invoke-virtual {v12, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const/16 v1, 0x100

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v1, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v1

    .line 53
    invoke-virtual {v12, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    const/16 v1, 0x800

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/16 v1, 0x400

    .line 63
    .line 64
    :goto_3
    or-int/2addr v0, v1

    .line 65
    and-int/lit16 v1, v0, 0x493

    .line 66
    .line 67
    const/16 v6, 0x492

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x1

    .line 71
    if-eq v1, v6, :cond_4

    .line 72
    .line 73
    move v1, v8

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    move v1, v7

    .line 76
    :goto_4
    and-int/lit8 v6, v0, 0x1

    .line 77
    .line 78
    invoke-virtual {v12, v6, v1}, Li0/h0;->S(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_d

    .line 83
    .line 84
    iget-object v1, v2, Lc9/a;->a:Ljava/lang/String;

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x70

    .line 87
    .line 88
    if-eq v0, v5, :cond_5

    .line 89
    .line 90
    move v6, v7

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move v6, v8

    .line 93
    :goto_5
    invoke-virtual {v12, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    or-int/2addr v6, v10

    .line 98
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    sget-object v11, Li0/l;->a:Li0/e;

    .line 103
    .line 104
    if-nez v6, :cond_6

    .line 105
    .line 106
    if-ne v10, v11, :cond_7

    .line 107
    .line 108
    :cond_6
    invoke-static {v1, v3}, Lc9/o2;->f(Ljava/lang/String;Ljava/util/List;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v6, v1}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-virtual {v12, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_7
    check-cast v10, Ljava/util/Set;

    .line 120
    .line 121
    if-eq v0, v5, :cond_8

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_8
    move v7, v8

    .line 125
    :goto_6
    invoke-virtual {v12, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    or-int/2addr v0, v7

    .line 130
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-nez v0, :cond_9

    .line 135
    .line 136
    if-ne v1, v11, :cond_c

    .line 137
    .line 138
    :cond_9
    invoke-static {v3}, Lwb/h2;->g(Ljava/util/List;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :cond_a
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_b

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    move-object v6, v5

    .line 162
    check-cast v6, Lwb/g2;

    .line 163
    .line 164
    iget-object v6, v6, Lwb/g2;->a:Lc9/a;

    .line 165
    .line 166
    iget-object v6, v6, Lc9/a;->a:Ljava/lang/String;

    .line 167
    .line 168
    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-nez v6, :cond_a

    .line 173
    .line 174
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_b
    invoke-virtual {v12, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_c
    move-object v8, v1

    .line 182
    check-cast v8, Ljava/util/List;

    .line 183
    .line 184
    invoke-static {v12}, Lr/b0;->a(Li0/h0;)Lr/z;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v12}, Lsh/s;->i(Li0/h0;)Lsh/x;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    new-instance v0, Lh0/j0;

    .line 193
    .line 194
    invoke-direct {v0, v9, v4}, Lh0/j0;-><init>(Lfg/l;Lfg/a;)V

    .line 195
    .line 196
    .line 197
    const v1, 0x3f22754e

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v0, v12}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v5, Lwb/f1;

    .line 205
    .line 206
    const/4 v10, 0x0

    .line 207
    invoke-direct/range {v5 .. v10}, Lwb/f1;-><init>(Lsh/x;Lr/z;Ljava/util/List;Lfg/l;I)V

    .line 208
    .line 209
    .line 210
    const v1, 0x26f1e94

    .line 211
    .line 212
    .line 213
    invoke-static {v1, v5, v12}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    const v13, 0x1b0036

    .line 218
    .line 219
    .line 220
    const/16 v14, 0x18

    .line 221
    .line 222
    const-string v5, "\u9009\u62e9\u4e0a\u7ea7\u5206\u7ec4"

    .line 223
    .line 224
    move-object v7, v6

    .line 225
    const-string v6, "\u9009\u62e9\u4e0a\u7ea7\u5206\u7ec4"

    .line 226
    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x0

    .line 229
    move-object v10, v0

    .line 230
    invoke-static/range {v5 .. v14}, Lwb/ho;->B2(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;Li0/h0;II)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_d
    invoke-virtual/range {p5 .. p5}, Li0/h0;->V()V

    .line 235
    .line 236
    .line 237
    :goto_8
    invoke-virtual/range {p5 .. p5}, Li0/h0;->t()Li0/r1;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    if-eqz v8, :cond_e

    .line 242
    .line 243
    new-instance v0, Lb0/z;

    .line 244
    .line 245
    const/4 v7, 0x1

    .line 246
    move-object v1, p0

    .line 247
    move-object/from16 v5, p4

    .line 248
    .line 249
    move/from16 v6, p6

    .line 250
    .line 251
    invoke-direct/range {v0 .. v7}, Lb0/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfg/a;Lsf/b;II)V

    .line 252
    .line 253
    .line 254
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 255
    .line 256
    :cond_e
    return-void
.end method

.method public final e(Landroid/content/Context;Lvb/a;Lfg/a;Li0/h0;I)V
    .locals 12

    .line 1
    move-object/from16 v8, p4

    .line 2
    .line 3
    move/from16 v9, p5

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v0, 0x7d3d3663

    .line 12
    .line 13
    .line 14
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v9, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v8, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr v0, v9

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v9

    .line 33
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 34
    .line 35
    if-nez v3, :cond_4

    .line 36
    .line 37
    and-int/lit8 v3, v9, 0x40

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v8, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v8, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    :goto_2
    if-eqz v3, :cond_3

    .line 51
    .line 52
    const/16 v3, 0x20

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/16 v3, 0x10

    .line 56
    .line 57
    :goto_3
    or-int/2addr v0, v3

    .line 58
    :cond_4
    and-int/lit16 v3, v9, 0x180

    .line 59
    .line 60
    if-nez v3, :cond_6

    .line 61
    .line 62
    invoke-virtual {v8, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_5

    .line 67
    .line 68
    const/16 v4, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v4, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v0, v4

    .line 74
    :cond_6
    and-int/lit16 v4, v0, 0x93

    .line 75
    .line 76
    const/16 v5, 0x92

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x1

    .line 80
    if-eq v4, v5, :cond_7

    .line 81
    .line 82
    move v4, v7

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move v4, v6

    .line 85
    :goto_5
    and-int/2addr v0, v7

    .line 86
    invoke-virtual {v8, v0, v4}, Li0/h0;->S(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_c

    .line 91
    .line 92
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sget-object v4, Li0/l;->a:Li0/e;

    .line 97
    .line 98
    if-ne v0, v4, :cond_8

    .line 99
    .line 100
    const-string v0, "Hchat_conversation_groups"

    .line 101
    .line 102
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v5, "enabled"

    .line 107
    .line 108
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v8, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_8
    check-cast v0, Li0/a1;

    .line 124
    .line 125
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-ne v5, v4, :cond_9

    .line 130
    .line 131
    invoke-static {p1}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {v5}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    check-cast v5, Li0/a1;

    .line 143
    .line 144
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    if-ne v6, v4, :cond_a

    .line 149
    .line 150
    sget-object v6, Lwb/y0;->a:Lwb/y0;

    .line 151
    .line 152
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_a
    check-cast v6, Li0/a1;

    .line 160
    .line 161
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    move-object v10, v7

    .line 166
    check-cast v10, Lwb/a1;

    .line 167
    .line 168
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    if-ne v7, v4, :cond_b

    .line 173
    .line 174
    new-instance v7, Lw0/l;

    .line 175
    .line 176
    const/4 v4, 0x1

    .line 177
    invoke-direct {v7, v4}, Lw0/l;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_b
    move-object v11, v7

    .line 184
    check-cast v11, Lfg/l;

    .line 185
    .line 186
    move-object v4, v0

    .line 187
    new-instance v0, Lwb/e1;

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    move-object v2, p1

    .line 191
    move-object v1, p2

    .line 192
    move-object v3, p3

    .line 193
    invoke-direct/range {v0 .. v7}, Lwb/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    const v1, -0x272e4c35

    .line 197
    .line 198
    .line 199
    invoke-static {v1, v0, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    const v7, 0x30d80

    .line 204
    .line 205
    .line 206
    const/16 v8, 0x12

    .line 207
    .line 208
    const/4 v1, 0x0

    .line 209
    const-string v2, "ConversationGroupRoute"

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    move-object/from16 v6, p4

    .line 213
    .line 214
    move-object v0, v10

    .line 215
    move-object v3, v11

    .line 216
    invoke-static/range {v0 .. v8}, Lwb/ho;->E3(Ljava/lang/Object;Ly0/o;Ljava/lang/String;Lfg/l;ZLs0/d;Li0/h0;II)V

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_c
    invoke-virtual/range {p4 .. p4}, Li0/h0;->V()V

    .line 221
    .line 222
    .line 223
    :goto_6
    invoke-virtual/range {p4 .. p4}, Li0/h0;->t()Li0/r1;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    if-eqz v7, :cond_d

    .line 228
    .line 229
    new-instance v0, Ls0/c;

    .line 230
    .line 231
    const/4 v6, 0x1

    .line 232
    move-object v1, p0

    .line 233
    move-object v2, p1

    .line 234
    move-object v3, p2

    .line 235
    move-object v4, p3

    .line 236
    move v5, v9

    .line 237
    invoke-direct/range {v0 .. v6}, Ls0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 238
    .line 239
    .line 240
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 241
    .line 242
    :cond_d
    return-void
.end method
