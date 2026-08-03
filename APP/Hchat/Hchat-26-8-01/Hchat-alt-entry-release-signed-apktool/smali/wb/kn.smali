.class public final Lwb/kn;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 35
    iput p2, p0, Lwb/kn;->g:I

    iput-object p1, p0, Lwb/kn;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput v0, p0, Lwb/kn;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Lxe/n;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Lxe/n;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Ljava/util/stream/Collectors;->toSet()Ljava/util/stream/Collector;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/Set;

    .line 31
    .line 32
    iput-object p1, p0, Lwb/kn;->h:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lwb/kn;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Lwb/kn;->g:I

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Lwb/kn;->h:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v5, Lr4/m;

    .line 19
    .line 20
    invoke-virtual {v5, p1, p2}, Lr4/m;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    check-cast p1, Lya/e;

    .line 28
    .line 29
    iget p1, p1, Lya/e;->c:I

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-lez p1, :cond_1

    .line 36
    .line 37
    move p1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move p1, v2

    .line 40
    :goto_0
    if-eqz p1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v1, v4

    .line 44
    :goto_1
    if-eqz v1, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move-object v1, v0

    .line 48
    :goto_2
    check-cast p2, Lya/e;

    .line 49
    .line 50
    iget p1, p2, Lya/e;->c:I

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-lez p1, :cond_4

    .line 57
    .line 58
    move v2, v3

    .line 59
    :cond_4
    if-eqz v2, :cond_5

    .line 60
    .line 61
    move-object v4, p2

    .line 62
    :cond_5
    if-eqz v4, :cond_6

    .line 63
    .line 64
    move-object v0, v4

    .line 65
    :cond_6
    invoke-virtual {v1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    :goto_3
    return v1

    .line 70
    :pswitch_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v5, Lr4/m;

    .line 75
    .line 76
    invoke-virtual {v5, p1, p2}, Lr4/m;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    goto :goto_7

    .line 83
    :cond_7
    check-cast p1, Landroid/view/ViewGroup;

    .line 84
    .line 85
    sget-object v1, Lya/g;->e:Log/k;

    .line 86
    .line 87
    invoke-static {p1}, Luf/d;->e(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-lez p1, :cond_8

    .line 96
    .line 97
    move p1, v3

    .line 98
    goto :goto_4

    .line 99
    :cond_8
    move p1, v2

    .line 100
    :goto_4
    if-eqz p1, :cond_9

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_9
    move-object v1, v4

    .line 104
    :goto_5
    if-eqz v1, :cond_a

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_a
    move-object v1, v0

    .line 108
    :goto_6
    check-cast p2, Landroid/view/ViewGroup;

    .line 109
    .line 110
    invoke-static {p2}, Luf/d;->e(Landroid/view/View;)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-lez p1, :cond_b

    .line 119
    .line 120
    move v2, v3

    .line 121
    :cond_b
    if-eqz v2, :cond_c

    .line 122
    .line 123
    move-object v4, p2

    .line 124
    :cond_c
    if-eqz v4, :cond_d

    .line 125
    .line 126
    move-object v0, v4

    .line 127
    :cond_d
    invoke-virtual {v1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    :goto_7
    return v1

    .line 132
    :pswitch_1
    check-cast p1, Lxe/p;

    .line 133
    .line 134
    check-cast p2, Lxe/p;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v4}, Lwb/kn;->a(Ljava/util/List;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_f

    .line 144
    .line 145
    invoke-virtual {p0, v4}, Lwb/kn;->a(Ljava/util/List;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_e

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_e
    move p1, v2

    .line 153
    goto :goto_9

    .line 154
    :cond_f
    :goto_8
    move p1, v3

    .line 155
    :goto_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v4}, Lwb/kn;->a(Ljava/util/List;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-nez p2, :cond_10

    .line 163
    .line 164
    invoke-virtual {p0, v4}, Lwb/kn;->a(Ljava/util/List;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_11

    .line 169
    .line 170
    :cond_10
    move v2, v3

    .line 171
    :cond_11
    invoke-static {p1, v2}, Ljava/lang/Boolean;->compare(ZZ)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    neg-int p1, p1

    .line 176
    return p1

    .line 177
    :pswitch_2
    check-cast v5, Lwb/kn;

    .line 178
    .line 179
    invoke-virtual {v5, p1, p2}, Lwb/kn;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_12

    .line 184
    .line 185
    goto :goto_a

    .line 186
    :cond_12
    check-cast p1, Lsf/e;

    .line 187
    .line 188
    iget-object p1, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Ljava/lang/Comparable;

    .line 191
    .line 192
    check-cast p2, Lsf/e;

    .line 193
    .line 194
    iget-object p2, p2, Lsf/e;->g:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p2, Ljava/lang/Comparable;

    .line 197
    .line 198
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    :goto_a
    return v0

    .line 203
    :pswitch_3
    check-cast p1, Lsf/e;

    .line 204
    .line 205
    check-cast v5, Lfg/l;

    .line 206
    .line 207
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-interface {v5, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    check-cast p1, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    xor-int/2addr p1, v3

    .line 220
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p2, Lsf/e;

    .line 225
    .line 226
    iget-object p2, p2, Lsf/e;->h:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-interface {v5, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    check-cast p2, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    xor-int/2addr p2, v3

    .line 239
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    return p1

    .line 248
    :pswitch_4
    check-cast v5, Lwb/e2;

    .line 249
    .line 250
    invoke-virtual {v5, p1, p2}, Lwb/e2;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_13

    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_13
    check-cast p1, Lwb/m5;

    .line 258
    .line 259
    iget-object p1, p1, Lwb/m5;->a:Lwb/s0;

    .line 260
    .line 261
    iget-object p1, p1, Lwb/s0;->b:Ljava/lang/String;

    .line 262
    .line 263
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 264
    .line 265
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p2, Lwb/m5;

    .line 270
    .line 271
    iget-object p2, p2, Lwb/m5;->a:Lwb/s0;

    .line 272
    .line 273
    iget-object p2, p2, Lwb/s0;->b:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    :goto_b
    return v0

    .line 287
    :pswitch_5
    check-cast v5, Lwb/kn;

    .line 288
    .line 289
    invoke-virtual {v5, p1, p2}, Lwb/kn;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_14

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_14
    check-cast p1, Lwb/s0;

    .line 297
    .line 298
    iget-object p1, p1, Lwb/s0;->b:Ljava/lang/String;

    .line 299
    .line 300
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 301
    .line 302
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    check-cast p2, Lwb/s0;

    .line 307
    .line 308
    iget-object p2, p2, Lwb/s0;->b:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    :goto_c
    return v0

    .line 322
    :pswitch_6
    check-cast v5, Lwb/kn;

    .line 323
    .line 324
    invoke-virtual {v5, p1, p2}, Lwb/kn;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-eqz v0, :cond_15

    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_15
    check-cast p1, Lwb/s0;

    .line 332
    .line 333
    iget-boolean p1, p1, Lwb/s0;->g:Z

    .line 334
    .line 335
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    check-cast p2, Lwb/s0;

    .line 340
    .line 341
    iget-boolean p2, p2, Lwb/s0;->g:Z

    .line 342
    .line 343
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    :goto_d
    return v0

    .line 352
    :pswitch_7
    check-cast v5, Lc9/z;

    .line 353
    .line 354
    invoke-virtual {v5, p1, p2}, Lc9/z;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_16

    .line 359
    .line 360
    goto :goto_e

    .line 361
    :cond_16
    check-cast p1, Lwb/s0;

    .line 362
    .line 363
    iget-boolean p1, p1, Lwb/s0;->c:Z

    .line 364
    .line 365
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    check-cast p2, Lwb/s0;

    .line 370
    .line 371
    iget-boolean p2, p2, Lwb/s0;->c:Z

    .line 372
    .line 373
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 374
    .line 375
    .line 376
    move-result-object p2

    .line 377
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    :goto_e
    return v0

    .line 382
    :pswitch_8
    check-cast p1, Lvb/a;

    .line 383
    .line 384
    check-cast v5, Ljava/util/List;

    .line 385
    .line 386
    invoke-interface {p1}, Lvb/a;->a()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-interface {v5, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 391
    .line 392
    .line 393
    move-result p1

    .line 394
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    check-cast p2, Lvb/a;

    .line 399
    .line 400
    invoke-interface {p2}, Lvb/a;->a()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    invoke-interface {v5, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object p2

    .line 412
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    return p1

    .line 417
    :pswitch_9
    check-cast v5, Lwb/kn;

    .line 418
    .line 419
    invoke-virtual {v5, p1, p2}, Lwb/kn;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_17

    .line 424
    .line 425
    goto :goto_f

    .line 426
    :cond_17
    check-cast p1, Le9/c;

    .line 427
    .line 428
    iget-object p1, p1, Le9/c;->c:Ljava/lang/String;

    .line 429
    .line 430
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 431
    .line 432
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    check-cast p2, Le9/c;

    .line 437
    .line 438
    iget-object p2, p2, Le9/c;->c:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p2

    .line 444
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    :goto_f
    return v0

    .line 452
    :pswitch_a
    check-cast v5, Lwb/e2;

    .line 453
    .line 454
    invoke-virtual {v5, p1, p2}, Lwb/e2;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_18

    .line 459
    .line 460
    goto :goto_10

    .line 461
    :cond_18
    check-cast p1, Le9/c;

    .line 462
    .line 463
    iget-boolean p1, p1, Le9/c;->d:Z

    .line 464
    .line 465
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    check-cast p2, Le9/c;

    .line 470
    .line 471
    iget-boolean p2, p2, Le9/c;->d:Z

    .line 472
    .line 473
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 474
    .line 475
    .line 476
    move-result-object p2

    .line 477
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Object;)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    :goto_10
    return v0

    .line 482
    :pswitch_b
    check-cast v5, Lwb/e2;

    .line 483
    .line 484
    invoke-virtual {v5, p1, p2}, Lwb/e2;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_19

    .line 489
    .line 490
    goto :goto_11

    .line 491
    :cond_19
    check-cast p1, Le9/c;

    .line 492
    .line 493
    iget-object p1, p1, Le9/c;->c:Ljava/lang/String;

    .line 494
    .line 495
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 496
    .line 497
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    check-cast p2, Le9/c;

    .line 502
    .line 503
    iget-object p2, p2, Le9/c;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object p2

    .line 509
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    :goto_11
    return v0

    .line 517
    :pswitch_c
    check-cast v5, Lc9/a0;

    .line 518
    .line 519
    invoke-virtual {v5, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-eqz v0, :cond_1a

    .line 524
    .line 525
    goto :goto_12

    .line 526
    :cond_1a
    check-cast p1, Ljava/lang/String;

    .line 527
    .line 528
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 529
    .line 530
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    check-cast p2, Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object p2

    .line 540
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    :goto_12
    return v0

    .line 548
    nop

    .line 549
    :pswitch_data_0
    .packed-switch 0x0
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
