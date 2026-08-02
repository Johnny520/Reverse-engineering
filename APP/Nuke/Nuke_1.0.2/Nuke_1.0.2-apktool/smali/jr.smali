.class public final Ljr;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Ljr;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Lz52;

.field public static final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final l:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final m:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljr;->d:Ljr;

    .line 8
    .line 9
    const v0, 0x790b00a2

    .line 10
    .line 11
    .line 12
    sput v0, Ljr;->e:I

    .line 13
    .line 14
    const v0, 0x790b00b3

    .line 15
    .line 16
    .line 17
    sput v0, Ljr;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Ljr;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "ChatAutoReply"

    .line 24
    .line 25
    sput-object v0, Ljr;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Ljr;->i:Z

    .line 29
    .line 30
    new-instance v1, Lz52;

    .line 31
    .line 32
    invoke-direct {v1}, Lz52;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v1, Ljr;->j:Lz52;

    .line 36
    .line 37
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v1, Ljr;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v1, Ljr;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    new-instance v1, Lt;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Lt;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Ljr;->m:Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    return-void
.end method

.method public static q()Lcr;
    .locals 4

    .line 1
    sget-object v0, Lpp1;->a:Lpp1;

    .line 2
    .line 3
    invoke-static {}, Lpp1;->c()Lop1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcr;

    .line 8
    .line 9
    invoke-direct {v1}, Lcr;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lcr;->Companion:Lbr;

    .line 13
    .line 14
    invoke-virtual {v2}, Lbr;->serializer()Lw41;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lse;->D(Lw41;)Lw41;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "ChatAutoReply/config"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1, v3}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcr;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Lcr;

    .line 33
    .line 34
    invoke-direct {v0}, Lcr;-><init>()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v0
.end method

