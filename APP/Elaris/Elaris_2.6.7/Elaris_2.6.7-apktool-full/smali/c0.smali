.class public abstract Lc0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Lt0;

.field public static final c:Le0;

.field public static final d:Ld0;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile f:I

.field public static volatile g:Ljava/lang/String;

.field public static volatile h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.tencent.imcore.message.QQMessageFacade"

    .line 2
    .line 3
    const-string v1, "com.tencent.imcore.message.BaseQQMessageFacade"

    .line 4
    .line 5
    const-string v2, "com.tencent.mobileqq.msg.api.impl.MessageFacadeImpl"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lc0;->a:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lt0;

    .line 14
    .line 15
    invoke-direct {v0}, Lt0;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lc0;->b:Lt0;

    .line 19
    .line 20
    new-instance v0, Le0;

    .line 21
    .line 22
    invoke-direct {v0}, Le0;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lc0;->c:Le0;

    .line 26
    .line 27
    new-instance v0, Ld0;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lc0;->d:Ld0;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    sput v0, Lc0;->f:I

    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    sput-object v0, Lc0;->g:Ljava/lang/String;

    .line 47
    .line 48
    sput-object v0, Lc0;->h:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_10

    .line 5
    .line 6
    if-eqz p0, :cond_10

    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_10

    .line 13
    .line 14
    sget-object v2, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    goto/16 :goto_f

    .line 23
    .line 24
    :cond_0
    const-string v3, "chatType"

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    :goto_0
    if-eqz v6, :cond_1

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v6, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v7, v4

    .line 48
    :goto_1
    if-nez v7, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    goto :goto_3

    .line 56
    :catchall_1
    :goto_2
    move-object v3, v4

    .line 57
    :goto_3
    instance-of v6, v3, Ljava/lang/Number;

    .line 58
    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    check-cast v3, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    goto :goto_4

    .line 68
    :cond_3
    const/4 v3, -0x1

    .line 69
    :goto_4
    const-string v6, "peerUid"

    .line 70
    .line 71
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 75
    :goto_5
    if-eqz v7, :cond_4

    .line 76
    .line 77
    :try_start_4
    invoke-virtual {v7, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :catchall_2
    :try_start_5
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    goto :goto_5

    .line 90
    :cond_4
    move-object v8, v4

    .line 91
    :goto_6
    if-nez v8, :cond_5

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_5
    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 98
    goto :goto_8

    .line 99
    :catchall_3
    :goto_7
    move-object v0, v4

    .line 100
    :goto_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eq v3, v5, :cond_6

    .line 105
    .line 106
    const/4 v6, 0x2

    .line 107
    if-ne v3, v6, :cond_10

    .line 108
    .line 109
    :cond_6
    invoke-static {v0}, Lc0;->j(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_7

    .line 114
    .line 115
    goto/16 :goto_f

    .line 116
    .line 117
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v3, "|"

    .line 126
    .line 127
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v0, "#"

    .line 134
    .line 135
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_10

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    if-nez v8, :cond_9

    .line 161
    .line 162
    sget-object v8, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 163
    .line 164
    goto :goto_e

    .line 165
    :cond_9
    instance-of v9, v8, Ljava/lang/Number;

    .line 166
    .line 167
    if-eqz v9, :cond_a

    .line 168
    .line 169
    check-cast v8, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v8

    .line 175
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-static {v8}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    goto :goto_e

    .line 184
    :cond_a
    new-instance v9, Ljava/util/HashSet;

    .line 185
    .line 186
    const/4 v10, 0x4

    .line 187
    invoke-direct {v9, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 188
    .line 189
    .line 190
    const-string v15, "randomId"

    .line 191
    .line 192
    const-string v16, "msgRandomId"

    .line 193
    .line 194
    const-string v11, "msgSeq"

    .line 195
    .line 196
    const-string v12, "msgId"

    .line 197
    .line 198
    const-string v13, "msgUid"

    .line 199
    .line 200
    const-string v14, "msgRandom"

    .line 201
    .line 202
    filled-new-array/range {v11 .. v16}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    move v11, v1

    .line 207
    :goto_9
    const/4 v12, 0x6

    .line 208
    if-ge v11, v12, :cond_e

    .line 209
    .line 210
    aget-object v12, v10, v11

    .line 211
    .line 212
    :try_start_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 216
    :goto_a
    if-eqz v13, :cond_b

    .line 217
    .line 218
    :try_start_7
    invoke-virtual {v13, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    invoke-virtual {v14, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 223
    .line 224
    .line 225
    goto :goto_b

    .line 226
    :catchall_4
    :try_start_8
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    goto :goto_a

    .line 231
    :cond_b
    move-object v14, v4

    .line 232
    :goto_b
    if-nez v14, :cond_c

    .line 233
    .line 234
    goto :goto_c

    .line 235
    :cond_c
    invoke-virtual {v14, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 239
    goto :goto_d

    .line 240
    :catchall_5
    :goto_c
    move-object v12, v4

    .line 241
    :goto_d
    instance-of v13, v12, Ljava/lang/Number;

    .line 242
    .line 243
    if-eqz v13, :cond_d

    .line 244
    .line 245
    check-cast v12, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 248
    .line 249
    .line 250
    move-result-wide v12

    .line 251
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    invoke-virtual {v9, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_e
    move-object v8, v9

    .line 262
    :goto_e
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    if-eqz v9, :cond_8

    .line 271
    .line 272
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    check-cast v9, Ljava/lang/Long;

    .line 277
    .line 278
    new-instance v10, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    check-cast v9, Ljava/lang/Long;

    .line 298
    .line 299
    if-eqz v9, :cond_f

    .line 300
    .line 301
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 302
    .line 303
    .line 304
    move-result-wide v9

    .line 305
    sub-long v9, v6, v9

    .line 306
    .line 307
    const-wide/32 v11, 0x2bf20

    .line 308
    .line 309
    .line 310
    cmp-long v9, v9, v11

    .line 311
    .line 312
    if-gez v9, :cond_f

    .line 313
    .line 314
    return v5

    .line 315
    :cond_10
    :goto_f
    return v1
.end method

.method public static b(La0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v11

    .line 7
    iget v1, v0, La0;->a:I

    .line 8
    .line 9
    iget-object v2, v0, La0;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, v0, La0;->d:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x2

    .line 22
    if-ne v1, v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v4, 0x1

    .line 44
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    iget v2, v0, La0;->a:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, "|"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, La0;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "#"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-wide v2, v0, La0;->e:J

    .line 75
    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    cmp-long v2, v2, v5

    .line 79
    .line 80
    if-lez v2, :cond_1

    .line 81
    .line 82
    sget-object v2, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-wide v7, v0, La0;->e:J

    .line 93
    .line 94
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v2, v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_1
    iget-wide v2, v0, La0;->f:J

    .line 109
    .line 110
    cmp-long v2, v2, v5

    .line 111
    .line 112
    if-lez v2, :cond_2

    .line 113
    .line 114
    sget-object v2, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-wide v7, v0, La0;->f:J

    .line 125
    .line 126
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v2, v3, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    :cond_2
    iget-wide v2, v0, La0;->g:J

    .line 141
    .line 142
    cmp-long v2, v2, v5

    .line 143
    .line 144
    if-lez v2, :cond_3

    .line 145
    .line 146
    sget-object v2, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 147
    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    iget-wide v5, v0, La0;->g:J

    .line 157
    .line 158
    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_3
    sget-object v1, Lc0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/16 v3, 0x40

    .line 179
    .line 180
    if-ge v2, v3, :cond_4

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_6

    .line 196
    .line 197
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Ljava/util/Map$Entry;

    .line 202
    .line 203
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    check-cast v5, Ljava/lang/Long;

    .line 208
    .line 209
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 210
    .line 211
    .line 212
    move-result-wide v5

    .line 213
    sub-long v5, v11, v5

    .line 214
    .line 215
    const-wide/32 v7, 0x2bf20

    .line 216
    .line 217
    .line 218
    cmp-long v5, v5, v7

    .line 219
    .line 220
    if-lez v5, :cond_5

    .line 221
    .line 222
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_6
    :goto_2
    sget-object v1, Lc0;->b:Lt0;

    .line 231
    .line 232
    iget v2, v0, La0;->a:I

    .line 233
    .line 234
    iget-object v3, v0, La0;->b:Ljava/lang/String;

    .line 235
    .line 236
    move-wide v12, v11

    .line 237
    move v11, v4

    .line 238
    iget-wide v4, v0, La0;->e:J

    .line 239
    .line 240
    iget-wide v6, v0, La0;->f:J

    .line 241
    .line 242
    iget-wide v8, v0, La0;->g:J

    .line 243
    .line 244
    iget-object v10, v0, La0;->d:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual/range {v1 .. v13}, Lt0;->e(ILjava/lang/String;JJJLjava/lang/String;IJ)V

    .line 247
    .line 248
    .line 249
    move v4, v11

    .line 250
    move-wide v11, v12

    .line 251
    sget-object v13, Lc0;->c:Le0;

    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-nez v2, :cond_7

    .line 259
    .line 260
    :catchall_0
    move-object v14, v1

    .line 261
    goto :goto_3

    .line 262
    :cond_7
    new-instance v2, Ljava/io/File;

    .line 263
    .line 264
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    const-string v5, "elaris_anti_recall_status_v2"

    .line 273
    .line 274
    invoke-direct {v2, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    .line 276
    .line 277
    move-object v14, v2

    .line 278
    :goto_3
    iget v1, v0, La0;->a:I

    .line 279
    .line 280
    iget-object v2, v0, La0;->b:Ljava/lang/String;

    .line 281
    .line 282
    move v5, v4

    .line 283
    iget-wide v3, v0, La0;->e:J

    .line 284
    .line 285
    move v7, v5

    .line 286
    iget-wide v5, v0, La0;->f:J

    .line 287
    .line 288
    move v9, v7

    .line 289
    iget-wide v7, v0, La0;->g:J

    .line 290
    .line 291
    iget-object v0, v0, La0;->d:Ljava/lang/String;

    .line 292
    .line 293
    monitor-enter v13

    .line 294
    if-eqz v14, :cond_b

    .line 295
    .line 296
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-nez v10, :cond_8

    .line 301
    .line 302
    goto/16 :goto_4

    .line 303
    .line 304
    :cond_8
    invoke-static {v9}, Lu9;->x(I)I

    .line 305
    .line 306
    .line 307
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 308
    if-nez v10, :cond_9

    .line 309
    .line 310
    monitor-exit v13

    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :cond_9
    :try_start_2
    invoke-virtual {v13, v11, v12, v14}, Le0;->c(JLjava/io/File;)V

    .line 314
    .line 315
    .line 316
    move-object v9, v0

    .line 317
    iget-object v0, v13, Le0;->a:Lt0;

    .line 318
    .line 319
    invoke-virtual/range {v0 .. v12}, Lt0;->e(ILjava/lang/String;JJJLjava/lang/String;IJ)V

    .line 320
    .line 321
    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v15, "\t"

    .line 331
    .line 332
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v15, "\t"

    .line 339
    .line 340
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const/16 v15, 0x5f

    .line 344
    .line 345
    move/from16 p0, v1

    .line 346
    .line 347
    const/16 v1, 0x9

    .line 348
    .line 349
    move-wide/from16 v16, v11

    .line 350
    .line 351
    invoke-virtual {v2, v1, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    const/16 v12, 0xd

    .line 356
    .line 357
    invoke-virtual {v11, v12, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    const/16 v12, 0xa

    .line 362
    .line 363
    invoke-virtual {v11, v12, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v11, "\t"

    .line 371
    .line 372
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v11, "\t"

    .line 379
    .line 380
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v11, "\t"

    .line 387
    .line 388
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v11, "\t"

    .line 395
    .line 396
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9, v1, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    const/16 v11, 0xd

    .line 404
    .line 405
    invoke-virtual {v1, v11, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {v1, v12, v15}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v1, "\t"

    .line 417
    .line 418
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v1, "\n"

    .line 425
    .line 426
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 433
    :try_start_3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 434
    .line 435
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v14, v0}, Le0;->a(Ljava/io/File;[B)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_a

    .line 444
    .line 445
    iget-object v0, v13, Le0;->a:Lt0;

    .line 446
    .line 447
    iget-object v0, v0, Lt0;->c:Ljava/io/Serializable;

    .line 448
    .line 449
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 450
    .line 451
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 452
    .line 453
    .line 454
    iget-object v0, v13, Le0;->a:Lt0;

    .line 455
    .line 456
    move/from16 v1, p0

    .line 457
    .line 458
    move-wide/from16 v11, v16

    .line 459
    .line 460
    invoke-virtual/range {v0 .. v12}, Lt0;->e(ILjava/lang/String;JJJLjava/lang/String;IJ)V

    .line 461
    .line 462
    .line 463
    :cond_a
    invoke-virtual {v14}, Ljava/io/File;->lastModified()J

    .line 464
    .line 465
    .line 466
    move-result-wide v0

    .line 467
    iput-wide v0, v13, Le0;->b:J

    .line 468
    .line 469
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 470
    .line 471
    .line 472
    move-result-wide v0

    .line 473
    iput-wide v0, v13, Le0;->c:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 474
    .line 475
    :catchall_1
    monitor-exit v13

    .line 476
    goto :goto_5

    .line 477
    :catchall_2
    move-exception v0

    .line 478
    :try_start_4
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 479
    throw v0

    .line 480
    :cond_b
    :goto_4
    monitor-exit v13

    .line 481
    :goto_5
    :try_start_5
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    if-nez v0, :cond_c

    .line 486
    .line 487
    goto :goto_6

    .line 488
    :cond_c
    new-instance v1, Landroid/content/Intent;

    .line 489
    .line 490
    const-string v2, "com.mr.elaris.action.ANTI_RECALL_STATUS_CHANGED"

    .line 491
    .line 492
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 503
    .line 504
    .line 505
    :catchall_3
    :goto_6
    return-void
.end method

.method public static c(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lz;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lz;-><init>([B)V

    .line 9
    .line 10
    .line 11
    :catchall_0
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lz;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_3

    .line 16
    .line 17
    iget p1, v1, Lz;->d:I

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-ne p1, v2, :cond_2

    .line 22
    .line 23
    iget p1, v1, Lz;->e:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    if-ne p1, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Lz;->b()[B

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    :try_start_1
    new-instance v3, Lz;

    .line 33
    .line 34
    invoke-direct {v3, p1}, Lz;-><init>([B)V

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v3}, Lz;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget p1, v3, Lz;->d:I

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    if-ne p1, v4, :cond_1

    .line 47
    .line 48
    iget p1, v3, Lz;->e:I

    .line 49
    .line 50
    if-ne p1, v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3}, Lz;->b()[B

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p0, p1, v0}, Lc0;->r(Ljava/lang/ClassLoader;[BLjava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v3}, Lz;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :try_start_2
    invoke-virtual {v1}, Lz;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_1
    :cond_3
    return-object v0
.end method

.method public static d(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;
    .locals 20

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    :try_start_0
    new-instance v3, Lz;

    .line 9
    .line 10
    move-object/from16 v4, p1

    .line 11
    .line 12
    invoke-direct {v3, v4}, Lz;-><init>([B)V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {v3}, Lz;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    iget v4, v3, Lz;->d:I

    .line 22
    .line 23
    if-ne v4, v2, :cond_0

    .line 24
    .line 25
    iget v4, v3, Lz;->e:I

    .line 26
    .line 27
    if-ne v4, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3}, Lz;->b()[B

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {v3}, Lz;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    :cond_1
    const/4 v3, 0x0

    .line 39
    :goto_1
    if-nez v3, :cond_2

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_2
    invoke-static {v3}, Lc0;->q([B)Ly2;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, v3, Ly2;->a:Ljava/io/Serializable;

    .line 48
    .line 49
    check-cast v4, [B

    .line 50
    .line 51
    if-eqz v4, :cond_a

    .line 52
    .line 53
    iget v5, v3, Ly2;->b:I

    .line 54
    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_3
    const/16 v6, 0x210

    .line 60
    .line 61
    if-ne v5, v6, :cond_9

    .line 62
    .line 63
    iget v6, v3, Ly2;->c:I

    .line 64
    .line 65
    const/16 v7, 0x8a

    .line 66
    .line 67
    if-ne v6, v7, :cond_9

    .line 68
    .line 69
    new-instance v3, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    :try_start_1
    new-instance v5, Lz;

    .line 75
    .line 76
    invoke-direct {v5, v4}, Lz;-><init>([B)V

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-virtual {v5}, Lz;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_8

    .line 84
    .line 85
    iget v4, v5, Lz;->d:I

    .line 86
    .line 87
    if-ne v4, v2, :cond_7

    .line 88
    .line 89
    iget v4, v5, Lz;->e:I

    .line 90
    .line 91
    if-ne v4, v1, :cond_7

    .line 92
    .line 93
    invoke-virtual {v5}, Lz;->b()[B

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {v4}, Lc0;->m([B)Lw;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-wide v6, v4, Lw;->f:J

    .line 102
    .line 103
    const-wide/16 v8, 0x0

    .line 104
    .line 105
    cmp-long v6, v6, v8

    .line 106
    .line 107
    if-gtz v6, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-static/range {p0 .. p0}, Lc0;->g(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Lc0;->j(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_5

    .line 119
    .line 120
    iget-object v7, v4, Lw;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    iget-object v6, v4, Lw;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v6}, Lc0;->j(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-nez v6, :cond_6

    .line 136
    .line 137
    iget-object v6, v4, Lw;->a:Ljava/lang/String;

    .line 138
    .line 139
    :goto_3
    move-object v9, v6

    .line 140
    goto :goto_4

    .line 141
    :cond_6
    iget-object v6, v4, Lw;->b:Ljava/lang/String;

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :goto_4
    new-instance v7, La0;

    .line 145
    .line 146
    iget-object v10, v4, Lw;->a:Ljava/lang/String;

    .line 147
    .line 148
    iget-wide v12, v4, Lw;->f:J

    .line 149
    .line 150
    iget-wide v14, v4, Lw;->c:J

    .line 151
    .line 152
    iget-wide v1, v4, Lw;->e:J

    .line 153
    .line 154
    move-object/from16 p1, v7

    .line 155
    .line 156
    iget-wide v6, v4, Lw;->d:J

    .line 157
    .line 158
    const/4 v8, 0x1

    .line 159
    move-object v11, v10

    .line 160
    move-wide/from16 v16, v1

    .line 161
    .line 162
    move-wide/from16 v18, v6

    .line 163
    .line 164
    move-object/from16 v7, p1

    .line 165
    .line 166
    invoke-direct/range {v7 .. v19}, La0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJ)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    :goto_5
    const/4 v1, 0x2

    .line 173
    const/4 v2, 0x1

    .line 174
    goto :goto_2

    .line 175
    :cond_7
    invoke-virtual {v5}, Lz;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :catchall_1
    :cond_8
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_9
    const/16 v1, 0x2dc

    .line 184
    .line 185
    if-ne v5, v1, :cond_a

    .line 186
    .line 187
    iget v1, v3, Ly2;->c:I

    .line 188
    .line 189
    const/16 v2, 0x11

    .line 190
    .line 191
    if-ne v1, v2, :cond_a

    .line 192
    .line 193
    move-object/from16 v1, p0

    .line 194
    .line 195
    invoke-static {v1, v4}, Lc0;->o(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_6
    return-object v0
.end method

.method public static e([B)[B
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_b

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    array-length v2, p0

    .line 12
    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 13
    .line 14
    .line 15
    :goto_0
    array-length v2, p0

    .line 16
    if-ge v0, v2, :cond_9

    .line 17
    .line 18
    invoke-static {v0, p0}, Lc0;->s(I[B)Lb0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v3, v2, Lb0;->a:I

    .line 23
    .line 24
    if-le v3, v0, :cond_9

    .line 25
    .line 26
    array-length v4, p0

    .line 27
    if-le v3, v4, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    iget-wide v4, v2, Lb0;->b:J

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    ushr-long v6, v4, v2

    .line 34
    .line 35
    long-to-int v2, v6

    .line 36
    const-wide/16 v6, 0x7

    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    long-to-int v4, v4

    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-eq v4, v5, :cond_5

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-eq v4, v5, :cond_3

    .line 47
    .line 48
    const/4 v5, 0x5

    .line 49
    if-eq v4, v5, :cond_2

    .line 50
    .line 51
    array-length v3, p0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    array-length v4, p0

    .line 54
    add-int/lit8 v3, v3, 0x4

    .line 55
    .line 56
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {v3, p0}, Lc0;->s(I[B)Lb0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget v4, v3, Lb0;->a:I

    .line 66
    .line 67
    int-to-long v4, v4

    .line 68
    iget-wide v6, v3, Lb0;->b:J

    .line 69
    .line 70
    add-long/2addr v6, v4

    .line 71
    cmp-long v3, v6, v4

    .line 72
    .line 73
    if-gez v3, :cond_4

    .line 74
    .line 75
    array-length v3, p0

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    array-length v3, p0

    .line 78
    int-to-long v3, v3

    .line 79
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    long-to-int v3, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_5
    array-length v4, p0

    .line 86
    add-int/lit8 v3, v3, 0x8

    .line 87
    .line 88
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    goto :goto_1

    .line 93
    :cond_6
    invoke-static {v3, p0}, Lc0;->s(I[B)Lb0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget v3, v3, Lb0;->a:I

    .line 98
    .line 99
    :goto_1
    if-lt v3, v0, :cond_9

    .line 100
    .line 101
    array-length v4, p0

    .line 102
    if-le v3, v4, :cond_7

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    const/16 v4, 0x8

    .line 106
    .line 107
    if-eq v2, v4, :cond_8

    .line 108
    .line 109
    sub-int v2, v3, v0

    .line 110
    .line 111
    invoke-virtual {v1, p0, v0, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 112
    .line 113
    .line 114
    :cond_8
    move v0, v3

    .line 115
    goto :goto_0

    .line 116
    :cond_9
    :goto_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    array-length v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    if-nez v1, :cond_a

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_a
    return-object v0

    .line 125
    :catchall_0
    :goto_3
    return-object p0

    .line 126
    :cond_b
    :goto_4
    new-array p0, v0, [B

    .line 127
    .line 128
    return-object p0
.end method

.method public static f(Ljava/lang/Class;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    const-string p0, ""

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    const-string v0, "target.anti_recall.legacy_facade_classes"

    .line 19
    .line 20
    invoke-static {v0}, Lt2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    invoke-static {v0, p0}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const-string v2, "\\|"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_1
    array-length v4, v2

    .line 42
    if-ge v3, v4, :cond_4

    .line 43
    .line 44
    aget-object v4, v2, v3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    :goto_2
    return-void

    .line 53
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, "|"

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v0, p0}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static g(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "mqq.app.MobileQQ"

    .line 3
    .line 4
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "sMobileQQ"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->getStaticObjectField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    :catchall_0
    :goto_0
    move-object v1, v0

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    const-string v3, "mAppRuntime"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    :goto_1
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :catchall_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v4, v0

    .line 37
    :goto_2
    if-nez v4, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :goto_3
    if-nez v1, :cond_3

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_3
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "getAccount"

    .line 52
    .line 53
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lc0;->j(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    sget-object v1, Lc0;->g:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    sget-object v1, Lc0;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v1}, Lc0;->j(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    sget-object p0, Lc0;->h:Ljava/lang/String;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_5
    invoke-static {p0, v0}, Lc0;->t(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lc0;->j(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_6

    .line 100
    .line 101
    sput-object v0, Lc0;->g:Ljava/lang/String;

    .line 102
    .line 103
    sput-object p0, Lc0;->h:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 104
    .line 105
    :cond_6
    return-object p0

    .line 106
    :catchall_2
    :goto_4
    const-string p0, ""

    .line 107
    .line 108
    return-object p0
.end method

.method public static declared-synchronized h(Ljava/lang/ClassLoader;Z)V
    .locals 2

    .line 1
    const-class v0, Lc0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    invoke-static {v1, p0}, Lc0;->i(ILjava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v1, p0}, Lc0;->i(ILjava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-static {v1, p0}, Lc0;->i(ILjava/lang/ClassLoader;)V

    .line 14
    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Lr0;->j(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method

.method public static i(ILjava/lang/ClassLoader;)V
    .locals 19

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Lc0;->d:Ld0;

    .line 8
    .line 9
    if-ne v0, v3, :cond_0

    .line 10
    .line 11
    iget-boolean v5, v4, Ld0;->a:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    iget-boolean v5, v4, Ld0;->b:Z

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-boolean v5, v4, Ld0;->c:Z

    .line 20
    .line 21
    :goto_0
    if-eqz v5, :cond_2

    .line 22
    .line 23
    goto/16 :goto_d

    .line 24
    .line 25
    :cond_2
    const/4 v5, 0x0

    .line 26
    if-ne v0, v3, :cond_8

    .line 27
    .line 28
    const-string v6, "target.anti_recall.session_class"

    .line 29
    .line 30
    :try_start_0
    const-string v7, "com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession$CppProxy"

    .line 31
    .line 32
    invoke-static {v1, v6, v7}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    if-nez v7, :cond_3

    .line 37
    .line 38
    const-string v6, "com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession"

    .line 39
    .line 40
    invoke-static {v6, v1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {v6, v8}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    array-length v7, v6

    .line 57
    move v8, v5

    .line 58
    move v9, v8

    .line 59
    :goto_2
    if-ge v8, v7, :cond_6

    .line 60
    .line 61
    aget-object v10, v6, v8

    .line 62
    .line 63
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    const-string v12, "onMsfPush"

    .line 68
    .line 69
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-eqz v12, :cond_5

    .line 78
    .line 79
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-nez v12, :cond_5

    .line 88
    .line 89
    array-length v12, v11

    .line 90
    if-lt v12, v2, :cond_5

    .line 91
    .line 92
    aget-object v12, v11, v5

    .line 93
    .line 94
    const-class v13, Ljava/lang/String;

    .line 95
    .line 96
    if-ne v12, v13, :cond_5

    .line 97
    .line 98
    aget-object v11, v11, v3

    .line 99
    .line 100
    const-class v12, [B

    .line 101
    .line 102
    if-eq v11, v12, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    new-instance v11, Lt;

    .line 106
    .line 107
    invoke-direct {v11, v1}, Lt;-><init>(Ljava/lang/ClassLoader;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v10, v11}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 111
    .line 112
    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    new-instance v11, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v12, "hooked anti-recall NT push: "

    .line 121
    .line 122
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-static {v10}, Lc0;->l(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-static {v10}, Lc0;->k(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    if-nez v9, :cond_7

    .line 143
    .line 144
    const-string v1, "anti-recall NT push target not found"

    .line 145
    .line 146
    invoke-static {v1}, Lc0;->k(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    .line 149
    :cond_7
    if-lez v9, :cond_17

    .line 150
    .line 151
    move v1, v3

    .line 152
    goto/16 :goto_c

    .line 153
    .line 154
    :catchall_0
    move-exception v0

    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v2, "hookNtRecallPush failed: "

    .line 158
    .line 159
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Lc0;->k(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_d

    .line 173
    .line 174
    :cond_8
    const-class v6, Ljava/util/ArrayList;

    .line 175
    .line 176
    if-ne v0, v2, :cond_f

    .line 177
    .line 178
    const-string v7, "target.anti_recall.legacy_facade_classes"

    .line 179
    .line 180
    sget-object v8, Lc0;->a:[Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v7, v8, v1}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    array-length v8, v7

    .line 187
    move v9, v5

    .line 188
    move v10, v9

    .line 189
    :goto_4
    if-ge v9, v8, :cond_d

    .line 190
    .line 191
    aget-object v11, v7, v9

    .line 192
    .line 193
    :try_start_1
    invoke-static {v11, v1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-static {v12}, Lc0;->f(Ljava/lang/Class;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    array-length v13, v12

    .line 205
    move v14, v5

    .line 206
    :goto_5
    if-ge v14, v13, :cond_c

    .line 207
    .line 208
    aget-object v15, v12, v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 209
    .line 210
    move/from16 v16, v5

    .line 211
    .line 212
    :try_start_2
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    move/from16 v17, v3

    .line 217
    .line 218
    :try_start_3
    const-string v3, "handleRevokedNotifyAndNotify"

    .line 219
    .line 220
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    move/from16 v18, v2

    .line 233
    .line 234
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 235
    .line 236
    if-ne v3, v2, :cond_9

    .line 237
    .line 238
    array-length v2, v5

    .line 239
    const/4 v3, 0x2

    .line 240
    if-ne v2, v3, :cond_9

    .line 241
    .line 242
    aget-object v2, v5, v16

    .line 243
    .line 244
    if-ne v2, v6, :cond_9

    .line 245
    .line 246
    aget-object v2, v5, v17

    .line 247
    .line 248
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 249
    .line 250
    if-ne v2, v3, :cond_9

    .line 251
    .line 252
    move/from16 v2, v17

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_9
    move/from16 v2, v16

    .line 256
    .line 257
    :goto_6
    const-string v3, "MessageFacadeImpl"

    .line 258
    .line 259
    invoke-virtual {v11, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_a

    .line 264
    .line 265
    if-nez v18, :cond_b

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_a
    if-nez v18, :cond_b

    .line 269
    .line 270
    if-nez v2, :cond_b

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_b
    new-instance v2, Lu;

    .line 274
    .line 275
    const/16 v3, 0x5a

    .line 276
    .line 277
    invoke-direct {v2, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v15, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 281
    .line 282
    .line 283
    add-int/lit8 v10, v10, 0x1

    .line 284
    .line 285
    new-instance v2, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string v3, "hooked legacy recall facade: "

    .line 291
    .line 292
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-static {v15}, Lc0;->l(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-static {v2}, Lc0;->k(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 307
    .line 308
    .line 309
    :goto_7
    add-int/lit8 v14, v14, 0x1

    .line 310
    .line 311
    move/from16 v5, v16

    .line 312
    .line 313
    move/from16 v3, v17

    .line 314
    .line 315
    const/4 v2, 0x2

    .line 316
    goto :goto_5

    .line 317
    :catchall_1
    move/from16 v17, v3

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :catchall_2
    :cond_c
    move/from16 v17, v3

    .line 321
    .line 322
    move/from16 v16, v5

    .line 323
    .line 324
    :catchall_3
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 325
    .line 326
    move/from16 v5, v16

    .line 327
    .line 328
    move/from16 v3, v17

    .line 329
    .line 330
    const/4 v2, 0x2

    .line 331
    goto/16 :goto_4

    .line 332
    .line 333
    :cond_d
    move/from16 v17, v3

    .line 334
    .line 335
    if-nez v10, :cond_e

    .line 336
    .line 337
    const-string v1, "legacy recall facade target not found"

    .line 338
    .line 339
    invoke-static {v1}, Lc0;->k(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    :cond_e
    if-lez v10, :cond_17

    .line 343
    .line 344
    :goto_9
    move/from16 v1, v17

    .line 345
    .line 346
    goto/16 :goto_c

    .line 347
    .line 348
    :cond_f
    move/from16 v17, v3

    .line 349
    .line 350
    move/from16 v16, v5

    .line 351
    .line 352
    const-string v2, "target.anti_recall.delete_service_class"

    .line 353
    .line 354
    :try_start_4
    const-string v3, "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy"

    .line 355
    .line 356
    invoke-static {v1, v2, v3}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-nez v1, :cond_10

    .line 361
    .line 362
    goto/16 :goto_d

    .line 363
    .line 364
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-static {v2, v3}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    array-length v2, v1

    .line 376
    move/from16 v5, v16

    .line 377
    .line 378
    :goto_a
    if-ge v5, v2, :cond_13

    .line 379
    .line 380
    aget-object v3, v1, v5

    .line 381
    .line 382
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    const-string v8, "deleteMsg"

    .line 387
    .line 388
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-eqz v8, :cond_12

    .line 397
    .line 398
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-nez v8, :cond_12

    .line 407
    .line 408
    array-length v8, v7

    .line 409
    const/4 v9, 0x2

    .line 410
    if-lt v8, v9, :cond_12

    .line 411
    .line 412
    aget-object v7, v7, v17

    .line 413
    .line 414
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    if-nez v7, :cond_11

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_11
    new-instance v7, Lv;

    .line 422
    .line 423
    const/16 v8, 0x50

    .line 424
    .line 425
    invoke-direct {v7, v8}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 426
    .line 427
    .line 428
    invoke-static {v3, v7}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 429
    .line 430
    .line 431
    add-int/lit8 v16, v16, 0x1

    .line 432
    .line 433
    new-instance v7, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    const-string v8, "hooked anti-recall delete fallback: "

    .line 439
    .line 440
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-static {v3}, Lc0;->l(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-static {v3}, Lc0;->k(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    :cond_12
    :goto_b
    add-int/lit8 v5, v5, 0x1

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_13
    if-nez v16, :cond_14

    .line 461
    .line 462
    const-string v1, "deleteMsg fallback target not found"

    .line 463
    .line 464
    invoke-static {v1}, Lc0;->k(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 465
    .line 466
    .line 467
    :cond_14
    if-lez v16, :cond_17

    .line 468
    .line 469
    goto :goto_9

    .line 470
    :goto_c
    if-ne v0, v1, :cond_15

    .line 471
    .line 472
    iput-boolean v1, v4, Ld0;->a:Z

    .line 473
    .line 474
    goto :goto_d

    .line 475
    :cond_15
    const/4 v3, 0x2

    .line 476
    if-ne v0, v3, :cond_16

    .line 477
    .line 478
    iput-boolean v1, v4, Ld0;->b:Z

    .line 479
    .line 480
    goto :goto_d

    .line 481
    :cond_16
    iput-boolean v1, v4, Ld0;->c:Z

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :catchall_4
    move-exception v0

    .line 485
    new-instance v1, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v2, "hookKernelDeleteFallback failed: "

    .line 488
    .line 489
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0}, Lc0;->k(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :cond_17
    :goto_d
    return-void
.end method

.method public static j(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "null"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static k(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->shouldLogMessage(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Elaris: "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static l(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "."

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static m([B)Lw;
    .locals 4

    .line 1
    new-instance v0, Lw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iput-object v1, v0, Lw;->a:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v1, v0, Lw;->b:Ljava/lang/String;

    .line 11
    .line 12
    :try_start_0
    new-instance v1, Lz;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lz;-><init>([B)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v1}, Lz;->a()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_8

    .line 22
    .line 23
    iget p0, v1, Lz;->d:I

    .line 24
    .line 25
    const/16 v2, 0x14

    .line 26
    .line 27
    if-eq p0, v2, :cond_6

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    packed-switch p0, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lz;->e()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_0
    iget p0, v1, Lz;->e:I

    .line 38
    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Lz;->c()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    iput-wide v2, v0, Lw;->e:J

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v1}, Lz;->e()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_1
    iget p0, v1, Lz;->e:I

    .line 53
    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1}, Lz;->c()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    iput-wide v2, v0, Lw;->d:J

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v1}, Lz;->e()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    iget p0, v1, Lz;->e:I

    .line 68
    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1}, Lz;->c()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    iput-wide v2, v0, Lw;->c:J

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v1}, Lz;->e()V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_3
    iget p0, v1, Lz;->e:I

    .line 83
    .line 84
    if-nez p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1}, Lz;->c()J

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    invoke-virtual {v1}, Lz;->e()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_4
    iget p0, v1, Lz;->e:I

    .line 95
    .line 96
    if-ne p0, v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v1}, Lz;->d()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iput-object p0, v0, Lw;->b:Ljava/lang/String;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    invoke-virtual {v1}, Lz;->e()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :pswitch_5
    iget p0, v1, Lz;->e:I

    .line 110
    .line 111
    if-ne p0, v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {v1}, Lz;->d()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iput-object p0, v0, Lw;->a:Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    invoke-virtual {v1}, Lz;->e()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    iget p0, v1, Lz;->e:I

    .line 125
    .line 126
    if-nez p0, :cond_7

    .line 127
    .line 128
    invoke-virtual {v1}, Lz;->c()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    iput-wide v2, v0, Lw;->f:J

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    invoke-virtual {v1}, Lz;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :catchall_0
    :cond_8
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static n([B)Lx;
    .locals 4

    .line 1
    new-instance v0, Lx;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iput-object v1, v0, Lx;->d:Ljava/lang/String;

    .line 9
    .line 10
    :try_start_0
    new-instance v1, Lz;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lz;-><init>([B)V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, Lz;->a()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_8

    .line 20
    .line 21
    iget p0, v1, Lz;->d:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq p0, v2, :cond_6

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq p0, v2, :cond_4

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-eq p0, v3, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    if-eq p0, v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Lz;->e()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget p0, v1, Lz;->e:I

    .line 40
    .line 41
    if-ne p0, v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Lz;->d()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-object p0, v0, Lx;->d:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1}, Lz;->e()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget p0, v1, Lz;->e:I

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, Lz;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    iput-wide v2, v0, Lx;->c:J

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v1}, Lz;->e()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    iget p0, v1, Lz;->e:I

    .line 70
    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    invoke-virtual {v1}, Lz;->c()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iput-wide v2, v0, Lx;->b:J

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    invoke-virtual {v1}, Lz;->e()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_6
    iget p0, v1, Lz;->e:I

    .line 85
    .line 86
    if-nez p0, :cond_7

    .line 87
    .line 88
    invoke-virtual {v1}, Lz;->c()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    iput-wide v2, v0, Lx;->a:J

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_7
    invoke-virtual {v1}, Lz;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    :cond_8
    return-object v0
.end method

.method public static o(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    const/4 v3, 0x7

    .line 12
    if-gt v2, v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    array-length v2, v0

    .line 17
    invoke-static {v0, v3, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    new-instance v2, Lz;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Lz;-><init>([B)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    move-wide v5, v3

    .line 30
    move-wide v7, v5

    .line 31
    :goto_0
    invoke-virtual {v2}, Lz;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    const/4 v10, 0x1

    .line 36
    if-eqz v9, :cond_4

    .line 37
    .line 38
    iget v9, v2, Lz;->d:I

    .line 39
    .line 40
    if-ne v9, v10, :cond_1

    .line 41
    .line 42
    iget v10, v2, Lz;->e:I

    .line 43
    .line 44
    if-nez v10, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, Lz;->c()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v10, 0x4

    .line 52
    if-ne v9, v10, :cond_2

    .line 53
    .line 54
    iget v10, v2, Lz;->e:I

    .line 55
    .line 56
    if-nez v10, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, Lz;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/16 v10, 0xb

    .line 64
    .line 65
    if-ne v9, v10, :cond_3

    .line 66
    .line 67
    iget v9, v2, Lz;->e:I

    .line 68
    .line 69
    const/4 v10, 0x2

    .line 70
    if-ne v9, v10, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2}, Lz;->b()[B

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-virtual {v2}, Lz;->e()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    const-wide/16 v11, 0x7

    .line 82
    .line 83
    cmp-long v2, v5, v11

    .line 84
    .line 85
    if-nez v2, :cond_9

    .line 86
    .line 87
    cmp-long v2, v7, v3

    .line 88
    .line 89
    if-lez v2, :cond_9

    .line 90
    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    invoke-static {v0}, Lc0;->p([B)Ly;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v2, v0, Ly;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2}, Lc0;->j(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_6

    .line 107
    .line 108
    invoke-static/range {p0 .. p0}, Lc0;->g(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    const/4 v10, 0x0

    .line 120
    :goto_1
    if-eqz v10, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    iget-object v2, v0, Ly;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_9

    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lx;

    .line 146
    .line 147
    iget-wide v6, v5, Lx;->a:J

    .line 148
    .line 149
    cmp-long v8, v6, v3

    .line 150
    .line 151
    if-gtz v8, :cond_8

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_8
    new-instance v11, La0;

    .line 155
    .line 156
    iget-object v8, v0, Ly;->b:Ljava/lang/Object;

    .line 157
    .line 158
    move-object v14, v8

    .line 159
    check-cast v14, Ljava/lang/String;

    .line 160
    .line 161
    iget-object v15, v5, Lx;->d:Ljava/lang/String;

    .line 162
    .line 163
    iget-wide v8, v5, Lx;->c:J

    .line 164
    .line 165
    iget-wide v3, v5, Lx;->b:J

    .line 166
    .line 167
    const/4 v12, 0x2

    .line 168
    const-wide/16 v18, 0x0

    .line 169
    .line 170
    move-wide/from16 v22, v3

    .line 171
    .line 172
    move-wide/from16 v16, v6

    .line 173
    .line 174
    move-wide/from16 v20, v8

    .line 175
    .line 176
    invoke-direct/range {v11 .. v23}, La0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJ)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    const-wide/16 v3, 0x0

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_0
    :cond_9
    :goto_3
    return-object v1
.end method

.method public static p([B)Ly;
    .locals 4

    .line 1
    new-instance v0, Ly;

    .line 2
    .line 3
    invoke-direct {v0}, Ly;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lz;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lz;-><init>([B)V

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1}, Lz;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    iget p0, v1, Lz;->d:I

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x2

    .line 21
    if-ne p0, v2, :cond_0

    .line 22
    .line 23
    iget v2, v1, Lz;->e:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Lz;->d()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iput-object p0, v0, Ly;->b:Ljava/lang/Object;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x3

    .line 35
    if-ne p0, v2, :cond_1

    .line 36
    .line 37
    iget p0, v1, Lz;->e:I

    .line 38
    .line 39
    if-ne p0, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Ly;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1}, Lz;->b()[B

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Lc0;->n([B)Lx;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v1}, Lz;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    :cond_2
    return-object v0
.end method

.method public static q([B)Ly2;
    .locals 6

    .line 1
    new-instance v0, Ly2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lz;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lz;-><init>([B)V

    .line 9
    .line 10
    .line 11
    :catchall_0
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lz;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_7

    .line 16
    .line 17
    iget p0, v1, Lz;->d:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne p0, v2, :cond_3

    .line 21
    .line 22
    iget v3, v1, Lz;->e:I

    .line 23
    .line 24
    if-ne v3, v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v1}, Lz;->b()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 30
    :try_start_1
    new-instance v3, Lz;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Lz;-><init>([B)V

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {v3}, Lz;->a()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    iget p0, v3, Lz;->d:I

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    if-ne p0, v4, :cond_1

    .line 45
    .line 46
    iget v4, v3, Lz;->e:I

    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3}, Lz;->c()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    long-to-int p0, v4

    .line 55
    iput p0, v0, Ly2;->b:I

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    if-ne p0, v2, :cond_2

    .line 59
    .line 60
    iget p0, v3, Lz;->e:I

    .line 61
    .line 62
    if-nez p0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v3}, Lz;->c()J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    long-to-int p0, v4

    .line 69
    iput p0, v0, Ly2;->c:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v3}, Lz;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 v3, 0x3

    .line 77
    if-ne p0, v3, :cond_6

    .line 78
    .line 79
    :try_start_2
    iget p0, v1, Lz;->e:I

    .line 80
    .line 81
    if-ne p0, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1}, Lz;->b()[B

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    :try_start_3
    new-instance v3, Lz;

    .line 88
    .line 89
    invoke-direct {v3, p0}, Lz;-><init>([B)V

    .line 90
    .line 91
    .line 92
    :goto_2
    invoke-virtual {v3}, Lz;->a()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    iget p0, v3, Lz;->d:I

    .line 99
    .line 100
    if-ne p0, v2, :cond_4

    .line 101
    .line 102
    iget p0, v3, Lz;->e:I

    .line 103
    .line 104
    if-ne p0, v2, :cond_4

    .line 105
    .line 106
    invoke-virtual {v3}, Lz;->b()[B

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-virtual {v3}, Lz;->e()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_1
    :cond_5
    const/4 p0, 0x0

    .line 116
    :goto_3
    :try_start_4
    iput-object p0, v0, Ly2;->a:Ljava/io/Serializable;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    invoke-virtual {v1}, Lz;->e()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_2
    :cond_7
    return-object v0
.end method

.method public static r(Ljava/lang/ClassLoader;[BLjava/util/ArrayList;)V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Lz;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0}, Lz;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    iget v3, v0, Lz;->d:I

    .line 21
    .line 22
    if-ne v3, v2, :cond_0

    .line 23
    .line 24
    iget v4, v0, Lz;->e:I

    .line 25
    .line 26
    if-ne v4, v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lz;->d()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v4, 0x8

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    iget v3, v0, Lz;->e:I

    .line 38
    .line 39
    if-ne v3, v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lz;->b()[B

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0}, Lz;->e()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {p1}, Lc0;->j(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    const/4 v0, 0x0

    .line 61
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v0, v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, [B

    .line 96
    .line 97
    invoke-static {v0}, Lc0;->q([B)Ly2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v1, v0, Ly2;->b:I

    .line 102
    .line 103
    const/16 v2, 0x2dc

    .line 104
    .line 105
    if-ne v1, v2, :cond_6

    .line 106
    .line 107
    iget v1, v0, Ly2;->c:I

    .line 108
    .line 109
    const/16 v2, 0x11

    .line 110
    .line 111
    if-ne v1, v2, :cond_6

    .line 112
    .line 113
    iget-object v0, v0, Ly2;->a:Ljava/io/Serializable;

    .line 114
    .line 115
    check-cast v0, [B

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    invoke-static {p0, v0}, Lc0;->o(Ljava/lang/ClassLoader;[B)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    :cond_7
    :goto_3
    return-void
.end method

.method public static s(I[B)Lb0;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x40

    .line 5
    .line 6
    if-ge v2, v3, :cond_1

    .line 7
    .line 8
    array-length v3, p1

    .line 9
    if-ge p0, v3, :cond_1

    .line 10
    .line 11
    add-int/lit8 v3, p0, 0x1

    .line 12
    .line 13
    aget-byte p0, p1, p0

    .line 14
    .line 15
    and-int/lit8 v4, p0, 0x7f

    .line 16
    .line 17
    int-to-long v4, v4

    .line 18
    shl-long/2addr v4, v2

    .line 19
    or-long/2addr v0, v4

    .line 20
    and-int/lit16 p0, p0, 0x80

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    new-instance p0, Lb0;

    .line 25
    .line 26
    invoke-direct {p0, v0, v1, v3}, Lb0;-><init>(JI)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 31
    .line 32
    move p0, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p0, Lb0;

    .line 35
    .line 36
    array-length p1, p1

    .line 37
    invoke-direct {p0, v0, v1, p1}, Lb0;-><init>(JI)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public static t(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.tencent.mobileqq.qroute.QRoute"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 8
    .line 9
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "api"

    .line 14
    .line 15
    const-class v2, Ljava/lang/Class;

    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "getUidFromUin"

    .line 39
    .line 40
    const-class v2, Ljava/lang/String;

    .line 41
    .line 42
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    return-object p0

    .line 66
    :catchall_0
    :goto_0
    const-string p0, ""

    .line 67
    .line 68
    return-object p0
.end method
