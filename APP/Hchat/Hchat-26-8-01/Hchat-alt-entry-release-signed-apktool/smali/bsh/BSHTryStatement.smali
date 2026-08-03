.class Lbsh/BSHTryStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final blockId:I

.field tryWithResources:Lbsh/BSHTryWithResources;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 6
    .line 7
    sget-object p1, Lbsh/BlockNameSpace;->blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lbsh/BSHTryStatement;->blockId:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    const-string v9, "Try with resources: autoClose"

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    invoke-virtual {v1, v10}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Lbsh/BSHTryWithResources;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v10}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lbsh/BSHTryWithResources;

    .line 23
    .line 24
    iput-object v0, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 25
    .line 26
    invoke-virtual {v0, v6, v8}, Lbsh/BSHTryWithResources;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v10

    .line 32
    :goto_0
    add-int/lit8 v2, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v5, v0

    .line 39
    check-cast v5, Lbsh/BSHBlock;

    .line 40
    .line 41
    new-instance v12, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v13, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_1
    if-ge v2, v0, :cond_1

    .line 56
    .line 57
    add-int/lit8 v3, v2, 0x1

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    instance-of v7, v4, Lbsh/BSHMultiCatch;

    .line 64
    .line 65
    if-eqz v7, :cond_2

    .line 66
    .line 67
    check-cast v4, Lbsh/BSHMultiCatch;

    .line 68
    .line 69
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x2

    .line 73
    .line 74
    invoke-virtual {v1, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lbsh/BSHBlock;

    .line 79
    .line 80
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const/4 v4, 0x0

    .line 85
    :cond_2
    if-eqz v4, :cond_3

    .line 86
    .line 87
    check-cast v4, Lbsh/BSHBlock;

    .line 88
    .line 89
    move-object v15, v4

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 v15, 0x0

    .line 92
    :goto_2
    invoke-virtual {v6}, Lbsh/CallStack;->depth()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    :try_start_0
    const-string v0, "Evaluate try block"

    .line 97
    .line 98
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/EvalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v5, v6, v8}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lbsh/EvalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    const/4 v2, 0x0

    .line 110
    :goto_3
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    instance-of v3, v3, Lbsh/TargetError;

    .line 117
    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Lbsh/TargetError;

    .line 125
    .line 126
    invoke-virtual {v2}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    iget-object v3, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 132
    .line 133
    if-eqz v3, :cond_d

    .line 134
    .line 135
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v3}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v3, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 143
    .line 144
    invoke-virtual {v3}, Lbsh/BSHTryWithResources;->autoClose()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    :cond_5
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_d

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Ljava/lang/Throwable;

    .line 163
    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    if-eq v2, v4, :cond_5

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    const/4 v14, 0x0

    .line 174
    goto/16 :goto_19

    .line 175
    .line 176
    :catch_0
    move-exception v0

    .line 177
    move v10, v2

    .line 178
    :goto_5
    move-object v2, v0

    .line 179
    goto :goto_6

    .line 180
    :catch_1
    move-exception v0

    .line 181
    move v10, v2

    .line 182
    goto/16 :goto_a

    .line 183
    .line 184
    :catch_2
    move-exception v0

    .line 185
    move-object v4, v0

    .line 186
    move v3, v2

    .line 187
    :try_start_2
    new-instance v2, Lbsh/TargetError;
    :try_end_2
    .catch Lbsh/TargetError; {:try_start_2 .. :try_end_2} :catch_8
    .catch Lbsh/EvalException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    .line 189
    move v7, v3

    .line 190
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3
    :try_end_3
    .catch Lbsh/TargetError; {:try_start_3 .. :try_end_3} :catch_6
    .catch Lbsh/EvalException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 194
    move/from16 v16, v7

    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    move/from16 v10, v16

    .line 198
    .line 199
    :try_start_4
    invoke-direct/range {v2 .. v7}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/Node;Lbsh/CallStack;Z)V

    .line 200
    .line 201
    .line 202
    throw v2
    :try_end_4
    .catch Lbsh/TargetError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lbsh/EvalException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    :catch_3
    move-exception v0

    .line 204
    goto :goto_5

    .line 205
    :catch_4
    move-exception v0

    .line 206
    goto/16 :goto_a

    .line 207
    .line 208
    :catch_5
    move-exception v0

    .line 209
    move v10, v7

    .line 210
    goto :goto_5

    .line 211
    :catch_6
    move-exception v0

    .line 212
    move v10, v7

    .line 213
    goto :goto_a

    .line 214
    :catch_7
    move-exception v0

    .line 215
    move v10, v3

    .line 216
    goto :goto_5

    .line 217
    :catch_8
    move-exception v0

    .line 218
    move v10, v3

    .line 219
    goto :goto_a

    .line 220
    :goto_6
    :try_start_5
    const-string v0, "EvalException from try block: "

    .line 221
    .line 222
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 227
    .line 228
    .line 229
    :goto_7
    :try_start_6
    invoke-virtual {v6}, Lbsh/CallStack;->depth()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-le v0, v10, :cond_6

    .line 234
    .line 235
    invoke-virtual {v6}, Lbsh/CallStack;->pop()Lbsh/NameSpace;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 236
    .line 237
    .line 238
    goto :goto_7

    .line 239
    :catchall_1
    move-exception v0

    .line 240
    move-object v14, v2

    .line 241
    goto/16 :goto_19

    .line 242
    .line 243
    :cond_6
    :goto_8
    if-eqz v2, :cond_7

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    instance-of v0, v0, Lbsh/TargetError;

    .line 250
    .line 251
    if-eqz v0, :cond_7

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Lbsh/TargetError;

    .line 258
    .line 259
    invoke-virtual {v0}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    goto :goto_8

    .line 264
    :cond_7
    iget-object v0, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 265
    .line 266
    if-eqz v0, :cond_9

    .line 267
    .line 268
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 276
    .line 277
    invoke-virtual {v0}, Lbsh/BSHTryWithResources;->autoClose()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    :cond_8
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-eqz v3, :cond_9

    .line 290
    .line 291
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    check-cast v3, Ljava/lang/Throwable;

    .line 296
    .line 297
    if-eqz v2, :cond_8

    .line 298
    .line 299
    if-eq v2, v3, :cond_8

    .line 300
    .line 301
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_9
    const/4 v0, 0x0

    .line 306
    goto :goto_e

    .line 307
    :goto_a
    :try_start_7
    const-string v2, "TargetError from try block: "

    .line 308
    .line 309
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 317
    .line 318
    .line 319
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 320
    :goto_b
    :try_start_8
    invoke-virtual {v6}, Lbsh/CallStack;->depth()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-le v0, v10, :cond_a

    .line 325
    .line 326
    invoke-virtual {v6}, Lbsh/CallStack;->pop()Lbsh/NameSpace;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 327
    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_a
    :goto_c
    if-eqz v2, :cond_b

    .line 331
    .line 332
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    instance-of v0, v0, Lbsh/TargetError;

    .line 337
    .line 338
    if-eqz v0, :cond_b

    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Lbsh/TargetError;

    .line 345
    .line 346
    invoke-virtual {v0}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    goto :goto_c

    .line 351
    :cond_b
    iget-object v0, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 352
    .line 353
    if-eqz v0, :cond_9

    .line 354
    .line 355
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 363
    .line 364
    invoke-virtual {v0}, Lbsh/BSHTryWithResources;->autoClose()Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    :cond_c
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-eqz v3, :cond_9

    .line 377
    .line 378
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    check-cast v3, Ljava/lang/Throwable;

    .line 383
    .line 384
    if-eqz v2, :cond_c

    .line 385
    .line 386
    if-eq v2, v3, :cond_c

    .line 387
    .line 388
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 389
    .line 390
    .line 391
    goto :goto_d

    .line 392
    :cond_d
    :goto_e
    if-eqz v2, :cond_16

    .line 393
    .line 394
    :try_start_9
    const-string v3, "Try catch thrown: "

    .line 395
    .line 396
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-static {v3}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    const/4 v5, 0x0

    .line 412
    :goto_f
    if-ge v5, v4, :cond_16

    .line 413
    .line 414
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    check-cast v7, Lbsh/BSHMultiCatch;

    .line 419
    .line 420
    new-instance v9, Lbsh/Modifiers;

    .line 421
    .line 422
    const/4 v10, 0x4

    .line 423
    invoke-direct {v9, v10}, Lbsh/Modifiers;-><init>(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v7}, Lbsh/BSHMultiCatch;->isFinal()Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    if-eqz v10, :cond_e

    .line 431
    .line 432
    const-string v10, "final"

    .line 433
    .line 434
    invoke-virtual {v9, v10}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    goto :goto_10

    .line 438
    :catchall_2
    move-exception v0

    .line 439
    goto/16 :goto_15

    .line 440
    .line 441
    :cond_e
    :goto_10
    invoke-virtual {v7, v6, v8}, Lbsh/BSHMultiCatch;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v7}, Lbsh/BSHMultiCatch;->isUntyped()Z

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    if-eqz v10, :cond_10

    .line 449
    .line 450
    invoke-virtual {v8}, Lbsh/Interpreter;->getStrictJava()Z

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    if-nez v10, :cond_f

    .line 455
    .line 456
    goto :goto_11

    .line 457
    :cond_f
    new-instance v0, Lbsh/EvalException;

    .line 458
    .line 459
    const-string v2, "(Strict Java) Untyped catch block"

    .line 460
    .line 461
    invoke-direct {v0, v2, v1, v6}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 462
    .line 463
    .line 464
    throw v0

    .line 465
    :cond_10
    :goto_11
    invoke-virtual {v7}, Lbsh/BSHMultiCatch;->isUntyped()Z

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    if-nez v10, :cond_13

    .line 470
    .line 471
    invoke-virtual {v7}, Lbsh/BSHMultiCatch;->getTypes()[Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    array-length v14, v10

    .line 476
    const/4 v11, 0x0

    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    :goto_12
    if-ge v11, v14, :cond_12

    .line 480
    .line 481
    move-object/from16 v18, v0

    .line 482
    .line 483
    aget-object v0, v10, v11

    .line 484
    .line 485
    move/from16 v19, v4

    .line 486
    .line 487
    invoke-static {v0, v3}, Lbsh/Types;->isBshAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    move-object/from16 v20, v3

    .line 492
    .line 493
    const/4 v3, 0x1

    .line 494
    if-ne v3, v4, :cond_11

    .line 495
    .line 496
    move/from16 v17, v4

    .line 497
    .line 498
    goto :goto_13

    .line 499
    :cond_11
    add-int/lit8 v11, v11, 0x1

    .line 500
    .line 501
    move/from16 v17, v4

    .line 502
    .line 503
    move-object/from16 v0, v18

    .line 504
    .line 505
    move/from16 v4, v19

    .line 506
    .line 507
    move-object/from16 v3, v20

    .line 508
    .line 509
    goto :goto_12

    .line 510
    :cond_12
    move-object/from16 v18, v0

    .line 511
    .line 512
    move-object/from16 v20, v3

    .line 513
    .line 514
    move/from16 v19, v4

    .line 515
    .line 516
    const/4 v3, 0x1

    .line 517
    const/4 v0, 0x0

    .line 518
    :goto_13
    if-nez v17, :cond_14

    .line 519
    .line 520
    add-int/lit8 v5, v5, 0x1

    .line 521
    .line 522
    move-object/from16 v0, v18

    .line 523
    .line 524
    move/from16 v4, v19

    .line 525
    .line 526
    move-object/from16 v3, v20

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_13
    const/4 v0, 0x0

    .line 530
    :cond_14
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    check-cast v3, Lbsh/BSHBlock;

    .line 535
    .line 536
    invoke-virtual {v6}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    new-instance v5, Lbsh/BlockNameSpace;

    .line 541
    .line 542
    invoke-virtual {v6}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 543
    .line 544
    .line 545
    move-result-object v10

    .line 546
    iget v11, v1, Lbsh/BSHTryStatement;->blockId:I

    .line 547
    .line 548
    invoke-direct {v5, v10, v11}, Lbsh/BlockNameSpace;-><init>(Lbsh/NameSpace;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 549
    .line 550
    .line 551
    :try_start_a
    sget-object v10, Lbsh/BSHMultiCatch;->UNTYPED:Ljava/lang/Class;
    :try_end_a
    .catch Lbsh/UtilEvalError; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 552
    .line 553
    iget-object v7, v7, Lbsh/BSHMultiCatch;->name:Ljava/lang/String;

    .line 554
    .line 555
    if-ne v0, v10, :cond_15

    .line 556
    .line 557
    :try_start_b
    invoke-virtual {v5, v7, v2}, Lbsh/BlockNameSpace;->setBlockVariable(Ljava/lang/String;Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_15
    invoke-virtual {v5, v7, v0, v2, v9}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_b
    .catch Lbsh/UtilEvalError; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 562
    .line 563
    .line 564
    :goto_14
    :try_start_c
    invoke-virtual {v6, v5}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 565
    .line 566
    .line 567
    :try_start_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 568
    .line 569
    invoke-virtual {v3, v6, v8, v0}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 573
    :try_start_e
    invoke-virtual {v6, v4}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 574
    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    goto :goto_17

    .line 578
    :catchall_3
    move-exception v0

    .line 579
    invoke-virtual {v6, v4}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 580
    .line 581
    .line 582
    throw v0

    .line 583
    :catch_9
    new-instance v0, Lbsh/InterpreterError;

    .line 584
    .line 585
    const-string v2, "Unable to set var in catch block namespace."

    .line 586
    .line 587
    invoke-direct {v0, v2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 591
    :cond_16
    move-object/from16 v18, v0

    .line 592
    .line 593
    goto :goto_16

    .line 594
    :goto_15
    if-eqz v15, :cond_17

    .line 595
    .line 596
    invoke-virtual {v15, v6, v8}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    instance-of v3, v2, Lbsh/ReturnControl;

    .line 601
    .line 602
    if-eqz v3, :cond_17

    .line 603
    .line 604
    return-object v2

    .line 605
    :cond_17
    throw v0

    .line 606
    :goto_16
    move-object v14, v2

    .line 607
    move-object/from16 v0, v18

    .line 608
    .line 609
    :goto_17
    if-eqz v15, :cond_18

    .line 610
    .line 611
    invoke-virtual {v15, v6, v8}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    instance-of v3, v2, Lbsh/ReturnControl;

    .line 616
    .line 617
    if-eqz v3, :cond_18

    .line 618
    .line 619
    return-object v2

    .line 620
    :cond_18
    if-nez v14, :cond_1a

    .line 621
    .line 622
    instance-of v2, v0, Lbsh/ReturnControl;

    .line 623
    .line 624
    if-eqz v2, :cond_19

    .line 625
    .line 626
    goto :goto_18

    .line 627
    :cond_19
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 628
    .line 629
    :goto_18
    return-object v0

    .line 630
    :cond_1a
    new-instance v0, Lbsh/TargetError;

    .line 631
    .line 632
    invoke-direct {v0, v14, v1, v6}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/Node;Lbsh/CallStack;)V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :goto_19
    if-eqz v14, :cond_1b

    .line 637
    .line 638
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    instance-of v2, v2, Lbsh/TargetError;

    .line 643
    .line 644
    if-eqz v2, :cond_1b

    .line 645
    .line 646
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    check-cast v2, Lbsh/TargetError;

    .line 651
    .line 652
    invoke-virtual {v2}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 653
    .line 654
    .line 655
    move-result-object v14

    .line 656
    goto :goto_19

    .line 657
    :cond_1b
    iget-object v2, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 658
    .line 659
    if-eqz v2, :cond_1d

    .line 660
    .line 661
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-static {v2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    iget-object v2, v1, Lbsh/BSHTryStatement;->tryWithResources:Lbsh/BSHTryWithResources;

    .line 669
    .line 670
    invoke-virtual {v2}, Lbsh/BSHTryWithResources;->autoClose()Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    :cond_1c
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    if-eqz v3, :cond_1d

    .line 683
    .line 684
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    check-cast v3, Ljava/lang/Throwable;

    .line 689
    .line 690
    if-eqz v14, :cond_1c

    .line 691
    .line 692
    if-eq v14, v3, :cond_1c

    .line 693
    .line 694
    invoke-virtual {v14, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 695
    .line 696
    .line 697
    goto :goto_1a

    .line 698
    :cond_1d
    throw v0
.end method
