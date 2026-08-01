.class public final Lhl1;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public ι:Lhi0;

.field public κ:I

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Lkl1;

.field public final synthetic ν:Ljl1;

.field public final synthetic ξ:Lk3;


# direct methods
.method public constructor <init>(Lkl1;Ljl1;Lk3;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhl1;->μ:Lkl1;

    .line 2
    .line 3
    iput-object p2, p0, Lhl1;->ν:Ljl1;

    .line 4
    .line 5
    iput-object p3, p0, Lhl1;->ξ:Lk3;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ly12;-><init>(ILop;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbq;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lhl1;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lhl1;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lhl1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 3

    .line 1
    new-instance v0, Lhl1;

    .line 2
    .line 3
    iget-object v1, p0, Lhl1;->ν:Ljl1;

    .line 4
    .line 5
    iget-object v2, p0, Lhl1;->ξ:Lk3;

    .line 6
    .line 7
    iget-object p0, p0, Lhl1;->μ:Lkl1;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lhl1;-><init>(Lkl1;Ljl1;Lk3;Lop;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lhl1;->λ:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lcq;->ε:Lcq;

    .line 2
    .line 3
    iget v1, p0, Lhl1;->κ:I

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
    iget-object v0, p0, Lhl1;->ι:Lhi0;

    .line 12
    .line 13
    iget-object v1, p0, Lhl1;->λ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lfo0;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lhl1;->λ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lbq;

    .line 37
    .line 38
    invoke-interface {p1}, Lbq;->δ()Lup;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v1, Lxn0;->ζ:Lxn0;

    .line 43
    .line 44
    invoke-interface {p1, v1}, Lup;->θ(Ltp;)Lsp;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lfo0;

    .line 49
    .line 50
    if-eqz v1, :cond_14

    .line 51
    .line 52
    iget-object p1, p0, Lhl1;->μ:Lkl1;

    .line 53
    .line 54
    iget-object v4, p1, Lkl1;->γ:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter v4

    .line 57
    :try_start_1
    iget-object v5, p1, Lkl1;->ε:Ljava/lang/Throwable;

    .line 58
    .line 59
    if-nez v5, :cond_13

    .line 60
    .line 61
    iget-object v5, p1, Lkl1;->φ:Lf02;

    .line 62
    .line 63
    invoke-virtual {v5}, Lf02;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lfl1;

    .line 68
    .line 69
    sget-object v6, Lfl1;->ζ:Lfl1;

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-lez v5, :cond_12

    .line 76
    .line 77
    iget-object v5, p1, Lkl1;->δ:Lfo0;

    .line 78
    .line 79
    if-nez v5, :cond_11

    .line 80
    .line 81
    iput-object v1, p1, Lkl1;->δ:Lfo0;

    .line 82
    .line 83
    invoke-virtual {p1}, Lkl1;->χ()Lyd;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    const-string p1, "called outside of runRecomposeAndApplyChanges"

    .line 90
    .line 91
    invoke-static {p1}, Lsn;->α(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_1
    move-exception p0

    .line 96
    goto/16 :goto_c

    .line 97
    .line 98
    :cond_2
    :goto_0
    monitor-exit v4

    .line 99
    iget-object p1, p0, Lhl1;->μ:Lkl1;

    .line 100
    .line 101
    new-instance v4, Lcc;

    .line 102
    .line 103
    const/4 v5, 0x7

    .line 104
    invoke-direct {v4, v5, p1}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p1, Lax1;->α:Leu1;

    .line 108
    .line 109
    invoke-static {p1}, Lax1;->ε(La80;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object p1, Lax1;->γ:Ljava/lang/Object;

    .line 113
    .line 114
    monitor-enter p1

    .line 115
    :try_start_2
    sget-object v5, Lax1;->θ:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v4, v5}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    sput-object v5, Lax1;->θ:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 124
    .line 125
    monitor-exit p1

    .line 126
    new-instance p1, Lhi0;

    .line 127
    .line 128
    invoke-direct {p1, v4}, Lhi0;-><init>(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object v4, Lkl1;->Α:Lf02;

    .line 132
    .line 133
    iget-object v4, p0, Lhl1;->μ:Lkl1;

    .line 134
    .line 135
    iget-object v4, v4, Lkl1;->ω:Lrk0;

    .line 136
    .line 137
    :cond_3
    sget-object v5, Lkl1;->Α:Lf02;

    .line 138
    .line 139
    invoke-virtual {v5}, Lf02;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Loa1;

    .line 144
    .line 145
    sget-object v7, Lx;->Π:Lx;

    .line 146
    .line 147
    iget-object v8, v6, Loa1;->η:Lga1;

    .line 148
    .line 149
    invoke-virtual {v8, v4}, Lga1;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v9, :cond_4

    .line 154
    .line 155
    move-object v8, v6

    .line 156
    goto :goto_1

    .line 157
    :cond_4
    invoke-virtual {v6}, Lμ;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_5

    .line 162
    .line 163
    new-instance v9, Lis0;

    .line 164
    .line 165
    invoke-direct {v9, v7, v7}, Lis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v4, v9}, Lga1;->α(Ljava/lang/Object;Lis0;)Lga1;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    new-instance v8, Loa1;

    .line 173
    .line 174
    invoke-direct {v8, v4, v4, v7}, Loa1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lga1;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    iget-object v9, v6, Loa1;->ζ:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {v8, v9}, Lga1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    check-cast v10, Lis0;

    .line 188
    .line 189
    new-instance v11, Lis0;

    .line 190
    .line 191
    iget-object v10, v10, Lis0;->α:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-direct {v11, v10, v4}, Lis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8, v9, v11}, Lga1;->α(Ljava/lang/Object;Lis0;)Lga1;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    new-instance v10, Lis0;

    .line 201
    .line 202
    invoke-direct {v10, v9, v7}, Lis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8, v4, v10}, Lga1;->α(Ljava/lang/Object;Lis0;)Lga1;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    new-instance v8, Loa1;

    .line 210
    .line 211
    iget-object v9, v6, Loa1;->ε:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-direct {v8, v9, v4, v7}, Loa1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lga1;)V

    .line 214
    .line 215
    .line 216
    :goto_1
    if-eq v6, v8, :cond_7

    .line 217
    .line 218
    sget-object v7, Lxb;->ο:Luy;

    .line 219
    .line 220
    if-nez v6, :cond_6

    .line 221
    .line 222
    move-object v6, v7

    .line 223
    :cond_6
    invoke-virtual {v5, v6, v8}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_3

    .line 228
    .line 229
    :cond_7
    :try_start_3
    iget-object v4, p0, Lhl1;->μ:Lkl1;

    .line 230
    .line 231
    iget-object v5, v4, Lkl1;->γ:Ljava/lang/Object;

    .line 232
    .line 233
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 234
    :try_start_4
    invoke-virtual {v4}, Lkl1;->Γ()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 238
    :try_start_5
    monitor-exit v5

    .line 239
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    const/4 v6, 0x0

    .line 244
    move v7, v6

    .line 245
    :goto_2
    if-ge v7, v5, :cond_b

    .line 246
    .line 247
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    check-cast v8, Lzn;

    .line 252
    .line 253
    iget-object v8, v8, Lzn;->κ:Low1;

    .line 254
    .line 255
    iget-object v8, v8, Low1;->η:[Ljava/lang/Object;

    .line 256
    .line 257
    array-length v9, v8

    .line 258
    move v10, v6

    .line 259
    :goto_3
    if-ge v10, v9, :cond_a

    .line 260
    .line 261
    aget-object v11, v8, v10

    .line 262
    .line 263
    instance-of v12, v11, Lbl1;

    .line 264
    .line 265
    if-eqz v12, :cond_8

    .line 266
    .line 267
    check-cast v11, Lbl1;

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_8
    move-object v11, v2

    .line 271
    :goto_4
    if-eqz v11, :cond_9

    .line 272
    .line 273
    iget-object v12, v11, Lbl1;->α:Lzn;

    .line 274
    .line 275
    if-eqz v12, :cond_9

    .line 276
    .line 277
    invoke-virtual {v12, v11, v2}, Lzn;->σ(Lbl1;Ljava/lang/Object;)Lsn0;

    .line 278
    .line 279
    .line 280
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :goto_5
    move-object v13, v0

    .line 287
    move-object v0, p1

    .line 288
    move-object p1, v13

    .line 289
    goto :goto_9

    .line 290
    :catchall_2
    move-exception v0

    .line 291
    goto :goto_5

    .line 292
    :cond_b
    new-instance v4, Lne;

    .line 293
    .line 294
    iget-object v5, p0, Lhl1;->ν:Ljl1;

    .line 295
    .line 296
    iget-object v6, p0, Lhl1;->ξ:Lk3;

    .line 297
    .line 298
    const/4 v7, 0x2

    .line 299
    invoke-direct {v4, v5, v6, v2, v7}, Lne;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 300
    .line 301
    .line 302
    iput-object v1, p0, Lhl1;->λ:Ljava/lang/Object;

    .line 303
    .line 304
    iput-object p1, p0, Lhl1;->ι:Lhi0;

    .line 305
    .line 306
    iput v3, p0, Lhl1;->κ:I

    .line 307
    .line 308
    invoke-static {v4, p0}, Lyh;->φ(Le80;Lop;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 312
    if-ne v3, v0, :cond_c

    .line 313
    .line 314
    return-object v0

    .line 315
    :cond_c
    move-object v0, p1

    .line 316
    :goto_6
    invoke-virtual {v0}, Lhi0;->β()V

    .line 317
    .line 318
    .line 319
    iget-object p1, p0, Lhl1;->μ:Lkl1;

    .line 320
    .line 321
    iget-object v0, p1, Lkl1;->γ:Ljava/lang/Object;

    .line 322
    .line 323
    monitor-enter v0

    .line 324
    :try_start_6
    iget-object v3, p1, Lkl1;->δ:Lfo0;

    .line 325
    .line 326
    if-ne v3, v1, :cond_d

    .line 327
    .line 328
    iput-object v2, p1, Lkl1;->δ:Lfo0;

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :catchall_3
    move-exception p0

    .line 332
    goto :goto_8

    .line 333
    :cond_d
    :goto_7
    invoke-virtual {p1}, Lkl1;->χ()Lyd;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    if-eqz p1, :cond_e

    .line 338
    .line 339
    const-string p1, "called outside of runRecomposeAndApplyChanges"

    .line 340
    .line 341
    invoke-static {p1}, Lsn;->α(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 342
    .line 343
    .line 344
    :cond_e
    monitor-exit v0

    .line 345
    sget-object p1, Lkl1;->Α:Lf02;

    .line 346
    .line 347
    iget-object p0, p0, Lhl1;->μ:Lkl1;

    .line 348
    .line 349
    iget-object p0, p0, Lkl1;->ω:Lrk0;

    .line 350
    .line 351
    invoke-static {p0}, Lrk0;->λ(Lrk0;)V

    .line 352
    .line 353
    .line 354
    sget-object p0, Ls62;->α:Ls62;

    .line 355
    .line 356
    return-object p0

    .line 357
    :goto_8
    monitor-exit v0

    .line 358
    throw p0

    .line 359
    :catchall_4
    move-exception v0

    .line 360
    :try_start_7
    monitor-exit v5

    .line 361
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 362
    :goto_9
    invoke-virtual {v0}, Lhi0;->β()V

    .line 363
    .line 364
    .line 365
    iget-object v0, p0, Lhl1;->μ:Lkl1;

    .line 366
    .line 367
    iget-object v3, v0, Lkl1;->γ:Ljava/lang/Object;

    .line 368
    .line 369
    monitor-enter v3

    .line 370
    :try_start_8
    iget-object v4, v0, Lkl1;->δ:Lfo0;

    .line 371
    .line 372
    if-ne v4, v1, :cond_f

    .line 373
    .line 374
    iput-object v2, v0, Lkl1;->δ:Lfo0;

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :catchall_5
    move-exception p0

    .line 378
    goto :goto_b

    .line 379
    :cond_f
    :goto_a
    invoke-virtual {v0}, Lkl1;->χ()Lyd;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    if-eqz v0, :cond_10

    .line 384
    .line 385
    const-string v0, "called outside of runRecomposeAndApplyChanges"

    .line 386
    .line 387
    invoke-static {v0}, Lsn;->α(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 388
    .line 389
    .line 390
    :cond_10
    monitor-exit v3

    .line 391
    sget-object v0, Lkl1;->Α:Lf02;

    .line 392
    .line 393
    iget-object p0, p0, Lhl1;->μ:Lkl1;

    .line 394
    .line 395
    iget-object p0, p0, Lkl1;->ω:Lrk0;

    .line 396
    .line 397
    invoke-static {p0}, Lrk0;->λ(Lrk0;)V

    .line 398
    .line 399
    .line 400
    throw p1

    .line 401
    :goto_b
    monitor-exit v3

    .line 402
    throw p0

    .line 403
    :catchall_6
    move-exception p0

    .line 404
    monitor-exit p1

    .line 405
    throw p0

    .line 406
    :cond_11
    :try_start_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 407
    .line 408
    const-string p1, "Recomposer already running"

    .line 409
    .line 410
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    throw p0

    .line 414
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 415
    .line 416
    const-string p1, "Recomposer shut down"

    .line 417
    .line 418
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw p0

    .line 422
    :cond_13
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 423
    :goto_c
    monitor-exit v4

    .line 424
    throw p0

    .line 425
    :cond_14
    const-string p0, "Current context doesn\'t contain Job in it: "

    .line 426
    .line 427
    invoke-static {p1, p0}, Lγ;->π(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-object v2
.end method
