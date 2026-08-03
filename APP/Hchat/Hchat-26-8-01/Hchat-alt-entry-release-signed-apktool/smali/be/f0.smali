.class public final synthetic Lbe/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbe/h0;Ljava/util/HashSet;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lbe/f0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lbe/f0;->a:I

    iput-object p1, p0, Lbe/f0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lbe/f0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Lbe/f0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfe/a;

    .line 9
    .line 10
    iget-object v1, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    check-cast p1, Lqd/j;

    .line 15
    .line 16
    check-cast p2, Lqd/j;

    .line 17
    .line 18
    invoke-virtual {p2}, Lqd/j;->j()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-virtual {v0, p2}, Lfe/a;->d(Lqd/j;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v3, v4, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/util/Map;

    .line 52
    .line 53
    new-instance v4, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v4, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    :goto_0
    if-ge v5, v3, :cond_3

    .line 60
    .line 61
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lqd/j;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Lqd/j;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const/4 v7, 0x0

    .line 77
    :goto_1
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Lqd/j;

    .line 82
    .line 83
    if-eqz v7, :cond_2

    .line 84
    .line 85
    move-object v6, v7

    .line 86
    :cond_2
    invoke-virtual {v4, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v1, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_2
    return-void

    .line 100
    :pswitch_0
    iget-object v0, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lte/a;

    .line 103
    .line 104
    iget-object v1, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Ljava/util/ArrayList;

    .line 107
    .line 108
    check-cast p1, Ljava/lang/String;

    .line 109
    .line 110
    check-cast p2, Ljava/util/List;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/4 v3, 0x1

    .line 120
    const/4 v4, 0x0

    .line 121
    if-ne v2, v3, :cond_5

    .line 122
    .line 123
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lte/b;

    .line 128
    .line 129
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    iget-object v0, v0, Lte/a;->e:Ljava/util/TreeMap;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance p2, Lbc/i;

    .line 148
    .line 149
    const/4 v2, 0x2

    .line 150
    invoke-direct {p2, v0, v2}, Lbc/i;-><init>(Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {p1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance p2, Lbe/m0;

    .line 162
    .line 163
    const/4 v0, 0x5

    .line 164
    invoke-direct {p2, v0, v1}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Lte/b;

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    sget-object v1, Lte/a;->g:Lmh/b;

    .line 181
    .line 182
    const-string v2, "Select providing \'{}\' plugin \'{}\', candidates: {}"

    .line 183
    .line 184
    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-interface {v1, v2, p1}, Lmh/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :goto_3
    return-void

    .line 192
    :pswitch_1
    iget-object v0, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lud/u;

    .line 195
    .line 196
    iget-object v1, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Lj8/f;

    .line 199
    .line 200
    check-cast p1, Ljava/lang/Integer;

    .line 201
    .line 202
    check-cast p2, Ljava/lang/String;

    .line 203
    .line 204
    const/16 v2, 0x2f

    .line 205
    .line 206
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-virtual {p2, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const-string v4, "android.R$"

    .line 216
    .line 217
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    add-int/lit8 v2, v2, 0x1

    .line 222
    .line 223
    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-static {v3}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v0, v2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 236
    .line 237
    new-instance v4, Lod/c;

    .line 238
    .line 239
    invoke-direct {v4, v2, p2, v3}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 240
    .line 241
    .line 242
    iget-object p2, v0, Lud/u;->e:Lbe/k;

    .line 243
    .line 244
    invoke-virtual {p2, v4}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    iget-object v0, v1, Lj8/f;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lod/b;

    .line 251
    .line 252
    invoke-virtual {v0, p1, p2}, Lod/b;->a(Ljava/lang/Object;Lud/l;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_2
    iget-object v0, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Ljava/util/HashSet;

    .line 259
    .line 260
    iget-object v1, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, Ljava/util/HashMap;

    .line 263
    .line 264
    check-cast p1, Lud/e;

    .line 265
    .line 266
    check-cast p2, Ljava/util/List;

    .line 267
    .line 268
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-eqz p2, :cond_b

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 275
    .line 276
    .line 277
    :goto_4
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-nez p2, :cond_7

    .line 282
    .line 283
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v2, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    const-string v3, "Loop in anonymous inline: "

    .line 294
    .line 295
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string p2, ", path: "

    .line 302
    .line 303
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    invoke-virtual {p1, p2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    new-instance p1, Lae/e;

    .line 317
    .line 318
    const/4 p2, 0x7

    .line 319
    invoke-direct {p1, p2}, Lae/e;-><init>(I)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_7
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    check-cast p2, Lud/e;

    .line 331
    .line 332
    if-nez p2, :cond_a

    .line 333
    .line 334
    invoke-virtual {p1}, Lud/e;->a0()Lud/e;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 339
    .line 340
    .line 341
    move-result p2

    .line 342
    const/4 v1, 0x2

    .line 343
    if-gt p2, v1, :cond_8

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_8
    iget-object p2, p1, Lud/e;->A:Ljava/util/List;

    .line 347
    .line 348
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_9

    .line 353
    .line 354
    new-instance p2, Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 361
    .line 362
    .line 363
    iput-object p2, p1, Lud/e;->A:Ljava/util/List;

    .line 364
    .line 365
    :cond_9
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_b

    .line 374
    .line 375
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Lud/e;

    .line 380
    .line 381
    invoke-virtual {v0}, Lud/e;->a0()Lud/e;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_a
    move-object p1, p2

    .line 390
    goto :goto_4

    .line 391
    :cond_b
    :goto_6
    return-void

    .line 392
    :pswitch_3
    iget-object v0, p0, Lbe/f0;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, Lbe/b;

    .line 395
    .line 396
    iget-object v1, p0, Lbe/f0;->c:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v1, Lud/r;

    .line 399
    .line 400
    check-cast p1, Ljava/lang/String;

    .line 401
    .line 402
    check-cast p2, Lnc/a;

    .line 403
    .line 404
    invoke-virtual {v0, v1, p2}, Lbe/b;->s(Lud/r;Lnc/a;)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
