.class public final Lyd2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lug;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvn1;


# direct methods
.method public synthetic constructor <init>(Lvn1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyd2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyd2;->b:Lvn1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lyd2;->a:I

    .line 8
    .line 9
    const-string v4, "referenceId"

    .line 10
    .line 11
    const-string v5, "method"

    .line 12
    .line 13
    sget-object v6, La83;->a:La83;

    .line 14
    .line 15
    const-string v7, "\u786e\u5b9a"

    .line 16
    .line 17
    const-string v8, "title"

    .line 18
    .line 19
    const-string v9, "className"

    .line 20
    .line 21
    const-string v10, "message"

    .line 22
    .line 23
    const-string v12, "options"

    .line 24
    .line 25
    const/16 v16, 0x0

    .line 26
    .line 27
    iget-object v15, v0, Lyd2;->b:Lvn1;

    .line 28
    .line 29
    const-string v17, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    sget-object v14, Lk20;->h:Lk20;

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    const/high16 v19, -0x80000000

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    packed-switch v3, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    instance-of v3, v2, Lze2;

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Lze2;

    .line 46
    .line 47
    iget v4, v3, Lze2;->m:I

    .line 48
    .line 49
    and-int v5, v4, v19

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    sub-int v4, v4, v19

    .line 54
    .line 55
    iput v4, v3, Lze2;->m:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v3, Lze2;

    .line 59
    .line 60
    check-cast v2, Lu00;

    .line 61
    .line 62
    invoke-direct {v3, v0, v2}, Lze2;-><init>(Lyd2;Lu00;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    iget-object v0, v3, Lze2;->k:Ljava/lang/Object;

    .line 66
    .line 67
    iget v2, v3, Lze2;->m:I

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    if-ne v2, v11, :cond_1

    .line 72
    .line 73
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object v14, v13

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :try_start_1
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    aget-object v0, v1, v16

    .line 89
    .line 90
    iget-object v1, v15, Lvn1;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ldf2;

    .line 93
    .line 94
    iget-object v1, v1, Ldf2;->a:Lbf2;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lgf1;->K(Ljava/lang/Object;)Lzj2;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput v11, v3, Lze2;->m:I

    .line 104
    .line 105
    new-instance v1, Lmb;

    .line 106
    .line 107
    const/4 v2, 0x3

    .line 108
    invoke-direct {v1, v15, v0, v13, v2}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v15, v1, v3}, Lvn1;->d(Lin0;Lu00;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-ne v0, v14, :cond_3

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    :goto_1
    check-cast v0, Lak2;

    .line 119
    .line 120
    invoke-static {v0}, Lgf1;->Y(Lak2;)Lcom/dokar/quickjs/binding/JsObject;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 125
    .line 126
    .line 127
    move-result-object v14
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    goto :goto_2

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    :goto_2
    return-object v14

    .line 135
    :catch_0
    move-exception v0

    .line 136
    throw v0

    .line 137
    :pswitch_0
    const-string v3, "cancelText"

    .line 138
    .line 139
    const-string v4, "confirmText"

    .line 140
    .line 141
    instance-of v5, v2, Lge2;

    .line 142
    .line 143
    if-eqz v5, :cond_4

    .line 144
    .line 145
    move-object v5, v2

    .line 146
    check-cast v5, Lge2;

    .line 147
    .line 148
    iget v6, v5, Lge2;->m:I

    .line 149
    .line 150
    and-int v9, v6, v19

    .line 151
    .line 152
    if-eqz v9, :cond_4

    .line 153
    .line 154
    sub-int v6, v6, v19

    .line 155
    .line 156
    iput v6, v5, Lge2;->m:I

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    new-instance v5, Lge2;

    .line 160
    .line 161
    check-cast v2, Lu00;

    .line 162
    .line 163
    invoke-direct {v5, v0, v2}, Lge2;-><init>(Lyd2;Lu00;)V

    .line 164
    .line 165
    .line 166
    :goto_3
    iget-object v0, v5, Lge2;->k:Ljava/lang/Object;

    .line 167
    .line 168
    iget v2, v5, Lge2;->m:I

    .line 169
    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    if-ne v2, v11, :cond_5

    .line 173
    .line 174
    :try_start_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 175
    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_5
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object v14, v13

    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :cond_6
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :try_start_3
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    aget-object v0, v1, v16

    .line 192
    .line 193
    invoke-static {v12, v0}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v1, Lxf2;

    .line 198
    .line 199
    invoke-static {v0, v8}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-eqz v2, :cond_8

    .line 204
    .line 205
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_7

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    const/16 v8, 0x1000

    .line 216
    .line 217
    if-gt v6, v8, :cond_7

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    new-instance v1, Lsd2;

    .line 221
    .line 222
    const-string v2, "INVALID_ARGUMENT"

    .line 223
    .line 224
    const-string v3, "title must not be blank and must contain at most 4096 characters."

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const/16 v7, 0x1c

    .line 228
    .line 229
    const/4 v4, 0x0

    .line 230
    const/4 v5, 0x0

    .line 231
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 232
    .line 233
    .line 234
    throw v1

    .line 235
    :cond_8
    move-object v2, v13

    .line 236
    :goto_4
    invoke-virtual {v0, v10}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-static {v10, v6}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-static {v6}, Laf2;->b(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v4}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    if-nez v8, :cond_9

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_9
    move-object v7, v8

    .line 255
    :goto_5
    invoke-static {v7, v4}, Laf2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v3}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-nez v0, :cond_a

    .line 263
    .line 264
    const-string v0, "\u53d6\u6d88"

    .line 265
    .line 266
    :cond_a
    invoke-static {v0, v3}, Laf2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-direct {v1, v2, v6, v7, v0}, Lxf2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iput v11, v5, Lge2;->m:I

    .line 273
    .line 274
    new-instance v0, Lmb;

    .line 275
    .line 276
    const/4 v2, 0x5

    .line 277
    invoke-direct {v0, v15, v1, v13, v2}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v15, v0, v5}, Lvn1;->e(Lin0;Lu00;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-ne v0, v14, :cond_b

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_b
    :goto_6
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 288
    .line 289
    .line 290
    move-result-object v14
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 291
    goto :goto_7

    .line 292
    :catchall_1
    move-exception v0

    .line 293
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 294
    .line 295
    .line 296
    move-result-object v14

    .line 297
    :goto_7
    return-object v14

    .line 298
    :catch_1
    move-exception v0

    .line 299
    throw v0

    .line 300
    :pswitch_1
    const-string v3, "buttonText"

    .line 301
    .line 302
    instance-of v4, v2, Lfe2;

    .line 303
    .line 304
    if-eqz v4, :cond_c

    .line 305
    .line 306
    move-object v4, v2

    .line 307
    check-cast v4, Lfe2;

    .line 308
    .line 309
    iget v5, v4, Lfe2;->m:I

    .line 310
    .line 311
    and-int v9, v5, v19

    .line 312
    .line 313
    if-eqz v9, :cond_c

    .line 314
    .line 315
    sub-int v5, v5, v19

    .line 316
    .line 317
    iput v5, v4, Lfe2;->m:I

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_c
    new-instance v4, Lfe2;

    .line 321
    .line 322
    check-cast v2, Lu00;

    .line 323
    .line 324
    invoke-direct {v4, v0, v2}, Lfe2;-><init>(Lyd2;Lu00;)V

    .line 325
    .line 326
    .line 327
    :goto_8
    iget-object v0, v4, Lfe2;->k:Ljava/lang/Object;

    .line 328
    .line 329
    iget v2, v4, Lfe2;->m:I

    .line 330
    .line 331
    if-eqz v2, :cond_e

    .line 332
    .line 333
    if-ne v2, v11, :cond_d

    .line 334
    .line 335
    :try_start_4
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 336
    .line 337
    .line 338
    goto :goto_c

    .line 339
    :cond_d
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    move-object v14, v13

    .line 343
    goto/16 :goto_d

    .line 344
    .line 345
    :cond_e
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :try_start_5
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    aget-object v0, v1, v16

    .line 352
    .line 353
    invoke-static {v12, v0}, Lsp0;->e0(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v1, Ljd2;

    .line 358
    .line 359
    invoke-static {v0, v8}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-eqz v2, :cond_10

    .line 364
    .line 365
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-nez v5, :cond_f

    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    const/16 v8, 0x1000

    .line 376
    .line 377
    if-gt v5, v8, :cond_f

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_f
    new-instance v1, Lsd2;

    .line 381
    .line 382
    const-string v2, "INVALID_ARGUMENT"

    .line 383
    .line 384
    const-string v3, "title must not be blank and must contain at most 4096 characters."

    .line 385
    .line 386
    const/4 v6, 0x0

    .line 387
    const/16 v7, 0x1c

    .line 388
    .line 389
    const/4 v4, 0x0

    .line 390
    const/4 v5, 0x0

    .line 391
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 392
    .line 393
    .line 394
    throw v1

    .line 395
    :cond_10
    move-object v2, v13

    .line 396
    :goto_9
    invoke-virtual {v0, v10}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-static {v10, v5}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    invoke-static {v5}, Laf2;->b(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v3}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-nez v0, :cond_11

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_11
    move-object v7, v0

    .line 415
    :goto_a
    invoke-static {v7, v3}, Laf2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-direct {v1, v2, v5, v7}, Ljd2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iput v11, v4, Lfe2;->m:I

    .line 422
    .line 423
    new-instance v0, Lmb;

    .line 424
    .line 425
    const/4 v2, 0x4

    .line 426
    invoke-direct {v0, v15, v1, v13, v2}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v15, v0, v4}, Lvn1;->e(Lin0;Lu00;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-ne v0, v14, :cond_12

    .line 434
    .line 435
    goto :goto_b

    .line 436
    :cond_12
    move-object v0, v6

    .line 437
    :goto_b
    if-ne v0, v14, :cond_13

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_13
    :goto_c
    invoke-static {v6}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 441
    .line 442
    .line 443
    move-result-object v14
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 444
    goto :goto_d

    .line 445
    :catchall_2
    move-exception v0

    .line 446
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 447
    .line 448
    .line 449
    move-result-object v14

    .line 450
    :goto_d
    return-object v14

    .line 451
    :catch_2
    move-exception v0

    .line 452
    throw v0

    .line 453
    :pswitch_2
    instance-of v3, v2, Lee2;

    .line 454
    .line 455
    if-eqz v3, :cond_14

    .line 456
    .line 457
    move-object v3, v2

    .line 458
    check-cast v3, Lee2;

    .line 459
    .line 460
    iget v4, v3, Lee2;->m:I

    .line 461
    .line 462
    and-int v5, v4, v19

    .line 463
    .line 464
    if-eqz v5, :cond_14

    .line 465
    .line 466
    sub-int v4, v4, v19

    .line 467
    .line 468
    iput v4, v3, Lee2;->m:I

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_14
    new-instance v3, Lee2;

    .line 472
    .line 473
    check-cast v2, Lu00;

    .line 474
    .line 475
    invoke-direct {v3, v0, v2}, Lee2;-><init>(Lyd2;Lu00;)V

    .line 476
    .line 477
    .line 478
    :goto_e
    iget-object v0, v3, Lee2;->k:Ljava/lang/Object;

    .line 479
    .line 480
    iget v2, v3, Lee2;->m:I

    .line 481
    .line 482
    if-eqz v2, :cond_16

    .line 483
    .line 484
    if-ne v2, v11, :cond_15

    .line 485
    .line 486
    :try_start_6
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 487
    .line 488
    .line 489
    goto :goto_11

    .line 490
    :cond_15
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    move-object v14, v13

    .line 494
    goto/16 :goto_12

    .line 495
    .line 496
    :cond_16
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    const/4 v0, 0x2

    .line 500
    :try_start_7
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    aget-object v0, v1, v16

    .line 504
    .line 505
    invoke-static {v10, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    if-nez v2, :cond_1d

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    const/16 v8, 0x1000

    .line 520
    .line 521
    if-gt v2, v8, :cond_1d

    .line 522
    .line 523
    aget-object v1, v1, v11

    .line 524
    .line 525
    invoke-static {v12, v1}, Lsp0;->S(Ljava/lang/String;Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 526
    .line 527
    .line 528
    move-result-object v1
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 529
    const-string v2, "short"

    .line 530
    .line 531
    if-eqz v1, :cond_17

    .line 532
    .line 533
    :try_start_8
    const-string v4, "duration"

    .line 534
    .line 535
    invoke-static {v1, v4}, Lsp0;->T(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    if-nez v1, :cond_18

    .line 540
    .line 541
    :cond_17
    move-object v1, v2

    .line 542
    :cond_18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    if-eqz v2, :cond_19

    .line 547
    .line 548
    sget-object v1, Lwk2;->h:Lwk2;

    .line 549
    .line 550
    goto :goto_f

    .line 551
    :cond_19
    const-string v2, "long"

    .line 552
    .line 553
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-eqz v1, :cond_1c

    .line 558
    .line 559
    sget-object v1, Lwk2;->i:Lwk2;

    .line 560
    .line 561
    :goto_f
    new-instance v2, Lxk2;

    .line 562
    .line 563
    invoke-direct {v2, v0, v1}, Lxk2;-><init>(Ljava/lang/String;Lwk2;)V

    .line 564
    .line 565
    .line 566
    iput v11, v3, Lee2;->m:I

    .line 567
    .line 568
    new-instance v0, Lmb;

    .line 569
    .line 570
    const/4 v1, 0x6

    .line 571
    invoke-direct {v0, v15, v2, v13, v1}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v15, v0, v3}, Lvn1;->e(Lin0;Lu00;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    if-ne v0, v14, :cond_1a

    .line 579
    .line 580
    goto :goto_10

    .line 581
    :cond_1a
    move-object v0, v6

    .line 582
    :goto_10
    if-ne v0, v14, :cond_1b

    .line 583
    .line 584
    goto :goto_12

    .line 585
    :cond_1b
    :goto_11
    invoke-static {v6}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 586
    .line 587
    .line 588
    move-result-object v14

    .line 589
    goto :goto_12

    .line 590
    :cond_1c
    new-instance v1, Lsd2;

    .line 591
    .line 592
    const-string v2, "INVALID_ARGUMENT"

    .line 593
    .line 594
    const-string v3, "duration must be \'short\' or \'long\'."

    .line 595
    .line 596
    const/4 v6, 0x0

    .line 597
    const/16 v7, 0x1c

    .line 598
    .line 599
    const/4 v4, 0x0

    .line 600
    const/4 v5, 0x0

    .line 601
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 602
    .line 603
    .line 604
    throw v1

    .line 605
    :cond_1d
    new-instance v1, Lsd2;

    .line 606
    .line 607
    const-string v2, "INVALID_ARGUMENT"

    .line 608
    .line 609
    const-string v3, "message must not be blank and must contain at most 4096 characters."

    .line 610
    .line 611
    const/4 v6, 0x0

    .line 612
    const/16 v7, 0x1c

    .line 613
    .line 614
    const/4 v4, 0x0

    .line 615
    const/4 v5, 0x0

    .line 616
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 617
    .line 618
    .line 619
    throw v1
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 620
    :catchall_3
    move-exception v0

    .line 621
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 622
    .line 623
    .line 624
    move-result-object v14

    .line 625
    :goto_12
    return-object v14

    .line 626
    :catch_3
    move-exception v0

    .line 627
    throw v0

    .line 628
    :pswitch_3
    instance-of v3, v2, Lde2;

    .line 629
    .line 630
    if-eqz v3, :cond_1e

    .line 631
    .line 632
    move-object v3, v2

    .line 633
    check-cast v3, Lde2;

    .line 634
    .line 635
    iget v4, v3, Lde2;->m:I

    .line 636
    .line 637
    and-int v5, v4, v19

    .line 638
    .line 639
    if-eqz v5, :cond_1e

    .line 640
    .line 641
    sub-int v4, v4, v19

    .line 642
    .line 643
    iput v4, v3, Lde2;->m:I

    .line 644
    .line 645
    goto :goto_13

    .line 646
    :cond_1e
    new-instance v3, Lde2;

    .line 647
    .line 648
    check-cast v2, Lu00;

    .line 649
    .line 650
    invoke-direct {v3, v0, v2}, Lde2;-><init>(Lyd2;Lu00;)V

    .line 651
    .line 652
    .line 653
    :goto_13
    iget-object v0, v3, Lde2;->k:Ljava/lang/Object;

    .line 654
    .line 655
    iget v2, v3, Lde2;->m:I

    .line 656
    .line 657
    if-eqz v2, :cond_20

    .line 658
    .line 659
    if-ne v2, v11, :cond_1f

    .line 660
    .line 661
    :try_start_9
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 662
    .line 663
    .line 664
    goto :goto_14

    .line 665
    :cond_1f
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    move-object v14, v13

    .line 669
    goto :goto_15

    .line 670
    :cond_20
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    const/4 v0, 0x2

    .line 674
    :try_start_a
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    aget-object v0, v1, v11

    .line 678
    .line 679
    instance-of v2, v0, Ljava/util/List;

    .line 680
    .line 681
    if-eqz v2, :cond_21

    .line 682
    .line 683
    move-object v13, v0

    .line 684
    check-cast v13, Ljava/util/List;

    .line 685
    .line 686
    :cond_21
    if-eqz v13, :cond_23

    .line 687
    .line 688
    aget-object v0, v1, v16

    .line 689
    .line 690
    invoke-static {v9, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    iput v11, v3, Lde2;->m:I

    .line 695
    .line 696
    invoke-virtual {v15, v0, v13, v3}, Lvn1;->q(Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    if-ne v0, v14, :cond_22

    .line 701
    .line 702
    goto :goto_15

    .line 703
    :cond_22
    :goto_14
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 704
    .line 705
    .line 706
    move-result-object v14

    .line 707
    goto :goto_15

    .line 708
    :cond_23
    new-instance v1, Lsd2;

    .line 709
    .line 710
    const-string v2, "INVALID_ARGUMENT"

    .line 711
    .line 712
    const-string v3, "arguments must be an array."

    .line 713
    .line 714
    const/4 v6, 0x0

    .line 715
    const/16 v7, 0x1c

    .line 716
    .line 717
    const/4 v4, 0x0

    .line 718
    const/4 v5, 0x0

    .line 719
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 720
    .line 721
    .line 722
    throw v1
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 723
    :catchall_4
    move-exception v0

    .line 724
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 725
    .line 726
    .line 727
    move-result-object v14

    .line 728
    :goto_15
    return-object v14

    .line 729
    :catch_4
    move-exception v0

    .line 730
    throw v0

    .line 731
    :pswitch_4
    instance-of v3, v2, Lce2;

    .line 732
    .line 733
    if-eqz v3, :cond_24

    .line 734
    .line 735
    move-object v3, v2

    .line 736
    check-cast v3, Lce2;

    .line 737
    .line 738
    iget v4, v3, Lce2;->m:I

    .line 739
    .line 740
    and-int v6, v4, v19

    .line 741
    .line 742
    if-eqz v6, :cond_24

    .line 743
    .line 744
    sub-int v4, v4, v19

    .line 745
    .line 746
    iput v4, v3, Lce2;->m:I

    .line 747
    .line 748
    goto :goto_16

    .line 749
    :cond_24
    new-instance v3, Lce2;

    .line 750
    .line 751
    check-cast v2, Lu00;

    .line 752
    .line 753
    invoke-direct {v3, v0, v2}, Lce2;-><init>(Lyd2;Lu00;)V

    .line 754
    .line 755
    .line 756
    :goto_16
    iget-object v0, v3, Lce2;->k:Ljava/lang/Object;

    .line 757
    .line 758
    iget v2, v3, Lce2;->m:I

    .line 759
    .line 760
    if-eqz v2, :cond_26

    .line 761
    .line 762
    if-ne v2, v11, :cond_25

    .line 763
    .line 764
    :try_start_b
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 765
    .line 766
    .line 767
    goto :goto_17

    .line 768
    :cond_25
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    move-object v14, v13

    .line 772
    goto :goto_18

    .line 773
    :cond_26
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    const/4 v2, 0x3

    .line 777
    :try_start_c
    invoke-static {v2, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    const/16 v18, 0x2

    .line 781
    .line 782
    aget-object v0, v1, v18

    .line 783
    .line 784
    instance-of v2, v0, Ljava/util/List;

    .line 785
    .line 786
    if-eqz v2, :cond_27

    .line 787
    .line 788
    move-object v13, v0

    .line 789
    check-cast v13, Ljava/util/List;

    .line 790
    .line 791
    :cond_27
    if-eqz v13, :cond_29

    .line 792
    .line 793
    aget-object v0, v1, v16

    .line 794
    .line 795
    invoke-static {v9, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    aget-object v1, v1, v11

    .line 800
    .line 801
    invoke-static {v5, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    iput v11, v3, Lce2;->m:I

    .line 806
    .line 807
    invoke-virtual {v15, v0, v1, v13, v3}, Lvn1;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    if-ne v0, v14, :cond_28

    .line 812
    .line 813
    goto :goto_18

    .line 814
    :cond_28
    :goto_17
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 815
    .line 816
    .line 817
    move-result-object v14

    .line 818
    goto :goto_18

    .line 819
    :cond_29
    new-instance v1, Lsd2;

    .line 820
    .line 821
    const-string v2, "INVALID_ARGUMENT"

    .line 822
    .line 823
    const-string v3, "arguments must be an array."

    .line 824
    .line 825
    const/4 v6, 0x0

    .line 826
    const/16 v7, 0x1c

    .line 827
    .line 828
    const/4 v4, 0x0

    .line 829
    const/4 v5, 0x0

    .line 830
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 831
    .line 832
    .line 833
    throw v1
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 834
    :catchall_5
    move-exception v0

    .line 835
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 836
    .line 837
    .line 838
    move-result-object v14

    .line 839
    :goto_18
    return-object v14

    .line 840
    :catch_5
    move-exception v0

    .line 841
    throw v0

    .line 842
    :pswitch_5
    instance-of v3, v2, Lbe2;

    .line 843
    .line 844
    if-eqz v3, :cond_2a

    .line 845
    .line 846
    move-object v3, v2

    .line 847
    check-cast v3, Lbe2;

    .line 848
    .line 849
    iget v4, v3, Lbe2;->m:I

    .line 850
    .line 851
    and-int v5, v4, v19

    .line 852
    .line 853
    if-eqz v5, :cond_2a

    .line 854
    .line 855
    sub-int v4, v4, v19

    .line 856
    .line 857
    iput v4, v3, Lbe2;->m:I

    .line 858
    .line 859
    goto :goto_19

    .line 860
    :cond_2a
    new-instance v3, Lbe2;

    .line 861
    .line 862
    check-cast v2, Lu00;

    .line 863
    .line 864
    invoke-direct {v3, v0, v2}, Lbe2;-><init>(Lyd2;Lu00;)V

    .line 865
    .line 866
    .line 867
    :goto_19
    iget-object v0, v3, Lbe2;->k:Ljava/lang/Object;

    .line 868
    .line 869
    iget v2, v3, Lbe2;->m:I

    .line 870
    .line 871
    if-eqz v2, :cond_2c

    .line 872
    .line 873
    if-ne v2, v11, :cond_2b

    .line 874
    .line 875
    :try_start_d
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 876
    .line 877
    .line 878
    goto :goto_1a

    .line 879
    :cond_2b
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    move-object v14, v13

    .line 883
    goto :goto_1b

    .line 884
    :cond_2c
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    const/4 v0, 0x2

    .line 888
    :try_start_e
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    aget-object v0, v1, v16

    .line 892
    .line 893
    invoke-static {v9, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    aget-object v1, v1, v11

    .line 898
    .line 899
    const-string v2, "field"

    .line 900
    .line 901
    invoke-static {v2, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    iput v11, v3, Lbe2;->m:I

    .line 906
    .line 907
    invoke-virtual {v15, v0, v1, v3}, Lvn1;->s(Ljava/lang/String;Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    if-ne v0, v14, :cond_2d

    .line 912
    .line 913
    goto :goto_1b

    .line 914
    :cond_2d
    :goto_1a
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 915
    .line 916
    .line 917
    move-result-object v14
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 918
    goto :goto_1b

    .line 919
    :catchall_6
    move-exception v0

    .line 920
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 921
    .line 922
    .line 923
    move-result-object v14

    .line 924
    :goto_1b
    return-object v14

    .line 925
    :catch_6
    move-exception v0

    .line 926
    throw v0

    .line 927
    :pswitch_6
    instance-of v3, v2, Lae2;

    .line 928
    .line 929
    if-eqz v3, :cond_2e

    .line 930
    .line 931
    move-object v3, v2

    .line 932
    check-cast v3, Lae2;

    .line 933
    .line 934
    iget v6, v3, Lae2;->m:I

    .line 935
    .line 936
    and-int v7, v6, v19

    .line 937
    .line 938
    if-eqz v7, :cond_2e

    .line 939
    .line 940
    sub-int v6, v6, v19

    .line 941
    .line 942
    iput v6, v3, Lae2;->m:I

    .line 943
    .line 944
    goto :goto_1c

    .line 945
    :cond_2e
    new-instance v3, Lae2;

    .line 946
    .line 947
    check-cast v2, Lu00;

    .line 948
    .line 949
    invoke-direct {v3, v0, v2}, Lae2;-><init>(Lyd2;Lu00;)V

    .line 950
    .line 951
    .line 952
    :goto_1c
    iget-object v0, v3, Lae2;->k:Ljava/lang/Object;

    .line 953
    .line 954
    iget v2, v3, Lae2;->m:I

    .line 955
    .line 956
    if-eqz v2, :cond_30

    .line 957
    .line 958
    if-ne v2, v11, :cond_2f

    .line 959
    .line 960
    :try_start_f
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 961
    .line 962
    .line 963
    goto :goto_1d

    .line 964
    :cond_2f
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    move-object v14, v13

    .line 968
    goto :goto_1e

    .line 969
    :cond_30
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    const/4 v2, 0x3

    .line 973
    :try_start_10
    invoke-static {v2, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    const/16 v18, 0x2

    .line 977
    .line 978
    aget-object v0, v1, v18

    .line 979
    .line 980
    instance-of v2, v0, Ljava/util/List;

    .line 981
    .line 982
    if-eqz v2, :cond_31

    .line 983
    .line 984
    move-object v13, v0

    .line 985
    check-cast v13, Ljava/util/List;

    .line 986
    .line 987
    :cond_31
    if-eqz v13, :cond_33

    .line 988
    .line 989
    aget-object v0, v1, v16

    .line 990
    .line 991
    invoke-static {v4, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    aget-object v1, v1, v11

    .line 996
    .line 997
    invoke-static {v5, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    iput v11, v3, Lae2;->m:I

    .line 1002
    .line 1003
    invoke-virtual {v15, v0, v1, v13, v3}, Lvn1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    if-ne v0, v14, :cond_32

    .line 1008
    .line 1009
    goto :goto_1e

    .line 1010
    :cond_32
    :goto_1d
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v14

    .line 1014
    goto :goto_1e

    .line 1015
    :cond_33
    new-instance v1, Lsd2;

    .line 1016
    .line 1017
    const-string v2, "INVALID_ARGUMENT"

    .line 1018
    .line 1019
    const-string v3, "arguments must be an array."

    .line 1020
    .line 1021
    const/4 v6, 0x0

    .line 1022
    const/16 v7, 0x1c

    .line 1023
    .line 1024
    const/4 v4, 0x0

    .line 1025
    const/4 v5, 0x0

    .line 1026
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 1027
    .line 1028
    .line 1029
    throw v1
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 1030
    :catchall_7
    move-exception v0

    .line 1031
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v14

    .line 1035
    :goto_1e
    return-object v14

    .line 1036
    :catch_7
    move-exception v0

    .line 1037
    throw v0

    .line 1038
    :pswitch_7
    instance-of v3, v2, Lzd2;

    .line 1039
    .line 1040
    if-eqz v3, :cond_34

    .line 1041
    .line 1042
    move-object v3, v2

    .line 1043
    check-cast v3, Lzd2;

    .line 1044
    .line 1045
    iget v5, v3, Lzd2;->m:I

    .line 1046
    .line 1047
    and-int v6, v5, v19

    .line 1048
    .line 1049
    if-eqz v6, :cond_34

    .line 1050
    .line 1051
    sub-int v5, v5, v19

    .line 1052
    .line 1053
    iput v5, v3, Lzd2;->m:I

    .line 1054
    .line 1055
    goto :goto_1f

    .line 1056
    :cond_34
    new-instance v3, Lzd2;

    .line 1057
    .line 1058
    check-cast v2, Lu00;

    .line 1059
    .line 1060
    invoke-direct {v3, v0, v2}, Lzd2;-><init>(Lyd2;Lu00;)V

    .line 1061
    .line 1062
    .line 1063
    :goto_1f
    iget-object v0, v3, Lzd2;->k:Ljava/lang/Object;

    .line 1064
    .line 1065
    iget v2, v3, Lzd2;->m:I

    .line 1066
    .line 1067
    if-eqz v2, :cond_36

    .line 1068
    .line 1069
    if-ne v2, v11, :cond_35

    .line 1070
    .line 1071
    :try_start_11
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/util/concurrent/CancellationException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1072
    .line 1073
    .line 1074
    goto :goto_20

    .line 1075
    :cond_35
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    move-object v14, v13

    .line 1079
    goto :goto_21

    .line 1080
    :cond_36
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    const/4 v0, 0x2

    .line 1084
    :try_start_12
    invoke-static {v0, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    aget-object v0, v1, v16

    .line 1088
    .line 1089
    invoke-static {v4, v0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    aget-object v1, v1, v11

    .line 1094
    .line 1095
    const-string v2, "property"

    .line 1096
    .line 1097
    invoke-static {v2, v1}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v1

    .line 1101
    iput v11, v3, Lzd2;->m:I

    .line 1102
    .line 1103
    invoke-virtual {v15, v0, v1, v3}, Lvn1;->l(Ljava/lang/String;Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    if-ne v0, v14, :cond_37

    .line 1108
    .line 1109
    goto :goto_21

    .line 1110
    :cond_37
    :goto_20
    invoke-static {v0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v14
    :try_end_12
    .catch Ljava/util/concurrent/CancellationException; {:try_start_12 .. :try_end_12} :catch_8
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 1114
    goto :goto_21

    .line 1115
    :catchall_8
    move-exception v0

    .line 1116
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v14

    .line 1120
    :goto_21
    return-object v14

    .line 1121
    :catch_8
    move-exception v0

    .line 1122
    throw v0

    .line 1123
    :pswitch_8
    instance-of v3, v2, Lxd2;

    .line 1124
    .line 1125
    if-eqz v3, :cond_38

    .line 1126
    .line 1127
    move-object v3, v2

    .line 1128
    check-cast v3, Lxd2;

    .line 1129
    .line 1130
    iget v4, v3, Lxd2;->m:I

    .line 1131
    .line 1132
    and-int v5, v4, v19

    .line 1133
    .line 1134
    if-eqz v5, :cond_38

    .line 1135
    .line 1136
    sub-int v4, v4, v19

    .line 1137
    .line 1138
    iput v4, v3, Lxd2;->m:I

    .line 1139
    .line 1140
    goto :goto_22

    .line 1141
    :cond_38
    new-instance v3, Lxd2;

    .line 1142
    .line 1143
    check-cast v2, Lu00;

    .line 1144
    .line 1145
    invoke-direct {v3, v0, v2}, Lxd2;-><init>(Lyd2;Lu00;)V

    .line 1146
    .line 1147
    .line 1148
    :goto_22
    iget-object v0, v3, Lxd2;->k:Ljava/lang/Object;

    .line 1149
    .line 1150
    iget v2, v3, Lxd2;->m:I

    .line 1151
    .line 1152
    if-eqz v2, :cond_3a

    .line 1153
    .line 1154
    if-ne v2, v11, :cond_39

    .line 1155
    .line 1156
    :try_start_13
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_13
    .catch Ljava/util/concurrent/CancellationException; {:try_start_13 .. :try_end_13} :catch_9
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1157
    .line 1158
    .line 1159
    goto :goto_23

    .line 1160
    :cond_39
    invoke-static/range {v17 .. v17}, Ls;->l(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    move-object v14, v13

    .line 1164
    goto :goto_24

    .line 1165
    :cond_3a
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    :try_start_14
    invoke-static {v11, v1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 1169
    .line 1170
    .line 1171
    aget-object v0, v1, v16

    .line 1172
    .line 1173
    invoke-static {v0}, Lgf1;->J(Ljava/lang/Object;)Lbg2;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    iput v11, v3, Lxd2;->m:I

    .line 1178
    .line 1179
    new-instance v1, Lmb;

    .line 1180
    .line 1181
    const/4 v2, 0x2

    .line 1182
    invoke-direct {v1, v15, v0, v13, v2}, Lmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v15, v1, v3}, Lvn1;->d(Lin0;Lu00;)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    if-ne v0, v14, :cond_3b

    .line 1190
    .line 1191
    goto :goto_24

    .line 1192
    :cond_3b
    :goto_23
    if-nez v0, :cond_3c

    .line 1193
    .line 1194
    throw v13

    .line 1195
    :cond_3c
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1196
    .line 1197
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    throw v0
    :try_end_14
    .catch Ljava/util/concurrent/CancellationException; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 1201
    :catchall_9
    move-exception v0

    .line 1202
    invoke-static {v0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v14

    .line 1206
    :goto_24
    return-object v14

    .line 1207
    :catch_9
    move-exception v0

    .line 1208
    throw v0

    .line 1209
    :pswitch_data_0
    .packed-switch 0x0
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
