.class public final Lfb/s2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/io/File;

.field public final j:Ljava/io/File;

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Ljava/util/LinkedHashMap;

.field public final n:Ljava/lang/String;

.field public o:I

.field public p:Z

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/io/File;ZLjava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZ)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfb/s2;->g:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lfb/s2;->i:Ljava/io/File;

    .line 12
    .line 13
    iput-object p4, p0, Lfb/s2;->j:Ljava/io/File;

    .line 14
    .line 15
    iput-boolean p5, p0, Lfb/s2;->k:Z

    .line 16
    .line 17
    iput-object p6, p0, Lfb/s2;->l:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, Lfb/s2;->m:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    iput-object p8, p0, Lfb/s2;->n:Ljava/lang/String;

    .line 22
    .line 23
    iput p9, p0, Lfb/s2;->o:I

    .line 24
    .line 25
    iput-boolean p12, p0, Lfb/s2;->p:Z

    .line 26
    .line 27
    iput p10, p0, Lfb/s2;->q:I

    .line 28
    .line 29
    iput p11, p0, Lfb/s2;->r:I

    .line 30
    .line 31
    return-void
.end method

.method public static J(Lfb/s2;Ljava/lang/String;I)Lfb/n2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    and-int/lit8 v1, p2, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "."

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v1, p1

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v2, p2, 0x2

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move v2, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v2, v3

    .line 21
    :goto_1
    sget-object v5, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    iget-object v5, v0, Lfb/s2;->m:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    iget-object v6, v0, Lfb/s2;->i:Ljava/io/File;

    .line 26
    .line 27
    iget-object v0, v0, Lfb/s2;->j:Ljava/io/File;

    .line 28
    .line 29
    invoke-static {v0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    invoke-static {v9}, Ltf/y;->a0(I)I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    invoke-direct {v8, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Ljava/lang/Iterable;

    .line 51
    .line 52
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    sget-object v11, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Lfb/q2;

    .line 79
    .line 80
    invoke-static {v9}, Lfb/t2;->R(Lfb/q2;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, Ljava/lang/Iterable;

    .line 97
    .line 98
    invoke-static {v7, v9}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Ljava/lang/Iterable;

    .line 103
    .line 104
    new-instance v9, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_4

    .line 118
    .line 119
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    move-object v11, v10

    .line 124
    check-cast v11, Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v1, v11}, Lfb/t2;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-eqz v11, :cond_3

    .line 131
    .line 132
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    invoke-static {v9}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    check-cast v9, Ljava/lang/Iterable;

    .line 149
    .line 150
    invoke-static {v7, v9}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    check-cast v7, Ljava/lang/Iterable;

    .line 155
    .line 156
    new-instance v9, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    :cond_5
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-eqz v10, :cond_6

    .line 170
    .line 171
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    move-object v11, v10

    .line 176
    check-cast v11, Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v1, v11}, Lfb/t2;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    if-eqz v11, :cond_5

    .line 183
    .line 184
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    invoke-static {v9}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    check-cast v7, Ljava/lang/Iterable;

    .line 197
    .line 198
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    check-cast v9, Ljava/lang/Iterable;

    .line 203
    .line 204
    invoke-static {v7, v9}, Ltf/m;->x1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    new-instance v9, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    :cond_7
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-eqz v10, :cond_8

    .line 222
    .line 223
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    move-object v11, v10

    .line 228
    check-cast v11, Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v1, v11}, Lfb/t2;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    if-eqz v12, :cond_7

    .line 235
    .line 236
    invoke-virtual {v5, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    invoke-virtual {v8, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v11

    .line 244
    invoke-static {v12, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    if-nez v11, :cond_7

    .line 249
    .line 250
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_8
    invoke-static {v9}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    if-eqz v2, :cond_9

    .line 264
    .line 265
    invoke-static {v13, v14}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-static {v2, v15}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    goto :goto_6

    .line 274
    :cond_9
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 275
    .line 276
    :goto_6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_f

    .line 285
    .line 286
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    check-cast v5, Ljava/lang/String;

    .line 291
    .line 292
    new-instance v7, Ljava/io/File;

    .line 293
    .line 294
    invoke-direct {v7, v6, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-instance v8, Ljava/io/File;

    .line 298
    .line 299
    invoke-direct {v8, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v13, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    const/4 v10, 0x0

    .line 307
    if-eqz v9, :cond_a

    .line 308
    .line 309
    invoke-static {v10, v8, v5}, Lfb/t2;->x(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    goto :goto_8

    .line 314
    :cond_a
    invoke-interface {v15, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-eqz v9, :cond_b

    .line 319
    .line 320
    invoke-static {v7, v10, v5}, Lfb/t2;->x(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    goto :goto_8

    .line 325
    :cond_b
    invoke-static {v7, v8, v5}, Lfb/t2;->x(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    :goto_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    if-nez v7, :cond_c

    .line 334
    .line 335
    const-string v7, ""

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_c
    const-string v7, "\n\n"

    .line 339
    .line 340
    :goto_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    add-int/2addr v9, v8

    .line 349
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    add-int/2addr v8, v9

    .line 354
    const v9, 0x17700

    .line 355
    .line 356
    .line 357
    if-le v8, v9, :cond_e

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    sub-int/2addr v9, v0

    .line 364
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    sub-int/2addr v9, v0

    .line 369
    if-gez v9, :cond_d

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_d
    move v3, v9

    .line 373
    :goto_a
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-static {v3, v5}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    move/from16 v17, v4

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_e
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_f
    move/from16 v17, v3

    .line 394
    .line 395
    :goto_b
    if-eqz v17, :cond_10

    .line 396
    .line 397
    const-string v0, "\n... diff \u5df2\u622a\u65ad\uff0c\u8bf7\u6309 path \u5206\u6bb5\u8c03\u7528 show_diff ..."

    .line 398
    .line 399
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    :cond_10
    new-instance v12, Lfb/n2;

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v16

    .line 408
    invoke-direct/range {v12 .. v17}, Lfb/n2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V

    .line 409
    .line 410
    .line 411
    return-object v12
.end method

.method public static y(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x5c

    .line 10
    .line 11
    const/16 v1, 0x2f

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Log/t;->b0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x1

    .line 18
    new-array v2, v0, [C

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-char v1, v2, v3

    .line 22
    .line 23
    invoke-static {p0, v2}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v4, 0x0

    .line 32
    const-string v5, "."

    .line 33
    .line 34
    if-nez v2, :cond_8

    .line 35
    .line 36
    invoke-virtual {p0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    invoke-static {p0, v1}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_7

    .line 49
    .line 50
    invoke-static {p0, v3}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_7

    .line 55
    .line 56
    new-array p1, v0, [C

    .line 57
    .line 58
    aput-char v1, p1, v3

    .line 59
    .line 60
    const/4 v1, 0x6

    .line 61
    invoke-static {p0, p1, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_3

    .line 99
    .line 100
    const-string v2, ".."

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    move v1, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    :goto_1
    move v1, v0

    .line 112
    :goto_2
    if-nez v1, :cond_4

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    const-string p0, "\u8def\u5f84\u5305\u542b\u4e0d\u5141\u8bb8\u7684\u7247\u6bb5"

    .line 116
    .line 117
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v4

    .line 121
    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    const/16 p1, 0xf0

    .line 126
    .line 127
    if-gt p0, p1, :cond_6

    .line 128
    .line 129
    const/4 v10, 0x0

    .line 130
    const/16 v11, 0x3e

    .line 131
    .line 132
    const-string v7, "/"

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_6
    const-string p0, "\u8def\u5f84\u8fc7\u957f"

    .line 142
    .line 143
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v4

    .line 147
    :cond_7
    const-string p0, "\u5fc5\u987b\u4f7f\u7528\u63d2\u4ef6\u76ee\u5f55\u5185\u7684\u76f8\u5bf9\u8def\u5f84"

    .line 148
    .line 149
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object v4

    .line 153
    :cond_8
    :goto_4
    if-eqz p1, :cond_9

    .line 154
    .line 155
    return-object v5

    .line 156
    :cond_9
    const-string p0, "path \u4e0d\u80fd\u4e3a\u7a7a"

    .line 157
    .line 158
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v4
.end method


# virtual methods
.method public final A(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "path"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v3, v4}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-virtual {v5, v3, v4}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v7, :cond_17

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 33
    .line 34
    .line 35
    move-result-wide v9

    .line 36
    const-wide/32 v11, 0x200000

    .line 37
    .line 38
    .line 39
    cmp-long v7, v9, v11

    .line 40
    .line 41
    if-gtz v7, :cond_16

    .line 42
    .line 43
    invoke-static {v6}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    sget-object v7, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-static {v6}, Lfb/t2;->C([B)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_15

    .line 54
    .line 55
    new-instance v7, Ljava/lang/String;

    .line 56
    .line 57
    sget-object v8, Log/a;->a:Ljava/nio/charset/Charset;

    .line 58
    .line 59
    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 60
    .line 61
    .line 62
    const-string v6, "\r\n"

    .line 63
    .line 64
    const-string v8, "\n"

    .line 65
    .line 66
    invoke-static {v7, v6, v8, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const/16 v8, 0xd

    .line 71
    .line 72
    const/16 v9, 0xa

    .line 73
    .line 74
    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    const/4 v10, 0x1

    .line 86
    if-nez v8, :cond_0

    .line 87
    .line 88
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v6, v9}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v11, 0x6

    .line 96
    if-eqz v8, :cond_1

    .line 97
    .line 98
    invoke-static {v10, v6}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    new-array v8, v10, [C

    .line 103
    .line 104
    aput-char v9, v8, v4

    .line 105
    .line 106
    invoke-static {v6, v8, v11}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-array v8, v10, [C

    .line 112
    .line 113
    aput-char v9, v8, v4

    .line 114
    .line 115
    invoke-static {v6, v8, v11}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    :goto_0
    const-string v8, "start_line"

    .line 120
    .line 121
    invoke-virtual {v0, v8, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-ge v8, v10, :cond_2

    .line 126
    .line 127
    move v8, v10

    .line 128
    :cond_2
    const-string v11, "start_column"

    .line 129
    .line 130
    invoke-virtual {v0, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-ge v11, v10, :cond_3

    .line 135
    .line 136
    move v11, v10

    .line 137
    :cond_3
    const-string v12, "max_lines"

    .line 138
    .line 139
    const/16 v13, 0x190

    .line 140
    .line 141
    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    const/16 v13, 0x7d0

    .line 146
    .line 147
    invoke-static {v12, v10, v13}, Lr9/e0;->r(III)I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    const-string v13, "end_line"

    .line 152
    .line 153
    invoke-virtual {v0, v13, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-lez v13, :cond_6

    .line 158
    .line 159
    if-ge v13, v8, :cond_4

    .line 160
    .line 161
    move v13, v8

    .line 162
    :cond_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    if-le v13, v12, :cond_7

    .line 167
    .line 168
    :cond_5
    move v13, v12

    .line 169
    goto :goto_1

    .line 170
    :cond_6
    add-int/2addr v12, v8

    .line 171
    sub-int/2addr v12, v10

    .line 172
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-le v12, v13, :cond_5

    .line 177
    .line 178
    :cond_7
    :goto_1
    const-string v12, "include_line_numbers"

    .line 179
    .line 180
    invoke-virtual {v0, v12, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    new-instance v12, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    if-gt v8, v14, :cond_12

    .line 194
    .line 195
    if-gt v8, v13, :cond_12

    .line 196
    .line 197
    move v15, v4

    .line 198
    move/from16 v16, v15

    .line 199
    .line 200
    move v14, v8

    .line 201
    :goto_2
    add-int/lit8 v4, v14, -0x1

    .line 202
    .line 203
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Ljava/lang/String;

    .line 208
    .line 209
    if-ne v14, v8, :cond_9

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 212
    .line 213
    .line 214
    move-result v17

    .line 215
    add-int/lit8 v9, v17, 0x1

    .line 216
    .line 217
    if-le v11, v9, :cond_8

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_8
    move v9, v11

    .line 221
    goto :goto_3

    .line 222
    :cond_9
    move v9, v10

    .line 223
    :goto_3
    add-int/lit8 v10, v9, -0x1

    .line 224
    .line 225
    invoke-virtual {v4, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-eqz v0, :cond_b

    .line 230
    .line 231
    const-string v10, " | "

    .line 232
    .line 233
    move/from16 p1, v0

    .line 234
    .line 235
    const/4 v0, 0x1

    .line 236
    if-le v9, v0, :cond_a

    .line 237
    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    move-object/from16 v18, v2

    .line 247
    .line 248
    const-string v2, ":"

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    goto :goto_4

    .line 264
    :cond_a
    move-object/from16 v18, v2

    .line 265
    .line 266
    invoke-static {v14, v10}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    goto :goto_4

    .line 271
    :cond_b
    move/from16 p1, v0

    .line 272
    .line 273
    move-object/from16 v18, v2

    .line 274
    .line 275
    move-object/from16 v0, v18

    .line 276
    .line 277
    :goto_4
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_c

    .line 282
    .line 283
    const/16 v17, 0x1

    .line 284
    .line 285
    :goto_5
    const/4 v2, 0x1

    .line 286
    goto :goto_6

    .line 287
    :cond_c
    const/16 v17, 0x0

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :goto_6
    xor-int/lit8 v10, v17, 0x1

    .line 291
    .line 292
    const v17, 0xfa00

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 296
    .line 297
    .line 298
    move-result v19

    .line 299
    sub-int v17, v17, v19

    .line 300
    .line 301
    sub-int v17, v17, v10

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    sub-int v10, v17, v10

    .line 308
    .line 309
    if-gtz v10, :cond_d

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_d
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 313
    .line 314
    .line 315
    move-result v17

    .line 316
    const/16 v2, 0xa

    .line 317
    .line 318
    if-lez v17, :cond_e

    .line 319
    .line 320
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    :cond_e
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-le v0, v10, :cond_f

    .line 331
    .line 332
    invoke-static {v10, v4}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    add-int/2addr v9, v10

    .line 340
    goto :goto_7

    .line 341
    :cond_f
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    if-ne v14, v13, :cond_10

    .line 345
    .line 346
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-ge v13, v0, :cond_10

    .line 351
    .line 352
    add-int/lit8 v15, v13, 0x1

    .line 353
    .line 354
    const/16 v16, 0x1

    .line 355
    .line 356
    :cond_10
    if-ne v14, v13, :cond_11

    .line 357
    .line 358
    move v14, v15

    .line 359
    move/from16 v9, v16

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_11
    add-int/lit8 v14, v14, 0x1

    .line 363
    .line 364
    move/from16 v0, p1

    .line 365
    .line 366
    move v9, v2

    .line 367
    move-object/from16 v2, v18

    .line 368
    .line 369
    const/4 v4, 0x0

    .line 370
    const/4 v10, 0x1

    .line 371
    goto/16 :goto_2

    .line 372
    .line 373
    :cond_12
    const/4 v9, 0x0

    .line 374
    const/4 v14, 0x0

    .line 375
    :goto_7
    invoke-virtual {v5}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 380
    .line 381
    .line 382
    const-string v1, "startLine"

    .line 383
    .line 384
    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 385
    .line 386
    .line 387
    const-string v1, "startColumn"

    .line 388
    .line 389
    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 390
    .line 391
    .line 392
    const-string v1, "endLine"

    .line 393
    .line 394
    invoke-virtual {v0, v1, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 395
    .line 396
    .line 397
    const-string v1, "returnedLength"

    .line 398
    .line 399
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 404
    .line 405
    .line 406
    const-string v1, "totalLength"

    .line 407
    .line 408
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 413
    .line 414
    .line 415
    const-string v1, "totalLines"

    .line 416
    .line 417
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 422
    .line 423
    .line 424
    if-lez v14, :cond_13

    .line 425
    .line 426
    const/4 v4, 0x1

    .line 427
    goto :goto_8

    .line 428
    :cond_13
    const/4 v4, 0x0

    .line 429
    :goto_8
    const-string v1, "truncated"

    .line 430
    .line 431
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 432
    .line 433
    .line 434
    if-lez v14, :cond_14

    .line 435
    .line 436
    const-string v1, "nextLine"

    .line 437
    .line 438
    invoke-virtual {v0, v1, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 439
    .line 440
    .line 441
    const-string v1, "nextColumn"

    .line 442
    .line 443
    invoke-virtual {v0, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 444
    .line 445
    .line 446
    :cond_14
    const-string v1, "content"

    .line 447
    .line 448
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :cond_15
    const-string v0, "\u6587\u4ef6\u4e0d\u662f\u53ef\u8bfb\u53d6\u7684\u6587\u672c\u6587\u4ef6: "

    .line 464
    .line 465
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v8

    .line 473
    :cond_16
    const-string v0, "\u6587\u4ef6\u8d85\u8fc7 2 MB\uff0c\u4e0d\u80fd\u4f5c\u4e3a\u6587\u672c\u8bfb\u53d6"

    .line 474
    .line 475
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    return-object v8

    .line 479
    :cond_17
    const-string v0, "\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 480
    .line 481
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    return-object v8
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lfb/s2;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "\u6574\u4e2a\u63d2\u4ef6\u5df2\u6807\u8bb0\u5220\u9664\uff0c\u4e0d\u80fd\u7ee7\u7eed\u4fee\u6539\u6587\u4ef6"

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C()Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lfb/s2;->i:Ljava/io/File;

    .line 4
    .line 5
    invoke-static {v0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lfb/s2;->l:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lfb/s2;->j:Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sget-object v4, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    array-length v4, v2

    .line 33
    move v5, v3

    .line 34
    :goto_0
    if-ge v5, v4, :cond_0

    .line 35
    .line 36
    aget-object v6, v2, v5

    .line 37
    .line 38
    invoke-static {v6}, Lfb/t2;->p(Ljava/io/File;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-boolean v2, p0, Lfb/s2;->k:Z

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lfb/t2;->n(Ljava/io/File;Ljava/io/File;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iput-boolean v3, p0, Lfb/s2;->p:Z

    .line 54
    .line 55
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "reset"

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    const-string v1, "hasChanges"

    .line 69
    .line 70
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_2
    const-string v0, "\u539f\u63d2\u4ef6\u5df2\u5728\u4efb\u52a1\u671f\u95f4\u53d1\u751f\u53d8\u5316\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u540e\u4fee\u6539"

    .line 82
    .line 83
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    return-object v0
.end method

.method public final D(Ljava/lang/String;Z)Ljava/io/File;
    .locals 5

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lfb/s2;->j:Ljava/io/File;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static {v1, v2, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    const-string p1, "\u8def\u5f84\u8d85\u51fa\u63d2\u4ef6\u5de5\u4f5c\u533a"

    .line 69
    .line 70
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    return-object p1

    .line 75
    :cond_2
    :goto_2
    if-nez p2, :cond_4

    .line 76
    .line 77
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    const-string p1, "\u4e0d\u80fd\u64cd\u4f5c\u63d2\u4ef6\u5de5\u4f5c\u533a\u6839\u76ee\u5f55"

    .line 85
    .line 86
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    return-object p1
.end method

.method public final E(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    iget-object v0, p0, Lfb/s2;->i:Ljava/io/File;

    .line 7
    .line 8
    invoke-static {v0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lfb/s2;->l:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    const-string v1, ""

    .line 26
    .line 27
    const-string v3, "path"

    .line 28
    .line 29
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {p1, v1}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, v1}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Ljava/io/File;

    .line 46
    .line 47
    invoke-direct {v5, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_5

    .line 63
    .line 64
    invoke-static {v6, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_0

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    .line 82
    .line 83
    new-instance v8, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v5, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_2

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    const-string v0, "\u8def\u5f84\u5728\u539f\u63d2\u4ef6\u548c\u5de5\u4f5c\u533a\u4e2d\u90fd\u4e0d\u5b58\u5728: "

    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_2
    :goto_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    .line 135
    invoke-static {v4}, Lfb/t2;->p(Ljava/io/File;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_4

    .line 143
    .line 144
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 145
    .line 146
    invoke-static {v6, v4}, Lfb/t2;->m(Ljava/io/File;Ljava/io/File;)V

    .line 147
    .line 148
    .line 149
    :cond_4
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    .line 151
    iget-object v0, p0, Lfb/s2;->j:Ljava/io/File;

    .line 152
    .line 153
    invoke-static {v0}, Lfb/t2;->s(Ljava/io/File;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    const-string p1, "restored"

    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    xor-int/lit8 p1, p1, 0x1

    .line 180
    .line 181
    const-string v1, "removedNewPath"

    .line 182
    .line 183
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_5
    const-string p1, "\u6062\u590d\u8def\u5f84\u8d85\u51fa\u539f\u63d2\u4ef6\u76ee\u5f55\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5"

    .line 195
    .line 196
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object v2

    .line 200
    :cond_6
    const-string p1, "\u539f\u63d2\u4ef6\u5df2\u5728\u4efb\u52a1\u671f\u95f4\u53d1\u751f\u53d8\u5316\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u540e\u4fee\u6539"

    .line 201
    .line 202
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-object v2
.end method

.method public final F(Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "query"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x0

    .line 21
    if-nez v5, :cond_19

    .line 22
    .line 23
    const-string v5, "."

    .line 24
    .line 25
    const-string v7, "path"

    .line 26
    .line 27
    invoke-virtual {v0, v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    invoke-static {v5, v8}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v1, v5, v8}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_18

    .line 48
    .line 49
    const-string v5, "case_sensitive"

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-virtual {v0, v5, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const-string v11, "regex"

    .line 57
    .line 58
    invoke-virtual {v0, v11, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    const-string v12, "limit"

    .line 63
    .line 64
    const/16 v13, 0x32

    .line 65
    .line 66
    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    const/16 v13, 0xc8

    .line 71
    .line 72
    invoke-static {v12, v8, v13}, Lr9/e0;->r(III)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    const-string v13, "file_pattern"

    .line 77
    .line 78
    invoke-static {v13, v3, v0}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    const-string v14, "exclude_pattern"

    .line 83
    .line 84
    invoke-static {v14, v3, v0}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-nez v14, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    move-object v13, v6

    .line 96
    :goto_0
    if-eqz v13, :cond_1

    .line 97
    .line 98
    invoke-static {v13}, Lfb/t2;->c(Ljava/lang/String;)Log/k;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move-object v13, v6

    .line 104
    :goto_1
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    if-nez v14, :cond_2

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    move-object v3, v6

    .line 112
    :goto_2
    if-eqz v3, :cond_3

    .line 113
    .line 114
    invoke-static {v3}, Lfb/t2;->c(Ljava/lang/String;)Log/k;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move-object v3, v6

    .line 120
    :goto_3
    const-string v14, "before_context"

    .line 121
    .line 122
    invoke-virtual {v0, v14, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    const/16 v15, 0xa

    .line 127
    .line 128
    invoke-static {v14, v10, v15}, Lr9/e0;->r(III)I

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    const-string v8, "after_context"

    .line 133
    .line 134
    invoke-virtual {v0, v8, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0, v10, v15}, Lr9/e0;->r(III)I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v11, :cond_5

    .line 143
    .line 144
    new-instance v0, Log/k;

    .line 145
    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    sget-object v11, Ltf/v;->g:Ltf/v;

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    sget-object v11, Log/l;->h:Log/l;

    .line 152
    .line 153
    invoke-static {v11}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    :goto_4
    invoke-direct {v0, v4, v11}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 158
    .line 159
    .line 160
    move-object v11, v0

    .line 161
    goto :goto_5

    .line 162
    :cond_5
    move-object v11, v6

    .line 163
    :goto_5
    if-eqz v5, :cond_6

    .line 164
    .line 165
    move-object/from16 v16, v4

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_6
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 169
    .line 170
    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-object/from16 v16, v0

    .line 178
    .line 179
    :goto_6
    new-instance v15, Lorg/json/JSONArray;

    .line 180
    .line 181
    invoke-direct {v15}, Lorg/json/JSONArray;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    new-instance v0, Ldg/n;

    .line 191
    .line 192
    const/4 v10, 0x3

    .line 193
    invoke-direct {v0, v9, v10}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v18, v6

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    new-instance v0, Ldg/j;

    .line 200
    .line 201
    sget-object v10, Ldg/k;->g:Ldg/k;

    .line 202
    .line 203
    invoke-direct {v0, v9, v10, v6}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 204
    .line 205
    .line 206
    new-instance v9, Lfb/g0;

    .line 207
    .line 208
    const/16 v10, 0x1b

    .line 209
    .line 210
    invoke-direct {v9, v10}, Lfb/g0;-><init>(I)V

    .line 211
    .line 212
    .line 213
    new-instance v10, Lng/i;

    .line 214
    .line 215
    move-object/from16 v18, v6

    .line 216
    .line 217
    const/4 v6, 0x1

    .line 218
    invoke-direct {v10, v0, v6, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 219
    .line 220
    .line 221
    move-object v0, v10

    .line 222
    :goto_7
    invoke-interface {v0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_16

    .line 231
    .line 232
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/io/File;

    .line 237
    .line 238
    invoke-virtual/range {p2 .. p2}, Lfb/b;->d()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-lt v9, v12, :cond_8

    .line 246
    .line 247
    goto/16 :goto_10

    .line 248
    .line 249
    :cond_8
    iget-object v9, v1, Lfb/s2;->j:Ljava/io/File;

    .line 250
    .line 251
    invoke-static {v0, v9}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    invoke-static {v9}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    if-eqz v13, :cond_9

    .line 260
    .line 261
    invoke-virtual {v13, v9}, Log/k;->d(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    if-nez v10, :cond_9

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_9
    if-eqz v3, :cond_a

    .line 269
    .line 270
    invoke-virtual {v3, v9}, Log/k;->d(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_a

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_a
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 278
    .line 279
    .line 280
    move-result-wide v19

    .line 281
    const-wide/32 v21, 0x200000

    .line 282
    .line 283
    .line 284
    cmp-long v10, v19, v21

    .line 285
    .line 286
    if-lez v10, :cond_b

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_b
    :try_start_0
    invoke-static {v0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 290
    .line 291
    .line 292
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    goto :goto_9

    .line 294
    :catchall_0
    move-exception v0

    .line 295
    new-instance v10, Lsf/f;

    .line 296
    .line 297
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    move-object v0, v10

    .line 301
    :goto_9
    nop

    .line 302
    instance-of v10, v0, Lsf/f;

    .line 303
    .line 304
    if-eqz v10, :cond_c

    .line 305
    .line 306
    move-object/from16 v0, v18

    .line 307
    .line 308
    :cond_c
    check-cast v0, [B

    .line 309
    .line 310
    if-eqz v0, :cond_15

    .line 311
    .line 312
    sget-object v10, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 313
    .line 314
    invoke-static {v0}, Lfb/t2;->C([B)Z

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    if-nez v10, :cond_d

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_d
    new-instance v10, Ljava/lang/String;

    .line 322
    .line 323
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 324
    .line 325
    invoke-direct {v10, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 326
    .line 327
    .line 328
    const-string v0, "\r\n"

    .line 329
    .line 330
    const-string v1, "\n"

    .line 331
    .line 332
    move-object/from16 v19, v3

    .line 333
    .line 334
    const/4 v3, 0x0

    .line 335
    invoke-static {v10, v0, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    const/16 v1, 0xd

    .line 340
    .line 341
    const/16 v10, 0xa

    .line 342
    .line 343
    invoke-virtual {v0, v1, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move/from16 v17, v3

    .line 351
    .line 352
    const/4 v1, 0x1

    .line 353
    new-array v3, v1, [C

    .line 354
    .line 355
    aput-char v10, v3, v17

    .line 356
    .line 357
    const/4 v1, 0x6

    .line 358
    invoke-static {v0, v3, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    const/4 v3, 0x0

    .line 363
    :goto_a
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    if-ge v3, v10, :cond_14

    .line 368
    .line 369
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    if-ge v10, v12, :cond_14

    .line 374
    .line 375
    invoke-virtual/range {p2 .. p2}, Lfb/b;->d()V

    .line 376
    .line 377
    .line 378
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    check-cast v10, Ljava/lang/String;

    .line 383
    .line 384
    if-eqz v11, :cond_f

    .line 385
    .line 386
    invoke-static {v11, v10}, Log/k;->b(Log/k;Ljava/lang/String;)Log/i;

    .line 387
    .line 388
    .line 389
    move-result-object v20

    .line 390
    if-eqz v20, :cond_e

    .line 391
    .line 392
    invoke-virtual/range {v20 .. v20}, Log/i;->b()Llg/d;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    if-eqz v1, :cond_e

    .line 397
    .line 398
    iget v1, v1, Llg/b;->g:I

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_e
    const/4 v1, -0x1

    .line 402
    :goto_b
    move-object/from16 p1, v16

    .line 403
    .line 404
    move/from16 v16, v5

    .line 405
    .line 406
    move-object/from16 v5, p1

    .line 407
    .line 408
    move-object/from16 p1, v6

    .line 409
    .line 410
    move/from16 v17, v8

    .line 411
    .line 412
    const/4 v6, 0x6

    .line 413
    const/4 v8, 0x0

    .line 414
    goto :goto_e

    .line 415
    :cond_f
    if-eqz v5, :cond_10

    .line 416
    .line 417
    move-object v1, v10

    .line 418
    :goto_c
    move-object/from16 p1, v16

    .line 419
    .line 420
    move/from16 v16, v5

    .line 421
    .line 422
    move-object/from16 v5, p1

    .line 423
    .line 424
    move-object/from16 p1, v6

    .line 425
    .line 426
    move/from16 v17, v8

    .line 427
    .line 428
    const/4 v6, 0x6

    .line 429
    const/4 v8, 0x0

    .line 430
    goto :goto_d

    .line 431
    :cond_10
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 432
    .line 433
    invoke-virtual {v10, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    goto :goto_c

    .line 441
    :goto_d
    invoke-static {v1, v5, v8, v8, v6}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    :goto_e
    if-ltz v1, :cond_13

    .line 446
    .line 447
    invoke-static {v7, v9}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    add-int/lit8 v8, v3, 0x1

    .line 452
    .line 453
    move/from16 v22, v1

    .line 454
    .line 455
    const-string v1, "line"

    .line 456
    .line 457
    invoke-virtual {v6, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 458
    .line 459
    .line 460
    add-int/lit8 v1, v22, 0x1

    .line 461
    .line 462
    move-object/from16 v22, v5

    .line 463
    .line 464
    const-string v5, "column"

    .line 465
    .line 466
    invoke-virtual {v6, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 467
    .line 468
    .line 469
    const/16 v1, 0x1f4

    .line 470
    .line 471
    invoke-static {v1, v10}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    const-string v5, "preview"

    .line 476
    .line 477
    invoke-virtual {v6, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 478
    .line 479
    .line 480
    if-lez v14, :cond_11

    .line 481
    .line 482
    sub-int v1, v3, v14

    .line 483
    .line 484
    invoke-static {v0, v1, v3}, Lfb/t2;->b(Ljava/util/List;II)Lorg/json/JSONArray;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const-string v5, "before"

    .line 489
    .line 490
    invoke-virtual {v6, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 491
    .line 492
    .line 493
    :cond_11
    if-lez v17, :cond_12

    .line 494
    .line 495
    add-int v1, v8, v17

    .line 496
    .line 497
    invoke-static {v0, v8, v1}, Lfb/t2;->b(Ljava/util/List;II)Lorg/json/JSONArray;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    const-string v5, "after"

    .line 502
    .line 503
    invoke-virtual {v6, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 504
    .line 505
    .line 506
    :cond_12
    invoke-virtual {v15, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 507
    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_13
    move-object/from16 v22, v5

    .line 511
    .line 512
    :goto_f
    add-int/lit8 v3, v3, 0x1

    .line 513
    .line 514
    move-object/from16 v6, p1

    .line 515
    .line 516
    move/from16 v5, v16

    .line 517
    .line 518
    move/from16 v8, v17

    .line 519
    .line 520
    move-object/from16 v16, v22

    .line 521
    .line 522
    const/4 v1, 0x6

    .line 523
    goto/16 :goto_a

    .line 524
    .line 525
    :cond_14
    move-object/from16 p1, v6

    .line 526
    .line 527
    move/from16 v17, v8

    .line 528
    .line 529
    move-object/from16 v22, v16

    .line 530
    .line 531
    move/from16 v16, v5

    .line 532
    .line 533
    move-object/from16 v1, p0

    .line 534
    .line 535
    move-object/from16 v6, p1

    .line 536
    .line 537
    move/from16 v5, v16

    .line 538
    .line 539
    move/from16 v8, v17

    .line 540
    .line 541
    move-object/from16 v3, v19

    .line 542
    .line 543
    move-object/from16 v16, v22

    .line 544
    .line 545
    goto/16 :goto_8

    .line 546
    .line 547
    :cond_15
    move-object/from16 v22, v16

    .line 548
    .line 549
    move-object/from16 v1, p0

    .line 550
    .line 551
    goto/16 :goto_8

    .line 552
    .line 553
    :cond_16
    :goto_10
    invoke-virtual/range {p0 .. p0}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 558
    .line 559
    .line 560
    const-string v1, "matches"

    .line 561
    .line 562
    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-lt v1, v12, :cond_17

    .line 570
    .line 571
    const/4 v8, 0x1

    .line 572
    goto :goto_11

    .line 573
    :cond_17
    const/4 v8, 0x0

    .line 574
    :goto_11
    const-string v1, "truncated"

    .line 575
    .line 576
    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    return-object v0

    .line 587
    :cond_18
    move-object/from16 v18, v6

    .line 588
    .line 589
    const-string v0, "\u641c\u7d22\u8def\u5f84\u4e0d\u5b58\u5728: "

    .line 590
    .line 591
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    return-object v18

    .line 599
    :cond_19
    move-object/from16 v18, v6

    .line 600
    .line 601
    const-string v0, "query \u4e0d\u80fd\u4e3a\u7a7a"

    .line 602
    .line 603
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    return-object v18
.end method

.method public final G(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "path"

    .line 4
    .line 5
    invoke-static {v1, v0, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const-string v3, "."

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p1, v2}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move-object p1, v3

    .line 31
    :goto_1
    const/4 v0, 0x2

    .line 32
    invoke-static {p0, p1, v0}, Lfb/s2;->J(Lfb/s2;Ljava/lang/String;I)Lfb/n2;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    iget v4, p0, Lfb/s2;->o:I

    .line 43
    .line 44
    iput v4, p0, Lfb/s2;->r:I

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    const-string v1, "completeDiff"

    .line 54
    .line 55
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lfb/n2;->a()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    iget-boolean p1, p0, Lfb/s2;->p:Z

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    :cond_3
    const/4 v2, 0x1

    .line 73
    :cond_4
    const-string p1, "hasChanges"

    .line 74
    .line 75
    invoke-virtual {v4, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    new-instance p1, Lorg/json/JSONArray;

    .line 79
    .line 80
    iget-object v1, v0, Lfb/n2;->a:Ljava/util/List;

    .line 81
    .line 82
    invoke-direct {p1, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 83
    .line 84
    .line 85
    const-string v1, "created"

    .line 86
    .line 87
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    new-instance p1, Lorg/json/JSONArray;

    .line 91
    .line 92
    iget-object v1, v0, Lfb/n2;->b:Ljava/util/List;

    .line 93
    .line 94
    invoke-direct {p1, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    const-string v1, "modified"

    .line 98
    .line 99
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    new-instance p1, Lorg/json/JSONArray;

    .line 103
    .line 104
    iget-object v1, v0, Lfb/n2;->c:Ljava/util/List;

    .line 105
    .line 106
    invoke-direct {p1, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    const-string v1, "deleted"

    .line 110
    .line 111
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    const-string p1, "diff"

    .line 115
    .line 116
    iget-object v1, v0, Lfb/n2;->d:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v4, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string p1, "truncated"

    .line 122
    .line 123
    iget-boolean v0, v0, Lfb/n2;->e:Z

    .line 124
    .line 125
    invoke-virtual {v4, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    return-object p1
.end method

.method public final H()Lorg/json/JSONObject;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "staged"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    const-string v1, "persisted"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    const-string v1, "message"

    .line 18
    .line 19
    const-string v2, "\u53d8\u66f4\u4ec5\u5199\u5165\u6682\u5b58\u5de5\u4f5c\u533a\uff0c\u5c1a\u672a\u63d0\u4ea4\u5230\u771f\u5b9e\u63d2\u4ef6\u76ee\u5f55"

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1}, Lfb/s2;->J(Lfb/s2;Ljava/lang/String;I)Lfb/n2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v2, p0, Lfb/s2;->p:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    new-instance v2, Lfb/z1;

    .line 13
    .line 14
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 15
    .line 16
    invoke-direct {v2, v4}, Lfb/z1;-><init>(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    :try_start_0
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    iget-object v2, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v4, p0, Lfb/s2;->j:Ljava/io/File;

    .line 25
    .line 26
    invoke-static {v4, v2}, Lfb/t2;->b0(Ljava/io/File;Ljava/lang/String;)Lfb/p2;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v2, v2, Lfb/p2;->b:Lfb/z1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    new-instance v4, Lsf/f;

    .line 35
    .line 36
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v2, v4

    .line 40
    :goto_0
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    new-instance v2, Lfb/z1;

    .line 48
    .line 49
    new-instance v5, Lfb/a0;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-string v4, "\u63d2\u4ef6\u6587\u4ef6\u4e0d\u5b8c\u6574"

    .line 59
    .line 60
    :goto_1
    sget-object v6, Lfb/b0;->g:Lfb/b0;

    .line 61
    .line 62
    invoke-direct {v5, v6, v4, v3}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-direct {v2, v4}, Lfb/z1;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    check-cast v2, Lfb/z1;

    .line 73
    .line 74
    :goto_3
    iget v4, p0, Lfb/s2;->o:I

    .line 75
    .line 76
    iput v4, p0, Lfb/s2;->q:I

    .line 77
    .line 78
    invoke-virtual {p0}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v0}, Lfb/n2;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_3

    .line 87
    .line 88
    iget-boolean v5, p0, Lfb/s2;->p:Z

    .line 89
    .line 90
    if-eqz v5, :cond_4

    .line 91
    .line 92
    :cond_3
    move v3, v1

    .line 93
    :cond_4
    const-string v5, "hasChanges"

    .line 94
    .line 95
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    const-string v3, "deletePlugin"

    .line 99
    .line 100
    iget-boolean v5, p0, Lfb/s2;->p:Z

    .line 101
    .line 102
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    new-instance v3, Lorg/json/JSONArray;

    .line 106
    .line 107
    iget-object v5, v0, Lfb/n2;->a:Ljava/util/List;

    .line 108
    .line 109
    invoke-direct {v3, v5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    const-string v5, "created"

    .line 113
    .line 114
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    new-instance v3, Lorg/json/JSONArray;

    .line 118
    .line 119
    iget-object v5, v0, Lfb/n2;->b:Ljava/util/List;

    .line 120
    .line 121
    invoke-direct {v3, v5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    const-string v5, "modified"

    .line 125
    .line 126
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    new-instance v3, Lorg/json/JSONArray;

    .line 130
    .line 131
    iget-object v0, v0, Lfb/n2;->c:Ljava/util/List;

    .line 132
    .line 133
    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    const-string v0, "deleted"

    .line 137
    .line 138
    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    const-string v0, "canApply"

    .line 142
    .line 143
    invoke-virtual {v2}, Lfb/z1;->a()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Lfb/z1;->b()Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v3, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_5

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Lfb/a0;

    .line 178
    .line 179
    iget-object v5, v5, Lfb/a0;->b:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_5
    new-instance v0, Lorg/json/JSONArray;

    .line 186
    .line 187
    invoke-direct {v0, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 188
    .line 189
    .line 190
    const-string v3, "errors"

    .line 191
    .line 192
    invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Lfb/z1;->c()Ljava/util/ArrayList;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    new-instance v2, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_6

    .line 217
    .line 218
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lfb/a0;

    .line 223
    .line 224
    iget-object v3, v3, Lfb/a0;->b:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_6
    new-instance v0, Lorg/json/JSONArray;

    .line 231
    .line 232
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 233
    .line 234
    .line 235
    const-string v2, "warnings"

    .line 236
    .line 237
    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    .line 239
    .line 240
    const-string v0, "requiresDiff"

    .line 241
    .line 242
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    return-object v0
.end method

.method public final K(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    const-string v0, "path"

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v2, v3}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0, v2, v3}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "content"

    .line 25
    .line 26
    invoke-virtual {p1, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v6, v5

    .line 43
    int-to-long v6, v6

    .line 44
    const-wide/32 v8, 0x200000

    .line 45
    .line 46
    .line 47
    cmp-long v6, v6, v8

    .line 48
    .line 49
    if-gtz v6, :cond_8

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_7

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    const-string v7, "overwrite"

    .line 64
    .line 65
    invoke-virtual {p1, v7, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string p1, "\u6587\u4ef6\u5df2\u5b58\u5728\uff1b\u5c40\u90e8\u4fee\u6539\u8bf7\u4f7f\u7528 apply_patch\uff0c\u5b8c\u6574\u8986\u76d6\u9700\u4f20 overwrite=true"

    .line 73
    .line 74
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    return-object p1

    .line 79
    :cond_1
    :goto_0
    array-length p1, v5

    .line 80
    int-to-long v7, p1

    .line 81
    new-instance p1, Ldg/j;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    iget-object v5, p0, Lfb/s2;->j:Ljava/io/File;

    .line 85
    .line 86
    sget-object v9, Ldg/k;->g:Ldg/k;

    .line 87
    .line 88
    invoke-direct {p1, v5, v9, v3}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lfb/l2;

    .line 92
    .line 93
    const/4 v5, 0x2

    .line 94
    invoke-direct {v3, v4, v5}, Lfb/l2;-><init>(Ljava/io/File;I)V

    .line 95
    .line 96
    .line 97
    new-instance v5, Lng/i;

    .line 98
    .line 99
    const/4 v9, 0x1

    .line 100
    invoke-direct {v5, p1, v9, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lng/h;

    .line 104
    .line 105
    invoke-direct {p1, v5}, Lng/h;-><init>(Lng/i;)V

    .line 106
    .line 107
    .line 108
    move v3, v9

    .line 109
    :goto_1
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Ljava/io/File;

    .line 120
    .line 121
    add-int/2addr v3, v9

    .line 122
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    add-long/2addr v7, v10

    .line 127
    const/16 v5, 0x200

    .line 128
    .line 129
    if-gt v3, v5, :cond_3

    .line 130
    .line 131
    const-wide/32 v10, 0x2000000

    .line 132
    .line 133
    .line 134
    cmp-long v5, v7, v10

    .line 135
    .line 136
    if-gtz v5, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const-string p1, "\u63d2\u4ef6\u603b\u5927\u5c0f\u8d85\u8fc7 32 MB"

    .line 140
    .line 141
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const/4 p1, 0x0

    .line 145
    return-object p1

    .line 146
    :cond_3
    const-string p1, "\u63d2\u4ef6\u6587\u4ef6\u6570\u91cf\u8d85\u8fc7 512"

    .line 147
    .line 148
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    return-object p1

    .line 153
    :cond_4
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_6

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_5

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    const-string p1, "\u521b\u5efa\u7236\u76ee\u5f55\u5931\u8d25"

    .line 173
    .line 174
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/4 p1, 0x0

    .line 178
    return-object p1

    .line 179
    :cond_6
    :goto_2
    invoke-static {v4, v1}, Lfb/t2;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    const-string v0, "created"

    .line 193
    .line 194
    xor-int/lit8 v1, v6, 0x1

    .line 195
    .line 196
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    const-string v0, "bytes"

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 202
    .line 203
    .line 204
    move-result-wide v1

    .line 205
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_7
    const-string p1, "\u76ee\u6807\u662f\u76ee\u5f55: "

    .line 217
    .line 218
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    const/4 p1, 0x0

    .line 226
    return-object p1

    .line 227
    :cond_8
    const-string p1, "\u5199\u5165\u5185\u5bb9\u8d85\u8fc7 2 MB"

    .line 228
    .line 229
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const/4 p1, 0x0

    .line 233
    return-object p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return v1

    .line 24
    :cond_0
    :try_start_1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 25
    .line 26
    iget-object v2, p0, Lfb/s2;->g:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    :cond_1
    move v1, v2

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Leb/c0;

    .line 60
    .line 61
    iget-object v4, v3, Leb/c0;->a:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v5, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    iget-object v4, v3, Leb/c0;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_4

    .line 78
    .line 79
    iget-object v3, v3, Leb/c0;->h:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    if-ne v3, v1, :cond_5

    .line 88
    .line 89
    :cond_4
    move v3, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    move v3, v2

    .line 92
    :goto_0
    if-eqz v3, :cond_3

    .line 93
    .line 94
    :goto_1
    monitor-exit p0

    .line 95
    return v1

    .line 96
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    throw p1
.end method

.method public final b(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 34

    .line 1
    invoke-virtual/range {p0 .. p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    const-string v0, "patch"

    .line 5
    .line 6
    const-string v9, ""

    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    invoke-virtual {v1, v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_67

    .line 22
    .line 23
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    invoke-virtual {v10, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    array-length v0, v0

    .line 33
    int-to-long v0, v0

    .line 34
    const-wide/32 v2, 0x400000

    .line 35
    .line 36
    .line 37
    cmp-long v0, v0, v2

    .line 38
    .line 39
    if-gtz v0, :cond_66

    .line 40
    .line 41
    sget-object v0, Lfb/y1;->a:Log/k;

    .line 42
    .line 43
    new-instance v0, Lc0/f;

    .line 44
    .line 45
    const-class v1, Lfb/s2;

    .line 46
    .line 47
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v7, 0x0

    .line 52
    const/16 v8, 0xe

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    const-string v4, "readPatchText"

    .line 56
    .line 57
    const-string v5, "readPatchText(Ljava/lang/String;)Ljava/lang/String;"

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    move-object/from16 v2, p0

    .line 61
    .line 62
    invoke-direct/range {v0 .. v8}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 63
    .line 64
    .line 65
    const-string v1, "\r\n"

    .line 66
    .line 67
    const-string v3, "\n"

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static {v10, v1, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const/16 v6, 0xd

    .line 75
    .line 76
    const/16 v7, 0xa

    .line 77
    .line 78
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const/4 v8, 0x1

    .line 86
    new-array v10, v8, [C

    .line 87
    .line 88
    aput-char v7, v10, v4

    .line 89
    .line 90
    invoke-static {v5, v10}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    new-array v10, v8, [C

    .line 95
    .line 96
    aput-char v7, v10, v4

    .line 97
    .line 98
    const/4 v12, 0x6

    .line 99
    invoke-static {v5, v10, v12}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v5}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const-string v13, "*** Begin Patch"

    .line 108
    .line 109
    invoke-static {v10, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_65

    .line 114
    .line 115
    invoke-static {v5}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    const-string v13, "*** End Patch"

    .line 120
    .line 121
    invoke-static {v10, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-eqz v10, :cond_64

    .line 126
    .line 127
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    move v14, v8

    .line 138
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    sub-int/2addr v15, v8

    .line 143
    if-ge v14, v15, :cond_49

    .line 144
    .line 145
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    check-cast v15, Ljava/lang/String;

    .line 150
    .line 151
    const-string v12, "*** Add File: "

    .line 152
    .line 153
    invoke-static {v15, v12, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 154
    .line 155
    .line 156
    move-result v16

    .line 157
    const/16 v6, 0x2b

    .line 158
    .line 159
    const-string v7, "*** "

    .line 160
    .line 161
    if-eqz v16, :cond_4

    .line 162
    .line 163
    invoke-static {v15, v12}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {v12, v4}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-static {v10, v0, v12}, Lfb/y1;->c(Ljava/util/LinkedHashMap;Lc0/f;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    if-nez v15, :cond_3

    .line 187
    .line 188
    add-int/lit8 v14, v14, 0x1

    .line 189
    .line 190
    new-instance v15, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v16

    .line 199
    const/16 v24, 0x0

    .line 200
    .line 201
    add-int/lit8 v11, v16, -0x1

    .line 202
    .line 203
    if-ge v14, v11, :cond_1

    .line 204
    .line 205
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    check-cast v11, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v11, v7, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-nez v11, :cond_1

    .line 216
    .line 217
    add-int/lit8 v11, v14, 0x1

    .line 218
    .line 219
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    check-cast v14, Ljava/lang/String;

    .line 224
    .line 225
    invoke-static {v14, v6}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    if-eqz v16, :cond_0

    .line 230
    .line 231
    invoke-virtual {v14, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move v14, v11

    .line 239
    goto :goto_1

    .line 240
    :cond_0
    const-string v0, "\u65b0\u589e\u6587\u4ef6\u5185\u5bb9\u6bcf\u884c\u5fc5\u987b\u4ee5 + \u5f00\u5934: "

    .line 241
    .line 242
    invoke-virtual {v0, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    return-object v24

    .line 250
    :cond_1
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_2

    .line 255
    .line 256
    move-object v6, v9

    .line 257
    goto :goto_2

    .line 258
    :cond_2
    const/16 v22, 0x0

    .line 259
    .line 260
    const/16 v23, 0x3a

    .line 261
    .line 262
    const-string v19, "\n"

    .line 263
    .line 264
    const/16 v20, 0x0

    .line 265
    .line 266
    const-string v21, "\n"

    .line 267
    .line 268
    move-object/from16 v18, v15

    .line 269
    .line 270
    invoke-static/range {v18 .. v23}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    :goto_2
    new-instance v7, Lfb/w1;

    .line 275
    .line 276
    const-string v11, "add"

    .line 277
    .line 278
    invoke-direct {v7, v12, v6, v11, v9}, Lfb/w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v10, v13, v7}, Lfb/y1;->d(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lfb/w1;)V

    .line 282
    .line 283
    .line 284
    :goto_3
    move-object/from16 v19, v0

    .line 285
    .line 286
    move-object/from16 v21, v1

    .line 287
    .line 288
    move-object/from16 v22, v3

    .line 289
    .line 290
    move-object/from16 v32, v5

    .line 291
    .line 292
    move-object v3, v9

    .line 293
    move-object v1, v10

    .line 294
    goto/16 :goto_2a

    .line 295
    .line 296
    :cond_3
    const/16 v24, 0x0

    .line 297
    .line 298
    const-string v0, "\u65b0\u589e\u6587\u4ef6\u5df2\u5b58\u5728: "

    .line 299
    .line 300
    invoke-virtual {v0, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    return-object v24

    .line 308
    :cond_4
    const/16 v24, 0x0

    .line 309
    .line 310
    const-string v11, "*** Delete File: "

    .line 311
    .line 312
    invoke-static {v15, v11, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 313
    .line 314
    .line 315
    move-result v12

    .line 316
    if-eqz v12, :cond_6

    .line 317
    .line 318
    invoke-static {v15, v11}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-static {v6, v4}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-static {v10, v0, v6}, Lfb/y1;->c(Ljava/util/LinkedHashMap;Lc0/f;Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    if-eqz v7, :cond_5

    .line 342
    .line 343
    new-instance v7, Lfb/w1;

    .line 344
    .line 345
    const-string v11, "delete"

    .line 346
    .line 347
    move-object/from16 v12, v24

    .line 348
    .line 349
    invoke-direct {v7, v6, v12, v11, v9}, Lfb/w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v10, v13, v7}, Lfb/y1;->d(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lfb/w1;)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v14, v14, 0x1

    .line 356
    .line 357
    goto :goto_3

    .line 358
    :cond_5
    move-object/from16 v12, v24

    .line 359
    .line 360
    const-string v0, "\u5220\u9664\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 361
    .line 362
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    return-object v12

    .line 370
    :cond_6
    const-string v11, "*** Update File: "

    .line 371
    .line 372
    invoke-static {v15, v11, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    if-eqz v12, :cond_47

    .line 377
    .line 378
    invoke-static {v15, v11}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-static {v11, v4}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    invoke-static {v10, v0, v11}, Lfb/y1;->c(Ljava/util/LinkedHashMap;Lc0/f;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    if-eqz v12, :cond_46

    .line 402
    .line 403
    add-int/lit8 v15, v14, 0x1

    .line 404
    .line 405
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 406
    .line 407
    .line 408
    move-result v16

    .line 409
    add-int/lit8 v6, v16, -0x1

    .line 410
    .line 411
    if-ge v15, v6, :cond_9

    .line 412
    .line 413
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    check-cast v6, Ljava/lang/String;

    .line 418
    .line 419
    move/from16 v16, v8

    .line 420
    .line 421
    const-string v8, "*** Move to: "

    .line 422
    .line 423
    invoke-static {v6, v8, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    if-eqz v6, :cond_a

    .line 428
    .line 429
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    check-cast v6, Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v6, v8}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-static {v6, v4}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-virtual {v6, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v8

    .line 458
    if-nez v8, :cond_8

    .line 459
    .line 460
    invoke-static {v10, v0, v6}, Lfb/y1;->c(Ljava/util/LinkedHashMap;Lc0/f;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    if-nez v8, :cond_7

    .line 465
    .line 466
    add-int/lit8 v15, v14, 0x2

    .line 467
    .line 468
    goto :goto_4

    .line 469
    :cond_7
    const-string v0, "\u79fb\u52a8\u76ee\u6807\u5df2\u5b58\u5728: "

    .line 470
    .line 471
    invoke-static {v6, v0}, Lj8/o;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    const/16 v24, 0x0

    .line 475
    .line 476
    return-object v24

    .line 477
    :cond_8
    const/16 v24, 0x0

    .line 478
    .line 479
    const-string v0, "\u79fb\u52a8\u76ee\u6807\u4e0e\u6e90\u6587\u4ef6\u76f8\u540c: "

    .line 480
    .line 481
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    return-object v24

    .line 489
    :cond_9
    move/from16 v16, v8

    .line 490
    .line 491
    :cond_a
    move-object v6, v11

    .line 492
    :goto_4
    new-instance v8, Ljava/util/ArrayList;

    .line 493
    .line 494
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    :goto_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 499
    .line 500
    .line 501
    move-result v19

    .line 502
    add-int/lit8 v4, v19, -0x1

    .line 503
    .line 504
    if-ge v15, v4, :cond_17

    .line 505
    .line 506
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    check-cast v4, Ljava/lang/String;

    .line 511
    .line 512
    move-object/from16 v19, v0

    .line 513
    .line 514
    const/4 v0, 0x0

    .line 515
    invoke-static {v4, v7, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    const-string v0, "*** End of File"

    .line 520
    .line 521
    if-eqz v4, :cond_c

    .line 522
    .line 523
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-eqz v4, :cond_b

    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_b
    :goto_6
    move-object/from16 v23, v9

    .line 535
    .line 536
    move-object/from16 v25, v10

    .line 537
    .line 538
    move-object/from16 v22, v14

    .line 539
    .line 540
    goto/16 :goto_e

    .line 541
    .line 542
    :cond_c
    :goto_7
    add-int/lit8 v4, v15, 0x1

    .line 543
    .line 544
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v15

    .line 548
    check-cast v15, Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v15, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v21

    .line 554
    if-eqz v21, :cond_d

    .line 555
    .line 556
    move v15, v4

    .line 557
    move-object/from16 v23, v9

    .line 558
    .line 559
    move-object/from16 v25, v10

    .line 560
    .line 561
    move-object/from16 v22, v14

    .line 562
    .line 563
    move/from16 v0, v16

    .line 564
    .line 565
    goto/16 :goto_f

    .line 566
    .line 567
    :cond_d
    move/from16 v21, v4

    .line 568
    .line 569
    const-string v4, "@@"

    .line 570
    .line 571
    move-object/from16 v22, v14

    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    invoke-static {v15, v4, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 575
    .line 576
    .line 577
    move-result v23

    .line 578
    if-eqz v23, :cond_15

    .line 579
    .line 580
    sget-object v14, Lfb/y1;->a:Log/k;

    .line 581
    .line 582
    iget-object v14, v14, Log/k;->g:Ljava/util/regex/Pattern;

    .line 583
    .line 584
    invoke-virtual {v14, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 585
    .line 586
    .line 587
    move-result-object v14

    .line 588
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 592
    .line 593
    .line 594
    move-result v23

    .line 595
    if-nez v23, :cond_e

    .line 596
    .line 597
    const/4 v2, 0x0

    .line 598
    goto :goto_8

    .line 599
    :cond_e
    new-instance v2, Log/i;

    .line 600
    .line 601
    invoke-direct {v2, v14, v15}, Log/i;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    .line 604
    :goto_8
    if-eqz v2, :cond_f

    .line 605
    .line 606
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    move/from16 v14, v16

    .line 611
    .line 612
    invoke-static {v14, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    check-cast v2, Ljava/lang/String;

    .line 617
    .line 618
    if-eqz v2, :cond_f

    .line 619
    .line 620
    const/16 v14, 0xa

    .line 621
    .line 622
    invoke-static {v14, v2}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    goto :goto_9

    .line 627
    :cond_f
    const/4 v2, 0x0

    .line 628
    :goto_9
    new-instance v14, Ljava/util/ArrayList;

    .line 629
    .line 630
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 631
    .line 632
    .line 633
    move/from16 v15, v21

    .line 634
    .line 635
    :goto_a
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 636
    .line 637
    .line 638
    move-result v21

    .line 639
    move-object/from16 v23, v9

    .line 640
    .line 641
    const/16 v16, 0x1

    .line 642
    .line 643
    add-int/lit8 v9, v21, -0x1

    .line 644
    .line 645
    if-ge v15, v9, :cond_12

    .line 646
    .line 647
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    check-cast v9, Ljava/lang/String;

    .line 652
    .line 653
    move-object/from16 v25, v10

    .line 654
    .line 655
    const/4 v10, 0x0

    .line 656
    invoke-static {v9, v4, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 657
    .line 658
    .line 659
    move-result v9

    .line 660
    if-nez v9, :cond_13

    .line 661
    .line 662
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v9

    .line 666
    check-cast v9, Ljava/lang/String;

    .line 667
    .line 668
    invoke-static {v9, v7, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    if-eqz v9, :cond_10

    .line 673
    .line 674
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v9

    .line 678
    invoke-static {v9, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v9

    .line 682
    if-eqz v9, :cond_13

    .line 683
    .line 684
    :cond_10
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v9

    .line 688
    invoke-static {v9, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    if-eqz v9, :cond_11

    .line 693
    .line 694
    add-int/lit8 v15, v15, 0x1

    .line 695
    .line 696
    const/4 v0, 0x1

    .line 697
    goto :goto_b

    .line 698
    :cond_11
    add-int/lit8 v9, v15, 0x1

    .line 699
    .line 700
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v10

    .line 704
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move v15, v9

    .line 708
    move-object/from16 v9, v23

    .line 709
    .line 710
    move-object/from16 v10, v25

    .line 711
    .line 712
    goto :goto_a

    .line 713
    :cond_12
    move-object/from16 v25, v10

    .line 714
    .line 715
    :cond_13
    const/4 v0, 0x0

    .line 716
    :goto_b
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    if-nez v4, :cond_14

    .line 721
    .line 722
    invoke-static {v11, v14}, Lfb/y1;->e(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 723
    .line 724
    .line 725
    new-instance v4, Lfb/x1;

    .line 726
    .line 727
    invoke-direct {v4, v2, v14, v0}, Lfb/x1;-><init>(Ljava/lang/Integer;Ljava/util/ArrayList;Z)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-object/from16 v14, v22

    .line 734
    .line 735
    goto :goto_d

    .line 736
    :cond_14
    const-string v0, "\u8865\u4e01\u533a\u5757\u4e0d\u80fd\u4e3a\u7a7a: "

    .line 737
    .line 738
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    const/16 v24, 0x0

    .line 746
    .line 747
    return-object v24

    .line 748
    :cond_15
    move-object/from16 v23, v9

    .line 749
    .line 750
    move-object/from16 v25, v10

    .line 751
    .line 752
    if-nez v22, :cond_16

    .line 753
    .line 754
    new-instance v14, Ljava/util/ArrayList;

    .line 755
    .line 756
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 757
    .line 758
    .line 759
    goto :goto_c

    .line 760
    :cond_16
    move-object/from16 v14, v22

    .line 761
    .line 762
    :goto_c
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move/from16 v15, v21

    .line 766
    .line 767
    :goto_d
    move-object/from16 v0, v19

    .line 768
    .line 769
    move-object/from16 v9, v23

    .line 770
    .line 771
    move-object/from16 v10, v25

    .line 772
    .line 773
    const/4 v4, 0x0

    .line 774
    const/16 v16, 0x1

    .line 775
    .line 776
    goto/16 :goto_5

    .line 777
    .line 778
    :cond_17
    move-object/from16 v19, v0

    .line 779
    .line 780
    goto/16 :goto_6

    .line 781
    .line 782
    :goto_e
    const/4 v0, 0x0

    .line 783
    :goto_f
    if-eqz v22, :cond_1a

    .line 784
    .line 785
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-nez v2, :cond_18

    .line 790
    .line 791
    move-object/from16 v2, v22

    .line 792
    .line 793
    goto :goto_10

    .line 794
    :cond_18
    const/4 v2, 0x0

    .line 795
    :goto_10
    if-eqz v2, :cond_1a

    .line 796
    .line 797
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 798
    .line 799
    .line 800
    move-result v4

    .line 801
    if-eqz v4, :cond_19

    .line 802
    .line 803
    invoke-static {v11, v2}, Lfb/y1;->e(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 804
    .line 805
    .line 806
    new-instance v4, Lfb/x1;

    .line 807
    .line 808
    const/4 v7, 0x0

    .line 809
    invoke-direct {v4, v7, v2, v0}, Lfb/x1;-><init>(Ljava/lang/Integer;Ljava/util/ArrayList;Z)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    goto :goto_11

    .line 816
    :cond_19
    const/4 v7, 0x0

    .line 817
    const-string v0, "\u5e26 @@ \u7684\u8865\u4e01\u4e0d\u80fd\u6df7\u7528\u65e0\u6807\u9898\u533a\u5757: "

    .line 818
    .line 819
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    return-object v7

    .line 827
    :cond_1a
    :goto_11
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 828
    .line 829
    .line 830
    move-result v0

    .line 831
    if-eqz v0, :cond_1c

    .line 832
    .line 833
    invoke-virtual {v6, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-nez v0, :cond_1b

    .line 838
    .line 839
    goto :goto_12

    .line 840
    :cond_1b
    const-string v0, "\u66f4\u65b0\u6587\u4ef6\u7f3a\u5c11\u8865\u4e01\u533a\u5757: "

    .line 841
    .line 842
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    const/16 v24, 0x0

    .line 850
    .line 851
    return-object v24

    .line 852
    :cond_1c
    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    if-eqz v0, :cond_1d

    .line 857
    .line 858
    move-object/from16 v21, v1

    .line 859
    .line 860
    move-object/from16 v22, v3

    .line 861
    .line 862
    move-object/from16 v32, v5

    .line 863
    .line 864
    goto/16 :goto_28

    .line 865
    .line 866
    :cond_1d
    const/4 v14, 0x0

    .line 867
    invoke-static {v12, v1, v14}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    if-eqz v0, :cond_1e

    .line 872
    .line 873
    move-object/from16 v27, v1

    .line 874
    .line 875
    goto :goto_13

    .line 876
    :cond_1e
    move-object/from16 v27, v3

    .line 877
    .line 878
    :goto_13
    invoke-static {v12, v1, v3, v14}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    const/16 v2, 0xd

    .line 883
    .line 884
    const/16 v4, 0xa

    .line 885
    .line 886
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    invoke-static {v0, v4}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 894
    .line 895
    .line 896
    move-result v7

    .line 897
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 898
    .line 899
    .line 900
    move-result v9

    .line 901
    if-nez v9, :cond_1f

    .line 902
    .line 903
    new-instance v0, Ljava/util/ArrayList;

    .line 904
    .line 905
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 906
    .line 907
    .line 908
    const/4 v10, 0x6

    .line 909
    goto :goto_15

    .line 910
    :cond_1f
    if-eqz v7, :cond_20

    .line 911
    .line 912
    const/4 v14, 0x1

    .line 913
    invoke-static {v14, v0}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    new-array v9, v14, [C

    .line 918
    .line 919
    const/16 v20, 0x0

    .line 920
    .line 921
    aput-char v4, v9, v20

    .line 922
    .line 923
    const/4 v10, 0x6

    .line 924
    invoke-static {v0, v9, v10}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    new-instance v9, Ljava/util/ArrayList;

    .line 929
    .line 930
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 931
    .line 932
    .line 933
    :goto_14
    move-object v0, v9

    .line 934
    goto :goto_15

    .line 935
    :cond_20
    const/4 v10, 0x6

    .line 936
    const/4 v14, 0x1

    .line 937
    const/16 v20, 0x0

    .line 938
    .line 939
    new-array v9, v14, [C

    .line 940
    .line 941
    aput-char v4, v9, v20

    .line 942
    .line 943
    invoke-static {v0, v9, v10}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    new-instance v9, Ljava/util/ArrayList;

    .line 948
    .line 949
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 950
    .line 951
    .line 952
    goto :goto_14

    .line 953
    :goto_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 954
    .line 955
    .line 956
    move-result-object v8

    .line 957
    const/4 v9, 0x0

    .line 958
    const/4 v12, 0x0

    .line 959
    const/4 v14, 0x0

    .line 960
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 961
    .line 962
    .line 963
    move-result v17

    .line 964
    if-eqz v17, :cond_42

    .line 965
    .line 966
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v17

    .line 970
    add-int/lit8 v2, v9, 0x1

    .line 971
    .line 972
    if-ltz v9, :cond_41

    .line 973
    .line 974
    move-object/from16 v9, v17

    .line 975
    .line 976
    check-cast v9, Lfb/x1;

    .line 977
    .line 978
    iget-object v4, v9, Lfb/x1;->b:Ljava/util/ArrayList;

    .line 979
    .line 980
    iget-boolean v10, v9, Lfb/x1;->c:Z

    .line 981
    .line 982
    move-object/from16 v21, v1

    .line 983
    .line 984
    new-instance v1, Ljava/util/ArrayList;

    .line 985
    .line 986
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 987
    .line 988
    .line 989
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 994
    .line 995
    .line 996
    move-result v22

    .line 997
    if-eqz v22, :cond_23

    .line 998
    .line 999
    move-object/from16 v22, v3

    .line 1000
    .line 1001
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    move-object/from16 v26, v4

    .line 1006
    .line 1007
    move-object v4, v3

    .line 1008
    check-cast v4, Ljava/lang/String;

    .line 1009
    .line 1010
    move-object/from16 v32, v5

    .line 1011
    .line 1012
    const/16 v5, 0x2b

    .line 1013
    .line 1014
    invoke-static {v4, v5}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v28

    .line 1018
    if-nez v28, :cond_22

    .line 1019
    .line 1020
    const-string v5, "\\ "

    .line 1021
    .line 1022
    move/from16 v33, v7

    .line 1023
    .line 1024
    const/4 v7, 0x0

    .line 1025
    invoke-static {v4, v5, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    if-eqz v4, :cond_21

    .line 1030
    .line 1031
    goto :goto_18

    .line 1032
    :cond_21
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    :goto_18
    move-object/from16 v3, v22

    .line 1036
    .line 1037
    move-object/from16 v4, v26

    .line 1038
    .line 1039
    move-object/from16 v5, v32

    .line 1040
    .line 1041
    move/from16 v7, v33

    .line 1042
    .line 1043
    goto :goto_17

    .line 1044
    :cond_22
    move/from16 v33, v7

    .line 1045
    .line 1046
    goto :goto_18

    .line 1047
    :cond_23
    move-object/from16 v22, v3

    .line 1048
    .line 1049
    move-object/from16 v32, v5

    .line 1050
    .line 1051
    move/from16 v33, v7

    .line 1052
    .line 1053
    new-instance v3, Ljava/util/ArrayList;

    .line 1054
    .line 1055
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1056
    .line 1057
    .line 1058
    move-result v4

    .line 1059
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v4

    .line 1070
    if-eqz v4, :cond_24

    .line 1071
    .line 1072
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v4

    .line 1076
    check-cast v4, Ljava/lang/String;

    .line 1077
    .line 1078
    const/4 v5, 0x1

    .line 1079
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v4

    .line 1083
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    goto :goto_19

    .line 1087
    :cond_24
    const/4 v5, 0x1

    .line 1088
    iget-object v1, v9, Lfb/x1;->a:Ljava/lang/Integer;

    .line 1089
    .line 1090
    if-eqz v1, :cond_26

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1093
    .line 1094
    .line 1095
    move-result v1

    .line 1096
    sub-int/2addr v1, v5

    .line 1097
    add-int/2addr v1, v14

    .line 1098
    if-gez v1, :cond_25

    .line 1099
    .line 1100
    const/4 v1, 0x0

    .line 1101
    :cond_25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v1

    .line 1105
    goto :goto_1a

    .line 1106
    :cond_26
    const/4 v1, 0x0

    .line 1107
    :goto_1a
    if-eqz v10, :cond_27

    .line 1108
    .line 1109
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v4

    .line 1113
    if-eqz v4, :cond_27

    .line 1114
    .line 1115
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    goto/16 :goto_23

    .line 1120
    .line 1121
    :cond_27
    const/4 v4, -0x1

    .line 1122
    if-eqz v10, :cond_2b

    .line 1123
    .line 1124
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1129
    .line 1130
    .line 1131
    move-result v5

    .line 1132
    sub-int/2addr v1, v5

    .line 1133
    invoke-static {v0, v3, v1}, Lfb/y1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v5

    .line 1137
    if-eqz v5, :cond_28

    .line 1138
    .line 1139
    goto/16 :goto_23

    .line 1140
    .line 1141
    :cond_28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v5

    .line 1145
    if-ltz v1, :cond_29

    .line 1146
    .line 1147
    invoke-static {v0, v3, v1}, Lfb/y1;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v1

    .line 1151
    if-eqz v1, :cond_29

    .line 1152
    .line 1153
    goto :goto_1b

    .line 1154
    :cond_29
    const/4 v5, 0x0

    .line 1155
    :goto_1b
    if-eqz v5, :cond_2a

    .line 1156
    .line 1157
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1158
    .line 1159
    .line 1160
    move-result v1

    .line 1161
    goto/16 :goto_23

    .line 1162
    .line 1163
    :cond_2a
    :goto_1c
    move v1, v4

    .line 1164
    goto/16 :goto_23

    .line 1165
    .line 1166
    :cond_2b
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v5

    .line 1170
    if-eqz v5, :cond_2e

    .line 1171
    .line 1172
    if-eqz v1, :cond_2c

    .line 1173
    .line 1174
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1175
    .line 1176
    .line 1177
    move-result v1

    .line 1178
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1179
    .line 1180
    .line 1181
    move-result v4

    .line 1182
    if-le v1, v4, :cond_3a

    .line 1183
    .line 1184
    goto :goto_1c

    .line 1185
    :cond_2c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1186
    .line 1187
    .line 1188
    move-result v1

    .line 1189
    if-le v12, v1, :cond_2d

    .line 1190
    .line 1191
    move v12, v1

    .line 1192
    :cond_2d
    move v1, v12

    .line 1193
    goto/16 :goto_23

    .line 1194
    .line 1195
    :cond_2e
    if-eqz v1, :cond_2f

    .line 1196
    .line 1197
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1198
    .line 1199
    .line 1200
    move-result v5

    .line 1201
    invoke-static {v0, v3, v5}, Lfb/y1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v5

    .line 1205
    if-eqz v5, :cond_2f

    .line 1206
    .line 1207
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1208
    .line 1209
    .line 1210
    move-result v1

    .line 1211
    goto :goto_23

    .line 1212
    :cond_2f
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v1

    .line 1216
    if-eqz v1, :cond_30

    .line 1217
    .line 1218
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    const/4 v7, 0x0

    .line 1223
    invoke-static {v12, v7, v1}, Lr9/e0;->r(III)I

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    goto :goto_23

    .line 1228
    :cond_30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1229
    .line 1230
    .line 1231
    move-result v1

    .line 1232
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1233
    .line 1234
    .line 1235
    move-result v5

    .line 1236
    sub-int/2addr v1, v5

    .line 1237
    if-gez v1, :cond_31

    .line 1238
    .line 1239
    goto :goto_1c

    .line 1240
    :cond_31
    if-gez v12, :cond_32

    .line 1241
    .line 1242
    const/4 v5, 0x0

    .line 1243
    goto :goto_1d

    .line 1244
    :cond_32
    move v5, v12

    .line 1245
    :goto_1d
    if-gt v5, v1, :cond_35

    .line 1246
    .line 1247
    :goto_1e
    invoke-static {v0, v3, v5}, Lfb/y1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v7

    .line 1251
    if-eqz v7, :cond_33

    .line 1252
    .line 1253
    :goto_1f
    move v1, v5

    .line 1254
    goto :goto_23

    .line 1255
    :cond_33
    if-ne v5, v1, :cond_34

    .line 1256
    .line 1257
    goto :goto_20

    .line 1258
    :cond_34
    add-int/lit8 v5, v5, 0x1

    .line 1259
    .line 1260
    goto :goto_1e

    .line 1261
    :cond_35
    :goto_20
    if-gez v12, :cond_36

    .line 1262
    .line 1263
    const/4 v12, 0x0

    .line 1264
    :cond_36
    if-gt v12, v1, :cond_2a

    .line 1265
    .line 1266
    move v5, v4

    .line 1267
    :goto_21
    invoke-static {v0, v3, v12}, Lfb/y1;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v7

    .line 1271
    if-nez v7, :cond_37

    .line 1272
    .line 1273
    goto :goto_22

    .line 1274
    :cond_37
    if-ltz v5, :cond_38

    .line 1275
    .line 1276
    goto :goto_1c

    .line 1277
    :cond_38
    move v5, v12

    .line 1278
    :goto_22
    if-ne v12, v1, :cond_39

    .line 1279
    .line 1280
    goto :goto_1f

    .line 1281
    :cond_39
    add-int/lit8 v12, v12, 0x1

    .line 1282
    .line 1283
    goto :goto_21

    .line 1284
    :cond_3a
    :goto_23
    if-ltz v1, :cond_40

    .line 1285
    .line 1286
    iget-object v4, v9, Lfb/x1;->b:Ljava/util/ArrayList;

    .line 1287
    .line 1288
    new-instance v5, Ljava/util/ArrayList;

    .line 1289
    .line 1290
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1291
    .line 1292
    .line 1293
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v4

    .line 1297
    const/4 v7, 0x0

    .line 1298
    :cond_3b
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v9

    .line 1302
    if-eqz v9, :cond_3e

    .line 1303
    .line 1304
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v9

    .line 1308
    check-cast v9, Ljava/lang/String;

    .line 1309
    .line 1310
    const/16 v10, 0x20

    .line 1311
    .line 1312
    invoke-static {v9, v10}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v10

    .line 1316
    if-eqz v10, :cond_3c

    .line 1317
    .line 1318
    add-int v9, v1, v7

    .line 1319
    .line 1320
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v9

    .line 1324
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1325
    .line 1326
    .line 1327
    :goto_25
    add-int/lit8 v7, v7, 0x1

    .line 1328
    .line 1329
    const/16 v10, 0x2b

    .line 1330
    .line 1331
    goto :goto_24

    .line 1332
    :cond_3c
    const/16 v10, 0x2d

    .line 1333
    .line 1334
    invoke-static {v9, v10}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v10

    .line 1338
    if-eqz v10, :cond_3d

    .line 1339
    .line 1340
    goto :goto_25

    .line 1341
    :cond_3d
    const/16 v10, 0x2b

    .line 1342
    .line 1343
    invoke-static {v9, v10}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v12

    .line 1347
    if-eqz v12, :cond_3b

    .line 1348
    .line 1349
    const/4 v12, 0x1

    .line 1350
    invoke-virtual {v9, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v9

    .line 1354
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    goto :goto_24

    .line 1358
    :cond_3e
    const/16 v10, 0x2b

    .line 1359
    .line 1360
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1361
    .line 1362
    .line 1363
    move-result v4

    .line 1364
    const/4 v7, 0x0

    .line 1365
    :goto_26
    if-ge v7, v4, :cond_3f

    .line 1366
    .line 1367
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    add-int/lit8 v7, v7, 0x1

    .line 1371
    .line 1372
    goto :goto_26

    .line 1373
    :cond_3f
    invoke-interface {v0, v1, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1377
    .line 1378
    .line 1379
    move-result v4

    .line 1380
    add-int v12, v4, v1

    .line 1381
    .line 1382
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1383
    .line 1384
    .line 1385
    move-result v1

    .line 1386
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1387
    .line 1388
    .line 1389
    move-result v3

    .line 1390
    sub-int/2addr v1, v3

    .line 1391
    add-int/2addr v14, v1

    .line 1392
    move v9, v2

    .line 1393
    move-object/from16 v1, v21

    .line 1394
    .line 1395
    move-object/from16 v3, v22

    .line 1396
    .line 1397
    move-object/from16 v5, v32

    .line 1398
    .line 1399
    move/from16 v7, v33

    .line 1400
    .line 1401
    const/16 v2, 0xd

    .line 1402
    .line 1403
    const/16 v4, 0xa

    .line 1404
    .line 1405
    const/4 v10, 0x6

    .line 1406
    goto/16 :goto_16

    .line 1407
    .line 1408
    :cond_40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1409
    .line 1410
    const-string v1, "\u7b2c "

    .line 1411
    .line 1412
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    const-string v1, " \u4e2a\u8865\u4e01\u533a\u5757\u5728 "

    .line 1419
    .line 1420
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1424
    .line 1425
    .line 1426
    const-string v1, " \u4e2d\u627e\u4e0d\u5230\u5339\u914d\u4e0a\u4e0b\u6587\uff0c\u8bf7\u91cd\u65b0\u8bfb\u53d6\u6587\u4ef6"

    .line 1427
    .line 1428
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1436
    .line 1437
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1442
    .line 1443
    .line 1444
    throw v1

    .line 1445
    :cond_41
    invoke-static {}, La/a;->Q0()V

    .line 1446
    .line 1447
    .line 1448
    const/16 v24, 0x0

    .line 1449
    .line 1450
    throw v24

    .line 1451
    :cond_42
    move-object/from16 v21, v1

    .line 1452
    .line 1453
    move-object/from16 v22, v3

    .line 1454
    .line 1455
    move-object/from16 v32, v5

    .line 1456
    .line 1457
    move/from16 v33, v7

    .line 1458
    .line 1459
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1460
    .line 1461
    .line 1462
    move-result v1

    .line 1463
    if-eqz v1, :cond_43

    .line 1464
    .line 1465
    move-object/from16 v12, v23

    .line 1466
    .line 1467
    goto :goto_28

    .line 1468
    :cond_43
    const/16 v30, 0x0

    .line 1469
    .line 1470
    const/16 v31, 0x3e

    .line 1471
    .line 1472
    const/16 v28, 0x0

    .line 1473
    .line 1474
    const/16 v29, 0x0

    .line 1475
    .line 1476
    move-object/from16 v26, v0

    .line 1477
    .line 1478
    invoke-static/range {v26 .. v31}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    if-eqz v33, :cond_44

    .line 1483
    .line 1484
    move-object/from16 v1, v27

    .line 1485
    .line 1486
    goto :goto_27

    .line 1487
    :cond_44
    move-object/from16 v1, v23

    .line 1488
    .line 1489
    :goto_27
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    move-object v12, v0

    .line 1494
    :goto_28
    invoke-virtual {v6, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-nez v0, :cond_45

    .line 1499
    .line 1500
    new-instance v0, Lfb/w1;

    .line 1501
    .line 1502
    const-string v1, "move-source"

    .line 1503
    .line 1504
    const/4 v7, 0x0

    .line 1505
    invoke-direct {v0, v11, v7, v1, v11}, Lfb/w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1506
    .line 1507
    .line 1508
    move-object/from16 v1, v25

    .line 1509
    .line 1510
    invoke-static {v1, v13, v0}, Lfb/y1;->d(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lfb/w1;)V

    .line 1511
    .line 1512
    .line 1513
    new-instance v0, Lfb/w1;

    .line 1514
    .line 1515
    const-string v2, "move"

    .line 1516
    .line 1517
    invoke-direct {v0, v6, v12, v2, v11}, Lfb/w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-static {v1, v13, v0}, Lfb/y1;->d(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lfb/w1;)V

    .line 1521
    .line 1522
    .line 1523
    move-object/from16 v3, v23

    .line 1524
    .line 1525
    goto :goto_29

    .line 1526
    :cond_45
    move-object/from16 v1, v25

    .line 1527
    .line 1528
    new-instance v0, Lfb/w1;

    .line 1529
    .line 1530
    const-string v2, "update"

    .line 1531
    .line 1532
    move-object/from16 v3, v23

    .line 1533
    .line 1534
    invoke-direct {v0, v11, v12, v2, v3}, Lfb/w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1535
    .line 1536
    .line 1537
    invoke-static {v1, v13, v0}, Lfb/y1;->d(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lfb/w1;)V

    .line 1538
    .line 1539
    .line 1540
    :goto_29
    move v14, v15

    .line 1541
    goto :goto_2a

    .line 1542
    :cond_46
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1543
    .line 1544
    const-string v1, "\u66f4\u65b0\u6587\u4ef6\u4e0d\u5b58\u5728: "

    .line 1545
    .line 1546
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v1

    .line 1550
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v1

    .line 1554
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1555
    .line 1556
    .line 1557
    throw v0

    .line 1558
    :cond_47
    move-object/from16 v19, v0

    .line 1559
    .line 1560
    move-object/from16 v21, v1

    .line 1561
    .line 1562
    move-object/from16 v22, v3

    .line 1563
    .line 1564
    move-object/from16 v32, v5

    .line 1565
    .line 1566
    move-object v3, v9

    .line 1567
    move-object v1, v10

    .line 1568
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1569
    .line 1570
    .line 1571
    move-result v0

    .line 1572
    if-eqz v0, :cond_48

    .line 1573
    .line 1574
    add-int/lit8 v14, v14, 0x1

    .line 1575
    .line 1576
    :goto_2a
    move-object v10, v1

    .line 1577
    move-object v9, v3

    .line 1578
    move-object/from16 v0, v19

    .line 1579
    .line 1580
    move-object/from16 v1, v21

    .line 1581
    .line 1582
    move-object/from16 v3, v22

    .line 1583
    .line 1584
    move-object/from16 v5, v32

    .line 1585
    .line 1586
    const/4 v4, 0x0

    .line 1587
    const/16 v6, 0xd

    .line 1588
    .line 1589
    const/16 v7, 0xa

    .line 1590
    .line 1591
    const/4 v8, 0x1

    .line 1592
    const/4 v12, 0x6

    .line 1593
    goto/16 :goto_0

    .line 1594
    .line 1595
    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1596
    .line 1597
    const-string v1, "\u672a\u77e5\u8865\u4e01\u6307\u4ee4: "

    .line 1598
    .line 1599
    invoke-virtual {v1, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v1

    .line 1607
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    throw v0

    .line 1611
    :cond_49
    move-object v3, v9

    .line 1612
    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v0

    .line 1616
    if-nez v0, :cond_63

    .line 1617
    .line 1618
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    check-cast v0, Ljava/lang/Iterable;

    .line 1626
    .line 1627
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1632
    .line 1633
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1634
    .line 1635
    .line 1636
    new-instance v2, Ldg/j;

    .line 1637
    .line 1638
    move-object/from16 v4, p0

    .line 1639
    .line 1640
    iget-object v5, v4, Lfb/s2;->j:Ljava/io/File;

    .line 1641
    .line 1642
    sget-object v6, Ldg/k;->g:Ldg/k;

    .line 1643
    .line 1644
    const/4 v7, 0x0

    .line 1645
    invoke-direct {v2, v5, v6, v7}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 1646
    .line 1647
    .line 1648
    new-instance v6, Lfb/g0;

    .line 1649
    .line 1650
    const/16 v7, 0x1c

    .line 1651
    .line 1652
    invoke-direct {v6, v7}, Lfb/g0;-><init>(I)V

    .line 1653
    .line 1654
    .line 1655
    new-instance v7, Lng/i;

    .line 1656
    .line 1657
    const/4 v14, 0x1

    .line 1658
    invoke-direct {v7, v2, v14, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1659
    .line 1660
    .line 1661
    new-instance v2, Lng/h;

    .line 1662
    .line 1663
    invoke-direct {v2, v7}, Lng/h;-><init>(Lng/i;)V

    .line 1664
    .line 1665
    .line 1666
    :goto_2b
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 1667
    .line 1668
    .line 1669
    move-result v6

    .line 1670
    if-eqz v6, :cond_4a

    .line 1671
    .line 1672
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v6

    .line 1676
    check-cast v6, Ljava/io/File;

    .line 1677
    .line 1678
    invoke-static {v6, v5}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v7

    .line 1682
    invoke-static {v7}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v7

    .line 1686
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 1687
    .line 1688
    .line 1689
    move-result-wide v8

    .line 1690
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v6

    .line 1694
    invoke-interface {v1, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    goto :goto_2b

    .line 1698
    :cond_4a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v2

    .line 1702
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1703
    .line 1704
    .line 1705
    move-result v5

    .line 1706
    if-eqz v5, :cond_4d

    .line 1707
    .line 1708
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v5

    .line 1712
    check-cast v5, Lfb/w1;

    .line 1713
    .line 1714
    iget-object v6, v5, Lfb/w1;->b:Ljava/lang/String;

    .line 1715
    .line 1716
    iget-object v5, v5, Lfb/w1;->a:Ljava/lang/String;

    .line 1717
    .line 1718
    if-nez v6, :cond_4b

    .line 1719
    .line 1720
    invoke-virtual {v1, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    goto :goto_2c

    .line 1724
    :cond_4b
    sget-object v7, Log/a;->a:Ljava/nio/charset/Charset;

    .line 1725
    .line 1726
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1727
    .line 1728
    .line 1729
    move-result-object v6

    .line 1730
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1731
    .line 1732
    .line 1733
    array-length v6, v6

    .line 1734
    int-to-long v6, v6

    .line 1735
    const-wide/32 v8, 0x200000

    .line 1736
    .line 1737
    .line 1738
    cmp-long v8, v6, v8

    .line 1739
    .line 1740
    if-gtz v8, :cond_4c

    .line 1741
    .line 1742
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v6

    .line 1746
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    goto :goto_2c

    .line 1750
    :cond_4c
    const-string v0, " \u8d85\u8fc7 2 MB"

    .line 1751
    .line 1752
    invoke-static {v5, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 1757
    .line 1758
    .line 1759
    const/16 v24, 0x0

    .line 1760
    .line 1761
    return-object v24

    .line 1762
    :cond_4d
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 1763
    .line 1764
    .line 1765
    move-result v2

    .line 1766
    const/16 v5, 0x200

    .line 1767
    .line 1768
    if-gt v2, v5, :cond_62

    .line 1769
    .line 1770
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1775
    .line 1776
    .line 1777
    check-cast v1, Ljava/lang/Iterable;

    .line 1778
    .line 1779
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    const-wide/16 v5, 0x0

    .line 1784
    .line 1785
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1786
    .line 1787
    .line 1788
    move-result v2

    .line 1789
    if-eqz v2, :cond_4e

    .line 1790
    .line 1791
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v2

    .line 1795
    check-cast v2, Ljava/lang/Number;

    .line 1796
    .line 1797
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 1798
    .line 1799
    .line 1800
    move-result-wide v7

    .line 1801
    add-long/2addr v5, v7

    .line 1802
    goto :goto_2d

    .line 1803
    :cond_4e
    const-wide/32 v1, 0x2000000

    .line 1804
    .line 1805
    .line 1806
    cmp-long v1, v5, v1

    .line 1807
    .line 1808
    if-gtz v1, :cond_61

    .line 1809
    .line 1810
    new-instance v1, Ljava/util/ArrayList;

    .line 1811
    .line 1812
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1813
    .line 1814
    .line 1815
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v2

    .line 1819
    :cond_4f
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1820
    .line 1821
    .line 1822
    move-result v5

    .line 1823
    if-eqz v5, :cond_50

    .line 1824
    .line 1825
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v5

    .line 1829
    move-object v6, v5

    .line 1830
    check-cast v6, Lfb/w1;

    .line 1831
    .line 1832
    iget-object v6, v6, Lfb/w1;->b:Ljava/lang/String;

    .line 1833
    .line 1834
    if-nez v6, :cond_4f

    .line 1835
    .line 1836
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1837
    .line 1838
    .line 1839
    goto :goto_2e

    .line 1840
    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v1

    .line 1844
    :cond_51
    :goto_2f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1845
    .line 1846
    .line 1847
    move-result v2

    .line 1848
    if-eqz v2, :cond_53

    .line 1849
    .line 1850
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v2

    .line 1854
    check-cast v2, Lfb/w1;

    .line 1855
    .line 1856
    iget-object v5, v2, Lfb/w1;->a:Ljava/lang/String;

    .line 1857
    .line 1858
    const/4 v14, 0x0

    .line 1859
    invoke-virtual {v4, v5, v14}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v5

    .line 1863
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 1864
    .line 1865
    .line 1866
    move-result v6

    .line 1867
    if-eqz v6, :cond_51

    .line 1868
    .line 1869
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 1870
    .line 1871
    .line 1872
    move-result v6

    .line 1873
    if-eqz v6, :cond_52

    .line 1874
    .line 1875
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1876
    .line 1877
    invoke-static {v5}, Lfb/t2;->p(Ljava/io/File;)V

    .line 1878
    .line 1879
    .line 1880
    goto :goto_2f

    .line 1881
    :cond_52
    iget-object v0, v2, Lfb/w1;->a:Ljava/lang/String;

    .line 1882
    .line 1883
    const-string v1, "\u7edf\u4e00\u8865\u4e01\u53ea\u80fd\u5220\u9664\u6587\u4ef6: "

    .line 1884
    .line 1885
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 1890
    .line 1891
    .line 1892
    const/16 v24, 0x0

    .line 1893
    .line 1894
    return-object v24

    .line 1895
    :cond_53
    new-instance v1, Ljava/util/ArrayList;

    .line 1896
    .line 1897
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1898
    .line 1899
    .line 1900
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v2

    .line 1904
    :cond_54
    :goto_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1905
    .line 1906
    .line 1907
    move-result v5

    .line 1908
    if-eqz v5, :cond_55

    .line 1909
    .line 1910
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v5

    .line 1914
    move-object v6, v5

    .line 1915
    check-cast v6, Lfb/w1;

    .line 1916
    .line 1917
    iget-object v6, v6, Lfb/w1;->b:Ljava/lang/String;

    .line 1918
    .line 1919
    if-eqz v6, :cond_54

    .line 1920
    .line 1921
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1922
    .line 1923
    .line 1924
    goto :goto_30

    .line 1925
    :cond_55
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v1

    .line 1929
    :goto_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1930
    .line 1931
    .line 1932
    move-result v2

    .line 1933
    if-eqz v2, :cond_5d

    .line 1934
    .line 1935
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v2

    .line 1939
    check-cast v2, Lfb/w1;

    .line 1940
    .line 1941
    iget-object v5, v2, Lfb/w1;->a:Ljava/lang/String;

    .line 1942
    .line 1943
    const/4 v14, 0x0

    .line 1944
    invoke-virtual {v4, v5, v14}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v6

    .line 1948
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 1949
    .line 1950
    .line 1951
    move-result v7

    .line 1952
    if-eqz v7, :cond_58

    .line 1953
    .line 1954
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v7

    .line 1958
    if-nez v7, :cond_56

    .line 1959
    .line 1960
    new-array v7, v14, [Ljava/io/File;

    .line 1961
    .line 1962
    :cond_56
    array-length v7, v7

    .line 1963
    if-nez v7, :cond_58

    .line 1964
    .line 1965
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 1966
    .line 1967
    .line 1968
    move-result v7

    .line 1969
    if-eqz v7, :cond_57

    .line 1970
    .line 1971
    goto :goto_32

    .line 1972
    :cond_57
    const-string v0, "\u66ff\u6362\u7a7a\u76ee\u5f55\u5931\u8d25: "

    .line 1973
    .line 1974
    invoke-static {v0, v5}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    invoke-static {v0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 1979
    .line 1980
    .line 1981
    const/16 v24, 0x0

    .line 1982
    .line 1983
    return-object v24

    .line 1984
    :cond_58
    :goto_32
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 1985
    .line 1986
    .line 1987
    move-result v7

    .line 1988
    if-nez v7, :cond_5c

    .line 1989
    .line 1990
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v7

    .line 1994
    if-eqz v7, :cond_5a

    .line 1995
    .line 1996
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    .line 1997
    .line 1998
    .line 1999
    move-result v8

    .line 2000
    if-nez v8, :cond_5a

    .line 2001
    .line 2002
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 2003
    .line 2004
    .line 2005
    move-result v7

    .line 2006
    if-eqz v7, :cond_59

    .line 2007
    .line 2008
    goto :goto_33

    .line 2009
    :cond_59
    const-string v0, "\u521b\u5efa\u7236\u76ee\u5f55\u5931\u8d25: "

    .line 2010
    .line 2011
    invoke-static {v0, v5}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v0

    .line 2015
    invoke-static {v0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 2016
    .line 2017
    .line 2018
    const/16 v24, 0x0

    .line 2019
    .line 2020
    return-object v24

    .line 2021
    :cond_5a
    :goto_33
    sget-object v5, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2022
    .line 2023
    iget-object v2, v2, Lfb/w1;->b:Ljava/lang/String;

    .line 2024
    .line 2025
    if-nez v2, :cond_5b

    .line 2026
    .line 2027
    move-object v2, v3

    .line 2028
    :cond_5b
    invoke-static {v6, v2}, Lfb/t2;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 2029
    .line 2030
    .line 2031
    goto :goto_31

    .line 2032
    :cond_5c
    const-string v0, "\u7edf\u4e00\u8865\u4e01\u76ee\u6807\u662f\u76ee\u5f55: "

    .line 2033
    .line 2034
    invoke-static {v0, v5}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v0

    .line 2038
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 2039
    .line 2040
    .line 2041
    const/16 v24, 0x0

    .line 2042
    .line 2043
    return-object v24

    .line 2044
    :cond_5d
    invoke-virtual {v4}, Lfb/s2;->g()V

    .line 2045
    .line 2046
    .line 2047
    invoke-virtual {v4}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v1

    .line 2051
    new-instance v2, Lorg/json/JSONArray;

    .line 2052
    .line 2053
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 2054
    .line 2055
    .line 2056
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v0

    .line 2060
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2061
    .line 2062
    .line 2063
    move-result v3

    .line 2064
    if-eqz v3, :cond_60

    .line 2065
    .line 2066
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v3

    .line 2070
    check-cast v3, Lfb/w1;

    .line 2071
    .line 2072
    new-instance v5, Lorg/json/JSONObject;

    .line 2073
    .line 2074
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 2075
    .line 2076
    .line 2077
    iget-object v6, v3, Lfb/w1;->a:Ljava/lang/String;

    .line 2078
    .line 2079
    iget-object v7, v3, Lfb/w1;->d:Ljava/lang/String;

    .line 2080
    .line 2081
    const-string v8, "path"

    .line 2082
    .line 2083
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2084
    .line 2085
    .line 2086
    const-string v6, "operation"

    .line 2087
    .line 2088
    iget-object v8, v3, Lfb/w1;->c:Ljava/lang/String;

    .line 2089
    .line 2090
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2091
    .line 2092
    .line 2093
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v6

    .line 2097
    if-nez v6, :cond_5e

    .line 2098
    .line 2099
    const-string v6, "sourcePath"

    .line 2100
    .line 2101
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2102
    .line 2103
    .line 2104
    :cond_5e
    iget-object v3, v3, Lfb/w1;->b:Ljava/lang/String;

    .line 2105
    .line 2106
    if-eqz v3, :cond_5f

    .line 2107
    .line 2108
    sget-object v6, Log/a;->a:Ljava/nio/charset/Charset;

    .line 2109
    .line 2110
    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 2111
    .line 2112
    .line 2113
    move-result-object v3

    .line 2114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2115
    .line 2116
    .line 2117
    array-length v3, v3

    .line 2118
    const-string v6, "bytes"

    .line 2119
    .line 2120
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2121
    .line 2122
    .line 2123
    :cond_5f
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2124
    .line 2125
    .line 2126
    goto :goto_34

    .line 2127
    :cond_60
    const-string v0, "files"

    .line 2128
    .line 2129
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v0

    .line 2136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2137
    .line 2138
    .line 2139
    return-object v0

    .line 2140
    :cond_61
    const-string v0, "\u63d2\u4ef6\u603b\u5927\u5c0f\u8d85\u8fc7 32 MB"

    .line 2141
    .line 2142
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2143
    .line 2144
    .line 2145
    const/16 v24, 0x0

    .line 2146
    .line 2147
    return-object v24

    .line 2148
    :cond_62
    const/16 v24, 0x0

    .line 2149
    .line 2150
    const-string v0, "\u63d2\u4ef6\u6587\u4ef6\u6570\u91cf\u8d85\u8fc7 512"

    .line 2151
    .line 2152
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2153
    .line 2154
    .line 2155
    return-object v24

    .line 2156
    :cond_63
    move-object/from16 v4, p0

    .line 2157
    .line 2158
    const/16 v24, 0x0

    .line 2159
    .line 2160
    const-string v0, "\u8865\u4e01\u6ca1\u6709\u6587\u4ef6\u53d8\u66f4"

    .line 2161
    .line 2162
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2163
    .line 2164
    .line 2165
    return-object v24

    .line 2166
    :cond_64
    move-object/from16 v4, p0

    .line 2167
    .line 2168
    const/16 v24, 0x0

    .line 2169
    .line 2170
    const-string v0, "\u8865\u4e01\u5fc5\u987b\u4ee5 *** End Patch \u7ed3\u675f"

    .line 2171
    .line 2172
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2173
    .line 2174
    .line 2175
    return-object v24

    .line 2176
    :cond_65
    move-object/from16 v4, p0

    .line 2177
    .line 2178
    const/16 v24, 0x0

    .line 2179
    .line 2180
    const-string v0, "\u8865\u4e01\u5fc5\u987b\u4ee5 *** Begin Patch \u5f00\u59cb"

    .line 2181
    .line 2182
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2183
    .line 2184
    .line 2185
    return-object v24

    .line 2186
    :cond_66
    move-object/from16 v4, p0

    .line 2187
    .line 2188
    const/16 v24, 0x0

    .line 2189
    .line 2190
    const-string v0, "\u8865\u4e01\u8d85\u8fc7 4 MB"

    .line 2191
    .line 2192
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2193
    .line 2194
    .line 2195
    return-object v24

    .line 2196
    :cond_67
    move-object/from16 v4, p0

    .line 2197
    .line 2198
    const/16 v24, 0x0

    .line 2199
    .line 2200
    const-string v0, "patch \u4e0d\u80fd\u4e3a\u7a7a"

    .line 2201
    .line 2202
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 2203
    .line 2204
    .line 2205
    return-object v24
.end method

.method public final declared-synchronized c()Lfb/i2;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v0, v1, Lfb/s2;->q:I

    .line 5
    .line 6
    iget v2, v1, Lfb/s2;->o:I

    .line 7
    .line 8
    if-ne v0, v2, :cond_f

    .line 9
    .line 10
    iget v0, v1, Lfb/s2;->r:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_e

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2, v0}, Lfb/s2;->J(Lfb/s2;Ljava/lang/String;I)Lfb/n2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lfb/n2;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iget-boolean v3, v1, Lfb/s2;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v2

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :cond_0
    :try_start_1
    iget-boolean v3, v1, Lfb/s2;->p:Z

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    move-object v3, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object v3, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    iget-object v3, v1, Lfb/s2;->h:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, v1, Lfb/s2;->j:Ljava/io/File;

    .line 46
    .line 47
    invoke-static {v4, v3}, Lfb/t2;->b0(Ljava/io/File;Ljava/lang/String;)Lfb/p2;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_0
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v4, v3, Lfb/p2;->a:Lfb/y;

    .line 54
    .line 55
    move-object v12, v4

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v12, v2

    .line 58
    :goto_1
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object v3, v3, Lfb/p2;->b:Lfb/z1;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v3, v2

    .line 64
    :goto_2
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3}, Lfb/z1;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    xor-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/4 v4, 0x0

    .line 74
    :goto_3
    if-eqz v4, :cond_7

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-virtual {v3}, Lfb/z1;->b()Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :cond_5
    if-nez v2, :cond_6

    .line 83
    .line 84
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 85
    .line 86
    :cond_6
    const-string v3, "\uff1b"

    .line 87
    .line 88
    new-instance v6, Lfb/g0;

    .line 89
    .line 90
    const/16 v0, 0x1a

    .line 91
    .line 92
    invoke-direct {v6, v0}, Lfb/g0;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const/16 v7, 0x1e

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v2

    .line 113
    :cond_7
    move-object v4, v3

    .line 114
    iget-object v3, v1, Lfb/s2;->h:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v12, :cond_8

    .line 117
    .line 118
    iget-object v5, v12, Lfb/y;->a:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v5, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    iget-object v5, v1, Lfb/s2;->n:Ljava/lang/String;

    .line 124
    .line 125
    :goto_4
    iget-object v6, v1, Lfb/s2;->j:Ljava/io/File;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-object v7, v4

    .line 135
    move-object v4, v5

    .line 136
    move-object v5, v6

    .line 137
    iget-boolean v6, v1, Lfb/s2;->k:Z

    .line 138
    .line 139
    move-object v8, v7

    .line 140
    iget-object v7, v1, Lfb/s2;->l:Ljava/lang/String;

    .line 141
    .line 142
    move-object v9, v8

    .line 143
    iget-object v8, v0, Lfb/n2;->a:Ljava/util/List;

    .line 144
    .line 145
    move-object v10, v9

    .line 146
    iget-object v9, v0, Lfb/n2;->b:Ljava/util/List;

    .line 147
    .line 148
    move-object v11, v10

    .line 149
    iget-object v10, v0, Lfb/n2;->c:Ljava/util/List;

    .line 150
    .line 151
    move-object v13, v11

    .line 152
    iget-object v11, v0, Lfb/n2;->d:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v8, v9}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    iget-object v0, v0, Lfb/n2;->c:Ljava/util/List;

    .line 159
    .line 160
    invoke-static {v14, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v14, v13

    .line 173
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    invoke-static {v15}, Ltf/y;->a0(I)I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    const/16 v2, 0x10

    .line 184
    .line 185
    if-ge v15, v2, :cond_9

    .line 186
    .line 187
    move v15, v2

    .line 188
    :cond_9
    invoke-direct {v13, v15}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_b

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    move-object v15, v2

    .line 206
    check-cast v15, Ljava/lang/String;

    .line 207
    .line 208
    move-object/from16 v16, v0

    .line 209
    .line 210
    iget-object v0, v1, Lfb/s2;->m:Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    invoke-virtual {v0, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/String;

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    const-string v0, "missing"

    .line 222
    .line 223
    :goto_6
    invoke-interface {v13, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-object/from16 v0, v16

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_b
    move-object v2, v14

    .line 230
    iget-boolean v14, v1, Lfb/s2;->p:Z

    .line 231
    .line 232
    if-eqz v2, :cond_c

    .line 233
    .line 234
    invoke-virtual {v2}, Lfb/z1;->c()Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto :goto_7

    .line 239
    :cond_c
    const/4 v2, 0x0

    .line 240
    :goto_7
    if-nez v2, :cond_d

    .line 241
    .line 242
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 243
    .line 244
    :cond_d
    move-object v15, v2

    .line 245
    new-instance v2, Lfb/i2;

    .line 246
    .line 247
    invoke-direct/range {v2 .. v15}, Lfb/i2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lfb/y;Ljava/util/LinkedHashMap;ZLjava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    .line 249
    .line 250
    monitor-exit p0

    .line 251
    return-object v2

    .line 252
    :cond_e
    :try_start_2
    const-string v0, "\u5b8c\u6210\u524d\u5fc5\u987b\u5bf9\u5f53\u524d\u7248\u672c\u8c03\u7528 show_diff"

    .line 253
    .line 254
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 255
    .line 256
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v2

    .line 260
    :cond_f
    const-string v0, "\u5b8c\u6210\u524d\u5fc5\u987b\u5bf9\u5f53\u524d\u7248\u672c\u8c03\u7528 workspace_status"

    .line 261
    .line 262
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 263
    .line 264
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v2

    .line 268
    :goto_8
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 269
    throw v0
.end method

.method public final close()V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lfb/s2;->j:Ljava/io/File;

    .line 4
    .line 5
    invoke-static {v0}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :catchall_0
    return-void
.end method

.method public final declared-synchronized e(Ljava/lang/String;Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "\u672c\u8f6e\u53ea\u80fd\u64cd\u4f5c\u63d2\u4ef6 "

    .line 2
    .line 3
    const-string v1, "\u672a\u77e5\u63d2\u4ef6\u5de5\u4f5c\u533a\u5de5\u5177: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-virtual {p3}, Lfb/b;->d()V

    .line 7
    .line 8
    .line 9
    const-string v2, "plugin_id"

    .line 10
    .line 11
    const-string v3, ""

    .line 12
    .line 13
    invoke-virtual {p2, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lfb/s2;->a(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-static {p1}, Lfb/t2;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sparse-switch v2, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :sswitch_0
    const-string v2, "create_directory"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lfb/s2;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :sswitch_1
    const-string v2, "restore_path"

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {p0, p2}, Lfb/s2;->E(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_2
    const-string v2, "move_path"

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0, p2}, Lfb/s2;->x(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_3
    const-string v2, "list_files"

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    invoke-virtual {p0, p2, p3}, Lfb/s2;->w(Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_4
    const-string v2, "search_files"

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    invoke-virtual {p0, p2, p3}, Lfb/s2;->F(Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_5
    const-string p2, "workspace_status"

    .line 115
    .line 116
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_0

    .line 121
    .line 122
    invoke-virtual {p0}, Lfb/s2;->I()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    goto :goto_0

    .line 127
    :sswitch_6
    const-string p2, "delete_plugin"

    .line 128
    .line 129
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_0

    .line 134
    .line 135
    invoke-virtual {p0}, Lfb/s2;->l()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_0

    .line 140
    :sswitch_7
    const-string v2, "write_file"

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_0

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Lfb/s2;->K(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    goto :goto_0

    .line 153
    :sswitch_8
    const-string v2, "read_file"

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_0

    .line 160
    .line 161
    invoke-virtual {p0, p2}, Lfb/s2;->A(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    goto :goto_0

    .line 166
    :sswitch_9
    const-string v2, "delete_path"

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_0

    .line 173
    .line 174
    invoke-virtual {p0, p2}, Lfb/s2;->k(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    goto :goto_0

    .line 179
    :sswitch_a
    const-string p2, "reset_workspace"

    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-eqz p2, :cond_0

    .line 186
    .line 187
    invoke-virtual {p0}, Lfb/s2;->C()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    goto :goto_0

    .line 192
    :sswitch_b
    const-string v2, "apply_patch"

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_0

    .line 199
    .line 200
    invoke-virtual {p0, p2}, Lfb/s2;->b(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    goto :goto_0

    .line 205
    :sswitch_c
    const-string v2, "show_diff"

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_0

    .line 212
    .line 213
    invoke-virtual {p0, p2}, Lfb/s2;->G(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_0
    invoke-virtual {p3}, Lfb/b;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    .line 219
    .line 220
    monitor-exit p0

    .line 221
    return-object p1

    .line 222
    :cond_0
    :goto_1
    :try_start_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 223
    .line 224
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p2

    .line 236
    :cond_1
    iget-object p1, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p2

    .line 252
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 253
    throw p1

    .line 254
    nop

    .line 255
    :sswitch_data_0
    .sparse-switch
        -0x7179bff9 -> :sswitch_c
        -0x5b00c3c9 -> :sswitch_b
        -0x50de125b -> :sswitch_a
        -0x42df95c7 -> :sswitch_9
        -0x42641d7b -> :sswitch_8
        -0x25f09624 -> :sswitch_7
        -0x8b5bfb9 -> :sswitch_6
        -0x24c8124 -> :sswitch_5
        0x1adca520 -> :sswitch_4
        0x29725f96 -> :sswitch_3
        0x3fad9bd3 -> :sswitch_2
        0x6247b336 -> :sswitch_1
        0x63deaeea -> :sswitch_0
    .end sparse-switch
.end method

.method public final g()V
    .locals 3

    .line 1
    iget v0, p0, Lfb/s2;->o:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lfb/s2;->o:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lfb/s2;->q:I

    .line 9
    .line 10
    iput v0, p0, Lfb/s2;->r:I

    .line 11
    .line 12
    iget-object v0, p0, Lfb/s2;->j:Ljava/io/File;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final declared-synchronized h()Lfb/j2;
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v12

    .line 6
    iget-object v0, p0, Lfb/s2;->j:Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v0, v12, v13}, Ljava/io/File;->setLastModified(J)Z

    .line 9
    .line 10
    .line 11
    new-instance v0, Lfb/j2;

    .line 12
    .line 13
    iget-object v1, p0, Lfb/s2;->j:Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-boolean v3, p0, Lfb/s2;->k:Z

    .line 25
    .line 26
    iget-object v4, p0, Lfb/s2;->l:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v5, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    iget-object v5, p0, Lfb/s2;->j:Ljava/io/File;

    .line 31
    .line 32
    invoke-static {v5}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v6, p0, Lfb/s2;->m:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    iget-object v7, p0, Lfb/s2;->n:Ljava/lang/String;

    .line 43
    .line 44
    iget v8, p0, Lfb/s2;->o:I

    .line 45
    .line 46
    iget v9, p0, Lfb/s2;->q:I

    .line 47
    .line 48
    iget v10, p0, Lfb/s2;->r:I

    .line 49
    .line 50
    iget-boolean v11, p0, Lfb/s2;->p:Z

    .line 51
    .line 52
    invoke-direct/range {v0 .. v13}, Lfb/j2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-object v0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw v0
.end method

.method public final i(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    const-string v1, "path"

    .line 7
    .line 8
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1, v0}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    xor-int/lit8 v3, v2, 0x1

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v0, "\u521b\u5efa\u76ee\u5f55\u5931\u8d25: "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lah/a;->h(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    return-object p1

    .line 56
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    const-string p1, "created"

    .line 69
    .line 70
    invoke-virtual {v0, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_3
    const-string v0, "\u540c\u540d\u6587\u4ef6\u5df2\u5b58\u5728: "

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    return-object p1
.end method

.method public final k(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    const-string v1, "path"

    .line 7
    .line 8
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1, v0}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-static {v0}, Lfb/t2;->p(Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_0
    const-string v0, "\u8def\u5f84\u4e0d\u5b58\u5728: "

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    return-object p1
.end method

.method public final l()Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lfb/s2;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lfb/s2;->p:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lfb/s2;->j:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    aget-object v4, v1, v3

    .line 24
    .line 25
    invoke-static {v4}, Lfb/t2;->p(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p0, Lfb/s2;->p:Z

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "deletePlugin"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v2, "requiresConfirmation"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_2
    const-string v0, "\u65b0\u63d2\u4ef6\u5c1a\u672a\u5b58\u5728\uff0c\u4e0d\u80fd\u5220\u9664\u6574\u4e2a\u63d2\u4ef6"

    .line 62
    .line 63
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    return-object v0
.end method

.method public final m(Ljava/io/File;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lfb/s2;->j:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v1, v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/16 v4, 0x2f

    .line 25
    .line 26
    if-ne v3, v4, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v3, v0

    .line 31
    :goto_1
    if-eqz v3, :cond_1

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return v2
.end method

.method public final declared-synchronized o()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lfb/s2;->i:Ljava/io/File;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v1, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-static {v0}, Lfb/t2;->N(Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lfb/t2;->w(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "\u63d2\u4ef6\u6839\u76ee\u5f55\u65e0\u6548"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public final q(Ljava/io/File;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfb/s2;->j:Ljava/io/File;

    .line 7
    .line 8
    invoke-static {p1, v1}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "path"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const-string v1, "directory"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v1, "file"

    .line 31
    .line 32
    :goto_0
    const-string v2, "type"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const-string v1, "size"

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget v0, p0, Lfb/s2;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final declared-synchronized u()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lfb/s2;->p:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0, v1}, Lfb/s2;->J(Lfb/s2;Ljava/lang/String;I)Lfb/n2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lfb/n2;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    monitor-exit p0

    .line 24
    return v1

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
.end method

.method public final w(Lorg/json/JSONObject;Lfb/b;)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, "path"

    .line 4
    .line 5
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v0, v2}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0, v2}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_5

    .line 26
    .line 27
    const-string v4, "recursive"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const-string v6, "max_depth"

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    invoke-virtual {p1, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/16 v6, 0x8

    .line 42
    .line 43
    invoke-static {p1, v2, v6}, Lr9/e0;->r(III)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    new-instance v6, Lorg/json/JSONArray;

    .line 48
    .line 49
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const/16 v8, 0x1f4

    .line 57
    .line 58
    if-eqz v7, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lfb/s2;->q(Ljava/io/File;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v6, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {p0, v3}, Lfb/s2;->m(Ljava/io/File;)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    new-instance v9, Lc9/x;

    .line 73
    .line 74
    invoke-direct {v9, p2, v4, v3}, Lc9/x;-><init>(Lfb/b;ZLjava/io/File;)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Ldg/j;

    .line 78
    .line 79
    sget-object v11, Ldg/k;->g:Ldg/k;

    .line 80
    .line 81
    invoke-direct {v10, v3, v11, v9}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 82
    .line 83
    .line 84
    new-instance v9, Lfb/l2;

    .line 85
    .line 86
    const/4 v11, 0x1

    .line 87
    invoke-direct {v9, v3, v11}, Lfb/l2;-><init>(Ljava/io/File;I)V

    .line 88
    .line 89
    .line 90
    new-instance v11, Lng/i;

    .line 91
    .line 92
    invoke-direct {v11, v10, v2, v9}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v11, v8}, Lng/m;->Z(Lng/j;I)Lng/j;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-interface {v9}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_3

    .line 108
    .line 109
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    check-cast v10, Ljava/io/File;

    .line 114
    .line 115
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 116
    .line 117
    .line 118
    if-eqz v4, :cond_1

    .line 119
    .line 120
    invoke-virtual {p0, v10}, Lfb/s2;->m(Ljava/io/File;)I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    sub-int/2addr v11, v7

    .line 125
    if-le v11, p1, :cond_1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    if-nez v4, :cond_2

    .line 129
    .line 130
    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-static {v11, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-nez v11, :cond_2

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {p0, v10}, Lfb/s2;->q(Ljava/io/File;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lfb/s2;->z()Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    const-string p2, "items"

    .line 157
    .line 158
    invoke-virtual {p1, p2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-lt p2, v8, :cond_4

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    move v2, v5

    .line 169
    :goto_2
    const-string p2, "truncated"

    .line 170
    .line 171
    invoke-virtual {p1, p2, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_5
    const-string p1, "\u8def\u5f84\u4e0d\u5b58\u5728: "

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    const/4 p1, 0x0

    .line 192
    return-object p1
.end method

.method public final x(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lfb/s2;->B()V

    .line 2
    .line 3
    .line 4
    const-string v0, "source"

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v2, v3}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v4, "destination"

    .line 21
    .line 22
    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v3}, Lfb/s2;->y(Ljava/lang/String;Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0, v2, v3}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {p0, v1, v3}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v7, :cond_8

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-nez v7, :cond_7

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    sget-object v10, Ljava/io/File;->separator:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v11, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-static {v7, v9, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string p1, "\u4e0d\u80fd\u628a\u76ee\u5f55\u79fb\u52a8\u5230\u81ea\u8eab\u5185\u90e8"

    .line 96
    .line 97
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v8

    .line 101
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    const-string v7, "overwrite"

    .line 108
    .line 109
    invoke-virtual {p1, v7, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    sget-object p1, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-static {v6}, Lfb/t2;->p(Ljava/io/File;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    const-string p1, "\u76ee\u6807\u8def\u5f84\u5df2\u5b58\u5728: "

    .line 122
    .line 123
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v8

    .line 131
    :cond_3
    :goto_1
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_4

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    const-string p1, "\u521b\u5efa\u76ee\u6807\u7236\u76ee\u5f55\u5931\u8d25"

    .line 151
    .line 152
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v8

    .line 156
    :cond_5
    :goto_2
    invoke-virtual {v5, v6}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_6

    .line 161
    .line 162
    invoke-virtual {p0}, Lfb/s2;->g()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lfb/s2;->H()Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_6
    const-string p1, "\u79fb\u52a8\u8def\u5f84\u5931\u8d25"

    .line 184
    .line 185
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v8

    .line 189
    :cond_7
    const-string p1, "\u6e90\u8def\u5f84\u548c\u76ee\u6807\u8def\u5f84\u76f8\u540c"

    .line 190
    .line 191
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-object v8

    .line 195
    :cond_8
    const-string p1, "\u6e90\u8def\u5f84\u4e0d\u5b58\u5728: "

    .line 196
    .line 197
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    return-object v8
.end method

.method public final z()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ok"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    const-string v1, "pluginId"

    .line 13
    .line 14
    iget-object v2, p0, Lfb/s2;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string v1, "revision"

    .line 20
    .line 21
    iget v2, p0, Lfb/s2;->o:I

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
