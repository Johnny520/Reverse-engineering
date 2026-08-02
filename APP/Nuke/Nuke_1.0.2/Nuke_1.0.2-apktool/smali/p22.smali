.class public final Lp22;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Li81;


# instance fields
.field public final h:I

.field public final i:Lb5;

.field public final j:Lin0;

.field public k:Lfz;

.field public l:Lfw2;

.field public m:Le71;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/Object;

.field public r:Z

.field public s:Lo22;

.field public t:Z

.field public u:J

.field public v:J

.field public w:J

.field public x:Z

.field public final synthetic y:Lf90;


# direct methods
.method public constructor <init>(Lf90;ILb5;Lnx0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp22;->y:Lf90;

    .line 5
    .line 6
    iput p2, p0, Lp22;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lp22;->i:Lb5;

    .line 9
    .line 10
    iput-object p4, p0, Lp22;->j:Lin0;

    .line 11
    .line 12
    sget p1, Lei1;->b:I

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-wide p3, Lei1;->a:J

    .line 19
    .line 20
    sub-long/2addr p1, p3

    .line 21
    iput-wide p1, p0, Lp22;->w:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lp22;->m:Le71;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v2, v0, Le71;->a:I

    .line 7
    .line 8
    packed-switch v2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Le71;->b()Lx61;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lx61;->f:Lsy1;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    :goto_0
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v0, Le71;->b:Lf71;

    .line 24
    .line 25
    iget-object v0, v0, Le71;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v2, v0}, Lf71;->b(Lf71;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :pswitch_0
    iput-object v1, p0, Lp22;->m:Le71;

    .line 31
    .line 32
    iget-object v0, p0, Lp22;->l:Lfw2;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Lfw2;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v1, p0, Lp22;->l:Lfw2;

    .line 40
    .line 41
    iput-object v1, p0, Lp22;->s:Lo22;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lra;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp22;->y:Lf90;

    .line 2
    .line 3
    iget-boolean v0, v0, Lf90;->a:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Lp22;->t:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "compose:lazy:prefetch:execute:urgent"

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, Lp22;->c(Lra;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lp22;->c(Lra;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    :goto_0
    const-string p1, "compose:lazy:prefetch:execute:item"

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, Ltp0;->R(Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    return p0
.end method

.method public final c(Lra;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp22;->h:I

    .line 4
    .line 5
    int-to-long v2, v1

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v4, v2, v3}, Ltp0;->R(Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v0, Lp22;->y:Lf90;

    .line 12
    .line 13
    iget-object v5, v5, Lf90;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Lz71;

    .line 16
    .line 17
    iget-object v5, v5, Lz71;->b:Lf0;

    .line 18
    .line 19
    invoke-virtual {v5}, Lf0;->a()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lt81;

    .line 24
    .line 25
    iget-boolean v6, v0, Lp22;->o:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_29

    .line 29
    .line 30
    invoke-virtual {v5}, Lt81;->c()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v1, :cond_29

    .line 35
    .line 36
    if-ge v1, v6, :cond_29

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Lt81;->d(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v0, Lp22;->q:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v8, :cond_0

    .line 45
    .line 46
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-nez v8, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Lp22;->a()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    invoke-virtual {v5, v1}, Lt81;->b(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v5, v0, Lp22;->i:Lb5;

    .line 61
    .line 62
    iget-object v8, v5, Lb5;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Lui;

    .line 65
    .line 66
    iget-object v9, v5, Lb5;->j:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v10, -0x1

    .line 69
    if-ne v9, v1, :cond_1

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v8, v5, Lb5;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Lrk1;

    .line 77
    .line 78
    invoke-virtual {v8, v1}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, Lui;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput v10, v9, Lui;->e:I

    .line 90
    .line 91
    invoke-virtual {v8, v1, v9}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v8, v9

    .line 95
    check-cast v8, Lui;

    .line 96
    .line 97
    iput-object v1, v5, Lb5;->j:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v8, v5, Lb5;->k:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0}, Lp22;->d()Z

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Lra;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    iput-wide v11, v0, Lp22;->u:J

    .line 109
    .line 110
    sget v5, Lei1;->b:I

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    sget-wide v15, Lei1;->a:J

    .line 117
    .line 118
    sub-long/2addr v13, v15

    .line 119
    iput-wide v13, v0, Lp22;->w:J

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    iput-wide v13, v0, Lp22;->v:J

    .line 124
    .line 125
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 126
    .line 127
    invoke-static {v5, v11, v12}, Ltp0;->R(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lp22;->d()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    iget-wide v11, v0, Lp22;->u:J

    .line 137
    .line 138
    move-wide v15, v13

    .line 139
    iget-wide v13, v8, Lui;->a:J

    .line 140
    .line 141
    iget-wide v9, v8, Lui;->b:J

    .line 142
    .line 143
    add-long/2addr v13, v9

    .line 144
    invoke-virtual {v0, v11, v12, v13, v14}, Lp22;->g(JJ)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eqz v9, :cond_3

    .line 149
    .line 150
    const-string v9, "compose:lazy:prefetch:compose"

    .line 151
    .line 152
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :try_start_0
    invoke-virtual {v0, v6, v1, v8}, Lp22;->f(Ljava/lang/Object;Ljava/lang/Object;Lui;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lp22;->d()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_6

    .line 172
    .line 173
    :cond_4
    const/16 v17, 0x1

    .line 174
    .line 175
    goto/16 :goto_12

    .line 176
    .line 177
    :cond_5
    move-wide v15, v13

    .line 178
    :cond_6
    iget-object v1, v0, Lp22;->m:Le71;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    if-eqz v1, :cond_9

    .line 182
    .line 183
    iget-wide v9, v0, Lp22;->u:J

    .line 184
    .line 185
    iget-wide v11, v8, Lui;->c:J

    .line 186
    .line 187
    invoke-virtual {v0, v9, v10, v11, v12}, Lp22;->g(JJ)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_4

    .line 192
    .line 193
    const-string v1, "compose:lazy:prefetch:apply"

    .line 194
    .line 195
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :try_start_1
    iget-object v1, v0, Lp22;->m:Le71;

    .line 199
    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    iget v9, v1, Le71;->a:I

    .line 203
    .line 204
    packed-switch v9, :pswitch_data_0

    .line 205
    .line 206
    .line 207
    iget-object v9, v1, Le71;->b:Lf71;

    .line 208
    .line 209
    invoke-virtual {v1}, Le71;->b()Lx61;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    if-eqz v10, :cond_7

    .line 214
    .line 215
    invoke-virtual {v9, v10, v7}, Lf71;->d(Lx61;Z)V

    .line 216
    .line 217
    .line 218
    :cond_7
    iget-object v1, v1, Le71;->c:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v9, v1}, Lf71;->f(Ljava/lang/Object;)Lfw2;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    goto :goto_2

    .line 225
    :pswitch_0
    iget-object v9, v1, Le71;->b:Lf71;

    .line 226
    .line 227
    iget-object v1, v1, Le71;->c:Ljava/lang/Object;

    .line 228
    .line 229
    invoke-virtual {v9, v1}, Lf71;->f(Ljava/lang/Object;)Lfw2;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    :goto_2
    iput-object v1, v0, Lp22;->l:Lfw2;

    .line 234
    .line 235
    iput-object v6, v0, Lp22;->m:Le71;

    .line 236
    .line 237
    const/4 v1, 0x1

    .line 238
    iput-boolean v1, v0, Lp22;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 239
    .line 240
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lp22;->h()V

    .line 244
    .line 245
    .line 246
    iget-wide v9, v0, Lp22;->v:J

    .line 247
    .line 248
    iget-wide v11, v8, Lui;->c:J

    .line 249
    .line 250
    invoke-static {v9, v10, v11, v12}, Lui;->a(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v9

    .line 254
    iput-wide v9, v8, Lui;->c:J

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    :try_start_2
    const-string v0, "Nothing to apply!"

    .line 258
    .line 259
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 260
    .line 261
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 265
    :catchall_1
    move-exception v0

    .line 266
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_9
    :goto_3
    iget-boolean v1, v0, Lp22;->r:Z

    .line 271
    .line 272
    if-nez v1, :cond_c

    .line 273
    .line 274
    iget-wide v9, v0, Lp22;->u:J

    .line 275
    .line 276
    cmp-long v1, v9, v15

    .line 277
    .line 278
    if-lez v1, :cond_4

    .line 279
    .line 280
    const-string v1, "compose:lazy:prefetch:resolve-nested"

    .line 281
    .line 282
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :try_start_3
    iget-object v1, v0, Lp22;->l:Lfw2;

    .line 286
    .line 287
    if-eqz v1, :cond_b

    .line 288
    .line 289
    new-instance v9, Lo72;

    .line 290
    .line 291
    invoke-direct {v9}, Lo72;-><init>()V

    .line 292
    .line 293
    .line 294
    new-instance v10, Lv;

    .line 295
    .line 296
    const/16 v11, 0x15

    .line 297
    .line 298
    invoke-direct {v10, v11, v9}, Lv;-><init>(ILjava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v1, v10}, Lfw2;->d(Lv;)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v9, Lo72;->i:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, Ljava/util/List;

    .line 307
    .line 308
    if-eqz v1, :cond_a

    .line 309
    .line 310
    new-instance v9, Lo22;

    .line 311
    .line 312
    invoke-direct {v9, v0, v1}, Lo22;-><init>(Lp22;Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_a
    :goto_4
    move-object v9, v6

    .line 317
    goto :goto_5

    .line 318
    :cond_b
    const-string v1, "Should precompose before resolving nested prefetch states"

    .line 319
    .line 320
    invoke-static {v1}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Ls;->b()V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :goto_5
    iput-object v9, v0, Lp22;->s:Lo22;

    .line 328
    .line 329
    const/4 v1, 0x1

    .line 330
    iput-boolean v1, v0, Lp22;->r:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 331
    .line 332
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :catchall_2
    move-exception v0

    .line 337
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 338
    .line 339
    .line 340
    throw v0

    .line 341
    :cond_c
    :goto_6
    iget-object v1, v0, Lp22;->s:Lo22;

    .line 342
    .line 343
    if-eqz v1, :cond_1c

    .line 344
    .line 345
    iget v9, v8, Lui;->e:I

    .line 346
    .line 347
    iget-boolean v10, v0, Lp22;->t:Z

    .line 348
    .line 349
    iget-object v11, v1, Lo22;->b:[Ljava/util/List;

    .line 350
    .line 351
    iget v12, v1, Lo22;->c:I

    .line 352
    .line 353
    iget-object v13, v1, Lo22;->a:Ljava/util/List;

    .line 354
    .line 355
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    if-lt v12, v14, :cond_d

    .line 360
    .line 361
    goto/16 :goto_10

    .line 362
    .line 363
    :cond_d
    iget-object v12, v1, Lo22;->f:Lp22;

    .line 364
    .line 365
    iget-boolean v12, v12, Lp22;->o:Z

    .line 366
    .line 367
    if-eqz v12, :cond_e

    .line 368
    .line 369
    const-string v12, "Should not execute nested prefetch on canceled request"

    .line 370
    .line 371
    invoke-static {v12}, Lnz0;->c(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_e
    const-string v12, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 375
    .line 376
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :try_start_4
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    move v14, v7

    .line 384
    :goto_7
    if-ge v14, v12, :cond_f

    .line 385
    .line 386
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v18

    .line 390
    move-object/from16 v5, v18

    .line 391
    .line 392
    check-cast v5, Lj81;

    .line 393
    .line 394
    iput v9, v5, Lj81;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 395
    .line 396
    add-int/lit8 v14, v14, 0x1

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 400
    .line 401
    .line 402
    const-string v5, "compose:lazy:prefetch:nested"

    .line 403
    .line 404
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :goto_8
    :try_start_5
    iget v5, v1, Lo22;->c:I

    .line 408
    .line 409
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    if-ge v5, v9, :cond_1b

    .line 414
    .line 415
    iget v5, v1, Lo22;->c:I

    .line 416
    .line 417
    aget-object v5, v11, v5

    .line 418
    .line 419
    if-nez v5, :cond_16

    .line 420
    .line 421
    invoke-virtual/range {p1 .. p1}, Lra;->a()J

    .line 422
    .line 423
    .line 424
    move-result-wide v19
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 425
    cmp-long v5, v19, v15

    .line 426
    .line 427
    if-gtz v5, :cond_10

    .line 428
    .line 429
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 430
    .line 431
    .line 432
    const/16 v17, 0x1

    .line 433
    .line 434
    return v17

    .line 435
    :cond_10
    :try_start_6
    iget v9, v1, Lo22;->c:I

    .line 436
    .line 437
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    move-object v12, v5

    .line 442
    check-cast v12, Lj81;

    .line 443
    .line 444
    iget-object v5, v12, Lj81;->a:La91;

    .line 445
    .line 446
    if-nez v5, :cond_11

    .line 447
    .line 448
    sget-object v5, Lbe0;->h:Lbe0;

    .line 449
    .line 450
    move/from16 v23, v9

    .line 451
    .line 452
    move/from16 v24, v10

    .line 453
    .line 454
    move-object v10, v6

    .line 455
    goto :goto_b

    .line 456
    :cond_11
    iget v14, v12, Lj81;->d:I

    .line 457
    .line 458
    new-instance v15, Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 461
    .line 462
    .line 463
    iget v5, v5, La91;->h:I

    .line 464
    .line 465
    invoke-static {}, Ltl;->B()Lvr2;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    if-eqz v7, :cond_12

    .line 470
    .line 471
    invoke-virtual {v7}, Lvr2;->e()Lin0;

    .line 472
    .line 473
    .line 474
    move-result-object v18

    .line 475
    move-object/from16 v6, v18

    .line 476
    .line 477
    :cond_12
    move/from16 v21, v5

    .line 478
    .line 479
    invoke-static {v7}, Ltl;->K(Lvr2;)Lvr2;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    invoke-static {v7, v5, v6}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 484
    .line 485
    .line 486
    const/4 v5, -0x1

    .line 487
    if-ne v14, v5, :cond_13

    .line 488
    .line 489
    const/4 v14, 0x2

    .line 490
    :cond_13
    const/4 v6, 0x0

    .line 491
    :goto_9
    if-ge v6, v14, :cond_15

    .line 492
    .line 493
    add-int v7, v21, v6

    .line 494
    .line 495
    iget-object v5, v12, Lj81;->c:Lf90;

    .line 496
    .line 497
    if-nez v5, :cond_14

    .line 498
    .line 499
    move/from16 v22, v6

    .line 500
    .line 501
    move/from16 v23, v9

    .line 502
    .line 503
    move/from16 v24, v10

    .line 504
    .line 505
    const/4 v10, 0x0

    .line 506
    goto :goto_a

    .line 507
    :cond_14
    move/from16 v22, v6

    .line 508
    .line 509
    iget-object v6, v12, Lj81;->b:Lb5;

    .line 510
    .line 511
    move/from16 v23, v9

    .line 512
    .line 513
    new-instance v9, Lp22;

    .line 514
    .line 515
    move/from16 v24, v10

    .line 516
    .line 517
    const/4 v10, 0x0

    .line 518
    invoke-direct {v9, v5, v7, v6, v10}, Lp22;-><init>(Lf90;ILb5;Lnx0;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    :goto_a
    add-int/lit8 v6, v22, 0x1

    .line 525
    .line 526
    move/from16 v9, v23

    .line 527
    .line 528
    move/from16 v10, v24

    .line 529
    .line 530
    goto :goto_9

    .line 531
    :cond_15
    move/from16 v23, v9

    .line 532
    .line 533
    move/from16 v24, v10

    .line 534
    .line 535
    const/4 v10, 0x0

    .line 536
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    iput v5, v12, Lj81;->f:I

    .line 541
    .line 542
    move-object v5, v15

    .line 543
    :goto_b
    aput-object v5, v11, v23

    .line 544
    .line 545
    goto :goto_c

    .line 546
    :cond_16
    move/from16 v24, v10

    .line 547
    .line 548
    move-object v10, v6

    .line 549
    :goto_c
    iget v5, v1, Lo22;->c:I

    .line 550
    .line 551
    aget-object v5, v11, v5

    .line 552
    .line 553
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    :goto_d
    iget v6, v1, Lo22;->d:I

    .line 557
    .line 558
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    if-ge v6, v7, :cond_1a

    .line 563
    .line 564
    iget v6, v1, Lo22;->d:I

    .line 565
    .line 566
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    check-cast v6, Lp22;

    .line 571
    .line 572
    if-eqz v24, :cond_18

    .line 573
    .line 574
    if-eqz v6, :cond_17

    .line 575
    .line 576
    move-object v7, v6

    .line 577
    goto :goto_e

    .line 578
    :cond_17
    move-object v7, v10

    .line 579
    :goto_e
    if-eqz v7, :cond_18

    .line 580
    .line 581
    const/4 v9, 0x1

    .line 582
    iput-boolean v9, v7, Lp22;->t:Z

    .line 583
    .line 584
    goto :goto_f

    .line 585
    :cond_18
    const/4 v9, 0x1

    .line 586
    :goto_f
    iput-boolean v9, v1, Lo22;->e:Z

    .line 587
    .line 588
    move-object/from16 v7, p1

    .line 589
    .line 590
    invoke-virtual {v6, v7}, Lp22;->b(Lra;)Z

    .line 591
    .line 592
    .line 593
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 594
    if-eqz v6, :cond_19

    .line 595
    .line 596
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 597
    .line 598
    .line 599
    return v9

    .line 600
    :cond_19
    :try_start_7
    iget v6, v1, Lo22;->d:I

    .line 601
    .line 602
    add-int/2addr v6, v9

    .line 603
    iput v6, v1, Lo22;->d:I

    .line 604
    .line 605
    goto :goto_d

    .line 606
    :cond_1a
    move-object/from16 v7, p1

    .line 607
    .line 608
    const/4 v5, 0x0

    .line 609
    iput v5, v1, Lo22;->d:I

    .line 610
    .line 611
    iget v5, v1, Lo22;->c:I

    .line 612
    .line 613
    const/16 v17, 0x1

    .line 614
    .line 615
    add-int/lit8 v5, v5, 0x1

    .line 616
    .line 617
    iput v5, v1, Lo22;->c:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 618
    .line 619
    move-object v6, v10

    .line 620
    move/from16 v10, v24

    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    const-wide/16 v15, 0x0

    .line 624
    .line 625
    goto/16 :goto_8

    .line 626
    .line 627
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 628
    .line 629
    .line 630
    goto :goto_10

    .line 631
    :catchall_3
    move-exception v0

    .line 632
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 633
    .line 634
    .line 635
    throw v0

    .line 636
    :catchall_4
    move-exception v0

    .line 637
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 638
    .line 639
    .line 640
    throw v0

    .line 641
    :cond_1c
    :goto_10
    iget-object v1, v0, Lp22;->s:Lo22;

    .line 642
    .line 643
    if-eqz v1, :cond_1d

    .line 644
    .line 645
    iget-boolean v1, v1, Lo22;->e:Z

    .line 646
    .line 647
    const/4 v9, 0x1

    .line 648
    if-ne v1, v9, :cond_1d

    .line 649
    .line 650
    invoke-virtual {v0}, Lp22;->h()V

    .line 651
    .line 652
    .line 653
    invoke-static {v4, v2, v3}, Ltp0;->R(Ljava/lang/String;J)V

    .line 654
    .line 655
    .line 656
    iget-object v1, v0, Lp22;->s:Lo22;

    .line 657
    .line 658
    if-eqz v1, :cond_1d

    .line 659
    .line 660
    const/4 v5, 0x0

    .line 661
    iput-boolean v5, v1, Lo22;->e:Z

    .line 662
    .line 663
    :cond_1d
    iget-object v1, v0, Lp22;->k:Lfz;

    .line 664
    .line 665
    iget-boolean v2, v0, Lp22;->n:Z

    .line 666
    .line 667
    if-nez v2, :cond_22

    .line 668
    .line 669
    if-eqz v1, :cond_22

    .line 670
    .line 671
    iget-wide v2, v0, Lp22;->u:J

    .line 672
    .line 673
    iget-wide v4, v8, Lui;->d:J

    .line 674
    .line 675
    invoke-virtual {v0, v2, v3, v4, v5}, Lp22;->g(JJ)Z

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    if-eqz v2, :cond_4

    .line 680
    .line 681
    const-string v2, "compose:lazy:prefetch:measure"

    .line 682
    .line 683
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    :try_start_8
    iget-wide v1, v1, Lfz;->a:J

    .line 687
    .line 688
    iget-boolean v3, v0, Lp22;->o:Z

    .line 689
    .line 690
    if-eqz v3, :cond_1e

    .line 691
    .line 692
    const-string v3, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 693
    .line 694
    invoke-static {v3}, Lnz0;->a(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    :cond_1e
    iget-boolean v3, v0, Lp22;->n:Z

    .line 698
    .line 699
    if-eqz v3, :cond_1f

    .line 700
    .line 701
    const-string v3, "Request was already measured!"

    .line 702
    .line 703
    invoke-static {v3}, Lnz0;->a(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    :cond_1f
    const/4 v9, 0x1

    .line 707
    iput-boolean v9, v0, Lp22;->n:Z

    .line 708
    .line 709
    iget-object v3, v0, Lp22;->l:Lfw2;

    .line 710
    .line 711
    if-eqz v3, :cond_20

    .line 712
    .line 713
    invoke-interface {v3}, Lfw2;->b()I

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    const/4 v5, 0x0

    .line 718
    :goto_11
    if-ge v5, v4, :cond_21

    .line 719
    .line 720
    invoke-interface {v3, v1, v2, v5}, Lfw2;->c(JI)V

    .line 721
    .line 722
    .line 723
    add-int/lit8 v5, v5, 0x1

    .line 724
    .line 725
    goto :goto_11

    .line 726
    :cond_20
    const-string v1, "performComposition() must be called before performMeasure()"

    .line 727
    .line 728
    invoke-static {v1}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 729
    .line 730
    .line 731
    invoke-static {}, Ls;->b()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 732
    .line 733
    .line 734
    :cond_21
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Lp22;->h()V

    .line 738
    .line 739
    .line 740
    iget-wide v1, v0, Lp22;->v:J

    .line 741
    .line 742
    iget-wide v3, v8, Lui;->d:J

    .line 743
    .line 744
    invoke-static {v1, v2, v3, v4}, Lui;->a(JJ)J

    .line 745
    .line 746
    .line 747
    move-result-wide v1

    .line 748
    iput-wide v1, v8, Lui;->d:J

    .line 749
    .line 750
    iget-object v1, v0, Lp22;->j:Lin0;

    .line 751
    .line 752
    if-eqz v1, :cond_22

    .line 753
    .line 754
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    goto :goto_13

    .line 758
    :catchall_5
    move-exception v0

    .line 759
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 760
    .line 761
    .line 762
    throw v0

    .line 763
    :goto_12
    return v17

    .line 764
    :cond_22
    :goto_13
    iget-object v1, v0, Lp22;->s:Lo22;

    .line 765
    .line 766
    iget-boolean v2, v0, Lp22;->n:Z

    .line 767
    .line 768
    if-eqz v2, :cond_28

    .line 769
    .line 770
    iget-boolean v0, v0, Lp22;->r:Z

    .line 771
    .line 772
    if-eqz v0, :cond_28

    .line 773
    .line 774
    if-eqz v1, :cond_28

    .line 775
    .line 776
    iget-object v0, v1, Lo22;->a:Ljava/util/List;

    .line 777
    .line 778
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    const v2, 0x7fffffff

    .line 783
    .line 784
    .line 785
    move v3, v2

    .line 786
    const/4 v5, 0x0

    .line 787
    :goto_14
    if-ge v5, v1, :cond_23

    .line 788
    .line 789
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    check-cast v4, Lj81;

    .line 794
    .line 795
    iget v4, v4, Lj81;->e:I

    .line 796
    .line 797
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    add-int/lit8 v5, v5, 0x1

    .line 802
    .line 803
    goto :goto_14

    .line 804
    :cond_23
    if-ne v3, v2, :cond_24

    .line 805
    .line 806
    const/4 v5, 0x0

    .line 807
    goto :goto_15

    .line 808
    :cond_24
    move v5, v3

    .line 809
    :goto_15
    iget v1, v8, Lui;->e:I

    .line 810
    .line 811
    const/4 v3, -0x1

    .line 812
    if-ne v1, v3, :cond_25

    .line 813
    .line 814
    move v1, v5

    .line 815
    goto :goto_16

    .line 816
    :cond_25
    mul-int/lit8 v1, v1, 0x3

    .line 817
    .line 818
    add-int/2addr v1, v5

    .line 819
    div-int/lit8 v1, v1, 0x4

    .line 820
    .line 821
    :goto_16
    iput v1, v8, Lui;->e:I

    .line 822
    .line 823
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    move v4, v2

    .line 828
    const/4 v3, 0x0

    .line 829
    :goto_17
    if-ge v3, v1, :cond_26

    .line 830
    .line 831
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    check-cast v6, Lj81;

    .line 836
    .line 837
    iget v6, v6, Lj81;->f:I

    .line 838
    .line 839
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    add-int/lit8 v3, v3, 0x1

    .line 844
    .line 845
    goto :goto_17

    .line 846
    :cond_26
    if-ne v4, v2, :cond_27

    .line 847
    .line 848
    const/4 v4, 0x0

    .line 849
    :cond_27
    if-ge v4, v5, :cond_28

    .line 850
    .line 851
    const-wide/16 v0, 0x0

    .line 852
    .line 853
    iput-wide v0, v8, Lui;->d:J

    .line 854
    .line 855
    const/16 v16, 0x0

    .line 856
    .line 857
    return v16

    .line 858
    :cond_28
    const/16 v16, 0x0

    .line 859
    .line 860
    return v16

    .line 861
    :cond_29
    move/from16 v16, v7

    .line 862
    .line 863
    invoke-virtual {v0}, Lp22;->a()V

    .line 864
    .line 865
    .line 866
    return v16

    .line 867
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp22;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lp22;->o:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lp22;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lp22;->p:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lp22;->m:Le71;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Le71;->c()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    return v1
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lp22;->t:Z

    .line 3
    .line 4
    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Lui;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp22;->m:Le71;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lp22;->y:Lf90;

    .line 7
    .line 8
    iget-object v2, v0, Lf90;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lz71;

    .line 11
    .line 12
    iget v3, p0, Lp22;->h:I

    .line 13
    .line 14
    invoke-virtual {v2, v3, p1, p2}, Lz71;->a(ILjava/lang/Object;Ljava/lang/Object;)Lmn0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v0, v0, Lf90;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lhw2;

    .line 21
    .line 22
    invoke-virtual {v0}, Lhw2;->a()Lf71;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, v0, Lf71;->h:Lr61;

    .line 27
    .line 28
    invoke-virtual {v2}, Lr61;->H()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance p2, Le71;

    .line 35
    .line 36
    invoke-direct {p2, v0, p1, v1}, Le71;-><init>(Lf71;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v0, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v2, 0x1

    .line 42
    invoke-virtual {v0, p1, p2, v2}, Lf71;->k(Ljava/lang/Object;Lmn0;Z)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Le71;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1, v2}, Le71;-><init>(Lf71;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput-object v0, p0, Lp22;->m:Le71;

    .line 52
    .line 53
    iput-object p1, p0, Lp22;->q:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_1
    iput-boolean v1, p0, Lp22;->x:Z

    .line 56
    .line 57
    :cond_2
    :goto_2
    :pswitch_0
    invoke-virtual {v0}, Le71;->c()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_5

    .line 62
    .line 63
    iget-boolean p1, p0, Lp22;->x:Z

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    new-instance p1, Lhq1;

    .line 68
    .line 69
    invoke-direct {p1, p0, p3}, Lhq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget p2, v0, Le71;->a:I

    .line 73
    .line 74
    packed-switch p2, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Le71;->b()Lx61;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 v1, 0x0

    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    iget-object v2, p2, Lx61;->f:Lsy1;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    move-object v2, v1

    .line 88
    :goto_3
    if-eqz v2, :cond_2

    .line 89
    .line 90
    invoke-virtual {v2}, Lsy1;->c()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    invoke-static {}, Ltl;->B()Lvr2;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    invoke-virtual {v3}, Lvr2;->e()Lin0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_4
    invoke-static {v3}, Ltl;->K(Lvr2;)Lvr2;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :try_start_0
    invoke-virtual {v2, p1}, Lsy1;->e(Lsq2;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v4, v1}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    :catchall_1
    move-exception p0

    .line 123
    invoke-static {v3, v4, v1}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_5
    invoke-virtual {p0}, Lp22;->h()V

    .line 128
    .line 129
    .line 130
    iget-boolean p1, p0, Lp22;->x:Z

    .line 131
    .line 132
    iget-wide v0, p0, Lp22;->v:J

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    iget-wide p0, p3, Lui;->b:J

    .line 137
    .line 138
    invoke-static {v0, v1, p0, p1}, Lui;->a(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide p0

    .line 142
    iput-wide p0, p3, Lui;->b:J

    .line 143
    .line 144
    return-void

    .line 145
    :cond_6
    iget-wide p0, p3, Lui;->a:J

    .line 146
    .line 147
    invoke-static {v0, v1, p0, p1}, Lui;->a(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide p0

    .line 151
    iput-wide p0, p3, Lui;->a:J

    .line 152
    .line 153
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(JJ)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lp22;->t:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    cmp-long p0, p1, p3

    .line 8
    .line 9
    if-lez p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final h()V
    .locals 15

    .line 1
    sget v1, Lei1;->b:I

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-wide v3, Lei1;->a:J

    .line 8
    .line 9
    sub-long/2addr v1, v3

    .line 10
    iget-wide v3, p0, Lp22;->w:J

    .line 11
    .line 12
    const-wide/16 v5, 0x1

    .line 13
    .line 14
    sub-long v7, v3, v5

    .line 15
    .line 16
    or-long/2addr v7, v5

    .line 17
    const-wide v9, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v7, v7, v9

    .line 23
    .line 24
    const-wide/32 v11, 0xf4240

    .line 25
    .line 26
    .line 27
    const-wide/16 v13, 0x0

    .line 28
    .line 29
    if-nez v7, :cond_2

    .line 30
    .line 31
    cmp-long v5, v1, v3

    .line 32
    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    sget-object v3, Lad0;->i:Lz8;

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    cmp-long v3, v3, v13

    .line 39
    .line 40
    if-gez v3, :cond_1

    .line 41
    .line 42
    sget-wide v3, Lad0;->k:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-wide v3, Lad0;->j:J

    .line 46
    .line 47
    :goto_0
    invoke-static {v3, v4}, Lad0;->g(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v13

    .line 51
    goto :goto_3

    .line 52
    :cond_2
    sub-long v7, v1, v5

    .line 53
    .line 54
    or-long/2addr v5, v7

    .line 55
    cmp-long v5, v5, v9

    .line 56
    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    cmp-long v3, v1, v13

    .line 60
    .line 61
    if-gez v3, :cond_3

    .line 62
    .line 63
    sget-wide v3, Lad0;->k:J

    .line 64
    .line 65
    :goto_1
    move-wide v13, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    sget-wide v3, Lad0;->j:J

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    sub-long v5, v1, v3

    .line 71
    .line 72
    xor-long v7, v5, v1

    .line 73
    .line 74
    xor-long v9, v5, v3

    .line 75
    .line 76
    not-long v9, v9

    .line 77
    and-long/2addr v7, v9

    .line 78
    cmp-long v7, v7, v13

    .line 79
    .line 80
    sget-object v8, Led0;->i:Led0;

    .line 81
    .line 82
    if-gez v7, :cond_7

    .line 83
    .line 84
    sget-object v7, Led0;->j:Led0;

    .line 85
    .line 86
    invoke-virtual {v8, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-gez v9, :cond_5

    .line 91
    .line 92
    div-long v5, v1, v11

    .line 93
    .line 94
    div-long v9, v3, v11

    .line 95
    .line 96
    sub-long/2addr v5, v9

    .line 97
    rem-long v9, v1, v11

    .line 98
    .line 99
    rem-long/2addr v3, v11

    .line 100
    sub-long/2addr v9, v3

    .line 101
    sget-object v3, Lad0;->i:Lz8;

    .line 102
    .line 103
    invoke-static {v5, v6, v7}, Lpp0;->G(JLed0;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    invoke-static {v9, v10, v8}, Lpp0;->G(JLed0;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-static {v3, v4, v5, v6}, Lad0;->e(JJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v13

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    cmp-long v3, v5, v13

    .line 117
    .line 118
    if-gez v3, :cond_6

    .line 119
    .line 120
    sget-wide v3, Lad0;->k:J

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    sget-wide v3, Lad0;->j:J

    .line 124
    .line 125
    :goto_2
    invoke-static {v3, v4}, Lad0;->g(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    goto :goto_3

    .line 130
    :cond_7
    invoke-static {v5, v6, v8}, Lpp0;->G(JLed0;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v13

    .line 134
    :goto_3
    const/4 v3, 0x1

    .line 135
    shr-long v4, v13, v3

    .line 136
    .line 137
    sget-object v6, Lad0;->i:Lz8;

    .line 138
    .line 139
    long-to-int v6, v13

    .line 140
    and-int/2addr v3, v6

    .line 141
    if-nez v3, :cond_8

    .line 142
    .line 143
    move-wide v9, v4

    .line 144
    goto :goto_4

    .line 145
    :cond_8
    const-wide v6, 0x8637bd05af6L

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    cmp-long v3, v4, v6

    .line 151
    .line 152
    if-lez v3, :cond_9

    .line 153
    .line 154
    const-wide v9, 0x7fffffffffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_9
    const-wide v6, -0x8637bd05af6L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    cmp-long v3, v4, v6

    .line 166
    .line 167
    if-gez v3, :cond_a

    .line 168
    .line 169
    const-wide/high16 v9, -0x8000000000000000L

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_a
    mul-long v9, v4, v11

    .line 173
    .line 174
    :goto_4
    iput-wide v9, p0, Lp22;->v:J

    .line 175
    .line 176
    iget-wide v3, p0, Lp22;->u:J

    .line 177
    .line 178
    sub-long/2addr v3, v9

    .line 179
    iput-wide v3, p0, Lp22;->u:J

    .line 180
    .line 181
    iput-wide v1, p0, Lp22;->w:J

    .line 182
    .line 183
    const-string v0, "compose:lazy:prefetch:available_time_nanos"

    .line 184
    .line 185
    invoke-static {v0, v3, v4}, Ltp0;->R(Ljava/lang/String;J)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HandleAndRequestImpl { index = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lp22;->h:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", constraints = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lp22;->k:Lfz;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isComposed = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lp22;->d()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isMeasured = "

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-boolean v1, p0, Lp22;->n:Z

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", isCanceled = "

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-boolean p0, p0, Lp22;->o:Z

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, " }"

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
