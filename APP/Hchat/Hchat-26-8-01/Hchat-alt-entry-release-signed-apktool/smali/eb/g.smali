.class public final synthetic Leb/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Leb/g;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Leb/g;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Leb/g;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Leb/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbc/l;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lbc/l;->b:Lud/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Lbc/l;->b()Lbc/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lud/e;->V()Lbc/d;

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lud/e;->m0(Ljava/lang/String;)Lud/r;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    move-object v0, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p1}, Lbc/l;->a()Lbc/k;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3, v0}, Lbc/k;->c(Lud/r;)Lbc/n;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_1
    iget-object v3, p0, Leb/g;->i:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    invoke-virtual {p1}, Lbc/l;->b()Lbc/d;

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Lbc/l;->d:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v4, v0

    .line 70
    check-cast v4, Lbc/n;

    .line 71
    .line 72
    iget-object v4, v4, Lbc/n;->a:Lud/r;

    .line 73
    .line 74
    iget-object v4, v4, Lud/r;->k:Lod/d;

    .line 75
    .line 76
    iget-object v4, v4, Lod/d;->k:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move-object v0, v2

    .line 86
    :goto_2
    check-cast v0, Lbc/n;

    .line 87
    .line 88
    if-eqz v0, :cond_12

    .line 89
    .line 90
    :goto_3
    iget-object p1, v0, Lbc/n;->a:Lud/r;

    .line 91
    .line 92
    iget-object v0, p1, Lud/r;->l:Lud/e;

    .line 93
    .line 94
    invoke-virtual {v0}, Lud/e;->a0()Lud/e;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lud/e;->V()Lbc/d;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {v1}, Lbc/d;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const/4 v5, -0x1

    .line 107
    if-nez v4, :cond_5

    .line 108
    .line 109
    :goto_4
    move v4, v5

    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_5
    invoke-interface {v1}, Lbc/d;->c()Lb/e;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iget v6, p1, Lnd/r;->j:I

    .line 117
    .line 118
    const/4 v7, 0x1

    .line 119
    add-int/2addr v6, v7

    .line 120
    iget-object v4, v4, Lb/e;->i:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, Ljava/util/NavigableMap;

    .line 123
    .line 124
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-interface {v4, v6, v7}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v4}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v4}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    const/4 v6, 0x0

    .line 145
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_b

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Ljava/util/Map$Entry;

    .line 156
    .line 157
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    check-cast v8, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, Lhc/a;

    .line 168
    .line 169
    invoke-interface {v7}, Lhc/a;->j()I

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    invoke-static {v9}, Lt3/c;->b(I)I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    const/4 v10, 0x6

    .line 178
    if-eq v9, v10, :cond_9

    .line 179
    .line 180
    const/16 v7, 0x8

    .line 181
    .line 182
    if-eq v9, v7, :cond_7

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_7
    if-nez v6, :cond_8

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_8
    add-int/lit8 v6, v6, -0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    check-cast v7, Lic/b;

    .line 192
    .line 193
    iget-object v7, v7, Lic/b;->g:Lhc/c;

    .line 194
    .line 195
    invoke-interface {v7}, Lhc/a;->j()I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    invoke-static {v7}, Lt3/c;->b(I)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_a

    .line 204
    .line 205
    const/4 v8, 0x2

    .line 206
    if-eq v7, v8, :cond_a

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 210
    .line 211
    :goto_5
    move-object v8, v2

    .line 212
    :goto_6
    if-eqz v8, :cond_6

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_b
    move-object v8, v2

    .line 216
    :goto_7
    if-nez v8, :cond_c

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_c
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    :goto_8
    if-ne v4, v5, :cond_d

    .line 224
    .line 225
    goto :goto_a

    .line 226
    :cond_d
    iget p1, p1, Lnd/r;->j:I

    .line 227
    .line 228
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 229
    .line 230
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 231
    .line 232
    iget-object v0, v0, Lbc/g;->F:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v0, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-interface {v1}, Lbc/d;->b()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v6, v0, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-ne v6, v5, :cond_e

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    add-int/2addr p1, v6

    .line 254
    :goto_9
    if-ge v4, p1, :cond_f

    .line 255
    .line 256
    :goto_a
    const-string p1, ""

    .line 257
    .line 258
    goto :goto_b

    .line 259
    :cond_f
    invoke-interface {v1}, Lbc/d;->b()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0, p1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    :goto_b
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_10

    .line 272
    .line 273
    move-object v2, p1

    .line 274
    :cond_10
    if-eqz v2, :cond_11

    .line 275
    .line 276
    goto :goto_d

    .line 277
    :cond_11
    const-string p1, "\u65b9\u6cd5\u6ca1\u6709\u53ef\u5bfc\u51fa\u7684 Java \u4ee3\u7801: "

    .line 278
    .line 279
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    :goto_c
    const/4 v2, 0x0

    .line 287
    goto :goto_d

    .line 288
    :cond_12
    const-string p1, "\u6ca1\u6709\u627e\u5230\u65b9\u6cd5: "

    .line 289
    .line 290
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_c

    .line 298
    :goto_d
    return-object v2

    .line 299
    :pswitch_0
    check-cast p1, Log/f;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    check-cast p1, Log/i;

    .line 305
    .line 306
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    const/4 v0, 0x6

    .line 311
    const/16 v1, 0x3e

    .line 312
    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-static {p1, v1, v2, v0}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    add-int/lit8 v0, v0, 0x1

    .line 319
    .line 320
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const-string v0, "&"

    .line 325
    .line 326
    const-string v1, "&amp;"

    .line 327
    .line 328
    iget-object v3, p0, Leb/g;->h:Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v3, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const-string v1, "<"

    .line 335
    .line 336
    const-string v3, "&lt;"

    .line 337
    .line 338
    invoke-static {v0, v1, v3, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    const-string v1, "&gt;"

    .line 343
    .line 344
    const-string v3, ">"

    .line 345
    .line 346
    invoke-static {v0, v3, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const-string v1, "</"

    .line 351
    .line 352
    iget-object v2, p0, Leb/g;->i:Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {p1, v0, v1, v2, v3}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    return-object p1

    .line 359
    :pswitch_1
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 360
    .line 361
    check-cast p1, Lj8/p;

    .line 362
    .line 363
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 364
    .line 365
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->I(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    return-object p1

    .line 374
    :pswitch_2
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 375
    .line 376
    check-cast p1, Lj8/p;

    .line 377
    .line 378
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->i(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    return-object p1

    .line 389
    :pswitch_3
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 390
    .line 391
    check-cast p1, Lj8/p;

    .line 392
    .line 393
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 394
    .line 395
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->G(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    return-object p1

    .line 404
    :pswitch_4
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 405
    .line 406
    check-cast p1, Lj8/p;

    .line 407
    .line 408
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->e(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    return-object p1

    .line 419
    :pswitch_5
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 420
    .line 421
    check-cast p1, Lj8/p;

    .line 422
    .line 423
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 424
    .line 425
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->x(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    return-object p1

    .line 434
    :pswitch_6
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 435
    .line 436
    check-cast p1, Lj8/p;

    .line 437
    .line 438
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 439
    .line 440
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->a(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    return-object p1

    .line 449
    :pswitch_7
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 450
    .line 451
    check-cast p1, Lj8/p;

    .line 452
    .line 453
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 454
    .line 455
    invoke-static {v1, v0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->t(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    return-object p1

    .line 464
    :pswitch_8
    check-cast p1, Leb/j;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    iget-object v0, p1, Leb/j;->a:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v1, p0, Leb/g;->h:Ljava/lang/String;

    .line 472
    .line 473
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_14

    .line 478
    .line 479
    iget-object v0, p0, Leb/g;->i:Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-nez v1, :cond_13

    .line 486
    .line 487
    iget-object p1, p1, Leb/j;->c:Ljava/lang/String;

    .line 488
    .line 489
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result p1

    .line 493
    if-eqz p1, :cond_14

    .line 494
    .line 495
    :cond_13
    const/4 p1, 0x1

    .line 496
    goto :goto_e

    .line 497
    :cond_14
    const/4 p1, 0x0

    .line 498
    :goto_e
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    return-object p1

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
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