.method public static r(Lby0;J)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Ljr;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    cmp-long v0, p1, v3

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_16

    .line 14
    .line 15
    :cond_0
    iget-object v3, v1, Lby0;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, v1, Lby0;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Ljr;->q()Lcr;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Lcr;->a:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v11

    .line 29
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_30

    .line 34
    .line 35
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v12, v0

    .line 40
    check-cast v12, Lzq;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    cmp-long v0, p1, v4

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    goto/16 :goto_16

    .line 51
    .line 52
    :cond_1
    iget-boolean v0, v12, Lzq;->c:Z

    .line 53
    .line 54
    iget-object v4, v12, Lzq;->i:Lir;

    .line 55
    .line 56
    iget-object v5, v12, Lzq;->b:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    sget-object v0, Ljr;->d:Ljr;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, v12, Lzq;->g:Ler;

    .line 66
    .line 67
    iget-object v6, v12, Lzq;->h:Ljava/util/Set;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v9, 0x1

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    if-ne v0, v9, :cond_2

    .line 77
    .line 78
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-static {}, Lc80;->s()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    move v0, v9

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/4 v0, 0x0

    .line 96
    :goto_1
    if-nez v0, :cond_7

    .line 97
    .line 98
    :cond_5
    move-object/from16 v19, v2

    .line 99
    .line 100
    :cond_6
    move-object v13, v3

    .line 101
    goto/16 :goto_15

    .line 102
    .line 103
    :cond_7
    iget-object v0, v12, Lzq;->e:Ljava/util/List;

    .line 104
    .line 105
    iget-object v6, v12, Lzq;->d:Lgr;

    .line 106
    .line 107
    iget-boolean v10, v12, Lzq;->f:Z

    .line 108
    .line 109
    new-instance v13, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v14, 0xa

    .line 112
    .line 113
    invoke-static {v0, v14}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-eqz v14, :cond_8

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    check-cast v14, Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v14}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    :cond_9
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-eqz v14, :cond_a

    .line 162
    .line 163
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    move-object v15, v14

    .line 168
    check-cast v15, Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v15

    .line 174
    if-lez v15, :cond_9

    .line 175
    .line 176
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    sget-object v14, Ljr;->h:Ljava/lang/String;

    .line 185
    .line 186
    const/4 v15, 0x2

    .line 187
    if-eqz v13, :cond_b

    .line 188
    .line 189
    :goto_4
    move-object/from16 v19, v2

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    goto/16 :goto_e

    .line 193
    .line 194
    :cond_b
    sget-object v13, Lgr;->j:Lgr;

    .line 195
    .line 196
    if-ne v6, v13, :cond_c

    .line 197
    .line 198
    invoke-static {v3}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    goto :goto_5

    .line 207
    :cond_c
    move-object v13, v3

    .line 208
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v16

    .line 212
    if-eqz v16, :cond_d

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v16

    .line 219
    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_16

    .line 224
    .line 225
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    move-object v8, v0

    .line 230
    check-cast v8, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_14

    .line 237
    .line 238
    if-eq v0, v9, :cond_13

    .line 239
    .line 240
    if-ne v0, v15, :cond_12

    .line 241
    .line 242
    if-eqz v10, :cond_e

    .line 243
    .line 244
    :try_start_0
    sget-object v0, Lp72;->i:Lp72;

    .line 245
    .line 246
    invoke-static {v0}, Lt11;->Q(Ljava/lang/Object;)Ljava/util/Set;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    goto :goto_7

    .line 251
    :catchall_0
    move-exception v0

    .line 252
    goto :goto_9

    .line 253
    :cond_e
    sget-object v0, Lfe0;->h:Lfe0;

    .line 254
    .line 255
    :goto_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    check-cast v0, Ljava/lang/Iterable;

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const/16 v18, 0x0

    .line 265
    .line 266
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v19

    .line 270
    if-eqz v19, :cond_f

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v19

    .line 276
    move-object/from16 v15, v19

    .line 277
    .line 278
    check-cast v15, Lp72;

    .line 279
    .line 280
    iget v15, v15, Lp72;->h:I

    .line 281
    .line 282
    or-int v18, v18, v15

    .line 283
    .line 284
    const/4 v15, 0x2

    .line 285
    goto :goto_8

    .line 286
    :cond_f
    and-int/lit8 v0, v18, 0x2

    .line 287
    .line 288
    if-eqz v0, :cond_10

    .line 289
    .line 290
    or-int/lit8 v18, v18, 0x40

    .line 291
    .line 292
    :cond_10
    move/from16 v0, v18

    .line 293
    .line 294
    invoke-static {v8, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 313
    .line 314
    .line 315
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    goto :goto_a

    .line 317
    :goto_9
    new-instance v15, Lx92;

    .line 318
    .line 319
    invoke-direct {v15, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    move-object v0, v15

    .line 323
    :goto_a
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    if-nez v15, :cond_11

    .line 328
    .line 329
    move-object/from16 v19, v2

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_11
    invoke-virtual {v15}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v15, ": "

    .line 337
    .line 338
    const-string v9, ", reason="

    .line 339
    .line 340
    move-object/from16 v19, v2

    .line 341
    .line 342
    const-string v2, "Invalid regular expression in task "

    .line 343
    .line 344
    invoke-static {v2, v5, v15, v8, v9}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-static {v14, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 359
    .line 360
    :goto_b
    check-cast v0, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    goto :goto_c

    .line 367
    :cond_12
    invoke-static {}, Lc80;->s()V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_13
    move-object/from16 v19, v2

    .line 372
    .line 373
    invoke-static {v13, v8, v10}, Lwv2;->X(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    goto :goto_c

    .line 378
    :cond_14
    move-object/from16 v19, v2

    .line 379
    .line 380
    invoke-static {v13, v8, v10}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    :goto_c
    if-eqz v0, :cond_15

    .line 385
    .line 386
    const/4 v0, 0x1

    .line 387
    goto :goto_d

    .line 388
    :cond_15
    move-object/from16 v2, v19

    .line 389
    .line 390
    const/4 v9, 0x1

    .line 391
    const/4 v15, 0x2

    .line 392
    goto/16 :goto_6

    .line 393
    .line 394
    :cond_16
    move-object/from16 v19, v2

    .line 395
    .line 396
    const/4 v0, 0x0

    .line 397
    :goto_d
    move v8, v0

    .line 398
    :goto_e
    if-eqz v8, :cond_6

    .line 399
    .line 400
    iget-object v0, v12, Lzq;->a:Ljava/lang/String;

    .line 401
    .line 402
    new-instance v2, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v0, ":"

    .line 411
    .line 412
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 423
    .line 424
    .line 425
    move-result-wide v8

    .line 426
    sget-object v0, Ljr;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 427
    .line 428
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    check-cast v0, Ljava/lang/Long;

    .line 433
    .line 434
    const-string v6, ", talker="

    .line 435
    .line 436
    const-wide/16 v15, 0x0

    .line 437
    .line 438
    if-eqz v0, :cond_18

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 441
    .line 442
    .line 443
    move-result-wide v20

    .line 444
    sub-long v8, v8, v20

    .line 445
    .line 446
    move-object v13, v3

    .line 447
    move-object v10, v4

    .line 448
    iget-wide v3, v12, Lzq;->m:J

    .line 449
    .line 450
    cmp-long v0, v3, v15

    .line 451
    .line 452
    if-gez v0, :cond_17

    .line 453
    .line 454
    move-wide v3, v15

    .line 455
    :cond_17
    cmp-long v0, v8, v3

    .line 456
    .line 457
    if-gez v0, :cond_19

    .line 458
    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    const-string v2, "Task skipped by cooldown: task="

    .line 462
    .line 463
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-static {v14, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_15

    .line 483
    .line 484
    :cond_18
    move-object v13, v3

    .line 485
    move-object v10, v4

    .line 486
    :cond_19
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 491
    .line 492
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance v3, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    const-string v4, "Task matched: task="

    .line 502
    .line 503
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    const-string v4, ", replyType="

    .line 516
    .line 517
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-static {v14, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    iget-wide v3, v12, Lzq;->l:J

    .line 531
    .line 532
    cmp-long v0, v3, v15

    .line 533
    .line 534
    if-lez v0, :cond_1b

    .line 535
    .line 536
    const-wide/32 v5, 0xea60

    .line 537
    .line 538
    .line 539
    cmp-long v0, v3, v5

    .line 540
    .line 541
    if-lez v0, :cond_1a

    .line 542
    .line 543
    move-wide v3, v5

    .line 544
    :cond_1a
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 545
    .line 546
    .line 547
    :cond_1b
    invoke-virtual/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 548
    .line 549
    .line 550
    move-result-wide v3

    .line 551
    cmp-long v0, p1, v3

    .line 552
    .line 553
    if-eqz v0, :cond_1c

    .line 554
    .line 555
    goto/16 :goto_16

    .line 556
    .line 557
    :cond_1c
    iget-object v0, v12, Lzq;->j:Ljava/lang/String;

    .line 558
    .line 559
    invoke-static {v0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    if-eqz v0, :cond_2e

    .line 572
    .line 573
    sget-object v5, Lio2;->j:Lio2;

    .line 574
    .line 575
    move-object v3, v5

    .line 576
    sget-object v5, Lio2;->m:Lio2;

    .line 577
    .line 578
    move-object v4, v5

    .line 579
    sget-object v5, Lio2;->l:Lio2;

    .line 580
    .line 581
    move-object v6, v5

    .line 582
    sget-object v5, Lio2;->h:Lio2;

    .line 583
    .line 584
    const/4 v9, 0x1

    .line 585
    if-eq v0, v9, :cond_29

    .line 586
    .line 587
    const/4 v9, 0x2

    .line 588
    if-ne v0, v9, :cond_28

    .line 589
    .line 590
    move-object v0, v5

    .line 591
    iget v5, v12, Lzq;->k:I

    .line 592
    .line 593
    const-class v9, Lgd3;

    .line 594
    .line 595
    const-string v10, "WeChat rejected voice metadata registration: "

    .line 596
    .line 597
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-static {v7}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 601
    .line 602
    .line 603
    move-result v14

    .line 604
    move-object v15, v4

    .line 605
    sget-object v4, Lpo2;->j:Lpo2;

    .line 606
    .line 607
    if-eqz v14, :cond_1d

    .line 608
    .line 609
    const/4 v9, 0x0

    .line 610
    const/16 v10, 0x20

    .line 611
    .line 612
    const-string v6, "Talker is empty"

    .line 613
    .line 614
    move-object v5, v0

    .line 615
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    goto/16 :goto_14

    .line 620
    .line 621
    :cond_1d
    const/4 v14, 0x1

    .line 622
    if-gt v14, v5, :cond_27

    .line 623
    .line 624
    const v0, 0xea61

    .line 625
    .line 626
    .line 627
    if-ge v5, v0, :cond_27

    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    :try_start_1
    new-array v0, v14, [Ljava/lang/String;

    .line 631
    .line 632
    invoke-static {v8, v0}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 633
    .line 634
    .line 635
    move-result-object v0
    :try_end_1
    .catch Ljava/nio/file/InvalidPathException; {:try_start_1 .. :try_end_1} :catch_0

    .line 636
    new-array v3, v14, [Ljava/nio/file/LinkOption;

    .line 637
    .line 638
    invoke-static {v0, v3}, Ljava/nio/file/Files;->isRegularFile(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-nez v3, :cond_1e

    .line 643
    .line 644
    const-string v0, "Voice source does not exist: "

    .line 645
    .line 646
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    const/4 v9, 0x0

    .line 651
    const/16 v10, 0x20

    .line 652
    .line 653
    move-object v5, v6

    .line 654
    move-object v6, v0

    .line 655
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    goto/16 :goto_14

    .line 660
    .line 661
    :cond_1e
    invoke-static {v0}, Ljava/nio/file/Files;->isReadable(Ljava/nio/file/Path;)Z

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    if-nez v3, :cond_1f

    .line 666
    .line 667
    const-string v0, "Voice source is not readable: "

    .line 668
    .line 669
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    const/4 v9, 0x0

    .line 674
    const/16 v10, 0x20

    .line 675
    .line 676
    move-object v5, v15

    .line 677
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    goto/16 :goto_14

    .line 682
    .line 683
    :cond_1f
    :try_start_2
    sget-object v3, Lb80;->a:Ljava/util/HashSet;

    .line 684
    .line 685
    const-string v3, "silk_codec"

    .line 686
    .line 687
    invoke-static {v9}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 688
    .line 689
    .line 690
    move-result-object v6

    .line 691
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    if-nez v6, :cond_20

    .line 696
    .line 697
    :goto_f
    const/4 v14, 0x0

    .line 698
    goto :goto_10

    .line 699
    :cond_20
    move-object v9, v6

    .line 700
    goto :goto_f

    .line 701
    :goto_10
    invoke-static {v9, v3, v14}, Lb80;->a(Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 702
    .line 703
    .line 704
    sget-object v3, Ldc3;->d:Ldc3;

    .line 705
    .line 706
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    sget-object v3, Ldc3;->f:Lhx2;

    .line 710
    .line 711
    invoke-virtual {v3}, Lhx2;->getValue()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    check-cast v3, Ljava/lang/reflect/Method;

    .line 716
    .line 717
    const-string v6, "amr_"

    .line 718
    .line 719
    filled-new-array {v7, v6}, [Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    const/4 v9, 0x0

    .line 724
    invoke-virtual {v3, v9, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    instance-of v6, v3, Ljava/lang/String;

    .line 729
    .line 730
    if-eqz v6, :cond_21

    .line 731
    .line 732
    check-cast v3, Ljava/lang/String;

    .line 733
    .line 734
    goto :goto_11

    .line 735
    :cond_21
    move-object v3, v9

    .line 736
    :goto_11
    if-eqz v3, :cond_25

    .line 737
    .line 738
    invoke-static {v3}, Ldc3;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v6

    .line 742
    const/4 v14, 0x0

    .line 743
    new-array v15, v14, [Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {v6, v15}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    invoke-interface {v6}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    .line 750
    .line 751
    .line 752
    move-result-object v15

    .line 753
    if-eqz v15, :cond_22

    .line 754
    .line 755
    new-array v9, v14, [Ljava/nio/file/attribute/FileAttribute;

    .line 756
    .line 757
    invoke-static {v15, v9}, Ljava/nio/file/Files;->createDirectories(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 758
    .line 759
    .line 760
    :cond_22
    const/4 v14, 0x1

    .line 761
    goto :goto_12

    .line 762
    :catchall_1
    move-exception v0

    .line 763
    move-object v10, v4

    .line 764
    goto :goto_13

    .line 765
    :goto_12
    new-array v9, v14, [Ljava/nio/file/CopyOption;

    .line 766
    .line 767
    sget-object v14, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 768
    .line 769
    const/16 v17, 0x0

    .line 770
    .line 771
    aput-object v14, v9, v17

    .line 772
    .line 773
    invoke-static {v0, v6, v9}, Ljava/nio/file/Files;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 774
    .line 775
    .line 776
    invoke-static {v3, v5}, Ldc3;->k(Ljava/lang/String;I)Z

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    if-nez v0, :cond_23

    .line 781
    .line 782
    sget-object v5, Lio2;->p:Lio2;

    .line 783
    .line 784
    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    const/4 v9, 0x0

    .line 789
    const/16 v10, 0x20

    .line 790
    .line 791
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 792
    .line 793
    .line 794
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 795
    goto/16 :goto_14

    .line 796
    .line 797
    :cond_23
    move-object v10, v4

    .line 798
    :try_start_3
    sget-object v0, Ldc3;->k:Lhx2;

    .line 799
    .line 800
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    check-cast v0, Ljava/lang/reflect/Method;

    .line 805
    .line 806
    const/4 v4, 0x0

    .line 807
    invoke-virtual {v0, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    if-eqz v0, :cond_24

    .line 812
    .line 813
    sget-object v9, Ldc3;->j:Lhx2;

    .line 814
    .line 815
    invoke-virtual {v9}, Lhx2;->getValue()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v9

    .line 819
    check-cast v9, Ljava/lang/reflect/Method;

    .line 820
    .line 821
    invoke-virtual {v9, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    new-instance v0, Lro2;

    .line 825
    .line 826
    new-instance v4, Lno2;

    .line 827
    .line 828
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 832
    move-object v6, v7

    .line 833
    move-object v7, v3

    .line 834
    :try_start_4
    invoke-direct/range {v4 .. v9}, Lno2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 835
    .line 836
    .line 837
    move-object v7, v6

    .line 838
    :try_start_5
    invoke-direct {v0, v4}, Lro2;-><init>(Ljava/lang/Object;)V

    .line 839
    .line 840
    .line 841
    goto/16 :goto_14

    .line 842
    .line 843
    :catchall_2
    move-exception v0

    .line 844
    goto :goto_13

    .line 845
    :catchall_3
    move-exception v0

    .line 846
    move-object v7, v6

    .line 847
    goto :goto_13

    .line 848
    :cond_24
    const-string v0, "SceneVoiceService getter returned null"

    .line 849
    .line 850
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 851
    .line 852
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    throw v3

    .line 856
    :cond_25
    move-object v10, v4

    .line 857
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 858
    .line 859
    const-string v3, "VoiceLogic returned an empty voice name"

    .line 860
    .line 861
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 865
    :goto_13
    invoke-static {v10, v7, v8, v0}, Lgd3;->k(Lpo2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lqo2;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    goto/16 :goto_14

    .line 870
    .line 871
    :catch_0
    move-exception v0

    .line 872
    move-object v10, v4

    .line 873
    move-object v9, v0

    .line 874
    invoke-virtual {v9}, Ljava/nio/file/InvalidPathException;->getMessage()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    if-nez v0, :cond_26

    .line 879
    .line 880
    move-object v0, v8

    .line 881
    :cond_26
    const-string v4, "Invalid voice path: "

    .line 882
    .line 883
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v6

    .line 887
    move-object v5, v3

    .line 888
    move-object v4, v10

    .line 889
    invoke-static/range {v4 .. v9}, Lgd3;->h(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lqo2;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    goto/16 :goto_14

    .line 894
    .line 895
    :cond_27
    const-string v0, "Voice duration must be in 1..60000 ms: "

    .line 896
    .line 897
    invoke-static {v0, v5}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    const/4 v9, 0x0

    .line 902
    const/16 v10, 0x20

    .line 903
    .line 904
    sget-object v5, Lio2;->k:Lio2;

    .line 905
    .line 906
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    goto/16 :goto_14

    .line 911
    .line 912
    :cond_28
    invoke-static {}, Lc80;->s()V

    .line 913
    .line 914
    .line 915
    return-void

    .line 916
    :cond_29
    move-object v15, v4

    .line 917
    move-object v0, v5

    .line 918
    move-object v5, v3

    .line 919
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v7}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    sget-object v4, Lpo2;->i:Lpo2;

    .line 927
    .line 928
    if-eqz v3, :cond_2a

    .line 929
    .line 930
    const/4 v9, 0x0

    .line 931
    const/16 v10, 0x20

    .line 932
    .line 933
    const-string v6, "Talker is empty"

    .line 934
    .line 935
    move-object v5, v0

    .line 936
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    goto/16 :goto_14

    .line 941
    .line 942
    :cond_2a
    const/4 v14, 0x0

    .line 943
    :try_start_6
    new-array v0, v14, [Ljava/lang/String;

    .line 944
    .line 945
    invoke-static {v8, v0}, Ljava/nio/file/Paths;->get(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 946
    .line 947
    .line 948
    move-result-object v0
    :try_end_6
    .catch Ljava/nio/file/InvalidPathException; {:try_start_6 .. :try_end_6} :catch_1

    .line 949
    new-array v3, v14, [Ljava/nio/file/LinkOption;

    .line 950
    .line 951
    invoke-static {v0, v3}, Ljava/nio/file/Files;->isRegularFile(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 952
    .line 953
    .line 954
    move-result v3

    .line 955
    if-nez v3, :cond_2b

    .line 956
    .line 957
    const-string v0, "Image source does not exist: "

    .line 958
    .line 959
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    const/4 v9, 0x0

    .line 964
    const/16 v10, 0x20

    .line 965
    .line 966
    move-object v5, v6

    .line 967
    move-object v6, v0

    .line 968
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    goto/16 :goto_14

    .line 973
    .line 974
    :cond_2b
    invoke-static {v0}, Ljava/nio/file/Files;->isReadable(Ljava/nio/file/Path;)Z

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    if-nez v0, :cond_2c

    .line 979
    .line 980
    const-string v0, "Image source is not readable: "

    .line 981
    .line 982
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v6

    .line 986
    const/4 v9, 0x0

    .line 987
    const/16 v10, 0x20

    .line 988
    .line 989
    move-object v5, v15

    .line 990
    invoke-static/range {v4 .. v10}, Lgd3;->i(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)Lqo2;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    goto :goto_14

    .line 995
    :cond_2c
    :try_start_7
    sget-object v0, Lhp2;->d:Lhp2;

    .line 996
    .line 997
    sget-object v3, Lpx0;->d:Lpx0;

    .line 998
    .line 999
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    sget-object v3, Lpx0;->g:Lhx2;

    .line 1003
    .line 1004
    invoke-virtual {v3}, Lhx2;->getValue()Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v3

    .line 1008
    check-cast v3, Ljava/lang/Class;

    .line 1009
    .line 1010
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v3}, Lhp2;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-static {v8, v7}, Lpx0;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v3

    .line 1021
    sget-object v5, Lpx0;->h:Lhx2;

    .line 1022
    .line 1023
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v5

    .line 1027
    check-cast v5, Ljava/lang/reflect/Method;

    .line 1028
    .line 1029
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v6

    .line 1033
    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    new-instance v0, Lro2;

    .line 1037
    .line 1038
    new-instance v5, Lko2;

    .line 1039
    .line 1040
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    invoke-direct {v5, v7, v8, v3}, Lko2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-direct {v0, v5}, Lro2;-><init>(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1052
    .line 1053
    .line 1054
    goto :goto_14

    .line 1055
    :catchall_4
    move-exception v0

    .line 1056
    invoke-static {v4, v7, v8, v0}, Lgd3;->k(Lpo2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lqo2;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    goto :goto_14

    .line 1061
    :catch_1
    move-exception v0

    .line 1062
    move-object v9, v0

    .line 1063
    invoke-virtual {v9}, Ljava/nio/file/InvalidPathException;->getMessage()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    if-nez v0, :cond_2d

    .line 1068
    .line 1069
    move-object v0, v8

    .line 1070
    :cond_2d
    const-string v3, "Invalid image path: "

    .line 1071
    .line 1072
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v6

    .line 1076
    invoke-static/range {v4 .. v9}, Lgd3;->h(Lpo2;Lio2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lqo2;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    goto :goto_14

    .line 1081
    :cond_2e
    invoke-static {v7, v8}, Lgd3;->l(Ljava/lang/String;Ljava/lang/String;)Lso2;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    :goto_14
    new-instance v3, Lm0;

    .line 1086
    .line 1087
    const/4 v4, 0x3

    .line 1088
    invoke-direct {v3, v4, v12, v1, v2}, Lm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v2, Ld2;

    .line 1092
    .line 1093
    const/16 v4, 0x9

    .line 1094
    .line 1095
    invoke-direct {v2, v4, v12, v1}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    invoke-interface {v0, v3, v2}, Lso2;->a(Lin0;Lin0;)V

    .line 1099
    .line 1100
    .line 1101
    iget-boolean v0, v12, Lzq;->n:Z

    .line 1102
    .line 1103
    if-eqz v0, :cond_2f

    .line 1104
    .line 1105
    goto :goto_16

    .line 1106
    :cond_2f
    :goto_15
    move-object v3, v13

    .line 1107
    move-object/from16 v2, v19

    .line 1108
    .line 1109
    goto/16 :goto_0

    .line 1110
    .line 1111
    :cond_30
    :goto_16
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ljr;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lvb1;)V
    .locals 2

    .line 1
    sget-object p0, Ljr;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljr;->q()Lcr;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lid3;->e:Lid3;

    .line 10
    .line 11
    new-instance v0, Lw;

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lw;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0, v0}, Lvb1;->a(Ltb1;Lin0;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    sget-object p0, Ljr;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljr;->j:Lz52;

    .line 7
    .line 8
    iget-object p0, p0, Lz52;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljr;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljr;->q()Lcr;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lcr;->a:Ljava/util/List;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lzq;

    .line 35
    .line 36
    iget-boolean v2, v2, Lzq;->c:Z

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    if-ltz v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {}, Leu;->Z()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0

    .line 50
    :cond_3
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const v0, 0x790b00a6

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    return-object p0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Ljr;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    sget-boolean p0, Ljr;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Ljr;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Ljr;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/view/View;Lxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    instance-of p1, p0, Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/app/Activity;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Ljr;->q()Lcr;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lx;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {v0, v1, p1, p2}, Lx;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkw;

    .line 50
    .line 51
    const p2, -0x77a04f57

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p1, p2, v1, v0}, Lkw;-><init>(IZLun0;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lt7;

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    invoke-direct {p2, v0, p0, p1}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
