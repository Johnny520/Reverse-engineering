.class public final Ls/z0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ls/l0;


# instance fields
.field public final a:I

.field public final b:Lb5/c;

.field public final c:Lfg/l;

.field public d:Lu2/a;

.field public e:Lv1/h1;

.field public f:Lv1/i0;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Z

.field public l:Ls/y0;

.field public m:Z

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public final synthetic r:Lj8/f;


# direct methods
.method public constructor <init>(Lj8/f;ILb5/c;Lo9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/z0;->r:Lj8/f;

    .line 5
    .line 6
    iput p2, p0, Ls/z0;->a:I

    .line 7
    .line 8
    iput-object p3, p0, Ls/z0;->b:Lb5/c;

    .line 9
    .line 10
    iput-object p4, p0, Ls/z0;->c:Lfg/l;

    .line 11
    .line 12
    sget p1, Lpg/d;->b:I

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-wide p3, Lpg/d;->a:J

    .line 19
    .line 20
    sub-long/2addr p1, p3

    .line 21
    iput-wide p1, p0, Ls/z0;->p:J

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
    iput-boolean v0, p0, Ls/z0;->m:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls/z0;->f:Lv1/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, v0, Lv1/i0;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lv1/i0;->b()Lv1/b0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lv1/b0;->f:Li0/l1;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, Lv1/i0;->b:Lv1/j0;

    .line 23
    .line 24
    iget-object v0, v0, Lv1/i0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v1, v0}, Lv1/j0;->c(Lv1/j0;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :pswitch_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Ls/z0;->f:Lv1/i0;

    .line 31
    .line 32
    iget-object v1, p0, Ls/z0;->e:Lv1/h1;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Lv1/h1;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v0, p0, Ls/z0;->e:Lv1/h1;

    .line 40
    .line 41
    iput-object v0, p0, Ls/z0;->l:Ls/y0;

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

.method public final c(Ls/a;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ls/z0;->r:Lj8/f;

    .line 2
    .line 3
    iget-boolean v0, v0, Lj8/f;->a:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-boolean v0, p0, Ls/z0;->m:Z

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
    invoke-virtual {p0, p1}, Ls/z0;->d(Ls/a;)Z

    .line 19
    .line 20
    .line 21
    move-result p1
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
    move-exception p1

    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Ls/z0;->d(Ls/a;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_0
    const-string v0, "compose:lazy:prefetch:execute:item"

    .line 36
    .line 37
    const-wide/16 v1, -0x1

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return p1
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls/z0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ls/z0;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ls/z0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d(Ls/a;)Z
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ls/z0;->a:I

    .line 4
    .line 5
    int-to-long v2, v0

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v2, v3, v4}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v1, Ls/z0;->r:Lj8/f;

    .line 12
    .line 13
    iget-object v5, v5, Lj8/f;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Ls/b0;

    .line 16
    .line 17
    iget-object v5, v5, Ls/b0;->b:Lb0/j;

    .line 18
    .line 19
    invoke-virtual {v5}, Lb0/j;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Lr/k;

    .line 24
    .line 25
    iget-boolean v6, v1, Ls/z0;->h:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_29

    .line 29
    .line 30
    invoke-virtual {v5}, Lr/k;->c()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v0, :cond_29

    .line 35
    .line 36
    if-ge v0, v6, :cond_29

    .line 37
    .line 38
    invoke-virtual {v5, v0}, Lr/k;->d(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v1, Ls/z0;->j:Ljava/lang/Object;

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
    invoke-virtual {v1}, Ls/z0;->b()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    invoke-virtual {v5, v0}, Lr/k;->b(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v5, v1, Ls/z0;->b:Lb5/c;

    .line 61
    .line 62
    iget-object v8, v5, Lb5/c;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Ls/c;

    .line 65
    .line 66
    iget-object v9, v5, Lb5/c;->b:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v10, -0x1

    .line 69
    if-ne v9, v0, :cond_1

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v8, v5, Lb5/c;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Lf/k0;

    .line 77
    .line 78
    invoke-virtual {v8, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, Ls/c;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput v10, v9, Ls/c;->e:I

    .line 90
    .line 91
    invoke-virtual {v8, v0, v9}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v8, v9

    .line 95
    check-cast v8, Ls/c;

    .line 96
    .line 97
    iput-object v0, v5, Lb5/c;->b:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v8, v5, Lb5/c;->c:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v1}, Ls/z0;->e()Z

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Ls/a;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    iput-wide v11, v1, Ls/z0;->n:J

    .line 109
    .line 110
    sget v5, Lpg/d;->b:I

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    sget-wide v15, Lpg/d;->a:J

    .line 117
    .line 118
    sub-long/2addr v13, v15

    .line 119
    iput-wide v13, v1, Ls/z0;->p:J

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    iput-wide v13, v1, Ls/z0;->o:J

    .line 124
    .line 125
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 126
    .line 127
    invoke-static {v11, v12, v5}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ls/z0;->e()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    iget-wide v11, v1, Ls/z0;->n:J

    .line 137
    .line 138
    move-wide v15, v13

    .line 139
    iget-wide v13, v8, Ls/c;->a:J

    .line 140
    .line 141
    iget-wide v9, v8, Ls/c;->b:J

    .line 142
    .line 143
    add-long/2addr v13, v9

    .line 144
    invoke-virtual {v1, v11, v12, v13, v14}, Ls/z0;->g(JJ)Z

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
    invoke-virtual {v1, v6, v0, v8}, Ls/z0;->f(Ljava/lang/Object;Ljava/lang/Object;Ls/c;)V
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
    invoke-virtual {v1}, Ls/z0;->e()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_6

    .line 172
    .line 173
    :cond_4
    const/16 v17, 0x1

    .line 174
    .line 175
    goto/16 :goto_14

    .line 176
    .line 177
    :cond_5
    move-wide v15, v13

    .line 178
    :cond_6
    iget-object v0, v1, Ls/z0;->f:Lv1/i0;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    iget-wide v9, v1, Ls/z0;->n:J

    .line 184
    .line 185
    iget-wide v11, v8, Ls/c;->c:J

    .line 186
    .line 187
    invoke-virtual {v1, v9, v10, v11, v12}, Ls/z0;->g(JJ)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_4

    .line 192
    .line 193
    const-string v0, "compose:lazy:prefetch:apply"

    .line 194
    .line 195
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :try_start_1
    iget-object v0, v1, Ls/z0;->f:Lv1/i0;

    .line 199
    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    iget v9, v0, Lv1/i0;->a:I

    .line 203
    .line 204
    packed-switch v9, :pswitch_data_0

    .line 205
    .line 206
    .line 207
    iget-object v9, v0, Lv1/i0;->b:Lv1/j0;

    .line 208
    .line 209
    invoke-virtual {v0}, Lv1/i0;->b()Lv1/b0;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    if-eqz v10, :cond_7

    .line 214
    .line 215
    invoke-virtual {v9, v10, v7}, Lv1/j0;->d(Lv1/b0;Z)V

    .line 216
    .line 217
    .line 218
    :cond_7
    iget-object v0, v0, Lv1/i0;->c:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v9, v0}, Lv1/j0;->f(Ljava/lang/Object;)Lv1/h1;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_2

    .line 225
    :pswitch_0
    iget-object v9, v0, Lv1/i0;->b:Lv1/j0;

    .line 226
    .line 227
    iget-object v0, v0, Lv1/i0;->c:Ljava/lang/Object;

    .line 228
    .line 229
    invoke-virtual {v9, v0}, Lv1/j0;->f(Ljava/lang/Object;)Lv1/h1;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :goto_2
    iput-object v0, v1, Ls/z0;->e:Lv1/h1;

    .line 234
    .line 235
    iput-object v6, v1, Ls/z0;->f:Lv1/i0;

    .line 236
    .line 237
    const/4 v0, 0x1

    .line 238
    iput-boolean v0, v1, Ls/z0;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 239
    .line 240
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ls/z0;->h()V

    .line 244
    .line 245
    .line 246
    iget-wide v9, v1, Ls/z0;->o:J

    .line 247
    .line 248
    iget-wide v11, v8, Ls/c;->c:J

    .line 249
    .line 250
    invoke-static {v9, v10, v11, v12}, Ls/c;->a(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v9

    .line 254
    iput-wide v9, v8, Ls/c;->c:J

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    :try_start_2
    const-string v0, "Nothing to apply!"

    .line 258
    .line 259
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 260
    .line 261
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v2
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
    iget-boolean v0, v1, Ls/z0;->k:Z

    .line 271
    .line 272
    if-nez v0, :cond_c

    .line 273
    .line 274
    iget-wide v9, v1, Ls/z0;->n:J

    .line 275
    .line 276
    cmp-long v0, v9, v15

    .line 277
    .line 278
    if-lez v0, :cond_4

    .line 279
    .line 280
    const-string v0, "compose:lazy:prefetch:resolve-nested"

    .line 281
    .line 282
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :try_start_3
    iget-object v0, v1, Ls/z0;->e:Lv1/h1;

    .line 286
    .line 287
    if-eqz v0, :cond_b

    .line 288
    .line 289
    new-instance v9, Lgg/u;

    .line 290
    .line 291
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 292
    .line 293
    .line 294
    new-instance v10, Ld9/g;

    .line 295
    .line 296
    const/4 v11, 0x1

    .line 297
    invoke-direct {v10, v9, v11}, Ld9/g;-><init>(Lgg/u;I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v0, v10}, Lv1/h1;->d(Ld9/g;)V

    .line 301
    .line 302
    .line 303
    iget-object v0, v9, Lgg/u;->g:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Ljava/util/List;

    .line 306
    .line 307
    if-eqz v0, :cond_a

    .line 308
    .line 309
    new-instance v9, Ls/y0;

    .line 310
    .line 311
    invoke-direct {v9, v1, v0}, Ls/y0;-><init>(Ls/z0;Ljava/util/List;)V

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_a
    :goto_4
    move-object v9, v6

    .line 316
    goto :goto_5

    .line 317
    :cond_b
    const-string v0, "Should precompose before resolving nested prefetch states"

    .line 318
    .line 319
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 320
    .line 321
    .line 322
    invoke-static {}, Lokio/a;->c()V

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :goto_5
    iput-object v9, v1, Ls/z0;->l:Ls/y0;

    .line 327
    .line 328
    const/4 v0, 0x1

    .line 329
    iput-boolean v0, v1, Ls/z0;->k:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 330
    .line 331
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :catchall_2
    move-exception v0

    .line 336
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 337
    .line 338
    .line 339
    throw v0

    .line 340
    :cond_c
    :goto_6
    iget-object v0, v1, Ls/z0;->l:Ls/y0;

    .line 341
    .line 342
    if-eqz v0, :cond_1c

    .line 343
    .line 344
    iget v9, v8, Ls/c;->e:I

    .line 345
    .line 346
    iget-boolean v10, v1, Ls/z0;->m:Z

    .line 347
    .line 348
    iget-object v11, v0, Ls/y0;->b:[Ljava/util/List;

    .line 349
    .line 350
    iget v12, v0, Ls/y0;->c:I

    .line 351
    .line 352
    iget-object v13, v0, Ls/y0;->a:Ljava/util/List;

    .line 353
    .line 354
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    if-lt v12, v14, :cond_d

    .line 359
    .line 360
    goto/16 :goto_12

    .line 361
    .line 362
    :cond_d
    iget-object v12, v0, Ls/y0;->f:Ls/z0;

    .line 363
    .line 364
    iget-boolean v12, v12, Ls/z0;->h:Z

    .line 365
    .line 366
    if-eqz v12, :cond_e

    .line 367
    .line 368
    const-string v12, "Should not execute nested prefetch on canceled request"

    .line 369
    .line 370
    invoke-static {v12}, Lo/b;->c(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :cond_e
    const-string v12, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 374
    .line 375
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    :try_start_4
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    move v14, v7

    .line 383
    :goto_7
    if-ge v14, v12, :cond_f

    .line 384
    .line 385
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v18

    .line 389
    move-object/from16 v5, v18

    .line 390
    .line 391
    check-cast v5, Ls/m0;

    .line 392
    .line 393
    iput v9, v5, Ls/m0;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 394
    .line 395
    add-int/lit8 v14, v14, 0x1

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :catchall_3
    move-exception v0

    .line 399
    goto/16 :goto_11

    .line 400
    .line 401
    :cond_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 402
    .line 403
    .line 404
    const-string v5, "compose:lazy:prefetch:nested"

    .line 405
    .line 406
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    :goto_8
    :try_start_5
    iget v5, v0, Ls/y0;->c:I

    .line 410
    .line 411
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-ge v5, v9, :cond_1b

    .line 416
    .line 417
    iget v5, v0, Ls/y0;->c:I

    .line 418
    .line 419
    aget-object v5, v11, v5

    .line 420
    .line 421
    if-nez v5, :cond_16

    .line 422
    .line 423
    invoke-virtual/range {p1 .. p1}, Ls/a;->a()J

    .line 424
    .line 425
    .line 426
    move-result-wide v19
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 427
    cmp-long v5, v19, v15

    .line 428
    .line 429
    if-gtz v5, :cond_10

    .line 430
    .line 431
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 432
    .line 433
    .line 434
    const/16 v17, 0x1

    .line 435
    .line 436
    return v17

    .line 437
    :cond_10
    :try_start_6
    iget v9, v0, Ls/y0;->c:I

    .line 438
    .line 439
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    move-object v12, v5

    .line 444
    check-cast v12, Ls/m0;

    .line 445
    .line 446
    iget-object v5, v12, Ls/m0;->a:Lr/s;

    .line 447
    .line 448
    if-nez v5, :cond_11

    .line 449
    .line 450
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 451
    .line 452
    move/from16 v23, v9

    .line 453
    .line 454
    move/from16 v24, v10

    .line 455
    .line 456
    move-object v10, v6

    .line 457
    goto :goto_b

    .line 458
    :cond_11
    iget v14, v12, Ls/m0;->d:I

    .line 459
    .line 460
    new-instance v15, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 463
    .line 464
    .line 465
    iget v5, v5, Lr/s;->h:I

    .line 466
    .line 467
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    if-eqz v7, :cond_12

    .line 472
    .line 473
    invoke-virtual {v7}, Lw0/f;->e()Lfg/l;

    .line 474
    .line 475
    .line 476
    move-result-object v18

    .line 477
    move-object/from16 v6, v18

    .line 478
    .line 479
    :cond_12
    move/from16 v21, v5

    .line 480
    .line 481
    invoke-static {v7}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    invoke-static {v7, v5, v6}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 486
    .line 487
    .line 488
    const/4 v5, -0x1

    .line 489
    if-ne v14, v5, :cond_13

    .line 490
    .line 491
    const/4 v14, 0x2

    .line 492
    :cond_13
    const/4 v6, 0x0

    .line 493
    :goto_9
    if-ge v6, v14, :cond_15

    .line 494
    .line 495
    add-int v7, v21, v6

    .line 496
    .line 497
    iget-object v5, v12, Ls/m0;->c:Lj8/f;

    .line 498
    .line 499
    if-nez v5, :cond_14

    .line 500
    .line 501
    move/from16 v22, v6

    .line 502
    .line 503
    move/from16 v23, v9

    .line 504
    .line 505
    move/from16 v24, v10

    .line 506
    .line 507
    const/4 v10, 0x0

    .line 508
    goto :goto_a

    .line 509
    :cond_14
    move/from16 v22, v6

    .line 510
    .line 511
    iget-object v6, v12, Ls/m0;->b:Lb5/c;

    .line 512
    .line 513
    move/from16 v23, v9

    .line 514
    .line 515
    new-instance v9, Ls/z0;

    .line 516
    .line 517
    move/from16 v24, v10

    .line 518
    .line 519
    const/4 v10, 0x0

    .line 520
    invoke-direct {v9, v5, v7, v6, v10}, Ls/z0;-><init>(Lj8/f;ILb5/c;Lo9/e;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :goto_a
    add-int/lit8 v6, v22, 0x1

    .line 527
    .line 528
    move/from16 v9, v23

    .line 529
    .line 530
    move/from16 v10, v24

    .line 531
    .line 532
    goto :goto_9

    .line 533
    :cond_15
    move/from16 v23, v9

    .line 534
    .line 535
    move/from16 v24, v10

    .line 536
    .line 537
    const/4 v10, 0x0

    .line 538
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    iput v5, v12, Ls/m0;->f:I

    .line 543
    .line 544
    move-object v5, v15

    .line 545
    :goto_b
    aput-object v5, v11, v23

    .line 546
    .line 547
    goto :goto_c

    .line 548
    :catchall_4
    move-exception v0

    .line 549
    goto :goto_10

    .line 550
    :cond_16
    move/from16 v24, v10

    .line 551
    .line 552
    move-object v10, v6

    .line 553
    :goto_c
    iget v5, v0, Ls/y0;->c:I

    .line 554
    .line 555
    aget-object v5, v11, v5

    .line 556
    .line 557
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    :goto_d
    iget v6, v0, Ls/y0;->d:I

    .line 561
    .line 562
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-ge v6, v7, :cond_1a

    .line 567
    .line 568
    iget v6, v0, Ls/y0;->d:I

    .line 569
    .line 570
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    check-cast v6, Ls/z0;

    .line 575
    .line 576
    if-eqz v24, :cond_18

    .line 577
    .line 578
    if-eqz v6, :cond_17

    .line 579
    .line 580
    move-object v7, v6

    .line 581
    goto :goto_e

    .line 582
    :cond_17
    move-object v7, v10

    .line 583
    :goto_e
    if-eqz v7, :cond_18

    .line 584
    .line 585
    const/4 v9, 0x1

    .line 586
    iput-boolean v9, v7, Ls/z0;->m:Z

    .line 587
    .line 588
    goto :goto_f

    .line 589
    :cond_18
    const/4 v9, 0x1

    .line 590
    :goto_f
    iput-boolean v9, v0, Ls/y0;->e:Z

    .line 591
    .line 592
    move-object/from16 v7, p1

    .line 593
    .line 594
    invoke-virtual {v6, v7}, Ls/z0;->c(Ls/a;)Z

    .line 595
    .line 596
    .line 597
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 598
    if-eqz v6, :cond_19

    .line 599
    .line 600
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 601
    .line 602
    .line 603
    return v9

    .line 604
    :cond_19
    :try_start_7
    iget v6, v0, Ls/y0;->d:I

    .line 605
    .line 606
    add-int/2addr v6, v9

    .line 607
    iput v6, v0, Ls/y0;->d:I

    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_1a
    move-object/from16 v7, p1

    .line 611
    .line 612
    const/4 v5, 0x0

    .line 613
    iput v5, v0, Ls/y0;->d:I

    .line 614
    .line 615
    iget v5, v0, Ls/y0;->c:I

    .line 616
    .line 617
    const/16 v17, 0x1

    .line 618
    .line 619
    add-int/lit8 v5, v5, 0x1

    .line 620
    .line 621
    iput v5, v0, Ls/y0;->c:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 622
    .line 623
    move-object v6, v10

    .line 624
    move/from16 v10, v24

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    const-wide/16 v15, 0x0

    .line 628
    .line 629
    goto/16 :goto_8

    .line 630
    .line 631
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 632
    .line 633
    .line 634
    goto :goto_12

    .line 635
    :goto_10
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 636
    .line 637
    .line 638
    throw v0

    .line 639
    :goto_11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 640
    .line 641
    .line 642
    throw v0

    .line 643
    :cond_1c
    :goto_12
    iget-object v0, v1, Ls/z0;->l:Ls/y0;

    .line 644
    .line 645
    if-eqz v0, :cond_1d

    .line 646
    .line 647
    iget-boolean v0, v0, Ls/y0;->e:Z

    .line 648
    .line 649
    const/4 v9, 0x1

    .line 650
    if-ne v0, v9, :cond_1d

    .line 651
    .line 652
    invoke-virtual {v1}, Ls/z0;->h()V

    .line 653
    .line 654
    .line 655
    invoke-static {v2, v3, v4}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 656
    .line 657
    .line 658
    iget-object v0, v1, Ls/z0;->l:Ls/y0;

    .line 659
    .line 660
    if-eqz v0, :cond_1d

    .line 661
    .line 662
    const/4 v5, 0x0

    .line 663
    iput-boolean v5, v0, Ls/y0;->e:Z

    .line 664
    .line 665
    :cond_1d
    iget-object v0, v1, Ls/z0;->d:Lu2/a;

    .line 666
    .line 667
    iget-boolean v2, v1, Ls/z0;->g:Z

    .line 668
    .line 669
    if-nez v2, :cond_22

    .line 670
    .line 671
    if-eqz v0, :cond_22

    .line 672
    .line 673
    iget-wide v2, v1, Ls/z0;->n:J

    .line 674
    .line 675
    iget-wide v4, v8, Ls/c;->d:J

    .line 676
    .line 677
    invoke-virtual {v1, v2, v3, v4, v5}, Ls/z0;->g(JJ)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eqz v2, :cond_4

    .line 682
    .line 683
    const-string v2, "compose:lazy:prefetch:measure"

    .line 684
    .line 685
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    :try_start_8
    iget-wide v2, v0, Lu2/a;->a:J

    .line 689
    .line 690
    iget-boolean v0, v1, Ls/z0;->h:Z

    .line 691
    .line 692
    if-eqz v0, :cond_1e

    .line 693
    .line 694
    const-string v0, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 695
    .line 696
    invoke-static {v0}, Lo/b;->a(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    :cond_1e
    iget-boolean v0, v1, Ls/z0;->g:Z

    .line 700
    .line 701
    if-eqz v0, :cond_1f

    .line 702
    .line 703
    const-string v0, "Request was already measured!"

    .line 704
    .line 705
    invoke-static {v0}, Lo/b;->a(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    :cond_1f
    const/4 v0, 0x1

    .line 709
    iput-boolean v0, v1, Ls/z0;->g:Z

    .line 710
    .line 711
    iget-object v0, v1, Ls/z0;->e:Lv1/h1;

    .line 712
    .line 713
    if-eqz v0, :cond_20

    .line 714
    .line 715
    invoke-interface {v0}, Lv1/h1;->b()I

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    const/4 v5, 0x0

    .line 720
    :goto_13
    if-ge v5, v4, :cond_21

    .line 721
    .line 722
    invoke-interface {v0, v5, v2, v3}, Lv1/h1;->c(IJ)V

    .line 723
    .line 724
    .line 725
    add-int/lit8 v5, v5, 0x1

    .line 726
    .line 727
    goto :goto_13

    .line 728
    :cond_20
    const-string v0, "performComposition() must be called before performMeasure()"

    .line 729
    .line 730
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 731
    .line 732
    .line 733
    invoke-static {}, Lokio/a;->c()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 734
    .line 735
    .line 736
    :cond_21
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1}, Ls/z0;->h()V

    .line 740
    .line 741
    .line 742
    iget-wide v2, v1, Ls/z0;->o:J

    .line 743
    .line 744
    iget-wide v4, v8, Ls/c;->d:J

    .line 745
    .line 746
    invoke-static {v2, v3, v4, v5}, Ls/c;->a(JJ)J

    .line 747
    .line 748
    .line 749
    move-result-wide v2

    .line 750
    iput-wide v2, v8, Ls/c;->d:J

    .line 751
    .line 752
    iget-object v0, v1, Ls/z0;->c:Lfg/l;

    .line 753
    .line 754
    if-eqz v0, :cond_22

    .line 755
    .line 756
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    goto :goto_15

    .line 760
    :catchall_5
    move-exception v0

    .line 761
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 762
    .line 763
    .line 764
    throw v0

    .line 765
    :goto_14
    return v17

    .line 766
    :cond_22
    :goto_15
    iget-object v0, v1, Ls/z0;->l:Ls/y0;

    .line 767
    .line 768
    iget-boolean v2, v1, Ls/z0;->g:Z

    .line 769
    .line 770
    if-eqz v2, :cond_28

    .line 771
    .line 772
    iget-boolean v2, v1, Ls/z0;->k:Z

    .line 773
    .line 774
    if-eqz v2, :cond_28

    .line 775
    .line 776
    if-eqz v0, :cond_28

    .line 777
    .line 778
    iget-object v0, v0, Ls/y0;->a:Ljava/util/List;

    .line 779
    .line 780
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    const v3, 0x7fffffff

    .line 785
    .line 786
    .line 787
    move v4, v3

    .line 788
    const/4 v5, 0x0

    .line 789
    :goto_16
    if-ge v5, v2, :cond_23

    .line 790
    .line 791
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v6

    .line 795
    check-cast v6, Ls/m0;

    .line 796
    .line 797
    iget v6, v6, Ls/m0;->e:I

    .line 798
    .line 799
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    add-int/lit8 v5, v5, 0x1

    .line 804
    .line 805
    goto :goto_16

    .line 806
    :cond_23
    if-ne v4, v3, :cond_24

    .line 807
    .line 808
    const/4 v5, 0x0

    .line 809
    goto :goto_17

    .line 810
    :cond_24
    move v5, v4

    .line 811
    :goto_17
    iget v2, v8, Ls/c;->e:I

    .line 812
    .line 813
    const/4 v4, -0x1

    .line 814
    if-ne v2, v4, :cond_25

    .line 815
    .line 816
    move v2, v5

    .line 817
    goto :goto_18

    .line 818
    :cond_25
    mul-int/lit8 v2, v2, 0x3

    .line 819
    .line 820
    add-int/2addr v2, v5

    .line 821
    div-int/lit8 v2, v2, 0x4

    .line 822
    .line 823
    :goto_18
    iput v2, v8, Ls/c;->e:I

    .line 824
    .line 825
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    move v6, v3

    .line 830
    const/4 v4, 0x0

    .line 831
    :goto_19
    if-ge v4, v2, :cond_26

    .line 832
    .line 833
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    check-cast v7, Ls/m0;

    .line 838
    .line 839
    iget v7, v7, Ls/m0;->f:I

    .line 840
    .line 841
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 842
    .line 843
    .line 844
    move-result v6

    .line 845
    add-int/lit8 v4, v4, 0x1

    .line 846
    .line 847
    goto :goto_19

    .line 848
    :cond_26
    if-ne v6, v3, :cond_27

    .line 849
    .line 850
    const/4 v6, 0x0

    .line 851
    :cond_27
    if-ge v6, v5, :cond_28

    .line 852
    .line 853
    const-wide/16 v2, 0x0

    .line 854
    .line 855
    iput-wide v2, v8, Ls/c;->d:J

    .line 856
    .line 857
    const/16 v16, 0x0

    .line 858
    .line 859
    return v16

    .line 860
    :cond_28
    const/16 v16, 0x0

    .line 861
    .line 862
    return v16

    .line 863
    :cond_29
    move/from16 v16, v7

    .line 864
    .line 865
    invoke-virtual {v1}, Ls/z0;->b()V

    .line 866
    .line 867
    .line 868
    return v16

    .line 869
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ls/z0;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ls/z0;->f:Lv1/i0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lv1/i0;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    return v1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Ls/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ls/z0;->f:Lv1/i0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ls/z0;->r:Lj8/f;

    .line 6
    .line 7
    iget-object v1, v0, Lj8/f;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ls/b0;

    .line 10
    .line 11
    iget v2, p0, Ls/z0;->a:I

    .line 12
    .line 13
    invoke-virtual {v1, p1, v2, p2}, Ls/b0;->a(Ljava/lang/Object;ILjava/lang/Object;)Lfg/p;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v0, v0, Lj8/f;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lv1/j1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lv1/j1;->a()Lv1/j0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, v0, Lv1/j0;->g:Lx1/f0;

    .line 26
    .line 27
    invoke-virtual {v1}, Lx1/f0;->G()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance p2, Lv1/i0;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p2, v0, p1, v1}, Lv1/i0;-><init>(Lv1/j0;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v0, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, p1, p2, v1}, Lv1/j0;->k(Ljava/lang/Object;Lfg/p;Z)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Lv1/i0;

    .line 46
    .line 47
    invoke-direct {p2, v0, p1, v1}, Lv1/i0;-><init>(Lv1/j0;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput-object v0, p0, Ls/z0;->f:Lv1/i0;

    .line 52
    .line 53
    iput-object p1, p0, Ls/z0;->j:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_1
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, Ls/z0;->q:Z

    .line 57
    .line 58
    :cond_2
    :goto_2
    :pswitch_0
    invoke-virtual {v0}, Lv1/i0;->c()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_5

    .line 63
    .line 64
    iget-boolean p1, p0, Ls/z0;->q:Z

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    new-instance p1, Le9/a;

    .line 69
    .line 70
    const/4 p2, 0x5

    .line 71
    invoke-direct {p1, p0, p2, p3}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget p2, v0, Lv1/i0;->a:I

    .line 75
    .line 76
    packed-switch p2, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lv1/i0;->b()Lv1/b0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const/4 v1, 0x0

    .line 84
    if-eqz p2, :cond_3

    .line 85
    .line 86
    iget-object v2, p2, Lv1/b0;->f:Li0/l1;

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move-object v2, v1

    .line 90
    :goto_3
    if-eqz v2, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2}, Li0/l1;->c()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_2

    .line 97
    .line 98
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    invoke-virtual {v3}, Lw0/f;->e()Lfg/l;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :cond_4
    invoke-static {v3}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    :try_start_0
    invoke-virtual {v2, p1}, Li0/l1;->e(Li0/e2;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v4, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    invoke-static {v3, v4, v1}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_5
    invoke-virtual {p0}, Ls/z0;->h()V

    .line 130
    .line 131
    .line 132
    iget-boolean p1, p0, Ls/z0;->q:Z

    .line 133
    .line 134
    iget-wide v0, p0, Ls/z0;->o:J

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    iget-wide p1, p3, Ls/c;->b:J

    .line 139
    .line 140
    invoke-static {v0, v1, p1, p2}, Ls/c;->a(JJ)J

    .line 141
    .line 142
    .line 143
    move-result-wide p1

    .line 144
    iput-wide p1, p3, Ls/c;->b:J

    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    iget-wide p1, p3, Ls/c;->a:J

    .line 148
    .line 149
    invoke-static {v0, v1, p1, p2}, Ls/c;->a(JJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide p1

    .line 153
    iput-wide p1, p3, Ls/c;->a:J

    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(JJ)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls/z0;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    cmp-long p1, p1, p3

    .line 8
    .line 9
    if-lez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final h()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Lpg/d;->b:I

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, Lpg/d;->a:J

    .line 10
    .line 11
    sub-long/2addr v1, v3

    .line 12
    iget-wide v3, v0, Ls/z0;->p:J

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
    const v11, 0xf4240

    .line 28
    .line 29
    .line 30
    const-wide/16 v12, 0x0

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
    sget-object v3, Lpg/a;->g:Ll3/w;

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    cmp-long v3, v3, v12

    .line 43
    .line 44
    if-gez v3, :cond_1

    .line 45
    .line 46
    sget-wide v3, Lpg/a;->i:J

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-wide v3, Lpg/a;->h:J

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
    add-long v12, v4, v6

    .line 60
    .line 61
    sget v3, Lpg/b;->a:I

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_2
    sub-long v14, v1, v5

    .line 66
    .line 67
    or-long/2addr v5, v14

    .line 68
    cmp-long v5, v5, v9

    .line 69
    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    cmp-long v3, v1, v12

    .line 73
    .line 74
    if-gez v3, :cond_3

    .line 75
    .line 76
    sget-wide v3, Lpg/a;->i:J

    .line 77
    .line 78
    :goto_1
    move-wide v12, v3

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_3
    sget-wide v3, Lpg/a;->h:J

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    sub-long v5, v1, v3

    .line 85
    .line 86
    xor-long v14, v5, v1

    .line 87
    .line 88
    xor-long v9, v5, v3

    .line 89
    .line 90
    not-long v9, v9

    .line 91
    and-long/2addr v9, v14

    .line 92
    cmp-long v7, v9, v12

    .line 93
    .line 94
    sget-object v9, Lpg/c;->h:Lpg/c;

    .line 95
    .line 96
    if-gez v7, :cond_f

    .line 97
    .line 98
    sget-object v7, Lpg/c;->i:Lpg/c;

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
    const-wide/32 v5, 0xf4240

    .line 107
    .line 108
    .line 109
    div-long v12, v1, v5

    .line 110
    .line 111
    div-long v14, v3, v5

    .line 112
    .line 113
    sub-long/2addr v12, v14

    .line 114
    rem-long v14, v1, v5

    .line 115
    .line 116
    rem-long/2addr v3, v5

    .line 117
    sub-long/2addr v14, v3

    .line 118
    sget-object v3, Lpg/a;->g:Ll3/w;

    .line 119
    .line 120
    invoke-static {v12, v13, v7}, Loh/h;->X(JLpg/c;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    invoke-static {v14, v15, v9}, Loh/h;->X(JLpg/c;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    long-to-int v7, v3

    .line 129
    and-int/2addr v7, v8

    .line 130
    long-to-int v9, v5

    .line 131
    and-int/2addr v9, v8

    .line 132
    if-ne v7, v9, :cond_b

    .line 133
    .line 134
    if-nez v7, :cond_6

    .line 135
    .line 136
    shr-long/2addr v3, v8

    .line 137
    shr-long/2addr v5, v8

    .line 138
    add-long/2addr v3, v5

    .line 139
    const-wide v5, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    cmp-long v5, v5, v3

    .line 145
    .line 146
    if-gtz v5, :cond_5

    .line 147
    .line 148
    const-wide v5, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    cmp-long v5, v3, v5

    .line 154
    .line 155
    if-gez v5, :cond_5

    .line 156
    .line 157
    shl-long v12, v3, v8

    .line 158
    .line 159
    sget v3, Lpg/b;->a:I

    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :cond_5
    int-to-long v5, v11

    .line 164
    div-long/2addr v3, v5

    .line 165
    invoke-static {v3, v4}, Loh/h;->v(J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v12

    .line 169
    goto/16 :goto_4

    .line 170
    .line 171
    :cond_6
    shr-long/2addr v3, v8

    .line 172
    shr-long/2addr v5, v8

    .line 173
    invoke-static {v3, v4, v5, v6}, Loh/h;->e(JJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v16

    .line 177
    const-wide v3, 0x7fffffffffffc0deL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    cmp-long v3, v16, v3

    .line 183
    .line 184
    if-eqz v3, :cond_a

    .line 185
    .line 186
    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    cmp-long v3, v16, v3

    .line 192
    .line 193
    if-eqz v3, :cond_9

    .line 194
    .line 195
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    cmp-long v3, v16, v3

    .line 201
    .line 202
    if-nez v3, :cond_7

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    const-wide v3, -0x431bde82d7aL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    cmp-long v3, v3, v16

    .line 211
    .line 212
    if-gtz v3, :cond_8

    .line 213
    .line 214
    const-wide v3, 0x431bde82d7bL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    cmp-long v3, v16, v3

    .line 220
    .line 221
    if-gez v3, :cond_8

    .line 222
    .line 223
    int-to-long v3, v11

    .line 224
    mul-long v16, v16, v3

    .line 225
    .line 226
    shl-long v12, v16, v8

    .line 227
    .line 228
    sget v3, Lpg/b;->a:I

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    const-wide v18, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    const-wide v20, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    invoke-static/range {v16 .. v21}, Lr9/e0;->s(JJJ)J

    .line 242
    .line 243
    .line 244
    move-result-wide v3

    .line 245
    invoke-static {v3, v4}, Loh/h;->v(J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v12

    .line 249
    goto :goto_4

    .line 250
    :cond_9
    :goto_2
    invoke-static/range {v16 .. v17}, Loh/h;->v(J)J

    .line 251
    .line 252
    .line 253
    move-result-wide v12

    .line 254
    goto :goto_4

    .line 255
    :cond_a
    const-string v1, "Summing infinite durations of different signs yields an undefined result."

    .line 256
    .line 257
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_b
    if-ne v7, v8, :cond_c

    .line 262
    .line 263
    shr-long/2addr v3, v8

    .line 264
    shr-long/2addr v5, v8

    .line 265
    invoke-static {v3, v4, v5, v6}, Lpg/a;->a(JJ)J

    .line 266
    .line 267
    .line 268
    move-result-wide v12

    .line 269
    goto :goto_4

    .line 270
    :cond_c
    shr-long/2addr v5, v8

    .line 271
    shr-long/2addr v3, v8

    .line 272
    invoke-static {v5, v6, v3, v4}, Lpg/a;->a(JJ)J

    .line 273
    .line 274
    .line 275
    move-result-wide v12

    .line 276
    goto :goto_4

    .line 277
    :cond_d
    cmp-long v3, v5, v12

    .line 278
    .line 279
    if-gez v3, :cond_e

    .line 280
    .line 281
    sget-wide v3, Lpg/a;->i:J

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_e
    sget-wide v3, Lpg/a;->h:J

    .line 285
    .line 286
    :goto_3
    shr-long v5, v3, v8

    .line 287
    .line 288
    neg-long v5, v5

    .line 289
    long-to-int v3, v3

    .line 290
    and-int/2addr v3, v8

    .line 291
    shl-long v4, v5, v8

    .line 292
    .line 293
    int-to-long v6, v3

    .line 294
    add-long v12, v4, v6

    .line 295
    .line 296
    sget v3, Lpg/b;->a:I

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_f
    invoke-static {v5, v6, v9}, Loh/h;->X(JLpg/c;)J

    .line 300
    .line 301
    .line 302
    move-result-wide v12

    .line 303
    :goto_4
    shr-long v3, v12, v8

    .line 304
    .line 305
    sget-object v5, Lpg/a;->g:Ll3/w;

    .line 306
    .line 307
    long-to-int v5, v12

    .line 308
    and-int/2addr v5, v8

    .line 309
    if-nez v5, :cond_10

    .line 310
    .line 311
    move-wide v9, v3

    .line 312
    goto :goto_5

    .line 313
    :cond_10
    const-wide v5, 0x8637bd05af6L

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    cmp-long v5, v3, v5

    .line 319
    .line 320
    if-lez v5, :cond_11

    .line 321
    .line 322
    const-wide v9, 0x7fffffffffffffffL

    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_11
    const-wide v5, -0x8637bd05af6L

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    cmp-long v5, v3, v5

    .line 334
    .line 335
    if-gez v5, :cond_12

    .line 336
    .line 337
    const-wide/high16 v9, -0x8000000000000000L

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_12
    int-to-long v5, v11

    .line 341
    mul-long v9, v3, v5

    .line 342
    .line 343
    :goto_5
    iput-wide v9, v0, Ls/z0;->o:J

    .line 344
    .line 345
    iget-wide v3, v0, Ls/z0;->n:J

    .line 346
    .line 347
    sub-long/2addr v3, v9

    .line 348
    iput-wide v3, v0, Ls/z0;->n:J

    .line 349
    .line 350
    iput-wide v1, v0, Ls/z0;->p:J

    .line 351
    .line 352
    const-string v1, "compose:lazy:prefetch:available_time_nanos"

    .line 353
    .line 354
    invoke-static {v3, v4, v1}, Lf8/i;->K0(JLjava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

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
    iget v1, p0, Ls/z0;->a:I

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
    iget-object v1, p0, Ls/z0;->d:Lu2/a;

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
    invoke-virtual {p0}, Ls/z0;->e()Z

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
    iget-boolean v1, p0, Ls/z0;->g:Z

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
    iget-boolean v1, p0, Ls/z0;->h:Z

    .line 51
    .line 52
    const-string v2, " }"

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Lp/a;->m(Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method
