.class public final synthetic Leb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lg8/f;


# virtual methods
.method public final a(Lb/e;)V
    .locals 11

    .line 1
    sget-object v0, Leb/d;->a:Leb/d;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb/e;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Lb/e;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lb/e;->n()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_1
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v1, :cond_b

    .line 42
    .line 43
    iget-object v4, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 44
    .line 45
    iget-object v5, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_2

    .line 56
    .line 57
    move-object v8, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const-string v7, "\n"

    .line 60
    .line 61
    const-string v8, ";"

    .line 62
    .line 63
    const-string v9, "\u0001"

    .line 64
    .line 65
    const-string v10, "\u0002"

    .line 66
    .line 67
    filled-new-array {v9, v10, v7, v8}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-static {v7}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_4

    .line 84
    .line 85
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, Ljava/lang/String;

    .line 90
    .line 91
    filled-new-array {v8}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-static {v5, v8}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    if-lez v6, :cond_5

    .line 100
    .line 101
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-ne v9, v6, :cond_3

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    :cond_5
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_b

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eq v5, v6, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const/4 v5, 0x0

    .line 134
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_b

    .line 139
    .line 140
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    add-int/lit8 v7, v5, 0x1

    .line 145
    .line 146
    if-ltz v5, :cond_a

    .line 147
    .line 148
    check-cast v6, Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v5, v8}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Ljava/lang/String;

    .line 155
    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    goto :goto_2

    .line 167
    :cond_7
    move-object v5, v3

    .line 168
    :goto_2
    if-nez v5, :cond_8

    .line 169
    .line 170
    const-string v5, ""

    .line 171
    .line 172
    :cond_8
    sget-object v9, Leb/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 173
    .line 174
    invoke-static {v0, v6}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-virtual {v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-nez v10, :cond_9

    .line 186
    .line 187
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-nez v10, :cond_9

    .line 192
    .line 193
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-nez v10, :cond_9

    .line 198
    .line 199
    invoke-static {v0, v6}, Leb/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v9, v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_9
    move v5, v7

    .line 207
    goto :goto_1

    .line 208
    :cond_a
    invoke-static {}, La/a;->Q0()V

    .line 209
    .line 210
    .line 211
    throw v3

    .line 212
    :cond_b
    :goto_3
    if-eqz v1, :cond_c

    .line 213
    .line 214
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 215
    .line 216
    if-eqz v1, :cond_c

    .line 217
    .line 218
    move-object v2, v1

    .line 219
    goto :goto_4

    .line 220
    :cond_c
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-eqz v1, :cond_d

    .line 225
    .line 226
    invoke-virtual {p1}, Lb/e;->n()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v1, p1}, Lg8/d;->i(Ljava/lang/String;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    :cond_d
    if-eqz v3, :cond_e

    .line 235
    .line 236
    move-object v2, v3

    .line 237
    :cond_e
    :goto_4
    new-instance p1, Ldg/n;

    .line 238
    .line 239
    const/4 v1, 0x6

    .line 240
    invoke-direct {p1, v2, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 241
    .line 242
    .line 243
    new-instance v1, Le9/h;

    .line 244
    .line 245
    const/4 v2, 0x7

    .line 246
    invoke-direct {v1, v2}, Le9/h;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {p1, v1}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    new-instance v1, Le9/h;

    .line 254
    .line 255
    const/16 v2, 0x8

    .line 256
    .line 257
    invoke-direct {v1, v2}, Le9/h;-><init>(I)V

    .line 258
    .line 259
    .line 260
    new-instance v2, Lng/i;

    .line 261
    .line 262
    const/4 v3, 0x1

    .line 263
    invoke-direct {v2, p1, v3, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 264
    .line 265
    .line 266
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 267
    .line 268
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-static {v2, p1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_f

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_f
    invoke-static {v0, p1}, Leb/d;->h(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 282
    .line 283
    .line 284
    sget-object v1, Leb/d;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 285
    .line 286
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Ljava/util/Set;

    .line 291
    .line 292
    if-eqz v1, :cond_12

    .line 293
    .line 294
    move-object v2, v1

    .line 295
    check-cast v2, Ljava/lang/Iterable;

    .line 296
    .line 297
    invoke-static {p1, v2}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static {v1, p1}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_10

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_10

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_10
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_11

    .line 327
    .line 328
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    check-cast v2, Ljava/lang/String;

    .line 333
    .line 334
    const-string v3, "join"

    .line 335
    .line 336
    invoke-static {v0, v2}, Leb/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-static {v3, v0, v2, v4}, Leb/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_11
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_12

    .line 353
    .line 354
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, Ljava/lang/String;

    .line 359
    .line 360
    const-string v2, "left"

    .line 361
    .line 362
    invoke-static {v0, v1}, Leb/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-static {v2, v0, v1, v3}, Leb/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_12
    :goto_7
    return-void
.end method
