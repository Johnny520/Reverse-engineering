.class public final Lr0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final e:Ljava/util/List;

.field public static final f:Ljava/util/List;

.field public static final g:[Ljava/lang/String;

.field public static final h:Ljava/util/Set;


# instance fields
.field public volatile a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Lr0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "\u4f60\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    .line 2
    .line 3
    const-string v1, "you recalled a message"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LF0/l;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lr0/i;->e:Ljava/util/List;

    .line 14
    .line 15
    const-string v0, "\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    .line 16
    .line 17
    const-string v1, "recalled a message"

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LF0/l;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lr0/i;->f:Ljava/util/List;

    .line 28
    .line 29
    const-string v7, "mw3.w"

    .line 30
    .line 31
    const-string v8, "q12.b0"

    .line 32
    .line 33
    const-string v1, "com.tencent.mm.chatroom.plugin.listener.n0"

    .line 34
    .line 35
    const-string v2, "com.tencent.mm.chatroom.plugin.listener.k0"

    .line 36
    .line 37
    const-string v3, "ak5.y"

    .line 38
    .line 39
    const-string v4, "eg5.j"

    .line 40
    .line 41
    const-string v5, "f81.o"

    .line 42
    .line 43
    const-string v6, "lc5.y"

    .line 44
    .line 45
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lr0/i;->g:[Ljava/lang/String;

    .line 50
    .line 51
    const-string v6, "replace"

    .line 52
    .line 53
    const-string v7, "replaceOrThrow"

    .line 54
    .line 55
    const-string v1, "insert"

    .line 56
    .line 57
    const-string v2, "insertOrThrow"

    .line 58
    .line 59
    const-string v3, "insertWithOnConflict"

    .line 60
    .line 61
    const-string v4, "update"

    .line 62
    .line 63
    const-string v5, "updateWithOnConflict"

    .line 64
    .line 65
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, LF0/w;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lr0/i;->h:Ljava/util/Set;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lr0/c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lr0/c;-><init>(Lr0/i;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr0/i;->d:Lr0/c;

    .line 17
    .line 18
    return-void
.end method

.method public static final a(Lr0/i;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v1

    .line 19
    :goto_0
    const-string v3, "com.tencent.mm.autogen.events.RevokeMsgEvent"

    .line 20
    .line 21
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_45

    .line 28
    .line 29
    :cond_1
    const-string v2, "f71953g"

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    :catchall_0
    :cond_2
    :goto_1
    move-object v2, v1

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    :goto_2
    if-eqz v4, :cond_2

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v4, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catch_0
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    :goto_3
    if-nez v2, :cond_8

    .line 62
    .line 63
    const-string v2, "g"

    .line 64
    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    :catchall_1
    :cond_5
    :goto_4
    move-object v2, v1

    .line 68
    goto :goto_6

    .line 69
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :goto_5
    if-eqz v4, :cond_5

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v4, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    if-nez v0, :cond_7

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    move-object v2, v0

    .line 90
    goto :goto_6

    .line 91
    :catch_1
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    goto :goto_5

    .line 96
    :goto_6
    if-nez v2, :cond_8

    .line 97
    .line 98
    goto/16 :goto_45

    .line 99
    .line 100
    :cond_8
    const-string v0, "f6371c"

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    :goto_7
    if-eqz v4, :cond_9

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    if-nez v0, :cond_a

    .line 120
    .line 121
    :catchall_2
    :cond_9
    move-object v0, v1

    .line 122
    goto :goto_8

    .line 123
    :catch_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    goto :goto_7

    .line 128
    :cond_a
    :goto_8
    if-nez v0, :cond_c

    .line 129
    .line 130
    const-string v0, "c"

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    :goto_9
    if-eqz v4, :cond_b

    .line 137
    .line 138
    :try_start_3
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 149
    if-nez v0, :cond_c

    .line 150
    .line 151
    :catchall_3
    :cond_b
    move-object v4, v1

    .line 152
    goto :goto_a

    .line 153
    :cond_c
    move-object v4, v0

    .line 154
    goto :goto_a

    .line 155
    :catch_3
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    goto :goto_9

    .line 160
    :goto_a
    const-string v5, "getDeclaredMethods(...)"

    .line 161
    .line 162
    const-string v6, "getMethods(...)"

    .line 163
    .line 164
    const-string v7, "getParameterTypes(...)"

    .line 165
    .line 166
    if-nez v4, :cond_d

    .line 167
    .line 168
    :goto_b
    move-object v0, v1

    .line 169
    goto/16 :goto_12

    .line 170
    .line 171
    :cond_d
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    array-length v9, v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 183
    const/4 v10, 0x0

    .line 184
    :goto_c
    const-string v11, "Q0"

    .line 185
    .line 186
    if-ge v10, v9, :cond_f

    .line 187
    .line 188
    :try_start_5
    aget-object v12, v0, v10

    .line 189
    .line 190
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    invoke-static {v13, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-eqz v13, :cond_e

    .line 199
    .line 200
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    invoke-static {v13, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    array-length v13, v13

    .line 208
    if-nez v13, :cond_e

    .line 209
    .line 210
    goto :goto_d

    .line 211
    :catchall_4
    move-exception v0

    .line 212
    goto :goto_10

    .line 213
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 214
    .line 215
    goto :goto_c

    .line 216
    :cond_f
    move-object v12, v1

    .line 217
    :goto_d
    if-nez v12, :cond_12

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    array-length v9, v0

    .line 231
    const/4 v10, 0x0

    .line 232
    :goto_e
    if-ge v10, v9, :cond_11

    .line 233
    .line 234
    aget-object v12, v0, v10

    .line 235
    .line 236
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    invoke-static {v13, v11}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v13

    .line 244
    if-eqz v13, :cond_10

    .line 245
    .line 246
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-static {v13, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    array-length v13, v13

    .line 254
    if-nez v13, :cond_10

    .line 255
    .line 256
    goto :goto_f

    .line 257
    :cond_10
    add-int/lit8 v10, v10, 0x1

    .line 258
    .line 259
    goto :goto_e

    .line 260
    :cond_11
    move-object v12, v1

    .line 261
    :goto_f
    if-nez v12, :cond_12

    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_12
    invoke-virtual {v12, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    instance-of v9, v0, Ljava/lang/String;

    .line 272
    .line 273
    if-nez v9, :cond_13

    .line 274
    .line 275
    move-object v0, v1

    .line 276
    :cond_13
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 277
    .line 278
    goto :goto_11

    .line 279
    :goto_10
    new-instance v9, LE0/d;

    .line 280
    .line 281
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    move-object v0, v9

    .line 285
    :goto_11
    nop

    .line 286
    instance-of v9, v0, LE0/d;

    .line 287
    .line 288
    if-eqz v9, :cond_14

    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_14
    :goto_12
    check-cast v0, Ljava/lang/String;

    .line 292
    .line 293
    if-nez v0, :cond_18

    .line 294
    .line 295
    const-string v0, "field_talker"

    .line 296
    .line 297
    if-nez v4, :cond_16

    .line 298
    .line 299
    :catchall_5
    :cond_15
    move-object v0, v1

    .line 300
    goto :goto_14

    .line 301
    :cond_16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    :goto_13
    if-eqz v9, :cond_15

    .line 306
    .line 307
    :try_start_6
    invoke-virtual {v9, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    invoke-virtual {v10, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v10, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    instance-of v11, v10, Ljava/lang/String;

    .line 319
    .line 320
    if-nez v11, :cond_17

    .line 321
    .line 322
    move-object v10, v1

    .line 323
    :cond_17
    check-cast v10, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 324
    .line 325
    move-object v0, v10

    .line 326
    goto :goto_14

    .line 327
    :catch_4
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    goto :goto_13

    .line 332
    :goto_14
    if-nez v0, :cond_18

    .line 333
    .line 334
    goto/16 :goto_45

    .line 335
    .line 336
    :cond_18
    move-object v11, v0

    .line 337
    if-nez v4, :cond_19

    .line 338
    .line 339
    :goto_15
    move-object v0, v1

    .line 340
    goto/16 :goto_1c

    .line 341
    .line 342
    :cond_19
    :try_start_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    array-length v9, v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 354
    const/4 v10, 0x0

    .line 355
    :goto_16
    const-string v12, "I0"

    .line 356
    .line 357
    if-ge v10, v9, :cond_1b

    .line 358
    .line 359
    :try_start_8
    aget-object v13, v0, v10

    .line 360
    .line 361
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v14

    .line 365
    invoke-static {v14, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v14

    .line 369
    if-eqz v14, :cond_1a

    .line 370
    .line 371
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    invoke-static {v14, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    array-length v14, v14

    .line 379
    if-nez v14, :cond_1a

    .line 380
    .line 381
    goto :goto_17

    .line 382
    :catchall_6
    move-exception v0

    .line 383
    goto :goto_1a

    .line 384
    :cond_1a
    add-int/lit8 v10, v10, 0x1

    .line 385
    .line 386
    goto :goto_16

    .line 387
    :cond_1b
    move-object v13, v1

    .line 388
    :goto_17
    if-nez v13, :cond_1e

    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    array-length v9, v0

    .line 402
    const/4 v10, 0x0

    .line 403
    :goto_18
    if-ge v10, v9, :cond_1d

    .line 404
    .line 405
    aget-object v13, v0, v10

    .line 406
    .line 407
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v14

    .line 411
    invoke-static {v14, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    if-eqz v14, :cond_1c

    .line 416
    .line 417
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-result-object v14

    .line 421
    invoke-static {v14, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    array-length v14, v14

    .line 425
    if-nez v14, :cond_1c

    .line 426
    .line 427
    goto :goto_19

    .line 428
    :cond_1c
    add-int/lit8 v10, v10, 0x1

    .line 429
    .line 430
    goto :goto_18

    .line 431
    :cond_1d
    move-object v13, v1

    .line 432
    :goto_19
    if-nez v13, :cond_1e

    .line 433
    .line 434
    goto :goto_15

    .line 435
    :cond_1e
    invoke-virtual {v13, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v13, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    instance-of v9, v0, Ljava/lang/Number;

    .line 443
    .line 444
    if-nez v9, :cond_1f

    .line 445
    .line 446
    move-object v0, v1

    .line 447
    :cond_1f
    check-cast v0, Ljava/lang/Number;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 448
    .line 449
    goto :goto_1b

    .line 450
    :goto_1a
    new-instance v9, LE0/d;

    .line 451
    .line 452
    invoke-direct {v9, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    move-object v0, v9

    .line 456
    :goto_1b
    nop

    .line 457
    instance-of v9, v0, LE0/d;

    .line 458
    .line 459
    if-eqz v9, :cond_20

    .line 460
    .line 461
    goto :goto_15

    .line 462
    :cond_20
    :goto_1c
    check-cast v0, Ljava/lang/Number;

    .line 463
    .line 464
    const-wide/16 v9, 0x0

    .line 465
    .line 466
    if-eqz v0, :cond_22

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 469
    .line 470
    .line 471
    move-result-wide v12

    .line 472
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    cmp-long v12, v12, v9

    .line 477
    .line 478
    if-lez v12, :cond_21

    .line 479
    .line 480
    goto :goto_1d

    .line 481
    :cond_21
    move-object v0, v1

    .line 482
    :goto_1d
    if-eqz v0, :cond_22

    .line 483
    .line 484
    :goto_1e
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v12

    .line 488
    goto/16 :goto_24

    .line 489
    .line 490
    :cond_22
    const-string v0, "f6373e"

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    :goto_1f
    if-eqz v12, :cond_24

    .line 497
    .line 498
    :try_start_9
    invoke-virtual {v12, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 499
    .line 500
    .line 501
    move-result-object v13

    .line 502
    invoke-virtual {v13, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v13, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v13

    .line 509
    instance-of v14, v13, Ljava/lang/Number;

    .line 510
    .line 511
    if-nez v14, :cond_23

    .line 512
    .line 513
    move-object v13, v1

    .line 514
    :cond_23
    check-cast v13, Ljava/lang/Number;
    :try_end_9
    .catch Ljava/lang/NoSuchFieldException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 515
    .line 516
    goto :goto_20

    .line 517
    :catchall_7
    :cond_24
    move-object v13, v1

    .line 518
    goto :goto_20

    .line 519
    :catch_5
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    move-result-object v12

    .line 523
    goto :goto_1f

    .line 524
    :goto_20
    if-eqz v13, :cond_25

    .line 525
    .line 526
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 527
    .line 528
    .line 529
    move-result-wide v12

    .line 530
    goto :goto_24

    .line 531
    :cond_25
    const-string v0, "e"

    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    :goto_21
    if-eqz v12, :cond_27

    .line 538
    .line 539
    :try_start_a
    invoke-virtual {v12, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 540
    .line 541
    .line 542
    move-result-object v13

    .line 543
    invoke-virtual {v13, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v13, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v13

    .line 550
    instance-of v14, v13, Ljava/lang/Number;

    .line 551
    .line 552
    if-nez v14, :cond_26

    .line 553
    .line 554
    move-object v13, v1

    .line 555
    :cond_26
    check-cast v13, Ljava/lang/Number;
    :try_end_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 556
    .line 557
    goto :goto_22

    .line 558
    :catchall_8
    :cond_27
    move-object v13, v1

    .line 559
    goto :goto_22

    .line 560
    :catch_6
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    goto :goto_21

    .line 565
    :goto_22
    if-eqz v13, :cond_28

    .line 566
    .line 567
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 568
    .line 569
    .line 570
    move-result-wide v12

    .line 571
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    goto :goto_23

    .line 576
    :cond_28
    move-object v0, v1

    .line 577
    :goto_23
    if-eqz v0, :cond_4e

    .line 578
    .line 579
    goto :goto_1e

    .line 580
    :goto_24
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-nez v0, :cond_4e

    .line 585
    .line 586
    cmp-long v0, v12, v9

    .line 587
    .line 588
    if-gtz v0, :cond_29

    .line 589
    .line 590
    goto/16 :goto_45

    .line 591
    .line 592
    :cond_29
    if-nez v4, :cond_2a

    .line 593
    .line 594
    :goto_25
    move-object v0, v1

    .line 595
    goto/16 :goto_2c

    .line 596
    .line 597
    :cond_2a
    :try_start_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    array-length v2, v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 609
    const/4 v9, 0x0

    .line 610
    :goto_26
    const-string v10, "getCreateTime"

    .line 611
    .line 612
    if-ge v9, v2, :cond_2c

    .line 613
    .line 614
    :try_start_c
    aget-object v14, v0, v9

    .line 615
    .line 616
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v15

    .line 620
    invoke-static {v15, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v15

    .line 624
    if-eqz v15, :cond_2b

    .line 625
    .line 626
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    move-result-object v15

    .line 630
    invoke-static {v15, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    array-length v15, v15

    .line 634
    if-nez v15, :cond_2b

    .line 635
    .line 636
    goto :goto_27

    .line 637
    :catchall_9
    move-exception v0

    .line 638
    goto :goto_2a

    .line 639
    :cond_2b
    add-int/lit8 v9, v9, 0x1

    .line 640
    .line 641
    goto :goto_26

    .line 642
    :cond_2c
    move-object v14, v1

    .line 643
    :goto_27
    if-nez v14, :cond_2f

    .line 644
    .line 645
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    array-length v2, v0

    .line 657
    const/4 v9, 0x0

    .line 658
    :goto_28
    if-ge v9, v2, :cond_2e

    .line 659
    .line 660
    aget-object v14, v0, v9

    .line 661
    .line 662
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v15

    .line 666
    invoke-static {v15, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v15

    .line 670
    if-eqz v15, :cond_2d

    .line 671
    .line 672
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    move-result-object v15

    .line 676
    invoke-static {v15, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    array-length v15, v15

    .line 680
    if-nez v15, :cond_2d

    .line 681
    .line 682
    goto :goto_29

    .line 683
    :cond_2d
    add-int/lit8 v9, v9, 0x1

    .line 684
    .line 685
    goto :goto_28

    .line 686
    :cond_2e
    move-object v14, v1

    .line 687
    :goto_29
    if-nez v14, :cond_2f

    .line 688
    .line 689
    goto :goto_25

    .line 690
    :cond_2f
    invoke-virtual {v14, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v14, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    instance-of v2, v0, Ljava/lang/Number;

    .line 698
    .line 699
    if-nez v2, :cond_30

    .line 700
    .line 701
    move-object v0, v1

    .line 702
    :cond_30
    check-cast v0, Ljava/lang/Number;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 703
    .line 704
    goto :goto_2b

    .line 705
    :goto_2a
    new-instance v2, LE0/d;

    .line 706
    .line 707
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 708
    .line 709
    .line 710
    move-object v0, v2

    .line 711
    :goto_2b
    nop

    .line 712
    instance-of v2, v0, LE0/d;

    .line 713
    .line 714
    if-eqz v2, :cond_31

    .line 715
    .line 716
    goto :goto_25

    .line 717
    :cond_31
    :goto_2c
    check-cast v0, Ljava/lang/Number;

    .line 718
    .line 719
    if-eqz v0, :cond_32

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 722
    .line 723
    .line 724
    move-result-wide v9

    .line 725
    goto :goto_2d

    .line 726
    :cond_32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 727
    .line 728
    .line 729
    move-result-wide v9

    .line 730
    :goto_2d
    if-nez v4, :cond_33

    .line 731
    .line 732
    goto/16 :goto_36

    .line 733
    .line 734
    :cond_33
    :try_start_d
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    array-length v2, v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 746
    const/4 v14, 0x0

    .line 747
    :goto_2e
    const-string v15, "j"

    .line 748
    .line 749
    if-ge v14, v2, :cond_35

    .line 750
    .line 751
    :try_start_e
    aget-object v16, v0, v14

    .line 752
    .line 753
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v8

    .line 757
    invoke-static {v8, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v8

    .line 761
    if-eqz v8, :cond_34

    .line 762
    .line 763
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    move-result-object v8

    .line 767
    invoke-static {v8, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    array-length v8, v8

    .line 771
    if-nez v8, :cond_34

    .line 772
    .line 773
    goto :goto_2f

    .line 774
    :catchall_a
    move-exception v0

    .line 775
    goto :goto_34

    .line 776
    :cond_34
    add-int/lit8 v14, v14, 0x1

    .line 777
    .line 778
    goto :goto_2e

    .line 779
    :cond_35
    move-object/from16 v16, v1

    .line 780
    .line 781
    :goto_2f
    if-nez v16, :cond_38

    .line 782
    .line 783
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    array-length v2, v0

    .line 795
    const/4 v8, 0x0

    .line 796
    :goto_30
    if-ge v8, v2, :cond_37

    .line 797
    .line 798
    aget-object v14, v0, v8

    .line 799
    .line 800
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-static {v1, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-eqz v1, :cond_36

    .line 809
    .line 810
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v1, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    array-length v1, v1

    .line 818
    if-nez v1, :cond_36

    .line 819
    .line 820
    move-object/from16 v16, v14

    .line 821
    .line 822
    goto :goto_31

    .line 823
    :cond_36
    add-int/lit8 v8, v8, 0x1

    .line 824
    .line 825
    const/4 v1, 0x0

    .line 826
    goto :goto_30

    .line 827
    :cond_37
    const/16 v16, 0x0

    .line 828
    .line 829
    :goto_31
    if-nez v16, :cond_38

    .line 830
    .line 831
    :goto_32
    const/4 v1, 0x0

    .line 832
    goto :goto_36

    .line 833
    :cond_38
    move-object/from16 v0, v16

    .line 834
    .line 835
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 836
    .line 837
    .line 838
    const/4 v1, 0x0

    .line 839
    invoke-virtual {v0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    instance-of v1, v0, Ljava/lang/String;

    .line 844
    .line 845
    if-nez v1, :cond_39

    .line 846
    .line 847
    const/4 v1, 0x0

    .line 848
    goto :goto_33

    .line 849
    :cond_39
    move-object v1, v0

    .line 850
    :goto_33
    check-cast v1, Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 851
    .line 852
    goto :goto_35

    .line 853
    :goto_34
    new-instance v1, LE0/d;

    .line 854
    .line 855
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 856
    .line 857
    .line 858
    :goto_35
    instance-of v0, v1, LE0/d;

    .line 859
    .line 860
    if-eqz v0, :cond_3a

    .line 861
    .line 862
    goto :goto_32

    .line 863
    :cond_3a
    :goto_36
    check-cast v1, Ljava/lang/String;

    .line 864
    .line 865
    if-nez v1, :cond_3e

    .line 866
    .line 867
    const-string v0, "field_content"

    .line 868
    .line 869
    if-nez v4, :cond_3c

    .line 870
    .line 871
    :catchall_b
    :cond_3b
    const/4 v1, 0x0

    .line 872
    goto :goto_38

    .line 873
    :cond_3c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    :goto_37
    if-eqz v1, :cond_3b

    .line 878
    .line 879
    :try_start_f
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    instance-of v8, v2, Ljava/lang/String;

    .line 891
    .line 892
    if-nez v8, :cond_3d

    .line 893
    .line 894
    const/4 v2, 0x0

    .line 895
    :cond_3d
    check-cast v2, Ljava/lang/String;
    :try_end_f
    .catch Ljava/lang/NoSuchFieldException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 896
    .line 897
    move-object v1, v2

    .line 898
    goto :goto_38

    .line 899
    :catch_7
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    goto :goto_37

    .line 904
    :goto_38
    if-nez v1, :cond_3e

    .line 905
    .line 906
    const-string v1, ""

    .line 907
    .line 908
    :cond_3e
    if-nez v4, :cond_3f

    .line 909
    .line 910
    :goto_39
    const/4 v2, 0x0

    .line 911
    const/16 v17, 0x0

    .line 912
    .line 913
    goto/16 :goto_40

    .line 914
    .line 915
    :cond_3f
    :try_start_10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    array-length v2, v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 927
    const/4 v6, 0x0

    .line 928
    :goto_3a
    const-string v8, "A0"

    .line 929
    .line 930
    if-ge v6, v2, :cond_41

    .line 931
    .line 932
    :try_start_11
    aget-object v14, v0, v6

    .line 933
    .line 934
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v15

    .line 938
    invoke-static {v15, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v15

    .line 942
    if-eqz v15, :cond_40

    .line 943
    .line 944
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    move-result-object v15

    .line 948
    invoke-static {v15, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    array-length v15, v15

    .line 952
    if-nez v15, :cond_40

    .line 953
    .line 954
    goto :goto_3b

    .line 955
    :catchall_c
    move-exception v0

    .line 956
    const/4 v2, 0x0

    .line 957
    goto :goto_3e

    .line 958
    :cond_40
    add-int/lit8 v6, v6, 0x1

    .line 959
    .line 960
    goto :goto_3a

    .line 961
    :cond_41
    const/4 v14, 0x0

    .line 962
    :goto_3b
    if-nez v14, :cond_45

    .line 963
    .line 964
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    array-length v2, v0

    .line 976
    const/4 v5, 0x0

    .line 977
    :goto_3c
    if-ge v5, v2, :cond_43

    .line 978
    .line 979
    aget-object v6, v0, v5

    .line 980
    .line 981
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v14

    .line 985
    invoke-static {v14, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v14

    .line 989
    if-eqz v14, :cond_42

    .line 990
    .line 991
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    move-result-object v14

    .line 995
    invoke-static {v14, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    array-length v14, v14

    .line 999
    if-nez v14, :cond_42

    .line 1000
    .line 1001
    goto :goto_3d

    .line 1002
    :cond_42
    add-int/lit8 v5, v5, 0x1

    .line 1003
    .line 1004
    goto :goto_3c

    .line 1005
    :cond_43
    const/4 v6, 0x0

    .line 1006
    :goto_3d
    if-nez v6, :cond_44

    .line 1007
    .line 1008
    goto :goto_39

    .line 1009
    :cond_44
    move-object v14, v6

    .line 1010
    :cond_45
    invoke-virtual {v14, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 1011
    .line 1012
    .line 1013
    const/4 v2, 0x0

    .line 1014
    :try_start_12
    invoke-virtual {v14, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    instance-of v5, v0, Ljava/lang/Number;

    .line 1019
    .line 1020
    if-nez v5, :cond_46

    .line 1021
    .line 1022
    move-object v0, v2

    .line 1023
    :cond_46
    check-cast v0, Ljava/lang/Number;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    .line 1024
    .line 1025
    goto :goto_3f

    .line 1026
    :catchall_d
    move-exception v0

    .line 1027
    :goto_3e
    new-instance v5, LE0/d;

    .line 1028
    .line 1029
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1030
    .line 1031
    .line 1032
    move-object v0, v5

    .line 1033
    :goto_3f
    nop

    .line 1034
    instance-of v5, v0, LE0/d;

    .line 1035
    .line 1036
    if-eqz v5, :cond_47

    .line 1037
    .line 1038
    move-object v0, v2

    .line 1039
    :cond_47
    move-object/from16 v17, v0

    .line 1040
    .line 1041
    :goto_40
    check-cast v17, Ljava/lang/Number;

    .line 1042
    .line 1043
    if-eqz v17, :cond_48

    .line 1044
    .line 1045
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    goto :goto_43

    .line 1050
    :cond_48
    const-string v0, "field_isSend"

    .line 1051
    .line 1052
    if-nez v4, :cond_49

    .line 1053
    .line 1054
    goto :goto_42

    .line 1055
    :cond_49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v5

    .line 1059
    :goto_41
    if-eqz v5, :cond_4b

    .line 1060
    .line 1061
    :try_start_13
    invoke-virtual {v5, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v6

    .line 1065
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v6, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v6

    .line 1072
    instance-of v7, v6, Ljava/lang/Number;

    .line 1073
    .line 1074
    if-nez v7, :cond_4a

    .line 1075
    .line 1076
    move-object v6, v2

    .line 1077
    :cond_4a
    check-cast v6, Ljava/lang/Number;
    :try_end_13
    .catch Ljava/lang/NoSuchFieldException; {:try_start_13 .. :try_end_13} :catch_8
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 1078
    .line 1079
    move-object v2, v6

    .line 1080
    goto :goto_42

    .line 1081
    :catch_8
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v5

    .line 1085
    goto :goto_41

    .line 1086
    :catchall_e
    :cond_4b
    :goto_42
    if-eqz v2, :cond_4c

    .line 1087
    .line 1088
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    goto :goto_43

    .line 1093
    :cond_4c
    const/4 v0, 0x0

    .line 1094
    :goto_43
    if-ne v0, v3, :cond_4d

    .line 1095
    .line 1096
    goto :goto_44

    .line 1097
    :cond_4d
    const/4 v3, 0x0

    .line 1098
    :goto_44
    new-instance v14, Lr0/e;

    .line 1099
    .line 1100
    invoke-direct {v14, v9, v10, v1, v3}, Lr0/e;-><init>(JLjava/lang/String;Z)V

    .line 1101
    .line 1102
    .line 1103
    const-string v15, "event"

    .line 1104
    .line 1105
    move-object/from16 v9, p0

    .line 1106
    .line 1107
    move-object/from16 v10, p1

    .line 1108
    .line 1109
    invoke-virtual/range {v9 .. v15}, Lr0/i;->d(Landroid/content/Context;Ljava/lang/String;JLr0/e;Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    :cond_4e
    :goto_45
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const-string v2, ":\n"

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p0, v0

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-static {p0, v2}, LU0/i;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x50

    .line 32
    .line 33
    if-gt v1, v2, :cond_1

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    :cond_1
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string p0, "\""

    .line 46
    .line 47
    const-string v1, "\"\u5c1d\u8bd5\u64a4\u56de\u4e0a\u4e00\u6761\u6d88\u606f[\u5df2\u963b\u6b62]"

    .line 48
    .line 49
    invoke-static {p0, v0, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    :goto_1
    const-string p0, "\u5bf9\u65b9\u5c1d\u8bd5\u64a4\u56de\u4e0a\u4e00\u6761\u6d88\u606f[\u5df2\u963b\u6b62]"

    .line 55
    .line 56
    return-object p0
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    array-length v4, v4

    .line 35
    const/4 v5, 0x1

    .line 36
    if-ne v4, v5, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v3, 0x0

    .line 43
    :goto_1
    if-nez v3, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    new-instance v0, LE0/d;

    .line 57
    .line 58
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, v0

    .line 62
    :goto_2
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    const-string v0, "anti revoke set msg field fail"

    .line 69
    .line 70
    filled-new-array {v0, p2, p1, p0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_3
    return-void
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lr0/i;->e:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-static {p0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    return v2

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public static g()Lr0/d;
    .locals 10

    .line 1
    new-instance v0, Lr0/d;

    .line 2
    .line 3
    const-string v3, "sc3.x3"

    .line 4
    .line 5
    const-string v4, "yj0.j1"

    .line 6
    .line 7
    const-string v1, "com.tencent.mm.storage.a9"

    .line 8
    .line 9
    const-string v2, "com.tencent.mm.storage.y8"

    .line 10
    .line 11
    const-string v5, "xh"

    .line 12
    .line 13
    const-string v6, "L9"

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lr0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lr0/d;

    .line 19
    .line 20
    const-string v4, "ge3.x3"

    .line 21
    .line 22
    const-string v5, "tk0.j1"

    .line 23
    .line 24
    const-string v2, "com.tencent.mm.storage.h9"

    .line 25
    .line 26
    const-string v3, "com.tencent.mm.storage.f9"

    .line 27
    .line 28
    const-string v6, "Ah"

    .line 29
    .line 30
    const-string v7, "z9"

    .line 31
    .line 32
    invoke-direct/range {v1 .. v7}, Lr0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lr0/d;

    .line 36
    .line 37
    const-string v5, "ef3.x3"

    .line 38
    .line 39
    const-string v6, "dl0.k1"

    .line 40
    .line 41
    const-string v3, "com.tencent.mm.storage.h9"

    .line 42
    .line 43
    const-string v4, "com.tencent.mm.storage.f9"

    .line 44
    .line 45
    const-string v7, "Wh"

    .line 46
    .line 47
    const-string v8, "z9"

    .line 48
    .line 49
    invoke-direct/range {v2 .. v8}, Lr0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lr0/d;

    .line 53
    .line 54
    const-string v6, "com.tencent.mm.plugin.messenger.foundation.h2"

    .line 55
    .line 56
    const-string v7, "gm0.j1"

    .line 57
    .line 58
    const-string v4, "com.tencent.mm.storage.g9"

    .line 59
    .line 60
    const-string v5, "com.tencent.mm.storage.f9"

    .line 61
    .line 62
    const-string v8, "cj"

    .line 63
    .line 64
    const-string v9, "M9"

    .line 65
    .line 66
    invoke-direct/range {v3 .. v9}, Lr0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lr0/d;

    .line 74
    .line 75
    return-object v0
.end method

.method public static h(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v2, "getParameterTypes(...)"

    .line 18
    .line 19
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lq0/d;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, v3}, Lq0/d;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/16 v3, 0x1e

    .line 29
    .line 30
    const-string v4, ","

    .line 31
    .line 32
    invoke-static {p0, v4, v2, v3}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "#"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "("

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 8

    .line 1
    const-string v0, "rawQuery"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-class v3, Ljava/lang/String;

    .line 9
    .line 10
    const-class v4, [Ljava/lang/Object;

    .line 11
    .line 12
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v3, v2, Landroid/database/Cursor;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    check-cast v2, Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v2, v1

    .line 38
    goto :goto_1

    .line 39
    :goto_0
    new-instance v3, LE0/d;

    .line 40
    .line 41
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_1
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_8

    .line 52
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getMethods(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    array-length v3, v2

    .line 66
    const/4 v4, 0x0

    .line 67
    :goto_2
    if-ge v4, v3, :cond_3

    .line 68
    .line 69
    aget-object v5, v2, v4

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v6, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    array-length v6, v6

    .line 86
    const/4 v7, 0x2

    .line 87
    if-ne v6, v7, :cond_2

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    goto :goto_5

    .line 92
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v5, v1

    .line 96
    :goto_3
    if-eqz v5, :cond_4

    .line 97
    .line 98
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v5, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    move-object p0, v1

    .line 108
    :goto_4
    instance-of p1, p0, Landroid/database/Cursor;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    check-cast p0, Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_5
    move-object p0, v1

    .line 116
    goto :goto_6

    .line 117
    :goto_5
    new-instance p1, LE0/d;

    .line 118
    .line 119
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, p1

    .line 123
    :goto_6
    nop

    .line 124
    instance-of p1, p0, LE0/d;

    .line 125
    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_6
    move-object v1, p0

    .line 130
    :goto_7
    move-object v2, v1

    .line 131
    check-cast v2, Landroid/database/Cursor;

    .line 132
    .line 133
    :goto_8
    check-cast v2, Landroid/database/Cursor;

    .line 134
    .line 135
    return-object v2
.end method

.method public static j(Ljava/lang/reflect/Method;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-class p0, Ljava/lang/Long;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "getReturnType(...)"

    .line 21
    .line 22
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final d(Landroid/content/Context;Ljava/lang/String;JLr0/e;Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-wide/from16 v7, p3

    .line 6
    .line 7
    move-object/from16 v0, p6

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v4, ":"

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    iget-object v2, v1, Lr0/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/16 v10, 0x80

    .line 40
    .line 41
    if-ge v6, v10, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v6, Lr0/a;

    .line 49
    .line 50
    invoke-direct {v6, v4, v5}, Lr0/a;-><init>(J)V

    .line 51
    .line 52
    .line 53
    new-instance v10, Lr0/b;

    .line 54
    .line 55
    invoke-direct {v10, v6}, Lr0/b;-><init>(Lr0/a;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v10}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 59
    .line 60
    .line 61
    :goto_0
    iget-object v2, v1, Lr0/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v2, v9, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    goto/16 :goto_11

    .line 74
    .line 75
    :cond_1
    :try_start_0
    iget-object v2, v1, Lr0/i;->a:Ljava/lang/Object;

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    const/4 v11, 0x0

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    filled-new-array {v3, v6}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const-string v13, "select createTime,content,isSend from message where talker=? and msgSvrId=? order by createTime desc limit 1"

    .line 91
    .line 92
    invoke-static {v2, v13, v6}, Lr0/i;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    .line 93
    .line 94
    .line 95
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 96
    if-nez v6, :cond_3

    .line 97
    .line 98
    :goto_1
    const/4 v13, 0x0

    .line 99
    goto :goto_5

    .line 100
    :cond_3
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-nez v13, :cond_4

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    goto :goto_4

    .line 108
    :cond_4
    new-instance v13, Lr0/e;

    .line 109
    .line 110
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v14

    .line 114
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    if-nez v16, :cond_5

    .line 119
    .line 120
    const-string v16, ""

    .line 121
    .line 122
    :cond_5
    move-object/from16 v12, v16

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    goto/16 :goto_e

    .line 127
    .line 128
    :goto_2
    const/4 v11, 0x2

    .line 129
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-ne v11, v10, :cond_6

    .line 134
    .line 135
    move v11, v10

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    const/4 v11, 0x0

    .line 138
    :goto_3
    invoke-direct {v13, v14, v15, v12, v11}, Lr0/e;-><init>(JLjava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    .line 141
    :goto_4
    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    .line 143
    .line 144
    :catchall_1
    :goto_5
    if-nez v13, :cond_7

    .line 145
    .line 146
    move-object/from16 v13, p5

    .line 147
    .line 148
    :cond_7
    if-eqz v13, :cond_8

    .line 149
    .line 150
    :try_start_3
    iget-boolean v6, v13, Lr0/e;->c:Z

    .line 151
    .line 152
    if-ne v6, v10, :cond_8

    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_8
    if-nez v2, :cond_9

    .line 157
    .line 158
    :goto_6
    const/4 v6, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    goto :goto_8

    .line 161
    :cond_9
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    const-string v11, "select isSend from message where msgSvrId=? order by createTime desc limit 5"

    .line 170
    .line 171
    invoke-static {v2, v11, v6}, Lr0/i;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    .line 172
    .line 173
    .line 174
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 175
    if-nez v2, :cond_a

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_a
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_b

    .line 183
    .line 184
    const/4 v11, 0x0

    .line 185
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 186
    .line 187
    .line 188
    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 189
    if-ne v6, v10, :cond_a

    .line 190
    .line 191
    move v6, v10

    .line 192
    goto :goto_7

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    goto/16 :goto_d

    .line 195
    .line 196
    :cond_b
    const/4 v11, 0x0

    .line 197
    move v6, v11

    .line 198
    :goto_7
    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 199
    .line 200
    .line 201
    :catchall_3
    :goto_8
    if-eqz v6, :cond_c

    .line 202
    .line 203
    goto/16 :goto_c

    .line 204
    .line 205
    :cond_c
    if-eqz v13, :cond_d

    .line 206
    .line 207
    :try_start_6
    iget-wide v4, v13, Lr0/e;->a:J

    .line 208
    .line 209
    const-wide/16 v14, 0x1

    .line 210
    .line 211
    add-long/2addr v4, v14

    .line 212
    :cond_d
    if-eqz v13, :cond_e

    .line 213
    .line 214
    iget-object v2, v13, Lr0/e;->b:Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_e
    const/4 v2, 0x0

    .line 218
    :goto_9
    invoke-static {v2}, Lr0/i;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    move-object/from16 v2, p1

    .line 223
    .line 224
    invoke-virtual/range {v1 .. v6}, Lr0/i;->e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_f

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v12

    .line 234
    const-wide/16 v14, 0x0

    .line 235
    .line 236
    cmp-long v6, v12, v14

    .line 237
    .line 238
    if-ltz v6, :cond_f

    .line 239
    .line 240
    move-object v12, v2

    .line 241
    goto :goto_a

    .line 242
    :cond_f
    const/4 v12, 0x0

    .line 243
    goto :goto_a

    .line 244
    :catchall_4
    move-exception v0

    .line 245
    goto/16 :goto_f

    .line 246
    .line 247
    :goto_a
    const-string v13, "anti revoke tip insert"

    .line 248
    .line 249
    new-instance v6, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const-string v14, "source="

    .line 255
    .line 256
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    new-instance v6, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v15, "talker="

    .line 272
    .line 273
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    new-instance v6, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const-string v10, "revokeSrvId="

    .line 289
    .line 290
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    new-instance v10, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const-string v11, "createTime="

    .line 306
    .line 307
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v10, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    if-eqz v2, :cond_10

    .line 318
    .line 319
    const/4 v10, 0x1

    .line 320
    goto :goto_b

    .line 321
    :cond_10
    const/4 v10, 0x0

    .line 322
    :goto_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v5, "native="

    .line 328
    .line 329
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v18

    .line 339
    new-instance v2, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const-string v5, "rowId="

    .line 345
    .line 346
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v19

    .line 356
    move-object/from16 v17, v4

    .line 357
    .line 358
    move-object/from16 v16, v6

    .line 359
    .line 360
    filled-new-array/range {v13 .. v19}, [Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    if-nez v12, :cond_11

    .line 368
    .line 369
    iget-object v2, v1, Lr0/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 370
    .line 371
    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    const-string v2, "anti revoke native insert unavailable"

    .line 375
    .line 376
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    filled-new-array {v2, v0, v3, v4}, [Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_11
    :goto_c
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 388
    .line 389
    goto :goto_10

    .line 390
    :goto_d
    :try_start_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 391
    .line 392
    .line 393
    :catchall_5
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 394
    :goto_e
    :try_start_9
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 395
    .line 396
    .line 397
    :catchall_6
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 398
    :goto_f
    new-instance v2, LE0/d;

    .line 399
    .line 400
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    move-object v0, v2

    .line 404
    :goto_10
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-eqz v0, :cond_12

    .line 409
    .line 410
    iget-object v2, v1, Lr0/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 411
    .line 412
    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const-string v4, "anti revoke local tip insert fail"

    .line 420
    .line 421
    filled-new-array {v4, v3, v2, v0}, [Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_12
    :goto_11
    return-void
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/Long;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    .line 1
    invoke-static/range {p1 .. p1}, LA0/l;->d(Landroid/content/Context;)LA0/c;

    move-result-object v0

    const/4 v4, 0x3

    .line 2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x2710

    .line 3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    .line 4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 5
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v12, "getClassLoader(...)"

    const-string v13, "getMethods(...)"

    move/from16 v16, v6

    if-eqz v0, :cond_12

    .line 6
    iget-object v6, v1, Lr0/i;->b:Ljava/lang/Object;

    if-nez v6, :cond_0

    move-object/from16 v21, v13

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    goto/16 :goto_e

    :cond_0
    const-wide/16 v17, 0x0

    .line 7
    iget-object v8, v0, LA0/c;->a:Ljava/lang/String;

    .line 8
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-static {v9, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    const-string v11, "clazz"

    invoke-static {v8, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v11, Lc0/f;->b:Ld0/b;

    invoke-interface {v11, v9, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    if-nez v8, :cond_1

    :goto_0
    move-object/from16 v21, v13

    :goto_1
    const/4 v15, 0x0

    goto/16 :goto_e

    .line 11
    :cond_1
    invoke-virtual {v8, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v9

    const-string v11, "getDeclaredMethods(...)"

    invoke-static {v9, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    array-length v15, v9

    move/from16 v14, v16

    :goto_2
    if-ge v14, v15, :cond_4

    aget-object v21, v9, v14

    move-object/from16 v22, v8

    .line 14
    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v23, v9

    .line 15
    iget-object v9, v0, LA0/c;->b:Ljava/lang/String;

    .line 16
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual/range {v21 .. v21}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    goto :goto_2

    :cond_4
    move-object/from16 v22, v8

    const/16 v21, 0x0

    :goto_3
    if-nez v21, :cond_7

    .line 17
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-static {v8, v13}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    array-length v9, v8

    move/from16 v14, v16

    :goto_4
    if-ge v14, v9, :cond_6

    aget-object v15, v8, v14

    move-object/from16 v21, v8

    .line 19
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    move/from16 v22, v9

    .line 20
    iget-object v9, v0, LA0/c;->b:Ljava/lang/String;

    .line 21
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v8, v21

    move/from16 v9, v22

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    :goto_5
    if-nez v15, :cond_8

    goto :goto_0

    :cond_7
    move-object/from16 v15, v21

    .line 22
    :cond_8
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v16

    const/4 v8, 0x0

    .line 23
    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    const/4 v14, 0x1

    invoke-virtual {v9, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v9, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 24
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 25
    const-string v14, "msgid"

    invoke-virtual {v8, v14, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 26
    sget-object v14, LP0/a;->a:LP0/a;

    .line 27
    invoke-virtual {v14}, LP0/a;->b()I

    move-result v14

    move-object/from16 v21, v13

    int-to-long v13, v14

    add-long v13, p3, v13

    .line 28
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const-string v14, "msgSvrId"

    invoke-virtual {v8, v14, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 29
    const-string v13, "type"

    invoke-virtual {v8, v13, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 30
    const-string v13, "status"

    invoke-virtual {v8, v13, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 31
    const-string v13, "isSend"

    invoke-virtual {v8, v13, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 32
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const-string v14, "createTime"

    invoke-virtual {v8, v14, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 33
    const-string v13, "talker"

    invoke-virtual {v8, v13, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v13, "content"

    invoke-virtual {v8, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    if-eqz v0, :cond_c

    .line 35
    const-class v13, Ljava/lang/Object;

    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v13

    invoke-static {v13, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    array-length v14, v13

    move-object/from16 v22, v0

    move/from16 v0, v16

    :goto_7
    if-ge v0, v14, :cond_a

    move/from16 v23, v0

    aget-object v0, v13, v23

    move-object/from16 v24, v11

    .line 38
    const-string v11, "method"

    invoke-static {v0, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v25, v0

    const-string v0, "convertFrom"

    invoke-static {v11, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 40
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v11, 0x2

    if-ne v0, v11, :cond_9

    .line 41
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v16

    const-class v11, Landroid/content/ContentValues;

    invoke-virtual {v11, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 42
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/16 v20, 0x1

    aget-object v0, v0, v20

    invoke-static {v0, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v0, v23, 0x1

    move-object/from16 v11, v24

    goto :goto_7

    :cond_a
    move-object/from16 v24, v11

    const/16 v25, 0x0

    :goto_8
    if-eqz v25, :cond_b

    move-object/from16 v0, v25

    goto :goto_9

    .line 43
    :cond_b
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v11, v24

    goto :goto_6

    :cond_c
    const/4 v0, 0x0

    :goto_9
    if-nez v0, :cond_d

    goto/16 :goto_1

    :cond_d
    const/4 v14, 0x1

    .line 44
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v8, v11}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v9, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-virtual {v15, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    :try_start_0
    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v15, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/Number;

    if-eqz v6, :cond_e

    check-cast v0, Ljava/lang/Number;

    goto :goto_a

    :catchall_0
    move-exception v0

    goto :goto_c

    :cond_e
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    goto :goto_b

    :cond_f
    move-wide/from16 v8, v17

    :goto_b
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_d

    .line 48
    :goto_c
    new-instance v6, LE0/d;

    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v6

    .line 49
    :goto_d
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_10

    .line 50
    const-string v8, "anti revoke dynamic native insert fail"

    invoke-static {v15}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v8, v9, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Li0/a;->d([Ljava/lang/Object;)V

    .line 51
    :cond_10
    instance-of v6, v0, LE0/d;

    if-eqz v6, :cond_11

    const/4 v0, 0x0

    .line 52
    :cond_11
    check-cast v0, Ljava/lang/Long;

    move-object v15, v0

    :goto_e
    if-eqz v15, :cond_13

    .line 53
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_12
    move-object/from16 v21, v13

    const-wide/16 v17, 0x0

    .line 55
    :cond_13
    invoke-static {}, Lr0/i;->g()Lr0/d;

    move-result-object v0

    if-nez v0, :cond_14

    :goto_f
    const/16 v19, 0x0

    goto/16 :goto_21

    .line 56
    :cond_14
    iget-object v6, v1, Lr0/i;->b:Ljava/lang/Object;

    if-nez v6, :cond_1e

    .line 57
    iget-object v6, v0, Lr0/d;->c:Ljava/lang/String;

    .line 58
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-static {v8, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    sget-object v9, Lc0/f;->b:Ld0/b;

    invoke-interface {v9, v8, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-nez v6, :cond_16

    :goto_10
    move-object/from16 v9, v21

    :cond_15
    const/4 v6, 0x0

    goto/16 :goto_15

    .line 60
    :cond_16
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-static {v8, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v9, v0, Lr0/d;->d:Ljava/lang/String;

    .line 62
    sget-object v11, Lc0/f;->b:Ld0/b;

    invoke-interface {v11, v8, v9}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    if-nez v8, :cond_17

    goto :goto_10

    .line 63
    :cond_17
    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    move-object/from16 v9, v21

    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    array-length v11, v8

    move/from16 v13, v16

    :goto_11
    if-ge v13, v11, :cond_1a

    aget-object v14, v8, v13

    .line 65
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v15

    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v15

    if-eqz v15, :cond_18

    .line 66
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v21, v6

    const-string v6, "s"

    invoke-static {v15, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 67
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v6, v6

    const/4 v15, 0x1

    if-ne v6, v15, :cond_19

    .line 68
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    aget-object v6, v6, v16

    const-class v15, Ljava/lang/Class;

    invoke-static {v6, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_12

    :cond_18
    move-object/from16 v21, v6

    :cond_19
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v6, v21

    goto :goto_11

    :cond_1a
    move-object/from16 v21, v6

    const/4 v14, 0x0

    :goto_12
    if-eqz v14, :cond_15

    .line 69
    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v14, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    array-length v11, v8

    move/from16 v13, v16

    :goto_13
    if-ge v13, v11, :cond_1c

    aget-object v14, v8, v13

    .line 72
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v21, v8

    iget-object v8, v0, Lr0/d;->e:Ljava/lang/String;

    invoke-static {v15, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    const-string v15, "getParameterTypes(...)"

    invoke-static {v8, v15}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v8

    if-nez v8, :cond_1b

    goto :goto_14

    :cond_1b
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v8, v21

    goto :goto_13

    :cond_1c
    const/4 v14, 0x0

    :goto_14
    if-eqz v14, :cond_15

    const/4 v8, 0x0

    .line 73
    invoke-virtual {v14, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_15
    if-eqz v6, :cond_1d

    .line 74
    iput-object v6, v1, Lr0/i;->b:Ljava/lang/Object;

    goto :goto_16

    :cond_1d
    const/4 v6, 0x0

    :goto_16
    if-nez v6, :cond_1f

    goto/16 :goto_f

    :cond_1e
    move-object/from16 v9, v21

    .line 75
    :cond_1f
    iget-object v8, v0, Lr0/d;->b:Ljava/lang/String;

    .line 76
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-static {v11, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    sget-object v12, Lc0/f;->b:Ld0/b;

    invoke-interface {v12, v11, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    if-nez v8, :cond_20

    goto/16 :goto_f

    :cond_20
    const/4 v11, 0x0

    .line 78
    invoke-virtual {v8, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 79
    invoke-static {v12}, LN0/g;->b(Ljava/lang/Object;)V

    const-string v11, "u1"

    invoke-static {v12, v2, v11}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v2, LP0/a;->a:LP0/a;

    .line 81
    invoke-virtual {v2}, LP0/a;->b()I

    move-result v2

    int-to-long v13, v2

    add-long v13, p3, v13

    .line 82
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v11, "o1"

    invoke-static {v12, v2, v11}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    const-string v2, "setType"

    invoke-static {v12, v5, v2}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    const-string v2, "r1"

    invoke-static {v12, v4, v2}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    const-string v2, "j1"

    invoke-static {v12, v7, v2}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "e1"

    invoke-static {v12, v2, v4}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    const-string v2, "d1"

    invoke-static {v12, v3, v2}, Lr0/i;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    array-length v3, v2

    move/from16 v4, v16

    :goto_17
    const-class v5, Ljava/lang/Number;

    if-ge v4, v3, :cond_22

    aget-object v7, v2, v4

    .line 90
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v13, "na"

    invoke-static {v11, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_21

    .line 91
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    const/4 v14, 0x1

    if-ne v11, v14, :cond_21

    .line 92
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    aget-object v11, v11, v16

    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_21

    .line 93
    invoke-static {v7}, Lr0/i;->j(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_21

    goto :goto_18

    :cond_21
    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    :cond_22
    const/4 v7, 0x0

    :goto_18
    if-eqz v7, :cond_27

    .line 94
    :try_start_1
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_23

    move-object v8, v0

    check-cast v8, Ljava/lang/Number;

    goto :goto_19

    :catchall_1
    move-exception v0

    goto :goto_1a

    :cond_23
    const/4 v8, 0x0

    :goto_19
    if-eqz v8, :cond_24

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1b

    :cond_24
    const/4 v8, 0x0

    goto :goto_1b

    .line 95
    :goto_1a
    new-instance v8, LE0/d;

    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 96
    :goto_1b
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_25

    .line 97
    const-string v2, "anti revoke native na insert fail"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 98
    :cond_25
    instance-of v0, v8, LE0/d;

    if-eqz v0, :cond_26

    const/4 v15, 0x0

    goto :goto_1c

    :cond_26
    move-object v15, v8

    .line 99
    :goto_1c
    check-cast v15, Ljava/lang/Long;

    return-object v15

    .line 100
    :cond_27
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    array-length v3, v2

    move/from16 v4, v16

    :goto_1d
    if-ge v4, v3, :cond_29

    aget-object v7, v2, v4

    .line 102
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    .line 103
    iget-object v13, v0, Lr0/d;->f:Ljava/lang/String;

    .line 104
    invoke-static {v11, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_28

    .line 105
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    const/4 v13, 0x2

    if-ne v11, v13, :cond_28

    .line 106
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    aget-object v11, v11, v16

    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_28

    .line 107
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/16 v20, 0x1

    aget-object v11, v11, v20

    invoke-static {v11, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_28

    .line 108
    invoke-static {v7}, Lr0/i;->j(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_28

    goto :goto_1e

    :cond_28
    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_29
    const/4 v7, 0x0

    :goto_1e
    if-nez v7, :cond_2e

    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    array-length v2, v0

    move/from16 v3, v16

    :goto_1f
    if-ge v3, v2, :cond_2c

    aget-object v4, v0, v3

    .line 111
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    const/4 v11, 0x2

    if-ne v7, v11, :cond_2a

    .line 112
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, v16

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_2a

    .line 113
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    const/16 v20, 0x1

    aget-object v7, v7, v20

    invoke-static {v7, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2b

    .line 114
    invoke-static {v4}, Lr0/i;->j(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_2b

    move-object v8, v4

    goto :goto_20

    :cond_2a
    const/16 v20, 0x1

    :cond_2b
    add-int/lit8 v3, v3, 0x1

    goto :goto_1f

    :cond_2c
    const/4 v8, 0x0

    :goto_20
    if-nez v8, :cond_2d

    goto/16 :goto_f

    :goto_21
    return-object v19

    :cond_2d
    move-object v7, v8

    :cond_2e
    const/16 v19, 0x0

    .line 115
    :try_start_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v12, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_2f

    move-object v8, v0

    check-cast v8, Ljava/lang/Number;

    goto :goto_22

    :catchall_2
    move-exception v0

    goto :goto_25

    :cond_2f
    move-object/from16 v8, v19

    :goto_22
    if-eqz v8, :cond_31

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    cmp-long v0, v2, v17

    if-ltz v0, :cond_30

    goto :goto_23

    :cond_30
    move-object/from16 v8, v19

    :goto_23
    if-nez v8, :cond_34

    .line 116
    :cond_31
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v12, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_32

    move-object v8, v0

    check-cast v8, Ljava/lang/Number;

    goto :goto_24

    :cond_32
    move-object/from16 v8, v19

    :goto_24
    if-eqz v8, :cond_33

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_26

    :cond_33
    move-object/from16 v8, v19

    goto :goto_26

    .line 117
    :goto_25
    new-instance v8, LE0/d;

    invoke-direct {v8, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 118
    :cond_34
    :goto_26
    invoke-static {v8}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_35

    .line 119
    const-string v2, "anti revoke native insert fail"

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 120
    :cond_35
    instance-of v0, v8, LE0/d;

    if-eqz v0, :cond_36

    move-object/from16 v15, v19

    goto :goto_27

    :cond_36
    move-object v15, v8

    .line 121
    :goto_27
    check-cast v15, Ljava/lang/Long;

    return-object v15
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, v0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v7, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_23

    .line 22
    .line 23
    :cond_0
    const-string v0, "anti revoke handle hook"

    .line 24
    .line 25
    sget-boolean v7, Lz0/i;->a:Z

    .line 26
    .line 27
    invoke-static {}, Lz0/g;->r()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const-string v8, "enabled="

    .line 32
    .line 33
    invoke-static {v8, v7}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    const-string v9, "wechat="

    .line 42
    .line 43
    invoke-static {v9, v8}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    filled-new-array {v0, v7, v8}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    new-instance v7, LA0/u;

    .line 57
    .line 58
    new-instance v10, Lq0/d;

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    invoke-direct {v10, v0}, Lq0/d;-><init>(I)V

    .line 62
    .line 63
    .line 64
    new-instance v11, LA0/h;

    .line 65
    .line 66
    const/16 v0, 0xb

    .line 67
    .line 68
    invoke-direct {v11, v2, v0}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 69
    .line 70
    .line 71
    new-instance v12, Lq0/d;

    .line 72
    .line 73
    const/4 v0, 0x4

    .line 74
    invoke-direct {v12, v0}, Lq0/d;-><init>(I)V

    .line 75
    .line 76
    .line 77
    new-instance v13, Lq0/d;

    .line 78
    .line 79
    const/4 v0, 0x5

    .line 80
    invoke-direct {v13, v0}, Lq0/d;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const-string v8, "anti_revoke"

    .line 84
    .line 85
    const-string v9, "\u9632\u64a4\u56de"

    .line 86
    .line 87
    invoke-direct/range {v7 .. v13}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v7}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, LA0/l;->d(Landroid/content/Context;)LA0/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v7, "clazz"

    .line 98
    .line 99
    const-string v8, "getClassLoader(...)"

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-static {v10, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v11, v0, LA0/c;->a:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v11, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 117
    .line 118
    invoke-interface {v7, v10, v11}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-nez v7, :cond_1

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    const-string v11, "getDeclaredMethods(...)"

    .line 131
    .line 132
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    array-length v11, v10

    .line 136
    move v12, v5

    .line 137
    :goto_0
    iget-object v13, v0, LA0/c;->b:Ljava/lang/String;

    .line 138
    .line 139
    if-ge v12, v11, :cond_3

    .line 140
    .line 141
    aget-object v14, v10, v12

    .line 142
    .line 143
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    invoke-static {v15, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    if-eqz v15, :cond_2

    .line 152
    .line 153
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    array-length v15, v15

    .line 158
    if-ne v15, v6, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    add-int/2addr v12, v6

    .line 162
    goto :goto_0

    .line 163
    :cond_3
    move-object v14, v9

    .line 164
    :goto_1
    if-nez v14, :cond_6

    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-string v7, "getMethods(...)"

    .line 171
    .line 172
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    array-length v7, v0

    .line 176
    move v10, v5

    .line 177
    :goto_2
    if-ge v10, v7, :cond_5

    .line 178
    .line 179
    aget-object v11, v0, v10

    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    invoke-static {v12, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-eqz v12, :cond_4

    .line 190
    .line 191
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    array-length v12, v12

    .line 196
    if-ne v12, v6, :cond_4

    .line 197
    .line 198
    move-object v14, v11

    .line 199
    goto :goto_3

    .line 200
    :cond_4
    add-int/2addr v10, v6

    .line 201
    goto :goto_2

    .line 202
    :cond_5
    move-object v14, v9

    .line 203
    :goto_3
    if-nez v14, :cond_6

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    invoke-static {v14}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v7, "anti-revoke-dynamic-storage-"

    .line 211
    .line 212
    invoke-static {v7, v0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 217
    .line 218
    invoke-virtual {v7, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_7

    .line 223
    .line 224
    goto/16 :goto_9

    .line 225
    .line 226
    :cond_7
    invoke-virtual {v14, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 227
    .line 228
    .line 229
    new-instance v7, Lr0/g;

    .line 230
    .line 231
    invoke-direct {v7, v1, v5}, Lr0/g;-><init>(Lr0/i;I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v14, v7}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 235
    .line 236
    .line 237
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 238
    .line 239
    invoke-virtual {v7, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    const-string v0, "anti revoke dynamic storage hooked"

    .line 243
    .line 244
    invoke-static {v14}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_9

    .line 256
    .line 257
    :cond_8
    :goto_4
    invoke-static {}, Lr0/i;->g()Lr0/d;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-nez v0, :cond_9

    .line 262
    .line 263
    goto/16 :goto_9

    .line 264
    .line 265
    :cond_9
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget-object v10, v0, Lr0/d;->a:Ljava/lang/String;

    .line 273
    .line 274
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 275
    .line 276
    invoke-interface {v11, v7, v10}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    if-nez v7, :cond_a

    .line 281
    .line 282
    goto/16 :goto_9

    .line 283
    .line 284
    :cond_a
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-static {v10, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v8, v0, Lr0/d;->b:Ljava/lang/String;

    .line 292
    .line 293
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 294
    .line 295
    invoke-interface {v11, v10, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    new-instance v10, Lo0/b;

    .line 300
    .line 301
    invoke-direct {v10, v0, v8, v6}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 302
    .line 303
    .line 304
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 305
    .line 306
    invoke-interface {v0, v7, v10}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v7, "findMethodsByExactPredicate(...)"

    .line 311
    .line 312
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    array-length v7, v0

    .line 316
    if-lt v3, v7, :cond_b

    .line 317
    .line 318
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    goto :goto_7

    .line 323
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 326
    .line 327
    .line 328
    array-length v8, v0

    .line 329
    move v10, v5

    .line 330
    move v11, v10

    .line 331
    :goto_5
    if-ge v10, v8, :cond_d

    .line 332
    .line 333
    aget-object v12, v0, v10

    .line 334
    .line 335
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    add-int/2addr v11, v6

    .line 339
    if-ne v11, v3, :cond_c

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_c
    add-int/2addr v10, v6

    .line 343
    goto :goto_5

    .line 344
    :cond_d
    :goto_6
    move-object v0, v7

    .line 345
    :goto_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-eqz v7, :cond_f

    .line 354
    .line 355
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    check-cast v7, Ljava/lang/reflect/Method;

    .line 360
    .line 361
    invoke-static {v7}, LN0/g;->b(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v7}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    const-string v10, "anti-revoke-wechat-storage-"

    .line 369
    .line 370
    invoke-static {v10, v8}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    sget-object v10, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 375
    .line 376
    invoke-virtual {v10, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    if-eqz v10, :cond_e

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_e
    new-instance v10, Lr0/g;

    .line 384
    .line 385
    invoke-direct {v10, v1, v4}, Lr0/g;-><init>(Lr0/i;I)V

    .line 386
    .line 387
    .line 388
    invoke-static {v7, v10}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 389
    .line 390
    .line 391
    sget-object v7, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 392
    .line 393
    invoke-virtual {v7, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_f
    :goto_9
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const-string v7, "getClassLoader(...)"

    .line 402
    .line 403
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    const-string v7, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 407
    .line 408
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 409
    .line 410
    invoke-interface {v8, v0, v7}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-nez v0, :cond_10

    .line 415
    .line 416
    goto :goto_c

    .line 417
    :cond_10
    new-instance v7, Lq0/d;

    .line 418
    .line 419
    invoke-direct {v7, v3}, Lq0/d;-><init>(I)V

    .line 420
    .line 421
    .line 422
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 423
    .line 424
    invoke-interface {v3, v0, v7}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    const-string v3, "findMethodsByExactPredicate(...)"

    .line 429
    .line 430
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    array-length v3, v0

    .line 434
    move v7, v5

    .line 435
    :goto_a
    if-ge v7, v3, :cond_12

    .line 436
    .line 437
    aget-object v8, v0, v7

    .line 438
    .line 439
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v8}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    const-string v11, "anti-revoke-message-db-"

    .line 447
    .line 448
    invoke-static {v11, v10}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    sget-object v11, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 453
    .line 454
    invoke-virtual {v11, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v11

    .line 458
    if-eqz v11, :cond_11

    .line 459
    .line 460
    goto :goto_b

    .line 461
    :cond_11
    new-instance v11, Lr0/g;

    .line 462
    .line 463
    invoke-direct {v11, v1, v6}, Lr0/g;-><init>(Lr0/i;I)V

    .line 464
    .line 465
    .line 466
    invoke-static {v8, v11}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 467
    .line 468
    .line 469
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 470
    .line 471
    invoke-virtual {v8, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    :goto_b
    add-int/2addr v7, v6

    .line 475
    goto :goto_a

    .line 476
    :cond_12
    :goto_c
    sget-object v3, LC0/e;->a:LC0/e;

    .line 477
    .line 478
    iget-object v0, v1, Lr0/i;->d:Lr0/c;

    .line 479
    .line 480
    const-string v7, "listener"

    .line 481
    .line 482
    invoke-static {v0, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    sget-object v7, LC0/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 486
    .line 487
    invoke-virtual {v7, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    sget-boolean v0, LC0/e;->c:Z

    .line 491
    .line 492
    if-eqz v0, :cond_13

    .line 493
    .line 494
    :goto_d
    move v0, v6

    .line 495
    goto/16 :goto_17

    .line 496
    .line 497
    :cond_13
    monitor-enter v3

    .line 498
    :try_start_0
    sget-boolean v0, LC0/e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 499
    .line 500
    if-eqz v0, :cond_14

    .line 501
    .line 502
    monitor-exit v3

    .line 503
    goto :goto_d

    .line 504
    :cond_14
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    if-nez v0, :cond_15

    .line 509
    .line 510
    move-object v7, v2

    .line 511
    goto :goto_e

    .line 512
    :cond_15
    move-object v7, v0

    .line 513
    :goto_e
    invoke-static {v2}, LA0/l;->q(Landroid/content/Context;)LA0/d;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-eqz v0, :cond_19

    .line 518
    .line 519
    iget-object v8, v0, LA0/d;->a:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    const-string v11, "getClassLoader(...)"

    .line 526
    .line 527
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    const-string v11, "clazz"

    .line 531
    .line 532
    invoke-static {v8, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 536
    .line 537
    invoke-interface {v11, v10, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    if-nez v8, :cond_16

    .line 542
    .line 543
    sget-object v0, LF0/s;->a:LF0/s;

    .line 544
    .line 545
    goto :goto_11

    .line 546
    :cond_16
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    const-string v10, "getDeclaredMethods(...)"

    .line 551
    .line 552
    invoke-static {v8, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    new-instance v10, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .line 559
    .line 560
    array-length v11, v8

    .line 561
    move v12, v5

    .line 562
    :goto_f
    if-ge v12, v11, :cond_18

    .line 563
    .line 564
    aget-object v13, v8, v12

    .line 565
    .line 566
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v14

    .line 570
    iget-object v15, v0, LA0/d;->b:Ljava/lang/String;

    .line 571
    .line 572
    invoke-static {v14, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v14

    .line 576
    if-eqz v14, :cond_17

    .line 577
    .line 578
    sget-object v14, LC0/e;->a:LC0/e;

    .line 579
    .line 580
    invoke-static {v13}, LC0/e;->a(Ljava/lang/reflect/Method;)Z

    .line 581
    .line 582
    .line 583
    move-result v14

    .line 584
    if-eqz v14, :cond_17

    .line 585
    .line 586
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    goto :goto_10

    .line 590
    :catchall_0
    move-exception v0

    .line 591
    goto/16 :goto_24

    .line 592
    .line 593
    :cond_17
    :goto_10
    add-int/2addr v12, v6

    .line 594
    goto :goto_f

    .line 595
    :cond_18
    move-object v0, v10

    .line 596
    goto :goto_11

    .line 597
    :cond_19
    move-object v0, v9

    .line 598
    :goto_11
    if-nez v0, :cond_1a

    .line 599
    .line 600
    sget-object v0, LF0/s;->a:LF0/s;

    .line 601
    .line 602
    :cond_1a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-nez v8, :cond_1b

    .line 607
    .line 608
    goto :goto_12

    .line 609
    :cond_1b
    const-string v0, "com.tencent.mm.sdk.platformtools.aa"

    .line 610
    .line 611
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    const-string v10, "getClassLoader(...)"

    .line 616
    .line 617
    invoke-static {v8, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 621
    .line 622
    invoke-interface {v10, v8, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 626
    if-nez v0, :cond_1c

    .line 627
    .line 628
    monitor-exit v3

    .line 629
    move v0, v5

    .line 630
    goto/16 :goto_17

    .line 631
    .line 632
    :cond_1c
    :try_start_2
    sget-object v8, LC0/e;->a:LC0/e;

    .line 633
    .line 634
    new-instance v8, LA0/a;

    .line 635
    .line 636
    const/16 v10, 0x14

    .line 637
    .line 638
    invoke-direct {v8, v10}, LA0/a;-><init>(I)V

    .line 639
    .line 640
    .line 641
    sget-object v10, Lc0/f;->b:Ld0/b;

    .line 642
    .line 643
    invoke-interface {v10, v0, v8}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    const-string v8, "findMethodsByExactPredicate(...)"

    .line 648
    .line 649
    invoke-static {v0, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    :goto_12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    move v10, v5

    .line 661
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    if-eqz v0, :cond_1f

    .line 666
    .line 667
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    move-object v11, v0

    .line 672
    check-cast v11, Ljava/lang/reflect/Method;

    .line 673
    .line 674
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v12

    .line 686
    new-instance v13, Ljava/lang/StringBuilder;

    .line 687
    .line 688
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 689
    .line 690
    .line 691
    const-string v14, "wechat-xml-hook-hub:"

    .line 692
    .line 693
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    const-string v0, "#"

    .line 700
    .line 701
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v12

    .line 711
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 712
    .line 713
    invoke-virtual {v0, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 717
    if-nez v0, :cond_1d

    .line 718
    .line 719
    add-int/2addr v10, v6

    .line 720
    goto :goto_13

    .line 721
    :cond_1d
    :try_start_3
    new-instance v0, LC0/d;

    .line 722
    .line 723
    invoke-direct {v0, v5, v7}, LC0/d;-><init>(ILjava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    invoke-static {v11, v0}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 727
    .line 728
    .line 729
    add-int/lit8 v13, v10, 0x1

    .line 730
    .line 731
    :try_start_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 732
    .line 733
    .line 734
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 735
    goto :goto_15

    .line 736
    :catchall_1
    move-exception v0

    .line 737
    move v10, v13

    .line 738
    goto :goto_14

    .line 739
    :catchall_2
    move-exception v0

    .line 740
    :goto_14
    :try_start_5
    new-instance v13, LE0/d;

    .line 741
    .line 742
    invoke-direct {v13, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 743
    .line 744
    .line 745
    move-object v0, v13

    .line 746
    move v13, v10

    .line 747
    :goto_15
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    if-eqz v0, :cond_1e

    .line 752
    .line 753
    sget-object v10, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 754
    .line 755
    invoke-virtual {v10, v12}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    const-string v10, "wechat xml hook hub install fail"

    .line 759
    .line 760
    filled-new-array {v10, v11, v0}, [Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    :cond_1e
    move v10, v13

    .line 768
    goto :goto_13

    .line 769
    :cond_1f
    if-lez v10, :cond_20

    .line 770
    .line 771
    move v0, v6

    .line 772
    goto :goto_16

    .line 773
    :cond_20
    move v0, v5

    .line 774
    :goto_16
    sput-boolean v0, LC0/e;->c:Z

    .line 775
    .line 776
    sget-boolean v0, LC0/e;->c:Z

    .line 777
    .line 778
    if-eqz v0, :cond_21

    .line 779
    .line 780
    const-string v0, "wechat xml hook hub installed"

    .line 781
    .line 782
    new-instance v7, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 785
    .line 786
    .line 787
    const-string v8, "methods="

    .line 788
    .line 789
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    :cond_21
    sget-boolean v0, LC0/e;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 807
    .line 808
    monitor-exit v3

    .line 809
    :goto_17
    if-eqz v0, :cond_22

    .line 810
    .line 811
    const-string v0, "anti revoke using xml-only intercept"

    .line 812
    .line 813
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :cond_22
    invoke-static {}, Lz0/r;->v()Z

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    if-nez v0, :cond_23

    .line 830
    .line 831
    goto :goto_1a

    .line 832
    :cond_23
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    const-string v3, "getClassLoader(...)"

    .line 837
    .line 838
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    const-string v3, "com.tencent.mm.sdk.event.IEvent"

    .line 842
    .line 843
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 844
    .line 845
    invoke-interface {v7, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    if-nez v0, :cond_24

    .line 850
    .line 851
    goto :goto_1a

    .line 852
    :cond_24
    new-instance v3, Lq0/d;

    .line 853
    .line 854
    invoke-direct {v3, v4}, Lq0/d;-><init>(I)V

    .line 855
    .line 856
    .line 857
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 858
    .line 859
    invoke-interface {v7, v0, v3}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    const-string v3, "findMethodsByExactPredicate(...)"

    .line 864
    .line 865
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    array-length v3, v0

    .line 869
    move v7, v5

    .line 870
    :goto_18
    if-ge v7, v3, :cond_26

    .line 871
    .line 872
    aget-object v8, v0, v7

    .line 873
    .line 874
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    invoke-static {v8}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v10

    .line 881
    const-string v11, "anti-revoke-event-publish-"

    .line 882
    .line 883
    invoke-static {v11, v10}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v10

    .line 887
    sget-object v11, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 888
    .line 889
    invoke-virtual {v11, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v11

    .line 893
    if-eqz v11, :cond_25

    .line 894
    .line 895
    goto :goto_19

    .line 896
    :cond_25
    new-instance v11, Lr0/h;

    .line 897
    .line 898
    invoke-direct {v11, v1, v2, v5}, Lr0/h;-><init>(Lr0/i;Landroid/content/Context;I)V

    .line 899
    .line 900
    .line 901
    invoke-static {v8, v11}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 902
    .line 903
    .line 904
    sget-object v8, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 905
    .line 906
    invoke-virtual {v8, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    :goto_19
    add-int/2addr v7, v6

    .line 910
    goto :goto_18

    .line 911
    :cond_26
    :goto_1a
    invoke-static {}, Lz0/r;->v()Z

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    if-nez v0, :cond_27

    .line 916
    .line 917
    goto :goto_1f

    .line 918
    :cond_27
    sget-object v0, Lr0/i;->g:[Ljava/lang/String;

    .line 919
    .line 920
    array-length v3, v0

    .line 921
    move v7, v5

    .line 922
    :goto_1b
    if-ge v7, v3, :cond_2b

    .line 923
    .line 924
    aget-object v8, v0, v7

    .line 925
    .line 926
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 927
    .line 928
    .line 929
    move-result-object v10

    .line 930
    const-string v11, "getClassLoader(...)"

    .line 931
    .line 932
    invoke-static {v10, v11}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    const-string v11, "clazz"

    .line 936
    .line 937
    invoke-static {v8, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 941
    .line 942
    invoke-interface {v11, v10, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    move-result-object v8

    .line 946
    if-nez v8, :cond_28

    .line 947
    .line 948
    goto :goto_1e

    .line 949
    :cond_28
    new-instance v10, Lq0/d;

    .line 950
    .line 951
    const/4 v11, 0x7

    .line 952
    invoke-direct {v10, v11}, Lq0/d;-><init>(I)V

    .line 953
    .line 954
    .line 955
    sget-object v11, Lc0/f;->b:Ld0/b;

    .line 956
    .line 957
    invoke-interface {v11, v8, v10}, Ld0/b;->d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;

    .line 958
    .line 959
    .line 960
    move-result-object v8

    .line 961
    const-string v10, "findMethodsByExactPredicate(...)"

    .line 962
    .line 963
    invoke-static {v8, v10}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    array-length v10, v8

    .line 967
    move v11, v5

    .line 968
    :goto_1c
    if-ge v11, v10, :cond_2a

    .line 969
    .line 970
    aget-object v12, v8, v11

    .line 971
    .line 972
    invoke-static {v12}, LN0/g;->b(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    invoke-static {v12}, Lr0/i;->h(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v13

    .line 979
    const-string v14, "anti-revoke-listener-"

    .line 980
    .line 981
    invoke-static {v14, v13}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v13

    .line 985
    sget-object v14, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 986
    .line 987
    invoke-virtual {v14, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-result v14

    .line 991
    if-eqz v14, :cond_29

    .line 992
    .line 993
    goto :goto_1d

    .line 994
    :cond_29
    new-instance v14, Lr0/h;

    .line 995
    .line 996
    invoke-direct {v14, v1, v2, v6}, Lr0/h;-><init>(Lr0/i;Landroid/content/Context;I)V

    .line 997
    .line 998
    .line 999
    invoke-static {v12, v14}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 1000
    .line 1001
    .line 1002
    sget-object v12, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1003
    .line 1004
    invoke-virtual {v12, v13}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    :goto_1d
    add-int/2addr v11, v6

    .line 1008
    goto :goto_1c

    .line 1009
    :cond_2a
    :goto_1e
    add-int/2addr v7, v6

    .line 1010
    goto :goto_1b

    .line 1011
    :cond_2b
    :goto_1f
    invoke-static {v2}, LA0/l;->c(Landroid/content/Context;)LA0/b;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    if-eqz v0, :cond_2e

    .line 1016
    .line 1017
    const-string v3, "className"

    .line 1018
    .line 1019
    iget-object v5, v0, LA0/b;->a:Ljava/lang/String;

    .line 1020
    .line 1021
    invoke-static {v5, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    const-string v3, "methodName"

    .line 1025
    .line 1026
    iget-object v0, v0, LA0/b;->b:Ljava/lang/String;

    .line 1027
    .line 1028
    invoke-static {v0, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v3

    .line 1035
    const-string v6, "getClassLoader(...)"

    .line 1036
    .line 1037
    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1041
    .line 1042
    const-string v8, "com.tencent.mm.modelbase.p0"

    .line 1043
    .line 1044
    invoke-interface {v7, v3, v8}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v12

    .line 1048
    if-nez v12, :cond_2c

    .line 1049
    .line 1050
    goto :goto_20

    .line 1051
    :cond_2c
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 1059
    .line 1060
    invoke-interface {v6, v3, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v3

    .line 1064
    if-nez v3, :cond_2d

    .line 1065
    .line 1066
    goto :goto_20

    .line 1067
    :cond_2d
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1068
    .line 1069
    const-class v13, Ljava/lang/String;

    .line 1070
    .line 1071
    const-class v10, Ljava/lang/String;

    .line 1072
    .line 1073
    const-class v14, Ljava/lang/String;

    .line 1074
    .line 1075
    const-class v15, Ljava/lang/String;

    .line 1076
    .line 1077
    filled-new-array/range {v10 .. v15}, [Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v6

    .line 1081
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1082
    .line 1083
    invoke-interface {v7, v3, v0, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    if-eqz v3, :cond_2e

    .line 1088
    .line 1089
    const-string v3, "anti revoke hook point from cache"

    .line 1090
    .line 1091
    filled-new-array {v3, v5, v0}, [Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v3

    .line 1095
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    new-instance v9, Lr0/f;

    .line 1099
    .line 1100
    invoke-direct {v9, v5, v0}, Lr0/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_21

    .line 1104
    :cond_2e
    :goto_20
    new-instance v0, Lr0/f;

    .line 1105
    .line 1106
    const-string v3, "ox0.t"

    .line 1107
    .line 1108
    const-string v5, "e"

    .line 1109
    .line 1110
    invoke-direct {v0, v3, v5}, Lr0/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    new-instance v3, Lr0/f;

    .line 1114
    .line 1115
    const-string v5, "jy0.t"

    .line 1116
    .line 1117
    const-string v6, "f"

    .line 1118
    .line 1119
    invoke-direct {v3, v5, v6}, Lr0/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    new-instance v5, Lr0/f;

    .line 1123
    .line 1124
    const-string v7, "az0.u"

    .line 1125
    .line 1126
    invoke-direct {v5, v7, v6}, Lr0/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1127
    .line 1128
    .line 1129
    new-instance v7, Lr0/f;

    .line 1130
    .line 1131
    const-string v8, "c01.u"

    .line 1132
    .line 1133
    invoke-direct {v7, v8, v6}, Lr0/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v0, v3, v5, v7}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, Lr0/f;

    .line 1141
    .line 1142
    if-eqz v0, :cond_2f

    .line 1143
    .line 1144
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v3

    .line 1148
    const-string v5, "anti revoke hook point from hardcoded"

    .line 1149
    .line 1150
    filled-new-array {v5, v3}, [Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v3

    .line 1154
    invoke-static {v3}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    move-object v9, v0

    .line 1158
    goto :goto_21

    .line 1159
    :cond_2f
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    const-string v3, "anti revoke hook point cache missing for unknown wechat"

    .line 1164
    .line 1165
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1170
    .line 1171
    .line 1172
    :goto_21
    if-nez v9, :cond_30

    .line 1173
    .line 1174
    const-string v0, "anti revoke unsupported wechat"

    .line 1175
    .line 1176
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v2

    .line 1180
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    return-void

    .line 1188
    :cond_30
    const-string v0, "anti revoke selected hook point"

    .line 1189
    .line 1190
    iget-object v3, v9, Lr0/f;->a:Ljava/lang/String;

    .line 1191
    .line 1192
    iget-object v5, v9, Lr0/f;->b:Ljava/lang/String;

    .line 1193
    .line 1194
    filled-new-array {v0, v3, v5}, [Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    iget-object v0, v9, Lr0/f;->a:Ljava/lang/String;

    .line 1202
    .line 1203
    const-string v3, "anti-revoke-"

    .line 1204
    .line 1205
    const-string v5, "#"

    .line 1206
    .line 1207
    invoke-static {v3, v0, v5}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    iget-object v3, v9, Lr0/f;->b:Ljava/lang/String;

    .line 1212
    .line 1213
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v5

    .line 1220
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1221
    .line 1222
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    if-eqz v0, :cond_31

    .line 1227
    .line 1228
    goto :goto_23

    .line 1229
    :cond_31
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    const-string v6, "getClassLoader(...)"

    .line 1234
    .line 1235
    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    const-string v6, "com.tencent.mm.modelbase.p0"

    .line 1239
    .line 1240
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 1241
    .line 1242
    invoke-interface {v7, v0, v6}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v12

    .line 1246
    if-nez v12, :cond_32

    .line 1247
    .line 1248
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    const-string v2, "anti revoke modelbase class missing"

    .line 1253
    .line 1254
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_23

    .line 1262
    :cond_32
    :try_start_6
    iget-object v0, v9, Lr0/f;->a:Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v6

    .line 1268
    const-class v10, Ljava/lang/String;

    .line 1269
    .line 1270
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1271
    .line 1272
    const-class v13, Ljava/lang/String;

    .line 1273
    .line 1274
    const-class v14, Ljava/lang/String;

    .line 1275
    .line 1276
    const-class v15, Ljava/lang/String;

    .line 1277
    .line 1278
    new-instance v7, Lr0/h;

    .line 1279
    .line 1280
    invoke-direct {v7, v1, v2, v4}, Lr0/h;-><init>(Lr0/i;Landroid/content/Context;I)V

    .line 1281
    .line 1282
    .line 1283
    move-object/from16 v16, v7

    .line 1284
    .line 1285
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v2

    .line 1289
    invoke-static {v0, v6, v3, v2}, Lc0/f;->c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1290
    .line 1291
    .line 1292
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1293
    .line 1294
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v0

    .line 1298
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1302
    goto :goto_22

    .line 1303
    :catchall_3
    move-exception v0

    .line 1304
    new-instance v2, LE0/d;

    .line 1305
    .line 1306
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 1307
    .line 1308
    .line 1309
    move-object v0, v2

    .line 1310
    :goto_22
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    if-eqz v0, :cond_33

    .line 1315
    .line 1316
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v2

    .line 1320
    const-string v3, "anti revoke hook fail"

    .line 1321
    .line 1322
    filled-new-array {v3, v2, v5, v0}, [Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1327
    .line 1328
    .line 1329
    :cond_33
    :goto_23
    return-void

    .line 1330
    :goto_24
    monitor-exit v3

    .line 1331
    throw v0
.end method
