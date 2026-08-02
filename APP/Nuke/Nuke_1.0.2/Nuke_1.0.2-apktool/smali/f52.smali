.class public final Lf52;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final q:Li51;


# instance fields
.field public final h:Lu22;

.field public final i:Leg2;

.field public final j:Ldf2;

.field public final k:Lc20;

.field public final l:Lkl1;

.field public volatile m:Lcom/dokar/quickjs/QuickJs;

.field public volatile n:Lvn1;

.field public volatile o:Lrk2;

.field public volatile p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li51;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf52;->q:Li51;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lu22;Leg2;Ldf2;Lc20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf52;->h:Lu22;

    .line 5
    .line 6
    iput-object p2, p0, Lf52;->i:Leg2;

    .line 7
    .line 8
    iput-object p3, p0, Lf52;->j:Ldf2;

    .line 9
    .line 10
    iput-object p4, p0, Lf52;->k:Lc20;

    .line 11
    .line 12
    new-instance p1, Lkl1;

    .line 13
    .line 14
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lf52;->l:Lkl1;

    .line 18
    .line 19
    sget-object p1, Lrk2;->h:Lrk2;

    .line 20
    .line 21
    iput-object p1, p0, Lf52;->o:Lrk2;

    .line 22
    .line 23
    const-string p1, "unknown"

    .line 24
    .line 25
    iput-object p1, p0, Lf52;->p:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public static final b(Lf52;Lu00;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, Lrk2;->m:Lrk2;

    .line 6
    .line 7
    const-string v3, "Script session can only be started once: "

    .line 8
    .line 9
    instance-of v4, v0, Ld52;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Ld52;

    .line 15
    .line 16
    iget v5, v4, Ld52;->p:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Ld52;->p:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Ld52;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, Ld52;-><init>(Lf52;Lu00;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, Ld52;->n:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Lk20;->h:Lk20;

    .line 36
    .line 37
    iget v6, v4, Ld52;->p:I

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v6, :cond_4

    .line 44
    .line 45
    if-eq v6, v9, :cond_3

    .line 46
    .line 47
    if-eq v6, v8, :cond_2

    .line 48
    .line 49
    if-ne v6, v7, :cond_1

    .line 50
    .line 51
    iget-object v3, v4, Ld52;->m:Lvn1;

    .line 52
    .line 53
    iget-object v5, v4, Ld52;->l:Lcom/dokar/quickjs/QuickJs;

    .line 54
    .line 55
    iget-object v4, v4, Ld52;->k:Lil1;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v10

    .line 74
    :cond_2
    iget-object v3, v4, Ld52;->k:Lil1;

    .line 75
    .line 76
    :try_start_1
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    move-object/from16 v16, v0

    .line 82
    .line 83
    goto/16 :goto_a

    .line 84
    .line 85
    :catch_1
    move-exception v0

    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_3
    iget-object v6, v4, Ld52;->k:Lil1;

    .line 89
    .line 90
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v1, Lf52;->l:Lkl1;

    .line 98
    .line 99
    iput-object v0, v4, Ld52;->k:Lil1;

    .line 100
    .line 101
    iput v9, v4, Ld52;->p:I

    .line 102
    .line 103
    invoke-virtual {v0, v4}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-ne v6, v5, :cond_5

    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :cond_5
    move-object v6, v0

    .line 112
    :goto_1
    :try_start_2
    iget-object v0, v1, Lf52;->o:Lrk2;

    .line 113
    .line 114
    sget-object v9, Lrk2;->h:Lrk2;

    .line 115
    .line 116
    if-ne v0, v9, :cond_f

    .line 117
    .line 118
    sget-object v0, Lrk2;->i:Lrk2;

    .line 119
    .line 120
    iput-object v0, v1, Lf52;->o:Lrk2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 121
    .line 122
    :try_start_3
    iget-object v0, v1, Lf52;->j:Ldf2;

    .line 123
    .line 124
    iget-object v0, v0, Ldf2;->e:Ltf2;

    .line 125
    .line 126
    iget-object v3, v1, Lf52;->h:Lu22;

    .line 127
    .line 128
    iget-object v3, v3, Lu22;->a:Lth2;

    .line 129
    .line 130
    iget-object v3, v3, Lth2;->c:Ljava/lang/String;

    .line 131
    .line 132
    iput-object v6, v4, Ld52;->k:Lil1;

    .line 133
    .line 134
    iput v8, v4, Ld52;->p:I

    .line 135
    .line 136
    invoke-interface {v0, v3, v4}, Ltf2;->g(Ljava/lang/String;Lt00;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 140
    if-ne v0, v5, :cond_6

    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_6
    move-object v3, v6

    .line 145
    :goto_2
    :try_start_4
    check-cast v0, Ld41;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 146
    .line 147
    :try_start_5
    iget-object v6, v1, Lf52;->h:Lu22;

    .line 148
    .line 149
    iget-object v6, v6, Lu22;->d:Llf2;

    .line 150
    .line 151
    if-eqz v6, :cond_7

    .line 152
    .line 153
    invoke-static {v6, v0}, Lup0;->E(Llf2;Ld41;)Lrf2;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    goto :goto_3

    .line 158
    :catchall_2
    move-exception v0

    .line 159
    move-object v6, v3

    .line 160
    goto/16 :goto_c

    .line 161
    .line 162
    :cond_7
    move-object v6, v10

    .line 163
    :goto_3
    if-eqz v6, :cond_a

    .line 164
    .line 165
    invoke-virtual {v6}, Lrf2;->a()Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_a

    .line 170
    .line 171
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 172
    .line 173
    iget-object v0, v1, Lf52;->h:Lu22;

    .line 174
    .line 175
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 176
    .line 177
    iget-object v12, v0, Lth2;->c:Ljava/lang/String;

    .line 178
    .line 179
    sget-object v13, Lsi2;->j:Lsi2;

    .line 180
    .line 181
    iget-object v14, v0, Lth2;->j:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v0, v6, Lrf2;->c:Ljava/util/ArrayList;

    .line 184
    .line 185
    new-instance v4, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_9

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    move-object v2, v1

    .line 205
    check-cast v2, Lgf2;

    .line 206
    .line 207
    iget-object v2, v2, Lgf2;->c:Lhf2;

    .line 208
    .line 209
    sget-object v5, Lhf2;->i:Lhf2;

    .line 210
    .line 211
    if-ne v2, v5, :cond_8

    .line 212
    .line 213
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    const-string v5, ", "

    .line 218
    .line 219
    new-instance v8, Leq1;

    .line 220
    .line 221
    const/16 v0, 0x10

    .line 222
    .line 223
    invoke-direct {v8, v0}, Leq1;-><init>(I)V

    .line 224
    .line 225
    .line 226
    const/16 v9, 0x1e

    .line 227
    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    invoke-static/range {v4 .. v9}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    new-instance v11, Ldg2;

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    const/16 v17, 0x10

    .line 239
    .line 240
    invoke-direct/range {v11 .. v17}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 241
    .line 242
    .line 243
    throw v11

    .line 244
    :cond_a
    invoke-virtual {v1}, Lf52;->c()Lcom/dokar/quickjs/QuickJs;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    iput-object v8, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 249
    .line 250
    invoke-virtual {v8}, Lcom/dokar/quickjs/QuickJs;->getVersion()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    iput-object v9, v1, Lf52;->p:Ljava/lang/String;

    .line 255
    .line 256
    new-instance v11, Lvn1;

    .line 257
    .line 258
    iget-object v12, v1, Lf52;->h:Lu22;

    .line 259
    .line 260
    iget-object v13, v1, Lf52;->i:Leg2;

    .line 261
    .line 262
    iget-object v14, v1, Lf52;->j:Ldf2;

    .line 263
    .line 264
    iget-object v15, v1, Lf52;->p:Ljava/lang/String;

    .line 265
    .line 266
    if-eqz v6, :cond_b

    .line 267
    .line 268
    iget-object v0, v6, Lrf2;->b:Ld41;

    .line 269
    .line 270
    :cond_b
    move-object/from16 v16, v0

    .line 271
    .line 272
    invoke-direct/range {v11 .. v16}, Lvn1;-><init>(Lu22;Leg2;Ldf2;Ljava/lang/String;Ld41;)V

    .line 273
    .line 274
    .line 275
    iput-object v11, v1, Lf52;->n:Lvn1;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 276
    .line 277
    :try_start_6
    iget-object v0, v1, Lf52;->i:Leg2;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v8, v11}, Laf2;->d(Lcom/dokar/quickjs/QuickJs;Lvn1;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v8}, Lf52;->g(Lcom/dokar/quickjs/QuickJs;)V

    .line 286
    .line 287
    .line 288
    iput-object v3, v4, Ld52;->k:Lil1;

    .line 289
    .line 290
    iput-object v8, v4, Ld52;->l:Lcom/dokar/quickjs/QuickJs;

    .line 291
    .line 292
    iput-object v11, v4, Ld52;->m:Lvn1;

    .line 293
    .line 294
    iput v7, v4, Ld52;->p:I

    .line 295
    .line 296
    invoke-virtual {v1, v8, v4}, Lf52;->j(Lcom/dokar/quickjs/QuickJs;Lu00;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 300
    if-ne v0, v5, :cond_c

    .line 301
    .line 302
    :goto_5
    return-object v5

    .line 303
    :cond_c
    move-object v4, v3

    .line 304
    move-object v5, v8

    .line 305
    move-object v3, v11

    .line 306
    :goto_6
    :try_start_7
    sget-object v0, Lrk2;->j:Lrk2;

    .line 307
    .line 308
    iput-object v0, v1, Lf52;->o:Lrk2;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 309
    .line 310
    check-cast v4, Lkl1;

    .line 311
    .line 312
    invoke-virtual {v4, v10}, Lkl1;->f(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    sget-object v0, La83;->a:La83;

    .line 316
    .line 317
    return-object v0

    .line 318
    :catchall_3
    move-exception v0

    .line 319
    move-object v4, v3

    .line 320
    move-object v5, v8

    .line 321
    move-object v3, v11

    .line 322
    goto :goto_7

    .line 323
    :catch_2
    move-exception v0

    .line 324
    move-object v4, v3

    .line 325
    move-object v5, v8

    .line 326
    move-object v3, v11

    .line 327
    goto :goto_9

    .line 328
    :goto_7
    :try_start_8
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 329
    .line 330
    invoke-virtual {v3}, Lvn1;->f()V

    .line 331
    .line 332
    .line 333
    iput-object v10, v1, Lf52;->n:Lvn1;

    .line 334
    .line 335
    invoke-virtual {v5}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 336
    .line 337
    .line 338
    iput-object v10, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 339
    .line 340
    instance-of v2, v0, Ldg2;

    .line 341
    .line 342
    if-nez v2, :cond_e

    .line 343
    .line 344
    new-instance v12, Ldg2;

    .line 345
    .line 346
    iget-object v1, v1, Lf52;->h:Lu22;

    .line 347
    .line 348
    iget-object v1, v1, Lu22;->a:Lth2;

    .line 349
    .line 350
    iget-object v13, v1, Lth2;->c:Ljava/lang/String;

    .line 351
    .line 352
    sget-object v14, Lsi2;->m:Lsi2;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    if-nez v1, :cond_d

    .line 359
    .line 360
    const-string v1, "Unable to start script."

    .line 361
    .line 362
    :cond_d
    move-object/from16 v16, v1

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :catchall_4
    move-exception v0

    .line 366
    move-object v6, v4

    .line 367
    goto :goto_c

    .line 368
    :goto_8
    const/16 v18, 0x4

    .line 369
    .line 370
    const/4 v15, 0x0

    .line 371
    move-object/from16 v17, v0

    .line 372
    .line 373
    invoke-direct/range {v12 .. v18}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 374
    .line 375
    .line 376
    throw v12

    .line 377
    :cond_e
    move-object/from16 v17, v0

    .line 378
    .line 379
    throw v17

    .line 380
    :goto_9
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 381
    .line 382
    invoke-virtual {v3}, Lvn1;->f()V

    .line 383
    .line 384
    .line 385
    iput-object v10, v1, Lf52;->n:Lvn1;

    .line 386
    .line 387
    invoke-virtual {v5}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 388
    .line 389
    .line 390
    iput-object v10, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 391
    .line 392
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 393
    :catchall_5
    move-exception v0

    .line 394
    move-object/from16 v16, v0

    .line 395
    .line 396
    move-object v3, v6

    .line 397
    goto :goto_a

    .line 398
    :catch_3
    move-exception v0

    .line 399
    move-object v3, v6

    .line 400
    goto :goto_b

    .line 401
    :goto_a
    :try_start_9
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 402
    .line 403
    new-instance v11, Ldg2;

    .line 404
    .line 405
    iget-object v0, v1, Lf52;->h:Lu22;

    .line 406
    .line 407
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 408
    .line 409
    iget-object v12, v0, Lth2;->c:Ljava/lang/String;

    .line 410
    .line 411
    sget-object v13, Lsi2;->i:Lsi2;

    .line 412
    .line 413
    iget-object v14, v0, Lth2;->j:Ljava/lang/String;

    .line 414
    .line 415
    const-string v15, "Unable to read script config."

    .line 416
    .line 417
    invoke-direct/range {v11 .. v16}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    throw v11

    .line 421
    :goto_b
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 422
    .line 423
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 424
    :catchall_6
    move-exception v0

    .line 425
    goto :goto_c

    .line 426
    :cond_f
    :try_start_a
    iget-object v0, v1, Lf52;->h:Lu22;

    .line 427
    .line 428
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 429
    .line 430
    iget-object v0, v0, Lth2;->c:Ljava/lang/String;

    .line 431
    .line 432
    new-instance v1, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 454
    :goto_c
    check-cast v6, Lkl1;

    .line 455
    .line 456
    invoke-virtual {v6, v10}, Lkl1;->f(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    throw v0
.end method


# virtual methods
.method public final c()Lcom/dokar/quickjs/QuickJs;
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lcom/dokar/quickjs/QuickJs;->Companion:Ls42;

    .line 2
    .line 3
    iget-object v1, p0, Lf52;->k:Lc20;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/dokar/quickjs/QuickJs;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, v2}, Lcom/dokar/quickjs/QuickJs;-><init>(Lc20;Lc50;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :goto_0
    move-object v6, v0

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    sget-object v0, Lrk2;->m:Lrk2;

    .line 23
    .line 24
    iput-object v0, p0, Lf52;->o:Lrk2;

    .line 25
    .line 26
    new-instance v1, Ldg2;

    .line 27
    .line 28
    iget-object p0, p0, Lf52;->h:Lu22;

    .line 29
    .line 30
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 31
    .line 32
    iget-object v2, p0, Lth2;->c:Ljava/lang/String;

    .line 33
    .line 34
    sget-object v3, Lsi2;->k:Lsi2;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    const-string p0, "Unable to create QuickJS runtime."

    .line 43
    .line 44
    :cond_0
    move-object v5, p0

    .line 45
    const/4 v7, 0x4

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct/range {v1 .. v7}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf52;->n:Lvn1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lvn1;->f()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lf52;->n:Lvn1;

    .line 10
    .line 11
    iget-object v1, p0, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v0, p0, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 19
    .line 20
    sget-object v0, Lrk2;->l:Lrk2;

    .line 21
    .line 22
    iput-object v0, p0, Lf52;->o:Lrk2;

    .line 23
    .line 24
    return-void
.end method

.method public final e(Lci2;Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v2, Lsi2;->n:Lsi2;

    .line 2
    .line 3
    instance-of v0, p2, La52;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, La52;

    .line 9
    .line 10
    iget v1, v0, La52;->q:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v1, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v1, v3

    .line 19
    iput v1, v0, La52;->q:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, La52;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, La52;-><init>(Lf52;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, La52;->o:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lk20;->h:Lk20;

    .line 30
    .line 31
    iget v3, v0, La52;->q:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, La52;->n:Lcom/dokar/quickjs/QuickJs;

    .line 44
    .line 45
    iget-object v1, v0, La52;->m:Lvn1;

    .line 46
    .line 47
    iget-object v3, v0, La52;->l:Lil1;

    .line 48
    .line 49
    iget-object v4, v0, La52;->k:Lci2;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    move-object v5, p1

    .line 58
    move-object v8, v1

    .line 59
    move-object p2, v3

    .line 60
    move-object p1, v4

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v7

    .line 73
    :cond_2
    iget-object p1, v0, La52;->l:Lil1;

    .line 74
    .line 75
    iget-object v3, v0, La52;->k:Lci2;

    .line 76
    .line 77
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object p2, p1

    .line 81
    move-object p1, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Lf52;->l:Lkl1;

    .line 87
    .line 88
    iput-object p1, v0, La52;->k:Lci2;

    .line 89
    .line 90
    iput-object p2, v0, La52;->l:Lil1;

    .line 91
    .line 92
    iput v5, v0, La52;->q:I

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    if-ne v3, v1, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lf52;->h()Lcom/dokar/quickjs/QuickJs;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v8, p0, Lf52;->n:Lvn1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 106
    .line 107
    if-eqz v8, :cond_8

    .line 108
    .line 109
    :try_start_2
    invoke-virtual {v8, p1}, Lvn1;->u(Lci2;)V

    .line 110
    .line 111
    .line 112
    const-string v9, "typeof globalThis.__nukeMessagingDispatch === \"function\"\n    ? globalThis.__nukeMessagingDispatch()\n    : -1"

    .line 113
    .line 114
    const-string v10, "__nuke_message__.js"

    .line 115
    .line 116
    iput-object p1, v0, La52;->k:Lci2;

    .line 117
    .line 118
    iput-object p2, v0, La52;->l:Lil1;

    .line 119
    .line 120
    iput-object v8, v0, La52;->m:Lvn1;

    .line 121
    .line 122
    iput-object v3, v0, La52;->n:Lcom/dokar/quickjs/QuickJs;

    .line 123
    .line 124
    iput v4, v0, La52;->q:I

    .line 125
    .line 126
    invoke-virtual {v3, v9, v10, v6, v0}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 130
    if-ne v0, v1, :cond_5

    .line 131
    .line 132
    :goto_2
    return-object v1

    .line 133
    :cond_5
    move-object v4, p1

    .line 134
    move-object p1, v3

    .line 135
    move-object v1, v8

    .line 136
    move-object v3, p2

    .line 137
    move-object p2, v0

    .line 138
    :goto_3
    :try_start_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 139
    .line 140
    invoke-static {v0}, Ld72;->c(Ljava/lang/Class;)Lh63;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v8, Lb52;

    .line 145
    .line 146
    invoke-direct {v8, p1, v6}, Lb52;-><init>(Lcom/dokar/quickjs/QuickJs;I)V

    .line 147
    .line 148
    .line 149
    invoke-static {p2, v0, v8}, Ltp0;->m(Ljava/lang/Object;Lh63;Lin0;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-gez p1, :cond_6

    .line 160
    .line 161
    new-instance p1, Lbi2;

    .line 162
    .line 163
    invoke-direct {p1, v6, v6}, Lbi2;-><init>(IZ)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    new-instance p2, Lbi2;

    .line 168
    .line 169
    invoke-direct {p2, p1, v5}, Lbi2;-><init>(IZ)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    .line 171
    .line 172
    move-object p1, p2

    .line 173
    :goto_4
    :try_start_4
    iget-object p0, v4, Lci2;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v1, p0}, Lvn1;->k(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 176
    .line 177
    .line 178
    check-cast v3, Lkl1;

    .line 179
    .line 180
    invoke-virtual {v3, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    move-object p0, v0

    .line 186
    move-object p2, v3

    .line 187
    goto :goto_9

    .line 188
    :catchall_2
    move-exception v0

    .line 189
    move-object v5, v0

    .line 190
    goto :goto_5

    .line 191
    :catch_1
    move-exception v0

    .line 192
    move-object p0, v0

    .line 193
    move-object v4, p1

    .line 194
    move-object v3, p2

    .line 195
    move-object v1, v8

    .line 196
    goto :goto_7

    .line 197
    :goto_5
    :try_start_5
    new-instance v0, Ldg2;

    .line 198
    .line 199
    iget-object p0, p0, Lf52;->h:Lu22;

    .line 200
    .line 201
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 202
    .line 203
    iget-object v1, p0, Lth2;->c:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    if-nez p0, :cond_7

    .line 210
    .line 211
    const-string p0, "Unable to dispatch the message event."

    .line 212
    .line 213
    :cond_7
    move-object v4, p0

    .line 214
    goto :goto_6

    .line 215
    :catchall_3
    move-exception v0

    .line 216
    move-object p0, v0

    .line 217
    goto :goto_8

    .line 218
    :goto_6
    const/4 v6, 0x4

    .line 219
    const/4 v3, 0x0

    .line 220
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 221
    .line 222
    .line 223
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 224
    :goto_7
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 225
    :catchall_4
    move-exception v0

    .line 226
    move-object p0, v0

    .line 227
    move-object v8, v1

    .line 228
    move-object p2, v3

    .line 229
    move-object p1, v4

    .line 230
    :goto_8
    :try_start_7
    iget-object p1, p1, Lci2;->a:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v8, p1}, Lvn1;->k(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :catchall_5
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    goto :goto_9

    .line 239
    :cond_8
    new-instance v0, Ldg2;

    .line 240
    .line 241
    iget-object p0, p0, Lf52;->h:Lu22;

    .line 242
    .line 243
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 244
    .line 245
    iget-object v1, p0, Lth2;->c:Ljava/lang/String;

    .line 246
    .line 247
    const-string v4, "Script API context is unavailable."

    .line 248
    .line 249
    const/4 v5, 0x0

    .line 250
    const/16 v6, 0x14

    .line 251
    .line 252
    const/4 v3, 0x0

    .line 253
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 254
    .line 255
    .line 256
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 257
    :goto_9
    check-cast p2, Lkl1;

    .line 258
    .line 259
    invoke-virtual {p2, v7}, Lkl1;->f(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    throw p0
.end method

.method public final g(Lcom/dokar/quickjs/QuickJs;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lf52;->h:Lu22;

    .line 2
    .line 3
    iget-object v0, p0, Lu22;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lii2;

    .line 20
    .line 21
    :try_start_0
    iget-object v2, v1, Lii2;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, v1, Lii2;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v2, v3}, Lcom/dokar/quickjs/QuickJs;->addModule(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    move-object v7, p1

    .line 32
    new-instance v2, Ldg2;

    .line 33
    .line 34
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 35
    .line 36
    iget-object v3, p0, Lth2;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v5, v1, Lii2;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_0

    .line 45
    .line 46
    const-string p0, "Unable to compile JavaScript module."

    .line 47
    .line 48
    :cond_0
    move-object v6, p0

    .line 49
    sget-object v4, Lsi2;->l:Lsi2;

    .line 50
    .line 51
    invoke-direct/range {v2 .. v7}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v2

    .line 55
    :cond_1
    return-void
.end method

.method public final h()Lcom/dokar/quickjs/QuickJs;
    .locals 7

    .line 1
    sget-object v2, Lsi2;->n:Lsi2;

    .line 2
    .line 3
    iget-object v0, p0, Lf52;->o:Lrk2;

    .line 4
    .line 5
    sget-object v1, Lrk2;->j:Lrk2;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ldg2;

    .line 15
    .line 16
    iget-object p0, p0, Lf52;->h:Lu22;

    .line 17
    .line 18
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 19
    .line 20
    iget-object v1, p0, Lth2;->c:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/16 v6, 0x14

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const-string v4, "QuickJS runtime is unavailable."

    .line 27
    .line 28
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    new-instance v0, Ldg2;

    .line 33
    .line 34
    iget-object v1, p0, Lf52;->h:Lu22;

    .line 35
    .line 36
    iget-object v1, v1, Lu22;->a:Lth2;

    .line 37
    .line 38
    iget-object v1, v1, Lth2;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p0, p0, Lf52;->o:Lrk2;

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v4, "Script is not running; current state is "

    .line 45
    .line 46
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, "."

    .line 53
    .line 54
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const/4 v5, 0x0

    .line 62
    const/16 v6, 0x14

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final j(Lcom/dokar/quickjs/QuickJs;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lc52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lc52;

    .line 7
    .line 8
    iget v1, v0, Lc52;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lc52;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lc52;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lc52;-><init>(Lf52;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lc52;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lc52;->n:I

    .line 28
    .line 29
    iget-object v2, p0, Lf52;->h:Lu22;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lc52;->k:Lcom/dokar/quickjs/QuickJs;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    move-object v8, p0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iget-object p2, v2, Lu22;->a:Lth2;

    .line 57
    .line 58
    iget-object p2, p2, Lth2;->g:Ljava/lang/String;

    .line 59
    .line 60
    iget-object p0, p0, Lf52;->i:Leg2;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, Ltp0;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p2, "__nuke_bootstrap__.js"

    .line 70
    .line 71
    iput-object p1, v0, Lc52;->k:Lcom/dokar/quickjs/QuickJs;

    .line 72
    .line 73
    iput v3, v0, Lc52;->n:I

    .line 74
    .line 75
    invoke-virtual {p1, p0, p2, v3, v0}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    sget-object p0, Lk20;->h:Lk20;

    .line 80
    .line 81
    if-ne p2, p0, :cond_3

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_3
    :goto_1
    :try_start_2
    invoke-static {}, Ld72;->b()Lh63;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance v0, Lb52;

    .line 89
    .line 90
    invoke-direct {v0, p1, v3}, Lb52;-><init>(Lcom/dokar/quickjs/QuickJs;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2, p0, v0}, Ltp0;->m(Ljava/lang/Object;Lh63;Lin0;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    sget-object p0, La83;->a:La83;

    .line 97
    .line 98
    return-object p0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    goto :goto_3

    .line 102
    :goto_2
    new-instance v3, Ldg2;

    .line 103
    .line 104
    iget-object p0, v2, Lu22;->a:Lth2;

    .line 105
    .line 106
    iget-object v4, p0, Lth2;->c:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v6, p0, Lth2;->g:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-nez p0, :cond_4

    .line 115
    .line 116
    const-string p0, "Unable to evaluate the entry module."

    .line 117
    .line 118
    :cond_4
    move-object v7, p0

    .line 119
    sget-object v5, Lsi2;->m:Lsi2;

    .line 120
    .line 121
    invoke-direct/range {v3 .. v8}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v3

    .line 125
    :goto_3
    throw p0
.end method

.method public final k(Lu00;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, Lrk2;->l:Lrk2;

    .line 6
    .line 7
    instance-of v3, v0, Le52;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Le52;

    .line 13
    .line 14
    iget v4, v3, Le52;->r:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Le52;->r:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Le52;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, Le52;-><init>(Lf52;Lu00;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Le52;->p:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lk20;->h:Lk20;

    .line 34
    .line 35
    iget v5, v3, Le52;->r:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget-object v4, v3, Le52;->o:Lcom/dokar/quickjs/QuickJs;

    .line 47
    .line 48
    iget-object v5, v3, Le52;->n:Lcom/dokar/quickjs/QuickJs;

    .line 49
    .line 50
    iget-object v7, v3, Le52;->m:Lil1;

    .line 51
    .line 52
    iget-object v9, v3, Le52;->l:Lo72;

    .line 53
    .line 54
    iget-object v3, v3, Le52;->k:Lo72;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object/from16 v17, v0

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :catch_0
    move-exception v0

    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v8

    .line 75
    :cond_2
    iget-object v5, v3, Le52;->m:Lil1;

    .line 76
    .line 77
    iget-object v9, v3, Le52;->l:Lo72;

    .line 78
    .line 79
    iget-object v10, v3, Le52;->k:Lo72;

    .line 80
    .line 81
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lo72;

    .line 89
    .line 90
    invoke-direct {v0}, Lo72;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v5, Lo72;

    .line 94
    .line 95
    invoke-direct {v5}, Lo72;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v9, v1, Lf52;->l:Lkl1;

    .line 99
    .line 100
    iput-object v0, v3, Le52;->k:Lo72;

    .line 101
    .line 102
    iput-object v5, v3, Le52;->l:Lo72;

    .line 103
    .line 104
    iput-object v9, v3, Le52;->m:Lil1;

    .line 105
    .line 106
    iput v7, v3, Le52;->r:I

    .line 107
    .line 108
    invoke-virtual {v9, v3}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    if-ne v10, v4, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move-object v10, v9

    .line 116
    move-object v9, v5

    .line 117
    move-object v5, v10

    .line 118
    move-object v10, v0

    .line 119
    :goto_1
    :try_start_1
    iget-object v0, v1, Lf52;->o:Lrk2;

    .line 120
    .line 121
    if-ne v0, v2, :cond_5

    .line 122
    .line 123
    goto/16 :goto_b

    .line 124
    .line 125
    :cond_5
    iget-object v11, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 126
    .line 127
    sget-object v0, Lrk2;->k:Lrk2;

    .line 128
    .line 129
    iput-object v0, v1, Lf52;->o:Lrk2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 130
    .line 131
    if-eqz v11, :cond_a

    .line 132
    .line 133
    :try_start_2
    invoke-virtual {v11}, Lcom/dokar/quickjs/QuickJs;->isClosed()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_a

    .line 138
    .line 139
    iget-object v0, v1, Lf52;->i:Leg2;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 142
    .line 143
    .line 144
    :try_start_3
    const-string v0, "const entryModule = globalThis.__nukeScript;\nif (entryModule && typeof entryModule.deactivate === \"function\") {\n    await entryModule.deactivate();\n}"

    .line 145
    .line 146
    const-string v12, "__nuke_shutdown__.js"

    .line 147
    .line 148
    iput-object v10, v3, Le52;->k:Lo72;

    .line 149
    .line 150
    iput-object v9, v3, Le52;->l:Lo72;

    .line 151
    .line 152
    iput-object v5, v3, Le52;->m:Lil1;

    .line 153
    .line 154
    iput-object v11, v3, Le52;->n:Lcom/dokar/quickjs/QuickJs;

    .line 155
    .line 156
    iput-object v11, v3, Le52;->o:Lcom/dokar/quickjs/QuickJs;

    .line 157
    .line 158
    iput v6, v3, Le52;->r:I

    .line 159
    .line 160
    invoke-virtual {v11, v0, v12, v7, v3}, Lcom/dokar/quickjs/QuickJs;->evaluateInternal(Ljava/lang/String;Ljava/lang/String;ZLt00;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    if-ne v0, v4, :cond_6

    .line 165
    .line 166
    :goto_2
    return-object v4

    .line 167
    :cond_6
    move-object v7, v5

    .line 168
    move-object v3, v10

    .line 169
    move-object v4, v11

    .line 170
    move-object v5, v4

    .line 171
    :goto_3
    :try_start_4
    invoke-static {}, Ld72;->b()Lh63;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    new-instance v11, Lb52;

    .line 176
    .line 177
    invoke-direct {v11, v4, v6}, Lb52;-><init>(Lcom/dokar/quickjs/QuickJs;I)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0, v10, v11}, Ltp0;->m(Ljava/lang/Object;Lh63;Lin0;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 181
    .line 182
    .line 183
    :goto_4
    move-object v10, v3

    .line 184
    move-object v11, v5

    .line 185
    move-object v5, v7

    .line 186
    goto :goto_a

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    move-object/from16 v17, v0

    .line 189
    .line 190
    move-object v7, v5

    .line 191
    move-object v3, v10

    .line 192
    move-object v5, v11

    .line 193
    goto :goto_5

    .line 194
    :catch_1
    move-exception v0

    .line 195
    move-object v7, v5

    .line 196
    move-object v3, v10

    .line 197
    move-object v5, v11

    .line 198
    goto :goto_7

    .line 199
    :goto_5
    :try_start_5
    new-instance v12, Ldg2;

    .line 200
    .line 201
    iget-object v0, v1, Lf52;->h:Lu22;

    .line 202
    .line 203
    iget-object v0, v0, Lu22;->a:Lth2;

    .line 204
    .line 205
    iget-object v13, v0, Lth2;->c:Ljava/lang/String;

    .line 206
    .line 207
    sget-object v14, Lsi2;->o:Lsi2;

    .line 208
    .line 209
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-nez v0, :cond_7

    .line 214
    .line 215
    const-string v0, "Script deactivation failed."

    .line 216
    .line 217
    :cond_7
    move-object/from16 v16, v0

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :catchall_2
    move-exception v0

    .line 221
    move-object v11, v5

    .line 222
    move-object v5, v7

    .line 223
    goto :goto_8

    .line 224
    :goto_6
    const/16 v18, 0x4

    .line 225
    .line 226
    const/4 v15, 0x0

    .line 227
    invoke-direct/range {v12 .. v18}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 228
    .line 229
    .line 230
    iput-object v12, v3, Lo72;->i:Ljava/lang/Object;

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :goto_7
    iput-object v0, v9, Lo72;->i:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :catchall_3
    move-exception v0

    .line 237
    :goto_8
    :try_start_6
    iget-object v3, v1, Lf52;->n:Lvn1;

    .line 238
    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    invoke-virtual {v3}, Lvn1;->f()V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :catchall_4
    move-exception v0

    .line 246
    goto :goto_c

    .line 247
    :cond_8
    :goto_9
    iput-object v8, v1, Lf52;->n:Lvn1;

    .line 248
    .line 249
    if-eqz v11, :cond_9

    .line 250
    .line 251
    invoke-virtual {v11}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 252
    .line 253
    .line 254
    :cond_9
    iput-object v8, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 255
    .line 256
    iput-object v2, v1, Lf52;->o:Lrk2;

    .line 257
    .line 258
    throw v0

    .line 259
    :cond_a
    :goto_a
    iget-object v0, v1, Lf52;->n:Lvn1;

    .line 260
    .line 261
    if-eqz v0, :cond_b

    .line 262
    .line 263
    invoke-virtual {v0}, Lvn1;->f()V

    .line 264
    .line 265
    .line 266
    :cond_b
    iput-object v8, v1, Lf52;->n:Lvn1;

    .line 267
    .line 268
    if-eqz v11, :cond_c

    .line 269
    .line 270
    invoke-virtual {v11}, Lcom/dokar/quickjs/QuickJs;->close()V

    .line 271
    .line 272
    .line 273
    :cond_c
    iput-object v8, v1, Lf52;->m:Lcom/dokar/quickjs/QuickJs;

    .line 274
    .line 275
    iput-object v2, v1, Lf52;->o:Lrk2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 276
    .line 277
    :goto_b
    check-cast v5, Lkl1;

    .line 278
    .line 279
    invoke-virtual {v5, v8}, Lkl1;->f(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v9, Lo72;->i:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Ljava/util/concurrent/CancellationException;

    .line 285
    .line 286
    if-nez v0, :cond_e

    .line 287
    .line 288
    iget-object v0, v10, Lo72;->i:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Ldg2;

    .line 291
    .line 292
    if-nez v0, :cond_d

    .line 293
    .line 294
    sget-object v0, La83;->a:La83;

    .line 295
    .line 296
    return-object v0

    .line 297
    :cond_d
    throw v0

    .line 298
    :cond_e
    throw v0

    .line 299
    :goto_c
    check-cast v5, Lkl1;

    .line 300
    .line 301
    invoke-virtual {v5, v8}, Lkl1;->f(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    throw v0
.end method
