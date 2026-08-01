.class public abstract Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/reflect/jvm/internal/ReflectKCallableImpl$_absentArguments$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableImpl$_absentArguments$1;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世哲苏兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance p1, Lkotlin/reflect/full/IllegalCallableAccessException;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "This callable does not support a default call: "

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "No argument provided for a required parameter: "

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->getParameters()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v5, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v6, 0xa

    .line 23
    .line 24
    invoke-static {v0, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    invoke-interface {p1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    if-eqz v7, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    new-instance p1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v0, "Annotation argument value cannot be null ("

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const/16 v0, 0x29

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_1
    invoke-interface {v6}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_2

    .line 90
    .line 91
    move-object v7, v4

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-interface {v6}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰()Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_3

    .line 98
    .line 99
    invoke-interface {v6}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getType()Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲兰苏世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :goto_1
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-static {v6, v3}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v4

    .line 115
    :cond_4
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    :try_start_0
    new-array p0, v2, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-interface {p1, p0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    return-object p0

    .line 132
    :catch_0
    move-exception p0

    .line 133
    new-instance p1, Lkotlin/reflect/full/IllegalCallableAccessException;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_5
    invoke-static {p0, v1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v4

    .line 143
    :cond_6
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->getParameters()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_8

    .line 152
    .line 153
    :try_start_1
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->isSuspend()Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-eqz p0, :cond_7

    .line 162
    .line 163
    filled-new-array {v4}, [Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    new-array p0, v2, [Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 169
    .line 170
    :goto_2
    invoke-interface {p1, p0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 174
    return-object p0

    .line 175
    :catch_1
    move-exception p0

    .line 176
    new-instance p1, Lkotlin/reflect/full/IllegalCallableAccessException;

    .line 177
    .line 178
    invoke-direct {p1, p0}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->isSuspend()Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    add-int/2addr v6, v5

    .line 191
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 192
    .line 193
    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->invoke()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, [Ljava/lang/Object;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    check-cast v5, [Ljava/lang/Object;

    .line 204
    .line 205
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲苏兰;->isSuspend()Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_9

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    aput-object v4, v5, v7

    .line 216
    .line 217
    :cond_9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move v7, v2

    .line 222
    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_f

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    check-cast v8, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 233
    .line 234
    invoke-interface {p1, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    if-eqz v9, :cond_b

    .line 239
    .line 240
    invoke-interface {v8}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getIndex()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    aput-object v10, v5, v9

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_b
    invoke-interface {v8}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰()Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_c

    .line 256
    .line 257
    div-int/lit8 v2, v7, 0x20

    .line 258
    .line 259
    add-int/2addr v2, v6

    .line 260
    aget-object v9, v5, v2

    .line 261
    .line 262
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    check-cast v9, Ljava/lang/Integer;

    .line 266
    .line 267
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    rem-int/lit8 v10, v7, 0x20

    .line 272
    .line 273
    const/4 v11, 0x1

    .line 274
    shl-int v10, v11, v10

    .line 275
    .line 276
    or-int/2addr v9, v10

    .line 277
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    aput-object v9, v5, v2

    .line 282
    .line 283
    move v2, v11

    .line 284
    goto :goto_4

    .line 285
    :cond_c
    invoke-interface {v8}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰()Z

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    if-eqz v9, :cond_e

    .line 290
    .line 291
    :goto_4
    invoke-interface {v8}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getKind()Lkotlin/reflect/KParameter$Kind;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    sget-object v10, Lkotlin/reflect/KParameter$Kind;->VALUE:Lkotlin/reflect/KParameter$Kind;

    .line 296
    .line 297
    if-eq v9, v10, :cond_d

    .line 298
    .line 299
    invoke-interface {v8}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getKind()Lkotlin/reflect/KParameter$Kind;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    sget-object v9, Lkotlin/reflect/KParameter$Kind;->CONTEXT:Lkotlin/reflect/KParameter$Kind;

    .line 304
    .line 305
    if-ne v8, v9, :cond_a

    .line 306
    .line 307
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_e
    invoke-static {v8, v3}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v4

    .line 314
    :cond_f
    if-nez v2, :cond_10

    .line 315
    .line 316
    :try_start_2
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-interface {p0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 328
    return-object p0

    .line 329
    :catch_2
    move-exception p0

    .line 330
    new-instance p1, Lkotlin/reflect/full/IllegalCallableAccessException;

    .line 331
    .line 332
    invoke-direct {p1, p0}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    .line 333
    .line 334
    .line 335
    throw p1

    .line 336
    :cond_10
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    if-eqz p1, :cond_11

    .line 341
    .line 342
    :try_start_3
    invoke-interface {p1, v5}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 346
    return-object p0

    .line 347
    :catch_3
    move-exception p0

    .line 348
    new-instance p1, Lkotlin/reflect/full/IllegalCallableAccessException;

    .line 349
    .line 350
    invoke-direct {p1, p0}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    .line 351
    .line 352
    .line 353
    throw p1

    .line 354
    :cond_11
    invoke-static {p0, v1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-object v4
.end method
