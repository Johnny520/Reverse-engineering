.class public final synthetic Lq9/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lhb/r;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lq9/f;

.field public final synthetic k:Lq9/g;


# direct methods
.method public synthetic constructor <init>(Lhb/r;Ljava/lang/String;Lq9/f;Lq9/g;I)V
    .locals 0

    .line 1
    iput p5, p0, Lq9/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lq9/c;->h:Lhb/r;

    .line 4
    .line 5
    iput-object p2, p0, Lq9/c;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lq9/c;->j:Lq9/f;

    .line 8
    .line 9
    iput-object p4, p0, Lq9/c;->k:Lq9/g;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lq9/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/c;->h:Lhb/r;

    .line 7
    .line 8
    iget-object v2, p0, Lq9/c;->i:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lq9/c;->k:Lq9/g;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v3, v1, Lq9/g;->h:Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v3, "group_rename_card_title"

    .line 18
    .line 19
    const-string v4, "%userName% \u4fee\u6539\u4e86\u7fa4\u5185\u6635\u79f0"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v3, v4}, Lhb/r;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v0, v1, Lq9/g;->i:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-string v1, "group_rename_card_desc"

    .line 31
    .line 32
    const-string v4, "\u65e7\u6635\u79f0\uff1a%oldGroupNickname%\n\u65b0\u6635\u79f0\uff1a%newGroupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1, v4}, Lhb/r;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_1
    invoke-static {v3}, Lhb/r;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v3, p0, Lq9/c;->j:Lq9/f;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lhb/r;->b(Ljava/lang/String;Lq9/f;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v0}, Lhb/r;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0, v3}, Lhb/r;->b(Ljava/lang/String;Lq9/f;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    goto/16 :goto_a

    .line 69
    .line 70
    :cond_2
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v8, 0x1

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v3, v3, Lq9/f;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v3, v8}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move-object v0, v5

    .line 86
    :goto_2
    if-nez v0, :cond_4

    .line 87
    .line 88
    const-string v0, ""

    .line 89
    .line 90
    :cond_4
    move-object v3, v0

    .line 91
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    :goto_3
    move-object v6, v5

    .line 98
    move-object v5, v3

    .line 99
    move-object v3, v1

    .line 100
    goto :goto_7

    .line 101
    :cond_5
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 102
    .line 103
    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 114
    .line 115
    const/16 v6, 0x4b0

    .line 116
    .line 117
    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 121
    .line 122
    .line 123
    const-string v6, "GET"

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 129
    .line 130
    .line 131
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {v6}, Lg4/a;->G(Ljava/io/InputStream;)[B

    .line 136
    .line 137
    .line 138
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    :try_start_2
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    goto :goto_4

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    move-object v7, v0

    .line 150
    :try_start_3
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 151
    :catchall_2
    move-exception v0

    .line 152
    :try_start_4
    invoke-static {v6, v7}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 156
    :goto_4
    new-instance v7, Lsf/f;

    .line 157
    .line 158
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    :goto_5
    instance-of v0, v7, Lsf/f;

    .line 162
    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_6
    move-object v5, v7

    .line 167
    :goto_6
    check-cast v5, [B

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :goto_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-eqz v1, :cond_7

    .line 175
    .line 176
    const-string v7, ""

    .line 177
    .line 178
    invoke-virtual/range {v1 .. v7}, Lj8/p;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-ne v0, v8, :cond_7

    .line 183
    .line 184
    goto :goto_a

    .line 185
    :cond_7
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_8
    if-eqz v0, :cond_b

    .line 197
    .line 198
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-instance v3, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :cond_9
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_a

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    move-object v5, v4

    .line 226
    check-cast v5, Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_9

    .line 233
    .line 234
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_a
    const/4 v7, 0x0

    .line 239
    const/16 v8, 0x3e

    .line 240
    .line 241
    const-string v4, "\n"

    .line 242
    .line 243
    const/4 v5, 0x0

    .line 244
    const/4 v6, 0x0

    .line 245
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v0, v2, v1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    :cond_b
    :goto_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_0
    iget-object v0, p0, Lq9/c;->h:Lhb/r;

    .line 256
    .line 257
    iget-object v1, p0, Lq9/c;->i:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v2, p0, Lq9/c;->k:Lq9/g;

    .line 260
    .line 261
    if-eqz v2, :cond_c

    .line 262
    .line 263
    iget-object v2, v2, Lq9/g;->g:Ljava/lang/String;

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_c
    const-string v2, "group_rename_text"

    .line 267
    .line 268
    const-string v3, "%userName% \u5c06\u7fa4\u5185\u6635\u79f0\u4ece\u201c%oldGroupNickname%\u201d\u4fee\u6539\u4e3a\u201c%newGroupNickname%\u201d"

    .line 269
    .line 270
    invoke-virtual {v0, v1, v2, v3}, Lhb/r;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    :goto_b
    invoke-static {v2}, Lhb/r;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iget-object v3, p0, Lq9/c;->j:Lq9/f;

    .line 279
    .line 280
    invoke-static {v2, v3}, Lhb/r;->b(Ljava/lang/String;Lq9/f;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-eqz v3, :cond_d

    .line 289
    .line 290
    goto/16 :goto_f

    .line 291
    .line 292
    :cond_d
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    if-eqz v3, :cond_e

    .line 297
    .line 298
    goto :goto_c

    .line 299
    :cond_e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    :goto_c
    const/4 v4, 0x0

    .line 304
    if-nez v3, :cond_f

    .line 305
    .line 306
    iget-object v0, v0, Lhb/r;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Lia/t;

    .line 309
    .line 310
    const-string v1, "\u6539\u540d\u63d0\u9192\u53d1\u9001\u5931\u8d25: \u6d88\u606f\u53d1\u9001 API \u672a\u5c31\u7eea"

    .line 311
    .line 312
    invoke-virtual {v0, v1, v4}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    goto :goto_f

    .line 316
    :cond_f
    new-instance v5, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 319
    .line 320
    .line 321
    iget-object v6, v0, Lhb/r;->i:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v6, Log/k;

    .line 324
    .line 325
    new-instance v7, Lm/b;

    .line 326
    .line 327
    invoke-direct {v7, v5, v0, v1}, Lm/b;-><init>(Ljava/util/ArrayList;Lhb/r;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v2, v7}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_10

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_10
    new-instance v4, Lq9/e;

    .line 342
    .line 343
    invoke-static {v5}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-direct {v4, v0, v5}, Lq9/e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 352
    .line 353
    .line 354
    :goto_d
    if-nez v4, :cond_11

    .line 355
    .line 356
    invoke-virtual {v3, v1, v2}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    goto :goto_e

    .line 361
    :cond_11
    iget-object v0, v4, Lq9/e;->b:Ljava/util/List;

    .line 362
    .line 363
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    iget-object v5, v4, Lq9/e;->a:Ljava/lang/String;

    .line 368
    .line 369
    if-eqz v2, :cond_12

    .line 370
    .line 371
    invoke-virtual {v3, v1, v5}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    goto :goto_e

    .line 376
    :cond_12
    invoke-virtual {v3, v1, v5, v0}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    :goto_e
    if-nez v0, :cond_14

    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    if-eqz v4, :cond_13

    .line 384
    .line 385
    iget-object v2, v4, Lq9/e;->a:Ljava/lang/String;

    .line 386
    .line 387
    if-eqz v2, :cond_13

    .line 388
    .line 389
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    const/4 v5, 0x1

    .line 394
    xor-int/2addr v2, v5

    .line 395
    if-ne v2, v5, :cond_13

    .line 396
    .line 397
    move v0, v5

    .line 398
    :cond_13
    if-eqz v0, :cond_14

    .line 399
    .line 400
    iget-object v0, v4, Lq9/e;->a:Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v3, v1, v0}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 403
    .line 404
    .line 405
    :cond_14
    :goto_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 406
    .line 407
    return-object v0

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
