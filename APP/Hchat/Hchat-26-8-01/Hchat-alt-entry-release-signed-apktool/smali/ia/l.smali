.class public final synthetic Lia/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;ZLwb/kv;Ljava/util/Set;Lwb/me;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lia/l;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lia/l;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lia/l;->j:Z

    .line 10
    .line 11
    iput-object p3, p0, Lia/l;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lia/l;->h:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lia/l;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lia/l;->g:I

    iput-object p1, p0, Lia/l;->h:Ljava/lang/Object;

    iput-object p2, p0, Lia/l;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lia/l;->j:Z

    iput-object p4, p0, Lia/l;->k:Ljava/lang/Object;

    iput-object p5, p0, Lia/l;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLandroid/content/Context;Li0/a1;Li0/a1;)V
    .locals 1

    .line 19
    const/4 v0, 0x4

    iput v0, p0, Lia/l;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/l;->h:Ljava/lang/Object;

    iput-boolean p2, p0, Lia/l;->j:Z

    iput-object p3, p0, Lia/l;->i:Ljava/lang/Object;

    iput-object p4, p0, Lia/l;->k:Ljava/lang/Object;

    iput-object p5, p0, Lia/l;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p6, p0, Lia/l;->g:I

    iput-boolean p1, p0, Lia/l;->j:Z

    iput-object p2, p0, Lia/l;->h:Ljava/lang/Object;

    iput-object p3, p0, Lia/l;->i:Ljava/lang/Object;

    iput-object p4, p0, Lia/l;->k:Ljava/lang/Object;

    iput-object p5, p0, Lia/l;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lia/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lia/l;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/u0;

    .line 10
    .line 11
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lg8/i;

    .line 15
    .line 16
    iget-object v0, p0, Lia/l;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Landroid/os/Handler;

    .line 20
    .line 21
    iget-object v0, p0, Lia/l;->l:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, Lfg/p;

    .line 25
    .line 26
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, Lia/l;->j:Z

    .line 37
    .line 38
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    :try_start_1
    invoke-virtual {v2}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    :try_start_2
    new-instance v8, Lsf/f;

    .line 49
    .line 50
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v8

    .line 54
    :goto_0
    nop

    .line 55
    instance-of v8, v0, Lsf/f;

    .line 56
    .line 57
    if-eqz v8, :cond_0

    .line 58
    .line 59
    move-object v0, v7

    .line 60
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_6

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 77
    .line 78
    iget-object v9, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_2

    .line 85
    .line 86
    iget-object v9, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :cond_2
    :goto_2
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    iget-object v8, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    :cond_4
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_1

    .line 110
    .line 111
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-nez v11, :cond_4

    .line 122
    .line 123
    invoke-virtual {v6, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    if-nez v11, :cond_5

    .line 128
    .line 129
    new-instance v11, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v6, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :cond_5
    check-cast v11, Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    sget-object v0, Lwb/u0;->g:Lwb/u0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    .line 145
    sget-object v8, Lwb/u0;->i:Lwb/u0;

    .line 146
    .line 147
    const/4 v9, 0x0

    .line 148
    sget-object v10, Lwb/u0;->j:Lwb/u0;

    .line 149
    .line 150
    if-eq v1, v0, :cond_7

    .line 151
    .line 152
    if-eq v1, v8, :cond_7

    .line 153
    .line 154
    if-ne v1, v10, :cond_b

    .line 155
    .line 156
    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v11, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-eqz v12, :cond_a

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    check-cast v12, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 180
    .line 181
    iget-object v13, v12, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v6, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    check-cast v13, Ljava/util/List;

    .line 188
    .line 189
    if-nez v13, :cond_9

    .line 190
    .line 191
    move-object v13, v7

    .line 192
    :cond_9
    const/4 v14, 0x4

    .line 193
    invoke-static {v12, v9, v13, v14}, Lwb/ho;->j7(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;I)Lwb/s0;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    if-eqz v12, :cond_8

    .line 198
    .line 199
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_a
    invoke-static {v5, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 204
    .line 205
    .line 206
    :cond_b
    sget-object v0, Lwb/u0;->h:Lwb/u0;

    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    if-eq v1, v0, :cond_c

    .line 210
    .line 211
    if-eq v1, v8, :cond_c

    .line 212
    .line 213
    if-ne v1, v10, :cond_f

    .line 214
    .line 215
    :cond_c
    invoke-virtual {v2}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v8, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :cond_d
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    if-eqz v11, :cond_e

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    check-cast v11, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 239
    .line 240
    const/4 v12, 0x6

    .line 241
    const/4 v13, 0x1

    .line 242
    invoke-static {v11, v13, v6, v12}, Lwb/ho;->j7(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;I)Lwb/s0;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    if-eqz v11, :cond_d

    .line 247
    .line 248
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_e
    invoke-static {v5, v8}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 253
    .line 254
    .line 255
    :cond_f
    if-ne v1, v10, :cond_12

    .line 256
    .line 257
    const-string v0, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE \'gh\\_%\' ESCAPE \'\\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"

    .line 258
    .line 259
    invoke-virtual {v2, v0, v6}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    new-instance v1, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    :cond_10
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_11

    .line 277
    .line 278
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 283
    .line 284
    const/4 v8, 0x2

    .line 285
    invoke-static {v2, v9, v6, v8}, Lwb/ho;->j7(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;I)Lwb/s0;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    if-eqz v2, :cond_10

    .line 290
    .line 291
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_11
    invoke-static {v5, v1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 296
    .line 297
    .line 298
    :cond_12
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_13

    .line 303
    .line 304
    invoke-virtual {v0}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    goto :goto_7

    .line 309
    :cond_13
    move-object v0, v6

    .line 310
    :goto_7
    if-nez v0, :cond_14

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_14
    move-object v7, v0

    .line 314
    :goto_8
    new-instance v0, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_16

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    add-int/lit8 v7, v9, 0x1

    .line 338
    .line 339
    if-ltz v9, :cond_15

    .line 340
    .line 341
    check-cast v2, Ll8/b;

    .line 342
    .line 343
    iget-object v2, v2, Ll8/b;->a:Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    new-instance v9, Lsf/e;

    .line 350
    .line 351
    invoke-direct {v9, v2, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move v9, v7

    .line 358
    goto :goto_9

    .line 359
    :cond_15
    invoke-static {}, La/a;->Q0()V

    .line 360
    .line 361
    .line 362
    throw v6

    .line 363
    :cond_16
    invoke-static {v0}, Ltf/y;->e0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    new-instance v1, Ljava/util/HashSet;

    .line 368
    .line 369
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 370
    .line 371
    .line 372
    new-instance v2, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    :cond_17
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_18

    .line 386
    .line 387
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    move-object v7, v6

    .line 392
    check-cast v7, Lwb/s0;

    .line 393
    .line 394
    iget-object v7, v7, Lwb/s0;->a:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    if-eqz v7, :cond_17

    .line 401
    .line 402
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_18
    new-instance v1, Lc9/z;

    .line 407
    .line 408
    const/4 v5, 0x4

    .line 409
    invoke-direct {v1, v0, v5}, Lc9/z;-><init>(Ljava/util/Map;I)V

    .line 410
    .line 411
    .line 412
    new-instance v0, Lwb/kn;

    .line 413
    .line 414
    const/4 v5, 0x5

    .line 415
    invoke-direct {v0, v1, v5}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 416
    .line 417
    .line 418
    new-instance v1, Lwb/kn;

    .line 419
    .line 420
    const/4 v5, 0x6

    .line 421
    invoke-direct {v1, v0, v5}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lwb/kn;

    .line 425
    .line 426
    const/4 v5, 0x7

    .line 427
    invoke-direct {v0, v1, v5}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 428
    .line 429
    .line 430
    invoke-static {v2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    new-instance v1, Lrb/g;

    .line 435
    .line 436
    const/4 v2, 0x6

    .line 437
    invoke-direct {v1, v4, v2, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 441
    .line 442
    .line 443
    goto :goto_c

    .line 444
    :goto_b
    new-instance v1, Lrb/g;

    .line 445
    .line 446
    const/4 v2, 0x7

    .line 447
    invoke-direct {v1, v4, v2, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 451
    .line 452
    .line 453
    :goto_c
    return-void

    .line 454
    :pswitch_0
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 455
    .line 456
    move-object v3, v0

    .line 457
    check-cast v3, Landroid/app/Activity;

    .line 458
    .line 459
    iget-boolean v0, p0, Lia/l;->j:Z

    .line 460
    .line 461
    iget-object v1, p0, Lia/l;->k:Ljava/lang/Object;

    .line 462
    .line 463
    move-object v2, v1

    .line 464
    check-cast v2, Lwb/kv;

    .line 465
    .line 466
    iget-object v1, p0, Lia/l;->h:Ljava/lang/Object;

    .line 467
    .line 468
    move-object v5, v1

    .line 469
    check-cast v5, Ljava/util/Set;

    .line 470
    .line 471
    iget-object v1, p0, Lia/l;->l:Ljava/lang/Object;

    .line 472
    .line 473
    move-object v6, v1

    .line 474
    check-cast v6, Lwb/me;

    .line 475
    .line 476
    :try_start_4
    invoke-static {v0}, Lbe/h;->J(Z)Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 480
    goto :goto_d

    .line 481
    :catchall_2
    move-exception v0

    .line 482
    new-instance v1, Lsf/f;

    .line 483
    .line 484
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 485
    .line 486
    .line 487
    move-object v0, v1

    .line 488
    :goto_d
    nop

    .line 489
    instance-of v1, v0, Lsf/f;

    .line 490
    .line 491
    if-eqz v1, :cond_19

    .line 492
    .line 493
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 494
    .line 495
    :cond_19
    move-object v4, v0

    .line 496
    check-cast v4, Ljava/util/List;

    .line 497
    .line 498
    new-instance v1, Lca/x;

    .line 499
    .line 500
    const/16 v7, 0x10

    .line 501
    .line 502
    invoke-direct/range {v1 .. v7}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v3, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_1
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v0, Landroid/content/Context;

    .line 512
    .line 513
    iget-object v1, p0, Lia/l;->k:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v1, Li0/a1;

    .line 516
    .line 517
    iget-object v2, p0, Lia/l;->l:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v2, Li0/a1;

    .line 520
    .line 521
    iget-object v3, p0, Lia/l;->h:Ljava/lang/Object;

    .line 522
    .line 523
    instance-of v4, v3, Lsf/f;

    .line 524
    .line 525
    if-eqz v4, :cond_1b

    .line 526
    .line 527
    iget-boolean v2, p0, Lia/l;->j:Z

    .line 528
    .line 529
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    if-eqz v1, :cond_1a

    .line 541
    .line 542
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    goto :goto_e

    .line 547
    :cond_1a
    const/4 v1, 0x0

    .line 548
    :goto_e
    new-instance v2, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    const-string v3, "\u5207\u6362\u5931\u8d25: "

    .line 551
    .line 552
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    const/4 v2, 0x0

    .line 563
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 568
    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_1b
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    check-cast v0, Ljava/lang/Number;

    .line 576
    .line 577
    const/4 v1, 0x1

    .line 578
    invoke-static {v0, v1, v2}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 579
    .line 580
    .line 581
    :goto_f
    return-void

    .line 582
    :pswitch_2
    iget-object v0, p0, Lia/l;->h:Ljava/lang/Object;

    .line 583
    .line 584
    move-object v4, v0

    .line 585
    check-cast v4, Landroid/content/Context;

    .line 586
    .line 587
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 588
    .line 589
    move-object v5, v0

    .line 590
    check-cast v5, Leb/c0;

    .line 591
    .line 592
    iget-object v0, p0, Lia/l;->k:Ljava/lang/Object;

    .line 593
    .line 594
    move-object v3, v0

    .line 595
    check-cast v3, Ljava/util/Map;

    .line 596
    .line 597
    iget-object v0, p0, Lia/l;->l:Ljava/lang/Object;

    .line 598
    .line 599
    move-object v6, v0

    .line 600
    check-cast v6, Li0/a1;

    .line 601
    .line 602
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 603
    .line 604
    iget-object v1, v5, Leb/c0;->a:Ljava/lang/String;

    .line 605
    .line 606
    iget-boolean v2, p0, Lia/l;->j:Z

    .line 607
    .line 608
    invoke-virtual {v0, v4, v1, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    new-instance v0, Landroid/os/Handler;

    .line 613
    .line 614
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 619
    .line 620
    .line 621
    new-instance v1, Lca/x;

    .line 622
    .line 623
    invoke-direct/range {v1 .. v6}, Lca/x;-><init>(Ljava/lang/Object;Ljava/util/Map;Landroid/content/Context;Leb/c0;Li0/a1;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 627
    .line 628
    .line 629
    return-void

    .line 630
    :pswitch_3
    iget-object v0, p0, Lia/l;->h:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Ljava/lang/String;

    .line 633
    .line 634
    iget-object v1, p0, Lia/l;->i:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v1, Li0/a1;

    .line 637
    .line 638
    iget-object v2, p0, Lia/l;->k:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v2, Landroid/content/Context;

    .line 641
    .line 642
    iget-object v3, p0, Lia/l;->l:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v3, Li0/a1;

    .line 645
    .line 646
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 647
    .line 648
    invoke-interface {v1, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    iget-boolean v1, p0, Lia/l;->j:Z

    .line 652
    .line 653
    if-eqz v1, :cond_1c

    .line 654
    .line 655
    const-string v1, "\u5df2\u53d1\u9001\u5230 "

    .line 656
    .line 657
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    goto :goto_10

    .line 662
    :cond_1c
    const-string v0, "\u53d1\u9001\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 663
    .line 664
    :goto_10
    invoke-static {v2, v3, v0}, Lwb/ho;->h(Landroid/content/Context;Li0/a1;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :pswitch_4
    iget-object v0, p0, Lia/l;->h:Ljava/lang/Object;

    .line 669
    .line 670
    move-object v1, v0

    .line 671
    check-cast v1, Lia/q;

    .line 672
    .line 673
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 674
    .line 675
    move-object v4, v0

    .line 676
    check-cast v4, Landroid/app/Activity;

    .line 677
    .line 678
    iget-boolean v0, p0, Lia/l;->j:Z

    .line 679
    .line 680
    iget-object v2, p0, Lia/l;->k:Ljava/lang/Object;

    .line 681
    .line 682
    move-object v3, v2

    .line 683
    check-cast v3, Lwb/kv;

    .line 684
    .line 685
    iget-object v2, p0, Lia/l;->l:Ljava/lang/Object;

    .line 686
    .line 687
    move-object v5, v2

    .line 688
    check-cast v5, Lc9/u;

    .line 689
    .line 690
    :try_start_5
    invoke-static {v0}, Lbe/h;->J(Z)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 694
    goto :goto_11

    .line 695
    :catchall_3
    move-exception v0

    .line 696
    new-instance v2, Lsf/f;

    .line 697
    .line 698
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 699
    .line 700
    .line 701
    move-object v0, v2

    .line 702
    :goto_11
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    if-eqz v2, :cond_1d

    .line 707
    .line 708
    iget-object v1, v1, Lia/q;->c:Lab/b;

    .line 709
    .line 710
    const-string v6, "\u52a0\u8f7d\u670b\u53cb\u5708\u4f2a\u96c6\u8d5e\u5019\u9009\u4eba\u5931\u8d25"

    .line 711
    .line 712
    invoke-virtual {v1, v6, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    :cond_1d
    instance-of v1, v0, Lsf/f;

    .line 716
    .line 717
    if-eqz v1, :cond_1e

    .line 718
    .line 719
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 720
    .line 721
    :cond_1e
    move-object v6, v0

    .line 722
    check-cast v6, Ljava/util/List;

    .line 723
    .line 724
    new-instance v2, Lb9/c;

    .line 725
    .line 726
    const/4 v7, 0x6

    .line 727
    invoke-direct/range {v2 .. v7}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v4, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :pswitch_5
    iget-object v0, p0, Lia/l;->h:Ljava/lang/Object;

    .line 735
    .line 736
    move-object v5, v0

    .line 737
    check-cast v5, Lia/q;

    .line 738
    .line 739
    iget-object v0, p0, Lia/l;->i:Ljava/lang/Object;

    .line 740
    .line 741
    move-object v3, v0

    .line 742
    check-cast v3, Landroid/app/Activity;

    .line 743
    .line 744
    iget-boolean v0, p0, Lia/l;->j:Z

    .line 745
    .line 746
    iget-object v1, p0, Lia/l;->k:Ljava/lang/Object;

    .line 747
    .line 748
    move-object v2, v1

    .line 749
    check-cast v2, Lwb/kv;

    .line 750
    .line 751
    iget-object v1, p0, Lia/l;->l:Ljava/lang/Object;

    .line 752
    .line 753
    move-object v6, v1

    .line 754
    check-cast v6, Lia/j;

    .line 755
    .line 756
    :try_start_6
    invoke-static {v0}, Lbe/h;->J(Z)Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 760
    goto :goto_12

    .line 761
    :catchall_4
    move-exception v0

    .line 762
    new-instance v1, Lsf/f;

    .line 763
    .line 764
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 765
    .line 766
    .line 767
    move-object v0, v1

    .line 768
    :goto_12
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    if-eqz v1, :cond_1f

    .line 773
    .line 774
    iget-object v4, v5, Lia/q;->c:Lab/b;

    .line 775
    .line 776
    const-string v7, "\u52a0\u8f7d\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u597d\u53cb\u5931\u8d25"

    .line 777
    .line 778
    invoke-virtual {v4, v7, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    :cond_1f
    instance-of v1, v0, Lsf/f;

    .line 782
    .line 783
    if-eqz v1, :cond_20

    .line 784
    .line 785
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 786
    .line 787
    :cond_20
    move-object v4, v0

    .line 788
    check-cast v4, Ljava/util/List;

    .line 789
    .line 790
    new-instance v1, Lca/x;

    .line 791
    .line 792
    const/16 v7, 0x8

    .line 793
    .line 794
    invoke-direct/range {v1 .. v7}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v3, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 798
    .line 799
    .line 800
    return-void

    .line 801
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
