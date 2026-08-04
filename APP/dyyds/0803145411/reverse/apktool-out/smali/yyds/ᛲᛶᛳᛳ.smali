.class public final Lyyds/ᛲᛶᛳᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛲᛶᛳᛳ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "json can not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lyyds/ᛴᛸᛲ;->ᛲᛳᛶᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛲᛶᛳᛳ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛲᛶᛳᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final varargs ᛲᲈᲁ(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, "path can not be null or empty"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lyyds/ᛴᛸᛲ;->ᛱᲈᲁ(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyyds/ᛷᛱᛵᛱ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    sget-object v0, Lyyds/ᛴᲈᛴᛴ;->ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;

    .line 9
    .line 10
    array-length v1, p2

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v4, 0x2

    .line 22
    new-array v4, v4, [Ljava/lang/CharSequence;

    .line 23
    .line 24
    aput-object p1, v4, v3

    .line 25
    .line 26
    aput-object v1, v4, v2

    .line 27
    .line 28
    invoke-static {v4}, Lyyds/ᛴᛸᛲ;->ᛵᛸᛸᛷ([Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    move-object v4, v0

    .line 33
    check-cast v4, Lyyds/ᛳᛷᲀᛴ;

    .line 34
    .line 35
    iget-object v5, v4, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lyyds/ᛱᛷᲁᲀ;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛶᲀᲈᲇ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    if-nez v5, :cond_3

    .line 51
    .line 52
    const-string v4, "json can not be null or empty"

    .line 53
    .line 54
    invoke-static {p1, v4}, Lyyds/ᛴᛸᛲ;->ᛱᲈᲁ(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lyyds/ᛱᛷᲁᲀ;

    .line 58
    .line 59
    invoke-direct {v5, p1, p2}, Lyyds/ᛱᛷᲁᲀ;-><init>(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)V

    .line 60
    .line 61
    .line 62
    check-cast v0, Lyyds/ᛳᛷᲀᛴ;

    .line 63
    .line 64
    iget-object p1, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/LinkedList;

    .line 67
    .line 68
    iget-object p2, v0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 71
    .line 72
    iget-object v4, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-virtual {v4, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Lyyds/ᛱᛷᲁᲀ;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛶᲀᲈᲇ(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 89
    .line 90
    .line 91
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/16 v1, 0x190

    .line 102
    .line 103
    if-le v0, v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 106
    .line 107
    .line 108
    :try_start_1
    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catchall_0
    move-exception p0

    .line 122
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :cond_3
    :goto_2
    iget-object p1, p0, Lyyds/ᛲᛶᛳᛳ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 132
    .line 133
    iget-object p2, p1, Lyyds/ᛴᲈᛳᛶ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 134
    .line 135
    iget-object v0, p1, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 136
    .line 137
    sget-object v1, Lyyds/ᛲᲀᲇᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲀᲇᲇ;

    .line 138
    .line 139
    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    sget-object v6, Lyyds/ᛲᲀᲇᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲀᲇᲇ;

    .line 144
    .line 145
    invoke-interface {p2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    sget-object v8, Lyyds/ᛲᲀᲇᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲀᲇᲇ;

    .line 150
    .line 151
    invoke-interface {p2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    iget-object v5, v5, Lyyds/ᛱᛷᲁᲀ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛵᲇ;

    .line 156
    .line 157
    iget-object v8, v5, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 158
    .line 159
    iget-object v9, v8, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 160
    .line 161
    instance-of v9, v9, Lyyds/ᛲᛱᲁᲁ;

    .line 162
    .line 163
    iget-object p0, p0, Lyyds/ᛲᛶᛳᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 164
    .line 165
    if-eqz v9, :cond_a

    .line 166
    .line 167
    if-nez v4, :cond_7

    .line 168
    .line 169
    if-eqz v7, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    invoke-virtual {v5, p0, p0, p1}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-eqz p2, :cond_6

    .line 177
    .line 178
    invoke-virtual {p0}, Lyyds/ᛸᛴᛷᲇ;->ᛵᛸᛸᛷ()Ljava/util/ArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_6

    .line 187
    .line 188
    invoke-virtual {v8}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲇᲇᛱ()Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-eqz p0, :cond_5

    .line 193
    .line 194
    goto/16 :goto_4

    .line 195
    .line 196
    :cond_5
    iget-object p0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, Lyyds/ᛳᲇᛵᲇ;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance p0, Lyyds/ᲁᛸᛲᛱ;

    .line 204
    .line 205
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :cond_6
    invoke-virtual {p0, v2}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :cond_7
    :goto_3
    if-eqz p2, :cond_9

    .line 215
    .line 216
    invoke-virtual {v8}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲇᲇᛱ()Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-eqz p0, :cond_8

    .line 221
    .line 222
    goto/16 :goto_4

    .line 223
    .line 224
    :cond_8
    iget-object p0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p0, Lyyds/ᛳᲇᛵᲇ;

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance p0, Lyyds/ᲁᛸᛲᛱ;

    .line 232
    .line 233
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    return-object p0

    .line 237
    :cond_9
    new-instance p0, Lyyds/ᛸᛳᛵᛳ;

    .line 238
    .line 239
    new-instance p1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    const-string p2, "Options "

    .line 242
    .line 243
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string p2, " and "

    .line 250
    .line 251
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string p2, " are not allowed when using path functions!"

    .line 258
    .line 259
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p0

    .line 270
    :cond_a
    if-eqz v4, :cond_e

    .line 271
    .line 272
    invoke-virtual {v5, p0, p0, p1}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    if-eqz p2, :cond_b

    .line 277
    .line 278
    invoke-virtual {p0}, Lyyds/ᛸᛴᛷᲇ;->ᛵᛸᛸᛷ()Ljava/util/ArrayList;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_b

    .line 287
    .line 288
    iget-object p0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p0, Lyyds/ᛳᲇᛵᲇ;

    .line 291
    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    new-instance p0, Lyyds/ᲁᛸᛲᛱ;

    .line 296
    .line 297
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    return-object p0

    .line 301
    :cond_b
    iget p1, p0, Lyyds/ᛸᛴᛷᲇ;->ᛱᲈᲁ:I

    .line 302
    .line 303
    if-nez p1, :cond_d

    .line 304
    .line 305
    iget-boolean p1, p0, Lyyds/ᛸᛴᛷᲇ;->ᛶᛷᛲᲁ:Z

    .line 306
    .line 307
    if-eqz p1, :cond_c

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_c
    new-instance p1, Lyyds/ᛷᛵᛳᲈ;

    .line 311
    .line 312
    iget-object p0, p0, Lyyds/ᛸᛴᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛳᛵᲇ;

    .line 313
    .line 314
    iget-object p0, p0, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 315
    .line 316
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    new-instance p2, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    const-string v0, "No results for path: "

    .line 323
    .line 324
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw p1

    .line 338
    :cond_d
    iget-object p0, p0, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 339
    .line 340
    return-object p0

    .line 341
    :cond_e
    invoke-virtual {v5, p0, p0, p1}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    if-eqz p2, :cond_11

    .line 346
    .line 347
    invoke-virtual {p0}, Lyyds/ᛸᛴᛷᲇ;->ᛵᛸᛸᛷ()Ljava/util/ArrayList;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-eqz p1, :cond_11

    .line 356
    .line 357
    if-eqz v7, :cond_f

    .line 358
    .line 359
    iget-object p0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p0, Lyyds/ᛳᲇᛵᲇ;

    .line 362
    .line 363
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance p0, Lyyds/ᲁᛸᛲᛱ;

    .line 367
    .line 368
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    return-object p0

    .line 372
    :cond_f
    invoke-virtual {v8}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲇᲇᛱ()Z

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    if-eqz p0, :cond_10

    .line 377
    .line 378
    :goto_4
    const/4 p0, 0x0

    .line 379
    return-object p0

    .line 380
    :cond_10
    iget-object p0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast p0, Lyyds/ᛳᲇᛵᲇ;

    .line 383
    .line 384
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance p0, Lyyds/ᲁᛸᛲᛱ;

    .line 388
    .line 389
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 390
    .line 391
    .line 392
    return-object p0

    .line 393
    :cond_11
    invoke-virtual {p0, v3}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    if-eqz v7, :cond_12

    .line 398
    .line 399
    invoke-virtual {v8}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲇᲇᛱ()Z

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    if-eqz p1, :cond_12

    .line 404
    .line 405
    iget-object p1, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p1, Lyyds/ᛳᲇᛵᲇ;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance p1, Lyyds/ᲁᛸᛲᛱ;

    .line 413
    .line 414
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, p1, v3, p0}, Lyyds/ᛱᛱᛴ;->ᛷᛸᲇᛶ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-object p1

    .line 421
    :cond_12
    return-object p0
.end method
