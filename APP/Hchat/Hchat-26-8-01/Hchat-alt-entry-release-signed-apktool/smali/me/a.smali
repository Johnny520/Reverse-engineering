.class public final synthetic Lme/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lme/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqe/c;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    .line 2
    .line 3
    iput p1, p0, Lme/a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lme/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lxe/p;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    check-cast p1, Lxe/p;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1

    .line 16
    :pswitch_1
    check-cast p1, Lqd/r;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, " from "

    .line 29
    .line 30
    invoke-static {v0, v1, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    check-cast p1, Lud/a;

    .line 36
    .line 37
    iget-object p1, p1, Lud/a;->o:Ljava/util/List;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_3
    sget-object v0, Lxd/d;->m:Luf/d;

    .line 41
    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    const-string p1, "default"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    return-object p1

    .line 52
    :pswitch_4
    check-cast p1, Lxd/c;

    .line 53
    .line 54
    iget-object p1, p1, Lxd/c;->b:Lud/j;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_5
    check-cast p1, Lud/j;

    .line 58
    .line 59
    invoke-interface {p1}, Lud/j;->k()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "yes"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    const-string v1, "true"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_1
    const-string v1, "no"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    const-string v1, "false"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const-string v0, "Unknown value \'"

    .line 111
    .line 112
    const-string v1, "\' for option \'dex-input.verify-checksum\', expect: \'yes\' or \'no\'"

    .line 113
    .line 114
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    goto :goto_4

    .line 123
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    :goto_2
    const/4 p1, 0x1

    .line 126
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_4
    return-object p1

    .line 131
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    const-string p1, "yes"

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    const-string p1, "no"

    .line 143
    .line 144
    :goto_5
    return-object p1

    .line 145
    :pswitch_8
    if-nez p1, :cond_6

    .line 146
    .line 147
    new-instance p1, Lgc/a;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_6
    invoke-static {}, Lah/a;->d()V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    :goto_6
    return-object p1

    .line 158
    :pswitch_9
    if-nez p1, :cond_7

    .line 159
    .line 160
    new-instance p1, Lgc/b;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_7
    invoke-static {}, Lah/a;->d()V

    .line 167
    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    :goto_7
    return-object p1

    .line 171
    :pswitch_a
    check-cast p1, Lud/e;

    .line 172
    .line 173
    invoke-virtual {p1}, Lud/e;->Z()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :pswitch_b
    check-cast p1, Lud/e;

    .line 179
    .line 180
    iget-object p1, p1, Lud/e;->t:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    :pswitch_c
    check-cast p1, Lud/e;

    .line 188
    .line 189
    iget-object p1, p1, Lud/e;->s:Ljava/lang/String;

    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_d
    check-cast p1, Lud/e;

    .line 193
    .line 194
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    return-object p1

    .line 204
    :pswitch_f
    check-cast p1, Lte/b;

    .line 205
    .line 206
    iget-object p1, p1, Lte/b;->i:La2/a;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const-string p1, "dex-input"

    .line 212
    .line 213
    return-object p1

    .line 214
    :pswitch_10
    new-instance p1, Ljava/util/HashSet;

    .line 215
    .line 216
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_11
    check-cast p1, Lqe/a;

    .line 221
    .line 222
    iget-object p1, p1, Lqe/a;->b:Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :pswitch_12
    check-cast p1, Lud/r;

    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    :try_start_0
    new-instance v1, Lqe/r;

    .line 233
    .line 234
    invoke-direct {v1, p1}, Lqe/r;-><init>(Lud/r;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lqe/r;->d()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_8

    .line 242
    .line 243
    const-string v1, "Multi-variable type inference failed"

    .line 244
    .line 245
    invoke-virtual {p1, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :catch_0
    move-exception v1

    .line 250
    goto :goto_9

    .line 251
    :cond_8
    :goto_8
    iget-object v1, p1, Lud/r;->D:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_a

    .line 262
    .line 263
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, Lqd/s;

    .line 268
    .line 269
    iget-object v2, v2, Lqd/s;->l:Lp4/t;

    .line 270
    .line 271
    iget-object v2, v2, Lp4/t;->h:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v2, Lqd/j;

    .line 274
    .line 275
    invoke-virtual {v2}, Lqd/j;->w()Z

    .line 276
    .line 277
    .line 278
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    if-nez v2, :cond_9

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_a
    const/4 v0, 0x1

    .line 283
    goto :goto_a

    .line 284
    :goto_9
    invoke-static {v1}, Lxe/s;->g(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    new-instance v2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v3, "Multi-variable type inference failed. Error: "

    .line 291
    .line 292
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {p1, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :goto_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    return-object p1

    .line 310
    :pswitch_13
    check-cast p1, Lqe/d;

    .line 311
    .line 312
    invoke-interface {p1}, Lqe/d;->getType()Lqd/j;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    return-object p1

    .line 317
    :pswitch_14
    check-cast p1, Lqd/s;

    .line 318
    .line 319
    invoke-virtual {p1}, Lqd/s;->o()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    return-object p1

    .line 324
    :pswitch_15
    check-cast p1, Lqd/j;

    .line 325
    .line 326
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    return-object p1

    .line 331
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {p1}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    return-object p1

    .line 338
    :pswitch_17
    check-cast p1, Lud/e;

    .line 339
    .line 340
    new-instance p1, Lod/b;

    .line 341
    .line 342
    invoke-direct {p1}, Lod/b;-><init>()V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :pswitch_18
    check-cast p1, Ljava/util/Map$Entry;

    .line 347
    .line 348
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, Lbc/a;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    check-cast p1, Ljava/util/Set;

    .line 363
    .line 364
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    new-instance v1, Lnd/n;

    .line 369
    .line 370
    const/4 v2, 0x0

    .line 371
    invoke-direct {v1, v0, v2}, Lnd/n;-><init>(Ljava/lang/String;I)V

    .line 372
    .line 373
    .line 374
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    return-object p1

    .line 379
    :pswitch_19
    check-cast p1, Lbc/a;

    .line 380
    .line 381
    new-instance p1, Ljava/util/HashSet;

    .line 382
    .line 383
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 384
    .line 385
    .line 386
    return-object p1

    .line 387
    :pswitch_1a
    check-cast p1, Ljava/util/Map$Entry;

    .line 388
    .line 389
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    check-cast p1, Ljava/lang/Iterable;

    .line 402
    .line 403
    const-string v1, "\n -> "

    .line 404
    .line 405
    invoke-static {p1, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    const-string v1, ": \n -> "

    .line 410
    .line 411
    invoke-static {v0, v1, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    return-object p1

    .line 416
    :pswitch_1b
    check-cast p1, Lqd/k;

    .line 417
    .line 418
    new-instance p1, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 421
    .line 422
    .line 423
    return-object p1

    .line 424
    :pswitch_1c
    new-instance v0, Lme/f;

    .line 425
    .line 426
    check-cast p1, Lqd/s;

    .line 427
    .line 428
    invoke-direct {v0, p1}, Lme/f;-><init>(Lqd/s;)V

    .line 429
    .line 430
    .line 431
    return-object v0

    .line 432
    nop

    .line 433
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
