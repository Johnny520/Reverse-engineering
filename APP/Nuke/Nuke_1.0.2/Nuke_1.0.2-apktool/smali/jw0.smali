.class public final Ljw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lvn1;

.field public final b:Ldq1;

.field public final c:Lbf2;

.field public final d:Lpn1;

.field public final e:Leo2;

.field public final f:Let1;


# direct methods
.method public constructor <init>(Lvn1;Ldq1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljw0;->a:Lvn1;

    .line 5
    .line 6
    iput-object p2, p0, Ljw0;->b:Ldq1;

    .line 7
    .line 8
    iget-object p2, p1, Lvn1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Ldf2;

    .line 11
    .line 12
    iget-object p2, p2, Ldf2;->a:Lbf2;

    .line 13
    .line 14
    iput-object p2, p0, Ljw0;->c:Lbf2;

    .line 15
    .line 16
    new-instance v0, Lpn1;

    .line 17
    .line 18
    iget-object v1, p1, Lvn1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lu22;

    .line 21
    .line 22
    iget-object v1, v1, Lu22;->a:Lth2;

    .line 23
    .line 24
    iget-object v1, v1, Lth2;->k:Lri2;

    .line 25
    .line 26
    iget-object v1, v1, Lri2;->a:Lji2;

    .line 27
    .line 28
    iget-object p1, p1, Lvn1;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lpi2;

    .line 31
    .line 32
    invoke-direct {v0, v1, p1}, Lpn1;-><init>(Lji2;Lpi2;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ljw0;->d:Lpn1;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget p1, Lfo2;->a:I

    .line 41
    .line 42
    new-instance p1, Leo2;

    .line 43
    .line 44
    const/16 p2, 0x8

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ldo2;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Ljw0;->e:Leo2;

    .line 50
    .line 51
    new-instance p1, Ldt1;

    .line 52
    .line 53
    invoke-direct {p1}, Ldt1;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object p2, Lsn;->D:Lsn;

    .line 57
    .line 58
    iput-object p2, p1, Ldt1;->k:Lsn;

    .line 59
    .line 60
    const/4 p2, 0x0

    .line 61
    iput-boolean p2, p1, Ldt1;->i:Z

    .line 62
    .line 63
    iput-boolean p2, p1, Ldt1;->j:Z

    .line 64
    .line 65
    iput-boolean p2, p1, Ldt1;->f:Z

    .line 66
    .line 67
    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 68
    .line 69
    iget-object v0, p1, Ldt1;->m:Ljava/net/Proxy;

    .line 70
    .line 71
    invoke-static {p2, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    iput-object v0, p1, Ldt1;->D:Lhh1;

    .line 79
    .line 80
    :cond_0
    iput-object p2, p1, Ldt1;->m:Ljava/net/Proxy;

    .line 81
    .line 82
    new-instance p2, Let1;

    .line 83
    .line 84
    invoke-direct {p2, p1}, Let1;-><init>(Ldt1;)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Ljw0;->f:Let1;

    .line 88
    .line 89
    return-void
.end method

.method public static final a(Ljw0;Lk82;Ltw0;Lnn0;Lu00;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v2, v1, Liw0;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Liw0;

    .line 14
    .line 15
    iget v3, v2, Liw0;->r:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    sub-int/2addr v3, v4

    .line 24
    iput v3, v2, Liw0;->r:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v2, Liw0;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Liw0;-><init>(Ljw0;Lu00;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v1, v2, Liw0;->p:Ljava/lang/Object;

    .line 33
    .line 34
    iget v3, v2, Liw0;->r:I

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    sget-object v8, Lk20;->h:Lk20;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eq v3, v6, :cond_2

    .line 44
    .line 45
    if-ne v3, v5, :cond_1

    .line 46
    .line 47
    iget-object v2, v2, Liw0;->o:Lr92;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    move-object v5, v7

    .line 53
    goto/16 :goto_c

    .line 54
    .line 55
    :catchall_0
    move-exception v0

    .line 56
    :goto_1
    move-object v1, v0

    .line 57
    goto/16 :goto_d

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v7

    .line 65
    :cond_2
    iget-object v3, v2, Liw0;->n:La72;

    .line 66
    .line 67
    iget-object v9, v2, Liw0;->m:Lk82;

    .line 68
    .line 69
    iget-object v10, v2, Liw0;->l:Lnn0;

    .line 70
    .line 71
    iget-object v11, v2, Liw0;->k:Ltw0;

    .line 72
    .line 73
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v4, v10

    .line 77
    move-object v10, v3

    .line 78
    move-object v3, v4

    .line 79
    move-object v4, v2

    .line 80
    move-object v2, v11

    .line 81
    const/4 v14, 0x0

    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance v1, La72;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    move-object/from16 v3, p3

    .line 93
    .line 94
    move-object v10, v1

    .line 95
    move-object v9, v2

    .line 96
    move-object/from16 v1, p1

    .line 97
    .line 98
    move-object/from16 v2, p2

    .line 99
    .line 100
    :goto_2
    iget-object v11, v0, Ljw0;->d:Lpn1;

    .line 101
    .line 102
    iget-object v12, v1, Lk82;->a:Lyw0;

    .line 103
    .line 104
    iget-object v13, v11, Lpn1;->c:Ljava/util/ArrayList;

    .line 105
    .line 106
    iget-object v14, v11, Lpn1;->b:Ljava/util/ArrayList;

    .line 107
    .line 108
    iget-boolean v15, v11, Lpn1;->e:Z

    .line 109
    .line 110
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-boolean v11, v11, Lpn1;->a:Z

    .line 114
    .line 115
    if-eqz v11, :cond_4

    .line 116
    .line 117
    new-instance v11, Lmn1;

    .line 118
    .line 119
    invoke-direct {v11, v15}, Lmn1;-><init>(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_4
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-nez v11, :cond_1f

    .line 128
    .line 129
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-nez v11, :cond_1e

    .line 134
    .line 135
    if-eqz v14, :cond_5

    .line 136
    .line 137
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_1d

    .line 142
    .line 143
    :cond_5
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-eqz v14, :cond_1d

    .line 152
    .line 153
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    check-cast v14, Lon1;

    .line 158
    .line 159
    invoke-virtual {v14, v12}, Lon1;->a(Lyw0;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_1c

    .line 164
    .line 165
    if-eqz v13, :cond_6

    .line 166
    .line 167
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-nez v11, :cond_1d

    .line 172
    .line 173
    :cond_6
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    if-eqz v13, :cond_1d

    .line 182
    .line 183
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    check-cast v13, Lon1;

    .line 188
    .line 189
    invoke-virtual {v13, v12}, Lon1;->a(Lyw0;)Z

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eqz v13, :cond_1b

    .line 194
    .line 195
    new-instance v11, Lmn1;

    .line 196
    .line 197
    invoke-direct {v11, v15}, Lmn1;-><init>(Z)V

    .line 198
    .line 199
    .line 200
    :goto_5
    iget-wide v12, v2, Ltw0;->d:J

    .line 201
    .line 202
    iget-object v14, v0, Ljw0;->f:Let1;

    .line 203
    .line 204
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    new-instance v15, Ldt1;

    .line 208
    .line 209
    invoke-direct {v15}, Ldt1;-><init>()V

    .line 210
    .line 211
    .line 212
    iget-object v5, v14, Let1;->a:Lkj1;

    .line 213
    .line 214
    iput-object v5, v15, Ldt1;->a:Lkj1;

    .line 215
    .line 216
    iget-object v5, v14, Let1;->E:Ln4;

    .line 217
    .line 218
    iput-object v5, v15, Ldt1;->b:Ln4;

    .line 219
    .line 220
    iget-object v5, v15, Ldt1;->c:Ljava/util/ArrayList;

    .line 221
    .line 222
    iget-object v4, v14, Let1;->b:Ljava/util/List;

    .line 223
    .line 224
    invoke-static {v4, v5}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 225
    .line 226
    .line 227
    iget-object v4, v15, Ldt1;->d:Ljava/util/ArrayList;

    .line 228
    .line 229
    iget-object v5, v14, Let1;->c:Ljava/util/List;

    .line 230
    .line 231
    invoke-static {v5, v4}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 232
    .line 233
    .line 234
    iget-object v4, v14, Let1;->d:Lum2;

    .line 235
    .line 236
    iput-object v4, v15, Ldt1;->e:Lum2;

    .line 237
    .line 238
    iget-boolean v4, v14, Let1;->e:Z

    .line 239
    .line 240
    iput-boolean v4, v15, Ldt1;->f:Z

    .line 241
    .line 242
    iget-boolean v4, v14, Let1;->f:Z

    .line 243
    .line 244
    iput-boolean v4, v15, Ldt1;->g:Z

    .line 245
    .line 246
    iget-object v4, v14, Let1;->g:Lgd3;

    .line 247
    .line 248
    iput-object v4, v15, Ldt1;->h:Lgd3;

    .line 249
    .line 250
    iget-boolean v4, v14, Let1;->h:Z

    .line 251
    .line 252
    iput-boolean v4, v15, Ldt1;->i:Z

    .line 253
    .line 254
    iget-boolean v4, v14, Let1;->i:Z

    .line 255
    .line 256
    iput-boolean v4, v15, Ldt1;->j:Z

    .line 257
    .line 258
    iget-object v4, v14, Let1;->j:Lsn;

    .line 259
    .line 260
    iput-object v4, v15, Ldt1;->k:Lsn;

    .line 261
    .line 262
    iget-object v4, v14, Let1;->k:Lna0;

    .line 263
    .line 264
    iput-object v4, v15, Ldt1;->l:Lna0;

    .line 265
    .line 266
    iget-object v5, v14, Let1;->l:Ljava/net/Proxy;

    .line 267
    .line 268
    iput-object v5, v15, Ldt1;->m:Ljava/net/Proxy;

    .line 269
    .line 270
    iget-object v5, v14, Let1;->m:Ljava/net/ProxySelector;

    .line 271
    .line 272
    iput-object v5, v15, Ldt1;->n:Ljava/net/ProxySelector;

    .line 273
    .line 274
    iget-object v5, v14, Let1;->n:Lgd3;

    .line 275
    .line 276
    iput-object v5, v15, Ldt1;->o:Lgd3;

    .line 277
    .line 278
    iget-object v5, v14, Let1;->o:Ljavax/net/SocketFactory;

    .line 279
    .line 280
    iput-object v5, v15, Ldt1;->p:Ljavax/net/SocketFactory;

    .line 281
    .line 282
    iget-object v5, v14, Let1;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 283
    .line 284
    iput-object v5, v15, Ldt1;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 285
    .line 286
    iget-object v5, v14, Let1;->q:Ljavax/net/ssl/X509TrustManager;

    .line 287
    .line 288
    iput-object v5, v15, Ldt1;->r:Ljavax/net/ssl/X509TrustManager;

    .line 289
    .line 290
    iget-object v5, v14, Let1;->r:Ljava/util/List;

    .line 291
    .line 292
    iput-object v5, v15, Ldt1;->s:Ljava/util/List;

    .line 293
    .line 294
    iget-object v5, v14, Let1;->s:Ljava/util/List;

    .line 295
    .line 296
    iput-object v5, v15, Ldt1;->t:Ljava/util/List;

    .line 297
    .line 298
    iget-object v5, v14, Let1;->t:Lys1;

    .line 299
    .line 300
    iput-object v5, v15, Ldt1;->u:Lys1;

    .line 301
    .line 302
    iget-object v5, v14, Let1;->u:Lcq;

    .line 303
    .line 304
    iput-object v5, v15, Ldt1;->v:Lcq;

    .line 305
    .line 306
    iget-object v5, v14, Let1;->v:Lup0;

    .line 307
    .line 308
    iput-object v5, v15, Ldt1;->w:Lup0;

    .line 309
    .line 310
    iget v5, v14, Let1;->w:I

    .line 311
    .line 312
    iput v5, v15, Ldt1;->x:I

    .line 313
    .line 314
    iget v5, v14, Let1;->x:I

    .line 315
    .line 316
    iput v5, v15, Ldt1;->y:I

    .line 317
    .line 318
    iget v5, v14, Let1;->y:I

    .line 319
    .line 320
    iput v5, v15, Ldt1;->z:I

    .line 321
    .line 322
    iget v5, v14, Let1;->z:I

    .line 323
    .line 324
    iput v5, v15, Ldt1;->A:I

    .line 325
    .line 326
    iget v5, v14, Let1;->A:I

    .line 327
    .line 328
    iput v5, v15, Ldt1;->B:I

    .line 329
    .line 330
    iget-wide v6, v14, Let1;->B:J

    .line 331
    .line 332
    iput-wide v6, v15, Ldt1;->C:J

    .line 333
    .line 334
    iget-object v6, v14, Let1;->C:Lhh1;

    .line 335
    .line 336
    iput-object v6, v15, Ldt1;->D:Lhh1;

    .line 337
    .line 338
    iget-object v6, v14, Let1;->D:Liy2;

    .line 339
    .line 340
    iput-object v6, v15, Ldt1;->E:Liy2;

    .line 341
    .line 342
    new-instance v6, Lk93;

    .line 343
    .line 344
    iget-boolean v7, v11, Lmn1;->a:Z

    .line 345
    .line 346
    invoke-direct {v6, v7}, Lk93;-><init>(Z)V

    .line 347
    .line 348
    .line 349
    if-eq v6, v4, :cond_7

    .line 350
    .line 351
    const/4 v5, 0x0

    .line 352
    iput-object v5, v15, Ldt1;->D:Lhh1;

    .line 353
    .line 354
    :cond_7
    iput-object v6, v15, Ldt1;->l:Lna0;

    .line 355
    .line 356
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-static {v12, v13, v4}, Lwg3;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    iput v4, v15, Ldt1;->x:I

    .line 366
    .line 367
    new-instance v4, Let1;

    .line 368
    .line 369
    invoke-direct {v4, v15}, Let1;-><init>(Ldt1;)V

    .line 370
    .line 371
    .line 372
    new-instance v6, Ls52;

    .line 373
    .line 374
    invoke-direct {v6, v4, v1}, Ls52;-><init>(Let1;Lk82;)V

    .line 375
    .line 376
    .line 377
    iput-object v2, v9, Liw0;->k:Ltw0;

    .line 378
    .line 379
    iput-object v3, v9, Liw0;->l:Lnn0;

    .line 380
    .line 381
    iput-object v1, v9, Liw0;->m:Lk82;

    .line 382
    .line 383
    iput-object v10, v9, Liw0;->n:La72;

    .line 384
    .line 385
    const/4 v4, 0x1

    .line 386
    iput v4, v9, Liw0;->r:I

    .line 387
    .line 388
    sget-object v7, Lmw0;->a:Ljava/util/Set;

    .line 389
    .line 390
    new-instance v7, Lmp;

    .line 391
    .line 392
    invoke-static {v9}, Lgf1;->z(Lt00;)Lt00;

    .line 393
    .line 394
    .line 395
    move-result-object v11

    .line 396
    invoke-direct {v7, v4, v11}, Lmp;-><init>(ILt00;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v7}, Lmp;->u()V

    .line 400
    .line 401
    .line 402
    new-instance v11, Lzm;

    .line 403
    .line 404
    invoke-direct {v11, v4, v6}, Lzm;-><init>(ILjava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v7, v11}, Lmp;->w(Lin0;)V

    .line 408
    .line 409
    .line 410
    new-instance v4, Llw0;

    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    invoke-direct {v4, v7, v14}, Llw0;-><init>(Lmp;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v6, v4}, Ls52;->g(Ldp;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v7}, Lmp;->t()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    if-ne v4, v8, :cond_8

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_8
    move-object/from16 v24, v9

    .line 427
    .line 428
    move-object v9, v1

    .line 429
    move-object v1, v4

    .line 430
    move-object/from16 v4, v24

    .line 431
    .line 432
    :goto_6
    check-cast v1, Lr92;

    .line 433
    .line 434
    :try_start_1
    sget-object v6, Lmw0;->d:Ljava/util/Set;

    .line 435
    .line 436
    iget v7, v1, Lr92;->k:I

    .line 437
    .line 438
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-nez v6, :cond_9

    .line 447
    .line 448
    :goto_7
    const/4 v6, 0x0

    .line 449
    goto :goto_a

    .line 450
    :cond_9
    const-string v6, "Location"

    .line 451
    .line 452
    iget-object v7, v1, Lr92;->m:Ljs0;

    .line 453
    .line 454
    invoke-virtual {v7, v6}, Ljs0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    if-nez v6, :cond_a

    .line 459
    .line 460
    const/4 v6, 0x0

    .line 461
    :cond_a
    if-nez v6, :cond_b

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_b
    iget-object v7, v1, Lr92;->h:Lk82;

    .line 465
    .line 466
    iget-object v7, v7, Lk82;->a:Lyw0;

    .line 467
    .line 468
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 469
    .line 470
    .line 471
    :try_start_2
    new-instance v11, Lxw0;

    .line 472
    .line 473
    invoke-direct {v11}, Lxw0;-><init>()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v11, v7, v6}, Lxw0;->e(Lyw0;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 477
    .line 478
    .line 479
    goto :goto_8

    .line 480
    :catch_0
    const/4 v11, 0x0

    .line 481
    :goto_8
    if-eqz v11, :cond_c

    .line 482
    .line 483
    :try_start_3
    invoke-virtual {v11}, Lxw0;->b()Lyw0;

    .line 484
    .line 485
    .line 486
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 487
    goto :goto_9

    .line 488
    :cond_c
    const/4 v6, 0x0

    .line 489
    :goto_9
    if-eqz v6, :cond_1a

    .line 490
    .line 491
    :goto_a
    if-nez v6, :cond_f

    .line 492
    .line 493
    :try_start_4
    iget v0, v10, La72;->h:I

    .line 494
    .line 495
    if-lez v0, :cond_d

    .line 496
    .line 497
    const/4 v14, 0x1

    .line 498
    :cond_d
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    const/4 v5, 0x0

    .line 503
    iput-object v5, v4, Liw0;->k:Ltw0;

    .line 504
    .line 505
    iput-object v5, v4, Liw0;->l:Lnn0;

    .line 506
    .line 507
    iput-object v5, v4, Liw0;->m:Lk82;

    .line 508
    .line 509
    iput-object v5, v4, Liw0;->n:La72;

    .line 510
    .line 511
    iput-object v1, v4, Liw0;->o:Lr92;

    .line 512
    .line 513
    const/4 v7, 0x2

    .line 514
    iput v7, v4, Liw0;->r:I

    .line 515
    .line 516
    invoke-interface {v3, v1, v0, v4}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 520
    if-ne v0, v8, :cond_e

    .line 521
    .line 522
    :goto_b
    return-object v8

    .line 523
    :cond_e
    move-object v2, v1

    .line 524
    const/4 v5, 0x0

    .line 525
    move-object v1, v0

    .line 526
    :goto_c
    invoke-static {v2, v5}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 527
    .line 528
    .line 529
    return-object v1

    .line 530
    :catchall_1
    move-exception v0

    .line 531
    move-object v2, v1

    .line 532
    goto/16 :goto_1

    .line 533
    .line 534
    :goto_d
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 535
    :catchall_2
    move-exception v0

    .line 536
    invoke-static {v2, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 537
    .line 538
    .line 539
    throw v0

    .line 540
    :cond_f
    const/4 v7, 0x2

    .line 541
    iget v11, v1, Lr92;->k:I

    .line 542
    .line 543
    invoke-virtual {v1}, Lr92;->close()V

    .line 544
    .line 545
    .line 546
    iget-object v1, v2, Ltw0;->e:Lx62;

    .line 547
    .line 548
    sget-object v12, Lx62;->j:Lx62;

    .line 549
    .line 550
    if-eq v1, v12, :cond_19

    .line 551
    .line 552
    iget v1, v10, La72;->h:I

    .line 553
    .line 554
    iget-object v12, v0, Ljw0;->c:Lbf2;

    .line 555
    .line 556
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    const/16 v12, 0xa

    .line 560
    .line 561
    if-ge v1, v12, :cond_18

    .line 562
    .line 563
    const/16 v1, 0x12f

    .line 564
    .line 565
    if-eq v11, v1, :cond_12

    .line 566
    .line 567
    const/16 v1, 0x12d

    .line 568
    .line 569
    if-eq v11, v1, :cond_10

    .line 570
    .line 571
    const/16 v1, 0x12e

    .line 572
    .line 573
    if-ne v11, v1, :cond_11

    .line 574
    .line 575
    :cond_10
    iget-object v1, v9, Lk82;->b:Ljava/lang/String;

    .line 576
    .line 577
    const-string v11, "POST"

    .line 578
    .line 579
    invoke-static {v1, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-eqz v1, :cond_11

    .line 584
    .line 585
    goto :goto_e

    .line 586
    :cond_11
    move v1, v14

    .line 587
    goto :goto_f

    .line 588
    :cond_12
    :goto_e
    const/4 v1, 0x1

    .line 589
    :goto_f
    const-string v11, "GET"

    .line 590
    .line 591
    const-string v12, "HEAD"

    .line 592
    .line 593
    if-eqz v1, :cond_13

    .line 594
    .line 595
    iget-object v13, v9, Lk82;->b:Ljava/lang/String;

    .line 596
    .line 597
    invoke-static {v13, v12}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v13

    .line 601
    if-nez v13, :cond_13

    .line 602
    .line 603
    move-object v13, v11

    .line 604
    goto :goto_10

    .line 605
    :cond_13
    iget-object v13, v9, Lk82;->b:Ljava/lang/String;

    .line 606
    .line 607
    :goto_10
    invoke-static {v13, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    if-nez v11, :cond_15

    .line 612
    .line 613
    invoke-static {v13, v12}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    if-eqz v11, :cond_14

    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_14
    iget-object v11, v9, Lk82;->d:Lo82;

    .line 621
    .line 622
    goto :goto_12

    .line 623
    :cond_15
    :goto_11
    const/4 v11, 0x0

    .line 624
    :goto_12
    invoke-virtual {v9}, Lk82;->a()Lcj;

    .line 625
    .line 626
    .line 627
    move-result-object v12

    .line 628
    iput-object v6, v12, Lcj;->a:Ljava/lang/Object;

    .line 629
    .line 630
    invoke-virtual {v12, v13, v11}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 631
    .line 632
    .line 633
    if-eqz v1, :cond_16

    .line 634
    .line 635
    iget-object v1, v12, Lcj;->c:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v1, Lye0;

    .line 638
    .line 639
    const-string v11, "Content-Type"

    .line 640
    .line 641
    invoke-virtual {v1, v11}, Lye0;->n(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    iget-object v1, v12, Lcj;->c:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v1, Lye0;

    .line 647
    .line 648
    const-string v11, "Content-Length"

    .line 649
    .line 650
    invoke-virtual {v1, v11}, Lye0;->n(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    iget-object v1, v12, Lcj;->c:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v1, Lye0;

    .line 656
    .line 657
    const-string v11, "Transfer-Encoding"

    .line 658
    .line 659
    invoke-virtual {v1, v11}, Lye0;->n(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    :cond_16
    iget-object v1, v9, Lk82;->a:Lyw0;

    .line 663
    .line 664
    iget-object v9, v1, Lyw0;->a:Ljava/lang/String;

    .line 665
    .line 666
    iget-object v11, v6, Lyw0;->a:Ljava/lang/String;

    .line 667
    .line 668
    invoke-static {v9, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    if-eqz v9, :cond_17

    .line 673
    .line 674
    iget-object v9, v1, Lyw0;->d:Ljava/lang/String;

    .line 675
    .line 676
    iget-object v11, v6, Lyw0;->d:Ljava/lang/String;

    .line 677
    .line 678
    invoke-static {v9, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v9

    .line 682
    if-eqz v9, :cond_17

    .line 683
    .line 684
    iget v1, v1, Lyw0;->e:I

    .line 685
    .line 686
    iget v6, v6, Lyw0;->e:I

    .line 687
    .line 688
    if-ne v1, v6, :cond_17

    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_17
    iget-object v1, v12, Lcj;->c:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v1, Lye0;

    .line 694
    .line 695
    const-string v6, "Authorization"

    .line 696
    .line 697
    invoke-virtual {v1, v6}, Lye0;->n(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    :goto_13
    new-instance v1, Lk82;

    .line 701
    .line 702
    invoke-direct {v1, v12}, Lk82;-><init>(Lcj;)V

    .line 703
    .line 704
    .line 705
    iget v6, v10, La72;->h:I

    .line 706
    .line 707
    const/16 v17, 0x1

    .line 708
    .line 709
    add-int/lit8 v6, v6, 0x1

    .line 710
    .line 711
    iput v6, v10, La72;->h:I

    .line 712
    .line 713
    move-object v9, v4

    .line 714
    move v5, v7

    .line 715
    move/from16 v6, v17

    .line 716
    .line 717
    const/4 v7, 0x0

    .line 718
    goto/16 :goto_2

    .line 719
    .line 720
    :cond_18
    const/16 v22, 0x0

    .line 721
    .line 722
    const/16 v23, 0x1c

    .line 723
    .line 724
    const-string v18, "QUOTA_EXCEEDED"

    .line 725
    .line 726
    const-string v19, "HTTP redirect limit has been exceeded."

    .line 727
    .line 728
    const/16 v20, 0x0

    .line 729
    .line 730
    const/16 v21, 0x0

    .line 731
    .line 732
    invoke-static/range {v18 .. v23}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 733
    .line 734
    .line 735
    const/4 v5, 0x0

    .line 736
    return-object v5

    .line 737
    :cond_19
    const/4 v5, 0x0

    .line 738
    const/4 v10, 0x0

    .line 739
    const/16 v11, 0x1c

    .line 740
    .line 741
    const-string v6, "NETWORK_ERROR"

    .line 742
    .line 743
    const-string v7, "HTTP redirects are disabled for this request."

    .line 744
    .line 745
    const/4 v8, 0x0

    .line 746
    const/4 v9, 0x0

    .line 747
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 748
    .line 749
    .line 750
    return-object v5

    .line 751
    :cond_1a
    :try_start_6
    new-instance v12, Lsd2;

    .line 752
    .line 753
    const-string v13, "NETWORK_ERROR"

    .line 754
    .line 755
    const-string v14, "The server returned an invalid redirect target."

    .line 756
    .line 757
    const/16 v17, 0x0

    .line 758
    .line 759
    const/16 v18, 0x1c

    .line 760
    .line 761
    const/4 v15, 0x0

    .line 762
    const/16 v16, 0x0

    .line 763
    .line 764
    invoke-direct/range {v12 .. v18}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 765
    .line 766
    .line 767
    throw v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 768
    :catchall_3
    move-exception v0

    .line 769
    invoke-virtual {v1}, Lr92;->close()V

    .line 770
    .line 771
    .line 772
    throw v0

    .line 773
    :cond_1b
    move v7, v5

    .line 774
    const/4 v7, 0x0

    .line 775
    goto/16 :goto_4

    .line 776
    .line 777
    :cond_1c
    move v7, v5

    .line 778
    const/4 v7, 0x0

    .line 779
    goto/16 :goto_3

    .line 780
    .line 781
    :cond_1d
    const/4 v10, 0x0

    .line 782
    const/16 v11, 0x1c

    .line 783
    .line 784
    const-string v6, "PERMISSION_DENIED"

    .line 785
    .line 786
    const-string v7, "The requested origin is outside the authorized network scope."

    .line 787
    .line 788
    const/4 v8, 0x0

    .line 789
    const/4 v9, 0x0

    .line 790
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 791
    .line 792
    .line 793
    const/4 v5, 0x0

    .line 794
    return-object v5

    .line 795
    :cond_1e
    move-object v5, v7

    .line 796
    const/4 v10, 0x0

    .line 797
    const/16 v11, 0x1c

    .line 798
    .line 799
    const-string v6, "PERMISSION_DENIED"

    .line 800
    .line 801
    const-string v7, "Network access has not been authorized by the user."

    .line 802
    .line 803
    const/4 v8, 0x0

    .line 804
    const/4 v9, 0x0

    .line 805
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 806
    .line 807
    .line 808
    return-object v5

    .line 809
    :cond_1f
    move-object v5, v7

    .line 810
    const/16 v16, 0x0

    .line 811
    .line 812
    const/16 v17, 0x1c

    .line 813
    .line 814
    const-string v12, "PERMISSION_DENIED"

    .line 815
    .line 816
    const-string v13, "The script did not declare network access."

    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const/4 v15, 0x0

    .line 820
    invoke-static/range {v12 .. v17}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 821
    .line 822
    .line 823
    return-object v5
.end method

.method public static final b(Ljw0;Ljs0;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljs0;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljs0;->b(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p1, v2}, Ljs0;->d(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v4}, Lmw0;->c(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v5}, Lmw0;->c(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    add-int/2addr v7, v6

    .line 34
    invoke-static {v3, v7}, Ljava/lang/Math;->addExact(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object v7, p0, Ljw0;->c:Lbf2;

    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/16 v7, 0x80

    .line 48
    .line 49
    if-ge v6, v7, :cond_0

    .line 50
    .line 51
    const/high16 v6, 0x10000

    .line 52
    .line 53
    if-gt v3, v6, :cond_0

    .line 54
    .line 55
    new-instance v6, Low1;

    .line 56
    .line 57
    invoke-direct {v6, v4, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v8, 0x0

    .line 67
    const/16 v9, 0x1c

    .line 68
    .line 69
    const-string v4, "QUOTA_EXCEEDED"

    .line 70
    .line 71
    const-string v5, "HTTP response headers exceed the limit."

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0

    .line 80
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final c(Lyw0;Ltw0;Lu00;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lzv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzv0;

    .line 7
    .line 8
    iget v1, v0, Lzv0;->o:I

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
    iput v1, v0, Lzv0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzv0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzv0;-><init>(Ljw0;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lzv0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzv0;->o:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p2, v0, Lzv0;->l:Ltw0;

    .line 36
    .line 37
    iget-object p1, v0, Lzv0;->k:Lyw0;

    .line 38
    .line 39
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p2, Ltw0;->c:Lpw0;

    .line 53
    .line 54
    if-nez p3, :cond_3

    .line 55
    .line 56
    move-object p3, v3

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    instance-of v1, p3, Lnw0;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    check-cast p3, Lnw0;

    .line 63
    .line 64
    iget-object p3, p3, Lnw0;->a:[B

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    instance-of v1, p3, Low0;

    .line 68
    .line 69
    if-eqz v1, :cond_d

    .line 70
    .line 71
    check-cast p3, Low0;

    .line 72
    .line 73
    iget-object p3, p3, Low0;->a:Lhg2;

    .line 74
    .line 75
    iput-object p1, v0, Lzv0;->k:Lyw0;

    .line 76
    .line 77
    iput-object p2, v0, Lzv0;->l:Ltw0;

    .line 78
    .line 79
    iput v2, v0, Lzv0;->o:I

    .line 80
    .line 81
    iget-object v1, p0, Ljw0;->b:Ldq1;

    .line 82
    .line 83
    invoke-virtual {v1, p3, v0}, Ldq1;->N(Lhg2;Lu00;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    sget-object v0, Lk20;->h:Lk20;

    .line 88
    .line 89
    if-ne p3, v0, :cond_5

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_5
    :goto_1
    check-cast p3, [B

    .line 93
    .line 94
    :goto_2
    if-eqz p3, :cond_7

    .line 95
    .line 96
    array-length v0, p3

    .line 97
    int-to-long v0, v0

    .line 98
    iget-object p0, p0, Ljw0;->c:Lbf2;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const-wide/32 v4, 0x1000000

    .line 104
    .line 105
    .line 106
    cmp-long p0, v0, v4

    .line 107
    .line 108
    if-gtz p0, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    const/4 v8, 0x0

    .line 112
    const/16 v9, 0x1c

    .line 113
    .line 114
    const-string v4, "QUOTA_EXCEEDED"

    .line 115
    .line 116
    const-string v5, "HTTP request body exceeds the size limit."

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 121
    .line 122
    .line 123
    return-object v3

    .line 124
    :cond_7
    :goto_3
    iget-object p0, p2, Ltw0;->a:Ljava/lang/String;

    .line 125
    .line 126
    const-string v0, "GET"

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_8

    .line 133
    .line 134
    const-string v0, "HEAD"

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    :cond_8
    if-nez p3, :cond_c

    .line 143
    .line 144
    :cond_9
    if-eqz p3, :cond_a

    .line 145
    .line 146
    sget v0, Lo82;->a:I

    .line 147
    .line 148
    array-length v0, p3

    .line 149
    array-length v1, p3

    .line 150
    int-to-long v4, v1

    .line 151
    const-wide/16 v6, 0x0

    .line 152
    .line 153
    int-to-long v8, v0

    .line 154
    invoke-static/range {v4 .. v9}, Lug3;->a(JJJ)V

    .line 155
    .line 156
    .line 157
    new-instance v1, Ln82;

    .line 158
    .line 159
    invoke-direct {v1, v3, v0, p3}, Ln82;-><init>(Lvf1;I[B)V

    .line 160
    .line 161
    .line 162
    move-object v3, v1

    .line 163
    goto :goto_4

    .line 164
    :cond_a
    sget-object p3, Lmw0;->b:Ljava/util/Set;

    .line 165
    .line 166
    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-eqz p3, :cond_b

    .line 171
    .line 172
    sget-object v3, Lmw0;->c:Ln82;

    .line 173
    .line 174
    :cond_b
    :goto_4
    new-instance p3, Lcj;

    .line 175
    .line 176
    const/4 v0, 0x4

    .line 177
    invoke-direct {p3, v0}, Lcj;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iput-object p1, p3, Lcj;->a:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object p1, p2, Ltw0;->b:Ljs0;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljs0;->c()Lye0;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iput-object p1, p3, Lcj;->c:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-virtual {p3, p0, v3}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 194
    .line 195
    .line 196
    new-instance p0, Lk82;

    .line 197
    .line 198
    invoke-direct {p0, p3}, Lk82;-><init>(Lcj;)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_c
    const-string p1, " requests cannot contain a body."

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    const/4 v8, 0x0

    .line 209
    const/16 v9, 0x1c

    .line 210
    .line 211
    const-string v4, "INVALID_ARGUMENT"

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    const/4 v7, 0x0

    .line 215
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 216
    .line 217
    .line 218
    return-object v3

    .line 219
    :cond_d
    invoke-static {}, Lc80;->s()V

    .line 220
    .line 221
    .line 222
    return-object v3
.end method

.method public final d(Ljava/lang/String;Lhg2;Ljava/lang/Object;Lu00;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v2, p4

    .line 2
    .line 3
    instance-of v3, v2, Law0;

    .line 4
    .line 5
    if-eqz v3, :cond_0

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    check-cast v3, Law0;

    .line 9
    .line 10
    iget v4, v3, Law0;->o:I

    .line 11
    .line 12
    const/high16 v5, -0x80000000

    .line 13
    .line 14
    and-int v6, v4, v5

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    iput v4, v3, Law0;->o:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v3, Law0;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, Law0;-><init>(Ljw0;Lu00;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v2, v7, Law0;->m:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v7, Law0;->o:I

    .line 32
    .line 33
    const/4 v8, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v9, 0x0

    .line 36
    sget-object v10, Lk20;->h:Lk20;

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    if-ne v3, v8, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v9

    .line 54
    :cond_2
    iget-object v0, v7, Law0;->l:Ltw0;

    .line 55
    .line 56
    iget-object v3, v7, Law0;->k:Lhg2;

    .line 57
    .line 58
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v4, v3

    .line 62
    move-object v3, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p2, Lhg2;->a:Lfg2;

    .line 68
    .line 69
    sget-object v3, Lfg2;->h:Lfg2;

    .line 70
    .line 71
    if-eq v2, v3, :cond_6

    .line 72
    .line 73
    iget-object v2, p0, Ljw0;->c:Lbf2;

    .line 74
    .line 75
    move-object/from16 v3, p3

    .line 76
    .line 77
    invoke-static {v3, v2, v4}, Lxe1;->c0(Ljava/lang/Object;Lbf2;Z)Ltw0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {p1}, Lmw0;->a(Ljava/lang/String;)Lyw0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iput-object p2, v7, Law0;->k:Lhg2;

    .line 86
    .line 87
    iput-object v2, v7, Law0;->l:Ltw0;

    .line 88
    .line 89
    iput v4, v7, Law0;->o:I

    .line 90
    .line 91
    invoke-virtual {p0, v3, v2, v7}, Ljw0;->c(Lyw0;Ltw0;Lu00;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-ne v3, v10, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move-object v4, v3

    .line 99
    move-object v3, v2

    .line 100
    move-object v2, v4

    .line 101
    move-object v4, p2

    .line 102
    :goto_2
    check-cast v2, Lk82;

    .line 103
    .line 104
    iget-wide v11, v3, Ltw0;->d:J

    .line 105
    .line 106
    new-instance v0, Lcw0;

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    move-object v1, p0

    .line 111
    invoke-direct/range {v0 .. v6}, Lcw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 112
    .line 113
    .line 114
    iput-object v9, v7, Law0;->k:Lhg2;

    .line 115
    .line 116
    iput-object v9, v7, Law0;->l:Ltw0;

    .line 117
    .line 118
    iput v8, v7, Law0;->o:I

    .line 119
    .line 120
    invoke-virtual {p0, v11, v12, v0, v7}, Ljw0;->e(JLin0;Lu00;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v0, v10, :cond_5

    .line 125
    .line 126
    :goto_3
    return-object v10

    .line 127
    :cond_5
    return-object v0

    .line 128
    :cond_6
    const/4 v5, 0x0

    .line 129
    const/16 v6, 0x1c

    .line 130
    .line 131
    const-string v1, "PERMISSION_DENIED"

    .line 132
    .line 133
    const-string v2, "Downloads cannot write package files."

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    const/4 v4, 0x0

    .line 137
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 138
    .line 139
    .line 140
    return-object v9
.end method

.method public final e(JLin0;Lu00;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Ldw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ldw0;

    .line 7
    .line 8
    iget v1, v0, Ldw0;->m:I

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
    iput v1, v0, Ldw0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ldw0;-><init>(Ljw0;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Ldw0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldw0;->m:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Lp23; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lk32; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcg2; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lsd2; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p4

    .line 39
    :catch_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    move-object v7, p0

    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-exception v0

    .line 44
    move-object p0, v0

    .line 45
    goto :goto_2

    .line 46
    :catch_2
    move-exception v0

    .line 47
    move-object p0, v0

    .line 48
    move-object v7, p0

    .line 49
    goto :goto_3

    .line 50
    :catch_3
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    move-object v7, p0

    .line 53
    goto :goto_4

    .line 54
    :catch_4
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    move-object v7, p0

    .line 57
    goto :goto_5

    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_2
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :try_start_1
    new-instance p4, Lv0;

    .line 68
    .line 69
    invoke-direct {p4, p0, p3, v2}, Lv0;-><init>(Ljw0;Lin0;Lt00;)V

    .line 70
    .line 71
    .line 72
    iput v3, v0, Ldw0;->m:I

    .line 73
    .line 74
    invoke-static {p1, p2, p4, v0}, Lga3;->e(JLv0;Ldw0;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catch Lp23; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lk32; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcg2; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lsd2; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    sget-object p1, Lk20;->h:Lk20;

    .line 79
    .line 80
    if-ne p0, p1, :cond_3

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_3
    return-object p0

    .line 84
    :goto_1
    const/4 v6, 0x0

    .line 85
    const/16 v8, 0x8

    .line 86
    .line 87
    const-string v3, "NETWORK_ERROR"

    .line 88
    .line 89
    const-string v4, "The HTTP request failed."

    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :catch_5
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    throw p0

    .line 99
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    instance-of p0, v7, Ljava/net/SocketTimeoutException;

    .line 104
    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    const/16 v8, 0x8

    .line 109
    .line 110
    const-string v3, "TIMEOUT"

    .line 111
    .line 112
    const-string v4, "The HTTP operation timed out."

    .line 113
    .line 114
    const/4 v5, 0x1

    .line 115
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :cond_4
    const/4 v6, 0x0

    .line 120
    const/16 v8, 0x8

    .line 121
    .line 122
    const-string v3, "NETWORK_ERROR"

    .line 123
    .line 124
    const-string v4, "The HTTP response body could not be downloaded."

    .line 125
    .line 126
    const/4 v5, 0x1

    .line 127
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 128
    .line 129
    .line 130
    return-object v2

    .line 131
    :goto_3
    const/4 v6, 0x0

    .line 132
    const/16 v8, 0x8

    .line 133
    .line 134
    const-string v3, "TIMEOUT"

    .line 135
    .line 136
    const-string v4, "The HTTP operation timed out."

    .line 137
    .line 138
    const/4 v5, 0x1

    .line 139
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 140
    .line 141
    .line 142
    return-object v2

    .line 143
    :goto_4
    const/4 v6, 0x0

    .line 144
    const/16 v8, 0xc

    .line 145
    .line 146
    const-string v3, "PERMISSION_DENIED"

    .line 147
    .line 148
    const-string v4, "The target resolved to a private or reserved network address."

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 152
    .line 153
    .line 154
    return-object v2

    .line 155
    :goto_5
    const/4 v6, 0x0

    .line 156
    const/16 v8, 0x8

    .line 157
    .line 158
    const-string v3, "TIMEOUT"

    .line 159
    .line 160
    const-string v4, "The HTTP operation timed out."

    .line 161
    .line 162
    const/4 v5, 0x1

    .line 163
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 164
    .line 165
    .line 166
    return-object v2
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Object;Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lfw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lfw0;

    .line 7
    .line 8
    iget v1, v0, Lfw0;->n:I

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
    iput v1, v0, Lfw0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lfw0;-><init>(Ljw0;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lfw0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lfw0;->n:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lk20;->h:Lk20;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    iget-object p1, v0, Lfw0;->k:Ltw0;

    .line 51
    .line 52
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v8, p1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p3, p0, Ljw0;->c:Lbf2;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {p2, p3, v1}, Lxe1;->c0(Ljava/lang/Object;Lbf2;Z)Ltw0;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {p1}, Lmw0;->a(Ljava/lang/String;)Lyw0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p2, v0, Lfw0;->k:Ltw0;

    .line 72
    .line 73
    iput v3, v0, Lfw0;->n:I

    .line 74
    .line 75
    invoke-virtual {p0, p1, p2, v0}, Ljw0;->c(Lyw0;Ltw0;Lu00;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    if-ne p3, v4, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object v8, p2

    .line 83
    :goto_1
    move-object v7, p3

    .line 84
    check-cast v7, Lk82;

    .line 85
    .line 86
    iget-wide p1, v8, Ltw0;->d:J

    .line 87
    .line 88
    new-instance v5, Lhw0;

    .line 89
    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    move-object v6, p0

    .line 93
    invoke-direct/range {v5 .. v10}, Lhw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 94
    .line 95
    .line 96
    iput-object v9, v0, Lfw0;->k:Ltw0;

    .line 97
    .line 98
    iput v2, v0, Lfw0;->n:I

    .line 99
    .line 100
    invoke-virtual {v6, p1, p2, v5, v0}, Ljw0;->e(JLin0;Lu00;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v4, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v4

    .line 107
    :cond_5
    return-object p0
.end method
