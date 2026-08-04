.class public final synthetic Lyyds/ᛶᛲᲁᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛷᛳᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:Z

.field public final synthetic ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lyyds/ᛶᛲᲁᲈ;->ᛲᲈᲁ:Z

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛶᛲᲁᲈ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛶᛲᲁᲈ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᛲᲁᲈ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛶᛲᲁᲈ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛲᲁᲈ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-wide p0, -0x5ed6e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Landroid/widget/EditText;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-lez v4, :cond_2

    .line 90
    .line 91
    move-object v2, v1

    .line 92
    :cond_2
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-interface {p1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 99
    .line 100
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

    .line 101
    .line 102
    const-wide v3, -0x21013e68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    new-instance v1, Lyyds/ᛳᛴᛴ;

    .line 111
    .line 112
    invoke-direct {v1}, Lyyds/ᛳᛴᛴ;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Ljava/util/Map$Entry;

    .line 134
    .line 135
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Ljava/lang/String;

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v5}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-lez v6, :cond_4

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-lez v6, :cond_4

    .line 174
    .line 175
    new-instance v6, Lyyds/ᛳᲈᲀᲀ;

    .line 176
    .line 177
    invoke-direct {v6, v4}, Lyyds/ᛳᲈᲀᲀ;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object v4, v1, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 181
    .line 182
    invoke-virtual {v4, v5, v6}, Lyyds/ᛷᛶᲁᛵ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_5
    iget-object v3, v1, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 187
    .line 188
    iget v3, v3, Lyyds/ᛷᛶᲁᛵ;->ᲇᲇᲇᛱ:I

    .line 189
    .line 190
    if-nez v3, :cond_6

    .line 191
    .line 192
    const-wide v3, -0x2101de68a836eL

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    goto :goto_2

    .line 202
    :cond_6
    invoke-virtual {v1}, Lyyds/ᛳᛱᛶᲁ;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const-wide v3, -0x2101ee68a836eL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const-wide v3, -0x1749e68a836eL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛲ;

    .line 226
    .line 227
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 228
    .line 229
    const/4 v4, 0x2

    .line 230
    aget-object v3, v3, v4

    .line 231
    .line 232
    invoke-virtual {v0, v3, v1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    sget-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

    .line 236
    .line 237
    const-wide v3, -0x21064e68a836eL

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    monitor-enter v0

    .line 246
    :try_start_0
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᛶᛷᛲᲁ:Ljava/lang/ref/WeakReference;

    .line 247
    .line 248
    if-eqz v1, :cond_7

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    goto :goto_3

    .line 255
    :catchall_0
    move-exception p0

    .line 256
    goto/16 :goto_8

    .line 257
    .line 258
    :cond_7
    move-object v1, v2

    .line 259
    :goto_3
    sget-object v3, Lyyds/ᛷᲈᛲᲀ;->ᛱᲈᲁ:Ljava/lang/reflect/Method;

    .line 260
    .line 261
    if-eqz v1, :cond_8

    .line 262
    .line 263
    if-eqz v3, :cond_8

    .line 264
    .line 265
    new-instance v2, Lkotlin/Pair;

    .line 266
    .line 267
    invoke-direct {v2, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    .line 269
    .line 270
    :cond_8
    monitor-exit v0

    .line 271
    invoke-virtual {v0}, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ()Ljava/util/LinkedHashMap;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 276
    .line 277
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 292
    .line 293
    .line 294
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    :cond_9
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_c

    .line 303
    .line 304
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    check-cast v3, Ljava/lang/String;

    .line 315
    .line 316
    if-nez v3, :cond_a

    .line 317
    .line 318
    sget-object v3, Lyyds/ᛷᲈᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

    .line 319
    .line 320
    invoke-virtual {v3, v1}, Lyyds/ᛷᲈᛲᲀ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    if-nez v3, :cond_a

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_a
    sget-object v4, Lyyds/ᛷᲈᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

    .line 328
    .line 329
    invoke-virtual {v4, v1, v3}, Lyyds/ᛷᲈᛲᲀ;->ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    if-nez v2, :cond_b

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_b
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    check-cast v5, Ljava/lang/reflect/Method;

    .line 344
    .line 345
    :try_start_1
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 346
    .line 347
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 348
    .line 349
    filled-new-array {v1, v3, v6, v7}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 357
    goto :goto_5

    .line 358
    :catchall_1
    move-exception v3

    .line 359
    new-instance v4, Lyyds/ᲈᛵᛵᛴ;

    .line 360
    .line 361
    invoke-direct {v4, v3}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 362
    .line 363
    .line 364
    move-object v3, v4

    .line 365
    :goto_5
    invoke-static {v3}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    if-eqz v3, :cond_9

    .line 370
    .line 371
    sget-object v4, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 372
    .line 373
    new-instance v5, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-wide v6, -0x21076e68a836eL

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v4, v1, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_c
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result p0

    .line 402
    if-eqz p0, :cond_d

    .line 403
    .line 404
    const-wide p0, -0x5ee7e68a836eL

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    :goto_6
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    goto :goto_7

    .line 414
    :cond_d
    const-wide p0, -0x5ef0e68a836eL

    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    goto :goto_6

    .line 420
    :goto_7
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 421
    .line 422
    .line 423
    const/4 p0, 0x0

    .line 424
    return p0

    .line 425
    :goto_8
    monitor-exit v0

    .line 426
    throw p0
.end method
