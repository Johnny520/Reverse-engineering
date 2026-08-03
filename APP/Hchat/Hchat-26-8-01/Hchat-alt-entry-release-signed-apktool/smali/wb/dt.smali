.class public final synthetic Lwb/dt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lfb/i2;

.field public final synthetic i:Li0/j1;

.field public final synthetic j:I

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lwb/yt;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/j1;

.field public final synthetic s:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Lfb/i2;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/j1;Li0/j1;Ljava/lang/String;Lwb/yt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/dt;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lwb/dt;->h:Lfb/i2;

    .line 7
    .line 8
    iput-object p10, p0, Lwb/dt;->i:Li0/j1;

    .line 9
    .line 10
    iput p1, p0, Lwb/dt;->j:I

    .line 11
    .line 12
    iput-object p4, p0, Lwb/dt;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p5, p0, Lwb/dt;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p6, p0, Lwb/dt;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p7, p0, Lwb/dt;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p12, p0, Lwb/dt;->o:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p13, p0, Lwb/dt;->p:Lwb/yt;

    .line 23
    .line 24
    iput-object p8, p0, Lwb/dt;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p11, p0, Lwb/dt;->r:Li0/j1;

    .line 27
    .line 28
    iput-object p9, p0, Lwb/dt;->s:Li0/a1;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v7, v1, Lwb/dt;->g:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    const-string v0, "."

    .line 8
    .line 9
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    iget-object v5, v1, Lwb/dt;->h:Lfb/i2;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-boolean v3, v5, Lfb/i2;->d:Z

    .line 17
    .line 18
    iget-boolean v4, v5, Lfb/i2;->l:Z

    .line 19
    .line 20
    sget-object v6, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    iget-object v6, v5, Lfb/i2;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v8, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    new-instance v9, Lfb/g0;

    .line 27
    .line 28
    const/16 v10, 0x19

    .line 29
    .line 30
    invoke-direct {v9, v10}, Lfb/g0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v10, Lbc/j;

    .line 34
    .line 35
    const/16 v11, 0x9

    .line 36
    .line 37
    invoke-direct {v10, v9, v11}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8, v6, v10}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast v8, Ljava/util/concurrent/locks/ReentrantLock;

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    invoke-static {v7, v5}, Lfb/t2;->g(Landroid/content/Context;Lfb/i2;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-static {v9, v6}, Lfb/t2;->b0(Ljava/io/File;Ljava/lang/String;)Lfb/p2;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    iget-object v10, v10, Lfb/p2;->b:Lfb/z1;

    .line 63
    .line 64
    invoke-virtual {v10}, Lfb/z1;->a()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_0

    .line 69
    .line 70
    invoke-static {v9}, Lfb/t2;->s(Ljava/io/File;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto/16 :goto_1f

    .line 76
    .line 77
    :cond_0
    invoke-virtual {v10}, Lfb/z1;->b()Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    const-string v10, "\n"

    .line 82
    .line 83
    new-instance v13, Lfb/g0;

    .line 84
    .line 85
    const/16 v0, 0x13

    .line 86
    .line 87
    invoke-direct {v13, v0}, Lfb/g0;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const/16 v14, 0x1e

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    invoke-static/range {v9 .. v14}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_1
    :goto_0
    sget-object v10, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 109
    .line 110
    invoke-virtual {v10, v7}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-virtual {v10}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    new-instance v11, Ljava/io/File;

    .line 119
    .line 120
    invoke-direct {v11, v10, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v11}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v11}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    invoke-static {v13, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_29

    .line 140
    .line 141
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_29

    .line 146
    .line 147
    iget-object v11, v5, Lfb/i2;->f:Ljava/util/List;

    .line 148
    .line 149
    iget-object v13, v5, Lfb/i2;->g:Ljava/util/List;

    .line 150
    .line 151
    invoke-static {v11, v13}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    iget-object v13, v5, Lfb/i2;->h:Ljava/util/List;

    .line 156
    .line 157
    invoke-static {v11, v13}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v11}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-static {v11}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    if-eqz v3, :cond_8

    .line 170
    .line 171
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_7

    .line 176
    .line 177
    invoke-static {v12}, Lfb/t2;->u(Ljava/io/File;)V

    .line 178
    .line 179
    .line 180
    if-eqz v4, :cond_3

    .line 181
    .line 182
    invoke-static {v12}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-static {v11}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    iget-object v13, v5, Lfb/i2;->e:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-eqz v11, :cond_2

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    const-string v0, "\u76ee\u6807\u63d2\u4ef6\u5df2\u5728\u751f\u6210\u540e\u53d1\u751f\u53d8\u5316\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u540e\u5220\u9664"

    .line 200
    .line 201
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v2

    .line 207
    :cond_3
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    if-eqz v13, :cond_4

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    :cond_5
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    if-eqz v13, :cond_9

    .line 223
    .line 224
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    check-cast v13, Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v12, v13}, Lfb/t2;->G(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v14

    .line 234
    iget-object v15, v5, Lfb/i2;->k:Ljava/util/LinkedHashMap;

    .line 235
    .line 236
    invoke-virtual {v15, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    if-nez v15, :cond_5

    .line 245
    .line 246
    invoke-static {v9, v13}, Lfb/t2;->G(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-virtual {v14, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-eqz v13, :cond_6

    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_6
    const-string v0, "Agent \u8981\u4fee\u6539\u7684\u6587\u4ef6\u5df2\u5728\u751f\u6210\u540e\u53d1\u751f\u53d8\u5316\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u540e\u4fee\u6539"

    .line 258
    .line 259
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 260
    .line 261
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v2

    .line 265
    :cond_7
    const-string v0, "\u76ee\u6807\u63d2\u4ef6\u5df2\u88ab\u5220\u9664\uff0c\u8bf7\u91cd\u65b0\u751f\u6210\u4fee\u6539"

    .line 266
    .line 267
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 268
    .line 269
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v2

    .line 273
    :cond_8
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-nez v11, :cond_28

    .line 278
    .line 279
    :cond_9
    :goto_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const-string v11, "\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55"

    .line 283
    .line 284
    invoke-static {v10, v11}, Lfb/t2;->w(Ljava/io/File;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    const/16 v13, 0x8

    .line 299
    .line 300
    invoke-static {v13, v11}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    new-instance v13, Ljava/io/File;

    .line 305
    .line 306
    new-instance v14, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v15, ".agent-new-"

    .line 318
    .line 319
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    invoke-direct {v13, v10, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    new-instance v14, Ljava/io/File;

    .line 333
    .line 334
    new-instance v15, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    move-object/from16 v16, v2

    .line 346
    .line 347
    const-string v2, ".agent-old-"

    .line 348
    .line 349
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-direct {v14, v10, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    new-instance v2, Ljava/io/File;

    .line 363
    .line 364
    new-instance v15, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const-string v0, ".agent-copy-"

    .line 376
    .line 377
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-direct {v2, v10, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v13}, Lfb/t2;->q(Ljava/io/File;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v14}, Lfb/t2;->o(Ljava/io/File;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v2}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 397
    .line 398
    .line 399
    if-nez v4, :cond_d

    .line 400
    .line 401
    :try_start_1
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-eqz v0, :cond_a

    .line 406
    .line 407
    invoke-static {v12, v13}, Lfb/t2;->n(Ljava/io/File;Ljava/io/File;)V

    .line 408
    .line 409
    .line 410
    goto :goto_3

    .line 411
    :catchall_1
    move-exception v0

    .line 412
    goto :goto_4

    .line 413
    :cond_a
    invoke-virtual {v13}, Ljava/io/File;->mkdirs()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_c

    .line 418
    .line 419
    :goto_3
    invoke-static {v9, v13, v5}, Lfb/t2;->d(Ljava/io/File;Ljava/io/File;Lfb/i2;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v13, v6}, Lfb/t2;->b0(Ljava/io/File;Ljava/lang/String;)Lfb/p2;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    iget-object v0, v0, Lfb/p2;->b:Lfb/z1;

    .line 427
    .line 428
    invoke-virtual {v0}, Lfb/z1;->a()Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-eqz v10, :cond_b

    .line 433
    .line 434
    invoke-static {v13}, Lfb/t2;->s(Ljava/io/File;)V

    .line 435
    .line 436
    .line 437
    goto :goto_5

    .line 438
    :cond_b
    invoke-virtual {v0}, Lfb/z1;->b()Ljava/util/ArrayList;

    .line 439
    .line 440
    .line 441
    move-result-object v14

    .line 442
    const-string v15, "\n"

    .line 443
    .line 444
    new-instance v0, Lfb/g0;

    .line 445
    .line 446
    const/16 v2, 0x14

    .line 447
    .line 448
    invoke-direct {v0, v2}, Lfb/g0;-><init>(I)V

    .line 449
    .line 450
    .line 451
    const/16 v19, 0x1e

    .line 452
    .line 453
    const/16 v16, 0x0

    .line 454
    .line 455
    const/16 v17, 0x0

    .line 456
    .line 457
    move-object/from16 v18, v0

    .line 458
    .line 459
    invoke-static/range {v14 .. v19}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    throw v2

    .line 473
    :cond_c
    const-string v0, "\u521b\u5efa\u63d0\u4ea4\u51c6\u5907\u76ee\u5f55\u5931\u8d25"

    .line 474
    .line 475
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 476
    .line 477
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 481
    :goto_4
    :try_start_2
    invoke-static {v13}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 482
    .line 483
    .line 484
    :catchall_2
    :try_start_3
    throw v0

    .line 485
    :cond_d
    :goto_5
    const/4 v11, 0x0

    .line 486
    if-eqz v3, :cond_e

    .line 487
    .line 488
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 489
    .line 490
    invoke-virtual {v0, v7, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 494
    if-eqz v0, :cond_e

    .line 495
    .line 496
    const/4 v3, 0x1

    .line 497
    goto :goto_6

    .line 498
    :cond_e
    move v3, v11

    .line 499
    :goto_6
    :try_start_4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 500
    .line 501
    invoke-virtual {v0, v7, v6, v11}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_d

    .line 506
    .line 507
    .line 508
    :try_start_5
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 509
    .line 510
    .line 511
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 512
    if-eqz v0, :cond_11

    .line 513
    .line 514
    :try_start_6
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v15

    .line 522
    invoke-static {v0, v15}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 523
    .line 524
    .line 525
    move-object/from16 v15, v16

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :catchall_3
    move-exception v0

    .line 529
    :try_start_7
    new-instance v15, Lsf/f;

    .line 530
    .line 531
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    :goto_7
    invoke-static {v15}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 535
    .line 536
    .line 537
    move-result-object v15
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 538
    if-nez v15, :cond_f

    .line 539
    .line 540
    :try_start_8
    invoke-static {v14}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-static {v14}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 545
    .line 546
    .line 547
    move-result-object v15

    .line 548
    invoke-static {v15}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v15

    .line 552
    invoke-static {v0, v15}, Lfb/t2;->d0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 553
    .line 554
    .line 555
    move-object v10, v14

    .line 556
    goto :goto_b

    .line 557
    :catchall_4
    move-exception v0

    .line 558
    move-object v2, v0

    .line 559
    move v0, v11

    .line 560
    :goto_8
    const/4 v10, 0x1

    .line 561
    goto/16 :goto_13

    .line 562
    .line 563
    :cond_f
    :try_start_9
    invoke-static {v12}, Lfb/t2;->O(Ljava/io/File;)V

    .line 564
    .line 565
    .line 566
    invoke-static {v12}, Lfb/t2;->I(Ljava/io/File;)Lfb/r2;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    iget-boolean v10, v0, Lfb/r2;->a:Z

    .line 571
    .line 572
    if-eqz v10, :cond_10

    .line 573
    .line 574
    invoke-static {v12, v2}, Lfb/t2;->l(Ljava/io/File;Ljava/io/File;)V

    .line 575
    .line 576
    .line 577
    move-object v10, v2

    .line 578
    goto :goto_b

    .line 579
    :catchall_5
    move-exception v0

    .line 580
    goto :goto_9

    .line 581
    :cond_10
    iget-object v0, v0, Lfb/r2;->b:Ljava/lang/Object;

    .line 582
    .line 583
    const-string v20, "\uff1b"

    .line 584
    .line 585
    const/16 v23, 0x0

    .line 586
    .line 587
    const/16 v24, 0x3e

    .line 588
    .line 589
    const/16 v21, 0x0

    .line 590
    .line 591
    const/16 v22, 0x0

    .line 592
    .line 593
    move-object/from16 v19, v0

    .line 594
    .line 595
    invoke-static/range {v19 .. v24}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    const-string v2, "\u539f\u63d2\u4ef6\u76ee\u5f55 \u65e0\u6cd5\u5b89\u5168\u5907\u4efd\u548c\u66ff\u6362\uff1a"

    .line 600
    .line 601
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 606
    .line 607
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 615
    :goto_9
    :try_start_a
    invoke-static {v0, v15}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 616
    .line 617
    .line 618
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 619
    :catchall_6
    move-exception v0

    .line 620
    move-object v2, v0

    .line 621
    move v0, v11

    .line 622
    const/4 v10, 0x1

    .line 623
    :goto_a
    const/4 v14, 0x0

    .line 624
    goto/16 :goto_13

    .line 625
    .line 626
    :cond_11
    const/4 v10, 0x0

    .line 627
    :goto_b
    if-eqz v4, :cond_12

    .line 628
    .line 629
    :try_start_b
    invoke-static {v12}, Lfb/t2;->q(Ljava/io/File;)V

    .line 630
    .line 631
    .line 632
    goto :goto_c

    .line 633
    :catchall_7
    move-exception v0

    .line 634
    move-object v2, v0

    .line 635
    move-object v14, v10

    .line 636
    const/4 v0, 0x1

    .line 637
    goto :goto_8

    .line 638
    :cond_12
    invoke-static {v10, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_14

    .line 643
    .line 644
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_14

    .line 649
    .line 650
    invoke-static {v9, v12, v5}, Lfb/t2;->d(Ljava/io/File;Ljava/io/File;Lfb/i2;)V

    .line 651
    .line 652
    .line 653
    invoke-static {v12}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-static {v0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-static {v13}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 662
    .line 663
    .line 664
    move-result-object v9

    .line 665
    invoke-static {v9}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v9

    .line 669
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-eqz v0, :cond_13

    .line 674
    .line 675
    goto :goto_c

    .line 676
    :cond_13
    const-string v0, "\u63d0\u4ea4\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25\uff1a\u76ee\u6807\u76ee\u5f55\u5185\u5bb9\u6821\u9a8c\u4e0d\u4e00\u81f4"

    .line 677
    .line 678
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 679
    .line 680
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v2

    .line 684
    :cond_14
    const-string v0, "\u63d0\u4ea4\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 685
    .line 686
    invoke-static {v13, v12, v0}, Lfb/t2;->P(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    :goto_c
    if-eqz v10, :cond_15

    .line 690
    .line 691
    invoke-static {v10}, Lfb/t2;->X(Ljava/io/File;)Ljava/io/File;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    const-string v9, "complete"

    .line 696
    .line 697
    invoke-static {v0, v9}, Lfb/t2;->d0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 698
    .line 699
    .line 700
    :cond_15
    :try_start_c
    invoke-static {v13}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 701
    .line 702
    .line 703
    move-object/from16 v3, v16

    .line 704
    .line 705
    goto :goto_d

    .line 706
    :catchall_8
    move-exception v0

    .line 707
    :try_start_d
    new-instance v3, Lsf/f;

    .line 708
    .line 709
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 710
    .line 711
    .line 712
    :goto_d
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    if-eqz v0, :cond_16

    .line 717
    .line 718
    invoke-virtual {v13}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    new-instance v9, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 725
    .line 726
    .line 727
    const-string v10, "[Hchat:ScriptAgent] \u6e05\u7406\u63d2\u4ef6\u63d0\u4ea4\u51c6\u5907\u76ee\u5f55\u5931\u8d25: "

    .line 728
    .line 729
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    invoke-static {v3, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 740
    .line 741
    .line 742
    :cond_16
    :try_start_e
    invoke-static {v14}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 743
    .line 744
    .line 745
    move-object/from16 v3, v16

    .line 746
    .line 747
    goto :goto_e

    .line 748
    :catchall_9
    move-exception v0

    .line 749
    :try_start_f
    new-instance v3, Lsf/f;

    .line 750
    .line 751
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 752
    .line 753
    .line 754
    :goto_e
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 755
    .line 756
    .line 757
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 758
    const-string v3, "[Hchat:ScriptAgent] \u6e05\u7406\u63d2\u4ef6\u4e8b\u52a1\u5907\u4efd\u5931\u8d25: "

    .line 759
    .line 760
    if-eqz v0, :cond_17

    .line 761
    .line 762
    :try_start_10
    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v9

    .line 766
    new-instance v10, Ljava/lang/StringBuilder;

    .line 767
    .line 768
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v9

    .line 781
    invoke-static {v9, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 782
    .line 783
    .line 784
    :cond_17
    :try_start_11
    invoke-static {v2}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 785
    .line 786
    .line 787
    move-object/from16 v9, v16

    .line 788
    .line 789
    goto :goto_f

    .line 790
    :catchall_a
    move-exception v0

    .line 791
    :try_start_12
    new-instance v9, Lsf/f;

    .line 792
    .line 793
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 794
    .line 795
    .line 796
    :goto_f
    invoke-static {v9}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    if-eqz v0, :cond_18

    .line 801
    .line 802
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    new-instance v9, Ljava/lang/StringBuilder;

    .line 807
    .line 808
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 822
    .line 823
    .line 824
    :cond_18
    :try_start_13
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 825
    .line 826
    invoke-virtual {v0, v7, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 827
    .line 828
    .line 829
    move-object/from16 v2, v16

    .line 830
    .line 831
    goto :goto_10

    .line 832
    :catchall_b
    move-exception v0

    .line 833
    :try_start_14
    new-instance v2, Lsf/f;

    .line 834
    .line 835
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 836
    .line 837
    .line 838
    :goto_10
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    if-eqz v0, :cond_19

    .line 843
    .line 844
    new-instance v2, Ljava/lang/StringBuilder;

    .line 845
    .line 846
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 847
    .line 848
    .line 849
    const-string v3, "[Hchat:ScriptAgent] \u5237\u65b0\u63d2\u4ef6\u76ee\u5f55\u89c2\u5bdf\u5931\u8d25: "

    .line 850
    .line 851
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 862
    .line 863
    .line 864
    :cond_19
    const-string v0, "Hchat_script_plugin_config"

    .line 865
    .line 866
    invoke-static {v7, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 871
    .line 872
    .line 873
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 874
    const-string v2, "script_plugin_item_"

    .line 875
    .line 876
    if-eqz v4, :cond_1a

    .line 877
    .line 878
    :try_start_15
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 883
    .line 884
    .line 885
    goto :goto_11

    .line 886
    :cond_1a
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-interface {v0, v2, v11}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 891
    .line 892
    .line 893
    :goto_11
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 894
    .line 895
    .line 896
    :try_start_16
    invoke-static {v7, v5}, Lfb/t2;->g(Landroid/content/Context;Lfb/i2;)Ljava/io/File;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v0}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 901
    .line 902
    .line 903
    :catchall_c
    :goto_12
    move-object v3, v12

    .line 904
    goto/16 :goto_20

    .line 905
    .line 906
    :catchall_d
    move-exception v0

    .line 907
    move-object v2, v0

    .line 908
    move v0, v11

    .line 909
    move v10, v0

    .line 910
    goto/16 :goto_a

    .line 911
    .line 912
    :goto_13
    if-eqz v10, :cond_1b

    .line 913
    .line 914
    :try_start_17
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 915
    .line 916
    invoke-virtual {v4, v7, v6, v11}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    invoke-static {v4}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    .line 921
    .line 922
    .line 923
    :catchall_e
    :cond_1b
    if-eqz v14, :cond_1d

    .line 924
    .line 925
    :try_start_18
    const-string v0, "\u6062\u590d\u539f\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 926
    .line 927
    invoke-static {v14, v12, v0}, Lfb/t2;->P(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    .line 931
    .line 932
    goto :goto_14

    .line 933
    :catchall_f
    move-exception v0

    .line 934
    :try_start_19
    new-instance v4, Lsf/f;

    .line 935
    .line 936
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 937
    .line 938
    .line 939
    move-object v0, v4

    .line 940
    :goto_14
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 941
    .line 942
    .line 943
    move-result-object v4

    .line 944
    if-nez v4, :cond_1c

    .line 945
    .line 946
    const/4 v4, 0x0

    .line 947
    goto :goto_15

    .line 948
    :cond_1c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 949
    .line 950
    :goto_15
    check-cast v0, Ljava/lang/Boolean;

    .line 951
    .line 952
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 953
    .line 954
    .line 955
    move-result v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 956
    :goto_16
    move-object v9, v4

    .line 957
    move v4, v0

    .line 958
    goto :goto_19

    .line 959
    :cond_1d
    if-nez v0, :cond_1e

    .line 960
    .line 961
    const/4 v4, 0x1

    .line 962
    const/4 v9, 0x0

    .line 963
    goto :goto_19

    .line 964
    :cond_1e
    :try_start_1a
    invoke-static {v12}, Lfb/t2;->q(Ljava/io/File;)V

    .line 965
    .line 966
    .line 967
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    .line 968
    .line 969
    goto :goto_17

    .line 970
    :catchall_10
    move-exception v0

    .line 971
    :try_start_1b
    new-instance v4, Lsf/f;

    .line 972
    .line 973
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 974
    .line 975
    .line 976
    move-object v0, v4

    .line 977
    :goto_17
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    if-nez v4, :cond_1f

    .line 982
    .line 983
    const/4 v4, 0x0

    .line 984
    goto :goto_18

    .line 985
    :cond_1f
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 986
    .line 987
    :goto_18
    check-cast v0, Ljava/lang/Boolean;

    .line 988
    .line 989
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 990
    .line 991
    .line 992
    move-result v0

    .line 993
    goto :goto_16

    .line 994
    :goto_19
    if-eqz v9, :cond_20

    .line 995
    .line 996
    new-instance v0, Ljava/lang/StringBuilder;

    .line 997
    .line 998
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 999
    .line 1000
    .line 1001
    const-string v10, "[Hchat:ScriptAgent] \u6062\u590d\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25: "

    .line 1002
    .line 1003
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-static {v0, v9}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 1014
    .line 1015
    .line 1016
    :cond_20
    if-eqz v4, :cond_22

    .line 1017
    .line 1018
    if-eqz v14, :cond_22

    .line 1019
    .line 1020
    :try_start_1c
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 1021
    .line 1022
    invoke-virtual {v0, v7, v6}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    .line 1023
    .line 1024
    .line 1025
    move-object/from16 v10, v16

    .line 1026
    .line 1027
    goto :goto_1a

    .line 1028
    :catchall_11
    move-exception v0

    .line 1029
    :try_start_1d
    new-instance v10, Lsf/f;

    .line 1030
    .line 1031
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1032
    .line 1033
    .line 1034
    :goto_1a
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    if-eqz v0, :cond_21

    .line 1039
    .line 1040
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1043
    .line 1044
    .line 1045
    const-string v11, "[Hchat:ScriptAgent] \u6062\u590d\u63d2\u4ef6\u76ee\u5f55\u89c2\u5bdf\u5931\u8d25: "

    .line 1046
    .line 1047
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v10

    .line 1057
    invoke-static {v10, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    .line 1058
    .line 1059
    .line 1060
    :cond_21
    :try_start_1e
    invoke-static {v14}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_12

    .line 1061
    .line 1062
    .line 1063
    move-object/from16 v10, v16

    .line 1064
    .line 1065
    goto :goto_1b

    .line 1066
    :catchall_12
    move-exception v0

    .line 1067
    :try_start_1f
    new-instance v10, Lsf/f;

    .line 1068
    .line 1069
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1070
    .line 1071
    .line 1072
    :goto_1b
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    if-eqz v0, :cond_22

    .line 1077
    .line 1078
    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v10

    .line 1082
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1085
    .line 1086
    .line 1087
    const-string v12, "[Hchat:ScriptAgent] \u6e05\u7406\u5df2\u6062\u590d\u7684\u63d2\u4ef6\u5907\u4efd\u5931\u8d25: "

    .line 1088
    .line 1089
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v10

    .line 1099
    invoke-static {v10, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    .line 1100
    .line 1101
    .line 1102
    :cond_22
    if-eqz v4, :cond_23

    .line 1103
    .line 1104
    if-eqz v3, :cond_23

    .line 1105
    .line 1106
    :try_start_20
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 1107
    .line 1108
    const/4 v3, 0x1

    .line 1109
    invoke-virtual {v0, v7, v6, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_13

    .line 1114
    .line 1115
    .line 1116
    goto :goto_1c

    .line 1117
    :catchall_13
    move-exception v0

    .line 1118
    :try_start_21
    new-instance v3, Lsf/f;

    .line 1119
    .line 1120
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1121
    .line 1122
    .line 1123
    move-object/from16 v16, v3

    .line 1124
    .line 1125
    :goto_1c
    invoke-static/range {v16 .. v16}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v15
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    .line 1129
    goto :goto_1d

    .line 1130
    :cond_23
    const/4 v15, 0x0

    .line 1131
    :goto_1d
    :try_start_22
    invoke-static {v13}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_14

    .line 1132
    .line 1133
    .line 1134
    :catchall_14
    if-nez v4, :cond_26

    .line 1135
    .line 1136
    if-eqz v9, :cond_24

    .line 1137
    .line 1138
    :try_start_23
    invoke-virtual {v2, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1139
    .line 1140
    .line 1141
    :cond_24
    if-eqz v14, :cond_25

    .line 1142
    .line 1143
    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    if-eqz v0, :cond_25

    .line 1148
    .line 1149
    goto :goto_1e

    .line 1150
    :cond_25
    const-string v0, "\u672a\u521b\u5efa\u5907\u4efd"

    .line 1151
    .line 1152
    :goto_1e
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 1153
    .line 1154
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1157
    .line 1158
    .line 1159
    const-string v6, "\u63d0\u4ea4\u5931\u8d25\u4e14\u6062\u590d\u539f\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25\uff0c\u5907\u4efd\u4f4d\u4e8e "

    .line 1160
    .line 1161
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-direct {v3, v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1172
    .line 1173
    .line 1174
    throw v3

    .line 1175
    :cond_26
    if-eqz v15, :cond_27

    .line 1176
    .line 1177
    invoke-static {v2, v15}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1181
    .line 1182
    const-string v3, "\u63d0\u4ea4\u5931\u8d25\uff0c\u65e7\u63d2\u4ef6\u5df2\u6062\u590d\u4f46\u91cd\u65b0\u542f\u7528\u5931\u8d25"

    .line 1183
    .line 1184
    invoke-direct {v0, v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1185
    .line 1186
    .line 1187
    throw v0

    .line 1188
    :cond_27
    throw v2

    .line 1189
    :cond_28
    const-string v0, "\u540c\u540d\u63d2\u4ef6\u5df2\u5b58\u5728\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u540e\u4fee\u6539"

    .line 1190
    .line 1191
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1192
    .line 1193
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    throw v2

    .line 1197
    :cond_29
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u6839\u76ee\u5f55\u5185\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5"

    .line 1198
    .line 1199
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1200
    .line 1201
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1202
    .line 1203
    .line 1204
    throw v2
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    .line 1205
    :goto_1f
    new-instance v12, Lsf/f;

    .line 1206
    .line 1207
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1208
    .line 1209
    .line 1210
    goto/16 :goto_12

    .line 1211
    .line 1212
    :goto_20
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1213
    .line 1214
    .line 1215
    new-instance v0, Landroid/os/Handler;

    .line 1216
    .line 1217
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1222
    .line 1223
    .line 1224
    new-instance v2, Lwb/xr;

    .line 1225
    .line 1226
    iget-object v4, v1, Lwb/dt;->i:Li0/j1;

    .line 1227
    .line 1228
    iget v6, v1, Lwb/dt;->j:I

    .line 1229
    .line 1230
    iget-object v8, v1, Lwb/dt;->k:Li0/a1;

    .line 1231
    .line 1232
    iget-object v9, v1, Lwb/dt;->l:Li0/a1;

    .line 1233
    .line 1234
    iget-object v10, v1, Lwb/dt;->m:Li0/a1;

    .line 1235
    .line 1236
    iget-object v11, v1, Lwb/dt;->n:Li0/a1;

    .line 1237
    .line 1238
    iget-object v12, v1, Lwb/dt;->o:Ljava/lang/String;

    .line 1239
    .line 1240
    iget-object v13, v1, Lwb/dt;->p:Lwb/yt;

    .line 1241
    .line 1242
    iget-object v14, v1, Lwb/dt;->q:Li0/a1;

    .line 1243
    .line 1244
    iget-object v15, v1, Lwb/dt;->r:Li0/j1;

    .line 1245
    .line 1246
    move-object/from16 v16, v2

    .line 1247
    .line 1248
    iget-object v2, v1, Lwb/dt;->s:Li0/a1;

    .line 1249
    .line 1250
    move-object/from16 v25, v16

    .line 1251
    .line 1252
    move-object/from16 v16, v2

    .line 1253
    .line 1254
    move-object/from16 v2, v25

    .line 1255
    .line 1256
    invoke-direct/range {v2 .. v16}, Lwb/xr;-><init>(Ljava/io/Serializable;Li0/j1;Lfb/i2;ILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;Li0/j1;Li0/a1;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1260
    .line 1261
    .line 1262
    return-void
.end method
