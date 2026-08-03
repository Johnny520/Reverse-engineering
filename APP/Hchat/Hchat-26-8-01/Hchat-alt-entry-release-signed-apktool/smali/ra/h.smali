.class public final Lra/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Ll3/l;

.field public final c:Lna/b;

.field public final d:Lna/b;

.field public final e:Lna/b;

.field public final f:Lna/b;

.field public final g:Ljava/util/WeakHashMap;

.field public final h:Ljava/util/WeakHashMap;

.field public i:Z


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ll3/l;Lna/b;Lna/b;Lna/b;Lna/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lra/h;->g:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lra/h;->h:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    iput-object p1, p0, Lra/h;->a:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iput-object p2, p0, Lra/h;->b:Ll3/l;

    .line 21
    .line 22
    iput-object p3, p0, Lra/h;->c:Lna/b;

    .line 23
    .line 24
    iput-object p4, p0, Lra/h;->d:Lna/b;

    .line 25
    .line 26
    iput-object p5, p0, Lra/h;->e:Lna/b;

    .line 27
    .line 28
    iput-object p6, p0, Lra/h;->f:Lna/b;

    .line 29
    .line 30
    return-void
.end method

.method public static a(Lra/h;Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lra/h;->h:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, v1, Lra/h;->g:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    iget-object v4, v1, Lra/h;->b:Ll3/l;

    .line 10
    .line 11
    instance-of v5, v0, Landroid/app/Activity;

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v4}, Ll3/l;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_12

    .line 22
    .line 23
    const-string v5, "hb_grab_mode"

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    :try_start_0
    invoke-virtual {v4}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {v7, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move v5, v6

    .line 36
    :goto_0
    if-ne v5, v6, :cond_1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/app/Activity;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    :try_start_1
    invoke-virtual {v5}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    if-eqz v8, :cond_2

    .line 49
    .line 50
    const-string v9, "key_native_url"

    .line 51
    .line 52
    invoke-virtual {v8, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    move-object v14, v8

    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    :cond_2
    move-object v14, v7

    .line 59
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v9, "\u9886\u53d6\u9875"

    .line 62
    .line 63
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v9, p2

    .line 67
    .line 68
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v9, ": nativeurl="

    .line 72
    .line 73
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v1, v8}, Lra/h;->o(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v8, v1, Lra/h;->c:Lna/b;

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    if-eqz v8, :cond_9

    .line 90
    .line 91
    iget-object v9, v8, Lna/b;->h:Lna/e;

    .line 92
    .line 93
    iget-object v8, v9, Lna/e;->f:Lna/k;

    .line 94
    .line 95
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-nez v10, :cond_4

    .line 100
    .line 101
    iget-object v10, v8, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 102
    .line 103
    invoke-virtual {v10, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    check-cast v10, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v11, v8, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    .line 111
    invoke-virtual {v11, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    move-object v12, v11

    .line 116
    check-cast v12, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v8, v8, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 119
    .line 120
    invoke-virtual {v8, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    move-object v11, v8

    .line 125
    check-cast v11, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-nez v8, :cond_3

    .line 132
    .line 133
    const-string v7, "exclusive_recv_username"

    .line 134
    .line 135
    invoke-static {v12, v7}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    :cond_3
    move-object v13, v7

    .line 140
    invoke-virtual/range {v9 .. v14}, Lna/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    if-eqz v7, :cond_9

    .line 145
    .line 146
    const-string v0, "\u5b9e\u65f6\u68c0\u67e5\u5ffd\u7565: "

    .line 147
    .line 148
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v9, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    iget v7, v9, Lna/e;->u:I

    .line 157
    .line 158
    iget-object v9, v9, Lna/e;->v:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-nez v10, :cond_9

    .line 165
    .line 166
    iget-object v10, v8, Lna/k;->j:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentLinkedDeque;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-eqz v10, :cond_5

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    iget-object v8, v8, Lna/k;->j:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_7

    .line 186
    .line 187
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v10, v9}, Loa/b;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v10, :cond_6

    .line 198
    .line 199
    move v8, v6

    .line 200
    goto :goto_2

    .line 201
    :cond_7
    move v8, v15

    .line 202
    :goto_2
    if-ne v7, v6, :cond_8

    .line 203
    .line 204
    if-nez v8, :cond_8

    .line 205
    .line 206
    goto/16 :goto_7

    .line 207
    .line 208
    :cond_8
    const/4 v9, 0x2

    .line 209
    if-ne v7, v9, :cond_9

    .line 210
    .line 211
    if-eqz v8, :cond_9

    .line 212
    .line 213
    goto/16 :goto_7

    .line 214
    .line 215
    :cond_9
    :goto_3
    if-eqz p3, :cond_11

    .line 216
    .line 217
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v3, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-virtual {v7, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-nez v8, :cond_11

    .line 228
    .line 229
    invoke-virtual {v3, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v7, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_a

    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_a
    const-string v40, "n"

    .line 242
    .line 243
    const-string v41, "o"

    .line 244
    .line 245
    const-string v16, "p"

    .line 246
    .line 247
    const-string v17, "q"

    .line 248
    .line 249
    const-string v18, "r"

    .line 250
    .line 251
    const-string v19, "s"

    .line 252
    .line 253
    const-string v20, "t"

    .line 254
    .line 255
    const-string v21, "u"

    .line 256
    .line 257
    const-string v22, "v"

    .line 258
    .line 259
    const-string v23, "w"

    .line 260
    .line 261
    const-string v24, "x"

    .line 262
    .line 263
    const-string v25, "y"

    .line 264
    .line 265
    const-string v26, "z"

    .line 266
    .line 267
    const-string v27, "a"

    .line 268
    .line 269
    const-string v28, "b"

    .line 270
    .line 271
    const-string v29, "c"

    .line 272
    .line 273
    const-string v30, "d"

    .line 274
    .line 275
    const-string v31, "e"

    .line 276
    .line 277
    const-string v32, "f"

    .line 278
    .line 279
    const-string v33, "g"

    .line 280
    .line 281
    const-string v34, "h"

    .line 282
    .line 283
    const-string v35, "i"

    .line 284
    .line 285
    const-string v36, "j"

    .line 286
    .line 287
    const-string v37, "k"

    .line 288
    .line 289
    const-string v38, "l"

    .line 290
    .line 291
    const-string v39, "m"

    .line 292
    .line 293
    filled-new-array/range {v16 .. v41}, [Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    move v8, v15

    .line 298
    :goto_4
    const/16 v9, 0x1a

    .line 299
    .line 300
    if-ge v8, v9, :cond_c

    .line 301
    .line 302
    aget-object v9, v7, v8

    .line 303
    .line 304
    :try_start_2
    invoke-static {v0, v9}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    instance-of v11, v10, Landroid/widget/Button;

    .line 309
    .line 310
    if-eqz v11, :cond_b

    .line 311
    .line 312
    move-object v11, v10

    .line 313
    check-cast v11, Landroid/view/View;

    .line 314
    .line 315
    invoke-virtual {v1, v11}, Lra/h;->n(Landroid/view/View;)Z

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    if-nez v11, :cond_b

    .line 320
    .line 321
    move-object v11, v10

    .line 322
    check-cast v11, Landroid/widget/Button;

    .line 323
    .line 324
    invoke-virtual {v1, v11}, Lra/h;->e(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    check-cast v10, Landroid/view/View;

    .line 328
    .line 329
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-virtual {v2, v10, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v5, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    new-instance v10, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const-string v11, "\u901a\u8fc7\u5b57\u6bb5\u70b9\u51fb\u7ea2\u5305\u6309\u94ae: "

    .line 343
    .line 344
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    invoke-virtual {v1, v9}, Lra/h;->o(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :catchall_2
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_c
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    :cond_d
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-eqz v8, :cond_10

    .line 378
    .line 379
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    check-cast v8, Ljava/lang/reflect/Field;

    .line 384
    .line 385
    invoke-static {v8, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    instance-of v10, v9, Landroid/widget/Button;

    .line 390
    .line 391
    if-nez v10, :cond_e

    .line 392
    .line 393
    goto :goto_5

    .line 394
    :cond_e
    check-cast v9, Landroid/widget/Button;

    .line 395
    .line 396
    invoke-virtual {v1, v9}, Lra/h;->n(Landroid/view/View;)Z

    .line 397
    .line 398
    .line 399
    move-result v10

    .line 400
    if-eqz v10, :cond_f

    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_f
    invoke-static {v9}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    invoke-static {v10, v6}, Lra/h;->m(Ljava/lang/String;Z)Z

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    if-eqz v10, :cond_d

    .line 412
    .line 413
    invoke-virtual {v1, v9}, Lra/h;->e(Landroid/view/View;)V

    .line 414
    .line 415
    .line 416
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v2, v9, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3, v5, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 427
    .line 428
    .line 429
    const-string v2, "\u904d\u5386\u5b57\u6bb5\u70b9\u51fb\u7ea2\u5305\u6309\u94ae: "

    .line 430
    .line 431
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v1, v0}, Lra/h;->o(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :catchall_3
    :cond_10
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v1, v0}, Lra/h;->g(Landroid/view/View;)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_11

    .line 462
    .line 463
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 464
    .line 465
    invoke-virtual {v3, v5, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    :cond_11
    :goto_6
    new-instance v6, Landroid/os/Handler;

    .line 469
    .line 470
    invoke-virtual {v5}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 475
    .line 476
    .line 477
    const-string v0, "hb_check_times"

    .line 478
    .line 479
    const/16 v2, 0xa

    .line 480
    .line 481
    :try_start_4
    invoke-virtual {v4}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 486
    .line 487
    .line 488
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 489
    :catchall_4
    filled-new-array {v15}, [I

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    new-instance v0, Lra/f;

    .line 494
    .line 495
    move-object v3, v5

    .line 496
    move v5, v2

    .line 497
    move-object v2, v3

    .line 498
    move-object v3, v14

    .line 499
    invoke-direct/range {v0 .. v6}, Lra/f;-><init>(Lra/h;Landroid/app/Activity;Ljava/lang/String;[IILandroid/os/Handler;)V

    .line 500
    .line 501
    .line 502
    const-wide/16 v1, 0x12c

    .line 503
    .line 504
    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 505
    .line 506
    .line 507
    :cond_12
    :goto_7
    return-void
.end method

.method public static b(Lra/h;Landroid/app/Activity;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lra/h;->b:Ll3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll3/l;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const-string v2, "key_native_url"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :goto_0
    move-object v5, v1

    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    :cond_1
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const/4 v1, 0x0

    .line 27
    :try_start_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    const-string v3, "key_is_self_sent"

    .line 34
    .line 35
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v2, v1

    .line 44
    :goto_2
    move v6, v2

    .line 45
    goto :goto_3

    .line 46
    :catchall_1
    move v6, v1

    .line 47
    :goto_3
    new-instance v9, Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v9, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "hb_check_times"

    .line 57
    .line 58
    const/16 v3, 0xa

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    :catchall_2
    const/4 v0, 0x3

    .line 69
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    filled-new-array {v1}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    new-instance v2, Lra/g;

    .line 78
    .line 79
    move-object v3, p0

    .line 80
    move-object v4, p1

    .line 81
    invoke-direct/range {v2 .. v9}, Lra/g;-><init>(Lra/h;Landroid/app/Activity;Ljava/lang/String;Z[IILandroid/os/Handler;)V

    .line 82
    .line 83
    .line 84
    const-wide/16 p0, 0x64

    .line 85
    .line 86
    invoke-virtual {v9, v2, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    instance-of v1, p0, Landroid/widget/TextView;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-static {v1}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "\u624b\u6162\u4e86"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    const-string v2, "\u7ea2\u5305\u6d3e\u5b8c\u4e86"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    const-string v2, "\u5df2\u88ab\u9886\u5b8c"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v2, "\u6765\u665a\u4e86"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    const-string v2, "\u5df2\u62a2\u5b8c"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    const-string v2, "\u5df2\u9886\u5b8c"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    const-string v2, "\u7ea2\u5305\u5df2\u88ab\u62a2\u5b8c"

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    const-string v2, "\u7ea2\u5305\u5df2\u9886\u5b8c"

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    const-string v2, "\u8be5\u7ea2\u5305\u5df2\u8d85\u8fc7"

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_2

    .line 88
    .line 89
    const-string v2, "\u5df2\u8fc7\u671f"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    check-cast p0, Landroid/view/ViewGroup;

    .line 103
    .line 104
    move v1, v0

    .line 105
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ge v1, v2, :cond_4

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, Lra/h;->c(Landroid/view/View;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 122
    return p0

    .line 123
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    :goto_2
    return v0
.end method

.method public static d(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    instance-of v1, p0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-static {v1}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "\u5df2\u5b58\u5165"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    const-string v2, ".*\\d+\\.\\d+\u5143.*"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    check-cast p0, Landroid/view/ViewGroup;

    .line 38
    .line 39
    move v1, v0

    .line 40
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ge v1, v2, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lra/h;->d(Landroid/view/View;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    :goto_2
    return v0
.end method

.method public static f(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-static {v0}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "(\\d+(?:\\.\\d+)?)\\s*\u5143"

    .line 17
    .line 18
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    const-string v2, "(\\d+(?:\\.\\d+)?)"

    .line 38
    .line 39
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x6

    .line 63
    if-gt v2, v3, :cond_2

    .line 64
    .line 65
    const-string v2, "."

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    const-string p0, "\u5143"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    check-cast p0, Landroid/view/ViewGroup;

    .line 85
    .line 86
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-ge v1, v0, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lra/h;->f(Landroid/view/View;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 107
    return-object p0
.end method

.method public static h(Landroid/view/View;)Landroid/widget/TextView;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-static {v0}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "\u5df2\u5b58\u5165"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    check-cast p0, Landroid/view/ViewGroup;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ge v0, v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lra/h;->h(Landroid/view/View;)Landroid/widget/TextView;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method public static i(Landroid/widget/TextView;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, ""

    .line 13
    .line 14
    return-object p0
.end method

.method public static m(Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    const-string v0, "\u958b"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "\u62c6"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "\u9886\u53d6"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method


# virtual methods
.method public final e(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, La1/d;

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final g(Landroid/view/View;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lra/h;->n(Landroid/view/View;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    instance-of v1, p1, Landroid/widget/Button;

    .line 12
    .line 13
    iget-object v2, p0, Lra/h;->h:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Landroid/widget/Button;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {v1}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v5, v0}, Lra/h;->m(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-string v5, "\u958b"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0, v1}, Lra/h;->e(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v2, v1, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return v3

    .line 58
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    instance-of v1, p1, Landroid/widget/TextView;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    check-cast v1, Landroid/widget/TextView;

    .line 70
    .line 71
    invoke-static {v1}, Lra/h;->i(Landroid/widget/TextView;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1, v0}, Lra/h;->m(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lra/h;->e(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return v3

    .line 90
    :cond_3
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    check-cast p1, Landroid/view/ViewGroup;

    .line 95
    .line 96
    move v1, v0

    .line 97
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ge v1, v2, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {p0, v2}, Lra/h;->g(Landroid/view/View;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    return v3

    .line 114
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    :goto_1
    return v0
.end method

.method public final j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    new-array p3, v0, [Ljava/lang/Class;

    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p3

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p1, p2, p3}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :goto_0
    if-nez p3, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 21
    .line 22
    invoke-virtual {v1, p3, p4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :goto_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "Hook\u7ea2\u5305\u9875\u9762\u65b9\u6cd5\u5931\u8d25: "

    .line 30
    .line 31
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, "."

    .line 42
    .line 43
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " | "

    .line 50
    .line 51
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Lra/h;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return v0
.end method

.method public final k(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-class v0, Landroid/os/Bundle;

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lra/e;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, p0, v2}, Lra/e;-><init>(Lra/h;I)V

    .line 14
    .line 15
    .line 16
    const-string v2, "onCreate"

    .line 17
    .line 18
    invoke-virtual {p0, p1, v2, v0, v1}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "Hook\u8be6\u60c5\u9875: "

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, ".onCreate"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lra/h;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    new-instance v0, Lra/e;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    invoke-direct {v0, p0, v2}, Lra/e;-><init>(Lra/h;I)V

    .line 50
    .line 51
    .line 52
    const-string v2, "onResume"

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {p0, p1, v2, v3, v0}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    new-instance p1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p2, ".onResume"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Lra/h;->o(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_0
    return-void
.end method

.method public final l(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    new-instance v0, Lra/e;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lra/e;-><init>(Lra/h;I)V

    .line 9
    .line 10
    .line 11
    const-string v1, "initView"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, p1, v1, v2, v0}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-string v1, "Hook\u9886\u53d6\u9875: "

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, ".initView"

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lra/h;->o(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const-class v0, Landroid/os/Bundle;

    .line 43
    .line 44
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v3, Lra/e;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-direct {v3, p0, v4}, Lra/e;-><init>(Lra/h;I)V

    .line 52
    .line 53
    .line 54
    const-string v4, "onCreate"

    .line 55
    .line 56
    invoke-virtual {p0, p1, v4, v0, v3}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 57
    .line 58
    .line 59
    new-instance v0, Lra/e;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    invoke-direct {v0, p0, v3}, Lra/e;-><init>(Lra/h;I)V

    .line 63
    .line 64
    .line 65
    const-string v3, "onResume"

    .line 66
    .line 67
    invoke-virtual {p0, p1, v3, v2, v0}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 68
    .line 69
    .line 70
    :try_start_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    const-string v4, "onSceneEnd"

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    array-length v4, v4

    .line 108
    const/4 v5, 0x4

    .line 109
    if-eq v4, v5, :cond_3

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 113
    .line 114
    new-instance v4, Lra/e;

    .line 115
    .line 116
    const/4 v5, 0x3

    .line 117
    invoke-direct {v4, p0, v5}, Lra/e;-><init>(Lra/h;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v3, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 121
    .line 122
    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ".onSceneEnd"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p0, v0}, Lra/h;->o(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    const-string v1, "Hook\u9886\u53d6\u9875onSceneEnd\u5931\u8d25: "

    .line 149
    .line 150
    const-string v3, " | "

    .line 151
    .line 152
    invoke-static {v1, p2, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-virtual {p0, p2}, Lra/h;->o(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    :goto_1
    :try_start_1
    const-string p2, "onDestroy"

    .line 171
    .line 172
    new-instance v0, Lra/e;

    .line 173
    .line 174
    const/4 v1, 0x4

    .line 175
    invoke-direct {v0, p0, v1}, Lra/e;-><init>(Lra/h;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1, p2, v2, v0}, Lra/h;->j(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 179
    .line 180
    .line 181
    :catchall_1
    :goto_2
    return-void
.end method

.method public final n(Landroid/view/View;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v1, p0, Lra/h;->h:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lra/h;->f:Lna/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lna/b;->h:Lna/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
