.class public final Lw2;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw2;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/16 p1, 0x23

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    sget-object p0, La3;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    const-string v0, "direct_download_write"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    instance-of v3, v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    check-cast v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v5, "getFileName"

    .line 44
    .line 45
    invoke-virtual {v3, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    instance-of v5, v3, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3}, La3;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v5, "fileName"

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v3, v0, Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    check-cast v0, Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0}, La3;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    :catchall_1
    :cond_4
    :goto_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 89
    .line 90
    aget-object v0, v0, v1

    .line 91
    .line 92
    instance-of v3, v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    const-wide/16 v5, 0x0

    .line 95
    .line 96
    if-eqz v3, :cond_a

    .line 97
    .line 98
    check-cast v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    const-string v3, "getFileSize"

    .line 115
    .line 116
    const-string v7, "getSize"

    .line 117
    .line 118
    filled-new-array {v3, v7}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    move v7, v1

    .line 123
    :goto_1
    const/4 v8, 0x2

    .line 124
    if-ge v7, v8, :cond_8

    .line 125
    .line 126
    aget-object v8, v3, v7

    .line 127
    .line 128
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-virtual {v9, v8, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v8, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    instance-of v9, v8, Ljava/lang/Number;

    .line 141
    .line 142
    if-eqz v9, :cond_7

    .line 143
    .line 144
    check-cast v8, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 147
    .line 148
    .line 149
    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 150
    goto :goto_3

    .line 151
    :catchall_2
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_8
    const-string v3, "fileSize"

    .line 155
    .line 156
    const-string v4, "size"

    .line 157
    .line 158
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    move v4, v1

    .line 163
    :goto_2
    if-ge v4, v8, :cond_a

    .line 164
    .line 165
    aget-object v7, v3, v4

    .line 166
    .line 167
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    instance-of v9, v7, Ljava/lang/Number;

    .line 180
    .line 181
    if-eqz v9, :cond_9

    .line 182
    .line 183
    check-cast v7, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 186
    .line 187
    .line 188
    move-result-wide v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 189
    goto :goto_3

    .line 190
    :catchall_3
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_a
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    .line 195
    .line 196
    move-result-wide v3

    .line 197
    sget-wide v7, Lk9;->c:J

    .line 198
    .line 199
    cmp-long v0, v3, v7

    .line 200
    .line 201
    const/4 v3, 0x1

    .line 202
    if-gtz v0, :cond_b

    .line 203
    .line 204
    move v0, v3

    .line 205
    goto :goto_4

    .line 206
    :cond_b
    move v0, v1

    .line 207
    :goto_4
    if-eqz v0, :cond_c

    .line 208
    .line 209
    const-string v4, "kernel_cpp_proxy"

    .line 210
    .line 211
    iget-object v7, p0, Lw2;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-nez v4, :cond_c

    .line 218
    .line 219
    new-instance p1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v0, "download redirect deferred route="

    .line 222
    .line 223
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object p0, p0, Lw2;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string p0, " reason=legacy-group-file-page"

    .line 232
    .line 233
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_c
    iget-object v4, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 245
    .line 246
    aget-object v4, v4, v3

    .line 247
    .line 248
    instance-of v7, v4, Ljava/lang/String;

    .line 249
    .line 250
    if-eqz v7, :cond_d

    .line 251
    .line 252
    check-cast v4, Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_5

    .line 259
    :cond_d
    const-string v4, ""

    .line 260
    .line 261
    :goto_5
    invoke-static {}, La3;->d()Ljava/io/File;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    if-nez v7, :cond_e

    .line 266
    .line 267
    :goto_6
    return-void

    .line 268
    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    if-nez v8, :cond_f

    .line 273
    .line 274
    const-string p0, "download direct write skipped reason=file name missing"

    .line 275
    .line 276
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_f
    if-eqz v0, :cond_15

    .line 281
    .line 282
    invoke-static {v7, v2, v5, v6}, La3;->b(Ljava/io/File;Ljava/lang/String;J)Lx2;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-nez v0, :cond_10

    .line 287
    .line 288
    const-string p0, "download direct write skipped reason=legacy target allocation failed"

    .line 289
    .line 290
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_10
    invoke-static {v7}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    iget-object v0, v0, Lx2;->a:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Ljava/io/File;

    .line 301
    .line 302
    invoke-static {v0}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v5, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 307
    .line 308
    aput-object v0, v5, v3

    .line 309
    .line 310
    sget-object v5, La3;->d:Ljava/lang/ThreadLocal;

    .line 311
    .line 312
    invoke-virtual {v5, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 316
    .line 317
    aget-object p1, p1, v1

    .line 318
    .line 319
    invoke-static {p1, v0, v2, v3}, La3;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)Ly2;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    new-instance v1, Ljava/io/File;

    .line 324
    .line 325
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v1}, La3;->m(Ljava/io/File;)Lz2;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    new-instance v2, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v3, "download redirect selected route="

    .line 335
    .line 336
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    iget-object p0, p0, Lw2;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string p0, " write="

    .line 345
    .line 346
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string p0, " target="

    .line 353
    .line 354
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    if-nez v1, :cond_11

    .line 361
    .line 362
    const-string p0, ""

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_11
    new-instance p0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v0, " final="

    .line 368
    .line 369
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v1, Lz2;->b:Ljava/io/File;

    .line 373
    .line 374
    invoke-static {v0}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v0, " staging=true"

    .line 382
    .line 383
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    :goto_7
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    if-nez p0, :cond_12

    .line 398
    .line 399
    const-string p0, " save_path=filled"

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_12
    const-string p0, " save_path=overwrite"

    .line 403
    .line 404
    :goto_8
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string p0, " legacy_page=true"

    .line 408
    .line 409
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    iget p0, p1, Ly2;->b:I

    .line 413
    .line 414
    if-lez p0, :cond_14

    .line 415
    .line 416
    new-instance p0, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    const-string v0, " file_path=patched fields="

    .line 419
    .line 420
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    iget-object v0, p1, Ly2;->a:Ljava/io/Serializable;

    .line 424
    .line 425
    check-cast v0, Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-nez v0, :cond_13

    .line 432
    .line 433
    iget p1, p1, Ly2;->b:I

    .line 434
    .line 435
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    goto :goto_9

    .line 440
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    iget-object v1, p1, Ly2;->a:Ljava/io/Serializable;

    .line 446
    .line 447
    check-cast v1, Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v1, ":"

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    iget p1, p1, Ly2;->b:I

    .line 458
    .line 459
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    :goto_9
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    goto :goto_a

    .line 474
    :cond_14
    const-string p0, " file_path=unpatched"

    .line 475
    .line 476
    :goto_a
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :cond_15
    const-string v0, ""

    .line 488
    .line 489
    sget-object v8, La3;->d:Ljava/lang/ThreadLocal;

    .line 490
    .line 491
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    const-string v9, ""

    .line 496
    .line 497
    instance-of v10, v8, Ljava/lang/String;

    .line 498
    .line 499
    if-eqz v10, :cond_1b

    .line 500
    .line 501
    check-cast v8, Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    if-eqz v10, :cond_1b

    .line 512
    .line 513
    const-string v10, "content://"

    .line 514
    .line 515
    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    if-eqz v10, :cond_16

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_16
    const-string v10, "file://"

    .line 523
    .line 524
    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    if-eqz v10, :cond_17

    .line 529
    .line 530
    const/4 v10, 0x7

    .line 531
    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    :cond_17
    new-instance v10, Ljava/io/File;

    .line 536
    .line 537
    invoke-direct {v10, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 541
    .line 542
    .line 543
    move-result-object v8

    .line 544
    if-nez v8, :cond_18

    .line 545
    .line 546
    goto :goto_b

    .line 547
    :cond_18
    invoke-static {v8}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v8

    .line 551
    invoke-static {v7}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    invoke-virtual {v8, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 556
    .line 557
    .line 558
    move-result v8

    .line 559
    if-nez v8, :cond_19

    .line 560
    .line 561
    goto :goto_b

    .line 562
    :cond_19
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    invoke-static {v8}, La3;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-nez v10, :cond_1a

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_1a
    new-instance v9, Ljava/io/File;

    .line 578
    .line 579
    invoke-direct {v9, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v9}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v9

    .line 586
    :cond_1b
    :goto_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    if-nez v8, :cond_1c

    .line 591
    .line 592
    const-string v9, ""

    .line 593
    .line 594
    goto :goto_c

    .line 595
    :cond_1c
    :try_start_4
    new-instance v8, Ljava/io/File;

    .line 596
    .line 597
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    sget-object v10, La3;->a:Ljava/lang/Object;

    .line 601
    .line 602
    monitor-enter v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 603
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 604
    .line 605
    .line 606
    move-result-wide v11

    .line 607
    invoke-static {v11, v12}, La3;->n(J)V

    .line 608
    .line 609
    .line 610
    sget-object v11, La3;->b:Ljava/util/HashMap;

    .line 611
    .line 612
    invoke-static {v8}, La3;->w(Ljava/io/File;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    invoke-virtual {v11, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    monitor-exit v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 621
    if-eqz v8, :cond_1d

    .line 622
    .line 623
    goto :goto_c

    .line 624
    :cond_1d
    :try_start_6
    const-string v9, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 625
    .line 626
    goto :goto_c

    .line 627
    :catchall_4
    move-exception v8

    .line 628
    :try_start_7
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 629
    :try_start_8
    throw v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 630
    :catchall_5
    const-string v9, ""

    .line 631
    .line 632
    :goto_c
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    if-lez v8, :cond_1e

    .line 637
    .line 638
    move v8, v3

    .line 639
    move-object v0, v9

    .line 640
    goto :goto_d

    .line 641
    :cond_1e
    move v8, v1

    .line 642
    :goto_d
    if-nez v8, :cond_20

    .line 643
    .line 644
    invoke-static {v7, v2, v5, v6}, La3;->b(Ljava/io/File;Ljava/lang/String;J)Lx2;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    if-nez v0, :cond_1f

    .line 649
    .line 650
    const-string p0, "download direct write skipped reason=target allocation failed"

    .line 651
    .line 652
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :cond_1f
    iget-object v0, v0, Lx2;->a:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, Ljava/io/File;

    .line 659
    .line 660
    invoke-static {v0}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    :cond_20
    iget-object v2, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 665
    .line 666
    aput-object v0, v2, v3

    .line 667
    .line 668
    sget-object v2, La3;->d:Ljava/lang/ThreadLocal;

    .line 669
    .line 670
    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 674
    .line 675
    aget-object p1, p1, v1

    .line 676
    .line 677
    const-string v2, ""

    .line 678
    .line 679
    invoke-static {p1, v0, v2, v1}, La3;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)Ly2;

    .line 680
    .line 681
    .line 682
    move-result-object p1

    .line 683
    new-instance v1, Ljava/io/File;

    .line 684
    .line 685
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-static {v1}, La3;->m(Ljava/io/File;)Lz2;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    new-instance v2, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    const-string v3, "download redirect selected route="

    .line 695
    .line 696
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    iget-object p0, p0, Lw2;->a:Ljava/lang/String;

    .line 700
    .line 701
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    const-string p0, " write="

    .line 705
    .line 706
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    if-nez v1, :cond_21

    .line 713
    .line 714
    const-string p0, ""

    .line 715
    .line 716
    goto :goto_e

    .line 717
    :cond_21
    new-instance p0, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    const-string v0, " final="

    .line 720
    .line 721
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    iget-object v0, v1, Lz2;->b:Ljava/io/File;

    .line 725
    .line 726
    invoke-static {v0}, La3;->c(Ljava/io/File;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    const-string v0, " staging=true"

    .line 734
    .line 735
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    :goto_e
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 746
    .line 747
    .line 748
    move-result p0

    .line 749
    if-nez p0, :cond_22

    .line 750
    .line 751
    const-string p0, " save_path=filled"

    .line 752
    .line 753
    goto :goto_f

    .line 754
    :cond_22
    const-string p0, ""

    .line 755
    .line 756
    :goto_f
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    if-eqz v8, :cond_23

    .line 760
    .line 761
    const-string p0, " save_path=reused"

    .line 762
    .line 763
    goto :goto_10

    .line 764
    :cond_23
    const-string p0, ""

    .line 765
    .line 766
    :goto_10
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    iget p0, p1, Ly2;->b:I

    .line 770
    .line 771
    if-lez p0, :cond_24

    .line 772
    .line 773
    const-string p0, " file_path=patched"

    .line 774
    .line 775
    goto :goto_11

    .line 776
    :cond_24
    const-string p0, ""

    .line 777
    .line 778
    :goto_11
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object p0

    .line 785
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-void
.end method
