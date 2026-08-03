.class public final Ll8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ll8/d;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Log/k;

    .line 24
    .line 25
    const-string v0, "&#(x[0-9a-fA-F]+|[0-9]+);"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Log/k;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Li2/z;

    .line 31
    .line 32
    const/16 v1, 0x14

    .line 33
    .line 34
    invoke-direct {v0, v1}, Li2/z;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0, v0}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final varargs b(Ll8/d;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length p0, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    if-ge v0, p0, :cond_2

    .line 7
    .line 8
    aget-object v1, p1, v0

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v1, 0x0

    .line 35
    :goto_2
    if-eqz v1, :cond_3

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_3
    array-length p0, p1

    .line 39
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    :cond_0
    invoke-static {p0}, Ll8/d;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ll8/d;->j(Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v3, "announcement@all"

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_0
    const/4 v2, 0x1

    .line 47
    invoke-static {p0, v3, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    :goto_1
    sget-object p0, Ll8/c;->j:Ll8/c;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const-string v4, "notify@all"

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_9

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v6, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_8

    .line 87
    .line 88
    const-string v7, "all"

    .line 89
    .line 90
    invoke-static {v6, v7}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_8

    .line 95
    .line 96
    const-string v7, "@all"

    .line 97
    .line 98
    invoke-static {v6, v7}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_7

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    move v6, v5

    .line 106
    goto :goto_3

    .line 107
    :cond_8
    :goto_2
    move v6, v2

    .line 108
    :goto_3
    if-eqz v6, :cond_6

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_9
    :goto_4
    invoke-static {p0, v4, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_c

    .line 116
    .line 117
    const-string v3, "atall"

    .line 118
    .line 119
    invoke-static {p0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const-string v6, ".msgsource.atall"

    .line 124
    .line 125
    invoke-static {p0, v6}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {p0, v3}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    filled-new-array {v4, v6, p0}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-lez v3, :cond_a

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_a
    const-string v3, "true"

    .line 163
    .line 164
    invoke-virtual {p0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_b

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_b
    move p0, v5

    .line 172
    goto :goto_6

    .line 173
    :cond_c
    :goto_5
    move p0, v2

    .line 174
    :goto_6
    if-nez p2, :cond_d

    .line 175
    .line 176
    move-object p2, v0

    .line 177
    :cond_d
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_17

    .line 182
    .line 183
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_e

    .line 188
    .line 189
    goto/16 :goto_9

    .line 190
    .line 191
    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_17

    .line 200
    .line 201
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Ljava/lang/String;

    .line 206
    .line 207
    invoke-static {v4, p2}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_f

    .line 212
    .line 213
    if-nez p1, :cond_10

    .line 214
    .line 215
    move-object p1, v0

    .line 216
    :cond_10
    const-string v0, ":\n"

    .line 217
    .line 218
    const/4 v3, 0x6

    .line 219
    invoke-static {p1, v0, v5, v5, v3}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-lez v0, :cond_11

    .line 224
    .line 225
    add-int/lit8 v0, v0, 0x2

    .line 226
    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    :cond_11
    move v0, v5

    .line 232
    :goto_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-ge v0, v3, :cond_17

    .line 237
    .line 238
    const/16 v3, 0x40

    .line 239
    .line 240
    const/4 v4, 0x4

    .line 241
    invoke-static {p1, v3, v0, v4}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-gez v0, :cond_12

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_12
    add-int/lit8 v6, v0, 0x1

    .line 249
    .line 250
    const/16 v7, 0x2005

    .line 251
    .line 252
    invoke-static {p1, v7, v6, v4}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-gez v4, :cond_13

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_13
    sub-int v0, v4, v0

    .line 260
    .line 261
    const/16 v7, 0x28

    .line 262
    .line 263
    if-gt v0, v7, :cond_16

    .line 264
    .line 265
    invoke-virtual {p1, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-static {v0, v3, v0}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {}, Lh/Hchat/hooks/api/model/WeChatMessage;->access$getAT_ALL_LABELS$cp()Ljava/util/Set;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, Ljava/lang/Iterable;

    .line 286
    .line 287
    instance-of v6, v3, Ljava/util/Collection;

    .line 288
    .line 289
    if-eqz v6, :cond_14

    .line 290
    .line 291
    move-object v6, v3

    .line 292
    check-cast v6, Ljava/util/Collection;

    .line 293
    .line 294
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-eqz v6, :cond_14

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_14
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-eqz v6, :cond_16

    .line 310
    .line 311
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    check-cast v6, Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v6, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-eqz v6, :cond_15

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_16
    :goto_8
    add-int/lit8 v0, v4, 0x1

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_17
    :goto_9
    move v2, v5

    .line 328
    :goto_a
    if-nez p0, :cond_1d

    .line 329
    .line 330
    if-eqz v2, :cond_18

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_18
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    if-nez p0, :cond_1b

    .line 338
    .line 339
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    if-eqz p0, :cond_19

    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    :cond_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-eqz p1, :cond_1b

    .line 355
    .line 356
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    check-cast p1, Ljava/lang/String;

    .line 361
    .line 362
    invoke-static {p1, p2}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_1a

    .line 367
    .line 368
    sget-object p0, Ll8/c;->h:Ll8/c;

    .line 369
    .line 370
    return-object p0

    .line 371
    :cond_1b
    :goto_b
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result p0

    .line 375
    if-eqz p0, :cond_1c

    .line 376
    .line 377
    sget-object p0, Ll8/c;->g:Ll8/c;

    .line 378
    .line 379
    return-object p0

    .line 380
    :cond_1c
    sget-object p0, Ll8/c;->k:Ll8/c;

    .line 381
    .line 382
    return-object p0

    .line 383
    :cond_1d
    :goto_c
    sget-object p0, Ll8/c;->i:Ll8/c;

    .line 384
    .line 385
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, ":\n"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-static {p0, v0, v1, v1, v2}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    const/16 v3, 0x3c

    .line 16
    .line 17
    invoke-static {p0, v3, v1, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-le v1, v0, :cond_1

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_1
    return-object p0
.end method

.method public static varargs e([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move v4, v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    const/4 v4, 0x1

    .line 20
    :goto_2
    if-nez v4, :cond_2

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    const/4 v3, 0x0

    .line 27
    :goto_3
    if-nez v3, :cond_4

    .line 28
    .line 29
    const-string p0, ""

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    return-object v3
.end method

.method public static f(Ljava/lang/String;)I
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, ":\n<msg>"

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_9

    .line 13
    .line 14
    const-string v0, "<appmsg"

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v0, "<img"

    .line 24
    .line 25
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    return p0

    .line 33
    :cond_2
    const-string v0, "<voicemsg"

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    const/16 p0, 0x22

    .line 42
    .line 43
    return p0

    .line 44
    :cond_3
    const-string v0, "<videomsg"

    .line 45
    .line 46
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const/16 p0, 0x2b

    .line 53
    .line 54
    return p0

    .line 55
    :cond_4
    const-string v0, "<emoji"

    .line 56
    .line 57
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    const/16 p0, 0x2f

    .line 64
    .line 65
    return p0

    .line 66
    :cond_5
    const-string v0, "<location"

    .line 67
    .line 68
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    const/16 p0, 0x30

    .line 75
    .line 76
    return p0

    .line 77
    :cond_6
    const-string v0, "revoke"

    .line 78
    .line 79
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    .line 85
    const-string v0, "\u64a4\u56de"

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-static {p0, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_7

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_7
    return v1

    .line 96
    :cond_8
    :goto_0
    const/16 p0, 0x2712

    .line 97
    .line 98
    return p0

    .line 99
    :cond_9
    :goto_1
    const/16 p0, 0x31

    .line 100
    .line 101
    return p0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, "@chatroom"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    const-string v0, "@im.chatroom"

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string v0, "@openim"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v1

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, "type"

    .line 6
    .line 7
    invoke-static {p0, v0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v1

    .line 24
    :goto_0
    const/16 v2, 0x33

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne v0, v2, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const-string v0, "<finderFeed>"

    .line 34
    .line 35
    invoke-static {p0, v0, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_5

    .line 40
    .line 41
    const-string v0, "<finderObject>"

    .line 42
    .line 43
    invoke-static {p0, v0, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    const-string v0, "<finderUsername>"

    .line 50
    .line 51
    invoke-static {p0, v0, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    const-string v0, "<objectId>"

    .line 58
    .line 59
    invoke-static {p0, v0, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    const-string v0, "<objectNonceId>"

    .line 66
    .line 67
    invoke-static {p0, v0, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    return v1

    .line 75
    :cond_5
    :goto_2
    return v3
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    invoke-static {p0}, Ll8/d;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_4

    .line 18
    .line 19
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v1, Log/k;

    .line 34
    .line 35
    const-string v2, "\\s*=\\s*([\'\"])(.*?)\\1"

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v1, v2, v3}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Log/k;

    .line 46
    .line 47
    const-string v4, "\\s*=\\s*<!\\[CDATA\\[(.*?)]]>"

    .line 48
    .line 49
    invoke-virtual {p1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {v2, v4, v3}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Log/k;

    .line 57
    .line 58
    const-string v5, "\\s*=\\s*([^,;\\s}]+)"

    .line 59
    .line 60
    invoke-virtual {p1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v4, p1, v3}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    filled-new-array {v1, v2, v4}, [Log/k;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_0
    const/4 v1, 0x3

    .line 72
    if-lt v3, v1, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    aget-object v1, p1, v3

    .line 76
    .line 77
    invoke-static {v1, p0}, Log/k;->b(Log/k;Ljava/lang/String;)Log/i;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-virtual {v1}, Log/i;->a()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static j(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, "atuserlist"

    .line 6
    .line 7
    invoke-static {p0, v0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ".msgsource.atuserlist"

    .line 12
    .line 13
    invoke-static {p0, v2}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0, v0}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    filled-new-array {v1, v2, p0}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    const/4 v0, 0x4

    .line 39
    new-array v0, v0, [C

    .line 40
    .line 41
    fill-array-data v0, :array_0

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x6

    .line 45
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    move-object v2, v1

    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_3

    .line 105
    .line 106
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    return-object p0

    .line 111
    :array_0
    .array-data 2
        0x2cs
        0x3bs
        0x7cs
        0x20s
    .end array-data
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 19

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object v11, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object/from16 v11, p0

    .line 8
    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    move-object/from16 v1, p1

    .line 14
    .line 15
    :goto_1
    if-nez p2, :cond_2

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    move-object/from16 v0, p2

    .line 19
    .line 20
    :goto_2
    if-nez p5, :cond_3

    .line 21
    .line 22
    invoke-static {v11}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    const-string v2, ":\n"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static {v0, v3, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_3
    move-object v12, v0

    .line 52
    new-instance v1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 53
    .line 54
    if-lez p6, :cond_4

    .line 55
    .line 56
    move/from16 v6, p6

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    invoke-static {v12}, Ll8/d;->f(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    move v6, v0

    .line 64
    :goto_3
    const-string v15, ""

    .line 65
    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const-wide/16 v2, 0x0

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    const-string v13, ""

    .line 72
    .line 73
    const-string v14, ""

    .line 74
    .line 75
    move-wide/from16 v9, p3

    .line 76
    .line 77
    move/from16 v8, p5

    .line 78
    .line 79
    move-wide/from16 v4, p7

    .line 80
    .line 81
    move-object/from16 v17, p9

    .line 82
    .line 83
    move-object/from16 v18, p10

    .line 84
    .line 85
    invoke-direct/range {v1 .. v18}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&lt;"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "&gt;"

    .line 11
    .line 12
    const-string v1, ">"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&quot;"

    .line 19
    .line 20
    const-string v1, "\""

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&apos;"

    .line 27
    .line 28
    const-string v1, "\'"

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&amp;"

    .line 35
    .line 36
    const-string v1, "&"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_4

    .line 5
    .line 6
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const-string v0, "\\b"

    .line 21
    .line 22
    const-string v1, "\\s*=\\s*([\'\"])(.*?)\\1"

    .line 23
    .line 24
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-static {v0}, Ll3/w;->f(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {p1, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-static {p1, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 p0, 0x0

    .line 66
    :goto_0
    if-nez p0, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object p0

    .line 70
    :cond_4
    :goto_1
    const-string p0, ""

    .line 71
    .line 72
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_5

    .line 5
    .line 6
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    const-string v0, "\\b[^>]*>(.*?)</"

    .line 21
    .line 22
    const-string v1, ">"

    .line 23
    .line 24
    const-string v2, "<"

    .line 25
    .line 26
    invoke-static {v2, p1, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v0, Log/l;->h:Log/l;

    .line 31
    .line 32
    sget-object v1, Log/l;->i:Log/l;

    .line 33
    .line 34
    filled-new-array {v0, v1}, [Log/l;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x0

    .line 49
    move v2, v1

    .line 50
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Log/l;

    .line 61
    .line 62
    iget v3, v3, Log/l;->g:I

    .line 63
    .line 64
    or-int/2addr v2, v3

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {v2}, Ll3/w;->f(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const/4 p1, 0x1

    .line 95
    invoke-static {p1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    const/4 p0, 0x0

    .line 113
    :goto_1
    if-nez p0, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    return-object p0

    .line 117
    :cond_5
    :goto_2
    const-string p0, ""

    .line 118
    .line 119
    return-object p0
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_6

    .line 5
    .line 6
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_1
    const-string v0, "><!\\[CDATA\\[(.*?)]]></"

    .line 23
    .line 24
    const-string v1, "<"

    .line 25
    .line 26
    const-string v2, ">"

    .line 27
    .line 28
    invoke-static {v1, p1, v0, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-static {v3}, Ll3/w;->f(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v0, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static {v0, v3, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v4, 0x1

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Log/g;

    .line 64
    .line 65
    invoke-virtual {p0, v4}, Log/g;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ljava/lang/String;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_2
    const-string v0, ">(.*?)</"

    .line 73
    .line 74
    invoke-static {v1, p1, v0, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object v0, Log/l;->i:Log/l;

    .line 79
    .line 80
    sget-object v1, Log/l;->h:Log/l;

    .line 81
    .line 82
    filled-new-array {v1, v0}, [Log/l;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/Iterable;

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move v1, v3

    .line 97
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Log/l;

    .line 108
    .line 109
    iget v2, v2, Log/l;->g:I

    .line 110
    .line 111
    or-int/2addr v1, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    invoke-static {v1}, Ll3/w;->f(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {p1, v3, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-eqz p0, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {v4, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz p0, :cond_4

    .line 148
    .line 149
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    goto :goto_1

    .line 158
    :cond_4
    const/4 p0, 0x0

    .line 159
    :goto_1
    if-nez p0, :cond_5

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    return-object p0

    .line 163
    :cond_6
    :goto_2
    const-string p0, ""

    .line 164
    .line 165
    return-object p0
.end method
