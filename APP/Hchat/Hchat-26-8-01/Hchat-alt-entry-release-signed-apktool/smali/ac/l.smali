.class public final synthetic Lac/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 15
    iput p1, p0, Lac/l;->g:I

    iput-object p2, p0, Lac/l;->h:Ljava/lang/Object;

    iput-object p4, p0, Lac/l;->j:Ljava/lang/Object;

    iput-object p3, p0, Lac/l;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;Lgg/s;Lqb/k;)V
    .locals 0

    .line 1
    const/16 p4, 0x1c

    .line 2
    .line 3
    iput p4, p0, Lac/l;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lac/l;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lac/l;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lac/l;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;Lia/q;Lia/j;)V
    .locals 0

    .line 16
    const/16 p3, 0x10

    iput p3, p0, Lac/l;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lac/l;->h:Ljava/lang/Object;

    iput-object p2, p0, Lac/l;->i:Ljava/lang/Object;

    iput-object p4, p0, Lac/l;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Lac/l;->g:I

    iput-object p2, p0, Lac/l;->h:Ljava/lang/Object;

    iput-object p3, p0, Lac/l;->i:Ljava/lang/Object;

    iput-object p4, p0, Lac/l;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p4, p0, Lac/l;->g:I

    iput-object p1, p0, Lac/l;->h:Ljava/lang/Object;

    iput-object p2, p0, Lac/l;->i:Ljava/lang/Object;

    iput-object p3, p0, Lac/l;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lac/l;->g:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, Lqb/k;

    .line 16
    .line 17
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lqb/i;

    .line 25
    .line 26
    const-string v6, "\u8bed\u97f3\u4fdd\u5b58\u5931\u8d25"

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v2}, Lqb/k;->c()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    new-instance v8, Ljava/io/File;

    .line 35
    .line 36
    iget-object v0, v0, Lqb/i;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v8, v7}, Lqb/k;->E(Ljava/io/File;Ljava/io/File;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v7, v4

    .line 49
    :goto_0
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const-string v8, ""

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    const-string v8, "\u8bed\u97f3\u8f6c MP3 \u5931\u8d25"

    .line 57
    .line 58
    :goto_1
    new-instance v9, Lqb/h;

    .line 59
    .line 60
    invoke-direct {v9, v7, v8, v0}, Lqb/h;-><init>(Ljava/io/File;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    new-instance v9, Lqb/h;

    .line 65
    .line 66
    const-string v0, "\u521b\u5efa\u4fdd\u5b58\u76ee\u5f55\u5931\u8d25"

    .line 67
    .line 68
    invoke-direct {v9, v4, v0, v5}, Lqb/h;-><init>(Ljava/io/File;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :goto_2
    new-instance v9, Lsf/f;

    .line 73
    .line 74
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    invoke-static {v9}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_3
    iget-object v2, v2, Lqb/k;->b:Lia/t;

    .line 85
    .line 86
    const-string v7, "\u4fdd\u5b58\u8bed\u97f3\u5931\u8d25"

    .line 87
    .line 88
    invoke-virtual {v2, v7, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v9, Lqb/h;

    .line 92
    .line 93
    invoke-direct {v9, v4, v6, v5}, Lqb/h;-><init>(Ljava/io/File;Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    :goto_4
    check-cast v9, Lqb/h;

    .line 97
    .line 98
    iget-boolean v0, v9, Lqb/h;->a:Z

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v9, Lqb/h;->b:Ljava/io/File;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "\u8bed\u97f3\u5df2\u4fdd\u5b58: "

    .line 111
    .line 112
    invoke-static {v2, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    goto :goto_6

    .line 117
    :cond_4
    iget-object v0, v9, Lqb/h;->c:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_5
    move-object v6, v0

    .line 127
    :goto_5
    move-object v0, v6

    .line 128
    :goto_6
    invoke-static {v3, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_0
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroid/app/Activity;

    .line 135
    .line 136
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Ljava/util/List;

    .line 139
    .line 140
    iget-object v4, v1, Lac/l;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v4, Lgg/s;

    .line 143
    .line 144
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_8

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    iget v4, v4, Lgg/s;->g:I

    .line 155
    .line 156
    if-ne v5, v3, :cond_7

    .line 157
    .line 158
    if-ne v4, v3, :cond_6

    .line 159
    .line 160
    const-string v2, "\u8bed\u97f3\u8f6c\u53d1\u6210\u529f"

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_6
    const-string v2, "\u8bed\u97f3\u8f6c\u53d1\u5931\u8d25"

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    const-string v3, "\u8bed\u97f3\u8f6c\u53d1\u5b8c\u6210: "

    .line 171
    .line 172
    const-string v5, "/"

    .line 173
    .line 174
    invoke-static {v4, v3, v5, v2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :goto_7
    invoke-static {v0, v2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    return-void

    .line 182
    :pswitch_1
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v7, v0

    .line 185
    check-cast v7, Lhb/r;

    .line 186
    .line 187
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v8, v0

    .line 190
    check-cast v8, Ljava/lang/String;

    .line 191
    .line 192
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v12, v0

    .line 195
    check-cast v12, Lq9/d;

    .line 196
    .line 197
    :try_start_1
    invoke-virtual {v7, v8}, Lhb/r;->q(Ljava/lang/String;)Lq9/g;

    .line 198
    .line 199
    .line 200
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 201
    iget-object v0, v7, Lhb/r;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Landroid/content/SharedPreferences;

    .line 204
    .line 205
    if-eqz v10, :cond_9

    .line 206
    .line 207
    :try_start_2
    iget-boolean v6, v10, Lq9/g;->c:Z

    .line 208
    .line 209
    if-nez v6, :cond_9

    .line 210
    .line 211
    goto/16 :goto_10

    .line 212
    .line 213
    :catchall_1
    move-exception v0

    .line 214
    goto/16 :goto_11

    .line 215
    .line 216
    :cond_9
    if-eqz v10, :cond_a

    .line 217
    .line 218
    iget v6, v10, Lq9/g;->d:I

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_a
    const-string v6, "group_rename_delay_seconds"

    .line 222
    .line 223
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    :goto_8
    const/16 v9, 0x258

    .line 228
    .line 229
    invoke-static {v6, v5, v9}, Lr9/e0;->r(III)I

    .line 230
    .line 231
    .line 232
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 233
    int-to-long v13, v6

    .line 234
    const-wide/16 v15, 0x3e8

    .line 235
    .line 236
    mul-long/2addr v13, v15

    .line 237
    const-wide/16 v15, 0x0

    .line 238
    .line 239
    cmp-long v6, v13, v15

    .line 240
    .line 241
    if-gtz v6, :cond_b

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_b
    :try_start_3
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 245
    .line 246
    .line 247
    goto :goto_9

    .line 248
    :catch_0
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 253
    .line 254
    .line 255
    :goto_9
    invoke-virtual {v7, v8, v12}, Lhb/r;->r(Ljava/lang/String;Lq9/d;)Lq9/f;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    if-eqz v10, :cond_c

    .line 260
    .line 261
    iget-object v0, v10, Lq9/g;->e:Ljava/lang/String;

    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_c
    const-string v6, "text"

    .line 265
    .line 266
    const-string v11, "group_rename_prompt_type"

    .line 267
    .line 268
    invoke-static {v11, v8}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    const-string v14, "global"

    .line 273
    .line 274
    invoke-interface {v0, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    if-eqz v13, :cond_d

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_d
    move-object v13, v14

    .line 282
    :goto_a
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-eqz v14, :cond_f

    .line 287
    .line 288
    invoke-interface {v0, v11, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_e

    .line 293
    .line 294
    move-object v6, v0

    .line 295
    :cond_e
    move-object v13, v6

    .line 296
    :cond_f
    invoke-static {v13}, Lx6/d;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    :goto_b
    new-instance v6, Lq9/c;

    .line 301
    .line 302
    const/4 v11, 0x0

    .line 303
    invoke-direct/range {v6 .. v11}, Lq9/c;-><init>(Lhb/r;Ljava/lang/String;Lq9/f;Lq9/g;I)V

    .line 304
    .line 305
    .line 306
    move-object v13, v6

    .line 307
    new-instance v6, Lq9/c;

    .line 308
    .line 309
    const/4 v11, 0x1

    .line 310
    invoke-direct/range {v6 .. v11}, Lq9/c;-><init>(Lhb/r;Ljava/lang/String;Lq9/f;Lq9/g;I)V

    .line 311
    .line 312
    .line 313
    const-string v9, "card"

    .line 314
    .line 315
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    if-eqz v9, :cond_10

    .line 320
    .line 321
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    goto :goto_d

    .line 326
    :cond_10
    const-string v9, "both"

    .line 327
    .line 328
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_13

    .line 333
    .line 334
    if-eqz v10, :cond_11

    .line 335
    .line 336
    iget-object v0, v10, Lq9/g;->f:Ljava/lang/String;

    .line 337
    .line 338
    goto :goto_c

    .line 339
    :cond_11
    invoke-virtual {v7, v8}, Lhb/r;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :goto_c
    const-string v9, "card_first"

    .line 344
    .line 345
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_12

    .line 350
    .line 351
    new-array v0, v2, [Lfg/a;

    .line 352
    .line 353
    aput-object v6, v0, v5

    .line 354
    .line 355
    aput-object v13, v0, v3

    .line 356
    .line 357
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    goto :goto_d

    .line 362
    :cond_12
    new-array v0, v2, [Lfg/a;

    .line 363
    .line 364
    aput-object v13, v0, v5

    .line 365
    .line 366
    aput-object v6, v0, v3

    .line 367
    .line 368
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    goto :goto_d

    .line 373
    :cond_13
    invoke-static {v13}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    :goto_d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_16

    .line 386
    .line 387
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    add-int/lit8 v9, v5, 0x1

    .line 392
    .line 393
    if-ltz v5, :cond_15

    .line 394
    .line 395
    check-cast v6, Lfg/a;

    .line 396
    .line 397
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 404
    sub-int/2addr v6, v3

    .line 405
    if-ge v5, v6, :cond_14

    .line 406
    .line 407
    const-wide/16 v5, 0x12c

    .line 408
    .line 409
    :try_start_5
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 410
    .line 411
    .line 412
    goto :goto_f

    .line 413
    :catch_1
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 418
    .line 419
    .line 420
    :cond_14
    :goto_f
    move v5, v9

    .line 421
    goto :goto_e

    .line 422
    :cond_15
    invoke-static {}, La/a;->Q0()V

    .line 423
    .line 424
    .line 425
    throw v4

    .line 426
    :cond_16
    :goto_10
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 427
    .line 428
    goto :goto_12

    .line 429
    :goto_11
    new-instance v2, Lsf/f;

    .line 430
    .line 431
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 432
    .line 433
    .line 434
    move-object v0, v2

    .line 435
    :goto_12
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    if-eqz v0, :cond_17

    .line 440
    .line 441
    iget-object v2, v7, Lhb/r;->b:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, Lia/t;

    .line 444
    .line 445
    iget-object v3, v12, Lq9/d;->a:Ljava/lang/String;

    .line 446
    .line 447
    const-string v4, "\u6539\u540d\u63d0\u9192\u53d1\u9001\u5f02\u5e38: "

    .line 448
    .line 449
    const-string v5, "/"

    .line 450
    .line 451
    invoke-static {v4, v8, v5, v3}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v2, v3, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    :cond_17
    return-void

    .line 459
    :pswitch_2
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 462
    .line 463
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v2, Lfg/a;

    .line 466
    .line 467
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v3, Ljava/util/concurrent/CountDownLatch;

    .line 470
    .line 471
    :try_start_7
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Ljava/lang/Boolean;

    .line 476
    .line 477
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :catchall_2
    move-exception v0

    .line 489
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 490
    .line 491
    .line 492
    throw v0

    .line 493
    :pswitch_3
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Landroid/app/Activity;

    .line 496
    .line 497
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v2, Lp8/i;

    .line 500
    .line 501
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v3, Lp8/l;

    .line 504
    .line 505
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    if-nez v4, :cond_18

    .line 510
    .line 511
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    if-nez v4, :cond_18

    .line 516
    .line 517
    iget-object v2, v2, Lp8/i;->i:Lfg/p;

    .line 518
    .line 519
    invoke-interface {v2, v0, v3}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    :cond_18
    return-void

    .line 523
    :pswitch_4
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 524
    .line 525
    move-object v2, v0

    .line 526
    check-cast v2, Lgg/u;

    .line 527
    .line 528
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 529
    .line 530
    move-object v3, v0

    .line 531
    check-cast v3, Lp8/h;

    .line 532
    .line 533
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Ljava/util/List;

    .line 536
    .line 537
    :try_start_8
    iget-object v5, v3, Lp8/h;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 538
    .line 539
    new-instance v6, Lch/e;

    .line 540
    .line 541
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 542
    .line 543
    .line 544
    new-instance v7, Lfh/k;

    .line 545
    .line 546
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 547
    .line 548
    .line 549
    invoke-static {v7, v0}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 550
    .line 551
    .line 552
    iput-object v7, v6, Lch/e;->h:Lfh/k;

    .line 553
    .line 554
    invoke-virtual {v5, v6}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    new-instance v5, Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    :cond_19
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    if-eqz v0, :cond_1b

    .line 572
    .line 573
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    check-cast v0, Lhh/o;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 578
    .line 579
    :try_start_9
    iget-object v7, v3, Lp8/h;->b:Ljava/lang/ClassLoader;

    .line 580
    .line 581
    invoke-virtual {v0, v7}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 582
    .line 583
    .line 584
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 585
    goto :goto_14

    .line 586
    :catchall_3
    move-exception v0

    .line 587
    :try_start_a
    new-instance v7, Lsf/f;

    .line 588
    .line 589
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 590
    .line 591
    .line 592
    move-object v0, v7

    .line 593
    :goto_14
    nop

    .line 594
    instance-of v7, v0, Lsf/f;

    .line 595
    .line 596
    if-eqz v7, :cond_1a

    .line 597
    .line 598
    move-object v0, v4

    .line 599
    :cond_1a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 600
    .line 601
    if-eqz v0, :cond_19

    .line 602
    .line 603
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_13

    .line 607
    :catchall_4
    move-exception v0

    .line 608
    goto :goto_16

    .line 609
    :cond_1b
    new-instance v0, Ljava/util/HashSet;

    .line 610
    .line 611
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 612
    .line 613
    .line 614
    new-instance v4, Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    :cond_1c
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-eqz v6, :cond_1d

    .line 628
    .line 629
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    move-object v7, v6

    .line 634
    check-cast v7, Ljava/lang/reflect/Method;

    .line 635
    .line 636
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    if-eqz v7, :cond_1c

    .line 645
    .line 646
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 647
    .line 648
    .line 649
    goto :goto_15

    .line 650
    :goto_16
    new-instance v4, Lsf/f;

    .line 651
    .line 652
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 653
    .line 654
    .line 655
    :cond_1d
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    if-eqz v0, :cond_1e

    .line 660
    .line 661
    iget-object v3, v3, Lp8/h;->d:Lp8/p;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    new-instance v5, Ljava/lang/StringBuilder;

    .line 668
    .line 669
    const-string v6, "\u5b9a\u4f4d\u670b\u53cb\u5708\u7f13\u5b58\u67e5\u8be2\u5165\u53e3\u5931\u8d25: "

    .line 670
    .line 671
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v3, v0}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    :cond_1e
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 685
    .line 686
    instance-of v3, v4, Lsf/f;

    .line 687
    .line 688
    if-eqz v3, :cond_1f

    .line 689
    .line 690
    move-object v4, v0

    .line 691
    :cond_1f
    iput-object v4, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_5
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Landroid/app/Activity;

    .line 697
    .line 698
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v2, Lob/n;

    .line 701
    .line 702
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v3, Ljava/lang/String;

    .line 705
    .line 706
    if-eqz v0, :cond_20

    .line 707
    .line 708
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    if-nez v4, :cond_20

    .line 713
    .line 714
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    if-nez v4, :cond_20

    .line 719
    .line 720
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 725
    .line 726
    .line 727
    goto :goto_17

    .line 728
    :cond_20
    iget-object v0, v2, Lob/n;->a:Lr8/g;

    .line 729
    .line 730
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 731
    .line 732
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 737
    .line 738
    .line 739
    :goto_17
    return-void

    .line 740
    :pswitch_6
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v0, Lgg/t;

    .line 743
    .line 744
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v2, Lgg/u;

    .line 747
    .line 748
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v3, Lgg/u;

    .line 751
    .line 752
    iget-wide v4, v0, Lgg/t;->g:J

    .line 753
    .line 754
    const-wide/16 v6, 0x1

    .line 755
    .line 756
    add-long/2addr v4, v6

    .line 757
    iput-wide v4, v0, Lgg/t;->g:J

    .line 758
    .line 759
    invoke-static {v2, v3}, Lnb/f0;->d(Lgg/u;Lgg/u;)V

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :pswitch_7
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v0, Lnb/w;

    .line 766
    .line 767
    iget-object v3, v1, Lac/l;->i:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v3, Lgg/u;

    .line 770
    .line 771
    iget-object v5, v1, Lac/l;->j:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v5, Lnb/o;

    .line 774
    .line 775
    iget-object v6, v0, Lnb/w;->y:Ljava/lang/Runnable;

    .line 776
    .line 777
    iget-object v3, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 778
    .line 779
    if-eqz v3, :cond_24

    .line 780
    .line 781
    check-cast v3, Ljava/lang/Runnable;

    .line 782
    .line 783
    if-ne v6, v3, :cond_23

    .line 784
    .line 785
    iget-object v3, v0, Lnb/w;->o:Lnb/l;

    .line 786
    .line 787
    if-ne v3, v5, :cond_23

    .line 788
    .line 789
    iget-boolean v3, v0, Lnb/w;->r:Z

    .line 790
    .line 791
    if-eqz v3, :cond_21

    .line 792
    .line 793
    goto :goto_18

    .line 794
    :cond_21
    iput-object v4, v0, Lnb/w;->y:Ljava/lang/Runnable;

    .line 795
    .line 796
    const-string v3, "[Hchat:TextSpeech] \u539f\u8bed\u97f3\u64ad\u653e\u5b8c\u6210\u56de\u8c03\u8d85\u65f6\uff0c\u5df2\u8df3\u8fc7\u5f53\u524d\u8bed\u97f3"

    .line 797
    .line 798
    invoke-static {v3}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    if-eqz v3, :cond_22

    .line 806
    .line 807
    iget-object v3, v3, Lj8/p;->b:Lj8/y;

    .line 808
    .line 809
    if-eqz v3, :cond_22

    .line 810
    .line 811
    new-instance v5, Lj8/u;

    .line 812
    .line 813
    invoke-direct {v5, v3, v2}, Lj8/u;-><init>(Lj8/y;I)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v5}, Lj8/y;->r(Lj8/w;)Z

    .line 817
    .line 818
    .line 819
    :cond_22
    iput-object v4, v0, Lnb/w;->o:Lnb/l;

    .line 820
    .line 821
    invoke-virtual {v0}, Lnb/w;->n()V

    .line 822
    .line 823
    .line 824
    :cond_23
    :goto_18
    return-void

    .line 825
    :cond_24
    const-string v0, "runnable"

    .line 826
    .line 827
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    throw v4

    .line 831
    :pswitch_8
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, Ll3/l;

    .line 834
    .line 835
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v2, La7/a;

    .line 838
    .line 839
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 842
    .line 843
    :try_start_b
    iget-object v0, v0, Ll3/l;->a:Landroid/content/Context;

    .line 844
    .line 845
    invoke-static {v0}, La/a;->B(Landroid/content/Context;)Ll3/s;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    if-eqz v0, :cond_25

    .line 850
    .line 851
    iget-object v4, v0, Ll3/s;->a:Ll3/h;

    .line 852
    .line 853
    check-cast v4, Ll3/r;

    .line 854
    .line 855
    iget-object v5, v4, Ll3/r;->d:Ljava/lang/Object;

    .line 856
    .line 857
    monitor-enter v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 858
    :try_start_c
    iput-object v3, v4, Ll3/r;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 859
    .line 860
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 861
    :try_start_d
    iget-object v0, v0, Ll3/s;->a:Ll3/h;

    .line 862
    .line 863
    new-instance v4, Ll3/k;

    .line 864
    .line 865
    invoke-direct {v4, v2, v3}, Ll3/k;-><init>(La7/a;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 866
    .line 867
    .line 868
    invoke-interface {v0, v4}, Ll3/h;->a(La7/a;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 869
    .line 870
    .line 871
    goto :goto_1a

    .line 872
    :catchall_5
    move-exception v0

    .line 873
    goto :goto_19

    .line 874
    :catchall_6
    move-exception v0

    .line 875
    :try_start_e
    monitor-exit v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 876
    :try_start_f
    throw v0

    .line 877
    :cond_25
    new-instance v0, Ljava/lang/RuntimeException;

    .line 878
    .line 879
    const-string v4, "EmojiCompat font provider not available on this device."

    .line 880
    .line 881
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 885
    :goto_19
    invoke-virtual {v2, v0}, La7/a;->D(Ljava/lang/Throwable;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 889
    .line 890
    .line 891
    :goto_1a
    return-void

    .line 892
    :pswitch_9
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v0, Landroid/app/Activity;

    .line 895
    .line 896
    iget-object v2, v1, Lac/l;->j:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v2, Ljava/lang/String;

    .line 899
    .line 900
    iget-object v3, v1, Lac/l;->i:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v3, Lk9/h;

    .line 903
    .line 904
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    if-nez v4, :cond_28

    .line 909
    .line 910
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 911
    .line 912
    .line 913
    move-result v4

    .line 914
    if-eqz v4, :cond_26

    .line 915
    .line 916
    goto :goto_1c

    .line 917
    :cond_26
    iget-object v0, v3, Lk9/h;->c:Lwb/da;

    .line 918
    .line 919
    if-eqz v2, :cond_27

    .line 920
    .line 921
    new-instance v3, Lk9/f;

    .line 922
    .line 923
    invoke-direct {v3, v2}, Lk9/f;-><init>(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    goto :goto_1b

    .line 927
    :cond_27
    sget-object v3, Lk9/e;->b:Lk9/e;

    .line 928
    .line 929
    :goto_1b
    invoke-virtual {v0, v3}, Lwb/da;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    goto :goto_1d

    .line 933
    :cond_28
    :goto_1c
    invoke-static {v0, v2}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    :goto_1d
    return-void

    .line 937
    :pswitch_a
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 938
    .line 939
    move-object v2, v0

    .line 940
    check-cast v2, Landroid/app/Activity;

    .line 941
    .line 942
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 943
    .line 944
    move-object v3, v0

    .line 945
    check-cast v3, Lk9/h;

    .line 946
    .line 947
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v0, Landroid/net/Uri;

    .line 950
    .line 951
    :try_start_10
    iget-object v5, v3, Lk9/h;->b:Ljava/lang/String;

    .line 952
    .line 953
    invoke-static {v2, v5, v0}, Lig/a;->Y(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 957
    goto :goto_1e

    .line 958
    :catchall_7
    move-exception v0

    .line 959
    new-instance v5, Lsf/f;

    .line 960
    .line 961
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 962
    .line 963
    .line 964
    move-object v0, v5

    .line 965
    :goto_1e
    nop

    .line 966
    instance-of v5, v0, Lsf/f;

    .line 967
    .line 968
    if-eqz v5, :cond_29

    .line 969
    .line 970
    goto :goto_1f

    .line 971
    :cond_29
    move-object v4, v0

    .line 972
    :goto_1f
    check-cast v4, Ljava/lang/String;

    .line 973
    .line 974
    new-instance v0, Lac/l;

    .line 975
    .line 976
    const/16 v5, 0x13

    .line 977
    .line 978
    invoke-direct {v0, v5, v2, v3, v4}, Lac/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 982
    .line 983
    .line 984
    return-void

    .line 985
    :pswitch_b
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v0, Ljava/lang/reflect/Method;

    .line 988
    .line 989
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 990
    .line 991
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v3, Lia/t;

    .line 994
    .line 995
    :try_start_11
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 996
    .line 997
    filled-new-array {v2, v5}, [Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    invoke-static {v0, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1005
    goto :goto_20

    .line 1006
    :catchall_8
    move-exception v0

    .line 1007
    new-instance v2, Lsf/f;

    .line 1008
    .line 1009
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1010
    .line 1011
    .line 1012
    move-object v0, v2

    .line 1013
    :goto_20
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    if-eqz v0, :cond_2a

    .line 1018
    .line 1019
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u542f\u52a8\u4e0b\u8f7d\u5931\u8d25"

    .line 1020
    .line 1021
    invoke-virtual {v3, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    :cond_2a
    return-void

    .line 1025
    :pswitch_c
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v0, Landroid/app/Activity;

    .line 1028
    .line 1029
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v2, Ljava/util/List;

    .line 1032
    .line 1033
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v3, Lia/j;

    .line 1036
    .line 1037
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v4

    .line 1041
    if-nez v4, :cond_2d

    .line 1042
    .line 1043
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v4

    .line 1047
    if-eqz v4, :cond_2b

    .line 1048
    .line 1049
    goto :goto_21

    .line 1050
    :cond_2b
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v4

    .line 1054
    if-eqz v4, :cond_2c

    .line 1055
    .line 1056
    const-string v2, "\u6ca1\u6709\u53ef\u9009\u62e9\u7684\u597d\u53cb"

    .line 1057
    .line 1058
    invoke-static {v0, v2}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_21

    .line 1062
    :cond_2c
    invoke-virtual {v3, v2}, Lia/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    :cond_2d
    :goto_21
    return-void

    .line 1066
    :pswitch_d
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v0, Landroid/app/Activity;

    .line 1069
    .line 1070
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v2, Lc9/u;

    .line 1073
    .line 1074
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1075
    .line 1076
    check-cast v3, Ljava/util/List;

    .line 1077
    .line 1078
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v4

    .line 1082
    if-nez v4, :cond_2e

    .line 1083
    .line 1084
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v0

    .line 1088
    if-nez v0, :cond_2e

    .line 1089
    .line 1090
    invoke-virtual {v2, v3}, Lc9/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    :cond_2e
    return-void

    .line 1094
    :pswitch_e
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1095
    .line 1096
    move-object v2, v0

    .line 1097
    check-cast v2, Lg9/d;

    .line 1098
    .line 1099
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1100
    .line 1101
    move-object v3, v0

    .line 1102
    check-cast v3, Landroid/app/Activity;

    .line 1103
    .line 1104
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v0, Ljava/lang/String;

    .line 1107
    .line 1108
    const-string v5, "\u8868\u60c5\u4fdd\u5b58\u5931\u8d25"

    .line 1109
    .line 1110
    :try_start_12
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v6

    .line 1114
    if-eqz v6, :cond_2f

    .line 1115
    .line 1116
    iget-object v6, v6, Lj8/p;->d:Lj8/f;

    .line 1117
    .line 1118
    if-eqz v6, :cond_2f

    .line 1119
    .line 1120
    invoke-virtual {v6, v0}, Lj8/f;->c(Ljava/lang/String;)[B

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    goto :goto_22

    .line 1125
    :catchall_9
    move-exception v0

    .line 1126
    goto :goto_24

    .line 1127
    :cond_2f
    move-object v0, v4

    .line 1128
    :goto_22
    if-eqz v0, :cond_33

    .line 1129
    .line 1130
    array-length v6, v0

    .line 1131
    if-nez v6, :cond_30

    .line 1132
    .line 1133
    goto :goto_23

    .line 1134
    :cond_30
    invoke-virtual {v2, v0}, Lg9/d;->a([B)Ljava/io/File;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v6

    .line 1138
    if-eqz v6, :cond_32

    .line 1139
    .line 1140
    invoke-static {v6, v0}, Lg9/d;->f(Ljava/io/File;[B)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v0

    .line 1144
    if-nez v0, :cond_31

    .line 1145
    .line 1146
    new-instance v0, Lg9/b;

    .line 1147
    .line 1148
    invoke-direct {v0, v4, v5}, Lg9/b;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_25

    .line 1152
    :cond_31
    new-instance v0, Lg9/b;

    .line 1153
    .line 1154
    const-string v7, ""

    .line 1155
    .line 1156
    invoke-direct {v0, v6, v7}, Lg9/b;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_25

    .line 1160
    :cond_32
    new-instance v0, Lg9/b;

    .line 1161
    .line 1162
    const-string v6, "\u521b\u5efa\u4fdd\u5b58\u76ee\u5f55\u5931\u8d25"

    .line 1163
    .line 1164
    invoke-direct {v0, v4, v6}, Lg9/b;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_25

    .line 1168
    :cond_33
    :goto_23
    new-instance v0, Lg9/b;

    .line 1169
    .line 1170
    const-string v6, "\u8868\u60c5\u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u5c1a\u672a\u4e0b\u8f7d"

    .line 1171
    .line 1172
    invoke-direct {v0, v4, v6}, Lg9/b;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 1173
    .line 1174
    .line 1175
    goto :goto_25

    .line 1176
    :goto_24
    new-instance v6, Lsf/f;

    .line 1177
    .line 1178
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1179
    .line 1180
    .line 1181
    move-object v0, v6

    .line 1182
    :goto_25
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v6

    .line 1186
    if-nez v6, :cond_34

    .line 1187
    .line 1188
    goto :goto_26

    .line 1189
    :cond_34
    iget-object v0, v2, Lg9/d;->b:Lab/b;

    .line 1190
    .line 1191
    const-string v7, "\u4fdd\u5b58\u8868\u60c5\u5931\u8d25"

    .line 1192
    .line 1193
    invoke-virtual {v0, v7, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    new-instance v0, Lg9/b;

    .line 1197
    .line 1198
    invoke-direct {v0, v4, v5}, Lg9/b;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    :goto_26
    check-cast v0, Lg9/b;

    .line 1202
    .line 1203
    iget-object v4, v0, Lg9/b;->a:Ljava/io/File;

    .line 1204
    .line 1205
    if-eqz v4, :cond_35

    .line 1206
    .line 1207
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    const-string v4, "\u8868\u60c5\u5df2\u4fdd\u5b58: "

    .line 1212
    .line 1213
    invoke-static {v4, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    goto :goto_28

    .line 1218
    :cond_35
    iget-object v0, v0, Lg9/b;->b:Ljava/lang/String;

    .line 1219
    .line 1220
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    if-eqz v4, :cond_36

    .line 1225
    .line 1226
    goto :goto_27

    .line 1227
    :cond_36
    move-object v5, v0

    .line 1228
    :goto_27
    move-object v0, v5

    .line 1229
    :goto_28
    iget-object v2, v2, Lg9/d;->d:Landroid/os/Handler;

    .line 1230
    .line 1231
    new-instance v4, Lc9/t;

    .line 1232
    .line 1233
    const/4 v5, 0x5

    .line 1234
    invoke-direct {v4, v3, v0, v5}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1238
    .line 1239
    .line 1240
    return-void

    .line 1241
    :pswitch_f
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1242
    .line 1243
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1244
    .line 1245
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1246
    .line 1247
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 1248
    .line 1249
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1250
    .line 1251
    invoke-static {v0, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->k(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lh/Hchat/hooks/items/script/ScriptMessageBean;Ljava/lang/Object;)V

    .line 1252
    .line 1253
    .line 1254
    return-void

    .line 1255
    :pswitch_10
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1256
    .line 1257
    check-cast v0, Landroid/app/Activity;

    .line 1258
    .line 1259
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1262
    .line 1263
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1264
    .line 1265
    check-cast v3, Lfg/l;

    .line 1266
    .line 1267
    invoke-static {v0, v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->b(Landroid/app/Activity;Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lfg/l;)V

    .line 1268
    .line 1269
    .line 1270
    return-void

    .line 1271
    :pswitch_11
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v0, Landroid/content/Context;

    .line 1274
    .line 1275
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v2, Le9/c;

    .line 1278
    .line 1279
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v3, Le9/l;

    .line 1282
    .line 1283
    :try_start_13
    sget-object v4, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1284
    .line 1285
    invoke-static {v0, v2, v3}, Le9/q;->z(Landroid/content/Context;Le9/c;Le9/l;)V

    .line 1286
    .line 1287
    .line 1288
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 1289
    .line 1290
    goto :goto_29

    .line 1291
    :catchall_a
    move-exception v0

    .line 1292
    new-instance v2, Lsf/f;

    .line 1293
    .line 1294
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1295
    .line 1296
    .line 1297
    move-object v0, v2

    .line 1298
    :goto_29
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    if-eqz v0, :cond_37

    .line 1303
    .line 1304
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    const-string v3, "[Hchat:CustomNotification] \u8f6c\u53d1\u5fae\u4fe1\u539f\u751f\u901a\u77e5\u5931\u8d25: "

    .line 1309
    .line 1310
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1311
    .line 1312
    .line 1313
    :cond_37
    return-void

    .line 1314
    :pswitch_12
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1315
    .line 1316
    move-object v2, v0

    .line 1317
    check-cast v2, Lcb/f;

    .line 1318
    .line 1319
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1320
    .line 1321
    move-object v3, v0

    .line 1322
    check-cast v3, Ldb/c;

    .line 1323
    .line 1324
    iget-object v0, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1325
    .line 1326
    move-object v4, v0

    .line 1327
    check-cast v4, Landroid/os/PowerManager$WakeLock;

    .line 1328
    .line 1329
    :try_start_14
    invoke-virtual {v2, v3}, Lcb/f;->t(Ldb/c;)Lsf/e;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 1333
    goto :goto_2a

    .line 1334
    :catchall_b
    move-exception v0

    .line 1335
    :try_start_15
    new-instance v6, Lsf/f;

    .line 1336
    .line 1337
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1338
    .line 1339
    .line 1340
    move-object v0, v6

    .line 1341
    :goto_2a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v6

    .line 1345
    if-nez v6, :cond_38

    .line 1346
    .line 1347
    goto :goto_2b

    .line 1348
    :cond_38
    iget-object v0, v2, Lcb/f;->d:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v0, Lab/b;

    .line 1351
    .line 1352
    const-string v7, "\u5b9a\u65f6\u4efb\u52a1\u6267\u884c\u5f02\u5e38"

    .line 1353
    .line 1354
    invoke-virtual {v0, v7, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    invoke-static {v3}, Lcb/f;->b(Ldb/c;)I

    .line 1362
    .line 1363
    .line 1364
    move-result v5

    .line 1365
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v5

    .line 1369
    new-instance v6, Lsf/e;

    .line 1370
    .line 1371
    invoke-direct {v6, v0, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1372
    .line 1373
    .line 1374
    move-object v0, v6

    .line 1375
    :goto_2b
    check-cast v0, Lsf/e;

    .line 1376
    .line 1377
    iget-object v5, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v5, Ljava/lang/Number;

    .line 1380
    .line 1381
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1382
    .line 1383
    .line 1384
    move-result v5

    .line 1385
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v0, Ljava/lang/Number;

    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1390
    .line 1391
    .line 1392
    move-result v0

    .line 1393
    invoke-virtual {v2, v3, v5, v0}, Lcb/f;->d(Ldb/c;II)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v2, v4}, Lcb/f;->q(Landroid/os/PowerManager$WakeLock;)V

    .line 1397
    .line 1398
    .line 1399
    return-void

    .line 1400
    :catchall_c
    move-exception v0

    .line 1401
    invoke-virtual {v2, v4}, Lcb/f;->q(Landroid/os/PowerManager$WakeLock;)V

    .line 1402
    .line 1403
    .line 1404
    throw v0

    .line 1405
    :pswitch_13
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1406
    .line 1407
    check-cast v0, Ld8/b;

    .line 1408
    .line 1409
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v2, Landroid/app/Application;

    .line 1412
    .line 1413
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1414
    .line 1415
    check-cast v3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 1416
    .line 1417
    iget-object v0, v0, Ld8/b;->c:Lh/Hchat/ModuleEntry;

    .line 1418
    .line 1419
    invoke-static {v0, v2, v3}, Lh/Hchat/ModuleEntry;->f(Lh/Hchat/ModuleEntry;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    .line 1420
    .line 1421
    .line 1422
    return-void

    .line 1423
    :pswitch_14
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v0, Landroid/app/Activity;

    .line 1426
    .line 1427
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1428
    .line 1429
    check-cast v2, Lca/e0;

    .line 1430
    .line 1431
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1432
    .line 1433
    check-cast v3, Landroid/content/Intent;

    .line 1434
    .line 1435
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v4

    .line 1439
    if-nez v4, :cond_39

    .line 1440
    .line 1441
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1442
    .line 1443
    .line 1444
    move-result v4

    .line 1445
    if-nez v4, :cond_39

    .line 1446
    .line 1447
    invoke-virtual {v2, v0, v3}, Lca/e0;->q(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 1448
    .line 1449
    .line 1450
    :cond_39
    return-void

    .line 1451
    :pswitch_15
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1452
    .line 1453
    move-object v6, v0

    .line 1454
    check-cast v6, Landroid/app/Activity;

    .line 1455
    .line 1456
    iget-object v0, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1457
    .line 1458
    check-cast v0, Lca/e0;

    .line 1459
    .line 1460
    iget-object v2, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1461
    .line 1462
    check-cast v2, Lhb/t;

    .line 1463
    .line 1464
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v3

    .line 1468
    if-nez v3, :cond_3a

    .line 1469
    .line 1470
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 1471
    .line 1472
    .line 1473
    move-result v3

    .line 1474
    if-nez v3, :cond_3a

    .line 1475
    .line 1476
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1477
    .line 1478
    .line 1479
    const-string v7, "\u8f6c\u53d1[H]"

    .line 1480
    .line 1481
    const-string v8, ""

    .line 1482
    .line 1483
    const-string v3, "\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 1484
    .line 1485
    const-string v4, ""

    .line 1486
    .line 1487
    new-instance v9, Lsf/e;

    .line 1488
    .line 1489
    invoke-direct {v9, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1490
    .line 1491
    .line 1492
    const-string v3, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 1493
    .line 1494
    new-instance v10, Lsf/e;

    .line 1495
    .line 1496
    invoke-direct {v10, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1497
    .line 1498
    .line 1499
    const-string v3, "\u5206\u4eab"

    .line 1500
    .line 1501
    new-instance v11, Lsf/e;

    .line 1502
    .line 1503
    invoke-direct {v11, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1504
    .line 1505
    .line 1506
    const-string v3, "\u7fa4\u53d1\u52a9\u624b"

    .line 1507
    .line 1508
    new-instance v12, Lsf/e;

    .line 1509
    .line 1510
    invoke-direct {v12, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1511
    .line 1512
    .line 1513
    const-string v3, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 1514
    .line 1515
    new-instance v13, Lsf/e;

    .line 1516
    .line 1517
    invoke-direct {v13, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1518
    .line 1519
    .line 1520
    filled-new-array {v9, v10, v11, v12, v13}, [Lsf/e;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v3

    .line 1524
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v9

    .line 1528
    new-instance v10, Lca/h;

    .line 1529
    .line 1530
    invoke-direct {v10, v0, v6, v2, v5}, Lca/h;-><init>(Lca/e0;Landroid/app/Activity;Lhb/t;I)V

    .line 1531
    .line 1532
    .line 1533
    new-instance v11, Lbi/c;

    .line 1534
    .line 1535
    const/4 v0, 0x7

    .line 1536
    invoke-direct {v11, v0}, Lbi/c;-><init>(I)V

    .line 1537
    .line 1538
    .line 1539
    sget-object v12, Lwb/lv;->j:Lwb/lv;

    .line 1540
    .line 1541
    invoke-static/range {v6 .. v12}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1542
    .line 1543
    .line 1544
    :cond_3a
    return-void

    .line 1545
    :pswitch_16
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1546
    .line 1547
    check-cast v0, Landroid/app/Activity;

    .line 1548
    .line 1549
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1550
    .line 1551
    iget-object v6, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1552
    .line 1553
    check-cast v6, Ljava/lang/String;

    .line 1554
    .line 1555
    invoke-static {v0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v7

    .line 1559
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v7

    .line 1563
    :cond_3b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v8

    .line 1567
    if-eqz v8, :cond_3c

    .line 1568
    .line 1569
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v8

    .line 1573
    move-object v9, v8

    .line 1574
    check-cast v9, Lc9/a;

    .line 1575
    .line 1576
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 1577
    .line 1578
    invoke-static {v9}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v9

    .line 1582
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1583
    .line 1584
    .line 1585
    move-result v9

    .line 1586
    if-eqz v9, :cond_3b

    .line 1587
    .line 1588
    move-object v4, v8

    .line 1589
    :cond_3c
    check-cast v4, Lc9/a;

    .line 1590
    .line 1591
    if-eqz v4, :cond_3d

    .line 1592
    .line 1593
    sget-object v2, Lc9/d2;->a:Lc9/d2;

    .line 1594
    .line 1595
    iget-object v2, v4, Lc9/a;->a:Ljava/lang/String;

    .line 1596
    .line 1597
    invoke-static {v0, v2}, Lc9/d2;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    goto :goto_2e

    .line 1601
    :cond_3d
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1602
    .line 1603
    const-string v0, "ui"

    .line 1604
    .line 1605
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    if-eqz v0, :cond_3e

    .line 1610
    .line 1611
    new-instance v2, Landroid/os/Bundle;

    .line 1612
    .line 1613
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1614
    .line 1615
    .line 1616
    const-string v4, "finish_direct"

    .line 1617
    .line 1618
    invoke-virtual {v2, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v4

    .line 1625
    const-string v7, "startChatting"

    .line 1626
    .line 1627
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1628
    .line 1629
    filled-new-array {v6, v2, v8}, [Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v9

    .line 1633
    invoke-static {v4, v7, v9}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v4

    .line 1637
    filled-new-array {v6, v2, v8}, [Ljava/lang/Object;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v2

    .line 1641
    invoke-static {v4, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v0

    .line 1645
    goto :goto_2c

    .line 1646
    :cond_3e
    move v0, v5

    .line 1647
    :goto_2c
    if-nez v0, :cond_41

    .line 1648
    .line 1649
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v0

    .line 1653
    if-eqz v0, :cond_40

    .line 1654
    .line 1655
    invoke-virtual {v0, v6}, Lh8/a;->h(Ljava/lang/String;)Z

    .line 1656
    .line 1657
    .line 1658
    move-result v0

    .line 1659
    if-ne v0, v3, :cond_3f

    .line 1660
    .line 1661
    goto :goto_2d

    .line 1662
    :cond_3f
    move v3, v5

    .line 1663
    :goto_2d
    move v5, v3

    .line 1664
    :cond_40
    if-nez v5, :cond_41

    .line 1665
    .line 1666
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1667
    .line 1668
    const-string v2, "[Hchat:ConversationGroup] \u6253\u5f00\u5206\u7ec4\u5185\u4f1a\u8bdd\u5931\u8d25: talker="

    .line 1669
    .line 1670
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 1681
    .line 1682
    .line 1683
    :cond_41
    :goto_2e
    return-void

    .line 1684
    :pswitch_17
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1685
    .line 1686
    check-cast v0, Landroid/app/Activity;

    .line 1687
    .line 1688
    iget-object v2, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1689
    .line 1690
    check-cast v2, Ljava/lang/String;

    .line 1691
    .line 1692
    iget-object v3, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1693
    .line 1694
    check-cast v3, Lfg/a;

    .line 1695
    .line 1696
    sget-object v4, Lc9/j1;->a:Lc9/j1;

    .line 1697
    .line 1698
    invoke-static {v0, v2, v3}, Lc9/j1;->v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 1699
    .line 1700
    .line 1701
    return-void

    .line 1702
    :pswitch_18
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1703
    .line 1704
    check-cast v0, Landroid/app/Activity;

    .line 1705
    .line 1706
    iget-object v2, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1707
    .line 1708
    check-cast v2, Ljava/lang/String;

    .line 1709
    .line 1710
    iget-object v3, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1711
    .line 1712
    check-cast v3, Laa/c;

    .line 1713
    .line 1714
    sget-object v4, Lc9/b0;->a:Landroid/os/Handler;

    .line 1715
    .line 1716
    invoke-static {v0, v2, v3}, Lc9/b0;->g(Landroid/app/Activity;Ljava/lang/String;Laa/c;)V

    .line 1717
    .line 1718
    .line 1719
    return-void

    .line 1720
    :pswitch_19
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v0, Landroid/app/Activity;

    .line 1723
    .line 1724
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v2, Lc9/d;

    .line 1727
    .line 1728
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v3, Landroid/net/Uri;

    .line 1731
    .line 1732
    sget-object v4, Lc9/e;->a:Lc9/e;

    .line 1733
    .line 1734
    :try_start_16
    iget-object v4, v2, Lc9/d;->b:Lc9/o2;

    .line 1735
    .line 1736
    instance-of v6, v4, Lc9/b;

    .line 1737
    .line 1738
    if-eqz v6, :cond_43

    .line 1739
    .line 1740
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v0

    .line 1744
    const-string v6, "wt"

    .line 1745
    .line 1746
    invoke-virtual {v0, v3, v6}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 1750
    if-eqz v3, :cond_42

    .line 1751
    .line 1752
    :try_start_17
    check-cast v4, Lc9/b;

    .line 1753
    .line 1754
    iget-object v0, v4, Lc9/b;->b:Ljava/lang/String;

    .line 1755
    .line 1756
    sget-object v4, Log/a;->a:Ljava/nio/charset/Charset;

    .line 1757
    .line 1758
    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    .line 1766
    .line 1767
    .line 1768
    :try_start_18
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 1769
    .line 1770
    .line 1771
    new-instance v0, Lc9/p2;

    .line 1772
    .line 1773
    const-string v3, "\u804a\u5929\u5206\u7ec4\u5df2\u5bfc\u51fa"

    .line 1774
    .line 1775
    invoke-direct {v0, v3, v5}, Lc9/p2;-><init>(Ljava/lang/String;Z)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 1776
    .line 1777
    .line 1778
    goto :goto_31

    .line 1779
    :catchall_d
    move-exception v0

    .line 1780
    goto :goto_2f

    .line 1781
    :catchall_e
    move-exception v0

    .line 1782
    move-object v4, v0

    .line 1783
    :try_start_19
    throw v4
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 1784
    :catchall_f
    move-exception v0

    .line 1785
    :try_start_1a
    invoke-static {v3, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1786
    .line 1787
    .line 1788
    throw v0

    .line 1789
    :cond_42
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1790
    .line 1791
    const-string v3, "\u65e0\u6cd5\u5199\u5165\u6240\u9009\u6587\u4ef6"

    .line 1792
    .line 1793
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1794
    .line 1795
    .line 1796
    throw v0

    .line 1797
    :cond_43
    sget-object v6, Lc9/c;->b:Lc9/c;

    .line 1798
    .line 1799
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v4

    .line 1803
    if-eqz v4, :cond_44

    .line 1804
    .line 1805
    invoke-static {v0, v3}, Lc9/e;->c(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v3

    .line 1809
    invoke-static {v0, v3}, Lc9/o2;->h(Landroid/content/Context;Ljava/lang/String;)Lc9/f2;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    new-instance v3, Lc9/p2;

    .line 1814
    .line 1815
    iget-object v4, v0, Lc9/f2;->c:Ljava/lang/String;

    .line 1816
    .line 1817
    iget-boolean v0, v0, Lc9/f2;->a:Z

    .line 1818
    .line 1819
    invoke-direct {v3, v4, v0}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 1820
    .line 1821
    .line 1822
    goto :goto_30

    .line 1823
    :cond_44
    new-instance v0, Laf/d;

    .line 1824
    .line 1825
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1826
    .line 1827
    .line 1828
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    .line 1829
    :goto_2f
    new-instance v3, Lsf/f;

    .line 1830
    .line 1831
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1832
    .line 1833
    .line 1834
    :goto_30
    move-object v0, v3

    .line 1835
    :goto_31
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v3

    .line 1839
    if-nez v3, :cond_45

    .line 1840
    .line 1841
    goto :goto_33

    .line 1842
    :cond_45
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v0

    .line 1846
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1847
    .line 1848
    const-string v6, "[Hchat:ConversationGroup] \u5904\u7406\u804a\u5929\u5206\u7ec4\u6587\u4ef6\u5931\u8d25: "

    .line 1849
    .line 1850
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1851
    .line 1852
    .line 1853
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    invoke-static {v0, v3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1861
    .line 1862
    .line 1863
    new-instance v0, Lc9/p2;

    .line 1864
    .line 1865
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v3

    .line 1869
    if-eqz v3, :cond_46

    .line 1870
    .line 1871
    goto :goto_32

    .line 1872
    :cond_46
    const-string v3, "\u5904\u7406\u804a\u5929\u5206\u7ec4\u6587\u4ef6\u5931\u8d25"

    .line 1873
    .line 1874
    :goto_32
    invoke-direct {v0, v3, v5}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 1875
    .line 1876
    .line 1877
    :goto_33
    check-cast v0, Lc9/p2;

    .line 1878
    .line 1879
    invoke-virtual {v2, v0}, Lc9/d;->a(Lc9/p2;)V

    .line 1880
    .line 1881
    .line 1882
    return-void

    .line 1883
    :pswitch_1a
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1884
    .line 1885
    check-cast v0, Landroid/app/Activity;

    .line 1886
    .line 1887
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1888
    .line 1889
    check-cast v2, Lc9/d;

    .line 1890
    .line 1891
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1892
    .line 1893
    check-cast v3, Lc9/p2;

    .line 1894
    .line 1895
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1896
    .line 1897
    .line 1898
    move-result v4

    .line 1899
    if-nez v4, :cond_47

    .line 1900
    .line 1901
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1902
    .line 1903
    .line 1904
    move-result v0

    .line 1905
    if-nez v0, :cond_47

    .line 1906
    .line 1907
    iget-object v0, v2, Lc9/d;->c:Lfg/l;

    .line 1908
    .line 1909
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    :cond_47
    return-void

    .line 1913
    :pswitch_1b
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1914
    .line 1915
    check-cast v0, Lb0/h;

    .line 1916
    .line 1917
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1918
    .line 1919
    check-cast v2, Lb0/e;

    .line 1920
    .line 1921
    iget-object v4, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1922
    .line 1923
    check-cast v4, Lb0/f;

    .line 1924
    .line 1925
    iget-object v5, v0, Lb0/h;->a:Landroid/view/View;

    .line 1926
    .line 1927
    new-instance v6, Lb0/x;

    .line 1928
    .line 1929
    invoke-direct {v6, v2}, Lb0/x;-><init>(Lb0/e;)V

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v5, v6, v3}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    iget-object v0, v0, Lb0/h;->h:Landroid/view/ActionMode;

    .line 1937
    .line 1938
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1939
    .line 1940
    .line 1941
    if-nez v2, :cond_48

    .line 1942
    .line 1943
    invoke-virtual {v4}, Lb0/f;->close()V

    .line 1944
    .line 1945
    .line 1946
    :cond_48
    return-void

    .line 1947
    :pswitch_1c
    iget-object v0, v1, Lac/l;->h:Ljava/lang/Object;

    .line 1948
    .line 1949
    check-cast v0, Lac/o;

    .line 1950
    .line 1951
    iget-object v2, v1, Lac/l;->i:Ljava/lang/Object;

    .line 1952
    .line 1953
    check-cast v2, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 1954
    .line 1955
    iget-object v3, v1, Lac/l;->j:Ljava/lang/Object;

    .line 1956
    .line 1957
    check-cast v3, Ljava/lang/String;

    .line 1958
    .line 1959
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 1960
    .line 1961
    .line 1962
    return-void

    .line 1963
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
