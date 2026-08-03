.class public final synthetic Lae/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lae/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqe/n;)V
    .locals 0

    .line 1
    const/16 p1, 0x19

    .line 2
    .line 3
    iput p1, p0, Lae/e;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget v0, p0, Lae/e;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, Lmd/a;->H:Lmd/a;

    .line 5
    .line 6
    const/16 v3, 0x19

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    sget-object v7, Lmd/a;->u:Lmd/a;

    .line 12
    .line 13
    sget-object v8, Lmd/a;->s:Lmd/a;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Lud/r;

    .line 19
    .line 20
    invoke-virtual {p1}, Lud/r;->e0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast p1, Lud/e;

    .line 25
    .line 26
    invoke-virtual {p1}, Lud/e;->W()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast p1, Lwc/a;

    .line 31
    .line 32
    iget-object v0, p1, Lwc/a;->a:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const-string v1, "dex-input."

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v1, p1, Lwc/a;->b:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p1, Lwc/a;->c:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object p1, p1, Lwc/a;->e:Lme/a;

    .line 61
    .line 62
    invoke-interface {v1, p1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-string p1, "Plugin option values is null, option: "

    .line 80
    .line 81
    const-string v1, ", plugin: dex-input"

    .line 82
    .line 83
    invoke-static {p1, v0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const-string p1, "Plugin option description not set, plugin: dex-input"

    .line 92
    .line 93
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const-string p1, "Plugin option name should start with plugin id: \'dex-input.\', option: "

    .line 98
    .line 99
    invoke-static {p1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    return-void

    .line 107
    :pswitch_2
    check-cast p1, Lqe/y;

    .line 108
    .line 109
    iget-object v0, p1, Lqe/y;->h:Lqd/l;

    .line 110
    .line 111
    iget-object p1, p1, Lqe/y;->i:Lqd/j;

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lqd/l;->W(Lqd/j;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_3
    check-cast p1, Lqd/s;

    .line 118
    .line 119
    iget-object v0, p1, Lqd/s;->k:Ljava/util/ArrayList;

    .line 120
    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 124
    .line 125
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lpd/q;

    .line 140
    .line 141
    iget-object v2, p1, Lqd/s;->l:Lp4/t;

    .line 142
    .line 143
    iget-object v2, v2, Lp4/t;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 146
    .line 147
    iget-object v3, v1, Lud/p;->l:Lqd/r;

    .line 148
    .line 149
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 150
    .line 151
    iget-object v3, v3, Lqd/s;->l:Lp4/t;

    .line 152
    .line 153
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 156
    .line 157
    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 158
    .line 159
    .line 160
    iget-object v1, v1, Lud/p;->m:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_4

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lqd/l;

    .line 177
    .line 178
    check-cast v3, Lqd/r;

    .line 179
    .line 180
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 181
    .line 182
    iget-object v3, v3, Lqd/s;->l:Lp4/t;

    .line 183
    .line 184
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 187
    .line 188
    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_5
    return-void

    .line 193
    :pswitch_4
    check-cast p1, Lqd/r;

    .line 194
    .line 195
    invoke-static {p1}, Lbe/b;->M(Lqd/r;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_5
    check-cast p1, Ljava/util/Map;

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    new-instance v0, Lce/n;

    .line 206
    .line 207
    const/16 v1, 0x13

    .line 208
    .line 209
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p1, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_6
    check-cast p1, Lud/a;

    .line 217
    .line 218
    sget-object v0, Lmd/a;->z:Lmd/a;

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_7
    check-cast p1, Lmd/i;

    .line 225
    .line 226
    check-cast p1, Lmd/e;

    .line 227
    .line 228
    invoke-virtual {p1, v7}, Lmd/e;->w(Lmd/a;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_8
    check-cast p1, Lff/e;

    .line 233
    .line 234
    sget-object v0, Lff/a;->c:Lmh/b;

    .line 235
    .line 236
    const-string v1, "Loading dex: {}"

    .line 237
    .line 238
    invoke-interface {v0, p1, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_9
    check-cast p1, Lud/r;

    .line 243
    .line 244
    invoke-virtual {p1, v8}, Lmd/e;->D(Lmd/a;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_a
    check-cast p1, Lud/r;

    .line 249
    .line 250
    sget-object v0, Lmd/a;->e0:Lmd/a;

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_b
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONObject;->f(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :pswitch_c
    check-cast p1, Lud/a;

    .line 261
    .line 262
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-static {p1}, Lbe/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_d
    check-cast p1, Lud/a;

    .line 269
    .line 270
    invoke-static {p1}, La/a;->c0(Lud/h;)Lud/p;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    instance-of v1, v0, Lpd/t;

    .line 275
    .line 276
    if-eqz v1, :cond_6

    .line 277
    .line 278
    check-cast v0, Lpd/t;

    .line 279
    .line 280
    invoke-virtual {v0, p1}, Lpd/t;->i0(Lud/a;)V

    .line 281
    .line 282
    .line 283
    :cond_6
    return-void

    .line 284
    :pswitch_e
    check-cast p1, Lud/a;

    .line 285
    .line 286
    invoke-static {p1}, Lce/m;->l(Lud/a;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_f
    check-cast p1, Lud/a;

    .line 291
    .line 292
    iget-object v0, p1, Lud/a;->n:Ljava/util/List;

    .line 293
    .line 294
    new-instance v1, Lce/k;

    .line 295
    .line 296
    invoke-direct {v1, p1, v6}, Lce/k;-><init>(Lud/a;I)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_10
    check-cast p1, Lud/a;

    .line 304
    .line 305
    sget-object v0, Lmd/b;->z:Lmd/b;

    .line 306
    .line 307
    invoke-virtual {p1, v0}, Lmd/e;->E(Loc/a;)V

    .line 308
    .line 309
    .line 310
    sget-object v0, Lmd/a;->k:Lmd/a;

    .line 311
    .line 312
    invoke-virtual {p1, v0}, Lmd/e;->D(Lmd/a;)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Lmd/a;->l:Lmd/a;

    .line 316
    .line 317
    invoke-virtual {p1, v0}, Lmd/e;->D(Lmd/a;)V

    .line 318
    .line 319
    .line 320
    iput-object v4, p1, Lud/a;->p:Ljava/util/BitSet;

    .line 321
    .line 322
    iput-object v4, p1, Lud/a;->s:Lud/a;

    .line 323
    .line 324
    iput-object v4, p1, Lud/a;->r:Ljava/util/BitSet;

    .line 325
    .line 326
    iget-object p1, p1, Lud/a;->u:Ljava/util/List;

    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :pswitch_11
    check-cast p1, Lae/h;

    .line 333
    .line 334
    iget-object p1, p1, Lae/h;->i:Ljava/util/List;

    .line 335
    .line 336
    new-instance v0, La7/b;

    .line 337
    .line 338
    invoke-direct {v0, v3}, La7/b;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-interface {p1, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_12
    check-cast p1, Lud/a;

    .line 346
    .line 347
    invoke-virtual {p1}, Lud/a;->H()V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_13
    check-cast p1, Lbsh/classpath/BshClassPath;

    .line 352
    .line 353
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->b(Lbsh/classpath/BshClassPath;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :pswitch_14
    check-cast p1, Ljava/nio/file/Path;

    .line 358
    .line 359
    :try_start_0
    invoke-static {p1}, Ljava/nio/file/Files;->delete(Ljava/nio/file/Path;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 360
    .line 361
    .line 362
    goto :goto_2

    .line 363
    :catch_0
    move-exception v0

    .line 364
    sget-object v1, Lbf/b;->a:Lmh/b;

    .line 365
    .line 366
    const-string v2, "Failed to delete file {}"

    .line 367
    .line 368
    invoke-interface {p1}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-interface {v1, p1, v2, v0}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :goto_2
    return-void

    .line 376
    :pswitch_15
    check-cast p1, Lud/e;

    .line 377
    .line 378
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 379
    .line 380
    sget-object v1, Lmd/b;->h:Lmd/b;

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, Lnd/a;

    .line 387
    .line 388
    iget-object v0, v0, Lnd/a;->g:Lud/e;

    .line 389
    .line 390
    iget-object v3, p1, Lud/e;->z:Ljava/util/List;

    .line 391
    .line 392
    invoke-virtual {v0}, Lud/e;->a0()Lud/e;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-static {v3, v4}, Lbe/h;->Y(Ljava/util/List;Lnd/b0;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    iput-object v3, p1, Lud/e;->z:Ljava/util/List;

    .line 401
    .line 402
    iget-object v3, v0, Lud/e;->B:Ljava/util/List;

    .line 403
    .line 404
    invoke-static {v3, p1}, Lbe/h;->Y(Ljava/util/List;Lnd/b0;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    iput-object v3, v0, Lud/e;->B:Ljava/util/List;

    .line 409
    .line 410
    invoke-virtual {p1, v1}, Lmd/e;->E(Loc/a;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p1, v8}, Lmd/e;->D(Lmd/a;)V

    .line 414
    .line 415
    .line 416
    iget-object v0, p1, Lud/e;->t:Ljava/util/List;

    .line 417
    .line 418
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v1, :cond_8

    .line 427
    .line 428
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, Lud/r;

    .line 433
    .line 434
    invoke-virtual {v1}, Lud/r;->W()Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-eqz v3, :cond_7

    .line 439
    .line 440
    invoke-virtual {v1, v2}, Lmd/e;->D(Lmd/a;)V

    .line 441
    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_8
    const-string v0, "Anonymous mark cleared"

    .line 445
    .line 446
    invoke-virtual {p1, v0}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_16
    check-cast p1, Lud/e;

    .line 451
    .line 452
    :try_start_1
    invoke-static {p1}, Lbe/h0;->k(Lud/e;)V
    :try_end_1
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 453
    .line 454
    .line 455
    goto :goto_5

    .line 456
    :catch_1
    move-exception v0

    .line 457
    goto :goto_4

    .line 458
    :catch_2
    move-exception v0

    .line 459
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    const-string v1, "Anonymous visitor error"

    .line 463
    .line 464
    invoke-static {p1, v1, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    :goto_5
    return-void

    .line 468
    :pswitch_17
    check-cast p1, Lud/p;

    .line 469
    .line 470
    iget-object v0, p1, Lud/p;->k:Lpd/k;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_a

    .line 477
    .line 478
    if-eq v0, v1, :cond_a

    .line 479
    .line 480
    const/16 v1, 0x8

    .line 481
    .line 482
    if-eq v0, v1, :cond_a

    .line 483
    .line 484
    const/16 v1, 0xf

    .line 485
    .line 486
    if-eq v0, v1, :cond_a

    .line 487
    .line 488
    if-eq v0, v3, :cond_a

    .line 489
    .line 490
    const/16 v1, 0x1b

    .line 491
    .line 492
    if-eq v0, v1, :cond_a

    .line 493
    .line 494
    iget-object p1, p1, Lud/p;->m:Ljava/util/List;

    .line 495
    .line 496
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    :cond_9
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-eqz v0, :cond_a

    .line 505
    .line 506
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Lqd/l;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    instance-of v1, v0, Lqd/n;

    .line 516
    .line 517
    if-eqz v1, :cond_9

    .line 518
    .line 519
    invoke-virtual {v0}, Lqd/l;->I()Lqd/j;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 524
    .line 525
    if-eq v1, v2, :cond_9

    .line 526
    .line 527
    sget-object v1, Lmd/a;->W:Lmd/a;

    .line 528
    .line 529
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 530
    .line 531
    .line 532
    goto :goto_6

    .line 533
    :cond_a
    return-void

    .line 534
    :pswitch_18
    check-cast p1, Lqd/l;

    .line 535
    .line 536
    sget-object v0, Lmd/a;->q:Lmd/a;

    .line 537
    .line 538
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 539
    .line 540
    .line 541
    instance-of v0, p1, Lqd/r;

    .line 542
    .line 543
    if-eqz v0, :cond_b

    .line 544
    .line 545
    check-cast p1, Lqd/r;

    .line 546
    .line 547
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 548
    .line 549
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    iput-boolean v5, p1, Lqd/k;->d:Z

    .line 554
    .line 555
    :cond_b
    return-void

    .line 556
    :pswitch_19
    check-cast p1, Lqd/l;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    instance-of v0, p1, Lqd/r;

    .line 562
    .line 563
    if-eqz v0, :cond_c

    .line 564
    .line 565
    check-cast p1, Lqd/r;

    .line 566
    .line 567
    iget-object v0, p1, Lqd/r;->m:Lqd/s;

    .line 568
    .line 569
    if-eqz v0, :cond_c

    .line 570
    .line 571
    invoke-virtual {v0, p1}, Lqd/s;->k(Lqd/r;)V

    .line 572
    .line 573
    .line 574
    iput-object v4, p1, Lqd/r;->m:Lqd/s;

    .line 575
    .line 576
    :cond_c
    return-void

    .line 577
    :pswitch_1a
    check-cast p1, Lud/r;

    .line 578
    .line 579
    invoke-virtual {p1}, Lud/r;->S()Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_d

    .line 588
    .line 589
    goto/16 :goto_9

    .line 590
    .line 591
    :cond_d
    iget-object v0, p1, Lud/r;->m:Lb5/k;

    .line 592
    .line 593
    invoke-virtual {p1}, Lud/r;->W()Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-eqz v1, :cond_e

    .line 598
    .line 599
    invoke-virtual {v0}, Lb5/k;->g()Z

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-eqz v1, :cond_e

    .line 604
    .line 605
    move v1, v5

    .line 606
    goto :goto_7

    .line 607
    :cond_e
    move v1, v6

    .line 608
    :goto_7
    iget-object v2, p1, Lud/r;->k:Lod/d;

    .line 609
    .line 610
    invoke-virtual {v2}, Lod/d;->e()Z

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    if-eqz v2, :cond_f

    .line 615
    .line 616
    invoke-virtual {v0}, Lb5/k;->h()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-eqz v0, :cond_f

    .line 621
    .line 622
    goto :goto_8

    .line 623
    :cond_f
    move v5, v6

    .line 624
    :goto_8
    if-nez v1, :cond_10

    .line 625
    .line 626
    if-eqz v5, :cond_15

    .line 627
    .line 628
    :cond_10
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 629
    .line 630
    invoke-static {v0}, La/a;->l0(Ljava/util/List;)Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-nez v0, :cond_11

    .line 635
    .line 636
    goto :goto_9

    .line 637
    :cond_11
    if-eqz v5, :cond_12

    .line 638
    .line 639
    invoke-virtual {p1, v8}, Lmd/e;->w(Lmd/a;)V

    .line 640
    .line 641
    .line 642
    goto :goto_9

    .line 643
    :cond_12
    invoke-virtual {p1}, Lud/r;->X()Z

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    if-eqz v0, :cond_15

    .line 648
    .line 649
    iget-object v0, p1, Lud/r;->l:Lud/e;

    .line 650
    .line 651
    iget-object v0, v0, Lud/e;->t:Ljava/util/List;

    .line 652
    .line 653
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    if-eqz v1, :cond_14

    .line 662
    .line 663
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    check-cast v1, Lud/r;

    .line 668
    .line 669
    if-eq v1, p1, :cond_13

    .line 670
    .line 671
    invoke-virtual {v1}, Lud/r;->W()Z

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    if-eqz v2, :cond_13

    .line 676
    .line 677
    invoke-virtual {v1}, Lud/r;->X()Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    if-nez v1, :cond_13

    .line 682
    .line 683
    goto :goto_9

    .line 684
    :cond_14
    sget-object v0, Loc/c;->a:Loc/c;

    .line 685
    .line 686
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 687
    .line 688
    invoke-virtual {v1, v0}, Lmd/f;->b(Loc/a;)Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-nez v0, :cond_15

    .line 693
    .line 694
    invoke-virtual {p1, v8}, Lmd/e;->w(Lmd/a;)V

    .line 695
    .line 696
    .line 697
    :cond_15
    :goto_9
    return-void

    .line 698
    :pswitch_1b
    check-cast p1, Lud/r;

    .line 699
    .line 700
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 701
    .line 702
    iget-object v3, p1, Lud/r;->l:Lud/e;

    .line 703
    .line 704
    if-nez v0, :cond_30

    .line 705
    .line 706
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 707
    .line 708
    invoke-virtual {v0, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    if-eqz v0, :cond_16

    .line 713
    .line 714
    goto/16 :goto_10

    .line 715
    .line 716
    :cond_16
    iget-object v0, p1, Lud/r;->m:Lb5/k;

    .line 717
    .line 718
    invoke-virtual {v0}, Lb5/k;->i()Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    if-nez v0, :cond_17

    .line 723
    .line 724
    goto/16 :goto_10

    .line 725
    .line 726
    :cond_17
    iget-object v0, v3, Lud/e;->k:Lud/u;

    .line 727
    .line 728
    iget-object v4, v0, Lud/u;->a:Lbc/g;

    .line 729
    .line 730
    iget-boolean v4, v4, Lbc/g;->t:Z

    .line 731
    .line 732
    if-eqz v4, :cond_24

    .line 733
    .line 734
    iget-object v4, p1, Lud/r;->z:Ljava/util/List;

    .line 735
    .line 736
    new-instance v9, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 739
    .line 740
    .line 741
    new-instance v10, Lbe/m0;

    .line 742
    .line 743
    const/4 v11, 0x6

    .line 744
    invoke-direct {v10, v11, v9}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v4, v10}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-ne v4, v5, :cond_24

    .line 755
    .line 756
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    check-cast v4, Lud/p;

    .line 761
    .line 762
    iget-object v9, v4, Lud/p;->k:Lpd/k;

    .line 763
    .line 764
    sget-object v10, Lpd/k;->p:Lpd/k;

    .line 765
    .line 766
    if-ne v9, v10, :cond_18

    .line 767
    .line 768
    invoke-virtual {v4, v6}, Lud/p;->S(I)Lqd/l;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    instance-of v10, v9, Lqd/m;

    .line 776
    .line 777
    if-eqz v10, :cond_18

    .line 778
    .line 779
    check-cast v9, Lqd/m;

    .line 780
    .line 781
    iget-object v4, v9, Lqd/m;->l:Lud/p;

    .line 782
    .line 783
    :cond_18
    iget-object v9, v4, Lud/p;->k:Lpd/k;

    .line 784
    .line 785
    sget-object v10, Lpd/k;->O:Lpd/k;

    .line 786
    .line 787
    if-eq v9, v10, :cond_19

    .line 788
    .line 789
    goto/16 :goto_b

    .line 790
    .line 791
    :cond_19
    move-object v9, v4

    .line 792
    check-cast v9, Lpd/n;

    .line 793
    .line 794
    iget v10, v9, Lpd/n;->o:I

    .line 795
    .line 796
    const/4 v11, 0x5

    .line 797
    if-ne v10, v11, :cond_1a

    .line 798
    .line 799
    goto/16 :goto_b

    .line 800
    .line 801
    :cond_1a
    iget-object v9, v9, Lpd/n;->p:Lod/d;

    .line 802
    .line 803
    iget-object v10, p1, Lud/r;->k:Lod/d;

    .line 804
    .line 805
    invoke-virtual {v0, v9}, Lud/u;->i(Lod/d;)Lud/r;

    .line 806
    .line 807
    .line 808
    move-result-object v11

    .line 809
    if-nez v11, :cond_1b

    .line 810
    .line 811
    goto/16 :goto_b

    .line 812
    .line 813
    :cond_1b
    iget-object v12, v11, Lud/r;->m:Lb5/k;

    .line 814
    .line 815
    invoke-virtual {v12}, Lb5/k;->h()Z

    .line 816
    .line 817
    .line 818
    move-result v13

    .line 819
    if-eqz v13, :cond_1c

    .line 820
    .line 821
    goto/16 :goto_b

    .line 822
    .line 823
    :cond_1c
    iget-object v9, v9, Lod/d;->i:Ljava/util/List;

    .line 824
    .line 825
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 826
    .line 827
    .line 828
    move-result v9

    .line 829
    iget-object v13, v10, Lod/d;->i:Ljava/util/List;

    .line 830
    .line 831
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 832
    .line 833
    .line 834
    move-result v13

    .line 835
    if-eq v9, v13, :cond_1d

    .line 836
    .line 837
    goto/16 :goto_b

    .line 838
    .line 839
    :cond_1d
    iget-object v9, v11, Lud/r;->l:Lud/e;

    .line 840
    .line 841
    invoke-virtual {v3, v9}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v9

    .line 845
    if-nez v9, :cond_1e

    .line 846
    .line 847
    goto/16 :goto_b

    .line 848
    .line 849
    :cond_1e
    iget-object v4, v4, Lud/p;->m:Ljava/util/List;

    .line 850
    .line 851
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    :cond_1f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 856
    .line 857
    .line 858
    move-result v9

    .line 859
    if-eqz v9, :cond_20

    .line 860
    .line 861
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v9

    .line 865
    check-cast v9, Lqd/l;

    .line 866
    .line 867
    invoke-static {v9}, Lbe/b;->T(Lqd/l;)Z

    .line 868
    .line 869
    .line 870
    move-result v9

    .line 871
    if-nez v9, :cond_1f

    .line 872
    .line 873
    goto :goto_b

    .line 874
    :cond_20
    invoke-virtual {v12}, Lb5/k;->g()Z

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    if-nez v1, :cond_21

    .line 879
    .line 880
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    invoke-static {v11, v5}, Lbe/e;->i(Lnd/b0;I)V

    .line 886
    .line 887
    .line 888
    :cond_21
    iget-object v0, v10, Lod/d;->n:Ljava/lang/String;

    .line 889
    .line 890
    iget-object v1, v11, Lud/r;->k:Lod/d;

    .line 891
    .line 892
    iget-object v1, v1, Lod/d;->n:Ljava/lang/String;

    .line 893
    .line 894
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    if-nez v1, :cond_23

    .line 899
    .line 900
    invoke-virtual {v11, v0}, Lud/r;->d0(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    sget-object v0, Lmd/b;->b:Lmd/b;

    .line 904
    .line 905
    iget-object v1, v11, Lmd/e;->g:Lmd/f;

    .line 906
    .line 907
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    check-cast v0, Lnd/f0;

    .line 912
    .line 913
    if-eqz v0, :cond_22

    .line 914
    .line 915
    goto :goto_a

    .line 916
    :cond_22
    new-instance v0, Lnd/f0;

    .line 917
    .line 918
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 919
    .line 920
    .line 921
    const-string v1, ""

    .line 922
    .line 923
    iput-object v1, v0, Lnd/f0;->g:Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v11, v0}, Lmd/e;->y(Loc/b;)V

    .line 926
    .line 927
    .line 928
    :goto_a
    const-string v1, "merged with bridge method [inline-methods]"

    .line 929
    .line 930
    invoke-virtual {v0, v1}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    :cond_23
    new-instance v0, Lnd/y;

    .line 934
    .line 935
    invoke-direct {v0, p1}, Lnd/y;-><init>(Lud/r;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v11, v0}, Lmd/e;->y(Loc/b;)V

    .line 939
    .line 940
    .line 941
    sget-object v0, Lmd/b;->r:Lmd/b;

    .line 942
    .line 943
    invoke-virtual {v11, p1, v0}, Lmd/e;->A(Lnd/r;Lmd/b;)V

    .line 944
    .line 945
    .line 946
    iget-object v0, v10, Lod/d;->k:Ljava/lang/String;

    .line 947
    .line 948
    new-instance v1, Ljava/lang/StringBuilder;

    .line 949
    .line 950
    const-string v2, "Method merged with bridge method: "

    .line 951
    .line 952
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    invoke-virtual {v11, v0}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {p1, v8}, Lmd/e;->w(Lmd/a;)V

    .line 966
    .line 967
    .line 968
    goto/16 :goto_10

    .line 969
    .line 970
    :cond_24
    :goto_b
    invoke-virtual {p1}, Lud/r;->W()Z

    .line 971
    .line 972
    .line 973
    move-result v4

    .line 974
    if-eqz v4, :cond_30

    .line 975
    .line 976
    sget-object v4, Lmd/a;->c0:Lmd/a;

    .line 977
    .line 978
    iget-object v9, p1, Lmd/e;->g:Lmd/f;

    .line 979
    .line 980
    invoke-virtual {v9, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 981
    .line 982
    .line 983
    move-result v4

    .line 984
    if-nez v4, :cond_25

    .line 985
    .line 986
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 987
    .line 988
    invoke-virtual {v4, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    if-eqz v2, :cond_30

    .line 993
    .line 994
    :cond_25
    invoke-static {p1}, La/a;->f0(Lud/r;)Lud/p;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    if-eqz v2, :cond_30

    .line 999
    .line 1000
    invoke-virtual {p1}, Lud/r;->S()Ljava/util/List;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v4

    .line 1004
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v9

    .line 1008
    move v10, v6

    .line 1009
    :cond_26
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v11

    .line 1013
    if-eqz v11, :cond_2a

    .line 1014
    .line 1015
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v11

    .line 1019
    check-cast v11, Lqd/r;

    .line 1020
    .line 1021
    invoke-virtual {v11}, Lqd/r;->I()Lqd/j;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v12

    .line 1025
    invoke-virtual {v12}, Lqd/j;->v()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v13

    .line 1029
    if-nez v13, :cond_27

    .line 1030
    .line 1031
    goto :goto_c

    .line 1032
    :cond_27
    invoke-virtual {v0, v12}, Lud/u;->g(Lqd/j;)Lud/e;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v13

    .line 1036
    if-nez v13, :cond_28

    .line 1037
    .line 1038
    invoke-static {v0, v12}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v12

    .line 1042
    iget-object v13, v12, Lod/a;->k:Lod/a;

    .line 1043
    .line 1044
    if-eqz v13, :cond_26

    .line 1045
    .line 1046
    iget-object v13, v3, Lud/e;->m:Lod/a;

    .line 1047
    .line 1048
    invoke-virtual {v13}, Lod/a;->f()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v13

    .line 1052
    iget-object v12, v12, Lod/a;->k:Lod/a;

    .line 1053
    .line 1054
    iget-object v12, v12, Lod/a;->j:Ljava/lang/String;

    .line 1055
    .line 1056
    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v12

    .line 1060
    if-eqz v12, :cond_26

    .line 1061
    .line 1062
    goto :goto_d

    .line 1063
    :cond_28
    iget-object v12, v13, Lmd/e;->g:Lmd/f;

    .line 1064
    .line 1065
    invoke-virtual {v12, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v12

    .line 1069
    if-nez v12, :cond_29

    .line 1070
    .line 1071
    invoke-static {v13}, Lbe/b;->L(Lud/e;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v12

    .line 1075
    if-eqz v12, :cond_26

    .line 1076
    .line 1077
    :cond_29
    :goto_d
    invoke-virtual {v11, v7}, Lmd/e;->w(Lmd/a;)V

    .line 1078
    .line 1079
    .line 1080
    move v10, v5

    .line 1081
    goto :goto_c

    .line 1082
    :cond_2a
    if-eqz v10, :cond_30

    .line 1083
    .line 1084
    iget-object v5, v2, Lud/p;->k:Lpd/k;

    .line 1085
    .line 1086
    sget-object v7, Lpd/k;->S:Lpd/k;

    .line 1087
    .line 1088
    if-ne v5, v7, :cond_30

    .line 1089
    .line 1090
    check-cast v2, Ltd/a;

    .line 1091
    .line 1092
    iget v5, v2, Ltd/a;->p:I

    .line 1093
    .line 1094
    if-ne v5, v1, :cond_30

    .line 1095
    .line 1096
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1097
    .line 1098
    .line 1099
    move-result v1

    .line 1100
    if-nez v1, :cond_30

    .line 1101
    .line 1102
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    check-cast v1, Lqd/r;

    .line 1107
    .line 1108
    invoke-virtual {v1}, Lqd/r;->I()Lqd/j;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    iget-object v3, v3, Lud/e;->x:Lud/e;

    .line 1113
    .line 1114
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 1115
    .line 1116
    iget-object v3, v3, Lod/a;->g:Lqd/j;

    .line 1117
    .line 1118
    invoke-virtual {v1, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v1

    .line 1122
    if-eqz v1, :cond_2b

    .line 1123
    .line 1124
    invoke-static {p1, v6}, Lnd/g0;->b(Lud/r;I)V

    .line 1125
    .line 1126
    .line 1127
    :cond_2b
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1128
    .line 1129
    .line 1130
    move-result v1

    .line 1131
    :goto_e
    if-ge v6, v1, :cond_2d

    .line 1132
    .line 1133
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v3

    .line 1137
    check-cast v3, Lqd/r;

    .line 1138
    .line 1139
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 1140
    .line 1141
    if-eqz v3, :cond_2c

    .line 1142
    .line 1143
    iget-object v3, v3, Lqd/s;->j:Ljava/util/ArrayList;

    .line 1144
    .line 1145
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1146
    .line 1147
    .line 1148
    move-result v3

    .line 1149
    if-nez v3, :cond_2c

    .line 1150
    .line 1151
    invoke-static {p1, v6}, Lnd/g0;->b(Lud/r;I)V

    .line 1152
    .line 1153
    .line 1154
    :cond_2c
    add-int/lit8 v6, v6, 0x1

    .line 1155
    .line 1156
    goto :goto_e

    .line 1157
    :cond_2d
    iget-object v1, v2, Ltd/a;->o:Lod/d;

    .line 1158
    .line 1159
    invoke-virtual {v0, v1}, Lud/u;->i(Lod/d;)Lud/r;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    if-eqz v0, :cond_30

    .line 1164
    .line 1165
    new-instance v1, Lnd/y;

    .line 1166
    .line 1167
    invoke-direct {v1, v0}, Lnd/y;-><init>(Lud/r;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {p1, v1}, Lmd/e;->y(Loc/b;)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {p1, v8}, Lmd/e;->w(Lmd/a;)V

    .line 1174
    .line 1175
    .line 1176
    sget-object v1, Lre/c;->g:Lmh/b;

    .line 1177
    .line 1178
    iget-object v1, v0, Lud/r;->H:Ljava/util/List;

    .line 1179
    .line 1180
    iget-object v2, p1, Lud/r;->H:Ljava/util/List;

    .line 1181
    .line 1182
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    if-eqz v3, :cond_2e

    .line 1187
    .line 1188
    move-object v1, v2

    .line 1189
    goto :goto_f

    .line 1190
    :cond_2e
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    if-eqz v3, :cond_2f

    .line 1195
    .line 1196
    goto :goto_f

    .line 1197
    :cond_2f
    new-instance v3, Ljava/util/TreeSet;

    .line 1198
    .line 1199
    invoke-direct {v3, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v3, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    .line 1203
    .line 1204
    .line 1205
    new-instance v1, Ljava/util/ArrayList;

    .line 1206
    .line 1207
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1208
    .line 1209
    .line 1210
    :goto_f
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    iput-object v1, v0, Lud/r;->H:Ljava/util/List;

    .line 1214
    .line 1215
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1216
    .line 1217
    iput-object v0, p1, Lud/r;->H:Ljava/util/List;

    .line 1218
    .line 1219
    :cond_30
    :goto_10
    return-void

    .line 1220
    :pswitch_1c
    check-cast p1, Lud/a;

    .line 1221
    .line 1222
    invoke-virtual {p1, v7}, Lmd/e;->w(Lmd/a;)V

    .line 1223
    .line 1224
    .line 1225
    return-void

    .line 1226
    nop

    .line 1227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
