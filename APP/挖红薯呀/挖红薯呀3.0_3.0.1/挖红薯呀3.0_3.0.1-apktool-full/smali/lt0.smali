.class public final Llt0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:Lyk0;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lot0;

.field public final synthetic l:Lnt0;

.field public final synthetic m:Ls6;


# direct methods
.method public constructor <init>(Lot0;Lnt0;Ls6;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llt0;->k:Lot0;

    .line 2
    .line 3
    iput-object p2, p0, Llt0;->l:Lnt0;

    .line 4
    .line 5
    iput-object p3, p0, Llt0;->m:Ls6;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 3

    .line 1
    new-instance v0, Llt0;

    .line 2
    .line 3
    iget-object v1, p0, Llt0;->l:Lnt0;

    .line 4
    .line 5
    iget-object v2, p0, Llt0;->m:Ls6;

    .line 6
    .line 7
    iget-object p0, p0, Llt0;->k:Lot0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p2}, Llt0;-><init>(Lot0;Lnt0;Ls6;Lik;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Llt0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyk;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Llt0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Llt0;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llt0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lzk;->d:Lzk;

    .line 2
    .line 3
    iget v1, p0, Llt0;->i:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Llt0;->h:Lyk0;

    .line 12
    .line 13
    iget-object v1, p0, Llt0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lc40;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Llt0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lyk;

    .line 37
    .line 38
    invoke-interface {p1}, Lyk;->f()Lpk;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lpf1;->y(Lpk;)Lc40;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object p1, p0, Llt0;->k:Lot0;

    .line 47
    .line 48
    iget-object v4, p1, Lot0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v4

    .line 51
    :try_start_1
    iget-object v5, p1, Lot0;->e:Ljava/lang/Throwable;

    .line 52
    .line 53
    if-nez v5, :cond_c

    .line 54
    .line 55
    iget-object v5, p1, Lot0;->u:Lz31;

    .line 56
    .line 57
    invoke-virtual {v5}, Lz31;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Ljt0;

    .line 62
    .line 63
    sget-object v6, Ljt0;->e:Ljt0;

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-lez v5, :cond_b

    .line 70
    .line 71
    iget-object v5, p1, Lot0;->d:Lc40;

    .line 72
    .line 73
    if-nez v5, :cond_a

    .line 74
    .line 75
    iput-object v1, p1, Lot0;->d:Lc40;

    .line 76
    .line 77
    invoke-virtual {p1}, Lot0;->y()Luc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 78
    .line 79
    .line 80
    monitor-exit v4

    .line 81
    iget-object p1, p0, Llt0;->k:Lot0;

    .line 82
    .line 83
    new-instance v4, Lya;

    .line 84
    .line 85
    const/4 v5, 0x5

    .line 86
    invoke-direct {v4, v5, p1}, Lya;-><init>(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Lt21;->a:Lsx0;

    .line 90
    .line 91
    invoke-static {p1}, Lt21;->e(Lsw;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object p1, Lt21;->c:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter p1

    .line 97
    :try_start_2
    sget-object v5, Lt21;->h:Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v5, v4}, Lye;->R(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    sput-object v5, Lt21;->h:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 104
    .line 105
    monitor-exit p1

    .line 106
    new-instance p1, Lyk0;

    .line 107
    .line 108
    invoke-direct {p1, v4}, Lyk0;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v4, Lot0;->z:Lz31;

    .line 112
    .line 113
    iget-object v4, p0, Llt0;->k:Lot0;

    .line 114
    .line 115
    iget-object v4, v4, Lot0;->y:Ljo0;

    .line 116
    .line 117
    :cond_2
    sget-object v5, Lot0;->z:Lz31;

    .line 118
    .line 119
    invoke-virtual {v5}, Lz31;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Loq0;

    .line 124
    .line 125
    sget-object v7, Ln2;->D:Ln2;

    .line 126
    .line 127
    iget-object v8, v6, Loq0;->f:Lgq0;

    .line 128
    .line 129
    invoke-virtual {v8, v4}, Lgq0;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-eqz v9, :cond_3

    .line 134
    .line 135
    move-object v8, v6

    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {v6}, Lp;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_4

    .line 142
    .line 143
    new-instance v9, Lua0;

    .line 144
    .line 145
    invoke-direct {v9, v7, v7}, Lua0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v4, v9}, Lgq0;->a(Ljava/lang/Object;Lua0;)Lgq0;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    new-instance v8, Loq0;

    .line 153
    .line 154
    invoke-direct {v8, v4, v4, v7}, Loq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lgq0;)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_4
    iget-object v9, v6, Loq0;->e:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {v8, v9}, Lgq0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    check-cast v10, Lua0;

    .line 168
    .line 169
    new-instance v11, Lua0;

    .line 170
    .line 171
    iget-object v10, v10, Lua0;->a:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-direct {v11, v10, v4}, Lua0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8, v9, v11}, Lgq0;->a(Ljava/lang/Object;Lua0;)Lgq0;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    new-instance v10, Lua0;

    .line 181
    .line 182
    invoke-direct {v10, v9, v7}, Lua0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v4, v10}, Lgq0;->a(Ljava/lang/Object;Lua0;)Lgq0;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    new-instance v8, Loq0;

    .line 190
    .line 191
    iget-object v9, v6, Loq0;->d:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-direct {v8, v9, v4, v7}, Loq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lgq0;)V

    .line 194
    .line 195
    .line 196
    :goto_0
    if-eq v6, v8, :cond_5

    .line 197
    .line 198
    invoke-virtual {v5, v6, v8}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_2

    .line 203
    .line 204
    :cond_5
    :try_start_3
    iget-object v4, p0, Llt0;->k:Lot0;

    .line 205
    .line 206
    iget-object v5, v4, Lot0;->c:Ljava/lang/Object;

    .line 207
    .line 208
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 209
    :try_start_4
    invoke-virtual {v4}, Lot0;->D()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 213
    :try_start_5
    monitor-exit v5

    .line 214
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    const/4 v6, 0x0

    .line 219
    :goto_1
    if-ge v6, v5, :cond_6

    .line 220
    .line 221
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    check-cast v7, Lyi;

    .line 226
    .line 227
    invoke-virtual {v7}, Lyi;->t()V

    .line 228
    .line 229
    .line 230
    add-int/lit8 v6, v6, 0x1

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :catchall_1
    move-exception v0

    .line 234
    move-object v12, v0

    .line 235
    move-object v0, p1

    .line 236
    move-object p1, v12

    .line 237
    goto :goto_5

    .line 238
    :cond_6
    new-instance v4, Li;

    .line 239
    .line 240
    iget-object v5, p0, Llt0;->l:Lnt0;

    .line 241
    .line 242
    iget-object v6, p0, Llt0;->m:Ls6;

    .line 243
    .line 244
    const/16 v7, 0x8

    .line 245
    .line 246
    invoke-direct {v4, v5, v6, v2, v7}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 247
    .line 248
    .line 249
    iput-object v1, p0, Llt0;->j:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object p1, p0, Llt0;->h:Lyk0;

    .line 252
    .line 253
    iput v3, p0, Llt0;->i:I

    .line 254
    .line 255
    invoke-static {v4, p0}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 259
    if-ne v3, v0, :cond_7

    .line 260
    .line 261
    return-object v0

    .line 262
    :cond_7
    move-object v0, p1

    .line 263
    :goto_2
    invoke-virtual {v0}, Lyk0;->a()V

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, Llt0;->k:Lot0;

    .line 267
    .line 268
    iget-object v0, p1, Lot0;->c:Ljava/lang/Object;

    .line 269
    .line 270
    monitor-enter v0

    .line 271
    :try_start_6
    iget-object v3, p1, Lot0;->d:Lc40;

    .line 272
    .line 273
    if-ne v3, v1, :cond_8

    .line 274
    .line 275
    iput-object v2, p1, Lot0;->d:Lc40;

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :catchall_2
    move-exception p0

    .line 279
    goto :goto_4

    .line 280
    :cond_8
    :goto_3
    invoke-virtual {p1}, Lot0;->y()Luc;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 281
    .line 282
    .line 283
    monitor-exit v0

    .line 284
    sget-object p1, Lot0;->z:Lz31;

    .line 285
    .line 286
    iget-object p0, p0, Llt0;->k:Lot0;

    .line 287
    .line 288
    iget-object p0, p0, Lot0;->y:Ljo0;

    .line 289
    .line 290
    invoke-static {p0}, Ljo0;->j(Ljo0;)V

    .line 291
    .line 292
    .line 293
    sget-object p0, Lna1;->a:Lna1;

    .line 294
    .line 295
    return-object p0

    .line 296
    :goto_4
    monitor-exit v0

    .line 297
    throw p0

    .line 298
    :catchall_3
    move-exception v0

    .line 299
    :try_start_7
    monitor-exit v5

    .line 300
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 301
    :goto_5
    invoke-virtual {v0}, Lyk0;->a()V

    .line 302
    .line 303
    .line 304
    iget-object v0, p0, Llt0;->k:Lot0;

    .line 305
    .line 306
    iget-object v3, v0, Lot0;->c:Ljava/lang/Object;

    .line 307
    .line 308
    monitor-enter v3

    .line 309
    :try_start_8
    iget-object v4, v0, Lot0;->d:Lc40;

    .line 310
    .line 311
    if-ne v4, v1, :cond_9

    .line 312
    .line 313
    iput-object v2, v0, Lot0;->d:Lc40;

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :catchall_4
    move-exception p0

    .line 317
    goto :goto_7

    .line 318
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lot0;->y()Luc;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 319
    .line 320
    .line 321
    monitor-exit v3

    .line 322
    sget-object v0, Lot0;->z:Lz31;

    .line 323
    .line 324
    iget-object p0, p0, Llt0;->k:Lot0;

    .line 325
    .line 326
    iget-object p0, p0, Lot0;->y:Ljo0;

    .line 327
    .line 328
    invoke-static {p0}, Ljo0;->j(Ljo0;)V

    .line 329
    .line 330
    .line 331
    throw p1

    .line 332
    :goto_7
    monitor-exit v3

    .line 333
    throw p0

    .line 334
    :catchall_5
    move-exception p0

    .line 335
    monitor-exit p1

    .line 336
    throw p0

    .line 337
    :catchall_6
    move-exception p0

    .line 338
    goto :goto_8

    .line 339
    :cond_a
    :try_start_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    const-string p1, "Recomposer already running"

    .line 342
    .line 343
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw p0

    .line 347
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 348
    .line 349
    const-string p1, "Recomposer shut down"

    .line 350
    .line 351
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p0

    .line 355
    :cond_c
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 356
    :goto_8
    monitor-exit v4

    .line 357
    throw p0
.end method
