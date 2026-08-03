.class public final Lbe/e;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbe/e;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lnd/b0;I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnd/b0;->O()Lb5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lb5/k;->b:I

    .line 6
    .line 7
    iget v2, v0, Lb5/k;->b:I

    .line 8
    .line 9
    iget v3, v0, Lb5/k;->c:I

    .line 10
    .line 11
    and-int/lit8 v4, v1, 0x7

    .line 12
    .line 13
    if-ne v4, p1, :cond_0

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    and-int/lit8 v1, v1, -0x8

    .line 18
    .line 19
    new-instance v4, Lb5/k;

    .line 20
    .line 21
    or-int/2addr p1, v1

    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-direct {v4, p1, v3, v1}, Lb5/k;-><init>(III)V

    .line 24
    .line 25
    .line 26
    :goto_0
    if-eq v4, v0, :cond_5

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Lnd/b0;->Q(Lb5/k;)V

    .line 29
    .line 30
    .line 31
    and-int/lit8 p1, v2, 0x7

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const-string p1, "package-private"

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v0}, Lb5/k;->g()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    const-string p1, "public"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {v0}, Lb5/k;->e()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const-string p1, "private"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {v0}, Lb5/k;->f()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const-string p1, "protected"

    .line 63
    .line 64
    :goto_1
    const-string v0, "Access modifiers changed from: "

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, p1}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    new-instance p0, Lb5/k;

    .line 75
    .line 76
    and-int/lit8 p1, v2, 0x7

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    invoke-direct {p0, p1, v3, v0}, Lb5/k;-><init>(III)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string p1, "Unknown visibility flags: "

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    return-void
.end method

.method public static j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;
    .locals 2

    .line 1
    invoke-static {p2}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p0, p2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "valueOf"

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, v0, v1, p1, p2}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method


