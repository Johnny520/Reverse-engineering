.class public final synthetic Lyyds/ᲁᲀᛳ;
.super Ljava/lang/Object;

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᲀᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛳᛱᲀᛶ;I)V
    .locals 0

    .line 7
    iput p2, p0, Lyyds/ᲁᲀᛳ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 13

    .line 1
    iget p0, p0, Lyyds/ᲁᲀᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/high16 v0, 0x42c80000    # 100.0f

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string p0, "KavaRef"

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛵᛵᛲᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_1
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    new-instance p0, Lyyds/ᲈᲇᛶᲇ;

    .line 27
    .line 28
    invoke-direct {p0}, Lyyds/ᲈᲇᛶᲇ;-><init>()V

    .line 29
    .line 30
    .line 31
    const-wide/16 v0, 0xa

    .line 32
    .line 33
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ(J)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lyyds/ᲈᲇᛶᲇ;->ᛵᲀᲈᛴ:I

    .line 38
    .line 39
    const-wide/16 v0, 0x1e

    .line 40
    .line 41
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ(J)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iput v2, p0, Lyyds/ᲈᲇᛶᲇ;->ᛲᛶᛱᲈ:I

    .line 46
    .line 47
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ(J)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Lyyds/ᲈᲇᛶᲇ;->ᲈᲀᛲᲀ:I

    .line 52
    .line 53
    iput-boolean v4, p0, Lyyds/ᲈᲇᛶᲇ;->ᲇᲇᲇᛱ:Z

    .line 54
    .line 55
    new-instance v0, Lyyds/ᛶᛲᛷ;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Lyyds/ᛶᛲᛷ;-><init>(Lyyds/ᲈᲇᛶᲇ;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_3
    new-instance p0, Lyyds/ᲇᛳᛸ;

    .line 62
    .line 63
    invoke-direct {p0}, Lyyds/ᲇᛳᛸ;-><init>()V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_4
    invoke-static {}, Lyyds/ᲀᛱᛳᲈ;->ᛵᛸᛸᛷ()Lyyds/ᲇᛵᲁᛳ;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_5
    invoke-static {}, Lyyds/ᲀᛱᛳᲈ;->ᛵᛸᛸᛷ()Lyyds/ᲇᛵᲁᛳ;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_6
    sget-object p0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 78
    .line 79
    sget-object p0, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 80
    .line 81
    invoke-static {}, Lyyds/ᛸᛳᛷᛳ;->ᛲᲈᲁ()Lyyds/ᲁᲀᲇᲀ;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p0, v0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lyyds/ᲀᛱᛳᲈ;->ᛲᲈᲁ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲇᛵᲁᛳ;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_7
    new-instance p0, Lyyds/ᛲᲀᛵ;

    .line 95
    .line 96
    invoke-direct {p0}, Lyyds/ᛲᲀᛵ;-><init>()V

    .line 97
    .line 98
    .line 99
    sget-object v0, Lyyds/ᛳᲈᛱᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲈᛱᲀ;

    .line 100
    .line 101
    iput-object v0, p0, Lyyds/ᛲᲀᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲈᛱᲀ;

    .line 102
    .line 103
    new-instance v0, Lyyds/ᛱᛴᲇᲀ;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Lyyds/ᛱᛴᲇᲀ;-><init>(Lyyds/ᛲᲀᛵ;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_8
    sget-object p0, Lyyds/ᛱᛷᛲᛳ;->ᛱᲈᲁ:Ljava/util/WeakHashMap;

    .line 110
    .line 111
    monitor-enter p0

    .line 112
    :try_start_0
    invoke-virtual {p0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-wide v1, -0x39a5be68a836eL

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    const/16 v2, 0xa

    .line 127
    .line 128
    invoke-static {v0, v2}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_0

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Ljava/util/Map$Entry;

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v4, Lkotlin/Pair;

    .line 160
    .line 161
    invoke-direct {v4, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    goto :goto_4

    .line 170
    :cond_0
    monitor-exit p0

    .line 171
    sget-object p0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛸᛴᛵᛶ()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_1

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lkotlin/Pair;

    .line 197
    .line 198
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sget-object v1, Lyyds/ᛱᛷᛲᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛲᛳ;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Lyyds/ᛱᛷᛲᛳ;->ᲀᛲᛱᛱ(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_3

    .line 220
    .line 221
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Lkotlin/Pair;

    .line 226
    .line 227
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Lyyds/ᛲᛱᛵ;

    .line 236
    .line 237
    :try_start_1
    iget-object v2, v0, Lyyds/ᛲᛱᛵ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 238
    .line 239
    iget-object v0, v0, Lyyds/ᛲᛱᛵ;->ᛵᛸᛸᛷ:[Ljava/lang/Object;

    .line 240
    .line 241
    array-length v3, v0

    .line 242
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    goto :goto_3

    .line 251
    :catchall_1
    move-exception v0

    .line 252
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 253
    .line 254
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    move-object v0, v1

    .line 258
    :goto_3
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-eqz v0, :cond_2

    .line 263
    .line 264
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 265
    .line 266
    const-wide v2, -0x39a6ee68a836eL

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_3
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 280
    .line 281
    return-object p0

    .line 282
    :goto_4
    monitor-exit p0

    .line 283
    throw v0

    .line 284
    :pswitch_9
    :try_start_2
    sget-object p0, Lyyds/ᛳᛴᲀᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛳᲈᛵ;

    .line 285
    .line 286
    invoke-interface {p0}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    check-cast p0, Ljava/lang/reflect/Method;

    .line 291
    .line 292
    if-eqz p0, :cond_4

    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    if-eqz p0, :cond_4

    .line 299
    .line 300
    const-string v0, "beginTransaction"

    .line 301
    .line 302
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 303
    .line 304
    const-class v2, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 305
    .line 306
    const-class v3, Landroid/os/CancellationSignal;

    .line 307
    .line 308
    filled-new-array {v1, v2, v1, v3}, [Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 313
    .line 314
    .line 315
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 316
    :catchall_2
    :cond_4
    return-object v5

    .line 317
    :pswitch_a
    :try_start_3
    const-class p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 318
    .line 319
    const-string v0, "getThreadSession"

    .line 320
    .line 321
    invoke-virtual {p0, v0, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 326
    .line 327
    .line 328
    move-object v5, p0

    .line 329
    :catchall_3
    return-object v5

    .line 330
    :pswitch_b
    sget-object p0, Lyyds/ᛱᛶᛳᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛶᛳᛷ;

    .line 331
    .line 332
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Lyyds/ᛱᛶᛳᛷ;->ᲁᛶᛴᛸ()I

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    if-ne p0, v3, :cond_5

    .line 340
    .line 341
    invoke-static {}, Lyyds/ᛱᛶᛳᛷ;->ᛵᛲᛵᲁ()V

    .line 342
    .line 343
    .line 344
    :cond_5
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_c
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 348
    .line 349
    :try_start_4
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 350
    .line 351
    const-wide v0, -0x246e7e68a836eL

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    const-wide v1, -0x246fde68a836eL

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    invoke-static {v0}, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ(Ljava/lang/String;)Lyyds/ᛸᲀᛷᛴ;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 373
    .line 374
    if-eqz v0, :cond_6

    .line 375
    .line 376
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-static {v0, p0}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :catchall_4
    move-exception p0

    .line 389
    goto :goto_5

    .line 390
    :cond_6
    move-object p0, v5

    .line 391
    goto :goto_6

    .line 392
    :goto_5
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 393
    .line 394
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    move-object p0, v0

    .line 398
    :goto_6
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    if-eqz v0, :cond_7

    .line 403
    .line 404
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 405
    .line 406
    const-wide v2, -0x394b2e68a836eL

    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    :cond_7
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 419
    .line 420
    if-eqz v0, :cond_8

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_8
    move-object v5, p0

    .line 424
    :goto_7
    check-cast v5, Ljava/lang/reflect/Method;

    .line 425
    .line 426
    return-object v5

    .line 427
    :pswitch_d
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᛵᛸᛸᛷ:Landroid/view/ViewGroup;

    .line 428
    .line 429
    if-eqz p0, :cond_9

    .line 430
    .line 431
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛱᲈᲁ()I

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    invoke-static {v0}, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ(I)F

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 445
    .line 446
    .line 447
    :cond_9
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 448
    .line 449
    if-eqz p0, :cond_a

    .line 450
    .line 451
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛳᛵᛶᲀ()I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-static {v0}, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ(I)F

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 465
    .line 466
    .line 467
    :cond_a
    invoke-static {}, Lyyds/ᲀᛴᛱᛷ;->ᲈᛷᲈᛶ()V

    .line 468
    .line 469
    .line 470
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 471
    .line 472
    return-object p0

    .line 473
    :pswitch_e
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᛵᛸᛸᛷ:Landroid/view/ViewGroup;

    .line 474
    .line 475
    if-eqz p0, :cond_b

    .line 476
    .line 477
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛳᛶᲁ()I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    int-to-float v1, v1

    .line 487
    div-float/2addr v1, v0

    .line 488
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 489
    .line 490
    .line 491
    :cond_b
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 492
    .line 493
    if-eqz p0, :cond_c

    .line 494
    .line 495
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛱᛲ()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    int-to-float v1, v1

    .line 505
    div-float/2addr v1, v0

    .line 506
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 507
    .line 508
    .line 509
    :cond_c
    invoke-static {}, Lyyds/ᲀᛴᛱᛷ;->ᲈᛷᲈᛶ()V

    .line 510
    .line 511
    .line 512
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_f
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᛵᛸᛸᛷ:Landroid/view/ViewGroup;

    .line 516
    .line 517
    if-eqz p0, :cond_d

    .line 518
    .line 519
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᛲᛳᛶᲁ()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    int-to-float v1, v1

    .line 529
    div-float/2addr v1, v0

    .line 530
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 531
    .line 532
    .line 533
    :cond_d
    sget-object p0, Lyyds/ᛳᛶᛱᛸ;->ᲀᛲᛳᲀ:Landroid/view/View;

    .line 534
    .line 535
    if-eqz p0, :cond_e

    .line 536
    .line 537
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛱᛲ()I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    int-to-float v1, v1

    .line 547
    div-float/2addr v1, v0

    .line 548
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 549
    .line 550
    .line 551
    :cond_e
    invoke-static {}, Lyyds/ᲀᛴᛱᛷ;->ᲈᛷᲈᛶ()V

    .line 552
    .line 553
    .line 554
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 555
    .line 556
    return-object p0

    .line 557
    :pswitch_10
    new-instance p0, Lyyds/ᛱᛴᲇᲀ;

    .line 558
    .line 559
    invoke-direct {p0}, Lyyds/ᛱᛴᲇᲀ;-><init>()V

    .line 560
    .line 561
    .line 562
    return-object p0

    .line 563
    :pswitch_11
    const-wide v4, -0x2a870e68a836eL

    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    const-wide v4, -0x2a877e68a836eL

    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    sget-object v4, Lcom/tencent/mmkv/MMKV;->ᛲᲈᲁ:Ljava/util/EnumMap;

    .line 582
    .line 583
    new-instance v4, Lyyds/ᛸᛴᛷᛵ;

    .line 584
    .line 585
    invoke-direct {v4, v3, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(IB)V

    .line 586
    .line 587
    .line 588
    iput v2, v4, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 589
    .line 590
    iput-object v0, v4, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 591
    .line 592
    invoke-static {p0, v4}, Lcom/tencent/mmkv/MMKV;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛸᛴᛷᛵ;)Lcom/tencent/mmkv/MMKV;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    const-wide v0, -0x2a898e68a836eL

    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    return-object p0

    .line 605
    :pswitch_12
    const-wide v4, -0x2a848e68a836eL

    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    const-wide v4, -0x2a84fe68a836eL

    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    sget-object v4, Lcom/tencent/mmkv/MMKV;->ᛲᲈᲁ:Ljava/util/EnumMap;

    .line 624
    .line 625
    new-instance v4, Lyyds/ᛸᛴᛷᛵ;

    .line 626
    .line 627
    invoke-direct {v4, v3, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(IB)V

    .line 628
    .line 629
    .line 630
    iput v2, v4, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 631
    .line 632
    iput-object v0, v4, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 633
    .line 634
    invoke-static {p0, v4}, Lcom/tencent/mmkv/MMKV;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛸᛴᛷᛵ;)Lcom/tencent/mmkv/MMKV;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    const-wide v0, -0x2a860e68a836eL

    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    return-object p0

    .line 647
    :pswitch_13
    const-wide v4, -0x2a81ae68a836eL

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    const-wide v4, -0x2a81fe68a836eL

    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    sget-object v4, Lcom/tencent/mmkv/MMKV;->ᛲᲈᲁ:Ljava/util/EnumMap;

    .line 666
    .line 667
    new-instance v4, Lyyds/ᛸᛴᛷᛵ;

    .line 668
    .line 669
    invoke-direct {v4, v3, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(IB)V

    .line 670
    .line 671
    .line 672
    iput v2, v4, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 673
    .line 674
    iput-object v0, v4, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 675
    .line 676
    invoke-static {p0, v4}, Lcom/tencent/mmkv/MMKV;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛸᛴᛷᛵ;)Lcom/tencent/mmkv/MMKV;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    const-wide v0, -0x2a838e68a836eL

    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    return-object p0

    .line 689
    :pswitch_14
    sget-object p0, Lyyds/ᛶᛴᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᲁᛲ;

    .line 690
    .line 691
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    sget-object p0, Lyyds/ᛶᛴᲁᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛴᛳᲈᛵ;

    .line 695
    .line 696
    invoke-interface {p0}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    check-cast p0, Ljava/lang/reflect/Method;

    .line 701
    .line 702
    if-eqz p0, :cond_16

    .line 703
    .line 704
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    if-nez p0, :cond_f

    .line 709
    .line 710
    goto/16 :goto_d

    .line 711
    .line 712
    :cond_f
    const-wide v6, -0x3cd80e68a836eL

    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    :try_start_5
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-static {v0, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 729
    goto :goto_8

    .line 730
    :catchall_5
    move-exception v0

    .line 731
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 732
    .line 733
    invoke-direct {v3, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 734
    .line 735
    .line 736
    move-object v0, v3

    .line 737
    :goto_8
    instance-of v3, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 738
    .line 739
    if-eqz v3, :cond_10

    .line 740
    .line 741
    move-object v0, v5

    .line 742
    :cond_10
    check-cast v0, Ljava/lang/Class;

    .line 743
    .line 744
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 745
    .line 746
    .line 747
    move-result-object p0

    .line 748
    const-wide v6, -0x3cdb8e68a836eL

    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    array-length v3, p0

    .line 757
    move v6, v1

    .line 758
    move v7, v6

    .line 759
    move-object v8, v5

    .line 760
    :goto_9
    if-ge v6, v3, :cond_14

    .line 761
    .line 762
    aget-object v9, p0, v6

    .line 763
    .line 764
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    move-result-object v10

    .line 768
    array-length v11, v10

    .line 769
    const/4 v12, 0x3

    .line 770
    if-ne v11, v12, :cond_13

    .line 771
    .line 772
    aget-object v11, v10, v1

    .line 773
    .line 774
    const-class v12, Landroid/content/Context;

    .line 775
    .line 776
    invoke-static {v11, v12}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v11

    .line 780
    if-eqz v11, :cond_13

    .line 781
    .line 782
    aget-object v11, v10, v4

    .line 783
    .line 784
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v11

    .line 788
    const-class v12, Lcom/bytedance/im/core/model/Message;

    .line 789
    .line 790
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v12

    .line 794
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v11

    .line 798
    if-eqz v11, :cond_13

    .line 799
    .line 800
    if-eqz v0, :cond_11

    .line 801
    .line 802
    aget-object v10, v10, v2

    .line 803
    .line 804
    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 805
    .line 806
    .line 807
    move-result v10

    .line 808
    if-nez v10, :cond_11

    .line 809
    .line 810
    goto :goto_b

    .line 811
    :cond_11
    if-eqz v7, :cond_12

    .line 812
    .line 813
    :goto_a
    move-object v8, v5

    .line 814
    goto :goto_c

    .line 815
    :cond_12
    move v7, v4

    .line 816
    move-object v8, v9

    .line 817
    :cond_13
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 818
    .line 819
    goto :goto_9

    .line 820
    :cond_14
    if-nez v7, :cond_15

    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_15
    :goto_c
    if-eqz v8, :cond_16

    .line 824
    .line 825
    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 826
    .line 827
    .line 828
    move-object v5, v8

    .line 829
    :cond_16
    :goto_d
    return-object v5

    .line 830
    :pswitch_15
    sget-object p0, Lyyds/ᛶᛴᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᲁᛲ;

    .line 831
    .line 832
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᛵᛱᛱᛵ:Lyyds/ᛷᛴᲁᛸ;

    .line 833
    .line 834
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    invoke-static {v0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛴᲁᛸ;)Ljava/lang/reflect/Method;

    .line 838
    .line 839
    .line 840
    move-result-object p0

    .line 841
    if-eqz p0, :cond_17

    .line 842
    .line 843
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 844
    .line 845
    .line 846
    move-object v5, p0

    .line 847
    :cond_17
    return-object v5

    .line 848
    :pswitch_16
    sget-object p0, Lyyds/ᛶᛴᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᲁᛲ;

    .line 849
    .line 850
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᛴᛵᛵᛸ:Lyyds/ᛷᛴᲁᛸ;

    .line 851
    .line 852
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    invoke-static {v0}, Lyyds/ᛱᛶᛶᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛴᲁᛸ;)Lyyds/ᲀᲀᛶᲈ;

    .line 856
    .line 857
    .line 858
    move-result-object p0

    .line 859
    if-eqz p0, :cond_18

    .line 860
    .line 861
    iget-object v5, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 862
    .line 863
    :cond_18
    return-object v5

    .line 864
    :pswitch_17
    sget-object p0, Lyyds/ᛶᛴᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᲁᛲ;

    .line 865
    .line 866
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᛷᲁᛴᲇ:Lyyds/ᛷᛴᲁᛸ;

    .line 867
    .line 868
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    invoke-static {v0}, Lyyds/ᛱᛶᛶᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛴᲁᛸ;)Lyyds/ᲀᲀᛶᲈ;

    .line 872
    .line 873
    .line 874
    move-result-object p0

    .line 875
    if-eqz p0, :cond_19

    .line 876
    .line 877
    iget-object v5, p0, Lyyds/ᲀᲀᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 878
    .line 879
    :cond_19
    return-object v5

    .line 880
    :pswitch_18
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 881
    .line 882
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ:Landroid/content/pm/ApplicationInfo;

    .line 886
    .line 887
    if-eqz p0, :cond_1a

    .line 888
    .line 889
    move-object v5, p0

    .line 890
    goto :goto_e

    .line 891
    :cond_1a
    const-wide v0, -0x2a0f5e68a836eL

    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    :goto_e
    iget-object p0, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 900
    .line 901
    return-object p0

    .line 902
    :pswitch_19
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 903
    .line 904
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-static {}, Lyyds/ᲈᛷᛵᛷ;->ᛱᛳᲇ()Lcom/ss/android/ugc/awemes/wrapper/ModuleMainWrapper;

    .line 908
    .line 909
    .line 910
    move-result-object p0

    .line 911
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getFrameworkVersion()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object p0

    .line 915
    return-object p0

    .line 916
    :pswitch_1a
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 917
    .line 918
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-static {}, Lyyds/ᲈᛷᛵᛷ;->ᛱᛳᲇ()Lcom/ss/android/ugc/awemes/wrapper/ModuleMainWrapper;

    .line 922
    .line 923
    .line 924
    move-result-object p0

    .line 925
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getFrameworkVersionCode()J

    .line 926
    .line 927
    .line 928
    move-result-wide v0

    .line 929
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 930
    .line 931
    .line 932
    move-result-object p0

    .line 933
    return-object p0

    .line 934
    :pswitch_1b
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 935
    .line 936
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    sget-object p0, Lyyds/ᲈᛷᛵᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲇᲀᲁ;

    .line 940
    .line 941
    if-eqz p0, :cond_1b

    .line 942
    .line 943
    move-object v5, p0

    .line 944
    goto :goto_f

    .line 945
    :cond_1b
    const-wide v0, -0x2a149e68a836eL

    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    :goto_f
    return-object v5

    .line 954
    :pswitch_1c
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 955
    .line 956
    return-object p0

    .line 957
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
