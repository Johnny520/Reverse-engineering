.class public final Lbs0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lc80;


# instance fields
.field public final a:I

.field public final b:Lo8;

.field public final c:Lsw;

.field public d:Lpj;

.field public e:Lv41;

.field public f:Lp60;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Z

.field public l:Las0;

.field public m:Z

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public final synthetic r:Ld50;


# direct methods
.method public constructor <init>(Ld50;ILo8;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbs0;->r:Ld50;

    .line 5
    .line 6
    iput p2, p0, Lbs0;->a:I

    .line 7
    .line 8
    iput-object p3, p0, Lbs0;->b:Lo8;

    .line 9
    .line 10
    iput-object p4, p0, Lbs0;->c:Lsw;

    .line 11
    .line 12
    sget p1, Lwf0;->b:I

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-wide p3, Lwf0;->a:J

    .line 19
    .line 20
    sub-long/2addr p1, p3

    .line 21
    iput-wide p1, p0, Lbs0;->p:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbs0;->m:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbs0;->f:Lp60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v2, v0, Lp60;->a:I

    .line 7
    .line 8
    packed-switch v2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lp60;->b()Li60;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Li60;->f:Lyp0;

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
    iget-object v2, v0, Lp60;->b:Lq60;

    .line 24
    .line 25
    iget-object v0, v0, Lp60;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v2, v0}, Lq60;->c(Lq60;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :pswitch_0
    iput-object v1, p0, Lbs0;->f:Lp60;

    .line 31
    .line 32
    iget-object v0, p0, Lbs0;->e:Lv41;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Lv41;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v1, p0, Lbs0;->e:Lv41;

    .line 40
    .line 41
    iput-object v1, p0, Lbs0;->l:Las0;

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

.method public final c(Li6;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbs0;->r:Ld50;

    .line 2
    .line 3
    iget-boolean v0, v0, Ld50;->a:Z

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
    iget-boolean v0, p0, Lbs0;->m:Z

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
    invoke-virtual {p0, p1}, Lbs0;->d(Li6;)Z

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
    invoke-virtual {p0, p1}, Lbs0;->d(Li6;)Z

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
    invoke-static {p1, v0, v1}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    return p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbs0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lbs0;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lbs0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d(Li6;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbs0;->a:I

    .line 4
    .line 5
    int-to-long v2, v1

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v4, v2, v3}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v0, Lbs0;->r:Ld50;

    .line 12
    .line 13
    iget-object v5, v5, Ld50;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Ln70;

    .line 16
    .line 17
    iget-object v5, v5, Ln70;->b:Lq70;

    .line 18
    .line 19
    invoke-virtual {v5}, Lq70;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lo70;

    .line 24
    .line 25
    iget-boolean v6, v0, Lbs0;->h:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_1f

    .line 29
    .line 30
    invoke-interface {v5}, Lo70;->a()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v1, :cond_1f

    .line 35
    .line 36
    if-ge v1, v6, :cond_1f

    .line 37
    .line 38
    invoke-interface {v5, v1}, Lo70;->c(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v0, Lbs0;->j:Ljava/lang/Object;

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
    invoke-virtual {v0}, Lbs0;->b()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    invoke-interface {v5, v1}, Lo70;->d(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v5, v0, Lbs0;->b:Lo8;

    .line 61
    .line 62
    iget-object v8, v5, Lo8;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Lm9;

    .line 65
    .line 66
    iget-object v9, v5, Lo8;->b:Ljava/lang/Object;

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
    iget-object v8, v5, Lo8;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Ljh0;

    .line 77
    .line 78
    invoke-virtual {v8, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, Lm9;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput v10, v9, Lm9;->e:I

    .line 90
    .line 91
    invoke-virtual {v8, v1, v9}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v8, v9

    .line 95
    check-cast v8, Lm9;

    .line 96
    .line 97
    iput-object v1, v5, Lo8;->b:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v8, v5, Lo8;->c:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0}, Lbs0;->e()Z

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Li6;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    iput-wide v11, v0, Lbs0;->n:J

    .line 109
    .line 110
    sget v5, Lwf0;->b:I

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    sget-wide v15, Lwf0;->a:J

    .line 117
    .line 118
    sub-long/2addr v13, v15

    .line 119
    iput-wide v13, v0, Lbs0;->p:J

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    iput-wide v13, v0, Lbs0;->o:J

    .line 124
    .line 125
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 126
    .line 127
    invoke-static {v5, v11, v12}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lbs0;->e()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    iget-wide v11, v0, Lbs0;->n:J

    .line 137
    .line 138
    move-wide v15, v13

    .line 139
    iget-wide v13, v8, Lm9;->a:J

    .line 140
    .line 141
    iget-wide v9, v8, Lm9;->b:J

    .line 142
    .line 143
    add-long/2addr v13, v9

    .line 144
    invoke-virtual {v0, v11, v12, v13, v14}, Lbs0;->i(JJ)Z

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
    invoke-virtual {v0, v6, v1, v8}, Lbs0;->g(Ljava/lang/Object;Ljava/lang/Object;Lm9;)V
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
    invoke-virtual {v0}, Lbs0;->e()Z

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
    goto/16 :goto_c

    .line 176
    .line 177
    :cond_5
    move-wide v15, v13

    .line 178
    :cond_6
    iget-object v1, v0, Lbs0;->f:Lp60;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    if-eqz v1, :cond_9

    .line 182
    .line 183
    iget-wide v9, v0, Lbs0;->n:J

    .line 184
    .line 185
    iget-wide v11, v8, Lm9;->c:J

    .line 186
    .line 187
    invoke-virtual {v0, v9, v10, v11, v12}, Lbs0;->i(JJ)Z

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
    iget-object v1, v0, Lbs0;->f:Lp60;

    .line 199
    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    iget v9, v1, Lp60;->a:I

    .line 203
    .line 204
    packed-switch v9, :pswitch_data_0

    .line 205
    .line 206
    .line 207
    iget-object v9, v1, Lp60;->b:Lq60;

    .line 208
    .line 209
    invoke-virtual {v1}, Lp60;->b()Li60;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    if-eqz v10, :cond_7

    .line 214
    .line 215
    invoke-virtual {v9, v10, v7}, Lq60;->d(Li60;Z)V

    .line 216
    .line 217
    .line 218
    :cond_7
    iget-object v1, v1, Lp60;->c:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v9, v1}, Lq60;->f(Ljava/lang/Object;)Lv41;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    goto :goto_2

    .line 225
    :pswitch_0
    iget-object v9, v1, Lp60;->b:Lq60;

    .line 226
    .line 227
    iget-object v1, v1, Lp60;->c:Ljava/lang/Object;

    .line 228
    .line 229
    invoke-virtual {v9, v1}, Lq60;->f(Ljava/lang/Object;)Lv41;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    :goto_2
    iput-object v1, v0, Lbs0;->e:Lv41;

    .line 234
    .line 235
    iput-object v6, v0, Lbs0;->f:Lp60;

    .line 236
    .line 237
    const/4 v1, 0x1

    .line 238
    iput-boolean v1, v0, Lbs0;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 239
    .line 240
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lbs0;->j()V

    .line 244
    .line 245
    .line 246
    iget-wide v9, v0, Lbs0;->o:J

    .line 247
    .line 248
    iget-wide v11, v8, Lm9;->c:J

    .line 249
    .line 250
    invoke-static {v9, v10, v11, v12}, Lm9;->a(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v9

    .line 254
    iput-wide v9, v8, Lm9;->c:J

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
    iget-boolean v1, v0, Lbs0;->k:Z

    .line 271
    .line 272
    if-nez v1, :cond_a

    .line 273
    .line 274
    iget-wide v9, v0, Lbs0;->n:J

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
    invoke-virtual {v0}, Lbs0;->h()Las0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    iput-object v1, v0, Lbs0;->l:Las0;

    .line 290
    .line 291
    const/4 v1, 0x1

    .line 292
    iput-boolean v1, v0, Lbs0;->k:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 293
    .line 294
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :catchall_2
    move-exception v0

    .line 299
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :cond_a
    :goto_4
    iget-object v1, v0, Lbs0;->l:Las0;

    .line 304
    .line 305
    if-eqz v1, :cond_16

    .line 306
    .line 307
    iget v9, v8, Lm9;->e:I

    .line 308
    .line 309
    iget-boolean v10, v0, Lbs0;->m:Z

    .line 310
    .line 311
    iget-object v11, v1, Las0;->b:[Ljava/util/List;

    .line 312
    .line 313
    iget v12, v1, Las0;->c:I

    .line 314
    .line 315
    iget-object v13, v1, Las0;->a:Ljava/util/List;

    .line 316
    .line 317
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 318
    .line 319
    .line 320
    move-result v14

    .line 321
    if-lt v12, v14, :cond_b

    .line 322
    .line 323
    goto/16 :goto_b

    .line 324
    .line 325
    :cond_b
    iget-object v12, v1, Las0;->f:Lbs0;

    .line 326
    .line 327
    iget-boolean v12, v12, Lbs0;->h:Z

    .line 328
    .line 329
    if-eqz v12, :cond_c

    .line 330
    .line 331
    const-string v12, "Should not execute nested prefetch on canceled request"

    .line 332
    .line 333
    invoke-static {v12}, Lz10;->c(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :cond_c
    const-string v12, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 337
    .line 338
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :try_start_4
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    move v14, v7

    .line 346
    :goto_5
    if-ge v14, v12, :cond_d

    .line 347
    .line 348
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    move-object/from16 v5, v18

    .line 353
    .line 354
    check-cast v5, Ld80;

    .line 355
    .line 356
    iput v9, v5, Ld80;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 357
    .line 358
    add-int/lit8 v14, v14, 0x1

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 362
    .line 363
    .line 364
    const-string v5, "compose:lazy:prefetch:nested"

    .line 365
    .line 366
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :goto_6
    :try_start_5
    iget v5, v1, Las0;->c:I

    .line 370
    .line 371
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    if-ge v5, v9, :cond_15

    .line 376
    .line 377
    iget v5, v1, Las0;->c:I

    .line 378
    .line 379
    aget-object v5, v11, v5

    .line 380
    .line 381
    if-nez v5, :cond_10

    .line 382
    .line 383
    invoke-virtual/range {p1 .. p1}, Li6;->a()J

    .line 384
    .line 385
    .line 386
    move-result-wide v19
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 387
    cmp-long v5, v19, v15

    .line 388
    .line 389
    if-gtz v5, :cond_e

    .line 390
    .line 391
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 392
    .line 393
    .line 394
    const/16 v17, 0x1

    .line 395
    .line 396
    return v17

    .line 397
    :cond_e
    :try_start_6
    iget v5, v1, Las0;->c:I

    .line 398
    .line 399
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    check-cast v9, Ld80;

    .line 404
    .line 405
    iget-object v12, v9, Ld80;->a:Lsw;

    .line 406
    .line 407
    if-nez v12, :cond_f

    .line 408
    .line 409
    sget-object v9, Lhs;->d:Lhs;

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_f
    new-instance v14, Lb80;

    .line 413
    .line 414
    iget v6, v9, Ld80;->d:I

    .line 415
    .line 416
    invoke-direct {v14, v9, v6}, Lb80;-><init>(Ld80;I)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v12, v14}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    iget-object v6, v14, Lb80;->b:Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 425
    .line 426
    .line 427
    move-result v12

    .line 428
    iput v12, v9, Ld80;->f:I

    .line 429
    .line 430
    move-object v9, v6

    .line 431
    :goto_7
    aput-object v9, v11, v5

    .line 432
    .line 433
    :cond_10
    iget v5, v1, Las0;->c:I

    .line 434
    .line 435
    aget-object v5, v11, v5

    .line 436
    .line 437
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    :goto_8
    iget v6, v1, Las0;->d:I

    .line 441
    .line 442
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    if-ge v6, v9, :cond_14

    .line 447
    .line 448
    iget v6, v1, Las0;->d:I

    .line 449
    .line 450
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    check-cast v6, Lbs0;

    .line 455
    .line 456
    if-eqz v10, :cond_12

    .line 457
    .line 458
    if-eqz v6, :cond_11

    .line 459
    .line 460
    move-object v9, v6

    .line 461
    goto :goto_9

    .line 462
    :cond_11
    const/4 v9, 0x0

    .line 463
    :goto_9
    if-eqz v9, :cond_12

    .line 464
    .line 465
    const/4 v12, 0x1

    .line 466
    iput-boolean v12, v9, Lbs0;->m:Z

    .line 467
    .line 468
    goto :goto_a

    .line 469
    :cond_12
    const/4 v12, 0x1

    .line 470
    :goto_a
    iput-boolean v12, v1, Las0;->e:Z

    .line 471
    .line 472
    move-object/from16 v9, p1

    .line 473
    .line 474
    invoke-virtual {v6, v9}, Lbs0;->c(Li6;)Z

    .line 475
    .line 476
    .line 477
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 478
    if-eqz v6, :cond_13

    .line 479
    .line 480
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 481
    .line 482
    .line 483
    return v12

    .line 484
    :cond_13
    :try_start_7
    iget v6, v1, Las0;->d:I

    .line 485
    .line 486
    add-int/2addr v6, v12

    .line 487
    iput v6, v1, Las0;->d:I

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_14
    move-object/from16 v9, p1

    .line 491
    .line 492
    iput v7, v1, Las0;->d:I

    .line 493
    .line 494
    iget v5, v1, Las0;->c:I

    .line 495
    .line 496
    const/16 v17, 0x1

    .line 497
    .line 498
    add-int/lit8 v5, v5, 0x1

    .line 499
    .line 500
    iput v5, v1, Las0;->c:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 501
    .line 502
    const/4 v6, 0x0

    .line 503
    goto/16 :goto_6

    .line 504
    .line 505
    :cond_15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 506
    .line 507
    .line 508
    goto :goto_b

    .line 509
    :catchall_3
    move-exception v0

    .line 510
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 511
    .line 512
    .line 513
    throw v0

    .line 514
    :catchall_4
    move-exception v0

    .line 515
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 516
    .line 517
    .line 518
    throw v0

    .line 519
    :cond_16
    :goto_b
    iget-object v1, v0, Lbs0;->l:Las0;

    .line 520
    .line 521
    if-eqz v1, :cond_17

    .line 522
    .line 523
    iget-boolean v1, v1, Las0;->e:Z

    .line 524
    .line 525
    const/4 v12, 0x1

    .line 526
    if-ne v1, v12, :cond_17

    .line 527
    .line 528
    invoke-virtual {v0}, Lbs0;->j()V

    .line 529
    .line 530
    .line 531
    invoke-static {v4, v2, v3}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 532
    .line 533
    .line 534
    iget-object v1, v0, Lbs0;->l:Las0;

    .line 535
    .line 536
    if-eqz v1, :cond_17

    .line 537
    .line 538
    iput-boolean v7, v1, Las0;->e:Z

    .line 539
    .line 540
    :cond_17
    iget-object v1, v0, Lbs0;->d:Lpj;

    .line 541
    .line 542
    iget-boolean v2, v0, Lbs0;->g:Z

    .line 543
    .line 544
    if-nez v2, :cond_18

    .line 545
    .line 546
    if-eqz v1, :cond_18

    .line 547
    .line 548
    iget-wide v2, v0, Lbs0;->n:J

    .line 549
    .line 550
    iget-wide v4, v8, Lm9;->d:J

    .line 551
    .line 552
    invoke-virtual {v0, v2, v3, v4, v5}, Lbs0;->i(JJ)Z

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-eqz v2, :cond_4

    .line 557
    .line 558
    const-string v2, "compose:lazy:prefetch:measure"

    .line 559
    .line 560
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    :try_start_8
    iget-wide v1, v1, Lpj;->a:J

    .line 564
    .line 565
    invoke-virtual {v0, v1, v2}, Lbs0;->f(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 566
    .line 567
    .line 568
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0}, Lbs0;->j()V

    .line 572
    .line 573
    .line 574
    iget-wide v1, v0, Lbs0;->o:J

    .line 575
    .line 576
    iget-wide v3, v8, Lm9;->d:J

    .line 577
    .line 578
    invoke-static {v1, v2, v3, v4}, Lm9;->a(JJ)J

    .line 579
    .line 580
    .line 581
    move-result-wide v1

    .line 582
    iput-wide v1, v8, Lm9;->d:J

    .line 583
    .line 584
    iget-object v1, v0, Lbs0;->c:Lsw;

    .line 585
    .line 586
    if-eqz v1, :cond_18

    .line 587
    .line 588
    invoke-interface {v1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    goto :goto_d

    .line 592
    :catchall_5
    move-exception v0

    .line 593
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 594
    .line 595
    .line 596
    throw v0

    .line 597
    :goto_c
    return v17

    .line 598
    :cond_18
    :goto_d
    iget-object v1, v0, Lbs0;->l:Las0;

    .line 599
    .line 600
    iget-boolean v2, v0, Lbs0;->g:Z

    .line 601
    .line 602
    if-eqz v2, :cond_1e

    .line 603
    .line 604
    iget-boolean v0, v0, Lbs0;->k:Z

    .line 605
    .line 606
    if-eqz v0, :cond_1e

    .line 607
    .line 608
    if-eqz v1, :cond_1e

    .line 609
    .line 610
    iget-object v0, v1, Las0;->a:Ljava/util/List;

    .line 611
    .line 612
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    const v2, 0x7fffffff

    .line 617
    .line 618
    .line 619
    move v4, v2

    .line 620
    move v3, v7

    .line 621
    :goto_e
    if-ge v3, v1, :cond_19

    .line 622
    .line 623
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    check-cast v5, Ld80;

    .line 628
    .line 629
    iget v5, v5, Ld80;->e:I

    .line 630
    .line 631
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    add-int/lit8 v3, v3, 0x1

    .line 636
    .line 637
    goto :goto_e

    .line 638
    :cond_19
    if-ne v4, v2, :cond_1a

    .line 639
    .line 640
    move v4, v7

    .line 641
    :cond_1a
    iget v1, v8, Lm9;->e:I

    .line 642
    .line 643
    const/4 v5, -0x1

    .line 644
    if-ne v1, v5, :cond_1b

    .line 645
    .line 646
    move v1, v4

    .line 647
    goto :goto_f

    .line 648
    :cond_1b
    mul-int/lit8 v1, v1, 0x3

    .line 649
    .line 650
    add-int/2addr v1, v4

    .line 651
    div-int/lit8 v1, v1, 0x4

    .line 652
    .line 653
    :goto_f
    iput v1, v8, Lm9;->e:I

    .line 654
    .line 655
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    move v5, v2

    .line 660
    move v3, v7

    .line 661
    :goto_10
    if-ge v3, v1, :cond_1c

    .line 662
    .line 663
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    check-cast v6, Ld80;

    .line 668
    .line 669
    iget v6, v6, Ld80;->f:I

    .line 670
    .line 671
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    add-int/lit8 v3, v3, 0x1

    .line 676
    .line 677
    goto :goto_10

    .line 678
    :cond_1c
    if-ne v5, v2, :cond_1d

    .line 679
    .line 680
    move v5, v7

    .line 681
    :cond_1d
    if-ge v5, v4, :cond_1e

    .line 682
    .line 683
    move-wide v0, v15

    .line 684
    iput-wide v0, v8, Lm9;->d:J

    .line 685
    .line 686
    :cond_1e
    return v7

    .line 687
    :cond_1f
    invoke-virtual {v0}, Lbs0;->b()V

    .line 688
    .line 689
    .line 690
    return v7

    .line 691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbs0;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lbs0;->f:Lp60;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lp60;->c()Z

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

.method public final f(J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbs0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 6
    .line 7
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lbs0;->g:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Request was already measured!"

    .line 15
    .line 16
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lbs0;->g:Z

    .line 21
    .line 22
    iget-object p0, p0, Lbs0;->e:Lv41;

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Lv41;->b()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, v0, :cond_2

    .line 32
    .line 33
    invoke-interface {p0, v1, p1, p2}, Lv41;->c(IJ)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void

    .line 40
    :cond_3
    const-string p0, "performComposition() must be called before performMeasure()"

    .line 41
    .line 42
    invoke-static {p0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 43
    .line 44
    .line 45
    new-instance p0, Lsg;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;Lm9;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lbs0;->f:Lp60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lbs0;->r:Ld50;

    .line 8
    .line 9
    iget-object v3, v0, Ld50;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ln70;

    .line 12
    .line 13
    iget v4, p0, Lbs0;->a:I

    .line 14
    .line 15
    invoke-virtual {v3, v4, p1, p2}, Ln70;->a(ILjava/lang/Object;Ljava/lang/Object;)Lww;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object v0, v0, Ld50;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lx41;

    .line 22
    .line 23
    invoke-virtual {v0}, Lx41;->a()Lq60;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v3, v0, Lq60;->d:Lb60;

    .line 28
    .line 29
    invoke-virtual {v3}, Lb60;->H()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    new-instance p2, Lp60;

    .line 36
    .line 37
    invoke-direct {p2, v0, p1, v1}, Lp60;-><init>(Lq60;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    move-object v0, p2

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v0, p1, p2, v2}, Lq60;->k(Ljava/lang/Object;Lww;Z)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Lp60;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1, v2}, Lp60;-><init>(Lq60;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput-object v0, p0, Lbs0;->f:Lp60;

    .line 52
    .line 53
    iput-object p1, p0, Lbs0;->j:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_1
    iput-boolean v1, p0, Lbs0;->q:Z

    .line 56
    .line 57
    :cond_2
    :goto_2
    :pswitch_0
    invoke-virtual {v0}, Lp60;->c()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_5

    .line 62
    .line 63
    iget-boolean p1, p0, Lbs0;->q:Z

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    new-instance p1, Lzr0;

    .line 68
    .line 69
    invoke-direct {p1, p0, p3}, Lzr0;-><init>(Lbs0;Lm9;)V

    .line 70
    .line 71
    .line 72
    iget p2, v0, Lp60;->a:I

    .line 73
    .line 74
    packed-switch p2, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lp60;->b()Li60;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    iget-object v4, p2, Li60;->f:Lyp0;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    move-object v4, v3

    .line 88
    :goto_3
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4}, Lyp0;->c()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    iget-object v5, v0, Lp60;->b:Lq60;

    .line 97
    .line 98
    invoke-static {}, Lu50;->k()Ll21;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    invoke-virtual {v6}, Ll21;->e()Lsw;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    :cond_4
    invoke-static {v6}, Lu50;->s(Ll21;)Ll21;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    :try_start_0
    iget-object v5, v5, Lq60;->d:Lb60;

    .line 113
    .line 114
    iput-boolean v2, v5, Lb60;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    :try_start_1
    invoke-virtual {v4, p1}, Lyp0;->e(Lj11;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    .line 119
    :try_start_2
    iput-boolean v1, v5, Lb60;->t:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    invoke-static {v6, v7, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception p0

    .line 126
    goto :goto_4

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 132
    :goto_4
    invoke-static {v6, v7, v3}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_5
    invoke-virtual {p0}, Lbs0;->j()V

    .line 137
    .line 138
    .line 139
    iget-boolean p1, p0, Lbs0;->q:Z

    .line 140
    .line 141
    iget-wide v0, p0, Lbs0;->o:J

    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    iget-wide p0, p3, Lm9;->b:J

    .line 146
    .line 147
    invoke-static {v0, v1, p0, p1}, Lm9;->a(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide p0

    .line 151
    iput-wide p0, p3, Lm9;->b:J

    .line 152
    .line 153
    return-void

    .line 154
    :cond_6
    iget-wide p0, p3, Lm9;->a:J

    .line 155
    .line 156
    invoke-static {v0, v1, p0, p1}, Lm9;->a(JJ)J

    .line 157
    .line 158
    .line 159
    move-result-wide p0

    .line 160
    iput-wide p0, p3, Lm9;->a:J

    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Las0;
    .locals 4

    .line 1
    iget-object v0, p0, Lbs0;->e:Lv41;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Lzt0;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lo;

    .line 11
    .line 12
    const/16 v3, 0xf

    .line 13
    .line 14
    invoke-direct {v2, v3, v1}, Lo;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v2}, Lv41;->d(Lo;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lzt0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v1, Las0;

    .line 27
    .line 28
    invoke-direct {v1, p0, v0}, Las0;-><init>(Lbs0;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const-string p0, "Should precompose before resolving nested prefetch states"

    .line 35
    .line 36
    invoke-static {p0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 37
    .line 38
    .line 39
    new-instance p0, Lsg;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method public final i(JJ)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbs0;->m:Z

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

.method public final j()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Lwf0;->b:I

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, Lwf0;->a:J

    .line 10
    .line 11
    sub-long/2addr v1, v3

    .line 12
    iget-wide v3, v0, Lbs0;->p:J

    .line 13
    .line 14
    const-wide/16 v5, 0x1

    .line 15
    .line 16
    sub-long v7, v3, v5

    .line 17
    .line 18
    or-long/2addr v7, v5

    .line 19
    const-wide v9, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v7, v7, v9

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const-wide/32 v11, 0xf4240

    .line 28
    .line 29
    .line 30
    const-wide/16 v13, 0x0

    .line 31
    .line 32
    if-nez v7, :cond_2

    .line 33
    .line 34
    cmp-long v5, v1, v3

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    sget-object v3, Lxq;->d:Lr3;

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    cmp-long v3, v3, v13

    .line 43
    .line 44
    if-gez v3, :cond_1

    .line 45
    .line 46
    sget-wide v3, Lxq;->f:J

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-wide v3, Lxq;->e:J

    .line 50
    .line 51
    :goto_0
    shr-long v5, v3, v8

    .line 52
    .line 53
    neg-long v5, v5

    .line 54
    long-to-int v3, v3

    .line 55
    and-int/2addr v3, v8

    .line 56
    shl-long v4, v5, v8

    .line 57
    .line 58
    int-to-long v6, v3

    .line 59
    add-long v13, v4, v6

    .line 60
    .line 61
    sget v3, Lyq;->a:I

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_2
    sub-long v15, v1, v5

    .line 66
    .line 67
    or-long/2addr v5, v15

    .line 68
    cmp-long v5, v5, v9

    .line 69
    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    cmp-long v3, v1, v13

    .line 73
    .line 74
    if-gez v3, :cond_3

    .line 75
    .line 76
    sget-wide v3, Lxq;->f:J

    .line 77
    .line 78
    :goto_1
    move-wide v13, v3

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_3
    sget-wide v3, Lxq;->e:J

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    sub-long v5, v1, v3

    .line 85
    .line 86
    xor-long v15, v5, v1

    .line 87
    .line 88
    xor-long v9, v5, v3

    .line 89
    .line 90
    not-long v9, v9

    .line 91
    and-long/2addr v9, v15

    .line 92
    cmp-long v7, v9, v13

    .line 93
    .line 94
    sget-object v9, Lzq;->e:Lzq;

    .line 95
    .line 96
    if-gez v7, :cond_f

    .line 97
    .line 98
    sget-object v7, Lzq;->f:Lzq;

    .line 99
    .line 100
    invoke-virtual {v9, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-gez v10, :cond_d

    .line 105
    .line 106
    div-long v5, v1, v11

    .line 107
    .line 108
    div-long v13, v3, v11

    .line 109
    .line 110
    sub-long/2addr v5, v13

    .line 111
    rem-long v13, v1, v11

    .line 112
    .line 113
    rem-long/2addr v3, v11

    .line 114
    sub-long/2addr v13, v3

    .line 115
    sget-object v3, Lxq;->d:Lr3;

    .line 116
    .line 117
    invoke-static {v5, v6, v7}, Lp30;->X(JLzq;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    invoke-static {v13, v14, v9}, Lp30;->X(JLzq;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    long-to-int v7, v3

    .line 126
    and-int/2addr v7, v8

    .line 127
    long-to-int v9, v5

    .line 128
    and-int/2addr v9, v8

    .line 129
    if-ne v7, v9, :cond_b

    .line 130
    .line 131
    if-nez v7, :cond_6

    .line 132
    .line 133
    shr-long/2addr v3, v8

    .line 134
    shr-long/2addr v5, v8

    .line 135
    add-long/2addr v3, v5

    .line 136
    const-wide v5, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    cmp-long v5, v5, v3

    .line 142
    .line 143
    if-gtz v5, :cond_5

    .line 144
    .line 145
    const-wide v5, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    cmp-long v5, v3, v5

    .line 151
    .line 152
    if-gez v5, :cond_5

    .line 153
    .line 154
    shl-long v13, v3, v8

    .line 155
    .line 156
    sget v3, Lyq;->a:I

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :cond_5
    div-long/2addr v3, v11

    .line 161
    invoke-static {v3, v4}, Lp30;->x(J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v13

    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :cond_6
    shr-long/2addr v3, v8

    .line 168
    shr-long/2addr v5, v8

    .line 169
    invoke-static {v3, v4, v5, v6}, Lp30;->f(JJ)J

    .line 170
    .line 171
    .line 172
    move-result-wide v17

    .line 173
    const-wide v3, 0x7fffffffffffc0deL

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    cmp-long v3, v17, v3

    .line 179
    .line 180
    if-eqz v3, :cond_a

    .line 181
    .line 182
    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    cmp-long v3, v17, v3

    .line 188
    .line 189
    if-eqz v3, :cond_9

    .line 190
    .line 191
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    cmp-long v3, v17, v3

    .line 197
    .line 198
    if-nez v3, :cond_7

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    const-wide v3, -0x431bde82d7aL

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    cmp-long v3, v3, v17

    .line 207
    .line 208
    if-gtz v3, :cond_8

    .line 209
    .line 210
    const-wide v3, 0x431bde82d7bL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    cmp-long v3, v17, v3

    .line 216
    .line 217
    if-gez v3, :cond_8

    .line 218
    .line 219
    mul-long v17, v17, v11

    .line 220
    .line 221
    shl-long v13, v17, v8

    .line 222
    .line 223
    sget v3, Lyq;->a:I

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    const-wide v19, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    const-wide v21, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static/range {v17 .. v22}, Lw60;->o(JJJ)J

    .line 237
    .line 238
    .line 239
    move-result-wide v3

    .line 240
    invoke-static {v3, v4}, Lp30;->x(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v13

    .line 244
    goto :goto_4

    .line 245
    :cond_9
    :goto_2
    invoke-static/range {v17 .. v18}, Lp30;->x(J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v13

    .line 249
    goto :goto_4

    .line 250
    :cond_a
    const-string v0, "Summing infinite durations of different signs yields an undefined result."

    .line 251
    .line 252
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_b
    if-ne v7, v8, :cond_c

    .line 257
    .line 258
    shr-long/2addr v3, v8

    .line 259
    shr-long/2addr v5, v8

    .line 260
    invoke-static {v3, v4, v5, v6}, Lxq;->a(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v13

    .line 264
    goto :goto_4

    .line 265
    :cond_c
    shr-long/2addr v5, v8

    .line 266
    shr-long/2addr v3, v8

    .line 267
    invoke-static {v5, v6, v3, v4}, Lxq;->a(JJ)J

    .line 268
    .line 269
    .line 270
    move-result-wide v13

    .line 271
    goto :goto_4

    .line 272
    :cond_d
    cmp-long v3, v5, v13

    .line 273
    .line 274
    if-gez v3, :cond_e

    .line 275
    .line 276
    sget-wide v3, Lxq;->f:J

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_e
    sget-wide v3, Lxq;->e:J

    .line 280
    .line 281
    :goto_3
    shr-long v5, v3, v8

    .line 282
    .line 283
    neg-long v5, v5

    .line 284
    long-to-int v3, v3

    .line 285
    and-int/2addr v3, v8

    .line 286
    shl-long v4, v5, v8

    .line 287
    .line 288
    int-to-long v6, v3

    .line 289
    add-long v13, v4, v6

    .line 290
    .line 291
    sget v3, Lyq;->a:I

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_f
    invoke-static {v5, v6, v9}, Lp30;->X(JLzq;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v13

    .line 298
    :goto_4
    shr-long v3, v13, v8

    .line 299
    .line 300
    sget-object v5, Lxq;->d:Lr3;

    .line 301
    .line 302
    long-to-int v5, v13

    .line 303
    and-int/2addr v5, v8

    .line 304
    if-nez v5, :cond_10

    .line 305
    .line 306
    move-wide v9, v3

    .line 307
    goto :goto_5

    .line 308
    :cond_10
    const-wide v5, 0x8637bd05af6L

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    cmp-long v5, v3, v5

    .line 314
    .line 315
    if-lez v5, :cond_11

    .line 316
    .line 317
    const-wide v9, 0x7fffffffffffffffL

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_11
    const-wide v5, -0x8637bd05af6L

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    cmp-long v5, v3, v5

    .line 329
    .line 330
    if-gez v5, :cond_12

    .line 331
    .line 332
    const-wide/high16 v9, -0x8000000000000000L

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_12
    mul-long v9, v3, v11

    .line 336
    .line 337
    :goto_5
    iput-wide v9, v0, Lbs0;->o:J

    .line 338
    .line 339
    iget-wide v3, v0, Lbs0;->n:J

    .line 340
    .line 341
    sub-long/2addr v3, v9

    .line 342
    iput-wide v3, v0, Lbs0;->n:J

    .line 343
    .line 344
    iput-wide v1, v0, Lbs0;->p:J

    .line 345
    .line 346
    const-string v0, "compose:lazy:prefetch:available_time_nanos"

    .line 347
    .line 348
    invoke-static {v0, v3, v4}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 349
    .line 350
    .line 351
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
    iget v1, p0, Lbs0;->a:I

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
    iget-object v1, p0, Lbs0;->d:Lpj;

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
    invoke-virtual {p0}, Lbs0;->e()Z

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
    iget-boolean v1, p0, Lbs0;->g:Z

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
    iget-boolean p0, p0, Lbs0;->h:Z

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
