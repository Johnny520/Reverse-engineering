.class public final synthetic Lca/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLnb/w;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lca/r;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lca/r;->h:J

    .line 8
    .line 9
    iput-object p3, p0, Lca/r;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lca/r;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLa1/d;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lca/r;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/r;->i:Ljava/lang/Object;

    iput-wide p2, p0, Lca/r;->h:J

    iput-object p4, p0, Lca/r;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 15
    iput p5, p0, Lca/r;->g:I

    iput-object p1, p0, Lca/r;->i:Ljava/lang/Object;

    iput-object p2, p0, Lca/r;->j:Ljava/lang/Object;

    iput-wide p3, p0, Lca/r;->h:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lca/r;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lrb/k;

    .line 12
    .line 13
    iget-object v0, v1, Lca/r;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lrb/d;

    .line 17
    .line 18
    iget-wide v4, v1, Lca/r;->h:J

    .line 19
    .line 20
    iget-object v0, v2, Lrb/k;->c:Lrb/l;

    .line 21
    .line 22
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    const-string v6, "zombie_check_auto_tag"

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v0, :cond_1c

    .line 33
    .line 34
    iget-object v10, v3, Lrb/d;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, v2, Lrb/k;->c:Lrb/l;

    .line 37
    .line 38
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    const-string v11, "zombie_check_label_name"

    .line 41
    .line 42
    const-string v12, "\u50f5\u5c38\u7c89"

    .line 43
    .line 44
    invoke-interface {v0, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    const-string v0, ""

    .line 51
    .line 52
    :cond_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move-object v12, v0

    .line 68
    :goto_0
    sget-object v11, Ltf/t;->g:Ltf/t;

    .line 69
    .line 70
    invoke-virtual {v2, v4, v5}, Lrb/k;->a(J)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    move v0, v6

    .line 77
    const-wide/16 v16, 0x3e8

    .line 78
    .line 79
    goto/16 :goto_d

    .line 80
    .line 81
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    if-eqz v13, :cond_1a

    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v13}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    new-instance v14, Lsf/f;

    .line 94
    .line 95
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v0, v14

    .line 99
    :goto_1
    nop

    .line 100
    instance-of v14, v0, Lsf/f;

    .line 101
    .line 102
    if-eqz v14, :cond_3

    .line 103
    .line 104
    move-object v0, v11

    .line 105
    :cond_3
    check-cast v0, Ljava/util/List;

    .line 106
    .line 107
    new-instance v14, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v15

    .line 116
    :cond_4
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    if-eqz v16, :cond_5

    .line 121
    .line 122
    const-wide/16 v16, 0x3e8

    .line 123
    .line 124
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    move-object v9, v8

    .line 129
    check-cast v9, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 130
    .line 131
    iget-object v9, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_4

    .line 138
    .line 139
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    const-wide/16 v16, 0x3e8

    .line 144
    .line 145
    new-instance v8, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-static {v14}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-eqz v14, :cond_6

    .line 163
    .line 164
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    check-cast v14, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 169
    .line 170
    iget-object v14, v14, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    :cond_7
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-eqz v14, :cond_8

    .line 190
    .line 191
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    move-object v15, v14

    .line 196
    check-cast v15, Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-nez v15, :cond_7

    .line 203
    .line 204
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_8
    invoke-static {v9}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_9

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    :cond_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    if-eqz v14, :cond_b

    .line 228
    .line 229
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    check-cast v14, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 234
    .line 235
    iget-object v14, v14, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v14, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    if-eqz v14, :cond_a

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_b
    :goto_5
    invoke-virtual {v13, v12}, Lg8/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_d

    .line 256
    .line 257
    :cond_c
    :goto_6
    move v0, v6

    .line 258
    goto/16 :goto_d

    .line 259
    .line 260
    :cond_d
    move v9, v6

    .line 261
    :goto_7
    const/16 v14, 0xf

    .line 262
    .line 263
    if-ge v9, v14, :cond_13

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    if-eqz v14, :cond_e

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    :cond_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v15

    .line 280
    if-eqz v15, :cond_10

    .line 281
    .line 282
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v15

    .line 286
    check-cast v15, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 287
    .line 288
    iget-object v15, v15, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 289
    .line 290
    invoke-static {v15, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v15

    .line 294
    if-eqz v15, :cond_f

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_10
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 298
    .line 299
    invoke-virtual {v2, v4, v5}, Lrb/k;->a(J)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-nez v0, :cond_11

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_11
    :try_start_1
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    .line 308
    .line 309
    :catchall_1
    :try_start_2
    invoke-virtual {v13}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 310
    .line 311
    .line 312
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 313
    goto :goto_9

    .line 314
    :catchall_2
    move-exception v0

    .line 315
    new-instance v14, Lsf/f;

    .line 316
    .line 317
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    move-object v0, v14

    .line 321
    :goto_9
    nop

    .line 322
    instance-of v14, v0, Lsf/f;

    .line 323
    .line 324
    if-eqz v14, :cond_12

    .line 325
    .line 326
    move-object v0, v11

    .line 327
    :cond_12
    check-cast v0, Ljava/util/List;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_13
    :goto_a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_14

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    if-eqz v9, :cond_c

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    check-cast v9, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 352
    .line 353
    iget-object v9, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v9, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    if-eqz v9, :cond_15

    .line 360
    .line 361
    invoke-virtual {v2, v4, v5}, Lrb/k;->a(J)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-nez v0, :cond_16

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_16
    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    :try_start_3
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v13, v10, v0}, Lg8/i;->P(Ljava/lang/String;Ljava/util/List;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 380
    .line 381
    .line 382
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 383
    goto :goto_b

    .line 384
    :catchall_3
    move-exception v0

    .line 385
    new-instance v8, Lsf/f;

    .line 386
    .line 387
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    move-object v0, v8

    .line 391
    :goto_b
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 392
    .line 393
    instance-of v9, v0, Lsf/f;

    .line 394
    .line 395
    if-eqz v9, :cond_17

    .line 396
    .line 397
    move-object v0, v8

    .line 398
    :cond_17
    check-cast v0, Ljava/lang/Boolean;

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_18

    .line 405
    .line 406
    goto/16 :goto_6

    .line 407
    .line 408
    :cond_18
    :try_start_4
    invoke-virtual {v13, v10, v12}, Lg8/i;->C(Ljava/lang/String;Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 413
    .line 414
    .line 415
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 416
    goto :goto_c

    .line 417
    :catchall_4
    move-exception v0

    .line 418
    new-instance v8, Lsf/f;

    .line 419
    .line 420
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    move-object v0, v8

    .line 424
    :goto_c
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 425
    .line 426
    instance-of v9, v0, Lsf/f;

    .line 427
    .line 428
    if-eqz v9, :cond_19

    .line 429
    .line 430
    move-object v0, v8

    .line 431
    :cond_19
    check-cast v0, Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    goto :goto_d

    .line 438
    :cond_1a
    const-wide/16 v16, 0x3e8

    .line 439
    .line 440
    goto/16 :goto_6

    .line 441
    .line 442
    :goto_d
    iget-object v8, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 443
    .line 444
    monitor-enter v8

    .line 445
    :try_start_5
    iget-object v9, v3, Lrb/d;->b:Ljava/lang/String;

    .line 446
    .line 447
    if-eqz v0, :cond_1b

    .line 448
    .line 449
    const-string v0, "\u5df2\u8ffd\u52a0\u6807\u7b7e"

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :catchall_5
    move-exception v0

    .line 453
    goto :goto_f

    .line 454
    :cond_1b
    const-string v0, "\u6807\u7b7e\u5904\u7406\u5931\u8d25"

    .line 455
    .line 456
    :goto_e
    new-instance v10, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-string v9, ": "

    .line 465
    .line 466
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v2, v0}, Lrb/k;->b(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 477
    .line 478
    .line 479
    monitor-exit v8

    .line 480
    goto :goto_10

    .line 481
    :goto_f
    monitor-exit v8

    .line 482
    throw v0

    .line 483
    :cond_1c
    const-wide/16 v16, 0x3e8

    .line 484
    .line 485
    :goto_10
    iget-object v0, v2, Lrb/k;->c:Lrb/l;

    .line 486
    .line 487
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 488
    .line 489
    const-string v8, "zombie_check_auto_delete"

    .line 490
    .line 491
    invoke-interface {v0, v8, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-nez v0, :cond_1d

    .line 496
    .line 497
    goto/16 :goto_14

    .line 498
    .line 499
    :cond_1d
    iget-object v0, v2, Lrb/k;->c:Lrb/l;

    .line 500
    .line 501
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 502
    .line 503
    const-string v8, "zombie_check_delete_delay_seconds"

    .line 504
    .line 505
    const/4 v9, 0x3

    .line 506
    invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    const/16 v8, 0x12c

    .line 511
    .line 512
    invoke-static {v0, v6, v8}, Lr9/e0;->r(III)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    int-to-long v8, v0

    .line 517
    const-wide/16 v10, 0x0

    .line 518
    .line 519
    cmp-long v0, v8, v10

    .line 520
    .line 521
    if-lez v0, :cond_1e

    .line 522
    .line 523
    mul-long v8, v8, v16

    .line 524
    .line 525
    :try_start_6
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 526
    .line 527
    .line 528
    :catchall_6
    :cond_1e
    iget-object v0, v2, Lrb/k;->c:Lrb/l;

    .line 529
    .line 530
    iget-object v0, v0, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 531
    .line 532
    const-string v8, "zombie_check_auto_delete"

    .line 533
    .line 534
    invoke-interface {v0, v8, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_23

    .line 539
    .line 540
    invoke-virtual {v2, v4, v5}, Lrb/k;->a(J)Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-nez v0, :cond_1f

    .line 545
    .line 546
    goto :goto_14

    .line 547
    :cond_1f
    iget-object v0, v2, Lrb/k;->k:Lrb/c;

    .line 548
    .line 549
    if-eqz v0, :cond_21

    .line 550
    .line 551
    iget-object v4, v3, Lrb/d;->a:Ljava/lang/String;

    .line 552
    .line 553
    iget-object v5, v2, Lrb/k;->c:Lrb/l;

    .line 554
    .line 555
    iget-object v5, v5, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 556
    .line 557
    const-string v8, "zombie_check_clear_record"

    .line 558
    .line 559
    invoke-interface {v5, v8, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    invoke-virtual {v0, v4, v5}, Lrb/c;->b(Ljava/lang/String;Z)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-ne v0, v7, :cond_20

    .line 568
    .line 569
    goto :goto_11

    .line 570
    :cond_20
    move v7, v6

    .line 571
    :goto_11
    move v6, v7

    .line 572
    :cond_21
    iget-object v4, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 573
    .line 574
    monitor-enter v4

    .line 575
    :try_start_7
    iget-object v0, v3, Lrb/d;->b:Ljava/lang/String;

    .line 576
    .line 577
    if-eqz v6, :cond_22

    .line 578
    .line 579
    const-string v3, "\u5df2\u63d0\u4ea4\u5220\u9664\u597d\u53cb"

    .line 580
    .line 581
    goto :goto_12

    .line 582
    :catchall_7
    move-exception v0

    .line 583
    goto :goto_13

    .line 584
    :cond_22
    const-string v3, "\u5220\u9664\u597d\u53cb\u5931\u8d25"

    .line 585
    .line 586
    :goto_12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v0, ": "

    .line 595
    .line 596
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v2, v0}, Lrb/k;->b(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 607
    .line 608
    .line 609
    monitor-exit v4

    .line 610
    goto :goto_14

    .line 611
    :goto_13
    monitor-exit v4

    .line 612
    throw v0

    .line 613
    :cond_23
    :goto_14
    return-void

    .line 614
    :pswitch_0
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v0, Lo8/j;

    .line 617
    .line 618
    iget-object v2, v1, Lca/r;->j:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v2, Ljava/lang/String;

    .line 621
    .line 622
    iget-wide v3, v1, Lca/r;->h:J

    .line 623
    .line 624
    invoke-virtual {v0, v3, v4, v2}, Lo8/j;->b(JLjava/lang/String;)V

    .line 625
    .line 626
    .line 627
    return-void

    .line 628
    :pswitch_1
    iget-wide v2, v1, Lca/r;->h:J

    .line 629
    .line 630
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Lnb/w;

    .line 633
    .line 634
    iget-object v4, v1, Lca/r;->j:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v4, Ljava/lang/String;

    .line 637
    .line 638
    iget-wide v5, v0, Lnb/w;->i:J

    .line 639
    .line 640
    cmp-long v2, v2, v5

    .line 641
    .line 642
    if-nez v2, :cond_26

    .line 643
    .line 644
    iget-boolean v2, v0, Lnb/w;->h:Z

    .line 645
    .line 646
    if-nez v2, :cond_24

    .line 647
    .line 648
    goto :goto_15

    .line 649
    :cond_24
    const/4 v2, 0x0

    .line 650
    iput-object v2, v0, Lnb/w;->j:Lca/r;

    .line 651
    .line 652
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-eqz v2, :cond_25

    .line 657
    .line 658
    const-string v4, "\u7cfb\u7edf\u9ed8\u8ba4"

    .line 659
    .line 660
    :cond_25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    const-string v3, "\u5f15\u64ce "

    .line 663
    .line 664
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    const-string v3, " \u521d\u59cb\u5316\u8d85\u65f6"

    .line 671
    .line 672
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 680
    .line 681
    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v3}, Lnb/w;->v(Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    :cond_26
    :goto_15
    return-void

    .line 688
    :pswitch_2
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 689
    .line 690
    move-object v2, v0

    .line 691
    check-cast v2, Lha/h;

    .line 692
    .line 693
    iget-object v3, v1, Lca/r;->j:Ljava/lang/Object;

    .line 694
    .line 695
    iget-wide v6, v1, Lca/r;->h:J

    .line 696
    .line 697
    const-string v4, "\u6682\u65f6\u65e0\u6cd5\u786e\u8ba4\u5f53\u524d\u8d26\u53f7"

    .line 698
    .line 699
    iget-object v5, v2, Lha/h;->a:Lab/b;

    .line 700
    .line 701
    invoke-virtual {v2, v6, v7}, Lha/h;->g(J)Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-nez v0, :cond_27

    .line 706
    .line 707
    goto/16 :goto_19

    .line 708
    .line 709
    :cond_27
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    const/4 v8, 0x0

    .line 714
    if-nez v0, :cond_28

    .line 715
    .line 716
    const-string v0, "\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1 API \u672a\u5c31\u7eea"

    .line 717
    .line 718
    invoke-virtual {v5, v0, v8}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    goto/16 :goto_19

    .line 722
    .line 723
    :cond_28
    :try_start_8
    invoke-static {v3, v0}, Loh/h;->z(Ljava/lang/Object;Lp8/d0;)Lha/c0;

    .line 724
    .line 725
    .line 726
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 727
    goto :goto_16

    .line 728
    :catchall_8
    move-exception v0

    .line 729
    new-instance v9, Lsf/f;

    .line 730
    .line 731
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 732
    .line 733
    .line 734
    move-object v0, v9

    .line 735
    :goto_16
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 736
    .line 737
    .line 738
    move-result-object v9

    .line 739
    if-eqz v9, :cond_29

    .line 740
    .line 741
    const-string v10, "\u89e3\u6790\u670b\u53cb\u5708\u8bb0\u5f55\u5931\u8d25"

    .line 742
    .line 743
    invoke-virtual {v5, v10, v9}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    :cond_29
    instance-of v9, v0, Lsf/f;

    .line 747
    .line 748
    if-eqz v9, :cond_2a

    .line 749
    .line 750
    move-object v0, v8

    .line 751
    :cond_2a
    check-cast v0, Lha/c0;

    .line 752
    .line 753
    if-eqz v0, :cond_35

    .line 754
    .line 755
    iget-object v9, v0, Lha/c0;->a:Ljava/lang/String;

    .line 756
    .line 757
    iget-object v10, v2, Lha/h;->f:Ljava/lang/Object;

    .line 758
    .line 759
    monitor-enter v10

    .line 760
    :try_start_9
    iget-object v11, v2, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 761
    .line 762
    invoke-virtual {v11, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v11
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 766
    monitor-exit v10

    .line 767
    if-nez v11, :cond_35

    .line 768
    .line 769
    iget-object v10, v2, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 770
    .line 771
    invoke-virtual {v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v10

    .line 775
    if-eqz v10, :cond_2b

    .line 776
    .line 777
    goto/16 :goto_19

    .line 778
    .line 779
    :cond_2b
    invoke-virtual {v2, v0}, Lha/h;->q(Lha/c0;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v10

    .line 783
    if-eqz v10, :cond_2c

    .line 784
    .line 785
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v11

    .line 789
    if-nez v11, :cond_2c

    .line 790
    .line 791
    iget-object v0, v0, Lha/c0;->c:Ljava/lang/String;

    .line 792
    .line 793
    invoke-virtual {v2, v0}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    new-instance v3, Ljava/lang/StringBuilder;

    .line 798
    .line 799
    const-string v4, "\u5ffd\u7565 "

    .line 800
    .line 801
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    const-string v0, "\uff1a"

    .line 808
    .line 809
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v2, v0}, Lha/h;->i(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    goto/16 :goto_19

    .line 823
    .line 824
    :cond_2c
    iget-object v10, v2, Lha/h;->c:Lp8/o;

    .line 825
    .line 826
    invoke-virtual {v10, v3}, Lp8/o;->u(Ljava/lang/Object;)Lp8/v;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    if-nez v3, :cond_2d

    .line 831
    .line 832
    const-string v0, "\u6682\u65f6\u65e0\u6cd5\u89e3\u6790\u670b\u53cb\u5708\u539f\u751f\u5185\u5bb9: snsId="

    .line 833
    .line 834
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-virtual {v5, v0, v8}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    goto :goto_19

    .line 842
    :cond_2d
    iget v5, v3, Lp8/v;->c:I

    .line 843
    .line 844
    const/16 v8, 0x36

    .line 845
    .line 846
    if-ne v5, v8, :cond_2e

    .line 847
    .line 848
    sget-object v5, Lha/t;->k:Lha/t;

    .line 849
    .line 850
    goto :goto_18

    .line 851
    :cond_2e
    const/4 v8, 0x1

    .line 852
    if-ne v5, v8, :cond_2f

    .line 853
    .line 854
    sget-object v5, Lha/t;->i:Lha/t;

    .line 855
    .line 856
    goto :goto_18

    .line 857
    :cond_2f
    const/4 v8, 0x5

    .line 858
    if-eq v5, v8, :cond_32

    .line 859
    .line 860
    const/16 v8, 0xf

    .line 861
    .line 862
    if-ne v5, v8, :cond_30

    .line 863
    .line 864
    goto :goto_17

    .line 865
    :cond_30
    iget-object v5, v0, Lha/c0;->e:Lha/d0;

    .line 866
    .line 867
    sget-object v8, Lha/d0;->i:Lha/d0;

    .line 868
    .line 869
    if-ne v5, v8, :cond_31

    .line 870
    .line 871
    iget-object v5, v3, Lp8/v;->d:Ljava/util/ArrayList;

    .line 872
    .line 873
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 874
    .line 875
    .line 876
    move-result v5

    .line 877
    if-eqz v5, :cond_31

    .line 878
    .line 879
    sget-object v5, Lha/t;->h:Lha/t;

    .line 880
    .line 881
    goto :goto_18

    .line 882
    :cond_31
    sget-object v5, Lha/t;->l:Lha/t;

    .line 883
    .line 884
    goto :goto_18

    .line 885
    :cond_32
    :goto_17
    sget-object v5, Lha/t;->j:Lha/t;

    .line 886
    .line 887
    :goto_18
    invoke-virtual {v2, v0, v3, v5}, Lha/h;->o(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    if-eqz v8, :cond_34

    .line 892
    .line 893
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    if-eqz v4, :cond_33

    .line 898
    .line 899
    invoke-virtual {v2}, Lha/h;->l()J

    .line 900
    .line 901
    .line 902
    move-result-wide v8

    .line 903
    move-object v4, v3

    .line 904
    move-object v3, v0

    .line 905
    invoke-virtual/range {v2 .. v9}, Lha/h;->p(Lha/c0;Lp8/v;Lha/t;JJ)V

    .line 906
    .line 907
    .line 908
    goto :goto_19

    .line 909
    :cond_33
    move-object v3, v0

    .line 910
    invoke-virtual {v2, v3, v6, v7, v8}, Lha/h;->d(Lha/c0;JLjava/lang/String;)V

    .line 911
    .line 912
    .line 913
    goto :goto_19

    .line 914
    :cond_34
    move-object v4, v3

    .line 915
    move-object v3, v0

    .line 916
    invoke-virtual {v2}, Lha/h;->l()J

    .line 917
    .line 918
    .line 919
    move-result-wide v8

    .line 920
    invoke-virtual/range {v2 .. v9}, Lha/h;->p(Lha/c0;Lp8/v;Lha/t;JJ)V

    .line 921
    .line 922
    .line 923
    goto :goto_19

    .line 924
    :catchall_9
    move-exception v0

    .line 925
    monitor-exit v10

    .line 926
    throw v0

    .line 927
    :cond_35
    :goto_19
    return-void

    .line 928
    :pswitch_3
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 931
    .line 932
    iget-wide v2, v1, Lca/r;->h:J

    .line 933
    .line 934
    iget-object v4, v1, Lca/r;->j:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v4, La1/d;

    .line 937
    .line 938
    invoke-static {v0, v2, v3, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->B(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLa1/d;)V

    .line 939
    .line 940
    .line 941
    return-void

    .line 942
    :pswitch_4
    iget-object v0, v1, Lca/r;->i:Ljava/lang/Object;

    .line 943
    .line 944
    move-object v2, v0

    .line 945
    check-cast v2, Landroid/app/Activity;

    .line 946
    .line 947
    iget-object v0, v1, Lca/r;->j:Ljava/lang/Object;

    .line 948
    .line 949
    move-object v3, v0

    .line 950
    check-cast v3, Lca/e0;

    .line 951
    .line 952
    iget-wide v5, v1, Lca/r;->h:J

    .line 953
    .line 954
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    if-nez v0, :cond_37

    .line 959
    .line 960
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-eqz v0, :cond_36

    .line 965
    .line 966
    goto :goto_1a

    .line 967
    :cond_36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    const-string v0, "\u8f6c\u53d1[H]"

    .line 971
    .line 972
    const-string v8, ""

    .line 973
    .line 974
    const-string v4, "\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 975
    .line 976
    const-string v7, ""

    .line 977
    .line 978
    new-instance v9, Lsf/e;

    .line 979
    .line 980
    invoke-direct {v9, v4, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    const-string v4, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 984
    .line 985
    new-instance v10, Lsf/e;

    .line 986
    .line 987
    invoke-direct {v10, v4, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 988
    .line 989
    .line 990
    const-string v4, "\u5206\u4eab"

    .line 991
    .line 992
    new-instance v11, Lsf/e;

    .line 993
    .line 994
    invoke-direct {v11, v4, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 995
    .line 996
    .line 997
    const-string v4, "\u7fa4\u53d1\u52a9\u624b"

    .line 998
    .line 999
    new-instance v12, Lsf/e;

    .line 1000
    .line 1001
    invoke-direct {v12, v4, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1002
    .line 1003
    .line 1004
    const-string v4, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 1005
    .line 1006
    new-instance v13, Lsf/e;

    .line 1007
    .line 1008
    invoke-direct {v13, v4, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1009
    .line 1010
    .line 1011
    filled-new-array {v9, v10, v11, v12, v13}, [Lsf/e;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v9

    .line 1019
    move-object v4, v2

    .line 1020
    new-instance v2, Lca/i;

    .line 1021
    .line 1022
    const/4 v7, 0x0

    .line 1023
    invoke-direct/range {v2 .. v7}, Lca/i;-><init>(Lca/e0;Landroid/app/Activity;JI)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v7, Lbi/c;

    .line 1027
    .line 1028
    const/4 v3, 0x7

    .line 1029
    invoke-direct {v7, v3}, Lbi/c;-><init>(I)V

    .line 1030
    .line 1031
    .line 1032
    move-object v6, v2

    .line 1033
    move-object v2, v4

    .line 1034
    move-object v4, v8

    .line 1035
    sget-object v8, Lwb/lv;->j:Lwb/lv;

    .line 1036
    .line 1037
    move-object v3, v0

    .line 1038
    move-object v5, v9

    .line 1039
    invoke-static/range {v2 .. v8}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1040
    .line 1041
    .line 1042
    :cond_37
    :goto_1a
    return-void

    .line 1043
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
