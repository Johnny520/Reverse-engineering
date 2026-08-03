.class public abstract Ljf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ljf/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ljf/a;->a:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 12

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_a

    .line 8
    .line 9
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_11

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lnc/b;

    .line 24
    .line 25
    iget v2, v1, Lnc/b;->a:I

    .line 26
    .line 27
    iget-object v3, v1, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    if-ne v2, v4, :cond_1

    .line 31
    .line 32
    iget-object v2, v1, Lnc/b;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, -0x1

    .line 44
    sparse-switch v5, :sswitch_data_0

    .line 45
    .line 46
    .line 47
    :goto_1
    move v4, v8

    .line 48
    goto :goto_2

    .line 49
    :sswitch_0
    const-string v4, "Ldalvik/annotation/Signature;"

    .line 50
    .line 51
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v4, 0x4

    .line 59
    goto :goto_2

    .line 60
    :sswitch_1
    const-string v5, "Ldalvik/annotation/MethodParameters;"

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :sswitch_2
    const-string v4, "Ldalvik/annotation/Throws;"

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v4, 0x2

    .line 79
    goto :goto_2

    .line 80
    :sswitch_3
    const-string v4, "Ldalvik/annotation/AnnotationDefault;"

    .line 81
    .line 82
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move v4, v7

    .line 90
    goto :goto_2

    .line 91
    :sswitch_4
    const-string v4, "Ldalvik/annotation/InnerClass;"

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move v4, v6

    .line 101
    :cond_6
    :goto_2
    const-string v2, "value"

    .line 102
    .line 103
    const-string v5, "Failed to parse annotation: {}"

    .line 104
    .line 105
    const-string v8, "accessFlags"

    .line 106
    .line 107
    sget-object v9, Ljf/a;->a:Lmh/b;

    .line 108
    .line 109
    packed-switch v4, :pswitch_data_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_0
    new-instance v1, Lpc/j;

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lnc/a;

    .line 120
    .line 121
    iget-object v2, v2, Lnc/a;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-ne v3, v7, :cond_7

    .line 130
    .line 131
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lnc/a;

    .line 136
    .line 137
    iget-object v2, v2, Lnc/a;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_8

    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Lnc/a;

    .line 162
    .line 163
    iget-object v4, v4, Lnc/a;->h:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :goto_4
    invoke-direct {v1, v2}, Lpc/j;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_1
    :try_start_0
    const-string v2, "names"

    .line 184
    .line 185
    invoke-static {v1, v2}, La/a;->R(Lnc/b;Ljava/lang/String;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {v1, v8}, La/a;->R(Lnc/b;Ljava/lang/String;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_1

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-ne v4, v7, :cond_1

    .line 208
    .line 209
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    new-instance v7, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    :goto_5
    if-ge v6, v4, :cond_9

    .line 219
    .line 220
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    check-cast v8, Lnc/a;

    .line 225
    .line 226
    iget-object v8, v8, Lnc/a;->h:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v8, Ljava/lang/String;

    .line 229
    .line 230
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    check-cast v10, Lnc/a;

    .line 235
    .line 236
    iget-object v10, v10, Lnc/a;->h:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v10, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    new-instance v11, Lpc/h;

    .line 245
    .line 246
    invoke-direct {v11, v10, v8}, Lpc/h;-><init>(ILjava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :catch_0
    move-exception v2

    .line 256
    goto :goto_6

    .line 257
    :cond_9
    new-instance v2, Lpc/i;

    .line 258
    .line 259
    invoke-direct {v2, v7}, Lpc/i;-><init>(Ljava/util/ArrayList;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :goto_6
    invoke-interface {v9, v1, v5, v2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :pswitch_2
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Lnc/a;

    .line 277
    .line 278
    if-eqz v1, :cond_1

    .line 279
    .line 280
    iget-object v1, v1, Lnc/a;->h:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v1, Ljava/util/List;

    .line 283
    .line 284
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    new-instance v2, Lcom/alibaba/fastjson2/writer/b;

    .line 289
    .line 290
    const/16 v3, 0x18

    .line 291
    .line 292
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, Ljava/util/List;

    .line 308
    .line 309
    new-instance v2, Lpc/e;

    .line 310
    .line 311
    invoke-direct {v2, v1}, Lpc/e;-><init>(Ljava/util/List;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 315
    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :catch_1
    move-exception v1

    .line 320
    invoke-interface {v9, v1}, Lmh/b;->u(Ljava/lang/Exception;)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :pswitch_3
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, Lnc/a;

    .line 330
    .line 331
    if-eqz v1, :cond_1

    .line 332
    .line 333
    iget v2, v1, Lnc/a;->g:I

    .line 334
    .line 335
    const/16 v3, 0x12

    .line 336
    .line 337
    if-ne v2, v3, :cond_1

    .line 338
    .line 339
    iget-object v1, v1, Lnc/a;->h:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v1, Lnc/b;

    .line 342
    .line 343
    new-instance v2, Lpc/b;

    .line 344
    .line 345
    iget-object v1, v1, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 346
    .line 347
    invoke-direct {v2, v1}, Lpc/b;-><init>(Ljava/util/LinkedHashMap;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :pswitch_4
    :try_start_2
    const-string v2, "name"

    .line 356
    .line 357
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-eqz v4, :cond_a

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_a
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Lnc/a;

    .line 369
    .line 370
    if-eqz v2, :cond_c

    .line 371
    .line 372
    iget v4, v2, Lnc/a;->g:I

    .line 373
    .line 374
    const/16 v7, 0xa

    .line 375
    .line 376
    if-eq v4, v7, :cond_b

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_b
    iget-object v2, v2, Lnc/a;->h:Ljava/lang/Object;

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_c
    :goto_7
    const/4 v2, 0x0

    .line 383
    :goto_8
    check-cast v2, Ljava/lang/String;

    .line 384
    .line 385
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    if-eqz v6, :cond_d

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_d
    invoke-virtual {v3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    check-cast v3, Lnc/a;

    .line 401
    .line 402
    if-eqz v3, :cond_f

    .line 403
    .line 404
    iget v6, v3, Lnc/a;->g:I

    .line 405
    .line 406
    const/4 v7, 0x6

    .line 407
    if-eq v6, v7, :cond_e

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_e
    iget-object v4, v3, Lnc/a;->h:Ljava/lang/Object;

    .line 411
    .line 412
    :cond_f
    :goto_9
    check-cast v4, Ljava/lang/Integer;

    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-nez v2, :cond_10

    .line 419
    .line 420
    if-eqz v3, :cond_1

    .line 421
    .line 422
    :cond_10
    new-instance v4, Lpc/g;

    .line 423
    .line 424
    invoke-direct {v4, v3, p0, v2}, Lpc/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    new-instance v2, Lpc/f;

    .line 428
    .line 429
    invoke-static {p0, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-direct {v2, v3}, Lpc/f;-><init>(Ljava/util/Map;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 437
    .line 438
    .line 439
    goto/16 :goto_0

    .line 440
    .line 441
    :catch_2
    move-exception v2

    .line 442
    invoke-interface {v9, v1, v5, v2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :cond_11
    invoke-static {p2}, Lpc/d;->b(Ljava/util/List;)Lpc/d;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    if-eqz p0, :cond_12

    .line 452
    .line 453
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    :cond_12
    :goto_a
    return-void

    .line 457
    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_4
        -0x41d6d9b1 -> :sswitch_3
        -0x33317c98 -> :sswitch_2
        0x4fcf134a -> :sswitch_1
        0x63354869 -> :sswitch_0
    .end sparse-switch

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
