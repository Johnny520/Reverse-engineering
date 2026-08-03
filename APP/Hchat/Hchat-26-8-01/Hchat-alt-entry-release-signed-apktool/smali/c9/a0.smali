.class public final Lc9/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lc9/a0;->g:I

    iput-object p1, p0, Lc9/a0;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lc9/a0;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget v0, p0, Lc9/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Li0/a1;

    .line 11
    .line 12
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p2, p1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/util/Map;

    .line 58
    .line 59
    const-wide v1, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    check-cast p1, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-static {p1}, Ltf/m;->D1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/Long;

    .line 79
    .line 80
    if-eqz p1, :cond_0

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v3

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move-wide v3, v1

    .line 88
    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p2, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Ljava/util/Map;

    .line 99
    .line 100
    if-eqz p2, :cond_1

    .line 101
    .line 102
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-eqz p2, :cond_1

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-static {p2}, Ltf/m;->D1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, Ljava/lang/Long;

    .line 115
    .line 116
    if-eqz p2, :cond_1

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    :pswitch_1
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lc9/a0;

    .line 134
    .line 135
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    check-cast p1, Ljava/util/Map$Entry;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Ljava/lang/Comparable;

    .line 149
    .line 150
    check-cast p2, Ljava/util/Map$Entry;

    .line 151
    .line 152
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    check-cast p2, Ljava/lang/Comparable;

    .line 157
    .line 158
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_1
    return v0

    .line 163
    :pswitch_2
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lr4/m;

    .line 166
    .line 167
    invoke-virtual {v0, p1, p2}, Lr4/m;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Lr8/d;

    .line 181
    .line 182
    iget p1, p1, Lr8/d;->c:I

    .line 183
    .line 184
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p2, Ljava/util/Map$Entry;

    .line 189
    .line 190
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Lr8/d;

    .line 195
    .line 196
    iget p2, p2, Lr8/d;->c:I

    .line 197
    .line 198
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    :goto_2
    return v0

    .line 207
    :pswitch_3
    check-cast p1, Lqd/j;

    .line 208
    .line 209
    check-cast p2, Lqd/j;

    .line 210
    .line 211
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lqe/k;

    .line 214
    .line 215
    invoke-virtual {v0, p1, p2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    const/4 p2, 0x1

    .line 224
    if-eq p1, p2, :cond_6

    .line 225
    .line 226
    const/4 v0, 0x2

    .line 227
    if-eq p1, v0, :cond_6

    .line 228
    .line 229
    const/4 p2, 0x3

    .line 230
    if-eq p1, p2, :cond_5

    .line 231
    .line 232
    const/4 p2, 0x4

    .line 233
    if-eq p1, p2, :cond_5

    .line 234
    .line 235
    const/4 p2, 0x5

    .line 236
    if-eq p1, p2, :cond_4

    .line 237
    .line 238
    const/4 p2, 0x0

    .line 239
    goto :goto_3

    .line 240
    :cond_4
    const/4 p2, -0x2

    .line 241
    goto :goto_3

    .line 242
    :cond_5
    const/4 p2, -0x1

    .line 243
    :cond_6
    :goto_3
    return p2

    .line 244
    :pswitch_4
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lc9/a0;

    .line 247
    .line 248
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_7

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_7
    check-cast p1, Lqb/g;

    .line 256
    .line 257
    iget-object p1, p1, Lqb/g;->b:Ljava/lang/String;

    .line 258
    .line 259
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 260
    .line 261
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p2, Lqb/g;

    .line 266
    .line 267
    iget-object p2, p2, Lqb/g;->b:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    :goto_4
    return v0

    .line 281
    :pswitch_5
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lc9/z;

    .line 284
    .line 285
    invoke-virtual {v0, p1, p2}, Lc9/z;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_8

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_8
    check-cast p1, Lqb/g;

    .line 293
    .line 294
    iget-boolean p1, p1, Lqb/g;->c:Z

    .line 295
    .line 296
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    check-cast p2, Lqb/g;

    .line 301
    .line 302
    iget-boolean p2, p2, Lqb/g;->c:Z

    .line 303
    .line 304
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    :goto_5
    return v0

    .line 313
    :pswitch_6
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, La9/h;

    .line 316
    .line 317
    invoke-virtual {v0, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_9

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_9
    check-cast p1, Lp8/i;

    .line 325
    .line 326
    iget p1, p1, Lp8/i;->b:I

    .line 327
    .line 328
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    check-cast p2, Lp8/i;

    .line 333
    .line 334
    iget p2, p2, Lp8/i;->b:I

    .line 335
    .line 336
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    :goto_6
    return v0

    .line 345
    :pswitch_7
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lc9/z;

    .line 348
    .line 349
    invoke-virtual {v0, p1, p2}, Lc9/z;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-eqz v0, :cond_a

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_a
    check-cast p1, Lwb/jv;

    .line 357
    .line 358
    iget-object p1, p1, Lwb/jv;->b:Ljava/lang/String;

    .line 359
    .line 360
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 361
    .line 362
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    check-cast p2, Lwb/jv;

    .line 367
    .line 368
    iget-object p2, p2, Lwb/jv;->b:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    :goto_7
    return v0

    .line 382
    :pswitch_8
    check-cast p2, Lwb/jv;

    .line 383
    .line 384
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 387
    .line 388
    iget-object p2, p2, Lwb/jv;->a:Ljava/lang/String;

    .line 389
    .line 390
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 395
    .line 396
    .line 397
    move-result-object p2

    .line 398
    check-cast p1, Lwb/jv;

    .line 399
    .line 400
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 401
    .line 402
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result p1

    .line 406
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {p2, p1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    return p1

    .line 415
    :pswitch_9
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, La9/h;

    .line 418
    .line 419
    invoke-virtual {v0, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_b

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_b
    check-cast p1, Lhb/t;

    .line 427
    .line 428
    iget-wide v0, p1, Lhb/t;->a:J

    .line 429
    .line 430
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    check-cast p2, Lhb/t;

    .line 435
    .line 436
    iget-wide v0, p2, Lhb/t;->a:J

    .line 437
    .line 438
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 439
    .line 440
    .line 441
    move-result-object p2

    .line 442
    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    :goto_8
    return v0

    .line 447
    :pswitch_a
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, Lc9/a0;

    .line 450
    .line 451
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_c

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_c
    check-cast p1, Lwb/jv;

    .line 459
    .line 460
    iget-object p1, p1, Lwb/jv;->b:Ljava/lang/String;

    .line 461
    .line 462
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 463
    .line 464
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    check-cast p2, Lwb/jv;

    .line 469
    .line 470
    iget-object p2, p2, Lwb/jv;->b:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    :goto_9
    return v0

    .line 484
    :pswitch_b
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v0, Lc9/a0;

    .line 487
    .line 488
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_d

    .line 493
    .line 494
    goto :goto_a

    .line 495
    :cond_d
    check-cast p1, Lwb/jv;

    .line 496
    .line 497
    iget-boolean p1, p1, Lwb/jv;->g:Z

    .line 498
    .line 499
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    check-cast p2, Lwb/jv;

    .line 504
    .line 505
    iget-boolean p2, p2, Lwb/jv;->g:Z

    .line 506
    .line 507
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 508
    .line 509
    .line 510
    move-result-object p2

    .line 511
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    :goto_a
    return v0

    .line 516
    :pswitch_c
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Lc9/z;

    .line 519
    .line 520
    invoke-virtual {v0, p1, p2}, Lc9/z;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_e

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_e
    check-cast p1, Lwb/jv;

    .line 528
    .line 529
    iget-boolean p1, p1, Lwb/jv;->c:Z

    .line 530
    .line 531
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    check-cast p2, Lwb/jv;

    .line 536
    .line 537
    iget-boolean p2, p2, Lwb/jv;->c:Z

    .line 538
    .line 539
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 540
    .line 541
    .line 542
    move-result-object p2

    .line 543
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    :goto_b
    return v0

    .line 548
    :pswitch_d
    check-cast p1, Landroid/text/style/URLSpan;

    .line 549
    .line 550
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, Landroid/text/Spanned;

    .line 553
    .line 554
    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 555
    .line 556
    .line 557
    move-result p1

    .line 558
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    check-cast p2, Landroid/text/style/URLSpan;

    .line 563
    .line 564
    invoke-interface {v0, p2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 565
    .line 566
    .line 567
    move-result p2

    .line 568
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object p2

    .line 572
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 573
    .line 574
    .line 575
    move-result p1

    .line 576
    return p1

    .line 577
    :pswitch_e
    check-cast p1, Ljava/util/zip/ZipEntry;

    .line 578
    .line 579
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v0, Lfb/l1;

    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-static {v0, p1}, Lfb/l1;->a(Lfb/l1;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result p1

    .line 594
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    check-cast p2, Ljava/util/zip/ZipEntry;

    .line 599
    .line 600
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p2

    .line 604
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-static {v0, p2}, Lfb/l1;->a(Lfb/l1;Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    move-result p2

    .line 611
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    .line 613
    .line 614
    move-result-object p2

    .line 615
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 616
    .line 617
    .line 618
    move-result p1

    .line 619
    return p1

    .line 620
    :pswitch_f
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, Lc9/a0;

    .line 623
    .line 624
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-eqz v0, :cond_f

    .line 629
    .line 630
    goto :goto_c

    .line 631
    :cond_f
    check-cast p2, Lfb/d1;

    .line 632
    .line 633
    iget-wide v0, p2, Lfb/d1;->d:J

    .line 634
    .line 635
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 636
    .line 637
    .line 638
    move-result-object p2

    .line 639
    check-cast p1, Lfb/d1;

    .line 640
    .line 641
    iget-wide v0, p1, Lfb/d1;->d:J

    .line 642
    .line 643
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-virtual {p2, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    :goto_c
    return v0

    .line 652
    :pswitch_10
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Lfb/r;

    .line 655
    .line 656
    invoke-virtual {v0, p1, p2}, Lfb/r;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_10

    .line 661
    .line 662
    goto :goto_d

    .line 663
    :cond_10
    check-cast p2, Lfb/d1;

    .line 664
    .line 665
    iget-wide v0, p2, Lfb/d1;->n:J

    .line 666
    .line 667
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 668
    .line 669
    .line 670
    move-result-object p2

    .line 671
    check-cast p1, Lfb/d1;

    .line 672
    .line 673
    iget-wide v0, p1, Lfb/d1;->n:J

    .line 674
    .line 675
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    invoke-virtual {p2, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 680
    .line 681
    .line 682
    move-result v0

    .line 683
    :goto_d
    return v0

    .line 684
    :pswitch_11
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Lfb/r;

    .line 687
    .line 688
    invoke-virtual {v0, p1, p2}, Lfb/r;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-eqz v0, :cond_11

    .line 693
    .line 694
    goto :goto_e

    .line 695
    :cond_11
    check-cast p1, Lfb/p0;

    .line 696
    .line 697
    iget-object p1, p1, Lfb/p0;->a:Lfb/r0;

    .line 698
    .line 699
    iget-object p1, p1, Lfb/r0;->a:Ljava/lang/String;

    .line 700
    .line 701
    check-cast p2, Lfb/p0;

    .line 702
    .line 703
    iget-object p2, p2, Lfb/p0;->a:Lfb/r0;

    .line 704
    .line 705
    iget-object p2, p2, Lfb/r0;->a:Ljava/lang/String;

    .line 706
    .line 707
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    :goto_e
    return v0

    .line 712
    :pswitch_12
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v0, Lfb/r;

    .line 715
    .line 716
    invoke-virtual {v0, p1, p2}, Lfb/r;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v0, :cond_12

    .line 721
    .line 722
    goto :goto_f

    .line 723
    :cond_12
    check-cast p1, Ljava/io/File;

    .line 724
    .line 725
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 733
    .line 734
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object p1

    .line 738
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    check-cast p2, Ljava/io/File;

    .line 742
    .line 743
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object p2

    .line 747
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object p2

    .line 754
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    :goto_f
    return v0

    .line 762
    :pswitch_13
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, Lc9/a0;

    .line 765
    .line 766
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    if-eqz v0, :cond_13

    .line 771
    .line 772
    goto :goto_10

    .line 773
    :cond_13
    check-cast p1, Lf2/q;

    .line 774
    .line 775
    iget p1, p1, Lf2/q;->f:I

    .line 776
    .line 777
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    check-cast p2, Lf2/q;

    .line 782
    .line 783
    iget p2, p2, Lf2/q;->f:I

    .line 784
    .line 785
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 786
    .line 787
    .line 788
    move-result-object p2

    .line 789
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 790
    .line 791
    .line 792
    move-result v0

    .line 793
    :goto_10
    return v0

    .line 794
    :pswitch_14
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v0, Ljava/util/Comparator;

    .line 797
    .line 798
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-eqz v0, :cond_14

    .line 803
    .line 804
    goto :goto_11

    .line 805
    :cond_14
    sget-object v0, Lx1/f0;->Z:Lb8/c;

    .line 806
    .line 807
    check-cast p1, Lf2/q;

    .line 808
    .line 809
    iget-object p1, p1, Lf2/q;->c:Lx1/f0;

    .line 810
    .line 811
    check-cast p2, Lf2/q;

    .line 812
    .line 813
    iget-object p2, p2, Lf2/q;->c:Lx1/f0;

    .line 814
    .line 815
    invoke-virtual {v0, p1, p2}, Lb8/c;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 816
    .line 817
    .line 818
    move-result v0

    .line 819
    :goto_11
    return v0

    .line 820
    :pswitch_15
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v0, La9/h;

    .line 823
    .line 824
    invoke-virtual {v0, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_15

    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_15
    check-cast p2, Ljava/util/Map$Entry;

    .line 832
    .line 833
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object p2

    .line 837
    check-cast p2, Ljava/lang/String;

    .line 838
    .line 839
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 840
    .line 841
    .line 842
    move-result p2

    .line 843
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 844
    .line 845
    .line 846
    move-result-object p2

    .line 847
    check-cast p1, Ljava/util/Map$Entry;

    .line 848
    .line 849
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    check-cast p1, Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 856
    .line 857
    .line 858
    move-result p1

    .line 859
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    invoke-virtual {p2, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    :goto_12
    return v0

    .line 868
    :pswitch_16
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v0, Lc9/a0;

    .line 871
    .line 872
    invoke-virtual {v0, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    if-eqz v0, :cond_16

    .line 877
    .line 878
    goto :goto_13

    .line 879
    :cond_16
    check-cast p2, Lda/f;

    .line 880
    .line 881
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 882
    .line 883
    invoke-virtual {p2}, Landroid/widget/TextView;->getTextSize()F

    .line 884
    .line 885
    .line 886
    move-result p2

    .line 887
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 888
    .line 889
    .line 890
    move-result-object p2

    .line 891
    check-cast p1, Lda/f;

    .line 892
    .line 893
    iget-object p1, p1, Lda/f;->b:Landroid/widget/TextView;

    .line 894
    .line 895
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 896
    .line 897
    .line 898
    move-result p1

    .line 899
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 900
    .line 901
    .line 902
    move-result-object p1

    .line 903
    invoke-virtual {p2, p1}, Ljava/lang/Float;->compareTo(Ljava/lang/Object;)I

    .line 904
    .line 905
    .line 906
    move-result v0

    .line 907
    :goto_13
    return v0

    .line 908
    :pswitch_17
    check-cast p1, Lda/f;

    .line 909
    .line 910
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v0, Lda/h;

    .line 913
    .line 914
    iget-object v1, p1, Lda/f;->a:Landroid/view/View;

    .line 915
    .line 916
    iget-object p1, p1, Lda/f;->b:Landroid/widget/TextView;

    .line 917
    .line 918
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-static {v1, p1}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object p1

    .line 925
    invoke-static {p1}, Lda/h;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object p1

    .line 929
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 930
    .line 931
    .line 932
    move-result p1

    .line 933
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 934
    .line 935
    .line 936
    move-result-object p1

    .line 937
    check-cast p2, Lda/f;

    .line 938
    .line 939
    iget-object v0, p2, Lda/f;->a:Landroid/view/View;

    .line 940
    .line 941
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 942
    .line 943
    invoke-static {v0, p2}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object p2

    .line 947
    invoke-static {p2}, Lda/h;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object p2

    .line 951
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 952
    .line 953
    .line 954
    move-result p2

    .line 955
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 956
    .line 957
    .line 958
    move-result-object p2

    .line 959
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 960
    .line 961
    .line 962
    move-result p1

    .line 963
    return p1

    .line 964
    :pswitch_18
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v0, Lda/g;

    .line 967
    .line 968
    invoke-virtual {v0, p1, p2}, Lda/g;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 969
    .line 970
    .line 971
    move-result v0

    .line 972
    if-eqz v0, :cond_17

    .line 973
    .line 974
    goto :goto_14

    .line 975
    :cond_17
    check-cast p2, Lda/e;

    .line 976
    .line 977
    iget-object p2, p2, Lda/e;->a:Lda/f;

    .line 978
    .line 979
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 980
    .line 981
    invoke-virtual {p2}, Landroid/widget/TextView;->getTextSize()F

    .line 982
    .line 983
    .line 984
    move-result p2

    .line 985
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 986
    .line 987
    .line 988
    move-result-object p2

    .line 989
    check-cast p1, Lda/e;

    .line 990
    .line 991
    iget-object p1, p1, Lda/e;->a:Lda/f;

    .line 992
    .line 993
    iget-object p1, p1, Lda/f;->b:Landroid/widget/TextView;

    .line 994
    .line 995
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 996
    .line 997
    .line 998
    move-result p1

    .line 999
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p1

    .line 1003
    invoke-virtual {p2, p1}, Ljava/lang/Float;->compareTo(Ljava/lang/Object;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v0

    .line 1007
    :goto_14
    return v0

    .line 1008
    :pswitch_19
    const/4 v0, 0x1

    .line 1009
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    const/4 v1, 0x0

    .line 1014
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    iget-object v2, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v2, La9/h;

    .line 1021
    .line 1022
    invoke-virtual {v2, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    if-eqz v2, :cond_18

    .line 1027
    .line 1028
    goto :goto_16

    .line 1029
    :cond_18
    check-cast p1, Lda/e;

    .line 1030
    .line 1031
    iget-boolean p1, p1, Lda/e;->c:Z

    .line 1032
    .line 1033
    if-eqz p1, :cond_19

    .line 1034
    .line 1035
    move-object p1, v1

    .line 1036
    goto :goto_15

    .line 1037
    :cond_19
    move-object p1, v0

    .line 1038
    :goto_15
    check-cast p2, Lda/e;

    .line 1039
    .line 1040
    iget-boolean p2, p2, Lda/e;->c:Z

    .line 1041
    .line 1042
    if-eqz p2, :cond_1a

    .line 1043
    .line 1044
    move-object v0, v1

    .line 1045
    :cond_1a
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    :goto_16
    return v2

    .line 1050
    :pswitch_1a
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v0, La9/h;

    .line 1053
    .line 1054
    invoke-virtual {v0, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1055
    .line 1056
    .line 1057
    move-result v0

    .line 1058
    if-eqz v0, :cond_1b

    .line 1059
    .line 1060
    goto :goto_17

    .line 1061
    :cond_1b
    check-cast p1, Lhb/t;

    .line 1062
    .line 1063
    iget-wide v0, p1, Lhb/t;->a:J

    .line 1064
    .line 1065
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1066
    .line 1067
    .line 1068
    move-result-object p1

    .line 1069
    check-cast p2, Lhb/t;

    .line 1070
    .line 1071
    iget-wide v0, p2, Lhb/t;->a:J

    .line 1072
    .line 1073
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p2

    .line 1077
    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    :goto_17
    return v0

    .line 1082
    :pswitch_1b
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v0, Lc9/h1;

    .line 1085
    .line 1086
    invoke-virtual {v0, p1, p2}, Lc9/h1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1087
    .line 1088
    .line 1089
    move-result v0

    .line 1090
    if-eqz v0, :cond_1c

    .line 1091
    .line 1092
    goto :goto_18

    .line 1093
    :cond_1c
    check-cast p1, Ltf/w;

    .line 1094
    .line 1095
    iget p1, p1, Ltf/w;->a:I

    .line 1096
    .line 1097
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1098
    .line 1099
    .line 1100
    move-result-object p1

    .line 1101
    check-cast p2, Ltf/w;

    .line 1102
    .line 1103
    iget p2, p2, Ltf/w;->a:I

    .line 1104
    .line 1105
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1106
    .line 1107
    .line 1108
    move-result-object p2

    .line 1109
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    :goto_18
    return v0

    .line 1114
    :pswitch_1c
    iget-object v0, p0, Lc9/a0;->h:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v0, Lc9/z;

    .line 1117
    .line 1118
    invoke-virtual {v0, p1, p2}, Lc9/z;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1119
    .line 1120
    .line 1121
    move-result v0

    .line 1122
    if-eqz v0, :cond_1d

    .line 1123
    .line 1124
    goto :goto_19

    .line 1125
    :cond_1d
    check-cast p1, Lwb/jv;

    .line 1126
    .line 1127
    iget-object p1, p1, Lwb/jv;->b:Ljava/lang/String;

    .line 1128
    .line 1129
    check-cast p2, Lwb/jv;

    .line 1130
    .line 1131
    iget-object p2, p2, Lwb/jv;->b:Ljava/lang/String;

    .line 1132
    .line 1133
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 1134
    .line 1135
    .line 1136
    move-result v0

    .line 1137
    :goto_19
    return v0

    .line 1138
    nop

    .line 1139
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
