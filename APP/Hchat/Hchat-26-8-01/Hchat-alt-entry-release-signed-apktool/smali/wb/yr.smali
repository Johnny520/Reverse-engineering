.class public final synthetic Lwb/yr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lfb/p1;

.field public final synthetic i:Lwb/wt;

.field public final synthetic j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lfb/p1;Lwb/wt;Ljava/util/concurrent/atomic/AtomicInteger;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/yr;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/yr;->h:Lfb/p1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/yr;->i:Lwb/wt;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/yr;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/yr;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/yr;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/yr;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/yr;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/yr;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/yr;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/yr;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/yr;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/yr;->s:Li0/a1;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lwb/yr;->k:Li0/a1;

    .line 4
    .line 5
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lwb/yr;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v9, v0

    .line 20
    goto/16 :goto_29

    .line 21
    .line 22
    :cond_1
    iget-object v1, v0, Lwb/yr;->h:Lfb/p1;

    .line 23
    .line 24
    iget-object v2, v1, Lfb/p1;->e:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, v1, Lfb/p1;->g:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, v1, Lfb/p1;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, v1, Lfb/p1;->n:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v6, v1, Lfb/p1;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    iget-object v8, v0, Lwb/yr;->i:Lwb/wt;

    .line 39
    .line 40
    iget-object v9, v0, Lwb/yr;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    iget-object v10, v0, Lwb/yr;->n:Li0/a1;

    .line 43
    .line 44
    iget-object v11, v0, Lwb/yr;->p:Li0/a1;

    .line 45
    .line 46
    iget-object v12, v0, Lwb/yr;->r:Li0/a1;

    .line 47
    .line 48
    const-string v13, "tool_start"

    .line 49
    .line 50
    const-string v14, "streaming"

    .line 51
    .line 52
    const-string v15, "assistant"

    .line 53
    .line 54
    move/from16 v17, v7

    .line 55
    .line 56
    move-object/from16 v18, v6

    .line 57
    .line 58
    sparse-switch v17, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    :goto_0
    move-object v6, v1

    .line 62
    move-object v7, v8

    .line 63
    move-object v0, v9

    .line 64
    move-object v1, v11

    .line 65
    const/4 v8, -0x1

    .line 66
    const/4 v14, 0x0

    .line 67
    goto/16 :goto_20

    .line 68
    .line 69
    :sswitch_0
    const-string v5, "working"

    .line 70
    .line 71
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_1
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :sswitch_2
    const-string v5, "tool_update"

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_2

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iget-object v2, v1, Lfb/p1;->d:Ljava/util/List;

    .line 95
    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    invoke-static {v2}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Lfb/q1;

    .line 103
    .line 104
    if-eqz v2, :cond_0

    .line 105
    .line 106
    iget-object v4, v2, Lfb/q1;->k:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v5, v2, Lfb/q1;->o:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v10, v2, Lfb/q1;->g:Ljava/lang/String;

    .line 111
    .line 112
    const/16 v17, 0x1

    .line 113
    .line 114
    iget-object v7, v1, Lfb/p1;->e:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v7, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_5

    .line 127
    .line 128
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    check-cast v7, Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    invoke-interface {v7, v13}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    :cond_3
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    if-eqz v13, :cond_4

    .line 147
    .line 148
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    check-cast v13, Lfb/c;

    .line 153
    .line 154
    iget-object v6, v13, Lfb/c;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v6, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_3

    .line 161
    .line 162
    iget-object v6, v13, Lfb/c;->q:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v6, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_3

    .line 169
    .line 170
    invoke-interface {v7}, Ljava/util/ListIterator;->nextIndex()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    const/4 v3, -0x1

    .line 176
    goto :goto_1

    .line 177
    :cond_5
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    :goto_1
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Ljava/util/List;

    .line 186
    .line 187
    invoke-static {v3, v6}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Lfb/c;

    .line 192
    .line 193
    if-eqz v6, :cond_9

    .line 194
    .line 195
    iget-object v7, v6, Lfb/c;->b:Ljava/lang/String;

    .line 196
    .line 197
    iget-object v13, v6, Lfb/c;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v13, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v13

    .line 203
    if-eqz v13, :cond_9

    .line 204
    .line 205
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    check-cast v13, Ljava/util/List;

    .line 210
    .line 211
    invoke-static {v13}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    add-int/lit8 v15, v15, -0x1

    .line 220
    .line 221
    if-ne v3, v15, :cond_8

    .line 222
    .line 223
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    if-nez v15, :cond_7

    .line 228
    .line 229
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    const-string v15, "\u51c6\u5907\u8c03\u7528"

    .line 238
    .line 239
    move-object/from16 v37, v14

    .line 240
    .line 241
    const/4 v14, 0x0

    .line 242
    invoke-static {v7, v15, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-eqz v7, :cond_6

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    move-object/from16 v20, v6

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_7
    move-object/from16 v37, v14

    .line 253
    .line 254
    :goto_2
    iget-object v7, v6, Lfb/c;->i:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_6

    .line 261
    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 263
    .line 264
    .line 265
    move-result-wide v34

    .line 266
    const/16 v33, 0x0

    .line 267
    .line 268
    const v36, 0x1dfdd

    .line 269
    .line 270
    .line 271
    const-string v21, ""

    .line 272
    .line 273
    const/16 v22, 0x0

    .line 274
    .line 275
    const/16 v23, 0x0

    .line 276
    .line 277
    const/16 v24, 0x0

    .line 278
    .line 279
    const-string v25, "assistant_tool_call"

    .line 280
    .line 281
    const/16 v26, 0x0

    .line 282
    .line 283
    const/16 v27, 0x0

    .line 284
    .line 285
    const/16 v28, 0x0

    .line 286
    .line 287
    const/16 v29, 0x0

    .line 288
    .line 289
    const-string v30, "complete"

    .line 290
    .line 291
    const/16 v31, 0x0

    .line 292
    .line 293
    const/16 v32, 0x0

    .line 294
    .line 295
    move-object/from16 v20, v6

    .line 296
    .line 297
    invoke-static/range {v20 .. v36}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {v13, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_8
    move-object/from16 v20, v6

    .line 306
    .line 307
    move-object/from16 v37, v14

    .line 308
    .line 309
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 310
    .line 311
    .line 312
    move-result-wide v34

    .line 313
    const v36, 0x1dfff

    .line 314
    .line 315
    .line 316
    const/16 v21, 0x0

    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/16 v23, 0x0

    .line 321
    .line 322
    const/16 v24, 0x0

    .line 323
    .line 324
    const/16 v25, 0x0

    .line 325
    .line 326
    const/16 v26, 0x0

    .line 327
    .line 328
    const/16 v27, 0x0

    .line 329
    .line 330
    const/16 v28, 0x0

    .line 331
    .line 332
    const/16 v29, 0x0

    .line 333
    .line 334
    const-string v30, "complete"

    .line 335
    .line 336
    const/16 v31, 0x0

    .line 337
    .line 338
    const/16 v32, 0x0

    .line 339
    .line 340
    const/16 v33, 0x0

    .line 341
    .line 342
    invoke-static/range {v20 .. v36}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-virtual {v13, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    :goto_4
    invoke-interface {v11, v13}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    :goto_5
    const/4 v3, -0x1

    .line 353
    goto :goto_6

    .line 354
    :cond_9
    move-object/from16 v37, v14

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :goto_6
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_a
    move-object/from16 v37, v14

    .line 362
    .line 363
    :goto_7
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    invoke-interface {v3, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    :cond_b
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-eqz v6, :cond_f

    .line 382
    .line 383
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    check-cast v6, Lfb/c;

    .line 388
    .line 389
    iget-object v7, v6, Lfb/c;->a:Ljava/lang/String;

    .line 390
    .line 391
    const-string v9, "tool"

    .line 392
    .line 393
    invoke-static {v7, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    if-eqz v7, :cond_b

    .line 398
    .line 399
    iget-object v7, v6, Lfb/c;->j:Ljava/util/List;

    .line 400
    .line 401
    if-eqz v7, :cond_c

    .line 402
    .line 403
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    if-eqz v9, :cond_c

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_c
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v9

    .line 418
    if-eqz v9, :cond_e

    .line 419
    .line 420
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    check-cast v9, Lfb/q1;

    .line 425
    .line 426
    iget-object v9, v9, Lfb/q1;->a:Ljava/lang/String;

    .line 427
    .line 428
    iget-object v13, v1, Lfb/p1;->f:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-eqz v9, :cond_d

    .line 435
    .line 436
    goto :goto_9

    .line 437
    :cond_e
    :goto_8
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-nez v7, :cond_b

    .line 442
    .line 443
    iget-object v7, v6, Lfb/c;->d:Ljava/lang/String;

    .line 444
    .line 445
    invoke-static {v7, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    if-eqz v7, :cond_b

    .line 450
    .line 451
    iget-object v6, v6, Lfb/c;->e:Ljava/lang/String;

    .line 452
    .line 453
    invoke-static {v6, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v6

    .line 457
    if-eqz v6, :cond_b

    .line 458
    .line 459
    :goto_9
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    goto :goto_a

    .line 464
    :cond_f
    const/4 v3, -0x1

    .line 465
    :goto_a
    const-string v6, "complete"

    .line 466
    .line 467
    const-string v7, "queued"

    .line 468
    .line 469
    const-string v9, "running"

    .line 470
    .line 471
    if-ltz v3, :cond_1e

    .line 472
    .line 473
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    check-cast v1, Ljava/util/List;

    .line 478
    .line 479
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    check-cast v5, Lfb/c;

    .line 488
    .line 489
    iget-object v13, v5, Lfb/c;->j:Ljava/util/List;

    .line 490
    .line 491
    invoke-static {v13}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    move-result-object v13

    .line 495
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v14

    .line 499
    const/4 v15, 0x0

    .line 500
    :goto_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v18

    .line 504
    if-eqz v18, :cond_11

    .line 505
    .line 506
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v18

    .line 510
    move-object/from16 v20, v6

    .line 511
    .line 512
    move-object/from16 v6, v18

    .line 513
    .line 514
    check-cast v6, Lfb/q1;

    .line 515
    .line 516
    iget-object v6, v6, Lfb/q1;->a:Ljava/lang/String;

    .line 517
    .line 518
    move-object/from16 v18, v14

    .line 519
    .line 520
    iget-object v14, v2, Lfb/q1;->a:Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {v6, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    if-eqz v6, :cond_10

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :cond_10
    add-int/lit8 v15, v15, 0x1

    .line 530
    .line 531
    move-object/from16 v14, v18

    .line 532
    .line 533
    move-object/from16 v6, v20

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_11
    move-object/from16 v20, v6

    .line 537
    .line 538
    const/4 v15, -0x1

    .line 539
    :goto_c
    if-ltz v15, :cond_12

    .line 540
    .line 541
    invoke-virtual {v13, v15, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    goto :goto_d

    .line 545
    :cond_12
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :goto_d
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 549
    .line 550
    .line 551
    move-result v6

    .line 552
    if-eqz v6, :cond_14

    .line 553
    .line 554
    :cond_13
    const/4 v6, 0x0

    .line 555
    goto :goto_e

    .line 556
    :cond_14
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v6

    .line 560
    :cond_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v14

    .line 564
    if-eqz v14, :cond_13

    .line 565
    .line 566
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v14

    .line 570
    check-cast v14, Lfb/q1;

    .line 571
    .line 572
    iget-object v15, v14, Lfb/q1;->g:Ljava/lang/String;

    .line 573
    .line 574
    invoke-virtual {v15, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v15

    .line 578
    if-nez v15, :cond_16

    .line 579
    .line 580
    iget-object v14, v14, Lfb/q1;->g:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v14, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v14

    .line 586
    if-eqz v14, :cond_15

    .line 587
    .line 588
    :cond_16
    move/from16 v6, v17

    .line 589
    .line 590
    :goto_e
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 591
    .line 592
    .line 593
    move-result v14

    .line 594
    if-eqz v14, :cond_17

    .line 595
    .line 596
    iget-object v4, v5, Lfb/c;->d:Ljava/lang/String;

    .line 597
    .line 598
    :cond_17
    move-object/from16 v23, v4

    .line 599
    .line 600
    iget-object v4, v2, Lfb/q1;->o:Ljava/lang/String;

    .line 601
    .line 602
    if-eqz v6, :cond_18

    .line 603
    .line 604
    move-object/from16 v30, v37

    .line 605
    .line 606
    goto :goto_f

    .line 607
    :cond_18
    move-object/from16 v30, v20

    .line 608
    .line 609
    :goto_f
    if-eqz v6, :cond_19

    .line 610
    .line 611
    const-wide/16 v14, 0x0

    .line 612
    .line 613
    move-object/from16 v24, v4

    .line 614
    .line 615
    move-object/from16 v18, v5

    .line 616
    .line 617
    :goto_10
    move-wide/from16 v34, v14

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_19
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v14

    .line 628
    if-nez v14, :cond_1b

    .line 629
    .line 630
    const/4 v15, 0x0

    .line 631
    :cond_1a
    move-object/from16 v24, v4

    .line 632
    .line 633
    move-object/from16 v18, v5

    .line 634
    .line 635
    goto :goto_12

    .line 636
    :cond_1b
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v14

    .line 640
    check-cast v14, Lfb/q1;

    .line 641
    .line 642
    iget-wide v14, v14, Lfb/q1;->i:J

    .line 643
    .line 644
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 645
    .line 646
    .line 647
    move-result-object v14

    .line 648
    move-object v15, v14

    .line 649
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v14

    .line 653
    if-eqz v14, :cond_1a

    .line 654
    .line 655
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v14

    .line 659
    check-cast v14, Lfb/q1;

    .line 660
    .line 661
    move-object/from16 v24, v4

    .line 662
    .line 663
    move-object/from16 v18, v5

    .line 664
    .line 665
    iget-wide v4, v14, Lfb/q1;->i:J

    .line 666
    .line 667
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    invoke-virtual {v15, v4}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-gez v5, :cond_1c

    .line 676
    .line 677
    move-object v15, v4

    .line 678
    :cond_1c
    move-object/from16 v5, v18

    .line 679
    .line 680
    move-object/from16 v4, v24

    .line 681
    .line 682
    goto :goto_11

    .line 683
    :goto_12
    if-eqz v15, :cond_1d

    .line 684
    .line 685
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 686
    .line 687
    .line 688
    move-result-wide v14

    .line 689
    goto :goto_10

    .line 690
    :cond_1d
    iget-wide v14, v2, Lfb/q1;->i:J

    .line 691
    .line 692
    goto :goto_10

    .line 693
    :goto_13
    const v36, 0x1ddc7

    .line 694
    .line 695
    .line 696
    const/16 v21, 0x0

    .line 697
    .line 698
    const/16 v22, 0x0

    .line 699
    .line 700
    const-string v25, "tool"

    .line 701
    .line 702
    const/16 v26, 0x0

    .line 703
    .line 704
    const/16 v27, 0x0

    .line 705
    .line 706
    const/16 v28, 0x0

    .line 707
    .line 708
    const/16 v31, 0x0

    .line 709
    .line 710
    const/16 v32, 0x0

    .line 711
    .line 712
    const/16 v33, 0x0

    .line 713
    .line 714
    move-object/from16 v29, v13

    .line 715
    .line 716
    move-object/from16 v20, v18

    .line 717
    .line 718
    invoke-static/range {v20 .. v36}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    invoke-interface {v11, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_16

    .line 729
    .line 730
    :cond_1e
    move-object/from16 v20, v6

    .line 731
    .line 732
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    check-cast v3, Ljava/util/List;

    .line 737
    .line 738
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    new-instance v6, Ljava/lang/StringBuilder;

    .line 742
    .line 743
    const-string v13, "tool-group:"

    .line 744
    .line 745
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    const-string v13, ":"

    .line 752
    .line 753
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v23

    .line 763
    iget-object v5, v2, Lfb/q1;->o:Ljava/lang/String;

    .line 764
    .line 765
    invoke-static {v2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v28

    .line 769
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v6

    .line 773
    if-nez v6, :cond_20

    .line 774
    .line 775
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v6

    .line 779
    if-eqz v6, :cond_1f

    .line 780
    .line 781
    goto :goto_14

    .line 782
    :cond_1f
    move-object/from16 v33, v20

    .line 783
    .line 784
    goto :goto_15

    .line 785
    :cond_20
    :goto_14
    move-object/from16 v33, v37

    .line 786
    .line 787
    :goto_15
    iget-wide v13, v2, Lfb/q1;->i:J

    .line 788
    .line 789
    iget-object v1, v1, Lfb/p1;->g:Ljava/lang/String;

    .line 790
    .line 791
    new-instance v20, Lfb/c;

    .line 792
    .line 793
    const/16 v35, 0x0

    .line 794
    .line 795
    const v39, 0xddc0

    .line 796
    .line 797
    .line 798
    const-string v21, "tool"

    .line 799
    .line 800
    const-string v22, ""

    .line 801
    .line 802
    const-string v26, "tool"

    .line 803
    .line 804
    const/16 v27, 0x0

    .line 805
    .line 806
    const/16 v29, 0x0

    .line 807
    .line 808
    const/16 v30, 0x0

    .line 809
    .line 810
    const-wide/16 v31, 0x0

    .line 811
    .line 812
    const/16 v34, 0x0

    .line 813
    .line 814
    move-object/from16 v36, v1

    .line 815
    .line 816
    move-object/from16 v24, v4

    .line 817
    .line 818
    move-object/from16 v25, v5

    .line 819
    .line 820
    move-wide/from16 v37, v13

    .line 821
    .line 822
    invoke-direct/range {v20 .. v39}, Lfb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;JI)V

    .line 823
    .line 824
    .line 825
    move-object/from16 v1, v20

    .line 826
    .line 827
    invoke-static {v3, v1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-interface {v11, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    check-cast v1, Ljava/util/List;

    .line 839
    .line 840
    invoke-static {v1}, La/a;->b0(Ljava/util/List;)I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    :goto_16
    invoke-static {v12, v3}, Lwb/y2;->T0(Li0/a1;I)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    if-nez v1, :cond_21

    .line 852
    .line 853
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v1

    .line 857
    if-nez v1, :cond_21

    .line 858
    .line 859
    move/from16 v6, v17

    .line 860
    .line 861
    goto :goto_17

    .line 862
    :cond_21
    const/4 v6, 0x0

    .line 863
    :goto_17
    invoke-virtual {v8, v6}, Lwb/wt;->b(Z)V

    .line 864
    .line 865
    .line 866
    return-void

    .line 867
    :sswitch_3
    const/16 v17, 0x1

    .line 868
    .line 869
    const-string v6, "checkpoint"

    .line 870
    .line 871
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    if-nez v2, :cond_22

    .line 876
    .line 877
    goto/16 :goto_0

    .line 878
    .line 879
    :cond_22
    iget-object v2, v1, Lfb/p1;->l:Lfb/c1;

    .line 880
    .line 881
    if-eqz v2, :cond_23

    .line 882
    .line 883
    iget-object v3, v0, Lwb/yr;->l:Li0/a1;

    .line 884
    .line 885
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    :cond_23
    iget-object v2, v1, Lfb/p1;->m:Ljava/lang/String;

    .line 889
    .line 890
    if-eqz v2, :cond_24

    .line 891
    .line 892
    iget-object v3, v0, Lwb/yr;->m:Li0/a1;

    .line 893
    .line 894
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    :cond_24
    if-eqz v5, :cond_25

    .line 898
    .line 899
    invoke-interface {v10, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    :cond_25
    iget-object v2, v1, Lfb/p1;->o:Ljava/lang/String;

    .line 903
    .line 904
    if-eqz v2, :cond_26

    .line 905
    .line 906
    iget-object v3, v0, Lwb/yr;->o:Li0/a1;

    .line 907
    .line 908
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    :cond_26
    iget-object v1, v1, Lfb/p1;->p:Ljava/lang/Integer;

    .line 912
    .line 913
    if-eqz v1, :cond_27

    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    check-cast v2, Ljava/util/List;

    .line 924
    .line 925
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    const/4 v14, 0x0

    .line 930
    invoke-static {v1, v14, v2}, Lr9/e0;->r(III)I

    .line 931
    .line 932
    .line 933
    move-result v1

    .line 934
    iget-object v2, v0, Lwb/yr;->q:Li0/a1;

    .line 935
    .line 936
    invoke-static {v2, v1}, Lwb/y2;->X0(Li0/a1;I)V

    .line 937
    .line 938
    .line 939
    :cond_27
    move/from16 v1, v17

    .line 940
    .line 941
    invoke-virtual {v8, v1}, Lwb/wt;->b(Z)V

    .line 942
    .line 943
    .line 944
    return-void

    .line 945
    :sswitch_4
    move-object/from16 v37, v14

    .line 946
    .line 947
    const/4 v14, 0x0

    .line 948
    const-string v5, "assistant_start"

    .line 949
    .line 950
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    if-nez v2, :cond_28

    .line 955
    .line 956
    move-object v6, v1

    .line 957
    move-object v7, v8

    .line 958
    move-object v0, v9

    .line 959
    move-object v1, v11

    .line 960
    :goto_18
    const/4 v8, -0x1

    .line 961
    goto/16 :goto_20

    .line 962
    .line 963
    :cond_28
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 964
    .line 965
    .line 966
    move-result v2

    .line 967
    if-nez v2, :cond_2b

    .line 968
    .line 969
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    check-cast v2, Ljava/util/List;

    .line 974
    .line 975
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    invoke-interface {v2, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    :cond_29
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 984
    .line 985
    .line 986
    move-result v4

    .line 987
    if-eqz v4, :cond_2a

    .line 988
    .line 989
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    check-cast v4, Lfb/c;

    .line 994
    .line 995
    iget-object v5, v4, Lfb/c;->a:Ljava/lang/String;

    .line 996
    .line 997
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v5

    .line 1001
    if-eqz v5, :cond_29

    .line 1002
    .line 1003
    iget-object v4, v4, Lfb/c;->q:Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v4

    .line 1009
    if-eqz v4, :cond_29

    .line 1010
    .line 1011
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    .line 1012
    .line 1013
    .line 1014
    move-result v7

    .line 1015
    goto :goto_19

    .line 1016
    :cond_2a
    const/4 v7, -0x1

    .line 1017
    goto :goto_19

    .line 1018
    :cond_2b
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1019
    .line 1020
    .line 1021
    move-result v7

    .line 1022
    :goto_19
    if-ltz v7, :cond_2c

    .line 1023
    .line 1024
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    check-cast v2, Ljava/util/List;

    .line 1029
    .line 1030
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1031
    .line 1032
    .line 1033
    move-result v2

    .line 1034
    if-ge v7, v2, :cond_2c

    .line 1035
    .line 1036
    goto/16 :goto_1b

    .line 1037
    .line 1038
    :cond_2c
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v4

    .line 1046
    check-cast v4, Ljava/util/List;

    .line 1047
    .line 1048
    invoke-static {v2, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    check-cast v4, Lfb/c;

    .line 1053
    .line 1054
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    check-cast v5, Ljava/util/List;

    .line 1059
    .line 1060
    invoke-static {v5}, La/a;->b0(Ljava/util/List;)I

    .line 1061
    .line 1062
    .line 1063
    move-result v5

    .line 1064
    if-ne v2, v5, :cond_2e

    .line 1065
    .line 1066
    if-eqz v4, :cond_2d

    .line 1067
    .line 1068
    iget-object v5, v4, Lfb/c;->a:Ljava/lang/String;

    .line 1069
    .line 1070
    goto :goto_1a

    .line 1071
    :cond_2d
    const/4 v5, 0x0

    .line 1072
    :goto_1a
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v5

    .line 1076
    if-eqz v5, :cond_2e

    .line 1077
    .line 1078
    iget-object v5, v4, Lfb/c;->n:Ljava/lang/String;

    .line 1079
    .line 1080
    move-object/from16 v6, v37

    .line 1081
    .line 1082
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v5

    .line 1086
    if-eqz v5, :cond_2f

    .line 1087
    .line 1088
    iget-object v5, v4, Lfb/c;->q:Ljava/lang/String;

    .line 1089
    .line 1090
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v5

    .line 1094
    if-eqz v5, :cond_2f

    .line 1095
    .line 1096
    iget-object v5, v4, Lfb/c;->b:Ljava/lang/String;

    .line 1097
    .line 1098
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v5

    .line 1102
    if-eqz v5, :cond_2f

    .line 1103
    .line 1104
    iget-object v5, v4, Lfb/c;->h:Ljava/lang/String;

    .line 1105
    .line 1106
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v5

    .line 1110
    if-eqz v5, :cond_2f

    .line 1111
    .line 1112
    iget-object v4, v4, Lfb/c;->j:Ljava/util/List;

    .line 1113
    .line 1114
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v4

    .line 1118
    if-eqz v4, :cond_2f

    .line 1119
    .line 1120
    move v7, v2

    .line 1121
    goto :goto_1b

    .line 1122
    :cond_2e
    move-object/from16 v6, v37

    .line 1123
    .line 1124
    :cond_2f
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v4

    .line 1132
    check-cast v4, Ljava/util/List;

    .line 1133
    .line 1134
    invoke-static {v2, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v4

    .line 1138
    check-cast v4, Lfb/c;

    .line 1139
    .line 1140
    if-eqz v4, :cond_30

    .line 1141
    .line 1142
    iget-object v5, v4, Lfb/c;->a:Ljava/lang/String;

    .line 1143
    .line 1144
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v5

    .line 1148
    if-eqz v5, :cond_30

    .line 1149
    .line 1150
    iget-object v5, v4, Lfb/c;->n:Ljava/lang/String;

    .line 1151
    .line 1152
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v5

    .line 1156
    if-eqz v5, :cond_30

    .line 1157
    .line 1158
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v5

    .line 1162
    check-cast v5, Ljava/util/List;

    .line 1163
    .line 1164
    invoke-static {v5}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v5

    .line 1168
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v30

    .line 1172
    const v32, 0x1dfff

    .line 1173
    .line 1174
    .line 1175
    const/16 v17, 0x0

    .line 1176
    .line 1177
    const/16 v18, 0x0

    .line 1178
    .line 1179
    const/16 v19, 0x0

    .line 1180
    .line 1181
    const/16 v20, 0x0

    .line 1182
    .line 1183
    const/16 v21, 0x0

    .line 1184
    .line 1185
    const/16 v22, 0x0

    .line 1186
    .line 1187
    const/16 v23, 0x0

    .line 1188
    .line 1189
    const/16 v24, 0x0

    .line 1190
    .line 1191
    const/16 v25, 0x0

    .line 1192
    .line 1193
    const-string v26, "complete"

    .line 1194
    .line 1195
    const/16 v27, 0x0

    .line 1196
    .line 1197
    const/16 v28, 0x0

    .line 1198
    .line 1199
    const/16 v29, 0x0

    .line 1200
    .line 1201
    move-object/from16 v16, v4

    .line 1202
    .line 1203
    invoke-static/range {v16 .. v32}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v4

    .line 1207
    invoke-virtual {v5, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    invoke-interface {v11, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1211
    .line 1212
    .line 1213
    :cond_30
    :goto_1b
    if-ltz v7, :cond_31

    .line 1214
    .line 1215
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    check-cast v2, Ljava/util/List;

    .line 1220
    .line 1221
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1222
    .line 1223
    .line 1224
    move-result v2

    .line 1225
    if-ge v7, v2, :cond_31

    .line 1226
    .line 1227
    move-object/from16 v24, v1

    .line 1228
    .line 1229
    move-object/from16 v23, v8

    .line 1230
    .line 1231
    move-object v0, v9

    .line 1232
    move-object v1, v11

    .line 1233
    move-object/from16 v41, v12

    .line 1234
    .line 1235
    goto/16 :goto_1c

    .line 1236
    .line 1237
    :cond_31
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v2

    .line 1241
    check-cast v2, Ljava/util/List;

    .line 1242
    .line 1243
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v2

    .line 1247
    move-object/from16 v19, v3

    .line 1248
    .line 1249
    new-instance v3, Lfb/c;

    .line 1250
    .line 1251
    iget-object v7, v1, Lfb/p1;->j:Ljava/lang/String;

    .line 1252
    .line 1253
    move-object v4, v8

    .line 1254
    iget-object v8, v1, Lfb/p1;->k:Ljava/lang/String;

    .line 1255
    .line 1256
    const-wide/16 v20, 0x0

    .line 1257
    .line 1258
    const v22, 0x2dfc4

    .line 1259
    .line 1260
    .line 1261
    move-object v5, v4

    .line 1262
    const-string v4, "assistant"

    .line 1263
    .line 1264
    move-object v6, v5

    .line 1265
    const-string v5, ""

    .line 1266
    .line 1267
    move-object v10, v6

    .line 1268
    const/4 v6, 0x0

    .line 1269
    move-object v13, v9

    .line 1270
    const-string v9, "assistant"

    .line 1271
    .line 1272
    move-object v15, v10

    .line 1273
    const/4 v10, 0x0

    .line 1274
    move-object/from16 v16, v11

    .line 1275
    .line 1276
    const/4 v11, 0x0

    .line 1277
    move-object/from16 v17, v12

    .line 1278
    .line 1279
    const/4 v12, 0x0

    .line 1280
    move-object/from16 v18, v13

    .line 1281
    .line 1282
    const/4 v13, 0x0

    .line 1283
    move/from16 v40, v14

    .line 1284
    .line 1285
    move-object/from16 v23, v15

    .line 1286
    .line 1287
    const-wide/16 v14, 0x0

    .line 1288
    .line 1289
    move-object/from16 v24, v16

    .line 1290
    .line 1291
    const-string v16, "streaming"

    .line 1292
    .line 1293
    move-object/from16 v25, v17

    .line 1294
    .line 1295
    const/16 v17, 0x0

    .line 1296
    .line 1297
    move-object/from16 v26, v18

    .line 1298
    .line 1299
    const/16 v18, 0x0

    .line 1300
    .line 1301
    move-object/from16 v0, v24

    .line 1302
    .line 1303
    move-object/from16 v24, v1

    .line 1304
    .line 1305
    move-object v1, v0

    .line 1306
    move-object/from16 v41, v25

    .line 1307
    .line 1308
    move-object/from16 v0, v26

    .line 1309
    .line 1310
    invoke-direct/range {v3 .. v22}, Lfb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;JI)V

    .line 1311
    .line 1312
    .line 1313
    move-object v4, v3

    .line 1314
    move-object/from16 v3, v19

    .line 1315
    .line 1316
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1320
    .line 1321
    .line 1322
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    check-cast v2, Ljava/util/List;

    .line 1327
    .line 1328
    invoke-static {v2}, La/a;->b0(Ljava/util/List;)I

    .line 1329
    .line 1330
    .line 1331
    move-result v7

    .line 1332
    :goto_1c
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1333
    .line 1334
    .line 1335
    move-object/from16 v5, v41

    .line 1336
    .line 1337
    invoke-static {v5, v7}, Lwb/y2;->T0(Li0/a1;I)V

    .line 1338
    .line 1339
    .line 1340
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Ljava/util/List;

    .line 1345
    .line 1346
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    check-cast v0, Lfb/c;

    .line 1351
    .line 1352
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    if-eqz v2, :cond_32

    .line 1357
    .line 1358
    iget-object v2, v0, Lfb/c;->c:Ljava/lang/String;

    .line 1359
    .line 1360
    move-object/from16 v27, v2

    .line 1361
    .line 1362
    :goto_1d
    move-object/from16 v6, v24

    .line 1363
    .line 1364
    goto :goto_1e

    .line 1365
    :cond_32
    move-object/from16 v27, v3

    .line 1366
    .line 1367
    goto :goto_1d

    .line 1368
    :goto_1e
    iget-object v2, v6, Lfb/p1;->j:Ljava/lang/String;

    .line 1369
    .line 1370
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    if-eqz v4, :cond_33

    .line 1375
    .line 1376
    iget-object v2, v0, Lfb/c;->d:Ljava/lang/String;

    .line 1377
    .line 1378
    :cond_33
    move-object/from16 v28, v2

    .line 1379
    .line 1380
    iget-object v2, v6, Lfb/p1;->k:Ljava/lang/String;

    .line 1381
    .line 1382
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v4

    .line 1386
    if-eqz v4, :cond_34

    .line 1387
    .line 1388
    iget-object v2, v0, Lfb/c;->e:Ljava/lang/String;

    .line 1389
    .line 1390
    :cond_34
    move-object/from16 v29, v2

    .line 1391
    .line 1392
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v2

    .line 1396
    if-eqz v2, :cond_35

    .line 1397
    .line 1398
    iget-object v3, v0, Lfb/c;->q:Ljava/lang/String;

    .line 1399
    .line 1400
    :cond_35
    move-object/from16 v38, v3

    .line 1401
    .line 1402
    const-wide/16 v39, 0x0

    .line 1403
    .line 1404
    const v41, 0x2dfc3

    .line 1405
    .line 1406
    .line 1407
    const/16 v26, 0x0

    .line 1408
    .line 1409
    const-string v30, "assistant"

    .line 1410
    .line 1411
    const/16 v31, 0x0

    .line 1412
    .line 1413
    const/16 v32, 0x0

    .line 1414
    .line 1415
    const/16 v33, 0x0

    .line 1416
    .line 1417
    const/16 v34, 0x0

    .line 1418
    .line 1419
    const-string v35, "streaming"

    .line 1420
    .line 1421
    const/16 v36, 0x0

    .line 1422
    .line 1423
    const/16 v37, 0x0

    .line 1424
    .line 1425
    move-object/from16 v25, v0

    .line 1426
    .line 1427
    invoke-static/range {v25 .. v41}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    move-object/from16 v2, v25

    .line 1432
    .line 1433
    invoke-virtual {v0, v2}, Lfb/c;->equals(Ljava/lang/Object;)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    if-nez v2, :cond_36

    .line 1438
    .line 1439
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    check-cast v2, Ljava/util/List;

    .line 1444
    .line 1445
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    invoke-virtual {v2, v7, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1453
    .line 1454
    .line 1455
    :cond_36
    move-object/from16 v7, v23

    .line 1456
    .line 1457
    const/4 v14, 0x0

    .line 1458
    invoke-virtual {v7, v14}, Lwb/wt;->b(Z)V

    .line 1459
    .line 1460
    .line 1461
    return-void

    .line 1462
    :sswitch_5
    move-object v6, v1

    .line 1463
    move-object v7, v8

    .line 1464
    move-object v0, v9

    .line 1465
    move-object v1, v11

    .line 1466
    move-object v5, v12

    .line 1467
    const/4 v14, 0x0

    .line 1468
    const-string v8, "assistant_reset"

    .line 1469
    .line 1470
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1471
    .line 1472
    .line 1473
    move-result v2

    .line 1474
    if-nez v2, :cond_37

    .line 1475
    .line 1476
    goto/16 :goto_18

    .line 1477
    .line 1478
    :cond_37
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v2

    .line 1482
    if-nez v2, :cond_3a

    .line 1483
    .line 1484
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    check-cast v2, Ljava/util/List;

    .line 1489
    .line 1490
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1491
    .line 1492
    .line 1493
    move-result v4

    .line 1494
    invoke-interface {v2, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v2

    .line 1498
    :cond_38
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v4

    .line 1502
    if-eqz v4, :cond_39

    .line 1503
    .line 1504
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v4

    .line 1508
    check-cast v4, Lfb/c;

    .line 1509
    .line 1510
    iget-object v6, v4, Lfb/c;->a:Ljava/lang/String;

    .line 1511
    .line 1512
    invoke-static {v6, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1513
    .line 1514
    .line 1515
    move-result v6

    .line 1516
    if-eqz v6, :cond_38

    .line 1517
    .line 1518
    iget-object v4, v4, Lfb/c;->q:Ljava/lang/String;

    .line 1519
    .line 1520
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    move-result v4

    .line 1524
    if-eqz v4, :cond_38

    .line 1525
    .line 1526
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    .line 1527
    .line 1528
    .line 1529
    move-result v3

    .line 1530
    goto :goto_1f

    .line 1531
    :cond_39
    const/4 v3, -0x1

    .line 1532
    goto :goto_1f

    .line 1533
    :cond_3a
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1534
    .line 1535
    .line 1536
    move-result v3

    .line 1537
    :goto_1f
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    check-cast v2, Ljava/util/List;

    .line 1542
    .line 1543
    invoke-static {v3, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v2

    .line 1547
    check-cast v2, Lfb/c;

    .line 1548
    .line 1549
    if-eqz v2, :cond_3b

    .line 1550
    .line 1551
    iget-object v2, v2, Lfb/c;->a:Ljava/lang/String;

    .line 1552
    .line 1553
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1554
    .line 1555
    .line 1556
    move-result v2

    .line 1557
    if-eqz v2, :cond_3b

    .line 1558
    .line 1559
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v2

    .line 1563
    check-cast v2, Ljava/util/List;

    .line 1564
    .line 1565
    invoke-static {v2}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v2

    .line 1569
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1573
    .line 1574
    .line 1575
    const/4 v8, -0x1

    .line 1576
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1577
    .line 1578
    .line 1579
    invoke-static {v5, v8}, Lwb/y2;->T0(Li0/a1;I)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v7, v14}, Lwb/wt;->b(Z)V

    .line 1583
    .line 1584
    .line 1585
    return-void

    .line 1586
    :cond_3b
    move-object/from16 v9, p0

    .line 1587
    .line 1588
    goto/16 :goto_29

    .line 1589
    .line 1590
    :sswitch_6
    move-object v6, v1

    .line 1591
    move-object v7, v8

    .line 1592
    move-object v0, v9

    .line 1593
    move-object v1, v11

    .line 1594
    const/4 v8, -0x1

    .line 1595
    const/4 v14, 0x0

    .line 1596
    const-string v9, "protocol_checkpoint"

    .line 1597
    .line 1598
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v2

    .line 1602
    if-nez v2, :cond_4f

    .line 1603
    .line 1604
    :goto_20
    invoke-static/range {v18 .. v18}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v2

    .line 1608
    if-nez v2, :cond_3c

    .line 1609
    .line 1610
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1611
    .line 1612
    move-object/from16 v9, p0

    .line 1613
    .line 1614
    iget-object v5, v9, Lwb/yr;->s:Li0/a1;

    .line 1615
    .line 1616
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1617
    .line 1618
    .line 1619
    goto :goto_21

    .line 1620
    :cond_3c
    move-object/from16 v9, p0

    .line 1621
    .line 1622
    :goto_21
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1623
    .line 1624
    .line 1625
    move-result v2

    .line 1626
    if-nez v2, :cond_3f

    .line 1627
    .line 1628
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v0

    .line 1632
    check-cast v0, Ljava/util/List;

    .line 1633
    .line 1634
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v0

    .line 1642
    :cond_3d
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1643
    .line 1644
    .line 1645
    move-result v2

    .line 1646
    if-eqz v2, :cond_3e

    .line 1647
    .line 1648
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v2

    .line 1652
    check-cast v2, Lfb/c;

    .line 1653
    .line 1654
    iget-object v5, v2, Lfb/c;->a:Ljava/lang/String;

    .line 1655
    .line 1656
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v5

    .line 1660
    if-eqz v5, :cond_3d

    .line 1661
    .line 1662
    iget-object v2, v2, Lfb/c;->q:Ljava/lang/String;

    .line 1663
    .line 1664
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1665
    .line 1666
    .line 1667
    move-result v2

    .line 1668
    if-eqz v2, :cond_3d

    .line 1669
    .line 1670
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 1671
    .line 1672
    .line 1673
    move-result v0

    .line 1674
    goto :goto_22

    .line 1675
    :cond_3e
    move v0, v8

    .line 1676
    goto :goto_22

    .line 1677
    :cond_3f
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1678
    .line 1679
    .line 1680
    move-result v0

    .line 1681
    :goto_22
    if-ltz v0, :cond_4e

    .line 1682
    .line 1683
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v2

    .line 1687
    check-cast v2, Ljava/util/List;

    .line 1688
    .line 1689
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1690
    .line 1691
    .line 1692
    move-result v2

    .line 1693
    if-ge v0, v2, :cond_4e

    .line 1694
    .line 1695
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v2

    .line 1699
    check-cast v2, Ljava/util/List;

    .line 1700
    .line 1701
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v2

    .line 1705
    check-cast v2, Lfb/c;

    .line 1706
    .line 1707
    iget-boolean v3, v6, Lfb/p1;->h:Z

    .line 1708
    .line 1709
    if-eqz v3, :cond_40

    .line 1710
    .line 1711
    move-object/from16 v20, v18

    .line 1712
    .line 1713
    goto :goto_24

    .line 1714
    :cond_40
    iget-object v3, v2, Lfb/c;->b:Ljava/lang/String;

    .line 1715
    .line 1716
    invoke-static/range {v18 .. v18}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1717
    .line 1718
    .line 1719
    move-result v5

    .line 1720
    if-eqz v5, :cond_41

    .line 1721
    .line 1722
    goto :goto_23

    .line 1723
    :cond_41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 1727
    .line 1728
    .line 1729
    move-result v5

    .line 1730
    if-nez v5, :cond_42

    .line 1731
    .line 1732
    goto :goto_23

    .line 1733
    :cond_42
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1734
    .line 1735
    .line 1736
    move-result v5

    .line 1737
    if-nez v5, :cond_43

    .line 1738
    .line 1739
    move-object/from16 v3, v18

    .line 1740
    .line 1741
    goto :goto_23

    .line 1742
    :cond_43
    move-object/from16 v5, v18

    .line 1743
    .line 1744
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v8

    .line 1748
    if-eqz v8, :cond_44

    .line 1749
    .line 1750
    goto :goto_23

    .line 1751
    :cond_44
    invoke-static {v5, v3, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v8

    .line 1755
    if-eqz v8, :cond_45

    .line 1756
    .line 1757
    move-object v3, v5

    .line 1758
    goto :goto_23

    .line 1759
    :cond_45
    invoke-static {v3, v5, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v8

    .line 1763
    if-eqz v8, :cond_46

    .line 1764
    .line 1765
    goto :goto_23

    .line 1766
    :cond_46
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v3

    .line 1770
    :goto_23
    move-object/from16 v20, v3

    .line 1771
    .line 1772
    :goto_24
    iget-boolean v3, v6, Lfb/p1;->i:Z

    .line 1773
    .line 1774
    if-eqz v3, :cond_47

    .line 1775
    .line 1776
    :goto_25
    move-object/from16 v26, v4

    .line 1777
    .line 1778
    goto :goto_28

    .line 1779
    :cond_47
    iget-object v3, v2, Lfb/c;->h:Ljava/lang/String;

    .line 1780
    .line 1781
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1788
    .line 1789
    .line 1790
    move-result v5

    .line 1791
    if-nez v5, :cond_48

    .line 1792
    .line 1793
    :goto_26
    move-object v4, v3

    .line 1794
    goto :goto_25

    .line 1795
    :cond_48
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1796
    .line 1797
    .line 1798
    move-result v5

    .line 1799
    if-nez v5, :cond_49

    .line 1800
    .line 1801
    goto :goto_25

    .line 1802
    :cond_49
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v5

    .line 1806
    if-eqz v5, :cond_4a

    .line 1807
    .line 1808
    goto :goto_27

    .line 1809
    :cond_4a
    invoke-static {v4, v3, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v5

    .line 1813
    if-eqz v5, :cond_4b

    .line 1814
    .line 1815
    goto :goto_25

    .line 1816
    :cond_4b
    invoke-static {v3, v4, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v5

    .line 1820
    if-eqz v5, :cond_4c

    .line 1821
    .line 1822
    :goto_27
    goto :goto_26

    .line 1823
    :cond_4c
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v4

    .line 1827
    goto :goto_25

    .line 1828
    :goto_28
    const-wide/16 v33, 0x0

    .line 1829
    .line 1830
    const v35, 0x3df7d

    .line 1831
    .line 1832
    .line 1833
    const/16 v21, 0x0

    .line 1834
    .line 1835
    const/16 v22, 0x0

    .line 1836
    .line 1837
    const/16 v23, 0x0

    .line 1838
    .line 1839
    const/16 v24, 0x0

    .line 1840
    .line 1841
    const/16 v25, 0x0

    .line 1842
    .line 1843
    const/16 v27, 0x0

    .line 1844
    .line 1845
    const/16 v28, 0x0

    .line 1846
    .line 1847
    const-string v29, "streaming"

    .line 1848
    .line 1849
    const/16 v30, 0x0

    .line 1850
    .line 1851
    const/16 v31, 0x0

    .line 1852
    .line 1853
    const/16 v32, 0x0

    .line 1854
    .line 1855
    move-object/from16 v19, v2

    .line 1856
    .line 1857
    invoke-static/range {v19 .. v35}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v2

    .line 1861
    move-object/from16 v3, v19

    .line 1862
    .line 1863
    invoke-virtual {v2, v3}, Lfb/c;->equals(Ljava/lang/Object;)Z

    .line 1864
    .line 1865
    .line 1866
    move-result v3

    .line 1867
    if-nez v3, :cond_4d

    .line 1868
    .line 1869
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v3

    .line 1873
    check-cast v3, Ljava/util/List;

    .line 1874
    .line 1875
    invoke-static {v3}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v3

    .line 1879
    invoke-virtual {v3, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1880
    .line 1881
    .line 1882
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1883
    .line 1884
    .line 1885
    :cond_4d
    invoke-virtual {v7, v14}, Lwb/wt;->b(Z)V

    .line 1886
    .line 1887
    .line 1888
    :cond_4e
    :goto_29
    return-void

    .line 1889
    :cond_4f
    move-object/from16 v9, p0

    .line 1890
    .line 1891
    if-eqz v5, :cond_50

    .line 1892
    .line 1893
    invoke-interface {v10, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1894
    .line 1895
    .line 1896
    :cond_50
    const/4 v1, 0x1

    .line 1897
    invoke-virtual {v7, v1}, Lwb/wt;->b(Z)V

    .line 1898
    .line 1899
    .line 1900
    return-void

    .line 1901
    :sswitch_data_0
    .sparse-switch
        -0x312e7271 -> :sswitch_6
        -0x2aea2b52 -> :sswitch_5
        -0x2ad5843f -> :sswitch_4
        -0x1df7aa78 -> :sswitch_3
        -0x106baeb0 -> :sswitch_2
        -0xa20105 -> :sswitch_1
        0x5ae82b31 -> :sswitch_0
    .end sparse-switch
.end method