# virtual methods
.method public final f(Lud/u;)V
    .locals 8

    .line 1
    iget v0, p0, Lbe/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lfe/a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lfe/a;-><init>(Lud/u;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p1, Lud/u;->a:Lbc/g;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_d

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lud/e;

    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v3, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 50
    .line 51
    .line 52
    move-object v4, v1

    .line 53
    :goto_1
    if-eqz v4, :cond_5

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "Found \'super\' loop in classes: "

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    new-instance v5, Lbe/i0;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-direct {v5, v4, v6}, Lbe/i0;-><init>(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v3, v5}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_1
    iget-object v5, v4, Lud/e;->u:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_3

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lud/g;

    .line 98
    .line 99
    iget-object v7, v6, Lud/g;->m:Lb5/k;

    .line 100
    .line 101
    invoke-virtual {v7}, Lb5/k;->h()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_2

    .line 106
    .line 107
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    iget-object v4, v4, Lud/e;->p:Lqd/j;

    .line 112
    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    iget-object v5, v1, Lud/e;->k:Lud/u;

    .line 117
    .line 118
    invoke-virtual {v5, v4}, Lud/u;->g(Lqd/j;)Lud/e;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 130
    .line 131
    goto/16 :goto_7

    .line 132
    .line 133
    :cond_6
    new-instance v3, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_7

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, Lud/g;

    .line 157
    .line 158
    iget-object v5, v4, Lud/g;->l:Lod/c;

    .line 159
    .line 160
    iget-object v5, v5, Lod/c;->h:Ljava/lang/String;

    .line 161
    .line 162
    new-instance v6, Lae/d;

    .line 163
    .line 164
    const/16 v7, 0x10

    .line 165
    .line 166
    invoke-direct {v6, v7}, Lae/d;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    new-instance v4, La7/b;

    .line 184
    .line 185
    const/16 v5, 0x14

    .line 186
    .line 187
    invoke-direct {v4, v5}, La7/b;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v2, v4}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_8
    new-instance v2, Ljava/util/HashMap;

    .line 203
    .line 204
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    :cond_9
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_c

    .line 220
    .line 221
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Ljava/util/List;

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    check-cast v5, Lud/g;

    .line 233
    .line 234
    iget-object v5, v5, Lud/g;->k:Lud/e;

    .line 235
    .line 236
    if-ne v5, v1, :cond_a

    .line 237
    .line 238
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    const/4 v6, 0x2

    .line 243
    if-ne v5, v6, :cond_a

    .line 244
    .line 245
    const/4 v5, 0x1

    .line 246
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    check-cast v4, Lud/g;

    .line 251
    .line 252
    iget-object v5, v4, Lud/g;->k:Lud/e;

    .line 253
    .line 254
    if-eq v5, v1, :cond_9

    .line 255
    .line 256
    iget-object v4, v4, Lud/g;->l:Lod/c;

    .line 257
    .line 258
    sget-object v5, Lbe/k0;->g:Lbe/k0;

    .line 259
    .line 260
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_a
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    :cond_b
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_9

    .line 273
    .line 274
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Lud/g;

    .line 279
    .line 280
    iget-object v6, v5, Lud/g;->k:Lud/e;

    .line 281
    .line 282
    if-eq v6, v1, :cond_b

    .line 283
    .line 284
    iget-object v5, v5, Lud/g;->l:Lod/c;

    .line 285
    .line 286
    sget-object v6, Lbe/k0;->h:Lbe/k0;

    .line 287
    .line 288
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_c
    :goto_7
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-nez v3, :cond_0

    .line 297
    .line 298
    new-instance v3, Lbe/j0;

    .line 299
    .line 300
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 301
    .line 302
    .line 303
    iput-object v2, v3, Lbe/j0;->a:Ljava/util/Map;

    .line 304
    .line 305
    invoke-virtual {v1}, Lud/e;->Z()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_d
    iput-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_1
    new-instance v0, Ljava/util/HashSet;

    .line 318
    .line 319
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 320
    .line 321
    .line 322
    iput-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 323
    .line 324
    sget-object v1, Lqd/j;->b:Lqd/g;

    .line 325
    .line 326
    const-string v2, "java.lang.Integer"

    .line 327
    .line 328
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Ljava/util/HashSet;

    .line 338
    .line 339
    sget-object v1, Lqd/j;->c:Lqd/g;

    .line 340
    .line 341
    const-string v2, "java.lang.Boolean"

    .line 342
    .line 343
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    iget-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Ljava/util/HashSet;

    .line 353
    .line 354
    sget-object v1, Lqd/j;->d:Lqd/g;

    .line 355
    .line 356
    const-string v2, "java.lang.Byte"

    .line 357
    .line 358
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    iget-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Ljava/util/HashSet;

    .line 368
    .line 369
    sget-object v1, Lqd/j;->e:Lqd/g;

    .line 370
    .line 371
    const-string v2, "java.lang.Short"

    .line 372
    .line 373
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    iget-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Ljava/util/HashSet;

    .line 383
    .line 384
    sget-object v1, Lqd/j;->f:Lqd/g;

    .line 385
    .line 386
    const-string v2, "java.lang.Character"

    .line 387
    .line 388
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    iget-object v0, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Ljava/util/HashSet;

    .line 398
    .line 399
    sget-object v1, Lqd/j;->i:Lqd/g;

    .line 400
    .line 401
    const-string v2, "java.lang.Long"

    .line 402
    .line 403
    invoke-static {p1, v1, v2}, Lbe/e;->j(Lud/u;Lqd/j;Ljava/lang/String;)Lod/d;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :pswitch_2
    iget-object p1, p1, Lud/u;->h:Lfe/a;

    .line 412
    .line 413
    iput-object p1, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 414
    .line 415
    return-void

    .line 416
    nop

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lud/r;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lbe/e;->g:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 11
    .line 12
    iget-object v3, v1, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v2, v1, Lud/r;->m:Lb5/k;

    .line 22
    .line 23
    sget-object v3, Lmd/b;->r:Lmd/b;

    .line 24
    .line 25
    iget-object v4, v1, Lmd/e;->g:Lmd/f;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lnd/x;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    iget-object v3, v3, Lnd/x;->g:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lud/m;

    .line 49
    .line 50
    invoke-interface {v3}, Lud/m;->o()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget v2, v2, Lb5/k;->b:I

    .line 55
    .line 56
    and-int/lit8 v2, v2, 0x7

    .line 57
    .line 58
    and-int/lit8 v3, v3, 0x7

    .line 59
    .line 60
    if-ne v2, v3, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v2}, Lb5/k;->k(I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v3}, Lb5/k;->k(I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ge v2, v4, :cond_2

    .line 72
    .line 73
    invoke-static {v1, v3}, Lbe/e;->i(Lnd/b0;I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    iget-object v2, v1, Lud/r;->H:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lud/r;

    .line 93
    .line 94
    iget-object v4, v0, Lbe/e;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Lfe/a;

    .line 97
    .line 98
    new-instance v5, Lah/a;

    .line 99
    .line 100
    const/16 v6, 0x1b

    .line 101
    .line 102
    invoke-direct {v5, v6}, Lah/a;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v1, v3, v5}, Lfe/a;->a(Lnd/b0;Lnd/b0;Lah/a;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    :goto_2
    return-void

    .line 110
    :pswitch_0
    iget-boolean v2, v1, Lud/r;->p:Z

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_4
    iget-object v2, v0, Lbe/e;->h:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Ljava/util/HashMap;

    .line 119
    .line 120
    iget-object v3, v1, Lud/r;->z:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_d

    .line 131
    .line 132
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Lud/a;

    .line 137
    .line 138
    iget-object v4, v4, Lud/a;->l:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Lud/p;

    .line 155
    .line 156
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    const/16 v7, 0x1e

    .line 163
    .line 164
    if-eq v6, v7, :cond_7

    .line 165
    .line 166
    const/16 v7, 0x1f

    .line 167
    .line 168
    if-eq v6, v7, :cond_7

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    goto :goto_4

    .line 172
    :cond_7
    move-object v6, v5

    .line 173
    check-cast v6, Lpd/j;

    .line 174
    .line 175
    iget-object v6, v6, Lpd/j;->o:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v6, Lod/c;

    .line 178
    .line 179
    :goto_4
    if-nez v6, :cond_8

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    iget-object v7, v5, Lud/p;->m:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    const/4 v8, 0x1

    .line 189
    sub-int/2addr v7, v8

    .line 190
    invoke-virtual {v5, v7}, Lud/p;->S(I)Lqd/l;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v5}, Lqd/l;->I()Lqd/j;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-virtual {v7}, Lqd/j;->w()Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_6

    .line 203
    .line 204
    invoke-virtual {v7}, Lqd/j;->v()Z

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-nez v9, :cond_9

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_9
    invoke-virtual {v7}, Lqd/j;->l()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Lbe/j0;

    .line 220
    .line 221
    if-nez v7, :cond_a

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_a
    iget-object v7, v7, Lbe/j0;->a:Ljava/util/Map;

    .line 225
    .line 226
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Lbe/k0;

    .line 231
    .line 232
    if-nez v7, :cond_b

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_b
    sget-object v9, Lbe/k0;->g:Lbe/k0;

    .line 236
    .line 237
    if-ne v7, v9, :cond_c

    .line 238
    .line 239
    invoke-virtual {v5}, Lqd/l;->N()Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-eqz v7, :cond_c

    .line 244
    .line 245
    sget-object v6, Lmd/a;->K:Lmd/a;

    .line 246
    .line 247
    invoke-virtual {v5, v6}, Lmd/e;->w(Lmd/a;)V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_c
    new-instance v7, Lpd/j;

    .line 252
    .line 253
    iget-object v6, v6, Lod/c;->g:Lod/a;

    .line 254
    .line 255
    iget-object v6, v6, Lod/a;->g:Lqd/j;

    .line 256
    .line 257
    sget-object v9, Lpd/k;->o:Lpd/k;

    .line 258
    .line 259
    invoke-direct {v7, v9, v6, v8}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5}, Lqd/l;->H()Lqd/l;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-virtual {v7, v6}, Lud/p;->I(Lqd/l;)V

    .line 267
    .line 268
    .line 269
    sget-object v6, Lmd/a;->m:Lmd/a;

    .line 270
    .line 271
    invoke-virtual {v7, v6}, Lmd/e;->w(Lmd/a;)V

    .line 272
    .line 273
    .line 274
    sget-object v6, Lmd/a;->X:Lmd/a;

    .line 275
    .line 276
    invoke-virtual {v7, v6}, Lmd/e;->w(Lmd/a;)V

    .line 277
    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    invoke-virtual {v5, v1, v7, v6}, Lqd/l;->b0(Lud/r;Lud/p;Z)Lqd/l;

    .line 281
    .line 282
    .line 283
    goto/16 :goto_3

    .line 284
    .line 285
    :cond_d
    :goto_5
    return-void

    .line 286
    :pswitch_1
    iget-boolean v2, v1, Lud/r;->p:Z

    .line 287
    .line 288
    if-eqz v2, :cond_e

    .line 289
    .line 290
    goto/16 :goto_15

    .line 291
    .line 292
    :cond_e
    iget-object v2, v1, Lud/r;->z:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const/4 v3, 0x0

    .line 299
    move v4, v3

    .line 300
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    if-eqz v5, :cond_24

    .line 305
    .line 306
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    check-cast v5, Lud/a;

    .line 311
    .line 312
    iget-object v6, v5, Lud/a;->l:Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    move v8, v3

    .line 319
    :goto_7
    if-ge v8, v7, :cond_23

    .line 320
    .line 321
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    check-cast v9, Lud/p;

    .line 326
    .line 327
    iget-object v10, v9, Lud/p;->k:Lpd/k;

    .line 328
    .line 329
    sget-object v11, Lpd/k;->O:Lpd/k;

    .line 330
    .line 331
    if-ne v10, v11, :cond_21

    .line 332
    .line 333
    check-cast v9, Lpd/n;

    .line 334
    .line 335
    iget v10, v9, Lpd/n;->o:I

    .line 336
    .line 337
    const/4 v12, 0x1

    .line 338
    const/4 v13, 0x0

    .line 339
    if-ne v10, v12, :cond_1f

    .line 340
    .line 341
    iget-object v10, v9, Lud/p;->l:Lqd/r;

    .line 342
    .line 343
    if-nez v10, :cond_f

    .line 344
    .line 345
    goto/16 :goto_12

    .line 346
    .line 347
    :cond_f
    iget-object v10, v9, Lpd/n;->p:Lod/d;

    .line 348
    .line 349
    iget-object v14, v0, Lbe/e;->h:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v14, Ljava/util/HashSet;

    .line 352
    .line 353
    invoke-virtual {v14, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v14

    .line 357
    if-eqz v14, :cond_1f

    .line 358
    .line 359
    iget-object v14, v9, Lud/p;->l:Lqd/r;

    .line 360
    .line 361
    invoke-virtual {v9, v3}, Lud/p;->S(I)Lqd/l;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    instance-of v15, v9, Lqd/n;

    .line 369
    .line 370
    if-eqz v15, :cond_1f

    .line 371
    .line 372
    iget-object v13, v10, Lod/d;->i:Ljava/util/List;

    .line 373
    .line 374
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    check-cast v13, Lqd/j;

    .line 379
    .line 380
    iget-object v10, v10, Lod/d;->h:Lqd/j;

    .line 381
    .line 382
    sget-object v15, Lqd/j;->i:Lqd/g;

    .line 383
    .line 384
    if-ne v13, v15, :cond_10

    .line 385
    .line 386
    move-object/from16 v17, v2

    .line 387
    .line 388
    move v2, v12

    .line 389
    move/from16 v16, v2

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_10
    sget-object v15, Lqd/j;->b:Lqd/g;

    .line 393
    .line 394
    if-eq v13, v15, :cond_12

    .line 395
    .line 396
    new-instance v15, Ljava/util/HashSet;

    .line 397
    .line 398
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 399
    .line 400
    .line 401
    move/from16 v16, v12

    .line 402
    .line 403
    iget-object v12, v14, Lqd/r;->m:Lqd/s;

    .line 404
    .line 405
    iget-object v12, v12, Lqd/s;->j:Ljava/util/ArrayList;

    .line 406
    .line 407
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v17

    .line 415
    if-eqz v17, :cond_11

    .line 416
    .line 417
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v17

    .line 421
    move-object/from16 v3, v17

    .line 422
    .line 423
    check-cast v3, Lqd/r;

    .line 424
    .line 425
    move-object/from16 v17, v2

    .line 426
    .line 427
    invoke-virtual {v3}, Lqd/r;->I()Lqd/j;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    iget-object v2, v3, Lqd/l;->i:Lqd/j;

    .line 435
    .line 436
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-object/from16 v2, v17

    .line 440
    .line 441
    const/4 v3, 0x0

    .line 442
    goto :goto_8

    .line 443
    :cond_11
    move-object/from16 v17, v2

    .line 444
    .line 445
    invoke-virtual {v14}, Lqd/r;->I()Lqd/j;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    invoke-virtual {v15, v10}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-virtual {v15, v13}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    invoke-virtual {v15}, Ljava/util/HashSet;->isEmpty()Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    xor-int/lit8 v2, v2, 0x1

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_12
    move-object/from16 v17, v2

    .line 466
    .line 467
    move/from16 v16, v12

    .line 468
    .line 469
    const/4 v2, 0x0

    .line 470
    :goto_9
    if-eqz v2, :cond_13

    .line 471
    .line 472
    sget-object v2, Lmd/a;->W:Lmd/a;

    .line 473
    .line 474
    invoke-virtual {v9, v2}, Lmd/e;->w(Lmd/a;)V

    .line 475
    .line 476
    .line 477
    :cond_13
    invoke-virtual {v9, v13}, Lqd/l;->W(Lqd/j;)V

    .line 478
    .line 479
    .line 480
    iget-object v2, v14, Lqd/r;->m:Lqd/s;

    .line 481
    .line 482
    invoke-virtual {v2}, Lqd/s;->b()Lqd/k;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    iget-object v2, v2, Lqd/k;->c:Ljava/util/List;

    .line 487
    .line 488
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    sget-object v12, Lpd/k;->g:Lpd/k;

    .line 497
    .line 498
    if-eqz v3, :cond_1d

    .line 499
    .line 500
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    check-cast v3, Lqd/s;

    .line 505
    .line 506
    invoke-virtual {v3}, Lqd/s;->i()Z

    .line 507
    .line 508
    .line 509
    move-result v15

    .line 510
    if-eqz v15, :cond_14

    .line 511
    .line 512
    :goto_b
    move/from16 v19, v4

    .line 513
    .line 514
    :goto_c
    const/4 v2, 0x0

    .line 515
    goto/16 :goto_10

    .line 516
    .line 517
    :cond_14
    iget-object v15, v3, Lqd/s;->i:Lqd/r;

    .line 518
    .line 519
    iget-object v15, v15, Lqd/l;->j:Lud/p;

    .line 520
    .line 521
    if-nez v15, :cond_15

    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_15
    move-object/from16 v18, v2

    .line 525
    .line 526
    iget-object v2, v15, Lud/p;->k:Lpd/k;

    .line 527
    .line 528
    move/from16 v19, v4

    .line 529
    .line 530
    if-eq v2, v12, :cond_16

    .line 531
    .line 532
    sget-object v4, Lpd/k;->m:Lpd/k;

    .line 533
    .line 534
    if-ne v2, v4, :cond_17

    .line 535
    .line 536
    :cond_16
    const/4 v2, 0x0

    .line 537
    goto :goto_d

    .line 538
    :cond_17
    const/4 v2, 0x0

    .line 539
    goto :goto_e

    .line 540
    :goto_d
    invoke-virtual {v15, v2}, Lud/p;->S(I)Lqd/l;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-virtual {v4}, Lqd/l;->I()Lqd/j;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {v4}, Lqd/j;->v()Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-eqz v4, :cond_18

    .line 553
    .line 554
    goto :goto_10

    .line 555
    :cond_18
    :goto_e
    iget-object v4, v15, Lud/p;->l:Lqd/r;

    .line 556
    .line 557
    iget-object v4, v4, Lqd/l;->i:Lqd/j;

    .line 558
    .line 559
    invoke-virtual {v4}, Lqd/j;->v()Z

    .line 560
    .line 561
    .line 562
    move-result v15

    .line 563
    if-eqz v15, :cond_19

    .line 564
    .line 565
    invoke-virtual {v4, v10}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    if-nez v4, :cond_19

    .line 570
    .line 571
    goto :goto_10

    .line 572
    :cond_19
    iget-object v3, v3, Lqd/s;->j:Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    if-eqz v4, :cond_1c

    .line 583
    .line 584
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    check-cast v4, Lqd/r;

    .line 589
    .line 590
    iget-object v15, v4, Lqd/l;->j:Lud/p;

    .line 591
    .line 592
    if-nez v15, :cond_1a

    .line 593
    .line 594
    goto :goto_10

    .line 595
    :cond_1a
    iget-object v2, v15, Lud/p;->k:Lpd/k;

    .line 596
    .line 597
    if-ne v2, v11, :cond_1b

    .line 598
    .line 599
    check-cast v15, Lpd/n;

    .line 600
    .line 601
    invoke-virtual {v15}, Lpd/n;->k0()Lqd/l;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {v4, v2}, Lqd/r;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-eqz v2, :cond_1b

    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_1b
    const/4 v2, 0x0

    .line 613
    goto :goto_f

    .line 614
    :cond_1c
    move-object/from16 v2, v18

    .line 615
    .line 616
    move/from16 v4, v19

    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_1d
    move/from16 v19, v4

    .line 620
    .line 621
    move/from16 v2, v16

    .line 622
    .line 623
    :goto_10
    if-eqz v2, :cond_1e

    .line 624
    .line 625
    invoke-virtual {v14, v13}, Lqd/r;->W(Lqd/j;)V

    .line 626
    .line 627
    .line 628
    const/4 v2, 0x0

    .line 629
    goto :goto_11

    .line 630
    :cond_1e
    move/from16 v2, v16

    .line 631
    .line 632
    :goto_11
    new-instance v13, Lud/p;

    .line 633
    .line 634
    move/from16 v3, v16

    .line 635
    .line 636
    invoke-direct {v13, v12, v3}, Lud/p;-><init>(Lpd/k;I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v13, v9}, Lud/p;->I(Lqd/l;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v13, v14}, Lud/p;->d0(Lqd/r;)V

    .line 643
    .line 644
    .line 645
    if-eqz v2, :cond_20

    .line 646
    .line 647
    sget-object v2, Lmd/a;->q:Lmd/a;

    .line 648
    .line 649
    invoke-virtual {v13, v2}, Lmd/e;->w(Lmd/a;)V

    .line 650
    .line 651
    .line 652
    goto :goto_13

    .line 653
    :cond_1f
    :goto_12
    move-object/from16 v17, v2

    .line 654
    .line 655
    move/from16 v19, v4

    .line 656
    .line 657
    move v3, v12

    .line 658
    :cond_20
    :goto_13
    if-eqz v13, :cond_22

    .line 659
    .line 660
    invoke-static {v1, v5, v8, v13}, La/a;->J0(Lud/r;Lud/a;ILud/p;)V

    .line 661
    .line 662
    .line 663
    move v4, v3

    .line 664
    goto :goto_14

    .line 665
    :cond_21
    move-object/from16 v17, v2

    .line 666
    .line 667
    move/from16 v19, v4

    .line 668
    .line 669
    :cond_22
    move/from16 v4, v19

    .line 670
    .line 671
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 672
    .line 673
    move-object/from16 v2, v17

    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    goto/16 :goto_7

    .line 677
    .line 678
    :cond_23
    move/from16 v19, v4

    .line 679
    .line 680
    goto/16 :goto_6

    .line 681
    .line 682
    :cond_24
    if-eqz v4, :cond_25

    .line 683
    .line 684
    invoke-static {v1}, Lbe/b;->R(Lud/r;)V

    .line 685
    .line 686
    .line 687
    :cond_25
    :goto_15
    return-void

    .line 688
    :pswitch_2
    iget-boolean v2, v1, Lud/r;->p:Z

    .line 689
    .line 690
    if-eqz v2, :cond_26

    .line 691
    .line 692
    goto :goto_17

    .line 693
    :cond_26
    iget-object v1, v1, Lud/r;->y:[Lud/p;

    .line 694
    .line 695
    array-length v2, v1

    .line 696
    const/4 v3, 0x0

    .line 697
    :goto_16
    if-ge v3, v2, :cond_28

    .line 698
    .line 699
    aget-object v4, v1, v3

    .line 700
    .line 701
    instance-of v5, v4, Lpd/b;

    .line 702
    .line 703
    if-eqz v5, :cond_27

    .line 704
    .line 705
    check-cast v4, Lpd/b;

    .line 706
    .line 707
    iget-object v5, v0, Lbe/e;->h:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v5, Lfe/a;

    .line 710
    .line 711
    invoke-virtual {v4}, Lpd/b;->i0()Lod/d;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-virtual {v5, v6}, Lfe/a;->f(Lod/d;)Lud/m;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    if-eqz v5, :cond_27

    .line 720
    .line 721
    invoke-virtual {v4, v5}, Lmd/e;->y(Loc/b;)V

    .line 722
    .line 723
    .line 724
    :cond_27
    add-int/lit8 v3, v3, 0x1

    .line 725
    .line 726
    goto :goto_16

    .line 727
    :cond_28
    :goto_17
    return-void

    .line 728
    nop

    .line 729
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lud/e;)Z
    .locals 7

    .line 1
    iget v0, p0, Lbe/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lbe/a;->h(Lud/e;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p1, Lud/e;->o:Lb5/k;

    .line 12
    .line 13
    iget-object v1, p1, Lud/e;->x:Lud/e;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lb5/k;->g()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    iget-object v1, p1, Lud/e;->x:Lud/e;

    .line 27
    .line 28
    if-ne v1, p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lb5/k;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Lb5/k;->f()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-static {p1, v2}, Lbe/e;->i(Lnd/b0;I)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    iget-object v0, p1, Lud/e;->B:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lud/e;

    .line 64
    .line 65
    iget-object v3, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lfe/a;

    .line 68
    .line 69
    new-instance v4, Lah/a;

    .line 70
    .line 71
    const/16 v5, 0x19

    .line 72
    .line 73
    invoke-direct {v4, v5}, Lah/a;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, p1, v1, v4}, Lfe/a;->a(Lnd/b0;Lnd/b0;Lah/a;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iget-object v0, p1, Lud/e;->C:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_8

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lud/r;

    .line 97
    .line 98
    sget-object v3, Lmd/b;->n:Lmd/b;

    .line 99
    .line 100
    iget-object v4, v1, Lmd/e;->g:Lmd/f;

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lnd/w;

    .line 107
    .line 108
    if-eqz v3, :cond_6

    .line 109
    .line 110
    iget-object v3, v3, Lnd/w;->g:Lud/p;

    .line 111
    .line 112
    if-nez v3, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    move v3, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    :goto_1
    const/4 v3, 0x0

    .line 118
    :goto_2
    sget-object v4, Lmd/a;->c0:Lmd/a;

    .line 119
    .line 120
    iget-object v5, v1, Lmd/e;->g:Lmd/f;

    .line 121
    .line 122
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v3, :cond_7

    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    :cond_7
    iget-object v1, v1, Lud/r;->H:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 137
    .line 138
    const/16 v4, 0x16

    .line 139
    .line 140
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {}, Ljava/util/stream/Collectors;->toSet()Ljava/util/stream/Collector;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-interface {v1, v3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/util/Set;

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_4

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lud/e;

    .line 172
    .line 173
    iget-object v4, p0, Lbe/e;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, Lfe/a;

    .line 176
    .line 177
    new-instance v5, Lah/a;

    .line 178
    .line 179
    const/16 v6, 0x1a

    .line 180
    .line 181
    invoke-direct {v5, v6}, Lah/a;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, p1, v3, v5}, Lfe/a;->a(Lnd/b0;Lnd/b0;Lah/a;)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_8
    :goto_4
    return v2

    .line 189
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
